package com.cyc.cycjava.cycl.sksi.query_sks;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.genls;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_rewrite_modules extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.query_sks.sksi_rewrite_modules";
    public static final String myFingerPrint = "b80ce26e7403cfe7c5f4b4150acedafe9125e95ced393b6196e97a768db312b4";
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 895L)
    private static SubLSymbol $isa_genls_rule$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 1065L)
    private static SubLSymbol $genl_preds_rule$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 1349L)
    private static SubLSymbol $genl_inverse_rule$;
    private static final SubLSymbol $kw0$UNINITIALIZED;
    private static final SubLSymbol $sym1$_ISA_GENLS_RULE_;
    private static final SubLSymbol $sym2$_ISA_GENLS_RULE__INITIALIZER;
    private static final SubLList $list3;
    private static final SubLObject $const4$BaseKB;
    private static final SubLSymbol $sym5$_GENL_PREDS_RULE_;
    private static final SubLSymbol $sym6$_GENL_PREDS_RULE__INITIALIZER;
    private static final SubLList $list7;
    private static final SubLObject $const8$UniversalVocabularyMt;
    private static final SubLSymbol $sym9$_GENL_INVERSE_RULE_;
    private static final SubLSymbol $sym10$_GENL_INVERSE_RULE__INITIALIZER;
    private static final SubLList $list11;
    private static final SubLSymbol $kw12$SKSI_ISA_REWRITE_CHECK;
    private static final SubLList $list13;
    private static final SubLObject $const14$isa;
    private static final SubLSymbol $kw15$POS;
    private static final SubLSymbol $kw16$GENLS;
    private static final SubLObject $const17$genls;
    private static final SubLSymbol $kw18$SKSI_ISA_REWRITE_GENERATE;
    private static final SubLList $list19;
    private static final SubLSymbol $kw20$SKSI_GENLPREDS_REWRITE;
    private static final SubLList $list21;
    private static final SubLSymbol $kw22$GENLPREDS;
    private static final SubLObject $const23$genlPreds;
    private static final SubLSymbol $kw24$SKSI_GENLINVERSE_REWRITE;
    private static final SubLList $list25;
    private static final SubLSymbol $sym26$SENTENCE_CONTAINS_SUBSENTENCE_WITH_COMMUTATIVE_MEANING_SENTENCE_P;
    private static final SubLSymbol $sym27$SENTENCE_WITH_COMMUTATIVE_MEANING_SENTENCE_PRED_;
    private static final SubLObject $const28$genlInverse;
    private static final SubLSymbol $sym29$FIRST;
    private static final SubLList $list30;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 895L)
    public static SubLObject isa_genls_ruleX_initializer() {
        return hl_supports.find_assertion_or_make_support((SubLObject)sksi_rewrite_modules.$list3, sksi_rewrite_modules.$const4$BaseKB);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 1065L)
    public static SubLObject genl_preds_ruleX_initializer() {
        return hl_supports.find_assertion_or_make_support((SubLObject)sksi_rewrite_modules.$list7, sksi_rewrite_modules.$const8$UniversalVocabularyMt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 1349L)
    public static SubLObject genl_inverse_ruleX_initializer() {
        return hl_supports.find_assertion_or_make_support((SubLObject)sksi_rewrite_modules.$list11, sksi_rewrite_modules.$const4$BaseKB);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 2518L)
    public static SubLObject sksi_isa_rewrite_check_applicability_fn(final SubLObject asent) {
        if (sksi_rewrite_modules.NIL == sksi_macros.sksi_slrm_genl_pred_and_genls_reasoning_onP()) {
            return (SubLObject)sksi_rewrite_modules.NIL;
        }
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)sksi_rewrite_modules.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_rewrite_modules.NIL != sksi_removal_module_generation.isa_sks_term_to_cycl_term_mt_relevantP() && sksi_rewrite_modules.NIL != sksi_removal_module_generation.any_sks_term_spec_to_cycl_term_in_relevant_mtP(arg2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 2825L)
    public static SubLObject sksi_isa_rewrite_check_cost_fn(final SubLObject asent) {
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)sksi_rewrite_modules.UNPROVIDED);
        return Sequences.length(sksi_removal_module_generation.all_sksi_relevant_rewrite_specs_for_term(arg2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 2998L)
    public static SubLObject sksi_isa_rewrite_check_expand_fn(final SubLObject asent) {
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)sksi_rewrite_modules.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)sksi_rewrite_modules.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject new_arg2s = cdolist_list_var = sksi_removal_module_generation.all_sksi_relevant_rewrite_specs_for_term(arg2);
        SubLObject new_arg2 = (SubLObject)sksi_rewrite_modules.NIL;
        new_arg2 = cdolist_list_var.first();
        while (sksi_rewrite_modules.NIL != cdolist_list_var) {
            final SubLObject new_asent = (SubLObject)ConsesLow.list(sksi_rewrite_modules.$const14$isa, arg1, new_arg2);
            final SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query(new_asent, (SubLObject)sksi_rewrite_modules.$kw15$POS, inference_worker_rewrite.current_rewrite_mt());
            final SubLObject supports = (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)sksi_rewrite_modules.$kw16$GENLS, (SubLObject)ConsesLow.list(sksi_rewrite_modules.$const17$genls, new_arg2, arg2), (SubLObject)sksi_rewrite_modules.UNPROVIDED, (SubLObject)sksi_rewrite_modules.UNPROVIDED));
            inference_worker_rewrite.rewrite_add_link(query, supports);
            cdolist_list_var = cdolist_list_var.rest();
            new_arg2 = cdolist_list_var.first();
        }
        return (SubLObject)sksi_rewrite_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 4805L)
    public static SubLObject sksi_isa_rewrite_generate_applicability_fn(final SubLObject asent) {
        if (sksi_rewrite_modules.NIL == sksi_macros.sksi_slrm_genl_pred_and_genls_reasoning_onP()) {
            return (SubLObject)sksi_rewrite_modules.NIL;
        }
        return sksi_removal_module_generation.isa_sks_term_to_cycl_term_mt_relevantP();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 5014L)
    public static SubLObject sksi_isa_rewrite_generate_cost_fn(final SubLObject asent) {
        return Sequences.length(sksi_removal_module_generation.all_sksi_relevant_rewrite_isas());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 5143L)
    public static SubLObject sksi_isa_rewrite_generate_expand_fn(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)sksi_rewrite_modules.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject isas = cdolist_list_var = sksi_removal_module_generation.all_sksi_relevant_rewrite_isas();
        SubLObject v_isa = (SubLObject)sksi_rewrite_modules.NIL;
        v_isa = cdolist_list_var.first();
        while (sksi_rewrite_modules.NIL != cdolist_list_var) {
            final SubLObject new_asent = (SubLObject)ConsesLow.list(sksi_rewrite_modules.$const14$isa, arg1, v_isa);
            final SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query(new_asent, (SubLObject)sksi_rewrite_modules.$kw15$POS, mt_relevance_macros.$mt$.getDynamicValue(thread));
            inference_worker_rewrite.restriction_rewrite_add_link(query, (SubLObject)sksi_rewrite_modules.NIL);
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
        }
        return (SubLObject)sksi_rewrite_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 5503L)
    public static SubLObject sksi_isa_rewrite_generate_closure(final SubLObject asent) {
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)sksi_rewrite_modules.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)sksi_rewrite_modules.UNPROVIDED);
        final SubLObject v_genls = Sequences.remove(arg2, genls.all_genls(arg2, (SubLObject)sksi_rewrite_modules.UNPROVIDED, (SubLObject)sksi_rewrite_modules.UNPROVIDED), (SubLObject)sksi_rewrite_modules.UNPROVIDED, (SubLObject)sksi_rewrite_modules.UNPROVIDED, (SubLObject)sksi_rewrite_modules.UNPROVIDED, (SubLObject)sksi_rewrite_modules.UNPROVIDED, (SubLObject)sksi_rewrite_modules.UNPROVIDED);
        SubLObject result = (SubLObject)sksi_rewrite_modules.NIL;
        SubLObject cdolist_list_var = v_genls;
        SubLObject genl = (SubLObject)sksi_rewrite_modules.NIL;
        genl = cdolist_list_var.first();
        while (sksi_rewrite_modules.NIL != cdolist_list_var) {
            final SubLObject new_query = (SubLObject)ConsesLow.list(sksi_rewrite_modules.$const14$isa, arg1, genl);
            final SubLObject support = arguments.make_hl_support((SubLObject)sksi_rewrite_modules.$kw16$GENLS, (SubLObject)ConsesLow.list(sksi_rewrite_modules.$const17$genls, arg2, genl), (SubLObject)sksi_rewrite_modules.UNPROVIDED, (SubLObject)sksi_rewrite_modules.UNPROVIDED);
            final SubLObject supports = (SubLObject)ConsesLow.list(support);
            result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(new_query, supports), result);
            cdolist_list_var = cdolist_list_var.rest();
            genl = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 6754L)
    public static SubLObject sksi_genlpreds_rewrite_applicability_fn(final SubLObject asent) {
        if (sksi_rewrite_modules.NIL == sksi_macros.sksi_slrm_genl_pred_and_genls_reasoning_onP()) {
            return (SubLObject)sksi_rewrite_modules.NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_rewrite_modules.NIL != sksi_removal_module_generation.any_sksi_meaning_sentence_mt_relevantP() && sksi_rewrite_modules.NIL != sksi_removal_module_generation.any_sksi_meaning_sentence_spec_predP(pred));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 7056L)
    public static SubLObject sksi_genlpreds_rewrite_cost_fn(final SubLObject asent) {
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        return Sequences.length(sksi_removal_module_generation.all_sksi_relevant_rewrite_spec_preds_for_pred(pred));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 7239L)
    public static SubLObject sksi_genlpreds_rewrite_expand_fn(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject args = cycl_utilities.atomic_sentence_args(asent, (SubLObject)sksi_rewrite_modules.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject spec_preds = cdolist_list_var = sksi_removal_module_generation.all_sksi_relevant_rewrite_spec_preds_for_pred(pred);
        SubLObject spec_pred = (SubLObject)sksi_rewrite_modules.NIL;
        spec_pred = cdolist_list_var.first();
        while (sksi_rewrite_modules.NIL != cdolist_list_var) {
            final SubLObject asent_$1 = el_utilities.make_el_formula(spec_pred, args, (SubLObject)sksi_rewrite_modules.UNPROVIDED);
            if (sksi_rewrite_modules.NIL != wff.el_wffP(asent_$1, (SubLObject)sksi_rewrite_modules.UNPROVIDED, (SubLObject)sksi_rewrite_modules.UNPROVIDED)) {
                final SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query(asent_$1, (SubLObject)sksi_rewrite_modules.$kw15$POS, mt_relevance_macros.$mt$.getDynamicValue(thread));
                final SubLObject supports = (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)sksi_rewrite_modules.$kw22$GENLPREDS, (SubLObject)ConsesLow.list(sksi_rewrite_modules.$const23$genlPreds, spec_pred, pred), (SubLObject)sksi_rewrite_modules.UNPROVIDED, (SubLObject)sksi_rewrite_modules.UNPROVIDED));
                inference_worker_rewrite.rewrite_add_link(query, supports);
            }
            cdolist_list_var = cdolist_list_var.rest();
            spec_pred = cdolist_list_var.first();
        }
        return (SubLObject)sksi_rewrite_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 8658L)
    public static SubLObject sksi_genlinverse_rewrite_applicability_fn(final SubLObject asent) {
        if (sksi_rewrite_modules.NIL == sksi_macros.sksi_slrm_genl_pred_and_genls_reasoning_onP()) {
            return (SubLObject)sksi_rewrite_modules.NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_rewrite_modules.NIL != sksi_removal_module_generation.any_sksi_meaning_sentence_mt_relevantP() && (sksi_rewrite_modules.NIL != sksi_removal_module_generation.any_sksi_meaning_sentence_spec_inverseP(pred) || sksi_rewrite_modules.NIL != sentence_contains_subsentence_with_commutative_meaning_sentence_predP(asent)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 9151L)
    public static SubLObject sentence_contains_subsentence_with_commutative_meaning_sentence_predP_internal(final SubLObject asent) {
        return cycl_utilities.expression_find_if((SubLObject)sksi_rewrite_modules.$sym27$SENTENCE_WITH_COMMUTATIVE_MEANING_SENTENCE_PRED_, asent, (SubLObject)sksi_rewrite_modules.UNPROVIDED, (SubLObject)sksi_rewrite_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 9151L)
    public static SubLObject sentence_contains_subsentence_with_commutative_meaning_sentence_predP(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_rewrite_modules.NIL;
        if (sksi_rewrite_modules.NIL == v_memoization_state) {
            return sentence_contains_subsentence_with_commutative_meaning_sentence_predP_internal(asent);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_rewrite_modules.$sym26$SENTENCE_CONTAINS_SUBSENTENCE_WITH_COMMUTATIVE_MEANING_SENTENCE_P, (SubLObject)sksi_rewrite_modules.UNPROVIDED);
        if (sksi_rewrite_modules.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_rewrite_modules.$sym26$SENTENCE_CONTAINS_SUBSENTENCE_WITH_COMMUTATIVE_MEANING_SENTENCE_P, (SubLObject)sksi_rewrite_modules.ONE_INTEGER, (SubLObject)sksi_rewrite_modules.NIL, (SubLObject)sksi_rewrite_modules.EQUAL, (SubLObject)sksi_rewrite_modules.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_rewrite_modules.$sym26$SENTENCE_CONTAINS_SUBSENTENCE_WITH_COMMUTATIVE_MEANING_SENTENCE_P, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, asent, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sentence_contains_subsentence_with_commutative_meaning_sentence_predP_internal(asent)));
            memoization_state.caching_state_put(caching_state, asent, results, (SubLObject)sksi_rewrite_modules.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 9368L)
    public static SubLObject sentence_with_commutative_meaning_sentence_predP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_rewrite_modules.NIL != cycl_grammar.cycl_sentence_p(v_object) && sksi_rewrite_modules.NIL != fort_types_interface.isa_commutative_predicateP(cycl_utilities.formula_operator(v_object), (SubLObject)sksi_rewrite_modules.UNPROVIDED) && sksi_rewrite_modules.NIL != sksi_removal_module_generation.meaning_sentence_predP(cycl_utilities.formula_operator(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 9602L)
    public static SubLObject sksi_genlinverse_rewrite_cost_fn(final SubLObject asent) {
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject cost = Sequences.length(sksi_removal_module_generation.all_sksi_relevant_rewrite_spec_inverses_for_pred(pred));
        if (sksi_rewrite_modules.NIL != sentence_contains_subsentence_with_commutative_meaning_sentence_predP(asent)) {
            cost = Numbers.add(cost, Sequences.length(sksi_infrastructure_utilities.formula_commutative_permutations_memoized(asent, (SubLObject)sksi_rewrite_modules.T, (SubLObject)sksi_rewrite_modules.UNPROVIDED)));
        }
        return cost;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 9974L)
    public static SubLObject sksi_genlinverse_rewrite_expand_fn(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)sksi_rewrite_modules.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)sksi_rewrite_modules.UNPROVIDED);
        final SubLObject args = (SubLObject)ConsesLow.list(arg2, arg1);
        final SubLObject spec_invs = sksi_removal_module_generation.all_sksi_relevant_rewrite_spec_inverses_for_pred(pred);
        SubLObject rewrite_queries = (SubLObject)sksi_rewrite_modules.NIL;
        SubLObject cdolist_list_var = spec_invs;
        SubLObject spec_inv = (SubLObject)sksi_rewrite_modules.NIL;
        spec_inv = cdolist_list_var.first();
        while (sksi_rewrite_modules.NIL != cdolist_list_var) {
            final SubLObject new_asent = el_utilities.make_el_formula(spec_inv, args, (SubLObject)sksi_rewrite_modules.UNPROVIDED);
            if (sksi_rewrite_modules.NIL != wff.el_wffP(new_asent, (SubLObject)sksi_rewrite_modules.UNPROVIDED, (SubLObject)sksi_rewrite_modules.UNPROVIDED)) {
                final SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query(new_asent, (SubLObject)sksi_rewrite_modules.$kw15$POS, mt_relevance_macros.$mt$.getDynamicValue(thread));
                final SubLObject supports = (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)sksi_rewrite_modules.$kw22$GENLPREDS, (SubLObject)ConsesLow.list(sksi_rewrite_modules.$const28$genlInverse, spec_inv, pred), (SubLObject)sksi_rewrite_modules.UNPROVIDED, (SubLObject)sksi_rewrite_modules.UNPROVIDED));
                rewrite_queries = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(query, supports), rewrite_queries);
            }
            cdolist_list_var = cdolist_list_var.rest();
            spec_inv = cdolist_list_var.first();
        }
        final SubLObject commutative_pred = cycl_utilities.formula_operator(sentence_contains_subsentence_with_commutative_meaning_sentence_predP(asent));
        if (sksi_rewrite_modules.NIL != commutative_pred) {
            SubLObject cdolist_list_var2;
            final SubLObject commutative_permutations = cdolist_list_var2 = sksi_infrastructure_utilities.formula_commutative_permutations_memoized(asent, (SubLObject)sksi_rewrite_modules.T, (SubLObject)sksi_rewrite_modules.UNPROVIDED);
            SubLObject perm = (SubLObject)sksi_rewrite_modules.NIL;
            perm = cdolist_list_var2.first();
            while (sksi_rewrite_modules.NIL != cdolist_list_var2) {
                if (sksi_rewrite_modules.NIL != wff.el_wffP(perm, (SubLObject)sksi_rewrite_modules.UNPROVIDED, (SubLObject)sksi_rewrite_modules.UNPROVIDED)) {
                    final SubLObject query2 = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query(perm, (SubLObject)sksi_rewrite_modules.$kw15$POS, mt_relevance_macros.$mt$.getDynamicValue(thread));
                    final SubLObject supports2 = (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)sksi_rewrite_modules.$kw22$GENLPREDS, (SubLObject)ConsesLow.list(sksi_rewrite_modules.$const28$genlInverse, commutative_pred, commutative_pred), (SubLObject)sksi_rewrite_modules.UNPROVIDED, (SubLObject)sksi_rewrite_modules.UNPROVIDED));
                    rewrite_queries = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(query2, supports2), rewrite_queries);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                perm = cdolist_list_var2.first();
            }
        }
        rewrite_queries = (cdolist_list_var = list_utilities.fast_delete_duplicates(rewrite_queries, Symbols.symbol_function((SubLObject)sksi_rewrite_modules.EQUAL), Symbols.symbol_function((SubLObject)sksi_rewrite_modules.$sym29$FIRST), (SubLObject)sksi_rewrite_modules.UNPROVIDED, (SubLObject)sksi_rewrite_modules.UNPROVIDED, (SubLObject)sksi_rewrite_modules.UNPROVIDED));
        SubLObject query_supports_pair = (SubLObject)sksi_rewrite_modules.NIL;
        query_supports_pair = cdolist_list_var.first();
        while (sksi_rewrite_modules.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = query_supports_pair;
            SubLObject query2 = (SubLObject)sksi_rewrite_modules.NIL;
            SubLObject supports2 = (SubLObject)sksi_rewrite_modules.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_rewrite_modules.$list30);
            query2 = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_rewrite_modules.$list30);
            supports2 = current.first();
            current = current.rest();
            if (sksi_rewrite_modules.NIL == current) {
                inference_worker_rewrite.rewrite_add_link(query2, supports2);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_rewrite_modules.$list30);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_supports_pair = cdolist_list_var.first();
        }
        return (SubLObject)sksi_rewrite_modules.NIL;
    }
    
    public static SubLObject declare_sksi_rewrite_modules_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_rewrite_modules", "isa_genls_ruleX_initializer", "*ISA-GENLS-RULE*-INITIALIZER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_rewrite_modules", "genl_preds_ruleX_initializer", "*GENL-PREDS-RULE*-INITIALIZER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_rewrite_modules", "genl_inverse_ruleX_initializer", "*GENL-INVERSE-RULE*-INITIALIZER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_rewrite_modules", "sksi_isa_rewrite_check_applicability_fn", "SKSI-ISA-REWRITE-CHECK-APPLICABILITY-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_rewrite_modules", "sksi_isa_rewrite_check_cost_fn", "SKSI-ISA-REWRITE-CHECK-COST-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_rewrite_modules", "sksi_isa_rewrite_check_expand_fn", "SKSI-ISA-REWRITE-CHECK-EXPAND-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_rewrite_modules", "sksi_isa_rewrite_generate_applicability_fn", "SKSI-ISA-REWRITE-GENERATE-APPLICABILITY-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_rewrite_modules", "sksi_isa_rewrite_generate_cost_fn", "SKSI-ISA-REWRITE-GENERATE-COST-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_rewrite_modules", "sksi_isa_rewrite_generate_expand_fn", "SKSI-ISA-REWRITE-GENERATE-EXPAND-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_rewrite_modules", "sksi_isa_rewrite_generate_closure", "SKSI-ISA-REWRITE-GENERATE-CLOSURE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_rewrite_modules", "sksi_genlpreds_rewrite_applicability_fn", "SKSI-GENLPREDS-REWRITE-APPLICABILITY-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_rewrite_modules", "sksi_genlpreds_rewrite_cost_fn", "SKSI-GENLPREDS-REWRITE-COST-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_rewrite_modules", "sksi_genlpreds_rewrite_expand_fn", "SKSI-GENLPREDS-REWRITE-EXPAND-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_rewrite_modules", "sksi_genlinverse_rewrite_applicability_fn", "SKSI-GENLINVERSE-REWRITE-APPLICABILITY-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_rewrite_modules", "sentence_contains_subsentence_with_commutative_meaning_sentence_predP_internal", "SENTENCE-CONTAINS-SUBSENTENCE-WITH-COMMUTATIVE-MEANING-SENTENCE-PRED?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_rewrite_modules", "sentence_contains_subsentence_with_commutative_meaning_sentence_predP", "SENTENCE-CONTAINS-SUBSENTENCE-WITH-COMMUTATIVE-MEANING-SENTENCE-PRED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_rewrite_modules", "sentence_with_commutative_meaning_sentence_predP", "SENTENCE-WITH-COMMUTATIVE-MEANING-SENTENCE-PRED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_rewrite_modules", "sksi_genlinverse_rewrite_cost_fn", "SKSI-GENLINVERSE-REWRITE-COST-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_rewrite_modules", "sksi_genlinverse_rewrite_expand_fn", "SKSI-GENLINVERSE-REWRITE-EXPAND-FN", 1, 0, false);
        return (SubLObject)sksi_rewrite_modules.NIL;
    }
    
    public static SubLObject init_sksi_rewrite_modules_file() {
        sksi_rewrite_modules.$isa_genls_rule$ = SubLFiles.defvar("*ISA-GENLS-RULE*", (SubLObject)sksi_rewrite_modules.$kw0$UNINITIALIZED);
        sksi_rewrite_modules.$genl_preds_rule$ = SubLFiles.defvar("*GENL-PREDS-RULE*", (SubLObject)sksi_rewrite_modules.$kw0$UNINITIALIZED);
        sksi_rewrite_modules.$genl_inverse_rule$ = SubLFiles.defvar("*GENL-INVERSE-RULE*", (SubLObject)sksi_rewrite_modules.$kw0$UNINITIALIZED);
        return (SubLObject)sksi_rewrite_modules.NIL;
    }
    
    public static SubLObject setup_sksi_rewrite_modules_file() {
        utilities_macros.register_kb_variable_initialization((SubLObject)sksi_rewrite_modules.$sym1$_ISA_GENLS_RULE_, (SubLObject)sksi_rewrite_modules.$sym2$_ISA_GENLS_RULE__INITIALIZER);
        utilities_macros.register_kb_variable_initialization((SubLObject)sksi_rewrite_modules.$sym5$_GENL_PREDS_RULE_, (SubLObject)sksi_rewrite_modules.$sym6$_GENL_PREDS_RULE__INITIALIZER);
        utilities_macros.register_kb_variable_initialization((SubLObject)sksi_rewrite_modules.$sym9$_GENL_INVERSE_RULE_, (SubLObject)sksi_rewrite_modules.$sym10$_GENL_INVERSE_RULE__INITIALIZER);
        inference_modules.inference_rewrite_module((SubLObject)sksi_rewrite_modules.$kw12$SKSI_ISA_REWRITE_CHECK, (SubLObject)sksi_rewrite_modules.$list13);
        inference_modules.inference_rewrite_module((SubLObject)sksi_rewrite_modules.$kw18$SKSI_ISA_REWRITE_GENERATE, (SubLObject)sksi_rewrite_modules.$list19);
        inference_modules.inference_rewrite_module((SubLObject)sksi_rewrite_modules.$kw20$SKSI_GENLPREDS_REWRITE, (SubLObject)sksi_rewrite_modules.$list21);
        inference_modules.inference_rewrite_module((SubLObject)sksi_rewrite_modules.$kw24$SKSI_GENLINVERSE_REWRITE, (SubLObject)sksi_rewrite_modules.$list25);
        memoization_state.note_memoized_function((SubLObject)sksi_rewrite_modules.$sym26$SENTENCE_CONTAINS_SUBSENTENCE_WITH_COMMUTATIVE_MEANING_SENTENCE_P);
        return (SubLObject)sksi_rewrite_modules.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_sksi_rewrite_modules_file();
    }
    
    @Override
	public void initializeVariables() {
        init_sksi_rewrite_modules_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_sksi_rewrite_modules_file();
    }
    
    static {
        me = (SubLFile)new sksi_rewrite_modules();
        sksi_rewrite_modules.$isa_genls_rule$ = null;
        sksi_rewrite_modules.$genl_preds_rule$ = null;
        sksi_rewrite_modules.$genl_inverse_rule$ = null;
        $kw0$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $sym1$_ISA_GENLS_RULE_ = SubLObjectFactory.makeSymbol("*ISA-GENLS-RULE*");
        $sym2$_ISA_GENLS_RULE__INITIALIZER = SubLObjectFactory.makeSymbol("*ISA-GENLS-RULE*-INITIALIZER");
        $list3 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("transitiveViaArg")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)sksi_rewrite_modules.TWO_INTEGER);
        $const4$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $sym5$_GENL_PREDS_RULE_ = SubLObjectFactory.makeSymbol("*GENL-PREDS-RULE*");
        $sym6$_GENL_PREDS_RULE__INITIALIZER = SubLObjectFactory.makeSymbol("*GENL-PREDS-RULE*-INITIALIZER");
        $list7 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), (SubLObject)SubLObjectFactory.makeSymbol("?SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("?GENL")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("?SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("?ARGS"))), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("?GENL"), (SubLObject)SubLObjectFactory.makeSymbol("?ARGS")));
        $const8$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $sym9$_GENL_INVERSE_RULE_ = SubLObjectFactory.makeSymbol("*GENL-INVERSE-RULE*");
        $sym10$_GENL_INVERSE_RULE__INITIALIZER = SubLObjectFactory.makeSymbol("*GENL-INVERSE-RULE*-INITIALIZER");
        $list11 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse")), (SubLObject)SubLObjectFactory.makeSymbol("?SPEC-INV"), (SubLObject)SubLObjectFactory.makeSymbol("?GENL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?SPEC-INV"), (SubLObject)SubLObjectFactory.makeSymbol("?ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("?ARG2"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?GENL"), (SubLObject)SubLObjectFactory.makeSymbol("?ARG2"), (SubLObject)SubLObjectFactory.makeSymbol("?ARG1")));
        $kw12$SKSI_ISA_REWRITE_CHECK = SubLObjectFactory.makeKeyword("SKSI-ISA-REWRITE-CHECK");
        $list13 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("MODULE-SUBTYPE"), SubLObjectFactory.makeKeyword("SKSI"), SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("SKSI-ISA-REWRITE-CHECK-APPLICABILITY-FN"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("SKSI-ISA-REWRITE-CHECK-COST-FN"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("SKSI-ISA-REWRITE-CHECK-EXPAND-FN"), SubLObjectFactory.makeKeyword("REWRITE-SUPPORT"), SubLObjectFactory.makeSymbol("*ISA-GENLS-RULE*"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("Rewrites #$isa literals into new #$isa literals which can be handled by SKSI lookup modules,\n    where the new arg2 is a spec of the old arg2.  This module implements the isa/genls rule\n    for all SKSI modules, where we want to check an isa relationship."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$isa ?X #$GeographicalRegion) \n    --->\n    (#$isa ?X #$Country) \n    when we have a (#$isa (#$SchemaObjectFn <SCHEMA>) #$Country) meaning sentence.") });
        $const14$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw15$POS = SubLObjectFactory.makeKeyword("POS");
        $kw16$GENLS = SubLObjectFactory.makeKeyword("GENLS");
        $const17$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $kw18$SKSI_ISA_REWRITE_GENERATE = SubLObjectFactory.makeKeyword("SKSI-ISA-REWRITE-GENERATE");
        $list19 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("MODULE-SUBTYPE"), SubLObjectFactory.makeKeyword("SKSI"), SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("SKSI-ISA-REWRITE-GENERATE-APPLICABILITY-FN"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("SKSI-ISA-REWRITE-GENERATE-COST-FN"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("SKSI-ISA-REWRITE-GENERATE-EXPAND-FN"), SubLObjectFactory.makeKeyword("REWRITE-CLOSURE"), SubLObjectFactory.makeSymbol("SKSI-ISA-REWRITE-GENERATE-CLOSURE"), SubLObjectFactory.makeKeyword("REWRITE-SUPPORT"), SubLObjectFactory.makeSymbol("*ISA-GENLS-RULE*"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("Rewrites #$isa literals into new #$isa literals which can be handled by SKSI lookup modules,\n    where the new arg2 appears in the arg2 position of an SKSI #$isa meaning sentence.  This \n    module implements the isa/genls rule for all SKSI modules, where we want to generate #$isa \n    relationships."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$isa (#$SchemaObjectFn <SCHEMA>) ?X) \n    ---> (restriction)\n    when we have a (#$isa (#$SchemaObjectFn <SCHEMA>) #$Country) meaning sentence, then\n    (#$isa (#$SchemaObjectFn <SCHEMA>) #$Country) \n    ---> (rewrites)\n    (#$isa (#$SchemaObjectFn <SCHEMA>) #$GeographicalRegion) \n    (#$isa (#$SchemaObjectFn <SCHEMA>) #$SpatialThing) ...\n    (#$isa (#$SchemaObjectFn <SCHEMA>) #$Thing)") });
        $kw20$SKSI_GENLPREDS_REWRITE = SubLObjectFactory.makeKeyword("SKSI-GENLPREDS-REWRITE");
        $list21 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("MODULE-SUBTYPE"), SubLObjectFactory.makeKeyword("SKSI"), SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("SKSI-GENLPREDS-REWRITE-APPLICABILITY-FN"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("SKSI-GENLPREDS-REWRITE-COST-FN"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("SKSI-GENLPREDS-REWRITE-EXPAND-FN"), SubLObjectFactory.makeKeyword("REWRITE-SUPPORT"), SubLObjectFactory.makeSymbol("*GENL-PREDS-RULE*"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("Rewrites literals into new literals which can be handled by SKSI lookup modules,\n    where the new literals have predicates which are SKSI meaning sentence predicates,\n    and are spec-preds of the original literal predicate. This module implements \n    the genlPreds rule for all SKSI modules."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("1.\n    (#$isa ?X ?Y)\n    --->\n    (#$ethnicity ?X ?Y)") });
        $kw22$GENLPREDS = SubLObjectFactory.makeKeyword("GENLPREDS");
        $const23$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $kw24$SKSI_GENLINVERSE_REWRITE = SubLObjectFactory.makeKeyword("SKSI-GENLINVERSE-REWRITE");
        $list25 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("MODULE-SUBTYPE"), SubLObjectFactory.makeKeyword("SKSI"), SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("SKSI-GENLINVERSE-REWRITE-APPLICABILITY-FN"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("SKSI-GENLINVERSE-REWRITE-COST-FN"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("SKSI-GENLINVERSE-REWRITE-EXPAND-FN"), SubLObjectFactory.makeKeyword("REWRITE-SUPPORT"), SubLObjectFactory.makeSymbol("*GENL-INVERSE-RULE*"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("Rewrites literals into new literals which can be handled by SKSI lookup modules,\n    where the new literals have predicates which are SKSI meaning sentence predicates,\n    and are spec-inverses of the original literal predicate. This module implements \n    the genlInverse rule for all SKSI modules."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("1.\n    (#$signifies ?STR ?PERS)\n    --->\n    (#$nameString ?PERS ?STR)\n   ") });
        $sym26$SENTENCE_CONTAINS_SUBSENTENCE_WITH_COMMUTATIVE_MEANING_SENTENCE_P = SubLObjectFactory.makeSymbol("SENTENCE-CONTAINS-SUBSENTENCE-WITH-COMMUTATIVE-MEANING-SENTENCE-PRED?");
        $sym27$SENTENCE_WITH_COMMUTATIVE_MEANING_SENTENCE_PRED_ = SubLObjectFactory.makeSymbol("SENTENCE-WITH-COMMUTATIVE-MEANING-SENTENCE-PRED?");
        $const28$genlInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $sym29$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS"));
    }
}

/*

	Total time: 231 ms
	
*/