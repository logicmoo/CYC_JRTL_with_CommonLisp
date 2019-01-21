package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class at_admitted extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.at_admitted";
    public static final String myFingerPrint = "cad332996ea618666a2f5f5a281a8647c080c979d94c8daa8963b924a099924e";
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 12349L)
    private static SubLSymbol $at_candidate_relations_table$;
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 12547L)
    private static SubLSymbol $at_candidate_relations_argnums_table$;
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 12613L)
    private static SubLSymbol $at_candidate_relations_sbhl_space$;
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 12676L)
    private static SubLSymbol $at_cr_mapping_result$;
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 12726L)
    private static SubLSymbol $at_cr_arg_isa_pred$;
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 12774L)
    private static SubLSymbol $at_cr_argnum$;
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 12816L)
    private static SubLSymbol $at_candidate_relations_max$;
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 17056L)
    private static SubLSymbol $ira_table$;
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 17343L)
    private static SubLSymbol $ira_argnum$;
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 17398L)
    private static SubLSymbol $ira_relations_estimate$;
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 17495L)
    private static SubLSymbol $ira_isa_sbhl_space$;
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 17543L)
    private static SubLSymbol $ira_arg_isa_pred$;
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 17627L)
    private static SubLSymbol $ira_genl_sbhl_space$;
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 17676L)
    private static SubLSymbol $ira_arg_genl_pred$;
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 17763L)
    private static SubLSymbol $ira_mapping_result$;
    private static final SubLSymbol $sym0$ADMITTED_ARGUMENT_;
    private static final SubLSymbol $sym1$INTEGERP;
    private static final SubLSymbol $kw2$IGNORE;
    private static final SubLSymbol $sym3$FORT_P;
    private static final SubLSymbol $kw4$STRONG_FORT;
    private static final SubLSymbol $kw5$ISA;
    private static final SubLObject $const6$genls;
    private static final SubLObject $const7$Thing;
    private static final SubLSymbol $kw8$GENLS;
    private static final SubLInteger $int9$512;
    private static final SubLSymbol $sym10$CONSP;
    private static final SubLSymbol $sym11$AT_CR_HASH_RELATIONS;
    private static final SubLSymbol $sym12$AT_CR_HASH_RELATIONS_BY_ARGNUM;
    private static final SubLString $str13$no_mapping_method_defiend_for_sbh;
    private static final SubLSymbol $kw14$GAF;
    private static final SubLSymbol $kw15$TRUE;
    private static final SubLObject $const16$argsIsa;
    private static final SubLObject $const17$argIsa;
    private static final SubLSymbol $sym18$AT_CR_ARGISA_COL_SEARCHED_;
    private static final SubLSymbol $sym19$NAUT_;
    private static final SubLSymbol $sym20$IRA_ARGISA_COL_SEARCHED_;
    private static final SubLObject $const21$argsGenl;
    private static final SubLSymbol $sym22$IRA_ARGGENL_COL_SEARCHED_;
    
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 384L)
    public static SubLObject admitted_argumentP_internal(final SubLObject v_term, final SubLObject argnum, final SubLObject relation, SubLObject mt) {
        if (mt == at_admitted.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert at_admitted.NIL != Types.integerp(argnum) : argnum;
        if (at_admitted.NIL != cycl_variables.cyc_varP(relation)) {
            return (SubLObject)at_admitted.T;
        }
        SubLObject admittedP = (SubLObject)at_admitted.NIL;
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
            at_vars.$noting_at_violationsP$.bind((SubLObject)at_admitted.NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind((SubLObject)at_admitted.NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind((SubLObject)at_admitted.NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind((SubLObject)at_admitted.NIL, thread);
            wff_vars.$provide_wff_suggestionsP$.bind((SubLObject)at_admitted.NIL, thread);
            at_vars.$at_reln$.bind(relation, thread);
            at_vars.$at_arg$.bind(v_term, thread);
            at_vars.$at_argnum$.bind(argnum, thread);
            at_vars.$at_check_inter_arg_isaP$.bind((SubLObject)at_admitted.NIL, thread);
            at_vars.$at_check_inter_arg_formatP$.bind((SubLObject)at_admitted.NIL, thread);
            at_vars.$gather_at_constraintsP$.bind((SubLObject)at_admitted.NIL, thread);
            czer_vars.$accumulating_semantic_violationsP$.bind((SubLObject)at_admitted.NIL, thread);
            czer_vars.$within_negationP$.bind(arg_type.at_within_negationP(at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread)), thread);
            at_vars.$within_functionP$.bind((SubLObject)SubLObjectFactory.makeBoolean(at_admitted.NIL != control_vars.$within_assert$.getDynamicValue(thread) && at_admitted.NIL != arg_type.at_within_functionP(at_vars.$at_reln$.getDynamicValue(thread))), thread);
            at_vars.$within_predicateP$.bind((SubLObject)SubLObjectFactory.makeBoolean(at_admitted.NIL != control_vars.$within_assert$.getDynamicValue(thread) && at_admitted.NIL != arg_type.at_within_predicateP(at_vars.$at_reln$.getDynamicValue(thread))), thread);
            czer_vars.$distributing_meta_knowledgeP$.bind(czer_utilities.distributing_meta_predP(at_vars.$at_reln$.getDynamicValue(thread)), thread);
            admittedP = admitted_argument_intP(v_term, argnum, relation, mt);
        }
        finally {
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
    
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 384L)
    public static SubLObject admitted_argumentP(final SubLObject v_term, final SubLObject argnum, final SubLObject relation, SubLObject mt) {
        if (mt == at_admitted.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)at_admitted.NIL;
        if (at_admitted.NIL == v_memoization_state) {
            return admitted_argumentP_internal(v_term, argnum, relation, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)at_admitted.$sym0$ADMITTED_ARGUMENT_, (SubLObject)at_admitted.UNPROVIDED);
        if (at_admitted.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)at_admitted.$sym0$ADMITTED_ARGUMENT_, (SubLObject)at_admitted.FOUR_INTEGER, (SubLObject)at_admitted.NIL, (SubLObject)at_admitted.EQUAL, (SubLObject)at_admitted.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)at_admitted.$sym0$ADMITTED_ARGUMENT_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(v_term, argnum, relation, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)at_admitted.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)at_admitted.NIL;
            collision = cdolist_list_var.first();
            while (at_admitted.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (argnum.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (relation.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (at_admitted.NIL != cached_args && at_admitted.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(admitted_argumentP_internal(v_term, argnum, relation, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(v_term, argnum, relation, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 1684L)
    public static SubLObject admitted_argument_intP(final SubLObject v_term, final SubLObject argnum, final SubLObject relation, final SubLObject mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(at_admitted.NIL != kb_accessors.relationP(relation) && at_admitted.NIL != arity.valid_relation_argnumP(relation, argnum) && (argnum.numG((SubLObject)at_admitted.ZERO_INTEGER) || (argnum.numE((SubLObject)at_admitted.ZERO_INTEGER) && at_admitted.NIL != kb_utilities.kbeq(v_term, relation))) && at_admitted.NIL != arg_type.relation_arg_okP(relation, v_term, argnum, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 1953L)
    public static SubLObject why_not_admitted_argument(final SubLObject v_term, final SubLObject argnum, final SubLObject relation, SubLObject mt) {
        if (mt == at_admitted.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert at_admitted.NIL != Types.integerp(argnum) : argnum;
        if (at_admitted.NIL != cycl_variables.cyc_varP(relation)) {
            return (SubLObject)at_admitted.T;
        }
        SubLObject result = (SubLObject)at_admitted.NIL;
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
            at_vars.$noting_at_violationsP$.bind((SubLObject)at_admitted.T, thread);
            at_vars.$accumulating_at_violationsP$.bind((SubLObject)at_admitted.T, thread);
            wff_vars.$noting_wff_violationsP$.bind((SubLObject)at_admitted.T, thread);
            wff_vars.$accumulating_wff_violationsP$.bind((SubLObject)at_admitted.T, thread);
            at_vars.$at_reln$.bind(relation, thread);
            at_vars.$at_arg$.bind(v_term, thread);
            at_vars.$at_argnum$.bind(argnum, thread);
            at_vars.$at_check_inter_arg_isaP$.bind((SubLObject)at_admitted.NIL, thread);
            at_vars.$at_check_inter_arg_formatP$.bind((SubLObject)at_admitted.NIL, thread);
            at_vars.$gather_at_constraintsP$.bind((SubLObject)at_admitted.NIL, thread);
            czer_vars.$accumulating_semantic_violationsP$.bind((SubLObject)at_admitted.T, thread);
            czer_vars.$within_negationP$.bind(arg_type.at_within_negationP(at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread)), thread);
            at_vars.$within_functionP$.bind((SubLObject)SubLObjectFactory.makeBoolean(at_admitted.NIL != control_vars.$within_assert$.getDynamicValue(thread) && at_admitted.NIL != arg_type.at_within_functionP(at_vars.$at_reln$.getDynamicValue(thread))), thread);
            at_vars.$within_predicateP$.bind((SubLObject)SubLObjectFactory.makeBoolean(at_admitted.NIL != control_vars.$within_assert$.getDynamicValue(thread) && at_admitted.NIL != arg_type.at_within_predicateP(at_vars.$at_reln$.getDynamicValue(thread))), thread);
            czer_vars.$distributing_meta_knowledgeP$.bind(czer_utilities.distributing_meta_predP(at_vars.$at_reln$.getDynamicValue(thread)), thread);
            at_vars.$at_violations$.bind((SubLObject)at_admitted.NIL, thread);
            admitted_argument_intP(v_term, argnum, relation, mt);
            result = at_vars.$at_violations$.getDynamicValue(thread);
        }
        finally {
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
    
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 3217L)
    public static SubLObject explanation_of_why_not_admitted_argument(final SubLObject v_term, final SubLObject argnum, final SubLObject relation, SubLObject mt) {
        if (mt == at_admitted.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLObject violations = why_not_admitted_argument(v_term, argnum, relation, mt);
        SubLObject v_answer = (SubLObject)at_admitted.NIL;
        SubLObject cdolist_list_var = violations;
        SubLObject why_not = (SubLObject)at_admitted.NIL;
        why_not = cdolist_list_var.first();
        while (at_admitted.NIL != cdolist_list_var) {
            v_answer = (SubLObject)ConsesLow.cons(wff.explain_wff_violation(why_not, (SubLObject)at_admitted.UNPROVIDED), v_answer);
            cdolist_list_var = cdolist_list_var.rest();
            why_not = cdolist_list_var.first();
        }
        return string_utilities.strcat(v_answer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 3520L)
    public static SubLObject admitted_formulaP(final SubLObject formula, SubLObject mt) {
        if (mt == at_admitted.UNPROVIDED) {
            mt = (SubLObject)at_admitted.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject admittedP = (SubLObject)at_admitted.NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = at_vars.$gather_at_constraintsP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = czer_vars.$accumulating_semantic_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = wff_utilities.$check_wff_constantsP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = control_vars.$within_assert$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind((SubLObject)at_admitted.NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind((SubLObject)at_admitted.NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind((SubLObject)at_admitted.NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind((SubLObject)at_admitted.NIL, thread);
            wff_vars.$provide_wff_suggestionsP$.bind((SubLObject)at_admitted.NIL, thread);
            at_vars.$gather_at_constraintsP$.bind((SubLObject)at_admitted.NIL, thread);
            czer_vars.$accumulating_semantic_violationsP$.bind((SubLObject)at_admitted.NIL, thread);
            wff_utilities.$check_wff_constantsP$.bind((SubLObject)at_admitted.NIL, thread);
            wff_utilities.$check_wff_coherenceP$.bind((SubLObject)at_admitted.NIL, thread);
            control_vars.$within_assert$.bind((SubLObject)at_admitted.NIL, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                admittedP = wff.el_wfeP(formula, (SubLObject)at_admitted.UNPROVIDED, (SubLObject)at_admitted.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$1, thread);
            }
        }
        finally {
            control_vars.$within_assert$.rebind(_prev_bind_10, thread);
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
    
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 4828L)
    public static SubLObject admitted_sentenceP(final SubLObject formula, SubLObject mt) {
        if (mt == at_admitted.UNPROVIDED) {
            mt = (SubLObject)at_admitted.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject admittedP = (SubLObject)at_admitted.NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = at_vars.$gather_at_constraintsP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = czer_vars.$accumulating_semantic_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = wff_utilities.$check_wff_constantsP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = control_vars.$within_assert$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind((SubLObject)at_admitted.NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind((SubLObject)at_admitted.NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind((SubLObject)at_admitted.NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind((SubLObject)at_admitted.NIL, thread);
            wff_vars.$provide_wff_suggestionsP$.bind((SubLObject)at_admitted.NIL, thread);
            at_vars.$gather_at_constraintsP$.bind((SubLObject)at_admitted.NIL, thread);
            czer_vars.$accumulating_semantic_violationsP$.bind((SubLObject)at_admitted.NIL, thread);
            wff_utilities.$check_wff_constantsP$.bind((SubLObject)at_admitted.NIL, thread);
            wff_utilities.$check_wff_coherenceP$.bind((SubLObject)at_admitted.NIL, thread);
            control_vars.$within_assert$.bind((SubLObject)at_admitted.NIL, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$4 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                admittedP = wff.el_wffP(formula, (SubLObject)at_admitted.UNPROVIDED, (SubLObject)at_admitted.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$4, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$3, thread);
            }
        }
        finally {
            control_vars.$within_assert$.rebind(_prev_bind_10, thread);
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
    
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 6129L)
    public static SubLObject admitted_sentence_wrt_asent_arg_constraintsP(final SubLObject sentence) {
        if (at_admitted.NIL != cycl_grammar.cycl_atomic_sentence_p(sentence)) {
            return admitted_atomic_sentence_wrt_arg_constraintsP(sentence);
        }
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, (SubLObject)at_admitted.$kw2$IGNORE);
        SubLObject arg = (SubLObject)at_admitted.NIL;
        arg = cdolist_list_var.first();
        while (at_admitted.NIL != cdolist_list_var) {
            if (at_admitted.NIL == admitted_sentence_wrt_asent_arg_constraintsP(arg)) {
                return (SubLObject)at_admitted.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return (SubLObject)at_admitted.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 6724L)
    public static SubLObject admitted_atomic_sentence_wrt_arg_constraintsP(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject okP = (SubLObject)at_admitted.T;
        final SubLObject predicate = cycl_utilities.reify_when_closed_naut(cycl_utilities.atomic_sentence_predicate(asent));
        if (at_admitted.NIL == cycl_variables.cyc_varP(predicate)) {
            final SubLObject _prev_bind_0 = at_vars.$at_formula$.currentBinding(thread);
            final SubLObject _prev_bind_2 = wff_vars.$within_wffP$.currentBinding(thread);
            try {
                at_vars.$at_formula$.bind(asent, thread);
                wff_vars.$within_wffP$.bind((SubLObject)at_admitted.T, thread);
                SubLObject argnum = (SubLObject)at_admitted.ZERO_INTEGER;
                SubLObject cdolist_list_var;
                final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(asent, (SubLObject)at_admitted.$kw2$IGNORE);
                SubLObject arg = (SubLObject)at_admitted.NIL;
                arg = cdolist_list_var.first();
                while (at_admitted.NIL != cdolist_list_var) {
                    argnum = Numbers.add(argnum, (SubLObject)at_admitted.ONE_INTEGER);
                    okP = (SubLObject)SubLObjectFactory.makeBoolean(at_admitted.NIL != okP && at_admitted.NIL != admitted_argumentP(arg, argnum, predicate, (SubLObject)at_admitted.UNPROVIDED));
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                }
            }
            finally {
                wff_vars.$within_wffP$.rebind(_prev_bind_2, thread);
                at_vars.$at_formula$.rebind(_prev_bind_0, thread);
            }
        }
        return okP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 7210L)
    public static SubLObject why_not_admitted_atomic_sentence_wrt_arg_constraints(final SubLObject asent, SubLObject mt) {
        if (mt == at_admitted.UNPROVIDED) {
            mt = (SubLObject)at_admitted.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.reify_when_closed_naut(cycl_utilities.atomic_sentence_predicate(asent));
        SubLObject result = (SubLObject)at_admitted.NIL;
        if (at_admitted.NIL == cycl_variables.cyc_varP(predicate)) {
            final SubLObject _prev_bind_0 = at_vars.$at_formula$.currentBinding(thread);
            final SubLObject _prev_bind_2 = wff_vars.$within_wffP$.currentBinding(thread);
            try {
                at_vars.$at_formula$.bind(asent, thread);
                wff_vars.$within_wffP$.bind((SubLObject)at_admitted.T, thread);
                SubLObject argnum = (SubLObject)at_admitted.ZERO_INTEGER;
                SubLObject cdolist_list_var;
                final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(asent, (SubLObject)at_admitted.$kw2$IGNORE);
                SubLObject arg = (SubLObject)at_admitted.NIL;
                arg = cdolist_list_var.first();
                while (at_admitted.NIL != cdolist_list_var) {
                    argnum = Numbers.add(argnum, (SubLObject)at_admitted.ONE_INTEGER);
                    SubLObject cdolist_list_var_$5 = why_not_admitted_argument(arg, argnum, predicate, mt);
                    SubLObject reason = (SubLObject)at_admitted.NIL;
                    reason = cdolist_list_var_$5.first();
                    while (at_admitted.NIL != cdolist_list_var_$5) {
                        result = (SubLObject)ConsesLow.cons(reason, result);
                        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                        reason = cdolist_list_var_$5.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                }
            }
            finally {
                wff_vars.$within_wffP$.rebind(_prev_bind_2, thread);
                at_vars.$at_formula$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 7753L)
    public static SubLObject why_not_admitted_sentence_wrt_asent_arg_constraints(final SubLObject sentence, SubLObject mt) {
        if (mt == at_admitted.UNPROVIDED) {
            mt = (SubLObject)at_admitted.NIL;
        }
        SubLObject why_not_wff_reasons = (SubLObject)at_admitted.NIL;
        if (at_admitted.NIL != cycl_grammar.cycl_atomic_sentence_p(sentence)) {
            return why_not_admitted_atomic_sentence_wrt_arg_constraints(sentence, mt);
        }
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, (SubLObject)at_admitted.$kw2$IGNORE);
        SubLObject arg = (SubLObject)at_admitted.NIL;
        arg = cdolist_list_var.first();
        while (at_admitted.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$6 = why_not_admitted_atomic_sentence_wrt_arg_constraints(arg, mt);
            SubLObject why_not_wff_reason = (SubLObject)at_admitted.NIL;
            why_not_wff_reason = cdolist_list_var_$6.first();
            while (at_admitted.NIL != cdolist_list_var_$6) {
                why_not_wff_reasons = (SubLObject)ConsesLow.cons(why_not_wff_reason, why_not_wff_reasons);
                cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                why_not_wff_reason = cdolist_list_var_$6.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return why_not_wff_reasons;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 8220L)
    public static SubLObject explanation_of_why_not_admitted_sentence_wrt_asent_arg_constraints(final SubLObject sentence, SubLObject mt) {
        if (mt == at_admitted.UNPROVIDED) {
            mt = (SubLObject)at_admitted.NIL;
        }
        final SubLObject why_not_wff_reasons = why_not_admitted_sentence_wrt_asent_arg_constraints(sentence, mt);
        SubLObject v_answer = (SubLObject)at_admitted.NIL;
        SubLObject cdolist_list_var = why_not_wff_reasons;
        SubLObject why_not = (SubLObject)at_admitted.NIL;
        why_not = cdolist_list_var.first();
        while (at_admitted.NIL != cdolist_list_var) {
            v_answer = (SubLObject)ConsesLow.cons(wff.explain_wff_violation(why_not, (SubLObject)at_admitted.UNPROVIDED), v_answer);
            cdolist_list_var = cdolist_list_var.rest();
            why_not = cdolist_list_var.first();
        }
        return string_utilities.strcat(v_answer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 8562L)
    public static SubLObject admitted_argument_plus_inter_arg_isaP(final SubLObject v_term, final SubLObject argnum, final SubLObject relation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert at_admitted.NIL != Types.integerp(argnum) : argnum;
        if (at_admitted.NIL != cycl_variables.cyc_varP(relation)) {
            return (SubLObject)at_admitted.T;
        }
        SubLObject admittedP = (SubLObject)at_admitted.NIL;
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
            at_vars.$noting_at_violationsP$.bind((SubLObject)at_admitted.NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind((SubLObject)at_admitted.NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind((SubLObject)at_admitted.NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind((SubLObject)at_admitted.NIL, thread);
            wff_vars.$provide_wff_suggestionsP$.bind((SubLObject)at_admitted.NIL, thread);
            at_vars.$at_reln$.bind(relation, thread);
            at_vars.$at_arg$.bind(v_term, thread);
            at_vars.$at_argnum$.bind(argnum, thread);
            at_vars.$at_check_inter_arg_isaP$.bind((SubLObject)at_admitted.T, thread);
            at_vars.$at_check_non_constant_inter_arg_isaP$.bind((SubLObject)at_admitted.NIL, thread);
            at_vars.$at_check_inter_arg_differentP$.bind((SubLObject)at_admitted.T, thread);
            at_vars.$at_check_inter_arg_formatP$.bind((SubLObject)at_admitted.T, thread);
            at_vars.$gather_at_constraintsP$.bind((SubLObject)at_admitted.NIL, thread);
            czer_vars.$accumulating_semantic_violationsP$.bind((SubLObject)at_admitted.NIL, thread);
            czer_vars.$within_negationP$.bind(arg_type.at_within_negationP(at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread)), thread);
            at_vars.$within_functionP$.bind((SubLObject)SubLObjectFactory.makeBoolean(at_admitted.NIL != control_vars.$within_assert$.getDynamicValue(thread) && at_admitted.NIL != arg_type.at_within_functionP(at_vars.$at_reln$.getDynamicValue(thread))), thread);
            at_vars.$within_predicateP$.bind((SubLObject)SubLObjectFactory.makeBoolean(at_admitted.NIL != control_vars.$within_assert$.getDynamicValue(thread) && at_admitted.NIL != arg_type.at_within_predicateP(at_vars.$at_reln$.getDynamicValue(thread))), thread);
            czer_vars.$distributing_meta_knowledgeP$.bind(czer_utilities.distributing_meta_predP(at_vars.$at_reln$.getDynamicValue(thread)), thread);
            admittedP = admitted_argument_intP(v_term, argnum, relation, (SubLObject)at_admitted.NIL);
        }
        finally {
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
    
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 10074L)
    public static SubLObject generic_arg_p(final SubLObject v_object) {
        return at_utilities.generic_argP(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 10249L)
    public static SubLObject relations_admitting_fort_as_arg(final SubLObject fort, final SubLObject argnum, SubLObject relations, SubLObject mt) {
        if (relations == at_admitted.UNPROVIDED) {
            relations = (SubLObject)at_admitted.NIL;
        }
        if (mt == at_admitted.UNPROVIDED) {
            mt = (SubLObject)at_admitted.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert at_admitted.NIL != forts.fort_p(fort) : fort;
        final SubLObject isa_okP = (SubLObject)SubLObjectFactory.makeBoolean(at_admitted.NIL == at_vars.$at_check_arg_isaP$.getDynamicValue(thread));
        final SubLObject genls_okP = (SubLObject)SubLObjectFactory.makeBoolean(at_admitted.NIL == at_vars.$at_check_arg_genlsP$.getDynamicValue(thread));
        SubLObject result = (SubLObject)at_admitted.NIL;
        SubLObject isa_candidates = (SubLObject)at_admitted.NIL;
        if (at_admitted.NIL == relations) {
            relations = at_candidate_relations_admitting_fort(fort, (SubLObject)ConsesLow.list(argnum), mt);
        }
        if (at_admitted.NIL != isa_okP && at_admitted.NIL != genls_okP) {
            result = relations;
        }
        else {
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_3 = at_vars.$at_arg$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                at_vars.$at_arg$.bind(fort, thread);
                assert at_admitted.NIL != Types.integerp(argnum) : argnum;
                final SubLObject _prev_bind_0_$7 = at_vars.$at_argnum$.currentBinding(thread);
                final SubLObject _prev_bind_1_$8 = at_vars.$at_arg_type$.currentBinding(thread);
                try {
                    at_vars.$at_argnum$.bind(argnum, thread);
                    at_vars.$at_arg_type$.bind((SubLObject)at_admitted.$kw4$STRONG_FORT, thread);
                    if (at_admitted.NIL != isa_okP) {
                        isa_candidates = relations;
                    }
                    else {
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
                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)at_admitted.NIL, thread);
                                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    try {
                                        final SubLObject _prev_bind_0_$10 = at_vars.$at_isa_space$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$11 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                        try {
                                            at_vars.$at_isa_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                                            isa.sbhl_record_all_isa(fort, (SubLObject)at_admitted.UNPROVIDED, (SubLObject)at_admitted.UNPROVIDED);
                                            SubLObject cdolist_list_var = relations;
                                            SubLObject relation = (SubLObject)at_admitted.NIL;
                                            relation = cdolist_list_var.first();
                                            while (at_admitted.NIL != cdolist_list_var) {
                                                if (at_admitted.NIL != forts.fort_p(relation)) {
                                                    final SubLObject genl_somethingP = (SubLObject)((at_admitted.NIL != forts.fort_p(relation)) ? SubLObjectFactory.makeBoolean(at_admitted.NIL != genl_predicates.genl_predicates(relation, (SubLObject)at_admitted.UNPROVIDED, (SubLObject)at_admitted.UNPROVIDED) || at_admitted.NIL != genl_predicates.genl_inverses(relation, (SubLObject)at_admitted.UNPROVIDED, (SubLObject)at_admitted.UNPROVIDED)) : at_admitted.NIL);
                                                    final SubLObject _prev_bind_0_$11 = at_vars.$at_reln$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$12 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
                                                    final SubLObject _prev_bind_2_$12 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
                                                    try {
                                                        at_vars.$at_reln$.bind(relation, thread);
                                                        at_vars.$at_search_genl_predsP$.bind((SubLObject)SubLObjectFactory.makeBoolean(at_admitted.NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread) && at_admitted.NIL != genl_somethingP), thread);
                                                        at_vars.$at_search_genl_inversesP$.bind((SubLObject)SubLObjectFactory.makeBoolean(at_admitted.NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread) && at_admitted.NIL != genl_somethingP), thread);
                                                        if (at_admitted.NIL != arg_type.arg_test_okP(relation, fort, argnum, (SubLObject)at_admitted.$kw5$ISA)) {
                                                            isa_candidates = (SubLObject)ConsesLow.cons(relation, isa_candidates);
                                                        }
                                                    }
                                                    finally {
                                                        at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_2_$12, thread);
                                                        at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_$12, thread);
                                                        at_vars.$at_reln$.rebind(_prev_bind_0_$11, thread);
                                                    }
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                relation = cdolist_list_var.first();
                                            }
                                        }
                                        finally {
                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$11, thread);
                                            at_vars.$at_isa_space$.rebind(_prev_bind_0_$10, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_admitted.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                                        }
                                    }
                                }
                                finally {
                                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$10, thread);
                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$9, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_admitted.T, thread);
                                    final SubLObject _values2 = Values.getValuesAsVector();
                                    at_defns.clear_defn_space();
                                    Values.restoreValuesFromVector(_values2);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                                }
                            }
                        }
                        finally {
                            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_4, thread);
                            at_vars.$defn_col_history$.rebind(_prev_bind_2_$11, thread);
                            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_1_$9, thread);
                            at_vars.$defn_fn_history$.rebind(_prev_bind_0_$8, thread);
                        }
                    }
                    if (at_admitted.NIL != genls_okP) {
                        result = isa_candidates;
                    }
                    else {
                        final SubLObject collectionP = fort_types_interface.collectionP(fort);
                        final SubLObject resourcing_p2 = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                        final SubLObject _prev_bind_0_$14 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$13 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)at_admitted.NIL, thread);
                            sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject _prev_bind_0_$15 = at_vars.$at_genls_space$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$14 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                try {
                                    at_vars.$at_genls_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p2, thread);
                                    if (at_admitted.NIL != collectionP) {
                                        sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(at_admitted.$const6$genls), fort, (SubLObject)at_admitted.UNPROVIDED, (SubLObject)at_admitted.UNPROVIDED);
                                        sbhl_marking_methods.sbhl_record_node(at_admitted.$const7$Thing, (SubLObject)at_admitted.UNPROVIDED);
                                    }
                                    SubLObject cdolist_list_var2 = isa_candidates;
                                    SubLObject relation2 = (SubLObject)at_admitted.NIL;
                                    relation2 = cdolist_list_var2.first();
                                    while (at_admitted.NIL != cdolist_list_var2) {
                                        final SubLObject genl_somethingP2 = (SubLObject)((at_admitted.NIL != forts.fort_p(relation2)) ? SubLObjectFactory.makeBoolean(at_admitted.NIL != genl_predicates.genl_predicates(relation2, (SubLObject)at_admitted.UNPROVIDED, (SubLObject)at_admitted.UNPROVIDED) || at_admitted.NIL != genl_predicates.genl_inverses(relation2, (SubLObject)at_admitted.UNPROVIDED, (SubLObject)at_admitted.UNPROVIDED)) : at_admitted.NIL);
                                        final SubLObject _prev_bind_0_$16 = at_vars.$at_reln$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$15 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$13 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
                                        try {
                                            at_vars.$at_reln$.bind(relation2, thread);
                                            at_vars.$at_search_genl_predsP$.bind((SubLObject)SubLObjectFactory.makeBoolean(at_admitted.NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread) && at_admitted.NIL != genl_somethingP2), thread);
                                            at_vars.$at_search_genl_inversesP$.bind((SubLObject)SubLObjectFactory.makeBoolean(at_admitted.NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread) && at_admitted.NIL != genl_somethingP2), thread);
                                            if (at_admitted.NIL != arg_type.arg_test_okP(relation2, fort, argnum, (SubLObject)at_admitted.$kw8$GENLS)) {
                                                result = (SubLObject)ConsesLow.cons(relation2, result);
                                            }
                                        }
                                        finally {
                                            at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_2_$13, thread);
                                            at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_$15, thread);
                                            at_vars.$at_reln$.rebind(_prev_bind_0_$16, thread);
                                        }
                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                        relation2 = cdolist_list_var2.first();
                                    }
                                }
                                finally {
                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$14, thread);
                                    at_vars.$at_genls_space$.rebind(_prev_bind_0_$15, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_admitted.T, thread);
                                    final SubLObject _values3 = Values.getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                    Values.restoreValuesFromVector(_values3);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                                }
                            }
                        }
                        finally {
                            sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$13, thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$14, thread);
                        }
                    }
                }
                finally {
                    at_vars.$at_arg_type$.rebind(_prev_bind_1_$8, thread);
                    at_vars.$at_argnum$.rebind(_prev_bind_0_$7, thread);
                }
            }
            finally {
                at_vars.$at_arg$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 11827L)
    public static SubLObject relations_admitting_fort_as_any_of_args(final SubLObject fort, final SubLObject argnums, SubLObject mt) {
        if (mt == at_admitted.UNPROVIDED) {
            mt = (SubLObject)at_admitted.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert at_admitted.NIL != forts.fort_p(fort) : fort;
        SubLObject result = (SubLObject)at_admitted.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            SubLObject cdolist_list_var = argnums;
            SubLObject argnum = (SubLObject)at_admitted.NIL;
            argnum = cdolist_list_var.first();
            while (at_admitted.NIL != cdolist_list_var) {
                final SubLObject candidate_relations = at_candidate_relations_admitting_fort(fort, (SubLObject)ConsesLow.list(argnum), mt);
                result = ConsesLow.nconc(result, relations_admitting_fort_as_arg(fort, argnum, candidate_relations, (SubLObject)at_admitted.UNPROVIDED));
                cdolist_list_var = cdolist_list_var.rest();
                argnum = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return list_utilities.remove_duplicate_forts(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 12919L)
    public static SubLObject at_candidate_relations_admitting_fort(final SubLObject fort, final SubLObject argnums, SubLObject mt) {
        if (mt == at_admitted.UNPROVIDED) {
            mt = (SubLObject)at_admitted.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert at_admitted.NIL != forts.fort_p(fort) : fort;
        assert at_admitted.NIL != Types.consp(argnums) : argnums;
        SubLObject result = (SubLObject)at_admitted.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            final SubLObject collections_admitting_term_via_defns = at_defns.collections_admitting_term_via_defns(fort);
            final SubLObject _prev_bind_0_$29 = at_admitted.$at_candidate_relations_argnums_table$.currentBinding(thread);
            try {
                at_admitted.$at_candidate_relations_argnums_table$.bind(hash_table_utilities.hash_list_elements(argnums, (SubLObject)at_admitted.UNPROVIDED, (SubLObject)at_admitted.UNPROVIDED, (SubLObject)at_admitted.UNPROVIDED), thread);
                final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                final SubLObject _prev_bind_0_$30 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                final SubLObject _prev_bind_1_$31 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)at_admitted.NIL, thread);
                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject _prev_bind_0_$31 = at_admitted.$at_candidate_relations_sbhl_space$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$32 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                        try {
                            at_admitted.$at_candidate_relations_sbhl_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                            isa.sbhl_record_all_isa(fort, (SubLObject)at_admitted.UNPROVIDED, (SubLObject)at_admitted.UNPROVIDED);
                            SubLObject cdolist_list_var = collections_admitting_term_via_defns;
                            SubLObject col = (SubLObject)at_admitted.NIL;
                            col = cdolist_list_var.first();
                            while (at_admitted.NIL != cdolist_list_var) {
                                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(at_admitted.$const6$genls), col, (SubLObject)at_admitted.UNPROVIDED, (SubLObject)at_admitted.UNPROVIDED);
                                cdolist_list_var = cdolist_list_var.rest();
                                col = cdolist_list_var.first();
                            }
                            final SubLObject _prev_bind_0_$32 = at_admitted.$at_candidate_relations_table$.currentBinding(thread);
                            try {
                                at_admitted.$at_candidate_relations_table$.bind(Hashtables.make_hash_table(Sequences.length(argnums), (SubLObject)at_admitted.UNPROVIDED, (SubLObject)at_admitted.UNPROVIDED), thread);
                                final SubLObject at_cr_hashing_function = (SubLObject)((at_admitted.NIL != list_utilities.singletonP(argnums)) ? at_admitted.$sym11$AT_CR_HASH_RELATIONS : at_admitted.$sym12$AT_CR_HASH_RELATIONS_BY_ARGNUM);
                                final SubLObject _prev_bind_0_$33 = at_admitted.$at_cr_arg_isa_pred$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$33 = at_admitted.$at_cr_argnum$.currentBinding(thread);
                                try {
                                    at_admitted.$at_cr_arg_isa_pred$.bind((SubLObject)((at_admitted.NIL != list_utilities.singletonP(argnums)) ? kb_accessors.arg_isa_pred(argnums.first(), (SubLObject)at_admitted.UNPROVIDED, (SubLObject)at_admitted.UNPROVIDED) : at_admitted.NIL), thread);
                                    at_admitted.$at_cr_argnum$.bind((SubLObject)((at_admitted.NIL != list_utilities.singletonP(argnums)) ? argnums.first() : at_admitted.NIL), thread);
                                    if (at_admitted.$at_candidate_relations_sbhl_space$.getDynamicValue(thread).isHashtable()) {
                                        final SubLObject cdohash_table = at_admitted.$at_candidate_relations_sbhl_space$.getDynamicValue(thread);
                                        SubLObject node = (SubLObject)at_admitted.NIL;
                                        SubLObject tag = (SubLObject)at_admitted.NIL;
                                        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                                        try {
                                            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                                                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                                                node = Hashtables.getEntryKey(cdohash_entry);
                                                tag = Hashtables.getEntryValue(cdohash_entry);
                                                Functions.funcall(at_cr_hashing_function, node);
                                            }
                                        }
                                        finally {
                                            Hashtables.releaseEntrySetIterator(cdohash_iterator);
                                        }
                                    }
                                    else {
                                        sbhl_paranoia.sbhl_error((SubLObject)at_admitted.THREE_INTEGER, (SubLObject)at_admitted.$str13$no_mapping_method_defiend_for_sbh, at_admitted.$at_candidate_relations_sbhl_space$.getDynamicValue(thread), (SubLObject)at_admitted.UNPROVIDED, (SubLObject)at_admitted.UNPROVIDED, (SubLObject)at_admitted.UNPROVIDED, (SubLObject)at_admitted.UNPROVIDED);
                                    }
                                    final SubLObject result_table = Hashtables.make_hash_table(at_admitted.$at_candidate_relations_max$.getGlobalValue(), (SubLObject)at_admitted.UNPROVIDED, (SubLObject)at_admitted.UNPROVIDED);
                                    final SubLObject cdohash_table2 = at_admitted.$at_candidate_relations_table$.getDynamicValue(thread);
                                    SubLObject argnum = (SubLObject)at_admitted.NIL;
                                    SubLObject candidates = (SubLObject)at_admitted.NIL;
                                    final Iterator cdohash_iterator2 = Hashtables.getEntrySetIterator(cdohash_table2);
                                    try {
                                        while (Hashtables.iteratorHasNext(cdohash_iterator2)) {
                                            final Map.Entry cdohash_entry2 = Hashtables.iteratorNextEntry(cdohash_iterator2);
                                            argnum = Hashtables.getEntryKey(cdohash_entry2);
                                            SubLObject cdolist_list_var2;
                                            candidates = (cdolist_list_var2 = Hashtables.getEntryValue(cdohash_entry2));
                                            SubLObject candidate = (SubLObject)at_admitted.NIL;
                                            candidate = cdolist_list_var2.first();
                                            while (at_admitted.NIL != cdolist_list_var2) {
                                                if (at_admitted.NIL == Hashtables.gethash(candidate, result_table, (SubLObject)at_admitted.UNPROVIDED)) {
                                                    Hashtables.sethash(candidate, result_table, (SubLObject)at_admitted.T);
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                candidate = cdolist_list_var2.first();
                                            }
                                        }
                                    }
                                    finally {
                                        Hashtables.releaseEntrySetIterator(cdohash_iterator2);
                                    }
                                    result = hash_table_utilities.hash_table_keys(result_table);
                                }
                                finally {
                                    at_admitted.$at_cr_argnum$.rebind(_prev_bind_1_$33, thread);
                                    at_admitted.$at_cr_arg_isa_pred$.rebind(_prev_bind_0_$33, thread);
                                }
                            }
                            finally {
                                at_admitted.$at_candidate_relations_table$.rebind(_prev_bind_0_$32, thread);
                            }
                        }
                        finally {
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$32, thread);
                            at_admitted.$at_candidate_relations_sbhl_space$.rebind(_prev_bind_0_$31, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_admitted.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$31, thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$30, thread);
                }
            }
            finally {
                at_admitted.$at_candidate_relations_argnums_table$.rebind(_prev_bind_0_$29, thread);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 14928L)
    public static SubLObject at_cr_hash_relations(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pred_var = at_admitted.$at_cr_arg_isa_pred$.getDynamicValue(thread);
        if (at_admitted.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, (SubLObject)at_admitted.TWO_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, (SubLObject)at_admitted.TWO_INTEGER, pred_var);
            SubLObject done_var = (SubLObject)at_admitted.NIL;
            final SubLObject token_var = (SubLObject)at_admitted.NIL;
            while (at_admitted.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (at_admitted.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)at_admitted.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)at_admitted.$kw14$GAF, (SubLObject)at_admitted.$kw15$TRUE, (SubLObject)at_admitted.NIL);
                        SubLObject done_var_$38 = (SubLObject)at_admitted.NIL;
                        final SubLObject token_var_$39 = (SubLObject)at_admitted.NIL;
                        while (at_admitted.NIL == done_var_$38) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$39);
                            final SubLObject valid_$40 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$39.eql(assertion));
                            if (at_admitted.NIL != valid_$40) {
                                final SubLObject relation = assertions_high.gaf_arg1(assertion);
                                hash_table_utilities.push_hash(at_admitted.$at_cr_argnum$.getDynamicValue(thread), relation, at_admitted.$at_candidate_relations_table$.getDynamicValue(thread));
                            }
                            done_var_$38 = (SubLObject)SubLObjectFactory.makeBoolean(at_admitted.NIL == valid_$40);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_admitted.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (at_admitted.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(at_admitted.NIL == valid);
            }
        }
        pred_var = at_admitted.$const16$argsIsa;
        if (at_admitted.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, (SubLObject)at_admitted.TWO_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, (SubLObject)at_admitted.TWO_INTEGER, pred_var);
            SubLObject done_var = (SubLObject)at_admitted.NIL;
            final SubLObject token_var = (SubLObject)at_admitted.NIL;
            while (at_admitted.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (at_admitted.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)at_admitted.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)at_admitted.$kw14$GAF, (SubLObject)at_admitted.$kw15$TRUE, (SubLObject)at_admitted.NIL);
                        SubLObject done_var_$39 = (SubLObject)at_admitted.NIL;
                        final SubLObject token_var_$40 = (SubLObject)at_admitted.NIL;
                        while (at_admitted.NIL == done_var_$39) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$40);
                            final SubLObject valid_$41 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$40.eql(assertion));
                            if (at_admitted.NIL != valid_$41) {
                                final SubLObject relation = assertions_high.gaf_arg1(assertion);
                                final SubLObject arity_max = arity.arity_max(relation);
                                if (arity_max.isNumber() && at_admitted.$at_cr_argnum$.getDynamicValue(thread).numLE(arity_max)) {
                                    hash_table_utilities.push_hash(at_admitted.$at_cr_argnum$.getDynamicValue(thread), relation, at_admitted.$at_candidate_relations_table$.getDynamicValue(thread));
                                }
                            }
                            done_var_$39 = (SubLObject)SubLObjectFactory.makeBoolean(at_admitted.NIL == valid_$41);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_admitted.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            if (at_admitted.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(at_admitted.NIL == valid);
            }
        }
        return (SubLObject)at_admitted.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 15519L)
    public static SubLObject at_cr_hash_relations_by_argnum(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pred_var = at_admitted.$const17$argIsa;
        if (at_admitted.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, (SubLObject)at_admitted.THREE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, (SubLObject)at_admitted.THREE_INTEGER, pred_var);
            SubLObject done_var = (SubLObject)at_admitted.NIL;
            final SubLObject token_var = (SubLObject)at_admitted.NIL;
            while (at_admitted.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (at_admitted.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)at_admitted.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)at_admitted.$kw14$GAF, (SubLObject)at_admitted.$kw15$TRUE, (SubLObject)at_admitted.NIL);
                        SubLObject done_var_$44 = (SubLObject)at_admitted.NIL;
                        final SubLObject token_var_$45 = (SubLObject)at_admitted.NIL;
                        while (at_admitted.NIL == done_var_$44) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$45);
                            final SubLObject valid_$46 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$45.eql(assertion));
                            if (at_admitted.NIL != valid_$46) {
                                final SubLObject relation = assertions_high.gaf_arg1(assertion);
                                final SubLObject argnum = assertions_high.gaf_arg2(assertion);
                                if (at_admitted.NIL != Hashtables.gethash(argnum, at_admitted.$at_candidate_relations_argnums_table$.getDynamicValue(thread), (SubLObject)at_admitted.UNPROVIDED)) {
                                    hash_table_utilities.push_hash(argnum, relation, at_admitted.$at_candidate_relations_table$.getDynamicValue(thread));
                                }
                            }
                            done_var_$44 = (SubLObject)SubLObjectFactory.makeBoolean(at_admitted.NIL == valid_$46);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_admitted.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (at_admitted.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(at_admitted.NIL == valid);
            }
        }
        pred_var = at_admitted.$const16$argsIsa;
        if (at_admitted.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, (SubLObject)at_admitted.TWO_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, (SubLObject)at_admitted.TWO_INTEGER, pred_var);
            SubLObject done_var = (SubLObject)at_admitted.NIL;
            final SubLObject token_var = (SubLObject)at_admitted.NIL;
            while (at_admitted.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (at_admitted.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)at_admitted.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)at_admitted.$kw14$GAF, (SubLObject)at_admitted.$kw15$TRUE, (SubLObject)at_admitted.NIL);
                        SubLObject done_var_$45 = (SubLObject)at_admitted.NIL;
                        final SubLObject token_var_$46 = (SubLObject)at_admitted.NIL;
                        while (at_admitted.NIL == done_var_$45) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$46);
                            final SubLObject valid_$47 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$46.eql(assertion));
                            if (at_admitted.NIL != valid_$47) {
                                final SubLObject relation = assertions_high.gaf_arg1(assertion);
                                final SubLObject cdohash_table = at_admitted.$at_candidate_relations_argnums_table$.getDynamicValue(thread);
                                SubLObject argnum2 = (SubLObject)at_admitted.NIL;
                                SubLObject ignore = (SubLObject)at_admitted.NIL;
                                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                                try {
                                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                                        argnum2 = Hashtables.getEntryKey(cdohash_entry);
                                        ignore = Hashtables.getEntryValue(cdohash_entry);
                                        final SubLObject arity_max = arity.arity_max(relation);
                                        if (arity_max.isNumber() && argnum2.numLE(arity_max)) {
                                            hash_table_utilities.push_hash(argnum2, relation, at_admitted.$at_candidate_relations_table$.getDynamicValue(thread));
                                        }
                                    }
                                }
                                finally {
                                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                                }
                            }
                            done_var_$45 = (SubLObject)SubLObjectFactory.makeBoolean(at_admitted.NIL == valid_$47);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_admitted.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            if (at_admitted.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(at_admitted.NIL == valid);
            }
        }
        return (SubLObject)at_admitted.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 16268L)
    public static SubLObject at_cr_all_arg_isa_cachedP(final SubLObject relation, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_boolean = (SubLObject)at_admitted.NIL;
        final SubLObject _prev_bind_0 = at_admitted.$at_cr_mapping_result$.currentBinding(thread);
        try {
            at_admitted.$at_cr_mapping_result$.bind((SubLObject)at_admitted.T, thread);
            final SubLObject arg_isa_pred = kb_accessors.arg_isa_pred(argnum, (SubLObject)at_admitted.UNPROVIDED, (SubLObject)at_admitted.UNPROVIDED);
            kb_mapping.map_gaf_arg_index((SubLObject)at_admitted.$sym18$AT_CR_ARGISA_COL_SEARCHED_, relation, (SubLObject)at_admitted.ONE_INTEGER, arg_isa_pred, (SubLObject)at_admitted.$kw15$TRUE, (SubLObject)at_admitted.UNPROVIDED);
            if (at_admitted.NIL != at_admitted.$at_cr_mapping_result$.getDynamicValue(thread)) {
                kb_mapping.map_gaf_arg_index((SubLObject)at_admitted.$sym18$AT_CR_ARGISA_COL_SEARCHED_, relation, (SubLObject)at_admitted.ONE_INTEGER, at_admitted.$const16$argsIsa, (SubLObject)at_admitted.$kw15$TRUE, (SubLObject)at_admitted.UNPROVIDED);
            }
            v_boolean = at_admitted.$at_cr_mapping_result$.getDynamicValue(thread);
        }
        finally {
            at_admitted.$at_cr_mapping_result$.rebind(_prev_bind_0, thread);
        }
        return v_boolean;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 16775L)
    public static SubLObject at_cr_argisa_col_searchedP(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject col = assertions_high.gaf_arg2(assertion);
        if (at_admitted.NIL != forts.fort_p(col) && at_admitted.NIL == sbhl_marking_methods.sbhl_recorded_node_p(col, at_admitted.$at_candidate_relations_sbhl_space$.getDynamicValue(thread))) {
            at_admitted.$at_cr_mapping_result$.setDynamicValue((SubLObject)at_admitted.NIL, thread);
            utilities_macros.mapping_finished();
        }
        return (SubLObject)at_admitted.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 17811L)
    public static SubLObject inference_relations_admitting_fort_as_arg(final SubLObject fort, final SubLObject argnum, SubLObject mt) {
        if (mt == at_admitted.UNPROVIDED) {
            mt = (SubLObject)at_admitted.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert at_admitted.NIL != forts.fort_p(fort) : fort;
        SubLObject result = (SubLObject)at_admitted.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            final SubLObject collections_admitting_term_via_defns = at_defns.collections_admitting_term_via_defns(fort);
            final SubLObject _prev_bind_0_$50 = at_admitted.$ira_table$.currentBinding(thread);
            final SubLObject _prev_bind_1_$51 = at_admitted.$ira_argnum$.currentBinding(thread);
            try {
                at_admitted.$ira_table$.bind(Hashtables.make_hash_table(at_admitted.$ira_relations_estimate$.getDynamicValue(thread), (SubLObject)at_admitted.UNPROVIDED, (SubLObject)at_admitted.UNPROVIDED), thread);
                at_admitted.$ira_argnum$.bind(argnum, thread);
                final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                final SubLObject _prev_bind_0_$51 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                final SubLObject _prev_bind_1_$52 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)at_admitted.NIL, thread);
                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject _prev_bind_0_$52 = at_admitted.$ira_isa_sbhl_space$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$53 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                        try {
                            at_admitted.$ira_isa_sbhl_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                            isa.sbhl_record_all_isa(fort, (SubLObject)at_admitted.UNPROVIDED, (SubLObject)at_admitted.UNPROVIDED);
                            SubLObject cdolist_list_var = collections_admitting_term_via_defns;
                            SubLObject col = (SubLObject)at_admitted.NIL;
                            col = cdolist_list_var.first();
                            while (at_admitted.NIL != cdolist_list_var) {
                                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(at_admitted.$const6$genls), col, (SubLObject)at_admitted.UNPROVIDED, (SubLObject)at_admitted.UNPROVIDED);
                                cdolist_list_var = cdolist_list_var.rest();
                                col = cdolist_list_var.first();
                            }
                            final SubLObject resourcing_p_$56 = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                            final SubLObject _prev_bind_0_$53 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$54 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)at_admitted.NIL, thread);
                                sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                try {
                                    final SubLObject _prev_bind_0_$54 = at_admitted.$ira_genl_sbhl_space$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$55 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                    try {
                                        at_admitted.$ira_genl_sbhl_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p_$56, thread);
                                        sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(at_admitted.$const6$genls), fort, (SubLObject)at_admitted.UNPROVIDED, (SubLObject)at_admitted.UNPROVIDED);
                                        inference_relations_admitting_term_as_arg_int(argnum);
                                    }
                                    finally {
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$55, thread);
                                        at_admitted.$ira_genl_sbhl_space$.rebind(_prev_bind_0_$54, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$55 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_admitted.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$55, thread);
                                    }
                                }
                            }
                            finally {
                                sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$54, thread);
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$53, thread);
                            }
                        }
                        finally {
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$53, thread);
                            at_admitted.$ira_isa_sbhl_space$.rebind(_prev_bind_0_$52, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$56 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_admitted.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$56, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$52, thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$51, thread);
                }
                result = hash_table_utilities.hash_table_keys(at_admitted.$ira_table$.getDynamicValue(thread));
            }
            finally {
                at_admitted.$ira_argnum$.rebind(_prev_bind_1_$51, thread);
                at_admitted.$ira_table$.rebind(_prev_bind_0_$50, thread);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 18925L)
    public static SubLObject inference_relations_admitting_naut_as_arg(final SubLObject naut, final SubLObject argnum, SubLObject mt) {
        if (mt == at_admitted.UNPROVIDED) {
            mt = (SubLObject)at_admitted.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert at_admitted.NIL != term.nautP(naut, (SubLObject)at_admitted.UNPROVIDED) : naut;
        SubLObject result = (SubLObject)at_admitted.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            final SubLObject function = cycl_utilities.nat_functor(naut);
            final SubLObject result_isas = kb_accessors.result_isa(function, mt);
            final SubLObject result_isa_args = kb_accessors.result_isa_args(function, mt);
            final SubLObject result_genls = kb_accessors.result_genl(function, mt, (SubLObject)at_admitted.UNPROVIDED);
            final SubLObject result_genl_args = kb_accessors.result_genl_args(function, mt);
            final SubLObject collections_admitting_term_via_defns = at_defns.collections_admitting_term_via_defns(naut);
            final SubLObject _prev_bind_0_$63 = at_admitted.$ira_table$.currentBinding(thread);
            final SubLObject _prev_bind_1_$64 = at_admitted.$ira_argnum$.currentBinding(thread);
            try {
                at_admitted.$ira_table$.bind(Hashtables.make_hash_table(at_admitted.$ira_relations_estimate$.getDynamicValue(thread), (SubLObject)at_admitted.UNPROVIDED, (SubLObject)at_admitted.UNPROVIDED), thread);
                at_admitted.$ira_argnum$.bind(argnum, thread);
                final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                final SubLObject _prev_bind_0_$64 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                final SubLObject _prev_bind_1_$65 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)at_admitted.NIL, thread);
                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject _prev_bind_0_$65 = at_admitted.$ira_isa_sbhl_space$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$66 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                        try {
                            at_admitted.$ira_isa_sbhl_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                            SubLObject cdolist_list_var = result_isas;
                            SubLObject v_isa = (SubLObject)at_admitted.NIL;
                            v_isa = cdolist_list_var.first();
                            while (at_admitted.NIL != cdolist_list_var) {
                                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(at_admitted.$const6$genls), v_isa, (SubLObject)at_admitted.UNPROVIDED, (SubLObject)at_admitted.UNPROVIDED);
                                cdolist_list_var = cdolist_list_var.rest();
                                v_isa = cdolist_list_var.first();
                            }
                            cdolist_list_var = result_isa_args;
                            v_isa = (SubLObject)at_admitted.NIL;
                            v_isa = cdolist_list_var.first();
                            while (at_admitted.NIL != cdolist_list_var) {
                                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(at_admitted.$const6$genls), v_isa, (SubLObject)at_admitted.UNPROVIDED, (SubLObject)at_admitted.UNPROVIDED);
                                cdolist_list_var = cdolist_list_var.rest();
                                v_isa = cdolist_list_var.first();
                            }
                            cdolist_list_var = collections_admitting_term_via_defns;
                            SubLObject col = (SubLObject)at_admitted.NIL;
                            col = cdolist_list_var.first();
                            while (at_admitted.NIL != cdolist_list_var) {
                                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(at_admitted.$const6$genls), col, (SubLObject)at_admitted.UNPROVIDED, (SubLObject)at_admitted.UNPROVIDED);
                                cdolist_list_var = cdolist_list_var.rest();
                                col = cdolist_list_var.first();
                            }
                            final SubLObject resourcing_p_$69 = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                            final SubLObject _prev_bind_0_$66 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$67 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)at_admitted.NIL, thread);
                                sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                try {
                                    final SubLObject _prev_bind_0_$67 = at_admitted.$ira_genl_sbhl_space$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$68 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                    try {
                                        at_admitted.$ira_genl_sbhl_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p_$69, thread);
                                        SubLObject cdolist_list_var2 = result_genls;
                                        SubLObject genl = (SubLObject)at_admitted.NIL;
                                        genl = cdolist_list_var2.first();
                                        while (at_admitted.NIL != cdolist_list_var2) {
                                            sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(at_admitted.$const6$genls), genl, (SubLObject)at_admitted.UNPROVIDED, (SubLObject)at_admitted.UNPROVIDED);
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            genl = cdolist_list_var2.first();
                                        }
                                        cdolist_list_var2 = result_genl_args;
                                        genl = (SubLObject)at_admitted.NIL;
                                        genl = cdolist_list_var2.first();
                                        while (at_admitted.NIL != cdolist_list_var2) {
                                            sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(at_admitted.$const6$genls), genl, (SubLObject)at_admitted.UNPROVIDED, (SubLObject)at_admitted.UNPROVIDED);
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            genl = cdolist_list_var2.first();
                                        }
                                        inference_relations_admitting_term_as_arg_int(argnum);
                                    }
                                    finally {
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$68, thread);
                                        at_admitted.$ira_genl_sbhl_space$.rebind(_prev_bind_0_$67, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$68 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_admitted.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$68, thread);
                                    }
                                }
                            }
                            finally {
                                sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$67, thread);
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$66, thread);
                            }
                        }
                        finally {
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$66, thread);
                            at_admitted.$ira_isa_sbhl_space$.rebind(_prev_bind_0_$65, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$69 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_admitted.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$69, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$65, thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$64, thread);
                }
                result = hash_table_utilities.hash_table_keys(at_admitted.$ira_table$.getDynamicValue(thread));
            }
            finally {
                at_admitted.$ira_argnum$.rebind(_prev_bind_1_$64, thread);
                at_admitted.$ira_table$.rebind(_prev_bind_0_$63, thread);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 20620L)
    public static SubLObject inference_relations_admitting_term_as_arg_int(final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = at_admitted.$ira_arg_isa_pred$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_admitted.$ira_arg_genl_pred$.currentBinding(thread);
        try {
            at_admitted.$ira_arg_isa_pred$.bind(kb_accessors.arg_isa_pred(argnum, (SubLObject)at_admitted.UNPROVIDED, (SubLObject)at_admitted.UNPROVIDED), thread);
            at_admitted.$ira_arg_genl_pred$.bind(kb_accessors.arg_genl_pred(argnum, (SubLObject)at_admitted.UNPROVIDED, (SubLObject)at_admitted.UNPROVIDED), thread);
            if (at_admitted.NIL != forts.fort_p(at_admitted.$ira_arg_isa_pred$.getDynamicValue(thread))) {
                final SubLObject cdohash_table = at_admitted.$ira_isa_sbhl_space$.getDynamicValue(thread);
                SubLObject isa_col = (SubLObject)at_admitted.NIL;
                SubLObject marking = (SubLObject)at_admitted.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        isa_col = Hashtables.getEntryKey(cdohash_entry);
                        marking = Hashtables.getEntryValue(cdohash_entry);
                        ira_isa_hash_relations(isa_col);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
            if (at_admitted.NIL != forts.fort_p(at_admitted.$ira_arg_genl_pred$.getDynamicValue(thread))) {
                final SubLObject cdohash_table = at_admitted.$ira_genl_sbhl_space$.getDynamicValue(thread);
                SubLObject genl_col = (SubLObject)at_admitted.NIL;
                SubLObject marking = (SubLObject)at_admitted.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        genl_col = Hashtables.getEntryKey(cdohash_entry);
                        marking = Hashtables.getEntryValue(cdohash_entry);
                        ira_genl_hash_relations(genl_col);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
            SubLObject cdohash_table = at_admitted.$ira_table$.getDynamicValue(thread);
            SubLObject relation = (SubLObject)at_admitted.NIL;
            SubLObject v_boolean = (SubLObject)at_admitted.NIL;
            Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
            try {
                while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    relation = Hashtables.getEntryKey(cdohash_entry);
                    v_boolean = Hashtables.getEntryValue(cdohash_entry);
                    if (at_admitted.NIL == ira_all_arg_isa_cachedP(relation)) {
                        Hashtables.remhash(relation, at_admitted.$ira_table$.getDynamicValue(thread));
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(cdohash_iterator);
            }
            cdohash_table = at_admitted.$ira_table$.getDynamicValue(thread);
            relation = (SubLObject)at_admitted.NIL;
            v_boolean = (SubLObject)at_admitted.NIL;
            cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
            try {
                while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    relation = Hashtables.getEntryKey(cdohash_entry);
                    v_boolean = Hashtables.getEntryValue(cdohash_entry);
                    if (at_admitted.NIL == ira_all_arg_genl_cachedP(relation)) {
                        Hashtables.remhash(relation, at_admitted.$ira_table$.getDynamicValue(thread));
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(cdohash_iterator);
            }
        }
        finally {
            at_admitted.$ira_arg_genl_pred$.rebind(_prev_bind_2, thread);
            at_admitted.$ira_arg_isa_pred$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)at_admitted.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 21778L)
    public static SubLObject ira_isa_hash_relations(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pred_var = at_admitted.$ira_arg_isa_pred$.getDynamicValue(thread);
        if (at_admitted.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(col, (SubLObject)at_admitted.TWO_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(col, (SubLObject)at_admitted.TWO_INTEGER, pred_var);
            SubLObject done_var = (SubLObject)at_admitted.NIL;
            final SubLObject token_var = (SubLObject)at_admitted.NIL;
            while (at_admitted.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (at_admitted.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)at_admitted.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)at_admitted.$kw14$GAF, (SubLObject)at_admitted.$kw15$TRUE, (SubLObject)at_admitted.NIL);
                        SubLObject done_var_$76 = (SubLObject)at_admitted.NIL;
                        final SubLObject token_var_$77 = (SubLObject)at_admitted.NIL;
                        while (at_admitted.NIL == done_var_$76) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$77);
                            final SubLObject valid_$78 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$77.eql(assertion));
                            if (at_admitted.NIL != valid_$78) {
                                final SubLObject relation = assertions_high.gaf_arg1(assertion);
                                Hashtables.sethash(relation, at_admitted.$ira_table$.getDynamicValue(thread), (SubLObject)at_admitted.T);
                            }
                            done_var_$76 = (SubLObject)SubLObjectFactory.makeBoolean(at_admitted.NIL == valid_$78);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_admitted.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (at_admitted.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(at_admitted.NIL == valid);
            }
        }
        pred_var = at_admitted.$const16$argsIsa;
        if (at_admitted.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(col, (SubLObject)at_admitted.TWO_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(col, (SubLObject)at_admitted.TWO_INTEGER, pred_var);
            SubLObject done_var = (SubLObject)at_admitted.NIL;
            final SubLObject token_var = (SubLObject)at_admitted.NIL;
            while (at_admitted.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (at_admitted.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)at_admitted.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)at_admitted.$kw14$GAF, (SubLObject)at_admitted.$kw15$TRUE, (SubLObject)at_admitted.NIL);
                        SubLObject done_var_$77 = (SubLObject)at_admitted.NIL;
                        final SubLObject token_var_$78 = (SubLObject)at_admitted.NIL;
                        while (at_admitted.NIL == done_var_$77) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$78);
                            final SubLObject valid_$79 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$78.eql(assertion));
                            if (at_admitted.NIL != valid_$79) {
                                final SubLObject relation = assertions_high.gaf_arg1(assertion);
                                final SubLObject arity_max = arity.arity_max(relation);
                                if (arity_max.isNumber() && at_admitted.$ira_argnum$.getDynamicValue(thread).numLE(arity_max)) {
                                    Hashtables.sethash(relation, at_admitted.$ira_table$.getDynamicValue(thread), (SubLObject)at_admitted.T);
                                }
                            }
                            done_var_$77 = (SubLObject)SubLObjectFactory.makeBoolean(at_admitted.NIL == valid_$79);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_admitted.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            if (at_admitted.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(at_admitted.NIL == valid);
            }
        }
        return (SubLObject)at_admitted.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 22430L)
    public static SubLObject ira_all_arg_isa_cachedP(final SubLObject relation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_boolean = (SubLObject)at_admitted.NIL;
        final SubLObject _prev_bind_0 = at_admitted.$ira_mapping_result$.currentBinding(thread);
        try {
            at_admitted.$ira_mapping_result$.bind((SubLObject)at_admitted.T, thread);
            kb_mapping.map_gaf_arg_index((SubLObject)at_admitted.$sym20$IRA_ARGISA_COL_SEARCHED_, relation, (SubLObject)at_admitted.ONE_INTEGER, at_admitted.$ira_arg_isa_pred$.getDynamicValue(thread), (SubLObject)at_admitted.$kw15$TRUE, (SubLObject)at_admitted.UNPROVIDED);
            if (at_admitted.NIL != at_admitted.$ira_mapping_result$.getDynamicValue(thread)) {
                kb_mapping.map_gaf_arg_index((SubLObject)at_admitted.$sym20$IRA_ARGISA_COL_SEARCHED_, relation, (SubLObject)at_admitted.ONE_INTEGER, at_admitted.$const16$argsIsa, (SubLObject)at_admitted.$kw15$TRUE, (SubLObject)at_admitted.UNPROVIDED);
            }
            v_boolean = at_admitted.$ira_mapping_result$.getDynamicValue(thread);
        }
        finally {
            at_admitted.$ira_mapping_result$.rebind(_prev_bind_0, thread);
        }
        return v_boolean;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 22894L)
    public static SubLObject ira_argisa_col_searchedP(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject col = assertions_high.gaf_arg2(assertion);
        if (at_admitted.NIL != forts.fort_p(col) && at_admitted.NIL == sbhl_marking_methods.sbhl_recorded_node_p(col, at_admitted.$ira_isa_sbhl_space$.getDynamicValue(thread))) {
            at_admitted.$ira_mapping_result$.setDynamicValue((SubLObject)at_admitted.NIL, thread);
            utilities_macros.mapping_finished();
        }
        return (SubLObject)at_admitted.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 23149L)
    public static SubLObject ira_genl_hash_relations(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pred_var = at_admitted.$ira_arg_genl_pred$.getDynamicValue(thread);
        if (at_admitted.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, (SubLObject)at_admitted.TWO_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, (SubLObject)at_admitted.TWO_INTEGER, pred_var);
            SubLObject done_var = (SubLObject)at_admitted.NIL;
            final SubLObject token_var = (SubLObject)at_admitted.NIL;
            while (at_admitted.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (at_admitted.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)at_admitted.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)at_admitted.$kw14$GAF, (SubLObject)at_admitted.$kw15$TRUE, (SubLObject)at_admitted.NIL);
                        SubLObject done_var_$82 = (SubLObject)at_admitted.NIL;
                        final SubLObject token_var_$83 = (SubLObject)at_admitted.NIL;
                        while (at_admitted.NIL == done_var_$82) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$83);
                            final SubLObject valid_$84 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$83.eql(assertion));
                            if (at_admitted.NIL != valid_$84) {
                                final SubLObject relation = assertions_high.gaf_arg1(assertion);
                                Hashtables.sethash(relation, at_admitted.$ira_table$.getDynamicValue(thread), (SubLObject)at_admitted.T);
                            }
                            done_var_$82 = (SubLObject)SubLObjectFactory.makeBoolean(at_admitted.NIL == valid_$84);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_admitted.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (at_admitted.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(at_admitted.NIL == valid);
            }
        }
        pred_var = at_admitted.$const21$argsGenl;
        if (at_admitted.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, (SubLObject)at_admitted.TWO_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, (SubLObject)at_admitted.TWO_INTEGER, pred_var);
            SubLObject done_var = (SubLObject)at_admitted.NIL;
            final SubLObject token_var = (SubLObject)at_admitted.NIL;
            while (at_admitted.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (at_admitted.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)at_admitted.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)at_admitted.$kw14$GAF, (SubLObject)at_admitted.$kw15$TRUE, (SubLObject)at_admitted.NIL);
                        SubLObject done_var_$83 = (SubLObject)at_admitted.NIL;
                        final SubLObject token_var_$84 = (SubLObject)at_admitted.NIL;
                        while (at_admitted.NIL == done_var_$83) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$84);
                            final SubLObject valid_$85 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$84.eql(assertion));
                            if (at_admitted.NIL != valid_$85) {
                                final SubLObject relation = assertions_high.gaf_arg1(assertion);
                                final SubLObject arity_max = arity.arity_max(relation);
                                if (arity_max.isNumber() && at_admitted.$ira_argnum$.getDynamicValue(thread).numLE(arity_max)) {
                                    Hashtables.sethash(relation, at_admitted.$ira_table$.getDynamicValue(thread), (SubLObject)at_admitted.T);
                                }
                            }
                            done_var_$83 = (SubLObject)SubLObjectFactory.makeBoolean(at_admitted.NIL == valid_$85);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_admitted.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            if (at_admitted.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(at_admitted.NIL == valid);
            }
        }
        return (SubLObject)at_admitted.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 23902L)
    public static SubLObject ira_all_arg_genl_cachedP(final SubLObject relation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_boolean = (SubLObject)at_admitted.NIL;
        final SubLObject _prev_bind_0 = at_admitted.$ira_mapping_result$.currentBinding(thread);
        try {
            at_admitted.$ira_mapping_result$.bind((SubLObject)at_admitted.T, thread);
            kb_mapping.map_gaf_arg_index((SubLObject)at_admitted.$sym22$IRA_ARGGENL_COL_SEARCHED_, relation, (SubLObject)at_admitted.ONE_INTEGER, at_admitted.$ira_arg_genl_pred$.getDynamicValue(thread), (SubLObject)at_admitted.$kw15$TRUE, (SubLObject)at_admitted.UNPROVIDED);
            if (at_admitted.NIL != at_admitted.$ira_mapping_result$.getDynamicValue(thread)) {
                kb_mapping.map_gaf_arg_index((SubLObject)at_admitted.$sym22$IRA_ARGGENL_COL_SEARCHED_, relation, (SubLObject)at_admitted.ONE_INTEGER, at_admitted.$const21$argsGenl, (SubLObject)at_admitted.$kw15$TRUE, (SubLObject)at_admitted.UNPROVIDED);
            }
            v_boolean = at_admitted.$ira_mapping_result$.getDynamicValue(thread);
        }
        finally {
            at_admitted.$ira_mapping_result$.rebind(_prev_bind_0, thread);
        }
        return v_boolean;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-admitted.lisp", position = 24372L)
    public static SubLObject ira_arggenl_col_searchedP(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject col = assertions_high.gaf_arg2(assertion);
        if (at_admitted.NIL != forts.fort_p(col) && at_admitted.NIL == sbhl_marking_methods.sbhl_recorded_node_p(col, at_admitted.$ira_genl_sbhl_space$.getDynamicValue(thread))) {
            at_admitted.$ira_mapping_result$.setDynamicValue((SubLObject)at_admitted.NIL, thread);
            utilities_macros.mapping_finished();
        }
        return (SubLObject)at_admitted.NIL;
    }
    
    public static SubLObject declare_at_admitted_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_admitted", "admitted_argumentP_internal", "ADMITTED-ARGUMENT?-INTERNAL", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_admitted", "admitted_argumentP", "ADMITTED-ARGUMENT?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_admitted", "admitted_argument_intP", "ADMITTED-ARGUMENT-INT?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_admitted", "why_not_admitted_argument", "WHY-NOT-ADMITTED-ARGUMENT", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_admitted", "explanation_of_why_not_admitted_argument", "EXPLANATION-OF-WHY-NOT-ADMITTED-ARGUMENT", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_admitted", "admitted_formulaP", "ADMITTED-FORMULA?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_admitted", "admitted_sentenceP", "ADMITTED-SENTENCE?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_admitted", "admitted_sentence_wrt_asent_arg_constraintsP", "ADMITTED-SENTENCE-WRT-ASENT-ARG-CONSTRAINTS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_admitted", "admitted_atomic_sentence_wrt_arg_constraintsP", "ADMITTED-ATOMIC-SENTENCE-WRT-ARG-CONSTRAINTS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_admitted", "why_not_admitted_atomic_sentence_wrt_arg_constraints", "WHY-NOT-ADMITTED-ATOMIC-SENTENCE-WRT-ARG-CONSTRAINTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_admitted", "why_not_admitted_sentence_wrt_asent_arg_constraints", "WHY-NOT-ADMITTED-SENTENCE-WRT-ASENT-ARG-CONSTRAINTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_admitted", "explanation_of_why_not_admitted_sentence_wrt_asent_arg_constraints", "EXPLANATION-OF-WHY-NOT-ADMITTED-SENTENCE-WRT-ASENT-ARG-CONSTRAINTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_admitted", "admitted_argument_plus_inter_arg_isaP", "ADMITTED-ARGUMENT-PLUS-INTER-ARG-ISA?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_admitted", "generic_arg_p", "GENERIC-ARG-P", 1, 0, false);
        new $generic_arg_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_admitted", "relations_admitting_fort_as_arg", "RELATIONS-ADMITTING-FORT-AS-ARG", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_admitted", "relations_admitting_fort_as_any_of_args", "RELATIONS-ADMITTING-FORT-AS-ANY-OF-ARGS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_admitted", "at_candidate_relations_admitting_fort", "AT-CANDIDATE-RELATIONS-ADMITTING-FORT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_admitted", "at_cr_hash_relations", "AT-CR-HASH-RELATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_admitted", "at_cr_hash_relations_by_argnum", "AT-CR-HASH-RELATIONS-BY-ARGNUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_admitted", "at_cr_all_arg_isa_cachedP", "AT-CR-ALL-ARG-ISA-CACHED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_admitted", "at_cr_argisa_col_searchedP", "AT-CR-ARGISA-COL-SEARCHED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_admitted", "inference_relations_admitting_fort_as_arg", "INFERENCE-RELATIONS-ADMITTING-FORT-AS-ARG", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_admitted", "inference_relations_admitting_naut_as_arg", "INFERENCE-RELATIONS-ADMITTING-NAUT-AS-ARG", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_admitted", "inference_relations_admitting_term_as_arg_int", "INFERENCE-RELATIONS-ADMITTING-TERM-AS-ARG-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_admitted", "ira_isa_hash_relations", "IRA-ISA-HASH-RELATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_admitted", "ira_all_arg_isa_cachedP", "IRA-ALL-ARG-ISA-CACHED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_admitted", "ira_argisa_col_searchedP", "IRA-ARGISA-COL-SEARCHED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_admitted", "ira_genl_hash_relations", "IRA-GENL-HASH-RELATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_admitted", "ira_all_arg_genl_cachedP", "IRA-ALL-ARG-GENL-CACHED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_admitted", "ira_arggenl_col_searchedP", "IRA-ARGGENL-COL-SEARCHED?", 1, 0, false);
        return (SubLObject)at_admitted.NIL;
    }
    
    public static SubLObject init_at_admitted_file() {
        at_admitted.$at_candidate_relations_table$ = SubLFiles.defparameter("*AT-CANDIDATE-RELATIONS-TABLE*", (SubLObject)at_admitted.NIL);
        at_admitted.$at_candidate_relations_argnums_table$ = SubLFiles.defparameter("*AT-CANDIDATE-RELATIONS-ARGNUMS-TABLE*", (SubLObject)at_admitted.NIL);
        at_admitted.$at_candidate_relations_sbhl_space$ = SubLFiles.defparameter("*AT-CANDIDATE-RELATIONS-SBHL-SPACE*", (SubLObject)at_admitted.NIL);
        at_admitted.$at_cr_mapping_result$ = SubLFiles.defparameter("*AT-CR-MAPPING-RESULT*", (SubLObject)at_admitted.NIL);
        at_admitted.$at_cr_arg_isa_pred$ = SubLFiles.defparameter("*AT-CR-ARG-ISA-PRED*", (SubLObject)at_admitted.NIL);
        at_admitted.$at_cr_argnum$ = SubLFiles.defparameter("*AT-CR-ARGNUM*", (SubLObject)at_admitted.NIL);
        at_admitted.$at_candidate_relations_max$ = SubLFiles.deflexical("*AT-CANDIDATE-RELATIONS-MAX*", (SubLObject)at_admitted.$int9$512);
        at_admitted.$ira_table$ = SubLFiles.defparameter("*IRA-TABLE*", (SubLObject)at_admitted.NIL);
        at_admitted.$ira_argnum$ = SubLFiles.defparameter("*IRA-ARGNUM*", (SubLObject)at_admitted.NIL);
        at_admitted.$ira_relations_estimate$ = SubLFiles.defparameter("*IRA-RELATIONS-ESTIMATE*", (SubLObject)at_admitted.$int9$512);
        at_admitted.$ira_isa_sbhl_space$ = SubLFiles.defparameter("*IRA-ISA-SBHL-SPACE*", (SubLObject)at_admitted.NIL);
        at_admitted.$ira_arg_isa_pred$ = SubLFiles.defparameter("*IRA-ARG-ISA-PRED*", (SubLObject)at_admitted.NIL);
        at_admitted.$ira_genl_sbhl_space$ = SubLFiles.defparameter("*IRA-GENL-SBHL-SPACE*", (SubLObject)at_admitted.NIL);
        at_admitted.$ira_arg_genl_pred$ = SubLFiles.defparameter("*IRA-ARG-GENL-PRED*", (SubLObject)at_admitted.NIL);
        at_admitted.$ira_mapping_result$ = SubLFiles.defparameter("*IRA-MAPPING-RESULT*", (SubLObject)at_admitted.NIL);
        return (SubLObject)at_admitted.NIL;
    }
    
    public static SubLObject setup_at_admitted_file() {
        memoization_state.note_memoized_function((SubLObject)at_admitted.$sym0$ADMITTED_ARGUMENT_);
        return (SubLObject)at_admitted.NIL;
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
    
    static {
        me = (SubLFile)new at_admitted();
        at_admitted.$at_candidate_relations_table$ = null;
        at_admitted.$at_candidate_relations_argnums_table$ = null;
        at_admitted.$at_candidate_relations_sbhl_space$ = null;
        at_admitted.$at_cr_mapping_result$ = null;
        at_admitted.$at_cr_arg_isa_pred$ = null;
        at_admitted.$at_cr_argnum$ = null;
        at_admitted.$at_candidate_relations_max$ = null;
        at_admitted.$ira_table$ = null;
        at_admitted.$ira_argnum$ = null;
        at_admitted.$ira_relations_estimate$ = null;
        at_admitted.$ira_isa_sbhl_space$ = null;
        at_admitted.$ira_arg_isa_pred$ = null;
        at_admitted.$ira_genl_sbhl_space$ = null;
        at_admitted.$ira_arg_genl_pred$ = null;
        at_admitted.$ira_mapping_result$ = null;
        $sym0$ADMITTED_ARGUMENT_ = SubLObjectFactory.makeSymbol("ADMITTED-ARGUMENT?");
        $sym1$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $kw2$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $sym3$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $kw4$STRONG_FORT = SubLObjectFactory.makeKeyword("STRONG-FORT");
        $kw5$ISA = SubLObjectFactory.makeKeyword("ISA");
        $const6$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $const7$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $kw8$GENLS = SubLObjectFactory.makeKeyword("GENLS");
        $int9$512 = SubLObjectFactory.makeInteger(512);
        $sym10$CONSP = SubLObjectFactory.makeSymbol("CONSP");
        $sym11$AT_CR_HASH_RELATIONS = SubLObjectFactory.makeSymbol("AT-CR-HASH-RELATIONS");
        $sym12$AT_CR_HASH_RELATIONS_BY_ARGNUM = SubLObjectFactory.makeSymbol("AT-CR-HASH-RELATIONS-BY-ARGNUM");
        $str13$no_mapping_method_defiend_for_sbh = SubLObjectFactory.makeString("no mapping method defiend for sbhl-table ~s");
        $kw14$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw15$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $const16$argsIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argsIsa"));
        $const17$argIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argIsa"));
        $sym18$AT_CR_ARGISA_COL_SEARCHED_ = SubLObjectFactory.makeSymbol("AT-CR-ARGISA-COL-SEARCHED?");
        $sym19$NAUT_ = SubLObjectFactory.makeSymbol("NAUT?");
        $sym20$IRA_ARGISA_COL_SEARCHED_ = SubLObjectFactory.makeSymbol("IRA-ARGISA-COL-SEARCHED?");
        $const21$argsGenl = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argsGenl"));
        $sym22$IRA_ARGGENL_COL_SEARCHED_ = SubLObjectFactory.makeSymbol("IRA-ARGGENL-COL-SEARCHED?");
    }
    
    public static final class $generic_arg_p$UnaryFunction extends UnaryFunction
    {
        public $generic_arg_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("GENERIC-ARG-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return at_admitted.generic_arg_p(arg1);
        }
    }
}

/*

	Total time: 1168 ms
	
*/