/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-MODULES-EVALUATION
 * source file: /cyc/top/cycl/inference/modules/removal/removal-modules-evaluation.lisp
 * created:     2019/07/03 17:37:44
 */
public final class removal_modules_evaluation extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_evaluation();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluation";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_eval_cost$ = makeSymbol("*DEFAULT-EVAL-COST*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $evaluatable_predicates_to_optimize$ = makeSymbol("*EVALUATABLE-PREDICATES-TO-OPTIMIZE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $removal_generic_eval_modules$ = makeSymbol("*REMOVAL-GENERIC-EVAL-MODULES*");

    static private final SubLList $list3 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), cons($FORT, makeKeyword("ANYTHING")), makeKeyword("EXCLUSIVE"), makeSymbol("REMOVAL-EVAL-EXCLUSIVE"), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-EVAL-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-EVAL-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EVAL-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<evaluatable predicate> . <fully bound>)\nusing (#$evaluationDefn <evaluatable predicate> <symbol>)\nand calling the SubL form (<symbol> . <fully bound>)") });

    private static final SubLSymbol $REMOVAL_NOT_EVAL = makeKeyword("REMOVAL-NOT-EVAL");

    static private final SubLList $list5 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), cons($FORT, makeKeyword("ANYTHING")), makeKeyword("EXCLUSIVE"), makeSymbol("REMOVAL-NOT-EVAL-EXCLUSIVE"), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-NOT-EVAL-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-EVAL-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-EVAL-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<evaluatable predicate> . <fully bound>))\nusing (#$evaluationDefn <evaluatable predicate> <symbol>)\nand calling the SubL form (<symbol> . <fully bound>)") });

    private static final SubLSymbol $EVALUATABLE_PREDICATE_DOOMED_UNLESS_ALL_ARGS_BOUND = makeKeyword("EVALUATABLE-PREDICATE-DOOMED-UNLESS-ALL-ARGS-BOUND");

    static private final SubLList $list7 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), cons($FORT, makeKeyword("NOT-FULLY-BOUND")), cons(list($TEST, makeSymbol("INFERENCE-EVALUATABLE-PREDICATE?")), makeKeyword("ANYTHING"))), makeKeyword("PREFERENCE"), makeSymbol("MUST-BIND-ALL-ARGS"));

    static private final SubLList $list8 = list(reader_make_constant_shell("greaterThan"), reader_make_constant_shell("greaterThanOrEqualTo"), reader_make_constant_shell("quantitySubsumes"));

    static private final SubLList $list9 = list(makeKeyword("REMOVAL-EVAL"), makeKeyword("REMOVAL-NOT-EVAL"));

    // Definitions
    public static final SubLObject make_eval_support_alt(SubLObject sentence, SubLObject contextualizedP) {
        if (contextualizedP == UNPROVIDED) {
            contextualizedP = NIL;
        }
        {
            SubLObject module = (NIL != contextualizedP) ? ((SubLObject) ($CODE)) : $EVAL;
            return arguments.make_hl_support(module, sentence, UNPROVIDED, UNPROVIDED);
        }
    }

    // Definitions
    public static SubLObject make_eval_support(final SubLObject sentence, SubLObject contextualizedP) {
        if (contextualizedP == UNPROVIDED) {
            contextualizedP = NIL;
        }
        final SubLObject module = (NIL != contextualizedP) ? $CODE : $EVAL;
        return arguments.make_hl_support(module, sentence, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject removal_eval_exclusive_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
                SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
                SubLObject constraint_mt = mt_relevance_macros.conservative_constraint_mt(mt);
                SubLObject exclusiveP = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(constraint_mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        exclusiveP = inference_trampolines.inference_evaluatable_predicateP(pred);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return exclusiveP;
            }
        }
    }

    public static SubLObject removal_eval_exclusive(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
        final SubLObject constraint_mt = mt_relevance_macros.conservative_constraint_mt(mt);
        SubLObject exclusiveP = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(constraint_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
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

    public static final SubLObject removal_eval_required_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return variables.fully_bound_p(asent);
    }

    public static SubLObject removal_eval_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return variables.fully_bound_p(asent);
    }

    public static final SubLObject removal_eval_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_answer = relation_evaluation.cyc_evaluate(asent);
                SubLObject validP = thread.secondMultipleValue();
                SubLObject contextualizedP = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != validP) {
                    if (NIL != v_answer) {
                        {
                            SubLObject hl_support_formula = backward_utilities.inference_canonicalize_hl_support_literal(asent);
                            SubLObject support = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluation.make_eval_support(hl_support_formula, contextualizedP);
                            backward.removal_add_node(support, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_eval_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_answer = relation_evaluation.cyc_evaluate(asent);
        final SubLObject validP = thread.secondMultipleValue();
        final SubLObject contextualizedP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != validP) && (NIL != v_answer)) {
            final SubLObject hl_support_formula = backward_utilities.inference_canonicalize_hl_support_literal(asent);
            final SubLObject support = make_eval_support(hl_support_formula, contextualizedP);
            backward.removal_add_node(support, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject removal_not_eval_exclusive_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return inference_trampolines.inference_evaluatable_predicateP(cycl_utilities.atomic_sentence_predicate(asent));
    }

    public static SubLObject removal_not_eval_exclusive(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return inference_trampolines.inference_evaluatable_predicateP(cycl_utilities.atomic_sentence_predicate(asent));
    }

    public static final SubLObject removal_not_eval_required_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return variables.fully_bound_p(asent);
    }

    public static SubLObject removal_not_eval_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return variables.fully_bound_p(asent);
    }

    public static final SubLObject removal_not_eval_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_answer = relation_evaluation.cyc_evaluate(asent);
                SubLObject validP = thread.secondMultipleValue();
                SubLObject contextualizedP = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != validP) {
                    if (NIL == v_answer) {
                        {
                            SubLObject hl_support_formula = backward_utilities.inference_canonicalize_hl_support_literal(asent);
                            SubLObject support = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluation.make_eval_support(cycl_utilities.negate(hl_support_formula), contextualizedP);
                            backward.removal_add_node(support, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_not_eval_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_answer = relation_evaluation.cyc_evaluate(asent);
        final SubLObject validP = thread.secondMultipleValue();
        final SubLObject contextualizedP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != validP) && (NIL == v_answer)) {
            final SubLObject hl_support_formula = backward_utilities.inference_canonicalize_hl_support_literal(asent);
            final SubLObject support = make_eval_support(cycl_utilities.negate(hl_support_formula), contextualizedP);
            backward.removal_add_node(support, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_evaluation_file() {
        declareFunction("make_eval_support", "MAKE-EVAL-SUPPORT", 1, 1, false);
        declareFunction("removal_eval_exclusive", "REMOVAL-EVAL-EXCLUSIVE", 1, 1, false);
        new removal_modules_evaluation.$removal_eval_exclusive$UnaryFunction();
        new removal_modules_evaluation.$removal_eval_exclusive$BinaryFunction();
        declareFunction("removal_eval_required", "REMOVAL-EVAL-REQUIRED", 1, 1, false);
        new removal_modules_evaluation.$removal_eval_required$UnaryFunction();
        new removal_modules_evaluation.$removal_eval_required$BinaryFunction();
        declareFunction("removal_eval_expand", "REMOVAL-EVAL-EXPAND", 1, 1, false);
        declareFunction("removal_not_eval_exclusive", "REMOVAL-NOT-EVAL-EXCLUSIVE", 1, 1, false);
        declareFunction("removal_not_eval_required", "REMOVAL-NOT-EVAL-REQUIRED", 1, 1, false);
        declareFunction("removal_not_eval_expand", "REMOVAL-NOT-EVAL-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_evaluation_file() {
        defparameter("*DEFAULT-EVAL-COST*", ONE_INTEGER);
        deflexical("*EVALUATABLE-PREDICATES-TO-OPTIMIZE*", $list8);
        deflexical("*REMOVAL-GENERIC-EVAL-MODULES*", $list9);
        return NIL;
    }

    public static final SubLObject setup_removal_modules_evaluation_file_alt() {
        inference_modules.inference_removal_module($REMOVAL_EVAL, $list_alt3);
        inference_modules.inference_removal_module($REMOVAL_NOT_EVAL, $list_alt5);
        preference_modules.inference_preference_module($EVALUATABLE_PREDICATE_DELAY_UNTIL_CLOSED, $list_alt7);
        {
            SubLObject cdolist_list_var = $evaluatable_predicates_to_optimize$.getGlobalValue();
            SubLObject pred = NIL;
            for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                inference_modules.register_solely_specific_removal_module_predicate(pred);
                {
                    SubLObject cdolist_list_var_1 = $removal_generic_eval_modules$.getGlobalValue();
                    SubLObject module = NIL;
                    for (module = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , module = cdolist_list_var_1.first()) {
                        inference_modules.inference_removal_module_use_generic(pred, module);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject setup_removal_modules_evaluation_file() {
        if (SubLFiles.USE_V1) {
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
        }
        if (SubLFiles.USE_V2) {
            preference_modules.inference_preference_module($EVALUATABLE_PREDICATE_DELAY_UNTIL_CLOSED, $list_alt7);
            {
                SubLObject cdolist_list_var = $evaluatable_predicates_to_optimize$.getGlobalValue();
                SubLObject pred = NIL;
                for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                    inference_modules.register_solely_specific_removal_module_predicate(pred);
                    {
                        SubLObject cdolist_list_var_1 = $removal_generic_eval_modules$.getGlobalValue();
                        SubLObject module = NIL;
                        for (module = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , module = cdolist_list_var_1.first()) {
                            inference_modules.inference_removal_module_use_generic(pred, module);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject setup_removal_modules_evaluation_file_Previous() {
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

    static private final SubLList $list_alt3 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), cons($FORT, makeKeyword("ANYTHING")), makeKeyword("EXCLUSIVE"), makeSymbol("REMOVAL-EVAL-EXCLUSIVE"), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-EVAL-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-EVAL-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EVAL-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<evaluatable predicate> . <fully bound>)\nusing (#$evaluationDefn <evaluatable predicate> <symbol>)\nand calling the SubL form (<symbol> . <fully bound>)") });

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_evaluation_file();
    }

    

    public static final class $removal_eval_exclusive$UnaryFunction extends UnaryFunction {
        public $removal_eval_exclusive$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-EVAL-EXCLUSIVE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_eval_exclusive(arg1, removal_modules_evaluation.$removal_eval_exclusive$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $removal_eval_exclusive$BinaryFunction extends BinaryFunction {
        public $removal_eval_exclusive$BinaryFunction() {
            super(extractFunctionNamed("REMOVAL-EVAL-EXCLUSIVE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_eval_exclusive(arg1, arg2);
        }
    }

    static private final SubLList $list_alt5 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), cons($FORT, makeKeyword("ANYTHING")), makeKeyword("EXCLUSIVE"), makeSymbol("REMOVAL-NOT-EVAL-EXCLUSIVE"), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-NOT-EVAL-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-EVAL-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-EVAL-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<evaluatable predicate> . <fully bound>))\nusing (#$evaluationDefn <evaluatable predicate> <symbol>)\nand calling the SubL form (<symbol> . <fully bound>)") });

    public static final class $removal_eval_required$UnaryFunction extends UnaryFunction {
        public $removal_eval_required$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-EVAL-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_eval_required(arg1, removal_modules_evaluation.$removal_eval_required$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $removal_eval_required$BinaryFunction extends BinaryFunction {
        public $removal_eval_required$BinaryFunction() {
            super(extractFunctionNamed("REMOVAL-EVAL-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_eval_required(arg1, arg2);
        }
    }

    private static final SubLSymbol $EVALUATABLE_PREDICATE_DELAY_UNTIL_CLOSED = makeKeyword("EVALUATABLE-PREDICATE-DELAY-UNTIL-CLOSED");

    static private final SubLList $list_alt7 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), cons($FORT, makeKeyword("NOT-FULLY-BOUND")), cons(list($TEST, makeSymbol("INFERENCE-EVALUATABLE-PREDICATE?")), makeKeyword("ANYTHING"))), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));

    static private final SubLList $list_alt8 = list(reader_make_constant_shell("greaterThan"), reader_make_constant_shell("greaterThanOrEqualTo"), reader_make_constant_shell("quantitySubsumes"));

    static private final SubLList $list_alt9 = list(makeKeyword("REMOVAL-EVAL"), makeKeyword("REMOVAL-NOT-EVAL"));
}

/**
 * Total time: 95 ms
 */
