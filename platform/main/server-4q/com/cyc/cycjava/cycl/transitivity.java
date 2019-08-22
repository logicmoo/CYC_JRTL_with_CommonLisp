package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.utilities_macros.$unprovided$;
import static com.cyc.cycjava.cycl.utilities_macros.unprovided_argumentP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.gensym;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.get;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.put;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.remprop;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class transitivity extends SubLTranslatedFile {
    public static final SubLFile me = new transitivity();

    public static final String myName = "com.cyc.cycjava.cycl.transitivity";

    public static final String myFingerPrint = "90c0d6d350c257f028ef02d354edf701e4a32d7254a58765c42c5c352a3e24d1";

    // Internal Constants
    public static final SubLSymbol INSTANTIATE_SBHL_MARKING_SPACE_FOR = makeSymbol("INSTANTIATE-SBHL-MARKING-SPACE-FOR");

    public static final SubLSymbol $gt_marking_table$ = makeSymbol("*GT-MARKING-TABLE*");

    public static final SubLString $str2$_s_is_not_a_transitive_predicate = makeString("~s is not a transitive predicate");

    public static final SubLString $$$SKSI_SQL_statement_cache_ = makeString("SKSI SQL statement cache ");





    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));



    public static final SubLString $str8$_s_is_not_a_valid_transitivity_mo = makeString("~s is not a valid transitivity module.");



    public static final SubLString $str10$_s_is_not_a_valid_gt_method_ = makeString("~s is not a valid gt method.");

    public static final SubLList $list11 = list(makeSymbol("PREDICATE"), makeSymbol("INDEX-ARG"), makeSymbol("GATHER-ARG"));





    public static final SubLString $str14$method__s_maps_into_illegal_gt_fu = makeString("method ~s maps into illegal gt function ~s)");

    public static final SubLString $str15$illegal_transitivity_method___s = makeString("illegal transitivity method: ~s");



    public static final SubLSymbol $sym17$_OPTIONAL = makeSymbol("&OPTIONAL");









    public static final SubLString $str22$_s_was_not_a_valid_transitivity_m = makeString("~s was not a valid transitivity-module parameter");

    public static SubLObject with_new_gt_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(INSTANTIATE_SBHL_MARKING_SPACE_FOR, $gt_marking_table$, append(body, NIL));
    }

    public static SubLObject gtm(final SubLObject predicate, final SubLObject method, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = $unprovided$.getGlobalValue();
        }
        if (arg2 == UNPROVIDED) {
            arg2 = $unprovided$.getGlobalValue();
        }
        if (arg3 == UNPROVIDED) {
            arg3 = $unprovided$.getGlobalValue();
        }
        if (arg4 == UNPROVIDED) {
            arg4 = $unprovided$.getGlobalValue();
        }
        if (arg5 == UNPROVIDED) {
            arg5 = $unprovided$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = gt_mt_arg_value(method, arg1, arg2, arg3, arg4, arg5);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL != sksi_sks_interaction.within_sksi_sql_connection_resourcingP()) {
                if ((NIL != kb_accessors.transitive_predicateP(predicate)) || (NIL != gt_vars.$gt_handle_non_transitive_predicateP$.getDynamicValue(thread))) {
                    final SubLObject gti_function = gt_method_function(method);
                    if (gti_function.isFunctionSpec()) {
                        final SubLObject _prev_bind_0_$1 = gt_vars.$gt_pred$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$2 = gt_vars.$gt_index_arg$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$3 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                        try {
                            gt_vars.$gt_pred$.bind(predicate, thread);
                            gt_vars.$gt_index_arg$.bind(ggt_index_arg(predicate), thread);
                            gt_vars.$gt_gather_arg$.bind(ggt_gather_arg(predicate), thread);
                            if (NIL != gt_vars.$gt_marking_table$.getDynamicValue(thread)) {
                                result = apply_gti_function(gti_function, arg1, arg2, arg3, arg4, arg5);
                            } else {
                                final SubLObject _prev_bind_0_$2 = gt_vars.$gt_marking_table$.currentBinding(thread);
                                try {
                                    gt_vars.$gt_marking_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    try {
                                        result = apply_gti_function(gti_function, arg1, arg2, arg3, arg4, arg5);
                                    } finally {
                                        final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            sbhl_marking_vars.free_sbhl_marking_space(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                        }
                                    }
                                } finally {
                                    gt_vars.$gt_marking_table$.rebind(_prev_bind_0_$2, thread);
                                }
                            }
                        } finally {
                            gt_vars.$gt_gather_arg$.rebind(_prev_bind_2_$3, thread);
                            gt_vars.$gt_index_arg$.rebind(_prev_bind_1_$2, thread);
                            gt_vars.$gt_pred$.rebind(_prev_bind_0_$1, thread);
                        }
                    }
                } else {
                    gt_utilities.gt_error(THREE_INTEGER, $str2$_s_is_not_a_transitive_predicate, predicate, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            } else {
                final SubLObject _prev_bind_0_$4 = sksi_macros.$sksi_sql_connection_cache$.currentBinding(thread);
                final SubLObject _prev_bind_1_$3 = sksi_macros.$sksi_sql_statement_cache$.currentBinding(thread);
                final SubLObject _prev_bind_2_$4 = sksi_macros.$sksi_sql_statement_pool_lock$.currentBinding(thread);
                try {
                    sksi_macros.$sksi_sql_connection_cache$.bind(dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED), thread);
                    sksi_macros.$sksi_sql_statement_cache$.bind(dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED), thread);
                    sksi_macros.$sksi_sql_statement_pool_lock$.bind(make_lock(Strings.string(gensym($$$SKSI_SQL_statement_cache_))), thread);
                    SubLObject resourcing_caches_finalizedP = NIL;
                    try {
                        if ((NIL != kb_accessors.transitive_predicateP(predicate)) || (NIL != gt_vars.$gt_handle_non_transitive_predicateP$.getDynamicValue(thread))) {
                            final SubLObject gti_function2 = gt_method_function(method);
                            if (gti_function2.isFunctionSpec()) {
                                final SubLObject _prev_bind_0_$5 = gt_vars.$gt_pred$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$4 = gt_vars.$gt_index_arg$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$5 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                                try {
                                    gt_vars.$gt_pred$.bind(predicate, thread);
                                    gt_vars.$gt_index_arg$.bind(ggt_index_arg(predicate), thread);
                                    gt_vars.$gt_gather_arg$.bind(ggt_gather_arg(predicate), thread);
                                    if (NIL != gt_vars.$gt_marking_table$.getDynamicValue(thread)) {
                                        result = apply_gti_function(gti_function2, arg1, arg2, arg3, arg4, arg5);
                                    } else {
                                        final SubLObject _prev_bind_0_$6 = gt_vars.$gt_marking_table$.currentBinding(thread);
                                        try {
                                            gt_vars.$gt_marking_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                            try {
                                                result = apply_gti_function(gti_function2, arg1, arg2, arg3, arg4, arg5);
                                            } finally {
                                                final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values2 = getValuesAsVector();
                                                    sbhl_marking_vars.free_sbhl_marking_space(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                                                    restoreValuesFromVector(_values2);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                                }
                                            }
                                        } finally {
                                            gt_vars.$gt_marking_table$.rebind(_prev_bind_0_$6, thread);
                                        }
                                    }
                                } finally {
                                    gt_vars.$gt_gather_arg$.rebind(_prev_bind_2_$5, thread);
                                    gt_vars.$gt_index_arg$.rebind(_prev_bind_1_$4, thread);
                                    gt_vars.$gt_pred$.rebind(_prev_bind_0_$5, thread);
                                }
                            }
                        } else {
                            gt_utilities.gt_error(THREE_INTEGER, $str2$_s_is_not_a_transitive_predicate, predicate, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values3 = getValuesAsVector();
                            try {
                                resourcing_caches_finalizedP = sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                            } finally {
                                final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values_$16 = getValuesAsVector();
                                    if (NIL == resourcing_caches_finalizedP) {
                                        sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                                    }
                                    restoreValuesFromVector(_values_$16);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                                }
                            }
                            restoreValuesFromVector(_values3);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                        }
                    }
                } finally {
                    sksi_macros.$sksi_sql_statement_pool_lock$.rebind(_prev_bind_2_$4, thread);
                    sksi_macros.$sksi_sql_statement_cache$.rebind(_prev_bind_1_$3, thread);
                    sksi_macros.$sksi_sql_connection_cache$.rebind(_prev_bind_0_$4, thread);
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject gtm_in_mt(final SubLObject predicate, final SubLObject method, final SubLObject mt, SubLObject arg1, SubLObject arg2, SubLObject arg3) {
        if (arg1 == UNPROVIDED) {
            arg1 = $unprovided$.getGlobalValue();
        }
        if (arg2 == UNPROVIDED) {
            arg2 = $unprovided$.getGlobalValue();
        }
        if (arg3 == UNPROVIDED) {
            arg3 = $unprovided$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            result = gtm(predicate, method, arg1, arg2, arg3, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject gtm_in_all_mts(final SubLObject predicate, final SubLObject method, SubLObject arg1, SubLObject arg2, SubLObject arg3) {
        if (arg1 == UNPROVIDED) {
            arg1 = $unprovided$.getGlobalValue();
        }
        if (arg2 == UNPROVIDED) {
            arg2 = $unprovided$.getGlobalValue();
        }
        if (arg3 == UNPROVIDED) {
            arg3 = $unprovided$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = gtm(predicate, method, arg1, arg2, arg3, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject gti(final SubLObject module, final SubLObject method, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = $unprovided$.getGlobalValue();
        }
        if (arg2 == UNPROVIDED) {
            arg2 = $unprovided$.getGlobalValue();
        }
        if (arg3 == UNPROVIDED) {
            arg3 = $unprovided$.getGlobalValue();
        }
        if (arg4 == UNPROVIDED) {
            arg4 = $unprovided$.getGlobalValue();
        }
        if (arg5 == UNPROVIDED) {
            arg5 = $unprovided$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_gti_state();
        if (NIL == gt_moduleP(module)) {
            gt_vars.$gt_warnings$.setDynamicValue(cons(list($INVALID_MODULE, $str8$_s_is_not_a_valid_transitivity_mo, module), gt_vars.$gt_warnings$.getDynamicValue(thread)), thread);
            return NIL;
        }
        final SubLObject gti_function = gt_method_function(method);
        if (!gti_function.isFunctionSpec()) {
            gt_vars.$gt_warnings$.setDynamicValue(cons(list($INVALID_METHOD, $str10$_s_is_not_a_valid_gt_method_, method), gt_vars.$gt_warnings$.getDynamicValue(thread)), thread);
            return NIL;
        }
        SubLObject result = NIL;
        final SubLObject accessors = gt_accessors(module);
        final SubLObject mt_var = gt_mt(module);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            if (NIL != accessors) {
                if (NIL != list_utilities.singletonP(accessors)) {
                    SubLObject current;
                    final SubLObject datum = current = accessors.first();
                    SubLObject predicate = NIL;
                    SubLObject index_arg = NIL;
                    SubLObject gather_arg = NIL;
                    destructuring_bind_must_consp(current, datum, $list11);
                    predicate = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list11);
                    index_arg = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list11);
                    gather_arg = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        result = gti_predicate(gti_function, arg1, arg2, arg3, arg4, arg5, predicate, index_arg, gather_arg);
                    } else {
                        cdestructuring_bind_error(datum, $list11);
                    }
                } else {
                    result = gti_accessors(gti_function, arg1, arg2, arg3, arg4, arg5, accessors);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject gti_predicate(final SubLObject gti_function, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject predicate, final SubLObject index_arg, final SubLObject gather_arg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_pred$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_link_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = gt_vars.$gt_index_arg$.currentBinding(thread);
        final SubLObject _prev_bind_4 = gt_vars.$gt_gather_arg$.currentBinding(thread);
        try {
            gt_vars.$gt_pred$.bind(predicate, thread);
            gt_vars.$gt_link_type$.bind($ASSERTION, thread);
            gt_vars.$gt_index_arg$.bind(index_arg, thread);
            gt_vars.$gt_gather_arg$.bind(gather_arg, thread);
            result = apply_gti_function(gti_function, arg1, arg2, arg3, arg4, arg5);
        } finally {
            gt_vars.$gt_gather_arg$.rebind(_prev_bind_4, thread);
            gt_vars.$gt_index_arg$.rebind(_prev_bind_3, thread);
            gt_vars.$gt_link_type$.rebind(_prev_bind_2, thread);
            gt_vars.$gt_pred$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject gti_accessors(final SubLObject gti_function, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject accessors) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_accessors$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_link_type$.currentBinding(thread);
        try {
            gt_vars.$gt_accessors$.bind(accessors, thread);
            gt_vars.$gt_link_type$.bind($ACCESSORS, thread);
            result = apply_gti_function(gti_function, arg1, arg2, arg3, arg4, arg5);
        } finally {
            gt_vars.$gt_link_type$.rebind(_prev_bind_2, thread);
            gt_vars.$gt_accessors$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject apply_gti_function(final SubLObject gti_function, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5) {
        if (NIL != unprovided_argumentP(arg1)) {
            return funcall(gti_function);
        }
        if (NIL != unprovided_argumentP(arg2)) {
            return funcall(gti_function, arg1);
        }
        if (NIL != unprovided_argumentP(arg3)) {
            return funcall(gti_function, arg1, arg2);
        }
        if (NIL != unprovided_argumentP(arg4)) {
            return funcall(gti_function, arg1, arg2, arg3);
        }
        if (NIL != unprovided_argumentP(arg5)) {
            return funcall(gti_function, arg1, arg2, arg3, arg4);
        }
        return funcall(gti_function, arg1, arg2, arg3, arg4, arg5);
    }

    public static SubLObject reset_gti_state() {
        gt_vars.$gt_warnings$.setDynamicValue(NIL);
        return NIL;
    }

    public static SubLObject gt_method_function(final SubLObject method) {
        final SubLObject function = second(assoc(method, gt_vars.$gt_dispatch_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
        if (function.isFunctionSpec()) {
            return function;
        }
        if (NIL != function) {
            gt_utilities.gt_error(THREE_INTEGER, $str14$method__s_maps_into_illegal_gt_fu, method, function, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            gt_utilities.gt_error(THREE_INTEGER, $str15$illegal_transitivity_method___s, method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject gt_method_arg_list(final SubLObject method) {
        return third(assoc(method, gt_vars.$gt_dispatch_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject add_mt_default(final SubLObject default_mt, final SubLObject arg_list) {
        if ((NIL != subl_promotions.memberP(MT, member($sym17$_OPTIONAL, arg_list, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) && (NIL != hlmt.possibly_hlmt_p(default_mt))) {
            return subst(list(MT, default_mt), MT, arg_list, UNPROVIDED, UNPROVIDED);
        }
        return arg_list;
    }

    public static SubLObject gt_mt_arg(final SubLObject method) {
        return position(MT, remove($sym17$_OPTIONAL, third(assoc(method, gt_vars.$gt_dispatch_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject gt_mt_arg_value(final SubLObject method, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        SubLObject mt = NIL;
        final SubLObject pcase_var = gt_mt_arg(method);
        if (pcase_var.eql(ZERO_INTEGER)) {
            mt = arg1;
        } else
            if (pcase_var.eql(ONE_INTEGER)) {
                mt = arg2;
            } else
                if (pcase_var.eql(TWO_INTEGER)) {
                    mt = arg3;
                } else
                    if (pcase_var.eql(THREE_INTEGER)) {
                        mt = arg4;
                    } else
                        if (pcase_var.eql(FOUR_INTEGER)) {
                            mt = arg5;
                        }




        if (NIL != hlmt.hlmt_p(mt)) {
            return mt;
        }
        return NIL;
    }

    public static SubLObject gt_methodP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(v_object, gt_vars.$gt_methods$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject gt_moduleP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(v_object, gt_vars.$transitivity_modules$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject gt_predicate(final SubLObject module) {
        return get(module, $PREDICATE, UNPROVIDED);
    }

    public static SubLObject gt_mt(final SubLObject module) {
        return get(module, $MT, UNPROVIDED);
    }

    public static SubLObject gt_index_arg(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg = get(module, $INDEX_ARG, UNPROVIDED);
        if (NIL != arg) {
            return arg;
        }
        final SubLObject predicate = get(module, $PREDICATE, UNPROVIDED);
        if (NIL != predicate) {
            return ggt_index_arg(predicate);
        }
        return gt_vars.$gt_index_arg$.getDynamicValue(thread);
    }

    public static SubLObject gt_gather_arg(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg = get(module, $GATHER_ARG, UNPROVIDED);
        if (NIL != arg) {
            return arg;
        }
        final SubLObject predicate = get(module, $PREDICATE, UNPROVIDED);
        if (NIL != predicate) {
            return ggt_gather_arg(predicate);
        }
        return gt_vars.$gt_gather_arg$.getDynamicValue(thread);
    }

    public static SubLObject ggt_index_arg(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fan_out_arg = kb_accessors.fan_out_arg(predicate, UNPROVIDED);
        if (NIL != fan_out_arg) {
            return fan_out_arg;
        }
        return gt_vars.$gt_index_arg$.getDynamicValue(thread);
    }

    public static SubLObject ggt_gather_arg(final SubLObject predicate) {
        if (ggt_index_arg(predicate).numE(TWO_INTEGER)) {
            return ONE_INTEGER;
        }
        return TWO_INTEGER;
    }

    public static SubLObject gt_accessors(final SubLObject module) {
        final SubLObject accessors = get(module, $ACCESSORS, UNPROVIDED);
        if (NIL != accessors) {
            return accessors;
        }
        return list(list(gt_predicate(module), gt_index_arg(module), gt_gather_arg(module)));
    }

    public static SubLObject setup_transitivity_module(final SubLObject module, final SubLObject plist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = gt_vars.$gt_parameters$.getDynamicValue(thread);
        SubLObject indicator = NIL;
        indicator = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            remprop(module, indicator);
            cdolist_list_var = cdolist_list_var.rest();
            indicator = cdolist_list_var.first();
        } 
        SubLObject parameters = NIL;
        SubLObject parameter = NIL;
        SubLObject value = NIL;
        parameters = plist;
        parameter = parameters.first();
        value = second(parameters);
        while (NIL != parameters) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subl_promotions.memberP(parameter, gt_vars.$gt_parameters$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))) {
                Errors.error($str22$_s_was_not_a_valid_transitivity_m, parameter);
            }
            put(module, parameter, value);
            parameters = cddr(parameters);
            parameter = parameters.first();
            value = second(parameters);
        } 
        return module;
    }

    public static SubLObject declare_transitivity_file() {
        declareMacro(me, "with_new_gt_space", "WITH-NEW-GT-SPACE");
        declareFunction(me, "gtm", "GTM", 2, 5, false);
        declareFunction(me, "gtm_in_mt", "GTM-IN-MT", 3, 3, false);
        declareFunction(me, "gtm_in_all_mts", "GTM-IN-ALL-MTS", 2, 3, false);
        declareFunction(me, "gti", "GTI", 2, 5, false);
        declareFunction(me, "gti_predicate", "GTI-PREDICATE", 9, 0, false);
        declareFunction(me, "gti_accessors", "GTI-ACCESSORS", 7, 0, false);
        declareFunction(me, "apply_gti_function", "APPLY-GTI-FUNCTION", 6, 0, false);
        declareFunction(me, "reset_gti_state", "RESET-GTI-STATE", 0, 0, false);
        declareFunction(me, "gt_method_function", "GT-METHOD-FUNCTION", 1, 0, false);
        declareFunction(me, "gt_method_arg_list", "GT-METHOD-ARG-LIST", 1, 0, false);
        declareFunction(me, "add_mt_default", "ADD-MT-DEFAULT", 2, 0, false);
        declareFunction(me, "gt_mt_arg", "GT-MT-ARG", 1, 0, false);
        declareFunction(me, "gt_mt_arg_value", "GT-MT-ARG-VALUE", 1, 5, false);
        declareFunction(me, "gt_methodP", "GT-METHOD?", 1, 0, false);
        declareFunction(me, "gt_moduleP", "GT-MODULE?", 1, 0, false);
        declareFunction(me, "gt_predicate", "GT-PREDICATE", 1, 0, false);
        declareFunction(me, "gt_mt", "GT-MT", 1, 0, false);
        declareFunction(me, "gt_index_arg", "GT-INDEX-ARG", 1, 0, false);
        declareFunction(me, "gt_gather_arg", "GT-GATHER-ARG", 1, 0, false);
        declareFunction(me, "ggt_index_arg", "GGT-INDEX-ARG", 1, 0, false);
        declareFunction(me, "ggt_gather_arg", "GGT-GATHER-ARG", 1, 0, false);
        declareFunction(me, "gt_accessors", "GT-ACCESSORS", 1, 0, false);
        declareFunction(me, "setup_transitivity_module", "SETUP-TRANSITIVITY-MODULE", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_transitivity_file() {
        return NIL;
    }

    public static SubLObject setup_transitivity_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_transitivity_file();
    }

    @Override
    public void initializeVariables() {
        init_transitivity_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_transitivity_file();
    }

    
}

/**
 * Total time: 402 ms
 */
