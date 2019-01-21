package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_methods;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sdc extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sdc";
    public static final String myFingerPrint = "5ff939e3c4ae68efa87b7c1431d11e8ce4b206dd6e8d126224faae579982db4a";
    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 2023L)
    public static SubLSymbol $sdc_exception_transfers_thru_specsP$;
    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 2353L)
    public static SubLSymbol $sdc_common_spec_exceptionP$;
    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 2576L)
    public static SubLSymbol $ignoring_sdcP$;
    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 2735L)
    private static SubLSymbol $sd_c1_genls_space$;
    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 2819L)
    private static SubLSymbol $sd_c2_genls_space$;
    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 2902L)
    private static SubLSymbol $sd_genls_isas_space$;
    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 3000L)
    private static SubLSymbol $sd_candidate_store$;
    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 13218L)
    private static SubLSymbol $sd_c2_genl$;
    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 14573L)
    private static SubLSymbol $cached_sbhl_sd_relevant_c2_genl_isa_candidateP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 17047L)
    private static SubLSymbol $sbhl_sd_genls_isas_goal$;
    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 20595L)
    private static SubLSymbol $cached_all_isa_sdct_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 26369L)
    private static SubLSymbol $cached_sdc_exceptions_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 37624L)
    public static SubLSymbol $sdw_trace_level$;
    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 37754L)
    public static SubLSymbol $sdw_test_level$;
    private static final SubLSymbol $sym0$INSTANTIATE_SBHL_MARKING_SPACE_FOR;
    private static final SubLSymbol $sym1$_SD_C1_GENLS_SPACE_;
    private static final SubLSymbol $sym2$_SD_C2_GENLS_SPACE_;
    private static final SubLSymbol $sym3$_SD_GENLS_ISAS_SPACE_;
    private static final SubLSymbol $sym4$_SD_CANDIDATE_STORE_;
    private static final SubLSymbol $sym5$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw6$ERROR;
    private static final SubLString $str7$_A_is_not_a__A;
    private static final SubLSymbol $sym8$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw9$CERROR;
    private static final SubLString $str10$continue_anyway;
    private static final SubLSymbol $kw11$WARN;
    private static final SubLString $str12$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLObject $const13$genls;
    private static final SubLSymbol $kw14$DO_HASH_TABLE;
    private static final SubLSymbol $sym15$SBHL_MARK_SD_GENLS_ISAS;
    private static final SubLObject $const16$isa;
    private static final SubLSymbol $sym17$SBHL_GATHER_SD_CANDIDATES;
    private static final SubLSymbol $sym18$SBHL_DETERMINE_SD_AND_STORE_CANDIDATES;
    private static final SubLSymbol $sym19$CACHED_SBHL_SD_RELEVANT_C2_GENL_ISA_CANDIDATE_;
    private static final SubLSymbol $sym20$_CACHED_SBHL_SD_RELEVANT_C2_GENL_ISA_CANDIDATE__CACHING_STATE_;
    private static final SubLSymbol $sym21$SBHL_SD_GOAL_IN_GENLS_ISAS_P;
    private static final SubLSymbol $sym22$GATHER_SDCT_ISAS;
    private static final SubLSymbol $sym23$GATHER_IF_SDCT_;
    private static final SubLSymbol $sym24$CACHED_ALL_ISA_SDCT;
    private static final SubLSymbol $sym25$RELEVANT_SIBLING_DISJOINT_COLLECTION_P;
    private static final SubLSymbol $sym26$_CACHED_ALL_ISA_SDCT_CACHING_STATE_;
    private static final SubLInteger $int27$512;
    private static final SubLSymbol $sym28$SAFE_SDCT_ELEMENT_;
    private static final SubLSymbol $sym29$CACHED_SDC_EXCEPTIONS;
    private static final SubLSymbol $sym30$_CACHED_SDC_EXCEPTIONS_CACHING_STATE_;
    private static final SubLSymbol $sym31$GATHER_DIRECT_SDC_EXCEPTIONS;
    private static final SubLObject $const32$siblingDisjointExceptions;
    private static final SubLObject $const33$rewriteOf;
    private static final SubLSymbol $sym34$GATHER_DIRECT_SDC_EXCEPTION;
    private static final SubLSymbol $kw35$TRUE;
    private static final SubLSymbol $kw36$ASSERTION;
    private static final SubLSymbol $kw37$OPAQUE;
    private static final SubLObject $const38$SiblingDisjointCollectionType;
    private static final SubLList $list39;
    private static final SubLSymbol $sym40$C1;
    private static final SubLSymbol $sym41$C2;

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 3109L)
    public static SubLObject ignoring_sdcP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sdc.$ignoring_sdcP$.getDynamicValue(thread);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 3240L)
    public static SubLObject relevant_sibling_disjoint_collection_p(final SubLObject col) {
        return (sdc.NIL != control_vars.within_assertP()) ? fort_types_interface.disjoint_collection_p(col) : fort_types_interface.sibling_disjoint_collection_p(col);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 3572L)
    public static SubLObject with_sbhl_sd_marking_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)sdc.$sym0$INSTANTIATE_SBHL_MARKING_SPACE_FOR, (SubLObject)sdc.$sym1$_SD_C1_GENLS_SPACE_, (SubLObject)ConsesLow.list((SubLObject)sdc.$sym0$INSTANTIATE_SBHL_MARKING_SPACE_FOR, (SubLObject)sdc.$sym2$_SD_C2_GENLS_SPACE_, (SubLObject)ConsesLow.list((SubLObject)sdc.$sym0$INSTANTIATE_SBHL_MARKING_SPACE_FOR, (SubLObject)sdc.$sym3$_SD_GENLS_ISAS_SPACE_, (SubLObject)ConsesLow.listS((SubLObject)sdc.$sym0$INSTANTIATE_SBHL_MARKING_SPACE_FOR, (SubLObject)sdc.$sym4$_SD_CANDIDATE_STORE_, ConsesLow.append(body, (SubLObject)sdc.NIL)))));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 3924L)
    public static SubLObject with_sbhl_sd_genls_isas_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)sdc.$sym0$INSTANTIATE_SBHL_MARKING_SPACE_FOR, (SubLObject)sdc.$sym1$_SD_C1_GENLS_SPACE_, (SubLObject)ConsesLow.list((SubLObject)sdc.$sym0$INSTANTIATE_SBHL_MARKING_SPACE_FOR, (SubLObject)sdc.$sym1$_SD_C1_GENLS_SPACE_, (SubLObject)ConsesLow.listS((SubLObject)sdc.$sym0$INSTANTIATE_SBHL_MARKING_SPACE_FOR, (SubLObject)sdc.$sym3$_SD_GENLS_ISAS_SPACE_, ConsesLow.append(body, (SubLObject)sdc.NIL))));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 4192L)
    public static SubLObject any_isa_common_sdct(final SubLObject c1, final SubLObject c2, SubLObject mt, SubLObject tv) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        if (tv == sdc.UNPROVIDED) {
            tv = (SubLObject)sdc.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sdc.NIL;
        SubLObject exceptionP = (SubLObject)sdc.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject tv_var = tv;
            final SubLObject _prev_bind_0_$1 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
            final SubLObject _prev_bind_1_$2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
            try {
                sbhl_search_vars.$sbhl_tv$.bind((sdc.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((sdc.NIL != tv_var) ? sdc.$sym5$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                if (sdc.NIL != tv_var && sdc.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sdc.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                    if (pcase_var.eql((SubLObject)sdc.$kw6$ERROR)) {
                        sbhl_paranoia.sbhl_error((SubLObject)sdc.ONE_INTEGER, (SubLObject)sdc.$str7$_A_is_not_a__A, tv_var, (SubLObject)sdc.$sym8$SBHL_TRUE_TV_P, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED);
                    }
                    else if (pcase_var.eql((SubLObject)sdc.$kw9$CERROR)) {
                        sbhl_paranoia.sbhl_cerror((SubLObject)sdc.ONE_INTEGER, (SubLObject)sdc.$str10$continue_anyway, (SubLObject)sdc.$str7$_A_is_not_a__A, tv_var, (SubLObject)sdc.$sym8$SBHL_TRUE_TV_P, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED);
                    }
                    else if (pcase_var.eql((SubLObject)sdc.$kw11$WARN)) {
                        Errors.warn((SubLObject)sdc.$str7$_A_is_not_a__A, tv_var, (SubLObject)sdc.$sym8$SBHL_TRUE_TV_P);
                    }
                    else {
                        Errors.warn((SubLObject)sdc.$str12$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror((SubLObject)sdc.$str10$continue_anyway, (SubLObject)sdc.$str7$_A_is_not_a__A, tv_var, (SubLObject)sdc.$sym8$SBHL_TRUE_TV_P);
                    }
                }
                final SubLObject _prev_bind_0_$2 = sdc.$sd_c1_genls_space$.currentBinding(thread);
                try {
                    sdc.$sd_c1_genls_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject _prev_bind_0_$3 = sdc.$sd_c2_genls_space$.currentBinding(thread);
                        try {
                            sdc.$sd_c2_genls_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject _prev_bind_0_$4 = sdc.$sd_genls_isas_space$.currentBinding(thread);
                                try {
                                    sdc.$sd_genls_isas_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    try {
                                        final SubLObject _prev_bind_0_$5 = sdc.$sd_candidate_store$.currentBinding(thread);
                                        try {
                                            sdc.$sd_candidate_store$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                            try {
                                                sbhl_mark_sd_c1_genls_and_non_c2_genls_isas(c1, c2);
                                                final SubLObject _prev_bind_0_$6 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$3 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                final SubLObject _prev_bind_2_$9 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                SubLObject _prev_bind_6 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                                                SubLObject _prev_bind_7 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(sdc.$const13$genls), thread);
                                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(sdc.$const13$genls)), thread);
                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(sdc.$const13$genls)), thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)sdc.NIL, thread);
                                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(sdc.$const13$genls), thread);
                                                    sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                                                    sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                                                    exceptionP = (SubLObject)SubLObjectFactory.makeBoolean(sdc.NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(c1, sdc.$sd_c2_genls_space$.getDynamicValue(thread)) || sdc.NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(c2, sdc.$sd_c1_genls_space$.getDynamicValue(thread)));
                                                }
                                                finally {
                                                    sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_7, thread);
                                                    sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_6, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$9, thread);
                                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$3, thread);
                                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$6, thread);
                                                }
                                                if (sdc.NIL == exceptionP) {
                                                    if (sdc.NIL != sdc.$sdc_exception_transfers_thru_specsP$.getDynamicValue(thread)) {
                                                        final SubLObject _prev_bind_0_$7 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$4 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                        final SubLObject _prev_bind_2_$10 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                        _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        _prev_bind_6 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                                                        _prev_bind_7 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                                                        try {
                                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(sdc.$const13$genls), thread);
                                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(sdc.$const13$genls)), thread);
                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(sdc.$const13$genls)), thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)sdc.NIL, thread);
                                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(sdc.$const13$genls), thread);
                                                            sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                                                            sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                                                            if (sdc.NIL == exceptionP) {
                                                                SubLObject catch_var = (SubLObject)sdc.NIL;
                                                                try {
                                                                    thread.throwStack.push(sdc.$kw14$DO_HASH_TABLE);
                                                                    final SubLObject cdohash_table = sdc.$sd_c2_genls_space$.getDynamicValue(thread);
                                                                    SubLObject c2_genl = (SubLObject)sdc.NIL;
                                                                    SubLObject val = (SubLObject)sdc.NIL;
                                                                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                                                                    try {
                                                                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                                                                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                                                                            c2_genl = Hashtables.getEntryKey(cdohash_entry);
                                                                            val = Hashtables.getEntryValue(cdohash_entry);
                                                                            subl_macros.do_hash_table_done_check(exceptionP);
                                                                            final SubLObject exceptions = direct_sdc_exceptions(c2_genl, (SubLObject)sdc.UNPROVIDED);
                                                                            if (sdc.NIL == exceptionP) {
                                                                                SubLObject csome_list_var = exceptions;
                                                                                SubLObject exception = (SubLObject)sdc.NIL;
                                                                                exception = csome_list_var.first();
                                                                                while (sdc.NIL == exceptionP && sdc.NIL != csome_list_var) {
                                                                                    if (sdc.NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(exception, sdc.$sd_c1_genls_space$.getDynamicValue(thread))) {
                                                                                        exceptionP = (SubLObject)sdc.T;
                                                                                    }
                                                                                    csome_list_var = csome_list_var.rest();
                                                                                    exception = csome_list_var.first();
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    finally {
                                                                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                                                                    }
                                                                }
                                                                catch (Throwable ccatch_env_var) {
                                                                    catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)sdc.$kw14$DO_HASH_TABLE);
                                                                }
                                                                finally {
                                                                    thread.throwStack.pop();
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_7, thread);
                                                            sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_6, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$10, thread);
                                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$4, thread);
                                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$7, thread);
                                                        }
                                                    }
                                                    if (sdc.NIL == exceptionP) {
                                                        result = sbhl_gather_first_sd_or_store_sd_candidates(c2);
                                                        if (sdc.NIL == result) {
                                                            result = sbhl_determine_sd_path_with_no_exceptions(c1);
                                                        }
                                                    }
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sdc.T, thread);
                                                    final SubLObject _values = Values.getValuesAsVector();
                                                    sbhl_marking_vars.free_sbhl_marking_space(sdc.$sd_candidate_store$.getDynamicValue(thread));
                                                    Values.restoreValuesFromVector(_values);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                                                }
                                            }
                                        }
                                        finally {
                                            sdc.$sd_candidate_store$.rebind(_prev_bind_0_$5, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sdc.T, thread);
                                            final SubLObject _values2 = Values.getValuesAsVector();
                                            sbhl_marking_vars.free_sbhl_marking_space(sdc.$sd_genls_isas_space$.getDynamicValue(thread));
                                            Values.restoreValuesFromVector(_values2);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                                        }
                                    }
                                }
                                finally {
                                    sdc.$sd_genls_isas_space$.rebind(_prev_bind_0_$4, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sdc.T, thread);
                                    final SubLObject _values3 = Values.getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sdc.$sd_c2_genls_space$.getDynamicValue(thread));
                                    Values.restoreValuesFromVector(_values3);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                                }
                            }
                        }
                        finally {
                            sdc.$sd_c2_genls_space$.rebind(_prev_bind_0_$3, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sdc.T, thread);
                            final SubLObject _values4 = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sdc.$sd_c1_genls_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values4);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                        }
                    }
                }
                finally {
                    sdc.$sd_c1_genls_space$.rebind(_prev_bind_0_$2, thread);
                }
            }
            finally {
                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$2, thread);
                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$1, thread);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 7914L)
    public static SubLObject any_isa_common_sdct_among(SubLObject c1s, final SubLObject c2, SubLObject mt, SubLObject tv) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        if (tv == sdc.UNPROVIDED) {
            tv = (SubLObject)sdc.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sdc.NIL;
        SubLObject result2 = (SubLObject)sdc.NIL;
        SubLObject exceptionP = (SubLObject)sdc.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject tv_var = tv;
            final SubLObject _prev_bind_0_$17 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
            final SubLObject _prev_bind_1_$18 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
            try {
                sbhl_search_vars.$sbhl_tv$.bind((sdc.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((sdc.NIL != tv_var) ? sdc.$sym5$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                if (sdc.NIL != tv_var && sdc.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sdc.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                    if (pcase_var.eql((SubLObject)sdc.$kw6$ERROR)) {
                        sbhl_paranoia.sbhl_error((SubLObject)sdc.ONE_INTEGER, (SubLObject)sdc.$str7$_A_is_not_a__A, tv_var, (SubLObject)sdc.$sym8$SBHL_TRUE_TV_P, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED);
                    }
                    else if (pcase_var.eql((SubLObject)sdc.$kw9$CERROR)) {
                        sbhl_paranoia.sbhl_cerror((SubLObject)sdc.ONE_INTEGER, (SubLObject)sdc.$str10$continue_anyway, (SubLObject)sdc.$str7$_A_is_not_a__A, tv_var, (SubLObject)sdc.$sym8$SBHL_TRUE_TV_P, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED);
                    }
                    else if (pcase_var.eql((SubLObject)sdc.$kw11$WARN)) {
                        Errors.warn((SubLObject)sdc.$str7$_A_is_not_a__A, tv_var, (SubLObject)sdc.$sym8$SBHL_TRUE_TV_P);
                    }
                    else {
                        Errors.warn((SubLObject)sdc.$str12$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror((SubLObject)sdc.$str10$continue_anyway, (SubLObject)sdc.$str7$_A_is_not_a__A, tv_var, (SubLObject)sdc.$sym8$SBHL_TRUE_TV_P);
                    }
                }
                final SubLObject _prev_bind_0_$18 = sdc.$sd_c1_genls_space$.currentBinding(thread);
                try {
                    sdc.$sd_c1_genls_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject _prev_bind_0_$19 = sdc.$sd_c2_genls_space$.currentBinding(thread);
                        try {
                            sdc.$sd_c2_genls_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject _prev_bind_0_$20 = sdc.$sd_genls_isas_space$.currentBinding(thread);
                                try {
                                    sdc.$sd_genls_isas_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    try {
                                        final SubLObject _prev_bind_0_$21 = sdc.$sd_candidate_store$.currentBinding(thread);
                                        try {
                                            sdc.$sd_candidate_store$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                            try {
                                                c1s = sbhl_mark_sd_c1s_genls_and_non_c2_genls_isas(c1s, c2);
                                                if (sdc.NIL == c1s) {
                                                    exceptionP = (SubLObject)sdc.T;
                                                }
                                                if (sdc.NIL == exceptionP) {
                                                    if (sdc.NIL != sdc.$sdc_exception_transfers_thru_specsP$.getDynamicValue(thread)) {
                                                        final SubLObject _prev_bind_0_$22 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$19 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                        final SubLObject _prev_bind_2_$25 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_6 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                                                        final SubLObject _prev_bind_7 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                                                        try {
                                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(sdc.$const13$genls), thread);
                                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(sdc.$const13$genls)), thread);
                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(sdc.$const13$genls)), thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)sdc.NIL, thread);
                                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(sdc.$const13$genls), thread);
                                                            sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                                                            sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                                                            if (sdc.NIL == exceptionP) {
                                                                SubLObject catch_var = (SubLObject)sdc.NIL;
                                                                try {
                                                                    thread.throwStack.push(sdc.$kw14$DO_HASH_TABLE);
                                                                    final SubLObject cdohash_table = sdc.$sd_c2_genls_space$.getDynamicValue(thread);
                                                                    SubLObject c2_genl = (SubLObject)sdc.NIL;
                                                                    SubLObject val = (SubLObject)sdc.NIL;
                                                                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                                                                    try {
                                                                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                                                                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                                                                            c2_genl = Hashtables.getEntryKey(cdohash_entry);
                                                                            val = Hashtables.getEntryValue(cdohash_entry);
                                                                            subl_macros.do_hash_table_done_check(exceptionP);
                                                                            final SubLObject exceptions = direct_sdc_exceptions(c2_genl, (SubLObject)sdc.UNPROVIDED);
                                                                            if (sdc.NIL == exceptionP) {
                                                                                SubLObject csome_list_var = exceptions;
                                                                                SubLObject exception = (SubLObject)sdc.NIL;
                                                                                exception = csome_list_var.first();
                                                                                while (sdc.NIL == exceptionP && sdc.NIL != csome_list_var) {
                                                                                    if (sdc.NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(exception, sdc.$sd_c1_genls_space$.getDynamicValue(thread))) {
                                                                                        exceptionP = (SubLObject)sdc.T;
                                                                                    }
                                                                                    csome_list_var = csome_list_var.rest();
                                                                                    exception = csome_list_var.first();
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    finally {
                                                                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                                                                    }
                                                                }
                                                                catch (Throwable ccatch_env_var) {
                                                                    catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)sdc.$kw14$DO_HASH_TABLE);
                                                                }
                                                                finally {
                                                                    thread.throwStack.pop();
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_7, thread);
                                                            sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_6, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$25, thread);
                                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$19, thread);
                                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$22, thread);
                                                        }
                                                    }
                                                    if (sdc.NIL == exceptionP) {
                                                        result = sbhl_gather_first_sd_or_store_sd_candidates(c2);
                                                        if (sdc.NIL == result) {
                                                            thread.resetMultipleValues();
                                                            final SubLObject result_$26 = sbhl_determine_sd_path_with_no_exceptions_among(c1s);
                                                            final SubLObject result2_$27 = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            result = result_$26;
                                                            result2 = result2_$27;
                                                        }
                                                    }
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sdc.T, thread);
                                                    final SubLObject _values = Values.getValuesAsVector();
                                                    sbhl_marking_vars.free_sbhl_marking_space(sdc.$sd_candidate_store$.getDynamicValue(thread));
                                                    Values.restoreValuesFromVector(_values);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                                                }
                                            }
                                        }
                                        finally {
                                            sdc.$sd_candidate_store$.rebind(_prev_bind_0_$21, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sdc.T, thread);
                                            final SubLObject _values2 = Values.getValuesAsVector();
                                            sbhl_marking_vars.free_sbhl_marking_space(sdc.$sd_genls_isas_space$.getDynamicValue(thread));
                                            Values.restoreValuesFromVector(_values2);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                                        }
                                    }
                                }
                                finally {
                                    sdc.$sd_genls_isas_space$.rebind(_prev_bind_0_$20, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sdc.T, thread);
                                    final SubLObject _values3 = Values.getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sdc.$sd_c2_genls_space$.getDynamicValue(thread));
                                    Values.restoreValuesFromVector(_values3);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                                }
                            }
                        }
                        finally {
                            sdc.$sd_c2_genls_space$.rebind(_prev_bind_0_$19, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sdc.T, thread);
                            final SubLObject _values4 = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sdc.$sd_c1_genls_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values4);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                        }
                    }
                }
                finally {
                    sdc.$sd_c1_genls_space$.rebind(_prev_bind_0_$18, thread);
                }
            }
            finally {
                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$18, thread);
                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$17, thread);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return Values.values(result, result2);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 9809L)
    public static SubLObject sbhl_mark_sd_c1_genls_and_non_c2_genls_isas(final SubLObject c1, final SubLObject c2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_marking_methods.sbhl_mark_forward_true_nodes_in_space(sbhl_module_vars.get_sbhl_module(sdc.$const13$genls), c2, sdc.$sd_c2_genls_space$.getDynamicValue(thread), (SubLObject)sdc.UNPROVIDED);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                sbhl_search_methods.sbhl_map_and_mark_forward_true_nodes_in_space(sbhl_module_vars.get_sbhl_module(sdc.$const13$genls), c1, (SubLObject)sdc.$sym15$SBHL_MARK_SD_GENLS_ISAS, sdc.$sd_c1_genls_space$.getDynamicValue(thread), (SubLObject)sdc.UNPROVIDED);
            }
            finally {
                final SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sdc.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)sdc.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 10436L)
    public static SubLObject sbhl_mark_sd_c1s_genls_and_non_c2_genls_isas(final SubLObject c1s, final SubLObject c2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_marking_methods.sbhl_mark_forward_true_nodes_in_space(sbhl_module_vars.get_sbhl_module(sdc.$const13$genls), c2, sdc.$sd_c2_genls_space$.getDynamicValue(thread), (SubLObject)sdc.UNPROVIDED);
        SubLObject new_c1s = (SubLObject)sdc.NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_6 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
        final SubLObject _prev_bind_7 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
        final SubLObject _prev_bind_8 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(sdc.$const13$genls), thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(sdc.$const13$genls)), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(sdc.$const13$genls)), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)sdc.NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(sdc.$const13$genls), thread);
            sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
            sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                SubLObject cdolist_list_var = c1s;
                SubLObject c3 = (SubLObject)sdc.NIL;
                c3 = cdolist_list_var.first();
                while (sdc.NIL != cdolist_list_var) {
                    if (sdc.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(c3, sdc.$sd_c2_genls_space$.getDynamicValue(thread)) && sdc.NIL == genls.genlP(c3, c2, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED)) {
                        sbhl_search_methods.sbhl_map_and_mark_forward_true_nodes_in_space(sbhl_module_vars.get_sbhl_module(sdc.$const13$genls), c3, (SubLObject)sdc.$sym15$SBHL_MARK_SD_GENLS_ISAS, sdc.$sd_c1_genls_space$.getDynamicValue(thread), (SubLObject)sdc.UNPROVIDED);
                        new_c1s = (SubLObject)ConsesLow.cons(c3, new_c1s);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    c3 = cdolist_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$33 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sdc.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_8, thread);
            sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_7, thread);
            sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_6, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return new_c1s;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 11324L)
    public static SubLObject sbhl_mark_sd_genls_isas(final SubLObject c1_genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sdc.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(c1_genl, sdc.$sd_c2_genls_space$.getDynamicValue(thread))) {
            sbhl_marking_methods.sbhl_mark_forward_true_nodes_in_space(sbhl_module_vars.get_sbhl_module(sdc.$const16$isa), c1_genl, sdc.$sd_genls_isas_space$.getDynamicValue(thread), (SubLObject)sdc.UNPROVIDED);
        }
        return (SubLObject)sdc.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 11649L)
    public static SubLObject sbhl_gather_first_sd_or_store_sd_candidates(final SubLObject c2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sdc.NIL;
        SubLObject relevant_exceptions = (SubLObject)sdc.NIL;
        SubLObject cdolist_list_var = sdc_exceptions(c2, (SubLObject)sdc.UNPROVIDED);
        SubLObject exception = (SubLObject)sdc.NIL;
        exception = cdolist_list_var.first();
        while (sdc.NIL != cdolist_list_var) {
            if (sdc.NIL != sbhl_marking_utilities.sbhl_marked_node_p(exception, sdc.$sd_c1_genls_space$.getDynamicValue(thread))) {
                relevant_exceptions = (SubLObject)ConsesLow.cons(exception, relevant_exceptions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            exception = cdolist_list_var.first();
        }
        result = sbhl_search_methods.sbhl_gather_first_among_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(sdc.$const13$genls), c2, (SubLObject)sdc.$sym17$SBHL_GATHER_SD_CANDIDATES, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED);
        if (sdc.NIL != relevant_exceptions) {
            if (sdc.NIL != hash_table_utilities.hash_table_empty_p(sdc.$sd_candidate_store$.getDynamicValue(thread))) {
                hash_table_utilities.push_hash(result, relevant_exceptions, sdc.$sd_candidate_store$.getDynamicValue(thread));
            }
            else {
                final SubLObject cdohash_table = sdc.$sd_candidate_store$.getDynamicValue(thread);
                SubLObject c2_genl_isa = (SubLObject)sdc.NIL;
                SubLObject exception_lists = (SubLObject)sdc.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        c2_genl_isa = Hashtables.getEntryKey(cdohash_entry);
                        exception_lists = Hashtables.getEntryValue(cdohash_entry);
                        SubLObject new_exceptions = (SubLObject)sdc.NIL;
                        SubLObject cdolist_list_var2 = exception_lists;
                        SubLObject exceptions = (SubLObject)sdc.NIL;
                        exceptions = cdolist_list_var2.first();
                        while (sdc.NIL != cdolist_list_var2) {
                            new_exceptions = (SubLObject)ConsesLow.cons(conses_high.nunion(exceptions, relevant_exceptions, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED), new_exceptions);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            exceptions = cdolist_list_var2.first();
                        }
                        Hashtables.sethash(c2_genl_isa, sdc.$sd_candidate_store$.getDynamicValue(thread), new_exceptions);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
            return (SubLObject)sdc.NIL;
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 13334L)
    public static SubLObject sbhl_gather_sd_candidates(final SubLObject c2_genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sdc.NIL;
        if (sdc.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(c2_genl, sdc.$sd_c1_genls_space$.getDynamicValue(thread))) {
            final SubLObject _prev_bind_0 = sdc.$sd_c2_genl$.currentBinding(thread);
            try {
                sdc.$sd_c2_genl$.bind(c2_genl, thread);
                result = sbhl_search_methods.sbhl_gather_first_among_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(sdc.$const16$isa), c2_genl, (SubLObject)sdc.$sym18$SBHL_DETERMINE_SD_AND_STORE_CANDIDATES, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED);
            }
            finally {
                sdc.$sd_c2_genl$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        return (SubLObject)sdc.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 13900L)
    public static SubLObject sbhl_determine_sd_and_store_candidates(final SubLObject c2_genl_isa) {
        if (sdc.NIL != sbhl_sd_relevant_c2_genl_isa_candidateP(c2_genl_isa)) {
            return sbhl_determine_sd_and_store_relevant_candidates(c2_genl_isa);
        }
        return (SubLObject)sdc.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 14573L)
    public static SubLObject clear_cached_sbhl_sd_relevant_c2_genl_isa_candidateP() {
        final SubLObject cs = sdc.$cached_sbhl_sd_relevant_c2_genl_isa_candidateP_caching_state$.getGlobalValue();
        if (sdc.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)sdc.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 14573L)
    public static SubLObject remove_cached_sbhl_sd_relevant_c2_genl_isa_candidateP(final SubLObject c2_genl_isa) {
        return memoization_state.caching_state_remove_function_results_with_args(sdc.$cached_sbhl_sd_relevant_c2_genl_isa_candidateP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(c2_genl_isa), (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 14573L)
    public static SubLObject cached_sbhl_sd_relevant_c2_genl_isa_candidateP_internal(final SubLObject c2_genl_isa) {
        return sbhl_sd_relevant_c2_genl_isa_candidateP(c2_genl_isa);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 14573L)
    public static SubLObject cached_sbhl_sd_relevant_c2_genl_isa_candidateP(final SubLObject c2_genl_isa) {
        SubLObject caching_state = sdc.$cached_sbhl_sd_relevant_c2_genl_isa_candidateP_caching_state$.getGlobalValue();
        if (sdc.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)sdc.$sym19$CACHED_SBHL_SD_RELEVANT_C2_GENL_ISA_CANDIDATE_, (SubLObject)sdc.$sym20$_CACHED_SBHL_SD_RELEVANT_C2_GENL_ISA_CANDIDATE__CACHING_STATE_, (SubLObject)sdc.NIL, (SubLObject)sdc.EQL, (SubLObject)sdc.ONE_INTEGER, (SubLObject)sdc.SIXTEEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, c2_genl_isa, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_sbhl_sd_relevant_c2_genl_isa_candidateP_internal(c2_genl_isa)));
            memoization_state.caching_state_put(caching_state, c2_genl_isa, results, (SubLObject)sdc.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 14747L)
    public static SubLObject sbhl_sd_relevant_c2_genl_isa_candidateP(final SubLObject c2_genl_isa) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(sdc.NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(c2_genl_isa, sdc.$sd_genls_isas_space$.getDynamicValue(thread)) && sdc.NIL != relevant_sibling_disjoint_collection_p(c2_genl_isa));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 14960L)
    public static SubLObject sbhl_determine_sd_and_store_relevant_candidates(final SubLObject c2_genl_isa) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject exceptions = sdc_exceptions(sdc.$sd_c2_genl$.getDynamicValue(thread), (SubLObject)sdc.UNPROVIDED);
        SubLObject relevant_exceptions = (SubLObject)sdc.NIL;
        SubLObject cdolist_list_var = exceptions;
        SubLObject exception = (SubLObject)sdc.NIL;
        exception = cdolist_list_var.first();
        while (sdc.NIL != cdolist_list_var) {
            if (sdc.NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(exception, sdc.$sd_c1_genls_space$.getDynamicValue(thread))) {
                relevant_exceptions = (SubLObject)ConsesLow.cons(exception, relevant_exceptions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            exception = cdolist_list_var.first();
        }
        if (sdc.NIL != relevant_exceptions) {
            hash_table_utilities.push_hash(c2_genl_isa, relevant_exceptions, sdc.$sd_candidate_store$.getDynamicValue(thread));
            return (SubLObject)sdc.NIL;
        }
        return c2_genl_isa;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 15486L)
    public static SubLObject sbhl_determine_sd_path_with_no_exceptions(final SubLObject c1) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sdc.NIL;
        if (sdc.NIL == result) {
            SubLObject catch_var = (SubLObject)sdc.NIL;
            try {
                thread.throwStack.push(sdc.$kw14$DO_HASH_TABLE);
                final SubLObject cdohash_table = sdc.$sd_candidate_store$.getDynamicValue(thread);
                SubLObject c1_genl_isa = (SubLObject)sdc.NIL;
                SubLObject relevant_exceptions = (SubLObject)sdc.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        c1_genl_isa = Hashtables.getEntryKey(cdohash_entry);
                        relevant_exceptions = Hashtables.getEntryValue(cdohash_entry);
                        subl_macros.do_hash_table_done_check(result);
                        if (sdc.NIL == result) {
                            SubLObject csome_list_var = relevant_exceptions;
                            SubLObject c2_genl_exceptions = (SubLObject)sdc.NIL;
                            c2_genl_exceptions = csome_list_var.first();
                            while (sdc.NIL == result && sdc.NIL != csome_list_var) {
                                if (sdc.NIL != any_sd_isa_path_excluding_exceptions_p(c1, c1_genl_isa, c2_genl_exceptions)) {
                                    result = c1_genl_isa;
                                }
                                csome_list_var = csome_list_var.rest();
                                c2_genl_exceptions = csome_list_var.first();
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
            catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)sdc.$kw14$DO_HASH_TABLE);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 16081L)
    public static SubLObject sbhl_determine_sd_path_with_no_exceptions_among(final SubLObject c1s) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sdc.NIL;
        SubLObject result2 = (SubLObject)sdc.NIL;
        if (sdc.NIL == result) {
            SubLObject csome_list_var = c1s;
            SubLObject c1 = (SubLObject)sdc.NIL;
            c1 = csome_list_var.first();
            while (sdc.NIL == result && sdc.NIL != csome_list_var) {
                if (sdc.NIL == result) {
                    SubLObject catch_var = (SubLObject)sdc.NIL;
                    try {
                        thread.throwStack.push(sdc.$kw14$DO_HASH_TABLE);
                        final SubLObject cdohash_table = sdc.$sd_candidate_store$.getDynamicValue(thread);
                        SubLObject c1_genl_isa = (SubLObject)sdc.NIL;
                        SubLObject relevant_exceptions = (SubLObject)sdc.NIL;
                        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                        try {
                            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                                c1_genl_isa = Hashtables.getEntryKey(cdohash_entry);
                                relevant_exceptions = Hashtables.getEntryValue(cdohash_entry);
                                subl_macros.do_hash_table_done_check(result);
                                SubLObject cdolist_list_var = relevant_exceptions;
                                SubLObject c2_genl_exceptions = (SubLObject)sdc.NIL;
                                c2_genl_exceptions = cdolist_list_var.first();
                                while (sdc.NIL != cdolist_list_var) {
                                    if (sdc.NIL != any_sd_isa_path_excluding_exceptions_p(c1, c1_genl_isa, c2_genl_exceptions)) {
                                        result = c1_genl_isa;
                                        result2 = (SubLObject)ConsesLow.cons(c1, result2);
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    c2_genl_exceptions = cdolist_list_var.first();
                                }
                            }
                        }
                        finally {
                            Hashtables.releaseEntrySetIterator(cdohash_iterator);
                        }
                    }
                    catch (Throwable ccatch_env_var) {
                        catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)sdc.$kw14$DO_HASH_TABLE);
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                }
                csome_list_var = csome_list_var.rest();
                c1 = csome_list_var.first();
            }
        }
        return Values.values(result, result2);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 16712L)
    public static SubLObject any_sd_isa_path_excluding_exceptions_p(final SubLObject node, final SubLObject isa_node, final SubLObject exceptions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sdc.NIL;
        final SubLObject _prev_bind_0 = sdc.$sd_c1_genls_space$.currentBinding(thread);
        try {
            sdc.$sd_c1_genls_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject _prev_bind_0_$34 = sdc.$sd_c1_genls_space$.currentBinding(thread);
                try {
                    sdc.$sd_c1_genls_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject _prev_bind_0_$35 = sdc.$sd_genls_isas_space$.currentBinding(thread);
                        try {
                            sdc.$sd_genls_isas_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject _prev_bind_0_$36 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(sdc.$const13$genls), thread);
                                    sbhl_marking_utilities.sbhl_mark_all_nodes_marked(exceptions, sdc.$sd_c1_genls_space$.getDynamicValue(thread));
                                    result = sbhl_sd_genls_and_genls_isa_path_p(node, isa_node);
                                }
                                finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$36, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$37 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sdc.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sdc.$sd_genls_isas_space$.getDynamicValue(thread));
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                                }
                            }
                        }
                        finally {
                            sdc.$sd_genls_isas_space$.rebind(_prev_bind_0_$35, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$38 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sdc.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sdc.$sd_c1_genls_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$38, thread);
                        }
                    }
                }
                finally {
                    sdc.$sd_c1_genls_space$.rebind(_prev_bind_0_$34, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$39 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sdc.T, thread);
                    final SubLObject _values3 = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sdc.$sd_c1_genls_space$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values3);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$39, thread);
                }
            }
        }
        finally {
            sdc.$sd_c1_genls_space$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 17157L)
    public static SubLObject sbhl_sd_genls_and_genls_isa_path_p(final SubLObject node, final SubLObject goal) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sdc.NIL;
        final SubLObject _prev_bind_0 = sdc.$sbhl_sd_genls_isas_goal$.currentBinding(thread);
        try {
            sdc.$sbhl_sd_genls_isas_goal$.bind(goal, thread);
            result = sbhl_search_methods.sbhl_gather_first_among_forward_true_nodes_in_space(sbhl_module_vars.get_sbhl_module(sdc.$const13$genls), node, (SubLObject)sdc.$sym21$SBHL_SD_GOAL_IN_GENLS_ISAS_P, sdc.$sd_c1_genls_space$.getDynamicValue(thread), (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED);
        }
        finally {
            sdc.$sbhl_sd_genls_isas_goal$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 17459L)
    public static SubLObject sbhl_sd_goal_in_genls_isas_p(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sdc.NIL;
        result = sbhl_search_methods.sbhl_predicate_relation_in_space_p(sbhl_module_vars.get_sbhl_module(sdc.$const16$isa), node, sdc.$sbhl_sd_genls_isas_goal$.getDynamicValue(thread), sdc.$sd_genls_isas_space$.getDynamicValue(thread), (SubLObject)sdc.UNPROVIDED);
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 17908L)
    public static SubLObject sdc(final SubLObject col, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        return max_sdc(col, mt);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 18255L)
    public static SubLObject max_sdc(final SubLObject col, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sdc.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = max_sdc_int(col);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 18490L)
    public static SubLObject all_sdc(final SubLObject col, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sdc.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = all_sdc_int(col);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 18737L)
    public static SubLObject max_sdc_int(final SubLObject col) {
        return genls.max_cols(all_sdc_int(col), (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 18873L)
    public static SubLObject all_sdc_int(final SubLObject col) {
        final SubLObject sdct = applicable_sdct(col, (SubLObject)sdc.UNPROVIDED);
        SubLObject candidates = isa.union_all_instances(sdct, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED);
        SubLObject result = (SubLObject)sdc.NIL;
        SubLObject cdolist_list_var;
        candidates = (cdolist_list_var = genls.union_all_specs(candidates, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED));
        SubLObject candidate = (SubLObject)sdc.NIL;
        candidate = cdolist_list_var.first();
        while (sdc.NIL != cdolist_list_var) {
            if (sdc.NIL != any_isa_common_sdct(col, candidate, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED)) {
                result = (SubLObject)ConsesLow.cons(candidate, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate = cdolist_list_var.first();
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 19270L)
    public static SubLObject remote_sdc_wrt(final SubLObject col, final SubLObject sdct, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        SubLObject result = (SubLObject)sdc.NIL;
        SubLObject cdolist_list_var = genls.all_genls(col, mt, (SubLObject)sdc.UNPROVIDED);
        SubLObject genl = (SubLObject)sdc.NIL;
        genl = cdolist_list_var.first();
        while (sdc.NIL != cdolist_list_var) {
            if (sdc.NIL != isa.isaP(genl, sdct, mt, (SubLObject)sdc.UNPROVIDED)) {
                result = (SubLObject)ConsesLow.cons(genl, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            genl = cdolist_list_var.first();
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 19457L)
    public static SubLObject isa_sdct(final SubLObject col, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        return max_isa_sdct(col, mt);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 19647L)
    public static SubLObject max_isa_sdct(final SubLObject col, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        return genls.max_cols(applicable_sdct(col, mt), (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 19818L)
    public static SubLObject applicable_sdct(final SubLObject col, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sdcts = (SubLObject)sdc.NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_result$.bind((SubLObject)sdc.NIL, thread);
            try {
                final SubLObject _prev_bind_0_$40 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        genls.map_all_genls((SubLObject)sdc.$sym22$GATHER_SDCT_ISAS, col, mt, (SubLObject)sdc.UNPROVIDED);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$41 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sdc.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$41, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_0_$40, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$42 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sdc.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    sdcts = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$42, thread);
                }
            }
        }
        finally {
            sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_0, thread);
        }
        return sdcts;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 20116L)
    public static SubLObject gather_sdct_isas(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind((SubLObject)sdc.T, thread);
            isa.map_all_isa((SubLObject)sdc.$sym23$GATHER_IF_SDCT_, col, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED);
        }
        finally {
            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)sdc.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 20267L)
    public static SubLObject gather_if_sdctP(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sdc.NIL != relevant_sibling_disjoint_collection_p(collection)) {
            sbhl_search_vars.$sbhl_result$.setDynamicValue((SubLObject)ConsesLow.cons(collection, sbhl_search_vars.$sbhl_result$.getDynamicValue(thread)), thread);
        }
        return (SubLObject)sdc.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 20425L)
    public static SubLObject all_isa_sdct(final SubLObject col, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        return cached_all_isa_sdct(col, mt_relevance_macros.mt_info(mt));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 20595L)
    public static SubLObject clear_cached_all_isa_sdct() {
        final SubLObject cs = sdc.$cached_all_isa_sdct_caching_state$.getGlobalValue();
        if (sdc.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)sdc.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 20595L)
    public static SubLObject remove_cached_all_isa_sdct(final SubLObject col, final SubLObject mt_info) {
        return memoization_state.caching_state_remove_function_results_with_args(sdc.$cached_all_isa_sdct_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(col, mt_info), (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 20595L)
    public static SubLObject cached_all_isa_sdct_internal(final SubLObject col, final SubLObject mt_info) {
        final SubLObject mt = (SubLObject)((sdc.NIL != fort_types_interface.mtP(mt_info)) ? mt_info : sdc.NIL);
        return isa.all_isa_if((SubLObject)sdc.$sym25$RELEVANT_SIBLING_DISJOINT_COLLECTION_P, col, mt, (SubLObject)sdc.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 20595L)
    public static SubLObject cached_all_isa_sdct(final SubLObject col, final SubLObject mt_info) {
        SubLObject caching_state = sdc.$cached_all_isa_sdct_caching_state$.getGlobalValue();
        if (sdc.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)sdc.$sym24$CACHED_ALL_ISA_SDCT, (SubLObject)sdc.$sym26$_CACHED_ALL_ISA_SDCT_CACHING_STATE_, (SubLObject)sdc.NIL, (SubLObject)sdc.EQL, (SubLObject)sdc.TWO_INTEGER, (SubLObject)sdc.$int27$512);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(col, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sdc.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sdc.NIL;
            collision = cdolist_list_var.first();
            while (sdc.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (col.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sdc.NIL != cached_args && sdc.NIL == cached_args.rest() && mt_info.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_all_isa_sdct_internal(col, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(col, mt_info));
        return memoization_state.caching_results(results3);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 20797L)
    public static SubLObject union_all_isa_sdct(final SubLObject cols, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        SubLObject isa_sdct = (SubLObject)sdc.NIL;
        SubLObject cdolist_list_var = isa.union_all_isa(cols, mt, (SubLObject)sdc.UNPROVIDED);
        SubLObject v_isa = (SubLObject)sdc.NIL;
        v_isa = cdolist_list_var.first();
        while (sdc.NIL != cdolist_list_var) {
            if (sdc.NIL != relevant_sibling_disjoint_collection_p(v_isa)) {
                isa_sdct = (SubLObject)ConsesLow.cons(v_isa, isa_sdct);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
        }
        return isa_sdct;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 21154L)
    public static SubLObject sdc_elementP(final SubLObject col, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        return sdct_elementP(col, mt);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 21435L)
    public static SubLObject sdct_elementP(final SubLObject col, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        if (sdc.NIL != term.ground_nautP(col, (SubLObject)sdc.UNPROVIDED)) {
            return sdct_elementP(narts_high.find_nart(col), mt);
        }
        if (sdc.NIL != fort_types_interface.collectionP(col)) {
            return isa.any_wrt_all_isa((SubLObject)sdc.$sym25$RELEVANT_SIBLING_DISJOINT_COLLECTION_P, col, mt, (SubLObject)sdc.UNPROVIDED);
        }
        return (SubLObject)sdc.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 21738L)
    public static SubLObject safe_sdct_elementP(final SubLObject col, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sdctP = (SubLObject)sdc.NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                sdctP = sdct_elementP(col, mt);
            }
            finally {
                final SubLObject _prev_bind_0_$43 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sdc.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return sdctP;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 21896L)
    public static SubLObject applicable_sdctP(final SubLObject col, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        if (sdc.NIL != term.ground_nautP(col, (SubLObject)sdc.UNPROVIDED)) {
            return sdct_elementP(narts_high.find_nart(col), mt);
        }
        if (sdc.NIL != fort_types_interface.collectionP(col)) {
            return genls.any_all_genls(Symbols.symbol_function((SubLObject)sdc.$sym28$SAFE_SDCT_ELEMENT_), col, mt, (SubLObject)sdc.UNPROVIDED);
        }
        return (SubLObject)sdc.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 22180L)
    public static SubLObject sdcP(final SubLObject c1, final SubLObject c2, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sdc.NIL != term.ground_nautP(c1, (SubLObject)sdc.UNPROVIDED)) {
            return sdcP(narts_high.find_nart(c1), c2, mt);
        }
        if (sdc.NIL != term.ground_nautP(c2, (SubLObject)sdc.UNPROVIDED)) {
            return sdcP(c1, narts_high.find_nart(c2), mt);
        }
        if (sdc.NIL == fort_types_interface.collectionP(c1)) {
            return (SubLObject)sdc.NIL;
        }
        if (sdc.NIL == fort_types_interface.collectionP(c2)) {
            return (SubLObject)sdc.NIL;
        }
        SubLObject sdcP = (SubLObject)sdc.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            sdcP = sdc_intP(c1, c2);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return sdcP;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 22727L)
    public static SubLObject sdc_intP(final SubLObject c1, final SubLObject c2) {
        if (sdc.NIL != ignoring_sdcP()) {
            return (SubLObject)sdc.NIL;
        }
        if (sdc.NIL == isa_common_sdctP(c1, c2, (SubLObject)sdc.UNPROVIDED)) {
            return (SubLObject)sdc.NIL;
        }
        if (sdc.NIL != establishing_supersetP(c1, c2, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED)) {
            return (SubLObject)sdc.NIL;
        }
        if (sdc.NIL != establishing_supersetP(c2, c1, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED)) {
            return (SubLObject)sdc.NIL;
        }
        if (sdc.NIL != establishing_instance_ofP(c1, c2, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED)) {
            return (SubLObject)sdc.NIL;
        }
        return (SubLObject)sdc.T;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 23140L)
    public static SubLObject any_sdc_wrtP(final SubLObject c1s, final SubLObject c2, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sdc.NIL != c1s && sdc.NIL != fort_types_interface.collectionP(c2) && sdc.NIL == ignoring_sdcP()) {
            thread.resetMultipleValues();
            final SubLObject sdcP = any_isa_common_sdct_among(c1s, c2, mt, (SubLObject)sdc.UNPROVIDED);
            final SubLObject rel_c1 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = c1s;
            SubLObject c3 = (SubLObject)sdc.NIL;
            c3 = cdolist_list_var.first();
            while (sdc.NIL != cdolist_list_var) {
                if (sdc.NIL == establishing_supersetP(c3, c2, mt, (SubLObject)sdc.UNPROVIDED)) {
                    if (sdc.NIL == establishing_supersetP(c2, c3, mt, (SubLObject)sdc.UNPROVIDED)) {
                        if (sdc.NIL != establishing_instance_ofP(c3, c2, mt, (SubLObject)sdc.UNPROVIDED)) {
                            return (SubLObject)sdc.NIL;
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                c3 = cdolist_list_var.first();
            }
            return list_utilities.sublisp_boolean(sdcP);
        }
        return (SubLObject)sdc.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 23881L)
    public static SubLObject any_sdc_wrt(final SubLObject c1s, final SubLObject c2, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        if (sdc.NIL != c1s && sdc.NIL != fort_types_interface.collectionP(c2) && sdc.NIL == ignoring_sdcP()) {
            SubLObject sdcP = (SubLObject)sdc.NIL;
            if (sdc.NIL == sdcP) {
                SubLObject csome_list_var = c1s;
                SubLObject c3 = (SubLObject)sdc.NIL;
                c3 = csome_list_var.first();
                while (sdc.NIL == sdcP && sdc.NIL != csome_list_var) {
                    if (sdc.NIL != isa_common_sdctP(c3, c2, mt)) {
                        if (sdc.NIL == establishing_supersetP(c3, c2, mt, (SubLObject)sdc.UNPROVIDED)) {
                            if (sdc.NIL == establishing_supersetP(c2, c3, mt, (SubLObject)sdc.UNPROVIDED)) {
                                if (sdc.NIL != establishing_instance_ofP(c3, c2, mt, (SubLObject)sdc.UNPROVIDED)) {
                                    return (SubLObject)sdc.NIL;
                                }
                                sdcP = (SubLObject)sdc.T;
                            }
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    c3 = csome_list_var.first();
                }
            }
            return sdcP;
        }
        return (SubLObject)sdc.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 24621L)
    public static SubLObject any_sdc_anyP(final SubLObject c1s, final SubLObject c2s, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject c1_sdcts = cols_with_applicable_sdct(c1s, mt);
        if (sdc.NIL != c1_sdcts) {
            SubLObject sdcP = (SubLObject)sdc.NIL;
            SubLObject rel_c1s = (SubLObject)sdc.NIL;
            SubLObject rel_c2 = (SubLObject)sdc.NIL;
            if (sdc.NIL == sdcP) {
                SubLObject csome_list_var = cols_with_applicable_sdct(c2s, mt);
                SubLObject sdct2 = (SubLObject)sdc.NIL;
                sdct2 = csome_list_var.first();
                while (sdc.NIL == sdcP && sdc.NIL != csome_list_var) {
                    thread.resetMultipleValues();
                    final SubLObject sdcP_$44 = any_sdc_wrtP(c1_sdcts, sdct2, mt);
                    final SubLObject rel_c1s_$45 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    sdcP = sdcP_$44;
                    rel_c1s = rel_c1s_$45;
                    if (sdc.NIL != sdcP) {
                        rel_c2 = sdct2;
                    }
                    csome_list_var = csome_list_var.rest();
                    sdct2 = csome_list_var.first();
                }
            }
            return list_utilities.sublisp_boolean(sdcP);
        }
        return (SubLObject)sdc.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 25224L)
    public static SubLObject any_sdc_any(final SubLObject c1s, final SubLObject c2s, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        SubLObject sdc_pair = (SubLObject)sdc.NIL;
        if (sdc.NIL == sdc_pair) {
            SubLObject csome_list_var = cols_with_applicable_sdct(c1s, mt);
            SubLObject sdct1 = (SubLObject)sdc.NIL;
            sdct1 = csome_list_var.first();
            while (sdc.NIL == sdc_pair && sdc.NIL != csome_list_var) {
                if (sdc.NIL == sdc_pair) {
                    SubLObject csome_list_var_$46 = cols_with_applicable_sdct(c2s, mt);
                    SubLObject sdct2 = (SubLObject)sdc.NIL;
                    sdct2 = csome_list_var_$46.first();
                    while (sdc.NIL == sdc_pair && sdc.NIL != csome_list_var_$46) {
                        if (sdc.NIL != sdcP(sdct1, sdct2, mt)) {
                            sdc_pair = (SubLObject)ConsesLow.list(sdct1, sdct2);
                        }
                        csome_list_var_$46 = csome_list_var_$46.rest();
                        sdct2 = csome_list_var_$46.first();
                    }
                }
                csome_list_var = csome_list_var.rest();
                sdct1 = csome_list_var.first();
            }
        }
        return sdc_pair;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 25751L)
    public static SubLObject sdc_exceptions(final SubLObject collection, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        if (sdc.NIL != control_vars.within_assertP()) {
            return (SubLObject)sdc.NIL;
        }
        return sdc_exceptions_int(collection, mt);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 26133L)
    public static SubLObject sdc_exceptions_int(final SubLObject collection, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.remove_duplicate_forts(ConsesLow.nconc(direct_sdc_exceptions(collection, mt), (SubLObject)((sdc.NIL != sdc.$sdc_common_spec_exceptionP$.getDynamicValue(thread)) ? collections_sharing_specs(collection, mt) : sdc.NIL)));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 26369L)
    public static SubLObject clear_cached_sdc_exceptions() {
        final SubLObject cs = sdc.$cached_sdc_exceptions_caching_state$.getGlobalValue();
        if (sdc.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)sdc.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 26369L)
    public static SubLObject remove_cached_sdc_exceptions(final SubLObject collection) {
        return memoization_state.caching_state_remove_function_results_with_args(sdc.$cached_sdc_exceptions_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(collection), (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 26369L)
    public static SubLObject cached_sdc_exceptions_internal(final SubLObject collection) {
        return sdc_exceptions_int(collection, (SubLObject)sdc.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 26369L)
    public static SubLObject cached_sdc_exceptions(final SubLObject collection) {
        SubLObject caching_state = sdc.$cached_sdc_exceptions_caching_state$.getGlobalValue();
        if (sdc.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)sdc.$sym29$CACHED_SDC_EXCEPTIONS, (SubLObject)sdc.$sym30$_CACHED_SDC_EXCEPTIONS_CACHING_STATE_, (SubLObject)sdc.NIL, (SubLObject)sdc.EQL, (SubLObject)sdc.ONE_INTEGER, (SubLObject)sdc.SIXTEEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, collection, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_sdc_exceptions_internal(collection)));
            memoization_state.caching_state_put(caching_state, collection, results, (SubLObject)sdc.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 26911L)
    public static SubLObject declared_sdc_exceptions(final SubLObject collection, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        return sdc_exceptions_of_genls(collection, mt);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 27130L)
    public static SubLObject sdc_exceptions_of_genls(final SubLObject collection, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        return sbhl_search_methods.sbhl_gather_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(sdc.$const13$genls), collection, (SubLObject)sdc.$sym31$GATHER_DIRECT_SDC_EXCEPTIONS, mt, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 27370L)
    public static SubLObject gather_direct_sdc_exceptions(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_search_vars.$sbhl_result$.setDynamicValue(ConsesLow.nconc(sbhl_search_vars.$sbhl_result$.getDynamicValue(thread), direct_sdc_exceptions(collection, (SubLObject)sdc.UNPROVIDED)), thread);
        return (SubLObject)sdc.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 27572L)
    public static SubLObject direct_sdc_exceptions(final SubLObject collection, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        return conses_high.nunion(conses_high.nunion(kb_mapping_utilities.pred_values_in_relevant_mts(collection, sdc.$const32$siblingDisjointExceptions, mt, (SubLObject)sdc.ONE_INTEGER, (SubLObject)sdc.TWO_INTEGER, (SubLObject)sdc.UNPROVIDED), kb_mapping_utilities.pred_values_in_relevant_mts(collection, sdc.$const32$siblingDisjointExceptions, mt, (SubLObject)sdc.TWO_INTEGER, (SubLObject)sdc.ONE_INTEGER, (SubLObject)sdc.UNPROVIDED), (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED), conses_high.nunion(kb_mapping_utilities.pred_values_in_relevant_mts(collection, sdc.$const33$rewriteOf, mt, (SubLObject)sdc.ONE_INTEGER, (SubLObject)sdc.TWO_INTEGER, (SubLObject)sdc.UNPROVIDED), kb_mapping_utilities.pred_values_in_relevant_mts(collection, sdc.$const33$rewriteOf, mt, (SubLObject)sdc.TWO_INTEGER, (SubLObject)sdc.ONE_INTEGER, (SubLObject)sdc.UNPROVIDED), (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED), (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 28041L)
    public static SubLObject direct_sdc_exceptionP(final SubLObject c1, final SubLObject c2, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(sdc.NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts(sdc.$const32$siblingDisjointExceptions, c1, c2, mt, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED) || sdc.NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts(sdc.$const32$siblingDisjointExceptions, c2, c1, mt, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED) || sdc.NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts(sdc.$const33$rewriteOf, c1, c2, mt, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED) || sdc.NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts(sdc.$const33$rewriteOf, c2, c1, mt, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 28466L)
    public static SubLObject collections_sharing_specs(final SubLObject collection, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        return genls.union_all_genls(genls.collection_leaves(collection, mt, (SubLObject)sdc.UNPROVIDED), mt, (SubLObject)sdc.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 28814L)
    public static SubLObject sdc_exceptionP(final SubLObject c1, final SubLObject c2, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(sdc.NIL != declared_sdc_exceptionP(c1, c2, mt) || sdc.NIL != sdc_common_specP(c1, c2, mt));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 28986L)
    public static SubLObject declared_sdc_exceptionP(final SubLObject c1, final SubLObject c2, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sdc.NIL != sdc.$sdc_exception_transfers_thru_specsP$.getDynamicValue(thread)) {
            return remote_sdc_exceptionP(c1, c2, mt);
        }
        return direct_sdc_exceptionP(c1, c2, mt);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 29187L)
    public static SubLObject remote_sdc_exceptionP(final SubLObject c1, final SubLObject c2, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        return Types.booleanp(any_remote_sdc_exception_pair(c1, c2, mt));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 29377L)
    public static SubLObject any_remote_sdc_exception_pair(final SubLObject c1, final SubLObject c2, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sdc.NIL;
        final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)sdc.NIL, thread);
            sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject _prev_bind_0_$47 = sbhl_marking_vars.$sbhl_space_1$.currentBinding(thread);
                final SubLObject _prev_bind_1_$48 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space_1$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                    sbhl_marking_methods.sbhl_mark_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(sdc.$const13$genls), c1, mt, (SubLObject)sdc.UNPROVIDED);
                    final SubLObject resourcing_p_$49 = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                    final SubLObject _prev_bind_0_$48 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$49 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)sdc.NIL, thread);
                        sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject _prev_bind_0_$49 = sbhl_marking_vars.$sbhl_space_2$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$50 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_space_2$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p_$49, thread);
                                sbhl_marking_methods.sbhl_mark_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(sdc.$const13$genls), c2, mt, (SubLObject)sdc.UNPROVIDED);
                                final SubLObject map_table = Hashtables.hash_table_count(sbhl_marking_vars.$sbhl_space_1$.getDynamicValue(thread)).numG(Hashtables.hash_table_count(sbhl_marking_vars.$sbhl_space_2$.getDynamicValue(thread))) ? sbhl_marking_vars.$sbhl_space_2$.getDynamicValue(thread) : sbhl_marking_vars.$sbhl_space_1$.getDynamicValue(thread);
                                final SubLObject _prev_bind_0_$50 = sbhl_marking_vars.$sbhl_goal_table$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_goal_table$.bind(map_table.eql(sbhl_marking_vars.$sbhl_space_1$.getDynamicValue(thread)) ? sbhl_marking_vars.$sbhl_space_2$.getDynamicValue(thread) : sbhl_marking_vars.$sbhl_space_1$.getDynamicValue(thread), thread);
                                    if (sdc.NIL == result) {
                                        SubLObject catch_var = (SubLObject)sdc.NIL;
                                        try {
                                            thread.throwStack.push(sdc.$kw14$DO_HASH_TABLE);
                                            SubLObject col = (SubLObject)sdc.NIL;
                                            SubLObject mark = (SubLObject)sdc.NIL;
                                            final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(map_table);
                                            try {
                                                while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                                                    final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                                                    col = Hashtables.getEntryKey(cdohash_entry);
                                                    mark = Hashtables.getEntryValue(cdohash_entry);
                                                    subl_macros.do_hash_table_done_check(result);
                                                    result = gather_any_genls_sdc_exception(col);
                                                }
                                            }
                                            finally {
                                                Hashtables.releaseEntrySetIterator(cdohash_iterator);
                                            }
                                        }
                                        catch (Throwable ccatch_env_var) {
                                            catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)sdc.$kw14$DO_HASH_TABLE);
                                        }
                                        finally {
                                            thread.throwStack.pop();
                                        }
                                    }
                                }
                                finally {
                                    sbhl_marking_vars.$sbhl_goal_table$.rebind(_prev_bind_0_$50, thread);
                                }
                            }
                            finally {
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$50, thread);
                                sbhl_marking_vars.$sbhl_space_2$.rebind(_prev_bind_0_$49, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$51 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sdc.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$51, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$49, thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$48, thread);
                    }
                }
                finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$48, thread);
                    sbhl_marking_vars.$sbhl_space_1$.rebind(_prev_bind_0_$47, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$52 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sdc.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 30195L)
    public static SubLObject gather_any_genls_sdc_exception(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sdc.NIL;
        final SubLObject _prev_bind_0 = control_vars.$mapping_answer$.currentBinding(thread);
        try {
            control_vars.$mapping_answer$.bind((SubLObject)sdc.NIL, thread);
            final SubLObject _prev_bind_0_$57 = control_vars.$mapping_gather_arg$.currentBinding(thread);
            try {
                control_vars.$mapping_gather_arg$.bind((SubLObject)sdc.TWO_INTEGER, thread);
                kb_mapping.map_gaf_arg_index(Symbols.symbol_function((SubLObject)sdc.$sym34$GATHER_DIRECT_SDC_EXCEPTION), col, (SubLObject)sdc.ONE_INTEGER, sdc.$const32$siblingDisjointExceptions, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED);
                kb_mapping.map_gaf_arg_index(Symbols.symbol_function((SubLObject)sdc.$sym34$GATHER_DIRECT_SDC_EXCEPTION), col, (SubLObject)sdc.ONE_INTEGER, sdc.$const33$rewriteOf, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED);
            }
            finally {
                control_vars.$mapping_gather_arg$.rebind(_prev_bind_0_$57, thread);
            }
            if (sdc.NIL == control_vars.$mapping_answer$.getDynamicValue(thread)) {
                final SubLObject _prev_bind_0_$58 = control_vars.$mapping_gather_arg$.currentBinding(thread);
                try {
                    control_vars.$mapping_gather_arg$.bind((SubLObject)sdc.ONE_INTEGER, thread);
                    kb_mapping.map_gaf_arg_index(Symbols.symbol_function((SubLObject)sdc.$sym34$GATHER_DIRECT_SDC_EXCEPTION), col, (SubLObject)sdc.TWO_INTEGER, sdc.$const32$siblingDisjointExceptions, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED);
                    kb_mapping.map_gaf_arg_index(Symbols.symbol_function((SubLObject)sdc.$sym34$GATHER_DIRECT_SDC_EXCEPTION), col, (SubLObject)sdc.TWO_INTEGER, sdc.$const33$rewriteOf, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED);
                }
                finally {
                    control_vars.$mapping_gather_arg$.rebind(_prev_bind_0_$58, thread);
                }
            }
            if (sdc.NIL != control_vars.$mapping_answer$.getDynamicValue(thread)) {
                result = (SubLObject)ConsesLow.list(col, control_vars.$mapping_answer$.getDynamicValue(thread));
            }
        }
        finally {
            control_vars.$mapping_answer$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 30810L)
    public static SubLObject gather_direct_sdc_exception(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject col = assertions_high.gaf_arg(assertion, control_vars.$mapping_gather_arg$.getDynamicValue(thread));
        if (sdc.NIL != sbhl_marking_methods.sbhl_recorded_node_p(col, sbhl_marking_vars.$sbhl_goal_table$.getDynamicValue(thread))) {
            control_vars.$mapping_answer$.setDynamicValue(col, thread);
            utilities_macros.mapping_finished();
        }
        return (SubLObject)sdc.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 31055L)
    public static SubLObject sdc_common_specP(final SubLObject c1, final SubLObject c2, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sdc.NIL != sdc.$sdc_common_spec_exceptionP$.getDynamicValue(thread)) {
            return remote_sdc_common_specP(c1, c2, mt);
        }
        return (SubLObject)sdc.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 31195L)
    public static SubLObject remote_sdc_common_specP(final SubLObject c1, final SubLObject c2, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        return genls.floor_of_col_pairP(c1, c2, mt);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 31366L)
    public static SubLObject sdct_elements(final SubLObject cols, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        SubLObject result = (SubLObject)sdc.NIL;
        SubLObject cdolist_list_var = cols;
        SubLObject col = (SubLObject)sdc.NIL;
        col = cdolist_list_var.first();
        while (sdc.NIL != cdolist_list_var) {
            if (sdc.NIL != sdct_elementP(col, mt)) {
                result = (SubLObject)ConsesLow.cons(col, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 31580L)
    public static SubLObject cols_with_applicable_sdct(final SubLObject cols, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        SubLObject result = (SubLObject)sdc.NIL;
        SubLObject cdolist_list_var = cols;
        SubLObject col = (SubLObject)sdc.NIL;
        col = cdolist_list_var.first();
        while (sdc.NIL != cdolist_list_var) {
            if (sdc.NIL != applicable_sdctP(col, mt)) {
                result = (SubLObject)ConsesLow.cons(col, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 31775L)
    public static SubLObject establishing_supersetP(final SubLObject c1, final SubLObject c2, SubLObject mt, SubLObject assertion) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        if (assertion == sdc.UNPROVIDED) {
            assertion = sbhl_link_vars.$added_assertion$.getDynamicValue();
        }
        if (sdc.NIL != control_vars.within_assertP()) {
            return (SubLObject)sdc.NIL;
        }
        if (sdc.NIL != assertion) {
            final SubLObject axiom = assertions_high.assertion_formula(assertion);
            final SubLObject truth = assertions_high.assertion_truth(assertion);
            final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
            final SubLObject a1 = conses_high.second(axiom);
            final SubLObject a2 = conses_high.third(axiom);
            return (SubLObject)SubLObjectFactory.makeBoolean(sdc.NIL != el_utilities.genls_litP(axiom) && truth == sdc.$kw35$TRUE && sdc.NIL != mt_relevance_macros.relevant_mtP(assertion_mt) && sdc.NIL != genls.genlP(c1, a1, mt, (SubLObject)sdc.UNPROVIDED) && sdc.NIL != genls.genlP(a2, c2, mt, (SubLObject)sdc.UNPROVIDED));
        }
        if (sdc.NIL != wff_macros.within_wffP() && sdc.NIL != control_vars.within_assertP()) {
            final SubLObject formula = wff_vars.wff_formula();
            return (SubLObject)SubLObjectFactory.makeBoolean(sdc.NIL != el_utilities.genls_litP(formula) && sdc.NIL == el_utilities.el_negation_p(formula) && sdc.NIL != forts.fort_p(el_utilities.literal_arg1(formula, (SubLObject)sdc.UNPROVIDED)) && sdc.NIL != forts.fort_p(el_utilities.literal_arg2(formula, (SubLObject)sdc.UNPROVIDED)) && sdc.NIL != genls.genlP(c1, el_utilities.literal_arg1(formula, (SubLObject)sdc.UNPROVIDED), (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED) && sdc.NIL != genls.genlP(el_utilities.literal_arg2(formula, (SubLObject)sdc.UNPROVIDED), c2, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED));
        }
        return (SubLObject)sdc.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 32761L)
    public static SubLObject establishing_instance_ofP(final SubLObject c1, final SubLObject c2, SubLObject mt, SubLObject assertion) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        if (assertion == sdc.UNPROVIDED) {
            assertion = sbhl_link_vars.$added_assertion$.getDynamicValue();
        }
        if (sdc.NIL != control_vars.within_assertP()) {
            return (SubLObject)sdc.NIL;
        }
        if (sdc.NIL != assertion) {
            final SubLObject axiom = assertions_high.assertion_formula(assertion);
            final SubLObject truth = assertions_high.assertion_truth(assertion);
            final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
            final SubLObject a1 = conses_high.second(axiom);
            final SubLObject a2 = conses_high.third(axiom);
            return (SubLObject)SubLObjectFactory.makeBoolean(sdc.NIL != el_utilities.isa_litP(axiom) && truth == sdc.$kw35$TRUE && sdc.NIL != mt_relevance_macros.relevant_mtP(assertion_mt) && sdc.NIL != genls.genlP(a2, c1, mt, (SubLObject)sdc.UNPROVIDED) && sdc.NIL != genls.genlP(a2, c2, mt, (SubLObject)sdc.UNPROVIDED));
        }
        return (SubLObject)sdc.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 33391L)
    public static SubLObject why_sdcP(final SubLObject c1, final SubLObject c2, SubLObject mt, SubLObject behavior) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        if (behavior == sdc.UNPROVIDED) {
            behavior = (SubLObject)sdc.NIL;
        }
        if (behavior == sdc.$kw36$ASSERTION) {
            return assemble_sdc_just(why_sdcP(c1, c2, mt, (SubLObject)sdc.UNPROVIDED));
        }
        return any_just_of_sdc(c1, c2, mt);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 33701L)
    public static SubLObject assemble_sdc_just(final SubLObject justs) {
        SubLObject result = (SubLObject)sdc.NIL;
        SubLObject cdolist_list_var = justs;
        SubLObject just = (SubLObject)sdc.NIL;
        just = cdolist_list_var.first();
        while (sdc.NIL != cdolist_list_var) {
            if (sdc.NIL != arguments.hl_support_p(just)) {
                result = (SubLObject)ConsesLow.cons(just, result);
            }
            else {
                final SubLObject gaf = just.first();
                SubLObject ass = (SubLObject)sdc.NIL;
                if (sdc.NIL != gaf) {
                    ass = kb_indexing.find_gaf_possibly_in_mt(gaf, (SubLObject)sdc.UNPROVIDED);
                }
                if (sdc.NIL != ass) {
                    result = (SubLObject)ConsesLow.cons(ass, result);
                }
                else {
                    result = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)sdc.$kw37$OPAQUE, just.first(), (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED), result);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            just = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 34079L)
    public static SubLObject any_just_of_sdc(final SubLObject c1, final SubLObject c2, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        if (sdc.NIL == forts.fort_p(c1)) {
            final SubLObject c1_nart = narts_high.find_nart(c1);
            if (sdc.NIL != c1_nart) {
                return any_just_of_sdc(c1_nart, c2, mt);
            }
            return (SubLObject)sdc.NIL;
        }
        else if (sdc.NIL == forts.fort_p(c2)) {
            final SubLObject c2_nart = narts_high.find_nart(c2);
            if (sdc.NIL != c2_nart) {
                return any_just_of_sdc(c1, c2_nart, mt);
            }
            return (SubLObject)sdc.NIL;
        }
        else {
            final SubLObject sdct = any_isa_common_sdct(c1, c2, mt, (SubLObject)sdc.UNPROVIDED);
            if (sdc.NIL == sdct) {
                return (SubLObject)sdc.NIL;
            }
            if (sdc.NIL != genls.genlP(c1, c2, mt, (SubLObject)sdc.UNPROVIDED)) {
                return (SubLObject)sdc.NIL;
            }
            if (sdc.NIL != genls.genlP(c2, c1, mt, (SubLObject)sdc.UNPROVIDED)) {
                return (SubLObject)sdc.NIL;
            }
            if (sdc.NIL != establishing_supersetP(c1, c2, mt, (SubLObject)sdc.UNPROVIDED)) {
                return (SubLObject)sdc.NIL;
            }
            if (sdc.NIL != establishing_supersetP(c2, c1, mt, (SubLObject)sdc.UNPROVIDED)) {
                return (SubLObject)sdc.NIL;
            }
            if (sdc.NIL != establishing_instance_ofP(c1, c2, mt, (SubLObject)sdc.UNPROVIDED)) {
                return (SubLObject)sdc.NIL;
            }
            return ConsesLow.nconc(any_just_of_isa_sdct(c1, sdct, mt), any_just_of_isa_sdct(c2, sdct, mt), isa.any_just_of_isa(sdct, sdc.$const38$SiblingDisjointCollectionType, mt));
        }
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 35013L)
    public static SubLObject any_just_of_isa_sdct(final SubLObject col, final SubLObject sdct, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        final SubLObject genl = genls.any_genl_isa(col, sdct, mt, (SubLObject)sdc.UNPROVIDED);
        if (genl.eql(col)) {
            return isa.any_just_of_isa(col, sdct, mt);
        }
        return ConsesLow.nconc(genls.why_genlP(col, genl, mt, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED), isa.any_just_of_isa(genl, sdct, mt));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 35263L)
    public static SubLObject why_sdc_exceptionP(final SubLObject c1, final SubLObject c2, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        SubLObject why = why_declared_sdc_exceptionP(c1, c2, mt);
        if (sdc.NIL == why) {
            why = why_sdc_common_specP(c1, c2, mt);
        }
        return why;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 35459L)
    public static SubLObject why_declared_sdc_exceptionP(final SubLObject c1, final SubLObject c2, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sdc.NIL != sdc.$sdc_exception_transfers_thru_specsP$.getDynamicValue(thread)) {
            return why_remote_sdc_exceptionP(c1, c2, mt);
        }
        return why_direct_sdc_exceptionP(c1, c2, mt);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 35672L)
    public static SubLObject why_direct_sdc_exceptionP(final SubLObject c1, final SubLObject c2, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        if (sdc.NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts(sdc.$const32$siblingDisjointExceptions, c1, c2, mt, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED)) {
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(el_utilities.make_binary_formula(sdc.$const32$siblingDisjointExceptions, c1, c2), (SubLObject)sdc.$kw35$TRUE));
        }
        if (sdc.NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts(sdc.$const32$siblingDisjointExceptions, c2, c1, mt, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED)) {
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(el_utilities.make_binary_formula(sdc.$const32$siblingDisjointExceptions, c2, c1), (SubLObject)sdc.$kw35$TRUE));
        }
        if (sdc.NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts(sdc.$const33$rewriteOf, c1, c2, mt, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED)) {
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(el_utilities.make_binary_formula(sdc.$const33$rewriteOf, c1, c2), (SubLObject)sdc.$kw35$TRUE));
        }
        if (sdc.NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts(sdc.$const33$rewriteOf, c2, c1, mt, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED)) {
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(el_utilities.make_binary_formula(sdc.$const33$rewriteOf, c2, c1), (SubLObject)sdc.$kw35$TRUE));
        }
        return (SubLObject)sdc.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 36320L)
    public static SubLObject why_remote_sdc_exceptionP(final SubLObject c1, final SubLObject c2, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        final SubLObject source = genls.shallowest_col(c1, c2);
        final SubLObject target = source.eql(c1) ? c2 : c1;
        final SubLObject remote_pair = any_remote_sdc_exception_pair(source, target, mt);
        if (sdc.NIL != remote_pair) {
            SubLObject current;
            final SubLObject datum = current = remote_pair;
            SubLObject spec1 = (SubLObject)sdc.NIL;
            SubLObject spec2 = (SubLObject)sdc.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdc.$list39);
            spec1 = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdc.$list39);
            spec2 = current.first();
            current = current.rest();
            if (sdc.NIL == current) {
                return ConsesLow.nconc((SubLObject)(spec1.eql(source) ? sdc.NIL : genls.why_genlP(source, spec1, mt, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED)), (SubLObject)(spec2.eql(target) ? sdc.NIL : genls.why_genlP(target, spec2, mt, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED)), why_direct_sdc_exceptionP(spec1, spec2, mt));
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sdc.$list39);
        }
        return (SubLObject)sdc.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 36803L)
    public static SubLObject why_sdc_common_specP(final SubLObject c1, final SubLObject c2, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sdc.NIL != sdc.$sdc_common_spec_exceptionP$.getDynamicValue(thread)) {
            return why_remote_common_specP(c1, c2, mt);
        }
        return (SubLObject)sdc.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 36947L)
    public static SubLObject why_remote_common_specP(final SubLObject c1, final SubLObject c2, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        final SubLObject pcase_var;
        final SubLObject spec = pcase_var = genls.any_floor_of_col_pair(c1, c2, mt, (SubLObject)sdc.UNPROVIDED);
        if (pcase_var.eql((SubLObject)sdc.$sym40$C1)) {
            return genls.why_genlP(spec, c2, mt, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED);
        }
        if (pcase_var.eql((SubLObject)sdc.$sym41$C2)) {
            return genls.why_genlP(spec, c1, mt, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED);
        }
        return ConsesLow.nconc(genls.why_genlP(spec, c1, mt, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED), genls.why_genlP(spec, c2, mt, (SubLObject)sdc.UNPROVIDED, (SubLObject)sdc.UNPROVIDED));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 37332L)
    public static SubLObject isa_common_sdctP(final SubLObject c1, final SubLObject c2, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        return list_utilities.sublisp_boolean(any_isa_common_sdct(c1, c2, mt, (SubLObject)sdc.UNPROVIDED));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 37503L)
    public static SubLObject isa_common_sdct_amongP(final SubLObject c1s, final SubLObject c2, SubLObject mt) {
        if (mt == sdc.UNPROVIDED) {
            mt = (SubLObject)sdc.NIL;
        }
        return list_utilities.sublisp_boolean(any_isa_common_sdct_among(c1s, c2, mt, (SubLObject)sdc.UNPROVIDED));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdc.lisp", position = 37832L)
    public static SubLObject sdw_error(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == sdc.UNPROVIDED) {
            arg1 = (SubLObject)sdc.NIL;
        }
        if (arg2 == sdc.UNPROVIDED) {
            arg2 = (SubLObject)sdc.NIL;
        }
        if (arg3 == sdc.UNPROVIDED) {
            arg3 = (SubLObject)sdc.NIL;
        }
        if (arg4 == sdc.UNPROVIDED) {
            arg4 = (SubLObject)sdc.NIL;
        }
        if (arg5 == sdc.UNPROVIDED) {
            arg5 = (SubLObject)sdc.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sdc.$sdw_trace_level$.getDynamicValue(thread).numGE(level)) {
            Errors.cerror((SubLObject)sdc.$str10$continue_anyway, format_str, new SubLObject[] { arg1, arg2, arg3, arg4, arg5 });
        }
        else if (Numbers.add((SubLObject)sdc.TWO_INTEGER, at_vars.$at_trace_level$.getDynamicValue(thread)).numGE(level)) {
            Errors.warn(format_str, new SubLObject[] { arg1, arg2, arg3, arg4, arg5 });
        }
        return (SubLObject)sdc.NIL;
    }

    public static SubLObject declare_sdc_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "ignoring_sdcP", "IGNORING-SDC?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "relevant_sibling_disjoint_collection_p", "RELEVANT-SIBLING-DISJOINT-COLLECTION-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sdc", "with_sbhl_sd_marking_spaces", "WITH-SBHL-SD-MARKING-SPACES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sdc", "with_sbhl_sd_genls_isas_spaces", "WITH-SBHL-SD-GENLS-ISAS-SPACES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "any_isa_common_sdct", "ANY-ISA-COMMON-SDCT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "any_isa_common_sdct_among", "ANY-ISA-COMMON-SDCT-AMONG", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "sbhl_mark_sd_c1_genls_and_non_c2_genls_isas", "SBHL-MARK-SD-C1-GENLS-AND-NON-C2-GENLS-ISAS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "sbhl_mark_sd_c1s_genls_and_non_c2_genls_isas", "SBHL-MARK-SD-C1S-GENLS-AND-NON-C2-GENLS-ISAS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "sbhl_mark_sd_genls_isas", "SBHL-MARK-SD-GENLS-ISAS", 1, 0, false);
        new $sbhl_mark_sd_genls_isas$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "sbhl_gather_first_sd_or_store_sd_candidates", "SBHL-GATHER-FIRST-SD-OR-STORE-SD-CANDIDATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "sbhl_gather_sd_candidates", "SBHL-GATHER-SD-CANDIDATES", 1, 0, false);
        new $sbhl_gather_sd_candidates$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "sbhl_determine_sd_and_store_candidates", "SBHL-DETERMINE-SD-AND-STORE-CANDIDATES", 1, 0, false);
        new $sbhl_determine_sd_and_store_candidates$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "clear_cached_sbhl_sd_relevant_c2_genl_isa_candidateP", "CLEAR-CACHED-SBHL-SD-RELEVANT-C2-GENL-ISA-CANDIDATE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "remove_cached_sbhl_sd_relevant_c2_genl_isa_candidateP", "REMOVE-CACHED-SBHL-SD-RELEVANT-C2-GENL-ISA-CANDIDATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "cached_sbhl_sd_relevant_c2_genl_isa_candidateP_internal", "CACHED-SBHL-SD-RELEVANT-C2-GENL-ISA-CANDIDATE?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "cached_sbhl_sd_relevant_c2_genl_isa_candidateP", "CACHED-SBHL-SD-RELEVANT-C2-GENL-ISA-CANDIDATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "sbhl_sd_relevant_c2_genl_isa_candidateP", "SBHL-SD-RELEVANT-C2-GENL-ISA-CANDIDATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "sbhl_determine_sd_and_store_relevant_candidates", "SBHL-DETERMINE-SD-AND-STORE-RELEVANT-CANDIDATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "sbhl_determine_sd_path_with_no_exceptions", "SBHL-DETERMINE-SD-PATH-WITH-NO-EXCEPTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "sbhl_determine_sd_path_with_no_exceptions_among", "SBHL-DETERMINE-SD-PATH-WITH-NO-EXCEPTIONS-AMONG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "any_sd_isa_path_excluding_exceptions_p", "ANY-SD-ISA-PATH-EXCLUDING-EXCEPTIONS-P", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "sbhl_sd_genls_and_genls_isa_path_p", "SBHL-SD-GENLS-AND-GENLS-ISA-PATH-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "sbhl_sd_goal_in_genls_isas_p", "SBHL-SD-GOAL-IN-GENLS-ISAS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "sdc", "SDC", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "max_sdc", "MAX-SDC", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "all_sdc", "ALL-SDC", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "max_sdc_int", "MAX-SDC-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "all_sdc_int", "ALL-SDC-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "remote_sdc_wrt", "REMOTE-SDC-WRT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "isa_sdct", "ISA-SDCT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "max_isa_sdct", "MAX-ISA-SDCT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "applicable_sdct", "APPLICABLE-SDCT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "gather_sdct_isas", "GATHER-SDCT-ISAS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "gather_if_sdctP", "GATHER-IF-SDCT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "all_isa_sdct", "ALL-ISA-SDCT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "clear_cached_all_isa_sdct", "CLEAR-CACHED-ALL-ISA-SDCT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "remove_cached_all_isa_sdct", "REMOVE-CACHED-ALL-ISA-SDCT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "cached_all_isa_sdct_internal", "CACHED-ALL-ISA-SDCT-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "cached_all_isa_sdct", "CACHED-ALL-ISA-SDCT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "union_all_isa_sdct", "UNION-ALL-ISA-SDCT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "sdc_elementP", "SDC-ELEMENT?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "sdct_elementP", "SDCT-ELEMENT?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "safe_sdct_elementP", "SAFE-SDCT-ELEMENT?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "applicable_sdctP", "APPLICABLE-SDCT?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "sdcP", "SDC?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "sdc_intP", "SDC-INT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "any_sdc_wrtP", "ANY-SDC-WRT?", 2, 1, false);
        new $any_sdc_wrtP$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "any_sdc_wrt", "ANY-SDC-WRT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "any_sdc_anyP", "ANY-SDC-ANY?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "any_sdc_any", "ANY-SDC-ANY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "sdc_exceptions", "SDC-EXCEPTIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "sdc_exceptions_int", "SDC-EXCEPTIONS-INT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "clear_cached_sdc_exceptions", "CLEAR-CACHED-SDC-EXCEPTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "remove_cached_sdc_exceptions", "REMOVE-CACHED-SDC-EXCEPTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "cached_sdc_exceptions_internal", "CACHED-SDC-EXCEPTIONS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "cached_sdc_exceptions", "CACHED-SDC-EXCEPTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "declared_sdc_exceptions", "DECLARED-SDC-EXCEPTIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "sdc_exceptions_of_genls", "SDC-EXCEPTIONS-OF-GENLS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "gather_direct_sdc_exceptions", "GATHER-DIRECT-SDC-EXCEPTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "direct_sdc_exceptions", "DIRECT-SDC-EXCEPTIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "direct_sdc_exceptionP", "DIRECT-SDC-EXCEPTION?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "collections_sharing_specs", "COLLECTIONS-SHARING-SPECS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "sdc_exceptionP", "SDC-EXCEPTION?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "declared_sdc_exceptionP", "DECLARED-SDC-EXCEPTION?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "remote_sdc_exceptionP", "REMOTE-SDC-EXCEPTION?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "any_remote_sdc_exception_pair", "ANY-REMOTE-SDC-EXCEPTION-PAIR", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "gather_any_genls_sdc_exception", "GATHER-ANY-GENLS-SDC-EXCEPTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "gather_direct_sdc_exception", "GATHER-DIRECT-SDC-EXCEPTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "sdc_common_specP", "SDC-COMMON-SPEC?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "remote_sdc_common_specP", "REMOTE-SDC-COMMON-SPEC?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "sdct_elements", "SDCT-ELEMENTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "cols_with_applicable_sdct", "COLS-WITH-APPLICABLE-SDCT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "establishing_supersetP", "ESTABLISHING-SUPERSET?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "establishing_instance_ofP", "ESTABLISHING-INSTANCE-OF?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "why_sdcP", "WHY-SDC?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "assemble_sdc_just", "ASSEMBLE-SDC-JUST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "any_just_of_sdc", "ANY-JUST-OF-SDC", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "any_just_of_isa_sdct", "ANY-JUST-OF-ISA-SDCT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "why_sdc_exceptionP", "WHY-SDC-EXCEPTION?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "why_declared_sdc_exceptionP", "WHY-DECLARED-SDC-EXCEPTION?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "why_direct_sdc_exceptionP", "WHY-DIRECT-SDC-EXCEPTION?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "why_remote_sdc_exceptionP", "WHY-REMOTE-SDC-EXCEPTION?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "why_sdc_common_specP", "WHY-SDC-COMMON-SPEC?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "why_remote_common_specP", "WHY-REMOTE-COMMON-SPEC?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "isa_common_sdctP", "ISA-COMMON-SDCT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "isa_common_sdct_amongP", "ISA-COMMON-SDCT-AMONG?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdc", "sdw_error", "SDW-ERROR", 2, 5, false);
        return (SubLObject)sdc.NIL;
    }

    public static SubLObject init_sdc_file() {
        sdc.$sdc_exception_transfers_thru_specsP$ = SubLFiles.defparameter("*SDC-EXCEPTION-TRANSFERS-THRU-SPECS?*", (SubLObject)sdc.NIL);
        sdc.$sdc_common_spec_exceptionP$ = SubLFiles.defparameter("*SDC-COMMON-SPEC-EXCEPTION?*", (SubLObject)sdc.NIL);
        sdc.$ignoring_sdcP$ = SubLFiles.defparameter("*IGNORING-SDC?*", (SubLObject)sdc.NIL);
        sdc.$sd_c1_genls_space$ = SubLFiles.defparameter("*SD-C1-GENLS-SPACE*", (SubLObject)sdc.NIL);
        sdc.$sd_c2_genls_space$ = SubLFiles.defparameter("*SD-C2-GENLS-SPACE*", (SubLObject)sdc.NIL);
        sdc.$sd_genls_isas_space$ = SubLFiles.defparameter("*SD-GENLS-ISAS-SPACE*", (SubLObject)sdc.NIL);
        sdc.$sd_candidate_store$ = SubLFiles.defparameter("*SD-CANDIDATE-STORE*", (SubLObject)sdc.NIL);
        sdc.$sd_c2_genl$ = SubLFiles.defparameter("*SD-C2-GENL*", (SubLObject)sdc.NIL);
        sdc.$cached_sbhl_sd_relevant_c2_genl_isa_candidateP_caching_state$ = SubLFiles.deflexical("*CACHED-SBHL-SD-RELEVANT-C2-GENL-ISA-CANDIDATE?-CACHING-STATE*", (SubLObject)sdc.NIL);
        sdc.$sbhl_sd_genls_isas_goal$ = SubLFiles.defparameter("*SBHL-SD-GENLS-ISAS-GOAL*", (SubLObject)sdc.NIL);
        sdc.$cached_all_isa_sdct_caching_state$ = SubLFiles.deflexical("*CACHED-ALL-ISA-SDCT-CACHING-STATE*", (SubLObject)sdc.NIL);
        sdc.$cached_sdc_exceptions_caching_state$ = SubLFiles.deflexical("*CACHED-SDC-EXCEPTIONS-CACHING-STATE*", (SubLObject)sdc.NIL);
        sdc.$sdw_trace_level$ = SubLFiles.defvar("*SDW-TRACE-LEVEL*", (SubLObject)sdc.ONE_INTEGER);
        sdc.$sdw_test_level$ = SubLFiles.defvar("*SDW-TEST-LEVEL*", (SubLObject)sdc.ONE_INTEGER);
        return (SubLObject)sdc.NIL;
    }

    public static SubLObject setup_sdc_file() {
        memoization_state.note_globally_cached_function((SubLObject)sdc.$sym19$CACHED_SBHL_SD_RELEVANT_C2_GENL_ISA_CANDIDATE_);
        memoization_state.note_globally_cached_function((SubLObject)sdc.$sym24$CACHED_ALL_ISA_SDCT);
        memoization_state.note_globally_cached_function((SubLObject)sdc.$sym29$CACHED_SDC_EXCEPTIONS);
        return (SubLObject)sdc.NIL;
    }

    @Override
	public void declareFunctions() {
        declare_sdc_file();
    }

    @Override
	public void initializeVariables() {
        init_sdc_file();
    }

    @Override
	public void runTopLevelForms() {
        setup_sdc_file();
    }

    static {
        me = (SubLFile)new sdc();
        sdc.$sdc_exception_transfers_thru_specsP$ = null;
        sdc.$sdc_common_spec_exceptionP$ = null;
        sdc.$ignoring_sdcP$ = null;
        sdc.$sd_c1_genls_space$ = null;
        sdc.$sd_c2_genls_space$ = null;
        sdc.$sd_genls_isas_space$ = null;
        sdc.$sd_candidate_store$ = null;
        sdc.$sd_c2_genl$ = null;
        sdc.$cached_sbhl_sd_relevant_c2_genl_isa_candidateP_caching_state$ = null;
        sdc.$sbhl_sd_genls_isas_goal$ = null;
        sdc.$cached_all_isa_sdct_caching_state$ = null;
        sdc.$cached_sdc_exceptions_caching_state$ = null;
        sdc.$sdw_trace_level$ = null;
        sdc.$sdw_test_level$ = null;
        $sym0$INSTANTIATE_SBHL_MARKING_SPACE_FOR = SubLObjectFactory.makeSymbol("INSTANTIATE-SBHL-MARKING-SPACE-FOR");
        $sym1$_SD_C1_GENLS_SPACE_ = SubLObjectFactory.makeSymbol("*SD-C1-GENLS-SPACE*");
        $sym2$_SD_C2_GENLS_SPACE_ = SubLObjectFactory.makeSymbol("*SD-C2-GENLS-SPACE*");
        $sym3$_SD_GENLS_ISAS_SPACE_ = SubLObjectFactory.makeSymbol("*SD-GENLS-ISAS-SPACE*");
        $sym4$_SD_CANDIDATE_STORE_ = SubLObjectFactory.makeSymbol("*SD-CANDIDATE-STORE*");
        $sym5$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw6$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str7$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym8$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw9$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str10$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw11$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str12$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $const13$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $kw14$DO_HASH_TABLE = SubLObjectFactory.makeKeyword("DO-HASH-TABLE");
        $sym15$SBHL_MARK_SD_GENLS_ISAS = SubLObjectFactory.makeSymbol("SBHL-MARK-SD-GENLS-ISAS");
        $const16$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $sym17$SBHL_GATHER_SD_CANDIDATES = SubLObjectFactory.makeSymbol("SBHL-GATHER-SD-CANDIDATES");
        $sym18$SBHL_DETERMINE_SD_AND_STORE_CANDIDATES = SubLObjectFactory.makeSymbol("SBHL-DETERMINE-SD-AND-STORE-CANDIDATES");
        $sym19$CACHED_SBHL_SD_RELEVANT_C2_GENL_ISA_CANDIDATE_ = SubLObjectFactory.makeSymbol("CACHED-SBHL-SD-RELEVANT-C2-GENL-ISA-CANDIDATE?");
        $sym20$_CACHED_SBHL_SD_RELEVANT_C2_GENL_ISA_CANDIDATE__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-SBHL-SD-RELEVANT-C2-GENL-ISA-CANDIDATE?-CACHING-STATE*");
        $sym21$SBHL_SD_GOAL_IN_GENLS_ISAS_P = SubLObjectFactory.makeSymbol("SBHL-SD-GOAL-IN-GENLS-ISAS-P");
        $sym22$GATHER_SDCT_ISAS = SubLObjectFactory.makeSymbol("GATHER-SDCT-ISAS");
        $sym23$GATHER_IF_SDCT_ = SubLObjectFactory.makeSymbol("GATHER-IF-SDCT?");
        $sym24$CACHED_ALL_ISA_SDCT = SubLObjectFactory.makeSymbol("CACHED-ALL-ISA-SDCT");
        $sym25$RELEVANT_SIBLING_DISJOINT_COLLECTION_P = SubLObjectFactory.makeSymbol("RELEVANT-SIBLING-DISJOINT-COLLECTION-P");
        $sym26$_CACHED_ALL_ISA_SDCT_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-ALL-ISA-SDCT-CACHING-STATE*");
        $int27$512 = SubLObjectFactory.makeInteger(512);
        $sym28$SAFE_SDCT_ELEMENT_ = SubLObjectFactory.makeSymbol("SAFE-SDCT-ELEMENT?");
        $sym29$CACHED_SDC_EXCEPTIONS = SubLObjectFactory.makeSymbol("CACHED-SDC-EXCEPTIONS");
        $sym30$_CACHED_SDC_EXCEPTIONS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-SDC-EXCEPTIONS-CACHING-STATE*");
        $sym31$GATHER_DIRECT_SDC_EXCEPTIONS = SubLObjectFactory.makeSymbol("GATHER-DIRECT-SDC-EXCEPTIONS");
        $const32$siblingDisjointExceptions = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("siblingDisjointExceptions"));
        $const33$rewriteOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rewriteOf"));
        $sym34$GATHER_DIRECT_SDC_EXCEPTION = SubLObjectFactory.makeSymbol("GATHER-DIRECT-SDC-EXCEPTION");
        $kw35$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw36$ASSERTION = SubLObjectFactory.makeKeyword("ASSERTION");
        $kw37$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $const38$SiblingDisjointCollectionType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SiblingDisjointCollectionType"));
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC1"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC2"));
        $sym40$C1 = SubLObjectFactory.makeSymbol("C1");
        $sym41$C2 = SubLObjectFactory.makeSymbol("C2");
    }

    public static final class $sbhl_mark_sd_genls_isas$UnaryFunction extends UnaryFunction
    {
        public $sbhl_mark_sd_genls_isas$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SBHL-MARK-SD-GENLS-ISAS"));
        }

        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return sdc.sbhl_mark_sd_genls_isas(arg1);
        }
    }

    public static final class $sbhl_gather_sd_candidates$UnaryFunction extends UnaryFunction
    {
        public $sbhl_gather_sd_candidates$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SBHL-GATHER-SD-CANDIDATES"));
        }

        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return sdc.sbhl_gather_sd_candidates(arg1);
        }
    }

    public static final class $sbhl_determine_sd_and_store_candidates$UnaryFunction extends UnaryFunction
    {
        public $sbhl_determine_sd_and_store_candidates$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SBHL-DETERMINE-SD-AND-STORE-CANDIDATES"));
        }

        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return sdc.sbhl_determine_sd_and_store_candidates(arg1);
        }
    }

    public static final class $any_sdc_wrtP$BinaryFunction extends BinaryFunction
    {
        public $any_sdc_wrtP$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ANY-SDC-WRT?"));
        }

        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return sdc.any_sdc_wrtP(arg1, arg2, (SubLObject)UNPROVIDED);
        }
    }
}

/*

	Total time: 1120 ms

*/