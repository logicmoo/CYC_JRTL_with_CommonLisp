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

public class removal_modules_negationinverse extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "a3a4a1aaec237688d9b1cafcedcaf431dbe23d7f2f539eceec9ec3134c1933c8";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-negationinverse.lisp", position = 700L)
    private static SubLSymbol $default_negationinverse_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-negationinverse.lisp", position = 3400L)
    private static SubLSymbol $default_not_negationinverse_check_cost$;
    private static SubLObject $$negationInverse;
    private static SubLSymbol $POS;
    private static SubLSymbol $NEG;
    private static SubLList $list3;
    private static SubLSymbol $NEGATIONPREDS;
    private static SubLSymbol $REMOVAL_NEGATIONINVERSE_CHECK;
    private static SubLList $list6;
    private static SubLSymbol $REMOVAL_MAX_NEGATIONINVERSE;
    private static SubLList $list8;
    private static SubLSymbol $MAX_NEGATION_INVERSE_POS;
    private static SubLList $list10;
    private static SubLSymbol $MINIMIZE;
    private static SubLSymbol $REMOVAL_NOT_NEGATIONINVERSE_CHECK;
    private static SubLList $list13;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-negationinverse.lisp", position = 900L)
    public static SubLObject removal_negationinverse_check_expand(SubLObject literal, SubLObject sense) {
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
            if (NIL != negation_predicate.negation_inverseP(pred1, pred2, UNPROVIDED, UNPROVIDED)) {
                SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal($$negationInverse, list(pred1, pred2));
                backward.removal_add_node(arguments.make_hl_support($NEGATIONPREDS, hl_support_formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list3);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-negationinverse.lisp", position = 1600L)
    public static SubLObject removal_max_negationinverse_cost(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject v_term = el_utilities.literal_arg1(literal, UNPROVIDED);
        if (NIL == forts.fort_p(v_term)) {
            v_term = el_utilities.literal_arg2(literal, UNPROVIDED);
        }
        return cardinality_estimates.genl_cardinality(v_term);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-negationinverse.lisp", position = 1900L)
    public static SubLObject removal_max_negationinverse_expand(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject term1 = el_utilities.literal_arg1(literal, UNPROVIDED);
        SubLObject term2 = el_utilities.literal_arg2(literal, UNPROVIDED);
        SubLObject variable = (NIL != variables.variable_p(term1)) ? term1 : term2;
        SubLObject fort = (NIL != forts.fort_p(term1)) ? term1 : term2;
        SubLObject cdolist_list_var;
        SubLObject disjoint_terms = cdolist_list_var = negation_predicate.max_negation_inverses(fort, UNPROVIDED);
        SubLObject disjoint_term = NIL;
        disjoint_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            SubLObject v_bindings = unification_utilities.term_unify(variable, disjoint_term, T, T);
            SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                SubLObject subst_literal = bindings.subst_bindings(v_bindings, literal);
                SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal($$negationInverse, el_utilities.literal_args(subst_literal, UNPROVIDED));
                backward.removal_add_node(arguments.make_hl_support($NEGATIONPREDS, hl_support_formula, UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
            }
            cdolist_list_var = cdolist_list_var.rest();
            disjoint_term = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-negationinverse.lisp", position = 3600L)
    public static SubLObject removal_not_negationinverse_check_expand(SubLObject literal, SubLObject sense) {
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
            if (NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && NIL == negation_predicate.negation_inverseP(pred1, pred2, UNPROVIDED, UNPROVIDED)) {
                SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal($$negationInverse, list(pred1, pred2));
                backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(hl_support_formula), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            } else if (NIL != negation_predicate.not_negation_inverseP(pred1, pred2, UNPROVIDED, UNPROVIDED)) {
                SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal($$negationInverse, list(pred1, pred2));
                backward.removal_add_node(arguments.make_hl_support($NEGATIONPREDS, cycl_utilities.negate(hl_support_formula), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list3);
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_negationinverse_file() {
        declareFunction("removal_negationinverse_check_expand", "REMOVAL-NEGATIONINVERSE-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_max_negationinverse_cost", "REMOVAL-MAX-NEGATIONINVERSE-COST", 1, 1, false);
        declareFunction("removal_max_negationinverse_expand", "REMOVAL-MAX-NEGATIONINVERSE-EXPAND", 1, 1, false);
        declareFunction("removal_not_negationinverse_check_expand", "REMOVAL-NOT-NEGATIONINVERSE-CHECK-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_negationinverse_file() {
        $default_negationinverse_check_cost$ = defparameter("*DEFAULT-NEGATIONINVERSE-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        $default_not_negationinverse_check_cost$ = defparameter("*DEFAULT-NOT-NEGATIONINVERSE-CHECK-COST*", TWO_INTEGER);
        return NIL;
    }

    public static SubLObject setup_removal_modules_negationinverse_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$negationInverse);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$negationInverse);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$negationInverse);
        inference_modules.inference_removal_module($REMOVAL_NEGATIONINVERSE_CHECK, $list6);
        inference_modules.inference_removal_module($REMOVAL_MAX_NEGATIONINVERSE, $list8);
        preference_modules.inference_preference_module($MAX_NEGATION_INVERSE_POS, $list10);
        inference_modules.inference_removal_module($REMOVAL_NOT_NEGATIONINVERSE_CHECK, $list13);
        return NIL;
    }

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
        me = new removal_modules_negationinverse();
        $default_negationinverse_check_cost$ = null;
        $default_not_negationinverse_check_cost$ = null;
        $$negationInverse = makeConstSym(("negationInverse"));
        $POS = makeKeyword("POS");
        $NEG = makeKeyword("NEG");
        $list3 = list(makeSymbol("PRED1"), makeSymbol("PRED2"));
        $NEGATIONPREDS = makeKeyword("NEGATIONPREDS");
        $REMOVAL_NEGATIONINVERSE_CHECK = makeKeyword("REMOVAL-NEGATIONINVERSE-CHECK");
        $list6 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("negationInverse")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("negationInverse")), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*DEFAULT-NEGATIONINVERSE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NEGATIONINVERSE-CHECK-EXPAND") });
        $REMOVAL_MAX_NEGATIONINVERSE = makeKeyword("REMOVAL-MAX-NEGATIONINVERSE");
        $list8 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("negationInverse")), makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("OR"), list(makeConstSym(("negationInverse")), makeKeyword("FORT"), makeKeyword("VARIABLE")), list(makeConstSym(("negationInverse")), makeKeyword("VARIABLE"), makeKeyword("FORT"))), makeKeyword("COST"), makeSymbol("REMOVAL-MAX-NEGATIONINVERSE-COST"),
                makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MAX-NEGATIONINVERSE-EXPAND") });
        $MAX_NEGATION_INVERSE_POS = makeKeyword("MAX-NEGATION-INVERSE-POS");
        $list10 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("negationInverse")), makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("OR"), list(makeConstSym(("negationInverse")), makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND")), list(makeConstSym(("negationInverse")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FORT"))), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));
        $MINIMIZE = makeKeyword("MINIMIZE");
        $REMOVAL_NOT_NEGATIONINVERSE_CHECK = makeKeyword("REMOVAL-NOT-NEGATIONINVERSE-CHECK");
        $list13 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("negationInverse")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("negationInverse")), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*DEFAULT-NOT-NEGATIONINVERSE-CHECK-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-NEGATIONINVERSE-CHECK-EXPAND") });
    }
}
/*
 *
 * Total time: 92 ms
 *
 */