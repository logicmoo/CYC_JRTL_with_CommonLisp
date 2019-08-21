package com.cyc.cycjava.cycl.sbhl;


import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class sbhl_search_what_mts extends SubLTranslatedFile {
    public static final SubLFile me = new sbhl_search_what_mts();

    public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts";

    public static final String myFingerPrint = "d9e878c866ace4bac79da620a3ea294156fb1d863530e23e40f65c634ca9b9e3";







    // defparameter
    // Store for path mts results for straightforward searches
    public static final SubLSymbol $sbhl_primary_what_mts_mt_paths$ = makeSymbol("*SBHL-PRIMARY-WHAT-MTS-MT-PATHS*");

    // defparameter
    // Store for inverse path mts results for straightforward searches
    public static final SubLSymbol $sbhl_primary_what_mts_inverse_mt_paths$ = makeSymbol("*SBHL-PRIMARY-WHAT-MTS-INVERSE-MT-PATHS*");

    // defparameter
    // Store for path mts results for searches which require two marking spaces
    public static final SubLSymbol $sbhl_secondary_what_mts_mt_paths$ = makeSymbol("*SBHL-SECONDARY-WHAT-MTS-MT-PATHS*");

    // defparameter
    /**
     * Store for inverse path mts results for searches which require two marking
     * spaces
     */
    public static final SubLSymbol $sbhl_secondary_what_mts_inverse_mt_paths$ = makeSymbol("*SBHL-SECONDARY-WHAT-MTS-INVERSE-MT-PATHS*");

    // defparameter
    public static final SubLSymbol $sbhl_verify_naut_mt_relevance$ = makeSymbol("*SBHL-VERIFY-NAUT-MT-RELEVANCE*");





    // defparameter
    // The initial function to call for what-mts search.
    public static final SubLSymbol $sbhl_what_mts_behavior$ = makeSymbol("*SBHL-WHAT-MTS-BEHAVIOR*");

    // Internal Constants
    public static final SubLList $list0 = list(makeSymbol("MT"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $sbhl_path_mts$ = makeSymbol("*SBHL-PATH-MTS*");

    public static final SubLSymbol POSSIBLY_UPDATE_SBHL_PATH_MTS = makeSymbol("POSSIBLY-UPDATE-SBHL-PATH-MTS");

    public static final SubLList $list4 = list(makeSymbol("*SBHL-PATH-MTS*"));

    public static final SubLSymbol SBHL_REBIND_PATH_MTS = makeSymbol("SBHL-REBIND-PATH-MTS");

    public static final SubLList $list6 = list(list(makeSymbol("*SBHL-PRIMARY-WHAT-MTS-MT-PATHS*"), list(makeSymbol("INSTANTIATE-SBHL-MARKING-SPACE"))), list(makeSymbol("*SBHL-PRIMARY-WHAT-MTS-INVERSE-MT-PATHS*"), list(makeSymbol("INSTANTIATE-SBHL-MARKING-SPACE"))), list(makeSymbol("*SBHL-SECONDARY-WHAT-MTS-MT-PATHS*"), list(makeSymbol("INSTANTIATE-SBHL-MARKING-SPACE"))), list(makeSymbol("*SBHL-SECONDARY-WHAT-MTS-INVERSE-MT-PATHS*"), list(makeSymbol("INSTANTIATE-SBHL-MARKING-SPACE"))));





    public static final SubLList $list9 = list(makeSymbol("SPACE-ID"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sbhl_what_mts_mt_paths$ = makeSymbol("*SBHL-WHAT-MTS-MT-PATHS*");



    public static final SubLList $list12 = list(makeKeyword("PRIMARY"));

    public static final SubLList $list13 = list(makeSymbol("*SBHL-PRIMARY-WHAT-MTS-MT-PATHS*"), makeSymbol("*SBHL-SECONDARY-WHAT-MTS-MT-PATHS*"));

    public static final SubLSymbol $sbhl_what_mts_inverse_mt_paths$ = makeSymbol("*SBHL-WHAT-MTS-INVERSE-MT-PATHS*");

    public static final SubLList $list15 = list(makeSymbol("*SBHL-PRIMARY-WHAT-MTS-INVERSE-MT-PATHS*"), makeSymbol("*SBHL-SECONDARY-WHAT-MTS-INVERSE-MT-PATHS*"));

    public static final SubLList $list16 = list(list(makeSymbol("*SBHL-VERIFY-NAUT-MT-RELEVANCE*"), NIL));

    public static final SubLList $list17 = list(makeSymbol("FN"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sbhl_what_mts_map_function$ = makeSymbol("*SBHL-WHAT-MTS-MAP-FUNCTION*");

    public static final SubLSymbol SBHL_FALSE_WHAT_MTS_STEP = makeSymbol("SBHL-FALSE-WHAT-MTS-STEP");

    public static final SubLSymbol SBHL_FALSE_WHAT_MTS_SWEEP = makeSymbol("SBHL-FALSE-WHAT-MTS-SWEEP");

    public static final SubLSymbol SBHL_WHAT_MTS_TT_SWEEP = makeSymbol("SBHL-WHAT-MTS-TT-SWEEP");

    public static final SubLSymbol SBHL_WHAT_MTS_TT_STEP = makeSymbol("SBHL-WHAT-MTS-TT-STEP");

    public static final SubLSymbol SBHL_WHAT_MTS_STEP_ACROSS_MARKED_DISJOINS = makeSymbol("SBHL-WHAT-MTS-STEP-ACROSS-MARKED-DISJOINS");

    public static final SubLSymbol SBHL_WHAT_MTS_SWEEP_MARKED_DISJOINS = makeSymbol("SBHL-WHAT-MTS-SWEEP-MARKED-DISJOINS");

    public static final SubLSymbol SBHL_WHAT_MTS_SWEEP_FORWARD_STEP_AND_SWEEP_FALSE_DISJOINS = makeSymbol("SBHL-WHAT-MTS-SWEEP-FORWARD-STEP-AND-SWEEP-FALSE-DISJOINS");

    public static final SubLSymbol SBHL_WHAT_MTS_SWEEP_FALSE_DISJOINS = makeSymbol("SBHL-WHAT-MTS-SWEEP-FALSE-DISJOINS");

    public static final SubLList $list27 = list(makeSymbol("NODE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sbhl_what_mts_goal$ = makeSymbol("*SBHL-WHAT-MTS-GOAL*");

    private static final SubLObject $$negationInverse = reader_make_constant_shell(makeString("negationInverse"));

    private static final SubLObject $$genlInverse = reader_make_constant_shell(makeString("genlInverse"));

    private static final SubLString $str31$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str32$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");



    private static final SubLSymbol SBHL_CHECK_CUTOFF = makeSymbol("SBHL-CHECK-CUTOFF");

    private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));

    private static final SubLSymbol SBHL_SIMPLE_TRUE_WHAT_MTS_SEARCH = makeSymbol("SBHL-SIMPLE-TRUE-WHAT-MTS-SEARCH");

    private static final SubLSymbol SBHL_SIMPLE_FALSE_WHAT_MTS_SEARCH = makeSymbol("SBHL-SIMPLE-FALSE-WHAT-MTS-SEARCH");

    private static final SubLSymbol SBHL_TT_WHAT_MTS_SEARCH = makeSymbol("SBHL-TT-WHAT-MTS-SEARCH");

    private static final SubLSymbol SBHL_WHAT_MTS_TT_BACKWARD_SEARCH = makeSymbol("SBHL-WHAT-MTS-TT-BACKWARD-SEARCH");

    private static final SubLSymbol SBHL_WHAT_MTS_TRUE_DISJOINS_SEARCH = makeSymbol("SBHL-WHAT-MTS-TRUE-DISJOINS-SEARCH");

    private static final SubLSymbol SBHL_WHAT_MTS_FALSE_DISJOINS_SEARCH = makeSymbol("SBHL-WHAT-MTS-FALSE-DISJOINS-SEARCH");

    private static final SubLString $str42$Search_behavior_not_recognized__S = makeString("Search behavior not recognized. Sorry.");

    private static final SubLList $list43 = list(list(makeSymbol("*SBHL-WHAT-MTS-BEHAVIOR*"), list(makeSymbol("DETERMINE-SBHL-WHAT-MTS-BEHAVIOR"), list(makeSymbol("GET-SBHL-SEARCH-MODULE")), list(makeSymbol("GET-SBHL-SEARCH-DIRECTION")), list(makeSymbol("GET-SBHL-TV")))));

    private static final SubLString $str44$Unsupported_what_mts_behavior__a = makeString("Unsupported what mts behavior ~a");





    private static final SubLString $str47$_A_is_not_a__A = makeString("~A is not a ~A");





    private static final SubLString $$$continue_anyway = makeString("continue anyway");



    private static final SubLString $str52$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLObject $$True_JustificationTruth = reader_make_constant_shell(makeString("True-JustificationTruth"));





    private static final SubLSymbol SBHL_FALSE_TV_P = makeSymbol("SBHL-FALSE-TV-P");

    private static final SubLObject $$False_JustificationTruth = reader_make_constant_shell(makeString("False-JustificationTruth"));





    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $$genlMt = reader_make_constant_shell(makeString("genlMt"));



    private static final SubLSymbol SBHL_MAX_FLOOR_MTS = makeSymbol("SBHL-MAX-FLOOR-MTS");

    private static final SubLString $str64$Mts_might_not_be_valid_because_in = makeString("Mts might not be valid because initial node was a NAUT which used complicated link generation.");



    private static final SubLSymbol $sym66$SBHL_INVERSE_CARDINALITY_ = makeSymbol("SBHL-INVERSE-CARDINALITY<");

    public static SubLObject sbhl_rebind_path_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        mt = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_path_mts$, listS(POSSIBLY_UPDATE_SBHL_PATH_MTS, mt, $list4))), append(body, NIL));
    }

    public static SubLObject possibly_update_sbhl_path_mts(final SubLObject mt, final SubLObject path_mts) {
        return NIL != mt ? NIL != subl_promotions.memberP(mt, path_mts, symbol_function(EQL), UNPROVIDED) ? path_mts : cons(mt, path_mts) : path_mts;
    }

    public static SubLObject with_new_sbhl_what_mts_marking_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list6, append(body, NIL));
    }

    public static SubLObject sbhl_primary_what_mts_spaces() {
        return $PRIMARY;
    }

    public static SubLObject sbhl_secondary_what_mts_spaces() {
        return $SECONDARY;
    }

    public static SubLObject within_sbhl_what_mts_spaces(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject space_id = NIL;
        destructuring_bind_must_consp(current, datum, $list9);
        space_id = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_what_mts_mt_paths$, listS(FIF, listS(EQ, space_id, $list12), $list13)), list($sbhl_what_mts_inverse_mt_paths$, listS(FIF, listS(EQ, space_id, $list12), $list15))), append(body, NIL));
    }

    public static SubLObject get_sbhl_what_mts_marking_space() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sbhl_search_vars.genl_inverse_mode_p()) {
            return $sbhl_what_mts_inverse_mt_paths$.getDynamicValue(thread);
        }
        return $sbhl_what_mts_mt_paths$.getDynamicValue(thread);
    }

    public static SubLObject get_sbhl_what_mts_marking(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sbhl_search_vars.genl_inverse_mode_p()) {
            return gethash(node, $sbhl_what_mts_inverse_mt_paths$.getDynamicValue(thread), UNPROVIDED);
        }
        return gethash(node, $sbhl_what_mts_mt_paths$.getDynamicValue(thread), UNPROVIDED);
    }

    public static SubLObject sbhl_what_mts_mark_mt_paths_to_node(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject what_mts_space = get_sbhl_what_mts_marking_space();
        SubLObject redundant_mt_paths = NIL;
        SubLObject cdolist_list_var = get_sbhl_what_mts_marking(node);
        SubLObject mt_path = NIL;
        mt_path = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != list_utilities.proper_subsetp($sbhl_path_mts$.getDynamicValue(thread), mt_path, UNPROVIDED, UNPROVIDED)) {
                redundant_mt_paths = cons(mt_path, redundant_mt_paths);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mt_path = cdolist_list_var.first();
        } 
        cdolist_list_var = redundant_mt_paths;
        mt_path = NIL;
        mt_path = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            hash_table_utilities.delete_hash(node, mt_path, what_mts_space, EQUAL, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            mt_path = cdolist_list_var.first();
        } 
        hash_table_utilities.push_hash(node, $sbhl_path_mts$.getDynamicValue(thread), what_mts_space);
        return NIL;
    }

    public static SubLObject sbhl_what_mts_marking_subsumes_marking_p(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subsumesP = NIL;
        if (NIL == subsumesP) {
            SubLObject csome_list_var = get_sbhl_what_mts_marking(node);
            SubLObject mt_path = NIL;
            mt_path = csome_list_var.first();
            while ((NIL == subsumesP) && (NIL != csome_list_var)) {
                if (NIL != subsetp(mt_path, $sbhl_path_mts$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                    subsumesP = T;
                }
                csome_list_var = csome_list_var.rest();
                mt_path = csome_list_var.first();
            } 
        }
        return subsumesP;
    }

    public static SubLObject determine_sbhl_link_mt(final SubLObject node, final SubLObject link_node) {
        if ((NIL != forts.fort_p(node)) || (NIL != (node.isCons() ? narts_high.find_nart(node) : NIL))) {
            return sbhl_link_vars.get_sbhl_link_mt();
        }
        return NIL;
    }

    public static SubLObject sbhl_encountered_difficult_naut_mt_generator() {
        $sbhl_verify_naut_mt_relevance$.setDynamicValue(T);
        return NIL;
    }

    public static SubLObject with_new_naut_mt_relevance_verification(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list16, append(body, NIL));
    }

    public static SubLObject sbhl_verify_naut_mt_relevance_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_verify_naut_mt_relevance$.getDynamicValue(thread);
    }

    public static SubLObject with_sbhl_what_mts_map_function(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fn = NIL;
        destructuring_bind_must_consp(current, datum, $list17);
        fn = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_what_mts_map_function$, fn)), append(body, NIL));
    }

    public static SubLObject get_sbhl_what_mts_map_function() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_what_mts_map_function$.getDynamicValue(thread);
    }

    public static SubLObject sbhl_what_mts_not_mapping_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sublisp_null($sbhl_what_mts_map_function$.getDynamicValue(thread));
    }

    public static SubLObject sbhl_apply_what_mts_map_function(final SubLObject node) {
        final SubLObject map_fn = get_sbhl_what_mts_map_function();
        if (NIL != map_fn) {
            final SubLObject pcase_var = map_fn;
            if (pcase_var.eql(SBHL_FALSE_WHAT_MTS_STEP)) {
                sbhl_false_what_mts_step(node);
            } else
                if (pcase_var.eql(SBHL_FALSE_WHAT_MTS_SWEEP)) {
                    sbhl_false_what_mts_sweep(node);
                } else
                    if (pcase_var.eql(SBHL_WHAT_MTS_TT_SWEEP)) {
                        sbhl_what_mts_tt_sweep(node);
                    } else
                        if (pcase_var.eql(SBHL_WHAT_MTS_TT_STEP)) {
                            sbhl_what_mts_tt_step(node);
                        } else
                            if (pcase_var.eql(SBHL_WHAT_MTS_STEP_ACROSS_MARKED_DISJOINS)) {
                                sbhl_what_mts_step_across_marked_disjoins(node);
                            } else
                                if (pcase_var.eql(SBHL_WHAT_MTS_SWEEP_MARKED_DISJOINS)) {
                                    sbhl_what_mts_sweep_marked_disjoins(node);
                                } else
                                    if (pcase_var.eql(SBHL_WHAT_MTS_SWEEP_FORWARD_STEP_AND_SWEEP_FALSE_DISJOINS)) {
                                        sbhl_what_mts_sweep_forward_step_and_sweep_false_disjoins(node);
                                    } else
                                        if (pcase_var.eql(SBHL_WHAT_MTS_SWEEP_FALSE_DISJOINS)) {
                                            sbhl_what_mts_sweep_false_disjoins(node);
                                        } else {
                                            funcall(map_fn, node);
                                        }







        }
        return NIL;
    }

    public static SubLObject get_sbhl_what_mts_goal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_what_mts_goal$.getDynamicValue(thread);
    }

    public static SubLObject with_sbhl_what_mts_goal(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject node = NIL;
        destructuring_bind_must_consp(current, datum, $list27);
        node = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_what_mts_goal$, node)), append(body, NIL));
    }

    public static SubLObject sbhl_what_mts_goal_p(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == sbhl_what_mts_not_mapping_p()) {
            return NIL;
        }
        final SubLObject add_node_test = sbhl_search_vars.get_sbhl_search_add_node_test();
        SubLObject check_goalP = T;
        if (NIL != add_node_test) {
            check_goalP = funcall(add_node_test);
        }
        if (NIL != check_goalP) {
            return eql(node, $sbhl_what_mts_goal$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static SubLObject sbhl_what_mts_proper_mark_p(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject search_module_pred = sbhl_module_vars.get_sbhl_module_link_pred(sbhl_search_vars.get_sbhl_search_module());
        SubLObject result = NIL;
        if (search_module_pred.eql($$negationInverse)) {
            final SubLObject _prev_bind_0 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
            try {
                sbhl_search_vars.$genl_inverse_mode_p$.bind(makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                result = sbhl_marking_utilities.sbhl_search_path_termination_p(node, UNPROVIDED);
            } finally {
                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0, thread);
            }
        } else {
            result = sbhl_marking_utilities.sbhl_search_path_termination_p(node, UNPROVIDED);
        }
        return result;
    }

    public static SubLObject sbhl_what_mts_proper_goal_mark_p(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject search_module_pred = sbhl_module_vars.get_sbhl_module_link_pred(sbhl_search_vars.get_sbhl_search_module());
        SubLObject result = NIL;
        if (search_module_pred.eql($$genlInverse) || search_module_pred.eql($$negationInverse)) {
            final SubLObject _prev_bind_0 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
            try {
                sbhl_search_vars.$genl_inverse_mode_p$.bind(makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                result = sbhl_marking_utilities.sbhl_search_path_termination_p(node, UNPROVIDED);
            } finally {
                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0, thread);
            }
        } else {
            result = sbhl_marking_utilities.sbhl_search_path_termination_p(node, UNPROVIDED);
        }
        return result;
    }

    public static SubLObject sbhl_what_mts_mark_and_sweep(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == sbhl_what_mts_marking_subsumes_marking_p(node)) {
            sbhl_what_mts_mark_mt_paths_to_node(node);
            sbhl_apply_what_mts_map_function(node);
            if (NIL == sbhl_what_mts_goal_p(node)) {
                SubLObject cdolist_list_var;
                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                SubLObject module_var = NIL;
                module_var = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    try {
                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                        final SubLObject node_$1 = function_terms.naut_to_nart(node);
                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node_$1)) {
                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_$1, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                            if (NIL != d_link) {
                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                if (NIL != mt_links) {
                                    SubLObject iteration_state;
                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                        thread.resetMultipleValues();
                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                        final SubLObject tv_links = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                            final SubLObject _prev_bind_0_$2 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                            try {
                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                SubLObject iteration_state_$3;
                                                for (iteration_state_$3 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$3); iteration_state_$3 = dictionary_contents.do_dictionary_contents_next(iteration_state_$3)) {
                                                    thread.resetMultipleValues();
                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$3);
                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                        final SubLObject _prev_bind_0_$3 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                            final SubLObject sol = link_nodes;
                                                            if (NIL != set.set_p(sol)) {
                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                SubLObject basis_object;
                                                                SubLObject state;
                                                                SubLObject link_node;
                                                                SubLObject _prev_bind_0_$4;
                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                    link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                    if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                                        _prev_bind_0_$4 = $sbhl_path_mts$.currentBinding(thread);
                                                                        try {
                                                                            $sbhl_path_mts$.bind(possibly_update_sbhl_path_mts(determine_sbhl_link_mt(node, link_node), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                                            sbhl_what_mts_mark_and_sweep(link_node);
                                                                        } finally {
                                                                            $sbhl_path_mts$.rebind(_prev_bind_0_$4, thread);
                                                                        }
                                                                    }
                                                                }
                                                            } else
                                                                if (sol.isList()) {
                                                                    SubLObject csome_list_var = sol;
                                                                    SubLObject link_node2 = NIL;
                                                                    link_node2 = csome_list_var.first();
                                                                    while (NIL != csome_list_var) {
                                                                        final SubLObject _prev_bind_0_$5 = $sbhl_path_mts$.currentBinding(thread);
                                                                        try {
                                                                            $sbhl_path_mts$.bind(possibly_update_sbhl_path_mts(determine_sbhl_link_mt(node, link_node2), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                                            sbhl_what_mts_mark_and_sweep(link_node2);
                                                                        } finally {
                                                                            $sbhl_path_mts$.rebind(_prev_bind_0_$5, thread);
                                                                        }
                                                                        csome_list_var = csome_list_var.rest();
                                                                        link_node2 = csome_list_var.first();
                                                                    } 
                                                                } else {
                                                                    Errors.error($str31$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                }

                                                        } finally {
                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$3, thread);
                                                        }
                                                    }
                                                }
                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$3);
                                            } finally {
                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$2, thread);
                                            }
                                        }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                }
                            } else {
                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str32$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } else
                            if (NIL != obsolete.cnat_p(node_$1, UNPROVIDED)) {
                                SubLObject cdolist_list_var_$7;
                                final SubLObject new_list = cdolist_list_var_$7 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                SubLObject generating_fn = NIL;
                                generating_fn = cdolist_list_var_$7.first();
                                while (NIL != cdolist_list_var_$7) {
                                    final SubLObject _prev_bind_0_$6 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                    try {
                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                        final SubLObject sol2;
                                        final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node_$1);
                                        if (NIL != set.set_p(sol2)) {
                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                            SubLObject basis_object2;
                                            SubLObject state2;
                                            SubLObject link_node3;
                                            SubLObject _prev_bind_0_$7;
                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                if (NIL != set_contents.do_set_contents_element_validP(state2, link_node3)) {
                                                    _prev_bind_0_$7 = $sbhl_path_mts$.currentBinding(thread);
                                                    try {
                                                        $sbhl_path_mts$.bind(possibly_update_sbhl_path_mts(determine_sbhl_link_mt(node, link_node3), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                        sbhl_what_mts_mark_and_sweep(link_node3);
                                                    } finally {
                                                        $sbhl_path_mts$.rebind(_prev_bind_0_$7, thread);
                                                    }
                                                }
                                            }
                                        } else
                                            if (sol2.isList()) {
                                                SubLObject csome_list_var2 = sol2;
                                                SubLObject link_node4 = NIL;
                                                link_node4 = csome_list_var2.first();
                                                while (NIL != csome_list_var2) {
                                                    final SubLObject _prev_bind_0_$8 = $sbhl_path_mts$.currentBinding(thread);
                                                    try {
                                                        $sbhl_path_mts$.bind(possibly_update_sbhl_path_mts(determine_sbhl_link_mt(node, link_node4), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                        sbhl_what_mts_mark_and_sweep(link_node4);
                                                    } finally {
                                                        $sbhl_path_mts$.rebind(_prev_bind_0_$8, thread);
                                                    }
                                                    csome_list_var2 = csome_list_var2.rest();
                                                    link_node4 = csome_list_var2.first();
                                                } 
                                            } else {
                                                Errors.error($str31$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                            }

                                    } finally {
                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$6, thread);
                                    }
                                    cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                                    generating_fn = cdolist_list_var_$7.first();
                                } 
                            }

                    } finally {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2, thread);
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    module_var = cdolist_list_var.first();
                } 
            }
        }
        return NIL;
    }

    public static SubLObject sbhl_what_mts_mark_and_sweep_marked_nodes(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_what_mts_proper_mark_p(node)) && (NIL == sbhl_what_mts_marking_subsumes_marking_p(node))) {
            sbhl_what_mts_mark_mt_paths_to_node(node);
            sbhl_apply_what_mts_map_function(node);
            if (NIL == sbhl_what_mts_goal_p(node)) {
                SubLObject cdolist_list_var;
                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                SubLObject module_var = NIL;
                module_var = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    try {
                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                        final SubLObject node_$11 = function_terms.naut_to_nart(node);
                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node_$11)) {
                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_$11, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                            if (NIL != d_link) {
                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                if (NIL != mt_links) {
                                    SubLObject iteration_state;
                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                        thread.resetMultipleValues();
                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                        final SubLObject tv_links = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                            final SubLObject _prev_bind_0_$12 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                            try {
                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                SubLObject iteration_state_$13;
                                                for (iteration_state_$13 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$13); iteration_state_$13 = dictionary_contents.do_dictionary_contents_next(iteration_state_$13)) {
                                                    thread.resetMultipleValues();
                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$13);
                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                        final SubLObject _prev_bind_0_$13 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                            final SubLObject sol = link_nodes;
                                                            if (NIL != set.set_p(sol)) {
                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                SubLObject basis_object;
                                                                SubLObject state;
                                                                SubLObject link_node;
                                                                SubLObject _prev_bind_0_$14;
                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                    link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                    if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                                        _prev_bind_0_$14 = $sbhl_path_mts$.currentBinding(thread);
                                                                        try {
                                                                            $sbhl_path_mts$.bind(possibly_update_sbhl_path_mts(determine_sbhl_link_mt(node, link_node), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                                            sbhl_what_mts_mark_and_sweep_marked_nodes(link_node);
                                                                        } finally {
                                                                            $sbhl_path_mts$.rebind(_prev_bind_0_$14, thread);
                                                                        }
                                                                    }
                                                                }
                                                            } else
                                                                if (sol.isList()) {
                                                                    SubLObject csome_list_var = sol;
                                                                    SubLObject link_node2 = NIL;
                                                                    link_node2 = csome_list_var.first();
                                                                    while (NIL != csome_list_var) {
                                                                        final SubLObject _prev_bind_0_$15 = $sbhl_path_mts$.currentBinding(thread);
                                                                        try {
                                                                            $sbhl_path_mts$.bind(possibly_update_sbhl_path_mts(determine_sbhl_link_mt(node, link_node2), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                                            sbhl_what_mts_mark_and_sweep_marked_nodes(link_node2);
                                                                        } finally {
                                                                            $sbhl_path_mts$.rebind(_prev_bind_0_$15, thread);
                                                                        }
                                                                        csome_list_var = csome_list_var.rest();
                                                                        link_node2 = csome_list_var.first();
                                                                    } 
                                                                } else {
                                                                    Errors.error($str31$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                }

                                                        } finally {
                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$13, thread);
                                                        }
                                                    }
                                                }
                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$13);
                                            } finally {
                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$12, thread);
                                            }
                                        }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                }
                            } else {
                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str32$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } else
                            if (NIL != obsolete.cnat_p(node_$11, UNPROVIDED)) {
                                SubLObject cdolist_list_var_$17;
                                final SubLObject new_list = cdolist_list_var_$17 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                SubLObject generating_fn = NIL;
                                generating_fn = cdolist_list_var_$17.first();
                                while (NIL != cdolist_list_var_$17) {
                                    final SubLObject _prev_bind_0_$16 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                    try {
                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                        final SubLObject sol2;
                                        final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node_$11);
                                        if (NIL != set.set_p(sol2)) {
                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                            SubLObject basis_object2;
                                            SubLObject state2;
                                            SubLObject link_node3;
                                            SubLObject _prev_bind_0_$17;
                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                if (NIL != set_contents.do_set_contents_element_validP(state2, link_node3)) {
                                                    _prev_bind_0_$17 = $sbhl_path_mts$.currentBinding(thread);
                                                    try {
                                                        $sbhl_path_mts$.bind(possibly_update_sbhl_path_mts(determine_sbhl_link_mt(node, link_node3), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                        sbhl_what_mts_mark_and_sweep_marked_nodes(link_node3);
                                                    } finally {
                                                        $sbhl_path_mts$.rebind(_prev_bind_0_$17, thread);
                                                    }
                                                }
                                            }
                                        } else
                                            if (sol2.isList()) {
                                                SubLObject csome_list_var2 = sol2;
                                                SubLObject link_node4 = NIL;
                                                link_node4 = csome_list_var2.first();
                                                while (NIL != csome_list_var2) {
                                                    final SubLObject _prev_bind_0_$18 = $sbhl_path_mts$.currentBinding(thread);
                                                    try {
                                                        $sbhl_path_mts$.bind(possibly_update_sbhl_path_mts(determine_sbhl_link_mt(node, link_node4), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                        sbhl_what_mts_mark_and_sweep_marked_nodes(link_node4);
                                                    } finally {
                                                        $sbhl_path_mts$.rebind(_prev_bind_0_$18, thread);
                                                    }
                                                    csome_list_var2 = csome_list_var2.rest();
                                                    link_node4 = csome_list_var2.first();
                                                } 
                                            } else {
                                                Errors.error($str31$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                            }

                                    } finally {
                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$16, thread);
                                    }
                                    cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                                    generating_fn = cdolist_list_var_$17.first();
                                } 
                            }

                    } finally {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2, thread);
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    module_var = cdolist_list_var.first();
                } 
            }
        }
        return NIL;
    }

    public static SubLObject sbhl_what_mts_step_across_links(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var;
        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        SubLObject module_var = NIL;
        module_var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_2 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                final SubLObject node_$21 = function_terms.naut_to_nart(node);
                if (NIL != sbhl_link_vars.sbhl_node_object_p(node_$21)) {
                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_$21, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                    if (NIL != d_link) {
                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                        if (NIL != mt_links) {
                            SubLObject iteration_state;
                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                thread.resetMultipleValues();
                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                    final SubLObject _prev_bind_0_$22 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                    try {
                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                        SubLObject iteration_state_$23;
                                        for (iteration_state_$23 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$23); iteration_state_$23 = dictionary_contents.do_dictionary_contents_next(iteration_state_$23)) {
                                            thread.resetMultipleValues();
                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$23);
                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                final SubLObject _prev_bind_0_$23 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                try {
                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                    final SubLObject sol = link_nodes;
                                                    if (NIL != set.set_p(sol)) {
                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                        SubLObject basis_object;
                                                        SubLObject state;
                                                        SubLObject link_node;
                                                        SubLObject _prev_bind_0_$24;
                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                            link_node = set_contents.do_set_contents_next(basis_object, state);
                                                            if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                                _prev_bind_0_$24 = $sbhl_path_mts$.currentBinding(thread);
                                                                try {
                                                                    $sbhl_path_mts$.bind(possibly_update_sbhl_path_mts(determine_sbhl_link_mt(node, link_node), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                                    sbhl_apply_what_mts_map_function(link_node);
                                                                } finally {
                                                                    $sbhl_path_mts$.rebind(_prev_bind_0_$24, thread);
                                                                }
                                                            }
                                                        }
                                                    } else
                                                        if (sol.isList()) {
                                                            SubLObject csome_list_var = sol;
                                                            SubLObject link_node2 = NIL;
                                                            link_node2 = csome_list_var.first();
                                                            while (NIL != csome_list_var) {
                                                                final SubLObject _prev_bind_0_$25 = $sbhl_path_mts$.currentBinding(thread);
                                                                try {
                                                                    $sbhl_path_mts$.bind(possibly_update_sbhl_path_mts(determine_sbhl_link_mt(node, link_node2), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                                    sbhl_apply_what_mts_map_function(link_node2);
                                                                } finally {
                                                                    $sbhl_path_mts$.rebind(_prev_bind_0_$25, thread);
                                                                }
                                                                csome_list_var = csome_list_var.rest();
                                                                link_node2 = csome_list_var.first();
                                                            } 
                                                        } else {
                                                            Errors.error($str31$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                        }

                                                } finally {
                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$23, thread);
                                                }
                                            }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$23);
                                    } finally {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$22, thread);
                                    }
                                }
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        }
                    } else {
                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str32$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                } else
                    if (NIL != obsolete.cnat_p(node_$21, UNPROVIDED)) {
                        SubLObject cdolist_list_var_$27;
                        final SubLObject new_list = cdolist_list_var_$27 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                        SubLObject generating_fn = NIL;
                        generating_fn = cdolist_list_var_$27.first();
                        while (NIL != cdolist_list_var_$27) {
                            final SubLObject _prev_bind_0_$26 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                            try {
                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                final SubLObject sol2;
                                final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node_$21);
                                if (NIL != set.set_p(sol2)) {
                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                    SubLObject basis_object2;
                                    SubLObject state2;
                                    SubLObject link_node3;
                                    SubLObject _prev_bind_0_$27;
                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                        link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                        if (NIL != set_contents.do_set_contents_element_validP(state2, link_node3)) {
                                            _prev_bind_0_$27 = $sbhl_path_mts$.currentBinding(thread);
                                            try {
                                                $sbhl_path_mts$.bind(possibly_update_sbhl_path_mts(determine_sbhl_link_mt(node, link_node3), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                sbhl_apply_what_mts_map_function(link_node3);
                                            } finally {
                                                $sbhl_path_mts$.rebind(_prev_bind_0_$27, thread);
                                            }
                                        }
                                    }
                                } else
                                    if (sol2.isList()) {
                                        SubLObject csome_list_var2 = sol2;
                                        SubLObject link_node4 = NIL;
                                        link_node4 = csome_list_var2.first();
                                        while (NIL != csome_list_var2) {
                                            final SubLObject _prev_bind_0_$28 = $sbhl_path_mts$.currentBinding(thread);
                                            try {
                                                $sbhl_path_mts$.bind(possibly_update_sbhl_path_mts(determine_sbhl_link_mt(node, link_node4), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                sbhl_apply_what_mts_map_function(link_node4);
                                            } finally {
                                                $sbhl_path_mts$.rebind(_prev_bind_0_$28, thread);
                                            }
                                            csome_list_var2 = csome_list_var2.rest();
                                            link_node4 = csome_list_var2.first();
                                        } 
                                    } else {
                                        Errors.error($str31$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                    }

                            } finally {
                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$26, thread);
                            }
                            cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                            generating_fn = cdolist_list_var_$27.first();
                        } 
                    }

            } finally {
                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            module_var = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject sbhl_what_mts_step_across_marked_links(final SubLObject node) {
        if (NIL != sbhl_what_mts_proper_goal_mark_p(node)) {
            sbhl_what_mts_step_across_links(node);
        }
        return NIL;
    }

    public static SubLObject sbhl_what_mts_step_and_update_links(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var;
        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        SubLObject module_var = NIL;
        module_var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_2 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                final SubLObject node_$31 = function_terms.naut_to_nart(node);
                if (NIL != sbhl_link_vars.sbhl_node_object_p(node_$31)) {
                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_$31, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                    if (NIL != d_link) {
                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                        if (NIL != mt_links) {
                            SubLObject iteration_state;
                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                thread.resetMultipleValues();
                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                    final SubLObject _prev_bind_0_$32 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                    try {
                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                        SubLObject iteration_state_$33;
                                        for (iteration_state_$33 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$33); iteration_state_$33 = dictionary_contents.do_dictionary_contents_next(iteration_state_$33)) {
                                            thread.resetMultipleValues();
                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$33);
                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                final SubLObject _prev_bind_0_$33 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                try {
                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                    final SubLObject sol = link_nodes;
                                                    if (NIL != set.set_p(sol)) {
                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                        SubLObject basis_object;
                                                        SubLObject state;
                                                        SubLObject link_node;
                                                        SubLObject _prev_bind_0_$34;
                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                            link_node = set_contents.do_set_contents_next(basis_object, state);
                                                            if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                                _prev_bind_0_$34 = $sbhl_path_mts$.currentBinding(thread);
                                                                try {
                                                                    $sbhl_path_mts$.bind(possibly_update_sbhl_path_mts(determine_sbhl_link_mt(node, link_node), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                                    if (NIL == sbhl_what_mts_marking_subsumes_marking_p(link_node)) {
                                                                        sbhl_what_mts_mark_mt_paths_to_node(link_node);
                                                                        sbhl_apply_what_mts_map_function(link_node);
                                                                    }
                                                                } finally {
                                                                    $sbhl_path_mts$.rebind(_prev_bind_0_$34, thread);
                                                                }
                                                            }
                                                        }
                                                    } else
                                                        if (sol.isList()) {
                                                            SubLObject csome_list_var = sol;
                                                            SubLObject link_node2 = NIL;
                                                            link_node2 = csome_list_var.first();
                                                            while (NIL != csome_list_var) {
                                                                final SubLObject _prev_bind_0_$35 = $sbhl_path_mts$.currentBinding(thread);
                                                                try {
                                                                    $sbhl_path_mts$.bind(possibly_update_sbhl_path_mts(determine_sbhl_link_mt(node, link_node2), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                                    if (NIL == sbhl_what_mts_marking_subsumes_marking_p(link_node2)) {
                                                                        sbhl_what_mts_mark_mt_paths_to_node(link_node2);
                                                                        sbhl_apply_what_mts_map_function(link_node2);
                                                                    }
                                                                } finally {
                                                                    $sbhl_path_mts$.rebind(_prev_bind_0_$35, thread);
                                                                }
                                                                csome_list_var = csome_list_var.rest();
                                                                link_node2 = csome_list_var.first();
                                                            } 
                                                        } else {
                                                            Errors.error($str31$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                        }

                                                } finally {
                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$33, thread);
                                                }
                                            }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$33);
                                    } finally {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$32, thread);
                                    }
                                }
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        }
                    } else {
                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str32$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                } else
                    if (NIL != obsolete.cnat_p(node_$31, UNPROVIDED)) {
                        SubLObject cdolist_list_var_$37;
                        final SubLObject new_list = cdolist_list_var_$37 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                        SubLObject generating_fn = NIL;
                        generating_fn = cdolist_list_var_$37.first();
                        while (NIL != cdolist_list_var_$37) {
                            final SubLObject _prev_bind_0_$36 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                            try {
                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                final SubLObject sol2;
                                final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node_$31);
                                if (NIL != set.set_p(sol2)) {
                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                    SubLObject basis_object2;
                                    SubLObject state2;
                                    SubLObject link_node3;
                                    SubLObject _prev_bind_0_$37;
                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                        link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                        if (NIL != set_contents.do_set_contents_element_validP(state2, link_node3)) {
                                            _prev_bind_0_$37 = $sbhl_path_mts$.currentBinding(thread);
                                            try {
                                                $sbhl_path_mts$.bind(possibly_update_sbhl_path_mts(determine_sbhl_link_mt(node, link_node3), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                if (NIL == sbhl_what_mts_marking_subsumes_marking_p(link_node3)) {
                                                    sbhl_what_mts_mark_mt_paths_to_node(link_node3);
                                                    sbhl_apply_what_mts_map_function(link_node3);
                                                }
                                            } finally {
                                                $sbhl_path_mts$.rebind(_prev_bind_0_$37, thread);
                                            }
                                        }
                                    }
                                } else
                                    if (sol2.isList()) {
                                        SubLObject csome_list_var2 = sol2;
                                        SubLObject link_node4 = NIL;
                                        link_node4 = csome_list_var2.first();
                                        while (NIL != csome_list_var2) {
                                            final SubLObject _prev_bind_0_$38 = $sbhl_path_mts$.currentBinding(thread);
                                            try {
                                                $sbhl_path_mts$.bind(possibly_update_sbhl_path_mts(determine_sbhl_link_mt(node, link_node4), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                if (NIL == sbhl_what_mts_marking_subsumes_marking_p(link_node4)) {
                                                    sbhl_what_mts_mark_mt_paths_to_node(link_node4);
                                                    sbhl_apply_what_mts_map_function(link_node4);
                                                }
                                            } finally {
                                                $sbhl_path_mts$.rebind(_prev_bind_0_$38, thread);
                                            }
                                            csome_list_var2 = csome_list_var2.rest();
                                            link_node4 = csome_list_var2.first();
                                        } 
                                    } else {
                                        Errors.error($str31$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                    }

                            } finally {
                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$36, thread);
                            }
                            cdolist_list_var_$37 = cdolist_list_var_$37.rest();
                            generating_fn = cdolist_list_var_$37.first();
                        } 
                    }

            } finally {
                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            module_var = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject sbhl_what_mts_sweep(final SubLObject module, final SubLObject link_direction, final SubLObject tv, final SubLObject spaces, final SubLObject map_fn, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $sbhl_what_mts_mt_paths$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $sbhl_what_mts_inverse_mt_paths$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $sbhl_what_mts_map_function$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            sbhl_link_vars.$sbhl_link_direction$.bind(link_direction, thread);
            sbhl_search_vars.$sbhl_tv$.bind(tv, thread);
            $sbhl_what_mts_mt_paths$.bind(spaces == $PRIMARY ? $sbhl_primary_what_mts_mt_paths$.getDynamicValue(thread) : $sbhl_secondary_what_mts_mt_paths$.getDynamicValue(thread), thread);
            $sbhl_what_mts_inverse_mt_paths$.bind(spaces == $PRIMARY ? $sbhl_primary_what_mts_inverse_mt_paths$.getDynamicValue(thread) : $sbhl_secondary_what_mts_inverse_mt_paths$.getDynamicValue(thread), thread);
            $sbhl_what_mts_map_function$.bind(map_fn, thread);
            sbhl_what_mts_mark_and_sweep(node);
        } finally {
            $sbhl_what_mts_map_function$.rebind(_prev_bind_6, thread);
            $sbhl_what_mts_inverse_mt_paths$.rebind(_prev_bind_5, thread);
            $sbhl_what_mts_mt_paths$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_3, thread);
            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sbhl_what_mts_sweep_marked(final SubLObject module, final SubLObject link_direction, final SubLObject tv, final SubLObject what_mts_spaces, final SubLObject marking_space, final SubLObject map_fn, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $sbhl_what_mts_mt_paths$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $sbhl_what_mts_inverse_mt_paths$.currentBinding(thread);
        final SubLObject _prev_bind_6 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $sbhl_what_mts_map_function$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            sbhl_link_vars.$sbhl_link_direction$.bind(link_direction, thread);
            sbhl_search_vars.$sbhl_tv$.bind(tv, thread);
            $sbhl_what_mts_mt_paths$.bind(what_mts_spaces == $PRIMARY ? $sbhl_primary_what_mts_mt_paths$.getDynamicValue(thread) : $sbhl_secondary_what_mts_mt_paths$.getDynamicValue(thread), thread);
            $sbhl_what_mts_inverse_mt_paths$.bind(what_mts_spaces == $PRIMARY ? $sbhl_primary_what_mts_inverse_mt_paths$.getDynamicValue(thread) : $sbhl_secondary_what_mts_inverse_mt_paths$.getDynamicValue(thread), thread);
            sbhl_marking_vars.$sbhl_space$.bind(marking_space, thread);
            $sbhl_what_mts_map_function$.bind(map_fn, thread);
            sbhl_what_mts_mark_and_sweep_marked_nodes(node);
        } finally {
            $sbhl_what_mts_map_function$.rebind(_prev_bind_7, thread);
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_6, thread);
            $sbhl_what_mts_inverse_mt_paths$.rebind(_prev_bind_5, thread);
            $sbhl_what_mts_mt_paths$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_3, thread);
            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sbhl_what_mts_step(final SubLObject module, final SubLObject link_direction, final SubLObject tv, final SubLObject map_fn, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $sbhl_what_mts_map_function$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            sbhl_link_vars.$sbhl_link_direction$.bind(link_direction, thread);
            sbhl_search_vars.$sbhl_tv$.bind(tv, thread);
            $sbhl_what_mts_map_function$.bind(map_fn, thread);
            sbhl_what_mts_step_across_links(node);
        } finally {
            $sbhl_what_mts_map_function$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_3, thread);
            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sbhl_what_mts_step_marked(final SubLObject module, final SubLObject link_direction, final SubLObject tv, final SubLObject marking_space, final SubLObject map_fn, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $sbhl_what_mts_map_function$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            sbhl_link_vars.$sbhl_link_direction$.bind(link_direction, thread);
            sbhl_search_vars.$sbhl_tv$.bind(tv, thread);
            sbhl_marking_vars.$sbhl_space$.bind(marking_space, thread);
            $sbhl_what_mts_map_function$.bind(map_fn, thread);
            sbhl_what_mts_step_across_marked_links(node);
        } finally {
            $sbhl_what_mts_map_function$.rebind(_prev_bind_5, thread);
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_3, thread);
            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sbhl_what_mts_step_and_update_mts(final SubLObject module, final SubLObject link_direction, final SubLObject tv, final SubLObject what_mts_spaces, final SubLObject map_fn, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $sbhl_what_mts_mt_paths$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $sbhl_what_mts_inverse_mt_paths$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $sbhl_what_mts_map_function$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            sbhl_link_vars.$sbhl_link_direction$.bind(link_direction, thread);
            sbhl_search_vars.$sbhl_tv$.bind(tv, thread);
            $sbhl_what_mts_mt_paths$.bind(what_mts_spaces == $PRIMARY ? $sbhl_primary_what_mts_mt_paths$.getDynamicValue(thread) : $sbhl_secondary_what_mts_mt_paths$.getDynamicValue(thread), thread);
            $sbhl_what_mts_inverse_mt_paths$.bind(what_mts_spaces == $PRIMARY ? $sbhl_primary_what_mts_inverse_mt_paths$.getDynamicValue(thread) : $sbhl_secondary_what_mts_inverse_mt_paths$.getDynamicValue(thread), thread);
            $sbhl_what_mts_map_function$.bind(map_fn, thread);
            sbhl_what_mts_step_and_update_links(node);
        } finally {
            $sbhl_what_mts_map_function$.rebind(_prev_bind_6, thread);
            $sbhl_what_mts_inverse_mt_paths$.rebind(_prev_bind_5, thread);
            $sbhl_what_mts_mt_paths$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_3, thread);
            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sbhl_simple_true_what_mts_search(final SubLObject node) {
        sbhl_what_mts_sweep(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.sbhl_search_true_tv(), sbhl_primary_what_mts_spaces(), NIL, node);
        return NIL;
    }

    public static SubLObject sbhl_simple_false_what_mts_search(final SubLObject node) {
        sbhl_what_mts_sweep(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_opposite_link_direction(), sbhl_search_vars.sbhl_search_true_tv(), sbhl_primary_what_mts_spaces(), SBHL_FALSE_WHAT_MTS_STEP, node);
        return NIL;
    }

    public static SubLObject sbhl_false_what_mts_step(final SubLObject node) {
        sbhl_what_mts_step(sbhl_search_vars.get_sbhl_search_module(), sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_search_module()), sbhl_search_vars.sbhl_search_false_tv(), SBHL_FALSE_WHAT_MTS_SWEEP, node);
        return NIL;
    }

    public static SubLObject sbhl_false_what_mts_sweep(final SubLObject node) {
        sbhl_what_mts_sweep(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_opposite_link_direction(), sbhl_search_vars.sbhl_search_true_tv(), sbhl_secondary_what_mts_spaces(), NIL, node);
        return NIL;
    }

    public static SubLObject sbhl_tt_what_mts_search(final SubLObject node) {
        sbhl_what_mts_step(sbhl_search_vars.get_sbhl_search_module(), sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_search_vars.get_sbhl_search_module()), sbhl_search_vars.get_sbhl_tv(), SBHL_WHAT_MTS_TT_SWEEP, node);
        return NIL;
    }

    public static SubLObject sbhl_what_mts_tt_sweep(final SubLObject node) {
        sbhl_what_mts_sweep(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_search_vars.get_sbhl_search_module()), NIL != sbhl_search_vars.sbhl_true_search_p() ? sbhl_link_vars.get_sbhl_link_direction() : sbhl_link_vars.get_sbhl_opposite_link_direction(), sbhl_search_vars.sbhl_search_true_tv(), sbhl_primary_what_mts_spaces(), NIL, node);
        return NIL;
    }

    public static SubLObject sbhl_what_mts_tt_backward_search(final SubLObject node) {
        final SubLObject tt_module = sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        sbhl_what_mts_sweep(tt_module, NIL != sbhl_search_vars.sbhl_true_search_p() ? sbhl_module_utilities.get_sbhl_module_backward_direction(tt_module) : sbhl_module_utilities.get_sbhl_module_forward_direction(tt_module), sbhl_search_vars.sbhl_search_true_tv(), sbhl_primary_what_mts_spaces(), SBHL_WHAT_MTS_TT_STEP, node);
        return NIL;
    }

    public static SubLObject sbhl_what_mts_tt_step(final SubLObject node) {
        sbhl_what_mts_step_and_update_mts(sbhl_search_vars.get_sbhl_search_module(), sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_search_vars.get_sbhl_search_module()), NIL != sbhl_search_vars.sbhl_true_search_p() ? sbhl_search_vars.sbhl_search_true_tv() : sbhl_search_vars.sbhl_search_false_tv(), sbhl_secondary_what_mts_spaces(), NIL, node);
        return NIL;
    }

    public static SubLObject sbhl_what_mts_premark_disjoins(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_consider_node_fn$.bind(SBHL_CHECK_CUTOFF, thread);
            sbhl_search_utilities.sbhl_sweep_and_gather_disjoins(node);
        } finally {
            sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sbhl_what_mts_true_disjoins_search(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject _prev_bind_0_$41 = sbhl_marking_vars.$sbhl_target_gather_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_target_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject _prev_bind_0_$42 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
                            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.$sbhl_target_gather_space$.getDynamicValue(thread), thread);
                            sbhl_what_mts_premark_disjoins(get_sbhl_what_mts_goal());
                            final SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                            sbhl_what_mts_sweep(tt_module, sbhl_module_utilities.get_sbhl_module_forward_direction(tt_module), sbhl_search_vars.sbhl_search_true_tv(), sbhl_primary_what_mts_spaces(), SBHL_WHAT_MTS_STEP_ACROSS_MARKED_DISJOINS, node);
                        } finally {
                            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$42, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$43 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_gather_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_target_gather_space$.rebind(_prev_bind_0_$41, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$44 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$44, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sbhl_what_mts_step_across_marked_disjoins(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_what_mts_step_marked(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_undirected_direction(), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_target_gather_space$.getDynamicValue(thread), SBHL_WHAT_MTS_SWEEP_MARKED_DISJOINS, node);
        return NIL;
    }

    public static SubLObject sbhl_what_mts_sweep_marked_disjoins(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        sbhl_what_mts_sweep_marked(get_sbhl_what_mts_sweep_disjoins_module(), sbhl_module_utilities.get_sbhl_module_backward_direction(tt_module), sbhl_search_vars.sbhl_search_true_tv(), sbhl_secondary_what_mts_spaces(), sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), NIL, node);
        return NIL;
    }

    public static SubLObject get_sbhl_what_mts_sweep_disjoins_module() {
        if (NIL == sbhl_module_utilities.sbhl_module_indicates_predicate_search_p(sbhl_search_vars.get_sbhl_search_module())) {
            return sbhl_module_vars.get_sbhl_module(UNPROVIDED);
        }
        if (NIL != sbhl_search_vars.genl_inverse_mode_p()) {
            return sbhl_module_vars.get_sbhl_module($$genlInverse);
        }
        return sbhl_module_vars.get_sbhl_module($$genlPreds);
    }

    public static SubLObject sbhl_what_mts_false_disjoins_search(final SubLObject node) {
        final SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        sbhl_what_mts_sweep(tt_module, sbhl_module_utilities.get_sbhl_module_backward_direction(tt_module), sbhl_search_vars.sbhl_search_true_tv(), sbhl_primary_what_mts_spaces(), SBHL_WHAT_MTS_SWEEP_FORWARD_STEP_AND_SWEEP_FALSE_DISJOINS, node);
        return NIL;
    }

    public static SubLObject sbhl_what_mts_sweep_forward_step_and_sweep_false_disjoins(final SubLObject node) {
        final SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        sbhl_what_mts_sweep(tt_module, sbhl_module_utilities.get_sbhl_module_forward_direction(tt_module), sbhl_search_vars.sbhl_search_true_tv(), sbhl_secondary_what_mts_spaces(), NIL, node);
        sbhl_what_mts_step(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_undirected_direction(), sbhl_search_vars.sbhl_search_false_tv(), SBHL_WHAT_MTS_SWEEP_FALSE_DISJOINS, node);
        return NIL;
    }

    public static SubLObject sbhl_what_mts_sweep_false_disjoins(final SubLObject node) {
        final SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        sbhl_what_mts_sweep(tt_module, sbhl_module_utilities.get_sbhl_module_forward_direction(tt_module), sbhl_search_vars.sbhl_search_true_tv(), sbhl_secondary_what_mts_spaces(), NIL, node);
        return NIL;
    }

    public static SubLObject determine_sbhl_what_mts_behavior(final SubLObject module, final SubLObject direction, final SubLObject tv) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        if (NIL != sbhl_module_utilities.sbhl_simple_module_p(module)) {
            if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
                return SBHL_SIMPLE_TRUE_WHAT_MTS_SEARCH;
            }
            return SBHL_SIMPLE_FALSE_WHAT_MTS_SEARCH;
        } else
            if (NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(module)) {
                if (NIL != sbhl_search_vars.sbhl_forward_search_direction_p(direction)) {
                    return SBHL_TT_WHAT_MTS_SEARCH;
                }
                return SBHL_WHAT_MTS_TT_BACKWARD_SEARCH;
            } else {
                if (NIL == sbhl_module_utilities.sbhl_disjoins_module_p(module)) {
                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str42$Search_behavior_not_recognized__S, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return NIL;
                }
                if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
                    return SBHL_WHAT_MTS_TRUE_DISJOINS_SEARCH;
                }
                return SBHL_WHAT_MTS_FALSE_DISJOINS_SEARCH;
            }

    }

    public static SubLObject get_sbhl_what_mts_behavior() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_what_mts_behavior$.getDynamicValue(thread);
    }

    public static SubLObject bind_sbhl_what_mts_behavior(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list43, append(body, NIL));
    }

    public static SubLObject sbhl_apply_what_mts_behavior(final SubLObject node) {
        final SubLObject pcase_var;
        final SubLObject behavior = pcase_var = get_sbhl_what_mts_behavior();
        if (pcase_var.eql(SBHL_SIMPLE_TRUE_WHAT_MTS_SEARCH)) {
            sbhl_simple_true_what_mts_search(node);
        } else
            if (pcase_var.eql(SBHL_SIMPLE_FALSE_WHAT_MTS_SEARCH)) {
                sbhl_simple_false_what_mts_search(node);
            } else
                if (pcase_var.eql(SBHL_TT_WHAT_MTS_SEARCH)) {
                    sbhl_tt_what_mts_search(node);
                } else
                    if (pcase_var.eql(SBHL_WHAT_MTS_TT_BACKWARD_SEARCH)) {
                        sbhl_what_mts_tt_backward_search(node);
                    } else
                        if (pcase_var.eql(SBHL_WHAT_MTS_TRUE_DISJOINS_SEARCH)) {
                            sbhl_what_mts_true_disjoins_search(node);
                        } else
                            if (pcase_var.eql(SBHL_WHAT_MTS_FALSE_DISJOINS_SEARCH)) {
                                sbhl_what_mts_false_disjoins_search(node);
                            } else {
                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str44$Unsupported_what_mts_behavior__a, behavior, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }





        return NIL;
    }

    public static SubLObject sbhl_what_mts_terminating_space() {
        final SubLObject pcase_var;
        final SubLObject behavior = pcase_var = get_sbhl_what_mts_behavior();
        if (pcase_var.eql(SBHL_SIMPLE_TRUE_WHAT_MTS_SEARCH)) {
            return sbhl_primary_what_mts_spaces();
        }
        if (pcase_var.eql(SBHL_SIMPLE_FALSE_WHAT_MTS_SEARCH)) {
            return sbhl_secondary_what_mts_spaces();
        }
        if (pcase_var.eql(SBHL_TT_WHAT_MTS_SEARCH)) {
            return sbhl_primary_what_mts_spaces();
        }
        if (pcase_var.eql(SBHL_WHAT_MTS_TT_BACKWARD_SEARCH)) {
            return sbhl_secondary_what_mts_spaces();
        }
        if (pcase_var.eql(SBHL_WHAT_MTS_TRUE_DISJOINS_SEARCH)) {
            return sbhl_secondary_what_mts_spaces();
        }
        if (pcase_var.eql(SBHL_WHAT_MTS_FALSE_DISJOINS_SEARCH)) {
            return sbhl_secondary_what_mts_spaces();
        }
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str44$Unsupported_what_mts_behavior__a, behavior, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject sbhl_what_mts_final_mt_paths(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $sbhl_what_mts_mt_paths$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $sbhl_what_mts_inverse_mt_paths$.currentBinding(thread);
        try {
            $sbhl_what_mts_mt_paths$.bind(sbhl_what_mts_terminating_space() == $PRIMARY ? $sbhl_primary_what_mts_mt_paths$.getDynamicValue(thread) : $sbhl_secondary_what_mts_mt_paths$.getDynamicValue(thread), thread);
            $sbhl_what_mts_inverse_mt_paths$.bind(sbhl_what_mts_terminating_space() == $PRIMARY ? $sbhl_primary_what_mts_inverse_mt_paths$.getDynamicValue(thread) : $sbhl_secondary_what_mts_inverse_mt_paths$.getDynamicValue(thread), thread);
            if (sbhl_module_vars.get_sbhl_module_link_pred(sbhl_search_vars.get_sbhl_search_module()).eql($$genlInverse) || sbhl_module_vars.get_sbhl_module_link_pred(sbhl_search_vars.get_sbhl_search_module()).eql($$negationInverse)) {
                result = gethash(node, $sbhl_what_mts_inverse_mt_paths$.getDynamicValue(thread), UNPROVIDED);
            } else {
                result = gethash(node, $sbhl_what_mts_mt_paths$.getDynamicValue(thread), UNPROVIDED);
            }
        } finally {
            $sbhl_what_mts_inverse_mt_paths$.rebind(_prev_bind_2, thread);
            $sbhl_what_mts_mt_paths$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject sbhl_what_mts_goal_final_mt_paths() {
        return sbhl_what_mts_final_mt_paths(get_sbhl_what_mts_goal());
    }

    public static SubLObject sbhl_predicate_mt_paths(final SubLObject module, final SubLObject node, final SubLObject goal_node, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            final SubLObject tv_var = tv;
            final SubLObject _prev_bind_0_$45 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
            final SubLObject _prev_bind_1_$46 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
            try {
                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                    if (pcase_var.eql($ERROR)) {
                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str47$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else
                        if (pcase_var.eql($CERROR)) {
                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str47$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($WARN)) {
                                Errors.warn($str47$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                            } else {
                                Errors.warn($str52$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror($$$continue_anyway, $str47$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                            }


                }
                final SubLObject _prev_bind_0_$46 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                final SubLObject _prev_bind_1_$47 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                final SubLObject _prev_bind_2_$49 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                    final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                    final SubLObject _prev_bind_0_$47 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                        final SubLObject _prev_bind_0_$48 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                            final SubLObject _prev_bind_0_$49 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$48 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$50 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                            final SubLObject _prev_bind_3_$55 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                            final SubLObject _prev_bind_4_$56 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                SubLObject needs_to_releaseP = NIL;
                                try {
                                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                    result = sbhl_what_mt_paths_from_node_to_node(node, goal_node);
                                } finally {
                                    if (NIL != needs_to_releaseP) {
                                        ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                    }
                                }
                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$56, thread);
                                sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$55, thread);
                                sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$50, thread);
                                sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$48, thread);
                                sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$49, thread);
                            }
                            if (source == $RESOURCE) {
                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$48, thread);
                        }
                        if (source == $RESOURCE) {
                            sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$47, thread);
                    }
                } finally {
                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$49, thread);
                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$47, thread);
                    sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$46, thread);
                }
            } finally {
                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$46, thread);
                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$45, thread);
            }
        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject sbhl_inverse_mt_paths(final SubLObject module, final SubLObject node, final SubLObject goal_node, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            final SubLObject tv_var = tv;
            final SubLObject _prev_bind_0_$57 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
            final SubLObject _prev_bind_1_$58 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
            try {
                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                    if (pcase_var.eql($ERROR)) {
                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str47$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else
                        if (pcase_var.eql($CERROR)) {
                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str47$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($WARN)) {
                                Errors.warn($str47$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                            } else {
                                Errors.warn($str52$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror($$$continue_anyway, $str47$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                            }


                }
                final SubLObject _prev_bind_0_$58 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                final SubLObject _prev_bind_1_$59 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                final SubLObject _prev_bind_2_$61 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                    final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                    final SubLObject _prev_bind_0_$59 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                        final SubLObject _prev_bind_0_$60 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                            final SubLObject _prev_bind_0_$61 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$60 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$62 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                            final SubLObject _prev_bind_3_$67 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                            final SubLObject _prev_bind_4_$68 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                SubLObject needs_to_releaseP = NIL;
                                try {
                                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                    result = sbhl_what_mt_paths_from_node_to_node(node, goal_node);
                                } finally {
                                    if (NIL != needs_to_releaseP) {
                                        ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                    }
                                }
                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$68, thread);
                                sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$67, thread);
                                sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$62, thread);
                                sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$60, thread);
                                sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$61, thread);
                            }
                            if (source == $RESOURCE) {
                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$60, thread);
                        }
                        if (source == $RESOURCE) {
                            sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$59, thread);
                    }
                } finally {
                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$61, thread);
                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$59, thread);
                    sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$58, thread);
                }
            } finally {
                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$58, thread);
                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$57, thread);
            }
        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject sbhl_false_predicate_mt_paths(final SubLObject module, final SubLObject node, final SubLObject goal_node, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            final SubLObject tv_var = tv;
            final SubLObject _prev_bind_0_$69 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
            final SubLObject _prev_bind_1_$70 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
            try {
                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_false_tv(), thread);
                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_false_tv_p(tv_var))) {
                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                    if (pcase_var.eql($ERROR)) {
                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str47$_A_is_not_a__A, tv_var, SBHL_FALSE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else
                        if (pcase_var.eql($CERROR)) {
                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str47$_A_is_not_a__A, tv_var, SBHL_FALSE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($WARN)) {
                                Errors.warn($str47$_A_is_not_a__A, tv_var, SBHL_FALSE_TV_P);
                            } else {
                                Errors.warn($str52$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror($$$continue_anyway, $str47$_A_is_not_a__A, tv_var, SBHL_FALSE_TV_P);
                            }


                }
                final SubLObject _prev_bind_0_$70 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                final SubLObject _prev_bind_1_$71 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                final SubLObject _prev_bind_2_$73 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_search_truth$.bind($$False_JustificationTruth, thread);
                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                    final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                    final SubLObject _prev_bind_0_$71 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                        final SubLObject _prev_bind_0_$72 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                            final SubLObject _prev_bind_0_$73 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$72 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$74 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                            final SubLObject _prev_bind_3_$79 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                            final SubLObject _prev_bind_4_$80 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                SubLObject needs_to_releaseP = NIL;
                                try {
                                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                    result = sbhl_what_mt_paths_from_node_to_node(node, goal_node);
                                } finally {
                                    if (NIL != needs_to_releaseP) {
                                        ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                    }
                                }
                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$80, thread);
                                sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$79, thread);
                                sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$74, thread);
                                sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$72, thread);
                                sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$73, thread);
                            }
                            if (source == $RESOURCE) {
                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$72, thread);
                        }
                        if (source == $RESOURCE) {
                            sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$71, thread);
                    }
                } finally {
                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$73, thread);
                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$71, thread);
                    sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$70, thread);
                }
            } finally {
                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$70, thread);
                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$69, thread);
            }
        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject sbhl_false_inverse_mt_paths(final SubLObject module, final SubLObject node, final SubLObject goal_node, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            final SubLObject tv_var = tv;
            final SubLObject _prev_bind_0_$81 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
            final SubLObject _prev_bind_1_$82 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
            try {
                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_false_tv(), thread);
                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_false_tv_p(tv_var))) {
                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                    if (pcase_var.eql($ERROR)) {
                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str47$_A_is_not_a__A, tv_var, SBHL_FALSE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else
                        if (pcase_var.eql($CERROR)) {
                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str47$_A_is_not_a__A, tv_var, SBHL_FALSE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($WARN)) {
                                Errors.warn($str47$_A_is_not_a__A, tv_var, SBHL_FALSE_TV_P);
                            } else {
                                Errors.warn($str52$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror($$$continue_anyway, $str47$_A_is_not_a__A, tv_var, SBHL_FALSE_TV_P);
                            }


                }
                final SubLObject _prev_bind_0_$82 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                final SubLObject _prev_bind_1_$83 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                final SubLObject _prev_bind_2_$85 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_search_truth$.bind($$False_JustificationTruth, thread);
                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                    final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                    final SubLObject _prev_bind_0_$83 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                        final SubLObject _prev_bind_0_$84 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                            final SubLObject _prev_bind_0_$85 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$84 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$86 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                            final SubLObject _prev_bind_3_$91 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                            final SubLObject _prev_bind_4_$92 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                SubLObject needs_to_releaseP = NIL;
                                try {
                                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                    result = sbhl_what_mt_paths_from_node_to_node(node, goal_node);
                                } finally {
                                    if (NIL != needs_to_releaseP) {
                                        ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                    }
                                }
                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$92, thread);
                                sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$91, thread);
                                sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$86, thread);
                                sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$84, thread);
                                sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$85, thread);
                            }
                            if (source == $RESOURCE) {
                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$84, thread);
                        }
                        if (source == $RESOURCE) {
                            sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$83, thread);
                    }
                } finally {
                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$85, thread);
                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$83, thread);
                    sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$82, thread);
                }
            } finally {
                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$82, thread);
                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$81, thread);
            }
        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject sbhl_what_mt_paths_from_node_to_node(final SubLObject node1, final SubLObject node2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if (node1.equal(node2)) {
            result = list(list(mt_vars.$mt_root$.getGlobalValue()));
        } else {
            final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_type$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $sbhl_primary_what_mts_mt_paths$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $sbhl_primary_what_mts_inverse_mt_paths$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $sbhl_secondary_what_mts_mt_paths$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $sbhl_secondary_what_mts_inverse_mt_paths$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $sbhl_what_mts_goal$.currentBinding(thread);
            final SubLObject _prev_bind_9 = $sbhl_what_mts_behavior$.currentBinding(thread);
            try {
                sbhl_search_vars.$sbhl_search_type$.bind($WHAT_MTS, thread);
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                $sbhl_primary_what_mts_mt_paths$.bind(sbhl_marking_vars.instantiate_sbhl_marking_space(), thread);
                $sbhl_primary_what_mts_inverse_mt_paths$.bind(sbhl_marking_vars.instantiate_sbhl_marking_space(), thread);
                $sbhl_secondary_what_mts_mt_paths$.bind(sbhl_marking_vars.instantiate_sbhl_marking_space(), thread);
                $sbhl_secondary_what_mts_inverse_mt_paths$.bind(sbhl_marking_vars.instantiate_sbhl_marking_space(), thread);
                $sbhl_what_mts_goal$.bind(node2, thread);
                $sbhl_what_mts_behavior$.bind(determine_sbhl_what_mts_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                sbhl_apply_what_mts_behavior(node1);
                result = sbhl_what_mts_goal_final_mt_paths();
            } finally {
                $sbhl_what_mts_behavior$.rebind(_prev_bind_9, thread);
                $sbhl_what_mts_goal$.rebind(_prev_bind_8, thread);
                $sbhl_secondary_what_mts_inverse_mt_paths$.rebind(_prev_bind_7, thread);
                $sbhl_secondary_what_mts_mt_paths$.rebind(_prev_bind_6, thread);
                $sbhl_primary_what_mts_inverse_mt_paths$.rebind(_prev_bind_5, thread);
                $sbhl_primary_what_mts_mt_paths$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                sbhl_search_vars.$sbhl_search_type$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    public static SubLObject sbhl_min_mt_paths(final SubLObject mt_paths) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = mt_paths;
        SubLObject mt_path = NIL;
        mt_path = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            mt_path = mt_vars.minimize_mts_wrt_core(mt_path);
            final SubLObject min_mts_of_path = sbhl_search_methods.sbhl_min_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mt_path, UNPROVIDED, UNPROVIDED);
            SubLObject failP = NIL;
            if (NIL == failP) {
                SubLObject csome_list_var = result;
                SubLObject result_mt_path = NIL;
                result_mt_path = csome_list_var.first();
                while ((NIL == failP) && (NIL != csome_list_var)) {
                    if (NIL != subsetp(result_mt_path, min_mts_of_path, UNPROVIDED, UNPROVIDED)) {
                        failP = T;
                    }
                    if ((NIL == failP) && (NIL != subsetp(min_mts_of_path, result_mt_path, UNPROVIDED, UNPROVIDED))) {
                        result = remove(result_mt_path, result, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    csome_list_var = csome_list_var.rest();
                    result_mt_path = csome_list_var.first();
                } 
            }
            if (NIL == failP) {
                result = cons(min_mts_of_path, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mt_path = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject sbhl_min_mts_of_predicate_paths(final SubLObject module, final SubLObject node, final SubLObject goal_node, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_min_mt_paths(sbhl_predicate_mt_paths(module, node, goal_node, tv));
    }

    public static SubLObject sbhl_min_mts_of_inverse_paths(final SubLObject module, final SubLObject node, final SubLObject goal_node, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_min_mt_paths(sbhl_inverse_mt_paths(module, node, goal_node, tv));
    }

    public static SubLObject sbhl_min_mts_of_false_predicate_paths(final SubLObject module, final SubLObject node, final SubLObject goal_node, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_min_mt_paths(sbhl_false_predicate_mt_paths(module, node, goal_node, tv));
    }

    public static SubLObject sbhl_min_mts_of_false_inverse_paths(final SubLObject module, final SubLObject node, final SubLObject goal_node, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_min_mt_paths(sbhl_false_inverse_mt_paths(module, node, goal_node, tv));
    }

    public static SubLObject sbhl_max_floor_mts(final SubLObject mts) {
        return sbhl_search_methods.sbhl_max_floors(sbhl_module_vars.get_sbhl_module($$genlMt), mts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sbhl_max_floor_mts_of_paths(final SubLObject paths) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $sbhl_verify_naut_mt_relevance$.currentBinding(thread);
        try {
            $sbhl_verify_naut_mt_relevance$.bind(NIL, thread);
            result = sbhl_search_methods.sbhl_max_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), creduce(UNION, delete(NIL, Mapping.mapcar(SBHL_MAX_FLOOR_MTS, paths), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), ZERO_INTEGER, NIL, NIL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != sbhl_verify_naut_mt_relevance_p()) {
                sbhl_paranoia.sbhl_warn(ONE_INTEGER, $str64$Mts_might_not_be_valid_because_in, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        } finally {
            $sbhl_verify_naut_mt_relevance$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject sbhl_max_floor_mts_of_predicate_paths(final SubLObject module, final SubLObject node, final SubLObject goal_node, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_max_floor_mts_of_paths(sbhl_min_mts_of_predicate_paths(module, node, goal_node, tv));
    }

    public static SubLObject sbhl_max_floor_mts_of_inverse_paths(final SubLObject module, final SubLObject node, final SubLObject goal_node, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_max_floor_mts_of_paths(sbhl_min_mts_of_inverse_paths(module, node, goal_node, tv));
    }

    public static SubLObject sbhl_max_floor_mts_of_false_predicate_paths(final SubLObject module, final SubLObject node, final SubLObject goal_node, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_max_floor_mts_of_paths(sbhl_min_mts_of_false_predicate_paths(module, node, goal_node, tv));
    }

    public static SubLObject sbhl_max_floor_mts_of_false_inverse_paths(final SubLObject module, final SubLObject node, final SubLObject goal_node, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_max_floor_mts_of_paths(sbhl_min_mts_of_false_inverse_paths(module, node, goal_node, tv));
    }

    public static SubLObject sbhl_mt_table_of_floors_for_predicate_path(final SubLObject module, final SubLObject node, final SubLObject goal_node, SubLObject mt_table, SubLObject tv) {
        if (mt_table == UNPROVIDED) {
            mt_table = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        final SubLObject min_mts = sbhl_min_mts_of_predicate_paths(module, node, goal_node, tv);
        SubLObject new_mt_table = (NIL != mt_table) ? mt_table : sbhl_marking_vars.instantiate_sbhl_marking_space();
        if (NIL == min_mts) {
            return $NONE;
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            new_mt_table = sbhl_floors_in_space(sbhl_module_vars.get_sbhl_module($$genlMt), min_mts, new_mt_table, NIL, tv);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return new_mt_table;
    }

    public static SubLObject sbhl_floors_in_space(final SubLObject module, final SubLObject nodes, final SubLObject space, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$93 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$94 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2_$95 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject tv_var = tv;
                final SubLObject _prev_bind_0_$94 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_1_$95 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str47$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str47$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str47$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str52$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str47$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$95 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$96 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$96 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                        final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                        final SubLObject _prev_bind_0_$96 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                            final SubLObject _prev_bind_0_$97 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                final SubLObject _prev_bind_0_$98 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$97 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$97 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_3_$106 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_4_$107 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                    SubLObject needs_to_releaseP = NIL;
                                    try {
                                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                        sbhl_closure_intersection_in_space(nodes, space);
                                    } finally {
                                        if (NIL != needs_to_releaseP) {
                                            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$107, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$106, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$97, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$97, thread);
                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$98, thread);
                                }
                                if (source == $RESOURCE) {
                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$97, thread);
                            }
                            if (source == $RESOURCE) {
                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$96, thread);
                        }
                    } finally {
                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$96, thread);
                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$96, thread);
                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$95, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$95, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$94, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$95, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$94, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$93, thread);
            }
        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return space;
    }

    public static SubLObject sbhl_closure_intersection_in_space(final SubLObject nodes, final SubLObject n_space) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_nodes = sbhl_sort_by_least_inverse_cardinality(list_utilities.fast_delete_duplicates(nodes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
        final SubLObject redux_module = (NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(sbhl_module_vars.get_sbhl_module(UNPROVIDED))) ? sbhl_module_utilities.get_sbhl_reductions_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED)) : sbhl_module_vars.get_sbhl_module(UNPROVIDED);
        final SubLObject redux_behavior = sbhl_search_utilities.determine_sbhl_search_behavior(redux_module, sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv());
        if (NIL != nodes) {
            if (NIL != list_utilities.singletonP(nodes)) {
                final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                final SubLObject _prev_bind_6 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_search_module$.bind(redux_module, thread);
                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(redux_module), thread);
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(redux_module), thread);
                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                    sbhl_module_vars.$sbhl_module$.bind(redux_module, thread);
                    sbhl_search_vars.$sbhl_search_behavior$.bind(redux_behavior, thread);
                    sbhl_marking_methods.sbhl_mark_closure_in_space(nodes.first(), n_space);
                } finally {
                    sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_6, thread);
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
                }
            } else {
                SubLObject empty_intersectionP = NIL;
                SubLObject minimal_intersection = NIL;
                if (NIL != sbhl_marking_utilities.empty_sbhl_space_p(n_space)) {
                    final SubLObject initial_node = nodes.first();
                    new_nodes = nodes.rest();
                    sbhl_marking_methods.sbhl_mark_closure_in_space(initial_node, n_space);
                }
                final SubLObject _prev_bind_7 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
                final SubLObject _prev_bind_8 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_target_space$.bind(n_space, thread);
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        if (NIL == empty_intersectionP) {
                            SubLObject csome_list_var = new_nodes;
                            SubLObject node = NIL;
                            node = csome_list_var.first();
                            while ((NIL == empty_intersectionP) && (NIL != csome_list_var)) {
                                minimal_intersection = sbhl_search_methods.sbhl_mark_closure_up_to_horizon(node);
                                final SubLObject _prev_bind_0_$108 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                    if (NIL != minimal_intersection) {
                                        final SubLObject _prev_bind_0_$109 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$110 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                        final SubLObject _prev_bind_9 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                        final SubLObject _prev_bind_10 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        final SubLObject _prev_bind_11 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        final SubLObject _prev_bind_12 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_module$.bind(redux_module, thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(redux_module), thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(redux_module), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_module_vars.$sbhl_module$.bind(redux_module, thread);
                                            sbhl_search_vars.$sbhl_search_behavior$.bind(redux_behavior, thread);
                                            sbhl_marking_vars.clear_sbhl_target_space();
                                            final SubLObject _prev_bind_0_$110 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
                                                SubLObject cdolist_list_var = minimal_intersection;
                                                SubLObject common_node = NIL;
                                                common_node = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    sbhl_marking_methods.sbhl_mark_closure_as_marked(common_node);
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    common_node = cdolist_list_var.first();
                                                } 
                                            } finally {
                                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$110, thread);
                                            }
                                            final SubLObject _prev_bind_0_$111 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            try {
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_link_vars.get_sbhl_opposite_link_direction(), thread);
                                                SubLObject cdolist_list_var = minimal_intersection;
                                                SubLObject common_node = NIL;
                                                common_node = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    sbhl_marking_methods.sbhl_unmark_marked_closure(common_node);
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    common_node = cdolist_list_var.first();
                                                } 
                                            } finally {
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_0_$111, thread);
                                            }
                                        } finally {
                                            sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_12, thread);
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_11, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_10, thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_9, thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$110, thread);
                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$109, thread);
                                        }
                                    } else {
                                        sbhl_marking_vars.clear_sbhl_target_space();
                                        empty_intersectionP = T;
                                    }
                                } finally {
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_0_$108, thread);
                                }
                                csome_list_var = csome_list_var.rest();
                                node = csome_list_var.first();
                            } 
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$112 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$112, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_8, thread);
                    sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_7, thread);
                }
            }
        }
        return n_space;
    }

    public static SubLObject sbhl_sort_by_least_inverse_cardinality(final SubLObject nodes, SubLObject module) {
        if (module == UNPROVIDED) {
            module = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if (NIL != module) {
            final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(module, thread);
                result = Sort.sort(nodes, $sym66$SBHL_INVERSE_CARDINALITY_, UNPROVIDED);
            } finally {
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
            }
        } else {
            result = Sort.sort(nodes, $sym66$SBHL_INVERSE_CARDINALITY_, UNPROVIDED);
        }
        return result;
    }

    public static SubLObject sbhl_inverse_cardinalityL(final SubLObject node1, final SubLObject node2) {
        return numL(sbhl_module_utilities.sbhl_inverse_cardinality(sbhl_module_utilities.get_sbhl_link_pred(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), node1), sbhl_module_utilities.sbhl_inverse_cardinality(sbhl_module_utilities.get_sbhl_link_pred(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), node2));
    }

    public static SubLObject declare_sbhl_search_what_mts_file() {
        declareMacro(me, "sbhl_rebind_path_mts", "SBHL-REBIND-PATH-MTS");
        declareFunction(me, "possibly_update_sbhl_path_mts", "POSSIBLY-UPDATE-SBHL-PATH-MTS", 2, 0, false);
        declareMacro(me, "with_new_sbhl_what_mts_marking_spaces", "WITH-NEW-SBHL-WHAT-MTS-MARKING-SPACES");
        declareFunction(me, "sbhl_primary_what_mts_spaces", "SBHL-PRIMARY-WHAT-MTS-SPACES", 0, 0, false);
        declareFunction(me, "sbhl_secondary_what_mts_spaces", "SBHL-SECONDARY-WHAT-MTS-SPACES", 0, 0, false);
        declareMacro(me, "within_sbhl_what_mts_spaces", "WITHIN-SBHL-WHAT-MTS-SPACES");
        declareFunction(me, "get_sbhl_what_mts_marking_space", "GET-SBHL-WHAT-MTS-MARKING-SPACE", 0, 0, false);
        declareFunction(me, "get_sbhl_what_mts_marking", "GET-SBHL-WHAT-MTS-MARKING", 1, 0, false);
        declareFunction(me, "sbhl_what_mts_mark_mt_paths_to_node", "SBHL-WHAT-MTS-MARK-MT-PATHS-TO-NODE", 1, 0, false);
        declareFunction(me, "sbhl_what_mts_marking_subsumes_marking_p", "SBHL-WHAT-MTS-MARKING-SUBSUMES-MARKING-P", 1, 0, false);
        declareFunction(me, "determine_sbhl_link_mt", "DETERMINE-SBHL-LINK-MT", 2, 0, false);
        declareFunction(me, "sbhl_encountered_difficult_naut_mt_generator", "SBHL-ENCOUNTERED-DIFFICULT-NAUT-MT-GENERATOR", 0, 0, false);
        declareMacro(me, "with_new_naut_mt_relevance_verification", "WITH-NEW-NAUT-MT-RELEVANCE-VERIFICATION");
        declareFunction(me, "sbhl_verify_naut_mt_relevance_p", "SBHL-VERIFY-NAUT-MT-RELEVANCE-P", 0, 0, false);
        declareMacro(me, "with_sbhl_what_mts_map_function", "WITH-SBHL-WHAT-MTS-MAP-FUNCTION");
        declareFunction(me, "get_sbhl_what_mts_map_function", "GET-SBHL-WHAT-MTS-MAP-FUNCTION", 0, 0, false);
        declareFunction(me, "sbhl_what_mts_not_mapping_p", "SBHL-WHAT-MTS-NOT-MAPPING-P", 0, 0, false);
        declareFunction(me, "sbhl_apply_what_mts_map_function", "SBHL-APPLY-WHAT-MTS-MAP-FUNCTION", 1, 0, false);
        declareFunction(me, "get_sbhl_what_mts_goal", "GET-SBHL-WHAT-MTS-GOAL", 0, 0, false);
        declareMacro(me, "with_sbhl_what_mts_goal", "WITH-SBHL-WHAT-MTS-GOAL");
        declareFunction(me, "sbhl_what_mts_goal_p", "SBHL-WHAT-MTS-GOAL-P", 1, 0, false);
        declareFunction(me, "sbhl_what_mts_proper_mark_p", "SBHL-WHAT-MTS-PROPER-MARK-P", 1, 0, false);
        declareFunction(me, "sbhl_what_mts_proper_goal_mark_p", "SBHL-WHAT-MTS-PROPER-GOAL-MARK-P", 1, 0, false);
        declareFunction(me, "sbhl_what_mts_mark_and_sweep", "SBHL-WHAT-MTS-MARK-AND-SWEEP", 1, 0, false);
        declareFunction(me, "sbhl_what_mts_mark_and_sweep_marked_nodes", "SBHL-WHAT-MTS-MARK-AND-SWEEP-MARKED-NODES", 1, 0, false);
        declareFunction(me, "sbhl_what_mts_step_across_links", "SBHL-WHAT-MTS-STEP-ACROSS-LINKS", 1, 0, false);
        declareFunction(me, "sbhl_what_mts_step_across_marked_links", "SBHL-WHAT-MTS-STEP-ACROSS-MARKED-LINKS", 1, 0, false);
        declareFunction(me, "sbhl_what_mts_step_and_update_links", "SBHL-WHAT-MTS-STEP-AND-UPDATE-LINKS", 1, 0, false);
        declareFunction(me, "sbhl_what_mts_sweep", "SBHL-WHAT-MTS-SWEEP", 6, 0, false);
        declareFunction(me, "sbhl_what_mts_sweep_marked", "SBHL-WHAT-MTS-SWEEP-MARKED", 7, 0, false);
        declareFunction(me, "sbhl_what_mts_step", "SBHL-WHAT-MTS-STEP", 5, 0, false);
        declareFunction(me, "sbhl_what_mts_step_marked", "SBHL-WHAT-MTS-STEP-MARKED", 6, 0, false);
        declareFunction(me, "sbhl_what_mts_step_and_update_mts", "SBHL-WHAT-MTS-STEP-AND-UPDATE-MTS", 6, 0, false);
        declareFunction(me, "sbhl_simple_true_what_mts_search", "SBHL-SIMPLE-TRUE-WHAT-MTS-SEARCH", 1, 0, false);
        declareFunction(me, "sbhl_simple_false_what_mts_search", "SBHL-SIMPLE-FALSE-WHAT-MTS-SEARCH", 1, 0, false);
        declareFunction(me, "sbhl_false_what_mts_step", "SBHL-FALSE-WHAT-MTS-STEP", 1, 0, false);
        declareFunction(me, "sbhl_false_what_mts_sweep", "SBHL-FALSE-WHAT-MTS-SWEEP", 1, 0, false);
        declareFunction(me, "sbhl_tt_what_mts_search", "SBHL-TT-WHAT-MTS-SEARCH", 1, 0, false);
        declareFunction(me, "sbhl_what_mts_tt_sweep", "SBHL-WHAT-MTS-TT-SWEEP", 1, 0, false);
        declareFunction(me, "sbhl_what_mts_tt_backward_search", "SBHL-WHAT-MTS-TT-BACKWARD-SEARCH", 1, 0, false);
        declareFunction(me, "sbhl_what_mts_tt_step", "SBHL-WHAT-MTS-TT-STEP", 1, 0, false);
        declareFunction(me, "sbhl_what_mts_premark_disjoins", "SBHL-WHAT-MTS-PREMARK-DISJOINS", 1, 0, false);
        declareFunction(me, "sbhl_what_mts_true_disjoins_search", "SBHL-WHAT-MTS-TRUE-DISJOINS-SEARCH", 1, 0, false);
        declareFunction(me, "sbhl_what_mts_step_across_marked_disjoins", "SBHL-WHAT-MTS-STEP-ACROSS-MARKED-DISJOINS", 1, 0, false);
        declareFunction(me, "sbhl_what_mts_sweep_marked_disjoins", "SBHL-WHAT-MTS-SWEEP-MARKED-DISJOINS", 1, 0, false);
        declareFunction(me, "get_sbhl_what_mts_sweep_disjoins_module", "GET-SBHL-WHAT-MTS-SWEEP-DISJOINS-MODULE", 0, 0, false);
        declareFunction(me, "sbhl_what_mts_false_disjoins_search", "SBHL-WHAT-MTS-FALSE-DISJOINS-SEARCH", 1, 0, false);
        declareFunction(me, "sbhl_what_mts_sweep_forward_step_and_sweep_false_disjoins", "SBHL-WHAT-MTS-SWEEP-FORWARD-STEP-AND-SWEEP-FALSE-DISJOINS", 1, 0, false);
        declareFunction(me, "sbhl_what_mts_sweep_false_disjoins", "SBHL-WHAT-MTS-SWEEP-FALSE-DISJOINS", 1, 0, false);
        declareFunction(me, "determine_sbhl_what_mts_behavior", "DETERMINE-SBHL-WHAT-MTS-BEHAVIOR", 3, 0, false);
        declareFunction(me, "get_sbhl_what_mts_behavior", "GET-SBHL-WHAT-MTS-BEHAVIOR", 0, 0, false);
        declareMacro(me, "bind_sbhl_what_mts_behavior", "BIND-SBHL-WHAT-MTS-BEHAVIOR");
        declareFunction(me, "sbhl_apply_what_mts_behavior", "SBHL-APPLY-WHAT-MTS-BEHAVIOR", 1, 0, false);
        declareFunction(me, "sbhl_what_mts_terminating_space", "SBHL-WHAT-MTS-TERMINATING-SPACE", 0, 0, false);
        declareFunction(me, "sbhl_what_mts_final_mt_paths", "SBHL-WHAT-MTS-FINAL-MT-PATHS", 1, 0, false);
        declareFunction(me, "sbhl_what_mts_goal_final_mt_paths", "SBHL-WHAT-MTS-GOAL-FINAL-MT-PATHS", 0, 0, false);
        declareFunction(me, "sbhl_predicate_mt_paths", "SBHL-PREDICATE-MT-PATHS", 3, 1, false);
        declareFunction(me, "sbhl_inverse_mt_paths", "SBHL-INVERSE-MT-PATHS", 3, 1, false);
        declareFunction(me, "sbhl_false_predicate_mt_paths", "SBHL-FALSE-PREDICATE-MT-PATHS", 3, 1, false);
        declareFunction(me, "sbhl_false_inverse_mt_paths", "SBHL-FALSE-INVERSE-MT-PATHS", 3, 1, false);
        declareFunction(me, "sbhl_what_mt_paths_from_node_to_node", "SBHL-WHAT-MT-PATHS-FROM-NODE-TO-NODE", 2, 0, false);
        declareFunction(me, "sbhl_min_mt_paths", "SBHL-MIN-MT-PATHS", 1, 0, false);
        declareFunction(me, "sbhl_min_mts_of_predicate_paths", "SBHL-MIN-MTS-OF-PREDICATE-PATHS", 3, 1, false);
        declareFunction(me, "sbhl_min_mts_of_inverse_paths", "SBHL-MIN-MTS-OF-INVERSE-PATHS", 3, 1, false);
        declareFunction(me, "sbhl_min_mts_of_false_predicate_paths", "SBHL-MIN-MTS-OF-FALSE-PREDICATE-PATHS", 3, 1, false);
        declareFunction(me, "sbhl_min_mts_of_false_inverse_paths", "SBHL-MIN-MTS-OF-FALSE-INVERSE-PATHS", 3, 1, false);
        declareFunction(me, "sbhl_max_floor_mts", "SBHL-MAX-FLOOR-MTS", 1, 0, false);
        new sbhl_search_what_mts.$sbhl_max_floor_mts$UnaryFunction();
        declareFunction(me, "sbhl_max_floor_mts_of_paths", "SBHL-MAX-FLOOR-MTS-OF-PATHS", 1, 0, false);
        declareFunction(me, "sbhl_max_floor_mts_of_predicate_paths", "SBHL-MAX-FLOOR-MTS-OF-PREDICATE-PATHS", 3, 1, false);
        declareFunction(me, "sbhl_max_floor_mts_of_inverse_paths", "SBHL-MAX-FLOOR-MTS-OF-INVERSE-PATHS", 3, 1, false);
        declareFunction(me, "sbhl_max_floor_mts_of_false_predicate_paths", "SBHL-MAX-FLOOR-MTS-OF-FALSE-PREDICATE-PATHS", 3, 1, false);
        declareFunction(me, "sbhl_max_floor_mts_of_false_inverse_paths", "SBHL-MAX-FLOOR-MTS-OF-FALSE-INVERSE-PATHS", 3, 1, false);
        declareFunction(me, "sbhl_mt_table_of_floors_for_predicate_path", "SBHL-MT-TABLE-OF-FLOORS-FOR-PREDICATE-PATH", 3, 2, false);
        declareFunction(me, "sbhl_floors_in_space", "SBHL-FLOORS-IN-SPACE", 3, 2, false);
        declareFunction(me, "sbhl_closure_intersection_in_space", "SBHL-CLOSURE-INTERSECTION-IN-SPACE", 2, 0, false);
        declareFunction(me, "sbhl_sort_by_least_inverse_cardinality", "SBHL-SORT-BY-LEAST-INVERSE-CARDINALITY", 1, 1, false);
        declareFunction(me, "sbhl_inverse_cardinalityL", "SBHL-INVERSE-CARDINALITY<", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_sbhl_search_what_mts_file() {
        defparameter("*SBHL-PATH-MTS*", NIL);
        defparameter("*SBHL-WHAT-MTS-MT-PATHS*", NIL);
        defparameter("*SBHL-WHAT-MTS-INVERSE-MT-PATHS*", NIL);
        defparameter("*SBHL-PRIMARY-WHAT-MTS-MT-PATHS*", NIL);
        defparameter("*SBHL-PRIMARY-WHAT-MTS-INVERSE-MT-PATHS*", NIL);
        defparameter("*SBHL-SECONDARY-WHAT-MTS-MT-PATHS*", NIL);
        defparameter("*SBHL-SECONDARY-WHAT-MTS-INVERSE-MT-PATHS*", NIL);
        defparameter("*SBHL-VERIFY-NAUT-MT-RELEVANCE*", NIL);
        defparameter("*SBHL-WHAT-MTS-MAP-FUNCTION*", NIL);
        defparameter("*SBHL-WHAT-MTS-GOAL*", NIL);
        defparameter("*SBHL-WHAT-MTS-BEHAVIOR*", NIL);
        return NIL;
    }

    public static SubLObject setup_sbhl_search_what_mts_file() {
        register_macro_helper(POSSIBLY_UPDATE_SBHL_PATH_MTS, SBHL_REBIND_PATH_MTS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sbhl_search_what_mts_file();
    }

    @Override
    public void initializeVariables() {
        init_sbhl_search_what_mts_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sbhl_search_what_mts_file();
    }

    static {















































































    }

    public static final class $sbhl_max_floor_mts$UnaryFunction extends UnaryFunction {
        public $sbhl_max_floor_mts$UnaryFunction() {
            super(extractFunctionNamed("SBHL-MAX-FLOOR-MTS"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sbhl_max_floor_mts(arg1);
        }
    }
}

/**
 * Total time: 1112 ms
 */
