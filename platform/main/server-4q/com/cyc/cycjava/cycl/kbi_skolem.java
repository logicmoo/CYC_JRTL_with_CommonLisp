/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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
 *  module:      KBI-SKOLEM
 *  source file: /cyc/top/cycl/kbi-skolem.lisp
 *  created:     2019/07/03 17:39:06
 */
public final class kbi_skolem extends SubLTranslatedFile implements V02 {
    // // Constructor
    private kbi_skolem() {
    }

    public static final SubLFile me = new kbi_skolem();


    // // Definitions
    public static final SubLObject diagnose_qua_skolem(SubLObject skolem) {
        return kbi_utilities.diagnose_qua_sub_domains(skolem, $SKOLEM);
    }









    /**
     * test SKOLEM fort for no significant assertions
     */
    public static final SubLObject baren_skolem_fnP(SubLObject skolem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($BAREN_SKOLEM_FN)) && (NIL != kbi_utilities.kbi_applies_toP($BAREN_SKOLEM_FN, skolem))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($BAREN_SKOLEM_FN);
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
                                                        kbi_baren_skolem_fnP(skolem);
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
                    kbi_utilities.kbi_increment_time($BAREN_SKOLEM_FN, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :BAREN-SKOLEM-FN applies to SKOLEM
     */
    public static final SubLObject why_baren_skolem_fnP(SubLObject skolem, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($BAREN_SKOLEM_FN, skolem)) {
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
                                                    kbi_baren_skolem_fnP(skolem);
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
                                return list($BAREN_SKOLEM_FN, skolem, data);
                            } else {
                                return list($BAREN_SKOLEM_FN, skolem);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_baren_skolem_fnP(skolem, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_baren_skolem_fnP(SubLObject skolem, SubLObject data) {
        return format(NIL, $str_alt16$_s_is_referenced_by_no_significan, skolem);
    }

    public static final SubLObject kbi_baren_skolem_fnP(SubLObject skolem) {
        {
            SubLObject significantP = NIL;
            if (NIL == significantP) {
                {
                    SubLObject csome_list_var = kb_accessors.all_term_assertions(skolem, UNPROVIDED);
                    SubLObject assertion = NIL;
                    for (assertion = csome_list_var.first(); !((NIL != significantP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , assertion = csome_list_var.first()) {
                        significantP = makeBoolean((NIL != kbi_fort.significant_assertionP(assertion)) && (NIL != skolems.skolem_defn_assertionP(skolem, assertion, UNPROVIDED)));
                    }
                }
            }
            if (NIL == significantP) {
                kbi_utilities.set_kbi_result(skolem);
            }
        }
        return kbi_utilities.kbi_result();
    }

    public static final SubLObject baren_skolem_cache_fn(SubLObject skolem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_vars.$kbi_repairing_findingsP$.getDynamicValue(thread)) {
                constants_high.installed_constant_p(skolem);
            } else {
                return skolem;
            }
            return NIL;
        }
    }

    // defparameter
    public static final SubLSymbol $skolem_wXo_defn_results$ = makeSymbol("*SKOLEM-W/O-DEFN-RESULTS*");

    // defparameter
    public static final SubLSymbol $skolem_wXo_defn_time$ = makeSymbol("*SKOLEM-W/O-DEFN-TIME*");

    // defparameter
    public static final SubLSymbol $skolem_wXo_defn_count$ = makeSymbol("*SKOLEM-W/O-DEFN-COUNT*");

    /**
     * test SKOLEM fort for no cached definition
     */
    public static final SubLObject skolem_wXo_defnP(SubLObject skolem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw23$SKOLEM_W_O_DEFN)) && (NIL != kbi_utilities.kbi_applies_toP($kw23$SKOLEM_W_O_DEFN, skolem))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw23$SKOLEM_W_O_DEFN);
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
                                                        kbi_skolem_wXo_defnP(skolem);
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
                    kbi_utilities.kbi_increment_time($kw23$SKOLEM_W_O_DEFN, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :SKOLEM-W/O-DEFN applies to SKOLEM
     */
    public static final SubLObject why_skolem_wXo_defnP(SubLObject skolem, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw23$SKOLEM_W_O_DEFN, skolem)) {
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
                                                    kbi_skolem_wXo_defnP(skolem);
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
                                return list($kw23$SKOLEM_W_O_DEFN, skolem, data);
                            } else {
                                return list($kw23$SKOLEM_W_O_DEFN, skolem);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_skolem_wXo_defnP(skolem, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_skolem_wXo_defnP(SubLObject skolem, SubLObject data) {
        return format(NIL, $str_alt25$_s_has_no_skolem_defn, skolem);
    }

    public static final SubLObject kbi_skolem_wXo_defnP(SubLObject skolem) {
        if (NIL == skolems.skolem_defn(skolem)) {
            kbi_utilities.set_kbi_result(skolem);
        }
        return kbi_utilities.kbi_result();
    }

    // defparameter
    public static final SubLSymbol $skolem_wXo_common_neg_lits_results$ = makeSymbol("*SKOLEM-W/O-COMMON-NEG-LITS-RESULTS*");

    // defparameter
    public static final SubLSymbol $skolem_wXo_common_neg_lits_time$ = makeSymbol("*SKOLEM-W/O-COMMON-NEG-LITS-TIME*");

    // defparameter
    public static final SubLSymbol $skolem_wXo_common_neg_lits_count$ = makeSymbol("*SKOLEM-W/O-COMMON-NEG-LITS-COUNT*");

    /**
     * test SKOLEM fort for divergent defn neg-lits
     */
    public static final SubLObject skolem_wXo_common_neg_litsP(SubLObject skolem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw32$SKOLEM_W_O_COMMON_NEG_LITS)) && (NIL != kbi_utilities.kbi_applies_toP($kw32$SKOLEM_W_O_COMMON_NEG_LITS, skolem))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw32$SKOLEM_W_O_COMMON_NEG_LITS);
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
                                                        kbi_skolem_defn_diverging_neg_lits(skolem);
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
                    kbi_utilities.kbi_increment_time($kw32$SKOLEM_W_O_COMMON_NEG_LITS, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :SKOLEM-W/O-COMMON-NEG-LITS applies to SKOLEM
     */
    public static final SubLObject why_skolem_wXo_common_neg_litsP(SubLObject skolem, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw32$SKOLEM_W_O_COMMON_NEG_LITS, skolem)) {
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
                                                    kbi_skolem_defn_diverging_neg_lits(skolem);
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
                                return list($kw32$SKOLEM_W_O_COMMON_NEG_LITS, skolem, data);
                            } else {
                                return list($kw32$SKOLEM_W_O_COMMON_NEG_LITS, skolem);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_skolem_wXo_common_neg_litsP(skolem, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_skolem_wXo_common_neg_litsP(SubLObject skolem, SubLObject data) {
        return format(NIL, $str_alt34$_s_has_multiple_neg_lits___a, skolem, string_utilities.stringify_items(data, symbol_function(STR), $str_alt36$__, $str_alt37$__and_));
    }

    public static final SubLObject kbi_skolem_defn_diverging_neg_lits(SubLObject skolem) {
        {
            SubLObject skolem_neg_lits = NIL;
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = skolems.skolem_defn_assertions(skolem, UNPROVIDED);
                    SubLObject assertion = NIL;
                    for (assertion = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , assertion = csome_list_var.first()) {
                        {
                            SubLObject cnf = fi.assertion_cnf_with_el_vars(assertion);
                            SubLObject cnf_neg_lits = clauses.neg_lits(cnf);
                            SubLObject duplicateP = NIL;
                            if (NIL == duplicateP) {
                                {
                                    SubLObject csome_list_var_13 = skolem_neg_lits;
                                    SubLObject neg_lits = NIL;
                                    for (neg_lits = csome_list_var_13.first(); !((NIL != duplicateP) || (NIL == csome_list_var_13)); csome_list_var_13 = csome_list_var_13.rest() , neg_lits = csome_list_var_13.first()) {
                                        duplicateP = list_utilities.sets_equalP(neg_lits, cnf_neg_lits, symbol_function(EQUAL));
                                    }
                                }
                            }
                            if (NIL == duplicateP) {
                                skolem_neg_lits = cons(cnf_neg_lits, skolem_neg_lits);
                                if (NIL == list_utilities.singletonP(skolem_neg_lits)) {
                                    kbi_utilities.set_kbi_result(skolem_neg_lits);
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







    /**
     * test SKOLEM fort for assertions in multiple mts
     */
    public static final SubLObject skolem_assertions_in_multiple_mtsP(SubLObject skolem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($SKOLEM_ASSERTIONS_IN_MULTIPLE_MTS)) && (NIL != kbi_utilities.kbi_applies_toP($SKOLEM_ASSERTIONS_IN_MULTIPLE_MTS, skolem))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($SKOLEM_ASSERTIONS_IN_MULTIPLE_MTS);
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
                                            SubLObject _prev_bind_0_14 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_skolem_assertions_in_multiple_mts(skolem);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_15, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_14, thread);
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
                    kbi_utilities.kbi_increment_time($SKOLEM_ASSERTIONS_IN_MULTIPLE_MTS, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :SKOLEM-ASSERTIONS-IN-MULTIPLE-MTS applies to SKOLEM
     */
    public static final SubLObject why_skolem_assertions_in_multiple_mtsP(SubLObject skolem, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($SKOLEM_ASSERTIONS_IN_MULTIPLE_MTS, skolem)) {
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
                                        SubLObject _prev_bind_0_16 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_skolem_assertions_in_multiple_mts(skolem);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_17, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_16, thread);
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
                                return list($SKOLEM_ASSERTIONS_IN_MULTIPLE_MTS, skolem, data);
                            } else {
                                return list($SKOLEM_ASSERTIONS_IN_MULTIPLE_MTS, skolem);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_skolem_assertions_in_multiple_mtsP(skolem, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_skolem_assertions_in_multiple_mtsP(SubLObject skolem, SubLObject data) {
        return format(NIL, $str_alt46$_s_referenced_by_assertions_in_mu, skolem, string_utilities.stringify_items(data, symbol_function(STR), $str_alt36$__, $str_alt37$__and_));
    }

    public static final SubLObject kbi_skolem_assertions_in_multiple_mts(SubLObject skolem) {
        {
            SubLObject assertions = skolems.skolem_defn_assertions(skolem, UNPROVIDED);
            SubLObject mts = list_utilities.remove_duplicate_forts(Mapping.mapcar(symbol_function(ASSERTION_MT), assertions));
            if (NIL != mts) {
                if (NIL == list_utilities.singletonP(mts)) {
                    kbi_utilities.add_kbi_result(mts);
                }
            }
            return kbi_utilities.kbi_result();
        }
    }

    // defparameter
    public static final SubLSymbol $skolem_wXo_proper_fn_type_results$ = makeSymbol("*SKOLEM-W/O-PROPER-FN-TYPE-RESULTS*");

    // defparameter
    public static final SubLSymbol $skolem_wXo_proper_fn_type_time$ = makeSymbol("*SKOLEM-W/O-PROPER-FN-TYPE-TIME*");

    // defparameter
    public static final SubLSymbol $skolem_wXo_proper_fn_type_count$ = makeSymbol("*SKOLEM-W/O-PROPER-FN-TYPE-COUNT*");

    /**
     * test SKOLEM fort for incorrect skolem function type
     */
    public static final SubLObject skolem_wXo_proper_fn_typeP(SubLObject skolem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw54$SKOLEM_W_O_PROPER_FN_TYPE)) && (NIL != kbi_utilities.kbi_applies_toP($kw54$SKOLEM_W_O_PROPER_FN_TYPE, skolem))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw54$SKOLEM_W_O_PROPER_FN_TYPE);
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
                                                        kbi_skolem_wXo_proper_fn_type(skolem);
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
                    kbi_utilities.kbi_increment_time($kw54$SKOLEM_W_O_PROPER_FN_TYPE, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :SKOLEM-W/O-PROPER-FN-TYPE applies to SKOLEM
     */
    public static final SubLObject why_skolem_wXo_proper_fn_typeP(SubLObject skolem, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw54$SKOLEM_W_O_PROPER_FN_TYPE, skolem)) {
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
                                                    kbi_skolem_wXo_proper_fn_type(skolem);
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
                                return list($kw54$SKOLEM_W_O_PROPER_FN_TYPE, skolem, data);
                            } else {
                                return list($kw54$SKOLEM_W_O_PROPER_FN_TYPE, skolem);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_skolem_wXo_proper_fn_typeP(skolem, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_skolem_wXo_proper_fn_typeP(SubLObject skolem, SubLObject data) {
        {
            SubLObject pcase_var = cycl_utilities.nat_functor(data);
            if (pcase_var.eql($$SkolemFunction)) {
                return format(NIL, $str_alt57$_s_has_unreified_spec__s__scalar_, skolem, data);
            } else
                if (pcase_var.eql($$SkolemFuncN)) {
                    return format(NIL, $str_alt59$_s_has_unreified_spec__s____Skole, skolem, data);
                }

        }
        return NIL;
    }

    public static final SubLObject kbi_skolem_wXo_proper_fn_type(SubLObject skolem) {
        {
            SubLObject mt = skolems.skolem_defn_mt(skolem);
            SubLObject unreified_sk_term = skolems.unreified_sk_term(skolem);
            SubLObject skolem_number = skolems.skolem_number(unreified_sk_term);
            SubLObject scalarP = term.scalar_termP(skolem_number, mt);
            SubLObject pcase_var = cycl_utilities.nat_functor(unreified_sk_term);
            if (pcase_var.eql($$SkolemFunction)) {
                if (NIL != scalarP) {
                    kbi_utilities.add_kbi_result(unreified_sk_term);
                }
            } else
                if (pcase_var.eql($$SkolemFuncN)) {
                    if (NIL == scalarP) {
                        kbi_utilities.add_kbi_result(unreified_sk_term);
                    }
                }

            return kbi_utilities.kbi_result();
        }
    }

    // defparameter
    public static final SubLSymbol $skolem_wXo_proper_defn_vars_results$ = makeSymbol("*SKOLEM-W/O-PROPER-DEFN-VARS-RESULTS*");

    // defparameter
    public static final SubLSymbol $skolem_wXo_proper_defn_vars_time$ = makeSymbol("*SKOLEM-W/O-PROPER-DEFN-VARS-TIME*");

    // defparameter
    public static final SubLSymbol $skolem_wXo_proper_defn_vars_count$ = makeSymbol("*SKOLEM-W/O-PROPER-DEFN-VARS-COUNT*");

    /**
     * test SKOLEM fort for invalid vars in defn
     */
    public static final SubLObject skolem_wXo_proper_defn_varsP(SubLObject skolem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw66$SKOLEM_W_O_PROPER_DEFN_VARS)) && (NIL != kbi_utilities.kbi_applies_toP($kw66$SKOLEM_W_O_PROPER_DEFN_VARS, skolem))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw66$SKOLEM_W_O_PROPER_DEFN_VARS);
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
                                            SubLObject _prev_bind_0_22 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_skolem_wXo_proper_defn_vars(skolem);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_23 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_23, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_22, thread);
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
                    kbi_utilities.kbi_increment_time($kw66$SKOLEM_W_O_PROPER_DEFN_VARS, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :SKOLEM-W/O-PROPER-DEFN-VARS applies to SKOLEM
     */
    public static final SubLObject why_skolem_wXo_proper_defn_varsP(SubLObject skolem, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw66$SKOLEM_W_O_PROPER_DEFN_VARS, skolem)) {
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
                                        SubLObject _prev_bind_0_24 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_skolem_wXo_proper_defn_vars(skolem);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_25 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_25, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_24, thread);
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
                                return list($kw66$SKOLEM_W_O_PROPER_DEFN_VARS, skolem, data);
                            } else {
                                return list($kw66$SKOLEM_W_O_PROPER_DEFN_VARS, skolem);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_skolem_wXo_proper_defn_varsP(skolem, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_skolem_wXo_proper_defn_varsP(SubLObject skolem, SubLObject data) {
        return format(NIL, $str_alt68$_s_defn_includes_non_el_vars___a, skolem, string_utilities.stringify_items(data, symbol_function(STR), $str_alt36$__, $str_alt37$__and_));
    }

    public static final SubLObject kbi_skolem_wXo_proper_defn_vars(SubLObject skolem) {
        {
            SubLObject defn = skolems.skolem_defn(skolem);
            SubLObject vars = list_utilities.cons_tree_gather(defn, symbol_function(VARIABLE_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != vars) {
                kbi_utilities.add_kbi_result(vars);
            }
            return kbi_utilities.kbi_result();
        }
    }

    // defparameter
    public static final SubLSymbol $skolem_wXo_unique_defn_results$ = makeSymbol("*SKOLEM-W/O-UNIQUE-DEFN-RESULTS*");

    // defparameter
    public static final SubLSymbol $skolem_wXo_unique_defn_time$ = makeSymbol("*SKOLEM-W/O-UNIQUE-DEFN-TIME*");

    // defparameter
    public static final SubLSymbol $skolem_wXo_unique_defn_count$ = makeSymbol("*SKOLEM-W/O-UNIQUE-DEFN-COUNT*");

    /**
     * test SKOLEM fort for other skolems with same defn
     */
    public static final SubLObject skolem_wXo_unique_defnP(SubLObject skolem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw76$SKOLEM_W_O_UNIQUE_DEFN)) && (NIL != kbi_utilities.kbi_applies_toP($kw76$SKOLEM_W_O_UNIQUE_DEFN, skolem))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw76$SKOLEM_W_O_UNIQUE_DEFN);
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
                                            SubLObject _prev_bind_0_26 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_skolem_duplicates(skolem);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_27 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_27, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_26, thread);
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
                    kbi_utilities.kbi_increment_time($kw76$SKOLEM_W_O_UNIQUE_DEFN, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :SKOLEM-W/O-UNIQUE-DEFN applies to SKOLEM
     */
    public static final SubLObject why_skolem_wXo_unique_defnP(SubLObject skolem, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw76$SKOLEM_W_O_UNIQUE_DEFN, skolem)) {
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
                                        SubLObject _prev_bind_0_28 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_skolem_duplicates(skolem);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_29 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
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
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($EL)) {
                            if (NIL != data) {
                                return list($kw76$SKOLEM_W_O_UNIQUE_DEFN, skolem, data);
                            } else {
                                return list($kw76$SKOLEM_W_O_UNIQUE_DEFN, skolem);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_skolem_wXo_unique_defnP(skolem, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_skolem_wXo_unique_defnP(SubLObject skolem, SubLObject data) {
        return format(NIL, $str_alt78$_s_defn_duplicates_defn_of___a, skolem, string_utilities.stringify_items(data, symbol_function(STR), $str_alt36$__, $str_alt37$__and_));
    }

    public static final SubLObject kbi_skolem_duplicates(SubLObject skolem) {
        {
            SubLObject defn = skolems.skolem_defn(skolem);
            SubLObject defn_cnfs = fourth(defn);
            SubLObject doneP = NIL;
            if (NIL != defn) {
                {
                    SubLObject key = NIL;
                    SubLObject v_defns = NIL;
                    {
                        final Iterator cdohash_iterator = getEntrySetIterator(czer_vars.$skolem_axiom_table$.getGlobalValue());
                        try {
                            while (iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                key = getEntryKey(cdohash_entry);
                                v_defns = getEntryValue(cdohash_entry);
                                if (NIL == doneP) {
                                    {
                                        SubLObject csome_list_var = v_defns;
                                        SubLObject defn_1 = NIL;
                                        for (defn_1 = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , defn_1 = csome_list_var.first()) {
                                            if (NIL != list_utilities.sets_equalP(defn_cnfs, fourth(defn_1), symbol_function(EQUAL))) {
                                                if (skolem != defn_1.first()) {
                                                    kbi_utilities.add_kbi_result(defn_1.first());
                                                    doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                                }
                                            }
                                        }
                                    }
                                }
                            } 
                        } finally {
                            releaseEntrySetIterator(cdohash_iterator);
                        }
                    }
                }
            }
            return kbi_utilities.kbi_result();
        }
    }

    // defparameter
    public static final SubLSymbol $skolem_wXstale_defn_results$ = makeSymbol("*SKOLEM-W/STALE-DEFN-RESULTS*");

    // defparameter
    public static final SubLSymbol $skolem_wXstale_defn_time$ = makeSymbol("*SKOLEM-W/STALE-DEFN-TIME*");

    // defparameter
    public static final SubLSymbol $skolem_wXstale_defn_count$ = makeSymbol("*SKOLEM-W/STALE-DEFN-COUNT*");

    /**
     * test SKOLEM fort for defn inaccord with kb
     */
    public static final SubLObject skolem_wXstale_defnP(SubLObject skolem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw85$SKOLEM_W_STALE_DEFN)) && (NIL != kbi_utilities.kbi_applies_toP($kw85$SKOLEM_W_STALE_DEFN, skolem))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw85$SKOLEM_W_STALE_DEFN);
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
                                            SubLObject _prev_bind_0_30 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_skolem_defnXkb_mismatch(skolem);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_31 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
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
                                kbi_macros.$kbi_result$.rebind(_prev_bind_2, thread);
                                kbi_macros.$kbi_booleanP$.rebind(_prev_bind_1, thread);
                                kbi_macros.$kbi_doneP_fn$.rebind(_prev_bind_0, thread);
                            }
                        }
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    kbi_utilities.kbi_increment_time($kw85$SKOLEM_W_STALE_DEFN, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :SKOLEM-W/STALE-DEFN applies to SKOLEM
     */
    public static final SubLObject why_skolem_wXstale_defnP(SubLObject skolem, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw85$SKOLEM_W_STALE_DEFN, skolem)) {
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
                                        SubLObject _prev_bind_0_32 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_skolem_defnXkb_mismatch(skolem);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_33 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
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
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($EL)) {
                            if (NIL != data) {
                                return list($kw85$SKOLEM_W_STALE_DEFN, skolem, data);
                            } else {
                                return list($kw85$SKOLEM_W_STALE_DEFN, skolem);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_skolem_wXstale_defnP(skolem, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_skolem_wXstale_defnP(SubLObject skolem, SubLObject data) {
        {
            SubLObject nl_result = $str_alt87$;
            SubLObject cdolist_list_var = data;
            SubLObject typeXoldXnew = NIL;
            for (typeXoldXnew = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , typeXoldXnew = cdolist_list_var.first()) {
                {
                    SubLObject string = NIL;
                    SubLObject datum = typeXoldXnew;
                    SubLObject current = datum;
                    SubLObject type = NIL;
                    SubLObject old = NIL;
                    SubLObject v_new = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt88);
                    type = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt88);
                    old = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt88);
                    v_new = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject pcase_var = type;
                            if (pcase_var.eql($SKOLEM_KEY_MISMATCH)) {
                                string = $str_alt90$_s_key_is__a_but_should_be__a__;
                            } else
                                if (pcase_var.eql($SKOLEM_DEFN_MISMATCH)) {
                                    string = $str_alt92$_s_defns_axioms_are__a_but_should;
                                }

                        }
                        nl_result = cconcatenate(nl_result, format(NIL, string, new SubLObject[]{ skolem, old, v_new }));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt88);
                    }
                }
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_skolem_defnXkb_mismatch(SubLObject skolem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject doneP = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject new_defn = skolems.skolem_defn_from_assertions(skolem, UNPROVIDED);
                    SubLObject new_key = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject key = skolems.skolem_defn_key(skolem);
                        if (!new_key.equal(key)) {
                            kbi_utilities.add_kbi_result(list($SKOLEM_KEY_MISMATCH, key, new_key));
                            doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                        }
                    }
                    if (NIL == doneP) {
                        {
                            SubLObject defn = skolems.skolem_defn(skolem);
                            if (!fourth(new_defn).equal(fourth(defn))) {
                                kbi_utilities.add_kbi_result(list($SKOLEM_DEFN_MISMATCH, fourth(defn), fourth(new_defn)));
                            }
                        }
                    }
                }
                return kbi_utilities.kbi_result();
            }
        }
    }







    /**
     * test SKOLEM fort for non-wff defn
     */
    public static final SubLObject kbi_skolem_defn_not_wffP(SubLObject skolem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($SKOLEM_DEFN_NOT_WFF)) && (NIL != kbi_utilities.kbi_applies_toP($SKOLEM_DEFN_NOT_WFF, skolem))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($SKOLEM_DEFN_NOT_WFF);
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
                                            SubLObject _prev_bind_0_34 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_skolem_defn_not_wff(skolem);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_35 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
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
                                kbi_macros.$kbi_result$.rebind(_prev_bind_2, thread);
                                kbi_macros.$kbi_booleanP$.rebind(_prev_bind_1, thread);
                                kbi_macros.$kbi_doneP_fn$.rebind(_prev_bind_0, thread);
                            }
                        }
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    kbi_utilities.kbi_increment_time($SKOLEM_DEFN_NOT_WFF, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :SKOLEM-DEFN-NOT-WFF applies to SKOLEM
     */
    public static final SubLObject kbi_why_skolem_defn_not_wff(SubLObject skolem, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($SKOLEM_DEFN_NOT_WFF, skolem)) {
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
                                        SubLObject _prev_bind_0_36 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_skolem_defn_not_wff(skolem);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_37 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_37, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_36, thread);
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
                                return list($SKOLEM_DEFN_NOT_WFF, skolem, data);
                            } else {
                                return list($SKOLEM_DEFN_NOT_WFF, skolem);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_skolem_defn_not_wffP(skolem, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_skolem_defn_not_wff(SubLObject skolem) {
        return kbi_defn_of_skolem_not_wff(skolems.skolem_defn(skolem));
    }

    public static final SubLObject kbi_defn_of_skolem_not_wff(SubLObject skolem_defn) {
        if (NIL == skolem_defn) {
            kbi_utilities.add_kbi_result($list_alt101);
        } else
            if (skolem_defn.isAtom()) {
                kbi_utilities.add_kbi_result(list($SKOLEM_DEFN_NOT_LIST, skolem_defn));
            }

        if (NIL != kbi_utilities.kbi_doneP(UNPROVIDED)) {
            return kbi_utilities.kbi_result();
        }
        if (!FOUR_INTEGER.numE(length(skolem_defn))) {
            kbi_utilities.add_kbi_result(list($SKOLEM_DEFN_MAL_LENGTH, skolem_defn));
            if (NIL != kbi_utilities.kbi_doneP(UNPROVIDED)) {
                return nreverse(kbi_utilities.kbi_result());
            }
        }
        {
            SubLObject datum = skolem_defn;
            SubLObject current = datum;
            SubLObject first = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt104);
            first = current.first();
            current = current.rest();
            {
                SubLObject second = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt104);
                current = current.rest();
                {
                    SubLObject third = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt104);
                    current = current.rest();
                    {
                        SubLObject fourth = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt104);
                        current = current.rest();
                        {
                            SubLObject orts = current;
                            if (NIL != orts) {
                                kbi_utilities.add_kbi_result(list($SKOLEM_DEFN_ORTS, orts));
                                if (NIL != kbi_utilities.kbi_doneP(UNPROVIDED)) {
                                    return nreverse(kbi_utilities.kbi_result());
                                }
                            }
                            if (NIL == term.reified_skolem_fnP(first)) {
                                kbi_utilities.add_kbi_result(list($SKOLEM_DEFN_MAL_SKOLEM_FORT, first));
                                if (NIL != kbi_utilities.kbi_doneP(UNPROVIDED)) {
                                    return nreverse(kbi_utilities.kbi_result());
                                }
                            }
                            if (NIL != second) {
                                if (!(second.isCons() && (THREE_INTEGER.numE(length(second)) || FOUR_INTEGER.numE(length(second))))) {
                                    kbi_utilities.add_kbi_result(list($SKOLEM_DEFN_MAL_UNREIFIED_FN_LENGTH, second));
                                } else {
                                    {
                                        SubLObject datum_38 = second;
                                        SubLObject current_39 = datum_38;
                                        SubLObject skolem_fn_function = NIL;
                                        SubLObject args = NIL;
                                        SubLObject var = NIL;
                                        destructuring_bind_must_consp(current_39, datum_38, $list_alt108);
                                        skolem_fn_function = current_39.first();
                                        current_39 = current_39.rest();
                                        destructuring_bind_must_consp(current_39, datum_38, $list_alt108);
                                        args = current_39.first();
                                        current_39 = current_39.rest();
                                        destructuring_bind_must_consp(current_39, datum_38, $list_alt108);
                                        var = current_39.first();
                                        current_39 = current_39.rest();
                                        {
                                            SubLObject number = (current_39.isCons()) ? ((SubLObject) (current_39.first())) : NIL;
                                            destructuring_bind_must_listp(current_39, datum_38, $list_alt108);
                                            current_39 = current_39.rest();
                                            if (NIL == current_39) {
                                                if (NIL == term.skolem_fn_functionP(skolem_fn_function)) {
                                                    kbi_utilities.add_kbi_result(list($SKOLEM_DEFN_MAL_SKOLEM_FN_TYPE, skolem_fn_function));
                                                    if (NIL != kbi_utilities.kbi_doneP(UNPROVIDED)) {
                                                        return nreverse(kbi_utilities.kbi_result());
                                                    }
                                                }
                                                if (!((NIL == args) || args.isList())) {
                                                    kbi_utilities.add_kbi_result(list($SKOLEM_DEFN_MAL_SKOLEM_FN_ARGS, args));
                                                    if (NIL != kbi_utilities.kbi_doneP(UNPROVIDED)) {
                                                        return nreverse(kbi_utilities.kbi_result());
                                                    }
                                                }
                                                if (!((NIL == number) || (NIL != subl_promotions.memberP(number, args, symbol_function(EQUAL), UNPROVIDED)))) {
                                                    kbi_utilities.add_kbi_result(list($kw111$SKOLEM_DEFN_ARGS_W_O_NUMBER, args, number));
                                                    if (NIL != kbi_utilities.kbi_doneP(UNPROVIDED)) {
                                                        return nreverse(kbi_utilities.kbi_result());
                                                    }
                                                }
                                                if (NIL == el_utilities.el_var_listP(remove(number, args, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                                    kbi_utilities.add_kbi_result(list($SKOLEM_DEFN_NON_VAR_ARGS, args));
                                                    if (NIL != kbi_utilities.kbi_doneP(UNPROVIDED)) {
                                                        return nreverse(kbi_utilities.kbi_result());
                                                    }
                                                }
                                                if (!((NIL != var) && (NIL != cycl_variables.el_varP(var)))) {
                                                    kbi_utilities.add_kbi_result(list($SKOLEM_DEFN_MAL_SK_VAR, var));
                                                    if (NIL != kbi_utilities.kbi_doneP(UNPROVIDED)) {
                                                        return nreverse(kbi_utilities.kbi_result());
                                                    }
                                                }
                                                if (((NIL != number) && (skolem_fn_function != $$SkolemFuncNFn)) || ((skolem_fn_function == $$SkolemFuncNFn) && (NIL == number))) {
                                                    kbi_utilities.add_kbi_result(list($kw115$SKOLEM_DEFN_ARGS_SK_TYPE_NUMBER_MISMATCH, skolem_fn_function, number));
                                                    if (NIL != kbi_utilities.kbi_doneP(UNPROVIDED)) {
                                                        return nreverse(kbi_utilities.kbi_result());
                                                    }
                                                }
                                                if (((NIL != number) && number.isList()) && (number.first() == $$Unity)) {
                                                    kbi_utilities.add_kbi_result(list($SKOLEM_DEFN_OBSOLETE_NUMBER, number));
                                                }
                                            } else {
                                                cdestructuring_bind_error(datum_38, $list_alt108);
                                            }
                                        }
                                    }
                                }
                                if (NIL != kbi_utilities.kbi_doneP(UNPROVIDED)) {
                                    return nreverse(kbi_utilities.kbi_result());
                                }
                            }
                            if (NIL != third) {
                                if (NIL == fort_types_interface.mtP(third)) {
                                    kbi_utilities.add_kbi_result(list($SKOLEM_DEFN_MAL_MT, third));
                                    if (NIL != kbi_utilities.kbi_doneP(UNPROVIDED)) {
                                        return nreverse(kbi_utilities.kbi_result());
                                    }
                                }
                            }
                            if (NIL == fourth) {
                                kbi_utilities.add_kbi_result($list_alt119);
                                if (NIL != kbi_utilities.kbi_doneP(UNPROVIDED)) {
                                    return nreverse(kbi_utilities.kbi_result());
                                }
                            }
                        }
                    }
                }
            }
        }
        return nreverse(kbi_utilities.kbi_result());
    }

    public static final SubLObject kbi_nl_why_skolem_defn_not_wffP(SubLObject skolem, SubLObject data) {
        {
            SubLObject nl_result = $str_alt87$;
            SubLObject cdolist_list_var = data;
            SubLObject datum = NIL;
            for (datum = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , datum = cdolist_list_var.first()) {
                {
                    SubLObject string = NIL;
                    SubLObject datum_40 = datum;
                    SubLObject current = datum_40;
                    SubLObject type = NIL;
                    destructuring_bind_must_consp(current, datum_40, $list_alt120);
                    type = current.first();
                    current = current.rest();
                    {
                        SubLObject arg1 = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum_40, $list_alt120);
                        current = current.rest();
                        {
                            SubLObject arg2 = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                            destructuring_bind_must_listp(current, datum_40, $list_alt120);
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject pcase_var = type;
                                    if (pcase_var.eql($SKOLEM_DEFN_MISSING)) {
                                        string = format(NIL, $str_alt122$skolem__s_has_no_defn__, skolem);
                                    } else
                                        if (pcase_var.eql($SKOLEM_DEFN_NOT_LIST)) {
                                            string = format(NIL, $str_alt123$skolem__s_has_atom_defn___s___, skolem, arg1);
                                        } else
                                            if (pcase_var.eql($SKOLEM_DEFN_MAL_LENGTH)) {
                                                string = format(NIL, $str_alt124$skolem__s_has_defn_with_length__s, new SubLObject[]{ skolem, length(arg1), arg2 });
                                            } else
                                                if (pcase_var.eql($SKOLEM_DEFN_ORTS)) {
                                                    string = format(NIL, $str_alt125$skolem__s_has_defn_with_orts___s_, skolem, arg1);
                                                } else
                                                    if (pcase_var.eql($SKOLEM_DEFN_MAL_SKOLEM_FORT)) {
                                                        string = format(NIL, $str_alt126$skolem__s_is_not_a_valid_skolem__, skolem, arg1);
                                                    } else
                                                        if (pcase_var.eql($SKOLEM_DEFN_MAL_UNREIFIED_FN_LENGTH)) {
                                                            string = format(NIL, $str_alt127$skolem__s_has_unreified_function_, skolem, arg1);
                                                        } else
                                                            if (pcase_var.eql($SKOLEM_DEFN_MAL_SKOLEM_FN_TYPE)) {
                                                                string = format(NIL, $str_alt128$skolem__s_has_invalid_skolem_type, skolem, arg1);
                                                            } else
                                                                if (pcase_var.eql($SKOLEM_DEFN_MAL_SKOLEM_FN_ARGS)) {
                                                                    string = format(NIL, $str_alt129$skolem__s_has_invalid_skolem_args, skolem, arg1);
                                                                } else
                                                                    if (pcase_var.eql($kw111$SKOLEM_DEFN_ARGS_W_O_NUMBER)) {
                                                                        string = format(NIL, $str_alt130$skolem__s_args__s_missing_number_, new SubLObject[]{ skolem, arg1, arg2 });
                                                                    } else
                                                                        if (pcase_var.eql($SKOLEM_DEFN_NON_VAR_ARGS)) {
                                                                            string = format(NIL, $str_alt131$skolem__s_args_includes_non_el_va, skolem, arg1);
                                                                        } else
                                                                            if (pcase_var.eql($SKOLEM_DEFN_MAL_SK_VAR)) {
                                                                                string = format(NIL, $str_alt132$skolem__s_var_is_not_valid___s___, skolem, arg1);
                                                                            } else
                                                                                if (pcase_var.eql($kw115$SKOLEM_DEFN_ARGS_SK_TYPE_NUMBER_MISMATCH)) {
                                                                                    string = format(NIL, $str_alt133$skolem__s_type__s_does_not_match_, new SubLObject[]{ skolem, arg1, arg2 });
                                                                                } else
                                                                                    if (pcase_var.eql($SKOLEM_DEFN_OBSOLETE_NUMBER)) {
                                                                                        string = format(NIL, $str_alt134$skolem__s_number_is_not_valid___s, skolem, arg1);
                                                                                    } else
                                                                                        if (pcase_var.eql($SKOLEM_DEFN_MAL_MT)) {
                                                                                            string = format(NIL, $str_alt135$skolem__s_mt_is_not_valid___s___, skolem, arg1);
                                                                                        } else
                                                                                            if (pcase_var.eql($kw136$SKOLEM_DEFN_W_O_CLAUSES)) {
                                                                                                string = format(NIL, $str_alt137$skolem__s_defn_has_no_clauses___, skolem);
                                                                                            }














                                }
                                nl_result = cconcatenate(nl_result, string);
                            } else {
                                cdestructuring_bind_error(datum_40, $list_alt120);
                            }
                        }
                    }
                }
            }
            return nl_result;
        }
    }







    /**
     * test SKOLEM fort for reference within #$holdsIn
     */
    public static final SubLObject skolem_referenced_by_holds_inP(SubLObject skolem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($SKOLEM_REFERENCED_BY_HOLDS_IN)) && (NIL != kbi_utilities.kbi_applies_toP($SKOLEM_REFERENCED_BY_HOLDS_IN, skolem))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($SKOLEM_REFERENCED_BY_HOLDS_IN);
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
                                            SubLObject _prev_bind_0_41 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_skolem_referenced_by_holds_in(skolem);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_42 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_42, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_41, thread);
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
                    kbi_utilities.kbi_increment_time($SKOLEM_REFERENCED_BY_HOLDS_IN, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :SKOLEM-REFERENCED-BY-HOLDS-IN applies to SKOLEM
     */
    public static final SubLObject why_skolem_referenced_by_holds_inP(SubLObject skolem, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($SKOLEM_REFERENCED_BY_HOLDS_IN, skolem)) {
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
                                        SubLObject _prev_bind_0_43 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_skolem_referenced_by_holds_in(skolem);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_44 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_44, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_43, thread);
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
                                return list($SKOLEM_REFERENCED_BY_HOLDS_IN, skolem, data);
                            } else {
                                return list($SKOLEM_REFERENCED_BY_HOLDS_IN, skolem);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_skolem_referenced_by_holds_inP(skolem, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_skolem_referenced_by_holds_inP(SubLObject skolem, SubLObject data) {
        return format(NIL, $str_alt146$_s_referenced_within___holdsIn_in, skolem, string_utilities.stringify_items(data, symbol_function(STR), $str_alt36$__, $str_alt37$__and_));
    }

    public static final SubLObject kbi_skolem_referenced_by_holds_in(SubLObject skolem) {
        {
            SubLObject defn = skolems.skolem_defn(skolem);
            SubLObject var = skolems.skolem_var(skolem);
            SubLObject doneP = NIL;
            if (NIL != defn) {
                if (NIL == doneP) {
                    {
                        SubLObject csome_list_var = fourth(defn);
                        SubLObject cnf = NIL;
                        for (cnf = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , cnf = csome_list_var.first()) {
                            if (NIL == doneP) {
                                {
                                    SubLObject csome_list_var_45 = list_utilities.cons_tree_gather(cnf, symbol_function($sym147$HOLDS_IN_LIT_), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    SubLObject literal = NIL;
                                    for (literal = csome_list_var_45.first(); !((NIL != doneP) || (NIL == csome_list_var_45)); csome_list_var_45 = csome_list_var_45.rest() , literal = csome_list_var_45.first()) {
                                        if (NIL != list_utilities.tree_find(var, el_utilities.literal_arg2(literal, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                                            kbi_utilities.add_kbi_result(cnf);
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
     * test skolem-function fort for assertions referencing use multiple vars
     */
    public static final SubLObject skolem_with_multiple_varsP(SubLObject skolem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($SKOLEM_WITH_MULTIPLE_VARS)) && (NIL != kbi_utilities.kbi_applies_toP($SKOLEM_WITH_MULTIPLE_VARS, skolem))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($SKOLEM_WITH_MULTIPLE_VARS);
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
                                            SubLObject _prev_bind_0_46 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_skolem_with_multiple_vars(skolem);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_47 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_47, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_46, thread);
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
                    kbi_utilities.kbi_increment_time($SKOLEM_WITH_MULTIPLE_VARS, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :SKOLEM-WITH-MULTIPLE-VARS applies to SKOLEM
     */
    public static final SubLObject why_skolem_with_multiple_varsP(SubLObject skolem, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($SKOLEM_WITH_MULTIPLE_VARS, skolem)) {
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
                                        SubLObject _prev_bind_0_48 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_skolem_with_multiple_vars(skolem);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_49 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_49, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_48, thread);
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
                                return list($SKOLEM_WITH_MULTIPLE_VARS, skolem, data);
                            } else {
                                return list($SKOLEM_WITH_MULTIPLE_VARS, skolem);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_skolem_with_multiple_varsP(skolem, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_skolem_with_multiple_varsP(SubLObject skolem, SubLObject data) {
        return format(NIL, $str_alt156$_s_referenced_in_assertions_by_mu, skolem, string_utilities.stringify_items(data, symbol_function(STR), $str_alt36$__, $str_alt157$_and_));
    }

    public static final SubLObject kbi_skolem_with_multiple_vars(SubLObject skolem) {
        {
            SubLObject assertions = skolems.skolem_defn_assertions(skolem, UNPROVIDED);
            SubLObject var = third(skolems.unreified_sk_term(skolem));
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = assertions;
                    SubLObject assertion = NIL;
                    for (assertion = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , assertion = csome_list_var.first()) {
                        if (NIL == doneP) {
                            {
                                SubLObject csome_list_var_50 = clauses.neg_lits(assertions_high.assertion_cnf(assertion));
                                SubLObject lit = NIL;
                                for (lit = csome_list_var_50.first(); !((NIL != doneP) || (NIL == csome_list_var_50)); csome_list_var_50 = csome_list_var_50.rest() , lit = csome_list_var_50.first()) {
                                    if (NIL != el_utilities.tou_litP(lit)) {
                                        if (skolem.eql(cycl_utilities.nat_functor(el_utilities.literal_arg2(lit, UNPROVIDED)))) {
                                            {
                                                SubLObject el_var_name = nth(variables.variable_id(el_utilities.literal_arg1(lit, UNPROVIDED)), assertions_high.assertion_variable_names(assertion));
                                                if (NIL == Strings.stringE(symbol_name(var), el_var_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                    kbi_utilities.add_kbi_result(el_utilities.literal_arg1(lit, UNPROVIDED));
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

    // defparameter
    public static final SubLSymbol $skolem_wXextra_args_results$ = makeSymbol("*SKOLEM-W/EXTRA-ARGS-RESULTS*");

    // defparameter
    public static final SubLSymbol $skolem_wXextra_args_time$ = makeSymbol("*SKOLEM-W/EXTRA-ARGS-TIME*");

    // defparameter
    public static final SubLSymbol $skolem_wXextra_args_count$ = makeSymbol("*SKOLEM-W/EXTRA-ARGS-COUNT*");

    /**
     * test SKOLEM fort for extraneous args (e.g., no pos-lits relate the skolem to the arg)
     */
    public static final SubLObject skolem_wXextra_argsP(SubLObject skolem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw164$SKOLEM_W_EXTRA_ARGS)) && (NIL != kbi_utilities.kbi_applies_toP($kw164$SKOLEM_W_EXTRA_ARGS, skolem))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw164$SKOLEM_W_EXTRA_ARGS);
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
                                                        kbi_extra_args_of_skolem(skolem);
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
                    kbi_utilities.kbi_increment_time($kw164$SKOLEM_W_EXTRA_ARGS, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :SKOLEM-W/EXTRA-ARGS applies to SKOLEM
     */
    public static final SubLObject why_skolem_wXextra_argsP(SubLObject skolem, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw164$SKOLEM_W_EXTRA_ARGS, skolem)) {
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
                                                    kbi_extra_args_of_skolem(skolem);
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
                                return list($kw164$SKOLEM_W_EXTRA_ARGS, skolem, data);
                            } else {
                                return list($kw164$SKOLEM_W_EXTRA_ARGS, skolem);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_skolem_wXextra_argsP(skolem, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_skolem_wXextra_argsP(SubLObject skolem, SubLObject data) {
        return format(NIL, $str_alt166$_s_has_extraneous_args___a, skolem, string_utilities.stringify_items(data, symbol_function(STR), $str_alt36$__, $str_alt37$__and_));
    }

    public static final SubLObject kbi_extra_args_of_skolem(SubLObject skolem) {
        {
            SubLObject skolem_args = remove(skolems.skolem_defn_number(skolem), skolems.skolem_defn_args(skolem), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject assertions = skolems.skolem_defn_assertions(skolem, UNPROVIDED);
            SubLObject sk_var = NIL;
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = assertions;
                    SubLObject assertion = NIL;
                    for (assertion = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , assertion = csome_list_var.first()) {
                        if (NIL == sk_var) {
                            {
                                SubLObject csome_list_var_55 = clauses.neg_lits(assertions_high.assertion_cnf(assertion));
                                SubLObject neg_lit = NIL;
                                for (neg_lit = csome_list_var_55.first(); !((NIL != sk_var) || (NIL == csome_list_var_55)); csome_list_var_55 = csome_list_var_55.rest() , neg_lit = csome_list_var_55.first()) {
                                    if (NIL != el_utilities.tou_litP(neg_lit)) {
                                        if (skolem == el_utilities.literal_arg2(neg_lit, UNPROVIDED).first()) {
                                            sk_var = el_utilities.literal_arg1(neg_lit, UNPROVIDED);
                                        }
                                    }
                                }
                            }
                        }
                        if (NIL != sk_var) {
                            if (NIL == doneP) {
                                {
                                    SubLObject csome_list_var_56 = clauses.pos_lits(assertions_high.assertion_cnf(assertion));
                                    SubLObject pos_lit = NIL;
                                    for (pos_lit = csome_list_var_56.first(); !((NIL != doneP) || (NIL == csome_list_var_56)); csome_list_var_56 = csome_list_var_56.rest() , pos_lit = csome_list_var_56.first()) {
                                        if (NIL != list_utilities.tree_find(sk_var, pos_lit, UNPROVIDED, UNPROVIDED)) {
                                            {
                                                SubLObject cdolist_list_var = skolem_args;
                                                SubLObject arg = NIL;
                                                for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                                                    {
                                                        SubLObject n = position(string_utilities.str(arg), assertions_high.assertion_variable_names(assertion), symbol_function($sym167$STRING_), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        SubLObject arg_var = (NIL != n) ? ((SubLObject) (variables.find_variable_by_id(n))) : NIL;
                                                        if (NIL != list_utilities.tree_find(arg_var, pos_lit, UNPROVIDED, UNPROVIDED)) {
                                                            skolem_args = remove(arg, skolem_args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        doneP = sublisp_null(skolem_args);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            kbi_utilities.set_kbi_result(skolem_args);
            return kbi_utilities.kbi_result();
        }
    }

    public static final SubLObject declare_kbi_skolem_file() {
        declareFunction("diagnose_qua_skolem", "DIAGNOSE-QUA-SKOLEM", 1, 0, false);
        declareFunction("baren_skolem_fnP", "BAREN-SKOLEM-FN?", 1, 0, false);
        declareFunction("why_baren_skolem_fnP", "WHY-BAREN-SKOLEM-FN?", 1, 1, false);
        declareFunction("kbi_nl_why_baren_skolem_fnP", "KBI-NL-WHY-BAREN-SKOLEM-FN?", 2, 0, false);
        declareFunction("kbi_baren_skolem_fnP", "KBI-BAREN-SKOLEM-FN?", 1, 0, false);
        declareFunction("baren_skolem_cache_fn", "BAREN-SKOLEM-CACHE-FN", 1, 0, false);
        declareFunction("skolem_wXo_defnP", "SKOLEM-W/O-DEFN?", 1, 0, false);
        declareFunction("why_skolem_wXo_defnP", "WHY-SKOLEM-W/O-DEFN?", 1, 1, false);
        declareFunction("kbi_nl_why_skolem_wXo_defnP", "KBI-NL-WHY-SKOLEM-W/O-DEFN?", 2, 0, false);
        declareFunction("kbi_skolem_wXo_defnP", "KBI-SKOLEM-W/O-DEFN?", 1, 0, false);
        declareFunction("skolem_wXo_common_neg_litsP", "SKOLEM-W/O-COMMON-NEG-LITS?", 1, 0, false);
        declareFunction("why_skolem_wXo_common_neg_litsP", "WHY-SKOLEM-W/O-COMMON-NEG-LITS?", 1, 1, false);
        declareFunction("kbi_nl_why_skolem_wXo_common_neg_litsP", "KBI-NL-WHY-SKOLEM-W/O-COMMON-NEG-LITS?", 2, 0, false);
        declareFunction("kbi_skolem_defn_diverging_neg_lits", "KBI-SKOLEM-DEFN-DIVERGING-NEG-LITS", 1, 0, false);
        declareFunction("skolem_assertions_in_multiple_mtsP", "SKOLEM-ASSERTIONS-IN-MULTIPLE-MTS?", 1, 0, false);
        declareFunction("why_skolem_assertions_in_multiple_mtsP", "WHY-SKOLEM-ASSERTIONS-IN-MULTIPLE-MTS?", 1, 1, false);
        declareFunction("kbi_nl_why_skolem_assertions_in_multiple_mtsP", "KBI-NL-WHY-SKOLEM-ASSERTIONS-IN-MULTIPLE-MTS?", 2, 0, false);
        declareFunction("kbi_skolem_assertions_in_multiple_mts", "KBI-SKOLEM-ASSERTIONS-IN-MULTIPLE-MTS", 1, 0, false);
        declareFunction("skolem_wXo_proper_fn_typeP", "SKOLEM-W/O-PROPER-FN-TYPE?", 1, 0, false);
        declareFunction("why_skolem_wXo_proper_fn_typeP", "WHY-SKOLEM-W/O-PROPER-FN-TYPE?", 1, 1, false);
        declareFunction("kbi_nl_why_skolem_wXo_proper_fn_typeP", "KBI-NL-WHY-SKOLEM-W/O-PROPER-FN-TYPE?", 2, 0, false);
        declareFunction("kbi_skolem_wXo_proper_fn_type", "KBI-SKOLEM-W/O-PROPER-FN-TYPE", 1, 0, false);
        declareFunction("skolem_wXo_proper_defn_varsP", "SKOLEM-W/O-PROPER-DEFN-VARS?", 1, 0, false);
        declareFunction("why_skolem_wXo_proper_defn_varsP", "WHY-SKOLEM-W/O-PROPER-DEFN-VARS?", 1, 1, false);
        declareFunction("kbi_nl_why_skolem_wXo_proper_defn_varsP", "KBI-NL-WHY-SKOLEM-W/O-PROPER-DEFN-VARS?", 2, 0, false);
        declareFunction("kbi_skolem_wXo_proper_defn_vars", "KBI-SKOLEM-W/O-PROPER-DEFN-VARS", 1, 0, false);
        declareFunction("skolem_wXo_unique_defnP", "SKOLEM-W/O-UNIQUE-DEFN?", 1, 0, false);
        declareFunction("why_skolem_wXo_unique_defnP", "WHY-SKOLEM-W/O-UNIQUE-DEFN?", 1, 1, false);
        declareFunction("kbi_nl_why_skolem_wXo_unique_defnP", "KBI-NL-WHY-SKOLEM-W/O-UNIQUE-DEFN?", 2, 0, false);
        declareFunction("kbi_skolem_duplicates", "KBI-SKOLEM-DUPLICATES", 1, 0, false);
        declareFunction("skolem_wXstale_defnP", "SKOLEM-W/STALE-DEFN?", 1, 0, false);
        declareFunction("why_skolem_wXstale_defnP", "WHY-SKOLEM-W/STALE-DEFN?", 1, 1, false);
        declareFunction("kbi_nl_why_skolem_wXstale_defnP", "KBI-NL-WHY-SKOLEM-W/STALE-DEFN?", 2, 0, false);
        declareFunction("kbi_skolem_defnXkb_mismatch", "KBI-SKOLEM-DEFN/KB-MISMATCH", 1, 0, false);
        declareFunction("kbi_skolem_defn_not_wffP", "KBI-SKOLEM-DEFN-NOT-WFF?", 1, 0, false);
        declareFunction("kbi_why_skolem_defn_not_wff", "KBI-WHY-SKOLEM-DEFN-NOT-WFF", 1, 1, false);
        declareFunction("kbi_skolem_defn_not_wff", "KBI-SKOLEM-DEFN-NOT-WFF", 1, 0, false);
        declareFunction("kbi_defn_of_skolem_not_wff", "KBI-DEFN-OF-SKOLEM-NOT-WFF", 1, 0, false);
        declareFunction("kbi_nl_why_skolem_defn_not_wffP", "KBI-NL-WHY-SKOLEM-DEFN-NOT-WFF?", 2, 0, false);
        declareFunction("skolem_referenced_by_holds_inP", "SKOLEM-REFERENCED-BY-HOLDS-IN?", 1, 0, false);
        declareFunction("why_skolem_referenced_by_holds_inP", "WHY-SKOLEM-REFERENCED-BY-HOLDS-IN?", 1, 1, false);
        declareFunction("kbi_nl_why_skolem_referenced_by_holds_inP", "KBI-NL-WHY-SKOLEM-REFERENCED-BY-HOLDS-IN?", 2, 0, false);
        declareFunction("kbi_skolem_referenced_by_holds_in", "KBI-SKOLEM-REFERENCED-BY-HOLDS-IN", 1, 0, false);
        declareFunction("skolem_with_multiple_varsP", "SKOLEM-WITH-MULTIPLE-VARS?", 1, 0, false);
        declareFunction("why_skolem_with_multiple_varsP", "WHY-SKOLEM-WITH-MULTIPLE-VARS?", 1, 1, false);
        declareFunction("kbi_nl_why_skolem_with_multiple_varsP", "KBI-NL-WHY-SKOLEM-WITH-MULTIPLE-VARS?", 2, 0, false);
        declareFunction("kbi_skolem_with_multiple_vars", "KBI-SKOLEM-WITH-MULTIPLE-VARS", 1, 0, false);
        declareFunction("skolem_wXextra_argsP", "SKOLEM-W/EXTRA-ARGS?", 1, 0, false);
        declareFunction("why_skolem_wXextra_argsP", "WHY-SKOLEM-W/EXTRA-ARGS?", 1, 1, false);
        declareFunction("kbi_nl_why_skolem_wXextra_argsP", "KBI-NL-WHY-SKOLEM-W/EXTRA-ARGS?", 2, 0, false);
        declareFunction("kbi_extra_args_of_skolem", "KBI-EXTRA-ARGS-OF-SKOLEM", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_kbi_skolem_file() {
        defparameter("*BAREN-SKOLEM-FN-REPAIRS*", NIL);
        defparameter("*BAREN-SKOLEM-FN-RESULTS*", NIL);
        defparameter("*BAREN-SKOLEM-FN-TIME*", ZERO_INTEGER);
        defparameter("*BAREN-SKOLEM-FN-COUNT*", ZERO_INTEGER);
        defparameter("*SKOLEM-W/O-DEFN-RESULTS*", NIL);
        defparameter("*SKOLEM-W/O-DEFN-TIME*", ZERO_INTEGER);
        defparameter("*SKOLEM-W/O-DEFN-COUNT*", ZERO_INTEGER);
        defparameter("*SKOLEM-W/O-COMMON-NEG-LITS-RESULTS*", NIL);
        defparameter("*SKOLEM-W/O-COMMON-NEG-LITS-TIME*", ZERO_INTEGER);
        defparameter("*SKOLEM-W/O-COMMON-NEG-LITS-COUNT*", ZERO_INTEGER);
        defparameter("*SKOLEM-ASSERTIONS-IN-MULTIPLE-MTS-RESULTS*", NIL);
        defparameter("*SKOLEM-ASSERTIONS-IN-MULTIPLE-MTS-TIME*", ZERO_INTEGER);
        defparameter("*SKOLEM-ASSERTIONS-IN-MULTIPLE-MTS-COUNT*", ZERO_INTEGER);
        defparameter("*SKOLEM-W/O-PROPER-FN-TYPE-RESULTS*", NIL);
        defparameter("*SKOLEM-W/O-PROPER-FN-TYPE-TIME*", ZERO_INTEGER);
        defparameter("*SKOLEM-W/O-PROPER-FN-TYPE-COUNT*", ZERO_INTEGER);
        defparameter("*SKOLEM-W/O-PROPER-DEFN-VARS-RESULTS*", NIL);
        defparameter("*SKOLEM-W/O-PROPER-DEFN-VARS-TIME*", ZERO_INTEGER);
        defparameter("*SKOLEM-W/O-PROPER-DEFN-VARS-COUNT*", ZERO_INTEGER);
        defparameter("*SKOLEM-W/O-UNIQUE-DEFN-RESULTS*", NIL);
        defparameter("*SKOLEM-W/O-UNIQUE-DEFN-TIME*", ZERO_INTEGER);
        defparameter("*SKOLEM-W/O-UNIQUE-DEFN-COUNT*", ZERO_INTEGER);
        defparameter("*SKOLEM-W/STALE-DEFN-RESULTS*", NIL);
        defparameter("*SKOLEM-W/STALE-DEFN-TIME*", ZERO_INTEGER);
        defparameter("*SKOLEM-W/STALE-DEFN-COUNT*", ZERO_INTEGER);
        defparameter("*SKOLEM-DEFN-NOT-WFF-RESULTS*", NIL);
        defparameter("*SKOLEM-DEFN-NOT-WFF-TIME*", ZERO_INTEGER);
        defparameter("*SKOLEM-DEFN-NOT-WFF-COUNT*", ZERO_INTEGER);
        defparameter("*SKOLEM-REFERENCED-BY-HOLDS-IN-RESULTS*", NIL);
        defparameter("*SKOLEM-REFERENCED-BY-HOLDS-IN-TIME*", ZERO_INTEGER);
        defparameter("*SKOLEM-REFERENCED-BY-HOLDS-IN-COUNT*", ZERO_INTEGER);
        defparameter("*SKOLEM-WITH-MULTIPLE-VARS-RESULTS*", NIL);
        defparameter("*SKOLEM-WITH-MULTIPLE-VARS-TIME*", ZERO_INTEGER);
        defparameter("*SKOLEM-WITH-MULTIPLE-VARS-COUNT*", ZERO_INTEGER);
        defparameter("*SKOLEM-W/EXTRA-ARGS-RESULTS*", NIL);
        defparameter("*SKOLEM-W/EXTRA-ARGS-TIME*", ZERO_INTEGER);
        defparameter("*SKOLEM-W/EXTRA-ARGS-COUNT*", ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject setup_kbi_skolem_file() {
                {
            SubLObject item_var = $baren_skolem_fn_repairs$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($baren_skolem_fn_repairs$, $str_alt2$repaired_violators_of_kbi_module_);
        {
            SubLObject item_var = $baren_skolem_fn_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($baren_skolem_fn_results$, $str_alt4$violators_of_kbi_module__BAREN_SK);
        {
            SubLObject item_var = $baren_skolem_fn_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($baren_skolem_fn_time$, $str_alt6$run_time_of_predicate_application);
        {
            SubLObject item_var = $baren_skolem_fn_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($baren_skolem_fn_count$, $str_alt8$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($BAREN_SKOLEM_FN, $list_alt15);
        {
            SubLObject item_var = $sym17$_SKOLEM_W_O_DEFN_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym17$_SKOLEM_W_O_DEFN_RESULTS_, $str_alt18$violators_of_kbi_module__SKOLEM_W);
        {
            SubLObject item_var = $sym19$_SKOLEM_W_O_DEFN_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym19$_SKOLEM_W_O_DEFN_TIME_, $str_alt20$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym21$_SKOLEM_W_O_DEFN_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym21$_SKOLEM_W_O_DEFN_COUNT_, $str_alt22$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw23$SKOLEM_W_O_DEFN, $list_alt24);
        {
            SubLObject item_var = $sym26$_SKOLEM_W_O_COMMON_NEG_LITS_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym26$_SKOLEM_W_O_COMMON_NEG_LITS_RESULTS_, $str_alt27$violators_of_kbi_module__SKOLEM_W);
        {
            SubLObject item_var = $sym28$_SKOLEM_W_O_COMMON_NEG_LITS_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym28$_SKOLEM_W_O_COMMON_NEG_LITS_TIME_, $str_alt29$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym30$_SKOLEM_W_O_COMMON_NEG_LITS_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym30$_SKOLEM_W_O_COMMON_NEG_LITS_COUNT_, $str_alt31$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw32$SKOLEM_W_O_COMMON_NEG_LITS, $list_alt33);
        {
            SubLObject item_var = $skolem_assertions_in_multiple_mts_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($skolem_assertions_in_multiple_mts_results$, $str_alt39$violators_of_kbi_module__SKOLEM_A);
        {
            SubLObject item_var = $skolem_assertions_in_multiple_mts_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($skolem_assertions_in_multiple_mts_time$, $str_alt41$run_time_of_predicate_application);
        {
            SubLObject item_var = $skolem_assertions_in_multiple_mts_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($skolem_assertions_in_multiple_mts_count$, $str_alt43$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($SKOLEM_ASSERTIONS_IN_MULTIPLE_MTS, $list_alt45);
        {
            SubLObject item_var = $sym48$_SKOLEM_W_O_PROPER_FN_TYPE_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym48$_SKOLEM_W_O_PROPER_FN_TYPE_RESULTS_, $str_alt49$violators_of_kbi_module__SKOLEM_W);
        {
            SubLObject item_var = $sym50$_SKOLEM_W_O_PROPER_FN_TYPE_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym50$_SKOLEM_W_O_PROPER_FN_TYPE_TIME_, $str_alt51$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym52$_SKOLEM_W_O_PROPER_FN_TYPE_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym52$_SKOLEM_W_O_PROPER_FN_TYPE_COUNT_, $str_alt53$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw54$SKOLEM_W_O_PROPER_FN_TYPE, $list_alt55);
        {
            SubLObject item_var = $sym60$_SKOLEM_W_O_PROPER_DEFN_VARS_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym60$_SKOLEM_W_O_PROPER_DEFN_VARS_RESULTS_, $str_alt61$violators_of_kbi_module__SKOLEM_W);
        {
            SubLObject item_var = $sym62$_SKOLEM_W_O_PROPER_DEFN_VARS_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym62$_SKOLEM_W_O_PROPER_DEFN_VARS_TIME_, $str_alt63$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym64$_SKOLEM_W_O_PROPER_DEFN_VARS_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym64$_SKOLEM_W_O_PROPER_DEFN_VARS_COUNT_, $str_alt65$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw66$SKOLEM_W_O_PROPER_DEFN_VARS, $list_alt67);
        {
            SubLObject item_var = $sym70$_SKOLEM_W_O_UNIQUE_DEFN_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym70$_SKOLEM_W_O_UNIQUE_DEFN_RESULTS_, $str_alt71$violators_of_kbi_module__SKOLEM_W);
        {
            SubLObject item_var = $sym72$_SKOLEM_W_O_UNIQUE_DEFN_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym72$_SKOLEM_W_O_UNIQUE_DEFN_TIME_, $str_alt73$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym74$_SKOLEM_W_O_UNIQUE_DEFN_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym74$_SKOLEM_W_O_UNIQUE_DEFN_COUNT_, $str_alt75$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw76$SKOLEM_W_O_UNIQUE_DEFN, $list_alt77);
        {
            SubLObject item_var = $sym79$_SKOLEM_W_STALE_DEFN_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym79$_SKOLEM_W_STALE_DEFN_RESULTS_, $str_alt80$violators_of_kbi_module__SKOLEM_W);
        {
            SubLObject item_var = $sym81$_SKOLEM_W_STALE_DEFN_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym81$_SKOLEM_W_STALE_DEFN_TIME_, $str_alt82$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym83$_SKOLEM_W_STALE_DEFN_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym83$_SKOLEM_W_STALE_DEFN_COUNT_, $str_alt84$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw85$SKOLEM_W_STALE_DEFN, $list_alt86);
        {
            SubLObject item_var = $skolem_defn_not_wff_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($skolem_defn_not_wff_results$, $str_alt94$violators_of_kbi_module__SKOLEM_D);
        {
            SubLObject item_var = $skolem_defn_not_wff_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($skolem_defn_not_wff_time$, $str_alt96$run_time_of_predicate_application);
        {
            SubLObject item_var = $skolem_defn_not_wff_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($skolem_defn_not_wff_count$, $str_alt98$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($SKOLEM_DEFN_NOT_WFF, $list_alt100);
        {
            SubLObject item_var = $skolem_referenced_by_holds_in_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($skolem_referenced_by_holds_in_results$, $str_alt139$violators_of_kbi_module__SKOLEM_R);
        {
            SubLObject item_var = $skolem_referenced_by_holds_in_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($skolem_referenced_by_holds_in_time$, $str_alt141$run_time_of_predicate_application);
        {
            SubLObject item_var = $skolem_referenced_by_holds_in_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($skolem_referenced_by_holds_in_count$, $str_alt143$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($SKOLEM_REFERENCED_BY_HOLDS_IN, $list_alt145);
        {
            SubLObject item_var = $skolem_with_multiple_vars_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($skolem_with_multiple_vars_results$, $str_alt149$violators_of_kbi_module__SKOLEM_W);
        {
            SubLObject item_var = $skolem_with_multiple_vars_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($skolem_with_multiple_vars_time$, $str_alt151$run_time_of_predicate_application);
        {
            SubLObject item_var = $skolem_with_multiple_vars_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($skolem_with_multiple_vars_count$, $str_alt153$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($SKOLEM_WITH_MULTIPLE_VARS, $list_alt155);
        {
            SubLObject item_var = $sym158$_SKOLEM_W_EXTRA_ARGS_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym158$_SKOLEM_W_EXTRA_ARGS_RESULTS_, $str_alt159$violators_of_kbi_module__SKOLEM_W);
        {
            SubLObject item_var = $sym160$_SKOLEM_W_EXTRA_ARGS_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym160$_SKOLEM_W_EXTRA_ARGS_TIME_, $str_alt161$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym162$_SKOLEM_W_EXTRA_ARGS_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym162$_SKOLEM_W_EXTRA_ARGS_COUNT_, $str_alt163$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw164$SKOLEM_W_EXTRA_ARGS, $list_alt165);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol $SKOLEM = makeKeyword("SKOLEM");

    public static final SubLSymbol $baren_skolem_fn_repairs$ = makeSymbol("*BAREN-SKOLEM-FN-REPAIRS*");

    static private final SubLString $str_alt2$repaired_violators_of_kbi_module_ = makeString("repaired violators of kbi module :BAREN-SKOLEM-FN");

    public static final SubLSymbol $baren_skolem_fn_results$ = makeSymbol("*BAREN-SKOLEM-FN-RESULTS*");

    static private final SubLString $str_alt4$violators_of_kbi_module__BAREN_SK = makeString("violators of kbi module :BAREN-SKOLEM-FN");

    public static final SubLSymbol $baren_skolem_fn_time$ = makeSymbol("*BAREN-SKOLEM-FN-TIME*");

    static private final SubLString $str_alt6$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :BAREN-SKOLEM-FN");

    public static final SubLSymbol $baren_skolem_fn_count$ = makeSymbol("*BAREN-SKOLEM-FN-COUNT*");

    static private final SubLString $str_alt8$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :BAREN-SKOLEM-FN");

    private static final SubLSymbol $BAREN_SKOLEM_FN = makeKeyword("BAREN-SKOLEM-FN");





    private static final SubLSymbol $KBI_ERROR = makeKeyword("KBI-ERROR");





    static private final SubLList $list_alt15 = list(new SubLObject[]{ makeKeyword("KBI-REPAIR-CACHE"), makeSymbol("*BAREN-SKOLEM-FN-REPAIRS*"), makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*BAREN-SKOLEM-FN-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*BAREN-SKOLEM-FN-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*BAREN-SKOLEM-FN-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("SKOLEM"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-BAREN-SKOLEM-FN?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("BAREN-SKOLEM-FN?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-BAREN-SKOLEM-FN?"), makeKeyword("KBI-REPAIR-FN"), makeSymbol("FI-KILL-INT"), makeKeyword("KBI-CACHE-FN"), makeSymbol("BAREN-SKOLEM-CACHE-FN"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-BAREN-SKOLEM-FN?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("TMS"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("STALE-DATA"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test SKOLEM fort for no significant assertions") });

    static private final SubLString $str_alt16$_s_is_referenced_by_no_significan = makeString("~s is referenced by no significant (i.e., defining) assertions");

    static private final SubLSymbol $sym17$_SKOLEM_W_O_DEFN_RESULTS_ = makeSymbol("*SKOLEM-W/O-DEFN-RESULTS*");

    static private final SubLString $str_alt18$violators_of_kbi_module__SKOLEM_W = makeString("violators of kbi module :SKOLEM-W/O-DEFN");

    static private final SubLSymbol $sym19$_SKOLEM_W_O_DEFN_TIME_ = makeSymbol("*SKOLEM-W/O-DEFN-TIME*");

    static private final SubLString $str_alt20$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :SKOLEM-W/O-DEFN");

    static private final SubLSymbol $sym21$_SKOLEM_W_O_DEFN_COUNT_ = makeSymbol("*SKOLEM-W/O-DEFN-COUNT*");

    static private final SubLString $str_alt22$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :SKOLEM-W/O-DEFN");

    public static final SubLSymbol $kw23$SKOLEM_W_O_DEFN = makeKeyword("SKOLEM-W/O-DEFN");

    static private final SubLList $list_alt24 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*SKOLEM-W/O-DEFN-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*SKOLEM-W/O-DEFN-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*SKOLEM-W/O-DEFN-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("SKOLEM"), makeKeyword("KBI-LEVEL"), ONE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-SKOLEM-W/O-DEFN?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("SKOLEM-W/O-DEFN?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-SKOLEM-W/O-DEFN?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-SKOLEM-W/O-DEFN?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("TMS"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("STALE-DATA"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test SKOLEM fort for no cached definition") });

    static private final SubLString $str_alt25$_s_has_no_skolem_defn = makeString("~s has no skolem defn");

    static private final SubLSymbol $sym26$_SKOLEM_W_O_COMMON_NEG_LITS_RESULTS_ = makeSymbol("*SKOLEM-W/O-COMMON-NEG-LITS-RESULTS*");

    static private final SubLString $str_alt27$violators_of_kbi_module__SKOLEM_W = makeString("violators of kbi module :SKOLEM-W/O-COMMON-NEG-LITS");

    static private final SubLSymbol $sym28$_SKOLEM_W_O_COMMON_NEG_LITS_TIME_ = makeSymbol("*SKOLEM-W/O-COMMON-NEG-LITS-TIME*");

    static private final SubLString $str_alt29$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :SKOLEM-W/O-COMMON-NEG-LITS");

    static private final SubLSymbol $sym30$_SKOLEM_W_O_COMMON_NEG_LITS_COUNT_ = makeSymbol("*SKOLEM-W/O-COMMON-NEG-LITS-COUNT*");

    static private final SubLString $str_alt31$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :SKOLEM-W/O-COMMON-NEG-LITS");

    public static final SubLSymbol $kw32$SKOLEM_W_O_COMMON_NEG_LITS = makeKeyword("SKOLEM-W/O-COMMON-NEG-LITS");

    static private final SubLList $list_alt33 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*SKOLEM-W/O-COMMON-NEG-LITS-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*SKOLEM-W/O-COMMON-NEG-LITS-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*SKOLEM-W/O-COMMON-NEG-LITS-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("SKOLEM"), makeKeyword("KBI-LEVEL"), ONE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-SKOLEM-DEFN-DIVERGING-NEG-LITS"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("SKOLEM-W/O-COMMON-NEG-LITS?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-SKOLEM-W/O-COMMON-NEG-LITS?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-SKOLEM-W/O-COMMON-NEG-LITS?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("CONFLICT"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test SKOLEM fort for divergent defn neg-lits") });

    static private final SubLString $str_alt34$_s_has_multiple_neg_lits___a = makeString("~s has multiple neg-lits: ~a");



    static private final SubLString $str_alt36$__ = makeString(", ");

    static private final SubLString $str_alt37$__and_ = makeString(", and ");

    public static final SubLSymbol $skolem_assertions_in_multiple_mts_results$ = makeSymbol("*SKOLEM-ASSERTIONS-IN-MULTIPLE-MTS-RESULTS*");

    static private final SubLString $str_alt39$violators_of_kbi_module__SKOLEM_A = makeString("violators of kbi module :SKOLEM-ASSERTIONS-IN-MULTIPLE-MTS");

    public static final SubLSymbol $skolem_assertions_in_multiple_mts_time$ = makeSymbol("*SKOLEM-ASSERTIONS-IN-MULTIPLE-MTS-TIME*");

    static private final SubLString $str_alt41$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :SKOLEM-ASSERTIONS-IN-MULTIPLE-MTS");

    public static final SubLSymbol $skolem_assertions_in_multiple_mts_count$ = makeSymbol("*SKOLEM-ASSERTIONS-IN-MULTIPLE-MTS-COUNT*");

    static private final SubLString $str_alt43$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :SKOLEM-ASSERTIONS-IN-MULTIPLE-MTS");

    private static final SubLSymbol $SKOLEM_ASSERTIONS_IN_MULTIPLE_MTS = makeKeyword("SKOLEM-ASSERTIONS-IN-MULTIPLE-MTS");

    static private final SubLList $list_alt45 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*SKOLEM-ASSERTIONS-IN-MULTIPLE-MTS-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*SKOLEM-ASSERTIONS-IN-MULTIPLE-MTS-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*SKOLEM-ASSERTIONS-IN-MULTIPLE-MTS-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("SKOLEM"), makeKeyword("KBI-LEVEL"), ONE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-SKOLEM-ASSERTIONS-IN-MULTIPLE-MTS"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("SKOLEM-ASSERTIONS-IN-MULTIPLE-MTS?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-SKOLEM-ASSERTIONS-IN-MULTIPLE-MTS?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-SKOLEM-ASSERTIONS-IN-MULTIPLE-MTS?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("CONFLICT"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test SKOLEM fort for assertions in multiple mts") });

    static private final SubLString $str_alt46$_s_referenced_by_assertions_in_mu = makeString("~s referenced by assertions in multiple mts: ~a");



    static private final SubLSymbol $sym48$_SKOLEM_W_O_PROPER_FN_TYPE_RESULTS_ = makeSymbol("*SKOLEM-W/O-PROPER-FN-TYPE-RESULTS*");

    static private final SubLString $str_alt49$violators_of_kbi_module__SKOLEM_W = makeString("violators of kbi module :SKOLEM-W/O-PROPER-FN-TYPE");

    static private final SubLSymbol $sym50$_SKOLEM_W_O_PROPER_FN_TYPE_TIME_ = makeSymbol("*SKOLEM-W/O-PROPER-FN-TYPE-TIME*");

    static private final SubLString $str_alt51$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :SKOLEM-W/O-PROPER-FN-TYPE");

    static private final SubLSymbol $sym52$_SKOLEM_W_O_PROPER_FN_TYPE_COUNT_ = makeSymbol("*SKOLEM-W/O-PROPER-FN-TYPE-COUNT*");

    static private final SubLString $str_alt53$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :SKOLEM-W/O-PROPER-FN-TYPE");

    public static final SubLSymbol $kw54$SKOLEM_W_O_PROPER_FN_TYPE = makeKeyword("SKOLEM-W/O-PROPER-FN-TYPE");

    static private final SubLList $list_alt55 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*SKOLEM-W/O-PROPER-FN-TYPE-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*SKOLEM-W/O-PROPER-FN-TYPE-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*SKOLEM-W/O-PROPER-FN-TYPE-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("SKOLEM"), makeKeyword("KBI-LEVEL"), ONE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-SKOLEM-W/O-PROPER-FN-TYPE"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("SKOLEM-W/O-PROPER-FN-TYPE?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-SKOLEM-W/O-PROPER-FN-TYPE?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-SKOLEM-W/O-PROPER-FN-TYPE?"), makeKeyword("KBI-CONCERN-FOR"), $CODE, makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("CONFLICT"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test SKOLEM fort for incorrect skolem function type") });

    public static final SubLObject $$SkolemFunction = constant_handles.reader_make_constant_shell(makeString("SkolemFunction"));

    static private final SubLString $str_alt57$_s_has_unreified_spec__s__scalar_ = makeString("~s has unreified spec ~s: scalar arg w/o #$SkolemFuncN fn type");

    public static final SubLObject $$SkolemFuncN = constant_handles.reader_make_constant_shell(makeString("SkolemFuncN"));

    static private final SubLString $str_alt59$_s_has_unreified_spec__s____Skole = makeString("~s has unreified spec ~s: #$SkolemFuncN fn type w/o scalar arg");

    static private final SubLSymbol $sym60$_SKOLEM_W_O_PROPER_DEFN_VARS_RESULTS_ = makeSymbol("*SKOLEM-W/O-PROPER-DEFN-VARS-RESULTS*");

    static private final SubLString $str_alt61$violators_of_kbi_module__SKOLEM_W = makeString("violators of kbi module :SKOLEM-W/O-PROPER-DEFN-VARS");

    static private final SubLSymbol $sym62$_SKOLEM_W_O_PROPER_DEFN_VARS_TIME_ = makeSymbol("*SKOLEM-W/O-PROPER-DEFN-VARS-TIME*");

    static private final SubLString $str_alt63$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :SKOLEM-W/O-PROPER-DEFN-VARS");

    static private final SubLSymbol $sym64$_SKOLEM_W_O_PROPER_DEFN_VARS_COUNT_ = makeSymbol("*SKOLEM-W/O-PROPER-DEFN-VARS-COUNT*");

    static private final SubLString $str_alt65$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :SKOLEM-W/O-PROPER-DEFN-VARS");

    public static final SubLSymbol $kw66$SKOLEM_W_O_PROPER_DEFN_VARS = makeKeyword("SKOLEM-W/O-PROPER-DEFN-VARS");

    static private final SubLList $list_alt67 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*SKOLEM-W/O-PROPER-DEFN-VARS-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*SKOLEM-W/O-PROPER-DEFN-VARS-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*SKOLEM-W/O-PROPER-DEFN-VARS-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("SKOLEM"), makeKeyword("KBI-LEVEL"), ONE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-SKOLEM-W/O-PROPER-DEFN-VARS"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("SKOLEM-W/O-PROPER-DEFN-VARS?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-SKOLEM-W/O-PROPER-DEFN-VARS?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-SKOLEM-W/O-PROPER-DEFN-VARS?"), makeKeyword("KBI-CONCERN-FOR"), $CODE, makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("HL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("CONFLICT"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test SKOLEM fort for invalid vars in defn") });

    static private final SubLString $str_alt68$_s_defn_includes_non_el_vars___a = makeString("~s defn includes non-el vars: ~a");



    static private final SubLSymbol $sym70$_SKOLEM_W_O_UNIQUE_DEFN_RESULTS_ = makeSymbol("*SKOLEM-W/O-UNIQUE-DEFN-RESULTS*");

    static private final SubLString $str_alt71$violators_of_kbi_module__SKOLEM_W = makeString("violators of kbi module :SKOLEM-W/O-UNIQUE-DEFN");

    static private final SubLSymbol $sym72$_SKOLEM_W_O_UNIQUE_DEFN_TIME_ = makeSymbol("*SKOLEM-W/O-UNIQUE-DEFN-TIME*");

    static private final SubLString $str_alt73$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :SKOLEM-W/O-UNIQUE-DEFN");

    static private final SubLSymbol $sym74$_SKOLEM_W_O_UNIQUE_DEFN_COUNT_ = makeSymbol("*SKOLEM-W/O-UNIQUE-DEFN-COUNT*");

    static private final SubLString $str_alt75$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :SKOLEM-W/O-UNIQUE-DEFN");

    public static final SubLSymbol $kw76$SKOLEM_W_O_UNIQUE_DEFN = makeKeyword("SKOLEM-W/O-UNIQUE-DEFN");

    static private final SubLList $list_alt77 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*SKOLEM-W/O-UNIQUE-DEFN-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*SKOLEM-W/O-UNIQUE-DEFN-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*SKOLEM-W/O-UNIQUE-DEFN-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("SKOLEM"), makeKeyword("KBI-LEVEL"), ONE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-SKOLEM-DUPLICATES"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("SKOLEM-W/O-UNIQUE-DEFN?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-SKOLEM-W/O-UNIQUE-DEFN?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-SKOLEM-W/O-UNIQUE-DEFN?"), makeKeyword("KBI-CONCERN-FOR"), $CODE, makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("HL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("CONFLICT"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test SKOLEM fort for other skolems with same defn") });

    static private final SubLString $str_alt78$_s_defn_duplicates_defn_of___a = makeString("~s defn duplicates defn of: ~a");

    static private final SubLSymbol $sym79$_SKOLEM_W_STALE_DEFN_RESULTS_ = makeSymbol("*SKOLEM-W/STALE-DEFN-RESULTS*");

    static private final SubLString $str_alt80$violators_of_kbi_module__SKOLEM_W = makeString("violators of kbi module :SKOLEM-W/STALE-DEFN");

    static private final SubLSymbol $sym81$_SKOLEM_W_STALE_DEFN_TIME_ = makeSymbol("*SKOLEM-W/STALE-DEFN-TIME*");

    static private final SubLString $str_alt82$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :SKOLEM-W/STALE-DEFN");

    static private final SubLSymbol $sym83$_SKOLEM_W_STALE_DEFN_COUNT_ = makeSymbol("*SKOLEM-W/STALE-DEFN-COUNT*");

    static private final SubLString $str_alt84$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :SKOLEM-W/STALE-DEFN");

    public static final SubLSymbol $kw85$SKOLEM_W_STALE_DEFN = makeKeyword("SKOLEM-W/STALE-DEFN");

    static private final SubLList $list_alt86 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*SKOLEM-W/STALE-DEFN-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*SKOLEM-W/STALE-DEFN-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*SKOLEM-W/STALE-DEFN-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("SKOLEM"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-SKOLEM-DEFN/KB-MISMATCH"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("SKOLEM-W/STALE-DEFN?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-SKOLEM-W/STALE-DEFN?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-SKOLEM-W/STALE-DEFN?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("TMS"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("HL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("CONFLICT"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test SKOLEM fort for defn inaccord with kb") });

    static private final SubLString $str_alt87$ = makeString("");

    static private final SubLList $list_alt88 = list(makeSymbol("TYPE"), makeSymbol("OLD"), makeSymbol("NEW"));

    private static final SubLSymbol $SKOLEM_KEY_MISMATCH = makeKeyword("SKOLEM-KEY-MISMATCH");

    static private final SubLString $str_alt90$_s_key_is__a_but_should_be__a__ = makeString("~s key is ~a but should be ~a~%");

    private static final SubLSymbol $SKOLEM_DEFN_MISMATCH = makeKeyword("SKOLEM-DEFN-MISMATCH");

    static private final SubLString $str_alt92$_s_defns_axioms_are__a_but_should = makeString("~s defns axioms are ~a but should be ~a~%");

    public static final SubLSymbol $skolem_defn_not_wff_results$ = makeSymbol("*SKOLEM-DEFN-NOT-WFF-RESULTS*");

    static private final SubLString $str_alt94$violators_of_kbi_module__SKOLEM_D = makeString("violators of kbi module :SKOLEM-DEFN-NOT-WFF");

    public static final SubLSymbol $skolem_defn_not_wff_time$ = makeSymbol("*SKOLEM-DEFN-NOT-WFF-TIME*");

    static private final SubLString $str_alt96$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :SKOLEM-DEFN-NOT-WFF");

    public static final SubLSymbol $skolem_defn_not_wff_count$ = makeSymbol("*SKOLEM-DEFN-NOT-WFF-COUNT*");

    static private final SubLString $str_alt98$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :SKOLEM-DEFN-NOT-WFF");

    private static final SubLSymbol $SKOLEM_DEFN_NOT_WFF = makeKeyword("SKOLEM-DEFN-NOT-WFF");

    static private final SubLList $list_alt100 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*SKOLEM-DEFN-NOT-WFF-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*SKOLEM-DEFN-NOT-WFF-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*SKOLEM-DEFN-NOT-WFF-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("SKOLEM"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-SKOLEM-DEFN-NOT-WFF"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("KBI-SKOLEM-DEFN-NOT-WFF?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("KBI-WHY-SKOLEM-DEFN-NOT-WFF"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-SKOLEM-DEFN-NOT-WFF?"), makeKeyword("KBI-CONCERN-FOR"), $CODE, makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("HL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("CONFLICT"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test SKOLEM fort for non-wff defn") });

    static private final SubLList $list_alt101 = list(makeKeyword("SKOLEM-DEFN-MISSING"));

    private static final SubLSymbol $SKOLEM_DEFN_NOT_LIST = makeKeyword("SKOLEM-DEFN-NOT-LIST");

    private static final SubLSymbol $SKOLEM_DEFN_MAL_LENGTH = makeKeyword("SKOLEM-DEFN-MAL-LENGTH");

    static private final SubLList $list_alt104 = listS(makeSymbol("FIRST"), makeSymbol("&OPTIONAL"), makeSymbol("SECOND"), makeSymbol("THIRD"), makeSymbol("FOURTH"), makeSymbol("ORTS"));

    private static final SubLSymbol $SKOLEM_DEFN_ORTS = makeKeyword("SKOLEM-DEFN-ORTS");

    private static final SubLSymbol $SKOLEM_DEFN_MAL_SKOLEM_FORT = makeKeyword("SKOLEM-DEFN-MAL-SKOLEM-FORT");

    private static final SubLSymbol $SKOLEM_DEFN_MAL_UNREIFIED_FN_LENGTH = makeKeyword("SKOLEM-DEFN-MAL-UNREIFIED-FN-LENGTH");

    static private final SubLList $list_alt108 = list(makeSymbol("SKOLEM-FN-FUNCTION"), makeSymbol("ARGS"), makeSymbol("VAR"), makeSymbol("&OPTIONAL"), makeSymbol("NUMBER"));

    private static final SubLSymbol $SKOLEM_DEFN_MAL_SKOLEM_FN_TYPE = makeKeyword("SKOLEM-DEFN-MAL-SKOLEM-FN-TYPE");

    private static final SubLSymbol $SKOLEM_DEFN_MAL_SKOLEM_FN_ARGS = makeKeyword("SKOLEM-DEFN-MAL-SKOLEM-FN-ARGS");

    public static final SubLSymbol $kw111$SKOLEM_DEFN_ARGS_W_O_NUMBER = makeKeyword("SKOLEM-DEFN-ARGS-W/O-NUMBER");

    private static final SubLSymbol $SKOLEM_DEFN_NON_VAR_ARGS = makeKeyword("SKOLEM-DEFN-NON-VAR-ARGS");

    private static final SubLSymbol $SKOLEM_DEFN_MAL_SK_VAR = makeKeyword("SKOLEM-DEFN-MAL-SK-VAR");

    public static final SubLObject $$SkolemFuncNFn = constant_handles.reader_make_constant_shell(makeString("SkolemFuncNFn"));

    public static final SubLSymbol $kw115$SKOLEM_DEFN_ARGS_SK_TYPE_NUMBER_MISMATCH = makeKeyword("SKOLEM-DEFN-ARGS-SK-TYPE/NUMBER-MISMATCH");

    public static final SubLObject $$Unity = constant_handles.reader_make_constant_shell(makeString("Unity"));

    private static final SubLSymbol $SKOLEM_DEFN_OBSOLETE_NUMBER = makeKeyword("SKOLEM-DEFN-OBSOLETE-NUMBER");

    private static final SubLSymbol $SKOLEM_DEFN_MAL_MT = makeKeyword("SKOLEM-DEFN-MAL-MT");

    static private final SubLList $list_alt119 = list(makeKeyword("SKOLEM-DEFN-W/O-CLAUSES"));

    static private final SubLList $list_alt120 = list(makeSymbol("TYPE"), makeSymbol("&OPTIONAL"), makeSymbol("ARG1"), makeSymbol("ARG2"));

    private static final SubLSymbol $SKOLEM_DEFN_MISSING = makeKeyword("SKOLEM-DEFN-MISSING");

    static private final SubLString $str_alt122$skolem__s_has_no_defn__ = makeString("skolem ~s has no defn~%");

    static private final SubLString $str_alt123$skolem__s_has_atom_defn___s___ = makeString("skolem ~s has atom defn: ~s ~%");

    static private final SubLString $str_alt124$skolem__s_has_defn_with_length__s = makeString("skolem ~s has defn with length ~s: ~s ~%");

    static private final SubLString $str_alt125$skolem__s_has_defn_with_orts___s_ = makeString("skolem ~s has defn with orts: ~s ~%");

    static private final SubLString $str_alt126$skolem__s_is_not_a_valid_skolem__ = makeString("skolem ~s is not a valid skolem: ~s ~%");

    static private final SubLString $str_alt127$skolem__s_has_unreified_function_ = makeString("skolem ~s has unreified function term of invalid length: ~s ~%");

    static private final SubLString $str_alt128$skolem__s_has_invalid_skolem_type = makeString("skolem ~s has invalid skolem type: ~s ~%");

    static private final SubLString $str_alt129$skolem__s_has_invalid_skolem_args = makeString("skolem ~s has invalid skolem args: ~s ~%");

    static private final SubLString $str_alt130$skolem__s_args__s_missing_number_ = makeString("skolem ~s args ~s missing number ~s ~%");

    static private final SubLString $str_alt131$skolem__s_args_includes_non_el_va = makeString("skolem ~s args includes non-el-var: ~s ~%");

    static private final SubLString $str_alt132$skolem__s_var_is_not_valid___s___ = makeString("skolem ~s var is not valid: ~s ~%");

    static private final SubLString $str_alt133$skolem__s_type__s_does_not_match_ = makeString("skolem ~s type ~s does not match number: ~s ~%");

    static private final SubLString $str_alt134$skolem__s_number_is_not_valid___s = makeString("skolem ~s number is not valid: ~s ~%");

    static private final SubLString $str_alt135$skolem__s_mt_is_not_valid___s___ = makeString("skolem ~s mt is not valid: ~s ~%");

    public static final SubLSymbol $kw136$SKOLEM_DEFN_W_O_CLAUSES = makeKeyword("SKOLEM-DEFN-W/O-CLAUSES");

    static private final SubLString $str_alt137$skolem__s_defn_has_no_clauses___ = makeString("skolem ~s defn has no clauses ~%");

    public static final SubLSymbol $skolem_referenced_by_holds_in_results$ = makeSymbol("*SKOLEM-REFERENCED-BY-HOLDS-IN-RESULTS*");

    static private final SubLString $str_alt139$violators_of_kbi_module__SKOLEM_R = makeString("violators of kbi module :SKOLEM-REFERENCED-BY-HOLDS-IN");

    public static final SubLSymbol $skolem_referenced_by_holds_in_time$ = makeSymbol("*SKOLEM-REFERENCED-BY-HOLDS-IN-TIME*");

    static private final SubLString $str_alt141$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :SKOLEM-REFERENCED-BY-HOLDS-IN");

    public static final SubLSymbol $skolem_referenced_by_holds_in_count$ = makeSymbol("*SKOLEM-REFERENCED-BY-HOLDS-IN-COUNT*");

    static private final SubLString $str_alt143$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :SKOLEM-REFERENCED-BY-HOLDS-IN");

    private static final SubLSymbol $SKOLEM_REFERENCED_BY_HOLDS_IN = makeKeyword("SKOLEM-REFERENCED-BY-HOLDS-IN");

    static private final SubLList $list_alt145 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*SKOLEM-REFERENCED-BY-HOLDS-IN-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*SKOLEM-REFERENCED-BY-HOLDS-IN-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*SKOLEM-REFERENCED-BY-HOLDS-IN-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("SKOLEM"), makeKeyword("KBI-LEVEL"), ONE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-SKOLEM-REFERENCED-BY-HOLDS-IN"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("SKOLEM-REFERENCED-BY-HOLDS-IN?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-SKOLEM-REFERENCED-BY-HOLDS-IN?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-SKOLEM-REFERENCED-BY-HOLDS-IN?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("STYLE"), makeKeyword("KBI-RESULT-TYPE"), $WARN, makeKeyword("KBI-DOC"), makeString("test SKOLEM fort for reference within #$holdsIn") });

    static private final SubLString $str_alt146$_s_referenced_within___holdsIn_in = makeString("~s referenced within #$holdsIn in defn cnf: ~a");

    static private final SubLSymbol $sym147$HOLDS_IN_LIT_ = makeSymbol("HOLDS-IN-LIT?");

    public static final SubLSymbol $skolem_with_multiple_vars_results$ = makeSymbol("*SKOLEM-WITH-MULTIPLE-VARS-RESULTS*");

    static private final SubLString $str_alt149$violators_of_kbi_module__SKOLEM_W = makeString("violators of kbi module :SKOLEM-WITH-MULTIPLE-VARS");

    public static final SubLSymbol $skolem_with_multiple_vars_time$ = makeSymbol("*SKOLEM-WITH-MULTIPLE-VARS-TIME*");

    static private final SubLString $str_alt151$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :SKOLEM-WITH-MULTIPLE-VARS");

    public static final SubLSymbol $skolem_with_multiple_vars_count$ = makeSymbol("*SKOLEM-WITH-MULTIPLE-VARS-COUNT*");

    static private final SubLString $str_alt153$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :SKOLEM-WITH-MULTIPLE-VARS");

    private static final SubLSymbol $SKOLEM_WITH_MULTIPLE_VARS = makeKeyword("SKOLEM-WITH-MULTIPLE-VARS");

    static private final SubLList $list_alt155 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*SKOLEM-WITH-MULTIPLE-VARS-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*SKOLEM-WITH-MULTIPLE-VARS-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*SKOLEM-WITH-MULTIPLE-VARS-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("SKOLEM"), makeKeyword("KBI-LEVEL"), ONE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-SKOLEM-WITH-MULTIPLE-VARS"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("SKOLEM-WITH-MULTIPLE-VARS?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-SKOLEM-WITH-MULTIPLE-VARS?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-SKOLEM-WITH-MULTIPLE-VARS?"), makeKeyword("KBI-CONCERN-FOR"), $CODE, makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("HL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("CONFLICT"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test skolem-function fort for assertions referencing use multiple vars") });

    static private final SubLString $str_alt156$_s_referenced_in_assertions_by_mu = makeString("~s referenced in assertions by multiple vars: ~a");

    static private final SubLString $str_alt157$_and_ = makeString(" and ");

    static private final SubLSymbol $sym158$_SKOLEM_W_EXTRA_ARGS_RESULTS_ = makeSymbol("*SKOLEM-W/EXTRA-ARGS-RESULTS*");

    static private final SubLString $str_alt159$violators_of_kbi_module__SKOLEM_W = makeString("violators of kbi module :SKOLEM-W/EXTRA-ARGS");

    static private final SubLSymbol $sym160$_SKOLEM_W_EXTRA_ARGS_TIME_ = makeSymbol("*SKOLEM-W/EXTRA-ARGS-TIME*");

    static private final SubLString $str_alt161$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :SKOLEM-W/EXTRA-ARGS");

    static private final SubLSymbol $sym162$_SKOLEM_W_EXTRA_ARGS_COUNT_ = makeSymbol("*SKOLEM-W/EXTRA-ARGS-COUNT*");

    static private final SubLString $str_alt163$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :SKOLEM-W/EXTRA-ARGS");

    public static final SubLSymbol $kw164$SKOLEM_W_EXTRA_ARGS = makeKeyword("SKOLEM-W/EXTRA-ARGS");

    static private final SubLList $list_alt165 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*SKOLEM-W/EXTRA-ARGS-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*SKOLEM-W/EXTRA-ARGS-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*SKOLEM-W/EXTRA-ARGS-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("SKOLEM"), makeKeyword("KBI-LEVEL"), THREE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-EXTRA-ARGS-OF-SKOLEM"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("SKOLEM-W/EXTRA-ARGS?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-SKOLEM-W/EXTRA-ARGS?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-SKOLEM-W/EXTRA-ARGS?"), makeKeyword("KBI-CONCERN-FOR"), $CODE, makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("HL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("BUG"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test SKOLEM fort for extraneous args (e.g., no pos-lits relate the skolem to the arg)") });

    static private final SubLString $str_alt166$_s_has_extraneous_args___a = makeString("~s has extraneous args: ~a");

    static private final SubLSymbol $sym167$STRING_ = makeSymbol("STRING=");

    // // Initializers
    public void declareFunctions() {
        declare_kbi_skolem_file();
    }

    public void initializeVariables() {
        init_kbi_skolem_file();
    }

    public void runTopLevelForms() {
        setup_kbi_skolem_file();
    }
}

