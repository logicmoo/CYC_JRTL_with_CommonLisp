package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.eval_in_api;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_perform_subl extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_perform_subl";
    public static final String myFingerPrint = "5e3e6dd7a91752b7a6d3597d7c57eec664024986a5eb0a9b4b727a943f9adc68";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-perform-subl.lisp", position = 1597L)
    public static SubLSymbol $perform_subl_defining_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-perform-subl.lisp", position = 2001L)
    private static SubLSymbol $default_perform_subl_pos_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-perform-subl.lisp", position = 3013L)
    private static SubLSymbol $default_perform_subl_neg_cost$;
    private static final SubLSymbol $kw0$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym1$IGNORE_ERRORS_HANDLER;
    private static final SubLObject $const2$ExpandSubLFn;
    private static final SubLObject $const3$SubLQuoteFn;
    private static final SubLSymbol $sym4$_PERFORM_SUBL_DEFINING_MT_;
    private static final SubLObject $const5$UniversalVocabularyMt;
    private static final SubLObject $const6$performSubL;
    private static final SubLSymbol $kw7$POS;
    private static final SubLSymbol $kw8$NEG;
    private static final SubLSymbol $kw9$REMOVAL_PERFORM_SUBL_POS;
    private static final SubLList $list10;
    private static final SubLSymbol $kw11$REMOVAL_PERFORM_SUBL_NEG;
    private static final SubLList $list12;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-perform-subl.lisp", position = 534L)
    public static SubLObject evaluate_subl_expression(final SubLObject subl_expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_modules_perform_subl.NIL;
        SubLObject subl = (SubLObject)removal_modules_perform_subl.NIL;
        SubLObject successfulP = (SubLObject)removal_modules_perform_subl.NIL;
        SubLObject ignore_errors_tag = (SubLObject)removal_modules_perform_subl.NIL;
        try {
            thread.throwStack.push(removal_modules_perform_subl.$kw0$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)removal_modules_perform_subl.$sym1$IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject pcase_var = cycl_utilities.formula_operator(subl_expression);
                    if (pcase_var.eql(removal_modules_perform_subl.$const2$ExpandSubLFn)) {
                        subl = cycl_utilities.formula_arg2(subl_expression, (SubLObject)removal_modules_perform_subl.UNPROVIDED);
                    }
                    else if (pcase_var.eql(removal_modules_perform_subl.$const3$SubLQuoteFn)) {
                        subl = cycl_utilities.formula_arg1(subl_expression, (SubLObject)removal_modules_perform_subl.UNPROVIDED);
                    }
                    result = eval_in_api.cyc_api_eval(subl);
                    successfulP = (SubLObject)removal_modules_perform_subl.T;
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)removal_modules_perform_subl.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)removal_modules_perform_subl.$kw0$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return Values.values(result, successfulP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-perform-subl.lisp", position = 1092L)
    public static SubLObject inference_perform_subl(final SubLObject subl_expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject result = inference_evaluate_subl_expression(subl_expression);
        final SubLObject successfulP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return successfulP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-perform-subl.lisp", position = 1309L)
    public static SubLObject inference_evaluate_subl_expression(final SubLObject subl_expression) {
        if (removal_modules_perform_subl.NIL == inference_worker.currently_active_problem_store() || removal_modules_perform_subl.NIL != inference_datastructures_problem_store.problem_store_evaluate_subl_allowedP(inference_worker.currently_active_problem_store())) {
            return evaluate_subl_expression(subl_expression);
        }
        return Values.values((SubLObject)removal_modules_perform_subl.NIL, (SubLObject)removal_modules_perform_subl.NIL);
    }
    
    public static SubLObject declare_removal_modules_perform_subl_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_perform_subl", "evaluate_subl_expression", "EVALUATE-SUBL-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_perform_subl", "inference_perform_subl", "INFERENCE-PERFORM-SUBL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_perform_subl", "inference_evaluate_subl_expression", "INFERENCE-EVALUATE-SUBL-EXPRESSION", 1, 0, false);
        return (SubLObject)removal_modules_perform_subl.NIL;
    }
    
    public static SubLObject init_removal_modules_perform_subl_file() {
        removal_modules_perform_subl.$perform_subl_defining_mt$ = SubLFiles.deflexical("*PERFORM-SUBL-DEFINING-MT*", (removal_modules_perform_subl.NIL != Symbols.boundp((SubLObject)removal_modules_perform_subl.$sym4$_PERFORM_SUBL_DEFINING_MT_)) ? removal_modules_perform_subl.$perform_subl_defining_mt$.getGlobalValue() : removal_modules_perform_subl.$const5$UniversalVocabularyMt);
        removal_modules_perform_subl.$default_perform_subl_pos_cost$ = SubLFiles.defparameter("*DEFAULT-PERFORM-SUBL-POS-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        removal_modules_perform_subl.$default_perform_subl_neg_cost$ = SubLFiles.defparameter("*DEFAULT-PERFORM-SUBL-NEG-COST*", removal_modules_perform_subl.$default_perform_subl_pos_cost$.getDynamicValue());
        return (SubLObject)removal_modules_perform_subl.NIL;
    }
    
    public static SubLObject setup_removal_modules_perform_subl_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)removal_modules_perform_subl.$sym4$_PERFORM_SUBL_DEFINING_MT_);
        mt_vars.note_mt_var((SubLObject)removal_modules_perform_subl.$sym4$_PERFORM_SUBL_DEFINING_MT_, removal_modules_perform_subl.$const6$performSubL);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_perform_subl.$const6$performSubL);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_perform_subl.$kw7$POS, removal_modules_perform_subl.$const6$performSubL);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_perform_subl.$kw8$NEG, removal_modules_perform_subl.$const6$performSubL);
        inference_modules.inference_removal_module((SubLObject)removal_modules_perform_subl.$kw9$REMOVAL_PERFORM_SUBL_POS, (SubLObject)removal_modules_perform_subl.$list10);
        inference_modules.inference_removal_module((SubLObject)removal_modules_perform_subl.$kw11$REMOVAL_PERFORM_SUBL_NEG, (SubLObject)removal_modules_perform_subl.$list12);
        return (SubLObject)removal_modules_perform_subl.NIL;
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
        me = (SubLFile)new removal_modules_perform_subl();
        removal_modules_perform_subl.$perform_subl_defining_mt$ = null;
        removal_modules_perform_subl.$default_perform_subl_pos_cost$ = null;
        removal_modules_perform_subl.$default_perform_subl_neg_cost$ = null;
        $kw0$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym1$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $const2$ExpandSubLFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExpandSubLFn"));
        $const3$SubLQuoteFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubLQuoteFn"));
        $sym4$_PERFORM_SUBL_DEFINING_MT_ = SubLObjectFactory.makeSymbol("*PERFORM-SUBL-DEFINING-MT*");
        $const5$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $const6$performSubL = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performSubL"));
        $kw7$POS = SubLObjectFactory.makeKeyword("POS");
        $kw8$NEG = SubLObjectFactory.makeKeyword("NEG");
        $kw9$REMOVAL_PERFORM_SUBL_POS = SubLObjectFactory.makeKeyword("REMOVAL-PERFORM-SUBL-POS");
        $list10 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performSubL")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performSubL")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-PERFORM-SUBL-POS-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("CHECK"), removal_modules_perform_subl.T, SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performSubL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SUBL"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBL"))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PERFORM-SUBL"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("CODE"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*PERFORM-SUBL-DEFINING-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$performSubL <fully-bound>)\n     by evaluating the argument as a SubL expression and succeeding if the evaluation completed."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$performSubL (#$ExpandSubLFn () (print :DONE)))  \n    or\n    (#$performSubL (#$SubLQuoteFn (print :DONE)))") });
        $kw11$REMOVAL_PERFORM_SUBL_NEG = SubLObjectFactory.makeKeyword("REMOVAL-PERFORM-SUBL-NEG");
        $list12 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performSubL")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performSubL")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-PERFORM-SUBL-NEG-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("CHECK"), removal_modules_perform_subl.T, SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performSubL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SUBL"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBL"))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INVERT-BOOLEAN-ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PERFORM-SUBL"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("CODE"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*PERFORM-SUBL-DEFINING-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$performSubL <fully-bound>))\n by evaluating the argument as a SubL expression and succeeding if the evaluation failed to complete."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$performSubL (#$ExpandSubLFn () (/ 1 0)))) or\n    (#$not (#$performSubL (#$SubLQuoteFn (/ 1 0))))") });
    }
}

/*

	Total time: 137 ms
	
*/