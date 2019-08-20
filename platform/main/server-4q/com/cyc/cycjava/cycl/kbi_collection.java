/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.creduce;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nthcdr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.sbhl.sbhl_marking_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
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
 *  module:      KBI-COLLECTION
 *  source file: /cyc/top/cycl/kbi-collection.lisp
 *  created:     2019/07/03 17:39:06
 */
public final class kbi_collection extends SubLTranslatedFile implements V02 {
    // // Constructor
    private kbi_collection() {
    }

    public static final SubLFile me = new kbi_collection();


    // // Definitions
    public static final SubLObject diagnose_qua_collection(SubLObject collection) {
        return kbi_utilities.diagnose_qua_sub_domains(collection, $COLLECTION);
    }







    /**
     * test COLLECTION fort for missing from forts typed collection
     */
    public static final SubLObject collection_not_cachedP(SubLObject collection) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($COLLECTION_NOT_CACHED)) && (NIL != kbi_utilities.kbi_applies_toP($COLLECTION_NOT_CACHED, collection))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($COLLECTION_NOT_CACHED);
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
                                                        kbi_collection_not_cachedP(collection);
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
                    kbi_utilities.kbi_increment_time($COLLECTION_NOT_CACHED, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :COLLECTION-NOT-CACHED applies to COLLECTION
     */
    public static final SubLObject why_collection_not_cachedP(SubLObject collection, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($COLLECTION_NOT_CACHED, collection)) {
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
                                                    kbi_collection_not_cachedP(collection);
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
                                return list($COLLECTION_NOT_CACHED, collection, data);
                            } else {
                                return list($COLLECTION_NOT_CACHED, collection);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_collection_not_cachedP(collection, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_collection_not_cachedP(SubLObject collection) {
        if (NIL == fort_types_interface.collection_in_any_mtP(collection)) {
            kbi_utilities.add_kbi_result(collection);
        }
        return kbi_utilities.kbi_result();
    }

    public static final SubLObject kbi_nl_why_collection_not_cachedP(SubLObject collection, SubLObject data) {
        return format(NIL, $str_alt14$_s_is_not_among_the_cached_collec, collection);
    }







    /**
     * test COLLECTION fort for missing expected constraints
     */
    public static final SubLObject collection_under_constrainedP(SubLObject collection) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($COLLECTION_UNDER_CONSTRAINED)) && (NIL != kbi_utilities.kbi_applies_toP($COLLECTION_UNDER_CONSTRAINED, collection))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($COLLECTION_UNDER_CONSTRAINED);
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
                                                        kbi_collection_under_constrainedP(collection, UNPROVIDED);
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
                    kbi_utilities.kbi_increment_time($COLLECTION_UNDER_CONSTRAINED, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :COLLECTION-UNDER-CONSTRAINED applies to COLLECTION
     */
    public static final SubLObject why_collection_under_constrainedP(SubLObject collection, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($COLLECTION_UNDER_CONSTRAINED, collection)) {
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
                                                    kbi_collection_under_constrainedP(collection, UNPROVIDED);
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
                                return list($COLLECTION_UNDER_CONSTRAINED, collection, data);
                            } else {
                                return list($COLLECTION_UNDER_CONSTRAINED, collection);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_collection_under_constrainedP(collection, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject under_constrained_pred_for_colP(SubLObject collection, SubLObject pred, SubLObject index_arg, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject under_constrainedP = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_index_arg$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_mapping_pred$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_index_arg$.bind(index_arg, thread);
                        sbhl_search_vars.$sbhl_mapping_pred$.bind(pred, thread);
                        {
                            SubLObject result = NIL;
                            {
                                SubLObject _prev_bind_0_9 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_result$.bind(NIL, thread);
                                    try {
                                        if (NIL != kb_indexing.broad_mtP(mt)) {
                                            {
                                                SubLObject _prev_bind_0_10 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                SubLObject _prev_bind_1_11 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                try {
                                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                                    genls.any_all_genls(symbol_function($sym25$CONSTRAINED_PRED_FOR_COL_), collection, UNPROVIDED, UNPROVIDED);
                                                } finally {
                                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_11, thread);
                                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_10, thread);
                                                }
                                            }
                                        } else {
                                            genls.any_all_genls(symbol_function($sym25$CONSTRAINED_PRED_FOR_COL_), collection, mt, UNPROVIDED);
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                result = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_12, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_0_9, thread);
                                }
                            }
                            under_constrainedP = makeBoolean(NIL == result);
                        }
                    } finally {
                        sbhl_search_vars.$sbhl_mapping_pred$.rebind(_prev_bind_1, thread);
                        sbhl_search_vars.$sbhl_index_arg$.rebind(_prev_bind_0, thread);
                    }
                }
                return under_constrainedP;
            }
        }
    }

    /**
     * identify (in english) kb gaps involving COLLECTION
     */
    public static final SubLObject tell_me_more_collection(SubLObject collection, SubLObject minP) {
        if (minP == UNPROVIDED) {
            minP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mtXpredXargXisas = NIL;
                SubLObject nl_result = $str_alt26$please_assert_;
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
                                                kbi_collection_under_constrainedP(collection, minP);
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0_14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        mtXpredXargXisas = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
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
                if (NIL != mtXpredXargXisas) {
                    {
                        SubLObject cdolist_list_var = mtXpredXargXisas;
                        SubLObject mtXpredXargXisa = NIL;
                        for (mtXpredXargXisa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mtXpredXargXisa = cdolist_list_var.first()) {
                            {
                                SubLObject datum = mtXpredXargXisa;
                                SubLObject current = datum;
                                SubLObject mt = NIL;
                                SubLObject pred = NIL;
                                SubLObject arg = NIL;
                                SubLObject v_isa = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt27);
                                mt = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt27);
                                pred = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt27);
                                arg = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt27);
                                v_isa = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    {
                                        SubLObject pcase_var = arg;
                                        if (pcase_var.eql(ONE_INTEGER)) {
                                            nl_result = cconcatenate(nl_result, format(NIL, $str_alt28$_______interArgIsa1_2__s__s___a__, new SubLObject[]{ pred, collection, kb_paths.fort_name(kbi_fort.best_gaf_argn_isa(listS(pred, collection, $list_alt29), TWO_INTEGER, mt)), mt }));
                                        } else
                                            if (pcase_var.eql(TWO_INTEGER)) {
                                                nl_result = cconcatenate(nl_result, format(NIL, $str_alt30$_______interArgIsa2_1__s__s___a__, new SubLObject[]{ pred, collection, kb_paths.fort_name(kbi_fort.best_gaf_argn_isa(list(pred, $X, collection), ONE_INTEGER, mt)), mt }));
                                            }

                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt27);
                                }
                            }
                        }
                    }
                    return nl_result;
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_collection_under_constrainedP(SubLObject collection, SubLObject data) {
        {
            SubLObject nl_result = $str_alt32$;
            SubLObject cdolist_list_var = data;
            SubLObject mtXpredXargXisa = NIL;
            for (mtXpredXargXisa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mtXpredXargXisa = cdolist_list_var.first()) {
                {
                    SubLObject datum = mtXpredXargXisa;
                    SubLObject current = datum;
                    SubLObject mt = NIL;
                    SubLObject pred = NIL;
                    SubLObject arg = NIL;
                    SubLObject v_isa = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt27);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt27);
                    pred = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt27);
                    arg = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt27);
                    v_isa = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject spec_preds = remove(pred, genl_predicates.all_spec_preds_wrt_type(pred, collection, arg, mt, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            nl_result = cconcatenate(nl_result, new SubLObject[]{ format(NIL, $str_alt33$__every__s_is_expected_to_appear_, new SubLObject[]{ v_isa, arg, pred, mt }), NIL != spec_preds ? ((SubLObject) (format(NIL, $str_alt34$____candidate___specPreds_are__a, string_utilities.stringify_items(spec_preds, symbol_function(STR), $str_alt36$__, $str_alt37$_and_)))) : $str_alt32$ });
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt27);
                    }
                }
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_collection_under_constrainedP(SubLObject collection, SubLObject minP) {
        if (minP == UNPROVIDED) {
            minP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject doneP = NIL;
                {
                    SubLObject _prev_bind_0 = control_vars.$mapping_source$.currentBinding(thread);
                    try {
                        control_vars.$mapping_source$.bind(collection, thread);
                        if (NIL == doneP) {
                            {
                                SubLObject csome_list_var = czer_vars.$required_arg_preds$.getDynamicValue(thread);
                                {
                                    SubLObject _prev_bind_0_15 = control_vars.$mapping_pred$.currentBinding(thread);
                                    try {
                                        control_vars.$mapping_pred$.bind(NIL, thread);
                                        for (control_vars.$mapping_pred$.setDynamicValue(csome_list_var.first(), thread); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , control_vars.$mapping_pred$.setDynamicValue(csome_list_var.first(), thread)) {
                                            {
                                                SubLObject _prev_bind_0_16 = control_vars.$mapping_index_arg$.currentBinding(thread);
                                                try {
                                                    control_vars.$mapping_index_arg$.bind(kb_accessors.required_pred_arg(control_vars.$mapping_pred$.getDynamicValue(thread)), thread);
                                                    if (NIL == doneP) {
                                                        {
                                                            SubLObject csome_list_var_17 = kbi_utilities.kbi_cached_term_mts(collection);
                                                            {
                                                                SubLObject _prev_bind_0_18 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                                try {
                                                                    mt_relevance_macros.$mt$.bind(NIL, thread);
                                                                    for (mt_relevance_macros.$mt$.setDynamicValue(csome_list_var_17.first(), thread); !((NIL != doneP) || (NIL == csome_list_var_17)); csome_list_var_17 = csome_list_var_17.rest() , mt_relevance_macros.$mt$.setDynamicValue(csome_list_var_17.first(), thread)) {
                                                                        genls.any_all_genls(symbol_function(GATHER_UNDER_CONSTRAINED_PREDS_VIA_COL), collection, mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED);
                                                                        doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                                                        if (NIL != minP) {
                                                                            {
                                                                                SubLObject relevant = NIL;
                                                                                {
                                                                                    SubLObject cdolist_list_var = kbi_utilities.kbi_result();
                                                                                    SubLObject mtXpredXargXisa = NIL;
                                                                                    for (mtXpredXargXisa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mtXpredXargXisa = cdolist_list_var.first()) {
                                                                                        if (control_vars.$mapping_index_arg$.getDynamicValue(thread) == third(mtXpredXargXisa)) {
                                                                                            relevant = cons(mtXpredXargXisa, relevant);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (NIL != relevant) {
                                                                                    {
                                                                                        SubLObject min_preds = genl_predicates.min_predicates(Mapping.mapcar(symbol_function(SECOND), relevant), mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED);
                                                                                        SubLObject cdolist_list_var = relevant;
                                                                                        SubLObject mtXpredXargXisa = NIL;
                                                                                        for (mtXpredXargXisa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mtXpredXargXisa = cdolist_list_var.first()) {
                                                                                            if (NIL == subl_promotions.memberP(second(mtXpredXargXisa), min_preds, UNPROVIDED, UNPROVIDED)) {
                                                                                                kbi_macros.$kbi_result$.setDynamicValue(remove(mtXpredXargXisa, kbi_macros.$kbi_result$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } finally {
                                                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_18, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    control_vars.$mapping_index_arg$.rebind(_prev_bind_0_16, thread);
                                                }
                                            }
                                        }
                                    } finally {
                                        control_vars.$mapping_pred$.rebind(_prev_bind_0_15, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        control_vars.$mapping_source$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return kbi_utilities.kbi_result();
        }
    }

    public static final SubLObject gather_under_constrained_preds_via_col(SubLObject col) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            kb_mapping.map_gaf_arg_index(symbol_function(GATHER_UNDER_CONSTRAINED_PREDS), col, ONE_INTEGER, control_vars.$mapping_pred$.getDynamicValue(thread), $TRUE, UNPROVIDED);
            if (NIL != kbi_utilities.kbi_doneP(UNPROVIDED)) {
                return kbi_utilities.kbi_result();
            }
            return NIL;
        }
    }

    public static final SubLObject gather_under_constrained_preds(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt = assertions_high.assertion_mt(assertion);
                SubLObject pred = assertions_high.gaf_arg2(assertion);
                if (NIL == subl_promotions.memberP(control_vars.$mapping_source$.getDynamicValue(thread), kb_accessors.argn_isa(pred, control_vars.$mapping_index_arg$.getDynamicValue(thread), mt), UNPROVIDED, UNPROVIDED)) {
                    if (NIL != under_constrained_pred_for_colP(control_vars.$mapping_source$.getDynamicValue(thread), pred, control_vars.$mapping_index_arg$.getDynamicValue(thread), mt)) {
                        kbi_utilities.adjoin_kbi_result(list(mt, pred, control_vars.$mapping_index_arg$.getDynamicValue(thread), assertions_high.gaf_arg1(assertion)), symbol_function(EQUAL), UNPROVIDED);
                        if (NIL != kbi_utilities.kbi_doneP(UNPROVIDED)) {
                            utilities_macros.mapping_finished();
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject constrained_pred_for_colP(SubLObject col, SubLObject pred, SubLObject index_arg) {
        if (pred == UNPROVIDED) {
            pred = sbhl_search_vars.$sbhl_mapping_pred$.getDynamicValue();
        }
        if (index_arg == UNPROVIDED) {
            index_arg = sbhl_search_vars.$sbhl_index_arg$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_arity = arity.arity(pred);
                SubLObject constrainedP = kb_accessors.relation_types_sp(col, pred, UNPROVIDED);
                if (NIL != el_utilities.valid_arity_p(v_arity)) {
                    if (NIL == constrainedP) {
                        {
                            SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                {
                                    SubLObject _prev_bind_0_19 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                        {
                                            SubLObject _prev_bind_0_20 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(T, thread);
                                                {
                                                    SubLObject other_args_isas = at_utilities.pred_arg_isa_requires_other_arg_isa(pred, col, index_arg, UNPROVIDED);
                                                    if (NIL == constrainedP) {
                                                        {
                                                            SubLObject csome_list_var = list_utilities.first_n(v_arity, czer_vars.$arg_positions$.getGlobalValue());
                                                            SubLObject arg = NIL;
                                                            for (arg = csome_list_var.first(); !((NIL != constrainedP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , arg = csome_list_var.first()) {
                                                                if (arg != index_arg) {
                                                                    {
                                                                        SubLObject arg_isas = kb_accessors.argn_isa(pred, arg, UNPROVIDED);
                                                                        SubLObject other_arg_isas = second(assoc(arg, other_args_isas, UNPROVIDED, UNPROVIDED));
                                                                        if (NIL == constrainedP) {
                                                                            {
                                                                                SubLObject csome_list_var_21 = arg_isas;
                                                                                SubLObject arg_isa = NIL;
                                                                                for (arg_isa = csome_list_var_21.first(); !((NIL != constrainedP) || (NIL == csome_list_var_21)); csome_list_var_21 = csome_list_var_21.rest() , arg_isa = csome_list_var_21.first()) {
                                                                                    if (NIL == subl_promotions.memberP(arg_isa, other_arg_isas, UNPROVIDED, UNPROVIDED)) {
                                                                                        constrainedP = genls.any_genlP(arg_isa, other_arg_isas, UNPROVIDED, UNPROVIDED);
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
                                            } finally {
                                                sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_0_20, thread);
                                            }
                                        }
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                    } finally {
                                        sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_19, thread);
                                    }
                                }
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            } finally {
                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                if (NIL != constrainedP) {
                    sbhl_search_vars.$sbhl_result$.setDynamicValue(T, thread);
                }
                return constrainedP;
            }
        }
    }







    /**
     * test COLLECTION for partition cells that are not specs
     */
    public static final SubLObject collection_not_genl_of_partitionP(SubLObject collection) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($COLLECTION_NOT_GENL_OF_PARTITION)) && (NIL != kbi_utilities.kbi_applies_toP($COLLECTION_NOT_GENL_OF_PARTITION, collection))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($COLLECTION_NOT_GENL_OF_PARTITION);
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
                                                        kbi_collection_not_genl_of_partitionP(collection);
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
                    kbi_utilities.kbi_increment_time($COLLECTION_NOT_GENL_OF_PARTITION, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :COLLECTION-NOT-GENL-OF-PARTITION applies to COLLECTION
     */
    public static final SubLObject why_collection_not_genl_of_partitionP(SubLObject collection, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($COLLECTION_NOT_GENL_OF_PARTITION, collection)) {
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
                                                    kbi_collection_not_genl_of_partitionP(collection);
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
                                return list($COLLECTION_NOT_GENL_OF_PARTITION, collection, data);
                            } else {
                                return list($COLLECTION_NOT_GENL_OF_PARTITION, collection);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_collection_not_genl_of_partitionP(collection, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_collection_not_genl_of_partitionP(SubLObject collection, SubLObject data) {
        {
            SubLObject nl_result = $str_alt32$;
            SubLObject cdolist_list_var = data;
            SubLObject datum = NIL;
            for (datum = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , datum = cdolist_list_var.first()) {
                {
                    SubLObject datum_26 = datum;
                    SubLObject current = datum_26;
                    SubLObject partition = NIL;
                    SubLObject cell = NIL;
                    SubLObject mt = NIL;
                    destructuring_bind_must_consp(current, datum_26, $list_alt50);
                    partition = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum_26, $list_alt50);
                    cell = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum_26, $list_alt50);
                    mt = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        nl_result = cconcatenate(nl_result, format(NIL, $str_alt51$___s_has_partition__s_with_cell__, new SubLObject[]{ collection, partition, cell, mt }));
                    } else {
                        cdestructuring_bind_error(datum_26, $list_alt50);
                    }
                }
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_collection_not_genl_of_partitionP(SubLObject collection) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    kb_mapping.map_gaf_arg_index(symbol_function(COLLECTION_NOT_GENL_OF_PARTITION_IN_MTS_INT), collection, ONE_INTEGER, $$partitionedInto, UNPROVIDED, UNPROVIDED);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return kbi_utilities.kbi_result();
        }
    }

    public static final SubLObject collection_not_genl_of_partition_in_mts_int(SubLObject assertion) {
        {
            SubLObject mt = assertions_high.assertion_mt(assertion);
            SubLObject collection = assertions_high.gaf_arg1(assertion);
            SubLObject partition = assertions_high.gaf_arg2(assertion);
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = partition_cells(partition, mt);
                    SubLObject cell = NIL;
                    for (cell = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , cell = csome_list_var.first()) {
                        if (NIL == genls.genlsP(cell, collection, mt, UNPROVIDED)) {
                            kbi_utilities.add_kbi_result(list(partition, cell, mt));
                            doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                            if (NIL != doneP) {
                                utilities_macros.mapping_finished();
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject partition_cells(SubLObject partition, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject result = NIL;
            if (NIL != fort_types_interface.collectionP(partition)) {
                result = isa.instances(partition, mt, UNPROVIDED);
            }
            {
                SubLObject tou = narts_high.nart_hl_formula(partition);
                if ($$ThePartition == cycl_utilities.nat_functor(tou)) {
                    result = nconc(result, copy_list(cycl_utilities.nat_args(tou, UNPROVIDED)));
                }
            }
            return result;
        }
    }







    /**
     * test COLLECTION for having a common #$isa and #$genls
     */
    public static final SubLObject collection_isa_is_genlP(SubLObject collection) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($COLLECTION_ISA_IS_GENL)) && (NIL != kbi_utilities.kbi_applies_toP($COLLECTION_ISA_IS_GENL, collection))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($COLLECTION_ISA_IS_GENL);
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
                                                        kbi_collection_isa_is_genlP(collection);
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
                    kbi_utilities.kbi_increment_time($COLLECTION_ISA_IS_GENL, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :COLLECTION-ISA-IS-GENL applies to COLLECTION
     */
    public static final SubLObject why_collection_isa_is_genlP(SubLObject collection, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($COLLECTION_ISA_IS_GENL, collection)) {
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
                                                    kbi_collection_isa_is_genlP(collection);
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
                                return list($COLLECTION_ISA_IS_GENL, collection, data);
                            } else {
                                return list($COLLECTION_ISA_IS_GENL, collection);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_collection_isa_is_genlP(collection, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_collection_isa_is_genlP(SubLObject collection, SubLObject data) {
        {
            SubLObject nl_result = $str_alt32$;
            SubLObject cdolist_list_var = kbi_utilities.kbi_transform(data, UNPROVIDED);
            SubLObject datum = NIL;
            for (datum = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , datum = cdolist_list_var.first()) {
                {
                    SubLObject datum_31 = datum;
                    SubLObject current = datum_31;
                    SubLObject mt = NIL;
                    SubLObject isa_genl = NIL;
                    destructuring_bind_must_consp(current, datum_31, $list_alt63);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum_31, $list_alt63);
                    isa_genl = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        nl_result = cconcatenate(nl_result, format(NIL, $str_alt64$___s___isa__s_____but_also___genl, new SubLObject[]{ collection, isa_genl, isa_genl, mt }));
                    } else {
                        cdestructuring_bind_error(datum_31, $list_alt63);
                    }
                }
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_collection_isa_is_genlP(SubLObject collection) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject doneP = NIL;
                if (NIL == doneP) {
                    {
                        SubLObject csome_list_var = isa.isa_mts(collection);
                        SubLObject mt = NIL;
                        for (mt = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mt = csome_list_var.first()) {
                            {
                                SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                                {
                                    SubLObject _prev_bind_0 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                                        sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                        {
                                            SubLObject _prev_bind_0_32 = sbhl_marking_vars.$sbhl_space_0$.currentBinding(thread);
                                            SubLObject _prev_bind_1_33 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$sbhl_space_0$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                                                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), collection, mt, UNPROVIDED);
                                                {
                                                    SubLObject resourcing_p_34 = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                                                    {
                                                        SubLObject _prev_bind_0_35 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_36 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                                                        try {
                                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                                                            sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                            {
                                                                SubLObject _prev_bind_0_37 = sbhl_marking_vars.$sbhl_space_1$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_38 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_marking_vars.$sbhl_space_1$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p_34, thread);
                                                                    if (NIL != genls.genlP(collection, $$Collection, UNPROVIDED, UNPROVIDED)) {
                                                                        sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), $$Collection, UNPROVIDED, UNPROVIDED);
                                                                    }
                                                                    isa.map_all_isa(COLLECTION_ISA_IS_GENL_IN_MT, collection, mt, UNPROVIDED);
                                                                } finally {
                                                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_38, thread);
                                                                    sbhl_marking_vars.$sbhl_space_1$.rebind(_prev_bind_0_37, thread);
                                                                }
                                                            }
                                                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                                        } finally {
                                                            sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_36, thread);
                                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_35, thread);
                                                        }
                                                    }
                                                }
                                            } finally {
                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_33, thread);
                                                sbhl_marking_vars.$sbhl_space_0$.rebind(_prev_bind_0_32, thread);
                                            }
                                        }
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                    } finally {
                                        sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1, thread);
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                        }
                    }
                }
            }
            return reduce_wrt_n(REDUCE_MTS_MAX, kbi_utilities.kbi_result(), ZERO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static final SubLObject collection_isa_is_genl_in_mt(SubLObject v_isa) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == sbhl_marking_methods.sbhl_recorded_node_p(v_isa, sbhl_marking_vars.$sbhl_space_1$.getDynamicValue(thread))) {
                if (NIL != sbhl_marking_methods.sbhl_recorded_node_p(v_isa, sbhl_marking_vars.$sbhl_space_0$.getDynamicValue(thread))) {
                    kbi_utilities.add_kbi_result(list(mt_relevance_macros.$mt$.getDynamicValue(thread), v_isa));
                }
            }
            return kbi_utilities.kbi_result();
        }
    }

    public static final SubLObject reduce_wrt_n(SubLObject function, SubLObject meta_sequence, SubLObject n, SubLObject start, SubLObject end, SubLObject init_value) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (init_value == UNPROVIDED) {
            init_value = $NONE;
        }
        if (meta_sequence.isAtom()) {
            return meta_sequence;
        } else
            if (NIL == meta_sequence) {
                return meta_sequence;
            } else
                if (NIL != list_utilities.singletonP(meta_sequence)) {
                    return meta_sequence;
                } else {
                    {
                        SubLObject result_table = make_hash_table(SIXTEEN_INTEGER, EQUAL, UNPROVIDED);
                        SubLObject winners = NIL;
                        {
                            SubLObject cdolist_list_var = meta_sequence;
                            SubLObject sequence = NIL;
                            for (sequence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sequence = cdolist_list_var.first()) {
                                {
                                    SubLObject start_39 = list_utilities.first_n(n, sequence);
                                    SubLObject rest = nthcdr(n, sequence);
                                    SubLObject nth = rest.first();
                                    SubLObject end_40 = rest.rest();
                                    SubLObject v_else = list(start_39, end_40);
                                    sethash(v_else, result_table, cons(nth, gethash(v_else, result_table, UNPROVIDED)));
                                }
                            }
                        }
                        {
                            SubLObject v_else = NIL;
                            SubLObject nths = NIL;
                            {
                                final Iterator cdohash_iterator = getEntrySetIterator(result_table);
                                try {
                                    while (iteratorHasNext(cdohash_iterator)) {
                                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                        v_else = getEntryKey(cdohash_entry);
                                        nths = getEntryValue(cdohash_entry);
                                        if (NIL != list_utilities.singletonP(nths)) {
                                            winners = cons(append(v_else.first(), nths, second(v_else)), winners);
                                        } else {
                                            {
                                                SubLObject cdolist_list_var = creduce(function, nths, start, end, init_value);
                                                SubLObject nth = NIL;
                                                for (nth = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , nth = cdolist_list_var.first()) {
                                                    winners = cons(append(v_else.first(), list(nth), second(v_else)), winners);
                                                }
                                            }
                                        }
                                    } 
                                } finally {
                                    releaseEntrySetIterator(cdohash_iterator);
                                }
                            }
                        }
                        return winners;
                    }
                }


    }

    public static final SubLObject reduce_mts_min(SubLObject mts, SubLObject mt) {
        return reduce_mts(MIN_MTS, mts, mt);
    }

    public static final SubLObject reduce_mts_max(SubLObject mts, SubLObject mt) {
        return reduce_mts(MAX_MTS, mts, mt);
    }

    public static final SubLObject reduce_mts(SubLObject mt_function, SubLObject mts, SubLObject mt) {
        if (mts.isCons()) {
            return funcall(mt_function, cons(mt, mts));
        } else
            if (NIL != fort_types_interface.mtP(mts)) {
                return funcall(mt_function, list(mts, mt));
            }

        return NIL;
    }

    public static final SubLObject reduce_cols_min(SubLObject cols, SubLObject col) {
        return reduce_cols(MIN_COLS, cols, col);
    }

    public static final SubLObject reduce_cols_max(SubLObject cols, SubLObject col) {
        return reduce_cols(MAX_COLS, cols, col);
    }

    public static final SubLObject reduce_cols(SubLObject col_fn, SubLObject cols, SubLObject col) {
        if (cols.isCons()) {
            return funcall(col_fn, cons(col, cols));
        } else
            if (NIL != fort_types_interface.collectionP(cols)) {
                return funcall(col_fn, list(cols, col));
            }

        return NIL;
    }







    /**
     * test COLLECTION for partition cells that intersect
     */
    public static final SubLObject collection_partition_cells_intersectP(SubLObject collection) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($COLLECTION_PARTITION_CELLS_INTERSECT)) && (NIL != kbi_utilities.kbi_applies_toP($COLLECTION_PARTITION_CELLS_INTERSECT, collection))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($COLLECTION_PARTITION_CELLS_INTERSECT);
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
                                                        kbi_collection_partition_cells_intersectP(collection);
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
                    kbi_utilities.kbi_increment_time($COLLECTION_PARTITION_CELLS_INTERSECT, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :COLLECTION-PARTITION-CELLS-INTERSECT applies to COLLECTION
     */
    public static final SubLObject why_collection_partition_cells_intersectP(SubLObject collection, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($COLLECTION_PARTITION_CELLS_INTERSECT, collection)) {
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
                                                    kbi_collection_partition_cells_intersectP(collection);
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
                                return list($COLLECTION_PARTITION_CELLS_INTERSECT, collection, data);
                            } else {
                                return list($COLLECTION_PARTITION_CELLS_INTERSECT, collection);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_collection_partition_cells_intersectP(collection, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_collection_partition_cells_intersectP(SubLObject collection, SubLObject data) {
        {
            SubLObject nl_result = $str_alt32$;
            SubLObject cdolist_list_var = data;
            SubLObject datum = NIL;
            for (datum = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , datum = cdolist_list_var.first()) {
                {
                    SubLObject datum_45 = datum;
                    SubLObject current = datum_45;
                    SubLObject partition = NIL;
                    SubLObject cell_1 = NIL;
                    SubLObject cell_2 = NIL;
                    SubLObject mt = NIL;
                    destructuring_bind_must_consp(current, datum_45, $list_alt82);
                    partition = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum_45, $list_alt82);
                    cell_1 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum_45, $list_alt82);
                    cell_2 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum_45, $list_alt82);
                    mt = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        nl_result = cconcatenate(nl_result, format(NIL, $str_alt83$___s_has_partition__s_with_inters, new SubLObject[]{ collection, partition, cell_1, cell_2, mt }));
                    } else {
                        cdestructuring_bind_error(datum_45, $list_alt82);
                    }
                }
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_collection_partition_cells_intersectP(SubLObject collection) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    kb_mapping.map_gaf_arg_index(symbol_function(COLLECTION_PARTITION_CELLS_INTERSECT_IN_MTS_INT), collection, ONE_INTEGER, $$partitionedInto, UNPROVIDED, UNPROVIDED);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return kbi_utilities.kbi_result();
        }
    }

    public static final SubLObject collection_partition_cells_intersect_in_mts_int(SubLObject assertion) {
        {
            SubLObject mt = assertions_high.assertion_mt(assertion);
            SubLObject partition = assertions_high.gaf_arg2(assertion);
            SubLObject cells = partition_cells(partition, mt);
            SubLObject doneP = NIL;
            SubLObject cells_1 = NIL;
            SubLObject cell_1 = NIL;
            for (cells_1 = cells, cell_1 = cells_1.first(); !((NIL != doneP) || (NIL == cells_1)); cells_1 = cells_1.rest() , cell_1 = cells_1.first()) {
                {
                    SubLObject cells_2 = NIL;
                    SubLObject cell_2 = NIL;
                    for (cells_2 = cells_1.rest(), cell_2 = cells_2.first(); !((NIL != doneP) || (NIL == cells_2)); cells_2 = cells_2.rest() , cell_2 = cells_2.first()) {
                        if (((NIL != list_utilities.intersectP(isa.instances(cell_1, mt, UNPROVIDED), isa.instances(cell_2, mt, UNPROVIDED), UNPROVIDED, UNPROVIDED)) || (NIL != genls.genlsP(cell_1, cell_2, mt, UNPROVIDED))) || (NIL != genls.genlsP(cell_2, cell_1, mt, UNPROVIDED))) {
                            kbi_utilities.add_kbi_result(list(partition, cell_1, cell_2, mt));
                            doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                            if (NIL != doneP) {
                                utilities_macros.mapping_finished();
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject declare_kbi_collection_file() {
        declareFunction("diagnose_qua_collection", "DIAGNOSE-QUA-COLLECTION", 1, 0, false);
        declareFunction("collection_not_cachedP", "COLLECTION-NOT-CACHED?", 1, 0, false);
        declareFunction("why_collection_not_cachedP", "WHY-COLLECTION-NOT-CACHED?", 1, 1, false);
        declareFunction("kbi_collection_not_cachedP", "KBI-COLLECTION-NOT-CACHED?", 1, 0, false);
        declareFunction("kbi_nl_why_collection_not_cachedP", "KBI-NL-WHY-COLLECTION-NOT-CACHED?", 2, 0, false);
        declareFunction("collection_under_constrainedP", "COLLECTION-UNDER-CONSTRAINED?", 1, 0, false);
        declareFunction("why_collection_under_constrainedP", "WHY-COLLECTION-UNDER-CONSTRAINED?", 1, 1, false);
        declareFunction("under_constrained_pred_for_colP", "UNDER-CONSTRAINED-PRED-FOR-COL?", 3, 1, false);
        declareFunction("tell_me_more_collection", "TELL-ME-MORE-COLLECTION", 1, 1, false);
        declareFunction("kbi_nl_why_collection_under_constrainedP", "KBI-NL-WHY-COLLECTION-UNDER-CONSTRAINED?", 2, 0, false);
        declareFunction("kbi_collection_under_constrainedP", "KBI-COLLECTION-UNDER-CONSTRAINED?", 1, 1, false);
        declareFunction("gather_under_constrained_preds_via_col", "GATHER-UNDER-CONSTRAINED-PREDS-VIA-COL", 1, 0, false);
        declareFunction("gather_under_constrained_preds", "GATHER-UNDER-CONSTRAINED-PREDS", 1, 0, false);
        declareFunction("constrained_pred_for_colP", "CONSTRAINED-PRED-FOR-COL?", 1, 2, false);
        declareFunction("collection_not_genl_of_partitionP", "COLLECTION-NOT-GENL-OF-PARTITION?", 1, 0, false);
        declareFunction("why_collection_not_genl_of_partitionP", "WHY-COLLECTION-NOT-GENL-OF-PARTITION?", 1, 1, false);
        declareFunction("kbi_nl_why_collection_not_genl_of_partitionP", "KBI-NL-WHY-COLLECTION-NOT-GENL-OF-PARTITION?", 2, 0, false);
        declareFunction("kbi_collection_not_genl_of_partitionP", "KBI-COLLECTION-NOT-GENL-OF-PARTITION?", 1, 0, false);
        declareFunction("collection_not_genl_of_partition_in_mts_int", "COLLECTION-NOT-GENL-OF-PARTITION-IN-MTS-INT", 1, 0, false);
        declareFunction("partition_cells", "PARTITION-CELLS", 1, 1, false);
        declareFunction("collection_isa_is_genlP", "COLLECTION-ISA-IS-GENL?", 1, 0, false);
        declareFunction("why_collection_isa_is_genlP", "WHY-COLLECTION-ISA-IS-GENL?", 1, 1, false);
        declareFunction("kbi_nl_why_collection_isa_is_genlP", "KBI-NL-WHY-COLLECTION-ISA-IS-GENL?", 2, 0, false);
        declareFunction("kbi_collection_isa_is_genlP", "KBI-COLLECTION-ISA-IS-GENL?", 1, 0, false);
        declareFunction("collection_isa_is_genl_in_mt", "COLLECTION-ISA-IS-GENL-IN-MT", 1, 0, false);
        declareFunction("reduce_wrt_n", "REDUCE-WRT-N", 3, 3, false);
        declareFunction("reduce_mts_min", "REDUCE-MTS-MIN", 2, 0, false);
        declareFunction("reduce_mts_max", "REDUCE-MTS-MAX", 2, 0, false);
        declareFunction("reduce_mts", "REDUCE-MTS", 3, 0, false);
        declareFunction("reduce_cols_min", "REDUCE-COLS-MIN", 2, 0, false);
        declareFunction("reduce_cols_max", "REDUCE-COLS-MAX", 2, 0, false);
        declareFunction("reduce_cols", "REDUCE-COLS", 3, 0, false);
        declareFunction("collection_partition_cells_intersectP", "COLLECTION-PARTITION-CELLS-INTERSECT?", 1, 0, false);
        declareFunction("why_collection_partition_cells_intersectP", "WHY-COLLECTION-PARTITION-CELLS-INTERSECT?", 1, 1, false);
        declareFunction("kbi_nl_why_collection_partition_cells_intersectP", "KBI-NL-WHY-COLLECTION-PARTITION-CELLS-INTERSECT?", 2, 0, false);
        declareFunction("kbi_collection_partition_cells_intersectP", "KBI-COLLECTION-PARTITION-CELLS-INTERSECT?", 1, 0, false);
        declareFunction("collection_partition_cells_intersect_in_mts_int", "COLLECTION-PARTITION-CELLS-INTERSECT-IN-MTS-INT", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_kbi_collection_file() {
        defparameter("*COLLECTION-NOT-CACHED-RESULTS*", NIL);
        defparameter("*COLLECTION-NOT-CACHED-TIME*", ZERO_INTEGER);
        defparameter("*COLLECTION-NOT-CACHED-COUNT*", ZERO_INTEGER);
        defparameter("*COLLECTION-UNDER-CONSTRAINED-RESULTS*", NIL);
        defparameter("*COLLECTION-UNDER-CONSTRAINED-TIME*", ZERO_INTEGER);
        defparameter("*COLLECTION-UNDER-CONSTRAINED-COUNT*", ZERO_INTEGER);
        defparameter("*COLLECTION-NOT-GENL-OF-PARTITION-RESULTS*", NIL);
        defparameter("*COLLECTION-NOT-GENL-OF-PARTITION-TIME*", ZERO_INTEGER);
        defparameter("*COLLECTION-NOT-GENL-OF-PARTITION-COUNT*", ZERO_INTEGER);
        defparameter("*COLLECTION-ISA-IS-GENL-RESULTS*", NIL);
        defparameter("*COLLECTION-ISA-IS-GENL-TIME*", ZERO_INTEGER);
        defparameter("*COLLECTION-ISA-IS-GENL-COUNT*", ZERO_INTEGER);
        defparameter("*COLLECTION-PARTITION-CELLS-INTERSECT-RESULTS*", NIL);
        defparameter("*COLLECTION-PARTITION-CELLS-INTERSECT-TIME*", ZERO_INTEGER);
        defparameter("*COLLECTION-PARTITION-CELLS-INTERSECT-COUNT*", ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject setup_kbi_collection_file() {
                {
            SubLObject item_var = $collection_not_cached_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($collection_not_cached_results$, $str_alt2$violators_of_kbi_module__COLLECTI);
        {
            SubLObject item_var = $collection_not_cached_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($collection_not_cached_time$, $str_alt4$run_time_of_predicate_application);
        {
            SubLObject item_var = $collection_not_cached_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($collection_not_cached_count$, $str_alt6$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($COLLECTION_NOT_CACHED, $list_alt13);
        {
            SubLObject item_var = $collection_under_constrained_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($collection_under_constrained_results$, $str_alt16$violators_of_kbi_module__COLLECTI);
        {
            SubLObject item_var = $collection_under_constrained_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($collection_under_constrained_time$, $str_alt18$run_time_of_predicate_application);
        {
            SubLObject item_var = $collection_under_constrained_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($collection_under_constrained_count$, $str_alt20$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($COLLECTION_UNDER_CONSTRAINED, $list_alt22);
        {
            SubLObject item_var = $collection_not_genl_of_partition_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($collection_not_genl_of_partition_results$, $str_alt43$violators_of_kbi_module__COLLECTI);
        {
            SubLObject item_var = $collection_not_genl_of_partition_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($collection_not_genl_of_partition_time$, $str_alt45$run_time_of_predicate_application);
        {
            SubLObject item_var = $collection_not_genl_of_partition_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($collection_not_genl_of_partition_count$, $str_alt47$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($COLLECTION_NOT_GENL_OF_PARTITION, $list_alt49);
        {
            SubLObject item_var = $collection_isa_is_genl_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($collection_isa_is_genl_results$, $str_alt56$violators_of_kbi_module__COLLECTI);
        {
            SubLObject item_var = $collection_isa_is_genl_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($collection_isa_is_genl_time$, $str_alt58$run_time_of_predicate_application);
        {
            SubLObject item_var = $collection_isa_is_genl_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($collection_isa_is_genl_count$, $str_alt60$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($COLLECTION_ISA_IS_GENL, $list_alt62);
        {
            SubLObject item_var = $collection_partition_cells_intersect_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($collection_partition_cells_intersect_results$, $str_alt75$violators_of_kbi_module__COLLECTI);
        {
            SubLObject item_var = $collection_partition_cells_intersect_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($collection_partition_cells_intersect_time$, $str_alt77$run_time_of_predicate_application);
        {
            SubLObject item_var = $collection_partition_cells_intersect_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($collection_partition_cells_intersect_count$, $str_alt79$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($COLLECTION_PARTITION_CELLS_INTERSECT, $list_alt81);
        return NIL;
    }



    public static final SubLSymbol $collection_not_cached_results$ = makeSymbol("*COLLECTION-NOT-CACHED-RESULTS*");

    static private final SubLString $str_alt2$violators_of_kbi_module__COLLECTI = makeString("violators of kbi module :COLLECTION-NOT-CACHED");

    public static final SubLSymbol $collection_not_cached_time$ = makeSymbol("*COLLECTION-NOT-CACHED-TIME*");

    static private final SubLString $str_alt4$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :COLLECTION-NOT-CACHED");

    public static final SubLSymbol $collection_not_cached_count$ = makeSymbol("*COLLECTION-NOT-CACHED-COUNT*");

    static private final SubLString $str_alt6$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :COLLECTION-NOT-CACHED");

    private static final SubLSymbol $COLLECTION_NOT_CACHED = makeKeyword("COLLECTION-NOT-CACHED");





    private static final SubLSymbol $KBI_ERROR = makeKeyword("KBI-ERROR");





    static private final SubLList $list_alt13 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*COLLECTION-NOT-CACHED-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*COLLECTION-NOT-CACHED-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*COLLECTION-NOT-CACHED-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("COLLECTION"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-COLLECTION-NOT-CACHED?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("COLLECTION-NOT-CACHED?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-COLLECTION-NOT-CACHED?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-COLLECTION-NOT-CACHED?"), makeKeyword("KBI-CONCERN-FOR"), $CODE, makeKeyword("KBI-CONCERN-LEVEL"), $SBHL, makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("GAP"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test COLLECTION fort for missing from forts typed collection") });

    static private final SubLString $str_alt14$_s_is_not_among_the_cached_collec = makeString("~s is not among the cached collections");

    public static final SubLSymbol $collection_under_constrained_results$ = makeSymbol("*COLLECTION-UNDER-CONSTRAINED-RESULTS*");

    static private final SubLString $str_alt16$violators_of_kbi_module__COLLECTI = makeString("violators of kbi module :COLLECTION-UNDER-CONSTRAINED");

    public static final SubLSymbol $collection_under_constrained_time$ = makeSymbol("*COLLECTION-UNDER-CONSTRAINED-TIME*");

    static private final SubLString $str_alt18$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :COLLECTION-UNDER-CONSTRAINED");

    public static final SubLSymbol $collection_under_constrained_count$ = makeSymbol("*COLLECTION-UNDER-CONSTRAINED-COUNT*");

    static private final SubLString $str_alt20$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :COLLECTION-UNDER-CONSTRAINED");

    private static final SubLSymbol $COLLECTION_UNDER_CONSTRAINED = makeKeyword("COLLECTION-UNDER-CONSTRAINED");

    static private final SubLList $list_alt22 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*COLLECTION-UNDER-CONSTRAINED-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*COLLECTION-UNDER-CONSTRAINED-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*COLLECTION-UNDER-CONSTRAINED-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("COLLECTION"), makeKeyword("KBI-LEVEL"), THREE_INTEGER, makeKeyword("KBI-SELECTED?"), NIL, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-COLLECTION-UNDER-CONSTRAINED?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("COLLECTION-UNDER-CONSTRAINED?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-COLLECTION-UNDER-CONSTRAINED?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-COLLECTION-UNDER-CONSTRAINED?"), makeKeyword("KBI-SELECTED?"), NIL, makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("GAP"), makeKeyword("KBI-RESULT-TYPE"), $NOTE, makeKeyword("KBI-DOC"), makeString("test COLLECTION fort for missing expected constraints") });



    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    static private final SubLSymbol $sym25$CONSTRAINED_PRED_FOR_COL_ = makeSymbol("CONSTRAINED-PRED-FOR-COL?");

    static private final SubLString $str_alt26$please_assert_ = makeString("please assert:");

    static private final SubLList $list_alt27 = list(makeSymbol("MT"), makeSymbol("PRED"), makeSymbol("ARG"), makeSymbol("ISA"));

    static private final SubLString $str_alt28$_______interArgIsa1_2__s__s___a__ = makeString("~%  (#$interArgIsa1-2 ~s ~s <~a>) [in ~s]");

    static private final SubLList $list_alt29 = list(makeKeyword("X"));

    static private final SubLString $str_alt30$_______interArgIsa2_1__s__s___a__ = makeString("~%  (#$interArgIsa2-1 ~s ~s <~a>) [in ~s]");



    static private final SubLString $str_alt32$ = makeString("");

    static private final SubLString $str_alt33$__every__s_is_expected_to_appear_ = makeString("~%every ~s is expected to appear as arg ~s of ~s in ~s");

    static private final SubLString $str_alt34$____candidate___specPreds_are__a = makeString("~%  candidate #$specPreds are ~a");



    static private final SubLString $str_alt36$__ = makeString(", ");

    static private final SubLString $str_alt37$_and_ = makeString(" and ");

    private static final SubLSymbol GATHER_UNDER_CONSTRAINED_PREDS_VIA_COL = makeSymbol("GATHER-UNDER-CONSTRAINED-PREDS-VIA-COL");



    private static final SubLSymbol GATHER_UNDER_CONSTRAINED_PREDS = makeSymbol("GATHER-UNDER-CONSTRAINED-PREDS");



    public static final SubLSymbol $collection_not_genl_of_partition_results$ = makeSymbol("*COLLECTION-NOT-GENL-OF-PARTITION-RESULTS*");

    static private final SubLString $str_alt43$violators_of_kbi_module__COLLECTI = makeString("violators of kbi module :COLLECTION-NOT-GENL-OF-PARTITION");

    public static final SubLSymbol $collection_not_genl_of_partition_time$ = makeSymbol("*COLLECTION-NOT-GENL-OF-PARTITION-TIME*");

    static private final SubLString $str_alt45$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :COLLECTION-NOT-GENL-OF-PARTITION");

    public static final SubLSymbol $collection_not_genl_of_partition_count$ = makeSymbol("*COLLECTION-NOT-GENL-OF-PARTITION-COUNT*");

    static private final SubLString $str_alt47$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :COLLECTION-NOT-GENL-OF-PARTITION");

    private static final SubLSymbol $COLLECTION_NOT_GENL_OF_PARTITION = makeKeyword("COLLECTION-NOT-GENL-OF-PARTITION");

    static private final SubLList $list_alt49 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*COLLECTION-NOT-GENL-OF-PARTITION-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*COLLECTION-NOT-GENL-OF-PARTITION-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*COLLECTION-NOT-GENL-OF-PARTITION-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("COLLECTION"), makeKeyword("KBI-LEVEL"), ONE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-COLLECTION-NOT-GENL-OF-PARTITION?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("COLLECTION-NOT-GENL-OF-PARTITION?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-COLLECTION-NOT-GENL-OF-PARTITION?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-COLLECTION-NOT-GENL-OF-PARTITION?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("TMS"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("GAP"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-EL-FORMULA"), list(QUOTE, list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("partitionedInto")), makeSymbol("?TYPE"), makeSymbol("?PARTITION")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?SUBTYPE"), makeSymbol("?PARTITION"))), list(constant_handles.reader_make_constant_shell(makeString("genls")), makeSymbol("?SUBTYPE"), makeSymbol("?TYPE")))), makeKeyword("KBI-DOC"), makeString("test COLLECTION for partition cells that are not specs") });

    static private final SubLList $list_alt50 = list(makeSymbol("PARTITION"), makeSymbol("CELL"), makeSymbol("MT"));

    static private final SubLString $str_alt51$___s_has_partition__s_with_cell__ = makeString("~%~s has partition ~s with cell ~s that is not a spec in mt ~s");

    private static final SubLSymbol COLLECTION_NOT_GENL_OF_PARTITION_IN_MTS_INT = makeSymbol("COLLECTION-NOT-GENL-OF-PARTITION-IN-MTS-INT");

    public static final SubLObject $$partitionedInto = constant_handles.reader_make_constant_shell(makeString("partitionedInto"));

    public static final SubLObject $$ThePartition = constant_handles.reader_make_constant_shell(makeString("ThePartition"));

    public static final SubLSymbol $collection_isa_is_genl_results$ = makeSymbol("*COLLECTION-ISA-IS-GENL-RESULTS*");

    static private final SubLString $str_alt56$violators_of_kbi_module__COLLECTI = makeString("violators of kbi module :COLLECTION-ISA-IS-GENL");

    public static final SubLSymbol $collection_isa_is_genl_time$ = makeSymbol("*COLLECTION-ISA-IS-GENL-TIME*");

    static private final SubLString $str_alt58$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :COLLECTION-ISA-IS-GENL");

    public static final SubLSymbol $collection_isa_is_genl_count$ = makeSymbol("*COLLECTION-ISA-IS-GENL-COUNT*");

    static private final SubLString $str_alt60$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :COLLECTION-ISA-IS-GENL");

    private static final SubLSymbol $COLLECTION_ISA_IS_GENL = makeKeyword("COLLECTION-ISA-IS-GENL");

    static private final SubLList $list_alt62 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*COLLECTION-ISA-IS-GENL-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*COLLECTION-ISA-IS-GENL-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*COLLECTION-ISA-IS-GENL-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("COLLECTION"), makeKeyword("KBI-LEVEL"), ONE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-COLLECTION-ISA-IS-GENL?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("COLLECTION-ISA-IS-GENL?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-COLLECTION-ISA-IS-GENL?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-COLLECTION-ISA-IS-GENL?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("TMS"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("CONFLICT"), makeKeyword("KBI-RESULT-TYPE"), $WARN, makeKeyword("KBI-EL-FORMULA"), list(QUOTE, list(constant_handles.reader_make_constant_shell(makeString("not")), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?COL"), makeSymbol("?META-COL")), list(constant_handles.reader_make_constant_shell(makeString("genls")), makeSymbol("?COL"), makeSymbol("?META-COL"))))), makeKeyword("KBI-DOC"), makeString("test COLLECTION for having a common #$isa and #$genls") });

    static private final SubLList $list_alt63 = list(makeSymbol("MT"), makeSymbol("ISA-GENL"));

    static private final SubLString $str_alt64$___s___isa__s_____but_also___genl = makeString("~%~s #$isa ~s ~%  but also #$genls ~s ~%  [in ~s]");

    public static final SubLObject $$genls = constant_handles.reader_make_constant_shell(makeString("genls"));

    public static final SubLObject $$Collection = constant_handles.reader_make_constant_shell(makeString("Collection"));

    private static final SubLSymbol COLLECTION_ISA_IS_GENL_IN_MT = makeSymbol("COLLECTION-ISA-IS-GENL-IN-MT");

    private static final SubLSymbol REDUCE_MTS_MAX = makeSymbol("REDUCE-MTS-MAX");



    private static final SubLSymbol MIN_MTS = makeSymbol("MIN-MTS");

    private static final SubLSymbol MAX_MTS = makeSymbol("MAX-MTS");



    private static final SubLSymbol MAX_COLS = makeSymbol("MAX-COLS");

    public static final SubLSymbol $collection_partition_cells_intersect_results$ = makeSymbol("*COLLECTION-PARTITION-CELLS-INTERSECT-RESULTS*");

    static private final SubLString $str_alt75$violators_of_kbi_module__COLLECTI = makeString("violators of kbi module :COLLECTION-PARTITION-CELLS-INTERSECT");

    public static final SubLSymbol $collection_partition_cells_intersect_time$ = makeSymbol("*COLLECTION-PARTITION-CELLS-INTERSECT-TIME*");

    static private final SubLString $str_alt77$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :COLLECTION-PARTITION-CELLS-INTERSECT");

    public static final SubLSymbol $collection_partition_cells_intersect_count$ = makeSymbol("*COLLECTION-PARTITION-CELLS-INTERSECT-COUNT*");

    static private final SubLString $str_alt79$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :COLLECTION-PARTITION-CELLS-INTERSECT");

    private static final SubLSymbol $COLLECTION_PARTITION_CELLS_INTERSECT = makeKeyword("COLLECTION-PARTITION-CELLS-INTERSECT");

    static private final SubLList $list_alt81 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*COLLECTION-PARTITION-CELLS-INTERSECT-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*COLLECTION-PARTITION-CELLS-INTERSECT-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*COLLECTION-PARTITION-CELLS-INTERSECT-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("COLLECTION"), makeKeyword("KBI-LEVEL"), ONE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-COLLECTION-PARTITION-CELLS-INTERSECT?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("COLLECTION-PARTITION-CELLS-INTERSECT?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-COLLECTION-PARTITION-CELLS-INTERSECT?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-COLLECTION-PARTITION-CELLS-INTERSECT?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("TMS"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("CONFLICT"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-AUTHOR"), makeString("Foxvog"), makeKeyword("KBI-EL-FORMULA"), list(QUOTE, list(constant_handles.reader_make_constant_shell(makeString("not")), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("partitionedInto")), makeSymbol("?TYPE"), makeSymbol("?PARTITION")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?CELL-1"), makeSymbol("?PARTITION")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?CELL-2"), makeSymbol("?PARTITION")), list(constant_handles.reader_make_constant_shell(makeString("genls")), makeSymbol("?SUB1"), makeSymbol("?SUB2"))))), makeKeyword("KBI-DOC"), makeString("test COLLECTION for partition cells that intersect") });

    static private final SubLList $list_alt82 = list(makeSymbol("PARTITION"), makeSymbol("CELL-1"), makeSymbol("CELL-2"), makeSymbol("MT"));

    static private final SubLString $str_alt83$___s_has_partition__s_with_inters = makeString("~%~s has partition ~s with intersecting cells ~s and ~s in mt ~s");

    private static final SubLSymbol COLLECTION_PARTITION_CELLS_INTERSECT_IN_MTS_INT = makeSymbol("COLLECTION-PARTITION-CELLS-INTERSECT-IN-MTS-INT");

    // // Initializers
    public void declareFunctions() {
        declare_kbi_collection_file();
    }

    public void initializeVariables() {
        init_kbi_collection_file();
    }

    public void runTopLevelForms() {
        setup_kbi_collection_file();
    }
}

