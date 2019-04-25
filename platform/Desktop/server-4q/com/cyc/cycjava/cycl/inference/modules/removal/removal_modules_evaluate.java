package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_evaluate extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluate";
    public static final String myFingerPrint = "e55ba8005ac332b4b4026fee30507b5dfa05435156c6a03af4574f3d388749e7";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluate.lisp", position = 805L)
    private static SubLSymbol $default_evaluate_bind_cost$;
    private static final SubLObject $const0$evaluate;
    private static final SubLSymbol $kw1$POS;
    private static final SubLSymbol $kw2$NEG;
    private static final SubLSymbol $kw3$REMOVAL_EVALUATE_BIND;
    private static final SubLList $list4;
    private static final SubLSymbol $kw5$REMOVAL_EVALUATE_NEG_CHECK;
    private static final SubLList $list6;
    private static final SubLSymbol $kw7$REMOVAL_EVALUATE_BIND_CONJUNCTION;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$EVALUATION_RELATED_ASENT_;
    private static final SubLSymbol $sym10$CONTEXTUALIZED_ASENT_ASENT;
    private static final SubLSymbol $sym11$REMOVAL_EVALUATE_BIND_CONJUNCTION_APPLICABILITY;
    private static final SubLList $list12;
    private static final SubLSymbol $sym13$_EXIT;
    private static final SubLSymbol $sym14$HL_VAR_;
    private static final SubLSymbol $sym15$REMOVAL_EVALUATE_BIND_CONJUNCTION_EXPAND;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluate.lisp", position = 522L)
    public static SubLObject make_evaluate_sentence(final SubLObject result, final SubLObject expression) {
        return el_utilities.make_binary_formula(removal_modules_evaluate.$const0$evaluate, result, expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluate.lisp", position = 1008L)
    public static SubLObject removal_evaluate_bind_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_evaluate.UNPROVIDED) {
            sense = (SubLObject)removal_modules_evaluate.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_evaluate.UNPROVIDED);
        final SubLObject expression = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_evaluate.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject v_answer = relation_evaluation.cyc_evaluate(expression);
        final SubLObject validP = thread.secondMultipleValue();
        final SubLObject contextualizedP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (removal_modules_evaluate.NIL != validP) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(arg1, v_answer, (SubLObject)removal_modules_evaluate.T, (SubLObject)removal_modules_evaluate.T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_evaluate.NIL != v_bindings) {
                final SubLObject subst_arg1 = bindings.apply_bindings(v_bindings, arg1);
                final SubLObject sentence = make_evaluate_sentence(subst_arg1, expression);
                final SubLObject support = removal_modules_evaluation.make_eval_support(sentence, contextualizedP);
                backward.removal_add_node(support, v_bindings, unify_justification);
            }
        }
        return (SubLObject)removal_modules_evaluate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluate.lisp", position = 2303L)
    public static SubLObject removal_evaluate_neg_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_evaluate.UNPROVIDED) {
            sense = (SubLObject)removal_modules_evaluate.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_evaluate.UNPROVIDED);
        final SubLObject expression = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_evaluate.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject v_answer = relation_evaluation.cyc_evaluate(expression);
        final SubLObject validP = thread.secondMultipleValue();
        final SubLObject contextualizedP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (removal_modules_evaluate.NIL != validP) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(arg1, v_answer, (SubLObject)removal_modules_evaluate.UNPROVIDED, (SubLObject)removal_modules_evaluate.UNPROVIDED);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_evaluate.NIL == v_bindings) {
                final SubLObject sentence = cycl_utilities.negate(asent);
                final SubLObject support = removal_modules_evaluation.make_eval_support(sentence, contextualizedP);
                backward.removal_add_node(support, (SubLObject)removal_modules_evaluate.UNPROVIDED, (SubLObject)removal_modules_evaluate.UNPROVIDED);
            }
        }
        return (SubLObject)removal_modules_evaluate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluate.lisp", position = 4526L)
    public static SubLObject removal_evaluate_bind_conjunction_applicability(final SubLObject contextualized_dnf_clause) {
        if (removal_modules_evaluate.NIL != list_utilities.every_in_list((SubLObject)removal_modules_evaluate.$sym9$EVALUATION_RELATED_ASENT_, clauses.pos_lits(contextualized_dnf_clause), (SubLObject)removal_modules_evaluate.$sym10$CONTEXTUALIZED_ASENT_ASENT) && removal_modules_evaluate.NIL != total_evaluation_related_conjunction_solvableP(contextualized_dnf_clause, (SubLObject)removal_modules_evaluate.UNPROVIDED, (SubLObject)removal_modules_evaluate.UNPROVIDED)) {
            return (SubLObject)ConsesLow.list(clause_utilities.new_total_subclause_spec(contextualized_dnf_clause));
        }
        return (SubLObject)removal_modules_evaluate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluate.lisp", position = 5024L)
    public static SubLObject total_evaluation_related_conjunction_solvableP(final SubLObject contextualized_dnf_clause, SubLObject bound_vars, SubLObject done_lits) {
        if (bound_vars == removal_modules_evaluate.UNPROVIDED) {
            bound_vars = (SubLObject)removal_modules_evaluate.NIL;
        }
        if (done_lits == removal_modules_evaluate.UNPROVIDED) {
            done_lits = (SubLObject)removal_modules_evaluate.NIL;
        }
        SubLObject doneP = (SubLObject)removal_modules_evaluate.NIL;
        SubLObject result = (SubLObject)removal_modules_evaluate.NIL;
        if (Sequences.length(done_lits).numE(clause_utilities.clause_literal_count(contextualized_dnf_clause))) {
            return (SubLObject)removal_modules_evaluate.T;
        }
        SubLObject lit_index = (SubLObject)removal_modules_evaluate.ZERO_INTEGER;
        SubLObject rest;
        SubLObject lit;
        SubLObject lit_sense;
        SubLObject lit_sense_index;
        SubLObject solvableP;
        SubLObject new_bound_vars;
        SubLObject new_done_lits;
        for (rest = (SubLObject)removal_modules_evaluate.NIL, rest = clauses.neg_lits(contextualized_dnf_clause); removal_modules_evaluate.NIL == doneP && removal_modules_evaluate.NIL != rest; rest = rest.rest()) {
            lit = rest.first();
            lit_sense = (SubLObject)removal_modules_evaluate.$kw2$NEG;
            lit_sense_index = (SubLObject)ConsesLow.cons(lit_sense, lit_index);
            if (removal_modules_evaluate.NIL == subl_promotions.memberP(lit_sense_index, done_lits, Symbols.symbol_function((SubLObject)removal_modules_evaluate.EQUAL), (SubLObject)removal_modules_evaluate.UNPROVIDED)) {
                solvableP = evaluation_related_contextualized_asent_solvableP(lit, lit_sense, bound_vars);
                if (removal_modules_evaluate.NIL != solvableP) {
                    new_bound_vars = (SubLObject)((removal_modules_evaluate.NIL != cycl_grammar.hl_variable_p(solvableP)) ? ConsesLow.cons(solvableP, bound_vars) : bound_vars);
                    new_done_lits = (SubLObject)ConsesLow.cons(lit_sense_index, done_lits);
                    result = total_evaluation_related_conjunction_solvableP(contextualized_dnf_clause, new_bound_vars, new_done_lits);
                    if (removal_modules_evaluate.NIL != result) {
                        doneP = (SubLObject)removal_modules_evaluate.T;
                    }
                }
            }
            lit_index = Numbers.add(lit_index, (SubLObject)removal_modules_evaluate.ONE_INTEGER);
        }
        lit_index = (SubLObject)removal_modules_evaluate.ZERO_INTEGER;
        for (rest = (SubLObject)removal_modules_evaluate.NIL, rest = clauses.pos_lits(contextualized_dnf_clause); removal_modules_evaluate.NIL == doneP && removal_modules_evaluate.NIL != rest; rest = rest.rest()) {
            lit = rest.first();
            lit_sense = (SubLObject)removal_modules_evaluate.$kw1$POS;
            lit_sense_index = (SubLObject)ConsesLow.cons(lit_sense, lit_index);
            if (removal_modules_evaluate.NIL == subl_promotions.memberP(lit_sense_index, done_lits, Symbols.symbol_function((SubLObject)removal_modules_evaluate.EQUAL), (SubLObject)removal_modules_evaluate.UNPROVIDED)) {
                solvableP = evaluation_related_contextualized_asent_solvableP(lit, lit_sense, bound_vars);
                if (removal_modules_evaluate.NIL != solvableP) {
                    new_bound_vars = (SubLObject)((removal_modules_evaluate.NIL != cycl_grammar.hl_variable_p(solvableP)) ? ConsesLow.cons(solvableP, bound_vars) : bound_vars);
                    new_done_lits = (SubLObject)ConsesLow.cons(lit_sense_index, done_lits);
                    result = total_evaluation_related_conjunction_solvableP(contextualized_dnf_clause, new_bound_vars, new_done_lits);
                    if (removal_modules_evaluate.NIL != result) {
                        doneP = (SubLObject)removal_modules_evaluate.T;
                    }
                }
            }
            lit_index = Numbers.add(lit_index, (SubLObject)removal_modules_evaluate.ONE_INTEGER);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluate.lisp", position = 5941L)
    public static SubLObject evaluation_related_contextualized_asent_solvableP(final SubLObject contextualized_asent, final SubLObject sense, final SubLObject bound_vars) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt = (SubLObject)removal_modules_evaluate.NIL;
        SubLObject asent = (SubLObject)removal_modules_evaluate.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(contextualized_asent, contextualized_asent, (SubLObject)removal_modules_evaluate.$list12);
        mt = contextualized_asent.first();
        SubLObject current = contextualized_asent.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, contextualized_asent, (SubLObject)removal_modules_evaluate.$list12);
        asent = current.first();
        current = current.rest();
        if (removal_modules_evaluate.NIL == current) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (sense == removal_modules_evaluate.$kw1$POS && removal_modules_evaluate.NIL != el_utilities.evaluate_litP(asent, (SubLObject)removal_modules_evaluate.UNPROVIDED)) {
                    if (removal_modules_evaluate.NIL != el_utilities.potentially_solvable_evaluate_asentP(asent)) {
                        return cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_evaluate.UNPROVIDED);
                    }
                }
                else {
                    if (removal_modules_evaluate.NIL == el_utilities.el_formula_p(asent) || removal_modules_evaluate.NIL == relation_evaluation.evaluatable_relationP(cycl_utilities.formula_operator(asent))) {
                        return (SubLObject)removal_modules_evaluate.NIL;
                    }
                    final SubLObject hl_vars = cycl_utilities.expression_gather(asent, (SubLObject)removal_modules_evaluate.$sym14$HL_VAR_, (SubLObject)removal_modules_evaluate.UNPROVIDED, (SubLObject)removal_modules_evaluate.UNPROVIDED, (SubLObject)removal_modules_evaluate.UNPROVIDED, (SubLObject)removal_modules_evaluate.UNPROVIDED);
                    if (removal_modules_evaluate.NIL != conses_high.subsetp(hl_vars, bound_vars, (SubLObject)removal_modules_evaluate.UNPROVIDED, (SubLObject)removal_modules_evaluate.UNPROVIDED)) {
                        return (SubLObject)removal_modules_evaluate.T;
                    }
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(contextualized_asent, (SubLObject)removal_modules_evaluate.$list12);
        }
        return (SubLObject)removal_modules_evaluate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluate.lisp", position = 6548L)
    public static SubLObject evaluation_related_asentP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean((removal_modules_evaluate.NIL != el_utilities.el_formula_p(v_object) && removal_modules_evaluate.NIL != relation_evaluation.evaluatable_relationP(cycl_utilities.formula_operator(v_object))) || removal_modules_evaluate.NIL != el_utilities.evaluate_litP(v_object, (SubLObject)removal_modules_evaluate.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluate.lisp", position = 6740L)
    public static SubLObject removal_evaluate_bind_conjunction_expand(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = total_evaluation_related_conjunction_solution(contextualized_dnf_clause, (SubLObject)removal_modules_evaluate.UNPROVIDED, (SubLObject)removal_modules_evaluate.UNPROVIDED, (SubLObject)removal_modules_evaluate.UNPROVIDED);
        final SubLObject supports = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (removal_modules_evaluate.NIL != supports && removal_modules_evaluate.NIL == bindings.some_variable_with_conflicting_bindings(v_bindings, v_bindings)) {
            inference_worker_removal.conjunctive_removal_callback(v_bindings, supports);
        }
        return (SubLObject)removal_modules_evaluate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluate.lisp", position = 7203L)
    public static SubLObject total_evaluation_related_conjunction_solution(final SubLObject contextualized_dnf_clause, SubLObject v_bindings, SubLObject supports, SubLObject done_lits) {
        if (v_bindings == removal_modules_evaluate.UNPROVIDED) {
            v_bindings = (SubLObject)removal_modules_evaluate.NIL;
        }
        if (supports == removal_modules_evaluate.UNPROVIDED) {
            supports = (SubLObject)removal_modules_evaluate.NIL;
        }
        if (done_lits == removal_modules_evaluate.UNPROVIDED) {
            done_lits = (SubLObject)removal_modules_evaluate.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (Sequences.length(done_lits).numE(clause_utilities.clause_literal_count(contextualized_dnf_clause))) {
            return Values.values(v_bindings, supports);
        }
        SubLObject lit_index = (SubLObject)removal_modules_evaluate.ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.neg_lits(contextualized_dnf_clause);
        SubLObject lit = (SubLObject)removal_modules_evaluate.NIL;
        lit = cdolist_list_var.first();
        while (removal_modules_evaluate.NIL != cdolist_list_var) {
            final SubLObject lit_sense = (SubLObject)removal_modules_evaluate.$kw2$NEG;
            final SubLObject lit_sense_index = (SubLObject)ConsesLow.cons(lit_sense, lit_index);
            if (removal_modules_evaluate.NIL == subl_promotions.memberP(lit_sense_index, done_lits, Symbols.symbol_function((SubLObject)removal_modules_evaluate.EQUAL), (SubLObject)removal_modules_evaluate.UNPROVIDED)) {
                thread.resetMultipleValues();
                final SubLObject new_bindings = evaluation_related_contextualized_asent_solution(lit, lit_sense, v_bindings);
                final SubLObject additional_supports = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject item_var = additional_supports;
                if (removal_modules_evaluate.NIL == conses_high.member(item_var, supports, Symbols.symbol_function((SubLObject)removal_modules_evaluate.EQL), Symbols.symbol_function((SubLObject)removal_modules_evaluate.IDENTITY))) {
                    supports = (SubLObject)ConsesLow.cons(item_var, supports);
                }
                if (removal_modules_evaluate.NIL != additional_supports) {
                    final SubLObject new_done_lits = (SubLObject)ConsesLow.cons(lit_sense_index, done_lits);
                    return total_evaluation_related_conjunction_solution(contextualized_dnf_clause, new_bindings, supports, new_done_lits);
                }
            }
            lit_index = Numbers.add(lit_index, (SubLObject)removal_modules_evaluate.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        }
        lit_index = (SubLObject)removal_modules_evaluate.ZERO_INTEGER;
        cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        lit = (SubLObject)removal_modules_evaluate.NIL;
        lit = cdolist_list_var.first();
        while (removal_modules_evaluate.NIL != cdolist_list_var) {
            final SubLObject lit_sense = (SubLObject)removal_modules_evaluate.$kw1$POS;
            final SubLObject lit_sense_index = (SubLObject)ConsesLow.cons(lit_sense, lit_index);
            if (removal_modules_evaluate.NIL == subl_promotions.memberP(lit_sense_index, done_lits, Symbols.symbol_function((SubLObject)removal_modules_evaluate.EQUAL), (SubLObject)removal_modules_evaluate.UNPROVIDED)) {
                thread.resetMultipleValues();
                final SubLObject new_bindings = evaluation_related_contextualized_asent_solution(lit, lit_sense, v_bindings);
                final SubLObject additional_supports = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject item_var = additional_supports;
                if (removal_modules_evaluate.NIL == conses_high.member(item_var, supports, Symbols.symbol_function((SubLObject)removal_modules_evaluate.EQL), Symbols.symbol_function((SubLObject)removal_modules_evaluate.IDENTITY))) {
                    supports = (SubLObject)ConsesLow.cons(item_var, supports);
                }
                if (removal_modules_evaluate.NIL != additional_supports) {
                    final SubLObject new_done_lits = (SubLObject)ConsesLow.cons(lit_sense_index, done_lits);
                    return total_evaluation_related_conjunction_solution(contextualized_dnf_clause, new_bindings, supports, new_done_lits);
                }
            }
            lit_index = Numbers.add(lit_index, (SubLObject)removal_modules_evaluate.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        }
        return Values.values((SubLObject)removal_modules_evaluate.NIL, (SubLObject)removal_modules_evaluate.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluate.lisp", position = 8072L)
    public static SubLObject evaluation_related_contextualized_asent_solution(final SubLObject contextualized_asent, final SubLObject sense, SubLObject v_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supports = (SubLObject)removal_modules_evaluate.NIL;
        SubLObject mt = (SubLObject)removal_modules_evaluate.NIL;
        SubLObject asent = (SubLObject)removal_modules_evaluate.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(contextualized_asent, contextualized_asent, (SubLObject)removal_modules_evaluate.$list12);
        mt = contextualized_asent.first();
        SubLObject current = contextualized_asent.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, contextualized_asent, (SubLObject)removal_modules_evaluate.$list12);
        asent = current.first();
        current = current.rest();
        if (removal_modules_evaluate.NIL == current) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (removal_modules_evaluate.NIL != el_utilities.evaluate_litP(asent, (SubLObject)removal_modules_evaluate.UNPROVIDED)) {
                    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_evaluate.UNPROVIDED);
                    final SubLObject expression = bindings.apply_bindings(v_bindings, cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_evaluate.UNPROVIDED));
                    thread.resetMultipleValues();
                    final SubLObject v_answer = relation_evaluation.cyc_evaluate(expression);
                    final SubLObject validP = thread.secondMultipleValue();
                    final SubLObject contextualizedP = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (removal_modules_evaluate.NIL != validP) {
                        thread.resetMultipleValues();
                        SubLObject additional_bindings = unification_utilities.term_unify(arg1, v_answer, (SubLObject)removal_modules_evaluate.T, (SubLObject)removal_modules_evaluate.T);
                        final SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (removal_modules_evaluate.NIL != additional_bindings) {
                            if (removal_modules_evaluate.NIL != bindings.unification_success_token_p(additional_bindings)) {
                                additional_bindings = (SubLObject)removal_modules_evaluate.NIL;
                            }
                            final SubLObject subst_arg1 = bindings.apply_bindings(additional_bindings, arg1);
                            final SubLObject sentence = make_evaluate_sentence(subst_arg1, expression);
                            SubLObject support = (SubLObject)removal_modules_evaluate.NIL;
                            support = removal_modules_evaluation.make_eval_support(sentence, contextualizedP);
                            v_bindings = Sequences.remove_duplicates(ConsesLow.append(v_bindings, additional_bindings), Symbols.symbol_function((SubLObject)removal_modules_evaluate.EQUAL), (SubLObject)removal_modules_evaluate.UNPROVIDED, (SubLObject)removal_modules_evaluate.UNPROVIDED, (SubLObject)removal_modules_evaluate.UNPROVIDED);
                            supports = (SubLObject)((removal_modules_evaluate.NIL != unify_justification) ? ConsesLow.list(support, unify_justification) : ConsesLow.list(support));
                            return Values.values(v_bindings, supports);
                        }
                    }
                }
                else {
                    if (removal_modules_evaluate.NIL == el_utilities.el_formula_p(asent) || removal_modules_evaluate.NIL == relation_evaluation.evaluatable_relationP(cycl_utilities.formula_operator(asent))) {
                        return Values.values(v_bindings, (SubLObject)removal_modules_evaluate.NIL);
                    }
                    asent = bindings.apply_bindings(v_bindings, asent);
                    thread.resetMultipleValues();
                    final SubLObject v_answer2 = relation_evaluation.cyc_evaluate(asent);
                    final SubLObject validP2 = thread.secondMultipleValue();
                    final SubLObject contextualizedP2 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (removal_modules_evaluate.NIL != validP2 && removal_modules_evaluate.NIL != ((sense == removal_modules_evaluate.$kw1$POS) ? v_answer2 : SubLObjectFactory.makeBoolean(removal_modules_evaluate.NIL == v_answer2))) {
                        final SubLObject hl_support_formula = backward_utilities.inference_canonicalize_hl_support_literal(asent);
                        SubLObject support2 = (SubLObject)removal_modules_evaluate.NIL;
                        support2 = ((sense == removal_modules_evaluate.$kw1$POS) ? removal_modules_evaluation.make_eval_support(hl_support_formula, contextualizedP2) : removal_modules_evaluation.make_eval_support(cycl_utilities.negate(hl_support_formula), contextualizedP2));
                        return Values.values(v_bindings, (SubLObject)ConsesLow.list(support2));
                    }
                    return Values.values((SubLObject)removal_modules_evaluate.NIL, (SubLObject)removal_modules_evaluate.NIL);
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(contextualized_asent, (SubLObject)removal_modules_evaluate.$list12);
        }
        return (SubLObject)removal_modules_evaluate.NIL;
    }
    
    public static SubLObject declare_removal_modules_evaluate_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluate", "make_evaluate_sentence", "MAKE-EVALUATE-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluate", "removal_evaluate_bind_expand", "REMOVAL-EVALUATE-BIND-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluate", "removal_evaluate_neg_check_expand", "REMOVAL-EVALUATE-NEG-CHECK-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluate", "removal_evaluate_bind_conjunction_applicability", "REMOVAL-EVALUATE-BIND-CONJUNCTION-APPLICABILITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluate", "total_evaluation_related_conjunction_solvableP", "TOTAL-EVALUATION-RELATED-CONJUNCTION-SOLVABLE?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluate", "evaluation_related_contextualized_asent_solvableP", "EVALUATION-RELATED-CONTEXTUALIZED-ASENT-SOLVABLE?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluate", "evaluation_related_asentP", "EVALUATION-RELATED-ASENT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluate", "removal_evaluate_bind_conjunction_expand", "REMOVAL-EVALUATE-BIND-CONJUNCTION-EXPAND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluate", "total_evaluation_related_conjunction_solution", "TOTAL-EVALUATION-RELATED-CONJUNCTION-SOLUTION", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluate", "evaluation_related_contextualized_asent_solution", "EVALUATION-RELATED-CONTEXTUALIZED-ASENT-SOLUTION", 3, 0, false);
        return (SubLObject)removal_modules_evaluate.NIL;
    }
    
    public static SubLObject init_removal_modules_evaluate_file() {
        removal_modules_evaluate.$default_evaluate_bind_cost$ = SubLFiles.defparameter("*DEFAULT-EVALUATE-BIND-COST*", (SubLObject)removal_modules_evaluate.ONE_INTEGER);
        return (SubLObject)removal_modules_evaluate.NIL;
    }
    
    public static SubLObject setup_removal_modules_evaluate_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_evaluate.$const0$evaluate);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_evaluate.$kw1$POS, removal_modules_evaluate.$const0$evaluate, (SubLObject)removal_modules_evaluate.TWO_INTEGER);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_evaluate.$kw2$NEG, removal_modules_evaluate.$const0$evaluate);
        inference_modules.inference_removal_module((SubLObject)removal_modules_evaluate.$kw3$REMOVAL_EVALUATE_BIND, (SubLObject)removal_modules_evaluate.$list4);
        inference_modules.inference_removal_module((SubLObject)removal_modules_evaluate.$kw5$REMOVAL_EVALUATE_NEG_CHECK, (SubLObject)removal_modules_evaluate.$list6);
        inference_modules.inference_conjunctive_removal_module((SubLObject)removal_modules_evaluate.$kw7$REMOVAL_EVALUATE_BIND_CONJUNCTION, (SubLObject)removal_modules_evaluate.$list8);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_evaluate.$sym11$REMOVAL_EVALUATE_BIND_CONJUNCTION_APPLICABILITY);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_evaluate.$sym15$REMOVAL_EVALUATE_BIND_CONJUNCTION_EXPAND);
        return (SubLObject)removal_modules_evaluate.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_modules_evaluate_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_modules_evaluate_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_modules_evaluate_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_evaluate();
        removal_modules_evaluate.$default_evaluate_bind_cost$ = null;
        $const0$evaluate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate"));
        $kw1$POS = SubLObjectFactory.makeKeyword("POS");
        $kw2$NEG = SubLObjectFactory.makeKeyword("NEG");
        $kw3$REMOVAL_EVALUATE_BIND = SubLObjectFactory.makeKeyword("REMOVAL-EVALUATE-BIND");
        $list4 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EVALUATABLE-EXPRESSION?")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-EVALUATE-BIND-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-EVALUATE-BIND-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$evaluate <whatever> (<evaluatable function . <fully bound>))\n using the #$evaluationDefn for the function"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$evaluate ?SUM (#$PlusFn 1 2))\n (#$evaluate 3 (#$PlusFn 1 2))") });
        $kw5$REMOVAL_EVALUATE_NEG_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-EVALUATE-NEG-CHECK");
        $list6 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EVALUATABLE-EXPRESSION?")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-EVALUATE-BIND-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-EVALUATE-NEG-CHECK-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$evaluate <fully bound> (<evaluatable function . <fully bound>)))\nusing the #$evaluationDefn for the function"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$evaluate 4 (#$PlusFn 1 2)))") });
        $kw7$REMOVAL_EVALUATE_BIND_CONJUNCTION = SubLObjectFactory.makeKeyword("REMOVAL-EVALUATE-BIND-CONJUNCTION");
        $list8 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("APPLICABILITY"), SubLObjectFactory.makeSymbol("REMOVAL-EVALUATE-BIND-CONJUNCTION-APPLICABILITY"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-EVALUATE-BIND-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-EVALUATE-BIND-CONJUNCTION-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("Solves a connected conjunction of literals where at least one literal is an #$evaluate and the rest are evaluatable."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$and \n     (#$greaterThanOrEqualTo ?VAR0 (#$MonthsDuration 6)) \n     (#$evaluate ?VAR0 \n       (#$TimeElapsedFn \n         (#$SecondFn 0 (#$MinuteFn 59 (#$HourFn 23 (#$DayFn 25 (#$MonthFn #$February (#$YearFn 2010))))))\n         (#$SecondFn 0 (#$MinuteFn 51 (#$HourFn 8 (#$DayFn 22 (#$MonthFn #$April (#$YearFn 2010)))))))))") });
        $sym9$EVALUATION_RELATED_ASENT_ = SubLObjectFactory.makeSymbol("EVALUATION-RELATED-ASENT?");
        $sym10$CONTEXTUALIZED_ASENT_ASENT = SubLObjectFactory.makeSymbol("CONTEXTUALIZED-ASENT-ASENT");
        $sym11$REMOVAL_EVALUATE_BIND_CONJUNCTION_APPLICABILITY = SubLObjectFactory.makeSymbol("REMOVAL-EVALUATE-BIND-CONJUNCTION-APPLICABILITY");
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"));
        $sym13$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $sym14$HL_VAR_ = SubLObjectFactory.makeSymbol("HL-VAR?");
        $sym15$REMOVAL_EVALUATE_BIND_CONJUNCTION_EXPAND = SubLObjectFactory.makeSymbol("REMOVAL-EVALUATE-BIND-CONJUNCTION-EXPAND");
    }
}

/*

	Total time: 244 ms
	
*/