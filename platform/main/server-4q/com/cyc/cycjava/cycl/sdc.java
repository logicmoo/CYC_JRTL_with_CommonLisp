/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.fort_types_interface.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SDC
 * source file: /cyc/top/cycl/sdc.lisp
 * created:     2019/07/03 17:37:27
 */
public final class sdc extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sdc();

 public static final String myName = "com.cyc.cycjava.cycl.sdc";


    // defparameter
    // Definitions
    /**
     * should sdc module support (expensive) rule (-> (and (sdcException x y) (genls
     * z y)) (sdcException x z))?
     */
    @LispMethod(comment = "should sdc module support (expensive) rule (-> (and (sdcException x y) (genls\r\nz y)) (sdcException x z))?\ndefparameter\nshould sdc module support (expensive) rule (-> (and (sdcException x y) (genls\nz y)) (sdcException x z))?")
    public static final SubLSymbol $sdc_exception_transfers_thru_specsP$ = makeSymbol("*SDC-EXCEPTION-TRANSFERS-THRU-SPECS?*");

    // defparameter
    /**
     * should sdc module support (expensive) rule (-> (and (genls z x) (genls z y))
     * (sdcException x y))
     */
    @LispMethod(comment = "should sdc module support (expensive) rule (-> (and (genls z x) (genls z y))\r\n(sdcException x y))\ndefparameter\nshould sdc module support (expensive) rule (-> (and (genls z x) (genls z y))\n(sdcException x y))")
    public static final SubLSymbol $sdc_common_spec_exceptionP$ = makeSymbol("*SDC-COMMON-SPEC-EXCEPTION?*");

    // defparameter
    // ignore sdc module while recomputing sbhl links?
    /**
     * ignore sdc module while recomputing sbhl links?
     */
    @LispMethod(comment = "ignore sdc module while recomputing sbhl links?\ndefparameter")
    public static final SubLSymbol $ignoring_sdcP$ = makeSymbol("*IGNORING-SDC?*");

    // defparameter
    // the genls of c1 during sd queries
    /**
     * the genls of c1 during sd queries
     */
    @LispMethod(comment = "the genls of c1 during sd queries\ndefparameter")
    private static final SubLSymbol $sd_c1_genls_space$ = makeSymbol("*SD-C1-GENLS-SPACE*");

    // defparameter
    // the genls of c2 during sd quries
    /**
     * the genls of c2 during sd quries
     */
    @LispMethod(comment = "the genls of c2 during sd quries\ndefparameter")
    private static final SubLSymbol $sd_c2_genls_space$ = makeSymbol("*SD-C2-GENLS-SPACE*");

    // defparameter
    // the c2 genl currently considered during sbhl-gather-sd-candidates search
    /**
     * the c2 genl currently considered during sbhl-gather-sd-candidates search
     */
    @LispMethod(comment = "the c2 genl currently considered during sbhl-gather-sd-candidates search\ndefparameter")
    private static final SubLSymbol $sd_c2_genl$ = makeSymbol("*SD-C2-GENL*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cached_sbhl_sd_relevant_c2_genl_isa_candidateP_caching_state$ = makeSymbol("*CACHED-SBHL-SD-RELEVANT-C2-GENL-ISA-CANDIDATE?-CACHING-STATE*");

    // defparameter
    // goal during sbhl-sd-genls-and-genls-isa-path-p search
    /**
     * goal during sbhl-sd-genls-and-genls-isa-path-p search
     */
    @LispMethod(comment = "goal during sbhl-sd-genls-and-genls-isa-path-p search\ndefparameter")
    private static final SubLSymbol $sbhl_sd_genls_isas_goal$ = makeSymbol("*SBHL-SD-GENLS-ISAS-GOAL*");

    // defvar
    // current tracing level for sdw modules
    /**
     * current tracing level for sdw modules
     */
    @LispMethod(comment = "current tracing level for sdw modules\ndefvar")
    public static final SubLSymbol $sdw_trace_level$ = makeSymbol("*SDW-TRACE-LEVEL*");

    // defvar
    // current testing level for sdw modules
    /**
     * current testing level for sdw modules
     */
    @LispMethod(comment = "current testing level for sdw modules\ndefvar")
    public static final SubLSymbol $sdw_test_level$ = makeSymbol("*SDW-TEST-LEVEL*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol INSTANTIATE_SBHL_MARKING_SPACE_FOR = makeSymbol("INSTANTIATE-SBHL-MARKING-SPACE-FOR");

    static private final SubLSymbol $sym1$_SD_C1_GENLS_SPACE_ = makeSymbol("*SD-C1-GENLS-SPACE*");

    static private final SubLSymbol $sym2$_SD_C2_GENLS_SPACE_ = makeSymbol("*SD-C2-GENLS-SPACE*");

    public static final SubLSymbol $sd_genls_isas_space$ = makeSymbol("*SD-GENLS-ISAS-SPACE*");

    public static final SubLSymbol $sd_candidate_store$ = makeSymbol("*SD-CANDIDATE-STORE*");

    static private final SubLString $str7$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $$$continue_anyway = makeString("continue anyway");

    static private final SubLString $str12$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");



    private static final SubLSymbol $DO_HASH_TABLE = makeKeyword("DO-HASH-TABLE");

    private static final SubLSymbol SBHL_MARK_SD_GENLS_ISAS = makeSymbol("SBHL-MARK-SD-GENLS-ISAS");



    private static final SubLSymbol SBHL_GATHER_SD_CANDIDATES = makeSymbol("SBHL-GATHER-SD-CANDIDATES");

    private static final SubLSymbol SBHL_DETERMINE_SD_AND_STORE_CANDIDATES = makeSymbol("SBHL-DETERMINE-SD-AND-STORE-CANDIDATES");

    static private final SubLSymbol $sym19$CACHED_SBHL_SD_RELEVANT_C2_GENL_ISA_CANDIDATE_ = makeSymbol("CACHED-SBHL-SD-RELEVANT-C2-GENL-ISA-CANDIDATE?");

    static private final SubLSymbol $sym20$_CACHED_SBHL_SD_RELEVANT_C2_GENL_ISA_CANDIDATE__CACHING_STATE_ = makeSymbol("*CACHED-SBHL-SD-RELEVANT-C2-GENL-ISA-CANDIDATE?-CACHING-STATE*");

    private static final SubLSymbol SBHL_SD_GOAL_IN_GENLS_ISAS_P = makeSymbol("SBHL-SD-GOAL-IN-GENLS-ISAS-P");

    private static final SubLSymbol GATHER_SDCT_ISAS = makeSymbol("GATHER-SDCT-ISAS");

    private static final SubLSymbol $sym23$GATHER_IF_SDCT_ = makeSymbol("GATHER-IF-SDCT?");

    private static final SubLSymbol CACHED_ALL_ISA_SDCT = makeSymbol("CACHED-ALL-ISA-SDCT");

    private static final SubLSymbol RELEVANT_SIBLING_DISJOINT_COLLECTION_P = makeSymbol("RELEVANT-SIBLING-DISJOINT-COLLECTION-P");

    private static final SubLSymbol $cached_all_isa_sdct_caching_state$ = makeSymbol("*CACHED-ALL-ISA-SDCT-CACHING-STATE*");

    private static final SubLSymbol $sym28$SAFE_SDCT_ELEMENT_ = makeSymbol("SAFE-SDCT-ELEMENT?");

    private static final SubLSymbol CACHED_SDC_EXCEPTIONS = makeSymbol("CACHED-SDC-EXCEPTIONS");

    private static final SubLSymbol $cached_sdc_exceptions_caching_state$ = makeSymbol("*CACHED-SDC-EXCEPTIONS-CACHING-STATE*");

    private static final SubLSymbol GATHER_DIRECT_SDC_EXCEPTIONS = makeSymbol("GATHER-DIRECT-SDC-EXCEPTIONS");





    private static final SubLSymbol GATHER_DIRECT_SDC_EXCEPTION = makeSymbol("GATHER-DIRECT-SDC-EXCEPTION");



    static private final SubLList $list39 = list(makeSymbol("SPEC1"), makeSymbol("SPEC2"));

    private static final SubLSymbol C1 = makeSymbol("C1");

    private static final SubLSymbol C2 = makeSymbol("C2");

    public static SubLObject ignoring_sdcP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $ignoring_sdcP$.getDynamicValue(thread);
    }

    public static SubLObject relevant_sibling_disjoint_collection_p(final SubLObject col) {
        return NIL != within_assertP() ? fort_types_interface.disjoint_collection_p(col) : fort_types_interface.sibling_disjoint_collection_p(col);
    }

    public static final SubLObject with_sbhl_sd_marking_spaces_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sym1$_SD_C1_GENLS_SPACE_, list(INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sym2$_SD_C2_GENLS_SPACE_, list(INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sd_genls_isas_space$, listS(INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sd_candidate_store$, append(body, NIL)))));
        }
    }

    public static SubLObject with_sbhl_sd_marking_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sym1$_SD_C1_GENLS_SPACE_, list(INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sym2$_SD_C2_GENLS_SPACE_, list(INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sd_genls_isas_space$, listS(INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sd_candidate_store$, append(body, NIL)))));
    }

    public static final SubLObject with_sbhl_sd_genls_isas_spaces_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sym1$_SD_C1_GENLS_SPACE_, list(INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sym1$_SD_C1_GENLS_SPACE_, listS(INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sd_genls_isas_space$, append(body, NIL))));
        }
    }

    public static SubLObject with_sbhl_sd_genls_isas_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sym1$_SD_C1_GENLS_SPACE_, list(INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sym1$_SD_C1_GENLS_SPACE_, listS(INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sd_genls_isas_space$, append(body, NIL))));
    }

    public static final SubLObject any_isa_common_sdct_alt(SubLObject c1, SubLObject c2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject exceptionP = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject tv_var = tv;
                            {
                                SubLObject _prev_bind_0_1 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                SubLObject _prev_bind_1_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (NIL != tv_var) {
                                        if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                            if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                {
                                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                    if (pcase_var.eql($ERROR)) {
                                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt7$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } else {
                                                        if (pcase_var.eql($CERROR)) {
                                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt7$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } else {
                                                            if (pcase_var.eql($WARN)) {
                                                                Errors.warn($str_alt7$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                            } else {
                                                                Errors.warn($str_alt12$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                Errors.cerror($$$continue_anyway, $str_alt7$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    {
                                        SubLObject _prev_bind_0_3 = $sd_c1_genls_space$.currentBinding(thread);
                                        try {
                                            $sd_c1_genls_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                            {
                                                SubLObject _prev_bind_0_4 = $sd_c2_genls_space$.currentBinding(thread);
                                                try {
                                                    $sd_c2_genls_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                    {
                                                        SubLObject _prev_bind_0_5 = $sd_genls_isas_space$.currentBinding(thread);
                                                        try {
                                                            $sd_genls_isas_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                            {
                                                                SubLObject _prev_bind_0_6 = $sd_candidate_store$.currentBinding(thread);
                                                                try {
                                                                    $sd_candidate_store$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                                    com.cyc.cycjava.cycl.sdc.sbhl_mark_sd_c1_genls_and_non_c2_genls_isas(c1, c2);
                                                                    {
                                                                        SubLObject _prev_bind_0_7 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1_8 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                        SubLObject _prev_bind_2_9 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                        SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                        SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                        SubLObject _prev_bind_5 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                                                                        SubLObject _prev_bind_6 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                            sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                                                                            sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                                                                            exceptionP = makeBoolean((NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(c1, $sd_c2_genls_space$.getDynamicValue(thread))) || (NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(c2, $sd_c1_genls_space$.getDynamicValue(thread))));
                                                                        } finally {
                                                                            sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_6, thread);
                                                                            sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_5, thread);
                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_9, thread);
                                                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_8, thread);
                                                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_7, thread);
                                                                        }
                                                                    }
                                                                    if (NIL == exceptionP) {
                                                                        if (NIL != $sdc_exception_transfers_thru_specsP$.getDynamicValue(thread)) {
                                                                            {
                                                                                SubLObject _prev_bind_0_10 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                                SubLObject _prev_bind_1_11 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                                SubLObject _prev_bind_2_12 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                                SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                SubLObject _prev_bind_5 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                                                                                SubLObject _prev_bind_6 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                                    sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                                                                                    sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                                                                                    if (NIL == exceptionP) {
                                                                                        {
                                                                                            SubLObject catch_var = NIL;
                                                                                            try {
                                                                                                {
                                                                                                    SubLObject cdohash_table = $sd_c2_genls_space$.getDynamicValue(thread);
                                                                                                    SubLObject c2_genl = NIL;
                                                                                                    SubLObject val = NIL;
                                                                                                    {
                                                                                                        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                                                                                                        try {
                                                                                                            while (iteratorHasNext(cdohash_iterator)) {
                                                                                                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                                                                                c2_genl = getEntryKey(cdohash_entry);
                                                                                                                val = getEntryValue(cdohash_entry);
                                                                                                                subl_macros.do_hash_table_done_check(exceptionP);
                                                                                                                {
                                                                                                                    SubLObject exceptions = com.cyc.cycjava.cycl.sdc.direct_sdc_exceptions(c2_genl, UNPROVIDED);
                                                                                                                    if (NIL == exceptionP) {
                                                                                                                        {
                                                                                                                            SubLObject csome_list_var = exceptions;
                                                                                                                            SubLObject exception = NIL;
                                                                                                                            for (exception = csome_list_var.first(); !((NIL != exceptionP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , exception = csome_list_var.first()) {
                                                                                                                                if (NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(exception, $sd_c1_genls_space$.getDynamicValue(thread))) {
                                                                                                                                    exceptionP = T;
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
                                                                                            } catch (Throwable ccatch_env_var) {
                                                                                                catch_var = Errors.handleThrowable(ccatch_env_var, $DO_HASH_TABLE);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_6, thread);
                                                                                    sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_5, thread);
                                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_12, thread);
                                                                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_11, thread);
                                                                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_10, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        if (NIL == exceptionP) {
                                                                            result = com.cyc.cycjava.cycl.sdc.sbhl_gather_first_sd_or_store_sd_candidates(c2);
                                                                            if (NIL == result) {
                                                                                result = com.cyc.cycjava.cycl.sdc.sbhl_determine_sd_path_with_no_exceptions(c1);
                                                                            }
                                                                        }
                                                                    }
                                                                    sbhl_marking_vars.free_sbhl_marking_space($sd_candidate_store$.getDynamicValue(thread));
                                                                } finally {
                                                                    $sd_candidate_store$.rebind(_prev_bind_0_6, thread);
                                                                }
                                                            }
                                                            sbhl_marking_vars.free_sbhl_marking_space($sd_genls_isas_space$.getDynamicValue(thread));
                                                        } finally {
                                                            $sd_genls_isas_space$.rebind(_prev_bind_0_5, thread);
                                                        }
                                                    }
                                                    sbhl_marking_vars.free_sbhl_marking_space($sd_c2_genls_space$.getDynamicValue(thread));
                                                } finally {
                                                    $sd_c2_genls_space$.rebind(_prev_bind_0_4, thread);
                                                }
                                            }
                                            sbhl_marking_vars.free_sbhl_marking_space($sd_c1_genls_space$.getDynamicValue(thread));
                                        } finally {
                                            $sd_c1_genls_space$.rebind(_prev_bind_0_3, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_2, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject any_isa_common_sdct(final SubLObject c1, final SubLObject c2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject exceptionP = NIL;
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
                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                    if (pcase_var.eql($ERROR)) {
                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str7$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else
                        if (pcase_var.eql($CERROR)) {
                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str7$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($WARN)) {
                                Errors.warn($str7$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                            } else {
                                Errors.warn($str12$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror($$$continue_anyway, $str7$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                            }


                }
                final SubLObject _prev_bind_0_$2 = $sd_c1_genls_space$.currentBinding(thread);
                try {
                    $sd_c1_genls_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject _prev_bind_0_$3 = $sd_c2_genls_space$.currentBinding(thread);
                        try {
                            $sd_c2_genls_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject _prev_bind_0_$4 = $sd_genls_isas_space$.currentBinding(thread);
                                try {
                                    $sd_genls_isas_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    try {
                                        final SubLObject _prev_bind_0_$5 = $sd_candidate_store$.currentBinding(thread);
                                        try {
                                            $sd_candidate_store$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
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
                                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                    sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                                                    sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                                                    exceptionP = makeBoolean((NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(c1, $sd_c2_genls_space$.getDynamicValue(thread))) || (NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(c2, $sd_c1_genls_space$.getDynamicValue(thread))));
                                                } finally {
                                                    sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_7, thread);
                                                    sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_6, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$9, thread);
                                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$3, thread);
                                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$6, thread);
                                                }
                                                if (NIL == exceptionP) {
                                                    if (NIL != $sdc_exception_transfers_thru_specsP$.getDynamicValue(thread)) {
                                                        final SubLObject _prev_bind_0_$7 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$4 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                        final SubLObject _prev_bind_2_$10 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                        _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        _prev_bind_6 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                                                        _prev_bind_7 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                                                        try {
                                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                            sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                                                            sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                                                            if (NIL == exceptionP) {
                                                                SubLObject catch_var = NIL;
                                                                try {
                                                                    thread.throwStack.push($DO_HASH_TABLE);
                                                                    final SubLObject cdohash_table = $sd_c2_genls_space$.getDynamicValue(thread);
                                                                    SubLObject c2_genl = NIL;
                                                                    SubLObject val = NIL;
                                                                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                                                                    try {
                                                                        while (iteratorHasNext(cdohash_iterator)) {
                                                                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                                            c2_genl = getEntryKey(cdohash_entry);
                                                                            val = getEntryValue(cdohash_entry);
                                                                            subl_macros.do_hash_table_done_check(exceptionP);
                                                                            final SubLObject exceptions = direct_sdc_exceptions(c2_genl, UNPROVIDED);
                                                                            if (NIL == exceptionP) {
                                                                                SubLObject csome_list_var = exceptions;
                                                                                SubLObject exception = NIL;
                                                                                exception = csome_list_var.first();
                                                                                while ((NIL == exceptionP) && (NIL != csome_list_var)) {
                                                                                    if (NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(exception, $sd_c1_genls_space$.getDynamicValue(thread))) {
                                                                                        exceptionP = T;
                                                                                    }
                                                                                    csome_list_var = csome_list_var.rest();
                                                                                    exception = csome_list_var.first();
                                                                                } 
                                                                            }
                                                                        } 
                                                                    } finally {
                                                                        releaseEntrySetIterator(cdohash_iterator);
                                                                    }
                                                                } catch (final Throwable ccatch_env_var) {
                                                                    catch_var = Errors.handleThrowable(ccatch_env_var, $DO_HASH_TABLE);
                                                                } finally {
                                                                    thread.throwStack.pop();
                                                                }
                                                            }
                                                        } finally {
                                                            sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_7, thread);
                                                            sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_6, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$10, thread);
                                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$4, thread);
                                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$7, thread);
                                                        }
                                                    }
                                                    if (NIL == exceptionP) {
                                                        result = sbhl_gather_first_sd_or_store_sd_candidates(c2);
                                                        if (NIL == result) {
                                                            result = sbhl_determine_sd_path_with_no_exceptions(c1);
                                                        }
                                                    }
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values = getValuesAsVector();
                                                    sbhl_marking_vars.free_sbhl_marking_space($sd_candidate_store$.getDynamicValue(thread));
                                                    restoreValuesFromVector(_values);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                                                }
                                            }
                                        } finally {
                                            $sd_candidate_store$.rebind(_prev_bind_0_$5, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values2 = getValuesAsVector();
                                            sbhl_marking_vars.free_sbhl_marking_space($sd_genls_isas_space$.getDynamicValue(thread));
                                            restoreValuesFromVector(_values2);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                                        }
                                    }
                                } finally {
                                    $sd_genls_isas_space$.rebind(_prev_bind_0_$4, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values3 = getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space($sd_c2_genls_space$.getDynamicValue(thread));
                                    restoreValuesFromVector(_values3);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                                }
                            }
                        } finally {
                            $sd_c2_genls_space$.rebind(_prev_bind_0_$3, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values4 = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space($sd_c1_genls_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values4);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                        }
                    }
                } finally {
                    $sd_c1_genls_space$.rebind(_prev_bind_0_$2, thread);
                }
            } finally {
                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$2, thread);
                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$1, thread);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject any_isa_common_sdct_among_alt(SubLObject c1s, SubLObject c2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject result2 = NIL;
                SubLObject exceptionP = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject tv_var = tv;
                            {
                                SubLObject _prev_bind_0_13 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                SubLObject _prev_bind_1_14 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (NIL != tv_var) {
                                        if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                            if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                {
                                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                    if (pcase_var.eql($ERROR)) {
                                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt7$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } else {
                                                        if (pcase_var.eql($CERROR)) {
                                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt7$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } else {
                                                            if (pcase_var.eql($WARN)) {
                                                                Errors.warn($str_alt7$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                            } else {
                                                                Errors.warn($str_alt12$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                Errors.cerror($$$continue_anyway, $str_alt7$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    {
                                        SubLObject _prev_bind_0_15 = $sd_c1_genls_space$.currentBinding(thread);
                                        try {
                                            $sd_c1_genls_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                            {
                                                SubLObject _prev_bind_0_16 = $sd_c2_genls_space$.currentBinding(thread);
                                                try {
                                                    $sd_c2_genls_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                    {
                                                        SubLObject _prev_bind_0_17 = $sd_genls_isas_space$.currentBinding(thread);
                                                        try {
                                                            $sd_genls_isas_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                            {
                                                                SubLObject _prev_bind_0_18 = $sd_candidate_store$.currentBinding(thread);
                                                                try {
                                                                    $sd_candidate_store$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                                    c1s = com.cyc.cycjava.cycl.sdc.sbhl_mark_sd_c1s_genls_and_non_c2_genls_isas(c1s, c2);
                                                                    if (NIL == c1s) {
                                                                        exceptionP = T;
                                                                    }
                                                                    if (NIL == exceptionP) {
                                                                        if (NIL != $sdc_exception_transfers_thru_specsP$.getDynamicValue(thread)) {
                                                                            {
                                                                                SubLObject _prev_bind_0_19 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                                SubLObject _prev_bind_1_20 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                                SubLObject _prev_bind_2_21 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                                SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                SubLObject _prev_bind_5 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                                                                                SubLObject _prev_bind_6 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                                    sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                                                                                    sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                                                                                    if (NIL == exceptionP) {
                                                                                        {
                                                                                            SubLObject catch_var = NIL;
                                                                                            try {
                                                                                                {
                                                                                                    SubLObject cdohash_table = $sd_c2_genls_space$.getDynamicValue(thread);
                                                                                                    SubLObject c2_genl = NIL;
                                                                                                    SubLObject val = NIL;
                                                                                                    {
                                                                                                        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                                                                                                        try {
                                                                                                            while (iteratorHasNext(cdohash_iterator)) {
                                                                                                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                                                                                c2_genl = getEntryKey(cdohash_entry);
                                                                                                                val = getEntryValue(cdohash_entry);
                                                                                                                subl_macros.do_hash_table_done_check(exceptionP);
                                                                                                                {
                                                                                                                    SubLObject exceptions = com.cyc.cycjava.cycl.sdc.direct_sdc_exceptions(c2_genl, UNPROVIDED);
                                                                                                                    if (NIL == exceptionP) {
                                                                                                                        {
                                                                                                                            SubLObject csome_list_var = exceptions;
                                                                                                                            SubLObject exception = NIL;
                                                                                                                            for (exception = csome_list_var.first(); !((NIL != exceptionP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , exception = csome_list_var.first()) {
                                                                                                                                if (NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(exception, $sd_c1_genls_space$.getDynamicValue(thread))) {
                                                                                                                                    exceptionP = T;
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
                                                                                            } catch (Throwable ccatch_env_var) {
                                                                                                catch_var = Errors.handleThrowable(ccatch_env_var, $DO_HASH_TABLE);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_6, thread);
                                                                                    sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_5, thread);
                                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_21, thread);
                                                                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_20, thread);
                                                                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_19, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        if (NIL == exceptionP) {
                                                                            result = com.cyc.cycjava.cycl.sdc.sbhl_gather_first_sd_or_store_sd_candidates(c2);
                                                                            if (NIL != result) {
                                                                            } else {
                                                                                thread.resetMultipleValues();
                                                                                {
                                                                                    SubLObject result_22 = com.cyc.cycjava.cycl.sdc.sbhl_determine_sd_path_with_no_exceptions_among(c1s);
                                                                                    SubLObject result2_23 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    result = result_22;
                                                                                    result2 = result2_23;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    sbhl_marking_vars.free_sbhl_marking_space($sd_candidate_store$.getDynamicValue(thread));
                                                                } finally {
                                                                    $sd_candidate_store$.rebind(_prev_bind_0_18, thread);
                                                                }
                                                            }
                                                            sbhl_marking_vars.free_sbhl_marking_space($sd_genls_isas_space$.getDynamicValue(thread));
                                                        } finally {
                                                            $sd_genls_isas_space$.rebind(_prev_bind_0_17, thread);
                                                        }
                                                    }
                                                    sbhl_marking_vars.free_sbhl_marking_space($sd_c2_genls_space$.getDynamicValue(thread));
                                                } finally {
                                                    $sd_c2_genls_space$.rebind(_prev_bind_0_16, thread);
                                                }
                                            }
                                            sbhl_marking_vars.free_sbhl_marking_space($sd_c1_genls_space$.getDynamicValue(thread));
                                        } finally {
                                            $sd_c1_genls_space$.rebind(_prev_bind_0_15, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_14, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_13, thread);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(result, result2);
            }
        }
    }

    public static SubLObject any_isa_common_sdct_among(SubLObject c1s, final SubLObject c2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject result2 = NIL;
        SubLObject exceptionP = NIL;
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
                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                    if (pcase_var.eql($ERROR)) {
                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str7$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else
                        if (pcase_var.eql($CERROR)) {
                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str7$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($WARN)) {
                                Errors.warn($str7$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                            } else {
                                Errors.warn($str12$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror($$$continue_anyway, $str7$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                            }


                }
                final SubLObject _prev_bind_0_$18 = $sd_c1_genls_space$.currentBinding(thread);
                try {
                    $sd_c1_genls_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject _prev_bind_0_$19 = $sd_c2_genls_space$.currentBinding(thread);
                        try {
                            $sd_c2_genls_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject _prev_bind_0_$20 = $sd_genls_isas_space$.currentBinding(thread);
                                try {
                                    $sd_genls_isas_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    try {
                                        final SubLObject _prev_bind_0_$21 = $sd_candidate_store$.currentBinding(thread);
                                        try {
                                            $sd_candidate_store$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                            try {
                                                c1s = sbhl_mark_sd_c1s_genls_and_non_c2_genls_isas(c1s, c2);
                                                if (NIL == c1s) {
                                                    exceptionP = T;
                                                }
                                                if (NIL == exceptionP) {
                                                    if (NIL != $sdc_exception_transfers_thru_specsP$.getDynamicValue(thread)) {
                                                        final SubLObject _prev_bind_0_$22 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$19 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                        final SubLObject _prev_bind_2_$25 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_6 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                                                        final SubLObject _prev_bind_7 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                                                        try {
                                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                            sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                                                            sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                                                            if (NIL == exceptionP) {
                                                                SubLObject catch_var = NIL;
                                                                try {
                                                                    thread.throwStack.push($DO_HASH_TABLE);
                                                                    final SubLObject cdohash_table = $sd_c2_genls_space$.getDynamicValue(thread);
                                                                    SubLObject c2_genl = NIL;
                                                                    SubLObject val = NIL;
                                                                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                                                                    try {
                                                                        while (iteratorHasNext(cdohash_iterator)) {
                                                                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                                            c2_genl = getEntryKey(cdohash_entry);
                                                                            val = getEntryValue(cdohash_entry);
                                                                            subl_macros.do_hash_table_done_check(exceptionP);
                                                                            final SubLObject exceptions = direct_sdc_exceptions(c2_genl, UNPROVIDED);
                                                                            if (NIL == exceptionP) {
                                                                                SubLObject csome_list_var = exceptions;
                                                                                SubLObject exception = NIL;
                                                                                exception = csome_list_var.first();
                                                                                while ((NIL == exceptionP) && (NIL != csome_list_var)) {
                                                                                    if (NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(exception, $sd_c1_genls_space$.getDynamicValue(thread))) {
                                                                                        exceptionP = T;
                                                                                    }
                                                                                    csome_list_var = csome_list_var.rest();
                                                                                    exception = csome_list_var.first();
                                                                                } 
                                                                            }
                                                                        } 
                                                                    } finally {
                                                                        releaseEntrySetIterator(cdohash_iterator);
                                                                    }
                                                                } catch (final Throwable ccatch_env_var) {
                                                                    catch_var = Errors.handleThrowable(ccatch_env_var, $DO_HASH_TABLE);
                                                                } finally {
                                                                    thread.throwStack.pop();
                                                                }
                                                            }
                                                        } finally {
                                                            sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_7, thread);
                                                            sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_6, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$25, thread);
                                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$19, thread);
                                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$22, thread);
                                                        }
                                                    }
                                                    if (NIL == exceptionP) {
                                                        result = sbhl_gather_first_sd_or_store_sd_candidates(c2);
                                                        if (NIL == result) {
                                                            thread.resetMultipleValues();
                                                            final SubLObject result_$26 = sbhl_determine_sd_path_with_no_exceptions_among(c1s);
                                                            final SubLObject result2_$27 = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            result = result_$26;
                                                            result2 = result2_$27;
                                                        }
                                                    }
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$23 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values = getValuesAsVector();
                                                    sbhl_marking_vars.free_sbhl_marking_space($sd_candidate_store$.getDynamicValue(thread));
                                                    restoreValuesFromVector(_values);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                                                }
                                            }
                                        } finally {
                                            $sd_candidate_store$.rebind(_prev_bind_0_$21, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values2 = getValuesAsVector();
                                            sbhl_marking_vars.free_sbhl_marking_space($sd_genls_isas_space$.getDynamicValue(thread));
                                            restoreValuesFromVector(_values2);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                                        }
                                    }
                                } finally {
                                    $sd_genls_isas_space$.rebind(_prev_bind_0_$20, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$25 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values3 = getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space($sd_c2_genls_space$.getDynamicValue(thread));
                                    restoreValuesFromVector(_values3);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                                }
                            }
                        } finally {
                            $sd_c2_genls_space$.rebind(_prev_bind_0_$19, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values4 = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space($sd_c1_genls_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values4);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                        }
                    }
                } finally {
                    $sd_c1_genls_space$.rebind(_prev_bind_0_$18, thread);
                }
            } finally {
                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$18, thread);
                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$17, thread);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return values(result, result2);
    }

    /**
     * in *sd-c1-genls-space* mark the genls of C1
     * in *sd-genls-isas-space* mark the isas of those C1 genls that is not also C2 genls
     */
    @LispMethod(comment = "in *sd-c1-genls-space* mark the genls of C1\r\nin *sd-genls-isas-space* mark the isas of those C1 genls that is not also C2 genls\nin *sd-c1-genls-space* mark the genls of C1\nin *sd-genls-isas-space* mark the isas of those C1 genls that is not also C2 genls")
    public static final SubLObject sbhl_mark_sd_c1_genls_and_non_c2_genls_isas_alt(SubLObject c1, SubLObject c2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sbhl_marking_methods.sbhl_mark_forward_true_nodes_in_space(sbhl_module_vars.get_sbhl_module($$genls), c2, $sd_c2_genls_space$.getDynamicValue(thread), UNPROVIDED);
            {
                SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    sbhl_search_methods.sbhl_map_and_mark_forward_true_nodes_in_space(sbhl_module_vars.get_sbhl_module($$genls), c1, SBHL_MARK_SD_GENLS_ISAS, $sd_c1_genls_space$.getDynamicValue(thread), UNPROVIDED);
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                } finally {
                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    /**
     * in *sd-c1-genls-space* mark the genls of C1
     * in *sd-genls-isas-space* mark the isas of those C1 genls that is not also C2 genls
     */
    @LispMethod(comment = "in *sd-c1-genls-space* mark the genls of C1\r\nin *sd-genls-isas-space* mark the isas of those C1 genls that is not also C2 genls\nin *sd-c1-genls-space* mark the genls of C1\nin *sd-genls-isas-space* mark the isas of those C1 genls that is not also C2 genls")
    public static SubLObject sbhl_mark_sd_c1_genls_and_non_c2_genls_isas(final SubLObject c1, final SubLObject c2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_marking_methods.sbhl_mark_forward_true_nodes_in_space(sbhl_module_vars.get_sbhl_module($$genls), c2, $sd_c2_genls_space$.getDynamicValue(thread), UNPROVIDED);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                sbhl_search_methods.sbhl_map_and_mark_forward_true_nodes_in_space(sbhl_module_vars.get_sbhl_module($$genls), c1, SBHL_MARK_SD_GENLS_ISAS, $sd_c1_genls_space$.getDynamicValue(thread), UNPROVIDED);
            } finally {
                final SubLObject _prev_bind_0_$32 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     * in *sd-c1-genls-space* mark the genls of C1S
     * in *sd-genls-isas-space* mark the isas of those C1S genls that is not also C2 genls
     *
     * @return a list of the c1s used to mark the space.
     */
    @LispMethod(comment = "in *sd-c1-genls-space* mark the genls of C1S\r\nin *sd-genls-isas-space* mark the isas of those C1S genls that is not also C2 genls\r\n\r\n@return a list of the c1s used to mark the space.\nin *sd-c1-genls-space* mark the genls of C1S\nin *sd-genls-isas-space* mark the isas of those C1S genls that is not also C2 genls")
    public static final SubLObject sbhl_mark_sd_c1s_genls_and_non_c2_genls_isas_alt(SubLObject c1s, SubLObject c2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sbhl_marking_methods.sbhl_mark_forward_true_nodes_in_space(sbhl_module_vars.get_sbhl_module($$genls), c2, $sd_c2_genls_space$.getDynamicValue(thread), UNPROVIDED);
            {
                SubLObject new_c1s = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    SubLObject _prev_bind_5 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                    SubLObject _prev_bind_6 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                    SubLObject _prev_bind_7 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                        sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                        sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                        sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        {
                            SubLObject cdolist_list_var = c1s;
                            SubLObject c1 = NIL;
                            for (c1 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , c1 = cdolist_list_var.first()) {
                                if (!((NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(c1, $sd_c2_genls_space$.getDynamicValue(thread))) || (NIL != genls.genlP(c1, c2, UNPROVIDED, UNPROVIDED)))) {
                                    sbhl_search_methods.sbhl_map_and_mark_forward_true_nodes_in_space(sbhl_module_vars.get_sbhl_module($$genls), c1, SBHL_MARK_SD_GENLS_ISAS, $sd_c1_genls_space$.getDynamicValue(thread), UNPROVIDED);
                                    new_c1s = cons(c1, new_c1s);
                                }
                            }
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_7, thread);
                        sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_6, thread);
                        sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_5, thread);
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
                    }
                }
                return new_c1s;
            }
        }
    }

    /**
     * in *sd-c1-genls-space* mark the genls of C1S
     * in *sd-genls-isas-space* mark the isas of those C1S genls that is not also C2 genls
     *
     * @return a list of the c1s used to mark the space.
     */
    @LispMethod(comment = "in *sd-c1-genls-space* mark the genls of C1S\r\nin *sd-genls-isas-space* mark the isas of those C1S genls that is not also C2 genls\r\n\r\n@return a list of the c1s used to mark the space.\nin *sd-c1-genls-space* mark the genls of C1S\nin *sd-genls-isas-space* mark the isas of those C1S genls that is not also C2 genls")
    public static SubLObject sbhl_mark_sd_c1s_genls_and_non_c2_genls_isas(final SubLObject c1s, final SubLObject c2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_marking_methods.sbhl_mark_forward_true_nodes_in_space(sbhl_module_vars.get_sbhl_module($$genls), c2, $sd_c2_genls_space$.getDynamicValue(thread), UNPROVIDED);
        SubLObject new_c1s = NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_6 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
        final SubLObject _prev_bind_7 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
        final SubLObject _prev_bind_8 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
            sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
            sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                SubLObject cdolist_list_var = c1s;
                SubLObject c3 = NIL;
                c3 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(c3, $sd_c2_genls_space$.getDynamicValue(thread))) && (NIL == genls.genlP(c3, c2, UNPROVIDED, UNPROVIDED))) {
                        sbhl_search_methods.sbhl_map_and_mark_forward_true_nodes_in_space(sbhl_module_vars.get_sbhl_module($$genls), c3, SBHL_MARK_SD_GENLS_ISAS, $sd_c1_genls_space$.getDynamicValue(thread), UNPROVIDED);
                        new_c1s = cons(c3, new_c1s);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    c3 = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$33 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                }
            }
        } finally {
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

    /**
     * marks the all-isas of C1-GENL in *sd-genls-isas-space* (unless its also a genl of c2)
     */
    @LispMethod(comment = "marks the all-isas of C1-GENL in *sd-genls-isas-space* (unless its also a genl of c2)")
    public static final SubLObject sbhl_mark_sd_genls_isas_alt(SubLObject c1_genl) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(c1_genl, $sd_c2_genls_space$.getDynamicValue(thread))) {
                sbhl_marking_methods.sbhl_mark_forward_true_nodes_in_space(sbhl_module_vars.get_sbhl_module($$isa), c1_genl, $sd_genls_isas_space$.getDynamicValue(thread), UNPROVIDED);
            }
            return NIL;
        }
    }

    /**
     * marks the all-isas of C1-GENL in *sd-genls-isas-space* (unless its also a genl of c2)
     */
    @LispMethod(comment = "marks the all-isas of C1-GENL in *sd-genls-isas-space* (unless its also a genl of c2)")
    public static SubLObject sbhl_mark_sd_genls_isas(final SubLObject c1_genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(c1_genl, $sd_c2_genls_space$.getDynamicValue(thread))) {
            sbhl_marking_methods.sbhl_mark_forward_true_nodes_in_space(sbhl_module_vars.get_sbhl_module($$isa), c1_genl, $sd_genls_isas_space$.getDynamicValue(thread), UNPROVIDED);
        }
        return NIL;
    }

    /**
     * returns the first node, GOAL, from the isas of the genls of C2
     * s.t. (genls C2 C2-GENL) and (isa C2-GENL GOAL) and (isa GOAL SiblingDisjointCollectionType)
     * s.t. C2-GENL is not in *sd-c1-genls-space* and GOAL is in *sd-genls-isas-space* and
     * s.t. there are not sdw-exceptions relevant to GOAL defined as follows:
     * if there are any X in *sd-c1-genls-space* s.t. (siblingDisjointExceptions C2-GENL X),
     * we store these relevant exceptions as values keyed on GOAL instead of returning GOAL.
     */
    @LispMethod(comment = "returns the first node, GOAL, from the isas of the genls of C2\r\ns.t. (genls C2 C2-GENL) and (isa C2-GENL GOAL) and (isa GOAL SiblingDisjointCollectionType)\r\ns.t. C2-GENL is not in *sd-c1-genls-space* and GOAL is in *sd-genls-isas-space* and\r\ns.t. there are not sdw-exceptions relevant to GOAL defined as follows:\r\nif there are any X in *sd-c1-genls-space* s.t. (siblingDisjointExceptions C2-GENL X),\r\nwe store these relevant exceptions as values keyed on GOAL instead of returning GOAL.\nreturns the first node, GOAL, from the isas of the genls of C2\ns.t. (genls C2 C2-GENL) and (isa C2-GENL GOAL) and (isa GOAL SiblingDisjointCollectionType)\ns.t. C2-GENL is not in *sd-c1-genls-space* and GOAL is in *sd-genls-isas-space* and\ns.t. there are not sdw-exceptions relevant to GOAL defined as follows:\nif there are any X in *sd-c1-genls-space* s.t. (siblingDisjointExceptions C2-GENL X),\nwe store these relevant exceptions as values keyed on GOAL instead of returning GOAL.")
    public static final SubLObject sbhl_gather_first_sd_or_store_sd_candidates_alt(SubLObject c2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject relevant_exceptions = NIL;
                {
                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.sdc.sdc_exceptions(c2, UNPROVIDED);
                    SubLObject exception = NIL;
                    for (exception = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , exception = cdolist_list_var.first()) {
                        if (NIL != sbhl_marking_utilities.sbhl_marked_node_p(exception, $sd_c1_genls_space$.getDynamicValue(thread))) {
                            relevant_exceptions = cons(exception, relevant_exceptions);
                        }
                    }
                }
                result = sbhl_search_methods.sbhl_gather_first_among_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), c2, SBHL_GATHER_SD_CANDIDATES, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != relevant_exceptions) {
                    if (NIL != hash_table_utilities.hash_table_empty_p($sd_candidate_store$.getDynamicValue(thread))) {
                        hash_table_utilities.push_hash(result, relevant_exceptions, $sd_candidate_store$.getDynamicValue(thread));
                    } else {
                        {
                            SubLObject cdohash_table = $sd_candidate_store$.getDynamicValue(thread);
                            SubLObject c2_genl_isa = NIL;
                            SubLObject exception_lists = NIL;
                            {
                                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                                try {
                                    while (iteratorHasNext(cdohash_iterator)) {
                                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                        c2_genl_isa = getEntryKey(cdohash_entry);
                                        exception_lists = getEntryValue(cdohash_entry);
                                        {
                                            SubLObject new_exceptions = NIL;
                                            SubLObject cdolist_list_var = exception_lists;
                                            SubLObject exceptions = NIL;
                                            for (exceptions = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , exceptions = cdolist_list_var.first()) {
                                                new_exceptions = cons(nunion(exceptions, relevant_exceptions, UNPROVIDED, UNPROVIDED), new_exceptions);
                                            }
                                            sethash(c2_genl_isa, $sd_candidate_store$.getDynamicValue(thread), new_exceptions);
                                        }
                                    } 
                                } finally {
                                    releaseEntrySetIterator(cdohash_iterator);
                                }
                            }
                        }
                    }
                    return NIL;
                }
                return result;
            }
        }
    }

    /**
     * returns the first node, GOAL, from the isas of the genls of C2
     * s.t. (genls C2 C2-GENL) and (isa C2-GENL GOAL) and (isa GOAL SiblingDisjointCollectionType)
     * s.t. C2-GENL is not in *sd-c1-genls-space* and GOAL is in *sd-genls-isas-space* and
     * s.t. there are not sdw-exceptions relevant to GOAL defined as follows:
     * if there are any X in *sd-c1-genls-space* s.t. (siblingDisjointExceptions C2-GENL X),
     * we store these relevant exceptions as values keyed on GOAL instead of returning GOAL.
     */
    @LispMethod(comment = "returns the first node, GOAL, from the isas of the genls of C2\r\ns.t. (genls C2 C2-GENL) and (isa C2-GENL GOAL) and (isa GOAL SiblingDisjointCollectionType)\r\ns.t. C2-GENL is not in *sd-c1-genls-space* and GOAL is in *sd-genls-isas-space* and\r\ns.t. there are not sdw-exceptions relevant to GOAL defined as follows:\r\nif there are any X in *sd-c1-genls-space* s.t. (siblingDisjointExceptions C2-GENL X),\r\nwe store these relevant exceptions as values keyed on GOAL instead of returning GOAL.\nreturns the first node, GOAL, from the isas of the genls of C2\ns.t. (genls C2 C2-GENL) and (isa C2-GENL GOAL) and (isa GOAL SiblingDisjointCollectionType)\ns.t. C2-GENL is not in *sd-c1-genls-space* and GOAL is in *sd-genls-isas-space* and\ns.t. there are not sdw-exceptions relevant to GOAL defined as follows:\nif there are any X in *sd-c1-genls-space* s.t. (siblingDisjointExceptions C2-GENL X),\nwe store these relevant exceptions as values keyed on GOAL instead of returning GOAL.")
    public static SubLObject sbhl_gather_first_sd_or_store_sd_candidates(final SubLObject c2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject relevant_exceptions = NIL;
        SubLObject cdolist_list_var = sdc_exceptions(c2, UNPROVIDED);
        SubLObject exception = NIL;
        exception = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != sbhl_marking_utilities.sbhl_marked_node_p(exception, $sd_c1_genls_space$.getDynamicValue(thread))) {
                relevant_exceptions = cons(exception, relevant_exceptions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            exception = cdolist_list_var.first();
        } 
        result = sbhl_search_methods.sbhl_gather_first_among_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), c2, SBHL_GATHER_SD_CANDIDATES, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != relevant_exceptions) {
            if (NIL != hash_table_utilities.hash_table_empty_p($sd_candidate_store$.getDynamicValue(thread))) {
                hash_table_utilities.push_hash(result, relevant_exceptions, $sd_candidate_store$.getDynamicValue(thread));
            } else {
                final SubLObject cdohash_table = $sd_candidate_store$.getDynamicValue(thread);
                SubLObject c2_genl_isa = NIL;
                SubLObject exception_lists = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        c2_genl_isa = getEntryKey(cdohash_entry);
                        exception_lists = getEntryValue(cdohash_entry);
                        SubLObject new_exceptions = NIL;
                        SubLObject cdolist_list_var2 = exception_lists;
                        SubLObject exceptions = NIL;
                        exceptions = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            new_exceptions = cons(nunion(exceptions, relevant_exceptions, UNPROVIDED, UNPROVIDED), new_exceptions);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            exceptions = cdolist_list_var2.first();
                        } 
                        sethash(c2_genl_isa, $sd_candidate_store$.getDynamicValue(thread), new_exceptions);
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
            return NIL;
        }
        return result;
    }

    /**
     * Implements first part of @see sbhl-gather-first-sd-or-store-sd-candidates.
     * Gathers first sufficient isa of C2-GENL, or passes along information sufficient
     * to determine relevant exceptions for candidate SD nodes.
     */
    @LispMethod(comment = "Implements first part of @see sbhl-gather-first-sd-or-store-sd-candidates.\r\nGathers first sufficient isa of C2-GENL, or passes along information sufficient\r\nto determine relevant exceptions for candidate SD nodes.\nImplements first part of @see sbhl-gather-first-sd-or-store-sd-candidates.\nGathers first sufficient isa of C2-GENL, or passes along information sufficient\nto determine relevant exceptions for candidate SD nodes.")
    public static final SubLObject sbhl_gather_sd_candidates_alt(SubLObject c2_genl) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(c2_genl, $sd_c1_genls_space$.getDynamicValue(thread))) {
                    {
                        SubLObject _prev_bind_0 = $sd_c2_genl$.currentBinding(thread);
                        try {
                            $sd_c2_genl$.bind(c2_genl, thread);
                            result = sbhl_search_methods.sbhl_gather_first_among_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$isa), c2_genl, SBHL_DETERMINE_SD_AND_STORE_CANDIDATES, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } finally {
                            $sd_c2_genl$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return result;
                }
            }
            return NIL;
        }
    }

    /**
     * Implements first part of @see sbhl-gather-first-sd-or-store-sd-candidates.
     * Gathers first sufficient isa of C2-GENL, or passes along information sufficient
     * to determine relevant exceptions for candidate SD nodes.
     */
    @LispMethod(comment = "Implements first part of @see sbhl-gather-first-sd-or-store-sd-candidates.\r\nGathers first sufficient isa of C2-GENL, or passes along information sufficient\r\nto determine relevant exceptions for candidate SD nodes.\nImplements first part of @see sbhl-gather-first-sd-or-store-sd-candidates.\nGathers first sufficient isa of C2-GENL, or passes along information sufficient\nto determine relevant exceptions for candidate SD nodes.")
    public static SubLObject sbhl_gather_sd_candidates(final SubLObject c2_genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(c2_genl, $sd_c1_genls_space$.getDynamicValue(thread))) {
            final SubLObject _prev_bind_0 = $sd_c2_genl$.currentBinding(thread);
            try {
                $sd_c2_genl$.bind(c2_genl, thread);
                result = sbhl_search_methods.sbhl_gather_first_among_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$isa), c2_genl, SBHL_DETERMINE_SD_AND_STORE_CANDIDATES, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } finally {
                $sd_c2_genl$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        return NIL;
    }/**
     * Implements first part of @see sbhl-gather-first-sd-or-store-sd-candidates.
     * Gathers first sufficient isa of C2-GENL, or passes along information sufficient
     * to determine relevant exceptions for candidate SD nodes.
     */


    /**
     * Implements second part of @see sbhl-gather-first-sd-or-store-sd-candidates.
     * Determines sufficiency of C2-GENL-ISA, returns it if is in *sd-genls-isas-space*,
     * isa #$SiblingDisjointCollectionType, and has no relevant exceptions.
     * If C2-GENL-ISA only fails due to exceptions, saves C2-GENL-ISA as candidate along
     * with relevant exceptions: saves this information as key, (list of values) in *sd-candidate-store*.
     */
    @LispMethod(comment = "Implements second part of @see sbhl-gather-first-sd-or-store-sd-candidates.\r\nDetermines sufficiency of C2-GENL-ISA, returns it if is in *sd-genls-isas-space*,\r\nisa #$SiblingDisjointCollectionType, and has no relevant exceptions.\r\nIf C2-GENL-ISA only fails due to exceptions, saves C2-GENL-ISA as candidate along\r\nwith relevant exceptions: saves this information as key, (list of values) in *sd-candidate-store*.\nImplements second part of @see sbhl-gather-first-sd-or-store-sd-candidates.\nDetermines sufficiency of C2-GENL-ISA, returns it if is in *sd-genls-isas-space*,\nisa #$SiblingDisjointCollectionType, and has no relevant exceptions.\nIf C2-GENL-ISA only fails due to exceptions, saves C2-GENL-ISA as candidate along\nwith relevant exceptions: saves this information as key, (list of values) in *sd-candidate-store*.")
    public static final SubLObject sbhl_determine_sd_and_store_candidates_alt(SubLObject c2_genl_isa) {
        if (NIL != com.cyc.cycjava.cycl.sdc.sbhl_sd_relevant_c2_genl_isa_candidateP(c2_genl_isa)) {
            return com.cyc.cycjava.cycl.sdc.sbhl_determine_sd_and_store_relevant_candidates(c2_genl_isa);
        }
        return NIL;
    }

    /**
     * Implements second part of @see sbhl-gather-first-sd-or-store-sd-candidates.
     * Determines sufficiency of C2-GENL-ISA, returns it if is in *sd-genls-isas-space*,
     * isa #$SiblingDisjointCollectionType, and has no relevant exceptions.
     * If C2-GENL-ISA only fails due to exceptions, saves C2-GENL-ISA as candidate along
     * with relevant exceptions: saves this information as key, (list of values) in *sd-candidate-store*.
     */
    @LispMethod(comment = "Implements second part of @see sbhl-gather-first-sd-or-store-sd-candidates.\r\nDetermines sufficiency of C2-GENL-ISA, returns it if is in *sd-genls-isas-space*,\r\nisa #$SiblingDisjointCollectionType, and has no relevant exceptions.\r\nIf C2-GENL-ISA only fails due to exceptions, saves C2-GENL-ISA as candidate along\r\nwith relevant exceptions: saves this information as key, (list of values) in *sd-candidate-store*.\nImplements second part of @see sbhl-gather-first-sd-or-store-sd-candidates.\nDetermines sufficiency of C2-GENL-ISA, returns it if is in *sd-genls-isas-space*,\nisa #$SiblingDisjointCollectionType, and has no relevant exceptions.\nIf C2-GENL-ISA only fails due to exceptions, saves C2-GENL-ISA as candidate along\nwith relevant exceptions: saves this information as key, (list of values) in *sd-candidate-store*.")
    public static SubLObject sbhl_determine_sd_and_store_candidates(final SubLObject c2_genl_isa) {
        if (NIL != sbhl_sd_relevant_c2_genl_isa_candidateP(c2_genl_isa)) {
            return sbhl_determine_sd_and_store_relevant_candidates(c2_genl_isa);
        }
        return NIL;
    }/**
     * Implements second part of @see sbhl-gather-first-sd-or-store-sd-candidates.
     * Determines sufficiency of C2-GENL-ISA, returns it if is in *sd-genls-isas-space*,
     * isa #$SiblingDisjointCollectionType, and has no relevant exceptions.
     * If C2-GENL-ISA only fails due to exceptions, saves C2-GENL-ISA as candidate along
     * with relevant exceptions: saves this information as key, (list of values) in *sd-candidate-store*.
     */


    public static final SubLObject clear_cached_sbhl_sd_relevant_c2_genl_isa_candidateP_alt() {
        {
            SubLObject cs = $cached_sbhl_sd_relevant_c2_genl_isa_candidateP_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_cached_sbhl_sd_relevant_c2_genl_isa_candidateP() {
        final SubLObject cs = $cached_sbhl_sd_relevant_c2_genl_isa_candidateP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_cached_sbhl_sd_relevant_c2_genl_isa_candidateP_alt(SubLObject c2_genl_isa) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_sbhl_sd_relevant_c2_genl_isa_candidateP_caching_state$.getGlobalValue(), list(c2_genl_isa), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_cached_sbhl_sd_relevant_c2_genl_isa_candidateP(final SubLObject c2_genl_isa) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_sbhl_sd_relevant_c2_genl_isa_candidateP_caching_state$.getGlobalValue(), list(c2_genl_isa), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cached_sbhl_sd_relevant_c2_genl_isa_candidateP_internal_alt(SubLObject c2_genl_isa) {
        return com.cyc.cycjava.cycl.sdc.sbhl_sd_relevant_c2_genl_isa_candidateP(c2_genl_isa);
    }

    public static SubLObject cached_sbhl_sd_relevant_c2_genl_isa_candidateP_internal(final SubLObject c2_genl_isa) {
        return sbhl_sd_relevant_c2_genl_isa_candidateP(c2_genl_isa);
    }

    public static final SubLObject cached_sbhl_sd_relevant_c2_genl_isa_candidateP_alt(SubLObject c2_genl_isa) {
        {
            SubLObject caching_state = $cached_sbhl_sd_relevant_c2_genl_isa_candidateP_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name($sym19$CACHED_SBHL_SD_RELEVANT_C2_GENL_ISA_CANDIDATE_, $sym20$_CACHED_SBHL_SD_RELEVANT_C2_GENL_ISA_CANDIDATE__CACHING_STATE_, NIL, EQL, ONE_INTEGER, SIXTEEN_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, c2_genl_isa, $kw21$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw21$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sdc.cached_sbhl_sd_relevant_c2_genl_isa_candidateP_internal(c2_genl_isa)));
                    memoization_state.caching_state_put(caching_state, c2_genl_isa, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject cached_sbhl_sd_relevant_c2_genl_isa_candidateP(final SubLObject c2_genl_isa) {
        SubLObject caching_state = $cached_sbhl_sd_relevant_c2_genl_isa_candidateP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym19$CACHED_SBHL_SD_RELEVANT_C2_GENL_ISA_CANDIDATE_, $sym20$_CACHED_SBHL_SD_RELEVANT_C2_GENL_ISA_CANDIDATE__CACHING_STATE_, NIL, EQL, ONE_INTEGER, SIXTEEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, c2_genl_isa, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cached_sbhl_sd_relevant_c2_genl_isa_candidateP_internal(c2_genl_isa)));
            memoization_state.caching_state_put(caching_state, c2_genl_isa, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject sbhl_sd_relevant_c2_genl_isa_candidateP_alt(SubLObject c2_genl_isa) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(c2_genl_isa, $sd_genls_isas_space$.getDynamicValue(thread))) && (NIL != sibling_disjoint_collection_p(c2_genl_isa)));
        }
    }

    public static SubLObject sbhl_sd_relevant_c2_genl_isa_candidateP(final SubLObject c2_genl_isa) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(c2_genl_isa, $sd_genls_isas_space$.getDynamicValue(thread))) && (NIL != relevant_sibling_disjoint_collection_p(c2_genl_isa)));
    }

    public static final SubLObject sbhl_determine_sd_and_store_relevant_candidates_alt(SubLObject c2_genl_isa) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject exceptions = com.cyc.cycjava.cycl.sdc.sdc_exceptions($sd_c2_genl$.getDynamicValue(thread), UNPROVIDED);
                SubLObject relevant_exceptions = NIL;
                SubLObject cdolist_list_var = exceptions;
                SubLObject exception = NIL;
                for (exception = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , exception = cdolist_list_var.first()) {
                    if (NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(exception, $sd_c1_genls_space$.getDynamicValue(thread))) {
                        relevant_exceptions = cons(exception, relevant_exceptions);
                    }
                }
                if (NIL != relevant_exceptions) {
                    hash_table_utilities.push_hash(c2_genl_isa, relevant_exceptions, $sd_candidate_store$.getDynamicValue(thread));
                    return NIL;
                } else {
                    return c2_genl_isa;
                }
            }
        }
    }

    public static SubLObject sbhl_determine_sd_and_store_relevant_candidates(final SubLObject c2_genl_isa) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject exceptions = sdc_exceptions($sd_c2_genl$.getDynamicValue(thread), UNPROVIDED);
        SubLObject relevant_exceptions = NIL;
        SubLObject cdolist_list_var = exceptions;
        SubLObject exception = NIL;
        exception = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(exception, $sd_c1_genls_space$.getDynamicValue(thread))) {
                relevant_exceptions = cons(exception, relevant_exceptions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            exception = cdolist_list_var.first();
        } 
        if (NIL != relevant_exceptions) {
            hash_table_utilities.push_hash(c2_genl_isa, relevant_exceptions, $sd_candidate_store$.getDynamicValue(thread));
            return NIL;
        }
        return c2_genl_isa;
    }

    /**
     * determines if there is any genls along isa path from c1 to a candidate c1-genl-isa
     * that does not go through a set of relevant exceptions, stored in @see *sd-candidate-store*
     */
    @LispMethod(comment = "determines if there is any genls along isa path from c1 to a candidate c1-genl-isa\r\nthat does not go through a set of relevant exceptions, stored in @see *sd-candidate-store*\ndetermines if there is any genls along isa path from c1 to a candidate c1-genl-isa\nthat does not go through a set of relevant exceptions, stored in @see *sd-candidate-store*")
    public static final SubLObject sbhl_determine_sd_path_with_no_exceptions_alt(SubLObject c1) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                if (NIL == result) {
                    {
                        SubLObject catch_var = NIL;
                        try {
                            {
                                SubLObject cdohash_table = $sd_candidate_store$.getDynamicValue(thread);
                                SubLObject c1_genl_isa = NIL;
                                SubLObject relevant_exceptions = NIL;
                                {
                                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                                    try {
                                        while (iteratorHasNext(cdohash_iterator)) {
                                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                            c1_genl_isa = getEntryKey(cdohash_entry);
                                            relevant_exceptions = getEntryValue(cdohash_entry);
                                            subl_macros.do_hash_table_done_check(result);
                                            if (NIL == result) {
                                                {
                                                    SubLObject csome_list_var = relevant_exceptions;
                                                    SubLObject c2_genl_exceptions = NIL;
                                                    for (c2_genl_exceptions = csome_list_var.first(); !((NIL != result) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , c2_genl_exceptions = csome_list_var.first()) {
                                                        if (NIL != com.cyc.cycjava.cycl.sdc.any_sd_isa_path_excluding_exceptions_p(c1, c1_genl_isa, c2_genl_exceptions)) {
                                                            result = c1_genl_isa;
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
                        } catch (Throwable ccatch_env_var) {
                            catch_var = Errors.handleThrowable(ccatch_env_var, $DO_HASH_TABLE);
                        }
                    }
                }
                return result;
            }
        }
    }

    /**
     * determines if there is any genls along isa path from c1 to a candidate c1-genl-isa
     * that does not go through a set of relevant exceptions, stored in @see *sd-candidate-store*
     */
    @LispMethod(comment = "determines if there is any genls along isa path from c1 to a candidate c1-genl-isa\r\nthat does not go through a set of relevant exceptions, stored in @see *sd-candidate-store*\ndetermines if there is any genls along isa path from c1 to a candidate c1-genl-isa\nthat does not go through a set of relevant exceptions, stored in @see *sd-candidate-store*")
    public static SubLObject sbhl_determine_sd_path_with_no_exceptions(final SubLObject c1) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if (NIL == result) {
            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($DO_HASH_TABLE);
                final SubLObject cdohash_table = $sd_candidate_store$.getDynamicValue(thread);
                SubLObject c1_genl_isa = NIL;
                SubLObject relevant_exceptions = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        c1_genl_isa = getEntryKey(cdohash_entry);
                        relevant_exceptions = getEntryValue(cdohash_entry);
                        subl_macros.do_hash_table_done_check(result);
                        if (NIL == result) {
                            SubLObject csome_list_var = relevant_exceptions;
                            SubLObject c2_genl_exceptions = NIL;
                            c2_genl_exceptions = csome_list_var.first();
                            while ((NIL == result) && (NIL != csome_list_var)) {
                                if (NIL != any_sd_isa_path_excluding_exceptions_p(c1, c1_genl_isa, c2_genl_exceptions)) {
                                    result = c1_genl_isa;
                                }
                                csome_list_var = csome_list_var.rest();
                                c2_genl_exceptions = csome_list_var.first();
                            } 
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            } catch (final Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $DO_HASH_TABLE);
            } finally {
                thread.throwStack.pop();
            }
        }
        return result;
    }/**
     * determines if there is any genls along isa path from c1 to a candidate c1-genl-isa
     * that does not go through a set of relevant exceptions, stored in @see *sd-candidate-store*
     */


    /**
     * determines if there is any genls along isa path from some c1 to a candidate c1-genl-isa
     * that does not go through a set of relevant exceptions, stored in @see *sd-candidate-store*
     */
    @LispMethod(comment = "determines if there is any genls along isa path from some c1 to a candidate c1-genl-isa\r\nthat does not go through a set of relevant exceptions, stored in @see *sd-candidate-store*\ndetermines if there is any genls along isa path from some c1 to a candidate c1-genl-isa\nthat does not go through a set of relevant exceptions, stored in @see *sd-candidate-store*")
    public static final SubLObject sbhl_determine_sd_path_with_no_exceptions_among_alt(SubLObject c1s) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject result2 = NIL;
                if (NIL == result) {
                    {
                        SubLObject csome_list_var = c1s;
                        SubLObject c1 = NIL;
                        for (c1 = csome_list_var.first(); !((NIL != result) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , c1 = csome_list_var.first()) {
                            if (NIL == result) {
                                {
                                    SubLObject catch_var = NIL;
                                    try {
                                        {
                                            SubLObject cdohash_table = $sd_candidate_store$.getDynamicValue(thread);
                                            SubLObject c1_genl_isa = NIL;
                                            SubLObject relevant_exceptions = NIL;
                                            {
                                                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                                                try {
                                                    while (iteratorHasNext(cdohash_iterator)) {
                                                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                        c1_genl_isa = getEntryKey(cdohash_entry);
                                                        relevant_exceptions = getEntryValue(cdohash_entry);
                                                        subl_macros.do_hash_table_done_check(result);
                                                        {
                                                            SubLObject cdolist_list_var = relevant_exceptions;
                                                            SubLObject c2_genl_exceptions = NIL;
                                                            for (c2_genl_exceptions = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , c2_genl_exceptions = cdolist_list_var.first()) {
                                                                if (NIL != com.cyc.cycjava.cycl.sdc.any_sd_isa_path_excluding_exceptions_p(c1, c1_genl_isa, c2_genl_exceptions)) {
                                                                    result = c1_genl_isa;
                                                                    result2 = cons(c1, result2);
                                                                }
                                                            }
                                                        }
                                                    } 
                                                } finally {
                                                    releaseEntrySetIterator(cdohash_iterator);
                                                }
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        catch_var = Errors.handleThrowable(ccatch_env_var, $DO_HASH_TABLE);
                                    }
                                }
                            }
                        }
                    }
                }
                return values(result, result2);
            }
        }
    }

    /**
     * determines if there is any genls along isa path from some c1 to a candidate c1-genl-isa
     * that does not go through a set of relevant exceptions, stored in @see *sd-candidate-store*
     */
    @LispMethod(comment = "determines if there is any genls along isa path from some c1 to a candidate c1-genl-isa\r\nthat does not go through a set of relevant exceptions, stored in @see *sd-candidate-store*\ndetermines if there is any genls along isa path from some c1 to a candidate c1-genl-isa\nthat does not go through a set of relevant exceptions, stored in @see *sd-candidate-store*")
    public static SubLObject sbhl_determine_sd_path_with_no_exceptions_among(final SubLObject c1s) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject result2 = NIL;
        if (NIL == result) {
            SubLObject csome_list_var = c1s;
            SubLObject c1 = NIL;
            c1 = csome_list_var.first();
            while ((NIL == result) && (NIL != csome_list_var)) {
                if (NIL == result) {
                    SubLObject catch_var = NIL;
                    try {
                        thread.throwStack.push($DO_HASH_TABLE);
                        final SubLObject cdohash_table = $sd_candidate_store$.getDynamicValue(thread);
                        SubLObject c1_genl_isa = NIL;
                        SubLObject relevant_exceptions = NIL;
                        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                        try {
                            while (iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                c1_genl_isa = getEntryKey(cdohash_entry);
                                relevant_exceptions = getEntryValue(cdohash_entry);
                                subl_macros.do_hash_table_done_check(result);
                                SubLObject cdolist_list_var = relevant_exceptions;
                                SubLObject c2_genl_exceptions = NIL;
                                c2_genl_exceptions = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    if (NIL != any_sd_isa_path_excluding_exceptions_p(c1, c1_genl_isa, c2_genl_exceptions)) {
                                        result = c1_genl_isa;
                                        result2 = cons(c1, result2);
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    c2_genl_exceptions = cdolist_list_var.first();
                                } 
                            } 
                        } finally {
                            releaseEntrySetIterator(cdohash_iterator);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        catch_var = Errors.handleThrowable(ccatch_env_var, $DO_HASH_TABLE);
                    } finally {
                        thread.throwStack.pop();
                    }
                }
                csome_list_var = csome_list_var.rest();
                c1 = csome_list_var.first();
            } 
        }
        return values(result, result2);
    }/**
     * determines if there is any genls along isa path from some c1 to a candidate c1-genl-isa
     * that does not go through a set of relevant exceptions, stored in @see *sd-candidate-store*
     */


    public static final SubLObject any_sd_isa_path_excluding_exceptions_p_alt(SubLObject node, SubLObject isa_node, SubLObject exceptions) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $sd_c1_genls_space$.currentBinding(thread);
                    try {
                        $sd_c1_genls_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        {
                            SubLObject _prev_bind_0_24 = $sd_c1_genls_space$.currentBinding(thread);
                            try {
                                $sd_c1_genls_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                {
                                    SubLObject _prev_bind_0_25 = $sd_genls_isas_space$.currentBinding(thread);
                                    try {
                                        $sd_genls_isas_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                        {
                                            SubLObject _prev_bind_0_26 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                sbhl_marking_utilities.sbhl_mark_all_nodes_marked(exceptions, $sd_c1_genls_space$.getDynamicValue(thread));
                                                result = com.cyc.cycjava.cycl.sdc.sbhl_sd_genls_and_genls_isa_path_p(node, isa_node);
                                            } finally {
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_26, thread);
                                            }
                                        }
                                        sbhl_marking_vars.free_sbhl_marking_space($sd_genls_isas_space$.getDynamicValue(thread));
                                    } finally {
                                        $sd_genls_isas_space$.rebind(_prev_bind_0_25, thread);
                                    }
                                }
                                sbhl_marking_vars.free_sbhl_marking_space($sd_c1_genls_space$.getDynamicValue(thread));
                            } finally {
                                $sd_c1_genls_space$.rebind(_prev_bind_0_24, thread);
                            }
                        }
                        sbhl_marking_vars.free_sbhl_marking_space($sd_c1_genls_space$.getDynamicValue(thread));
                    } finally {
                        $sd_c1_genls_space$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject any_sd_isa_path_excluding_exceptions_p(final SubLObject node, final SubLObject isa_node, final SubLObject exceptions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $sd_c1_genls_space$.currentBinding(thread);
        try {
            $sd_c1_genls_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject _prev_bind_0_$34 = $sd_c1_genls_space$.currentBinding(thread);
                try {
                    $sd_c1_genls_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject _prev_bind_0_$35 = $sd_genls_isas_space$.currentBinding(thread);
                        try {
                            $sd_genls_isas_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject _prev_bind_0_$36 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                    sbhl_marking_utilities.sbhl_mark_all_nodes_marked(exceptions, $sd_c1_genls_space$.getDynamicValue(thread));
                                    result = sbhl_sd_genls_and_genls_isa_path_p(node, isa_node);
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$36, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$37 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space($sd_genls_isas_space$.getDynamicValue(thread));
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                                }
                            }
                        } finally {
                            $sd_genls_isas_space$.rebind(_prev_bind_0_$35, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$38 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space($sd_c1_genls_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$38, thread);
                        }
                    }
                } finally {
                    $sd_c1_genls_space$.rebind(_prev_bind_0_$34, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$39 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space($sd_c1_genls_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$39, thread);
                }
            }
        } finally {
            $sd_c1_genls_space$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject sbhl_sd_genls_and_genls_isa_path_p_alt(SubLObject node, SubLObject goal) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $sbhl_sd_genls_isas_goal$.currentBinding(thread);
                    try {
                        $sbhl_sd_genls_isas_goal$.bind(goal, thread);
                        result = sbhl_search_methods.sbhl_gather_first_among_forward_true_nodes_in_space(sbhl_module_vars.get_sbhl_module($$genls), node, SBHL_SD_GOAL_IN_GENLS_ISAS_P, $sd_c1_genls_space$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    } finally {
                        $sbhl_sd_genls_isas_goal$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject sbhl_sd_genls_and_genls_isa_path_p(final SubLObject node, final SubLObject goal) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $sbhl_sd_genls_isas_goal$.currentBinding(thread);
        try {
            $sbhl_sd_genls_isas_goal$.bind(goal, thread);
            result = sbhl_search_methods.sbhl_gather_first_among_forward_true_nodes_in_space(sbhl_module_vars.get_sbhl_module($$genls), node, SBHL_SD_GOAL_IN_GENLS_ISAS_P, $sd_c1_genls_space$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        } finally {
            $sbhl_sd_genls_isas_goal$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject sbhl_sd_goal_in_genls_isas_p_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                result = sbhl_search_methods.sbhl_predicate_relation_in_space_p(sbhl_module_vars.get_sbhl_module($$isa), node, $sbhl_sd_genls_isas_goal$.getDynamicValue(thread), $sd_genls_isas_space$.getDynamicValue(thread), UNPROVIDED);
                return result;
            }
        }
    }

    public static SubLObject sbhl_sd_goal_in_genls_isas_p(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        result = sbhl_search_methods.sbhl_predicate_relation_in_space_p(sbhl_module_vars.get_sbhl_module($$isa), node, $sbhl_sd_genls_isas_goal$.getDynamicValue(thread), $sd_genls_isas_space$.getDynamicValue(thread), UNPROVIDED);
        return result;
    }

    /**
     * the most general cols that are sibling disjoint with <col> (expensive!)
     */
    @LispMethod(comment = "the most general cols that are sibling disjoint with <col> (expensive!)")
    public static final SubLObject sdc_alt(SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.sdc.max_sdc(col, mt);
    }

    /**
     * the most general cols that are sibling disjoint with <col> (expensive!)
     */
    @LispMethod(comment = "the most general cols that are sibling disjoint with <col> (expensive!)")
    public static SubLObject sdc(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return max_sdc(col, mt);
    }/**
     * the most general cols that are sibling disjoint with <col> (expensive!)
     */


    /**
     * the most general cols that are sibling disjoint with <col> (expensive!)
     */
    @LispMethod(comment = "the most general cols that are sibling disjoint with <col> (expensive!)")
    public static final SubLObject max_sdc_alt(SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        result = com.cyc.cycjava.cycl.sdc.max_sdc_int(col);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * the most general cols that are sibling disjoint with <col> (expensive!)
     */
    @LispMethod(comment = "the most general cols that are sibling disjoint with <col> (expensive!)")
    public static SubLObject max_sdc(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = max_sdc_int(col);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * the most general cols that are sibling disjoint with <col> (expensive!)
     */


    /**
     * all cols that are sibling disjoint with col (expensive!)
     */
    @LispMethod(comment = "all cols that are sibling disjoint with col (expensive!)")
    public static final SubLObject all_sdc_alt(SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        result = com.cyc.cycjava.cycl.sdc.all_sdc_int(col);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * all cols that are sibling disjoint with col (expensive!)
     */
    @LispMethod(comment = "all cols that are sibling disjoint with col (expensive!)")
    public static SubLObject all_sdc(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = all_sdc_int(col);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * all cols that are sibling disjoint with col (expensive!)
     */


    public static final SubLObject max_sdc_int_alt(SubLObject col) {
        return genls.max_cols(com.cyc.cycjava.cycl.sdc.all_sdc_int(col), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject max_sdc_int(final SubLObject col) {
        return genls.max_cols(all_sdc_int(col), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject all_sdc_int_alt(SubLObject col) {
        {
            SubLObject sdct = com.cyc.cycjava.cycl.sdc.applicable_sdct(col, UNPROVIDED);
            SubLObject candidates = isa.union_all_instances(sdct, UNPROVIDED, UNPROVIDED);
            SubLObject result = NIL;
            candidates = genls.union_all_specs(candidates, UNPROVIDED, UNPROVIDED);
            {
                SubLObject cdolist_list_var = candidates;
                SubLObject candidate = NIL;
                for (candidate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate = cdolist_list_var.first()) {
                    if (NIL != com.cyc.cycjava.cycl.sdc.any_isa_common_sdct(col, candidate, UNPROVIDED, UNPROVIDED)) {
                        result = cons(candidate, result);
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject all_sdc_int(final SubLObject col) {
        final SubLObject sdct = applicable_sdct(col, UNPROVIDED);
        SubLObject candidates = isa.union_all_instances(sdct, UNPROVIDED, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject cdolist_list_var;
        candidates = cdolist_list_var = genls.union_all_specs(candidates, UNPROVIDED, UNPROVIDED);
        SubLObject candidate = NIL;
        candidate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != any_isa_common_sdct(col, candidate, UNPROVIDED, UNPROVIDED)) {
                result = cons(candidate, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject remote_sdc_wrt_alt(SubLObject col, SubLObject sdct, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = genls.all_genls(col, mt, UNPROVIDED);
            SubLObject genl = NIL;
            for (genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl = cdolist_list_var.first()) {
                if (NIL != isa.isaP(genl, sdct, mt, UNPROVIDED)) {
                    result = cons(genl, result);
                }
            }
            return result;
        }
    }

    public static SubLObject remote_sdc_wrt(final SubLObject col, final SubLObject sdct, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var = genls.all_genls(col, mt, UNPROVIDED);
        SubLObject genl = NIL;
        genl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != isa.isaP(genl, sdct, mt, UNPROVIDED)) {
                result = cons(genl, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            genl = cdolist_list_var.first();
        } 
        return result;
    }

    /**
     * most-general cols whoses elements both include <col> and are sibling disjoint
     */
    @LispMethod(comment = "most-general cols whoses elements both include <col> and are sibling disjoint")
    public static final SubLObject isa_sdct_alt(SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.sdc.max_isa_sdct(col, mt);
    }

    /**
     * most-general cols whoses elements both include <col> and are sibling disjoint
     */
    @LispMethod(comment = "most-general cols whoses elements both include <col> and are sibling disjoint")
    public static SubLObject isa_sdct(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return max_isa_sdct(col, mt);
    }/**
     * most-general cols whoses elements both include <col> and are sibling disjoint
     */


    /**
     * most-general cols whoses elements are sibling disjoint and include <col>
     */
    @LispMethod(comment = "most-general cols whoses elements are sibling disjoint and include <col>")
    public static final SubLObject max_isa_sdct_alt(SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return genls.max_cols(com.cyc.cycjava.cycl.sdc.applicable_sdct(col, mt), UNPROVIDED, UNPROVIDED);
    }

    /**
     * most-general cols whoses elements are sibling disjoint and include <col>
     */
    @LispMethod(comment = "most-general cols whoses elements are sibling disjoint and include <col>")
    public static SubLObject max_isa_sdct(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return genls.max_cols(applicable_sdct(col, mt), UNPROVIDED, UNPROVIDED);
    }/**
     * most-general cols whoses elements are sibling disjoint and include <col>
     */


    /**
     *
     *
     * @return listp: include each sdct isa of each genl of COL
     * @see sdct
     */
    @LispMethod(comment = "@return listp: include each sdct isa of each genl of COL\r\n@see sdct")
    public static final SubLObject applicable_sdct_alt(SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sdcts = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_result$.bind(NIL, thread);
                        try {
                            {
                                SubLObject _prev_bind_0_27 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    genls.map_all_genls(GATHER_SDCT_ISAS, col, mt, UNPROVIDED);
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                                } finally {
                                    sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_0_27, thread);
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0_28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    sdcts = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_28, thread);
                                }
                            }
                        }
                    } finally {
                        sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_0, thread);
                    }
                }
                return sdcts;
            }
        }
    }

    /**
     *
     *
     * @return listp: include each sdct isa of each genl of COL
     * @see sdct
     */
    @LispMethod(comment = "@return listp: include each sdct isa of each genl of COL\r\n@see sdct")
    public static SubLObject applicable_sdct(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sdcts = NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_result$.bind(NIL, thread);
            try {
                final SubLObject _prev_bind_0_$40 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        genls.map_all_genls(GATHER_SDCT_ISAS, col, mt, UNPROVIDED);
                    } finally {
                        final SubLObject _prev_bind_0_$41 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$41, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_0_$40, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$42 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    sdcts = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$42, thread);
                }
            }
        } finally {
            sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_0, thread);
        }
        return sdcts;
    }

    public static final SubLObject gather_sdct_isas_alt(SubLObject col) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                SubLObject _prev_bind_1 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
                    sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(T, thread);
                    isa.map_all_isa($sym24$GATHER_IF_SDCT_, col, UNPROVIDED, UNPROVIDED);
                } finally {
                    sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_1, thread);
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject gather_sdct_isas(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(T, thread);
            isa.map_all_isa($sym23$GATHER_IF_SDCT_, col, UNPROVIDED, UNPROVIDED);
        } finally {
            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject gather_if_sdctP_alt(SubLObject collection) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != sibling_disjoint_collection_p(collection)) {
                sbhl_search_vars.$sbhl_result$.setDynamicValue(cons(collection, sbhl_search_vars.$sbhl_result$.getDynamicValue(thread)), thread);
            }
            return NIL;
        }
    }

    public static SubLObject gather_if_sdctP(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != relevant_sibling_disjoint_collection_p(collection)) {
            sbhl_search_vars.$sbhl_result$.setDynamicValue(cons(collection, sbhl_search_vars.$sbhl_result$.getDynamicValue(thread)), thread);
        }
        return NIL;
    }

    /**
     * all cols whoses elements both include <col> and are sibling disjoint
     */
    @LispMethod(comment = "all cols whoses elements both include <col> and are sibling disjoint")
    public static final SubLObject all_isa_sdct_alt(SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.sdc.cached_all_isa_sdct(col, mt_relevance_macros.mt_info(mt));
    }

    @LispMethod(comment = "all cols whoses elements both include <col> and are sibling disjoint")
    public static SubLObject all_isa_sdct(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return cached_all_isa_sdct(col, mt_relevance_macros.mt_info(mt));
    }/**
     * all cols whoses elements both include <col> and are sibling disjoint
     */


    public static final SubLObject clear_cached_all_isa_sdct_alt() {
        {
            SubLObject cs = $cached_all_isa_sdct_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_cached_all_isa_sdct() {
        final SubLObject cs = $cached_all_isa_sdct_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_cached_all_isa_sdct_alt(SubLObject col, SubLObject mt_info) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_all_isa_sdct_caching_state$.getGlobalValue(), list(col, mt_info), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_cached_all_isa_sdct(final SubLObject col, final SubLObject mt_info) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_all_isa_sdct_caching_state$.getGlobalValue(), list(col, mt_info), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cached_all_isa_sdct_internal_alt(SubLObject col, SubLObject mt_info) {
        {
            SubLObject mt = (NIL != mtP(mt_info)) ? ((SubLObject) (mt_info)) : NIL;
            return isa.all_isa_if(SIBLING_DISJOINT_COLLECTION_P, col, mt, UNPROVIDED);
        }
    }

    public static SubLObject cached_all_isa_sdct_internal(final SubLObject col, final SubLObject mt_info) {
        final SubLObject mt = (NIL != fort_types_interface.mtP(mt_info)) ? mt_info : NIL;
        return isa.all_isa_if(RELEVANT_SIBLING_DISJOINT_COLLECTION_P, col, mt, UNPROVIDED);
    }

    public static final SubLObject cached_all_isa_sdct_alt(SubLObject col, SubLObject mt_info) {
        {
            SubLObject caching_state = $cached_all_isa_sdct_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(CACHED_ALL_ISA_SDCT, $cached_all_isa_sdct_caching_state$, NIL, EQL, TWO_INTEGER, $int$512);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(col, mt_info);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw21$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (col.eql(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.eql(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sdc.cached_all_isa_sdct_internal(col, mt_info)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(col, mt_info));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject cached_all_isa_sdct(final SubLObject col, final SubLObject mt_info) {
        SubLObject caching_state = $cached_all_isa_sdct_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_ALL_ISA_SDCT, $cached_all_isa_sdct_caching_state$, NIL, EQL, TWO_INTEGER, $int$512);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(col, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (col.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(cached_all_isa_sdct_internal(col, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(col, mt_info));
        return memoization_state.caching_results(results3);
    }

    /**
     * all collections whoses elements both include
     * any col in <cols> and are sibling disjoint
     */
    @LispMethod(comment = "all collections whoses elements both include\r\nany col in <cols> and are sibling disjoint\nall collections whoses elements both include\nany col in <cols> and are sibling disjoint")
    public static final SubLObject union_all_isa_sdct_alt(SubLObject cols, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject isa_sdct = NIL;
            SubLObject cdolist_list_var = isa.union_all_isa(cols, mt, UNPROVIDED);
            SubLObject v_isa = NIL;
            for (v_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_isa = cdolist_list_var.first()) {
                if (NIL != sibling_disjoint_collection_p(v_isa)) {
                    isa_sdct = cons(v_isa, isa_sdct);
                }
            }
            return isa_sdct;
        }
    }

    @LispMethod(comment = "all collections whoses elements both include\r\nany col in <cols> and are sibling disjoint\nall collections whoses elements both include\nany col in <cols> and are sibling disjoint")
    public static SubLObject union_all_isa_sdct(final SubLObject cols, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject isa_sdct = NIL;
        SubLObject cdolist_list_var = isa.union_all_isa(cols, mt, UNPROVIDED);
        SubLObject v_isa = NIL;
        v_isa = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != relevant_sibling_disjoint_collection_p(v_isa)) {
                isa_sdct = cons(v_isa, isa_sdct);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
        } 
        return isa_sdct;
    }/**
     * all collections whoses elements both include
     * any col in <cols> and are sibling disjoint
     */


    /**
     * is <col> an instance of a collection that is a SiblingDisjointCollectionType
     */
    @LispMethod(comment = "is <col> an instance of a collection that is a SiblingDisjointCollectionType")
    public static final SubLObject sdc_elementP_alt(SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.sdc.sdct_elementP(col, mt);
    }

    @LispMethod(comment = "is <col> an instance of a collection that is a SiblingDisjointCollectionType")
    public static SubLObject sdc_elementP(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sdct_elementP(col, mt);
    }/**
     * is <col> an instance of a collection that is a SiblingDisjointCollectionType
     */


    /**
     * is <col> an instance of a collection that is a SiblingDisjointCollectionType
     */
    @LispMethod(comment = "is <col> an instance of a collection that is a SiblingDisjointCollectionType")
    public static final SubLObject sdct_elementP_alt(SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != term.ground_nautP(col, UNPROVIDED)) {
            return com.cyc.cycjava.cycl.sdc.sdct_elementP(narts_high.find_nart(col), mt);
        } else {
            if (NIL != collectionP(col)) {
                return isa.any_wrt_all_isa(SIBLING_DISJOINT_COLLECTION_P, col, mt, UNPROVIDED);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "is <col> an instance of a collection that is a SiblingDisjointCollectionType")
    public static SubLObject sdct_elementP(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != term.ground_nautP(col, UNPROVIDED)) {
            return sdct_elementP(narts_high.find_nart(col), mt);
        }
        if (NIL != fort_types_interface.collectionP(col)) {
            return isa.any_wrt_all_isa(RELEVANT_SIBLING_DISJOINT_COLLECTION_P, col, mt, UNPROVIDED);
        }
        return NIL;
    }/**
     * is <col> an instance of a collection that is a SiblingDisjointCollectionType
     */


    public static final SubLObject safe_sdct_elementP_alt(SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sdctP = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        sdctP = com.cyc.cycjava.cycl.sdc.sdct_elementP(col, mt);
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                    }
                }
                return sdctP;
            }
        }
    }

    public static SubLObject safe_sdct_elementP(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sdctP = NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                sdctP = sdct_elementP(col, mt);
            } finally {
                final SubLObject _prev_bind_0_$43 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return sdctP;
    }

    public static final SubLObject applicable_sdctP_alt(SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != term.ground_nautP(col, UNPROVIDED)) {
            return com.cyc.cycjava.cycl.sdc.sdct_elementP(narts_high.find_nart(col), mt);
        } else {
            if (NIL != collectionP(col)) {
                return genls.any_all_genls(symbol_function($sym29$SAFE_SDCT_ELEMENT_), col, mt, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject applicable_sdctP(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != term.ground_nautP(col, UNPROVIDED)) {
            return sdct_elementP(narts_high.find_nart(col), mt);
        }
        if (NIL != fort_types_interface.collectionP(col)) {
            return genls.any_all_genls(symbol_function($sym28$SAFE_SDCT_ELEMENT_), col, mt, UNPROVIDED);
        }
        return NIL;
    }

    /**
     * is <c1> sibling-disjoint wrt <c2>?
     */
    @LispMethod(comment = "is <c1> sibling-disjoint wrt <c2>?")
    public static final SubLObject sdcP_alt(SubLObject c1, SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != term.ground_nautP(c1, UNPROVIDED)) {
                return com.cyc.cycjava.cycl.sdc.sdcP(narts_high.find_nart(c1), c2, mt);
            } else {
                if (NIL != term.ground_nautP(c2, UNPROVIDED)) {
                    return com.cyc.cycjava.cycl.sdc.sdcP(c1, narts_high.find_nart(c2), mt);
                } else {
                    if (NIL == collectionP(c1)) {
                        return NIL;
                    } else {
                        if (NIL == collectionP(c2)) {
                            return NIL;
                        } else {
                            {
                                SubLObject sdcP = NIL;
                                SubLObject mt_var = mt;
                                {
                                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                        sdcP = com.cyc.cycjava.cycl.sdc.sdc_intP(c1, c2);
                                    } finally {
                                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                return sdcP;
                            }
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "is <c1> sibling-disjoint wrt <c2>?")
    public static SubLObject sdcP(final SubLObject c1, final SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != term.ground_nautP(c1, UNPROVIDED)) {
            return sdcP(narts_high.find_nart(c1), c2, mt);
        }
        if (NIL != term.ground_nautP(c2, UNPROVIDED)) {
            return sdcP(c1, narts_high.find_nart(c2), mt);
        }
        if (NIL == fort_types_interface.collectionP(c1)) {
            return NIL;
        }
        if (NIL == fort_types_interface.collectionP(c2)) {
            return NIL;
        }
        SubLObject sdcP = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            sdcP = sdc_intP(c1, c2);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return sdcP;
    }/**
     * is <c1> sibling-disjoint wrt <c2>?
     */


    /**
     * is <c1> sibling-disjoint with <c2> within <mt>?
     */
    @LispMethod(comment = "is <c1> sibling-disjoint with <c2> within <mt>?")
    public static final SubLObject sdc_intP_alt(SubLObject c1, SubLObject c2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $ignoring_sdcP$.getDynamicValue(thread)) {
                return NIL;
            } else {
                if (NIL == com.cyc.cycjava.cycl.sdc.isa_common_sdctP(c1, c2, UNPROVIDED)) {
                    return NIL;
                } else {
                    if (NIL != com.cyc.cycjava.cycl.sdc.establishing_supersetP(c1, c2, UNPROVIDED, UNPROVIDED)) {
                        return NIL;
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.sdc.establishing_supersetP(c2, c1, UNPROVIDED, UNPROVIDED)) {
                            return NIL;
                        } else {
                            if (NIL != com.cyc.cycjava.cycl.sdc.establishing_instance_ofP(c1, c2, UNPROVIDED, UNPROVIDED)) {
                                return NIL;
                            } else {
                                return T;
                            }
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "is <c1> sibling-disjoint with <c2> within <mt>?")
    public static SubLObject sdc_intP(final SubLObject c1, final SubLObject c2) {
        if (NIL != ignoring_sdcP()) {
            return NIL;
        }
        if (NIL == isa_common_sdctP(c1, c2, UNPROVIDED)) {
            return NIL;
        }
        if (NIL != establishing_supersetP(c1, c2, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        if (NIL != establishing_supersetP(c2, c1, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        if (NIL != establishing_instance_ofP(c1, c2, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        return T;
    }/**
     * is <c1> sibling-disjoint with <c2> within <mt>?
     */


    /**
     * is any c1 in <c1s> sibling-disjoint with <c2> within <mt>?
     */
    @LispMethod(comment = "is any c1 in <c1s> sibling-disjoint with <c2> within <mt>?")
    public static final SubLObject any_sdc_wrtP_alt(SubLObject c1s, SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (((NIL != c1s) && (NIL != collectionP(c2))) && (NIL == $ignoring_sdcP$.getDynamicValue(thread))) {
                thread.resetMultipleValues();
                {
                    SubLObject sdcP = com.cyc.cycjava.cycl.sdc.any_isa_common_sdct_among(c1s, c2, mt, UNPROVIDED);
                    SubLObject rel_c1 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject cdolist_list_var = c1s;
                        SubLObject c1 = NIL;
                        for (c1 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , c1 = cdolist_list_var.first()) {
                            if (NIL != com.cyc.cycjava.cycl.sdc.establishing_supersetP(c1, c2, mt, UNPROVIDED)) {
                            } else {
                                if (NIL != com.cyc.cycjava.cycl.sdc.establishing_supersetP(c2, c1, mt, UNPROVIDED)) {
                                } else {
                                    if (NIL != com.cyc.cycjava.cycl.sdc.establishing_instance_ofP(c1, c2, mt, UNPROVIDED)) {
                                        return NIL;
                                    }
                                }
                            }
                        }
                    }
                    return list_utilities.sublisp_boolean(sdcP);
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "is any c1 in <c1s> sibling-disjoint with <c2> within <mt>?")
    public static SubLObject any_sdc_wrtP(final SubLObject c1s, final SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != c1s) && (NIL != fort_types_interface.collectionP(c2))) && (NIL == ignoring_sdcP())) {
            thread.resetMultipleValues();
            final SubLObject sdcP = any_isa_common_sdct_among(c1s, c2, mt, UNPROVIDED);
            final SubLObject rel_c1 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = c1s;
            SubLObject c3 = NIL;
            c3 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == establishing_supersetP(c3, c2, mt, UNPROVIDED)) {
                    if (NIL == establishing_supersetP(c2, c3, mt, UNPROVIDED)) {
                        if (NIL != establishing_instance_ofP(c3, c2, mt, UNPROVIDED)) {
                            return NIL;
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                c3 = cdolist_list_var.first();
            } 
            return list_utilities.sublisp_boolean(sdcP);
        }
        return NIL;
    }/**
     * is any c1 in <c1s> sibling-disjoint with <c2> within <mt>?
     */


    /**
     * is any c1 in <c1s> sibling-disjoint with <c2> within <mt>?  returns justification details
     */
    @LispMethod(comment = "is any c1 in <c1s> sibling-disjoint with <c2> within <mt>?  returns justification details")
    public static final SubLObject any_sdc_wrt_alt(SubLObject c1s, SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (((NIL != c1s) && (NIL != collectionP(c2))) && (NIL == $ignoring_sdcP$.getDynamicValue(thread))) {
                {
                    SubLObject sdcP = NIL;
                    if (NIL == sdcP) {
                        {
                            SubLObject csome_list_var = c1s;
                            SubLObject c1 = NIL;
                            for (c1 = csome_list_var.first(); !((NIL != sdcP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , c1 = csome_list_var.first()) {
                                if (NIL == com.cyc.cycjava.cycl.sdc.isa_common_sdctP(c1, c2, mt)) {
                                } else {
                                    if (NIL != com.cyc.cycjava.cycl.sdc.establishing_supersetP(c1, c2, mt, UNPROVIDED)) {
                                    } else {
                                        if (NIL != com.cyc.cycjava.cycl.sdc.establishing_supersetP(c2, c1, mt, UNPROVIDED)) {
                                        } else {
                                            if (NIL != com.cyc.cycjava.cycl.sdc.establishing_instance_ofP(c1, c2, mt, UNPROVIDED)) {
                                                return NIL;
                                            } else {
                                                sdcP = T;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return sdcP;
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "is any c1 in <c1s> sibling-disjoint with <c2> within <mt>?  returns justification details")
    public static SubLObject any_sdc_wrt(final SubLObject c1s, final SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (((NIL != c1s) && (NIL != fort_types_interface.collectionP(c2))) && (NIL == ignoring_sdcP())) {
            SubLObject sdcP = NIL;
            if (NIL == sdcP) {
                SubLObject csome_list_var = c1s;
                SubLObject c3 = NIL;
                c3 = csome_list_var.first();
                while ((NIL == sdcP) && (NIL != csome_list_var)) {
                    if (NIL != isa_common_sdctP(c3, c2, mt)) {
                        if (NIL == establishing_supersetP(c3, c2, mt, UNPROVIDED)) {
                            if (NIL == establishing_supersetP(c2, c3, mt, UNPROVIDED)) {
                                if (NIL != establishing_instance_ofP(c3, c2, mt, UNPROVIDED)) {
                                    return NIL;
                                }
                                sdcP = T;
                            }
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    c3 = csome_list_var.first();
                } 
            }
            return sdcP;
        }
        return NIL;
    }/**
     * is any c1 in <c1s> sibling-disjoint with <c2> within <mt>?  returns justification details
     */


    /**
     * is any c1 in <c1s> sibling-disjoint with any c2 in <c2s> within <mt>?
     */
    @LispMethod(comment = "is any c1 in <c1s> sibling-disjoint with any c2 in <c2s> within <mt>?")
    public static final SubLObject any_sdc_anyP_alt(SubLObject c1s, SubLObject c2s, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject c1_sdcts = com.cyc.cycjava.cycl.sdc.cols_with_applicable_sdct(c1s, mt);
                if (NIL != c1_sdcts) {
                    {
                        SubLObject sdcP = NIL;
                        SubLObject rel_c1s = NIL;
                        SubLObject rel_c2 = NIL;
                        if (NIL == sdcP) {
                            {
                                SubLObject csome_list_var = com.cyc.cycjava.cycl.sdc.cols_with_applicable_sdct(c2s, mt);
                                SubLObject sdct2 = NIL;
                                for (sdct2 = csome_list_var.first(); !((NIL != sdcP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , sdct2 = csome_list_var.first()) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject sdcP_29 = com.cyc.cycjava.cycl.sdc.any_sdc_wrtP(c1_sdcts, sdct2, mt);
                                        SubLObject rel_c1s_30 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        sdcP = sdcP_29;
                                        rel_c1s = rel_c1s_30;
                                    }
                                    if (NIL != sdcP) {
                                        rel_c2 = sdct2;
                                    }
                                }
                            }
                        }
                        return list_utilities.sublisp_boolean(sdcP);
                    }
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "is any c1 in <c1s> sibling-disjoint with any c2 in <c2s> within <mt>?")
    public static SubLObject any_sdc_anyP(final SubLObject c1s, final SubLObject c2s, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject c1_sdcts = cols_with_applicable_sdct(c1s, mt);
        if (NIL != c1_sdcts) {
            SubLObject sdcP = NIL;
            SubLObject rel_c1s = NIL;
            SubLObject rel_c2 = NIL;
            if (NIL == sdcP) {
                SubLObject csome_list_var = cols_with_applicable_sdct(c2s, mt);
                SubLObject sdct2 = NIL;
                sdct2 = csome_list_var.first();
                while ((NIL == sdcP) && (NIL != csome_list_var)) {
                    thread.resetMultipleValues();
                    final SubLObject sdcP_$44 = any_sdc_wrtP(c1_sdcts, sdct2, mt);
                    final SubLObject rel_c1s_$45 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    sdcP = sdcP_$44;
                    rel_c1s = rel_c1s_$45;
                    if (NIL != sdcP) {
                        rel_c2 = sdct2;
                    }
                    csome_list_var = csome_list_var.rest();
                    sdct2 = csome_list_var.first();
                } 
            }
            return list_utilities.sublisp_boolean(sdcP);
        }
        return NIL;
    }/**
     * is any c1 in <c1s> sibling-disjoint with any c2 in <c2s> within <mt>?
     */


    /**
     * returns the pair (c1 c2) such that c1 is in <c1s>, c2 is in <c2s>,
     * and c1 is sibling-disjoint with c2 within <mt>
     * or returns NIL if no such pair exist
     */
    @LispMethod(comment = "returns the pair (c1 c2) such that c1 is in <c1s>, c2 is in <c2s>,\r\nand c1 is sibling-disjoint with c2 within <mt>\r\nor returns NIL if no such pair exist\nreturns the pair (c1 c2) such that c1 is in <c1s>, c2 is in <c2s>,\nand c1 is sibling-disjoint with c2 within <mt>\nor returns NIL if no such pair exist")
    public static final SubLObject any_sdc_any_alt(SubLObject c1s, SubLObject c2s, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject sdc_pair = NIL;
            if (NIL == sdc_pair) {
                {
                    SubLObject csome_list_var = com.cyc.cycjava.cycl.sdc.cols_with_applicable_sdct(c1s, mt);
                    SubLObject sdct1 = NIL;
                    for (sdct1 = csome_list_var.first(); !((NIL != sdc_pair) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , sdct1 = csome_list_var.first()) {
                        if (NIL == sdc_pair) {
                            {
                                SubLObject csome_list_var_31 = com.cyc.cycjava.cycl.sdc.cols_with_applicable_sdct(c2s, mt);
                                SubLObject sdct2 = NIL;
                                for (sdct2 = csome_list_var_31.first(); !((NIL != sdc_pair) || (NIL == csome_list_var_31)); csome_list_var_31 = csome_list_var_31.rest() , sdct2 = csome_list_var_31.first()) {
                                    if (NIL != com.cyc.cycjava.cycl.sdc.sdcP(sdct1, sdct2, mt)) {
                                        sdc_pair = list(sdct1, sdct2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return sdc_pair;
        }
    }

    @LispMethod(comment = "returns the pair (c1 c2) such that c1 is in <c1s>, c2 is in <c2s>,\r\nand c1 is sibling-disjoint with c2 within <mt>\r\nor returns NIL if no such pair exist\nreturns the pair (c1 c2) such that c1 is in <c1s>, c2 is in <c2s>,\nand c1 is sibling-disjoint with c2 within <mt>\nor returns NIL if no such pair exist")
    public static SubLObject any_sdc_any(final SubLObject c1s, final SubLObject c2s, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject sdc_pair = NIL;
        if (NIL == sdc_pair) {
            SubLObject csome_list_var = cols_with_applicable_sdct(c1s, mt);
            SubLObject sdct1 = NIL;
            sdct1 = csome_list_var.first();
            while ((NIL == sdc_pair) && (NIL != csome_list_var)) {
                if (NIL == sdc_pair) {
                    SubLObject csome_list_var_$46 = cols_with_applicable_sdct(c2s, mt);
                    SubLObject sdct2 = NIL;
                    sdct2 = csome_list_var_$46.first();
                    while ((NIL == sdc_pair) && (NIL != csome_list_var_$46)) {
                        if (NIL != sdcP(sdct1, sdct2, mt)) {
                            sdc_pair = list(sdct1, sdct2);
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
    }/**
     * returns the pair (c1 c2) such that c1 is in <c1s>, c2 is in <c2s>,
     * and c1 is sibling-disjoint with c2 within <mt>
     * or returns NIL if no such pair exist
     */


    public static final SubLObject sdc_exceptions_alt(SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.sdc.sdc_exceptions_int(collection, mt);
    }

    public static SubLObject sdc_exceptions(final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != within_assertP()) {
            return NIL;
        }
        return sdc_exceptions_int(collection, mt);
    }

    public static final SubLObject sdc_exceptions_int_alt(SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list_utilities.remove_duplicate_forts(nconc(com.cyc.cycjava.cycl.sdc.direct_sdc_exceptions(collection, mt), NIL != $sdc_common_spec_exceptionP$.getDynamicValue(thread) ? ((SubLObject) (com.cyc.cycjava.cycl.sdc.collections_sharing_specs(collection, mt))) : NIL));
        }
    }

    public static SubLObject sdc_exceptions_int(final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.remove_duplicate_forts(nconc(direct_sdc_exceptions(collection, mt), NIL != $sdc_common_spec_exceptionP$.getDynamicValue(thread) ? collections_sharing_specs(collection, mt) : NIL));
    }

    public static final SubLObject clear_cached_sdc_exceptions_alt() {
        {
            SubLObject cs = $cached_sdc_exceptions_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_cached_sdc_exceptions() {
        final SubLObject cs = $cached_sdc_exceptions_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_cached_sdc_exceptions_alt(SubLObject collection) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_sdc_exceptions_caching_state$.getGlobalValue(), list(collection), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_cached_sdc_exceptions(final SubLObject collection) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_sdc_exceptions_caching_state$.getGlobalValue(), list(collection), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cached_sdc_exceptions_internal_alt(SubLObject collection) {
        return com.cyc.cycjava.cycl.sdc.sdc_exceptions_int(collection, UNPROVIDED);
    }

    public static SubLObject cached_sdc_exceptions_internal(final SubLObject collection) {
        return sdc_exceptions_int(collection, UNPROVIDED);
    }

    public static final SubLObject cached_sdc_exceptions_alt(SubLObject collection) {
        {
            SubLObject caching_state = $cached_sdc_exceptions_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(CACHED_SDC_EXCEPTIONS, $cached_sdc_exceptions_caching_state$, NIL, EQL, ONE_INTEGER, SIXTEEN_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, collection, $kw21$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw21$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sdc.cached_sdc_exceptions_internal(collection)));
                    memoization_state.caching_state_put(caching_state, collection, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject cached_sdc_exceptions(final SubLObject collection) {
        SubLObject caching_state = $cached_sdc_exceptions_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_SDC_EXCEPTIONS, $cached_sdc_exceptions_caching_state$, NIL, EQL, ONE_INTEGER, SIXTEEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, collection, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cached_sdc_exceptions_internal(collection)));
            memoization_state.caching_state_put(caching_state, collection, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     * exceptions to the sibling-disjoint cols wrt COLLECTION (see *sdc-exception-transfers-thru-specs?*)
     */
    @LispMethod(comment = "exceptions to the sibling-disjoint cols wrt COLLECTION (see *sdc-exception-transfers-thru-specs?*)")
    public static final SubLObject declared_sdc_exceptions_alt(SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.sdc.sdc_exceptions_of_genls(collection, mt);
    }

    @LispMethod(comment = "exceptions to the sibling-disjoint cols wrt COLLECTION (see *sdc-exception-transfers-thru-specs?*)")
    public static SubLObject declared_sdc_exceptions(final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sdc_exceptions_of_genls(collection, mt);
    }/**
     * exceptions to the sibling-disjoint cols wrt COLLECTION (see *sdc-exception-transfers-thru-specs?*)
     */


    /**
     * direct-sdc-exceptions of the all-genls of COLLECTION
     */
    @LispMethod(comment = "direct-sdc-exceptions of the all-genls of COLLECTION")
    public static final SubLObject sdc_exceptions_of_genls_alt(SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_search_methods.sbhl_gather_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), collection, GATHER_DIRECT_SDC_EXCEPTIONS, mt, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "direct-sdc-exceptions of the all-genls of COLLECTION")
    public static SubLObject sdc_exceptions_of_genls(final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_search_methods.sbhl_gather_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), collection, GATHER_DIRECT_SDC_EXCEPTIONS, mt, UNPROVIDED, UNPROVIDED);
    }/**
     * direct-sdc-exceptions of the all-genls of COLLECTION
     */


    public static final SubLObject gather_direct_sdc_exceptions_alt(SubLObject collection) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sbhl_search_vars.$sbhl_result$.setDynamicValue(nconc(sbhl_search_vars.$sbhl_result$.getDynamicValue(thread), com.cyc.cycjava.cycl.sdc.direct_sdc_exceptions(collection, UNPROVIDED)), thread);
            return NIL;
        }
    }

    public static SubLObject gather_direct_sdc_exceptions(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_search_vars.$sbhl_result$.setDynamicValue(nconc(sbhl_search_vars.$sbhl_result$.getDynamicValue(thread), direct_sdc_exceptions(collection, UNPROVIDED)), thread);
        return NIL;
    }

    /**
     * declared exceptions to the sibling-disjoint cols wrt <collection>
     */
    @LispMethod(comment = "declared exceptions to the sibling-disjoint cols wrt <collection>")
    public static final SubLObject direct_sdc_exceptions_alt(SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return nunion(kb_mapping_utilities.pred_values_in_relevant_mts(collection, $$siblingDisjointExceptions, mt, ONE_INTEGER, TWO_INTEGER, UNPROVIDED), kb_mapping_utilities.pred_values_in_relevant_mts(collection, $$siblingDisjointExceptions, mt, TWO_INTEGER, ONE_INTEGER, UNPROVIDED), UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "declared exceptions to the sibling-disjoint cols wrt <collection>")
    public static SubLObject direct_sdc_exceptions(final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return nunion(nunion(kb_mapping_utilities.pred_values_in_relevant_mts(collection, $$siblingDisjointExceptions, mt, ONE_INTEGER, TWO_INTEGER, UNPROVIDED), kb_mapping_utilities.pred_values_in_relevant_mts(collection, $$siblingDisjointExceptions, mt, TWO_INTEGER, ONE_INTEGER, UNPROVIDED), UNPROVIDED, UNPROVIDED), nunion(kb_mapping_utilities.pred_values_in_relevant_mts(collection, $$rewriteOf, mt, ONE_INTEGER, TWO_INTEGER, UNPROVIDED), kb_mapping_utilities.pred_values_in_relevant_mts(collection, $$rewriteOf, mt, TWO_INTEGER, ONE_INTEGER, UNPROVIDED), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
    }/**
     * declared exceptions to the sibling-disjoint cols wrt <collection>
     */


    /**
     *
     *
     * @return boolean-p; t iff there a declared sibling-disjoint exception for C1 and C2
     */
    @LispMethod(comment = "@return boolean-p; t iff there a declared sibling-disjoint exception for C1 and C2")
    public static final SubLObject direct_sdc_exceptionP_alt(SubLObject c1, SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts($$siblingDisjointExceptions, c1, c2, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts($$siblingDisjointExceptions, c2, c1, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    /**
     *
     *
     * @return boolean-p; t iff there a declared sibling-disjoint exception for C1 and C2
     */
    @LispMethod(comment = "@return boolean-p; t iff there a declared sibling-disjoint exception for C1 and C2")
    public static SubLObject direct_sdc_exceptionP(final SubLObject c1, final SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((((NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts($$siblingDisjointExceptions, c1, c2, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts($$siblingDisjointExceptions, c2, c1, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts($$rewriteOf, c1, c2, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts($$rewriteOf, c2, c1, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject collections_sharing_specs_alt(SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return genls.union_all_genls(genls.collection_leaves(collection, mt, UNPROVIDED), mt, UNPROVIDED);
    }

    public static SubLObject collections_sharing_specs(final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return genls.union_all_genls(genls.collection_leaves(collection, mt, UNPROVIDED), mt, UNPROVIDED);
    }

    public static final SubLObject sdc_exceptionP_alt(SubLObject c1, SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != com.cyc.cycjava.cycl.sdc.declared_sdc_exceptionP(c1, c2, mt)) || (NIL != com.cyc.cycjava.cycl.sdc.sdc_common_specP(c1, c2, mt)));
    }

    public static SubLObject sdc_exceptionP(final SubLObject c1, final SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != declared_sdc_exceptionP(c1, c2, mt)) || (NIL != sdc_common_specP(c1, c2, mt)));
    }

    public static final SubLObject declared_sdc_exceptionP_alt(SubLObject c1, SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $sdc_exception_transfers_thru_specsP$.getDynamicValue(thread)) {
                return com.cyc.cycjava.cycl.sdc.remote_sdc_exceptionP(c1, c2, mt);
            } else {
                return com.cyc.cycjava.cycl.sdc.direct_sdc_exceptionP(c1, c2, mt);
            }
        }
    }

    public static SubLObject declared_sdc_exceptionP(final SubLObject c1, final SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $sdc_exception_transfers_thru_specsP$.getDynamicValue(thread)) {
            return remote_sdc_exceptionP(c1, c2, mt);
        }
        return direct_sdc_exceptionP(c1, c2, mt);
    }

    /**
     * any direct-sdc-exceptions among the (all) genls of <c1> and <c2>
     */
    @LispMethod(comment = "any direct-sdc-exceptions among the (all) genls of <c1> and <c2>")
    public static final SubLObject remote_sdc_exceptionP_alt(SubLObject c1, SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return booleanp(com.cyc.cycjava.cycl.sdc.any_remote_sdc_exception_pair(c1, c2, mt));
    }

    @LispMethod(comment = "any direct-sdc-exceptions among the (all) genls of <c1> and <c2>")
    public static SubLObject remote_sdc_exceptionP(final SubLObject c1, final SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return booleanp(any_remote_sdc_exception_pair(c1, c2, mt));
    }/**
     * any direct-sdc-exceptions among the (all) genls of <c1> and <c2>
     */


    /**
     *
     *
     * @return listp; returns the first pair of genls, one c1's genl one c2's genl, which have a sibling disjoint exception.
     */
    @LispMethod(comment = "@return listp; returns the first pair of genls, one c1\'s genl one c2\'s genl, which have a sibling disjoint exception.")
    public static final SubLObject any_remote_sdc_exception_pair_alt(SubLObject c1, SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                        sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        {
                            SubLObject _prev_bind_0_32 = sbhl_marking_vars.$sbhl_space_1$.currentBinding(thread);
                            SubLObject _prev_bind_1_33 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_space_1$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                                sbhl_marking_methods.sbhl_mark_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), c1, mt, UNPROVIDED);
                                {
                                    SubLObject resourcing_p_34 = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                                    {
                                        SubLObject _prev_bind_0_35 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                        SubLObject _prev_bind_1_36 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                                            sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                            {
                                                SubLObject _prev_bind_0_37 = sbhl_marking_vars.$sbhl_space_2$.currentBinding(thread);
                                                SubLObject _prev_bind_1_38 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                                try {
                                                    sbhl_marking_vars.$sbhl_space_2$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p_34, thread);
                                                    sbhl_marking_methods.sbhl_mark_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), c2, mt, UNPROVIDED);
                                                    {
                                                        SubLObject map_table = (hash_table_count(sbhl_marking_vars.$sbhl_space_1$.getDynamicValue(thread)).numG(hash_table_count(sbhl_marking_vars.$sbhl_space_2$.getDynamicValue(thread)))) ? ((SubLObject) (sbhl_marking_vars.$sbhl_space_2$.getDynamicValue(thread))) : sbhl_marking_vars.$sbhl_space_1$.getDynamicValue(thread);
                                                        {
                                                            SubLObject _prev_bind_0_39 = sbhl_marking_vars.$sbhl_goal_table$.currentBinding(thread);
                                                            try {
                                                                sbhl_marking_vars.$sbhl_goal_table$.bind(map_table == sbhl_marking_vars.$sbhl_space_1$.getDynamicValue(thread) ? ((SubLObject) (sbhl_marking_vars.$sbhl_space_2$.getDynamicValue(thread))) : sbhl_marking_vars.$sbhl_space_1$.getDynamicValue(thread), thread);
                                                                if (NIL == result) {
                                                                    {
                                                                        SubLObject catch_var = NIL;
                                                                        try {
                                                                            {
                                                                                SubLObject col = NIL;
                                                                                SubLObject mark = NIL;
                                                                                {
                                                                                    final Iterator cdohash_iterator = getEntrySetIterator(map_table);
                                                                                    try {
                                                                                        while (iteratorHasNext(cdohash_iterator)) {
                                                                                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                                                            col = getEntryKey(cdohash_entry);
                                                                                            mark = getEntryValue(cdohash_entry);
                                                                                            subl_macros.do_hash_table_done_check(result);
                                                                                            result = com.cyc.cycjava.cycl.sdc.gather_any_genls_sdc_exception(col);
                                                                                        } 
                                                                                    } finally {
                                                                                        releaseEntrySetIterator(cdohash_iterator);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } catch (Throwable ccatch_env_var) {
                                                                            catch_var = Errors.handleThrowable(ccatch_env_var, $DO_HASH_TABLE);
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                sbhl_marking_vars.$sbhl_goal_table$.rebind(_prev_bind_0_39, thread);
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_38, thread);
                                                    sbhl_marking_vars.$sbhl_space_2$.rebind(_prev_bind_0_37, thread);
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
                                sbhl_marking_vars.$sbhl_space_1$.rebind(_prev_bind_0_32, thread);
                            }
                        }
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                    } finally {
                        sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1, thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @return listp; returns the first pair of genls, one c1's genl one c2's genl, which have a sibling disjoint exception.
     */
    @LispMethod(comment = "@return listp; returns the first pair of genls, one c1\'s genl one c2\'s genl, which have a sibling disjoint exception.")
    public static SubLObject any_remote_sdc_exception_pair(final SubLObject c1, final SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
            sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject _prev_bind_0_$47 = sbhl_marking_vars.$sbhl_space_1$.currentBinding(thread);
                final SubLObject _prev_bind_1_$48 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space_1$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                    sbhl_marking_methods.sbhl_mark_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), c1, mt, UNPROVIDED);
                    final SubLObject resourcing_p_$49 = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                    final SubLObject _prev_bind_0_$48 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$49 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                        sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject _prev_bind_0_$49 = sbhl_marking_vars.$sbhl_space_2$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$50 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_space_2$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p_$49, thread);
                                sbhl_marking_methods.sbhl_mark_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), c2, mt, UNPROVIDED);
                                final SubLObject map_table = (hash_table_count(sbhl_marking_vars.$sbhl_space_1$.getDynamicValue(thread)).numG(hash_table_count(sbhl_marking_vars.$sbhl_space_2$.getDynamicValue(thread)))) ? sbhl_marking_vars.$sbhl_space_2$.getDynamicValue(thread) : sbhl_marking_vars.$sbhl_space_1$.getDynamicValue(thread);
                                final SubLObject _prev_bind_0_$50 = sbhl_marking_vars.$sbhl_goal_table$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_goal_table$.bind(map_table.eql(sbhl_marking_vars.$sbhl_space_1$.getDynamicValue(thread)) ? sbhl_marking_vars.$sbhl_space_2$.getDynamicValue(thread) : sbhl_marking_vars.$sbhl_space_1$.getDynamicValue(thread), thread);
                                    if (NIL == result) {
                                        SubLObject catch_var = NIL;
                                        try {
                                            thread.throwStack.push($DO_HASH_TABLE);
                                            SubLObject col = NIL;
                                            SubLObject mark = NIL;
                                            final Iterator cdohash_iterator = getEntrySetIterator(map_table);
                                            try {
                                                while (iteratorHasNext(cdohash_iterator)) {
                                                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                    col = getEntryKey(cdohash_entry);
                                                    mark = getEntryValue(cdohash_entry);
                                                    subl_macros.do_hash_table_done_check(result);
                                                    result = gather_any_genls_sdc_exception(col);
                                                } 
                                            } finally {
                                                releaseEntrySetIterator(cdohash_iterator);
                                            }
                                        } catch (final Throwable ccatch_env_var) {
                                            catch_var = Errors.handleThrowable(ccatch_env_var, $DO_HASH_TABLE);
                                        } finally {
                                            thread.throwStack.pop();
                                        }
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_goal_table$.rebind(_prev_bind_0_$50, thread);
                                }
                            } finally {
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$50, thread);
                                sbhl_marking_vars.$sbhl_space_2$.rebind(_prev_bind_0_$49, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$51 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$51, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$49, thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$48, thread);
                    }
                } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$48, thread);
                    sbhl_marking_vars.$sbhl_space_1$.rebind(_prev_bind_0_$47, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$52 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject gather_any_genls_sdc_exception_alt(SubLObject col) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $mapping_answer$.currentBinding(thread);
                    try {
                        $mapping_answer$.bind(NIL, thread);
                        {
                            SubLObject _prev_bind_0_40 = $mapping_gather_arg$.currentBinding(thread);
                            try {
                                $mapping_gather_arg$.bind(TWO_INTEGER, thread);
                                kb_mapping.map_gaf_arg_index(symbol_function(GATHER_DIRECT_SDC_EXCEPTION), col, ONE_INTEGER, $$siblingDisjointExceptions, UNPROVIDED, UNPROVIDED);
                            } finally {
                                $mapping_gather_arg$.rebind(_prev_bind_0_40, thread);
                            }
                        }
                        if (NIL == $mapping_answer$.getDynamicValue(thread)) {
                            {
                                SubLObject _prev_bind_0_41 = $mapping_gather_arg$.currentBinding(thread);
                                try {
                                    $mapping_gather_arg$.bind(ONE_INTEGER, thread);
                                    kb_mapping.map_gaf_arg_index(symbol_function(GATHER_DIRECT_SDC_EXCEPTION), col, TWO_INTEGER, $$siblingDisjointExceptions, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    $mapping_gather_arg$.rebind(_prev_bind_0_41, thread);
                                }
                            }
                        }
                        if (NIL != $mapping_answer$.getDynamicValue(thread)) {
                            result = list(col, $mapping_answer$.getDynamicValue(thread));
                        }
                    } finally {
                        $mapping_answer$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject gather_any_genls_sdc_exception(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $mapping_answer$.currentBinding(thread);
        try {
            $mapping_answer$.bind(NIL, thread);
            final SubLObject _prev_bind_0_$57 = $mapping_gather_arg$.currentBinding(thread);
            try {
                $mapping_gather_arg$.bind(TWO_INTEGER, thread);
                kb_mapping.map_gaf_arg_index(symbol_function(GATHER_DIRECT_SDC_EXCEPTION), col, ONE_INTEGER, $$siblingDisjointExceptions, UNPROVIDED, UNPROVIDED);
                kb_mapping.map_gaf_arg_index(symbol_function(GATHER_DIRECT_SDC_EXCEPTION), col, ONE_INTEGER, $$rewriteOf, UNPROVIDED, UNPROVIDED);
            } finally {
                $mapping_gather_arg$.rebind(_prev_bind_0_$57, thread);
            }
            if (NIL == $mapping_answer$.getDynamicValue(thread)) {
                final SubLObject _prev_bind_0_$58 = $mapping_gather_arg$.currentBinding(thread);
                try {
                    $mapping_gather_arg$.bind(ONE_INTEGER, thread);
                    kb_mapping.map_gaf_arg_index(symbol_function(GATHER_DIRECT_SDC_EXCEPTION), col, TWO_INTEGER, $$siblingDisjointExceptions, UNPROVIDED, UNPROVIDED);
                    kb_mapping.map_gaf_arg_index(symbol_function(GATHER_DIRECT_SDC_EXCEPTION), col, TWO_INTEGER, $$rewriteOf, UNPROVIDED, UNPROVIDED);
                } finally {
                    $mapping_gather_arg$.rebind(_prev_bind_0_$58, thread);
                }
            }
            if (NIL != $mapping_answer$.getDynamicValue(thread)) {
                result = list(col, $mapping_answer$.getDynamicValue(thread));
            }
        } finally {
            $mapping_answer$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject gather_direct_sdc_exception_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject col = assertions_high.gaf_arg(assertion, $mapping_gather_arg$.getDynamicValue(thread));
                if (NIL != sbhl_marking_methods.sbhl_recorded_node_p(col, sbhl_marking_vars.$sbhl_goal_table$.getDynamicValue(thread))) {
                    $mapping_answer$.setDynamicValue(col, thread);
                    mapping_finished();
                }
            }
            return NIL;
        }
    }

    public static SubLObject gather_direct_sdc_exception(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject col = assertions_high.gaf_arg(assertion, $mapping_gather_arg$.getDynamicValue(thread));
        if (NIL != sbhl_marking_methods.sbhl_recorded_node_p(col, sbhl_marking_vars.$sbhl_goal_table$.getDynamicValue(thread))) {
            $mapping_answer$.setDynamicValue(col, thread);
            mapping_finished();
        }
        return NIL;
    }

    public static final SubLObject sdc_common_specP_alt(SubLObject c1, SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $sdc_common_spec_exceptionP$.getDynamicValue(thread)) {
                return com.cyc.cycjava.cycl.sdc.remote_sdc_common_specP(c1, c2, mt);
            }
            return NIL;
        }
    }

    public static SubLObject sdc_common_specP(final SubLObject c1, final SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $sdc_common_spec_exceptionP$.getDynamicValue(thread)) {
            return remote_sdc_common_specP(c1, c2, mt);
        }
        return NIL;
    }

    public static final SubLObject remote_sdc_common_specP_alt(SubLObject c1, SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return genls.floor_of_col_pairP(c1, c2, mt);
    }

    public static SubLObject remote_sdc_common_specP(final SubLObject c1, final SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return genls.floor_of_col_pairP(c1, c2, mt);
    }

    public static final SubLObject sdct_elements_alt(SubLObject cols, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = cols;
            SubLObject col = NIL;
            for (col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.sdc.sdct_elementP(col, mt)) {
                    result = cons(col, result);
                }
            }
            return nreverse(result);
        }
    }

    public static SubLObject sdct_elements(final SubLObject cols, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var = cols;
        SubLObject col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != sdct_elementP(col, mt)) {
                result = cons(col, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static final SubLObject cols_with_applicable_sdct_alt(SubLObject cols, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = cols;
            SubLObject col = NIL;
            for (col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.sdc.applicable_sdctP(col, mt)) {
                    result = cons(col, result);
                }
            }
            return nreverse(result);
        }
    }

    public static SubLObject cols_with_applicable_sdct(final SubLObject cols, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var = cols;
        SubLObject col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != applicable_sdctP(col, mt)) {
                result = cons(col, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    /**
     * don't claim sibling-disjoint when stating that c1 has superset c2
     */
    @LispMethod(comment = "don\'t claim sibling-disjoint when stating that c1 has superset c2")
    public static final SubLObject establishing_supersetP_alt(SubLObject c1, SubLObject c2, SubLObject mt, SubLObject assertion) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (assertion == UNPROVIDED) {
            assertion = sbhl_link_vars.$added_assertion$.getDynamicValue();
        }
        if (NIL != assertion) {
            {
                SubLObject axiom = assertions_high.assertion_formula(assertion);
                SubLObject truth = assertions_high.assertion_truth(assertion);
                SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
                SubLObject a1 = second(axiom);
                SubLObject a2 = third(axiom);
                return makeBoolean(((((NIL != genls_litP(axiom)) && (truth == $TRUE)) && (NIL != mt_relevance_macros.relevant_mtP(assertion_mt))) && (NIL != genls.genlP(c1, a1, mt, UNPROVIDED))) && (NIL != genls.genlP(a2, c2, mt, UNPROVIDED)));
            }
        } else {
            if ((NIL != wff_macros.within_wffP()) && (NIL != within_assertP())) {
                {
                    SubLObject formula = wff_vars.wff_formula();
                    return makeBoolean((((((NIL != genls_litP(formula)) && (NIL == el_negation_p(formula))) && (NIL != forts.fort_p(literal_arg1(formula, UNPROVIDED)))) && (NIL != forts.fort_p(literal_arg2(formula, UNPROVIDED)))) && (NIL != genls.genlP(c1, literal_arg1(formula, UNPROVIDED), UNPROVIDED, UNPROVIDED))) && (NIL != genls.genlP(literal_arg2(formula, UNPROVIDED), c2, UNPROVIDED, UNPROVIDED)));
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "don\'t claim sibling-disjoint when stating that c1 has superset c2")
    public static SubLObject establishing_supersetP(final SubLObject c1, final SubLObject c2, SubLObject mt, SubLObject assertion) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (assertion == UNPROVIDED) {
            assertion = sbhl_link_vars.$added_assertion$.getDynamicValue();
        }
        if (NIL != within_assertP()) {
            return NIL;
        }
        if (NIL != assertion) {
            final SubLObject axiom = assertions_high.assertion_formula(assertion);
            final SubLObject truth = assertions_high.assertion_truth(assertion);
            final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
            final SubLObject a1 = second(axiom);
            final SubLObject a2 = third(axiom);
            return makeBoolean(((((NIL != genls_litP(axiom)) && (truth == $TRUE)) && (NIL != mt_relevance_macros.relevant_mtP(assertion_mt))) && (NIL != genls.genlP(c1, a1, mt, UNPROVIDED))) && (NIL != genls.genlP(a2, c2, mt, UNPROVIDED)));
        }
        if ((NIL != wff_macros.within_wffP()) && (NIL != within_assertP())) {
            final SubLObject formula = wff_vars.wff_formula();
            return makeBoolean((((((NIL != genls_litP(formula)) && (NIL == el_negation_p(formula))) && (NIL != forts.fort_p(literal_arg1(formula, UNPROVIDED)))) && (NIL != forts.fort_p(literal_arg2(formula, UNPROVIDED)))) && (NIL != genls.genlP(c1, literal_arg1(formula, UNPROVIDED), UNPROVIDED, UNPROVIDED))) && (NIL != genls.genlP(literal_arg2(formula, UNPROVIDED), c2, UNPROVIDED, UNPROVIDED)));
        }
        return NIL;
    }/**
     * don't claim sibling-disjoint when stating that c1 has superset c2
     */


    /**
     * don't claim sibling-disjoint when stating
     * that a common spec of c1 and c2 has an instance
     * (e.g., printer-copier)
     */
    @LispMethod(comment = "don\'t claim sibling-disjoint when stating\r\nthat a common spec of c1 and c2 has an instance\r\n(e.g., printer-copier)\ndon\'t claim sibling-disjoint when stating\nthat a common spec of c1 and c2 has an instance\n(e.g., printer-copier)")
    public static final SubLObject establishing_instance_ofP_alt(SubLObject c1, SubLObject c2, SubLObject mt, SubLObject assertion) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (assertion == UNPROVIDED) {
            assertion = sbhl_link_vars.$added_assertion$.getDynamicValue();
        }
        if (NIL != assertion) {
            {
                SubLObject axiom = assertions_high.assertion_formula(assertion);
                SubLObject truth = assertions_high.assertion_truth(assertion);
                SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
                SubLObject a1 = second(axiom);
                SubLObject a2 = third(axiom);
                return makeBoolean(((((NIL != isa_litP(axiom)) && (truth == $TRUE)) && (NIL != mt_relevance_macros.relevant_mtP(assertion_mt))) && (NIL != genls.genlP(a2, c1, mt, UNPROVIDED))) && (NIL != genls.genlP(a2, c2, mt, UNPROVIDED)));
            }
        }
        return NIL;
    }

    @LispMethod(comment = "don\'t claim sibling-disjoint when stating\r\nthat a common spec of c1 and c2 has an instance\r\n(e.g., printer-copier)\ndon\'t claim sibling-disjoint when stating\nthat a common spec of c1 and c2 has an instance\n(e.g., printer-copier)")
    public static SubLObject establishing_instance_ofP(final SubLObject c1, final SubLObject c2, SubLObject mt, SubLObject assertion) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (assertion == UNPROVIDED) {
            assertion = sbhl_link_vars.$added_assertion$.getDynamicValue();
        }
        if (NIL != within_assertP()) {
            return NIL;
        }
        if (NIL != assertion) {
            final SubLObject axiom = assertions_high.assertion_formula(assertion);
            final SubLObject truth = assertions_high.assertion_truth(assertion);
            final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
            final SubLObject a1 = second(axiom);
            final SubLObject a2 = third(axiom);
            return makeBoolean(((((NIL != isa_litP(axiom)) && (truth == $TRUE)) && (NIL != mt_relevance_macros.relevant_mtP(assertion_mt))) && (NIL != genls.genlP(a2, c1, mt, UNPROVIDED))) && (NIL != genls.genlP(a2, c2, mt, UNPROVIDED)));
        }
        return NIL;
    }/**
     * don't claim sibling-disjoint when stating
     * that a common spec of c1 and c2 has an instance
     * (e.g., printer-copier)
     */


    /**
     * justiofication of (sdc? c1 c2)
     */
    @LispMethod(comment = "justiofication of (sdc? c1 c2)")
    public static final SubLObject why_sdcP_alt(SubLObject c1, SubLObject c2, SubLObject mt, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        if (behavior == $ASSERTION) {
            return com.cyc.cycjava.cycl.sdc.assemble_sdc_just(com.cyc.cycjava.cycl.sdc.why_sdcP(c1, c2, mt, UNPROVIDED));
        } else {
            return com.cyc.cycjava.cycl.sdc.any_just_of_sdc(c1, c2, mt);
        }
    }

    @LispMethod(comment = "justiofication of (sdc? c1 c2)")
    public static SubLObject why_sdcP(final SubLObject c1, final SubLObject c2, SubLObject mt, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        if (behavior == $ASSERTION) {
            return assemble_sdc_just(why_sdcP(c1, c2, mt, UNPROVIDED));
        }
        return any_just_of_sdc(c1, c2, mt);
    }/**
     * justiofication of (sdc? c1 c2)
     */


    public static final SubLObject assemble_sdc_just_alt(SubLObject justs) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = justs;
            SubLObject just = NIL;
            for (just = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , just = cdolist_list_var.first()) {
                {
                    SubLObject gaf = just.first();
                    SubLObject ass = NIL;
                    if (NIL != gaf) {
                        ass = kb_indexing.find_gaf_possibly_in_mt(gaf, UNPROVIDED);
                    }
                    if (NIL != ass) {
                        result = cons(ass, result);
                    } else {
                        result = cons(arguments.make_hl_support($OPAQUE, just.first(), UNPROVIDED, UNPROVIDED), result);
                    }
                }
            }
            return nreverse(result);
        }
    }

    public static SubLObject assemble_sdc_just(final SubLObject justs) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = justs;
        SubLObject just = NIL;
        just = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != arguments.hl_support_p(just)) {
                result = cons(just, result);
            } else {
                final SubLObject gaf = just.first();
                SubLObject ass = NIL;
                if (NIL != gaf) {
                    ass = kb_indexing.find_gaf_possibly_in_mt(gaf, UNPROVIDED);
                }
                if (NIL != ass) {
                    result = cons(ass, result);
                } else {
                    result = cons(arguments.make_hl_support($OPAQUE, just.first(), UNPROVIDED, UNPROVIDED), result);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            just = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    /**
     * find a path establishing <c1> is sibling-disjoint with <c2> within <mt>
     */
    @LispMethod(comment = "find a path establishing <c1> is sibling-disjoint with <c2> within <mt>")
    public static final SubLObject any_just_of_sdc_alt(SubLObject c1, SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL == forts.fort_p(c1)) {
            {
                SubLObject c1_nart = narts_high.find_nart(c1);
                if (NIL != c1_nart) {
                    return com.cyc.cycjava.cycl.sdc.any_just_of_sdc(c1_nart, c2, mt);
                }
                return NIL;
            }
        } else {
            if (NIL == forts.fort_p(c2)) {
                {
                    SubLObject c2_nart = narts_high.find_nart(c2);
                    if (NIL != c2_nart) {
                        return com.cyc.cycjava.cycl.sdc.any_just_of_sdc(c1, c2_nart, mt);
                    }
                }
            } else {
                {
                    SubLObject sdct = com.cyc.cycjava.cycl.sdc.any_isa_common_sdct(c1, c2, mt, UNPROVIDED);
                    if (NIL == sdct) {
                        return NIL;
                    } else {
                        if (NIL != genls.genlP(c1, c2, mt, UNPROVIDED)) {
                            return NIL;
                        } else {
                            if (NIL != genls.genlP(c2, c1, mt, UNPROVIDED)) {
                                return NIL;
                            } else {
                                if (NIL != com.cyc.cycjava.cycl.sdc.establishing_supersetP(c1, c2, mt, UNPROVIDED)) {
                                    return NIL;
                                } else {
                                    if (NIL != com.cyc.cycjava.cycl.sdc.establishing_supersetP(c2, c1, mt, UNPROVIDED)) {
                                        return NIL;
                                    } else {
                                        if (NIL != com.cyc.cycjava.cycl.sdc.establishing_instance_ofP(c1, c2, mt, UNPROVIDED)) {
                                            return NIL;
                                        } else {
                                            return nconc(com.cyc.cycjava.cycl.sdc.any_just_of_isa_sdct(c1, sdct, mt), com.cyc.cycjava.cycl.sdc.any_just_of_isa_sdct(c2, sdct, mt), isa.any_just_of_isa(sdct, $$SiblingDisjointCollectionType, mt));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "find a path establishing <c1> is sibling-disjoint with <c2> within <mt>")
    public static SubLObject any_just_of_sdc(final SubLObject c1, final SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL == forts.fort_p(c1)) {
            final SubLObject c1_nart = narts_high.find_nart(c1);
            if (NIL != c1_nart) {
                return any_just_of_sdc(c1_nart, c2, mt);
            }
            return NIL;
        } else
            if (NIL == forts.fort_p(c2)) {
                final SubLObject c2_nart = narts_high.find_nart(c2);
                if (NIL != c2_nart) {
                    return any_just_of_sdc(c1, c2_nart, mt);
                }
                return NIL;
            } else {
                final SubLObject sdct = any_isa_common_sdct(c1, c2, mt, UNPROVIDED);
                if (NIL == sdct) {
                    return NIL;
                }
                if (NIL != genls.genlP(c1, c2, mt, UNPROVIDED)) {
                    return NIL;
                }
                if (NIL != genls.genlP(c2, c1, mt, UNPROVIDED)) {
                    return NIL;
                }
                if (NIL != establishing_supersetP(c1, c2, mt, UNPROVIDED)) {
                    return NIL;
                }
                if (NIL != establishing_supersetP(c2, c1, mt, UNPROVIDED)) {
                    return NIL;
                }
                if (NIL != establishing_instance_ofP(c1, c2, mt, UNPROVIDED)) {
                    return NIL;
                }
                return nconc(any_just_of_isa_sdct(c1, sdct, mt), any_just_of_isa_sdct(c2, sdct, mt), isa.any_just_of_isa(sdct, $$SiblingDisjointCollectionType, mt));
            }

    }/**
     * find a path establishing <c1> is sibling-disjoint with <c2> within <mt>
     */


    public static final SubLObject any_just_of_isa_sdct_alt(SubLObject col, SubLObject sdct, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject genl = genls.any_genl_isa(col, sdct, mt, UNPROVIDED);
            if (genl.eql(col)) {
                return isa.any_just_of_isa(col, sdct, mt);
            } else {
                return nconc(genls.why_genlP(col, genl, mt, UNPROVIDED, UNPROVIDED), isa.any_just_of_isa(genl, sdct, mt));
            }
        }
    }

    public static SubLObject any_just_of_isa_sdct(final SubLObject col, final SubLObject sdct, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject genl = genls.any_genl_isa(col, sdct, mt, UNPROVIDED);
        if (genl.eql(col)) {
            return isa.any_just_of_isa(col, sdct, mt);
        }
        return nconc(genls.why_genlP(col, genl, mt, UNPROVIDED, UNPROVIDED), isa.any_just_of_isa(genl, sdct, mt));
    }

    public static final SubLObject why_sdc_exceptionP_alt(SubLObject c1, SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject why = com.cyc.cycjava.cycl.sdc.why_declared_sdc_exceptionP(c1, c2, mt);
            if (NIL == why) {
                why = com.cyc.cycjava.cycl.sdc.why_sdc_common_specP(c1, c2, mt);
            }
            return why;
        }
    }

    public static SubLObject why_sdc_exceptionP(final SubLObject c1, final SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject why = why_declared_sdc_exceptionP(c1, c2, mt);
        if (NIL == why) {
            why = why_sdc_common_specP(c1, c2, mt);
        }
        return why;
    }

    public static final SubLObject why_declared_sdc_exceptionP_alt(SubLObject c1, SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $sdc_exception_transfers_thru_specsP$.getDynamicValue(thread)) {
                return com.cyc.cycjava.cycl.sdc.why_remote_sdc_exceptionP(c1, c2, mt);
            } else {
                return com.cyc.cycjava.cycl.sdc.why_direct_sdc_exceptionP(c1, c2, mt);
            }
        }
    }

    public static SubLObject why_declared_sdc_exceptionP(final SubLObject c1, final SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $sdc_exception_transfers_thru_specsP$.getDynamicValue(thread)) {
            return why_remote_sdc_exceptionP(c1, c2, mt);
        }
        return why_direct_sdc_exceptionP(c1, c2, mt);
    }

    public static final SubLObject why_direct_sdc_exceptionP_alt(SubLObject c1, SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts($$siblingDisjointExceptions, c1, c2, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return list(list(make_binary_formula($$siblingDisjointExceptions, c1, c2), $TRUE));
        } else {
            if (NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts($$siblingDisjointExceptions, c2, c1, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return list(list(make_binary_formula($$siblingDisjointExceptions, c2, c1), $TRUE));
            }
        }
        return NIL;
    }

    public static SubLObject why_direct_sdc_exceptionP(final SubLObject c1, final SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts($$siblingDisjointExceptions, c1, c2, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return list(list(make_binary_formula($$siblingDisjointExceptions, c1, c2), $TRUE));
        }
        if (NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts($$siblingDisjointExceptions, c2, c1, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return list(list(make_binary_formula($$siblingDisjointExceptions, c2, c1), $TRUE));
        }
        if (NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts($$rewriteOf, c1, c2, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return list(list(make_binary_formula($$rewriteOf, c1, c2), $TRUE));
        }
        if (NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts($$rewriteOf, c2, c1, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return list(list(make_binary_formula($$rewriteOf, c2, c1), $TRUE));
        }
        return NIL;
    }

    public static final SubLObject why_remote_sdc_exceptionP_alt(SubLObject c1, SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject source = genls.shallowest_col(c1, c2);
            SubLObject target = (source == c1) ? ((SubLObject) (c2)) : c1;
            SubLObject remote_pair = com.cyc.cycjava.cycl.sdc.any_remote_sdc_exception_pair(source, target, mt);
            if (NIL != remote_pair) {
                {
                    SubLObject datum = remote_pair;
                    SubLObject current = datum;
                    SubLObject spec1 = NIL;
                    SubLObject spec2 = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt39);
                    spec1 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt39);
                    spec2 = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        return nconc(spec1 == source ? ((SubLObject) (NIL)) : genls.why_genlP(source, spec1, mt, UNPROVIDED, UNPROVIDED), spec2 == target ? ((SubLObject) (NIL)) : genls.why_genlP(target, spec2, mt, UNPROVIDED, UNPROVIDED), com.cyc.cycjava.cycl.sdc.why_direct_sdc_exceptionP(spec1, spec2, mt));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt39);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject why_remote_sdc_exceptionP(final SubLObject c1, final SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject source = genls.shallowest_col(c1, c2);
        final SubLObject target = (source.eql(c1)) ? c2 : c1;
        final SubLObject remote_pair = any_remote_sdc_exception_pair(source, target, mt);
        if (NIL != remote_pair) {
            SubLObject current;
            final SubLObject datum = current = remote_pair;
            SubLObject spec1 = NIL;
            SubLObject spec2 = NIL;
            destructuring_bind_must_consp(current, datum, $list39);
            spec1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list39);
            spec2 = current.first();
            current = current.rest();
            if (NIL == current) {
                return nconc(spec1.eql(source) ? NIL : genls.why_genlP(source, spec1, mt, UNPROVIDED, UNPROVIDED), spec2.eql(target) ? NIL : genls.why_genlP(target, spec2, mt, UNPROVIDED, UNPROVIDED), why_direct_sdc_exceptionP(spec1, spec2, mt));
            }
            cdestructuring_bind_error(datum, $list39);
        }
        return NIL;
    }

    public static final SubLObject why_sdc_common_specP_alt(SubLObject c1, SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $sdc_common_spec_exceptionP$.getDynamicValue(thread)) {
                return com.cyc.cycjava.cycl.sdc.why_remote_common_specP(c1, c2, mt);
            }
            return NIL;
        }
    }

    public static SubLObject why_sdc_common_specP(final SubLObject c1, final SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $sdc_common_spec_exceptionP$.getDynamicValue(thread)) {
            return why_remote_common_specP(c1, c2, mt);
        }
        return NIL;
    }

    public static final SubLObject why_remote_common_specP_alt(SubLObject c1, SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject spec = genls.any_floor_of_col_pair(c1, c2, mt, UNPROVIDED);
            SubLObject pcase_var = spec;
            if (pcase_var.eql(C1)) {
                return genls.why_genlP(spec, c2, mt, UNPROVIDED, UNPROVIDED);
            } else {
                if (pcase_var.eql(C2)) {
                    return genls.why_genlP(spec, c1, mt, UNPROVIDED, UNPROVIDED);
                } else {
                    return nconc(genls.why_genlP(spec, c1, mt, UNPROVIDED, UNPROVIDED), genls.why_genlP(spec, c2, mt, UNPROVIDED, UNPROVIDED));
                }
            }
        }
    }

    public static SubLObject why_remote_common_specP(final SubLObject c1, final SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject pcase_var;
        final SubLObject spec = pcase_var = genls.any_floor_of_col_pair(c1, c2, mt, UNPROVIDED);
        if (pcase_var.eql(C1)) {
            return genls.why_genlP(spec, c2, mt, UNPROVIDED, UNPROVIDED);
        }
        if (pcase_var.eql(C2)) {
            return genls.why_genlP(spec, c1, mt, UNPROVIDED, UNPROVIDED);
        }
        return nconc(genls.why_genlP(spec, c1, mt, UNPROVIDED, UNPROVIDED), genls.why_genlP(spec, c2, mt, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject isa_common_sdctP_alt(SubLObject c1, SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.sdc.any_isa_common_sdct(c1, c2, mt, UNPROVIDED));
    }

    public static SubLObject isa_common_sdctP(final SubLObject c1, final SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return list_utilities.sublisp_boolean(any_isa_common_sdct(c1, c2, mt, UNPROVIDED));
    }

    public static final SubLObject isa_common_sdct_amongP_alt(SubLObject c1s, SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.sdc.any_isa_common_sdct_among(c1s, c2, mt, UNPROVIDED));
    }

    public static SubLObject isa_common_sdct_amongP(final SubLObject c1s, final SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return list_utilities.sublisp_boolean(any_isa_common_sdct_among(c1s, c2, mt, UNPROVIDED));
    }

    public static final SubLObject sdw_error_alt(SubLObject level, SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
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
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($sdw_trace_level$.getDynamicValue(thread).numGE(level)) {
                Errors.cerror($$$continue_anyway, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            } else {
                if (add(TWO_INTEGER, at_vars.$at_trace_level$.getDynamicValue(thread)).numGE(level)) {
                    Errors.warn(format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
                }
            }
            return NIL;
        }
    }

    public static SubLObject sdw_error(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
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
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($sdw_trace_level$.getDynamicValue(thread).numGE(level)) {
            Errors.cerror($$$continue_anyway, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
        } else
            if (add(TWO_INTEGER, at_vars.$at_trace_level$.getDynamicValue(thread)).numGE(level)) {
                Errors.warn(format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            }

        return NIL;
    }

    public static SubLObject declare_sdc_file() {
        declareFunction("ignoring_sdcP", "IGNORING-SDC?", 0, 0, false);
        declareFunction("relevant_sibling_disjoint_collection_p", "RELEVANT-SIBLING-DISJOINT-COLLECTION-P", 1, 0, false);
        declareMacro("with_sbhl_sd_marking_spaces", "WITH-SBHL-SD-MARKING-SPACES");
        declareMacro("with_sbhl_sd_genls_isas_spaces", "WITH-SBHL-SD-GENLS-ISAS-SPACES");
        declareFunction("any_isa_common_sdct", "ANY-ISA-COMMON-SDCT", 2, 2, false);
        declareFunction("any_isa_common_sdct_among", "ANY-ISA-COMMON-SDCT-AMONG", 2, 2, false);
        declareFunction("sbhl_mark_sd_c1_genls_and_non_c2_genls_isas", "SBHL-MARK-SD-C1-GENLS-AND-NON-C2-GENLS-ISAS", 2, 0, false);
        declareFunction("sbhl_mark_sd_c1s_genls_and_non_c2_genls_isas", "SBHL-MARK-SD-C1S-GENLS-AND-NON-C2-GENLS-ISAS", 2, 0, false);
        declareFunction("sbhl_mark_sd_genls_isas", "SBHL-MARK-SD-GENLS-ISAS", 1, 0, false);
        new sdc.$sbhl_mark_sd_genls_isas$UnaryFunction();
        declareFunction("sbhl_gather_first_sd_or_store_sd_candidates", "SBHL-GATHER-FIRST-SD-OR-STORE-SD-CANDIDATES", 1, 0, false);
        declareFunction("sbhl_gather_sd_candidates", "SBHL-GATHER-SD-CANDIDATES", 1, 0, false);
        new sdc.$sbhl_gather_sd_candidates$UnaryFunction();
        declareFunction("sbhl_determine_sd_and_store_candidates", "SBHL-DETERMINE-SD-AND-STORE-CANDIDATES", 1, 0, false);
        new sdc.$sbhl_determine_sd_and_store_candidates$UnaryFunction();
        declareFunction("clear_cached_sbhl_sd_relevant_c2_genl_isa_candidateP", "CLEAR-CACHED-SBHL-SD-RELEVANT-C2-GENL-ISA-CANDIDATE?", 0, 0, false);
        declareFunction("remove_cached_sbhl_sd_relevant_c2_genl_isa_candidateP", "REMOVE-CACHED-SBHL-SD-RELEVANT-C2-GENL-ISA-CANDIDATE?", 1, 0, false);
        declareFunction("cached_sbhl_sd_relevant_c2_genl_isa_candidateP_internal", "CACHED-SBHL-SD-RELEVANT-C2-GENL-ISA-CANDIDATE?-INTERNAL", 1, 0, false);
        declareFunction("cached_sbhl_sd_relevant_c2_genl_isa_candidateP", "CACHED-SBHL-SD-RELEVANT-C2-GENL-ISA-CANDIDATE?", 1, 0, false);
        declareFunction("sbhl_sd_relevant_c2_genl_isa_candidateP", "SBHL-SD-RELEVANT-C2-GENL-ISA-CANDIDATE?", 1, 0, false);
        declareFunction("sbhl_determine_sd_and_store_relevant_candidates", "SBHL-DETERMINE-SD-AND-STORE-RELEVANT-CANDIDATES", 1, 0, false);
        declareFunction("sbhl_determine_sd_path_with_no_exceptions", "SBHL-DETERMINE-SD-PATH-WITH-NO-EXCEPTIONS", 1, 0, false);
        declareFunction("sbhl_determine_sd_path_with_no_exceptions_among", "SBHL-DETERMINE-SD-PATH-WITH-NO-EXCEPTIONS-AMONG", 1, 0, false);
        declareFunction("any_sd_isa_path_excluding_exceptions_p", "ANY-SD-ISA-PATH-EXCLUDING-EXCEPTIONS-P", 3, 0, false);
        declareFunction("sbhl_sd_genls_and_genls_isa_path_p", "SBHL-SD-GENLS-AND-GENLS-ISA-PATH-P", 2, 0, false);
        declareFunction("sbhl_sd_goal_in_genls_isas_p", "SBHL-SD-GOAL-IN-GENLS-ISAS-P", 1, 0, false);
        declareFunction("sdc", "SDC", 1, 1, false);
        declareFunction("max_sdc", "MAX-SDC", 1, 1, false);
        declareFunction("all_sdc", "ALL-SDC", 1, 1, false);
        declareFunction("max_sdc_int", "MAX-SDC-INT", 1, 0, false);
        declareFunction("all_sdc_int", "ALL-SDC-INT", 1, 0, false);
        declareFunction("remote_sdc_wrt", "REMOTE-SDC-WRT", 2, 1, false);
        declareFunction("isa_sdct", "ISA-SDCT", 1, 1, false);
        declareFunction("max_isa_sdct", "MAX-ISA-SDCT", 1, 1, false);
        declareFunction("applicable_sdct", "APPLICABLE-SDCT", 1, 1, false);
        declareFunction("gather_sdct_isas", "GATHER-SDCT-ISAS", 1, 0, false);
        declareFunction("gather_if_sdctP", "GATHER-IF-SDCT?", 1, 0, false);
        declareFunction("all_isa_sdct", "ALL-ISA-SDCT", 1, 1, false);
        declareFunction("clear_cached_all_isa_sdct", "CLEAR-CACHED-ALL-ISA-SDCT", 0, 0, false);
        declareFunction("remove_cached_all_isa_sdct", "REMOVE-CACHED-ALL-ISA-SDCT", 2, 0, false);
        declareFunction("cached_all_isa_sdct_internal", "CACHED-ALL-ISA-SDCT-INTERNAL", 2, 0, false);
        declareFunction("cached_all_isa_sdct", "CACHED-ALL-ISA-SDCT", 2, 0, false);
        declareFunction("union_all_isa_sdct", "UNION-ALL-ISA-SDCT", 1, 1, false);
        declareFunction("sdc_elementP", "SDC-ELEMENT?", 1, 1, false);
        declareFunction("sdct_elementP", "SDCT-ELEMENT?", 1, 1, false);
        declareFunction("safe_sdct_elementP", "SAFE-SDCT-ELEMENT?", 1, 1, false);
        declareFunction("applicable_sdctP", "APPLICABLE-SDCT?", 1, 1, false);
        declareFunction("sdcP", "SDC?", 2, 1, false);
        declareFunction("sdc_intP", "SDC-INT?", 2, 0, false);
        declareFunction("any_sdc_wrtP", "ANY-SDC-WRT?", 2, 1, false);
        new sdc.$any_sdc_wrtP$BinaryFunction();
        declareFunction("any_sdc_wrt", "ANY-SDC-WRT", 2, 1, false);
        declareFunction("any_sdc_anyP", "ANY-SDC-ANY?", 2, 1, false);
        declareFunction("any_sdc_any", "ANY-SDC-ANY", 2, 1, false);
        declareFunction("sdc_exceptions", "SDC-EXCEPTIONS", 1, 1, false);
        declareFunction("sdc_exceptions_int", "SDC-EXCEPTIONS-INT", 1, 1, false);
        declareFunction("clear_cached_sdc_exceptions", "CLEAR-CACHED-SDC-EXCEPTIONS", 0, 0, false);
        declareFunction("remove_cached_sdc_exceptions", "REMOVE-CACHED-SDC-EXCEPTIONS", 1, 0, false);
        declareFunction("cached_sdc_exceptions_internal", "CACHED-SDC-EXCEPTIONS-INTERNAL", 1, 0, false);
        declareFunction("cached_sdc_exceptions", "CACHED-SDC-EXCEPTIONS", 1, 0, false);
        declareFunction("declared_sdc_exceptions", "DECLARED-SDC-EXCEPTIONS", 1, 1, false);
        declareFunction("sdc_exceptions_of_genls", "SDC-EXCEPTIONS-OF-GENLS", 1, 1, false);
        declareFunction("gather_direct_sdc_exceptions", "GATHER-DIRECT-SDC-EXCEPTIONS", 1, 0, false);
        declareFunction("direct_sdc_exceptions", "DIRECT-SDC-EXCEPTIONS", 1, 1, false);
        declareFunction("direct_sdc_exceptionP", "DIRECT-SDC-EXCEPTION?", 2, 1, false);
        declareFunction("collections_sharing_specs", "COLLECTIONS-SHARING-SPECS", 1, 1, false);
        declareFunction("sdc_exceptionP", "SDC-EXCEPTION?", 2, 1, false);
        declareFunction("declared_sdc_exceptionP", "DECLARED-SDC-EXCEPTION?", 2, 1, false);
        declareFunction("remote_sdc_exceptionP", "REMOTE-SDC-EXCEPTION?", 2, 1, false);
        declareFunction("any_remote_sdc_exception_pair", "ANY-REMOTE-SDC-EXCEPTION-PAIR", 2, 1, false);
        declareFunction("gather_any_genls_sdc_exception", "GATHER-ANY-GENLS-SDC-EXCEPTION", 1, 0, false);
        declareFunction("gather_direct_sdc_exception", "GATHER-DIRECT-SDC-EXCEPTION", 1, 0, false);
        declareFunction("sdc_common_specP", "SDC-COMMON-SPEC?", 2, 1, false);
        declareFunction("remote_sdc_common_specP", "REMOTE-SDC-COMMON-SPEC?", 2, 1, false);
        declareFunction("sdct_elements", "SDCT-ELEMENTS", 1, 1, false);
        declareFunction("cols_with_applicable_sdct", "COLS-WITH-APPLICABLE-SDCT", 1, 1, false);
        declareFunction("establishing_supersetP", "ESTABLISHING-SUPERSET?", 2, 2, false);
        declareFunction("establishing_instance_ofP", "ESTABLISHING-INSTANCE-OF?", 2, 2, false);
        declareFunction("why_sdcP", "WHY-SDC?", 2, 2, false);
        declareFunction("assemble_sdc_just", "ASSEMBLE-SDC-JUST", 1, 0, false);
        declareFunction("any_just_of_sdc", "ANY-JUST-OF-SDC", 2, 1, false);
        declareFunction("any_just_of_isa_sdct", "ANY-JUST-OF-ISA-SDCT", 2, 1, false);
        declareFunction("why_sdc_exceptionP", "WHY-SDC-EXCEPTION?", 2, 1, false);
        declareFunction("why_declared_sdc_exceptionP", "WHY-DECLARED-SDC-EXCEPTION?", 2, 1, false);
        declareFunction("why_direct_sdc_exceptionP", "WHY-DIRECT-SDC-EXCEPTION?", 2, 1, false);
        declareFunction("why_remote_sdc_exceptionP", "WHY-REMOTE-SDC-EXCEPTION?", 2, 1, false);
        declareFunction("why_sdc_common_specP", "WHY-SDC-COMMON-SPEC?", 2, 1, false);
        declareFunction("why_remote_common_specP", "WHY-REMOTE-COMMON-SPEC?", 2, 1, false);
        declareFunction("isa_common_sdctP", "ISA-COMMON-SDCT?", 2, 1, false);
        declareFunction("isa_common_sdct_amongP", "ISA-COMMON-SDCT-AMONG?", 2, 1, false);
        declareFunction("sdw_error", "SDW-ERROR", 2, 5, false);
        return NIL;
    }

    public static SubLObject init_sdc_file() {
        defparameter("*SDC-EXCEPTION-TRANSFERS-THRU-SPECS?*", NIL);
        defparameter("*SDC-COMMON-SPEC-EXCEPTION?*", NIL);
        defparameter("*IGNORING-SDC?*", NIL);
        defparameter("*SD-C1-GENLS-SPACE*", NIL);
        defparameter("*SD-C2-GENLS-SPACE*", NIL);
        defparameter("*SD-GENLS-ISAS-SPACE*", NIL);
        defparameter("*SD-CANDIDATE-STORE*", NIL);
        defparameter("*SD-C2-GENL*", NIL);
        deflexical("*CACHED-SBHL-SD-RELEVANT-C2-GENL-ISA-CANDIDATE?-CACHING-STATE*", NIL);
        defparameter("*SBHL-SD-GENLS-ISAS-GOAL*", NIL);
        deflexical("*CACHED-ALL-ISA-SDCT-CACHING-STATE*", NIL);
        deflexical("*CACHED-SDC-EXCEPTIONS-CACHING-STATE*", NIL);
        defvar("*SDW-TRACE-LEVEL*", ONE_INTEGER);
        defvar("*SDW-TEST-LEVEL*", ONE_INTEGER);
        return NIL;
    }

    public static SubLObject setup_sdc_file() {
        memoization_state.note_globally_cached_function($sym19$CACHED_SBHL_SD_RELEVANT_C2_GENL_ISA_CANDIDATE_);
        memoization_state.note_globally_cached_function(CACHED_ALL_ISA_SDCT);
        memoization_state.note_globally_cached_function(CACHED_SDC_EXCEPTIONS);
        return NIL;
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
    }

    public static final class $sbhl_mark_sd_genls_isas$UnaryFunction extends UnaryFunction {
        public $sbhl_mark_sd_genls_isas$UnaryFunction() {
            super(extractFunctionNamed("SBHL-MARK-SD-GENLS-ISAS"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sbhl_mark_sd_genls_isas(arg1);
        }
    }

    public static final class $sbhl_gather_sd_candidates$UnaryFunction extends UnaryFunction {
        public $sbhl_gather_sd_candidates$UnaryFunction() {
            super(extractFunctionNamed("SBHL-GATHER-SD-CANDIDATES"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sbhl_gather_sd_candidates(arg1);
        }
    }

    public static final class $sbhl_determine_sd_and_store_candidates$UnaryFunction extends UnaryFunction {
        public $sbhl_determine_sd_and_store_candidates$UnaryFunction() {
            super(extractFunctionNamed("SBHL-DETERMINE-SD-AND-STORE-CANDIDATES"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sbhl_determine_sd_and_store_candidates(arg1);
        }
    }

    public static final class $any_sdc_wrtP$BinaryFunction extends BinaryFunction {
        public $any_sdc_wrtP$BinaryFunction() {
            super(extractFunctionNamed("ANY-SDC-WRT?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return any_sdc_wrtP(arg1, arg2, UNPROVIDED);
        }
    }

    static private final SubLString $str_alt7$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt12$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    public static final SubLSymbol $kw21$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLSymbol $sym24$GATHER_IF_SDCT_ = makeSymbol("GATHER-IF-SDCT?");

    private static final SubLSymbol SIBLING_DISJOINT_COLLECTION_P = makeSymbol("SIBLING-DISJOINT-COLLECTION-P");

    static private final SubLSymbol $sym29$SAFE_SDCT_ELEMENT_ = makeSymbol("SAFE-SDCT-ELEMENT?");

    static private final SubLList $list_alt39 = list(makeSymbol("SPEC1"), makeSymbol("SPEC2"));
}

/**
 * Total time: 1120 ms
 */
