/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$suspend_type_checkingP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.fixnump;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import java.util.Iterator;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      GT-METHODS
 * source file: /cyc/top/cycl/gt-methods.lisp
 * created:     2019/07/03 17:37:35
 */
public final class gt_methods extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new gt_methods();



    private static final SubLSymbol GT_SUPERIORS = makeSymbol("GT-SUPERIORS");

    static private final SubLList $list4 = list(makeSymbol("PREDICATE"), makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    static private final SubLString $str5$Returns_direct_superiors_of_FORT_ = makeString("Returns direct superiors of FORT via transitive PREDICATE");

    static private final SubLList $list6 = list(list(makeSymbol("PREDICATE"), makeSymbol("FORT-P")), list(makeSymbol("FORT"), makeSymbol("GT-TERM-P")));

    static private final SubLList $list7 = list(list(makeSymbol("LIST"), makeSymbol("GT-TERM-P")));

    static private final SubLString $str11$invalid_gt_mode___a = makeString("invalid gt mode: ~a");

    private static final SubLSymbol GT_MIN_SUPERIORS = makeSymbol("GT-MIN-SUPERIORS");

    static private final SubLString $str16$Returns_minimal_superiors_of_FORT = makeString("Returns minimal superiors of FORT via transitive PREDICATE");

    private static final SubLSymbol GT_INFERIORS = makeSymbol("GT-INFERIORS");

    static private final SubLString $str19$Returns_direct_inferiors_of_FORT_ = makeString("Returns direct inferiors of FORT via transitive PREDICATE");

    private static final SubLSymbol GT_MAX_INFERIORS = makeSymbol("GT-MAX-INFERIORS");

    static private final SubLString $str24$Returns_maximal_inferiors_of_FORT = makeString("Returns maximal inferiors of FORT via transitive PREDICATE");

    private static final SubLSymbol GT_CO_SUPERIORS = makeSymbol("GT-CO-SUPERIORS");

    static private final SubLString $str27$Returns_sibling_direct_superiors_ = makeString("Returns sibling direct-superiors of direct-inferiors of FORT via PREDICATE, excluding FORT itself");

    private static final SubLSymbol GT_CO_INFERIORS = makeSymbol("GT-CO-INFERIORS");

    static private final SubLString $str30$Returns_sibling_direct_inferiors_ = makeString("Returns sibling direct-inferiors of direct-superiors of FORT via PREDICATE, excluding FORT itself");

    private static final SubLSymbol GT_REDUNDANT_SUPERIORS = makeSymbol("GT-REDUNDANT-SUPERIORS");

    static private final SubLString $str33$Returns_direct_superiors_of_FORT_ = makeString("Returns direct-superiors of FORT via PREDICATE that are subsumed by other superiors");

    private static final SubLSymbol GT_REDUNDANT_INFERIORS = makeSymbol("GT-REDUNDANT-INFERIORS");

    static private final SubLString $str36$Returns_direct_inferiors_of_FORT_ = makeString("Returns direct-inferiors of FORT via PREDICATE that subsumed other inferiors");

    private static final SubLSymbol GT_ALL_SUPERIORS = makeSymbol("GT-ALL-SUPERIORS");

    static private final SubLString $str39$Returns_all_superiors_of_FORT_via = makeString("Returns all superiors of FORT via PREDICATE");

    private static final SubLSymbol GT_ALL_INFERIORS = makeSymbol("GT-ALL-INFERIORS");

    static private final SubLString $str42$Returns_all_inferiors_of_FORT_via = makeString("Returns all inferiors of FORT via PREDICATE");

    private static final SubLSymbol $UNION_ALL_INFERIORS = makeKeyword("UNION-ALL-INFERIORS");

    private static final SubLSymbol GT_ALL_ACCESSIBLE = makeSymbol("GT-ALL-ACCESSIBLE");

    static private final SubLString $str46$Returns_all_superiors_and_all_inf = makeString("Returns all superiors and all inferiors of FORT via PREDICATE");

    private static final SubLSymbol GT_ROOTS = makeSymbol("GT-ROOTS");

    static private final SubLString $str51$Returns_maximal_superiors__i_e___ = makeString("Returns maximal superiors (i.e., roots) of FORT via PREDICATE");

    private static final SubLSymbol GT_LEAVES = makeSymbol("GT-LEAVES");

    static private final SubLString $str54$Returns_minimal_inferiors__i_e___ = makeString("Returns minimal inferiors (i.e., leaves) of FORT via PREDICATE");

    private static final SubLSymbol $COMPOSE_FN_SUPERIORS = makeKeyword("COMPOSE-FN-SUPERIORS");

    private static final SubLSymbol GT_COMPOSE_FN_ALL_SUPERIORS = makeSymbol("GT-COMPOSE-FN-ALL-SUPERIORS");

    static private final SubLList $list59 = list(makeSymbol("PREDICATE"), makeSymbol("FORT"), makeSymbol("FN"), makeSymbol("&OPTIONAL"), list(makeSymbol("COMBINE-FN"), list(makeSymbol("FUNCTION"), makeSymbol("CONS"))), makeSymbol("MT"));

    static private final SubLString $str60$Apply_fn_to_each_superior_of_FORT = makeString("Apply fn to each superior of FORT;\n   fn takes a fort as its only arg, and must not effect the search status of each\n  fort it visits");

    static private final SubLList $list61 = list(list(makeSymbol("PREDICATE"), makeSymbol("FORT-P")), list(makeSymbol("FORT"), makeSymbol("GT-TERM-P")), list(makeSymbol("FN"), makeSymbol("FUNCTION-SPEC-P")));

    private static final SubLSymbol $COMPOSE_FN_INFERIORS = makeKeyword("COMPOSE-FN-INFERIORS");

    private static final SubLSymbol GT_COMPOSE_FN_ALL_INFERIORS = makeSymbol("GT-COMPOSE-FN-ALL-INFERIORS");

    static private final SubLList $list64 = list(makeSymbol("PREDICATE"), makeSymbol("FORT"), makeSymbol("FN"), makeSymbol("&OPTIONAL"), list(makeSymbol("COMBINE-FN"), makeSymbol("*GT-COMBINE-FN*")), makeSymbol("MT"));

    static private final SubLString $str65$Apply_fn_to_each_inferior_of_FORT = makeString("Apply fn to each inferior of FORT; \n   fn takes a fort as its only arg, and \n   it must not effect the search status of each fort it visits");

    static private final SubLSymbol $sym66$PREDICATE_IN_ANY_MT_ = makeSymbol("PREDICATE-IN-ANY-MT?");

    private static final SubLSymbol $COMPOSE_PRED_SUPERIORS = makeKeyword("COMPOSE-PRED-SUPERIORS");

    private static final SubLSymbol GT_COMPOSE_PRED_ALL_SUPERIORS = makeSymbol("GT-COMPOSE-PRED-ALL-SUPERIORS");

    static private final SubLList $list69 = list(makeSymbol("PREDICATE"), makeSymbol("FORT"), makeSymbol("COMPOSE-PRED"), makeSymbol("&OPTIONAL"), list(makeSymbol("COMPOSE-INDEX-ARG"), makeSymbol("*GT-COMPOSE-INDEX-ARG*")), list(makeSymbol("COMPOSE-GATHER-ARG"), makeSymbol("*GT-COMPOSE-GATHER-ARG*")), makeSymbol("MT"));

    static private final SubLString $str70$Returns_all_nodes_accessible_by_C = makeString("Returns all nodes accessible by COMPOSE-PRED from each superior of FORT along \n  transitive PREDICATE");

    static private final SubLList $list71 = list(list(makeSymbol("PREDICATE"), makeSymbol("FORT-P")), list(makeSymbol("FORT"), makeSymbol("GT-TERM-P")), list(makeSymbol("COMPOSE-PRED"), makeSymbol("PREDICATE-IN-ANY-MT?")));

    private static final SubLSymbol $COMPOSE_PRED_INFERIORS = makeKeyword("COMPOSE-PRED-INFERIORS");

    private static final SubLSymbol GT_COMPOSE_PRED_ALL_INFERIORS = makeSymbol("GT-COMPOSE-PRED-ALL-INFERIORS");

    static private final SubLString $str75$Returns_all_nodes_accessible_by_C = makeString("Returns all nodes accessible by COMPOSE-PRED from each inferior of FORT along \n  transitive PREDICATE");

    private static final SubLSymbol $ALL_DEPENDENT_INFERIORS = makeKeyword("ALL-DEPENDENT-INFERIORS");

    private static final SubLSymbol GT_ALL_DEPENDENT_INFERIORS = makeSymbol("GT-ALL-DEPENDENT-INFERIORS");

    static private final SubLString $str78$Returns_all_inferiors_i_of_FORT_s = makeString("Returns all inferiors i of FORT s.t. every path connecting i to \n   any superior of FORT must pass through FORT");

    private static final SubLSymbol $kw81$WHY_SUPERIOR_ = makeKeyword("WHY-SUPERIOR?");

    static private final SubLSymbol $sym82$GT_WHY_SUPERIOR_ = makeSymbol("GT-WHY-SUPERIOR?");

    static private final SubLList $list83 = list(makeSymbol("PREDICATE"), makeSymbol("SUPERIOR"), makeSymbol("INFERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    static private final SubLString $str84$Returns_justification_of_why_SUPE = makeString("Returns justification of why SUPERIOR is superior to (i.e., hierarchically higher than) \n  INFERIOR");

    static private final SubLList $list85 = list(list(makeSymbol("PREDICATE"), makeSymbol("FORT-P")), list(makeSymbol("SUPERIOR"), makeSymbol("GT-TERM-P")), list(makeSymbol("INFERIOR"), makeSymbol("GT-TERM-P")));

    static private final SubLList $list86 = list(list(makeSymbol("LIST"), makeSymbol("ASSERTION-P")));





    private static final SubLSymbol $kw92$HAS_SUPERIOR_ = makeKeyword("HAS-SUPERIOR?");

    static private final SubLSymbol $sym93$GT_HAS_SUPERIOR_ = makeSymbol("GT-HAS-SUPERIOR?");

    static private final SubLList $list94 = list(makeSymbol("PREDICATE"), makeSymbol("INFERIOR"), makeSymbol("SUPERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    static private final SubLString $str95$Returns_whetherfort_INFERIOR_is_h = makeString("Returns whetherfort INFERIOR is hierarchically lower (wrt transitive PREDICATE) \n  to fort SUPERIOR?");

    static private final SubLList $list96 = list(list(makeSymbol("PREDICATE"), makeSymbol("FORT-P")), list(makeSymbol("INFERIOR"), makeSymbol("GT-TERM-P")), list(makeSymbol("SUPERIOR"), makeSymbol("GT-TERM-P")));

    static private final SubLList $list97 = list(makeSymbol("BOOLEANP"));

    static private final SubLSymbol $sym98$GT_HAS_INFERIOR_ = makeSymbol("GT-HAS-INFERIOR?");

    static private final SubLString $str99$Returns_whether_fort_SUPERIOR_is_ = makeString("Returns whether fort SUPERIOR is hierarchically higher \n   (wrt transitive PREDICATE) to fort INFERIOR?");

    static private final SubLSymbol $sym103$GT_CYCLES_ = makeSymbol("GT-CYCLES?");

    static private final SubLString $str104$Returns_whether_FORT_is_accessibl = makeString("Returns whether FORT is accessible from itself by one or more PREDICATE gafs?");

    private static final SubLSymbol $kw105$COMPLETES_CYCLE_ = makeKeyword("COMPLETES-CYCLE?");

    static private final SubLSymbol $sym106$GT_COMPLETES_CYCLE_ = makeSymbol("GT-COMPLETES-CYCLE?");

    static private final SubLList $list107 = list(makeSymbol("PREDICATE"), makeSymbol("FORT1"), makeSymbol("FORT2"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    static private final SubLString $str108$Returns_whether_a_transitive_path = makeString("Returns whether a transitive path connect FORT2 to FORT1, \n   or whether a transitive inverse path connect FORT1 to FORT2?");

    static private final SubLList $list109 = list(list(makeSymbol("PREDICATE"), makeSymbol("FORT-P")), list(makeSymbol("FORT1"), makeSymbol("GT-TERM-P")), list(makeSymbol("FORT2"), makeSymbol("GT-TERM-P")));

    private static final SubLSymbol $kw110$WHY_COMPLETES_CYCLE_ = makeKeyword("WHY-COMPLETES-CYCLE?");

    static private final SubLSymbol $sym111$GT_WHY_COMPLETES_CYCLE_ = makeSymbol("GT-WHY-COMPLETES-CYCLE?");

    static private final SubLString $str112$Returns_justification_that_a_tran = makeString("Returns justification that a transitive path connects FORT2 to FORT1, \n   or that a transitive inverse path connects FORT1 to FORT2?");

    private static final SubLSymbol GT_MIN_NODES = makeSymbol("GT-MIN-NODES");

    static private final SubLList $list116 = list(makeSymbol("PREDICATE"), makeSymbol("FORTS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    static private final SubLString $str117$Returns_returns_the_most_subordin = makeString("Returns returns the most-subordinate elements of FORTS\n   (one member only of a cycle will be a min-node candidate)");

    static private final SubLList $list118 = list(list(makeSymbol("PREDICATE"), makeSymbol("FORT-P")), list(makeSymbol("FORTS"), makeSymbol("LISTP")));

    static private final SubLSymbol $sym119$GT_SEARCHED_ = makeSymbol("GT-SEARCHED?");

    private static final SubLSymbol GT_MAX_NODES = makeSymbol("GT-MAX-NODES");

    static private final SubLList $list122 = list(makeSymbol("PREDICATE"), makeSymbol("FORTS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), list(makeSymbol("DIRECTION"), makeSymbol("*GT-MAX-NODES-DIRECTION*")));

    static private final SubLString $str123$Returns_returns_the_least_subordi = makeString("Returns returns the least-subordinate elements of FORTS\n   (<direction> should be :up unless all nodes are low in the hierarchy)");

    static private final SubLSymbol $sym127$MEMBER_ = makeSymbol("MEMBER?");

    private static final SubLSymbol GT_MIN_CEILINGS = makeSymbol("GT-MIN-CEILINGS");

    static private final SubLList $list130 = list(makeSymbol("PREDICATE"), makeSymbol("FORTS"), makeSymbol("&OPTIONAL"), makeSymbol("CANDIDATES"), makeSymbol("MT"));

    static private final SubLString $str131$Returns_the_most_subordinate_comm = makeString("Returns the most-subordinate common superiors of FORTS\n   (when CANDIDATES is non-nil, the result must subset it)");

    private static final SubLInteger $int$128 = makeInteger(128);

    private static final SubLSymbol GT_MAX_FLOORS = makeSymbol("GT-MAX-FLOORS");

    static private final SubLString $str135$Returns_the_least_subordinate_ele = makeString("Returns the least-subordinate elements or common inferiors of FORTS\n   (when CANDIDATES is non-nil, the result must subset it)");

    private static final SubLSymbol $MIN_SUPERIORS_EXCLUDING = makeKeyword("MIN-SUPERIORS-EXCLUDING");

    private static final SubLSymbol GT_MIN_SUPERIORS_EXCLUDING = makeSymbol("GT-MIN-SUPERIORS-EXCLUDING");

    static private final SubLString $str138$Returns_least_general_superiors_o = makeString("Returns least-general superiors of INFERIOR ignoring SUPERIOR\n   (useful for splicing-out SUPERIOR from hierarchy)");

    private static final SubLSymbol $MAX_INFERIORS_EXCLUDING = makeKeyword("MAX-INFERIORS-EXCLUDING");

    private static final SubLSymbol GT_MAX_INFERIORS_EXCLUDING = makeSymbol("GT-MAX-INFERIORS-EXCLUDING");

    static private final SubLString $str141$Returns_most_general_inferiors_of = makeString("Returns most-general inferiors of SUPERIOR ignoring INFERIOR (expensive)\n   (useful for splicing-out INFERIOR from hierarchy)");

    private static final SubLSymbol $ALL_SUPERIOR_EDGES = makeKeyword("ALL-SUPERIOR-EDGES");

    private static final SubLSymbol $ALL_INFERIOR_EDGES = makeKeyword("ALL-INFERIOR-EDGES");

    private static final SubLSymbol $SUPERIOR_IN_WHAT_MTS = makeKeyword("SUPERIOR-IN-WHAT-MTS");

    static private final SubLString $str147$illegal_value_for_method_of_which = makeString("illegal value for method of which-mts: ~s");



    private static final SubLSymbol $INFERIORS_WITH_MTS = makeKeyword("INFERIORS-WITH-MTS");





    static private final SubLString $$$before_gathering_instances = makeString("before gathering instances");

    private static final SubLSymbol ADD_RESULT_TO_GT_RESULT = makeSymbol("ADD-RESULT-TO-GT-RESULT");



    static private final SubLString $str157$after_instances__before_maximin = makeString("after instances, before maximin");

    static private final SubLString $$$after_maximin = makeString("after maximin");



    private static final SubLSymbol $ANY_SUPERIOR_PATH = makeKeyword("ANY-SUPERIOR-PATH");

    private static final SubLSymbol GT_ANY_SUPERIOR_PATH = makeSymbol("GT-ANY-SUPERIOR-PATH");

    static private final SubLString $str162$Returns_list_of_nodes_connecting_ = makeString("Returns list of nodes connecting INFERIOR with SUPERIOR");

    // Definitions
    /**
     * Returns direct superiors of FORT via transitive PREDICATE
     */
    @LispMethod(comment = "Returns direct superiors of FORT via transitive PREDICATE")
    public static final SubLObject gt_superiors_alt(SubLObject predicate, SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(predicate, FORT_P);
        SubLTrampolineFile.checkType(fort, GT_TERM_P);
        return transitivity.gtm(predicate, $SUPERIORS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    // Definitions
    /**
     * Returns direct superiors of FORT via transitive PREDICATE
     */
    @LispMethod(comment = "Returns direct superiors of FORT via transitive PREDICATE")
    public static SubLObject gt_superiors(final SubLObject predicate, final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(predicate, FORT_P);
        SubLTrampolineFile.enforceType(fort, GT_TERM_P);
        return transitivity.gtm(predicate, $SUPERIORS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns direct superiors of FORT
     */
    @LispMethod(comment = "Returns direct superiors of FORT")
    public static final SubLObject gtm_superiors_alt(SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject superiors = NIL;
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
                            SubLObject catch_var = NIL;
                            try {
                                if (!(((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) || (NIL != Errors.$ignore_mustsP$.getDynamicValue(thread)))) {
                                    gt_utilities.gt_check_type_internal(fort, $GT_INDEX, THREE_INTEGER);
                                }
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == gt_utilities.gt_modeP($SUPERIOR)) {
                                        Errors.error($str_alt11$invalid_gt_mode___a, $SUPERIOR);
                                    }
                                }
                                {
                                    SubLObject _prev_bind_0_1 = gt_vars.$gt_mode$.currentBinding(thread);
                                    try {
                                        gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                                        SubLTrampolineFile.checkType($TRUE, TRUTH_P);
                                        {
                                            SubLObject _prev_bind_0_2 = gt_vars.$gt_truth$.currentBinding(thread);
                                            try {
                                                gt_vars.$gt_truth$.bind($TRUE, thread);
                                                superiors = gt_search.gt_link_values(fort);
                                            } finally {
                                                gt_vars.$gt_truth$.rebind(_prev_bind_0_2, thread);
                                            }
                                        }
                                    } finally {
                                        gt_vars.$gt_mode$.rebind(_prev_bind_0_1, thread);
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return superiors;
            }
        }
    }

    /**
     * Returns direct superiors of FORT
     */
    @LispMethod(comment = "Returns direct superiors of FORT")
    public static SubLObject gtm_superiors(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject superiors = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($GT_ERROR);
                if (((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                    gt_utilities.gt_check_type_internal(fort, $GT_INDEX, THREE_INTEGER);
                }
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($SUPERIOR))) {
                    Errors.error($str11$invalid_gt_mode___a, $SUPERIOR);
                }
                final SubLObject _prev_bind_0_$1 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                    assert NIL != enumeration_types.truth_p($TRUE) : "! enumeration_types.truth_p( _KW.$TRUE) " + ("enumeration_types.truth_p(gt_methods.$kw12$TRUE) " + "CommonSymbols.NIL != enumeration_types.truth_p(gt_methods.$kw12$TRUE) ") + $TRUE;
                    final SubLObject _prev_bind_0_$2 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind($TRUE, thread);
                        superiors = gt_search.gt_link_values(fort);
                    } finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$2, thread);
                    }
                } finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$1, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return superiors;
    }

    /**
     * Returns minimal superiors of FORT via transitive PREDICATE
     */
    @LispMethod(comment = "Returns minimal superiors of FORT via transitive PREDICATE")
    public static final SubLObject gt_min_superiors_alt(SubLObject predicate, SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(predicate, FORT_P);
        SubLTrampolineFile.checkType(fort, GT_TERM_P);
        return transitivity.gtm(predicate, $MIN_SUPERIORS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns minimal superiors of FORT via transitive PREDICATE
     */
    @LispMethod(comment = "Returns minimal superiors of FORT via transitive PREDICATE")
    public static SubLObject gt_min_superiors(final SubLObject predicate, final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(predicate, FORT_P);
        SubLTrampolineFile.enforceType(fort, GT_TERM_P);
        return transitivity.gtm(predicate, $MIN_SUPERIORS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns minimum superiors of FORT
     */
    @LispMethod(comment = "Returns minimum superiors of FORT")
    public static final SubLObject gtm_min_superiors_alt(SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.gt_methods.gtm_min_nodes(com.cyc.cycjava.cycl.gt_methods.gtm_superiors(fort, mt), mt);
    }

    /**
     * Returns minimum superiors of FORT
     */
    @LispMethod(comment = "Returns minimum superiors of FORT")
    public static SubLObject gtm_min_superiors(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return gtm_min_nodes(gtm_superiors(fort, mt), mt);
    }

    /**
     * Returns direct inferiors of FORT via transitive PREDICATE
     */
    @LispMethod(comment = "Returns direct inferiors of FORT via transitive PREDICATE")
    public static final SubLObject gt_inferiors_alt(SubLObject predicate, SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(predicate, FORT_P);
        SubLTrampolineFile.checkType(fort, GT_TERM_P);
        return transitivity.gtm(predicate, $INFERIORS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns direct inferiors of FORT via transitive PREDICATE
     */
    @LispMethod(comment = "Returns direct inferiors of FORT via transitive PREDICATE")
    public static SubLObject gt_inferiors(final SubLObject predicate, final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(predicate, FORT_P);
        SubLTrampolineFile.enforceType(fort, GT_TERM_P);
        return transitivity.gtm(predicate, $INFERIORS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns direct inferiors of FORT
     */
    @LispMethod(comment = "Returns direct inferiors of FORT")
    public static final SubLObject gtm_inferiors_alt(SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject inferiors = NIL;
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
                            SubLObject catch_var = NIL;
                            try {
                                if (!(((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) || (NIL != Errors.$ignore_mustsP$.getDynamicValue(thread)))) {
                                    gt_utilities.gt_check_type_internal(fort, $GT_GATHER, THREE_INTEGER);
                                }
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == gt_utilities.gt_modeP($INFERIOR)) {
                                        Errors.error($str_alt11$invalid_gt_mode___a, $INFERIOR);
                                    }
                                }
                                {
                                    SubLObject _prev_bind_0_3 = gt_vars.$gt_mode$.currentBinding(thread);
                                    try {
                                        gt_vars.$gt_mode$.bind($INFERIOR, thread);
                                        SubLTrampolineFile.checkType($TRUE, TRUTH_P);
                                        {
                                            SubLObject _prev_bind_0_4 = gt_vars.$gt_truth$.currentBinding(thread);
                                            try {
                                                gt_vars.$gt_truth$.bind($TRUE, thread);
                                                inferiors = gt_search.gt_link_values(fort);
                                            } finally {
                                                gt_vars.$gt_truth$.rebind(_prev_bind_0_4, thread);
                                            }
                                        }
                                    } finally {
                                        gt_vars.$gt_mode$.rebind(_prev_bind_0_3, thread);
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return inferiors;
            }
        }
    }

    /**
     * Returns direct inferiors of FORT
     */
    @LispMethod(comment = "Returns direct inferiors of FORT")
    public static SubLObject gtm_inferiors(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject inferiors = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($GT_ERROR);
                if (((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                    gt_utilities.gt_check_type_internal(fort, $GT_GATHER, THREE_INTEGER);
                }
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($INFERIOR))) {
                    Errors.error($str11$invalid_gt_mode___a, $INFERIOR);
                }
                final SubLObject _prev_bind_0_$3 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind($INFERIOR, thread);
                    assert NIL != enumeration_types.truth_p($TRUE) : "! enumeration_types.truth_p( _KW.$TRUE) " + ("enumeration_types.truth_p(gt_methods.$kw12$TRUE) " + "CommonSymbols.NIL != enumeration_types.truth_p(gt_methods.$kw12$TRUE) ") + $TRUE;
                    final SubLObject _prev_bind_0_$4 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind($TRUE, thread);
                        inferiors = gt_search.gt_link_values(fort);
                    } finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$4, thread);
                    }
                } finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$3, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return inferiors;
    }

    /**
     * Returns maximal inferiors of FORT via transitive PREDICATE
     */
    @LispMethod(comment = "Returns maximal inferiors of FORT via transitive PREDICATE")
    public static final SubLObject gt_max_inferiors_alt(SubLObject predicate, SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(predicate, FORT_P);
        SubLTrampolineFile.checkType(fort, GT_TERM_P);
        return transitivity.gtm(predicate, $MAX_INFERIORS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns maximal inferiors of FORT via transitive PREDICATE
     */
    @LispMethod(comment = "Returns maximal inferiors of FORT via transitive PREDICATE")
    public static SubLObject gt_max_inferiors(final SubLObject predicate, final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(predicate, FORT_P);
        SubLTrampolineFile.enforceType(fort, GT_TERM_P);
        return transitivity.gtm(predicate, $MAX_INFERIORS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns maximal inferiors of FORT
     */
    @LispMethod(comment = "Returns maximal inferiors of FORT")
    public static final SubLObject gtm_max_inferiors_alt(SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.gt_methods.gtm_max_nodes(com.cyc.cycjava.cycl.gt_methods.gtm_inferiors(fort, mt), mt, UNPROVIDED);
    }

    /**
     * Returns maximal inferiors of FORT
     */
    @LispMethod(comment = "Returns maximal inferiors of FORT")
    public static SubLObject gtm_max_inferiors(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return gtm_max_nodes(gtm_inferiors(fort, mt), mt, UNPROVIDED);
    }

    /**
     * Returns sibling direct-superiors of direct-inferiors of FORT via PREDICATE, excluding FORT itself
     */
    @LispMethod(comment = "Returns sibling direct-superiors of direct-inferiors of FORT via PREDICATE, excluding FORT itself")
    public static final SubLObject gt_co_superiors_alt(SubLObject predicate, SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(predicate, FORT_P);
        SubLTrampolineFile.checkType(fort, GT_TERM_P);
        return transitivity.gtm(predicate, $CO_SUPERIORS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns sibling direct-superiors of direct-inferiors of FORT via PREDICATE, excluding FORT itself
     */
    @LispMethod(comment = "Returns sibling direct-superiors of direct-inferiors of FORT via PREDICATE, excluding FORT itself")
    public static SubLObject gt_co_superiors(final SubLObject predicate, final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(predicate, FORT_P);
        SubLTrampolineFile.enforceType(fort, GT_TERM_P);
        return transitivity.gtm(predicate, $CO_SUPERIORS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns sibling direct-superiors of direct-inferiors of FORT
     */
    @LispMethod(comment = "Returns sibling direct-superiors of direct-inferiors of FORT")
    public static final SubLObject gtm_co_superiors_alt(SubLObject fort, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = $TRUE;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject co_superiors = NIL;
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
                            SubLObject catch_var = NIL;
                            try {
                                if (!(((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) || (NIL != Errors.$ignore_mustsP$.getDynamicValue(thread)))) {
                                    gt_utilities.gt_check_type_internal(fort, $GT_GATHER, THREE_INTEGER);
                                }
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == gt_utilities.gt_modeP($INFERIOR)) {
                                        Errors.error($str_alt11$invalid_gt_mode___a, $INFERIOR);
                                    }
                                }
                                {
                                    SubLObject _prev_bind_0_5 = gt_vars.$gt_mode$.currentBinding(thread);
                                    try {
                                        gt_vars.$gt_mode$.bind($INFERIOR, thread);
                                        SubLTrampolineFile.checkType(tv, TRUTH_P);
                                        {
                                            SubLObject _prev_bind_0_6 = gt_vars.$gt_truth$.currentBinding(thread);
                                            try {
                                                gt_vars.$gt_truth$.bind(tv, thread);
                                                co_superiors = remove(fort, com.cyc.cycjava.cycl.gt_methods.gtm_min_nodes(gt_search.gt_siblings(fort), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } finally {
                                                gt_vars.$gt_truth$.rebind(_prev_bind_0_6, thread);
                                            }
                                        }
                                    } finally {
                                        gt_vars.$gt_mode$.rebind(_prev_bind_0_5, thread);
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return co_superiors;
            }
        }
    }

    /**
     * Returns sibling direct-superiors of direct-inferiors of FORT
     */
    @LispMethod(comment = "Returns sibling direct-superiors of direct-inferiors of FORT")
    public static SubLObject gtm_co_superiors(final SubLObject fort, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject co_superiors = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($GT_ERROR);
                if (((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                    gt_utilities.gt_check_type_internal(fort, $GT_GATHER, THREE_INTEGER);
                }
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($INFERIOR))) {
                    Errors.error($str11$invalid_gt_mode___a, $INFERIOR);
                }
                final SubLObject _prev_bind_0_$5 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind($INFERIOR, thread);
                    assert NIL != enumeration_types.truth_p(tv) : "! enumeration_types.truth_p(tv) " + ("enumeration_types.truth_p(tv) " + "CommonSymbols.NIL != enumeration_types.truth_p(tv) ") + tv;
                    final SubLObject _prev_bind_0_$6 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind(tv, thread);
                        co_superiors = remove(fort, gtm_min_nodes(gt_search.gt_siblings(fort), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$6, thread);
                    }
                } finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$5, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return co_superiors;
    }

    /**
     * Returns sibling direct-inferiors of direct-superiors of FORT via PREDICATE, excluding FORT itself
     */
    @LispMethod(comment = "Returns sibling direct-inferiors of direct-superiors of FORT via PREDICATE, excluding FORT itself")
    public static final SubLObject gt_co_inferiors_alt(SubLObject predicate, SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(predicate, FORT_P);
        SubLTrampolineFile.checkType(fort, GT_TERM_P);
        return transitivity.gtm(predicate, $CO_INFERIORS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns sibling direct-inferiors of direct-superiors of FORT via PREDICATE, excluding FORT itself
     */
    @LispMethod(comment = "Returns sibling direct-inferiors of direct-superiors of FORT via PREDICATE, excluding FORT itself")
    public static SubLObject gt_co_inferiors(final SubLObject predicate, final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(predicate, FORT_P);
        SubLTrampolineFile.enforceType(fort, GT_TERM_P);
        return transitivity.gtm(predicate, $CO_INFERIORS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns sibling direct-inferiors of direct-superiors of FORT
     */
    @LispMethod(comment = "Returns sibling direct-inferiors of direct-superiors of FORT")
    public static final SubLObject gtm_co_inferiors_alt(SubLObject fort, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = $TRUE;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject co_inferiors = NIL;
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
                            SubLObject catch_var = NIL;
                            try {
                                if (!(((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) || (NIL != Errors.$ignore_mustsP$.getDynamicValue(thread)))) {
                                    gt_utilities.gt_check_type_internal(fort, $GT_INDEX, THREE_INTEGER);
                                }
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == gt_utilities.gt_modeP($SUPERIOR)) {
                                        Errors.error($str_alt11$invalid_gt_mode___a, $SUPERIOR);
                                    }
                                }
                                {
                                    SubLObject _prev_bind_0_7 = gt_vars.$gt_mode$.currentBinding(thread);
                                    try {
                                        gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                                        SubLTrampolineFile.checkType(tv, TRUTH_P);
                                        {
                                            SubLObject _prev_bind_0_8 = gt_vars.$gt_truth$.currentBinding(thread);
                                            try {
                                                gt_vars.$gt_truth$.bind(tv, thread);
                                                co_inferiors = remove(fort, com.cyc.cycjava.cycl.gt_methods.gtm_max_nodes(gt_search.gt_siblings(fort), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } finally {
                                                gt_vars.$gt_truth$.rebind(_prev_bind_0_8, thread);
                                            }
                                        }
                                    } finally {
                                        gt_vars.$gt_mode$.rebind(_prev_bind_0_7, thread);
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return co_inferiors;
            }
        }
    }

    /**
     * Returns sibling direct-inferiors of direct-superiors of FORT
     */
    @LispMethod(comment = "Returns sibling direct-inferiors of direct-superiors of FORT")
    public static SubLObject gtm_co_inferiors(final SubLObject fort, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject co_inferiors = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($GT_ERROR);
                if (((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                    gt_utilities.gt_check_type_internal(fort, $GT_INDEX, THREE_INTEGER);
                }
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($SUPERIOR))) {
                    Errors.error($str11$invalid_gt_mode___a, $SUPERIOR);
                }
                final SubLObject _prev_bind_0_$7 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                    assert NIL != enumeration_types.truth_p(tv) : "! enumeration_types.truth_p(tv) " + ("enumeration_types.truth_p(tv) " + "CommonSymbols.NIL != enumeration_types.truth_p(tv) ") + tv;
                    final SubLObject _prev_bind_0_$8 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind(tv, thread);
                        co_inferiors = remove(fort, gtm_max_nodes(gt_search.gt_siblings(fort), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$8, thread);
                    }
                } finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$7, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return co_inferiors;
    }

    /**
     * Returns direct-superiors of FORT via PREDICATE that are subsumed by other superiors
     */
    @LispMethod(comment = "Returns direct-superiors of FORT via PREDICATE that are subsumed by other superiors")
    public static final SubLObject gt_redundant_superiors_alt(SubLObject predicate, SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(predicate, FORT_P);
        SubLTrampolineFile.checkType(fort, GT_TERM_P);
        return transitivity.gtm(predicate, $REDUNDANT_SUPERIORS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns direct-superiors of FORT via PREDICATE that are subsumed by other superiors
     */
    @LispMethod(comment = "Returns direct-superiors of FORT via PREDICATE that are subsumed by other superiors")
    public static SubLObject gt_redundant_superiors(final SubLObject predicate, final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(predicate, FORT_P);
        SubLTrampolineFile.enforceType(fort, GT_TERM_P);
        return transitivity.gtm(predicate, $REDUNDANT_SUPERIORS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns direct-superiors of FORT that are subsumed by other superiors
     */
    @LispMethod(comment = "Returns direct-superiors of FORT that are subsumed by other superiors")
    public static final SubLObject gtm_redundant_superiors_alt(SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject redundants = NIL;
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
                            SubLObject catch_var = NIL;
                            try {
                                if (!(((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) || (NIL != Errors.$ignore_mustsP$.getDynamicValue(thread)))) {
                                    gt_utilities.gt_check_type_internal(fort, $GT_INDEX, THREE_INTEGER);
                                }
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == gt_utilities.gt_modeP($SUPERIOR)) {
                                        Errors.error($str_alt11$invalid_gt_mode___a, $SUPERIOR);
                                    }
                                }
                                {
                                    SubLObject _prev_bind_0_9 = gt_vars.$gt_mode$.currentBinding(thread);
                                    try {
                                        gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                                        {
                                            SubLObject superiors = gt_search.gt_link_values(fort);
                                            redundants = set_difference(superiors, com.cyc.cycjava.cycl.gt_methods.gtm_min_nodes(superiors, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                                        }
                                    } finally {
                                        gt_vars.$gt_mode$.rebind(_prev_bind_0_9, thread);
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return redundants;
            }
        }
    }

    /**
     * Returns direct-superiors of FORT that are subsumed by other superiors
     */
    @LispMethod(comment = "Returns direct-superiors of FORT that are subsumed by other superiors")
    public static SubLObject gtm_redundant_superiors(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject redundants = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($GT_ERROR);
                if (((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                    gt_utilities.gt_check_type_internal(fort, $GT_INDEX, THREE_INTEGER);
                }
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($SUPERIOR))) {
                    Errors.error($str11$invalid_gt_mode___a, $SUPERIOR);
                }
                final SubLObject _prev_bind_0_$9 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                    final SubLObject superiors = gt_search.gt_link_values(fort);
                    redundants = set_difference(superiors, gtm_min_nodes(superiors, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                } finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$9, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return redundants;
    }

    /**
     * Returns direct-inferiors of FORT via PREDICATE that subsumed other inferiors
     */
    @LispMethod(comment = "Returns direct-inferiors of FORT via PREDICATE that subsumed other inferiors")
    public static final SubLObject gt_redundant_inferiors_alt(SubLObject predicate, SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(predicate, FORT_P);
        SubLTrampolineFile.checkType(fort, GT_TERM_P);
        return transitivity.gtm(predicate, $REDUNDANT_INFERIORS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns direct-inferiors of FORT via PREDICATE that subsumed other inferiors
     */
    @LispMethod(comment = "Returns direct-inferiors of FORT via PREDICATE that subsumed other inferiors")
    public static SubLObject gt_redundant_inferiors(final SubLObject predicate, final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(predicate, FORT_P);
        SubLTrampolineFile.enforceType(fort, GT_TERM_P);
        return transitivity.gtm(predicate, $REDUNDANT_INFERIORS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns direct-inferiors of FORT that are supersumed by other inferiors
     */
    @LispMethod(comment = "Returns direct-inferiors of FORT that are supersumed by other inferiors")
    public static final SubLObject gtm_redundant_inferiors_alt(SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject redundants = NIL;
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
                            SubLObject catch_var = NIL;
                            try {
                                if (!(((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) || (NIL != Errors.$ignore_mustsP$.getDynamicValue(thread)))) {
                                    gt_utilities.gt_check_type_internal(fort, $GT_GATHER, THREE_INTEGER);
                                }
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == gt_utilities.gt_modeP($INFERIOR)) {
                                        Errors.error($str_alt11$invalid_gt_mode___a, $INFERIOR);
                                    }
                                }
                                {
                                    SubLObject _prev_bind_0_10 = gt_vars.$gt_mode$.currentBinding(thread);
                                    try {
                                        gt_vars.$gt_mode$.bind($INFERIOR, thread);
                                        {
                                            SubLObject inferiors = gt_search.gt_link_values(fort);
                                            redundants = set_difference(inferiors, com.cyc.cycjava.cycl.gt_methods.gtm_max_nodes(inferiors, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                                        }
                                    } finally {
                                        gt_vars.$gt_mode$.rebind(_prev_bind_0_10, thread);
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return redundants;
            }
        }
    }

    /**
     * Returns direct-inferiors of FORT that are supersumed by other inferiors
     */
    @LispMethod(comment = "Returns direct-inferiors of FORT that are supersumed by other inferiors")
    public static SubLObject gtm_redundant_inferiors(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject redundants = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($GT_ERROR);
                if (((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                    gt_utilities.gt_check_type_internal(fort, $GT_GATHER, THREE_INTEGER);
                }
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($INFERIOR))) {
                    Errors.error($str11$invalid_gt_mode___a, $INFERIOR);
                }
                final SubLObject _prev_bind_0_$10 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind($INFERIOR, thread);
                    final SubLObject inferiors = gt_search.gt_link_values(fort);
                    redundants = set_difference(inferiors, gtm_max_nodes(inferiors, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                } finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$10, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return redundants;
    }

    /**
     * Returns all superiors of FORT via PREDICATE
     */
    @LispMethod(comment = "Returns all superiors of FORT via PREDICATE")
    public static final SubLObject gt_all_superiors_alt(SubLObject predicate, SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(predicate, FORT_P);
        SubLTrampolineFile.checkType(fort, GT_TERM_P);
        return transitivity.gtm(predicate, $ALL_SUPERIORS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns all superiors of FORT via PREDICATE
     */
    @LispMethod(comment = "Returns all superiors of FORT via PREDICATE")
    public static SubLObject gt_all_superiors(final SubLObject predicate, final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(predicate, FORT_P);
        SubLTrampolineFile.enforceType(fort, GT_TERM_P);
        return transitivity.gtm(predicate, $ALL_SUPERIORS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns all superiors of FORT
     */
    @LispMethod(comment = "Returns all superiors of FORT")
    public static final SubLObject gtm_all_superiors_alt(SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject superiors = NIL;
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
                            SubLObject catch_var = NIL;
                            try {
                                if (!(((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) || (NIL != Errors.$ignore_mustsP$.getDynamicValue(thread)))) {
                                    gt_utilities.gt_check_type_internal(fort, $GT_INDEX, THREE_INTEGER);
                                }
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == gt_utilities.gt_modeP($SUPERIOR)) {
                                        Errors.error($str_alt11$invalid_gt_mode___a, $SUPERIOR);
                                    }
                                }
                                {
                                    SubLObject _prev_bind_0_11 = gt_vars.$gt_mode$.currentBinding(thread);
                                    try {
                                        gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                                        SubLTrampolineFile.checkType($TRUE, TRUTH_P);
                                        {
                                            SubLObject _prev_bind_0_12 = gt_vars.$gt_truth$.currentBinding(thread);
                                            try {
                                                gt_vars.$gt_truth$.bind($TRUE, thread);
                                                superiors = gt_search.gt_all_accessed(fort);
                                            } finally {
                                                gt_vars.$gt_truth$.rebind(_prev_bind_0_12, thread);
                                            }
                                        }
                                    } finally {
                                        gt_vars.$gt_mode$.rebind(_prev_bind_0_11, thread);
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return superiors;
            }
        }
    }

    /**
     * Returns all superiors of FORT
     */
    @LispMethod(comment = "Returns all superiors of FORT")
    public static SubLObject gtm_all_superiors(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject superiors = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($GT_ERROR);
                if (((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                    gt_utilities.gt_check_type_internal(fort, $GT_INDEX, THREE_INTEGER);
                }
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($SUPERIOR))) {
                    Errors.error($str11$invalid_gt_mode___a, $SUPERIOR);
                }
                final SubLObject _prev_bind_0_$11 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                    assert NIL != enumeration_types.truth_p($TRUE) : "! enumeration_types.truth_p( _KW.$TRUE) " + ("enumeration_types.truth_p(gt_methods.$kw12$TRUE) " + "CommonSymbols.NIL != enumeration_types.truth_p(gt_methods.$kw12$TRUE) ") + $TRUE;
                    final SubLObject _prev_bind_0_$12 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind($TRUE, thread);
                        superiors = gt_search.gt_all_accessed(fort);
                    } finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$12, thread);
                    }
                } finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$11, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return superiors;
    }

    /**
     * Returns all inferiors of FORT via PREDICATE
     */
    @LispMethod(comment = "Returns all inferiors of FORT via PREDICATE")
    public static final SubLObject gt_all_inferiors_alt(SubLObject predicate, SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(predicate, FORT_P);
        SubLTrampolineFile.checkType(fort, GT_TERM_P);
        return transitivity.gtm(predicate, $ALL_INFERIORS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns all inferiors of FORT via PREDICATE
     */
    @LispMethod(comment = "Returns all inferiors of FORT via PREDICATE")
    public static SubLObject gt_all_inferiors(final SubLObject predicate, final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(predicate, FORT_P);
        SubLTrampolineFile.enforceType(fort, GT_TERM_P);
        return transitivity.gtm(predicate, $ALL_INFERIORS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns all inferiors of FORT
     */
    @LispMethod(comment = "Returns all inferiors of FORT")
    public static final SubLObject gtm_all_inferiors_alt(SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject inferiors = NIL;
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
                            SubLObject catch_var = NIL;
                            try {
                                if (!(((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) || (NIL != Errors.$ignore_mustsP$.getDynamicValue(thread)))) {
                                    gt_utilities.gt_check_type_internal(fort, $GT_GATHER, THREE_INTEGER);
                                }
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == gt_utilities.gt_modeP($INFERIOR)) {
                                        Errors.error($str_alt11$invalid_gt_mode___a, $INFERIOR);
                                    }
                                }
                                {
                                    SubLObject _prev_bind_0_13 = gt_vars.$gt_mode$.currentBinding(thread);
                                    try {
                                        gt_vars.$gt_mode$.bind($INFERIOR, thread);
                                        SubLTrampolineFile.checkType($TRUE, TRUTH_P);
                                        {
                                            SubLObject _prev_bind_0_14 = gt_vars.$gt_truth$.currentBinding(thread);
                                            try {
                                                gt_vars.$gt_truth$.bind($TRUE, thread);
                                                inferiors = gt_search.gt_all_accessed(fort);
                                            } finally {
                                                gt_vars.$gt_truth$.rebind(_prev_bind_0_14, thread);
                                            }
                                        }
                                    } finally {
                                        gt_vars.$gt_mode$.rebind(_prev_bind_0_13, thread);
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return inferiors;
            }
        }
    }

    /**
     * Returns all inferiors of FORT
     */
    @LispMethod(comment = "Returns all inferiors of FORT")
    public static SubLObject gtm_all_inferiors(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject inferiors = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($GT_ERROR);
                if (((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                    gt_utilities.gt_check_type_internal(fort, $GT_GATHER, THREE_INTEGER);
                }
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($INFERIOR))) {
                    Errors.error($str11$invalid_gt_mode___a, $INFERIOR);
                }
                final SubLObject _prev_bind_0_$13 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind($INFERIOR, thread);
                    assert NIL != enumeration_types.truth_p($TRUE) : "! enumeration_types.truth_p( _KW.$TRUE) " + ("enumeration_types.truth_p(gt_methods.$kw12$TRUE) " + "CommonSymbols.NIL != enumeration_types.truth_p(gt_methods.$kw12$TRUE) ") + $TRUE;
                    final SubLObject _prev_bind_0_$14 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind($TRUE, thread);
                        inferiors = gt_search.gt_all_accessed(fort);
                    } finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$14, thread);
                    }
                } finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$13, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return inferiors;
    }

    public static final SubLObject gt_union_all_inferiors_alt(SubLObject predicate, SubLObject v_forts, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return transitivity.gtm(predicate, $UNION_ALL_INFERIORS, v_forts, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject gt_union_all_inferiors(final SubLObject predicate, final SubLObject v_forts, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return transitivity.gtm(predicate, $UNION_ALL_INFERIORS, v_forts, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject gtm_union_all_inferiors_alt(SubLObject v_forts, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject inferiors = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == gt_utilities.gt_modeP($INFERIOR)) {
                                Errors.error($str_alt11$invalid_gt_mode___a, $INFERIOR);
                            }
                        }
                        {
                            SubLObject _prev_bind_0_15 = gt_vars.$gt_mode$.currentBinding(thread);
                            try {
                                gt_vars.$gt_mode$.bind($INFERIOR, thread);
                                SubLTrampolineFile.checkType($TRUE, TRUTH_P);
                                {
                                    SubLObject _prev_bind_0_16 = gt_vars.$gt_truth$.currentBinding(thread);
                                    try {
                                        gt_vars.$gt_truth$.bind($TRUE, thread);
                                        {
                                            SubLObject cdolist_list_var = v_forts;
                                            SubLObject fort = NIL;
                                            for (fort = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , fort = cdolist_list_var.first()) {
                                                gt_search.gt_mark_all_accessed_as_searched(fort);
                                            }
                                        }
                                    } finally {
                                        gt_vars.$gt_truth$.rebind(_prev_bind_0_16, thread);
                                    }
                                }
                            } finally {
                                gt_vars.$gt_mode$.rebind(_prev_bind_0_15, thread);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                inferiors = hash_table_utilities.hash_table_keys(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                return inferiors;
            }
        }
    }

    public static SubLObject gtm_union_all_inferiors(final SubLObject v_forts, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject inferiors = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($INFERIOR))) {
                Errors.error($str11$invalid_gt_mode___a, $INFERIOR);
            }
            final SubLObject _prev_bind_0_$15 = gt_vars.$gt_mode$.currentBinding(thread);
            try {
                gt_vars.$gt_mode$.bind($INFERIOR, thread);
                assert NIL != enumeration_types.truth_p($TRUE) : "! enumeration_types.truth_p( _KW.$TRUE) " + ("enumeration_types.truth_p(gt_methods.$kw12$TRUE) " + "CommonSymbols.NIL != enumeration_types.truth_p(gt_methods.$kw12$TRUE) ") + $TRUE;
                final SubLObject _prev_bind_0_$16 = gt_vars.$gt_truth$.currentBinding(thread);
                try {
                    gt_vars.$gt_truth$.bind($TRUE, thread);
                    SubLObject cdolist_list_var = v_forts;
                    SubLObject fort = NIL;
                    fort = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        gt_search.gt_mark_all_accessed_as_searched(fort);
                        cdolist_list_var = cdolist_list_var.rest();
                        fort = cdolist_list_var.first();
                    } 
                } finally {
                    gt_vars.$gt_truth$.rebind(_prev_bind_0_$16, thread);
                }
            } finally {
                gt_vars.$gt_mode$.rebind(_prev_bind_0_$15, thread);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        inferiors = hash_table_utilities.hash_table_keys(gt_vars.$gt_marking_table$.getDynamicValue(thread));
        return inferiors;
    }

    /**
     * Returns all superiors and all inferiors of FORT via PREDICATE
     */
    @LispMethod(comment = "Returns all superiors and all inferiors of FORT via PREDICATE")
    public static final SubLObject gt_all_accessible_alt(SubLObject predicate, SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(predicate, FORT_P);
        SubLTrampolineFile.checkType(fort, GT_TERM_P);
        return transitivity.gtm(predicate, $ALL_ACCESSIBLE, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns all superiors and all inferiors of FORT via PREDICATE
     */
    @LispMethod(comment = "Returns all superiors and all inferiors of FORT via PREDICATE")
    public static SubLObject gt_all_accessible(final SubLObject predicate, final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(predicate, FORT_P);
        SubLTrampolineFile.enforceType(fort, GT_TERM_P);
        return transitivity.gtm(predicate, $ALL_ACCESSIBLE, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns all superiors and inferiors of FORT
     */
    @LispMethod(comment = "Returns all superiors and inferiors of FORT")
    public static final SubLObject gtm_all_accessible_alt(SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject accessed = NIL;
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
                            SubLObject catch_var = NIL;
                            try {
                                if (!(((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) || (NIL != Errors.$ignore_mustsP$.getDynamicValue(thread)))) {
                                    gt_utilities.gt_check_type_internal(fort, $GT_EITHER, THREE_INTEGER);
                                }
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == gt_utilities.gt_modeP($ACCESSIBLE)) {
                                        Errors.error($str_alt11$invalid_gt_mode___a, $ACCESSIBLE);
                                    }
                                }
                                {
                                    SubLObject _prev_bind_0_17 = gt_vars.$gt_mode$.currentBinding(thread);
                                    try {
                                        gt_vars.$gt_mode$.bind($ACCESSIBLE, thread);
                                        SubLTrampolineFile.checkType($TRUE, TRUTH_P);
                                        {
                                            SubLObject _prev_bind_0_18 = gt_vars.$gt_truth$.currentBinding(thread);
                                            try {
                                                gt_vars.$gt_truth$.bind($TRUE, thread);
                                                accessed = list_utilities.remove_duplicate_forts(gt_search.gt_all_accessed(fort));
                                            } finally {
                                                gt_vars.$gt_truth$.rebind(_prev_bind_0_18, thread);
                                            }
                                        }
                                    } finally {
                                        gt_vars.$gt_mode$.rebind(_prev_bind_0_17, thread);
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return accessed;
            }
        }
    }

    /**
     * Returns all superiors and inferiors of FORT
     */
    @LispMethod(comment = "Returns all superiors and inferiors of FORT")
    public static SubLObject gtm_all_accessible(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject accessed = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($GT_ERROR);
                if (((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                    gt_utilities.gt_check_type_internal(fort, $GT_EITHER, THREE_INTEGER);
                }
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($ACCESSIBLE))) {
                    Errors.error($str11$invalid_gt_mode___a, $ACCESSIBLE);
                }
                final SubLObject _prev_bind_0_$17 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind($ACCESSIBLE, thread);
                    assert NIL != enumeration_types.truth_p($TRUE) : "! enumeration_types.truth_p( _KW.$TRUE) " + ("enumeration_types.truth_p(gt_methods.$kw12$TRUE) " + "CommonSymbols.NIL != enumeration_types.truth_p(gt_methods.$kw12$TRUE) ") + $TRUE;
                    final SubLObject _prev_bind_0_$18 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind($TRUE, thread);
                        accessed = list_utilities.remove_duplicate_forts(gt_search.gt_all_accessed(fort));
                    } finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$18, thread);
                    }
                } finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$17, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return accessed;
    }

    /**
     * Returns maximal superiors (i.e., roots) of FORT via PREDICATE
     */
    @LispMethod(comment = "Returns maximal superiors (i.e., roots) of FORT via PREDICATE")
    public static final SubLObject gt_roots_alt(SubLObject predicate, SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(predicate, FORT_P);
        SubLTrampolineFile.checkType(fort, GT_TERM_P);
        return transitivity.gtm(predicate, $ROOTS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns maximal superiors (i.e., roots) of FORT via PREDICATE
     */
    @LispMethod(comment = "Returns maximal superiors (i.e., roots) of FORT via PREDICATE")
    public static SubLObject gt_roots(final SubLObject predicate, final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(predicate, FORT_P);
        SubLTrampolineFile.enforceType(fort, GT_TERM_P);
        return transitivity.gtm(predicate, $ROOTS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns returns the maximal positive superiors nodes (i.e., roots) of FORT
     */
    @LispMethod(comment = "Returns returns the maximal positive superiors nodes (i.e., roots) of FORT")
    public static final SubLObject gtm_roots_alt(SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject superiors = NIL;
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
                            SubLObject catch_var = NIL;
                            try {
                                if (!(((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) || (NIL != Errors.$ignore_mustsP$.getDynamicValue(thread)))) {
                                    gt_utilities.gt_check_type_internal(fort, $GT_INDEX, THREE_INTEGER);
                                }
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == gt_utilities.gt_modeP($SUPERIOR)) {
                                        Errors.error($str_alt11$invalid_gt_mode___a, $SUPERIOR);
                                    }
                                }
                                {
                                    SubLObject _prev_bind_0_19 = gt_vars.$gt_mode$.currentBinding(thread);
                                    try {
                                        gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                                        SubLTrampolineFile.checkType($TRUE, TRUTH_P);
                                        {
                                            SubLObject _prev_bind_0_20 = gt_vars.$gt_truth$.currentBinding(thread);
                                            try {
                                                gt_vars.$gt_truth$.bind($TRUE, thread);
                                                superiors = gt_search.gt_extremal_accessed(fort);
                                            } finally {
                                                gt_vars.$gt_truth$.rebind(_prev_bind_0_20, thread);
                                            }
                                        }
                                    } finally {
                                        gt_vars.$gt_mode$.rebind(_prev_bind_0_19, thread);
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return superiors;
            }
        }
    }

    /**
     * Returns returns the maximal positive superiors nodes (i.e., roots) of FORT
     */
    @LispMethod(comment = "Returns returns the maximal positive superiors nodes (i.e., roots) of FORT")
    public static SubLObject gtm_roots(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject superiors = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($GT_ERROR);
                if (((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                    gt_utilities.gt_check_type_internal(fort, $GT_INDEX, THREE_INTEGER);
                }
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($SUPERIOR))) {
                    Errors.error($str11$invalid_gt_mode___a, $SUPERIOR);
                }
                final SubLObject _prev_bind_0_$19 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                    assert NIL != enumeration_types.truth_p($TRUE) : "! enumeration_types.truth_p( _KW.$TRUE) " + ("enumeration_types.truth_p(gt_methods.$kw12$TRUE) " + "CommonSymbols.NIL != enumeration_types.truth_p(gt_methods.$kw12$TRUE) ") + $TRUE;
                    final SubLObject _prev_bind_0_$20 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind($TRUE, thread);
                        superiors = gt_search.gt_extremal_accessed(fort);
                    } finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$20, thread);
                    }
                } finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$19, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return superiors;
    }

    /**
     * Returns minimal inferiors (i.e., leaves) of FORT via PREDICATE
     */
    @LispMethod(comment = "Returns minimal inferiors (i.e., leaves) of FORT via PREDICATE")
    public static final SubLObject gt_leaves_alt(SubLObject predicate, SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(predicate, FORT_P);
        SubLTrampolineFile.checkType(fort, GT_TERM_P);
        return transitivity.gtm(predicate, $LEAVES, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns minimal inferiors (i.e., leaves) of FORT via PREDICATE
     */
    @LispMethod(comment = "Returns minimal inferiors (i.e., leaves) of FORT via PREDICATE")
    public static SubLObject gt_leaves(final SubLObject predicate, final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(predicate, FORT_P);
        SubLTrampolineFile.enforceType(fort, GT_TERM_P);
        return transitivity.gtm(predicate, $LEAVES, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns returns the minimal positive inferiors nodes (i.e., leaves) of FORT
     */
    @LispMethod(comment = "Returns returns the minimal positive inferiors nodes (i.e., leaves) of FORT")
    public static final SubLObject gtm_leaves_alt(SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject inferiors = NIL;
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
                            SubLObject catch_var = NIL;
                            try {
                                if (!(((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) || (NIL != Errors.$ignore_mustsP$.getDynamicValue(thread)))) {
                                    gt_utilities.gt_check_type_internal(fort, $GT_GATHER, THREE_INTEGER);
                                }
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == gt_utilities.gt_modeP($INFERIOR)) {
                                        Errors.error($str_alt11$invalid_gt_mode___a, $INFERIOR);
                                    }
                                }
                                {
                                    SubLObject _prev_bind_0_21 = gt_vars.$gt_mode$.currentBinding(thread);
                                    try {
                                        gt_vars.$gt_mode$.bind($INFERIOR, thread);
                                        SubLTrampolineFile.checkType($TRUE, TRUTH_P);
                                        {
                                            SubLObject _prev_bind_0_22 = gt_vars.$gt_truth$.currentBinding(thread);
                                            try {
                                                gt_vars.$gt_truth$.bind($TRUE, thread);
                                                inferiors = gt_search.gt_extremal_accessed(fort);
                                            } finally {
                                                gt_vars.$gt_truth$.rebind(_prev_bind_0_22, thread);
                                            }
                                        }
                                    } finally {
                                        gt_vars.$gt_mode$.rebind(_prev_bind_0_21, thread);
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return inferiors;
            }
        }
    }

    /**
     * Returns returns the minimal positive inferiors nodes (i.e., leaves) of FORT
     */
    @LispMethod(comment = "Returns returns the minimal positive inferiors nodes (i.e., leaves) of FORT")
    public static SubLObject gtm_leaves(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject inferiors = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($GT_ERROR);
                if (((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                    gt_utilities.gt_check_type_internal(fort, $GT_GATHER, THREE_INTEGER);
                }
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($INFERIOR))) {
                    Errors.error($str11$invalid_gt_mode___a, $INFERIOR);
                }
                final SubLObject _prev_bind_0_$21 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind($INFERIOR, thread);
                    assert NIL != enumeration_types.truth_p($TRUE) : "! enumeration_types.truth_p( _KW.$TRUE) " + ("enumeration_types.truth_p(gt_methods.$kw12$TRUE) " + "CommonSymbols.NIL != enumeration_types.truth_p(gt_methods.$kw12$TRUE) ") + $TRUE;
                    final SubLObject _prev_bind_0_$22 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind($TRUE, thread);
                        inferiors = gt_search.gt_extremal_accessed(fort);
                    } finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$22, thread);
                    }
                } finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$21, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return inferiors;
    }

    /**
     * Apply fn to each superior of FORT;
     * fn takes a fort as its only arg, and must not effect the search status of each
     * fort it visits
     */
    @LispMethod(comment = "Apply fn to each superior of FORT;\r\nfn takes a fort as its only arg, and must not effect the search status of each\r\nfort it visits\nApply fn to each superior of FORT;\nfn takes a fort as its only arg, and must not effect the search status of each\nfort it visits")
    public static final SubLObject gt_compose_fn_all_superiors_alt(SubLObject predicate, SubLObject fort, SubLObject fn, SubLObject combine_fn, SubLObject mt) {
        if (combine_fn == UNPROVIDED) {
            combine_fn = symbol_function(CONS);
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(predicate, FORT_P);
        SubLTrampolineFile.checkType(fort, GT_TERM_P);
        SubLTrampolineFile.checkType(fn, FUNCTION_SPEC_P);
        return transitivity.gtm(predicate, $COMPOSE_FN_SUPERIORS, fort, fn, combine_fn, mt, UNPROVIDED);
    }

    /**
     * Apply fn to each superior of FORT;
     * fn takes a fort as its only arg, and must not effect the search status of each
     * fort it visits
     */
    @LispMethod(comment = "Apply fn to each superior of FORT;\r\nfn takes a fort as its only arg, and must not effect the search status of each\r\nfort it visits\nApply fn to each superior of FORT;\nfn takes a fort as its only arg, and must not effect the search status of each\nfort it visits")
    public static SubLObject gt_compose_fn_all_superiors(final SubLObject predicate, final SubLObject fort, final SubLObject fn, SubLObject combine_fn, SubLObject mt) {
        if (combine_fn == UNPROVIDED) {
            combine_fn = symbol_function(CONS);
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(predicate, FORT_P);
        SubLTrampolineFile.enforceType(fort, GT_TERM_P);
        SubLTrampolineFile.enforceType(fn, FUNCTION_SPEC_P);
        return transitivity.gtm(predicate, $COMPOSE_FN_SUPERIORS, fort, fn, combine_fn, mt, UNPROVIDED);
    }

    /**
     * apply fn to each superior of FORT;
     * fn takes a fort as its only arg, and
     * it must not effect fort markings (search-tag slot)
     */
    @LispMethod(comment = "apply fn to each superior of FORT;\r\nfn takes a fort as its only arg, and\r\nit must not effect fort markings (search-tag slot)\napply fn to each superior of FORT;\nfn takes a fort as its only arg, and\nit must not effect fort markings (search-tag slot)")
    public static final SubLObject gtm_compose_fn_all_superiors_alt(SubLObject fort, SubLObject fn, SubLObject combine_fn, SubLObject mt) {
        if (combine_fn == UNPROVIDED) {
            combine_fn = symbol_function(CONS);
        }
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
                        {
                            SubLObject catch_var = NIL;
                            try {
                                if (!(((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) || (NIL != Errors.$ignore_mustsP$.getDynamicValue(thread)))) {
                                    gt_utilities.gt_check_type_internal(fort, $GT_INDEX, THREE_INTEGER);
                                }
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == gt_utilities.gt_modeP($SUPERIOR)) {
                                        Errors.error($str_alt11$invalid_gt_mode___a, $SUPERIOR);
                                    }
                                }
                                {
                                    SubLObject _prev_bind_0_23 = gt_vars.$gt_mode$.currentBinding(thread);
                                    try {
                                        gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                                        SubLTrampolineFile.checkType($TRUE, TRUTH_P);
                                        {
                                            SubLObject _prev_bind_0_24 = gt_vars.$gt_truth$.currentBinding(thread);
                                            try {
                                                gt_vars.$gt_truth$.bind($TRUE, thread);
                                                result = gt_search.gt_compose_fn_all_accessed(fort, fn, combine_fn);
                                            } finally {
                                                gt_vars.$gt_truth$.rebind(_prev_bind_0_24, thread);
                                            }
                                        }
                                    } finally {
                                        gt_vars.$gt_mode$.rebind(_prev_bind_0_23, thread);
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
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

    /**
     * apply fn to each superior of FORT;
     * fn takes a fort as its only arg, and
     * it must not effect fort markings (search-tag slot)
     */
    @LispMethod(comment = "apply fn to each superior of FORT;\r\nfn takes a fort as its only arg, and\r\nit must not effect fort markings (search-tag slot)\napply fn to each superior of FORT;\nfn takes a fort as its only arg, and\nit must not effect fort markings (search-tag slot)")
    public static SubLObject gtm_compose_fn_all_superiors(final SubLObject fort, final SubLObject fn, SubLObject combine_fn, SubLObject mt) {
        if (combine_fn == UNPROVIDED) {
            combine_fn = symbol_function(CONS);
        }
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
            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($GT_ERROR);
                if (((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                    gt_utilities.gt_check_type_internal(fort, $GT_INDEX, THREE_INTEGER);
                }
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($SUPERIOR))) {
                    Errors.error($str11$invalid_gt_mode___a, $SUPERIOR);
                }
                final SubLObject _prev_bind_0_$23 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                    assert NIL != enumeration_types.truth_p($TRUE) : "! enumeration_types.truth_p( _KW.$TRUE) " + ("enumeration_types.truth_p(gt_methods.$kw12$TRUE) " + "CommonSymbols.NIL != enumeration_types.truth_p(gt_methods.$kw12$TRUE) ") + $TRUE;
                    final SubLObject _prev_bind_0_$24 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind($TRUE, thread);
                        result = gt_search.gt_compose_fn_all_accessed(fort, fn, combine_fn);
                    } finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$24, thread);
                    }
                } finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$23, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Apply fn to each inferior of FORT;
     * fn takes a fort as its only arg, and
     * it must not effect the search status of each fort it visits
     */
    @LispMethod(comment = "Apply fn to each inferior of FORT;\r\nfn takes a fort as its only arg, and\r\nit must not effect the search status of each fort it visits\nApply fn to each inferior of FORT;\nfn takes a fort as its only arg, and\nit must not effect the search status of each fort it visits")
    public static final SubLObject gt_compose_fn_all_inferiors_alt(SubLObject predicate, SubLObject fort, SubLObject fn, SubLObject combine_fn, SubLObject mt) {
        if (combine_fn == UNPROVIDED) {
            combine_fn = gt_vars.$gt_combine_fn$.getDynamicValue();
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(predicate, FORT_P);
        SubLTrampolineFile.checkType(fort, GT_TERM_P);
        SubLTrampolineFile.checkType(fn, FUNCTION_SPEC_P);
        return transitivity.gtm(predicate, $COMPOSE_FN_INFERIORS, fort, fn, combine_fn, mt, UNPROVIDED);
    }

    /**
     * Apply fn to each inferior of FORT;
     * fn takes a fort as its only arg, and
     * it must not effect the search status of each fort it visits
     */
    @LispMethod(comment = "Apply fn to each inferior of FORT;\r\nfn takes a fort as its only arg, and\r\nit must not effect the search status of each fort it visits\nApply fn to each inferior of FORT;\nfn takes a fort as its only arg, and\nit must not effect the search status of each fort it visits")
    public static SubLObject gt_compose_fn_all_inferiors(final SubLObject predicate, final SubLObject fort, final SubLObject fn, SubLObject combine_fn, SubLObject mt) {
        if (combine_fn == UNPROVIDED) {
            combine_fn = gt_vars.$gt_combine_fn$.getDynamicValue();
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(predicate, FORT_P);
        SubLTrampolineFile.enforceType(fort, GT_TERM_P);
        SubLTrampolineFile.enforceType(fn, FUNCTION_SPEC_P);
        return transitivity.gtm(predicate, $COMPOSE_FN_INFERIORS, fort, fn, combine_fn, mt, UNPROVIDED);
    }

    /**
     * apply fn to each inferior of FORT;
     * fn takes a fort as its only arg, and
     * it must not effect fort markings (search-tag slot)
     */
    @LispMethod(comment = "apply fn to each inferior of FORT;\r\nfn takes a fort as its only arg, and\r\nit must not effect fort markings (search-tag slot)\napply fn to each inferior of FORT;\nfn takes a fort as its only arg, and\nit must not effect fort markings (search-tag slot)")
    public static final SubLObject gtm_compose_fn_all_inferiors_alt(SubLObject fort, SubLObject fn, SubLObject combine_fn, SubLObject mt) {
        if (combine_fn == UNPROVIDED) {
            combine_fn = gt_vars.$gt_combine_fn$.getDynamicValue();
        }
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
                        {
                            SubLObject catch_var = NIL;
                            try {
                                if (!(((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) || (NIL != Errors.$ignore_mustsP$.getDynamicValue(thread)))) {
                                    gt_utilities.gt_check_type_internal(fort, $GT_GATHER, THREE_INTEGER);
                                }
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == gt_utilities.gt_modeP($INFERIOR)) {
                                        Errors.error($str_alt11$invalid_gt_mode___a, $INFERIOR);
                                    }
                                }
                                {
                                    SubLObject _prev_bind_0_25 = gt_vars.$gt_mode$.currentBinding(thread);
                                    try {
                                        gt_vars.$gt_mode$.bind($INFERIOR, thread);
                                        SubLTrampolineFile.checkType($TRUE, TRUTH_P);
                                        {
                                            SubLObject _prev_bind_0_26 = gt_vars.$gt_truth$.currentBinding(thread);
                                            try {
                                                gt_vars.$gt_truth$.bind($TRUE, thread);
                                                result = gt_search.gt_compose_fn_all_accessed(fort, fn, combine_fn);
                                            } finally {
                                                gt_vars.$gt_truth$.rebind(_prev_bind_0_26, thread);
                                            }
                                        }
                                    } finally {
                                        gt_vars.$gt_mode$.rebind(_prev_bind_0_25, thread);
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
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

    /**
     * apply fn to each inferior of FORT;
     * fn takes a fort as its only arg, and
     * it must not effect fort markings (search-tag slot)
     */
    @LispMethod(comment = "apply fn to each inferior of FORT;\r\nfn takes a fort as its only arg, and\r\nit must not effect fort markings (search-tag slot)\napply fn to each inferior of FORT;\nfn takes a fort as its only arg, and\nit must not effect fort markings (search-tag slot)")
    public static SubLObject gtm_compose_fn_all_inferiors(final SubLObject fort, final SubLObject fn, SubLObject combine_fn, SubLObject mt) {
        if (combine_fn == UNPROVIDED) {
            combine_fn = gt_vars.$gt_combine_fn$.getDynamicValue();
        }
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
            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($GT_ERROR);
                if (((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                    gt_utilities.gt_check_type_internal(fort, $GT_GATHER, THREE_INTEGER);
                }
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($INFERIOR))) {
                    Errors.error($str11$invalid_gt_mode___a, $INFERIOR);
                }
                final SubLObject _prev_bind_0_$25 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind($INFERIOR, thread);
                    assert NIL != enumeration_types.truth_p($TRUE) : "! enumeration_types.truth_p( _KW.$TRUE) " + ("enumeration_types.truth_p(gt_methods.$kw12$TRUE) " + "CommonSymbols.NIL != enumeration_types.truth_p(gt_methods.$kw12$TRUE) ") + $TRUE;
                    final SubLObject _prev_bind_0_$26 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind($TRUE, thread);
                        result = gt_search.gt_compose_fn_all_accessed(fort, fn, combine_fn);
                    } finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$26, thread);
                    }
                } finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$25, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Returns all nodes accessible by COMPOSE-PRED from each superior of FORT along
     * transitive PREDICATE
     */
    @LispMethod(comment = "Returns all nodes accessible by COMPOSE-PRED from each superior of FORT along\r\ntransitive PREDICATE\nReturns all nodes accessible by COMPOSE-PRED from each superior of FORT along\ntransitive PREDICATE")
    public static final SubLObject gt_compose_pred_all_superiors_alt(SubLObject predicate, SubLObject fort, SubLObject compose_pred, SubLObject compose_index_arg, SubLObject compose_gather_arg, SubLObject mt) {
        if (compose_index_arg == UNPROVIDED) {
            compose_index_arg = gt_vars.$gt_compose_index_arg$.getDynamicValue();
        }
        if (compose_gather_arg == UNPROVIDED) {
            compose_gather_arg = gt_vars.$gt_compose_gather_arg$.getDynamicValue();
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(predicate, FORT_P);
        SubLTrampolineFile.checkType(fort, GT_TERM_P);
        SubLTrampolineFile.checkType(compose_pred, $sym66$PREDICATE_IN_ANY_MT_);
        return transitivity.gtm(predicate, $COMPOSE_PRED_SUPERIORS, fort, compose_pred, compose_index_arg, compose_gather_arg, mt);
    }

    /**
     * Returns all nodes accessible by COMPOSE-PRED from each superior of FORT along
     * transitive PREDICATE
     */
    @LispMethod(comment = "Returns all nodes accessible by COMPOSE-PRED from each superior of FORT along\r\ntransitive PREDICATE\nReturns all nodes accessible by COMPOSE-PRED from each superior of FORT along\ntransitive PREDICATE")
    public static SubLObject gt_compose_pred_all_superiors(final SubLObject predicate, final SubLObject fort, final SubLObject compose_pred, SubLObject compose_index_arg, SubLObject compose_gather_arg, SubLObject mt) {
        if (compose_index_arg == UNPROVIDED) {
            compose_index_arg = gt_vars.$gt_compose_index_arg$.getDynamicValue();
        }
        if (compose_gather_arg == UNPROVIDED) {
            compose_gather_arg = gt_vars.$gt_compose_gather_arg$.getDynamicValue();
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(predicate, FORT_P);
        SubLTrampolineFile.enforceType(fort, GT_TERM_P);
        SubLTrampolineFile.enforceType(compose_pred, $sym66$PREDICATE_IN_ANY_MT_);
        return transitivity.gtm(predicate, $COMPOSE_PRED_SUPERIORS, fort, compose_pred, compose_index_arg, compose_gather_arg, mt);
    }

    /**
     * gather all nodes accessible by PRED from each superior of FORT
     */
    @LispMethod(comment = "gather all nodes accessible by PRED from each superior of FORT")
    public static final SubLObject gtm_compose_pred_all_superiors_alt(SubLObject fort, SubLObject pred, SubLObject compose_index_arg, SubLObject compose_gather_arg, SubLObject mt) {
        if (compose_index_arg == UNPROVIDED) {
            compose_index_arg = gt_vars.$gt_compose_index_arg$.getDynamicValue();
        }
        if (compose_gather_arg == UNPROVIDED) {
            compose_gather_arg = gt_vars.$gt_compose_gather_arg$.getDynamicValue();
        }
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
                        {
                            SubLObject catch_var = NIL;
                            try {
                                if (!(((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) || (NIL != Errors.$ignore_mustsP$.getDynamicValue(thread)))) {
                                    gt_utilities.gt_check_type_internal(fort, $GT_INDEX, THREE_INTEGER);
                                }
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == gt_utilities.gt_modeP($SUPERIOR)) {
                                        Errors.error($str_alt11$invalid_gt_mode___a, $SUPERIOR);
                                    }
                                }
                                {
                                    SubLObject _prev_bind_0_27 = gt_vars.$gt_mode$.currentBinding(thread);
                                    try {
                                        gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                                        SubLTrampolineFile.checkType($TRUE, TRUTH_P);
                                        {
                                            SubLObject _prev_bind_0_28 = gt_vars.$gt_truth$.currentBinding(thread);
                                            try {
                                                gt_vars.$gt_truth$.bind($TRUE, thread);
                                                SubLTrampolineFile.checkType(compose_index_arg, FIXNUMP);
                                                {
                                                    SubLObject _prev_bind_0_29 = gt_vars.$gt_compose_index_arg$.currentBinding(thread);
                                                    try {
                                                        gt_vars.$gt_compose_index_arg$.bind(compose_index_arg, thread);
                                                        SubLTrampolineFile.checkType(compose_gather_arg, FIXNUMP);
                                                        {
                                                            SubLObject _prev_bind_0_30 = gt_vars.$gt_compose_gather_arg$.currentBinding(thread);
                                                            try {
                                                                gt_vars.$gt_compose_gather_arg$.bind(compose_gather_arg, thread);
                                                                result = gt_search.gt_compose_pred_all_accessed(fort, pred);
                                                            } finally {
                                                                gt_vars.$gt_compose_gather_arg$.rebind(_prev_bind_0_30, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        gt_vars.$gt_compose_index_arg$.rebind(_prev_bind_0_29, thread);
                                                    }
                                                }
                                            } finally {
                                                gt_vars.$gt_truth$.rebind(_prev_bind_0_28, thread);
                                            }
                                        }
                                    } finally {
                                        gt_vars.$gt_mode$.rebind(_prev_bind_0_27, thread);
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
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

    /**
     * gather all nodes accessible by PRED from each superior of FORT
     */
    @LispMethod(comment = "gather all nodes accessible by PRED from each superior of FORT")
    public static SubLObject gtm_compose_pred_all_superiors(final SubLObject fort, final SubLObject pred, SubLObject compose_index_arg, SubLObject compose_gather_arg, SubLObject mt) {
        if (compose_index_arg == UNPROVIDED) {
            compose_index_arg = gt_vars.$gt_compose_index_arg$.getDynamicValue();
        }
        if (compose_gather_arg == UNPROVIDED) {
            compose_gather_arg = gt_vars.$gt_compose_gather_arg$.getDynamicValue();
        }
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
            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($GT_ERROR);
                if (((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                    gt_utilities.gt_check_type_internal(fort, $GT_INDEX, THREE_INTEGER);
                }
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($SUPERIOR))) {
                    Errors.error($str11$invalid_gt_mode___a, $SUPERIOR);
                }
                final SubLObject _prev_bind_0_$27 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                    assert NIL != enumeration_types.truth_p($TRUE) : "! enumeration_types.truth_p( _KW.$TRUE) " + ("enumeration_types.truth_p(gt_methods.$kw12$TRUE) " + "CommonSymbols.NIL != enumeration_types.truth_p(gt_methods.$kw12$TRUE) ") + $TRUE;
                    final SubLObject _prev_bind_0_$28 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind($TRUE, thread);
                        assert NIL != fixnump(compose_index_arg) : "! fixnump(compose_index_arg) " + ("Types.fixnump(compose_index_arg) " + "CommonSymbols.NIL != Types.fixnump(compose_index_arg) ") + compose_index_arg;
                        final SubLObject _prev_bind_0_$29 = gt_vars.$gt_compose_index_arg$.currentBinding(thread);
                        try {
                            gt_vars.$gt_compose_index_arg$.bind(compose_index_arg, thread);
                            assert NIL != fixnump(compose_gather_arg) : "! fixnump(compose_gather_arg) " + ("Types.fixnump(compose_gather_arg) " + "CommonSymbols.NIL != Types.fixnump(compose_gather_arg) ") + compose_gather_arg;
                            final SubLObject _prev_bind_0_$30 = gt_vars.$gt_compose_gather_arg$.currentBinding(thread);
                            try {
                                gt_vars.$gt_compose_gather_arg$.bind(compose_gather_arg, thread);
                                result = gt_search.gt_compose_pred_all_accessed(fort, pred);
                            } finally {
                                gt_vars.$gt_compose_gather_arg$.rebind(_prev_bind_0_$30, thread);
                            }
                        } finally {
                            gt_vars.$gt_compose_index_arg$.rebind(_prev_bind_0_$29, thread);
                        }
                    } finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$28, thread);
                    }
                } finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$27, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Returns all nodes accessible by COMPOSE-PRED from each inferior of FORT along
     * transitive PREDICATE
     */
    @LispMethod(comment = "Returns all nodes accessible by COMPOSE-PRED from each inferior of FORT along\r\ntransitive PREDICATE\nReturns all nodes accessible by COMPOSE-PRED from each inferior of FORT along\ntransitive PREDICATE")
    public static final SubLObject gt_compose_pred_all_inferiors_alt(SubLObject predicate, SubLObject fort, SubLObject compose_pred, SubLObject compose_index_arg, SubLObject compose_gather_arg, SubLObject mt) {
        if (compose_index_arg == UNPROVIDED) {
            compose_index_arg = gt_vars.$gt_compose_index_arg$.getDynamicValue();
        }
        if (compose_gather_arg == UNPROVIDED) {
            compose_gather_arg = gt_vars.$gt_compose_gather_arg$.getDynamicValue();
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(predicate, FORT_P);
        SubLTrampolineFile.checkType(fort, GT_TERM_P);
        SubLTrampolineFile.checkType(compose_pred, $sym66$PREDICATE_IN_ANY_MT_);
        return transitivity.gtm(predicate, $COMPOSE_PRED_INFERIORS, fort, compose_pred, compose_index_arg, compose_gather_arg, mt);
    }

    /**
     * Returns all nodes accessible by COMPOSE-PRED from each inferior of FORT along
     * transitive PREDICATE
     */
    @LispMethod(comment = "Returns all nodes accessible by COMPOSE-PRED from each inferior of FORT along\r\ntransitive PREDICATE\nReturns all nodes accessible by COMPOSE-PRED from each inferior of FORT along\ntransitive PREDICATE")
    public static SubLObject gt_compose_pred_all_inferiors(final SubLObject predicate, final SubLObject fort, final SubLObject compose_pred, SubLObject compose_index_arg, SubLObject compose_gather_arg, SubLObject mt) {
        if (compose_index_arg == UNPROVIDED) {
            compose_index_arg = gt_vars.$gt_compose_index_arg$.getDynamicValue();
        }
        if (compose_gather_arg == UNPROVIDED) {
            compose_gather_arg = gt_vars.$gt_compose_gather_arg$.getDynamicValue();
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(predicate, FORT_P);
        SubLTrampolineFile.enforceType(fort, GT_TERM_P);
        SubLTrampolineFile.enforceType(compose_pred, $sym66$PREDICATE_IN_ANY_MT_);
        return transitivity.gtm(predicate, $COMPOSE_PRED_INFERIORS, fort, compose_pred, compose_index_arg, compose_gather_arg, mt);
    }

    /**
     * gather all nodes accessible by *gt-compose-pred* from each inferior of FORT
     */
    @LispMethod(comment = "gather all nodes accessible by *gt-compose-pred* from each inferior of FORT")
    public static final SubLObject gtm_compose_pred_all_inferiors_alt(SubLObject fort, SubLObject pred, SubLObject compose_index_arg, SubLObject compose_gather_arg, SubLObject mt) {
        if (compose_index_arg == UNPROVIDED) {
            compose_index_arg = gt_vars.$gt_compose_index_arg$.getDynamicValue();
        }
        if (compose_gather_arg == UNPROVIDED) {
            compose_gather_arg = gt_vars.$gt_compose_gather_arg$.getDynamicValue();
        }
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
                        {
                            SubLObject catch_var = NIL;
                            try {
                                if (!(((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) || (NIL != Errors.$ignore_mustsP$.getDynamicValue(thread)))) {
                                    gt_utilities.gt_check_type_internal(fort, $GT_GATHER, THREE_INTEGER);
                                }
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == gt_utilities.gt_modeP($INFERIOR)) {
                                        Errors.error($str_alt11$invalid_gt_mode___a, $INFERIOR);
                                    }
                                }
                                {
                                    SubLObject _prev_bind_0_31 = gt_vars.$gt_mode$.currentBinding(thread);
                                    try {
                                        gt_vars.$gt_mode$.bind($INFERIOR, thread);
                                        SubLTrampolineFile.checkType($TRUE, TRUTH_P);
                                        {
                                            SubLObject _prev_bind_0_32 = gt_vars.$gt_truth$.currentBinding(thread);
                                            try {
                                                gt_vars.$gt_truth$.bind($TRUE, thread);
                                                SubLTrampolineFile.checkType(compose_index_arg, FIXNUMP);
                                                {
                                                    SubLObject _prev_bind_0_33 = gt_vars.$gt_compose_index_arg$.currentBinding(thread);
                                                    try {
                                                        gt_vars.$gt_compose_index_arg$.bind(compose_index_arg, thread);
                                                        SubLTrampolineFile.checkType(compose_gather_arg, FIXNUMP);
                                                        {
                                                            SubLObject _prev_bind_0_34 = gt_vars.$gt_compose_gather_arg$.currentBinding(thread);
                                                            try {
                                                                gt_vars.$gt_compose_gather_arg$.bind(compose_gather_arg, thread);
                                                                result = gt_search.gt_compose_pred_all_accessed(fort, pred);
                                                            } finally {
                                                                gt_vars.$gt_compose_gather_arg$.rebind(_prev_bind_0_34, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        gt_vars.$gt_compose_index_arg$.rebind(_prev_bind_0_33, thread);
                                                    }
                                                }
                                            } finally {
                                                gt_vars.$gt_truth$.rebind(_prev_bind_0_32, thread);
                                            }
                                        }
                                    } finally {
                                        gt_vars.$gt_mode$.rebind(_prev_bind_0_31, thread);
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
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

    /**
     * gather all nodes accessible by *gt-compose-pred* from each inferior of FORT
     */
    @LispMethod(comment = "gather all nodes accessible by *gt-compose-pred* from each inferior of FORT")
    public static SubLObject gtm_compose_pred_all_inferiors(final SubLObject fort, final SubLObject pred, SubLObject compose_index_arg, SubLObject compose_gather_arg, SubLObject mt) {
        if (compose_index_arg == UNPROVIDED) {
            compose_index_arg = gt_vars.$gt_compose_index_arg$.getDynamicValue();
        }
        if (compose_gather_arg == UNPROVIDED) {
            compose_gather_arg = gt_vars.$gt_compose_gather_arg$.getDynamicValue();
        }
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
            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($GT_ERROR);
                if (((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                    gt_utilities.gt_check_type_internal(fort, $GT_GATHER, THREE_INTEGER);
                }
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($INFERIOR))) {
                    Errors.error($str11$invalid_gt_mode___a, $INFERIOR);
                }
                final SubLObject _prev_bind_0_$31 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind($INFERIOR, thread);
                    assert NIL != enumeration_types.truth_p($TRUE) : "! enumeration_types.truth_p( _KW.$TRUE) " + ("enumeration_types.truth_p(gt_methods.$kw12$TRUE) " + "CommonSymbols.NIL != enumeration_types.truth_p(gt_methods.$kw12$TRUE) ") + $TRUE;
                    final SubLObject _prev_bind_0_$32 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind($TRUE, thread);
                        assert NIL != fixnump(compose_index_arg) : "! fixnump(compose_index_arg) " + ("Types.fixnump(compose_index_arg) " + "CommonSymbols.NIL != Types.fixnump(compose_index_arg) ") + compose_index_arg;
                        final SubLObject _prev_bind_0_$33 = gt_vars.$gt_compose_index_arg$.currentBinding(thread);
                        try {
                            gt_vars.$gt_compose_index_arg$.bind(compose_index_arg, thread);
                            assert NIL != fixnump(compose_gather_arg) : "! fixnump(compose_gather_arg) " + ("Types.fixnump(compose_gather_arg) " + "CommonSymbols.NIL != Types.fixnump(compose_gather_arg) ") + compose_gather_arg;
                            final SubLObject _prev_bind_0_$34 = gt_vars.$gt_compose_gather_arg$.currentBinding(thread);
                            try {
                                gt_vars.$gt_compose_gather_arg$.bind(compose_gather_arg, thread);
                                result = gt_search.gt_compose_pred_all_accessed(fort, pred);
                            } finally {
                                gt_vars.$gt_compose_gather_arg$.rebind(_prev_bind_0_$34, thread);
                            }
                        } finally {
                            gt_vars.$gt_compose_index_arg$.rebind(_prev_bind_0_$33, thread);
                        }
                    } finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$32, thread);
                    }
                } finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$31, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Returns all inferiors i of FORT s.t. every path connecting i to
     * any superior of FORT must pass through FORT
     */
    @LispMethod(comment = "Returns all inferiors i of FORT s.t. every path connecting i to\r\nany superior of FORT must pass through FORT\nReturns all inferiors i of FORT s.t. every path connecting i to\nany superior of FORT must pass through FORT")
    public static final SubLObject gt_all_dependent_inferiors_alt(SubLObject predicate, SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(predicate, FORT_P);
        SubLTrampolineFile.checkType(fort, GT_TERM_P);
        return transitivity.gtm(predicate, $ALL_DEPENDENT_INFERIORS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns all inferiors i of FORT s.t. every path connecting i to
     * any superior of FORT must pass through FORT
     */
    @LispMethod(comment = "Returns all inferiors i of FORT s.t. every path connecting i to\r\nany superior of FORT must pass through FORT\nReturns all inferiors i of FORT s.t. every path connecting i to\nany superior of FORT must pass through FORT")
    public static SubLObject gt_all_dependent_inferiors(final SubLObject predicate, final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(predicate, FORT_P);
        SubLTrampolineFile.enforceType(fort, GT_TERM_P);
        return transitivity.gtm(predicate, $ALL_DEPENDENT_INFERIORS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns all inferiors i of FORT s.t. every path connecting i to
     * any superior of FORT must pass through FORT
     */
    @LispMethod(comment = "Returns all inferiors i of FORT s.t. every path connecting i to\r\nany superior of FORT must pass through FORT\nReturns all inferiors i of FORT s.t. every path connecting i to\nany superior of FORT must pass through FORT")
    public static final SubLObject gtm_all_dependent_inferiors_alt(SubLObject fort, SubLObject mt) {
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
                        {
                            SubLObject catch_var = NIL;
                            try {
                                if (!(((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) || (NIL != Errors.$ignore_mustsP$.getDynamicValue(thread)))) {
                                    gt_utilities.gt_check_type_internal(fort, $GT_GATHER, THREE_INTEGER);
                                }
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == gt_utilities.gt_modeP($INFERIOR)) {
                                        Errors.error($str_alt11$invalid_gt_mode___a, $INFERIOR);
                                    }
                                }
                                {
                                    SubLObject _prev_bind_0_35 = gt_vars.$gt_mode$.currentBinding(thread);
                                    try {
                                        gt_vars.$gt_mode$.bind($INFERIOR, thread);
                                        SubLTrampolineFile.checkType($TRUE, TRUTH_P);
                                        {
                                            SubLObject _prev_bind_0_36 = gt_vars.$gt_truth$.currentBinding(thread);
                                            try {
                                                gt_vars.$gt_truth$.bind($TRUE, thread);
                                                result = gt_search.gt_all_dependent_accessed(fort);
                                            } finally {
                                                gt_vars.$gt_truth$.rebind(_prev_bind_0_36, thread);
                                            }
                                        }
                                    } finally {
                                        gt_vars.$gt_mode$.rebind(_prev_bind_0_35, thread);
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
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

    /**
     * Returns all inferiors i of FORT s.t. every path connecting i to
     * any superior of FORT must pass through FORT
     */
    @LispMethod(comment = "Returns all inferiors i of FORT s.t. every path connecting i to\r\nany superior of FORT must pass through FORT\nReturns all inferiors i of FORT s.t. every path connecting i to\nany superior of FORT must pass through FORT")
    public static SubLObject gtm_all_dependent_inferiors(final SubLObject fort, SubLObject mt) {
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
            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($GT_ERROR);
                if (((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                    gt_utilities.gt_check_type_internal(fort, $GT_GATHER, THREE_INTEGER);
                }
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($INFERIOR))) {
                    Errors.error($str11$invalid_gt_mode___a, $INFERIOR);
                }
                final SubLObject _prev_bind_0_$35 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind($INFERIOR, thread);
                    assert NIL != enumeration_types.truth_p($TRUE) : "! enumeration_types.truth_p( _KW.$TRUE) " + ("enumeration_types.truth_p(gt_methods.$kw12$TRUE) " + "CommonSymbols.NIL != enumeration_types.truth_p(gt_methods.$kw12$TRUE) ") + $TRUE;
                    final SubLObject _prev_bind_0_$36 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind($TRUE, thread);
                        result = gt_search.gt_all_dependent_accessed(fort);
                    } finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$36, thread);
                    }
                } finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$35, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @return t iff a transitivity argument can be established for (PREDICATE ARG1 ARG2)
     */
    @LispMethod(comment = "@return t iff a transitivity argument can be established for (PREDICATE ARG1 ARG2)")
    public static final SubLObject gt_booleanP_alt(SubLObject predicate, SubLObject arg1, SubLObject arg2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return transitivity.gtm(predicate, $BOOLEAN_, arg1, arg2, mt, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return t iff a transitivity argument can be established for (PREDICATE ARG1 ARG2)
     */
    @LispMethod(comment = "@return t iff a transitivity argument can be established for (PREDICATE ARG1 ARG2)")
    public static SubLObject gt_booleanP(final SubLObject predicate, final SubLObject arg1, final SubLObject arg2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return transitivity.gtm(predicate, $BOOLEAN_, arg1, arg2, mt, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject gtm_booleanP_alt(SubLObject arg1, SubLObject arg2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject source = NIL;
                SubLObject target = NIL;
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
                            SubLObject pcase_var = gt_vars.$gt_index_arg$.getDynamicValue(thread);
                            if (pcase_var.eql(ONE_INTEGER)) {
                                source = arg1;
                                target = arg2;
                            } else {
                                if (pcase_var.eql(TWO_INTEGER)) {
                                    source = arg2;
                                    target = arg1;
                                }
                            }
                            {
                                SubLObject catch_var = NIL;
                                try {
                                    if (!(((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) || (NIL != Errors.$ignore_mustsP$.getDynamicValue(thread)))) {
                                        gt_utilities.gt_check_type_internal(target, $GT_GATHER, THREE_INTEGER);
                                    }
                                    if (!(((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) || (NIL != Errors.$ignore_mustsP$.getDynamicValue(thread)))) {
                                        gt_utilities.gt_check_type_internal(source, $GT_GATHER, THREE_INTEGER);
                                    }
                                    if ((arg1 == arg2) && (NIL != kb_accessors.reflexive_predicateP(gt_vars.$gt_pred$.getDynamicValue(thread)))) {
                                        result = T;
                                    } else {
                                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                            if (NIL == gt_utilities.gt_modeP($SUPERIOR)) {
                                                Errors.error($str_alt11$invalid_gt_mode___a, $SUPERIOR);
                                            }
                                        }
                                        {
                                            SubLObject _prev_bind_0_37 = gt_vars.$gt_mode$.currentBinding(thread);
                                            try {
                                                gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                                                SubLTrampolineFile.checkType($TRUE, TRUTH_P);
                                                {
                                                    SubLObject _prev_bind_0_38 = gt_vars.$gt_truth$.currentBinding(thread);
                                                    try {
                                                        gt_vars.$gt_truth$.bind($TRUE, thread);
                                                        result = gt_search.gt_accessesP(source, target, UNPROVIDED);
                                                    } finally {
                                                        gt_vars.$gt_truth$.rebind(_prev_bind_0_38, thread);
                                                    }
                                                }
                                            } finally {
                                                gt_vars.$gt_mode$.rebind(_prev_bind_0_37, thread);
                                            }
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
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

    public static SubLObject gtm_booleanP(final SubLObject arg1, final SubLObject arg2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject source = NIL;
        SubLObject target = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject pcase_var = gt_vars.$gt_index_arg$.getDynamicValue(thread);
            if (pcase_var.eql(ONE_INTEGER)) {
                source = arg1;
                target = arg2;
            } else
                if (pcase_var.eql(TWO_INTEGER)) {
                    source = arg2;
                    target = arg1;
                }

            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($GT_ERROR);
                if (((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                    gt_utilities.gt_check_type_internal(target, $GT_GATHER, THREE_INTEGER);
                }
                if (((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                    gt_utilities.gt_check_type_internal(source, $GT_GATHER, THREE_INTEGER);
                }
                if (arg1.eql(arg2) && (NIL != kb_accessors.reflexive_predicateP(gt_vars.$gt_pred$.getDynamicValue(thread)))) {
                    result = T;
                } else {
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($SUPERIOR))) {
                        Errors.error($str11$invalid_gt_mode___a, $SUPERIOR);
                    }
                    final SubLObject _prev_bind_0_$37 = gt_vars.$gt_mode$.currentBinding(thread);
                    try {
                        gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                        assert NIL != enumeration_types.truth_p($TRUE) : "! enumeration_types.truth_p( _KW.$TRUE) " + ("enumeration_types.truth_p(gt_methods.$kw12$TRUE) " + "CommonSymbols.NIL != enumeration_types.truth_p(gt_methods.$kw12$TRUE) ") + $TRUE;
                        final SubLObject _prev_bind_0_$38 = gt_vars.$gt_truth$.currentBinding(thread);
                        try {
                            gt_vars.$gt_truth$.bind($TRUE, thread);
                            result = gt_search.gt_accessesP(source, target, UNPROVIDED);
                        } finally {
                            gt_vars.$gt_truth$.rebind(_prev_bind_0_$38, thread);
                        }
                    } finally {
                        gt_vars.$gt_mode$.rebind(_prev_bind_0_$37, thread);
                    }
                }
            } catch (final Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Returns whether fort SUPERIOR is hierarchically superior (wrt transitive PREDICATE)
     * to fort INFERIOR?
     */
    @LispMethod(comment = "Returns whether fort SUPERIOR is hierarchically superior (wrt transitive PREDICATE)\r\nto fort INFERIOR?\nReturns whether fort SUPERIOR is hierarchically superior (wrt transitive PREDICATE)\nto fort INFERIOR?")
    public static final SubLObject gt_superiorP_alt(SubLObject predicate, SubLObject superior, SubLObject inferior, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return transitivity.gtm(predicate, $SUPERIOR_, superior, inferior, mt, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Returns whether fort SUPERIOR is hierarchically superior (wrt transitive PREDICATE)\r\nto fort INFERIOR?\nReturns whether fort SUPERIOR is hierarchically superior (wrt transitive PREDICATE)\nto fort INFERIOR?")
    public static SubLObject gt_superiorP(final SubLObject predicate, final SubLObject superior, final SubLObject inferior, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return transitivity.gtm(predicate, $SUPERIOR_, superior, inferior, mt, UNPROVIDED, UNPROVIDED);
    }/**
     * Returns whether fort SUPERIOR is hierarchically superior (wrt transitive PREDICATE)
     * to fort INFERIOR?
     */


    /**
     * Returns is GENL superior to (i.e., hierarchically higher than) SPEC?
     */
    @LispMethod(comment = "Returns is GENL superior to (i.e., hierarchically higher than) SPEC?")
    public static final SubLObject gtm_superiorP_alt(SubLObject genl, SubLObject spec, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject superiorP = NIL;
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
                            SubLObject catch_var = NIL;
                            try {
                                if (!(((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) || (NIL != Errors.$ignore_mustsP$.getDynamicValue(thread)))) {
                                    gt_utilities.gt_check_type_internal(spec, $GT_INDEX, THREE_INTEGER);
                                }
                                if (!(((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) || (NIL != Errors.$ignore_mustsP$.getDynamicValue(thread)))) {
                                    gt_utilities.gt_check_type_internal(genl, $GT_GATHER, THREE_INTEGER);
                                }
                                if ((genl == spec) && (NIL != kb_accessors.reflexive_predicateP(gt_vars.$gt_pred$.getDynamicValue(thread)))) {
                                    superiorP = T;
                                } else {
                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                        if (NIL == gt_utilities.gt_modeP($SUPERIOR)) {
                                            Errors.error($str_alt11$invalid_gt_mode___a, $SUPERIOR);
                                        }
                                    }
                                    {
                                        SubLObject _prev_bind_0_39 = gt_vars.$gt_mode$.currentBinding(thread);
                                        try {
                                            gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                                            SubLTrampolineFile.checkType($TRUE, TRUTH_P);
                                            {
                                                SubLObject _prev_bind_0_40 = gt_vars.$gt_truth$.currentBinding(thread);
                                                try {
                                                    gt_vars.$gt_truth$.bind($TRUE, thread);
                                                    superiorP = gt_search.gt_accessesP(spec, genl, UNPROVIDED);
                                                } finally {
                                                    gt_vars.$gt_truth$.rebind(_prev_bind_0_40, thread);
                                                }
                                            }
                                        } finally {
                                            gt_vars.$gt_mode$.rebind(_prev_bind_0_39, thread);
                                        }
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return superiorP;
            }
        }
    }

    /**
     * Returns is GENL superior to (i.e., hierarchically higher than) SPEC?
     */
    @LispMethod(comment = "Returns is GENL superior to (i.e., hierarchically higher than) SPEC?")
    public static SubLObject gtm_superiorP(final SubLObject genl, final SubLObject spec, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject superiorP = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($GT_ERROR);
                if (((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                    gt_utilities.gt_check_type_internal(spec, $GT_INDEX, THREE_INTEGER);
                }
                if (((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                    gt_utilities.gt_check_type_internal(genl, $GT_GATHER, THREE_INTEGER);
                }
                if (genl.eql(spec) && (NIL != kb_accessors.reflexive_predicateP(gt_vars.$gt_pred$.getDynamicValue(thread)))) {
                    superiorP = T;
                } else {
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($SUPERIOR))) {
                        Errors.error($str11$invalid_gt_mode___a, $SUPERIOR);
                    }
                    final SubLObject _prev_bind_0_$39 = gt_vars.$gt_mode$.currentBinding(thread);
                    try {
                        gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                        assert NIL != enumeration_types.truth_p($TRUE) : "! enumeration_types.truth_p( _KW.$TRUE) " + ("enumeration_types.truth_p(gt_methods.$kw12$TRUE) " + "CommonSymbols.NIL != enumeration_types.truth_p(gt_methods.$kw12$TRUE) ") + $TRUE;
                        final SubLObject _prev_bind_0_$40 = gt_vars.$gt_truth$.currentBinding(thread);
                        try {
                            gt_vars.$gt_truth$.bind($TRUE, thread);
                            superiorP = gt_search.gt_accessesP(spec, genl, UNPROVIDED);
                        } finally {
                            gt_vars.$gt_truth$.rebind(_prev_bind_0_$40, thread);
                        }
                    } finally {
                        gt_vars.$gt_mode$.rebind(_prev_bind_0_$39, thread);
                    }
                }
            } catch (final Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return superiorP;
    }

    /**
     * Returns justification of why SUPERIOR is superior to (i.e., hierarchically higher than)
     * INFERIOR
     */
    @LispMethod(comment = "Returns justification of why SUPERIOR is superior to (i.e., hierarchically higher than)\r\nINFERIOR\nReturns justification of why SUPERIOR is superior to (i.e., hierarchically higher than)\nINFERIOR")
    public static final SubLObject gt_why_superiorP_alt(SubLObject predicate, SubLObject superior, SubLObject inferior, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(predicate, FORT_P);
        SubLTrampolineFile.checkType(superior, GT_TERM_P);
        SubLTrampolineFile.checkType(inferior, GT_TERM_P);
        return transitivity.gtm(predicate, $kw81$WHY_SUPERIOR_, superior, inferior, mt, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Returns justification of why SUPERIOR is superior to (i.e., hierarchically higher than)\r\nINFERIOR\nReturns justification of why SUPERIOR is superior to (i.e., hierarchically higher than)\nINFERIOR")
    public static SubLObject gt_why_superiorP(final SubLObject predicate, final SubLObject superior, final SubLObject inferior, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(predicate, FORT_P);
        SubLTrampolineFile.enforceType(superior, GT_TERM_P);
        SubLTrampolineFile.enforceType(inferior, GT_TERM_P);
        return transitivity.gtm(predicate, $kw81$WHY_SUPERIOR_, superior, inferior, mt, UNPROVIDED, UNPROVIDED);
    }/**
     * Returns justification of why SUPERIOR is superior to (i.e., hierarchically higher than)
     * INFERIOR
     */


    public static final SubLObject gt_support_predicate_alt(SubLObject support) {
        return cycl_utilities.formula_operator(com.cyc.cycjava.cycl.gt_methods.gt_support_sentence(support));
    }

    public static SubLObject gt_support_predicate(final SubLObject support) {
        return cycl_utilities.formula_operator(gt_support_sentence(support));
    }

    public static final SubLObject gt_support_sentence_alt(SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            return assertions_high.assertion_formula(support);
        } else {
            if (NIL != arguments.hl_support_p(support)) {
                return arguments.support_sentence(support);
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject gt_support_sentence(final SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            return assertions_high.assertion_formula(support);
        }
        if (NIL != arguments.hl_support_p(support)) {
            return arguments.support_sentence(support);
        }
        return NIL;
    }

    /**
     * Returns justification of why GENL is superior to (i.e., hierarchically higher than) SPEC
     */
    @LispMethod(comment = "Returns justification of why GENL is superior to (i.e., hierarchically higher than) SPEC")
    public static final SubLObject gtm_why_superiorP_alt(SubLObject genl, SubLObject spec, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject just = NIL;
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
                            SubLObject catch_var = NIL;
                            try {
                                if (!(((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) || (NIL != Errors.$ignore_mustsP$.getDynamicValue(thread)))) {
                                    gt_utilities.gt_check_type_internal(spec, $GT_INDEX, THREE_INTEGER);
                                }
                                if (!(((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) || (NIL != Errors.$ignore_mustsP$.getDynamicValue(thread)))) {
                                    gt_utilities.gt_check_type_internal(genl, $GT_GATHER, THREE_INTEGER);
                                }
                                if ((genl == spec) && (NIL != kb_accessors.reflexive_predicateP(gt_vars.$gt_pred$.getDynamicValue(thread)))) {
                                    just = list(arguments.make_hl_support($REFLEXIVE, make_binary_formula(gt_vars.$gt_pred$.getDynamicValue(thread), spec, genl), mt, UNPROVIDED));
                                } else {
                                    if (NIL != gt_vars.$gt_use_spec_predsP$.getDynamicValue(thread)) {
                                        {
                                            SubLObject gt_supports = gt_search.gt_why_accessesP(spec, genl);
                                            SubLObject list_var = NIL;
                                            SubLObject gt_support = NIL;
                                            SubLObject n = NIL;
                                            for (list_var = gt_supports, gt_support = list_var.first(), n = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , gt_support = list_var.first() , n = add(ONE_INTEGER, n)) {
                                                just = cons(gt_support, just);
                                                {
                                                    SubLObject sentence = com.cyc.cycjava.cycl.gt_methods.gt_support_sentence(gt_support);
                                                    SubLObject pred = cycl_utilities.formula_operator(sentence);
                                                    if (gt_vars.$gt_pred$.getDynamicValue(thread) != pred) {
                                                        {
                                                            SubLObject arg2 = cycl_utilities.formula_arg2(sentence, UNPROVIDED);
                                                            if (n.isZero()) {
                                                                if (arg2 == genl) {
                                                                    {
                                                                        SubLObject item_var = arguments.make_hl_support($GENLPREDS, make_binary_formula($$genlInverse, pred, gt_vars.$gt_pred$.getDynamicValue(thread)), mt, UNPROVIDED);
                                                                        if (NIL == member(item_var, just, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                            just = cons(item_var, just);
                                                                        }
                                                                    }
                                                                } else {
                                                                    {
                                                                        SubLObject item_var = arguments.make_hl_support($GENLPREDS, make_binary_formula($$genlPreds, pred, gt_vars.$gt_pred$.getDynamicValue(thread)), mt, UNPROVIDED);
                                                                        if (NIL == member(item_var, just, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                            just = cons(item_var, just);
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                {
                                                                    SubLObject prev_sentence = com.cyc.cycjava.cycl.gt_methods.gt_support_sentence(nth(subtract(n, ONE_INTEGER), gt_supports));
                                                                    SubLObject prev_arg2 = cycl_utilities.formula_arg2(prev_sentence, UNPROVIDED);
                                                                    if (arg2 == prev_arg2) {
                                                                        {
                                                                            SubLObject item_var = arguments.make_hl_support($GENLPREDS, make_binary_formula($$genlInverse, pred, gt_vars.$gt_pred$.getDynamicValue(thread)), mt, UNPROVIDED);
                                                                            if (NIL == member(item_var, just, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                                just = cons(item_var, just);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        {
                                                                            SubLObject item_var = arguments.make_hl_support($GENLPREDS, make_binary_formula($$genlPreds, pred, gt_vars.$gt_pred$.getDynamicValue(thread)), mt, UNPROVIDED);
                                                                            if (NIL == member(item_var, just, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                                just = cons(item_var, just);
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
                                        just = nreverse(just);
                                    } else {
                                        just = gt_search.gt_why_accessesP(spec, genl);
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return just;
            }
        }
    }

    /**
     * Returns justification of why GENL is superior to (i.e., hierarchically higher than) SPEC
     */
    @LispMethod(comment = "Returns justification of why GENL is superior to (i.e., hierarchically higher than) SPEC")
    public static SubLObject gtm_why_superiorP(final SubLObject genl, final SubLObject spec, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject just = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($GT_ERROR);
                if (((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                    gt_utilities.gt_check_type_internal(spec, $GT_INDEX, THREE_INTEGER);
                }
                if (((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                    gt_utilities.gt_check_type_internal(genl, $GT_GATHER, THREE_INTEGER);
                }
                if (genl.eql(spec) && (NIL != kb_accessors.reflexive_predicateP(gt_vars.$gt_pred$.getDynamicValue(thread)))) {
                    just = list(arguments.make_hl_support($REFLEXIVE, make_binary_formula(gt_vars.$gt_pred$.getDynamicValue(thread), spec, genl), mt, UNPROVIDED));
                } else
                    if (NIL != gt_vars.$gt_use_spec_predsP$.getDynamicValue(thread)) {
                        final SubLObject gt_supports = gt_search.gt_why_accessesP(spec, genl);
                        SubLObject list_var = NIL;
                        SubLObject gt_support = NIL;
                        SubLObject n = NIL;
                        list_var = gt_supports;
                        gt_support = list_var.first();
                        for (n = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , gt_support = list_var.first() , n = add(ONE_INTEGER, n)) {
                            just = cons(gt_support, just);
                            final SubLObject sentence = gt_support_sentence(gt_support);
                            final SubLObject pred = cycl_utilities.formula_operator(sentence);
                            if (!gt_vars.$gt_pred$.getDynamicValue(thread).eql(pred)) {
                                final SubLObject arg2 = cycl_utilities.formula_arg2(sentence, UNPROVIDED);
                                if (n.isZero()) {
                                    if (arg2.eql(genl)) {
                                        final SubLObject item_var = arguments.make_hl_support($GENLPREDS, make_binary_formula($$genlInverse, pred, gt_vars.$gt_pred$.getDynamicValue(thread)), mt, UNPROVIDED);
                                        if (NIL == member(item_var, just, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                            just = cons(item_var, just);
                                        }
                                    } else {
                                        final SubLObject item_var = arguments.make_hl_support($GENLPREDS, make_binary_formula($$genlPreds, pred, gt_vars.$gt_pred$.getDynamicValue(thread)), mt, UNPROVIDED);
                                        if (NIL == member(item_var, just, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                            just = cons(item_var, just);
                                        }
                                    }
                                } else {
                                    final SubLObject prev_sentence = gt_support_sentence(nth(subtract(n, ONE_INTEGER), gt_supports));
                                    final SubLObject prev_arg2 = cycl_utilities.formula_arg2(prev_sentence, UNPROVIDED);
                                    if (arg2.eql(prev_arg2)) {
                                        final SubLObject item_var2 = arguments.make_hl_support($GENLPREDS, make_binary_formula($$genlInverse, pred, gt_vars.$gt_pred$.getDynamicValue(thread)), mt, UNPROVIDED);
                                        if (NIL == member(item_var2, just, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                            just = cons(item_var2, just);
                                        }
                                    } else {
                                        final SubLObject item_var2 = arguments.make_hl_support($GENLPREDS, make_binary_formula($$genlPreds, pred, gt_vars.$gt_pred$.getDynamicValue(thread)), mt, UNPROVIDED);
                                        if (NIL == member(item_var2, just, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                            just = cons(item_var2, just);
                                        }
                                    }
                                }
                            }
                        }
                        just = nreverse(just);
                    } else {
                        just = gt_search.gt_why_accessesP(spec, genl);
                    }

            } catch (final Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return just;
    }

    /**
     * Returns whether fort INFERIOR hierarchically inferior
     * (wrt transitive PREDICATE) to fort SUPERIOR
     */
    @LispMethod(comment = "Returns whether fort INFERIOR hierarchically inferior\r\n(wrt transitive PREDICATE) to fort SUPERIOR\nReturns whether fort INFERIOR hierarchically inferior\n(wrt transitive PREDICATE) to fort SUPERIOR")
    public static final SubLObject gt_inferiorP_alt(SubLObject predicate, SubLObject inferior, SubLObject superior, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return transitivity.gtm(predicate, $INFERIOR_, inferior, superior, mt, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Returns whether fort INFERIOR hierarchically inferior\r\n(wrt transitive PREDICATE) to fort SUPERIOR\nReturns whether fort INFERIOR hierarchically inferior\n(wrt transitive PREDICATE) to fort SUPERIOR")
    public static SubLObject gt_inferiorP(final SubLObject predicate, final SubLObject inferior, final SubLObject superior, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return transitivity.gtm(predicate, $INFERIOR_, inferior, superior, mt, UNPROVIDED, UNPROVIDED);
    }/**
     * Returns whether fort INFERIOR hierarchically inferior
     * (wrt transitive PREDICATE) to fort SUPERIOR
     */


    /**
     * is SPEC inferior to (i.e., hierarchically lower than) GENL?
     */
    @LispMethod(comment = "is SPEC inferior to (i.e., hierarchically lower than) GENL?")
    public static final SubLObject gtm_inferiorP_alt(SubLObject spec, SubLObject genl, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.gt_methods.gtm_superiorP(genl, spec, mt);
    }

    @LispMethod(comment = "is SPEC inferior to (i.e., hierarchically lower than) GENL?")
    public static SubLObject gtm_inferiorP(final SubLObject spec, final SubLObject genl, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return gtm_superiorP(genl, spec, mt);
    }/**
     * is SPEC inferior to (i.e., hierarchically lower than) GENL?
     */


    /**
     * Returns whetherfort INFERIOR is hierarchically lower (wrt transitive PREDICATE)
     * to fort SUPERIOR?
     */
    @LispMethod(comment = "Returns whetherfort INFERIOR is hierarchically lower (wrt transitive PREDICATE)\r\nto fort SUPERIOR?\nReturns whetherfort INFERIOR is hierarchically lower (wrt transitive PREDICATE)\nto fort SUPERIOR?")
    public static final SubLObject gt_has_superiorP_alt(SubLObject predicate, SubLObject inferior, SubLObject superior, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(predicate, FORT_P);
        SubLTrampolineFile.checkType(inferior, GT_TERM_P);
        SubLTrampolineFile.checkType(superior, GT_TERM_P);
        return transitivity.gtm(predicate, $kw92$HAS_SUPERIOR_, inferior, superior, mt, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Returns whetherfort INFERIOR is hierarchically lower (wrt transitive PREDICATE)\r\nto fort SUPERIOR?\nReturns whetherfort INFERIOR is hierarchically lower (wrt transitive PREDICATE)\nto fort SUPERIOR?")
    public static SubLObject gt_has_superiorP(final SubLObject predicate, final SubLObject inferior, final SubLObject superior, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(predicate, FORT_P);
        SubLTrampolineFile.enforceType(inferior, GT_TERM_P);
        SubLTrampolineFile.enforceType(superior, GT_TERM_P);
        return transitivity.gtm(predicate, $kw92$HAS_SUPERIOR_, inferior, superior, mt, UNPROVIDED, UNPROVIDED);
    }/**
     * Returns whetherfort INFERIOR is hierarchically lower (wrt transitive PREDICATE)
     * to fort SUPERIOR?
     */


    /**
     * Returns whether SPEC is inferior to (i.e., hierarchically lower than) GENL?
     */
    @LispMethod(comment = "Returns whether SPEC is inferior to (i.e., hierarchically lower than) GENL?")
    public static final SubLObject gtm_has_superiorP_alt(SubLObject spec, SubLObject genl, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.gt_methods.gtm_superiorP(genl, spec, mt);
    }

    @LispMethod(comment = "Returns whether SPEC is inferior to (i.e., hierarchically lower than) GENL?")
    public static SubLObject gtm_has_superiorP(final SubLObject spec, final SubLObject genl, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return gtm_superiorP(genl, spec, mt);
    }/**
     * Returns whether SPEC is inferior to (i.e., hierarchically lower than) GENL?
     */


    /**
     * Returns whether fort SUPERIOR is hierarchically higher
     * (wrt transitive PREDICATE) to fort INFERIOR?
     */
    @LispMethod(comment = "Returns whether fort SUPERIOR is hierarchically higher\r\n(wrt transitive PREDICATE) to fort INFERIOR?\nReturns whether fort SUPERIOR is hierarchically higher\n(wrt transitive PREDICATE) to fort INFERIOR?")
    public static final SubLObject gt_has_inferiorP_alt(SubLObject predicate, SubLObject superior, SubLObject inferior, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(predicate, FORT_P);
        SubLTrampolineFile.checkType(superior, GT_TERM_P);
        SubLTrampolineFile.checkType(inferior, GT_TERM_P);
        return transitivity.gtm(predicate, $kw92$HAS_SUPERIOR_, inferior, superior, mt, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Returns whether fort SUPERIOR is hierarchically higher\r\n(wrt transitive PREDICATE) to fort INFERIOR?\nReturns whether fort SUPERIOR is hierarchically higher\n(wrt transitive PREDICATE) to fort INFERIOR?")
    public static SubLObject gt_has_inferiorP(final SubLObject predicate, final SubLObject superior, final SubLObject inferior, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(predicate, FORT_P);
        SubLTrampolineFile.enforceType(superior, GT_TERM_P);
        SubLTrampolineFile.enforceType(inferior, GT_TERM_P);
        return transitivity.gtm(predicate, $kw92$HAS_SUPERIOR_, inferior, superior, mt, UNPROVIDED, UNPROVIDED);
    }/**
     * Returns whether fort SUPERIOR is hierarchically higher
     * (wrt transitive PREDICATE) to fort INFERIOR?
     */


    /**
     * Returns whether SPEC is inferior to (i.e., hierarchically lower than) GENL?
     */
    @LispMethod(comment = "Returns whether SPEC is inferior to (i.e., hierarchically lower than) GENL?")
    public static final SubLObject gtm_has_inferiorP_alt(SubLObject genl, SubLObject spec, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.gt_methods.gtm_superiorP(genl, spec, mt);
    }

    @LispMethod(comment = "Returns whether SPEC is inferior to (i.e., hierarchically lower than) GENL?")
    public static SubLObject gtm_has_inferiorP(final SubLObject genl, final SubLObject spec, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return gtm_superiorP(genl, spec, mt);
    }/**
     * Returns whether SPEC is inferior to (i.e., hierarchically lower than) GENL?
     */


    /**
     * Returns first non-nil result of applying GATHER-FN to the inferiors of GENL.
     */
    @LispMethod(comment = "Returns first non-nil result of applying GATHER-FN to the inferiors of GENL.")
    public static final SubLObject gt_gather_inferior_alt(SubLObject predicate, SubLObject genl, SubLObject gather_fn, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return transitivity.gtm(predicate, $GATHER_INFERIOR, genl, gather_fn, mt, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Returns first non-nil result of applying GATHER-FN to the inferiors of GENL.")
    public static SubLObject gt_gather_inferior(final SubLObject predicate, final SubLObject genl, final SubLObject gather_fn, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return transitivity.gtm(predicate, $GATHER_INFERIOR, genl, gather_fn, mt, UNPROVIDED, UNPROVIDED);
    }/**
     * Returns first non-nil result of applying GATHER-FN to the inferiors of GENL.
     */


    public static final SubLObject gtm_gather_inferior_alt(SubLObject genl, SubLObject gather_fn, SubLObject mt) {
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
                        {
                            SubLObject catch_var = NIL;
                            try {
                                if (NIL != funcall(gather_fn, genl)) {
                                    result = T;
                                } else {
                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                        if (NIL == gt_utilities.gt_modeP($INFERIOR)) {
                                            Errors.error($str_alt11$invalid_gt_mode___a, $INFERIOR);
                                        }
                                    }
                                    {
                                        SubLObject _prev_bind_0_41 = gt_vars.$gt_mode$.currentBinding(thread);
                                        try {
                                            gt_vars.$gt_mode$.bind($INFERIOR, thread);
                                            SubLTrampolineFile.checkType($TRUE, TRUTH_P);
                                            {
                                                SubLObject _prev_bind_0_42 = gt_vars.$gt_truth$.currentBinding(thread);
                                                try {
                                                    gt_vars.$gt_truth$.bind($TRUE, thread);
                                                    result = gt_search.gt_gather(genl, gather_fn);
                                                } finally {
                                                    gt_vars.$gt_truth$.rebind(_prev_bind_0_42, thread);
                                                }
                                            }
                                        } finally {
                                            gt_vars.$gt_mode$.rebind(_prev_bind_0_41, thread);
                                        }
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
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

    public static SubLObject gtm_gather_inferior(final SubLObject genl, final SubLObject gather_fn, SubLObject mt) {
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
            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($GT_ERROR);
                if (NIL != funcall(gather_fn, genl)) {
                    result = T;
                } else {
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($INFERIOR))) {
                        Errors.error($str11$invalid_gt_mode___a, $INFERIOR);
                    }
                    final SubLObject _prev_bind_0_$41 = gt_vars.$gt_mode$.currentBinding(thread);
                    try {
                        gt_vars.$gt_mode$.bind($INFERIOR, thread);
                        assert NIL != enumeration_types.truth_p($TRUE) : "! enumeration_types.truth_p( _KW.$TRUE) " + ("enumeration_types.truth_p(gt_methods.$kw12$TRUE) " + "CommonSymbols.NIL != enumeration_types.truth_p(gt_methods.$kw12$TRUE) ") + $TRUE;
                        final SubLObject _prev_bind_0_$42 = gt_vars.$gt_truth$.currentBinding(thread);
                        try {
                            gt_vars.$gt_truth$.bind($TRUE, thread);
                            result = gt_search.gt_gather(genl, gather_fn);
                        } finally {
                            gt_vars.$gt_truth$.rebind(_prev_bind_0_$42, thread);
                        }
                    } finally {
                        gt_vars.$gt_mode$.rebind(_prev_bind_0_$41, thread);
                    }
                }
            } catch (final Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Returns first non-nil result of applying GATHER-FN to the superiors of GENL.
     */
    @LispMethod(comment = "Returns first non-nil result of applying GATHER-FN to the superiors of GENL.")
    public static final SubLObject gt_gather_superior_alt(SubLObject predicate, SubLObject spec, SubLObject gather_fn, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return transitivity.gtm(predicate, $GATHER_SUPERIOR, spec, gather_fn, mt, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Returns first non-nil result of applying GATHER-FN to the superiors of GENL.")
    public static SubLObject gt_gather_superior(final SubLObject predicate, final SubLObject spec, final SubLObject gather_fn, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return transitivity.gtm(predicate, $GATHER_SUPERIOR, spec, gather_fn, mt, UNPROVIDED, UNPROVIDED);
    }/**
     * Returns first non-nil result of applying GATHER-FN to the superiors of GENL.
     */


    public static final SubLObject gtm_gather_superior_alt(SubLObject spec, SubLObject gather_fn, SubLObject mt) {
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
                        {
                            SubLObject catch_var = NIL;
                            try {
                                if (NIL != funcall(gather_fn, spec)) {
                                    result = T;
                                } else {
                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                        if (NIL == gt_utilities.gt_modeP($SUPERIOR)) {
                                            Errors.error($str_alt11$invalid_gt_mode___a, $SUPERIOR);
                                        }
                                    }
                                    {
                                        SubLObject _prev_bind_0_43 = gt_vars.$gt_mode$.currentBinding(thread);
                                        try {
                                            gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                                            SubLTrampolineFile.checkType($TRUE, TRUTH_P);
                                            {
                                                SubLObject _prev_bind_0_44 = gt_vars.$gt_truth$.currentBinding(thread);
                                                try {
                                                    gt_vars.$gt_truth$.bind($TRUE, thread);
                                                    result = gt_search.gt_gather(spec, gather_fn);
                                                } finally {
                                                    gt_vars.$gt_truth$.rebind(_prev_bind_0_44, thread);
                                                }
                                            }
                                        } finally {
                                            gt_vars.$gt_mode$.rebind(_prev_bind_0_43, thread);
                                        }
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
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

    public static SubLObject gtm_gather_superior(final SubLObject spec, final SubLObject gather_fn, SubLObject mt) {
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
            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($GT_ERROR);
                if (NIL != funcall(gather_fn, spec)) {
                    result = T;
                } else {
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($SUPERIOR))) {
                        Errors.error($str11$invalid_gt_mode___a, $SUPERIOR);
                    }
                    final SubLObject _prev_bind_0_$43 = gt_vars.$gt_mode$.currentBinding(thread);
                    try {
                        gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                        assert NIL != enumeration_types.truth_p($TRUE) : "! enumeration_types.truth_p( _KW.$TRUE) " + ("enumeration_types.truth_p(gt_methods.$kw12$TRUE) " + "CommonSymbols.NIL != enumeration_types.truth_p(gt_methods.$kw12$TRUE) ") + $TRUE;
                        final SubLObject _prev_bind_0_$44 = gt_vars.$gt_truth$.currentBinding(thread);
                        try {
                            gt_vars.$gt_truth$.bind($TRUE, thread);
                            result = gt_search.gt_gather(spec, gather_fn);
                        } finally {
                            gt_vars.$gt_truth$.rebind(_prev_bind_0_$44, thread);
                        }
                    } finally {
                        gt_vars.$gt_mode$.rebind(_prev_bind_0_$43, thread);
                    }
                }
            } catch (final Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Returns whether FORT is accessible from itself by one or more PREDICATE gafs?
     */
    @LispMethod(comment = "Returns whether FORT is accessible from itself by one or more PREDICATE gafs?")
    public static final SubLObject gt_cyclesP_alt(SubLObject predicate, SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(predicate, FORT_P);
        SubLTrampolineFile.checkType(fort, GT_TERM_P);
        return transitivity.gtm(predicate, $CYCLES_, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Returns whether FORT is accessible from itself by one or more PREDICATE gafs?")
    public static SubLObject gt_cyclesP(final SubLObject predicate, final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(predicate, FORT_P);
        SubLTrampolineFile.enforceType(fort, GT_TERM_P);
        return transitivity.gtm(predicate, $CYCLES_, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }/**
     * Returns whether FORT is accessible from itself by one or more PREDICATE gafs?
     */


    /**
     * Returns whether TERM is accessible from itself by one or more positive gt links?
     */
    @LispMethod(comment = "Returns whether TERM is accessible from itself by one or more positive gt links?")
    public static final SubLObject gtm_cyclesP_alt(SubLObject v_term, SubLObject mt, SubLObject validateP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (validateP == UNPROVIDED) {
            validateP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cyclesP = NIL;
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
                            SubLObject catch_var = NIL;
                            try {
                                {
                                    SubLObject _prev_bind_0_45 = gt_vars.$gt_test_level$.currentBinding(thread);
                                    try {
                                        gt_vars.$gt_test_level$.bind(NIL != validateP ? ((SubLObject) (gt_vars.$gt_test_level$.getDynamicValue(thread))) : ZERO_INTEGER, thread);
                                        if (!(((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) || (NIL != Errors.$ignore_mustsP$.getDynamicValue(thread)))) {
                                            gt_utilities.gt_check_type_internal(v_term, $GT_INDEX, THREE_INTEGER);
                                        }
                                        if (!(((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) || (NIL != Errors.$ignore_mustsP$.getDynamicValue(thread)))) {
                                            gt_utilities.gt_check_type_internal(v_term, $GT_GATHER, THREE_INTEGER);
                                        }
                                    } finally {
                                        gt_vars.$gt_test_level$.rebind(_prev_bind_0_45, thread);
                                    }
                                }
                                try {
                                    cyclesP = gt_search.gt_accessesP(v_term, v_term, UNPROVIDED);
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_46 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            clrhash(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_46, thread);
                                        }
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return cyclesP;
            }
        }
    }

    @LispMethod(comment = "Returns whether TERM is accessible from itself by one or more positive gt links?")
    public static SubLObject gtm_cyclesP(final SubLObject v_term, SubLObject mt, SubLObject validateP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (validateP == UNPROVIDED) {
            validateP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cyclesP = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($GT_ERROR);
                final SubLObject _prev_bind_0_$45 = gt_vars.$gt_test_level$.currentBinding(thread);
                try {
                    gt_vars.$gt_test_level$.bind(NIL != validateP ? gt_vars.$gt_test_level$.getDynamicValue(thread) : ZERO_INTEGER, thread);
                    if (((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                        gt_utilities.gt_check_type_internal(v_term, $GT_INDEX, THREE_INTEGER);
                    }
                    if (((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                        gt_utilities.gt_check_type_internal(v_term, $GT_GATHER, THREE_INTEGER);
                    }
                } finally {
                    gt_vars.$gt_test_level$.rebind(_prev_bind_0_$45, thread);
                }
                try {
                    cyclesP = gt_search.gt_accessesP(v_term, v_term, UNPROVIDED);
                } finally {
                    final SubLObject _prev_bind_0_$46 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        clrhash(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                    }
                }
            } catch (final Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return cyclesP;
    }/**
     * Returns whether TERM is accessible from itself by one or more positive gt links?
     */


    /**
     * Returns whether a transitive path connect FORT2 to FORT1,
     * or whether a transitive inverse path connect FORT1 to FORT2?
     */
    @LispMethod(comment = "Returns whether a transitive path connect FORT2 to FORT1,\r\nor whether a transitive inverse path connect FORT1 to FORT2?\nReturns whether a transitive path connect FORT2 to FORT1,\nor whether a transitive inverse path connect FORT1 to FORT2?")
    public static final SubLObject gt_completes_cycleP_alt(SubLObject predicate, SubLObject fort1, SubLObject fort2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(predicate, FORT_P);
        SubLTrampolineFile.checkType(fort1, GT_TERM_P);
        SubLTrampolineFile.checkType(fort2, GT_TERM_P);
        return transitivity.gtm(predicate, $kw105$COMPLETES_CYCLE_, fort1, fort2, mt, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Returns whether a transitive path connect FORT2 to FORT1,\r\nor whether a transitive inverse path connect FORT1 to FORT2?\nReturns whether a transitive path connect FORT2 to FORT1,\nor whether a transitive inverse path connect FORT1 to FORT2?")
    public static SubLObject gt_completes_cycleP(final SubLObject predicate, final SubLObject fort1, final SubLObject fort2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(predicate, FORT_P);
        SubLTrampolineFile.enforceType(fort1, GT_TERM_P);
        SubLTrampolineFile.enforceType(fort2, GT_TERM_P);
        return transitivity.gtm(predicate, $kw105$COMPLETES_CYCLE_, fort1, fort2, mt, UNPROVIDED, UNPROVIDED);
    }/**
     * Returns whether a transitive path connect FORT2 to FORT1,
     * or whether a transitive inverse path connect FORT1 to FORT2?
     */


    /**
     * does a transitive path connect ARG2 to ARG1,
     * or does a transitive inverse path connect ARG1 to ARG2?
     */
    @LispMethod(comment = "does a transitive path connect ARG2 to ARG1,\r\nor does a transitive inverse path connect ARG1 to ARG2?\ndoes a transitive path connect ARG2 to ARG1,\nor does a transitive inverse path connect ARG1 to ARG2?")
    public static final SubLObject gtm_completes_cycleP_alt(SubLObject arg1, SubLObject arg2, SubLObject mt, SubLObject validateP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (validateP == UNPROVIDED) {
            validateP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cyclesP = NIL;
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
                            SubLObject start = NIL;
                            SubLObject target = NIL;
                            if (gt_vars.$gt_index_arg$.getDynamicValue(thread).numE(ONE_INTEGER)) {
                                start = arg2;
                                target = arg1;
                            } else {
                                start = arg1;
                                target = arg2;
                            }
                            {
                                SubLObject catch_var = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_47 = gt_vars.$gt_test_level$.currentBinding(thread);
                                        try {
                                            gt_vars.$gt_test_level$.bind(NIL != validateP ? ((SubLObject) (gt_vars.$gt_test_level$.getDynamicValue(thread))) : ZERO_INTEGER, thread);
                                            if (!(((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) || (NIL != Errors.$ignore_mustsP$.getDynamicValue(thread)))) {
                                                gt_utilities.gt_check_type_internal(start, $GT_INDEX, THREE_INTEGER);
                                            }
                                            if (!(((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) || (NIL != Errors.$ignore_mustsP$.getDynamicValue(thread)))) {
                                                gt_utilities.gt_check_type_internal(target, $GT_GATHER, THREE_INTEGER);
                                            }
                                        } finally {
                                            gt_vars.$gt_test_level$.rebind(_prev_bind_0_47, thread);
                                        }
                                    }
                                    cyclesP = gt_search.gt_accessesP(start, target, UNPROVIDED);
                                } catch (Throwable ccatch_env_var) {
                                    catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return cyclesP;
            }
        }
    }

    @LispMethod(comment = "does a transitive path connect ARG2 to ARG1,\r\nor does a transitive inverse path connect ARG1 to ARG2?\ndoes a transitive path connect ARG2 to ARG1,\nor does a transitive inverse path connect ARG1 to ARG2?")
    public static SubLObject gtm_completes_cycleP(final SubLObject arg1, final SubLObject arg2, SubLObject mt, SubLObject validateP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (validateP == UNPROVIDED) {
            validateP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cyclesP = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject start = NIL;
            SubLObject target = NIL;
            if (gt_vars.$gt_index_arg$.getDynamicValue(thread).numE(ONE_INTEGER)) {
                start = arg2;
                target = arg1;
            } else {
                start = arg1;
                target = arg2;
            }
            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($GT_ERROR);
                final SubLObject _prev_bind_0_$47 = gt_vars.$gt_test_level$.currentBinding(thread);
                try {
                    gt_vars.$gt_test_level$.bind(NIL != validateP ? gt_vars.$gt_test_level$.getDynamicValue(thread) : ZERO_INTEGER, thread);
                    if (((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                        gt_utilities.gt_check_type_internal(start, $GT_INDEX, THREE_INTEGER);
                    }
                    if (((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                        gt_utilities.gt_check_type_internal(target, $GT_GATHER, THREE_INTEGER);
                    }
                } finally {
                    gt_vars.$gt_test_level$.rebind(_prev_bind_0_$47, thread);
                }
                cyclesP = gt_search.gt_accessesP(start, target, UNPROVIDED);
            } catch (final Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return cyclesP;
    }/**
     * does a transitive path connect ARG2 to ARG1,
     * or does a transitive inverse path connect ARG1 to ARG2?
     */


    /**
     * Returns justification that a transitive path connects FORT2 to FORT1,
     * or that a transitive inverse path connects FORT1 to FORT2?
     */
    @LispMethod(comment = "Returns justification that a transitive path connects FORT2 to FORT1,\r\nor that a transitive inverse path connects FORT1 to FORT2?\nReturns justification that a transitive path connects FORT2 to FORT1,\nor that a transitive inverse path connects FORT1 to FORT2?")
    public static final SubLObject gt_why_completes_cycleP_alt(SubLObject predicate, SubLObject fort1, SubLObject fort2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(predicate, FORT_P);
        SubLTrampolineFile.checkType(fort1, GT_TERM_P);
        SubLTrampolineFile.checkType(fort2, GT_TERM_P);
        return transitivity.gtm(predicate, $kw110$WHY_COMPLETES_CYCLE_, fort1, fort2, mt, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Returns justification that a transitive path connects FORT2 to FORT1,\r\nor that a transitive inverse path connects FORT1 to FORT2?\nReturns justification that a transitive path connects FORT2 to FORT1,\nor that a transitive inverse path connects FORT1 to FORT2?")
    public static SubLObject gt_why_completes_cycleP(final SubLObject predicate, final SubLObject fort1, final SubLObject fort2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(predicate, FORT_P);
        SubLTrampolineFile.enforceType(fort1, GT_TERM_P);
        SubLTrampolineFile.enforceType(fort2, GT_TERM_P);
        return transitivity.gtm(predicate, $kw110$WHY_COMPLETES_CYCLE_, fort1, fort2, mt, UNPROVIDED, UNPROVIDED);
    }/**
     * Returns justification that a transitive path connects FORT2 to FORT1,
     * or that a transitive inverse path connects FORT1 to FORT2?
     */


    /**
     * does a transitive path connect ARG2 to ARG1,
     * or does a transitive inverse path connect ARG1 to ARG2?
     */
    @LispMethod(comment = "does a transitive path connect ARG2 to ARG1,\r\nor does a transitive inverse path connect ARG1 to ARG2?\ndoes a transitive path connect ARG2 to ARG1,\nor does a transitive inverse path connect ARG1 to ARG2?")
    public static final SubLObject gtm_why_completes_cycleP_alt(SubLObject arg1, SubLObject arg2, SubLObject mt, SubLObject validateP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (validateP == UNPROVIDED) {
            validateP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject just = NIL;
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
                            SubLObject start = NIL;
                            SubLObject target = NIL;
                            if (gt_vars.$gt_index_arg$.getDynamicValue(thread).numE(ONE_INTEGER)) {
                                start = arg2;
                                target = arg1;
                            } else {
                                start = arg1;
                                target = arg2;
                            }
                            {
                                SubLObject catch_var = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_48 = gt_vars.$gt_test_level$.currentBinding(thread);
                                        try {
                                            gt_vars.$gt_test_level$.bind(NIL != validateP ? ((SubLObject) (gt_vars.$gt_test_level$.getDynamicValue(thread))) : ZERO_INTEGER, thread);
                                            if (!(((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) || (NIL != Errors.$ignore_mustsP$.getDynamicValue(thread)))) {
                                                gt_utilities.gt_check_type_internal(start, $GT_INDEX, THREE_INTEGER);
                                            }
                                            if (!(((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) || (NIL != Errors.$ignore_mustsP$.getDynamicValue(thread)))) {
                                                gt_utilities.gt_check_type_internal(target, $GT_GATHER, THREE_INTEGER);
                                            }
                                        } finally {
                                            gt_vars.$gt_test_level$.rebind(_prev_bind_0_48, thread);
                                        }
                                    }
                                    SubLTrampolineFile.checkType($TRUE, TRUTH_P);
                                    {
                                        SubLObject _prev_bind_0_49 = gt_vars.$gt_truth$.currentBinding(thread);
                                        try {
                                            gt_vars.$gt_truth$.bind($TRUE, thread);
                                            just = gt_search.gt_why_accessesP(start, target);
                                            if (NIL != gt_vars.$gt_use_spec_predsP$.getDynamicValue(thread)) {
                                                {
                                                    SubLObject result = NIL;
                                                    SubLObject cdolist_list_var = just;
                                                    SubLObject support = NIL;
                                                    for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                                                        result = cons(support, result);
                                                        {
                                                            SubLObject pred = com.cyc.cycjava.cycl.gt_methods.gt_support_predicate(support);
                                                            if (gt_vars.$gt_pred$.getDynamicValue(thread) != pred) {
                                                                {
                                                                    SubLObject cdolist_list_var_50 = genl_predicates.why_genl_predicateP(pred, gt_vars.$gt_pred$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    SubLObject gp_support = NIL;
                                                                    for (gp_support = cdolist_list_var_50.first(); NIL != cdolist_list_var_50; cdolist_list_var_50 = cdolist_list_var_50.rest() , gp_support = cdolist_list_var_50.first()) {
                                                                        {
                                                                            SubLObject gaf = gp_support.first();
                                                                            SubLObject relevant_gp_assertion = NIL;
                                                                            if (NIL == relevant_gp_assertion) {
                                                                                {
                                                                                    SubLObject csome_list_var = kb_indexing.find_all_assertions(clause_utilities.make_gaf_cnf(gaf));
                                                                                    SubLObject gp_assertion = NIL;
                                                                                    for (gp_assertion = csome_list_var.first(); !((NIL != relevant_gp_assertion) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , gp_assertion = csome_list_var.first()) {
                                                                                        if (NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(gp_assertion))) {
                                                                                            relevant_gp_assertion = gp_assertion;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (NIL != relevant_gp_assertion) {
                                                                                {
                                                                                    SubLObject item_var = relevant_gp_assertion;
                                                                                    if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                        result = cons(item_var, result);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    just = nreverse(result);
                                                }
                                            }
                                        } finally {
                                            gt_vars.$gt_truth$.rebind(_prev_bind_0_49, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return just;
            }
        }
    }

    @LispMethod(comment = "does a transitive path connect ARG2 to ARG1,\r\nor does a transitive inverse path connect ARG1 to ARG2?\ndoes a transitive path connect ARG2 to ARG1,\nor does a transitive inverse path connect ARG1 to ARG2?")
    public static SubLObject gtm_why_completes_cycleP(final SubLObject arg1, final SubLObject arg2, SubLObject mt, SubLObject validateP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (validateP == UNPROVIDED) {
            validateP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject just = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject start = NIL;
            SubLObject target = NIL;
            if (gt_vars.$gt_index_arg$.getDynamicValue(thread).numE(ONE_INTEGER)) {
                start = arg2;
                target = arg1;
            } else {
                start = arg1;
                target = arg2;
            }
            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($GT_ERROR);
                final SubLObject _prev_bind_0_$48 = gt_vars.$gt_test_level$.currentBinding(thread);
                try {
                    gt_vars.$gt_test_level$.bind(NIL != validateP ? gt_vars.$gt_test_level$.getDynamicValue(thread) : ZERO_INTEGER, thread);
                    if (((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                        gt_utilities.gt_check_type_internal(start, $GT_INDEX, THREE_INTEGER);
                    }
                    if (((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                        gt_utilities.gt_check_type_internal(target, $GT_GATHER, THREE_INTEGER);
                    }
                } finally {
                    gt_vars.$gt_test_level$.rebind(_prev_bind_0_$48, thread);
                }
                assert NIL != enumeration_types.truth_p($TRUE) : "! enumeration_types.truth_p( _KW.$TRUE) " + ("enumeration_types.truth_p(gt_methods.$kw12$TRUE) " + "CommonSymbols.NIL != enumeration_types.truth_p(gt_methods.$kw12$TRUE) ") + $TRUE;
                final SubLObject _prev_bind_0_$49 = gt_vars.$gt_truth$.currentBinding(thread);
                try {
                    gt_vars.$gt_truth$.bind($TRUE, thread);
                    just = gt_search.gt_why_accessesP(start, target);
                    if (NIL != gt_vars.$gt_use_spec_predsP$.getDynamicValue(thread)) {
                        SubLObject result = NIL;
                        SubLObject cdolist_list_var = just;
                        SubLObject support = NIL;
                        support = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            result = cons(support, result);
                            final SubLObject pred = gt_support_predicate(support);
                            if (!gt_vars.$gt_pred$.getDynamicValue(thread).eql(pred)) {
                                SubLObject cdolist_list_var_$50 = genl_predicates.why_genl_predicateP(pred, gt_vars.$gt_pred$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject gp_support = NIL;
                                gp_support = cdolist_list_var_$50.first();
                                while (NIL != cdolist_list_var_$50) {
                                    final SubLObject gaf = gp_support.first();
                                    SubLObject relevant_gp_assertion = NIL;
                                    if (NIL == relevant_gp_assertion) {
                                        SubLObject csome_list_var = kb_indexing.find_all_assertions(clause_utilities.make_gaf_cnf(gaf));
                                        SubLObject gp_assertion = NIL;
                                        gp_assertion = csome_list_var.first();
                                        while ((NIL == relevant_gp_assertion) && (NIL != csome_list_var)) {
                                            if (NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(gp_assertion))) {
                                                relevant_gp_assertion = gp_assertion;
                                            }
                                            csome_list_var = csome_list_var.rest();
                                            gp_assertion = csome_list_var.first();
                                        } 
                                    }
                                    if (NIL != relevant_gp_assertion) {
                                        final SubLObject item_var = relevant_gp_assertion;
                                        if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            result = cons(item_var, result);
                                        }
                                    }
                                    cdolist_list_var_$50 = cdolist_list_var_$50.rest();
                                    gp_support = cdolist_list_var_$50.first();
                                } 
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            support = cdolist_list_var.first();
                        } 
                        just = nreverse(result);
                    }
                } finally {
                    gt_vars.$gt_truth$.rebind(_prev_bind_0_$49, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return just;
    }/**
     * does a transitive path connect ARG2 to ARG1,
     * or does a transitive inverse path connect ARG1 to ARG2?
     */


    /**
     * Returns returns the most-subordinate elements of FORTS
     * (one member only of a cycle will be a min-node candidate)
     */
    @LispMethod(comment = "Returns returns the most-subordinate elements of FORTS\r\n(one member only of a cycle will be a min-node candidate)\nReturns returns the most-subordinate elements of FORTS\n(one member only of a cycle will be a min-node candidate)")
    public static final SubLObject gt_min_nodes_alt(SubLObject predicate, SubLObject v_forts, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(predicate, FORT_P);
        SubLTrampolineFile.checkType(v_forts, LISTP);
        return transitivity.gtm(predicate, $MIN_NODES, v_forts, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Returns returns the most-subordinate elements of FORTS\r\n(one member only of a cycle will be a min-node candidate)\nReturns returns the most-subordinate elements of FORTS\n(one member only of a cycle will be a min-node candidate)")
    public static SubLObject gt_min_nodes(final SubLObject predicate, final SubLObject v_forts, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(predicate, FORT_P);
        SubLTrampolineFile.enforceType(v_forts, LISTP);
        return transitivity.gtm(predicate, $MIN_NODES, v_forts, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }/**
     * Returns returns the most-subordinate elements of FORTS
     * (one member only of a cycle will be a min-node candidate)
     */


    /**
     * Returns returns the most-subordinate elements of <nodes>
     * Currently, no members of any cycles will be returned.
     */
    @LispMethod(comment = "Returns returns the most-subordinate elements of <nodes>\r\nCurrently, no members of any cycles will be returned.\nReturns returns the most-subordinate elements of <nodes>\nCurrently, no members of any cycles will be returned.")
    public static final SubLObject gtm_min_nodes_alt(SubLObject nodes, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != list_utilities.singletonP(nodes)) {
                return nodes;
            } else {
                {
                    SubLObject unique_nodes = list_utilities.remove_duplicate_forts(nodes);
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
                            {
                                SubLObject cdolist_list_var = unique_nodes;
                                SubLObject node = NIL;
                                for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node = cdolist_list_var.first()) {
                                    if (NIL == gt_search.gt_searchedP(node)) {
                                        gt_search.gt_mark_proper_all_superiors_as_searched(node);
                                        if (NIL != gt_search.gt_searchedP(node)) {
                                            gt_search.gt_mark_all_inferiors_as_unsearched(node);
                                        }
                                    }
                                }
                                result = remove_if($sym119$GT_SEARCHED_, unique_nodes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
    }

    @LispMethod(comment = "Returns returns the most-subordinate elements of <nodes>\r\nCurrently, no members of any cycles will be returned.\nReturns returns the most-subordinate elements of <nodes>\nCurrently, no members of any cycles will be returned.")
    public static SubLObject gtm_min_nodes(final SubLObject nodes, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != list_utilities.singletonP(nodes)) {
            return nodes;
        }
        final SubLObject unique_nodes = list_utilities.remove_duplicate_forts(nodes);
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = unique_nodes;
            SubLObject node = NIL;
            node = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == gt_search.gt_searchedP(node)) {
                    gt_search.gt_mark_proper_all_superiors_as_searched(node);
                    if (NIL != gt_search.gt_searchedP(node)) {
                        gt_search.gt_mark_all_inferiors_as_unsearched(node);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                node = cdolist_list_var.first();
            } 
            result = remove_if($sym119$GT_SEARCHED_, unique_nodes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * Returns returns the most-subordinate elements of <nodes>
     * Currently, no members of any cycles will be returned.
     */


    /**
     * Returns returns the least-subordinate elements of FORTS
     * (<direction> should be :up unless all nodes are low in the hierarchy)
     */
    @LispMethod(comment = "Returns returns the least-subordinate elements of FORTS\r\n(<direction> should be :up unless all nodes are low in the hierarchy)\nReturns returns the least-subordinate elements of FORTS\n(<direction> should be :up unless all nodes are low in the hierarchy)")
    public static final SubLObject gt_max_nodes_alt(SubLObject predicate, SubLObject v_forts, SubLObject mt, SubLObject direction) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = gt_vars.$gt_max_nodes_direction$.getDynamicValue();
        }
        SubLTrampolineFile.checkType(predicate, FORT_P);
        SubLTrampolineFile.checkType(v_forts, LISTP);
        return transitivity.gtm(predicate, $MAX_NODES, v_forts, mt, direction, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Returns returns the least-subordinate elements of FORTS\r\n(<direction> should be :up unless all nodes are low in the hierarchy)\nReturns returns the least-subordinate elements of FORTS\n(<direction> should be :up unless all nodes are low in the hierarchy)")
    public static SubLObject gt_max_nodes(final SubLObject predicate, final SubLObject v_forts, SubLObject mt, SubLObject direction) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = gt_vars.$gt_max_nodes_direction$.getDynamicValue();
        }
        SubLTrampolineFile.enforceType(predicate, FORT_P);
        SubLTrampolineFile.enforceType(v_forts, LISTP);
        return transitivity.gtm(predicate, $MAX_NODES, v_forts, mt, direction, UNPROVIDED, UNPROVIDED);
    }/**
     * Returns returns the least-subordinate elements of FORTS
     * (<direction> should be :up unless all nodes are low in the hierarchy)
     */


    /**
     * Returns returns the least-subordinate elements of <nodes>
     * (<direction> should be :up unless all nodes are low in the hierarchy)
     */
    @LispMethod(comment = "Returns returns the least-subordinate elements of <nodes>\r\n(<direction> should be :up unless all nodes are low in the hierarchy)\nReturns returns the least-subordinate elements of <nodes>\n(<direction> should be :up unless all nodes are low in the hierarchy)")
    public static final SubLObject gtm_max_nodes_alt(SubLObject nodes, SubLObject mt, SubLObject direction) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = gt_vars.$gt_max_nodes_direction$.getDynamicValue();
        }
        {
            SubLObject unique_nodes = list_utilities.remove_duplicate_forts(nodes);
            if (NIL != list_utilities.singletonP(unique_nodes)) {
                return unique_nodes;
            } else {
                {
                    SubLObject pcase_var = direction;
                    if (pcase_var.eql($UP)) {
                        return com.cyc.cycjava.cycl.gt_methods.gt_max_nodes_up(unique_nodes, mt);
                    } else {
                        if (pcase_var.eql($DOWN)) {
                            return com.cyc.cycjava.cycl.gt_methods.gt_max_nodes_down(unique_nodes, mt);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Returns returns the least-subordinate elements of <nodes>\r\n(<direction> should be :up unless all nodes are low in the hierarchy)\nReturns returns the least-subordinate elements of <nodes>\n(<direction> should be :up unless all nodes are low in the hierarchy)")
    public static SubLObject gtm_max_nodes(final SubLObject nodes, SubLObject mt, SubLObject direction) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = gt_vars.$gt_max_nodes_direction$.getDynamicValue();
        }
        final SubLObject unique_nodes = list_utilities.remove_duplicate_forts(nodes);
        if (NIL != list_utilities.singletonP(unique_nodes)) {
            return unique_nodes;
        }
        final SubLObject pcase_var = direction;
        if (pcase_var.eql($UP)) {
            return gt_max_nodes_up(unique_nodes, mt);
        }
        if (pcase_var.eql($DOWN)) {
            return gt_max_nodes_down(unique_nodes, mt);
        }
        return NIL;
    }/**
     * Returns returns the least-subordinate elements of <nodes>
     * (<direction> should be :up unless all nodes are low in the hierarchy)
     */


    /**
     * returns the least-subordinate elements of <nodes>
     * (permit search downwards in the hierarchy: expensive)
     */
    @LispMethod(comment = "returns the least-subordinate elements of <nodes>\r\n(permit search downwards in the hierarchy: expensive)\nreturns the least-subordinate elements of <nodes>\n(permit search downwards in the hierarchy: expensive)")
    public static final SubLObject gt_max_nodes_down_alt(SubLObject nodes, SubLObject mt) {
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
                        {
                            SubLObject cdolist_list_var = nodes;
                            SubLObject node = NIL;
                            for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node = cdolist_list_var.first()) {
                                if (NIL == gt_search.gt_searchedP(node)) {
                                    gt_search.gt_mark_proper_all_inferiors_as_searched(node);
                                    if (NIL != gt_search.gt_searchedP(node)) {
                                        gt_search.gt_mark_all_superiors_as_unsearched(node);
                                    }
                                }
                            }
                            result = remove_if(symbol_function($sym119$GT_SEARCHED_), nodes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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

    @LispMethod(comment = "returns the least-subordinate elements of <nodes>\r\n(permit search downwards in the hierarchy: expensive)\nreturns the least-subordinate elements of <nodes>\n(permit search downwards in the hierarchy: expensive)")
    public static SubLObject gt_max_nodes_down(final SubLObject nodes, SubLObject mt) {
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
            SubLObject cdolist_list_var = nodes;
            SubLObject node = NIL;
            node = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == gt_search.gt_searchedP(node)) {
                    gt_search.gt_mark_proper_all_inferiors_as_searched(node);
                    if (NIL != gt_search.gt_searchedP(node)) {
                        gt_search.gt_mark_all_superiors_as_unsearched(node);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                node = cdolist_list_var.first();
            } 
            result = remove_if(symbol_function($sym119$GT_SEARCHED_), nodes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * returns the least-subordinate elements of <nodes>
     * (permit search downwards in the hierarchy: expensive)
     */


    public static final SubLObject gt_max_nodes_up_with_hash_alt(SubLObject nodes, SubLObject mt) {
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
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == gt_utilities.gt_modeP($SUPERIOR)) {
                                Errors.error($str_alt11$invalid_gt_mode___a, $SUPERIOR);
                            }
                        }
                        {
                            SubLObject _prev_bind_0_51 = gt_vars.$gt_mode$.currentBinding(thread);
                            try {
                                gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                                {
                                    SubLObject nodeshash = make_hash_table(length(nodes), UNPROVIDED, UNPROVIDED);
                                    {
                                        SubLObject cdolist_list_var = nodes;
                                        SubLObject node = NIL;
                                        for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node = cdolist_list_var.first()) {
                                            sethash(node, nodeshash, T);
                                        }
                                    }
                                    {
                                        SubLObject cdolist_list_var = nodes;
                                        SubLObject node = NIL;
                                        for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node = cdolist_list_var.first()) {
                                            sethash(node, nodeshash, NIL);
                                            if (NIL == gt_search.gt_accessesP(node, nodeshash, symbol_function(GETHASH))) {
                                                result = cons(node, result);
                                            }
                                            sethash(node, nodeshash, T);
                                        }
                                    }
                                }
                            } finally {
                                gt_vars.$gt_mode$.rebind(_prev_bind_0_51, thread);
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

    public static SubLObject gt_max_nodes_up_with_hash(final SubLObject nodes, SubLObject mt) {
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
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($SUPERIOR))) {
                Errors.error($str11$invalid_gt_mode___a, $SUPERIOR);
            }
            final SubLObject _prev_bind_0_$51 = gt_vars.$gt_mode$.currentBinding(thread);
            try {
                gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                final SubLObject nodeshash = make_hash_table(length(nodes), UNPROVIDED, UNPROVIDED);
                SubLObject cdolist_list_var = nodes;
                SubLObject node = NIL;
                node = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    sethash(node, nodeshash, T);
                    cdolist_list_var = cdolist_list_var.rest();
                    node = cdolist_list_var.first();
                } 
                cdolist_list_var = nodes;
                node = NIL;
                node = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    sethash(node, nodeshash, NIL);
                    if (NIL == gt_search.gt_accessesP(node, nodeshash, symbol_function(GETHASH))) {
                        result = cons(node, result);
                    }
                    sethash(node, nodeshash, T);
                    cdolist_list_var = cdolist_list_var.rest();
                    node = cdolist_list_var.first();
                } 
            } finally {
                gt_vars.$gt_mode$.rebind(_prev_bind_0_$51, thread);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject gt_max_nodes_up_alt(SubLObject nodes, SubLObject mt) {
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
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == gt_utilities.gt_modeP($SUPERIOR)) {
                                Errors.error($str_alt11$invalid_gt_mode___a, $SUPERIOR);
                            }
                        }
                        {
                            SubLObject _prev_bind_0_52 = gt_vars.$gt_mode$.currentBinding(thread);
                            try {
                                gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                                {
                                    SubLObject cdolist_list_var = nodes;
                                    SubLObject node = NIL;
                                    for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node = cdolist_list_var.first()) {
                                        if (NIL == gt_search.gt_accessesP(node, remove(node, nodes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function($sym127$MEMBER_))) {
                                            result = cons(node, result);
                                        }
                                    }
                                }
                            } finally {
                                gt_vars.$gt_mode$.rebind(_prev_bind_0_52, thread);
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

    public static SubLObject gt_max_nodes_up(final SubLObject nodes, SubLObject mt) {
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
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($SUPERIOR))) {
                Errors.error($str11$invalid_gt_mode___a, $SUPERIOR);
            }
            final SubLObject _prev_bind_0_$52 = gt_vars.$gt_mode$.currentBinding(thread);
            try {
                gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                SubLObject cdolist_list_var = nodes;
                SubLObject node = NIL;
                node = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL == gt_search.gt_accessesP(node, remove(node, nodes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function($sym127$MEMBER_))) {
                        result = cons(node, result);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    node = cdolist_list_var.first();
                } 
            } finally {
                gt_vars.$gt_mode$.rebind(_prev_bind_0_$52, thread);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Returns the most-subordinate common superiors of FORTS
     * (when CANDIDATES is non-nil, the result must subset it)
     */
    @LispMethod(comment = "Returns the most-subordinate common superiors of FORTS\r\n(when CANDIDATES is non-nil, the result must subset it)\nReturns the most-subordinate common superiors of FORTS\n(when CANDIDATES is non-nil, the result must subset it)")
    public static final SubLObject gt_min_ceilings_alt(SubLObject predicate, SubLObject v_forts, SubLObject candidates, SubLObject mt) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(predicate, FORT_P);
        SubLTrampolineFile.checkType(v_forts, LISTP);
        return transitivity.gtm(predicate, $MIN_CEILINGS, v_forts, candidates, mt, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Returns the most-subordinate common superiors of FORTS\r\n(when CANDIDATES is non-nil, the result must subset it)\nReturns the most-subordinate common superiors of FORTS\n(when CANDIDATES is non-nil, the result must subset it)")
    public static SubLObject gt_min_ceilings(final SubLObject predicate, final SubLObject v_forts, SubLObject candidates, SubLObject mt) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(predicate, FORT_P);
        SubLTrampolineFile.enforceType(v_forts, LISTP);
        return transitivity.gtm(predicate, $MIN_CEILINGS, v_forts, candidates, mt, UNPROVIDED, UNPROVIDED);
    }/**
     * Returns the most-subordinate common superiors of FORTS
     * (when CANDIDATES is non-nil, the result must subset it)
     */


    /**
     * Returns the most-subordinate common superiors of <forts>
     * (when <candidates> is non-nil, the result must subset it)
     */
    @LispMethod(comment = "Returns the most-subordinate common superiors of <forts>\r\n(when <candidates> is non-nil, the result must subset it)\nReturns the most-subordinate common superiors of <forts>\n(when <candidates> is non-nil, the result must subset it)")
    public static final SubLObject gtm_min_ceilings_alt(SubLObject v_forts, SubLObject candidates, SubLObject mt) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ceilings = com.cyc.cycjava.cycl.gt_methods.gt_ceilings(v_forts, candidates, mt);
                SubLObject min_nodes = NIL;
                {
                    SubLObject _prev_bind_0 = gt_vars.$gt_target_marking_table$.currentBinding(thread);
                    SubLObject _prev_bind_1 = gt_vars.$gt_marking_table$.currentBinding(thread);
                    try {
                        gt_vars.$gt_target_marking_table$.bind(gt_vars.$gt_marking_table$.getDynamicValue(thread), thread);
                        gt_vars.$gt_marking_table$.bind(NIL, thread);
                        gt_vars.$gt_marking_table$.setDynamicValue(make_hash_table($int$128, UNPROVIDED, UNPROVIDED), thread);
                        min_nodes = com.cyc.cycjava.cycl.gt_methods.gt_min_nodes(gt_vars.$gt_pred$.getDynamicValue(thread), ceilings, mt);
                    } finally {
                        gt_vars.$gt_marking_table$.rebind(_prev_bind_1, thread);
                        gt_vars.$gt_target_marking_table$.rebind(_prev_bind_0, thread);
                    }
                }
                return min_nodes;
            }
        }
    }

    @LispMethod(comment = "Returns the most-subordinate common superiors of <forts>\r\n(when <candidates> is non-nil, the result must subset it)\nReturns the most-subordinate common superiors of <forts>\n(when <candidates> is non-nil, the result must subset it)")
    public static SubLObject gtm_min_ceilings(final SubLObject v_forts, SubLObject candidates, SubLObject mt) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ceilings = gt_ceilings(v_forts, candidates, mt);
        SubLObject min_nodes = NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_target_marking_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_marking_table$.currentBinding(thread);
        try {
            gt_vars.$gt_target_marking_table$.bind(gt_vars.$gt_marking_table$.getDynamicValue(thread), thread);
            gt_vars.$gt_marking_table$.bind(NIL, thread);
            gt_vars.$gt_marking_table$.setDynamicValue(make_hash_table($int$128, UNPROVIDED, UNPROVIDED), thread);
            min_nodes = gt_min_nodes(gt_vars.$gt_pred$.getDynamicValue(thread), ceilings, mt);
        } finally {
            gt_vars.$gt_marking_table$.rebind(_prev_bind_2, thread);
            gt_vars.$gt_target_marking_table$.rebind(_prev_bind_0, thread);
        }
        return min_nodes;
    }/**
     * Returns the most-subordinate common superiors of <forts>
     * (when <candidates> is non-nil, the result must subset it)
     */


    /**
     * Returns the common superiors of <nodes>
     */
    @LispMethod(comment = "Returns the common superiors of <nodes>")
    public static final SubLObject gt_ceilings_alt(SubLObject nodes, SubLObject candidates, SubLObject mt) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject max_nodes = NIL;
                {
                    SubLObject _prev_bind_0 = gt_vars.$gt_target_marking_table$.currentBinding(thread);
                    SubLObject _prev_bind_1 = gt_vars.$gt_marking_table$.currentBinding(thread);
                    try {
                        gt_vars.$gt_target_marking_table$.bind(gt_vars.$gt_marking_table$.getDynamicValue(thread), thread);
                        gt_vars.$gt_marking_table$.bind(NIL, thread);
                        gt_vars.$gt_marking_table$.setDynamicValue(make_hash_table($int$128, UNPROVIDED, UNPROVIDED), thread);
                        max_nodes = com.cyc.cycjava.cycl.gt_methods.gt_max_nodes(gt_vars.$gt_pred$.getDynamicValue(thread), nodes, mt, UNPROVIDED);
                    } finally {
                        gt_vars.$gt_marking_table$.rebind(_prev_bind_1, thread);
                        gt_vars.$gt_target_marking_table$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != list_utilities.singletonP(max_nodes)) {
                    if ((NIL == candidates) || (NIL != subl_promotions.memberP(max_nodes.first(), candidates, UNPROVIDED, UNPROVIDED))) {
                        return max_nodes;
                    }
                } else {
                    return com.cyc.cycjava.cycl.gt_methods.gt_ceilings_int(max_nodes, candidates, mt);
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Returns the common superiors of <nodes>")
    public static SubLObject gt_ceilings(final SubLObject nodes, SubLObject candidates, SubLObject mt) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject max_nodes = NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_target_marking_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_marking_table$.currentBinding(thread);
        try {
            gt_vars.$gt_target_marking_table$.bind(gt_vars.$gt_marking_table$.getDynamicValue(thread), thread);
            gt_vars.$gt_marking_table$.bind(NIL, thread);
            gt_vars.$gt_marking_table$.setDynamicValue(make_hash_table($int$128, UNPROVIDED, UNPROVIDED), thread);
            max_nodes = gt_max_nodes(gt_vars.$gt_pred$.getDynamicValue(thread), nodes, mt, UNPROVIDED);
        } finally {
            gt_vars.$gt_marking_table$.rebind(_prev_bind_2, thread);
            gt_vars.$gt_target_marking_table$.rebind(_prev_bind_0, thread);
        }
        if (NIL == list_utilities.singletonP(max_nodes)) {
            return gt_ceilings_int(max_nodes, candidates, mt);
        }
        if ((NIL == candidates) || (NIL != subl_promotions.memberP(max_nodes.first(), candidates, UNPROVIDED, UNPROVIDED))) {
            return max_nodes;
        }
        return NIL;
    }/**
     * Returns the common superiors of <nodes>
     */


    public static final SubLObject gt_ceilings_int_alt(SubLObject nodes, SubLObject candidates, SubLObject mt) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ceilings = NIL;
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == gt_utilities.gt_modeP($SUPERIOR)) {
                        Errors.error($str_alt11$invalid_gt_mode___a, $SUPERIOR);
                    }
                }
                {
                    SubLObject _prev_bind_0 = gt_vars.$gt_mode$.currentBinding(thread);
                    try {
                        gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                        ceilings = gt_search.gt_common_horizon(nodes, candidates, mt);
                    } finally {
                        gt_vars.$gt_mode$.rebind(_prev_bind_0, thread);
                    }
                }
                return ceilings;
            }
        }
    }

    public static SubLObject gt_ceilings_int(final SubLObject nodes, SubLObject candidates, SubLObject mt) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ceilings = NIL;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($SUPERIOR))) {
            Errors.error($str11$invalid_gt_mode___a, $SUPERIOR);
        }
        final SubLObject _prev_bind_0 = gt_vars.$gt_mode$.currentBinding(thread);
        try {
            gt_vars.$gt_mode$.bind($SUPERIOR, thread);
            ceilings = gt_search.gt_common_horizon(nodes, candidates, mt);
        } finally {
            gt_vars.$gt_mode$.rebind(_prev_bind_0, thread);
        }
        return ceilings;
    }

    /**
     * Returns the least-subordinate elements or common inferiors of FORTS
     * (when CANDIDATES is non-nil, the result must subset it)
     */
    @LispMethod(comment = "Returns the least-subordinate elements or common inferiors of FORTS\r\n(when CANDIDATES is non-nil, the result must subset it)\nReturns the least-subordinate elements or common inferiors of FORTS\n(when CANDIDATES is non-nil, the result must subset it)")
    public static final SubLObject gt_max_floors_alt(SubLObject predicate, SubLObject v_forts, SubLObject candidates, SubLObject mt) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(predicate, FORT_P);
        SubLTrampolineFile.checkType(v_forts, LISTP);
        return transitivity.gtm(predicate, $MAX_FLOORS, v_forts, candidates, mt, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Returns the least-subordinate elements or common inferiors of FORTS\r\n(when CANDIDATES is non-nil, the result must subset it)\nReturns the least-subordinate elements or common inferiors of FORTS\n(when CANDIDATES is non-nil, the result must subset it)")
    public static SubLObject gt_max_floors(final SubLObject predicate, final SubLObject v_forts, SubLObject candidates, SubLObject mt) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(predicate, FORT_P);
        SubLTrampolineFile.enforceType(v_forts, LISTP);
        return transitivity.gtm(predicate, $MAX_FLOORS, v_forts, candidates, mt, UNPROVIDED, UNPROVIDED);
    }/**
     * Returns the least-subordinate elements or common inferiors of FORTS
     * (when CANDIDATES is non-nil, the result must subset it)
     */


    /**
     * Returns the least-subordinate elements or common inferiors of <forts> (expensive)
     * (when <candidates> is non-nil, the result must subset it)
     */
    @LispMethod(comment = "Returns the least-subordinate elements or common inferiors of <forts> (expensive)\r\n(when <candidates> is non-nil, the result must subset it)\nReturns the least-subordinate elements or common inferiors of <forts> (expensive)\n(when <candidates> is non-nil, the result must subset it)")
    public static final SubLObject gtm_max_floors_alt(SubLObject v_forts, SubLObject candidates, SubLObject mt) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject floors = com.cyc.cycjava.cycl.gt_methods.gt_floors(v_forts, candidates, mt);
                SubLObject max_nodes = NIL;
                {
                    SubLObject _prev_bind_0 = gt_vars.$gt_target_marking_table$.currentBinding(thread);
                    SubLObject _prev_bind_1 = gt_vars.$gt_marking_table$.currentBinding(thread);
                    try {
                        gt_vars.$gt_target_marking_table$.bind(gt_vars.$gt_marking_table$.getDynamicValue(thread), thread);
                        gt_vars.$gt_marking_table$.bind(NIL, thread);
                        gt_vars.$gt_marking_table$.setDynamicValue(make_hash_table($int$128, UNPROVIDED, UNPROVIDED), thread);
                        max_nodes = com.cyc.cycjava.cycl.gt_methods.gt_max_nodes(gt_vars.$gt_pred$.getDynamicValue(thread), floors, mt, UNPROVIDED);
                    } finally {
                        gt_vars.$gt_marking_table$.rebind(_prev_bind_1, thread);
                        gt_vars.$gt_target_marking_table$.rebind(_prev_bind_0, thread);
                    }
                }
                return max_nodes;
            }
        }
    }

    @LispMethod(comment = "Returns the least-subordinate elements or common inferiors of <forts> (expensive)\r\n(when <candidates> is non-nil, the result must subset it)\nReturns the least-subordinate elements or common inferiors of <forts> (expensive)\n(when <candidates> is non-nil, the result must subset it)")
    public static SubLObject gtm_max_floors(final SubLObject v_forts, SubLObject candidates, SubLObject mt) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject floors = gt_floors(v_forts, candidates, mt);
        SubLObject max_nodes = NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_target_marking_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_marking_table$.currentBinding(thread);
        try {
            gt_vars.$gt_target_marking_table$.bind(gt_vars.$gt_marking_table$.getDynamicValue(thread), thread);
            gt_vars.$gt_marking_table$.bind(NIL, thread);
            gt_vars.$gt_marking_table$.setDynamicValue(make_hash_table($int$128, UNPROVIDED, UNPROVIDED), thread);
            max_nodes = gt_max_nodes(gt_vars.$gt_pred$.getDynamicValue(thread), floors, mt, UNPROVIDED);
        } finally {
            gt_vars.$gt_marking_table$.rebind(_prev_bind_2, thread);
            gt_vars.$gt_target_marking_table$.rebind(_prev_bind_0, thread);
        }
        return max_nodes;
    }/**
     * Returns the least-subordinate elements or common inferiors of <forts> (expensive)
     * (when <candidates> is non-nil, the result must subset it)
     */


    /**
     * Returns common inferiors of <forts> (expensive)
     */
    @LispMethod(comment = "Returns common inferiors of <forts> (expensive)")
    public static final SubLObject gt_floors_alt(SubLObject nodes, SubLObject candidates, SubLObject mt) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != nodes) {
                {
                    SubLObject min_nodes = NIL;
                    {
                        SubLObject _prev_bind_0 = gt_vars.$gt_target_marking_table$.currentBinding(thread);
                        SubLObject _prev_bind_1 = gt_vars.$gt_marking_table$.currentBinding(thread);
                        try {
                            gt_vars.$gt_target_marking_table$.bind(gt_vars.$gt_marking_table$.getDynamicValue(thread), thread);
                            gt_vars.$gt_marking_table$.bind(NIL, thread);
                            gt_vars.$gt_marking_table$.setDynamicValue(make_hash_table($int$128, UNPROVIDED, UNPROVIDED), thread);
                            min_nodes = com.cyc.cycjava.cycl.gt_methods.gt_min_nodes(gt_vars.$gt_pred$.getDynamicValue(thread), nodes, mt);
                        } finally {
                            gt_vars.$gt_marking_table$.rebind(_prev_bind_1, thread);
                            gt_vars.$gt_target_marking_table$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (NIL != list_utilities.singletonP(min_nodes)) {
                        if ((NIL == candidates) || (NIL != subl_promotions.memberP(min_nodes.first(), candidates, UNPROVIDED, UNPROVIDED))) {
                            return min_nodes;
                        }
                    } else {
                        return com.cyc.cycjava.cycl.gt_methods.gt_floors_int(min_nodes, candidates, mt);
                    }
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Returns common inferiors of <forts> (expensive)")
    public static SubLObject gt_floors(final SubLObject nodes, SubLObject candidates, SubLObject mt) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != nodes) {
            SubLObject min_nodes = NIL;
            final SubLObject _prev_bind_0 = gt_vars.$gt_target_marking_table$.currentBinding(thread);
            final SubLObject _prev_bind_2 = gt_vars.$gt_marking_table$.currentBinding(thread);
            try {
                gt_vars.$gt_target_marking_table$.bind(gt_vars.$gt_marking_table$.getDynamicValue(thread), thread);
                gt_vars.$gt_marking_table$.bind(NIL, thread);
                gt_vars.$gt_marking_table$.setDynamicValue(make_hash_table($int$128, UNPROVIDED, UNPROVIDED), thread);
                min_nodes = gt_min_nodes(gt_vars.$gt_pred$.getDynamicValue(thread), nodes, mt);
            } finally {
                gt_vars.$gt_marking_table$.rebind(_prev_bind_2, thread);
                gt_vars.$gt_target_marking_table$.rebind(_prev_bind_0, thread);
            }
            if (NIL == list_utilities.singletonP(min_nodes)) {
                return gt_floors_int(min_nodes, candidates, mt);
            }
            if ((NIL == candidates) || (NIL != subl_promotions.memberP(min_nodes.first(), candidates, UNPROVIDED, UNPROVIDED))) {
                return min_nodes;
            }
        }
        return NIL;
    }/**
     * Returns common inferiors of <forts> (expensive)
     */


    public static final SubLObject gt_floors_int_alt(SubLObject nodes, SubLObject candidates, SubLObject mt) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject floors = NIL;
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == gt_utilities.gt_modeP($INFERIOR)) {
                        Errors.error($str_alt11$invalid_gt_mode___a, $INFERIOR);
                    }
                }
                {
                    SubLObject _prev_bind_0 = gt_vars.$gt_mode$.currentBinding(thread);
                    try {
                        gt_vars.$gt_mode$.bind($INFERIOR, thread);
                        floors = gt_search.gt_common_horizon(nodes, candidates, mt);
                    } finally {
                        gt_vars.$gt_mode$.rebind(_prev_bind_0, thread);
                    }
                }
                return floors;
            }
        }
    }

    public static SubLObject gt_floors_int(final SubLObject nodes, SubLObject candidates, SubLObject mt) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject floors = NIL;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($INFERIOR))) {
            Errors.error($str11$invalid_gt_mode___a, $INFERIOR);
        }
        final SubLObject _prev_bind_0 = gt_vars.$gt_mode$.currentBinding(thread);
        try {
            gt_vars.$gt_mode$.bind($INFERIOR, thread);
            floors = gt_search.gt_common_horizon(nodes, candidates, mt);
        } finally {
            gt_vars.$gt_mode$.rebind(_prev_bind_0, thread);
        }
        return floors;
    }

    /**
     * Returns least-general superiors of INFERIOR ignoring SUPERIOR
     * (useful for splicing-out SUPERIOR from hierarchy)
     */
    @LispMethod(comment = "Returns least-general superiors of INFERIOR ignoring SUPERIOR\r\n(useful for splicing-out SUPERIOR from hierarchy)\nReturns least-general superiors of INFERIOR ignoring SUPERIOR\n(useful for splicing-out SUPERIOR from hierarchy)")
    public static final SubLObject gt_min_superiors_excluding_alt(SubLObject predicate, SubLObject inferior, SubLObject superior, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(predicate, FORT_P);
        SubLTrampolineFile.checkType(inferior, GT_TERM_P);
        SubLTrampolineFile.checkType(superior, GT_TERM_P);
        return transitivity.gtm(predicate, $MIN_SUPERIORS_EXCLUDING, inferior, superior, mt, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Returns least-general superiors of INFERIOR ignoring SUPERIOR\r\n(useful for splicing-out SUPERIOR from hierarchy)\nReturns least-general superiors of INFERIOR ignoring SUPERIOR\n(useful for splicing-out SUPERIOR from hierarchy)")
    public static SubLObject gt_min_superiors_excluding(final SubLObject predicate, final SubLObject inferior, final SubLObject superior, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(predicate, FORT_P);
        SubLTrampolineFile.enforceType(inferior, GT_TERM_P);
        SubLTrampolineFile.enforceType(superior, GT_TERM_P);
        return transitivity.gtm(predicate, $MIN_SUPERIORS_EXCLUDING, inferior, superior, mt, UNPROVIDED, UNPROVIDED);
    }/**
     * Returns least-general superiors of INFERIOR ignoring SUPERIOR
     * (useful for splicing-out SUPERIOR from hierarchy)
     */


    /**
     * Returns least-general superiors of INFERIOR ignoring SUPERIOR
     * (useful for splicing-out SUPERIOR from hierarchy)
     */
    @LispMethod(comment = "Returns least-general superiors of INFERIOR ignoring SUPERIOR\r\n(useful for splicing-out SUPERIOR from hierarchy)\nReturns least-general superiors of INFERIOR ignoring SUPERIOR\n(useful for splicing-out SUPERIOR from hierarchy)")
    public static final SubLObject gtm_min_superiors_excluding_alt(SubLObject inferior, SubLObject superior, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject immediate_superiors = NIL;
                SubLObject excluded_forts_superiors = NIL;
                SubLObject mins = NIL;
                immediate_superiors = transitivity.gtm(gt_vars.$gt_pred$.getDynamicValue(thread), $SUPERIORS, inferior, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                excluded_forts_superiors = transitivity.gtm(gt_vars.$gt_pred$.getDynamicValue(thread), $SUPERIORS, superior, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                mins = com.cyc.cycjava.cycl.gt_methods.gt_min_nodes(gt_vars.$gt_pred$.getDynamicValue(thread), list_utilities.remove_duplicate_forts(nconc(excluded_forts_superiors, delete(superior, immediate_superiors, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))), UNPROVIDED);
                return mins;
            }
        }
    }

    @LispMethod(comment = "Returns least-general superiors of INFERIOR ignoring SUPERIOR\r\n(useful for splicing-out SUPERIOR from hierarchy)\nReturns least-general superiors of INFERIOR ignoring SUPERIOR\n(useful for splicing-out SUPERIOR from hierarchy)")
    public static SubLObject gtm_min_superiors_excluding(final SubLObject inferior, final SubLObject superior, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject immediate_superiors = NIL;
        SubLObject excluded_forts_superiors = NIL;
        SubLObject mins = NIL;
        immediate_superiors = transitivity.gtm(gt_vars.$gt_pred$.getDynamicValue(thread), $SUPERIORS, inferior, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        excluded_forts_superiors = transitivity.gtm(gt_vars.$gt_pred$.getDynamicValue(thread), $SUPERIORS, superior, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        mins = gt_min_nodes(gt_vars.$gt_pred$.getDynamicValue(thread), list_utilities.remove_duplicate_forts(nconc(excluded_forts_superiors, delete(superior, immediate_superiors, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))), UNPROVIDED);
        return mins;
    }/**
     * Returns least-general superiors of INFERIOR ignoring SUPERIOR
     * (useful for splicing-out SUPERIOR from hierarchy)
     */


    /**
     * Returns most-general inferiors of SUPERIOR ignoring INFERIOR (expensive)
     * (useful for splicing-out INFERIOR from hierarchy)
     */
    @LispMethod(comment = "Returns most-general inferiors of SUPERIOR ignoring INFERIOR (expensive)\r\n(useful for splicing-out INFERIOR from hierarchy)\nReturns most-general inferiors of SUPERIOR ignoring INFERIOR (expensive)\n(useful for splicing-out INFERIOR from hierarchy)")
    public static final SubLObject gt_max_inferiors_excluding_alt(SubLObject predicate, SubLObject inferior, SubLObject superior, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(predicate, FORT_P);
        SubLTrampolineFile.checkType(inferior, GT_TERM_P);
        SubLTrampolineFile.checkType(superior, GT_TERM_P);
        return transitivity.gtm(predicate, $MAX_INFERIORS_EXCLUDING, inferior, superior, mt, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Returns most-general inferiors of SUPERIOR ignoring INFERIOR (expensive)\r\n(useful for splicing-out INFERIOR from hierarchy)\nReturns most-general inferiors of SUPERIOR ignoring INFERIOR (expensive)\n(useful for splicing-out INFERIOR from hierarchy)")
    public static SubLObject gt_max_inferiors_excluding(final SubLObject predicate, final SubLObject inferior, final SubLObject superior, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(predicate, FORT_P);
        SubLTrampolineFile.enforceType(inferior, GT_TERM_P);
        SubLTrampolineFile.enforceType(superior, GT_TERM_P);
        return transitivity.gtm(predicate, $MAX_INFERIORS_EXCLUDING, inferior, superior, mt, UNPROVIDED, UNPROVIDED);
    }/**
     * Returns most-general inferiors of SUPERIOR ignoring INFERIOR (expensive)
     * (useful for splicing-out INFERIOR from hierarchy)
     */


    /**
     * Returns most-general inferiors of SUPERIOR ignoring INFERIOR (expensive)
     * (useful for splicing-out INFERIOR from hierarchy)
     */
    @LispMethod(comment = "Returns most-general inferiors of SUPERIOR ignoring INFERIOR (expensive)\r\n(useful for splicing-out INFERIOR from hierarchy)\nReturns most-general inferiors of SUPERIOR ignoring INFERIOR (expensive)\n(useful for splicing-out INFERIOR from hierarchy)")
    public static final SubLObject gtm_max_inferiors_excluding_alt(SubLObject superior, SubLObject inferior, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject immediate_inferiors = NIL;
                SubLObject excluded_forts_inferiors = NIL;
                SubLObject maxs = NIL;
                immediate_inferiors = transitivity.gtm(gt_vars.$gt_pred$.getDynamicValue(thread), $INFERIORS, superior, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                excluded_forts_inferiors = transitivity.gtm(gt_vars.$gt_pred$.getDynamicValue(thread), $INFERIORS, inferior, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                maxs = com.cyc.cycjava.cycl.gt_methods.gt_max_nodes(gt_vars.$gt_pred$.getDynamicValue(thread), list_utilities.remove_duplicate_forts(nconc(excluded_forts_inferiors, delete(inferior, immediate_inferiors, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))), UNPROVIDED, UNPROVIDED);
                return maxs;
            }
        }
    }

    @LispMethod(comment = "Returns most-general inferiors of SUPERIOR ignoring INFERIOR (expensive)\r\n(useful for splicing-out INFERIOR from hierarchy)\nReturns most-general inferiors of SUPERIOR ignoring INFERIOR (expensive)\n(useful for splicing-out INFERIOR from hierarchy)")
    public static SubLObject gtm_max_inferiors_excluding(final SubLObject superior, final SubLObject inferior, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject immediate_inferiors = NIL;
        SubLObject excluded_forts_inferiors = NIL;
        SubLObject maxs = NIL;
        immediate_inferiors = transitivity.gtm(gt_vars.$gt_pred$.getDynamicValue(thread), $INFERIORS, superior, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        excluded_forts_inferiors = transitivity.gtm(gt_vars.$gt_pred$.getDynamicValue(thread), $INFERIORS, inferior, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        maxs = gt_max_nodes(gt_vars.$gt_pred$.getDynamicValue(thread), list_utilities.remove_duplicate_forts(nconc(excluded_forts_inferiors, delete(inferior, immediate_inferiors, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))), UNPROVIDED, UNPROVIDED);
        return maxs;
    }/**
     * Returns most-general inferiors of SUPERIOR ignoring INFERIOR (expensive)
     * (useful for splicing-out INFERIOR from hierarchy)
     */


    public static final SubLObject gt_all_superior_edges_alt(SubLObject predicate, SubLObject inferior, SubLObject superior, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return transitivity.gtm(predicate, $ALL_SUPERIOR_EDGES, inferior, superior, mt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject gt_all_superior_edges(final SubLObject predicate, final SubLObject inferior, final SubLObject superior, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return transitivity.gtm(predicate, $ALL_SUPERIOR_EDGES, inferior, superior, mt, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject gt_all_inferior_edges_alt(SubLObject predicate, SubLObject inferior, SubLObject superior, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return transitivity.gtm(predicate, $ALL_INFERIOR_EDGES, inferior, superior, mt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject gt_all_inferior_edges(final SubLObject predicate, final SubLObject inferior, final SubLObject superior, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return transitivity.gtm(predicate, $ALL_INFERIOR_EDGES, inferior, superior, mt, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject gtm_all_superior_edges_alt(SubLObject inferior, SubLObject superior, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = gt_vars.$gt_goal_node$.currentBinding(thread);
                    SubLObject _prev_bind_1 = gt_vars.$gt_path_list_of_nodes$.currentBinding(thread);
                    try {
                        gt_vars.$gt_goal_node$.bind(superior, thread);
                        gt_vars.$gt_path_list_of_nodes$.bind(list(inferior), thread);
                        {
                            SubLObject mt_var = mt;
                            {
                                SubLObject _prev_bind_0_53 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1_54 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                        if (NIL == gt_utilities.gt_modeP($SUPERIOR)) {
                                            Errors.error($str_alt11$invalid_gt_mode___a, $SUPERIOR);
                                        }
                                    }
                                    {
                                        SubLObject _prev_bind_0_55 = gt_vars.$gt_mode$.currentBinding(thread);
                                        try {
                                            gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                                            SubLTrampolineFile.checkType($TRUE, TRUTH_P);
                                            {
                                                SubLObject _prev_bind_0_56 = gt_vars.$gt_truth$.currentBinding(thread);
                                                try {
                                                    gt_vars.$gt_truth$.bind($TRUE, thread);
                                                    result = gt_search.gt_all_edges_to_goal(inferior);
                                                } finally {
                                                    gt_vars.$gt_truth$.rebind(_prev_bind_0_56, thread);
                                                }
                                            }
                                        } finally {
                                            gt_vars.$gt_mode$.rebind(_prev_bind_0_55, thread);
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_54, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_53, thread);
                                }
                            }
                        }
                    } finally {
                        gt_vars.$gt_path_list_of_nodes$.rebind(_prev_bind_1, thread);
                        gt_vars.$gt_goal_node$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject gtm_all_superior_edges(final SubLObject inferior, final SubLObject superior, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_goal_node$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_path_list_of_nodes$.currentBinding(thread);
        try {
            gt_vars.$gt_goal_node$.bind(superior, thread);
            gt_vars.$gt_path_list_of_nodes$.bind(list(inferior), thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$53 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$54 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($SUPERIOR))) {
                    Errors.error($str11$invalid_gt_mode___a, $SUPERIOR);
                }
                final SubLObject _prev_bind_0_$54 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                    assert NIL != enumeration_types.truth_p($TRUE) : "! enumeration_types.truth_p( _KW.$TRUE) " + ("enumeration_types.truth_p(gt_methods.$kw12$TRUE) " + "CommonSymbols.NIL != enumeration_types.truth_p(gt_methods.$kw12$TRUE) ") + $TRUE;
                    final SubLObject _prev_bind_0_$55 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind($TRUE, thread);
                        result = gt_search.gt_all_edges_to_goal(inferior);
                    } finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$55, thread);
                    }
                } finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$54, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$54, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$53, thread);
            }
        } finally {
            gt_vars.$gt_path_list_of_nodes$.rebind(_prev_bind_2, thread);
            gt_vars.$gt_goal_node$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject gtm_all_inferior_edges_alt(SubLObject inferior, SubLObject superior, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = gt_vars.$gt_goal_node$.currentBinding(thread);
                    SubLObject _prev_bind_1 = gt_vars.$gt_path_list_of_nodes$.currentBinding(thread);
                    try {
                        gt_vars.$gt_goal_node$.bind(inferior, thread);
                        gt_vars.$gt_path_list_of_nodes$.bind(list(superior), thread);
                        {
                            SubLObject mt_var = mt;
                            {
                                SubLObject _prev_bind_0_57 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1_58 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                        if (NIL == gt_utilities.gt_modeP($INFERIOR)) {
                                            Errors.error($str_alt11$invalid_gt_mode___a, $INFERIOR);
                                        }
                                    }
                                    {
                                        SubLObject _prev_bind_0_59 = gt_vars.$gt_mode$.currentBinding(thread);
                                        try {
                                            gt_vars.$gt_mode$.bind($INFERIOR, thread);
                                            SubLTrampolineFile.checkType($TRUE, TRUTH_P);
                                            {
                                                SubLObject _prev_bind_0_60 = gt_vars.$gt_truth$.currentBinding(thread);
                                                try {
                                                    gt_vars.$gt_truth$.bind($TRUE, thread);
                                                    result = gt_search.gt_all_edges_to_goal(superior);
                                                } finally {
                                                    gt_vars.$gt_truth$.rebind(_prev_bind_0_60, thread);
                                                }
                                            }
                                        } finally {
                                            gt_vars.$gt_mode$.rebind(_prev_bind_0_59, thread);
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_58, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_57, thread);
                                }
                            }
                        }
                    } finally {
                        gt_vars.$gt_path_list_of_nodes$.rebind(_prev_bind_1, thread);
                        gt_vars.$gt_goal_node$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject gtm_all_inferior_edges(final SubLObject inferior, final SubLObject superior, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_goal_node$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_path_list_of_nodes$.currentBinding(thread);
        try {
            gt_vars.$gt_goal_node$.bind(inferior, thread);
            gt_vars.$gt_path_list_of_nodes$.bind(list(superior), thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$57 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$58 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($INFERIOR))) {
                    Errors.error($str11$invalid_gt_mode___a, $INFERIOR);
                }
                final SubLObject _prev_bind_0_$58 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind($INFERIOR, thread);
                    assert NIL != enumeration_types.truth_p($TRUE) : "! enumeration_types.truth_p( _KW.$TRUE) " + ("enumeration_types.truth_p(gt_methods.$kw12$TRUE) " + "CommonSymbols.NIL != enumeration_types.truth_p(gt_methods.$kw12$TRUE) ") + $TRUE;
                    final SubLObject _prev_bind_0_$59 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind($TRUE, thread);
                        result = gt_search.gt_all_edges_to_goal(superior);
                    } finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$59, thread);
                    }
                } finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$58, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$58, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$57, thread);
            }
        } finally {
            gt_vars.$gt_path_list_of_nodes$.rebind(_prev_bind_2, thread);
            gt_vars.$gt_goal_node$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject gt_all_paths_alt(SubLObject predicate, SubLObject inferior, SubLObject superior, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return transitivity.gtm(predicate, $ALL_PATHS, inferior, superior, mt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject gt_all_paths(final SubLObject predicate, final SubLObject inferior, final SubLObject superior, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return transitivity.gtm(predicate, $ALL_PATHS, inferior, superior, mt, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject gtm_all_paths_alt(SubLObject inferior, SubLObject superior, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = gt_vars.$gt_goal_node$.currentBinding(thread);
                    SubLObject _prev_bind_1 = gt_vars.$gt_path_list_of_assertions$.currentBinding(thread);
                    try {
                        gt_vars.$gt_goal_node$.bind(superior, thread);
                        gt_vars.$gt_path_list_of_assertions$.bind(NIL, thread);
                        {
                            SubLObject mt_var = mt;
                            {
                                SubLObject _prev_bind_0_61 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1_62 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                        if (NIL == gt_utilities.gt_modeP($SUPERIOR)) {
                                            Errors.error($str_alt11$invalid_gt_mode___a, $SUPERIOR);
                                        }
                                    }
                                    {
                                        SubLObject _prev_bind_0_63 = gt_vars.$gt_mode$.currentBinding(thread);
                                        try {
                                            gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                                            SubLTrampolineFile.checkType($TRUE, TRUTH_P);
                                            {
                                                SubLObject _prev_bind_0_64 = gt_vars.$gt_truth$.currentBinding(thread);
                                                try {
                                                    gt_vars.$gt_truth$.bind($TRUE, thread);
                                                    result = gt_search.gt_access_all_while_storing_paths(inferior);
                                                } finally {
                                                    gt_vars.$gt_truth$.rebind(_prev_bind_0_64, thread);
                                                }
                                            }
                                        } finally {
                                            gt_vars.$gt_mode$.rebind(_prev_bind_0_63, thread);
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_62, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_61, thread);
                                }
                            }
                        }
                    } finally {
                        gt_vars.$gt_path_list_of_assertions$.rebind(_prev_bind_1, thread);
                        gt_vars.$gt_goal_node$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject gtm_all_paths(final SubLObject inferior, final SubLObject superior, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_goal_node$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_path_list_of_assertions$.currentBinding(thread);
        try {
            gt_vars.$gt_goal_node$.bind(superior, thread);
            gt_vars.$gt_path_list_of_assertions$.bind(NIL, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$61 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$62 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($SUPERIOR))) {
                    Errors.error($str11$invalid_gt_mode___a, $SUPERIOR);
                }
                final SubLObject _prev_bind_0_$62 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                    assert NIL != enumeration_types.truth_p($TRUE) : "! enumeration_types.truth_p( _KW.$TRUE) " + ("enumeration_types.truth_p(gt_methods.$kw12$TRUE) " + "CommonSymbols.NIL != enumeration_types.truth_p(gt_methods.$kw12$TRUE) ") + $TRUE;
                    final SubLObject _prev_bind_0_$63 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind($TRUE, thread);
                        result = gt_search.gt_access_all_while_storing_paths(inferior);
                    } finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$63, thread);
                    }
                } finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$62, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$62, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$61, thread);
            }
        } finally {
            gt_vars.$gt_path_list_of_assertions$.rebind(_prev_bind_2, thread);
            gt_vars.$gt_goal_node$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Returns the most general mts in which SUPERIOR is hierarchically superior to INFERIOR
     * (work-in-progress: currently only an approx using mts along an arbitrary path)
     */
    @LispMethod(comment = "Returns the most general mts in which SUPERIOR is hierarchically superior to INFERIOR\r\n(work-in-progress: currently only an approx using mts along an arbitrary path)\nReturns the most general mts in which SUPERIOR is hierarchically superior to INFERIOR\n(work-in-progress: currently only an approx using mts along an arbitrary path)")
    public static final SubLObject gt_superior_in_what_mts_alt(SubLObject predicate, SubLObject inferior, SubLObject superior) {
        return transitivity.gtm(predicate, $SUPERIOR_IN_WHAT_MTS, inferior, superior, $HIERARCHICALLY_DIRECT, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Returns the most general mts in which SUPERIOR is hierarchically superior to INFERIOR\r\n(work-in-progress: currently only an approx using mts along an arbitrary path)\nReturns the most general mts in which SUPERIOR is hierarchically superior to INFERIOR\n(work-in-progress: currently only an approx using mts along an arbitrary path)")
    public static SubLObject gt_superior_in_what_mts(final SubLObject predicate, final SubLObject inferior, final SubLObject superior) {
        return transitivity.gtm(predicate, $SUPERIOR_IN_WHAT_MTS, inferior, superior, $HIERARCHICALLY_DIRECT, UNPROVIDED, UNPROVIDED);
    }/**
     * Returns the most general mts in which SUPERIOR is hierarchically superior to INFERIOR
     * (work-in-progress: currently only an approx using mts along an arbitrary path)
     */


    /**
     * this is for superior, inferior, and accessible in-what-mts
     */
    @LispMethod(comment = "this is for superior, inferior, and accessible in-what-mts")
    public static final SubLObject gtm_in_what_mts_alt(SubLObject start, SubLObject finish, SubLObject key_method) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mode = (ONE_INTEGER.eql(gt_vars.$gt_index_arg$.getDynamicValue(thread))) ? ((SubLObject) ($SUPERIOR)) : $INFERIOR;
                SubLObject v_answer = NIL;
                {
                    SubLObject _prev_bind_0 = gt_vars.$gt_what_mts_goal_node$.currentBinding(thread);
                    SubLObject _prev_bind_1 = gt_vars.$gt_path_list_of_nodes$.currentBinding(thread);
                    SubLObject _prev_bind_2 = gt_vars.$gt_path_list_of_mts$.currentBinding(thread);
                    SubLObject _prev_bind_3 = gt_vars.$gt_what_mts_result$.currentBinding(thread);
                    try {
                        gt_vars.$gt_what_mts_goal_node$.bind(finish, thread);
                        gt_vars.$gt_path_list_of_nodes$.bind(NIL, thread);
                        gt_vars.$gt_path_list_of_mts$.bind(NIL, thread);
                        gt_vars.$gt_what_mts_result$.bind(NIL, thread);
                        gt_vars.$gt_path_list_of_nodes$.setDynamicValue(cons(start, gt_vars.$gt_path_list_of_nodes$.getDynamicValue(thread)), thread);
                        com.cyc.cycjava.cycl.gt_methods.gt_which_mts(start, finish, key_method, mode);
                        v_answer = genl_mts.max_mts(gt_vars.$gt_what_mts_result$.getDynamicValue(thread), UNPROVIDED);
                    } finally {
                        gt_vars.$gt_what_mts_result$.rebind(_prev_bind_3, thread);
                        gt_vars.$gt_path_list_of_mts$.rebind(_prev_bind_2, thread);
                        gt_vars.$gt_path_list_of_nodes$.rebind(_prev_bind_1, thread);
                        gt_vars.$gt_what_mts_goal_node$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_answer;
            }
        }
    }

    @LispMethod(comment = "this is for superior, inferior, and accessible in-what-mts")
    public static SubLObject gtm_in_what_mts(final SubLObject start, final SubLObject finish, final SubLObject key_method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mode = (ONE_INTEGER.eql(gt_vars.$gt_index_arg$.getDynamicValue(thread))) ? $SUPERIOR : $INFERIOR;
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_what_mts_goal_node$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_path_list_of_nodes$.currentBinding(thread);
        final SubLObject _prev_bind_3 = gt_vars.$gt_path_list_of_mts$.currentBinding(thread);
        final SubLObject _prev_bind_4 = gt_vars.$gt_what_mts_result$.currentBinding(thread);
        try {
            gt_vars.$gt_what_mts_goal_node$.bind(finish, thread);
            gt_vars.$gt_path_list_of_nodes$.bind(NIL, thread);
            gt_vars.$gt_path_list_of_mts$.bind(NIL, thread);
            gt_vars.$gt_what_mts_result$.bind(NIL, thread);
            gt_vars.$gt_path_list_of_nodes$.setDynamicValue(cons(start, gt_vars.$gt_path_list_of_nodes$.getDynamicValue(thread)), thread);
            gt_which_mts(start, finish, key_method, mode);
            v_answer = genl_mts.max_mts(gt_vars.$gt_what_mts_result$.getDynamicValue(thread), UNPROVIDED);
        } finally {
            gt_vars.$gt_what_mts_result$.rebind(_prev_bind_4, thread);
            gt_vars.$gt_path_list_of_mts$.rebind(_prev_bind_3, thread);
            gt_vars.$gt_path_list_of_nodes$.rebind(_prev_bind_2, thread);
            gt_vars.$gt_what_mts_goal_node$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }/**
     * this is for superior, inferior, and accessible in-what-mts
     */


    public static final SubLObject gt_which_mts_alt(SubLObject arg1, SubLObject arg2, SubLObject key_method, SubLObject mode) {
        {
            SubLObject pcase_var = key_method;
            if (pcase_var.eql($HIERARCHICALLY_DIRECT)) {
                return com.cyc.cycjava.cycl.gt_methods.gt_hierarchically_direct_in_what_mts(arg1, mode);
            } else {
                return gt_utilities.gt_error(THREE_INTEGER, $str_alt147$illegal_value_for_method_of_which, key_method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    public static SubLObject gt_which_mts(final SubLObject arg1, final SubLObject arg2, final SubLObject key_method, final SubLObject mode) {
        if (key_method.eql($HIERARCHICALLY_DIRECT)) {
            return gt_hierarchically_direct_in_what_mts(arg1, mode);
        }
        return gt_utilities.gt_error(THREE_INTEGER, $str147$illegal_value_for_method_of_which, key_method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject gt_hierarchically_direct_in_what_mts_alt(SubLObject start, SubLObject mode) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                        mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                        {
                            SubLObject catch_var = NIL;
                            try {
                                if (!(((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) || (NIL != Errors.$ignore_mustsP$.getDynamicValue(thread)))) {
                                    gt_utilities.gt_check_type_internal(start, $GT_INDEX, THREE_INTEGER);
                                }
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == gt_utilities.gt_modeP(mode)) {
                                        Errors.error($str_alt11$invalid_gt_mode___a, mode);
                                    }
                                }
                                {
                                    SubLObject _prev_bind_0_65 = gt_vars.$gt_mode$.currentBinding(thread);
                                    try {
                                        gt_vars.$gt_mode$.bind(mode, thread);
                                        SubLTrampolineFile.checkType($TRUE, TRUTH_P);
                                        {
                                            SubLObject _prev_bind_0_66 = gt_vars.$gt_truth$.currentBinding(thread);
                                            try {
                                                gt_vars.$gt_truth$.bind($TRUE, thread);
                                                result = gt_search.gt_access_all_while_unifying_mts(start);
                                            } finally {
                                                gt_vars.$gt_truth$.rebind(_prev_bind_0_66, thread);
                                            }
                                        }
                                    } finally {
                                        gt_vars.$gt_mode$.rebind(_prev_bind_0_65, thread);
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject gt_hierarchically_direct_in_what_mts(final SubLObject start, final SubLObject mode) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($GT_ERROR);
                if (((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                    gt_utilities.gt_check_type_internal(start, $GT_INDEX, THREE_INTEGER);
                }
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP(mode))) {
                    Errors.error($str11$invalid_gt_mode___a, mode);
                }
                final SubLObject _prev_bind_0_$65 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind(mode, thread);
                    assert NIL != enumeration_types.truth_p($TRUE) : "! enumeration_types.truth_p( _KW.$TRUE) " + ("enumeration_types.truth_p(gt_methods.$kw12$TRUE) " + "CommonSymbols.NIL != enumeration_types.truth_p(gt_methods.$kw12$TRUE) ") + $TRUE;
                    final SubLObject _prev_bind_0_$66 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind($TRUE, thread);
                        result = gt_search.gt_access_all_while_unifying_mts(start);
                    } finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$66, thread);
                    }
                } finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$65, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject associate_node_with_last_spec_total_alt(SubLObject node) {
        return ONE_INTEGER;
    }

    public static SubLObject associate_node_with_last_spec_total(final SubLObject node) {
        return ONE_INTEGER;
    }

    public static final SubLObject find_spec_cardinality_alt(SubLObject node) {
        if (NIL != cardinality_estimates.spec_cardinality(node)) {
            return cardinality_estimates.spec_cardinality(node);
        } else {
            return com.cyc.cycjava.cycl.gt_methods.associate_node_with_last_spec_total(node);
        }
    }

    public static SubLObject find_spec_cardinality(final SubLObject node) {
        if (NIL != cardinality_estimates.spec_cardinality(node)) {
            return cardinality_estimates.spec_cardinality(node);
        }
        return associate_node_with_last_spec_total(node);
    }

    public static final SubLObject gt_all_inferiors_with_their_max_mts_alt(SubLObject pred, SubLObject superior) {
        return transitivity.gtm(pred, $INFERIORS_WITH_MTS, superior, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject gt_all_inferiors_with_their_max_mts(final SubLObject pred, final SubLObject superior) {
        return transitivity.gtm(pred, $INFERIORS_WITH_MTS, superior, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject gtm_all_inferiors_with_mts_alt(SubLObject root) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject marking_table = make_hash_table(com.cyc.cycjava.cycl.gt_methods.find_spec_cardinality(root), UNPROVIDED, UNPROVIDED);
                SubLObject inferiors_with_mts = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == gt_utilities.gt_modeP($INFERIOR)) {
                                Errors.error($str_alt11$invalid_gt_mode___a, $INFERIOR);
                            }
                        }
                        {
                            SubLObject _prev_bind_0_67 = gt_vars.$gt_mode$.currentBinding(thread);
                            try {
                                gt_vars.$gt_mode$.bind($INFERIOR, thread);
                                SubLTrampolineFile.checkType($TRUE, TRUTH_P);
                                {
                                    SubLObject _prev_bind_0_68 = gt_vars.$gt_truth$.currentBinding(thread);
                                    SubLObject _prev_bind_1_69 = gt_vars.$gt_marking_table$.currentBinding(thread);
                                    try {
                                        gt_vars.$gt_truth$.bind($TRUE, thread);
                                        gt_vars.$gt_marking_table$.bind(marking_table, thread);
                                        inferiors_with_mts = gt_search.gt_all_accessed_with_mts(root);
                                    } finally {
                                        gt_vars.$gt_marking_table$.rebind(_prev_bind_1_69, thread);
                                        gt_vars.$gt_truth$.rebind(_prev_bind_0_68, thread);
                                    }
                                }
                            } finally {
                                gt_vars.$gt_mode$.rebind(_prev_bind_0_67, thread);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return inferiors_with_mts;
            }
        }
    }

    public static SubLObject gtm_all_inferiors_with_mts(final SubLObject root) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject marking_table = make_hash_table(find_spec_cardinality(root), UNPROVIDED, UNPROVIDED);
        SubLObject inferiors_with_mts = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($INFERIOR))) {
                Errors.error($str11$invalid_gt_mode___a, $INFERIOR);
            }
            final SubLObject _prev_bind_0_$67 = gt_vars.$gt_mode$.currentBinding(thread);
            try {
                gt_vars.$gt_mode$.bind($INFERIOR, thread);
                assert NIL != enumeration_types.truth_p($TRUE) : "! enumeration_types.truth_p( _KW.$TRUE) " + ("enumeration_types.truth_p(gt_methods.$kw12$TRUE) " + "CommonSymbols.NIL != enumeration_types.truth_p(gt_methods.$kw12$TRUE) ") + $TRUE;
                final SubLObject _prev_bind_0_$68 = gt_vars.$gt_truth$.currentBinding(thread);
                final SubLObject _prev_bind_1_$69 = gt_vars.$gt_marking_table$.currentBinding(thread);
                try {
                    gt_vars.$gt_truth$.bind($TRUE, thread);
                    gt_vars.$gt_marking_table$.bind(marking_table, thread);
                    inferiors_with_mts = gt_search.gt_all_accessed_with_mts(root);
                } finally {
                    gt_vars.$gt_marking_table$.rebind(_prev_bind_1_$69, thread);
                    gt_vars.$gt_truth$.rebind(_prev_bind_0_$68, thread);
                }
            } finally {
                gt_vars.$gt_mode$.rebind(_prev_bind_0_$67, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return inferiors_with_mts;
    }

    public static final SubLObject find_instance_cardinality_alt(SubLObject node) {
        if (NIL != cardinality_estimates.instance_cardinality(node)) {
            return cardinality_estimates.instance_cardinality(node);
        } else {
            return $int$128;
        }
    }

    public static SubLObject find_instance_cardinality(final SubLObject node) {
        if (NIL != cardinality_estimates.instance_cardinality(node)) {
            return cardinality_estimates.instance_cardinality(node);
        }
        return $int$128;
    }

    public static final SubLObject gt_all_fort_instances_with_their_max_mts_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject real_result = NIL;
                SubLObject cols = com.cyc.cycjava.cycl.gt_methods.gt_all_inferiors_with_their_max_mts($$genls, node);
                SubLObject num_cols = length(cols);
                SubLObject col_mt_hash = make_hash_table(num_cols, UNPROVIDED, UNPROVIDED);
                SubLObject inst_mt_hash = make_hash_table(com.cyc.cycjava.cycl.gt_methods.find_instance_cardinality(node), UNPROVIDED, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
                    try {
                        gt_vars.$gt_result$.bind(NIL, thread);
                        {
                            SubLObject result = NIL;
                            Errors.sublisp_break($$$before_gathering_instances, EMPTY_SUBL_OBJECT_ARRAY);
                            {
                                SubLObject cdolist_list_var = cols;
                                SubLObject col = NIL;
                                for (col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col = cdolist_list_var.first()) {
                                    sethash(col.first(), col_mt_hash, col.rest());
                                    {
                                        SubLObject _prev_bind_0_70 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                        try {
                                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                            gt_search.gt_map_arg_index(symbol_function(ADD_RESULT_TO_GT_RESULT), col.first(), TWO_INTEGER, $$isa, $TRUE);
                                        } finally {
                                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_70, thread);
                                        }
                                    }
                                }
                            }
                            Errors.sublisp_break($str_alt157$after_instances__before_maximin, EMPTY_SUBL_OBJECT_ARRAY);
                            {
                                SubLObject cdolist_list_var = gt_vars.$gt_result$.getDynamicValue(thread);
                                SubLObject assrt = NIL;
                                for (assrt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assrt = cdolist_list_var.first()) {
                                    {
                                        SubLObject inst = assertions_high.gaf_arg1(assrt);
                                        SubLObject inst_mts = gethash(inst, inst_mt_hash, UNPROVIDED);
                                        SubLObject coll = assertions_high.gaf_arg2(assrt);
                                        SubLObject col_mts = gethash(coll, col_mt_hash, UNPROVIDED);
                                        SubLObject valid_mts = gt_search.gt_maximin_mts_among_lists(col_mts, assertions_high.assertion_mt(assrt));
                                        if (NIL != valid_mts) {
                                            inst_mts = list_utilities.remove_duplicate_forts(append(valid_mts, inst_mts));
                                            sethash(inst, inst_mt_hash, inst_mts);
                                        }
                                    }
                                }
                            }
                            Errors.sublisp_break($$$after_maximin, EMPTY_SUBL_OBJECT_ARRAY);
                            {
                                SubLObject inst = NIL;
                                SubLObject mts = NIL;
                                {
                                    final Iterator cdohash_iterator = getEntrySetIterator(inst_mt_hash);
                                    try {
                                        while (iteratorHasNext(cdohash_iterator)) {
                                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                            inst = getEntryKey(cdohash_entry);
                                            mts = getEntryValue(cdohash_entry);
                                            result = cons(cons(inst, com.cyc.cycjava.cycl.gt_methods.gt_max_nodes($$genlMt, mts, UNPROVIDED, UNPROVIDED)), result);
                                        } 
                                    } finally {
                                        releaseEntrySetIterator(cdohash_iterator);
                                    }
                                }
                            }
                            real_result = result;
                        }
                    } finally {
                        gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
                    }
                }
                return real_result;
            }
        }
    }

    public static SubLObject gt_all_fort_instances_with_their_max_mts(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject real_result = NIL;
        final SubLObject cols = gt_all_inferiors_with_their_max_mts($$genls, node);
        final SubLObject num_cols = length(cols);
        final SubLObject col_mt_hash = make_hash_table(num_cols, UNPROVIDED, UNPROVIDED);
        final SubLObject inst_mt_hash = make_hash_table(find_instance_cardinality(node), UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
        try {
            gt_vars.$gt_result$.bind(NIL, thread);
            SubLObject result = NIL;
            Errors.sublisp_break($$$before_gathering_instances, EMPTY_SUBL_OBJECT_ARRAY);
            SubLObject cdolist_list_var = cols;
            SubLObject col = NIL;
            col = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                sethash(col.first(), col_mt_hash, col.rest());
                final SubLObject _prev_bind_0_$70 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    gt_search.gt_map_arg_index(symbol_function(ADD_RESULT_TO_GT_RESULT), col.first(), TWO_INTEGER, $$isa, $TRUE);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$70, thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                col = cdolist_list_var.first();
            } 
            Errors.sublisp_break($str157$after_instances__before_maximin, EMPTY_SUBL_OBJECT_ARRAY);
            cdolist_list_var = gt_vars.$gt_result$.getDynamicValue(thread);
            SubLObject assrt = NIL;
            assrt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject inst = assertions_high.gaf_arg1(assrt);
                SubLObject inst_mts = gethash(inst, inst_mt_hash, UNPROVIDED);
                final SubLObject coll = assertions_high.gaf_arg2(assrt);
                final SubLObject col_mts = gethash(coll, col_mt_hash, UNPROVIDED);
                final SubLObject valid_mts = gt_search.gt_maximin_mts_among_lists(col_mts, assertions_high.assertion_mt(assrt));
                if (NIL != valid_mts) {
                    inst_mts = list_utilities.remove_duplicate_forts(append(valid_mts, inst_mts));
                    sethash(inst, inst_mt_hash, inst_mts);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assrt = cdolist_list_var.first();
            } 
            Errors.sublisp_break($$$after_maximin, EMPTY_SUBL_OBJECT_ARRAY);
            SubLObject inst2 = NIL;
            SubLObject mts = NIL;
            final Iterator cdohash_iterator = getEntrySetIterator(inst_mt_hash);
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    inst2 = getEntryKey(cdohash_entry);
                    mts = getEntryValue(cdohash_entry);
                    result = cons(cons(inst2, gt_max_nodes($$genlMt, mts, UNPROVIDED, UNPROVIDED)), result);
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
            real_result = result;
        } finally {
            gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
        }
        return real_result;
    }

    public static final SubLObject add_result_to_gt_result_alt(SubLObject elt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            gt_vars.$gt_result$.setDynamicValue(cons(elt, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
            return NIL;
        }
    }

    public static SubLObject add_result_to_gt_result(final SubLObject elt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        gt_vars.$gt_result$.setDynamicValue(cons(elt, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
        return NIL;
    }

    public static final SubLObject gt_isa_in_what_mts_alt(SubLObject inferior, SubLObject superior) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
                    try {
                        gt_vars.$gt_result$.bind(NIL, thread);
                        {
                            SubLObject isa_assertion_list = NIL;
                            SubLObject isa_mt = NIL;
                            SubLObject immediate_isa = NIL;
                            SubLObject minimized = NIL;
                            SubLObject path_most_genl_mts = NIL;
                            {
                                SubLObject _prev_bind_0_71 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                    gt_search.gt_map_arg_index(symbol_function(ADD_RESULT_TO_GT_RESULT), inferior, ONE_INTEGER, $$isa, $TRUE);
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_71, thread);
                                }
                            }
                            isa_assertion_list = gt_vars.$gt_result$.getDynamicValue(thread);
                            {
                                SubLObject cdolist_list_var = isa_assertion_list;
                                SubLObject assertion = NIL;
                                for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                    isa_mt = assertions_high.assertion_mt(assertion);
                                    immediate_isa = assertions_high.gaf_arg2(assertion);
                                    path_most_genl_mts = com.cyc.cycjava.cycl.gt_methods.gt_superior_in_what_mts($$genls, immediate_isa, superior);
                                    if (NIL != path_most_genl_mts) {
                                        {
                                            SubLObject cdolist_list_var_72 = path_most_genl_mts;
                                            SubLObject valid_mt_for_path = NIL;
                                            for (valid_mt_for_path = cdolist_list_var_72.first(); NIL != cdolist_list_var_72; cdolist_list_var_72 = cdolist_list_var_72.rest() , valid_mt_for_path = cdolist_list_var_72.first()) {
                                                minimized = com.cyc.cycjava.cycl.gt_methods.gt_min_nodes($$genlMt, list(isa_mt, valid_mt_for_path), UNPROVIDED);
                                                if (NIL != list_utilities.singletonP(minimized)) {
                                                    result = cons(minimized.first(), result);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
                    }
                }
                result = com.cyc.cycjava.cycl.gt_methods.gt_max_nodes($$genlMt, result, UNPROVIDED, UNPROVIDED);
                return result;
            }
        }
    }

    public static SubLObject gt_isa_in_what_mts(final SubLObject inferior, final SubLObject superior) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
        try {
            gt_vars.$gt_result$.bind(NIL, thread);
            SubLObject isa_assertion_list = NIL;
            SubLObject isa_mt = NIL;
            SubLObject immediate_isa = NIL;
            SubLObject minimized = NIL;
            SubLObject path_most_genl_mts = NIL;
            final SubLObject _prev_bind_0_$71 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                gt_search.gt_map_arg_index(symbol_function(ADD_RESULT_TO_GT_RESULT), inferior, ONE_INTEGER, $$isa, $TRUE);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$71, thread);
            }
            SubLObject cdolist_list_var;
            isa_assertion_list = cdolist_list_var = gt_vars.$gt_result$.getDynamicValue(thread);
            SubLObject assertion = NIL;
            assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                isa_mt = assertions_high.assertion_mt(assertion);
                immediate_isa = assertions_high.gaf_arg2(assertion);
                path_most_genl_mts = gt_superior_in_what_mts($$genls, immediate_isa, superior);
                if (NIL != path_most_genl_mts) {
                    SubLObject cdolist_list_var_$72 = path_most_genl_mts;
                    SubLObject valid_mt_for_path = NIL;
                    valid_mt_for_path = cdolist_list_var_$72.first();
                    while (NIL != cdolist_list_var_$72) {
                        minimized = gt_min_nodes($$genlMt, list(isa_mt, valid_mt_for_path), UNPROVIDED);
                        if (NIL != list_utilities.singletonP(minimized)) {
                            result = cons(minimized.first(), result);
                        }
                        cdolist_list_var_$72 = cdolist_list_var_$72.rest();
                        valid_mt_for_path = cdolist_list_var_$72.first();
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            } 
        } finally {
            gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
        }
        result = gt_max_nodes($$genlMt, result, UNPROVIDED, UNPROVIDED);
        return result;
    }

    /**
     * Returns list of nodes connecting INFERIOR with SUPERIOR
     */
    @LispMethod(comment = "Returns list of nodes connecting INFERIOR with SUPERIOR")
    public static final SubLObject gt_any_superior_path_alt(SubLObject predicate, SubLObject inferior, SubLObject superior, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(predicate, FORT_P);
        SubLTrampolineFile.checkType(inferior, GT_TERM_P);
        SubLTrampolineFile.checkType(superior, GT_TERM_P);
        return transitivity.gtm(predicate, $ANY_SUPERIOR_PATH, inferior, superior, mt, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Returns list of nodes connecting INFERIOR with SUPERIOR")
    public static SubLObject gt_any_superior_path(final SubLObject predicate, final SubLObject inferior, final SubLObject superior, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(predicate, FORT_P);
        SubLTrampolineFile.enforceType(inferior, GT_TERM_P);
        SubLTrampolineFile.enforceType(superior, GT_TERM_P);
        return transitivity.gtm(predicate, $ANY_SUPERIOR_PATH, inferior, superior, mt, UNPROVIDED, UNPROVIDED);
    }/**
     * Returns list of nodes connecting INFERIOR with SUPERIOR
     */


    /**
     * Returns list of nodes connecting f1 with f2
     */
    @LispMethod(comment = "Returns list of nodes connecting f1 with f2")
    public static final SubLObject gtm_any_superior_path_alt(SubLObject spec, SubLObject genl, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject path = NIL;
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
                            SubLObject catch_var = NIL;
                            try {
                                if (!(((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) || (NIL != Errors.$ignore_mustsP$.getDynamicValue(thread)))) {
                                    gt_utilities.gt_check_type_internal(spec, $GT_INDEX, THREE_INTEGER);
                                }
                                if (!(((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) || (NIL != Errors.$ignore_mustsP$.getDynamicValue(thread)))) {
                                    gt_utilities.gt_check_type_internal(genl, $GT_GATHER, THREE_INTEGER);
                                }
                                if (genl == spec) {
                                    if (NIL != kb_accessors.reflexive_predicateP(gt_vars.$gt_pred$.getDynamicValue(thread))) {
                                        path = list(spec);
                                    }
                                } else {
                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                        if (NIL == gt_utilities.gt_modeP($SUPERIOR)) {
                                            Errors.error($str_alt11$invalid_gt_mode___a, $SUPERIOR);
                                        }
                                    }
                                    {
                                        SubLObject _prev_bind_0_73 = gt_vars.$gt_mode$.currentBinding(thread);
                                        try {
                                            gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                                            SubLTrampolineFile.checkType($TRUE, TRUTH_P);
                                            {
                                                SubLObject _prev_bind_0_74 = gt_vars.$gt_truth$.currentBinding(thread);
                                                try {
                                                    gt_vars.$gt_truth$.bind($TRUE, thread);
                                                    path = gt_search.gt_any_access_path(spec, genl);
                                                } finally {
                                                    gt_vars.$gt_truth$.rebind(_prev_bind_0_74, thread);
                                                }
                                            }
                                        } finally {
                                            gt_vars.$gt_mode$.rebind(_prev_bind_0_73, thread);
                                        }
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return path;
            }
        }
    }

    @LispMethod(comment = "Returns list of nodes connecting f1 with f2")
    public static SubLObject gtm_any_superior_path(final SubLObject spec, final SubLObject genl, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject path = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($GT_ERROR);
                if (((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                    gt_utilities.gt_check_type_internal(spec, $GT_INDEX, THREE_INTEGER);
                }
                if (((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                    gt_utilities.gt_check_type_internal(genl, $GT_GATHER, THREE_INTEGER);
                }
                if (genl.eql(spec)) {
                    if (NIL != kb_accessors.reflexive_predicateP(gt_vars.$gt_pred$.getDynamicValue(thread))) {
                        path = list(spec);
                    }
                } else {
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($SUPERIOR))) {
                        Errors.error($str11$invalid_gt_mode___a, $SUPERIOR);
                    }
                    final SubLObject _prev_bind_0_$73 = gt_vars.$gt_mode$.currentBinding(thread);
                    try {
                        gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                        assert NIL != enumeration_types.truth_p($TRUE) : "! enumeration_types.truth_p( _KW.$TRUE) " + ("enumeration_types.truth_p(gt_methods.$kw12$TRUE) " + "CommonSymbols.NIL != enumeration_types.truth_p(gt_methods.$kw12$TRUE) ") + $TRUE;
                        final SubLObject _prev_bind_0_$74 = gt_vars.$gt_truth$.currentBinding(thread);
                        try {
                            gt_vars.$gt_truth$.bind($TRUE, thread);
                            path = gt_search.gt_any_access_path(spec, genl);
                        } finally {
                            gt_vars.$gt_truth$.rebind(_prev_bind_0_$74, thread);
                        }
                    } finally {
                        gt_vars.$gt_mode$.rebind(_prev_bind_0_$73, thread);
                    }
                }
            } catch (final Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return path;
    }/**
     * Returns list of nodes connecting f1 with f2
     */


    public static SubLObject declare_gt_methods_file() {
        declareFunction("gt_superiors", "GT-SUPERIORS", 2, 1, false);
        declareFunction("gtm_superiors", "GTM-SUPERIORS", 1, 1, false);
        declareFunction("gt_min_superiors", "GT-MIN-SUPERIORS", 2, 1, false);
        declareFunction("gtm_min_superiors", "GTM-MIN-SUPERIORS", 1, 1, false);
        declareFunction("gt_inferiors", "GT-INFERIORS", 2, 1, false);
        declareFunction("gtm_inferiors", "GTM-INFERIORS", 1, 1, false);
        declareFunction("gt_max_inferiors", "GT-MAX-INFERIORS", 2, 1, false);
        declareFunction("gtm_max_inferiors", "GTM-MAX-INFERIORS", 1, 1, false);
        declareFunction("gt_co_superiors", "GT-CO-SUPERIORS", 2, 1, false);
        declareFunction("gtm_co_superiors", "GTM-CO-SUPERIORS", 1, 2, false);
        declareFunction("gt_co_inferiors", "GT-CO-INFERIORS", 2, 1, false);
        declareFunction("gtm_co_inferiors", "GTM-CO-INFERIORS", 1, 2, false);
        declareFunction("gt_redundant_superiors", "GT-REDUNDANT-SUPERIORS", 2, 1, false);
        declareFunction("gtm_redundant_superiors", "GTM-REDUNDANT-SUPERIORS", 1, 1, false);
        declareFunction("gt_redundant_inferiors", "GT-REDUNDANT-INFERIORS", 2, 1, false);
        declareFunction("gtm_redundant_inferiors", "GTM-REDUNDANT-INFERIORS", 1, 1, false);
        declareFunction("gt_all_superiors", "GT-ALL-SUPERIORS", 2, 1, false);
        declareFunction("gtm_all_superiors", "GTM-ALL-SUPERIORS", 1, 1, false);
        declareFunction("gt_all_inferiors", "GT-ALL-INFERIORS", 2, 1, false);
        declareFunction("gtm_all_inferiors", "GTM-ALL-INFERIORS", 1, 1, false);
        declareFunction("gt_union_all_inferiors", "GT-UNION-ALL-INFERIORS", 2, 1, false);
        declareFunction("gtm_union_all_inferiors", "GTM-UNION-ALL-INFERIORS", 1, 1, false);
        declareFunction("gt_all_accessible", "GT-ALL-ACCESSIBLE", 2, 1, false);
        declareFunction("gtm_all_accessible", "GTM-ALL-ACCESSIBLE", 1, 1, false);
        declareFunction("gt_roots", "GT-ROOTS", 2, 1, false);
        declareFunction("gtm_roots", "GTM-ROOTS", 1, 1, false);
        declareFunction("gt_leaves", "GT-LEAVES", 2, 1, false);
        declareFunction("gtm_leaves", "GTM-LEAVES", 1, 1, false);
        declareFunction("gt_compose_fn_all_superiors", "GT-COMPOSE-FN-ALL-SUPERIORS", 3, 2, false);
        declareFunction("gtm_compose_fn_all_superiors", "GTM-COMPOSE-FN-ALL-SUPERIORS", 2, 2, false);
        declareFunction("gt_compose_fn_all_inferiors", "GT-COMPOSE-FN-ALL-INFERIORS", 3, 2, false);
        declareFunction("gtm_compose_fn_all_inferiors", "GTM-COMPOSE-FN-ALL-INFERIORS", 2, 2, false);
        declareFunction("gt_compose_pred_all_superiors", "GT-COMPOSE-PRED-ALL-SUPERIORS", 3, 3, false);
        declareFunction("gtm_compose_pred_all_superiors", "GTM-COMPOSE-PRED-ALL-SUPERIORS", 2, 3, false);
        declareFunction("gt_compose_pred_all_inferiors", "GT-COMPOSE-PRED-ALL-INFERIORS", 3, 3, false);
        declareFunction("gtm_compose_pred_all_inferiors", "GTM-COMPOSE-PRED-ALL-INFERIORS", 2, 3, false);
        declareFunction("gt_all_dependent_inferiors", "GT-ALL-DEPENDENT-INFERIORS", 2, 1, false);
        declareFunction("gtm_all_dependent_inferiors", "GTM-ALL-DEPENDENT-INFERIORS", 1, 1, false);
        declareFunction("gt_booleanP", "GT-BOOLEAN?", 3, 1, false);
        declareFunction("gtm_booleanP", "GTM-BOOLEAN?", 2, 1, false);
        declareFunction("gt_superiorP", "GT-SUPERIOR?", 3, 1, false);
        declareFunction("gtm_superiorP", "GTM-SUPERIOR?", 2, 1, false);
        declareFunction("gt_why_superiorP", "GT-WHY-SUPERIOR?", 3, 1, false);
        declareFunction("gt_support_predicate", "GT-SUPPORT-PREDICATE", 1, 0, false);
        declareFunction("gt_support_sentence", "GT-SUPPORT-SENTENCE", 1, 0, false);
        declareFunction("gtm_why_superiorP", "GTM-WHY-SUPERIOR?", 2, 1, false);
        declareFunction("gt_inferiorP", "GT-INFERIOR?", 3, 1, false);
        declareFunction("gtm_inferiorP", "GTM-INFERIOR?", 2, 1, false);
        declareFunction("gt_has_superiorP", "GT-HAS-SUPERIOR?", 3, 1, false);
        declareFunction("gtm_has_superiorP", "GTM-HAS-SUPERIOR?", 2, 1, false);
        declareFunction("gt_has_inferiorP", "GT-HAS-INFERIOR?", 3, 1, false);
        declareFunction("gtm_has_inferiorP", "GTM-HAS-INFERIOR?", 2, 1, false);
        declareFunction("gt_gather_inferior", "GT-GATHER-INFERIOR", 3, 1, false);
        declareFunction("gtm_gather_inferior", "GTM-GATHER-INFERIOR", 2, 1, false);
        declareFunction("gt_gather_superior", "GT-GATHER-SUPERIOR", 3, 1, false);
        declareFunction("gtm_gather_superior", "GTM-GATHER-SUPERIOR", 2, 1, false);
        declareFunction("gt_cyclesP", "GT-CYCLES?", 2, 1, false);
        declareFunction("gtm_cyclesP", "GTM-CYCLES?", 1, 2, false);
        declareFunction("gt_completes_cycleP", "GT-COMPLETES-CYCLE?", 3, 1, false);
        declareFunction("gtm_completes_cycleP", "GTM-COMPLETES-CYCLE?", 2, 2, false);
        declareFunction("gt_why_completes_cycleP", "GT-WHY-COMPLETES-CYCLE?", 3, 1, false);
        declareFunction("gtm_why_completes_cycleP", "GTM-WHY-COMPLETES-CYCLE?", 2, 2, false);
        declareFunction("gt_min_nodes", "GT-MIN-NODES", 2, 1, false);
        declareFunction("gtm_min_nodes", "GTM-MIN-NODES", 1, 1, false);
        declareFunction("gt_max_nodes", "GT-MAX-NODES", 2, 2, false);
        declareFunction("gtm_max_nodes", "GTM-MAX-NODES", 1, 2, false);
        declareFunction("gt_max_nodes_down", "GT-MAX-NODES-DOWN", 1, 1, false);
        declareFunction("gt_max_nodes_up_with_hash", "GT-MAX-NODES-UP-WITH-HASH", 1, 1, false);
        declareFunction("gt_max_nodes_up", "GT-MAX-NODES-UP", 1, 1, false);
        declareFunction("gt_min_ceilings", "GT-MIN-CEILINGS", 2, 2, false);
        declareFunction("gtm_min_ceilings", "GTM-MIN-CEILINGS", 1, 2, false);
        declareFunction("gt_ceilings", "GT-CEILINGS", 1, 2, false);
        declareFunction("gt_ceilings_int", "GT-CEILINGS-INT", 1, 2, false);
        declareFunction("gt_max_floors", "GT-MAX-FLOORS", 2, 2, false);
        declareFunction("gtm_max_floors", "GTM-MAX-FLOORS", 1, 2, false);
        declareFunction("gt_floors", "GT-FLOORS", 1, 2, false);
        declareFunction("gt_floors_int", "GT-FLOORS-INT", 1, 2, false);
        declareFunction("gt_min_superiors_excluding", "GT-MIN-SUPERIORS-EXCLUDING", 3, 1, false);
        declareFunction("gtm_min_superiors_excluding", "GTM-MIN-SUPERIORS-EXCLUDING", 2, 1, false);
        declareFunction("gt_max_inferiors_excluding", "GT-MAX-INFERIORS-EXCLUDING", 3, 1, false);
        declareFunction("gtm_max_inferiors_excluding", "GTM-MAX-INFERIORS-EXCLUDING", 2, 1, false);
        declareFunction("gt_all_superior_edges", "GT-ALL-SUPERIOR-EDGES", 3, 1, false);
        declareFunction("gt_all_inferior_edges", "GT-ALL-INFERIOR-EDGES", 3, 1, false);
        declareFunction("gtm_all_superior_edges", "GTM-ALL-SUPERIOR-EDGES", 2, 1, false);
        declareFunction("gtm_all_inferior_edges", "GTM-ALL-INFERIOR-EDGES", 2, 1, false);
        declareFunction("gt_all_paths", "GT-ALL-PATHS", 3, 1, false);
        declareFunction("gtm_all_paths", "GTM-ALL-PATHS", 2, 1, false);
        declareFunction("gt_superior_in_what_mts", "GT-SUPERIOR-IN-WHAT-MTS", 3, 0, false);
        declareFunction("gtm_in_what_mts", "GTM-IN-WHAT-MTS", 3, 0, false);
        declareFunction("gt_which_mts", "GT-WHICH-MTS", 4, 0, false);
        declareFunction("gt_hierarchically_direct_in_what_mts", "GT-HIERARCHICALLY-DIRECT-IN-WHAT-MTS", 2, 0, false);
        declareFunction("associate_node_with_last_spec_total", "ASSOCIATE-NODE-WITH-LAST-SPEC-TOTAL", 1, 0, false);
        declareFunction("find_spec_cardinality", "FIND-SPEC-CARDINALITY", 1, 0, false);
        declareFunction("gt_all_inferiors_with_their_max_mts", "GT-ALL-INFERIORS-WITH-THEIR-MAX-MTS", 2, 0, false);
        declareFunction("gtm_all_inferiors_with_mts", "GTM-ALL-INFERIORS-WITH-MTS", 1, 0, false);
        declareFunction("find_instance_cardinality", "FIND-INSTANCE-CARDINALITY", 1, 0, false);
        declareFunction("gt_all_fort_instances_with_their_max_mts", "GT-ALL-FORT-INSTANCES-WITH-THEIR-MAX-MTS", 1, 0, false);
        declareFunction("add_result_to_gt_result", "ADD-RESULT-TO-GT-RESULT", 1, 0, false);
        declareFunction("gt_isa_in_what_mts", "GT-ISA-IN-WHAT-MTS", 2, 0, false);
        declareFunction("gt_any_superior_path", "GT-ANY-SUPERIOR-PATH", 3, 1, false);
        declareFunction("gtm_any_superior_path", "GTM-ANY-SUPERIOR-PATH", 2, 1, false);
        return NIL;
    }

    public static SubLObject init_gt_methods_file() {
        return NIL;
    }

    public static SubLObject setup_gt_methods_file() {
        register_cyc_api_function(GT_SUPERIORS, $list4, $str5$Returns_direct_superiors_of_FORT_, $list6, $list7);
        register_cyc_api_function(GT_MIN_SUPERIORS, $list4, $str16$Returns_minimal_superiors_of_FORT, $list6, $list7);
        register_cyc_api_function(GT_INFERIORS, $list4, $str19$Returns_direct_inferiors_of_FORT_, $list6, $list7);
        register_cyc_api_function(GT_MAX_INFERIORS, $list4, $str24$Returns_maximal_inferiors_of_FORT, $list6, $list7);
        register_cyc_api_function(GT_CO_SUPERIORS, $list4, $str27$Returns_sibling_direct_superiors_, $list6, $list7);
        register_cyc_api_function(GT_CO_INFERIORS, $list4, $str30$Returns_sibling_direct_inferiors_, $list6, $list7);
        register_cyc_api_function(GT_REDUNDANT_SUPERIORS, $list4, $str33$Returns_direct_superiors_of_FORT_, $list6, $list7);
        register_cyc_api_function(GT_REDUNDANT_INFERIORS, $list4, $str36$Returns_direct_inferiors_of_FORT_, $list6, $list7);
        register_cyc_api_function(GT_ALL_SUPERIORS, $list4, $str39$Returns_all_superiors_of_FORT_via, $list6, $list7);
        register_cyc_api_function(GT_ALL_INFERIORS, $list4, $str42$Returns_all_inferiors_of_FORT_via, $list6, $list7);
        register_cyc_api_function(GT_ALL_ACCESSIBLE, $list4, $str46$Returns_all_superiors_and_all_inf, $list6, $list7);
        register_cyc_api_function(GT_ROOTS, $list4, $str51$Returns_maximal_superiors__i_e___, $list6, $list7);
        register_cyc_api_function(GT_LEAVES, $list4, $str54$Returns_minimal_inferiors__i_e___, $list6, $list7);
        register_cyc_api_function(GT_COMPOSE_FN_ALL_SUPERIORS, $list59, $str60$Apply_fn_to_each_superior_of_FORT, $list61, NIL);
        register_cyc_api_function(GT_COMPOSE_FN_ALL_INFERIORS, $list64, $str65$Apply_fn_to_each_inferior_of_FORT, $list61, NIL);
        register_cyc_api_function(GT_COMPOSE_PRED_ALL_SUPERIORS, $list69, $str70$Returns_all_nodes_accessible_by_C, $list71, $list7);
        register_cyc_api_function(GT_COMPOSE_PRED_ALL_INFERIORS, $list69, $str75$Returns_all_nodes_accessible_by_C, $list71, $list7);
        register_cyc_api_function(GT_ALL_DEPENDENT_INFERIORS, $list4, $str78$Returns_all_inferiors_i_of_FORT_s, $list6, $list7);
        register_cyc_api_function($sym82$GT_WHY_SUPERIOR_, $list83, $str84$Returns_justification_of_why_SUPE, $list85, $list86);
        register_cyc_api_function($sym93$GT_HAS_SUPERIOR_, $list94, $str95$Returns_whetherfort_INFERIOR_is_h, $list96, $list97);
        register_cyc_api_function($sym98$GT_HAS_INFERIOR_, $list83, $str99$Returns_whether_fort_SUPERIOR_is_, $list85, $list97);
        register_cyc_api_function($sym103$GT_CYCLES_, $list4, $str104$Returns_whether_FORT_is_accessibl, $list6, $list97);
        register_cyc_api_function($sym106$GT_COMPLETES_CYCLE_, $list107, $str108$Returns_whether_a_transitive_path, $list109, $list97);
        register_cyc_api_function($sym111$GT_WHY_COMPLETES_CYCLE_, $list107, $str112$Returns_justification_that_a_tran, $list109, NIL);
        register_cyc_api_function(GT_MIN_NODES, $list116, $str117$Returns_returns_the_most_subordin, $list118, $list7);
        register_cyc_api_function(GT_MAX_NODES, $list122, $str123$Returns_returns_the_least_subordi, $list118, $list7);
        register_cyc_api_function(GT_MIN_CEILINGS, $list130, $str131$Returns_the_most_subordinate_comm, $list118, $list7);
        register_cyc_api_function(GT_MAX_FLOORS, $list130, $str135$Returns_the_least_subordinate_ele, $list118, $list7);
        register_cyc_api_function(GT_MIN_SUPERIORS_EXCLUDING, $list94, $str138$Returns_least_general_superiors_o, $list96, $list7);
        register_cyc_api_function(GT_MAX_INFERIORS_EXCLUDING, $list94, $str141$Returns_most_general_inferiors_of, $list96, $list7);
        register_cyc_api_function(GT_ANY_SUPERIOR_PATH, $list94, $str162$Returns_list_of_nodes_connecting_, $list96, $list7);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_gt_methods_file();
    }

    @Override
    public void initializeVariables() {
        init_gt_methods_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_gt_methods_file();
    }

    static {
    }

    static private final SubLList $list_alt4 = list(makeSymbol("PREDICATE"), makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    static private final SubLString $str_alt5$Returns_direct_superiors_of_FORT_ = makeString("Returns direct superiors of FORT via transitive PREDICATE");

    static private final SubLList $list_alt6 = list(list(makeSymbol("PREDICATE"), makeSymbol("FORT-P")), list(makeSymbol("FORT"), makeSymbol("GT-TERM-P")));

    static private final SubLList $list_alt7 = list(list(makeSymbol("LIST"), makeSymbol("GT-TERM-P")));

    static private final SubLString $str_alt11$invalid_gt_mode___a = makeString("invalid gt mode: ~a");

    static private final SubLString $str_alt16$Returns_minimal_superiors_of_FORT = makeString("Returns minimal superiors of FORT via transitive PREDICATE");

    static private final SubLString $str_alt19$Returns_direct_inferiors_of_FORT_ = makeString("Returns direct inferiors of FORT via transitive PREDICATE");

    static private final SubLString $str_alt24$Returns_maximal_inferiors_of_FORT = makeString("Returns maximal inferiors of FORT via transitive PREDICATE");

    static private final SubLString $str_alt27$Returns_sibling_direct_superiors_ = makeString("Returns sibling direct-superiors of direct-inferiors of FORT via PREDICATE, excluding FORT itself");

    static private final SubLString $str_alt30$Returns_sibling_direct_inferiors_ = makeString("Returns sibling direct-inferiors of direct-superiors of FORT via PREDICATE, excluding FORT itself");

    static private final SubLString $str_alt33$Returns_direct_superiors_of_FORT_ = makeString("Returns direct-superiors of FORT via PREDICATE that are subsumed by other superiors");

    static private final SubLString $str_alt36$Returns_direct_inferiors_of_FORT_ = makeString("Returns direct-inferiors of FORT via PREDICATE that subsumed other inferiors");

    static private final SubLString $str_alt39$Returns_all_superiors_of_FORT_via = makeString("Returns all superiors of FORT via PREDICATE");

    static private final SubLString $str_alt42$Returns_all_inferiors_of_FORT_via = makeString("Returns all inferiors of FORT via PREDICATE");

    static private final SubLString $str_alt46$Returns_all_superiors_and_all_inf = makeString("Returns all superiors and all inferiors of FORT via PREDICATE");

    static private final SubLString $str_alt51$Returns_maximal_superiors__i_e___ = makeString("Returns maximal superiors (i.e., roots) of FORT via PREDICATE");

    static private final SubLString $str_alt54$Returns_minimal_inferiors__i_e___ = makeString("Returns minimal inferiors (i.e., leaves) of FORT via PREDICATE");

    static private final SubLList $list_alt59 = list(makeSymbol("PREDICATE"), makeSymbol("FORT"), makeSymbol("FN"), makeSymbol("&OPTIONAL"), list(makeSymbol("COMBINE-FN"), list(makeSymbol("FUNCTION"), makeSymbol("CONS"))), makeSymbol("MT"));

    static private final SubLString $str_alt60$Apply_fn_to_each_superior_of_FORT = makeString("Apply fn to each superior of FORT;\n   fn takes a fort as its only arg, and must not effect the search status of each\n  fort it visits");

    static private final SubLList $list_alt61 = list(list(makeSymbol("PREDICATE"), makeSymbol("FORT-P")), list(makeSymbol("FORT"), makeSymbol("GT-TERM-P")), list(makeSymbol("FN"), makeSymbol("FUNCTION-SPEC-P")));

    static private final SubLList $list_alt64 = list(makeSymbol("PREDICATE"), makeSymbol("FORT"), makeSymbol("FN"), makeSymbol("&OPTIONAL"), list(makeSymbol("COMBINE-FN"), makeSymbol("*GT-COMBINE-FN*")), makeSymbol("MT"));

    static private final SubLString $str_alt65$Apply_fn_to_each_inferior_of_FORT = makeString("Apply fn to each inferior of FORT; \n   fn takes a fort as its only arg, and \n   it must not effect the search status of each fort it visits");

    static private final SubLList $list_alt69 = list(makeSymbol("PREDICATE"), makeSymbol("FORT"), makeSymbol("COMPOSE-PRED"), makeSymbol("&OPTIONAL"), list(makeSymbol("COMPOSE-INDEX-ARG"), makeSymbol("*GT-COMPOSE-INDEX-ARG*")), list(makeSymbol("COMPOSE-GATHER-ARG"), makeSymbol("*GT-COMPOSE-GATHER-ARG*")), makeSymbol("MT"));

    static private final SubLString $str_alt70$Returns_all_nodes_accessible_by_C = makeString("Returns all nodes accessible by COMPOSE-PRED from each superior of FORT along \n  transitive PREDICATE");

    static private final SubLList $list_alt71 = list(list(makeSymbol("PREDICATE"), makeSymbol("FORT-P")), list(makeSymbol("FORT"), makeSymbol("GT-TERM-P")), list(makeSymbol("COMPOSE-PRED"), makeSymbol("PREDICATE-IN-ANY-MT?")));

    static private final SubLString $str_alt75$Returns_all_nodes_accessible_by_C = makeString("Returns all nodes accessible by COMPOSE-PRED from each inferior of FORT along \n  transitive PREDICATE");

    static private final SubLString $str_alt78$Returns_all_inferiors_i_of_FORT_s = makeString("Returns all inferiors i of FORT s.t. every path connecting i to \n   any superior of FORT must pass through FORT");

    static private final SubLList $list_alt83 = list(makeSymbol("PREDICATE"), makeSymbol("SUPERIOR"), makeSymbol("INFERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    static private final SubLString $str_alt84$Returns_justification_of_why_SUPE = makeString("Returns justification of why SUPERIOR is superior to (i.e., hierarchically higher than) \n  INFERIOR");

    static private final SubLList $list_alt85 = list(list(makeSymbol("PREDICATE"), makeSymbol("FORT-P")), list(makeSymbol("SUPERIOR"), makeSymbol("GT-TERM-P")), list(makeSymbol("INFERIOR"), makeSymbol("GT-TERM-P")));

    static private final SubLList $list_alt86 = list(list(makeSymbol("LIST"), makeSymbol("ASSERTION-P")));

    static private final SubLList $list_alt94 = list(makeSymbol("PREDICATE"), makeSymbol("INFERIOR"), makeSymbol("SUPERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    static private final SubLString $str_alt95$Returns_whetherfort_INFERIOR_is_h = makeString("Returns whetherfort INFERIOR is hierarchically lower (wrt transitive PREDICATE) \n  to fort SUPERIOR?");

    static private final SubLList $list_alt96 = list(list(makeSymbol("PREDICATE"), makeSymbol("FORT-P")), list(makeSymbol("INFERIOR"), makeSymbol("GT-TERM-P")), list(makeSymbol("SUPERIOR"), makeSymbol("GT-TERM-P")));

    static private final SubLList $list_alt97 = list(makeSymbol("BOOLEANP"));

    static private final SubLString $str_alt99$Returns_whether_fort_SUPERIOR_is_ = makeString("Returns whether fort SUPERIOR is hierarchically higher \n   (wrt transitive PREDICATE) to fort INFERIOR?");

    static private final SubLString $str_alt104$Returns_whether_FORT_is_accessibl = makeString("Returns whether FORT is accessible from itself by one or more PREDICATE gafs?");

    static private final SubLList $list_alt107 = list(makeSymbol("PREDICATE"), makeSymbol("FORT1"), makeSymbol("FORT2"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    static private final SubLString $str_alt108$Returns_whether_a_transitive_path = makeString("Returns whether a transitive path connect FORT2 to FORT1, \n   or whether a transitive inverse path connect FORT1 to FORT2?");

    static private final SubLList $list_alt109 = list(list(makeSymbol("PREDICATE"), makeSymbol("FORT-P")), list(makeSymbol("FORT1"), makeSymbol("GT-TERM-P")), list(makeSymbol("FORT2"), makeSymbol("GT-TERM-P")));

    static private final SubLString $str_alt112$Returns_justification_that_a_tran = makeString("Returns justification that a transitive path connects FORT2 to FORT1, \n   or that a transitive inverse path connects FORT1 to FORT2?");

    static private final SubLList $list_alt116 = list(makeSymbol("PREDICATE"), makeSymbol("FORTS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    static private final SubLString $str_alt117$Returns_returns_the_most_subordin = makeString("Returns returns the most-subordinate elements of FORTS\n   (one member only of a cycle will be a min-node candidate)");

    static private final SubLList $list_alt118 = list(list(makeSymbol("PREDICATE"), makeSymbol("FORT-P")), list(makeSymbol("FORTS"), makeSymbol("LISTP")));

    static private final SubLList $list_alt122 = list(makeSymbol("PREDICATE"), makeSymbol("FORTS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), list(makeSymbol("DIRECTION"), makeSymbol("*GT-MAX-NODES-DIRECTION*")));

    static private final SubLString $str_alt123$Returns_returns_the_least_subordi = makeString("Returns returns the least-subordinate elements of FORTS\n   (<direction> should be :up unless all nodes are low in the hierarchy)");

    static private final SubLList $list_alt130 = list(makeSymbol("PREDICATE"), makeSymbol("FORTS"), makeSymbol("&OPTIONAL"), makeSymbol("CANDIDATES"), makeSymbol("MT"));

    static private final SubLString $str_alt131$Returns_the_most_subordinate_comm = makeString("Returns the most-subordinate common superiors of FORTS\n   (when CANDIDATES is non-nil, the result must subset it)");

    static private final SubLString $str_alt135$Returns_the_least_subordinate_ele = makeString("Returns the least-subordinate elements or common inferiors of FORTS\n   (when CANDIDATES is non-nil, the result must subset it)");

    static private final SubLString $str_alt138$Returns_least_general_superiors_o = makeString("Returns least-general superiors of INFERIOR ignoring SUPERIOR\n   (useful for splicing-out SUPERIOR from hierarchy)");

    static private final SubLString $str_alt141$Returns_most_general_inferiors_of = makeString("Returns most-general inferiors of SUPERIOR ignoring INFERIOR (expensive)\n   (useful for splicing-out INFERIOR from hierarchy)");

    static private final SubLString $str_alt147$illegal_value_for_method_of_which = makeString("illegal value for method of which-mts: ~s");

    static private final SubLString $str_alt157$after_instances__before_maximin = makeString("after instances, before maximin");

    static private final SubLString $str_alt162$Returns_list_of_nodes_connecting_ = makeString("Returns list of nodes connecting INFERIOR with SUPERIOR");
}

/**
 * Total time: 1122 ms
 */
