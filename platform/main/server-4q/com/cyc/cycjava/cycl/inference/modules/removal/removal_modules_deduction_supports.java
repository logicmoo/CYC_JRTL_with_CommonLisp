package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.deduction_handles;
import com.cyc.cycjava.cycl.deductions_high;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_deduction_supports extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "56ece29b3c5aabe1d774937426208a43dda96b378d3e6d82e992939ae32d2122";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-deduction-supports.lisp", position = 1800L)
    private static SubLSymbol $default_deduction_supports_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-deduction-supports.lisp", position = 2100L)
    private static SubLSymbol $average_deduction_support_count$;
    private static SubLObject $$deductionSupports;
    private static SubLSymbol $POS;
    private static SubLSymbol $NEG;
    private static SubLObject $$CycDeductionDatastructureFn;
    private static SubLSymbol $REMOVAL_DEDUCTIONSUPPORTS;
    private static SubLList $list5;
    private static SubLSymbol $OPAQUE;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-deduction-supports.lisp", position = 800L)
    public static SubLObject deduction_supportP(SubLObject deduction, SubLObject support) {
        return conses_high.member(support, deductions_high.deduction_supports(deduction), UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-deduction-supports.lisp", position = 900L)
    public static SubLObject find_deduction_from_term(SubLObject deduction_term) {
        SubLObject d_id = NIL;
        SubLObject deduction = NIL;
        if (!cycl_utilities.formula_operator(deduction_term).eql($$CycDeductionDatastructureFn)) {
            return NIL;
        }
        d_id = cycl_utilities.formula_arg1(deduction_term, UNPROVIDED);
        deduction = deduction_handles.find_deduction_by_id(d_id);
        if (NIL != deduction_handles.deduction_p(deduction)) {
            return deduction;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-deduction-supports.lisp", position = 1300L)
    public static SubLObject deduction_term_supports(SubLObject deduction_term) {
        SubLObject deduction = NIL;
        SubLObject supports = NIL;
        if (!cycl_utilities.formula_operator(deduction_term).eql($$CycDeductionDatastructureFn)) {
            return NIL;
        }
        deduction = find_deduction_from_term(deduction_term);
        if (NIL != deduction_handles.deduction_p(deduction)) {
            supports = deductions_high.deduction_supports(deduction);
            return supports;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-deduction-supports.lisp", position = 5700L)
    public static SubLObject removal_deductionsupports_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != variables.fully_bound_p(arg1)) {
            SubLObject cdolist_list_var;
            SubLObject supports = cdolist_list_var = deduction_term_supports(arg1);
            SubLObject support = NIL;
            support = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject v_bindings = unification_utilities.term_unify(support, arg2, UNPROVIDED, UNPROVIDED);
                if (NIL != v_bindings) {
                    backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            }
        } else if (NIL != assertion_handles.assertion_p(arg2)) {
            SubLObject cdolist_list_var2 = assertions_high.assertion_arguments(arg2);
            SubLObject argument = NIL;
            argument = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                if (NIL != deduction_handles.deduction_p(argument)) {
                    SubLObject v_answer = el_utilities.make_unary_formula($$CycDeductionDatastructureFn, deduction_handles.deduction_id(argument));
                    SubLObject v_bindings = unification_utilities.term_unify(v_answer, arg1, UNPROVIDED, UNPROVIDED);
                    if (NIL != v_bindings) {
                        backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
                    }
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                argument = cdolist_list_var2.first();
            }
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_deduction_supports_file() {
        declareFunction("deduction_supportP", "DEDUCTION-SUPPORT?", 2, 0, false);
        declareFunction("find_deduction_from_term", "FIND-DEDUCTION-FROM-TERM", 1, 0, false);
        declareFunction("deduction_term_supports", "DEDUCTION-TERM-SUPPORTS", 1, 0, false);
        declareFunction("removal_deductionsupports_expand", "REMOVAL-DEDUCTIONSUPPORTS-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_deduction_supports_file() {
        $default_deduction_supports_check_cost$ = defparameter("*DEFAULT-DEDUCTION-SUPPORTS-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        $average_deduction_support_count$ = deflexical("*AVERAGE-DEDUCTION-SUPPORT-COUNT*", THREE_INTEGER);
        return NIL;
    }

    public static SubLObject setup_removal_modules_deduction_supports_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$deductionSupports);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$deductionSupports);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$deductionSupports);
        inference_modules.inference_removal_module($REMOVAL_DEDUCTIONSUPPORTS, $list5);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_deduction_supports_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_deduction_supports_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_deduction_supports_file();
    }

    static {
        me = new removal_modules_deduction_supports();
        $default_deduction_supports_check_cost$ = null;
        $average_deduction_support_count$ = null;
        $$deductionSupports = makeConstSym(("deductionSupports"));
        $POS = makeKeyword("POS");
        $NEG = makeKeyword("NEG");
        $$CycDeductionDatastructureFn = makeConstSym(("CycDeductionDatastructureFn"));
        $REMOVAL_DEDUCTIONSUPPORTS = makeKeyword("REMOVAL-DEDUCTIONSUPPORTS");
        $list5 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("deductionSupports")), makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("OR"), list(makeConstSym(("deductionSupports")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), list(makeConstSym(("deductionSupports")), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*AVERAGE-DEDUCTION-SUPPORT-COUNT*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-DEDUCTIONSUPPORTS-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$deductionSupports <fully-bound-p> <anything>) or (#$deductionSupports <anything> <fully-bound-p>)"), makeKeyword("EXAMPLE"), makeString("(#$deductionSupports \n      (#$CycDeductionDatastructureFn 408468)\n      ?SUPPORT)") });
        $OPAQUE = makeKeyword("OPAQUE");
    }
}
/*
 *
 * Total time: 77 ms
 *
 */