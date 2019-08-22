/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      RKF-FORMULA-OPTIMIZER
 * source file: /cyc/top/cycl/rkf-formula-optimizer.lisp
 * created:     2019/07/03 17:37:59
 */
public final class rkf_formula_optimizer extends SubLTranslatedFile implements V12 {
    public static final SubLObject subloop_reserved_initialize_multiple_without_strengthening_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, MULTIPLE_WITHOUT_STRENGTHENING, IN_CYCL, NIL);
        classes.subloop_initialize_slot(new_instance, MULTIPLE_WITHOUT_STRENGTHENING, OUT_CYCL, NIL);
        classes.subloop_initialize_slot(new_instance, MULTIPLE_WITHOUT_STRENGTHENING, MT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_multiple_without_strengthening_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_multiple_with_strengthening_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, MULTIPLE_WITH_STRENGTHENING, IN_CYCL, NIL);
        classes.subloop_initialize_slot(new_instance, MULTIPLE_WITH_STRENGTHENING, OUT_CYCL, NIL);
        classes.subloop_initialize_slot(new_instance, MULTIPLE_WITH_STRENGTHENING, MT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_multiple_with_strengthening_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject set_multiple_without_strengthening_out_cycl(SubLObject multiple_without_strengthening, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(multiple_without_strengthening, value, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject set_multiple_without_strengthening_mt(SubLObject multiple_without_strengthening, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(multiple_without_strengthening, value, FIVE_INTEGER, MT);
    }

    public static final SubLObject set_multiple_without_strengthening_in_cycl(SubLObject multiple_without_strengthening, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(multiple_without_strengthening, value, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLObject set_multiple_with_strengthening_out_cycl(SubLObject multiple_with_strengthening, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(multiple_with_strengthening, value, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject set_multiple_with_strengthening_mt(SubLObject multiple_with_strengthening, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(multiple_with_strengthening, value, FIVE_INTEGER, MT);
    }

    public static final SubLObject set_multiple_with_strengthening_in_cycl(SubLObject multiple_with_strengthening, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(multiple_with_strengthening, value, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLObject multiple_without_strengthening_p(SubLObject multiple_without_strengthening) {
        return classes.subloop_instanceof_class(multiple_without_strengthening, MULTIPLE_WITHOUT_STRENGTHENING);
    }

    public static final SubLObject multiple_with_strengthening_p(SubLObject multiple_with_strengthening) {
        return classes.subloop_instanceof_class(multiple_with_strengthening, MULTIPLE_WITH_STRENGTHENING);
    }

    public static final SubLObject get_multiple_without_strengthening_out_cycl(SubLObject multiple_without_strengthening) {
        return classes.subloop_get_access_protected_instance_slot(multiple_without_strengthening, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject get_multiple_without_strengthening_mt(SubLObject multiple_without_strengthening) {
        return classes.subloop_get_access_protected_instance_slot(multiple_without_strengthening, FIVE_INTEGER, MT);
    }

    public static final SubLObject get_multiple_without_strengthening_in_cycl(SubLObject multiple_without_strengthening) {
        return classes.subloop_get_access_protected_instance_slot(multiple_without_strengthening, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLObject get_multiple_with_strengthening_out_cycl(SubLObject multiple_with_strengthening) {
        return classes.subloop_get_access_protected_instance_slot(multiple_with_strengthening, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject get_multiple_with_strengthening_mt(SubLObject multiple_with_strengthening) {
        return classes.subloop_get_access_protected_instance_slot(multiple_with_strengthening, FIVE_INTEGER, MT);
    }

    public static final SubLObject get_multiple_with_strengthening_in_cycl(SubLObject multiple_with_strengthening) {
        return classes.subloop_get_access_protected_instance_slot(multiple_with_strengthening, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLFile me = new rkf_formula_optimizer();

 public static final String myName = "com.cyc.cycjava.cycl.rkf_formula_optimizer";


    // defparameter
    // Definitions
    @LispMethod(comment = "should the rkf reformulator tools replace pronouns?\ndefparameter")
    /**
     * should the rkf reformulator tools replace pronouns?
     */
    public static final SubLSymbol $rkf_reformulator_replace_pronounsP$ = makeSymbol("*RKF-REFORMULATOR-REPLACE-PRONOUNS?*");

    // defparameter
    /**
     * should the reformulator also try to sharpen the predicates?
     */
    @LispMethod(comment = "should the reformulator also try to sharpen the predicates?\ndefparameter")
    public static final SubLSymbol $rkf_sharpen_preds$ = makeSymbol("*RKF-SHARPEN-PREDS*");

    // defparameter
    /**
     * should the reformulator return multiple quantifications of the same sentence?
     */
    @LispMethod(comment = "should the reformulator return multiple quantifications of the same sentence?\ndefparameter")
    public static final SubLSymbol $rkf_return_multiple_quantificationsP$ = makeSymbol("*RKF-RETURN-MULTIPLE-QUANTIFICATIONS?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $rkf_late_pronoun_substitutionP$ = makeSymbol("*RKF-LATE-PRONOUN-SUBSTITUTION?*");

    // defparameter
    /**
     * Variable showing what a user means if they say 'you'. Variable would be
     * unnecessary if SubL had lambdas.
     */
    @LispMethod(comment = "Variable showing what a user means if they say \'you\'. Variable would be\r\nunnecessary if SubL had lambdas.\ndefparameter\nVariable showing what a user means if they say \'you\'. Variable would be\nunnecessary if SubL had lambdas.")
    private static final SubLSymbol $rkf_meaning_of_you$ = makeSymbol("*RKF-MEANING-OF-YOU*");

    // defparameter
    /**
     * Variable containing the terms that a user means if they say 'I'. Variable
     * would be unnecessary if SubL had lambdas.
     */
    @LispMethod(comment = "Variable containing the terms that a user means if they say \'I\'. Variable\r\nwould be unnecessary if SubL had lambdas.\ndefparameter\nVariable containing the terms that a user means if they say \'I\'. Variable\nwould be unnecessary if SubL had lambdas.")
    private static final SubLSymbol $rkf_meaning_of_me$ = makeSymbol("*RKF-MEANING-OF-ME*");

    static private final SubLList $list1 = list(reader_make_constant_shell("exceptWhen"), reader_make_constant_shell("exceptFor"), reader_make_constant_shell("abnormal"));

    static private final SubLString $str5$Optimizing_internal_representatio = makeString("Optimizing internal representation of knowledge.");

    static private final SubLSymbol $sym6$RKF_REFORMULATOR_SENTENCES_EQUAL_ = makeSymbol("RKF-REFORMULATOR-SENTENCES-EQUAL?");



    private static final SubLSymbol REPLACE_PRONOUNS_IN_CYCL = makeSymbol("REPLACE-PRONOUNS-IN-CYCL");



    static private final SubLSymbol $sym10$SECOND_PERSON_PRONOUN_ = makeSymbol("SECOND-PERSON-PRONOUN?");

    private static final SubLSymbol REPLACE_WITH_YOU = makeSymbol("REPLACE-WITH-YOU");

    static private final SubLSymbol $sym12$FIRST_PERSON_PRONOUN_ = makeSymbol("FIRST-PERSON-PRONOUN?");

    private static final SubLSymbol REPLACE_WITH_ME = makeSymbol("REPLACE-WITH-ME");

    private static final SubLObject $$SecondPerson_NLAttr = reader_make_constant_shell("SecondPerson-NLAttr");

    private static final SubLObject $$FirstPerson_NLAttr = reader_make_constant_shell("FirstPerson-NLAttr");

    static private final SubLString $$$return_multiple_reformulations = makeString("return multiple reformulations");

    static private final SubLString $str17$rkf_formula_optimizer_test_suite = makeString("rkf-formula-optimizer-test-suite");

    /**
     * Optimize ASSERT-FORMULA in anticipation of asserting it in MT
     */
    @LispMethod(comment = "Optimize ASSERT-FORMULA in anticipation of asserting it in MT")
    public static final SubLObject rkf_optimize_assert_formula_alt(SubLObject assert_formula, SubLObject domain_mt) {
        SubLTrampolineFile.checkType(assert_formula, EL_FORMULA_P);
        {
            SubLObject except_whenP = com.cyc.cycjava.cycl.rkf_formula_optimizer.rkf_exception_formulaP(assert_formula);
            return NIL != except_whenP ? ((SubLObject) (reformulator_utilities.reformulate_cycl_exception_rules(assert_formula, domain_mt, UNPROVIDED))) : reformulator_hub.reformulate_cycl(assert_formula, domain_mt, UNPROVIDED);
        }
    }

    /**
     * Optimize ASSERT-FORMULA in anticipation of asserting it in MT
     */
    @LispMethod(comment = "Optimize ASSERT-FORMULA in anticipation of asserting it in MT")
    public static SubLObject rkf_optimize_assert_formula(final SubLObject assert_formula, final SubLObject domain_mt) {
        assert NIL != el_formula_p(assert_formula) : "! el_utilities.el_formula_p(assert_formula) " + ("el_utilities.el_formula_p(assert_formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(assert_formula) ") + assert_formula;
        final SubLObject except_whenP = rkf_exception_formulaP(assert_formula);
        return NIL != except_whenP ? reformulator_utilities.reformulate_cycl_exception_rules(assert_formula, domain_mt, UNPROVIDED) : reformulator_hub.reformulate_cycl(assert_formula, domain_mt, UNPROVIDED);
    }

    /**
     * Optimize QUERY-FORMULA in anticipation of querying it in MT
     */
    @LispMethod(comment = "Optimize QUERY-FORMULA in anticipation of querying it in MT")
    public static final SubLObject rkf_optimize_query_formula_alt(SubLObject query_formula, SubLObject domain_mt) {
        SubLTrampolineFile.checkType(query_formula, EL_FORMULA_P);
        return reformulator_hub.reformulate_cycl(query_formula, domain_mt, UNPROVIDED);
    }

    /**
     * Optimize QUERY-FORMULA in anticipation of querying it in MT
     */
    @LispMethod(comment = "Optimize QUERY-FORMULA in anticipation of querying it in MT")
    public static SubLObject rkf_optimize_query_formula(final SubLObject query_formula, final SubLObject domain_mt) {
        assert NIL != el_formula_p(query_formula) : "! el_utilities.el_formula_p(query_formula) " + ("el_utilities.el_formula_p(query_formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(query_formula) ") + query_formula;
        return reformulator_hub.reformulate_cycl(query_formula, domain_mt, UNPROVIDED);
    }

    /**
     * Optimize FORMULA with no anticipation
     */
    @LispMethod(comment = "Optimize FORMULA with no anticipation")
    public static final SubLObject rkf_optimize_formula_alt(SubLObject formula, SubLObject domain_mt) {
        SubLTrampolineFile.checkType(formula, EL_FORMULA_P);
        return reformulator_hub.reformulate_cycl(formula, domain_mt, UNPROVIDED);
    }

    /**
     * Optimize FORMULA with no anticipation
     */
    @LispMethod(comment = "Optimize FORMULA with no anticipation")
    public static SubLObject rkf_optimize_formula(final SubLObject formula, final SubLObject domain_mt) {
        assert NIL != el_formula_p(formula) : "! el_utilities.el_formula_p(formula) " + ("el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) ") + formula;
        return reformulator_hub.reformulate_cycl(formula, domain_mt, UNPROVIDED);
    }

    public static final SubLObject rkf_exception_formulaP_alt(SubLObject formula) {
        {
            SubLObject exceptionP = NIL;
            if (NIL == exceptionP) {
                {
                    SubLObject csome_list_var = $list_alt1;
                    SubLObject exception_term = NIL;
                    for (exception_term = csome_list_var.first(); !((NIL != exceptionP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , exception_term = csome_list_var.first()) {
                        exceptionP = cycl_utilities.expression_find(exception_term, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
            return exceptionP;
        }
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

    public static final SubLObject rkf_reformulate_query_formula_alt(SubLObject formula, SubLObject domain_mt, SubLObject constraints) {
        if (constraints == UNPROVIDED) {
            constraints = NIL;
        }
        return com.cyc.cycjava.cycl.rkf_formula_optimizer.rkf_reformulate_into_many(formula, domain_mt, T, $QUESTION, constraints);
    }

    public static SubLObject rkf_reformulate_query_formula(final SubLObject formula, final SubLObject domain_mt, SubLObject constraints) {
        if (constraints == UNPROVIDED) {
            constraints = NIL;
        }
        return rkf_reformulate_into_many(formula, domain_mt, T, $QUESTION, constraints);
    }

    public static final SubLObject rkf_reformulate_assert_formula_alt(SubLObject formula, SubLObject domain_mt, SubLObject constraints) {
        if (constraints == UNPROVIDED) {
            constraints = NIL;
        }
        return com.cyc.cycjava.cycl.rkf_formula_optimizer.rkf_reformulate_and_sharpen_into_many(formula, domain_mt, $ASSERTION, constraints);
    }

    public static SubLObject rkf_reformulate_assert_formula(final SubLObject formula, final SubLObject domain_mt, SubLObject constraints) {
        if (constraints == UNPROVIDED) {
            constraints = NIL;
        }
        return rkf_reformulate_and_sharpen_into_many(formula, domain_mt, $ASSERTION, constraints);
    }

    public static final SubLObject rkf_reformulate_and_sharpen_into_many_alt(SubLObject assert_formula, SubLObject domain_mt, SubLObject force, SubLObject constraints) {
        if (force == UNPROVIDED) {
            force = $DECLARATIVE;
        }
        if (constraints == UNPROVIDED) {
            constraints = NIL;
        }
        rkf_mumbler.rkf_mumble($str_alt5$Optimizing_internal_representatio, UNPROVIDED);
        return com.cyc.cycjava.cycl.rkf_formula_optimizer.rkf_reformulate_into_many(assert_formula, domain_mt, T, force, constraints);
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

    /**
     * When the DRT module isn't used, performs the set of reformulations using old quantproc binary tags
     */
    @LispMethod(comment = "When the DRT module isn\'t used, performs the set of reformulations using old quantproc binary tags")
    public static final SubLObject rkf_reformulate_before_strengthening_old_qp_alt(SubLObject formula, SubLObject domain_mt) {
        {
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
                formula = com.cyc.cycjava.cycl.rkf_formula_optimizer.replace_pronouns_in_cycl(formula);
            }
            return formula;
        }
    }

    /**
     * When the DRT module isn't used, performs the set of reformulations using old quantproc binary tags
     */
    @LispMethod(comment = "When the DRT module isn\'t used, performs the set of reformulations using old quantproc binary tags")
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

    /**
     * When the DRT module isn't used, performs the set of reformulations using new quantproc ternary tags
     *
     * @return list; a list of possible Cycl sentences
     */
    @LispMethod(comment = "When the DRT module isn\'t used, performs the set of reformulations using new quantproc ternary tags\r\n\r\n@return list; a list of possible Cycl sentences")
    public static final SubLObject rkf_reformulate_before_strengthening_qp_3_alt(SubLObject formula, SubLObject domain_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
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
                {
                    SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(domain_mt);
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            formulas = remove_duplicates(formulas, symbol_function($sym6$RKF_REFORMULATOR_SENTENCES_EQUAL_), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                if ((NIL != $rkf_reformulator_replace_pronounsP$.getDynamicValue(thread)) && (NIL != $rkf_late_pronoun_substitutionP$.getDynamicValue(thread))) {
                    formulas = com.cyc.cycjava.cycl.rkf_formula_optimizer.replace_pronouns_in_cycls(formulas);
                }
                formulas = reformulator_utilities.reformulate_cycls(formulas, domain_mt, UNPROVIDED);
                return formulas;
            }
        }
    }

    /**
     * When the DRT module isn't used, performs the set of reformulations using new quantproc ternary tags
     *
     * @return list; a list of possible Cycl sentences
     */
    @LispMethod(comment = "When the DRT module isn\'t used, performs the set of reformulations using new quantproc ternary tags\r\n\r\n@return list; a list of possible Cycl sentences")
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

    /**
     * This function performs that set of reformulations that the DRT module
     * performs.  When the DRT module isn't used, this function is used instead.
     */
    @LispMethod(comment = "This function performs that set of reformulations that the DRT module\r\nperforms.  When the DRT module isn\'t used, this function is used instead.\nThis function performs that set of reformulations that the DRT module\nperforms.  When the DRT module isn\'t used, this function is used instead.")
    public static final SubLObject rkf_reformulate_before_strengthening_alt(SubLObject formula, SubLObject domain_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == parsing_vars.$use_ternary_np_tagsP$.getDynamicValue(thread)) {
                return com.cyc.cycjava.cycl.rkf_formula_optimizer.rkf_reformulate_before_strengthening_old_qp(list(formula), domain_mt);
            }
            return com.cyc.cycjava.cycl.rkf_formula_optimizer.rkf_reformulate_before_strengthening_qp_3(formula, domain_mt);
        }
    }

    @LispMethod(comment = "This function performs that set of reformulations that the DRT module\r\nperforms.  When the DRT module isn\'t used, this function is used instead.\nThis function performs that set of reformulations that the DRT module\nperforms.  When the DRT module isn\'t used, this function is used instead.")
    public static SubLObject rkf_reformulate_before_strengthening(final SubLObject formula, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == parsing_vars.$use_ternary_np_tagsP$.getDynamicValue(thread)) {
            return rkf_reformulate_before_strengthening_old_qp(list(formula), domain_mt);
        }
        return rkf_reformulate_before_strengthening_qp_3(formula, domain_mt);
    }

    /**
     *
     *
     * @return EL-FORMULA-P; possibly tersified version of FORMULA.
     */
    @LispMethod(comment = "@return EL-FORMULA-P; possibly tersified version of FORMULA.")
    public static final SubLObject rkf_tersify_alt(SubLObject formula, SubLObject domain_mt) {
        return formula;
    }

    /**
     *
     *
     * @return EL-FORMULA-P; possibly tersified version of FORMULA.
     */
    @LispMethod(comment = "@return EL-FORMULA-P; possibly tersified version of FORMULA.")
    public static SubLObject rkf_tersify(final SubLObject formula, final SubLObject domain_mt) {
        return formula;
    }

    /**
     * Run the reformulation gauntlet and the sharpening of the predicate on this
     * assertion formula and return a list of the new formulas or a singleton list
     * with the original assert formula. Use the optional constraints to provide
     * additional information about the terms if available; the table has the
     * format of LIST of LISTs of TERM plus LIST of ISAs plus LIST of GENLS, eg.
     * ((#<(#$TheNthFn #$Thing 1)> (#$Plant) NIL))
     */
    @LispMethod(comment = "Run the reformulation gauntlet and the sharpening of the predicate on this\r\nassertion formula and return a list of the new formulas or a singleton list\r\nwith the original assert formula. Use the optional constraints to provide\r\nadditional information about the terms if available; the table has the\r\nformat of LIST of LISTs of TERM plus LIST of ISAs plus LIST of GENLS, eg.\r\n((#<(#$TheNthFn #$Thing 1)> (#$Plant) NIL))\nRun the reformulation gauntlet and the sharpening of the predicate on this\nassertion formula and return a list of the new formulas or a singleton list\nwith the original assert formula. Use the optional constraints to provide\nadditional information about the terms if available; the table has the\nformat of LIST of LISTs of TERM plus LIST of ISAs plus LIST of GENLS, eg.\n((#<(#$TheNthFn #$Thing 1)> (#$Plant) NIL))")
    public static final SubLObject rkf_reformulate_into_many_alt(SubLObject formula, SubLObject domain_mt, SubLObject strengthenP, SubLObject force, SubLObject constraints) {
        if (strengthenP == UNPROVIDED) {
            strengthenP = NIL;
        }
        if (force == UNPROVIDED) {
            force = $ASSERTION;
        }
        if (constraints == UNPROVIDED) {
            constraints = NIL;
        }
        {
            SubLObject new_cycl = NIL;
            SubLObject improvements = NIL;
            SubLObject drt_result = T;
            SubLObject formulas = NIL;
            SubLObject shifted_cycl = NIL;
            formulas = com.cyc.cycjava.cycl.rkf_formula_optimizer.rkf_reformulate_before_strengthening(formula, domain_mt);
            if (force == $QUESTION) {
                formulas = reformulator_utilities.reformulate_query_cycls(formulas, domain_mt, UNPROVIDED);
            }
            {
                SubLObject cdolist_list_var = formulas;
                SubLObject formula_1 = NIL;
                for (formula_1 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , formula_1 = cdolist_list_var.first()) {
                    if (NIL != strengthenP) {
                        improvements = cconcatenate(improvements, predicate_strengthener.pred_strengthen_formula(formula_1, domain_mt, constraints));
                    }
                }
            }
            if (NIL == improvements) {
                improvements = formulas;
            }
            {
                SubLObject reformed_results = NIL;
                SubLObject cdolist_list_var = improvements;
                SubLObject formula_2 = NIL;
                for (formula_2 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , formula_2 = cdolist_list_var.first()) {
                    new_cycl = reformulator_hub.reformulate_cycl(formula_2, domain_mt, UNPROVIDED);
                    if (NIL != new_cycl) {
                        reformed_results = cons(new_cycl, reformed_results);
                    }
                }
                if (NIL != reformed_results) {
                    improvements = reformed_results;
                }
            }
            {
                SubLObject cdolist_list_var = improvements;
                SubLObject cycl_option = NIL;
                for (cycl_option = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cycl_option = cdolist_list_var.first()) {
                    if (NIL != el_formula_p(cycl_option)) {
                        {
                            SubLObject uniform = com.cyc.cycjava.cycl.rkf_formula_optimizer.rkf_optimize_assert_formula(cycl_option, domain_mt);
                            SubLObject shifted = reformulator_utilities_nl.reformulate_cycl_typeshift(uniform, domain_mt, UNPROVIDED);
                            if (NIL != shifted) {
                                shifted_cycl = cons(shifted, shifted_cycl);
                            }
                        }
                    }
                }
            }
            return shifted_cycl;
        }
    }

    @LispMethod(comment = "Run the reformulation gauntlet and the sharpening of the predicate on this\r\nassertion formula and return a list of the new formulas or a singleton list\r\nwith the original assert formula. Use the optional constraints to provide\r\nadditional information about the terms if available; the table has the\r\nformat of LIST of LISTs of TERM plus LIST of ISAs plus LIST of GENLS, eg.\r\n((#<(#$TheNthFn #$Thing 1)> (#$Plant) NIL))\nRun the reformulation gauntlet and the sharpening of the predicate on this\nassertion formula and return a list of the new formulas or a singleton list\nwith the original assert formula. Use the optional constraints to provide\nadditional information about the terms if available; the table has the\nformat of LIST of LISTs of TERM plus LIST of ISAs plus LIST of GENLS, eg.\n((#<(#$TheNthFn #$Thing 1)> (#$Plant) NIL))")
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

    public static final SubLObject expression_contains_pronounP_alt(SubLObject expression) {
        return list_utilities.sublisp_boolean(cycl_utilities.expression_find($$PronounFn, expression, T, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject expression_contains_pronounP(final SubLObject expression) {
        return list_utilities.sublisp_boolean(cycl_utilities.expression_find($$PronounFn, expression, T, UNPROVIDED, UNPROVIDED));
    }

    /**
     *
     *
     * @return boolean: T iff FORMULAS is a list of formulas
     */
    @LispMethod(comment = "@return boolean: T iff FORMULAS is a list of formulas")
    public static final SubLObject formula_list_p_alt(SubLObject formulas) {
        return makeBoolean(formulas.isList() && (NIL != list_utilities.every_in_list(EL_FORMULA_P, formulas, UNPROVIDED)));
    }

    /**
     *
     *
     * @return boolean: T iff FORMULAS is a list of formulas
     */
    @LispMethod(comment = "@return boolean: T iff FORMULAS is a list of formulas")
    public static SubLObject formula_list_p(final SubLObject formulas) {
        return makeBoolean(formulas.isList() && (NIL != list_utilities.every_in_list(EL_FORMULA_P, formulas, UNPROVIDED)));
    }

    public static final SubLObject replace_pronouns_in_cycls_alt(SubLObject formulas) {
        return Mapping.mapcar(REPLACE_PRONOUNS_IN_CYCL, formulas);
    }

    public static SubLObject replace_pronouns_in_cycls(final SubLObject formulas) {
        return Mapping.mapcar(REPLACE_PRONOUNS_IN_CYCL, formulas);
    }

    /**
     * stub until DRT is incorporated:
     * replaces the ProunonFn NAT for 'I' and 'me' with the user's identity.
     * replaces the PronounFn NAT for 'you' with #$Cyc
     */
    @LispMethod(comment = "stub until DRT is incorporated:\r\nreplaces the ProunonFn NAT for \'I\' and \'me\' with the user\'s identity.\r\nreplaces the PronounFn NAT for \'you\' with #$Cyc\nstub until DRT is incorporated:\nreplaces the ProunonFn NAT for \'I\' and \'me\' with the user\'s identity.\nreplaces the PronounFn NAT for \'you\' with #$Cyc")
    public static final SubLObject replace_pronouns_in_cycl_alt(SubLObject formula) {
        formula = com.cyc.cycjava.cycl.rkf_formula_optimizer.replace_first_person_pronouns_in_cycl(formula, operation_communication.the_cyclist());
        formula = com.cyc.cycjava.cycl.rkf_formula_optimizer.replace_second_person_pronouns_in_cycl(formula, $$CycProgram);
        return formula;
    }

    @LispMethod(comment = "stub until DRT is incorporated:\r\nreplaces the ProunonFn NAT for \'I\' and \'me\' with the user\'s identity.\r\nreplaces the PronounFn NAT for \'you\' with #$Cyc\nstub until DRT is incorporated:\nreplaces the ProunonFn NAT for \'I\' and \'me\' with the user\'s identity.\nreplaces the PronounFn NAT for \'you\' with #$Cyc")
    public static SubLObject replace_pronouns_in_cycl(SubLObject formula) {
        formula = replace_first_person_pronouns_in_cycl(formula, operation_communication.the_cyclist());
        formula = replace_second_person_pronouns_in_cycl(formula, $$CycProgram);
        return formula;
    }/**
     * stub until DRT is incorporated:
     * replaces the ProunonFn NAT for 'I' and 'me' with the user's identity.
     * replaces the PronounFn NAT for 'you' with #$Cyc
     */


    public static final SubLObject replace_second_person_pronouns_in_cycl_alt(SubLObject formula, SubLObject meaning_of_you) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == com.cyc.cycjava.cycl.rkf_formula_optimizer.second_person_pronounP(meaning_of_you)) {
                {
                    SubLObject _prev_bind_0 = $rkf_meaning_of_you$.currentBinding(thread);
                    try {
                        $rkf_meaning_of_you$.bind(meaning_of_you, thread);
                        formula = cycl_utilities.expression_transform(formula, $sym10$SECOND_PERSON_PRONOUN_, REPLACE_WITH_YOU, UNPROVIDED, UNPROVIDED);
                    } finally {
                        $rkf_meaning_of_you$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return formula;
        }
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

    /**
     *
     *
     * @unknown this should really differentiate between singular and plural pronouns, replacing them with different things.
     */
    @LispMethod(comment = "@unknown this should really differentiate between singular and plural pronouns, replacing them with different things.")
    public static final SubLObject replace_first_person_pronouns_in_cycl_alt(SubLObject formula, SubLObject meaning_of_me) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == com.cyc.cycjava.cycl.rkf_formula_optimizer.first_person_pronounP(meaning_of_me)) {
                {
                    SubLObject _prev_bind_0 = $rkf_meaning_of_me$.currentBinding(thread);
                    try {
                        $rkf_meaning_of_me$.bind(meaning_of_me, thread);
                        formula = cycl_utilities.expression_transform(formula, $sym12$FIRST_PERSON_PRONOUN_, REPLACE_WITH_ME, UNPROVIDED, UNPROVIDED);
                    } finally {
                        $rkf_meaning_of_me$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return formula;
        }
    }

    /**
     *
     *
     * @unknown this should really differentiate between singular and plural pronouns, replacing them with different things.
     */
    @LispMethod(comment = "@unknown this should really differentiate between singular and plural pronouns, replacing them with different things.")
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

    public static final SubLObject second_person_pronounP_alt(SubLObject v_object) {
        return makeBoolean((cycl_utilities.formula_arg0(v_object) == $$PronounFn) && (cycl_utilities.formula_arg1(v_object, UNPROVIDED) == $$SecondPerson_NLAttr));
    }

    public static SubLObject second_person_pronounP(final SubLObject v_object) {
        return makeBoolean(cycl_utilities.formula_arg0(v_object).eql($$PronounFn) && cycl_utilities.formula_arg1(v_object, UNPROVIDED).eql($$SecondPerson_NLAttr));
    }

    public static final SubLObject first_person_pronounP_alt(SubLObject v_object) {
        return makeBoolean((cycl_utilities.formula_arg0(v_object) == $$PronounFn) && (cycl_utilities.formula_arg1(v_object, UNPROVIDED) == $$FirstPerson_NLAttr));
    }

    public static SubLObject first_person_pronounP(final SubLObject v_object) {
        return makeBoolean(cycl_utilities.formula_arg0(v_object).eql($$PronounFn) && cycl_utilities.formula_arg1(v_object, UNPROVIDED).eql($$FirstPerson_NLAttr));
    }

    public static final SubLObject replace_with_you_alt(SubLObject obj) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $rkf_meaning_of_you$.getDynamicValue(thread);
        }
    }

    public static SubLObject replace_with_you(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $rkf_meaning_of_you$.getDynamicValue(thread);
    }

    public static final SubLObject replace_with_me_alt(SubLObject obj) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $rkf_meaning_of_me$.getDynamicValue(thread);
        }
    }

    public static SubLObject replace_with_me(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $rkf_meaning_of_me$.getDynamicValue(thread);
    }

    /**
     *
     *
     * @unknown this really doesn't need all of the functionality in el-expression-equal? (e.g. these will all be sentences)
     */
    @LispMethod(comment = "@unknown this really doesn\'t need all of the functionality in el-expression-equal? (e.g. these will all be sentences)")
    public static final SubLObject rkf_reformulator_sentences_equalP_alt(SubLObject term_1, SubLObject term_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return czer_utilities.el_expression_equalP(term_1, term_2, mt, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @unknown this really doesn't need all of the functionality in el-expression-equal? (e.g. these will all be sentences)
     */
    @LispMethod(comment = "@unknown this really doesn\'t need all of the functionality in el-expression-equal? (e.g. these will all be sentences)")
    public static SubLObject rkf_reformulator_sentences_equalP(final SubLObject term_1, final SubLObject term_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return czer_utilities.el_expression_equalP(term_1, term_2, mt, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject declare_rkf_formula_optimizer_file_alt() {
        declareFunction("rkf_optimize_assert_formula", "RKF-OPTIMIZE-ASSERT-FORMULA", 2, 0, false);
        declareFunction("rkf_optimize_query_formula", "RKF-OPTIMIZE-QUERY-FORMULA", 2, 0, false);
        declareFunction("rkf_optimize_formula", "RKF-OPTIMIZE-FORMULA", 2, 0, false);
        declareFunction("rkf_exception_formulaP", "RKF-EXCEPTION-FORMULA?", 1, 0, false);
        declareFunction("rkf_reformulate_query_formula", "RKF-REFORMULATE-QUERY-FORMULA", 2, 1, false);
        declareFunction("rkf_reformulate_assert_formula", "RKF-REFORMULATE-ASSERT-FORMULA", 2, 1, false);
        declareFunction("rkf_reformulate_and_sharpen_into_many", "RKF-REFORMULATE-AND-SHARPEN-INTO-MANY", 2, 2, false);
        declareFunction("rkf_reformulate_before_strengthening_old_qp", "RKF-REFORMULATE-BEFORE-STRENGTHENING-OLD-QP", 2, 0, false);
        declareFunction("rkf_reformulate_before_strengthening_qp_3", "RKF-REFORMULATE-BEFORE-STRENGTHENING-QP-3", 2, 0, false);
        declareFunction("rkf_reformulate_before_strengthening", "RKF-REFORMULATE-BEFORE-STRENGTHENING", 2, 0, false);
        declareFunction("rkf_tersify", "RKF-TERSIFY", 2, 0, false);
        declareFunction("rkf_reformulate_into_many", "RKF-REFORMULATE-INTO-MANY", 2, 3, false);
        declareFunction("expression_contains_pronounP", "EXPRESSION-CONTAINS-PRONOUN?", 1, 0, false);
        declareFunction("formula_list_p", "FORMULA-LIST-P", 1, 0, false);
        declareFunction("replace_pronouns_in_cycls", "REPLACE-PRONOUNS-IN-CYCLS", 1, 0, false);
        declareFunction("replace_pronouns_in_cycl", "REPLACE-PRONOUNS-IN-CYCL", 1, 0, false);
        declareFunction("replace_second_person_pronouns_in_cycl", "REPLACE-SECOND-PERSON-PRONOUNS-IN-CYCL", 2, 0, false);
        declareFunction("replace_first_person_pronouns_in_cycl", "REPLACE-FIRST-PERSON-PRONOUNS-IN-CYCL", 2, 0, false);
        declareFunction("second_person_pronounP", "SECOND-PERSON-PRONOUN?", 1, 0, false);
        declareFunction("first_person_pronounP", "FIRST-PERSON-PRONOUN?", 1, 0, false);
        declareFunction("replace_with_you", "REPLACE-WITH-YOU", 1, 0, false);
        declareFunction("replace_with_me", "REPLACE-WITH-ME", 1, 0, false);
        declareFunction("rkf_reformulator_sentences_equalP", "RKF-REFORMULATOR-SENTENCES-EQUAL?", 2, 1, false);
        declareFunction("get_multiple_with_strengthening_mt", "GET-MULTIPLE-WITH-STRENGTHENING-MT", 1, 0, false);
        declareFunction("set_multiple_with_strengthening_mt", "SET-MULTIPLE-WITH-STRENGTHENING-MT", 2, 0, false);
        declareFunction("get_multiple_with_strengthening_out_cycl", "GET-MULTIPLE-WITH-STRENGTHENING-OUT-CYCL", 1, 0, false);
        declareFunction("set_multiple_with_strengthening_out_cycl", "SET-MULTIPLE-WITH-STRENGTHENING-OUT-CYCL", 2, 0, false);
        declareFunction("get_multiple_with_strengthening_in_cycl", "GET-MULTIPLE-WITH-STRENGTHENING-IN-CYCL", 1, 0, false);
        declareFunction("set_multiple_with_strengthening_in_cycl", "SET-MULTIPLE-WITH-STRENGTHENING-IN-CYCL", 2, 0, false);
        declareFunction("subloop_reserved_initialize_multiple_with_strengthening_class", "SUBLOOP-RESERVED-INITIALIZE-MULTIPLE-WITH-STRENGTHENING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_multiple_with_strengthening_instance", "SUBLOOP-RESERVED-INITIALIZE-MULTIPLE-WITH-STRENGTHENING-INSTANCE", 1, 0, false);
        declareFunction("multiple_with_strengthening_p", "MULTIPLE-WITH-STRENGTHENING-P", 1, 0, false);
        declareFunction("get_multiple_without_strengthening_mt", "GET-MULTIPLE-WITHOUT-STRENGTHENING-MT", 1, 0, false);
        declareFunction("set_multiple_without_strengthening_mt", "SET-MULTIPLE-WITHOUT-STRENGTHENING-MT", 2, 0, false);
        declareFunction("get_multiple_without_strengthening_out_cycl", "GET-MULTIPLE-WITHOUT-STRENGTHENING-OUT-CYCL", 1, 0, false);
        declareFunction("set_multiple_without_strengthening_out_cycl", "SET-MULTIPLE-WITHOUT-STRENGTHENING-OUT-CYCL", 2, 0, false);
        declareFunction("get_multiple_without_strengthening_in_cycl", "GET-MULTIPLE-WITHOUT-STRENGTHENING-IN-CYCL", 1, 0, false);
        declareFunction("set_multiple_without_strengthening_in_cycl", "SET-MULTIPLE-WITHOUT-STRENGTHENING-IN-CYCL", 2, 0, false);
        declareFunction("subloop_reserved_initialize_multiple_without_strengthening_class", "SUBLOOP-RESERVED-INITIALIZE-MULTIPLE-WITHOUT-STRENGTHENING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_multiple_without_strengthening_instance", "SUBLOOP-RESERVED-INITIALIZE-MULTIPLE-WITHOUT-STRENGTHENING-INSTANCE", 1, 0, false);
        declareFunction("multiple_without_strengthening_p", "MULTIPLE-WITHOUT-STRENGTHENING-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_rkf_formula_optimizer_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("rkf_optimize_assert_formula", "RKF-OPTIMIZE-ASSERT-FORMULA", 2, 0, false);
            declareFunction("rkf_optimize_query_formula", "RKF-OPTIMIZE-QUERY-FORMULA", 2, 0, false);
            declareFunction("rkf_optimize_formula", "RKF-OPTIMIZE-FORMULA", 2, 0, false);
            declareFunction("rkf_exception_formulaP", "RKF-EXCEPTION-FORMULA?", 1, 0, false);
            declareFunction("rkf_reformulate_query_formula", "RKF-REFORMULATE-QUERY-FORMULA", 2, 1, false);
            declareFunction("rkf_reformulate_assert_formula", "RKF-REFORMULATE-ASSERT-FORMULA", 2, 1, false);
            declareFunction("rkf_reformulate_and_sharpen_into_many", "RKF-REFORMULATE-AND-SHARPEN-INTO-MANY", 2, 2, false);
            declareFunction("rkf_reformulate_before_strengthening_old_qp", "RKF-REFORMULATE-BEFORE-STRENGTHENING-OLD-QP", 2, 0, false);
            declareFunction("rkf_reformulate_before_strengthening_qp_3", "RKF-REFORMULATE-BEFORE-STRENGTHENING-QP-3", 2, 0, false);
            declareFunction("rkf_reformulate_before_strengthening", "RKF-REFORMULATE-BEFORE-STRENGTHENING", 2, 0, false);
            declareFunction("rkf_tersify", "RKF-TERSIFY", 2, 0, false);
            declareFunction("rkf_reformulate_into_many", "RKF-REFORMULATE-INTO-MANY", 2, 3, false);
            declareFunction("expression_contains_pronounP", "EXPRESSION-CONTAINS-PRONOUN?", 1, 0, false);
            declareFunction("formula_list_p", "FORMULA-LIST-P", 1, 0, false);
            declareFunction("replace_pronouns_in_cycls", "REPLACE-PRONOUNS-IN-CYCLS", 1, 0, false);
            declareFunction("replace_pronouns_in_cycl", "REPLACE-PRONOUNS-IN-CYCL", 1, 0, false);
            declareFunction("replace_second_person_pronouns_in_cycl", "REPLACE-SECOND-PERSON-PRONOUNS-IN-CYCL", 2, 0, false);
            declareFunction("replace_first_person_pronouns_in_cycl", "REPLACE-FIRST-PERSON-PRONOUNS-IN-CYCL", 2, 0, false);
            declareFunction("second_person_pronounP", "SECOND-PERSON-PRONOUN?", 1, 0, false);
            declareFunction("first_person_pronounP", "FIRST-PERSON-PRONOUN?", 1, 0, false);
            declareFunction("replace_with_you", "REPLACE-WITH-YOU", 1, 0, false);
            declareFunction("replace_with_me", "REPLACE-WITH-ME", 1, 0, false);
            declareFunction("rkf_reformulator_sentences_equalP", "RKF-REFORMULATOR-SENTENCES-EQUAL?", 2, 1, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("get_multiple_with_strengthening_mt", "GET-MULTIPLE-WITH-STRENGTHENING-MT", 1, 0, false);
            declareFunction("set_multiple_with_strengthening_mt", "SET-MULTIPLE-WITH-STRENGTHENING-MT", 2, 0, false);
            declareFunction("get_multiple_with_strengthening_out_cycl", "GET-MULTIPLE-WITH-STRENGTHENING-OUT-CYCL", 1, 0, false);
            declareFunction("set_multiple_with_strengthening_out_cycl", "SET-MULTIPLE-WITH-STRENGTHENING-OUT-CYCL", 2, 0, false);
            declareFunction("get_multiple_with_strengthening_in_cycl", "GET-MULTIPLE-WITH-STRENGTHENING-IN-CYCL", 1, 0, false);
            declareFunction("set_multiple_with_strengthening_in_cycl", "SET-MULTIPLE-WITH-STRENGTHENING-IN-CYCL", 2, 0, false);
            declareFunction("subloop_reserved_initialize_multiple_with_strengthening_class", "SUBLOOP-RESERVED-INITIALIZE-MULTIPLE-WITH-STRENGTHENING-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_multiple_with_strengthening_instance", "SUBLOOP-RESERVED-INITIALIZE-MULTIPLE-WITH-STRENGTHENING-INSTANCE", 1, 0, false);
            declareFunction("multiple_with_strengthening_p", "MULTIPLE-WITH-STRENGTHENING-P", 1, 0, false);
            declareFunction("get_multiple_without_strengthening_mt", "GET-MULTIPLE-WITHOUT-STRENGTHENING-MT", 1, 0, false);
            declareFunction("set_multiple_without_strengthening_mt", "SET-MULTIPLE-WITHOUT-STRENGTHENING-MT", 2, 0, false);
            declareFunction("get_multiple_without_strengthening_out_cycl", "GET-MULTIPLE-WITHOUT-STRENGTHENING-OUT-CYCL", 1, 0, false);
            declareFunction("set_multiple_without_strengthening_out_cycl", "SET-MULTIPLE-WITHOUT-STRENGTHENING-OUT-CYCL", 2, 0, false);
            declareFunction("get_multiple_without_strengthening_in_cycl", "GET-MULTIPLE-WITHOUT-STRENGTHENING-IN-CYCL", 1, 0, false);
            declareFunction("set_multiple_without_strengthening_in_cycl", "SET-MULTIPLE-WITHOUT-STRENGTHENING-IN-CYCL", 2, 0, false);
            declareFunction("subloop_reserved_initialize_multiple_without_strengthening_class", "SUBLOOP-RESERVED-INITIALIZE-MULTIPLE-WITHOUT-STRENGTHENING-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_multiple_without_strengthening_instance", "SUBLOOP-RESERVED-INITIALIZE-MULTIPLE-WITHOUT-STRENGTHENING-INSTANCE", 1, 0, false);
            declareFunction("multiple_without_strengthening_p", "MULTIPLE-WITHOUT-STRENGTHENING-P", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_rkf_formula_optimizer_file_Previous() {
        declareFunction("rkf_optimize_assert_formula", "RKF-OPTIMIZE-ASSERT-FORMULA", 2, 0, false);
        declareFunction("rkf_optimize_query_formula", "RKF-OPTIMIZE-QUERY-FORMULA", 2, 0, false);
        declareFunction("rkf_optimize_formula", "RKF-OPTIMIZE-FORMULA", 2, 0, false);
        declareFunction("rkf_exception_formulaP", "RKF-EXCEPTION-FORMULA?", 1, 0, false);
        declareFunction("rkf_reformulate_query_formula", "RKF-REFORMULATE-QUERY-FORMULA", 2, 1, false);
        declareFunction("rkf_reformulate_assert_formula", "RKF-REFORMULATE-ASSERT-FORMULA", 2, 1, false);
        declareFunction("rkf_reformulate_and_sharpen_into_many", "RKF-REFORMULATE-AND-SHARPEN-INTO-MANY", 2, 2, false);
        declareFunction("rkf_reformulate_before_strengthening_old_qp", "RKF-REFORMULATE-BEFORE-STRENGTHENING-OLD-QP", 2, 0, false);
        declareFunction("rkf_reformulate_before_strengthening_qp_3", "RKF-REFORMULATE-BEFORE-STRENGTHENING-QP-3", 2, 0, false);
        declareFunction("rkf_reformulate_before_strengthening", "RKF-REFORMULATE-BEFORE-STRENGTHENING", 2, 0, false);
        declareFunction("rkf_tersify", "RKF-TERSIFY", 2, 0, false);
        declareFunction("rkf_reformulate_into_many", "RKF-REFORMULATE-INTO-MANY", 2, 3, false);
        declareFunction("expression_contains_pronounP", "EXPRESSION-CONTAINS-PRONOUN?", 1, 0, false);
        declareFunction("formula_list_p", "FORMULA-LIST-P", 1, 0, false);
        declareFunction("replace_pronouns_in_cycls", "REPLACE-PRONOUNS-IN-CYCLS", 1, 0, false);
        declareFunction("replace_pronouns_in_cycl", "REPLACE-PRONOUNS-IN-CYCL", 1, 0, false);
        declareFunction("replace_second_person_pronouns_in_cycl", "REPLACE-SECOND-PERSON-PRONOUNS-IN-CYCL", 2, 0, false);
        declareFunction("replace_first_person_pronouns_in_cycl", "REPLACE-FIRST-PERSON-PRONOUNS-IN-CYCL", 2, 0, false);
        declareFunction("second_person_pronounP", "SECOND-PERSON-PRONOUN?", 1, 0, false);
        declareFunction("first_person_pronounP", "FIRST-PERSON-PRONOUN?", 1, 0, false);
        declareFunction("replace_with_you", "REPLACE-WITH-YOU", 1, 0, false);
        declareFunction("replace_with_me", "REPLACE-WITH-ME", 1, 0, false);
        declareFunction("rkf_reformulator_sentences_equalP", "RKF-REFORMULATOR-SENTENCES-EQUAL?", 2, 1, false);
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

    public static final SubLObject setup_rkf_formula_optimizer_file_alt() {
        sunit_external.define_test_category($$$return_multiple_reformulations, UNPROVIDED);
        sunit_external.define_test_suite($str_alt17$rkf_formula_optimizer_test_suite, list($$$return_multiple_reformulations), UNPROVIDED, UNPROVIDED);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(MULTIPLE_WITH_STRENGTHENING, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(MULTIPLE_WITH_STRENGTHENING);
        classes.subloop_new_class(MULTIPLE_WITH_STRENGTHENING, TEST_CASE, NIL, NIL, $list_alt20);
        classes.class_set_implements_slot_listeners(MULTIPLE_WITH_STRENGTHENING, NIL);
        classes.subloop_note_class_initialization_function(MULTIPLE_WITH_STRENGTHENING, SUBLOOP_RESERVED_INITIALIZE_MULTIPLE_WITH_STRENGTHENING_CLASS);
        classes.subloop_note_instance_initialization_function(MULTIPLE_WITH_STRENGTHENING, SUBLOOP_RESERVED_INITIALIZE_MULTIPLE_WITH_STRENGTHENING_INSTANCE);
        com.cyc.cycjava.cycl.rkf_formula_optimizer.subloop_reserved_initialize_multiple_with_strengthening_class(MULTIPLE_WITH_STRENGTHENING);
        sunit_macros.define_test_case_postamble(MULTIPLE_WITH_STRENGTHENING, $str_alt38$rkf_formula_optimizer, $$$cycl, $list_alt40);
        sunit_macros.def_test_method_register(MULTIPLE_WITH_STRENGTHENING, USE_REFORMULATE_INTO_MULTIPLES);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(MULTIPLE_WITHOUT_STRENGTHENING, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(MULTIPLE_WITHOUT_STRENGTHENING);
        classes.subloop_new_class(MULTIPLE_WITHOUT_STRENGTHENING, TEST_CASE, NIL, NIL, $list_alt20);
        classes.class_set_implements_slot_listeners(MULTIPLE_WITHOUT_STRENGTHENING, NIL);
        classes.subloop_note_class_initialization_function(MULTIPLE_WITHOUT_STRENGTHENING, SUBLOOP_RESERVED_INITIALIZE_MULTIPLE_WITHOUT_STRENGTHENING_CLASS);
        classes.subloop_note_instance_initialization_function(MULTIPLE_WITHOUT_STRENGTHENING, $sym44$SUBLOOP_RESERVED_INITIALIZE_MULTIPLE_WITHOUT_STRENGTHENING_INSTAN);
        com.cyc.cycjava.cycl.rkf_formula_optimizer.subloop_reserved_initialize_multiple_without_strengthening_class(MULTIPLE_WITHOUT_STRENGTHENING);
        sunit_macros.define_test_case_postamble(MULTIPLE_WITHOUT_STRENGTHENING, $str_alt38$rkf_formula_optimizer, $$$cycl, $list_alt40);
        sunit_macros.def_test_method_register(MULTIPLE_WITHOUT_STRENGTHENING, USE_REFORMULATE_INTO_MULTIPLES);
        return NIL;
    }

    public static SubLObject setup_rkf_formula_optimizer_file() {
        if (SubLFiles.USE_V1) {
            sunit_external.define_test_category($$$return_multiple_reformulations, UNPROVIDED);
            sunit_external.define_test_suite($str17$rkf_formula_optimizer_test_suite, list($$$return_multiple_reformulations), UNPROVIDED, UNPROVIDED);
        }
        if (SubLFiles.USE_V2) {
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(MULTIPLE_WITH_STRENGTHENING, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(MULTIPLE_WITH_STRENGTHENING);
            classes.subloop_new_class(MULTIPLE_WITH_STRENGTHENING, TEST_CASE, NIL, NIL, $list_alt20);
            classes.class_set_implements_slot_listeners(MULTIPLE_WITH_STRENGTHENING, NIL);
            classes.subloop_note_class_initialization_function(MULTIPLE_WITH_STRENGTHENING, SUBLOOP_RESERVED_INITIALIZE_MULTIPLE_WITH_STRENGTHENING_CLASS);
            classes.subloop_note_instance_initialization_function(MULTIPLE_WITH_STRENGTHENING, SUBLOOP_RESERVED_INITIALIZE_MULTIPLE_WITH_STRENGTHENING_INSTANCE);
            com.cyc.cycjava.cycl.rkf_formula_optimizer.subloop_reserved_initialize_multiple_with_strengthening_class(MULTIPLE_WITH_STRENGTHENING);
            sunit_macros.define_test_case_postamble(MULTIPLE_WITH_STRENGTHENING, $str_alt38$rkf_formula_optimizer, $$$cycl, $list_alt40);
            sunit_macros.def_test_method_register(MULTIPLE_WITH_STRENGTHENING, USE_REFORMULATE_INTO_MULTIPLES);
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(MULTIPLE_WITHOUT_STRENGTHENING, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(MULTIPLE_WITHOUT_STRENGTHENING);
            classes.subloop_new_class(MULTIPLE_WITHOUT_STRENGTHENING, TEST_CASE, NIL, NIL, $list_alt20);
            classes.class_set_implements_slot_listeners(MULTIPLE_WITHOUT_STRENGTHENING, NIL);
            classes.subloop_note_class_initialization_function(MULTIPLE_WITHOUT_STRENGTHENING, SUBLOOP_RESERVED_INITIALIZE_MULTIPLE_WITHOUT_STRENGTHENING_CLASS);
            classes.subloop_note_instance_initialization_function(MULTIPLE_WITHOUT_STRENGTHENING, $sym44$SUBLOOP_RESERVED_INITIALIZE_MULTIPLE_WITHOUT_STRENGTHENING_INSTAN);
            com.cyc.cycjava.cycl.rkf_formula_optimizer.subloop_reserved_initialize_multiple_without_strengthening_class(MULTIPLE_WITHOUT_STRENGTHENING);
            sunit_macros.define_test_case_postamble(MULTIPLE_WITHOUT_STRENGTHENING, $str_alt38$rkf_formula_optimizer, $$$cycl, $list_alt40);
            sunit_macros.def_test_method_register(MULTIPLE_WITHOUT_STRENGTHENING, USE_REFORMULATE_INTO_MULTIPLES);
        }
        return NIL;
    }

    public static SubLObject setup_rkf_formula_optimizer_file_Previous() {
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

    

    static private final SubLList $list_alt1 = list(reader_make_constant_shell("exceptWhen"), reader_make_constant_shell("exceptFor"), reader_make_constant_shell("abnormal"));

    static private final SubLString $str_alt5$Optimizing_internal_representatio = makeString("Optimizing internal representation of knowledge.");

    static private final SubLString $str_alt17$rkf_formula_optimizer_test_suite = makeString("rkf-formula-optimizer-test-suite");

    private static final SubLSymbol MULTIPLE_WITH_STRENGTHENING = makeSymbol("MULTIPLE-WITH-STRENGTHENING");

    static private final SubLList $list_alt20 = list(list(makeSymbol("IN-CYCL"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("OUT-CYCL"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("MT"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("USE-REFORMULATE-INTO-MULTIPLES"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_MULTIPLE_WITH_STRENGTHENING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-MULTIPLE-WITH-STRENGTHENING-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_MULTIPLE_WITH_STRENGTHENING_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-MULTIPLE-WITH-STRENGTHENING-INSTANCE");

    static private final SubLString $str_alt38$rkf_formula_optimizer = makeString("rkf-formula-optimizer");

    static private final SubLString $$$cycl = makeString("cycl");

    static private final SubLList $list_alt40 = list(makeString("return multiple reformulations"));

    private static final SubLSymbol USE_REFORMULATE_INTO_MULTIPLES = makeSymbol("USE-REFORMULATE-INTO-MULTIPLES");

    private static final SubLSymbol MULTIPLE_WITHOUT_STRENGTHENING = makeSymbol("MULTIPLE-WITHOUT-STRENGTHENING");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_MULTIPLE_WITHOUT_STRENGTHENING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-MULTIPLE-WITHOUT-STRENGTHENING-CLASS");

    static private final SubLSymbol $sym44$SUBLOOP_RESERVED_INITIALIZE_MULTIPLE_WITHOUT_STRENGTHENING_INSTAN = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-MULTIPLE-WITHOUT-STRENGTHENING-INSTANCE");
}

/**
 * Total time: 74 ms
 */
