package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_evaluation extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluation";
    public static String myFingerPrint = "a5e33da004b66a5fa4c973f6ed1fe8bb1d3d981ce1d9638e5caacc339aa9a8af";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-evaluation.lisp", position = 1100L)
    private static SubLSymbol $default_eval_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-evaluation.lisp", position = 4700L)
    private static SubLSymbol $evaluatable_predicates_to_optimize$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-evaluation.lisp", position = 5000L)
    private static SubLSymbol $removal_generic_eval_modules$;
    private static SubLSymbol $CODE;
    private static SubLSymbol $EVAL;
    private static SubLSymbol $REMOVAL_EVAL;
    private static SubLList $list3;
    private static SubLSymbol $REMOVAL_NOT_EVAL;
    private static SubLList $list5;
    private static SubLSymbol $EVALUATABLE_PREDICATE_DOOMED_UNLESS_ALL_ARGS_BOUND;
    private static SubLList $list7;
    private static SubLList $list8;
    private static SubLList $list9;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-evaluation.lisp", position = 800L)
    public static SubLObject make_eval_support(SubLObject sentence, SubLObject contextualizedP) {
        if (contextualizedP == UNPROVIDED) {
            contextualizedP = NIL;
        }
        SubLObject module = (NIL != contextualizedP) ? $CODE : $EVAL;
        return arguments.make_hl_support(module, sentence, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-evaluation.lisp", position = 1300L)
    public static SubLObject removal_eval_exclusive(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
        SubLObject constraint_mt = mt_relevance_macros.conservative_constraint_mt(mt);
        SubLObject exclusiveP = NIL;
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(constraint_mt);
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            exclusiveP = inference_trampolines.inference_evaluatable_predicateP(pred);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return exclusiveP;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-evaluation.lisp", position = 1600L)
    public static SubLObject removal_eval_required(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return variables.fully_bound_p(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-evaluation.lisp", position = 1700L)
    public static SubLObject removal_eval_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject v_answer = relation_evaluation.cyc_evaluate(asent);
        SubLObject validP = thread.secondMultipleValue();
        SubLObject contextualizedP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != validP && NIL != v_answer) {
            SubLObject hl_support_formula = backward_utilities.inference_canonicalize_hl_support_literal(asent);
            SubLObject support = make_eval_support(hl_support_formula, contextualizedP);
            backward.removal_add_node(support, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-evaluation.lisp", position = 2600L)
    public static SubLObject removal_not_eval_exclusive(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return inference_trampolines.inference_evaluatable_predicateP(cycl_utilities.atomic_sentence_predicate(asent));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-evaluation.lisp", position = 3000L)
    public static SubLObject removal_not_eval_required(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return variables.fully_bound_p(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-evaluation.lisp", position = 3100L)
    public static SubLObject removal_not_eval_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject v_answer = relation_evaluation.cyc_evaluate(asent);
        SubLObject validP = thread.secondMultipleValue();
        SubLObject contextualizedP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != validP && NIL == v_answer) {
            SubLObject hl_support_formula = backward_utilities.inference_canonicalize_hl_support_literal(asent);
            SubLObject support = make_eval_support(cycl_utilities.negate(hl_support_formula), contextualizedP);
            backward.removal_add_node(support, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_evaluation_file() {
        declareFunction(myName, "make_eval_support", "MAKE-EVAL-SUPPORT", 1, 1, false);
        declareFunction(myName, "removal_eval_exclusive", "REMOVAL-EVAL-EXCLUSIVE", 1, 1, false);
        new $removal_eval_exclusive$UnaryFunction();
        new $removal_eval_exclusive$BinaryFunction();
        declareFunction(myName, "removal_eval_required", "REMOVAL-EVAL-REQUIRED", 1, 1, false);
        new $removal_eval_required$UnaryFunction();
        new $removal_eval_required$BinaryFunction();
        declareFunction(myName, "removal_eval_expand", "REMOVAL-EVAL-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_not_eval_exclusive", "REMOVAL-NOT-EVAL-EXCLUSIVE", 1, 1, false);
        declareFunction(myName, "removal_not_eval_required", "REMOVAL-NOT-EVAL-REQUIRED", 1, 1, false);
        declareFunction(myName, "removal_not_eval_expand", "REMOVAL-NOT-EVAL-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_evaluation_file() {
        $default_eval_cost$ = defparameter("*DEFAULT-EVAL-COST*", ONE_INTEGER);
        $evaluatable_predicates_to_optimize$ = deflexical("*EVALUATABLE-PREDICATES-TO-OPTIMIZE*", $list8);
        $removal_generic_eval_modules$ = deflexical("*REMOVAL-GENERIC-EVAL-MODULES*", $list9);
        return NIL;
    }

    public static SubLObject setup_removal_modules_evaluation_file() {
        inference_modules.inference_removal_module($REMOVAL_EVAL, $list3);
        inference_modules.inference_removal_module($REMOVAL_NOT_EVAL, $list5);
        preference_modules.inference_preference_module($EVALUATABLE_PREDICATE_DOOMED_UNLESS_ALL_ARGS_BOUND, $list7);
        SubLObject cdolist_list_var = $evaluatable_predicates_to_optimize$.getGlobalValue();
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            inference_modules.register_solely_specific_removal_module_predicate(pred);
            SubLObject cdolist_list_var_$1 = $removal_generic_eval_modules$.getGlobalValue();
            SubLObject module = NIL;
            module = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                inference_modules.inference_removal_module_use_generic(pred, module);
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                module = cdolist_list_var_$1.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        }
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_evaluation_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_evaluation_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_evaluation_file();
    }

    static {
        me = new removal_modules_evaluation();
        $default_eval_cost$ = null;
        $evaluatable_predicates_to_optimize$ = null;
        $removal_generic_eval_modules$ = null;
        $CODE = makeKeyword("CODE");
        $EVAL = makeKeyword("EVAL");
        $REMOVAL_EVAL = makeKeyword("REMOVAL-EVAL");
        $list3 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), cons(makeKeyword("FORT"), makeKeyword("ANYTHING")), makeKeyword("EXCLUSIVE"), makeSymbol("REMOVAL-EVAL-EXCLUSIVE"), makeKeyword("REQUIRED"),
                makeSymbol("REMOVAL-EVAL-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-EVAL-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EVAL-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(<evaluatable predicate> . <fully bound>)\nusing (#$evaluationDefn <evaluatable predicate> <symbol>)\nand calling the SubL form (<symbol> . <fully bound>)") });
        $REMOVAL_NOT_EVAL = makeKeyword("REMOVAL-NOT-EVAL");
        $list5 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), cons(makeKeyword("FORT"), makeKeyword("ANYTHING")), makeKeyword("EXCLUSIVE"), makeSymbol("REMOVAL-NOT-EVAL-EXCLUSIVE"), makeKeyword("REQUIRED"),
                makeSymbol("REMOVAL-NOT-EVAL-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-EVAL-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-EVAL-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (<evaluatable predicate> . <fully bound>))\nusing (#$evaluationDefn <evaluatable predicate> <symbol>)\nand calling the SubL form (<symbol> . <fully bound>)") });
        $EVALUATABLE_PREDICATE_DOOMED_UNLESS_ALL_ARGS_BOUND = makeKeyword("EVALUATABLE-PREDICATE-DOOMED-UNLESS-ALL-ARGS-BOUND");
        $list7 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), cons(makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-EVALUATABLE-PREDICATE?")), makeKeyword("ANYTHING"))),
                makeKeyword("PREFERENCE"), makeSymbol("MUST-BIND-ALL-ARGS"));
        $list8 = list(makeConstSym(("greaterThan")), makeConstSym(("greaterThanOrEqualTo")), makeConstSym(("quantitySubsumes")));
        $list9 = list(makeKeyword("REMOVAL-EVAL"), makeKeyword("REMOVAL-NOT-EVAL"));
    }

    public static class $removal_eval_exclusive$UnaryFunction extends UnaryFunction {
        public $removal_eval_exclusive$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-EVAL-EXCLUSIVE"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return removal_eval_exclusive(arg1, $removal_eval_exclusive$UnaryFunction.UNPROVIDED);
        }
    }

    public static class $removal_eval_exclusive$BinaryFunction extends BinaryFunction {
        public $removal_eval_exclusive$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-EVAL-EXCLUSIVE"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
            return removal_eval_exclusive(arg1, arg2);
        }
    }

    public static class $removal_eval_required$UnaryFunction extends UnaryFunction {
        public $removal_eval_required$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-EVAL-REQUIRED"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return removal_eval_required(arg1, $removal_eval_required$UnaryFunction.UNPROVIDED);
        }
    }

    public static class $removal_eval_required$BinaryFunction extends BinaryFunction {
        public $removal_eval_required$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-EVAL-REQUIRED"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
            return removal_eval_required(arg1, arg2);
        }
    }
}
/*
 *
 * Total time: 95 ms
 *
 */