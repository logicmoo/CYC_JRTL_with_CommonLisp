package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class transitivity extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.transitivity";
    public static final String myFingerPrint = "90c0d6d350c257f028ef02d354edf701e4a32d7254a58765c42c5c352a3e24d1";
    private static final SubLSymbol $sym0$INSTANTIATE_SBHL_MARKING_SPACE_FOR;
    private static final SubLSymbol $sym1$_GT_MARKING_TABLE_;
    private static final SubLString $str2$_s_is_not_a_transitive_predicate;
    private static final SubLString $str3$SKSI_SQL_statement_cache_;
    private static final SubLSymbol $sym4$RELEVANT_MT_IS_GENL_MT;
    private static final SubLSymbol $sym5$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const6$EverythingPSC;
    private static final SubLSymbol $kw7$INVALID_MODULE;
    private static final SubLString $str8$_s_is_not_a_valid_transitivity_mo;
    private static final SubLSymbol $kw9$INVALID_METHOD;
    private static final SubLString $str10$_s_is_not_a_valid_gt_method_;
    private static final SubLList $list11;
    private static final SubLSymbol $kw12$ASSERTION;
    private static final SubLSymbol $kw13$ACCESSORS;
    private static final SubLString $str14$method__s_maps_into_illegal_gt_fu;
    private static final SubLString $str15$illegal_transitivity_method___s;
    private static final SubLSymbol $sym16$MT;
    private static final SubLSymbol $sym17$_OPTIONAL;
    private static final SubLSymbol $kw18$PREDICATE;
    private static final SubLSymbol $kw19$MT;
    private static final SubLSymbol $kw20$INDEX_ARG;
    private static final SubLSymbol $kw21$GATHER_ARG;
    private static final SubLString $str22$_s_was_not_a_valid_transitivity_m;
    
    @SubLTranslatedFile.SubL(source = "cycl/transitivity.lisp", position = 756L)
    public static SubLObject with_new_gt_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)transitivity.$sym0$INSTANTIATE_SBHL_MARKING_SPACE_FOR, (SubLObject)transitivity.$sym1$_GT_MARKING_TABLE_, ConsesLow.append(body, (SubLObject)transitivity.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transitivity.lisp", position = 1003L)
    public static SubLObject gtm(final SubLObject predicate, final SubLObject method, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == transitivity.UNPROVIDED) {
            arg1 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg2 == transitivity.UNPROVIDED) {
            arg2 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg3 == transitivity.UNPROVIDED) {
            arg3 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg4 == transitivity.UNPROVIDED) {
            arg4 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg5 == transitivity.UNPROVIDED) {
            arg5 = utilities_macros.$unprovided$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)transitivity.NIL;
        final SubLObject mt_var = gt_mt_arg_value(method, arg1, arg2, arg3, arg4, arg5);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (transitivity.NIL != sksi_sks_interaction.within_sksi_sql_connection_resourcingP()) {
                if (transitivity.NIL != kb_accessors.transitive_predicateP(predicate) || transitivity.NIL != gt_vars.$gt_handle_non_transitive_predicateP$.getDynamicValue(thread)) {
                    final SubLObject gti_function = gt_method_function(method);
                    if (gti_function.isFunctionSpec()) {
                        final SubLObject _prev_bind_0_$1 = gt_vars.$gt_pred$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$2 = gt_vars.$gt_index_arg$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$3 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                        try {
                            gt_vars.$gt_pred$.bind(predicate, thread);
                            gt_vars.$gt_index_arg$.bind(ggt_index_arg(predicate), thread);
                            gt_vars.$gt_gather_arg$.bind(ggt_gather_arg(predicate), thread);
                            if (transitivity.NIL != gt_vars.$gt_marking_table$.getDynamicValue(thread)) {
                                result = apply_gti_function(gti_function, arg1, arg2, arg3, arg4, arg5);
                            }
                            else {
                                final SubLObject _prev_bind_0_$2 = gt_vars.$gt_marking_table$.currentBinding(thread);
                                try {
                                    gt_vars.$gt_marking_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    try {
                                        result = apply_gti_function(gti_function, arg1, arg2, arg3, arg4, arg5);
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)transitivity.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            sbhl_marking_vars.free_sbhl_marking_space(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                        }
                                    }
                                }
                                finally {
                                    gt_vars.$gt_marking_table$.rebind(_prev_bind_0_$2, thread);
                                }
                            }
                        }
                        finally {
                            gt_vars.$gt_gather_arg$.rebind(_prev_bind_2_$3, thread);
                            gt_vars.$gt_index_arg$.rebind(_prev_bind_1_$2, thread);
                            gt_vars.$gt_pred$.rebind(_prev_bind_0_$1, thread);
                        }
                    }
                }
                else {
                    gt_utilities.gt_error((SubLObject)transitivity.THREE_INTEGER, (SubLObject)transitivity.$str2$_s_is_not_a_transitive_predicate, predicate, (SubLObject)transitivity.UNPROVIDED, (SubLObject)transitivity.UNPROVIDED, (SubLObject)transitivity.UNPROVIDED, (SubLObject)transitivity.UNPROVIDED);
                }
            }
            else {
                final SubLObject _prev_bind_0_$4 = sksi_macros.$sksi_sql_connection_cache$.currentBinding(thread);
                final SubLObject _prev_bind_1_$3 = sksi_macros.$sksi_sql_statement_cache$.currentBinding(thread);
                final SubLObject _prev_bind_2_$4 = sksi_macros.$sksi_sql_statement_pool_lock$.currentBinding(thread);
                try {
                    sksi_macros.$sksi_sql_connection_cache$.bind(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)transitivity.EQUALP), (SubLObject)transitivity.UNPROVIDED), thread);
                    sksi_macros.$sksi_sql_statement_cache$.bind(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)transitivity.EQ), (SubLObject)transitivity.UNPROVIDED), thread);
                    sksi_macros.$sksi_sql_statement_pool_lock$.bind(Locks.make_lock(Strings.string(Symbols.gensym((SubLObject)transitivity.$str3$SKSI_SQL_statement_cache_))), thread);
                    SubLObject resourcing_caches_finalizedP = (SubLObject)transitivity.NIL;
                    try {
                        if (transitivity.NIL != kb_accessors.transitive_predicateP(predicate) || transitivity.NIL != gt_vars.$gt_handle_non_transitive_predicateP$.getDynamicValue(thread)) {
                            final SubLObject gti_function2 = gt_method_function(method);
                            if (gti_function2.isFunctionSpec()) {
                                final SubLObject _prev_bind_0_$5 = gt_vars.$gt_pred$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$4 = gt_vars.$gt_index_arg$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$5 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                                try {
                                    gt_vars.$gt_pred$.bind(predicate, thread);
                                    gt_vars.$gt_index_arg$.bind(ggt_index_arg(predicate), thread);
                                    gt_vars.$gt_gather_arg$.bind(ggt_gather_arg(predicate), thread);
                                    if (transitivity.NIL != gt_vars.$gt_marking_table$.getDynamicValue(thread)) {
                                        result = apply_gti_function(gti_function2, arg1, arg2, arg3, arg4, arg5);
                                    }
                                    else {
                                        final SubLObject _prev_bind_0_$6 = gt_vars.$gt_marking_table$.currentBinding(thread);
                                        try {
                                            gt_vars.$gt_marking_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                            try {
                                                result = apply_gti_function(gti_function2, arg1, arg2, arg3, arg4, arg5);
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)transitivity.T, thread);
                                                    final SubLObject _values2 = Values.getValuesAsVector();
                                                    sbhl_marking_vars.free_sbhl_marking_space(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                                                    Values.restoreValuesFromVector(_values2);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                                }
                                            }
                                        }
                                        finally {
                                            gt_vars.$gt_marking_table$.rebind(_prev_bind_0_$6, thread);
                                        }
                                    }
                                }
                                finally {
                                    gt_vars.$gt_gather_arg$.rebind(_prev_bind_2_$5, thread);
                                    gt_vars.$gt_index_arg$.rebind(_prev_bind_1_$4, thread);
                                    gt_vars.$gt_pred$.rebind(_prev_bind_0_$5, thread);
                                }
                            }
                        }
                        else {
                            gt_utilities.gt_error((SubLObject)transitivity.THREE_INTEGER, (SubLObject)transitivity.$str2$_s_is_not_a_transitive_predicate, predicate, (SubLObject)transitivity.UNPROVIDED, (SubLObject)transitivity.UNPROVIDED, (SubLObject)transitivity.UNPROVIDED, (SubLObject)transitivity.UNPROVIDED);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)transitivity.T, thread);
                            final SubLObject _values3 = Values.getValuesAsVector();
                            try {
                                resourcing_caches_finalizedP = sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                            }
                            finally {
                                final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)transitivity.T, thread);
                                    final SubLObject _values_$16 = Values.getValuesAsVector();
                                    if (transitivity.NIL == resourcing_caches_finalizedP) {
                                        sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                                    }
                                    Values.restoreValuesFromVector(_values_$16);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                                }
                            }
                            Values.restoreValuesFromVector(_values3);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                        }
                    }
                }
                finally {
                    sksi_macros.$sksi_sql_statement_pool_lock$.rebind(_prev_bind_2_$4, thread);
                    sksi_macros.$sksi_sql_statement_cache$.rebind(_prev_bind_1_$3, thread);
                    sksi_macros.$sksi_sql_connection_cache$.rebind(_prev_bind_0_$4, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transitivity.lisp", position = 2190L)
    public static SubLObject gtm_in_mt(final SubLObject predicate, final SubLObject method, final SubLObject mt, SubLObject arg1, SubLObject arg2, SubLObject arg3) {
        if (arg1 == transitivity.UNPROVIDED) {
            arg1 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg2 == transitivity.UNPROVIDED) {
            arg2 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg3 == transitivity.UNPROVIDED) {
            arg3 = utilities_macros.$unprovided$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)transitivity.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)transitivity.$sym4$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            result = gtm(predicate, method, arg1, arg2, arg3, (SubLObject)transitivity.UNPROVIDED, (SubLObject)transitivity.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transitivity.lisp", position = 2477L)
    public static SubLObject gtm_in_all_mts(final SubLObject predicate, final SubLObject method, SubLObject arg1, SubLObject arg2, SubLObject arg3) {
        if (arg1 == transitivity.UNPROVIDED) {
            arg1 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg2 == transitivity.UNPROVIDED) {
            arg2 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg3 == transitivity.UNPROVIDED) {
            arg3 = utilities_macros.$unprovided$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)transitivity.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)transitivity.$sym5$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(transitivity.$const6$EverythingPSC, thread);
            result = gtm(predicate, method, arg1, arg2, arg3, (SubLObject)transitivity.UNPROVIDED, (SubLObject)transitivity.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transitivity.lisp", position = 2745L)
    public static SubLObject gti(final SubLObject module, final SubLObject method, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == transitivity.UNPROVIDED) {
            arg1 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg2 == transitivity.UNPROVIDED) {
            arg2 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg3 == transitivity.UNPROVIDED) {
            arg3 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg4 == transitivity.UNPROVIDED) {
            arg4 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg5 == transitivity.UNPROVIDED) {
            arg5 = utilities_macros.$unprovided$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_gti_state();
        if (transitivity.NIL == gt_moduleP(module)) {
            gt_vars.$gt_warnings$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)transitivity.$kw7$INVALID_MODULE, (SubLObject)transitivity.$str8$_s_is_not_a_valid_transitivity_mo, module), gt_vars.$gt_warnings$.getDynamicValue(thread)), thread);
            return (SubLObject)transitivity.NIL;
        }
        final SubLObject gti_function = gt_method_function(method);
        if (!gti_function.isFunctionSpec()) {
            gt_vars.$gt_warnings$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)transitivity.$kw9$INVALID_METHOD, (SubLObject)transitivity.$str10$_s_is_not_a_valid_gt_method_, method), gt_vars.$gt_warnings$.getDynamicValue(thread)), thread);
            return (SubLObject)transitivity.NIL;
        }
        SubLObject result = (SubLObject)transitivity.NIL;
        final SubLObject accessors = gt_accessors(module);
        final SubLObject mt_var = gt_mt(module);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            if (transitivity.NIL != accessors) {
                if (transitivity.NIL != list_utilities.singletonP(accessors)) {
                    SubLObject current;
                    final SubLObject datum = current = accessors.first();
                    SubLObject predicate = (SubLObject)transitivity.NIL;
                    SubLObject index_arg = (SubLObject)transitivity.NIL;
                    SubLObject gather_arg = (SubLObject)transitivity.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)transitivity.$list11);
                    predicate = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)transitivity.$list11);
                    index_arg = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)transitivity.$list11);
                    gather_arg = current.first();
                    current = current.rest();
                    if (transitivity.NIL == current) {
                        result = gti_predicate(gti_function, arg1, arg2, arg3, arg4, arg5, predicate, index_arg, gather_arg);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)transitivity.$list11);
                    }
                }
                else {
                    result = gti_accessors(gti_function, arg1, arg2, arg3, arg4, arg5, accessors);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transitivity.lisp", position = 3825L)
    public static SubLObject gti_predicate(final SubLObject gti_function, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject predicate, final SubLObject index_arg, final SubLObject gather_arg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)transitivity.NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_pred$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_link_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = gt_vars.$gt_index_arg$.currentBinding(thread);
        final SubLObject _prev_bind_4 = gt_vars.$gt_gather_arg$.currentBinding(thread);
        try {
            gt_vars.$gt_pred$.bind(predicate, thread);
            gt_vars.$gt_link_type$.bind((SubLObject)transitivity.$kw12$ASSERTION, thread);
            gt_vars.$gt_index_arg$.bind(index_arg, thread);
            gt_vars.$gt_gather_arg$.bind(gather_arg, thread);
            result = apply_gti_function(gti_function, arg1, arg2, arg3, arg4, arg5);
        }
        finally {
            gt_vars.$gt_gather_arg$.rebind(_prev_bind_4, thread);
            gt_vars.$gt_index_arg$.rebind(_prev_bind_3, thread);
            gt_vars.$gt_link_type$.rebind(_prev_bind_2, thread);
            gt_vars.$gt_pred$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transitivity.lisp", position = 4174L)
    public static SubLObject gti_accessors(final SubLObject gti_function, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject accessors) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)transitivity.NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_accessors$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_link_type$.currentBinding(thread);
        try {
            gt_vars.$gt_accessors$.bind(accessors, thread);
            gt_vars.$gt_link_type$.bind((SubLObject)transitivity.$kw13$ACCESSORS, thread);
            result = apply_gti_function(gti_function, arg1, arg2, arg3, arg4, arg5);
        }
        finally {
            gt_vars.$gt_link_type$.rebind(_prev_bind_2, thread);
            gt_vars.$gt_accessors$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transitivity.lisp", position = 4435L)
    public static SubLObject apply_gti_function(final SubLObject gti_function, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5) {
        if (transitivity.NIL != utilities_macros.unprovided_argumentP(arg1)) {
            return Functions.funcall(gti_function);
        }
        if (transitivity.NIL != utilities_macros.unprovided_argumentP(arg2)) {
            return Functions.funcall(gti_function, arg1);
        }
        if (transitivity.NIL != utilities_macros.unprovided_argumentP(arg3)) {
            return Functions.funcall(gti_function, arg1, arg2);
        }
        if (transitivity.NIL != utilities_macros.unprovided_argumentP(arg4)) {
            return Functions.funcall(gti_function, arg1, arg2, arg3);
        }
        if (transitivity.NIL != utilities_macros.unprovided_argumentP(arg5)) {
            return Functions.funcall(gti_function, arg1, arg2, arg3, arg4);
        }
        return Functions.funcall(gti_function, arg1, arg2, arg3, arg4, arg5);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transitivity.lisp", position = 4927L)
    public static SubLObject reset_gti_state() {
        gt_vars.$gt_warnings$.setDynamicValue((SubLObject)transitivity.NIL);
        return (SubLObject)transitivity.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transitivity.lisp", position = 4996L)
    public static SubLObject gt_method_function(final SubLObject method) {
        final SubLObject function = conses_high.second(conses_high.assoc(method, gt_vars.$gt_dispatch_table$.getGlobalValue(), (SubLObject)transitivity.UNPROVIDED, (SubLObject)transitivity.UNPROVIDED));
        if (function.isFunctionSpec()) {
            return function;
        }
        if (transitivity.NIL != function) {
            gt_utilities.gt_error((SubLObject)transitivity.THREE_INTEGER, (SubLObject)transitivity.$str14$method__s_maps_into_illegal_gt_fu, method, function, (SubLObject)transitivity.UNPROVIDED, (SubLObject)transitivity.UNPROVIDED, (SubLObject)transitivity.UNPROVIDED);
        }
        else {
            gt_utilities.gt_error((SubLObject)transitivity.THREE_INTEGER, (SubLObject)transitivity.$str15$illegal_transitivity_method___s, method, (SubLObject)transitivity.UNPROVIDED, (SubLObject)transitivity.UNPROVIDED, (SubLObject)transitivity.UNPROVIDED, (SubLObject)transitivity.UNPROVIDED);
        }
        return (SubLObject)transitivity.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transitivity.lisp", position = 5355L)
    public static SubLObject gt_method_arg_list(final SubLObject method) {
        return conses_high.third(conses_high.assoc(method, gt_vars.$gt_dispatch_table$.getGlobalValue(), (SubLObject)transitivity.UNPROVIDED, (SubLObject)transitivity.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transitivity.lisp", position = 5444L)
    public static SubLObject add_mt_default(final SubLObject default_mt, final SubLObject arg_list) {
        if (transitivity.NIL != subl_promotions.memberP((SubLObject)transitivity.$sym16$MT, conses_high.member((SubLObject)transitivity.$sym17$_OPTIONAL, arg_list, (SubLObject)transitivity.UNPROVIDED, (SubLObject)transitivity.UNPROVIDED), (SubLObject)transitivity.UNPROVIDED, (SubLObject)transitivity.UNPROVIDED) && transitivity.NIL != hlmt.possibly_hlmt_p(default_mt)) {
            return conses_high.subst((SubLObject)ConsesLow.list((SubLObject)transitivity.$sym16$MT, default_mt), (SubLObject)transitivity.$sym16$MT, arg_list, (SubLObject)transitivity.UNPROVIDED, (SubLObject)transitivity.UNPROVIDED);
        }
        return arg_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transitivity.lisp", position = 5658L)
    public static SubLObject gt_mt_arg(final SubLObject method) {
        return Sequences.position((SubLObject)transitivity.$sym16$MT, Sequences.remove((SubLObject)transitivity.$sym17$_OPTIONAL, conses_high.third(conses_high.assoc(method, gt_vars.$gt_dispatch_table$.getGlobalValue(), (SubLObject)transitivity.UNPROVIDED, (SubLObject)transitivity.UNPROVIDED)), (SubLObject)transitivity.UNPROVIDED, (SubLObject)transitivity.UNPROVIDED, (SubLObject)transitivity.UNPROVIDED, (SubLObject)transitivity.UNPROVIDED, (SubLObject)transitivity.UNPROVIDED), (SubLObject)transitivity.UNPROVIDED, (SubLObject)transitivity.UNPROVIDED, (SubLObject)transitivity.UNPROVIDED, (SubLObject)transitivity.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transitivity.lisp", position = 5773L)
    public static SubLObject gt_mt_arg_value(final SubLObject method, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == transitivity.UNPROVIDED) {
            arg1 = (SubLObject)transitivity.NIL;
        }
        if (arg2 == transitivity.UNPROVIDED) {
            arg2 = (SubLObject)transitivity.NIL;
        }
        if (arg3 == transitivity.UNPROVIDED) {
            arg3 = (SubLObject)transitivity.NIL;
        }
        if (arg4 == transitivity.UNPROVIDED) {
            arg4 = (SubLObject)transitivity.NIL;
        }
        if (arg5 == transitivity.UNPROVIDED) {
            arg5 = (SubLObject)transitivity.NIL;
        }
        SubLObject mt = (SubLObject)transitivity.NIL;
        final SubLObject pcase_var = gt_mt_arg(method);
        if (pcase_var.eql((SubLObject)transitivity.ZERO_INTEGER)) {
            mt = arg1;
        }
        else if (pcase_var.eql((SubLObject)transitivity.ONE_INTEGER)) {
            mt = arg2;
        }
        else if (pcase_var.eql((SubLObject)transitivity.TWO_INTEGER)) {
            mt = arg3;
        }
        else if (pcase_var.eql((SubLObject)transitivity.THREE_INTEGER)) {
            mt = arg4;
        }
        else if (pcase_var.eql((SubLObject)transitivity.FOUR_INTEGER)) {
            mt = arg5;
        }
        if (transitivity.NIL != hlmt.hlmt_p(mt)) {
            return mt;
        }
        return (SubLObject)transitivity.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transitivity.lisp", position = 6057L)
    public static SubLObject gt_methodP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(v_object, gt_vars.$gt_methods$.getDynamicValue(thread), (SubLObject)transitivity.UNPROVIDED, (SubLObject)transitivity.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transitivity.lisp", position = 6125L)
    public static SubLObject gt_moduleP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(v_object, gt_vars.$transitivity_modules$.getDynamicValue(thread), (SubLObject)transitivity.UNPROVIDED, (SubLObject)transitivity.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transitivity.lisp", position = 6203L)
    public static SubLObject gt_predicate(final SubLObject module) {
        return Symbols.get(module, (SubLObject)transitivity.$kw18$PREDICATE, (SubLObject)transitivity.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transitivity.lisp", position = 6267L)
    public static SubLObject gt_mt(final SubLObject module) {
        return Symbols.get(module, (SubLObject)transitivity.$kw19$MT, (SubLObject)transitivity.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transitivity.lisp", position = 6317L)
    public static SubLObject gt_index_arg(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg = Symbols.get(module, (SubLObject)transitivity.$kw20$INDEX_ARG, (SubLObject)transitivity.UNPROVIDED);
        if (transitivity.NIL != arg) {
            return arg;
        }
        final SubLObject predicate = Symbols.get(module, (SubLObject)transitivity.$kw18$PREDICATE, (SubLObject)transitivity.UNPROVIDED);
        if (transitivity.NIL != predicate) {
            return ggt_index_arg(predicate);
        }
        return gt_vars.$gt_index_arg$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transitivity.lisp", position = 6540L)
    public static SubLObject gt_gather_arg(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg = Symbols.get(module, (SubLObject)transitivity.$kw21$GATHER_ARG, (SubLObject)transitivity.UNPROVIDED);
        if (transitivity.NIL != arg) {
            return arg;
        }
        final SubLObject predicate = Symbols.get(module, (SubLObject)transitivity.$kw18$PREDICATE, (SubLObject)transitivity.UNPROVIDED);
        if (transitivity.NIL != predicate) {
            return ggt_gather_arg(predicate);
        }
        return gt_vars.$gt_gather_arg$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transitivity.lisp", position = 6769L)
    public static SubLObject ggt_index_arg(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fan_out_arg = kb_accessors.fan_out_arg(predicate, (SubLObject)transitivity.UNPROVIDED);
        if (transitivity.NIL != fan_out_arg) {
            return fan_out_arg;
        }
        return gt_vars.$gt_index_arg$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transitivity.lisp", position = 6919L)
    public static SubLObject ggt_gather_arg(final SubLObject predicate) {
        if (ggt_index_arg(predicate).numE((SubLObject)transitivity.TWO_INTEGER)) {
            return (SubLObject)transitivity.ONE_INTEGER;
        }
        return (SubLObject)transitivity.TWO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transitivity.lisp", position = 7026L)
    public static SubLObject gt_accessors(final SubLObject module) {
        final SubLObject accessors = Symbols.get(module, (SubLObject)transitivity.$kw13$ACCESSORS, (SubLObject)transitivity.UNPROVIDED);
        if (transitivity.NIL != accessors) {
            return accessors;
        }
        return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(gt_predicate(module), gt_index_arg(module), gt_gather_arg(module)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transitivity.lisp", position = 7243L)
    public static SubLObject setup_transitivity_module(final SubLObject module, final SubLObject plist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = gt_vars.$gt_parameters$.getDynamicValue(thread);
        SubLObject indicator = (SubLObject)transitivity.NIL;
        indicator = cdolist_list_var.first();
        while (transitivity.NIL != cdolist_list_var) {
            Symbols.remprop(module, indicator);
            cdolist_list_var = cdolist_list_var.rest();
            indicator = cdolist_list_var.first();
        }
        SubLObject parameters = (SubLObject)transitivity.NIL;
        SubLObject parameter = (SubLObject)transitivity.NIL;
        SubLObject value = (SubLObject)transitivity.NIL;
        parameters = plist;
        parameter = parameters.first();
        value = conses_high.second(parameters);
        while (transitivity.NIL != parameters) {
            if (transitivity.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && transitivity.NIL == subl_promotions.memberP(parameter, gt_vars.$gt_parameters$.getDynamicValue(thread), (SubLObject)transitivity.UNPROVIDED, (SubLObject)transitivity.UNPROVIDED)) {
                Errors.error((SubLObject)transitivity.$str22$_s_was_not_a_valid_transitivity_m, parameter);
            }
            Symbols.put(module, parameter, value);
            parameters = conses_high.cddr(parameters);
            parameter = parameters.first();
            value = conses_high.second(parameters);
        }
        return module;
    }
    
    public static SubLObject declare_transitivity_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.transitivity", "with_new_gt_space", "WITH-NEW-GT-SPACE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transitivity", "gtm", "GTM", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transitivity", "gtm_in_mt", "GTM-IN-MT", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transitivity", "gtm_in_all_mts", "GTM-IN-ALL-MTS", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transitivity", "gti", "GTI", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transitivity", "gti_predicate", "GTI-PREDICATE", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transitivity", "gti_accessors", "GTI-ACCESSORS", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transitivity", "apply_gti_function", "APPLY-GTI-FUNCTION", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transitivity", "reset_gti_state", "RESET-GTI-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transitivity", "gt_method_function", "GT-METHOD-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transitivity", "gt_method_arg_list", "GT-METHOD-ARG-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transitivity", "add_mt_default", "ADD-MT-DEFAULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transitivity", "gt_mt_arg", "GT-MT-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transitivity", "gt_mt_arg_value", "GT-MT-ARG-VALUE", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transitivity", "gt_methodP", "GT-METHOD?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transitivity", "gt_moduleP", "GT-MODULE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transitivity", "gt_predicate", "GT-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transitivity", "gt_mt", "GT-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transitivity", "gt_index_arg", "GT-INDEX-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transitivity", "gt_gather_arg", "GT-GATHER-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transitivity", "ggt_index_arg", "GGT-INDEX-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transitivity", "ggt_gather_arg", "GGT-GATHER-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transitivity", "gt_accessors", "GT-ACCESSORS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transitivity", "setup_transitivity_module", "SETUP-TRANSITIVITY-MODULE", 2, 0, false);
        return (SubLObject)transitivity.NIL;
    }
    
    public static SubLObject init_transitivity_file() {
        return (SubLObject)transitivity.NIL;
    }
    
    public static SubLObject setup_transitivity_file() {
        return (SubLObject)transitivity.NIL;
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
    
    static {
        me = (SubLFile)new transitivity();
        $sym0$INSTANTIATE_SBHL_MARKING_SPACE_FOR = SubLObjectFactory.makeSymbol("INSTANTIATE-SBHL-MARKING-SPACE-FOR");
        $sym1$_GT_MARKING_TABLE_ = SubLObjectFactory.makeSymbol("*GT-MARKING-TABLE*");
        $str2$_s_is_not_a_transitive_predicate = SubLObjectFactory.makeString("~s is not a transitive predicate");
        $str3$SKSI_SQL_statement_cache_ = SubLObjectFactory.makeString("SKSI SQL statement cache ");
        $sym4$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $sym5$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const6$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $kw7$INVALID_MODULE = SubLObjectFactory.makeKeyword("INVALID-MODULE");
        $str8$_s_is_not_a_valid_transitivity_mo = SubLObjectFactory.makeString("~s is not a valid transitivity module.");
        $kw9$INVALID_METHOD = SubLObjectFactory.makeKeyword("INVALID-METHOD");
        $str10$_s_is_not_a_valid_gt_method_ = SubLObjectFactory.makeString("~s is not a valid gt method.");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("GATHER-ARG"));
        $kw12$ASSERTION = SubLObjectFactory.makeKeyword("ASSERTION");
        $kw13$ACCESSORS = SubLObjectFactory.makeKeyword("ACCESSORS");
        $str14$method__s_maps_into_illegal_gt_fu = SubLObjectFactory.makeString("method ~s maps into illegal gt function ~s)");
        $str15$illegal_transitivity_method___s = SubLObjectFactory.makeString("illegal transitivity method: ~s");
        $sym16$MT = SubLObjectFactory.makeSymbol("MT");
        $sym17$_OPTIONAL = SubLObjectFactory.makeSymbol("&OPTIONAL");
        $kw18$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $kw19$MT = SubLObjectFactory.makeKeyword("MT");
        $kw20$INDEX_ARG = SubLObjectFactory.makeKeyword("INDEX-ARG");
        $kw21$GATHER_ARG = SubLObjectFactory.makeKeyword("GATHER-ARG");
        $str22$_s_was_not_a_valid_transitivity_m = SubLObjectFactory.makeString("~s was not a valid transitivity-module parameter");
    }
}

/*

	Total time: 402 ms
	
*/