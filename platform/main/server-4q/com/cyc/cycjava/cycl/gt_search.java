/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class gt_search extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new gt_search();

 public static final String myName = "com.cyc.cycjava.cycl.gt_search";


    static private final SubLString $str4$illegal_value_of__gt_mode____s = makeString("illegal value of *gt-mode*: ~s");

    private static final SubLSymbol GT_GATHER_LINK_NODE = makeSymbol("GT-GATHER-LINK-NODE");

    private static final SubLSymbol GT_GATHER_SIBLING_NODE = makeSymbol("GT-GATHER-SIBLING-NODE");

    static private final SubLString $str8$invalid_gt_mode___a = makeString("invalid gt mode: ~a");

    static private final SubLString $str9$illegal_value_of__gt_mode_ = makeString("illegal value of *gt-mode*");

    private static final SubLSymbol GT_MAP_LINKS = makeSymbol("GT-MAP-LINKS");

    private static final SubLSymbol GT_GATHER_EXTREMAL_NODE = makeSymbol("GT-GATHER-EXTREMAL-NODE");

    private static final SubLSymbol GT_TEST_LINK_NODE = makeSymbol("GT-TEST-LINK-NODE");

    static private final SubLString $str13$_a_is_not_a_function = makeString("~a is not a function");

    private static final SubLSymbol GT_GATHER_NODE = makeSymbol("GT-GATHER-NODE");

    private static final SubLInteger $int$128 = makeInteger(128);

    private static final SubLSymbol GT_COMPOSE_FN_LINK_NODE = makeSymbol("GT-COMPOSE-FN-LINK-NODE");

    private static final SubLSymbol GT_SELECT_LINK_NODE = makeSymbol("GT-SELECT-LINK-NODE");

    private static final SubLSymbol GT_MARK_AS_SEARCHED_AND_STEP = makeSymbol("GT-MARK-AS-SEARCHED-AND-STEP");

    private static final SubLSymbol GT_MARK_AS_UNSEARCHED_AND_STEP = makeSymbol("GT-MARK-AS-UNSEARCHED-AND-STEP");

    private static final SubLSymbol GT_GATHER_MARKED_LINK_NODE = makeSymbol("GT-GATHER-MARKED-LINK-NODE");

    private static final SubLSymbol GT_MARK_UNSELECT_LINK_NODE_ALL_ACCESSED_AS_UNSEARCHED = makeSymbol("GT-MARK-UNSELECT-LINK-NODE-ALL-ACCESSED-AS-UNSEARCHED");

    static private final SubLSymbol $sym23$GT_ALL_PREDECESSORS_SEARCHED_ = makeSymbol("GT-ALL-PREDECESSORS-SEARCHED?");

    private static final SubLSymbol GT_COMPOSE_PRED_LINK_NODE = makeSymbol("GT-COMPOSE-PRED-LINK-NODE");



    static private final SubLList $list27 = list($TRUE);

    private static final SubLSymbol GT_GATHER_ACCESS_JUST = makeSymbol("GT-GATHER-ACCESS-JUST");

    private static final SubLSymbol GT_GATHER_ACCESS_PATH = makeSymbol("GT-GATHER-ACCESS-PATH");







    private static final SubLSymbol GT_MARK_LINK_NODE_AS_UNSEARCHED_AND_COLLECT_MTS = makeSymbol("GT-MARK-LINK-NODE-AS-UNSEARCHED-AND-COLLECT-MTS");

    private static final SubLSymbol GT_GATHER_LINK_NODE_AND_MAX_MTS = makeSymbol("GT-GATHER-LINK-NODE-AND-MAX-MTS");

    private static final SubLSymbol GT_GATHER_LINK_NODE_AND_STORE_EDGES = makeSymbol("GT-GATHER-LINK-NODE-AND-STORE-EDGES");

    private static final SubLSymbol GT_MAP_LINKS_REBINDING_CANDIDATE_MTS = makeSymbol("GT-MAP-LINKS-REBINDING-CANDIDATE-MTS");

    private static final SubLSymbol GT_GATHER_LINK_NODES_AND_STORE_ALL_PATHS = makeSymbol("GT-GATHER-LINK-NODES-AND-STORE-ALL-PATHS");

    private static final SubLSymbol GT_GATHER_LINK_NODES_AND_UNIFY_MTS_ALONG_THE_WAY = makeSymbol("GT-GATHER-LINK-NODES-AND-UNIFY-MTS-ALONG-THE-WAY");

    static private final SubLString $str44$illegal_value_of__gt_link_type___ = makeString("illegal value of *gt-link-type*: ~s");

    private static final SubLString $str47$GT_recursion_limit_reached_ = makeString("GT recursion limit reached.");

    static private final SubLList $list50 = list(makeSymbol("*GT-PRED*"), makeSymbol("*GT-INDEX-ARG*"), makeSymbol("*GT-GATHER-ARG*"));

    static private final SubLString $str60$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $$$continue_anyway = makeString("continue anyway");

    static private final SubLString $str65$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");



    static private final SubLList $list67 = list(makeSymbol("LINK-NODE"), makeSymbol("LINK-MT"));

    private static final SubLString $str68$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str69$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str70$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLSymbol GT_MARK_AS_SEARCHED_BY_AND_STEP = makeSymbol("GT-MARK-AS-SEARCHED-BY-AND-STEP");

    // Definitions
    /**
     *
     *
     * @return integerp; iff *mapping-arg-swap* is t, the *gt-index-arg* is flipped. @see binary-arg-swap.
     */
    @LispMethod(comment = "@return integerp; iff *mapping-arg-swap* is t, the *gt-index-arg* is flipped. @see binary-arg-swap.")
    public static final SubLObject gt_search_index_arg_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) {
                return arity.binary_arg_swap(gt_vars.$gt_index_arg$.getDynamicValue(thread));
            } else {
                return gt_vars.$gt_index_arg$.getDynamicValue(thread);
            }
        }
    }

    // Definitions
    /**
     *
     *
     * @return integerp; iff *mapping-arg-swap* is t, the *gt-index-arg* is flipped. @see binary-arg-swap.
     */
    @LispMethod(comment = "@return integerp; iff *mapping-arg-swap* is t, the *gt-index-arg* is flipped. @see binary-arg-swap.")
    public static SubLObject gt_search_index_arg() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) {
            return arity.binary_arg_swap(gt_vars.$gt_index_arg$.getDynamicValue(thread));
        }
        return gt_vars.$gt_index_arg$.getDynamicValue(thread);
    }

    /**
     *
     *
     * @return integerp; iff *mapping-arg-swap* is t, the *gt-gather-arg* is flipped. @see binary-arg-swap.
     */
    @LispMethod(comment = "@return integerp; iff *mapping-arg-swap* is t, the *gt-gather-arg* is flipped. @see binary-arg-swap.")
    public static final SubLObject gt_search_gather_arg_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) {
                return arity.binary_arg_swap(gt_vars.$gt_gather_arg$.getDynamicValue(thread));
            } else {
                return gt_vars.$gt_gather_arg$.getDynamicValue(thread);
            }
        }
    }

    /**
     *
     *
     * @return integerp; iff *mapping-arg-swap* is t, the *gt-gather-arg* is flipped. @see binary-arg-swap.
     */
    @LispMethod(comment = "@return integerp; iff *mapping-arg-swap* is t, the *gt-gather-arg* is flipped. @see binary-arg-swap.")
    public static SubLObject gt_search_gather_arg() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) {
            return arity.binary_arg_swap(gt_vars.$gt_gather_arg$.getDynamicValue(thread));
        }
        return gt_vars.$gt_gather_arg$.getDynamicValue(thread);
    }

    public static final SubLObject gt_link_node_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = gt_vars.$gt_mode$.getDynamicValue(thread);
                if (pcase_var.eql($DIRECTED)) {
                    return assertions_high.gaf_arg(assertion, com.cyc.cycjava.cycl.gt_search.gt_search_gather_arg());
                } else {
                    if (pcase_var.eql($SUPERIOR)) {
                        return assertions_high.gaf_arg(assertion, com.cyc.cycjava.cycl.gt_search.gt_search_gather_arg());
                    } else {
                        if (pcase_var.eql($INFERIOR)) {
                            return assertions_high.gaf_arg(assertion, com.cyc.cycjava.cycl.gt_search.gt_search_index_arg());
                        } else {
                            if (pcase_var.eql($INVERSE)) {
                                return assertions_high.gaf_arg(assertion, com.cyc.cycjava.cycl.gt_search.gt_search_index_arg());
                            } else {
                                gt_utilities.gt_error(THREE_INTEGER, $str_alt4$illegal_value_of__gt_mode____s, gt_vars.$gt_mode$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_link_node(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = gt_vars.$gt_mode$.getDynamicValue(thread);
        if (pcase_var.eql($DIRECTED)) {
            return assertions_high.gaf_arg(assertion, gt_search_gather_arg());
        }
        if (pcase_var.eql($SUPERIOR)) {
            return assertions_high.gaf_arg(assertion, gt_search_gather_arg());
        }
        if (pcase_var.eql($INFERIOR)) {
            return assertions_high.gaf_arg(assertion, gt_search_index_arg());
        }
        if (pcase_var.eql($INVERSE)) {
            return assertions_high.gaf_arg(assertion, gt_search_index_arg());
        }
        gt_utilities.gt_error(THREE_INTEGER, $str4$illegal_value_of__gt_mode____s, gt_vars.$gt_mode$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    /**
     *
     *
     * @return 0 : the linked term
     * @return 1 : the link mt
     */
    @LispMethod(comment = "@return 0 : the linked term\r\n@return 1 : the link mt")
    public static final SubLObject gt_link_node_and_mt_alt(SubLObject assertion) {
        return values(com.cyc.cycjava.cycl.gt_search.gt_link_node(assertion), assertions_high.assertion_mt(assertion));
    }

    /**
     *
     *
     * @return 0 : the linked term
     * @return 1 : the link mt
     */
    @LispMethod(comment = "@return 0 : the linked term\r\n@return 1 : the link mt")
    public static SubLObject gt_link_node_and_mt(final SubLObject assertion) {
        return values(gt_link_node(assertion), assertions_high.assertion_mt(assertion));
    }

    public static final SubLObject gt_link_values_alt(SubLObject constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
                    try {
                        gt_vars.$gt_result$.bind(NIL, thread);
                        try {
                            SubLTrampolineFile.checkType(GT_GATHER_LINK_NODE, FUNCTION_SPEC_P);
                            {
                                SubLObject _prev_bind_0_1 = gt_vars.$gt_base_fn$.currentBinding(thread);
                                try {
                                    gt_vars.$gt_base_fn$.bind(GT_GATHER_LINK_NODE, thread);
                                    com.cyc.cycjava.cycl.gt_search.gt_map_links(constant, UNPROVIDED);
                                } finally {
                                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    clrhash(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_2, thread);
                                }
                            }
                        }
                        result = gt_vars.$gt_result$.getDynamicValue(thread);
                    } finally {
                        gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject gt_link_values(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
        try {
            gt_vars.$gt_result$.bind(NIL, thread);
            try {
                assert NIL != function_spec_p(GT_GATHER_LINK_NODE) : "! function_spec_p(gt_search.GT_GATHER_LINK_NODE) " + ("Types.function_spec_p(gt_search.$sym5$GT_GATHER_LINK_NODE) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym5$GT_GATHER_LINK_NODE) ") + GT_GATHER_LINK_NODE;
                final SubLObject _prev_bind_0_$1 = gt_vars.$gt_base_fn$.currentBinding(thread);
                try {
                    gt_vars.$gt_base_fn$.bind(GT_GATHER_LINK_NODE, thread);
                    gt_map_links(constant, UNPROVIDED);
                } finally {
                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$1, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    clrhash(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
            result = gt_vars.$gt_result$.getDynamicValue(thread);
        } finally {
            gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject gt_add_to_result_alt(SubLObject result_item) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cutoff_reached = NIL;
                if (NIL != gt_vars.$gt_answers_cutoffP$.getDynamicValue(thread)) {
                    if (gt_vars.$gt_answers_so_far$.getDynamicValue(thread).numGE(gt_vars.$gt_answers_cutoff$.getDynamicValue(thread))) {
                        mapping_finished();
                        cutoff_reached = T;
                    }
                }
                if (NIL == cutoff_reached) {
                    gt_vars.$gt_answers_so_far$.setDynamicValue(add(gt_vars.$gt_answers_so_far$.getDynamicValue(thread), ONE_INTEGER), thread);
                    gt_vars.$gt_result$.setDynamicValue(cons(result_item, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_add_to_result(final SubLObject result_item) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cutoff_reached = NIL;
        if ((NIL != gt_vars.$gt_answers_cutoffP$.getDynamicValue(thread)) && gt_vars.$gt_answers_so_far$.getDynamicValue(thread).numGE(gt_vars.$gt_answers_cutoff$.getDynamicValue(thread))) {
            mapping_finished();
            cutoff_reached = T;
        }
        if (NIL == cutoff_reached) {
            gt_vars.$gt_answers_so_far$.setDynamicValue(add(gt_vars.$gt_answers_so_far$.getDynamicValue(thread), ONE_INTEGER), thread);
            gt_vars.$gt_result$.setDynamicValue(cons(result_item, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
        }
        return NIL;
    }

    public static final SubLObject gt_gather_link_node_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != gt_utilities.gt_term_p(node)) {
                if (NIL == com.cyc.cycjava.cycl.gt_search.gt_searchedP(node)) {
                    com.cyc.cycjava.cycl.gt_search.gt_add_to_result(node);
                    com.cyc.cycjava.cycl.gt_search.gt_mark_as_searched(node);
                    gt_utilities.gt_step_fn_funcall(node);
                }
            } else {
                if (NIL != gt_vars.$gt_equality_fn$.getDynamicValue(thread)) {
                    {
                        SubLObject item_var = node;
                        if (NIL == member(item_var, gt_vars.$gt_result$.getDynamicValue(thread), gt_vars.$gt_equality_fn$.getDynamicValue(thread), symbol_function(IDENTITY))) {
                            gt_vars.$gt_result$.setDynamicValue(cons(item_var, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                        }
                    }
                } else {
                    gt_vars.$gt_result$.setDynamicValue(cons(node, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_gather_link_node(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != gt_utilities.gt_term_p(node)) {
            if (NIL == gt_searchedP(node)) {
                gt_add_to_result(node);
                gt_mark_as_searched(node);
                gt_utilities.gt_step_fn_funcall(node);
            }
        } else
            if (NIL != gt_vars.$gt_equality_fn$.getDynamicValue(thread)) {
                if (NIL == member(node, gt_vars.$gt_result$.getDynamicValue(thread), gt_vars.$gt_equality_fn$.getDynamicValue(thread), symbol_function(IDENTITY))) {
                    gt_vars.$gt_result$.setDynamicValue(cons(node, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                }
            } else {
                gt_vars.$gt_result$.setDynamicValue(cons(node, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
            }

        return NIL;
    }

    public static final SubLObject gt_gather_link_node_and_mt_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject node = com.cyc.cycjava.cycl.gt_search.gt_link_node(assertion);
                SubLObject mt = assertions_high.assertion_mt(assertion);
                if (NIL != gt_utilities.gt_term_p(node)) {
                    if (NIL != gt_vars.$gt_edge_list_returnP$.getDynamicValue(thread)) {
                        gt_vars.$gt_edge_list$.setDynamicValue(cons(list(assertions_high.gaf_arg1(assertion), assertions_high.gaf_arg2(assertion)), gt_vars.$gt_edge_list$.getDynamicValue(thread)), thread);
                    }
                    com.cyc.cycjava.cycl.gt_search.gt_add_to_result(cons(node, mt));
                } else {
                    if (NIL != gt_vars.$gt_equality_fn$.getDynamicValue(thread)) {
                        {
                            SubLObject item_var = cons(node, mt);
                            if (NIL == member(item_var, gt_vars.$gt_result$.getDynamicValue(thread), gt_vars.$gt_equality_fn$.getDynamicValue(thread), symbol_function(IDENTITY))) {
                                gt_vars.$gt_result$.setDynamicValue(cons(item_var, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                            }
                        }
                    } else {
                        gt_vars.$gt_result$.setDynamicValue(cons(cons(node, mt), gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_gather_link_node_and_mt(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject node = gt_link_node(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        if (NIL != gt_utilities.gt_term_p(node)) {
            if (NIL != gt_vars.$gt_edge_list_returnP$.getDynamicValue(thread)) {
                gt_vars.$gt_edge_list$.setDynamicValue(cons(list(assertions_high.gaf_arg1(assertion), assertions_high.gaf_arg2(assertion)), gt_vars.$gt_edge_list$.getDynamicValue(thread)), thread);
            }
            gt_add_to_result(cons(node, mt));
        } else
            if (NIL != gt_vars.$gt_equality_fn$.getDynamicValue(thread)) {
                final SubLObject item_var = cons(node, mt);
                if (NIL == member(item_var, gt_vars.$gt_result$.getDynamicValue(thread), gt_vars.$gt_equality_fn$.getDynamicValue(thread), symbol_function(IDENTITY))) {
                    gt_vars.$gt_result$.setDynamicValue(cons(item_var, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                }
            } else {
                gt_vars.$gt_result$.setDynamicValue(cons(cons(node, mt), gt_vars.$gt_result$.getDynamicValue(thread)), thread);
            }

        return NIL;
    }

    public static final SubLObject gt_siblings_alt(SubLObject constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
                    try {
                        gt_vars.$gt_result$.bind(NIL, thread);
                        try {
                            SubLTrampolineFile.checkType(GT_GATHER_SIBLING_NODE, FUNCTION_SPEC_P);
                            {
                                SubLObject _prev_bind_0_3 = gt_vars.$gt_base_fn$.currentBinding(thread);
                                try {
                                    gt_vars.$gt_base_fn$.bind(GT_GATHER_SIBLING_NODE, thread);
                                    com.cyc.cycjava.cycl.gt_search.gt_map_links(constant, UNPROVIDED);
                                } finally {
                                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_3, thread);
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    clrhash(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_4, thread);
                                }
                            }
                        }
                        result = gt_vars.$gt_result$.getDynamicValue(thread);
                    } finally {
                        gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject gt_siblings(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
        try {
            gt_vars.$gt_result$.bind(NIL, thread);
            try {
                assert NIL != function_spec_p(GT_GATHER_SIBLING_NODE) : "! function_spec_p(gt_search.GT_GATHER_SIBLING_NODE) " + ("Types.function_spec_p(gt_search.$sym7$GT_GATHER_SIBLING_NODE) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym7$GT_GATHER_SIBLING_NODE) ") + GT_GATHER_SIBLING_NODE;
                final SubLObject _prev_bind_0_$3 = gt_vars.$gt_base_fn$.currentBinding(thread);
                try {
                    gt_vars.$gt_base_fn$.bind(GT_GATHER_SIBLING_NODE, thread);
                    gt_map_links(constant, UNPROVIDED);
                } finally {
                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$3, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    clrhash(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
            result = gt_vars.$gt_result$.getDynamicValue(thread);
        } finally {
            gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject gt_gather_sibling_node_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != gt_utilities.gt_term_p(node)) {
                if (NIL == com.cyc.cycjava.cycl.gt_search.gt_searchedP(node)) {
                    com.cyc.cycjava.cycl.gt_search.gt_mark_as_searched(node);
                    {
                        SubLObject pcase_var = gt_vars.$gt_mode$.getDynamicValue(thread);
                        if (pcase_var.eql($SUPERIOR)) {
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (NIL == gt_utilities.gt_modeP($INFERIOR)) {
                                    Errors.error($str_alt8$invalid_gt_mode___a, $INFERIOR);
                                }
                            }
                            {
                                SubLObject _prev_bind_0 = gt_vars.$gt_mode$.currentBinding(thread);
                                try {
                                    gt_vars.$gt_mode$.bind($INFERIOR, thread);
                                    SubLTrampolineFile.checkType(GT_GATHER_LINK_NODE, FUNCTION_SPEC_P);
                                    {
                                        SubLObject _prev_bind_0_5 = gt_vars.$gt_base_fn$.currentBinding(thread);
                                        try {
                                            gt_vars.$gt_base_fn$.bind(GT_GATHER_LINK_NODE, thread);
                                            com.cyc.cycjava.cycl.gt_search.gt_map_links(node, UNPROVIDED);
                                        } finally {
                                            gt_vars.$gt_base_fn$.rebind(_prev_bind_0_5, thread);
                                        }
                                    }
                                } finally {
                                    gt_vars.$gt_mode$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } else {
                            if (pcase_var.eql($INFERIOR)) {
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == gt_utilities.gt_modeP($SUPERIOR)) {
                                        Errors.error($str_alt8$invalid_gt_mode___a, $SUPERIOR);
                                    }
                                }
                                {
                                    SubLObject _prev_bind_0 = gt_vars.$gt_mode$.currentBinding(thread);
                                    try {
                                        gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                                        SubLTrampolineFile.checkType(GT_GATHER_LINK_NODE, FUNCTION_SPEC_P);
                                        {
                                            SubLObject _prev_bind_0_6 = gt_vars.$gt_base_fn$.currentBinding(thread);
                                            try {
                                                gt_vars.$gt_base_fn$.bind(GT_GATHER_LINK_NODE, thread);
                                                com.cyc.cycjava.cycl.gt_search.gt_map_links(node, UNPROVIDED);
                                            } finally {
                                                gt_vars.$gt_base_fn$.rebind(_prev_bind_0_6, thread);
                                            }
                                        }
                                    } finally {
                                        gt_vars.$gt_mode$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            } else {
                                gt_utilities.gt_error(FIVE_INTEGER, $str_alt9$illegal_value_of__gt_mode_, gt_vars.$gt_mode$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_gather_sibling_node(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != gt_utilities.gt_term_p(node)) && (NIL == gt_searchedP(node))) {
            gt_mark_as_searched(node);
            final SubLObject pcase_var = gt_vars.$gt_mode$.getDynamicValue(thread);
            if (pcase_var.eql($SUPERIOR)) {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($INFERIOR))) {
                    Errors.error($str8$invalid_gt_mode___a, $INFERIOR);
                }
                final SubLObject _prev_bind_0 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind($INFERIOR, thread);
                    assert NIL != function_spec_p(GT_GATHER_LINK_NODE) : "! function_spec_p(gt_search.GT_GATHER_LINK_NODE) " + ("Types.function_spec_p(gt_search.$sym5$GT_GATHER_LINK_NODE) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym5$GT_GATHER_LINK_NODE) ") + GT_GATHER_LINK_NODE;
                    final SubLObject _prev_bind_0_$5 = gt_vars.$gt_base_fn$.currentBinding(thread);
                    try {
                        gt_vars.$gt_base_fn$.bind(GT_GATHER_LINK_NODE, thread);
                        gt_map_links(node, UNPROVIDED);
                    } finally {
                        gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$5, thread);
                    }
                } finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0, thread);
                }
            } else
                if (pcase_var.eql($INFERIOR)) {
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($SUPERIOR))) {
                        Errors.error($str8$invalid_gt_mode___a, $SUPERIOR);
                    }
                    final SubLObject _prev_bind_0 = gt_vars.$gt_mode$.currentBinding(thread);
                    try {
                        gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                        assert NIL != function_spec_p(GT_GATHER_LINK_NODE) : "! function_spec_p(gt_search.GT_GATHER_LINK_NODE) " + ("Types.function_spec_p(gt_search.$sym5$GT_GATHER_LINK_NODE) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym5$GT_GATHER_LINK_NODE) ") + GT_GATHER_LINK_NODE;
                        final SubLObject _prev_bind_0_$6 = gt_vars.$gt_base_fn$.currentBinding(thread);
                        try {
                            gt_vars.$gt_base_fn$.bind(GT_GATHER_LINK_NODE, thread);
                            gt_map_links(node, UNPROVIDED);
                        } finally {
                            gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$6, thread);
                        }
                    } finally {
                        gt_vars.$gt_mode$.rebind(_prev_bind_0, thread);
                    }
                } else {
                    gt_utilities.gt_error(FIVE_INTEGER, $str9$illegal_value_of__gt_mode_, gt_vars.$gt_mode$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }

        }
        return NIL;
    }

    public static final SubLObject gt_all_accessed_alt(SubLObject constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
                    try {
                        gt_vars.$gt_result$.bind(NIL, thread);
                        if (true) {
                            SubLTrampolineFile.checkType(GT_MAP_LINKS, FUNCTION_SPEC_P);
                        }
                        {
                            SubLObject _prev_bind_0_7 = gt_vars.$gt_step_fn$.currentBinding(thread);
                            try {
                                gt_vars.$gt_step_fn$.bind(GT_MAP_LINKS, thread);
                                if (NIL != gt_utilities.gt_reflexiveP()) {
                                    com.cyc.cycjava.cycl.gt_search.gt_add_to_result(constant);
                                }
                                SubLTrampolineFile.checkType(GT_GATHER_LINK_NODE, FUNCTION_SPEC_P);
                                {
                                    SubLObject _prev_bind_0_8 = gt_vars.$gt_base_fn$.currentBinding(thread);
                                    try {
                                        gt_vars.$gt_base_fn$.bind(GT_GATHER_LINK_NODE, thread);
                                        com.cyc.cycjava.cycl.gt_search.gt_map_links(constant, UNPROVIDED);
                                    } finally {
                                        gt_vars.$gt_base_fn$.rebind(_prev_bind_0_8, thread);
                                    }
                                }
                            } finally {
                                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_7, thread);
                            }
                        }
                        result = gt_vars.$gt_result$.getDynamicValue(thread);
                    } finally {
                        gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject gt_all_accessed(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
        try {
            gt_vars.$gt_result$.bind(NIL, thread);
            assert NIL != function_spec_p(GT_MAP_LINKS) : "! function_spec_p(gt_search.GT_MAP_LINKS) " + ("Types.function_spec_p(gt_search.$sym10$GT_MAP_LINKS) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym10$GT_MAP_LINKS) ") + GT_MAP_LINKS;
            final SubLObject _prev_bind_0_$7 = gt_vars.$gt_step_fn$.currentBinding(thread);
            try {
                gt_vars.$gt_step_fn$.bind(GT_MAP_LINKS, thread);
                if (NIL != gt_utilities.gt_reflexiveP()) {
                    gt_add_to_result(constant);
                }
                assert NIL != function_spec_p(GT_GATHER_LINK_NODE) : "! function_spec_p(gt_search.GT_GATHER_LINK_NODE) " + ("Types.function_spec_p(gt_search.$sym5$GT_GATHER_LINK_NODE) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym5$GT_GATHER_LINK_NODE) ") + GT_GATHER_LINK_NODE;
                final SubLObject _prev_bind_0_$8 = gt_vars.$gt_base_fn$.currentBinding(thread);
                try {
                    gt_vars.$gt_base_fn$.bind(GT_GATHER_LINK_NODE, thread);
                    gt_map_links(constant, UNPROVIDED);
                } finally {
                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$8, thread);
                }
            } finally {
                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$7, thread);
            }
            result = gt_vars.$gt_result$.getDynamicValue(thread);
        } finally {
            gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject tts_all_accessed_alt(SubLObject constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
                    try {
                        gt_vars.$gt_result$.bind(NIL, thread);
                        {
                            SubLObject direct = NIL;
                            SubLTrampolineFile.checkType(GT_GATHER_LINK_NODE, FUNCTION_SPEC_P);
                            {
                                SubLObject _prev_bind_0_9 = gt_vars.$gt_base_fn$.currentBinding(thread);
                                try {
                                    gt_vars.$gt_base_fn$.bind(GT_GATHER_LINK_NODE, thread);
                                    try {
                                        {
                                            SubLObject _prev_bind_0_10 = gt_vars.$gt_index_arg$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = gt_vars.$gt_pred$.currentBinding(thread);
                                            SubLObject _prev_bind_3 = gt_vars.$gt_truth$.currentBinding(thread);
                                            SubLObject _prev_bind_4 = gt_vars.$gt_result$.currentBinding(thread);
                                            try {
                                                gt_vars.$gt_index_arg$.bind(gt_vars.$tt_index_arg$.getDynamicValue(thread), thread);
                                                gt_vars.$gt_gather_arg$.bind(gt_vars.$tt_gather_arg$.getDynamicValue(thread), thread);
                                                gt_vars.$gt_pred$.bind(gt_vars.$tt_pred$.getDynamicValue(thread), thread);
                                                gt_vars.$gt_truth$.bind(gt_vars.$tt_truth$.getDynamicValue(thread), thread);
                                                gt_vars.$gt_result$.bind(NIL, thread);
                                                com.cyc.cycjava.cycl.gt_search.gt_map_links(constant, UNPROVIDED);
                                                direct = gt_vars.$gt_result$.getDynamicValue(thread);
                                            } finally {
                                                gt_vars.$gt_result$.rebind(_prev_bind_4, thread);
                                                gt_vars.$gt_truth$.rebind(_prev_bind_3, thread);
                                                gt_vars.$gt_pred$.rebind(_prev_bind_2, thread);
                                                gt_vars.$gt_gather_arg$.rebind(_prev_bind_1, thread);
                                                gt_vars.$gt_index_arg$.rebind(_prev_bind_0_10, thread);
                                            }
                                        }
                                        if (NIL != (NIL != gt_vars.$tt_transitive_conduitP$.getDynamicValue(thread) ? ((SubLObject) (GT_MAP_LINKS)) : NIL)) {
                                            SubLTrampolineFile.checkType(NIL != gt_vars.$tt_transitive_conduitP$.getDynamicValue(thread) ? ((SubLObject) (GT_MAP_LINKS)) : NIL, FUNCTION_SPEC_P);
                                        }
                                        {
                                            SubLObject _prev_bind_0_11 = gt_vars.$gt_step_fn$.currentBinding(thread);
                                            try {
                                                gt_vars.$gt_step_fn$.bind(NIL != gt_vars.$tt_transitive_conduitP$.getDynamicValue(thread) ? ((SubLObject) (GT_MAP_LINKS)) : NIL, thread);
                                                {
                                                    SubLObject cdolist_list_var = direct;
                                                    SubLObject node = NIL;
                                                    for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node = cdolist_list_var.first()) {
                                                        if (NIL != gt_utilities.gt_term_p(node)) {
                                                            com.cyc.cycjava.cycl.gt_search.gt_map_links(node, UNPROVIDED);
                                                        }
                                                    }
                                                }
                                            } finally {
                                                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_11, thread);
                                            }
                                        }
                                        gt_vars.$gt_result$.setDynamicValue(nconc(direct, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                clrhash(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_12, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_9, thread);
                                }
                            }
                            if (NIL != kb_accessors.reflexive_predicateP(gt_vars.$tt_pred$.getDynamicValue(thread))) {
                                gt_vars.$gt_result$.setDynamicValue(cons(constant, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                            }
                            result = gt_vars.$gt_result$.getDynamicValue(thread);
                        }
                    } finally {
                        gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject tts_all_accessed(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
        try {
            gt_vars.$gt_result$.bind(NIL, thread);
            SubLObject direct = NIL;
            assert NIL != function_spec_p(GT_GATHER_LINK_NODE) : "! function_spec_p(gt_search.GT_GATHER_LINK_NODE) " + ("Types.function_spec_p(gt_search.$sym5$GT_GATHER_LINK_NODE) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym5$GT_GATHER_LINK_NODE) ") + GT_GATHER_LINK_NODE;
            final SubLObject _prev_bind_0_$9 = gt_vars.$gt_base_fn$.currentBinding(thread);
            try {
                gt_vars.$gt_base_fn$.bind(GT_GATHER_LINK_NODE, thread);
                try {
                    final SubLObject _prev_bind_0_$10 = gt_vars.$gt_index_arg$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = gt_vars.$gt_pred$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = gt_vars.$gt_truth$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = gt_vars.$gt_result$.currentBinding(thread);
                    try {
                        gt_vars.$gt_index_arg$.bind(gt_vars.$tt_index_arg$.getDynamicValue(thread), thread);
                        gt_vars.$gt_gather_arg$.bind(gt_vars.$tt_gather_arg$.getDynamicValue(thread), thread);
                        gt_vars.$gt_pred$.bind(gt_vars.$tt_pred$.getDynamicValue(thread), thread);
                        gt_vars.$gt_truth$.bind(gt_vars.$tt_truth$.getDynamicValue(thread), thread);
                        gt_vars.$gt_result$.bind(NIL, thread);
                        gt_map_links(constant, UNPROVIDED);
                        direct = gt_vars.$gt_result$.getDynamicValue(thread);
                    } finally {
                        gt_vars.$gt_result$.rebind(_prev_bind_5, thread);
                        gt_vars.$gt_truth$.rebind(_prev_bind_4, thread);
                        gt_vars.$gt_pred$.rebind(_prev_bind_3, thread);
                        gt_vars.$gt_gather_arg$.rebind(_prev_bind_2, thread);
                        gt_vars.$gt_index_arg$.rebind(_prev_bind_0_$10, thread);
                    }
                    if (((NIL != (NIL != gt_vars.$tt_transitive_conduitP$.getDynamicValue(thread) ? GT_MAP_LINKS : NIL)) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == function_spec_p(NIL != gt_vars.$tt_transitive_conduitP$.getDynamicValue(thread) ? GT_MAP_LINKS : NIL))) {
                        throw new AssertionError(NIL != gt_vars.$tt_transitive_conduitP$.getDynamicValue(thread) ? GT_MAP_LINKS : NIL);
                    }
                    final SubLObject _prev_bind_0_$11 = gt_vars.$gt_step_fn$.currentBinding(thread);
                    try {
                        gt_vars.$gt_step_fn$.bind(NIL != gt_vars.$tt_transitive_conduitP$.getDynamicValue(thread) ? GT_MAP_LINKS : NIL, thread);
                        SubLObject cdolist_list_var = direct;
                        SubLObject node = NIL;
                        node = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (NIL != gt_utilities.gt_term_p(node)) {
                                gt_map_links(node, UNPROVIDED);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            node = cdolist_list_var.first();
                        } 
                    } finally {
                        gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$11, thread);
                    }
                    gt_vars.$gt_result$.setDynamicValue(nconc(direct, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                } finally {
                    final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        clrhash(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                    }
                }
            } finally {
                gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$9, thread);
            }
            if (NIL != kb_accessors.reflexive_predicateP(gt_vars.$tt_pred$.getDynamicValue(thread))) {
                gt_vars.$gt_result$.setDynamicValue(cons(constant, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
            }
            result = gt_vars.$gt_result$.getDynamicValue(thread);
        } finally {
            gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject gt_extremal_accessed_alt(SubLObject constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
                    try {
                        gt_vars.$gt_result$.bind(NIL, thread);
                        if (true) {
                            SubLTrampolineFile.checkType(GT_MAP_LINKS, FUNCTION_SPEC_P);
                        }
                        {
                            SubLObject _prev_bind_0_13 = gt_vars.$gt_step_fn$.currentBinding(thread);
                            try {
                                gt_vars.$gt_step_fn$.bind(GT_MAP_LINKS, thread);
                                try {
                                    SubLTrampolineFile.checkType(GT_GATHER_EXTREMAL_NODE, FUNCTION_SPEC_P);
                                    {
                                        SubLObject _prev_bind_0_14 = gt_vars.$gt_base_fn$.currentBinding(thread);
                                        try {
                                            gt_vars.$gt_base_fn$.bind(GT_GATHER_EXTREMAL_NODE, thread);
                                            com.cyc.cycjava.cycl.gt_search.gt_map_links(constant, UNPROVIDED);
                                        } finally {
                                            gt_vars.$gt_base_fn$.rebind(_prev_bind_0_14, thread);
                                        }
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            clrhash(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_15, thread);
                                        }
                                    }
                                }
                            } finally {
                                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_13, thread);
                            }
                        }
                        if (NIL != gt_vars.$gt_result$.getDynamicValue(thread)) {
                            result = gt_vars.$gt_result$.getDynamicValue(thread);
                        } else {
                            if (NIL != gt_utilities.gt_reflexiveP()) {
                                result = cons(constant, result);
                            }
                        }
                    } finally {
                        gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject gt_extremal_accessed(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
        try {
            gt_vars.$gt_result$.bind(NIL, thread);
            assert NIL != function_spec_p(GT_MAP_LINKS) : "! function_spec_p(gt_search.GT_MAP_LINKS) " + ("Types.function_spec_p(gt_search.$sym10$GT_MAP_LINKS) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym10$GT_MAP_LINKS) ") + GT_MAP_LINKS;
            final SubLObject _prev_bind_0_$13 = gt_vars.$gt_step_fn$.currentBinding(thread);
            try {
                gt_vars.$gt_step_fn$.bind(GT_MAP_LINKS, thread);
                try {
                    assert NIL != function_spec_p(GT_GATHER_EXTREMAL_NODE) : "! function_spec_p(gt_search.GT_GATHER_EXTREMAL_NODE) " + ("Types.function_spec_p(gt_search.$sym11$GT_GATHER_EXTREMAL_NODE) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym11$GT_GATHER_EXTREMAL_NODE) ") + GT_GATHER_EXTREMAL_NODE;
                    final SubLObject _prev_bind_0_$14 = gt_vars.$gt_base_fn$.currentBinding(thread);
                    try {
                        gt_vars.$gt_base_fn$.bind(GT_GATHER_EXTREMAL_NODE, thread);
                        gt_map_links(constant, UNPROVIDED);
                    } finally {
                        gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$14, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        clrhash(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                    }
                }
            } finally {
                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$13, thread);
            }
            if (NIL != gt_vars.$gt_result$.getDynamicValue(thread)) {
                result = gt_vars.$gt_result$.getDynamicValue(thread);
            } else
                if (NIL != gt_utilities.gt_reflexiveP()) {
                    result = cons(constant, result);
                }

        } finally {
            gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject gt_gather_extremal_node_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject extremals = NIL;
                SubLObject gt_searchedP = NIL;
                if (NIL != gt_utilities.gt_term_p(node)) {
                    if (NIL != com.cyc.cycjava.cycl.gt_search.gt_searchedP(node)) {
                        gt_vars.$gt_searchedP$.setDynamicValue(T, thread);
                    } else {
                        com.cyc.cycjava.cycl.gt_search.gt_mark_as_searched(node);
                        {
                            SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
                            SubLObject _prev_bind_1 = gt_vars.$gt_searchedP$.currentBinding(thread);
                            try {
                                gt_vars.$gt_result$.bind(NIL, thread);
                                gt_vars.$gt_searchedP$.bind(NIL, thread);
                                gt_utilities.gt_step_fn_funcall(node);
                                gt_searchedP = makeBoolean((NIL != gt_searchedP) || (NIL != gt_vars.$gt_searchedP$.getDynamicValue(thread)));
                                extremals = gt_vars.$gt_result$.getDynamicValue(thread);
                            } finally {
                                gt_vars.$gt_searchedP$.rebind(_prev_bind_1, thread);
                                gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
                            }
                        }
                        if (NIL != extremals) {
                            gt_vars.$gt_result$.setDynamicValue(nconc(extremals, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                        } else {
                            if (NIL != gt_searchedP) {
                                gt_vars.$gt_searchedP$.setDynamicValue(gt_searchedP, thread);
                            } else {
                                com.cyc.cycjava.cycl.gt_search.gt_add_to_result(node);
                            }
                        }
                    }
                }
            }
            return gt_vars.$gt_result$.getDynamicValue(thread);
        }
    }

    public static SubLObject gt_gather_extremal_node(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject extremals = NIL;
        SubLObject gt_searchedP = NIL;
        if (NIL != gt_utilities.gt_term_p(node)) {
            if (NIL != gt_searchedP(node)) {
                gt_vars.$gt_searchedP$.setDynamicValue(T, thread);
            } else {
                gt_mark_as_searched(node);
                final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
                final SubLObject _prev_bind_2 = gt_vars.$gt_searchedP$.currentBinding(thread);
                try {
                    gt_vars.$gt_result$.bind(NIL, thread);
                    gt_vars.$gt_searchedP$.bind(NIL, thread);
                    gt_utilities.gt_step_fn_funcall(node);
                    gt_searchedP = makeBoolean((NIL != gt_searchedP) || (NIL != gt_vars.$gt_searchedP$.getDynamicValue(thread)));
                    extremals = gt_vars.$gt_result$.getDynamicValue(thread);
                } finally {
                    gt_vars.$gt_searchedP$.rebind(_prev_bind_2, thread);
                    gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
                }
                if (NIL != extremals) {
                    gt_vars.$gt_result$.setDynamicValue(nconc(extremals, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                } else
                    if (NIL != gt_searchedP) {
                        gt_vars.$gt_searchedP$.setDynamicValue(gt_searchedP, thread);
                    } else {
                        gt_add_to_result(node);
                    }

            }
        }
        return gt_vars.$gt_result$.getDynamicValue(thread);
    }

    public static final SubLObject gt_accessesP_alt(SubLObject constant, SubLObject target, SubLObject compare_fn) {
        if (compare_fn == UNPROVIDED) {
            compare_fn = EQ;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != sksi_infrastructure_utilities.sksi_external_term_p(constant)) || (NIL != sksi_infrastructure_utilities.sksi_external_term_p(target))) {
                compare_fn = EQUAL;
            }
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
                    SubLObject _prev_bind_1 = gt_vars.$gt_doneP$.currentBinding(thread);
                    try {
                        gt_vars.$gt_result$.bind(NIL, thread);
                        gt_vars.$gt_doneP$.bind(NIL, thread);
                        {
                            SubLObject _prev_bind_0_16 = gt_vars.$gt_target$.currentBinding(thread);
                            try {
                                gt_vars.$gt_target$.bind(target, thread);
                                SubLTrampolineFile.checkType(compare_fn, FUNCTION_SPEC_P);
                                {
                                    SubLObject _prev_bind_0_17 = gt_vars.$gt_compare_fn$.currentBinding(thread);
                                    try {
                                        gt_vars.$gt_compare_fn$.bind(compare_fn, thread);
                                        if (true) {
                                            SubLTrampolineFile.checkType(GT_MAP_LINKS, FUNCTION_SPEC_P);
                                        }
                                        {
                                            SubLObject _prev_bind_0_18 = gt_vars.$gt_step_fn$.currentBinding(thread);
                                            try {
                                                gt_vars.$gt_step_fn$.bind(GT_MAP_LINKS, thread);
                                                try {
                                                    SubLTrampolineFile.checkType(GT_TEST_LINK_NODE, FUNCTION_SPEC_P);
                                                    {
                                                        SubLObject _prev_bind_0_19 = gt_vars.$gt_base_fn$.currentBinding(thread);
                                                        try {
                                                            gt_vars.$gt_base_fn$.bind(GT_TEST_LINK_NODE, thread);
                                                            com.cyc.cycjava.cycl.gt_search.gt_map_links(constant, UNPROVIDED);
                                                        } finally {
                                                            gt_vars.$gt_base_fn$.rebind(_prev_bind_0_19, thread);
                                                        }
                                                    }
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            clrhash(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_20, thread);
                                                        }
                                                    }
                                                }
                                            } finally {
                                                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_18, thread);
                                            }
                                        }
                                    } finally {
                                        gt_vars.$gt_compare_fn$.rebind(_prev_bind_0_17, thread);
                                    }
                                }
                            } finally {
                                gt_vars.$gt_target$.rebind(_prev_bind_0_16, thread);
                            }
                        }
                        result = gt_vars.$gt_result$.getDynamicValue(thread);
                    } finally {
                        gt_vars.$gt_doneP$.rebind(_prev_bind_1, thread);
                        gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject gt_accessesP(final SubLObject constant, final SubLObject target, SubLObject compare_fn) {
        if (compare_fn == UNPROVIDED) {
            compare_fn = EQL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sksi_infrastructure_utilities.sksi_external_term_p(constant)) || (NIL != sksi_infrastructure_utilities.sksi_external_term_p(target))) {
            compare_fn = EQUAL;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_doneP$.currentBinding(thread);
        try {
            gt_vars.$gt_result$.bind(NIL, thread);
            gt_vars.$gt_doneP$.bind(NIL, thread);
            final SubLObject _prev_bind_0_$16 = gt_vars.$gt_target$.currentBinding(thread);
            try {
                gt_vars.$gt_target$.bind(target, thread);
                assert NIL != function_spec_p(compare_fn) : "! function_spec_p(compare_fn) " + ("Types.function_spec_p(compare_fn) " + "CommonSymbols.NIL != Types.function_spec_p(compare_fn) ") + compare_fn;
                final SubLObject _prev_bind_0_$17 = gt_vars.$gt_compare_fn$.currentBinding(thread);
                try {
                    gt_vars.$gt_compare_fn$.bind(compare_fn, thread);
                    assert NIL != function_spec_p(GT_MAP_LINKS) : "! function_spec_p(gt_search.GT_MAP_LINKS) " + ("Types.function_spec_p(gt_search.$sym10$GT_MAP_LINKS) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym10$GT_MAP_LINKS) ") + GT_MAP_LINKS;
                    final SubLObject _prev_bind_0_$18 = gt_vars.$gt_step_fn$.currentBinding(thread);
                    try {
                        gt_vars.$gt_step_fn$.bind(GT_MAP_LINKS, thread);
                        try {
                            assert NIL != function_spec_p(GT_TEST_LINK_NODE) : "! function_spec_p(gt_search.GT_TEST_LINK_NODE) " + ("Types.function_spec_p(gt_search.$sym12$GT_TEST_LINK_NODE) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym12$GT_TEST_LINK_NODE) ") + GT_TEST_LINK_NODE;
                            final SubLObject _prev_bind_0_$19 = gt_vars.$gt_base_fn$.currentBinding(thread);
                            try {
                                gt_vars.$gt_base_fn$.bind(GT_TEST_LINK_NODE, thread);
                                gt_map_links(constant, UNPROVIDED);
                            } finally {
                                gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$19, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                clrhash(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                            }
                        }
                    } finally {
                        gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$18, thread);
                    }
                } finally {
                    gt_vars.$gt_compare_fn$.rebind(_prev_bind_0_$17, thread);
                }
            } finally {
                gt_vars.$gt_target$.rebind(_prev_bind_0_$16, thread);
            }
            result = gt_vars.$gt_result$.getDynamicValue(thread);
        } finally {
            gt_vars.$gt_doneP$.rebind(_prev_bind_2, thread);
            gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject gt_test_link_node_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != gt_utilities.gt_compare_fn_funcall(node, gt_vars.$gt_target$.getDynamicValue(thread))) {
                com.cyc.cycjava.cycl.gt_search.gt_finished(T);
            } else {
                if (NIL != gt_utilities.gt_term_p(node)) {
                    if (NIL == com.cyc.cycjava.cycl.gt_search.gt_searchedP(node)) {
                        com.cyc.cycjava.cycl.gt_search.gt_mark_as_searched(node);
                        gt_utilities.gt_step_fn_funcall(node);
                    }
                }
            }
            return gt_vars.$gt_result$.getDynamicValue(thread);
        }
    }

    public static SubLObject gt_test_link_node(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != gt_utilities.gt_compare_fn_funcall(node, gt_vars.$gt_target$.getDynamicValue(thread))) {
            gt_finished(T);
        } else
            if ((NIL != gt_utilities.gt_term_p(node)) && (NIL == gt_searchedP(node))) {
                gt_mark_as_searched(node);
                gt_utilities.gt_step_fn_funcall(node);
            }

        return gt_vars.$gt_result$.getDynamicValue(thread);
    }

    public static final SubLObject gt_gather_alt(SubLObject v_term, SubLObject gather_fn) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
                    SubLObject _prev_bind_1 = gt_vars.$gt_doneP$.currentBinding(thread);
                    try {
                        gt_vars.$gt_result$.bind(NIL, thread);
                        gt_vars.$gt_doneP$.bind(NIL, thread);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!gather_fn.isFunctionSpec()) {
                                Errors.error($str_alt13$_a_is_not_a_function, gather_fn);
                            }
                        }
                        {
                            SubLObject _prev_bind_0_21 = gt_vars.$gt_gather_fn$.currentBinding(thread);
                            try {
                                gt_vars.$gt_gather_fn$.bind(gather_fn, thread);
                                if (true) {
                                    SubLTrampolineFile.checkType(GT_MAP_LINKS, FUNCTION_SPEC_P);
                                }
                                {
                                    SubLObject _prev_bind_0_22 = gt_vars.$gt_step_fn$.currentBinding(thread);
                                    try {
                                        gt_vars.$gt_step_fn$.bind(GT_MAP_LINKS, thread);
                                        try {
                                            SubLTrampolineFile.checkType(GT_GATHER_NODE, FUNCTION_SPEC_P);
                                            {
                                                SubLObject _prev_bind_0_23 = gt_vars.$gt_base_fn$.currentBinding(thread);
                                                try {
                                                    gt_vars.$gt_base_fn$.bind(GT_GATHER_NODE, thread);
                                                    com.cyc.cycjava.cycl.gt_search.gt_map_links(v_term, UNPROVIDED);
                                                } finally {
                                                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_23, thread);
                                                }
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    clrhash(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_24, thread);
                                                }
                                            }
                                        }
                                    } finally {
                                        gt_vars.$gt_step_fn$.rebind(_prev_bind_0_22, thread);
                                    }
                                }
                            } finally {
                                gt_vars.$gt_gather_fn$.rebind(_prev_bind_0_21, thread);
                            }
                        }
                        result = gt_vars.$gt_result$.getDynamicValue(thread);
                    } finally {
                        gt_vars.$gt_doneP$.rebind(_prev_bind_1, thread);
                        gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject gt_gather(final SubLObject v_term, final SubLObject gather_fn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_doneP$.currentBinding(thread);
        try {
            gt_vars.$gt_result$.bind(NIL, thread);
            gt_vars.$gt_doneP$.bind(NIL, thread);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!gather_fn.isFunctionSpec())) {
                Errors.error($str13$_a_is_not_a_function, gather_fn);
            }
            final SubLObject _prev_bind_0_$21 = gt_vars.$gt_gather_fn$.currentBinding(thread);
            try {
                gt_vars.$gt_gather_fn$.bind(gather_fn, thread);
                assert NIL != function_spec_p(GT_MAP_LINKS) : "! function_spec_p(gt_search.GT_MAP_LINKS) " + ("Types.function_spec_p(gt_search.$sym10$GT_MAP_LINKS) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym10$GT_MAP_LINKS) ") + GT_MAP_LINKS;
                final SubLObject _prev_bind_0_$22 = gt_vars.$gt_step_fn$.currentBinding(thread);
                try {
                    gt_vars.$gt_step_fn$.bind(GT_MAP_LINKS, thread);
                    try {
                        assert NIL != function_spec_p(GT_GATHER_NODE) : "! function_spec_p(gt_search.GT_GATHER_NODE) " + ("Types.function_spec_p(gt_search.$sym14$GT_GATHER_NODE) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym14$GT_GATHER_NODE) ") + GT_GATHER_NODE;
                        final SubLObject _prev_bind_0_$23 = gt_vars.$gt_base_fn$.currentBinding(thread);
                        try {
                            gt_vars.$gt_base_fn$.bind(GT_GATHER_NODE, thread);
                            gt_map_links(v_term, UNPROVIDED);
                        } finally {
                            gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$23, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            clrhash(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                        }
                    }
                } finally {
                    gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$22, thread);
                }
            } finally {
                gt_vars.$gt_gather_fn$.rebind(_prev_bind_0_$21, thread);
            }
            result = gt_vars.$gt_result$.getDynamicValue(thread);
        } finally {
            gt_vars.$gt_doneP$.rebind(_prev_bind_2, thread);
            gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject gt_gather_node_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject gatheredP = funcall(gt_vars.$gt_gather_fn$.getDynamicValue(thread), node);
                if (NIL != gatheredP) {
                    com.cyc.cycjava.cycl.gt_search.gt_finished(gatheredP);
                } else {
                    if (NIL != gt_utilities.gt_term_p(node)) {
                        if (NIL == com.cyc.cycjava.cycl.gt_search.gt_searchedP(node)) {
                            com.cyc.cycjava.cycl.gt_search.gt_mark_as_searched(node);
                            gt_utilities.gt_step_fn_funcall(node);
                        }
                    }
                }
            }
            return gt_vars.$gt_result$.getDynamicValue(thread);
        }
    }

    public static SubLObject gt_gather_node(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject gatheredP = funcall(gt_vars.$gt_gather_fn$.getDynamicValue(thread), node);
        if (NIL != gatheredP) {
            gt_finished(gatheredP);
        } else
            if ((NIL != gt_utilities.gt_term_p(node)) && (NIL == gt_searchedP(node))) {
                gt_mark_as_searched(node);
                gt_utilities.gt_step_fn_funcall(node);
            }

        return gt_vars.$gt_result$.getDynamicValue(thread);
    }

    /**
     * the nodes accessible to every node in <nodes>
     * (when <candidates> is non-nil, the result must subset it)
     */
    @LispMethod(comment = "the nodes accessible to every node in <nodes>\r\n(when <candidates> is non-nil, the result must subset it)\nthe nodes accessible to every node in <nodes>\n(when <candidates> is non-nil, the result must subset it)")
    public static final SubLObject gt_common_horizon_alt(SubLObject nodes, SubLObject candidates, SubLObject mt) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject horizon = NIL;
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
                            SubLObject accessed_nodes = NIL;
                            {
                                SubLObject _prev_bind_0_25 = gt_vars.$gt_target_marking_table$.currentBinding(thread);
                                SubLObject _prev_bind_1_26 = gt_vars.$gt_marking_table$.currentBinding(thread);
                                try {
                                    gt_vars.$gt_target_marking_table$.bind(gt_vars.$gt_marking_table$.getDynamicValue(thread), thread);
                                    gt_vars.$gt_marking_table$.bind(NIL, thread);
                                    gt_vars.$gt_marking_table$.setDynamicValue(make_hash_table($int$128, UNPROVIDED, UNPROVIDED), thread);
                                    accessed_nodes = com.cyc.cycjava.cycl.gt_search.gt_all_accessed(nodes.first());
                                } finally {
                                    gt_vars.$gt_marking_table$.rebind(_prev_bind_1_26, thread);
                                    gt_vars.$gt_target_marking_table$.rebind(_prev_bind_0_25, thread);
                                }
                            }
                            {
                                SubLObject cdolist_list_var = nodes;
                                SubLObject node = NIL;
                                for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node = cdolist_list_var.first()) {
                                    com.cyc.cycjava.cycl.gt_search.gt_mark_all_accessed_as_searched_by(node, node);
                                }
                            }
                            {
                                SubLObject cdolist_list_var = accessed_nodes;
                                SubLObject accessed_node = NIL;
                                for (accessed_node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , accessed_node = cdolist_list_var.first()) {
                                    if (NIL == com.cyc.cycjava.cycl.gt_search.gt_searched_by_allP(accessed_node, nodes, UNPROVIDED)) {
                                    } else {
                                        if (NIL == candidates) {
                                            horizon = cons(accessed_node, horizon);
                                        } else {
                                            if (NIL != subl_promotions.memberP(accessed_node, candidates, UNPROVIDED, UNPROVIDED)) {
                                                horizon = cons(accessed_node, horizon);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return horizon;
            }
        }
    }

    /**
     * the nodes accessible to every node in <nodes>
     * (when <candidates> is non-nil, the result must subset it)
     */
    @LispMethod(comment = "the nodes accessible to every node in <nodes>\r\n(when <candidates> is non-nil, the result must subset it)\nthe nodes accessible to every node in <nodes>\n(when <candidates> is non-nil, the result must subset it)")
    public static SubLObject gt_common_horizon(final SubLObject nodes, SubLObject candidates, SubLObject mt) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject horizon = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject accessed_nodes = NIL;
            final SubLObject _prev_bind_0_$25 = gt_vars.$gt_target_marking_table$.currentBinding(thread);
            final SubLObject _prev_bind_1_$26 = gt_vars.$gt_marking_table$.currentBinding(thread);
            try {
                gt_vars.$gt_target_marking_table$.bind(gt_vars.$gt_marking_table$.getDynamicValue(thread), thread);
                gt_vars.$gt_marking_table$.bind(NIL, thread);
                gt_vars.$gt_marking_table$.setDynamicValue(make_hash_table($int$128, UNPROVIDED, UNPROVIDED), thread);
                accessed_nodes = gt_all_accessed(nodes.first());
            } finally {
                gt_vars.$gt_marking_table$.rebind(_prev_bind_1_$26, thread);
                gt_vars.$gt_target_marking_table$.rebind(_prev_bind_0_$25, thread);
            }
            SubLObject cdolist_list_var = nodes;
            SubLObject node = NIL;
            node = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                gt_mark_all_accessed_as_searched_by(node, node);
                cdolist_list_var = cdolist_list_var.rest();
                node = cdolist_list_var.first();
            } 
            cdolist_list_var = accessed_nodes;
            SubLObject accessed_node = NIL;
            accessed_node = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != gt_searched_by_allP(accessed_node, nodes, UNPROVIDED)) {
                    if (NIL == candidates) {
                        horizon = cons(accessed_node, horizon);
                    } else
                        if (NIL != subl_promotions.memberP(accessed_node, candidates, UNPROVIDED, UNPROVIDED)) {
                            horizon = cons(accessed_node, horizon);
                        }

                }
                cdolist_list_var = cdolist_list_var.rest();
                accessed_node = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return horizon;
    }

    public static final SubLObject gt_compose_fn_all_accessed_alt(SubLObject constant, SubLObject compose_fn, SubLObject combine_fn) {
        if (combine_fn == UNPROVIDED) {
            combine_fn = gt_vars.$gt_combine_fn$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
                    try {
                        gt_vars.$gt_result$.bind(NIL, thread);
                        if (true) {
                            SubLTrampolineFile.checkType(GT_MAP_LINKS, FUNCTION_SPEC_P);
                        }
                        {
                            SubLObject _prev_bind_0_27 = gt_vars.$gt_step_fn$.currentBinding(thread);
                            try {
                                gt_vars.$gt_step_fn$.bind(GT_MAP_LINKS, thread);
                                if (NIL != gt_utilities.gt_reflexiveP()) {
                                    {
                                        SubLObject cutoff_reached = NIL;
                                        if (NIL != gt_vars.$gt_answers_cutoffP$.getDynamicValue(thread)) {
                                            if (gt_vars.$gt_answers_so_far$.getDynamicValue(thread).numGE(gt_vars.$gt_answers_cutoff$.getDynamicValue(thread))) {
                                                mapping_finished();
                                                cutoff_reached = T;
                                            }
                                        }
                                        if (NIL == cutoff_reached) {
                                            gt_vars.$gt_answers_so_far$.setDynamicValue(add(gt_vars.$gt_answers_so_far$.getDynamicValue(thread), ONE_INTEGER), thread);
                                            gt_vars.$gt_result$.setDynamicValue(funcall(combine_fn, funcall(compose_fn, constant), gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                                        }
                                    }
                                }
                                SubLTrampolineFile.checkType(GT_COMPOSE_FN_LINK_NODE, FUNCTION_SPEC_P);
                                {
                                    SubLObject _prev_bind_0_28 = gt_vars.$gt_base_fn$.currentBinding(thread);
                                    try {
                                        gt_vars.$gt_base_fn$.bind(GT_COMPOSE_FN_LINK_NODE, thread);
                                        SubLTrampolineFile.checkType(combine_fn, FUNCTION_SPEC_P);
                                        {
                                            SubLObject _prev_bind_0_29 = gt_vars.$gt_combine_fn$.currentBinding(thread);
                                            try {
                                                gt_vars.$gt_combine_fn$.bind(combine_fn, thread);
                                                SubLTrampolineFile.checkType(compose_fn, FUNCTION_SPEC_P);
                                                {
                                                    SubLObject _prev_bind_0_30 = gt_vars.$gt_compose_fn$.currentBinding(thread);
                                                    try {
                                                        gt_vars.$gt_compose_fn$.bind(compose_fn, thread);
                                                        com.cyc.cycjava.cycl.gt_search.gt_map_links(constant, UNPROVIDED);
                                                    } finally {
                                                        gt_vars.$gt_compose_fn$.rebind(_prev_bind_0_30, thread);
                                                    }
                                                }
                                            } finally {
                                                gt_vars.$gt_combine_fn$.rebind(_prev_bind_0_29, thread);
                                            }
                                        }
                                    } finally {
                                        gt_vars.$gt_base_fn$.rebind(_prev_bind_0_28, thread);
                                    }
                                }
                            } finally {
                                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_27, thread);
                            }
                        }
                        result = gt_vars.$gt_result$.getDynamicValue(thread);
                    } finally {
                        gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject gt_compose_fn_all_accessed(final SubLObject constant, final SubLObject compose_fn, SubLObject combine_fn) {
        if (combine_fn == UNPROVIDED) {
            combine_fn = gt_vars.$gt_combine_fn$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
        try {
            gt_vars.$gt_result$.bind(NIL, thread);
            assert NIL != function_spec_p(GT_MAP_LINKS) : "! function_spec_p(gt_search.GT_MAP_LINKS) " + ("Types.function_spec_p(gt_search.$sym10$GT_MAP_LINKS) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym10$GT_MAP_LINKS) ") + GT_MAP_LINKS;
            final SubLObject _prev_bind_0_$27 = gt_vars.$gt_step_fn$.currentBinding(thread);
            try {
                gt_vars.$gt_step_fn$.bind(GT_MAP_LINKS, thread);
                if (NIL != gt_utilities.gt_reflexiveP()) {
                    SubLObject cutoff_reached = NIL;
                    if ((NIL != gt_vars.$gt_answers_cutoffP$.getDynamicValue(thread)) && gt_vars.$gt_answers_so_far$.getDynamicValue(thread).numGE(gt_vars.$gt_answers_cutoff$.getDynamicValue(thread))) {
                        mapping_finished();
                        cutoff_reached = T;
                    }
                    if (NIL == cutoff_reached) {
                        gt_vars.$gt_answers_so_far$.setDynamicValue(add(gt_vars.$gt_answers_so_far$.getDynamicValue(thread), ONE_INTEGER), thread);
                        gt_vars.$gt_result$.setDynamicValue(funcall(combine_fn, funcall(compose_fn, constant), gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                    }
                }
                assert NIL != function_spec_p(GT_COMPOSE_FN_LINK_NODE) : "! function_spec_p(gt_search.GT_COMPOSE_FN_LINK_NODE) " + ("Types.function_spec_p(gt_search.$sym16$GT_COMPOSE_FN_LINK_NODE) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym16$GT_COMPOSE_FN_LINK_NODE) ") + GT_COMPOSE_FN_LINK_NODE;
                final SubLObject _prev_bind_0_$28 = gt_vars.$gt_base_fn$.currentBinding(thread);
                try {
                    gt_vars.$gt_base_fn$.bind(GT_COMPOSE_FN_LINK_NODE, thread);
                    assert NIL != function_spec_p(combine_fn) : "! function_spec_p(combine_fn) " + ("Types.function_spec_p(combine_fn) " + "CommonSymbols.NIL != Types.function_spec_p(combine_fn) ") + combine_fn;
                    final SubLObject _prev_bind_0_$29 = gt_vars.$gt_combine_fn$.currentBinding(thread);
                    try {
                        gt_vars.$gt_combine_fn$.bind(combine_fn, thread);
                        assert NIL != function_spec_p(compose_fn) : "! function_spec_p(compose_fn) " + ("Types.function_spec_p(compose_fn) " + "CommonSymbols.NIL != Types.function_spec_p(compose_fn) ") + compose_fn;
                        final SubLObject _prev_bind_0_$30 = gt_vars.$gt_compose_fn$.currentBinding(thread);
                        try {
                            gt_vars.$gt_compose_fn$.bind(compose_fn, thread);
                            gt_map_links(constant, UNPROVIDED);
                        } finally {
                            gt_vars.$gt_compose_fn$.rebind(_prev_bind_0_$30, thread);
                        }
                    } finally {
                        gt_vars.$gt_combine_fn$.rebind(_prev_bind_0_$29, thread);
                    }
                } finally {
                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$28, thread);
                }
            } finally {
                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$27, thread);
            }
            result = gt_vars.$gt_result$.getDynamicValue(thread);
        } finally {
            gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject gt_compose_fn_link_node_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != gt_utilities.gt_term_p(node)) {
                {
                    SubLObject cutoff_reached = NIL;
                    if (NIL != gt_vars.$gt_answers_cutoffP$.getDynamicValue(thread)) {
                        if (gt_vars.$gt_answers_so_far$.getDynamicValue(thread).numGE(gt_vars.$gt_answers_cutoff$.getDynamicValue(thread))) {
                            mapping_finished();
                            cutoff_reached = T;
                        }
                    }
                    if (NIL == cutoff_reached) {
                        gt_vars.$gt_answers_so_far$.setDynamicValue(add(gt_vars.$gt_answers_so_far$.getDynamicValue(thread), ONE_INTEGER), thread);
                        if (NIL == com.cyc.cycjava.cycl.gt_search.gt_searchedP(node)) {
                            com.cyc.cycjava.cycl.gt_search.gt_mark_as_searched(node);
                            gt_utilities.gt_step_fn_funcall(node);
                            gt_vars.$gt_result$.setDynamicValue(funcall(gt_vars.$gt_combine_fn$.getDynamicValue(thread), funcall(gt_vars.$gt_compose_fn$.getDynamicValue(thread), node), gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_compose_fn_link_node(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != gt_utilities.gt_term_p(node)) {
            SubLObject cutoff_reached = NIL;
            if ((NIL != gt_vars.$gt_answers_cutoffP$.getDynamicValue(thread)) && gt_vars.$gt_answers_so_far$.getDynamicValue(thread).numGE(gt_vars.$gt_answers_cutoff$.getDynamicValue(thread))) {
                mapping_finished();
                cutoff_reached = T;
            }
            if (NIL == cutoff_reached) {
                gt_vars.$gt_answers_so_far$.setDynamicValue(add(gt_vars.$gt_answers_so_far$.getDynamicValue(thread), ONE_INTEGER), thread);
                if (NIL == gt_searchedP(node)) {
                    gt_mark_as_searched(node);
                    gt_utilities.gt_step_fn_funcall(node);
                    gt_vars.$gt_result$.setDynamicValue(funcall(gt_vars.$gt_combine_fn$.getDynamicValue(thread), funcall(gt_vars.$gt_compose_fn$.getDynamicValue(thread), node), gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject gt_select_all_accessed_alt(SubLObject constant, SubLObject select_fn, SubLObject combine_fn) {
        if (combine_fn == UNPROVIDED) {
            combine_fn = CONS;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
                    try {
                        gt_vars.$gt_result$.bind(NIL, thread);
                        if (true) {
                            SubLTrampolineFile.checkType(GT_MAP_LINKS, FUNCTION_SPEC_P);
                        }
                        {
                            SubLObject _prev_bind_0_31 = gt_vars.$gt_step_fn$.currentBinding(thread);
                            try {
                                gt_vars.$gt_step_fn$.bind(GT_MAP_LINKS, thread);
                                try {
                                    SubLTrampolineFile.checkType(GT_SELECT_LINK_NODE, FUNCTION_SPEC_P);
                                    {
                                        SubLObject _prev_bind_0_32 = gt_vars.$gt_base_fn$.currentBinding(thread);
                                        try {
                                            gt_vars.$gt_base_fn$.bind(GT_SELECT_LINK_NODE, thread);
                                            SubLTrampolineFile.checkType(combine_fn, FUNCTION_SPEC_P);
                                            {
                                                SubLObject _prev_bind_0_33 = gt_vars.$gt_combine_fn$.currentBinding(thread);
                                                try {
                                                    gt_vars.$gt_combine_fn$.bind(combine_fn, thread);
                                                    SubLTrampolineFile.checkType(select_fn, FUNCTION_SPEC_P);
                                                    {
                                                        SubLObject _prev_bind_0_34 = gt_vars.$gt_compose_fn$.currentBinding(thread);
                                                        try {
                                                            gt_vars.$gt_compose_fn$.bind(select_fn, thread);
                                                            com.cyc.cycjava.cycl.gt_search.gt_map_links(constant, UNPROVIDED);
                                                        } finally {
                                                            gt_vars.$gt_compose_fn$.rebind(_prev_bind_0_34, thread);
                                                        }
                                                    }
                                                } finally {
                                                    gt_vars.$gt_combine_fn$.rebind(_prev_bind_0_33, thread);
                                                }
                                            }
                                        } finally {
                                            gt_vars.$gt_base_fn$.rebind(_prev_bind_0_32, thread);
                                        }
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_35 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            clrhash(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_35, thread);
                                        }
                                    }
                                }
                            } finally {
                                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_31, thread);
                            }
                        }
                        if ((NIL != gt_utilities.gt_reflexiveP()) && (NIL != funcall(select_fn, constant))) {
                            gt_vars.$gt_result$.setDynamicValue(funcall(combine_fn, constant, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                        }
                        result = gt_vars.$gt_result$.getDynamicValue(thread);
                    } finally {
                        gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject gt_select_all_accessed(final SubLObject constant, final SubLObject select_fn, SubLObject combine_fn) {
        if (combine_fn == UNPROVIDED) {
            combine_fn = CONS;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
        try {
            gt_vars.$gt_result$.bind(NIL, thread);
            assert NIL != function_spec_p(GT_MAP_LINKS) : "! function_spec_p(gt_search.GT_MAP_LINKS) " + ("Types.function_spec_p(gt_search.$sym10$GT_MAP_LINKS) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym10$GT_MAP_LINKS) ") + GT_MAP_LINKS;
            final SubLObject _prev_bind_0_$31 = gt_vars.$gt_step_fn$.currentBinding(thread);
            try {
                gt_vars.$gt_step_fn$.bind(GT_MAP_LINKS, thread);
                try {
                    assert NIL != function_spec_p(GT_SELECT_LINK_NODE) : "! function_spec_p(gt_search.GT_SELECT_LINK_NODE) " + ("Types.function_spec_p(gt_search.$sym18$GT_SELECT_LINK_NODE) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym18$GT_SELECT_LINK_NODE) ") + GT_SELECT_LINK_NODE;
                    final SubLObject _prev_bind_0_$32 = gt_vars.$gt_base_fn$.currentBinding(thread);
                    try {
                        gt_vars.$gt_base_fn$.bind(GT_SELECT_LINK_NODE, thread);
                        assert NIL != function_spec_p(combine_fn) : "! function_spec_p(combine_fn) " + ("Types.function_spec_p(combine_fn) " + "CommonSymbols.NIL != Types.function_spec_p(combine_fn) ") + combine_fn;
                        final SubLObject _prev_bind_0_$33 = gt_vars.$gt_combine_fn$.currentBinding(thread);
                        try {
                            gt_vars.$gt_combine_fn$.bind(combine_fn, thread);
                            assert NIL != function_spec_p(select_fn) : "! function_spec_p(select_fn) " + ("Types.function_spec_p(select_fn) " + "CommonSymbols.NIL != Types.function_spec_p(select_fn) ") + select_fn;
                            final SubLObject _prev_bind_0_$34 = gt_vars.$gt_compose_fn$.currentBinding(thread);
                            try {
                                gt_vars.$gt_compose_fn$.bind(select_fn, thread);
                                gt_map_links(constant, UNPROVIDED);
                            } finally {
                                gt_vars.$gt_compose_fn$.rebind(_prev_bind_0_$34, thread);
                            }
                        } finally {
                            gt_vars.$gt_combine_fn$.rebind(_prev_bind_0_$33, thread);
                        }
                    } finally {
                        gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$32, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$35 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        clrhash(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
                    }
                }
            } finally {
                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$31, thread);
            }
            if ((NIL != gt_utilities.gt_reflexiveP()) && (NIL != funcall(select_fn, constant))) {
                gt_vars.$gt_result$.setDynamicValue(funcall(combine_fn, constant, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
            }
            result = gt_vars.$gt_result$.getDynamicValue(thread);
        } finally {
            gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject gt_select_link_node_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != gt_utilities.gt_term_p(node)) {
                if (NIL == com.cyc.cycjava.cycl.gt_search.gt_searchedP(node)) {
                    com.cyc.cycjava.cycl.gt_search.gt_mark_as_searched(node);
                    gt_utilities.gt_step_fn_funcall(node);
                    if (NIL != funcall(gt_vars.$gt_compose_fn$.getDynamicValue(thread), node)) {
                        gt_vars.$gt_result$.setDynamicValue(funcall(gt_vars.$gt_combine_fn$.getDynamicValue(thread), node, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_select_link_node(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != gt_utilities.gt_term_p(node)) && (NIL == gt_searchedP(node))) {
            gt_mark_as_searched(node);
            gt_utilities.gt_step_fn_funcall(node);
            if (NIL != funcall(gt_vars.$gt_compose_fn$.getDynamicValue(thread), node)) {
                gt_vars.$gt_result$.setDynamicValue(funcall(gt_vars.$gt_combine_fn$.getDynamicValue(thread), node, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
            }
        }
        return NIL;
    }

    public static final SubLObject gt_all_dependent_accessed_alt(SubLObject constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject reflexiveP = gt_utilities.gt_reflexiveP();
                {
                    SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
                    try {
                        gt_vars.$gt_result$.bind(NIL, thread);
                        if (true) {
                            SubLTrampolineFile.checkType(GT_MAP_LINKS, FUNCTION_SPEC_P);
                        }
                        {
                            SubLObject _prev_bind_0_36 = gt_vars.$gt_step_fn$.currentBinding(thread);
                            try {
                                gt_vars.$gt_step_fn$.bind(GT_MAP_LINKS, thread);
                                try {
                                    com.cyc.cycjava.cycl.gt_search.gt_mark_as_searched(constant);
                                    SubLTrampolineFile.checkType(GT_MARK_AS_SEARCHED_AND_STEP, FUNCTION_SPEC_P);
                                    {
                                        SubLObject _prev_bind_0_37 = gt_vars.$gt_base_fn$.currentBinding(thread);
                                        try {
                                            gt_vars.$gt_base_fn$.bind(GT_MARK_AS_SEARCHED_AND_STEP, thread);
                                            com.cyc.cycjava.cycl.gt_search.gt_map_links(constant, UNPROVIDED);
                                        } finally {
                                            gt_vars.$gt_base_fn$.rebind(_prev_bind_0_37, thread);
                                        }
                                    }
                                    com.cyc.cycjava.cycl.gt_search.gt_mark_unselect_all_accessed_as_unsearched(constant);
                                    com.cyc.cycjava.cycl.gt_search.gt_gather_marked_accessed(constant);
                                    if ((NIL != reflexiveP) && (NIL != gt_utilities.gt_all_predecessors_searchedP(constant))) {
                                        gt_vars.$gt_result$.setDynamicValue(cons(constant, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_38 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            com.cyc.cycjava.cycl.gt_search.gt_mark_as_unsearched(constant);
                                            SubLTrampolineFile.checkType(GT_MARK_AS_UNSEARCHED_AND_STEP, FUNCTION_SPEC_P);
                                            {
                                                SubLObject _prev_bind_0_39 = gt_vars.$gt_base_fn$.currentBinding(thread);
                                                try {
                                                    gt_vars.$gt_base_fn$.bind(GT_MARK_AS_UNSEARCHED_AND_STEP, thread);
                                                    com.cyc.cycjava.cycl.gt_search.gt_map_links(constant, UNPROVIDED);
                                                } finally {
                                                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_39, thread);
                                                }
                                            }
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_38, thread);
                                        }
                                    }
                                }
                            } finally {
                                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_36, thread);
                            }
                        }
                        result = gt_vars.$gt_result$.getDynamicValue(thread);
                    } finally {
                        gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject gt_all_dependent_accessed(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject reflexiveP = gt_utilities.gt_reflexiveP();
        final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
        try {
            gt_vars.$gt_result$.bind(NIL, thread);
            assert NIL != function_spec_p(GT_MAP_LINKS) : "! function_spec_p(gt_search.GT_MAP_LINKS) " + ("Types.function_spec_p(gt_search.$sym10$GT_MAP_LINKS) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym10$GT_MAP_LINKS) ") + GT_MAP_LINKS;
            final SubLObject _prev_bind_0_$36 = gt_vars.$gt_step_fn$.currentBinding(thread);
            try {
                gt_vars.$gt_step_fn$.bind(GT_MAP_LINKS, thread);
                try {
                    gt_mark_as_searched(constant);
                    assert NIL != function_spec_p(GT_MARK_AS_SEARCHED_AND_STEP) : "! function_spec_p(gt_search.GT_MARK_AS_SEARCHED_AND_STEP) " + ("Types.function_spec_p(gt_search.$sym19$GT_MARK_AS_SEARCHED_AND_STEP) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym19$GT_MARK_AS_SEARCHED_AND_STEP) ") + GT_MARK_AS_SEARCHED_AND_STEP;
                    final SubLObject _prev_bind_0_$37 = gt_vars.$gt_base_fn$.currentBinding(thread);
                    try {
                        gt_vars.$gt_base_fn$.bind(GT_MARK_AS_SEARCHED_AND_STEP, thread);
                        gt_map_links(constant, UNPROVIDED);
                    } finally {
                        gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$37, thread);
                    }
                    gt_mark_unselect_all_accessed_as_unsearched(constant);
                    gt_gather_marked_accessed(constant);
                    if ((NIL != reflexiveP) && (NIL != gt_utilities.gt_all_predecessors_searchedP(constant))) {
                        gt_vars.$gt_result$.setDynamicValue(cons(constant, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$38 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        gt_mark_as_unsearched(constant);
                        assert NIL != function_spec_p(GT_MARK_AS_UNSEARCHED_AND_STEP) : "! function_spec_p(gt_search.GT_MARK_AS_UNSEARCHED_AND_STEP) " + ("Types.function_spec_p(gt_search.$sym20$GT_MARK_AS_UNSEARCHED_AND_STEP) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym20$GT_MARK_AS_UNSEARCHED_AND_STEP) ") + GT_MARK_AS_UNSEARCHED_AND_STEP;
                        final SubLObject _prev_bind_0_$39 = gt_vars.$gt_base_fn$.currentBinding(thread);
                        try {
                            gt_vars.$gt_base_fn$.bind(GT_MARK_AS_UNSEARCHED_AND_STEP, thread);
                            gt_map_links(constant, UNPROVIDED);
                        } finally {
                            gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$39, thread);
                        }
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$38, thread);
                    }
                }
            } finally {
                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$36, thread);
            }
            result = gt_vars.$gt_result$.getDynamicValue(thread);
        } finally {
            gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject gt_gather_marked_accessed_alt(SubLObject constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = gt_vars.$gt_target_marking_table$.currentBinding(thread);
                SubLObject _prev_bind_1 = gt_vars.$gt_marking_table$.currentBinding(thread);
                try {
                    gt_vars.$gt_target_marking_table$.bind(gt_vars.$gt_marking_table$.getDynamicValue(thread), thread);
                    gt_vars.$gt_marking_table$.bind(NIL, thread);
                    gt_vars.$gt_marking_table$.setDynamicValue(make_hash_table($int$128, UNPROVIDED, UNPROVIDED), thread);
                    try {
                        SubLTrampolineFile.checkType(GT_GATHER_MARKED_LINK_NODE, FUNCTION_SPEC_P);
                        {
                            SubLObject _prev_bind_0_40 = gt_vars.$gt_base_fn$.currentBinding(thread);
                            try {
                                gt_vars.$gt_base_fn$.bind(GT_GATHER_MARKED_LINK_NODE, thread);
                                SubLTrampolineFile.checkType(CONS, FUNCTION_SPEC_P);
                                {
                                    SubLObject _prev_bind_0_41 = gt_vars.$gt_combine_fn$.currentBinding(thread);
                                    try {
                                        gt_vars.$gt_combine_fn$.bind(CONS, thread);
                                        com.cyc.cycjava.cycl.gt_search.gt_map_links(constant, UNPROVIDED);
                                    } finally {
                                        gt_vars.$gt_combine_fn$.rebind(_prev_bind_0_41, thread);
                                    }
                                }
                            } finally {
                                gt_vars.$gt_base_fn$.rebind(_prev_bind_0_40, thread);
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0_42 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                SubLTrampolineFile.checkType(GT_MARK_AS_UNSEARCHED_AND_STEP, FUNCTION_SPEC_P);
                                {
                                    SubLObject _prev_bind_0_43 = gt_vars.$gt_base_fn$.currentBinding(thread);
                                    try {
                                        gt_vars.$gt_base_fn$.bind(GT_MARK_AS_UNSEARCHED_AND_STEP, thread);
                                        com.cyc.cycjava.cycl.gt_search.gt_map_links(constant, UNPROVIDED);
                                    } finally {
                                        gt_vars.$gt_base_fn$.rebind(_prev_bind_0_43, thread);
                                    }
                                }
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_42, thread);
                            }
                        }
                    }
                } finally {
                    gt_vars.$gt_marking_table$.rebind(_prev_bind_1, thread);
                    gt_vars.$gt_target_marking_table$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_gather_marked_accessed(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = gt_vars.$gt_target_marking_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_marking_table$.currentBinding(thread);
        try {
            gt_vars.$gt_target_marking_table$.bind(gt_vars.$gt_marking_table$.getDynamicValue(thread), thread);
            gt_vars.$gt_marking_table$.bind(NIL, thread);
            gt_vars.$gt_marking_table$.setDynamicValue(make_hash_table($int$128, UNPROVIDED, UNPROVIDED), thread);
            try {
                assert NIL != function_spec_p(GT_GATHER_MARKED_LINK_NODE) : "! function_spec_p(gt_search.GT_GATHER_MARKED_LINK_NODE) " + ("Types.function_spec_p(gt_search.$sym21$GT_GATHER_MARKED_LINK_NODE) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym21$GT_GATHER_MARKED_LINK_NODE) ") + GT_GATHER_MARKED_LINK_NODE;
                final SubLObject _prev_bind_0_$40 = gt_vars.$gt_base_fn$.currentBinding(thread);
                try {
                    gt_vars.$gt_base_fn$.bind(GT_GATHER_MARKED_LINK_NODE, thread);
                    assert NIL != function_spec_p(CONS) : "! function_spec_p( .CONS) " + ("Types.function_spec_p(gt_search.$sym17$CONS) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym17$CONS) ") + CONS;
                    final SubLObject _prev_bind_0_$41 = gt_vars.$gt_combine_fn$.currentBinding(thread);
                    try {
                        gt_vars.$gt_combine_fn$.bind(CONS, thread);
                        gt_map_links(constant, UNPROVIDED);
                    } finally {
                        gt_vars.$gt_combine_fn$.rebind(_prev_bind_0_$41, thread);
                    }
                } finally {
                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$40, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$42 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    assert NIL != function_spec_p(GT_MARK_AS_UNSEARCHED_AND_STEP) : "! function_spec_p(gt_search.GT_MARK_AS_UNSEARCHED_AND_STEP) " + ("Types.function_spec_p(gt_search.$sym20$GT_MARK_AS_UNSEARCHED_AND_STEP) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym20$GT_MARK_AS_UNSEARCHED_AND_STEP) ") + GT_MARK_AS_UNSEARCHED_AND_STEP;
                    final SubLObject _prev_bind_0_$43 = gt_vars.$gt_base_fn$.currentBinding(thread);
                    try {
                        gt_vars.$gt_base_fn$.bind(GT_MARK_AS_UNSEARCHED_AND_STEP, thread);
                        gt_map_links(constant, UNPROVIDED);
                    } finally {
                        gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$43, thread);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$42, thread);
                }
            }
        } finally {
            gt_vars.$gt_marking_table$.rebind(_prev_bind_2, thread);
            gt_vars.$gt_target_marking_table$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject gt_gather_marked_link_node_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != gt_utilities.gt_term_p(node)) {
                if (NIL == com.cyc.cycjava.cycl.gt_search.gt_searchedP(node)) {
                    com.cyc.cycjava.cycl.gt_search.gt_mark_as_searched(node);
                    if (NIL != com.cyc.cycjava.cycl.gt_search.gt_searched_in_target_spaceP(node, UNPROVIDED)) {
                        gt_utilities.gt_step_fn_funcall(node);
                        gt_vars.$gt_result$.setDynamicValue(funcall(gt_vars.$gt_combine_fn$.getDynamicValue(thread), node, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                        com.cyc.cycjava.cycl.gt_search.gt_mark_as_unsearched_in_space(node, gt_vars.$gt_target_marking_table$.getDynamicValue(thread));
                    }
                }
            }
            return gt_vars.$gt_result$.getDynamicValue(thread);
        }
    }

    public static SubLObject gt_gather_marked_link_node(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != gt_utilities.gt_term_p(node)) && (NIL == gt_searchedP(node))) {
            gt_mark_as_searched(node);
            if (NIL != gt_searched_in_target_spaceP(node, UNPROVIDED)) {
                gt_utilities.gt_step_fn_funcall(node);
                gt_vars.$gt_result$.setDynamicValue(funcall(gt_vars.$gt_combine_fn$.getDynamicValue(thread), node, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                gt_mark_as_unsearched_in_space(node, gt_vars.$gt_target_marking_table$.getDynamicValue(thread));
            }
        }
        return gt_vars.$gt_result$.getDynamicValue(thread);
    }

    public static final SubLObject gt_mark_unselect_all_accessed_as_unsearched_alt(SubLObject constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = gt_vars.$gt_target_marking_table$.currentBinding(thread);
                SubLObject _prev_bind_1 = gt_vars.$gt_marking_table$.currentBinding(thread);
                try {
                    gt_vars.$gt_target_marking_table$.bind(gt_vars.$gt_marking_table$.getDynamicValue(thread), thread);
                    gt_vars.$gt_marking_table$.bind(NIL, thread);
                    gt_vars.$gt_marking_table$.setDynamicValue(make_hash_table($int$128, UNPROVIDED, UNPROVIDED), thread);
                    try {
                        SubLTrampolineFile.checkType(GT_MARK_UNSELECT_LINK_NODE_ALL_ACCESSED_AS_UNSEARCHED, FUNCTION_SPEC_P);
                        {
                            SubLObject _prev_bind_0_44 = gt_vars.$gt_base_fn$.currentBinding(thread);
                            try {
                                gt_vars.$gt_base_fn$.bind(GT_MARK_UNSELECT_LINK_NODE_ALL_ACCESSED_AS_UNSEARCHED, thread);
                                SubLTrampolineFile.checkType($sym23$GT_ALL_PREDECESSORS_SEARCHED_, FUNCTION_SPEC_P);
                                {
                                    SubLObject _prev_bind_0_45 = gt_vars.$gt_compose_fn$.currentBinding(thread);
                                    try {
                                        gt_vars.$gt_compose_fn$.bind($sym23$GT_ALL_PREDECESSORS_SEARCHED_, thread);
                                        com.cyc.cycjava.cycl.gt_search.gt_map_links(constant, UNPROVIDED);
                                    } finally {
                                        gt_vars.$gt_compose_fn$.rebind(_prev_bind_0_45, thread);
                                    }
                                }
                            } finally {
                                gt_vars.$gt_base_fn$.rebind(_prev_bind_0_44, thread);
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0_46 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                SubLTrampolineFile.checkType(GT_MARK_AS_UNSEARCHED_AND_STEP, FUNCTION_SPEC_P);
                                {
                                    SubLObject _prev_bind_0_47 = gt_vars.$gt_base_fn$.currentBinding(thread);
                                    try {
                                        gt_vars.$gt_base_fn$.bind(GT_MARK_AS_UNSEARCHED_AND_STEP, thread);
                                        com.cyc.cycjava.cycl.gt_search.gt_map_links(constant, UNPROVIDED);
                                    } finally {
                                        gt_vars.$gt_base_fn$.rebind(_prev_bind_0_47, thread);
                                    }
                                }
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_46, thread);
                            }
                        }
                    }
                } finally {
                    gt_vars.$gt_marking_table$.rebind(_prev_bind_1, thread);
                    gt_vars.$gt_target_marking_table$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_mark_unselect_all_accessed_as_unsearched(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = gt_vars.$gt_target_marking_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_marking_table$.currentBinding(thread);
        try {
            gt_vars.$gt_target_marking_table$.bind(gt_vars.$gt_marking_table$.getDynamicValue(thread), thread);
            gt_vars.$gt_marking_table$.bind(NIL, thread);
            gt_vars.$gt_marking_table$.setDynamicValue(make_hash_table($int$128, UNPROVIDED, UNPROVIDED), thread);
            try {
                assert NIL != function_spec_p(GT_MARK_UNSELECT_LINK_NODE_ALL_ACCESSED_AS_UNSEARCHED) : "! function_spec_p(gt_search.GT_MARK_UNSELECT_LINK_NODE_ALL_ACCESSED_AS_UNSEARCHED) " + ("Types.function_spec_p(gt_search.$sym22$GT_MARK_UNSELECT_LINK_NODE_ALL_ACCESSED_AS_UNSEARCHED) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym22$GT_MARK_UNSELECT_LINK_NODE_ALL_ACCESSED_AS_UNSEARCHED) ") + GT_MARK_UNSELECT_LINK_NODE_ALL_ACCESSED_AS_UNSEARCHED;
                final SubLObject _prev_bind_0_$44 = gt_vars.$gt_base_fn$.currentBinding(thread);
                try {
                    gt_vars.$gt_base_fn$.bind(GT_MARK_UNSELECT_LINK_NODE_ALL_ACCESSED_AS_UNSEARCHED, thread);
                    assert NIL != function_spec_p($sym23$GT_ALL_PREDECESSORS_SEARCHED_) : "! function_spec_p(gt_search.$sym23$GT_ALL_PREDECESSORS_SEARCHED_) " + ("Types.function_spec_p(gt_search.$sym23$GT_ALL_PREDECESSORS_SEARCHED_) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym23$GT_ALL_PREDECESSORS_SEARCHED_) ") + $sym23$GT_ALL_PREDECESSORS_SEARCHED_;
                    final SubLObject _prev_bind_0_$45 = gt_vars.$gt_compose_fn$.currentBinding(thread);
                    try {
                        gt_vars.$gt_compose_fn$.bind($sym23$GT_ALL_PREDECESSORS_SEARCHED_, thread);
                        gt_map_links(constant, UNPROVIDED);
                    } finally {
                        gt_vars.$gt_compose_fn$.rebind(_prev_bind_0_$45, thread);
                    }
                } finally {
                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$44, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$46 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    assert NIL != function_spec_p(GT_MARK_AS_UNSEARCHED_AND_STEP) : "! function_spec_p(gt_search.GT_MARK_AS_UNSEARCHED_AND_STEP) " + ("Types.function_spec_p(gt_search.$sym20$GT_MARK_AS_UNSEARCHED_AND_STEP) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym20$GT_MARK_AS_UNSEARCHED_AND_STEP) ") + GT_MARK_AS_UNSEARCHED_AND_STEP;
                    final SubLObject _prev_bind_0_$47 = gt_vars.$gt_base_fn$.currentBinding(thread);
                    try {
                        gt_vars.$gt_base_fn$.bind(GT_MARK_AS_UNSEARCHED_AND_STEP, thread);
                        gt_map_links(constant, UNPROVIDED);
                    } finally {
                        gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$47, thread);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                }
            }
        } finally {
            gt_vars.$gt_marking_table$.rebind(_prev_bind_2, thread);
            gt_vars.$gt_target_marking_table$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject gt_mark_unselect_link_node_all_accessed_as_unsearched_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != gt_utilities.gt_term_p(node)) {
                if (NIL == com.cyc.cycjava.cycl.gt_search.gt_searchedP(node)) {
                    com.cyc.cycjava.cycl.gt_search.gt_mark_as_searched(node);
                    if (NIL != com.cyc.cycjava.cycl.gt_search.gt_searched_in_target_spaceP(node, UNPROVIDED)) {
                        {
                            SubLObject _prev_bind_0 = gt_vars.$gt_marking_table$.currentBinding(thread);
                            try {
                                gt_vars.$gt_marking_table$.bind(gt_vars.$gt_target_marking_table$.getDynamicValue(thread), thread);
                                if (NIL == funcall(gt_vars.$gt_compose_fn$.getDynamicValue(thread), node)) {
                                    com.cyc.cycjava.cycl.gt_search.gt_mark_as_unsearched(node);
                                    SubLTrampolineFile.checkType(GT_MARK_AS_UNSEARCHED_AND_STEP, FUNCTION_SPEC_P);
                                    {
                                        SubLObject _prev_bind_0_48 = gt_vars.$gt_base_fn$.currentBinding(thread);
                                        try {
                                            gt_vars.$gt_base_fn$.bind(GT_MARK_AS_UNSEARCHED_AND_STEP, thread);
                                            com.cyc.cycjava.cycl.gt_search.gt_map_links(node, UNPROVIDED);
                                        } finally {
                                            gt_vars.$gt_base_fn$.rebind(_prev_bind_0_48, thread);
                                        }
                                    }
                                }
                            } finally {
                                gt_vars.$gt_marking_table$.rebind(_prev_bind_0, thread);
                            }
                        }
                        gt_utilities.gt_step_fn_funcall(node);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_mark_unselect_link_node_all_accessed_as_unsearched(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != gt_utilities.gt_term_p(node)) && (NIL == gt_searchedP(node))) {
            gt_mark_as_searched(node);
            if (NIL != gt_searched_in_target_spaceP(node, UNPROVIDED)) {
                final SubLObject _prev_bind_0 = gt_vars.$gt_marking_table$.currentBinding(thread);
                try {
                    gt_vars.$gt_marking_table$.bind(gt_vars.$gt_target_marking_table$.getDynamicValue(thread), thread);
                    if (NIL == funcall(gt_vars.$gt_compose_fn$.getDynamicValue(thread), node)) {
                        gt_mark_as_unsearched(node);
                        assert NIL != function_spec_p(GT_MARK_AS_UNSEARCHED_AND_STEP) : "! function_spec_p(gt_search.GT_MARK_AS_UNSEARCHED_AND_STEP) " + ("Types.function_spec_p(gt_search.$sym20$GT_MARK_AS_UNSEARCHED_AND_STEP) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym20$GT_MARK_AS_UNSEARCHED_AND_STEP) ") + GT_MARK_AS_UNSEARCHED_AND_STEP;
                        final SubLObject _prev_bind_0_$48 = gt_vars.$gt_base_fn$.currentBinding(thread);
                        try {
                            gt_vars.$gt_base_fn$.bind(GT_MARK_AS_UNSEARCHED_AND_STEP, thread);
                            gt_map_links(node, UNPROVIDED);
                        } finally {
                            gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$48, thread);
                        }
                    }
                } finally {
                    gt_vars.$gt_marking_table$.rebind(_prev_bind_0, thread);
                }
                gt_utilities.gt_step_fn_funcall(node);
            }
        }
        return NIL;
    }

    public static final SubLObject gt_compose_pred_all_accessed_alt(SubLObject constant, SubLObject pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject reflexiveP = gt_utilities.gt_reflexiveP();
                {
                    SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
                    try {
                        gt_vars.$gt_result$.bind(NIL, thread);
                        if (NIL != ((NIL == gt_vars.$tt_pred$.getDynamicValue(thread)) || (NIL != gt_vars.$tt_transitive_conduitP$.getDynamicValue(thread)) ? ((SubLObject) (GT_MAP_LINKS)) : NIL)) {
                            SubLTrampolineFile.checkType((NIL == gt_vars.$tt_pred$.getDynamicValue(thread)) || (NIL != gt_vars.$tt_transitive_conduitP$.getDynamicValue(thread)) ? ((SubLObject) (GT_MAP_LINKS)) : NIL, FUNCTION_SPEC_P);
                        }
                        {
                            SubLObject _prev_bind_0_49 = gt_vars.$gt_step_fn$.currentBinding(thread);
                            try {
                                gt_vars.$gt_step_fn$.bind((NIL == gt_vars.$tt_pred$.getDynamicValue(thread)) || (NIL != gt_vars.$tt_transitive_conduitP$.getDynamicValue(thread)) ? ((SubLObject) (GT_MAP_LINKS)) : NIL, thread);
                                try {
                                    SubLTrampolineFile.checkType(GT_COMPOSE_PRED_LINK_NODE, FUNCTION_SPEC_P);
                                    {
                                        SubLObject _prev_bind_0_50 = gt_vars.$gt_base_fn$.currentBinding(thread);
                                        try {
                                            gt_vars.$gt_base_fn$.bind(GT_COMPOSE_PRED_LINK_NODE, thread);
                                            SubLTrampolineFile.checkType(pred, FORT_P);
                                            {
                                                SubLObject _prev_bind_0_51 = gt_vars.$gt_compose_pred$.currentBinding(thread);
                                                try {
                                                    gt_vars.$gt_compose_pred$.bind(pred, thread);
                                                    com.cyc.cycjava.cycl.gt_search.gt_map_links(constant, UNPROVIDED);
                                                    if (NIL != reflexiveP) {
                                                        com.cyc.cycjava.cycl.gt_search.gt_compose_pred_link_node_int(constant);
                                                    }
                                                } finally {
                                                    gt_vars.$gt_compose_pred$.rebind(_prev_bind_0_51, thread);
                                                }
                                            }
                                        } finally {
                                            gt_vars.$gt_base_fn$.rebind(_prev_bind_0_50, thread);
                                        }
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_52 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            clrhash(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_52, thread);
                                        }
                                    }
                                }
                            } finally {
                                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_49, thread);
                            }
                        }
                        result = gt_vars.$gt_result$.getDynamicValue(thread);
                    } finally {
                        gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject gt_compose_pred_all_accessed(final SubLObject constant, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject reflexiveP = gt_utilities.gt_reflexiveP();
        final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
        try {
            gt_vars.$gt_result$.bind(NIL, thread);
            if (((NIL != ((NIL == gt_vars.$tt_pred$.getDynamicValue(thread)) || (NIL != gt_vars.$tt_transitive_conduitP$.getDynamicValue(thread)) ? GT_MAP_LINKS : NIL)) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == function_spec_p((NIL == gt_vars.$tt_pred$.getDynamicValue(thread)) || (NIL != gt_vars.$tt_transitive_conduitP$.getDynamicValue(thread)) ? GT_MAP_LINKS : NIL))) {
                throw new AssertionError((NIL == gt_vars.$tt_pred$.getDynamicValue(thread)) || (NIL != gt_vars.$tt_transitive_conduitP$.getDynamicValue(thread)) ? GT_MAP_LINKS : NIL);
            }
            final SubLObject _prev_bind_0_$49 = gt_vars.$gt_step_fn$.currentBinding(thread);
            try {
                gt_vars.$gt_step_fn$.bind((NIL == gt_vars.$tt_pred$.getDynamicValue(thread)) || (NIL != gt_vars.$tt_transitive_conduitP$.getDynamicValue(thread)) ? GT_MAP_LINKS : NIL, thread);
                try {
                    assert NIL != function_spec_p(GT_COMPOSE_PRED_LINK_NODE) : "! function_spec_p(gt_search.GT_COMPOSE_PRED_LINK_NODE) " + ("Types.function_spec_p(gt_search.$sym24$GT_COMPOSE_PRED_LINK_NODE) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym24$GT_COMPOSE_PRED_LINK_NODE) ") + GT_COMPOSE_PRED_LINK_NODE;
                    final SubLObject _prev_bind_0_$50 = gt_vars.$gt_base_fn$.currentBinding(thread);
                    try {
                        gt_vars.$gt_base_fn$.bind(GT_COMPOSE_PRED_LINK_NODE, thread);
                        assert NIL != forts.fort_p(pred) : "! forts.fort_p(pred) " + ("forts.fort_p(pred) " + "CommonSymbols.NIL != forts.fort_p(pred) ") + pred;
                        final SubLObject _prev_bind_0_$51 = gt_vars.$gt_compose_pred$.currentBinding(thread);
                        try {
                            gt_vars.$gt_compose_pred$.bind(pred, thread);
                            gt_map_links(constant, UNPROVIDED);
                            if (NIL != reflexiveP) {
                                gt_compose_pred_link_node_int(constant);
                            }
                        } finally {
                            gt_vars.$gt_compose_pred$.rebind(_prev_bind_0_$51, thread);
                        }
                    } finally {
                        gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$50, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$52 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        clrhash(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
                    }
                }
            } finally {
                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$49, thread);
            }
            result = gt_vars.$gt_result$.getDynamicValue(thread);
        } finally {
            gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject gt_compose_pred_link_node_alt(SubLObject node) {
        if (NIL != gt_utilities.gt_term_p(node)) {
            if (NIL == com.cyc.cycjava.cycl.gt_search.gt_searchedP(node)) {
                com.cyc.cycjava.cycl.gt_search.gt_mark_as_searched(node);
                try {
                    gt_utilities.gt_step_fn_funcall(node);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.gt_search.gt_compose_pred_link_node_int(node);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject gt_compose_pred_link_node(final SubLObject node) {
        if ((NIL != gt_utilities.gt_term_p(node)) && (NIL == gt_searchedP(node))) {
            gt_mark_as_searched(node);
            try {
                gt_utilities.gt_step_fn_funcall(node);
            } finally {
                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                try {
                    bind($is_thread_performing_cleanupP$, T);
                    final SubLObject _values = getValuesAsVector();
                    gt_compose_pred_link_node_int(node);
                    restoreValuesFromVector(_values);
                } finally {
                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject gt_compose_pred_link_node_int_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = gt_vars.$gt_pred$.currentBinding(thread);
                SubLObject _prev_bind_1 = gt_vars.$gt_index_arg$.currentBinding(thread);
                SubLObject _prev_bind_2 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                SubLObject _prev_bind_3 = gt_vars.$gt_step_fn$.currentBinding(thread);
                try {
                    gt_vars.$gt_pred$.bind(gt_vars.$gt_compose_pred$.getDynamicValue(thread), thread);
                    gt_vars.$gt_index_arg$.bind(gt_vars.$gt_compose_index_arg$.getDynamicValue(thread), thread);
                    gt_vars.$gt_gather_arg$.bind(gt_vars.$gt_compose_gather_arg$.getDynamicValue(thread), thread);
                    gt_vars.$gt_step_fn$.bind(NIL, thread);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == gt_utilities.gt_modeP($DIRECTED)) {
                            Errors.error($str_alt8$invalid_gt_mode___a, $DIRECTED);
                        }
                    }
                    {
                        SubLObject _prev_bind_0_53 = gt_vars.$gt_mode$.currentBinding(thread);
                        try {
                            gt_vars.$gt_mode$.bind($DIRECTED, thread);
                            SubLTrampolineFile.checkType(GT_GATHER_LINK_NODE, FUNCTION_SPEC_P);
                            {
                                SubLObject _prev_bind_0_54 = gt_vars.$gt_base_fn$.currentBinding(thread);
                                try {
                                    gt_vars.$gt_base_fn$.bind(GT_GATHER_LINK_NODE, thread);
                                    com.cyc.cycjava.cycl.gt_search.gt_map_links(node, UNPROVIDED);
                                } finally {
                                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_54, thread);
                                }
                            }
                        } finally {
                            gt_vars.$gt_mode$.rebind(_prev_bind_0_53, thread);
                        }
                    }
                } finally {
                    gt_vars.$gt_step_fn$.rebind(_prev_bind_3, thread);
                    gt_vars.$gt_gather_arg$.rebind(_prev_bind_2, thread);
                    gt_vars.$gt_index_arg$.rebind(_prev_bind_1, thread);
                    gt_vars.$gt_pred$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_compose_pred_link_node_int(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = gt_vars.$gt_pred$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_index_arg$.currentBinding(thread);
        final SubLObject _prev_bind_3 = gt_vars.$gt_gather_arg$.currentBinding(thread);
        final SubLObject _prev_bind_4 = gt_vars.$gt_step_fn$.currentBinding(thread);
        try {
            gt_vars.$gt_pred$.bind(gt_vars.$gt_compose_pred$.getDynamicValue(thread), thread);
            gt_vars.$gt_index_arg$.bind(gt_vars.$gt_compose_index_arg$.getDynamicValue(thread), thread);
            gt_vars.$gt_gather_arg$.bind(gt_vars.$gt_compose_gather_arg$.getDynamicValue(thread), thread);
            gt_vars.$gt_step_fn$.bind(NIL, thread);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($DIRECTED))) {
                Errors.error($str8$invalid_gt_mode___a, $DIRECTED);
            }
            final SubLObject _prev_bind_0_$53 = gt_vars.$gt_mode$.currentBinding(thread);
            try {
                gt_vars.$gt_mode$.bind($DIRECTED, thread);
                assert NIL != function_spec_p(GT_GATHER_LINK_NODE) : "! function_spec_p(gt_search.GT_GATHER_LINK_NODE) " + ("Types.function_spec_p(gt_search.$sym5$GT_GATHER_LINK_NODE) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym5$GT_GATHER_LINK_NODE) ") + GT_GATHER_LINK_NODE;
                final SubLObject _prev_bind_0_$54 = gt_vars.$gt_base_fn$.currentBinding(thread);
                try {
                    gt_vars.$gt_base_fn$.bind(GT_GATHER_LINK_NODE, thread);
                    gt_map_links(node, UNPROVIDED);
                } finally {
                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$54, thread);
                }
            } finally {
                gt_vars.$gt_mode$.rebind(_prev_bind_0_$53, thread);
            }
        } finally {
            gt_vars.$gt_step_fn$.rebind(_prev_bind_4, thread);
            gt_vars.$gt_gather_arg$.rebind(_prev_bind_3, thread);
            gt_vars.$gt_index_arg$.rebind(_prev_bind_2, thread);
            gt_vars.$gt_pred$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject gt_why_accessesP_alt(SubLObject constant, SubLObject target) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                if (target.equal(constant)) {
                    if (NIL != gt_utilities.gt_reflexiveP()) {
                        result = list(bq_cons(list($$equals, target, constant), $list_alt27));
                    }
                } else {
                    {
                        SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
                        SubLObject _prev_bind_1 = gt_vars.$gt_doneP$.currentBinding(thread);
                        try {
                            gt_vars.$gt_result$.bind(NIL, thread);
                            gt_vars.$gt_doneP$.bind(NIL, thread);
                            {
                                SubLObject _prev_bind_0_55 = gt_vars.$gt_target$.currentBinding(thread);
                                try {
                                    gt_vars.$gt_target$.bind(target, thread);
                                    SubLTrampolineFile.checkType(EQ, FUNCTION_SPEC_P);
                                    {
                                        SubLObject _prev_bind_0_56 = gt_vars.$gt_compare_fn$.currentBinding(thread);
                                        try {
                                            gt_vars.$gt_compare_fn$.bind(EQ, thread);
                                            if (true) {
                                                SubLTrampolineFile.checkType(GT_MAP_LINKS, FUNCTION_SPEC_P);
                                            }
                                            {
                                                SubLObject _prev_bind_0_57 = gt_vars.$gt_step_fn$.currentBinding(thread);
                                                try {
                                                    gt_vars.$gt_step_fn$.bind(GT_MAP_LINKS, thread);
                                                    try {
                                                        SubLTrampolineFile.checkType(GT_GATHER_ACCESS_JUST, FUNCTION_SPEC_P);
                                                        {
                                                            SubLObject _prev_bind_0_58 = gt_vars.$gt_base_fn$.currentBinding(thread);
                                                            try {
                                                                gt_vars.$gt_base_fn$.bind(GT_GATHER_ACCESS_JUST, thread);
                                                                com.cyc.cycjava.cycl.gt_search.gt_map_links(constant, UNPROVIDED);
                                                            } finally {
                                                                gt_vars.$gt_base_fn$.rebind(_prev_bind_0_58, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_59 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                clrhash(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_59, thread);
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    gt_vars.$gt_step_fn$.rebind(_prev_bind_0_57, thread);
                                                }
                                            }
                                        } finally {
                                            gt_vars.$gt_compare_fn$.rebind(_prev_bind_0_56, thread);
                                        }
                                    }
                                } finally {
                                    gt_vars.$gt_target$.rebind(_prev_bind_0_55, thread);
                                }
                            }
                            result = gt_vars.$gt_result$.getDynamicValue(thread);
                        } finally {
                            gt_vars.$gt_doneP$.rebind(_prev_bind_1, thread);
                            gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject gt_why_accessesP(final SubLObject constant, final SubLObject target) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if (target.equal(constant)) {
            if (NIL != gt_utilities.gt_reflexiveP()) {
                result = list(bq_cons(list($$equals, target, constant), $list27));
            }
        } else {
            final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
            final SubLObject _prev_bind_2 = gt_vars.$gt_doneP$.currentBinding(thread);
            try {
                gt_vars.$gt_result$.bind(NIL, thread);
                gt_vars.$gt_doneP$.bind(NIL, thread);
                final SubLObject _prev_bind_0_$55 = gt_vars.$gt_target$.currentBinding(thread);
                try {
                    gt_vars.$gt_target$.bind(target, thread);
                    assert NIL != function_spec_p(EQL) : "! function_spec_p( .EQL) " + ("Types.function_spec_p(CommonSymbols.EQL) " + "CommonSymbols.NIL != Types.function_spec_p(CommonSymbols.EQL) ") + EQL;
                    final SubLObject _prev_bind_0_$56 = gt_vars.$gt_compare_fn$.currentBinding(thread);
                    try {
                        gt_vars.$gt_compare_fn$.bind(EQL, thread);
                        assert NIL != function_spec_p(GT_MAP_LINKS) : "! function_spec_p(gt_search.GT_MAP_LINKS) " + ("Types.function_spec_p(gt_search.$sym10$GT_MAP_LINKS) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym10$GT_MAP_LINKS) ") + GT_MAP_LINKS;
                        final SubLObject _prev_bind_0_$57 = gt_vars.$gt_step_fn$.currentBinding(thread);
                        try {
                            gt_vars.$gt_step_fn$.bind(GT_MAP_LINKS, thread);
                            try {
                                assert NIL != function_spec_p(GT_GATHER_ACCESS_JUST) : "! function_spec_p(gt_search.GT_GATHER_ACCESS_JUST) " + ("Types.function_spec_p(gt_search.$sym28$GT_GATHER_ACCESS_JUST) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym28$GT_GATHER_ACCESS_JUST) ") + GT_GATHER_ACCESS_JUST;
                                final SubLObject _prev_bind_0_$58 = gt_vars.$gt_base_fn$.currentBinding(thread);
                                try {
                                    gt_vars.$gt_base_fn$.bind(GT_GATHER_ACCESS_JUST, thread);
                                    gt_map_links(constant, UNPROVIDED);
                                } finally {
                                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$58, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$59 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    clrhash(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$59, thread);
                                }
                            }
                        } finally {
                            gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$57, thread);
                        }
                    } finally {
                        gt_vars.$gt_compare_fn$.rebind(_prev_bind_0_$56, thread);
                    }
                } finally {
                    gt_vars.$gt_target$.rebind(_prev_bind_0_$55, thread);
                }
                result = gt_vars.$gt_result$.getDynamicValue(thread);
            } finally {
                gt_vars.$gt_doneP$.rebind(_prev_bind_2, thread);
                gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    public static final SubLObject gt_gather_access_just_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sup = gt_vars.gt_link_support();
                if (NIL != gt_utilities.gt_compare_fn_funcall(node, gt_vars.$gt_target$.getDynamicValue(thread))) {
                    gt_vars.$gt_result$.setDynamicValue(cons(sup, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                    com.cyc.cycjava.cycl.gt_search.gt_finished(UNPROVIDED);
                } else {
                    if (NIL != gt_utilities.gt_term_p(node)) {
                        if (!((NIL != gt_vars.$gt_result$.getDynamicValue(thread)) || (NIL != com.cyc.cycjava.cycl.gt_search.gt_searchedP(node)))) {
                            com.cyc.cycjava.cycl.gt_search.gt_mark_as_searched(node);
                            gt_utilities.gt_step_fn_funcall(node);
                            if (NIL != gt_vars.$gt_result$.getDynamicValue(thread)) {
                                gt_vars.$gt_result$.setDynamicValue(cons(sup, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_gather_access_just(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sup = gt_vars.gt_link_support();
        if (NIL != gt_utilities.gt_compare_fn_funcall(node, gt_vars.$gt_target$.getDynamicValue(thread))) {
            gt_vars.$gt_result$.setDynamicValue(cons(sup, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
            gt_finished(UNPROVIDED);
        } else
            if (((NIL != gt_utilities.gt_term_p(node)) && (NIL == gt_vars.$gt_result$.getDynamicValue(thread))) && (NIL == gt_searchedP(node))) {
                gt_mark_as_searched(node);
                gt_utilities.gt_step_fn_funcall(node);
                if (NIL != gt_vars.$gt_result$.getDynamicValue(thread)) {
                    gt_vars.$gt_result$.setDynamicValue(cons(sup, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                }
            }

        return NIL;
    }

    public static final SubLObject gt_any_access_path_alt(SubLObject constant, SubLObject target) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                if (target.equal(constant)) {
                    if (NIL != gt_utilities.gt_reflexiveP()) {
                        result = list(constant);
                    }
                } else {
                    {
                        SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
                        SubLObject _prev_bind_1 = gt_vars.$gt_doneP$.currentBinding(thread);
                        try {
                            gt_vars.$gt_result$.bind(NIL, thread);
                            gt_vars.$gt_doneP$.bind(NIL, thread);
                            {
                                SubLObject _prev_bind_0_60 = gt_vars.$gt_target$.currentBinding(thread);
                                try {
                                    gt_vars.$gt_target$.bind(target, thread);
                                    SubLTrampolineFile.checkType(EQ, FUNCTION_SPEC_P);
                                    {
                                        SubLObject _prev_bind_0_61 = gt_vars.$gt_compare_fn$.currentBinding(thread);
                                        try {
                                            gt_vars.$gt_compare_fn$.bind(EQ, thread);
                                            if (true) {
                                                SubLTrampolineFile.checkType(GT_MAP_LINKS, FUNCTION_SPEC_P);
                                            }
                                            {
                                                SubLObject _prev_bind_0_62 = gt_vars.$gt_step_fn$.currentBinding(thread);
                                                try {
                                                    gt_vars.$gt_step_fn$.bind(GT_MAP_LINKS, thread);
                                                    try {
                                                        SubLTrampolineFile.checkType(GT_GATHER_ACCESS_PATH, FUNCTION_SPEC_P);
                                                        {
                                                            SubLObject _prev_bind_0_63 = gt_vars.$gt_base_fn$.currentBinding(thread);
                                                            try {
                                                                gt_vars.$gt_base_fn$.bind(GT_GATHER_ACCESS_PATH, thread);
                                                                com.cyc.cycjava.cycl.gt_search.gt_map_links(constant, UNPROVIDED);
                                                            } finally {
                                                                gt_vars.$gt_base_fn$.rebind(_prev_bind_0_63, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_64 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                clrhash(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_64, thread);
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    gt_vars.$gt_step_fn$.rebind(_prev_bind_0_62, thread);
                                                }
                                            }
                                        } finally {
                                            gt_vars.$gt_compare_fn$.rebind(_prev_bind_0_61, thread);
                                        }
                                    }
                                } finally {
                                    gt_vars.$gt_target$.rebind(_prev_bind_0_60, thread);
                                }
                            }
                            result = gt_vars.$gt_result$.getDynamicValue(thread);
                        } finally {
                            gt_vars.$gt_doneP$.rebind(_prev_bind_1, thread);
                            gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject gt_any_access_path(final SubLObject constant, final SubLObject target) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if (target.equal(constant)) {
            if (NIL != gt_utilities.gt_reflexiveP()) {
                result = list(constant);
            }
        } else {
            final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
            final SubLObject _prev_bind_2 = gt_vars.$gt_doneP$.currentBinding(thread);
            try {
                gt_vars.$gt_result$.bind(NIL, thread);
                gt_vars.$gt_doneP$.bind(NIL, thread);
                final SubLObject _prev_bind_0_$60 = gt_vars.$gt_target$.currentBinding(thread);
                try {
                    gt_vars.$gt_target$.bind(target, thread);
                    assert NIL != function_spec_p(EQL) : "! function_spec_p( .EQL) " + ("Types.function_spec_p(CommonSymbols.EQL) " + "CommonSymbols.NIL != Types.function_spec_p(CommonSymbols.EQL) ") + EQL;
                    final SubLObject _prev_bind_0_$61 = gt_vars.$gt_compare_fn$.currentBinding(thread);
                    try {
                        gt_vars.$gt_compare_fn$.bind(EQL, thread);
                        assert NIL != function_spec_p(GT_MAP_LINKS) : "! function_spec_p(gt_search.GT_MAP_LINKS) " + ("Types.function_spec_p(gt_search.$sym10$GT_MAP_LINKS) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym10$GT_MAP_LINKS) ") + GT_MAP_LINKS;
                        final SubLObject _prev_bind_0_$62 = gt_vars.$gt_step_fn$.currentBinding(thread);
                        try {
                            gt_vars.$gt_step_fn$.bind(GT_MAP_LINKS, thread);
                            try {
                                assert NIL != function_spec_p(GT_GATHER_ACCESS_PATH) : "! function_spec_p(gt_search.GT_GATHER_ACCESS_PATH) " + ("Types.function_spec_p(gt_search.$sym29$GT_GATHER_ACCESS_PATH) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym29$GT_GATHER_ACCESS_PATH) ") + GT_GATHER_ACCESS_PATH;
                                final SubLObject _prev_bind_0_$63 = gt_vars.$gt_base_fn$.currentBinding(thread);
                                try {
                                    gt_vars.$gt_base_fn$.bind(GT_GATHER_ACCESS_PATH, thread);
                                    gt_map_links(constant, UNPROVIDED);
                                } finally {
                                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$63, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$64 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    clrhash(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$64, thread);
                                }
                            }
                        } finally {
                            gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$62, thread);
                        }
                    } finally {
                        gt_vars.$gt_compare_fn$.rebind(_prev_bind_0_$61, thread);
                    }
                } finally {
                    gt_vars.$gt_target$.rebind(_prev_bind_0_$60, thread);
                }
                result = gt_vars.$gt_result$.getDynamicValue(thread);
            } finally {
                gt_vars.$gt_doneP$.rebind(_prev_bind_2, thread);
                gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    public static final SubLObject gt_gather_access_path_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != gt_utilities.gt_compare_fn_funcall(node, gt_vars.$gt_target$.getDynamicValue(thread))) {
                gt_vars.$gt_result$.setDynamicValue(cons(node, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                com.cyc.cycjava.cycl.gt_search.gt_finished(UNPROVIDED);
            } else {
                if (NIL != gt_utilities.gt_term_p(node)) {
                    if (!((NIL != gt_vars.$gt_result$.getDynamicValue(thread)) || (NIL != com.cyc.cycjava.cycl.gt_search.gt_searchedP(node)))) {
                        com.cyc.cycjava.cycl.gt_search.gt_mark_as_searched(node);
                        gt_utilities.gt_step_fn_funcall(node);
                        if (NIL != gt_vars.$gt_result$.getDynamicValue(thread)) {
                            gt_vars.$gt_result$.setDynamicValue(cons(node, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_gather_access_path(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != gt_utilities.gt_compare_fn_funcall(node, gt_vars.$gt_target$.getDynamicValue(thread))) {
            gt_vars.$gt_result$.setDynamicValue(cons(node, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
            gt_finished(UNPROVIDED);
        } else
            if (((NIL != gt_utilities.gt_term_p(node)) && (NIL == gt_vars.$gt_result$.getDynamicValue(thread))) && (NIL == gt_searchedP(node))) {
                gt_mark_as_searched(node);
                gt_utilities.gt_step_fn_funcall(node);
                if (NIL != gt_vars.$gt_result$.getDynamicValue(thread)) {
                    gt_vars.$gt_result$.setDynamicValue(cons(node, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                }
            }

        return NIL;
    }

    public static final SubLObject gt_min_mts_of_paths_alt(SubLObject inferior, SubLObject superior) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject path = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        path = gt_methods.gtm_why_superiorP(superior, inferior, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                if (path.equal(list(bq_cons(list($$equals, superior, inferior), $list_alt27)))) {
                    return isa.min_mts_of_isa_paths(gt_vars.$gt_pred$.getDynamicValue(thread), $$ReflexiveBinaryPredicate, UNPROVIDED);
                } else {
                    {
                        SubLObject mts = NIL;
                        SubLObject cdolist_list_var = path;
                        SubLObject assertion = NIL;
                        for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                            if (NIL != term.kb_assertionP(assertion)) {
                                mts = cons(assertions_high.assertion_mt(assertion), mts);
                            }
                        }
                        if (NIL != mts) {
                            mts = genl_mts.min_mts(list_utilities.remove_duplicate_forts(mts), UNPROVIDED);
                            return list(mts);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_min_mts_of_paths(final SubLObject inferior, final SubLObject superior) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject path = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            path = gt_methods.gtm_why_superiorP(superior, inferior, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (path.equal(list(bq_cons(list($$equals, superior, inferior), $list27)))) {
            return isa.min_mts_of_isa_paths(gt_vars.$gt_pred$.getDynamicValue(thread), $$ReflexiveBinaryPredicate, UNPROVIDED);
        }
        SubLObject mts = NIL;
        SubLObject cdolist_list_var = path;
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != term.kb_assertionP(assertion)) {
                mts = cons(assertions_high.assertion_mt(assertion), mts);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        if (NIL != mts) {
            mts = genl_mts.min_mts(list_utilities.remove_duplicate_forts(mts), UNPROVIDED);
            return list(mts);
        }
        return NIL;
    }

    public static final SubLObject gt_maximin_mts_among_lists_alt(SubLObject old_marking, SubLObject assertion_mt) {
        {
            SubLObject old_mark = old_marking;
            SubLObject check_list = NIL;
            SubLObject result = NIL;
            if (NIL != old_mark) {
                if (old_mark.isAtom()) {
                    old_mark = list(old_mark);
                }
                {
                    SubLObject cdolist_list_var = old_mark;
                    SubLObject mark_mt = NIL;
                    for (mark_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mark_mt = cdolist_list_var.first()) {
                        check_list = list(mark_mt, assertion_mt);
                        result = cons(gt_methods.gt_max_floors($$genlMt, gt_methods.gt_min_nodes($$genlMt, check_list, UNPROVIDED), UNPROVIDED, UNPROVIDED), result);
                    }
                }
            } else {
                result = assertion_mt;
            }
            return list_utilities.flatten(result);
        }
    }

    public static SubLObject gt_maximin_mts_among_lists(final SubLObject old_marking, final SubLObject assertion_mt) {
        SubLObject old_mark = old_marking;
        SubLObject check_list = NIL;
        SubLObject result = NIL;
        if (NIL != old_mark) {
            if (old_mark.isAtom()) {
                old_mark = list(old_mark);
            }
            SubLObject cdolist_list_var = old_mark;
            SubLObject mark_mt = NIL;
            mark_mt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                check_list = list(mark_mt, assertion_mt);
                result = cons(gt_methods.gt_max_floors($$genlMt, gt_methods.gt_min_nodes($$genlMt, check_list, UNPROVIDED), UNPROVIDED, UNPROVIDED), result);
                cdolist_list_var = cdolist_list_var.rest();
                mark_mt = cdolist_list_var.first();
            } 
        } else {
            result = assertion_mt;
        }
        return list_utilities.flatten(result);
    }

    public static final SubLObject gt_gather_link_node_and_max_mts_alt(SubLObject to_node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject from_node = gt_vars.$gt_path_list_of_nodes$.getDynamicValue(thread).first();
                SubLObject to_searchedP = com.cyc.cycjava.cycl.gt_search.gt_searchedP(to_node);
                SubLObject from_searchedP = com.cyc.cycjava.cycl.gt_search.gt_searchedP(from_node);
                SubLObject mt = gt_vars.gt_link_mt();
                {
                    SubLObject _prev_bind_0 = gt_vars.$gt_path_list_of_nodes$.currentBinding(thread);
                    try {
                        gt_vars.$gt_path_list_of_nodes$.bind(gt_vars.$gt_path_list_of_nodes$.getDynamicValue(thread), thread);
                        {
                            SubLObject maximized_mt = NIL;
                            if (NIL == subl_promotions.memberP(to_node, gt_vars.$gt_path_list_of_nodes$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                                gt_vars.$gt_path_list_of_nodes$.setDynamicValue(cons(to_node, gt_vars.$gt_path_list_of_nodes$.getDynamicValue(thread)), thread);
                                {
                                    SubLObject _prev_bind_0_65 = gt_vars.$gt_target_marking_table$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = gt_vars.$gt_marking_table$.currentBinding(thread);
                                    try {
                                        gt_vars.$gt_target_marking_table$.bind(gt_vars.$gt_marking_table$.getDynamicValue(thread), thread);
                                        gt_vars.$gt_marking_table$.bind(NIL, thread);
                                        gt_vars.$gt_marking_table$.setDynamicValue(make_hash_table($int$128, UNPROVIDED, UNPROVIDED), thread);
                                        maximized_mt = com.cyc.cycjava.cycl.gt_search.gt_maximin_mts_among_lists(from_searchedP, mt);
                                    } finally {
                                        gt_vars.$gt_marking_table$.rebind(_prev_bind_1, thread);
                                        gt_vars.$gt_target_marking_table$.rebind(_prev_bind_0_65, thread);
                                    }
                                }
                                if (NIL != to_searchedP) {
                                    {
                                        SubLObject _prev_bind_0_66 = gt_vars.$gt_target_marking_table$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = gt_vars.$gt_marking_table$.currentBinding(thread);
                                        try {
                                            gt_vars.$gt_target_marking_table$.bind(gt_vars.$gt_marking_table$.getDynamicValue(thread), thread);
                                            gt_vars.$gt_marking_table$.bind(NIL, thread);
                                            gt_vars.$gt_marking_table$.setDynamicValue(make_hash_table($int$128, UNPROVIDED, UNPROVIDED), thread);
                                            maximized_mt = gt_methods.gt_max_nodes($$genlMt, append(to_searchedP, maximized_mt), UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            gt_vars.$gt_marking_table$.rebind(_prev_bind_1, thread);
                                            gt_vars.$gt_target_marking_table$.rebind(_prev_bind_0_66, thread);
                                        }
                                    }
                                    if (NIL == list_utilities.sets_equalP(to_searchedP, maximized_mt, UNPROVIDED)) {
                                        com.cyc.cycjava.cycl.gt_search.gt_mark_as_searched_with(to_node, maximized_mt);
                                        gt_utilities.gt_step_fn_funcall(to_node);
                                    }
                                } else {
                                    com.cyc.cycjava.cycl.gt_search.gt_mark_as_searched_with(to_node, maximized_mt);
                                    gt_utilities.gt_step_fn_funcall(to_node);
                                }
                            }
                        }
                    } finally {
                        gt_vars.$gt_path_list_of_nodes$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_gather_link_node_and_max_mts(final SubLObject to_node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject from_node = gt_vars.$gt_path_list_of_nodes$.getDynamicValue(thread).first();
        final SubLObject to_searchedP = gt_searchedP(to_node);
        final SubLObject from_searchedP = gt_searchedP(from_node);
        final SubLObject mt = gt_vars.gt_link_mt();
        final SubLObject _prev_bind_0 = gt_vars.$gt_path_list_of_nodes$.currentBinding(thread);
        try {
            gt_vars.$gt_path_list_of_nodes$.bind(gt_vars.$gt_path_list_of_nodes$.getDynamicValue(thread), thread);
            SubLObject maximized_mt = NIL;
            if (NIL == subl_promotions.memberP(to_node, gt_vars.$gt_path_list_of_nodes$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                gt_vars.$gt_path_list_of_nodes$.setDynamicValue(cons(to_node, gt_vars.$gt_path_list_of_nodes$.getDynamicValue(thread)), thread);
                final SubLObject _prev_bind_0_$65 = gt_vars.$gt_target_marking_table$.currentBinding(thread);
                SubLObject _prev_bind_2 = gt_vars.$gt_marking_table$.currentBinding(thread);
                try {
                    gt_vars.$gt_target_marking_table$.bind(gt_vars.$gt_marking_table$.getDynamicValue(thread), thread);
                    gt_vars.$gt_marking_table$.bind(NIL, thread);
                    gt_vars.$gt_marking_table$.setDynamicValue(make_hash_table($int$128, UNPROVIDED, UNPROVIDED), thread);
                    maximized_mt = gt_maximin_mts_among_lists(from_searchedP, mt);
                } finally {
                    gt_vars.$gt_marking_table$.rebind(_prev_bind_2, thread);
                    gt_vars.$gt_target_marking_table$.rebind(_prev_bind_0_$65, thread);
                }
                if (NIL != to_searchedP) {
                    final SubLObject _prev_bind_0_$66 = gt_vars.$gt_target_marking_table$.currentBinding(thread);
                    _prev_bind_2 = gt_vars.$gt_marking_table$.currentBinding(thread);
                    try {
                        gt_vars.$gt_target_marking_table$.bind(gt_vars.$gt_marking_table$.getDynamicValue(thread), thread);
                        gt_vars.$gt_marking_table$.bind(NIL, thread);
                        gt_vars.$gt_marking_table$.setDynamicValue(make_hash_table($int$128, UNPROVIDED, UNPROVIDED), thread);
                        maximized_mt = gt_methods.gt_max_nodes($$genlMt, append(to_searchedP, maximized_mt), UNPROVIDED, UNPROVIDED);
                    } finally {
                        gt_vars.$gt_marking_table$.rebind(_prev_bind_2, thread);
                        gt_vars.$gt_target_marking_table$.rebind(_prev_bind_0_$66, thread);
                    }
                    if (NIL == list_utilities.sets_equalP(to_searchedP, maximized_mt, UNPROVIDED)) {
                        gt_mark_as_searched_with(to_node, maximized_mt);
                        gt_utilities.gt_step_fn_funcall(to_node);
                    }
                } else {
                    gt_mark_as_searched_with(to_node, maximized_mt);
                    gt_utilities.gt_step_fn_funcall(to_node);
                }
            }
        } finally {
            gt_vars.$gt_path_list_of_nodes$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject gt_mark_link_node_as_unsearched_and_collect_mts_alt(SubLObject node) {
        {
            SubLObject mts = com.cyc.cycjava.cycl.gt_search.gt_searchedP(node);
            if (NIL != mts) {
                com.cyc.cycjava.cycl.gt_search.gt_add_to_result(cons(node, mts));
                com.cyc.cycjava.cycl.gt_search.gt_mark_as_unsearched(node);
                gt_utilities.gt_step_fn_funcall(node);
            }
        }
        return NIL;
    }

    public static SubLObject gt_mark_link_node_as_unsearched_and_collect_mts(final SubLObject node) {
        final SubLObject mts = gt_searchedP(node);
        if (NIL != mts) {
            gt_add_to_result(cons(node, mts));
            gt_mark_as_unsearched(node);
            gt_utilities.gt_step_fn_funcall(node);
        }
        return NIL;
    }

    public static final SubLObject gt_mark_as_unsearched_and_collect_all_accessed_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType($TRUE, TRUTH_P);
            {
                SubLObject _prev_bind_0 = gt_vars.$gt_truth$.currentBinding(thread);
                try {
                    gt_vars.$gt_truth$.bind($TRUE, thread);
                    if (true) {
                        SubLTrampolineFile.checkType(GT_MAP_LINKS, FUNCTION_SPEC_P);
                    }
                    {
                        SubLObject _prev_bind_0_67 = gt_vars.$gt_step_fn$.currentBinding(thread);
                        try {
                            gt_vars.$gt_step_fn$.bind(GT_MAP_LINKS, thread);
                            SubLTrampolineFile.checkType(GT_MARK_LINK_NODE_AS_UNSEARCHED_AND_COLLECT_MTS, FUNCTION_SPEC_P);
                            {
                                SubLObject _prev_bind_0_68 = gt_vars.$gt_base_fn$.currentBinding(thread);
                                try {
                                    gt_vars.$gt_base_fn$.bind(GT_MARK_LINK_NODE_AS_UNSEARCHED_AND_COLLECT_MTS, thread);
                                    com.cyc.cycjava.cycl.gt_search.gt_map_links(node, UNPROVIDED);
                                } finally {
                                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_68, thread);
                                }
                            }
                        } finally {
                            gt_vars.$gt_step_fn$.rebind(_prev_bind_0_67, thread);
                        }
                    }
                } finally {
                    gt_vars.$gt_truth$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_mark_as_unsearched_and_collect_all_accessed(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != enumeration_types.truth_p($TRUE) : "! enumeration_types.truth_p( _KW.$TRUE) " + ("enumeration_types.truth_p(gt_search.$kw34$TRUE) " + "CommonSymbols.NIL != enumeration_types.truth_p(gt_search.$kw34$TRUE) ") + $TRUE;
        final SubLObject _prev_bind_0 = gt_vars.$gt_truth$.currentBinding(thread);
        try {
            gt_vars.$gt_truth$.bind($TRUE, thread);
            assert NIL != function_spec_p(GT_MAP_LINKS) : "! function_spec_p(gt_search.GT_MAP_LINKS) " + ("Types.function_spec_p(gt_search.$sym10$GT_MAP_LINKS) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym10$GT_MAP_LINKS) ") + GT_MAP_LINKS;
            final SubLObject _prev_bind_0_$67 = gt_vars.$gt_step_fn$.currentBinding(thread);
            try {
                gt_vars.$gt_step_fn$.bind(GT_MAP_LINKS, thread);
                assert NIL != function_spec_p(GT_MARK_LINK_NODE_AS_UNSEARCHED_AND_COLLECT_MTS) : "! function_spec_p(gt_search.GT_MARK_LINK_NODE_AS_UNSEARCHED_AND_COLLECT_MTS) " + ("Types.function_spec_p(gt_search.$sym36$GT_MARK_LINK_NODE_AS_UNSEARCHED_AND_COLLECT_MTS) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym36$GT_MARK_LINK_NODE_AS_UNSEARCHED_AND_COLLECT_MTS) ") + GT_MARK_LINK_NODE_AS_UNSEARCHED_AND_COLLECT_MTS;
                final SubLObject _prev_bind_0_$68 = gt_vars.$gt_base_fn$.currentBinding(thread);
                try {
                    gt_vars.$gt_base_fn$.bind(GT_MARK_LINK_NODE_AS_UNSEARCHED_AND_COLLECT_MTS, thread);
                    gt_map_links(node, UNPROVIDED);
                } finally {
                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$68, thread);
                }
            } finally {
                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$67, thread);
            }
        } finally {
            gt_vars.$gt_truth$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject gt_all_accessed_with_mts_alt(SubLObject constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = gt_vars.$gt_path_list_of_nodes$.currentBinding(thread);
                    SubLObject _prev_bind_1 = gt_vars.$gt_result$.currentBinding(thread);
                    try {
                        gt_vars.$gt_path_list_of_nodes$.bind(NIL, thread);
                        gt_vars.$gt_result$.bind(NIL, thread);
                        gt_vars.$gt_path_list_of_nodes$.setDynamicValue(cons(constant, gt_vars.$gt_path_list_of_nodes$.getDynamicValue(thread)), thread);
                        if (true) {
                            SubLTrampolineFile.checkType(GT_MAP_LINKS, FUNCTION_SPEC_P);
                        }
                        {
                            SubLObject _prev_bind_0_69 = gt_vars.$gt_step_fn$.currentBinding(thread);
                            try {
                                gt_vars.$gt_step_fn$.bind(GT_MAP_LINKS, thread);
                                SubLTrampolineFile.checkType(GT_GATHER_LINK_NODE_AND_MAX_MTS, FUNCTION_SPEC_P);
                                {
                                    SubLObject _prev_bind_0_70 = gt_vars.$gt_base_fn$.currentBinding(thread);
                                    try {
                                        gt_vars.$gt_base_fn$.bind(GT_GATHER_LINK_NODE_AND_MAX_MTS, thread);
                                        com.cyc.cycjava.cycl.gt_search.gt_map_links(constant, UNPROVIDED);
                                    } finally {
                                        gt_vars.$gt_base_fn$.rebind(_prev_bind_0_70, thread);
                                    }
                                }
                            } finally {
                                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_69, thread);
                            }
                        }
                        com.cyc.cycjava.cycl.gt_search.gt_mark_as_unsearched_and_collect_all_accessed(constant);
                        result = gt_vars.$gt_result$.getDynamicValue(thread);
                    } finally {
                        gt_vars.$gt_result$.rebind(_prev_bind_1, thread);
                        gt_vars.$gt_path_list_of_nodes$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject gt_all_accessed_with_mts(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_path_list_of_nodes$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_result$.currentBinding(thread);
        try {
            gt_vars.$gt_path_list_of_nodes$.bind(NIL, thread);
            gt_vars.$gt_result$.bind(NIL, thread);
            gt_vars.$gt_path_list_of_nodes$.setDynamicValue(cons(constant, gt_vars.$gt_path_list_of_nodes$.getDynamicValue(thread)), thread);
            assert NIL != function_spec_p(GT_MAP_LINKS) : "! function_spec_p(gt_search.GT_MAP_LINKS) " + ("Types.function_spec_p(gt_search.$sym10$GT_MAP_LINKS) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym10$GT_MAP_LINKS) ") + GT_MAP_LINKS;
            final SubLObject _prev_bind_0_$69 = gt_vars.$gt_step_fn$.currentBinding(thread);
            try {
                gt_vars.$gt_step_fn$.bind(GT_MAP_LINKS, thread);
                assert NIL != function_spec_p(GT_GATHER_LINK_NODE_AND_MAX_MTS) : "! function_spec_p(gt_search.GT_GATHER_LINK_NODE_AND_MAX_MTS) " + ("Types.function_spec_p(gt_search.$sym37$GT_GATHER_LINK_NODE_AND_MAX_MTS) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym37$GT_GATHER_LINK_NODE_AND_MAX_MTS) ") + GT_GATHER_LINK_NODE_AND_MAX_MTS;
                final SubLObject _prev_bind_0_$70 = gt_vars.$gt_base_fn$.currentBinding(thread);
                try {
                    gt_vars.$gt_base_fn$.bind(GT_GATHER_LINK_NODE_AND_MAX_MTS, thread);
                    gt_map_links(constant, UNPROVIDED);
                } finally {
                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$70, thread);
                }
            } finally {
                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$69, thread);
            }
            gt_mark_as_unsearched_and_collect_all_accessed(constant);
            result = gt_vars.$gt_result$.getDynamicValue(thread);
        } finally {
            gt_vars.$gt_result$.rebind(_prev_bind_2, thread);
            gt_vars.$gt_path_list_of_nodes$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject gt_gather_link_node_and_store_edges_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject assertion = gt_vars.gt_link_support();
                SubLObject edge = list(assertions_high.gaf_arg1(assertion), assertions_high.gaf_arg2(assertion));
                SubLObject marking = com.cyc.cycjava.cycl.gt_search.gt_searchedP(node);
                {
                    SubLObject _prev_bind_0 = gt_vars.$gt_edge_list$.currentBinding(thread);
                    SubLObject _prev_bind_1 = gt_vars.$gt_path_list_of_nodes$.currentBinding(thread);
                    try {
                        gt_vars.$gt_edge_list$.bind(cons(edge, gt_vars.$gt_edge_list$.getDynamicValue(thread)), thread);
                        gt_vars.$gt_path_list_of_nodes$.bind(gt_vars.$gt_path_list_of_nodes$.getDynamicValue(thread), thread);
                        if (node.equalp(gt_vars.$gt_goal_node$.getDynamicValue(thread))) {
                            gt_vars.$gt_result$.setDynamicValue(append(gt_vars.$gt_edge_list$.getDynamicValue(thread), gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                            {
                                SubLObject cdolist_list_var = gt_vars.$gt_edge_list$.getDynamicValue(thread);
                                SubLObject edge_71 = NIL;
                                for (edge_71 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , edge_71 = cdolist_list_var.first()) {
                                    com.cyc.cycjava.cycl.gt_search.gt_mark_as_searched_with(edge_71.first(), TWO_INTEGER);
                                }
                            }
                            gt_vars.$gt_edge_list$.setDynamicValue(NIL, thread);
                        } else {
                            {
                                SubLObject pcase_var = marking;
                                if (pcase_var.eql(QUOTE) || pcase_var.eql(NIL)) {
                                    com.cyc.cycjava.cycl.gt_search.gt_mark_as_searched_with(node, ONE_INTEGER);
                                    gt_vars.$gt_path_list_of_nodes$.setDynamicValue(cons(node, gt_vars.$gt_path_list_of_nodes$.getDynamicValue(thread)), thread);
                                    gt_utilities.gt_step_fn_funcall(node);
                                } else {
                                    if (pcase_var.eql(ONE_INTEGER)) {
                                        if (NIL != subl_promotions.memberP(node, gt_vars.$gt_path_list_of_nodes$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                                            gt_vars.$gt_cyclical_edges$.setDynamicValue(cons(list(node, gt_vars.$gt_edge_list$.getDynamicValue(thread)), gt_vars.$gt_cyclical_edges$.getDynamicValue(thread)), thread);
                                        }
                                    } else {
                                        if (pcase_var.eql(TWO_INTEGER)) {
                                            gt_vars.$gt_result$.setDynamicValue(append(gt_vars.$gt_edge_list$.getDynamicValue(thread), gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                                            {
                                                SubLObject cdolist_list_var = gt_vars.$gt_edge_list$.getDynamicValue(thread);
                                                SubLObject edge_72 = NIL;
                                                for (edge_72 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , edge_72 = cdolist_list_var.first()) {
                                                    com.cyc.cycjava.cycl.gt_search.gt_mark_as_searched_with(edge_72.first(), TWO_INTEGER);
                                                }
                                            }
                                            gt_vars.$gt_edge_list$.setDynamicValue(NIL, thread);
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        gt_vars.$gt_path_list_of_nodes$.rebind(_prev_bind_1, thread);
                        gt_vars.$gt_edge_list$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_gather_link_node_and_store_edges(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assertion = gt_vars.gt_link_support();
        final SubLObject edge = list(assertions_high.gaf_arg1(assertion), assertions_high.gaf_arg2(assertion));
        final SubLObject marking = gt_searchedP(node);
        final SubLObject _prev_bind_0 = gt_vars.$gt_edge_list$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_path_list_of_nodes$.currentBinding(thread);
        try {
            gt_vars.$gt_edge_list$.bind(cons(edge, gt_vars.$gt_edge_list$.getDynamicValue(thread)), thread);
            gt_vars.$gt_path_list_of_nodes$.bind(gt_vars.$gt_path_list_of_nodes$.getDynamicValue(thread), thread);
            if (node.equalp(gt_vars.$gt_goal_node$.getDynamicValue(thread))) {
                gt_vars.$gt_result$.setDynamicValue(append(gt_vars.$gt_edge_list$.getDynamicValue(thread), gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                SubLObject cdolist_list_var = gt_vars.$gt_edge_list$.getDynamicValue(thread);
                SubLObject edge_$71 = NIL;
                edge_$71 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    gt_mark_as_searched_with(edge_$71.first(), TWO_INTEGER);
                    cdolist_list_var = cdolist_list_var.rest();
                    edge_$71 = cdolist_list_var.first();
                } 
                gt_vars.$gt_edge_list$.setDynamicValue(NIL, thread);
            } else {
                final SubLObject pcase_var = marking;
                if (pcase_var.eql(QUOTE) || pcase_var.eql(NIL)) {
                    gt_mark_as_searched_with(node, ONE_INTEGER);
                    gt_vars.$gt_path_list_of_nodes$.setDynamicValue(cons(node, gt_vars.$gt_path_list_of_nodes$.getDynamicValue(thread)), thread);
                    gt_utilities.gt_step_fn_funcall(node);
                } else
                    if (pcase_var.eql(ONE_INTEGER)) {
                        if (NIL != subl_promotions.memberP(node, gt_vars.$gt_path_list_of_nodes$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                            gt_vars.$gt_cyclical_edges$.setDynamicValue(cons(list(node, gt_vars.$gt_edge_list$.getDynamicValue(thread)), gt_vars.$gt_cyclical_edges$.getDynamicValue(thread)), thread);
                        }
                    } else
                        if (pcase_var.eql(TWO_INTEGER)) {
                            gt_vars.$gt_result$.setDynamicValue(append(gt_vars.$gt_edge_list$.getDynamicValue(thread), gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                            SubLObject cdolist_list_var2 = gt_vars.$gt_edge_list$.getDynamicValue(thread);
                            SubLObject edge_$72 = NIL;
                            edge_$72 = cdolist_list_var2.first();
                            while (NIL != cdolist_list_var2) {
                                gt_mark_as_searched_with(edge_$72.first(), TWO_INTEGER);
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                edge_$72 = cdolist_list_var2.first();
                            } 
                            gt_vars.$gt_edge_list$.setDynamicValue(NIL, thread);
                        }


            }
        } finally {
            gt_vars.$gt_path_list_of_nodes$.rebind(_prev_bind_2, thread);
            gt_vars.$gt_edge_list$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject gt_check_for_cycle_edges_to_add_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = gt_vars.$gt_cyclical_edges$.getDynamicValue(thread);
                SubLObject cycle = NIL;
                for (cycle = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cycle = cdolist_list_var.first()) {
                    if (com.cyc.cycjava.cycl.gt_search.gt_searchedP(cycle.first()) == TWO_INTEGER) {
                        gt_vars.$gt_result$.setDynamicValue(append(cadr(cycle), gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_check_for_cycle_edges_to_add() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = gt_vars.$gt_cyclical_edges$.getDynamicValue(thread);
        SubLObject cycle = NIL;
        cycle = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (gt_searchedP(cycle.first()).eql(TWO_INTEGER)) {
                gt_vars.$gt_result$.setDynamicValue(append(cadr(cycle), gt_vars.$gt_result$.getDynamicValue(thread)), thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cycle = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject gt_all_edges_to_goal_alt(SubLObject start) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
                    SubLObject _prev_bind_1 = gt_vars.$gt_cyclical_edges$.currentBinding(thread);
                    try {
                        gt_vars.$gt_result$.bind(NIL, thread);
                        gt_vars.$gt_cyclical_edges$.bind(NIL, thread);
                        if (true) {
                            SubLTrampolineFile.checkType(GT_MAP_LINKS, FUNCTION_SPEC_P);
                        }
                        {
                            SubLObject _prev_bind_0_73 = gt_vars.$gt_step_fn$.currentBinding(thread);
                            try {
                                gt_vars.$gt_step_fn$.bind(GT_MAP_LINKS, thread);
                                SubLTrampolineFile.checkType(GT_GATHER_LINK_NODE_AND_STORE_EDGES, FUNCTION_SPEC_P);
                                {
                                    SubLObject _prev_bind_0_74 = gt_vars.$gt_base_fn$.currentBinding(thread);
                                    try {
                                        gt_vars.$gt_base_fn$.bind(GT_GATHER_LINK_NODE_AND_STORE_EDGES, thread);
                                        com.cyc.cycjava.cycl.gt_search.gt_map_links(start, UNPROVIDED);
                                    } finally {
                                        gt_vars.$gt_base_fn$.rebind(_prev_bind_0_74, thread);
                                    }
                                }
                            } finally {
                                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_73, thread);
                            }
                        }
                        com.cyc.cycjava.cycl.gt_search.gt_check_for_cycle_edges_to_add();
                        result = gt_vars.$gt_result$.getDynamicValue(thread);
                    } finally {
                        gt_vars.$gt_cyclical_edges$.rebind(_prev_bind_1, thread);
                        gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject gt_all_edges_to_goal(final SubLObject start) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_cyclical_edges$.currentBinding(thread);
        try {
            gt_vars.$gt_result$.bind(NIL, thread);
            gt_vars.$gt_cyclical_edges$.bind(NIL, thread);
            assert NIL != function_spec_p(GT_MAP_LINKS) : "! function_spec_p(gt_search.GT_MAP_LINKS) " + ("Types.function_spec_p(gt_search.$sym10$GT_MAP_LINKS) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym10$GT_MAP_LINKS) ") + GT_MAP_LINKS;
            final SubLObject _prev_bind_0_$73 = gt_vars.$gt_step_fn$.currentBinding(thread);
            try {
                gt_vars.$gt_step_fn$.bind(GT_MAP_LINKS, thread);
                assert NIL != function_spec_p(GT_GATHER_LINK_NODE_AND_STORE_EDGES) : "! function_spec_p(gt_search.GT_GATHER_LINK_NODE_AND_STORE_EDGES) " + ("Types.function_spec_p(gt_search.$sym39$GT_GATHER_LINK_NODE_AND_STORE_EDGES) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym39$GT_GATHER_LINK_NODE_AND_STORE_EDGES) ") + GT_GATHER_LINK_NODE_AND_STORE_EDGES;
                final SubLObject _prev_bind_0_$74 = gt_vars.$gt_base_fn$.currentBinding(thread);
                try {
                    gt_vars.$gt_base_fn$.bind(GT_GATHER_LINK_NODE_AND_STORE_EDGES, thread);
                    gt_map_links(start, UNPROVIDED);
                } finally {
                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$74, thread);
                }
            } finally {
                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$73, thread);
            }
            gt_check_for_cycle_edges_to_add();
            result = gt_vars.$gt_result$.getDynamicValue(thread);
        } finally {
            gt_vars.$gt_cyclical_edges$.rebind(_prev_bind_2, thread);
            gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject gt_access_all_while_storing_paths_alt(SubLObject start) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
                    try {
                        gt_vars.$gt_result$.bind(NIL, thread);
                        if (true) {
                            SubLTrampolineFile.checkType(GT_MAP_LINKS_REBINDING_CANDIDATE_MTS, FUNCTION_SPEC_P);
                        }
                        {
                            SubLObject _prev_bind_0_75 = gt_vars.$gt_step_fn$.currentBinding(thread);
                            try {
                                gt_vars.$gt_step_fn$.bind(GT_MAP_LINKS_REBINDING_CANDIDATE_MTS, thread);
                                SubLTrampolineFile.checkType(GT_GATHER_LINK_NODES_AND_STORE_ALL_PATHS, FUNCTION_SPEC_P);
                                {
                                    SubLObject _prev_bind_0_76 = gt_vars.$gt_base_fn$.currentBinding(thread);
                                    try {
                                        gt_vars.$gt_base_fn$.bind(GT_GATHER_LINK_NODES_AND_STORE_ALL_PATHS, thread);
                                        com.cyc.cycjava.cycl.gt_search.gt_map_links_rebinding_candidate_mts(start, UNPROVIDED);
                                    } finally {
                                        gt_vars.$gt_base_fn$.rebind(_prev_bind_0_76, thread);
                                    }
                                }
                            } finally {
                                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_75, thread);
                            }
                        }
                        result = gt_vars.$gt_result$.getDynamicValue(thread);
                    } finally {
                        gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject gt_access_all_while_storing_paths(final SubLObject start) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
        try {
            gt_vars.$gt_result$.bind(NIL, thread);
            assert NIL != function_spec_p(GT_MAP_LINKS_REBINDING_CANDIDATE_MTS) : "! function_spec_p(gt_search.GT_MAP_LINKS_REBINDING_CANDIDATE_MTS) " + ("Types.function_spec_p(gt_search.$sym40$GT_MAP_LINKS_REBINDING_CANDIDATE_MTS) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym40$GT_MAP_LINKS_REBINDING_CANDIDATE_MTS) ") + GT_MAP_LINKS_REBINDING_CANDIDATE_MTS;
            final SubLObject _prev_bind_0_$75 = gt_vars.$gt_step_fn$.currentBinding(thread);
            try {
                gt_vars.$gt_step_fn$.bind(GT_MAP_LINKS_REBINDING_CANDIDATE_MTS, thread);
                assert NIL != function_spec_p(GT_GATHER_LINK_NODES_AND_STORE_ALL_PATHS) : "! function_spec_p(gt_search.GT_GATHER_LINK_NODES_AND_STORE_ALL_PATHS) " + ("Types.function_spec_p(gt_search.$sym41$GT_GATHER_LINK_NODES_AND_STORE_ALL_PATHS) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym41$GT_GATHER_LINK_NODES_AND_STORE_ALL_PATHS) ") + GT_GATHER_LINK_NODES_AND_STORE_ALL_PATHS;
                final SubLObject _prev_bind_0_$76 = gt_vars.$gt_base_fn$.currentBinding(thread);
                try {
                    gt_vars.$gt_base_fn$.bind(GT_GATHER_LINK_NODES_AND_STORE_ALL_PATHS, thread);
                    gt_map_links_rebinding_candidate_mts(start, UNPROVIDED);
                } finally {
                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$76, thread);
                }
            } finally {
                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$75, thread);
            }
            result = gt_vars.$gt_result$.getDynamicValue(thread);
        } finally {
            gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject gt_gather_link_nodes_and_store_all_paths_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject assertion = gt_vars.gt_link_support();
                {
                    SubLObject _prev_bind_0 = gt_vars.$gt_path_list_of_assertions$.currentBinding(thread);
                    try {
                        gt_vars.$gt_path_list_of_assertions$.bind(cons(assertion, gt_vars.$gt_path_list_of_assertions$.getDynamicValue(thread)), thread);
                        if (node.equalp(gt_vars.$gt_goal_node$.getDynamicValue(thread))) {
                            {
                                SubLObject cdolist_list_var = gt_vars.$gt_path_list_of_assertions$.getDynamicValue(thread);
                                SubLObject assertion_77 = NIL;
                                for (assertion_77 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion_77 = cdolist_list_var.first()) {
                                    com.cyc.cycjava.cycl.gt_search.gt_mark_as_unsearched(assertions_high.gaf_arg2(assertion_77));
                                }
                                gt_vars.$gt_result$.setDynamicValue(cons(gt_vars.$gt_path_list_of_assertions$.getDynamicValue(thread), gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                            }
                        } else {
                            if (NIL == com.cyc.cycjava.cycl.gt_search.gt_searchedP(node)) {
                                com.cyc.cycjava.cycl.gt_search.gt_mark_as_searched(node);
                                gt_utilities.gt_step_fn_funcall(node);
                            }
                        }
                    } finally {
                        gt_vars.$gt_path_list_of_assertions$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_gather_link_nodes_and_store_all_paths(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assertion = gt_vars.gt_link_support();
        final SubLObject _prev_bind_0 = gt_vars.$gt_path_list_of_assertions$.currentBinding(thread);
        try {
            gt_vars.$gt_path_list_of_assertions$.bind(cons(assertion, gt_vars.$gt_path_list_of_assertions$.getDynamicValue(thread)), thread);
            if (node.equalp(gt_vars.$gt_goal_node$.getDynamicValue(thread))) {
                SubLObject cdolist_list_var = gt_vars.$gt_path_list_of_assertions$.getDynamicValue(thread);
                SubLObject assertion_$77 = NIL;
                assertion_$77 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    gt_mark_as_unsearched(assertions_high.gaf_arg2(assertion_$77));
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion_$77 = cdolist_list_var.first();
                } 
                gt_vars.$gt_result$.setDynamicValue(cons(gt_vars.$gt_path_list_of_assertions$.getDynamicValue(thread), gt_vars.$gt_result$.getDynamicValue(thread)), thread);
            } else
                if (NIL == gt_searchedP(node)) {
                    gt_mark_as_searched(node);
                    gt_utilities.gt_step_fn_funcall(node);
                }

        } finally {
            gt_vars.$gt_path_list_of_assertions$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject gt_access_all_while_unifying_mts_alt(SubLObject start) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
                    try {
                        gt_vars.$gt_result$.bind(NIL, thread);
                        if (true) {
                            SubLTrampolineFile.checkType(GT_MAP_LINKS_REBINDING_CANDIDATE_MTS, FUNCTION_SPEC_P);
                        }
                        {
                            SubLObject _prev_bind_0_78 = gt_vars.$gt_step_fn$.currentBinding(thread);
                            try {
                                gt_vars.$gt_step_fn$.bind(GT_MAP_LINKS_REBINDING_CANDIDATE_MTS, thread);
                                SubLTrampolineFile.checkType(GT_GATHER_LINK_NODES_AND_UNIFY_MTS_ALONG_THE_WAY, FUNCTION_SPEC_P);
                                {
                                    SubLObject _prev_bind_0_79 = gt_vars.$gt_base_fn$.currentBinding(thread);
                                    try {
                                        gt_vars.$gt_base_fn$.bind(GT_GATHER_LINK_NODES_AND_UNIFY_MTS_ALONG_THE_WAY, thread);
                                        com.cyc.cycjava.cycl.gt_search.gt_map_links_rebinding_candidate_mts(start, UNPROVIDED);
                                    } finally {
                                        gt_vars.$gt_base_fn$.rebind(_prev_bind_0_79, thread);
                                    }
                                }
                            } finally {
                                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_78, thread);
                            }
                        }
                        result = gt_vars.$gt_result$.getDynamicValue(thread);
                    } finally {
                        gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject gt_access_all_while_unifying_mts(final SubLObject start) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
        try {
            gt_vars.$gt_result$.bind(NIL, thread);
            assert NIL != function_spec_p(GT_MAP_LINKS_REBINDING_CANDIDATE_MTS) : "! function_spec_p(gt_search.GT_MAP_LINKS_REBINDING_CANDIDATE_MTS) " + ("Types.function_spec_p(gt_search.$sym40$GT_MAP_LINKS_REBINDING_CANDIDATE_MTS) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym40$GT_MAP_LINKS_REBINDING_CANDIDATE_MTS) ") + GT_MAP_LINKS_REBINDING_CANDIDATE_MTS;
            final SubLObject _prev_bind_0_$78 = gt_vars.$gt_step_fn$.currentBinding(thread);
            try {
                gt_vars.$gt_step_fn$.bind(GT_MAP_LINKS_REBINDING_CANDIDATE_MTS, thread);
                assert NIL != function_spec_p(GT_GATHER_LINK_NODES_AND_UNIFY_MTS_ALONG_THE_WAY) : "! function_spec_p(gt_search.GT_GATHER_LINK_NODES_AND_UNIFY_MTS_ALONG_THE_WAY) " + ("Types.function_spec_p(gt_search.$sym42$GT_GATHER_LINK_NODES_AND_UNIFY_MTS_ALONG_THE_WAY) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym42$GT_GATHER_LINK_NODES_AND_UNIFY_MTS_ALONG_THE_WAY) ") + GT_GATHER_LINK_NODES_AND_UNIFY_MTS_ALONG_THE_WAY;
                final SubLObject _prev_bind_0_$79 = gt_vars.$gt_base_fn$.currentBinding(thread);
                try {
                    gt_vars.$gt_base_fn$.bind(GT_GATHER_LINK_NODES_AND_UNIFY_MTS_ALONG_THE_WAY, thread);
                    gt_map_links_rebinding_candidate_mts(start, UNPROVIDED);
                } finally {
                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$79, thread);
                }
            } finally {
                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$78, thread);
            }
            result = gt_vars.$gt_result$.getDynamicValue(thread);
        } finally {
            gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject gt_map_links_rebinding_candidate_mts_alt(SubLObject constant, SubLObject fn) {
        if (fn == UNPROVIDED) {
            fn = gt_vars.$gt_base_fn$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = gt_vars.$gt_link_type$.getDynamicValue(thread);
                if (pcase_var.eql($ASSERTION)) {
                    com.cyc.cycjava.cycl.gt_search.gt_map_assertion_links(constant, fn);
                } else {
                    gt_utilities.gt_error(THREE_INTEGER, $str_alt44$illegal_value_of__gt_link_type___, gt_vars.$gt_link_type$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_map_links_rebinding_candidate_mts(final SubLObject constant, SubLObject fn) {
        if (fn == UNPROVIDED) {
            fn = gt_vars.$gt_base_fn$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = gt_vars.$gt_link_type$.getDynamicValue(thread);
        if (pcase_var.eql($ASSERTION)) {
            gt_map_assertion_links(constant, fn);
        } else {
            gt_utilities.gt_error(THREE_INTEGER, $str44$illegal_value_of__gt_link_type___, gt_vars.$gt_link_type$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject gt_gather_link_nodes_and_unify_mts_along_the_way_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject link_mt = gt_vars.gt_link_mt();
                SubLObject link_pred = gt_vars.gt_link_pred();
                SubLObject gp_mt = NIL;
                SubLObject searched_by_lists = NIL;
                SubLObject path_mts = NIL;
                {
                    SubLObject _prev_bind_0 = gt_vars.$gt_path_length$.currentBinding(thread);
                    SubLObject _prev_bind_1 = gt_vars.$gt_list_of_path_lengths$.currentBinding(thread);
                    SubLObject _prev_bind_2 = gt_vars.$gt_path_list_of_nodes$.currentBinding(thread);
                    SubLObject _prev_bind_3 = gt_vars.$gt_path_list_of_mts$.currentBinding(thread);
                    try {
                        gt_vars.$gt_path_length$.bind(gt_vars.$gt_path_length$.getDynamicValue(thread), thread);
                        gt_vars.$gt_list_of_path_lengths$.bind(gt_vars.$gt_list_of_path_lengths$.getDynamicValue(thread), thread);
                        gt_vars.$gt_path_list_of_nodes$.bind(gt_vars.$gt_path_list_of_nodes$.getDynamicValue(thread), thread);
                        gt_vars.$gt_path_list_of_mts$.bind(gt_vars.$gt_path_list_of_mts$.getDynamicValue(thread), thread);
                        if (link_pred != gt_vars.$gt_pred$.getDynamicValue(thread)) {
                            gp_mt = (NIL != genl_predicates.genl_predicateP(link_pred, gt_vars.$gt_pred$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) ? ((SubLObject) (genl_predicates.max_floor_mts_of_genl_pred_paths(link_pred, gt_vars.$gt_pred$.getDynamicValue(thread)).first())) : genl_predicates.max_floor_mts_of_genl_inverse_paths(link_pred, gt_vars.$gt_pred$.getDynamicValue(thread), UNPROVIDED).first();
                        }
                        com.cyc.cycjava.cycl.gt_search.adjudiciate_adding_mt(link_mt);
                        if (NIL != gp_mt) {
                            com.cyc.cycjava.cycl.gt_search.adjudiciate_adding_mt(gp_mt);
                        }
                        searched_by_lists = com.cyc.cycjava.cycl.gt_search.gt_searchedP(node);
                        path_mts = gt_vars.$gt_path_list_of_mts$.getDynamicValue(thread);
                        if (node.equalp(gt_vars.$gt_what_mts_goal_node$.getDynamicValue(thread))) {
                            com.cyc.cycjava.cycl.gt_search.gt_maxs_of_mt_list(gt_vars.$gt_path_list_of_mts$.getDynamicValue(thread));
                        } else {
                            if (NIL == subl_promotions.memberP(node, gt_vars.$gt_path_list_of_nodes$.getDynamicValue(thread), HLMT_EQUAL, UNPROVIDED)) {
                                if (NIL == com.cyc.cycjava.cycl.gt_search.is_x_a_path_list_in_yP(path_mts, searched_by_lists)) {
                                    com.cyc.cycjava.cycl.gt_search.gt_mark_as_searched_by(node, path_mts);
                                    gt_vars.$gt_path_list_of_nodes$.setDynamicValue(cons(node, gt_vars.$gt_path_list_of_nodes$.getDynamicValue(thread)), thread);
                                    gt_vars.$gt_list_of_path_lengths$.setDynamicValue(cons(gt_vars.$gt_path_length$.getDynamicValue(thread), gt_vars.$gt_list_of_path_lengths$.getDynamicValue(thread)), thread);
                                    gt_utilities.gt_step_fn_funcall(node);
                                }
                            }
                        }
                    } finally {
                        gt_vars.$gt_path_list_of_mts$.rebind(_prev_bind_3, thread);
                        gt_vars.$gt_path_list_of_nodes$.rebind(_prev_bind_2, thread);
                        gt_vars.$gt_list_of_path_lengths$.rebind(_prev_bind_1, thread);
                        gt_vars.$gt_path_length$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_gather_link_nodes_and_unify_mts_along_the_way(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject link_mt = gt_vars.gt_link_mt();
        final SubLObject link_pred = gt_vars.gt_link_pred();
        SubLObject gp_mt = NIL;
        SubLObject searched_by_lists = NIL;
        SubLObject path_mts = NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_path_length$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_list_of_path_lengths$.currentBinding(thread);
        final SubLObject _prev_bind_3 = gt_vars.$gt_path_list_of_nodes$.currentBinding(thread);
        final SubLObject _prev_bind_4 = gt_vars.$gt_path_list_of_mts$.currentBinding(thread);
        try {
            gt_vars.$gt_path_length$.bind(gt_vars.$gt_path_length$.getDynamicValue(thread), thread);
            gt_vars.$gt_list_of_path_lengths$.bind(gt_vars.$gt_list_of_path_lengths$.getDynamicValue(thread), thread);
            gt_vars.$gt_path_list_of_nodes$.bind(gt_vars.$gt_path_list_of_nodes$.getDynamicValue(thread), thread);
            gt_vars.$gt_path_list_of_mts$.bind(gt_vars.$gt_path_list_of_mts$.getDynamicValue(thread), thread);
            if (!link_pred.eql(gt_vars.$gt_pred$.getDynamicValue(thread))) {
                gp_mt = (NIL != genl_predicates.genl_predicateP(link_pred, gt_vars.$gt_pred$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) ? genl_predicates.max_floor_mts_of_genl_pred_paths(link_pred, gt_vars.$gt_pred$.getDynamicValue(thread)).first() : genl_predicates.max_floor_mts_of_genl_inverse_paths(link_pred, gt_vars.$gt_pred$.getDynamicValue(thread), UNPROVIDED).first();
            }
            adjudiciate_adding_mt(link_mt);
            if (NIL != gp_mt) {
                adjudiciate_adding_mt(gp_mt);
            }
            searched_by_lists = gt_searchedP(node);
            path_mts = gt_vars.$gt_path_list_of_mts$.getDynamicValue(thread);
            if (node.equalp(gt_vars.$gt_what_mts_goal_node$.getDynamicValue(thread))) {
                gt_maxs_of_mt_list(gt_vars.$gt_path_list_of_mts$.getDynamicValue(thread));
            } else
                if ((NIL == subl_promotions.memberP(node, gt_vars.$gt_path_list_of_nodes$.getDynamicValue(thread), HLMT_EQUAL, UNPROVIDED)) && (NIL == is_x_a_path_list_in_yP(path_mts, searched_by_lists))) {
                    gt_mark_as_searched_by(node, path_mts);
                    gt_vars.$gt_path_list_of_nodes$.setDynamicValue(cons(node, gt_vars.$gt_path_list_of_nodes$.getDynamicValue(thread)), thread);
                    gt_vars.$gt_list_of_path_lengths$.setDynamicValue(cons(gt_vars.$gt_path_length$.getDynamicValue(thread), gt_vars.$gt_list_of_path_lengths$.getDynamicValue(thread)), thread);
                    gt_utilities.gt_step_fn_funcall(node);
                }

        } finally {
            gt_vars.$gt_path_list_of_mts$.rebind(_prev_bind_4, thread);
            gt_vars.$gt_path_list_of_nodes$.rebind(_prev_bind_3, thread);
            gt_vars.$gt_list_of_path_lengths$.rebind(_prev_bind_2, thread);
            gt_vars.$gt_path_length$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     * return microtheories maximal in MT-LIST, or those that are common spec mts of MT-LIST
     */
    @LispMethod(comment = "return microtheories maximal in MT-LIST, or those that are common spec mts of MT-LIST")
    public static final SubLObject gt_maxs_of_mt_list_alt(SubLObject mt_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = inference_trampolines.inference_max_floor_mts_with_cycles_pruned(mt_list, UNPROVIDED);
                if (NIL != result) {
                    gt_vars.$gt_what_mts_result$.setDynamicValue(append(gt_vars.$gt_what_mts_result$.getDynamicValue(thread), result), thread);
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "return microtheories maximal in MT-LIST, or those that are common spec mts of MT-LIST")
    public static SubLObject gt_maxs_of_mt_list(final SubLObject mt_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject result = inference_trampolines.inference_max_floor_mts_with_cycles_pruned(mt_list, UNPROVIDED);
        if (NIL != result) {
            gt_vars.$gt_what_mts_result$.setDynamicValue(append(gt_vars.$gt_what_mts_result$.getDynamicValue(thread), result), thread);
        }
        return NIL;
    }/**
     * return microtheories maximal in MT-LIST, or those that are common spec mts of MT-LIST
     */


    public static final SubLObject is_x_a_path_list_in_yP_alt(SubLObject x, SubLObject y) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject flag = NIL;
                SubLObject result = NIL;
                SubLObject y_lyst = y;
                if (NIL == flag) {
                    {
                        SubLObject csome_list_var = gt_vars.$gt_list_of_path_lengths$.getDynamicValue(thread);
                        SubLObject check_number = NIL;
                        for (check_number = csome_list_var.first(); !((NIL != flag) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , check_number = csome_list_var.first()) {
                            if ((check_number == gt_vars.$gt_path_length$.getDynamicValue(thread)) && (NIL != com.cyc.cycjava.cycl.gt_search.fort_sets_equal(x, y_lyst.first()))) {
                                result = T;
                                flag = T;
                            } else {
                                y_lyst = y_lyst.rest();
                            }
                        }
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject is_x_a_path_list_in_yP(final SubLObject x, final SubLObject y) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject flag = NIL;
        SubLObject result = NIL;
        SubLObject y_lyst = y;
        if (NIL == flag) {
            SubLObject csome_list_var = gt_vars.$gt_list_of_path_lengths$.getDynamicValue(thread);
            SubLObject check_number = NIL;
            check_number = csome_list_var.first();
            while ((NIL == flag) && (NIL != csome_list_var)) {
                if (check_number.eql(gt_vars.$gt_path_length$.getDynamicValue(thread)) && (NIL != fort_sets_equal(x, y_lyst.first()))) {
                    result = T;
                    flag = T;
                } else {
                    y_lyst = y_lyst.rest();
                }
                csome_list_var = csome_list_var.rest();
                check_number = csome_list_var.first();
            } 
        }
        return result;
    }

    public static final SubLObject fort_sets_equal_alt(SubLObject set_a, SubLObject set_b) {
        {
            SubLObject flag = NIL;
            SubLObject temporary_marking_space = make_hash_table($int$512, UNPROVIDED, UNPROVIDED);
            SubLObject result = T;
            if (NIL == set_b) {
                if (NIL != set_a) {
                    result = NIL;
                }
            }
            {
                SubLObject cdolist_list_var = set_a;
                SubLObject node = NIL;
                for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.gt_search.gt_mark_as_searched_in_target_space(node, T, temporary_marking_space);
                }
            }
            if (NIL == flag) {
                {
                    SubLObject csome_list_var = set_b;
                    SubLObject node = NIL;
                    for (node = csome_list_var.first(); !((NIL != flag) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , node = csome_list_var.first()) {
                        if (NIL == com.cyc.cycjava.cycl.gt_search.gt_searched_in_target_spaceP(node, temporary_marking_space)) {
                            result = NIL;
                            flag = T;
                        }
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject fort_sets_equal(final SubLObject set_a, final SubLObject set_b) {
        SubLObject flag = NIL;
        final SubLObject temporary_marking_space = make_hash_table($int$512, UNPROVIDED, UNPROVIDED);
        SubLObject result = T;
        if ((NIL == set_b) && (NIL != set_a)) {
            result = NIL;
        }
        SubLObject cdolist_list_var = set_a;
        SubLObject node = NIL;
        node = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            gt_mark_as_searched_in_target_space(node, T, temporary_marking_space);
            cdolist_list_var = cdolist_list_var.rest();
            node = cdolist_list_var.first();
        } 
        if (NIL == flag) {
            SubLObject csome_list_var = set_b;
            node = NIL;
            node = csome_list_var.first();
            while ((NIL == flag) && (NIL != csome_list_var)) {
                if (NIL == gt_searched_in_target_spaceP(node, temporary_marking_space)) {
                    result = NIL;
                    flag = T;
                }
                csome_list_var = csome_list_var.rest();
                node = csome_list_var.first();
            } 
        }
        return result;
    }

    public static final SubLObject adjudiciate_adding_mt_alt(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject memberP = subl_promotions.memberP(mt, gt_vars.$gt_path_list_of_mts$.getDynamicValue(thread), HLMT_EQUAL, UNPROVIDED);
                if (NIL == memberP) {
                    gt_vars.$gt_path_list_of_mts$.setDynamicValue(cons(mt, gt_vars.$gt_path_list_of_mts$.getDynamicValue(thread)), thread);
                    gt_vars.$gt_path_length$.setDynamicValue(add(gt_vars.$gt_path_length$.getDynamicValue(thread), ONE_INTEGER), thread);
                }
                return memberP;
            }
        }
    }

    public static SubLObject adjudiciate_adding_mt(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject memberP = subl_promotions.memberP(mt, gt_vars.$gt_path_list_of_mts$.getDynamicValue(thread), HLMT_EQUAL, UNPROVIDED);
        if (NIL == memberP) {
            gt_vars.$gt_path_list_of_mts$.setDynamicValue(cons(mt, gt_vars.$gt_path_list_of_mts$.getDynamicValue(thread)), thread);
            gt_vars.$gt_path_length$.setDynamicValue(add(gt_vars.$gt_path_length$.getDynamicValue(thread), ONE_INTEGER), thread);
        }
        return memberP;
    }

    public static final SubLObject gt_finished_alt(SubLObject result) {
        if (result == UNPROVIDED) {
            result = NIL;
        }
        if (NIL != result) {
            gt_vars.$gt_result$.setDynamicValue(result);
        }
        mapping_finished();
        return NIL;
    }

    public static SubLObject gt_finished(SubLObject result) {
        if (result == UNPROVIDED) {
            result = NIL;
        }
        if (NIL != result) {
            gt_vars.$gt_result$.setDynamicValue(result);
        }
        mapping_finished();
        return NIL;
    }

    public static final SubLObject gt_map_links_alt(SubLObject constant, SubLObject fn) {
        if (fn == UNPROVIDED) {
            fn = gt_vars.$gt_base_fn$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cutoff_reached = NIL;
                {
                    SubLObject _prev_bind_0 = gt_macros.$gt_recursion_cutoff$.currentBinding(thread);
                    SubLObject _prev_bind_1 = gt_vars.$gt_depth_cutoff$.currentBinding(thread);
                    try {
                        gt_macros.$gt_recursion_cutoff$.bind(gt_macros.$gt_recursion_cutoff$.getDynamicValue(thread).isInteger() ? ((SubLObject) (subtract(gt_macros.$gt_recursion_cutoff$.getDynamicValue(thread), ONE_INTEGER))) : NIL, thread);
                        gt_vars.$gt_depth_cutoff$.bind(subtract(gt_vars.$gt_depth_cutoff$.getDynamicValue(thread), ONE_INTEGER), thread);
                        if (gt_macros.$gt_recursion_cutoff$.getDynamicValue(thread).isInteger() && gt_macros.$gt_recursion_cutoff$.getDynamicValue(thread).numL(ZERO_INTEGER)) {
                            Errors.error($str_alt47$GT_recursion_limit_reached___Plea);
                        }
                        if (NIL != gt_vars.$gt_depth_cutoffP$.getDynamicValue(thread)) {
                            if (gt_vars.$gt_depth_cutoff$.getDynamicValue(thread).numL(ZERO_INTEGER)) {
                                cutoff_reached = T;
                            }
                        }
                        if (NIL != gt_vars.$gt_time_cutoffP$.getDynamicValue(thread)) {
                            if (gt_vars.$gt_time_cutoff$.getDynamicValue(thread).numL(divide(subtract(get_internal_real_time(), gt_vars.$gt_initial_time$.getDynamicValue(thread)), time_high.$internal_time_units_per_second$.getGlobalValue()))) {
                                cutoff_reached = T;
                            }
                        }
                        if (NIL == cutoff_reached) {
                            {
                                SubLObject pcase_var = gt_vars.$gt_link_type$.getDynamicValue(thread);
                                if (pcase_var.eql($ASSERTION)) {
                                    com.cyc.cycjava.cycl.gt_search.gt_map_assertion_links(constant, fn);
                                } else {
                                    if (pcase_var.eql($ACCESSORS)) {
                                        com.cyc.cycjava.cycl.gt_search.gt_map_accessors_links(constant, fn);
                                    } else {
                                        gt_utilities.gt_error(THREE_INTEGER, $str_alt44$illegal_value_of__gt_link_type___, gt_vars.$gt_link_type$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                }
                            }
                        }
                    } finally {
                        gt_vars.$gt_depth_cutoff$.rebind(_prev_bind_1, thread);
                        gt_macros.$gt_recursion_cutoff$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_map_links(final SubLObject constant, SubLObject fn) {
        if (fn == UNPROVIDED) {
            fn = gt_vars.$gt_base_fn$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cutoff_reached = NIL;
        final SubLObject _prev_bind_0 = gt_macros.$gt_recursion_cutoff$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_depth_cutoff$.currentBinding(thread);
        try {
            gt_macros.$gt_recursion_cutoff$.bind(gt_macros.$gt_recursion_cutoff$.getDynamicValue(thread).isInteger() ? subtract(gt_macros.$gt_recursion_cutoff$.getDynamicValue(thread), ONE_INTEGER) : NIL, thread);
            gt_vars.$gt_depth_cutoff$.bind(subtract(gt_vars.$gt_depth_cutoff$.getDynamicValue(thread), ONE_INTEGER), thread);
            if (gt_macros.$gt_recursion_cutoff$.getDynamicValue(thread).isInteger() && gt_macros.$gt_recursion_cutoff$.getDynamicValue(thread).numL(ZERO_INTEGER)) {
                Errors.error($str47$GT_recursion_limit_reached_);
            }
            if ((NIL != gt_vars.$gt_depth_cutoffP$.getDynamicValue(thread)) && gt_vars.$gt_depth_cutoff$.getDynamicValue(thread).numL(ZERO_INTEGER)) {
                cutoff_reached = T;
            }
            if ((NIL != gt_vars.$gt_time_cutoffP$.getDynamicValue(thread)) && gt_vars.$gt_time_cutoff$.getDynamicValue(thread).numL(divide(subtract(get_internal_real_time(), gt_vars.$gt_initial_time$.getDynamicValue(thread)), time_high.$internal_time_units_per_second$.getGlobalValue()))) {
                cutoff_reached = T;
            }
            if (NIL == cutoff_reached) {
                final SubLObject pcase_var = gt_vars.$gt_link_type$.getDynamicValue(thread);
                if (pcase_var.eql($ASSERTION)) {
                    gt_map_assertion_links(constant, fn);
                } else
                    if (pcase_var.eql($ACCESSORS)) {
                        gt_map_accessors_links(constant, fn);
                    } else {
                        gt_utilities.gt_error(THREE_INTEGER, $str44$illegal_value_of__gt_link_type___, gt_vars.$gt_link_type$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }

            }
        } finally {
            gt_vars.$gt_depth_cutoff$.rebind(_prev_bind_2, thread);
            gt_macros.$gt_recursion_cutoff$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject gt_map_assertion_links_alt(SubLObject constant, SubLObject fn) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = kb_gp_mapping.$mapping_arg_swap$.currentBinding(thread);
                try {
                    kb_gp_mapping.$mapping_arg_swap$.bind(NIL, thread);
                    {
                        SubLObject pcase_var = gt_vars.$gt_mode$.getDynamicValue(thread);
                        if (pcase_var.eql($DIRECTED)) {
                            com.cyc.cycjava.cycl.gt_search.gt_map_arg_index(fn, constant, gt_vars.$gt_index_arg$.getDynamicValue(thread), gt_vars.$gt_pred$.getDynamicValue(thread), gt_vars.$gt_truth$.getDynamicValue(thread));
                        } else {
                            if (pcase_var.eql($INVERSE)) {
                                com.cyc.cycjava.cycl.gt_search.gt_map_arg_index(fn, constant, gt_vars.$gt_gather_arg$.getDynamicValue(thread), gt_vars.$gt_pred$.getDynamicValue(thread), gt_vars.$gt_truth$.getDynamicValue(thread));
                            } else {
                                if (pcase_var.eql($SUPERIOR)) {
                                    com.cyc.cycjava.cycl.gt_search.gt_map_arg_index(fn, constant, gt_vars.$gt_index_arg$.getDynamicValue(thread), gt_vars.$gt_pred$.getDynamicValue(thread), gt_vars.$gt_truth$.getDynamicValue(thread));
                                } else {
                                    if (pcase_var.eql($INFERIOR)) {
                                        com.cyc.cycjava.cycl.gt_search.gt_map_arg_index(fn, constant, gt_vars.$gt_gather_arg$.getDynamicValue(thread), gt_vars.$gt_pred$.getDynamicValue(thread), gt_vars.$gt_truth$.getDynamicValue(thread));
                                    } else {
                                        if (pcase_var.eql($ACCESSIBLE)) {
                                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                                if (NIL == gt_utilities.gt_modeP($SUPERIOR)) {
                                                    Errors.error($str_alt8$invalid_gt_mode___a, $SUPERIOR);
                                                }
                                            }
                                            {
                                                SubLObject _prev_bind_0_80 = gt_vars.$gt_mode$.currentBinding(thread);
                                                try {
                                                    gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                                                    com.cyc.cycjava.cycl.gt_search.gt_map_arg_index(fn, constant, gt_vars.$gt_index_arg$.getDynamicValue(thread), gt_vars.$gt_pred$.getDynamicValue(thread), gt_vars.$gt_truth$.getDynamicValue(thread));
                                                } finally {
                                                    gt_vars.$gt_mode$.rebind(_prev_bind_0_80, thread);
                                                }
                                            }
                                            clrhash(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                                if (NIL == gt_utilities.gt_modeP($INFERIOR)) {
                                                    Errors.error($str_alt8$invalid_gt_mode___a, $INFERIOR);
                                                }
                                            }
                                            {
                                                SubLObject _prev_bind_0_81 = gt_vars.$gt_mode$.currentBinding(thread);
                                                try {
                                                    gt_vars.$gt_mode$.bind($INFERIOR, thread);
                                                    com.cyc.cycjava.cycl.gt_search.gt_map_arg_index(fn, constant, gt_vars.$gt_gather_arg$.getDynamicValue(thread), gt_vars.$gt_pred$.getDynamicValue(thread), gt_vars.$gt_truth$.getDynamicValue(thread));
                                                } finally {
                                                    gt_vars.$gt_mode$.rebind(_prev_bind_0_81, thread);
                                                }
                                            }
                                        } else {
                                            gt_utilities.gt_error(FIVE_INTEGER, $str_alt4$illegal_value_of__gt_mode____s, gt_vars.$gt_mode$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } finally {
                    kb_gp_mapping.$mapping_arg_swap$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_map_assertion_links(final SubLObject constant, final SubLObject fn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_gp_mapping.$mapping_arg_swap$.currentBinding(thread);
        try {
            kb_gp_mapping.$mapping_arg_swap$.bind(NIL, thread);
            final SubLObject pcase_var = gt_vars.$gt_mode$.getDynamicValue(thread);
            if (pcase_var.eql($DIRECTED)) {
                gt_map_arg_index(fn, constant, gt_vars.$gt_index_arg$.getDynamicValue(thread), gt_vars.$gt_pred$.getDynamicValue(thread), gt_vars.$gt_truth$.getDynamicValue(thread));
            } else
                if (pcase_var.eql($INVERSE)) {
                    gt_map_arg_index(fn, constant, gt_vars.$gt_gather_arg$.getDynamicValue(thread), gt_vars.$gt_pred$.getDynamicValue(thread), gt_vars.$gt_truth$.getDynamicValue(thread));
                } else
                    if (pcase_var.eql($SUPERIOR)) {
                        gt_map_arg_index(fn, constant, gt_vars.$gt_index_arg$.getDynamicValue(thread), gt_vars.$gt_pred$.getDynamicValue(thread), gt_vars.$gt_truth$.getDynamicValue(thread));
                    } else
                        if (pcase_var.eql($INFERIOR)) {
                            gt_map_arg_index(fn, constant, gt_vars.$gt_gather_arg$.getDynamicValue(thread), gt_vars.$gt_pred$.getDynamicValue(thread), gt_vars.$gt_truth$.getDynamicValue(thread));
                        } else
                            if (pcase_var.eql($ACCESSIBLE)) {
                                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($SUPERIOR))) {
                                    Errors.error($str8$invalid_gt_mode___a, $SUPERIOR);
                                }
                                final SubLObject _prev_bind_0_$80 = gt_vars.$gt_mode$.currentBinding(thread);
                                try {
                                    gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                                    gt_map_arg_index(fn, constant, gt_vars.$gt_index_arg$.getDynamicValue(thread), gt_vars.$gt_pred$.getDynamicValue(thread), gt_vars.$gt_truth$.getDynamicValue(thread));
                                } finally {
                                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$80, thread);
                                }
                                clrhash(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($INFERIOR))) {
                                    Errors.error($str8$invalid_gt_mode___a, $INFERIOR);
                                }
                                final SubLObject _prev_bind_0_$81 = gt_vars.$gt_mode$.currentBinding(thread);
                                try {
                                    gt_vars.$gt_mode$.bind($INFERIOR, thread);
                                    gt_map_arg_index(fn, constant, gt_vars.$gt_gather_arg$.getDynamicValue(thread), gt_vars.$gt_pred$.getDynamicValue(thread), gt_vars.$gt_truth$.getDynamicValue(thread));
                                } finally {
                                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$81, thread);
                                }
                            } else {
                                gt_utilities.gt_error(FIVE_INTEGER, $str4$illegal_value_of__gt_mode____s, gt_vars.$gt_mode$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }




        } finally {
            kb_gp_mapping.$mapping_arg_swap$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject gt_map_accessors_links_alt(SubLObject constant, SubLObject fn) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = gt_vars.$gt_accessors$.getDynamicValue(thread);
                SubLObject accessor = NIL;
                for (accessor = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , accessor = cdolist_list_var.first()) {
                    if (accessor.isCons()) {
                        {
                            SubLObject datum = accessor;
                            SubLObject current = datum;
                            {
                                SubLObject _prev_bind_0 = gt_vars.$gt_pred$.currentBinding(thread);
                                SubLObject _prev_bind_1 = gt_vars.$gt_index_arg$.currentBinding(thread);
                                SubLObject _prev_bind_2 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                                try {
                                    gt_vars.$gt_pred$.bind(NIL, thread);
                                    gt_vars.$gt_index_arg$.bind(NIL, thread);
                                    gt_vars.$gt_gather_arg$.bind(NIL, thread);
                                    destructuring_bind_must_consp(current, datum, $list_alt50);
                                    gt_vars.$gt_pred$.setDynamicValue(current.first(), thread);
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt50);
                                    gt_vars.$gt_index_arg$.setDynamicValue(current.first(), thread);
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt50);
                                    gt_vars.$gt_gather_arg$.setDynamicValue(current.first(), thread);
                                    current = current.rest();
                                    if (NIL == current) {
                                        com.cyc.cycjava.cycl.gt_search.gt_map_assertion_links(constant, fn);
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt50);
                                    }
                                } finally {
                                    gt_vars.$gt_gather_arg$.rebind(_prev_bind_2, thread);
                                    gt_vars.$gt_index_arg$.rebind(_prev_bind_1, thread);
                                    gt_vars.$gt_pred$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_map_accessors_links(final SubLObject constant, final SubLObject fn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = gt_vars.$gt_accessors$.getDynamicValue(thread);
        SubLObject accessor = NIL;
        accessor = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (accessor.isCons()) {
                SubLObject current;
                final SubLObject datum = current = accessor;
                final SubLObject _prev_bind_0 = gt_vars.$gt_pred$.currentBinding(thread);
                final SubLObject _prev_bind_2 = gt_vars.$gt_index_arg$.currentBinding(thread);
                final SubLObject _prev_bind_3 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                try {
                    gt_vars.$gt_pred$.bind(NIL, thread);
                    gt_vars.$gt_index_arg$.bind(NIL, thread);
                    gt_vars.$gt_gather_arg$.bind(NIL, thread);
                    destructuring_bind_must_consp(current, datum, $list50);
                    gt_vars.$gt_pred$.setDynamicValue(current.first(), thread);
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list50);
                    gt_vars.$gt_index_arg$.setDynamicValue(current.first(), thread);
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list50);
                    gt_vars.$gt_gather_arg$.setDynamicValue(current.first(), thread);
                    current = current.rest();
                    if (NIL == current) {
                        gt_map_assertion_links(constant, fn);
                    } else {
                        cdestructuring_bind_error(datum, $list50);
                    }
                } finally {
                    gt_vars.$gt_gather_arg$.rebind(_prev_bind_3, thread);
                    gt_vars.$gt_index_arg$.rebind(_prev_bind_2, thread);
                    gt_vars.$gt_pred$.rebind(_prev_bind_0, thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            accessor = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject gt_map_arg_index_alt(SubLObject function, SubLObject v_term, SubLObject arg, SubLObject pred, SubLObject truth) {
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        if (NIL != gt_vars.$gt_use_spec_predsP$.getDynamicValue(thread)) {
                            com.cyc.cycjava.cycl.gt_search.gt_gp_mapper(function, v_term, arg, pred);
                        } else {
                            com.cyc.cycjava.cycl.gt_search.gt_mapper(function, v_term, arg, pred, truth);
                        }
                    } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_map_arg_index(final SubLObject function, final SubLObject v_term, final SubLObject arg, final SubLObject pred, SubLObject truth) {
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
            if (NIL != gt_vars.$gt_use_spec_predsP$.getDynamicValue(thread)) {
                gt_gp_mapper(function, v_term, arg, pred);
            } else {
                gt_mapper(function, v_term, arg, pred, truth);
            }
        } finally {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject gt_gp_mapper_alt(SubLObject function, SubLObject v_term, SubLObject arg, SubLObject pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = pred_relevance_macros.$pred$.currentBinding(thread);
                        try {
                            pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_PRED, thread);
                            pred_relevance_macros.$pred$.bind(pred, thread);
                            {
                                SubLObject pred_var = NIL;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, arg, pred_var)) {
                                    {
                                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, arg, pred_var);
                                        SubLObject done_var = NIL;
                                        SubLObject token_var = NIL;
                                        while (NIL == done_var) {
                                            {
                                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                if (NIL != valid) {
                                                    {
                                                        SubLObject final_index_iterator = NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                            {
                                                                SubLObject done_var_82 = NIL;
                                                                SubLObject token_var_83 = NIL;
                                                                while (NIL == done_var_82) {
                                                                    {
                                                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_83);
                                                                        SubLObject valid_84 = makeBoolean(token_var_83 != assertion);
                                                                        if (NIL != valid_84) {
                                                                            {
                                                                                SubLObject _prev_bind_0_85 = gt_vars.$gt_link_support$.currentBinding(thread);
                                                                                try {
                                                                                    gt_vars.$gt_link_support$.bind(assertion, thread);
                                                                                    {
                                                                                        SubLObject node = com.cyc.cycjava.cycl.gt_search.gt_link_node(assertion);
                                                                                        gt_utilities.gt_gp_mapper_funcall(function, node);
                                                                                    }
                                                                                } finally {
                                                                                    gt_vars.$gt_link_support$.rebind(_prev_bind_0_85, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        done_var_82 = makeBoolean(NIL == valid_84);
                                                                    }
                                                                } 
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_86 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_86, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                done_var = makeBoolean(NIL == valid);
                                            }
                                        } 
                                    }
                                }
                            }
                        } finally {
                            pred_relevance_macros.$pred$.rebind(_prev_bind_1, thread);
                            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (NIL != kb_gp_mapping.dgaigp_binaryP(pred)) {
                        {
                            SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = pred_relevance_macros.$pred$.currentBinding(thread);
                            try {
                                pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_INVERSE, thread);
                                pred_relevance_macros.$pred$.bind(pred, thread);
                                {
                                    SubLObject pred_var = NIL;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, arity.binary_arg_swap(arg), pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, arity.binary_arg_swap(arg), pred_var);
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                {
                                                                    SubLObject done_var_87 = NIL;
                                                                    SubLObject token_var_88 = NIL;
                                                                    while (NIL == done_var_87) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_88);
                                                                            SubLObject valid_89 = makeBoolean(token_var_88 != assertion);
                                                                            if (NIL != valid_89) {
                                                                                {
                                                                                    SubLObject _prev_bind_0_90 = kb_gp_mapping.$mapping_arg_swap$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_91 = gt_vars.$gt_link_support$.currentBinding(thread);
                                                                                    try {
                                                                                        kb_gp_mapping.$mapping_arg_swap$.bind(makeBoolean(NIL == kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)), thread);
                                                                                        gt_vars.$gt_link_support$.bind(assertion, thread);
                                                                                        {
                                                                                            SubLObject node = com.cyc.cycjava.cycl.gt_search.gt_link_node(assertion);
                                                                                            gt_utilities.gt_gp_mapper_funcall(function, node);
                                                                                        }
                                                                                    } finally {
                                                                                        gt_vars.$gt_link_support$.rebind(_prev_bind_1_91, thread);
                                                                                        kb_gp_mapping.$mapping_arg_swap$.rebind(_prev_bind_0_90, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_87 = makeBoolean(NIL == valid_89);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_92 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_92, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                }
                                            } 
                                        }
                                    }
                                }
                            } finally {
                                pred_relevance_macros.$pred$.rebind(_prev_bind_1, thread);
                                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    if (NIL != gt_vars.gt_use_sksiP()) {
                        {
                            SubLObject node_var = pred;
                            SubLObject deck_type = (false) ? ((SubLObject) ($STACK)) : $QUEUE;
                            SubLObject recur_deck = deck.create_deck(deck_type);
                            SubLObject node_and_predicate_mode = NIL;
                            {
                                SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    {
                                        SubLObject tv_var = NIL;
                                        {
                                            SubLObject _prev_bind_0_93 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt60$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt60$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt60$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str_alt65$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt60$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_94 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_95 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                            {
                                                                SubLObject _prev_bind_0_96 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_97 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_98 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                    node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p());
                                                                    while (NIL != node_and_predicate_mode) {
                                                                        {
                                                                            SubLObject node_var_99 = node_and_predicate_mode.first();
                                                                            SubLObject predicate_mode = second(node_and_predicate_mode);
                                                                            SubLObject spec_pred = node_var_99;
                                                                            {
                                                                                SubLObject _prev_bind_0_100 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                                                    {
                                                                                        SubLObject inverse_modeP = predicate_mode;
                                                                                        SubLObject new_gather_argnum = (NIL != inverse_modeP) ? ((SubLObject) (gt_vars.$gt_index_arg$.getDynamicValue(thread))) : gt_vars.$gt_gather_arg$.getDynamicValue(thread);
                                                                                        SubLObject new_index_argnum = (NIL != inverse_modeP) ? ((SubLObject) (gt_vars.$gt_gather_arg$.getDynamicValue(thread))) : gt_vars.$gt_index_arg$.getDynamicValue(thread);
                                                                                        SubLObject cdolist_list_var = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_values(v_term, new_index_argnum, new_gather_argnum, spec_pred, $TRUE);
                                                                                        SubLObject gather_arg_mt_pair = NIL;
                                                                                        for (gather_arg_mt_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gather_arg_mt_pair = cdolist_list_var.first()) {
                                                                                            {
                                                                                                SubLObject datum = gather_arg_mt_pair;
                                                                                                SubLObject current = datum;
                                                                                                SubLObject link_node = NIL;
                                                                                                SubLObject link_mt = NIL;
                                                                                                destructuring_bind_must_consp(current, datum, $list_alt67);
                                                                                                link_node = current.first();
                                                                                                current = current.rest();
                                                                                                destructuring_bind_must_consp(current, datum, $list_alt67);
                                                                                                link_mt = current.first();
                                                                                                current = current.rest();
                                                                                                if (NIL == current) {
                                                                                                    {
                                                                                                        SubLObject link_formula = make_el_formula(pred, gt_vars.$gt_index_arg$.getDynamicValue(thread).numE(ONE_INTEGER) ? ((SubLObject) (list(v_term, link_node))) : list(link_node, v_term), UNPROVIDED);
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0_101 = gt_vars.$gt_link_support$.currentBinding(thread);
                                                                                                            try {
                                                                                                                gt_vars.$gt_link_support$.bind(sksi_sks_mapping_utilities.make_sksi_link_support(link_formula, link_mt), thread);
                                                                                                                gt_utilities.gt_gp_mapper_funcall(function, link_node);
                                                                                                            } finally {
                                                                                                                gt_vars.$gt_link_support$.rebind(_prev_bind_0_101, thread);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    cdestructuring_bind_error(datum, $list_alt67);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    {
                                                                                        SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                                                        SubLObject cdolist_list_var = accessible_modules;
                                                                                        SubLObject module_var = NIL;
                                                                                        for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                            {
                                                                                                SubLObject _prev_bind_0_102 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                SubLObject _prev_bind_1_103 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                    {
                                                                                                        SubLObject node = function_terms.naut_to_nart(node_var_99);
                                                                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                            {
                                                                                                                SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                if (NIL != d_link) {
                                                                                                                    {
                                                                                                                        SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                        if (NIL != mt_links) {
                                                                                                                            {
                                                                                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                    {
                                                                                                                                        SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                            {
                                                                                                                                                SubLObject _prev_bind_0_104 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                try {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                    {
                                                                                                                                                        SubLObject iteration_state_105 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_105)) {
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            {
                                                                                                                                                                SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_105);
                                                                                                                                                                SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject _prev_bind_0_106 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                        try {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                SubLObject cdolist_list_var_107 = new_list;
                                                                                                                                                                                SubLObject node_vars_link_node = NIL;
                                                                                                                                                                                for (node_vars_link_node = cdolist_list_var_107.first(); NIL != cdolist_list_var_107; cdolist_list_var_107 = cdolist_list_var_107.rest() , node_vars_link_node = cdolist_list_var_107.first()) {
                                                                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                        deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        } finally {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_106, thread);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                iteration_state_105 = dictionary_contents.do_dictionary_contents_next(iteration_state_105);
                                                                                                                                                            }
                                                                                                                                                        } 
                                                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_105);
                                                                                                                                                    }
                                                                                                                                                } finally {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_104, thread);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                    }
                                                                                                                                } 
                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt68$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                {
                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                    SubLObject cdolist_list_var_108 = new_list;
                                                                                                                    SubLObject generating_fn = NIL;
                                                                                                                    for (generating_fn = cdolist_list_var_108.first(); NIL != cdolist_list_var_108; cdolist_list_var_108 = cdolist_list_var_108.rest() , generating_fn = cdolist_list_var_108.first()) {
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_109 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                {
                                                                                                                                    SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                    SubLObject new_list_110 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                    SubLObject cdolist_list_var_111 = new_list_110;
                                                                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                                                                    for (node_vars_link_node = cdolist_list_var_111.first(); NIL != cdolist_list_var_111; cdolist_list_var_111 = cdolist_list_var_111.rest() , node_vars_link_node = cdolist_list_var_111.first()) {
                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                            deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } finally {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_109, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } finally {
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_103, thread);
                                                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_102, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_100, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        node_and_predicate_mode = deck.deck_pop(recur_deck);
                                                                    } 
                                                                } finally {
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_98, thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_97, thread);
                                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_96, thread);
                                                                }
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt69$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } finally {
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_95, thread);
                                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_94, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_93, thread);
                                            }
                                        }
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_gp_mapper(final SubLObject function, final SubLObject v_term, final SubLObject arg, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var = NIL;
        try {
            thread.throwStack.push($MAPPING_DONE);
            SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
            SubLObject _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding(thread);
            try {
                pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_PRED, thread);
                pred_relevance_macros.$pred$.bind(pred, thread);
                final SubLObject pred_var = NIL;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, arg, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, arg, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$82 = NIL;
                                final SubLObject token_var_$83 = NIL;
                                while (NIL == done_var_$82) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$83);
                                    final SubLObject valid_$84 = makeBoolean(!token_var_$83.eql(assertion));
                                    if ((NIL != valid_$84) && (NIL == assertion_utilities.excepted_assertionP(assertion, UNPROVIDED, UNPROVIDED))) {
                                        final SubLObject _prev_bind_0_$85 = gt_vars.$gt_link_support$.currentBinding(thread);
                                        try {
                                            gt_vars.$gt_link_support$.bind(assertion, thread);
                                            final SubLObject node = gt_link_node(assertion);
                                            gt_utilities.gt_gp_mapper_funcall(function, node);
                                        } finally {
                                            gt_vars.$gt_link_support$.rebind(_prev_bind_0_$85, thread);
                                        }
                                    }
                                    done_var_$82 = makeBoolean(NIL == valid_$84);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$86 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$86, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            } finally {
                pred_relevance_macros.$pred$.rebind(_prev_bind_2, thread);
                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
            }
            if (NIL != kb_gp_mapping.dgaigp_binaryP(pred)) {
                _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding(thread);
                try {
                    pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_INVERSE, thread);
                    pred_relevance_macros.$pred$.bind(pred, thread);
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, arity.binary_arg_swap(arg), pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, arity.binary_arg_swap(arg), pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$83 = NIL;
                                    final SubLObject token_var_$84 = NIL;
                                    while (NIL == done_var_$83) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$84);
                                        final SubLObject valid_$85 = makeBoolean(!token_var_$84.eql(assertion));
                                        if (NIL != valid_$85) {
                                            final SubLObject _prev_bind_0_$87 = kb_gp_mapping.$mapping_arg_swap$.currentBinding(thread);
                                            try {
                                                kb_gp_mapping.$mapping_arg_swap$.bind(makeBoolean(NIL == kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)), thread);
                                                if (NIL == assertion_utilities.excepted_assertionP(assertion, UNPROVIDED, UNPROVIDED)) {
                                                    final SubLObject _prev_bind_0_$88 = gt_vars.$gt_link_support$.currentBinding(thread);
                                                    try {
                                                        gt_vars.$gt_link_support$.bind(assertion, thread);
                                                        final SubLObject node2 = gt_link_node(assertion);
                                                        gt_utilities.gt_gp_mapper_funcall(function, node2);
                                                    } finally {
                                                        gt_vars.$gt_link_support$.rebind(_prev_bind_0_$88, thread);
                                                    }
                                                }
                                            } finally {
                                                kb_gp_mapping.$mapping_arg_swap$.rebind(_prev_bind_0_$87, thread);
                                            }
                                        }
                                        done_var_$83 = makeBoolean(NIL == valid_$85);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$89 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$89, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } finally {
                    pred_relevance_macros.$pred$.rebind(_prev_bind_2, thread);
                    pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
                }
            }
            if (NIL != gt_vars.gt_use_sksiP()) {
                final SubLObject deck_type = $QUEUE;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = NIL;
                final SubLObject _prev_bind_3 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$90 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str60$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str60$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str60$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str65$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str60$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$91 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$95 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_7 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$92 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$96 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$98 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(pred, UNPROVIDED);
                                        for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                            final SubLObject node_var_$99 = node_and_predicate_mode.first();
                                            final SubLObject predicate_mode = second(node_and_predicate_mode);
                                            final SubLObject spec_pred = node_var_$99;
                                            final SubLObject _prev_bind_0_$93 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                final SubLObject inverse_modeP = predicate_mode;
                                                final SubLObject new_gather_argnum = (NIL != inverse_modeP) ? gt_vars.$gt_index_arg$.getDynamicValue(thread) : gt_vars.$gt_gather_arg$.getDynamicValue(thread);
                                                final SubLObject new_index_argnum = (NIL != inverse_modeP) ? gt_vars.$gt_gather_arg$.getDynamicValue(thread) : gt_vars.$gt_index_arg$.getDynamicValue(thread);
                                                SubLObject cdolist_list_var = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_values(v_term, new_index_argnum, new_gather_argnum, spec_pred, $TRUE);
                                                SubLObject gather_arg_mt_pair = NIL;
                                                gather_arg_mt_pair = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    SubLObject current;
                                                    final SubLObject datum = current = gather_arg_mt_pair;
                                                    SubLObject link_node = NIL;
                                                    SubLObject link_mt = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list67);
                                                    link_node = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list67);
                                                    link_mt = current.first();
                                                    current = current.rest();
                                                    if (NIL == current) {
                                                        final SubLObject link_formula = make_el_formula(pred, gt_vars.$gt_index_arg$.getDynamicValue(thread).numE(ONE_INTEGER) ? list(v_term, link_node) : list(link_node, v_term), UNPROVIDED);
                                                        final SubLObject _prev_bind_0_$94 = gt_vars.$gt_link_support$.currentBinding(thread);
                                                        try {
                                                            gt_vars.$gt_link_support$.bind(sksi_sks_mapping_utilities.make_sksi_link_support(link_formula, link_mt), thread);
                                                            gt_utilities.gt_gp_mapper_funcall(function, link_node);
                                                        } finally {
                                                            gt_vars.$gt_link_support$.rebind(_prev_bind_0_$94, thread);
                                                        }
                                                    } else {
                                                        cdestructuring_bind_error(datum, $list67);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    gather_arg_mt_pair = cdolist_list_var.first();
                                                } 
                                                SubLObject cdolist_list_var2;
                                                final SubLObject accessible_modules = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                SubLObject module_var = NIL;
                                                module_var = cdolist_list_var2.first();
                                                while (NIL != cdolist_list_var2) {
                                                    final SubLObject _prev_bind_0_$95 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$97 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node3 = function_terms.naut_to_nart(node_var_$99);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node3)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node3, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
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
                                                                            final SubLObject _prev_bind_0_$96 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$105;
                                                                                for (iteration_state_$105 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$105); iteration_state_$105 = dictionary_contents.do_dictionary_contents_next(iteration_state_$105)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$105);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$97 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    SubLObject csome_list_var = sol;
                                                                                                    SubLObject node_vars_link_node2 = NIL;
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                    while (NIL != csome_list_var) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                            deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str68$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$97, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$105);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$96, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str69$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node3, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$107;
                                                                final SubLObject new_list = cdolist_list_var_$107 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn = NIL;
                                                                generating_fn = cdolist_list_var_$107.first();
                                                                while (NIL != cdolist_list_var_$107) {
                                                                    final SubLObject _prev_bind_0_$98 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        final SubLObject sol2;
                                                                        final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node3);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                            SubLObject basis_object2;
                                                                            SubLObject state2;
                                                                            SubLObject node_vars_link_node3;
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                    deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol2.isList()) {
                                                                                SubLObject csome_list_var2 = sol2;
                                                                                SubLObject node_vars_link_node4 = NIL;
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                                while (NIL != csome_list_var2) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                        deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                    }
                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str68$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$98, thread);
                                                                    }
                                                                    cdolist_list_var_$107 = cdolist_list_var_$107.rest();
                                                                    generating_fn = cdolist_list_var_$107.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$97, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$95, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var = cdolist_list_var2.first();
                                                } 
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$93, thread);
                                            }
                                        }
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$98, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$96, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$92, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str70$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_7, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_6, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$95, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$91, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$90, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$99 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values3 = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values3);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$99, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_3, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }

    public static final SubLObject gt_mapper_alt(SubLObject function, SubLObject v_term, SubLObject arg, SubLObject pred, SubLObject truth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var = NIL;
                try {
                    com.cyc.cycjava.cycl.gt_search.gt_map_gaf_arg_index_link_nodes(function, v_term, arg, pred, truth, UNPROVIDED);
                    {
                        SubLObject cdolist_list_var = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_values(v_term, gt_vars.$gt_index_arg$.getDynamicValue(thread), gt_vars.$gt_gather_arg$.getDynamicValue(thread), pred, $TRUE);
                        SubLObject gather_arg_mt_pair = NIL;
                        for (gather_arg_mt_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gather_arg_mt_pair = cdolist_list_var.first()) {
                            {
                                SubLObject datum = gather_arg_mt_pair;
                                SubLObject current = datum;
                                SubLObject link_node = NIL;
                                SubLObject link_mt = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt67);
                                link_node = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt67);
                                link_mt = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    {
                                        SubLObject link_formula = make_el_formula(pred, gt_vars.$gt_index_arg$.getDynamicValue(thread).numE(ONE_INTEGER) ? ((SubLObject) (list(v_term, link_node))) : list(link_node, v_term), UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0 = gt_vars.$gt_link_support$.currentBinding(thread);
                                            try {
                                                gt_vars.$gt_link_support$.bind(sksi_sks_mapping_utilities.make_sksi_link_support(link_formula, link_mt), thread);
                                                funcall(function, link_node);
                                            } finally {
                                                gt_vars.$gt_link_support$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt67);
                                }
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_mapper(final SubLObject function, final SubLObject v_term, final SubLObject arg, final SubLObject pred, final SubLObject truth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var = NIL;
        try {
            thread.throwStack.push($MAPPING_DONE);
            gt_map_gaf_arg_index_link_nodes(function, v_term, arg, pred, truth, UNPROVIDED);
            SubLObject cdolist_list_var = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_values(v_term, gt_vars.$gt_index_arg$.getDynamicValue(thread), gt_vars.$gt_gather_arg$.getDynamicValue(thread), pred, $TRUE);
            SubLObject gather_arg_mt_pair = NIL;
            gather_arg_mt_pair = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = gather_arg_mt_pair;
                SubLObject link_node = NIL;
                SubLObject link_mt = NIL;
                destructuring_bind_must_consp(current, datum, $list67);
                link_node = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list67);
                link_mt = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject link_formula = make_el_formula(pred, gt_vars.$gt_index_arg$.getDynamicValue(thread).numE(ONE_INTEGER) ? list(v_term, link_node) : list(link_node, v_term), UNPROVIDED);
                    final SubLObject _prev_bind_0 = gt_vars.$gt_link_support$.currentBinding(thread);
                    try {
                        gt_vars.$gt_link_support$.bind(sksi_sks_mapping_utilities.make_sksi_link_support(link_formula, link_mt), thread);
                        funcall(function, link_node);
                    } finally {
                        gt_vars.$gt_link_support$.rebind(_prev_bind_0, thread);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list67);
                }
                cdolist_list_var = cdolist_list_var.rest();
                gather_arg_mt_pair = cdolist_list_var.first();
            } 
        } catch (final Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }

    /**
     * Apply FUNCTION to each gaf assertion mentioning TERM in position ARGNUM
     * with predicate PRED and truth TRUTH.  If TRUTH is NIL, assertions are
     * not filtered based on truth.  If PRED is NIL, predicate relevance is
     * established from outside (default is all predicates are relevant).
     */
    @LispMethod(comment = "Apply FUNCTION to each gaf assertion mentioning TERM in position ARGNUM\r\nwith predicate PRED and truth TRUTH.  If TRUTH is NIL, assertions are\r\nnot filtered based on truth.  If PRED is NIL, predicate relevance is\r\nestablished from outside (default is all predicates are relevant).\nApply FUNCTION to each gaf assertion mentioning TERM in position ARGNUM\nwith predicate PRED and truth TRUTH.  If TRUTH is NIL, assertions are\nnot filtered based on truth.  If PRED is NIL, predicate relevance is\nestablished from outside (default is all predicates are relevant).")
    public static final SubLObject gt_map_gaf_arg_index_link_nodes_alt(SubLObject function, SubLObject v_term, SubLObject argnum, SubLObject pred, SubLObject truth, SubLObject mt) {
        if (pred == UNPROVIDED) {
            pred = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(function, FUNCTION_SPEC_P);
            SubLTrampolineFile.checkType(argnum, POSITIVE_INTEGER_P);
            {
                SubLObject catch_var = NIL;
                try {
                    {
                        SubLObject mt_var = mt;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                                if ((NIL != pred) && (NIL != truth)) {
                                    {
                                        SubLObject pred_var = pred;
                                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                            {
                                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                                SubLObject done_var = NIL;
                                                SubLObject token_var = NIL;
                                                while (NIL == done_var) {
                                                    {
                                                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                        SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                        if (NIL != valid) {
                                                            {
                                                                SubLObject final_index_iterator = NIL;
                                                                try {
                                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                                                    {
                                                                        SubLObject done_var_112 = NIL;
                                                                        SubLObject token_var_113 = NIL;
                                                                        while (NIL == done_var_112) {
                                                                            {
                                                                                SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_113);
                                                                                SubLObject valid_114 = makeBoolean(token_var_113 != ass);
                                                                                if (NIL != valid_114) {
                                                                                    {
                                                                                        SubLObject _prev_bind_0_115 = gt_vars.$gt_link_support$.currentBinding(thread);
                                                                                        try {
                                                                                            gt_vars.$gt_link_support$.bind(ass, thread);
                                                                                            {
                                                                                                SubLObject node = com.cyc.cycjava.cycl.gt_search.gt_link_node(ass);
                                                                                                funcall(function, node);
                                                                                            }
                                                                                        } finally {
                                                                                            gt_vars.$gt_link_support$.rebind(_prev_bind_0_115, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                done_var_112 = makeBoolean(NIL == valid_114);
                                                                            }
                                                                        } 
                                                                    }
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_116 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            if (NIL != final_index_iterator) {
                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                            }
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_116, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        done_var = makeBoolean(NIL == valid);
                                                    }
                                                } 
                                            }
                                        }
                                    }
                                } else {
                                    if ((NIL != pred) && (NIL == truth)) {
                                        {
                                            SubLObject pred_var = pred;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                                    SubLObject done_var = NIL;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                                        {
                                                                            SubLObject done_var_117 = NIL;
                                                                            SubLObject token_var_118 = NIL;
                                                                            while (NIL == done_var_117) {
                                                                                {
                                                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_118);
                                                                                    SubLObject valid_119 = makeBoolean(token_var_118 != ass);
                                                                                    if (NIL != valid_119) {
                                                                                        {
                                                                                            SubLObject _prev_bind_0_120 = gt_vars.$gt_link_support$.currentBinding(thread);
                                                                                            try {
                                                                                                gt_vars.$gt_link_support$.bind(ass, thread);
                                                                                                {
                                                                                                    SubLObject node = com.cyc.cycjava.cycl.gt_search.gt_link_node(ass);
                                                                                                    funcall(function, node);
                                                                                                }
                                                                                            } finally {
                                                                                                gt_vars.$gt_link_support$.rebind(_prev_bind_0_120, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    done_var_117 = makeBoolean(NIL == valid_119);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0_121 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_121, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean(NIL == valid);
                                                        }
                                                    } 
                                                }
                                            }
                                        }
                                    } else {
                                        if ((NIL == pred) && (NIL != truth)) {
                                            {
                                                SubLObject pred_var = NIL;
                                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                                    {
                                                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                                        SubLObject done_var = NIL;
                                                        SubLObject token_var = NIL;
                                                        while (NIL == done_var) {
                                                            {
                                                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                                if (NIL != valid) {
                                                                    {
                                                                        SubLObject final_index_iterator = NIL;
                                                                        try {
                                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                                                            {
                                                                                SubLObject done_var_122 = NIL;
                                                                                SubLObject token_var_123 = NIL;
                                                                                while (NIL == done_var_122) {
                                                                                    {
                                                                                        SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_123);
                                                                                        SubLObject valid_124 = makeBoolean(token_var_123 != ass);
                                                                                        if (NIL != valid_124) {
                                                                                            {
                                                                                                SubLObject _prev_bind_0_125 = gt_vars.$gt_link_support$.currentBinding(thread);
                                                                                                try {
                                                                                                    gt_vars.$gt_link_support$.bind(ass, thread);
                                                                                                    {
                                                                                                        SubLObject node = com.cyc.cycjava.cycl.gt_search.gt_link_node(ass);
                                                                                                        funcall(function, node);
                                                                                                    }
                                                                                                } finally {
                                                                                                    gt_vars.$gt_link_support$.rebind(_prev_bind_0_125, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        done_var_122 = makeBoolean(NIL == valid_124);
                                                                                    }
                                                                                } 
                                                                            }
                                                                        } finally {
                                                                            {
                                                                                SubLObject _prev_bind_0_126 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                try {
                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                    if (NIL != final_index_iterator) {
                                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                    }
                                                                                } finally {
                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_126, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                done_var = makeBoolean(NIL == valid);
                                                            }
                                                        } 
                                                    }
                                                }
                                            }
                                        } else {
                                            if ((NIL == pred) && (NIL == truth)) {
                                                {
                                                    SubLObject pred_var = NIL;
                                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                                        {
                                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                                            SubLObject done_var = NIL;
                                                            SubLObject token_var = NIL;
                                                            while (NIL == done_var) {
                                                                {
                                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                                    if (NIL != valid) {
                                                                        {
                                                                            SubLObject final_index_iterator = NIL;
                                                                            try {
                                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                                                {
                                                                                    SubLObject done_var_127 = NIL;
                                                                                    SubLObject token_var_128 = NIL;
                                                                                    while (NIL == done_var_127) {
                                                                                        {
                                                                                            SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_128);
                                                                                            SubLObject valid_129 = makeBoolean(token_var_128 != ass);
                                                                                            if (NIL != valid_129) {
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_130 = gt_vars.$gt_link_support$.currentBinding(thread);
                                                                                                    try {
                                                                                                        gt_vars.$gt_link_support$.bind(ass, thread);
                                                                                                        {
                                                                                                            SubLObject node = com.cyc.cycjava.cycl.gt_search.gt_link_node(ass);
                                                                                                            funcall(function, node);
                                                                                                        }
                                                                                                    } finally {
                                                                                                        gt_vars.$gt_link_support$.rebind(_prev_bind_0_130, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            done_var_127 = makeBoolean(NIL == valid_129);
                                                                                        }
                                                                                    } 
                                                                                }
                                                                            } finally {
                                                                                {
                                                                                    SubLObject _prev_bind_0_131 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                    try {
                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                        if (NIL != final_index_iterator) {
                                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                        }
                                                                                    } finally {
                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_131, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var = makeBoolean(NIL == valid);
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
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Apply FUNCTION to each gaf assertion mentioning TERM in position ARGNUM\r\nwith predicate PRED and truth TRUTH.  If TRUTH is NIL, assertions are\r\nnot filtered based on truth.  If PRED is NIL, predicate relevance is\r\nestablished from outside (default is all predicates are relevant).\nApply FUNCTION to each gaf assertion mentioning TERM in position ARGNUM\nwith predicate PRED and truth TRUTH.  If TRUTH is NIL, assertions are\nnot filtered based on truth.  If PRED is NIL, predicate relevance is\nestablished from outside (default is all predicates are relevant).")
    public static SubLObject gt_map_gaf_arg_index_link_nodes(final SubLObject function, final SubLObject v_term, final SubLObject argnum, SubLObject pred, SubLObject truth, SubLObject mt) {
        if (pred == UNPROVIDED) {
            pred = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != function_spec_p(function) : "! function_spec_p(function) " + ("Types.function_spec_p(function) " + "CommonSymbols.NIL != Types.function_spec_p(function) ") + function;
        assert NIL != subl_promotions.positive_integer_p(argnum) : "! subl_promotions.positive_integer_p(argnum) " + ("subl_promotions.positive_integer_p(argnum) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(argnum) ") + argnum;
        SubLObject catch_var = NIL;
        try {
            thread.throwStack.push($MAPPING_DONE);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                if ((NIL != pred) && (NIL != truth)) {
                    final SubLObject pred_var = pred;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                    SubLObject done_var_$110 = NIL;
                                    final SubLObject token_var_$111 = NIL;
                                    while (NIL == done_var_$110) {
                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$111);
                                        final SubLObject valid_$112 = makeBoolean(!token_var_$111.eql(ass));
                                        if (NIL != valid_$112) {
                                            final SubLObject _prev_bind_0_$113 = gt_vars.$gt_link_support$.currentBinding(thread);
                                            try {
                                                gt_vars.$gt_link_support$.bind(ass, thread);
                                                final SubLObject node = gt_link_node(ass);
                                                funcall(function, node);
                                            } finally {
                                                gt_vars.$gt_link_support$.rebind(_prev_bind_0_$113, thread);
                                            }
                                        }
                                        done_var_$110 = makeBoolean(NIL == valid_$112);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$114 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$114, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else
                    if ((NIL != pred) && (NIL == truth)) {
                        final SubLObject pred_var = pred;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        SubLObject done_var_$111 = NIL;
                                        final SubLObject token_var_$112 = NIL;
                                        while (NIL == done_var_$111) {
                                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$112);
                                            final SubLObject valid_$113 = makeBoolean(!token_var_$112.eql(ass));
                                            if (NIL != valid_$113) {
                                                final SubLObject _prev_bind_0_$115 = gt_vars.$gt_link_support$.currentBinding(thread);
                                                try {
                                                    gt_vars.$gt_link_support$.bind(ass, thread);
                                                    final SubLObject node = gt_link_node(ass);
                                                    funcall(function, node);
                                                } finally {
                                                    gt_vars.$gt_link_support$.rebind(_prev_bind_0_$115, thread);
                                                }
                                            }
                                            done_var_$111 = makeBoolean(NIL == valid_$113);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$116 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values2 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values2);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$116, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }
                    } else
                        if ((NIL == pred) && (NIL != truth)) {
                            final SubLObject pred_var = NIL;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                SubLObject done_var = NIL;
                                final SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                    if (NIL != valid) {
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                            SubLObject done_var_$112 = NIL;
                                            final SubLObject token_var_$113 = NIL;
                                            while (NIL == done_var_$112) {
                                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$113);
                                                final SubLObject valid_$114 = makeBoolean(!token_var_$113.eql(ass));
                                                if (NIL != valid_$114) {
                                                    final SubLObject _prev_bind_0_$117 = gt_vars.$gt_link_support$.currentBinding(thread);
                                                    try {
                                                        gt_vars.$gt_link_support$.bind(ass, thread);
                                                        final SubLObject node = gt_link_node(ass);
                                                        funcall(function, node);
                                                    } finally {
                                                        gt_vars.$gt_link_support$.rebind(_prev_bind_0_$117, thread);
                                                    }
                                                }
                                                done_var_$112 = makeBoolean(NIL == valid_$114);
                                            } 
                                        } finally {
                                            final SubLObject _prev_bind_0_$118 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values3 = getValuesAsVector();
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                restoreValuesFromVector(_values3);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$118, thread);
                                            }
                                        }
                                    }
                                    done_var = makeBoolean(NIL == valid);
                                } 
                            }
                        } else
                            if ((NIL == pred) && (NIL == truth)) {
                                final SubLObject pred_var = NIL;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                    SubLObject done_var = NIL;
                                    final SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                        if (NIL != valid) {
                                            SubLObject final_index_iterator = NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                SubLObject done_var_$113 = NIL;
                                                final SubLObject token_var_$114 = NIL;
                                                while (NIL == done_var_$113) {
                                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$114);
                                                    final SubLObject valid_$115 = makeBoolean(!token_var_$114.eql(ass));
                                                    if (NIL != valid_$115) {
                                                        final SubLObject _prev_bind_0_$119 = gt_vars.$gt_link_support$.currentBinding(thread);
                                                        try {
                                                            gt_vars.$gt_link_support$.bind(ass, thread);
                                                            final SubLObject node = gt_link_node(ass);
                                                            funcall(function, node);
                                                        } finally {
                                                            gt_vars.$gt_link_support$.rebind(_prev_bind_0_$119, thread);
                                                        }
                                                    }
                                                    done_var_$113 = makeBoolean(NIL == valid_$115);
                                                } 
                                            } finally {
                                                final SubLObject _prev_bind_0_$120 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values4 = getValuesAsVector();
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                    restoreValuesFromVector(_values4);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$120, thread);
                                                }
                                            }
                                        }
                                        done_var = makeBoolean(NIL == valid);
                                    } 
                                }
                            }



            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }/**
     * Apply FUNCTION to each gaf assertion mentioning TERM in position ARGNUM
     * with predicate PRED and truth TRUTH.  If TRUTH is NIL, assertions are
     * not filtered based on truth.  If PRED is NIL, predicate relevance is
     * established from outside (default is all predicates are relevant).
     */


    public static final SubLObject gt_mark_as_searched_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != gt_utilities.gt_term_p(node)) {
                sethash(node, gt_vars.$gt_marking_table$.getDynamicValue(thread), T);
            }
            return NIL;
        }
    }

    public static SubLObject gt_mark_as_searched(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != gt_utilities.gt_term_p(node)) {
            sethash(node, gt_vars.$gt_marking_table$.getDynamicValue(thread), T);
        }
        return NIL;
    }

    public static final SubLObject gt_mark_as_unsearched_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != gt_utilities.gt_term_p(node)) {
                sethash(node, gt_vars.$gt_marking_table$.getDynamicValue(thread), NIL);
            }
            return NIL;
        }
    }

    public static SubLObject gt_mark_as_unsearched(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != gt_utilities.gt_term_p(node)) {
            sethash(node, gt_vars.$gt_marking_table$.getDynamicValue(thread), NIL);
        }
        return NIL;
    }

    public static final SubLObject gt_searchedP_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != gt_utilities.gt_term_p(node)) {
                return gethash(node, gt_vars.$gt_marking_table$.getDynamicValue(thread), UNPROVIDED);
            }
            return NIL;
        }
    }

    public static SubLObject gt_searchedP(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != gt_utilities.gt_term_p(node)) {
            return gethash(node, gt_vars.$gt_marking_table$.getDynamicValue(thread), UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject gt_mark_as_searched_by_alt(SubLObject node, SubLObject searcher) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != gt_utilities.gt_term_p(node)) {
                {
                    SubLObject list_in_there = NIL;
                    list_in_there = gethash(node, gt_vars.$gt_marking_table$.getDynamicValue(thread), UNPROVIDED);
                    sethash(node, gt_vars.$gt_marking_table$.getDynamicValue(thread), adjoin(searcher, list_in_there, UNPROVIDED, UNPROVIDED));
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_mark_as_searched_by(final SubLObject node, final SubLObject searcher) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != gt_utilities.gt_term_p(node)) {
            SubLObject list_in_there = NIL;
            list_in_there = gethash(node, gt_vars.$gt_marking_table$.getDynamicValue(thread), UNPROVIDED);
            sethash(node, gt_vars.$gt_marking_table$.getDynamicValue(thread), adjoin(searcher, list_in_there, UNPROVIDED, UNPROVIDED));
        }
        return NIL;
    }

    public static final SubLObject gt_mark_as_searched_with_alt(SubLObject node, SubLObject marking) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != gt_utilities.gt_term_p(node)) {
                sethash(node, gt_vars.$gt_marking_table$.getDynamicValue(thread), marking);
            }
            return NIL;
        }
    }

    public static SubLObject gt_mark_as_searched_with(final SubLObject node, final SubLObject marking) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != gt_utilities.gt_term_p(node)) {
            sethash(node, gt_vars.$gt_marking_table$.getDynamicValue(thread), marking);
        }
        return NIL;
    }

    public static final SubLObject gt_searched_byP_alt(SubLObject node, SubLObject searcher, SubLObject test) {
        if (test == UNPROVIDED) {
            test = EQL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != gt_utilities.gt_term_p(node)) {
                return subl_promotions.memberP(searcher, gethash(node, gt_vars.$gt_marking_table$.getDynamicValue(thread), UNPROVIDED), test, UNPROVIDED);
            }
            return NIL;
        }
    }

    public static SubLObject gt_searched_byP(final SubLObject node, final SubLObject searcher, SubLObject test) {
        if (test == UNPROVIDED) {
            test = EQL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != gt_utilities.gt_term_p(node)) {
            return subl_promotions.memberP(searcher, gethash(node, gt_vars.$gt_marking_table$.getDynamicValue(thread), UNPROVIDED), test, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject gt_searched_by_allP_alt(SubLObject fort, SubLObject searchers, SubLObject test) {
        if (test == UNPROVIDED) {
            test = EQL;
        }
        {
            SubLObject failP = NIL;
            if (NIL == failP) {
                {
                    SubLObject csome_list_var = searchers;
                    SubLObject searcher = NIL;
                    for (searcher = csome_list_var.first(); !((NIL != failP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , searcher = csome_list_var.first()) {
                        failP = makeBoolean(NIL == com.cyc.cycjava.cycl.gt_search.gt_searched_byP(fort, searcher, test));
                    }
                }
            }
            return makeBoolean(NIL == failP);
        }
    }

    public static SubLObject gt_searched_by_allP(final SubLObject fort, final SubLObject searchers, SubLObject test) {
        if (test == UNPROVIDED) {
            test = EQL;
        }
        SubLObject failP = NIL;
        if (NIL == failP) {
            SubLObject csome_list_var;
            SubLObject searcher;
            for (csome_list_var = searchers, searcher = NIL, searcher = csome_list_var.first(); (NIL == failP) && (NIL != csome_list_var); failP = makeBoolean(NIL == gt_searched_byP(fort, searcher, test)) , csome_list_var = csome_list_var.rest() , searcher = csome_list_var.first()) {
            }
        }
        return makeBoolean(NIL == failP);
    }

    public static final SubLObject gt_searched_in_target_spaceP_alt(SubLObject node, SubLObject target_space) {
        if (target_space == UNPROVIDED) {
            target_space = gt_vars.$gt_target_marking_table$.getDynamicValue();
        }
        if (NIL != gt_utilities.gt_term_p(node)) {
            return gethash(node, target_space, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject gt_searched_in_target_spaceP(final SubLObject node, SubLObject target_space) {
        if (target_space == UNPROVIDED) {
            target_space = gt_vars.$gt_target_marking_table$.getDynamicValue();
        }
        if (NIL != gt_utilities.gt_term_p(node)) {
            return gethash(node, target_space, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject gt_mark_as_unsearched_in_space_alt(SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = gt_vars.$gt_marking_table$.getDynamicValue();
        }
        if (NIL != gt_utilities.gt_term_p(node)) {
            remhash(node, space);
        }
        return NIL;
    }

    public static SubLObject gt_mark_as_unsearched_in_space(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = gt_vars.$gt_marking_table$.getDynamicValue();
        }
        if (NIL != gt_utilities.gt_term_p(node)) {
            remhash(node, space);
        }
        return NIL;
    }

    public static final SubLObject gt_mark_as_searched_in_target_space_alt(SubLObject node, SubLObject value, SubLObject target_space) {
        if (NIL != gt_utilities.gt_term_p(node)) {
            sethash(node, target_space, value);
        }
        return NIL;
    }

    public static SubLObject gt_mark_as_searched_in_target_space(final SubLObject node, final SubLObject value, final SubLObject target_space) {
        if (NIL != gt_utilities.gt_term_p(node)) {
            sethash(node, target_space, value);
        }
        return NIL;
    }

    public static final SubLObject gt_mark_link_node_as_searched_alt(SubLObject assertion) {
        {
            SubLObject node = com.cyc.cycjava.cycl.gt_search.gt_link_node(assertion);
            if (NIL != gt_utilities.gt_term_p(node)) {
                if (NIL == com.cyc.cycjava.cycl.gt_search.gt_searchedP(node)) {
                    com.cyc.cycjava.cycl.gt_search.gt_mark_as_searched(node);
                    gt_utilities.gt_step_fn_funcall(node);
                }
            }
        }
        return NIL;
    }

    public static SubLObject gt_mark_link_node_as_searched(final SubLObject assertion) {
        final SubLObject node = gt_link_node(assertion);
        if ((NIL != gt_utilities.gt_term_p(node)) && (NIL == gt_searchedP(node))) {
            gt_mark_as_searched(node);
            gt_utilities.gt_step_fn_funcall(node);
        }
        return NIL;
    }

    public static final SubLObject gt_mark_as_searched_and_step_alt(SubLObject node) {
        if (NIL != gt_utilities.gt_term_p(node)) {
            if (NIL == com.cyc.cycjava.cycl.gt_search.gt_searchedP(node)) {
                com.cyc.cycjava.cycl.gt_search.gt_mark_as_searched(node);
                gt_utilities.gt_step_fn_funcall(node);
            }
        }
        return NIL;
    }

    public static SubLObject gt_mark_as_searched_and_step(final SubLObject node) {
        if ((NIL != gt_utilities.gt_term_p(node)) && (NIL == gt_searchedP(node))) {
            gt_mark_as_searched(node);
            gt_utilities.gt_step_fn_funcall(node);
        }
        return NIL;
    }

    public static final SubLObject gt_mark_link_node_as_unsearched_alt(SubLObject assertion) {
        {
            SubLObject node = com.cyc.cycjava.cycl.gt_search.gt_link_node(assertion);
            if (NIL != gt_utilities.gt_term_p(node)) {
                if (NIL != com.cyc.cycjava.cycl.gt_search.gt_searchedP(node)) {
                    com.cyc.cycjava.cycl.gt_search.gt_mark_as_unsearched(node);
                    gt_utilities.gt_step_fn_funcall(node);
                }
            }
        }
        return NIL;
    }

    public static SubLObject gt_mark_link_node_as_unsearched(final SubLObject assertion) {
        final SubLObject node = gt_link_node(assertion);
        if ((NIL != gt_utilities.gt_term_p(node)) && (NIL != gt_searchedP(node))) {
            gt_mark_as_unsearched(node);
            gt_utilities.gt_step_fn_funcall(node);
        }
        return NIL;
    }

    public static final SubLObject gt_mark_as_unsearched_and_step_alt(SubLObject node) {
        if (NIL != gt_utilities.gt_term_p(node)) {
            if (NIL != com.cyc.cycjava.cycl.gt_search.gt_searchedP(node)) {
                com.cyc.cycjava.cycl.gt_search.gt_mark_as_unsearched(node);
                gt_utilities.gt_step_fn_funcall(node);
            }
        }
        return NIL;
    }

    public static SubLObject gt_mark_as_unsearched_and_step(final SubLObject node) {
        if ((NIL != gt_utilities.gt_term_p(node)) && (NIL != gt_searchedP(node))) {
            gt_mark_as_unsearched(node);
            gt_utilities.gt_step_fn_funcall(node);
        }
        return NIL;
    }

    public static final SubLObject gt_mark_link_node_as_searched_by_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject node = com.cyc.cycjava.cycl.gt_search.gt_link_node(assertion);
                if (NIL != gt_utilities.gt_term_p(node)) {
                    if (NIL == com.cyc.cycjava.cycl.gt_search.gt_searched_byP(node, gt_vars.$gt_searcher$.getDynamicValue(thread), UNPROVIDED)) {
                        com.cyc.cycjava.cycl.gt_search.gt_mark_as_searched_by(node, gt_vars.$gt_searcher$.getDynamicValue(thread));
                        gt_utilities.gt_step_fn_funcall(node);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_mark_link_node_as_searched_by(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject node = gt_link_node(assertion);
        if ((NIL != gt_utilities.gt_term_p(node)) && (NIL == gt_searched_byP(node, gt_vars.$gt_searcher$.getDynamicValue(thread), UNPROVIDED))) {
            gt_mark_as_searched_by(node, gt_vars.$gt_searcher$.getDynamicValue(thread));
            gt_utilities.gt_step_fn_funcall(node);
        }
        return NIL;
    }

    public static final SubLObject gt_mark_as_searched_by_and_step_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != gt_utilities.gt_term_p(node)) {
                if (NIL == com.cyc.cycjava.cycl.gt_search.gt_searched_byP(node, gt_vars.$gt_searcher$.getDynamicValue(thread), UNPROVIDED)) {
                    com.cyc.cycjava.cycl.gt_search.gt_mark_as_searched_by(node, gt_vars.$gt_searcher$.getDynamicValue(thread));
                    gt_utilities.gt_step_fn_funcall(node);
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_mark_as_searched_by_and_step(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != gt_utilities.gt_term_p(node)) && (NIL == gt_searched_byP(node, gt_vars.$gt_searcher$.getDynamicValue(thread), UNPROVIDED))) {
            gt_mark_as_searched_by(node, gt_vars.$gt_searcher$.getDynamicValue(thread));
            gt_utilities.gt_step_fn_funcall(node);
        }
        return NIL;
    }

    public static final SubLObject gt_mark_all_superiors_as_searched_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == gt_utilities.gt_modeP($SUPERIOR)) {
                    Errors.error($str_alt8$invalid_gt_mode___a, $SUPERIOR);
                }
            }
            {
                SubLObject _prev_bind_0 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                    com.cyc.cycjava.cycl.gt_search.gt_mark_all_accessed_as_searched(node);
                } finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_mark_all_superiors_as_searched(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($SUPERIOR))) {
            Errors.error($str8$invalid_gt_mode___a, $SUPERIOR);
        }
        final SubLObject _prev_bind_0 = gt_vars.$gt_mode$.currentBinding(thread);
        try {
            gt_vars.$gt_mode$.bind($SUPERIOR, thread);
            gt_mark_all_accessed_as_searched(node);
        } finally {
            gt_vars.$gt_mode$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject gt_mark_proper_all_superiors_as_searched_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == gt_utilities.gt_modeP($SUPERIOR)) {
                    Errors.error($str_alt8$invalid_gt_mode___a, $SUPERIOR);
                }
            }
            {
                SubLObject _prev_bind_0 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                    com.cyc.cycjava.cycl.gt_search.gt_mark_proper_all_accessed_as_searched(node);
                } finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_mark_proper_all_superiors_as_searched(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($SUPERIOR))) {
            Errors.error($str8$invalid_gt_mode___a, $SUPERIOR);
        }
        final SubLObject _prev_bind_0 = gt_vars.$gt_mode$.currentBinding(thread);
        try {
            gt_vars.$gt_mode$.bind($SUPERIOR, thread);
            gt_mark_proper_all_accessed_as_searched(node);
        } finally {
            gt_vars.$gt_mode$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject gt_mark_all_inferiors_as_searched_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == gt_utilities.gt_modeP($INFERIOR)) {
                    Errors.error($str_alt8$invalid_gt_mode___a, $INFERIOR);
                }
            }
            {
                SubLObject _prev_bind_0 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind($INFERIOR, thread);
                    com.cyc.cycjava.cycl.gt_search.gt_mark_all_accessed_as_searched(node);
                } finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_mark_all_inferiors_as_searched(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($INFERIOR))) {
            Errors.error($str8$invalid_gt_mode___a, $INFERIOR);
        }
        final SubLObject _prev_bind_0 = gt_vars.$gt_mode$.currentBinding(thread);
        try {
            gt_vars.$gt_mode$.bind($INFERIOR, thread);
            gt_mark_all_accessed_as_searched(node);
        } finally {
            gt_vars.$gt_mode$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject gt_mark_proper_all_inferiors_as_searched_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == gt_utilities.gt_modeP($INFERIOR)) {
                    Errors.error($str_alt8$invalid_gt_mode___a, $INFERIOR);
                }
            }
            {
                SubLObject _prev_bind_0 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind($INFERIOR, thread);
                    com.cyc.cycjava.cycl.gt_search.gt_mark_proper_all_accessed_as_searched(node);
                } finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_mark_proper_all_inferiors_as_searched(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($INFERIOR))) {
            Errors.error($str8$invalid_gt_mode___a, $INFERIOR);
        }
        final SubLObject _prev_bind_0 = gt_vars.$gt_mode$.currentBinding(thread);
        try {
            gt_vars.$gt_mode$.bind($INFERIOR, thread);
            gt_mark_proper_all_accessed_as_searched(node);
        } finally {
            gt_vars.$gt_mode$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject gt_mark_all_accessed_as_searched_alt(SubLObject node) {
        com.cyc.cycjava.cycl.gt_search.gt_mark_as_searched(node);
        com.cyc.cycjava.cycl.gt_search.gt_mark_proper_all_accessed_as_searched(node);
        return NIL;
    }

    public static SubLObject gt_mark_all_accessed_as_searched(final SubLObject node) {
        gt_mark_as_searched(node);
        gt_mark_proper_all_accessed_as_searched(node);
        return NIL;
    }

    public static final SubLObject gt_mark_proper_all_accessed_as_searched_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType($TRUE, TRUTH_P);
            {
                SubLObject _prev_bind_0 = gt_vars.$gt_truth$.currentBinding(thread);
                try {
                    gt_vars.$gt_truth$.bind($TRUE, thread);
                    if (true) {
                        SubLTrampolineFile.checkType(GT_MAP_LINKS, FUNCTION_SPEC_P);
                    }
                    {
                        SubLObject _prev_bind_0_132 = gt_vars.$gt_step_fn$.currentBinding(thread);
                        try {
                            gt_vars.$gt_step_fn$.bind(GT_MAP_LINKS, thread);
                            SubLTrampolineFile.checkType(GT_MARK_AS_SEARCHED_AND_STEP, FUNCTION_SPEC_P);
                            {
                                SubLObject _prev_bind_0_133 = gt_vars.$gt_base_fn$.currentBinding(thread);
                                try {
                                    gt_vars.$gt_base_fn$.bind(GT_MARK_AS_SEARCHED_AND_STEP, thread);
                                    com.cyc.cycjava.cycl.gt_search.gt_map_links(node, UNPROVIDED);
                                } finally {
                                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_133, thread);
                                }
                            }
                        } finally {
                            gt_vars.$gt_step_fn$.rebind(_prev_bind_0_132, thread);
                        }
                    }
                } finally {
                    gt_vars.$gt_truth$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_mark_proper_all_accessed_as_searched(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != enumeration_types.truth_p($TRUE) : "! enumeration_types.truth_p( _KW.$TRUE) " + ("enumeration_types.truth_p(gt_search.$kw34$TRUE) " + "CommonSymbols.NIL != enumeration_types.truth_p(gt_search.$kw34$TRUE) ") + $TRUE;
        final SubLObject _prev_bind_0 = gt_vars.$gt_truth$.currentBinding(thread);
        try {
            gt_vars.$gt_truth$.bind($TRUE, thread);
            assert NIL != function_spec_p(GT_MAP_LINKS) : "! function_spec_p(gt_search.GT_MAP_LINKS) " + ("Types.function_spec_p(gt_search.$sym10$GT_MAP_LINKS) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym10$GT_MAP_LINKS) ") + GT_MAP_LINKS;
            final SubLObject _prev_bind_0_$130 = gt_vars.$gt_step_fn$.currentBinding(thread);
            try {
                gt_vars.$gt_step_fn$.bind(GT_MAP_LINKS, thread);
                assert NIL != function_spec_p(GT_MARK_AS_SEARCHED_AND_STEP) : "! function_spec_p(gt_search.GT_MARK_AS_SEARCHED_AND_STEP) " + ("Types.function_spec_p(gt_search.$sym19$GT_MARK_AS_SEARCHED_AND_STEP) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym19$GT_MARK_AS_SEARCHED_AND_STEP) ") + GT_MARK_AS_SEARCHED_AND_STEP;
                final SubLObject _prev_bind_0_$131 = gt_vars.$gt_base_fn$.currentBinding(thread);
                try {
                    gt_vars.$gt_base_fn$.bind(GT_MARK_AS_SEARCHED_AND_STEP, thread);
                    gt_map_links(node, UNPROVIDED);
                } finally {
                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$131, thread);
                }
            } finally {
                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$130, thread);
            }
        } finally {
            gt_vars.$gt_truth$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject gt_mark_all_superiors_as_unsearched_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == gt_utilities.gt_modeP($SUPERIOR)) {
                    Errors.error($str_alt8$invalid_gt_mode___a, $SUPERIOR);
                }
            }
            {
                SubLObject _prev_bind_0 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                    com.cyc.cycjava.cycl.gt_search.gt_mark_all_accessed_as_unsearched(node);
                } finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_mark_all_superiors_as_unsearched(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($SUPERIOR))) {
            Errors.error($str8$invalid_gt_mode___a, $SUPERIOR);
        }
        final SubLObject _prev_bind_0 = gt_vars.$gt_mode$.currentBinding(thread);
        try {
            gt_vars.$gt_mode$.bind($SUPERIOR, thread);
            gt_mark_all_accessed_as_unsearched(node);
        } finally {
            gt_vars.$gt_mode$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject gt_mark_proper_all_superiors_as_unsearched_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == gt_utilities.gt_modeP($SUPERIOR)) {
                    Errors.error($str_alt8$invalid_gt_mode___a, $SUPERIOR);
                }
            }
            {
                SubLObject _prev_bind_0 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                    com.cyc.cycjava.cycl.gt_search.gt_mark_proper_all_accessed_as_unsearched(node);
                } finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_mark_proper_all_superiors_as_unsearched(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($SUPERIOR))) {
            Errors.error($str8$invalid_gt_mode___a, $SUPERIOR);
        }
        final SubLObject _prev_bind_0 = gt_vars.$gt_mode$.currentBinding(thread);
        try {
            gt_vars.$gt_mode$.bind($SUPERIOR, thread);
            gt_mark_proper_all_accessed_as_unsearched(node);
        } finally {
            gt_vars.$gt_mode$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject gt_mark_all_inferiors_as_unsearched_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == gt_utilities.gt_modeP($INFERIOR)) {
                    Errors.error($str_alt8$invalid_gt_mode___a, $INFERIOR);
                }
            }
            {
                SubLObject _prev_bind_0 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind($INFERIOR, thread);
                    com.cyc.cycjava.cycl.gt_search.gt_mark_all_accessed_as_unsearched(node);
                } finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_mark_all_inferiors_as_unsearched(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($INFERIOR))) {
            Errors.error($str8$invalid_gt_mode___a, $INFERIOR);
        }
        final SubLObject _prev_bind_0 = gt_vars.$gt_mode$.currentBinding(thread);
        try {
            gt_vars.$gt_mode$.bind($INFERIOR, thread);
            gt_mark_all_accessed_as_unsearched(node);
        } finally {
            gt_vars.$gt_mode$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject gt_mark_proper_all_inferiors_as_unsearched_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == gt_utilities.gt_modeP($INFERIOR)) {
                    Errors.error($str_alt8$invalid_gt_mode___a, $INFERIOR);
                }
            }
            {
                SubLObject _prev_bind_0 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind($INFERIOR, thread);
                    com.cyc.cycjava.cycl.gt_search.gt_mark_proper_all_accessed_as_unsearched(node);
                } finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_mark_proper_all_inferiors_as_unsearched(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($INFERIOR))) {
            Errors.error($str8$invalid_gt_mode___a, $INFERIOR);
        }
        final SubLObject _prev_bind_0 = gt_vars.$gt_mode$.currentBinding(thread);
        try {
            gt_vars.$gt_mode$.bind($INFERIOR, thread);
            gt_mark_proper_all_accessed_as_unsearched(node);
        } finally {
            gt_vars.$gt_mode$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject gt_mark_all_accessed_as_unsearched_alt(SubLObject node) {
        com.cyc.cycjava.cycl.gt_search.gt_mark_as_unsearched(node);
        com.cyc.cycjava.cycl.gt_search.gt_mark_proper_all_accessed_as_unsearched(node);
        return NIL;
    }

    public static SubLObject gt_mark_all_accessed_as_unsearched(final SubLObject node) {
        gt_mark_as_unsearched(node);
        gt_mark_proper_all_accessed_as_unsearched(node);
        return NIL;
    }

    public static final SubLObject gt_mark_proper_all_accessed_as_unsearched_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType($TRUE, TRUTH_P);
            {
                SubLObject _prev_bind_0 = gt_vars.$gt_truth$.currentBinding(thread);
                try {
                    gt_vars.$gt_truth$.bind($TRUE, thread);
                    if (true) {
                        SubLTrampolineFile.checkType(GT_MAP_LINKS, FUNCTION_SPEC_P);
                    }
                    {
                        SubLObject _prev_bind_0_134 = gt_vars.$gt_step_fn$.currentBinding(thread);
                        try {
                            gt_vars.$gt_step_fn$.bind(GT_MAP_LINKS, thread);
                            SubLTrampolineFile.checkType(GT_MARK_AS_UNSEARCHED_AND_STEP, FUNCTION_SPEC_P);
                            {
                                SubLObject _prev_bind_0_135 = gt_vars.$gt_base_fn$.currentBinding(thread);
                                try {
                                    gt_vars.$gt_base_fn$.bind(GT_MARK_AS_UNSEARCHED_AND_STEP, thread);
                                    com.cyc.cycjava.cycl.gt_search.gt_map_links(node, UNPROVIDED);
                                } finally {
                                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_135, thread);
                                }
                            }
                        } finally {
                            gt_vars.$gt_step_fn$.rebind(_prev_bind_0_134, thread);
                        }
                    }
                } finally {
                    gt_vars.$gt_truth$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_mark_proper_all_accessed_as_unsearched(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != enumeration_types.truth_p($TRUE) : "! enumeration_types.truth_p( _KW.$TRUE) " + ("enumeration_types.truth_p(gt_search.$kw34$TRUE) " + "CommonSymbols.NIL != enumeration_types.truth_p(gt_search.$kw34$TRUE) ") + $TRUE;
        final SubLObject _prev_bind_0 = gt_vars.$gt_truth$.currentBinding(thread);
        try {
            gt_vars.$gt_truth$.bind($TRUE, thread);
            assert NIL != function_spec_p(GT_MAP_LINKS) : "! function_spec_p(gt_search.GT_MAP_LINKS) " + ("Types.function_spec_p(gt_search.$sym10$GT_MAP_LINKS) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym10$GT_MAP_LINKS) ") + GT_MAP_LINKS;
            final SubLObject _prev_bind_0_$132 = gt_vars.$gt_step_fn$.currentBinding(thread);
            try {
                gt_vars.$gt_step_fn$.bind(GT_MAP_LINKS, thread);
                assert NIL != function_spec_p(GT_MARK_AS_UNSEARCHED_AND_STEP) : "! function_spec_p(gt_search.GT_MARK_AS_UNSEARCHED_AND_STEP) " + ("Types.function_spec_p(gt_search.$sym20$GT_MARK_AS_UNSEARCHED_AND_STEP) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym20$GT_MARK_AS_UNSEARCHED_AND_STEP) ") + GT_MARK_AS_UNSEARCHED_AND_STEP;
                final SubLObject _prev_bind_0_$133 = gt_vars.$gt_base_fn$.currentBinding(thread);
                try {
                    gt_vars.$gt_base_fn$.bind(GT_MARK_AS_UNSEARCHED_AND_STEP, thread);
                    gt_map_links(node, UNPROVIDED);
                } finally {
                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$133, thread);
                }
            } finally {
                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$132, thread);
            }
        } finally {
            gt_vars.$gt_truth$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject gt_mark_all_accessed_as_searched_by_alt(SubLObject node, SubLObject searcher) {
        if (NIL != gt_utilities.gt_term_p(node)) {
            com.cyc.cycjava.cycl.gt_search.gt_mark_as_searched_by(node, searcher);
            com.cyc.cycjava.cycl.gt_search.gt_mark_proper_all_accessed_as_searched_by(node, searcher);
        }
        return NIL;
    }

    public static SubLObject gt_mark_all_accessed_as_searched_by(final SubLObject node, final SubLObject searcher) {
        if (NIL != gt_utilities.gt_term_p(node)) {
            gt_mark_as_searched_by(node, searcher);
            gt_mark_proper_all_accessed_as_searched_by(node, searcher);
        }
        return NIL;
    }

    public static final SubLObject gt_mark_proper_all_accessed_as_searched_by_alt(SubLObject node, SubLObject searcher) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType($TRUE, TRUTH_P);
            {
                SubLObject _prev_bind_0 = gt_vars.$gt_truth$.currentBinding(thread);
                try {
                    gt_vars.$gt_truth$.bind($TRUE, thread);
                    if (true) {
                        SubLTrampolineFile.checkType(GT_MAP_LINKS, FUNCTION_SPEC_P);
                    }
                    {
                        SubLObject _prev_bind_0_136 = gt_vars.$gt_step_fn$.currentBinding(thread);
                        try {
                            gt_vars.$gt_step_fn$.bind(GT_MAP_LINKS, thread);
                            SubLTrampolineFile.checkType(GT_MARK_AS_SEARCHED_BY_AND_STEP, FUNCTION_SPEC_P);
                            {
                                SubLObject _prev_bind_0_137 = gt_vars.$gt_base_fn$.currentBinding(thread);
                                SubLObject _prev_bind_1 = gt_vars.$gt_searcher$.currentBinding(thread);
                                try {
                                    gt_vars.$gt_base_fn$.bind(GT_MARK_AS_SEARCHED_BY_AND_STEP, thread);
                                    gt_vars.$gt_searcher$.bind(searcher, thread);
                                    com.cyc.cycjava.cycl.gt_search.gt_map_links(node, UNPROVIDED);
                                } finally {
                                    gt_vars.$gt_searcher$.rebind(_prev_bind_1, thread);
                                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_137, thread);
                                }
                            }
                        } finally {
                            gt_vars.$gt_step_fn$.rebind(_prev_bind_0_136, thread);
                        }
                    }
                } finally {
                    gt_vars.$gt_truth$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_mark_proper_all_accessed_as_searched_by(final SubLObject node, final SubLObject searcher) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != enumeration_types.truth_p($TRUE) : "! enumeration_types.truth_p( _KW.$TRUE) " + ("enumeration_types.truth_p(gt_search.$kw34$TRUE) " + "CommonSymbols.NIL != enumeration_types.truth_p(gt_search.$kw34$TRUE) ") + $TRUE;
        final SubLObject _prev_bind_0 = gt_vars.$gt_truth$.currentBinding(thread);
        try {
            gt_vars.$gt_truth$.bind($TRUE, thread);
            assert NIL != function_spec_p(GT_MAP_LINKS) : "! function_spec_p(gt_search.GT_MAP_LINKS) " + ("Types.function_spec_p(gt_search.$sym10$GT_MAP_LINKS) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym10$GT_MAP_LINKS) ") + GT_MAP_LINKS;
            final SubLObject _prev_bind_0_$134 = gt_vars.$gt_step_fn$.currentBinding(thread);
            try {
                gt_vars.$gt_step_fn$.bind(GT_MAP_LINKS, thread);
                assert NIL != function_spec_p(GT_MARK_AS_SEARCHED_BY_AND_STEP) : "! function_spec_p(gt_search.GT_MARK_AS_SEARCHED_BY_AND_STEP) " + ("Types.function_spec_p(gt_search.$sym72$GT_MARK_AS_SEARCHED_BY_AND_STEP) " + "CommonSymbols.NIL != Types.function_spec_p(gt_search.$sym72$GT_MARK_AS_SEARCHED_BY_AND_STEP) ") + GT_MARK_AS_SEARCHED_BY_AND_STEP;
                final SubLObject _prev_bind_0_$135 = gt_vars.$gt_base_fn$.currentBinding(thread);
                final SubLObject _prev_bind_2 = gt_vars.$gt_searcher$.currentBinding(thread);
                try {
                    gt_vars.$gt_base_fn$.bind(GT_MARK_AS_SEARCHED_BY_AND_STEP, thread);
                    gt_vars.$gt_searcher$.bind(searcher, thread);
                    gt_map_links(node, UNPROVIDED);
                } finally {
                    gt_vars.$gt_searcher$.rebind(_prev_bind_2, thread);
                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$135, thread);
                }
            } finally {
                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$134, thread);
            }
        } finally {
            gt_vars.$gt_truth$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject declare_gt_search_file() {
        declareFunction("gt_search_index_arg", "GT-SEARCH-INDEX-ARG", 0, 0, false);
        declareFunction("gt_search_gather_arg", "GT-SEARCH-GATHER-ARG", 0, 0, false);
        declareFunction("gt_link_node", "GT-LINK-NODE", 1, 0, false);
        declareFunction("gt_link_node_and_mt", "GT-LINK-NODE-AND-MT", 1, 0, false);
        declareFunction("gt_link_values", "GT-LINK-VALUES", 1, 0, false);
        declareFunction("gt_add_to_result", "GT-ADD-TO-RESULT", 1, 0, false);
        declareFunction("gt_gather_link_node", "GT-GATHER-LINK-NODE", 1, 0, false);
        declareFunction("gt_gather_link_node_and_mt", "GT-GATHER-LINK-NODE-AND-MT", 1, 0, false);
        declareFunction("gt_siblings", "GT-SIBLINGS", 1, 0, false);
        declareFunction("gt_gather_sibling_node", "GT-GATHER-SIBLING-NODE", 1, 0, false);
        declareFunction("gt_all_accessed", "GT-ALL-ACCESSED", 1, 0, false);
        declareFunction("tts_all_accessed", "TTS-ALL-ACCESSED", 1, 0, false);
        declareFunction("gt_extremal_accessed", "GT-EXTREMAL-ACCESSED", 1, 0, false);
        declareFunction("gt_gather_extremal_node", "GT-GATHER-EXTREMAL-NODE", 1, 0, false);
        declareFunction("gt_accessesP", "GT-ACCESSES?", 2, 1, false);
        declareFunction("gt_test_link_node", "GT-TEST-LINK-NODE", 1, 0, false);
        declareFunction("gt_gather", "GT-GATHER", 2, 0, false);
        declareFunction("gt_gather_node", "GT-GATHER-NODE", 1, 0, false);
        declareFunction("gt_common_horizon", "GT-COMMON-HORIZON", 1, 2, false);
        declareFunction("gt_compose_fn_all_accessed", "GT-COMPOSE-FN-ALL-ACCESSED", 2, 1, false);
        declareFunction("gt_compose_fn_link_node", "GT-COMPOSE-FN-LINK-NODE", 1, 0, false);
        declareFunction("gt_select_all_accessed", "GT-SELECT-ALL-ACCESSED", 2, 1, false);
        declareFunction("gt_select_link_node", "GT-SELECT-LINK-NODE", 1, 0, false);
        declareFunction("gt_all_dependent_accessed", "GT-ALL-DEPENDENT-ACCESSED", 1, 0, false);
        declareFunction("gt_gather_marked_accessed", "GT-GATHER-MARKED-ACCESSED", 1, 0, false);
        declareFunction("gt_gather_marked_link_node", "GT-GATHER-MARKED-LINK-NODE", 1, 0, false);
        declareFunction("gt_mark_unselect_all_accessed_as_unsearched", "GT-MARK-UNSELECT-ALL-ACCESSED-AS-UNSEARCHED", 1, 0, false);
        declareFunction("gt_mark_unselect_link_node_all_accessed_as_unsearched", "GT-MARK-UNSELECT-LINK-NODE-ALL-ACCESSED-AS-UNSEARCHED", 1, 0, false);
        declareFunction("gt_compose_pred_all_accessed", "GT-COMPOSE-PRED-ALL-ACCESSED", 2, 0, false);
        declareFunction("gt_compose_pred_link_node", "GT-COMPOSE-PRED-LINK-NODE", 1, 0, false);
        declareFunction("gt_compose_pred_link_node_int", "GT-COMPOSE-PRED-LINK-NODE-INT", 1, 0, false);
        declareFunction("gt_why_accessesP", "GT-WHY-ACCESSES?", 2, 0, false);
        declareFunction("gt_gather_access_just", "GT-GATHER-ACCESS-JUST", 1, 0, false);
        declareFunction("gt_any_access_path", "GT-ANY-ACCESS-PATH", 2, 0, false);
        declareFunction("gt_gather_access_path", "GT-GATHER-ACCESS-PATH", 1, 0, false);
        declareFunction("gt_min_mts_of_paths", "GT-MIN-MTS-OF-PATHS", 2, 0, false);
        declareFunction("gt_maximin_mts_among_lists", "GT-MAXIMIN-MTS-AMONG-LISTS", 2, 0, false);
        declareFunction("gt_gather_link_node_and_max_mts", "GT-GATHER-LINK-NODE-AND-MAX-MTS", 1, 0, false);
        declareFunction("gt_mark_link_node_as_unsearched_and_collect_mts", "GT-MARK-LINK-NODE-AS-UNSEARCHED-AND-COLLECT-MTS", 1, 0, false);
        declareFunction("gt_mark_as_unsearched_and_collect_all_accessed", "GT-MARK-AS-UNSEARCHED-AND-COLLECT-ALL-ACCESSED", 1, 0, false);
        declareFunction("gt_all_accessed_with_mts", "GT-ALL-ACCESSED-WITH-MTS", 1, 0, false);
        declareFunction("gt_gather_link_node_and_store_edges", "GT-GATHER-LINK-NODE-AND-STORE-EDGES", 1, 0, false);
        declareFunction("gt_check_for_cycle_edges_to_add", "GT-CHECK-FOR-CYCLE-EDGES-TO-ADD", 0, 0, false);
        declareFunction("gt_all_edges_to_goal", "GT-ALL-EDGES-TO-GOAL", 1, 0, false);
        declareFunction("gt_access_all_while_storing_paths", "GT-ACCESS-ALL-WHILE-STORING-PATHS", 1, 0, false);
        declareFunction("gt_gather_link_nodes_and_store_all_paths", "GT-GATHER-LINK-NODES-AND-STORE-ALL-PATHS", 1, 0, false);
        declareFunction("gt_access_all_while_unifying_mts", "GT-ACCESS-ALL-WHILE-UNIFYING-MTS", 1, 0, false);
        declareFunction("gt_map_links_rebinding_candidate_mts", "GT-MAP-LINKS-REBINDING-CANDIDATE-MTS", 1, 1, false);
        declareFunction("gt_gather_link_nodes_and_unify_mts_along_the_way", "GT-GATHER-LINK-NODES-AND-UNIFY-MTS-ALONG-THE-WAY", 1, 0, false);
        declareFunction("gt_maxs_of_mt_list", "GT-MAXS-OF-MT-LIST", 1, 0, false);
        declareFunction("is_x_a_path_list_in_yP", "IS-X-A-PATH-LIST-IN-Y?", 2, 0, false);
        declareFunction("fort_sets_equal", "FORT-SETS-EQUAL", 2, 0, false);
        declareFunction("adjudiciate_adding_mt", "ADJUDICIATE-ADDING-MT", 1, 0, false);
        declareFunction("gt_finished", "GT-FINISHED", 0, 1, false);
        declareFunction("gt_map_links", "GT-MAP-LINKS", 1, 1, false);
        declareFunction("gt_map_assertion_links", "GT-MAP-ASSERTION-LINKS", 2, 0, false);
        declareFunction("gt_map_accessors_links", "GT-MAP-ACCESSORS-LINKS", 2, 0, false);
        declareFunction("gt_map_arg_index", "GT-MAP-ARG-INDEX", 4, 1, false);
        declareFunction("gt_gp_mapper", "GT-GP-MAPPER", 4, 0, false);
        declareFunction("gt_mapper", "GT-MAPPER", 5, 0, false);
        declareFunction("gt_map_gaf_arg_index_link_nodes", "GT-MAP-GAF-ARG-INDEX-LINK-NODES", 3, 3, false);
        declareFunction("gt_mark_as_searched", "GT-MARK-AS-SEARCHED", 1, 0, false);
        declareFunction("gt_mark_as_unsearched", "GT-MARK-AS-UNSEARCHED", 1, 0, false);
        declareFunction("gt_searchedP", "GT-SEARCHED?", 1, 0, false);
        declareFunction("gt_mark_as_searched_by", "GT-MARK-AS-SEARCHED-BY", 2, 0, false);
        declareFunction("gt_mark_as_searched_with", "GT-MARK-AS-SEARCHED-WITH", 2, 0, false);
        declareFunction("gt_searched_byP", "GT-SEARCHED-BY?", 2, 1, false);
        declareFunction("gt_searched_by_allP", "GT-SEARCHED-BY-ALL?", 2, 1, false);
        declareFunction("gt_searched_in_target_spaceP", "GT-SEARCHED-IN-TARGET-SPACE?", 1, 1, false);
        declareFunction("gt_mark_as_unsearched_in_space", "GT-MARK-AS-UNSEARCHED-IN-SPACE", 1, 1, false);
        declareFunction("gt_mark_as_searched_in_target_space", "GT-MARK-AS-SEARCHED-IN-TARGET-SPACE", 3, 0, false);
        declareFunction("gt_mark_link_node_as_searched", "GT-MARK-LINK-NODE-AS-SEARCHED", 1, 0, false);
        declareFunction("gt_mark_as_searched_and_step", "GT-MARK-AS-SEARCHED-AND-STEP", 1, 0, false);
        declareFunction("gt_mark_link_node_as_unsearched", "GT-MARK-LINK-NODE-AS-UNSEARCHED", 1, 0, false);
        declareFunction("gt_mark_as_unsearched_and_step", "GT-MARK-AS-UNSEARCHED-AND-STEP", 1, 0, false);
        declareFunction("gt_mark_link_node_as_searched_by", "GT-MARK-LINK-NODE-AS-SEARCHED-BY", 1, 0, false);
        declareFunction("gt_mark_as_searched_by_and_step", "GT-MARK-AS-SEARCHED-BY-AND-STEP", 1, 0, false);
        declareFunction("gt_mark_all_superiors_as_searched", "GT-MARK-ALL-SUPERIORS-AS-SEARCHED", 1, 0, false);
        declareFunction("gt_mark_proper_all_superiors_as_searched", "GT-MARK-PROPER-ALL-SUPERIORS-AS-SEARCHED", 1, 0, false);
        declareFunction("gt_mark_all_inferiors_as_searched", "GT-MARK-ALL-INFERIORS-AS-SEARCHED", 1, 0, false);
        declareFunction("gt_mark_proper_all_inferiors_as_searched", "GT-MARK-PROPER-ALL-INFERIORS-AS-SEARCHED", 1, 0, false);
        declareFunction("gt_mark_all_accessed_as_searched", "GT-MARK-ALL-ACCESSED-AS-SEARCHED", 1, 0, false);
        declareFunction("gt_mark_proper_all_accessed_as_searched", "GT-MARK-PROPER-ALL-ACCESSED-AS-SEARCHED", 1, 0, false);
        declareFunction("gt_mark_all_superiors_as_unsearched", "GT-MARK-ALL-SUPERIORS-AS-UNSEARCHED", 1, 0, false);
        declareFunction("gt_mark_proper_all_superiors_as_unsearched", "GT-MARK-PROPER-ALL-SUPERIORS-AS-UNSEARCHED", 1, 0, false);
        declareFunction("gt_mark_all_inferiors_as_unsearched", "GT-MARK-ALL-INFERIORS-AS-UNSEARCHED", 1, 0, false);
        declareFunction("gt_mark_proper_all_inferiors_as_unsearched", "GT-MARK-PROPER-ALL-INFERIORS-AS-UNSEARCHED", 1, 0, false);
        declareFunction("gt_mark_all_accessed_as_unsearched", "GT-MARK-ALL-ACCESSED-AS-UNSEARCHED", 1, 0, false);
        declareFunction("gt_mark_proper_all_accessed_as_unsearched", "GT-MARK-PROPER-ALL-ACCESSED-AS-UNSEARCHED", 1, 0, false);
        declareFunction("gt_mark_all_accessed_as_searched_by", "GT-MARK-ALL-ACCESSED-AS-SEARCHED-BY", 2, 0, false);
        declareFunction("gt_mark_proper_all_accessed_as_searched_by", "GT-MARK-PROPER-ALL-ACCESSED-AS-SEARCHED-BY", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_gt_search_file() {
        return NIL;
    }

    public static SubLObject setup_gt_search_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_gt_search_file();
    }

    @Override
    public void initializeVariables() {
        init_gt_search_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_gt_search_file();
    }

    static {
    }

    static private final SubLString $str_alt4$illegal_value_of__gt_mode____s = makeString("illegal value of *gt-mode*: ~s");

    static private final SubLString $str_alt8$invalid_gt_mode___a = makeString("invalid gt mode: ~a");

    static private final SubLString $str_alt9$illegal_value_of__gt_mode_ = makeString("illegal value of *gt-mode*");

    static private final SubLString $str_alt13$_a_is_not_a_function = makeString("~a is not a function");

    static private final SubLList $list_alt27 = list($TRUE);

    static private final SubLString $str_alt44$illegal_value_of__gt_link_type___ = makeString("illegal value of *gt-link-type*: ~s");

    static private final SubLString $str_alt47$GT_recursion_limit_reached___Plea = makeString("GT recursion limit reached.  Please report this problem on bug 15244.");

    static private final SubLList $list_alt50 = list(makeSymbol("*GT-PRED*"), makeSymbol("*GT-INDEX-ARG*"), makeSymbol("*GT-GATHER-ARG*"));

    static private final SubLString $str_alt60$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt65$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLList $list_alt67 = list(makeSymbol("LINK-NODE"), makeSymbol("LINK-MT"));

    static private final SubLString $str_alt68$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLString $str_alt69$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");
}

/**
 * Total time: 1727 ms synthetic
 */
