/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$hl_module_check_cost$;
import static com.cyc.cycjava.cycl.control_vars.$negation_by_failure$;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg1;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg2;
import static com.cyc.cycjava.cycl.el_utilities.literal_args;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.negation_predicate;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_negationinverse extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_negationinverse();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_negationinverse";


    // defparameter
    // Definitions
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_negationinverse_check_cost$ = makeSymbol("*DEFAULT-NEGATIONINVERSE-CHECK-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_not_negationinverse_check_cost$ = makeSymbol("*DEFAULT-NOT-NEGATIONINVERSE-CHECK-COST*");



    private static final SubLList $list3 = list(makeSymbol("PRED1"), makeSymbol("PRED2"));

    private static final SubLSymbol $REMOVAL_NEGATIONINVERSE_CHECK = makeKeyword("REMOVAL-NEGATIONINVERSE-CHECK");

    static private final SubLList $list6 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("negationInverse"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("negationInverse"), $FORT, $FORT), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NEGATIONINVERSE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NEGATIONINVERSE-CHECK-EXPAND") });

    private static final SubLSymbol $REMOVAL_MAX_NEGATIONINVERSE = makeKeyword("REMOVAL-MAX-NEGATIONINVERSE");

    static private final SubLList $list8 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("negationInverse"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell("negationInverse"), $FORT, makeKeyword("VARIABLE")), list(reader_make_constant_shell("negationInverse"), makeKeyword("VARIABLE"), $FORT)), $COST, makeSymbol("REMOVAL-MAX-NEGATIONINVERSE-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MAX-NEGATIONINVERSE-EXPAND") });

    private static final SubLSymbol $MAX_NEGATION_INVERSE_POS = makeKeyword("MAX-NEGATION-INVERSE-POS");

    private static final SubLList $list10 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("negationInverse"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell("negationInverse"), $FORT, makeKeyword("NOT-FULLY-BOUND")), list(reader_make_constant_shell("negationInverse"), makeKeyword("NOT-FULLY-BOUND"), $FORT)), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_NOT_NEGATIONINVERSE_CHECK = makeKeyword("REMOVAL-NOT-NEGATIONINVERSE-CHECK");

    private static final SubLList $list13 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("negationInverse"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("negationInverse"), $FORT, $FORT), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-NEGATIONINVERSE-CHECK-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-NEGATIONINVERSE-CHECK-EXPAND") });

    public static final SubLObject removal_negationinverse_check_expand_alt(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject datum = literal_args(literal, UNPROVIDED);
            SubLObject current = datum;
            SubLObject pred1 = NIL;
            SubLObject pred2 = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt1);
            pred1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt1);
            pred2 = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != negation_predicate.negation_inverseP(pred1, pred2, UNPROVIDED, UNPROVIDED)) {
                    {
                        SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal($$negationInverse, list(pred1, pred2));
                        backward.removal_add_node(arguments.make_hl_support($NEGATIONPREDS, hl_support_formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt1);
            }
        }
        return NIL;
    }

    public static SubLObject removal_negationinverse_check_expand(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = literal_args(literal, UNPROVIDED);
        SubLObject pred1 = NIL;
        SubLObject pred2 = NIL;
        destructuring_bind_must_consp(current, datum, $list3);
        pred1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list3);
        pred2 = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != negation_predicate.negation_inverseP(pred1, pred2, UNPROVIDED, UNPROVIDED)) {
                final SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal($$negationInverse, list(pred1, pred2));
                backward.removal_add_node(arguments.make_hl_support($NEGATIONPREDS, hl_support_formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
        } else {
            cdestructuring_bind_error(datum, $list3);
        }
        return NIL;
    }

    public static final SubLObject removal_max_negationinverse_cost_alt(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject v_term = literal_arg1(literal, UNPROVIDED);
            if (NIL == forts.fort_p(v_term)) {
                v_term = literal_arg2(literal, UNPROVIDED);
            }
            return cardinality_estimates.genl_cardinality(v_term);
        }
    }

    public static SubLObject removal_max_negationinverse_cost(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject v_term = literal_arg1(literal, UNPROVIDED);
        if (NIL == forts.fort_p(v_term)) {
            v_term = literal_arg2(literal, UNPROVIDED);
        }
        return cardinality_estimates.genl_cardinality(v_term);
    }

    public static final SubLObject removal_max_negationinverse_expand_alt(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject term1 = literal_arg1(literal, UNPROVIDED);
                SubLObject term2 = literal_arg2(literal, UNPROVIDED);
                SubLObject variable = (NIL != variables.variable_p(term1)) ? ((SubLObject) (term1)) : term2;
                SubLObject fort = (NIL != forts.fort_p(term1)) ? ((SubLObject) (term1)) : term2;
                SubLObject disjoint_terms = negation_predicate.max_negation_inverses(fort, UNPROVIDED);
                SubLObject cdolist_list_var = disjoint_terms;
                SubLObject disjoint_term = NIL;
                for (disjoint_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , disjoint_term = cdolist_list_var.first()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject v_bindings = unification_utilities.term_unify(variable, disjoint_term, T, T);
                        SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != v_bindings) {
                            {
                                SubLObject subst_literal = bindings.subst_bindings(v_bindings, literal);
                                SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal($$negationInverse, literal_args(subst_literal, UNPROVIDED));
                                backward.removal_add_node(arguments.make_hl_support($NEGATIONPREDS, hl_support_formula, UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_max_negationinverse_expand(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term1 = literal_arg1(literal, UNPROVIDED);
        final SubLObject term2 = literal_arg2(literal, UNPROVIDED);
        final SubLObject variable = (NIL != variables.variable_p(term1)) ? term1 : term2;
        final SubLObject fort = (NIL != forts.fort_p(term1)) ? term1 : term2;
        SubLObject cdolist_list_var;
        final SubLObject disjoint_terms = cdolist_list_var = negation_predicate.max_negation_inverses(fort, UNPROVIDED);
        SubLObject disjoint_term = NIL;
        disjoint_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(variable, disjoint_term, T, T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                final SubLObject subst_literal = bindings.subst_bindings(v_bindings, literal);
                final SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal($$negationInverse, literal_args(subst_literal, UNPROVIDED));
                backward.removal_add_node(arguments.make_hl_support($NEGATIONPREDS, hl_support_formula, UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
            }
            cdolist_list_var = cdolist_list_var.rest();
            disjoint_term = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject removal_not_negationinverse_check_expand_alt(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = literal_args(literal, UNPROVIDED);
                SubLObject current = datum;
                SubLObject pred1 = NIL;
                SubLObject pred2 = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt1);
                pred1 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt1);
                pred2 = current.first();
                current = current.rest();
                if (NIL == current) {
                    if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == negation_predicate.negation_inverseP(pred1, pred2, UNPROVIDED, UNPROVIDED))) {
                        {
                            SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal($$negationInverse, list(pred1, pred2));
                            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(hl_support_formula), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                        }
                    } else {
                        if (NIL != negation_predicate.not_negation_inverseP(pred1, pred2, UNPROVIDED, UNPROVIDED)) {
                            {
                                SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal($$negationInverse, list(pred1, pred2));
                                backward.removal_add_node(arguments.make_hl_support($NEGATIONPREDS, cycl_utilities.negate(hl_support_formula), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt1);
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_not_negationinverse_check_expand(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = literal_args(literal, UNPROVIDED);
        SubLObject pred1 = NIL;
        SubLObject pred2 = NIL;
        destructuring_bind_must_consp(current, datum, $list3);
        pred1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list3);
        pred2 = current.first();
        current = current.rest();
        if (NIL == current) {
            if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == negation_predicate.negation_inverseP(pred1, pred2, UNPROVIDED, UNPROVIDED))) {
                final SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal($$negationInverse, list(pred1, pred2));
                backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(hl_support_formula), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            } else
                if (NIL != negation_predicate.not_negation_inverseP(pred1, pred2, UNPROVIDED, UNPROVIDED)) {
                    final SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal($$negationInverse, list(pred1, pred2));
                    backward.removal_add_node(arguments.make_hl_support($NEGATIONPREDS, cycl_utilities.negate(hl_support_formula), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                }

        } else {
            cdestructuring_bind_error(datum, $list3);
        }
        return NIL;
    }

    static private final SubLList $list_alt1 = list(makeSymbol("PRED1"), makeSymbol("PRED2"));

    public static SubLObject declare_removal_modules_negationinverse_file() {
        declareFunction("removal_negationinverse_check_expand", "REMOVAL-NEGATIONINVERSE-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_max_negationinverse_cost", "REMOVAL-MAX-NEGATIONINVERSE-COST", 1, 1, false);
        declareFunction("removal_max_negationinverse_expand", "REMOVAL-MAX-NEGATIONINVERSE-EXPAND", 1, 1, false);
        declareFunction("removal_not_negationinverse_check_expand", "REMOVAL-NOT-NEGATIONINVERSE-CHECK-EXPAND", 1, 1, false);
        return NIL;
    }

    static private final SubLList $list_alt4 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("negationInverse"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("negationInverse"), $FORT, $FORT), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NEGATIONINVERSE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NEGATIONINVERSE-CHECK-EXPAND") });

    public static SubLObject init_removal_modules_negationinverse_file() {
        defparameter("*DEFAULT-NEGATIONINVERSE-CHECK-COST*", $hl_module_check_cost$.getDynamicValue());
        defparameter("*DEFAULT-NOT-NEGATIONINVERSE-CHECK-COST*", TWO_INTEGER);
        return NIL;
    }

    static private final SubLList $list_alt6 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("negationInverse"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell("negationInverse"), $FORT, makeKeyword("VARIABLE")), list(reader_make_constant_shell("negationInverse"), makeKeyword("VARIABLE"), $FORT)), $COST, makeSymbol("REMOVAL-MAX-NEGATIONINVERSE-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MAX-NEGATIONINVERSE-EXPAND") });

    public static final SubLObject setup_removal_modules_negationinverse_file_alt() {
        inference_modules.register_solely_specific_removal_module_predicate($$negationInverse);
        inference_modules.inference_removal_module($REMOVAL_NEGATIONINVERSE_CHECK, $list_alt4);
        inference_modules.inference_removal_module($REMOVAL_MAX_NEGATIONINVERSE, $list_alt6);
        preference_modules.inference_preference_module($MAX_NEGATION_INVERSE_POS, $list_alt8);
        inference_modules.inference_removal_module($REMOVAL_NOT_NEGATIONINVERSE_CHECK, $list_alt11);
        return NIL;
    }

    public static SubLObject setup_removal_modules_negationinverse_file() {
        if (SubLFiles.USE_V1) {
            inference_modules.register_solely_specific_removal_module_predicate($$negationInverse);
            preference_modules.doomed_unless_either_arg_bindable($POS, $$negationInverse);
            preference_modules.doomed_unless_all_args_bindable($NEG, $$negationInverse);
            inference_modules.inference_removal_module($REMOVAL_NEGATIONINVERSE_CHECK, $list6);
            inference_modules.inference_removal_module($REMOVAL_MAX_NEGATIONINVERSE, $list8);
            preference_modules.inference_preference_module($MAX_NEGATION_INVERSE_POS, $list10);
            inference_modules.inference_removal_module($REMOVAL_NOT_NEGATIONINVERSE_CHECK, $list13);
        }
        if (SubLFiles.USE_V2) {
            inference_modules.inference_removal_module($REMOVAL_NEGATIONINVERSE_CHECK, $list_alt4);
            inference_modules.inference_removal_module($REMOVAL_MAX_NEGATIONINVERSE, $list_alt6);
            preference_modules.inference_preference_module($MAX_NEGATION_INVERSE_POS, $list_alt8);
            inference_modules.inference_removal_module($REMOVAL_NOT_NEGATIONINVERSE_CHECK, $list_alt11);
        }
        return NIL;
    }

    public static SubLObject setup_removal_modules_negationinverse_file_Previous() {
        inference_modules.register_solely_specific_removal_module_predicate($$negationInverse);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$negationInverse);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$negationInverse);
        inference_modules.inference_removal_module($REMOVAL_NEGATIONINVERSE_CHECK, $list6);
        inference_modules.inference_removal_module($REMOVAL_MAX_NEGATIONINVERSE, $list8);
        preference_modules.inference_preference_module($MAX_NEGATION_INVERSE_POS, $list10);
        inference_modules.inference_removal_module($REMOVAL_NOT_NEGATIONINVERSE_CHECK, $list13);
        return NIL;
    }

    static private final SubLList $list_alt8 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("negationInverse"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell("negationInverse"), $FORT, makeKeyword("NOT-FULLY-BOUND")), list(reader_make_constant_shell("negationInverse"), makeKeyword("NOT-FULLY-BOUND"), $FORT)), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    @Override
    public void declareFunctions() {
        declare_removal_modules_negationinverse_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_negationinverse_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_negationinverse_file();
    }

    static {
    }

    static private final SubLList $list_alt11 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("negationInverse"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("negationInverse"), $FORT, $FORT), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-NEGATIONINVERSE-CHECK-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-NEGATIONINVERSE-CHECK-EXPAND") });
}

/**
 * Total time: 92 ms
 */
