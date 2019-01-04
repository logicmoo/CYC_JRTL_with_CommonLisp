package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_evaluation extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluation";
    public static final String myFingerPrint = "a5e33da004b66a5fa4c973f6ed1fe8bb1d3d981ce1d9638e5caacc339aa9a8af";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluation.lisp", position = 1119L)
    private static SubLSymbol $default_eval_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluation.lisp", position = 4750L)
    private static SubLSymbol $evaluatable_predicates_to_optimize$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluation.lisp", position = 5044L)
    private static SubLSymbol $removal_generic_eval_modules$;
    private static final SubLSymbol $kw0$CODE;
    private static final SubLSymbol $kw1$EVAL;
    private static final SubLSymbol $kw2$REMOVAL_EVAL;
    private static final SubLList $list3;
    private static final SubLSymbol $kw4$REMOVAL_NOT_EVAL;
    private static final SubLList $list5;
    private static final SubLSymbol $kw6$EVALUATABLE_PREDICATE_DOOMED_UNLESS_ALL_ARGS_BOUND;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLList $list9;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluation.lisp", position = 809L)
    public static SubLObject make_eval_support(final SubLObject sentence, SubLObject contextualizedP) {
        if (contextualizedP == removal_modules_evaluation.UNPROVIDED) {
            contextualizedP = (SubLObject)removal_modules_evaluation.NIL;
        }
        final SubLObject module = (SubLObject)((removal_modules_evaluation.NIL != contextualizedP) ? removal_modules_evaluation.$kw0$CODE : removal_modules_evaluation.$kw1$EVAL);
        return arguments.make_hl_support(module, sentence, (SubLObject)removal_modules_evaluation.UNPROVIDED, (SubLObject)removal_modules_evaluation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluation.lisp", position = 1322L)
    public static SubLObject removal_eval_exclusive(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_evaluation.UNPROVIDED) {
            sense = (SubLObject)removal_modules_evaluation.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
        final SubLObject constraint_mt = mt_relevance_macros.conservative_constraint_mt(mt);
        SubLObject exclusiveP = (SubLObject)removal_modules_evaluation.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(constraint_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            exclusiveP = inference_trampolines.inference_evaluatable_predicateP(pred);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return exclusiveP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluation.lisp", position = 1688L)
    public static SubLObject removal_eval_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_evaluation.UNPROVIDED) {
            sense = (SubLObject)removal_modules_evaluation.NIL;
        }
        return variables.fully_bound_p(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluation.lisp", position = 1799L)
    public static SubLObject removal_eval_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_evaluation.UNPROVIDED) {
            sense = (SubLObject)removal_modules_evaluation.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_answer = relation_evaluation.cyc_evaluate(asent);
        final SubLObject validP = thread.secondMultipleValue();
        final SubLObject contextualizedP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (removal_modules_evaluation.NIL != validP && removal_modules_evaluation.NIL != v_answer) {
            final SubLObject hl_support_formula = backward_utilities.inference_canonicalize_hl_support_literal(asent);
            final SubLObject support = make_eval_support(hl_support_formula, contextualizedP);
            backward.removal_add_node(support, (SubLObject)removal_modules_evaluation.UNPROVIDED, (SubLObject)removal_modules_evaluation.UNPROVIDED);
        }
        return (SubLObject)removal_modules_evaluation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluation.lisp", position = 2693L)
    public static SubLObject removal_not_eval_exclusive(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_evaluation.UNPROVIDED) {
            sense = (SubLObject)removal_modules_evaluation.NIL;
        }
        return inference_trampolines.inference_evaluatable_predicateP(cycl_utilities.atomic_sentence_predicate(asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluation.lisp", position = 3025L)
    public static SubLObject removal_not_eval_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_evaluation.UNPROVIDED) {
            sense = (SubLObject)removal_modules_evaluation.NIL;
        }
        return variables.fully_bound_p(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluation.lisp", position = 3140L)
    public static SubLObject removal_not_eval_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_evaluation.UNPROVIDED) {
            sense = (SubLObject)removal_modules_evaluation.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_answer = relation_evaluation.cyc_evaluate(asent);
        final SubLObject validP = thread.secondMultipleValue();
        final SubLObject contextualizedP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (removal_modules_evaluation.NIL != validP && removal_modules_evaluation.NIL == v_answer) {
            final SubLObject hl_support_formula = backward_utilities.inference_canonicalize_hl_support_literal(asent);
            final SubLObject support = make_eval_support(cycl_utilities.negate(hl_support_formula), contextualizedP);
            backward.removal_add_node(support, (SubLObject)removal_modules_evaluation.UNPROVIDED, (SubLObject)removal_modules_evaluation.UNPROVIDED);
        }
        return (SubLObject)removal_modules_evaluation.NIL;
    }
    
    public static SubLObject declare_removal_modules_evaluation_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluation", "make_eval_support", "MAKE-EVAL-SUPPORT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluation", "removal_eval_exclusive", "REMOVAL-EVAL-EXCLUSIVE", 1, 1, false);
        new $removal_eval_exclusive$UnaryFunction();
        new $removal_eval_exclusive$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluation", "removal_eval_required", "REMOVAL-EVAL-REQUIRED", 1, 1, false);
        new $removal_eval_required$UnaryFunction();
        new $removal_eval_required$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluation", "removal_eval_expand", "REMOVAL-EVAL-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluation", "removal_not_eval_exclusive", "REMOVAL-NOT-EVAL-EXCLUSIVE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluation", "removal_not_eval_required", "REMOVAL-NOT-EVAL-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluation", "removal_not_eval_expand", "REMOVAL-NOT-EVAL-EXPAND", 1, 1, false);
        return (SubLObject)removal_modules_evaluation.NIL;
    }
    
    public static SubLObject init_removal_modules_evaluation_file() {
        removal_modules_evaluation.$default_eval_cost$ = SubLFiles.defparameter("*DEFAULT-EVAL-COST*", (SubLObject)removal_modules_evaluation.ONE_INTEGER);
        removal_modules_evaluation.$evaluatable_predicates_to_optimize$ = SubLFiles.deflexical("*EVALUATABLE-PREDICATES-TO-OPTIMIZE*", (SubLObject)removal_modules_evaluation.$list8);
        removal_modules_evaluation.$removal_generic_eval_modules$ = SubLFiles.deflexical("*REMOVAL-GENERIC-EVAL-MODULES*", (SubLObject)removal_modules_evaluation.$list9);
        return (SubLObject)removal_modules_evaluation.NIL;
    }
    
    public static SubLObject setup_removal_modules_evaluation_file() {
        inference_modules.inference_removal_module((SubLObject)removal_modules_evaluation.$kw2$REMOVAL_EVAL, (SubLObject)removal_modules_evaluation.$list3);
        inference_modules.inference_removal_module((SubLObject)removal_modules_evaluation.$kw4$REMOVAL_NOT_EVAL, (SubLObject)removal_modules_evaluation.$list5);
        preference_modules.inference_preference_module((SubLObject)removal_modules_evaluation.$kw6$EVALUATABLE_PREDICATE_DOOMED_UNLESS_ALL_ARGS_BOUND, (SubLObject)removal_modules_evaluation.$list7);
        SubLObject cdolist_list_var = removal_modules_evaluation.$evaluatable_predicates_to_optimize$.getGlobalValue();
        SubLObject pred = (SubLObject)removal_modules_evaluation.NIL;
        pred = cdolist_list_var.first();
        while (removal_modules_evaluation.NIL != cdolist_list_var) {
            inference_modules.register_solely_specific_removal_module_predicate(pred);
            SubLObject cdolist_list_var_$1 = removal_modules_evaluation.$removal_generic_eval_modules$.getGlobalValue();
            SubLObject module = (SubLObject)removal_modules_evaluation.NIL;
            module = cdolist_list_var_$1.first();
            while (removal_modules_evaluation.NIL != cdolist_list_var_$1) {
                inference_modules.inference_removal_module_use_generic(pred, module);
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                module = cdolist_list_var_$1.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_evaluation.NIL;
    }
    
    public void declareFunctions() {
        declare_removal_modules_evaluation_file();
    }
    
    public void initializeVariables() {
        init_removal_modules_evaluation_file();
    }
    
    public void runTopLevelForms() {
        setup_removal_modules_evaluation_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_evaluation();
        removal_modules_evaluation.$default_eval_cost$ = null;
        removal_modules_evaluation.$evaluatable_predicates_to_optimize$ = null;
        removal_modules_evaluation.$removal_generic_eval_modules$ = null;
        $kw0$CODE = SubLObjectFactory.makeKeyword("CODE");
        $kw1$EVAL = SubLObjectFactory.makeKeyword("EVAL");
        $kw2$REMOVAL_EVAL = SubLObjectFactory.makeKeyword("REMOVAL-EVAL");
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("ARITY"), removal_modules_evaluation.NIL, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("REMOVAL-EVAL-EXCLUSIVE"), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-EVAL-REQUIRED"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-EVAL-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-EVAL-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<evaluatable predicate> . <fully bound>)\nusing (#$evaluationDefn <evaluatable predicate> <symbol>)\nand calling the SubL form (<symbol> . <fully bound>)") });
        $kw4$REMOVAL_NOT_EVAL = SubLObjectFactory.makeKeyword("REMOVAL-NOT-EVAL");
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("ARITY"), removal_modules_evaluation.NIL, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("REMOVAL-NOT-EVAL-EXCLUSIVE"), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-NOT-EVAL-REQUIRED"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-EVAL-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-NOT-EVAL-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (<evaluatable predicate> . <fully bound>))\nusing (#$evaluationDefn <evaluatable predicate> <symbol>)\nand calling the SubL form (<symbol> . <fully bound>)") });
        $kw6$EVALUATABLE_PREDICATE_DOOMED_UNLESS_ALL_ARGS_BOUND = SubLObjectFactory.makeKeyword("EVALUATABLE-PREDICATE-DOOMED-UNLESS-ALL-ARGS-BOUND");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-EVALUATABLE-PREDICATE?")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("MUST-BIND-ALL-ARGS"));
        $list8 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("greaterThan")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("greaterThanOrEqualTo")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quantitySubsumes")));
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-EVAL"), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-NOT-EVAL"));
    }
    
    public static final class $removal_eval_exclusive$UnaryFunction extends UnaryFunction
    {
        public $removal_eval_exclusive$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-EVAL-EXCLUSIVE"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return removal_modules_evaluation.removal_eval_exclusive(arg1, (SubLObject)$removal_eval_exclusive$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $removal_eval_exclusive$BinaryFunction extends BinaryFunction
    {
        public $removal_eval_exclusive$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-EVAL-EXCLUSIVE"));
        }
        
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_modules_evaluation.removal_eval_exclusive(arg1, arg2);
        }
    }
    
    public static final class $removal_eval_required$UnaryFunction extends UnaryFunction
    {
        public $removal_eval_required$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-EVAL-REQUIRED"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return removal_modules_evaluation.removal_eval_required(arg1, (SubLObject)$removal_eval_required$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $removal_eval_required$BinaryFunction extends BinaryFunction
    {
        public $removal_eval_required$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-EVAL-REQUIRED"));
        }
        
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_modules_evaluation.removal_eval_required(arg1, arg2);
        }
    }
}

/*

	Total time: 95 ms
	
*/