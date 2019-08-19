package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_negationpreds extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_negationpreds";
    public static String myFingerPrint = "d442a29d4b5f70fcef40638746f8390262819a47716cca8918ecc425e0a5aaa1";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-negationpreds.lisp", position = 700L)
    private static SubLSymbol $default_negationpreds_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-negationpreds.lisp", position = 3300L)
    private static SubLSymbol $default_not_negationpreds_check_cost$;
    private static SubLObject $$negationPreds;
    private static SubLSymbol $POS;
    private static SubLSymbol $NEG;
    private static SubLList $list3;
    private static SubLSymbol $NEGATIONPREDS;
    private static SubLSymbol $REMOVAL_NEGATIONPREDS_CHECK;
    private static SubLList $list6;
    private static SubLSymbol $REMOVAL_MAX_NEGATIONPREDS;
    private static SubLList $list8;
    private static SubLSymbol $MAX_NEGATION_PREDS_POS;
    private static SubLList $list10;
    private static SubLSymbol $MINIMIZE;
    private static SubLSymbol $REMOVAL_NOT_NEGATIONPREDS_CHECK;
    private static SubLList $list13;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-negationpreds.lisp", position = 800L)
    public static SubLObject removal_negationpreds_check_expand(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject current;
        SubLObject datum = current = el_utilities.literal_args(literal, UNPROVIDED);
        SubLObject pred1 = NIL;
        SubLObject pred2 = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list3);
        pred1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list3);
        pred2 = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != negation_predicate.negation_predicateP(pred1, pred2, UNPROVIDED, UNPROVIDED)) {
                SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal($$negationPreds, list(pred1, pred2));
                backward.removal_add_node(arguments.make_hl_support($NEGATIONPREDS, hl_support_formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list3);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-negationpreds.lisp", position = 1500L)
    public static SubLObject removal_max_negationpreds_cost(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject v_term = el_utilities.literal_arg1(literal, UNPROVIDED);
        if (NIL == forts.fort_p(v_term)) {
            v_term = el_utilities.literal_arg2(literal, UNPROVIDED);
        }
        return cardinality_estimates.genl_cardinality(v_term);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-negationpreds.lisp", position = 1900L)
    public static SubLObject removal_max_negationpreds_expand(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject term1 = el_utilities.literal_arg1(literal, UNPROVIDED);
        SubLObject term2 = el_utilities.literal_arg2(literal, UNPROVIDED);
        SubLObject variable = (NIL != variables.variable_p(term1)) ? term1 : term2;
        SubLObject fort = (NIL != forts.fort_p(term1)) ? term1 : term2;
        SubLObject cdolist_list_var;
        SubLObject disjoint_terms = cdolist_list_var = negation_predicate.max_negation_predicates(fort, UNPROVIDED);
        SubLObject disjoint_term = NIL;
        disjoint_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            SubLObject v_bindings = unification_utilities.term_unify(variable, disjoint_term, T, T);
            SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                SubLObject subst_literal = bindings.subst_bindings(v_bindings, literal);
                SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal($$negationPreds, el_utilities.literal_args(subst_literal, UNPROVIDED));
                backward.removal_add_node(arguments.make_hl_support($NEGATIONPREDS, hl_support_formula, UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
            }
            cdolist_list_var = cdolist_list_var.rest();
            disjoint_term = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-negationpreds.lisp", position = 3500L)
    public static SubLObject removal_not_negationpreds_check_expand(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        SubLObject datum = current = el_utilities.literal_args(literal, UNPROVIDED);
        SubLObject pred1 = NIL;
        SubLObject pred2 = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list3);
        pred1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list3);
        pred2 = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && NIL == negation_predicate.negation_predicateP(pred1, pred2, UNPROVIDED, UNPROVIDED)) {
                SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal($$negationPreds, list(pred1, pred2));
                backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(hl_support_formula), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            } else if (NIL != negation_predicate.not_negation_predicateP(pred1, pred2, UNPROVIDED, UNPROVIDED)) {
                SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal($$negationPreds, list(pred1, pred2));
                backward.removal_add_node(arguments.make_hl_support($NEGATIONPREDS, cycl_utilities.negate(hl_support_formula), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list3);
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_negationpreds_file() {
        declareFunction(myName, "removal_negationpreds_check_expand", "REMOVAL-NEGATIONPREDS-CHECK-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_max_negationpreds_cost", "REMOVAL-MAX-NEGATIONPREDS-COST", 1, 1, false);
        declareFunction(myName, "removal_max_negationpreds_expand", "REMOVAL-MAX-NEGATIONPREDS-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_not_negationpreds_check_expand", "REMOVAL-NOT-NEGATIONPREDS-CHECK-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_negationpreds_file() {
        $default_negationpreds_check_cost$ = defparameter("*DEFAULT-NEGATIONPREDS-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        $default_not_negationpreds_check_cost$ = defparameter("*DEFAULT-NOT-NEGATIONPREDS-CHECK-COST*", TWO_INTEGER);
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

    static {
        me = new removal_modules_negationpreds();
        $default_negationpreds_check_cost$ = null;
        $default_not_negationpreds_check_cost$ = null;
        $$negationPreds = makeConstSym(("negationPreds"));
        $POS = makeKeyword("POS");
        $NEG = makeKeyword("NEG");
        $list3 = list(makeSymbol("PRED1"), makeSymbol("PRED2"));
        $NEGATIONPREDS = makeKeyword("NEGATIONPREDS");
        $REMOVAL_NEGATIONPREDS_CHECK = makeKeyword("REMOVAL-NEGATIONPREDS-CHECK");
        $list6 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("negationPreds")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("negationPreds")), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*DEFAULT-NEGATIONPREDS-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NEGATIONPREDS-CHECK-EXPAND") });
        $REMOVAL_MAX_NEGATIONPREDS = makeKeyword("REMOVAL-MAX-NEGATIONPREDS");
        $list8 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("negationPreds")), makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("OR"), list(makeConstSym(("negationPreds")), makeKeyword("FORT"), makeKeyword("VARIABLE")), list(makeConstSym(("negationPreds")), makeKeyword("VARIABLE"), makeKeyword("FORT"))), makeKeyword("COST"), makeSymbol("REMOVAL-MAX-NEGATIONPREDS-COST"),
                makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MAX-NEGATIONPREDS-EXPAND") });
        $MAX_NEGATION_PREDS_POS = makeKeyword("MAX-NEGATION-PREDS-POS");
        $list10 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("negationPreds")), makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("OR"), list(makeConstSym(("negationPreds")), makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND")), list(makeConstSym(("negationPreds")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FORT"))), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));
        $MINIMIZE = makeKeyword("MINIMIZE");
        $REMOVAL_NOT_NEGATIONPREDS_CHECK = makeKeyword("REMOVAL-NOT-NEGATIONPREDS-CHECK");
        $list13 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("negationPreds")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("negationPreds")), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*DEFAULT-NOT-NEGATIONPREDS-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-NEGATIONPREDS-CHECK-EXPAND") });
    }
}
/*
 *
 * Total time: 87 ms
 *
 */