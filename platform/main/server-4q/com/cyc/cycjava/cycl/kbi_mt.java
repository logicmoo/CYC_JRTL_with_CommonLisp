/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
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
 *  module:      KBI-MT
 *  source file: /cyc/top/cycl/kbi-mt.lisp
 *  created:     2019/07/03 17:39:05
 */
public final class kbi_mt extends SubLTranslatedFile implements V02 {
    // // Constructor
    private kbi_mt() {
    }

    public static final SubLFile me = new kbi_mt();


    // // Definitions
    public static final SubLObject diagnose_qua_mt(SubLObject mt) {
        return kbi_utilities.diagnose_qua_sub_domains(mt, $MT);
    }







    /**
     * test MT fort for missing from mts fort cache
     */
    public static final SubLObject mt_not_cachedP(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($MT_NOT_CACHED)) && (NIL != kbi_utilities.kbi_applies_toP($MT_NOT_CACHED, mt))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($MT_NOT_CACHED);
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
                                                        kbi_mt_not_cachedP(mt);
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
                    kbi_utilities.kbi_increment_time($MT_NOT_CACHED, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :MT-NOT-CACHED applies to MT
     */
    public static final SubLObject why_mt_not_cachedP(SubLObject mt, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($MT_NOT_CACHED, mt)) {
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
                                                    kbi_mt_not_cachedP(mt);
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
                                return list($MT_NOT_CACHED, mt, data);
                            } else {
                                return list($MT_NOT_CACHED, mt);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_mt_not_cachedP(mt, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_mt_not_cachedP(SubLObject mt, SubLObject data) {
        return format(NIL, $str_alt14$_s_is_not_among_the_cached_microt, mt);
    }

    public static final SubLObject kbi_mt_not_cachedP(SubLObject mt) {
        if (NIL == fort_types_interface.mt_in_any_mtP(mt)) {
            kbi_utilities.add_kbi_result(mt);
        }
        return kbi_utilities.kbi_result();
    }

    // defparameter
    public static final SubLSymbol $mt_genl_sbhlXkb_mismatch_repairs$ = makeSymbol("*MT-GENL-SBHL/KB-MISMATCH-REPAIRS*");

    // defparameter
    public static final SubLSymbol $mt_genl_sbhlXkb_mismatch_results$ = makeSymbol("*MT-GENL-SBHL/KB-MISMATCH-RESULTS*");

    // defparameter
    public static final SubLSymbol $mt_genl_sbhlXkb_mismatch_time$ = makeSymbol("*MT-GENL-SBHL/KB-MISMATCH-TIME*");

    // defparameter
    public static final SubLSymbol $mt_genl_sbhlXkb_mismatch_count$ = makeSymbol("*MT-GENL-SBHL/KB-MISMATCH-COUNT*");

    /**
     * test MT for mismatches between sbhl genls links and kb #$genlMt assertions
     */
    public static final SubLObject mt_genl_sbhlXkb_mismatchP(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw23$MT_GENL_SBHL_KB_MISMATCH)) && (NIL != kbi_utilities.kbi_applies_toP($kw23$MT_GENL_SBHL_KB_MISMATCH, mt))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw23$MT_GENL_SBHL_KB_MISMATCH);
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
                                                        kbi_mt_genl_sbhlXkb_mismatches(mt);
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
                    kbi_utilities.kbi_increment_time($kw23$MT_GENL_SBHL_KB_MISMATCH, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :MT-GENL-SBHL/KB-MISMATCH applies to MT
     */
    public static final SubLObject why_mt_genl_sbhlXkb_mismatchP(SubLObject mt, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw23$MT_GENL_SBHL_KB_MISMATCH, mt)) {
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
                                                    kbi_mt_genl_sbhlXkb_mismatches(mt);
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
                                return list($kw23$MT_GENL_SBHL_KB_MISMATCH, mt, data);
                            } else {
                                return list($kw23$MT_GENL_SBHL_KB_MISMATCH, mt);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_mt_genl_sbhlXkb_mismatchP(mt, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_mt_genl_sbhlXkb_mismatchP(SubLObject mt, SubLObject data) {
        {
            SubLObject nl_result = $str_alt25$;
            SubLObject cdolist_list_var = data;
            SubLObject mismatchXnodeXmtXsbhl_modeXtruthXinverseP = NIL;
            for (mismatchXnodeXmtXsbhl_modeXtruthXinverseP = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mismatchXnodeXmtXsbhl_modeXtruthXinverseP = cdolist_list_var.first()) {
                {
                    SubLObject datum = mismatchXnodeXmtXsbhl_modeXtruthXinverseP;
                    SubLObject current = datum;
                    SubLObject mismatch = NIL;
                    SubLObject genl = NIL;
                    SubLObject mt_mt = NIL;
                    SubLObject sbhl_mode = NIL;
                    SubLObject truth = NIL;
                    SubLObject inverse = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt26);
                    mismatch = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt26);
                    genl = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt26);
                    mt_mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt26);
                    sbhl_mode = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt26);
                    truth = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt26);
                    inverse = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject formula = NIL;
                            SubLObject assignment = NIL;
                            {
                                SubLObject pcase_var = truth;
                                if (pcase_var.eql($TRUE)) {
                                    formula = format(NIL, $str_alt28$___genlMt__s__s_, mt, genl);
                                } else
                                    if (pcase_var.eql($FALSE)) {
                                        formula = format(NIL, $str_alt30$___not____genlMt__s__s__, mt, genl);
                                    }

                            }
                            {
                                SubLObject pcase_var = mismatch;
                                if (pcase_var.eql($kw31$SBHL_KB_)) {
                                    assignment = $$$true_in_kb_but_not_sbhl;
                                } else
                                    if (pcase_var.eql($kw33$SBHL_KB_)) {
                                        assignment = $$$true_in_sbhl_but_not_kb;
                                    }

                            }
                            nl_result = cconcatenate(nl_result, format(NIL, $str_alt35$_____ist__s__a___a, new SubLObject[]{ mt_mt, formula, assignment }));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt26);
                    }
                }
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_mt_genl_sbhlXkb_mismatches(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != fort_types_interface.mt_in_any_mtP(mt)) {
                {
                    SubLObject _prev_bind_0 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                    try {
                        system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                        accessed_sbhlXkb_mismatch_in_mtP($$genlMt, mt, genl_mts.asserted_genl_mts(mt, mt_vars.$mt_mt$.getGlobalValue()), mt_vars.$mt_mt$.getGlobalValue());
                        if (NIL == kbi_utilities.kbi_doneP(UNPROVIDED)) {
                            not_accessed_sbhlXkb_mismatch_in_mtP($$genlMt, mt, genl_mts.asserted_not_genl_mts(mt, mt_vars.$mt_mt$.getGlobalValue()), mt_vars.$mt_mt$.getGlobalValue());
                        }
                    } finally {
                        system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return kbi_utilities.kbi_result();
        }
    }

    public static final SubLObject accessed_sbhlXkb_mismatch_in_mtP(SubLObject module, SubLObject fort, SubLObject asserted_accessed, SubLObject mt) {
        return NIL;
    }

    public static final SubLObject not_accessed_sbhlXkb_mismatch_in_mtP(SubLObject module, SubLObject fort, SubLObject asserted_not_accessed, SubLObject mt) {
        return NIL;
    }

    // defparameter
    public static final SubLSymbol $mt_wXduplicate_ist_results$ = makeSymbol("*MT-W/DUPLICATE-IST-RESULTS*");

    // defparameter
    public static final SubLSymbol $mt_wXduplicate_ist_time$ = makeSymbol("*MT-W/DUPLICATE-IST-TIME*");

    // defparameter
    public static final SubLSymbol $mt_wXduplicate_ist_count$ = makeSymbol("*MT-W/DUPLICATE-IST-COUNT*");

    /**
     * test MT fort for duplicate #$ist assertions
     */
    public static final SubLObject mt_wXduplicate_istP(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw43$MT_W_DUPLICATE_IST)) && (NIL != kbi_utilities.kbi_applies_toP($kw43$MT_W_DUPLICATE_IST, mt))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw43$MT_W_DUPLICATE_IST);
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
                                                        kbi_mt_wXduplicate_istP(mt);
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
                    kbi_utilities.kbi_increment_time($kw43$MT_W_DUPLICATE_IST, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :MT-W/DUPLICATE-IST applies to MT
     */
    public static final SubLObject why_mt_wXduplicate_istP(SubLObject mt, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw43$MT_W_DUPLICATE_IST, mt)) {
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
                                                    kbi_mt_wXduplicate_istP(mt);
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
                                return list($kw43$MT_W_DUPLICATE_IST, mt, data);
                            } else {
                                return list($kw43$MT_W_DUPLICATE_IST, mt);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_mt_wXduplicate_istP(mt, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_mt_wXduplicate_istP(SubLObject mt) {
        return kbi_utilities.kbi_cached_duplicates(kb_mapping.gather_mt_index(mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject kbi_nl_why_mt_wXduplicate_istP(SubLObject mt, SubLObject data) {
        return format(NIL, $str_alt45$_s___ist_includes__s_duplicates__, new SubLObject[]{ mt, length(data), length(data).numG(THREE_INTEGER) ? ((SubLObject) (cconcatenate(string_utilities.stringify_items(list_utilities.first_n(THREE_INTEGER, data), symbol_function(STR), $str_alt47$__, UNPROVIDED), format(NIL, $str_alt48$_____so_see_them_all_use__show_me, mt)))) : string_utilities.stringify_items(data, symbol_function(STR), $str_alt47$__, $str_alt49$__and_) });
    }

    // defparameter
    public static final SubLSymbol $mt_wXo_ist_results$ = makeSymbol("*MT-W/O-IST-RESULTS*");

    // defparameter
    public static final SubLSymbol $mt_wXo_ist_time$ = makeSymbol("*MT-W/O-IST-TIME*");

    // defparameter
    public static final SubLSymbol $mt_wXo_ist_count$ = makeSymbol("*MT-W/O-IST-COUNT*");

    /**
     * test mt fort for no #$ist assertions
     */
    public static final SubLObject mt_wXo_istP(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw56$MT_W_O_IST)) && (NIL != kbi_utilities.kbi_applies_toP($kw56$MT_W_O_IST, mt))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw56$MT_W_O_IST);
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
                                                        kbi_mt_wXo_istP(mt);
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
                    kbi_utilities.kbi_increment_time($kw56$MT_W_O_IST, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :MT-W/O-IST applies to MT
     */
    public static final SubLObject why_mt_wXo_istP(SubLObject mt, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw56$MT_W_O_IST, mt)) {
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
                                                    kbi_mt_wXo_istP(mt);
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
                                return list($kw56$MT_W_O_IST, mt, data);
                            } else {
                                return list($kw56$MT_W_O_IST, mt);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_mt_wXo_istP(mt, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_mt_wXo_istP(SubLObject mt) {
        if (!(kb_indexing.num_mt_index(mt).numG(ZERO_INTEGER) || (NIL != kb_indexing.broad_mtP(mt)))) {
            kbi_utilities.set_kbi_result(mt);
        }
        return kbi_utilities.kbi_result();
    }

    public static final SubLObject kbi_nl_why_mt_wXo_istP(SubLObject mt, SubLObject data) {
        return format(NIL, $str_alt58$_s_is_not_a___BroadMicrothery_and, mt);
    }







    /**
     * test MT for #$isa #$Microtheory in improper mt
     */
    public static final SubLObject mt_in_wrong_mtP(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($MT_IN_WRONG_MT)) && (NIL != kbi_utilities.kbi_applies_toP($MT_IN_WRONG_MT, mt))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($MT_IN_WRONG_MT);
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
                                            SubLObject _prev_bind_0_17 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_mt_in_wrong_mts(mt);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
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
                                kbi_macros.$kbi_result$.rebind(_prev_bind_2, thread);
                                kbi_macros.$kbi_booleanP$.rebind(_prev_bind_1, thread);
                                kbi_macros.$kbi_doneP_fn$.rebind(_prev_bind_0, thread);
                            }
                        }
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    kbi_utilities.kbi_increment_time($MT_IN_WRONG_MT, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :MT-IN-WRONG-MT applies to MT
     */
    public static final SubLObject why_mt_in_wrong_mtP(SubLObject mt, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($MT_IN_WRONG_MT, mt)) {
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
                                        SubLObject _prev_bind_0_19 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_mt_in_wrong_mts(mt);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_20, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_19, thread);
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
                                return list($MT_IN_WRONG_MT, mt, data);
                            } else {
                                return list($MT_IN_WRONG_MT, mt);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_mt_in_wrong_mtP(mt, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_mt_in_wrong_mtP(SubLObject mt, SubLObject data) {
        return format(NIL, $str_alt67$_s___isa___Microtheory_in__a__but, new SubLObject[]{ mt, string_utilities.stringify_items(data, symbol_function(STR), $str_alt47$__, $str_alt49$__and_), mt_vars.$mt_mt$.getGlobalValue() });
    }

    public static final SubLObject kbi_mt_in_wrong_mts(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject doneP = NIL;
                if (NIL == fort_types_interface.mtP(mt)) {
                    {
                        SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        SubLObject _prev_bind_1 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                        try {
                            sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$genlMt) ? ((SubLObject) (sbhl_module_vars.get_sbhl_module($$genlMt))) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module($$genlMt)), thread);
                            {
                                SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(mt, sbhl_module_vars.get_sbhl_module($$genlMt));
                                if (NIL != d_link) {
                                    {
                                        SubLObject rest = NIL;
                                        for (rest = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module($$genlMt)); !((NIL != doneP) || (NIL == rest)); rest = rest.rest()) {
                                            {
                                                SubLObject direction = rest.first();
                                                SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module($$genlMt));
                                                if (NIL != mt_links) {
                                                    if (NIL != sbhl_module_utilities.sbhl_forward_direction_for_module_p(direction, sbhl_module_vars.get_sbhl_module($$genlMt))) {
                                                        {
                                                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                            while (!((NIL != doneP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                thread.resetMultipleValues();
                                                                {
                                                                    SubLObject link_mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != sbhl_links.any_sbhl_true_link_nodes_p(tv_links)) {
                                                                        if (!link_mt.eql(mt_vars.$mt_mt$.getGlobalValue())) {
                                                                            kbi_utilities.add_kbi_result(link_mt);
                                                                            doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                                                        }
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
                        } finally {
                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1, thread);
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return kbi_utilities.kbi_result();
            }
        }
    }

    public static final SubLObject declare_kbi_mt_file() {
        declareFunction("diagnose_qua_mt", "DIAGNOSE-QUA-MT", 1, 0, false);
        declareFunction("mt_not_cachedP", "MT-NOT-CACHED?", 1, 0, false);
        declareFunction("why_mt_not_cachedP", "WHY-MT-NOT-CACHED?", 1, 1, false);
        declareFunction("kbi_nl_why_mt_not_cachedP", "KBI-NL-WHY-MT-NOT-CACHED?", 2, 0, false);
        declareFunction("kbi_mt_not_cachedP", "KBI-MT-NOT-CACHED?", 1, 0, false);
        declareFunction("mt_genl_sbhlXkb_mismatchP", "MT-GENL-SBHL/KB-MISMATCH?", 1, 0, false);
        declareFunction("why_mt_genl_sbhlXkb_mismatchP", "WHY-MT-GENL-SBHL/KB-MISMATCH?", 1, 1, false);
        declareFunction("kbi_nl_why_mt_genl_sbhlXkb_mismatchP", "KBI-NL-WHY-MT-GENL-SBHL/KB-MISMATCH?", 2, 0, false);
        declareFunction("kbi_mt_genl_sbhlXkb_mismatches", "KBI-MT-GENL-SBHL/KB-MISMATCHES", 1, 0, false);
        declareFunction("accessed_sbhlXkb_mismatch_in_mtP", "ACCESSED-SBHL/KB-MISMATCH-IN-MT?", 4, 0, false);
        declareFunction("not_accessed_sbhlXkb_mismatch_in_mtP", "NOT-ACCESSED-SBHL/KB-MISMATCH-IN-MT?", 4, 0, false);
        declareFunction("mt_wXduplicate_istP", "MT-W/DUPLICATE-IST?", 1, 0, false);
        declareFunction("why_mt_wXduplicate_istP", "WHY-MT-W/DUPLICATE-IST?", 1, 1, false);
        declareFunction("kbi_mt_wXduplicate_istP", "KBI-MT-W/DUPLICATE-IST?", 1, 0, false);
        declareFunction("kbi_nl_why_mt_wXduplicate_istP", "KBI-NL-WHY-MT-W/DUPLICATE-IST?", 2, 0, false);
        declareFunction("mt_wXo_istP", "MT-W/O-IST?", 1, 0, false);
        declareFunction("why_mt_wXo_istP", "WHY-MT-W/O-IST?", 1, 1, false);
        declareFunction("kbi_mt_wXo_istP", "KBI-MT-W/O-IST?", 1, 0, false);
        declareFunction("kbi_nl_why_mt_wXo_istP", "KBI-NL-WHY-MT-W/O-IST?", 2, 0, false);
        declareFunction("mt_in_wrong_mtP", "MT-IN-WRONG-MT?", 1, 0, false);
        declareFunction("why_mt_in_wrong_mtP", "WHY-MT-IN-WRONG-MT?", 1, 1, false);
        declareFunction("kbi_nl_why_mt_in_wrong_mtP", "KBI-NL-WHY-MT-IN-WRONG-MT?", 2, 0, false);
        declareFunction("kbi_mt_in_wrong_mts", "KBI-MT-IN-WRONG-MTS", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_kbi_mt_file() {
        defparameter("*MT-NOT-CACHED-RESULTS*", NIL);
        defparameter("*MT-NOT-CACHED-TIME*", ZERO_INTEGER);
        defparameter("*MT-NOT-CACHED-COUNT*", ZERO_INTEGER);
        defparameter("*MT-GENL-SBHL/KB-MISMATCH-REPAIRS*", NIL);
        defparameter("*MT-GENL-SBHL/KB-MISMATCH-RESULTS*", NIL);
        defparameter("*MT-GENL-SBHL/KB-MISMATCH-TIME*", ZERO_INTEGER);
        defparameter("*MT-GENL-SBHL/KB-MISMATCH-COUNT*", ZERO_INTEGER);
        defparameter("*MT-W/DUPLICATE-IST-RESULTS*", NIL);
        defparameter("*MT-W/DUPLICATE-IST-TIME*", ZERO_INTEGER);
        defparameter("*MT-W/DUPLICATE-IST-COUNT*", ZERO_INTEGER);
        defparameter("*MT-W/O-IST-RESULTS*", NIL);
        defparameter("*MT-W/O-IST-TIME*", ZERO_INTEGER);
        defparameter("*MT-W/O-IST-COUNT*", ZERO_INTEGER);
        defparameter("*MT-IN-WRONG-MT-RESULTS*", NIL);
        defparameter("*MT-IN-WRONG-MT-TIME*", ZERO_INTEGER);
        defparameter("*MT-IN-WRONG-MT-COUNT*", ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject setup_kbi_mt_file() {
                {
            SubLObject item_var = $mt_not_cached_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($mt_not_cached_results$, $str_alt2$violators_of_kbi_module__MT_NOT_C);
        {
            SubLObject item_var = $mt_not_cached_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($mt_not_cached_time$, $str_alt4$run_time_of_predicate_application);
        {
            SubLObject item_var = $mt_not_cached_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($mt_not_cached_count$, $str_alt6$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($MT_NOT_CACHED, $list_alt13);
        {
            SubLObject item_var = $sym15$_MT_GENL_SBHL_KB_MISMATCH_REPAIRS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym15$_MT_GENL_SBHL_KB_MISMATCH_REPAIRS_, $str_alt16$repaired_violators_of_kbi_module_);
        {
            SubLObject item_var = $sym17$_MT_GENL_SBHL_KB_MISMATCH_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym17$_MT_GENL_SBHL_KB_MISMATCH_RESULTS_, $str_alt18$violators_of_kbi_module__MT_GENL_);
        {
            SubLObject item_var = $sym19$_MT_GENL_SBHL_KB_MISMATCH_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym19$_MT_GENL_SBHL_KB_MISMATCH_TIME_, $str_alt20$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym21$_MT_GENL_SBHL_KB_MISMATCH_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym21$_MT_GENL_SBHL_KB_MISMATCH_COUNT_, $str_alt22$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw23$MT_GENL_SBHL_KB_MISMATCH, $list_alt24);
        {
            SubLObject item_var = $sym37$_MT_W_DUPLICATE_IST_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym37$_MT_W_DUPLICATE_IST_RESULTS_, $str_alt38$violators_of_kbi_module__MT_W_DUP);
        {
            SubLObject item_var = $sym39$_MT_W_DUPLICATE_IST_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym39$_MT_W_DUPLICATE_IST_TIME_, $str_alt40$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym41$_MT_W_DUPLICATE_IST_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym41$_MT_W_DUPLICATE_IST_COUNT_, $str_alt42$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw43$MT_W_DUPLICATE_IST, $list_alt44);
        {
            SubLObject item_var = $sym50$_MT_W_O_IST_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym50$_MT_W_O_IST_RESULTS_, $str_alt51$violators_of_kbi_module__MT_W_O_I);
        {
            SubLObject item_var = $sym52$_MT_W_O_IST_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym52$_MT_W_O_IST_TIME_, $str_alt53$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym54$_MT_W_O_IST_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym54$_MT_W_O_IST_COUNT_, $str_alt55$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw56$MT_W_O_IST, $list_alt57);
        {
            SubLObject item_var = $mt_in_wrong_mt_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($mt_in_wrong_mt_results$, $str_alt60$violators_of_kbi_module__MT_IN_WR);
        {
            SubLObject item_var = $mt_in_wrong_mt_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($mt_in_wrong_mt_time$, $str_alt62$run_time_of_predicate_application);
        {
            SubLObject item_var = $mt_in_wrong_mt_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($mt_in_wrong_mt_count$, $str_alt64$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($MT_IN_WRONG_MT, $list_alt66);
        return NIL;
    }



    public static final SubLSymbol $mt_not_cached_results$ = makeSymbol("*MT-NOT-CACHED-RESULTS*");

    static private final SubLString $str_alt2$violators_of_kbi_module__MT_NOT_C = makeString("violators of kbi module :MT-NOT-CACHED");

    public static final SubLSymbol $mt_not_cached_time$ = makeSymbol("*MT-NOT-CACHED-TIME*");

    static private final SubLString $str_alt4$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :MT-NOT-CACHED");

    public static final SubLSymbol $mt_not_cached_count$ = makeSymbol("*MT-NOT-CACHED-COUNT*");

    static private final SubLString $str_alt6$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :MT-NOT-CACHED");

    private static final SubLSymbol $MT_NOT_CACHED = makeKeyword("MT-NOT-CACHED");





    private static final SubLSymbol $KBI_ERROR = makeKeyword("KBI-ERROR");





    static private final SubLList $list_alt13 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*MT-NOT-CACHED-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*MT-NOT-CACHED-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*MT-NOT-CACHED-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("MT"), makeKeyword("KBI-LEVEL"), ONE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-MT-NOT-CACHED?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("MT-NOT-CACHED?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-MT-NOT-CACHED?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-MT-NOT-CACHED?"), makeKeyword("KBI-CONCERN-FOR"), $CODE, makeKeyword("KBI-CONCERN-LEVEL"), $SBHL, makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("GAP"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test MT fort for missing from mts fort cache") });

    static private final SubLString $str_alt14$_s_is_not_among_the_cached_microt = makeString("~s is not among the cached microtheories");

    static private final SubLSymbol $sym15$_MT_GENL_SBHL_KB_MISMATCH_REPAIRS_ = makeSymbol("*MT-GENL-SBHL/KB-MISMATCH-REPAIRS*");

    static private final SubLString $str_alt16$repaired_violators_of_kbi_module_ = makeString("repaired violators of kbi module :MT-GENL-SBHL/KB-MISMATCH");

    static private final SubLSymbol $sym17$_MT_GENL_SBHL_KB_MISMATCH_RESULTS_ = makeSymbol("*MT-GENL-SBHL/KB-MISMATCH-RESULTS*");

    static private final SubLString $str_alt18$violators_of_kbi_module__MT_GENL_ = makeString("violators of kbi module :MT-GENL-SBHL/KB-MISMATCH");

    static private final SubLSymbol $sym19$_MT_GENL_SBHL_KB_MISMATCH_TIME_ = makeSymbol("*MT-GENL-SBHL/KB-MISMATCH-TIME*");

    static private final SubLString $str_alt20$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :MT-GENL-SBHL/KB-MISMATCH");

    static private final SubLSymbol $sym21$_MT_GENL_SBHL_KB_MISMATCH_COUNT_ = makeSymbol("*MT-GENL-SBHL/KB-MISMATCH-COUNT*");

    static private final SubLString $str_alt22$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :MT-GENL-SBHL/KB-MISMATCH");

    public static final SubLSymbol $kw23$MT_GENL_SBHL_KB_MISMATCH = makeKeyword("MT-GENL-SBHL/KB-MISMATCH");

    static private final SubLList $list_alt24 = list(new SubLObject[]{ makeKeyword("KBI-REPAIR-CACHE"), makeSymbol("*MT-GENL-SBHL/KB-MISMATCH-REPAIRS*"), makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*MT-GENL-SBHL/KB-MISMATCH-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*MT-GENL-SBHL/KB-MISMATCH-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*MT-GENL-SBHL/KB-MISMATCH-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("MT"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-MT-GENL-SBHL/KB-MISMATCHES"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("MT-GENL-SBHL/KB-MISMATCH?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-MT-GENL-SBHL/KB-MISMATCH?"), makeKeyword("KBI-REPAIR-FN"), makeSymbol("RESET-MTS-LINKS"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-MT-GENL-SBHL/KB-MISMATCH?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("TMS"), makeKeyword("KBI-CONCERN-LEVEL"), $SBHL, makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("CONFLICT"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test MT for mismatches between sbhl genls links and kb #$genlMt assertions") });

    static private final SubLString $str_alt25$ = makeString("");

    static private final SubLList $list_alt26 = list(makeSymbol("MISMATCH"), makeSymbol("GENL"), makeSymbol("MT-MT"), makeSymbol("SBHL-MODE"), makeSymbol("TRUTH"), makeSymbol("INVERSE"));



    static private final SubLString $str_alt28$___genlMt__s__s_ = makeString("(#$genlMt ~s ~s)");



    static private final SubLString $str_alt30$___not____genlMt__s__s__ = makeString("(#$not (#$genlMt ~s ~s))");

    public static final SubLSymbol $kw31$SBHL_KB_ = makeKeyword("SBHL-KB+");

    static private final SubLString $$$true_in_kb_but_not_sbhl = makeString("true in kb but not sbhl");

    public static final SubLSymbol $kw33$SBHL_KB_ = makeKeyword("SBHL+KB-");

    static private final SubLString $$$true_in_sbhl_but_not_kb = makeString("true in sbhl but not kb");

    static private final SubLString $str_alt35$_____ist__s__a___a = makeString("~%(#$ist ~s ~a) ~a");

    public static final SubLObject $$genlMt = constant_handles.reader_make_constant_shell(makeString("genlMt"));

    static private final SubLSymbol $sym37$_MT_W_DUPLICATE_IST_RESULTS_ = makeSymbol("*MT-W/DUPLICATE-IST-RESULTS*");

    static private final SubLString $str_alt38$violators_of_kbi_module__MT_W_DUP = makeString("violators of kbi module :MT-W/DUPLICATE-IST");

    static private final SubLSymbol $sym39$_MT_W_DUPLICATE_IST_TIME_ = makeSymbol("*MT-W/DUPLICATE-IST-TIME*");

    static private final SubLString $str_alt40$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :MT-W/DUPLICATE-IST");

    static private final SubLSymbol $sym41$_MT_W_DUPLICATE_IST_COUNT_ = makeSymbol("*MT-W/DUPLICATE-IST-COUNT*");

    static private final SubLString $str_alt42$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :MT-W/DUPLICATE-IST");

    public static final SubLSymbol $kw43$MT_W_DUPLICATE_IST = makeKeyword("MT-W/DUPLICATE-IST");

    static private final SubLList $list_alt44 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*MT-W/DUPLICATE-IST-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*MT-W/DUPLICATE-IST-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*MT-W/DUPLICATE-IST-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("MT"), makeKeyword("KBI-LEVEL"), FIVE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-MT-W/DUPLICATE-IST?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("MT-W/DUPLICATE-IST?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-MT-W/DUPLICATE-IST?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-MT-W/DUPLICATE-IST?"), makeKeyword("KBI-CONCERN-FOR"), $CODE, makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("HL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("CONFLICT"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test MT fort for duplicate #$ist assertions") });

    static private final SubLString $str_alt45$_s___ist_includes__s_duplicates__ = makeString("~s #$ist includes ~s duplicates: ~a");



    static private final SubLString $str_alt47$__ = makeString(", ");

    static private final SubLString $str_alt48$_____so_see_them_all_use__show_me = makeString("... (so see them all use (show-me-the-ist-duplicates ~s))");

    static private final SubLString $str_alt49$__and_ = makeString(", and ");

    static private final SubLSymbol $sym50$_MT_W_O_IST_RESULTS_ = makeSymbol("*MT-W/O-IST-RESULTS*");

    static private final SubLString $str_alt51$violators_of_kbi_module__MT_W_O_I = makeString("violators of kbi module :MT-W/O-IST");

    static private final SubLSymbol $sym52$_MT_W_O_IST_TIME_ = makeSymbol("*MT-W/O-IST-TIME*");

    static private final SubLString $str_alt53$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :MT-W/O-IST");

    static private final SubLSymbol $sym54$_MT_W_O_IST_COUNT_ = makeSymbol("*MT-W/O-IST-COUNT*");

    static private final SubLString $str_alt55$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :MT-W/O-IST");

    public static final SubLSymbol $kw56$MT_W_O_IST = makeKeyword("MT-W/O-IST");

    static private final SubLList $list_alt57 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*MT-W/O-IST-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*MT-W/O-IST-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*MT-W/O-IST-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("MT"), makeKeyword("KBI-LEVEL"), ONE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-MT-W/O-IST?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("MT-W/O-IST?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-MT-W/O-IST?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-MT-W/O-IST?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("GAP"), makeKeyword("KBI-RESULT-TYPE"), $WARN, makeKeyword("KBI-DOC"), makeString("test mt fort for no #$ist assertions") });

    static private final SubLString $str_alt58$_s_is_not_a___BroadMicrothery_and = makeString("~s is not a #$BroadMicrothery and indexes no assertions");

    public static final SubLSymbol $mt_in_wrong_mt_results$ = makeSymbol("*MT-IN-WRONG-MT-RESULTS*");

    static private final SubLString $str_alt60$violators_of_kbi_module__MT_IN_WR = makeString("violators of kbi module :MT-IN-WRONG-MT");

    public static final SubLSymbol $mt_in_wrong_mt_time$ = makeSymbol("*MT-IN-WRONG-MT-TIME*");

    static private final SubLString $str_alt62$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :MT-IN-WRONG-MT");

    public static final SubLSymbol $mt_in_wrong_mt_count$ = makeSymbol("*MT-IN-WRONG-MT-COUNT*");

    static private final SubLString $str_alt64$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :MT-IN-WRONG-MT");

    private static final SubLSymbol $MT_IN_WRONG_MT = makeKeyword("MT-IN-WRONG-MT");

    static private final SubLList $list_alt66 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*MT-IN-WRONG-MT-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*MT-IN-WRONG-MT-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*MT-IN-WRONG-MT-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("MT"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-MT-IN-WRONG-MTS"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("MT-IN-WRONG-MT?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-MT-IN-WRONG-MT?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-MT-IN-WRONG-MT?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("CONFLICT"), makeKeyword("KBI-RESULT-TYPE"), $WARN, makeKeyword("KBI-DOC"), makeString("test MT for #$isa #$Microtheory in improper mt") });

    static private final SubLString $str_alt67$_s___isa___Microtheory_in__a__but = makeString("~s #$isa #$Microtheory in ~a; but should only be so in ~s");

    // // Initializers
    public void declareFunctions() {
        declare_kbi_mt_file();
    }

    public void initializeVariables() {
        init_kbi_mt_file();
    }

    public void runTopLevelForms() {
        setup_kbi_mt_file();
    }
}

