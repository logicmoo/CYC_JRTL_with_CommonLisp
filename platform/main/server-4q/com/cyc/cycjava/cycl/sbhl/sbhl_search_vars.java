/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sbhl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
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


public final class sbhl_search_vars extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sbhl_search_vars();

 public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_search_vars";


    // defparameter
    // Different types of search, leading to different behaviors.
    /**
     * Different types of search, leading to different behaviors.
     */
    @LispMethod(comment = "Different types of search, leading to different behaviors.\ndefparameter")
    public static final SubLSymbol $sbhl_search_types$ = makeSymbol("*SBHL-SEARCH-TYPES*");

    // defparameter
    /**
     * Does the current boolean search show the path that allowed success to be
     * concluded
     */
    @LispMethod(comment = "Does the current boolean search show the path that allowed success to be\r\nconcluded\ndefparameter\nDoes the current boolean search show the path that allowed success to be\nconcluded")
    public static final SubLSymbol $sbhl_justification_search_p$ = makeSymbol("*SBHL-JUSTIFICATION-SEARCH-P*");

    // defparameter
    /**
     * parameter used to indicate when justification was coerced and requires old
     * justification behavior
     */
    @LispMethod(comment = "parameter used to indicate when justification was coerced and requires old\r\njustification behavior\ndefparameter\nparameter used to indicate when justification was coerced and requires old\njustification behavior")
    public static final SubLSymbol $sbhl_justification_defaulted_old$ = makeSymbol("*SBHL-JUSTIFICATION-DEFAULTED-OLD*");

    // defparameter
    // has the justification path already been assembled?
    /**
     * has the justification path already been assembled?
     */
    @LispMethod(comment = "has the justification path already been assembled?\ndefparameter")
    public static final SubLSymbol $sbhl_justification_assembled_p$ = makeSymbol("*SBHL-JUSTIFICATION-ASSEMBLED-P*");

    // defparameter
    // Is current search an unmarking search
    /**
     * Is current search an unmarking search
     */
    @LispMethod(comment = "Is current search an unmarking search\ndefparameter")
    public static final SubLSymbol $sbhl_unmarking_search_p$ = makeSymbol("*SBHL-UNMARKING-SEARCH-P*");

    // deflexical
    // The keyword specifying forward search
    /**
     * The keyword specifying forward search
     */
    @LispMethod(comment = "The keyword specifying forward search\ndeflexical")
    public static final SubLSymbol $sbhl_forward_search_direction$ = makeSymbol("*SBHL-FORWARD-SEARCH-DIRECTION*");

    // deflexical
    // The keyword specifying backward search
    /**
     * The keyword specifying backward search
     */
    @LispMethod(comment = "The keyword specifying backward search\ndeflexical")
    public static final SubLSymbol $sbhl_backward_search_direction$ = makeSymbol("*SBHL-BACKWARD-SEARCH-DIRECTION*");

    // defparameter
    // Obsolete
    /**
     * Obsolete
     */
    @LispMethod(comment = "Obsolete\ndefparameter")
    public static final SubLSymbol $sbhl_index_arg$ = makeSymbol("*SBHL-INDEX-ARG*");

    // defparameter
    // The index arg for current search
    /**
     * The index arg for current search
     */
    @LispMethod(comment = "The index arg for current search\ndefparameter")
    public static final SubLSymbol $sbhl_search_index_arg$ = makeSymbol("*SBHL-SEARCH-INDEX-ARG*");

    // defparameter
    // Toggle determining whether to apply *sbhl-unwind-function*
    /**
     * Toggle determining whether to apply *sbhl-unwind-function*
     */
    @LispMethod(comment = "Toggle determining whether to apply *sbhl-unwind-function*\ndefparameter")
    public static final SubLSymbol $sbhl_apply_unwind_function_p$ = makeSymbol("*SBHL-APPLY-UNWIND-FUNCTION-P*");

    // defparameter
    // The current node's parent marking
    /**
     * The current node's parent marking
     */
    @LispMethod(comment = "The current node\'s parent marking\ndefparameter")
    public static final SubLSymbol $sbhl_search_parent_marking$ = makeSymbol("*SBHL-SEARCH-PARENT-MARKING*");

    // defparameter
    // previous marking of node
    /**
     * previous marking of node
     */
    @LispMethod(comment = "previous marking of node\ndefparameter")
    public static final SubLSymbol $sbhl_nodes_previous_marking$ = makeSymbol("*SBHL-NODES-PREVIOUS-MARKING*");

    // defparameter
    // Stores whether sbhl search is finished and if so, how.
    /**
     * Stores whether sbhl search is finished and if so, how.
     */
    @LispMethod(comment = "Stores whether sbhl search is finished and if so, how.\ndefparameter")
    public static final SubLSymbol $sbhl_finishedP$ = makeSymbol("*SBHL-FINISHED?*");

    // defparameter
    // stop mark and sweep from going further
    /**
     * stop mark and sweep from going further
     */
    @LispMethod(comment = "stop mark and sweep from going further\ndefparameter")
    public static final SubLSymbol $sbhl_stop_search_pathP$ = makeSymbol("*SBHL-STOP-SEARCH-PATH?*");

    // defparameter
    // The goal nodes for current search for any goal
    /**
     * The goal nodes for current search for any goal
     */
    @LispMethod(comment = "The goal nodes for current search for any goal\ndefparameter")
    public static final SubLSymbol $sbhl_goal_nodes$ = makeSymbol("*SBHL-GOAL-NODES*");

    // defparameter
    // The goal node for current search
    /**
     * The goal node for current search
     */
    @LispMethod(comment = "The goal node for current search\ndefparameter")
    public static final SubLSymbol $sbhl_isaP_goal$ = makeSymbol("*SBHL-ISA?-GOAL*");

    // defparameter
    // the result in search
    /**
     * the result in search
     */
    @LispMethod(comment = "the result in search\ndefparameter")
    public static final SubLSymbol $sbhl_result$ = makeSymbol("*SBHL-RESULT*");

    // defparameter
    // the result in justification searches.
    /**
     * the result in justification searches.
     */
    @LispMethod(comment = "the result in justification searches.\ndefparameter")
    public static final SubLSymbol $sbhl_justification_result$ = makeSymbol("*SBHL-JUSTIFICATION-RESULT*");

    // defparameter
    // the nodes upon which a gather has already been performed.
    /**
     * the nodes upon which a gather has already been performed.
     */
    @LispMethod(comment = "the nodes upon which a gather has already been performed.\ndefparameter")
    public static final SubLSymbol $sbhl_accessed_gather_nodes$ = makeSymbol("*SBHL-ACCESSED-GATHER-NODES*");

    // defparameter
    /**
     * Current search path during sample leaves search. Path is saved if successful.
     */
    @LispMethod(comment = "Current search path during sample leaves search. Path is saved if successful.\ndefparameter")
    public static final SubLSymbol $sbhl_current_leaf_queue$ = makeSymbol("*SBHL-CURRENT-LEAF-QUEUE*");

    // defparameter
    /**
     * Whether to check whether a node is marked as :goal before checking other
     * marking in search path termination.
     */
    @LispMethod(comment = "Whether to check whether a node is marked as :goal before checking other\r\nmarking in search path termination.\ndefparameter\nWhether to check whether a node is marked as :goal before checking other\nmarking in search path termination.")
    public static final SubLSymbol $sbhl_check_for_goal_marking_p$ = makeSymbol("*SBHL-CHECK-FOR-GOAL-MARKING-P*");

    // defparameter
    /**
     * permit isa module to infer isa/genls of reified nats from result-type of
     * functor?
     */
    @LispMethod(comment = "permit isa module to infer isa/genls of reified nats from result-type of\r\nfunctor?\ndefparameter\npermit isa module to infer isa/genls of reified nats from result-type of\nfunctor?")
    public static final SubLSymbol $infer_nat_sbhlP$ = makeSymbol("*INFER-NAT-SBHL?*");

    // defparameter
    // obsolete
    /**
     * obsolete
     */
    @LispMethod(comment = "obsolete\ndefparameter")
    public static final SubLSymbol $sbhl_mapping_pred$ = makeSymbol("*SBHL-MAPPING-PRED*");

    // defparameter
    // obsolete
    /**
     * obsolete
     */
    @LispMethod(comment = "obsolete\ndefparameter")
    public static final SubLSymbol $maximize_sbhl_resultP$ = makeSymbol("*MAXIMIZE-SBHL-RESULT?*");

    // defparameter
    // obsolete
    /**
     * obsolete
     */
    @LispMethod(comment = "obsolete\ndefparameter")
    public static final SubLSymbol $minimize_sbhl_resultP$ = makeSymbol("*MINIMIZE-SBHL-RESULT?*");

    // defparameter
    // used to determine whether the search is true or false
    /**
     * used to determine whether the search is true or false
     */
    @LispMethod(comment = "used to determine whether the search is true or false\ndefparameter")
    public static final SubLSymbol $sbhl_search_truth$ = makeSymbol("*SBHL-SEARCH-TRUTH*");

    // deflexical
    // valid sbhl truth values for searching
    /**
     * valid sbhl truth values for searching
     */
    @LispMethod(comment = "valid sbhl truth values for searching\ndeflexical")
    private static final SubLSymbol $sbhl_search_truth_values$ = makeSymbol("*SBHL-SEARCH-TRUTH-VALUES*");

    // deflexical
    // the encompassing true truth for searches.
    /**
     * the encompassing true truth for searches.
     */
    @LispMethod(comment = "the encompassing true truth for searches.\ndeflexical")
    private static final SubLSymbol $sbhl_true_tv$ = makeSymbol("*SBHL-TRUE-TV*");

    // deflexical
    // the encompassing false truth for searches.
    /**
     * the encompassing false truth for searches.
     */
    @LispMethod(comment = "the encompassing false truth for searches.\ndeflexical")
    private static final SubLSymbol $sbhl_false_tv$ = makeSymbol("*SBHL-FALSE-TV*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol POSSIBLY_WITH_NEW_SBHL_SPACES = makeSymbol("POSSIBLY-WITH-NEW-SBHL-SPACES");

    private static final SubLSymbol WITH_NEW_SBHL_FINISHED = makeSymbol("WITH-NEW-SBHL-FINISHED");

    private static final SubLSymbol WITH_NEW_SBHL_STOP_SEARCH_PATH = makeSymbol("WITH-NEW-SBHL-STOP-SEARCH-PATH");

    private static final SubLSymbol RESET_SBHL_SEARCH_PARENT_MARKING = makeSymbol("RESET-SBHL-SEARCH-PARENT-MARKING");

    private static final SubLSymbol WITH_NEW_SBHL_PREVIOUS_MARKING = makeSymbol("WITH-NEW-SBHL-PREVIOUS-MARKING");

    private static final SubLSymbol WITH_NEW_SBHL_PREDICATE_MODE_SCOPE = makeSymbol("WITH-NEW-SBHL-PREDICATE-MODE-SCOPE");

    private static final SubLSymbol WITH_SBHL_READER_LOCK = makeSymbol("WITH-SBHL-READER-LOCK");

    private static final SubLSymbol WITH_SBHL_TRUE_SEARCH = makeSymbol("WITH-SBHL-TRUE-SEARCH");

    private static final SubLSymbol WITH_SBHL_FORWARD_SEARCH_DIRECTION = makeSymbol("WITH-SBHL-FORWARD-SEARCH-DIRECTION");

    private static final SubLSymbol WITH_SBHL_FORWARD_LINK_DIRECTION = makeSymbol("WITH-SBHL-FORWARD-LINK-DIRECTION");

    private static final SubLSymbol WITH_SBHL_BACKWARD_SEARCH_DIRECTION = makeSymbol("WITH-SBHL-BACKWARD-SEARCH-DIRECTION");

    private static final SubLSymbol WITH_SBHL_BACKWARD_LINK_DIRECTION = makeSymbol("WITH-SBHL-BACKWARD-LINK-DIRECTION");

    private static final SubLSymbol WITH_SBHL_FALSE_SEARCH = makeSymbol("WITH-SBHL-FALSE-SEARCH");

    static private final SubLList $list13 = list(makeSymbol("MT"), makeSymbol("TV"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol POSSIBLY_WITH_SBHL_MT_RELEVANCE = makeSymbol("POSSIBLY-WITH-SBHL-MT-RELEVANCE");

    private static final SubLSymbol POSSIBLY_WITH_SBHL_TRUE_TV = makeSymbol("POSSIBLY-WITH-SBHL-TRUE-TV");

    private static final SubLSymbol WITH_SBHL_FORWARD_TRUE_CONDITIONS = makeSymbol("WITH-SBHL-FORWARD-TRUE-CONDITIONS");

    private static final SubLSymbol INITIALIZE_SBHL_SEARCH = makeSymbol("INITIALIZE-SBHL-SEARCH");

    private static final SubLSymbol WITH_SBHL_BACKWARD_TRUE_CONDITIONS = makeSymbol("WITH-SBHL-BACKWARD-TRUE-CONDITIONS");

    private static final SubLSymbol POSSIBLY_WITH_SBHL_FALSE_TV = makeSymbol("POSSIBLY-WITH-SBHL-FALSE-TV");

    private static final SubLSymbol WITH_SBHL_FORWARD_FALSE_CONDITIONS = makeSymbol("WITH-SBHL-FORWARD-FALSE-CONDITIONS");

    private static final SubLSymbol WITH_SBHL_BACKWARD_FALSE_CONDITIONS = makeSymbol("WITH-SBHL-BACKWARD-FALSE-CONDITIONS");

    static private final SubLList $list22 = list(makeKeyword("CLOSURE"), makeKeyword("BOOLEAN"), makeKeyword("WHAT-MTS"));

    static private final SubLList $list23 = list(makeSymbol("TYPE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sbhl_search_type$ = makeSymbol("*SBHL-SEARCH-TYPE*");

    private static final SubLSymbol WITH_SBHL_SEARCH_TYPE = makeSymbol("WITH-SBHL-SEARCH-TYPE");

    static private final SubLList $list30 = list(list(makeSymbol("*SBHL-JUSTIFICATION-SEARCH-P*"), T), list(makeSymbol("*SBHL-APPLY-UNWIND-FUNCTION-P*"), NIL), list(makeSymbol("*SBHL-UNWIND-FUNCTION*"), list(makeSymbol("FIF"), list(makeSymbol("SBHL-TIME-SEARCH-P")), list(QUOTE, makeSymbol("SBHL-TEMPORAL-JUSTIFICATION-UNWIND")), list(QUOTE, makeSymbol("SBHL-PUSH-UNWIND-ONTO-RESULT")))));

    private static final SubLList $list31 = list(list(makeSymbol("*SBHL-JUSTIFICATION-SEARCH-P*"), NIL), list(makeSymbol("*SBHL-APPLY-UNWIND-FUNCTION-P*"), NIL));

    static private final SubLList $list32 = list(makeSymbol("BEHAVIOR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sbhl_search_behavior$ = makeSymbol("*SBHL-SEARCH-BEHAVIOR*");

    public static final SubLSymbol $sbhl_justification_behavior$ = makeSymbol("*SBHL-JUSTIFICATION-BEHAVIOR*");

    private static final SubLSymbol BEHAVIOR = makeSymbol("BEHAVIOR");

    private static final SubLList $list39 = list(list(makeSymbol("*SBHL-JUSTIFICATION-BEHAVIOR*"), makeKeyword("ASSERTION")));

    private static final SubLList $list40 = list(list(makeSymbol("*SBHL-JUSTIFICATION-BEHAVIOR*"), makeKeyword("VERBOSE")));

    static private final SubLList $list41 = list(list(makeSymbol("*SBHL-JUSTIFICATION-BEHAVIOR*"), makeKeyword("OLD")));

    static private final SubLList $list42 = list(list(makeSymbol("*SBHL-JUSTIFICATION-DEFAULTED-OLD*"), NIL));

    static private final SubLList $list43 = list(list(makeSymbol("*SBHL-JUSTIFICATION-ASSEMBLED-P*"), NIL));

    static private final SubLList $list44 = list(list(makeSymbol("*SBHL-UNMARKING-SEARCH-P*"), T));

    static private final SubLList $list45 = list(list(makeSymbol("*SBHL-UNMARKING-SEARCH-P*"), NIL));

    private static final SubLString $str46$get_sbhl_search_module___sbhl_sea = makeString("get-sbhl-search-module: *sbhl-search-module* is unexpectedly null.");









    private static final SubLList $list51 = list(makeSymbol("MODULE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sbhl_search_module$ = makeSymbol("*SBHL-SEARCH-MODULE*");

    public static final SubLSymbol $sbhl_search_module_type$ = makeSymbol("*SBHL-SEARCH-MODULE-TYPE*");

    private static final SubLSymbol GET_SBHL_MODULE_TYPE = makeSymbol("GET-SBHL-MODULE-TYPE");

    public static final SubLSymbol $sbhl_add_node_to_result_test$ = makeSymbol("*SBHL-ADD-NODE-TO-RESULT-TEST*");

    private static final SubLSymbol GET_SBHL_ADD_NODE_TO_RESULT_TEST = makeSymbol("GET-SBHL-ADD-NODE-TO-RESULT-TEST");

    private static final SubLSymbol WITH_SBHL_MODULE = makeSymbol("WITH-SBHL-MODULE");

    private static final SubLList $list58 = list(list(makeSymbol("*GENL-INVERSE-MODE-P*"), NIL));

    private static final SubLList $list59 = list(makeSymbol("MODE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $genl_inverse_mode_p$ = makeSymbol("*GENL-INVERSE-MODE-P*");

    static private final SubLList $list61 = list(list(makeSymbol("*GENL-INVERSE-MODE-P*"), T));

    private static final SubLList $list62 = list(list(makeSymbol("*GENL-INVERSE-MODE-P*"), list(makeSymbol("FIF"), list(makeSymbol("SBHL-MODULE-FLIPS-INVERSE-MODE-P")), list(makeSymbol("CNOT"), makeSymbol("*GENL-INVERSE-MODE-P*")), makeSymbol("*GENL-INVERSE-MODE-P*"))));

    static private final SubLList $list63 = list(list(makeSymbol("*GENL-INVERSE-MODE-P*"), list(makeSymbol("FIF"), list(makeSymbol("FLIP-GENL-INVERSE-MODE?")), list(makeSymbol("CNOT"), makeSymbol("*GENL-INVERSE-MODE-P*")), makeSymbol("*GENL-INVERSE-MODE-P*"))));

    static private final SubLList $list64 = list(list(makeSymbol("*GENL-INVERSE-MODE-P*"), list(makeSymbol("FIF"), list(EQL, list(makeSymbol("GET-SBHL-LINK-PRED"), list(makeSymbol("GET-SBHL-SEARCH-MODULE"))), reader_make_constant_shell("negationInverse")), T, makeSymbol("*GENL-INVERSE-MODE-P*"))));

    static private final SubLList $list65 = list(list(makeSymbol("*GENL-INVERSE-MODE-P*"), list(makeSymbol("CNOT"), makeSymbol("*GENL-INVERSE-MODE-P*"))));

    static private final SubLList $list66 = list(makeSymbol("START-MARKING"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym67$PRED = makeUninternedSymbol("PRED");

    static private final SubLList $list68 = list(makeSymbol("SBHL-MODULE-INDICATES-PREDICATE-SEARCH-P"), list(makeSymbol("GET-SBHL-SEARCH-MODULE")));

    public static final SubLSymbol $sbhl_add_unmarked_node_to_result_test$ = makeSymbol("*SBHL-ADD-UNMARKED-NODE-TO-RESULT-TEST*");

    private static final SubLList $list72 = list(reader_make_constant_shell("genlInverse"));

    private static final SubLList $list75 = list(makeSymbol("DIRECTION"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sbhl_search_direction$ = makeSymbol("*SBHL-SEARCH-DIRECTION*");

    private static final SubLSymbol WITH_SBHL_SEARCH_DIRECTION = makeSymbol("WITH-SBHL-SEARCH-DIRECTION");

    private static final SubLList $list78 = list(makeSymbol("GET-SBHL-FORWARD-SEARCH-DIRECTION"));

    private static final SubLList $list79 = list(makeSymbol("GET-SBHL-BACKWARD-SEARCH-DIRECTION"));

    static private final SubLList $list80 = list(list(makeSymbol("*SBHL-SEARCH-INDEX-ARG*"), list(makeSymbol("FIF"), list(EQ, makeSymbol("*SBHL-SEARCH-DIRECTION*"), makeKeyword("FORWARD")), list(makeSymbol("GET-SBHL-INDEX-ARG"), list(makeSymbol("GET-SBHL-MODULE"))), list(makeSymbol("GET-SBHL-GATHER-ARG"), list(makeSymbol("GET-SBHL-MODULE"))))));

    static private final SubLList $list81 = list(makeSymbol("FUNCTION"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sbhl_map_function$ = makeSymbol("*SBHL-MAP-FUNCTION*");

    public static final SubLSymbol $sbhl_unwind_function$ = makeSymbol("*SBHL-UNWIND-FUNCTION*");

    private static final SubLList $list84 = list(list(makeSymbol("*SBHL-APPLY-UNWIND-FUNCTION-P*"), T));

    private static final SubLList $list85 = list(list(makeSymbol("*SBHL-APPLY-UNWIND-FUNCTION-P*"), NIL));

    static private final SubLList $list86 = list(list(makeSymbol("*SBHL-SEARCH-PARENT-MARKING*"), NIL));

    static private final SubLList $list87 = list(list(makeSymbol("*SBHL-SEARCH-PARENT-MARKING*"), makeSymbol("*SBHL-SEARCH-PARENT-MARKING*")));

    static private final SubLList $list88 = list(list(makeSymbol("*SBHL-NODES-PREVIOUS-MARKING*"), NIL));

    static private final SubLList $list89 = list(list(makeSymbol("*SBHL-FINISHED?*"), NIL));

    private static final SubLList $list92 = list(list(makeSymbol("*SBHL-STOP-SEARCH-PATH?*"), NIL));

    private static final SubLList $list93 = list(makeSymbol("NODE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sbhl_target_node$ = makeSymbol("*SBHL-TARGET-NODE*");

    public static final SubLSymbol $sbhl_goal_node$ = makeSymbol("*SBHL-GOAL-NODE*");

    private static final SubLList $list96 = list(makeSymbol("NODES"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym97$_SBHL_ISA__GOAL_ = makeSymbol("*SBHL-ISA?-GOAL*");

    static private final SubLList $list98 = list(makeSymbol("RESULT-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list99 = list(makeSymbol("*SBHL-RESULT*"));

    private static final SubLList $list102 = list(makeSymbol("*SBHL-JUSTIFICATION-RESULT*"));

    private static final SubLList $list103 = list(makeSymbol("FN"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sbhl_consider_node_fn$ = makeSymbol("*SBHL-CONSIDER-NODE-FN*");

    public static final SubLSymbol $sbhl_compose_fn$ = makeSymbol("*SBHL-COMPOSE-FN*");

    public static final SubLSymbol $sbhl_combine_fn$ = makeSymbol("*SBHL-COMBINE-FN*");

    public static final SubLSymbol $sbhl_map_test_fn$ = makeSymbol("*SBHL-MAP-TEST-FN*");

    private static final SubLList $list109 = list(list(makeSymbol("*SBHL-ACCESSED-GATHER-NODES*"), NIL));

    public static final SubLSymbol $sbhl_dependents_cut_node$ = makeSymbol("*SBHL-DEPENDENTS-CUT-NODE*");

    static private final SubLList $list111 = list(makeSymbol("ARG"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sbhl_access_arg$ = makeSymbol("*SBHL-ACCESS-ARG*");

    static private final SubLList $list113 = list(makeSymbol("REF"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sbhl_referent$ = makeSymbol("*SBHL-REFERENT*");

    static private final SubLList $list115 = list(list(makeSymbol("*SBHL-CURRENT-LEAF-QUEUE*"), list(makeSymbol("CREATE-QUEUE"))));

    private static final SubLSymbol $sym116$QUEUE = makeUninternedSymbol("QUEUE");

    private static final SubLList $list118 = list(list(makeSymbol("CREATE-QUEUE")));

    public static final SubLSymbol $sbhl_sample_leaf_queues$ = makeSymbol("*SBHL-SAMPLE-LEAF-QUEUES*");

    private static final SubLList $list121 = list(list(makeSymbol("NODE-VAR"), makeSymbol("FOUND-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym122$QUEUE = makeUninternedSymbol("QUEUE");

    private static final SubLList $list126 = list(list(makeSymbol("FIRST"), makeSymbol("*SBHL-SAMPLE-LEAF-QUEUES*")));

    private static final SubLSymbol QUEUE_ELEMENTS = makeSymbol("QUEUE-ELEMENTS");

    private static final SubLSymbol WITH_NEW_SBHL_LEAF_QUEUE = makeSymbol("WITH-NEW-SBHL-LEAF-QUEUE");

    private static final SubLList $list131 = list(makeSymbol("LAST"), makeSymbol("*SBHL-SAMPLE-LEAF-QUEUES*"));

    private static final SubLList $list132 = list(makeSymbol("*SBHL-CURRENT-LEAF-QUEUE*"));

    static private final SubLList $list133 = list(list(makeSymbol("CSETQ"), makeSymbol("*SBHL-SAMPLE-LEAF-QUEUES*"), list(makeSymbol("CDR"), makeSymbol("*SBHL-SAMPLE-LEAF-QUEUES*"))));

    static private final SubLList $list135 = list(list(makeSymbol("CSETQ"), makeSymbol("*SBHL-SAMPLE-LEAF-QUEUES*"), list(makeSymbol("REMOVE-IF"), list(QUOTE, makeSymbol("QUEUE-EMPTY-P")), makeSymbol("*SBHL-SAMPLE-LEAF-QUEUES*"))));

    public static final SubLSymbol $sbhl_extremal_test_fn$ = makeSymbol("*SBHL-EXTREMAL-TEST-FN*");

    static private final SubLList $list137 = list(list(makeSymbol("*SBHL-CHECK-FOR-GOAL-MARKING-P*"), T));

    private static final SubLList $list138 = list(makeSymbol("GOAL-SPACE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sbhl_precomputed_goal_space$ = makeSymbol("*SBHL-PRECOMPUTED-GOAL-SPACE*");

    static private final SubLList $list140 = list(list(makeSymbol("*SBHL-SEARCH-TRUTH*"), reader_make_constant_shell("True-JustificationTruth")));

    private static final SubLList $list141 = list(list(makeSymbol("*SBHL-SEARCH-TRUTH*"), reader_make_constant_shell("False-JustificationTruth")));

    static private final SubLList $list142 = list(reader_make_constant_shell("MonotonicallyTrue"), reader_make_constant_shell("DefaultTrue"), reader_make_constant_shell("MonotonicallyFalse"), reader_make_constant_shell("DefaultFalse"), reader_make_constant_shell("True-JustificationTruth"), reader_make_constant_shell("False-JustificationTruth"), reader_make_constant_shell("ArbitraryTruth-JustificationTruth"));

    private static final SubLObject $$True_JustificationTruth = reader_make_constant_shell("True-JustificationTruth");

    private static final SubLObject $$False_JustificationTruth = reader_make_constant_shell("False-JustificationTruth");





    private static final SubLObject $$ArbitraryTruth_JustifactionTruth = reader_make_constant_shell("ArbitraryTruth-JustifactionTruth");

    private static final SubLObject $$ArbitraryTruth_JustificationTruth = reader_make_constant_shell("ArbitraryTruth-JustificationTruth");







    private static final SubLObject $$Unknown_JustificationTruth = reader_make_constant_shell("Unknown-JustificationTruth");

    private static final SubLString $str154$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLSymbol SBHL_SEARCH_TRUTH_VALUE_P = makeSymbol("SBHL-SEARCH-TRUTH-VALUE-P");

    private static final SubLString $$$continue_anyway = makeString("continue anyway");

    private static final SubLString $str159$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLString $str160$Expected_true_or_false_sbhl_truth = makeString("Expected true or false sbhl truth value. tv: ~a~%");

    private static final SubLString $str163$unknown_truth_value_for_translati = makeString("unknown truth value for translation: ~a");

    private static final SubLString $str168$Cannot_translate__s_truth_to_an_s = makeString("Cannot translate ~s truth to an sbhl-tv");

    public static final SubLSymbol $relevant_sbhl_tv_function$ = makeSymbol("*RELEVANT-SBHL-TV-FUNCTION*");

    private static final SubLList $list170 = list(makeSymbol("SBHL-TV"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sbhl_tv$ = makeSymbol("*SBHL-TV*");

    private static final SubLSymbol WITH_SBHL_TV_FUNCTION = makeSymbol("WITH-SBHL-TV-FUNCTION");

    private static final SubLList $list173 = list(makeSymbol("FUNCTION"), makeSymbol("RELEVANT-SBHL-TV-IS-EVERYTHING"));

    private static final SubLList $list174 = list(makeSymbol("FUNCTION"), makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV"));

    private static final SubLSymbol WITH_SBHL_TV = makeSymbol("WITH-SBHL-TV");

    static private final SubLList $list176 = list(makeSymbol("FUNCTION"), makeSymbol("RELEVANT-SBHL-TV-IS-EQ"));

    private static final SubLList $list177 = list(makeSymbol("TV"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym178$TV_VAR = makeUninternedSymbol("TV-VAR");

    private static final SubLList $list180 = list(makeSymbol("*SBHL-TV*"));

    private static final SubLList $list181 = list(list(QUOTE, makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV")), makeSymbol("*RELEVANT-SBHL-TV-FUNCTION*"));

    private static final SubLSymbol SBHL_CHECK_TYPE = makeSymbol("SBHL-CHECK-TYPE");

    private static final SubLList $list184 = list(makeSymbol("SBHL-SEARCH-TRUTH-VALUE-P"));

    private static final SubLSymbol $sym185$TV_VAR = makeUninternedSymbol("TV-VAR");

    static private final SubLList $list186 = list(list(makeSymbol("GET-SBHL-TRUE-TV")));

    private static final SubLList $list187 = list(makeSymbol("SBHL-TRUE-TV-P"));

    private static final SubLSymbol $sym188$TV_VAR = makeUninternedSymbol("TV-VAR");

    static private final SubLList $list189 = list(list(makeSymbol("GET-SBHL-FALSE-TV")));

    private static final SubLList $list190 = list(makeSymbol("SBHL-FALSE-TV-P"));

    static private final SubLList $list191 = list(makeSymbol("MT"), makeSymbol("&BODY"), makeSymbol("BODY"));

    // Definitions
    /**
     * Initializes a new *sbhl-space* and *sbhl-gather-space*, and resets *sbhl-finished?* to nil
     */
    @LispMethod(comment = "Initializes a new *sbhl-space* and *sbhl-gather-space*, and resets *sbhl-finished?* to nil")
    public static final SubLObject initialize_sbhl_search_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(POSSIBLY_WITH_NEW_SBHL_SPACES, list(WITH_NEW_SBHL_FINISHED, list(WITH_NEW_SBHL_STOP_SEARCH_PATH, list(RESET_SBHL_SEARCH_PARENT_MARKING, list(WITH_NEW_SBHL_PREVIOUS_MARKING, list(WITH_NEW_SBHL_PREDICATE_MODE_SCOPE, bq_cons(WITH_SBHL_READER_LOCK, append(body, NIL))))))));
        }
    }

    // Definitions
    /**
     * Initializes a new *sbhl-space* and *sbhl-gather-space*, and resets *sbhl-finished?* to nil
     */
    @LispMethod(comment = "Initializes a new *sbhl-space* and *sbhl-gather-space*, and resets *sbhl-finished?* to nil")
    public static SubLObject initialize_sbhl_search(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(POSSIBLY_WITH_NEW_SBHL_SPACES, list(WITH_NEW_SBHL_FINISHED, list(WITH_NEW_SBHL_STOP_SEARCH_PATH, list(RESET_SBHL_SEARCH_PARENT_MARKING, list(WITH_NEW_SBHL_PREVIOUS_MARKING, list(WITH_NEW_SBHL_PREDICATE_MODE_SCOPE, bq_cons(WITH_SBHL_READER_LOCK, append(body, NIL))))))));
    }

    public static final SubLObject initialize_sbhl_search_wXo_spaces_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(WITH_NEW_SBHL_FINISHED, list(WITH_NEW_SBHL_STOP_SEARCH_PATH, list(RESET_SBHL_SEARCH_PARENT_MARKING, list(WITH_NEW_SBHL_PREVIOUS_MARKING, list(WITH_NEW_SBHL_PREDICATE_MODE_SCOPE, bq_cons(WITH_SBHL_READER_LOCK, append(body, NIL)))))));
        }
    }

    public static SubLObject initialize_sbhl_search_wXo_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_NEW_SBHL_FINISHED, list(WITH_NEW_SBHL_STOP_SEARCH_PATH, list(RESET_SBHL_SEARCH_PARENT_MARKING, list(WITH_NEW_SBHL_PREVIOUS_MARKING, list(WITH_NEW_SBHL_PREDICATE_MODE_SCOPE, bq_cons(WITH_SBHL_READER_LOCK, append(body, NIL)))))));
    }

    /**
     * Binds *sbhl-search-truth*, *sbhl-search-direction*, and *sbhl-link-direction*
     */
    @LispMethod(comment = "Binds *sbhl-search-truth*, *sbhl-search-direction*, and *sbhl-link-direction*")
    public static final SubLObject with_sbhl_forward_true_conditions_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(WITH_SBHL_TRUE_SEARCH, list(WITH_SBHL_FORWARD_SEARCH_DIRECTION, bq_cons(WITH_SBHL_FORWARD_LINK_DIRECTION, append(body, NIL))));
        }
    }

    /**
     * Binds *sbhl-search-truth*, *sbhl-search-direction*, and *sbhl-link-direction*
     */
    @LispMethod(comment = "Binds *sbhl-search-truth*, *sbhl-search-direction*, and *sbhl-link-direction*")
    public static SubLObject with_sbhl_forward_true_conditions(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_SBHL_TRUE_SEARCH, list(WITH_SBHL_FORWARD_SEARCH_DIRECTION, bq_cons(WITH_SBHL_FORWARD_LINK_DIRECTION, append(body, NIL))));
    }

    /**
     * Binds *sbhl-search-truth*, *sbhl-search-direction*, and *sbhl-link-direction*
     */
    @LispMethod(comment = "Binds *sbhl-search-truth*, *sbhl-search-direction*, and *sbhl-link-direction*")
    public static final SubLObject with_sbhl_backward_true_conditions_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(WITH_SBHL_TRUE_SEARCH, list(WITH_SBHL_BACKWARD_SEARCH_DIRECTION, bq_cons(WITH_SBHL_BACKWARD_LINK_DIRECTION, append(body, NIL))));
        }
    }

    /**
     * Binds *sbhl-search-truth*, *sbhl-search-direction*, and *sbhl-link-direction*
     */
    @LispMethod(comment = "Binds *sbhl-search-truth*, *sbhl-search-direction*, and *sbhl-link-direction*")
    public static SubLObject with_sbhl_backward_true_conditions(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_SBHL_TRUE_SEARCH, list(WITH_SBHL_BACKWARD_SEARCH_DIRECTION, bq_cons(WITH_SBHL_BACKWARD_LINK_DIRECTION, append(body, NIL))));
    }

    /**
     * Binds *sbhl-search-truth*, *sbhl-search-direction*, and *sbhl-link-direction*
     */
    @LispMethod(comment = "Binds *sbhl-search-truth*, *sbhl-search-direction*, and *sbhl-link-direction*")
    public static final SubLObject with_sbhl_forward_false_conditions_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(WITH_SBHL_FALSE_SEARCH, list(WITH_SBHL_FORWARD_SEARCH_DIRECTION, bq_cons(WITH_SBHL_FORWARD_LINK_DIRECTION, append(body, NIL))));
        }
    }

    /**
     * Binds *sbhl-search-truth*, *sbhl-search-direction*, and *sbhl-link-direction*
     */
    @LispMethod(comment = "Binds *sbhl-search-truth*, *sbhl-search-direction*, and *sbhl-link-direction*")
    public static SubLObject with_sbhl_forward_false_conditions(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_SBHL_FALSE_SEARCH, list(WITH_SBHL_FORWARD_SEARCH_DIRECTION, bq_cons(WITH_SBHL_FORWARD_LINK_DIRECTION, append(body, NIL))));
    }

    /**
     * Binds *sbhl-search-truth*, *sbhl-search-direction*, and *sbhl-link-direction*
     */
    @LispMethod(comment = "Binds *sbhl-search-truth*, *sbhl-search-direction*, and *sbhl-link-direction*")
    public static final SubLObject with_sbhl_backward_false_conditions_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(WITH_SBHL_FALSE_SEARCH, list(WITH_SBHL_BACKWARD_SEARCH_DIRECTION, bq_cons(WITH_SBHL_BACKWARD_LINK_DIRECTION, append(body, NIL))));
        }
    }

    /**
     * Binds *sbhl-search-truth*, *sbhl-search-direction*, and *sbhl-link-direction*
     */
    @LispMethod(comment = "Binds *sbhl-search-truth*, *sbhl-search-direction*, and *sbhl-link-direction*")
    public static SubLObject with_sbhl_backward_false_conditions(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_SBHL_FALSE_SEARCH, list(WITH_SBHL_BACKWARD_SEARCH_DIRECTION, bq_cons(WITH_SBHL_BACKWARD_LINK_DIRECTION, append(body, NIL))));
    }

    /**
     * Sets the environment for search, initializing mt, tv, search spaces, search direction, and link direction.
     */
    @LispMethod(comment = "Sets the environment for search, initializing mt, tv, search spaces, search direction, and link direction.")
    public static final SubLObject with_sbhl_forward_true_search_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt13);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt13);
            tv = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(POSSIBLY_WITH_SBHL_MT_RELEVANCE, mt, list(POSSIBLY_WITH_SBHL_TRUE_TV, tv, list(WITH_SBHL_FORWARD_TRUE_CONDITIONS, bq_cons(INITIALIZE_SBHL_SEARCH, append(body, NIL)))));
            }
        }
    }

    /**
     * Sets the environment for search, initializing mt, tv, search spaces, search direction, and link direction.
     */
    @LispMethod(comment = "Sets the environment for search, initializing mt, tv, search spaces, search direction, and link direction.")
    public static SubLObject with_sbhl_forward_true_search(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(current, datum, $list13);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list13);
        tv = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(POSSIBLY_WITH_SBHL_MT_RELEVANCE, mt, list(POSSIBLY_WITH_SBHL_TRUE_TV, tv, list(WITH_SBHL_FORWARD_TRUE_CONDITIONS, bq_cons(INITIALIZE_SBHL_SEARCH, append(body, NIL)))));
    }

    /**
     * Sets the environment for search, initializing mt, tv, search spaces, search direction, and link direction.
     */
    @LispMethod(comment = "Sets the environment for search, initializing mt, tv, search spaces, search direction, and link direction.")
    public static final SubLObject with_sbhl_backward_true_search_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt13);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt13);
            tv = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(POSSIBLY_WITH_SBHL_MT_RELEVANCE, mt, list(POSSIBLY_WITH_SBHL_TRUE_TV, tv, list(WITH_SBHL_BACKWARD_TRUE_CONDITIONS, bq_cons(INITIALIZE_SBHL_SEARCH, append(body, NIL)))));
            }
        }
    }

    /**
     * Sets the environment for search, initializing mt, tv, search spaces, search direction, and link direction.
     */
    @LispMethod(comment = "Sets the environment for search, initializing mt, tv, search spaces, search direction, and link direction.")
    public static SubLObject with_sbhl_backward_true_search(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(current, datum, $list13);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list13);
        tv = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(POSSIBLY_WITH_SBHL_MT_RELEVANCE, mt, list(POSSIBLY_WITH_SBHL_TRUE_TV, tv, list(WITH_SBHL_BACKWARD_TRUE_CONDITIONS, bq_cons(INITIALIZE_SBHL_SEARCH, append(body, NIL)))));
    }

    /**
     * Sets the environment for search, initializing mt, tv, search spaces, search direction, and link direction.
     */
    @LispMethod(comment = "Sets the environment for search, initializing mt, tv, search spaces, search direction, and link direction.")
    public static final SubLObject with_sbhl_forward_false_search_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt13);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt13);
            tv = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(POSSIBLY_WITH_SBHL_MT_RELEVANCE, mt, list(POSSIBLY_WITH_SBHL_FALSE_TV, tv, list(WITH_SBHL_FORWARD_FALSE_CONDITIONS, bq_cons(INITIALIZE_SBHL_SEARCH, append(body, NIL)))));
            }
        }
    }

    /**
     * Sets the environment for search, initializing mt, tv, search spaces, search direction, and link direction.
     */
    @LispMethod(comment = "Sets the environment for search, initializing mt, tv, search spaces, search direction, and link direction.")
    public static SubLObject with_sbhl_forward_false_search(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(current, datum, $list13);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list13);
        tv = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(POSSIBLY_WITH_SBHL_MT_RELEVANCE, mt, list(POSSIBLY_WITH_SBHL_FALSE_TV, tv, list(WITH_SBHL_FORWARD_FALSE_CONDITIONS, bq_cons(INITIALIZE_SBHL_SEARCH, append(body, NIL)))));
    }

    /**
     * Sets the environment for search, initializing mt, tv, search spaces, search direction, and link direction.
     */
    @LispMethod(comment = "Sets the environment for search, initializing mt, tv, search spaces, search direction, and link direction.")
    public static final SubLObject with_sbhl_backward_false_search_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt13);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt13);
            tv = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(POSSIBLY_WITH_SBHL_MT_RELEVANCE, mt, list(POSSIBLY_WITH_SBHL_FALSE_TV, tv, list(WITH_SBHL_BACKWARD_FALSE_CONDITIONS, bq_cons(INITIALIZE_SBHL_SEARCH, append(body, NIL)))));
            }
        }
    }

    /**
     * Sets the environment for search, initializing mt, tv, search spaces, search direction, and link direction.
     */
    @LispMethod(comment = "Sets the environment for search, initializing mt, tv, search spaces, search direction, and link direction.")
    public static SubLObject with_sbhl_backward_false_search(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(current, datum, $list13);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list13);
        tv = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(POSSIBLY_WITH_SBHL_MT_RELEVANCE, mt, list(POSSIBLY_WITH_SBHL_FALSE_TV, tv, list(WITH_SBHL_BACKWARD_FALSE_CONDITIONS, bq_cons(INITIALIZE_SBHL_SEARCH, append(body, NIL)))));
    }

    /**
     * Sets the environment for search, and assumes mt and tv relevance have been set.
     */
    @LispMethod(comment = "Sets the environment for search, and assumes mt and tv relevance have been set.")
    public static final SubLObject with_sbhl_forward_true_subsearch_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(WITH_SBHL_FORWARD_TRUE_CONDITIONS, bq_cons(INITIALIZE_SBHL_SEARCH, append(body, NIL)));
        }
    }

    /**
     * Sets the environment for search, and assumes mt and tv relevance have been set.
     */
    @LispMethod(comment = "Sets the environment for search, and assumes mt and tv relevance have been set.")
    public static SubLObject with_sbhl_forward_true_subsearch(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_SBHL_FORWARD_TRUE_CONDITIONS, bq_cons(INITIALIZE_SBHL_SEARCH, append(body, NIL)));
    }

    /**
     * Sets the environment for search, and assumes mt and tv relevance have been set.
     */
    @LispMethod(comment = "Sets the environment for search, and assumes mt and tv relevance have been set.")
    public static final SubLObject with_sbhl_backward_true_subsearch_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(WITH_SBHL_BACKWARD_TRUE_CONDITIONS, bq_cons(INITIALIZE_SBHL_SEARCH, append(body, NIL)));
        }
    }

    /**
     * Sets the environment for search, and assumes mt and tv relevance have been set.
     */
    @LispMethod(comment = "Sets the environment for search, and assumes mt and tv relevance have been set.")
    public static SubLObject with_sbhl_backward_true_subsearch(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_SBHL_BACKWARD_TRUE_CONDITIONS, bq_cons(INITIALIZE_SBHL_SEARCH, append(body, NIL)));
    }

    /**
     * Sets the environment for search, and assumes mt and tv relevance have been set.
     */
    @LispMethod(comment = "Sets the environment for search, and assumes mt and tv relevance have been set.")
    public static final SubLObject with_sbhl_forward_false_subsearch_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(WITH_SBHL_FORWARD_FALSE_CONDITIONS, bq_cons(INITIALIZE_SBHL_SEARCH, append(body, NIL)));
        }
    }

    /**
     * Sets the environment for search, and assumes mt and tv relevance have been set.
     */
    @LispMethod(comment = "Sets the environment for search, and assumes mt and tv relevance have been set.")
    public static SubLObject with_sbhl_forward_false_subsearch(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_SBHL_FORWARD_FALSE_CONDITIONS, bq_cons(INITIALIZE_SBHL_SEARCH, append(body, NIL)));
    }

    /**
     * Sets the environment for search, and assumes mt and tv relevance have been set.
     */
    @LispMethod(comment = "Sets the environment for search, and assumes mt and tv relevance have been set.")
    public static final SubLObject with_sbhl_backward_false_subsearch_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(WITH_SBHL_BACKWARD_FALSE_CONDITIONS, bq_cons(INITIALIZE_SBHL_SEARCH, append(body, NIL)));
        }
    }

    /**
     * Sets the environment for search, and assumes mt and tv relevance have been set.
     */
    @LispMethod(comment = "Sets the environment for search, and assumes mt and tv relevance have been set.")
    public static SubLObject with_sbhl_backward_false_subsearch(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_SBHL_BACKWARD_FALSE_CONDITIONS, bq_cons(INITIALIZE_SBHL_SEARCH, append(body, NIL)));
    }

    /**
     * Accessor. @return booleanp; whether TYPE is a valid @see *sbhl-search-type*
     */
    @LispMethod(comment = "Accessor. @return booleanp; whether TYPE is a valid @see *sbhl-search-type*")
    public static final SubLObject sbhl_search_type_p_alt(SubLObject type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return subl_promotions.memberP(type, $sbhl_search_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     * Accessor. @return booleanp; whether TYPE is a valid @see *sbhl-search-type*
     */
    @LispMethod(comment = "Accessor. @return booleanp; whether TYPE is a valid @see *sbhl-search-type*")
    public static SubLObject sbhl_search_type_p(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(type, $sbhl_search_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Accessor. @see *sbhl-search-type*
     */
    @LispMethod(comment = "Accessor. @see *sbhl-search-type*")
    public static final SubLObject get_sbhl_search_type_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_search_type$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor. @see *sbhl-search-type*
     */
    @LispMethod(comment = "Accessor. @see *sbhl-search-type*")
    public static SubLObject get_sbhl_search_type() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_search_type$.getDynamicValue(thread);
    }

    /**
     * Binds @see *sbhl-search-type*.
     */
    @LispMethod(comment = "Binds @see *sbhl-search-type*.")
    public static final SubLObject with_sbhl_search_type_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject type = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            type = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sbhl_search_type$, type)), append(body, NIL));
            }
        }
    }

    /**
     * Binds @see *sbhl-search-type*.
     */
    @LispMethod(comment = "Binds @see *sbhl-search-type*.")
    public static SubLObject with_sbhl_search_type(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject type = NIL;
        destructuring_bind_must_consp(current, datum, $list23);
        type = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_search_type$, type)), append(body, NIL));
    }

    /**
     * Binds *sbhl-search-type* to :closure
     */
    @LispMethod(comment = "Binds *sbhl-search-type* to :closure")
    public static final SubLObject with_sbhl_closure_search_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_SBHL_SEARCH_TYPE, $CLOSURE, append(body, NIL));
        }
    }

    /**
     * Binds *sbhl-search-type* to :closure
     */
    @LispMethod(comment = "Binds *sbhl-search-type* to :closure")
    public static SubLObject with_sbhl_closure_search(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_SBHL_SEARCH_TYPE, $CLOSURE, append(body, NIL));
    }

    /**
     * Binds *sbhl-search-type* to :boolean
     */
    @LispMethod(comment = "Binds *sbhl-search-type* to :boolean")
    public static final SubLObject with_sbhl_boolean_search_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_SBHL_SEARCH_TYPE, $BOOLEAN, append(body, NIL));
        }
    }

    /**
     * Binds *sbhl-search-type* to :boolean
     */
    @LispMethod(comment = "Binds *sbhl-search-type* to :boolean")
    public static SubLObject with_sbhl_boolean_search(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_SBHL_SEARCH_TYPE, $BOOLEAN, append(body, NIL));
    }

    /**
     * Binds *sbhl-search-type* to :what-mts
     */
    @LispMethod(comment = "Binds *sbhl-search-type* to :what-mts")
    public static final SubLObject with_sbhl_what_mts_search_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_SBHL_SEARCH_TYPE, $WHAT_MTS, append(body, NIL));
        }
    }

    /**
     * Binds *sbhl-search-type* to :what-mts
     */
    @LispMethod(comment = "Binds *sbhl-search-type* to :what-mts")
    public static SubLObject with_sbhl_what_mts_search(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_SBHL_SEARCH_TYPE, $WHAT_MTS, append(body, NIL));
    }

    /**
     * Accessor: @return booleanp; whether search type indicates closure search
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether search type indicates closure search")
    public static final SubLObject sbhl_closure_search_p_alt() {
        return eq(com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.get_sbhl_search_type(), $CLOSURE);
    }

    /**
     * Accessor: @return booleanp; whether search type indicates closure search
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether search type indicates closure search")
    public static SubLObject sbhl_closure_search_p() {
        return eq(get_sbhl_search_type(), $CLOSURE);
    }

    /**
     * Accessor: @return booleanp; whether search type indicates boolean search
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether search type indicates boolean search")
    public static final SubLObject sbhl_boolean_search_p_alt() {
        return eq(com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.get_sbhl_search_type(), $BOOLEAN);
    }

    /**
     * Accessor: @return booleanp; whether search type indicates boolean search
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether search type indicates boolean search")
    public static SubLObject sbhl_boolean_search_p() {
        return eq(get_sbhl_search_type(), $BOOLEAN);
    }

    /**
     * Accessor: @return booleanp; whether search type indicates what mts search
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether search type indicates what mts search")
    public static final SubLObject sbhl_what_mts_search_p_alt() {
        return eq(com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.get_sbhl_search_type(), $WHAT_MTS);
    }

    /**
     * Accessor: @return booleanp; whether search type indicates what mts search
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether search type indicates what mts search")
    public static SubLObject sbhl_what_mts_search_p() {
        return eq(get_sbhl_search_type(), $WHAT_MTS);
    }

    /**
     * Accessor: @return booleanp; whether search type indicates a search that terminates recursion at a goal.
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether search type indicates a search that terminates recursion at a goal.")
    public static final SubLObject sbhl_goal_search_p_alt() {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.sbhl_boolean_search_p()) || (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.sbhl_justification_search_p()));
    }

    /**
     * Accessor: @return booleanp; whether search type indicates a search that terminates recursion at a goal.
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether search type indicates a search that terminates recursion at a goal.")
    public static SubLObject sbhl_goal_search_p() {
        return makeBoolean((NIL != sbhl_boolean_search_p()) || (NIL != sbhl_justification_search_p()));
    }

    /**
     * Accessor: @return booleanp; whether current search is one that gathers justifications.
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether current search is one that gathers justifications.")
    public static final SubLObject sbhl_justification_search_p_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_justification_search_p$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor: @return booleanp; whether current search is one that gathers justifications.
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether current search is one that gathers justifications.")
    public static SubLObject sbhl_justification_search_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_justification_search_p$.getDynamicValue(thread);
    }

    /**
     * Binds variables for indicating justification search and for unwind behavior after goal of justification is found.
     */
    @LispMethod(comment = "Binds variables for indicating justification search and for unwind behavior after goal of justification is found.")
    public static final SubLObject with_sbhl_justification_search_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(CLET, $list_alt30, bq_cons(WITHOUT_SBHL_CACHES, append(body, NIL)));
        }
    }

    /**
     * Binds variables for indicating justification search and for unwind behavior after goal of justification is found.
     */
    @LispMethod(comment = "Binds variables for indicating justification search and for unwind behavior after goal of justification is found.")
    public static SubLObject with_sbhl_justification_search(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list30, append(body, NIL));
    }

    /**
     * Ensures that no justification is done within BODY.
     */
    @LispMethod(comment = "Ensures that no justification is done within BODY.")
    public static final SubLObject without_sbhl_justification_search_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(CLET, $list_alt32, bq_cons(WITH_SBHL_CACHES, append(body, NIL)));
        }
    }

    /**
     * Ensures that no justification is done within BODY.
     */
    @LispMethod(comment = "Ensures that no justification is done within BODY.")
    public static SubLObject without_sbhl_justification_search(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list31, append(body, NIL));
    }

    /**
     * Accessor. @return sbhl-module-p; @see *sbhl-search-behavior
     */
    @LispMethod(comment = "Accessor. @return sbhl-module-p; @see *sbhl-search-behavior")
    public static final SubLObject get_sbhl_search_behavior_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_search_behavior$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor. @return sbhl-module-p; @see *sbhl-search-behavior
     */
    @LispMethod(comment = "Accessor. @return sbhl-module-p; @see *sbhl-search-behavior")
    public static SubLObject get_sbhl_search_behavior() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_search_behavior$.getDynamicValue(thread);
    }

    public static final SubLObject with_sbhl_search_behavior_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject behavior = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt34);
            behavior = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sbhl_search_behavior$, behavior)), append(body, NIL));
            }
        }
    }

    public static SubLObject with_sbhl_search_behavior(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject behavior = NIL;
        destructuring_bind_must_consp(current, datum, $list32);
        behavior = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_search_behavior$, behavior)), append(body, NIL));
    }

    /**
     *
     *
     * @return keywordp; @see *sbhl-justification-behavior*
     */
    @LispMethod(comment = "@return keywordp; @see *sbhl-justification-behavior*")
    public static final SubLObject get_sbhl_just_behavior_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_justification_behavior$.getDynamicValue(thread);
        }
    }

    /**
     *
     *
     * @return keywordp; @see *sbhl-justification-behavior*
     */
    @LispMethod(comment = "@return keywordp; @see *sbhl-justification-behavior*")
    public static SubLObject get_sbhl_just_behavior() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_justification_behavior$.getDynamicValue(thread);
    }

    /**
     * Binds sbhl justification behavior.
     */
    @LispMethod(comment = "Binds sbhl justification behavior.")
    public static final SubLObject with_sbhl_justification_behavior_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject behavior = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt34);
            behavior = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sbhl_justification_behavior$, behavior)), append(body, NIL));
            }
        }
    }

    /**
     * Binds sbhl justification behavior.
     */
    @LispMethod(comment = "Binds sbhl justification behavior.")
    public static SubLObject with_sbhl_justification_behavior(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject behavior = NIL;
        destructuring_bind_must_consp(current, datum, $list32);
        behavior = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_justification_behavior$, behavior)), append(body, NIL));
    }

    /**
     * Binds sbhl justification behavior if non-nil
     */
    @LispMethod(comment = "Binds sbhl justification behavior if non-nil")
    public static final SubLObject possibly_with_sbhl_justification_behavior_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject behavior = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt34);
            behavior = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                if (NIL != behavior) {
                    return list(PIF, BEHAVIOR, listS(CLET, list(list($sbhl_justification_behavior$, behavior)), append(body, NIL)), bq_cons(PROGN, append(body, NIL)));
                } else {
                    return bq_cons(PROGN, append(body, NIL));
                }
            }
        }
    }

    /**
     * Binds sbhl justification behavior if non-nil
     */
    @LispMethod(comment = "Binds sbhl justification behavior if non-nil")
    public static SubLObject possibly_with_sbhl_justification_behavior(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject behavior = NIL;
        destructuring_bind_must_consp(current, datum, $list32);
        behavior = current.first();
        final SubLObject body;
        current = body = current.rest();
        if (NIL != behavior) {
            return list(PIF, BEHAVIOR, listS(CLET, list(list($sbhl_justification_behavior$, behavior)), append(body, NIL)), bq_cons(PROGN, append(body, NIL)));
        }
        return bq_cons(PROGN, append(body, NIL));
    }

    /**
     * Binds justification behavior to return a list of assertions.
     */
    @LispMethod(comment = "Binds justification behavior to return a list of assertions.")
    public static final SubLObject with_sbhl_assertion_justifications_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt41, append(body, NIL));
        }
    }

    /**
     * Binds justification behavior to return a list of assertions.
     */
    @LispMethod(comment = "Binds justification behavior to return a list of assertions.")
    public static SubLObject with_sbhl_assertion_justifications(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list39, append(body, NIL));
    }

    /**
     * Binds justification behavior to return a list of lists containing the gaf formula, mt, and tv.
     */
    @LispMethod(comment = "Binds justification behavior to return a list of lists containing the gaf formula, mt, and tv.")
    public static final SubLObject with_sbhl_verbose_justifications_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt42, append(body, NIL));
        }
    }

    /**
     * Binds justification behavior to return a list of lists containing the gaf formula, mt, and tv.
     */
    @LispMethod(comment = "Binds justification behavior to return a list of lists containing the gaf formula, mt, and tv.")
    public static SubLObject with_sbhl_verbose_justifications(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list40, append(body, NIL));
    }

    /**
     * Binds justification behavior to return a list of lists containing the gaf formula and mt.
     */
    @LispMethod(comment = "Binds justification behavior to return a list of lists containing the gaf formula and mt.")
    public static final SubLObject with_sbhl_old_justifications_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt43, append(body, NIL));
        }
    }

    /**
     * Binds justification behavior to return a list of lists containing the gaf formula and mt.
     */
    @LispMethod(comment = "Binds justification behavior to return a list of lists containing the gaf formula and mt.")
    public static SubLObject with_sbhl_old_justifications(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list41, append(body, NIL));
    }

    /**
     * Binds justification default for BODY. @see *sbhl-justification-defaulted-old*
     */
    @LispMethod(comment = "Binds justification default for BODY. @see *sbhl-justification-defaulted-old*")
    public static final SubLObject with_sbhl_justification_default_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt44, append(body, NIL));
        }
    }

    /**
     * Binds justification default for BODY. @see *sbhl-justification-defaulted-old*
     */
    @LispMethod(comment = "Binds justification default for BODY. @see *sbhl-justification-defaulted-old*")
    public static SubLObject with_sbhl_justification_default(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list42, append(body, NIL));
    }

    /**
     * Modifier: sets *sbhl-justification-defaulted-old* to t.
     */
    @LispMethod(comment = "Modifier: sets *sbhl-justification-defaulted-old* to t.")
    public static final SubLObject sbhl_justification_behavior_defaults_old_alt() {
        $sbhl_justification_defaulted_old$.setDynamicValue(T);
        return NIL;
    }

    /**
     * Modifier: sets *sbhl-justification-defaulted-old* to t.
     */
    @LispMethod(comment = "Modifier: sets *sbhl-justification-defaulted-old* to t.")
    public static SubLObject sbhl_justification_behavior_defaults_old() {
        $sbhl_justification_defaulted_old$.setDynamicValue(T);
        return NIL;
    }

    /**
     * Accessor: @return booleanp; *sbhl-justification-defaulted-old*
     */
    @LispMethod(comment = "Accessor: @return booleanp; *sbhl-justification-defaulted-old*")
    public static final SubLObject sbhl_justification_defaulted_old_p_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_justification_defaulted_old$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor: @return booleanp; *sbhl-justification-defaulted-old*
     */
    @LispMethod(comment = "Accessor: @return booleanp; *sbhl-justification-defaulted-old*")
    public static SubLObject sbhl_justification_defaulted_old_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_justification_defaulted_old$.getDynamicValue(thread);
    }

    /**
     * Modifier: flags that justification has already been assembled. @see *sbhl-justification-assembled-p*
     */
    @LispMethod(comment = "Modifier: flags that justification has already been assembled. @see *sbhl-justification-assembled-p*")
    public static final SubLObject sbhl_justification_assembled_alt() {
        $sbhl_justification_assembled_p$.setDynamicValue(T);
        return NIL;
    }

    /**
     * Modifier: flags that justification has already been assembled. @see *sbhl-justification-assembled-p*
     */
    @LispMethod(comment = "Modifier: flags that justification has already been assembled. @see *sbhl-justification-assembled-p*")
    public static SubLObject sbhl_justification_assembled() {
        $sbhl_justification_assembled_p$.setDynamicValue(T);
        return NIL;
    }

    /**
     * Binds *sbhl-justification-assembled-p* to nil for BODY.
     */
    @LispMethod(comment = "Binds *sbhl-justification-assembled-p* to nil for BODY.")
    public static final SubLObject with_sbhl_justification_unassembled_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt45, append(body, NIL));
        }
    }

    /**
     * Binds *sbhl-justification-assembled-p* to nil for BODY.
     */
    @LispMethod(comment = "Binds *sbhl-justification-assembled-p* to nil for BODY.")
    public static SubLObject with_sbhl_justification_unassembled(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list43, append(body, NIL));
    }

    /**
     * Accessor: @return booleanp; @see *sbhl-justification-assembled-p*
     */
    @LispMethod(comment = "Accessor: @return booleanp; @see *sbhl-justification-assembled-p*")
    public static final SubLObject sbhl_justification_assembled_p_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_justification_assembled_p$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor: @return booleanp; @see *sbhl-justification-assembled-p*
     */
    @LispMethod(comment = "Accessor: @return booleanp; @see *sbhl-justification-assembled-p*")
    public static SubLObject sbhl_justification_assembled_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_justification_assembled_p$.getDynamicValue(thread);
    }

    /**
     * Accessor. @return booleanp; @see *sbhl-unmarking-search-p*.
     */
    @LispMethod(comment = "Accessor. @return booleanp; @see *sbhl-unmarking-search-p*.")
    public static final SubLObject sbhl_unmarking_search_p_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_unmarking_search_p$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor. @return booleanp; @see *sbhl-unmarking-search-p*.
     */
    @LispMethod(comment = "Accessor. @return booleanp; @see *sbhl-unmarking-search-p*.")
    public static SubLObject sbhl_unmarking_search_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_unmarking_search_p$.getDynamicValue(thread);
    }

    /**
     * Binds *sbhl-unmarking-search-p* to t.
     */
    @LispMethod(comment = "Binds *sbhl-unmarking-search-p* to t.")
    public static final SubLObject with_sbhl_unmarking_search_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt46, append(body, NIL));
        }
    }

    /**
     * Binds *sbhl-unmarking-search-p* to t.
     */
    @LispMethod(comment = "Binds *sbhl-unmarking-search-p* to t.")
    public static SubLObject with_sbhl_unmarking_search(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list44, append(body, NIL));
    }

    /**
     * Binds *sbhl-unmarking-search-p* to NIL.
     */
    @LispMethod(comment = "Binds *sbhl-unmarking-search-p* to NIL.")
    public static final SubLObject without_sbhl_unmarking_search_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt47, append(body, NIL));
        }
    }

    /**
     * Binds *sbhl-unmarking-search-p* to NIL.
     */
    @LispMethod(comment = "Binds *sbhl-unmarking-search-p* to NIL.")
    public static SubLObject without_sbhl_unmarking_search(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list45, append(body, NIL));
    }

    /**
     * Accessor. @return sbhl-module-p; @see *sbhl-search-module*
     */
    @LispMethod(comment = "Accessor. @return sbhl-module-p; @see *sbhl-search-module*")
    public static final SubLObject get_sbhl_search_module_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $sbhl_search_module$.getDynamicValue(thread)) {
                Errors.warn($str_alt48$get_sbhl_search_module___sbhl_sea);
            }
            return $sbhl_search_module$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor. @return sbhl-module-p; @see *sbhl-search-module*
     */
    @LispMethod(comment = "Accessor. @return sbhl-module-p; @see *sbhl-search-module*")
    public static SubLObject get_sbhl_search_module() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $sbhl_search_module$.getDynamicValue(thread)) {
            Errors.warn($str46$get_sbhl_search_module___sbhl_sea);
        }
        return $sbhl_search_module$.getDynamicValue(thread);
    }

    /**
     * Accessor. @return keywordp; @see *sbhl-search-module-type*
     */
    @LispMethod(comment = "Accessor. @return keywordp; @see *sbhl-search-module-type*")
    public static final SubLObject get_sbhl_search_module_type_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_search_module_type$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor. @return keywordp; @see *sbhl-search-module-type*
     */
    @LispMethod(comment = "Accessor. @return keywordp; @see *sbhl-search-module-type*")
    public static SubLObject get_sbhl_search_module_type() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_search_module_type$.getDynamicValue(thread);
    }

    /**
     *
     *
     * @return function-spec-p; the function applied to a node's marking before pushing correctly marked nodes onto result. Determined by current *sbhl-search-module*.
     */
    @LispMethod(comment = "@return function-spec-p; the function applied to a node\'s marking before pushing correctly marked nodes onto result. Determined by current *sbhl-search-module*.")
    public static final SubLObject get_sbhl_search_add_node_test_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_add_node_to_result_test$.getDynamicValue(thread);
        }
    }

    /**
     *
     *
     * @return function-spec-p; the function applied to a node's marking before pushing correctly marked nodes onto result. Determined by current *sbhl-search-module*.
     */
    @LispMethod(comment = "@return function-spec-p; the function applied to a node\'s marking before pushing correctly marked nodes onto result. Determined by current *sbhl-search-module*.")
    public static SubLObject get_sbhl_search_add_node_test() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_add_node_to_result_test$.getDynamicValue(thread);
    }

    /**
     *
     *
     * @return function-spec-p; the function applied to a node's marking before pushing unmarked nodes onto result. Determined by current *sbhl-search-module*.
     */
    @LispMethod(comment = "@return function-spec-p; the function applied to a node\'s marking before pushing unmarked nodes onto result. Determined by current *sbhl-search-module*.")
    public static final SubLObject get_sbhl_search_add_unmarked_node_test_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_add_unmarked_node_to_result_test$.getDynamicValue(thread);
        }
    }

    /**
     *
     *
     * @return function-spec-p; the function applied to a node's marking before pushing unmarked nodes onto result. Determined by current *sbhl-search-module*.
     */
    @LispMethod(comment = "@return function-spec-p; the function applied to a node\'s marking before pushing unmarked nodes onto result. Determined by current *sbhl-search-module*.")
    public static SubLObject get_sbhl_search_add_unmarked_node_test() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_add_unmarked_node_to_result_test$.getDynamicValue(thread);
    }

    /**
     *
     *
     * @unknown genlInverse needs to use genlPreds to gather Nots Disjoins.
     */
    @LispMethod(comment = "@unknown genlInverse needs to use genlPreds to gather Nots Disjoins.")
    public static final SubLObject get_sbhl_search_gather_module_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (sbhl_module_vars.get_sbhl_module_link_pred($sbhl_search_module$.getDynamicValue(thread)) == $$genlInverse) {
                return sbhl_module_vars.get_sbhl_module($$genlPreds);
            } else {
                return $sbhl_search_module$.getDynamicValue(thread);
            }
        }
    }

    /**
     *
     *
     * @unknown genlInverse needs to use genlPreds to gather Nots Disjoins.
     */
    @LispMethod(comment = "@unknown genlInverse needs to use genlPreds to gather Nots Disjoins.")
    public static SubLObject get_sbhl_search_gather_module() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_module_vars.get_sbhl_module_link_pred($sbhl_search_module$.getDynamicValue(thread)).eql($$genlInverse)) {
            return sbhl_module_vars.get_sbhl_module($$genlPreds);
        }
        return $sbhl_search_module$.getDynamicValue(thread);
    }

    /**
     *
     *
     * @unknown negationInverse needs to use negationPreds to gather Disjoins.
     */
    @LispMethod(comment = "@unknown negationInverse needs to use negationPreds to gather Disjoins.")
    public static final SubLObject get_sbhl_disjoins_search_gather_module_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (sbhl_module_vars.get_sbhl_module_link_pred($sbhl_search_module$.getDynamicValue(thread)) == $$negationInverse) {
                return sbhl_module_vars.get_sbhl_module($$negationPreds);
            } else {
                return $sbhl_search_module$.getDynamicValue(thread);
            }
        }
    }

    /**
     *
     *
     * @unknown negationInverse needs to use negationPreds to gather Disjoins.
     */
    @LispMethod(comment = "@unknown negationInverse needs to use negationPreds to gather Disjoins.")
    public static SubLObject get_sbhl_disjoins_search_gather_module() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_module_vars.get_sbhl_module_link_pred($sbhl_search_module$.getDynamicValue(thread)).eql($$negationInverse)) {
            return sbhl_module_vars.get_sbhl_module($$negationPreds);
        }
        return $sbhl_search_module$.getDynamicValue(thread);
    }

    /**
     * Binds @see *sbhl-search-module*. Binds @see *sbhl-module. @see with-sbhl-module
     */
    @LispMethod(comment = "Binds @see *sbhl-search-module*. Binds @see *sbhl-module. @see with-sbhl-module")
    public static final SubLObject with_sbhl_search_module_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject module = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt53);
            module = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(CLET, list(list($sbhl_search_module$, module), list($sbhl_search_module_type$, list(GET_SBHL_MODULE_TYPE, module)), list($sbhl_add_node_to_result_test$, list(GET_SBHL_ADD_NODE_TO_RESULT_TEST, module))), list(WITH_NEW_SBHL_PREDICATE_MODE_SCOPE, listS(WITH_SBHL_MODULE, module, append(body, NIL))));
            }
        }
    }

    /**
     * Binds @see *sbhl-search-module*. Binds @see *sbhl-module. @see with-sbhl-module
     */
    @LispMethod(comment = "Binds @see *sbhl-search-module*. Binds @see *sbhl-module. @see with-sbhl-module")
    public static SubLObject with_sbhl_search_module(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject module = NIL;
        destructuring_bind_must_consp(current, datum, $list51);
        module = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(CLET, list(list($sbhl_search_module$, module), list($sbhl_search_module_type$, list(GET_SBHL_MODULE_TYPE, module)), list($sbhl_add_node_to_result_test$, list(GET_SBHL_ADD_NODE_TO_RESULT_TEST, module))), list(WITH_NEW_SBHL_PREDICATE_MODE_SCOPE, listS(WITH_SBHL_MODULE, module, append(body, NIL))));
    }

    /**
     * Accessor: @return booleanp. @see *sbhl-genl-inverse-mode-p*
     */
    @LispMethod(comment = "Accessor: @return booleanp. @see *sbhl-genl-inverse-mode-p*")
    public static final SubLObject genl_inverse_mode_p_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $genl_inverse_mode_p$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor: @return booleanp. @see *sbhl-genl-inverse-mode-p*
     */
    @LispMethod(comment = "Accessor: @return booleanp. @see *sbhl-genl-inverse-mode-p*")
    public static SubLObject genl_inverse_mode_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $genl_inverse_mode_p$.getDynamicValue(thread);
    }

    /**
     * Accessor: @return booleanp. opposite of @see *sbhl-genl-inverse-mode-p*
     */
    @LispMethod(comment = "Accessor: @return booleanp. opposite of @see *sbhl-genl-inverse-mode-p*")
    public static final SubLObject not_genl_inverse_mode_p_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean(NIL == $genl_inverse_mode_p$.getDynamicValue(thread));
        }
    }

    /**
     * Accessor: @return booleanp. opposite of @see *sbhl-genl-inverse-mode-p*
     */
    @LispMethod(comment = "Accessor: @return booleanp. opposite of @see *sbhl-genl-inverse-mode-p*")
    public static SubLObject not_genl_inverse_mode_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(NIL == $genl_inverse_mode_p$.getDynamicValue(thread));
    }

    /**
     * Binds a new scope for *genl-inverse-mode-p*, setting it to NIL within BODY
     */
    @LispMethod(comment = "Binds a new scope for *genl-inverse-mode-p*, setting it to NIL within BODY")
    public static final SubLObject with_new_sbhl_predicate_mode_scope_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt60, append(body, NIL));
        }
    }

    /**
     * Binds a new scope for *genl-inverse-mode-p*, setting it to NIL within BODY
     */
    @LispMethod(comment = "Binds a new scope for *genl-inverse-mode-p*, setting it to NIL within BODY")
    public static SubLObject with_new_sbhl_predicate_mode_scope(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list58, append(body, NIL));
    }

    /**
     * Binds *genl-inverse-mode-p* to MODE, which should be T or NIL.
     */
    @LispMethod(comment = "Binds *genl-inverse-mode-p* to MODE, which should be T or NIL.")
    public static final SubLObject with_sbhl_predicate_mode_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject mode = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt61);
            mode = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($genl_inverse_mode_p$, mode)), append(body, NIL));
            }
        }
    }

    /**
     * Binds *genl-inverse-mode-p* to MODE, which should be T or NIL.
     */
    @LispMethod(comment = "Binds *genl-inverse-mode-p* to MODE, which should be T or NIL.")
    public static SubLObject with_sbhl_predicate_mode(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mode = NIL;
        destructuring_bind_must_consp(current, datum, $list59);
        mode = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($genl_inverse_mode_p$, mode)), append(body, NIL));
    }

    /**
     * Binds *genl-inverse-mode-p* to T within BODY
     */
    @LispMethod(comment = "Binds *genl-inverse-mode-p* to T within BODY")
    public static final SubLObject with_genl_inverse_mode_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt63, append(body, NIL));
        }
    }

    /**
     * Binds *genl-inverse-mode-p* to T within BODY
     */
    @LispMethod(comment = "Binds *genl-inverse-mode-p* to T within BODY")
    public static SubLObject with_genl_inverse_mode(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list61, append(body, NIL));
    }

    /**
     * May flip value of *genl-inverse-mode-p* within BODY, iff @see sbhl-module-flips-inverse-mode-p
     */
    @LispMethod(comment = "May flip value of *genl-inverse-mode-p* within BODY, iff @see sbhl-module-flips-inverse-mode-p")
    public static final SubLObject sbhl_update_genl_inverse_mode_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt64, append(body, NIL));
        }
    }

    /**
     * May flip value of *genl-inverse-mode-p* within BODY, iff @see sbhl-module-flips-inverse-mode-p
     */
    @LispMethod(comment = "May flip value of *genl-inverse-mode-p* within BODY, iff @see sbhl-module-flips-inverse-mode-p")
    public static SubLObject sbhl_update_genl_inverse_mode(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list62, append(body, NIL));
    }

    /**
     * May flip value of *genl-inverse-mode-p* within BODY, iff @see sbhl-module-flips-inverse-mode-p, and @see sbhl-predicate-search-p
     */
    @LispMethod(comment = "May flip value of *genl-inverse-mode-p* within BODY, iff @see sbhl-module-flips-inverse-mode-p, and @see sbhl-predicate-search-p")
    public static final SubLObject possibly_flip_genl_inverse_mode_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt65, append(body, NIL));
        }
    }

    /**
     * May flip value of *genl-inverse-mode-p* within BODY, iff @see sbhl-module-flips-inverse-mode-p, and @see sbhl-predicate-search-p
     */
    @LispMethod(comment = "May flip value of *genl-inverse-mode-p* within BODY, iff @see sbhl-module-flips-inverse-mode-p, and @see sbhl-predicate-search-p")
    public static SubLObject possibly_flip_genl_inverse_mode(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list63, append(body, NIL));
    }

    /**
     * May set *genl-inverse-mode-p* to t, iff search module is #$negationInverse
     */
    @LispMethod(comment = "May set *genl-inverse-mode-p* to t, iff search module is #$negationInverse")
    public static final SubLObject possibly_premark_with_genl_inverse_mode_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt66, append(body, NIL));
        }
    }

    /**
     * May set *genl-inverse-mode-p* to t, iff search module is #$negationInverse
     */
    @LispMethod(comment = "May set *genl-inverse-mode-p* to t, iff search module is #$negationInverse")
    public static SubLObject possibly_premark_with_genl_inverse_mode(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list64, append(body, NIL));
    }

    public static final SubLObject flip_genl_inverse_mode_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt67, append(body, NIL));
        }
    }

    public static SubLObject flip_genl_inverse_mode(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list65, append(body, NIL));
    }

    public static final SubLObject sbhl_module_flips_inverse_mode_p_alt(SubLObject sbhl_module) {
        if (sbhl_module == UNPROVIDED) {
            sbhl_module = sbhl_module_vars.get_sbhl_module(UNPROVIDED);
        }
        return makeBoolean((sbhl_module_utilities.get_sbhl_link_pred(sbhl_module) == $$genlInverse) || (sbhl_module_utilities.get_sbhl_link_pred(sbhl_module) == $$negationInverse));
    }

    public static SubLObject sbhl_module_flips_inverse_mode_p(SubLObject sbhl_module) {
        if (sbhl_module == UNPROVIDED) {
            sbhl_module = sbhl_module_vars.get_sbhl_module(UNPROVIDED);
        }
        return makeBoolean(sbhl_module_utilities.get_sbhl_link_pred(sbhl_module).eql($$genlInverse) || sbhl_module_utilities.get_sbhl_link_pred(sbhl_module).eql($$negationInverse));
    }

    public static final SubLObject flip_genl_inverse_modeP_alt(SubLObject sbhl_module, SubLObject sbhl_search_module) {
        if (sbhl_module == UNPROVIDED) {
            sbhl_module = sbhl_module_vars.get_sbhl_module(UNPROVIDED);
        }
        if (sbhl_search_module == UNPROVIDED) {
            sbhl_search_module = com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.get_sbhl_search_module();
        }
        return makeBoolean((NIL != sbhl_module_utilities.sbhl_module_indicates_predicate_search_p(sbhl_search_module)) && (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.sbhl_module_flips_inverse_mode_p(sbhl_module)));
    }

    public static SubLObject flip_genl_inverse_modeP(SubLObject sbhl_module, SubLObject sbhl_search_module) {
        if (sbhl_module == UNPROVIDED) {
            sbhl_module = sbhl_module_vars.get_sbhl_module(UNPROVIDED);
        }
        if (sbhl_search_module == UNPROVIDED) {
            sbhl_search_module = get_sbhl_search_module();
        }
        return makeBoolean((NIL != sbhl_module_utilities.sbhl_module_indicates_predicate_search_p(sbhl_search_module)) && (NIL != sbhl_module_flips_inverse_mode_p(sbhl_module)));
    }

    public static final SubLObject with_initialized_unmarking_sbhl_marking_module_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject start_marking = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt68);
            start_marking = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject pred = $sym69$PRED;
                return list(PIF, $list_alt70, list(CDOLIST, list(pred, start_marking), listS(CLET, list(list($sbhl_add_unmarked_node_to_result_test$, list(GET_SBHL_ADD_NODE_TO_RESULT_TEST, list(GET_SBHL_MODULE, pred))), list($genl_inverse_mode_p$, listS(EQ, pred, $list_alt74))), append(body, NIL))), bq_cons(PROGN, append(body, NIL)));
            }
        }
    }

    public static SubLObject with_initialized_unmarking_sbhl_marking_module(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject start_marking = NIL;
        destructuring_bind_must_consp(current, datum, $list66);
        start_marking = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject pred = $sym67$PRED;
        return list(PIF, $list68, list(CDOLIST, list(pred, start_marking), listS(CLET, list(list($sbhl_add_unmarked_node_to_result_test$, list(GET_SBHL_ADD_NODE_TO_RESULT_TEST, list(GET_SBHL_MODULE, pred))), list($genl_inverse_mode_p$, listS(EQL, pred, $list72))), append(body, NIL))), bq_cons(PROGN, append(body, NIL)));
    }

    /**
     * Accessor. @return sbhl-direction-p; whether sbhl search direction is forward
     */
    @LispMethod(comment = "Accessor. @return sbhl-direction-p; whether sbhl search direction is forward")
    public static final SubLObject sbhl_forward_search_direction_p_alt(SubLObject direction) {
        return eq(direction, $sbhl_forward_search_direction$.getGlobalValue());
    }

    /**
     * Accessor. @return sbhl-direction-p; whether sbhl search direction is forward
     */
    @LispMethod(comment = "Accessor. @return sbhl-direction-p; whether sbhl search direction is forward")
    public static SubLObject sbhl_forward_search_direction_p(final SubLObject direction) {
        return eq(direction, $sbhl_forward_search_direction$.getGlobalValue());
    }

    /**
     * Accessor. @see *sbhl-forward-search-direction*
     */
    @LispMethod(comment = "Accessor. @see *sbhl-forward-search-direction*")
    public static final SubLObject get_sbhl_forward_search_direction_alt() {
        return $sbhl_forward_search_direction$.getGlobalValue();
    }

    /**
     * Accessor. @see *sbhl-forward-search-direction*
     */
    @LispMethod(comment = "Accessor. @see *sbhl-forward-search-direction*")
    public static SubLObject get_sbhl_forward_search_direction() {
        return $sbhl_forward_search_direction$.getGlobalValue();
    }

    /**
     * Accessor. @return sbhl-direction-p; whether sbhl search direction is backward
     */
    @LispMethod(comment = "Accessor. @return sbhl-direction-p; whether sbhl search direction is backward")
    public static final SubLObject sbhl_backward_search_direction_p_alt(SubLObject direction) {
        return eq(direction, $sbhl_backward_search_direction$.getGlobalValue());
    }

    /**
     * Accessor. @return sbhl-direction-p; whether sbhl search direction is backward
     */
    @LispMethod(comment = "Accessor. @return sbhl-direction-p; whether sbhl search direction is backward")
    public static SubLObject sbhl_backward_search_direction_p(final SubLObject direction) {
        return eq(direction, $sbhl_backward_search_direction$.getGlobalValue());
    }

    /**
     * Accessor. @see *sbhl-backward-search-direction*
     */
    @LispMethod(comment = "Accessor. @see *sbhl-backward-search-direction*")
    public static final SubLObject get_sbhl_backward_search_direction_alt() {
        return $sbhl_backward_search_direction$.getGlobalValue();
    }

    /**
     * Accessor. @see *sbhl-backward-search-direction*
     */
    @LispMethod(comment = "Accessor. @see *sbhl-backward-search-direction*")
    public static SubLObject get_sbhl_backward_search_direction() {
        return $sbhl_backward_search_direction$.getGlobalValue();
    }

    /**
     * Accessor. @return sbhl-direction-p; @see *sbhl-search-direction*
     */
    @LispMethod(comment = "Accessor. @return sbhl-direction-p; @see *sbhl-search-direction*")
    public static final SubLObject get_sbhl_search_direction_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_search_direction$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor. @return sbhl-direction-p; @see *sbhl-search-direction*
     */
    @LispMethod(comment = "Accessor. @return sbhl-direction-p; @see *sbhl-search-direction*")
    public static SubLObject get_sbhl_search_direction() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_search_direction$.getDynamicValue(thread);
    }

    /**
     * Binds @see *sbhl-search-direction*.
     */
    @LispMethod(comment = "Binds @see *sbhl-search-direction*.")
    public static final SubLObject with_sbhl_search_direction_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject direction = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt77);
            direction = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sbhl_search_direction$, direction)), append(body, NIL));
            }
        }
    }

    /**
     * Binds @see *sbhl-search-direction*.
     */
    @LispMethod(comment = "Binds @see *sbhl-search-direction*.")
    public static SubLObject with_sbhl_search_direction(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject direction = NIL;
        destructuring_bind_must_consp(current, datum, $list75);
        direction = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_search_direction$, direction)), append(body, NIL));
    }

    /**
     * Binds *sbhl-search-direction* to forward.
     */
    @LispMethod(comment = "Binds *sbhl-search-direction* to forward.")
    public static final SubLObject with_sbhl_forward_search_direction_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_SBHL_SEARCH_DIRECTION, $list_alt80, append(body, NIL));
        }
    }

    /**
     * Binds *sbhl-search-direction* to forward.
     */
    @LispMethod(comment = "Binds *sbhl-search-direction* to forward.")
    public static SubLObject with_sbhl_forward_search_direction(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_SBHL_SEARCH_DIRECTION, $list78, append(body, NIL));
    }

    /**
     * Binds *sbhl-search-direction* to backward.
     */
    @LispMethod(comment = "Binds *sbhl-search-direction* to backward.")
    public static final SubLObject with_sbhl_backward_search_direction_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_SBHL_SEARCH_DIRECTION, $list_alt81, append(body, NIL));
        }
    }

    /**
     * Binds *sbhl-search-direction* to backward.
     */
    @LispMethod(comment = "Binds *sbhl-search-direction* to backward.")
    public static SubLObject with_sbhl_backward_search_direction(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_SBHL_SEARCH_DIRECTION, $list79, append(body, NIL));
    }

    /**
     * Accessor: @return booleanp; whether the *sbhl-search-direction* is forward.
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether the *sbhl-search-direction* is forward.")
    public static final SubLObject sbhl_forward_search_p_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.sbhl_forward_search_direction_p($sbhl_search_direction$.getDynamicValue(thread));
        }
    }

    /**
     * Accessor: @return booleanp; whether the *sbhl-search-direction* is forward.
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether the *sbhl-search-direction* is forward.")
    public static SubLObject sbhl_forward_search_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_forward_search_direction_p($sbhl_search_direction$.getDynamicValue(thread));
    }

    /**
     * Accessor: @return booleanp; whether the *sbhl-search-direction* is backward.
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether the *sbhl-search-direction* is backward.")
    public static final SubLObject sbhl_backward_search_p_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.sbhl_backward_search_direction_p($sbhl_search_direction$.getDynamicValue(thread));
        }
    }

    /**
     * Accessor: @return booleanp; whether the *sbhl-search-direction* is backward.
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether the *sbhl-search-direction* is backward.")
    public static SubLObject sbhl_backward_search_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_backward_search_direction_p($sbhl_search_direction$.getDynamicValue(thread));
    }

    /**
     * Accessor. @return numberp; @see *sbhl-search-index-arg*
     */
    @LispMethod(comment = "Accessor. @return numberp; @see *sbhl-search-index-arg*")
    public static final SubLObject get_sbhl_search_index_arg_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_search_index_arg$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor. @return numberp; @see *sbhl-search-index-arg*
     */
    @LispMethod(comment = "Accessor. @return numberp; @see *sbhl-search-index-arg*")
    public static SubLObject get_sbhl_search_index_arg() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_search_index_arg$.getDynamicValue(thread);
    }

    /**
     * Accessor. @return numberp. assumes *sbhl-search-index-arg* is 1 or 2 and returns the opposite. @see *sbhl-search-index-arg*
     */
    @LispMethod(comment = "Accessor. @return numberp. assumes *sbhl-search-index-arg* is 1 or 2 and returns the opposite. @see *sbhl-search-index-arg*")
    public static final SubLObject get_sbhl_search_gather_arg_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return subtract(THREE_INTEGER, $sbhl_search_index_arg$.getDynamicValue(thread));
        }
    }

    /**
     * Accessor. @return numberp. assumes *sbhl-search-index-arg* is 1 or 2 and returns the opposite. @see *sbhl-search-index-arg*
     */
    @LispMethod(comment = "Accessor. @return numberp. assumes *sbhl-search-index-arg* is 1 or 2 and returns the opposite. @see *sbhl-search-index-arg*")
    public static SubLObject get_sbhl_search_gather_arg() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subtract(THREE_INTEGER, $sbhl_search_index_arg$.getDynamicValue(thread));
    }

    /**
     * Binds @see *sbhl-search-index-arg*
     */
    @LispMethod(comment = "Binds @see *sbhl-search-index-arg*")
    public static final SubLObject bind_sbhl_search_index_arg_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt82, append(body, NIL));
        }
    }

    /**
     * Binds @see *sbhl-search-index-arg*
     */
    @LispMethod(comment = "Binds @see *sbhl-search-index-arg*")
    public static SubLObject bind_sbhl_search_index_arg(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list80, append(body, NIL));
    }

    /**
     * Accessor. @see *sbhl-map-function*
     */
    @LispMethod(comment = "Accessor. @see *sbhl-map-function*")
    public static final SubLObject get_sbhl_map_function_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_map_function$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor. @see *sbhl-map-function*
     */
    @LispMethod(comment = "Accessor. @see *sbhl-map-function*")
    public static SubLObject get_sbhl_map_function() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_map_function$.getDynamicValue(thread);
    }

    /**
     * Binds @see *sbhl-map-function*. @see determine-sbhl-map-function
     */
    @LispMethod(comment = "Binds @see *sbhl-map-function*. @see determine-sbhl-map-function")
    public static final SubLObject with_sbhl_map_function_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject function = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt83);
            function = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sbhl_map_function$, function)), append(body, NIL));
            }
        }
    }

    /**
     * Binds @see *sbhl-map-function*. @see determine-sbhl-map-function
     */
    @LispMethod(comment = "Binds @see *sbhl-map-function*. @see determine-sbhl-map-function")
    public static SubLObject with_sbhl_map_function(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject function = NIL;
        destructuring_bind_must_consp(current, datum, $list81);
        function = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_map_function$, function)), append(body, NIL));
    }

    /**
     * Accessor. @see *sbhl-unwind-function*
     */
    @LispMethod(comment = "Accessor. @see *sbhl-unwind-function*")
    public static final SubLObject get_sbhl_unwind_function_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_unwind_function$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor. @see *sbhl-unwind-function*
     */
    @LispMethod(comment = "Accessor. @see *sbhl-unwind-function*")
    public static SubLObject get_sbhl_unwind_function() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_unwind_function$.getDynamicValue(thread);
    }

    /**
     * Binds @see *sbhl-unwind-function*. @see determine-sbhl-unwind-function
     */
    @LispMethod(comment = "Binds @see *sbhl-unwind-function*. @see determine-sbhl-unwind-function")
    public static final SubLObject with_sbhl_unwind_function_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject function = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt83);
            function = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sbhl_unwind_function$, function)), append(body, NIL));
            }
        }
    }

    /**
     * Binds @see *sbhl-unwind-function*. @see determine-sbhl-unwind-function
     */
    @LispMethod(comment = "Binds @see *sbhl-unwind-function*. @see determine-sbhl-unwind-function")
    public static SubLObject with_sbhl_unwind_function(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject function = NIL;
        destructuring_bind_must_consp(current, datum, $list81);
        function = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_unwind_function$, function)), append(body, NIL));
    }

    /**
     * Accessor. @return booleanp; the value of @see *sbhl-apply-unwind-function-p*
     */
    @LispMethod(comment = "Accessor. @return booleanp; the value of @see *sbhl-apply-unwind-function-p*")
    public static final SubLObject sbhl_apply_unwind_function_p_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_apply_unwind_function_p$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor. @return booleanp; the value of @see *sbhl-apply-unwind-function-p*
     */
    @LispMethod(comment = "Accessor. @return booleanp; the value of @see *sbhl-apply-unwind-function-p*")
    public static SubLObject sbhl_apply_unwind_function_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_apply_unwind_function_p$.getDynamicValue(thread);
    }

    /**
     * Sets to t @see *sbhl-apply-unwind-function-p*
     */
    @LispMethod(comment = "Sets to t @see *sbhl-apply-unwind-function-p*")
    public static final SubLObject sbhl_toggle_unwind_function_on_alt() {
        $sbhl_apply_unwind_function_p$.setDynamicValue(T);
        return NIL;
    }

    /**
     * Sets to t @see *sbhl-apply-unwind-function-p*
     */
    @LispMethod(comment = "Sets to t @see *sbhl-apply-unwind-function-p*")
    public static SubLObject sbhl_toggle_unwind_function_on() {
        $sbhl_apply_unwind_function_p$.setDynamicValue(T);
        return NIL;
    }

    /**
     * Sets to nil @see *sbhl-apply-unwind-function-p*
     */
    @LispMethod(comment = "Sets to nil @see *sbhl-apply-unwind-function-p*")
    public static final SubLObject sbhl_toggle_unwind_function_off_alt() {
        $sbhl_apply_unwind_function_p$.setDynamicValue(NIL);
        return NIL;
    }

    /**
     * Sets to nil @see *sbhl-apply-unwind-function-p*
     */
    @LispMethod(comment = "Sets to nil @see *sbhl-apply-unwind-function-p*")
    public static SubLObject sbhl_toggle_unwind_function_off() {
        $sbhl_apply_unwind_function_p$.setDynamicValue(NIL);
        return NIL;
    }

    /**
     * Binds to t @see *sbhl-apply-unwind-function-p*
     */
    @LispMethod(comment = "Binds to t @see *sbhl-apply-unwind-function-p*")
    public static final SubLObject with_sbhl_unwind_function_on_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt86, append(body, NIL));
        }
    }

    /**
     * Binds to t @see *sbhl-apply-unwind-function-p*
     */
    @LispMethod(comment = "Binds to t @see *sbhl-apply-unwind-function-p*")
    public static SubLObject with_sbhl_unwind_function_on(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list84, append(body, NIL));
    }

    /**
     * Binds to nil @see *sbhl-apply-unwind-function-p*
     */
    @LispMethod(comment = "Binds to nil @see *sbhl-apply-unwind-function-p*")
    public static final SubLObject with_sbhl_unwind_function_off_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt87, append(body, NIL));
        }
    }

    /**
     * Binds to nil @see *sbhl-apply-unwind-function-p*
     */
    @LispMethod(comment = "Binds to nil @see *sbhl-apply-unwind-function-p*")
    public static SubLObject with_sbhl_unwind_function_off(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list85, append(body, NIL));
    }

    /**
     * Accessor. returns the marking of the parent to current node in search
     */
    @LispMethod(comment = "Accessor. returns the marking of the parent to current node in search")
    public static final SubLObject get_sbhl_search_parent_marking_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_search_parent_marking$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor. returns the marking of the parent to current node in search
     */
    @LispMethod(comment = "Accessor. returns the marking of the parent to current node in search")
    public static SubLObject get_sbhl_search_parent_marking() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_search_parent_marking$.getDynamicValue(thread);
    }

    /**
     * Modifier. sets *sbhl-search-parent-marking* to MARKING
     */
    @LispMethod(comment = "Modifier. sets *sbhl-search-parent-marking* to MARKING")
    public static final SubLObject set_sbhl_search_parent_marking_alt(SubLObject marking) {
        $sbhl_search_parent_marking$.setDynamicValue(marking);
        return NIL;
    }

    /**
     * Modifier. sets *sbhl-search-parent-marking* to MARKING
     */
    @LispMethod(comment = "Modifier. sets *sbhl-search-parent-marking* to MARKING")
    public static SubLObject set_sbhl_search_parent_marking(final SubLObject marking) {
        $sbhl_search_parent_marking$.setDynamicValue(marking);
        return NIL;
    }

    /**
     * Modifier. rebinds to NIL @see *sbhl-search-parent-marking*.
     */
    @LispMethod(comment = "Modifier. rebinds to NIL @see *sbhl-search-parent-marking*.")
    public static final SubLObject reset_sbhl_search_parent_marking_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt88, append(body, NIL));
        }
    }

    /**
     * Modifier. rebinds to NIL @see *sbhl-search-parent-marking*.
     */
    @LispMethod(comment = "Modifier. rebinds to NIL @see *sbhl-search-parent-marking*.")
    public static SubLObject reset_sbhl_search_parent_marking(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list86, append(body, NIL));
    }

    /**
     * Modifier. dynamcially rebinds to itself @see *sbhl-search-parent-marking*
     */
    @LispMethod(comment = "Modifier. dynamcially rebinds to itself @see *sbhl-search-parent-marking*")
    public static final SubLObject dynamically_rebind_sbhl_search_parent_marking_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt89, append(body, NIL));
        }
    }

    /**
     * Modifier. dynamcially rebinds to itself @see *sbhl-search-parent-marking*
     */
    @LispMethod(comment = "Modifier. dynamcially rebinds to itself @see *sbhl-search-parent-marking*")
    public static SubLObject dynamically_rebind_sbhl_search_parent_marking(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list87, append(body, NIL));
    }

    /**
     * Initializes *sbhl-nodes-previous-marking* to nil.
     */
    @LispMethod(comment = "Initializes *sbhl-nodes-previous-marking* to nil.")
    public static final SubLObject with_new_sbhl_previous_marking_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt90, append(body, NIL));
        }
    }

    /**
     * Initializes *sbhl-nodes-previous-marking* to nil.
     */
    @LispMethod(comment = "Initializes *sbhl-nodes-previous-marking* to nil.")
    public static SubLObject with_new_sbhl_previous_marking(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list88, append(body, NIL));
    }

    /**
     * Accessor: the previous marking in the current sbhl search.
     */
    @LispMethod(comment = "Accessor: the previous marking in the current sbhl search.")
    public static final SubLObject get_sbhl_nodes_previous_marking_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_nodes_previous_marking$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor: the previous marking in the current sbhl search.
     */
    @LispMethod(comment = "Accessor: the previous marking in the current sbhl search.")
    public static SubLObject get_sbhl_nodes_previous_marking() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_nodes_previous_marking$.getDynamicValue(thread);
    }

    /**
     * Resets value of *sbhl-finished?* to nil
     */
    @LispMethod(comment = "Resets value of *sbhl-finished?* to nil")
    public static final SubLObject with_new_sbhl_finished_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt91, append(body, NIL));
        }
    }

    /**
     * Resets value of *sbhl-finished?* to nil
     */
    @LispMethod(comment = "Resets value of *sbhl-finished?* to nil")
    public static SubLObject with_new_sbhl_finished(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list89, append(body, NIL));
    }

    /**
     * Modifier: sets *sbhl-finished?* to :goal. Used to specify that an sbhl search terminated upon reaching its goal condition.
     */
    @LispMethod(comment = "Modifier: sets *sbhl-finished?* to :goal. Used to specify that an sbhl search terminated upon reaching its goal condition.")
    public static final SubLObject sbhl_finished_with_goal_alt() {
        $sbhl_finishedP$.setDynamicValue($GOAL);
        return NIL;
    }

    /**
     * Modifier: sets *sbhl-finished?* to :goal. Used to specify that an sbhl search terminated upon reaching its goal condition.
     */
    @LispMethod(comment = "Modifier: sets *sbhl-finished?* to :goal. Used to specify that an sbhl search terminated upon reaching its goal condition.")
    public static SubLObject sbhl_finished_with_goal() {
        $sbhl_finishedP$.setDynamicValue($GOAL);
        return NIL;
    }

    /**
     * Modifier: sets *sbhl-finished?* to :cutoff.
     */
    @LispMethod(comment = "Modifier: sets *sbhl-finished?* to :cutoff.")
    public static final SubLObject sbhl_finished_with_cutoff_alt() {
        $sbhl_finishedP$.setDynamicValue($CUTOFF);
        return NIL;
    }

    /**
     * Modifier: sets *sbhl-finished?* to :cutoff.
     */
    @LispMethod(comment = "Modifier: sets *sbhl-finished?* to :cutoff.")
    public static SubLObject sbhl_finished_with_cutoff() {
        $sbhl_finishedP$.setDynamicValue($CUTOFF);
        return NIL;
    }

    /**
     * Accessor: @return booleanp; whether to stop the current search path.
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether to stop the current search path.")
    public static final SubLObject sbhl_stop_search_path_p_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_stop_search_pathP$.getDynamicValue(thread);
        }
    }

    @LispMethod(comment = "Accessor: @return booleanp; whether to stop the current search path.")
    public static SubLObject sbhl_stop_search_path_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_stop_search_pathP$.getDynamicValue(thread);
    }

    /**
     * Modifier: sets environment to stop current search path.
     */
    @LispMethod(comment = "Modifier: sets environment to stop current search path.")
    public static final SubLObject sbhl_stop_search_path_alt() {
        $sbhl_stop_search_pathP$.setDynamicValue(T);
        return NIL;
    }

    @LispMethod(comment = "Modifier: sets environment to stop current search path.")
    public static SubLObject sbhl_stop_search_path() {
        $sbhl_stop_search_pathP$.setDynamicValue(T);
        return NIL;
    }

    /**
     * Modifier: sets environment to continue current search path.
     */
    @LispMethod(comment = "Modifier: sets environment to continue current search path.")
    public static final SubLObject sbhl_continue_search_path_alt() {
        $sbhl_stop_search_pathP$.setDynamicValue(NIL);
        return NIL;
    }

    @LispMethod(comment = "Modifier: sets environment to continue current search path.")
    public static SubLObject sbhl_continue_search_path() {
        $sbhl_stop_search_pathP$.setDynamicValue(NIL);
        return NIL;
    }

    /**
     * Initializes *sbhl-stop-search-path?* to nil
     */
    @LispMethod(comment = "Initializes *sbhl-stop-search-path?* to nil")
    public static final SubLObject with_new_sbhl_stop_search_path_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt94, append(body, NIL));
        }
    }

    @LispMethod(comment = "Initializes *sbhl-stop-search-path?* to nil")
    public static SubLObject with_new_sbhl_stop_search_path(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list92, append(body, NIL));
    }

    /**
     * Accessor: @return booleanp; whether NODE is equal to *sbhl-target-node*
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether NODE is equal to *sbhl-target-node*")
    public static final SubLObject sbhl_target_node_p_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return eq(node, $sbhl_target_node$.getDynamicValue(thread));
        }
    }

    @LispMethod(comment = "Accessor: @return booleanp; whether NODE is equal to *sbhl-target-node*")
    public static SubLObject sbhl_target_node_p(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return eql(node, $sbhl_target_node$.getDynamicValue(thread));
    }

    /**
     * Binds *sbhl-target-node* to NODE for execution of BODY.
     */
    @LispMethod(comment = "Binds *sbhl-target-node* to NODE for execution of BODY.")
    public static final SubLObject with_sbhl_target_node_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject node = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt95);
            node = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sbhl_target_node$, node)), append(body, NIL));
            }
        }
    }

    @LispMethod(comment = "Binds *sbhl-target-node* to NODE for execution of BODY.")
    public static SubLObject with_sbhl_target_node(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject node = NIL;
        destructuring_bind_must_consp(current, datum, $list93);
        node = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_target_node$, node)), append(body, NIL));
    }

    /**
     * Accessor: @return booleanp; whether NODE is equal to *sbhl-goal-node*
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether NODE is equal to *sbhl-goal-node*")
    public static final SubLObject sbhl_goal_node_p_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return eq(node, $sbhl_goal_node$.getDynamicValue(thread));
        }
    }

    @LispMethod(comment = "Accessor: @return booleanp; whether NODE is equal to *sbhl-goal-node*")
    public static SubLObject sbhl_goal_node_p(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return eql(node, $sbhl_goal_node$.getDynamicValue(thread));
    }

    /**
     * Binds *sbhl-goal-node* to NODE for execution of BODY.
     */
    @LispMethod(comment = "Binds *sbhl-goal-node* to NODE for execution of BODY.")
    public static final SubLObject with_sbhl_goal_node_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject node = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt95);
            node = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sbhl_goal_node$, node)), append(body, NIL));
            }
        }
    }

    @LispMethod(comment = "Binds *sbhl-goal-node* to NODE for execution of BODY.")
    public static SubLObject with_sbhl_goal_node(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject node = NIL;
        destructuring_bind_must_consp(current, datum, $list93);
        node = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_goal_node$, node)), append(body, NIL));
    }

    /**
     * Accessor: @return sbhl-node-object-p; the @see *sbhl-goal-node*.
     */
    @LispMethod(comment = "Accessor: @return sbhl-node-object-p; the @see *sbhl-goal-node*.")
    public static final SubLObject get_sbhl_goal_node_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_goal_node$.getDynamicValue(thread);
        }
    }

    @LispMethod(comment = "Accessor: @return sbhl-node-object-p; the @see *sbhl-goal-node*.")
    public static SubLObject get_sbhl_goal_node() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_goal_node$.getDynamicValue(thread);
    }

    /**
     * Accessor: @return booleanp; whether NODE is equal to *sbhl-goal-node*
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether NODE is equal to *sbhl-goal-node*")
    public static final SubLObject sbhl_node_isa_goal_node_p_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return subl_promotions.memberP(node, $sbhl_goal_node$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    @LispMethod(comment = "Accessor: @return booleanp; whether NODE is equal to *sbhl-goal-node*")
    public static SubLObject sbhl_node_isa_goal_node_p(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(node, $sbhl_goal_node$.getDynamicValue(thread), symbol_function(EQL), UNPROVIDED);
    }

    /**
     * Accessor: @return listp; the current goal nodes.
     */
    @LispMethod(comment = "Accessor: @return listp; the current goal nodes.")
    public static final SubLObject get_sbhl_goal_nodes_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_goal_nodes$.getDynamicValue(thread);
        }
    }

    @LispMethod(comment = "Accessor: @return listp; the current goal nodes.")
    public static SubLObject get_sbhl_goal_nodes() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_goal_nodes$.getDynamicValue(thread);
    }

    /**
     * Binds *sbhl-goal-nodes* to NODES for execution of BODY.
     */
    @LispMethod(comment = "Binds *sbhl-goal-nodes* to NODES for execution of BODY.")
    public static final SubLObject with_sbhl_goal_nodes_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject nodes = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt98);
            nodes = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sbhl_goal_node$, nodes)), append(body, NIL));
            }
        }
    }

    @LispMethod(comment = "Binds *sbhl-goal-nodes* to NODES for execution of BODY.")
    public static SubLObject with_sbhl_goal_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject nodes = NIL;
        destructuring_bind_must_consp(current, datum, $list96);
        nodes = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_goal_node$, nodes)), append(body, NIL));
    }

    /**
     * Binds *sbhl-goal-node* to NODE for execution of BODY.
     */
    @LispMethod(comment = "Binds *sbhl-goal-node* to NODE for execution of BODY.")
    public static final SubLObject with_sbhl_isaP_goal_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject node = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt95);
            node = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sym99$_SBHL_ISA__GOAL_, node)), append(body, NIL));
            }
        }
    }

    @LispMethod(comment = "Binds *sbhl-goal-node* to NODE for execution of BODY.")
    public static SubLObject with_sbhl_isaP_goal(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject node = NIL;
        destructuring_bind_must_consp(current, datum, $list93);
        node = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sym97$_SBHL_ISA__GOAL_, node)), append(body, NIL));
    }

    /**
     * Accessor: @return sbhl-node-object-p; the current goal in an mapping with isa? search.
     */
    @LispMethod(comment = "Accessor: @return sbhl-node-object-p; the current goal in an mapping with isa? search.")
    public static final SubLObject get_sbhl_isaP_goal_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_isaP_goal$.getDynamicValue(thread);
        }
    }

    @LispMethod(comment = "Accessor: @return sbhl-node-object-p; the current goal in an mapping with isa? search.")
    public static SubLObject get_sbhl_isaP_goal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_isaP_goal$.getDynamicValue(thread);
    }

    /**
     * this binds a new *sbhl-result* for BODY, and sets RESULT-VAR to its value after BODY's execution.
     */
    @LispMethod(comment = "this binds a new *sbhl-result* for BODY, and sets RESULT-VAR to its value after BODY\'s execution.")
    public static final SubLObject with_sbhl_result_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject result_var = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt100);
            result_var = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(CLET, $list_alt101, list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), listS(CSETQ, result_var, $list_alt101)));
            }
        }
    }

    @LispMethod(comment = "this binds a new *sbhl-result* for BODY, and sets RESULT-VAR to its value after BODY\'s execution.")
    public static SubLObject with_sbhl_result(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject result_var = NIL;
        destructuring_bind_must_consp(current, datum, $list98);
        result_var = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(CLET, $list99, list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), listS(CSETQ, result_var, $list99)));
    }

    /**
     * this binds a new *sbhl-result* for BODY, and sets RESULT-VAR to its value after BODY's execution.
     */
    @LispMethod(comment = "this binds a new *sbhl-result* for BODY, and sets RESULT-VAR to its value after BODY\'s execution.")
    public static final SubLObject with_sbhl_just_result_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject result_var = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt100);
            result_var = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(CLET, $list_alt104, list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), listS(CSETQ, result_var, $list_alt104)));
            }
        }
    }

    @LispMethod(comment = "this binds a new *sbhl-result* for BODY, and sets RESULT-VAR to its value after BODY\'s execution.")
    public static SubLObject with_sbhl_just_result(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject result_var = NIL;
        destructuring_bind_must_consp(current, datum, $list98);
        result_var = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(CLET, $list102, list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), listS(CSETQ, result_var, $list102)));
    }

    /**
     * Accessor. @return function-spec-p. @see *sbhl-consider-node-fn*
     */
    @LispMethod(comment = "Accessor. @return function-spec-p. @see *sbhl-consider-node-fn*")
    public static final SubLObject get_sbhl_consider_node_fn_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_consider_node_fn$.getDynamicValue(thread);
        }
    }

    @LispMethod(comment = "Accessor. @return function-spec-p. @see *sbhl-consider-node-fn*")
    public static SubLObject get_sbhl_consider_node_fn() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_consider_node_fn$.getDynamicValue(thread);
    }

    /**
     * Binds *sbhl-consider-node-fn* to FN.
     */
    @LispMethod(comment = "Binds *sbhl-consider-node-fn* to FN.")
    public static final SubLObject with_sbhl_consider_node_fn_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject fn = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt105);
            fn = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sbhl_consider_node_fn$, fn)), append(body, NIL));
            }
        }
    }

    @LispMethod(comment = "Binds *sbhl-consider-node-fn* to FN.")
    public static SubLObject with_sbhl_consider_node_fn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fn = NIL;
        destructuring_bind_must_consp(current, datum, $list103);
        fn = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_consider_node_fn$, fn)), append(body, NIL));
    }

    /**
     * Accessor. @return function-spec-p. @see *sbhl-compose-fn*
     */
    @LispMethod(comment = "Accessor. @return function-spec-p. @see *sbhl-compose-fn*")
    public static final SubLObject get_sbhl_compose_fn_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_compose_fn$.getDynamicValue(thread);
        }
    }

    @LispMethod(comment = "Accessor. @return function-spec-p. @see *sbhl-compose-fn*")
    public static SubLObject get_sbhl_compose_fn() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_compose_fn$.getDynamicValue(thread);
    }

    /**
     * Binds *sbhl-compose-fn* to FN
     */
    @LispMethod(comment = "Binds *sbhl-compose-fn* to FN")
    public static final SubLObject with_sbhl_compose_fn_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject fn = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt105);
            fn = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sbhl_compose_fn$, fn)), append(body, NIL));
            }
        }
    }

    @LispMethod(comment = "Binds *sbhl-compose-fn* to FN")
    public static SubLObject with_sbhl_compose_fn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fn = NIL;
        destructuring_bind_must_consp(current, datum, $list103);
        fn = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_compose_fn$, fn)), append(body, NIL));
    }

    /**
     * Accessor. @return function-spec-p. @see *sbhl-combine-fn*
     */
    @LispMethod(comment = "Accessor. @return function-spec-p. @see *sbhl-combine-fn*")
    public static final SubLObject get_sbhl_combine_fn_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_combine_fn$.getDynamicValue(thread);
        }
    }

    @LispMethod(comment = "Accessor. @return function-spec-p. @see *sbhl-combine-fn*")
    public static SubLObject get_sbhl_combine_fn() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_combine_fn$.getDynamicValue(thread);
    }

    /**
     * Binds *sbhl-combine-fn* to FN
     */
    @LispMethod(comment = "Binds *sbhl-combine-fn* to FN")
    public static final SubLObject with_sbhl_combine_fn_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject fn = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt105);
            fn = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sbhl_combine_fn$, fn)), append(body, NIL));
            }
        }
    }

    @LispMethod(comment = "Binds *sbhl-combine-fn* to FN")
    public static SubLObject with_sbhl_combine_fn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fn = NIL;
        destructuring_bind_must_consp(current, datum, $list103);
        fn = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_combine_fn$, fn)), append(body, NIL));
    }

    /**
     * Accessor. @return function-spec-p. @see *sbhl-map-test-fn*
     */
    @LispMethod(comment = "Accessor. @return function-spec-p. @see *sbhl-map-test-fn*")
    public static final SubLObject get_sbhl_map_test_fn_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_map_test_fn$.getDynamicValue(thread);
        }
    }

    @LispMethod(comment = "Accessor. @return function-spec-p. @see *sbhl-map-test-fn*")
    public static SubLObject get_sbhl_map_test_fn() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_map_test_fn$.getDynamicValue(thread);
    }

    /**
     * Binds *sbhl-map-test-fn* to FN
     */
    @LispMethod(comment = "Binds *sbhl-map-test-fn* to FN")
    public static final SubLObject with_sbhl_map_test_fn_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject fn = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt105);
            fn = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sbhl_map_test_fn$, fn)), append(body, NIL));
            }
        }
    }

    @LispMethod(comment = "Binds *sbhl-map-test-fn* to FN")
    public static SubLObject with_sbhl_map_test_fn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fn = NIL;
        destructuring_bind_must_consp(current, datum, $list103);
        fn = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_map_test_fn$, fn)), append(body, NIL));
    }

    /**
     * Initializes *sbhl-accessed-gather-nodes* to nil
     */
    @LispMethod(comment = "Initializes *sbhl-accessed-gather-nodes* to nil")
    public static final SubLObject reset_sbhl_accessed_gather_nodes_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt111, append(body, NIL));
        }
    }

    @LispMethod(comment = "Initializes *sbhl-accessed-gather-nodes* to nil")
    public static SubLObject reset_sbhl_accessed_gather_nodes(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list109, append(body, NIL));
    }

    /**
     * Binds @see *sbhl-dependents-cut-node*, to NODE.
     */
    @LispMethod(comment = "Binds @see *sbhl-dependents-cut-node*, to NODE.")
    public static final SubLObject with_sbhl_dependents_cut_node_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject node = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt95);
            node = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sbhl_dependents_cut_node$, node)), append(body, NIL));
            }
        }
    }

    @LispMethod(comment = "Binds @see *sbhl-dependents-cut-node*, to NODE.")
    public static SubLObject with_sbhl_dependents_cut_node(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject node = NIL;
        destructuring_bind_must_consp(current, datum, $list93);
        node = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_dependents_cut_node$, node)), append(body, NIL));
    }

    /**
     * Accesor: @return booleanp; whether NODE is the @see *sbhl-dependents-cut-node*
     */
    @LispMethod(comment = "Accesor: @return booleanp; whether NODE is the @see *sbhl-dependents-cut-node*")
    public static final SubLObject sbhl_dependents_cut_node_p_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return eq(node, $sbhl_dependents_cut_node$.getDynamicValue(thread));
        }
    }

    @LispMethod(comment = "Accesor: @return booleanp; whether NODE is the @see *sbhl-dependents-cut-node*")
    public static SubLObject sbhl_dependents_cut_node_p(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return eql(node, $sbhl_dependents_cut_node$.getDynamicValue(thread));
    }

    /**
     * Binds *sbhl-access-arg* to ARG
     */
    @LispMethod(comment = "Binds *sbhl-access-arg* to ARG")
    public static final SubLObject with_sbhl_access_arg_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject arg = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt113);
            arg = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sbhl_access_arg$, arg)), append(body, NIL));
            }
        }
    }

    @LispMethod(comment = "Binds *sbhl-access-arg* to ARG")
    public static SubLObject with_sbhl_access_arg(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject arg = NIL;
        destructuring_bind_must_consp(current, datum, $list111);
        arg = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_access_arg$, arg)), append(body, NIL));
    }

    /**
     * Binds *sbhl-referent* to REF
     */
    @LispMethod(comment = "Binds *sbhl-referent* to REF")
    public static final SubLObject with_sbhl_referent_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject ref = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt115);
            ref = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sbhl_referent$, ref)), append(body, NIL));
            }
        }
    }

    @LispMethod(comment = "Binds *sbhl-referent* to REF")
    public static SubLObject with_sbhl_referent(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject ref = NIL;
        destructuring_bind_must_consp(current, datum, $list113);
        ref = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_referent$, ref)), append(body, NIL));
    }

    /**
     * Binds *sbhl-current-leaf-queue* to a new queue
     */
    @LispMethod(comment = "Binds *sbhl-current-leaf-queue* to a new queue")
    public static final SubLObject with_new_sbhl_leaf_queue_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt117, append(body, NIL));
        }
    }

    @LispMethod(comment = "Binds *sbhl-current-leaf-queue* to a new queue")
    public static SubLObject with_new_sbhl_leaf_queue(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list115, append(body, NIL));
    }

    /**
     * Initializes *sbhl-sample-leaf-queues* to a list containing a queue containing NODE.
     */
    @LispMethod(comment = "Initializes *sbhl-sample-leaf-queues* to a list containing a queue containing NODE.")
    public static final SubLObject with_sbhl_sample_leaf_queues_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject node = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt95);
            node = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject queue = $sym118$QUEUE;
                return listS(CLET, list(list(queue, listS(ENQUEUE, node, $list_alt120)), list($sbhl_sample_leaf_queues$, list(LIST, queue))), append(body, NIL));
            }
        }
    }

    @LispMethod(comment = "Initializes *sbhl-sample-leaf-queues* to a list containing a queue containing NODE.")
    public static SubLObject with_sbhl_sample_leaf_queues(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject node = NIL;
        destructuring_bind_must_consp(current, datum, $list93);
        node = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject queue = $sym116$QUEUE;
        return listS(CLET, list(list(queue, listS(ENQUEUE, node, $list118)), list($sbhl_sample_leaf_queues$, list(LIST, queue))), append(body, NIL));
    }

    /**
     * Accessor: @return booleanp; uses *sbhl-sample-leaf-queues* to answer whether current search is one that uses the leaf queues.
     */
    @LispMethod(comment = "Accessor: @return booleanp; uses *sbhl-sample-leaf-queues* to answer whether current search is one that uses the leaf queues.")
    public static final SubLObject sbhl_leaf_sample_search_p_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list_utilities.sublisp_boolean($sbhl_sample_leaf_queues$.getDynamicValue(thread));
        }
    }

    @LispMethod(comment = "Accessor: @return booleanp; uses *sbhl-sample-leaf-queues* to answer whether current search is one that uses the leaf queues.")
    public static SubLObject sbhl_leaf_sample_search_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean($sbhl_sample_leaf_queues$.getDynamicValue(thread));
    }

    /**
     * Iterator. Iterates over *sbhl-sample-leaf-queues*, reorganizing it as appropriate.
     */
    @LispMethod(comment = "Iterator. Iterates over *sbhl-sample-leaf-queues*, reorganizing it as appropriate.")
    public static final SubLObject do_sbhl_sample_leaf_queues_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt123);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject node_var = NIL;
                    SubLObject found_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt123);
                    node_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt123);
                    found_var = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject queue = $sym124$QUEUE;
                            return listS(WHILE, list(CAND, $sbhl_sample_leaf_queues$, list(CNOT, found_var)), list(CLET, list(bq_cons(queue, $list_alt128), list(node_var, list(FIRST, list(QUEUE_ELEMENTS, queue)))), bq_cons(WITH_NEW_SBHL_LEAF_QUEUE, append(body, list(list(PIF, found_var, listS(PROGN, list(RPLACD, $list_alt133, listS(LIST, queue, $list_alt134)), $list_alt135), list(DEQUEUE, queue)))))), $list_alt137);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt123);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Iterator. Iterates over *sbhl-sample-leaf-queues*, reorganizing it as appropriate.")
    public static SubLObject do_sbhl_sample_leaf_queues(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list121);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject node_var = NIL;
        SubLObject found_var = NIL;
        destructuring_bind_must_consp(current, datum, $list121);
        node_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list121);
        found_var = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject queue = $sym122$QUEUE;
            return listS(WHILE, list(CAND, $sbhl_sample_leaf_queues$, list(CNOT, found_var)), list(CLET, list(bq_cons(queue, $list126), list(node_var, list(FIRST, list(QUEUE_ELEMENTS, queue)))), bq_cons(WITH_NEW_SBHL_LEAF_QUEUE, append(body, list(list(PIF, found_var, listS(PROGN, list(RPLACD, $list131, listS(LIST, queue, $list132)), $list133), list(DEQUEUE, queue)))))), $list135);
        }
        cdestructuring_bind_error(datum, $list121);
        return NIL;
    }

    /**
     * Returns result of call ing *sbhl-extremal-test-fn* on NODE.
     */
    @LispMethod(comment = "Returns result of call ing *sbhl-extremal-test-fn* on NODE.")
    public static final SubLObject sbhl_extremal_test_fn_p_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return funcall($sbhl_extremal_test_fn$.getDynamicValue(thread), node);
        }
    }

    @LispMethod(comment = "Returns result of call ing *sbhl-extremal-test-fn* on NODE.")
    public static SubLObject sbhl_extremal_test_fn_p(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return funcall($sbhl_extremal_test_fn$.getDynamicValue(thread), node);
    }

    /**
     * Binds *sbhl-extremal-test-fn* to FUNCTION within BODY.
     */
    @LispMethod(comment = "Binds *sbhl-extremal-test-fn* to FUNCTION within BODY.")
    public static final SubLObject with_sbhl_extremal_test_fn_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject function = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt83);
            function = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sbhl_extremal_test_fn$, function)), append(body, NIL));
            }
        }
    }

    @LispMethod(comment = "Binds *sbhl-extremal-test-fn* to FUNCTION within BODY.")
    public static SubLObject with_sbhl_extremal_test_fn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject function = NIL;
        destructuring_bind_must_consp(current, datum, $list81);
        function = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_extremal_test_fn$, function)), append(body, NIL));
    }

    /**
     * Accessor. @return booleanp. @see *sbhl-check-for-goal-marking-p*
     */
    @LispMethod(comment = "Accessor. @return booleanp. @see *sbhl-check-for-goal-marking-p*")
    public static final SubLObject sbhl_check_for_goal_marking_p_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_check_for_goal_marking_p$.getDynamicValue(thread);
        }
    }

    @LispMethod(comment = "Accessor. @return booleanp. @see *sbhl-check-for-goal-marking-p*")
    public static SubLObject sbhl_check_for_goal_marking_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_check_for_goal_marking_p$.getDynamicValue(thread);
    }

    /**
     * Initializes *sbhl-check-for-goal-marking-p* to T within BODY.
     */
    @LispMethod(comment = "Initializes *sbhl-check-for-goal-marking-p* to T within BODY.")
    public static final SubLObject with_sbhl_search_termination_on_previous_successes_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt139, append(body, NIL));
        }
    }

    @LispMethod(comment = "Initializes *sbhl-check-for-goal-marking-p* to T within BODY.")
    public static SubLObject with_sbhl_search_termination_on_previous_successes(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list137, append(body, NIL));
    }

    /**
     * Binds *sbhl-precomputed-goal-space* to GOAL-SPACE within BODY
     */
    @LispMethod(comment = "Binds *sbhl-precomputed-goal-space* to GOAL-SPACE within BODY")
    public static final SubLObject with_sbhl_precomputed_goal_space_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject goal_space = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt140);
            goal_space = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sbhl_precomputed_goal_space$, goal_space)), append(body, NIL));
            }
        }
    }

    @LispMethod(comment = "Binds *sbhl-precomputed-goal-space* to GOAL-SPACE within BODY")
    public static SubLObject with_sbhl_precomputed_goal_space(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject goal_space = NIL;
        destructuring_bind_must_consp(current, datum, $list138);
        goal_space = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_precomputed_goal_space$, goal_space)), append(body, NIL));
    }

    /**
     * Binds sbhl search truth to the encompassing true value.
     */
    @LispMethod(comment = "Binds sbhl search truth to the encompassing true value.")
    public static final SubLObject with_sbhl_true_search_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt142, append(body, NIL));
        }
    }

    @LispMethod(comment = "Binds sbhl search truth to the encompassing true value.")
    public static SubLObject with_sbhl_true_search(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list140, append(body, NIL));
    }

    /**
     * Binds sbhl search truth to the encompassing false value.
     */
    @LispMethod(comment = "Binds sbhl search truth to the encompassing false value.")
    public static final SubLObject with_sbhl_false_search_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt143, append(body, NIL));
        }
    }

    @LispMethod(comment = "Binds sbhl search truth to the encompassing false value.")
    public static SubLObject with_sbhl_false_search(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list141, append(body, NIL));
    }

    /**
     * Accessor: @return booleanp; whether *sbhl-tv* generalizes to #$True-JustificationTruth. @see sbhl-tv-generalizes-to-general-tv?
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether *sbhl-tv* generalizes to #$True-JustificationTruth. @see sbhl-tv-generalizes-to-general-tv?")
    public static final SubLObject sbhl_true_search_p_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.sbhl_true_tv_p($sbhl_search_truth$.getDynamicValue(thread));
        }
    }

    @LispMethod(comment = "Accessor: @return booleanp; whether *sbhl-tv* generalizes to #$True-JustificationTruth. @see sbhl-tv-generalizes-to-general-tv?")
    public static SubLObject sbhl_true_search_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_true_tv_p($sbhl_search_truth$.getDynamicValue(thread));
    }

    /**
     * Accessor: @return booleanp; whether *sbhl-tv* generalizes to #$False-JustificationTruth. @see sbhl-tv-generalizes-to-general-tv?
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether *sbhl-tv* generalizes to #$False-JustificationTruth. @see sbhl-tv-generalizes-to-general-tv?")
    public static final SubLObject sbhl_false_search_p_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.sbhl_false_tv_p($sbhl_search_truth$.getDynamicValue(thread));
        }
    }

    @LispMethod(comment = "Accessor: @return booleanp; whether *sbhl-tv* generalizes to #$False-JustificationTruth. @see sbhl-tv-generalizes-to-general-tv?")
    public static SubLObject sbhl_false_search_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_false_tv_p($sbhl_search_truth$.getDynamicValue(thread));
    }

    /**
     *
     *
     * @return booleanp; whether TRUTH is a member of *sbhl-search-truth-values*
     */
    @LispMethod(comment = "@return booleanp; whether TRUTH is a member of *sbhl-search-truth-values*")
    public static final SubLObject sbhl_search_truth_value_p_alt(SubLObject truth) {
        return subl_promotions.memberP(truth, $sbhl_search_truth_values$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return booleanp; whether TRUTH is a member of *sbhl-search-truth-values*
     */
    @LispMethod(comment = "@return booleanp; whether TRUTH is a member of *sbhl-search-truth-values*")
    public static SubLObject sbhl_search_truth_value_p(final SubLObject truth) {
        return subl_promotions.memberP(truth, $sbhl_search_truth_values$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return sbhl-search-truth-value-p; the encompassing true truth.
     */
    @LispMethod(comment = "@return sbhl-search-truth-value-p; the encompassing true truth.")
    public static final SubLObject get_sbhl_true_tv_alt() {
        return $sbhl_true_tv$.getGlobalValue();
    }

    /**
     *
     *
     * @return sbhl-search-truth-value-p; the encompassing true truth.
     */
    @LispMethod(comment = "@return sbhl-search-truth-value-p; the encompassing true truth.")
    public static SubLObject get_sbhl_true_tv() {
        return $sbhl_true_tv$.getGlobalValue();
    }

    /**
     *
     *
     * @return sbhl-search-truth-value-p; the encompassing false truth.
     */
    @LispMethod(comment = "@return sbhl-search-truth-value-p; the encompassing false truth.")
    public static final SubLObject get_sbhl_false_tv_alt() {
        return $sbhl_false_tv$.getGlobalValue();
    }

    /**
     *
     *
     * @return sbhl-search-truth-value-p; the encompassing false truth.
     */
    @LispMethod(comment = "@return sbhl-search-truth-value-p; the encompassing false truth.")
    public static SubLObject get_sbhl_false_tv() {
        return $sbhl_false_tv$.getGlobalValue();
    }

    /**
     *
     *
     * @return sbhl-search-truth-value-p; the truth relevance for the current search.
     */
    @LispMethod(comment = "@return sbhl-search-truth-value-p; the truth relevance for the current search.")
    public static final SubLObject get_sbhl_tv_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_tv$.getDynamicValue(thread);
        }
    }

    /**
     *
     *
     * @return sbhl-search-truth-value-p; the truth relevance for the current search.
     */
    @LispMethod(comment = "@return sbhl-search-truth-value-p; the truth relevance for the current search.")
    public static SubLObject get_sbhl_tv() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_tv$.getDynamicValue(thread);
    }

    /**
     * Accessor: Ignores TV, and returns T for relevance queries.
     */
    @LispMethod(comment = "Accessor: Ignores TV, and returns T for relevance queries.")
    public static final SubLObject relevant_sbhl_tv_is_everything_alt(SubLObject tv) {
        return T;
    }

    @LispMethod(comment = "Accessor: Ignores TV, and returns T for relevance queries.")
    public static SubLObject relevant_sbhl_tv_is_everything(final SubLObject tv) {
        return T;
    }

    /**
     * Accessor: @return booleanp; whether TV is subsumed by GENERAL-TV.
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether TV is subsumed by GENERAL-TV.")
    public static final SubLObject sbhl_tv_generalizes_to_general_tvP_alt(SubLObject tv, SubLObject general_tv) {
        if (tv == general_tv) {
            return T;
        }
        {
            SubLObject pcase_var = tv;
            if (pcase_var.eql($$MonotonicallyTrue)) {
                return makeBoolean(((general_tv == $$DefaultTrue) || (general_tv == $$True_JustificationTruth)) || (general_tv == $$ArbitraryTruth_JustifactionTruth));
            } else {
                if (pcase_var.eql($$DefaultTrue)) {
                    return makeBoolean((general_tv == $$True_JustificationTruth) || (general_tv == $$ArbitraryTruth_JustificationTruth));
                } else {
                    if (pcase_var.eql($$True_JustificationTruth)) {
                        return eq(general_tv, $$ArbitraryTruth_JustificationTruth);
                    } else {
                        if (pcase_var.eql($$MonotonicallyFalse)) {
                            return makeBoolean(((general_tv == $$DefaultFalse) || (general_tv == $$False_JustificationTruth)) || (general_tv == $$JustifactionTruth));
                        } else {
                            if (pcase_var.eql($$DefaultFalse)) {
                                return makeBoolean((general_tv == $$False_JustificationTruth) || (general_tv == $$ArbitraryTruth_JustificationTruth));
                            } else {
                                if (pcase_var.eql($$False_JustificationTruth)) {
                                    return eq(general_tv, $$ArbitraryTruth_JustificationTruth);
                                } else {
                                    if (pcase_var.eql($$Unknown_JustificationTruth)) {
                                        return eq(general_tv, $$ArbitraryTruth_JustificationTruth);
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

    @LispMethod(comment = "Accessor: @return booleanp; whether TV is subsumed by GENERAL-TV.")
    public static SubLObject sbhl_tv_generalizes_to_general_tvP(final SubLObject tv, final SubLObject general_tv) {
        if (tv.eql(general_tv)) {
            return T;
        }
        if (tv.eql($$MonotonicallyTrue)) {
            return makeBoolean((general_tv.eql($$DefaultTrue) || general_tv.eql($$True_JustificationTruth)) || general_tv.eql($$ArbitraryTruth_JustifactionTruth));
        }
        if (tv.eql($$DefaultTrue)) {
            return makeBoolean(general_tv.eql($$True_JustificationTruth) || general_tv.eql($$ArbitraryTruth_JustificationTruth));
        }
        if (tv.eql($$True_JustificationTruth)) {
            return eql(general_tv, $$ArbitraryTruth_JustificationTruth);
        }
        if (tv.eql($$MonotonicallyFalse)) {
            return makeBoolean((general_tv.eql($$DefaultFalse) || general_tv.eql($$False_JustificationTruth)) || general_tv.eql($$JustifactionTruth));
        }
        if (tv.eql($$DefaultFalse)) {
            return makeBoolean(general_tv.eql($$False_JustificationTruth) || general_tv.eql($$ArbitraryTruth_JustificationTruth));
        }
        if (tv.eql($$False_JustificationTruth)) {
            return eql(general_tv, $$ArbitraryTruth_JustificationTruth);
        }
        if (tv.eql($$Unknown_JustificationTruth)) {
            return eql(general_tv, $$ArbitraryTruth_JustificationTruth);
        }
        return NIL;
    }

    /**
     * Accessor: @return booleanp; whether TV generalizes to *sbhl-tv*
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether TV generalizes to *sbhl-tv*")
    public static final SubLObject relevant_sbhl_tv_is_general_tv_alt(SubLObject tv) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.sbhl_tv_generalizes_to_general_tvP(tv, $sbhl_tv$.getDynamicValue(thread));
        }
    }

    @LispMethod(comment = "Accessor: @return booleanp; whether TV generalizes to *sbhl-tv*")
    public static SubLObject relevant_sbhl_tv_is_general_tv(final SubLObject tv) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_tv_generalizes_to_general_tvP(tv, $sbhl_tv$.getDynamicValue(thread));
    }/**
     * Accessor: @return booleanp; whether TV generalizes to *sbhl-tv*
     */


    /**
     * Accessor: @return booleanp; applies *relevant-sbhl-tv-function* to TV, or if no function is bound as default applies @see relevant-sbhl-tv-is-general-tv.
     */
    @LispMethod(comment = "Accessor: @return booleanp; applies *relevant-sbhl-tv-function* to TV, or if no function is bound as default applies @see relevant-sbhl-tv-is-general-tv.")
    public static final SubLObject relevant_sbhl_tvP_alt(SubLObject tv) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != $relevant_sbhl_tv_function$.getDynamicValue(thread) ? ((SubLObject) (funcall($relevant_sbhl_tv_function$.getDynamicValue(thread), tv))) : com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.relevant_sbhl_tv_is_general_tv(tv);
        }
    }

    @LispMethod(comment = "Accessor: @return booleanp; applies *relevant-sbhl-tv-function* to TV, or if no function is bound as default applies @see relevant-sbhl-tv-is-general-tv.")
    public static SubLObject relevant_sbhl_tvP(final SubLObject tv) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != $relevant_sbhl_tv_function$.getDynamicValue(thread) ? funcall($relevant_sbhl_tv_function$.getDynamicValue(thread), tv) : relevant_sbhl_tv_is_general_tv(tv);
    }/**
     * Accessor: @return booleanp; applies *relevant-sbhl-tv-function* to TV, or if no function is bound as default applies @see relevant-sbhl-tv-is-general-tv.
     */


    /**
     * Accessor: @return booleanp; whether TV generalizes to #$True-JustificationTruth. @see sbhl-tv-generalizes-to-general-tv?
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether TV generalizes to #$True-JustificationTruth. @see sbhl-tv-generalizes-to-general-tv?")
    public static final SubLObject sbhl_true_tv_p_alt(SubLObject tv) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.sbhl_tv_generalizes_to_general_tvP(tv, $$True_JustificationTruth);
    }

    @LispMethod(comment = "Accessor: @return booleanp; whether TV generalizes to #$True-JustificationTruth. @see sbhl-tv-generalizes-to-general-tv?")
    public static SubLObject sbhl_true_tv_p(final SubLObject tv) {
        return sbhl_tv_generalizes_to_general_tvP(tv, $$True_JustificationTruth);
    }/**
     * Accessor: @return booleanp; whether TV generalizes to #$True-JustificationTruth. @see sbhl-tv-generalizes-to-general-tv?
     */


    /**
     * Accessor: @return booleanp; whether TV generalizes to #$False-JustificationTruth. @see sbhl-tv-generalizes-to-general-tv?
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether TV generalizes to #$False-JustificationTruth. @see sbhl-tv-generalizes-to-general-tv?")
    public static final SubLObject sbhl_false_tv_p_alt(SubLObject tv) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.sbhl_tv_generalizes_to_general_tvP(tv, $$False_JustificationTruth);
    }

    @LispMethod(comment = "Accessor: @return booleanp; whether TV generalizes to #$False-JustificationTruth. @see sbhl-tv-generalizes-to-general-tv?")
    public static SubLObject sbhl_false_tv_p(final SubLObject tv) {
        return sbhl_tv_generalizes_to_general_tvP(tv, $$False_JustificationTruth);
    }/**
     * Accessor: @return booleanp; whether TV generalizes to #$False-JustificationTruth. @see sbhl-tv-generalizes-to-general-tv?
     */


    public static SubLObject sbhl_opposite_or_nil_tv(final SubLObject tv) {
        if (tv.eql($$MonotonicallyTrue)) {
            return $$MonotonicallyFalse;
        }
        if (tv.eql($$DefaultTrue)) {
            return $$DefaultFalse;
        }
        if (tv.eql($$MonotonicallyFalse)) {
            return $$MonotonicallyTrue;
        }
        if (tv.eql($$DefaultFalse)) {
            return $$DefaultTrue;
        }
        if (tv.eql($$True_JustificationTruth)) {
            return $$False_JustificationTruth;
        }
        if (tv.eql($$False_JustificationTruth)) {
            return $$True_JustificationTruth;
        }
        if (tv.eql($$ArbitraryTruth_JustificationTruth)) {
            return $$ArbitraryTruth_JustificationTruth;
        }
        return NIL;
    }

    /**
     * Accessor: @return sbhl-search-truth-value-p; the truth value with same strength and opposite truth from TV.
     */
    @LispMethod(comment = "Accessor: @return sbhl-search-truth-value-p; the truth value with same strength and opposite truth from TV.")
    public static final SubLObject sbhl_opposite_tv_alt(SubLObject tv) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = tv;
                if (pcase_var.eql($$MonotonicallyTrue)) {
                    return $$MonotonicallyFalse;
                } else {
                    if (pcase_var.eql($$DefaultTrue)) {
                        return $$DefaultFalse;
                    } else {
                        if (pcase_var.eql($$MonotonicallyFalse)) {
                            return $$MonotonicallyTrue;
                        } else {
                            if (pcase_var.eql($$DefaultFalse)) {
                                return $$DefaultTrue;
                            } else {
                                if (pcase_var.eql($$True_JustificationTruth)) {
                                    return $$False_JustificationTruth;
                                } else {
                                    if (pcase_var.eql($$False_JustificationTruth)) {
                                        return $$True_JustificationTruth;
                                    } else {
                                        if (pcase_var.eql($$ArbitraryTruth_JustificationTruth)) {
                                            return $$ArbitraryTruth_JustificationTruth;
                                        } else {
                                            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.sbhl_search_truth_value_p(tv)) {
                                                    {
                                                        SubLObject pcase_var_1 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                        if (pcase_var_1.eql($ERROR)) {
                                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt156$_A_is_not_a__A, tv, SBHL_SEARCH_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } else {
                                                            if (pcase_var_1.eql($CERROR)) {
                                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt156$_A_is_not_a__A, tv, SBHL_SEARCH_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            } else {
                                                                if (pcase_var_1.eql($WARN)) {
                                                                    Errors.warn($str_alt156$_A_is_not_a__A, tv, SBHL_SEARCH_TRUTH_VALUE_P);
                                                                } else {
                                                                    Errors.warn($str_alt161$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                    Errors.cerror($$$continue_anyway, $str_alt156$_A_is_not_a__A, tv, SBHL_SEARCH_TRUTH_VALUE_P);
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
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Accessor: @return sbhl-search-truth-value-p; the truth value with same strength and opposite truth from TV.
     */
    @LispMethod(comment = "Accessor: @return sbhl-search-truth-value-p; the truth value with same strength and opposite truth from TV.")
    public static SubLObject sbhl_opposite_tv(final SubLObject tv) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject opposite_tv = sbhl_opposite_or_nil_tv(tv);
        if (((NIL == opposite_tv) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_truth_value_p(tv))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str154$_A_is_not_a__A, tv, SBHL_SEARCH_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str154$_A_is_not_a__A, tv, SBHL_SEARCH_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str154$_A_is_not_a__A, tv, SBHL_SEARCH_TRUTH_VALUE_P);
                    } else {
                        Errors.warn($str159$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str154$_A_is_not_a__A, tv, SBHL_SEARCH_TRUTH_VALUE_P);
                    }


        }
        return opposite_tv;
    }

    /**
     * Accessor: @return sbhl-search-truth-value-p; the true truth value with same strength as TV
     */
    @LispMethod(comment = "Accessor: @return sbhl-search-truth-value-p; the true truth value with same strength as TV")
    public static final SubLObject sbhl_true_tv_alt(SubLObject tv) {
        if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.sbhl_true_tv_p(tv)) {
            return tv;
        } else {
            if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.sbhl_false_tv_p(tv)) {
                return com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.sbhl_opposite_tv(tv);
            } else {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt162$Expected_true_or_false_sbhl_truth, tv, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Accessor: @return sbhl-search-truth-value-p; the true truth value with same strength as TV")
    public static SubLObject sbhl_true_tv(final SubLObject tv) {
        if (NIL != sbhl_true_tv_p(tv)) {
            return tv;
        }
        if (NIL != sbhl_false_tv_p(tv)) {
            return sbhl_opposite_tv(tv);
        }
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str160$Expected_true_or_false_sbhl_truth, tv, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }/**
     * Accessor: @return sbhl-search-truth-value-p; the true truth value with same strength as TV
     */


    /**
     * Accessor: @return sbhl-search-truth-value-p; the false truth value with same strength as TV
     */
    @LispMethod(comment = "Accessor: @return sbhl-search-truth-value-p; the false truth value with same strength as TV")
    public static final SubLObject sbhl_false_tv_alt(SubLObject tv) {
        if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.sbhl_false_tv_p(tv)) {
            return tv;
        } else {
            if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.sbhl_true_tv_p(tv)) {
                return com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.sbhl_opposite_tv(tv);
            } else {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt162$Expected_true_or_false_sbhl_truth, tv, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Accessor: @return sbhl-search-truth-value-p; the false truth value with same strength as TV")
    public static SubLObject sbhl_false_tv(final SubLObject tv) {
        if (NIL != sbhl_false_tv_p(tv)) {
            return tv;
        }
        if (NIL != sbhl_true_tv_p(tv)) {
            return sbhl_opposite_tv(tv);
        }
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str160$Expected_true_or_false_sbhl_truth, tv, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }/**
     * Accessor: @return sbhl-search-truth-value-p; the false truth value with same strength as TV
     */


    /**
     * Accessor: @return sbhl-search-truth-value-p; the true truth value with same strength as *sbhl-tv*
     */
    @LispMethod(comment = "Accessor: @return sbhl-search-truth-value-p; the true truth value with same strength as *sbhl-tv*")
    public static final SubLObject sbhl_search_true_tv_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.sbhl_true_tv($sbhl_tv$.getDynamicValue(thread));
        }
    }

    @LispMethod(comment = "Accessor: @return sbhl-search-truth-value-p; the true truth value with same strength as *sbhl-tv*")
    public static SubLObject sbhl_search_true_tv() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_true_tv($sbhl_tv$.getDynamicValue(thread));
    }/**
     * Accessor: @return sbhl-search-truth-value-p; the true truth value with same strength as *sbhl-tv*
     */


    /**
     * Accessor: @return sbhl-search-truth-value-p; the false truth value with same strength as *sbhl-tv*
     */
    @LispMethod(comment = "Accessor: @return sbhl-search-truth-value-p; the false truth value with same strength as *sbhl-tv*")
    public static final SubLObject sbhl_search_false_tv_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.sbhl_false_tv($sbhl_tv$.getDynamicValue(thread));
        }
    }

    @LispMethod(comment = "Accessor: @return sbhl-search-truth-value-p; the false truth value with same strength as *sbhl-tv*")
    public static SubLObject sbhl_search_false_tv() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_false_tv($sbhl_tv$.getDynamicValue(thread));
    }/**
     * Accessor: @return sbhl-search-truth-value-p; the false truth value with same strength as *sbhl-tv*
     */


    /**
     * Accessor. @return keywordp; the keyword associated with TV, either :true or :false.
     */
    @LispMethod(comment = "Accessor. @return keywordp; the keyword associated with TV, either :true or :false.")
    public static final SubLObject sbhl_translate_to_old_tv_alt(SubLObject tv) {
        if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.sbhl_true_tv_p(tv)) {
            return $TRUE;
        } else {
            if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.sbhl_false_tv_p(tv)) {
                return $FALSE;
            } else {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt165$unknown_truth_value_for_translati, tv, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return NIL;
            }
        }
    }

    @LispMethod(comment = "Accessor. @return keywordp; the keyword associated with TV, either :true or :false.")
    public static SubLObject sbhl_translate_to_old_tv(final SubLObject tv) {
        if (NIL != sbhl_true_tv_p(tv)) {
            return $TRUE;
        }
        if (NIL != sbhl_false_tv_p(tv)) {
            return $FALSE;
        }
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str163$unknown_truth_value_for_translati, tv, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }/**
     * Accessor. @return keywordp; the keyword associated with TV, either :true or :false.
     */


    public static final SubLObject sbhl_possibly_translate_tv_alt(SubLObject tv) {
        if (!((tv == $TRUE) || (tv == $FALSE))) {
            return com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.sbhl_translate_to_old_tv(tv);
        }
        return tv;
    }

    public static SubLObject sbhl_possibly_translate_tv(final SubLObject tv) {
        if ((tv != $TRUE) && (tv != $FALSE)) {
            return sbhl_translate_to_old_tv(tv);
        }
        return tv;
    }

    public static final SubLObject sbhl_truth_to_support_truth_alt(SubLObject tv) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = tv;
                if (pcase_var.eql($$MonotonicallyTrue)) {
                    return $TRUE_MON;
                } else {
                    if (pcase_var.eql($$DefaultTrue)) {
                        return $TRUE_DEF;
                    } else {
                        if (pcase_var.eql($$MonotonicallyFalse)) {
                            return $FALSE_MON;
                        } else {
                            if (pcase_var.eql($$DefaultFalse)) {
                                return $FALSE_DEF;
                            } else {
                                if (pcase_var.eql($$True_JustificationTruth)) {
                                    return $TRUE_DEF;
                                } else {
                                    if (pcase_var.eql($$False_JustificationTruth)) {
                                        return $FALSE_DEF;
                                    } else {
                                        if (pcase_var.eql($$ArbitraryTruth_JustificationTruth)) {
                                            return $TRUE_DEF;
                                        } else {
                                            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.sbhl_search_truth_value_p(tv)) {
                                                    {
                                                        SubLObject pcase_var_2 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                        if (pcase_var_2.eql($ERROR)) {
                                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt156$_A_is_not_a__A, tv, SBHL_SEARCH_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } else {
                                                            if (pcase_var_2.eql($CERROR)) {
                                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt156$_A_is_not_a__A, tv, SBHL_SEARCH_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            } else {
                                                                if (pcase_var_2.eql($WARN)) {
                                                                    Errors.warn($str_alt156$_A_is_not_a__A, tv, SBHL_SEARCH_TRUTH_VALUE_P);
                                                                } else {
                                                                    Errors.warn($str_alt161$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                    Errors.cerror($$$continue_anyway, $str_alt156$_A_is_not_a__A, tv, SBHL_SEARCH_TRUTH_VALUE_P);
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
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject sbhl_truth_to_support_truth(final SubLObject tv) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (tv.eql($$MonotonicallyTrue)) {
            return $TRUE_MON;
        }
        if (tv.eql($$DefaultTrue)) {
            return $TRUE_DEF;
        }
        if (tv.eql($$MonotonicallyFalse)) {
            return $FALSE_MON;
        }
        if (tv.eql($$DefaultFalse)) {
            return $FALSE_DEF;
        }
        if (tv.eql($$True_JustificationTruth)) {
            return $TRUE_DEF;
        }
        if (tv.eql($$False_JustificationTruth)) {
            return $FALSE_DEF;
        }
        if (tv.eql($$ArbitraryTruth_JustificationTruth)) {
            return $TRUE_DEF;
        }
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_search_truth_value_p(tv))) {
            final SubLObject pcase_var_$1 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var_$1.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str154$_A_is_not_a__A, tv, SBHL_SEARCH_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var_$1.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str154$_A_is_not_a__A, tv, SBHL_SEARCH_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var_$1.eql($WARN)) {
                        Errors.warn($str154$_A_is_not_a__A, tv, SBHL_SEARCH_TRUTH_VALUE_P);
                    } else {
                        Errors.warn($str159$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str154$_A_is_not_a__A, tv, SBHL_SEARCH_TRUTH_VALUE_P);
                    }


        }
        return NIL;
    }

    public static final SubLObject support_truth_to_sbhl_truth_alt(SubLObject tv) {
        {
            SubLObject pcase_var = tv;
            if (pcase_var.eql($TRUE_MON)) {
                return $$MonotonicallyTrue;
            } else {
                if (pcase_var.eql($TRUE_DEF)) {
                    return $$DefaultTrue;
                } else {
                    if (pcase_var.eql($FALSE_MON)) {
                        return $$MonotonicallyFalse;
                    } else {
                        if (pcase_var.eql($FALSE_DEF)) {
                            return $$DefaultFalse;
                        } else {
                            return Errors.error($str_alt170$Cannot_translate__s_truth_to_an_s, tv);
                        }
                    }
                }
            }
        }
    }

    public static SubLObject support_truth_to_sbhl_truth(final SubLObject tv) {
        if (tv.eql($TRUE_MON)) {
            return $$MonotonicallyTrue;
        }
        if (tv.eql($TRUE_DEF)) {
            return $$DefaultTrue;
        }
        if (tv.eql($FALSE_MON)) {
            return $$MonotonicallyFalse;
        }
        if (tv.eql($FALSE_DEF)) {
            return $$DefaultFalse;
        }
        return Errors.error($str168$Cannot_translate__s_truth_to_an_s, tv);
    }

    /**
     * any sbhl-tv for which FUNCTION returns non-nil is relevant within BODY
     */
    @LispMethod(comment = "any sbhl-tv for which FUNCTION returns non-nil is relevant within BODY")
    public static final SubLObject with_sbhl_tv_function_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject function = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt83);
            function = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($relevant_sbhl_tv_function$, function)), append(body, NIL));
            }
        }
    }

    @LispMethod(comment = "any sbhl-tv for which FUNCTION returns non-nil is relevant within BODY")
    public static SubLObject with_sbhl_tv_function(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject function = NIL;
        destructuring_bind_must_consp(current, datum, $list81);
        function = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($relevant_sbhl_tv_function$, function)), append(body, NIL));
    }/**
     * any sbhl-tv for which FUNCTION returns non-nil is relevant within BODY
     */


    /**
     * BODY is executed with *sbhl-tv* bound to SBHL-TV
     */
    @LispMethod(comment = "BODY is executed with *sbhl-tv* bound to SBHL-TV")
    public static final SubLObject with_sbhl_tv_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject sbhl_tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt172);
            sbhl_tv = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sbhl_tv$, sbhl_tv)), append(body, NIL));
            }
        }
    }

    @LispMethod(comment = "BODY is executed with *sbhl-tv* bound to SBHL-TV")
    public static SubLObject with_sbhl_tv(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject sbhl_tv = NIL;
        destructuring_bind_must_consp(current, datum, $list170);
        sbhl_tv = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_tv$, sbhl_tv)), append(body, NIL));
    }/**
     * BODY is executed with *sbhl-tv* bound to SBHL-TV
     */


    /**
     * All sbhl-tvs are relevant within BODY.
     */
    @LispMethod(comment = "All sbhl-tvs are relevant within BODY.")
    public static final SubLObject with_all_sbhl_tvs_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_SBHL_TV_FUNCTION, $list_alt175, append(body, NIL));
        }
    }

    @LispMethod(comment = "All sbhl-tvs are relevant within BODY.")
    public static SubLObject with_all_sbhl_tvs(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_SBHL_TV_FUNCTION, $list173, append(body, NIL));
    }/**
     * All sbhl-tvs are relevant within BODY.
     */


    /**
     * SBHL-TV and all its spec-tvs are relevant within BODY.
     */
    @LispMethod(comment = "SBHL-TV and all its spec-tvs are relevant within BODY.")
    public static final SubLObject with_general_sbhl_tv_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject sbhl_tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt172);
            sbhl_tv = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(WITH_SBHL_TV_FUNCTION, $list_alt176, listS(WITH_SBHL_TV, sbhl_tv, append(body, NIL)));
            }
        }
    }

    @LispMethod(comment = "SBHL-TV and all its spec-tvs are relevant within BODY.")
    public static SubLObject with_general_sbhl_tv(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject sbhl_tv = NIL;
        destructuring_bind_must_consp(current, datum, $list170);
        sbhl_tv = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(WITH_SBHL_TV_FUNCTION, $list174, listS(WITH_SBHL_TV, sbhl_tv, append(body, NIL)));
    }/**
     * SBHL-TV and all its spec-tvs are relevant within BODY.
     */


    /**
     * Only SBHL-TV is relevant within BODY (no genlSbhl-Tvs).
     */
    @LispMethod(comment = "Only SBHL-TV is relevant within BODY (no genlSbhl-Tvs).")
    public static final SubLObject with_just_sbhl_tv_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject sbhl_tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt172);
            sbhl_tv = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(WITH_SBHL_TV_FUNCTION, $list_alt178, listS(WITH_SBHL_TV, sbhl_tv, append(body, NIL)));
            }
        }
    }

    @LispMethod(comment = "Only SBHL-TV is relevant within BODY (no genlSbhl-Tvs).")
    public static SubLObject with_just_sbhl_tv(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject sbhl_tv = NIL;
        destructuring_bind_must_consp(current, datum, $list170);
        sbhl_tv = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(WITH_SBHL_TV_FUNCTION, $list176, listS(WITH_SBHL_TV, sbhl_tv, append(body, NIL)));
    }/**
     * Only SBHL-TV is relevant within BODY (no genlSbhl-Tvs).
     */


    /**
     * Binds search tv and relevance function whether or not TV is provided.
     */
    @LispMethod(comment = "Binds search tv and relevance function whether or not TV is provided.")
    public static final SubLObject possibly_with_sbhl_tv_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt179);
            tv = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject tv_var = $sym180$TV_VAR;
                return listS(CLET, list(list(tv_var, tv), list($sbhl_tv$, listS(FIF, tv_var, tv_var, $list_alt182)), list($relevant_sbhl_tv_function$, listS(FIF, tv_var, $list_alt183))), list(PWHEN, tv_var, listS(SBHL_CHECK_TYPE, tv_var, $list_alt186)), append(body, NIL));
            }
        }
    }

    @LispMethod(comment = "Binds search tv and relevance function whether or not TV is provided.")
    public static SubLObject possibly_with_sbhl_tv(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject tv = NIL;
        destructuring_bind_must_consp(current, datum, $list177);
        tv = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject tv_var = $sym178$TV_VAR;
        return listS(CLET, list(list(tv_var, tv), list($sbhl_tv$, listS(FIF, tv_var, tv_var, $list180)), list($relevant_sbhl_tv_function$, listS(FIF, tv_var, $list181))), list(PWHEN, tv_var, listS(SBHL_CHECK_TYPE, tv_var, $list184)), append(body, NIL));
    }/**
     * Binds search tv and relevance function whether or not TV is provided.
     */


    /**
     * Binds search tv and relevance function to a true truth whether or not TV is provided.
     */
    @LispMethod(comment = "Binds search tv and relevance function to a true truth whether or not TV is provided.")
    public static final SubLObject possibly_with_sbhl_true_tv_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt179);
            tv = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject tv_var = $sym187$TV_VAR;
                return listS(CLET, list(list(tv_var, tv), list($sbhl_tv$, listS(FIF, tv_var, tv_var, $list_alt188)), list($relevant_sbhl_tv_function$, listS(FIF, tv_var, $list_alt183))), list(PWHEN, tv_var, listS(SBHL_CHECK_TYPE, tv_var, $list_alt189)), append(body, NIL));
            }
        }
    }

    @LispMethod(comment = "Binds search tv and relevance function to a true truth whether or not TV is provided.")
    public static SubLObject possibly_with_sbhl_true_tv(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject tv = NIL;
        destructuring_bind_must_consp(current, datum, $list177);
        tv = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject tv_var = $sym185$TV_VAR;
        return listS(CLET, list(list(tv_var, tv), list($sbhl_tv$, listS(FIF, tv_var, tv_var, $list186)), list($relevant_sbhl_tv_function$, listS(FIF, tv_var, $list181))), list(PWHEN, tv_var, listS(SBHL_CHECK_TYPE, tv_var, $list187)), append(body, NIL));
    }/**
     * Binds search tv and relevance function to a true truth whether or not TV is provided.
     */


    /**
     * Binds search tv and relevance function to a false truth whether or not TV is provided.
     */
    @LispMethod(comment = "Binds search tv and relevance function to a false truth whether or not TV is provided.")
    public static final SubLObject possibly_with_sbhl_false_tv_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt179);
            tv = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject tv_var = $sym190$TV_VAR;
                return listS(CLET, list(list(tv_var, tv), list($sbhl_tv$, listS(FIF, tv_var, tv_var, $list_alt191)), list($relevant_sbhl_tv_function$, listS(FIF, tv_var, $list_alt183))), list(PWHEN, tv_var, listS(SBHL_CHECK_TYPE, tv_var, $list_alt192)), append(body, NIL));
            }
        }
    }

    @LispMethod(comment = "Binds search tv and relevance function to a false truth whether or not TV is provided.")
    public static SubLObject possibly_with_sbhl_false_tv(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject tv = NIL;
        destructuring_bind_must_consp(current, datum, $list177);
        tv = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject tv_var = $sym188$TV_VAR;
        return listS(CLET, list(list(tv_var, tv), list($sbhl_tv$, listS(FIF, tv_var, tv_var, $list189)), list($relevant_sbhl_tv_function$, listS(FIF, tv_var, $list181))), list(PWHEN, tv_var, listS(SBHL_CHECK_TYPE, tv_var, $list190)), append(body, NIL));
    }/**
     * Binds search tv and relevance function to a false truth whether or not TV is provided.
     */


    public static final SubLObject possibly_with_sbhl_mt_relevance_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt193);
            mt = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(POSSIBLY_WITH_INFERENCE_MT_RELEVANCE, mt, append(body, NIL));
            }
        }
    }

    public static SubLObject possibly_with_sbhl_mt_relevance(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list191);
        mt = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(POSSIBLY_WITH_INFERENCE_MT_RELEVANCE, mt, append(body, NIL));
    }

    public static SubLObject declare_sbhl_search_vars_file() {
        declareMacro("initialize_sbhl_search", "INITIALIZE-SBHL-SEARCH");
        declareMacro("initialize_sbhl_search_wXo_spaces", "INITIALIZE-SBHL-SEARCH-W/O-SPACES");
        declareMacro("with_sbhl_forward_true_conditions", "WITH-SBHL-FORWARD-TRUE-CONDITIONS");
        declareMacro("with_sbhl_backward_true_conditions", "WITH-SBHL-BACKWARD-TRUE-CONDITIONS");
        declareMacro("with_sbhl_forward_false_conditions", "WITH-SBHL-FORWARD-FALSE-CONDITIONS");
        declareMacro("with_sbhl_backward_false_conditions", "WITH-SBHL-BACKWARD-FALSE-CONDITIONS");
        declareMacro("with_sbhl_forward_true_search", "WITH-SBHL-FORWARD-TRUE-SEARCH");
        declareMacro("with_sbhl_backward_true_search", "WITH-SBHL-BACKWARD-TRUE-SEARCH");
        declareMacro("with_sbhl_forward_false_search", "WITH-SBHL-FORWARD-FALSE-SEARCH");
        declareMacro("with_sbhl_backward_false_search", "WITH-SBHL-BACKWARD-FALSE-SEARCH");
        declareMacro("with_sbhl_forward_true_subsearch", "WITH-SBHL-FORWARD-TRUE-SUBSEARCH");
        declareMacro("with_sbhl_backward_true_subsearch", "WITH-SBHL-BACKWARD-TRUE-SUBSEARCH");
        declareMacro("with_sbhl_forward_false_subsearch", "WITH-SBHL-FORWARD-FALSE-SUBSEARCH");
        declareMacro("with_sbhl_backward_false_subsearch", "WITH-SBHL-BACKWARD-FALSE-SUBSEARCH");
        declareFunction("sbhl_search_type_p", "SBHL-SEARCH-TYPE-P", 1, 0, false);
        declareFunction("get_sbhl_search_type", "GET-SBHL-SEARCH-TYPE", 0, 0, false);
        declareMacro("with_sbhl_search_type", "WITH-SBHL-SEARCH-TYPE");
        declareMacro("with_sbhl_closure_search", "WITH-SBHL-CLOSURE-SEARCH");
        declareMacro("with_sbhl_boolean_search", "WITH-SBHL-BOOLEAN-SEARCH");
        declareMacro("with_sbhl_what_mts_search", "WITH-SBHL-WHAT-MTS-SEARCH");
        declareFunction("sbhl_closure_search_p", "SBHL-CLOSURE-SEARCH-P", 0, 0, false);
        declareFunction("sbhl_boolean_search_p", "SBHL-BOOLEAN-SEARCH-P", 0, 0, false);
        declareFunction("sbhl_what_mts_search_p", "SBHL-WHAT-MTS-SEARCH-P", 0, 0, false);
        declareFunction("sbhl_goal_search_p", "SBHL-GOAL-SEARCH-P", 0, 0, false);
        declareFunction("sbhl_justification_search_p", "SBHL-JUSTIFICATION-SEARCH-P", 0, 0, false);
        declareMacro("with_sbhl_justification_search", "WITH-SBHL-JUSTIFICATION-SEARCH");
        declareMacro("without_sbhl_justification_search", "WITHOUT-SBHL-JUSTIFICATION-SEARCH");
        declareFunction("get_sbhl_search_behavior", "GET-SBHL-SEARCH-BEHAVIOR", 0, 0, false);
        declareMacro("with_sbhl_search_behavior", "WITH-SBHL-SEARCH-BEHAVIOR");
        declareFunction("get_sbhl_just_behavior", "GET-SBHL-JUST-BEHAVIOR", 0, 0, false);
        declareMacro("with_sbhl_justification_behavior", "WITH-SBHL-JUSTIFICATION-BEHAVIOR");
        declareMacro("possibly_with_sbhl_justification_behavior", "POSSIBLY-WITH-SBHL-JUSTIFICATION-BEHAVIOR");
        declareMacro("with_sbhl_assertion_justifications", "WITH-SBHL-ASSERTION-JUSTIFICATIONS");
        declareMacro("with_sbhl_verbose_justifications", "WITH-SBHL-VERBOSE-JUSTIFICATIONS");
        declareMacro("with_sbhl_old_justifications", "WITH-SBHL-OLD-JUSTIFICATIONS");
        declareMacro("with_sbhl_justification_default", "WITH-SBHL-JUSTIFICATION-DEFAULT");
        declareFunction("sbhl_justification_behavior_defaults_old", "SBHL-JUSTIFICATION-BEHAVIOR-DEFAULTS-OLD", 0, 0, false);
        declareFunction("sbhl_justification_defaulted_old_p", "SBHL-JUSTIFICATION-DEFAULTED-OLD-P", 0, 0, false);
        declareFunction("sbhl_justification_assembled", "SBHL-JUSTIFICATION-ASSEMBLED", 0, 0, false);
        declareMacro("with_sbhl_justification_unassembled", "WITH-SBHL-JUSTIFICATION-UNASSEMBLED");
        declareFunction("sbhl_justification_assembled_p", "SBHL-JUSTIFICATION-ASSEMBLED-P", 0, 0, false);
        declareFunction("sbhl_unmarking_search_p", "SBHL-UNMARKING-SEARCH-P", 0, 0, false);
        declareMacro("with_sbhl_unmarking_search", "WITH-SBHL-UNMARKING-SEARCH");
        declareMacro("without_sbhl_unmarking_search", "WITHOUT-SBHL-UNMARKING-SEARCH");
        declareFunction("get_sbhl_search_module", "GET-SBHL-SEARCH-MODULE", 0, 0, false);
        declareFunction("get_sbhl_search_module_type", "GET-SBHL-SEARCH-MODULE-TYPE", 0, 0, false);
        declareFunction("get_sbhl_search_add_node_test", "GET-SBHL-SEARCH-ADD-NODE-TEST", 0, 0, false);
        declareFunction("get_sbhl_search_add_unmarked_node_test", "GET-SBHL-SEARCH-ADD-UNMARKED-NODE-TEST", 0, 0, false);
        declareFunction("get_sbhl_search_gather_module", "GET-SBHL-SEARCH-GATHER-MODULE", 0, 0, false);
        declareFunction("get_sbhl_disjoins_search_gather_module", "GET-SBHL-DISJOINS-SEARCH-GATHER-MODULE", 0, 0, false);
        declareMacro("with_sbhl_search_module", "WITH-SBHL-SEARCH-MODULE");
        declareFunction("genl_inverse_mode_p", "GENL-INVERSE-MODE-P", 0, 0, false);
        declareFunction("not_genl_inverse_mode_p", "NOT-GENL-INVERSE-MODE-P", 0, 0, false);
        declareMacro("with_new_sbhl_predicate_mode_scope", "WITH-NEW-SBHL-PREDICATE-MODE-SCOPE");
        declareMacro("with_sbhl_predicate_mode", "WITH-SBHL-PREDICATE-MODE");
        declareMacro("with_genl_inverse_mode", "WITH-GENL-INVERSE-MODE");
        declareMacro("sbhl_update_genl_inverse_mode", "SBHL-UPDATE-GENL-INVERSE-MODE");
        declareMacro("possibly_flip_genl_inverse_mode", "POSSIBLY-FLIP-GENL-INVERSE-MODE");
        declareMacro("possibly_premark_with_genl_inverse_mode", "POSSIBLY-PREMARK-WITH-GENL-INVERSE-MODE");
        declareMacro("flip_genl_inverse_mode", "FLIP-GENL-INVERSE-MODE");
        declareFunction("sbhl_module_flips_inverse_mode_p", "SBHL-MODULE-FLIPS-INVERSE-MODE-P", 0, 1, false);
        declareFunction("flip_genl_inverse_modeP", "FLIP-GENL-INVERSE-MODE?", 0, 2, false);
        declareMacro("with_initialized_unmarking_sbhl_marking_module", "WITH-INITIALIZED-UNMARKING-SBHL-MARKING-MODULE");
        declareFunction("sbhl_forward_search_direction_p", "SBHL-FORWARD-SEARCH-DIRECTION-P", 1, 0, false);
        declareFunction("get_sbhl_forward_search_direction", "GET-SBHL-FORWARD-SEARCH-DIRECTION", 0, 0, false);
        declareFunction("sbhl_backward_search_direction_p", "SBHL-BACKWARD-SEARCH-DIRECTION-P", 1, 0, false);
        declareFunction("get_sbhl_backward_search_direction", "GET-SBHL-BACKWARD-SEARCH-DIRECTION", 0, 0, false);
        declareFunction("get_sbhl_search_direction", "GET-SBHL-SEARCH-DIRECTION", 0, 0, false);
        declareMacro("with_sbhl_search_direction", "WITH-SBHL-SEARCH-DIRECTION");
        declareMacro("with_sbhl_forward_search_direction", "WITH-SBHL-FORWARD-SEARCH-DIRECTION");
        declareMacro("with_sbhl_backward_search_direction", "WITH-SBHL-BACKWARD-SEARCH-DIRECTION");
        declareFunction("sbhl_forward_search_p", "SBHL-FORWARD-SEARCH-P", 0, 0, false);
        declareFunction("sbhl_backward_search_p", "SBHL-BACKWARD-SEARCH-P", 0, 0, false);
        declareFunction("get_sbhl_search_index_arg", "GET-SBHL-SEARCH-INDEX-ARG", 0, 0, false);
        declareFunction("get_sbhl_search_gather_arg", "GET-SBHL-SEARCH-GATHER-ARG", 0, 0, false);
        declareMacro("bind_sbhl_search_index_arg", "BIND-SBHL-SEARCH-INDEX-ARG");
        declareFunction("get_sbhl_map_function", "GET-SBHL-MAP-FUNCTION", 0, 0, false);
        declareMacro("with_sbhl_map_function", "WITH-SBHL-MAP-FUNCTION");
        declareFunction("get_sbhl_unwind_function", "GET-SBHL-UNWIND-FUNCTION", 0, 0, false);
        declareMacro("with_sbhl_unwind_function", "WITH-SBHL-UNWIND-FUNCTION");
        declareFunction("sbhl_apply_unwind_function_p", "SBHL-APPLY-UNWIND-FUNCTION-P", 0, 0, false);
        declareFunction("sbhl_toggle_unwind_function_on", "SBHL-TOGGLE-UNWIND-FUNCTION-ON", 0, 0, false);
        declareFunction("sbhl_toggle_unwind_function_off", "SBHL-TOGGLE-UNWIND-FUNCTION-OFF", 0, 0, false);
        declareMacro("with_sbhl_unwind_function_on", "WITH-SBHL-UNWIND-FUNCTION-ON");
        declareMacro("with_sbhl_unwind_function_off", "WITH-SBHL-UNWIND-FUNCTION-OFF");
        declareFunction("get_sbhl_search_parent_marking", "GET-SBHL-SEARCH-PARENT-MARKING", 0, 0, false);
        declareFunction("set_sbhl_search_parent_marking", "SET-SBHL-SEARCH-PARENT-MARKING", 1, 0, false);
        declareMacro("reset_sbhl_search_parent_marking", "RESET-SBHL-SEARCH-PARENT-MARKING");
        declareMacro("dynamically_rebind_sbhl_search_parent_marking", "DYNAMICALLY-REBIND-SBHL-SEARCH-PARENT-MARKING");
        declareMacro("with_new_sbhl_previous_marking", "WITH-NEW-SBHL-PREVIOUS-MARKING");
        declareFunction("get_sbhl_nodes_previous_marking", "GET-SBHL-NODES-PREVIOUS-MARKING", 0, 0, false);
        declareMacro("with_new_sbhl_finished", "WITH-NEW-SBHL-FINISHED");
        declareFunction("sbhl_finished_with_goal", "SBHL-FINISHED-WITH-GOAL", 0, 0, false);
        declareFunction("sbhl_finished_with_cutoff", "SBHL-FINISHED-WITH-CUTOFF", 0, 0, false);
        declareFunction("sbhl_stop_search_path_p", "SBHL-STOP-SEARCH-PATH-P", 0, 0, false);
        declareFunction("sbhl_stop_search_path", "SBHL-STOP-SEARCH-PATH", 0, 0, false);
        declareFunction("sbhl_continue_search_path", "SBHL-CONTINUE-SEARCH-PATH", 0, 0, false);
        declareMacro("with_new_sbhl_stop_search_path", "WITH-NEW-SBHL-STOP-SEARCH-PATH");
        declareFunction("sbhl_target_node_p", "SBHL-TARGET-NODE-P", 1, 0, false);
        declareMacro("with_sbhl_target_node", "WITH-SBHL-TARGET-NODE");
        declareFunction("sbhl_goal_node_p", "SBHL-GOAL-NODE-P", 1, 0, false);
        declareMacro("with_sbhl_goal_node", "WITH-SBHL-GOAL-NODE");
        declareFunction("get_sbhl_goal_node", "GET-SBHL-GOAL-NODE", 0, 0, false);
        declareFunction("sbhl_node_isa_goal_node_p", "SBHL-NODE-ISA-GOAL-NODE-P", 1, 0, false);
        declareFunction("get_sbhl_goal_nodes", "GET-SBHL-GOAL-NODES", 0, 0, false);
        declareMacro("with_sbhl_goal_nodes", "WITH-SBHL-GOAL-NODES");
        declareMacro("with_sbhl_isaP_goal", "WITH-SBHL-ISA?-GOAL");
        declareFunction("get_sbhl_isaP_goal", "GET-SBHL-ISA?-GOAL", 0, 0, false);
        declareMacro("with_sbhl_result", "WITH-SBHL-RESULT");
        declareMacro("with_sbhl_just_result", "WITH-SBHL-JUST-RESULT");
        declareFunction("get_sbhl_consider_node_fn", "GET-SBHL-CONSIDER-NODE-FN", 0, 0, false);
        declareMacro("with_sbhl_consider_node_fn", "WITH-SBHL-CONSIDER-NODE-FN");
        declareFunction("get_sbhl_compose_fn", "GET-SBHL-COMPOSE-FN", 0, 0, false);
        declareMacro("with_sbhl_compose_fn", "WITH-SBHL-COMPOSE-FN");
        declareFunction("get_sbhl_combine_fn", "GET-SBHL-COMBINE-FN", 0, 0, false);
        declareMacro("with_sbhl_combine_fn", "WITH-SBHL-COMBINE-FN");
        declareFunction("get_sbhl_map_test_fn", "GET-SBHL-MAP-TEST-FN", 0, 0, false);
        declareMacro("with_sbhl_map_test_fn", "WITH-SBHL-MAP-TEST-FN");
        declareMacro("reset_sbhl_accessed_gather_nodes", "RESET-SBHL-ACCESSED-GATHER-NODES");
        declareMacro("with_sbhl_dependents_cut_node", "WITH-SBHL-DEPENDENTS-CUT-NODE");
        declareFunction("sbhl_dependents_cut_node_p", "SBHL-DEPENDENTS-CUT-NODE-P", 1, 0, false);
        declareMacro("with_sbhl_access_arg", "WITH-SBHL-ACCESS-ARG");
        declareMacro("with_sbhl_referent", "WITH-SBHL-REFERENT");
        declareMacro("with_new_sbhl_leaf_queue", "WITH-NEW-SBHL-LEAF-QUEUE");
        declareMacro("with_sbhl_sample_leaf_queues", "WITH-SBHL-SAMPLE-LEAF-QUEUES");
        declareFunction("sbhl_leaf_sample_search_p", "SBHL-LEAF-SAMPLE-SEARCH-P", 0, 0, false);
        declareMacro("do_sbhl_sample_leaf_queues", "DO-SBHL-SAMPLE-LEAF-QUEUES");
        declareFunction("sbhl_extremal_test_fn_p", "SBHL-EXTREMAL-TEST-FN-P", 1, 0, false);
        declareMacro("with_sbhl_extremal_test_fn", "WITH-SBHL-EXTREMAL-TEST-FN");
        declareFunction("sbhl_check_for_goal_marking_p", "SBHL-CHECK-FOR-GOAL-MARKING-P", 0, 0, false);
        declareMacro("with_sbhl_search_termination_on_previous_successes", "WITH-SBHL-SEARCH-TERMINATION-ON-PREVIOUS-SUCCESSES");
        declareMacro("with_sbhl_precomputed_goal_space", "WITH-SBHL-PRECOMPUTED-GOAL-SPACE");
        declareMacro("with_sbhl_true_search", "WITH-SBHL-TRUE-SEARCH");
        declareMacro("with_sbhl_false_search", "WITH-SBHL-FALSE-SEARCH");
        declareFunction("sbhl_true_search_p", "SBHL-TRUE-SEARCH-P", 0, 0, false);
        declareFunction("sbhl_false_search_p", "SBHL-FALSE-SEARCH-P", 0, 0, false);
        declareFunction("sbhl_search_truth_value_p", "SBHL-SEARCH-TRUTH-VALUE-P", 1, 0, false);
        declareFunction("get_sbhl_true_tv", "GET-SBHL-TRUE-TV", 0, 0, false);
        declareFunction("get_sbhl_false_tv", "GET-SBHL-FALSE-TV", 0, 0, false);
        declareFunction("get_sbhl_tv", "GET-SBHL-TV", 0, 0, false);
        declareFunction("relevant_sbhl_tv_is_everything", "RELEVANT-SBHL-TV-IS-EVERYTHING", 1, 0, false);
        declareFunction("sbhl_tv_generalizes_to_general_tvP", "SBHL-TV-GENERALIZES-TO-GENERAL-TV?", 2, 0, false);
        declareFunction("relevant_sbhl_tv_is_general_tv", "RELEVANT-SBHL-TV-IS-GENERAL-TV", 1, 0, false);
        new sbhl_search_vars.$relevant_sbhl_tv_is_general_tv$UnaryFunction();
        declareFunction("relevant_sbhl_tvP", "RELEVANT-SBHL-TV?", 1, 0, false);
        declareFunction("sbhl_true_tv_p", "SBHL-TRUE-TV-P", 1, 0, false);
        declareFunction("sbhl_false_tv_p", "SBHL-FALSE-TV-P", 1, 0, false);
        declareFunction("sbhl_opposite_or_nil_tv", "SBHL-OPPOSITE-OR-NIL-TV", 1, 0, false);
        declareFunction("sbhl_opposite_tv", "SBHL-OPPOSITE-TV", 1, 0, false);
        declareFunction("sbhl_true_tv", "SBHL-TRUE-TV", 1, 0, false);
        declareFunction("sbhl_false_tv", "SBHL-FALSE-TV", 1, 0, false);
        declareFunction("sbhl_search_true_tv", "SBHL-SEARCH-TRUE-TV", 0, 0, false);
        declareFunction("sbhl_search_false_tv", "SBHL-SEARCH-FALSE-TV", 0, 0, false);
        declareFunction("sbhl_translate_to_old_tv", "SBHL-TRANSLATE-TO-OLD-TV", 1, 0, false);
        declareFunction("sbhl_possibly_translate_tv", "SBHL-POSSIBLY-TRANSLATE-TV", 1, 0, false);
        declareFunction("sbhl_truth_to_support_truth", "SBHL-TRUTH-TO-SUPPORT-TRUTH", 1, 0, false);
        declareFunction("support_truth_to_sbhl_truth", "SUPPORT-TRUTH-TO-SBHL-TRUTH", 1, 0, false);
        declareMacro("with_sbhl_tv_function", "WITH-SBHL-TV-FUNCTION");
        declareMacro("with_sbhl_tv", "WITH-SBHL-TV");
        declareMacro("with_all_sbhl_tvs", "WITH-ALL-SBHL-TVS");
        declareMacro("with_general_sbhl_tv", "WITH-GENERAL-SBHL-TV");
        declareMacro("with_just_sbhl_tv", "WITH-JUST-SBHL-TV");
        declareMacro("possibly_with_sbhl_tv", "POSSIBLY-WITH-SBHL-TV");
        declareMacro("possibly_with_sbhl_true_tv", "POSSIBLY-WITH-SBHL-TRUE-TV");
        declareMacro("possibly_with_sbhl_false_tv", "POSSIBLY-WITH-SBHL-FALSE-TV");
        declareMacro("possibly_with_sbhl_mt_relevance", "POSSIBLY-WITH-SBHL-MT-RELEVANCE");
        return NIL;
    }

    public static final SubLObject init_sbhl_search_vars_file_alt() {
        defparameter("*SBHL-SEARCH-TYPES*", $list_alt22);
        defparameter("*SBHL-SEARCH-TYPE*", NIL);
        defparameter("*SBHL-JUSTIFICATION-SEARCH-P*", NIL);
        defparameter("*SBHL-SEARCH-BEHAVIOR*", NIL);
        defparameter("*SBHL-JUSTIFICATION-BEHAVIOR*", $OLD);
        defparameter("*SBHL-JUSTIFICATION-DEFAULTED-OLD*", NIL);
        defparameter("*SBHL-JUSTIFICATION-ASSEMBLED-P*", NIL);
        defparameter("*SBHL-UNMARKING-SEARCH-P*", NIL);
        defparameter("*SBHL-SEARCH-MODULE*", NIL);
        defparameter("*SBHL-SEARCH-MODULE-TYPE*", NIL);
        defparameter("*SBHL-ADD-NODE-TO-RESULT-TEST*", NIL);
        defparameter("*SBHL-ADD-UNMARKED-NODE-TO-RESULT-TEST*", NIL);
        defparameter("*GENL-INVERSE-MODE-P*", NIL);
        deflexical("*SBHL-FORWARD-SEARCH-DIRECTION*", $FORWARD);
        deflexical("*SBHL-BACKWARD-SEARCH-DIRECTION*", $BACKWARD);
        defparameter("*SBHL-SEARCH-DIRECTION*", NIL);
        defparameter("*SBHL-INDEX-ARG*", NIL);
        defparameter("*SBHL-SEARCH-INDEX-ARG*", NIL);
        defparameter("*SBHL-MAP-FUNCTION*", NIL);
        defparameter("*SBHL-UNWIND-FUNCTION*", NIL);
        defparameter("*SBHL-APPLY-UNWIND-FUNCTION-P*", NIL);
        defparameter("*SBHL-SEARCH-PARENT-MARKING*", NIL);
        defparameter("*SBHL-NODES-PREVIOUS-MARKING*", NIL);
        defparameter("*SBHL-FINISHED?*", NIL);
        defparameter("*SBHL-STOP-SEARCH-PATH?*", NIL);
        defparameter("*SBHL-TARGET-NODE*", NIL);
        defparameter("*SBHL-GOAL-NODE*", NIL);
        defparameter("*SBHL-GOAL-NODES*", NIL);
        defparameter("*SBHL-ISA?-GOAL*", NIL);
        defparameter("*SBHL-RESULT*", NIL);
        defparameter("*SBHL-JUSTIFICATION-RESULT*", NIL);
        defparameter("*SBHL-CONSIDER-NODE-FN*", NIL);
        defparameter("*SBHL-COMPOSE-FN*", NIL);
        defparameter("*SBHL-COMBINE-FN*", NCONC);
        defparameter("*SBHL-MAP-TEST-FN*", NIL);
        defparameter("*SBHL-ACCESSED-GATHER-NODES*", NIL);
        defparameter("*SBHL-DEPENDENTS-CUT-NODE*", NIL);
        defparameter("*SBHL-ACCESS-ARG*", NIL);
        defparameter("*SBHL-REFERENT*", NIL);
        defparameter("*SBHL-CURRENT-LEAF-QUEUE*", NIL);
        defparameter("*SBHL-SAMPLE-LEAF-QUEUES*", NIL);
        defparameter("*SBHL-EXTREMAL-TEST-FN*", NIL);
        defparameter("*SBHL-CHECK-FOR-GOAL-MARKING-P*", NIL);
        defparameter("*SBHL-PRECOMPUTED-GOAL-SPACE*", NIL);
        defparameter("*INFER-NAT-SBHL?*", T);
        defparameter("*SBHL-MAPPING-PRED*", NIL);
        defparameter("*MAXIMIZE-SBHL-RESULT?*", NIL);
        defparameter("*MINIMIZE-SBHL-RESULT?*", T);
        defparameter("*SBHL-SEARCH-TRUTH*", NIL);
        deflexical("*SBHL-SEARCH-TRUTH-VALUES*", $list_alt144);
        deflexical("*SBHL-TRUE-TV*", $$True_JustificationTruth);
        deflexical("*SBHL-FALSE-TV*", $$False_JustificationTruth);
        defparameter("*SBHL-TV*", $$True_JustificationTruth);
        defparameter("*RELEVANT-SBHL-TV-FUNCTION*", NIL);
        return NIL;
    }

    public static SubLObject init_sbhl_search_vars_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*SBHL-SEARCH-TYPES*", $list22);
            defparameter("*SBHL-SEARCH-TYPE*", NIL);
            defparameter("*SBHL-JUSTIFICATION-SEARCH-P*", NIL);
            defparameter("*SBHL-SEARCH-BEHAVIOR*", NIL);
            defparameter("*SBHL-JUSTIFICATION-BEHAVIOR*", $OLD);
            defparameter("*SBHL-JUSTIFICATION-DEFAULTED-OLD*", NIL);
            defparameter("*SBHL-JUSTIFICATION-ASSEMBLED-P*", NIL);
            defparameter("*SBHL-UNMARKING-SEARCH-P*", NIL);
            defparameter("*SBHL-SEARCH-MODULE*", NIL);
            defparameter("*SBHL-SEARCH-MODULE-TYPE*", NIL);
            defparameter("*SBHL-ADD-NODE-TO-RESULT-TEST*", NIL);
            defparameter("*SBHL-ADD-UNMARKED-NODE-TO-RESULT-TEST*", NIL);
            defparameter("*GENL-INVERSE-MODE-P*", NIL);
            deflexical("*SBHL-FORWARD-SEARCH-DIRECTION*", $FORWARD);
            deflexical("*SBHL-BACKWARD-SEARCH-DIRECTION*", $BACKWARD);
            defparameter("*SBHL-SEARCH-DIRECTION*", NIL);
            defparameter("*SBHL-INDEX-ARG*", NIL);
            defparameter("*SBHL-SEARCH-INDEX-ARG*", NIL);
            defparameter("*SBHL-MAP-FUNCTION*", NIL);
            defparameter("*SBHL-UNWIND-FUNCTION*", NIL);
            defparameter("*SBHL-APPLY-UNWIND-FUNCTION-P*", NIL);
            defparameter("*SBHL-SEARCH-PARENT-MARKING*", NIL);
            defparameter("*SBHL-NODES-PREVIOUS-MARKING*", NIL);
            defparameter("*SBHL-FINISHED?*", NIL);
            defparameter("*SBHL-STOP-SEARCH-PATH?*", NIL);
            defparameter("*SBHL-TARGET-NODE*", NIL);
            defparameter("*SBHL-GOAL-NODE*", NIL);
            defparameter("*SBHL-GOAL-NODES*", NIL);
            defparameter("*SBHL-ISA?-GOAL*", NIL);
            defparameter("*SBHL-RESULT*", NIL);
            defparameter("*SBHL-JUSTIFICATION-RESULT*", NIL);
            defparameter("*SBHL-CONSIDER-NODE-FN*", NIL);
            defparameter("*SBHL-COMPOSE-FN*", NIL);
            defparameter("*SBHL-COMBINE-FN*", NCONC);
            defparameter("*SBHL-MAP-TEST-FN*", NIL);
            defparameter("*SBHL-ACCESSED-GATHER-NODES*", NIL);
            defparameter("*SBHL-DEPENDENTS-CUT-NODE*", NIL);
            defparameter("*SBHL-ACCESS-ARG*", NIL);
            defparameter("*SBHL-REFERENT*", NIL);
            defparameter("*SBHL-CURRENT-LEAF-QUEUE*", NIL);
            defparameter("*SBHL-SAMPLE-LEAF-QUEUES*", NIL);
            defparameter("*SBHL-EXTREMAL-TEST-FN*", NIL);
            defparameter("*SBHL-CHECK-FOR-GOAL-MARKING-P*", NIL);
            defparameter("*SBHL-PRECOMPUTED-GOAL-SPACE*", NIL);
            defparameter("*INFER-NAT-SBHL?*", T);
            defparameter("*SBHL-MAPPING-PRED*", NIL);
            defparameter("*MAXIMIZE-SBHL-RESULT?*", NIL);
            defparameter("*MINIMIZE-SBHL-RESULT?*", T);
            defparameter("*SBHL-SEARCH-TRUTH*", NIL);
            deflexical("*SBHL-SEARCH-TRUTH-VALUES*", $list142);
            deflexical("*SBHL-TRUE-TV*", $$True_JustificationTruth);
            deflexical("*SBHL-FALSE-TV*", $$False_JustificationTruth);
            defparameter("*SBHL-TV*", $$True_JustificationTruth);
            defparameter("*RELEVANT-SBHL-TV-FUNCTION*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*SBHL-SEARCH-TRUTH-VALUES*", $list_alt144);
        }
        return NIL;
    }

    public static SubLObject init_sbhl_search_vars_file_Previous() {
        defparameter("*SBHL-SEARCH-TYPES*", $list22);
        defparameter("*SBHL-SEARCH-TYPE*", NIL);
        defparameter("*SBHL-JUSTIFICATION-SEARCH-P*", NIL);
        defparameter("*SBHL-SEARCH-BEHAVIOR*", NIL);
        defparameter("*SBHL-JUSTIFICATION-BEHAVIOR*", $OLD);
        defparameter("*SBHL-JUSTIFICATION-DEFAULTED-OLD*", NIL);
        defparameter("*SBHL-JUSTIFICATION-ASSEMBLED-P*", NIL);
        defparameter("*SBHL-UNMARKING-SEARCH-P*", NIL);
        defparameter("*SBHL-SEARCH-MODULE*", NIL);
        defparameter("*SBHL-SEARCH-MODULE-TYPE*", NIL);
        defparameter("*SBHL-ADD-NODE-TO-RESULT-TEST*", NIL);
        defparameter("*SBHL-ADD-UNMARKED-NODE-TO-RESULT-TEST*", NIL);
        defparameter("*GENL-INVERSE-MODE-P*", NIL);
        deflexical("*SBHL-FORWARD-SEARCH-DIRECTION*", $FORWARD);
        deflexical("*SBHL-BACKWARD-SEARCH-DIRECTION*", $BACKWARD);
        defparameter("*SBHL-SEARCH-DIRECTION*", NIL);
        defparameter("*SBHL-INDEX-ARG*", NIL);
        defparameter("*SBHL-SEARCH-INDEX-ARG*", NIL);
        defparameter("*SBHL-MAP-FUNCTION*", NIL);
        defparameter("*SBHL-UNWIND-FUNCTION*", NIL);
        defparameter("*SBHL-APPLY-UNWIND-FUNCTION-P*", NIL);
        defparameter("*SBHL-SEARCH-PARENT-MARKING*", NIL);
        defparameter("*SBHL-NODES-PREVIOUS-MARKING*", NIL);
        defparameter("*SBHL-FINISHED?*", NIL);
        defparameter("*SBHL-STOP-SEARCH-PATH?*", NIL);
        defparameter("*SBHL-TARGET-NODE*", NIL);
        defparameter("*SBHL-GOAL-NODE*", NIL);
        defparameter("*SBHL-GOAL-NODES*", NIL);
        defparameter("*SBHL-ISA?-GOAL*", NIL);
        defparameter("*SBHL-RESULT*", NIL);
        defparameter("*SBHL-JUSTIFICATION-RESULT*", NIL);
        defparameter("*SBHL-CONSIDER-NODE-FN*", NIL);
        defparameter("*SBHL-COMPOSE-FN*", NIL);
        defparameter("*SBHL-COMBINE-FN*", NCONC);
        defparameter("*SBHL-MAP-TEST-FN*", NIL);
        defparameter("*SBHL-ACCESSED-GATHER-NODES*", NIL);
        defparameter("*SBHL-DEPENDENTS-CUT-NODE*", NIL);
        defparameter("*SBHL-ACCESS-ARG*", NIL);
        defparameter("*SBHL-REFERENT*", NIL);
        defparameter("*SBHL-CURRENT-LEAF-QUEUE*", NIL);
        defparameter("*SBHL-SAMPLE-LEAF-QUEUES*", NIL);
        defparameter("*SBHL-EXTREMAL-TEST-FN*", NIL);
        defparameter("*SBHL-CHECK-FOR-GOAL-MARKING-P*", NIL);
        defparameter("*SBHL-PRECOMPUTED-GOAL-SPACE*", NIL);
        defparameter("*INFER-NAT-SBHL?*", T);
        defparameter("*SBHL-MAPPING-PRED*", NIL);
        defparameter("*MAXIMIZE-SBHL-RESULT?*", NIL);
        defparameter("*MINIMIZE-SBHL-RESULT?*", T);
        defparameter("*SBHL-SEARCH-TRUTH*", NIL);
        deflexical("*SBHL-SEARCH-TRUTH-VALUES*", $list142);
        deflexical("*SBHL-TRUE-TV*", $$True_JustificationTruth);
        deflexical("*SBHL-FALSE-TV*", $$False_JustificationTruth);
        defparameter("*SBHL-TV*", $$True_JustificationTruth);
        defparameter("*RELEVANT-SBHL-TV-FUNCTION*", NIL);
        return NIL;
    }

    public static SubLObject setup_sbhl_search_vars_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sbhl_search_vars_file();
    }

    @Override
    public void initializeVariables() {
        init_sbhl_search_vars_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sbhl_search_vars_file();
    }

    static {
    }

    public static final class $relevant_sbhl_tv_is_general_tv$UnaryFunction extends UnaryFunction {
        public $relevant_sbhl_tv_is_general_tv$UnaryFunction() {
            super(extractFunctionNamed("RELEVANT-SBHL-TV-IS-GENERAL-TV"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return relevant_sbhl_tv_is_general_tv(arg1);
        }
    }

    static private final SubLList $list_alt13 = list(makeSymbol("MT"), makeSymbol("TV"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt22 = list(makeKeyword("CLOSURE"), makeKeyword("BOOLEAN"), makeKeyword("WHAT-MTS"));

    static private final SubLList $list_alt23 = list(makeSymbol("TYPE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt30 = list(list(makeSymbol("*SBHL-JUSTIFICATION-SEARCH-P*"), T), list(makeSymbol("*SBHL-APPLY-UNWIND-FUNCTION-P*"), NIL), list(makeSymbol("*SBHL-UNWIND-FUNCTION*"), list(makeSymbol("FIF"), list(makeSymbol("SBHL-TIME-SEARCH-P")), list(QUOTE, makeSymbol("SBHL-TEMPORAL-JUSTIFICATION-UNWIND")), list(QUOTE, makeSymbol("SBHL-PUSH-UNWIND-ONTO-RESULT")))));

    private static final SubLSymbol WITHOUT_SBHL_CACHES = makeSymbol("WITHOUT-SBHL-CACHES");

    static private final SubLList $list_alt32 = list(list(makeSymbol("*SBHL-JUSTIFICATION-SEARCH-P*"), NIL), list(makeSymbol("*SBHL-APPLY-UNWIND-FUNCTION-P*"), NIL));

    private static final SubLSymbol WITH_SBHL_CACHES = makeSymbol("WITH-SBHL-CACHES");

    static private final SubLList $list_alt34 = list(makeSymbol("BEHAVIOR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt41 = list(list(makeSymbol("*SBHL-JUSTIFICATION-BEHAVIOR*"), makeKeyword("ASSERTION")));

    static private final SubLList $list_alt42 = list(list(makeSymbol("*SBHL-JUSTIFICATION-BEHAVIOR*"), makeKeyword("VERBOSE")));

    static private final SubLList $list_alt43 = list(list(makeSymbol("*SBHL-JUSTIFICATION-BEHAVIOR*"), makeKeyword("OLD")));

    static private final SubLList $list_alt44 = list(list(makeSymbol("*SBHL-JUSTIFICATION-DEFAULTED-OLD*"), NIL));

    static private final SubLList $list_alt45 = list(list(makeSymbol("*SBHL-JUSTIFICATION-ASSEMBLED-P*"), NIL));

    static private final SubLList $list_alt46 = list(list(makeSymbol("*SBHL-UNMARKING-SEARCH-P*"), T));

    static private final SubLList $list_alt47 = list(list(makeSymbol("*SBHL-UNMARKING-SEARCH-P*"), NIL));

    static private final SubLString $str_alt48$get_sbhl_search_module___sbhl_sea = makeString("get-sbhl-search-module: *sbhl-search-module* is unexpectedly null.");

    static private final SubLList $list_alt53 = list(makeSymbol("MODULE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt60 = list(list(makeSymbol("*GENL-INVERSE-MODE-P*"), NIL));

    static private final SubLList $list_alt61 = list(makeSymbol("MODE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt63 = list(list(makeSymbol("*GENL-INVERSE-MODE-P*"), T));

    static private final SubLList $list_alt64 = list(list(makeSymbol("*GENL-INVERSE-MODE-P*"), list(makeSymbol("FIF"), list(makeSymbol("SBHL-MODULE-FLIPS-INVERSE-MODE-P")), list(makeSymbol("CNOT"), makeSymbol("*GENL-INVERSE-MODE-P*")), makeSymbol("*GENL-INVERSE-MODE-P*"))));

    static private final SubLList $list_alt65 = list(list(makeSymbol("*GENL-INVERSE-MODE-P*"), list(makeSymbol("FIF"), list(makeSymbol("FLIP-GENL-INVERSE-MODE?")), list(makeSymbol("CNOT"), makeSymbol("*GENL-INVERSE-MODE-P*")), makeSymbol("*GENL-INVERSE-MODE-P*"))));

    static private final SubLList $list_alt66 = list(list(makeSymbol("*GENL-INVERSE-MODE-P*"), list(makeSymbol("FIF"), list(EQ, list(makeSymbol("GET-SBHL-LINK-PRED"), list(makeSymbol("GET-SBHL-SEARCH-MODULE"))), reader_make_constant_shell("negationInverse")), T, makeSymbol("*GENL-INVERSE-MODE-P*"))));

    static private final SubLList $list_alt67 = list(list(makeSymbol("*GENL-INVERSE-MODE-P*"), list(makeSymbol("CNOT"), makeSymbol("*GENL-INVERSE-MODE-P*"))));

    static private final SubLList $list_alt68 = list(makeSymbol("START-MARKING"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym69$PRED = makeUninternedSymbol("PRED");

    static private final SubLList $list_alt70 = list(makeSymbol("SBHL-MODULE-INDICATES-PREDICATE-SEARCH-P"), list(makeSymbol("GET-SBHL-SEARCH-MODULE")));

    static private final SubLList $list_alt74 = list(reader_make_constant_shell("genlInverse"));

    static private final SubLList $list_alt77 = list(makeSymbol("DIRECTION"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt80 = list(makeSymbol("GET-SBHL-FORWARD-SEARCH-DIRECTION"));

    static private final SubLList $list_alt81 = list(makeSymbol("GET-SBHL-BACKWARD-SEARCH-DIRECTION"));

    static private final SubLList $list_alt82 = list(list(makeSymbol("*SBHL-SEARCH-INDEX-ARG*"), list(makeSymbol("FIF"), list(EQ, makeSymbol("*SBHL-SEARCH-DIRECTION*"), makeKeyword("FORWARD")), list(makeSymbol("GET-SBHL-INDEX-ARG"), list(makeSymbol("GET-SBHL-MODULE"))), list(makeSymbol("GET-SBHL-GATHER-ARG"), list(makeSymbol("GET-SBHL-MODULE"))))));

    static private final SubLList $list_alt83 = list(makeSymbol("FUNCTION"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt86 = list(list(makeSymbol("*SBHL-APPLY-UNWIND-FUNCTION-P*"), T));

    static private final SubLList $list_alt87 = list(list(makeSymbol("*SBHL-APPLY-UNWIND-FUNCTION-P*"), NIL));

    static private final SubLList $list_alt88 = list(list(makeSymbol("*SBHL-SEARCH-PARENT-MARKING*"), NIL));

    static private final SubLList $list_alt89 = list(list(makeSymbol("*SBHL-SEARCH-PARENT-MARKING*"), makeSymbol("*SBHL-SEARCH-PARENT-MARKING*")));

    static private final SubLList $list_alt90 = list(list(makeSymbol("*SBHL-NODES-PREVIOUS-MARKING*"), NIL));

    static private final SubLList $list_alt91 = list(list(makeSymbol("*SBHL-FINISHED?*"), NIL));

    static private final SubLList $list_alt94 = list(list(makeSymbol("*SBHL-STOP-SEARCH-PATH?*"), NIL));

    static private final SubLList $list_alt95 = list(makeSymbol("NODE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt98 = list(makeSymbol("NODES"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym99$_SBHL_ISA__GOAL_ = makeSymbol("*SBHL-ISA?-GOAL*");

    static private final SubLList $list_alt100 = list(makeSymbol("RESULT-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt101 = list(makeSymbol("*SBHL-RESULT*"));

    static private final SubLList $list_alt104 = list(makeSymbol("*SBHL-JUSTIFICATION-RESULT*"));

    static private final SubLList $list_alt105 = list(makeSymbol("FN"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt111 = list(list(makeSymbol("*SBHL-ACCESSED-GATHER-NODES*"), NIL));

    static private final SubLList $list_alt113 = list(makeSymbol("ARG"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt115 = list(makeSymbol("REF"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt117 = list(list(makeSymbol("*SBHL-CURRENT-LEAF-QUEUE*"), list(makeSymbol("CREATE-QUEUE"))));

    static private final SubLSymbol $sym118$QUEUE = makeUninternedSymbol("QUEUE");

    static private final SubLList $list_alt120 = list(list(makeSymbol("CREATE-QUEUE")));

    static private final SubLList $list_alt123 = list(list(makeSymbol("NODE-VAR"), makeSymbol("FOUND-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym124$QUEUE = makeUninternedSymbol("QUEUE");

    static private final SubLList $list_alt128 = list(list(makeSymbol("FIRST"), makeSymbol("*SBHL-SAMPLE-LEAF-QUEUES*")));

    static private final SubLList $list_alt133 = list(makeSymbol("LAST"), makeSymbol("*SBHL-SAMPLE-LEAF-QUEUES*"));

    static private final SubLList $list_alt134 = list(makeSymbol("*SBHL-CURRENT-LEAF-QUEUE*"));

    static private final SubLList $list_alt135 = list(list(makeSymbol("CSETQ"), makeSymbol("*SBHL-SAMPLE-LEAF-QUEUES*"), list(makeSymbol("CDR"), makeSymbol("*SBHL-SAMPLE-LEAF-QUEUES*"))));

    static private final SubLList $list_alt137 = list(list(makeSymbol("CSETQ"), makeSymbol("*SBHL-SAMPLE-LEAF-QUEUES*"), list(makeSymbol("REMOVE-IF"), list(QUOTE, makeSymbol("QUEUE-EMPTY-P")), makeSymbol("*SBHL-SAMPLE-LEAF-QUEUES*"))));

    static private final SubLList $list_alt139 = list(list(makeSymbol("*SBHL-CHECK-FOR-GOAL-MARKING-P*"), T));

    static private final SubLList $list_alt140 = list(makeSymbol("GOAL-SPACE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt142 = list(list(makeSymbol("*SBHL-SEARCH-TRUTH*"), reader_make_constant_shell("True-JustificationTruth")));

    static private final SubLList $list_alt143 = list(list(makeSymbol("*SBHL-SEARCH-TRUTH*"), reader_make_constant_shell("False-JustificationTruth")));

    static private final SubLList $list_alt144 = list(reader_make_constant_shell("MonotonicallyTrue"), reader_make_constant_shell("DefaultTrue"), reader_make_constant_shell("MonotonicallyFalse"), reader_make_constant_shell("DefaultFalse"), reader_make_constant_shell("True-JustificationTruth"), reader_make_constant_shell("False-JustificationTruth"), reader_make_constant_shell("ArbitraryTruth-JustificationTruth"));

    static private final SubLString $str_alt156$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt161$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt162$Expected_true_or_false_sbhl_truth = makeString("Expected true or false sbhl truth value. tv: ~a~%");

    static private final SubLString $str_alt165$unknown_truth_value_for_translati = makeString("unknown truth value for translation: ~a");

    static private final SubLString $str_alt170$Cannot_translate__s_truth_to_an_s = makeString("Cannot translate ~s truth to an sbhl-tv");

    static private final SubLList $list_alt172 = list(makeSymbol("SBHL-TV"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt175 = list(makeSymbol("FUNCTION"), makeSymbol("RELEVANT-SBHL-TV-IS-EVERYTHING"));

    static private final SubLList $list_alt176 = list(makeSymbol("FUNCTION"), makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV"));

    static private final SubLList $list_alt178 = list(makeSymbol("FUNCTION"), makeSymbol("RELEVANT-SBHL-TV-IS-EQ"));

    static private final SubLList $list_alt179 = list(makeSymbol("TV"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym180$TV_VAR = makeUninternedSymbol("TV-VAR");

    static private final SubLList $list_alt182 = list(makeSymbol("*SBHL-TV*"));

    static private final SubLList $list_alt183 = list(list(QUOTE, makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV")), makeSymbol("*RELEVANT-SBHL-TV-FUNCTION*"));

    static private final SubLList $list_alt186 = list(makeSymbol("SBHL-SEARCH-TRUTH-VALUE-P"));

    static private final SubLSymbol $sym187$TV_VAR = makeUninternedSymbol("TV-VAR");

    static private final SubLList $list_alt188 = list(list(makeSymbol("GET-SBHL-TRUE-TV")));

    static private final SubLList $list_alt189 = list(makeSymbol("SBHL-TRUE-TV-P"));

    static private final SubLSymbol $sym190$TV_VAR = makeUninternedSymbol("TV-VAR");

    static private final SubLList $list_alt191 = list(list(makeSymbol("GET-SBHL-FALSE-TV")));

    static private final SubLList $list_alt192 = list(makeSymbol("SBHL-FALSE-TV-P"));

    static private final SubLList $list_alt193 = list(makeSymbol("MT"), makeSymbol("&BODY"), makeSymbol("BODY"));
}

/**
 * Total time: 464 ms
 */
