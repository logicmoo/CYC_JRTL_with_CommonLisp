package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_tools extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rkf_tools";
    public static final String myFingerPrint = "0306fc2db5938977c869c794562c8a9d4ea153e39708508c829716a11856fedc";
    @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 743L)
    private static SubLSymbol $rkf_core_constants$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 7710L)
    public static SubLSymbol $rkf_max_arity$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 7872L)
    public static SubLSymbol $rkf_common_sentences_recurseP$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$VALID_CONSTANT_;
    private static final SubLObject $const2$genls;
    private static final SubLObject $const3$isa;
    private static final SubLSymbol $kw4$IGNORE;
    private static final SubLSymbol $sym5$__TERM;
    private static final SubLObject $const6$Thing;
    private static final SubLSymbol $sym7$RKF_CH_PARSING_SURROGATE_P;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$_OBJ;
    private static final SubLObject $const10$TheSetOf;
    private static final SubLObject $const11$and;
    private static final SubLSymbol $kw12$TERM;
    private static final SubLSymbol $sym13$RKF_TERM_REFERENCE_P;
    private static final SubLSymbol $sym14$RKF_GENERAL_REFERENCE_FORMULA_EQUAL;
    private static final SubLSymbol $sym15$RKF_LOCAL_TERM_REFERENCE_P;
    private static final SubLSymbol $sym16$RKF_LOCAL_TERM_EQUAL;
    private static final SubLObject $const17$or;
    private static final SubLObject $const18$implies;
    private static final SubLSymbol $kw19$DEFAULT;
    private static final SubLSymbol $sym20$FORT_P;
    private static final SubLSymbol $sym21$STRINGP;
    private static final SubLSymbol $sym22$HLMT_P;
    private static final SubLObject $const23$preferredTermStrings;
    private static final SubLSymbol $sym24$PREDICATE_P;
    private static final SubLList $list25;
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 1008L)
    public static SubLObject initialize_rkf_kb_feature() {
        if (rkf_tools.NIL != list_utilities.every_in_list((SubLObject)rkf_tools.$sym1$VALID_CONSTANT_, rkf_tools.$rkf_core_constants$.getGlobalValue(), (SubLObject)rkf_tools.UNPROVIDED)) {
            kb_control_vars.set_rkf_kb_loaded();
        }
        else {
            kb_control_vars.unset_rkf_kb_loaded();
        }
        return kb_control_vars.rkf_kb_loaded_p();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 1349L)
    public static SubLObject rkf_compare_terms(final SubLObject term1, final SubLObject term2, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject include_nartsP = rkf_tools.$rkf_common_sentences_recurseP$.getDynamicValue(thread);
        final SubLObject all1 = cycl_utilities.hl_to_el(rkf_concept_summarizer.rkf_summarize(term1, domain_mt, include_nartsP));
        final SubLObject all2 = cycl_utilities.hl_to_el(rkf_concept_summarizer.rkf_summarize(term2, domain_mt, include_nartsP));
        thread.resetMultipleValues();
        final SubLObject common1 = rkf_sentences_in_common(term1, term2, all1, all2, domain_mt);
        final SubLObject common2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject unique1 = list_utilities.fast_set_difference(all1, common1, Symbols.symbol_function((SubLObject)rkf_tools.EQUAL));
        final SubLObject unique2 = list_utilities.fast_set_difference(all2, common2, Symbols.symbol_function((SubLObject)rkf_tools.EQUAL));
        return Values.values(common1, unique1, unique2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 2118L)
    public static SubLObject rkf_sentences_in_common(final SubLObject term1, final SubLObject term2, final SubLObject sentences1, final SubLObject sentences2, final SubLObject domain_mt) {
        SubLObject common1 = (SubLObject)rkf_tools.NIL;
        SubLObject common2 = (SubLObject)rkf_tools.NIL;
        SubLObject cdolist_list_var = sentences1;
        SubLObject sentence1 = (SubLObject)rkf_tools.NIL;
        sentence1 = cdolist_list_var.first();
        while (rkf_tools.NIL != cdolist_list_var) {
            final SubLObject new_sentence = rkf_substitute_terms_in_sentence(term2, term1, sentence1);
            if (rkf_tools.NIL != rkf_relevant_and_knownP(new_sentence, term2, sentences2, domain_mt)) {
                common2 = (SubLObject)ConsesLow.cons(new_sentence, common2);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence1 = cdolist_list_var.first();
        }
        cdolist_list_var = common2;
        SubLObject common3 = (SubLObject)rkf_tools.NIL;
        common3 = cdolist_list_var.first();
        while (rkf_tools.NIL != cdolist_list_var) {
            final SubLObject new_sentence = rkf_substitute_terms_in_sentence(term1, term2, common3);
            common1 = (SubLObject)ConsesLow.cons(new_sentence, common1);
            cdolist_list_var = cdolist_list_var.rest();
            common3 = cdolist_list_var.first();
        }
        cdolist_list_var = sentences2;
        SubLObject sentence2 = (SubLObject)rkf_tools.NIL;
        sentence2 = cdolist_list_var.first();
        while (rkf_tools.NIL != cdolist_list_var) {
            final SubLObject new_sentence = rkf_substitute_terms_in_sentence(term1, term2, sentence2);
            if (rkf_tools.NIL == subl_promotions.memberP(new_sentence, common1, Symbols.symbol_function((SubLObject)rkf_tools.EQUAL), (SubLObject)rkf_tools.UNPROVIDED) && rkf_tools.NIL != rkf_relevant_and_knownP(new_sentence, term1, sentences1, domain_mt)) {
                common1 = (SubLObject)ConsesLow.cons(new_sentence, common1);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence2 = cdolist_list_var.first();
        }
        cdolist_list_var = common1;
        common3 = (SubLObject)rkf_tools.NIL;
        common3 = cdolist_list_var.first();
        while (rkf_tools.NIL != cdolist_list_var) {
            final SubLObject item_var;
            final SubLObject new_sentence = item_var = rkf_substitute_terms_in_sentence(term2, term1, common3);
            if (rkf_tools.NIL == conses_high.member(item_var, common2, Symbols.symbol_function((SubLObject)rkf_tools.EQUAL), Symbols.symbol_function((SubLObject)rkf_tools.IDENTITY))) {
                common2 = (SubLObject)ConsesLow.cons(item_var, common2);
            }
            cdolist_list_var = cdolist_list_var.rest();
            common3 = cdolist_list_var.first();
        }
        final SubLObject common_isas = isa.min_ceiling_isa((SubLObject)ConsesLow.list(term1, term2), (SubLObject)rkf_tools.NIL, domain_mt, (SubLObject)rkf_tools.UNPROVIDED);
        SubLObject cdolist_list_var2;
        final SubLObject common_genls = cdolist_list_var2 = genls.min_ceiling_cols((SubLObject)ConsesLow.list(term1, term2), (SubLObject)rkf_tools.NIL, domain_mt, (SubLObject)rkf_tools.UNPROVIDED);
        SubLObject col = (SubLObject)rkf_tools.NIL;
        col = cdolist_list_var2.first();
        while (rkf_tools.NIL != cdolist_list_var2) {
            final SubLObject sentence3 = (SubLObject)ConsesLow.list(rkf_tools.$const2$genls, term1, col);
            final SubLObject sentence4 = (SubLObject)ConsesLow.list(rkf_tools.$const2$genls, term2, col);
            SubLObject item_var2 = sentence3;
            if (rkf_tools.NIL == conses_high.member(item_var2, common1, Symbols.symbol_function((SubLObject)rkf_tools.EQUAL), Symbols.symbol_function((SubLObject)rkf_tools.IDENTITY))) {
                common1 = (SubLObject)ConsesLow.cons(item_var2, common1);
            }
            item_var2 = sentence4;
            if (rkf_tools.NIL == conses_high.member(item_var2, common2, Symbols.symbol_function((SubLObject)rkf_tools.EQUAL), Symbols.symbol_function((SubLObject)rkf_tools.IDENTITY))) {
                common2 = (SubLObject)ConsesLow.cons(item_var2, common2);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            col = cdolist_list_var2.first();
        }
        cdolist_list_var2 = common_isas;
        col = (SubLObject)rkf_tools.NIL;
        col = cdolist_list_var2.first();
        while (rkf_tools.NIL != cdolist_list_var2) {
            final SubLObject sentence3 = (SubLObject)ConsesLow.list(rkf_tools.$const3$isa, term1, col);
            final SubLObject sentence4 = (SubLObject)ConsesLow.list(rkf_tools.$const3$isa, term2, col);
            SubLObject item_var2 = sentence3;
            if (rkf_tools.NIL == conses_high.member(item_var2, common1, Symbols.symbol_function((SubLObject)rkf_tools.EQUAL), Symbols.symbol_function((SubLObject)rkf_tools.IDENTITY))) {
                common1 = (SubLObject)ConsesLow.cons(item_var2, common1);
            }
            item_var2 = sentence4;
            if (rkf_tools.NIL == conses_high.member(item_var2, common2, Symbols.symbol_function((SubLObject)rkf_tools.EQUAL), Symbols.symbol_function((SubLObject)rkf_tools.IDENTITY))) {
                common2 = (SubLObject)ConsesLow.cons(item_var2, common2);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            col = cdolist_list_var2.first();
        }
        return Values.values(common1, common2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 4129L)
    public static SubLObject rkf_relevant_and_knownP(final SubLObject sentence, final SubLObject v_term, final SubLObject sentences, final SubLObject domain_mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_tools.NIL != cycl_utilities.expression_find(v_term, sentence, (SubLObject)rkf_tools.UNPROVIDED, (SubLObject)rkf_tools.UNPROVIDED, (SubLObject)rkf_tools.UNPROVIDED) && (rkf_tools.NIL != subl_promotions.memberP(sentence, sentences, Symbols.symbol_function((SubLObject)rkf_tools.EQUAL), (SubLObject)rkf_tools.UNPROVIDED) || rkf_tools.NIL != rkf_query_utilities.rkf_known(sentence, domain_mt, (SubLObject)rkf_tools.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 4409L)
    public static SubLObject rkf_remove_unmentioned_constraints(final SubLObject v_term, final SubLObject constraints) {
        SubLObject result_conjuncts = (SubLObject)rkf_tools.NIL;
        if (rkf_tools.NIL != el_utilities.el_conjunction_p(constraints)) {
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(constraints, (SubLObject)rkf_tools.$kw4$IGNORE);
            SubLObject conjunct = (SubLObject)rkf_tools.NIL;
            conjunct = cdolist_list_var.first();
            while (rkf_tools.NIL != cdolist_list_var) {
                if (v_term.equal(cycl_utilities.formula_arg1(conjunct, (SubLObject)rkf_tools.UNPROVIDED))) {
                    result_conjuncts = (SubLObject)ConsesLow.cons(conjunct, result_conjuncts);
                }
                cdolist_list_var = cdolist_list_var.rest();
                conjunct = cdolist_list_var.first();
            }
        }
        else if (v_term.equal(cycl_utilities.formula_arg1(constraints, (SubLObject)rkf_tools.UNPROVIDED))) {
            result_conjuncts = (SubLObject)ConsesLow.cons(constraints, result_conjuncts);
        }
        if (rkf_tools.NIL != result_conjuncts) {
            return simplifier.nconjoin(Sequences.nreverse(result_conjuncts), (SubLObject)rkf_tools.T);
        }
        return (SubLObject)rkf_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 5137L)
    public static SubLObject rkf_explicit_constraints(final SubLObject sentence, final SubLObject v_term) {
        if (rkf_tools.NIL != el_utilities.el_conjunction_p(sentence)) {
            SubLObject result = (SubLObject)rkf_tools.NIL;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, (SubLObject)rkf_tools.$kw4$IGNORE);
            SubLObject conjunct = (SubLObject)rkf_tools.NIL;
            conjunct = cdolist_list_var.first();
            while (rkf_tools.NIL != cdolist_list_var) {
                if ((rkf_tools.NIL != cycl_utilities.atomic_sentence_with_pred_p(conjunct, rkf_tools.$const3$isa) || rkf_tools.NIL != cycl_utilities.atomic_sentence_with_pred_p(conjunct, rkf_tools.$const2$genls)) && v_term.equal(cycl_utilities.formula_arg1(conjunct, (SubLObject)rkf_tools.UNPROVIDED))) {
                    result = (SubLObject)ConsesLow.cons(conjunct, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                conjunct = cdolist_list_var.first();
            }
            return simplifier.nconjoin(result, (SubLObject)rkf_tools.UNPROVIDED);
        }
        return (SubLObject)rkf_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 5701L)
    public static SubLObject rkf_type_constraints(final SubLObject v_term, final SubLObject formula, SubLObject mt) {
        if (mt == rkf_tools.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)rkf_tools.NIL;
        final SubLObject var_formula = conses_high.subst((SubLObject)rkf_tools.$sym5$__TERM, v_term, formula, Symbols.symbol_function((SubLObject)rkf_tools.EQUAL), (SubLObject)rkf_tools.UNPROVIDED);
        final SubLObject clean_formula = conses_high.subst_if(rkf_tools.$const6$Thing, (SubLObject)rkf_tools.$sym7$RKF_CH_PARSING_SURROGATE_P, var_formula, (SubLObject)rkf_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = wff_vars.$validate_expansionsP$.currentBinding(thread);
        try {
            wff_vars.$validate_expansionsP$.bind((SubLObject)rkf_tools.T, thread);
            final SubLObject implicit_constraints = at_var_types.formula_variables_arg_constraints(clean_formula, mt, (SubLObject)rkf_tools.UNPROVIDED);
            final SubLObject filtered_constraints = rkf_remove_unmentioned_constraints((SubLObject)rkf_tools.$sym5$__TERM, implicit_constraints);
            final SubLObject fixed_constraints = (SubLObject)((rkf_tools.NIL != filtered_constraints) ? filtered_constraints : rkf_tools.$list8);
            final SubLObject constraint_set = result = conses_high.subst(v_term, (SubLObject)rkf_tools.$sym5$__TERM, fixed_constraints, Symbols.symbol_function((SubLObject)rkf_tools.EQUAL), (SubLObject)rkf_tools.UNPROVIDED);
        }
        finally {
            wff_vars.$validate_expansionsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 6515L)
    public static SubLObject rkf_type_constraint_set(final SubLObject v_term, final SubLObject formula, SubLObject mt) {
        if (mt == rkf_tools.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        final SubLObject constraint_formula = rkf_type_constraints(v_term, formula, mt);
        final SubLObject normalized_formula = conses_high.subst((SubLObject)rkf_tools.$sym9$_OBJ, v_term, constraint_formula, (SubLObject)rkf_tools.UNPROVIDED, (SubLObject)rkf_tools.UNPROVIDED);
        final SubLObject set_formula = (SubLObject)ConsesLow.list(rkf_tools.$const10$TheSetOf, (SubLObject)rkf_tools.$sym9$_OBJ, normalized_formula);
        return set_formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 6960L)
    public static SubLObject rkf_type_constraint_isas_and_genls(final SubLObject v_term, final SubLObject formula, SubLObject mt) {
        if (mt == rkf_tools.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        SubLObject constraint_formula = rkf_type_constraints(v_term, formula, mt);
        SubLObject isas = (SubLObject)rkf_tools.NIL;
        SubLObject v_genls = (SubLObject)rkf_tools.NIL;
        if (!cycl_utilities.formula_arg0(constraint_formula).eql(rkf_tools.$const11$and)) {
            constraint_formula = el_utilities.make_unary_formula(rkf_tools.$const11$and, constraint_formula);
        }
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(constraint_formula, (SubLObject)rkf_tools.$kw4$IGNORE);
        SubLObject var = (SubLObject)rkf_tools.NIL;
        var = cdolist_list_var.first();
        while (rkf_tools.NIL != cdolist_list_var) {
            if (var.isList()) {
                if (cycl_utilities.formula_arg0(var).eql(rkf_tools.$const2$genls)) {
                    v_genls = (SubLObject)ConsesLow.cons(cycl_utilities.formula_arg2(var, (SubLObject)rkf_tools.UNPROVIDED), v_genls);
                }
                else if (cycl_utilities.formula_arg0(var).eql(rkf_tools.$const3$isa)) {
                    isas = (SubLObject)ConsesLow.cons(cycl_utilities.formula_arg2(var, (SubLObject)rkf_tools.UNPROVIDED), isas);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        }
        return Values.values(isas, v_genls);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 8160L)
    public static SubLObject rkf_substitute_terms_in_sentence(final SubLObject in_term, final SubLObject out_term, SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_tools.NIL != rkf_tools.$rkf_common_sentences_recurseP$.getDynamicValue(thread)) {
            final SubLObject swap_alist = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(out_term, in_term));
            return cycl_utilities.expression_sublis(swap_alist, sentence, Symbols.symbol_function((SubLObject)rkf_tools.EQUAL), (SubLObject)rkf_tools.UNPROVIDED);
        }
        if (rkf_tools.NIL != el_utilities.formula_with_sequence_termP(sentence)) {
            sentence = el_utilities.strip_sequence_var(sentence);
        }
        return Sequences.substitute(in_term, out_term, sentence, Symbols.symbol_function((SubLObject)rkf_tools.EQUAL), (SubLObject)rkf_tools.UNPROVIDED, (SubLObject)rkf_tools.UNPROVIDED, (SubLObject)rkf_tools.UNPROVIDED, (SubLObject)rkf_tools.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 8677L)
    public static SubLObject rkf_general_reference_formula_equal(final SubLObject reference, final SubLObject formula) {
        if (reference.eql(formula)) {
            return (SubLObject)rkf_tools.T;
        }
        if (!formula.isCons()) {
            return (SubLObject)rkf_tools.NIL;
        }
        if (!reference.isCons()) {
            return (SubLObject)rkf_tools.NIL;
        }
        if (reference.first() == rkf_tools.$kw12$TERM && formula.first() == rkf_tools.$kw12$TERM) {
            if (rkf_tools.NIL != reference.rest() && rkf_tools.NIL != formula.rest()) {
                return (SubLObject)SubLObjectFactory.makeBoolean(conses_high.cadr(reference).equal(conses_high.cadr(formula)) || rkf_tools.NIL != Strings.string_equal(conses_high.cadr(reference), conses_high.cadr(formula), (SubLObject)rkf_tools.UNPROVIDED, (SubLObject)rkf_tools.UNPROVIDED, (SubLObject)rkf_tools.UNPROVIDED, (SubLObject)rkf_tools.UNPROVIDED));
            }
            return Equality.equal(reference.rest(), formula.rest());
        }
        else {
            if (formula.first() == rkf_tools.$kw12$TERM && rkf_tools.NIL != formula.rest() && conses_high.cadr(formula).equal(reference)) {
                return (SubLObject)rkf_tools.T;
            }
            return Equality.equal(reference, formula);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 9429L)
    public static SubLObject rkf_gather_term_references(final SubLObject formula) {
        return list_utilities.tree_gather(formula, Symbols.symbol_function((SubLObject)rkf_tools.$sym13$RKF_TERM_REFERENCE_P), Symbols.symbol_function((SubLObject)rkf_tools.$sym14$RKF_GENERAL_REFERENCE_FORMULA_EQUAL), (SubLObject)rkf_tools.UNPROVIDED, (SubLObject)rkf_tools.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 9574L)
    public static SubLObject rkf_gather_local_term_references(final SubLObject formula) {
        return list_utilities.tree_gather(formula, Symbols.symbol_function((SubLObject)rkf_tools.$sym15$RKF_LOCAL_TERM_REFERENCE_P), Symbols.symbol_function((SubLObject)rkf_tools.$sym16$RKF_LOCAL_TERM_EQUAL), (SubLObject)rkf_tools.UNPROVIDED, (SubLObject)rkf_tools.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 9716L)
    public static SubLObject rkf_gather_term_references_as_bindings(final SubLObject formula) {
        if (formula.isAtom()) {
            return (SubLObject)rkf_tools.NIL;
        }
        final SubLObject functor = formula.first();
        final SubLObject args = formula.rest();
        if (functor.eql(rkf_tools.$const2$genls)) {
            if (rkf_tools.NIL != cycl_variables.el_varP(args.first()) && rkf_tools.NIL != rkf_term_reference_p(conses_high.cadr(args))) {
                return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(args.first(), conses_high.cadr(conses_high.cadr(args))));
            }
            return (SubLObject)rkf_tools.NIL;
        }
        else if (functor.eql(rkf_tools.$const3$isa)) {
            if (rkf_tools.NIL != cycl_variables.el_varP(args.first()) && rkf_tools.NIL != rkf_term_reference_p(conses_high.cadr(args))) {
                return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(args.first(), conses_high.cadr(conses_high.cadr(args))));
            }
            return (SubLObject)rkf_tools.NIL;
        }
        else {
            if (functor.eql(rkf_tools.$const11$and)) {
                SubLObject result = (SubLObject)rkf_tools.NIL;
                SubLObject cdolist_list_var = args;
                SubLObject arg = (SubLObject)rkf_tools.NIL;
                arg = cdolist_list_var.first();
                while (rkf_tools.NIL != cdolist_list_var) {
                    result = ConsesLow.nconc(result, rkf_gather_term_references_as_bindings(arg));
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                }
                return result;
            }
            if (functor.eql(rkf_tools.$const17$or)) {
                SubLObject result = (SubLObject)rkf_tools.NIL;
                SubLObject cdolist_list_var = args;
                SubLObject arg = (SubLObject)rkf_tools.NIL;
                arg = cdolist_list_var.first();
                while (rkf_tools.NIL != cdolist_list_var) {
                    result = ConsesLow.nconc(result, rkf_gather_term_references_as_bindings(arg));
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                }
                return result;
            }
            if (functor.eql(rkf_tools.$const18$implies)) {
                return ConsesLow.nconc(rkf_gather_term_references_as_bindings(args.first()), rkf_gather_term_references_as_bindings(conses_high.cadr(args)));
            }
            return (SubLObject)rkf_tools.NIL;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 10910L)
    public static SubLObject rkf_term_reference_p(final SubLObject obj) {
        if (rkf_tools.NIL != list_utilities.proper_list_p(obj)) {
            final SubLObject length = Sequences.length(obj);
            return (SubLObject)SubLObjectFactory.makeBoolean(rkf_tools.$kw12$TERM == obj.first() && (length.numE((SubLObject)rkf_tools.TWO_INTEGER) || length.numE((SubLObject)rkf_tools.THREE_INTEGER)) && conses_high.second(obj).isString());
        }
        return (SubLObject)rkf_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 11147L)
    public static SubLObject rkf_local_term_reference_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_tools.NIL != list_utilities.proper_list_p(obj) && Sequences.length(obj).numE((SubLObject)rkf_tools.THREE_INTEGER) && conses_high.second(obj).isString() && conses_high.third(obj).isNumber());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 11299L)
    public static SubLObject rkf_term_reference_term(final SubLObject obj) {
        if (rkf_tools.NIL != rkf_term_reference_p(obj)) {
            return conses_high.second(obj);
        }
        return (SubLObject)rkf_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 11421L)
    public static SubLObject rkf_preferred_reference(final SubLObject fort, final SubLObject string, final SubLObject lexification_mt, SubLObject pred) {
        if (pred == rkf_tools.UNPROVIDED) {
            pred = (SubLObject)rkf_tools.$kw19$DEFAULT;
        }
        assert rkf_tools.NIL != forts.fort_p(fort) : fort;
        assert rkf_tools.NIL != Types.stringp(string) : string;
        assert rkf_tools.NIL != hlmt.hlmt_p(lexification_mt) : lexification_mt;
        if (pred == rkf_tools.$kw19$DEFAULT) {
            pred = rkf_tools.$const23$preferredTermStrings;
        }
        assert rkf_tools.NIL != fort_types_interface.predicate_p(pred) : pred;
        rkf_assertion_utilities.rkf_assert((SubLObject)ConsesLow.list(pred, fort, string), lexification_mt, (SubLObject)rkf_tools.UNPROVIDED, (SubLObject)rkf_tools.UNPROVIDED);
        return (SubLObject)rkf_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 11868L)
    public static SubLObject rkf_phrase_candidate_terms(final SubLObject phrase, final SubLObject parsing_mt, final SubLObject domain_mt, SubLObject parse_template) {
        if (parse_template == rkf_tools.UNPROVIDED) {
            parse_template = (SubLObject)rkf_tools.NIL;
        }
        assert rkf_tools.NIL != Types.stringp(phrase) : phrase;
        SubLObject candidate_terms = (SubLObject)rkf_tools.NIL;
        final SubLObject parses = rkf_text_processors.rkf_term_reader(phrase, parsing_mt, domain_mt, parse_template);
        if (rkf_tools.NIL != parses) {
            SubLObject current;
            final SubLObject datum = current = parses.first();
            SubLObject span = (SubLObject)rkf_tools.NIL;
            SubLObject interpretations = (SubLObject)rkf_tools.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_tools.$list25);
            span = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_tools.$list25);
            interpretations = current.first();
            current = current.rest();
            if (rkf_tools.NIL == current) {
                candidate_terms = interpretations;
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_tools.$list25);
            }
        }
        candidate_terms = rkf_relevance_utilities.rkf_filter_irrelevant_terms(candidate_terms, domain_mt);
        return candidate_terms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 12538L)
    public static SubLObject rkf_phrase_candidate_terms_in_sentence(final SubLObject phrase, final SubLObject parsing_mt, final SubLObject domain_mt) {
        assert rkf_tools.NIL != Types.stringp(phrase) : phrase;
        SubLObject candidate_terms = (SubLObject)rkf_tools.NIL;
        final SubLObject parses = rkf_text_processors.rkf_term_in_sentence_reader(phrase, parsing_mt, domain_mt, (SubLObject)rkf_tools.UNPROVIDED);
        final SubLObject token_count = Sequences.length(rkf_concept_harvester.rkf_ch_string_tokenize(phrase));
        final SubLObject full_span = rkf_phrase_candidate_helper_generate_span((SubLObject)rkf_tools.ZERO_INTEGER, Numbers.subtract(token_count, (SubLObject)rkf_tools.ONE_INTEGER));
        SubLObject cdolist_list_var = parses;
        SubLObject parse_for_span = (SubLObject)rkf_tools.NIL;
        parse_for_span = cdolist_list_var.first();
        while (rkf_tools.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = parse_for_span;
            SubLObject span = (SubLObject)rkf_tools.NIL;
            SubLObject interpretations = (SubLObject)rkf_tools.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_tools.$list25);
            span = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_tools.$list25);
            interpretations = current.first();
            current = current.rest();
            if (rkf_tools.NIL == current) {
                if (full_span.equalp(span)) {
                    candidate_terms = Sequences.cconcatenate(candidate_terms, interpretations);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_tools.$list25);
            }
            cdolist_list_var = cdolist_list_var.rest();
            parse_for_span = cdolist_list_var.first();
        }
        candidate_terms = rkf_relevance_utilities.rkf_filter_irrelevant_terms(candidate_terms, domain_mt);
        return candidate_terms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 13519L)
    public static SubLObject rkf_phrase_candidate_helper_generate_span(final SubLObject lower, final SubLObject upper) {
        final SubLObject count = Numbers.add(Numbers.subtract(upper, lower), (SubLObject)rkf_tools.ONE_INTEGER);
        SubLObject span = (SubLObject)rkf_tools.NIL;
        SubLObject i;
        for (i = (SubLObject)rkf_tools.NIL, i = (SubLObject)rkf_tools.ZERO_INTEGER; i.numL(count); i = Numbers.add(i, (SubLObject)rkf_tools.ONE_INTEGER)) {
            span = (SubLObject)ConsesLow.cons(Numbers.subtract(upper, i), span);
        }
        return span;
    }
    
    public static SubLObject declare_rkf_tools_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_tools", "initialize_rkf_kb_feature", "INITIALIZE-RKF-KB-FEATURE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_tools", "rkf_compare_terms", "RKF-COMPARE-TERMS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_tools", "rkf_sentences_in_common", "RKF-SENTENCES-IN-COMMON", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_tools", "rkf_relevant_and_knownP", "RKF-RELEVANT-AND-KNOWN?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_tools", "rkf_remove_unmentioned_constraints", "RKF-REMOVE-UNMENTIONED-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_tools", "rkf_explicit_constraints", "RKF-EXPLICIT-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_tools", "rkf_type_constraints", "RKF-TYPE-CONSTRAINTS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_tools", "rkf_type_constraint_set", "RKF-TYPE-CONSTRAINT-SET", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_tools", "rkf_type_constraint_isas_and_genls", "RKF-TYPE-CONSTRAINT-ISAS-AND-GENLS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_tools", "rkf_substitute_terms_in_sentence", "RKF-SUBSTITUTE-TERMS-IN-SENTENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_tools", "rkf_general_reference_formula_equal", "RKF-GENERAL-REFERENCE-FORMULA-EQUAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_tools", "rkf_gather_term_references", "RKF-GATHER-TERM-REFERENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_tools", "rkf_gather_local_term_references", "RKF-GATHER-LOCAL-TERM-REFERENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_tools", "rkf_gather_term_references_as_bindings", "RKF-GATHER-TERM-REFERENCES-AS-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_tools", "rkf_term_reference_p", "RKF-TERM-REFERENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_tools", "rkf_local_term_reference_p", "RKF-LOCAL-TERM-REFERENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_tools", "rkf_term_reference_term", "RKF-TERM-REFERENCE-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_tools", "rkf_preferred_reference", "RKF-PREFERRED-REFERENCE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_tools", "rkf_phrase_candidate_terms", "RKF-PHRASE-CANDIDATE-TERMS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_tools", "rkf_phrase_candidate_terms_in_sentence", "RKF-PHRASE-CANDIDATE-TERMS-IN-SENTENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_tools", "rkf_phrase_candidate_helper_generate_span", "RKF-PHRASE-CANDIDATE-HELPER-GENERATE-SPAN", 2, 0, false);
        return (SubLObject)rkf_tools.NIL;
    }
    
    public static SubLObject init_rkf_tools_file() {
        rkf_tools.$rkf_core_constants$ = SubLFiles.deflexical("*RKF-CORE-CONSTANTS*", (SubLObject)rkf_tools.$list0);
        rkf_tools.$rkf_max_arity$ = SubLFiles.deflexical("*RKF-MAX-ARITY*", (SubLObject)rkf_tools.FIVE_INTEGER);
        rkf_tools.$rkf_common_sentences_recurseP$ = SubLFiles.defparameter("*RKF-COMMON-SENTENCES-RECURSE?*", (SubLObject)rkf_tools.NIL);
        return (SubLObject)rkf_tools.NIL;
    }
    
    public static SubLObject setup_rkf_tools_file() {
        return (SubLObject)rkf_tools.NIL;
    }
    
    public void declareFunctions() {
        declare_rkf_tools_file();
    }
    
    public void initializeVariables() {
        init_rkf_tools_file();
    }
    
    public void runTopLevelForms() {
        setup_rkf_tools_file();
    }
    
    static {
        me = (SubLFile)new rkf_tools();
        rkf_tools.$rkf_core_constants$ = null;
        rkf_tools.$rkf_max_arity$ = null;
        rkf_tools.$rkf_common_sentences_recurseP$ = null;
        $list0 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("inheritedTermSentences")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termDependsOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ScenarioInstanceFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheNthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("scenarioTerms")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtTopic")));
        $sym1$VALID_CONSTANT_ = SubLObjectFactory.makeSymbol("VALID-CONSTANT?");
        $const2$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $const3$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw4$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $sym5$__TERM = SubLObjectFactory.makeSymbol("??TERM");
        $const6$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $sym7$RKF_CH_PARSING_SURROGATE_P = SubLObjectFactory.makeSymbol("RKF-CH-PARSING-SURROGATE-P");
        $list8 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("??TERM"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")));
        $sym9$_OBJ = SubLObjectFactory.makeSymbol("?OBJ");
        $const10$TheSetOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf"));
        $const11$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $kw12$TERM = SubLObjectFactory.makeKeyword("TERM");
        $sym13$RKF_TERM_REFERENCE_P = SubLObjectFactory.makeSymbol("RKF-TERM-REFERENCE-P");
        $sym14$RKF_GENERAL_REFERENCE_FORMULA_EQUAL = SubLObjectFactory.makeSymbol("RKF-GENERAL-REFERENCE-FORMULA-EQUAL");
        $sym15$RKF_LOCAL_TERM_REFERENCE_P = SubLObjectFactory.makeSymbol("RKF-LOCAL-TERM-REFERENCE-P");
        $sym16$RKF_LOCAL_TERM_EQUAL = SubLObjectFactory.makeSymbol("RKF-LOCAL-TERM-EQUAL");
        $const17$or = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or"));
        $const18$implies = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies"));
        $kw19$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $sym20$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym21$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym22$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $const23$preferredTermStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("preferredTermStrings"));
        $sym24$PREDICATE_P = SubLObjectFactory.makeSymbol("PREDICATE-P");
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPAN"), (SubLObject)SubLObjectFactory.makeSymbol("INTERPRETATIONS"));
    }
}

/*

	Total time: 181 ms
	
*/