package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.eval_in_api;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_perform_subl extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_perform_subl";
    public static String myFingerPrint = "5e3e6dd7a91752b7a6d3597d7c57eec664024986a5eb0a9b4b727a943f9adc68";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-perform-subl.lisp", position = 1500L)
    public static SubLSymbol $perform_subl_defining_mt$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-perform-subl.lisp", position = 2000L)
    private static SubLSymbol $default_perform_subl_pos_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-perform-subl.lisp", position = 3000L)
    private static SubLSymbol $default_perform_subl_neg_cost$;
    private static SubLSymbol $IGNORE_ERRORS_TARGET;
    private static SubLSymbol $sym1$IGNORE_ERRORS_HANDLER;
    private static SubLObject $$ExpandSubLFn;
    private static SubLObject $$SubLQuoteFn;
    private static SubLSymbol $sym4$_PERFORM_SUBL_DEFINING_MT_;
    private static SubLObject $$UniversalVocabularyMt;
    private static SubLObject $$performSubL;
    private static SubLSymbol $POS;
    private static SubLSymbol $NEG;
    private static SubLSymbol $REMOVAL_PERFORM_SUBL_POS;
    private static SubLList $list10;
    private static SubLSymbol $REMOVAL_PERFORM_SUBL_NEG;
    private static SubLList $list12;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-perform-subl.lisp", position = 500L)
    public static SubLObject evaluate_subl_expression(SubLObject subl_expression) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject subl = NIL;
        SubLObject successfulP = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function($sym1$IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject pcase_var = cycl_utilities.formula_operator(subl_expression);
                    if (pcase_var.eql($$ExpandSubLFn)) {
                        subl = cycl_utilities.formula_arg2(subl_expression, UNPROVIDED);
                    } else if (pcase_var.eql($$SubLQuoteFn)) {
                        subl = cycl_utilities.formula_arg1(subl_expression, UNPROVIDED);
                    }
                    result = eval_in_api.cyc_api_eval(subl);
                    successfulP = T;
                } catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return Values.values(result, successfulP);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-perform-subl.lisp", position = 1000L)
    public static SubLObject inference_perform_subl(SubLObject subl_expression) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject result = inference_evaluate_subl_expression(subl_expression);
        SubLObject successfulP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return successfulP;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-perform-subl.lisp", position = 1300L)
    public static SubLObject inference_evaluate_subl_expression(SubLObject subl_expression) {
        if (NIL == inference_worker.currently_active_problem_store() || NIL != inference_datastructures_problem_store.problem_store_evaluate_subl_allowedP(inference_worker.currently_active_problem_store())) {
            return evaluate_subl_expression(subl_expression);
        }
        return Values.values(NIL, NIL);
    }

    public static SubLObject declare_removal_modules_perform_subl_file() {
        declareFunction(myName, "evaluate_subl_expression", "EVALUATE-SUBL-EXPRESSION", 1, 0, false);
        declareFunction(myName, "inference_perform_subl", "INFERENCE-PERFORM-SUBL", 1, 0, false);
        declareFunction(myName, "inference_evaluate_subl_expression", "INFERENCE-EVALUATE-SUBL-EXPRESSION", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_perform_subl_file() {
        $perform_subl_defining_mt$ = deflexical("*PERFORM-SUBL-DEFINING-MT*", maybeDefault($sym4$_PERFORM_SUBL_DEFINING_MT_, $perform_subl_defining_mt$, $$UniversalVocabularyMt));
        $default_perform_subl_pos_cost$ = defparameter("*DEFAULT-PERFORM-SUBL-POS-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        $default_perform_subl_neg_cost$ = defparameter("*DEFAULT-PERFORM-SUBL-NEG-COST*", $default_perform_subl_pos_cost$.getDynamicValue());
        return NIL;
    }

    public static SubLObject setup_removal_modules_perform_subl_file() {
        subl_macro_promotions.declare_defglobal($sym4$_PERFORM_SUBL_DEFINING_MT_);
        mt_vars.note_mt_var($sym4$_PERFORM_SUBL_DEFINING_MT_, $$performSubL);
        inference_modules.register_solely_specific_removal_module_predicate($$performSubL);
        preference_modules.doomed_unless_all_args_bindable($POS, $$performSubL);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$performSubL);
        inference_modules.inference_removal_module($REMOVAL_PERFORM_SUBL_POS, $list10);
        inference_modules.inference_removal_module($REMOVAL_PERFORM_SUBL_NEG, $list12);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_perform_subl_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_perform_subl_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_perform_subl_file();
    }

    static {
        me = new removal_modules_perform_subl();
        $perform_subl_defining_mt$ = null;
        $default_perform_subl_pos_cost$ = null;
        $default_perform_subl_neg_cost$ = null;
        $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
        $sym1$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $$ExpandSubLFn = makeConstSym(("ExpandSubLFn"));
        $$SubLQuoteFn = makeConstSym(("SubLQuoteFn"));
        $sym4$_PERFORM_SUBL_DEFINING_MT_ = makeSymbol("*PERFORM-SUBL-DEFINING-MT*");
        $$UniversalVocabularyMt = makeConstSym(("UniversalVocabularyMt"));
        $$performSubL = makeConstSym(("performSubL"));
        $POS = makeKeyword("POS");
        $NEG = makeKeyword("NEG");
        $REMOVAL_PERFORM_SUBL_POS = makeKeyword("REMOVAL-PERFORM-SUBL-POS");
        $list10 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("performSubL")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("performSubL")), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*DEFAULT-PERFORM-SUBL-POS-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("performSubL")), list(makeKeyword("BIND"), makeSymbol("SUBL"))), list(makeKeyword("VALUE"), makeSymbol("SUBL"))), makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("INFERENCE-PERFORM-SUBL"), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-MT"), makeSymbol("*PERFORM-SUBL-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"),
                makeKeyword("DOCUMENTATION"), makeString("(#$performSubL <fully-bound>)\n     by evaluating the argument as a SubL expression and succeeding if the evaluation completed."), makeKeyword("EXAMPLE"),
                makeString("(#$performSubL (#$ExpandSubLFn () (print :DONE)))  \n    or\n    (#$performSubL (#$SubLQuoteFn (print :DONE)))") });
        $REMOVAL_PERFORM_SUBL_NEG = makeKeyword("REMOVAL-PERFORM-SUBL-NEG");
        $list12 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("performSubL")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("performSubL")), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*DEFAULT-PERFORM-SUBL-NEG-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("performSubL")), list(makeKeyword("BIND"), makeSymbol("SUBL"))), list(makeKeyword("VALUE"), makeSymbol("SUBL"))), makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("INFERENCE-PERFORM-SUBL"), makeKeyword("INPUT"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-MT"), makeSymbol("*PERFORM-SUBL-DEFINING-MT*"),
                makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$performSubL <fully-bound>))\n by evaluating the argument as a SubL expression and succeeding if the evaluation failed to complete."), makeKeyword("EXAMPLE"),
                makeString("(#$not (#$performSubL (#$ExpandSubLFn () (/ 1 0)))) or\n    (#$not (#$performSubL (#$SubLQuoteFn (/ 1 0))))") });
    }
}
/*
 *
 * Total time: 137 ms
 *
 */