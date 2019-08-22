package com.cyc.cycjava.cycl.sbhl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.*;

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


public final class sbhl_search_vars extends SubLTranslatedFile {
    public static final SubLFile me = new sbhl_search_vars();

    public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_search_vars";

    public static final String myFingerPrint = "3e3d0bd796b68857a668baedc2788bfeda196d4045fc64973ce1a17ab28f8a74";

    // defparameter
    // Different types of search, leading to different behaviors.
    public static final SubLSymbol $sbhl_search_types$ = makeSymbol("*SBHL-SEARCH-TYPES*");



    // defparameter
    /**
     * Does the current boolean search show the path that allowed success to be
     * concluded
     */
    public static final SubLSymbol $sbhl_justification_search_p$ = makeSymbol("*SBHL-JUSTIFICATION-SEARCH-P*");





    // defparameter
    /**
     * parameter used to indicate when justification was coerced and requires old
     * justification behavior
     */
    public static final SubLSymbol $sbhl_justification_defaulted_old$ = makeSymbol("*SBHL-JUSTIFICATION-DEFAULTED-OLD*");

    // defparameter
    // has the justification path already been assembled?
    public static final SubLSymbol $sbhl_justification_assembled_p$ = makeSymbol("*SBHL-JUSTIFICATION-ASSEMBLED-P*");

    // defparameter
    // Is current search an unmarking search
    public static final SubLSymbol $sbhl_unmarking_search_p$ = makeSymbol("*SBHL-UNMARKING-SEARCH-P*");











    // deflexical
    // The keyword specifying forward search
    public static final SubLSymbol $sbhl_forward_search_direction$ = makeSymbol("*SBHL-FORWARD-SEARCH-DIRECTION*");

    // deflexical
    // The keyword specifying backward search
    public static final SubLSymbol $sbhl_backward_search_direction$ = makeSymbol("*SBHL-BACKWARD-SEARCH-DIRECTION*");



    // defparameter
    // Obsolete
    public static final SubLSymbol $sbhl_index_arg$ = makeSymbol("*SBHL-INDEX-ARG*");

    // defparameter
    // The index arg for current search
    public static final SubLSymbol $sbhl_search_index_arg$ = makeSymbol("*SBHL-SEARCH-INDEX-ARG*");





    // defparameter
    // Toggle determining whether to apply *sbhl-unwind-function*
    public static final SubLSymbol $sbhl_apply_unwind_function_p$ = makeSymbol("*SBHL-APPLY-UNWIND-FUNCTION-P*");

    // defparameter
    // The current node's parent marking
    public static final SubLSymbol $sbhl_search_parent_marking$ = makeSymbol("*SBHL-SEARCH-PARENT-MARKING*");

    // defparameter
    // previous marking of node
    public static final SubLSymbol $sbhl_nodes_previous_marking$ = makeSymbol("*SBHL-NODES-PREVIOUS-MARKING*");

    // defparameter
    // Stores whether sbhl search is finished and if so, how.
    public static final SubLSymbol $sbhl_finishedP$ = makeSymbol("*SBHL-FINISHED?*");

    // defparameter
    // stop mark and sweep from going further
    public static final SubLSymbol $sbhl_stop_search_pathP$ = makeSymbol("*SBHL-STOP-SEARCH-PATH?*");





    // defparameter
    // The goal nodes for current search for any goal
    public static final SubLSymbol $sbhl_goal_nodes$ = makeSymbol("*SBHL-GOAL-NODES*");

    // defparameter
    // The goal node for current search
    public static final SubLSymbol $sbhl_isaP_goal$ = makeSymbol("*SBHL-ISA?-GOAL*");

    // defparameter
    // the result in search
    public static final SubLSymbol $sbhl_result$ = makeSymbol("*SBHL-RESULT*");

    // defparameter
    // the result in justification searches.
    public static final SubLSymbol $sbhl_justification_result$ = makeSymbol("*SBHL-JUSTIFICATION-RESULT*");









    // defparameter
    // the nodes upon which a gather has already been performed.
    public static final SubLSymbol $sbhl_accessed_gather_nodes$ = makeSymbol("*SBHL-ACCESSED-GATHER-NODES*");







    // defparameter
    /**
     * Current search path during sample leaves search. Path is saved if successful.
     */
    public static final SubLSymbol $sbhl_current_leaf_queue$ = makeSymbol("*SBHL-CURRENT-LEAF-QUEUE*");





    // defparameter
    /**
     * Whether to check whether a node is marked as :goal before checking other
     * marking in search path termination.
     */
    public static final SubLSymbol $sbhl_check_for_goal_marking_p$ = makeSymbol("*SBHL-CHECK-FOR-GOAL-MARKING-P*");



    // defparameter
    /**
     * permit isa module to infer isa/genls of reified nats from result-type of
     * functor?
     */
    public static final SubLSymbol $infer_nat_sbhlP$ = makeSymbol("*INFER-NAT-SBHL?*");

    // defparameter
    // obsolete
    public static final SubLSymbol $sbhl_mapping_pred$ = makeSymbol("*SBHL-MAPPING-PRED*");

    // defparameter
    // obsolete
    public static final SubLSymbol $maximize_sbhl_resultP$ = makeSymbol("*MAXIMIZE-SBHL-RESULT?*");

    // defparameter
    // obsolete
    public static final SubLSymbol $minimize_sbhl_resultP$ = makeSymbol("*MINIMIZE-SBHL-RESULT?*");

    // defparameter
    // used to determine whether the search is true or false
    public static final SubLSymbol $sbhl_search_truth$ = makeSymbol("*SBHL-SEARCH-TRUTH*");

    // deflexical
    // valid sbhl truth values for searching
    private static final SubLSymbol $sbhl_search_truth_values$ = makeSymbol("*SBHL-SEARCH-TRUTH-VALUES*");

    // deflexical
    // the encompassing true truth for searches.
    private static final SubLSymbol $sbhl_true_tv$ = makeSymbol("*SBHL-TRUE-TV*");

    // deflexical
    // the encompassing false truth for searches.
    private static final SubLSymbol $sbhl_false_tv$ = makeSymbol("*SBHL-FALSE-TV*");





    // Internal Constants
    public static final SubLSymbol POSSIBLY_WITH_NEW_SBHL_SPACES = makeSymbol("POSSIBLY-WITH-NEW-SBHL-SPACES");

    public static final SubLSymbol WITH_NEW_SBHL_FINISHED = makeSymbol("WITH-NEW-SBHL-FINISHED");

    public static final SubLSymbol WITH_NEW_SBHL_STOP_SEARCH_PATH = makeSymbol("WITH-NEW-SBHL-STOP-SEARCH-PATH");

    public static final SubLSymbol RESET_SBHL_SEARCH_PARENT_MARKING = makeSymbol("RESET-SBHL-SEARCH-PARENT-MARKING");

    public static final SubLSymbol WITH_NEW_SBHL_PREVIOUS_MARKING = makeSymbol("WITH-NEW-SBHL-PREVIOUS-MARKING");

    public static final SubLSymbol WITH_NEW_SBHL_PREDICATE_MODE_SCOPE = makeSymbol("WITH-NEW-SBHL-PREDICATE-MODE-SCOPE");

    public static final SubLSymbol WITH_SBHL_READER_LOCK = makeSymbol("WITH-SBHL-READER-LOCK");

    public static final SubLSymbol WITH_SBHL_TRUE_SEARCH = makeSymbol("WITH-SBHL-TRUE-SEARCH");

    public static final SubLSymbol WITH_SBHL_FORWARD_SEARCH_DIRECTION = makeSymbol("WITH-SBHL-FORWARD-SEARCH-DIRECTION");

    public static final SubLSymbol WITH_SBHL_FORWARD_LINK_DIRECTION = makeSymbol("WITH-SBHL-FORWARD-LINK-DIRECTION");

    public static final SubLSymbol WITH_SBHL_BACKWARD_SEARCH_DIRECTION = makeSymbol("WITH-SBHL-BACKWARD-SEARCH-DIRECTION");

    public static final SubLSymbol WITH_SBHL_BACKWARD_LINK_DIRECTION = makeSymbol("WITH-SBHL-BACKWARD-LINK-DIRECTION");

    public static final SubLSymbol WITH_SBHL_FALSE_SEARCH = makeSymbol("WITH-SBHL-FALSE-SEARCH");

    public static final SubLList $list13 = list(makeSymbol("MT"), makeSymbol("TV"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol POSSIBLY_WITH_SBHL_MT_RELEVANCE = makeSymbol("POSSIBLY-WITH-SBHL-MT-RELEVANCE");

    public static final SubLSymbol POSSIBLY_WITH_SBHL_TRUE_TV = makeSymbol("POSSIBLY-WITH-SBHL-TRUE-TV");

    public static final SubLSymbol WITH_SBHL_FORWARD_TRUE_CONDITIONS = makeSymbol("WITH-SBHL-FORWARD-TRUE-CONDITIONS");

    public static final SubLSymbol INITIALIZE_SBHL_SEARCH = makeSymbol("INITIALIZE-SBHL-SEARCH");

    public static final SubLSymbol WITH_SBHL_BACKWARD_TRUE_CONDITIONS = makeSymbol("WITH-SBHL-BACKWARD-TRUE-CONDITIONS");

    public static final SubLSymbol POSSIBLY_WITH_SBHL_FALSE_TV = makeSymbol("POSSIBLY-WITH-SBHL-FALSE-TV");

    public static final SubLSymbol WITH_SBHL_FORWARD_FALSE_CONDITIONS = makeSymbol("WITH-SBHL-FORWARD-FALSE-CONDITIONS");

    public static final SubLSymbol WITH_SBHL_BACKWARD_FALSE_CONDITIONS = makeSymbol("WITH-SBHL-BACKWARD-FALSE-CONDITIONS");

    public static final SubLList $list22 = list(makeKeyword("CLOSURE"), makeKeyword("BOOLEAN"), makeKeyword("WHAT-MTS"));

    public static final SubLList $list23 = list(makeSymbol("TYPE"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $sbhl_search_type$ = makeSymbol("*SBHL-SEARCH-TYPE*");

    public static final SubLSymbol WITH_SBHL_SEARCH_TYPE = makeSymbol("WITH-SBHL-SEARCH-TYPE");







    public static final SubLList $list30 = list(list(makeSymbol("*SBHL-JUSTIFICATION-SEARCH-P*"), T), list(makeSymbol("*SBHL-APPLY-UNWIND-FUNCTION-P*"), NIL), list(makeSymbol("*SBHL-UNWIND-FUNCTION*"), list(makeSymbol("FIF"), list(makeSymbol("SBHL-TIME-SEARCH-P")), list(makeSymbol("QUOTE"), makeSymbol("SBHL-TEMPORAL-JUSTIFICATION-UNWIND")), list(makeSymbol("QUOTE"), makeSymbol("SBHL-PUSH-UNWIND-ONTO-RESULT")))));

    private static final SubLList $list31 = list(list(makeSymbol("*SBHL-JUSTIFICATION-SEARCH-P*"), NIL), list(makeSymbol("*SBHL-APPLY-UNWIND-FUNCTION-P*"), NIL));

    public static final SubLList $list32 = list(makeSymbol("BEHAVIOR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sbhl_search_behavior$ = makeSymbol("*SBHL-SEARCH-BEHAVIOR*");



    public static final SubLSymbol $sbhl_justification_behavior$ = makeSymbol("*SBHL-JUSTIFICATION-BEHAVIOR*");



    private static final SubLSymbol BEHAVIOR = makeSymbol("BEHAVIOR");



    private static final SubLList $list39 = list(list(makeSymbol("*SBHL-JUSTIFICATION-BEHAVIOR*"), makeKeyword("ASSERTION")));

    private static final SubLList $list40 = list(list(makeSymbol("*SBHL-JUSTIFICATION-BEHAVIOR*"), makeKeyword("VERBOSE")));

    public static final SubLList $list41 = list(list(makeSymbol("*SBHL-JUSTIFICATION-BEHAVIOR*"), makeKeyword("OLD")));

    public static final SubLList $list42 = list(list(makeSymbol("*SBHL-JUSTIFICATION-DEFAULTED-OLD*"), NIL));

    public static final SubLList $list43 = list(list(makeSymbol("*SBHL-JUSTIFICATION-ASSEMBLED-P*"), NIL));

    public static final SubLList $list44 = list(list(makeSymbol("*SBHL-UNMARKING-SEARCH-P*"), T));

    public static final SubLList $list45 = list(list(makeSymbol("*SBHL-UNMARKING-SEARCH-P*"), NIL));

    private static final SubLString $str46$get_sbhl_search_module___sbhl_sea = makeString("get-sbhl-search-module: *sbhl-search-module* is unexpectedly null.");

    private static final SubLObject $$genlInverse = reader_make_constant_shell(makeString("genlInverse"));

    private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));

    private static final SubLObject $$negationInverse = reader_make_constant_shell(makeString("negationInverse"));

    private static final SubLObject $$negationPreds = reader_make_constant_shell(makeString("negationPreds"));

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

    public static final SubLList $list61 = list(list(makeSymbol("*GENL-INVERSE-MODE-P*"), T));

    private static final SubLList $list62 = list(list(makeSymbol("*GENL-INVERSE-MODE-P*"), list(makeSymbol("FIF"), list(makeSymbol("SBHL-MODULE-FLIPS-INVERSE-MODE-P")), list(makeSymbol("CNOT"), makeSymbol("*GENL-INVERSE-MODE-P*")), makeSymbol("*GENL-INVERSE-MODE-P*"))));

    public static final SubLList $list63 = list(list(makeSymbol("*GENL-INVERSE-MODE-P*"), list(makeSymbol("FIF"), list(makeSymbol("FLIP-GENL-INVERSE-MODE?")), list(makeSymbol("CNOT"), makeSymbol("*GENL-INVERSE-MODE-P*")), makeSymbol("*GENL-INVERSE-MODE-P*"))));

    public static final SubLList $list64 = list(list(makeSymbol("*GENL-INVERSE-MODE-P*"), list(makeSymbol("FIF"), list(EQL, list(makeSymbol("GET-SBHL-LINK-PRED"), list(makeSymbol("GET-SBHL-SEARCH-MODULE"))), reader_make_constant_shell(makeString("negationInverse"))), T, makeSymbol("*GENL-INVERSE-MODE-P*"))));

    public static final SubLList $list65 = list(list(makeSymbol("*GENL-INVERSE-MODE-P*"), list(makeSymbol("CNOT"), makeSymbol("*GENL-INVERSE-MODE-P*"))));

    public static final SubLList $list66 = list(makeSymbol("START-MARKING"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym67$PRED = makeUninternedSymbol("PRED");

    public static final SubLList $list68 = list(makeSymbol("SBHL-MODULE-INDICATES-PREDICATE-SEARCH-P"), list(makeSymbol("GET-SBHL-SEARCH-MODULE")));



    public static final SubLSymbol $sbhl_add_unmarked_node_to_result_test$ = makeSymbol("*SBHL-ADD-UNMARKED-NODE-TO-RESULT-TEST*");



    private static final SubLList $list72 = list(reader_make_constant_shell(makeString("genlInverse")));





    private static final SubLList $list75 = list(makeSymbol("DIRECTION"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sbhl_search_direction$ = makeSymbol("*SBHL-SEARCH-DIRECTION*");

    private static final SubLSymbol WITH_SBHL_SEARCH_DIRECTION = makeSymbol("WITH-SBHL-SEARCH-DIRECTION");

    private static final SubLList $list78 = list(makeSymbol("GET-SBHL-FORWARD-SEARCH-DIRECTION"));

    private static final SubLList $list79 = list(makeSymbol("GET-SBHL-BACKWARD-SEARCH-DIRECTION"));

    public static final SubLList $list80 = list(list(makeSymbol("*SBHL-SEARCH-INDEX-ARG*"), list(makeSymbol("FIF"), list(EQ, makeSymbol("*SBHL-SEARCH-DIRECTION*"), makeKeyword("FORWARD")), list(makeSymbol("GET-SBHL-INDEX-ARG"), list(makeSymbol("GET-SBHL-MODULE"))), list(makeSymbol("GET-SBHL-GATHER-ARG"), list(makeSymbol("GET-SBHL-MODULE"))))));

    public static final SubLList $list81 = list(makeSymbol("FUNCTION"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sbhl_map_function$ = makeSymbol("*SBHL-MAP-FUNCTION*");

    public static final SubLSymbol $sbhl_unwind_function$ = makeSymbol("*SBHL-UNWIND-FUNCTION*");

    private static final SubLList $list84 = list(list(makeSymbol("*SBHL-APPLY-UNWIND-FUNCTION-P*"), T));

    private static final SubLList $list85 = list(list(makeSymbol("*SBHL-APPLY-UNWIND-FUNCTION-P*"), NIL));

    public static final SubLList $list86 = list(list(makeSymbol("*SBHL-SEARCH-PARENT-MARKING*"), NIL));

    public static final SubLList $list87 = list(list(makeSymbol("*SBHL-SEARCH-PARENT-MARKING*"), makeSymbol("*SBHL-SEARCH-PARENT-MARKING*")));

    public static final SubLList $list88 = list(list(makeSymbol("*SBHL-NODES-PREVIOUS-MARKING*"), NIL));

    public static final SubLList $list89 = list(list(makeSymbol("*SBHL-FINISHED?*"), NIL));





    private static final SubLList $list92 = list(list(makeSymbol("*SBHL-STOP-SEARCH-PATH?*"), NIL));

    private static final SubLList $list93 = list(makeSymbol("NODE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sbhl_target_node$ = makeSymbol("*SBHL-TARGET-NODE*");

    public static final SubLSymbol $sbhl_goal_node$ = makeSymbol("*SBHL-GOAL-NODE*");

    private static final SubLList $list96 = list(makeSymbol("NODES"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym97$_SBHL_ISA__GOAL_ = makeSymbol("*SBHL-ISA?-GOAL*");

    public static final SubLList $list98 = list(makeSymbol("RESULT-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list99 = list(makeSymbol("*SBHL-RESULT*"));





    private static final SubLList $list102 = list(makeSymbol("*SBHL-JUSTIFICATION-RESULT*"));

    private static final SubLList $list103 = list(makeSymbol("FN"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sbhl_consider_node_fn$ = makeSymbol("*SBHL-CONSIDER-NODE-FN*");

    public static final SubLSymbol $sbhl_compose_fn$ = makeSymbol("*SBHL-COMPOSE-FN*");



    public static final SubLSymbol $sbhl_combine_fn$ = makeSymbol("*SBHL-COMBINE-FN*");

    public static final SubLSymbol $sbhl_map_test_fn$ = makeSymbol("*SBHL-MAP-TEST-FN*");

    private static final SubLList $list109 = list(list(makeSymbol("*SBHL-ACCESSED-GATHER-NODES*"), NIL));

    public static final SubLSymbol $sbhl_dependents_cut_node$ = makeSymbol("*SBHL-DEPENDENTS-CUT-NODE*");

    public static final SubLList $list111 = list(makeSymbol("ARG"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sbhl_access_arg$ = makeSymbol("*SBHL-ACCESS-ARG*");

    public static final SubLList $list113 = list(makeSymbol("REF"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sbhl_referent$ = makeSymbol("*SBHL-REFERENT*");

    public static final SubLList $list115 = list(list(makeSymbol("*SBHL-CURRENT-LEAF-QUEUE*"), list(makeSymbol("CREATE-QUEUE"))));

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

    public static final SubLList $list133 = list(list(makeSymbol("CSETQ"), makeSymbol("*SBHL-SAMPLE-LEAF-QUEUES*"), list(makeSymbol("CDR"), makeSymbol("*SBHL-SAMPLE-LEAF-QUEUES*"))));



    public static final SubLList $list135 = list(list(makeSymbol("CSETQ"), makeSymbol("*SBHL-SAMPLE-LEAF-QUEUES*"), list(makeSymbol("REMOVE-IF"), list(makeSymbol("QUOTE"), makeSymbol("QUEUE-EMPTY-P")), makeSymbol("*SBHL-SAMPLE-LEAF-QUEUES*"))));

    public static final SubLSymbol $sbhl_extremal_test_fn$ = makeSymbol("*SBHL-EXTREMAL-TEST-FN*");

    public static final SubLList $list137 = list(list(makeSymbol("*SBHL-CHECK-FOR-GOAL-MARKING-P*"), T));

    private static final SubLList $list138 = list(makeSymbol("GOAL-SPACE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sbhl_precomputed_goal_space$ = makeSymbol("*SBHL-PRECOMPUTED-GOAL-SPACE*");

    public static final SubLList $list140 = list(list(makeSymbol("*SBHL-SEARCH-TRUTH*"), reader_make_constant_shell(makeString("True-JustificationTruth"))));

    private static final SubLList $list141 = list(list(makeSymbol("*SBHL-SEARCH-TRUTH*"), reader_make_constant_shell(makeString("False-JustificationTruth"))));

    public static final SubLList $list142 = list(reader_make_constant_shell(makeString("MonotonicallyTrue")), reader_make_constant_shell(makeString("DefaultTrue")), reader_make_constant_shell(makeString("MonotonicallyFalse")), reader_make_constant_shell(makeString("DefaultFalse")), reader_make_constant_shell(makeString("True-JustificationTruth")), reader_make_constant_shell(makeString("False-JustificationTruth")), reader_make_constant_shell(makeString("ArbitraryTruth-JustificationTruth")));

    private static final SubLObject $$True_JustificationTruth = reader_make_constant_shell(makeString("True-JustificationTruth"));

    private static final SubLObject $$False_JustificationTruth = reader_make_constant_shell(makeString("False-JustificationTruth"));

    private static final SubLObject $$MonotonicallyTrue = reader_make_constant_shell(makeString("MonotonicallyTrue"));

    private static final SubLObject $$DefaultTrue = reader_make_constant_shell(makeString("DefaultTrue"));

    private static final SubLObject $$ArbitraryTruth_JustifactionTruth = reader_make_constant_shell(makeString("ArbitraryTruth-JustifactionTruth"));

    private static final SubLObject $$ArbitraryTruth_JustificationTruth = reader_make_constant_shell(makeString("ArbitraryTruth-JustificationTruth"));

    private static final SubLObject $$MonotonicallyFalse = reader_make_constant_shell(makeString("MonotonicallyFalse"));

    private static final SubLObject $$DefaultFalse = reader_make_constant_shell(makeString("DefaultFalse"));

    private static final SubLObject $$JustifactionTruth = reader_make_constant_shell(makeString("JustifactionTruth"));

    private static final SubLObject $$Unknown_JustificationTruth = reader_make_constant_shell(makeString("Unknown-JustificationTruth"));



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

    public static final SubLList $list176 = list(makeSymbol("FUNCTION"), makeSymbol("RELEVANT-SBHL-TV-IS-EQ"));

    private static final SubLList $list177 = list(makeSymbol("TV"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym178$TV_VAR = makeUninternedSymbol("TV-VAR");



    private static final SubLList $list180 = list(makeSymbol("*SBHL-TV*"));

    private static final SubLList $list181 = list(list(makeSymbol("QUOTE"), makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV")), makeSymbol("*RELEVANT-SBHL-TV-FUNCTION*"));



    private static final SubLSymbol SBHL_CHECK_TYPE = makeSymbol("SBHL-CHECK-TYPE");

    private static final SubLList $list184 = list(makeSymbol("SBHL-SEARCH-TRUTH-VALUE-P"));

    private static final SubLSymbol $sym185$TV_VAR = makeUninternedSymbol("TV-VAR");

    public static final SubLList $list186 = list(list(makeSymbol("GET-SBHL-TRUE-TV")));

    private static final SubLList $list187 = list(makeSymbol("SBHL-TRUE-TV-P"));

    private static final SubLSymbol $sym188$TV_VAR = makeUninternedSymbol("TV-VAR");

    public static final SubLList $list189 = list(list(makeSymbol("GET-SBHL-FALSE-TV")));

    private static final SubLList $list190 = list(makeSymbol("SBHL-FALSE-TV-P"));

    public static final SubLList $list191 = list(makeSymbol("MT"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static SubLObject initialize_sbhl_search(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(POSSIBLY_WITH_NEW_SBHL_SPACES, list(WITH_NEW_SBHL_FINISHED, list(WITH_NEW_SBHL_STOP_SEARCH_PATH, list(RESET_SBHL_SEARCH_PARENT_MARKING, list(WITH_NEW_SBHL_PREVIOUS_MARKING, list(WITH_NEW_SBHL_PREDICATE_MODE_SCOPE, bq_cons(WITH_SBHL_READER_LOCK, append(body, NIL))))))));
    }

    public static SubLObject initialize_sbhl_search_wXo_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_NEW_SBHL_FINISHED, list(WITH_NEW_SBHL_STOP_SEARCH_PATH, list(RESET_SBHL_SEARCH_PARENT_MARKING, list(WITH_NEW_SBHL_PREVIOUS_MARKING, list(WITH_NEW_SBHL_PREDICATE_MODE_SCOPE, bq_cons(WITH_SBHL_READER_LOCK, append(body, NIL)))))));
    }

    public static SubLObject with_sbhl_forward_true_conditions(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_SBHL_TRUE_SEARCH, list(WITH_SBHL_FORWARD_SEARCH_DIRECTION, bq_cons(WITH_SBHL_FORWARD_LINK_DIRECTION, append(body, NIL))));
    }

    public static SubLObject with_sbhl_backward_true_conditions(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_SBHL_TRUE_SEARCH, list(WITH_SBHL_BACKWARD_SEARCH_DIRECTION, bq_cons(WITH_SBHL_BACKWARD_LINK_DIRECTION, append(body, NIL))));
    }

    public static SubLObject with_sbhl_forward_false_conditions(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_SBHL_FALSE_SEARCH, list(WITH_SBHL_FORWARD_SEARCH_DIRECTION, bq_cons(WITH_SBHL_FORWARD_LINK_DIRECTION, append(body, NIL))));
    }

    public static SubLObject with_sbhl_backward_false_conditions(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_SBHL_FALSE_SEARCH, list(WITH_SBHL_BACKWARD_SEARCH_DIRECTION, bq_cons(WITH_SBHL_BACKWARD_LINK_DIRECTION, append(body, NIL))));
    }

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

    public static SubLObject with_sbhl_forward_true_subsearch(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_SBHL_FORWARD_TRUE_CONDITIONS, bq_cons(INITIALIZE_SBHL_SEARCH, append(body, NIL)));
    }

    public static SubLObject with_sbhl_backward_true_subsearch(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_SBHL_BACKWARD_TRUE_CONDITIONS, bq_cons(INITIALIZE_SBHL_SEARCH, append(body, NIL)));
    }

    public static SubLObject with_sbhl_forward_false_subsearch(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_SBHL_FORWARD_FALSE_CONDITIONS, bq_cons(INITIALIZE_SBHL_SEARCH, append(body, NIL)));
    }

    public static SubLObject with_sbhl_backward_false_subsearch(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_SBHL_BACKWARD_FALSE_CONDITIONS, bq_cons(INITIALIZE_SBHL_SEARCH, append(body, NIL)));
    }

    public static SubLObject sbhl_search_type_p(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(type, $sbhl_search_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_sbhl_search_type() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_search_type$.getDynamicValue(thread);
    }

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

    public static SubLObject with_sbhl_closure_search(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_SBHL_SEARCH_TYPE, $CLOSURE, append(body, NIL));
    }

    public static SubLObject with_sbhl_boolean_search(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_SBHL_SEARCH_TYPE, $BOOLEAN, append(body, NIL));
    }

    public static SubLObject with_sbhl_what_mts_search(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_SBHL_SEARCH_TYPE, $WHAT_MTS, append(body, NIL));
    }

    public static SubLObject sbhl_closure_search_p() {
        return eq(get_sbhl_search_type(), $CLOSURE);
    }

    public static SubLObject sbhl_boolean_search_p() {
        return eq(get_sbhl_search_type(), $BOOLEAN);
    }

    public static SubLObject sbhl_what_mts_search_p() {
        return eq(get_sbhl_search_type(), $WHAT_MTS);
    }

    public static SubLObject sbhl_goal_search_p() {
        return makeBoolean((NIL != sbhl_boolean_search_p()) || (NIL != sbhl_justification_search_p()));
    }

    public static SubLObject sbhl_justification_search_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_justification_search_p$.getDynamicValue(thread);
    }

    public static SubLObject with_sbhl_justification_search(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list30, append(body, NIL));
    }

    public static SubLObject without_sbhl_justification_search(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list31, append(body, NIL));
    }

    public static SubLObject get_sbhl_search_behavior() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_search_behavior$.getDynamicValue(thread);
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

    public static SubLObject get_sbhl_just_behavior() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_justification_behavior$.getDynamicValue(thread);
    }

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

    public static SubLObject with_sbhl_assertion_justifications(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list39, append(body, NIL));
    }

    public static SubLObject with_sbhl_verbose_justifications(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list40, append(body, NIL));
    }

    public static SubLObject with_sbhl_old_justifications(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list41, append(body, NIL));
    }

    public static SubLObject with_sbhl_justification_default(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list42, append(body, NIL));
    }

    public static SubLObject sbhl_justification_behavior_defaults_old() {
        $sbhl_justification_defaulted_old$.setDynamicValue(T);
        return NIL;
    }

    public static SubLObject sbhl_justification_defaulted_old_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_justification_defaulted_old$.getDynamicValue(thread);
    }

    public static SubLObject sbhl_justification_assembled() {
        $sbhl_justification_assembled_p$.setDynamicValue(T);
        return NIL;
    }

    public static SubLObject with_sbhl_justification_unassembled(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list43, append(body, NIL));
    }

    public static SubLObject sbhl_justification_assembled_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_justification_assembled_p$.getDynamicValue(thread);
    }

    public static SubLObject sbhl_unmarking_search_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_unmarking_search_p$.getDynamicValue(thread);
    }

    public static SubLObject with_sbhl_unmarking_search(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list44, append(body, NIL));
    }

    public static SubLObject without_sbhl_unmarking_search(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list45, append(body, NIL));
    }

    public static SubLObject get_sbhl_search_module() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $sbhl_search_module$.getDynamicValue(thread)) {
            Errors.warn($str46$get_sbhl_search_module___sbhl_sea);
        }
        return $sbhl_search_module$.getDynamicValue(thread);
    }

    public static SubLObject get_sbhl_search_module_type() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_search_module_type$.getDynamicValue(thread);
    }

    public static SubLObject get_sbhl_search_add_node_test() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_add_node_to_result_test$.getDynamicValue(thread);
    }

    public static SubLObject get_sbhl_search_add_unmarked_node_test() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_add_unmarked_node_to_result_test$.getDynamicValue(thread);
    }

    public static SubLObject get_sbhl_search_gather_module() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_module_vars.get_sbhl_module_link_pred($sbhl_search_module$.getDynamicValue(thread)).eql($$genlInverse)) {
            return sbhl_module_vars.get_sbhl_module($$genlPreds);
        }
        return $sbhl_search_module$.getDynamicValue(thread);
    }

    public static SubLObject get_sbhl_disjoins_search_gather_module() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_module_vars.get_sbhl_module_link_pred($sbhl_search_module$.getDynamicValue(thread)).eql($$negationInverse)) {
            return sbhl_module_vars.get_sbhl_module($$negationPreds);
        }
        return $sbhl_search_module$.getDynamicValue(thread);
    }

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

    public static SubLObject genl_inverse_mode_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $genl_inverse_mode_p$.getDynamicValue(thread);
    }

    public static SubLObject not_genl_inverse_mode_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(NIL == $genl_inverse_mode_p$.getDynamicValue(thread));
    }

    public static SubLObject with_new_sbhl_predicate_mode_scope(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list58, append(body, NIL));
    }

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

    public static SubLObject with_genl_inverse_mode(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list61, append(body, NIL));
    }

    public static SubLObject sbhl_update_genl_inverse_mode(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list62, append(body, NIL));
    }

    public static SubLObject possibly_flip_genl_inverse_mode(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list63, append(body, NIL));
    }

    public static SubLObject possibly_premark_with_genl_inverse_mode(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list64, append(body, NIL));
    }

    public static SubLObject flip_genl_inverse_mode(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list65, append(body, NIL));
    }

    public static SubLObject sbhl_module_flips_inverse_mode_p(SubLObject sbhl_module) {
        if (sbhl_module == UNPROVIDED) {
            sbhl_module = sbhl_module_vars.get_sbhl_module(UNPROVIDED);
        }
        return makeBoolean(sbhl_module_utilities.get_sbhl_link_pred(sbhl_module).eql($$genlInverse) || sbhl_module_utilities.get_sbhl_link_pred(sbhl_module).eql($$negationInverse));
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

    public static SubLObject sbhl_forward_search_direction_p(final SubLObject direction) {
        return eq(direction, $sbhl_forward_search_direction$.getGlobalValue());
    }

    public static SubLObject get_sbhl_forward_search_direction() {
        return $sbhl_forward_search_direction$.getGlobalValue();
    }

    public static SubLObject sbhl_backward_search_direction_p(final SubLObject direction) {
        return eq(direction, $sbhl_backward_search_direction$.getGlobalValue());
    }

    public static SubLObject get_sbhl_backward_search_direction() {
        return $sbhl_backward_search_direction$.getGlobalValue();
    }

    public static SubLObject get_sbhl_search_direction() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_search_direction$.getDynamicValue(thread);
    }

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

    public static SubLObject with_sbhl_forward_search_direction(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_SBHL_SEARCH_DIRECTION, $list78, append(body, NIL));
    }

    public static SubLObject with_sbhl_backward_search_direction(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_SBHL_SEARCH_DIRECTION, $list79, append(body, NIL));
    }

    public static SubLObject sbhl_forward_search_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_forward_search_direction_p($sbhl_search_direction$.getDynamicValue(thread));
    }

    public static SubLObject sbhl_backward_search_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_backward_search_direction_p($sbhl_search_direction$.getDynamicValue(thread));
    }

    public static SubLObject get_sbhl_search_index_arg() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_search_index_arg$.getDynamicValue(thread);
    }

    public static SubLObject get_sbhl_search_gather_arg() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subtract(THREE_INTEGER, $sbhl_search_index_arg$.getDynamicValue(thread));
    }

    public static SubLObject bind_sbhl_search_index_arg(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list80, append(body, NIL));
    }

    public static SubLObject get_sbhl_map_function() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_map_function$.getDynamicValue(thread);
    }

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

    public static SubLObject get_sbhl_unwind_function() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_unwind_function$.getDynamicValue(thread);
    }

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

    public static SubLObject sbhl_apply_unwind_function_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_apply_unwind_function_p$.getDynamicValue(thread);
    }

    public static SubLObject sbhl_toggle_unwind_function_on() {
        $sbhl_apply_unwind_function_p$.setDynamicValue(T);
        return NIL;
    }

    public static SubLObject sbhl_toggle_unwind_function_off() {
        $sbhl_apply_unwind_function_p$.setDynamicValue(NIL);
        return NIL;
    }

    public static SubLObject with_sbhl_unwind_function_on(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list84, append(body, NIL));
    }

    public static SubLObject with_sbhl_unwind_function_off(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list85, append(body, NIL));
    }

    public static SubLObject get_sbhl_search_parent_marking() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_search_parent_marking$.getDynamicValue(thread);
    }

    public static SubLObject set_sbhl_search_parent_marking(final SubLObject marking) {
        $sbhl_search_parent_marking$.setDynamicValue(marking);
        return NIL;
    }

    public static SubLObject reset_sbhl_search_parent_marking(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list86, append(body, NIL));
    }

    public static SubLObject dynamically_rebind_sbhl_search_parent_marking(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list87, append(body, NIL));
    }

    public static SubLObject with_new_sbhl_previous_marking(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list88, append(body, NIL));
    }

    public static SubLObject get_sbhl_nodes_previous_marking() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_nodes_previous_marking$.getDynamicValue(thread);
    }

    public static SubLObject with_new_sbhl_finished(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list89, append(body, NIL));
    }

    public static SubLObject sbhl_finished_with_goal() {
        $sbhl_finishedP$.setDynamicValue($GOAL);
        return NIL;
    }

    public static SubLObject sbhl_finished_with_cutoff() {
        $sbhl_finishedP$.setDynamicValue($CUTOFF);
        return NIL;
    }

    public static SubLObject sbhl_stop_search_path_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_stop_search_pathP$.getDynamicValue(thread);
    }

    public static SubLObject sbhl_stop_search_path() {
        $sbhl_stop_search_pathP$.setDynamicValue(T);
        return NIL;
    }

    public static SubLObject sbhl_continue_search_path() {
        $sbhl_stop_search_pathP$.setDynamicValue(NIL);
        return NIL;
    }

    public static SubLObject with_new_sbhl_stop_search_path(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list92, append(body, NIL));
    }

    public static SubLObject sbhl_target_node_p(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return eql(node, $sbhl_target_node$.getDynamicValue(thread));
    }

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

    public static SubLObject sbhl_goal_node_p(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return eql(node, $sbhl_goal_node$.getDynamicValue(thread));
    }

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

    public static SubLObject get_sbhl_goal_node() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_goal_node$.getDynamicValue(thread);
    }

    public static SubLObject sbhl_node_isa_goal_node_p(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(node, $sbhl_goal_node$.getDynamicValue(thread), symbol_function(EQL), UNPROVIDED);
    }

    public static SubLObject get_sbhl_goal_nodes() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_goal_nodes$.getDynamicValue(thread);
    }

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

    public static SubLObject get_sbhl_isaP_goal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_isaP_goal$.getDynamicValue(thread);
    }

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

    public static SubLObject get_sbhl_consider_node_fn() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_consider_node_fn$.getDynamicValue(thread);
    }

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

    public static SubLObject get_sbhl_compose_fn() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_compose_fn$.getDynamicValue(thread);
    }

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

    public static SubLObject get_sbhl_combine_fn() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_combine_fn$.getDynamicValue(thread);
    }

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

    public static SubLObject get_sbhl_map_test_fn() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_map_test_fn$.getDynamicValue(thread);
    }

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

    public static SubLObject reset_sbhl_accessed_gather_nodes(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list109, append(body, NIL));
    }

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

    public static SubLObject sbhl_dependents_cut_node_p(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return eql(node, $sbhl_dependents_cut_node$.getDynamicValue(thread));
    }

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

    public static SubLObject with_new_sbhl_leaf_queue(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list115, append(body, NIL));
    }

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

    public static SubLObject sbhl_leaf_sample_search_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean($sbhl_sample_leaf_queues$.getDynamicValue(thread));
    }

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

    public static SubLObject sbhl_extremal_test_fn_p(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return funcall($sbhl_extremal_test_fn$.getDynamicValue(thread), node);
    }

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

    public static SubLObject sbhl_check_for_goal_marking_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_check_for_goal_marking_p$.getDynamicValue(thread);
    }

    public static SubLObject with_sbhl_search_termination_on_previous_successes(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list137, append(body, NIL));
    }

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

    public static SubLObject with_sbhl_true_search(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list140, append(body, NIL));
    }

    public static SubLObject with_sbhl_false_search(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list141, append(body, NIL));
    }

    public static SubLObject sbhl_true_search_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_true_tv_p($sbhl_search_truth$.getDynamicValue(thread));
    }

    public static SubLObject sbhl_false_search_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_false_tv_p($sbhl_search_truth$.getDynamicValue(thread));
    }

    public static SubLObject sbhl_search_truth_value_p(final SubLObject truth) {
        return subl_promotions.memberP(truth, $sbhl_search_truth_values$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_sbhl_true_tv() {
        return $sbhl_true_tv$.getGlobalValue();
    }

    public static SubLObject get_sbhl_false_tv() {
        return $sbhl_false_tv$.getGlobalValue();
    }

    public static SubLObject get_sbhl_tv() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_tv$.getDynamicValue(thread);
    }

    public static SubLObject relevant_sbhl_tv_is_everything(final SubLObject tv) {
        return T;
    }

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

    public static SubLObject relevant_sbhl_tv_is_general_tv(final SubLObject tv) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_tv_generalizes_to_general_tvP(tv, $sbhl_tv$.getDynamicValue(thread));
    }

    public static SubLObject relevant_sbhl_tvP(final SubLObject tv) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != $relevant_sbhl_tv_function$.getDynamicValue(thread) ? funcall($relevant_sbhl_tv_function$.getDynamicValue(thread), tv) : relevant_sbhl_tv_is_general_tv(tv);
    }

    public static SubLObject sbhl_true_tv_p(final SubLObject tv) {
        return sbhl_tv_generalizes_to_general_tvP(tv, $$True_JustificationTruth);
    }

    public static SubLObject sbhl_false_tv_p(final SubLObject tv) {
        return sbhl_tv_generalizes_to_general_tvP(tv, $$False_JustificationTruth);
    }

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

    public static SubLObject sbhl_true_tv(final SubLObject tv) {
        if (NIL != sbhl_true_tv_p(tv)) {
            return tv;
        }
        if (NIL != sbhl_false_tv_p(tv)) {
            return sbhl_opposite_tv(tv);
        }
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str160$Expected_true_or_false_sbhl_truth, tv, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject sbhl_false_tv(final SubLObject tv) {
        if (NIL != sbhl_false_tv_p(tv)) {
            return tv;
        }
        if (NIL != sbhl_true_tv_p(tv)) {
            return sbhl_opposite_tv(tv);
        }
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str160$Expected_true_or_false_sbhl_truth, tv, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject sbhl_search_true_tv() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_true_tv($sbhl_tv$.getDynamicValue(thread));
    }

    public static SubLObject sbhl_search_false_tv() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_false_tv($sbhl_tv$.getDynamicValue(thread));
    }

    public static SubLObject sbhl_translate_to_old_tv(final SubLObject tv) {
        if (NIL != sbhl_true_tv_p(tv)) {
            return $TRUE;
        }
        if (NIL != sbhl_false_tv_p(tv)) {
            return $FALSE;
        }
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str163$unknown_truth_value_for_translati, tv, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject sbhl_possibly_translate_tv(final SubLObject tv) {
        if ((tv != $TRUE) && (tv != $FALSE)) {
            return sbhl_translate_to_old_tv(tv);
        }
        return tv;
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

    public static SubLObject with_sbhl_tv_function(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject function = NIL;
        destructuring_bind_must_consp(current, datum, $list81);
        function = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($relevant_sbhl_tv_function$, function)), append(body, NIL));
    }

    public static SubLObject with_sbhl_tv(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject sbhl_tv = NIL;
        destructuring_bind_must_consp(current, datum, $list170);
        sbhl_tv = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_tv$, sbhl_tv)), append(body, NIL));
    }

    public static SubLObject with_all_sbhl_tvs(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_SBHL_TV_FUNCTION, $list173, append(body, NIL));
    }

    public static SubLObject with_general_sbhl_tv(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject sbhl_tv = NIL;
        destructuring_bind_must_consp(current, datum, $list170);
        sbhl_tv = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(WITH_SBHL_TV_FUNCTION, $list174, listS(WITH_SBHL_TV, sbhl_tv, append(body, NIL)));
    }

    public static SubLObject with_just_sbhl_tv(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject sbhl_tv = NIL;
        destructuring_bind_must_consp(current, datum, $list170);
        sbhl_tv = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(WITH_SBHL_TV_FUNCTION, $list176, listS(WITH_SBHL_TV, sbhl_tv, append(body, NIL)));
    }

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
    }

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
    }

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
        declareMacro(me, "initialize_sbhl_search", "INITIALIZE-SBHL-SEARCH");
        declareMacro(me, "initialize_sbhl_search_wXo_spaces", "INITIALIZE-SBHL-SEARCH-W/O-SPACES");
        declareMacro(me, "with_sbhl_forward_true_conditions", "WITH-SBHL-FORWARD-TRUE-CONDITIONS");
        declareMacro(me, "with_sbhl_backward_true_conditions", "WITH-SBHL-BACKWARD-TRUE-CONDITIONS");
        declareMacro(me, "with_sbhl_forward_false_conditions", "WITH-SBHL-FORWARD-FALSE-CONDITIONS");
        declareMacro(me, "with_sbhl_backward_false_conditions", "WITH-SBHL-BACKWARD-FALSE-CONDITIONS");
        declareMacro(me, "with_sbhl_forward_true_search", "WITH-SBHL-FORWARD-TRUE-SEARCH");
        declareMacro(me, "with_sbhl_backward_true_search", "WITH-SBHL-BACKWARD-TRUE-SEARCH");
        declareMacro(me, "with_sbhl_forward_false_search", "WITH-SBHL-FORWARD-FALSE-SEARCH");
        declareMacro(me, "with_sbhl_backward_false_search", "WITH-SBHL-BACKWARD-FALSE-SEARCH");
        declareMacro(me, "with_sbhl_forward_true_subsearch", "WITH-SBHL-FORWARD-TRUE-SUBSEARCH");
        declareMacro(me, "with_sbhl_backward_true_subsearch", "WITH-SBHL-BACKWARD-TRUE-SUBSEARCH");
        declareMacro(me, "with_sbhl_forward_false_subsearch", "WITH-SBHL-FORWARD-FALSE-SUBSEARCH");
        declareMacro(me, "with_sbhl_backward_false_subsearch", "WITH-SBHL-BACKWARD-FALSE-SUBSEARCH");
        declareFunction(me, "sbhl_search_type_p", "SBHL-SEARCH-TYPE-P", 1, 0, false);
        declareFunction(me, "get_sbhl_search_type", "GET-SBHL-SEARCH-TYPE", 0, 0, false);
        declareMacro(me, "with_sbhl_search_type", "WITH-SBHL-SEARCH-TYPE");
        declareMacro(me, "with_sbhl_closure_search", "WITH-SBHL-CLOSURE-SEARCH");
        declareMacro(me, "with_sbhl_boolean_search", "WITH-SBHL-BOOLEAN-SEARCH");
        declareMacro(me, "with_sbhl_what_mts_search", "WITH-SBHL-WHAT-MTS-SEARCH");
        declareFunction(me, "sbhl_closure_search_p", "SBHL-CLOSURE-SEARCH-P", 0, 0, false);
        declareFunction(me, "sbhl_boolean_search_p", "SBHL-BOOLEAN-SEARCH-P", 0, 0, false);
        declareFunction(me, "sbhl_what_mts_search_p", "SBHL-WHAT-MTS-SEARCH-P", 0, 0, false);
        declareFunction(me, "sbhl_goal_search_p", "SBHL-GOAL-SEARCH-P", 0, 0, false);
        declareFunction(me, "sbhl_justification_search_p", "SBHL-JUSTIFICATION-SEARCH-P", 0, 0, false);
        declareMacro(me, "with_sbhl_justification_search", "WITH-SBHL-JUSTIFICATION-SEARCH");
        declareMacro(me, "without_sbhl_justification_search", "WITHOUT-SBHL-JUSTIFICATION-SEARCH");
        declareFunction(me, "get_sbhl_search_behavior", "GET-SBHL-SEARCH-BEHAVIOR", 0, 0, false);
        declareMacro(me, "with_sbhl_search_behavior", "WITH-SBHL-SEARCH-BEHAVIOR");
        declareFunction(me, "get_sbhl_just_behavior", "GET-SBHL-JUST-BEHAVIOR", 0, 0, false);
        declareMacro(me, "with_sbhl_justification_behavior", "WITH-SBHL-JUSTIFICATION-BEHAVIOR");
        declareMacro(me, "possibly_with_sbhl_justification_behavior", "POSSIBLY-WITH-SBHL-JUSTIFICATION-BEHAVIOR");
        declareMacro(me, "with_sbhl_assertion_justifications", "WITH-SBHL-ASSERTION-JUSTIFICATIONS");
        declareMacro(me, "with_sbhl_verbose_justifications", "WITH-SBHL-VERBOSE-JUSTIFICATIONS");
        declareMacro(me, "with_sbhl_old_justifications", "WITH-SBHL-OLD-JUSTIFICATIONS");
        declareMacro(me, "with_sbhl_justification_default", "WITH-SBHL-JUSTIFICATION-DEFAULT");
        declareFunction(me, "sbhl_justification_behavior_defaults_old", "SBHL-JUSTIFICATION-BEHAVIOR-DEFAULTS-OLD", 0, 0, false);
        declareFunction(me, "sbhl_justification_defaulted_old_p", "SBHL-JUSTIFICATION-DEFAULTED-OLD-P", 0, 0, false);
        declareFunction(me, "sbhl_justification_assembled", "SBHL-JUSTIFICATION-ASSEMBLED", 0, 0, false);
        declareMacro(me, "with_sbhl_justification_unassembled", "WITH-SBHL-JUSTIFICATION-UNASSEMBLED");
        declareFunction(me, "sbhl_justification_assembled_p", "SBHL-JUSTIFICATION-ASSEMBLED-P", 0, 0, false);
        declareFunction(me, "sbhl_unmarking_search_p", "SBHL-UNMARKING-SEARCH-P", 0, 0, false);
        declareMacro(me, "with_sbhl_unmarking_search", "WITH-SBHL-UNMARKING-SEARCH");
        declareMacro(me, "without_sbhl_unmarking_search", "WITHOUT-SBHL-UNMARKING-SEARCH");
        declareFunction(me, "get_sbhl_search_module", "GET-SBHL-SEARCH-MODULE", 0, 0, false);
        declareFunction(me, "get_sbhl_search_module_type", "GET-SBHL-SEARCH-MODULE-TYPE", 0, 0, false);
        declareFunction(me, "get_sbhl_search_add_node_test", "GET-SBHL-SEARCH-ADD-NODE-TEST", 0, 0, false);
        declareFunction(me, "get_sbhl_search_add_unmarked_node_test", "GET-SBHL-SEARCH-ADD-UNMARKED-NODE-TEST", 0, 0, false);
        declareFunction(me, "get_sbhl_search_gather_module", "GET-SBHL-SEARCH-GATHER-MODULE", 0, 0, false);
        declareFunction(me, "get_sbhl_disjoins_search_gather_module", "GET-SBHL-DISJOINS-SEARCH-GATHER-MODULE", 0, 0, false);
        declareMacro(me, "with_sbhl_search_module", "WITH-SBHL-SEARCH-MODULE");
        declareFunction(me, "genl_inverse_mode_p", "GENL-INVERSE-MODE-P", 0, 0, false);
        declareFunction(me, "not_genl_inverse_mode_p", "NOT-GENL-INVERSE-MODE-P", 0, 0, false);
        declareMacro(me, "with_new_sbhl_predicate_mode_scope", "WITH-NEW-SBHL-PREDICATE-MODE-SCOPE");
        declareMacro(me, "with_sbhl_predicate_mode", "WITH-SBHL-PREDICATE-MODE");
        declareMacro(me, "with_genl_inverse_mode", "WITH-GENL-INVERSE-MODE");
        declareMacro(me, "sbhl_update_genl_inverse_mode", "SBHL-UPDATE-GENL-INVERSE-MODE");
        declareMacro(me, "possibly_flip_genl_inverse_mode", "POSSIBLY-FLIP-GENL-INVERSE-MODE");
        declareMacro(me, "possibly_premark_with_genl_inverse_mode", "POSSIBLY-PREMARK-WITH-GENL-INVERSE-MODE");
        declareMacro(me, "flip_genl_inverse_mode", "FLIP-GENL-INVERSE-MODE");
        declareFunction(me, "sbhl_module_flips_inverse_mode_p", "SBHL-MODULE-FLIPS-INVERSE-MODE-P", 0, 1, false);
        declareFunction(me, "flip_genl_inverse_modeP", "FLIP-GENL-INVERSE-MODE?", 0, 2, false);
        declareMacro(me, "with_initialized_unmarking_sbhl_marking_module", "WITH-INITIALIZED-UNMARKING-SBHL-MARKING-MODULE");
        declareFunction(me, "sbhl_forward_search_direction_p", "SBHL-FORWARD-SEARCH-DIRECTION-P", 1, 0, false);
        declareFunction(me, "get_sbhl_forward_search_direction", "GET-SBHL-FORWARD-SEARCH-DIRECTION", 0, 0, false);
        declareFunction(me, "sbhl_backward_search_direction_p", "SBHL-BACKWARD-SEARCH-DIRECTION-P", 1, 0, false);
        declareFunction(me, "get_sbhl_backward_search_direction", "GET-SBHL-BACKWARD-SEARCH-DIRECTION", 0, 0, false);
        declareFunction(me, "get_sbhl_search_direction", "GET-SBHL-SEARCH-DIRECTION", 0, 0, false);
        declareMacro(me, "with_sbhl_search_direction", "WITH-SBHL-SEARCH-DIRECTION");
        declareMacro(me, "with_sbhl_forward_search_direction", "WITH-SBHL-FORWARD-SEARCH-DIRECTION");
        declareMacro(me, "with_sbhl_backward_search_direction", "WITH-SBHL-BACKWARD-SEARCH-DIRECTION");
        declareFunction(me, "sbhl_forward_search_p", "SBHL-FORWARD-SEARCH-P", 0, 0, false);
        declareFunction(me, "sbhl_backward_search_p", "SBHL-BACKWARD-SEARCH-P", 0, 0, false);
        declareFunction(me, "get_sbhl_search_index_arg", "GET-SBHL-SEARCH-INDEX-ARG", 0, 0, false);
        declareFunction(me, "get_sbhl_search_gather_arg", "GET-SBHL-SEARCH-GATHER-ARG", 0, 0, false);
        declareMacro(me, "bind_sbhl_search_index_arg", "BIND-SBHL-SEARCH-INDEX-ARG");
        declareFunction(me, "get_sbhl_map_function", "GET-SBHL-MAP-FUNCTION", 0, 0, false);
        declareMacro(me, "with_sbhl_map_function", "WITH-SBHL-MAP-FUNCTION");
        declareFunction(me, "get_sbhl_unwind_function", "GET-SBHL-UNWIND-FUNCTION", 0, 0, false);
        declareMacro(me, "with_sbhl_unwind_function", "WITH-SBHL-UNWIND-FUNCTION");
        declareFunction(me, "sbhl_apply_unwind_function_p", "SBHL-APPLY-UNWIND-FUNCTION-P", 0, 0, false);
        declareFunction(me, "sbhl_toggle_unwind_function_on", "SBHL-TOGGLE-UNWIND-FUNCTION-ON", 0, 0, false);
        declareFunction(me, "sbhl_toggle_unwind_function_off", "SBHL-TOGGLE-UNWIND-FUNCTION-OFF", 0, 0, false);
        declareMacro(me, "with_sbhl_unwind_function_on", "WITH-SBHL-UNWIND-FUNCTION-ON");
        declareMacro(me, "with_sbhl_unwind_function_off", "WITH-SBHL-UNWIND-FUNCTION-OFF");
        declareFunction(me, "get_sbhl_search_parent_marking", "GET-SBHL-SEARCH-PARENT-MARKING", 0, 0, false);
        declareFunction(me, "set_sbhl_search_parent_marking", "SET-SBHL-SEARCH-PARENT-MARKING", 1, 0, false);
        declareMacro(me, "reset_sbhl_search_parent_marking", "RESET-SBHL-SEARCH-PARENT-MARKING");
        declareMacro(me, "dynamically_rebind_sbhl_search_parent_marking", "DYNAMICALLY-REBIND-SBHL-SEARCH-PARENT-MARKING");
        declareMacro(me, "with_new_sbhl_previous_marking", "WITH-NEW-SBHL-PREVIOUS-MARKING");
        declareFunction(me, "get_sbhl_nodes_previous_marking", "GET-SBHL-NODES-PREVIOUS-MARKING", 0, 0, false);
        declareMacro(me, "with_new_sbhl_finished", "WITH-NEW-SBHL-FINISHED");
        declareFunction(me, "sbhl_finished_with_goal", "SBHL-FINISHED-WITH-GOAL", 0, 0, false);
        declareFunction(me, "sbhl_finished_with_cutoff", "SBHL-FINISHED-WITH-CUTOFF", 0, 0, false);
        declareFunction(me, "sbhl_stop_search_path_p", "SBHL-STOP-SEARCH-PATH-P", 0, 0, false);
        declareFunction(me, "sbhl_stop_search_path", "SBHL-STOP-SEARCH-PATH", 0, 0, false);
        declareFunction(me, "sbhl_continue_search_path", "SBHL-CONTINUE-SEARCH-PATH", 0, 0, false);
        declareMacro(me, "with_new_sbhl_stop_search_path", "WITH-NEW-SBHL-STOP-SEARCH-PATH");
        declareFunction(me, "sbhl_target_node_p", "SBHL-TARGET-NODE-P", 1, 0, false);
        declareMacro(me, "with_sbhl_target_node", "WITH-SBHL-TARGET-NODE");
        declareFunction(me, "sbhl_goal_node_p", "SBHL-GOAL-NODE-P", 1, 0, false);
        declareMacro(me, "with_sbhl_goal_node", "WITH-SBHL-GOAL-NODE");
        declareFunction(me, "get_sbhl_goal_node", "GET-SBHL-GOAL-NODE", 0, 0, false);
        declareFunction(me, "sbhl_node_isa_goal_node_p", "SBHL-NODE-ISA-GOAL-NODE-P", 1, 0, false);
        declareFunction(me, "get_sbhl_goal_nodes", "GET-SBHL-GOAL-NODES", 0, 0, false);
        declareMacro(me, "with_sbhl_goal_nodes", "WITH-SBHL-GOAL-NODES");
        declareMacro(me, "with_sbhl_isaP_goal", "WITH-SBHL-ISA?-GOAL");
        declareFunction(me, "get_sbhl_isaP_goal", "GET-SBHL-ISA?-GOAL", 0, 0, false);
        declareMacro(me, "with_sbhl_result", "WITH-SBHL-RESULT");
        declareMacro(me, "with_sbhl_just_result", "WITH-SBHL-JUST-RESULT");
        declareFunction(me, "get_sbhl_consider_node_fn", "GET-SBHL-CONSIDER-NODE-FN", 0, 0, false);
        declareMacro(me, "with_sbhl_consider_node_fn", "WITH-SBHL-CONSIDER-NODE-FN");
        declareFunction(me, "get_sbhl_compose_fn", "GET-SBHL-COMPOSE-FN", 0, 0, false);
        declareMacro(me, "with_sbhl_compose_fn", "WITH-SBHL-COMPOSE-FN");
        declareFunction(me, "get_sbhl_combine_fn", "GET-SBHL-COMBINE-FN", 0, 0, false);
        declareMacro(me, "with_sbhl_combine_fn", "WITH-SBHL-COMBINE-FN");
        declareFunction(me, "get_sbhl_map_test_fn", "GET-SBHL-MAP-TEST-FN", 0, 0, false);
        declareMacro(me, "with_sbhl_map_test_fn", "WITH-SBHL-MAP-TEST-FN");
        declareMacro(me, "reset_sbhl_accessed_gather_nodes", "RESET-SBHL-ACCESSED-GATHER-NODES");
        declareMacro(me, "with_sbhl_dependents_cut_node", "WITH-SBHL-DEPENDENTS-CUT-NODE");
        declareFunction(me, "sbhl_dependents_cut_node_p", "SBHL-DEPENDENTS-CUT-NODE-P", 1, 0, false);
        declareMacro(me, "with_sbhl_access_arg", "WITH-SBHL-ACCESS-ARG");
        declareMacro(me, "with_sbhl_referent", "WITH-SBHL-REFERENT");
        declareMacro(me, "with_new_sbhl_leaf_queue", "WITH-NEW-SBHL-LEAF-QUEUE");
        declareMacro(me, "with_sbhl_sample_leaf_queues", "WITH-SBHL-SAMPLE-LEAF-QUEUES");
        declareFunction(me, "sbhl_leaf_sample_search_p", "SBHL-LEAF-SAMPLE-SEARCH-P", 0, 0, false);
        declareMacro(me, "do_sbhl_sample_leaf_queues", "DO-SBHL-SAMPLE-LEAF-QUEUES");
        declareFunction(me, "sbhl_extremal_test_fn_p", "SBHL-EXTREMAL-TEST-FN-P", 1, 0, false);
        declareMacro(me, "with_sbhl_extremal_test_fn", "WITH-SBHL-EXTREMAL-TEST-FN");
        declareFunction(me, "sbhl_check_for_goal_marking_p", "SBHL-CHECK-FOR-GOAL-MARKING-P", 0, 0, false);
        declareMacro(me, "with_sbhl_search_termination_on_previous_successes", "WITH-SBHL-SEARCH-TERMINATION-ON-PREVIOUS-SUCCESSES");
        declareMacro(me, "with_sbhl_precomputed_goal_space", "WITH-SBHL-PRECOMPUTED-GOAL-SPACE");
        declareMacro(me, "with_sbhl_true_search", "WITH-SBHL-TRUE-SEARCH");
        declareMacro(me, "with_sbhl_false_search", "WITH-SBHL-FALSE-SEARCH");
        declareFunction(me, "sbhl_true_search_p", "SBHL-TRUE-SEARCH-P", 0, 0, false);
        declareFunction(me, "sbhl_false_search_p", "SBHL-FALSE-SEARCH-P", 0, 0, false);
        declareFunction(me, "sbhl_search_truth_value_p", "SBHL-SEARCH-TRUTH-VALUE-P", 1, 0, false);
        declareFunction(me, "get_sbhl_true_tv", "GET-SBHL-TRUE-TV", 0, 0, false);
        declareFunction(me, "get_sbhl_false_tv", "GET-SBHL-FALSE-TV", 0, 0, false);
        declareFunction(me, "get_sbhl_tv", "GET-SBHL-TV", 0, 0, false);
        declareFunction(me, "relevant_sbhl_tv_is_everything", "RELEVANT-SBHL-TV-IS-EVERYTHING", 1, 0, false);
        declareFunction(me, "sbhl_tv_generalizes_to_general_tvP", "SBHL-TV-GENERALIZES-TO-GENERAL-TV?", 2, 0, false);
        declareFunction(me, "relevant_sbhl_tv_is_general_tv", "RELEVANT-SBHL-TV-IS-GENERAL-TV", 1, 0, false);
        new sbhl_search_vars.$relevant_sbhl_tv_is_general_tv$UnaryFunction();
        declareFunction(me, "relevant_sbhl_tvP", "RELEVANT-SBHL-TV?", 1, 0, false);
        declareFunction(me, "sbhl_true_tv_p", "SBHL-TRUE-TV-P", 1, 0, false);
        declareFunction(me, "sbhl_false_tv_p", "SBHL-FALSE-TV-P", 1, 0, false);
        declareFunction(me, "sbhl_opposite_or_nil_tv", "SBHL-OPPOSITE-OR-NIL-TV", 1, 0, false);
        declareFunction(me, "sbhl_opposite_tv", "SBHL-OPPOSITE-TV", 1, 0, false);
        declareFunction(me, "sbhl_true_tv", "SBHL-TRUE-TV", 1, 0, false);
        declareFunction(me, "sbhl_false_tv", "SBHL-FALSE-TV", 1, 0, false);
        declareFunction(me, "sbhl_search_true_tv", "SBHL-SEARCH-TRUE-TV", 0, 0, false);
        declareFunction(me, "sbhl_search_false_tv", "SBHL-SEARCH-FALSE-TV", 0, 0, false);
        declareFunction(me, "sbhl_translate_to_old_tv", "SBHL-TRANSLATE-TO-OLD-TV", 1, 0, false);
        declareFunction(me, "sbhl_possibly_translate_tv", "SBHL-POSSIBLY-TRANSLATE-TV", 1, 0, false);
        declareFunction(me, "sbhl_truth_to_support_truth", "SBHL-TRUTH-TO-SUPPORT-TRUTH", 1, 0, false);
        declareFunction(me, "support_truth_to_sbhl_truth", "SUPPORT-TRUTH-TO-SBHL-TRUTH", 1, 0, false);
        declareMacro(me, "with_sbhl_tv_function", "WITH-SBHL-TV-FUNCTION");
        declareMacro(me, "with_sbhl_tv", "WITH-SBHL-TV");
        declareMacro(me, "with_all_sbhl_tvs", "WITH-ALL-SBHL-TVS");
        declareMacro(me, "with_general_sbhl_tv", "WITH-GENERAL-SBHL-TV");
        declareMacro(me, "with_just_sbhl_tv", "WITH-JUST-SBHL-TV");
        declareMacro(me, "possibly_with_sbhl_tv", "POSSIBLY-WITH-SBHL-TV");
        declareMacro(me, "possibly_with_sbhl_true_tv", "POSSIBLY-WITH-SBHL-TRUE-TV");
        declareMacro(me, "possibly_with_sbhl_false_tv", "POSSIBLY-WITH-SBHL-FALSE-TV");
        declareMacro(me, "possibly_with_sbhl_mt_relevance", "POSSIBLY-WITH-SBHL-MT-RELEVANCE");
        return NIL;
    }

    public static SubLObject init_sbhl_search_vars_file() {
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

    

    public static final class $relevant_sbhl_tv_is_general_tv$UnaryFunction extends UnaryFunction {
        public $relevant_sbhl_tv_is_general_tv$UnaryFunction() {
            super(extractFunctionNamed("RELEVANT-SBHL-TV-IS-GENERAL-TV"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return relevant_sbhl_tv_is_general_tv(arg1);
        }
    }
}

/**
 * Total time: 464 ms
 */
