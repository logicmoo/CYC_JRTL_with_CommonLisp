/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;

import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class gt_vars extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new gt_vars();

 public static final String myName = "com.cyc.cycjava.cycl.gt_vars";


    // defparameter
    // the current link assertion or hl support.
    /**
     * the current link assertion or hl support.
     */
    @LispMethod(comment = "the current link assertion or hl support.\ndefparameter")
    public static final SubLSymbol $gt_link_support$ = makeSymbol("*GT-LINK-SUPPORT*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(new SubLObject[] { list(makeKeyword("SUPERIORS"), makeSymbol("GTM-SUPERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("INFERIORS"), makeSymbol("GTM-INFERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("MIN-SUPERIORS"), makeSymbol("GTM-MIN-SUPERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("MAX-INFERIORS"), makeSymbol("GTM-MAX-INFERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("CO-INFERIORS"), makeSymbol("GTM-CO-INFERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("CO-SUPERIORS"), makeSymbol("GTM-CO-SUPERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("REDUNDANT-SUPERIORS"), makeSymbol("GTM-REDUNDANT-SUPERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("REDUNDANT-INFERIORS"), makeSymbol("GTM-REDUNDANT-INFERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("ALL-SUPERIORS"), makeSymbol("GTM-ALL-SUPERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("ALL-INFERIORS"), makeSymbol("GTM-ALL-INFERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("ALL-ACCESSIBLE"), makeSymbol("GTM-ALL-ACCESSIBLE"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("UNION-ALL-INFERIORS"), makeSymbol("GTM-UNION-ALL-INFERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("COMPOSE-FN-SUPERIORS"), makeSymbol("GTM-COMPOSE-FN-ALL-SUPERIORS"), list(makeSymbol("FORT"), makeSymbol("FN"), makeSymbol("&OPTIONAL"), list(makeSymbol("COMBINE-FN"), list(QUOTE, makeSymbol("NCONC"))), makeSymbol("MT"))),
	    list(makeKeyword("COMPOSE-FN-INFERIORS"), makeSymbol("GTM-COMPOSE-FN-ALL-INFERIORS"), list(makeSymbol("FORT"), makeSymbol("FN"), makeSymbol("&OPTIONAL"), list(makeSymbol("COMBINE-FN"), list(QUOTE, makeSymbol("NCONC"))), makeSymbol("MT"))),
	    list(makeKeyword("ALL-DEPENDENT-INFERIORS"), makeSymbol("GTM-ALL-DEPENDENT-INFERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("COMPOSE-PRED-SUPERIORS"), makeSymbol("GTM-COMPOSE-PRED-ALL-SUPERIORS"), list(makeSymbol("FORT"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), list(makeSymbol("INDEX"), ONE_INTEGER), list(makeSymbol("GATHER"), TWO_INTEGER), makeSymbol("MT"))),
	    list(makeKeyword("COMPOSE-PRED-INFERIORS"), makeSymbol("GTM-COMPOSE-PRED-ALL-INFERIORS"), list(makeSymbol("FORT"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), list(makeSymbol("INDEX"), ONE_INTEGER), list(makeSymbol("GATHER"), TWO_INTEGER), makeSymbol("MT"))),
	    list(makeKeyword("ROOTS"), makeSymbol("GTM-ROOTS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("LEAVES"), makeSymbol("GTM-LEAVES"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("BOOLEAN?"), makeSymbol("GTM-BOOLEAN?"), list(makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("SUPERIOR?"), makeSymbol("GTM-SUPERIOR?"), list(makeSymbol("SUPERIOR"), makeSymbol("INFERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("INFERIOR?"), makeSymbol("GTM-INFERIOR?"), list(makeSymbol("INFERIOR"), makeSymbol("SUPERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("HAS-SUPERIOR?"), makeSymbol("GTM-HAS-SUPERIOR?"), list(makeSymbol("INFERIOR"), makeSymbol("SUPERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("HAS-INFERIOR?"), makeSymbol("GTM-HAS-INFERIOR?"), list(makeSymbol("SUPERIOR"), makeSymbol("INFERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("GATHER-SUPERIOR"), makeSymbol("GTM-GATHER-SUPERIOR"), list(makeSymbol("SPEC"), makeSymbol("GATHER-FN"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("GATHER-INFERIOR"), makeSymbol("GTM-GATHER-INFERIOR"), list(makeSymbol("GENL"), makeSymbol("GATHER-FN"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("CYCLES?"), makeSymbol("GTM-CYCLES?"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("COMPLETES-CYCLE?"), makeSymbol("GTM-COMPLETES-CYCLE?"), list(makeSymbol("FORT-1"), makeSymbol("FORT-2"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("MIN-NODES"), makeSymbol("GTM-MIN-NODES"), list(makeSymbol("FORTS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("MAX-NODES"), makeSymbol("GTM-MAX-NODES"), list(makeSymbol("FORTS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("MIN-CEILINGS"), makeSymbol("GTM-MIN-CEILINGS"), list(makeSymbol("FORTS"), makeSymbol("&OPTIONAL"), makeSymbol("CANDIDATES"), makeSymbol("MT"))),
	    list(makeKeyword("MAX-FLOORS"), makeSymbol("GTM-MAX-FLOORS"), list(makeSymbol("FORTS"), makeSymbol("&OPTIONAL"), makeSymbol("CANDIDATES"), makeSymbol("MT"))),
	    list(makeKeyword("MIN-SUPERIORS-EXCLUDING"), makeSymbol("GTM-MIN-SUPERIORS-EXCLUDING"), list(makeSymbol("INFERIOR"), makeSymbol("SUPERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("MAX-INFERIORS-EXCLUDING"), makeSymbol("GTM-MAX-INFERIORS-EXCLUDING"), list(makeSymbol("SUPERIOR"), makeSymbol("INFERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("ANY-SUPERIOR-PATH"), makeSymbol("GTM-ANY-SUPERIOR-PATH"), list(makeSymbol("INFERIOR"), makeSymbol("SUPERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("WHY-SUPERIOR?"), makeSymbol("GTM-WHY-SUPERIOR?"), list(makeSymbol("SUPERIOR"), makeSymbol("INFERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("WHY-COMPLETES-CYCLE?"), makeSymbol("GTM-WHY-COMPLETES-CYCLE?"), list(makeSymbol("FORT1"), makeSymbol("FORT2"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("ALL-SUPERIOR-EDGES"), makeSymbol("GTM-ALL-SUPERIOR-EDGES"), list(makeSymbol("INFERIOR"), makeSymbol("SUPERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("ALL-INFERIOR-EDGES"), makeSymbol("GTM-ALL-INFERIOR-EDGES"), list(makeSymbol("INFERIOR"), makeSymbol("SUPERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("ALL-PATHS"), makeSymbol("GTM-ALL-PATHS"), list(makeSymbol("INFERIOR"), makeSymbol("SUPERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("INFERIORS-WITH-MTS"), makeSymbol("GTM-ALL-INFERIORS-WITH-MTS"), list(makeSymbol("SUPERIOR"))),
	    list(makeKeyword("SUPERIOR-IN-WHAT-MTS"), makeSymbol("GTM-IN-WHAT-MTS"), list(makeSymbol("INFERIOR"), makeSymbol("SUPERIOR"), makeSymbol("KEY-METHOD"))),
	    list(makeKeyword("INFERIOR-IN-WHAT-MTS"), makeSymbol("GTM-IN-WHAT-MTS"), list(makeSymbol("SUPERIOR"), makeSymbol("INFERIOR"), makeSymbol("KEY-METHOD"))),
	    list(makeKeyword("ACCESSIBLE-IN-WHAT-MTS"), makeSymbol("GTM-ACCESSIBLE-IN-WHAT-MTS"), list(makeSymbol("INFERIOR"), makeSymbol("SUPERIOR"), makeSymbol("KEY-METHOD"))) });

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

    public static final SubLSymbol $gt_doneP$ = makeSymbol("*GT-DONE?*");

    public static final SubLSymbol $gt_searchedP$ = makeSymbol("*GT-SEARCHED?*");

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

    public static final SubLSymbol $gt_use_spec_predsP$ = makeSymbol("*GT-USE-SPEC-PREDS?*");

    public static final SubLSymbol $gt_handle_non_transitive_predicateP$ = makeSymbol("*GT-HANDLE-NON-TRANSITIVE-PREDICATE?*");

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

    public static final SubLSymbol $gt_depth_cutoffP$ = makeSymbol("*GT-DEPTH-CUTOFF?*");

    public static final SubLSymbol $gt_prev_depth_cutoff$ = makeSymbol("*GT-PREV-DEPTH-CUTOFF*");

    public static final SubLSymbol $gt_time_cutoffP$ = makeSymbol("*GT-TIME-CUTOFF?*");

    public static final SubLSymbol $gt_time_cutoff$ = makeSymbol("*GT-TIME-CUTOFF*");

    public static final SubLSymbol $gt_initial_time$ = makeSymbol("*GT-INITIAL-TIME*");

    public static final SubLSymbol $gt_answers_cutoffP$ = makeSymbol("*GT-ANSWERS-CUTOFF?*");

    public static final SubLSymbol $gt_answers_cutoff$ = makeSymbol("*GT-ANSWERS-CUTOFF*");

    public static final SubLSymbol $gt_answers_so_far$ = makeSymbol("*GT-ANSWERS-SO-FAR*");

    public static final SubLSymbol $gt_goal_node$ = makeSymbol("*GT-GOAL-NODE*");

    public static final SubLSymbol $gt_edge_list$ = makeSymbol("*GT-EDGE-LIST*");

    public static final SubLSymbol $gt_edge_list_returnP$ = makeSymbol("*GT-EDGE-LIST-RETURN?*");

    public static final SubLSymbol $gt_path_list_of_assertions$ = makeSymbol("*GT-PATH-LIST-OF-ASSERTIONS*");

    public static final SubLSymbol $gt_cyclical_edges$ = makeSymbol("*GT-CYCLICAL-EDGES*");

    public static final SubLSymbol $gt_trace_level$ = makeSymbol("*GT-TRACE-LEVEL*");

    public static final SubLSymbol $gt_test_level$ = makeSymbol("*GT-TEST-LEVEL*");

    public static final SubLSymbol $suspend_gt_type_checkingP$ = makeSymbol("*SUSPEND-GT-TYPE-CHECKING?*");

    public static final SubLSymbol $gt_warnings$ = makeSymbol("*GT-WARNINGS*");

    public static final SubLSymbol $gt_use_sksiP$ = makeSymbol("*GT-USE-SKSI?*");

    private static final SubLList $list71 = list(makeSymbol("MODULE"), makeSymbol("PLIST"));

    private static final SubLList $list79 = list(makeSymbol("RESULT"));

    private static final SubLList $list80 = list(makeSymbol("*GT-LINK-TYPE*"), makeKeyword("ASSERTION"));

    private static final SubLList $list81 = list(list(makeSymbol("*GT-MARKING-TABLE*"), list(makeSymbol("MAKE-HASH-TABLE"), makeInteger(128))));

    private static final SubLList $list84 = list(list(RET, makeSymbol("RESULT")));

    private static final SubLList $list86 = list(list(makeSymbol("*GT-LINK-TYPE*"), makeKeyword("ACCESSORS")));

    private static final SubLSymbol SETUP_TRANSITIVITY_MODULE = makeSymbol("SETUP-TRANSITIVITY-MODULE");

    private static final SubLList $list90 = list(makeSymbol("*TRANSITIVITY-MODULES*"));

    private static final SubLList $list91 = list(list(makeKeyword("ALL-TARGETS"), makeSymbol("TTM-ALL-TARGETS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("ALL-SOURCES"), makeSymbol("TTM-ALL-SOURCES"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("BOOLEAN?"), makeSymbol("TTM-BOOLEAN?"), list(makeSymbol("FORT"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("ACCESSES-IN-WHAT-MTS"), makeSymbol("TTM-ACCESSES-IN-WHAT-MTS"), list(makeSymbol("FORT"), makeSymbol("TERM"))));

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

    public static final SubLSymbol $tt_transitive_conduitP$ = makeSymbol("*TT-TRANSITIVE-CONDUIT?*");

    private static final SubLSymbol $sym106$TRANSITIVE_PREDICATE_ = makeSymbol("TRANSITIVE-PREDICATE?");

    private static final SubLSymbol GENERIC_TTM = makeSymbol("GENERIC-TTM");

    private static final SubLSymbol SETUP_TRANSFERS_THROUGH_MODULE = makeSymbol("SETUP-TRANSFERS-THROUGH-MODULE");

    private static final SubLList $list109 = list(makeSymbol("*TRANSFERS-THROUGH-MODULES*"));

    public static final SubLSymbol $gt_transitive_via_arg_activeP$ = makeSymbol("*GT-TRANSITIVE-VIA-ARG-ACTIVE?*");

    public static final SubLSymbol $gt_within_transitive_via_argP$ = makeSymbol("*GT-WITHIN-TRANSITIVE-VIA-ARG?*");

    public static final SubLObject gt_link_support_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return $gt_link_support$.getDynamicValue(thread);
	}
    }

    public static SubLObject gt_link_support() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return $gt_link_support$.getDynamicValue(thread);
    }

    public static final SubLObject gt_link_mt_alt() {
	{
	    SubLObject link_support = com.cyc.cycjava.cycl.gt_vars.gt_link_support();
	    if (NIL != assertion_handles.assertion_p(link_support)) {
		return assertions_high.assertion_mt(link_support);
	    } else {
		if (NIL != arguments.hl_support_p(link_support)) {
		    return arguments.support_mt(link_support);
		} else {
		    return gt_utilities.gt_error(ONE_INTEGER, $str_alt75$Current_link_support__a_is_not_a_, link_support, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
	    }
	}
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

    public static final SubLObject gt_link_pred_alt() {
	{
	    SubLObject link_support = com.cyc.cycjava.cycl.gt_vars.gt_link_support();
	    if (NIL != assertions_high.gaf_assertionP(link_support)) {
		return assertions_high.gaf_arg0(link_support);
	    } else {
		if (NIL != arguments.hl_support_p(link_support)) {
		    return cycl_utilities.formula_arg0(arguments.support_formula(link_support));
		} else {
		    return gt_utilities.gt_error(ONE_INTEGER, $str_alt76$Current_link_support__a_is_not_a_, link_support, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
	    }
	}
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

    /**
     * Do not bother with SKSI code if *gt-use-sksi?* is NIL or there are no SKSI
     * removal modules registered.
     */
    @LispMethod(comment = "Do not bother with SKSI code if *gt-use-sksi?* is NIL or there are no SKSI\r\nremoval modules registered.\nDo not bother with SKSI code if *gt-use-sksi?* is NIL or there are no SKSI\nremoval modules registered.")
    public static final SubLObject gt_use_sksiP_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return makeBoolean((NIL != $gt_use_sksiP$.getDynamicValue(thread)) && (NIL != sksi_query_utilities.some_sksi_removal_module_registeredP()));
	}
    }

    /**
     * Do not bother with SKSI code if *gt-use-sksi?* is NIL or there are no SKSI
     * removal modules registered.
     */
    @LispMethod(comment = "Do not bother with SKSI code if *gt-use-sksi?* is NIL or there are no SKSI\r\nremoval modules registered.\nDo not bother with SKSI code if *gt-use-sksi?* is NIL or there are no SKSI\nremoval modules registered.")
    public static SubLObject gt_use_sksiP() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return makeBoolean((NIL != $gt_use_sksiP$.getDynamicValue(thread)) && (NIL != sksi_query_utilities.some_sksi_removal_module_registeredP()));
    }

    public static final SubLObject transitivity_module_alt(SubLObject macroform, SubLObject environment) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject datum = macroform.rest();
		SubLObject current = datum;
		SubLObject module = NIL;
		SubLObject plist = NIL;
		destructuring_bind_must_consp(current, datum, $list_alt131);
		module = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list_alt131);
		plist = current.first();
		current = current.rest();
		if (NIL == current) {
		    {
			SubLObject method_forms = NIL;
			if (plist.isCons()) {
			    {
				SubLObject accessors = getf(plist, $ACCESSORS, UNPROVIDED);
				SubLObject predicate = getf(plist, $PREDICATE, UNPROVIDED);
				SubLObject index_arg = getf(plist, $INDEX_ARG, UNPROVIDED);
				SubLObject gather_arg = getf(plist, $GATHER_ARG, UNPROVIDED);
				SubLObject gtmt = getf(plist, $MT, UNPROVIDED);
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
				{
				    SubLObject parameters = NIL;
				    SubLObject parameter = NIL;
				    for (parameters = plist, parameter = parameters.first(); NIL != parameters; parameters = cddr(parameters), parameter = parameters.first()) {
					if (NIL != subl_promotions.memberP(parameter, $gt_methods$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
					    {
						SubLObject function = intern(string_utilities.str(second(parameters)), UNPROVIDED);
						SubLObject arg_list = transitivity.add_mt_default(gtmt, third(assoc(parameter, $gt_dispatch_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED)));
						SubLObject args = list_utilities.args_from_arg_list(arg_list);
						SubLObject gt_function = second(assoc(parameter, $gt_dispatch_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
						SubLObject pcase_var = mode;
						if (pcase_var.eql($PREDICATE)) {
						    method_forms = cons(
							    list(DEFINE, function, arg_list, listS(CLET, $list_alt139,
								    list(CLET, listS(list($gt_pred$, predicate), $list_alt140, list($gt_index_arg$, index_arg), list($gt_gather_arg$, gather_arg), $list_alt141), list(CSETQ, RESULT, bq_cons(gt_function, append(args, NIL)))), $list_alt144)),
							    method_forms);
						} else {
						    if (pcase_var.eql($ACCESSORS)) {
							method_forms = cons(list(DEFINE, function, arg_list, listS(CLET, $list_alt139, list(CLET, bq_cons(list($gt_accessors$, list(QUOTE, accessors)), $list_alt146), list(CSETQ, RESULT, bq_cons(gt_function, append(args, NIL)))), $list_alt144)),
								method_forms);
						    }
						}
					    }
					}
				    }
				}
			    }
			}
			return listS(PROGN, list(SETUP_TRANSITIVITY_MODULE, module, list(QUOTE, plist)), listS(CPUSHNEW, module, $list_alt150), append(method_forms, NIL));
		    }
		} else {
		    cdestructuring_bind_error(datum, $list_alt131);
		}
	    }
	    return NIL;
	}
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
			    method_forms = cons(
				    list(DEFINE, function, arg_list, listS(CLET, $list79, list(CLET, listS(list($gt_pred$, predicate), $list80, list($gt_index_arg$, index_arg), list($gt_gather_arg$, gather_arg), $list81), list(CSETQ, RESULT, bq_cons(gt_function, append(args, NIL)))), $list84)),
				    method_forms);
			} else if (pcase_var.eql($ACCESSORS)) {
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

    public static final SubLObject tt_module_alt(SubLObject macroform, SubLObject environment) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject datum = macroform.rest();
		SubLObject current = datum;
		SubLObject module = NIL;
		SubLObject plist = NIL;
		destructuring_bind_must_consp(current, datum, $list_alt131);
		module = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list_alt131);
		plist = current.first();
		current = current.rest();
		if (NIL == current) {
		    {
			SubLObject method_forms = NIL;
			if (plist.isCons()) {
			    {
				SubLObject tt_pred = getf(plist, $PREDICATE, UNPROVIDED);
				SubLObject gt_pred = getf(plist, $CONDUIT_PRED, UNPROVIDED);
				SubLObject ttmt = getf(plist, $MT, UNPROVIDED);
				SubLObject mode = $PREDICATE;
				SubLObject tt_index_arg = TWO_INTEGER;
				SubLObject tt_gather_arg = ONE_INTEGER;
				SubLObject gt_index_arg = ONE_INTEGER;
				SubLObject gt_gather_arg = TWO_INTEGER;
				SubLObject parameters = NIL;
				SubLObject parameter = NIL;
				for (parameters = plist, parameter = parameters.first(); NIL != parameters; parameters = cddr(parameters), parameter = parameters.first()) {
				    if (NIL != subl_promotions.memberP(parameter, $tt_methods$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
					{
					    SubLObject function = intern(string_utilities.str(second(parameters)), UNPROVIDED);
					    SubLObject arg_list = transitivity.add_mt_default(ttmt, third(assoc(parameter, $tt_dispatch_table$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)));
					    SubLObject args = list_utilities.args_from_arg_list(arg_list);
					    SubLObject method = parameter;
					    SubLObject pcase_var = mode;
					    if (pcase_var.eql($PREDICATE)) {
						method_forms = cons(list(DEFINE, function, arg_list, listS(CLET, $list_alt139, list(CLET, list(list($tt_pred$, tt_pred), list($gt_pred$, gt_pred), $list_alt140, list($tt_index_arg$, tt_index_arg), list($tt_gather_arg$, tt_gather_arg),
							list($gt_index_arg$, gt_index_arg), list($gt_gather_arg$, gt_gather_arg), list($tt_transitive_conduitP$, list($sym176$TRANSITIVE_PREDICATE_, gt_pred))), list(CSETQ, RESULT, listS(GENERIC_TTM, method, append(args, NIL)))), $list_alt144)),
							method_forms);
					    }
					}
				    }
				}
			    }
			}
			return listS(PROGN, list(SETUP_TRANSFERS_THROUGH_MODULE, module, list(QUOTE, plist)), listS(CPUSHNEW, module, $list_alt179), append(method_forms, NIL));
		    }
		} else {
		    cdestructuring_bind_error(datum, $list_alt131);
		}
	    }
	    return NIL;
	}
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
			    method_forms = cons(list(DEFINE, function, arg_list, listS(CLET, $list79, list(CLET, list(list($tt_pred$, tt_pred), list($gt_pred$, gt_pred), $list80, list($tt_index_arg$, tt_index_arg), list($tt_gather_arg$, tt_gather_arg), list($gt_index_arg$, gt_index_arg),
				    list($gt_gather_arg$, gt_gather_arg), list($tt_transitive_conduitP$, list($sym106$TRANSITIVE_PREDICATE_, gt_pred))), list(CSETQ, RESULT, listS(GENERIC_TTM, method, append(args, NIL)))), $list84)), method_forms);
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

    public static final SubLObject itt_module_alt(SubLObject macroform, SubLObject environment) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject datum = macroform.rest();
		SubLObject current = datum;
		SubLObject module = NIL;
		SubLObject plist = NIL;
		destructuring_bind_must_consp(current, datum, $list_alt131);
		module = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list_alt131);
		plist = current.first();
		current = current.rest();
		if (NIL == current) {
		    {
			SubLObject method_forms = NIL;
			if (plist.isCons()) {
			    {
				SubLObject tt_pred = getf(plist, $PREDICATE, UNPROVIDED);
				SubLObject gt_pred = getf(plist, $CONDUIT_PRED, UNPROVIDED);
				SubLObject ttmt = getf(plist, $MT, UNPROVIDED);
				SubLObject mode = $PREDICATE;
				SubLObject tt_index_arg = ONE_INTEGER;
				SubLObject tt_gather_arg = TWO_INTEGER;
				SubLObject gt_index_arg = ONE_INTEGER;
				SubLObject gt_gather_arg = TWO_INTEGER;
				SubLObject parameters = NIL;
				SubLObject parameter = NIL;
				for (parameters = plist, parameter = parameters.first(); NIL != parameters; parameters = cddr(parameters), parameter = parameters.first()) {
				    if (NIL != subl_promotions.memberP(parameter, $tt_methods$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
					{
					    SubLObject function = intern(string_utilities.str(second(parameters)), UNPROVIDED);
					    SubLObject arg_list = transitivity.add_mt_default(ttmt, third(assoc(parameter, $tt_dispatch_table$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)));
					    SubLObject args = list_utilities.args_from_arg_list(arg_list);
					    SubLObject method = parameter;
					    SubLObject pcase_var = mode;
					    if (pcase_var.eql($PREDICATE)) {
						method_forms = cons(list(DEFINE, function, arg_list, listS(CLET, $list_alt139, list(CLET, list(list($tt_pred$, tt_pred), list($gt_pred$, gt_pred), $list_alt140, list($tt_index_arg$, tt_index_arg), list($tt_gather_arg$, tt_gather_arg),
							list($gt_index_arg$, gt_index_arg), list($gt_gather_arg$, gt_gather_arg), list($tt_transitive_conduitP$, list($sym176$TRANSITIVE_PREDICATE_, gt_pred))), list(CSETQ, RESULT, listS(GENERIC_TTM, method, append(args, NIL)))), $list_alt144)),
							method_forms);
					    }
					}
				    }
				}
			    }
			}
			return listS(PROGN, list(SETUP_TRANSFERS_THROUGH_MODULE, module, list(QUOTE, plist)), listS(CPUSHNEW, module, $list_alt179), append(method_forms, NIL));
		    }
		} else {
		    cdestructuring_bind_error(datum, $list_alt131);
		}
	    }
	    return NIL;
	}
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
			    method_forms = cons(list(DEFINE, function, arg_list, listS(CLET, $list79, list(CLET, list(list($tt_pred$, tt_pred), list($gt_pred$, gt_pred), $list80, list($tt_index_arg$, tt_index_arg), list($tt_gather_arg$, tt_gather_arg), list($gt_index_arg$, gt_index_arg),
				    list($gt_gather_arg$, gt_gather_arg), list($tt_transitive_conduitP$, list($sym106$TRANSITIVE_PREDICATE_, gt_pred))), list(CSETQ, RESULT, listS(GENERIC_TTM, method, append(args, NIL)))), $list84)), method_forms);
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

    public static final SubLObject tti_module_alt(SubLObject macroform, SubLObject environment) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject datum = macroform.rest();
		SubLObject current = datum;
		SubLObject module = NIL;
		SubLObject plist = NIL;
		destructuring_bind_must_consp(current, datum, $list_alt131);
		module = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list_alt131);
		plist = current.first();
		current = current.rest();
		if (NIL == current) {
		    {
			SubLObject method_forms = NIL;
			if (plist.isCons()) {
			    {
				SubLObject tt_pred = getf(plist, $PREDICATE, UNPROVIDED);
				SubLObject gt_pred = getf(plist, $CONDUIT_PRED, UNPROVIDED);
				SubLObject ttmt = getf(plist, $MT, UNPROVIDED);
				SubLObject mode = $PREDICATE;
				SubLObject tt_index_arg = TWO_INTEGER;
				SubLObject tt_gather_arg = ONE_INTEGER;
				SubLObject gt_index_arg = TWO_INTEGER;
				SubLObject gt_gather_arg = ONE_INTEGER;
				SubLObject parameters = NIL;
				SubLObject parameter = NIL;
				for (parameters = plist, parameter = parameters.first(); NIL != parameters; parameters = cddr(parameters), parameter = parameters.first()) {
				    if (NIL != subl_promotions.memberP(parameter, $tt_methods$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
					{
					    SubLObject function = intern(string_utilities.str(second(parameters)), UNPROVIDED);
					    SubLObject arg_list = transitivity.add_mt_default(ttmt, third(assoc(parameter, $tt_dispatch_table$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)));
					    SubLObject args = list_utilities.args_from_arg_list(arg_list);
					    SubLObject method = parameter;
					    SubLObject pcase_var = mode;
					    if (pcase_var.eql($PREDICATE)) {
						method_forms = cons(list(DEFINE, function, arg_list, listS(CLET, $list_alt139, list(CLET, list(list($tt_pred$, tt_pred), list($gt_pred$, gt_pred), $list_alt140, list($tt_index_arg$, tt_index_arg), list($tt_gather_arg$, tt_gather_arg),
							list($gt_index_arg$, gt_index_arg), list($gt_gather_arg$, gt_gather_arg), list($tt_transitive_conduitP$, list($sym176$TRANSITIVE_PREDICATE_, gt_pred))), list(CSETQ, RESULT, listS(GENERIC_TTM, method, append(args, NIL)))), $list_alt144)),
							method_forms);
					    }
					}
				    }
				}
			    }
			}
			return listS(PROGN, list(SETUP_TRANSFERS_THROUGH_MODULE, module, list(QUOTE, plist)), listS(CPUSHNEW, module, $list_alt179), append(method_forms, NIL));
		    }
		} else {
		    cdestructuring_bind_error(datum, $list_alt131);
		}
	    }
	    return NIL;
	}
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
			    method_forms = cons(list(DEFINE, function, arg_list, listS(CLET, $list79, list(CLET, list(list($tt_pred$, tt_pred), list($gt_pred$, gt_pred), $list80, list($tt_index_arg$, tt_index_arg), list($tt_gather_arg$, tt_gather_arg), list($gt_index_arg$, gt_index_arg),
				    list($gt_gather_arg$, gt_gather_arg), list($tt_transitive_conduitP$, list($sym106$TRANSITIVE_PREDICATE_, gt_pred))), list(CSETQ, RESULT, listS(GENERIC_TTM, method, append(args, NIL)))), $list84)), method_forms);
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

    public static final SubLObject itti_module_alt(SubLObject macroform, SubLObject environment) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject datum = macroform.rest();
		SubLObject current = datum;
		SubLObject module = NIL;
		SubLObject plist = NIL;
		destructuring_bind_must_consp(current, datum, $list_alt131);
		module = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list_alt131);
		plist = current.first();
		current = current.rest();
		if (NIL == current) {
		    {
			SubLObject method_forms = NIL;
			if (plist.isCons()) {
			    {
				SubLObject tt_pred = getf(plist, $PREDICATE, UNPROVIDED);
				SubLObject gt_pred = getf(plist, $CONDUIT_PRED, UNPROVIDED);
				SubLObject ttmt = getf(plist, $MT, UNPROVIDED);
				SubLObject mode = $PREDICATE;
				SubLObject tt_index_arg = ONE_INTEGER;
				SubLObject tt_gather_arg = TWO_INTEGER;
				SubLObject gt_index_arg = TWO_INTEGER;
				SubLObject gt_gather_arg = ONE_INTEGER;
				SubLObject parameters = NIL;
				SubLObject parameter = NIL;
				for (parameters = plist, parameter = parameters.first(); NIL != parameters; parameters = cddr(parameters), parameter = parameters.first()) {
				    if (NIL != subl_promotions.memberP(parameter, $tt_methods$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
					{
					    SubLObject function = intern(string_utilities.str(second(parameters)), UNPROVIDED);
					    SubLObject arg_list = transitivity.add_mt_default(ttmt, third(assoc(parameter, $tt_dispatch_table$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)));
					    SubLObject args = list_utilities.args_from_arg_list(arg_list);
					    SubLObject method = parameter;
					    SubLObject pcase_var = mode;
					    if (pcase_var.eql($PREDICATE)) {
						method_forms = cons(list(DEFINE, function, arg_list, listS(CLET, $list_alt139, list(CLET, list(list($tt_pred$, tt_pred), list($gt_pred$, gt_pred), $list_alt140, list($tt_index_arg$, tt_index_arg), list($tt_gather_arg$, tt_gather_arg),
							list($gt_index_arg$, gt_index_arg), list($gt_gather_arg$, gt_gather_arg), list($tt_transitive_conduitP$, list($sym176$TRANSITIVE_PREDICATE_, gt_pred))), list(CSETQ, RESULT, listS(GENERIC_TTM, method, append(args, NIL)))), $list_alt144)),
							method_forms);
					    }
					}
				    }
				}
			    }
			}
			return listS(PROGN, list(SETUP_TRANSFERS_THROUGH_MODULE, module, list(QUOTE, plist)), listS(CPUSHNEW, module, $list_alt179), append(method_forms, NIL));
		    }
		} else {
		    cdestructuring_bind_error(datum, $list_alt131);
		}
	    }
	    return NIL;
	}
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
			    method_forms = cons(list(DEFINE, function, arg_list, listS(CLET, $list79, list(CLET, list(list($tt_pred$, tt_pred), list($gt_pred$, gt_pred), $list80, list($tt_index_arg$, tt_index_arg), list($tt_gather_arg$, tt_gather_arg), list($gt_index_arg$, gt_index_arg),
				    list($gt_gather_arg$, gt_gather_arg), list($tt_transitive_conduitP$, list($sym106$TRANSITIVE_PREDICATE_, gt_pred))), list(CSETQ, RESULT, listS(GENERIC_TTM, method, append(args, NIL)))), $list84)), method_forms);
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

    public static final SubLObject gt_within_transitive_via_argP_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return $gt_within_transitive_via_argP$.getDynamicValue(thread);
	}
    }

    public static SubLObject gt_within_transitive_via_argP() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return $gt_within_transitive_via_argP$.getDynamicValue(thread);
    }

    public static SubLObject declare_gt_vars_file() {
	declareFunction("gt_link_support", "GT-LINK-SUPPORT", 0, 0, false);
	declareFunction("gt_link_mt", "GT-LINK-MT", 0, 0, false);
	declareFunction("gt_link_pred", "GT-LINK-PRED", 0, 0, false);
	declareFunction("gt_use_sksiP", "GT-USE-SKSI?", 0, 0, false);
	declareMacro("transitivity_module", "TRANSITIVITY-MODULE");
	declareMacro("tt_module", "TT-MODULE");
	declareMacro("itt_module", "ITT-MODULE");
	declareMacro("tti_module", "TTI-MODULE");
	declareMacro("itti_module", "ITTI-MODULE");
	declareFunction("gt_within_transitive_via_argP", "GT-WITHIN-TRANSITIVE-VIA-ARG?", 0, 0, false);
	return NIL;
    }

    public static final SubLObject init_gt_vars_file_alt() {
	deflexical("*GT-DISPATCH-TABLE*", $list_alt0);
	defparameter("*GT-METHODS*", Mapping.mapcar(symbol_function(CAR), $gt_dispatch_table$.getGlobalValue()));
	defparameter("*GT-PARAMETERS*", append($list_alt6, $gt_methods$.getDynamicValue()));
	defparameter("*TRANSITIVITY-MODULES*", NIL);
	defparameter("*GT-PRED*", NIL);
	defparameter("*GT-INDEX*", NIL);
	defparameter("*GT-GATHER*", NIL);
	defparameter("*GT-INDEX-ARG*", ONE_INTEGER);
	defparameter("*GT-GATHER-ARG*", TWO_INTEGER);
	defparameter("*GT-ACCESSORS*", NIL);
	defparameter("*GT-LINK-TYPE*", $ASSERTION);
	defparameter("*GT-MODE*", $SUPERIOR);
	defparameter("*GT-MODES*", $list_alt29);
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
	defparameter("*TT-DISPATCH-TABLE*", $list_alt151);
	defparameter("*TT-METHODS*", Mapping.mapcar(symbol_function(CAR), $tt_dispatch_table$.getDynamicValue()));
	defparameter("*TRANSFERS-THROUGH-MODULES*", NIL);
	defparameter("*TT-PARAMETERS*", append($list_alt157, $tt_methods$.getDynamicValue()));
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

    public static SubLObject init_gt_vars_file() {
	if (SubLFiles.USE_V1) {
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
	}
	if (SubLFiles.USE_V2) {
	    defparameter("*GT-PARAMETERS*", append($list_alt6, $gt_methods$.getDynamicValue()));
	    defparameter("*GT-MODES*", $list_alt29);
	    defparameter("*TT-DISPATCH-TABLE*", $list_alt151);
	    defparameter("*TT-PARAMETERS*", append($list_alt157, $tt_methods$.getDynamicValue()));
	}
	return NIL;
    }

    public static SubLObject init_gt_vars_file_Previous() {
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

    public static final SubLObject setup_gt_vars_file_alt() {
	{
	    SubLObject item_var = $gt_dispatch_table$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_dispatch_table$, $str_alt2$table_used_to_dispatch_gt_methods);
	{
	    SubLObject item_var = $gt_methods$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_methods$, $$$candidate_methods_for_gt_modules);
	{
	    SubLObject item_var = $gt_parameters$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_parameters$, $str_alt8$candidate_parameters_for_gt_metho);
	{
	    SubLObject item_var = $transitivity_modules$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($transitivity_modules$, $str_alt10$all_cyc_modules_defined_using_the);
	{
	    SubLObject item_var = $gt_pred$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_pred$, $str_alt12$transitive_predicate_used_for_cur);
	{
	    SubLObject item_var = $gt_index$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_index$, $str_alt14$arg_used_as_initial_index_for_cur);
	{
	    SubLObject item_var = $gt_gather$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_gather$, $str_alt16$arg_used_as_initial_gather__e_g__);
	{
	    SubLObject item_var = $gt_index_arg$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_index_arg$, $str_alt18$indexing_arg_position_used_for_cu);
	{
	    SubLObject item_var = $gt_gather_arg$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_gather_arg$, $str_alt20$gathering_arg_position_used_for_c);
	{
	    SubLObject item_var = $gt_accessors$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_accessors$, $str_alt22$accessors_used_for_current_gt_que);
	{
	    SubLObject item_var = $gt_link_type$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_link_type$, $$$type_of_links_used_in_gt_module);
	{
	    SubLObject item_var = $gt_mode$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_mode$, $str_alt28$mode__e_g___direction__of_search_);
	{
	    SubLObject item_var = $gt_modes$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_modes$, $$$candidate_modes_for_gt_search);
	{
	    SubLObject item_var = $gt_truth$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_truth$, $str_alt34$truth_relevant_to_the_current_gt_);
	{
	    SubLObject item_var = $gt_query$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_query$, $str_alt36$literal_denoting_query_formula_of);
	{
	    SubLObject item_var = $gt_doneP$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_doneP$, $str_alt38$terminate_the_current_gt_search_);
	{
	    SubLObject item_var = $gt_searchedP$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_searchedP$, $str_alt40$current_gt_search_path_encountere);
	{
	    SubLObject item_var = $gt_target$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_target$, $$$target_of_current_gt_search);
	{
	    SubLObject item_var = $gt_result$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_result$, $str_alt44$accumlates_results_of_current_gt_);
	{
	    SubLObject item_var = $gt_searcher$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_searcher$, $str_alt46$current_searcher_during_multiple_);
	{
	    SubLObject item_var = $gt_base_fn$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_base_fn$, $str_alt48$fn_applied_to_each_candidate_node);
	{
	    SubLObject item_var = $gt_step_fn$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_step_fn$, $str_alt50$fn_used_to_step_from_one_node_to_);
	{
	    SubLObject item_var = $gt_compose_fn$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_compose_fn$, $str_alt52$fn_applied_to_each_accessed_node_);
	{
	    SubLObject item_var = $gt_gather_fn$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_gather_fn$, $str_alt54$fn_applied_to_each_accessed_node_);
	{
	    SubLObject item_var = $gt_combine_fn$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_combine_fn$, $str_alt57$fn_used_to_combine_results_of_com);
	{
	    SubLObject item_var = $gt_compare_fn$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_compare_fn$, $str_alt59$test_used_to_compare_each_accesse);
	{
	    SubLObject item_var = $gt_equality_fn$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_equality_fn$, $str_alt61$equality_test_used_to_remove_dupl);
	{
	    SubLObject item_var = $gt_compose_pred$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_compose_pred$, $str_alt63$composing_predicate_used_for_curr);
	{
	    SubLObject item_var = $gt_compose_index_arg$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_compose_index_arg$, $str_alt65$indexing_arg_position_used_for_co);
	{
	    SubLObject item_var = $gt_compose_gather_arg$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_compose_gather_arg$, $str_alt67$gathering_arg_position_used_for_c);
	{
	    SubLObject item_var = $gt_max_nodes_direction$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_max_nodes_direction$, $str_alt70$default_search_direction_when_com);
	{
	    SubLObject item_var = $gt_use_spec_predsP$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_use_spec_predsP$, $str_alt72$use_spec_preds_during_gt_searches);
	{
	    SubLObject item_var = $gt_handle_non_transitive_predicateP$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_handle_non_transitive_predicateP$, $str_alt74$make_gt_modules_applicable_to_non);
	{
	    SubLObject item_var = $gt_what_mts_result$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_what_mts_result$, $str_alt78$result_holder_for_what_mts);
	{
	    SubLObject item_var = $gt_what_mts_goal_node$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_what_mts_goal_node$, $str_alt80$goal_node_of_in_what_mt_searches);
	{
	    SubLObject item_var = $gt_path_list_of_mts$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_path_list_of_mts$, $$$list_of_mts_along_current_path);
	{
	    SubLObject item_var = $gt_path_list_of_nodes$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_path_list_of_nodes$, $str_alt84$path_list_of_nodes__accumulated_t);
	{
	    SubLObject item_var = $gt_path_length$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_path_length$, $$$length_of_current_mt_path);
	{
	    SubLObject item_var = $gt_list_of_path_lengths$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_list_of_path_lengths$, $$$list_of_path_lengths_in_order);
	{
	    SubLObject item_var = $gt_marking_table$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_marking_table$, $str_alt90$the_hash_table_where_we_do_the_ma);
	{
	    SubLObject item_var = $gt_target_marking_table$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_target_marking_table$, $str_alt92$used_for_the_occasional_nested_se);
	{
	    SubLObject item_var = $gt_depth_cutoff$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_depth_cutoff$, $$$depth_cutoff_for_the_search);
	{
	    SubLObject item_var = $gt_depth_cutoffP$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_depth_cutoffP$, $str_alt96$flag_for_whether_or_not_to_use_de);
	{
	    SubLObject item_var = $gt_prev_depth_cutoff$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_prev_depth_cutoff$, $str_alt98$what_the_previous_depth_cutoff_wa);
	{
	    SubLObject item_var = $gt_time_cutoffP$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_time_cutoffP$, $str_alt100$flag_for_whether_or_not_to_use_ti);
	{
	    SubLObject item_var = $gt_time_cutoff$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_time_cutoff$, $str_alt102$time_cutoff__in_seconds__for_the_);
	{
	    SubLObject item_var = $gt_initial_time$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_initial_time$, $str_alt104$when_did_the_timing_begin_);
	{
	    SubLObject item_var = $gt_answers_cutoffP$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_answers_cutoffP$, $str_alt106$flag_for_whether_or_not_to_use_nu);
	{
	    SubLObject item_var = $gt_answers_cutoff$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_answers_cutoff$, $str_alt108$number_of_answers_after_which_we_);
	{
	    SubLObject item_var = $gt_answers_so_far$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_answers_so_far$, $str_alt110$accumulator_for_number_of_answers);
	{
	    SubLObject item_var = $gt_goal_node$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_goal_node$, $$$goal_node);
	{
	    SubLObject item_var = $gt_edge_list$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_edge_list$, $str_alt114$list_of_edges_along_search__for_g);
	{
	    SubLObject item_var = $gt_edge_list_returnP$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_edge_list_returnP$, $str_alt116$are_we_gather_edge_lists_);
	{
	    SubLObject item_var = $gt_path_list_of_assertions$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_path_list_of_assertions$, $str_alt118$list_of_assertions_along_search__);
	{
	    SubLObject item_var = $gt_cyclical_edges$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_cyclical_edges$, $str_alt120$list_of_pairs__a_b___where_a_is_t);
	{
	    SubLObject item_var = $gt_trace_level$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_trace_level$, $str_alt122$controls_extent_of_tracing__warni);
	{
	    SubLObject item_var = $gt_test_level$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_test_level$, $str_alt124$controls_extent_of_testing_for_th);
	{
	    SubLObject item_var = $suspend_gt_type_checkingP$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($suspend_gt_type_checkingP$, $str_alt126$skip_type_checking_during_gt_quer);
	{
	    SubLObject item_var = $gt_warnings$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_warnings$, $str_alt128$warnings_from_transitiviy_module_);
	{
	    SubLObject item_var = $gt_use_sksiP$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_use_sksiP$, $str_alt130$controls_whether_SKSI_modules_are);
	{
	    SubLObject item_var = $tt_dispatch_table$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($tt_dispatch_table$, $str_alt153$table_used_to_dispatch_tt_methods);
	{
	    SubLObject item_var = $tt_methods$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($tt_methods$, $$$candidate_methods_for_gt_modules);
	{
	    SubLObject item_var = $transfers_through_modules$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($transfers_through_modules$, $str_alt156$all_cyc_modules_defined_using_the);
	{
	    SubLObject item_var = $tt_parameters$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($tt_parameters$, $str_alt159$candidate_parameters_for_tt_metho);
	{
	    SubLObject item_var = $tt_pred$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($tt_pred$, $str_alt161$transitive_predicate_used_for_cur);
	{
	    SubLObject item_var = $tt_index$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($tt_index$, $str_alt163$arg_used_as_initial_index_for_cur);
	{
	    SubLObject item_var = $tt_gather$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($tt_gather$, $str_alt165$arg_used_as_initial_gather__e_g__);
	{
	    SubLObject item_var = $tt_index_arg$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($tt_index_arg$, $str_alt167$indexing_arg_position_used_for_cu);
	{
	    SubLObject item_var = $tt_gather_arg$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($tt_gather_arg$, $str_alt169$gathering_arg_position_used_for_c);
	{
	    SubLObject item_var = $tt_truth$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($tt_truth$, $str_alt34$truth_relevant_to_the_current_gt_);
	{
	    SubLObject item_var = $tt_step_fn$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($tt_step_fn$, $str_alt172$fn_used_to_step_from_one_node_to_);
	{
	    SubLObject item_var = $tt_transitive_conduitP$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($tt_transitive_conduitP$, $str_alt174$is_conduit_arg_transitive_in_curr);
	{
	    SubLObject item_var = $gt_transitive_via_arg_activeP$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_transitive_via_arg_activeP$, $str_alt181$is_the_gt_transitive_via_arg_modu);
	{
	    SubLObject item_var = $gt_within_transitive_via_argP$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	note_state_variable_documentation($gt_within_transitive_via_argP$, $str_alt183$currently_within_scope_of_a_gt_tr);
	return NIL;
    }

    public static SubLObject setup_gt_vars_file() {
	if (SubLFiles.USE_V1) {
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
	    item_var = $gt_doneP$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	    item_var = $gt_searchedP$;
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
	    item_var = $gt_use_spec_predsP$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	    item_var = $gt_handle_non_transitive_predicateP$;
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
	    item_var = $gt_depth_cutoffP$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	    item_var = $gt_prev_depth_cutoff$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	    item_var = $gt_time_cutoffP$;
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
	    item_var = $gt_answers_cutoffP$;
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
	    item_var = $gt_edge_list_returnP$;
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
	    item_var = $suspend_gt_type_checkingP$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	    item_var = $gt_warnings$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	    item_var = $gt_use_sksiP$;
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
	    item_var = $tt_transitive_conduitP$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	    item_var = $gt_transitive_via_arg_activeP$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	    item_var = $gt_within_transitive_via_argP$;
	    if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		$gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	    }
	}
	if (SubLFiles.USE_V2) {
	    {
		SubLObject item_var = $gt_dispatch_table$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_dispatch_table$, $str_alt2$table_used_to_dispatch_gt_methods);
	    {
		SubLObject item_var = $gt_methods$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_methods$, $$$candidate_methods_for_gt_modules);
	    {
		SubLObject item_var = $gt_parameters$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_parameters$, $str_alt8$candidate_parameters_for_gt_metho);
	    {
		SubLObject item_var = $transitivity_modules$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($transitivity_modules$, $str_alt10$all_cyc_modules_defined_using_the);
	    {
		SubLObject item_var = $gt_pred$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_pred$, $str_alt12$transitive_predicate_used_for_cur);
	    {
		SubLObject item_var = $gt_index$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_index$, $str_alt14$arg_used_as_initial_index_for_cur);
	    {
		SubLObject item_var = $gt_gather$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_gather$, $str_alt16$arg_used_as_initial_gather__e_g__);
	    {
		SubLObject item_var = $gt_index_arg$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_index_arg$, $str_alt18$indexing_arg_position_used_for_cu);
	    {
		SubLObject item_var = $gt_gather_arg$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_gather_arg$, $str_alt20$gathering_arg_position_used_for_c);
	    {
		SubLObject item_var = $gt_accessors$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_accessors$, $str_alt22$accessors_used_for_current_gt_que);
	    {
		SubLObject item_var = $gt_link_type$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_link_type$, $$$type_of_links_used_in_gt_module);
	    {
		SubLObject item_var = $gt_mode$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_mode$, $str_alt28$mode__e_g___direction__of_search_);
	    {
		SubLObject item_var = $gt_modes$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_modes$, $$$candidate_modes_for_gt_search);
	    {
		SubLObject item_var = $gt_truth$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_truth$, $str_alt34$truth_relevant_to_the_current_gt_);
	    {
		SubLObject item_var = $gt_query$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_query$, $str_alt36$literal_denoting_query_formula_of);
	    {
		SubLObject item_var = $gt_doneP$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_doneP$, $str_alt38$terminate_the_current_gt_search_);
	    {
		SubLObject item_var = $gt_searchedP$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_searchedP$, $str_alt40$current_gt_search_path_encountere);
	    {
		SubLObject item_var = $gt_target$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_target$, $$$target_of_current_gt_search);
	    {
		SubLObject item_var = $gt_result$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_result$, $str_alt44$accumlates_results_of_current_gt_);
	    {
		SubLObject item_var = $gt_searcher$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_searcher$, $str_alt46$current_searcher_during_multiple_);
	    {
		SubLObject item_var = $gt_base_fn$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_base_fn$, $str_alt48$fn_applied_to_each_candidate_node);
	    {
		SubLObject item_var = $gt_step_fn$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_step_fn$, $str_alt50$fn_used_to_step_from_one_node_to_);
	    {
		SubLObject item_var = $gt_compose_fn$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_compose_fn$, $str_alt52$fn_applied_to_each_accessed_node_);
	    {
		SubLObject item_var = $gt_gather_fn$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_gather_fn$, $str_alt54$fn_applied_to_each_accessed_node_);
	    {
		SubLObject item_var = $gt_combine_fn$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_combine_fn$, $str_alt57$fn_used_to_combine_results_of_com);
	    {
		SubLObject item_var = $gt_compare_fn$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_compare_fn$, $str_alt59$test_used_to_compare_each_accesse);
	    {
		SubLObject item_var = $gt_equality_fn$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_equality_fn$, $str_alt61$equality_test_used_to_remove_dupl);
	    {
		SubLObject item_var = $gt_compose_pred$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_compose_pred$, $str_alt63$composing_predicate_used_for_curr);
	    {
		SubLObject item_var = $gt_compose_index_arg$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_compose_index_arg$, $str_alt65$indexing_arg_position_used_for_co);
	    {
		SubLObject item_var = $gt_compose_gather_arg$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_compose_gather_arg$, $str_alt67$gathering_arg_position_used_for_c);
	    {
		SubLObject item_var = $gt_max_nodes_direction$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_max_nodes_direction$, $str_alt70$default_search_direction_when_com);
	    {
		SubLObject item_var = $gt_use_spec_predsP$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_use_spec_predsP$, $str_alt72$use_spec_preds_during_gt_searches);
	    {
		SubLObject item_var = $gt_handle_non_transitive_predicateP$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_handle_non_transitive_predicateP$, $str_alt74$make_gt_modules_applicable_to_non);
	    {
		SubLObject item_var = $gt_what_mts_result$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_what_mts_result$, $str_alt78$result_holder_for_what_mts);
	    {
		SubLObject item_var = $gt_what_mts_goal_node$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_what_mts_goal_node$, $str_alt80$goal_node_of_in_what_mt_searches);
	    {
		SubLObject item_var = $gt_path_list_of_mts$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_path_list_of_mts$, $$$list_of_mts_along_current_path);
	    {
		SubLObject item_var = $gt_path_list_of_nodes$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_path_list_of_nodes$, $str_alt84$path_list_of_nodes__accumulated_t);
	    {
		SubLObject item_var = $gt_path_length$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_path_length$, $$$length_of_current_mt_path);
	    {
		SubLObject item_var = $gt_list_of_path_lengths$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_list_of_path_lengths$, $$$list_of_path_lengths_in_order);
	    {
		SubLObject item_var = $gt_marking_table$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_marking_table$, $str_alt90$the_hash_table_where_we_do_the_ma);
	    {
		SubLObject item_var = $gt_target_marking_table$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_target_marking_table$, $str_alt92$used_for_the_occasional_nested_se);
	    {
		SubLObject item_var = $gt_depth_cutoff$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_depth_cutoff$, $$$depth_cutoff_for_the_search);
	    {
		SubLObject item_var = $gt_depth_cutoffP$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_depth_cutoffP$, $str_alt96$flag_for_whether_or_not_to_use_de);
	    {
		SubLObject item_var = $gt_prev_depth_cutoff$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_prev_depth_cutoff$, $str_alt98$what_the_previous_depth_cutoff_wa);
	    {
		SubLObject item_var = $gt_time_cutoffP$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_time_cutoffP$, $str_alt100$flag_for_whether_or_not_to_use_ti);
	    {
		SubLObject item_var = $gt_time_cutoff$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_time_cutoff$, $str_alt102$time_cutoff__in_seconds__for_the_);
	    {
		SubLObject item_var = $gt_initial_time$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_initial_time$, $str_alt104$when_did_the_timing_begin_);
	    {
		SubLObject item_var = $gt_answers_cutoffP$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_answers_cutoffP$, $str_alt106$flag_for_whether_or_not_to_use_nu);
	    {
		SubLObject item_var = $gt_answers_cutoff$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_answers_cutoff$, $str_alt108$number_of_answers_after_which_we_);
	    {
		SubLObject item_var = $gt_answers_so_far$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_answers_so_far$, $str_alt110$accumulator_for_number_of_answers);
	    {
		SubLObject item_var = $gt_goal_node$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_goal_node$, $$$goal_node);
	    {
		SubLObject item_var = $gt_edge_list$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_edge_list$, $str_alt114$list_of_edges_along_search__for_g);
	    {
		SubLObject item_var = $gt_edge_list_returnP$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_edge_list_returnP$, $str_alt116$are_we_gather_edge_lists_);
	    {
		SubLObject item_var = $gt_path_list_of_assertions$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_path_list_of_assertions$, $str_alt118$list_of_assertions_along_search__);
	    {
		SubLObject item_var = $gt_cyclical_edges$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_cyclical_edges$, $str_alt120$list_of_pairs__a_b___where_a_is_t);
	    {
		SubLObject item_var = $gt_trace_level$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_trace_level$, $str_alt122$controls_extent_of_tracing__warni);
	    {
		SubLObject item_var = $gt_test_level$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_test_level$, $str_alt124$controls_extent_of_testing_for_th);
	    {
		SubLObject item_var = $suspend_gt_type_checkingP$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($suspend_gt_type_checkingP$, $str_alt126$skip_type_checking_during_gt_quer);
	    {
		SubLObject item_var = $gt_warnings$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_warnings$, $str_alt128$warnings_from_transitiviy_module_);
	    {
		SubLObject item_var = $gt_use_sksiP$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_use_sksiP$, $str_alt130$controls_whether_SKSI_modules_are);
	    {
		SubLObject item_var = $tt_dispatch_table$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($tt_dispatch_table$, $str_alt153$table_used_to_dispatch_tt_methods);
	    {
		SubLObject item_var = $tt_methods$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($tt_methods$, $$$candidate_methods_for_gt_modules);
	    {
		SubLObject item_var = $transfers_through_modules$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($transfers_through_modules$, $str_alt156$all_cyc_modules_defined_using_the);
	    {
		SubLObject item_var = $tt_parameters$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($tt_parameters$, $str_alt159$candidate_parameters_for_tt_metho);
	    {
		SubLObject item_var = $tt_pred$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($tt_pred$, $str_alt161$transitive_predicate_used_for_cur);
	    {
		SubLObject item_var = $tt_index$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($tt_index$, $str_alt163$arg_used_as_initial_index_for_cur);
	    {
		SubLObject item_var = $tt_gather$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($tt_gather$, $str_alt165$arg_used_as_initial_gather__e_g__);
	    {
		SubLObject item_var = $tt_index_arg$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($tt_index_arg$, $str_alt167$indexing_arg_position_used_for_cu);
	    {
		SubLObject item_var = $tt_gather_arg$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($tt_gather_arg$, $str_alt169$gathering_arg_position_used_for_c);
	    {
		SubLObject item_var = $tt_truth$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($tt_truth$, $str_alt34$truth_relevant_to_the_current_gt_);
	    {
		SubLObject item_var = $tt_step_fn$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($tt_step_fn$, $str_alt172$fn_used_to_step_from_one_node_to_);
	    {
		SubLObject item_var = $tt_transitive_conduitP$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($tt_transitive_conduitP$, $str_alt174$is_conduit_arg_transitive_in_curr);
	    {
		SubLObject item_var = $gt_transitive_via_arg_activeP$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_transitive_via_arg_activeP$, $str_alt181$is_the_gt_transitive_via_arg_modu);
	    {
		SubLObject item_var = $gt_within_transitive_via_argP$;
		if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
		    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
		}
	    }
	    note_state_variable_documentation($gt_within_transitive_via_argP$, $str_alt183$currently_within_scope_of_a_gt_tr);
	}
	return NIL;
    }

    public static SubLObject setup_gt_vars_file_Previous() {
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
	item_var = $gt_doneP$;
	if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	}
	item_var = $gt_searchedP$;
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
	item_var = $gt_use_spec_predsP$;
	if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	}
	item_var = $gt_handle_non_transitive_predicateP$;
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
	item_var = $gt_depth_cutoffP$;
	if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	}
	item_var = $gt_prev_depth_cutoff$;
	if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	}
	item_var = $gt_time_cutoffP$;
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
	item_var = $gt_answers_cutoffP$;
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
	item_var = $gt_edge_list_returnP$;
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
	item_var = $suspend_gt_type_checkingP$;
	if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	}
	item_var = $gt_warnings$;
	if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	}
	item_var = $gt_use_sksiP$;
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
	item_var = $tt_transitive_conduitP$;
	if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	}
	item_var = $gt_transitive_via_arg_activeP$;
	if (NIL == member(item_var, $gt_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
	    $gt_state_variables$.setGlobalValue(cons(item_var, $gt_state_variables$.getGlobalValue()));
	}
	item_var = $gt_within_transitive_via_argP$;
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

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(new SubLObject[] { list(makeKeyword("SUPERIORS"), makeSymbol("GTM-SUPERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("INFERIORS"), makeSymbol("GTM-INFERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("MIN-SUPERIORS"), makeSymbol("GTM-MIN-SUPERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("MAX-INFERIORS"), makeSymbol("GTM-MAX-INFERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("CO-INFERIORS"), makeSymbol("GTM-CO-INFERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("CO-SUPERIORS"), makeSymbol("GTM-CO-SUPERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("REDUNDANT-SUPERIORS"), makeSymbol("GTM-REDUNDANT-SUPERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("REDUNDANT-INFERIORS"), makeSymbol("GTM-REDUNDANT-INFERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("ALL-SUPERIORS"), makeSymbol("GTM-ALL-SUPERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("ALL-INFERIORS"), makeSymbol("GTM-ALL-INFERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("ALL-ACCESSIBLE"), makeSymbol("GTM-ALL-ACCESSIBLE"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("UNION-ALL-INFERIORS"), makeSymbol("GTM-UNION-ALL-INFERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("COMPOSE-FN-SUPERIORS"), makeSymbol("GTM-COMPOSE-FN-ALL-SUPERIORS"), list(makeSymbol("FORT"), makeSymbol("FN"), makeSymbol("&OPTIONAL"), list(makeSymbol("COMBINE-FN"), list(QUOTE, makeSymbol("NCONC"))), makeSymbol("MT"))),
	    list(makeKeyword("COMPOSE-FN-INFERIORS"), makeSymbol("GTM-COMPOSE-FN-ALL-INFERIORS"), list(makeSymbol("FORT"), makeSymbol("FN"), makeSymbol("&OPTIONAL"), list(makeSymbol("COMBINE-FN"), list(QUOTE, makeSymbol("NCONC"))), makeSymbol("MT"))),
	    list(makeKeyword("ALL-DEPENDENT-INFERIORS"), makeSymbol("GTM-ALL-DEPENDENT-INFERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("COMPOSE-PRED-SUPERIORS"), makeSymbol("GTM-COMPOSE-PRED-ALL-SUPERIORS"), list(makeSymbol("FORT"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), list(makeSymbol("INDEX"), ONE_INTEGER), list(makeSymbol("GATHER"), TWO_INTEGER), makeSymbol("MT"))),
	    list(makeKeyword("COMPOSE-PRED-INFERIORS"), makeSymbol("GTM-COMPOSE-PRED-ALL-INFERIORS"), list(makeSymbol("FORT"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), list(makeSymbol("INDEX"), ONE_INTEGER), list(makeSymbol("GATHER"), TWO_INTEGER), makeSymbol("MT"))),
	    list(makeKeyword("ROOTS"), makeSymbol("GTM-ROOTS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("LEAVES"), makeSymbol("GTM-LEAVES"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("BOOLEAN?"), makeSymbol("GTM-BOOLEAN?"), list(makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("SUPERIOR?"), makeSymbol("GTM-SUPERIOR?"), list(makeSymbol("SUPERIOR"), makeSymbol("INFERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("INFERIOR?"), makeSymbol("GTM-INFERIOR?"), list(makeSymbol("INFERIOR"), makeSymbol("SUPERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("HAS-SUPERIOR?"), makeSymbol("GTM-HAS-SUPERIOR?"), list(makeSymbol("INFERIOR"), makeSymbol("SUPERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("HAS-INFERIOR?"), makeSymbol("GTM-HAS-INFERIOR?"), list(makeSymbol("SUPERIOR"), makeSymbol("INFERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("GATHER-SUPERIOR"), makeSymbol("GTM-GATHER-SUPERIOR"), list(makeSymbol("SPEC"), makeSymbol("GATHER-FN"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("GATHER-INFERIOR"), makeSymbol("GTM-GATHER-INFERIOR"), list(makeSymbol("GENL"), makeSymbol("GATHER-FN"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("CYCLES?"), makeSymbol("GTM-CYCLES?"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("COMPLETES-CYCLE?"), makeSymbol("GTM-COMPLETES-CYCLE?"), list(makeSymbol("FORT-1"), makeSymbol("FORT-2"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("MIN-NODES"), makeSymbol("GTM-MIN-NODES"), list(makeSymbol("FORTS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("MAX-NODES"), makeSymbol("GTM-MAX-NODES"), list(makeSymbol("FORTS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("MIN-CEILINGS"), makeSymbol("GTM-MIN-CEILINGS"), list(makeSymbol("FORTS"), makeSymbol("&OPTIONAL"), makeSymbol("CANDIDATES"), makeSymbol("MT"))),
	    list(makeKeyword("MAX-FLOORS"), makeSymbol("GTM-MAX-FLOORS"), list(makeSymbol("FORTS"), makeSymbol("&OPTIONAL"), makeSymbol("CANDIDATES"), makeSymbol("MT"))),
	    list(makeKeyword("MIN-SUPERIORS-EXCLUDING"), makeSymbol("GTM-MIN-SUPERIORS-EXCLUDING"), list(makeSymbol("INFERIOR"), makeSymbol("SUPERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("MAX-INFERIORS-EXCLUDING"), makeSymbol("GTM-MAX-INFERIORS-EXCLUDING"), list(makeSymbol("SUPERIOR"), makeSymbol("INFERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("ANY-SUPERIOR-PATH"), makeSymbol("GTM-ANY-SUPERIOR-PATH"), list(makeSymbol("INFERIOR"), makeSymbol("SUPERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("WHY-SUPERIOR?"), makeSymbol("GTM-WHY-SUPERIOR?"), list(makeSymbol("SUPERIOR"), makeSymbol("INFERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("WHY-COMPLETES-CYCLE?"), makeSymbol("GTM-WHY-COMPLETES-CYCLE?"), list(makeSymbol("FORT1"), makeSymbol("FORT2"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("ALL-SUPERIOR-EDGES"), makeSymbol("GTM-ALL-SUPERIOR-EDGES"), list(makeSymbol("INFERIOR"), makeSymbol("SUPERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("ALL-INFERIOR-EDGES"), makeSymbol("GTM-ALL-INFERIOR-EDGES"), list(makeSymbol("INFERIOR"), makeSymbol("SUPERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("ALL-PATHS"), makeSymbol("GTM-ALL-PATHS"), list(makeSymbol("INFERIOR"), makeSymbol("SUPERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("INFERIORS-WITH-MTS"), makeSymbol("GTM-ALL-INFERIORS-WITH-MTS"), list(makeSymbol("SUPERIOR"))),
	    list(makeKeyword("SUPERIOR-IN-WHAT-MTS"), makeSymbol("GTM-IN-WHAT-MTS"), list(makeSymbol("INFERIOR"), makeSymbol("SUPERIOR"), makeSymbol("KEY-METHOD"))),
	    list(makeKeyword("INFERIOR-IN-WHAT-MTS"), makeSymbol("GTM-IN-WHAT-MTS"), list(makeSymbol("SUPERIOR"), makeSymbol("INFERIOR"), makeSymbol("KEY-METHOD"))),
	    list(makeKeyword("ACCESSIBLE-IN-WHAT-MTS"), makeSymbol("GTM-ACCESSIBLE-IN-WHAT-MTS"), list(makeSymbol("INFERIOR"), makeSymbol("SUPERIOR"), makeSymbol("KEY-METHOD"))) });

    static private final SubLString $str_alt2$table_used_to_dispatch_gt_methods = makeString("table used to dispatch gt methods as actual calls on gt executables");

    static private final SubLString $$$candidate_methods_for_gt_modules = makeString("candidate methods for gt modules");

    static private final SubLList $list_alt6 = list(makeKeyword("PREDICATE"), makeKeyword("INDEX-ARG"), makeKeyword("GATHER-ARG"), makeKeyword("ACCESSORS"), makeKeyword("MT"));

    static private final SubLString $str_alt8$candidate_parameters_for_gt_metho = makeString("candidate parameters for gt methods");

    static private final SubLString $str_alt10$all_cyc_modules_defined_using_the = makeString("all cyc modules defined using the general transitivity module");

    static private final SubLString $str_alt12$transitive_predicate_used_for_cur = makeString("transitive predicate used for current gt query");

    static private final SubLString $str_alt14$arg_used_as_initial_index_for_cur = makeString("arg used as initial index for current gt query");

    static private final SubLString $str_alt16$arg_used_as_initial_gather__e_g__ = makeString("arg used as initial gather (e.g., search target) for current gt query");

    static private final SubLString $str_alt18$indexing_arg_position_used_for_cu = makeString("indexing arg position used for current gt query");

    static private final SubLString $str_alt20$gathering_arg_position_used_for_c = makeString("gathering arg position used for current gt query");

    static private final SubLString $str_alt22$accessors_used_for_current_gt_que = makeString("accessors used for current gt query");

    static private final SubLString $$$type_of_links_used_in_gt_module = makeString("type of links used in gt module");

    static private final SubLString $str_alt28$mode__e_g___direction__of_search_ = makeString("mode (e.g., direction) of search during gt query");

    static private final SubLList $list_alt29 = list(makeKeyword("SUPERIOR"), makeKeyword("INFERIOR"), makeKeyword("ACCESSIBLE"), makeKeyword("DIRECTED"), makeKeyword("INVERSE"));

    static private final SubLString $$$candidate_modes_for_gt_search = makeString("candidate modes for gt search");

    static private final SubLString $str_alt34$truth_relevant_to_the_current_gt_ = makeString("truth relevant to the current gt query [:true :false]");

    static private final SubLString $str_alt36$literal_denoting_query_formula_of = makeString("literal denoting query formula of current gt query");

    static private final SubLString $str_alt38$terminate_the_current_gt_search_ = makeString("terminate the current gt search?");

    static private final SubLString $str_alt40$current_gt_search_path_encountere = makeString("current gt search path encountered searched nodes");

    static private final SubLString $$$target_of_current_gt_search = makeString("target of current gt search");

    static private final SubLString $str_alt44$accumlates_results_of_current_gt_ = makeString("accumlates results of current gt query");

    static private final SubLString $str_alt46$current_searcher_during_multiple_ = makeString("current searcher during multiple-searcher gt search");

    static private final SubLString $str_alt48$fn_applied_to_each_candidate_node = makeString("fn applied to each candidate node during gt search");

    static private final SubLString $str_alt50$fn_used_to_step_from_one_node_to_ = makeString("fn used to step from one node to another during gt closure search");

    static private final SubLString $str_alt52$fn_applied_to_each_accessed_node_ = makeString("fn applied to each accessed node during composing gt search");

    static private final SubLString $str_alt54$fn_applied_to_each_accessed_node_ = makeString("fn applied to each accessed node durung a gather gt search");

    static private final SubLString $str_alt57$fn_used_to_combine_results_of_com = makeString("fn used to combine results of composing fn applied to each accessed node");

    static private final SubLString $str_alt59$test_used_to_compare_each_accesse = makeString("test used to compare each accessed node with target during gt search");

    static private final SubLString $str_alt61$equality_test_used_to_remove_dupl = makeString("equality test used to remove duplicates from non-fort results during gt search");

    static private final SubLString $str_alt63$composing_predicate_used_for_curr = makeString("composing predicate used for current composing gt query");

    static private final SubLString $str_alt65$indexing_arg_position_used_for_co = makeString("indexing arg position used for composing pred in current gt query");

    static private final SubLString $str_alt67$gathering_arg_position_used_for_c = makeString("gathering arg position used for composing pred in current gt query");

    static private final SubLString $str_alt70$default_search_direction_when_com = makeString("default search direction when computing gt-max-nodes");

    static private final SubLString $str_alt72$use_spec_preds_during_gt_searches = makeString("use spec preds during gt searches?");

    static private final SubLString $str_alt74$make_gt_modules_applicable_to_non = makeString("make gt modules applicable to non-transitive predicates?");

    static private final SubLString $str_alt75$Current_link_support__a_is_not_a_ = makeString("Current link support ~a is not a valid support for determining link mt.");

    static private final SubLString $str_alt76$Current_link_support__a_is_not_a_ = makeString("Current link support ~a is not a valid support for determining link predicate.");

    static private final SubLString $str_alt78$result_holder_for_what_mts = makeString("result holder for what-mts");

    static private final SubLString $str_alt80$goal_node_of_in_what_mt_searches = makeString("goal node of in-what-mt searches");

    static private final SubLString $$$list_of_mts_along_current_path = makeString("list of mts along current path");

    static private final SubLString $str_alt84$path_list_of_nodes__accumulated_t = makeString("path list of nodes, accumulated to guard against cycles");

    static private final SubLString $$$length_of_current_mt_path = makeString("length of current mt path");

    static private final SubLString $$$list_of_path_lengths_in_order = makeString("list of path lengths in order");

    static private final SubLString $str_alt90$the_hash_table_where_we_do_the_ma = makeString("the hash table where we do the marking (usually dynamic)");

    static private final SubLString $str_alt92$used_for_the_occasional_nested_se = makeString("used for the occasional nested search");

    static private final SubLString $$$depth_cutoff_for_the_search = makeString("depth cutoff for the search");

    static private final SubLString $str_alt96$flag_for_whether_or_not_to_use_de = makeString("flag for whether or not to use depth cutoff");

    static private final SubLString $str_alt98$what_the_previous_depth_cutoff_wa = makeString("what the previous depth cutoff was, used for iterive deepening");

    static private final SubLString $str_alt100$flag_for_whether_or_not_to_use_ti = makeString("flag for whether or not to use time cutoff");

    static private final SubLString $str_alt102$time_cutoff__in_seconds__for_the_ = makeString("time cutoff, in seconds, for the search");

    static private final SubLString $str_alt104$when_did_the_timing_begin_ = makeString("when did the timing begin?");

    static private final SubLString $str_alt106$flag_for_whether_or_not_to_use_nu = makeString("flag for whether or not to use number of answers cutoff");

    static private final SubLString $str_alt108$number_of_answers_after_which_we_ = makeString("number of answers after which we are done searching");

    static private final SubLString $str_alt110$accumulator_for_number_of_answers = makeString("accumulator for number of answers so far");

    static private final SubLString $$$goal_node = makeString("goal node");

    static private final SubLString $str_alt114$list_of_edges_along_search__for_g = makeString("list of edges along search, for graphing");

    static private final SubLString $str_alt116$are_we_gather_edge_lists_ = makeString("are we gather edge lists?");

    static private final SubLString $str_alt118$list_of_assertions_along_search__ = makeString("list of assertions along search. for graphing");

    static private final SubLString $str_alt120$list_of_pairs__a_b___where_a_is_t = makeString("list of pairs (a b), where a is the node in the search upon\n  which the cycle was discovered, and b is the edge list of a cycle it belongs to");

    static private final SubLString $str_alt122$controls_extent_of_tracing__warni = makeString("controls extent of tracing, warnings, etc., for the general transitivity module [0 .. 5]");

    static private final SubLString $str_alt124$controls_extent_of_testing_for_th = makeString("controls extent of testing for the general transitivity module [0 .. 5]");

    static private final SubLString $str_alt126$skip_type_checking_during_gt_quer = makeString("skip type checking during gt queries?");

    static private final SubLString $str_alt128$warnings_from_transitiviy_module_ = makeString("warnings from transitiviy module; possible values: :invalid-module :invalid-method");

    static private final SubLString $str_alt130$controls_whether_SKSI_modules_are = makeString("controls whether SKSI modules are used");

    static private final SubLList $list_alt131 = list(makeSymbol("MODULE"), makeSymbol("PLIST"));

    static private final SubLList $list_alt139 = list(makeSymbol("RESULT"));

    static private final SubLList $list_alt140 = list(makeSymbol("*GT-LINK-TYPE*"), makeKeyword("ASSERTION"));

    static private final SubLList $list_alt141 = list(list(makeSymbol("*GT-MARKING-TABLE*"), list(makeSymbol("MAKE-HASH-TABLE"), makeInteger(128))));

    static private final SubLList $list_alt144 = list(list(RET, makeSymbol("RESULT")));

    static private final SubLList $list_alt146 = list(list(makeSymbol("*GT-LINK-TYPE*"), makeKeyword("ACCESSORS")));

    static private final SubLList $list_alt150 = list(makeSymbol("*TRANSITIVITY-MODULES*"));

    static private final SubLList $list_alt151 = list(list(makeKeyword("ALL-TARGETS"), makeSymbol("TTM-ALL-TARGETS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("ALL-SOURCES"), makeSymbol("TTM-ALL-SOURCES"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("BOOLEAN?"), makeSymbol("TTM-BOOLEAN?"), list(makeSymbol("FORT"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))),
	    list(makeKeyword("ACCESSES-IN-WHAT-MTS"), makeSymbol("TTM-ACCESSES-IN-WHAT-MTS"), list(makeSymbol("FORT"), makeSymbol("TERM"))));

    static private final SubLString $str_alt153$table_used_to_dispatch_tt_methods = makeString("table used to dispatch tt methods as actual calls on tt executables");

    static private final SubLString $str_alt156$all_cyc_modules_defined_using_the = makeString("all cyc modules defined using the general transfers-through module");

    static private final SubLList $list_alt157 = list(makeKeyword("PREDICATE"), makeKeyword("CONDUIT-PRED"), makeKeyword("TT-INDEX-ARG"), makeKeyword("TT-GATHER-ARG"), makeKeyword("GT-INDEX-ARG"), makeKeyword("GT-GATHER-ARG"), makeKeyword("MT"));

    static private final SubLString $str_alt159$candidate_parameters_for_tt_metho = makeString("candidate parameters for tt methods");

    static private final SubLString $str_alt161$transitive_predicate_used_for_cur = makeString("transitive predicate used for current tt query");

    static private final SubLString $str_alt163$arg_used_as_initial_index_for_cur = makeString("arg used as initial index for current tt query");

    static private final SubLString $str_alt165$arg_used_as_initial_gather__e_g__ = makeString("arg used as initial gather (e.g., search target) for current tt query");

    static private final SubLString $str_alt167$indexing_arg_position_used_for_cu = makeString("indexing arg position used for current tt query");

    static private final SubLString $str_alt169$gathering_arg_position_used_for_c = makeString("gathering arg position used for current tt query");

    static private final SubLString $str_alt172$fn_used_to_step_from_one_node_to_ = makeString("fn used to step from one node to another during tt search");

    static private final SubLString $str_alt174$is_conduit_arg_transitive_in_curr = makeString("is conduit-arg transitive in current tt search?");

    static private final SubLSymbol $sym176$TRANSITIVE_PREDICATE_ = makeSymbol("TRANSITIVE-PREDICATE?");

    static private final SubLList $list_alt179 = list(makeSymbol("*TRANSFERS-THROUGH-MODULES*"));

    static private final SubLString $str_alt181$is_the_gt_transitive_via_arg_modu = makeString("is the gt-transitive-via-arg module active?");

    static private final SubLString $str_alt183$currently_within_scope_of_a_gt_tr = makeString("currently within scope of a gt-transitive-via-arg module?");
}
