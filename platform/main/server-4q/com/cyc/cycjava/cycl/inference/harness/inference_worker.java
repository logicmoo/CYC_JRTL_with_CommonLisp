package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.arg_type;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.hl_macros;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.modules.transformation_modules;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_admitted_formula;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_non_wff;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class inference_worker extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "cafa6617e8e7236cc812046e709e55621786ba9a9aad0bbd8ee52f8b0cf7ca71";
    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 1700L)
    public static SubLSymbol $currently_considered_tactic$;
    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 2300L)
    public static SubLSymbol $currently_executing_tactics$;
    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 3600L)
    public static SubLSymbol $currently_active_problem$;
    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 4900L)
    public static SubLSymbol $currently_active_problem_store$;
    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 14000L)
    public static SubLSymbol $asent_of_currently_executing_tactic$;
    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 14100L)
    public static SubLSymbol $mt_of_currently_executing_tactic$;
    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 19300L)
    public static SubLSymbol $consider_variable_count_of_focal_problems_for_tactic_literals_score_method$;
    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 51200L)
    public static SubLSymbol $eager_proof_validationP$;
    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 51500L)
    public static SubLSymbol $proof_circularity_detection_enabledP$;
    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 55200L)
    private static SubLSymbol $circular_proof_max_depth_cutoff$;
    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 59400L)
    private static SubLSymbol $process_motivated_transformation_link_proofsP$;
    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 61100L)
    private static SubLSymbol $find_proof_bindings_optimization_enabledP$;
    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 72900L)
    public static SubLSymbol $proof_bubbling_depth$;
    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 73000L)
    public static SubLSymbol $max_proof_bubbling_depth$;
    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 78600L)
    private static SubLSymbol $within_abnormality_checkingP$;
    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 104400L)
    public static SubLSymbol $disable_link_propagationP$;
    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 124700L)
    private static SubLSymbol $bubble_up_proofs_through_closed_split_linksP$;
    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 129900L)
    public static SubLSymbol $reconsidering_set_asidesP$;
    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 172000L)
    private static SubLSymbol $always_consider_deepP$;
    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 196500L)
    public static SubLSymbol $problem_store_prune_reports$;
    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 202900L)
    private static SubLSymbol $possibly_propagate_problem_indestructible_stack$;
    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 221300L)
    private static SubLSymbol $processed_proofs_retain_one_proofP$;
    private static SubLList $list0;
    private static SubLSymbol $sym1$CLET;
    private static SubLSymbol $sym2$_CURRENTLY_CONSIDERED_TACTIC_;
    private static SubLSymbol $sym3$TACTIC_P;
    private static SubLSymbol $sym4$START_TIME;
    private static SubLSymbol $sym5$_CURRENTLY_EXECUTING_TACTICS_;
    private static SubLSymbol $sym6$CONS;
    private static SubLList $list7;
    private static SubLSymbol $sym8$CUNWIND_PROTECT;
    private static SubLSymbol $sym9$PROGN;
    private static SubLSymbol $sym10$PWHEN;
    private static SubLList $list11;
    private static SubLSymbol $sym12$CSETQ;
    private static SubLList $list13;
    private static SubLSymbol $sym14$POSSIBLY_UPDATE_HL_MODULE_TIMES;
    private static SubLSymbol $sym15$_;
    private static SubLList $list16;
    private static SubLList $list17;
    private static SubLSymbol $sym18$_CURRENTLY_ACTIVE_PROBLEM_;
    private static SubLList $list19;
    private static SubLList $list20;
    private static SubLSymbol $sym21$_NEGATION_BY_FAILURE_;
    private static SubLSymbol $sym22$PROBLEM_STORE_NEGATION_BY_FAILURE_;
    private static SubLSymbol $sym23$PROBLEM_P;
    private static SubLString $str24$_a_was_not_an__unexamined_problem;
    private static SubLString $str25$_a_was__unexamined_but_somehow_go;
    private static SubLSymbol $TACTICAL;
    private static SubLSymbol $SKIP;
    private static SubLSymbol $POS;
    private static SubLSymbol $NEG;
    private static SubLSymbol $REMOVAL_CONJUNCTIVE;
    private static SubLSymbol $COMPLETE;
    private static SubLList $list32;
    private static SubLSymbol $sym33$STRATEGY_P;
    private static SubLSymbol $NON_DISCARDED;
    private static SubLString $str35$unexpected_tactic__S;
    private static SubLString $str36$Tried_to_recursively_execute__a;
    private static SubLString $str37$Tried_to_execute_a_tactic_that_wa;
    private static SubLSymbol $INFERENCE;
    private static SubLString $str39$unexpected_tactic__s;
    private static SubLList $list40;
    private static SubLSymbol $sym41$_ASENT_OF_CURRENTLY_EXECUTING_TACTIC_;
    private static SubLSymbol $sym42$_MT_OF_CURRENTLY_EXECUTING_TACTIC_;
    private static SubLString $str43$Got_a_literal_level_tactic__s_tha;
    private static SubLString $str44$Unexpected_multiple_clause_tactic;
    private static SubLString $str45$Unexpected_multiple_literal_tacti;
    private static SubLString $str46$Unexpected_structural_multiple_li;
    private static SubLString $str47$Unexpected_meta_structural_multip;
    private static SubLString $str48$unexpected_connected_conjunction_;
    private static SubLString $str49$unexpected_connected_conjunction_;
    private static SubLSymbol $EXPONENTIAL;
    private static SubLSymbol $SQUARE;
    private static SubLSymbol $DOUBLE;
    private static SubLString $str53$unexpected_disjunctive_link__s;
    private static SubLString $str54$_s_was_not_a_logical_link_with_un;
    private static SubLSymbol $SPLIT;
    private static SubLSymbol $JOIN_ORDERED;
    private static SubLSymbol $UNION;
    private static SubLSymbol $JOIN;
    private static SubLString $str59$Unexpected_logical_tactic_module_;
    private static SubLString $str60$Join_tactics_like__S_do_not_have_;
    private static SubLSymbol $sym61$STRUCTURAL_PROOF_P;
    private static SubLString $str62$_a_is_not_a_CONTENT_LINK_P;
    private static SubLSymbol $sym63$CONTENT_TACTIC_P;
    private static SubLString $str64$Unexpected_content_tactic__S;
    private static SubLString $str65$Unexpected_removal_tactic__S;
    private static SubLSymbol $REMOVAL;
    private static SubLSymbol $RESTRICTION;
    private static SubLSymbol $sym68$CONJUNCTIVE_REMOVAL_TACTIC_P;
    private static SubLSymbol $sym69$TRANSFORMATION_TACTIC_P;
    private static SubLSymbol $TRANSFORMATION;
    private static SubLSymbol $sym71$REWRITE_TACTIC_P;
    private static SubLSymbol $REWRITE;
    private static SubLSymbol $sym73$META_REMOVAL_TACTIC_P;
    private static SubLSymbol $sym74$STRATEGIC_CONTEXT_P;
    private static SubLSymbol $PREFERRED;
    private static SubLSymbol $GENERALIZED_REMOVAL;
    private static SubLSymbol $POSSIBLE;
    private static SubLSymbol $DISPREFERRED;
    private static SubLSymbol $GROSSLY_DISPREFERRED;
    private static SubLSymbol $DISALLOWED;
    private static SubLSymbol $DOOMED;
    private static SubLString $str82$Unexpected_preference_level__s;
    private static SubLSymbol $CONNECTED_CONJUNCTION;
    private static SubLSymbol $STRUCTURAL;
    private static SubLSymbol $LOGICAL;
    private static SubLSymbol $IMPOSSIBLE;
    private static SubLSymbol $STRUCTURAL_CONJUNCTIVE;
    private static SubLSymbol $sym88$INTERMEDIATE_PROOF_STEP_VALID_MEMOIZED_;
    private static SubLSymbol $NONE;
    private static SubLSymbol $MINIMAL;
    private static SubLSymbol $ALL;
    private static SubLSymbol $ARG_TYPE;
    private static SubLString $str93$Unexpected_intermediate_step_vali;
    private static SubLList $list94;
    private static SubLString $str95$Didn_t_expect_to_bubble_up_a_proo;
    private static SubLString $str96$Unexpected_link_type_for_link__a;
    private static SubLSymbol $sym97$PROOF_REJECTED_;
    private static SubLString $str98$propose_new_proof_with_bindings__;
    private static SubLSymbol $REJECTED_SUBPROOF;
    private static SubLSymbol $sym100$PROOF_P;
    private static SubLInteger $int$300;
    private static SubLSymbol $CIRCULAR;
    private static SubLSymbol $ILL_FORMED;
    private static SubLSymbol $NON_ABDUCIBLE_RULE;
    private static SubLSymbol $MODUS_TOLLENS_WITH_NON_WFF;
    private static SubLSymbol $PROVEN;
    private static SubLList $list107;
    private static SubLSymbol $sym108$PROBLEM_LINK_TO_GOAL_P;
    private static SubLString $str109$expected_a_variable_map_to_be_nul;
    private static SubLSymbol $sym110$VARIABLE__;
    private static SubLSymbol $sym111$VARIABLE_BINDING_VARIABLE;
    private static SubLList $list112;
    private static SubLString $str113$Found_a_triplicate_binding_for__s;
    private static SubLString $str114$Could_not_find_two_values_in__s_w;
    private static SubLSymbol $sym115$BINDINGS_P;
    private static SubLInteger $int$100;
    private static SubLSymbol $MAX_PROOF_BUBBLING_DEPTH;
    private static SubLSymbol $ANSWER;
    private static SubLSymbol $sym119$VARIABLE_MAP_P;
    private static SubLSymbol $RESIDUAL_TRANSFORMATION;
    private static SubLSymbol $DISJUNCTIVE_ASSUMPTION;
    private static SubLString $str122$can_t_handle_bubbling_up_proofs_p;
    private static SubLSymbol $EXCEPTED_ASSERTION;
    private static SubLSymbol $sym124$CACHED_INFERENCE_PROOF_NON_EXPLANATORY_SUBPROOFS;
    private static SubLSymbol $sym125$GENERALIZED_TRANSFORMATION_PROOF_P;
    private static SubLString $str126$generalized_transformation_proof_;
    private static SubLString $str127$Invalid_sense__s;
    private static SubLSymbol $UNEXAMINED;
    private static SubLString $str129$Tried_to_make__a_pending_but_it_s;
    private static SubLSymbol $INTUITIVE;
    private static SubLSymbol $UNDETERMINED;
    private static SubLSymbol $sym132$UNION_LINK_P;
    private static SubLString $str133$Uninteresting_problem_status_chan;
    private static SubLSymbol $SUBSTRATEGY_PROBLEM_STATUS_CHANGE;
    private static SubLString $str135$possible_problem_with_no_tactics_;
    private static SubLSymbol $NEW;
    private static SubLSymbol $UNEXAMINED_GOOD;
    private static SubLSymbol $UNEXAMINED_NO_GOOD;
    private static SubLSymbol $EXAMINED;
    private static SubLSymbol $EXAMINED_GOOD;
    private static SubLSymbol $EXAMINED_NO_GOOD;
    private static SubLSymbol $PENDING;
    private static SubLSymbol $POSSIBLE_GOOD;
    private static SubLSymbol $PENDING_GOOD;
    private static SubLSymbol $PENDING_NO_GOOD;
    private static SubLSymbol $FINISHED;
    private static SubLSymbol $FINISHED_GOOD;
    private static SubLSymbol $FINISHED_NO_GOOD;
    private static SubLString $str149$Problem__a_attempted_to_change_st;
    private static SubLString $str150$new_problem_cannot_become_good_ye;
    private static SubLString $str151$unknown_problem_status__a;
    private static SubLString $str152$problem_status__a_cannot_become_u;
    private static SubLString $str153$problem_of_status__a_cannot_be_ex;
    private static SubLSymbol $POSSIBLE_NO_GOOD;
    private static SubLString $str155$problem_of_status__a_cannot_be_ma;
    private static SubLString $str156$problem_of_status__a_cannot_be_pe;
    private static SubLString $str157$problem_of_status__a_cannot_be_fi;
    private static SubLString $str158$unexpected_link_type__S;
    private static SubLSymbol $PROBLEM_NO_GOOD;
    private static SubLSymbol $CONJUNCTIVE;
    private static SubLSymbol $CONTENT;
    private static SubLString $str162$Unexpected_status__s;
    private static SubLSymbol $FINISHED_CLOSED_SINGLE_LITERAL_OR_FINISHED_MULTI_LITERAL;
    private static SubLSymbol $PENDING_COMPLETE;
    private static SubLSymbol $PENDING_PREFERRED;
    private static SubLSymbol $NO_GOOD_SPLIT_LINK;
    private static SubLSymbol $NO_GOOD_PREFERRED_JO_LINK;
    private static SubLSymbol $NO_GOOD_JOIN_LINK;
    private static SubLSymbol $NO_GOOD_UNION_LINKS;
    private static SubLString $str170$Can_t_bind_;
    private static SubLSymbol $sym171$VARIABLE_P;
    private static SubLString $str172$__previously_was_;
    private static SubLString $str173$_due_to_;
    private static SubLString $str174$_;
    private static SubLSymbol $SIMPLIFICATION;
    private static SubLList $list176;
    private static SubLSymbol $ANYTHING;
    private static SubLList $list178;
    private static SubLSymbol $sym179$FILTER_PROOF_SPECS_OF_TYPE;
    private static SubLSymbol $sym180$PUNLESS;
    private static SubLSymbol $sym181$NULL;
    private static SubLSymbol $sym182$JOIN_ORDERED_PROOF_SPEC_P;
    private static SubLSymbol $sym183$RESIDUAL_TRANSFORMATION_PROOF_SPEC_P;
    private static SubLSymbol $sym184$RESTRICTION_PROOF_SPEC_P;
    private static SubLSymbol $sym185$SPLIT_PROOF_SPEC_P;
    private static SubLSymbol $sym186$JOIN_PROOF_SPEC_P;
    private static SubLSymbol $sym187$CONJUNCTIVE_REMOVAL_PROOF_SPEC_P;
    private static SubLSymbol $sym188$TRANSFORMATION_PROOF_SPEC_P;
    private static SubLSymbol $sym189$UNION_PROOF_SPEC_P;
    private static SubLString $str190$Time_to_handle__S_propagation;
    private static SubLList $list191;
    private static SubLString $str192$Propagating_bogus_proof_spec__A_d;
    private static SubLSymbol $EQUAL;
    private static SubLSymbol $CZER_EQUAL;
    private static SubLSymbol $sym195$_PROBLEM_STORE_PRUNE_REPORTS_;
    private static SubLString $str196$__pruned__a_problems____a_____a__;
    private static SubLSymbol $sym197$_;
    private static SubLSymbol $sym198$PROBLEM_MIN_DEPTH;
    private static SubLSymbol $UNINITIALIZED;
    private static SubLString $str200$destroying_in_progress_tactic__a;
    private static SubLList $list201;
    private static SubLList $list202;
    private static SubLSymbol $sym203$_;
    private static SubLSymbol $sym204$PROBLEM_LINK_SUID;
    private static SubLSymbol $sym205$PROBLEM_SUID;
    private static SubLSymbol $sym206$CONJUNCTIVE_REMOVAL_PROOF_P;
    private static SubLSymbol $sym207$PROOF_SUID;
    private static SubLSymbol $sym208$PROBLEM_HAS_AN_IN_PROGRESS_TACTIC_;
    private static SubLSymbol $sym209$SPLIT_LINK_P;
    private static SubLList $list210;
    private static SubLSymbol $DO_HASH_TABLE;
    private static SubLSymbol $sym212$PROBLEM_STORE_P;
    private static SubLSymbol $sym213$SET_SIZE;
    private static SubLSymbol $sym214$PROOF_PRUNABLE_;
    private static SubLString $str215$_a_was_not_a_problem_p_or_problem;
    private static SubLString $str216$__prunables___s__;
    private static SubLString $str217$Unexpected_problem_store_object__;
    private static SubLList $list218;
    private static SubLSymbol $sym219$TACTICALLY_FINISHED_PROBLEM_P;

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 1900L)
    public static SubLObject currently_considered_tactic() {
        SubLThread thread = SubLProcess.currentSubLThread();
        return $currently_considered_tactic$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 2100L)
    public static SubLObject within_tactic_consideration(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        SubLObject tactic = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list0);
        tactic = current.first();
        SubLObject body;
        current = (body = current.rest());
        return listS($sym1$CLET, list(list($sym2$_CURRENTLY_CONSIDERED_TACTIC_, tactic)), append(body, NIL));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 2400L)
    public static SubLObject currently_executing_tactic() {
        SubLThread thread = SubLProcess.currentSubLThread();
        return $currently_executing_tactics$.getDynamicValue(thread).first();
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 2600L)
    public static SubLObject currently_executing_tactics() {
        SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.find_all_if($sym3$TACTIC_P, $currently_executing_tactics$.getDynamicValue(thread), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 2700L)
    public static SubLObject within_tactic_execution(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        SubLObject tactic = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list0);
        tactic = current.first();
        SubLObject body;
        current = (body = current.rest());
        SubLObject start_time = $sym4$START_TIME;
        return list($sym1$CLET, list(list($sym5$_CURRENTLY_EXECUTING_TACTICS_, listS($sym6$CONS, tactic, $list7)), start_time),
                list($sym8$CUNWIND_PROTECT, listS($sym9$PROGN, list($sym10$PWHEN, $list11, listS($sym12$CSETQ, start_time, $list13)), append(body, NIL)), list($sym10$PWHEN, $list11, list($sym14$POSSIBLY_UPDATE_HL_MODULE_TIMES, list($sym15$_, $list16, start_time)))));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 3400L)
    public static SubLObject currently_executing_hl_module() {
        SubLObject tactic = currently_executing_tactic();
        if (NIL != tactic) {
            return inference_datastructures_tactic.tactic_hl_module(tactic);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 3600L)
    public static SubLObject currently_active_problem() {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tactic = currently_executing_tactic();
        if (NIL != tactic) {
            return inference_datastructures_tactic.tactic_problem(tactic);
        }
        return $currently_active_problem$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 4000L)
    public static SubLObject within_problem_consideration(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        SubLObject problem = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list17);
        problem = current.first();
        SubLObject body;
        current = (body = current.rest());
        return listS($sym1$CLET, reader.bq_cons(list($sym18$_CURRENTLY_ACTIVE_PROBLEM_, problem), $list19), append(body, NIL));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 4400L)
    public static SubLObject currently_active_problem_query() {
        SubLObject current_problem = currently_active_problem();
        if (NIL != inference_datastructures_problem.problem_p(current_problem)) {
            return inference_datastructures_problem.problem_query(current_problem);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 4600L)
    public static SubLObject with_problem_store_tactical_evaluation_properties(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        SubLObject store = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list20);
        store = current.first();
        SubLObject body;
        current = (body = current.rest());
        return listS($sym1$CLET, list(list($sym21$_NEGATION_BY_FAILURE_, list($sym22$PROBLEM_STORE_NEGATION_BY_FAILURE_, store))), append(body, NIL));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 4900L)
    public static SubLObject currently_active_problem_store() {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject problem = currently_active_problem();
        if (NIL != problem) {
            return inference_datastructures_problem.problem_store(problem);
        }
        return $currently_active_problem_store$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 5200L)
    public static SubLObject currently_active_problem_store_creation_time() {
        SubLObject problem_store = currently_active_problem_store();
        return (NIL != problem_store) ? inference_datastructures_problem_store.problem_store_creation_time(problem_store) : NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 5600L)
    public static SubLObject determine_new_tactics(SubLObject problem) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_problem.problem_p(problem) : problem;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == inference_datastructures_problem.tactically_unexamined_problem_p(problem)) {
            Errors.error($str24$_a_was_not_an__unexamined_problem, problem);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL != inference_datastructures_problem.problem_tactics(problem)) {
            Errors.error($str25$_a_was__unexamined_but_somehow_go, problem);
        }
        SubLObject _prev_bind_0 = $currently_active_problem$.currentBinding(thread);
        SubLObject _prev_bind_2 = $currently_executing_tactics$.currentBinding(thread);
        try {
            $currently_active_problem$.bind(problem, thread);
            $currently_executing_tactics$.bind(NIL, thread);
            if (NIL != inference_datastructures_problem.single_clause_problem_p(problem)) {
                SubLObject clause = inference_datastructures_problem.problem_sole_clause(problem);
                determine_new_tactics_for_dnf_clause(problem, clause);
            } else {
                SubLObject query = inference_datastructures_problem.problem_query(problem);
                determine_new_tactics_for_disjunction(problem, query);
            }
            note_problem_examined(problem);
            discard_all_impossible_possible_tactics(problem);
            consider_that_problem_could_be_no_good(problem, NIL, $TACTICAL, T);
            SubLObject store = inference_datastructures_problem.problem_store(problem);
            SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
            if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
                SubLObject idx_$1 = idx;
                if (NIL == id_index.id_index_dense_objects_empty_p(idx_$1, $SKIP)) {
                    SubLObject vector_var = id_index.id_index_dense_objects(idx_$1);
                    SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject inference;
                    SubLObject inference_var;
                    SubLObject set_var;
                    SubLObject set_contents_var;
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject strategy;
                    for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                        id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                        inference = Vectors.aref(vector_var, id);
                        if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                            if (NIL != id_index.id_index_tombstone_p(inference)) {
                                inference = $SKIP;
                            }
                            if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                                inference_var = inference;
                                set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                                set_contents_var = set.do_set_internal(set_var);
                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                                        state); state = set_contents.do_set_contents_update_state(state)) {
                                    strategy = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                        consider_that_problem_could_be_no_good(problem, NIL, strategy, T);
                                    }
                                }
                            }
                        }
                    }
                }
                SubLObject idx_$2 = idx;
                if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$2)) {
                    SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$2);
                    SubLObject id2 = NIL;
                    SubLObject inference2 = NIL;
                    Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            inference2 = Hashtables.getEntryValue(cdohash_entry);
                            if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                                SubLObject inference_var2 = inference2;
                                SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                                SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject strategy2;
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2,
                                        state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                        consider_that_problem_could_be_no_good(problem, NIL, strategy2, T);
                                    }
                                }
                            }
                        }
                    } finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
        } finally {
            $currently_executing_tactics$.rebind(_prev_bind_2, thread);
            $currently_active_problem$.rebind(_prev_bind_0, thread);
        }
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 7000L)
    public static SubLObject determine_new_tactics_for_dnf_clause(SubLObject problem, SubLObject dnf_clause) {
        if (NIL != clause_utilities.pos_atomic_clause_p(dnf_clause)) {
            return determine_new_tactics_for_literal(problem, clause_utilities.atomic_clause_asent(dnf_clause), $POS);
        }
        if (NIL != clause_utilities.neg_atomic_clause_p(dnf_clause)) {
            return determine_new_tactics_for_literal(problem, clause_utilities.atomic_clause_asent(dnf_clause), $NEG);
        }
        return determine_new_tactics_for_multiple_literals(problem, dnf_clause);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 7400L)
    public static SubLObject determine_new_tactics_for_disjunction(SubLObject problem, SubLObject query) {
        return inference_worker_union.determine_new_union_tactics(problem, query);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 7600L)
    public static SubLObject determine_new_tactics_for_multiple_literals(SubLObject problem, SubLObject dnf_clause) {
        inference_worker_removal.determine_new_conjunctive_removal_tactics(problem, dnf_clause);
        if (NIL != inference_worker_split.all_literals_connected_by_shared_varsP(dnf_clause)) {
            return determine_new_connected_conjunction_tactics(problem, dnf_clause);
        }
        if (NIL != inference_worker_split.meta_split_tactics_enabledP()) {
            return inference_worker_split.determine_new_meta_split_tactics(problem, dnf_clause);
        }
        return inference_worker_split.determine_new_split_tactics(problem, dnf_clause);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 8100L)
    public static SubLObject determine_new_connected_conjunction_tactics(SubLObject problem, SubLObject dnf_clause) {
        if (NIL == problem_has_a_complete_conjunctive_removal_tacticP(problem)) {
            inference_worker_join_ordered.determine_new_join_ordered_tactics(problem, dnf_clause);
            inference_worker_join.determine_new_join_tactics(problem, dnf_clause);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 8500L)
    public static SubLObject problem_has_a_complete_conjunctive_removal_tacticP(SubLObject problem) {
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, $REMOVAL_CONJUNCTIVE) && NIL != inference_datastructures_problem.do_problem_tactics_completeness_match(tactic, $COMPLETE)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 8700L)
    public static SubLObject determine_new_tactics_for_literal(SubLObject problem, SubLObject contextualized_asent, SubLObject sense) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt = NIL;
        SubLObject asent = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(contextualized_asent, contextualized_asent, $list32);
        mt = contextualized_asent.first();
        SubLObject current = contextualized_asent.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, contextualized_asent, $list32);
        asent = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != hlmt.hlmt_p(mt)) {
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    inference_worker_removal.determine_new_literal_removal_tactics(problem, asent, sense);
                    if (NIL != inference_datastructures_problem_store.problem_store_rewrite_allowedP(inference_datastructures_problem.problem_store(problem))) {
                        inference_worker_rewrite.determine_new_literal_rewrite_tactics(problem, asent, sense, UNPROVIDED);
                    }
                    if (NIL != inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_problem.problem_store(problem))) {
                        inference_worker_transformation.add_tactic_to_determine_new_literal_transformation_tactics(problem, asent, sense, mt);
                    }
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(contextualized_asent, $list32);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 9400L)
    public static SubLObject possibly_compute_strategic_properties_of_problem_tactics(SubLObject problem, SubLObject strategy) {
        assert NIL != inference_datastructures_strategy.strategy_p(strategy) : strategy;
        if (NIL != inference_datastructures_strategy.strategically_unexamined_problem_p(problem, strategy)) {
            strategy_compute_strategic_properties_of_problem_tactics(strategy, problem);
        }
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 9900L)
    public static SubLObject strategy_compute_strategic_properties_of_problem_tactics(SubLObject strategy, SubLObject problem) {
        return compute_strategic_properties_of_problem_tactics(problem, strategy, $NON_DISCARDED);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 10100L)
    public static SubLObject compute_strategic_properties_of_problem_tactics(SubLObject problem, SubLObject strategy, SubLObject status) {
        if (status == UNPROVIDED) {
            status = NIL;
        }
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.do_problem_tactics_status_match(tactic, status)) {
                possibly_compute_strategic_properties_of_tactic(tactic, strategy);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 10400L)
    public static SubLObject possibly_compute_strategic_properties_of_tactic(SubLObject tactic, SubLObject strategy) {
        if (NIL == strategy_chooses_not_to_examine_tacticP(strategy, tactic)) {
            inference_tactician.strategy_note_new_tactic(strategy, tactic);
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 10600L)
    public static SubLObject strategy_chooses_not_to_examine_tacticP(SubLObject strategy, SubLObject tactic) {
        return makeBoolean(NIL == inference_tactician_strategic_uninterestingness.strategy_admits_tactic_wrt_proof_specP(strategy, tactic) || NIL == inference_tactician_strategic_uninterestingness.strategy_allows_use_of_tactic_hl_moduleP(strategy, tactic));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 10900L)
    public static SubLObject default_compute_strategic_properties_of_tactic(SubLObject strategy, SubLObject tactic) {
        if (NIL != inference_worker_split.split_tactic_p(tactic)) {
            SubLObject supporting_problem = inference_worker_split.find_split_tactic_supporting_problem(tactic);
            return inference_worker_split.compute_strategic_properties_of_split_tactic(tactic, supporting_problem, strategy);
        }
        if (NIL != inference_worker_split.meta_split_tactic_p(tactic)) {
            return inference_worker_split.compute_strategic_properties_of_meta_split_tactic(tactic, strategy);
        }
        if (NIL != inference_worker_union.union_tactic_p(tactic)) {
            SubLObject disjunct_index = inference_worker_union.union_tactic_disjunct_index(tactic);
            return inference_worker_union.compute_strategic_properties_of_union_tactic(tactic, disjunct_index, strategy);
        }
        if (NIL != inference_worker_join_ordered.join_ordered_tactic_p(tactic)) {
            return inference_worker_join_ordered.compute_strategic_properties_of_join_ordered_tactic(tactic, strategy);
        }
        if (NIL != inference_worker_join.join_tactic_p(tactic)) {
            return inference_worker_join.compute_strategic_properties_of_join_tactic(tactic, strategy);
        }
        if (NIL != inference_worker_transformation.transformation_tactic_p(tactic)) {
            return inference_worker_transformation.compute_strategic_properties_of_transformation_tactic(tactic, strategy);
        }
        if (NIL != inference_worker_transformation.meta_transformation_tactic_p(tactic)) {
            return inference_worker_transformation.compute_strategic_properties_of_meta_transformation_tactic(tactic, strategy);
        }
        if (NIL != inference_worker_removal.removal_tactic_p(tactic)) {
            return inference_worker_removal.compute_strategic_properties_of_removal_tactic(tactic, strategy);
        }
        if (NIL != inference_worker_removal.meta_removal_tactic_p(tactic)) {
            return inference_worker_removal.compute_strategic_properties_of_meta_removal_tactic(tactic, strategy);
        }
        if (NIL != inference_worker_rewrite.rewrite_tactic_p(tactic)) {
            return inference_worker_rewrite.compute_strategic_properties_of_rewrite_tactic(tactic, strategy);
        }
        if (NIL != inference_worker_removal.conjunctive_removal_tactic_p(tactic)) {
            return inference_worker_removal.compute_strategic_properties_of_conjunctive_removal_tactic(tactic, strategy);
        }
        Errors.error($str35$unexpected_tactic__S, tactic);
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 12700L)
    public static SubLObject execute_tactic(SubLObject tactic) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && tactic.eql(currently_executing_tactic())) {
            Errors.error($str36$Tried_to_recursively_execute__a, tactic);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == inference_datastructures_tactic.tactic_possibleP(tactic)) {
            Errors.error($str37$Tried_to_execute_a_tactic_that_wa, tactic);
        }
        SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if (NIL != last_metric_type && NIL != last_metric) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, ZERO_INTEGER);
        }
        SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind($INFERENCE, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind(inference_datastructures_tactic.tactic_hl_module_name(tactic), thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind(NIL, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
            try {
                SubLObject _prev_bind_0_$3 = $currently_executing_tactics$.currentBinding(thread);
                try {
                    $currently_executing_tactics$.bind(cons(tactic, $currently_executing_tactics$.getDynamicValue(thread)), thread);
                    SubLObject start_time = NIL;
                    try {
                        if (NIL != inference_metrics.any_inference_gathers_hl_module_timesP(UNPROVIDED)) {
                            start_time = inference_datastructures_inference.inference_time_so_far(inference_macros.current_controlling_inference(), NIL);
                        }
                        inference_datastructures_tactic.note_tactic_most_recent_executed(tactic);
                        if (NIL != single_literal_tactic_p(tactic)) {
                            execute_literal_level_tactic(tactic);
                        } else if (NIL != generalized_conjunctive_tactic_p(tactic)) {
                            execute_multiple_literal_tactic(tactic);
                        } else if (NIL != disjunctive_tactic_p(tactic)) {
                            execute_multiple_clause_tactic(tactic);
                        } else {
                            Errors.error($str39$unexpected_tactic__s, tactic);
                        }
                        possibly_note_tactic_finished(tactic);
                    } finally {
                        SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                            SubLObject _values = Values.getValuesAsVector();
                            if (NIL != inference_metrics.any_inference_gathers_hl_module_timesP(UNPROVIDED)) {
                                inference_metrics.possibly_update_hl_module_times(Numbers.subtract(inference_datastructures_inference.inference_time_so_far(inference_macros.current_controlling_inference(), NIL), start_time));
                            }
                            Values.restoreValuesFromVector(_values);
                        } finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                        }
                    }
                } finally {
                    $currently_executing_tactics$.rebind(_prev_bind_0_$3, thread);
                }
            } finally {
                SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values2 = Values.getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics($INFERENCE, inference_datastructures_tactic.tactic_hl_module_name(tactic), NIL, NIL, NIL);
                    Values.restoreValuesFromVector(_values2);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                }
            }
        } finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 13500L)
    public static SubLObject possibly_execute_tactic(SubLObject tactic) {
        if (NIL != inference_datastructures_tactic.tactic_possibleP(tactic)) {
            execute_tactic(tactic);
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 13700L)
    public static SubLObject possibly_note_tactic_finished(SubLObject tactic) {
        if (NIL != inference_datastructures_tactic.tactic_in_progressP(tactic)) {
            return NIL;
        }
        if (NIL != inference_datastructures_tactic.tactic_executedP(tactic)) {
            return NIL;
        }
        note_tactic_finished(tactic);
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 14200L)
    public static SubLObject within_single_literal_tactic_with_asent_and_mt(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list40);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject asent = NIL;
        SubLObject mt = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list40);
        asent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list40);
        mt = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            return listS($sym1$CLET, list(list($sym41$_ASENT_OF_CURRENTLY_EXECUTING_TACTIC_, asent), list($sym42$_MT_OF_CURRENTLY_EXECUTING_TACTIC_, mt)), append(body, NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list40);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 14400L)
    public static SubLObject asent_of_currently_executing_tactic() {
        SubLThread thread = SubLProcess.currentSubLThread();
        return $asent_of_currently_executing_tactic$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 14600L)
    public static SubLObject mt_of_currently_executing_tactic() {
        SubLThread thread = SubLProcess.currentSubLThread();
        return $mt_of_currently_executing_tactic$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 14700L)
    public static SubLObject single_literal_tactic_p(SubLObject tactic) {
        return makeBoolean(NIL != inference_worker_removal.literal_level_removal_tactic_p(tactic) || NIL != inference_worker_removal.literal_level_meta_removal_tactic_p(tactic) || NIL != inference_worker_transformation.literal_level_transformation_tactic_p(tactic)
                || NIL != inference_worker_rewrite.literal_level_rewrite_tactic_p(tactic));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 15000L)
    public static SubLObject execute_literal_level_tactic(SubLObject tactic) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        SubLObject query = inference_datastructures_problem.problem_query(problem);
        thread.resetMultipleValues();
        SubLObject mt = inference_datastructures_problem_query.mt_asent_sense_from_singleton_query(query);
        SubLObject asent = thread.secondMultipleValue();
        SubLObject sense = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject _prev_bind_0 = $asent_of_currently_executing_tactic$.currentBinding(thread);
        SubLObject _prev_bind_2 = $mt_of_currently_executing_tactic$.currentBinding(thread);
        try {
            $asent_of_currently_executing_tactic$.bind(asent, thread);
            $mt_of_currently_executing_tactic$.bind(mt, thread);
            if (NIL != inference_worker_removal.literal_level_removal_tactic_p(tactic)) {
                inference_worker_removal.execute_literal_level_removal_tactic(tactic, mt, asent, sense);
            } else if (NIL != inference_worker_removal.literal_level_meta_removal_tactic_p(tactic)) {
                inference_worker_removal.execute_literal_level_meta_removal_tactic(tactic, mt, asent, sense);
            } else if (NIL != inference_worker_transformation.literal_level_transformation_tactic_p(tactic)) {
                inference_worker_transformation.execute_literal_level_transformation_tactic(tactic, mt, asent, sense);
            } else if (NIL != inference_worker_rewrite.literal_level_rewrite_tactic_p(tactic)) {
                inference_worker_rewrite.execute_literal_level_rewrite_tactic(tactic, mt, asent);
            } else {
                Errors.error($str43$Got_a_literal_level_tactic__s_tha, tactic);
            }
        } finally {
            $mt_of_currently_executing_tactic$.rebind(_prev_bind_2, thread);
            $asent_of_currently_executing_tactic$.rebind(_prev_bind_0, thread);
        }
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 15900L)
    public static SubLObject literal_level_tactic_p(SubLObject tactic) {
        return makeBoolean(NIL == conjunctive_tactic_p(tactic) && NIL == disjunctive_tactic_p(tactic));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 16100L)
    public static SubLObject execute_multiple_clause_tactic(SubLObject tactic) {
        if (NIL != inference_worker_union.union_tactic_p(tactic)) {
            return inference_worker_union.execute_union_tactic(tactic);
        }
        Errors.error($str44$Unexpected_multiple_clause_tactic, inference_datastructures_tactic.tactic_hl_module(tactic));
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 16300L)
    public static SubLObject execute_multiple_literal_tactic(SubLObject tactic) {
        if (NIL != structural_tactic_p(tactic)) {
            return execute_structural_multiple_literal_tactic(tactic);
        }
        if (NIL != meta_structural_tactic_p(tactic)) {
            return execute_meta_structural_multiple_literal_tactic(tactic);
        }
        if (NIL != inference_worker_removal.conjunctive_removal_tactic_p(tactic)) {
            return inference_worker_removal.execute_conjunctive_removal_tactic(tactic);
        }
        Errors.error($str45$Unexpected_multiple_literal_tacti, inference_datastructures_tactic.tactic_hl_module(tactic));
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 16800L)
    public static SubLObject execute_structural_multiple_literal_tactic(SubLObject tactic) {
        if (NIL != inference_worker_split.split_tactic_p(tactic)) {
            return inference_worker_split.execute_split_tactic(tactic);
        }
        if (NIL != inference_worker_join_ordered.join_ordered_tactic_p(tactic)) {
            return inference_worker_join_ordered.execute_join_ordered_tactic(tactic);
        }
        if (NIL != inference_worker_join.join_tactic_p(tactic)) {
            return inference_worker_join.execute_join_tactic(tactic);
        }
        Errors.error($str46$Unexpected_structural_multiple_li, inference_datastructures_tactic.tactic_hl_module(tactic));
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 17200L)
    public static SubLObject execute_meta_structural_multiple_literal_tactic(SubLObject tactic) {
        if (NIL != inference_worker_split.meta_split_tactic_p(tactic)) {
            return inference_datastructures_tactic.tactic_in_progress_next(tactic);
        }
        Errors.error($str47$Unexpected_meta_structural_multip, inference_datastructures_tactic.tactic_hl_module(tactic));
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 17600L)
    public static SubLObject connected_conjunction_link_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_worker_join_ordered.join_ordered_link_p(v_object) || NIL != inference_worker_join.join_link_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 17700L)
    public static SubLObject connected_conjunction_tactic_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_worker_join_ordered.join_ordered_tactic_p(v_object) || NIL != inference_worker_join.join_tactic_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 17800L)
    public static SubLObject connected_conjunction_link_tactic(SubLObject link) {
        if (NIL != inference_worker_join_ordered.join_ordered_link_p(link)) {
            return inference_worker_join_ordered.join_ordered_link_tactic(link);
        }
        if (NIL != inference_worker_join.join_link_p(link)) {
            return inference_worker_join.join_link_tactic(link);
        }
        return Errors.error($str48$unexpected_connected_conjunction_, link);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 18100L)
    public static SubLObject connected_conjunction_tactic_link(SubLObject tactic) {
        if (NIL != inference_worker_join_ordered.join_ordered_tactic_p(tactic)) {
            return inference_worker_join_ordered.join_ordered_tactic_link(tactic);
        }
        if (NIL != inference_worker_join.join_tactic_p(tactic)) {
            return inference_worker_join.join_tactic_link(tactic);
        }
        return Errors.error($str49$unexpected_connected_conjunction_, tactic);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 18500L)
    public static SubLObject conjunctive_link_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_worker_split.split_link_p(v_object) || NIL != connected_conjunction_link_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 18600L)
    public static SubLObject logical_conjunctive_tactic_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_worker_split.split_tactic_p(v_object) || NIL != connected_conjunction_tactic_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 18700L)
    public static SubLObject conjunctive_tactic_p(SubLObject v_object) {
        return makeBoolean(NIL != logical_conjunctive_tactic_p(v_object) || NIL != inference_worker_removal.conjunctive_removal_tactic_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 18900L)
    public static SubLObject meta_conjunctive_tactic_p(SubLObject v_object) {
        return inference_worker_split.meta_split_tactic_p(v_object);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 19000L)
    public static SubLObject generalized_conjunctive_tactic_p(SubLObject v_object) {
        return makeBoolean(NIL != conjunctive_tactic_p(v_object) || NIL != meta_conjunctive_tactic_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 19100L)
    public static SubLObject generalized_logical_conjunctive_tactic_p(SubLObject v_object) {
        return makeBoolean(NIL != logical_conjunctive_tactic_p(v_object) || NIL != meta_conjunctive_tactic_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 19700L)
    public static SubLObject connected_conjunction_tactic_literals_score(SubLObject conjunction_tactic) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == inference_worker_join_ordered.join_ordered_tactic_p(conjunction_tactic)) {
            return ONE_INTEGER;
        }
        SubLObject literal_count = clause_utilities.clause_literal_count(inference_worker_join_ordered.join_ordered_tactic_focal_supporting_problem_spec(conjunction_tactic));
        if (literal_count.numG(ONE_INTEGER)) {
            return literal_count;
        }
        if (NIL == $consider_variable_count_of_focal_problems_for_tactic_literals_score_method$.getDynamicValue(thread)) {
            return ONE_INTEGER;
        }
        SubLObject focal_problem = inference_worker_join_ordered.join_ordered_tactic_focal_problem(conjunction_tactic);
        SubLObject variable_count = Sequences.length(inference_datastructures_problem.problem_variables(focal_problem));
        SubLObject pcase_var = $consider_variable_count_of_focal_problems_for_tactic_literals_score_method$.getDynamicValue(thread);
        if (pcase_var.eql($EXPONENTIAL)) {
            return Numbers.expt(TWO_INTEGER, variable_count);
        }
        if (pcase_var.eql($SQUARE)) {
            return Numbers.add(ONE_INTEGER, Numbers.multiply(variable_count, variable_count));
        }
        if (pcase_var.eql($DOUBLE)) {
            return Numbers.add(variable_count, variable_count);
        }
        return variable_count;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 21000L)
    public static SubLObject disjunctive_link_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_worker_union.union_link_p(v_object) || NIL != inference_worker_union.disjunctive_assumption_link_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 21100L)
    public static SubLObject logical_disjunctive_tactic_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_worker_union.union_tactic_p(v_object) || NIL != inference_worker_union.disjunctive_assumption_tactic_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 21300L)
    public static SubLObject disjunctive_tactic_p(SubLObject v_object) {
        return logical_disjunctive_tactic_p(v_object);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 21400L)
    public static SubLObject disjunctive_link_tactic(SubLObject link) {
        if (NIL != inference_worker_union.union_link_p(link)) {
            return inference_worker_union.union_link_tactic(link);
        }
        return Errors.error($str53$unexpected_disjunctive_link__s, link);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 21600L)
    public static SubLObject logical_link_p(SubLObject v_object) {
        return makeBoolean(NIL != conjunctive_link_p(v_object) || NIL != disjunctive_link_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 21800L)
    public static SubLObject logical_tactic_p(SubLObject v_object) {
        return makeBoolean(NIL != logical_conjunctive_tactic_p(v_object) || NIL != logical_disjunctive_tactic_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 21900L)
    public static SubLObject logical_link_with_unique_tactic_p(SubLObject link) {
        return makeBoolean(NIL != connected_conjunction_link_p(link) || NIL != inference_worker_union.union_link_p(link));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 22000L)
    public static SubLObject logical_tactic_with_unique_lookahead_problem_p(SubLObject tactic) {
        return makeBoolean(NIL != logical_tactic_p(tactic) && NIL == inference_worker_join.join_tactic_p(tactic));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 22200L)
    public static SubLObject logical_link_unique_tactic(SubLObject link) {
        if (NIL != inference_worker_join_ordered.join_ordered_link_p(link)) {
            return inference_worker_join_ordered.join_ordered_link_tactic(link);
        }
        if (NIL != inference_worker_join.join_link_p(link)) {
            return inference_worker_join.join_link_tactic(link);
        }
        if (NIL != inference_worker_union.union_link_p(link)) {
            return inference_worker_union.union_link_tactic(link);
        }
        return Errors.error($str54$_s_was_not_a_logical_link_with_un, link);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 22500L)
    public static SubLObject logical_tactic_link(SubLObject logical_tactic) {
        SubLObject pcase_var = inference_datastructures_tactic.tactic_hl_module_name(logical_tactic);
        if (pcase_var.eql($SPLIT)) {
            return inference_worker_split.split_tactic_link(logical_tactic);
        }
        if (pcase_var.eql($JOIN_ORDERED)) {
            return inference_worker_join_ordered.join_ordered_tactic_link(logical_tactic);
        }
        if (pcase_var.eql($UNION)) {
            return inference_worker_union.union_tactic_link(logical_tactic);
        }
        if (pcase_var.eql($JOIN)) {
            return inference_worker_join.join_tactic_link(logical_tactic);
        }
        return Errors.error($str59$Unexpected_logical_tactic_module_, inference_datastructures_tactic.tactic_hl_module(logical_tactic));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 23100L)
    public static SubLObject logical_tactic_lookahead_problem(SubLObject logical_tactic) {
        SubLObject pcase_var = inference_datastructures_tactic.tactic_hl_module_name(logical_tactic);
        if (pcase_var.eql($SPLIT)) {
            return inference_worker_split.split_tactic_lookahead_problem(logical_tactic);
        }
        if (pcase_var.eql($JOIN_ORDERED)) {
            return inference_worker_join_ordered.join_ordered_tactic_lookahead_problem(logical_tactic);
        }
        if (pcase_var.eql($UNION)) {
            return inference_worker_union.union_tactic_lookahead_problem(logical_tactic);
        }
        if (pcase_var.eql($JOIN)) {
            return Errors.error($str60$Join_tactics_like__S_do_not_have_, logical_tactic);
        }
        return Errors.error($str59$Unexpected_logical_tactic_module_, inference_datastructures_tactic.tactic_hl_module(logical_tactic));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 23700L)
    public static SubLObject logical_proof_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_datastructures_proof.proof_p(v_object) && NIL != logical_link_p(inference_datastructures_proof.proof_link(v_object)));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 23800L)
    public static SubLObject structural_link_p(SubLObject v_object) {
        return makeBoolean(NIL != logical_link_p(v_object) || NIL != inference_worker_restriction.restriction_link_p(v_object) || NIL != inference_worker_answer.answer_link_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 24000L)
    public static SubLObject structural_tactic_p(SubLObject tactic) {
        return logical_tactic_p(tactic);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 24200L)
    public static SubLObject meta_structural_tactic_p(SubLObject tactic) {
        return meta_conjunctive_tactic_p(tactic);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 24300L)
    public static SubLObject generalized_structural_tactic_p(SubLObject tactic) {
        return makeBoolean(NIL != structural_tactic_p(tactic) || NIL != meta_structural_tactic_p(tactic));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 24400L)
    public static SubLObject structural_tactic_lookahead_problem(SubLObject structural_tactic) {
        return logical_tactic_lookahead_problem(structural_tactic);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 24600L)
    public static SubLObject structural_proof_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_datastructures_proof.proof_p(v_object) && NIL != structural_link_p(inference_datastructures_proof.proof_link(v_object)));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 24700L)
    public static SubLObject structural_proof_type(SubLObject structural_proof) {
        assert NIL != structural_proof_p(structural_proof) : structural_proof;
        return inference_datastructures_problem_link.problem_link_type(inference_datastructures_proof.proof_link(structural_proof));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 24900L)
    public static SubLObject content_link_p(SubLObject v_object) {
        return makeBoolean(
                NIL != inference_worker_removal.removal_link_p(v_object) || NIL != inference_worker_transformation.transformation_link_p(v_object) || NIL != inference_worker_residual_transformation.residual_transformation_link_p(v_object) || NIL != inference_worker_rewrite.rewrite_link_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 25100L)
    public static SubLObject content_tactic_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_worker_removal.generalized_removal_tactic_p(v_object) || NIL != inference_worker_transformation.transformation_tactic_p(v_object) || NIL != inference_worker_rewrite.rewrite_tactic_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 25300L)
    public static SubLObject content_proof_p(SubLObject proof) {
        return makeBoolean(NIL != inference_datastructures_proof.proof_p(proof) && NIL != content_link_p(inference_datastructures_proof.proof_link(proof)));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 25400L)
    public static SubLObject content_link_supports(SubLObject content_link) {
        if (NIL != inference_worker_removal.removal_link_p(content_link)) {
            return inference_worker_removal.removal_link_supports(content_link);
        }
        if (NIL != inference_worker_transformation.transformation_link_p(content_link)) {
            return inference_worker_transformation.transformation_link_supports(content_link);
        }
        if (NIL != inference_worker_residual_transformation.residual_transformation_link_p(content_link)) {
            return inference_worker_transformation.transformation_link_supports(inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(content_link));
        }
        if (NIL != inference_worker_rewrite.rewrite_link_p(content_link)) {
            return inference_worker_rewrite.rewrite_link_supports(content_link);
        }
        Errors.error($str62$_a_is_not_a_CONTENT_LINK_P, content_link);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 26000L)
    public static SubLObject content_link_tactic(SubLObject content_link) {
        if (NIL != inference_worker_removal.removal_link_p(content_link)) {
            return inference_worker_removal.removal_link_tactic(content_link);
        }
        if (NIL != inference_worker_transformation.transformation_link_p(content_link)) {
            return inference_worker_transformation.transformation_link_tactic(content_link);
        }
        if (NIL != inference_worker_residual_transformation.residual_transformation_link_p(content_link)) {
            return inference_worker_transformation.transformation_link_tactic(inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(content_link));
        }
        if (NIL != inference_worker_rewrite.rewrite_link_p(content_link)) {
            return inference_worker_rewrite.rewrite_link_tactic(content_link);
        }
        Errors.error($str62$_a_is_not_a_CONTENT_LINK_P, content_link);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 26600L)
    public static SubLObject content_link_hl_module(SubLObject content_link) {
        if (NIL != inference_worker_removal.removal_link_p(content_link)) {
            return inference_worker_removal.removal_link_hl_module(content_link);
        }
        if (NIL != inference_worker_transformation.transformation_link_p(content_link)) {
            return inference_worker_transformation.transformation_link_hl_module(content_link);
        }
        if (NIL != inference_worker_residual_transformation.residual_transformation_link_p(content_link)) {
            return inference_worker_transformation.transformation_link_hl_module(inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(content_link));
        }
        if (NIL != inference_worker_rewrite.rewrite_link_p(content_link)) {
            return inference_worker_rewrite.rewrite_link_hl_module(content_link);
        }
        Errors.error($str62$_a_is_not_a_CONTENT_LINK_P, content_link);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 27200L)
    public static SubLObject content_proof_hl_module(SubLObject proof) {
        SubLObject link = inference_datastructures_proof.proof_link(proof);
        SubLObject hl_module = content_link_hl_module(link);
        return hl_module;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 27400L)
    public static SubLObject content_tactic_actual_productivity(SubLObject content_tactic) {
        assert NIL != content_tactic_p(content_tactic) : content_tactic;
        if (NIL != inference_datastructures_tactic.tactic_discardedP(content_tactic)) {
            return ZERO_INTEGER;
        }
        if (NIL != inference_worker_removal.removal_tactic_p(content_tactic)) {
            return removal_tactic_actual_productivity(content_tactic);
        }
        if (NIL != inference_worker_removal.conjunctive_removal_tactic_p(content_tactic)) {
            return conjunctive_removal_tactic_actual_productivity(content_tactic);
        }
        if (NIL != inference_worker_transformation.transformation_tactic_p(content_tactic)) {
            return transformation_tactic_actual_productivity(content_tactic);
        }
        if (NIL != inference_worker_rewrite.rewrite_tactic_p(content_tactic)) {
            return rewrite_tactic_actual_productivity(content_tactic);
        }
        if (NIL != inference_worker_removal.meta_removal_tactic_p(content_tactic)) {
            return meta_removal_tactic_actual_productivity(content_tactic);
        }
        return Errors.error($str64$Unexpected_content_tactic__S, content_tactic);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 28400L)
    public static SubLObject removal_tactic_actual_productivity(SubLObject removal_tactic) {
        SubLObject problem = inference_datastructures_tactic.tactic_problem(removal_tactic);
        if (NIL != inference_datastructures_problem.single_literal_problem_p(problem)) {
            return single_literal_removal_tactic_actual_productivity(removal_tactic);
        }
        return Errors.error($str65$Unexpected_removal_tactic__S, removal_tactic);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 28700L)
    public static SubLObject single_literal_removal_tactic_actual_productivity(SubLObject removal_tactic) {
        SubLObject problem = inference_datastructures_tactic.tactic_problem(removal_tactic);
        SubLObject store = inference_datastructures_tactic.tactic_store(removal_tactic);
        SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(removal_tactic);
        SubLObject children = ZERO_INTEGER;
        if (NIL != inference_datastructures_problem.closed_problem_p(problem)) {
            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject removal_link;
            SubLObject candidate_hl_module;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                    state); state = set_contents.do_set_contents_update_state(state)) {
                removal_link = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, removal_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(removal_link, $REMOVAL)) {
                    candidate_hl_module = inference_worker_removal.removal_link_hl_module(removal_link);
                    if (candidate_hl_module.eql(hl_module)) {
                        children = Numbers.add(children, ONE_INTEGER);
                    }
                }
            }
        } else if (NIL != inference_datastructures_problem_store.problem_store_add_restriction_layer_of_indirectionP(store)) {
            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject restriction_link;
            SubLObject supporting_problem;
            SubLObject set_contents_var_$6;
            SubLObject basis_object_$7;
            SubLObject state_$8;
            SubLObject removal_link2;
            SubLObject candidate_hl_module2;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                    state); state = set_contents.do_set_contents_update_state(state)) {
                restriction_link = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, restriction_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $RESTRICTION)) {
                    supporting_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(restriction_link);
                    set_contents_var_$6 = inference_datastructures_problem.problem_argument_links(supporting_problem);
                    for (basis_object_$7 = set_contents.do_set_contents_basis_object(set_contents_var_$6), state_$8 = NIL, state_$8 = set_contents.do_set_contents_initial_state(basis_object_$7, set_contents_var_$6); NIL == set_contents.do_set_contents_doneP(basis_object_$7,
                            state_$8); state_$8 = set_contents.do_set_contents_update_state(state_$8)) {
                        removal_link2 = set_contents.do_set_contents_next(basis_object_$7, state_$8);
                        if (NIL != set_contents.do_set_contents_element_validP(state_$8, removal_link2) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(removal_link2, $REMOVAL)) {
                            candidate_hl_module2 = inference_worker_removal.removal_link_hl_module(removal_link2);
                            if (candidate_hl_module2.eql(hl_module)) {
                                children = Numbers.add(children, ONE_INTEGER);
                            }
                        }
                    }
                }
            }
        } else {
            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject removal_link;
            SubLObject candidate_hl_module;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                    state); state = set_contents.do_set_contents_update_state(state)) {
                removal_link = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, removal_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(removal_link, $REMOVAL)) {
                    candidate_hl_module = inference_worker_removal.removal_link_hl_module(removal_link);
                    if (candidate_hl_module.eql(hl_module)) {
                        children = Numbers.add(children, ONE_INTEGER);
                    }
                }
            }
        }
        return inference_datastructures_enumerated_types.productivity_for_number_of_children(children);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 30200L)
    public static SubLObject conjunctive_removal_tactic_actual_productivity(SubLObject conjunctive_removal_tactic) {
        assert NIL != inference_worker_removal.conjunctive_removal_tactic_p(conjunctive_removal_tactic) : conjunctive_removal_tactic;
        SubLObject problem = inference_datastructures_tactic.tactic_problem(conjunctive_removal_tactic);
        SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(conjunctive_removal_tactic);
        SubLObject children = ZERO_INTEGER;
        if (NIL != inference_datastructures_problem.closed_problem_p(problem)) {
            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject cr_link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                    state); state = set_contents.do_set_contents_update_state(state)) {
                cr_link = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, cr_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(cr_link, $REMOVAL_CONJUNCTIVE) && hl_module.eql(inference_worker_removal.removal_link_hl_module(cr_link))) {
                    children = Numbers.add(children, ONE_INTEGER);
                }
            }
        } else {
            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject restriction_link;
            SubLObject restricted_problem;
            SubLObject set_contents_var_$9;
            SubLObject basis_object_$10;
            SubLObject state_$11;
            SubLObject cr_link2;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                    state); state = set_contents.do_set_contents_update_state(state)) {
                restriction_link = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, restriction_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $RESTRICTION)) {
                    restricted_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(restriction_link);
                    set_contents_var_$9 = inference_datastructures_problem.problem_argument_links(restricted_problem);
                    for (basis_object_$10 = set_contents.do_set_contents_basis_object(set_contents_var_$9), state_$11 = NIL, state_$11 = set_contents.do_set_contents_initial_state(basis_object_$10, set_contents_var_$9); NIL == set_contents.do_set_contents_doneP(basis_object_$10,
                            state_$11); state_$11 = set_contents.do_set_contents_update_state(state_$11)) {
                        cr_link2 = set_contents.do_set_contents_next(basis_object_$10, state_$11);
                        if (NIL != set_contents.do_set_contents_element_validP(state_$11, cr_link2) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(cr_link2, $REMOVAL_CONJUNCTIVE) && hl_module.eql(inference_worker_removal.removal_link_hl_module(cr_link2))) {
                            children = Numbers.add(children, ONE_INTEGER);
                        }
                    }
                }
            }
        }
        return inference_datastructures_enumerated_types.productivity_for_number_of_children(children);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 31300L)
    public static SubLObject transformation_tactic_actual_productivity(SubLObject transformation_tactic) {
        assert NIL != inference_worker_transformation.transformation_tactic_p(transformation_tactic) : transformation_tactic;
        SubLObject problem = inference_datastructures_tactic.tactic_problem(transformation_tactic);
        SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(transformation_tactic);
        SubLObject rule = inference_worker_transformation.transformation_tactic_rule(transformation_tactic);
        SubLObject children = ZERO_INTEGER;
        SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject transformation_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            transformation_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, transformation_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(transformation_link, $TRANSFORMATION)
                    && hl_module.eql(inference_worker_transformation.transformation_link_hl_module(transformation_link)) && rule.eql(inference_worker_transformation.transformation_link_rule_assertion(transformation_link))) {
                children = Numbers.add(children, ONE_INTEGER);
            }
        }
        return inference_datastructures_enumerated_types.productivity_for_number_of_children(children);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 32000L)
    public static SubLObject rewrite_tactic_actual_productivity(SubLObject rewrite_tactic) {
        assert NIL != inference_worker_rewrite.rewrite_tactic_p(rewrite_tactic) : rewrite_tactic;
        SubLObject problem = inference_datastructures_tactic.tactic_problem(rewrite_tactic);
        SubLObject children = ZERO_INTEGER;
        SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject rewrite_link;
        SubLObject candidate_tactic;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            rewrite_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, rewrite_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(rewrite_link, $REWRITE)) {
                candidate_tactic = inference_worker_rewrite.rewrite_link_tactic(rewrite_link);
                if (candidate_tactic.eql(rewrite_tactic)) {
                    children = Numbers.add(children, ONE_INTEGER);
                }
            }
        }
        return inference_datastructures_enumerated_types.productivity_for_number_of_children(children);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 32500L)
    public static SubLObject meta_removal_tactic_actual_productivity(SubLObject meta_removal_tactic) {
        assert NIL != inference_worker_removal.meta_removal_tactic_p(meta_removal_tactic) : meta_removal_tactic;
        SubLObject problem = inference_datastructures_tactic.tactic_problem(meta_removal_tactic);
        return inference_datastructures_problem.problem_total_actual_removal_productivity(problem);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 32700L)
    public static SubLObject simple_problem_estimated_total_global_productivity(SubLObject problem, SubLObject strategic_context) {
        assert NIL != strategic_context_p(strategic_context) : strategic_context;
        determine_strategic_status_wrt(problem, strategic_context);
        SubLObject already_proven_productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(inference_datastructures_problem.problem_proven_proof_count(problem));
        SubLObject to_be_proven_productivity = estimated_global_productivity_of_problem_possible_tactics(problem, strategic_context);
        SubLObject total_productivity = inference_datastructures_enumerated_types.productivity_X(already_proven_productivity, to_be_proven_productivity);
        return total_productivity;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 33400L)
    public static SubLObject estimated_global_productivity_of_problem_possible_tactics(SubLObject problem, SubLObject strategic_context) {
        SubLObject removal_completeness = problem_generalized_removal_completeness(problem, strategic_context);
        SubLObject structural_preference_level = problem_structural_preference_level(problem, strategic_context);
        SubLObject estimated_removal_productivity = estimated_generalized_removal_productivity_of_problem_possible_tactics_with_completeness(problem, removal_completeness, strategic_context);
        SubLObject estimated_global_structural_productivity = estimated_global_structural_productivity_of_problem_possible_tactics_with_preference_level(problem, structural_preference_level, strategic_context);
        if ($COMPLETE != removal_completeness && $PREFERRED != structural_preference_level) {
            return inference_datastructures_enumerated_types.productivity_X(estimated_removal_productivity, estimated_global_structural_productivity);
        }
        if ($COMPLETE != removal_completeness && $PREFERRED == structural_preference_level) {
            return estimated_global_structural_productivity;
        }
        if ($COMPLETE == removal_completeness && $PREFERRED != structural_preference_level) {
            return estimated_removal_productivity;
        }
        if ($COMPLETE != removal_completeness || $PREFERRED != structural_preference_level) {
            return NIL;
        }
        if (NIL != inference_datastructures_enumerated_types.productivity_L(estimated_removal_productivity, estimated_global_structural_productivity)) {
            return estimated_removal_productivity;
        }
        return estimated_global_structural_productivity;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 35200L)
    public static SubLObject estimated_generalized_removal_productivity_of_problem_possible_tactics_with_completeness(SubLObject problem, SubLObject completeness, SubLObject strategic_context) {
        SubLObject total_estimated_removal_productivity = ZERO_INTEGER;
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, $GENERALIZED_REMOVAL) && NIL != inference_datastructures_problem.do_problem_tactics_status_match(tactic, $POSSIBLE)
                    && NIL != inference_datastructures_problem.do_problem_tactics_completeness_match(tactic, completeness)
                    && (NIL == inference_datastructures_strategy.strategy_p(strategic_context) || NIL == inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_ignore_tacticP(strategic_context, tactic))) {
                total_estimated_removal_productivity = inference_datastructures_enumerated_types.productivity_X(total_estimated_removal_productivity, inference_datastructures_tactic.tactic_productivity(tactic));
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return total_estimated_removal_productivity;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 35800L)
    public static SubLObject estimated_global_structural_productivity_of_problem_possible_tactics_with_preference_level(SubLObject problem, SubLObject preference_level, SubLObject strategic_context) {
        if (preference_level.eql($PREFERRED)) {
            return estimated_global_structural_productivity_of_problem_possible_preferred_tactics(problem, strategic_context);
        }
        if (preference_level.eql($DISPREFERRED)) {
            return estimated_global_structural_productivity_of_problem_possible_dispreferred_tactics(problem, strategic_context);
        }
        if (preference_level.eql($GROSSLY_DISPREFERRED)) {
            return estimated_global_structural_productivity_of_problem_possible_grossly_dispreferred_tactics(problem, strategic_context);
        }
        if (preference_level.eql($DISALLOWED) || preference_level.eql($DOOMED)) {
            return ZERO_INTEGER;
        }
        Errors.error($str82$Unexpected_preference_level__s, preference_level);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 36600L)
    public static SubLObject estimated_global_structural_productivity_of_problem_possible_preferred_tactics(SubLObject problem, SubLObject strategic_context) {
        if (NIL != problem_doomed_due_to_lookahead_removal_completenessP(problem, strategic_context)) {
            return ZERO_INTEGER;
        }
        SubLObject total_global_structural_productivity = ZERO_INTEGER;
        SubLObject tactic = inference_tactician.select_best_tactic_for_problem(problem, strategic_context, $POSSIBLE, $COMPLETE, NIL, $CONNECTED_CONJUNCTION);
        if (NIL != tactic) {
            total_global_structural_productivity = inference_datastructures_enumerated_types.productivity_X(total_global_structural_productivity, inference_datastructures_strategy.tactic_strategic_productivity(tactic, strategic_context));
        }
        tactic = inference_tactician.select_best_tactic_for_problem(problem, strategic_context, $POSSIBLE, $COMPLETE, NIL, $SPLIT);
        if (NIL != tactic) {
            total_global_structural_productivity = inference_datastructures_enumerated_types.productivity_X(total_global_structural_productivity, inference_datastructures_strategy.tactic_strategic_productivity(tactic, strategic_context));
        }
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic2 = NIL;
        tactic2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic2, $STRUCTURAL) && NIL != inference_datastructures_problem.do_problem_tactics_status_match(tactic2, $POSSIBLE)
                    && NIL != inference_datastructures_problem.do_problem_tactics_preference_level_match(tactic2, $PREFERRED) && NIL == conjunctive_tactic_p(tactic2)) {
                total_global_structural_productivity = inference_datastructures_enumerated_types.productivity_X(total_global_structural_productivity, inference_datastructures_strategy.tactic_strategic_productivity(tactic2, strategic_context));
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic2 = cdolist_list_var.first();
        }
        return total_global_structural_productivity;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 38300L)
    public static SubLObject estimated_global_structural_productivity_of_problem_possible_dispreferred_tactics(SubLObject problem, SubLObject strategic_context) {
        return estimated_global_structural_productivity_of_problem_possible_non_preferred_tactics(problem, strategic_context, $DISPREFERRED);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 38600L)
    public static SubLObject estimated_global_structural_productivity_of_problem_possible_grossly_dispreferred_tactics(SubLObject problem, SubLObject strategic_context) {
        return estimated_global_structural_productivity_of_problem_possible_non_preferred_tactics(problem, strategic_context, $GROSSLY_DISPREFERRED);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 38800L)
    public static SubLObject estimated_global_structural_productivity_of_problem_possible_non_preferred_tactics(SubLObject problem, SubLObject strategic_context, SubLObject preference_level) {
        if (NIL != problem_doomed_due_to_lookahead_removal_completenessP(problem, strategic_context)) {
            return ZERO_INTEGER;
        }
        SubLObject total_non_preferred_structural_productivity = ZERO_INTEGER;
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, $STRUCTURAL) && NIL != inference_datastructures_problem.do_problem_tactics_status_match(tactic, $POSSIBLE)
                    && NIL != inference_datastructures_problem.do_problem_tactics_preference_level_match(tactic, preference_level)) {
                total_non_preferred_structural_productivity = inference_datastructures_enumerated_types.productivity_X(total_non_preferred_structural_productivity, inference_datastructures_strategy.tactic_strategic_productivity(tactic, strategic_context));
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return total_non_preferred_structural_productivity;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 39800L)
    public static SubLObject problem_doomed_due_to_lookahead_removal_completenessP(SubLObject problem, SubLObject strategic_context) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject logical_tactic = NIL;
        logical_tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(logical_tactic, $LOGICAL) && NIL != inference_datastructures_problem.do_problem_tactics_status_match(logical_tactic, $NON_DISCARDED)) {
                if (NIL != inference_worker_join.join_tactic_p(logical_tactic)) {
                    thread.resetMultipleValues();
                    SubLObject first_lookahead_problem = inference_worker_join.join_tactic_lookahead_problems(logical_tactic);
                    SubLObject second_lookahead_problem = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != problem_doomed_due_to_removal_completenessP(first_lookahead_problem, strategic_context) || NIL != problem_doomed_due_to_removal_completenessP(second_lookahead_problem, strategic_context)) {
                        return T;
                    }
                } else {
                    SubLObject lookahead_problem = logical_tactic_lookahead_problem(logical_tactic);
                    if (NIL != problem_doomed_due_to_removal_completenessP(lookahead_problem, strategic_context)) {
                        return T;
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            logical_tactic = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 40900L)
    public static SubLObject problem_doomed_due_to_removal_completenessP(SubLObject problem, SubLObject strategic_context) {
        return makeBoolean(NIL == good_problem_p(problem, strategic_context) && NIL != inference_tactician_strategic_uninterestingness.problem_has_executed_a_complete_tacticP(problem, strategic_context, $GENERALIZED_REMOVAL));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 41200L)
    public static SubLObject problem_structural_preference_level(SubLObject problem, SubLObject strategic_context) {
        return problem_preference_level_int(problem, $STRUCTURAL, strategic_context);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 41500L)
    public static SubLObject logical_link_generalized_removal_completeness(SubLObject logical_link, SubLObject strategic_context) {
        SubLObject tactic = logical_link_unique_tactic(logical_link);
        return logical_tactic_generalized_removal_completeness(tactic, strategic_context);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 41700L)
    public static SubLObject logical_tactic_generalized_removal_completeness(SubLObject logical_tactic, SubLObject strategic_context) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != inference_worker_join.join_tactic_p(logical_tactic)) {
            thread.resetMultipleValues();
            SubLObject first_problem = inference_worker_join.join_tactic_lookahead_problems(logical_tactic);
            SubLObject second_problem = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject first_completeness = problem_generalized_removal_completeness(first_problem, strategic_context);
            SubLObject second_completeness = problem_generalized_removal_completeness(second_problem, strategic_context);
            return inference_datastructures_enumerated_types.min2_completeness(first_completeness, second_completeness);
        }
        return problem_generalized_removal_completeness(logical_tactic_lookahead_problem(logical_tactic), strategic_context);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 42400L)
    public static SubLObject problem_generalized_removal_completeness(SubLObject problem, SubLObject strategic_context) {
        assert NIL != strategic_context_p(strategic_context) : strategic_context;
        determine_strategic_status_wrt(problem, strategic_context);
        SubLObject max_completeness = $IMPOSSIBLE;
        SubLObject max_possible_completeness_foundP;
        SubLObject rest;
        SubLObject tactic;
        SubLObject tactic_completeness;
        for (max_possible_completeness_foundP = NIL, rest = NIL, rest = inference_datastructures_problem.problem_tactics(problem); NIL == max_possible_completeness_foundP && NIL != rest; rest = rest.rest()) {
            tactic = rest.first();
            if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, $GENERALIZED_REMOVAL)
                    && (NIL == inference_datastructures_strategy.strategy_p(strategic_context) || NIL == inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_ignore_tacticP(strategic_context, tactic))) {
                tactic_completeness = inference_datastructures_strategy.tactic_strategic_completeness(tactic, strategic_context);
                if (NIL != inference_datastructures_enumerated_types.completeness_G(tactic_completeness, max_completeness)) {
                    max_completeness = tactic_completeness;
                    if (max_completeness == $COMPLETE) {
                        max_possible_completeness_foundP = T;
                    }
                }
            }
        }
        if ($COMPLETE != max_completeness && NIL != strategic_context && NIL != inference_tactician_strategic_uninterestingness.problem_has_executed_a_complete_removal_tacticP(problem, strategic_context)) {
            max_completeness = $COMPLETE;
        }
        return max_completeness;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 43700L)
    public static SubLObject problem_preference_level_int(SubLObject problem, SubLObject type, SubLObject strategic_context) {
        assert NIL != strategic_context_p(strategic_context) : strategic_context;
        determine_strategic_status_wrt(problem, strategic_context);
        SubLObject max_preference_level = $DISALLOWED;
        SubLObject max_possible_preference_level_foundP;
        SubLObject rest;
        SubLObject tactic;
        SubLObject tactic_preference_level;
        for (max_possible_preference_level_foundP = NIL, rest = NIL, rest = inference_datastructures_problem.problem_tactics(problem); NIL == max_possible_preference_level_foundP && NIL != rest; rest = rest.rest()) {
            tactic = rest.first();
            if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, type)
                    && (NIL == inference_datastructures_strategy.strategy_p(strategic_context) || NIL == inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_ignore_tacticP(strategic_context, tactic))) {
                tactic_preference_level = inference_datastructures_strategy.tactic_strategic_preference_level(tactic, strategic_context);
                if (NIL != preference_modules.preference_level_G(tactic_preference_level, max_preference_level)) {
                    max_preference_level = tactic_preference_level;
                    if (max_preference_level == $PREFERRED) {
                        max_possible_preference_level_foundP = T;
                    }
                }
            }
        }
        return max_preference_level;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 44600L)
    public static SubLObject discard_all_other_possible_connected_conjunction_tactics(SubLObject tactic) {
        if (NIL == inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_tactic.tactic_store(tactic))) {
            SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
            discard_possible_tactics_int(problem, NIL, NIL, $CONNECTED_CONJUNCTION, tactic, NIL);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 45200L)
    public static SubLObject possibly_discard_all_other_possible_structural_conjunctive_tactics(SubLObject tactic) {
        if (NIL == inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_tactic.tactic_store(tactic))) {
            discard_all_other_possible_structural_conjunctive_tactics(tactic);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 45800L)
    public static SubLObject discard_all_other_possible_structural_conjunctive_tactics(SubLObject tactic) {
        SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        discard_possible_tactics_int(problem, NIL, NIL, $STRUCTURAL_CONJUNCTIVE, tactic, NIL);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 46000L)
    public static SubLObject problem_link_can_have_proofsP(SubLObject link) {
        return makeBoolean(NIL == inference_worker_answer.answer_link_p(link));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 46400L)
    public static SubLObject intermediate_proof_step_valid_memoizedP_internal(SubLObject asent, SubLObject mt, SubLObject intermediate_step_validation_level) {
        return intermediate_proof_step_validP(asent, mt, intermediate_step_validation_level);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 46400L)
    public static SubLObject intermediate_proof_step_valid_memoizedP(SubLObject asent, SubLObject mt, SubLObject intermediate_step_validation_level) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return intermediate_proof_step_valid_memoizedP_internal(asent, mt, intermediate_step_validation_level);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym88$INTERMEDIATE_PROOF_STEP_VALID_MEMOIZED_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym88$INTERMEDIATE_PROOF_STEP_VALID_MEMOIZED_, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym88$INTERMEDIATE_PROOF_STEP_VALID_MEMOIZED_, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_3(asent, mt, intermediate_step_validation_level);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (asent.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (NIL != cached_args && NIL == cached_args.rest() && intermediate_step_validation_level.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(intermediate_proof_step_valid_memoizedP_internal(asent, mt, intermediate_step_validation_level)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(asent, mt, intermediate_step_validation_level));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 46600L)
    public static SubLObject intermediate_proof_step_validP(SubLObject asent, SubLObject mt, SubLObject intermediate_step_validation_level) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
            if (intermediate_step_validation_level.eql($NONE)) {
                result = T;
            } else if (intermediate_step_validation_level.eql($MINIMAL)) {
                result = T;
            } else if (intermediate_step_validation_level.eql($ALL)) {
                result = arg_type.semantically_valid_literalP(asent, UNPROVIDED, UNPROVIDED);
            } else if (intermediate_step_validation_level.eql($ARG_TYPE)) {
                result = removal_modules_admitted_formula.inference_admitted_sentence(asent, UNPROVIDED);
            } else {
                Errors.error($str93$Unexpected_intermediate_step_vali, intermediate_step_validation_level);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 47200L)
    public static SubLObject intermediate_proof_validP(SubLObject proof) {
        SubLObject link = inference_datastructures_proof.proof_link(proof);
        SubLObject proof_bindings = inference_datastructures_proof.proof_bindings(proof);
        return intermediate_proof_valid_intP(link, proof_bindings);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 47400L)
    public static SubLObject intermediate_proof_valid_intP(SubLObject link, SubLObject proof_bindings) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject store = inference_datastructures_problem_link.problem_link_store(link);
        SubLObject intermediate_step_validation_level = inference_datastructures_problem_store.problem_store_intermediate_step_validation_level(store);
        if ($NONE == intermediate_step_validation_level) {
            return T;
        }
        if (NIL != intermediate_proof_valid_due_to_structureP(link)) {
            return T;
        }
        if (NIL != content_link_p(link) && NIL == intermediate_proof_supports_validP(link, intermediate_step_validation_level)) {
            return NIL;
        }
        if ($MINIMAL == intermediate_step_validation_level) {
            return T;
        }
        if (NIL != intermediate_proof_content_link_validP(link)) {
            return T;
        }
        SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
        SubLObject supported_query = inference_datastructures_problem.problem_query(supported_problem);
        SubLObject proven_query = bindings.apply_bindings(proof_bindings, supported_query);
        if (NIL != inference_worker_residual_transformation.residual_transformation_link_p(link)) {
            SubLObject invalidP;
            SubLObject rest;
            SubLObject contextualized_clause;
            SubLObject proven_sense;
            SubLObject index_var;
            SubLObject cdolist_list_var;
            SubLObject contextualized_asent;
            SubLObject current;
            SubLObject datum;
            SubLObject proven_mt;
            SubLObject proven_asent;
            for (invalidP = NIL, rest = NIL, rest = proven_query; NIL == invalidP && NIL != rest; rest = rest.rest()) {
                contextualized_clause = rest.first();
                proven_sense = $NEG;
                index_var = ZERO_INTEGER;
                cdolist_list_var = clauses.neg_lits(contextualized_clause);
                contextualized_asent = NIL;
                contextualized_asent = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    datum = (current = contextualized_asent);
                    proven_mt = NIL;
                    proven_asent = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list94);
                    proven_mt = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list94);
                    proven_asent = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        invalidP = makeBoolean(NIL == intermediate_proof_asent_validP(proven_mt, proven_asent, proven_sense, intermediate_step_validation_level));
                    } else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, $list94);
                    }
                    index_var = Numbers.add(index_var, ONE_INTEGER);
                    cdolist_list_var = cdolist_list_var.rest();
                    contextualized_asent = cdolist_list_var.first();
                }
                proven_sense = $POS;
                index_var = ZERO_INTEGER;
                cdolist_list_var = clauses.pos_lits(contextualized_clause);
                contextualized_asent = NIL;
                contextualized_asent = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    datum = (current = contextualized_asent);
                    proven_mt = NIL;
                    proven_asent = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list94);
                    proven_mt = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list94);
                    proven_asent = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        invalidP = makeBoolean(NIL == intermediate_proof_asent_validP(proven_mt, proven_asent, proven_sense, intermediate_step_validation_level));
                    } else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, $list94);
                    }
                    index_var = Numbers.add(index_var, ONE_INTEGER);
                    cdolist_list_var = cdolist_list_var.rest();
                    contextualized_asent = cdolist_list_var.first();
                }
            }
            return makeBoolean(NIL == invalidP);
        }
        thread.resetMultipleValues();
        SubLObject proven_mt2 = inference_datastructures_problem_query.mt_asent_sense_from_singleton_query(proven_query);
        SubLObject proven_asent2 = thread.secondMultipleValue();
        SubLObject proven_sense2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return intermediate_proof_asent_validP(proven_mt2, proven_asent2, proven_sense2, intermediate_step_validation_level);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 48900L)
    public static SubLObject intermediate_proof_asent_validP(SubLObject mt, SubLObject asent, SubLObject sense, SubLObject intermediate_step_validation_level) {
        return intermediate_proof_step_valid_memoizedP(asent, mt, intermediate_step_validation_level);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 49200L)
    public static SubLObject intermediate_proof_valid_due_to_structureP(SubLObject link) {
        if (NIL != conjunctive_link_p(link)) {
            return T;
        }
        if (NIL != inference_worker_restriction.restriction_link_p(link)) {
            return T;
        }
        if (NIL != inference_worker_answer.answer_link_p(link)) {
            Errors.error($str95$Didn_t_expect_to_bubble_up_a_proo, link);
        } else {
            if (NIL != disjunctive_link_p(link)) {
                return T;
            }
            if (NIL != content_link_p(link)) {
                return NIL;
            }
            Errors.error($str96$Unexpected_link_type_for_link__a, link);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 49900L)
    public static SubLObject intermediate_proof_supports_validP(SubLObject link, SubLObject intermediate_step_validation_level) {
        SubLObject cdolist_list_var;
        SubLObject supports = cdolist_list_var = content_link_supports(link);
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == hl_supports.hl_validate(support, intermediate_step_validation_level)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 50300L)
    public static SubLObject intermediate_proof_content_link_validP(SubLObject link) {
        if (NIL != inference_worker_removal.removal_link_p(link)) {
            SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
            SubLObject supported_query = inference_datastructures_problem.problem_query(supported_problem);
            if (NIL != clause_utilities.pos_atomic_clauses_p(supported_query)) {
                SubLObject supports = inference_worker_removal.removal_link_supports(link);
                if (NIL == list_utilities.singletonP(supports)) {
                    return NIL;
                }
            }
            return T;
        }
        if (NIL != inference_worker_rewrite.rewrite_link_p(link)) {
            return NIL;
        }
        if (NIL != inference_worker_transformation.transformation_link_p(link)) {
            return NIL;
        }
        if (NIL != inference_worker_residual_transformation.residual_transformation_link_p(link)) {
            return NIL;
        }
        Errors.error($str96$Unexpected_link_type_for_link__a, link);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 51700L)
    public static SubLObject propose_new_proof_with_bindings(SubLObject link, SubLObject proof_bindings, SubLObject subproofs) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject existing_proof = NIL;
        existing_proof = find_proof(link, proof_bindings, subproofs);
        if (NIL != existing_proof) {
            return Values.values(existing_proof, NIL);
        }
        SubLObject new_proof = inference_datastructures_proof.new_proof_with_bindings(link, proof_bindings, subproofs);
        proof_propagate_non_explananatory_subproofs(new_proof);
        SubLObject validP = makeBoolean(NIL == $eager_proof_validationP$.getDynamicValue(thread) || NIL != intermediate_proof_validP(new_proof));
        if (NIL == validP) {
            reject_proof_due_to_ill_formedness(new_proof);
        } else if (NIL != Sequences.find_if($sym97$PROOF_REJECTED_, subproofs, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            if (NIL != control_vars.$inference_debugP$.getDynamicValue(thread)) {
                Errors.warn($str98$propose_new_proof_with_bindings__, Sequences.find_if($sym97$PROOF_REJECTED_, subproofs, UNPROVIDED, UNPROVIDED, UNPROVIDED), new_proof);
            }
            reject_proof(new_proof, $REJECTED_SUBPROOF);
        } else if (NIL != $proof_circularity_detection_enabledP$.getDynamicValue(thread) && NIL != proof_circularP(new_proof)) {
            reject_proof_due_to_circularity(new_proof);
        } else {
            SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
            if (NIL != inference_abduction_utilities.reject_proof_due_to_non_abducible_ruleP(link, supported_problem, subproofs)) {
                reject_proof_due_to_non_abducible_rule(new_proof);
            } else if (NIL != transformation_modules.modus_tollens_transformation_proof_p(new_proof) && NIL != removal_modules_non_wff.proof_has_some_non_wff_subproofP(new_proof)) {
                reject_proof_due_to_modus_tollens_with_non_wff(new_proof);
            } else {
                consider_that_problem_could_be_good(supported_problem);
                consider_that_subproofs_may_be_unprocessed(new_proof);
            }
        }
        return Values.values(new_proof, validP);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 54400L)
    public static SubLObject proof_propagate_non_explananatory_subproofs(SubLObject proof) {
        assert NIL != inference_datastructures_proof.proof_p(proof) : proof;
        SubLObject store = inference_datastructures_proof.proof_store(proof);
        SubLObject total = ZERO_INTEGER;
        if (NIL != inference_datastructures_problem_store.problem_store_non_explanatory_subproofs_possibleP(store) && NIL != inference_datastructures_proof.proof_has_subproofsP(proof)) {
            SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
            SubLObject subproof = NIL;
            subproof = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$12 = proof_non_explanatory_subproofs(subproof);
                SubLObject non_explanatory_subproof = NIL;
                non_explanatory_subproof = cdolist_list_var_$12.first();
                while (NIL != cdolist_list_var_$12) {
                    total = Numbers.add(total, ONE_INTEGER);
                    inference_datastructures_problem_store.proof_note_non_explanatory_subproof(proof, non_explanatory_subproof);
                    cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                    non_explanatory_subproof = cdolist_list_var_$12.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                subproof = cdolist_list_var.first();
            }
            if (NIL != inference_worker_transformation.generalized_transformation_proof_p(proof)) {
                SubLObject cdolist_list_var2;
                SubLObject non_explanatory_subproofs = cdolist_list_var2 = compute_generalized_transformation_proof_non_explanatory_subproofs(proof);
                SubLObject non_explanatory_subproof2 = NIL;
                non_explanatory_subproof2 = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    total = Numbers.add(total, ONE_INTEGER);
                    inference_datastructures_problem_store.proof_note_non_explanatory_subproof(proof, non_explanatory_subproof2);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    non_explanatory_subproof2 = cdolist_list_var2.first();
                }
            }
        }
        return total;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 55400L)
    public static SubLObject proof_circularP(SubLObject proof) {
        SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
        SubLObject subproof = NIL;
        subproof = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != proof_circular_wrtP(subproof, proof, ZERO_INTEGER)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            subproof = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 55900L)
    public static SubLObject proof_circular_wrtP(SubLObject proof, SubLObject candidate_circular_proof, SubLObject depth) {
        if (depth.numG($circular_proof_max_depth_cutoff$.getGlobalValue())) {
            return NIL;
        }
        if (NIL != proofs_share_problem_and_bindingsP(proof, candidate_circular_proof)) {
            return T;
        }
        SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
        SubLObject subproof = NIL;
        subproof = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != proof_circular_wrtP(subproof, candidate_circular_proof, number_utilities.f_1X(depth))) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            subproof = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 56300L)
    public static SubLObject proofs_share_problem_and_bindingsP(SubLObject proof1, SubLObject proof2) {
        return makeBoolean(
                inference_datastructures_proof.proof_supported_problem(proof1).eql(inference_datastructures_proof.proof_supported_problem(proof2)) && NIL != proof_bindings_equalP(inference_datastructures_proof.proof_bindings(proof1), inference_datastructures_proof.proof_bindings(proof2)));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 56700L)
    public static SubLObject proofs_share_problem_and_bindings_and_direct_supportsP(SubLObject proof1, SubLObject proof2) {
        return inference_datastructures_proof.proof_equalP(proof1, proof2);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 56800L)
    public static SubLObject reject_proof_due_to_circularity(SubLObject proof) {
        reject_proof(proof, $CIRCULAR);
        return proof;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 56900L)
    public static SubLObject reject_proof_due_to_ill_formedness(SubLObject proof) {
        reject_proof(proof, $ILL_FORMED);
        proof_note_proven_query_no_good_due_to_ill_formedness(proof);
        return proof;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 57100L)
    public static SubLObject reject_proof_due_to_non_abducible_rule(SubLObject proof) {
        reject_proof(proof, $NON_ABDUCIBLE_RULE);
        return proof;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 57200L)
    public static SubLObject reject_proof_due_to_modus_tollens_with_non_wff(SubLObject proof) {
        reject_proof(proof, $MODUS_TOLLENS_WITH_NON_WFF);
        return proof;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 57300L)
    public static SubLObject reject_proof(SubLObject proof, SubLObject reject_reason) {
        if (NIL == inference_datastructures_proof.proof_rejectedP(proof)) {
            inference_datastructures_proof.proof_note_rejected(proof, reject_reason);
            propagate_proof_rejected(proof);
        }
        consider_that_problem_could_no_longer_be_good(inference_datastructures_proof.proof_supported_problem(proof));
        return proof;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 57600L)
    public static SubLObject propagate_proof_rejected(SubLObject proof) {
        SubLObject csome_list_var = inference_datastructures_proof.proof_dependents(proof);
        SubLObject dependent_proof = NIL;
        dependent_proof = csome_list_var.first();
        while (NIL != csome_list_var) {
            if (NIL != inference_datastructures_problem.proof_has_statusP(dependent_proof, $PROVEN)) {
                reject_proof(dependent_proof, $REJECTED_SUBPROOF);
            }
            csome_list_var = csome_list_var.rest();
            dependent_proof = csome_list_var.first();
        }
        return proof;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 57800L)
    public static SubLObject proof_note_proven_query_no_good_due_to_ill_formedness(SubLObject rejected_proof) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject store = inference_datastructures_proof.proof_store(rejected_proof);
        SubLObject proven_query = proof_proven_query(rejected_proof);
        SubLObject free_hl_vars = variables.sort_hl_variable_list_memoized(bindings.bindings_variables(inference_datastructures_proof.proof_bindings(rejected_proof)));
        SubLObject mapped_problem = find_problem(store, proven_query, free_hl_vars);
        if (NIL != mapped_problem) {
            SubLObject problem = inference_datastructures_problem_link.mapped_problem_problem(mapped_problem);
            if (NIL != inference_datastructures_problem.tactically_good_problem_p(problem)) {
                SubLObject status_var = $PROVEN;
                SubLObject iteration_state;
                for (iteration_state = dictionary_contents.do_dictionary_contents_state(inference_datastructures_problem.problem_proof_bindings_index(problem)); NIL == dictionary_contents.do_dictionary_contents_doneP(
                        iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                    thread.resetMultipleValues();
                    SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    SubLObject proof_list = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject cdolist_list_var = proof_list;
                    SubLObject proof = NIL;
                    proof = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL != inference_datastructures_problem.proof_has_statusP(proof, status_var)) {
                            reject_proof(proof, $ILL_FORMED);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        proof = cdolist_list_var.first();
                    }
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            if (NIL == inference_datastructures_problem.tactically_no_good_problem_p(problem)) {
                problem_force_no_goodness(problem);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 59000L)
    public static SubLObject problem_force_no_goodness(SubLObject problem) {
        return make_problem_no_good(problem, NIL, $TACTICAL);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 59100L)
    public static SubLObject possibly_note_proof_processed(SubLObject proof) {
        assert NIL != inference_datastructures_proof.proof_p(proof) : proof;
        SubLObject store = inference_datastructures_proof.proof_store(proof);
        if (NIL != inference_datastructures_problem_store.problem_store_allows_proof_processingP(store)) {
            possibly_note_proof_processed_int(proof);
        }
        return proof;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 59600L)
    public static SubLObject possibly_note_proof_processed_int(SubLObject proof) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != inference_datastructures_proof.valid_proof_p(proof) && NIL == inference_datastructures_proof.proof_processedP(proof) && NIL != all_dependent_proofs_are_processedP(proof)) {
            inference_datastructures_proof.note_proof_processed(proof);
            SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
            SubLObject subproof = NIL;
            subproof = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                possibly_note_proof_processed_int(subproof);
                cdolist_list_var = cdolist_list_var.rest();
                subproof = cdolist_list_var.first();
            }
            if (NIL != $process_motivated_transformation_link_proofsP$.getDynamicValue(thread)) {
                SubLObject rt_link = inference_datastructures_proof.proof_link(proof);
                if (NIL != inference_worker_residual_transformation.residual_transformation_link_p(rt_link)) {
                    SubLObject t_link = inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(rt_link);
                    SubLObject cdolist_list_var2 = inference_datastructures_problem_link.problem_link_proofs(t_link);
                    SubLObject proof_$13 = NIL;
                    proof_$13 = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        if (NIL != inference_datastructures_problem.proof_has_statusP(proof_$13, NIL)) {
                            possibly_note_proof_processed_int(proof_$13);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        proof_$13 = cdolist_list_var2.first();
                    }
                }
            }
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 60400L)
    public static SubLObject consider_that_subproofs_may_be_unprocessed(SubLObject new_proof) {
        SubLObject store = inference_datastructures_proof.proof_store(new_proof);
        if (NIL != inference_datastructures_problem_store.problem_store_allows_proof_processingP(store)) {
            SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(new_proof);
            SubLObject subproof = NIL;
            subproof = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != inference_datastructures_proof.proof_processedP(subproof)) {
                    inference_datastructures_proof.note_proof_unprocessed(subproof);
                    consider_that_subproofs_may_be_unprocessed(subproof);
                }
                cdolist_list_var = cdolist_list_var.rest();
                subproof = cdolist_list_var.first();
            }
        }
        return new_proof;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 60800L)
    public static SubLObject all_dependent_proofs_are_processedP(SubLObject proof) {
        SubLObject witness = NIL;
        if (NIL == witness) {
            SubLObject csome_list_var = inference_datastructures_proof.proof_dependents(proof);
            SubLObject dependent_proof = NIL;
            dependent_proof = csome_list_var.first();
            while (NIL == witness && NIL != csome_list_var) {
                if (NIL != inference_datastructures_problem.proof_has_statusP(dependent_proof, NIL) && NIL == inference_datastructures_proof.proof_processedP(dependent_proof)) {
                    witness = dependent_proof;
                }
                csome_list_var = csome_list_var.rest();
                dependent_proof = csome_list_var.first();
            }
        }
        return makeBoolean(NIL == witness);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 61200L)
    public static SubLObject find_proof(SubLObject link, SubLObject proof_bindings, SubLObject subproofs) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $find_proof_bindings_optimization_enabledP$.getDynamicValue(thread)) {
            SubLObject inference = inference_macros.current_controlling_inference();
            if (NIL != inference_datastructures_inference.inference_problem_store_privateP(inference) && NIL != inference_datastructures_inference.inference_unique_wrt_bindingsP(inference)
                    && (NIL == inference_worker_transformation.generalized_transformation_link_p(link) || NIL != inference_worker_transformation.generalized_transformation_link_unaffected_by_exceptionsP(link))) {
                SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                SubLObject cdolist_list_var;
                SubLObject candidate_proofs = cdolist_list_var = inference_datastructures_problem.problem_proofs_lookup(supported_problem, proof_bindings);
                SubLObject candidate_proof = NIL;
                candidate_proof = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL == inference_datastructures_proof.proof_rejectedP(candidate_proof)) {
                        return candidate_proof;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    candidate_proof = cdolist_list_var.first();
                }
            }
        }
        if (NIL != inference_worker_transformation.transformation_link_p(link)) {
            return NIL;
        }
        if (NIL != problem_is_the_root_problem_of_some_inferenceP(currently_active_problem()) && NIL != inference_datastructures_inference.inference_unique_wrt_proofsP(inference_macros.current_controlling_inference())) {
            return NIL;
        }
        SubLObject supported_problem2 = inference_datastructures_problem_link.problem_link_supported_problem(link);
        SubLObject candidate_proofs2 = inference_datastructures_problem.problem_proofs_lookup(supported_problem2, proof_bindings);
        if (NIL != candidate_proofs2) {
            SubLObject direct_supports = inference_datastructures_proof.proof_spec_direct_supports(link, subproofs);
            SubLObject cdolist_list_var = candidate_proofs2;
            SubLObject proof = NIL;
            proof = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != conjunctive_proof_subsumes_conjunctive_proof_specP(proof, link, proof_bindings, subproofs) || NIL != residual_transformation_proof_subsumes_conjunctive_proof_specP(proof, link, proof_bindings, subproofs)
                        || NIL != inference_datastructures_proof.proof_matches_specificationP(proof, supported_problem2, proof_bindings, direct_supports)) {
                    return proof;
                }
                cdolist_list_var = cdolist_list_var.rest();
                proof = cdolist_list_var.first();
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 63500L)
    public static SubLObject conjunctive_proof_subsumes_conjunctive_proof_specP(SubLObject proof, SubLObject link, SubLObject proof_bindings, SubLObject subproofs) {
        return makeBoolean(NIL != connected_conjunction_proof_subsumes_connected_conjunction_proof_specP(proof, link, proof_bindings, subproofs) || NIL != split_proof_subsumes_split_proof_specP(proof, link, proof_bindings, subproofs));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 63800L)
    public static SubLObject connected_conjunction_proof_subsumes_connected_conjunction_proof_specP(SubLObject proof, SubLObject link, SubLObject proof_bindings, SubLObject subproofs) {
        return makeBoolean(NIL != inference_worker_join_ordered.connected_conjunction_proof_p(proof) && NIL != connected_conjunction_link_p(link) && NIL != list_utilities.sets_equalP(inference_datastructures_proof.proof_direct_subproofs(proof), subproofs, Symbols.symbol_function(EQ)));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 64200L)
    public static SubLObject split_proof_subsumes_split_proof_specP(SubLObject proof, SubLObject link, SubLObject proof_bindings, SubLObject subproofs) {
        return makeBoolean(NIL != inference_worker_split.split_proof_p(proof) && NIL != inference_worker_split.split_link_p(link) && NIL != list_utilities.sets_equalP(inference_datastructures_proof.proof_direct_subproofs(proof), subproofs, Symbols.symbol_function(EQ)));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 64500L)
    public static SubLObject residual_transformation_proof_subsumes_conjunctive_proof_specP(SubLObject proof, SubLObject link, SubLObject proof_bindings, SubLObject subproofs) {
        return makeBoolean(NIL != inference_worker_residual_transformation.residual_transformation_proof_p(proof) && NIL != conjunctive_link_p(link) && NIL != residual_transformation_proof_subsumes_conjunctive_proof_specP_int(proof, link, proof_bindings, subproofs));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 64800L)
    public static SubLObject residual_transformation_proof_subsumes_conjunctive_proof_specP_int(SubLObject rt_proof, SubLObject c_link, SubLObject c_proof_bindings, SubLObject c_subproofs) {
        SubLObject subsumedP = NIL;
        if (NIL != proof_bindings_equalP(inference_datastructures_proof.proof_bindings(rt_proof), c_proof_bindings) && NIL == subsumedP) {
            SubLObject csome_list_var = c_subproofs;
            SubLObject c_transformation_subproof = NIL;
            c_transformation_subproof = csome_list_var.first();
            while (NIL == subsumedP && NIL != csome_list_var) {
                if (NIL != inference_worker_transformation.transformation_proof_p(c_transformation_subproof) && NIL == subsumedP) {
                    SubLObject csome_list_var_$14 = c_subproofs;
                    SubLObject c_restriction_subproof = NIL;
                    c_restriction_subproof = csome_list_var_$14.first();
                    while (NIL == subsumedP && NIL != csome_list_var_$14) {
                        if (NIL != inference_worker_restriction.restriction_proof_p(c_restriction_subproof)) {
                            SubLObject c_transformation_supporting_subproof = inference_worker_transformation.transformation_proof_subproof(c_transformation_subproof);
                            SubLObject rt_c_subproof = inference_worker_residual_transformation.residual_transformation_proof_subproof(rt_proof);
                            if (NIL != inference_worker_join_ordered.connected_conjunction_proof_p(rt_c_subproof)) {
                                SubLObject current;
                                SubLObject datum = current = inference_datastructures_proof.proof_direct_subproofs(rt_c_subproof);
                                SubLObject rt_c_first_subproof = NIL;
                                SubLObject rt_c_second_subproof = NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list107);
                                rt_c_first_subproof = current.first();
                                current = current.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list107);
                                rt_c_second_subproof = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if ((rt_c_first_subproof.eql(c_transformation_supporting_subproof) && rt_c_second_subproof.eql(c_restriction_subproof)) || (rt_c_second_subproof.eql(c_transformation_supporting_subproof) && rt_c_first_subproof.eql(c_restriction_subproof))) {
                                        subsumedP = rt_proof;
                                    }
                                } else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum, $list107);
                                }
                            }
                        }
                        csome_list_var_$14 = csome_list_var_$14.rest();
                        c_restriction_subproof = csome_list_var_$14.first();
                    }
                }
                csome_list_var = csome_list_var.rest();
                c_transformation_subproof = csome_list_var.first();
            }
        }
        return subsumedP;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 67000L)
    public static SubLObject new_goal_proof(SubLObject goal_link) {
        assert NIL != inference_datastructures_problem_link.problem_link_to_goal_p(goal_link) : goal_link;
        if (NIL != inference_worker_removal.removal_link_p(goal_link)) {
            return inference_worker_removal.new_removal_proof(goal_link);
        }
        return inference_worker_transformation.new_transformation_proof(goal_link, NIL, NIL);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 67300L)
    public static SubLObject proof_proven_query(SubLObject proof) {
        SubLObject problem_query = inference_datastructures_proof.proof_supported_problem_query(proof);
        SubLObject proof_bindings = inference_datastructures_proof.proof_bindings(proof);
        SubLObject proven_query = bindings.apply_bindings(proof_bindings, problem_query);
        return proven_query;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 67600L)
    public static SubLObject proof_proven_sentence(SubLObject proof) {
        return inference_czer.problem_query_formula(proof_proven_query(proof));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 67700L)
    public static SubLObject proof_bindings_from_constituents(SubLObject local_bindings, SubLObject sub_bindings, SubLObject variable_map) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == sub_bindings) {
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL != variable_map) {
                Errors.error($str109$expected_a_variable_map_to_be_nul);
            }
            return local_bindings;
        }
        SubLObject localized_sub_bindings = bindings.transfer_variable_map_to_bindings(variable_map, sub_bindings);
        SubLObject grounded_local_bindings = bindings.apply_bindings_to_values(localized_sub_bindings, local_bindings);
        SubLObject complete_local_bindings = nconc(localized_sub_bindings, grounded_local_bindings);
        complete_local_bindings = ncanonicalize_proof_bindings(complete_local_bindings);
        return complete_local_bindings;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 69000L)
    public static SubLObject ncanonicalize_proof_bindings_int(SubLObject proof_bindings) {
        SubLObject sorted_bindings = Sort.sort(proof_bindings, $sym110$VARIABLE__, $sym111$VARIABLE_BINDING_VARIABLE);
        return list_utilities.delete_duplicates_sorted(sorted_bindings, Symbols.symbol_function(EQUAL));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 69300L)
    public static SubLObject ncanonicalize_proof_bindings(SubLObject proof_bindings) {
        if (NIL != list_utilities.singletonP(proof_bindings)) {
            return proof_bindings;
        }
        return ncanonicalize_proof_bindings_int(proof_bindings);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 69500L)
    public static SubLObject canonicalize_proof_bindings(SubLObject proof_bindings) {
        if (NIL != proof_bindings_canonicalP(proof_bindings)) {
            return proof_bindings;
        }
        return ncanonicalize_proof_bindings(conses_high.copy_list(proof_bindings));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 69900L)
    public static SubLObject proof_bindings_canonicalP(SubLObject proof_bindings) {
        return proof_bindings_canonicalP_recursive(proof_bindings, MINUS_ONE_INTEGER);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 70000L)
    public static SubLObject proof_bindings_canonicalP_recursive(SubLObject proof_bindings, SubLObject last_id) {
        if (NIL == proof_bindings) {
            return T;
        }
        SubLObject next_id = variables.variable_id(bindings.variable_binding_variable(proof_bindings.first()));
        if (next_id.numLE(last_id)) {
            return NIL;
        }
        return proof_bindings_canonicalP_recursive(proof_bindings.rest(), next_id);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 70300L)
    public static SubLObject proof_bindings_equalP(SubLObject proof_bindings1, SubLObject proof_bindings2) {
        return Equality.equal(proof_bindings1, proof_bindings2);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 70500L)
    public static SubLObject unify_all_equal_bindings(SubLObject v_bindings) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_bindings = NIL;
        SubLObject duplicate_bindings = list_utilities.duplicates(v_bindings, Symbols.symbol_function(EQL), Symbols.symbol_function($sym111$VARIABLE_BINDING_VARIABLE));
        SubLObject cdolist_list_var;
        SubLObject duplicate_variables = cdolist_list_var = list_utilities.fast_delete_duplicates(Mapping.mapcar(Symbols.symbol_function($sym111$VARIABLE_BINDING_VARIABLE), duplicate_bindings), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject variable = NIL;
        variable = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            SubLObject first_value = two_values_in_bindings_with_same_variable(v_bindings, variable);
            SubLObject second_value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            SubLObject value_unify_results = unification.unify(first_value, second_value, T, UNPROVIDED);
            SubLObject value_unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL == bindings.unification_success_token_p(value_unify_results)) {
                new_bindings = append(value_unify_results, new_bindings);
            }
            cdolist_list_var = cdolist_list_var.rest();
            variable = cdolist_list_var.first();
        }
        return new_bindings;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 71400L)
    public static SubLObject two_values_in_bindings_with_same_variable(SubLObject v_bindings, SubLObject variable) {
        SubLObject first_value = NIL;
        SubLObject second_value = NIL;
        SubLObject first_value_foundP = NIL;
        SubLObject second_value_foundP = NIL;
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = binding;
            SubLObject binding_variable = NIL;
            SubLObject binding_value = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list112);
            binding_variable = current.first();
            current = (binding_value = current.rest());
            if (variable.eql(binding_variable)) {
                if (NIL == first_value_foundP && NIL == second_value_foundP) {
                    first_value = binding_value;
                    first_value_foundP = T;
                } else if (NIL == second_value_foundP) {
                    second_value = binding_value;
                    second_value_foundP = T;
                } else {
                    Errors.error($str113$Found_a_triplicate_binding_for__s, variable, v_bindings);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        if (NIL != first_value_foundP && NIL != second_value_foundP) {
            return Values.values(first_value, second_value);
        }
        Errors.error($str114$Could_not_find_two_values_in__s_w, v_bindings, variable);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 72500L)
    public static SubLObject all_bindings_ground_outP(SubLObject v_bindings) {
        assert NIL != bindings.bindings_p(v_bindings) : v_bindings;
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == binding_ground_outP(binding)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 72700L)
    public static SubLObject binding_ground_outP(SubLObject binding) {
        SubLObject value = bindings.variable_binding_value(binding);
        return variables.fully_bound_p(value);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 73100L)
    public static SubLObject bubble_up_proof(SubLObject proof) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if ($proof_bubbling_depth$.getDynamicValue(thread).numG($max_proof_bubbling_depth$.getGlobalValue())) {
            reject_proof(proof, $MAX_PROOF_BUBBLING_DEPTH);
        } else {
            SubLObject _prev_bind_0 = $proof_bubbling_depth$.currentBinding(thread);
            try {
                $proof_bubbling_depth$.bind(number_utilities.f_1X($proof_bubbling_depth$.getDynamicValue(thread)), thread);
                SubLObject supported_problem = inference_datastructures_proof.proof_supported_problem(proof);
                bubble_up_proof_from_problem(proof, supported_problem);
            } finally {
                $proof_bubbling_depth$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 73600L)
    public static SubLObject bubble_up_proof_from_problem(SubLObject proof, SubLObject problem) {
        SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject dependent_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            dependent_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, dependent_link)) {
                bubble_up_proof_to_link(proof, dependent_link);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 73800L)
    public static SubLObject bubble_up_proof_to_link(SubLObject proof, SubLObject dependent_link) {
        if (NIL != inference_datastructures_proof.proof_provenP(proof)) {
            SubLObject pcase_var = inference_datastructures_problem_link.problem_link_type(dependent_link);
            if (pcase_var.eql($ANSWER)) {
                SubLObject inference = inference_datastructures_problem_link.problem_link_supported_inference(dependent_link);
                propagate_proof_to_inference(proof, inference);
            } else {
                SubLObject problem = inference_datastructures_proof.proof_supported_problem(proof);
                SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(dependent_link);
                SubLObject supporting_mapped_problem = NIL;
                supporting_mapped_problem = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != inference_macros.do_problem_link_open_matchP(NIL, dependent_link, supporting_mapped_problem) && problem.eql(inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem))) {
                        bubble_up_proof_to_link_via_mapped_problem(proof, dependent_link, supporting_mapped_problem);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    supporting_mapped_problem = cdolist_list_var.first();
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 75000L)
    public static SubLObject bubble_up_proof_to_link_via_mapped_problem(SubLObject proof, SubLObject dependent_link, SubLObject mapped_problem) {
        if (NIL != link_permits_proof_propagationP(dependent_link, mapped_problem)) {
            SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(mapped_problem);
            bubble_up_proof_to_link_via_variable_map(proof, variable_map, dependent_link);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 75600L)
    public static SubLObject bubble_up_proof_to_link_via_variable_map(SubLObject proof, SubLObject variable_map, SubLObject dependent_link) {
        assert NIL != inference_datastructures_proof.proof_p(proof) : proof;
        assert NIL != bindings.variable_map_p(variable_map) : variable_map;
        SubLObject pcase_var = inference_datastructures_problem_link.problem_link_type(dependent_link);
        if (pcase_var.eql($TRANSFORMATION)) {
            inference_worker_transformation.bubble_up_proof_to_transformation_link(proof, variable_map, dependent_link);
        } else if (pcase_var.eql($REWRITE)) {
            inference_worker_rewrite.bubble_up_proof_to_rewrite_link(proof, variable_map, dependent_link);
        } else if (pcase_var.eql($JOIN_ORDERED)) {
            inference_worker_join_ordered.bubble_up_proof_to_join_ordered_link(proof, variable_map, dependent_link);
        } else if (pcase_var.eql($JOIN)) {
            inference_worker_join.bubble_up_proof_to_join_link(proof, variable_map, dependent_link);
        } else if (pcase_var.eql($SPLIT)) {
            inference_worker_split.bubble_up_proof_to_split_link(proof, variable_map, dependent_link);
        } else if (pcase_var.eql($RESTRICTION)) {
            inference_worker_restriction.bubble_up_proof_to_restriction_link(proof, variable_map, dependent_link);
        } else if (pcase_var.eql($RESIDUAL_TRANSFORMATION)) {
            inference_worker_residual_transformation.bubble_up_proof_to_residual_transformation_link(proof, variable_map, dependent_link);
        } else if (pcase_var.eql($UNION)) {
            inference_worker_union.bubble_up_proof_to_union_link(proof, variable_map, dependent_link);
        } else if (pcase_var.eql($DISJUNCTIVE_ASSUMPTION)) {
            Errors.error($str122$can_t_handle_bubbling_up_proofs_p);
        } else if (pcase_var.eql($ANSWER)) {
            SubLObject inference = inference_datastructures_problem_link.problem_link_supported_inference(dependent_link);
            propagate_proof_to_inference(proof, inference);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 77500L)
    public static SubLObject perform_lazy_proof_rejection(SubLObject proof, SubLObject inference) {
        if (NIL != inference_datastructures_inference.inference_allow_abnormality_checkingP(inference)) {
            reject_abnormal_subproofs(proof);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 78300L)
    public static SubLObject proof_consistent_with_mt_assumptionsP(SubLObject proof) {
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 78700L)
    public static SubLObject within_abnormality_checkingP() {
        SubLThread thread = SubLProcess.currentSubLThread();
        return $within_abnormality_checkingP$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 78700L)
    public static SubLObject reject_abnormal_subproofs(SubLObject proof) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == inference_datastructures_proof.proof_provenP(proof)) {
            return NIL;
        }
        SubLObject _prev_bind_0 = $within_abnormality_checkingP$.currentBinding(thread);
        try {
            $within_abnormality_checkingP$.bind(T, thread);
            SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
            SubLObject subproof = NIL;
            subproof = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                reject_abnormal_subproofs(subproof);
                cdolist_list_var = cdolist_list_var.rest();
                subproof = cdolist_list_var.first();
            }
            SubLObject justification = (NIL != inference_worker_transformation.transformation_proof_p(proof)) ? inference_worker_transformation.transformation_proof_abnormalP(proof)
                    : ((NIL != inference_worker_residual_transformation.residual_transformation_proof_p(proof)) ? inference_worker_residual_transformation.residual_transformation_proof_abnormalP(proof) : NIL);
            if (NIL != justification) {
                reject_proof_due_to_abnormality(proof, justification);
            }
            if (NIL != ((NIL != abnormal.abnormality_except_support_enabledP()) ? inference_worker_transformation.proof_depends_on_excepted_assertionP(proof) : NIL)) {
                reject_proof(proof, $EXCEPTED_ASSERTION);
            }
        } finally {
            $within_abnormality_checkingP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 79700L)
    public static SubLObject reject_proof_due_to_abnormality(SubLObject proof, SubLObject justification) {
        return reject_proof(proof, justification);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 80000L)
    public static SubLObject inference_proof_non_explanatory_subproofs(SubLObject inference, SubLObject proof) {
        SubLObject answer_link = inference_datastructures_inference.inference_root_link(inference);
        if (NIL != inference_worker_answer.answer_link_supporting_problem_wholly_explanatoryP(answer_link)) {
            return proof_non_explanatory_subproofs(proof);
        }
        return cached_inference_proof_non_explanatory_subproofs(inference, proof);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 80700L)
    public static SubLObject cached_inference_proof_non_explanatory_subproofs_internal(SubLObject inference, SubLObject proof) {
        SubLObject answer_link = inference_datastructures_inference.inference_root_link(inference);
        SubLObject all_non_explanatory_subproofs = NIL;
        SubLObject cdolist_list_var = proof_non_explanatory_subproofs(proof);
        SubLObject non_explanatory_content_proof = NIL;
        non_explanatory_content_proof = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject item_var = non_explanatory_content_proof;
            if (NIL == conses_high.member(item_var, all_non_explanatory_subproofs, Symbols.symbol_function(EQ), Symbols.symbol_function(IDENTITY))) {
                all_non_explanatory_subproofs = cons(item_var, all_non_explanatory_subproofs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            non_explanatory_content_proof = cdolist_list_var.first();
        }
        if (NIL == inference_worker_answer.answer_link_supporting_problem_wholly_explanatoryP(answer_link)) {
            SubLObject proven_non_explanatory_subquery = inference_proof_proven_non_explanatory_subquery(inference, proof);
            SubLObject cdolist_list_var2;
            SubLObject non_explanatory_subproofs = cdolist_list_var2 = compute_non_explanatory_subproofs(proof, proven_non_explanatory_subquery);
            SubLObject non_explanatory_subproof = NIL;
            non_explanatory_subproof = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                SubLObject item_var2 = non_explanatory_subproof;
                if (NIL == conses_high.member(item_var2, all_non_explanatory_subproofs, Symbols.symbol_function(EQ), Symbols.symbol_function(IDENTITY))) {
                    all_non_explanatory_subproofs = cons(item_var2, all_non_explanatory_subproofs);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                non_explanatory_subproof = cdolist_list_var2.first();
            }
        }
        return Sequences.nreverse(all_non_explanatory_subproofs);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 80700L)
    public static SubLObject cached_inference_proof_non_explanatory_subproofs(SubLObject inference, SubLObject proof) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return cached_inference_proof_non_explanatory_subproofs_internal(inference, proof);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym124$CACHED_INFERENCE_PROOF_NON_EXPLANATORY_SUBPROOFS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym124$CACHED_INFERENCE_PROOF_NON_EXPLANATORY_SUBPROOFS, TWO_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym124$CACHED_INFERENCE_PROOF_NON_EXPLANATORY_SUBPROOFS, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_2(inference, proof);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (inference.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (NIL != cached_args && NIL == cached_args.rest() && proof.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(cached_inference_proof_non_explanatory_subproofs_internal(inference, proof)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(inference, proof));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 81800L)
    public static SubLObject proof_non_explanatory_subproofs(SubLObject proof) {
        SubLObject subproofs = NIL;
        if (NIL != inference_datastructures_proof.proof_has_subproofsP(proof)) {
            SubLObject store = inference_datastructures_proof.proof_store(proof);
            if (NIL != inference_datastructures_problem_store.problem_store_non_explanatory_subproofs_possibleP(store)) {
                subproofs = inference_datastructures_problem_store.problem_store_proof_non_explanatory_subproofs(store, proof);
            }
        }
        return subproofs;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 82100L)
    public static SubLObject compute_generalized_transformation_proof_non_explanatory_subproofs(SubLObject proof) {
        assert NIL != inference_worker_transformation.generalized_transformation_proof_p(proof) : proof;
        SubLObject subproofs = NIL;
        SubLObject transformation_link = inference_worker_transformation.generalized_transformation_proof_transformation_link(proof);
        if (NIL == inference_worker_transformation.transformation_link_supporting_problem_wholly_explanatoryP(transformation_link)) {
            SubLObject proven_non_explanatory_subquery = generalized_transformation_proof_proven_non_explanatory_subquery(proof);
            subproofs = compute_non_explanatory_subproofs(proof, proven_non_explanatory_subquery);
        }
        return subproofs;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 82700L)
    public static SubLObject inference_proof_proven_non_explanatory_subquery(SubLObject inference, SubLObject proof) {
        SubLObject non_explanatory_subquery = inference_datastructures_inference.inference_non_explanatory_subquery(inference);
        SubLObject answer_link = inference_datastructures_inference.inference_root_link(inference);
        SubLObject variable_map = inference_datastructures_problem_link.problem_link_sole_supporting_variable_map(answer_link);
        SubLObject proof_bindings = bindings.transfer_variable_map_to_bindings(variable_map, inference_datastructures_proof.proof_bindings(proof));
        SubLObject proven_non_explanatory_subquery = bindings.apply_bindings(proof_bindings, non_explanatory_subquery);
        return proven_non_explanatory_subquery;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 83300L)
    public static SubLObject generalized_transformation_proof_proven_non_explanatory_subquery(SubLObject proof) {
        if (NIL != inference_worker_transformation.transformation_proof_p(proof)) {
            return transformation_proof_proven_non_explanatory_subquery(proof);
        }
        if (NIL != inference_worker_residual_transformation.residual_transformation_proof_p(proof)) {
            return residual_transformation_proof_proven_non_explanatory_subquery(proof);
        }
        return Errors.error($str126$generalized_transformation_proof_, proof);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 83700L)
    public static SubLObject transformation_proof_proven_non_explanatory_subquery(SubLObject proof) {
        SubLObject transformation_link = inference_datastructures_proof.proof_link(proof);
        SubLObject subproof = inference_worker_transformation.transformation_proof_subproof(proof);
        SubLObject subproof_bindings = (NIL != subproof) ? inference_datastructures_proof.proof_bindings(subproof) : NIL;
        SubLObject non_explanatory_subquery = inference_worker_transformation.transformation_link_non_explanatory_subquery(transformation_link);
        SubLObject proven_non_explanatory_subquery = bindings.apply_bindings(subproof_bindings, non_explanatory_subquery);
        return proven_non_explanatory_subquery;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 84300L)
    public static SubLObject residual_transformation_proof_proven_non_explanatory_subquery(SubLObject proof) {
        SubLObject transformation_link = inference_worker_residual_transformation.residual_transformation_proof_motivating_transformation_link(proof);
        SubLObject subproof = inference_worker_residual_transformation.residual_transformation_proof_subproof(proof);
        SubLObject subproof_bindings = (NIL != subproof) ? inference_datastructures_proof.proof_bindings(subproof) : NIL;
        SubLObject non_explanatory_subquery = inference_worker_transformation.transformation_link_non_explanatory_subquery(transformation_link);
        SubLObject proven_non_explanatory_subquery = bindings.apply_bindings(subproof_bindings, non_explanatory_subquery);
        return proven_non_explanatory_subquery;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 84900L)
    public static SubLObject compute_non_explanatory_subproofs(SubLObject proof, SubLObject proven_non_explanatory_query) {
        SubLObject non_explanatory_subproofs = NIL;
        SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
        SubLObject subproof = NIL;
        subproof = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            non_explanatory_subproofs = non_explanatory_subproofs_recursive(subproof, proven_non_explanatory_query, non_explanatory_subproofs);
            cdolist_list_var = cdolist_list_var.rest();
            subproof = cdolist_list_var.first();
        }
        return Sequences.nreverse(non_explanatory_subproofs);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 85400L)
    public static SubLObject non_explanatory_subproofs_recursive(SubLObject proof, SubLObject proven_non_explanatory_query, SubLObject non_explanatory_subproofs) {
        if (NIL == list_utilities.member_eqP(proof, non_explanatory_subproofs)) {
            SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
            SubLObject subproof = NIL;
            subproof = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                non_explanatory_subproofs = non_explanatory_subproofs_recursive(subproof, proven_non_explanatory_query, non_explanatory_subproofs);
                cdolist_list_var = cdolist_list_var.rest();
                subproof = cdolist_list_var.first();
            }
            if (NIL != non_explanatory_proofP(proof, proven_non_explanatory_query)) {
                non_explanatory_subproofs = cons(proof, non_explanatory_subproofs);
            }
        }
        return non_explanatory_subproofs;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 86000L)
    public static SubLObject non_explanatory_proofP(SubLObject proof, SubLObject proven_non_explanatory_query) {
        SubLObject cdolist_list_var;
        SubLObject proof_proven_query = cdolist_list_var = proof_proven_query(proof);
        SubLObject clause = NIL;
        clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject index_var = ZERO_INTEGER;
            SubLObject cdolist_list_var_$15 = clauses.neg_lits(clause);
            SubLObject contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var_$15.first();
            while (NIL != cdolist_list_var_$15) {
                SubLObject sense = $NEG;
                if (NIL == non_explanatory_asentP(contextualized_asent, sense, proven_non_explanatory_query)) {
                    return NIL;
                }
                index_var = Numbers.add(index_var, ONE_INTEGER);
                cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                contextualized_asent = cdolist_list_var_$15.first();
            }
            index_var = ZERO_INTEGER;
            SubLObject cdolist_list_var_$16 = clauses.pos_lits(clause);
            contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var_$16.first();
            while (NIL != cdolist_list_var_$16) {
                SubLObject sense = $POS;
                if (NIL == non_explanatory_asentP(contextualized_asent, sense, proven_non_explanatory_query)) {
                    return NIL;
                }
                index_var = Numbers.add(index_var, ONE_INTEGER);
                cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                contextualized_asent = cdolist_list_var_$16.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 86400L)
    public static SubLObject non_explanatory_asentP(SubLObject candidate_asent, SubLObject sense, SubLObject proven_non_explanatory_query) {
        SubLObject cdolist_list_var = proven_non_explanatory_query;
        SubLObject proven_clause = NIL;
        proven_clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ($POS == sense) {
                SubLObject cdolist_list_var_$17 = clauses.pos_lits(proven_clause);
                SubLObject proven_asent = NIL;
                proven_asent = cdolist_list_var_$17.first();
                while (NIL != cdolist_list_var_$17) {
                    if (candidate_asent.equal(proven_asent)) {
                        return T;
                    }
                    cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                    proven_asent = cdolist_list_var_$17.first();
                }
            } else if ($NEG == sense) {
                SubLObject cdolist_list_var_$18 = clauses.neg_lits(proven_clause);
                SubLObject proven_asent = NIL;
                proven_asent = cdolist_list_var_$18.first();
                while (NIL != cdolist_list_var_$18) {
                    if (candidate_asent.equal(proven_asent)) {
                        return T;
                    }
                    cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                    proven_asent = cdolist_list_var_$18.first();
                }
            } else {
                Errors.error($str127$Invalid_sense__s, sense);
            }
            cdolist_list_var = cdolist_list_var.rest();
            proven_clause = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 86900L)
    public static SubLObject explanatory_asentP(SubLObject candidate_asent, SubLObject sense, SubLObject proven_explanatory_query) {
        SubLObject cdolist_list_var = proven_explanatory_query;
        SubLObject proven_clause = NIL;
        proven_clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ($POS == sense) {
                SubLObject cdolist_list_var_$19 = clauses.pos_lits(proven_clause);
                SubLObject proven_asent = NIL;
                proven_asent = cdolist_list_var_$19.first();
                while (NIL != cdolist_list_var_$19) {
                    if (candidate_asent.equal(proven_asent)) {
                        return T;
                    }
                    cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                    proven_asent = cdolist_list_var_$19.first();
                }
            } else if ($NEG == sense) {
                SubLObject cdolist_list_var_$20 = clauses.neg_lits(proven_clause);
                SubLObject proven_asent = NIL;
                proven_asent = cdolist_list_var_$20.first();
                while (NIL != cdolist_list_var_$20) {
                    if (candidate_asent.equal(proven_asent)) {
                        return T;
                    }
                    cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                    proven_asent = cdolist_list_var_$20.first();
                }
            } else {
                Errors.error($str127$Invalid_sense__s, sense);
            }
            cdolist_list_var = cdolist_list_var.rest();
            proven_clause = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 87300L)
    public static SubLObject note_tactic_finished(SubLObject tactic) {
        if (NIL != inference_datastructures_tactic.valid_tactic_p(tactic)) {
            SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
            inference_datastructures_tactic.note_tactic_executed(tactic);
            inference_datastructures_strategy.set_problem_tactics_recompute_thrown_away_wrt_all_relevant_strategies(inference_datastructures_tactic.tactic_problem(tactic));
            if (NIL != inference_worker_join_ordered.join_ordered_tactic_p(tactic)) {
                SubLObject lookahead_problem = inference_worker_join_ordered.join_ordered_tactic_lookahead_problem(tactic);
                if (NIL != inference_datastructures_problem.tactically_finished_problem_p(lookahead_problem) && NIL != inference_tactician_strategic_uninterestingness.problem_has_executed_a_complete_tacticP(lookahead_problem, $TACTICAL, UNPROVIDED)) {
                    discard_all_other_possible_structural_conjunctive_tactics(tactic);
                }
            }
            if (NIL != inference_datastructures_problem.problem_no_tactics_possibleP(problem)) {
                if (NIL == inference_datastructures_problem.tactically_no_good_problem_p(problem) && NIL == inference_datastructures_problem.tactically_pending_problem_p(problem)) {
                    note_problem_pending(problem, $TACTICAL);
                }
                consider_that_problem_could_be_finished(problem, NIL, $TACTICAL, T);
                if (NIL != inference_tactician_strategic_uninterestingness.problem_has_executed_a_complete_tacticP(problem, $TACTICAL, UNPROVIDED)) {
                    consider_that_problem_could_be_no_good(problem, NIL, $TACTICAL, T);
                }
            }
            SubLObject prob = problem;
            SubLObject store = inference_datastructures_problem.problem_store(prob);
            SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
            if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
                SubLObject idx_$21 = idx;
                if (NIL == id_index.id_index_dense_objects_empty_p(idx_$21, $SKIP)) {
                    SubLObject vector_var = id_index.id_index_dense_objects(idx_$21);
                    SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject inference;
                    SubLObject inference_var;
                    SubLObject set_var;
                    SubLObject set_contents_var;
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject strategy;
                    for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                        id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                        inference = Vectors.aref(vector_var, id);
                        if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                            if (NIL != id_index.id_index_tombstone_p(inference)) {
                                inference = $SKIP;
                            }
                            if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference)) {
                                inference_var = inference;
                                set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                                set_contents_var = set.do_set_internal(set_var);
                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                                        state); state = set_contents.do_set_contents_update_state(state)) {
                                    strategy = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                        inference_tactician.strategy_note_tactic_finished(strategy, tactic);
                                    }
                                }
                            }
                        }
                    }
                }
                SubLObject idx_$22 = idx;
                if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$22)) {
                    SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$22);
                    SubLObject id2 = NIL;
                    SubLObject inference2 = NIL;
                    Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            inference2 = Hashtables.getEntryValue(cdohash_entry);
                            if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference2)) {
                                SubLObject inference_var2 = inference2;
                                SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                                SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject strategy2;
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2,
                                        state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                        inference_tactician.strategy_note_tactic_finished(strategy2, tactic);
                                    }
                                }
                            }
                        }
                    } finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
        }
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 88900L)
    public static SubLObject consider_strategic_ramifications_of_possibly_executed_tactic(SubLObject strategy, SubLObject tactic) {
        if (NIL != inference_datastructures_tactic.tactic_executedP(tactic)) {
            consider_strategic_ramifications_of_executed_tactic(strategy, tactic);
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 89200L)
    public static SubLObject consider_strategic_ramifications_of_executed_tactic(SubLObject strategy, SubLObject tactic) {
        SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        if (NIL != inference_tactician.strategy_no_possible_strategems_for_problemP(strategy, problem)) {
            possibly_note_problem_pending(problem, strategy);
            consider_that_problem_could_be_finished(problem, NIL, strategy, T);
            if (NIL != inference_tactician_strategic_uninterestingness.problem_has_executed_a_complete_tacticP(problem, strategy, UNPROVIDED)) {
                consider_that_problem_could_be_no_good(problem, NIL, strategy, T);
            }
        }
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 89700L)
    public static SubLObject note_problem_created(SubLObject problem) {
        change_and_propagate_problem_status(problem, $UNEXAMINED, NIL, $TACTICAL);
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 90100L)
    public static SubLObject possibly_reactivate_problem(SubLObject strategy, SubLObject problem) {
        return possibly_activate_problem(strategy, problem);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 90200L)
    public static SubLObject possibly_activate_problem(SubLObject strategy, SubLObject problem) {
        SubLObject really_relevantP = inference_tactician.strategy_possibly_activate_problem(strategy, problem);
        if (NIL != really_relevantP) {
            inference_datastructures_strategy.strategy_note_problem_active(strategy, problem);
            SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
            inference_datastructures_inference.add_inference_relevant_problem(inference, problem);
            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject argument_link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                    state); state = set_contents.do_set_contents_update_state(state)) {
                argument_link = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, argument_link)) {
                    propagate_min_proof_depth_via_link_wrt_inference(argument_link, inference);
                    propagate_min_transformation_depth_via_link_wrt_inference(argument_link, inference);
                    inference_min_transformation_depth.propagate_min_transformation_depth_signature_via_link_wrt_inference(argument_link, inference);
                    propagate_proof_spec(argument_link);
                }
            }
        }
        return really_relevantP;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 91500L)
    public static SubLObject determine_strategic_status_wrt(SubLObject problem, SubLObject strategic_context) {
        if (NIL == inference_datastructures_problem.tactically_no_good_problem_p(problem)) {
            if (NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem)) {
                determine_new_tactics(problem);
            }
            if (NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
                possibly_compute_strategic_properties_of_problem_tactics(problem, strategic_context);
                possibly_note_problem_strategically_examined(problem, strategic_context);
                possibly_note_problem_strategically_possible(problem, strategic_context);
                consider_that_problem_could_be_strategically_pending_wrt(problem, strategic_context);
                return inference_datastructures_strategy.problem_strategic_status(problem, strategic_context);
            }
        }
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 92500L)
    public static SubLObject note_problem_examined(SubLObject problem) {
        SubLObject old_status = inference_datastructures_problem.problem_status(problem);
        SubLObject new_status = examined_version_of_problem_status(old_status);
        change_and_propagate_problem_status(problem, new_status, NIL, $TACTICAL);
        SubLObject store = inference_datastructures_problem.problem_store(problem);
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$23 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$23, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$23);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                SubLObject inference_var;
                SubLObject set_var;
                SubLObject set_contents_var;
                SubLObject basis_object;
                SubLObject state;
                SubLObject strategy;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                                    state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    possibly_note_problem_strategically_examined(problem, strategy);
                                }
                            }
                        }
                    }
                }
            }
            SubLObject idx_$24 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$24)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$24);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                            SubLObject inference_var2 = inference2;
                            SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2,
                                    state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    possibly_note_problem_strategically_examined(problem, strategy2);
                                }
                            }
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        if (NIL == inference_datastructures_problem.problem_no_tactics_possibleP(problem)) {
            if (NIL == inference_datastructures_problem.tactically_no_good_problem_p(problem)) {
                note_problem_possible(problem);
            }
        }
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 93100L)
    public static SubLObject possibly_note_problem_strategically_examined(SubLObject problem, SubLObject strategy) {
        if (NIL == inference_datastructures_problem.tactically_unexamined_problem_p(problem) && NIL != inference_datastructures_strategy.strategically_unexamined_problem_p(problem, strategy)) {
            SubLObject old_strategic_status = inference_datastructures_strategy.problem_raw_strategic_status(problem, strategy);
            SubLObject new_strategic_status = examined_version_of_problem_status(old_strategic_status);
            change_and_propagate_problem_status(problem, new_strategic_status, NIL, strategy);
        }
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 93600L)
    public static SubLObject note_problem_possible(SubLObject problem) {
        SubLObject old_status = inference_datastructures_problem.problem_status(problem);
        SubLObject new_status = possible_version_of_problem_status(old_status);
        change_and_propagate_problem_status(problem, new_status, NIL, $TACTICAL);
        SubLObject store = inference_datastructures_problem.problem_store(problem);
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$25 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$25, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$25);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                SubLObject inference_var;
                SubLObject set_var;
                SubLObject set_contents_var;
                SubLObject basis_object;
                SubLObject state;
                SubLObject strategy;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                                    state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    possibly_note_problem_strategically_possible(problem, strategy);
                                }
                            }
                        }
                    }
                }
            }
            SubLObject idx_$26 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$26)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$26);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                            SubLObject inference_var2 = inference2;
                            SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2,
                                    state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    possibly_note_problem_strategically_possible(problem, strategy2);
                                }
                            }
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 94000L)
    public static SubLObject possibly_note_problem_strategically_possible(SubLObject problem, SubLObject strategy) {
        if (NIL != inference_datastructures_strategy.strategically_examined_problem_p(problem, strategy)) {
            if (NIL == inference_tactician.strategy_no_possible_strategems_for_problemP(strategy, problem) && NIL == inference_datastructures_strategy.strategically_no_good_problem_p(problem, strategy)) {
                note_problem_strategically_possible(problem, strategy);
            } else {
                note_problem_pending(problem, strategy);
            }
        }
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 94500L)
    public static SubLObject note_problem_strategically_unexamined(SubLObject problem, SubLObject strategy) {
        SubLObject old_strategic_status = inference_datastructures_strategy.problem_raw_strategic_status(problem, strategy);
        SubLObject new_strategic_status = unexamined_version_of_problem_status(old_strategic_status);
        change_and_propagate_problem_status(problem, new_strategic_status, NIL, strategy);
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 94800L)
    public static SubLObject note_problem_strategically_possible(SubLObject problem, SubLObject strategy) {
        SubLObject old_strategic_status = inference_datastructures_strategy.problem_raw_strategic_status(problem, strategy);
        SubLObject new_strategic_status = possible_version_of_problem_status(old_strategic_status);
        change_and_propagate_problem_status(problem, new_strategic_status, NIL, strategy);
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 95100L)
    public static SubLObject possibly_note_problem_pending(SubLObject problem, SubLObject strategic_context) {
        assert NIL != strategic_context_p(strategic_context) : strategic_context;
        if (NIL != possible_problem_p(problem, strategic_context)) {
            return note_problem_pending(problem, strategic_context);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 95500L)
    public static SubLObject note_problem_pending(SubLObject problem, SubLObject strategic_context) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == inference_datastructures_strategy.strategy_p(strategic_context) && NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == inference_datastructures_problem.problem_no_tactics_possibleP(problem)) {
            Errors.error($str129$Tried_to_make__a_pending_but_it_s, problem);
        }
        SubLObject old_status = problem_raw_tactical_or_strategic_status(problem, strategic_context);
        SubLObject new_status = pending_version_of_problem_status(old_status);
        change_and_propagate_problem_status(problem, new_status, NIL, strategic_context);
        consider_that_problem_could_be_no_good(problem, NIL, strategic_context, T);
        if (NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
            inference_datastructures_inference.inference_note_problem_pending(inference_datastructures_strategy.strategy_inference(strategic_context), problem);
        } else {
            SubLObject store = inference_datastructures_problem.problem_store(problem);
            SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
            if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
                SubLObject idx_$27 = idx;
                if (NIL == id_index.id_index_dense_objects_empty_p(idx_$27, $SKIP)) {
                    SubLObject vector_var = id_index.id_index_dense_objects(idx_$27);
                    SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject inference;
                    SubLObject inference_var;
                    SubLObject set_var;
                    SubLObject set_contents_var;
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject strategy;
                    for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                        id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                        inference = Vectors.aref(vector_var, id);
                        if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                            if (NIL != id_index.id_index_tombstone_p(inference)) {
                                inference = $SKIP;
                            }
                            if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                                inference_var = inference;
                                set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                                set_contents_var = set.do_set_internal(set_var);
                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                                        state); state = set_contents.do_set_contents_update_state(state)) {
                                    strategy = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                        possibly_note_problem_pending(problem, strategy);
                                    }
                                }
                            }
                        }
                    }
                }
                SubLObject idx_$28 = idx;
                if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$28)) {
                    SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$28);
                    SubLObject id2 = NIL;
                    SubLObject inference2 = NIL;
                    Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            inference2 = Hashtables.getEntryValue(cdohash_entry);
                            if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                                SubLObject inference_var2 = inference2;
                                SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                                SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject strategy2;
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2,
                                        state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                        possibly_note_problem_pending(problem, strategy2);
                                    }
                                }
                            }
                        }
                    } finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
        }
        return new_status;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 96500L)
    public static SubLObject possibly_note_problem_finished(SubLObject problem, SubLObject strategic_context) {
        assert NIL != strategic_context_p(strategic_context) : strategic_context;
        if (NIL != pending_problem_p(problem, strategic_context)) {
            return note_problem_finished(problem, strategic_context);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 97100L)
    public static SubLObject note_problem_finished(SubLObject problem, SubLObject strategic_context) {
        SubLObject old_status = problem_raw_tactical_or_strategic_status(problem, strategic_context);
        SubLObject new_status = finished_version_of_problem_status(old_status);
        change_and_propagate_problem_status(problem, new_status, NIL, strategic_context);
        consider_ramifications_of_problem_finished(problem, strategic_context);
        return new_status;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 97700L)
    public static SubLObject consider_ramifications_of_problem_finished(SubLObject problem, SubLObject strategic_context) {
        consider_that_problem_could_be_no_good(problem, NIL, strategic_context, T);
        possibly_propagate_problem_finished(problem, strategic_context);
        if (NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
            strategy_note_problem_finished(strategic_context, problem);
        } else {
            SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject restriction_link;
            SubLObject supported_problem;
            SubLObject set_contents_var_$29;
            SubLObject basis_object_$30;
            SubLObject state_$31;
            SubLObject jo_link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                    state); state = set_contents.do_set_contents_update_state(state)) {
                restriction_link = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, restriction_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $RESTRICTION)) {
                    supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
                    set_contents_var_$29 = inference_datastructures_problem.problem_dependent_links(supported_problem);
                    for (basis_object_$30 = set_contents.do_set_contents_basis_object(set_contents_var_$29), state_$31 = NIL, state_$31 = set_contents.do_set_contents_initial_state(basis_object_$30, set_contents_var_$29); NIL == set_contents.do_set_contents_doneP(basis_object_$30,
                            state_$31); state_$31 = set_contents.do_set_contents_update_state(state_$31)) {
                        jo_link = set_contents.do_set_contents_next(basis_object_$30, state_$31);
                        if (NIL != set_contents.do_set_contents_element_validP(state_$31, jo_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link, $JOIN_ORDERED)) {
                            inference_worker_join_ordered.note_restricted_non_focal_finished(jo_link, restriction_link);
                        }
                    }
                }
            }
            if (NIL != inference_tactician_strategic_uninterestingness.problem_has_executed_a_complete_tacticP(problem, strategic_context, UNPROVIDED)) {
                set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
                SubLObject join_ordered_link;
                SubLObject tactic;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                        state); state = set_contents.do_set_contents_update_state(state)) {
                    join_ordered_link = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, join_ordered_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, $JOIN_ORDERED) && NIL != inference_datastructures_problem_link.problem_link_openP(join_ordered_link)) {
                        tactic = inference_worker_join_ordered.join_ordered_link_tactic(join_ordered_link);
                        if (NIL != tactic) {
                            discard_all_other_possible_structural_conjunctive_tactics(tactic);
                        }
                    }
                }
            }
            SubLObject store = inference_datastructures_problem.problem_store(problem);
            SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
            if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
                SubLObject idx_$32 = idx;
                if (NIL == id_index.id_index_dense_objects_empty_p(idx_$32, $SKIP)) {
                    SubLObject vector_var = id_index.id_index_dense_objects(idx_$32);
                    SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject inference;
                    SubLObject inference_var;
                    SubLObject set_var;
                    SubLObject set_contents_var2;
                    SubLObject basis_object2;
                    SubLObject state2;
                    SubLObject strategy;
                    for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                        id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                        inference = Vectors.aref(vector_var, id);
                        if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                            if (NIL != id_index.id_index_tombstone_p(inference)) {
                                inference = $SKIP;
                            }
                            if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                                inference_var = inference;
                                set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                                set_contents_var2 = set.do_set_internal(set_var);
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2,
                                        state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    strategy = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (NIL != set_contents.do_set_contents_element_validP(state2, strategy)) {
                                        if (NIL != finished_problem_p(problem, strategy)) {
                                            consider_ramifications_of_problem_finished(problem, strategy);
                                        } else {
                                            possibly_note_problem_finished(problem, strategy);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                SubLObject idx_$33 = idx;
                if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$33)) {
                    SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$33);
                    SubLObject id2 = NIL;
                    SubLObject inference2 = NIL;
                    Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            inference2 = Hashtables.getEntryValue(cdohash_entry);
                            if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                                SubLObject inference_var2 = inference2;
                                SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                                SubLObject set_contents_var3 = set.do_set_internal(set_var2);
                                SubLObject basis_object3;
                                SubLObject state3;
                                SubLObject strategy2;
                                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3,
                                        state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                    strategy2 = set_contents.do_set_contents_next(basis_object3, state3);
                                    if (NIL != set_contents.do_set_contents_element_validP(state3, strategy2)) {
                                        if (NIL != finished_problem_p(problem, strategy2)) {
                                            consider_ramifications_of_problem_finished(problem, strategy2);
                                        } else {
                                            possibly_note_problem_finished(problem, strategy2);
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 99300L)
    public static SubLObject possibly_propagate_problem_finished(SubLObject problem, SubLObject strategic_context) {
        SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject dependent_link;
        SubLObject link_var;
        SubLObject cdolist_list_var;
        SubLObject mapped_problem;
        SubLObject supported_problem;
        SubLObject set_contents_var_$34;
        SubLObject basis_object_$35;
        SubLObject state_$36;
        SubLObject jo_link;
        SubLObject conjunction_problem;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            dependent_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, dependent_link)) {
                link_var = dependent_link;
                cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                mapped_problem = NIL;
                mapped_problem = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, mapped_problem) && problem.eql(inference_datastructures_problem_link.mapped_problem_problem(mapped_problem))) {
                        supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(dependent_link);
                        if (NIL != supported_problem && (NIL == inference_datastructures_strategy.strategy_p(strategic_context) || NIL != inference_datastructures_problem.problem_relevant_to_strategyP(supported_problem, strategic_context))) {
                            consider_that_problem_could_be_finished(supported_problem, NIL, strategic_context, T);
                            if (NIL != inference_worker_restriction.restriction_link_p(dependent_link)) {
                                set_contents_var_$34 = inference_datastructures_problem.problem_dependent_links(supported_problem);
                                for (basis_object_$35 = set_contents.do_set_contents_basis_object(set_contents_var_$34), state_$36 = NIL, state_$36 = set_contents.do_set_contents_initial_state(basis_object_$35, set_contents_var_$34); NIL == set_contents.do_set_contents_doneP(basis_object_$35,
                                        state_$36); state_$36 = set_contents.do_set_contents_update_state(state_$36)) {
                                    jo_link = set_contents.do_set_contents_next(basis_object_$35, state_$36);
                                    if (NIL != set_contents.do_set_contents_element_validP(state_$36, jo_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link, $JOIN_ORDERED) && NIL != inference_datastructures_problem_link.problem_link_openP(jo_link)) {
                                        conjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem(jo_link);
                                        consider_that_problem_could_be_finished(conjunction_problem, NIL, strategic_context, T);
                                    }
                                }
                            }
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    mapped_problem = cdolist_list_var.first();
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 100500L)
    public static SubLObject strategy_note_problem_finished(SubLObject strategic_context, SubLObject problem) {
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 100600L)
    public static SubLObject note_argument_link_added(SubLObject link) {
        SubLObject prob;
        SubLObject supported_problem = prob = inference_datastructures_problem_link.problem_link_supported_problem(link);
        SubLObject store = inference_datastructures_problem.problem_store(prob);
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$37 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$37, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$37);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                SubLObject inference_var;
                SubLObject set_var;
                SubLObject set_contents_var;
                SubLObject basis_object;
                SubLObject state;
                SubLObject strategy;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                                    state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    inference_tactician.strategy_note_argument_link_added(strategy, link);
                                }
                            }
                        }
                    }
                }
            }
            SubLObject idx_$38 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$38)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$38);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference2)) {
                            SubLObject inference_var2 = inference2;
                            SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2,
                                    state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    inference_tactician.strategy_note_argument_link_added(strategy2, link);
                                }
                            }
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 100900L)
    public static SubLObject note_goal_link_added(SubLObject link) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject goal_proof = new_goal_proof(link);
        SubLObject newP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != newP) {
            bubble_up_proof(goal_proof);
        }
        return link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 101100L)
    public static SubLObject strategic_context_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_datastructures_strategy.strategy_p(v_object) || $TACTICAL == v_object);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 101300L)
    public static SubLObject strategic_context_suid(SubLObject v_object) {
        if ($TACTICAL == v_object) {
            return MINUS_ONE_INTEGER;
        }
        return inference_datastructures_strategy.strategy_suid(v_object);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 101400L)
    public static SubLObject find_strategic_context_by_id(SubLObject store, SubLObject strategic_context_suid) {
        if (MINUS_ONE_INTEGER.eql(strategic_context_suid)) {
            return $TACTICAL;
        }
        return inference_datastructures_problem_store.find_strategy_by_id(store, strategic_context_suid);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 101600L)
    public static SubLObject find_strategic_context_by_ids(SubLObject store_suid, SubLObject strategic_context_suid) {
        if (MINUS_ONE_INTEGER.eql(strategic_context_suid)) {
            return $TACTICAL;
        }
        return inference_datastructures_problem_store.find_strategy_by_ids(store_suid, strategic_context_suid);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 101900L)
    public static SubLObject strategic_context_may_modify_its_problem_storeP(SubLObject strategic_context) {
        return makeBoolean($TACTICAL == strategic_context || NIL != inference_datastructures_inference.inference_problem_store_privateP(inference_datastructures_strategy.strategy_inference(strategic_context)));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 102200L)
    public static SubLObject no_good_problem_p(SubLObject problem, SubLObject strategic_context) {
        if (NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
            return inference_datastructures_strategy.strategically_no_good_problem_p(problem, strategic_context);
        }
        return inference_datastructures_problem.tactically_no_good_problem_p(problem);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 102400L)
    public static SubLObject neutral_problem_p(SubLObject problem, SubLObject strategic_context) {
        if (NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
            return inference_datastructures_strategy.strategically_neutral_problem_p(problem, strategic_context);
        }
        return inference_datastructures_problem.tactically_neutral_problem_p(problem);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 102700L)
    public static SubLObject good_problem_p(SubLObject problem, SubLObject strategic_context) {
        return problem_goodP(problem);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 102800L)
    public static SubLObject examined_problem_p(SubLObject problem, SubLObject strategic_context) {
        if (NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
            return inference_datastructures_strategy.strategically_examined_problem_p(problem, strategic_context);
        }
        return inference_datastructures_problem.tactically_examined_problem_p(problem);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 103000L)
    public static SubLObject possible_problem_p(SubLObject problem, SubLObject strategic_context) {
        if (NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
            return inference_datastructures_strategy.strategically_possible_problem_p(problem, strategic_context);
        }
        return inference_datastructures_problem.tactically_possible_problem_p(problem);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 103300L)
    public static SubLObject pending_problem_p(SubLObject problem, SubLObject strategic_context) {
        if (NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
            return inference_datastructures_strategy.strategically_pending_problem_p(problem, strategic_context);
        }
        return inference_datastructures_problem.tactically_pending_problem_p(problem);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 103500L)
    public static SubLObject finished_problem_p(SubLObject problem, SubLObject strategic_context) {
        if (NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
            return inference_datastructures_strategy.strategically_finished_problem_p(problem, strategic_context);
        }
        return inference_datastructures_problem.tactically_finished_problem_p(problem);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 103700L)
    public static SubLObject potentially_possible_problem_p(SubLObject problem, SubLObject strategic_context) {
        if (NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
            return inference_datastructures_strategy.strategically_potentially_possible_problem_p(problem, strategic_context);
        }
        return inference_datastructures_problem.tactically_potentially_possible_problem_p(problem);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 104000L)
    public static SubLObject not_potentially_possible_problem_p(SubLObject problem, SubLObject strategic_context) {
        if (NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
            return inference_datastructures_strategy.strategically_not_potentially_possible_problem_p(problem, strategic_context);
        }
        return inference_datastructures_problem.tactically_not_potentially_possible_problem_p(problem);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 104300L)
    public static SubLObject totally_finished_problem_p(SubLObject problem, SubLObject strategic_context) {
        return finished_problem_p(problem, inference_tactician.controlling_strategic_context(strategic_context));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 105400L)
    public static SubLObject propagate_problem_link(SubLObject link) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $disable_link_propagationP$.getDynamicValue(thread)) {
            propagate_min_proof_depth_via_link(link);
            propagate_min_transformation_depth_via_link(link);
            inference_min_transformation_depth.propagate_min_transformation_depth_signature_via_link(link);
            propagate_strategy_activity(link);
            propagate_inference_relevance(link);
            note_argument_link_added(link);
            propagate_proofs(link);
            propagate_proof_spec(link);
            return link;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 106200L)
    public static SubLObject propagate_proofs(SubLObject link) {
        if (NIL != inference_datastructures_problem_link.problem_link_to_goal_p(link)) {
            note_goal_link_added(link);
        } else {
            SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
            SubLObject supporting_mapped_problem = NIL;
            supporting_mapped_problem = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link, supporting_mapped_problem) && NIL != link_permits_proof_propagationP(link, supporting_mapped_problem)) {
                    SubLObject cdolist_list_var_$39 = Sequences.nreverse(inference_datastructures_problem.all_problem_proofs(inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem), $PROVEN));
                    SubLObject proof = NIL;
                    proof = cdolist_list_var_$39.first();
                    while (NIL != cdolist_list_var_$39) {
                        if (NIL != inference_datastructures_proof.valid_proof_p(proof) && NIL != inference_datastructures_proof.proof_provenP(proof)) {
                            bubble_up_proof_to_link_via_variable_map(proof, inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem), link);
                        }
                        cdolist_list_var_$39 = cdolist_list_var_$39.rest();
                        proof = cdolist_list_var_$39.first();
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                supporting_mapped_problem = cdolist_list_var.first();
            }
        }
        return link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 107200L)
    public static SubLObject repropagate_newly_opened_link(SubLObject link, SubLObject mapped_supporting_problem) {
        propagate_strategy_activity(link);
        propagate_inference_relevance(link);
        propagate_proofs(link);
        propagate_proof_spec(link);
        return link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 107600L)
    public static SubLObject problem_link_open_and_repropagate_sole_supporting_mapped_problem(SubLObject link) {
        return problem_link_open_and_repropagate_index(link, ZERO_INTEGER);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 107700L)
    public static SubLObject problem_link_open_and_repropagate_index(SubLObject link, SubLObject index) {
        inference_datastructures_problem_link.problem_link_open_index(link, index);
        SubLObject supporting_mapped_problem = inference_datastructures_problem_link.problem_link_find_supporting_mapped_problem_by_index(link, index);
        repropagate_newly_opened_link(link, supporting_mapped_problem);
        return link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 108000L)
    public static SubLObject problem_link_open_and_repropagate_supporting_mapped_problem(SubLObject link, SubLObject supporting_mapped_problem) {
        inference_datastructures_problem_link.problem_link_open_supporting_mapped_problem(link, supporting_mapped_problem);
        repropagate_newly_opened_link(link, supporting_mapped_problem);
        return link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 108300L)
    public static SubLObject problem_link_open_and_repropagate_all(SubLObject link) {
        inference_datastructures_problem_link.problem_link_open_all(link);
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
        SubLObject supporting_mapped_problem = NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link, supporting_mapped_problem)) {
                repropagate_newly_opened_link(link, supporting_mapped_problem);
            }
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        }
        return link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 108600L)
    public static SubLObject propagate_answer_link(SubLObject link) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject inference = inference_datastructures_problem_link.problem_link_supported_inference(link);
        propagate_proof_spec_via_answer_link(link);
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
        SubLObject supporting_mapped_problem = NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link, supporting_mapped_problem)) {
                SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                inference_datastructures_problem.set_problem_min_proof_depth(supporting_problem, inference, ZERO_INTEGER);
                if (NIL == inference_datastructures_problem.$problem_min_transformation_depth_from_signature_enabledP$.getDynamicValue(thread)) {
                    inference_datastructures_problem.set_problem_min_transformation_depth(supporting_problem, inference, ZERO_INTEGER);
                }
                inference_datastructures_problem.set_root_problem_min_transformation_depth_signature(supporting_problem, inference);
                SubLObject status_var = $PROVEN;
                SubLObject iteration_state;
                for (iteration_state = dictionary_contents.do_dictionary_contents_state(inference_datastructures_problem.problem_proof_bindings_index(supporting_problem)); NIL == dictionary_contents.do_dictionary_contents_doneP(
                        iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                    thread.resetMultipleValues();
                    SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    SubLObject proof_list = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject cdolist_list_var_$40 = proof_list;
                    SubLObject proof = NIL;
                    proof = cdolist_list_var_$40.first();
                    while (NIL != cdolist_list_var_$40) {
                        if (NIL != inference_datastructures_problem.proof_has_statusP(proof, status_var)) {
                            propagate_proof_to_inference(proof, inference);
                        }
                        cdolist_list_var_$40 = cdolist_list_var_$40.rest();
                        proof = cdolist_list_var_$40.first();
                    }
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                SubLObject cdolist_list_var_$41 = inference_strategist.inference_initial_relevant_strategies(inference);
                SubLObject strategy = NIL;
                strategy = cdolist_list_var_$41.first();
                while (NIL != cdolist_list_var_$41) {
                    maybe_possibly_activate_problem(strategy, supporting_problem);
                    cdolist_list_var_$41 = cdolist_list_var_$41.rest();
                    strategy = cdolist_list_var_$41.first();
                }
                possibly_note_problem_relevant(inference, supporting_problem);
            }
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        }
        inference_worker_answer.note_answer_link_propagated(link);
        return link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 109800L)
    public static SubLObject possibly_propagate_answer_link(SubLObject link) {
        if (NIL == inference_worker_answer.answer_link_propagatedP(link)) {
            propagate_answer_link(link);
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 110000L)
    public static SubLObject propagate_proof_to_inference(SubLObject proof, SubLObject inference) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $eager_proof_validationP$.getDynamicValue(thread) || NIL != proof_tree_validP(proof)) {
            inference_strategist.inference_note_proof(inference, proof);
            consider_closing_answer_link(inference_datastructures_inference.inference_root_link(inference));
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 110400L)
    public static SubLObject consider_closing_answer_link(SubLObject answer_link) {
        SubLObject inference = inference_worker_answer.answer_link_supported_inference(answer_link);
        SubLObject should_closeP = inference_deems_answer_link_should_be_closedP(inference, answer_link);
        if (NIL != should_closeP) {
            close_answer_link(answer_link);
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 110800L)
    public static SubLObject inference_deems_answer_link_should_be_closedP(SubLObject inference, SubLObject answer_link) {
        SubLObject root_mapped_problem = inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem(answer_link);
        SubLObject root_problem = inference_datastructures_problem_link.mapped_problem_problem(root_mapped_problem);
        SubLObject set_var = inference_datastructures_inference.inference_strategy_set(inference);
        SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject strategy;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            strategy = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, strategy) && NIL == inference_tactician_strategic_uninterestingness.strategy_has_enough_proofs_for_problemP(strategy, root_problem)) {
                return NIL;
            }
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 111400L)
    public static SubLObject close_answer_link(SubLObject answer_link) {
        inference_datastructures_problem_link.problem_link_close_sole_supporting_mapped_problem(answer_link);
        inference_datastructures_inference.clear_inference_relevant_problems(inference_worker_answer.answer_link_supported_inference(answer_link));
        return answer_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 111600L)
    public static SubLObject proof_tree_validP(SubLObject proof) {
        if ($NONE == inference_datastructures_problem_store.problem_store_intermediate_step_validation_level(inference_datastructures_proof.proof_store(proof))) {
            return T;
        }
        return recursive_proof_tree_validP(proof);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 111900L)
    public static SubLObject recursive_proof_tree_validP(SubLObject proof) {
        SubLObject validP = intermediate_proof_validP(proof);
        if (NIL == validP) {
            reject_proof_due_to_ill_formedness(proof);
            return NIL;
        }
        SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
        SubLObject subproof = NIL;
        subproof = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == recursive_proof_tree_validP(subproof)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            subproof = cdolist_list_var.first();
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 112300L)
    public static SubLObject depth_L(SubLObject depth1, SubLObject depth2) {
        if (NIL == subl_promotions.non_negative_integer_p(depth1)) {
            return NIL;
        }
        if (NIL != subl_promotions.non_negative_integer_p(depth2)) {
            return Numbers.numL(depth1, depth2);
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 112700L)
    public static SubLObject depth_LE(SubLObject depth1, SubLObject depth2) {
        if (NIL == subl_promotions.non_negative_integer_p(depth1)) {
            return NIL;
        }
        if (NIL != subl_promotions.non_negative_integer_p(depth2)) {
            return Numbers.numLE(depth1, depth2);
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 113100L)
    public static SubLObject propagate_min_proof_depth_via_link(SubLObject link) {
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(inference_datastructures_problem_link.problem_link_store(link));
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$42 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$42, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$42);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        propagate_min_proof_depth_via_link_wrt_inference(link, inference);
                    }
                }
            }
            SubLObject idx_$43 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$43)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$43);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        propagate_min_proof_depth_via_link_wrt_inference(link, inference2);
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 113300L)
    public static SubLObject propagate_min_proof_depth_via_link_wrt_inference(SubLObject link, SubLObject inference) {
        SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
        SubLObject parent_depth = inference_datastructures_problem.problem_min_proof_depth(supported_problem, inference);
        if (NIL != subl_promotions.non_negative_integer_p(parent_depth)) {
            SubLObject supporting_problem_count = inference_datastructures_problem_link.problem_link_number_of_supporting_problems(link);
            if (ONE_INTEGER.numE(supporting_problem_count) && NIL != inference_worker_join_ordered.join_ordered_link_p(link)) {
                supporting_problem_count = TWO_INTEGER;
            }
            if (supporting_problem_count.isPositive()) {
                SubLObject content_increment = (NIL != content_link_p(link)) ? ONE_INTEGER : ZERO_INTEGER;
                SubLObject sibling_increment = number_utilities.f_1_(supporting_problem_count);
                SubLObject increment = Numbers.add(content_increment, sibling_increment);
                SubLObject propagated_child_depth = Numbers.add(parent_depth, increment);
                SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
                SubLObject supporting_mapped_problem = NIL;
                supporting_mapped_problem = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link, supporting_mapped_problem)) {
                        SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                        SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                        SubLObject child_depth = inference_datastructures_problem.problem_min_proof_depth(supporting_problem, inference);
                        if (NIL != proof_depth_L(propagated_child_depth, child_depth)) {
                            inference_datastructures_problem.set_problem_min_proof_depth(supporting_problem, inference, propagated_child_depth);
                            SubLObject prob = supporting_problem;
                            SubLObject store = inference_datastructures_problem.problem_store(prob);
                            SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
                            if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
                                SubLObject idx_$44 = idx;
                                if (NIL == id_index.id_index_dense_objects_empty_p(idx_$44, $SKIP)) {
                                    SubLObject vector_var = id_index.id_index_dense_objects(idx_$44);
                                    SubLObject backwardP_var = NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject id;
                                    SubLObject inference_$45;
                                    SubLObject inference_var;
                                    SubLObject set_var;
                                    SubLObject set_contents_var;
                                    SubLObject basis_object;
                                    SubLObject state;
                                    SubLObject strategy;
                                    for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                                        id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                                        inference_$45 = Vectors.aref(vector_var, id);
                                        if (NIL == id_index.id_index_tombstone_p(inference_$45) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                                            if (NIL != id_index.id_index_tombstone_p(inference_$45)) {
                                                inference_$45 = $SKIP;
                                            }
                                            if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference_$45)) {
                                                inference_var = inference_$45;
                                                set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                                                set_contents_var = set.do_set_internal(set_var);
                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                                                        state); state = set_contents.do_set_contents_update_state(state)) {
                                                    strategy = set_contents.do_set_contents_next(basis_object, state);
                                                    if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                                        inference_datastructures_strategy.set_problem_recompute_thrown_away(supporting_problem, strategy);
                                                        inference_datastructures_strategy.set_problem_recompute_set_aside(supporting_problem, strategy);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SubLObject idx_$45 = idx;
                                if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$45)) {
                                    SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$45);
                                    SubLObject id2 = NIL;
                                    SubLObject inference_$46 = NIL;
                                    Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                                    try {
                                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                                            Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                                            id2 = Hashtables.getEntryKey(cdohash_entry);
                                            inference_$46 = Hashtables.getEntryValue(cdohash_entry);
                                            if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference_$46)) {
                                                SubLObject inference_var2 = inference_$46;
                                                SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                                                SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                                                SubLObject basis_object2;
                                                SubLObject state2;
                                                SubLObject strategy2;
                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2,
                                                        state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                    strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                                    if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                                        inference_datastructures_strategy.set_problem_recompute_thrown_away(supporting_problem, strategy2);
                                                        inference_datastructures_strategy.set_problem_recompute_set_aside(supporting_problem, strategy2);
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                                    }
                                }
                            }
                            SubLObject set_contents_var3 = inference_datastructures_problem.problem_argument_links(supporting_problem);
                            SubLObject basis_object3;
                            SubLObject state3;
                            SubLObject argument_link;
                            for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3,
                                    state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                argument_link = set_contents.do_set_contents_next(basis_object3, state3);
                                if (NIL != set_contents.do_set_contents_element_validP(state3, argument_link)) {
                                    propagate_min_proof_depth_via_link_wrt_inference(argument_link, inference);
                                }
                            }
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    supporting_mapped_problem = cdolist_list_var.first();
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 115200L)
    public static SubLObject proof_depth_L(SubLObject depth1, SubLObject depth2) {
        return depth_L(depth1, depth2);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 115300L)
    public static SubLObject problem_strictly_within_max_proof_depthP(SubLObject inference, SubLObject problem) {
        SubLObject max_proof_depth = inference_datastructures_inference.inference_max_proof_depth(inference);
        if (NIL != max_proof_depth) {
            SubLObject proof_depth = inference_datastructures_problem.problem_min_proof_depth(problem, inference);
            if (proof_depth.isNumber() && NIL == proof_depth_L(proof_depth, max_proof_depth)) {
                return NIL;
            }
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 115800L)
    public static SubLObject propagate_min_transformation_depth_via_link(SubLObject link) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != inference_datastructures_problem.$problem_min_transformation_depth_from_signature_enabledP$.getDynamicValue(thread)) {
            return NIL;
        }
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(inference_datastructures_problem_link.problem_link_store(link));
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$48 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$48, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$48);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        propagate_min_transformation_depth_via_link_wrt_inference(link, inference);
                    }
                }
            }
            SubLObject idx_$49 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$49)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$49);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        propagate_min_transformation_depth_via_link_wrt_inference(link, inference2);
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 116100L)
    public static SubLObject propagate_min_transformation_depth_via_link_wrt_inference(SubLObject link, SubLObject inference) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != inference_datastructures_problem.$problem_min_transformation_depth_from_signature_enabledP$.getDynamicValue(thread)) {
            return NIL;
        }
        SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
        SubLObject parent_depth = inference_datastructures_problem.problem_min_transformation_depth(supported_problem, inference);
        if (NIL != subl_promotions.non_negative_integer_p(parent_depth) && NIL != inference_datastructures_problem_link.problem_link_with_supporting_problem_p(link)) {
            SubLObject increment = transformation_depth_increment(link, inference);
            if (NIL != subl_promotions.non_negative_integer_p(increment)) {
                SubLObject propagated_child_depth = Numbers.add(parent_depth, increment);
                SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
                SubLObject supporting_mapped_problem = NIL;
                supporting_mapped_problem = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link, supporting_mapped_problem)) {
                        SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                        SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                        SubLObject child_depth = inference_datastructures_problem.problem_min_transformation_depth(supporting_problem, inference);
                        if (NIL != transformation_depth_L(propagated_child_depth, child_depth)) {
                            inference_datastructures_problem.set_problem_min_transformation_depth(supporting_problem, inference, propagated_child_depth);
                            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(supporting_problem);
                            SubLObject basis_object;
                            SubLObject state;
                            SubLObject argument_link;
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                                    state); state = set_contents.do_set_contents_update_state(state)) {
                                argument_link = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, argument_link)) {
                                    propagate_min_transformation_depth_via_link_wrt_inference(argument_link, inference);
                                }
                            }
                            if (NIL != inference_worker_transformation.transformation_link_p(link)) {
                                SubLObject supported_problem_$50 = inference_datastructures_problem_link.problem_link_supported_problem(link);
                                SubLObject set_contents_var2 = inference_datastructures_problem.problem_dependent_links(supported_problem_$50);
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject jo_link_var;
                                SubLObject jo_link_var_$51;
                                SubLObject motivating_conjunction_problem;
                                SubLObject set_contents_var_$52;
                                SubLObject basis_object_$53;
                                SubLObject state_$54;
                                SubLObject rt_link;
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2,
                                        state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    jo_link_var = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (NIL != set_contents.do_set_contents_element_validP(state2, jo_link_var) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link_var, $JOIN_ORDERED)) {
                                        jo_link_var_$51 = jo_link_var;
                                        motivating_conjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem(jo_link_var_$51);
                                        set_contents_var_$52 = inference_datastructures_problem.problem_argument_links(motivating_conjunction_problem);
                                        for (basis_object_$53 = set_contents.do_set_contents_basis_object(set_contents_var_$52), state_$54 = NIL, state_$54 = set_contents.do_set_contents_initial_state(basis_object_$53,
                                                set_contents_var_$52); NIL == set_contents.do_set_contents_doneP(basis_object_$53, state_$54); state_$54 = set_contents.do_set_contents_update_state(state_$54)) {
                                            rt_link = set_contents.do_set_contents_next(basis_object_$53, state_$54);
                                            if (NIL != set_contents.do_set_contents_element_validP(state_$54, rt_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(rt_link, $RESIDUAL_TRANSFORMATION)
                                                    && NIL != inference_worker_residual_transformation.residual_transformation_link_motivated_by_join_ordered_linkP(rt_link, jo_link_var_$51)
                                                    && NIL != inference_worker_residual_transformation.residual_transformation_link_motivated_by_transformation_linkP(rt_link, link)) {
                                                propagate_min_transformation_depth_via_link_wrt_inference(rt_link, inference);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    supporting_mapped_problem = cdolist_list_var.first();
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 117800L)
    public static SubLObject clear_uninterestingness_cache_wrt_transformation(SubLObject problem, SubLObject inference) {
        SubLObject controlling_strategy = inference_datastructures_inference.simplest_inference_strategy(inference);
        if (NIL != balancing_tactician.balancing_tactician_p(controlling_strategy)) {
            SubLObject t_strategy = balancing_tactician.balancing_tactician_transformation_substrategy(controlling_strategy);
            inference_datastructures_strategy.set_problem_recompute_thrown_away(problem, t_strategy);
            inference_datastructures_strategy.set_problem_recompute_set_aside(problem, t_strategy);
            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
            SubLObject transformation_tactic = NIL;
            transformation_tactic = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(transformation_tactic, $TRANSFORMATION)) {
                    inference_datastructures_strategy.set_tactic_recompute_thrown_away(transformation_tactic, t_strategy);
                    inference_datastructures_strategy.set_tactic_recompute_set_aside(transformation_tactic, t_strategy);
                }
                cdolist_list_var = cdolist_list_var.rest();
                transformation_tactic = cdolist_list_var.first();
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 118500L)
    public static SubLObject transformation_depth_L(SubLObject depth1, SubLObject depth2) {
        return depth_L(depth1, depth2);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 118500L)
    public static SubLObject transformation_depth_LE(SubLObject depth1, SubLObject depth2) {
        return depth_LE(depth1, depth2);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 118600L)
    public static SubLObject problem_strictly_within_max_transformation_depthP(SubLObject inference, SubLObject problem) {
        SubLObject max_transformation_depth = inference_datastructures_inference.inference_max_transformation_depth(inference);
        if (NIL != max_transformation_depth) {
            SubLObject transformation_depth = inference_datastructures_problem.problem_min_transformation_depth(problem, inference);
            if (transformation_depth.isNumber() && NIL == transformation_depth_L(transformation_depth, max_transformation_depth)) {
                return NIL;
            }
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 119200L)
    public static SubLObject problem_transformation_allowed_wrt_max_transformation_depthP(SubLObject inference, SubLObject problem) {
        return problem_strictly_within_max_transformation_depthP(inference, problem);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 119500L)
    public static SubLObject logical_tactic_transformation_allowed_wrt_max_transformation_depthP(SubLObject inference, SubLObject logical_tactic) {
        SubLObject problem = inference_datastructures_tactic.tactic_problem(logical_tactic);
        if (NIL == problem_transformation_allowed_wrt_max_transformation_depthP(inference, problem)) {
            return NIL;
        }
        if (NIL != inference_worker_join.join_tactic_p(logical_tactic)) {
            return NIL;
        }
        SubLObject max_transformation_depth = inference_datastructures_inference.inference_max_transformation_depth(inference);
        if (NIL == max_transformation_depth) {
            return T;
        }
        if (max_transformation_depth.isZero()) {
            return NIL;
        }
        SubLObject transformation_depth = inference_min_transformation_depth.logical_tactic_lookahead_min_transformation_depth(logical_tactic, inference);
        if (!transformation_depth.isNumber()) {
            return T;
        }
        return transformation_depth_L(transformation_depth, max_transformation_depth);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 120800L)
    public static SubLObject transformation_depth_increment(SubLObject link, SubLObject inference) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != inference_worker_transformation.transformation_link_p(link)) {
            return ONE_INTEGER;
        }
        if (NIL == inference_worker_residual_transformation.residual_transformation_link_p(link)) {
            return ZERO_INTEGER;
        }
        if ($INTUITIVE == inference_datastructures_problem.$transformation_depth_computation$.getDynamicValue(thread)) {
            return ONE_INTEGER;
        }
        SubLObject parent_depth = inference_datastructures_problem.problem_min_transformation_depth(inference_datastructures_problem_link.problem_link_supported_problem(link), inference);
        SubLObject motivating_t_link = inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(link);
        SubLObject transformed_literal_depth = inference_datastructures_problem.problem_min_transformation_depth(inference_datastructures_problem_link.problem_link_supported_problem(motivating_t_link), inference);
        if (NIL == subl_promotions.non_negative_integer_p(transformed_literal_depth)) {
            return $UNDETERMINED;
        }
        if (transformed_literal_depth.numL(parent_depth)) {
            return ZERO_INTEGER;
        }
        return Numbers.subtract(number_utilities.f_1X(transformed_literal_depth), parent_depth);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 121800L)
    public static SubLObject problem_has_been_transformedP(SubLObject problem, SubLObject inference) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject _prev_bind_0 = inference_datastructures_problem.$transformation_depth_computation$.currentBinding(thread);
        try {
            inference_datastructures_problem.$transformation_depth_computation$.bind($INTUITIVE, thread);
            result = subl_promotions.positive_integer_p(inference_datastructures_problem.problem_min_transformation_depth(problem, inference));
        } finally {
            inference_datastructures_problem.$transformation_depth_computation$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 122000L)
    public static SubLObject propagate_strategy_activity(SubLObject link) {
        SubLObject prob;
        SubLObject supported_problem = prob = inference_datastructures_problem_link.problem_link_supported_problem(link);
        SubLObject store = inference_datastructures_problem.problem_store(prob);
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$55 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$55, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$55);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                SubLObject inference_var;
                SubLObject set_var;
                SubLObject set_contents_var;
                SubLObject basis_object;
                SubLObject state;
                SubLObject strategy;
                SubLObject cdolist_list_var;
                SubLObject supporting_mapped_problem;
                SubLObject supporting_problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                                    state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
                                    supporting_mapped_problem = NIL;
                                    supporting_mapped_problem = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link, supporting_mapped_problem) && NIL != link_permits_activity_propagationP(link, supporting_mapped_problem)) {
                                            supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                                            maybe_possibly_activate_problem(strategy, supporting_problem);
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        supporting_mapped_problem = cdolist_list_var.first();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            SubLObject idx_$56 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$56)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$56);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference2)) {
                            SubLObject inference_var2 = inference2;
                            SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            SubLObject cdolist_list_var2;
                            SubLObject supporting_mapped_problem2;
                            SubLObject supporting_problem2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2,
                                    state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    cdolist_list_var2 = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
                                    supporting_mapped_problem2 = NIL;
                                    supporting_mapped_problem2 = cdolist_list_var2.first();
                                    while (NIL != cdolist_list_var2) {
                                        if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link, supporting_mapped_problem2) && NIL != link_permits_activity_propagationP(link, supporting_mapped_problem2)) {
                                            supporting_problem2 = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem2);
                                            maybe_possibly_activate_problem(strategy2, supporting_problem2);
                                        }
                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                        supporting_mapped_problem2 = cdolist_list_var2.first();
                                    }
                                }
                            }
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 122500L)
    public static SubLObject maybe_possibly_activate_problem(SubLObject strategy, SubLObject problem) {
        if (NIL == inference_datastructures_strategy.problem_active_in_strategyP(problem, strategy) && NIL != possibly_activate_problem(strategy, problem)) {
            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject argument_link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                    state); state = set_contents.do_set_contents_update_state(state)) {
                argument_link = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, argument_link)) {
                    propagate_strategy_activity(argument_link);
                }
            }
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 123000L)
    public static SubLObject link_permits_activity_propagationP(SubLObject link, SubLObject supporting_mapped_problem) {
        return inference_datastructures_problem_link.problem_link_supporting_mapped_problem_openP(link, supporting_mapped_problem);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 123200L)
    public static SubLObject propagate_inference_relevance(SubLObject link) {
        SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
        SubLObject supporting_mapped_problem = NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link, supporting_mapped_problem) && NIL != link_permits_relevance_propagationP(link, supporting_mapped_problem)) {
                SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                propagate_relevance_to_supporting_problem(supported_problem, supporting_problem);
            }
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 123700L)
    public static SubLObject propagate_relevance_to_supporting_problem(SubLObject problem, SubLObject supporting_problem) {
        SubLObject store = inference_datastructures_problem.problem_store(problem);
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$57 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$57, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$57);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                            possibly_note_problem_relevant(inference, supporting_problem);
                        }
                    }
                }
            }
            SubLObject idx_$58 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$58)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$58);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                            possibly_note_problem_relevant(inference2, supporting_problem);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 124000L)
    public static SubLObject possibly_note_problem_relevant(SubLObject inference, SubLObject problem) {
        if (NIL == inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
            inference_datastructures_inference.add_inference_relevant_problem(inference, problem);
            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject argument_link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                    state); state = set_contents.do_set_contents_update_state(state)) {
                argument_link = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, argument_link)) {
                    if (NIL != inference_worker_rewrite.rewrite_link_p(argument_link)) {
                        inference_datastructures_strategy.set_problem_tactics_recompute_thrown_away_wrt_all_relevant_strategies(inference_datastructures_problem_link.problem_link_sole_supporting_problem(argument_link));
                    }
                    propagate_inference_relevance(argument_link);
                }
            }
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 124500L)
    public static SubLObject link_permits_relevance_propagationP(SubLObject link, SubLObject supporting_mapped_problem) {
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 124800L)
    public static SubLObject link_permits_proof_propagationP(SubLObject link, SubLObject supporting_mapped_problem) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(NIL != inference_datastructures_problem_link.problem_link_supporting_mapped_problem_openP(link, supporting_mapped_problem)
                || (NIL != inference_worker_join_ordered.join_ordered_link_p(link) && NIL != inference_worker_join_ordered.join_ordered_link_has_non_focal_mapped_problemP(link)
                        && NIL != inference_datastructures_problem_link.mapped_problem_equal(supporting_mapped_problem, inference_worker_join_ordered.join_ordered_link_non_focal_mapped_problem(link)))
                || (NIL != inference_worker_join_ordered.join_ordered_link_p(link)
                        && NIL != Sequences.find_if($sym132$UNION_LINK_P, inference_datastructures_problem.problem_all_dependent_links(inference_datastructures_problem_link.problem_link_supported_problem(link)), UNPROVIDED, UNPROVIDED, UNPROVIDED))
                || (NIL != $bubble_up_proofs_through_closed_split_linksP$.getDynamicValue(thread) && NIL != inference_worker_split.split_link_p(link)));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 125700L)
    public static SubLObject consider_that_mapped_problem_could_be_irrelevant(SubLObject mapped_problem, SubLObject dependent_link) {
        if (NIL != link_permits_relevance_propagationP(dependent_link, mapped_problem)) {
            SubLObject prob;
            SubLObject problem = prob = inference_datastructures_problem_link.mapped_problem_problem(mapped_problem);
            SubLObject store = inference_datastructures_problem.problem_store(prob);
            SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
            if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
                SubLObject idx_$59 = idx;
                if (NIL == id_index.id_index_dense_objects_empty_p(idx_$59, $SKIP)) {
                    SubLObject vector_var = id_index.id_index_dense_objects(idx_$59);
                    SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject inference;
                    for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                        id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                        inference = Vectors.aref(vector_var, id);
                        if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                            if (NIL != id_index.id_index_tombstone_p(inference)) {
                                inference = $SKIP;
                            }
                            if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference)) {
                                consider_that_problem_could_be_irrelevant_to_inference(problem, inference);
                            }
                        }
                    }
                }
                SubLObject idx_$60 = idx;
                if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$60)) {
                    SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$60);
                    SubLObject id2 = NIL;
                    SubLObject inference2 = NIL;
                    Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            inference2 = Hashtables.getEntryValue(cdohash_entry);
                            if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference2)) {
                                consider_that_problem_could_be_irrelevant_to_inference(problem, inference2);
                            }
                        }
                    } finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 126200L)
    public static SubLObject consider_that_problem_could_be_irrelevant_to_inference(SubLObject problem, SubLObject inference) {
        if (NIL != problem_irrelevant_to_inferenceP(problem, inference)) {
            maybe_make_problem_irrelevant_to_inference(inference, problem);
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 126500L)
    public static SubLObject problem_irrelevant_to_inferenceP(SubLObject problem, SubLObject inference) {
        if (NIL != inference_datastructures_problem_link.problem_link_closedP(inference_datastructures_inference.inference_root_link(inference))) {
            return T;
        }
        SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject dependent_link;
        SubLObject link_var;
        SubLObject cdolist_list_var;
        SubLObject supporting_mapped_problem;
        SubLObject supported_problem;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            dependent_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, dependent_link)) {
                link_var = dependent_link;
                cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                supporting_mapped_problem = NIL;
                supporting_mapped_problem = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem) && problem.eql(inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem))
                            && NIL != link_permits_relevance_propagationP(dependent_link, supporting_mapped_problem)) {
                        if (NIL != inference_worker_answer.answer_link_p(dependent_link)) {
                            if (inference.eql(inference_datastructures_problem_link.problem_link_supported_inference(dependent_link))) {
                                return NIL;
                            }
                        } else {
                            supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(dependent_link);
                            if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(supported_problem, inference)) {
                                return NIL;
                            }
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    supporting_mapped_problem = cdolist_list_var.first();
                }
            }
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 127600L)
    public static SubLObject maybe_make_problem_irrelevant_to_inference(SubLObject inference, SubLObject problem) {
        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
            make_problem_irrelevant_to_inference(inference, problem);
            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject argument_link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                    state); state = set_contents.do_set_contents_update_state(state)) {
                argument_link = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, argument_link)) {
                    propagate_inference_irrelevance(inference, argument_link);
                }
            }
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 128100L)
    public static SubLObject make_problem_irrelevant_to_inference(SubLObject inference, SubLObject problem) {
        inference_datastructures_inference.remove_inference_relevant_problem(inference, problem);
        SubLObject set_var = inference_datastructures_inference.inference_strategy_set(inference);
        SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject strategy;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            strategy = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                inference_datastructures_strategy.set_problem_recompute_set_aside(problem, strategy);
                inference_datastructures_strategy.set_problem_recompute_thrown_away(problem, strategy);
                if (NIL != inference_datastructures_strategy.problem_set_aside_in_strategyP(problem, strategy)) {
                    inference_datastructures_strategy.strategy_clear_problem_set_aside(strategy, problem);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 128500L)
    public static SubLObject propagate_inference_irrelevance(SubLObject inference, SubLObject link) {
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
        SubLObject supporting_mapped_problem = NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link, supporting_mapped_problem) && NIL != link_permits_relevance_propagationP(link, supporting_mapped_problem)) {
                consider_that_problem_could_be_irrelevant_to_inference(inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem), inference);
            }
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 128900L)
    public static SubLObject problem_raw_tactical_or_strategic_status(SubLObject problem, SubLObject strategic_context) {
        assert NIL != strategic_context_p(strategic_context) : strategic_context;
        return (NIL != inference_datastructures_strategy.strategy_p(strategic_context)) ? inference_datastructures_strategy.problem_raw_strategic_status(problem, strategic_context) : inference_datastructures_problem.problem_status(problem);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 129400L)
    public static SubLObject set_problem_raw_tactical_or_strategic_status(SubLObject problem, SubLObject strategic_context, SubLObject status) {
        assert NIL != strategic_context_p(strategic_context) : strategic_context;
        if (NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
            inference_datastructures_strategy.set_problem_raw_strategic_status(problem, strategic_context, status);
        } else {
            inference_datastructures_problem.set_problem_status(problem, status);
        }
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 130100L)
    public static SubLObject change_and_propagate_problem_status(SubLObject problem, SubLObject new_status, SubLObject consider_deepP, SubLObject strategic_context) {
        SubLObject old_status = problem_raw_tactical_or_strategic_status(problem, strategic_context);
        if (old_status.eql(new_status)) {
            Errors.error($str133$Uninteresting_problem_status_chan, problem, old_status, new_status);
        } else {
            change_and_propagate_problem_status_int(problem, old_status, new_status, consider_deepP, strategic_context);
        }
        if (NIL != inference_tactician.substrategyP(strategic_context)) {
            inference_datastructures_strategy.controlling_strategy_callback(strategic_context, $SUBSTRATEGY_PROBLEM_STATUS_CHANGE, problem, old_status, new_status, UNPROVIDED);
        }
        if (NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
            inference_datastructures_strategy.set_problem_recompute_thrown_away(problem, strategic_context);
            inference_datastructures_strategy.set_problem_tactics_recompute_thrown_away(problem, strategic_context);
            inference_datastructures_strategy.set_problem_recompute_set_aside(problem, strategic_context);
            inference_datastructures_strategy.set_problem_tactics_recompute_set_aside(problem, strategic_context);
        } else {
            SubLObject store = inference_datastructures_problem.problem_store(problem);
            SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
            if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
                SubLObject idx_$61 = idx;
                if (NIL == id_index.id_index_dense_objects_empty_p(idx_$61, $SKIP)) {
                    SubLObject vector_var = id_index.id_index_dense_objects(idx_$61);
                    SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject inference;
                    SubLObject inference_var;
                    SubLObject set_var;
                    SubLObject set_contents_var;
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject strategy;
                    for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                        id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                        inference = Vectors.aref(vector_var, id);
                        if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                            if (NIL != id_index.id_index_tombstone_p(inference)) {
                                inference = $SKIP;
                            }
                            if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                                inference_var = inference;
                                set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                                set_contents_var = set.do_set_internal(set_var);
                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                                        state); state = set_contents.do_set_contents_update_state(state)) {
                                    strategy = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                        inference_datastructures_strategy.set_problem_recompute_thrown_away(problem, strategy);
                                        inference_datastructures_strategy.set_problem_tactics_recompute_thrown_away(problem, strategy);
                                        inference_datastructures_strategy.set_problem_recompute_set_aside(problem, strategy);
                                        inference_datastructures_strategy.set_problem_tactics_recompute_set_aside(problem, strategy);
                                    }
                                }
                            }
                        }
                    }
                }
                SubLObject idx_$62 = idx;
                if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$62)) {
                    SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$62);
                    SubLObject id2 = NIL;
                    SubLObject inference2 = NIL;
                    Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            inference2 = Hashtables.getEntryValue(cdohash_entry);
                            if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                                SubLObject inference_var2 = inference2;
                                SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                                SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject strategy2;
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2,
                                        state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                        inference_datastructures_strategy.set_problem_recompute_thrown_away(problem, strategy2);
                                        inference_datastructures_strategy.set_problem_tactics_recompute_thrown_away(problem, strategy2);
                                        inference_datastructures_strategy.set_problem_recompute_set_aside(problem, strategy2);
                                        inference_datastructures_strategy.set_problem_tactics_recompute_set_aside(problem, strategy2);
                                    }
                                }
                            }
                        }
                    } finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
        }
        if (NIL != problem && NIL != inference_datastructures_problem.problem_has_no_tacticsP(problem) && NIL != possible_problem_p(problem, strategic_context)) {
            Errors.error($str135$possible_problem_with_no_tactics_, problem, strategic_context);
        }
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 132200L)
    public static SubLObject change_and_propagate_problem_status_int(SubLObject problem, SubLObject old_status, SubLObject new_status, SubLObject consider_deepP, SubLObject strategic_context) {
        if (old_status.eql($NEW)) {
            if (new_status.eql($UNEXAMINED)) {
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
        } else if (old_status.eql($UNEXAMINED)) {
            if (new_status.eql($UNEXAMINED_GOOD)) {
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
            if (new_status.eql($UNEXAMINED_NO_GOOD)) {
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
            if (new_status.eql($EXAMINED)) {
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
        } else if (old_status.eql($UNEXAMINED_GOOD)) {
            if (new_status.eql($EXAMINED_GOOD)) {
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
            if (new_status.eql($UNEXAMINED)) {
                set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                if ($TACTICAL == strategic_context) {
                    inference_metrics.decrement_good_problem_historical_count();
                }
                consider_that_problem_could_be_no_good(problem, consider_deepP, strategic_context, T);
                return problem;
            }
        } else if (old_status.eql($UNEXAMINED_NO_GOOD)) {
            if (new_status.eql($EXAMINED_NO_GOOD)) {
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
            if (new_status.eql($UNEXAMINED_GOOD)) {
                return set_problem_raw_status_if_strategic(problem, strategic_context, old_status, new_status, NIL);
            }
        } else if (old_status.eql($EXAMINED)) {
            if (new_status.eql($EXAMINED_GOOD)) {
                set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                if ($TACTICAL == strategic_context) {
                    inference_metrics.increment_good_problem_historical_count();
                }
                return problem;
            }
            if (new_status.eql($EXAMINED_NO_GOOD)) {
                set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                if ($TACTICAL == strategic_context) {
                    inference_metrics.increment_no_good_problem_historical_count();
                }
                consider_that_supported_problems_could_be_no_good(problem, consider_deepP, strategic_context);
                return problem;
            }
            if (new_status.eql($POSSIBLE)) {
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
            if (new_status.eql($PENDING)) {
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
            if (new_status.eql($UNEXAMINED)) {
                return set_problem_raw_status_if_strategic(problem, strategic_context, old_status, new_status, T);
            }
        } else if (old_status.eql($EXAMINED_GOOD)) {
            if (new_status.eql($POSSIBLE_GOOD)) {
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
            if (new_status.eql($EXAMINED)) {
                set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                if ($TACTICAL == strategic_context) {
                    inference_metrics.decrement_good_problem_historical_count();
                }
                consider_that_problem_could_be_no_good(problem, consider_deepP, strategic_context, T);
                return problem;
            }
            if (new_status.eql($PENDING_GOOD)) {
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
            if (new_status.eql($UNEXAMINED_GOOD)) {
                return set_problem_raw_status_if_strategic(problem, strategic_context, old_status, new_status, T);
            }
        } else if (old_status.eql($EXAMINED_NO_GOOD)) {
            if (new_status.eql($EXAMINED_GOOD)) {
                return set_problem_raw_status_if_strategic(problem, strategic_context, old_status, new_status, NIL);
            }
            if (new_status.eql($PENDING_NO_GOOD)) {
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
        } else if (old_status.eql($POSSIBLE)) {
            if (new_status.eql($POSSIBLE_GOOD)) {
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
            if (new_status.eql($PENDING)) {
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
            if (new_status.eql($UNEXAMINED)) {
                return set_problem_raw_status_if_strategic(problem, strategic_context, old_status, new_status, T);
            }
        } else if (old_status.eql($POSSIBLE_GOOD)) {
            if (new_status.eql($PENDING_GOOD)) {
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
            if (new_status.eql($POSSIBLE)) {
                set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                if ($TACTICAL == strategic_context) {
                    inference_metrics.decrement_good_problem_historical_count();
                }
                consider_that_problem_could_be_no_good(problem, consider_deepP, strategic_context, T);
                return problem;
            }
            if (new_status.eql($UNEXAMINED_GOOD)) {
                return set_problem_raw_status_if_strategic(problem, strategic_context, old_status, new_status, T);
            }
        } else if (old_status.eql($PENDING)) {
            if (new_status.eql($PENDING_GOOD)) {
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
            if (new_status.eql($PENDING_NO_GOOD)) {
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
            if (new_status.eql($FINISHED)) {
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
            if (new_status.eql($UNEXAMINED)) {
                return set_problem_raw_status_if_strategic(problem, strategic_context, old_status, new_status, T);
            }
        } else if (old_status.eql($PENDING_GOOD)) {
            if (new_status.eql($PENDING)) {
                set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                if ($TACTICAL == strategic_context) {
                    inference_metrics.decrement_good_problem_historical_count();
                }
                consider_that_problem_could_be_no_good(problem, consider_deepP, strategic_context, T);
                return problem;
            }
            if (new_status.eql($FINISHED_GOOD)) {
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
            if (new_status.eql($UNEXAMINED_GOOD)) {
                return set_problem_raw_status_if_strategic(problem, strategic_context, old_status, new_status, T);
            }
        } else if (old_status.eql($PENDING_NO_GOOD)) {
            if (new_status.eql($FINISHED_NO_GOOD)) {
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
            if (new_status.eql($PENDING_GOOD)) {
                return set_problem_raw_status_if_strategic(problem, strategic_context, old_status, new_status, NIL);
            }
            if (new_status.eql($UNEXAMINED)) {
                return set_problem_raw_status_if_strategic(problem, strategic_context, old_status, new_status, T);
            }
        } else if (old_status.eql($FINISHED)) {
            if (new_status.eql($FINISHED_GOOD)) {
                if ($TACTICAL == strategic_context) {
                    inference_metrics.increment_good_problem_historical_count();
                }
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
            if (new_status.eql($FINISHED_NO_GOOD)) {
                set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                if ($TACTICAL == strategic_context) {
                    inference_metrics.increment_no_good_problem_historical_count();
                }
                consider_that_supported_problems_could_be_no_good(problem, consider_deepP, strategic_context);
                return problem;
            }
            if (new_status.eql($UNEXAMINED)) {
                return set_problem_raw_status_if_strategic(problem, strategic_context, old_status, new_status, T);
            }
        } else if (old_status.eql($FINISHED_GOOD)) {
            if (new_status.eql($FINISHED)) {
                set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                if ($TACTICAL == strategic_context) {
                    inference_metrics.decrement_good_problem_historical_count();
                }
                consider_that_problem_could_be_no_good(problem, consider_deepP, strategic_context, T);
                return problem;
            }
            if (new_status.eql($UNEXAMINED_GOOD)) {
                return set_problem_raw_status_if_strategic(problem, strategic_context, old_status, new_status, T);
            }
        } else if (old_status.eql($FINISHED_NO_GOOD)) {
            if (new_status.eql($FINISHED_GOOD)) {
                return set_problem_raw_status_if_strategic(problem, strategic_context, old_status, new_status, NIL);
            }
            if (new_status.eql($UNEXAMINED)) {
                return set_problem_raw_status_if_strategic(problem, strategic_context, old_status, new_status, T);
            }
        }
        return prohibited_problem_status_change_error(problem, old_status, new_status);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 141000L)
    public static SubLObject set_problem_raw_status_if_strategic(SubLObject problem, SubLObject strategic_context, SubLObject old_status, SubLObject new_status, SubLObject error_unless_reconsidering_set_asidesP) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != inference_datastructures_strategy.strategy_p(strategic_context) && (NIL == error_unless_reconsidering_set_asidesP || NIL != $reconsidering_set_asidesP$.getDynamicValue(thread))) {
            set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
        } else {
            prohibited_problem_status_change_error(problem, old_status, new_status);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 141500L)
    public static SubLObject prohibited_problem_status_change_error(SubLObject problem, SubLObject old_status, SubLObject new_status) {
        Errors.error($str149$Problem__a_attempted_to_change_st, problem, old_status, new_status);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 141800L)
    public static SubLObject consider_that_problem_could_be_good(SubLObject problem) {
        if (NIL == inference_datastructures_problem.tactically_good_problem_p(problem) && NIL != problem_goodP(problem)) {
            SubLObject store = inference_datastructures_problem.problem_store(problem);
            SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
            if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
                SubLObject idx_$78 = idx;
                if (NIL == id_index.id_index_dense_objects_empty_p(idx_$78, $SKIP)) {
                    SubLObject vector_var = id_index.id_index_dense_objects(idx_$78);
                    SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject inference;
                    for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                        id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                        inference = Vectors.aref(vector_var, id);
                        if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                            if (NIL != id_index.id_index_tombstone_p(inference)) {
                                inference = $SKIP;
                            }
                            if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                                consider_that_problem_could_be_irrelevant_to_inference(problem, inference);
                            }
                        }
                    }
                }
                SubLObject idx_$79 = idx;
                if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$79)) {
                    SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$79);
                    SubLObject id2 = NIL;
                    SubLObject inference2 = NIL;
                    Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            inference2 = Hashtables.getEntryValue(cdohash_entry);
                            if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                                consider_that_problem_could_be_irrelevant_to_inference(problem, inference2);
                            }
                        }
                    } finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
        }
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 142400L)
    public static SubLObject problem_goodP(SubLObject problem) {
        return makeBoolean(NIL != inference_datastructures_problem.valid_problem_p(problem) && NIL != inference_datastructures_problem.problem_has_some_proven_proofP(problem));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 142500L)
    public static SubLObject good_version_of_problem_status(SubLObject status) {
        if (status.eql($UNEXAMINED_GOOD) || status.eql($EXAMINED_GOOD) || status.eql($POSSIBLE_GOOD) || status.eql($PENDING_GOOD) || status.eql($FINISHED_GOOD)) {
            return status;
        }
        if (status.eql($UNEXAMINED)) {
            return $UNEXAMINED_GOOD;
        }
        if (status.eql($EXAMINED)) {
            return $EXAMINED_GOOD;
        }
        if (status.eql($POSSIBLE)) {
            return $POSSIBLE_GOOD;
        }
        if (status.eql($PENDING)) {
            return $PENDING_GOOD;
        }
        if (status.eql($FINISHED)) {
            return $FINISHED_GOOD;
        }
        if (status.eql($UNEXAMINED_NO_GOOD)) {
            return $UNEXAMINED_GOOD;
        }
        if (status.eql($EXAMINED_NO_GOOD)) {
            return $EXAMINED_GOOD;
        }
        if (status.eql($PENDING_NO_GOOD)) {
            return $PENDING_GOOD;
        }
        if (status.eql($FINISHED_NO_GOOD)) {
            return $FINISHED_GOOD;
        }
        if (status.eql($NEW)) {
            Errors.error($str150$new_problem_cannot_become_good_ye);
        } else {
            Errors.error($str151$unknown_problem_status__a, status);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 143400L)
    public static SubLObject unexamined_version_of_problem_status(SubLObject status) {
        if (status.eql($EXAMINED_GOOD) || status.eql($POSSIBLE_GOOD) || status.eql($PENDING_GOOD) || status.eql($FINISHED_GOOD)) {
            return $UNEXAMINED_GOOD;
        }
        if (status.eql($EXAMINED) || status.eql($POSSIBLE) || status.eql($PENDING) || status.eql($PENDING_NO_GOOD) || status.eql($FINISHED) || status.eql($FINISHED_NO_GOOD)) {
            return $UNEXAMINED;
        }
        Errors.error($str152$problem_status__a_cannot_become_u, status);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 143700L)
    public static SubLObject examined_version_of_problem_status(SubLObject status) {
        if (status.eql($EXAMINED) || status.eql($EXAMINED_GOOD) || status.eql($EXAMINED_NO_GOOD)) {
            return status;
        }
        if (status.eql($UNEXAMINED)) {
            return $EXAMINED;
        }
        if (status.eql($UNEXAMINED_GOOD)) {
            return $EXAMINED_GOOD;
        }
        if (status.eql($UNEXAMINED_NO_GOOD)) {
            return $EXAMINED_NO_GOOD;
        }
        Errors.error($str153$problem_of_status__a_cannot_be_ex, status);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 144100L)
    public static SubLObject possible_version_of_problem_status(SubLObject status) {
        if (status.eql($POSSIBLE) || status.eql($POSSIBLE_GOOD) || status.eql($POSSIBLE_NO_GOOD)) {
            return status;
        }
        if (status.eql($EXAMINED)) {
            return $POSSIBLE;
        }
        if (status.eql($EXAMINED_GOOD)) {
            return $POSSIBLE_GOOD;
        }
        Errors.error($str155$problem_of_status__a_cannot_be_ma, status);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 144400L)
    public static SubLObject pending_version_of_problem_status(SubLObject status) {
        if (status.eql($PENDING) || status.eql($PENDING_GOOD) || status.eql($PENDING_NO_GOOD)) {
            return status;
        }
        if (status.eql($EXAMINED)) {
            return $PENDING;
        }
        if (status.eql($EXAMINED_GOOD)) {
            return $PENDING_GOOD;
        }
        if (status.eql($EXAMINED_NO_GOOD)) {
            return $PENDING_NO_GOOD;
        }
        if (status.eql($POSSIBLE)) {
            return $PENDING;
        }
        if (status.eql($POSSIBLE_GOOD)) {
            return $PENDING_GOOD;
        }
        Errors.error($str156$problem_of_status__a_cannot_be_pe, status);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 144900L)
    public static SubLObject finished_version_of_problem_status(SubLObject status) {
        if (status.eql($FINISHED) || status.eql($FINISHED_GOOD) || status.eql($FINISHED_NO_GOOD)) {
            return status;
        }
        if (status.eql($PENDING)) {
            return $FINISHED;
        }
        if (status.eql($PENDING_GOOD)) {
            return $FINISHED_GOOD;
        }
        if (status.eql($PENDING_NO_GOOD)) {
            return $FINISHED_NO_GOOD;
        }
        Errors.error($str157$problem_of_status__a_cannot_be_fi, status);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 145200L)
    public static SubLObject consider_that_problem_could_no_longer_be_good(SubLObject problem) {
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 145400L)
    public static SubLObject consider_that_problem_could_be_finished(SubLObject problem, SubLObject consider_deepP, SubLObject strategic_context, SubLObject consider_transformation_tacticsP) {
        assert NIL != strategic_context_p(strategic_context) : strategic_context;
        if (NIL != problem_could_be_finishedP(problem, consider_deepP, strategic_context, consider_transformation_tacticsP)) {
            possibly_note_problem_finished(problem, strategic_context);
        }
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 145800L)
    public static SubLObject problem_could_be_finishedP(SubLObject problem, SubLObject consider_deepP, SubLObject strategic_context, SubLObject consider_transformation_tacticsP) {
        if (NIL != pending_problem_p(problem, strategic_context)) {
            SubLObject unfinishedP = NIL;
            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == unfinishedP
                    && NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                link = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, link) && NIL != problem_link_openableP(link, strategic_context)) {
                    unfinishedP = makeBoolean(NIL == problem_link_could_be_finishedP(link, strategic_context, consider_transformation_tacticsP));
                }
            }
            return makeBoolean(NIL == unfinishedP);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 147200L)
    public static SubLObject problem_link_openableP(SubLObject link, SubLObject strategic_context) {
        if (NIL != inference_datastructures_problem_link.problem_link_openP(link)) {
            return T;
        }
        if (NIL != logical_link_with_unique_tactic_p(link)) {
            SubLObject tactic = logical_link_unique_tactic(link);
            return makeBoolean(
                    NIL != inference_datastructures_tactic.tactic_possibleP(tactic) && (NIL == inference_datastructures_strategy.strategy_p(strategic_context) || NIL == inference_tactician_strategic_uninterestingness.strategy_chooses_to_ignore_tacticP(strategic_context, tactic, UNPROVIDED)));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 147600L)
    public static SubLObject problem_link_could_be_finishedP(SubLObject link, SubLObject strategic_context, SubLObject consider_transformation_tacticsP) {
        if (NIL != inference_worker_restriction.simplification_link_p(link)) {
            return finished_problem_p(inference_datastructures_problem_link.problem_link_sole_supporting_problem(link), strategic_context);
        }
        if (NIL != inference_worker_restriction.restriction_link_p(link)) {
            return T;
        }
        if (NIL != inference_worker_removal.removal_link_p(link)) {
            return T;
        }
        if (NIL != inference_worker_transformation.generalized_transformation_link_p(link)) {
            if (NIL == consider_transformation_tacticsP) {
                return T;
            }
            return finished_problem_p(inference_datastructures_problem_link.problem_link_sole_supporting_problem(link), strategic_context);
        } else {
            if (NIL != inference_worker_rewrite.rewrite_link_p(link)) {
                return finished_problem_p(inference_datastructures_problem_link.problem_link_sole_supporting_problem(link), strategic_context);
            }
            if (NIL != inference_worker_split.split_link_p(link)) {
                return split_link_could_be_finishedP(link, strategic_context);
            }
            if (NIL != inference_worker_join_ordered.join_ordered_link_p(link)) {
                return inference_worker_join_ordered.join_ordered_link_could_be_finishedP(link, strategic_context);
            }
            if (NIL != inference_worker_join.join_link_p(link)) {
                return join_link_could_be_finishedP(link, strategic_context);
            }
            if (NIL != inference_worker_union.union_link_p(link)) {
                return union_link_could_be_finishedP(link, strategic_context);
            }
            return Errors.error($str158$unexpected_link_type__S, link);
        }
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 148700L)
    public static SubLObject split_link_could_be_finishedP(SubLObject split_link, SubLObject strategic_context) {
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(split_link);
        SubLObject supporting_mapped_problem = NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_macros.do_problem_link_open_matchP(NIL, split_link, supporting_mapped_problem)) {
                SubLObject conjunct_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                if (NIL != no_good_problem_p(conjunct_problem, strategic_context)) {
                    return T;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        }
        SubLObject unfinishedP;
        SubLObject rest;
        SubLObject supporting_mapped_problem2;
        SubLObject conjunct_problem2;
        SubLObject variable_map2;
        for (unfinishedP = NIL, rest = NIL, rest = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(split_link); NIL == unfinishedP && NIL != rest; rest = rest.rest()) {
            supporting_mapped_problem2 = rest.first();
            if (NIL != inference_macros.do_problem_link_open_matchP(NIL, split_link, supporting_mapped_problem2)) {
                conjunct_problem2 = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem2);
                variable_map2 = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem2);
                unfinishedP = makeBoolean(NIL == finished_problem_p(conjunct_problem2, strategic_context));
            }
        }
        return makeBoolean(NIL == unfinishedP);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 149400L)
    public static SubLObject join_link_could_be_finishedP(SubLObject j_link, SubLObject strategic_context) {
        SubLObject first_problem = inference_worker_join.join_link_first_problem(j_link);
        SubLObject second_problem = inference_worker_join.join_link_second_problem(j_link);
        if (NIL != no_good_problem_p(first_problem, strategic_context) || NIL != no_good_problem_p(second_problem, strategic_context)) {
            return T;
        }
        if (NIL != finished_problem_p(first_problem, strategic_context) && NIL != finished_problem_p(second_problem, strategic_context)) {
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 150000L)
    public static SubLObject union_link_could_be_finishedP(SubLObject u_link, SubLObject strategic_context) {
        SubLObject disjunct_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(u_link);
        return makeBoolean(NIL != no_good_problem_p(disjunct_problem, strategic_context) || NIL != finished_problem_p(disjunct_problem, strategic_context));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 150300L)
    public static SubLObject consider_that_problem_could_be_no_good(SubLObject problem, SubLObject consider_deepP, SubLObject strategic_context, SubLObject consider_transformation_tacticsP) {
        if ($TACTICAL == strategic_context) {
            return default_consider_that_problem_could_be_no_good(strategic_context, problem, consider_deepP, consider_transformation_tacticsP);
        }
        return inference_tactician.strategy_consider_that_problem_could_be_no_good(strategic_context, problem, consider_deepP, consider_transformation_tacticsP);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 150800L)
    public static SubLObject default_consider_that_problem_could_be_no_good(SubLObject strategic_context, SubLObject problem, SubLObject consider_deepP, SubLObject consider_transformation_tacticsP) {
        assert NIL != strategic_context_p(strategic_context) : strategic_context;
        if (NIL == inference_datastructures_problem.tactically_good_problem_p(problem) && NIL == no_good_problem_p(problem, strategic_context) && NIL != unsatisfiable_problemP(problem, consider_deepP, strategic_context, consider_transformation_tacticsP)) {
            make_problem_no_good(problem, consider_deepP, strategic_context);
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 151800L)
    public static SubLObject note_tactic_doomed(SubLObject tactic, SubLObject strategic_context) {
        return make_problem_no_good(inference_datastructures_tactic.tactic_problem(tactic), NIL, strategic_context);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 151900L)
    public static SubLObject make_problem_no_good(SubLObject problem, SubLObject consider_deepP, SubLObject strategic_context) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
            possibly_note_problem_pending(problem, strategic_context);
        } else {
            discard_all_possible_tactics(problem);
        }
        if ($TACTICAL == strategic_context) {
            SubLObject store = inference_datastructures_problem.problem_store(problem);
            SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
            if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
                SubLObject idx_$80 = idx;
                if (NIL == id_index.id_index_dense_objects_empty_p(idx_$80, $SKIP)) {
                    SubLObject vector_var = id_index.id_index_dense_objects(idx_$80);
                    SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject inference;
                    for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                        id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                        inference = Vectors.aref(vector_var, id);
                        if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                            if (NIL != id_index.id_index_tombstone_p(inference)) {
                                inference = $SKIP;
                            }
                            if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                                maybe_make_problem_irrelevant_to_inference(inference, problem);
                            }
                        }
                    }
                }
                SubLObject idx_$81 = idx;
                if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$81)) {
                    SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$81);
                    SubLObject id2 = NIL;
                    SubLObject inference2 = NIL;
                    Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            inference2 = Hashtables.getEntryValue(cdohash_entry);
                            if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                                maybe_make_problem_irrelevant_to_inference(inference2, problem);
                            }
                        }
                    } finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
        }
        if (NIL != inference_datastructures_problem.tactically_good_problem_p(problem) && NIL != strategic_context_may_modify_its_problem_storeP(strategic_context)) {
            SubLObject status_var = $PROVEN;
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(inference_datastructures_problem.problem_proof_bindings_index(problem)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(
                    iteration_state)) {
                thread.resetMultipleValues();
                SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                SubLObject proof_list = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject cdolist_list_var = proof_list;
                SubLObject proof = NIL;
                proof = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != inference_datastructures_problem.proof_has_statusP(proof, status_var)) {
                        reject_proof(proof, $PROBLEM_NO_GOOD);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    proof = cdolist_list_var.first();
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        if (NIL == no_good_problem_p(problem, strategic_context)) {
            SubLObject old_status = problem_raw_tactical_or_strategic_status(problem, strategic_context);
            SubLObject new_status = no_good_version_of_problem_status(old_status);
            change_and_propagate_problem_status(problem, new_status, consider_deepP, strategic_context);
            if ($TACTICAL == strategic_context) {
                possibly_note_eager_pruning_problem(problem);
            }
            SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                    state); state = set_contents.do_set_contents_update_state(state)) {
                link = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, $CONJUNCTIVE)
                        && (NIL == inference_datastructures_strategy.strategy_p(strategic_context) || NIL == connected_conjunction_link_p(link) || NIL == good_problem_p(inference_datastructures_problem_link.problem_link_supported_problem(link), $TACTICAL))) {
                    make_problem_no_good(inference_datastructures_problem_link.problem_link_supported_problem(link), consider_deepP, strategic_context);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 153600L)
    public static SubLObject discard_all_possible_tactics(SubLObject problem) {
        return discard_possible_tactics_int(problem, NIL, NIL, NIL, NIL, NIL);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 153800L)
    public static SubLObject discard_all_impossible_possible_tactics(SubLObject problem) {
        discard_possible_tactics_int(problem, $IMPOSSIBLE, NIL, $CONTENT, NIL, NIL);
        if (NIL == inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_problem.problem_store(problem))) {
            discard_possible_tactics_int(problem, NIL, $DISALLOWED, $LOGICAL, NIL, NIL);
            discard_possible_tactics_int(problem, NIL, $DOOMED, $LOGICAL, NIL, NIL);
        }
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 154300L)
    public static SubLObject discard_possible_tactics_int(SubLObject problem, SubLObject completeness, SubLObject preference_level, SubLObject type, SubLObject tactic_to_not_discard, SubLObject productivity) {
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, type) && NIL != inference_datastructures_problem.do_problem_tactics_status_match(tactic, $POSSIBLE) && NIL != inference_datastructures_problem.do_problem_tactics_completeness_match(tactic, completeness)
                    && NIL != inference_datastructures_problem.do_problem_tactics_preference_level_match(tactic, preference_level) && NIL != inference_datastructures_problem.do_problem_tactics_productivity_match(tactic, productivity) && !tactic.eql(tactic_to_not_discard)) {
                inference_datastructures_tactic.note_tactic_discarded(tactic);
                if (NIL != inference_datastructures_tactic.valid_tactic_p(tactic)) {
                    SubLObject store = inference_datastructures_problem.problem_store(problem);
                    SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
                    if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
                        SubLObject idx_$82 = idx;
                        if (NIL == id_index.id_index_dense_objects_empty_p(idx_$82, $SKIP)) {
                            SubLObject vector_var = id_index.id_index_dense_objects(idx_$82);
                            SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject inference;
                            SubLObject inference_var;
                            SubLObject set_var;
                            SubLObject set_contents_var;
                            SubLObject basis_object;
                            SubLObject state;
                            SubLObject strategy;
                            for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                                id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                                inference = Vectors.aref(vector_var, id);
                                if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                                    if (NIL != id_index.id_index_tombstone_p(inference)) {
                                        inference = $SKIP;
                                    }
                                    if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                                        inference_var = inference;
                                        set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                                        set_contents_var = set.do_set_internal(set_var);
                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                                                state); state = set_contents.do_set_contents_update_state(state)) {
                                            strategy = set_contents.do_set_contents_next(basis_object, state);
                                            if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                                inference_tactician.strategy_note_tactic_discarded(strategy, tactic);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        SubLObject idx_$83 = idx;
                        if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$83)) {
                            SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$83);
                            SubLObject id2 = NIL;
                            SubLObject inference2 = NIL;
                            Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                            try {
                                while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                                    Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                                    id2 = Hashtables.getEntryKey(cdohash_entry);
                                    inference2 = Hashtables.getEntryValue(cdohash_entry);
                                    if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                                        SubLObject inference_var2 = inference2;
                                        SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                                        SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                                        SubLObject basis_object2;
                                        SubLObject state2;
                                        SubLObject strategy2;
                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2,
                                                state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                            strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                            if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                                inference_tactician.strategy_note_tactic_discarded(strategy2, tactic);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                Hashtables.releaseEntrySetIterator(cdohash_iterator);
                            }
                        }
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        if (NIL != inference_datastructures_problem.tactically_possible_problem_p(problem) && NIL == inference_datastructures_problem.problem_has_possible_tacticsP(problem)) {
            note_problem_pending(problem, $TACTICAL);
        }
        consider_that_problem_could_be_strategically_pending(problem);
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 155100L)
    public static SubLObject consider_that_problem_could_be_strategically_pending(SubLObject problem) {
        if (problem.eql(currently_active_problem())) {
            return NIL;
        }
        SubLObject store = inference_datastructures_problem.problem_store(problem);
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$84 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$84, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$84);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                SubLObject inference_var;
                SubLObject set_var;
                SubLObject set_contents_var;
                SubLObject basis_object;
                SubLObject state;
                SubLObject strategy;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                                    state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    consider_that_problem_could_be_strategically_pending_wrt(problem, strategy);
                                }
                            }
                        }
                    }
                }
            }
            SubLObject idx_$85 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$85)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$85);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                            SubLObject inference_var2 = inference2;
                            SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2,
                                    state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    consider_that_problem_could_be_strategically_pending_wrt(problem, strategy2);
                                }
                            }
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 155400L)
    public static SubLObject consider_that_problem_could_be_strategically_pending_wrt(SubLObject problem, SubLObject strategy) {
        inference_tactician.strategy_consider_that_problem_could_be_strategically_pending(strategy, problem);
        if (NIL != inference_datastructures_strategy.strategically_possible_problem_p(problem, strategy) && NIL != inference_tactician.strategy_no_possible_strategems_for_problemP(strategy, problem)) {
            possibly_note_problem_pending(problem, strategy);
        }
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 155800L)
    public static SubLObject consider_that_supported_problems_could_be_no_good(SubLObject supporting_problem, SubLObject consider_deepP, SubLObject strategic_context) {
        SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supporting_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        SubLObject supported_inference;
        SubLObject supported_problem;
        SubLObject non_focal_problem;
        SubLObject set_contents_var_$86;
        SubLObject basis_object_$87;
        SubLObject state_$88;
        SubLObject join_ordered_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                if (NIL != inference_worker_answer.answer_link_p(link)) {
                    supported_inference = inference_datastructures_problem_link.problem_link_supported_inference(link);
                    inference_strategist.inference_note_no_good(supported_inference);
                } else if (NIL != inference_worker_union.union_link_p(link)) {
                    supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                    if (NIL != all_no_good_union_argument_linksP(supported_problem, consider_deepP, strategic_context, T)) {
                        consider_that_problem_could_be_no_good(supported_problem, consider_deepP, strategic_context, T);
                    }
                } else if (NIL != inference_worker_transformation.transformation_link_p(link)) {
                    supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                    consider_that_problem_could_be_no_good(supported_problem, consider_deepP, strategic_context, T);
                } else if (NIL != inference_worker_rewrite.rewrite_link_p(link)) {
                    supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                    consider_that_problem_could_be_no_good(supported_problem, consider_deepP, strategic_context, T);
                } else if (NIL != inference_worker_restriction.restriction_link_p(link)) {
                    non_focal_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                    set_contents_var_$86 = inference_datastructures_problem.problem_dependent_links(non_focal_problem);
                    for (basis_object_$87 = set_contents.do_set_contents_basis_object(set_contents_var_$86), state_$88 = NIL, state_$88 = set_contents.do_set_contents_initial_state(basis_object_$87, set_contents_var_$86); NIL == set_contents.do_set_contents_doneP(basis_object_$87,
                            state_$88); state_$88 = set_contents.do_set_contents_update_state(state_$88)) {
                        join_ordered_link = set_contents.do_set_contents_next(basis_object_$87, state_$88);
                        if (NIL != set_contents.do_set_contents_element_validP(state_$88, join_ordered_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, $JOIN_ORDERED)
                                && NIL != inference_worker_join_ordered.non_focal_restriction_link_with_corresponding_focal_proofP(link, join_ordered_link)) {
                            consider_that_problem_could_be_no_good(inference_datastructures_problem_link.problem_link_supported_problem(join_ordered_link), consider_deepP, strategic_context, T);
                        }
                    }
                } else {
                    if ($TACTICAL == strategic_context && NIL != inference_worker_split.split_link_p(link)) {
                        inference_worker_split.close_split_link(link);
                    }
                    if (NIL != link_permits_no_good_propagation_to_supported_problemsP(link)) {
                        supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                        consider_that_problem_could_be_no_good(supported_problem, consider_deepP, strategic_context, T);
                    }
                }
            }
        }
        return supporting_problem;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 157700L)
    public static SubLObject no_good_version_of_problem_status(SubLObject status) {
        if (status.eql($FINISHED)) {
            return $FINISHED_NO_GOOD;
        }
        if (status.eql($PENDING)) {
            return $PENDING_NO_GOOD;
        }
        if (status.eql($EXAMINED)) {
            return $EXAMINED_NO_GOOD;
        }
        if (status.eql($UNEXAMINED)) {
            return $UNEXAMINED_NO_GOOD;
        }
        Errors.error($str162$Unexpected_status__s, status);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 158000L)
    public static SubLObject unsatisfiable_problemP(SubLObject problem, SubLObject consider_deepP, SubLObject strategic_context, SubLObject consider_transformation_tacticsP) {
        assert NIL != strategic_context_p(strategic_context) : strategic_context;
        SubLObject result = $UNDETERMINED;
        if (NIL != good_problem_p(problem, strategic_context)) {
            result = NIL;
        } else if (NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem)) {
            result = NIL;
        } else if (NIL != inference_datastructures_problem.tactically_examined_problem_p(problem)) {
            result = inference_datastructures_problem.closed_problem_p(problem);
        } else if (NIL != problem_doomedP(problem, strategic_context)) {
            result = $DOOMED;
        } else if (NIL != inference_datastructures_problem.single_literal_problem_p(problem) && NIL != problem_has_some_open_obviously_neutral_argument_linkP(problem, consider_deepP, strategic_context, consider_transformation_tacticsP)) {
            result = NIL;
        } else if (NIL != finished_problem_p(problem, strategic_context) && (NIL != inference_datastructures_problem.closed_problem_p(problem) || NIL == inference_datastructures_problem.single_literal_problem_p(problem))) {
            result = $FINISHED_CLOSED_SINGLE_LITERAL_OR_FINISHED_MULTI_LITERAL;
        } else if (NIL != pending_problem_p(problem, strategic_context) && NIL != inference_tactician_strategic_uninterestingness.problem_has_executed_a_complete_tacticP(problem, strategic_context, $GENERALIZED_REMOVAL)
                && NIL == inference_tactician_strategic_uninterestingness.problem_has_relevant_supporting_problemP(problem, strategic_context, consider_transformation_tacticsP)) {
            result = $PENDING_COMPLETE;
        } else if (NIL != pending_problem_p(problem, strategic_context) && $PREFERRED == inference_tactician_utilities.memoized_problem_global_preference_level(problem, strategic_context, inference_datastructures_problem.problem_variables(problem))
                && NIL == inference_tactician_strategic_uninterestingness.problem_has_relevant_supporting_problemP(problem, strategic_context, consider_transformation_tacticsP)) {
            result = $PENDING_PREFERRED;
        } else if (NIL != inference_datastructures_problem.problem_has_argument_link_of_typeP(problem, $SPLIT) && NIL != some_no_good_split_argument_linkP(problem, consider_deepP, strategic_context, consider_transformation_tacticsP)) {
            result = $NO_GOOD_SPLIT_LINK;
        } else if (NIL != inference_datastructures_problem.problem_has_argument_link_of_typeP(problem, $JOIN_ORDERED) && NIL != some_no_good_preferred_join_ordered_argument_linkP(problem, consider_deepP, strategic_context, consider_transformation_tacticsP)) {
            result = $NO_GOOD_PREFERRED_JO_LINK;
        } else if (NIL != inference_datastructures_problem.problem_has_argument_link_of_typeP(problem, $JOIN) && NIL != some_no_good_join_argument_linkP(problem, consider_deepP, strategic_context, consider_transformation_tacticsP)) {
            result = $NO_GOOD_JOIN_LINK;
        } else if (NIL != inference_datastructures_problem.tactically_pending_problem_p(problem) && NIL != inference_datastructures_problem.problem_has_argument_link_of_typeP(problem, $UNION)
                && NIL != all_no_good_union_argument_linksP(problem, consider_deepP, strategic_context, consider_transformation_tacticsP)) {
            result = $NO_GOOD_UNION_LINKS;
        } else if (NIL != inference_worker_restriction.problem_has_a_simplificationP(problem)) {
            result = all_no_good_simplification_linksP(problem, consider_deepP, strategic_context, consider_transformation_tacticsP);
        } else {
            result = NIL;
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 164000L)
    public static SubLObject problem_doomedP(SubLObject problem, SubLObject strategic_context) {
        SubLObject found_doomed_jo_tacticP = NIL;
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject jo_tactic = NIL;
        jo_tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(jo_tactic, $JOIN_ORDERED) && NIL != preference_modules.disallowed_or_doomed_preference_level_p(inference_datastructures_strategy.tactic_strategic_preference_level(jo_tactic, strategic_context))) {
                SubLObject jo_link = inference_worker_join_ordered.join_ordered_tactic_link(jo_tactic);
                if (NIL != jo_link) {
                    SubLObject focal_shared_vars = inference_worker_join_ordered.focal_vars_shared_by_non_focal(jo_link);
                    SubLObject focal_mapped_problem = inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(jo_link);
                    SubLObject focal_problem = inference_datastructures_problem_link.mapped_problem_problem(focal_mapped_problem);
                    SubLObject focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(focal_mapped_problem);
                    SubLObject shared_vars = bindings.apply_bindings(focal_variable_map, focal_shared_vars);
                    SubLObject bindable_vars = compute_shared_vars_that_are_actually_bindable(shared_vars, problem, strategic_context, jo_tactic);
                    SubLObject focal_bindable_vars = bindings.apply_bindings_backwards(focal_variable_map, bindable_vars);
                    if (!shared_vars.equal(bindable_vars) && NIL != preference_modules.doomed_preference_level_p(inference_tactician_utilities.memoized_problem_global_preference_level(focal_problem, strategic_context, focal_bindable_vars))) {
                        SubLObject old_reason = (strategic_context == $TACTICAL) ? inference_datastructures_tactic.tactic_preference_level_justification(jo_tactic) : inference_datastructures_strategy.tactic_strategic_preference_level_justification(jo_tactic, strategic_context);
                        SubLObject doom_reason = Sequences.cconcatenate($str170$Can_t_bind_,
                                format_nil.format_nil_a_no_copy(bindings.apply_bindings(focal_variable_map,
                                        conses_high.set_difference(list_utilities.tree_gather(inference_datastructures_problem.problem_query(inference_worker_join_ordered.join_ordered_tactic_focal_problem(jo_tactic)), Symbols.symbol_function($sym171$VARIABLE_P), UNPROVIDED, UNPROVIDED, UNPROVIDED),
                                                focal_bindable_vars, UNPROVIDED, UNPROVIDED))));
                        SubLObject new_reason = old_reason.isString()
                                ? Sequences.cconcatenate(format_nil.format_nil_a_no_copy(doom_reason),
                                        new SubLObject[] { $str172$__previously_was_, format_nil.format_nil_a_no_copy(inference_datastructures_strategy.tactic_strategic_preference_level(jo_tactic, strategic_context)), $str173$_due_to_, format_nil.format_nil_s_no_copy(old_reason), $str174$_ })
                                : doom_reason;
                        if (strategic_context == $TACTICAL) {
                            inference_datastructures_tactic.set_tactic_preference_level(jo_tactic, $DOOMED, new_reason);
                        } else {
                            inference_datastructures_strategy.set_tactic_strategic_preference_level(jo_tactic, strategic_context, $DOOMED, new_reason);
                        }
                        found_doomed_jo_tacticP = T;
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            jo_tactic = cdolist_list_var.first();
        }
        return found_doomed_jo_tacticP;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 166800L)
    public static SubLObject compute_shared_vars_that_are_actually_bindable(SubLObject shared_vars, SubLObject problem, SubLObject strategic_context, SubLObject jo_tactic) {
        SubLObject bindable_vars = NIL;
        SubLObject cdolist_list_var = shared_vars;
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != shared_var_actually_bindableP(var, problem, strategic_context, jo_tactic)) {
                bindable_vars = cons(var, bindable_vars);
            }
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        }
        return Sequences.nreverse(bindable_vars);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 167300L)
    public static SubLObject shared_var_actually_bindableP(SubLObject var, SubLObject problem, SubLObject strategic_context, SubLObject jo_tactic) {
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject sibling_jo_tactic = NIL;
        sibling_jo_tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(sibling_jo_tactic, $JOIN_ORDERED) && !jo_tactic.eql(sibling_jo_tactic) && NIL != join_ordered_tactic_has_a_chance_at_binding_varP(sibling_jo_tactic, var, strategic_context)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            sibling_jo_tactic = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 167700L)
    public static SubLObject join_ordered_tactic_has_a_chance_at_binding_varP(SubLObject jo_tactic, SubLObject var, SubLObject strategic_context) {
        SubLObject jo_link = inference_worker_join_ordered.join_ordered_tactic_link(jo_tactic);
        SubLObject focal_mapped_problem = inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(jo_link);
        SubLObject focal_problem = inference_datastructures_problem_link.mapped_problem_problem(focal_mapped_problem);
        SubLObject focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(focal_mapped_problem);
        SubLObject focal_var = bindings.apply_bindings_backwards(focal_variable_map, var);
        SubLObject focal_query = inference_datastructures_problem.problem_query(focal_problem);
        if (NIL == list_utilities.tree_find(focal_var, focal_query, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        SubLObject preference_level = inference_datastructures_strategy.tactic_strategic_preference_level(jo_tactic, strategic_context);
        if (NIL != preference_modules.doomed_preference_level_p(preference_level)) {
            return NIL;
        }
        if (NIL != preference_modules.disallowed_preference_level_p(preference_level)) {
            SubLObject shared_vars = inference_worker_join_ordered.focal_vars_shared_by_non_focal(jo_link);
            SubLObject gordian_vars = Sequences.remove(focal_var, shared_vars, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return makeBoolean(NIL == preference_modules.doomed_preference_level_p(inference_tactician_utilities.memoized_problem_global_preference_level(focal_problem, strategic_context, gordian_vars)));
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 169400L)
    public static SubLObject all_no_good_simplification_linksP(SubLObject problem, SubLObject consider_deepP, SubLObject strategic_context, SubLObject consider_transformation_tacticsP) {
        SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject simp_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            simp_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, simp_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(simp_link, $SIMPLIFICATION)
                    && NIL == problem_link_no_goodP(simp_link, consider_deepP, strategic_context, consider_transformation_tacticsP)) {
                return NIL;
            }
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 169700L)
    public static SubLObject problem_has_some_open_obviously_neutral_argument_linkP(SubLObject problem, SubLObject consider_deepP, SubLObject strategic_context, SubLObject consider_transformation_tacticsP) {
        SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject argument_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            argument_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, argument_link) && (NIL != consider_transformation_tacticsP || NIL == inference_worker_transformation.generalized_transformation_link_p(argument_link))
                    && (NIL == consider_deepP || NIL == problem_link_interesting_when_considered_deepP(argument_link)) && NIL != problem_link_has_some_open_obviously_neutral_supporting_mapped_problemP(argument_link, strategic_context)) {
                return T;
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 170300L)
    public static SubLObject some_no_good_split_argument_linkP(SubLObject problem, SubLObject consider_deepP, SubLObject strategic_context, SubLObject consider_transformation_tacticsP) {
        SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject split_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            split_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, split_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(split_link, $SPLIT) && NIL != problem_link_no_goodP(split_link, consider_deepP, strategic_context, consider_transformation_tacticsP)) {
                return T;
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 170600L)
    public static SubLObject some_no_good_preferred_join_ordered_argument_linkP(SubLObject problem, SubLObject consider_deepP, SubLObject strategic_context, SubLObject consider_transformation_tacticsP) {
        SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject join_ordered_link;
        SubLObject focal_problem;
        SubLObject shared_vars;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            join_ordered_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, join_ordered_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, $JOIN_ORDERED)
                    && NIL != problem_link_no_goodP(join_ordered_link, consider_deepP, strategic_context, consider_transformation_tacticsP)) {
                focal_problem = inference_datastructures_problem_link.mapped_problem_problem(inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(join_ordered_link));
                shared_vars = inference_worker_join_ordered.focal_vars_shared_by_non_focal(join_ordered_link);
                if ($PREFERRED == inference_tactician_utilities.memoized_problem_global_preference_level(focal_problem, strategic_context, shared_vars)) {
                    return T;
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 171300L)
    public static SubLObject some_no_good_join_argument_linkP(SubLObject problem, SubLObject consider_deepP, SubLObject strategic_context, SubLObject consider_transformation_tacticsP) {
        SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject join_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            join_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, join_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_link, $JOIN) && NIL != problem_link_no_goodP(join_link, consider_deepP, strategic_context, consider_transformation_tacticsP)) {
                return T;
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 171600L)
    public static SubLObject all_no_good_union_argument_linksP(SubLObject problem, SubLObject consider_deepP, SubLObject strategic_context, SubLObject consider_transformation_tacticsP) {
        SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject argument_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            argument_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, argument_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(argument_link, $UNION)
                    && NIL == problem_link_no_goodP(argument_link, consider_deepP, strategic_context, consider_transformation_tacticsP)) {
                return NIL;
            }
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 172000L)
    public static SubLObject problem_link_no_goodP(SubLObject link, SubLObject consider_deepP, SubLObject strategic_context, SubLObject consider_transformation_tacticsP) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != strategic_context_p(strategic_context) : strategic_context;
        if (NIL != consider_transformation_tacticsP && NIL != inference_datastructures_strategy.strategy_p(strategic_context)
                && NIL == problem_transformation_allowed_wrt_max_transformation_depthP(inference_datastructures_strategy.strategy_inference(strategic_context), inference_datastructures_problem_link.problem_link_supported_problem(link))) {
            consider_transformation_tacticsP = NIL;
        }
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
        SubLObject supporting_mapped_problem = NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link, supporting_mapped_problem)) {
                SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                if (NIL != no_good_problem_p(supporting_problem, strategic_context)) {
                    return T;
                }
                if (NIL == consider_transformation_tacticsP && NIL != unsatisfiable_problem_ignoring_transformation_tacticsP(supporting_problem, strategic_context)) {
                    return T;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        }
        if ((NIL != consider_deepP || NIL != $always_consider_deepP$.getDynamicValue(thread)) && NIL != inference_worker_join_ordered.join_ordered_link_p(link)) {
            return inference_worker_join_ordered.join_ordered_link_no_goodP(link, NIL, strategic_context);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 173500L)
    public static SubLObject unsatisfiable_problem_ignoring_transformation_tacticsP(SubLObject problem, SubLObject strategic_context) {
        return unsatisfiable_problemP(problem, NIL, strategic_context, NIL);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 173700L)
    public static SubLObject problem_link_has_some_open_obviously_neutral_supporting_mapped_problemP(SubLObject link, SubLObject strategic_context) {
        assert NIL != strategic_context_p(strategic_context) : strategic_context;
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
        SubLObject supporting_mapped_problem = NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link, supporting_mapped_problem) && NIL != inference_datastructures_problem_link.problem_link_supporting_mapped_problem_openP(link, supporting_mapped_problem)) {
                SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                if (NIL != neutral_problem_p(supporting_problem, strategic_context)) {
                    return T;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 174200L)
    public static SubLObject problem_link_has_some_open_obviously_good_supporting_mapped_problemP(SubLObject link) {
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
        SubLObject supporting_mapped_problem = NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link, supporting_mapped_problem) && NIL != inference_datastructures_problem_link.problem_link_supporting_mapped_problem_openP(link, supporting_mapped_problem)) {
                SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                if (NIL != inference_datastructures_problem.tactically_good_problem_p(supporting_problem)) {
                    return T;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 174700L)
    public static SubLObject problem_link_interesting_when_considered_deepP(SubLObject link) {
        return inference_worker_join_ordered.join_ordered_link_p(link);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 175000L)
    public static SubLObject restricted_focal_problem_has_a_no_good_restricted_non_focal_analogueP(SubLObject restriction_link, SubLObject join_ordered_link) {
        SubLObject restricted_non_focal_analogue = inference_worker_join_ordered.corresponding_restricted_non_focal_problem(restriction_link, join_ordered_link);
        return makeBoolean(NIL != restricted_non_focal_analogue && NIL != inference_datastructures_problem.tactically_no_good_problem_p(restricted_non_focal_analogue));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 175600L)
    public static SubLObject problem_link_no_good_wrt_dependent_join_ordered_linkP(SubLObject argument_link, SubLObject join_ordered_link, SubLObject consider_deepP, SubLObject strategic_context) {
        if (NIL != problem_link_no_goodP(argument_link, consider_deepP, strategic_context, T)) {
            return T;
        }
        if (NIL != inference_worker_restriction.restriction_link_p(argument_link)) {
            return restricted_focal_problem_has_a_no_good_restricted_non_focal_analogueP(argument_link, join_ordered_link);
        }
        if (NIL != inference_worker_removal.removal_link_p(argument_link)) {
            SubLObject at_least_one_restricted_non_focalP = NIL;
            SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_proofs(argument_link);
            SubLObject proof = NIL;
            proof = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != inference_datastructures_problem.proof_has_statusP(proof, $PROVEN)) {
                    SubLObject restricted_non_focal = inference_worker_join_ordered.join_ordered_link_triggered_restricted_non_focal(join_ordered_link, proof);
                    if (NIL != restricted_non_focal) {
                        at_least_one_restricted_non_focalP = T;
                        if (NIL == inference_datastructures_problem.tactically_no_good_problem_p(restricted_non_focal)) {
                            return NIL;
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                proof = cdolist_list_var.first();
            }
            return at_least_one_restricted_non_focalP;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 176600L)
    public static SubLObject link_permits_no_good_propagation_to_supported_problemsP(SubLObject link) {
        return list_utilities.member_eqP(inference_datastructures_problem_link.problem_link_type(link), $list176);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 176800L)
    public static SubLObject propagate_proof_spec_via_answer_link(SubLObject answer_link) {
        SubLObject inference = inference_worker_answer.answer_link_supported_inference(answer_link);
        SubLObject supporting_problem = inference_worker_answer.answer_link_supporting_problem(answer_link);
        SubLObject inference_var = inference;
        SubLObject set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
        SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject strategy;
        SubLObject proof_spec;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            strategy = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                proof_spec = inference_datastructures_strategy.strategy_proof_spec(strategy);
                if ($ANYTHING != proof_spec) {
                    strategy_propagate_proof_spec_to_supporting_problem_via_link(strategy, proof_spec, answer_link, supporting_problem);
                }
            }
        }
        return answer_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 177300L)
    public static SubLObject propagate_proof_spec(SubLObject link) {
        if (NIL != inference_worker_answer.answer_link_p(link)) {
            return propagate_proof_spec_via_answer_link(link);
        }
        SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
        if (NIL != problem_has_some_proof_spec_to_propagateP(supported_problem)) {
            SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
            SubLObject supporting_mapped_problem = NIL;
            supporting_mapped_problem = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link, supporting_mapped_problem) && NIL != link_permits_proof_spec_propagationP(link, supporting_mapped_problem)) {
                    SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                    propagate_proof_spec_to_supporting_problem_via_link(supported_problem, link, supporting_problem);
                }
                cdolist_list_var = cdolist_list_var.rest();
                supporting_mapped_problem = cdolist_list_var.first();
            }
        }
        return link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 177900L)
    public static SubLObject problem_has_some_proof_spec_to_propagateP(SubLObject problem) {
        SubLObject store = inference_datastructures_problem.problem_store(problem);
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$89 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$89, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$89);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                SubLObject inference_var;
                SubLObject set_var;
                SubLObject set_contents_var;
                SubLObject basis_object;
                SubLObject state;
                SubLObject strategy;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                                    state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, strategy) && $ANYTHING != inference_datastructures_strategy.strategy_proof_spec(strategy) && $ANYTHING != inference_datastructures_strategy.strategy_problem_proof_spec(strategy, problem)) {
                                    return T;
                                }
                            }
                        }
                    }
                }
            }
            SubLObject idx_$90 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$90)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$90);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                            SubLObject inference_var2 = inference2;
                            SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2,
                                    state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2) && $ANYTHING != inference_datastructures_strategy.strategy_proof_spec(strategy2) && $ANYTHING != inference_datastructures_strategy.strategy_problem_proof_spec(strategy2, problem)) {
                                    return T;
                                }
                            }
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 178200L)
    public static SubLObject propagate_proof_spec_to_supporting_problem_via_link(SubLObject problem, SubLObject link, SubLObject supporting_problem) {
        SubLObject store = inference_datastructures_problem.problem_store(problem);
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$91 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$91, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$91);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                SubLObject inference_var;
                SubLObject set_var;
                SubLObject set_contents_var;
                SubLObject basis_object;
                SubLObject state;
                SubLObject strategy;
                SubLObject proof_spec;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                                    state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, strategy) && $ANYTHING != inference_datastructures_strategy.strategy_proof_spec(strategy)) {
                                    proof_spec = inference_datastructures_strategy.strategy_problem_proof_spec(strategy, problem);
                                    if ($ANYTHING != proof_spec) {
                                        strategy_propagate_proof_spec_to_supporting_problem_via_link(strategy, proof_spec, link, supporting_problem);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            SubLObject idx_$92 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$92)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$92);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                            SubLObject inference_var2 = inference2;
                            SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            SubLObject proof_spec2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2,
                                    state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2) && $ANYTHING != inference_datastructures_strategy.strategy_proof_spec(strategy2)) {
                                    proof_spec2 = inference_datastructures_strategy.strategy_problem_proof_spec(strategy2, problem);
                                    if ($ANYTHING != proof_spec2) {
                                        strategy_propagate_proof_spec_to_supporting_problem_via_link(strategy2, proof_spec2, link, supporting_problem);
                                    }
                                }
                            }
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 178800L)
    public static SubLObject with_proof_spec_of_appropriate_type(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list178);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject typed_proof_spec = NIL;
        SubLObject proof_spec = NIL;
        SubLObject proof_spec_type_p = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list178);
        typed_proof_spec = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list178);
        proof_spec = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list178);
        proof_spec_type_p = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            return list($sym1$CLET, list(list(typed_proof_spec, list($sym179$FILTER_PROOF_SPECS_OF_TYPE, proof_spec, proof_spec_type_p))), listS($sym180$PUNLESS, list($sym181$NULL, typed_proof_spec), append(body, NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list178);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 179100L)
    public static SubLObject strategy_propagate_proof_spec_to_supporting_problem_via_link(SubLObject strategy, SubLObject proof_spec, SubLObject link, SubLObject supporting_problem) {
        if (NIL != inference_worker_answer.answer_link_p(link)) {
            strategy_propagate_problem_proof_spec(strategy, supporting_problem, proof_spec);
        } else if (NIL != inference_worker_join_ordered.join_ordered_link_p(link)) {
            SubLObject typed_proof_spec = inference_proof_spec.filter_proof_specs_of_type(proof_spec, $sym182$JOIN_ORDERED_PROOF_SPEC_P);
            if (NIL != typed_proof_spec) {
                propagate_join_ordered_proof_spec_via_join_ordered_link(strategy, typed_proof_spec, link, supporting_problem);
            }
            typed_proof_spec = inference_proof_spec.filter_proof_specs_of_type(proof_spec, $sym183$RESIDUAL_TRANSFORMATION_PROOF_SPEC_P);
            if (NIL != typed_proof_spec) {
                propagate_residual_transformation_proof_spec_via_join_ordered_link(strategy, typed_proof_spec, link, supporting_problem);
            }
        } else if (NIL != inference_worker_restriction.restriction_link_p(link)) {
            SubLObject typed_proof_spec = inference_proof_spec.filter_proof_specs_of_type(proof_spec, $sym184$RESTRICTION_PROOF_SPEC_P);
            if (NIL != typed_proof_spec) {
                propagate_proof_spec_via_restriction_link(strategy, typed_proof_spec, link, supporting_problem);
            }
        } else if (NIL != inference_worker_split.split_link_p(link)) {
            SubLObject typed_proof_spec = inference_proof_spec.filter_proof_specs_of_type(proof_spec, $sym185$SPLIT_PROOF_SPEC_P);
            if (NIL != typed_proof_spec) {
                propagate_proof_spec_via_split_link(strategy, typed_proof_spec, link, supporting_problem);
            }
        } else if (NIL != inference_worker_join.join_link_p(link)) {
            SubLObject typed_proof_spec = inference_proof_spec.filter_proof_specs_of_type(proof_spec, $sym186$JOIN_PROOF_SPEC_P);
            if (NIL != typed_proof_spec) {
                propagate_proof_spec_via_join_link(strategy, typed_proof_spec, link, supporting_problem);
            }
        } else if (NIL != conjunctive_link_p(link)) {
            SubLObject typed_proof_spec = inference_proof_spec.filter_proof_specs_of_type(proof_spec, $sym187$CONJUNCTIVE_REMOVAL_PROOF_SPEC_P);
            if (NIL != typed_proof_spec) {
                propagate_proof_spec_via_conjunctive_link(strategy, typed_proof_spec, link, supporting_problem);
            }
        } else if (NIL != inference_worker_restriction.simplification_link_p(link)) {
            propagate_proof_spec_via_simplification_link(strategy, proof_spec, link, supporting_problem);
        } else if (NIL != inference_worker_transformation.transformation_link_p(link)) {
            SubLObject typed_proof_spec = inference_proof_spec.filter_proof_specs_of_type(proof_spec, $sym188$TRANSFORMATION_PROOF_SPEC_P);
            if (NIL != typed_proof_spec) {
                propagate_proof_spec_via_transformation_link(strategy, typed_proof_spec, link, supporting_problem);
            }
        } else if (NIL != inference_worker_residual_transformation.residual_transformation_link_p(link)) {
            SubLObject typed_proof_spec = inference_proof_spec.filter_proof_specs_of_type(proof_spec, $sym183$RESIDUAL_TRANSFORMATION_PROOF_SPEC_P);
            if (NIL != typed_proof_spec) {
                propagate_proof_spec_via_residual_transformation_link(strategy, typed_proof_spec, link, supporting_problem);
            }
        } else {
            if (NIL == inference_worker_union.union_link_p(link)) {
                return Errors.error($str190$Time_to_handle__S_propagation, inference_datastructures_problem_link.problem_link_type(link));
            }
            SubLObject typed_proof_spec = inference_proof_spec.filter_proof_specs_of_type(proof_spec, $sym189$UNION_PROOF_SPEC_P);
            if (NIL != typed_proof_spec) {
                propagate_proof_spec_via_union_link(strategy, typed_proof_spec, link, supporting_problem);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 181700L)
    public static SubLObject link_permits_proof_spec_propagationP(SubLObject link, SubLObject supporting_mapped_problem) {
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 181800L)
    public static SubLObject proof_spec_of_appropriate_typeP(SubLObject proof_spec, SubLObject proof_spec_type_p) {
        return makeBoolean(NIL != inference_proof_spec.filter_proof_specs_of_type(proof_spec, proof_spec_type_p));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 182000L)
    public static SubLObject strategy_propagate_problem_proof_spec(SubLObject strategy, SubLObject problem, SubLObject proof_spec) {
        SubLObject updatedP = inference_datastructures_strategy.strategy_note_problem_proof_spec(strategy, problem, proof_spec);
        if (NIL != updatedP) {
            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                    state); state = set_contents.do_set_contents_update_state(state)) {
                link = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                    propagate_proof_spec(link);
                }
            }
        }
        return updatedP;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 182300L)
    public static SubLObject propagate_join_ordered_proof_spec_via_join_ordered_link(SubLObject strategy, SubLObject proof_spec, SubLObject link, SubLObject supporting_problem) {
        if (NIL != inference_proof_spec.or_pattern_p(proof_spec)) {
            SubLObject cdolist_list_var = proof_spec.rest();
            SubLObject disjunct = NIL;
            disjunct = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                propagate_join_ordered_proof_spec_via_join_ordered_link_int(strategy, disjunct, link, supporting_problem);
                cdolist_list_var = cdolist_list_var.rest();
                disjunct = cdolist_list_var.first();
            }
        } else {
            propagate_join_ordered_proof_spec_via_join_ordered_link_int(strategy, proof_spec, link, supporting_problem);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 182600L)
    public static SubLObject propagate_join_ordered_proof_spec_via_join_ordered_link_int(SubLObject strategy, SubLObject proof_spec, SubLObject link, SubLObject supporting_problem) {
        if (supporting_problem.eql(inference_worker_join_ordered.join_ordered_link_focal_problem(link))) {
            SubLObject focal_proof_spec = inference_proof_spec.join_ordered_proof_spec_focal_proof_spec(proof_spec);
            if (NIL != inference_proof_spec.proof_spec_possibly_admits_problemP(focal_proof_spec, supporting_problem)) {
                strategy_propagate_problem_proof_spec(strategy, supporting_problem, focal_proof_spec);
            }
        }
        if (supporting_problem.eql(inference_worker_join_ordered.join_ordered_link_non_focal_problem(link))) {
            SubLObject non_focal_proof_spec = inference_proof_spec.join_ordered_proof_spec_non_focal_proof_spec(proof_spec);
            if (NIL != inference_proof_spec.proof_spec_possibly_admits_problemP(non_focal_proof_spec, supporting_problem)) {
                strategy_propagate_problem_proof_spec(strategy, supporting_problem, non_focal_proof_spec);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 183400L)
    public static SubLObject propagate_proof_spec_via_union_link(SubLObject strategy, SubLObject proof_spec, SubLObject link, SubLObject supporting_problem) {
        if (supporting_problem.eql(inference_worker_union.union_link_supporting_problem(link))) {
            SubLObject disjunct_proof_spec = inference_proof_spec.union_proof_spec_disjunct_proof_spec(proof_spec);
            if (NIL != inference_proof_spec.proof_spec_possibly_admits_problemP(disjunct_proof_spec, supporting_problem)) {
                strategy_propagate_problem_proof_spec(strategy, supporting_problem, disjunct_proof_spec);
                return disjunct_proof_spec;
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 183900L)
    public static SubLObject propagate_residual_transformation_proof_spec_via_join_ordered_link(SubLObject strategy, SubLObject proof_spec, SubLObject link, SubLObject supporting_problem) {
        if (NIL != inference_proof_spec.or_pattern_p(proof_spec)) {
            SubLObject cdolist_list_var = proof_spec.rest();
            SubLObject disjunct = NIL;
            disjunct = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                propagate_residual_transformation_proof_spec_via_join_ordered_link_int(strategy, disjunct, link, supporting_problem);
                cdolist_list_var = cdolist_list_var.rest();
                disjunct = cdolist_list_var.first();
            }
        } else {
            propagate_residual_transformation_proof_spec_via_join_ordered_link_int(strategy, proof_spec, link, supporting_problem);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 184300L)
    public static SubLObject propagate_residual_transformation_proof_spec_via_join_ordered_link_int(SubLObject strategy, SubLObject proof_spec, SubLObject link, SubLObject supporting_problem) {
        SubLObject join_ordered_proof_spec = inference_proof_spec.join_ordered_proof_spec_from_residual_transformation_proof_spec(proof_spec);
        return propagate_join_ordered_proof_spec_via_join_ordered_link(strategy, join_ordered_proof_spec, link, supporting_problem);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 184700L)
    public static SubLObject propagate_proof_spec_via_restriction_link(SubLObject strategy, SubLObject proof_spec, SubLObject link, SubLObject supporting_problem) {
        SubLObject restricted_proof_spec = inference_proof_spec.restriction_proof_spec_restricted_proof_spec(proof_spec);
        if (NIL != inference_proof_spec.proof_spec_possibly_admits_problemP(restricted_proof_spec, supporting_problem)) {
            strategy_propagate_problem_proof_spec(strategy, supporting_problem, restricted_proof_spec);
            return restricted_proof_spec;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 185200L)
    public static SubLObject propagate_proof_spec_via_split_link(SubLObject strategy, SubLObject proof_spec, SubLObject link, SubLObject supporting_problem) {
        SubLObject split_sub_proof_specs = inference_proof_spec.split_proof_spec_sub_proof_specs(proof_spec);
        SubLObject propagated_proof_spec = NIL;
        SubLObject cdolist_list_var = split_sub_proof_specs;
        SubLObject split_sub_proof_spec = NIL;
        split_sub_proof_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_proof_spec.proof_spec_possibly_admits_problemP(split_sub_proof_spec, supporting_problem)) {
                strategy_propagate_problem_proof_spec(strategy, supporting_problem, split_sub_proof_spec);
                propagated_proof_spec = split_sub_proof_spec;
            }
            cdolist_list_var = cdolist_list_var.rest();
            split_sub_proof_spec = cdolist_list_var.first();
        }
        return propagated_proof_spec;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 185800L)
    public static SubLObject propagate_proof_spec_via_join_link(SubLObject strategy, SubLObject proof_spec, SubLObject link, SubLObject supporting_problem) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sub_proof_specs = (NIL != inference_proof_spec.or_pattern_p(proof_spec)) ? proof_spec.rest() : list(proof_spec);
        SubLObject useful_proof_spec_parts = NIL;
        SubLObject cdolist_list_var = sub_proof_specs;
        SubLObject sub_proof_spec = NIL;
        sub_proof_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = sub_proof_spec;
            SubLObject join_part = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list191);
            join_part = current.first();
            SubLObject joined_parts;
            current = (joined_parts = current.rest());
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && $JOIN != join_part) {
                Errors.error($str192$Propagating_bogus_proof_spec__A_d, sub_proof_spec, link);
            }
            SubLObject cdolist_list_var_$93 = joined_parts;
            SubLObject joined_part = NIL;
            joined_part = cdolist_list_var_$93.first();
            while (NIL != cdolist_list_var_$93) {
                SubLObject literal_spec = inference_proof_spec.proof_spec_literal_spec(joined_part);
                if (NIL != list_utilities.sublisp_boolean(literal_spec)) {
                    if (NIL != inference_tactician_strategic_uninterestingness.literal_spec_admits_single_literal_problemP(literal_spec, supporting_problem)) {
                        useful_proof_spec_parts = cons(joined_part, useful_proof_spec_parts);
                    }
                } else {
                    useful_proof_spec_parts = cons(joined_part, useful_proof_spec_parts);
                }
                cdolist_list_var_$93 = cdolist_list_var_$93.rest();
                joined_part = cdolist_list_var_$93.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            sub_proof_spec = cdolist_list_var.first();
        }
        if (NIL != list_utilities.sublisp_boolean(useful_proof_spec_parts)) {
            SubLObject useful_proof_spec = inference_proof_spec.merge_proof_specs(useful_proof_spec_parts);
            strategy_propagate_problem_proof_spec(strategy, supporting_problem, useful_proof_spec);
        }
        return strategy;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 186900L)
    public static SubLObject propagate_proof_spec_via_conjunctive_link(SubLObject strategy, SubLObject proof_spec, SubLObject link, SubLObject supporting_problem) {
        return strategy;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 187100L)
    public static SubLObject propagate_proof_spec_via_simplification_link(SubLObject strategy, SubLObject proof_spec, SubLObject link, SubLObject supporting_problem) {
        return strategy;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 187300L)
    public static SubLObject propagate_proof_spec_via_transformation_link(SubLObject strategy, SubLObject proof_spec, SubLObject link, SubLObject supporting_problem) {
        if (NIL != inference_proof_spec.or_pattern_p(proof_spec)) {
            SubLObject cdolist_list_var = proof_spec.rest();
            SubLObject disjunct = NIL;
            disjunct = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                propagate_transformation_proof_spec_via_transformation_link(strategy, disjunct, link, supporting_problem);
                cdolist_list_var = cdolist_list_var.rest();
                disjunct = cdolist_list_var.first();
            }
        } else {
            propagate_transformation_proof_spec_via_transformation_link(strategy, proof_spec, link, supporting_problem);
        }
        return strategy;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 187600L)
    public static SubLObject propagate_transformation_proof_spec_via_transformation_link(SubLObject strategy, SubLObject transformation_proof_spec, SubLObject link, SubLObject supporting_problem) {
        assert NIL != inference_proof_spec.transformation_proof_spec_p(transformation_proof_spec) : transformation_proof_spec;
        SubLObject rule = inference_worker_transformation.transformation_link_rule_assertion(link);
        SubLObject rule_spec = inference_proof_spec.transformation_proof_spec_rule(transformation_proof_spec);
        if (NIL != inference_tactician_strategic_uninterestingness.rule_spec_admits_rule(rule_spec, rule)) {
            SubLObject transformed_proof_spec = inference_proof_spec.transformation_proof_spec_supporting_proof_spec(transformation_proof_spec);
            if (NIL != inference_proof_spec.proof_spec_possibly_admits_problemP(transformed_proof_spec, supporting_problem)) {
                strategy_propagate_problem_proof_spec(strategy, supporting_problem, transformed_proof_spec);
                return transformed_proof_spec;
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 188400L)
    public static SubLObject propagate_proof_spec_via_residual_transformation_link(SubLObject strategy, SubLObject proof_spec, SubLObject link, SubLObject supporting_problem) {
        if (NIL != inference_proof_spec.or_pattern_p(proof_spec)) {
            SubLObject cdolist_list_var = proof_spec.rest();
            SubLObject disjunct = NIL;
            disjunct = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                propagate_residual_transformation_proof_spec_via_residual_transformation_link(strategy, disjunct, link, supporting_problem);
                cdolist_list_var = cdolist_list_var.rest();
                disjunct = cdolist_list_var.first();
            }
        } else {
            propagate_residual_transformation_proof_spec_via_residual_transformation_link(strategy, proof_spec, link, supporting_problem);
        }
        return strategy;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 188700L)
    public static SubLObject propagate_residual_transformation_proof_spec_via_residual_transformation_link(SubLObject strategy, SubLObject proof_spec, SubLObject link, SubLObject supporting_problem) {
        assert NIL != inference_proof_spec.residual_transformation_proof_spec_p(proof_spec) : proof_spec;
        SubLObject rule = inference_worker_residual_transformation.residual_transformation_link_rule_assertion(link);
        SubLObject rule_spec = inference_proof_spec.residual_transformation_proof_spec_rule(proof_spec);
        if (NIL != inference_tactician_strategic_uninterestingness.rule_spec_admits_rule(rule_spec, rule)) {
            SubLObject transformed_proof_spec = inference_proof_spec.residual_transformation_proof_spec_supporting_proof_spec(proof_spec);
            if (NIL != inference_proof_spec.proof_spec_possibly_admits_problemP(transformed_proof_spec, supporting_problem)) {
                strategy_propagate_problem_proof_spec(strategy, supporting_problem, transformed_proof_spec);
                return transformed_proof_spec;
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 189400L)
    public static SubLObject find_problem(SubLObject store, SubLObject query, SubLObject free_hl_vars) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject problem = find_problem_int(store, query, free_hl_vars, NIL);
        SubLObject problem_variable_map = thread.secondMultipleValue();
        SubLObject canonical_query = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != problem) {
            SubLObject mapped_problem = inference_datastructures_problem_link.new_mapped_problem(problem, problem_variable_map);
            return mapped_problem;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 190300L)
    public static SubLObject find_or_create_problem(SubLObject store, SubLObject query, SubLObject free_hl_vars, SubLObject complexP) {
        if (complexP == UNPROVIDED) {
            complexP = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        inference_metrics.inference_possibly_update_tick_indexed_progress_data(inference_macros.current_controlling_inference());
        thread.resetMultipleValues();
        SubLObject problem = find_problem_int(store, query, free_hl_vars, complexP);
        SubLObject problem_variable_map = thread.secondMultipleValue();
        SubLObject canonical_query = thread.thirdMultipleValue();
        SubLObject canonical_free_hl_vars = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (NIL == problem) {
            problem = inference_datastructures_problem.new_problem(store, canonical_query, canonical_free_hl_vars);
        }
        return inference_datastructures_problem_link.new_mapped_problem(problem, problem_variable_map);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 191800L)
    public static SubLObject find_problem_int(SubLObject store, SubLObject query, SubLObject free_hl_vars, SubLObject complexP) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pcase_var;
        SubLObject method = pcase_var = inference_datastructures_problem_store.problem_store_equality_reasoning_method(store);
        if (pcase_var.eql($EQUAL)) {
            SubLObject problem = inference_datastructures_problem_store.find_problem_by_query(store, query, free_hl_vars);
            SubLObject problem_variable_map = NIL;
            return subl_promotions.values4(problem, problem_variable_map, query, free_hl_vars);
        }
        if (pcase_var.eql($CZER_EQUAL)) {
            thread.resetMultipleValues();
            SubLObject canonical_query = inference_czer.canonicalize_problem_query(query);
            SubLObject canonical_variable_map = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject canonical_free_hl_vars = variables.sort_hl_variable_list_memoized(bindings.apply_bindings_backwards(canonical_variable_map, free_hl_vars));
            SubLObject problem2 = inference_datastructures_problem_store.find_problem_by_query(store, canonical_query, canonical_free_hl_vars);
            if (NIL == problem2 && NIL != complexP) {
                thread.resetMultipleValues();
                SubLObject complex_problem = inference_datastructures_problem_store.problem_store_find_complex_problem_query(store, canonical_query, canonical_free_hl_vars);
                SubLObject complex_variable_map = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != complex_problem) {
                    SubLObject complex_query = inference_datastructures_problem.problem_query(complex_problem);
                    SubLObject final_variable_map = bindings.compose_bindings(complex_variable_map, canonical_variable_map);
                    return subl_promotions.values4(complex_problem, final_variable_map, complex_query, canonical_free_hl_vars);
                }
            }
            return subl_promotions.values4(problem2, canonical_variable_map, canonical_query, canonical_free_hl_vars);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 193600L)
    public static SubLObject find_or_create_problem_from_contextualized_asent_sense(SubLObject store, SubLObject contextualized_asent, SubLObject sense, SubLObject free_hl_vars) {
        SubLObject query = inference_datastructures_problem_query.new_problem_query_from_contextualized_asent_sense(contextualized_asent, sense);
        return find_or_create_problem(store, query, free_hl_vars, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 194000L)
    public static SubLObject find_or_create_problem_from_contextualized_clause(SubLObject store, SubLObject contextualized_clause, SubLObject free_hl_vars) {
        SubLObject query = inference_datastructures_problem_query.new_problem_query_from_contextualized_clause(contextualized_clause);
        return find_or_create_problem(store, query, variables.sorted_hl_variables_in_expressions_intersection(free_hl_vars, query), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 194400L)
    public static SubLObject find_or_create_problem_from_subclause_spec(SubLObject store, SubLObject contextualized_clause, SubLObject subclause_spec, SubLObject free_hl_vars) {
        SubLObject query = inference_datastructures_problem_query.new_problem_query_from_subclause_spec(contextualized_clause, subclause_spec);
        return find_or_create_problem(store, query, variables.sorted_hl_variables_in_expressions_intersection(free_hl_vars, query), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 194800L)
    public static SubLObject find_or_create_problem_without_subclause_spec(SubLObject store, SubLObject contextualized_clause, SubLObject subclause_spec, SubLObject free_hl_vars) {
        SubLObject query_without = inference_datastructures_problem_query.new_problem_query_without_subclause_spec(contextualized_clause, subclause_spec);
        return find_or_create_problem(store, query_without, variables.sorted_hl_variables_in_expressions_intersection(free_hl_vars, query_without), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 195300L)
    public static SubLObject find_or_create_root_problem_and_link(SubLObject inference) {
        SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
        SubLObject hl_query = inference_datastructures_inference.inference_hl_query(inference);
        SubLObject free_hl_vars = inference_datastructures_inference.inference_free_hl_vars(inference);
        SubLObject mapped_root_problem = find_or_create_root_problem(store, hl_query, free_hl_vars);
        new_root_answer_link(inference, mapped_root_problem);
        return mapped_root_problem;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 195800L)
    public static SubLObject new_root_answer_link(SubLObject inference, SubLObject mapped_root_problem) {
        SubLObject link = inference_worker_answer.new_answer_link(inference);
        inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link(mapped_root_problem, link);
        SubLObject root_problem = inference_datastructures_problem_link.mapped_problem_problem(mapped_root_problem);
        inference_datastructures_problem_store.add_problem_store_historical_root_problem(inference_datastructures_problem.problem_store(root_problem), root_problem);
        return link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 196400L)
    public static SubLObject find_or_create_root_problem(SubLObject store, SubLObject query, SubLObject free_hl_vars) {
        return find_or_create_problem(store, query, free_hl_vars, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 196700L)
    public static SubLObject prune_problem_store(SubLObject store, SubLObject consider_deepP) {
        if (consider_deepP == UNPROVIDED) {
            consider_deepP = T;
        }
        SubLObject old_problem_count = inference_datastructures_problem_store.problem_store_problem_count(store);
        SubLObject old_tactic_count = inference_datastructures_problem_store.problem_store_tactic_count(store);
        recompute_destructible_problems(store, consider_deepP);
        SubLObject destroyed_problem_count = ZERO_INTEGER;
        SubLObject destroyed_tactic_count = ZERO_INTEGER;
        destroyed_problem_count = destroy_destructible_problems(store);
        destroyed_tactic_count = destroy_discarded_tactics(store);
        if (NIL != $problem_store_prune_reports$.getGlobalValue()) {
            SubLObject new_problem_count = inference_datastructures_problem_store.problem_store_problem_count(store);
            SubLObject new_tactic_count = inference_datastructures_problem_store.problem_store_tactic_count(store);
            if (NIL != subl_promotions.positive_integer_p(destroyed_problem_count) || NIL != subl_promotions.positive_integer_p(destroyed_tactic_count)) {
                format_nil.force_format(T, $str196$__pruned__a_problems____a_____a__, destroyed_problem_count, old_problem_count, new_problem_count, destroyed_tactic_count, old_tactic_count, new_tactic_count, UNPROVIDED, UNPROVIDED);
            }
        }
        inference_datastructures_problem_store.possibly_optimize_problem_store(store);
        return Numbers.add(destroyed_problem_count, destroyed_tactic_count);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 198000L)
    public static SubLObject destroy_discarded_tactics(SubLObject store) {
        SubLObject tactic_count = ZERO_INTEGER;
        SubLObject link_count = ZERO_INTEGER;
        SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$94 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$94, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$94);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                SubLObject cdolist_list_var;
                SubLObject tactic;
                SubLObject link;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.valid_problem_p(problem)) {
                            cdolist_list_var = inference_datastructures_problem.problem_discarded_tactics(problem);
                            tactic = NIL;
                            tactic = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                link = (NIL != connected_conjunction_tactic_p(tactic)) ? connected_conjunction_tactic_link(tactic) : NIL;
                                if (NIL != link && NIL != inference_datastructures_problem_link.problem_link_closedP(link)) {
                                    inference_datastructures_problem_link.destroy_problem_link(link);
                                    link_count = Numbers.add(link_count, ONE_INTEGER);
                                }
                                inference_datastructures_tactic.destroy_problem_tactic_and_backpointers(tactic);
                                tactic_count = Numbers.add(tactic_count, ONE_INTEGER);
                                cdolist_list_var = cdolist_list_var.rest();
                                tactic = cdolist_list_var.first();
                            }
                        }
                    }
                }
            }
            SubLObject idx_$95 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$95)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$95);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.valid_problem_p(problem2)) {
                            SubLObject cdolist_list_var2 = inference_datastructures_problem.problem_discarded_tactics(problem2);
                            SubLObject tactic2 = NIL;
                            tactic2 = cdolist_list_var2.first();
                            while (NIL != cdolist_list_var2) {
                                SubLObject link2 = (NIL != connected_conjunction_tactic_p(tactic2)) ? connected_conjunction_tactic_link(tactic2) : NIL;
                                if (NIL != link2 && NIL != inference_datastructures_problem_link.problem_link_closedP(link2)) {
                                    inference_datastructures_problem_link.destroy_problem_link(link2);
                                    link_count = Numbers.add(link_count, ONE_INTEGER);
                                }
                                inference_datastructures_tactic.destroy_problem_tactic_and_backpointers(tactic2);
                                tactic_count = Numbers.add(tactic_count, ONE_INTEGER);
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                tactic2 = cdolist_list_var2.first();
                            }
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return Values.values(tactic_count, link_count);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 199200L)
    public static SubLObject tactic_thrown_away_and_privateP(SubLObject tactic, SubLObject empowered_balancing_tactician) {
        if (NIL != empowered_balancing_tactician) {
            return inference_tactician_strategic_uninterestingness.strategy_chooses_to_throw_away_tacticP(empowered_balancing_tactician, tactic, NIL, NIL);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 199400L)
    public static SubLObject destroy_destructible_problems(SubLObject store) {
        SubLObject janitor = inference_datastructures_problem_store.problem_store_janitor(store);
        SubLObject destructible_problems = problem_store_janitor_destructible_problem_list(janitor);
        inference_datastructures_problem_store.reset_problem_store_janitor(store);
        SubLObject cdolist_list_var = destructible_problems;
        SubLObject problem = NIL;
        problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            inference_datastructures_problem.destroy_problem(problem);
            cdolist_list_var = cdolist_list_var.rest();
            problem = cdolist_list_var.first();
        }
        return Sequences.length(destructible_problems);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 199800L)
    public static SubLObject recompute_destructible_problems(SubLObject store, SubLObject consider_deepP) {
        if (consider_deepP == UNPROVIDED) {
            consider_deepP = T;
        }
        inference_datastructures_problem_store.reset_problem_store_janitor(store);
        SubLObject janitor = inference_datastructures_problem_store.problem_store_janitor(store);
        if (NIL != consider_deepP) {
            consider_deep_no_goodness(janitor);
        }
        inference_datastructures_problem_store.problem_store_janitor_note_unstale(janitor);
        compute_indestructible_problems_from_inferences(janitor);
        compute_indestructible_problems_due_to_proofs(janitor);
        compute_indestructible_problems_due_to_strategic_activity(janitor);
        compute_indestructible_problems_due_to_potentially_useful_transformation_link(janitor);
        note_all_root_problems_indestructible(janitor);
        return inference_datastructures_problem_store.problem_store_janitor_destructible_problem_count(janitor);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 200500L)
    public static SubLObject consider_deep_no_goodness(SubLObject janitor) {
        SubLObject store = inference_datastructures_problem_store.problem_store_janitor_store(janitor);
        SubLObject old_no_good_count = inference_datastructures_problem_store.problem_store_no_good_problem_count(store);
        compute_problem_store_min_depth_index(store);
        SubLObject all_problems = NIL;
        SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$96 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$96, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$96);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        all_problems = cons(problem, all_problems);
                    }
                }
            }
            SubLObject idx_$97 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$97)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$97);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        all_problems = cons(problem2, all_problems);
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        SubLObject cdolist_list_var;
        all_problems = (cdolist_list_var = Sort.sort(all_problems, Symbols.symbol_function($sym197$_), $sym198$PROBLEM_MIN_DEPTH));
        SubLObject problem3 = NIL;
        problem3 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            consider_that_problem_could_be_no_good(problem3, T, $TACTICAL, T);
            cdolist_list_var = cdolist_list_var.rest();
            problem3 = cdolist_list_var.first();
        }
        SubLObject new_no_good_count = inference_datastructures_problem_store.problem_store_no_good_problem_count(store);
        return Numbers.subtract(new_no_good_count, old_no_good_count);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 201500L)
    public static SubLObject compute_problem_store_min_depth_index(SubLObject store) {
        inference_datastructures_problem_store.reset_problem_store_min_depth_index(store);
        SubLObject todo_queue = queues.create_queue(UNPROVIDED);
        SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$98 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$98, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$98);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.problem_has_answer_link_p(problem) || NIL == inference_datastructures_problem.problem_has_dependent_link_p(problem)) {
                            inference_datastructures_problem.set_problem_min_depth(problem, ZERO_INTEGER);
                            queues.enqueue(problem, todo_queue);
                        }
                    }
                }
            }
            SubLObject idx_$99 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$99)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$99);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.problem_has_answer_link_p(problem2) || NIL == inference_datastructures_problem.problem_has_dependent_link_p(problem2)) {
                            inference_datastructures_problem.set_problem_min_depth(problem2, ZERO_INTEGER);
                            queues.enqueue(problem2, todo_queue);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        while (NIL == queues.queue_empty_p(todo_queue)) {
            SubLObject problem3 = queues.dequeue(todo_queue);
            SubLObject depth = inference_datastructures_problem.problem_min_depth(problem3);
            SubLObject new_supporting_depth = number_utilities.f_1X(depth);
            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem3);
            SubLObject basis_object;
            SubLObject state;
            SubLObject link;
            SubLObject link_var;
            SubLObject cdolist_list_var;
            SubLObject supporting_mapped_problem;
            SubLObject supporting_problem;
            SubLObject variable_map;
            SubLObject supporting_depth;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                    state); state = set_contents.do_set_contents_update_state(state)) {
                link = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                    link_var = link;
                    cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                    supporting_mapped_problem = NIL;
                    supporting_mapped_problem = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem)) {
                            supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                            variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                            supporting_depth = inference_datastructures_problem.problem_min_depth(supporting_problem);
                            if ($UNDETERMINED == supporting_depth || new_supporting_depth.numL(supporting_depth)) {
                                inference_datastructures_problem.set_problem_min_depth(supporting_problem, new_supporting_depth);
                                queues.enqueue(supporting_problem, todo_queue);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        supporting_mapped_problem = cdolist_list_var.first();
                    }
                }
            }
        }
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 202500L)
    public static SubLObject compute_indestructible_problems_from_inferences(SubLObject janitor) {
        SubLObject store = inference_datastructures_problem_store.problem_store_janitor_store(janitor);
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$100 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$100, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$100);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                SubLObject root_problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        root_problem = inference_datastructures_inference.inference_root_problem(inference);
                        possibly_propagate_problem_indestructible(root_problem);
                    }
                }
            }
            SubLObject idx_$101 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$101)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$101);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        SubLObject root_problem2 = inference_datastructures_inference.inference_root_problem(inference2);
                        possibly_propagate_problem_indestructible(root_problem2);
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return inference_datastructures_problem_store.problem_store_janitor_destructible_problem_count(janitor);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 203000L)
    public static SubLObject possibly_propagate_problem_indestructible(SubLObject problem) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject _prev_bind_0 = $possibly_propagate_problem_indestructible_stack$.currentBinding(thread);
        try {
            $possibly_propagate_problem_indestructible_stack$.bind(NIL, thread);
            possibly_propagate_problem_indestructible_int(problem);
        } finally {
            $possibly_propagate_problem_indestructible_stack$.rebind(_prev_bind_0, thread);
        }
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 203200L)
    public static SubLObject possibly_propagate_problem_indestructible_int(SubLObject problem) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == inference_datastructures_problem.problem_indestructibleP(problem)) {
            SubLObject _prev_bind_0 = $possibly_propagate_problem_indestructible_stack$.currentBinding(thread);
            try {
                $possibly_propagate_problem_indestructible_stack$.bind(cons(problem, $possibly_propagate_problem_indestructible_stack$.getDynamicValue(thread)), thread);
                possibly_note_problem_indestructible(problem);
                SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
                SubLObject basis_object;
                SubLObject state;
                SubLObject argument_link;
                SubLObject link_var;
                SubLObject cdolist_list_var;
                SubLObject supporting_mapped_problem;
                SubLObject subproblem;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                        state); state = set_contents.do_set_contents_update_state(state)) {
                    argument_link = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, argument_link)) {
                        link_var = argument_link;
                        cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                        supporting_mapped_problem = NIL;
                        supporting_mapped_problem = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem) && NIL == compute_problem_link_destructibleP(argument_link)) {
                                subproblem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                                if (NIL == list_utilities.member_eqP(subproblem, $possibly_propagate_problem_indestructible_stack$.getDynamicValue(thread))) {
                                    possibly_propagate_problem_indestructible_int(subproblem);
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            supporting_mapped_problem = cdolist_list_var.first();
                        }
                    }
                }
            } finally {
                $possibly_propagate_problem_indestructible_stack$.rebind(_prev_bind_0, thread);
            }
        }
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 204100L)
    public static SubLObject possibly_note_problem_indestructible(SubLObject problem) {
        if (NIL != problem_should_be_indestructibleP(problem)) {
            inference_datastructures_problem.note_problem_indestructible(problem);
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 204300L)
    public static SubLObject compute_problem_link_destructibleP(SubLObject link) {
        if (NIL != problem_link_closed_foreverP(link)) {
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 204400L)
    public static SubLObject problem_link_closed_foreverP(SubLObject link) {
        if (NIL != inference_datastructures_problem_link.problem_link_closedP(link)) {
            SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
            return makeBoolean(
                    NIL != inference_datastructures_problem.tactically_examined_problem_p(supported_problem) || NIL != inference_datastructures_problem.tactically_pending_problem_p(supported_problem) || NIL != inference_datastructures_problem.tactically_finished_problem_p(supported_problem));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 204900L)
    public static SubLObject problem_link_closed_forever_wrt_supporting_mapped_problemP(SubLObject link, SubLObject supporting_mapped_problem) {
        return makeBoolean(NIL != problem_link_closed_foreverP(link) || (NIL != inference_worker_join_ordered.join_ordered_link_p(link) && supporting_mapped_problem.eql(inference_worker_join_ordered.join_ordered_link_non_focal_mapped_problem(link))));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 205100L)
    public static SubLObject problem_should_be_indestructibleP(SubLObject problem) {
        if (NIL == inference_datastructures_problem.tactically_no_good_problem_p(problem) && NIL == variant_problemP(problem)) {
            return T;
        }
        if (NIL != inference_worker_residual_transformation.problem_is_a_residual_conjunctionP(problem)) {
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 205700L)
    public static SubLObject variant_problemP(SubLObject problem) {
        return makeBoolean(NIL != inference_datastructures_problem.tactically_good_problem_p(problem) && inference_datastructures_problem.problem_proof_count(problem, $PROVEN).isZero()
                && (NIL != inference_datastructures_problem.tactically_finished_problem_p(problem) || (NIL != inference_datastructures_problem.tactically_possible_problem_p(problem) && NIL != inference_datastructures_problem.problem_has_no_tacticsP(problem))));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 206200L)
    public static SubLObject problem_store_janitor_destructible_problem_list(SubLObject janitor) {
        SubLObject destructible_problems = NIL;
        SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(inference_datastructures_problem_store.problem_store_janitor_store(janitor));
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$102 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$102, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$102);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.problem_destructibleP(problem)) {
                            destructible_problems = cons(problem, destructible_problems);
                        }
                    }
                }
            }
            SubLObject idx_$103 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$103)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$103);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.problem_destructibleP(problem2)) {
                            destructible_problems = cons(problem2, destructible_problems);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        destructible_problems = Sequences.nreverse(destructible_problems);
        return destructible_problems;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 206600L)
    public static SubLObject note_all_root_problems_indestructible(SubLObject janitor) {
        SubLObject store = inference_datastructures_problem_store.problem_store_janitor_store(janitor);
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$104 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$104, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$104);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                SubLObject root_problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        root_problem = inference_datastructures_inference.inference_root_problem(inference);
                        inference_datastructures_problem.note_problem_indestructible(root_problem);
                    }
                }
            }
            SubLObject idx_$105 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$105)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$105);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        SubLObject root_problem2 = inference_datastructures_inference.inference_root_problem(inference2);
                        inference_datastructures_problem.note_problem_indestructible(root_problem2);
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return inference_datastructures_problem_store.problem_store_janitor_indestructible_problem_count(janitor);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 206900L)
    public static SubLObject compute_indestructible_problems_due_to_proofs(SubLObject janitor) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject store = inference_datastructures_problem_store.problem_store_janitor_store(janitor);
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$106 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$106, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$106);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                SubLObject root_problem;
                SubLObject status_var;
                SubLObject iteration_state;
                SubLObject v_bindings;
                SubLObject proof_list;
                SubLObject cdolist_list_var;
                SubLObject proof;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        root_problem = inference_datastructures_inference.inference_root_problem(inference);
                        if (NIL != root_problem) {
                            status_var = $PROVEN;
                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(inference_datastructures_problem.problem_proof_bindings_index(root_problem)); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                    iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                thread.resetMultipleValues();
                                v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                proof_list = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                cdolist_list_var = proof_list;
                                proof = NIL;
                                proof = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    if (NIL != inference_datastructures_problem.proof_has_statusP(proof, status_var)) {
                                        propagate_proof_indestructibility(proof);
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    proof = cdolist_list_var.first();
                                }
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        }
                    }
                }
            }
            SubLObject idx_$107 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$107)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$107);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        SubLObject root_problem2 = inference_datastructures_inference.inference_root_problem(inference2);
                        if (NIL != root_problem2) {
                            SubLObject status_var2 = $PROVEN;
                            SubLObject iteration_state2;
                            for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(inference_datastructures_problem.problem_proof_bindings_index(root_problem2)); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                    iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                thread.resetMultipleValues();
                                SubLObject v_bindings2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                SubLObject proof_list2 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                SubLObject cdolist_list_var2 = proof_list2;
                                SubLObject proof2 = NIL;
                                proof2 = cdolist_list_var2.first();
                                while (NIL != cdolist_list_var2) {
                                    if (NIL != inference_datastructures_problem.proof_has_statusP(proof2, status_var2)) {
                                        propagate_proof_indestructibility(proof2);
                                    }
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    proof2 = cdolist_list_var2.first();
                                }
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return inference_datastructures_problem_store.problem_store_janitor_indestructible_problem_count(janitor);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 207400L)
    public static SubLObject propagate_proof_indestructibility(SubLObject proof) {
        if (NIL == inference_datastructures_proof.proof_indestructibleP(proof)) {
            SubLObject problem = inference_datastructures_proof.proof_supported_problem(proof);
            inference_datastructures_problem.note_problem_indestructible(problem);
            SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
            SubLObject subproof = NIL;
            subproof = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                propagate_proof_indestructibility(subproof);
                cdolist_list_var = cdolist_list_var.rest();
                subproof = cdolist_list_var.first();
            }
        }
        return proof;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 207700L)
    public static SubLObject compute_indestructible_problems_due_to_strategic_activity(SubLObject janitor) {
        SubLObject store = inference_datastructures_problem_store.problem_store_janitor_store(janitor);
        SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$108 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$108, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$108);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.problem_active_in_some_strategyP(problem)) {
                            inference_datastructures_problem.note_problem_indestructible(problem);
                        }
                    }
                }
            }
            SubLObject idx_$109 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$109)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$109);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.problem_active_in_some_strategyP(problem2)) {
                            inference_datastructures_problem.note_problem_indestructible(problem2);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        SubLObject current_tactic = currently_executing_tactic();
        if (NIL != current_tactic && store.eql(inference_datastructures_tactic.tactic_store(current_tactic))) {
            inference_datastructures_problem.note_problem_indestructible(inference_datastructures_tactic.tactic_problem(current_tactic));
        }
        return inference_datastructures_problem_store.problem_store_janitor_indestructible_problem_count(janitor);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 208400L)
    public static SubLObject compute_indestructible_problems_due_to_potentially_useful_transformation_link(SubLObject janitor) {
        SubLObject store = inference_datastructures_problem_store.problem_store_janitor_store(janitor);
        SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$110 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$110, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$110);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                SubLObject problem_has_potentially_useful_transformation_linkP;
                SubLObject set_contents_var;
                SubLObject basis_object;
                SubLObject state;
                SubLObject t_link;
                SubLObject problem_t_link_supported_problem;
                SubLObject set_contents_var_$111;
                SubLObject basis_object_$112;
                SubLObject state_$113;
                SubLObject jo_link;
                SubLObject problem_jo_link_supported_problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        problem_has_potentially_useful_transformation_linkP = NIL;
                        set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == problem_has_potentially_useful_transformation_linkP
                                && NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                            t_link = set_contents.do_set_contents_next(basis_object, state);
                            if (NIL != set_contents.do_set_contents_element_validP(state, t_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(t_link, $TRANSFORMATION)) {
                                problem_t_link_supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(t_link);
                                set_contents_var_$111 = inference_datastructures_problem.problem_dependent_links(problem_t_link_supported_problem);
                                for (basis_object_$112 = set_contents.do_set_contents_basis_object(set_contents_var_$111), state_$113 = NIL, state_$113 = set_contents.do_set_contents_initial_state(basis_object_$112, set_contents_var_$111); NIL == problem_has_potentially_useful_transformation_linkP
                                        && NIL == set_contents.do_set_contents_doneP(basis_object_$112, state_$113); state_$113 = set_contents.do_set_contents_update_state(state_$113)) {
                                    jo_link = set_contents.do_set_contents_next(basis_object_$112, state_$113);
                                    if (NIL != set_contents.do_set_contents_element_validP(state_$113, jo_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link, $JOIN_ORDERED)) {
                                        problem_jo_link_supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(jo_link);
                                        if (NIL == inference_datastructures_problem.tactically_finished_problem_p(problem_jo_link_supported_problem)) {
                                            problem_has_potentially_useful_transformation_linkP = T;
                                        }
                                    }
                                }
                            }
                        }
                        if (NIL != problem_has_potentially_useful_transformation_linkP) {
                            inference_datastructures_problem.note_problem_indestructible(problem);
                        }
                    }
                }
            }
            SubLObject idx_$111 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$111)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$111);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        SubLObject problem_has_potentially_useful_transformation_linkP2 = NIL;
                        SubLObject set_contents_var2 = inference_datastructures_problem.problem_dependent_links(problem2);
                        SubLObject basis_object2;
                        SubLObject state2;
                        SubLObject t_link2;
                        SubLObject problem_t_link_supported_problem2;
                        SubLObject set_contents_var_$112;
                        SubLObject basis_object_$113;
                        SubLObject state_$114;
                        SubLObject jo_link2;
                        SubLObject problem_jo_link_supported_problem2;
                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == problem_has_potentially_useful_transformation_linkP2
                                && NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                            t_link2 = set_contents.do_set_contents_next(basis_object2, state2);
                            if (NIL != set_contents.do_set_contents_element_validP(state2, t_link2) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(t_link2, $TRANSFORMATION)) {
                                problem_t_link_supported_problem2 = inference_datastructures_problem_link.problem_link_supported_problem(t_link2);
                                set_contents_var_$112 = inference_datastructures_problem.problem_dependent_links(problem_t_link_supported_problem2);
                                for (basis_object_$113 = set_contents.do_set_contents_basis_object(set_contents_var_$112), state_$114 = NIL, state_$114 = set_contents.do_set_contents_initial_state(basis_object_$113, set_contents_var_$112); NIL == problem_has_potentially_useful_transformation_linkP2
                                        && NIL == set_contents.do_set_contents_doneP(basis_object_$113, state_$114); state_$114 = set_contents.do_set_contents_update_state(state_$114)) {
                                    jo_link2 = set_contents.do_set_contents_next(basis_object_$113, state_$114);
                                    if (NIL != set_contents.do_set_contents_element_validP(state_$114, jo_link2) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link2, $JOIN_ORDERED)) {
                                        problem_jo_link_supported_problem2 = inference_datastructures_problem_link.problem_link_supported_problem(jo_link2);
                                        if (NIL == inference_datastructures_problem.tactically_finished_problem_p(problem_jo_link_supported_problem2)) {
                                            problem_has_potentially_useful_transformation_linkP2 = T;
                                        }
                                    }
                                }
                            }
                        }
                        if (NIL != problem_has_potentially_useful_transformation_linkP2) {
                            inference_datastructures_problem.note_problem_indestructible(problem2);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return inference_datastructures_problem_store.problem_store_janitor_indestructible_problem_count(janitor);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 209700L)
    public static SubLObject possibly_prune_processed_problems(SubLObject store) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total_pruned = ZERO_INTEGER;
        SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state(store);
        SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject space_var = inference_datastructures_problem_store.problem_store_sbhl_resource_space(store);
                SubLObject _prev_bind_0_$118 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(space_var, thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                    try {
                        SubLObject root_proofs = inference_datastructures_problem_store.problem_store_all_processed_proofs(store);
                        SubLObject _prev_bind_0_$119 = inference_datastructures_problem_store.$problem_store_modification_permittedP$.currentBinding(thread);
                        try {
                            inference_datastructures_problem_store.$problem_store_modification_permittedP$.bind(T, thread);
                            SubLObject cdolist_list_var = root_proofs;
                            SubLObject root_proof = NIL;
                            root_proof = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                inference_datastructures_problem_store.problem_store_note_proof_unprocessed(store, root_proof);
                                thread.resetMultipleValues();
                                SubLObject pruned_link_count = possibly_prune_wrt_conjunctive_removal(root_proof);
                                SubLObject pruned_problem_count = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                total_pruned = Numbers.add(total_pruned, pruned_link_count);
                                total_pruned = Numbers.add(total_pruned, pruned_problem_count);
                                cdolist_list_var = cdolist_list_var.rest();
                                root_proof = cdolist_list_var.first();
                            }
                        } finally {
                            inference_datastructures_problem_store.$problem_store_modification_permittedP$.rebind(_prev_bind_0_$119, thread);
                        }
                    } finally {
                        SubLObject _prev_bind_0_$120 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                            SubLObject _values = Values.getValuesAsVector();
                            space_var = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                            Values.restoreValuesFromVector(_values);
                        } finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$120, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_3, thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0_$118, thread);
                }
                inference_datastructures_problem_store.set_problem_store_sbhl_resource_space(store, space_var);
            } finally {
                SubLObject _prev_bind_0_$121 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values2 = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values2);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$121, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return total_pruned;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 210800L)
    public static SubLObject possibly_prune_wrt_conjunctive_removal(SubLObject proof) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject links = prunable_objects_wrt_conjunctive_removal(proof);
        SubLObject focal_problems = thread.secondMultipleValue();
        SubLObject non_focal_problems = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = links;
        SubLObject link = NIL;
        link = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            inference_datastructures_problem_link.destroy_problem_link(link);
            cdolist_list_var = cdolist_list_var.rest();
            link = cdolist_list_var.first();
        }
        cdolist_list_var = focal_problems;
        SubLObject problem = NIL;
        problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            inference_datastructures_problem.destroy_problem(problem);
            cdolist_list_var = cdolist_list_var.rest();
            problem = cdolist_list_var.first();
        }
        cdolist_list_var = non_focal_problems;
        problem = NIL;
        problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$122 = inference_datastructures_problem.problem_tactics(problem);
            SubLObject tactic = NIL;
            tactic = cdolist_list_var_$122.first();
            while (NIL != cdolist_list_var_$122) {
                if (NIL != inference_datastructures_tactic.tactic_in_progressP(tactic)) {
                    Errors.warn($str200$destroying_in_progress_tactic__a, tactic);
                }
                cdolist_list_var_$122 = cdolist_list_var_$122.rest();
                tactic = cdolist_list_var_$122.first();
            }
            inference_datastructures_problem.destroy_problem(problem);
            cdolist_list_var = cdolist_list_var.rest();
            problem = cdolist_list_var.first();
        }
        return Values.values(Sequences.length(links), Numbers.add(Sequences.length(focal_problems), Sequences.length(non_focal_problems)));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 211500L)
    public static SubLObject prunable_objects_wrt_conjunctive_removal(SubLObject proof) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject proof_tuples = compute_conjunctive_removal_proof_tuples(proof);
        SubLObject prunable_conjunctive_removal_links = set_contents.new_set_contents(ZERO_INTEGER, Symbols.symbol_function(EQ));
        SubLObject prunable_conjunctive_removal_problems = set_contents.new_set_contents(ZERO_INTEGER, Symbols.symbol_function(EQ));
        SubLObject prunable_restricted_non_focal_problems = set_contents.new_set_contents(ZERO_INTEGER, Symbols.symbol_function(EQ));
        SubLObject cdolist_list_var = proof_tuples;
        SubLObject proof_tuple = NIL;
        proof_tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = proof_tuple;
            SubLObject conjunctive_removal_proof = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list201);
            conjunctive_removal_proof = current.first();
            SubLObject join_ordered_proofs;
            current = (join_ordered_proofs = current.rest());
            if (NIL == join_ordered_proofs) {
                thread.resetMultipleValues();
                SubLObject prunable_conjunctive_removal_links_$123 = update_prunable_conjunctive_removal_objects(conjunctive_removal_proof, prunable_conjunctive_removal_links, prunable_conjunctive_removal_problems);
                SubLObject prunable_conjunctive_removal_problems_$124 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                prunable_conjunctive_removal_links = prunable_conjunctive_removal_links_$123;
                prunable_conjunctive_removal_problems = prunable_conjunctive_removal_problems_$124;
            }
            SubLObject cdolist_list_var_$125 = join_ordered_proofs;
            SubLObject join_ordered_proof = NIL;
            join_ordered_proof = cdolist_list_var_$125.first();
            while (NIL != cdolist_list_var_$125) {
                SubLObject current_$127;
                SubLObject datum_$126 = current_$127 = inference_datastructures_proof.proof_direct_subproofs(join_ordered_proof);
                SubLObject focal_proof = NIL;
                SubLObject non_focal_proof = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$127, datum_$126, $list202);
                focal_proof = current_$127.first();
                current_$127 = current_$127.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$127, datum_$126, $list202);
                non_focal_proof = current_$127.first();
                current_$127 = current_$127.rest();
                if (NIL == current_$127) {
                    SubLObject restricted_non_focal_proof = inference_datastructures_proof.proof_sole_subproof(non_focal_proof);
                    SubLObject restricted_non_focal_problem = inference_datastructures_proof.proof_supported_problem(restricted_non_focal_proof);
                    SubLObject proof_subproblems = listS(restricted_non_focal_problem, inference_datastructures_problem.all_problem_argument_problems(inference_datastructures_proof.proof_supported_problem(non_focal_proof)));
                    if (NIL == inference_datastructures_problem.any_problem_has_an_in_progress_tacticP(proof_subproblems)) {
                        thread.resetMultipleValues();
                        SubLObject prunable_conjunctive_removal_links_$124 = update_prunable_conjunctive_removal_objects(conjunctive_removal_proof, prunable_conjunctive_removal_links, prunable_conjunctive_removal_problems);
                        SubLObject prunable_conjunctive_removal_problems_$125 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        prunable_conjunctive_removal_links = prunable_conjunctive_removal_links_$124;
                        prunable_conjunctive_removal_problems = prunable_conjunctive_removal_problems_$125;
                        if (ONE_INTEGER.numE(inference_datastructures_problem.problem_dependent_link_count(restricted_non_focal_problem))) {
                            SubLObject isolated_problems = isolated_problem_subset(proof_subproblems);
                            SubLObject isolated_finished_problems = finished_problem_subset(isolated_problems);
                            prunable_restricted_non_focal_problems = set_contents.set_contents_add(restricted_non_focal_problem, prunable_restricted_non_focal_problems, Symbols.symbol_function(EQ));
                            SubLObject cdolist_list_var_$126 = isolated_finished_problems;
                            SubLObject problem = NIL;
                            problem = cdolist_list_var_$126.first();
                            while (NIL != cdolist_list_var_$126) {
                                prunable_restricted_non_focal_problems = set_contents.set_contents_add(problem, prunable_restricted_non_focal_problems, Symbols.symbol_function(EQ));
                                cdolist_list_var_$126 = cdolist_list_var_$126.rest();
                                problem = cdolist_list_var_$126.first();
                            }
                        }
                    }
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$126, $list202);
                }
                cdolist_list_var_$125 = cdolist_list_var_$125.rest();
                join_ordered_proof = cdolist_list_var_$125.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            proof_tuple = cdolist_list_var.first();
        }
        SubLObject removal_links = Sort.sort(set_contents.set_contents_element_list(prunable_conjunctive_removal_links), Symbols.symbol_function($sym203$_), Symbols.symbol_function($sym204$PROBLEM_LINK_SUID));
        SubLObject removal_problems = Sort.sort(set_contents.set_contents_element_list(prunable_conjunctive_removal_problems), Symbols.symbol_function($sym203$_), Symbols.symbol_function($sym205$PROBLEM_SUID));
        SubLObject restricted_non_focal_problems = Sort.sort(set_contents.set_contents_element_list(prunable_restricted_non_focal_problems), Symbols.symbol_function($sym203$_), Symbols.symbol_function($sym205$PROBLEM_SUID));
        return Values.values(removal_links, removal_problems, restricted_non_focal_problems);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 214500L)
    public static SubLObject update_prunable_conjunctive_removal_objects(SubLObject conjunctive_removal_proof, SubLObject prunable_links, SubLObject prunable_problems) {
        SubLObject removal_link = inference_datastructures_proof.proof_link(conjunctive_removal_proof);
        if (NIL != inference_datastructures_proof.proof_bindings(conjunctive_removal_proof)) {
            prunable_links = set_contents.set_contents_add(removal_link, prunable_links, Symbols.symbol_function(EQ));
        } else {
            SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(removal_link);
            if (NIL != inference_datastructures_problem.tactically_unexamined_problem_p(supported_problem)) {
                prunable_problems = set_contents.set_contents_add(supported_problem, prunable_problems, Symbols.symbol_function(EQ));
            }
        }
        return Values.values(prunable_links, prunable_problems);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 215100L)
    public static SubLObject compute_conjunctive_removal_proof_tuples(SubLObject proof) {
        SubLObject tuples = NIL;
        if (NIL != inference_datastructures_proof.valid_proof_p(proof)) {
            SubLObject all_subproofs = inference_datastructures_proof.all_proof_subproofs(proof);
            SubLObject conjunctive_removal_proofs = list_utilities.remove_if_not(Symbols.symbol_function($sym206$CONJUNCTIVE_REMOVAL_PROOF_P), all_subproofs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != conjunctive_removal_proofs) {
                SubLObject cdolist_list_var = conjunctive_removal_proofs;
                SubLObject conjunctive_removal_proof = NIL;
                conjunctive_removal_proof = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject join_ordered_proofs = NIL;
                    SubLObject csome_list_var = inference_datastructures_proof.proof_dependents(conjunctive_removal_proof);
                    SubLObject join_ordered_proof = NIL;
                    join_ordered_proof = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        if (NIL != inference_datastructures_problem.proof_has_statusP(join_ordered_proof, NIL) && NIL != inference_worker_join_ordered.join_ordered_proof_p(join_ordered_proof) && NIL != list_utilities.member_eqP(join_ordered_proof, all_subproofs)) {
                            SubLObject current;
                            SubLObject datum = current = inference_datastructures_proof.proof_direct_subproofs(join_ordered_proof);
                            SubLObject focal_proof = NIL;
                            SubLObject non_focal_proof = NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list202);
                            focal_proof = current.first();
                            current = current.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list202);
                            non_focal_proof = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (conjunctive_removal_proof.eql(focal_proof) && NIL != inference_worker_restriction.restriction_proof_p(non_focal_proof) && NIL != list_utilities.member_eqP(non_focal_proof, all_subproofs)) {
                                    SubLObject item_var = join_ordered_proof;
                                    if (NIL == conses_high.member(item_var, join_ordered_proofs, Symbols.symbol_function(EQ), Symbols.symbol_function(IDENTITY))) {
                                        join_ordered_proofs = cons(item_var, join_ordered_proofs);
                                    }
                                }
                            } else {
                                cdestructuring_bind.cdestructuring_bind_error(datum, $list202);
                            }
                        }
                        csome_list_var = csome_list_var.rest();
                        join_ordered_proof = csome_list_var.first();
                    }
                    join_ordered_proofs = Sort.sort(join_ordered_proofs, Symbols.symbol_function($sym203$_), Symbols.symbol_function($sym207$PROOF_SUID));
                    SubLObject tuple = listS(conjunctive_removal_proof, join_ordered_proofs);
                    tuples = cons(tuple, tuples);
                    cdolist_list_var = cdolist_list_var.rest();
                    conjunctive_removal_proof = cdolist_list_var.first();
                }
                tuples = Sequences.nreverse(tuples);
            }
        }
        return tuples;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 216700L)
    public static SubLObject isolated_problem_subset(SubLObject problems) {
        SubLObject isolated_problems = NIL;
        SubLObject cdolist_list_var = problems;
        SubLObject candidate_problem = NIL;
        candidate_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != problem_isolated_wrt_problemsP(candidate_problem, problems)) {
                isolated_problems = cons(candidate_problem, isolated_problems);
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate_problem = cdolist_list_var.first();
        }
        return Sequences.nreverse(isolated_problems);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 217000L)
    public static SubLObject problem_isolated_wrt_problemsP(SubLObject candidate_problem, SubLObject problems) {
        SubLObject witness = NIL;
        SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(candidate_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject dependent_link;
        SubLObject supported_problem;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == witness
                && NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            dependent_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, dependent_link)) {
                supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(dependent_link);
                if (NIL == list_utilities.member_eqP(supported_problem, problems)) {
                    witness = supported_problem;
                }
            }
        }
        return makeBoolean(NIL == witness);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 217400L)
    public static SubLObject finished_problem_subset(SubLObject problems) {
        SubLObject unfinished_problems = Mapping.mapcar($sym208$PROBLEM_HAS_AN_IN_PROGRESS_TACTIC_, problems);
        return list_utilities.fast_set_difference(problems, unfinished_problems, Symbols.symbol_function(EQ));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 217700L)
    public static SubLObject possibly_note_eager_pruning_problem(SubLObject problem) {
        return ZERO_INTEGER;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 218100L)
    public static SubLObject possibly_prune_processed_proofs(SubLObject store) {
        problem_store_compute_proof_keeping_problems(store);
        SubLObject removal_strategies = problem_store_removal_strategies(store);
        SubLObject processed_objects = problem_store_all_processed_objects(store, removal_strategies);
        SubLObject pruned_object_count = ZERO_INTEGER;
        SubLObject cdolist_list_var = processed_objects;
        SubLObject v_object = NIL;
        v_object = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != possibly_prune_processed_object(v_object)) {
                pruned_object_count = Numbers.add(pruned_object_count, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_object = cdolist_list_var.first();
        }
        return pruned_object_count;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 218600L)
    public static SubLObject problem_store_all_processed_objects(SubLObject store, SubLObject removal_strategies) {
        SubLObject processed_proofs = inference_datastructures_problem_store.problem_store_processed_proofs(store);
        SubLObject candidate_problems = set.set_element_list(inference_datastructures_problem_store.problem_store_potentially_processed_problems(store));
        SubLObject candidate_links = NIL;
        SubLObject set_contents_var = set.do_set_internal(processed_proofs);
        SubLObject basis_object;
        SubLObject state;
        SubLObject proof;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            proof = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, proof)) {
                candidate_problems = cons(inference_datastructures_proof.proof_supported_problem(proof), candidate_problems);
                candidate_links = cons(inference_datastructures_proof.proof_link(proof), candidate_links);
            }
        }
        candidate_problems = Sort.sort(candidate_problems, Symbols.symbol_function($sym203$_), Symbols.symbol_function($sym205$PROBLEM_SUID));
        candidate_links = Sort.sort(candidate_links, Symbols.symbol_function($sym203$_), Symbols.symbol_function($sym204$PROBLEM_LINK_SUID));
        SubLObject processed_problems = NIL;
        SubLObject processed_links = NIL;
        SubLObject last_seen = NIL;
        SubLObject cdolist_list_var = candidate_problems;
        SubLObject problem = NIL;
        problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!problem.eql(last_seen)) {
                last_seen = problem;
                if (NIL != problem_processedP(problem, removal_strategies)) {
                    processed_problems = cons(problem, processed_problems);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            problem = cdolist_list_var.first();
        }
        cdolist_list_var = candidate_links;
        SubLObject link = NIL;
        link = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!link.eql(last_seen)) {
                last_seen = link;
                if (NIL != link_processedP(link)) {
                    processed_links = cons(link, processed_links);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            link = cdolist_list_var.first();
        }
        return nconc(Sequences.nreverse(processed_problems), Sequences.nreverse(processed_links));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 219800L)
    public static SubLObject problem_processedP(SubLObject problem, SubLObject removal_strategies) {
        return makeBoolean(NIL != inference_datastructures_problem.tactically_good_problem_p(problem) && NIL != problem_has_no_motivation_other_than_removalP(problem) && NIL != problem_not_in_progress_wrt_removalP(problem, removal_strategies) && NIL != all_problem_proofs_are_processedP(problem));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 220100L)
    public static SubLObject link_processedP(SubLObject link) {
        return all_link_proofs_are_processedP(link);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 220200L)
    public static SubLObject possibly_prune_processed_object(SubLObject v_object) {
        if (NIL != inference_datastructures_problem.problem_p(v_object)) {
            if (NIL != prunable_processed_problemP(v_object)) {
                inference_datastructures_problem.destroy_problem(v_object);
                return T;
            }
        } else if (NIL != prunable_processed_linkP(v_object)) {
            inference_datastructures_problem_link.destroy_problem_link(v_object);
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 220500L)
    public static SubLObject problem_is_the_root_problem_of_some_inferenceP(SubLObject problem) {
        return inference_datastructures_problem.problem_has_dependent_link_of_typeP(problem, $ANSWER);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 220600L)
    public static SubLObject consider_pruning_ramifications_of_ignored_strategem(SubLObject strategy, SubLObject strategem) {
        if (NIL != inference_worker_removal.conjunctive_removal_tactic_p(strategem) && NIL != inference_datastructures_tactic.tactic_executedP(strategem)
                && NIL == inference_datastructures_problem_store.problem_store_compute_answer_justificationsP(inference_datastructures_tactic.tactic_store(strategem))) {
            SubLObject problem = inference_datastructures_tactic.tactic_problem(strategem);
            if (NIL != inference_datastructures_problem.tactically_good_problem_p(problem) && NIL != inference_datastructures_problem.tactically_finished_problem_p(problem) && NIL == problem_is_the_root_problem_of_some_inferenceP(problem)
                    && NIL == Sequences.find_if($sym209$SPLIT_LINK_P, inference_datastructures_problem.problem_all_dependent_links(problem), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                inference_datastructures_problem.destroy_problem(problem);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 221300L)
    public static SubLObject prunable_processed_problemP(SubLObject problem) {
        if (ONE_INTEGER.numE(inference_datastructures_problem.problem_dependent_link_count(problem)) && NIL == inference_datastructures_problem_store.proof_keeping_problemP(problem)) {
            SubLObject restriction_link = inference_datastructures_problem.problem_sole_dependent_link(problem);
            if (NIL != inference_worker_restriction.restriction_link_p(restriction_link)) {
                SubLObject unrestricted_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
                SubLObject has_a_siblingP = NIL;
                if (inference_datastructures_problem.problem_dependent_link_count(unrestricted_problem).numE(ONE_INTEGER) && NIL != inference_worker_transformation.transformation_link_p(inference_datastructures_problem.problem_sole_dependent_link(unrestricted_problem))
                        && NIL != inference_datastructures_problem.problem_has_an_in_progress_complete_removal_tacticP(unrestricted_problem, $TACTICAL)) {
                    return T;
                }
                SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(unrestricted_problem);
                SubLObject basis_object;
                SubLObject state;
                SubLObject jo_link;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                        state); state = set_contents.do_set_contents_update_state(state)) {
                    jo_link = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, jo_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link, $JOIN_ORDERED)) {
                        if (NIL == has_a_siblingP && NIL != restricted_non_focal_with_siblingP(jo_link, restriction_link)) {
                            has_a_siblingP = T;
                        }
                        if (NIL != restricted_focal_with_siblingP(jo_link, unrestricted_problem)) {
                            has_a_siblingP = T;
                            if (NIL != corresponding_restricted_non_focal_unfinishedP(restriction_link, jo_link)) {
                                return NIL;
                            }
                        }
                    }
                }
                return has_a_siblingP;
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 222600L)
    public static SubLObject all_dependent_proofs_have_siblingsP(SubLObject problem) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject only_childP = NIL;
        SubLObject status_var = $PROVEN;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(inference_datastructures_problem.problem_proof_bindings_index(problem)); NIL == only_childP
                && NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            SubLObject proof_list = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject rest;
            SubLObject proof;
            for (rest = NIL, rest = proof_list; NIL == only_childP && NIL != rest; rest = rest.rest()) {
                proof = rest.first();
                if (NIL != inference_datastructures_problem.proof_has_statusP(proof, status_var)) {
                    only_childP = makeBoolean(NIL == all_dependent_proofs_have_siblings_int(proof));
                }
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return makeBoolean(NIL == only_childP);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 223000L)
    public static SubLObject all_dependent_proofs_have_siblings_int(SubLObject proof) {
        if (inference_datastructures_problem.problem_proof_count(inference_datastructures_proof.proof_supported_problem(proof), UNPROVIDED).numL(TWO_INTEGER)) {
            return NIL;
        }
        SubLObject csome_list_var = inference_datastructures_proof.proof_dependents(proof);
        SubLObject dependent_proof = NIL;
        dependent_proof = csome_list_var.first();
        while (NIL != csome_list_var) {
            if (NIL != inference_datastructures_problem.proof_has_statusP(dependent_proof, NIL) && NIL == all_dependent_proofs_have_siblings_int(dependent_proof)) {
                return NIL;
            }
            csome_list_var = csome_list_var.rest();
            dependent_proof = csome_list_var.first();
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 223300L)
    public static SubLObject restricted_non_focal_with_siblingP(SubLObject jo_link, SubLObject restriction_link) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(NIL != inference_worker_join_ordered.join_ordered_link_restricted_non_focal_linkP(jo_link, restriction_link)
                && (NIL == $processed_proofs_retain_one_proofP$.getDynamicValue(thread) || inference_worker_join_ordered.join_ordered_link_restricted_non_focal_count(jo_link).numGE(TWO_INTEGER)));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 223600L)
    public static SubLObject restricted_focal_with_siblingP(SubLObject jo_link, SubLObject unrestricted_problem) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(unrestricted_problem.eql(inference_worker_join_ordered.join_ordered_link_focal_problem(jo_link)) && (NIL == $processed_proofs_retain_one_proofP$.getDynamicValue(thread) || NIL != join_ordered_link_restricted_focal_countGE(jo_link, TWO_INTEGER)));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 224000L)
    public static SubLObject corresponding_restricted_non_focal_unfinishedP(SubLObject link, SubLObject jo_link) {
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_proofs(link);
        SubLObject trigger_proof = NIL;
        trigger_proof = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.proof_has_statusP(trigger_proof, $PROVEN)) {
                SubLObject non_focal_restriction_link = inference_worker_join_ordered.join_ordered_link_triggered_restriction_link(jo_link, trigger_proof);
                if (NIL != inference_datastructures_problem_link.valid_problem_link_p(non_focal_restriction_link)) {
                    SubLObject restricted_non_focal = inference_datastructures_problem_link.problem_link_sole_supporting_problem(non_focal_restriction_link);
                    if (NIL == inference_datastructures_problem.tactically_finished_problem_p(restricted_non_focal)) {
                        return T;
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            trigger_proof = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 224500L)
    public static SubLObject prunable_processed_linkP(SubLObject link) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != inference_datastructures_problem_link.valid_problem_link_p(link) && NIL != inference_worker_removal.removal_link_p(link)) {
            SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
            if (NIL == problem_is_reused_interestinglyP(problem) && NIL == inference_datastructures_problem_store.proof_keeping_problemP(problem) && (NIL == $processed_proofs_retain_one_proofP$.getDynamicValue(thread) || NIL == link_has_all_the_proofsP(link))) {
                SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
                SubLObject basis_object;
                SubLObject state;
                SubLObject jo_link;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                        state); state = set_contents.do_set_contents_update_state(state)) {
                    jo_link = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, jo_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link, $JOIN_ORDERED) && NIL != corresponding_restricted_non_focal_unfinishedP(link, jo_link)) {
                        return NIL;
                    }
                }
                return T;
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 225200L)
    public static SubLObject problem_is_reused_interestinglyP(SubLObject problem) {
        SubLObject the_only_supported_problem = NIL;
        SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        SubLObject supported_problem;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                if (NIL != supported_problem && !supported_problem.eql(the_only_supported_problem)) {
                    if (NIL != the_only_supported_problem) {
                        return T;
                    }
                    the_only_supported_problem = supported_problem;
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 225600L)
    public static SubLObject link_has_all_the_proofsP(SubLObject link) {
        SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(inference_datastructures_problem_link.problem_link_supported_problem(link));
        SubLObject basis_object;
        SubLObject state;
        SubLObject sibling_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            sibling_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, sibling_link) && !link.eql(sibling_link) && NIL != inference_datastructures_problem_link.problem_link_has_some_proofP(sibling_link, $PROVEN)) {
                return NIL;
            }
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 226000L)
    public static SubLObject join_ordered_link_restricted_focal_count(SubLObject jo_link) {
        SubLObject focal_problem = inference_worker_join_ordered.join_ordered_link_focal_problem(jo_link);
        SubLObject total = ZERO_INTEGER;
        SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(focal_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject r_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            r_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, r_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(r_link, $RESTRICTION)) {
                total = Numbers.add(total, ONE_INTEGER);
            }
        }
        return total;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 226300L)
    public static SubLObject join_ordered_link_restricted_focal_countGE(SubLObject jo_link, SubLObject n) {
        SubLObject focal_problem = inference_worker_join_ordered.join_ordered_link_focal_problem(jo_link);
        SubLObject total = ZERO_INTEGER;
        SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(focal_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject r_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            r_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, r_link) && inference_datastructures_problem_link.problem_link_type(r_link) == $RESTRICTION) {
                total = Numbers.add(total, ONE_INTEGER);
                if (n.isNumber() && total.numGE(n)) {
                    return total;
                }
            }
        }
        return total;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 226600L)
    public static SubLObject all_problem_proofs_are_processedP(SubLObject problem) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject status_var = $PROVEN;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(inference_datastructures_problem.problem_proof_bindings_index(problem)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(
                iteration_state)) {
            thread.resetMultipleValues();
            SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            SubLObject proof_list = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = proof_list;
            SubLObject proof = NIL;
            proof = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != inference_datastructures_problem.proof_has_statusP(proof, status_var) && NIL == inference_datastructures_proof.proof_processedP(proof)) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                proof = cdolist_list_var.first();
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 226900L)
    public static SubLObject all_link_proofs_are_processedP(SubLObject link) {
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_proofs(link);
        SubLObject proof = NIL;
        proof = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.proof_has_statusP(proof, $PROVEN) && NIL == inference_datastructures_proof.proof_processedP(proof)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            proof = cdolist_list_var.first();
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 227100L)
    public static SubLObject problem_has_no_motivation_other_than_removalP(SubLObject problem) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject store = inference_datastructures_problem.problem_store(problem);
        SubLObject has_some_motivation_other_than_removalP = NIL;
        SubLObject idx = inference_datastructures_problem_store.problem_store_strategy_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$131 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$131, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$131);
                SubLObject backwardP_var = NIL;
                SubLObject length = Sequences.length(vector_var);
                SubLObject current;
                SubLObject datum = current = (NIL != backwardP_var) ? list(Numbers.subtract(length, ONE_INTEGER), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER) : list(ZERO_INTEGER, length, ONE_INTEGER);
                SubLObject start = NIL;
                SubLObject end = NIL;
                SubLObject delta = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list210);
                start = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list210);
                end = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list210);
                delta = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL == has_some_motivation_other_than_removalP) {
                        SubLObject end_var;
                        SubLObject id;
                        SubLObject strategy;
                        for (end_var = end, id = NIL, id = start; NIL == has_some_motivation_other_than_removalP && NIL == subl_macros.do_numbers_endtest(id, delta, end_var); id = Numbers.add(id, delta)) {
                            strategy = Vectors.aref(vector_var, id);
                            if (NIL == id_index.id_index_tombstone_p(strategy) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                                if (NIL != id_index.id_index_tombstone_p(strategy)) {
                                    strategy = $SKIP;
                                }
                                if (NIL != inference_datastructures_problem.problem_relevant_to_strategyP(problem, strategy) && NIL != inference_datastructures_strategy.problem_motivatedP(problem, strategy) && NIL == balancing_tactician.balancing_tactician_p(strategy)
                                        && NIL == removal_tactician.removal_strategy_p(strategy)) {
                                    has_some_motivation_other_than_removalP = T;
                                }
                            }
                        }
                    }
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list210);
                }
            }
            SubLObject idx_$132 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$132) && NIL == has_some_motivation_other_than_removalP) {
                SubLObject catch_var = NIL;
                try {
                    thread.throwStack.push($DO_HASH_TABLE);
                    SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$132);
                    SubLObject id2 = NIL;
                    SubLObject strategy2 = NIL;
                    Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            strategy2 = Hashtables.getEntryValue(cdohash_entry);
                            subl_macros.do_hash_table_done_check(has_some_motivation_other_than_removalP);
                            if (NIL != inference_datastructures_problem.problem_relevant_to_strategyP(problem, strategy2) && NIL != inference_datastructures_strategy.problem_motivatedP(problem, strategy2) && NIL == balancing_tactician.balancing_tactician_p(strategy2)
                                    && NIL == removal_tactician.removal_strategy_p(strategy2)) {
                                has_some_motivation_other_than_removalP = T;
                            }
                        }
                    } finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, $DO_HASH_TABLE);
                } finally {
                    thread.throwStack.pop();
                }
            }
        }
        return makeBoolean(NIL == has_some_motivation_other_than_removalP);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 227800L)
    public static SubLObject problem_finished_wrt_removalP(SubLObject problem, SubLObject removal_strategies) {
        SubLObject prunableP = NIL;
        SubLObject cdolist_list_var = removal_strategies;
        SubLObject strategy = NIL;
        strategy = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != finished_problem_p(problem, strategy)) {
                prunableP = T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            strategy = cdolist_list_var.first();
        }
        return prunableP;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 228100L)
    public static SubLObject problem_store_removal_strategies(SubLObject store) {
        SubLObject result = NIL;
        SubLObject idx = inference_datastructures_problem_store.problem_store_strategy_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$133 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$133, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$133);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject strategy;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    strategy = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(strategy) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(strategy)) {
                            strategy = $SKIP;
                        }
                        if (NIL != removal_tactician.removal_strategy_p(strategy)) {
                            result = cons(strategy, result);
                        }
                    }
                }
            }
            SubLObject idx_$134 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$134)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$134);
                SubLObject id2 = NIL;
                SubLObject strategy2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        strategy2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != removal_tactician.removal_strategy_p(strategy2)) {
                            result = cons(strategy2, result);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return Sequences.nreverse(result);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 228400L)
    public static SubLObject problem_is_a_new_rootP(SubLObject problem, SubLObject new_root_strategies) {
        SubLObject cdolist_list_var = new_root_strategies;
        SubLObject strategy = NIL;
        strategy = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_strategy.problem_motivatedP(problem, strategy)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            strategy = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 228600L)
    public static SubLObject problem_store_new_root_strategies(SubLObject store) {
        SubLObject result = NIL;
        SubLObject idx = inference_datastructures_problem_store.problem_store_strategy_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$135 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$135, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$135);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject strategy;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    strategy = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(strategy) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(strategy)) {
                            strategy = $SKIP;
                        }
                        if (NIL != new_root_tactician.new_root_strategy_p(strategy)) {
                            result = cons(strategy, result);
                        }
                    }
                }
            }
            SubLObject idx_$136 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$136)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$136);
                SubLObject id2 = NIL;
                SubLObject strategy2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        strategy2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != new_root_tactician.new_root_strategy_p(strategy2)) {
                            result = cons(strategy2, result);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return Sequences.nreverse(result);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 228900L)
    public static SubLObject note_problem_dirty(SubLObject problem) {
        return inference_datastructures_problem_store.remove_problem_wrt_reuse(inference_datastructures_problem.problem_store(problem), problem);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 229000L)
    public static SubLObject problem_cleanP(SubLObject problem) {
        return Equality.eq(problem, inference_datastructures_problem_store.find_problem_by_query(inference_datastructures_problem.problem_store(problem), inference_datastructures_problem.problem_query(problem), inference_datastructures_problem.problem_free_hl_vars(problem)));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 229200L)
    public static SubLObject problem_has_any_new_root_motivationP(SubLObject problem) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject store = inference_datastructures_problem.problem_store(problem);
        SubLObject witness = NIL;
        SubLObject idx = inference_datastructures_problem_store.problem_store_strategy_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$137 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$137, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$137);
                SubLObject backwardP_var = NIL;
                SubLObject length = Sequences.length(vector_var);
                SubLObject current;
                SubLObject datum = current = (NIL != backwardP_var) ? list(Numbers.subtract(length, ONE_INTEGER), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER) : list(ZERO_INTEGER, length, ONE_INTEGER);
                SubLObject start = NIL;
                SubLObject end = NIL;
                SubLObject delta = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list210);
                start = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list210);
                end = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list210);
                delta = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL == witness) {
                        SubLObject end_var;
                        SubLObject id;
                        SubLObject strategy;
                        for (end_var = end, id = NIL, id = start; NIL == witness && NIL == subl_macros.do_numbers_endtest(id, delta, end_var); id = Numbers.add(id, delta)) {
                            strategy = Vectors.aref(vector_var, id);
                            if (NIL == id_index.id_index_tombstone_p(strategy) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                                if (NIL != id_index.id_index_tombstone_p(strategy)) {
                                    strategy = $SKIP;
                                }
                                if (NIL != new_root_tactician.new_root_strategy_p(strategy) && NIL != inference_datastructures_strategy.problem_motivatedP(problem, strategy)) {
                                    witness = strategy;
                                }
                            }
                        }
                    }
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list210);
                }
            }
            SubLObject idx_$138 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$138) && NIL == witness) {
                SubLObject catch_var = NIL;
                try {
                    thread.throwStack.push($DO_HASH_TABLE);
                    SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$138);
                    SubLObject id2 = NIL;
                    SubLObject strategy2 = NIL;
                    Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            strategy2 = Hashtables.getEntryValue(cdohash_entry);
                            subl_macros.do_hash_table_done_check(witness);
                            if (NIL != new_root_tactician.new_root_strategy_p(strategy2) && NIL != inference_datastructures_strategy.problem_motivatedP(problem, strategy2)) {
                                witness = strategy2;
                            }
                        }
                    } finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, $DO_HASH_TABLE);
                } finally {
                    thread.throwStack.pop();
                }
            }
        }
        return witness;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 229500L)
    public static SubLObject problem_has_any_transformation_motivationP(SubLObject problem) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject store = inference_datastructures_problem.problem_store(problem);
        SubLObject witness = NIL;
        SubLObject idx = inference_datastructures_problem_store.problem_store_strategy_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$139 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$139, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$139);
                SubLObject backwardP_var = NIL;
                SubLObject length = Sequences.length(vector_var);
                SubLObject current;
                SubLObject datum = current = (NIL != backwardP_var) ? list(Numbers.subtract(length, ONE_INTEGER), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER) : list(ZERO_INTEGER, length, ONE_INTEGER);
                SubLObject start = NIL;
                SubLObject end = NIL;
                SubLObject delta = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list210);
                start = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list210);
                end = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list210);
                delta = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL == witness) {
                        SubLObject end_var;
                        SubLObject id;
                        SubLObject strategy;
                        for (end_var = end, id = NIL, id = start; NIL == witness && NIL == subl_macros.do_numbers_endtest(id, delta, end_var); id = Numbers.add(id, delta)) {
                            strategy = Vectors.aref(vector_var, id);
                            if (NIL == id_index.id_index_tombstone_p(strategy) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                                if (NIL != id_index.id_index_tombstone_p(strategy)) {
                                    strategy = $SKIP;
                                }
                                if (NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) && NIL != inference_datastructures_strategy.problem_motivatedP(problem, strategy)) {
                                    witness = strategy;
                                }
                            }
                        }
                    }
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list210);
                }
            }
            SubLObject idx_$140 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$140) && NIL == witness) {
                SubLObject catch_var = NIL;
                try {
                    thread.throwStack.push($DO_HASH_TABLE);
                    SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$140);
                    SubLObject id2 = NIL;
                    SubLObject strategy2 = NIL;
                    Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            strategy2 = Hashtables.getEntryValue(cdohash_entry);
                            subl_macros.do_hash_table_done_check(witness);
                            if (NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy2) && NIL != inference_datastructures_strategy.problem_motivatedP(problem, strategy2)) {
                                witness = strategy2;
                            }
                        }
                    } finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, $DO_HASH_TABLE);
                } finally {
                    thread.throwStack.pop();
                }
            }
        }
        return witness;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 229900L)
    public static SubLObject problem_has_any_removal_motivationP(SubLObject problem) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject store = inference_datastructures_problem.problem_store(problem);
        SubLObject witness = NIL;
        SubLObject idx = inference_datastructures_problem_store.problem_store_strategy_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$141 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$141, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$141);
                SubLObject backwardP_var = NIL;
                SubLObject length = Sequences.length(vector_var);
                SubLObject current;
                SubLObject datum = current = (NIL != backwardP_var) ? list(Numbers.subtract(length, ONE_INTEGER), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER) : list(ZERO_INTEGER, length, ONE_INTEGER);
                SubLObject start = NIL;
                SubLObject end = NIL;
                SubLObject delta = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list210);
                start = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list210);
                end = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list210);
                delta = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL == witness) {
                        SubLObject end_var;
                        SubLObject id;
                        SubLObject strategy;
                        for (end_var = end, id = NIL, id = start; NIL == witness && NIL == subl_macros.do_numbers_endtest(id, delta, end_var); id = Numbers.add(id, delta)) {
                            strategy = Vectors.aref(vector_var, id);
                            if (NIL == id_index.id_index_tombstone_p(strategy) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                                if (NIL != id_index.id_index_tombstone_p(strategy)) {
                                    strategy = $SKIP;
                                }
                                if (NIL != removal_tactician.removal_strategy_p(strategy) && NIL != inference_datastructures_strategy.problem_motivatedP(problem, strategy)) {
                                    witness = strategy;
                                }
                            }
                        }
                    }
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list210);
                }
            }
            SubLObject idx_$142 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$142) && NIL == witness) {
                SubLObject catch_var = NIL;
                try {
                    thread.throwStack.push($DO_HASH_TABLE);
                    SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$142);
                    SubLObject id2 = NIL;
                    SubLObject strategy2 = NIL;
                    Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            strategy2 = Hashtables.getEntryValue(cdohash_entry);
                            subl_macros.do_hash_table_done_check(witness);
                            if (NIL != removal_tactician.removal_strategy_p(strategy2) && NIL != inference_datastructures_strategy.problem_motivatedP(problem, strategy2)) {
                                witness = strategy2;
                            }
                        }
                    } finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, $DO_HASH_TABLE);
                } finally {
                    thread.throwStack.pop();
                }
            }
        }
        return witness;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 230200L)
    public static SubLObject problem_store_possibly_redundant_proof_sets(SubLObject store) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        SubLObject redundant_proof_candidates = dictionary.new_dictionary(Symbols.symbol_function(EQUAL), UNPROVIDED);
        SubLObject cdolist_list_var;
        SubLObject proofs = cdolist_list_var = inference_datastructures_problem_store.problem_store_all_proofs(store);
        SubLObject proof = NIL;
        proof = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject problem = inference_datastructures_proof.proof_supported_problem(proof);
            SubLObject v_bindings = inference_datastructures_proof.proof_bindings(proof);
            SubLObject key = list(problem, v_bindings);
            SubLObject supports = inference_datastructures_proof.all_proof_supports(proof);
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(inference_datastructures_problem.problem_proof_bindings_index(problem)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(
                    iteration_state)) {
                thread.resetMultipleValues();
                SubLObject v_bindings_$143 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                SubLObject proof_list = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject cdolist_list_var_$144 = proof_list;
                SubLObject sibling_proof = NIL;
                sibling_proof = cdolist_list_var_$144.first();
                while (NIL != cdolist_list_var_$144) {
                    SubLObject sibling_bindings = inference_datastructures_proof.proof_bindings(sibling_proof);
                    if (v_bindings.equal(sibling_bindings) && !proof.eql(sibling_proof)) {
                        SubLObject sibling_supports = inference_datastructures_proof.all_proof_supports(sibling_proof);
                        if (NIL != arguments.justification_equal(supports, sibling_supports)) {
                            SubLObject redundancy_set = dictionary.dictionary_lookup(redundant_proof_candidates, key, NIL);
                            if (NIL == redundancy_set) {
                                redundancy_set = set.new_set(Symbols.symbol_function(EQ), UNPROVIDED);
                            }
                            set.set_add(proof, redundancy_set);
                            set.set_add(sibling_proof, redundancy_set);
                            dictionary.dictionary_enter(redundant_proof_candidates, key, redundancy_set);
                        }
                    }
                    cdolist_list_var_$144 = cdolist_list_var_$144.rest();
                    sibling_proof = cdolist_list_var_$144.first();
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            cdolist_list_var = cdolist_list_var.rest();
            proof = cdolist_list_var.first();
        }
        return dictionary.dictionary_values(redundant_proof_candidates);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 231500L)
    public static SubLObject problem_store_all_possibly_redundant_proofs(SubLObject store) {
        SubLObject all_proofs = set.new_set(Symbols.symbol_function(EQ), UNPROVIDED);
        SubLObject cdolist_list_var = problem_store_possibly_redundant_proof_sets(store);
        SubLObject proof_set = NIL;
        proof_set = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject set_contents_var = set.do_set_internal(proof_set);
            SubLObject basis_object;
            SubLObject state;
            SubLObject proof;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                    state); state = set_contents.do_set_contents_update_state(state)) {
                proof = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, proof)) {
                    set.set_add(proof, all_proofs);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            proof_set = cdolist_list_var.first();
        }
        return Sort.sort(set.set_element_list(all_proofs), Symbols.symbol_function($sym203$_), Symbols.symbol_function($sym207$PROOF_SUID));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 231900L)
    public static SubLObject problem_store_possibly_redundant_proof_count(SubLObject store) {
        return number_utilities.summation(Mapping.mapcar(Symbols.symbol_function($sym213$SET_SIZE), problem_store_possibly_redundant_proof_sets(store)));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 232200L)
    public static SubLObject possibly_prune_proof_tree(SubLObject proof) {
        SubLObject root_proofs = compute_root_proofs(proof);
        if (NIL != list_utilities.every_in_list($sym214$PROOF_PRUNABLE_, root_proofs, UNPROVIDED)) {
            return prune_starting_from_root_proofs(root_proofs);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 233000L)
    public static SubLObject compute_root_proofs(SubLObject proof) {
        SubLObject frontier_proofs = set_utilities.construct_set_from_list(list(proof), Symbols.symbol_function(EQ), UNPROVIDED);
        SubLObject root_proofs = set.new_set(Symbols.symbol_function(EQ), UNPROVIDED);
        while (NIL == set.set_emptyP(frontier_proofs)) {
            SubLObject cdolist_list_var = set.set_element_list(frontier_proofs);
            SubLObject proof_$145 = NIL;
            proof_$145 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                set.set_remove(proof_$145, frontier_proofs);
                SubLObject direct_dependent_proofs = direct_dependent_proofs_including_split_restrictions(proof_$145);
                if (NIL != direct_dependent_proofs) {
                    set_utilities.set_add_all(frontier_proofs, direct_dependent_proofs);
                } else {
                    set.set_add(proof_$145, root_proofs);
                }
                cdolist_list_var = cdolist_list_var.rest();
                proof_$145 = cdolist_list_var.first();
            }
        }
        return set.set_element_list(root_proofs);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 234400L)
    public static SubLObject direct_dependent_proofs_including_split_restrictions(SubLObject proof) {
        SubLObject dependent_proofs = inference_datastructures_proof.proof_dependent_proofs(proof, UNPROVIDED);
        return (NIL != dependent_proofs) ? dependent_proofs : all_triggered_restricted_non_focal_links(proof);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 234800L)
    public static SubLObject all_triggered_restricted_non_focal_links(SubLObject proof) {
        SubLObject result = NIL;
        SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(inference_datastructures_proof.proof_supported_problem(proof));
        SubLObject basis_object;
        SubLObject state;
        SubLObject jo_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            jo_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, jo_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link, $JOIN_ORDERED)) {
                result = cons(inference_worker_join_ordered.join_ordered_link_triggered_restriction_link(jo_link, proof), result);
            }
        }
        return Sequences.nreverse(result);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 235300L)
    public static SubLObject proof_prunableP(SubLObject proof) {
        return makeBoolean(NIL != inference_datastructures_proof.proof_processedP(proof) && NIL == inference_datastructures_problem_store.proof_keeping_problemP(inference_datastructures_proof.proof_supported_problem(proof)));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 235500L)
    public static SubLObject prune_starting_from_root_proofs(SubLObject root_proofs) {
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 237600L)
    public static SubLObject prune_entire_problem_store(SubLObject store) {
        SubLObject objects = append(inference_datastructures_problem_store.problem_store_all_problems(store), inference_datastructures_problem_store.problem_store_all_problem_links(store));
        SubLObject removal_strategies = problem_store_removal_strategies(store);
        return prune_problem_store_objects(objects, removal_strategies);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 238000L)
    public static SubLObject prune_problem_store_below(SubLObject v_object) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == inference_datastructures_problem.problem_p(v_object) && NIL == inference_datastructures_problem_link.problem_link_p(v_object)) {
            Errors.error($str215$_a_was_not_a_problem_p_or_problem, v_object);
        }
        SubLObject store = (NIL != inference_datastructures_problem.problem_p(v_object)) ? inference_datastructures_problem.problem_store(v_object) : inference_datastructures_problem_link.problem_link_store(v_object);
        SubLObject removal_strategies = problem_store_removal_strategies(store);
        return prune_problem_store_objects(all_problem_store_objects_below(v_object), removal_strategies);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 238400L)
    public static SubLObject all_problem_store_objects_below(SubLObject v_object) {
        SubLObject result = set.new_set(Symbols.symbol_function(EQL), UNPROVIDED);
        add_all_problem_store_objects_below_recursive(v_object, result);
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 238600L)
    public static SubLObject add_all_problem_store_objects_below_recursive(SubLObject v_object, SubLObject v_set) {
        if (NIL != set.set_memberP(v_object, v_set)) {
            return NIL;
        }
        if (NIL != inference_datastructures_problem.problem_p(v_object)) {
            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(v_object);
            SubLObject basis_object;
            SubLObject state;
            SubLObject link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                    state); state = set_contents.do_set_contents_update_state(state)) {
                link = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                    add_all_problem_store_objects_below_recursive(link, v_set);
                }
            }
        } else {
            SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(v_object);
            SubLObject supporting_mapped_problem = NIL;
            supporting_mapped_problem = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != inference_macros.do_problem_link_open_matchP(NIL, v_object, supporting_mapped_problem)) {
                    SubLObject problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                    SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                    add_all_problem_store_objects_below_recursive(problem, v_set);
                }
                cdolist_list_var = cdolist_list_var.rest();
                supporting_mapped_problem = cdolist_list_var.first();
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 239000L)
    public static SubLObject prune_problem_store_objects(SubLObject objects, SubLObject removal_strategies) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = objects;
        SubLObject v_object = NIL;
        v_object = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == inference_datastructures_problem.problem_p(v_object) && NIL == inference_datastructures_problem_link.problem_link_p(v_object)) {
                Errors.error($str215$_a_was_not_a_problem_p_or_problem, v_object);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_object = cdolist_list_var.first();
        }
        SubLObject v_object2 = objects.first();
        SubLObject store = (NIL != inference_datastructures_problem.problem_p(v_object2)) ? inference_datastructures_problem.problem_store(v_object2) : inference_datastructures_problem_link.problem_link_store(v_object2);
        problem_store_compute_proof_keeping_problems(store);
        SubLObject prunables = NIL;
        SubLObject cdolist_list_var2 = objects;
        SubLObject v_object_$146 = NIL;
        v_object_$146 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (NIL != prunable_problem_store_objectP(v_object_$146, removal_strategies)) {
                prunables = cons(v_object_$146, prunables);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            v_object_$146 = cdolist_list_var2.first();
        }
        PrintLow.format(T, $str216$__prunables___s__, prunables);
        cdolist_list_var2 = prunables;
        SubLObject prunable = NIL;
        prunable = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            prune_problem_store_object(prunable);
            cdolist_list_var2 = cdolist_list_var2.rest();
            prunable = cdolist_list_var2.first();
        }
        return Sequences.length(prunables);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 239800L)
    public static SubLObject prunable_problem_store_objectP(SubLObject v_object, SubLObject removal_strategies) {
        if (NIL != inference_datastructures_problem.problem_p(v_object)) {
            return prunable_problemP(v_object, removal_strategies);
        }
        if (NIL != inference_datastructures_problem_link.problem_link_p(v_object)) {
            return prunable_problem_linkP(v_object);
        }
        Errors.error($str217$Unexpected_problem_store_object__, v_object);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 240100L)
    public static SubLObject prunable_problemP(SubLObject problem, SubLObject removal_strategies) {
        if (NIL == inference_datastructures_problem_store.proof_keeping_problemP(problem) && NIL != problem_has_no_motivation_other_than_removalP(problem) && NIL != problem_not_in_progress_wrt_removalP(problem, removal_strategies)) {
            return NIL;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 240300L)
    public static SubLObject prunable_problem_linkP(SubLObject link) {
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 240400L)
    public static SubLObject problem_not_in_progress_wrt_removalP(SubLObject problem, SubLObject removal_strategies) {
        return makeBoolean(NIL != list_utilities.member_eqP(inference_datastructures_problem.problem_tactical_status(problem), $list218) || NIL != problem_finished_wrt_removalP(problem, removal_strategies));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 240700L)
    public static SubLObject prune_problem_store_object(SubLObject v_object) {
        if (NIL != inference_datastructures_problem.problem_p(v_object)) {
            inference_datastructures_problem.destroy_problem(v_object);
        } else if (NIL != inference_datastructures_problem_link.problem_link_p(v_object)) {
            inference_datastructures_problem_link.destroy_problem_link(v_object);
        } else {
            Errors.error($str217$Unexpected_problem_store_object__, v_object);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 240900L)
    public static SubLObject problem_store_compute_proof_keeping_problems(SubLObject store) {
        inference_datastructures_problem_store.clear_problem_store_proof_keeping_problems(store);
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$147 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$147, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$147);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        inference_compute_proof_keeping_problems(inference);
                    }
                }
            }
            SubLObject idx_$148 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$148)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$148);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        inference_compute_proof_keeping_problems(inference2);
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 241700L)
    public static SubLObject inference_compute_proof_keeping_problems(SubLObject inference) {
        return compute_proof_keeping_problems_recursive(inference_datastructures_inference.inference_root_problem(inference));
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 241800L)
    public static SubLObject compute_proof_keeping_problems_recursive(SubLObject problem) {
        if (NIL != inference_datastructures_problem_store.unknown_proof_keeping_problemP(problem)) {
            inference_datastructures_problem_store.note_not_proof_keeping_problem(problem);
            if (NIL == inference_datastructures_problem.tactically_finished_problem_p(problem)) {
                SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
                SubLObject basis_object;
                SubLObject state;
                SubLObject link;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                        state); state = set_contents.do_set_contents_update_state(state)) {
                    link = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                        compute_proof_keeping_links_recursive(link);
                    }
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 242500L)
    public static SubLObject compute_proof_keeping_links_recursive(SubLObject link) {
        if (NIL != inference_worker_split.split_link_p(link) && NIL != inference_datastructures_problem_link.problem_link_openP(link) && NIL != cartesian_split_linkP(link)) {
            SubLObject non_proof_keeping_problem = choose_split_link_non_proof_keeping_problem(link);
            SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
            SubLObject supporting_mapped_problem = NIL;
            supporting_mapped_problem = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link, supporting_mapped_problem)) {
                    SubLObject problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                    SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                    if (problem.eql(non_proof_keeping_problem)) {
                        inference_datastructures_problem_store.note_not_proof_keeping_problem(problem);
                        compute_proof_keeping_problems_recursive(problem);
                    } else {
                        note_and_propagate_proof_keeping_problem(problem, link);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                supporting_mapped_problem = cdolist_list_var.first();
            }
        } else if (NIL != inference_worker_join.join_link_p(link) && NIL != inference_datastructures_problem_link.problem_link_openP(link)) {
            SubLObject proof_keeping_problem = inference_worker_join.join_link_first_problem(link);
            SubLObject non_proof_keeping_problem2 = inference_worker_join.join_link_second_problem(link);
            inference_datastructures_problem_store.note_not_proof_keeping_problem(non_proof_keeping_problem2);
            compute_proof_keeping_problems_recursive(non_proof_keeping_problem2);
            note_and_propagate_proof_keeping_problem(proof_keeping_problem, link);
        } else {
            SubLObject cdolist_list_var2 = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
            SubLObject supporting_mapped_problem2 = NIL;
            supporting_mapped_problem2 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link, supporting_mapped_problem2)) {
                    SubLObject problem2 = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem2);
                    SubLObject variable_map2 = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem2);
                    compute_proof_keeping_problems_recursive(problem2);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                supporting_mapped_problem2 = cdolist_list_var2.first();
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 244400L)
    public static SubLObject cartesian_split_linkP(SubLObject split_link) {
        SubLObject bal_strat = inference_datastructures_problem_store.problem_store_unique_balancing_tactician(inference_datastructures_problem_link.problem_link_store(split_link));
        if (NIL == bal_strat) {
            return T;
        }
        SubLObject r_strats = (NIL != striping_tactician.striping_tactician_p(bal_strat)) ? striping_tactician.striping_tactician_removal_substrategies(bal_strat) : list(balancing_tactician.balancing_tactician_sole_removal_substrategy(bal_strat));
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(split_link);
        SubLObject conjunct_mapped_problem = NIL;
        conjunct_mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_macros.do_problem_link_open_matchP(NIL, split_link, conjunct_mapped_problem)) {
                SubLObject split_tactic = inference_worker_split.split_link_tactic(split_link, conjunct_mapped_problem);
                if (NIL == split_tactic) {
                    return T;
                }
                SubLObject cdolist_list_var_$149 = r_strats;
                SubLObject r_strat = NIL;
                r_strat = cdolist_list_var_$149.first();
                while (NIL != cdolist_list_var_$149) {
                    if (NIL != number_utilities.potentially_infinite_integer_G(inference_datastructures_strategy.tactic_strategic_productivity(split_tactic, r_strat), $int$100)) {
                        return T;
                    }
                    cdolist_list_var_$149 = cdolist_list_var_$149.rest();
                    r_strat = cdolist_list_var_$149.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            conjunct_mapped_problem = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 245500L)
    public static SubLObject choose_split_link_non_proof_keeping_problem(SubLObject split_link) {
        SubLObject open_problems = inference_worker_split.split_link_supporting_problems_with_variables(split_link);
        SubLObject pcase_var = list_utilities.count_if_not($sym219$TACTICALLY_FINISHED_PROBLEM_P, open_problems, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (pcase_var.eql(ONE_INTEGER)) {
            return list_utilities.find_if_not($sym219$TACTICALLY_FINISHED_PROBLEM_P, open_problems, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (pcase_var.eql(ZERO_INTEGER)) {
            return open_problems.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 246000L)
    public static SubLObject note_and_propagate_proof_keeping_problem(SubLObject problem, SubLObject reason) {
        return note_and_propagate_proof_keeping_problem_recursive(problem, reason);
    }

    @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 246200L)
    public static SubLObject note_and_propagate_proof_keeping_problem_recursive(SubLObject problem, SubLObject reason) {
        if (NIL == inference_datastructures_problem_store.proof_keeping_problemP(problem)) {
            inference_datastructures_problem_store.note_proof_keeping_problem(problem, reason);
            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject link;
            SubLObject link_var;
            SubLObject cdolist_list_var;
            SubLObject supporting_mapped_problem;
            SubLObject supporting_problem;
            SubLObject variable_map;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                    state); state = set_contents.do_set_contents_update_state(state)) {
                link = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                    link_var = link;
                    cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                    supporting_mapped_problem = NIL;
                    supporting_mapped_problem = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem)) {
                            supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                            variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                            note_and_propagate_proof_keeping_problem_recursive(supporting_problem, reason);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        supporting_mapped_problem = cdolist_list_var.first();
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject declare_inference_worker_file() {
        declareFunction("currently_considered_tactic", "CURRENTLY-CONSIDERED-TACTIC", 0, 0, false);
        declareMacro("within_tactic_consideration", "WITHIN-TACTIC-CONSIDERATION");
        declareFunction("currently_executing_tactic", "CURRENTLY-EXECUTING-TACTIC", 0, 0, false);
        declareFunction("currently_executing_tactics", "CURRENTLY-EXECUTING-TACTICS", 0, 0, false);
        declareMacro("within_tactic_execution", "WITHIN-TACTIC-EXECUTION");
        declareFunction("currently_executing_hl_module", "CURRENTLY-EXECUTING-HL-MODULE", 0, 0, false);
        declareFunction("currently_active_problem", "CURRENTLY-ACTIVE-PROBLEM", 0, 0, false);
        declareMacro("within_problem_consideration", "WITHIN-PROBLEM-CONSIDERATION");
        declareFunction("currently_active_problem_query", "CURRENTLY-ACTIVE-PROBLEM-QUERY", 0, 0, false);
        declareMacro("with_problem_store_tactical_evaluation_properties", "WITH-PROBLEM-STORE-TACTICAL-EVALUATION-PROPERTIES");
        declareFunction("currently_active_problem_store", "CURRENTLY-ACTIVE-PROBLEM-STORE", 0, 0, false);
        declareFunction("currently_active_problem_store_creation_time", "CURRENTLY-ACTIVE-PROBLEM-STORE-CREATION-TIME", 0, 0, false);
        declareFunction("determine_new_tactics", "DETERMINE-NEW-TACTICS", 1, 0, false);
        declareFunction("determine_new_tactics_for_dnf_clause", "DETERMINE-NEW-TACTICS-FOR-DNF-CLAUSE", 2, 0, false);
        declareFunction("determine_new_tactics_for_disjunction", "DETERMINE-NEW-TACTICS-FOR-DISJUNCTION", 2, 0, false);
        declareFunction("determine_new_tactics_for_multiple_literals", "DETERMINE-NEW-TACTICS-FOR-MULTIPLE-LITERALS", 2, 0, false);
        declareFunction("determine_new_connected_conjunction_tactics", "DETERMINE-NEW-CONNECTED-CONJUNCTION-TACTICS", 2, 0, false);
        declareFunction("problem_has_a_complete_conjunctive_removal_tacticP", "PROBLEM-HAS-A-COMPLETE-CONJUNCTIVE-REMOVAL-TACTIC?", 1, 0, false);
        declareFunction("determine_new_tactics_for_literal", "DETERMINE-NEW-TACTICS-FOR-LITERAL", 3, 0, false);
        declareFunction("possibly_compute_strategic_properties_of_problem_tactics", "POSSIBLY-COMPUTE-STRATEGIC-PROPERTIES-OF-PROBLEM-TACTICS", 2, 0, false);
        declareFunction("strategy_compute_strategic_properties_of_problem_tactics", "STRATEGY-COMPUTE-STRATEGIC-PROPERTIES-OF-PROBLEM-TACTICS", 2, 0, false);
        declareFunction("compute_strategic_properties_of_problem_tactics", "COMPUTE-STRATEGIC-PROPERTIES-OF-PROBLEM-TACTICS", 2, 1, false);
        declareFunction("possibly_compute_strategic_properties_of_tactic", "POSSIBLY-COMPUTE-STRATEGIC-PROPERTIES-OF-TACTIC", 2, 0, false);
        declareFunction("strategy_chooses_not_to_examine_tacticP", "STRATEGY-CHOOSES-NOT-TO-EXAMINE-TACTIC?", 2, 0, false);
        declareFunction("default_compute_strategic_properties_of_tactic", "DEFAULT-COMPUTE-STRATEGIC-PROPERTIES-OF-TACTIC", 2, 0, false);
        declareFunction("execute_tactic", "EXECUTE-TACTIC", 1, 0, false);
        declareFunction("possibly_execute_tactic", "POSSIBLY-EXECUTE-TACTIC", 1, 0, false);
        declareFunction("possibly_note_tactic_finished", "POSSIBLY-NOTE-TACTIC-FINISHED", 1, 0, false);
        declareMacro("within_single_literal_tactic_with_asent_and_mt", "WITHIN-SINGLE-LITERAL-TACTIC-WITH-ASENT-AND-MT");
        declareFunction("asent_of_currently_executing_tactic", "ASENT-OF-CURRENTLY-EXECUTING-TACTIC", 0, 0, false);
        declareFunction("mt_of_currently_executing_tactic", "MT-OF-CURRENTLY-EXECUTING-TACTIC", 0, 0, false);
        declareFunction("single_literal_tactic_p", "SINGLE-LITERAL-TACTIC-P", 1, 0, false);
        declareFunction("execute_literal_level_tactic", "EXECUTE-LITERAL-LEVEL-TACTIC", 1, 0, false);
        declareFunction("literal_level_tactic_p", "LITERAL-LEVEL-TACTIC-P", 1, 0, false);
        declareFunction("execute_multiple_clause_tactic", "EXECUTE-MULTIPLE-CLAUSE-TACTIC", 1, 0, false);
        declareFunction("execute_multiple_literal_tactic", "EXECUTE-MULTIPLE-LITERAL-TACTIC", 1, 0, false);
        declareFunction("execute_structural_multiple_literal_tactic", "EXECUTE-STRUCTURAL-MULTIPLE-LITERAL-TACTIC", 1, 0, false);
        declareFunction("execute_meta_structural_multiple_literal_tactic", "EXECUTE-META-STRUCTURAL-MULTIPLE-LITERAL-TACTIC", 1, 0, false);
        declareFunction("connected_conjunction_link_p", "CONNECTED-CONJUNCTION-LINK-P", 1, 0, false);
        declareFunction("connected_conjunction_tactic_p", "CONNECTED-CONJUNCTION-TACTIC-P", 1, 0, false);
        declareFunction("connected_conjunction_link_tactic", "CONNECTED-CONJUNCTION-LINK-TACTIC", 1, 0, false);
        declareFunction("connected_conjunction_tactic_link", "CONNECTED-CONJUNCTION-TACTIC-LINK", 1, 0, false);
        declareFunction("conjunctive_link_p", "CONJUNCTIVE-LINK-P", 1, 0, false);
        declareFunction("logical_conjunctive_tactic_p", "LOGICAL-CONJUNCTIVE-TACTIC-P", 1, 0, false);
        declareFunction("conjunctive_tactic_p", "CONJUNCTIVE-TACTIC-P", 1, 0, false);
        declareFunction("meta_conjunctive_tactic_p", "META-CONJUNCTIVE-TACTIC-P", 1, 0, false);
        declareFunction("generalized_conjunctive_tactic_p", "GENERALIZED-CONJUNCTIVE-TACTIC-P", 1, 0, false);
        declareFunction("generalized_logical_conjunctive_tactic_p", "GENERALIZED-LOGICAL-CONJUNCTIVE-TACTIC-P", 1, 0, false);
        declareFunction("connected_conjunction_tactic_literals_score", "CONNECTED-CONJUNCTION-TACTIC-LITERALS-SCORE", 1, 0, false);
        declareFunction("disjunctive_link_p", "DISJUNCTIVE-LINK-P", 1, 0, false);
        declareFunction("logical_disjunctive_tactic_p", "LOGICAL-DISJUNCTIVE-TACTIC-P", 1, 0, false);
        declareFunction("disjunctive_tactic_p", "DISJUNCTIVE-TACTIC-P", 1, 0, false);
        declareFunction("disjunctive_link_tactic", "DISJUNCTIVE-LINK-TACTIC", 1, 0, false);
        declareFunction("logical_link_p", "LOGICAL-LINK-P", 1, 0, false);
        declareFunction("logical_tactic_p", "LOGICAL-TACTIC-P", 1, 0, false);
        declareFunction("logical_link_with_unique_tactic_p", "LOGICAL-LINK-WITH-UNIQUE-TACTIC-P", 1, 0, false);
        declareFunction("logical_tactic_with_unique_lookahead_problem_p", "LOGICAL-TACTIC-WITH-UNIQUE-LOOKAHEAD-PROBLEM-P", 1, 0, false);
        declareFunction("logical_link_unique_tactic", "LOGICAL-LINK-UNIQUE-TACTIC", 1, 0, false);
        declareFunction("logical_tactic_link", "LOGICAL-TACTIC-LINK", 1, 0, false);
        declareFunction("logical_tactic_lookahead_problem", "LOGICAL-TACTIC-LOOKAHEAD-PROBLEM", 1, 0, false);
        declareFunction("logical_proof_p", "LOGICAL-PROOF-P", 1, 0, false);
        declareFunction("structural_link_p", "STRUCTURAL-LINK-P", 1, 0, false);
        declareFunction("structural_tactic_p", "STRUCTURAL-TACTIC-P", 1, 0, false);
        declareFunction("meta_structural_tactic_p", "META-STRUCTURAL-TACTIC-P", 1, 0, false);
        declareFunction("generalized_structural_tactic_p", "GENERALIZED-STRUCTURAL-TACTIC-P", 1, 0, false);
        declareFunction("structural_tactic_lookahead_problem", "STRUCTURAL-TACTIC-LOOKAHEAD-PROBLEM", 1, 0, false);
        declareFunction("structural_proof_p", "STRUCTURAL-PROOF-P", 1, 0, false);
        declareFunction("structural_proof_type", "STRUCTURAL-PROOF-TYPE", 1, 0, false);
        declareFunction("content_link_p", "CONTENT-LINK-P", 1, 0, false);
        declareFunction("content_tactic_p", "CONTENT-TACTIC-P", 1, 0, false);
        declareFunction("content_proof_p", "CONTENT-PROOF-P", 1, 0, false);
        declareFunction("content_link_supports", "CONTENT-LINK-SUPPORTS", 1, 0, false);
        declareFunction("content_link_tactic", "CONTENT-LINK-TACTIC", 1, 0, false);
        declareFunction("content_link_hl_module", "CONTENT-LINK-HL-MODULE", 1, 0, false);
        declareFunction("content_proof_hl_module", "CONTENT-PROOF-HL-MODULE", 1, 0, false);
        declareFunction("content_tactic_actual_productivity", "CONTENT-TACTIC-ACTUAL-PRODUCTIVITY", 1, 0, false);
        declareFunction("removal_tactic_actual_productivity", "REMOVAL-TACTIC-ACTUAL-PRODUCTIVITY", 1, 0, false);
        declareFunction("single_literal_removal_tactic_actual_productivity", "SINGLE-LITERAL-REMOVAL-TACTIC-ACTUAL-PRODUCTIVITY", 1, 0, false);
        declareFunction("conjunctive_removal_tactic_actual_productivity", "CONJUNCTIVE-REMOVAL-TACTIC-ACTUAL-PRODUCTIVITY", 1, 0, false);
        declareFunction("transformation_tactic_actual_productivity", "TRANSFORMATION-TACTIC-ACTUAL-PRODUCTIVITY", 1, 0, false);
        declareFunction("rewrite_tactic_actual_productivity", "REWRITE-TACTIC-ACTUAL-PRODUCTIVITY", 1, 0, false);
        declareFunction("meta_removal_tactic_actual_productivity", "META-REMOVAL-TACTIC-ACTUAL-PRODUCTIVITY", 1, 0, false);
        declareFunction("simple_problem_estimated_total_global_productivity", "SIMPLE-PROBLEM-ESTIMATED-TOTAL-GLOBAL-PRODUCTIVITY", 2, 0, false);
        declareFunction("estimated_global_productivity_of_problem_possible_tactics", "ESTIMATED-GLOBAL-PRODUCTIVITY-OF-PROBLEM-POSSIBLE-TACTICS", 2, 0, false);
        declareFunction("estimated_generalized_removal_productivity_of_problem_possible_tactics_with_completeness", "ESTIMATED-GENERALIZED-REMOVAL-PRODUCTIVITY-OF-PROBLEM-POSSIBLE-TACTICS-WITH-COMPLETENESS", 3, 0, false);
        declareFunction("estimated_global_structural_productivity_of_problem_possible_tactics_with_preference_level", "ESTIMATED-GLOBAL-STRUCTURAL-PRODUCTIVITY-OF-PROBLEM-POSSIBLE-TACTICS-WITH-PREFERENCE-LEVEL", 3, 0, false);
        declareFunction("estimated_global_structural_productivity_of_problem_possible_preferred_tactics", "ESTIMATED-GLOBAL-STRUCTURAL-PRODUCTIVITY-OF-PROBLEM-POSSIBLE-PREFERRED-TACTICS", 2, 0, false);
        declareFunction("estimated_global_structural_productivity_of_problem_possible_dispreferred_tactics", "ESTIMATED-GLOBAL-STRUCTURAL-PRODUCTIVITY-OF-PROBLEM-POSSIBLE-DISPREFERRED-TACTICS", 2, 0, false);
        declareFunction("estimated_global_structural_productivity_of_problem_possible_grossly_dispreferred_tactics", "ESTIMATED-GLOBAL-STRUCTURAL-PRODUCTIVITY-OF-PROBLEM-POSSIBLE-GROSSLY-DISPREFERRED-TACTICS", 2, 0, false);
        declareFunction("estimated_global_structural_productivity_of_problem_possible_non_preferred_tactics", "ESTIMATED-GLOBAL-STRUCTURAL-PRODUCTIVITY-OF-PROBLEM-POSSIBLE-NON-PREFERRED-TACTICS", 3, 0, false);
        declareFunction("problem_doomed_due_to_lookahead_removal_completenessP", "PROBLEM-DOOMED-DUE-TO-LOOKAHEAD-REMOVAL-COMPLETENESS?", 2, 0, false);
        declareFunction("problem_doomed_due_to_removal_completenessP", "PROBLEM-DOOMED-DUE-TO-REMOVAL-COMPLETENESS?", 2, 0, false);
        declareFunction("problem_structural_preference_level", "PROBLEM-STRUCTURAL-PREFERENCE-LEVEL", 2, 0, false);
        declareFunction("logical_link_generalized_removal_completeness", "LOGICAL-LINK-GENERALIZED-REMOVAL-COMPLETENESS", 2, 0, false);
        declareFunction("logical_tactic_generalized_removal_completeness", "LOGICAL-TACTIC-GENERALIZED-REMOVAL-COMPLETENESS", 2, 0, false);
        declareFunction("problem_generalized_removal_completeness", "PROBLEM-GENERALIZED-REMOVAL-COMPLETENESS", 2, 0, false);
        declareFunction("problem_preference_level_int", "PROBLEM-PREFERENCE-LEVEL-INT", 3, 0, false);
        declareFunction("discard_all_other_possible_connected_conjunction_tactics", "DISCARD-ALL-OTHER-POSSIBLE-CONNECTED-CONJUNCTION-TACTICS", 1, 0, false);
        declareFunction("possibly_discard_all_other_possible_structural_conjunctive_tactics", "POSSIBLY-DISCARD-ALL-OTHER-POSSIBLE-STRUCTURAL-CONJUNCTIVE-TACTICS", 1, 0, false);
        declareFunction("discard_all_other_possible_structural_conjunctive_tactics", "DISCARD-ALL-OTHER-POSSIBLE-STRUCTURAL-CONJUNCTIVE-TACTICS", 1, 0, false);
        declareFunction("problem_link_can_have_proofsP", "PROBLEM-LINK-CAN-HAVE-PROOFS?", 1, 0, false);
        declareFunction("intermediate_proof_step_valid_memoizedP_internal", "INTERMEDIATE-PROOF-STEP-VALID-MEMOIZED?-INTERNAL", 3, 0, false);
        declareFunction("intermediate_proof_step_valid_memoizedP", "INTERMEDIATE-PROOF-STEP-VALID-MEMOIZED?", 3, 0, false);
        declareFunction("intermediate_proof_step_validP", "INTERMEDIATE-PROOF-STEP-VALID?", 3, 0, false);
        declareFunction("intermediate_proof_validP", "INTERMEDIATE-PROOF-VALID?", 1, 0, false);
        declareFunction("intermediate_proof_valid_intP", "INTERMEDIATE-PROOF-VALID-INT?", 2, 0, false);
        declareFunction("intermediate_proof_asent_validP", "INTERMEDIATE-PROOF-ASENT-VALID?", 4, 0, false);
        declareFunction("intermediate_proof_valid_due_to_structureP", "INTERMEDIATE-PROOF-VALID-DUE-TO-STRUCTURE?", 1, 0, false);
        declareFunction("intermediate_proof_supports_validP", "INTERMEDIATE-PROOF-SUPPORTS-VALID?", 2, 0, false);
        declareFunction("intermediate_proof_content_link_validP", "INTERMEDIATE-PROOF-CONTENT-LINK-VALID?", 1, 0, false);
        declareFunction("propose_new_proof_with_bindings", "PROPOSE-NEW-PROOF-WITH-BINDINGS", 3, 0, false);
        declareFunction("proof_propagate_non_explananatory_subproofs", "PROOF-PROPAGATE-NON-EXPLANANATORY-SUBPROOFS", 1, 0, false);
        declareFunction("proof_circularP", "PROOF-CIRCULAR?", 1, 0, false);
        declareFunction("proof_circular_wrtP", "PROOF-CIRCULAR-WRT?", 3, 0, false);
        declareFunction("proofs_share_problem_and_bindingsP", "PROOFS-SHARE-PROBLEM-AND-BINDINGS?", 2, 0, false);
        declareFunction("proofs_share_problem_and_bindings_and_direct_supportsP", "PROOFS-SHARE-PROBLEM-AND-BINDINGS-AND-DIRECT-SUPPORTS?", 2, 0, false);
        declareFunction("reject_proof_due_to_circularity", "REJECT-PROOF-DUE-TO-CIRCULARITY", 1, 0, false);
        declareFunction("reject_proof_due_to_ill_formedness", "REJECT-PROOF-DUE-TO-ILL-FORMEDNESS", 1, 0, false);
        declareFunction("reject_proof_due_to_non_abducible_rule", "REJECT-PROOF-DUE-TO-NON-ABDUCIBLE-RULE", 1, 0, false);
        declareFunction("reject_proof_due_to_modus_tollens_with_non_wff", "REJECT-PROOF-DUE-TO-MODUS-TOLLENS-WITH-NON-WFF", 1, 0, false);
        declareFunction("reject_proof", "REJECT-PROOF", 2, 0, false);
        declareFunction("propagate_proof_rejected", "PROPAGATE-PROOF-REJECTED", 1, 0, false);
        declareFunction("proof_note_proven_query_no_good_due_to_ill_formedness", "PROOF-NOTE-PROVEN-QUERY-NO-GOOD-DUE-TO-ILL-FORMEDNESS", 1, 0, false);
        declareFunction("problem_force_no_goodness", "PROBLEM-FORCE-NO-GOODNESS", 1, 0, false);
        declareFunction("possibly_note_proof_processed", "POSSIBLY-NOTE-PROOF-PROCESSED", 1, 0, false);
        declareFunction("possibly_note_proof_processed_int", "POSSIBLY-NOTE-PROOF-PROCESSED-INT", 1, 0, false);
        declareFunction("consider_that_subproofs_may_be_unprocessed", "CONSIDER-THAT-SUBPROOFS-MAY-BE-UNPROCESSED", 1, 0, false);
        declareFunction("all_dependent_proofs_are_processedP", "ALL-DEPENDENT-PROOFS-ARE-PROCESSED?", 1, 0, false);
        declareFunction("find_proof", "FIND-PROOF", 3, 0, false);
        declareFunction("conjunctive_proof_subsumes_conjunctive_proof_specP", "CONJUNCTIVE-PROOF-SUBSUMES-CONJUNCTIVE-PROOF-SPEC?", 4, 0, false);
        declareFunction("connected_conjunction_proof_subsumes_connected_conjunction_proof_specP", "CONNECTED-CONJUNCTION-PROOF-SUBSUMES-CONNECTED-CONJUNCTION-PROOF-SPEC?", 4, 0, false);
        declareFunction("split_proof_subsumes_split_proof_specP", "SPLIT-PROOF-SUBSUMES-SPLIT-PROOF-SPEC?", 4, 0, false);
        declareFunction("residual_transformation_proof_subsumes_conjunctive_proof_specP", "RESIDUAL-TRANSFORMATION-PROOF-SUBSUMES-CONJUNCTIVE-PROOF-SPEC?", 4, 0, false);
        declareFunction("residual_transformation_proof_subsumes_conjunctive_proof_specP_int", "RESIDUAL-TRANSFORMATION-PROOF-SUBSUMES-CONJUNCTIVE-PROOF-SPEC?-INT", 4, 0, false);
        declareFunction("new_goal_proof", "NEW-GOAL-PROOF", 1, 0, false);
        declareFunction("proof_proven_query", "PROOF-PROVEN-QUERY", 1, 0, false);
        declareFunction("proof_proven_sentence", "PROOF-PROVEN-SENTENCE", 1, 0, false);
        declareFunction("proof_bindings_from_constituents", "PROOF-BINDINGS-FROM-CONSTITUENTS", 3, 0, false);
        declareFunction("ncanonicalize_proof_bindings_int", "NCANONICALIZE-PROOF-BINDINGS-INT", 1, 0, false);
        declareFunction("ncanonicalize_proof_bindings", "NCANONICALIZE-PROOF-BINDINGS", 1, 0, false);
        declareFunction("canonicalize_proof_bindings", "CANONICALIZE-PROOF-BINDINGS", 1, 0, false);
        declareFunction("proof_bindings_canonicalP", "PROOF-BINDINGS-CANONICAL?", 1, 0, false);
        declareFunction("proof_bindings_canonicalP_recursive", "PROOF-BINDINGS-CANONICAL?-RECURSIVE", 2, 0, false);
        declareFunction("proof_bindings_equalP", "PROOF-BINDINGS-EQUAL?", 2, 0, false);
        declareFunction("unify_all_equal_bindings", "UNIFY-ALL-EQUAL-BINDINGS", 1, 0, false);
        declareFunction("two_values_in_bindings_with_same_variable", "TWO-VALUES-IN-BINDINGS-WITH-SAME-VARIABLE", 2, 0, false);
        declareFunction("all_bindings_ground_outP", "ALL-BINDINGS-GROUND-OUT?", 1, 0, false);
        declareFunction("binding_ground_outP", "BINDING-GROUND-OUT?", 1, 0, false);
        declareFunction("bubble_up_proof", "BUBBLE-UP-PROOF", 1, 0, false);
        declareFunction("bubble_up_proof_from_problem", "BUBBLE-UP-PROOF-FROM-PROBLEM", 2, 0, false);
        declareFunction("bubble_up_proof_to_link", "BUBBLE-UP-PROOF-TO-LINK", 2, 0, false);
        declareFunction("bubble_up_proof_to_link_via_mapped_problem", "BUBBLE-UP-PROOF-TO-LINK-VIA-MAPPED-PROBLEM", 3, 0, false);
        declareFunction("bubble_up_proof_to_link_via_variable_map", "BUBBLE-UP-PROOF-TO-LINK-VIA-VARIABLE-MAP", 3, 0, false);
        declareFunction("perform_lazy_proof_rejection", "PERFORM-LAZY-PROOF-REJECTION", 2, 0, false);
        declareFunction("proof_consistent_with_mt_assumptionsP", "PROOF-CONSISTENT-WITH-MT-ASSUMPTIONS?", 1, 0, false);
        declareFunction("within_abnormality_checkingP", "WITHIN-ABNORMALITY-CHECKING?", 0, 0, false);
        declareFunction("reject_abnormal_subproofs", "REJECT-ABNORMAL-SUBPROOFS", 1, 0, false);
        declareFunction("reject_proof_due_to_abnormality", "REJECT-PROOF-DUE-TO-ABNORMALITY", 2, 0, false);
        declareFunction("inference_proof_non_explanatory_subproofs", "INFERENCE-PROOF-NON-EXPLANATORY-SUBPROOFS", 2, 0, false);
        declareFunction("cached_inference_proof_non_explanatory_subproofs_internal", "CACHED-INFERENCE-PROOF-NON-EXPLANATORY-SUBPROOFS-INTERNAL", 2, 0, false);
        declareFunction("cached_inference_proof_non_explanatory_subproofs", "CACHED-INFERENCE-PROOF-NON-EXPLANATORY-SUBPROOFS", 2, 0, false);
        declareFunction("proof_non_explanatory_subproofs", "PROOF-NON-EXPLANATORY-SUBPROOFS", 1, 0, false);
        declareFunction("compute_generalized_transformation_proof_non_explanatory_subproofs", "COMPUTE-GENERALIZED-TRANSFORMATION-PROOF-NON-EXPLANATORY-SUBPROOFS", 1, 0, false);
        declareFunction("inference_proof_proven_non_explanatory_subquery", "INFERENCE-PROOF-PROVEN-NON-EXPLANATORY-SUBQUERY", 2, 0, false);
        declareFunction("generalized_transformation_proof_proven_non_explanatory_subquery", "GENERALIZED-TRANSFORMATION-PROOF-PROVEN-NON-EXPLANATORY-SUBQUERY", 1, 0, false);
        declareFunction("transformation_proof_proven_non_explanatory_subquery", "TRANSFORMATION-PROOF-PROVEN-NON-EXPLANATORY-SUBQUERY", 1, 0, false);
        declareFunction("residual_transformation_proof_proven_non_explanatory_subquery", "RESIDUAL-TRANSFORMATION-PROOF-PROVEN-NON-EXPLANATORY-SUBQUERY", 1, 0, false);
        declareFunction("compute_non_explanatory_subproofs", "COMPUTE-NON-EXPLANATORY-SUBPROOFS", 2, 0, false);
        declareFunction("non_explanatory_subproofs_recursive", "NON-EXPLANATORY-SUBPROOFS-RECURSIVE", 3, 0, false);
        declareFunction("non_explanatory_proofP", "NON-EXPLANATORY-PROOF?", 2, 0, false);
        declareFunction("non_explanatory_asentP", "NON-EXPLANATORY-ASENT?", 3, 0, false);
        declareFunction("explanatory_asentP", "EXPLANATORY-ASENT?", 3, 0, false);
        declareFunction("note_tactic_finished", "NOTE-TACTIC-FINISHED", 1, 0, false);
        declareFunction("consider_strategic_ramifications_of_possibly_executed_tactic", "CONSIDER-STRATEGIC-RAMIFICATIONS-OF-POSSIBLY-EXECUTED-TACTIC", 2, 0, false);
        declareFunction("consider_strategic_ramifications_of_executed_tactic", "CONSIDER-STRATEGIC-RAMIFICATIONS-OF-EXECUTED-TACTIC", 2, 0, false);
        declareFunction("note_problem_created", "NOTE-PROBLEM-CREATED", 1, 0, false);
        declareFunction("possibly_reactivate_problem", "POSSIBLY-REACTIVATE-PROBLEM", 2, 0, false);
        declareFunction("possibly_activate_problem", "POSSIBLY-ACTIVATE-PROBLEM", 2, 0, false);
        declareFunction("determine_strategic_status_wrt", "DETERMINE-STRATEGIC-STATUS-WRT", 2, 0, false);
        declareFunction("note_problem_examined", "NOTE-PROBLEM-EXAMINED", 1, 0, false);
        declareFunction("possibly_note_problem_strategically_examined", "POSSIBLY-NOTE-PROBLEM-STRATEGICALLY-EXAMINED", 2, 0, false);
        declareFunction("note_problem_possible", "NOTE-PROBLEM-POSSIBLE", 1, 0, false);
        declareFunction("possibly_note_problem_strategically_possible", "POSSIBLY-NOTE-PROBLEM-STRATEGICALLY-POSSIBLE", 2, 0, false);
        declareFunction("note_problem_strategically_unexamined", "NOTE-PROBLEM-STRATEGICALLY-UNEXAMINED", 2, 0, false);
        declareFunction("note_problem_strategically_possible", "NOTE-PROBLEM-STRATEGICALLY-POSSIBLE", 2, 0, false);
        declareFunction("possibly_note_problem_pending", "POSSIBLY-NOTE-PROBLEM-PENDING", 2, 0, false);
        declareFunction("note_problem_pending", "NOTE-PROBLEM-PENDING", 2, 0, false);
        declareFunction("possibly_note_problem_finished", "POSSIBLY-NOTE-PROBLEM-FINISHED", 2, 0, false);
        declareFunction("note_problem_finished", "NOTE-PROBLEM-FINISHED", 2, 0, false);
        declareFunction("consider_ramifications_of_problem_finished", "CONSIDER-RAMIFICATIONS-OF-PROBLEM-FINISHED", 2, 0, false);
        declareFunction("possibly_propagate_problem_finished", "POSSIBLY-PROPAGATE-PROBLEM-FINISHED", 2, 0, false);
        declareFunction("strategy_note_problem_finished", "STRATEGY-NOTE-PROBLEM-FINISHED", 2, 0, false);
        declareFunction("note_argument_link_added", "NOTE-ARGUMENT-LINK-ADDED", 1, 0, false);
        declareFunction("note_goal_link_added", "NOTE-GOAL-LINK-ADDED", 1, 0, false);
        declareFunction("strategic_context_p", "STRATEGIC-CONTEXT-P", 1, 0, false);
        declareFunction("strategic_context_suid", "STRATEGIC-CONTEXT-SUID", 1, 0, false);
        declareFunction("find_strategic_context_by_id", "FIND-STRATEGIC-CONTEXT-BY-ID", 2, 0, false);
        declareFunction("find_strategic_context_by_ids", "FIND-STRATEGIC-CONTEXT-BY-IDS", 2, 0, false);
        declareFunction("strategic_context_may_modify_its_problem_storeP", "STRATEGIC-CONTEXT-MAY-MODIFY-ITS-PROBLEM-STORE?", 1, 0, false);
        declareFunction("no_good_problem_p", "NO-GOOD-PROBLEM-P", 2, 0, false);
        declareFunction("neutral_problem_p", "NEUTRAL-PROBLEM-P", 2, 0, false);
        declareFunction("good_problem_p", "GOOD-PROBLEM-P", 2, 0, false);
        declareFunction("examined_problem_p", "EXAMINED-PROBLEM-P", 2, 0, false);
        declareFunction("possible_problem_p", "POSSIBLE-PROBLEM-P", 2, 0, false);
        declareFunction("pending_problem_p", "PENDING-PROBLEM-P", 2, 0, false);
        declareFunction("finished_problem_p", "FINISHED-PROBLEM-P", 2, 0, false);
        declareFunction("potentially_possible_problem_p", "POTENTIALLY-POSSIBLE-PROBLEM-P", 2, 0, false);
        declareFunction("not_potentially_possible_problem_p", "NOT-POTENTIALLY-POSSIBLE-PROBLEM-P", 2, 0, false);
        declareFunction("totally_finished_problem_p", "TOTALLY-FINISHED-PROBLEM-P", 2, 0, false);
        declareFunction("propagate_problem_link", "PROPAGATE-PROBLEM-LINK", 1, 0, false);
        declareFunction("propagate_proofs", "PROPAGATE-PROOFS", 1, 0, false);
        declareFunction("repropagate_newly_opened_link", "REPROPAGATE-NEWLY-OPENED-LINK", 2, 0, false);
        declareFunction("problem_link_open_and_repropagate_sole_supporting_mapped_problem", "PROBLEM-LINK-OPEN-AND-REPROPAGATE-SOLE-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
        declareFunction("problem_link_open_and_repropagate_index", "PROBLEM-LINK-OPEN-AND-REPROPAGATE-INDEX", 2, 0, false);
        declareFunction("problem_link_open_and_repropagate_supporting_mapped_problem", "PROBLEM-LINK-OPEN-AND-REPROPAGATE-SUPPORTING-MAPPED-PROBLEM", 2, 0, false);
        declareFunction("problem_link_open_and_repropagate_all", "PROBLEM-LINK-OPEN-AND-REPROPAGATE-ALL", 1, 0, false);
        declareFunction("propagate_answer_link", "PROPAGATE-ANSWER-LINK", 1, 0, false);
        declareFunction("possibly_propagate_answer_link", "POSSIBLY-PROPAGATE-ANSWER-LINK", 1, 0, false);
        declareFunction("propagate_proof_to_inference", "PROPAGATE-PROOF-TO-INFERENCE", 2, 0, false);
        declareFunction("consider_closing_answer_link", "CONSIDER-CLOSING-ANSWER-LINK", 1, 0, false);
        declareFunction("inference_deems_answer_link_should_be_closedP", "INFERENCE-DEEMS-ANSWER-LINK-SHOULD-BE-CLOSED?", 2, 0, false);
        declareFunction("close_answer_link", "CLOSE-ANSWER-LINK", 1, 0, false);
        declareFunction("proof_tree_validP", "PROOF-TREE-VALID?", 1, 0, false);
        declareFunction("recursive_proof_tree_validP", "RECURSIVE-PROOF-TREE-VALID?", 1, 0, false);
        declareFunction("depth_L", "DEPTH-<", 2, 0, false);
        declareFunction("depth_LE", "DEPTH-<=", 2, 0, false);
        declareFunction("propagate_min_proof_depth_via_link", "PROPAGATE-MIN-PROOF-DEPTH-VIA-LINK", 1, 0, false);
        declareFunction("propagate_min_proof_depth_via_link_wrt_inference", "PROPAGATE-MIN-PROOF-DEPTH-VIA-LINK-WRT-INFERENCE", 2, 0, false);
        declareFunction("proof_depth_L", "PROOF-DEPTH-<", 2, 0, false);
        declareFunction("problem_strictly_within_max_proof_depthP", "PROBLEM-STRICTLY-WITHIN-MAX-PROOF-DEPTH?", 2, 0, false);
        declareFunction("propagate_min_transformation_depth_via_link", "PROPAGATE-MIN-TRANSFORMATION-DEPTH-VIA-LINK", 1, 0, false);
        declareFunction("propagate_min_transformation_depth_via_link_wrt_inference", "PROPAGATE-MIN-TRANSFORMATION-DEPTH-VIA-LINK-WRT-INFERENCE", 2, 0, false);
        declareFunction("clear_uninterestingness_cache_wrt_transformation", "CLEAR-UNINTERESTINGNESS-CACHE-WRT-TRANSFORMATION", 2, 0, false);
        declareFunction("transformation_depth_L", "TRANSFORMATION-DEPTH-<", 2, 0, false);
        declareFunction("transformation_depth_LE", "TRANSFORMATION-DEPTH-<=", 2, 0, false);
        declareFunction("problem_strictly_within_max_transformation_depthP", "PROBLEM-STRICTLY-WITHIN-MAX-TRANSFORMATION-DEPTH?", 2, 0, false);
        declareFunction("problem_transformation_allowed_wrt_max_transformation_depthP", "PROBLEM-TRANSFORMATION-ALLOWED-WRT-MAX-TRANSFORMATION-DEPTH?", 2, 0, false);
        declareFunction("logical_tactic_transformation_allowed_wrt_max_transformation_depthP", "LOGICAL-TACTIC-TRANSFORMATION-ALLOWED-WRT-MAX-TRANSFORMATION-DEPTH?", 2, 0, false);
        declareFunction("transformation_depth_increment", "TRANSFORMATION-DEPTH-INCREMENT", 2, 0, false);
        declareFunction("problem_has_been_transformedP", "PROBLEM-HAS-BEEN-TRANSFORMED?", 2, 0, false);
        declareFunction("propagate_strategy_activity", "PROPAGATE-STRATEGY-ACTIVITY", 1, 0, false);
        declareFunction("maybe_possibly_activate_problem", "MAYBE-POSSIBLY-ACTIVATE-PROBLEM", 2, 0, false);
        declareFunction("link_permits_activity_propagationP", "LINK-PERMITS-ACTIVITY-PROPAGATION?", 2, 0, false);
        declareFunction("propagate_inference_relevance", "PROPAGATE-INFERENCE-RELEVANCE", 1, 0, false);
        declareFunction("propagate_relevance_to_supporting_problem", "PROPAGATE-RELEVANCE-TO-SUPPORTING-PROBLEM", 2, 0, false);
        declareFunction("possibly_note_problem_relevant", "POSSIBLY-NOTE-PROBLEM-RELEVANT", 2, 0, false);
        declareFunction("link_permits_relevance_propagationP", "LINK-PERMITS-RELEVANCE-PROPAGATION?", 2, 0, false);
        declareFunction("link_permits_proof_propagationP", "LINK-PERMITS-PROOF-PROPAGATION?", 2, 0, false);
        declareFunction("consider_that_mapped_problem_could_be_irrelevant", "CONSIDER-THAT-MAPPED-PROBLEM-COULD-BE-IRRELEVANT", 2, 0, false);
        declareFunction("consider_that_problem_could_be_irrelevant_to_inference", "CONSIDER-THAT-PROBLEM-COULD-BE-IRRELEVANT-TO-INFERENCE", 2, 0, false);
        declareFunction("problem_irrelevant_to_inferenceP", "PROBLEM-IRRELEVANT-TO-INFERENCE?", 2, 0, false);
        declareFunction("maybe_make_problem_irrelevant_to_inference", "MAYBE-MAKE-PROBLEM-IRRELEVANT-TO-INFERENCE", 2, 0, false);
        declareFunction("make_problem_irrelevant_to_inference", "MAKE-PROBLEM-IRRELEVANT-TO-INFERENCE", 2, 0, false);
        declareFunction("propagate_inference_irrelevance", "PROPAGATE-INFERENCE-IRRELEVANCE", 2, 0, false);
        declareFunction("problem_raw_tactical_or_strategic_status", "PROBLEM-RAW-TACTICAL-OR-STRATEGIC-STATUS", 2, 0, false);
        declareFunction("set_problem_raw_tactical_or_strategic_status", "SET-PROBLEM-RAW-TACTICAL-OR-STRATEGIC-STATUS", 3, 0, false);
        declareFunction("change_and_propagate_problem_status", "CHANGE-AND-PROPAGATE-PROBLEM-STATUS", 4, 0, false);
        declareFunction("change_and_propagate_problem_status_int", "CHANGE-AND-PROPAGATE-PROBLEM-STATUS-INT", 5, 0, false);
        declareFunction("set_problem_raw_status_if_strategic", "SET-PROBLEM-RAW-STATUS-IF-STRATEGIC", 5, 0, false);
        declareFunction("prohibited_problem_status_change_error", "PROHIBITED-PROBLEM-STATUS-CHANGE-ERROR", 3, 0, false);
        declareFunction("consider_that_problem_could_be_good", "CONSIDER-THAT-PROBLEM-COULD-BE-GOOD", 1, 0, false);
        declareFunction("problem_goodP", "PROBLEM-GOOD?", 1, 0, false);
        declareFunction("good_version_of_problem_status", "GOOD-VERSION-OF-PROBLEM-STATUS", 1, 0, false);
        declareFunction("unexamined_version_of_problem_status", "UNEXAMINED-VERSION-OF-PROBLEM-STATUS", 1, 0, false);
        declareFunction("examined_version_of_problem_status", "EXAMINED-VERSION-OF-PROBLEM-STATUS", 1, 0, false);
        declareFunction("possible_version_of_problem_status", "POSSIBLE-VERSION-OF-PROBLEM-STATUS", 1, 0, false);
        declareFunction("pending_version_of_problem_status", "PENDING-VERSION-OF-PROBLEM-STATUS", 1, 0, false);
        declareFunction("finished_version_of_problem_status", "FINISHED-VERSION-OF-PROBLEM-STATUS", 1, 0, false);
        declareFunction("consider_that_problem_could_no_longer_be_good", "CONSIDER-THAT-PROBLEM-COULD-NO-LONGER-BE-GOOD", 1, 0, false);
        declareFunction("consider_that_problem_could_be_finished", "CONSIDER-THAT-PROBLEM-COULD-BE-FINISHED", 4, 0, false);
        declareFunction("problem_could_be_finishedP", "PROBLEM-COULD-BE-FINISHED?", 4, 0, false);
        declareFunction("problem_link_openableP", "PROBLEM-LINK-OPENABLE?", 2, 0, false);
        declareFunction("problem_link_could_be_finishedP", "PROBLEM-LINK-COULD-BE-FINISHED?", 3, 0, false);
        declareFunction("split_link_could_be_finishedP", "SPLIT-LINK-COULD-BE-FINISHED?", 2, 0, false);
        declareFunction("join_link_could_be_finishedP", "JOIN-LINK-COULD-BE-FINISHED?", 2, 0, false);
        declareFunction("union_link_could_be_finishedP", "UNION-LINK-COULD-BE-FINISHED?", 2, 0, false);
        declareFunction("consider_that_problem_could_be_no_good", "CONSIDER-THAT-PROBLEM-COULD-BE-NO-GOOD", 4, 0, false);
        declareFunction("default_consider_that_problem_could_be_no_good", "DEFAULT-CONSIDER-THAT-PROBLEM-COULD-BE-NO-GOOD", 4, 0, false);
        declareFunction("note_tactic_doomed", "NOTE-TACTIC-DOOMED", 2, 0, false);
        declareFunction("make_problem_no_good", "MAKE-PROBLEM-NO-GOOD", 3, 0, false);
        declareFunction("discard_all_possible_tactics", "DISCARD-ALL-POSSIBLE-TACTICS", 1, 0, false);
        declareFunction("discard_all_impossible_possible_tactics", "DISCARD-ALL-IMPOSSIBLE-POSSIBLE-TACTICS", 1, 0, false);
        declareFunction("discard_possible_tactics_int", "DISCARD-POSSIBLE-TACTICS-INT", 6, 0, false);
        declareFunction("consider_that_problem_could_be_strategically_pending", "CONSIDER-THAT-PROBLEM-COULD-BE-STRATEGICALLY-PENDING", 1, 0, false);
        declareFunction("consider_that_problem_could_be_strategically_pending_wrt", "CONSIDER-THAT-PROBLEM-COULD-BE-STRATEGICALLY-PENDING-WRT", 2, 0, false);
        declareFunction("consider_that_supported_problems_could_be_no_good", "CONSIDER-THAT-SUPPORTED-PROBLEMS-COULD-BE-NO-GOOD", 3, 0, false);
        declareFunction("no_good_version_of_problem_status", "NO-GOOD-VERSION-OF-PROBLEM-STATUS", 1, 0, false);
        declareFunction("unsatisfiable_problemP", "UNSATISFIABLE-PROBLEM?", 4, 0, false);
        declareFunction("problem_doomedP", "PROBLEM-DOOMED?", 2, 0, false);
        declareFunction("compute_shared_vars_that_are_actually_bindable", "COMPUTE-SHARED-VARS-THAT-ARE-ACTUALLY-BINDABLE", 4, 0, false);
        declareFunction("shared_var_actually_bindableP", "SHARED-VAR-ACTUALLY-BINDABLE?", 4, 0, false);
        declareFunction("join_ordered_tactic_has_a_chance_at_binding_varP", "JOIN-ORDERED-TACTIC-HAS-A-CHANCE-AT-BINDING-VAR?", 3, 0, false);
        declareFunction("all_no_good_simplification_linksP", "ALL-NO-GOOD-SIMPLIFICATION-LINKS?", 4, 0, false);
        declareFunction("problem_has_some_open_obviously_neutral_argument_linkP", "PROBLEM-HAS-SOME-OPEN-OBVIOUSLY-NEUTRAL-ARGUMENT-LINK?", 4, 0, false);
        declareFunction("some_no_good_split_argument_linkP", "SOME-NO-GOOD-SPLIT-ARGUMENT-LINK?", 4, 0, false);
        declareFunction("some_no_good_preferred_join_ordered_argument_linkP", "SOME-NO-GOOD-PREFERRED-JOIN-ORDERED-ARGUMENT-LINK?", 4, 0, false);
        declareFunction("some_no_good_join_argument_linkP", "SOME-NO-GOOD-JOIN-ARGUMENT-LINK?", 4, 0, false);
        declareFunction("all_no_good_union_argument_linksP", "ALL-NO-GOOD-UNION-ARGUMENT-LINKS?", 4, 0, false);
        declareFunction("problem_link_no_goodP", "PROBLEM-LINK-NO-GOOD?", 4, 0, false);
        declareFunction("unsatisfiable_problem_ignoring_transformation_tacticsP", "UNSATISFIABLE-PROBLEM-IGNORING-TRANSFORMATION-TACTICS?", 2, 0, false);
        declareFunction("problem_link_has_some_open_obviously_neutral_supporting_mapped_problemP", "PROBLEM-LINK-HAS-SOME-OPEN-OBVIOUSLY-NEUTRAL-SUPPORTING-MAPPED-PROBLEM?", 2, 0, false);
        declareFunction("problem_link_has_some_open_obviously_good_supporting_mapped_problemP", "PROBLEM-LINK-HAS-SOME-OPEN-OBVIOUSLY-GOOD-SUPPORTING-MAPPED-PROBLEM?", 1, 0, false);
        declareFunction("problem_link_interesting_when_considered_deepP", "PROBLEM-LINK-INTERESTING-WHEN-CONSIDERED-DEEP?", 1, 0, false);
        declareFunction("restricted_focal_problem_has_a_no_good_restricted_non_focal_analogueP", "RESTRICTED-FOCAL-PROBLEM-HAS-A-NO-GOOD-RESTRICTED-NON-FOCAL-ANALOGUE?", 2, 0, false);
        declareFunction("problem_link_no_good_wrt_dependent_join_ordered_linkP", "PROBLEM-LINK-NO-GOOD-WRT-DEPENDENT-JOIN-ORDERED-LINK?", 4, 0, false);
        declareFunction("link_permits_no_good_propagation_to_supported_problemsP", "LINK-PERMITS-NO-GOOD-PROPAGATION-TO-SUPPORTED-PROBLEMS?", 1, 0, false);
        declareFunction("propagate_proof_spec_via_answer_link", "PROPAGATE-PROOF-SPEC-VIA-ANSWER-LINK", 1, 0, false);
        declareFunction("propagate_proof_spec", "PROPAGATE-PROOF-SPEC", 1, 0, false);
        declareFunction("problem_has_some_proof_spec_to_propagateP", "PROBLEM-HAS-SOME-PROOF-SPEC-TO-PROPAGATE?", 1, 0, false);
        declareFunction("propagate_proof_spec_to_supporting_problem_via_link", "PROPAGATE-PROOF-SPEC-TO-SUPPORTING-PROBLEM-VIA-LINK", 3, 0, false);
        declareMacro("with_proof_spec_of_appropriate_type", "WITH-PROOF-SPEC-OF-APPROPRIATE-TYPE");
        declareFunction("strategy_propagate_proof_spec_to_supporting_problem_via_link", "STRATEGY-PROPAGATE-PROOF-SPEC-TO-SUPPORTING-PROBLEM-VIA-LINK", 4, 0, false);
        declareFunction("link_permits_proof_spec_propagationP", "LINK-PERMITS-PROOF-SPEC-PROPAGATION?", 2, 0, false);
        declareFunction("proof_spec_of_appropriate_typeP", "PROOF-SPEC-OF-APPROPRIATE-TYPE?", 2, 0, false);
        declareFunction("strategy_propagate_problem_proof_spec", "STRATEGY-PROPAGATE-PROBLEM-PROOF-SPEC", 3, 0, false);
        declareFunction("propagate_join_ordered_proof_spec_via_join_ordered_link", "PROPAGATE-JOIN-ORDERED-PROOF-SPEC-VIA-JOIN-ORDERED-LINK", 4, 0, false);
        declareFunction("propagate_join_ordered_proof_spec_via_join_ordered_link_int", "PROPAGATE-JOIN-ORDERED-PROOF-SPEC-VIA-JOIN-ORDERED-LINK-INT", 4, 0, false);
        declareFunction("propagate_proof_spec_via_union_link", "PROPAGATE-PROOF-SPEC-VIA-UNION-LINK", 4, 0, false);
        declareFunction("propagate_residual_transformation_proof_spec_via_join_ordered_link", "PROPAGATE-RESIDUAL-TRANSFORMATION-PROOF-SPEC-VIA-JOIN-ORDERED-LINK", 4, 0, false);
        declareFunction("propagate_residual_transformation_proof_spec_via_join_ordered_link_int", "PROPAGATE-RESIDUAL-TRANSFORMATION-PROOF-SPEC-VIA-JOIN-ORDERED-LINK-INT", 4, 0, false);
        declareFunction("propagate_proof_spec_via_restriction_link", "PROPAGATE-PROOF-SPEC-VIA-RESTRICTION-LINK", 4, 0, false);
        declareFunction("propagate_proof_spec_via_split_link", "PROPAGATE-PROOF-SPEC-VIA-SPLIT-LINK", 4, 0, false);
        declareFunction("propagate_proof_spec_via_join_link", "PROPAGATE-PROOF-SPEC-VIA-JOIN-LINK", 4, 0, false);
        declareFunction("propagate_proof_spec_via_conjunctive_link", "PROPAGATE-PROOF-SPEC-VIA-CONJUNCTIVE-LINK", 4, 0, false);
        declareFunction("propagate_proof_spec_via_simplification_link", "PROPAGATE-PROOF-SPEC-VIA-SIMPLIFICATION-LINK", 4, 0, false);
        declareFunction("propagate_proof_spec_via_transformation_link", "PROPAGATE-PROOF-SPEC-VIA-TRANSFORMATION-LINK", 4, 0, false);
        declareFunction("propagate_transformation_proof_spec_via_transformation_link", "PROPAGATE-TRANSFORMATION-PROOF-SPEC-VIA-TRANSFORMATION-LINK", 4, 0, false);
        declareFunction("propagate_proof_spec_via_residual_transformation_link", "PROPAGATE-PROOF-SPEC-VIA-RESIDUAL-TRANSFORMATION-LINK", 4, 0, false);
        declareFunction("propagate_residual_transformation_proof_spec_via_residual_transformation_link", "PROPAGATE-RESIDUAL-TRANSFORMATION-PROOF-SPEC-VIA-RESIDUAL-TRANSFORMATION-LINK", 4, 0, false);
        declareFunction("find_problem", "FIND-PROBLEM", 3, 0, false);
        declareFunction("find_or_create_problem", "FIND-OR-CREATE-PROBLEM", 3, 1, false);
        declareFunction("find_problem_int", "FIND-PROBLEM-INT", 4, 0, false);
        declareFunction("find_or_create_problem_from_contextualized_asent_sense", "FIND-OR-CREATE-PROBLEM-FROM-CONTEXTUALIZED-ASENT-SENSE", 4, 0, false);
        declareFunction("find_or_create_problem_from_contextualized_clause", "FIND-OR-CREATE-PROBLEM-FROM-CONTEXTUALIZED-CLAUSE", 3, 0, false);
        declareFunction("find_or_create_problem_from_subclause_spec", "FIND-OR-CREATE-PROBLEM-FROM-SUBCLAUSE-SPEC", 4, 0, false);
        declareFunction("find_or_create_problem_without_subclause_spec", "FIND-OR-CREATE-PROBLEM-WITHOUT-SUBCLAUSE-SPEC", 4, 0, false);
        declareFunction("find_or_create_root_problem_and_link", "FIND-OR-CREATE-ROOT-PROBLEM-AND-LINK", 1, 0, false);
        declareFunction("new_root_answer_link", "NEW-ROOT-ANSWER-LINK", 2, 0, false);
        declareFunction("find_or_create_root_problem", "FIND-OR-CREATE-ROOT-PROBLEM", 3, 0, false);
        declareFunction("prune_problem_store", "PRUNE-PROBLEM-STORE", 1, 1, false);
        declareFunction("destroy_discarded_tactics", "DESTROY-DISCARDED-TACTICS", 1, 0, false);
        declareFunction("tactic_thrown_away_and_privateP", "TACTIC-THROWN-AWAY-AND-PRIVATE?", 2, 0, false);
        declareFunction("destroy_destructible_problems", "DESTROY-DESTRUCTIBLE-PROBLEMS", 1, 0, false);
        declareFunction("recompute_destructible_problems", "RECOMPUTE-DESTRUCTIBLE-PROBLEMS", 1, 1, false);
        declareFunction("consider_deep_no_goodness", "CONSIDER-DEEP-NO-GOODNESS", 1, 0, false);
        declareFunction("compute_problem_store_min_depth_index", "COMPUTE-PROBLEM-STORE-MIN-DEPTH-INDEX", 1, 0, false);
        declareFunction("compute_indestructible_problems_from_inferences", "COMPUTE-INDESTRUCTIBLE-PROBLEMS-FROM-INFERENCES", 1, 0, false);
        declareFunction("possibly_propagate_problem_indestructible", "POSSIBLY-PROPAGATE-PROBLEM-INDESTRUCTIBLE", 1, 0, false);
        declareFunction("possibly_propagate_problem_indestructible_int", "POSSIBLY-PROPAGATE-PROBLEM-INDESTRUCTIBLE-INT", 1, 0, false);
        declareFunction("possibly_note_problem_indestructible", "POSSIBLY-NOTE-PROBLEM-INDESTRUCTIBLE", 1, 0, false);
        declareFunction("compute_problem_link_destructibleP", "COMPUTE-PROBLEM-LINK-DESTRUCTIBLE?", 1, 0, false);
        declareFunction("problem_link_closed_foreverP", "PROBLEM-LINK-CLOSED-FOREVER?", 1, 0, false);
        declareFunction("problem_link_closed_forever_wrt_supporting_mapped_problemP", "PROBLEM-LINK-CLOSED-FOREVER-WRT-SUPPORTING-MAPPED-PROBLEM?", 2, 0, false);
        declareFunction("problem_should_be_indestructibleP", "PROBLEM-SHOULD-BE-INDESTRUCTIBLE?", 1, 0, false);
        declareFunction("variant_problemP", "VARIANT-PROBLEM?", 1, 0, false);
        declareFunction("problem_store_janitor_destructible_problem_list", "PROBLEM-STORE-JANITOR-DESTRUCTIBLE-PROBLEM-LIST", 1, 0, false);
        declareFunction("note_all_root_problems_indestructible", "NOTE-ALL-ROOT-PROBLEMS-INDESTRUCTIBLE", 1, 0, false);
        declareFunction("compute_indestructible_problems_due_to_proofs", "COMPUTE-INDESTRUCTIBLE-PROBLEMS-DUE-TO-PROOFS", 1, 0, false);
        declareFunction("propagate_proof_indestructibility", "PROPAGATE-PROOF-INDESTRUCTIBILITY", 1, 0, false);
        declareFunction("compute_indestructible_problems_due_to_strategic_activity", "COMPUTE-INDESTRUCTIBLE-PROBLEMS-DUE-TO-STRATEGIC-ACTIVITY", 1, 0, false);
        declareFunction("compute_indestructible_problems_due_to_potentially_useful_transformation_link", "COMPUTE-INDESTRUCTIBLE-PROBLEMS-DUE-TO-POTENTIALLY-USEFUL-TRANSFORMATION-LINK", 1, 0, false);
        declareFunction("possibly_prune_processed_problems", "POSSIBLY-PRUNE-PROCESSED-PROBLEMS", 1, 0, false);
        declareFunction("possibly_prune_wrt_conjunctive_removal", "POSSIBLY-PRUNE-WRT-CONJUNCTIVE-REMOVAL", 1, 0, false);
        declareFunction("prunable_objects_wrt_conjunctive_removal", "PRUNABLE-OBJECTS-WRT-CONJUNCTIVE-REMOVAL", 1, 0, false);
        declareFunction("update_prunable_conjunctive_removal_objects", "UPDATE-PRUNABLE-CONJUNCTIVE-REMOVAL-OBJECTS", 3, 0, false);
        declareFunction("compute_conjunctive_removal_proof_tuples", "COMPUTE-CONJUNCTIVE-REMOVAL-PROOF-TUPLES", 1, 0, false);
        declareFunction("isolated_problem_subset", "ISOLATED-PROBLEM-SUBSET", 1, 0, false);
        declareFunction("problem_isolated_wrt_problemsP", "PROBLEM-ISOLATED-WRT-PROBLEMS?", 2, 0, false);
        declareFunction("finished_problem_subset", "FINISHED-PROBLEM-SUBSET", 1, 0, false);
        declareFunction("possibly_note_eager_pruning_problem", "POSSIBLY-NOTE-EAGER-PRUNING-PROBLEM", 1, 0, false);
        declareFunction("possibly_prune_processed_proofs", "POSSIBLY-PRUNE-PROCESSED-PROOFS", 1, 0, false);
        declareFunction("problem_store_all_processed_objects", "PROBLEM-STORE-ALL-PROCESSED-OBJECTS", 2, 0, false);
        declareFunction("problem_processedP", "PROBLEM-PROCESSED?", 2, 0, false);
        declareFunction("link_processedP", "LINK-PROCESSED?", 1, 0, false);
        declareFunction("possibly_prune_processed_object", "POSSIBLY-PRUNE-PROCESSED-OBJECT", 1, 0, false);
        declareFunction("problem_is_the_root_problem_of_some_inferenceP", "PROBLEM-IS-THE-ROOT-PROBLEM-OF-SOME-INFERENCE?", 1, 0, false);
        declareFunction("consider_pruning_ramifications_of_ignored_strategem", "CONSIDER-PRUNING-RAMIFICATIONS-OF-IGNORED-STRATEGEM", 2, 0, false);
        declareFunction("prunable_processed_problemP", "PRUNABLE-PROCESSED-PROBLEM?", 1, 0, false);
        declareFunction("all_dependent_proofs_have_siblingsP", "ALL-DEPENDENT-PROOFS-HAVE-SIBLINGS?", 1, 0, false);
        declareFunction("all_dependent_proofs_have_siblings_int", "ALL-DEPENDENT-PROOFS-HAVE-SIBLINGS-INT", 1, 0, false);
        declareFunction("restricted_non_focal_with_siblingP", "RESTRICTED-NON-FOCAL-WITH-SIBLING?", 2, 0, false);
        declareFunction("restricted_focal_with_siblingP", "RESTRICTED-FOCAL-WITH-SIBLING?", 2, 0, false);
        declareFunction("corresponding_restricted_non_focal_unfinishedP", "CORRESPONDING-RESTRICTED-NON-FOCAL-UNFINISHED?", 2, 0, false);
        declareFunction("prunable_processed_linkP", "PRUNABLE-PROCESSED-LINK?", 1, 0, false);
        declareFunction("problem_is_reused_interestinglyP", "PROBLEM-IS-REUSED-INTERESTINGLY?", 1, 0, false);
        declareFunction("link_has_all_the_proofsP", "LINK-HAS-ALL-THE-PROOFS?", 1, 0, false);
        declareFunction("join_ordered_link_restricted_focal_count", "JOIN-ORDERED-LINK-RESTRICTED-FOCAL-COUNT", 1, 0, false);
        declareFunction("join_ordered_link_restricted_focal_countGE", "JOIN-ORDERED-LINK-RESTRICTED-FOCAL-COUNT>=", 2, 0, false);
        declareFunction("all_problem_proofs_are_processedP", "ALL-PROBLEM-PROOFS-ARE-PROCESSED?", 1, 0, false);
        declareFunction("all_link_proofs_are_processedP", "ALL-LINK-PROOFS-ARE-PROCESSED?", 1, 0, false);
        declareFunction("problem_has_no_motivation_other_than_removalP", "PROBLEM-HAS-NO-MOTIVATION-OTHER-THAN-REMOVAL?", 1, 0, false);
        declareFunction("problem_finished_wrt_removalP", "PROBLEM-FINISHED-WRT-REMOVAL?", 2, 0, false);
        declareFunction("problem_store_removal_strategies", "PROBLEM-STORE-REMOVAL-STRATEGIES", 1, 0, false);
        declareFunction("problem_is_a_new_rootP", "PROBLEM-IS-A-NEW-ROOT?", 2, 0, false);
        declareFunction("problem_store_new_root_strategies", "PROBLEM-STORE-NEW-ROOT-STRATEGIES", 1, 0, false);
        declareFunction("note_problem_dirty", "NOTE-PROBLEM-DIRTY", 1, 0, false);
        declareFunction("problem_cleanP", "PROBLEM-CLEAN?", 1, 0, false);
        declareFunction("problem_has_any_new_root_motivationP", "PROBLEM-HAS-ANY-NEW-ROOT-MOTIVATION?", 1, 0, false);
        declareFunction("problem_has_any_transformation_motivationP", "PROBLEM-HAS-ANY-TRANSFORMATION-MOTIVATION?", 1, 0, false);
        declareFunction("problem_has_any_removal_motivationP", "PROBLEM-HAS-ANY-REMOVAL-MOTIVATION?", 1, 0, false);
        declareFunction("problem_store_possibly_redundant_proof_sets", "PROBLEM-STORE-POSSIBLY-REDUNDANT-PROOF-SETS", 1, 0, false);
        declareFunction("problem_store_all_possibly_redundant_proofs", "PROBLEM-STORE-ALL-POSSIBLY-REDUNDANT-PROOFS", 1, 0, false);
        declareFunction("problem_store_possibly_redundant_proof_count", "PROBLEM-STORE-POSSIBLY-REDUNDANT-PROOF-COUNT", 1, 0, false);
        declareFunction("possibly_prune_proof_tree", "POSSIBLY-PRUNE-PROOF-TREE", 1, 0, false);
        declareFunction("compute_root_proofs", "COMPUTE-ROOT-PROOFS", 1, 0, false);
        declareFunction("direct_dependent_proofs_including_split_restrictions", "DIRECT-DEPENDENT-PROOFS-INCLUDING-SPLIT-RESTRICTIONS", 1, 0, false);
        declareFunction("all_triggered_restricted_non_focal_links", "ALL-TRIGGERED-RESTRICTED-NON-FOCAL-LINKS", 1, 0, false);
        declareFunction("proof_prunableP", "PROOF-PRUNABLE?", 1, 0, false);
        declareFunction("prune_starting_from_root_proofs", "PRUNE-STARTING-FROM-ROOT-PROOFS", 1, 0, false);
        declareFunction("prune_entire_problem_store", "PRUNE-ENTIRE-PROBLEM-STORE", 1, 0, false);
        declareFunction("prune_problem_store_below", "PRUNE-PROBLEM-STORE-BELOW", 1, 0, false);
        declareFunction("all_problem_store_objects_below", "ALL-PROBLEM-STORE-OBJECTS-BELOW", 1, 0, false);
        declareFunction("add_all_problem_store_objects_below_recursive", "ADD-ALL-PROBLEM-STORE-OBJECTS-BELOW-RECURSIVE", 2, 0, false);
        declareFunction("prune_problem_store_objects", "PRUNE-PROBLEM-STORE-OBJECTS", 2, 0, false);
        declareFunction("prunable_problem_store_objectP", "PRUNABLE-PROBLEM-STORE-OBJECT?", 2, 0, false);
        declareFunction("prunable_problemP", "PRUNABLE-PROBLEM?", 2, 0, false);
        declareFunction("prunable_problem_linkP", "PRUNABLE-PROBLEM-LINK?", 1, 0, false);
        declareFunction("problem_not_in_progress_wrt_removalP", "PROBLEM-NOT-IN-PROGRESS-WRT-REMOVAL?", 2, 0, false);
        declareFunction("prune_problem_store_object", "PRUNE-PROBLEM-STORE-OBJECT", 1, 0, false);
        declareFunction("problem_store_compute_proof_keeping_problems", "PROBLEM-STORE-COMPUTE-PROOF-KEEPING-PROBLEMS", 1, 0, false);
        declareFunction("inference_compute_proof_keeping_problems", "INFERENCE-COMPUTE-PROOF-KEEPING-PROBLEMS", 1, 0, false);
        declareFunction("compute_proof_keeping_problems_recursive", "COMPUTE-PROOF-KEEPING-PROBLEMS-RECURSIVE", 1, 0, false);
        declareFunction("compute_proof_keeping_links_recursive", "COMPUTE-PROOF-KEEPING-LINKS-RECURSIVE", 1, 0, false);
        declareFunction("cartesian_split_linkP", "CARTESIAN-SPLIT-LINK?", 1, 0, false);
        declareFunction("choose_split_link_non_proof_keeping_problem", "CHOOSE-SPLIT-LINK-NON-PROOF-KEEPING-PROBLEM", 1, 0, false);
        declareFunction("note_and_propagate_proof_keeping_problem", "NOTE-AND-PROPAGATE-PROOF-KEEPING-PROBLEM", 2, 0, false);
        declareFunction("note_and_propagate_proof_keeping_problem_recursive", "NOTE-AND-PROPAGATE-PROOF-KEEPING-PROBLEM-RECURSIVE", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_worker_file() {
        $currently_considered_tactic$ = defparameter("*CURRENTLY-CONSIDERED-TACTIC*", NIL);
        $currently_executing_tactics$ = defparameter("*CURRENTLY-EXECUTING-TACTICS*", NIL);
        $currently_active_problem$ = defparameter("*CURRENTLY-ACTIVE-PROBLEM*", NIL);
        $currently_active_problem_store$ = defparameter("*CURRENTLY-ACTIVE-PROBLEM-STORE*", NIL);
        $asent_of_currently_executing_tactic$ = defparameter("*ASENT-OF-CURRENTLY-EXECUTING-TACTIC*", NIL);
        $mt_of_currently_executing_tactic$ = defparameter("*MT-OF-CURRENTLY-EXECUTING-TACTIC*", NIL);
        $consider_variable_count_of_focal_problems_for_tactic_literals_score_method$ = defparameter("*CONSIDER-VARIABLE-COUNT-OF-FOCAL-PROBLEMS-FOR-TACTIC-LITERALS-SCORE-METHOD*", $EXPONENTIAL);
        $eager_proof_validationP$ = defparameter("*EAGER-PROOF-VALIDATION?*", NIL);
        $proof_circularity_detection_enabledP$ = defparameter("*PROOF-CIRCULARITY-DETECTION-ENABLED?*", T);
        $circular_proof_max_depth_cutoff$ = deflexical("*CIRCULAR-PROOF-MAX-DEPTH-CUTOFF*", $int$300);
        $process_motivated_transformation_link_proofsP$ = SubLFiles.defparameter("*PROCESS-MOTIVATED-TRANSFORMATION-LINK-PROOFS?*", T);
        $find_proof_bindings_optimization_enabledP$ = SubLFiles.defparameter("*FIND-PROOF-BINDINGS-OPTIMIZATION-ENABLED?*", T);
        $proof_bubbling_depth$ = defparameter("*PROOF-BUBBLING-DEPTH*", ZERO_INTEGER);
        $max_proof_bubbling_depth$ = deflexical("*MAX-PROOF-BUBBLING-DEPTH*", $int$100);
        $within_abnormality_checkingP$ = defparameter("*WITHIN-ABNORMALITY-CHECKING?*", NIL);
        $disable_link_propagationP$ = defparameter("*DISABLE-LINK-PROPAGATION?*", NIL);
        $bubble_up_proofs_through_closed_split_linksP$ = SubLFiles.defparameter("*BUBBLE-UP-PROOFS-THROUGH-CLOSED-SPLIT-LINKS?*", T);
        $reconsidering_set_asidesP$ = defparameter("*RECONSIDERING-SET-ASIDES?*", NIL);
        $always_consider_deepP$ = defparameter("*ALWAYS-CONSIDER-DEEP?*", NIL);
        $problem_store_prune_reports$ = deflexical("*PROBLEM-STORE-PRUNE-REPORTS*", (maybeDefault($sym195$_PROBLEM_STORE_PRUNE_REPORTS_, $problem_store_prune_reports$, NIL)));
        $possibly_propagate_problem_indestructible_stack$ = SubLFiles.defparameter("*POSSIBLY-PROPAGATE-PROBLEM-INDESTRUCTIBLE-STACK*", $UNINITIALIZED);
        $processed_proofs_retain_one_proofP$ = defparameter("*PROCESSED-PROOFS-RETAIN-ONE-PROOF?*", T);
        return NIL;
    }

    public static SubLObject setup_inference_worker_file() {
        memoization_state.note_memoized_function($sym88$INTERMEDIATE_PROOF_STEP_VALID_MEMOIZED_);
        memoization_state.note_memoized_function($sym124$CACHED_INFERENCE_PROOF_NON_EXPLANATORY_SUBPROOFS);
        subl_macro_promotions.declare_defglobal($sym195$_PROBLEM_STORE_PRUNE_REPORTS_);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_worker_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_worker_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_worker_file();
    }

    static {
        me = new inference_worker();
        $currently_considered_tactic$ = null;
        $currently_executing_tactics$ = null;
        $currently_active_problem$ = null;
        $currently_active_problem_store$ = null;
        $asent_of_currently_executing_tactic$ = null;
        $mt_of_currently_executing_tactic$ = null;
        $consider_variable_count_of_focal_problems_for_tactic_literals_score_method$ = null;
        $eager_proof_validationP$ = null;
        $proof_circularity_detection_enabledP$ = null;
        $circular_proof_max_depth_cutoff$ = null;
        $process_motivated_transformation_link_proofsP$ = null;
        $find_proof_bindings_optimization_enabledP$ = null;
        $proof_bubbling_depth$ = null;
        $max_proof_bubbling_depth$ = null;
        $within_abnormality_checkingP$ = null;
        $disable_link_propagationP$ = null;
        $bubble_up_proofs_through_closed_split_linksP$ = null;
        $reconsidering_set_asidesP$ = null;
        $always_consider_deepP$ = null;
        $problem_store_prune_reports$ = null;
        $possibly_propagate_problem_indestructible_stack$ = null;
        $processed_proofs_retain_one_proofP$ = null;
        $list0 = list(makeSymbol("TACTIC"), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym1$CLET = makeSymbol("CLET");
        $sym2$_CURRENTLY_CONSIDERED_TACTIC_ = makeSymbol("*CURRENTLY-CONSIDERED-TACTIC*");
        $sym3$TACTIC_P = makeSymbol("TACTIC-P");
        $sym4$START_TIME = makeUninternedSymbol("START-TIME");
        $sym5$_CURRENTLY_EXECUTING_TACTICS_ = makeSymbol("*CURRENTLY-EXECUTING-TACTICS*");
        $sym6$CONS = makeSymbol("CONS");
        $list7 = list(makeSymbol("*CURRENTLY-EXECUTING-TACTICS*"));
        $sym8$CUNWIND_PROTECT = makeSymbol("CUNWIND-PROTECT");
        $sym9$PROGN = makeSymbol("PROGN");
        $sym10$PWHEN = makeSymbol("PWHEN");
        $list11 = list(makeSymbol("ANY-INFERENCE-GATHERS-HL-MODULE-TIMES?"));
        $sym12$CSETQ = makeSymbol("CSETQ");
        $list13 = list(list(makeSymbol("INFERENCE-TIME-SO-FAR"), list(makeSymbol("CURRENT-CONTROLLING-INFERENCE")), NIL));
        $sym14$POSSIBLY_UPDATE_HL_MODULE_TIMES = makeSymbol("POSSIBLY-UPDATE-HL-MODULE-TIMES");
        $sym15$_ = makeSymbol("-");
        $list16 = list(makeSymbol("INFERENCE-TIME-SO-FAR"), list(makeSymbol("CURRENT-CONTROLLING-INFERENCE")), NIL);
        $list17 = list(makeSymbol("PROBLEM"), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym18$_CURRENTLY_ACTIVE_PROBLEM_ = makeSymbol("*CURRENTLY-ACTIVE-PROBLEM*");
        $list19 = list(list(makeSymbol("*CURRENTLY-EXECUTING-TACTICS*"), NIL));
        $list20 = list(makeSymbol("STORE"), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym21$_NEGATION_BY_FAILURE_ = makeSymbol("*NEGATION-BY-FAILURE*");
        $sym22$PROBLEM_STORE_NEGATION_BY_FAILURE_ = makeSymbol("PROBLEM-STORE-NEGATION-BY-FAILURE?");
        $sym23$PROBLEM_P = makeSymbol("PROBLEM-P");
        $str24$_a_was_not_an__unexamined_problem = makeString("~a was not an :unexamined problem, so cannot determine its tactics");
        $str25$_a_was__unexamined_but_somehow_go = makeString("~a was :unexamined but somehow got some tactics already.");
        $TACTICAL = makeKeyword("TACTICAL");
        $SKIP = makeKeyword("SKIP");
        $POS = makeKeyword("POS");
        $NEG = makeKeyword("NEG");
        $REMOVAL_CONJUNCTIVE = makeKeyword("REMOVAL-CONJUNCTIVE");
        $COMPLETE = makeKeyword("COMPLETE");
        $list32 = list(makeSymbol("MT"), makeSymbol("ASENT"));
        $sym33$STRATEGY_P = makeSymbol("STRATEGY-P");
        $NON_DISCARDED = makeKeyword("NON-DISCARDED");
        $str35$unexpected_tactic__S = makeString("unexpected tactic ~S");
        $str36$Tried_to_recursively_execute__a = makeString("Tried to recursively execute ~a");
        $str37$Tried_to_execute_a_tactic_that_wa = makeString("Tried to execute a tactic that was not possible: ~s");
        $INFERENCE = makeKeyword("INFERENCE");
        $str39$unexpected_tactic__s = makeString("unexpected tactic ~s");
        $list40 = list(list(makeSymbol("ASENT"), makeSymbol("MT")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym41$_ASENT_OF_CURRENTLY_EXECUTING_TACTIC_ = makeSymbol("*ASENT-OF-CURRENTLY-EXECUTING-TACTIC*");
        $sym42$_MT_OF_CURRENTLY_EXECUTING_TACTIC_ = makeSymbol("*MT-OF-CURRENTLY-EXECUTING-TACTIC*");
        $str43$Got_a_literal_level_tactic__s_tha = makeString("Got a literal-level tactic ~s that was neither a transformation nor a removal nor a rewrite");
        $str44$Unexpected_multiple_clause_tactic = makeString("Unexpected multiple clause tactic module ~a");
        $str45$Unexpected_multiple_literal_tacti = makeString("Unexpected multiple literal tactic module ~a");
        $str46$Unexpected_structural_multiple_li = makeString("Unexpected structural multiple literal tactic module ~a");
        $str47$Unexpected_meta_structural_multip = makeString("Unexpected meta-structural multiple literal tactic module ~a");
        $str48$unexpected_connected_conjunction_ = makeString("unexpected connected conjunction link ~s");
        $str49$unexpected_connected_conjunction_ = makeString("unexpected connected conjunction tactic ~s");
        $EXPONENTIAL = makeKeyword("EXPONENTIAL");
        $SQUARE = makeKeyword("SQUARE");
        $DOUBLE = makeKeyword("DOUBLE");
        $str53$unexpected_disjunctive_link__s = makeString("unexpected disjunctive link ~s");
        $str54$_s_was_not_a_logical_link_with_un = makeString("~s was not a logical-link-with-unique-tactic-p");
        $SPLIT = makeKeyword("SPLIT");
        $JOIN_ORDERED = makeKeyword("JOIN-ORDERED");
        $UNION = makeKeyword("UNION");
        $JOIN = makeKeyword("JOIN");
        $str59$Unexpected_logical_tactic_module_ = makeString("Unexpected logical tactic module ~S");
        $str60$Join_tactics_like__S_do_not_have_ = makeString("Join tactics like ~S do not have a unique lookahead problem.");
        $sym61$STRUCTURAL_PROOF_P = makeSymbol("STRUCTURAL-PROOF-P");
        $str62$_a_is_not_a_CONTENT_LINK_P = makeString("~a is not a CONTENT-LINK-P");
        $sym63$CONTENT_TACTIC_P = makeSymbol("CONTENT-TACTIC-P");
        $str64$Unexpected_content_tactic__S = makeString("Unexpected content tactic ~S");
        $str65$Unexpected_removal_tactic__S = makeString("Unexpected removal tactic ~S");
        $REMOVAL = makeKeyword("REMOVAL");
        $RESTRICTION = makeKeyword("RESTRICTION");
        $sym68$CONJUNCTIVE_REMOVAL_TACTIC_P = makeSymbol("CONJUNCTIVE-REMOVAL-TACTIC-P");
        $sym69$TRANSFORMATION_TACTIC_P = makeSymbol("TRANSFORMATION-TACTIC-P");
        $TRANSFORMATION = makeKeyword("TRANSFORMATION");
        $sym71$REWRITE_TACTIC_P = makeSymbol("REWRITE-TACTIC-P");
        $REWRITE = makeKeyword("REWRITE");
        $sym73$META_REMOVAL_TACTIC_P = makeSymbol("META-REMOVAL-TACTIC-P");
        $sym74$STRATEGIC_CONTEXT_P = makeSymbol("STRATEGIC-CONTEXT-P");
        $PREFERRED = makeKeyword("PREFERRED");
        $GENERALIZED_REMOVAL = makeKeyword("GENERALIZED-REMOVAL");
        $POSSIBLE = makeKeyword("POSSIBLE");
        $DISPREFERRED = makeKeyword("DISPREFERRED");
        $GROSSLY_DISPREFERRED = makeKeyword("GROSSLY-DISPREFERRED");
        $DISALLOWED = makeKeyword("DISALLOWED");
        $DOOMED = makeKeyword("DOOMED");
        $str82$Unexpected_preference_level__s = makeString("Unexpected preference-level ~s");
        $CONNECTED_CONJUNCTION = makeKeyword("CONNECTED-CONJUNCTION");
        $STRUCTURAL = makeKeyword("STRUCTURAL");
        $LOGICAL = makeKeyword("LOGICAL");
        $IMPOSSIBLE = makeKeyword("IMPOSSIBLE");
        $STRUCTURAL_CONJUNCTIVE = makeKeyword("STRUCTURAL-CONJUNCTIVE");
        $sym88$INTERMEDIATE_PROOF_STEP_VALID_MEMOIZED_ = makeSymbol("INTERMEDIATE-PROOF-STEP-VALID-MEMOIZED?");
        $NONE = makeKeyword("NONE");
        $MINIMAL = makeKeyword("MINIMAL");
        $ALL = makeKeyword("ALL");
        $ARG_TYPE = makeKeyword("ARG-TYPE");
        $str93$Unexpected_intermediate_step_vali = makeString("Unexpected intermediate step validation level ~s");
        $list94 = list(makeSymbol("PROVEN-MT"), makeSymbol("PROVEN-ASENT"));
        $str95$Didn_t_expect_to_bubble_up_a_proo = makeString("Didn't expect to bubble up a proof to the answer link ~s");
        $str96$Unexpected_link_type_for_link__a = makeString("Unexpected link type for link ~a");
        $sym97$PROOF_REJECTED_ = makeSymbol("PROOF-REJECTED?");
        $str98$propose_new_proof_with_bindings__ = makeString("propose-new-proof-with-bindings: called with rejected subproof ~S for proof ~S");
        $REJECTED_SUBPROOF = makeKeyword("REJECTED-SUBPROOF");
        $sym100$PROOF_P = makeSymbol("PROOF-P");
        $int$300 = makeInteger(300);
        $CIRCULAR = makeKeyword("CIRCULAR");
        $ILL_FORMED = makeKeyword("ILL-FORMED");
        $NON_ABDUCIBLE_RULE = makeKeyword("NON-ABDUCIBLE-RULE");
        $MODUS_TOLLENS_WITH_NON_WFF = makeKeyword("MODUS-TOLLENS-WITH-NON-WFF");
        $PROVEN = makeKeyword("PROVEN");
        $list107 = list(makeSymbol("RT-C-FIRST-SUBPROOF"), makeSymbol("RT-C-SECOND-SUBPROOF"));
        $sym108$PROBLEM_LINK_TO_GOAL_P = makeSymbol("PROBLEM-LINK-TO-GOAL-P");
        $str109$expected_a_variable_map_to_be_nul = makeString("expected a variable map to be null because the sub-bindings were null");
        $sym110$VARIABLE__ = makeSymbol("VARIABLE-<");
        $sym111$VARIABLE_BINDING_VARIABLE = makeSymbol("VARIABLE-BINDING-VARIABLE");
        $list112 = cons(makeSymbol("BINDING-VARIABLE"), makeSymbol("BINDING-VALUE"));
        $str113$Found_a_triplicate_binding_for__s = makeString("Found a triplicate binding for ~s in ~s and expected only a duplicate");
        $str114$Could_not_find_two_values_in__s_w = makeString("Could not find two values in ~s with variable ~s");
        $sym115$BINDINGS_P = makeSymbol("BINDINGS-P");
        $int$100 = makeInteger(100);
        $MAX_PROOF_BUBBLING_DEPTH = makeKeyword("MAX-PROOF-BUBBLING-DEPTH");
        $ANSWER = makeKeyword("ANSWER");
        $sym119$VARIABLE_MAP_P = makeSymbol("VARIABLE-MAP-P");
        $RESIDUAL_TRANSFORMATION = makeKeyword("RESIDUAL-TRANSFORMATION");
        $DISJUNCTIVE_ASSUMPTION = makeKeyword("DISJUNCTIVE-ASSUMPTION");
        $str122$can_t_handle_bubbling_up_proofs_p = makeString("can't handle bubbling up proofs past disjunctive assumption links yet");
        $EXCEPTED_ASSERTION = makeKeyword("EXCEPTED-ASSERTION");
        $sym124$CACHED_INFERENCE_PROOF_NON_EXPLANATORY_SUBPROOFS = makeSymbol("CACHED-INFERENCE-PROOF-NON-EXPLANATORY-SUBPROOFS");
        $sym125$GENERALIZED_TRANSFORMATION_PROOF_P = makeSymbol("GENERALIZED-TRANSFORMATION-PROOF-P");
        $str126$generalized_transformation_proof_ = makeString("generalized transformation proof of unexpected type: ~s");
        $str127$Invalid_sense__s = makeString("Invalid sense ~s");
        $UNEXAMINED = makeKeyword("UNEXAMINED");
        $str129$Tried_to_make__a_pending_but_it_s = makeString("Tried to make ~a pending but it still had possible tactics");
        $INTUITIVE = makeKeyword("INTUITIVE");
        $UNDETERMINED = makeKeyword("UNDETERMINED");
        $sym132$UNION_LINK_P = makeSymbol("UNION-LINK-P");
        $str133$Uninteresting_problem_status_chan = makeString("Uninteresting problem status change for ~a: ~a -> ~a");
        $SUBSTRATEGY_PROBLEM_STATUS_CHANGE = makeKeyword("SUBSTRATEGY-PROBLEM-STATUS-CHANGE");
        $str135$possible_problem_with_no_tactics_ = makeString("possible problem with no tactics: ~a");
        $NEW = makeKeyword("NEW");
        $UNEXAMINED_GOOD = makeKeyword("UNEXAMINED-GOOD");
        $UNEXAMINED_NO_GOOD = makeKeyword("UNEXAMINED-NO-GOOD");
        $EXAMINED = makeKeyword("EXAMINED");
        $EXAMINED_GOOD = makeKeyword("EXAMINED-GOOD");
        $EXAMINED_NO_GOOD = makeKeyword("EXAMINED-NO-GOOD");
        $PENDING = makeKeyword("PENDING");
        $POSSIBLE_GOOD = makeKeyword("POSSIBLE-GOOD");
        $PENDING_GOOD = makeKeyword("PENDING-GOOD");
        $PENDING_NO_GOOD = makeKeyword("PENDING-NO-GOOD");
        $FINISHED = makeKeyword("FINISHED");
        $FINISHED_GOOD = makeKeyword("FINISHED-GOOD");
        $FINISHED_NO_GOOD = makeKeyword("FINISHED-NO-GOOD");
        $str149$Problem__a_attempted_to_change_st = makeString("Problem ~a attempted to change status from ~s to ~s, which is prohibited.");
        $str150$new_problem_cannot_become_good_ye = makeString("new problem cannot become good yet");
        $str151$unknown_problem_status__a = makeString("unknown problem status ~a");
        $str152$problem_status__a_cannot_become_u = makeString("problem status ~a cannot become unexamined");
        $str153$problem_of_status__a_cannot_be_ex = makeString("problem of status ~a cannot be examined");
        $POSSIBLE_NO_GOOD = makeKeyword("POSSIBLE-NO-GOOD");
        $str155$problem_of_status__a_cannot_be_ma = makeString("problem of status ~a cannot be made possible");
        $str156$problem_of_status__a_cannot_be_pe = makeString("problem of status ~a cannot be pending");
        $str157$problem_of_status__a_cannot_be_fi = makeString("problem of status ~a cannot be finished");
        $str158$unexpected_link_type__S = makeString("unexpected link type ~S");
        $PROBLEM_NO_GOOD = makeKeyword("PROBLEM-NO-GOOD");
        $CONJUNCTIVE = makeKeyword("CONJUNCTIVE");
        $CONTENT = makeKeyword("CONTENT");
        $str162$Unexpected_status__s = makeString("Unexpected status ~s");
        $FINISHED_CLOSED_SINGLE_LITERAL_OR_FINISHED_MULTI_LITERAL = makeKeyword("FINISHED-CLOSED-SINGLE-LITERAL-OR-FINISHED-MULTI-LITERAL");
        $PENDING_COMPLETE = makeKeyword("PENDING-COMPLETE");
        $PENDING_PREFERRED = makeKeyword("PENDING-PREFERRED");
        $NO_GOOD_SPLIT_LINK = makeKeyword("NO-GOOD-SPLIT-LINK");
        $NO_GOOD_PREFERRED_JO_LINK = makeKeyword("NO-GOOD-PREFERRED-JO-LINK");
        $NO_GOOD_JOIN_LINK = makeKeyword("NO-GOOD-JOIN-LINK");
        $NO_GOOD_UNION_LINKS = makeKeyword("NO-GOOD-UNION-LINKS");
        $str170$Can_t_bind_ = makeString("Can't bind ");
        $sym171$VARIABLE_P = makeSymbol("VARIABLE-P");
        $str172$__previously_was_ = makeString(" (previously was ");
        $str173$_due_to_ = makeString(" due to ");
        $str174$_ = makeString(")");
        $SIMPLIFICATION = makeKeyword("SIMPLIFICATION");
        $list176 = list(makeKeyword("SPLIT"), makeKeyword("JOIN-ORDERED"));
        $ANYTHING = makeKeyword("ANYTHING");
        $list178 = list(list(makeSymbol("TYPED-PROOF-SPEC"), makeSymbol("PROOF-SPEC"), makeSymbol("PROOF-SPEC-TYPE-P")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym179$FILTER_PROOF_SPECS_OF_TYPE = makeSymbol("FILTER-PROOF-SPECS-OF-TYPE");
        $sym180$PUNLESS = makeSymbol("PUNLESS");
        $sym181$NULL = makeSymbol("NULL");
        $sym182$JOIN_ORDERED_PROOF_SPEC_P = makeSymbol("JOIN-ORDERED-PROOF-SPEC-P");
        $sym183$RESIDUAL_TRANSFORMATION_PROOF_SPEC_P = makeSymbol("RESIDUAL-TRANSFORMATION-PROOF-SPEC-P");
        $sym184$RESTRICTION_PROOF_SPEC_P = makeSymbol("RESTRICTION-PROOF-SPEC-P");
        $sym185$SPLIT_PROOF_SPEC_P = makeSymbol("SPLIT-PROOF-SPEC-P");
        $sym186$JOIN_PROOF_SPEC_P = makeSymbol("JOIN-PROOF-SPEC-P");
        $sym187$CONJUNCTIVE_REMOVAL_PROOF_SPEC_P = makeSymbol("CONJUNCTIVE-REMOVAL-PROOF-SPEC-P");
        $sym188$TRANSFORMATION_PROOF_SPEC_P = makeSymbol("TRANSFORMATION-PROOF-SPEC-P");
        $sym189$UNION_PROOF_SPEC_P = makeSymbol("UNION-PROOF-SPEC-P");
        $str190$Time_to_handle__S_propagation = makeString("Time to handle ~S propagation");
        $list191 = list(makeSymbol("JOIN-PART"), makeSymbol("&REST"), makeSymbol("JOINED-PARTS"));
        $str192$Propagating_bogus_proof_spec__A_d = makeString("Propagating bogus proof spec ~A down join link ~A.");
        $EQUAL = makeKeyword("EQUAL");
        $CZER_EQUAL = makeKeyword("CZER-EQUAL");
        $sym195$_PROBLEM_STORE_PRUNE_REPORTS_ = makeSymbol("*PROBLEM-STORE-PRUNE-REPORTS*");
        $str196$__pruned__a_problems____a_____a__ = makeString("~&pruned ~a problems: (~a -> ~a), ~a tactics: (~a -> ~a)~%");
        $sym197$_ = makeSymbol(">");
        $sym198$PROBLEM_MIN_DEPTH = makeSymbol("PROBLEM-MIN-DEPTH");
        $UNINITIALIZED = makeKeyword("UNINITIALIZED");
        $str200$destroying_in_progress_tactic__a = makeString("destroying in-progress tactic ~a");
        $list201 = list(makeSymbol("CONJUNCTIVE-REMOVAL-PROOF"), makeSymbol("&REST"), makeSymbol("JOIN-ORDERED-PROOFS"));
        $list202 = list(makeSymbol("FOCAL-PROOF"), makeSymbol("NON-FOCAL-PROOF"));
        $sym203$_ = makeSymbol("<");
        $sym204$PROBLEM_LINK_SUID = makeSymbol("PROBLEM-LINK-SUID");
        $sym205$PROBLEM_SUID = makeSymbol("PROBLEM-SUID");
        $sym206$CONJUNCTIVE_REMOVAL_PROOF_P = makeSymbol("CONJUNCTIVE-REMOVAL-PROOF-P");
        $sym207$PROOF_SUID = makeSymbol("PROOF-SUID");
        $sym208$PROBLEM_HAS_AN_IN_PROGRESS_TACTIC_ = makeSymbol("PROBLEM-HAS-AN-IN-PROGRESS-TACTIC?");
        $sym209$SPLIT_LINK_P = makeSymbol("SPLIT-LINK-P");
        $list210 = list(makeUninternedSymbol("START"), makeUninternedSymbol("END"), makeUninternedSymbol("DELTA"));
        $DO_HASH_TABLE = makeKeyword("DO-HASH-TABLE");
        $sym212$PROBLEM_STORE_P = makeSymbol("PROBLEM-STORE-P");
        $sym213$SET_SIZE = makeSymbol("SET-SIZE");
        $sym214$PROOF_PRUNABLE_ = makeSymbol("PROOF-PRUNABLE?");
        $str215$_a_was_not_a_problem_p_or_problem = makeString("~a was not a problem-p or problem-link-p");
        $str216$__prunables___s__ = makeString("~%prunables: ~s~%");
        $str217$Unexpected_problem_store_object__ = makeString("Unexpected problem store object ~s");
        $list218 = list(makeKeyword("UNEXAMINED"), makeKeyword("EXAMINED"), makeKeyword("FINISHED"));
        $sym219$TACTICALLY_FINISHED_PROBLEM_P = makeSymbol("TACTICALLY-FINISHED-PROBLEM-P");
    }


}
/*
 *
 * Total time: 2318 ms
 *
 */