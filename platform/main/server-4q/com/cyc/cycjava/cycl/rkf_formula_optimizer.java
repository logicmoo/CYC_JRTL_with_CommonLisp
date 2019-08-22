package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class rkf_formula_optimizer extends SubLTranslatedFile {
    public static final SubLFile me = new rkf_formula_optimizer();

    public static final String myName = "com.cyc.cycjava.cycl.rkf_formula_optimizer";

    public static final String myFingerPrint = "9bcbd17bd85c564c5e2a36dd7843280300206abb00755d937a84c77d51a6bd11";

    // defparameter
    // Definitions
    public static final SubLSymbol $rkf_reformulator_replace_pronounsP$ = makeSymbol("*RKF-REFORMULATOR-REPLACE-PRONOUNS?*");

    // defparameter
    /**
     * should the reformulator also try to sharpen the predicates?
     */
    public static final SubLSymbol $rkf_sharpen_preds$ = makeSymbol("*RKF-SHARPEN-PREDS*");

    // defparameter
    /**
     * should the reformulator return multiple quantifications of the same sentence?
     */
    public static final SubLSymbol $rkf_return_multiple_quantificationsP$ = makeSymbol("*RKF-RETURN-MULTIPLE-QUANTIFICATIONS?*");

    // defparameter
    public static final SubLSymbol $rkf_late_pronoun_substitutionP$ = makeSymbol("*RKF-LATE-PRONOUN-SUBSTITUTION?*");

    // defparameter
    /**
     * Variable showing what a user means if they say 'you'. Variable would be
     * unnecessary if SubL had lambdas.
     */
    private static final SubLSymbol $rkf_meaning_of_you$ = makeSymbol("*RKF-MEANING-OF-YOU*");

    // defparameter
    /**
     * Variable containing the terms that a user means if they say 'I'. Variable
     * would be unnecessary if SubL had lambdas.
     */
    private static final SubLSymbol $rkf_meaning_of_me$ = makeSymbol("*RKF-MEANING-OF-ME*");



    public static final SubLList $list1 = list(reader_make_constant_shell(makeString("exceptWhen")), reader_make_constant_shell(makeString("exceptFor")), reader_make_constant_shell(makeString("abnormal")));







    public static final SubLString $str5$Optimizing_internal_representatio = makeString("Optimizing internal representation of knowledge.");

    public static final SubLSymbol $sym6$RKF_REFORMULATOR_SENTENCES_EQUAL_ = makeSymbol("RKF-REFORMULATOR-SENTENCES-EQUAL?");

    private static final SubLObject $$PronounFn = reader_make_constant_shell(makeString("PronounFn"));

    public static final SubLSymbol REPLACE_PRONOUNS_IN_CYCL = makeSymbol("REPLACE-PRONOUNS-IN-CYCL");

    private static final SubLObject $$CycProgram = reader_make_constant_shell(makeString("CycProgram"));

    public static final SubLSymbol $sym10$SECOND_PERSON_PRONOUN_ = makeSymbol("SECOND-PERSON-PRONOUN?");

    public static final SubLSymbol REPLACE_WITH_YOU = makeSymbol("REPLACE-WITH-YOU");

    public static final SubLSymbol $sym12$FIRST_PERSON_PRONOUN_ = makeSymbol("FIRST-PERSON-PRONOUN?");

    public static final SubLSymbol REPLACE_WITH_ME = makeSymbol("REPLACE-WITH-ME");

    private static final SubLObject $$SecondPerson_NLAttr = reader_make_constant_shell(makeString("SecondPerson-NLAttr"));

    private static final SubLObject $$FirstPerson_NLAttr = reader_make_constant_shell(makeString("FirstPerson-NLAttr"));

    public static final SubLString $$$return_multiple_reformulations = makeString("return multiple reformulations");

    public static final SubLString $str17$rkf_formula_optimizer_test_suite = makeString("rkf-formula-optimizer-test-suite");

    public static SubLObject rkf_optimize_assert_formula(final SubLObject assert_formula, final SubLObject domain_mt) {
        assert NIL != el_formula_p(assert_formula) : "el_utilities.el_formula_p(assert_formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(assert_formula) " + assert_formula;
        final SubLObject except_whenP = rkf_exception_formulaP(assert_formula);
        return NIL != except_whenP ? reformulator_utilities.reformulate_cycl_exception_rules(assert_formula, domain_mt, UNPROVIDED) : reformulator_hub.reformulate_cycl(assert_formula, domain_mt, UNPROVIDED);
    }

    public static SubLObject rkf_optimize_query_formula(final SubLObject query_formula, final SubLObject domain_mt) {
        assert NIL != el_formula_p(query_formula) : "el_utilities.el_formula_p(query_formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(query_formula) " + query_formula;
        return reformulator_hub.reformulate_cycl(query_formula, domain_mt, UNPROVIDED);
    }

    public static SubLObject rkf_optimize_formula(final SubLObject formula, final SubLObject domain_mt) {
        assert NIL != el_formula_p(formula) : "el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) " + formula;
        return reformulator_hub.reformulate_cycl(formula, domain_mt, UNPROVIDED);
    }

    public static SubLObject rkf_exception_formulaP(final SubLObject formula) {
        SubLObject exceptionP = NIL;
        if (NIL == exceptionP) {
            SubLObject csome_list_var;
            SubLObject exception_term;
            for (csome_list_var = $list1, exception_term = NIL, exception_term = csome_list_var.first(); (NIL == exceptionP) && (NIL != csome_list_var); exceptionP = cycl_utilities.expression_find(exception_term, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED) , csome_list_var = csome_list_var.rest() , exception_term = csome_list_var.first()) {
            }
        }
        return exceptionP;
    }

    public static SubLObject rkf_reformulate_query_formula(final SubLObject formula, final SubLObject domain_mt, SubLObject constraints) {
        if (constraints == UNPROVIDED) {
            constraints = NIL;
        }
        return rkf_reformulate_into_many(formula, domain_mt, T, $QUESTION, constraints);
    }

    public static SubLObject rkf_reformulate_assert_formula(final SubLObject formula, final SubLObject domain_mt, SubLObject constraints) {
        if (constraints == UNPROVIDED) {
            constraints = NIL;
        }
        return rkf_reformulate_and_sharpen_into_many(formula, domain_mt, $ASSERTION, constraints);
    }

    public static SubLObject rkf_reformulate_and_sharpen_into_many(final SubLObject assert_formula, final SubLObject domain_mt, SubLObject force, SubLObject constraints) {
        if (force == UNPROVIDED) {
            force = $DECLARATIVE;
        }
        if (constraints == UNPROVIDED) {
            constraints = NIL;
        }
        rkf_mumbler.rkf_mumble($str5$Optimizing_internal_representatio, UNPROVIDED);
        return rkf_reformulate_into_many(assert_formula, domain_mt, T, force, constraints);
    }

    public static SubLObject rkf_reformulate_before_strengthening_old_qp(SubLObject formula, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        formula = reformulator_utilities_nl.reformulate_cycl_the_coordination_set_removal(formula, domain_mt);
        formula = reformulator_utilities_nl.reformulate_cycl_quantopt(formula, domain_mt, UNPROVIDED);
        if (NIL != reformulator_utilities_nl.try_process_reformulator_for_quantunifyP(formula)) {
            formula = reformulator_utilities_nl.reformulate_cycl_quantunify(formula, domain_mt, UNPROVIDED);
        }
        if (NIL != reformulator_utilities_nl.try_process_reformulator_for_vppproc_stateP(formula)) {
            formula = reformulator_utilities_nl.reformulate_cycl_vppproc_state(formula, domain_mt, UNPROVIDED);
        }
        formula = reformulator_utilities_nl.reformulate_cycl_quantproc_rules(formula, domain_mt, UNPROVIDED);
        formula = reformulator_utilities_nl.reformulate_cycl_quantproc(formula, domain_mt, UNPROVIDED);
        if (NIL != reformulator_utilities_nl.try_process_reformulator_for_vppproc_nonstateP(formula)) {
            formula = reformulator_utilities_nl.reformulate_cycl_vppproc_nonstate(formula, domain_mt, UNPROVIDED);
        }
        formula = reformulator_utilities_nl.reformulate_cycl_subcollproc(formula, domain_mt, UNPROVIDED);
        formula = reformulator_utilities_nl.reformulate_cycl_quantproc(formula, domain_mt, UNPROVIDED);
        if ((NIL != $rkf_reformulator_replace_pronounsP$.getDynamicValue(thread)) && (NIL != $rkf_late_pronoun_substitutionP$.getDynamicValue(thread))) {
            formula = replace_pronouns_in_cycl(formula);
        }
        return formula;
    }

    public static SubLObject rkf_reformulate_before_strengthening_qp_3(SubLObject formula, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject formulas = NIL;
        formula = reformulator_utilities_nl.reformulate_cycl_the_coordination_set_removal(formula, domain_mt);
        formula = reformulator_utilities_nl.reformulate_cycl_quantopt_3(formula, domain_mt, UNPROVIDED);
        if (NIL != reformulator_utilities_nl.try_process_reformulator_for_quantunify_3P(formula)) {
            formula = reformulator_utilities_nl.reformulate_cycl_quantunify_3(formula, domain_mt, UNPROVIDED);
        }
        if (NIL != reformulator_utilities_nl.try_process_reformulator_for_vppproc_stateP(formula)) {
            formula = reformulator_utilities_nl.reformulate_cycl_vppproc_state(formula, domain_mt, UNPROVIDED);
        }
        if ((NIL != $rkf_return_multiple_quantificationsP$.getDynamicValue(thread)) && (NIL != el_formula_p(formula))) {
            formulas = reformulator_module_quantifier_processing_3.quantproc_3_el_formula_permutations(formula);
        } else {
            formulas = list(formula);
        }
        formulas = reformulator_utilities_nl.reformulate_cycls_quantproc_3_rules(formulas, domain_mt, UNPROVIDED);
        formulas = reformulator_utilities_nl.reformulate_cycls_quantproc_3(formulas, domain_mt, UNPROVIDED);
        formulas = reformulator_utilities_nl.try_to_reformulate_cycls_vppproc_nonstate(formulas, domain_mt, UNPROVIDED);
        formulas = reformulator_utilities_nl.reformulate_cycl_subcollproc(formulas, domain_mt, UNPROVIDED);
        formulas = reformulator_utilities_nl.reformulate_cycls_quantproc_3(formulas, domain_mt, UNPROVIDED);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(domain_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            formulas = remove_duplicates(formulas, symbol_function($sym6$RKF_REFORMULATOR_SENTENCES_EQUAL_), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if ((NIL != $rkf_reformulator_replace_pronounsP$.getDynamicValue(thread)) && (NIL != $rkf_late_pronoun_substitutionP$.getDynamicValue(thread))) {
            formulas = replace_pronouns_in_cycls(formulas);
        }
        formulas = reformulator_utilities.reformulate_cycls(formulas, domain_mt, UNPROVIDED);
        return formulas;
    }

    public static SubLObject rkf_reformulate_before_strengthening(final SubLObject formula, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == parsing_vars.$use_ternary_np_tagsP$.getDynamicValue(thread)) {
            return rkf_reformulate_before_strengthening_old_qp(list(formula), domain_mt);
        }
        return rkf_reformulate_before_strengthening_qp_3(formula, domain_mt);
    }

    public static SubLObject rkf_tersify(final SubLObject formula, final SubLObject domain_mt) {
        return formula;
    }

    public static SubLObject rkf_reformulate_into_many(final SubLObject formula, final SubLObject domain_mt, SubLObject strengthenP, SubLObject force, SubLObject constraints) {
        if (strengthenP == UNPROVIDED) {
            strengthenP = NIL;
        }
        if (force == UNPROVIDED) {
            force = $ASSERTION;
        }
        if (constraints == UNPROVIDED) {
            constraints = NIL;
        }
        SubLObject new_cycl = NIL;
        SubLObject improvements = NIL;
        final SubLObject drt_result = T;
        SubLObject formulas = NIL;
        SubLObject shifted_cycl = NIL;
        formulas = rkf_reformulate_before_strengthening(formula, domain_mt);
        if (force == $QUESTION) {
            formulas = reformulator_utilities.reformulate_query_cycls(formulas, domain_mt, UNPROVIDED);
        }
        SubLObject cdolist_list_var = formulas;
        SubLObject formula_$1 = NIL;
        formula_$1 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != strengthenP) {
                improvements = cconcatenate(improvements, predicate_strengthener.pred_strengthen_formula(formula_$1, domain_mt, constraints));
            }
            cdolist_list_var = cdolist_list_var.rest();
            formula_$1 = cdolist_list_var.first();
        } 
        if (NIL == improvements) {
            improvements = formulas;
        }
        SubLObject reformed_results = NIL;
        SubLObject cdolist_list_var2 = improvements;
        SubLObject formula_$2 = NIL;
        formula_$2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            new_cycl = reformulator_hub.reformulate_cycl(formula_$2, domain_mt, UNPROVIDED);
            if (NIL != new_cycl) {
                reformed_results = cons(new_cycl, reformed_results);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            formula_$2 = cdolist_list_var2.first();
        } 
        if (NIL != reformed_results) {
            improvements = reformed_results;
        }
        cdolist_list_var = improvements;
        SubLObject cycl_option = NIL;
        cycl_option = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != el_formula_p(cycl_option)) {
                final SubLObject uniform = rkf_optimize_assert_formula(cycl_option, domain_mt);
                final SubLObject shifted = reformulator_utilities_nl.reformulate_cycl_typeshift(uniform, domain_mt, UNPROVIDED);
                if (NIL != shifted) {
                    shifted_cycl = cons(shifted, shifted_cycl);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            cycl_option = cdolist_list_var.first();
        } 
        return shifted_cycl;
    }

    public static SubLObject expression_contains_pronounP(final SubLObject expression) {
        return list_utilities.sublisp_boolean(cycl_utilities.expression_find($$PronounFn, expression, T, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject formula_list_p(final SubLObject formulas) {
        return makeBoolean(formulas.isList() && (NIL != list_utilities.every_in_list(EL_FORMULA_P, formulas, UNPROVIDED)));
    }

    public static SubLObject replace_pronouns_in_cycls(final SubLObject formulas) {
        return Mapping.mapcar(REPLACE_PRONOUNS_IN_CYCL, formulas);
    }

    public static SubLObject replace_pronouns_in_cycl(SubLObject formula) {
        formula = replace_first_person_pronouns_in_cycl(formula, operation_communication.the_cyclist());
        formula = replace_second_person_pronouns_in_cycl(formula, $$CycProgram);
        return formula;
    }

    public static SubLObject replace_second_person_pronouns_in_cycl(SubLObject formula, final SubLObject meaning_of_you) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == second_person_pronounP(meaning_of_you)) {
            final SubLObject _prev_bind_0 = $rkf_meaning_of_you$.currentBinding(thread);
            try {
                $rkf_meaning_of_you$.bind(meaning_of_you, thread);
                formula = cycl_utilities.expression_transform(formula, $sym10$SECOND_PERSON_PRONOUN_, REPLACE_WITH_YOU, UNPROVIDED, UNPROVIDED);
            } finally {
                $rkf_meaning_of_you$.rebind(_prev_bind_0, thread);
            }
        }
        return formula;
    }

    public static SubLObject replace_first_person_pronouns_in_cycl(SubLObject formula, final SubLObject meaning_of_me) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == first_person_pronounP(meaning_of_me)) {
            final SubLObject _prev_bind_0 = $rkf_meaning_of_me$.currentBinding(thread);
            try {
                $rkf_meaning_of_me$.bind(meaning_of_me, thread);
                formula = cycl_utilities.expression_transform(formula, $sym12$FIRST_PERSON_PRONOUN_, REPLACE_WITH_ME, UNPROVIDED, UNPROVIDED);
            } finally {
                $rkf_meaning_of_me$.rebind(_prev_bind_0, thread);
            }
        }
        return formula;
    }

    public static SubLObject second_person_pronounP(final SubLObject v_object) {
        return makeBoolean(cycl_utilities.formula_arg0(v_object).eql($$PronounFn) && cycl_utilities.formula_arg1(v_object, UNPROVIDED).eql($$SecondPerson_NLAttr));
    }

    public static SubLObject first_person_pronounP(final SubLObject v_object) {
        return makeBoolean(cycl_utilities.formula_arg0(v_object).eql($$PronounFn) && cycl_utilities.formula_arg1(v_object, UNPROVIDED).eql($$FirstPerson_NLAttr));
    }

    public static SubLObject replace_with_you(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $rkf_meaning_of_you$.getDynamicValue(thread);
    }

    public static SubLObject replace_with_me(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $rkf_meaning_of_me$.getDynamicValue(thread);
    }

    public static SubLObject rkf_reformulator_sentences_equalP(final SubLObject term_1, final SubLObject term_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return czer_utilities.el_expression_equalP(term_1, term_2, mt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject declare_rkf_formula_optimizer_file() {
        declareFunction(me, "rkf_optimize_assert_formula", "RKF-OPTIMIZE-ASSERT-FORMULA", 2, 0, false);
        declareFunction(me, "rkf_optimize_query_formula", "RKF-OPTIMIZE-QUERY-FORMULA", 2, 0, false);
        declareFunction(me, "rkf_optimize_formula", "RKF-OPTIMIZE-FORMULA", 2, 0, false);
        declareFunction(me, "rkf_exception_formulaP", "RKF-EXCEPTION-FORMULA?", 1, 0, false);
        declareFunction(me, "rkf_reformulate_query_formula", "RKF-REFORMULATE-QUERY-FORMULA", 2, 1, false);
        declareFunction(me, "rkf_reformulate_assert_formula", "RKF-REFORMULATE-ASSERT-FORMULA", 2, 1, false);
        declareFunction(me, "rkf_reformulate_and_sharpen_into_many", "RKF-REFORMULATE-AND-SHARPEN-INTO-MANY", 2, 2, false);
        declareFunction(me, "rkf_reformulate_before_strengthening_old_qp", "RKF-REFORMULATE-BEFORE-STRENGTHENING-OLD-QP", 2, 0, false);
        declareFunction(me, "rkf_reformulate_before_strengthening_qp_3", "RKF-REFORMULATE-BEFORE-STRENGTHENING-QP-3", 2, 0, false);
        declareFunction(me, "rkf_reformulate_before_strengthening", "RKF-REFORMULATE-BEFORE-STRENGTHENING", 2, 0, false);
        declareFunction(me, "rkf_tersify", "RKF-TERSIFY", 2, 0, false);
        declareFunction(me, "rkf_reformulate_into_many", "RKF-REFORMULATE-INTO-MANY", 2, 3, false);
        declareFunction(me, "expression_contains_pronounP", "EXPRESSION-CONTAINS-PRONOUN?", 1, 0, false);
        declareFunction(me, "formula_list_p", "FORMULA-LIST-P", 1, 0, false);
        declareFunction(me, "replace_pronouns_in_cycls", "REPLACE-PRONOUNS-IN-CYCLS", 1, 0, false);
        declareFunction(me, "replace_pronouns_in_cycl", "REPLACE-PRONOUNS-IN-CYCL", 1, 0, false);
        declareFunction(me, "replace_second_person_pronouns_in_cycl", "REPLACE-SECOND-PERSON-PRONOUNS-IN-CYCL", 2, 0, false);
        declareFunction(me, "replace_first_person_pronouns_in_cycl", "REPLACE-FIRST-PERSON-PRONOUNS-IN-CYCL", 2, 0, false);
        declareFunction(me, "second_person_pronounP", "SECOND-PERSON-PRONOUN?", 1, 0, false);
        declareFunction(me, "first_person_pronounP", "FIRST-PERSON-PRONOUN?", 1, 0, false);
        declareFunction(me, "replace_with_you", "REPLACE-WITH-YOU", 1, 0, false);
        declareFunction(me, "replace_with_me", "REPLACE-WITH-ME", 1, 0, false);
        declareFunction(me, "rkf_reformulator_sentences_equalP", "RKF-REFORMULATOR-SENTENCES-EQUAL?", 2, 1, false);
        return NIL;
    }

    public static SubLObject init_rkf_formula_optimizer_file() {
        defparameter("*RKF-REFORMULATOR-REPLACE-PRONOUNS?*", T);
        defparameter("*RKF-SHARPEN-PREDS*", T);
        defparameter("*RKF-RETURN-MULTIPLE-QUANTIFICATIONS?*", T);
        defparameter("*RKF-LATE-PRONOUN-SUBSTITUTION?*", NIL);
        defparameter("*RKF-MEANING-OF-YOU*", $$CycProgram);
        defparameter("*RKF-MEANING-OF-ME*", NIL);
        return NIL;
    }

    public static SubLObject setup_rkf_formula_optimizer_file() {
        sunit_external.define_test_category($$$return_multiple_reformulations, UNPROVIDED);
        sunit_external.define_test_suite($str17$rkf_formula_optimizer_test_suite, list($$$return_multiple_reformulations), UNPROVIDED, UNPROVIDED);
        return NIL;
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

    
}

/**
 * Total time: 74 ms
 */
