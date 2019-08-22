package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

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
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_negationpreds extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_negationpreds();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_negationpreds";

    public static final String myFingerPrint = "d442a29d4b5f70fcef40638746f8390262819a47716cca8918ecc425e0a5aaa1";

    // defparameter
    // Definitions
    private static final SubLSymbol $default_negationpreds_check_cost$ = makeSymbol("*DEFAULT-NEGATIONPREDS-CHECK-COST*");

    // defparameter
    private static final SubLSymbol $default_not_negationpreds_check_cost$ = makeSymbol("*DEFAULT-NOT-NEGATIONPREDS-CHECK-COST*");

    private static final SubLObject $$negationPreds = reader_make_constant_shell(makeString("negationPreds"));





    private static final SubLList $list3 = list(makeSymbol("PRED1"), makeSymbol("PRED2"));



    private static final SubLSymbol $REMOVAL_NEGATIONPREDS_CHECK = makeKeyword("REMOVAL-NEGATIONPREDS-CHECK");

    public static final SubLList $list6 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("negationPreds")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("negationPreds")), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NEGATIONPREDS-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NEGATIONPREDS-CHECK-EXPAND") });

    private static final SubLSymbol $REMOVAL_MAX_NEGATIONPREDS = makeKeyword("REMOVAL-MAX-NEGATIONPREDS");

    public static final SubLList $list8 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("negationPreds")), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("negationPreds")), makeKeyword("FORT"), makeKeyword("VARIABLE")), list(reader_make_constant_shell(makeString("negationPreds")), makeKeyword("VARIABLE"), makeKeyword("FORT"))), makeKeyword("COST"), makeSymbol("REMOVAL-MAX-NEGATIONPREDS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MAX-NEGATIONPREDS-EXPAND") });

    private static final SubLSymbol $MAX_NEGATION_PREDS_POS = makeKeyword("MAX-NEGATION-PREDS-POS");

    private static final SubLList $list10 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("negationPreds")), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("negationPreds")), makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND")), list(reader_make_constant_shell(makeString("negationPreds")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FORT"))), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));



    private static final SubLSymbol $REMOVAL_NOT_NEGATIONPREDS_CHECK = makeKeyword("REMOVAL-NOT-NEGATIONPREDS-CHECK");

    private static final SubLList $list13 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("negationPreds")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("negationPreds")), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-NEGATIONPREDS-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-NEGATIONPREDS-CHECK-EXPAND") });

    public static SubLObject removal_negationpreds_check_expand(final SubLObject literal, SubLObject sense) {
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
            if (NIL != negation_predicate.negation_predicateP(pred1, pred2, UNPROVIDED, UNPROVIDED)) {
                final SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal($$negationPreds, list(pred1, pred2));
                backward.removal_add_node(arguments.make_hl_support($NEGATIONPREDS, hl_support_formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
        } else {
            cdestructuring_bind_error(datum, $list3);
        }
        return NIL;
    }

    public static SubLObject removal_max_negationpreds_cost(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject v_term = literal_arg1(literal, UNPROVIDED);
        if (NIL == forts.fort_p(v_term)) {
            v_term = literal_arg2(literal, UNPROVIDED);
        }
        return cardinality_estimates.genl_cardinality(v_term);
    }

    public static SubLObject removal_max_negationpreds_expand(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term1 = literal_arg1(literal, UNPROVIDED);
        final SubLObject term2 = literal_arg2(literal, UNPROVIDED);
        final SubLObject variable = (NIL != variables.variable_p(term1)) ? term1 : term2;
        final SubLObject fort = (NIL != forts.fort_p(term1)) ? term1 : term2;
        SubLObject cdolist_list_var;
        final SubLObject disjoint_terms = cdolist_list_var = negation_predicate.max_negation_predicates(fort, UNPROVIDED);
        SubLObject disjoint_term = NIL;
        disjoint_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(variable, disjoint_term, T, T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                final SubLObject subst_literal = bindings.subst_bindings(v_bindings, literal);
                final SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal($$negationPreds, literal_args(subst_literal, UNPROVIDED));
                backward.removal_add_node(arguments.make_hl_support($NEGATIONPREDS, hl_support_formula, UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
            }
            cdolist_list_var = cdolist_list_var.rest();
            disjoint_term = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject removal_not_negationpreds_check_expand(final SubLObject literal, SubLObject sense) {
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
            if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == negation_predicate.negation_predicateP(pred1, pred2, UNPROVIDED, UNPROVIDED))) {
                final SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal($$negationPreds, list(pred1, pred2));
                backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(hl_support_formula), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            } else
                if (NIL != negation_predicate.not_negation_predicateP(pred1, pred2, UNPROVIDED, UNPROVIDED)) {
                    final SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal($$negationPreds, list(pred1, pred2));
                    backward.removal_add_node(arguments.make_hl_support($NEGATIONPREDS, cycl_utilities.negate(hl_support_formula), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                }

        } else {
            cdestructuring_bind_error(datum, $list3);
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_negationpreds_file() {
        declareFunction(me, "removal_negationpreds_check_expand", "REMOVAL-NEGATIONPREDS-CHECK-EXPAND", 1, 1, false);
        declareFunction(me, "removal_max_negationpreds_cost", "REMOVAL-MAX-NEGATIONPREDS-COST", 1, 1, false);
        declareFunction(me, "removal_max_negationpreds_expand", "REMOVAL-MAX-NEGATIONPREDS-EXPAND", 1, 1, false);
        declareFunction(me, "removal_not_negationpreds_check_expand", "REMOVAL-NOT-NEGATIONPREDS-CHECK-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_negationpreds_file() {
        defparameter("*DEFAULT-NEGATIONPREDS-CHECK-COST*", $hl_module_check_cost$.getDynamicValue());
        defparameter("*DEFAULT-NOT-NEGATIONPREDS-CHECK-COST*", TWO_INTEGER);
        return NIL;
    }

    public static SubLObject setup_removal_modules_negationpreds_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$negationPreds);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$negationPreds);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$negationPreds);
        inference_modules.inference_removal_module($REMOVAL_NEGATIONPREDS_CHECK, $list6);
        inference_modules.inference_removal_module($REMOVAL_MAX_NEGATIONPREDS, $list8);
        preference_modules.inference_preference_module($MAX_NEGATION_PREDS_POS, $list10);
        inference_modules.inference_removal_module($REMOVAL_NOT_NEGATIONPREDS_CHECK, $list13);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_negationpreds_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_negationpreds_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_negationpreds_file();
    }

    
}

/**
 * Total time: 87 ms
 */
