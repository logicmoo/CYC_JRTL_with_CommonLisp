package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.gt_vars;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.gt_vars.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class gt_vars extends SubLTranslatedFile {
    public static final SubLFile me = new gt_vars();

    public static final String myName = "com.cyc.cycjava.cycl.gt_vars";

    public static final String myFingerPrint = "0c532b9731ef46bee9d9391f28a27653672de74600354b652fac5a797a0ac394";































    // defparameter
    public static final SubLSymbol $gt_doneP$ = makeSymbol("*GT-DONE?*");

    // defparameter
    public static final SubLSymbol $gt_searchedP$ = makeSymbol("*GT-SEARCHED?*");





























    // defparameter
    public static final SubLSymbol $gt_use_spec_predsP$ = makeSymbol("*GT-USE-SPEC-PREDS?*");

    // defparameter
    public static final SubLSymbol $gt_handle_non_transitive_predicateP$ = makeSymbol("*GT-HANDLE-NON-TRANSITIVE-PREDICATE?*");

    // defparameter
    // the current link assertion or hl support.
    public static final SubLSymbol $gt_link_support$ = makeSymbol("*GT-LINK-SUPPORT*");



















    // defparameter
    public static final SubLSymbol $gt_depth_cutoffP$ = makeSymbol("*GT-DEPTH-CUTOFF?*");



    // defparameter
    public static final SubLSymbol $gt_time_cutoffP$ = makeSymbol("*GT-TIME-CUTOFF?*");





    // defparameter
    public static final SubLSymbol $gt_answers_cutoffP$ = makeSymbol("*GT-ANSWERS-CUTOFF?*");









    // defparameter
    public static final SubLSymbol $gt_edge_list_returnP$ = makeSymbol("*GT-EDGE-LIST-RETURN?*");









    // defparameter
    public static final SubLSymbol $suspend_gt_type_checkingP$ = makeSymbol("*SUSPEND-GT-TYPE-CHECKING?*");



    // defparameter
    public static final SubLSymbol $gt_use_sksiP$ = makeSymbol("*GT-USE-SKSI?*");























    // defparameter
    public static final SubLSymbol $tt_transitive_conduitP$ = makeSymbol("*TT-TRANSITIVE-CONDUIT?*");

    // defparameter
    public static final SubLSymbol $gt_transitive_via_arg_activeP$ = makeSymbol("*GT-TRANSITIVE-VIA-ARG-ACTIVE?*");

    // defparameter
    public static final SubLSymbol $gt_within_transitive_via_argP$ = makeSymbol("*GT-WITHIN-TRANSITIVE-VIA-ARG?*");

    // Internal Constants
    public static final SubLList $list0 = list(new SubLObject[]{ list(makeKeyword("SUPERIORS"), makeSymbol("GTM-SUPERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("INFERIORS"), makeSymbol("GTM-INFERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("MIN-SUPERIORS"), makeSymbol("GTM-MIN-SUPERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("MAX-INFERIORS"), makeSymbol("GTM-MAX-INFERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("CO-INFERIORS"), makeSymbol("GTM-CO-INFERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("CO-SUPERIORS"), makeSymbol("GTM-CO-SUPERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("REDUNDANT-SUPERIORS"), makeSymbol("GTM-REDUNDANT-SUPERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("REDUNDANT-INFERIORS"), makeSymbol("GTM-REDUNDANT-INFERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("ALL-SUPERIORS"), makeSymbol("GTM-ALL-SUPERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("ALL-INFERIORS"), makeSymbol("GTM-ALL-INFERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("ALL-ACCESSIBLE"), makeSymbol("GTM-ALL-ACCESSIBLE"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("UNION-ALL-INFERIORS"), makeSymbol("GTM-UNION-ALL-INFERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("COMPOSE-FN-SUPERIORS"), makeSymbol("GTM-COMPOSE-FN-ALL-SUPERIORS"), list(makeSymbol("FORT"), makeSymbol("FN"), makeSymbol("&OPTIONAL"), list(makeSymbol("COMBINE-FN"), list(makeSymbol("QUOTE"), makeSymbol("NCONC"))), makeSymbol("MT"))), list(makeKeyword("COMPOSE-FN-INFERIORS"), makeSymbol("GTM-COMPOSE-FN-ALL-INFERIORS"), list(makeSymbol("FORT"), makeSymbol("FN"), makeSymbol("&OPTIONAL"), list(makeSymbol("COMBINE-FN"), list(makeSymbol("QUOTE"), makeSymbol("NCONC"))), makeSymbol("MT"))), list(makeKeyword("ALL-DEPENDENT-INFERIORS"), makeSymbol("GTM-ALL-DEPENDENT-INFERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("COMPOSE-PRED-SUPERIORS"), makeSymbol("GTM-COMPOSE-PRED-ALL-SUPERIORS"), list(makeSymbol("FORT"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), list(makeSymbol("INDEX"), ONE_INTEGER), list(makeSymbol("GATHER"), TWO_INTEGER), makeSymbol("MT"))), list(makeKeyword("COMPOSE-PRED-INFERIORS"), makeSymbol("GTM-COMPOSE-PRED-ALL-INFERIORS"), list(makeSymbol("FORT"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), list(makeSymbol("INDEX"), ONE_INTEGER), list(makeSymbol("GATHER"), TWO_INTEGER), makeSymbol("MT"))), list(makeKeyword("ROOTS"), makeSymbol("GTM-ROOTS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("LEAVES"), makeSymbol("GTM-LEAVES"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("BOOLEAN?"), makeSymbol("GTM-BOOLEAN?"), list(makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("SUPERIOR?"), makeSymbol("GTM-SUPERIOR?"), list(makeSymbol("SUPERIOR"), makeSymbol("INFERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("INFERIOR?"), makeSymbol("GTM-INFERIOR?"), list(makeSymbol("INFERIOR"), makeSymbol("SUPERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("HAS-SUPERIOR?"), makeSymbol("GTM-HAS-SUPERIOR?"), list(makeSymbol("INFERIOR"), makeSymbol("SUPERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("HAS-INFERIOR?"), makeSymbol("GTM-HAS-INFERIOR?"), list(makeSymbol("SUPERIOR"), makeSymbol("INFERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("GATHER-SUPERIOR"), makeSymbol("GTM-GATHER-SUPERIOR"), list(makeSymbol("SPEC"), makeSymbol("GATHER-FN"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("GATHER-INFERIOR"), makeSymbol("GTM-GATHER-INFERIOR"), list(makeSymbol("GENL"), makeSymbol("GATHER-FN"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("CYCLES?"), makeSymbol("GTM-CYCLES?"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("COMPLETES-CYCLE?"), makeSymbol("GTM-COMPLETES-CYCLE?"), list(makeSymbol("FORT-1"), makeSymbol("FORT-2"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("MIN-NODES"), makeSymbol("GTM-MIN-NODES"), list(makeSymbol("FORTS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("MAX-NODES"), makeSymbol("GTM-MAX-NODES"), list(makeSymbol("FORTS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("MIN-CEILINGS"), makeSymbol("GTM-MIN-CEILINGS"), list(makeSymbol("FORTS"), makeSymbol("&OPTIONAL"), makeSymbol("CANDIDATES"), makeSymbol("MT"))), list(makeKeyword("MAX-FLOORS"), makeSymbol("GTM-MAX-FLOORS"), list(makeSymbol("FORTS"), makeSymbol("&OPTIONAL"), makeSymbol("CANDIDATES"), makeSymbol("MT"))), list(makeKeyword("MIN-SUPERIORS-EXCLUDING"), makeSymbol("GTM-MIN-SUPERIORS-EXCLUDING"), list(makeSymbol("INFERIOR"), makeSymbol("SUPERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("MAX-INFERIORS-EXCLUDING"), makeSymbol("GTM-MAX-INFERIORS-EXCLUDING"), list(makeSymbol("SUPERIOR"), makeSymbol("INFERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("ANY-SUPERIOR-PATH"), makeSymbol("GTM-ANY-SUPERIOR-PATH"), list(makeSymbol("INFERIOR"), makeSymbol("SUPERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("WHY-SUPERIOR?"), makeSymbol("GTM-WHY-SUPERIOR?"), list(makeSymbol("SUPERIOR"), makeSymbol("INFERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("WHY-COMPLETES-CYCLE?"), makeSymbol("GTM-WHY-COMPLETES-CYCLE?"), list(makeSymbol("FORT1"), makeSymbol("FORT2"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("ALL-SUPERIOR-EDGES"), makeSymbol("GTM-ALL-SUPERIOR-EDGES"), list(makeSymbol("INFERIOR"), makeSymbol("SUPERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("ALL-INFERIOR-EDGES"), makeSymbol("GTM-ALL-INFERIOR-EDGES"), list(makeSymbol("INFERIOR"), makeSymbol("SUPERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("ALL-PATHS"), makeSymbol("GTM-ALL-PATHS"), list(makeSymbol("INFERIOR"), makeSymbol("SUPERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("INFERIORS-WITH-MTS"), makeSymbol("GTM-ALL-INFERIORS-WITH-MTS"), list(makeSymbol("SUPERIOR"))), list(makeKeyword("SUPERIOR-IN-WHAT-MTS"), makeSymbol("GTM-IN-WHAT-MTS"), list(makeSymbol("INFERIOR"), makeSymbol("SUPERIOR"), makeSymbol("KEY-METHOD"))), list(makeKeyword("INFERIOR-IN-WHAT-MTS"), makeSymbol("GTM-IN-WHAT-MTS"), list(makeSymbol("SUPERIOR"), makeSymbol("INFERIOR"), makeSymbol("KEY-METHOD"))), list(makeKeyword("ACCESSIBLE-IN-WHAT-MTS"), makeSymbol("GTM-ACCESSIBLE-IN-WHAT-MTS"), list(makeSymbol("INFERIOR"), makeSymbol("SUPERIOR"), makeSymbol("KEY-METHOD"))) });

    public static final SubLSymbol $gt_dispatch_table$ = makeSymbol("*GT-DISPATCH-TABLE*");



    public static final SubLSymbol $gt_methods$ = makeSymbol("*GT-METHODS*");

    private static final SubLList $list4 = list(makeKeyword("PREDICATE"), makeKeyword("INDEX-ARG"), makeKeyword("GATHER-ARG"), makeKeyword("ACCESSORS"), makeKeyword("MT"));

    public static final SubLSymbol $gt_parameters$ = makeSymbol("*GT-PARAMETERS*");

    public static final SubLSymbol $transitivity_modules$ = makeSymbol("*TRANSITIVITY-MODULES*");

    public static final SubLSymbol $gt_pred$ = makeSymbol("*GT-PRED*");

    public static final SubLSymbol $gt_index$ = makeSymbol("*GT-INDEX*");

    public static final SubLSymbol $gt_gather$ = makeSymbol("*GT-GATHER*");

    public static final SubLSymbol $gt_index_arg$ = makeSymbol("*GT-INDEX-ARG*");

    public static final SubLSymbol $gt_gather_arg$ = makeSymbol("*GT-GATHER-ARG*");

    public static final SubLSymbol $gt_accessors$ = makeSymbol("*GT-ACCESSORS*");



    public static final SubLSymbol $gt_link_type$ = makeSymbol("*GT-LINK-TYPE*");



    public static final SubLSymbol $gt_mode$ = makeSymbol("*GT-MODE*");

    private static final SubLList $list17 = list(makeKeyword("SUPERIOR"), makeKeyword("INFERIOR"), makeKeyword("ACCESSIBLE"), makeKeyword("DIRECTED"), makeKeyword("INVERSE"));

    public static final SubLSymbol $gt_modes$ = makeSymbol("*GT-MODES*");



    public static final SubLSymbol $gt_truth$ = makeSymbol("*GT-TRUTH*");

    public static final SubLSymbol $gt_query$ = makeSymbol("*GT-QUERY*");

    private static final SubLSymbol $sym22$_GT_DONE__ = makeSymbol("*GT-DONE?*");

    private static final SubLSymbol $sym23$_GT_SEARCHED__ = makeSymbol("*GT-SEARCHED?*");

    public static final SubLSymbol $gt_target$ = makeSymbol("*GT-TARGET*");

    public static final SubLSymbol $gt_result$ = makeSymbol("*GT-RESULT*");

    public static final SubLSymbol $gt_searcher$ = makeSymbol("*GT-SEARCHER*");

    public static final SubLSymbol $gt_base_fn$ = makeSymbol("*GT-BASE-FN*");

    public static final SubLSymbol $gt_step_fn$ = makeSymbol("*GT-STEP-FN*");

    public static final SubLSymbol $gt_compose_fn$ = makeSymbol("*GT-COMPOSE-FN*");

    public static final SubLSymbol $gt_gather_fn$ = makeSymbol("*GT-GATHER-FN*");



    public static final SubLSymbol $gt_combine_fn$ = makeSymbol("*GT-COMBINE-FN*");

    public static final SubLSymbol $gt_compare_fn$ = makeSymbol("*GT-COMPARE-FN*");

    public static final SubLSymbol $gt_equality_fn$ = makeSymbol("*GT-EQUALITY-FN*");

    public static final SubLSymbol $gt_compose_pred$ = makeSymbol("*GT-COMPOSE-PRED*");

    public static final SubLSymbol $gt_compose_index_arg$ = makeSymbol("*GT-COMPOSE-INDEX-ARG*");

    public static final SubLSymbol $gt_compose_gather_arg$ = makeSymbol("*GT-COMPOSE-GATHER-ARG*");



    public static final SubLSymbol $gt_max_nodes_direction$ = makeSymbol("*GT-MAX-NODES-DIRECTION*");

    private static final SubLSymbol $sym40$_GT_USE_SPEC_PREDS__ = makeSymbol("*GT-USE-SPEC-PREDS?*");

    private static final SubLSymbol $sym41$_GT_HANDLE_NON_TRANSITIVE_PREDICATE__ = makeSymbol("*GT-HANDLE-NON-TRANSITIVE-PREDICATE?*");

    private static final SubLString $str42$Current_link_support__a_is_not_a_ = makeString("Current link support ~a is not a valid support for determining link mt.");

    private static final SubLString $str43$Current_link_support__a_is_not_a_ = makeString("Current link support ~a is not a valid support for determining link predicate.");

    public static final SubLSymbol $gt_what_mts_result$ = makeSymbol("*GT-WHAT-MTS-RESULT*");

    public static final SubLSymbol $gt_what_mts_goal_node$ = makeSymbol("*GT-WHAT-MTS-GOAL-NODE*");

    public static final SubLSymbol $gt_path_list_of_mts$ = makeSymbol("*GT-PATH-LIST-OF-MTS*");

    public static final SubLSymbol $gt_path_list_of_nodes$ = makeSymbol("*GT-PATH-LIST-OF-NODES*");

    public static final SubLSymbol $gt_path_length$ = makeSymbol("*GT-PATH-LENGTH*");

    public static final SubLSymbol $gt_list_of_path_lengths$ = makeSymbol("*GT-LIST-OF-PATH-LENGTHS*");

    public static final SubLSymbol $gt_marking_table$ = makeSymbol("*GT-MARKING-TABLE*");

    public static final SubLSymbol $gt_target_marking_table$ = makeSymbol("*GT-TARGET-MARKING-TABLE*");

    public static final SubLSymbol $gt_depth_cutoff$ = makeSymbol("*GT-DEPTH-CUTOFF*");

    private static final SubLSymbol $sym53$_GT_DEPTH_CUTOFF__ = makeSymbol("*GT-DEPTH-CUTOFF?*");

    public static final SubLSymbol $gt_prev_depth_cutoff$ = makeSymbol("*GT-PREV-DEPTH-CUTOFF*");

    private static final SubLSymbol $sym55$_GT_TIME_CUTOFF__ = makeSymbol("*GT-TIME-CUTOFF?*");

    public static final SubLSymbol $gt_time_cutoff$ = makeSymbol("*GT-TIME-CUTOFF*");

    public static final SubLSymbol $gt_initial_time$ = makeSymbol("*GT-INITIAL-TIME*");

    private static final SubLSymbol $sym58$_GT_ANSWERS_CUTOFF__ = makeSymbol("*GT-ANSWERS-CUTOFF?*");

    public static final SubLSymbol $gt_answers_cutoff$ = makeSymbol("*GT-ANSWERS-CUTOFF*");

    public static final SubLSymbol $gt_answers_so_far$ = makeSymbol("*GT-ANSWERS-SO-FAR*");

    public static final SubLSymbol $gt_goal_node$ = makeSymbol("*GT-GOAL-NODE*");

    public static final SubLSymbol $gt_edge_list$ = makeSymbol("*GT-EDGE-LIST*");

    private static final SubLSymbol $sym63$_GT_EDGE_LIST_RETURN__ = makeSymbol("*GT-EDGE-LIST-RETURN?*");

    public static final SubLSymbol $gt_path_list_of_assertions$ = makeSymbol("*GT-PATH-LIST-OF-ASSERTIONS*");

    public static final SubLSymbol $gt_cyclical_edges$ = makeSymbol("*GT-CYCLICAL-EDGES*");

    public static final SubLSymbol $gt_trace_level$ = makeSymbol("*GT-TRACE-LEVEL*");

    public static final SubLSymbol $gt_test_level$ = makeSymbol("*GT-TEST-LEVEL*");

    private static final SubLSymbol $sym68$_SUSPEND_GT_TYPE_CHECKING__ = makeSymbol("*SUSPEND-GT-TYPE-CHECKING?*");

    public static final SubLSymbol $gt_warnings$ = makeSymbol("*GT-WARNINGS*");

    private static final SubLSymbol $sym70$_GT_USE_SKSI__ = makeSymbol("*GT-USE-SKSI?*");

    private static final SubLList $list71 = list(makeSymbol("MODULE"), makeSymbol("PLIST"));















    private static final SubLList $list79 = list(makeSymbol("RESULT"));

    private static final SubLList $list80 = list(makeSymbol("*GT-LINK-TYPE*"), makeKeyword("ASSERTION"));

    private static final SubLList $list81 = list(list(makeSymbol("*GT-MARKING-TABLE*"), list(makeSymbol("MAKE-HASH-TABLE"), makeInteger(128))));





    private static final SubLList $list84 = list(list(makeSymbol("RET"), makeSymbol("RESULT")));



    private static final SubLList $list86 = list(list(makeSymbol("*GT-LINK-TYPE*"), makeKeyword("ACCESSORS")));



    private static final SubLSymbol SETUP_TRANSITIVITY_MODULE = makeSymbol("SETUP-TRANSITIVITY-MODULE");



    private static final SubLList $list90 = list(makeSymbol("*TRANSITIVITY-MODULES*"));

    private static final SubLList $list91 = list(list(makeKeyword("ALL-TARGETS"), makeSymbol("TTM-ALL-TARGETS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("ALL-SOURCES"), makeSymbol("TTM-ALL-SOURCES"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("BOOLEAN?"), makeSymbol("TTM-BOOLEAN?"), list(makeSymbol("FORT"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("ACCESSES-IN-WHAT-MTS"), makeSymbol("TTM-ACCESSES-IN-WHAT-MTS"), list(makeSymbol("FORT"), makeSymbol("TERM"))));

    public static final SubLSymbol $tt_dispatch_table$ = makeSymbol("*TT-DISPATCH-TABLE*");

    public static final SubLSymbol $tt_methods$ = makeSymbol("*TT-METHODS*");

    public static final SubLSymbol $transfers_through_modules$ = makeSymbol("*TRANSFERS-THROUGH-MODULES*");

    private static final SubLList $list95 = list(makeKeyword("PREDICATE"), makeKeyword("CONDUIT-PRED"), makeKeyword("TT-INDEX-ARG"), makeKeyword("TT-GATHER-ARG"), makeKeyword("GT-INDEX-ARG"), makeKeyword("GT-GATHER-ARG"), makeKeyword("MT"));

    public static final SubLSymbol $tt_parameters$ = makeSymbol("*TT-PARAMETERS*");

    public static final SubLSymbol $tt_pred$ = makeSymbol("*TT-PRED*");

    public static final SubLSymbol $tt_index$ = makeSymbol("*TT-INDEX*");

    public static final SubLSymbol $tt_gather$ = makeSymbol("*TT-GATHER*");

    public static final SubLSymbol $tt_index_arg$ = makeSymbol("*TT-INDEX-ARG*");

    public static final SubLSymbol $tt_gather_arg$ = makeSymbol("*TT-GATHER-ARG*");

    public static final SubLSymbol $tt_truth$ = makeSymbol("*TT-TRUTH*");

    public static final SubLSymbol $tt_step_fn$ = makeSymbol("*TT-STEP-FN*");

    private static final SubLSymbol $sym104$_TT_TRANSITIVE_CONDUIT__ = makeSymbol("*TT-TRANSITIVE-CONDUIT?*");



    private static final SubLSymbol $sym106$TRANSITIVE_PREDICATE_ = makeSymbol("TRANSITIVE-PREDICATE?");

    private static final SubLSymbol GENERIC_TTM = makeSymbol("GENERIC-TTM");

    private static final SubLSymbol SETUP_TRANSFERS_THROUGH_MODULE = makeSymbol("SETUP-TRANSFERS-THROUGH-MODULE");

    private static final SubLList $list109 = list(makeSymbol("*TRANSFERS-THROUGH-MODULES*"));

    private static final SubLSymbol $sym110$_GT_TRANSITIVE_VIA_ARG_ACTIVE__ = makeSymbol("*GT-TRANSITIVE-VIA-ARG-ACTIVE?*");

    private static final SubLSymbol $sym111$_GT_WITHIN_TRANSITIVE_VIA_ARG__ = makeSymbol("*GT-WITHIN-TRANSITIVE-VIA-ARG?*");

    public static SubLObject gt_link_support() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $gt_link_support$.getDynamicValue(thread);
    }

    public static SubLObject gt_link_mt() {
        final SubLObject link_support = gt_link_support();
        if (NIL != assertion_handles.assertion_p(link_support)) {
            return assertions_high.assertion_mt(link_support);
        }
        if (NIL != arguments.hl_support_p(link_support)) {
            return arguments.support_mt(link_support);
        }
        return gt_utilities.gt_error(ONE_INTEGER, $str42$Current_link_support__a_is_not_a_, link_support, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject gt_link_pred() {
        final SubLObject link_support = gt_link_support();
        if (NIL != assertions_high.gaf_assertionP(link_support)) {
            return assertions_high.gaf_arg0(link_support);
        }
        if (NIL != arguments.hl_support_p(link_support)) {
            return cycl_utilities.formula_arg0(arguments.support_formula(link_support));
        }
        return gt_utilities.gt_error(ONE_INTEGER, $str43$Current_link_support__a_is_not_a_, link_support, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject gt_use_sksiP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != $gt_use_sksiP$.getDynamicValue(thread)) && (NIL != sksi_query_utilities.some_sksi_removal_module_registeredP()));
    }

    public static SubLObject transitivity_module(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject module = NIL;
        SubLObject plist = NIL;
        destructuring_bind_must_consp(current, datum, $list71);
        module = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list71);
        plist = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject method_forms = NIL;
            if (plist.isCons()) {
                SubLObject accessors = getf(plist, $ACCESSORS, UNPROVIDED);
                SubLObject predicate = getf(plist, $PREDICATE, UNPROVIDED);
                SubLObject index_arg = getf(plist, $INDEX_ARG, UNPROVIDED);
                SubLObject gather_arg = getf(plist, $GATHER_ARG, UNPROVIDED);
                final SubLObject gtmt = getf(plist, $MT, UNPROVIDED);
                SubLObject mode = $ACCESSORS;
                if (NIL == index_arg) {
                    index_arg = ONE_INTEGER;
                }
                if (NIL == gather_arg) {
                    gather_arg = TWO_INTEGER;
                }
                if (!accessors.isCons()) {
                    accessors = list(list(predicate, index_arg, gather_arg));
                }
                if (accessors.isCons() && (NIL == accessors.rest())) {
                    mode = $PREDICATE;
                    predicate = accessors.first().first();
                    index_arg = second(accessors.first());
                    gather_arg = third(accessors.first());
                }
                SubLObject parameters = NIL;
                SubLObject parameter = NIL;
                parameters = plist;
                parameter = parameters.first();
                while (NIL != parameters) {
                    if (NIL != subl_promotions.memberP(parameter, $gt_methods$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                        final SubLObject function = intern(string_utilities.str(second(parameters)), UNPROVIDED);
                        final SubLObject arg_list = transitivity.add_mt_default(gtmt, third(assoc(parameter, $gt_dispatch_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED)));
                        final SubLObject args = list_utilities.args_from_arg_list(arg_list);
                        final SubLObject gt_function = second(assoc(parameter, $gt_dispatch_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
                        final SubLObject pcase_var = mode;
                        if (pcase_var.eql($PREDICATE)) {
                            method_forms = cons(list(DEFINE, function, arg_list, listS(CLET, $list79, list(CLET, listS(list($gt_pred$, predicate), $list80, list($gt_index_arg$, index_arg), list($gt_gather_arg$, gather_arg), $list81), list(CSETQ, RESULT, bq_cons(gt_function, append(args, NIL)))), $list84)), method_forms);
                        } else
                            if (pcase_var.eql($ACCESSORS)) {
                                method_forms = cons(list(DEFINE, function, arg_list, listS(CLET, $list79, list(CLET, bq_cons(list($gt_accessors$, list(QUOTE, accessors)), $list86), list(CSETQ, RESULT, bq_cons(gt_function, append(args, NIL)))), $list84)), method_forms);
                            }

                    }
                    parameters = cddr(parameters);
                    parameter = parameters.first();
                } 
            }
            return listS(PROGN, list(SETUP_TRANSITIVITY_MODULE, module, list(QUOTE, plist)), listS(CPUSHNEW, module, $list90), append(method_forms, NIL));
        }
        cdestructuring_bind_error(datum, $list71);
        return NIL;
    }

    public static SubLObject tt_module(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject module = NIL;
        SubLObject plist = NIL;
        destructuring_bind_must_consp(current, datum, $list71);
        module = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list71);
        plist = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject method_forms = NIL;
            if (plist.isCons()) {
                final SubLObject tt_pred = getf(plist, $PREDICATE, UNPROVIDED);
                final SubLObject gt_pred = getf(plist, $CONDUIT_PRED, UNPROVIDED);
                final SubLObject ttmt = getf(plist, $MT, UNPROVIDED);
                final SubLObject mode = $PREDICATE;
                final SubLObject tt_index_arg = TWO_INTEGER;
                final SubLObject tt_gather_arg = ONE_INTEGER;
                final SubLObject gt_index_arg = ONE_INTEGER;
                final SubLObject gt_gather_arg = TWO_INTEGER;
                SubLObject parameters = NIL;
                SubLObject parameter = NIL;
                parameters = plist;
                parameter = parameters.first();
                while (NIL != parameters) {
                    if (NIL != subl_promotions.memberP(parameter, $tt_methods$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                        final SubLObject function = intern(string_utilities.str(second(parameters)), UNPROVIDED);
                        final SubLObject arg_list = transitivity.add_mt_default(ttmt, third(assoc(parameter, $tt_dispatch_table$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)));
                        final SubLObject args = list_utilities.args_from_arg_list(arg_list);
                        final SubLObject method = parameter;
                        final SubLObject pcase_var = mode;
                        if (pcase_var.eql($PREDICATE)) {
                            method_forms = cons(list(DEFINE, function, arg_list, listS(CLET, $list79, list(CLET, list(list($tt_pred$, tt_pred), list($gt_pred$, gt_pred), $list80, list($tt_index_arg$, tt_index_arg), list($tt_gather_arg$, tt_gather_arg), list($gt_index_arg$, gt_index_arg), list($gt_gather_arg$, gt_gather_arg), list($sym104$_TT_TRANSITIVE_CONDUIT__, list($sym106$TRANSITIVE_PREDICATE_, gt_pred))), list(CSETQ, RESULT, listS(GENERIC_TTM, method, append(args, NIL)))), $list84)), method_forms);
                        }
                    }
                    parameters = cddr(parameters);
                    parameter = parameters.first();
                } 
            }
            return listS(PROGN, list(SETUP_TRANSFERS_THROUGH_MODULE, module, list(QUOTE, plist)), listS(CPUSHNEW, module, $list109), append(method_forms, NIL));
        }
        cdestructuring_bind_error(datum, $list71);
        return NIL;
    }

    public static SubLObject itt_module(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject module = NIL;
        SubLObject plist = NIL;
        destructuring_bind_must_consp(current, datum, $list71);
        module = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list71);
        plist = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject method_forms = NIL;
            if (plist.isCons()) {
                final SubLObject tt_pred = getf(plist, $PREDICATE, UNPROVIDED);
                final SubLObject gt_pred = getf(plist, $CONDUIT_PRED, UNPROVIDED);
                final SubLObject ttmt = getf(plist, $MT, UNPROVIDED);
                final SubLObject mode = $PREDICATE;
                final SubLObject tt_index_arg = ONE_INTEGER;
                final SubLObject tt_gather_arg = TWO_INTEGER;
                final SubLObject gt_index_arg = ONE_INTEGER;
                final SubLObject gt_gather_arg = TWO_INTEGER;
                SubLObject parameters = NIL;
                SubLObject parameter = NIL;
                parameters = plist;
                parameter = parameters.first();
                while (NIL != parameters) {
                    if (NIL != subl_promotions.memberP(parameter, $tt_methods$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                        final SubLObject function = intern(string_utilities.str(second(parameters)), UNPROVIDED);
                        final SubLObject arg_list = transitivity.add_mt_default(ttmt, third(assoc(parameter, $tt_dispatch_table$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)));
                        final SubLObject args = list_utilities.args_from_arg_list(arg_list);
                        final SubLObject method = parameter;
                        final SubLObject pcase_var = mode;
                        if (pcase_var.eql($PREDICATE)) {
                            method_forms = cons(list(DEFINE, function, arg_list, listS(CLET, $list79, list(CLET, list(list($tt_pred$, tt_pred), list($gt_pred$, gt_pred), $list80, list($tt_index_arg$, tt_index_arg), list($tt_gather_arg$, tt_gather_arg), list($gt_index_arg$, gt_index_arg), list($gt_gather_arg$, gt_gather_arg), list($sym104$_TT_TRANSITIVE_CONDUIT__, list($sym106$TRANSITIVE_PREDICATE_, gt_pred))), list(CSETQ, RESULT, listS(GENERIC_TTM, method, append(args, NIL)))), $list84)), method_forms);
                        }
                    }
                    parameters = cddr(parameters);
                    parameter = parameters.first();
                } 
            }
            return listS(PROGN, list(SETUP_TRANSFERS_THROUGH_MODULE, module, list(QUOTE, plist)), listS(CPUSHNEW, module, $list109), append(method_forms, NIL));
        }
        cdestructuring_bind_error(datum, $list71);
        return NIL;
    }

    public static SubLObject tti_module(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject module = NIL;
        SubLObject plist = NIL;
        destructuring_bind_must_consp(current, datum, $list71);
        module = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list71);
        plist = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject method_forms = NIL;
            if (plist.isCons()) {
                final SubLObject tt_pred = getf(plist, $PREDICATE, UNPROVIDED);
                final SubLObject gt_pred = getf(plist, $CONDUIT_PRED, UNPROVIDED);
                final SubLObject ttmt = getf(plist, $MT, UNPROVIDED);
                final SubLObject mode = $PREDICATE;
                final SubLObject tt_index_arg = TWO_INTEGER;
                final SubLObject tt_gather_arg = ONE_INTEGER;
                final SubLObject gt_index_arg = TWO_INTEGER;
                final SubLObject gt_gather_arg = ONE_INTEGER;
                SubLObject parameters = NIL;
                SubLObject parameter = NIL;
                parameters = plist;
                parameter = parameters.first();
                while (NIL != parameters) {
                    if (NIL != subl_promotions.memberP(parameter, $tt_methods$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                        final SubLObject function = intern(string_utilities.str(second(parameters)), UNPROVIDED);
                        final SubLObject arg_list = transitivity.add_mt_default(ttmt, third(assoc(parameter, $tt_dispatch_table$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)));
                        final SubLObject args = list_utilities.args_from_arg_list(arg_list);
                        final SubLObject method = parameter;
                        final SubLObject pcase_var = mode;
                        if (pcase_var.eql($PREDICATE)) {
                            method_forms = cons(list(DEFINE, function, arg_list, listS(CLET, $list79, list(CLET, list(list($tt_pred$, tt_pred), list($gt_pred$, gt_pred), $list80, list($tt_index_arg$, tt_index_arg), list($tt_gather_arg$, tt_gather_arg), list($gt_index_arg$, gt_index_arg), list($gt_gather_arg$, gt_gather_arg), list($sym104$_TT_TRANSITIVE_CONDUIT__, list($sym106$TRANSITIVE_PREDICATE_, gt_pred))), list(CSETQ, RESULT, listS(GENERIC_TTM, method, append(args, NIL)))), $list84)), method_forms);
                        }
                    }
                    parameters = cddr(parameters);
                    parameter = parameters.first();
                } 
            }
            return listS(PROGN, list(SETUP_TRANSFERS_THROUGH_MODULE, module, list(QUOTE, plist)), listS(CPUSHNEW, module, $list109), append(method_forms, NIL));
        }
        cdestructuring_bind_error(datum, $list71);
        return NIL;
    }

    public static SubLObject itti_module(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject module = NIL;
        SubLObject plist = NIL;
        destructuring_bind_must_consp(current, datum, $list71);
        module = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list71);
        plist = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject method_forms = NIL;
            if (plist.isCons()) {
                final SubLObject tt_pred = getf(plist, $PREDICATE, UNPROVIDED);
                final SubLObject gt_pred = getf(plist, $CONDUIT_PRED, UNPROVIDED);
                final SubLObject ttmt = getf(plist, $MT, UNPROVIDED);
                final SubLObject mode = $PREDICATE;
                final SubLObject tt_index_arg = ONE_INTEGER;
                final SubLObject tt_gather_arg = TWO_INTEGER;
                final SubLObject gt_index_arg = TWO_INTEGER;
                final SubLObject gt_gather_arg = ONE_INTEGER;
                SubLObject parameters = NIL;
                SubLObject parameter = NIL;
                parameters = plist;
                parameter = parameters.first();
                while (NIL != parameters) {
                    if (NIL != subl_promotions.memberP(parameter, $tt_methods$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                        final SubLObject function = intern(string_utilities.str(second(parameters)), UNPROVIDED);
                        final SubLObject arg_list = transitivity.add_mt_default(ttmt, third(assoc(parameter, $tt_dispatch_table$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)));
                        final SubLObject args = list_utilities.args_from_arg_list(arg_list);
                        final SubLObject method = parameter;
                        final SubLObject pcase_var = mode;
                        if (pcase_var.eql($PREDICATE)) {
                            method_forms = cons(list(DEFINE, function, arg_list, listS(CLET, $list79, list(CLET, list(list($tt_pred$, tt_pred), list($gt_pred$, gt_pred), $list80, list($tt_index_arg$, tt_index_arg), list($tt_gather_arg$, tt_gather_arg), list($gt_index_arg$, gt_index_arg), list($gt_gather_arg$, gt_gather_arg), list($sym104$_TT_TRANSITIVE_CONDUIT__, list($sym106$TRANSITIVE_PREDICATE_, gt_pred))), list(CSETQ, RESULT, listS(GENERIC_TTM, method, append(args, NIL)))), $list84)), method_forms);
                        }
                    }
                    parameters = cddr(parameters);
                    parameter = parameters.first();
                } 
            }
            return listS(PROGN, list(SETUP_TRANSFERS_THROUGH_MODULE, module, list(QUOTE, plist)), listS(CPUSHNEW, module, $list109), append(method_forms, NIL));
        }
        cdestructuring_bind_error(datum, $list71);
        return NIL;
    }

    public static SubLObject gt_within_transitive_via_argP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $gt_within_transitive_via_argP$.getDynamicValue(thread);
    }

    public static SubLObject declare_gt_vars_file() {
        declareFunction(me, "gt_link_support", "GT-LINK-SUPPORT", 0, 0, false);
        declareFunction(me, "gt_link_mt", "GT-LINK-MT", 0, 0, false);
        declareFunction(me, "gt_link_pred", "GT-LINK-PRED", 0, 0, false);
        declareFunction(me, "gt_use_sksiP", "GT-USE-SKSI?", 0, 0, false);
        declareMacro(me, "transitivity_module", "TRANSITIVITY-MODULE");
        declareMacro(me, "tt_module", "TT-MODULE");
        declareMacro(me, "itt_module", "ITT-MODULE");
        declareMacro(me, "tti_module", "TTI-MODULE");
        declareMacro(me, "itti_module", "ITTI-MODULE");
        declareFunction(me, "gt_within_transitive_via_argP", "GT-WITHIN-TRANSITIVE-VIA-ARG?", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_gt_vars_file() {
        deflexical("*GT-DISPATCH-TABLE*", $list0);
        defparameter("*GT-METHODS*", Mapping.mapcar(symbol_function(CAR), $gt_dispatch_table$.getGlobalValue()));
        defparameter("*GT-PARAMETERS*", append($list4, $gt_methods$.getDynamicValue()));
        defparameter("*TRANSITIVITY-MODULES*", NIL);
        defparameter("*GT-PRED*", NIL);
        defparameter("*GT-INDEX*", NIL);
        defparameter("*GT-GATHER*", NIL);
        defparameter("*GT-INDEX-ARG*", ONE_INTEGER);
        defparameter("*GT-GATHER-ARG*", TWO_INTEGER);
        defparameter("*GT-ACCESSORS*", NIL);
        defparameter("*GT-LINK-TYPE*", $ASSERTION);
        defparameter("*GT-MODE*", $SUPERIOR);
        defparameter("*GT-MODES*", $list17);
        defparameter("*GT-TRUTH*", $TRUE);
        defparameter("*GT-QUERY*", NIL);
        defparameter("*GT-DONE?*", NIL);
        defparameter("*GT-SEARCHED?*", NIL);
        defparameter("*GT-TARGET*", NIL);
        defparameter("*GT-RESULT*", NIL);
        defparameter("*GT-SEARCHER*", NIL);
        defparameter("*GT-BASE-FN*", NIL);
        defparameter("*GT-STEP-FN*", NIL);
        defparameter("*GT-COMPOSE-FN*", NIL);
        defparameter("*GT-GATHER-FN*", NIL);
        defparameter("*GT-COMBINE-FN*", symbol_function(NCONC));
        defparameter("*GT-COMPARE-FN*", NIL);
        defparameter("*GT-EQUALITY-FN*", symbol_function(EQUAL));
        defparameter("*GT-COMPOSE-PRED*", NIL);
        defparameter("*GT-COMPOSE-INDEX-ARG*", ONE_INTEGER);
        defparameter("*GT-COMPOSE-GATHER-ARG*", TWO_INTEGER);
        defparameter("*GT-MAX-NODES-DIRECTION*", $DOWN);
        defparameter("*GT-USE-SPEC-PREDS?*", T);
        defparameter("*GT-HANDLE-NON-TRANSITIVE-PREDICATE?*", NIL);
        defparameter("*GT-LINK-SUPPORT*", NIL);
        defparameter("*GT-WHAT-MTS-RESULT*", NIL);
        defparameter("*GT-WHAT-MTS-GOAL-NODE*", NIL);
        defparameter("*GT-PATH-LIST-OF-MTS*", NIL);
        defparameter("*GT-PATH-LIST-OF-NODES*", NIL);
        defparameter("*GT-PATH-LENGTH*", ZERO_INTEGER);
        defparameter("*GT-LIST-OF-PATH-LENGTHS*", NIL);
        defparameter("*GT-MARKING-TABLE*", NIL);
        defparameter("*GT-TARGET-MARKING-TABLE*", NIL);
        defparameter("*GT-DEPTH-CUTOFF*", ONE_INTEGER);
        defparameter("*GT-DEPTH-CUTOFF?*", NIL);
        defparameter("*GT-PREV-DEPTH-CUTOFF*", ONE_INTEGER);
        defparameter("*GT-TIME-CUTOFF?*", NIL);
        defparameter("*GT-TIME-CUTOFF*", TEN_INTEGER);
        defparameter("*GT-INITIAL-TIME*", ZERO_INTEGER);
        defparameter("*GT-ANSWERS-CUTOFF?*", NIL);
        defparameter("*GT-ANSWERS-CUTOFF*", ONE_INTEGER);
        defparameter("*GT-ANSWERS-SO-FAR*", ZERO_INTEGER);
        defparameter("*GT-GOAL-NODE*", NIL);
        defparameter("*GT-EDGE-LIST*", NIL);
        defparameter("*GT-EDGE-LIST-RETURN?*", NIL);
        defparameter("*GT-PATH-LIST-OF-ASSERTIONS*", NIL);
        defparameter("*GT-CYCLICAL-EDGES*", NIL);
        defparameter("*GT-TRACE-LEVEL*", ONE_INTEGER);
        defparameter("*GT-TEST-LEVEL*", THREE_INTEGER);
        defparameter("*SUSPEND-GT-TYPE-CHECKING?*", NIL);
        defparameter("*GT-WARNINGS*", NIL);
        defparameter("*GT-USE-SKSI?*", T);
        defparameter("*TT-DISPATCH-TABLE*", $list91);
        defparameter("*TT-METHODS*", Mapping.mapcar(symbol_function(CAR), $tt_dispatch_table$.getDynamicValue()));
        defparameter("*TRANSFERS-THROUGH-MODULES*", NIL);
        defparameter("*TT-PARAMETERS*", append($list95, $tt_methods$.getDynamicValue()));
        defparameter("*TT-PRED*", NIL);
        defparameter("*TT-INDEX*", NIL);
        defparameter("*TT-GATHER*", NIL);
        defparameter("*TT-INDEX-ARG*", ONE_INTEGER);
        defparameter("*TT-GATHER-ARG*", TWO_INTEGER);
        defparameter("*TT-TRUTH*", $TRUE);
        defparameter("*TT-STEP-FN*", NIL);
        defparameter("*TT-TRANSITIVE-CONDUIT?*", NIL);
        defparameter("*GT-TRANSITIVE-VIA-ARG-ACTIVE?*", T);
        defparameter("*GT-WITHIN-TRANSITIVE-VIA-ARG?*", NIL);
        return NIL;
    }

    public static SubLObject setup_gt_vars_file() {
        SubLObject item_var = $gt_dispatch_table$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_methods$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_parameters$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $transitivity_modules$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_pred$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_index$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_gather$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_index_arg$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_gather_arg$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_accessors$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_link_type$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_mode$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_modes$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_truth$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_query$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $sym22$_GT_DONE__;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $sym23$_GT_SEARCHED__;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_target$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_result$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_searcher$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_base_fn$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_step_fn$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_compose_fn$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_gather_fn$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_combine_fn$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_compare_fn$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_equality_fn$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_compose_pred$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_compose_index_arg$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_compose_gather_arg$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_max_nodes_direction$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $sym40$_GT_USE_SPEC_PREDS__;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $sym41$_GT_HANDLE_NON_TRANSITIVE_PREDICATE__;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_what_mts_result$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_what_mts_goal_node$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_path_list_of_mts$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_path_list_of_nodes$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_path_length$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_list_of_path_lengths$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_marking_table$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_target_marking_table$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_depth_cutoff$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $sym53$_GT_DEPTH_CUTOFF__;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_prev_depth_cutoff$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $sym55$_GT_TIME_CUTOFF__;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_time_cutoff$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_initial_time$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $sym58$_GT_ANSWERS_CUTOFF__;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_answers_cutoff$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_answers_so_far$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_goal_node$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_edge_list$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $sym63$_GT_EDGE_LIST_RETURN__;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_path_list_of_assertions$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_cyclical_edges$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_trace_level$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_test_level$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $sym68$_SUSPEND_GT_TYPE_CHECKING__;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $gt_warnings$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $sym70$_GT_USE_SKSI__;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $tt_dispatch_table$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $tt_methods$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $transfers_through_modules$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $tt_parameters$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $tt_pred$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $tt_index$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $tt_gather$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $tt_index_arg$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $tt_gather_arg$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $tt_truth$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $tt_step_fn$;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $sym104$_TT_TRANSITIVE_CONDUIT__;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $sym110$_GT_TRANSITIVE_VIA_ARG_ACTIVE__;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        item_var = $sym111$_GT_WITHIN_TRANSITIVE_VIA_ARG__;
        if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
        }
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_gt_vars_file();
    }

    @Override
    public void initializeVariables() {
        init_gt_vars_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_gt_vars_file();
    }

    static {




























































































































































































    }
}

/**
 * Total time: 700 ms
 */
