package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.backward_results;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class abnormal extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.abnormal";
    public static final String myFingerPrint = "d400dd4ee17eaf4bf5510471b022d207cd7d2218a41e137a2e1f6f58f52a1ca8";
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/abnormal.lisp", position = 498L)
    public static SubLSymbol $abnormality_checking_enabled$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/abnormal.lisp", position = 688L)
    private static SubLSymbol $abnormality_except_support_enabled$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/abnormal.lisp", position = 2938L)
    public static SubLSymbol $abnormality_transformation_depth$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/abnormal.lisp", position = 2995L)
    private static SubLSymbol $browse_abnormal_inferencesP$;
    private static final SubLObject $const0$abnormal;
    private static final SubLSymbol $sym1$VARIABLE_BINDING_VALUE;
    private static final SubLSymbol $kw2$PROBLEM_STORE;
    private static final SubLSymbol $kw3$ABNORMAL;
    private static final SubLObject $const4$TheList;
    private static final SubLSymbol $kw5$MAX_NUMBER;
    private static final SubLSymbol $kw6$MAX_TRANSFORMATION_DEPTH;
    private static final SubLSymbol $kw7$RESULT_UNIQUENESS;
    private static final SubLSymbol $kw8$BINDINGS;
    private static final SubLSymbol $kw9$RETURN;
    private static final SubLSymbol $kw10$BINDINGS_AND_SUPPORTS;
    private static final SubLSymbol $kw11$ANSWER_LANGUAGE;
    private static final SubLSymbol $kw12$HL;
    private static final SubLSymbol $kw13$BROWSABLE_;
    private static final SubLSymbol $kw14$MIN_RULE_UTILITY;
    private static final SubLInteger $int15$_100;
    private static final SubLSymbol $kw16$ALLOW_ABNORMALITY_CHECKING_;
    private static final SubLSymbol $sym17$SECOND;
    private static final SubLString $str18$Assume_it_isn_t_abnormal;
    private static final SubLString $str19$Abnormality_checker_doesn_t_have_;
    private static final SubLSymbol $kw20$INFERENCE_REJECTED;
    private static final SubLString $str21$Abnormality_checker_doesn_t_have_;
    private static final SubLString $str22$_S_are_exceptions_to__S;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/abnormal.lisp", position = 808L)
    public static SubLObject abnormality_except_support_enabledP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return abnormal.$abnormality_except_support_enabled$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/abnormal.lisp", position = 912L)
    public static SubLObject rule_has_exceptionsP(final SubLObject rule) {
        return (SubLObject)SubLObjectFactory.makeBoolean(abnormal.NIL != assertions_high.rule_assertionP(rule) && abnormal.NIL != assertion_utilities.assertion_has_meta_assertionsP(rule) && (kb_indexing.num_gaf_arg_index(rule, (SubLObject)abnormal.TWO_INTEGER, abnormal.$const0$abnormal, (SubLObject)abnormal.UNPROVIDED).isPositive() || kb_indexing.num_exception_rule_index(rule, (SubLObject)abnormal.UNPROVIDED, (SubLObject)abnormal.UNPROVIDED).isPositive() || abnormal.NIL != ((abnormal.NIL != abnormality_except_support_enabledP()) ? assertion_utilities.excepted_assertionP(rule, (SubLObject)abnormal.UNPROVIDED, (SubLObject)abnormal.UNPROVIDED) : abnormal.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/abnormal.lisp", position = 1320L)
    public static SubLObject rule_bindings_abnormalP(final SubLObject store, final SubLObject rule, final SubLObject rule_bindings, final SubLObject transformation_mt) {
        if (abnormal.NIL != rule_has_exceptionsP(rule)) {
            final SubLObject bound_values_to_check = Mapping.mapcar((SubLObject)abnormal.$sym1$VARIABLE_BINDING_VALUE, inference_worker.canonicalize_proof_bindings(rule_bindings));
            return abnormality_check_internal(bound_values_to_check, rule, transformation_mt, store);
        }
        return (SubLObject)abnormal.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/abnormal.lisp", position = 1837L)
    public static SubLObject abnormality_check_internal(final SubLObject bound_values_to_check, final SubLObject rule, final SubLObject transformation_mt, final SubLObject store) {
        final SubLObject sentence = abnormality_check_sentence(bound_values_to_check, rule);
        final SubLObject query_dnf = clause_utilities.make_gaf_dnf(sentence);
        SubLObject query_properties = abnormality_check_query_properties(store);
        SubLObject bindings_and_supports = inference_kernel.new_cyc_query_from_dnf(query_dnf, transformation_mt, (SubLObject)abnormal.NIL, query_properties);
        if (abnormal.NIL != abnormality_query_used_illegal_proofP(bindings_and_supports, rule)) {
            query_properties = conses_high.remf(query_properties, (SubLObject)abnormal.$kw2$PROBLEM_STORE);
            bindings_and_supports = inference_kernel.new_cyc_query_from_dnf(query_dnf, transformation_mt, (SubLObject)abnormal.NIL, query_properties);
        }
        final SubLObject justification = conses_high.second(bindings_and_supports.first());
        if (abnormal.NIL != justification) {
            return justification;
        }
        if (abnormal.NIL != list_utilities.sublisp_boolean(bindings_and_supports)) {
            return (SubLObject)abnormal.$kw3$ABNORMAL;
        }
        return (SubLObject)abnormal.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/abnormal.lisp", position = 2768L)
    public static SubLObject abnormality_check_sentence(final SubLObject bound_values_to_check, final SubLObject rule) {
        return el_utilities.make_binary_formula(abnormal.$const0$abnormal, el_utilities.make_formula(abnormal.$const4$TheList, bound_values_to_check, (SubLObject)abnormal.UNPROVIDED), rule);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/abnormal.lisp", position = 3052L)
    public static SubLObject abnormality_check_query_properties(final SubLObject store) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)ConsesLow.list(new SubLObject[] { abnormal.$kw2$PROBLEM_STORE, store, abnormal.$kw5$MAX_NUMBER, abnormal.ONE_INTEGER, abnormal.$kw6$MAX_TRANSFORMATION_DEPTH, abnormal.$abnormality_transformation_depth$.getDynamicValue(thread), abnormal.$kw7$RESULT_UNIQUENESS, abnormal.$kw8$BINDINGS, abnormal.$kw9$RETURN, abnormal.$kw10$BINDINGS_AND_SUPPORTS, abnormal.$kw11$ANSWER_LANGUAGE, abnormal.$kw12$HL, abnormal.$kw13$BROWSABLE_, abnormal.$browse_abnormal_inferencesP$.getDynamicValue(thread), abnormal.$kw14$MIN_RULE_UTILITY, abnormal.$int15$_100, abnormal.$kw16$ALLOW_ABNORMALITY_CHECKING_, abnormal.NIL });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/abnormal.lisp", position = 3988L)
    public static SubLObject abnormality_query_used_illegal_proofP(final SubLObject bindings_and_supports, final SubLObject rule) {
        SubLObject cdolist_list_var;
        final SubLObject justifications = cdolist_list_var = Mapping.mapcar((SubLObject)abnormal.$sym17$SECOND, bindings_and_supports);
        SubLObject justification = (SubLObject)abnormal.NIL;
        justification = cdolist_list_var.first();
        while (abnormal.NIL != cdolist_list_var) {
            if (abnormal.NIL != abnormality_justification_used_illegal_proofP(justification, rule)) {
                return (SubLObject)abnormal.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            justification = cdolist_list_var.first();
        }
        return (SubLObject)abnormal.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/abnormal.lisp", position = 4287L)
    public static SubLObject abnormality_justification_used_illegal_proofP(final SubLObject justification, final SubLObject rule) {
        return subl_promotions.memberP(rule, justification, (SubLObject)abnormal.UNPROVIDED, (SubLObject)abnormal.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/abnormal.lisp", position = 4562L)
    public static SubLObject backward_abnormality_check(final SubLObject rule, final SubLObject source_bindings, final SubLObject node_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (abnormal.NIL != abnormal.$abnormality_checking_enabled$.getDynamicValue(thread) && abnormal.NIL != rule_has_exceptionsP(rule)) {
            SubLObject rule_variables = (SubLObject)abnormal.NIL;
            SubLObject node_variables = (SubLObject)abnormal.NIL;
            SubLObject bound_values_to_check = (SubLObject)abnormal.NIL;
            rule_variables = assertions_high.assertion_free_hl_variables(rule);
            node_variables = conses_high.nsublis(source_bindings, rule_variables, (SubLObject)abnormal.UNPROVIDED, (SubLObject)abnormal.UNPROVIDED);
            bound_values_to_check = conses_high.nsublis(node_bindings, node_variables, (SubLObject)abnormal.UNPROVIDED, (SubLObject)abnormal.UNPROVIDED);
            if (abnormal.NIL == variables.fully_bound_p(bound_values_to_check)) {
                Errors.cerror((SubLObject)abnormal.$str18$Assume_it_isn_t_abnormal, (SubLObject)abnormal.$str19$Abnormality_checker_doesn_t_have_, rule);
                return (SubLObject)abnormal.NIL;
            }
            final SubLObject _prev_bind_0 = kb_control_vars.$within_forward_inferenceP$.currentBinding(thread);
            try {
                kb_control_vars.$within_forward_inferenceP$.bind((SubLObject)abnormal.NIL, thread);
                if (abnormal.NIL != abnormality_check_internal(bound_values_to_check, rule, mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)abnormal.NIL)) {
                    signal_abnormal(bound_values_to_check, rule);
                }
            }
            finally {
                kb_control_vars.$within_forward_inferenceP$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)abnormal.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/abnormal.lisp", position = 5697L)
    public static SubLObject forward_bindings_abnormalP(final SubLObject propagation_mt, final SubLObject rule, final SubLObject trigger_bindings, final SubLObject inference_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject abnormalP = (SubLObject)abnormal.NIL;
        try {
            thread.throwStack.push(abnormal.$kw20$INFERENCE_REJECTED);
            forward_abnormality_check(propagation_mt, rule, trigger_bindings, inference_bindings);
        }
        catch (Throwable ccatch_env_var) {
            abnormalP = Errors.handleThrowable(ccatch_env_var, (SubLObject)abnormal.$kw20$INFERENCE_REJECTED);
        }
        finally {
            thread.throwStack.pop();
        }
        return abnormalP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/abnormal.lisp", position = 6109L)
    public static SubLObject forward_abnormality_check(final SubLObject propagation_mt, final SubLObject rule, final SubLObject trigger_bindings, final SubLObject inference_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (abnormal.NIL != abnormal.$abnormality_checking_enabled$.getDynamicValue(thread) && abnormal.NIL != rule_has_exceptionsP(rule)) {
            SubLObject rule_variables = (SubLObject)abnormal.NIL;
            SubLObject bound_values_to_check = (SubLObject)abnormal.NIL;
            rule_variables = (bound_values_to_check = assertions_high.assertion_free_hl_variables(rule));
            bound_values_to_check = conses_high.nsublis(trigger_bindings, bound_values_to_check, (SubLObject)abnormal.UNPROVIDED, (SubLObject)abnormal.UNPROVIDED);
            bound_values_to_check = conses_high.nsublis(inference_bindings, bound_values_to_check, (SubLObject)abnormal.UNPROVIDED, (SubLObject)abnormal.UNPROVIDED);
            if (abnormal.NIL == variables.fully_bound_p(bound_values_to_check)) {
                Errors.cerror((SubLObject)abnormal.$str18$Assume_it_isn_t_abnormal, (SubLObject)abnormal.$str21$Abnormality_checker_doesn_t_have_, rule);
                return (SubLObject)abnormal.NIL;
            }
            final SubLObject _prev_bind_0 = kb_control_vars.$within_forward_inferenceP$.currentBinding(thread);
            try {
                kb_control_vars.$within_forward_inferenceP$.bind((SubLObject)abnormal.NIL, thread);
                if (abnormal.NIL != abnormality_check_internal(bound_values_to_check, rule, propagation_mt, (SubLObject)abnormal.NIL)) {
                    signal_abnormal(bound_values_to_check, rule);
                }
            }
            finally {
                kb_control_vars.$within_forward_inferenceP$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)abnormal.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/abnormal.lisp", position = 7169L)
    public static SubLObject signal_abnormal(final SubLObject v_bindings, final SubLObject rule) {
        return backward_results.reject_inference((SubLObject)ConsesLow.list((SubLObject)abnormal.$kw3$ABNORMAL, (SubLObject)abnormal.$str22$_S_are_exceptions_to__S, v_bindings, rule));
    }
    
    public static SubLObject declare_abnormal_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.abnormal", "abnormality_except_support_enabledP", "ABNORMALITY-EXCEPT-SUPPORT-ENABLED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.abnormal", "rule_has_exceptionsP", "RULE-HAS-EXCEPTIONS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.abnormal", "rule_bindings_abnormalP", "RULE-BINDINGS-ABNORMAL?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.abnormal", "abnormality_check_internal", "ABNORMALITY-CHECK-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.abnormal", "abnormality_check_sentence", "ABNORMALITY-CHECK-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.abnormal", "abnormality_check_query_properties", "ABNORMALITY-CHECK-QUERY-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.abnormal", "abnormality_query_used_illegal_proofP", "ABNORMALITY-QUERY-USED-ILLEGAL-PROOF?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.abnormal", "abnormality_justification_used_illegal_proofP", "ABNORMALITY-JUSTIFICATION-USED-ILLEGAL-PROOF?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.abnormal", "backward_abnormality_check", "BACKWARD-ABNORMALITY-CHECK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.abnormal", "forward_bindings_abnormalP", "FORWARD-BINDINGS-ABNORMAL?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.abnormal", "forward_abnormality_check", "FORWARD-ABNORMALITY-CHECK", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.abnormal", "signal_abnormal", "SIGNAL-ABNORMAL", 2, 0, false);
        return (SubLObject)abnormal.NIL;
    }
    
    public static SubLObject init_abnormal_file() {
        abnormal.$abnormality_checking_enabled$ = SubLFiles.defvar("*ABNORMALITY-CHECKING-ENABLED*", (SubLObject)abnormal.T);
        abnormal.$abnormality_except_support_enabled$ = SubLFiles.defparameter("*ABNORMALITY-EXCEPT-SUPPORT-ENABLED*", (SubLObject)abnormal.T);
        abnormal.$abnormality_transformation_depth$ = SubLFiles.defvar("*ABNORMALITY-TRANSFORMATION-DEPTH*", (SubLObject)abnormal.ONE_INTEGER);
        abnormal.$browse_abnormal_inferencesP$ = SubLFiles.defparameter("*BROWSE-ABNORMAL-INFERENCES?*", (SubLObject)abnormal.NIL);
        return (SubLObject)abnormal.NIL;
    }
    
    public static SubLObject setup_abnormal_file() {
        return (SubLObject)abnormal.NIL;
    }
    
    public void declareFunctions() {
        declare_abnormal_file();
    }
    
    public void initializeVariables() {
        init_abnormal_file();
    }
    
    public void runTopLevelForms() {
        setup_abnormal_file();
    }
    
    static {
        me = (SubLFile)new abnormal();
        abnormal.$abnormality_checking_enabled$ = null;
        abnormal.$abnormality_except_support_enabled$ = null;
        abnormal.$abnormality_transformation_depth$ = null;
        abnormal.$browse_abnormal_inferencesP$ = null;
        $const0$abnormal = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("abnormal"));
        $sym1$VARIABLE_BINDING_VALUE = SubLObjectFactory.makeSymbol("VARIABLE-BINDING-VALUE");
        $kw2$PROBLEM_STORE = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $kw3$ABNORMAL = SubLObjectFactory.makeKeyword("ABNORMAL");
        $const4$TheList = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList"));
        $kw5$MAX_NUMBER = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $kw6$MAX_TRANSFORMATION_DEPTH = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $kw7$RESULT_UNIQUENESS = SubLObjectFactory.makeKeyword("RESULT-UNIQUENESS");
        $kw8$BINDINGS = SubLObjectFactory.makeKeyword("BINDINGS");
        $kw9$RETURN = SubLObjectFactory.makeKeyword("RETURN");
        $kw10$BINDINGS_AND_SUPPORTS = SubLObjectFactory.makeKeyword("BINDINGS-AND-SUPPORTS");
        $kw11$ANSWER_LANGUAGE = SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE");
        $kw12$HL = SubLObjectFactory.makeKeyword("HL");
        $kw13$BROWSABLE_ = SubLObjectFactory.makeKeyword("BROWSABLE?");
        $kw14$MIN_RULE_UTILITY = SubLObjectFactory.makeKeyword("MIN-RULE-UTILITY");
        $int15$_100 = SubLObjectFactory.makeInteger(-100);
        $kw16$ALLOW_ABNORMALITY_CHECKING_ = SubLObjectFactory.makeKeyword("ALLOW-ABNORMALITY-CHECKING?");
        $sym17$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $str18$Assume_it_isn_t_abnormal = SubLObjectFactory.makeString("Assume it isn't abnormal");
        $str19$Abnormality_checker_doesn_t_have_ = SubLObjectFactory.makeString("Abnormality checker doesn't have all node-variables for ~S");
        $kw20$INFERENCE_REJECTED = SubLObjectFactory.makeKeyword("INFERENCE-REJECTED");
        $str21$Abnormality_checker_doesn_t_have_ = SubLObjectFactory.makeString("Abnormality checker doesn't have all bindings for ~S");
        $str22$_S_are_exceptions_to__S = SubLObjectFactory.makeString("~S are exceptions to ~S");
    }
}

/*

	Total time: 43 ms
	
*/