package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$within_assert$;
import static com.cyc.cycjava.cycl.utilities_macros.mapping_finished;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.consp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.sbhl.sbhl_marking_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class at_admitted extends SubLTranslatedFile {
    public static final SubLFile me = new at_admitted();

    public static final String myName = "com.cyc.cycjava.cycl.at_admitted";

    public static final String myFingerPrint = "cad332996ea618666a2f5f5a281a8647c080c979d94c8daa8963b924a099924e";

    // defparameter
    private static final SubLSymbol $at_candidate_relations_table$ = makeSymbol("*AT-CANDIDATE-RELATIONS-TABLE*");

    // defparameter
    private static final SubLSymbol $at_candidate_relations_argnums_table$ = makeSymbol("*AT-CANDIDATE-RELATIONS-ARGNUMS-TABLE*");

    // defparameter
    private static final SubLSymbol $at_candidate_relations_sbhl_space$ = makeSymbol("*AT-CANDIDATE-RELATIONS-SBHL-SPACE*");

    // defparameter
    private static final SubLSymbol $at_cr_mapping_result$ = makeSymbol("*AT-CR-MAPPING-RESULT*");

    // defparameter
    private static final SubLSymbol $at_cr_arg_isa_pred$ = makeSymbol("*AT-CR-ARG-ISA-PRED*");

    // defparameter
    private static final SubLSymbol $at_cr_argnum$ = makeSymbol("*AT-CR-ARGNUM*");

    // deflexical
    // estimated max number of candidate relations
    private static final SubLSymbol $at_candidate_relations_max$ = makeSymbol("*AT-CANDIDATE-RELATIONS-MAX*");

    // defparameter
    // hashtable mapping relations -> boolean
    private static final SubLSymbol $ira_table$ = makeSymbol("*IRA-TABLE*");

    // defparameter
    // an integer
    private static final SubLSymbol $ira_argnum$ = makeSymbol("*IRA-ARGNUM*");

    // defparameter
    // estimated number of applicable relations
    private static final SubLSymbol $ira_relations_estimate$ = makeSymbol("*IRA-RELATIONS-ESTIMATE*");

    // defparameter
    private static final SubLSymbol $ira_isa_sbhl_space$ = makeSymbol("*IRA-ISA-SBHL-SPACE*");

    // defparameter
    // one of #$arg1Isa, #$arg2Isa, etc.
    private static final SubLSymbol $ira_arg_isa_pred$ = makeSymbol("*IRA-ARG-ISA-PRED*");

    // defparameter
    private static final SubLSymbol $ira_genl_sbhl_space$ = makeSymbol("*IRA-GENL-SBHL-SPACE*");

    // defparameter
    // one of #$arg1Genl, #$arg2Genl, etc.
    private static final SubLSymbol $ira_arg_genl_pred$ = makeSymbol("*IRA-ARG-GENL-PRED*");

    // defparameter
    private static final SubLSymbol $ira_mapping_result$ = makeSymbol("*IRA-MAPPING-RESULT*");

    // Internal Constants
    public static final SubLSymbol $sym0$ADMITTED_ARGUMENT_ = makeSymbol("ADMITTED-ARGUMENT?");











    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLObject $$Thing = reader_make_constant_shell(makeString("Thing"));







    private static final SubLSymbol AT_CR_HASH_RELATIONS = makeSymbol("AT-CR-HASH-RELATIONS");

    private static final SubLSymbol AT_CR_HASH_RELATIONS_BY_ARGNUM = makeSymbol("AT-CR-HASH-RELATIONS-BY-ARGNUM");

    private static final SubLString $str13$no_mapping_method_defiend_for_sbh = makeString("no mapping method defiend for sbhl-table ~s");





    private static final SubLObject $$argsIsa = reader_make_constant_shell(makeString("argsIsa"));

    private static final SubLObject $$argIsa = reader_make_constant_shell(makeString("argIsa"));

    private static final SubLSymbol $sym18$AT_CR_ARGISA_COL_SEARCHED_ = makeSymbol("AT-CR-ARGISA-COL-SEARCHED?");

    private static final SubLSymbol $sym19$NAUT_ = makeSymbol("NAUT?");

    private static final SubLSymbol $sym20$IRA_ARGISA_COL_SEARCHED_ = makeSymbol("IRA-ARGISA-COL-SEARCHED?");

    private static final SubLObject $$argsGenl = reader_make_constant_shell(makeString("argsGenl"));

    private static final SubLSymbol $sym22$IRA_ARGGENL_COL_SEARCHED_ = makeSymbol("IRA-ARGGENL-COL-SEARCHED?");

    public static SubLObject admitted_argumentP_internal(final SubLObject v_term, final SubLObject argnum, final SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != integerp(argnum) : "Types.integerp(argnum) " + "CommonSymbols.NIL != Types.integerp(argnum) " + argnum;
        if (NIL != cycl_variables.cyc_varP(relation)) {
            return T;
        }
        SubLObject admittedP = NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = at_vars.$at_reln$.currentBinding(thread);
        final SubLObject _prev_bind_7 = at_vars.$at_arg$.currentBinding(thread);
        final SubLObject _prev_bind_8 = at_vars.$at_argnum$.currentBinding(thread);
        final SubLObject _prev_bind_9 = at_vars.$at_check_inter_arg_isaP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = at_vars.$at_check_inter_arg_formatP$.currentBinding(thread);
        final SubLObject _prev_bind_11 = at_vars.$gather_at_constraintsP$.currentBinding(thread);
        final SubLObject _prev_bind_12 = czer_vars.$accumulating_semantic_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_13 = czer_vars.$within_negationP$.currentBinding(thread);
        final SubLObject _prev_bind_14 = at_vars.$within_functionP$.currentBinding(thread);
        final SubLObject _prev_bind_15 = at_vars.$within_predicateP$.currentBinding(thread);
        final SubLObject _prev_bind_16 = czer_vars.$distributing_meta_knowledgeP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind(NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
            wff_vars.$provide_wff_suggestionsP$.bind(NIL, thread);
            at_vars.$at_reln$.bind(relation, thread);
            at_vars.$at_arg$.bind(v_term, thread);
            at_vars.$at_argnum$.bind(argnum, thread);
            at_vars.$at_check_inter_arg_isaP$.bind(NIL, thread);
            at_vars.$at_check_inter_arg_formatP$.bind(NIL, thread);
            at_vars.$gather_at_constraintsP$.bind(NIL, thread);
            czer_vars.$accumulating_semantic_violationsP$.bind(NIL, thread);
            czer_vars.$within_negationP$.bind(arg_type.at_within_negationP(at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread)), thread);
            at_vars.$within_functionP$.bind(makeBoolean((NIL != $within_assert$.getDynamicValue(thread)) && (NIL != arg_type.at_within_functionP(at_vars.$at_reln$.getDynamicValue(thread)))), thread);
            at_vars.$within_predicateP$.bind(makeBoolean((NIL != $within_assert$.getDynamicValue(thread)) && (NIL != arg_type.at_within_predicateP(at_vars.$at_reln$.getDynamicValue(thread)))), thread);
            czer_vars.$distributing_meta_knowledgeP$.bind(czer_utilities.distributing_meta_predP(at_vars.$at_reln$.getDynamicValue(thread)), thread);
            admittedP = admitted_argument_intP(v_term, argnum, relation, mt);
        } finally {
            czer_vars.$distributing_meta_knowledgeP$.rebind(_prev_bind_16, thread);
            at_vars.$within_predicateP$.rebind(_prev_bind_15, thread);
            at_vars.$within_functionP$.rebind(_prev_bind_14, thread);
            czer_vars.$within_negationP$.rebind(_prev_bind_13, thread);
            czer_vars.$accumulating_semantic_violationsP$.rebind(_prev_bind_12, thread);
            at_vars.$gather_at_constraintsP$.rebind(_prev_bind_11, thread);
            at_vars.$at_check_inter_arg_formatP$.rebind(_prev_bind_10, thread);
            at_vars.$at_check_inter_arg_isaP$.rebind(_prev_bind_9, thread);
            at_vars.$at_argnum$.rebind(_prev_bind_8, thread);
            at_vars.$at_arg$.rebind(_prev_bind_7, thread);
            at_vars.$at_reln$.rebind(_prev_bind_6, thread);
            wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_5, thread);
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return admittedP;
    }

    public static SubLObject admitted_argumentP(final SubLObject v_term, final SubLObject argnum, final SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return admitted_argumentP_internal(v_term, argnum, relation, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym0$ADMITTED_ARGUMENT_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym0$ADMITTED_ARGUMENT_, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym0$ADMITTED_ARGUMENT_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(v_term, argnum, relation, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (argnum.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (relation.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(admitted_argumentP_internal(v_term, argnum, relation, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, argnum, relation, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject admitted_argument_intP(final SubLObject v_term, final SubLObject argnum, final SubLObject relation, final SubLObject mt) {
        return makeBoolean((((NIL != kb_accessors.relationP(relation)) && (NIL != arity.valid_relation_argnumP(relation, argnum))) && (argnum.numG(ZERO_INTEGER) || (argnum.numE(ZERO_INTEGER) && (NIL != kb_utilities.kbeq(v_term, relation))))) && (NIL != arg_type.relation_arg_okP(relation, v_term, argnum, mt)));
    }

    public static SubLObject why_not_admitted_argument(final SubLObject v_term, final SubLObject argnum, final SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != integerp(argnum) : "Types.integerp(argnum) " + "CommonSymbols.NIL != Types.integerp(argnum) " + argnum;
        if (NIL != cycl_variables.cyc_varP(relation)) {
            return T;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = at_vars.$at_reln$.currentBinding(thread);
        final SubLObject _prev_bind_6 = at_vars.$at_arg$.currentBinding(thread);
        final SubLObject _prev_bind_7 = at_vars.$at_argnum$.currentBinding(thread);
        final SubLObject _prev_bind_8 = at_vars.$at_check_inter_arg_isaP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = at_vars.$at_check_inter_arg_formatP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = at_vars.$gather_at_constraintsP$.currentBinding(thread);
        final SubLObject _prev_bind_11 = czer_vars.$accumulating_semantic_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_12 = czer_vars.$within_negationP$.currentBinding(thread);
        final SubLObject _prev_bind_13 = at_vars.$within_functionP$.currentBinding(thread);
        final SubLObject _prev_bind_14 = at_vars.$within_predicateP$.currentBinding(thread);
        final SubLObject _prev_bind_15 = czer_vars.$distributing_meta_knowledgeP$.currentBinding(thread);
        final SubLObject _prev_bind_16 = at_vars.$at_violations$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind(T, thread);
            at_vars.$accumulating_at_violationsP$.bind(T, thread);
            wff_vars.$noting_wff_violationsP$.bind(T, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(T, thread);
            at_vars.$at_reln$.bind(relation, thread);
            at_vars.$at_arg$.bind(v_term, thread);
            at_vars.$at_argnum$.bind(argnum, thread);
            at_vars.$at_check_inter_arg_isaP$.bind(NIL, thread);
            at_vars.$at_check_inter_arg_formatP$.bind(NIL, thread);
            at_vars.$gather_at_constraintsP$.bind(NIL, thread);
            czer_vars.$accumulating_semantic_violationsP$.bind(T, thread);
            czer_vars.$within_negationP$.bind(arg_type.at_within_negationP(at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread)), thread);
            at_vars.$within_functionP$.bind(makeBoolean((NIL != $within_assert$.getDynamicValue(thread)) && (NIL != arg_type.at_within_functionP(at_vars.$at_reln$.getDynamicValue(thread)))), thread);
            at_vars.$within_predicateP$.bind(makeBoolean((NIL != $within_assert$.getDynamicValue(thread)) && (NIL != arg_type.at_within_predicateP(at_vars.$at_reln$.getDynamicValue(thread)))), thread);
            czer_vars.$distributing_meta_knowledgeP$.bind(czer_utilities.distributing_meta_predP(at_vars.$at_reln$.getDynamicValue(thread)), thread);
            at_vars.$at_violations$.bind(NIL, thread);
            admitted_argument_intP(v_term, argnum, relation, mt);
            result = at_vars.$at_violations$.getDynamicValue(thread);
        } finally {
            at_vars.$at_violations$.rebind(_prev_bind_16, thread);
            czer_vars.$distributing_meta_knowledgeP$.rebind(_prev_bind_15, thread);
            at_vars.$within_predicateP$.rebind(_prev_bind_14, thread);
            at_vars.$within_functionP$.rebind(_prev_bind_13, thread);
            czer_vars.$within_negationP$.rebind(_prev_bind_12, thread);
            czer_vars.$accumulating_semantic_violationsP$.rebind(_prev_bind_11, thread);
            at_vars.$gather_at_constraintsP$.rebind(_prev_bind_10, thread);
            at_vars.$at_check_inter_arg_formatP$.rebind(_prev_bind_9, thread);
            at_vars.$at_check_inter_arg_isaP$.rebind(_prev_bind_8, thread);
            at_vars.$at_argnum$.rebind(_prev_bind_7, thread);
            at_vars.$at_arg$.rebind(_prev_bind_6, thread);
            at_vars.$at_reln$.rebind(_prev_bind_5, thread);
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject explanation_of_why_not_admitted_argument(final SubLObject v_term, final SubLObject argnum, final SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLObject violations = why_not_admitted_argument(v_term, argnum, relation, mt);
        SubLObject v_answer = NIL;
        SubLObject cdolist_list_var = violations;
        SubLObject why_not = NIL;
        why_not = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            v_answer = cons(wff.explain_wff_violation(why_not, UNPROVIDED), v_answer);
            cdolist_list_var = cdolist_list_var.rest();
            why_not = cdolist_list_var.first();
        } 
        return string_utilities.strcat(v_answer);
    }

    public static SubLObject admitted_formulaP(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject admittedP = NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = at_vars.$gather_at_constraintsP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = czer_vars.$accumulating_semantic_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = wff_utilities.$check_wff_constantsP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = $within_assert$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind(NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
            wff_vars.$provide_wff_suggestionsP$.bind(NIL, thread);
            at_vars.$gather_at_constraintsP$.bind(NIL, thread);
            czer_vars.$accumulating_semantic_violationsP$.bind(NIL, thread);
            wff_utilities.$check_wff_constantsP$.bind(NIL, thread);
            wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
            $within_assert$.bind(NIL, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                admittedP = wff.el_wfeP(formula, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$1, thread);
            }
        } finally {
            $within_assert$.rebind(_prev_bind_10, thread);
            wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_9, thread);
            wff_utilities.$check_wff_constantsP$.rebind(_prev_bind_8, thread);
            czer_vars.$accumulating_semantic_violationsP$.rebind(_prev_bind_7, thread);
            at_vars.$gather_at_constraintsP$.rebind(_prev_bind_6, thread);
            wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_5, thread);
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return admittedP;
    }

    public static SubLObject admitted_sentenceP(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject admittedP = NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = at_vars.$gather_at_constraintsP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = czer_vars.$accumulating_semantic_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = wff_utilities.$check_wff_constantsP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = $within_assert$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind(NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
            wff_vars.$provide_wff_suggestionsP$.bind(NIL, thread);
            at_vars.$gather_at_constraintsP$.bind(NIL, thread);
            czer_vars.$accumulating_semantic_violationsP$.bind(NIL, thread);
            wff_utilities.$check_wff_constantsP$.bind(NIL, thread);
            wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
            $within_assert$.bind(NIL, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$4 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                admittedP = wff.el_wffP(formula, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$4, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$3, thread);
            }
        } finally {
            $within_assert$.rebind(_prev_bind_10, thread);
            wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_9, thread);
            wff_utilities.$check_wff_constantsP$.rebind(_prev_bind_8, thread);
            czer_vars.$accumulating_semantic_violationsP$.rebind(_prev_bind_7, thread);
            at_vars.$gather_at_constraintsP$.rebind(_prev_bind_6, thread);
            wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_5, thread);
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return admittedP;
    }

    public static SubLObject admitted_sentence_wrt_asent_arg_constraintsP(final SubLObject sentence) {
        if (NIL != cycl_grammar.cycl_atomic_sentence_p(sentence)) {
            return admitted_atomic_sentence_wrt_arg_constraintsP(sentence);
        }
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, $IGNORE);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == admitted_sentence_wrt_asent_arg_constraintsP(arg)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject admitted_atomic_sentence_wrt_arg_constraintsP(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject okP = T;
        final SubLObject predicate = cycl_utilities.reify_when_closed_naut(cycl_utilities.atomic_sentence_predicate(asent));
        if (NIL == cycl_variables.cyc_varP(predicate)) {
            final SubLObject _prev_bind_0 = at_vars.$at_formula$.currentBinding(thread);
            final SubLObject _prev_bind_2 = wff_vars.$within_wffP$.currentBinding(thread);
            try {
                at_vars.$at_formula$.bind(asent, thread);
                wff_vars.$within_wffP$.bind(T, thread);
                SubLObject argnum = ZERO_INTEGER;
                SubLObject cdolist_list_var;
                final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(asent, $IGNORE);
                SubLObject arg = NIL;
                arg = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    argnum = add(argnum, ONE_INTEGER);
                    okP = makeBoolean((NIL != okP) && (NIL != admitted_argumentP(arg, argnum, predicate, UNPROVIDED)));
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                } 
            } finally {
                wff_vars.$within_wffP$.rebind(_prev_bind_2, thread);
                at_vars.$at_formula$.rebind(_prev_bind_0, thread);
            }
        }
        return okP;
    }

    public static SubLObject why_not_admitted_atomic_sentence_wrt_arg_constraints(final SubLObject asent, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.reify_when_closed_naut(cycl_utilities.atomic_sentence_predicate(asent));
        SubLObject result = NIL;
        if (NIL == cycl_variables.cyc_varP(predicate)) {
            final SubLObject _prev_bind_0 = at_vars.$at_formula$.currentBinding(thread);
            final SubLObject _prev_bind_2 = wff_vars.$within_wffP$.currentBinding(thread);
            try {
                at_vars.$at_formula$.bind(asent, thread);
                wff_vars.$within_wffP$.bind(T, thread);
                SubLObject argnum = ZERO_INTEGER;
                SubLObject cdolist_list_var;
                final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(asent, $IGNORE);
                SubLObject arg = NIL;
                arg = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    argnum = add(argnum, ONE_INTEGER);
                    SubLObject cdolist_list_var_$5 = why_not_admitted_argument(arg, argnum, predicate, mt);
                    SubLObject reason = NIL;
                    reason = cdolist_list_var_$5.first();
                    while (NIL != cdolist_list_var_$5) {
                        result = cons(reason, result);
                        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                        reason = cdolist_list_var_$5.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                } 
            } finally {
                wff_vars.$within_wffP$.rebind(_prev_bind_2, thread);
                at_vars.$at_formula$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    public static SubLObject why_not_admitted_sentence_wrt_asent_arg_constraints(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject why_not_wff_reasons = NIL;
        if (NIL != cycl_grammar.cycl_atomic_sentence_p(sentence)) {
            return why_not_admitted_atomic_sentence_wrt_arg_constraints(sentence, mt);
        }
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, $IGNORE);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$6 = why_not_admitted_atomic_sentence_wrt_arg_constraints(arg, mt);
            SubLObject why_not_wff_reason = NIL;
            why_not_wff_reason = cdolist_list_var_$6.first();
            while (NIL != cdolist_list_var_$6) {
                why_not_wff_reasons = cons(why_not_wff_reason, why_not_wff_reasons);
                cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                why_not_wff_reason = cdolist_list_var_$6.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return why_not_wff_reasons;
    }

    public static SubLObject explanation_of_why_not_admitted_sentence_wrt_asent_arg_constraints(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject why_not_wff_reasons = why_not_admitted_sentence_wrt_asent_arg_constraints(sentence, mt);
        SubLObject v_answer = NIL;
        SubLObject cdolist_list_var = why_not_wff_reasons;
        SubLObject why_not = NIL;
        why_not = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            v_answer = cons(wff.explain_wff_violation(why_not, UNPROVIDED), v_answer);
            cdolist_list_var = cdolist_list_var.rest();
            why_not = cdolist_list_var.first();
        } 
        return string_utilities.strcat(v_answer);
    }

    public static SubLObject admitted_argument_plus_inter_arg_isaP(final SubLObject v_term, final SubLObject argnum, final SubLObject relation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != integerp(argnum) : "Types.integerp(argnum) " + "CommonSymbols.NIL != Types.integerp(argnum) " + argnum;
        if (NIL != cycl_variables.cyc_varP(relation)) {
            return T;
        }
        SubLObject admittedP = NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = at_vars.$at_reln$.currentBinding(thread);
        final SubLObject _prev_bind_7 = at_vars.$at_arg$.currentBinding(thread);
        final SubLObject _prev_bind_8 = at_vars.$at_argnum$.currentBinding(thread);
        final SubLObject _prev_bind_9 = at_vars.$at_check_inter_arg_isaP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = at_vars.$at_check_non_constant_inter_arg_isaP$.currentBinding(thread);
        final SubLObject _prev_bind_11 = at_vars.$at_check_inter_arg_differentP$.currentBinding(thread);
        final SubLObject _prev_bind_12 = at_vars.$at_check_inter_arg_formatP$.currentBinding(thread);
        final SubLObject _prev_bind_13 = at_vars.$gather_at_constraintsP$.currentBinding(thread);
        final SubLObject _prev_bind_14 = czer_vars.$accumulating_semantic_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_15 = czer_vars.$within_negationP$.currentBinding(thread);
        final SubLObject _prev_bind_16 = at_vars.$within_functionP$.currentBinding(thread);
        final SubLObject _prev_bind_17 = at_vars.$within_predicateP$.currentBinding(thread);
        final SubLObject _prev_bind_18 = czer_vars.$distributing_meta_knowledgeP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind(NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
            wff_vars.$provide_wff_suggestionsP$.bind(NIL, thread);
            at_vars.$at_reln$.bind(relation, thread);
            at_vars.$at_arg$.bind(v_term, thread);
            at_vars.$at_argnum$.bind(argnum, thread);
            at_vars.$at_check_inter_arg_isaP$.bind(T, thread);
            at_vars.$at_check_non_constant_inter_arg_isaP$.bind(NIL, thread);
            at_vars.$at_check_inter_arg_differentP$.bind(T, thread);
            at_vars.$at_check_inter_arg_formatP$.bind(T, thread);
            at_vars.$gather_at_constraintsP$.bind(NIL, thread);
            czer_vars.$accumulating_semantic_violationsP$.bind(NIL, thread);
            czer_vars.$within_negationP$.bind(arg_type.at_within_negationP(at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread)), thread);
            at_vars.$within_functionP$.bind(makeBoolean((NIL != $within_assert$.getDynamicValue(thread)) && (NIL != arg_type.at_within_functionP(at_vars.$at_reln$.getDynamicValue(thread)))), thread);
            at_vars.$within_predicateP$.bind(makeBoolean((NIL != $within_assert$.getDynamicValue(thread)) && (NIL != arg_type.at_within_predicateP(at_vars.$at_reln$.getDynamicValue(thread)))), thread);
            czer_vars.$distributing_meta_knowledgeP$.bind(czer_utilities.distributing_meta_predP(at_vars.$at_reln$.getDynamicValue(thread)), thread);
            admittedP = admitted_argument_intP(v_term, argnum, relation, NIL);
        } finally {
            czer_vars.$distributing_meta_knowledgeP$.rebind(_prev_bind_18, thread);
            at_vars.$within_predicateP$.rebind(_prev_bind_17, thread);
            at_vars.$within_functionP$.rebind(_prev_bind_16, thread);
            czer_vars.$within_negationP$.rebind(_prev_bind_15, thread);
            czer_vars.$accumulating_semantic_violationsP$.rebind(_prev_bind_14, thread);
            at_vars.$gather_at_constraintsP$.rebind(_prev_bind_13, thread);
            at_vars.$at_check_inter_arg_formatP$.rebind(_prev_bind_12, thread);
            at_vars.$at_check_inter_arg_differentP$.rebind(_prev_bind_11, thread);
            at_vars.$at_check_non_constant_inter_arg_isaP$.rebind(_prev_bind_10, thread);
            at_vars.$at_check_inter_arg_isaP$.rebind(_prev_bind_9, thread);
            at_vars.$at_argnum$.rebind(_prev_bind_8, thread);
            at_vars.$at_arg$.rebind(_prev_bind_7, thread);
            at_vars.$at_reln$.rebind(_prev_bind_6, thread);
            wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_5, thread);
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return admittedP;
    }

    public static SubLObject generic_arg_p(final SubLObject v_object) {
        return at_utilities.generic_argP(v_object);
    }

    public static SubLObject relations_admitting_fort_as_arg(final SubLObject fort, final SubLObject argnum, SubLObject relations, SubLObject mt) {
        if (relations == UNPROVIDED) {
            relations = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
        final SubLObject isa_okP = makeBoolean(NIL == at_vars.$at_check_arg_isaP$.getDynamicValue(thread));
        final SubLObject genls_okP = makeBoolean(NIL == at_vars.$at_check_arg_genlsP$.getDynamicValue(thread));
        SubLObject result = NIL;
        SubLObject isa_candidates = NIL;
        if (NIL == relations) {
            relations = at_candidate_relations_admitting_fort(fort, list(argnum), mt);
        }
        if ((NIL != isa_okP) && (NIL != genls_okP)) {
            result = relations;
        } else {
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_3 = at_vars.$at_arg$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                at_vars.$at_arg$.bind(fort, thread);
                assert NIL != integerp(argnum) : "Types.integerp(argnum) " + "CommonSymbols.NIL != Types.integerp(argnum) " + argnum;
                final SubLObject _prev_bind_0_$7 = at_vars.$at_argnum$.currentBinding(thread);
                final SubLObject _prev_bind_1_$8 = at_vars.$at_arg_type$.currentBinding(thread);
                try {
                    at_vars.$at_argnum$.bind(argnum, thread);
                    at_vars.$at_arg_type$.bind($STRONG_FORT, thread);
                    if (NIL != isa_okP) {
                        isa_candidates = relations;
                    } else {
                        final SubLObject _prev_bind_0_$8 = at_vars.$defn_fn_history$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$9 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$11 = at_vars.$defn_col_history$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
                        try {
                            at_vars.$defn_fn_history$.bind(at_macros.make_defn_fn_history_table(), thread);
                            at_vars.$quoted_defn_fn_history$.bind(at_macros.make_quoted_defn_fn_history_table(), thread);
                            at_vars.$defn_col_history$.bind(at_macros.make_defn_col_history_table(), thread);
                            at_vars.$quoted_defn_col_history$.bind(at_macros.make_quoted_defn_col_history_table(), thread);
                            try {
                                final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                                final SubLObject _prev_bind_0_$9 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$10 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    try {
                                        final SubLObject _prev_bind_0_$10 = at_vars.$at_isa_space$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$11 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                        try {
                                            at_vars.$at_isa_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                                            isa.sbhl_record_all_isa(fort, UNPROVIDED, UNPROVIDED);
                                            SubLObject cdolist_list_var = relations;
                                            SubLObject relation = NIL;
                                            relation = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                if (NIL != forts.fort_p(relation)) {
                                                    final SubLObject genl_somethingP = (NIL != forts.fort_p(relation)) ? makeBoolean((NIL != genl_predicates.genl_predicates(relation, UNPROVIDED, UNPROVIDED)) || (NIL != genl_predicates.genl_inverses(relation, UNPROVIDED, UNPROVIDED))) : NIL;
                                                    final SubLObject _prev_bind_0_$11 = at_vars.$at_reln$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$12 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
                                                    final SubLObject _prev_bind_2_$12 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
                                                    try {
                                                        at_vars.$at_reln$.bind(relation, thread);
                                                        at_vars.$at_search_genl_predsP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread)) && (NIL != genl_somethingP)), thread);
                                                        at_vars.$at_search_genl_inversesP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread)) && (NIL != genl_somethingP)), thread);
                                                        if (NIL != arg_type.arg_test_okP(relation, fort, argnum, $ISA)) {
                                                            isa_candidates = cons(relation, isa_candidates);
                                                        }
                                                    } finally {
                                                        at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_2_$12, thread);
                                                        at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_$12, thread);
                                                        at_vars.$at_reln$.rebind(_prev_bind_0_$11, thread);
                                                    }
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                relation = cdolist_list_var.first();
                                            } 
                                        } finally {
                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$11, thread);
                                            at_vars.$at_isa_space$.rebind(_prev_bind_0_$10, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$10, thread);
                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$9, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    at_defns.clear_defn_space();
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                                }
                            }
                        } finally {
                            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_4, thread);
                            at_vars.$defn_col_history$.rebind(_prev_bind_2_$11, thread);
                            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_1_$9, thread);
                            at_vars.$defn_fn_history$.rebind(_prev_bind_0_$8, thread);
                        }
                    }
                    if (NIL != genls_okP) {
                        result = isa_candidates;
                    } else {
                        final SubLObject collectionP = fort_types_interface.collectionP(fort);
                        final SubLObject resourcing_p2 = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                        final SubLObject _prev_bind_0_$14 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$13 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                            sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject _prev_bind_0_$15 = at_vars.$at_genls_space$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$14 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                try {
                                    at_vars.$at_genls_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p2, thread);
                                    if (NIL != collectionP) {
                                        sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), fort, UNPROVIDED, UNPROVIDED);
                                        sbhl_marking_methods.sbhl_record_node($$Thing, UNPROVIDED);
                                    }
                                    SubLObject cdolist_list_var2 = isa_candidates;
                                    SubLObject relation2 = NIL;
                                    relation2 = cdolist_list_var2.first();
                                    while (NIL != cdolist_list_var2) {
                                        final SubLObject genl_somethingP2 = (NIL != forts.fort_p(relation2)) ? makeBoolean((NIL != genl_predicates.genl_predicates(relation2, UNPROVIDED, UNPROVIDED)) || (NIL != genl_predicates.genl_inverses(relation2, UNPROVIDED, UNPROVIDED))) : NIL;
                                        final SubLObject _prev_bind_0_$16 = at_vars.$at_reln$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$15 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$13 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
                                        try {
                                            at_vars.$at_reln$.bind(relation2, thread);
                                            at_vars.$at_search_genl_predsP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread)) && (NIL != genl_somethingP2)), thread);
                                            at_vars.$at_search_genl_inversesP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread)) && (NIL != genl_somethingP2)), thread);
                                            if (NIL != arg_type.arg_test_okP(relation2, fort, argnum, $GENLS)) {
                                                result = cons(relation2, result);
                                            }
                                        } finally {
                                            at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_2_$13, thread);
                                            at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_$15, thread);
                                            at_vars.$at_reln$.rebind(_prev_bind_0_$16, thread);
                                        }
                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                        relation2 = cdolist_list_var2.first();
                                    } 
                                } finally {
                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$14, thread);
                                    at_vars.$at_genls_space$.rebind(_prev_bind_0_$15, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values3 = getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                    restoreValuesFromVector(_values3);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                                }
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$13, thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$14, thread);
                        }
                    }
                } finally {
                    at_vars.$at_arg_type$.rebind(_prev_bind_1_$8, thread);
                    at_vars.$at_argnum$.rebind(_prev_bind_0_$7, thread);
                }
            } finally {
                at_vars.$at_arg$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    public static SubLObject relations_admitting_fort_as_any_of_args(final SubLObject fort, final SubLObject argnums, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            SubLObject cdolist_list_var = argnums;
            SubLObject argnum = NIL;
            argnum = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject candidate_relations = at_candidate_relations_admitting_fort(fort, list(argnum), mt);
                result = nconc(result, relations_admitting_fort_as_arg(fort, argnum, candidate_relations, UNPROVIDED));
                cdolist_list_var = cdolist_list_var.rest();
                argnum = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return list_utilities.remove_duplicate_forts(result);
    }

    public static SubLObject at_candidate_relations_admitting_fort(final SubLObject fort, final SubLObject argnums, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
        assert NIL != consp(argnums) : "Types.consp(argnums) " + "CommonSymbols.NIL != Types.consp(argnums) " + argnums;
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            final SubLObject collections_admitting_term_via_defns = at_defns.collections_admitting_term_via_defns(fort);
            final SubLObject _prev_bind_0_$29 = $at_candidate_relations_argnums_table$.currentBinding(thread);
            try {
                $at_candidate_relations_argnums_table$.bind(hash_table_utilities.hash_list_elements(argnums, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                final SubLObject _prev_bind_0_$30 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                final SubLObject _prev_bind_1_$31 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject _prev_bind_0_$31 = $at_candidate_relations_sbhl_space$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$32 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                        try {
                            $at_candidate_relations_sbhl_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                            isa.sbhl_record_all_isa(fort, UNPROVIDED, UNPROVIDED);
                            SubLObject cdolist_list_var = collections_admitting_term_via_defns;
                            SubLObject col = NIL;
                            col = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, UNPROVIDED, UNPROVIDED);
                                cdolist_list_var = cdolist_list_var.rest();
                                col = cdolist_list_var.first();
                            } 
                            final SubLObject _prev_bind_0_$32 = $at_candidate_relations_table$.currentBinding(thread);
                            try {
                                $at_candidate_relations_table$.bind(make_hash_table(length(argnums), UNPROVIDED, UNPROVIDED), thread);
                                final SubLObject at_cr_hashing_function = (NIL != list_utilities.singletonP(argnums)) ? AT_CR_HASH_RELATIONS : AT_CR_HASH_RELATIONS_BY_ARGNUM;
                                final SubLObject _prev_bind_0_$33 = $at_cr_arg_isa_pred$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$33 = $at_cr_argnum$.currentBinding(thread);
                                try {
                                    $at_cr_arg_isa_pred$.bind(NIL != list_utilities.singletonP(argnums) ? kb_accessors.arg_isa_pred(argnums.first(), UNPROVIDED, UNPROVIDED) : NIL, thread);
                                    $at_cr_argnum$.bind(NIL != list_utilities.singletonP(argnums) ? argnums.first() : NIL, thread);
                                    if ($at_candidate_relations_sbhl_space$.getDynamicValue(thread).isHashtable()) {
                                        final SubLObject cdohash_table = $at_candidate_relations_sbhl_space$.getDynamicValue(thread);
                                        SubLObject node = NIL;
                                        SubLObject tag = NIL;
                                        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                                        try {
                                            while (iteratorHasNext(cdohash_iterator)) {
                                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                node = getEntryKey(cdohash_entry);
                                                tag = getEntryValue(cdohash_entry);
                                                funcall(at_cr_hashing_function, node);
                                            } 
                                        } finally {
                                            releaseEntrySetIterator(cdohash_iterator);
                                        }
                                    } else {
                                        sbhl_paranoia.sbhl_error(THREE_INTEGER, $str13$no_mapping_method_defiend_for_sbh, $at_candidate_relations_sbhl_space$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                    final SubLObject result_table = make_hash_table($at_candidate_relations_max$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                                    final SubLObject cdohash_table2 = $at_candidate_relations_table$.getDynamicValue(thread);
                                    SubLObject argnum = NIL;
                                    SubLObject candidates = NIL;
                                    final Iterator cdohash_iterator2 = getEntrySetIterator(cdohash_table2);
                                    try {
                                        while (iteratorHasNext(cdohash_iterator2)) {
                                            final Map.Entry cdohash_entry2 = iteratorNextEntry(cdohash_iterator2);
                                            argnum = getEntryKey(cdohash_entry2);
                                            SubLObject cdolist_list_var2;
                                            candidates = cdolist_list_var2 = getEntryValue(cdohash_entry2);
                                            SubLObject candidate = NIL;
                                            candidate = cdolist_list_var2.first();
                                            while (NIL != cdolist_list_var2) {
                                                if (NIL == gethash(candidate, result_table, UNPROVIDED)) {
                                                    sethash(candidate, result_table, T);
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                candidate = cdolist_list_var2.first();
                                            } 
                                        } 
                                    } finally {
                                        releaseEntrySetIterator(cdohash_iterator2);
                                    }
                                    result = hash_table_utilities.hash_table_keys(result_table);
                                } finally {
                                    $at_cr_argnum$.rebind(_prev_bind_1_$33, thread);
                                    $at_cr_arg_isa_pred$.rebind(_prev_bind_0_$33, thread);
                                }
                            } finally {
                                $at_candidate_relations_table$.rebind(_prev_bind_0_$32, thread);
                            }
                        } finally {
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$32, thread);
                            $at_candidate_relations_sbhl_space$.rebind(_prev_bind_0_$31, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$31, thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$30, thread);
                }
            } finally {
                $at_candidate_relations_argnums_table$.rebind(_prev_bind_0_$29, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject at_cr_hash_relations(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pred_var = $at_cr_arg_isa_pred$.getDynamicValue(thread);
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, TWO_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, TWO_INTEGER, pred_var);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                        SubLObject done_var_$38 = NIL;
                        final SubLObject token_var_$39 = NIL;
                        while (NIL == done_var_$38) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$39);
                            final SubLObject valid_$40 = makeBoolean(!token_var_$39.eql(assertion));
                            if (NIL != valid_$40) {
                                final SubLObject relation = assertions_high.gaf_arg1(assertion);
                                hash_table_utilities.push_hash($at_cr_argnum$.getDynamicValue(thread), relation, $at_candidate_relations_table$.getDynamicValue(thread));
                            }
                            done_var_$38 = makeBoolean(NIL == valid_$40);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        pred_var = $$argsIsa;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, TWO_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, TWO_INTEGER, pred_var);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                        SubLObject done_var_$39 = NIL;
                        final SubLObject token_var_$40 = NIL;
                        while (NIL == done_var_$39) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$40);
                            final SubLObject valid_$41 = makeBoolean(!token_var_$40.eql(assertion));
                            if (NIL != valid_$41) {
                                final SubLObject relation = assertions_high.gaf_arg1(assertion);
                                final SubLObject arity_max = arity.arity_max(relation);
                                if (arity_max.isNumber() && $at_cr_argnum$.getDynamicValue(thread).numLE(arity_max)) {
                                    hash_table_utilities.push_hash($at_cr_argnum$.getDynamicValue(thread), relation, $at_candidate_relations_table$.getDynamicValue(thread));
                                }
                            }
                            done_var_$39 = makeBoolean(NIL == valid_$41);
                        } 
                    } finally {
                        final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        return NIL;
    }

    public static SubLObject at_cr_hash_relations_by_argnum(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pred_var = $$argIsa;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, THREE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, THREE_INTEGER, pred_var);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                        SubLObject done_var_$44 = NIL;
                        final SubLObject token_var_$45 = NIL;
                        while (NIL == done_var_$44) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$45);
                            final SubLObject valid_$46 = makeBoolean(!token_var_$45.eql(assertion));
                            if (NIL != valid_$46) {
                                final SubLObject relation = assertions_high.gaf_arg1(assertion);
                                final SubLObject argnum = assertions_high.gaf_arg2(assertion);
                                if (NIL != gethash(argnum, $at_candidate_relations_argnums_table$.getDynamicValue(thread), UNPROVIDED)) {
                                    hash_table_utilities.push_hash(argnum, relation, $at_candidate_relations_table$.getDynamicValue(thread));
                                }
                            }
                            done_var_$44 = makeBoolean(NIL == valid_$46);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        pred_var = $$argsIsa;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, TWO_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, TWO_INTEGER, pred_var);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                        SubLObject done_var_$45 = NIL;
                        final SubLObject token_var_$46 = NIL;
                        while (NIL == done_var_$45) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$46);
                            final SubLObject valid_$47 = makeBoolean(!token_var_$46.eql(assertion));
                            if (NIL != valid_$47) {
                                final SubLObject relation = assertions_high.gaf_arg1(assertion);
                                final SubLObject cdohash_table = $at_candidate_relations_argnums_table$.getDynamicValue(thread);
                                SubLObject argnum2 = NIL;
                                SubLObject ignore = NIL;
                                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                                try {
                                    while (iteratorHasNext(cdohash_iterator)) {
                                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                        argnum2 = getEntryKey(cdohash_entry);
                                        ignore = getEntryValue(cdohash_entry);
                                        final SubLObject arity_max = arity.arity_max(relation);
                                        if (arity_max.isNumber() && argnum2.numLE(arity_max)) {
                                            hash_table_utilities.push_hash(argnum2, relation, $at_candidate_relations_table$.getDynamicValue(thread));
                                        }
                                    } 
                                } finally {
                                    releaseEntrySetIterator(cdohash_iterator);
                                }
                            }
                            done_var_$45 = makeBoolean(NIL == valid_$47);
                        } 
                    } finally {
                        final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        return NIL;
    }

    public static SubLObject at_cr_all_arg_isa_cachedP(final SubLObject relation, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_boolean = NIL;
        final SubLObject _prev_bind_0 = $at_cr_mapping_result$.currentBinding(thread);
        try {
            $at_cr_mapping_result$.bind(T, thread);
            final SubLObject arg_isa_pred = kb_accessors.arg_isa_pred(argnum, UNPROVIDED, UNPROVIDED);
            kb_mapping.map_gaf_arg_index($sym18$AT_CR_ARGISA_COL_SEARCHED_, relation, ONE_INTEGER, arg_isa_pred, $TRUE, UNPROVIDED);
            if (NIL != $at_cr_mapping_result$.getDynamicValue(thread)) {
                kb_mapping.map_gaf_arg_index($sym18$AT_CR_ARGISA_COL_SEARCHED_, relation, ONE_INTEGER, $$argsIsa, $TRUE, UNPROVIDED);
            }
            v_boolean = $at_cr_mapping_result$.getDynamicValue(thread);
        } finally {
            $at_cr_mapping_result$.rebind(_prev_bind_0, thread);
        }
        return v_boolean;
    }

    public static SubLObject at_cr_argisa_col_searchedP(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject col = assertions_high.gaf_arg2(assertion);
        if ((NIL != forts.fort_p(col)) && (NIL == sbhl_marking_methods.sbhl_recorded_node_p(col, $at_candidate_relations_sbhl_space$.getDynamicValue(thread)))) {
            $at_cr_mapping_result$.setDynamicValue(NIL, thread);
            mapping_finished();
        }
        return NIL;
    }

    public static SubLObject inference_relations_admitting_fort_as_arg(final SubLObject fort, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            final SubLObject collections_admitting_term_via_defns = at_defns.collections_admitting_term_via_defns(fort);
            final SubLObject _prev_bind_0_$50 = $ira_table$.currentBinding(thread);
            final SubLObject _prev_bind_1_$51 = $ira_argnum$.currentBinding(thread);
            try {
                $ira_table$.bind(make_hash_table($ira_relations_estimate$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED), thread);
                $ira_argnum$.bind(argnum, thread);
                final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                final SubLObject _prev_bind_0_$51 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                final SubLObject _prev_bind_1_$52 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject _prev_bind_0_$52 = $ira_isa_sbhl_space$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$53 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                        try {
                            $ira_isa_sbhl_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                            isa.sbhl_record_all_isa(fort, UNPROVIDED, UNPROVIDED);
                            SubLObject cdolist_list_var = collections_admitting_term_via_defns;
                            SubLObject col = NIL;
                            col = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, UNPROVIDED, UNPROVIDED);
                                cdolist_list_var = cdolist_list_var.rest();
                                col = cdolist_list_var.first();
                            } 
                            final SubLObject resourcing_p_$56 = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                            final SubLObject _prev_bind_0_$53 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$54 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                                sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                try {
                                    final SubLObject _prev_bind_0_$54 = $ira_genl_sbhl_space$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$55 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                    try {
                                        $ira_genl_sbhl_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p_$56, thread);
                                        sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), fort, UNPROVIDED, UNPROVIDED);
                                        inference_relations_admitting_term_as_arg_int(argnum);
                                    } finally {
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$55, thread);
                                        $ira_genl_sbhl_space$.rebind(_prev_bind_0_$54, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$55 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$55, thread);
                                    }
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$54, thread);
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$53, thread);
                            }
                        } finally {
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$53, thread);
                            $ira_isa_sbhl_space$.rebind(_prev_bind_0_$52, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$56 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$56, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$52, thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$51, thread);
                }
                result = hash_table_utilities.hash_table_keys($ira_table$.getDynamicValue(thread));
            } finally {
                $ira_argnum$.rebind(_prev_bind_1_$51, thread);
                $ira_table$.rebind(_prev_bind_0_$50, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject inference_relations_admitting_naut_as_arg(final SubLObject naut, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != term.nautP(naut, UNPROVIDED) : "term.nautP(naut, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != term.nautP(naut, CommonSymbols.UNPROVIDED) " + naut;
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            final SubLObject function = cycl_utilities.nat_functor(naut);
            final SubLObject result_isas = kb_accessors.result_isa(function, mt);
            final SubLObject result_isa_args = kb_accessors.result_isa_args(function, mt);
            final SubLObject result_genls = kb_accessors.result_genl(function, mt, UNPROVIDED);
            final SubLObject result_genl_args = kb_accessors.result_genl_args(function, mt);
            final SubLObject collections_admitting_term_via_defns = at_defns.collections_admitting_term_via_defns(naut);
            final SubLObject _prev_bind_0_$63 = $ira_table$.currentBinding(thread);
            final SubLObject _prev_bind_1_$64 = $ira_argnum$.currentBinding(thread);
            try {
                $ira_table$.bind(make_hash_table($ira_relations_estimate$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED), thread);
                $ira_argnum$.bind(argnum, thread);
                final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                final SubLObject _prev_bind_0_$64 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                final SubLObject _prev_bind_1_$65 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject _prev_bind_0_$65 = $ira_isa_sbhl_space$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$66 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                        try {
                            $ira_isa_sbhl_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                            SubLObject cdolist_list_var = result_isas;
                            SubLObject v_isa = NIL;
                            v_isa = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), v_isa, UNPROVIDED, UNPROVIDED);
                                cdolist_list_var = cdolist_list_var.rest();
                                v_isa = cdolist_list_var.first();
                            } 
                            cdolist_list_var = result_isa_args;
                            v_isa = NIL;
                            v_isa = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), v_isa, UNPROVIDED, UNPROVIDED);
                                cdolist_list_var = cdolist_list_var.rest();
                                v_isa = cdolist_list_var.first();
                            } 
                            cdolist_list_var = collections_admitting_term_via_defns;
                            SubLObject col = NIL;
                            col = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, UNPROVIDED, UNPROVIDED);
                                cdolist_list_var = cdolist_list_var.rest();
                                col = cdolist_list_var.first();
                            } 
                            final SubLObject resourcing_p_$69 = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                            final SubLObject _prev_bind_0_$66 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$67 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                                sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                try {
                                    final SubLObject _prev_bind_0_$67 = $ira_genl_sbhl_space$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$68 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                    try {
                                        $ira_genl_sbhl_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p_$69, thread);
                                        SubLObject cdolist_list_var2 = result_genls;
                                        SubLObject genl = NIL;
                                        genl = cdolist_list_var2.first();
                                        while (NIL != cdolist_list_var2) {
                                            sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), genl, UNPROVIDED, UNPROVIDED);
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            genl = cdolist_list_var2.first();
                                        } 
                                        cdolist_list_var2 = result_genl_args;
                                        genl = NIL;
                                        genl = cdolist_list_var2.first();
                                        while (NIL != cdolist_list_var2) {
                                            sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), genl, UNPROVIDED, UNPROVIDED);
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            genl = cdolist_list_var2.first();
                                        } 
                                        inference_relations_admitting_term_as_arg_int(argnum);
                                    } finally {
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$68, thread);
                                        $ira_genl_sbhl_space$.rebind(_prev_bind_0_$67, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$68 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$68, thread);
                                    }
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$67, thread);
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$66, thread);
                            }
                        } finally {
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$66, thread);
                            $ira_isa_sbhl_space$.rebind(_prev_bind_0_$65, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$69 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$69, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$65, thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$64, thread);
                }
                result = hash_table_utilities.hash_table_keys($ira_table$.getDynamicValue(thread));
            } finally {
                $ira_argnum$.rebind(_prev_bind_1_$64, thread);
                $ira_table$.rebind(_prev_bind_0_$63, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject inference_relations_admitting_term_as_arg_int(final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $ira_arg_isa_pred$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $ira_arg_genl_pred$.currentBinding(thread);
        try {
            $ira_arg_isa_pred$.bind(kb_accessors.arg_isa_pred(argnum, UNPROVIDED, UNPROVIDED), thread);
            $ira_arg_genl_pred$.bind(kb_accessors.arg_genl_pred(argnum, UNPROVIDED, UNPROVIDED), thread);
            if (NIL != forts.fort_p($ira_arg_isa_pred$.getDynamicValue(thread))) {
                final SubLObject cdohash_table = $ira_isa_sbhl_space$.getDynamicValue(thread);
                SubLObject isa_col = NIL;
                SubLObject marking = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        isa_col = getEntryKey(cdohash_entry);
                        marking = getEntryValue(cdohash_entry);
                        ira_isa_hash_relations(isa_col);
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
            if (NIL != forts.fort_p($ira_arg_genl_pred$.getDynamicValue(thread))) {
                final SubLObject cdohash_table = $ira_genl_sbhl_space$.getDynamicValue(thread);
                SubLObject genl_col = NIL;
                SubLObject marking = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        genl_col = getEntryKey(cdohash_entry);
                        marking = getEntryValue(cdohash_entry);
                        ira_genl_hash_relations(genl_col);
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
            SubLObject cdohash_table = $ira_table$.getDynamicValue(thread);
            SubLObject relation = NIL;
            SubLObject v_boolean = NIL;
            Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    relation = getEntryKey(cdohash_entry);
                    v_boolean = getEntryValue(cdohash_entry);
                    if (NIL == ira_all_arg_isa_cachedP(relation)) {
                        remhash(relation, $ira_table$.getDynamicValue(thread));
                    }
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
            cdohash_table = $ira_table$.getDynamicValue(thread);
            relation = NIL;
            v_boolean = NIL;
            cdohash_iterator = getEntrySetIterator(cdohash_table);
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    relation = getEntryKey(cdohash_entry);
                    v_boolean = getEntryValue(cdohash_entry);
                    if (NIL == ira_all_arg_genl_cachedP(relation)) {
                        remhash(relation, $ira_table$.getDynamicValue(thread));
                    }
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
        } finally {
            $ira_arg_genl_pred$.rebind(_prev_bind_2, thread);
            $ira_arg_isa_pred$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject ira_isa_hash_relations(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pred_var = $ira_arg_isa_pred$.getDynamicValue(thread);
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(col, TWO_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(col, TWO_INTEGER, pred_var);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                        SubLObject done_var_$76 = NIL;
                        final SubLObject token_var_$77 = NIL;
                        while (NIL == done_var_$76) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$77);
                            final SubLObject valid_$78 = makeBoolean(!token_var_$77.eql(assertion));
                            if (NIL != valid_$78) {
                                final SubLObject relation = assertions_high.gaf_arg1(assertion);
                                sethash(relation, $ira_table$.getDynamicValue(thread), T);
                            }
                            done_var_$76 = makeBoolean(NIL == valid_$78);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        pred_var = $$argsIsa;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(col, TWO_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(col, TWO_INTEGER, pred_var);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                        SubLObject done_var_$77 = NIL;
                        final SubLObject token_var_$78 = NIL;
                        while (NIL == done_var_$77) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$78);
                            final SubLObject valid_$79 = makeBoolean(!token_var_$78.eql(assertion));
                            if (NIL != valid_$79) {
                                final SubLObject relation = assertions_high.gaf_arg1(assertion);
                                final SubLObject arity_max = arity.arity_max(relation);
                                if (arity_max.isNumber() && $ira_argnum$.getDynamicValue(thread).numLE(arity_max)) {
                                    sethash(relation, $ira_table$.getDynamicValue(thread), T);
                                }
                            }
                            done_var_$77 = makeBoolean(NIL == valid_$79);
                        } 
                    } finally {
                        final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        return NIL;
    }

    public static SubLObject ira_all_arg_isa_cachedP(final SubLObject relation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_boolean = NIL;
        final SubLObject _prev_bind_0 = $ira_mapping_result$.currentBinding(thread);
        try {
            $ira_mapping_result$.bind(T, thread);
            kb_mapping.map_gaf_arg_index($sym20$IRA_ARGISA_COL_SEARCHED_, relation, ONE_INTEGER, $ira_arg_isa_pred$.getDynamicValue(thread), $TRUE, UNPROVIDED);
            if (NIL != $ira_mapping_result$.getDynamicValue(thread)) {
                kb_mapping.map_gaf_arg_index($sym20$IRA_ARGISA_COL_SEARCHED_, relation, ONE_INTEGER, $$argsIsa, $TRUE, UNPROVIDED);
            }
            v_boolean = $ira_mapping_result$.getDynamicValue(thread);
        } finally {
            $ira_mapping_result$.rebind(_prev_bind_0, thread);
        }
        return v_boolean;
    }

    public static SubLObject ira_argisa_col_searchedP(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject col = assertions_high.gaf_arg2(assertion);
        if ((NIL != forts.fort_p(col)) && (NIL == sbhl_marking_methods.sbhl_recorded_node_p(col, $ira_isa_sbhl_space$.getDynamicValue(thread)))) {
            $ira_mapping_result$.setDynamicValue(NIL, thread);
            mapping_finished();
        }
        return NIL;
    }

    public static SubLObject ira_genl_hash_relations(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pred_var = $ira_arg_genl_pred$.getDynamicValue(thread);
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, TWO_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, TWO_INTEGER, pred_var);
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
                            if (NIL != valid_$84) {
                                final SubLObject relation = assertions_high.gaf_arg1(assertion);
                                sethash(relation, $ira_table$.getDynamicValue(thread), T);
                            }
                            done_var_$82 = makeBoolean(NIL == valid_$84);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        pred_var = $$argsGenl;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, TWO_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, TWO_INTEGER, pred_var);
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
                                final SubLObject relation = assertions_high.gaf_arg1(assertion);
                                final SubLObject arity_max = arity.arity_max(relation);
                                if (arity_max.isNumber() && $ira_argnum$.getDynamicValue(thread).numLE(arity_max)) {
                                    sethash(relation, $ira_table$.getDynamicValue(thread), T);
                                }
                            }
                            done_var_$83 = makeBoolean(NIL == valid_$85);
                        } 
                    } finally {
                        final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        return NIL;
    }

    public static SubLObject ira_all_arg_genl_cachedP(final SubLObject relation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_boolean = NIL;
        final SubLObject _prev_bind_0 = $ira_mapping_result$.currentBinding(thread);
        try {
            $ira_mapping_result$.bind(T, thread);
            kb_mapping.map_gaf_arg_index($sym22$IRA_ARGGENL_COL_SEARCHED_, relation, ONE_INTEGER, $ira_arg_genl_pred$.getDynamicValue(thread), $TRUE, UNPROVIDED);
            if (NIL != $ira_mapping_result$.getDynamicValue(thread)) {
                kb_mapping.map_gaf_arg_index($sym22$IRA_ARGGENL_COL_SEARCHED_, relation, ONE_INTEGER, $$argsGenl, $TRUE, UNPROVIDED);
            }
            v_boolean = $ira_mapping_result$.getDynamicValue(thread);
        } finally {
            $ira_mapping_result$.rebind(_prev_bind_0, thread);
        }
        return v_boolean;
    }

    public static SubLObject ira_arggenl_col_searchedP(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject col = assertions_high.gaf_arg2(assertion);
        if ((NIL != forts.fort_p(col)) && (NIL == sbhl_marking_methods.sbhl_recorded_node_p(col, $ira_genl_sbhl_space$.getDynamicValue(thread)))) {
            $ira_mapping_result$.setDynamicValue(NIL, thread);
            mapping_finished();
        }
        return NIL;
    }

    public static SubLObject declare_at_admitted_file() {
        declareFunction(me, "admitted_argumentP_internal", "ADMITTED-ARGUMENT?-INTERNAL", 3, 1, false);
        declareFunction(me, "admitted_argumentP", "ADMITTED-ARGUMENT?", 3, 1, false);
        declareFunction(me, "admitted_argument_intP", "ADMITTED-ARGUMENT-INT?", 4, 0, false);
        declareFunction(me, "why_not_admitted_argument", "WHY-NOT-ADMITTED-ARGUMENT", 3, 1, false);
        declareFunction(me, "explanation_of_why_not_admitted_argument", "EXPLANATION-OF-WHY-NOT-ADMITTED-ARGUMENT", 3, 1, false);
        declareFunction(me, "admitted_formulaP", "ADMITTED-FORMULA?", 1, 1, false);
        declareFunction(me, "admitted_sentenceP", "ADMITTED-SENTENCE?", 1, 1, false);
        declareFunction(me, "admitted_sentence_wrt_asent_arg_constraintsP", "ADMITTED-SENTENCE-WRT-ASENT-ARG-CONSTRAINTS?", 1, 0, false);
        declareFunction(me, "admitted_atomic_sentence_wrt_arg_constraintsP", "ADMITTED-ATOMIC-SENTENCE-WRT-ARG-CONSTRAINTS?", 1, 0, false);
        declareFunction(me, "why_not_admitted_atomic_sentence_wrt_arg_constraints", "WHY-NOT-ADMITTED-ATOMIC-SENTENCE-WRT-ARG-CONSTRAINTS", 1, 1, false);
        declareFunction(me, "why_not_admitted_sentence_wrt_asent_arg_constraints", "WHY-NOT-ADMITTED-SENTENCE-WRT-ASENT-ARG-CONSTRAINTS", 1, 1, false);
        declareFunction(me, "explanation_of_why_not_admitted_sentence_wrt_asent_arg_constraints", "EXPLANATION-OF-WHY-NOT-ADMITTED-SENTENCE-WRT-ASENT-ARG-CONSTRAINTS", 1, 1, false);
        declareFunction(me, "admitted_argument_plus_inter_arg_isaP", "ADMITTED-ARGUMENT-PLUS-INTER-ARG-ISA?", 3, 0, false);
        declareFunction(me, "generic_arg_p", "GENERIC-ARG-P", 1, 0, false);
        new at_admitted.$generic_arg_p$UnaryFunction();
        declareFunction(me, "relations_admitting_fort_as_arg", "RELATIONS-ADMITTING-FORT-AS-ARG", 2, 2, false);
        declareFunction(me, "relations_admitting_fort_as_any_of_args", "RELATIONS-ADMITTING-FORT-AS-ANY-OF-ARGS", 2, 1, false);
        declareFunction(me, "at_candidate_relations_admitting_fort", "AT-CANDIDATE-RELATIONS-ADMITTING-FORT", 2, 1, false);
        declareFunction(me, "at_cr_hash_relations", "AT-CR-HASH-RELATIONS", 1, 0, false);
        declareFunction(me, "at_cr_hash_relations_by_argnum", "AT-CR-HASH-RELATIONS-BY-ARGNUM", 1, 0, false);
        declareFunction(me, "at_cr_all_arg_isa_cachedP", "AT-CR-ALL-ARG-ISA-CACHED?", 2, 0, false);
        declareFunction(me, "at_cr_argisa_col_searchedP", "AT-CR-ARGISA-COL-SEARCHED?", 1, 0, false);
        declareFunction(me, "inference_relations_admitting_fort_as_arg", "INFERENCE-RELATIONS-ADMITTING-FORT-AS-ARG", 2, 1, false);
        declareFunction(me, "inference_relations_admitting_naut_as_arg", "INFERENCE-RELATIONS-ADMITTING-NAUT-AS-ARG", 2, 1, false);
        declareFunction(me, "inference_relations_admitting_term_as_arg_int", "INFERENCE-RELATIONS-ADMITTING-TERM-AS-ARG-INT", 1, 0, false);
        declareFunction(me, "ira_isa_hash_relations", "IRA-ISA-HASH-RELATIONS", 1, 0, false);
        declareFunction(me, "ira_all_arg_isa_cachedP", "IRA-ALL-ARG-ISA-CACHED?", 1, 0, false);
        declareFunction(me, "ira_argisa_col_searchedP", "IRA-ARGISA-COL-SEARCHED?", 1, 0, false);
        declareFunction(me, "ira_genl_hash_relations", "IRA-GENL-HASH-RELATIONS", 1, 0, false);
        declareFunction(me, "ira_all_arg_genl_cachedP", "IRA-ALL-ARG-GENL-CACHED?", 1, 0, false);
        declareFunction(me, "ira_arggenl_col_searchedP", "IRA-ARGGENL-COL-SEARCHED?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_at_admitted_file() {
        defparameter("*AT-CANDIDATE-RELATIONS-TABLE*", NIL);
        defparameter("*AT-CANDIDATE-RELATIONS-ARGNUMS-TABLE*", NIL);
        defparameter("*AT-CANDIDATE-RELATIONS-SBHL-SPACE*", NIL);
        defparameter("*AT-CR-MAPPING-RESULT*", NIL);
        defparameter("*AT-CR-ARG-ISA-PRED*", NIL);
        defparameter("*AT-CR-ARGNUM*", NIL);
        deflexical("*AT-CANDIDATE-RELATIONS-MAX*", $int$512);
        defparameter("*IRA-TABLE*", NIL);
        defparameter("*IRA-ARGNUM*", NIL);
        defparameter("*IRA-RELATIONS-ESTIMATE*", $int$512);
        defparameter("*IRA-ISA-SBHL-SPACE*", NIL);
        defparameter("*IRA-ARG-ISA-PRED*", NIL);
        defparameter("*IRA-GENL-SBHL-SPACE*", NIL);
        defparameter("*IRA-ARG-GENL-PRED*", NIL);
        defparameter("*IRA-MAPPING-RESULT*", NIL);
        return NIL;
    }

    public static SubLObject setup_at_admitted_file() {
        memoization_state.note_memoized_function($sym0$ADMITTED_ARGUMENT_);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_at_admitted_file();
    }

    @Override
    public void initializeVariables() {
        init_at_admitted_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_at_admitted_file();
    }

    

    public static final class $generic_arg_p$UnaryFunction extends UnaryFunction {
        public $generic_arg_p$UnaryFunction() {
            super(extractFunctionNamed("GENERIC-ARG-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return generic_arg_p(arg1);
        }
    }
}

/**
 * Total time: 1168 ms
 */
