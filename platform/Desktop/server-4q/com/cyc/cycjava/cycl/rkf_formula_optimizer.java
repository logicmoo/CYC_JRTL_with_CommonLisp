package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_formula_optimizer extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rkf_formula_optimizer";
    public static final String myFingerPrint = "9bcbd17bd85c564c5e2a36dd7843280300206abb00755d937a84c77d51a6bd11";
    @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 967L)
    public static SubLSymbol $rkf_reformulator_replace_pronounsP$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 2322L)
    public static SubLSymbol $rkf_sharpen_preds$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 2435L)
    public static SubLSymbol $rkf_return_multiple_quantificationsP$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 10272L)
    public static SubLSymbol $rkf_late_pronoun_substitutionP$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 10335L)
    private static SubLSymbol $rkf_meaning_of_you$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 10500L)
    private static SubLSymbol $rkf_meaning_of_me$;
    private static final SubLSymbol $sym0$EL_FORMULA_P;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$QUESTION;
    private static final SubLSymbol $kw3$ASSERTION;
    private static final SubLSymbol $kw4$DECLARATIVE;
    private static final SubLString $str5$Optimizing_internal_representatio;
    private static final SubLSymbol $sym6$RKF_REFORMULATOR_SENTENCES_EQUAL_;
    private static final SubLObject $const7$PronounFn;
    private static final SubLSymbol $sym8$REPLACE_PRONOUNS_IN_CYCL;
    private static final SubLObject $const9$CycProgram;
    private static final SubLSymbol $sym10$SECOND_PERSON_PRONOUN_;
    private static final SubLSymbol $sym11$REPLACE_WITH_YOU;
    private static final SubLSymbol $sym12$FIRST_PERSON_PRONOUN_;
    private static final SubLSymbol $sym13$REPLACE_WITH_ME;
    private static final SubLObject $const14$SecondPerson_NLAttr;
    private static final SubLObject $const15$FirstPerson_NLAttr;
    private static final SubLString $str16$return_multiple_reformulations;
    private static final SubLString $str17$rkf_formula_optimizer_test_suite;
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 1144L)
    public static SubLObject rkf_optimize_assert_formula(final SubLObject assert_formula, final SubLObject domain_mt) {
        assert rkf_formula_optimizer.NIL != el_utilities.el_formula_p(assert_formula) : assert_formula;
        final SubLObject except_whenP = rkf_exception_formulaP(assert_formula);
        return (rkf_formula_optimizer.NIL != except_whenP) ? reformulator_utilities.reformulate_cycl_exception_rules(assert_formula, domain_mt, (SubLObject)rkf_formula_optimizer.UNPROVIDED) : reformulator_hub.reformulate_cycl(assert_formula, domain_mt, (SubLObject)rkf_formula_optimizer.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 1538L)
    public static SubLObject rkf_optimize_query_formula(final SubLObject query_formula, final SubLObject domain_mt) {
        assert rkf_formula_optimizer.NIL != el_utilities.el_formula_p(query_formula) : query_formula;
        return reformulator_hub.reformulate_cycl(query_formula, domain_mt, (SubLObject)rkf_formula_optimizer.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 1894L)
    public static SubLObject rkf_optimize_formula(final SubLObject formula, final SubLObject domain_mt) {
        assert rkf_formula_optimizer.NIL != el_utilities.el_formula_p(formula) : formula;
        return reformulator_hub.reformulate_cycl(formula, domain_mt, (SubLObject)rkf_formula_optimizer.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 2075L)
    public static SubLObject rkf_exception_formulaP(final SubLObject formula) {
        SubLObject exceptionP = (SubLObject)rkf_formula_optimizer.NIL;
        if (rkf_formula_optimizer.NIL == exceptionP) {
            SubLObject csome_list_var;
            SubLObject exception_term;
            for (csome_list_var = (SubLObject)rkf_formula_optimizer.$list1, exception_term = (SubLObject)rkf_formula_optimizer.NIL, exception_term = csome_list_var.first(); rkf_formula_optimizer.NIL == exceptionP && rkf_formula_optimizer.NIL != csome_list_var; exceptionP = cycl_utilities.expression_find(exception_term, formula, (SubLObject)rkf_formula_optimizer.UNPROVIDED, (SubLObject)rkf_formula_optimizer.UNPROVIDED, (SubLObject)rkf_formula_optimizer.UNPROVIDED), csome_list_var = csome_list_var.rest(), exception_term = csome_list_var.first()) {}
        }
        return exceptionP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 2584L)
    public static SubLObject rkf_reformulate_query_formula(final SubLObject formula, final SubLObject domain_mt, SubLObject constraints) {
        if (constraints == rkf_formula_optimizer.UNPROVIDED) {
            constraints = (SubLObject)rkf_formula_optimizer.NIL;
        }
        return rkf_reformulate_into_many(formula, domain_mt, (SubLObject)rkf_formula_optimizer.T, (SubLObject)rkf_formula_optimizer.$kw2$QUESTION, constraints);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 2754L)
    public static SubLObject rkf_reformulate_assert_formula(final SubLObject formula, final SubLObject domain_mt, SubLObject constraints) {
        if (constraints == rkf_formula_optimizer.UNPROVIDED) {
            constraints = (SubLObject)rkf_formula_optimizer.NIL;
        }
        return rkf_reformulate_and_sharpen_into_many(formula, domain_mt, (SubLObject)rkf_formula_optimizer.$kw3$ASSERTION, constraints);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 2936L)
    public static SubLObject rkf_reformulate_and_sharpen_into_many(final SubLObject assert_formula, final SubLObject domain_mt, SubLObject force, SubLObject constraints) {
        if (force == rkf_formula_optimizer.UNPROVIDED) {
            force = (SubLObject)rkf_formula_optimizer.$kw4$DECLARATIVE;
        }
        if (constraints == rkf_formula_optimizer.UNPROVIDED) {
            constraints = (SubLObject)rkf_formula_optimizer.NIL;
        }
        rkf_mumbler.rkf_mumble((SubLObject)rkf_formula_optimizer.$str5$Optimizing_internal_representatio, (SubLObject)rkf_formula_optimizer.UNPROVIDED);
        return rkf_reformulate_into_many(assert_formula, domain_mt, (SubLObject)rkf_formula_optimizer.T, force, constraints);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 3217L)
    public static SubLObject rkf_reformulate_before_strengthening_old_qp(SubLObject formula, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        formula = reformulator_utilities_nl.reformulate_cycl_the_coordination_set_removal(formula, domain_mt);
        formula = reformulator_utilities_nl.reformulate_cycl_quantopt(formula, domain_mt, (SubLObject)rkf_formula_optimizer.UNPROVIDED);
        if (rkf_formula_optimizer.NIL != reformulator_utilities_nl.try_process_reformulator_for_quantunifyP(formula)) {
            formula = reformulator_utilities_nl.reformulate_cycl_quantunify(formula, domain_mt, (SubLObject)rkf_formula_optimizer.UNPROVIDED);
        }
        if (rkf_formula_optimizer.NIL != reformulator_utilities_nl.try_process_reformulator_for_vppproc_stateP(formula)) {
            formula = reformulator_utilities_nl.reformulate_cycl_vppproc_state(formula, domain_mt, (SubLObject)rkf_formula_optimizer.UNPROVIDED);
        }
        formula = reformulator_utilities_nl.reformulate_cycl_quantproc_rules(formula, domain_mt, (SubLObject)rkf_formula_optimizer.UNPROVIDED);
        formula = reformulator_utilities_nl.reformulate_cycl_quantproc(formula, domain_mt, (SubLObject)rkf_formula_optimizer.UNPROVIDED);
        if (rkf_formula_optimizer.NIL != reformulator_utilities_nl.try_process_reformulator_for_vppproc_nonstateP(formula)) {
            formula = reformulator_utilities_nl.reformulate_cycl_vppproc_nonstate(formula, domain_mt, (SubLObject)rkf_formula_optimizer.UNPROVIDED);
        }
        formula = reformulator_utilities_nl.reformulate_cycl_subcollproc(formula, domain_mt, (SubLObject)rkf_formula_optimizer.UNPROVIDED);
        formula = reformulator_utilities_nl.reformulate_cycl_quantproc(formula, domain_mt, (SubLObject)rkf_formula_optimizer.UNPROVIDED);
        if (rkf_formula_optimizer.NIL != rkf_formula_optimizer.$rkf_reformulator_replace_pronounsP$.getDynamicValue(thread) && rkf_formula_optimizer.NIL != rkf_formula_optimizer.$rkf_late_pronoun_substitutionP$.getDynamicValue(thread)) {
            formula = replace_pronouns_in_cycl(formula);
        }
        return formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 4769L)
    public static SubLObject rkf_reformulate_before_strengthening_qp_3(SubLObject formula, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject formulas = (SubLObject)rkf_formula_optimizer.NIL;
        formula = reformulator_utilities_nl.reformulate_cycl_the_coordination_set_removal(formula, domain_mt);
        formula = reformulator_utilities_nl.reformulate_cycl_quantopt_3(formula, domain_mt, (SubLObject)rkf_formula_optimizer.UNPROVIDED);
        if (rkf_formula_optimizer.NIL != reformulator_utilities_nl.try_process_reformulator_for_quantunify_3P(formula)) {
            formula = reformulator_utilities_nl.reformulate_cycl_quantunify_3(formula, domain_mt, (SubLObject)rkf_formula_optimizer.UNPROVIDED);
        }
        if (rkf_formula_optimizer.NIL != reformulator_utilities_nl.try_process_reformulator_for_vppproc_stateP(formula)) {
            formula = reformulator_utilities_nl.reformulate_cycl_vppproc_state(formula, domain_mt, (SubLObject)rkf_formula_optimizer.UNPROVIDED);
        }
        if (rkf_formula_optimizer.NIL != rkf_formula_optimizer.$rkf_return_multiple_quantificationsP$.getDynamicValue(thread) && rkf_formula_optimizer.NIL != el_utilities.el_formula_p(formula)) {
            formulas = reformulator_module_quantifier_processing_3.quantproc_3_el_formula_permutations(formula);
        }
        else {
            formulas = (SubLObject)ConsesLow.list(formula);
        }
        formulas = reformulator_utilities_nl.reformulate_cycls_quantproc_3_rules(formulas, domain_mt, (SubLObject)rkf_formula_optimizer.UNPROVIDED);
        formulas = reformulator_utilities_nl.reformulate_cycls_quantproc_3(formulas, domain_mt, (SubLObject)rkf_formula_optimizer.UNPROVIDED);
        formulas = reformulator_utilities_nl.try_to_reformulate_cycls_vppproc_nonstate(formulas, domain_mt, (SubLObject)rkf_formula_optimizer.UNPROVIDED);
        formulas = reformulator_utilities_nl.reformulate_cycl_subcollproc(formulas, domain_mt, (SubLObject)rkf_formula_optimizer.UNPROVIDED);
        formulas = reformulator_utilities_nl.reformulate_cycls_quantproc_3(formulas, domain_mt, (SubLObject)rkf_formula_optimizer.UNPROVIDED);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(domain_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            formulas = Sequences.remove_duplicates(formulas, Symbols.symbol_function((SubLObject)rkf_formula_optimizer.$sym6$RKF_REFORMULATOR_SENTENCES_EQUAL_), (SubLObject)rkf_formula_optimizer.UNPROVIDED, (SubLObject)rkf_formula_optimizer.UNPROVIDED, (SubLObject)rkf_formula_optimizer.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (rkf_formula_optimizer.NIL != rkf_formula_optimizer.$rkf_reformulator_replace_pronounsP$.getDynamicValue(thread) && rkf_formula_optimizer.NIL != rkf_formula_optimizer.$rkf_late_pronoun_substitutionP$.getDynamicValue(thread)) {
            formulas = replace_pronouns_in_cycls(formulas);
        }
        formulas = reformulator_utilities.reformulate_cycls(formulas, domain_mt, (SubLObject)rkf_formula_optimizer.UNPROVIDED);
        return formulas;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 6897L)
    public static SubLObject rkf_reformulate_before_strengthening(final SubLObject formula, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_formula_optimizer.NIL == parsing_vars.$use_ternary_np_tagsP$.getDynamicValue(thread)) {
            return rkf_reformulate_before_strengthening_old_qp((SubLObject)ConsesLow.list(formula), domain_mt);
        }
        return rkf_reformulate_before_strengthening_qp_3(formula, domain_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 7324L)
    public static SubLObject rkf_tersify(final SubLObject formula, final SubLObject domain_mt) {
        return formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 7611L)
    public static SubLObject rkf_reformulate_into_many(final SubLObject formula, final SubLObject domain_mt, SubLObject strengthenP, SubLObject force, SubLObject constraints) {
        if (strengthenP == rkf_formula_optimizer.UNPROVIDED) {
            strengthenP = (SubLObject)rkf_formula_optimizer.NIL;
        }
        if (force == rkf_formula_optimizer.UNPROVIDED) {
            force = (SubLObject)rkf_formula_optimizer.$kw3$ASSERTION;
        }
        if (constraints == rkf_formula_optimizer.UNPROVIDED) {
            constraints = (SubLObject)rkf_formula_optimizer.NIL;
        }
        SubLObject new_cycl = (SubLObject)rkf_formula_optimizer.NIL;
        SubLObject improvements = (SubLObject)rkf_formula_optimizer.NIL;
        final SubLObject drt_result = (SubLObject)rkf_formula_optimizer.T;
        SubLObject formulas = (SubLObject)rkf_formula_optimizer.NIL;
        SubLObject shifted_cycl = (SubLObject)rkf_formula_optimizer.NIL;
        formulas = rkf_reformulate_before_strengthening(formula, domain_mt);
        if (force == rkf_formula_optimizer.$kw2$QUESTION) {
            formulas = reformulator_utilities.reformulate_query_cycls(formulas, domain_mt, (SubLObject)rkf_formula_optimizer.UNPROVIDED);
        }
        SubLObject cdolist_list_var = formulas;
        SubLObject formula_$1 = (SubLObject)rkf_formula_optimizer.NIL;
        formula_$1 = cdolist_list_var.first();
        while (rkf_formula_optimizer.NIL != cdolist_list_var) {
            if (rkf_formula_optimizer.NIL != strengthenP) {
                improvements = Sequences.cconcatenate(improvements, predicate_strengthener.pred_strengthen_formula(formula_$1, domain_mt, constraints));
            }
            cdolist_list_var = cdolist_list_var.rest();
            formula_$1 = cdolist_list_var.first();
        }
        if (rkf_formula_optimizer.NIL == improvements) {
            improvements = formulas;
        }
        SubLObject reformed_results = (SubLObject)rkf_formula_optimizer.NIL;
        SubLObject cdolist_list_var2 = improvements;
        SubLObject formula_$2 = (SubLObject)rkf_formula_optimizer.NIL;
        formula_$2 = cdolist_list_var2.first();
        while (rkf_formula_optimizer.NIL != cdolist_list_var2) {
            new_cycl = reformulator_hub.reformulate_cycl(formula_$2, domain_mt, (SubLObject)rkf_formula_optimizer.UNPROVIDED);
            if (rkf_formula_optimizer.NIL != new_cycl) {
                reformed_results = (SubLObject)ConsesLow.cons(new_cycl, reformed_results);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            formula_$2 = cdolist_list_var2.first();
        }
        if (rkf_formula_optimizer.NIL != reformed_results) {
            improvements = reformed_results;
        }
        cdolist_list_var = improvements;
        SubLObject cycl_option = (SubLObject)rkf_formula_optimizer.NIL;
        cycl_option = cdolist_list_var.first();
        while (rkf_formula_optimizer.NIL != cdolist_list_var) {
            if (rkf_formula_optimizer.NIL != el_utilities.el_formula_p(cycl_option)) {
                final SubLObject uniform = rkf_optimize_assert_formula(cycl_option, domain_mt);
                final SubLObject shifted = reformulator_utilities_nl.reformulate_cycl_typeshift(uniform, domain_mt, (SubLObject)rkf_formula_optimizer.UNPROVIDED);
                if (rkf_formula_optimizer.NIL != shifted) {
                    shifted_cycl = (SubLObject)ConsesLow.cons(shifted, shifted_cycl);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            cycl_option = cdolist_list_var.first();
        }
        return shifted_cycl;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 9425L)
    public static SubLObject expression_contains_pronounP(final SubLObject expression) {
        return list_utilities.sublisp_boolean(cycl_utilities.expression_find(rkf_formula_optimizer.$const7$PronounFn, expression, (SubLObject)rkf_formula_optimizer.T, (SubLObject)rkf_formula_optimizer.UNPROVIDED, (SubLObject)rkf_formula_optimizer.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 9548L)
    public static SubLObject formula_list_p(final SubLObject formulas) {
        return (SubLObject)SubLObjectFactory.makeBoolean(formulas.isList() && rkf_formula_optimizer.NIL != list_utilities.every_in_list((SubLObject)rkf_formula_optimizer.$sym0$EL_FORMULA_P, formulas, (SubLObject)rkf_formula_optimizer.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 9729L)
    public static SubLObject replace_pronouns_in_cycls(final SubLObject formulas) {
        return Mapping.mapcar((SubLObject)rkf_formula_optimizer.$sym8$REPLACE_PRONOUNS_IN_CYCL, formulas);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 9847L)
    public static SubLObject replace_pronouns_in_cycl(SubLObject formula) {
        formula = replace_first_person_pronouns_in_cycl(formula, operation_communication.the_cyclist());
        formula = replace_second_person_pronouns_in_cycl(formula, rkf_formula_optimizer.$const9$CycProgram);
        return formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 10665L)
    public static SubLObject replace_second_person_pronouns_in_cycl(SubLObject formula, final SubLObject meaning_of_you) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_formula_optimizer.NIL == second_person_pronounP(meaning_of_you)) {
            final SubLObject _prev_bind_0 = rkf_formula_optimizer.$rkf_meaning_of_you$.currentBinding(thread);
            try {
                rkf_formula_optimizer.$rkf_meaning_of_you$.bind(meaning_of_you, thread);
                formula = cycl_utilities.expression_transform(formula, (SubLObject)rkf_formula_optimizer.$sym10$SECOND_PERSON_PRONOUN_, (SubLObject)rkf_formula_optimizer.$sym11$REPLACE_WITH_YOU, (SubLObject)rkf_formula_optimizer.UNPROVIDED, (SubLObject)rkf_formula_optimizer.UNPROVIDED);
            }
            finally {
                rkf_formula_optimizer.$rkf_meaning_of_you$.rebind(_prev_bind_0, thread);
            }
        }
        return formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 10963L)
    public static SubLObject replace_first_person_pronouns_in_cycl(SubLObject formula, final SubLObject meaning_of_me) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_formula_optimizer.NIL == first_person_pronounP(meaning_of_me)) {
            final SubLObject _prev_bind_0 = rkf_formula_optimizer.$rkf_meaning_of_me$.currentBinding(thread);
            try {
                rkf_formula_optimizer.$rkf_meaning_of_me$.bind(meaning_of_me, thread);
                formula = cycl_utilities.expression_transform(formula, (SubLObject)rkf_formula_optimizer.$sym12$FIRST_PERSON_PRONOUN_, (SubLObject)rkf_formula_optimizer.$sym13$REPLACE_WITH_ME, (SubLObject)rkf_formula_optimizer.UNPROVIDED, (SubLObject)rkf_formula_optimizer.UNPROVIDED);
            }
            finally {
                rkf_formula_optimizer.$rkf_meaning_of_me$.rebind(_prev_bind_0, thread);
            }
        }
        return formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 11372L)
    public static SubLObject second_person_pronounP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_utilities.formula_arg0(v_object).eql(rkf_formula_optimizer.$const7$PronounFn) && cycl_utilities.formula_arg1(v_object, (SubLObject)rkf_formula_optimizer.UNPROVIDED).eql(rkf_formula_optimizer.$const14$SecondPerson_NLAttr));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 11532L)
    public static SubLObject first_person_pronounP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_utilities.formula_arg0(v_object).eql(rkf_formula_optimizer.$const7$PronounFn) && cycl_utilities.formula_arg1(v_object, (SubLObject)rkf_formula_optimizer.UNPROVIDED).eql(rkf_formula_optimizer.$const15$FirstPerson_NLAttr));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 11689L)
    public static SubLObject replace_with_you(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return rkf_formula_optimizer.$rkf_meaning_of_you$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 11774L)
    public static SubLObject replace_with_me(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return rkf_formula_optimizer.$rkf_meaning_of_me$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 11857L)
    public static SubLObject rkf_reformulator_sentences_equalP(final SubLObject term_1, final SubLObject term_2, SubLObject mt) {
        if (mt == rkf_formula_optimizer.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return czer_utilities.el_expression_equalP(term_1, term_2, mt, (SubLObject)rkf_formula_optimizer.UNPROVIDED, (SubLObject)rkf_formula_optimizer.UNPROVIDED);
    }
    
    public static SubLObject declare_rkf_formula_optimizer_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_formula_optimizer", "rkf_optimize_assert_formula", "RKF-OPTIMIZE-ASSERT-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_formula_optimizer", "rkf_optimize_query_formula", "RKF-OPTIMIZE-QUERY-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_formula_optimizer", "rkf_optimize_formula", "RKF-OPTIMIZE-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_formula_optimizer", "rkf_exception_formulaP", "RKF-EXCEPTION-FORMULA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_formula_optimizer", "rkf_reformulate_query_formula", "RKF-REFORMULATE-QUERY-FORMULA", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_formula_optimizer", "rkf_reformulate_assert_formula", "RKF-REFORMULATE-ASSERT-FORMULA", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_formula_optimizer", "rkf_reformulate_and_sharpen_into_many", "RKF-REFORMULATE-AND-SHARPEN-INTO-MANY", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_formula_optimizer", "rkf_reformulate_before_strengthening_old_qp", "RKF-REFORMULATE-BEFORE-STRENGTHENING-OLD-QP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_formula_optimizer", "rkf_reformulate_before_strengthening_qp_3", "RKF-REFORMULATE-BEFORE-STRENGTHENING-QP-3", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_formula_optimizer", "rkf_reformulate_before_strengthening", "RKF-REFORMULATE-BEFORE-STRENGTHENING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_formula_optimizer", "rkf_tersify", "RKF-TERSIFY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_formula_optimizer", "rkf_reformulate_into_many", "RKF-REFORMULATE-INTO-MANY", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_formula_optimizer", "expression_contains_pronounP", "EXPRESSION-CONTAINS-PRONOUN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_formula_optimizer", "formula_list_p", "FORMULA-LIST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_formula_optimizer", "replace_pronouns_in_cycls", "REPLACE-PRONOUNS-IN-CYCLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_formula_optimizer", "replace_pronouns_in_cycl", "REPLACE-PRONOUNS-IN-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_formula_optimizer", "replace_second_person_pronouns_in_cycl", "REPLACE-SECOND-PERSON-PRONOUNS-IN-CYCL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_formula_optimizer", "replace_first_person_pronouns_in_cycl", "REPLACE-FIRST-PERSON-PRONOUNS-IN-CYCL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_formula_optimizer", "second_person_pronounP", "SECOND-PERSON-PRONOUN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_formula_optimizer", "first_person_pronounP", "FIRST-PERSON-PRONOUN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_formula_optimizer", "replace_with_you", "REPLACE-WITH-YOU", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_formula_optimizer", "replace_with_me", "REPLACE-WITH-ME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_formula_optimizer", "rkf_reformulator_sentences_equalP", "RKF-REFORMULATOR-SENTENCES-EQUAL?", 2, 1, false);
        return (SubLObject)rkf_formula_optimizer.NIL;
    }
    
    public static SubLObject init_rkf_formula_optimizer_file() {
        rkf_formula_optimizer.$rkf_reformulator_replace_pronounsP$ = SubLFiles.defparameter("*RKF-REFORMULATOR-REPLACE-PRONOUNS?*", (SubLObject)rkf_formula_optimizer.T);
        rkf_formula_optimizer.$rkf_sharpen_preds$ = SubLFiles.defparameter("*RKF-SHARPEN-PREDS*", (SubLObject)rkf_formula_optimizer.T);
        rkf_formula_optimizer.$rkf_return_multiple_quantificationsP$ = SubLFiles.defparameter("*RKF-RETURN-MULTIPLE-QUANTIFICATIONS?*", (SubLObject)rkf_formula_optimizer.T);
        rkf_formula_optimizer.$rkf_late_pronoun_substitutionP$ = SubLFiles.defparameter("*RKF-LATE-PRONOUN-SUBSTITUTION?*", (SubLObject)rkf_formula_optimizer.NIL);
        rkf_formula_optimizer.$rkf_meaning_of_you$ = SubLFiles.defparameter("*RKF-MEANING-OF-YOU*", rkf_formula_optimizer.$const9$CycProgram);
        rkf_formula_optimizer.$rkf_meaning_of_me$ = SubLFiles.defparameter("*RKF-MEANING-OF-ME*", (SubLObject)rkf_formula_optimizer.NIL);
        return (SubLObject)rkf_formula_optimizer.NIL;
    }
    
    public static SubLObject setup_rkf_formula_optimizer_file() {
        sunit_external.define_test_category((SubLObject)rkf_formula_optimizer.$str16$return_multiple_reformulations, (SubLObject)rkf_formula_optimizer.UNPROVIDED);
        sunit_external.define_test_suite((SubLObject)rkf_formula_optimizer.$str17$rkf_formula_optimizer_test_suite, (SubLObject)ConsesLow.list((SubLObject)rkf_formula_optimizer.$str16$return_multiple_reformulations), (SubLObject)rkf_formula_optimizer.UNPROVIDED, (SubLObject)rkf_formula_optimizer.UNPROVIDED);
        return (SubLObject)rkf_formula_optimizer.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_rkf_formula_optimizer_file();
    }
    
    @Override
	public void initializeVariables() {
        init_rkf_formula_optimizer_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_rkf_formula_optimizer_file();
    }
    
    static {
        me = (SubLFile)new rkf_formula_optimizer();
        rkf_formula_optimizer.$rkf_reformulator_replace_pronounsP$ = null;
        rkf_formula_optimizer.$rkf_sharpen_preds$ = null;
        rkf_formula_optimizer.$rkf_return_multiple_quantificationsP$ = null;
        rkf_formula_optimizer.$rkf_late_pronoun_substitutionP$ = null;
        rkf_formula_optimizer.$rkf_meaning_of_you$ = null;
        rkf_formula_optimizer.$rkf_meaning_of_me$ = null;
        $sym0$EL_FORMULA_P = SubLObjectFactory.makeSymbol("EL-FORMULA-P");
        $list1 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("exceptWhen")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("exceptFor")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("abnormal")));
        $kw2$QUESTION = SubLObjectFactory.makeKeyword("QUESTION");
        $kw3$ASSERTION = SubLObjectFactory.makeKeyword("ASSERTION");
        $kw4$DECLARATIVE = SubLObjectFactory.makeKeyword("DECLARATIVE");
        $str5$Optimizing_internal_representatio = SubLObjectFactory.makeString("Optimizing internal representation of knowledge.");
        $sym6$RKF_REFORMULATOR_SENTENCES_EQUAL_ = SubLObjectFactory.makeSymbol("RKF-REFORMULATOR-SENTENCES-EQUAL?");
        $const7$PronounFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PronounFn"));
        $sym8$REPLACE_PRONOUNS_IN_CYCL = SubLObjectFactory.makeSymbol("REPLACE-PRONOUNS-IN-CYCL");
        $const9$CycProgram = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycProgram"));
        $sym10$SECOND_PERSON_PRONOUN_ = SubLObjectFactory.makeSymbol("SECOND-PERSON-PRONOUN?");
        $sym11$REPLACE_WITH_YOU = SubLObjectFactory.makeSymbol("REPLACE-WITH-YOU");
        $sym12$FIRST_PERSON_PRONOUN_ = SubLObjectFactory.makeSymbol("FIRST-PERSON-PRONOUN?");
        $sym13$REPLACE_WITH_ME = SubLObjectFactory.makeSymbol("REPLACE-WITH-ME");
        $const14$SecondPerson_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SecondPerson-NLAttr"));
        $const15$FirstPerson_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FirstPerson-NLAttr"));
        $str16$return_multiple_reformulations = SubLObjectFactory.makeString("return multiple reformulations");
        $str17$rkf_formula_optimizer_test_suite = SubLObjectFactory.makeString("rkf-formula-optimizer-test-suite");
    }
}

/*

	Total time: 74 ms
	
*/