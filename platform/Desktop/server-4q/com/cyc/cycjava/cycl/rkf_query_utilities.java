package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.prove;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_query_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rkf_query_utilities";
    public static final String myFingerPrint = "b011ef69fb887bd24d059e8f9578374b38ac3d318fa99c90ae1eadb60d307fc7";
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-utilities.lisp", position = 4484L)
    private static SubLSymbol $rkf_default_new_query_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-utilities.lisp", position = 8991L)
    public static SubLSymbol $rkf_known_time_cutoff$;
    private static final SubLSymbol $kw0$TRUTH;
    private static final SubLSymbol $kw1$PROVE;
    private static final SubLSymbol $kw2$ASK;
    private static final SubLString $str3$RKF_CHOOSE_QUERY_METHOD__This_is_;
    private static final SubLSymbol $sym4$RKF_TRUTH;
    private static final SubLSymbol $sym5$RKF_QUERY;
    private static final SubLString $str6$Unsupported_query_type__A_;
    private static final SubLSymbol $kw7$MAX_TIME;
    private static final SubLString $str8$__RKF_ASK_timed_out_after__S_seco;
    private static final SubLSymbol $kw9$CACHE_INFERENCE_RESULTS_;
    private static final SubLSymbol $kw10$ANSWER_LANGUAGE;
    private static final SubLSymbol $kw11$HL;
    private static final SubLSymbol $kw12$RETURN;
    private static final SubLSymbol $kw13$BINDINGS_AND_SUPPORTS;
    private static final SubLList $list14;
    private static final SubLSymbol $kw15$RESULT_UNIQUENESS;
    private static final SubLSymbol $kw16$PROOF;
    private static final SubLSymbol $kw17$MAX_NUMBER;
    private static final SubLSymbol $kw18$MAX_TRANSFORMATION_DEPTH;
    private static final SubLSymbol $kw19$MAX_PROOF_DEPTH;
    private static final SubLList $list20;
    private static final SubLList $list21;
    private static final SubLObject $const22$TheResultOfParsing;
    private static final SubLSymbol $kw23$PROBLEM_STORE;
    private static final SubLSymbol $kw24$BINDINGS;
    private static final SubLSymbol $kw25$NEGATION_BY_FAILURE_;
    private static final SubLSymbol $sym26$RKF_KNOWN;
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-utilities.lisp", position = 768L)
    public static SubLObject rkf_determine_query_type(final SubLObject formula, SubLObject mt) {
        if (mt == rkf_query_utilities.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        if (rkf_query_utilities.NIL != el_utilities.closedP(formula, (SubLObject)rkf_query_utilities.UNPROVIDED)) {
            return (SubLObject)rkf_query_utilities.$kw0$TRUTH;
        }
        if (rkf_query_utilities.NIL != el_utilities.el_implication_p(formula)) {
            return (SubLObject)rkf_query_utilities.$kw1$PROVE;
        }
        return (SubLObject)rkf_query_utilities.$kw2$ASK;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-utilities.lisp", position = 1272L)
    public static SubLObject rkf_choose_query_method(final SubLObject formula, SubLObject mt) {
        if (mt == rkf_query_utilities.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        Errors.warn((SubLObject)rkf_query_utilities.$str3$RKF_CHOOSE_QUERY_METHOD__This_is_);
        final SubLObject pcase_var;
        final SubLObject type = pcase_var = rkf_determine_query_type(formula, mt);
        if (pcase_var.eql((SubLObject)rkf_query_utilities.$kw0$TRUTH)) {
            return (SubLObject)rkf_query_utilities.$sym4$RKF_TRUTH;
        }
        return (SubLObject)rkf_query_utilities.$sym5$RKF_QUERY;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-utilities.lisp", position = 1716L)
    public static SubLObject rkf_generic_query(final SubLObject formula, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == rkf_query_utilities.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        if (backchain == rkf_query_utilities.UNPROVIDED) {
            backchain = (SubLObject)rkf_query_utilities.NIL;
        }
        if (number == rkf_query_utilities.UNPROVIDED) {
            number = (SubLObject)rkf_query_utilities.ONE_INTEGER;
        }
        if (time == rkf_query_utilities.UNPROVIDED) {
            time = (SubLObject)rkf_query_utilities.TEN_INTEGER;
        }
        if (depth == rkf_query_utilities.UNPROVIDED) {
            depth = (SubLObject)rkf_query_utilities.TWENTY_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var;
        final SubLObject classification = pcase_var = rkf_determine_query_type(formula, mt);
        if (pcase_var.eql((SubLObject)rkf_query_utilities.$kw0$TRUTH)) {
            thread.resetMultipleValues();
            final SubLObject pro = rkf_truth(formula, mt, backchain, number, time, depth);
            final SubLObject cons = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return Values.values((SubLObject)rkf_query_utilities.$kw0$TRUTH, pro, cons);
        }
        if (pcase_var.eql((SubLObject)rkf_query_utilities.$kw1$PROVE)) {
            thread.resetMultipleValues();
            final SubLObject results = rkf_prove(formula, mt, backchain, number, time, depth);
            final SubLObject status = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return Values.values((SubLObject)rkf_query_utilities.$kw1$PROVE, results, status);
        }
        if (pcase_var.eql((SubLObject)rkf_query_utilities.$kw2$ASK)) {
            thread.resetMultipleValues();
            final SubLObject results = rkf_ask(formula, mt, backchain, number, time, depth);
            final SubLObject status = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return Values.values((SubLObject)rkf_query_utilities.$kw2$ASK, results, status);
        }
        Errors.error((SubLObject)rkf_query_utilities.$str6$Unsupported_query_type__A_, classification);
        return (SubLObject)rkf_query_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-utilities.lisp", position = 2714L)
    public static SubLObject rkf_query(final SubLObject formula, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == rkf_query_utilities.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        if (backchain == rkf_query_utilities.UNPROVIDED) {
            backchain = (SubLObject)rkf_query_utilities.NIL;
        }
        if (number == rkf_query_utilities.UNPROVIDED) {
            number = (SubLObject)rkf_query_utilities.ONE_INTEGER;
        }
        if (time == rkf_query_utilities.UNPROVIDED) {
            time = (SubLObject)rkf_query_utilities.TEN_INTEGER;
        }
        if (depth == rkf_query_utilities.UNPROVIDED) {
            depth = (SubLObject)rkf_query_utilities.TWENTY_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject type = rkf_determine_query_type(formula, (SubLObject)rkf_query_utilities.UNPROVIDED);
        SubLObject result = (SubLObject)rkf_query_utilities.NIL;
        SubLObject status = (SubLObject)rkf_query_utilities.NIL;
        if (type == rkf_query_utilities.$kw1$PROVE) {
            thread.resetMultipleValues();
            final SubLObject res = rkf_prove(formula, mt, backchain, number, time, depth);
            final SubLObject stat = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = res;
            status = stat;
        }
        else {
            thread.resetMultipleValues();
            final SubLObject res = rkf_ask(formula, mt, backchain, number, time, depth);
            final SubLObject stat = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = res;
            status = stat;
        }
        return Values.values(result, status);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-utilities.lisp", position = 3309L)
    public static SubLObject rkf_ask(final SubLObject formula, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == rkf_query_utilities.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        if (backchain == rkf_query_utilities.UNPROVIDED) {
            backchain = (SubLObject)rkf_query_utilities.NIL;
        }
        if (number == rkf_query_utilities.UNPROVIDED) {
            number = (SubLObject)rkf_query_utilities.ONE_INTEGER;
        }
        if (time == rkf_query_utilities.UNPROVIDED) {
            time = (SubLObject)rkf_query_utilities.TEN_INTEGER;
        }
        if (depth == rkf_query_utilities.UNPROVIDED) {
            depth = (SubLObject)rkf_query_utilities.TWENTY_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)rkf_query_utilities.NIL;
        SubLObject status = (SubLObject)rkf_query_utilities.NIL;
        final SubLObject _prev_bind_0 = control_vars.$cache_inference_results$.currentBinding(thread);
        final SubLObject _prev_bind_2 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
        try {
            control_vars.$cache_inference_results$.bind((SubLObject)rkf_query_utilities.NIL, thread);
            api_control_vars.$generate_readable_fi_results$.bind((SubLObject)rkf_query_utilities.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject ask_result = ask_utilities.ask_justified(formula, mt, backchain, number, time, depth);
            final SubLObject ask_status = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (rkf_query_utilities.NIL != number_utilities.positive_number_p(time) && rkf_query_utilities.$kw7$MAX_TIME == ask_status) {
                Errors.warn((SubLObject)rkf_query_utilities.$str8$__RKF_ASK_timed_out_after__S_seco, time, formula, mt);
            }
            result = ask_result;
            status = ask_status;
        }
        finally {
            api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_2, thread);
            control_vars.$cache_inference_results$.rebind(_prev_bind_0, thread);
        }
        return Values.values(result, status);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-utilities.lisp", position = 3978L)
    public static SubLObject rkf_prove(final SubLObject formula, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == rkf_query_utilities.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        if (backchain == rkf_query_utilities.UNPROVIDED) {
            backchain = (SubLObject)rkf_query_utilities.NIL;
        }
        if (number == rkf_query_utilities.UNPROVIDED) {
            number = (SubLObject)rkf_query_utilities.ONE_INTEGER;
        }
        if (time == rkf_query_utilities.UNPROVIDED) {
            time = (SubLObject)rkf_query_utilities.TEN_INTEGER;
        }
        if (depth == rkf_query_utilities.UNPROVIDED) {
            depth = (SubLObject)rkf_query_utilities.TWENTY_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)rkf_query_utilities.NIL;
        SubLObject status = (SubLObject)rkf_query_utilities.NIL;
        final SubLObject _prev_bind_0 = control_vars.$cache_inference_results$.currentBinding(thread);
        final SubLObject _prev_bind_2 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
        try {
            control_vars.$cache_inference_results$.bind((SubLObject)rkf_query_utilities.NIL, thread);
            api_control_vars.$generate_readable_fi_results$.bind((SubLObject)rkf_query_utilities.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject ask_result = prove.prove_justified(formula, mt, backchain, number, time, depth);
            final SubLObject ask_status = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = ask_result;
            status = ask_status;
        }
        finally {
            api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_2, thread);
            control_vars.$cache_inference_results$.rebind(_prev_bind_0, thread);
        }
        return Values.values(result, status);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-utilities.lisp", position = 4722L)
    public static SubLObject rkf_new_query(final SubLObject sentence, final SubLObject rkf_mt, SubLObject v_properties) {
        if (v_properties == rkf_query_utilities.UNPROVIDED) {
            v_properties = (SubLObject)rkf_query_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)rkf_query_utilities.NIL;
        SubLObject status = (SubLObject)rkf_query_utilities.NIL;
        SubLObject inference = (SubLObject)rkf_query_utilities.NIL;
        v_properties = list_utilities.merge_plist(v_properties, rkf_query_utilities.$rkf_default_new_query_properties$.getGlobalValue());
        thread.resetMultipleValues();
        final SubLObject results = inference_kernel.new_cyc_query(sentence, rkf_mt, v_properties);
        final SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject maybe_inference = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        result = results;
        status = halt_reason;
        inference = maybe_inference;
        return Values.values(result, status, inference);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-utilities.lisp", position = 5288L)
    public static SubLObject rkf_ask_new_cycl_query_specification(final SubLObject query_spec, SubLObject mt, SubLObject substitutions) {
        if (mt == rkf_query_utilities.UNPROVIDED) {
            mt = (SubLObject)rkf_query_utilities.NIL;
        }
        if (substitutions == rkf_query_utilities.UNPROVIDED) {
            substitutions = (SubLObject)rkf_query_utilities.NIL;
        }
        final SubLObject additional_properties = rkf_query_utilities.$rkf_default_new_query_properties$.getGlobalValue();
        return new_cycl_query_specification.new_cycl_query_specification_ask(query_spec, mt, substitutions, additional_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-utilities.lisp", position = 5759L)
    public static SubLObject rkf_expand_justifications(final SubLObject results) {
        SubLObject expanded_results = (SubLObject)rkf_query_utilities.NIL;
        SubLObject cdolist_list_var = results;
        SubLObject result = (SubLObject)rkf_query_utilities.NIL;
        result = cdolist_list_var.first();
        while (rkf_query_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = result;
            SubLObject binding = (SubLObject)rkf_query_utilities.NIL;
            SubLObject justification = (SubLObject)rkf_query_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_query_utilities.$list14);
            binding = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_query_utilities.$list14);
            justification = current.first();
            current = current.rest();
            if (rkf_query_utilities.NIL == current) {
                final SubLObject new_justifications = hl_supports.hl_justification_expand(justification);
                expanded_results = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(binding, new_justifications), expanded_results);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_query_utilities.$list14);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        }
        return Sequences.nreverse(expanded_results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-utilities.lisp", position = 6210L)
    public static SubLObject rkf_extract_bindings_from_results(final SubLObject results) {
        SubLObject v_bindings = (SubLObject)rkf_query_utilities.NIL;
        SubLObject cdolist_list_var = results;
        SubLObject result = (SubLObject)rkf_query_utilities.NIL;
        result = cdolist_list_var.first();
        while (rkf_query_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = result;
            SubLObject binding = (SubLObject)rkf_query_utilities.NIL;
            SubLObject justification = (SubLObject)rkf_query_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_query_utilities.$list14);
            binding = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_query_utilities.$list14);
            justification = current.first();
            current = current.rest();
            if (rkf_query_utilities.NIL == current) {
                v_bindings = (SubLObject)ConsesLow.cons(binding, v_bindings);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_query_utilities.$list14);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        }
        return Sequences.nreverse(v_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-utilities.lisp", position = 6463L)
    public static SubLObject rkf_truth(final SubLObject formula, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == rkf_query_utilities.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        if (backchain == rkf_query_utilities.UNPROVIDED) {
            backchain = (SubLObject)rkf_query_utilities.NIL;
        }
        if (number == rkf_query_utilities.UNPROVIDED) {
            number = (SubLObject)rkf_query_utilities.ONE_INTEGER;
        }
        if (time == rkf_query_utilities.UNPROVIDED) {
            time = (SubLObject)rkf_query_utilities.TEN_INTEGER;
        }
        if (depth == rkf_query_utilities.UNPROVIDED) {
            depth = (SubLObject)rkf_query_utilities.TWENTY_INTEGER;
        }
        return rkf_truth_internal(formula, mt, backchain, number, time, depth);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-utilities.lisp", position = 7034L)
    public static SubLObject rkf_truth_inference_properties(final SubLObject backchain, final SubLObject number, final SubLObject time, final SubLObject depth) {
        return (SubLObject)ConsesLow.list(new SubLObject[] { rkf_query_utilities.$kw10$ANSWER_LANGUAGE, rkf_query_utilities.$kw11$HL, rkf_query_utilities.$kw9$CACHE_INFERENCE_RESULTS_, rkf_query_utilities.NIL, rkf_query_utilities.$kw12$RETURN, rkf_query_utilities.$kw13$BINDINGS_AND_SUPPORTS, rkf_query_utilities.$kw15$RESULT_UNIQUENESS, rkf_query_utilities.$kw16$PROOF, rkf_query_utilities.$kw17$MAX_NUMBER, number, rkf_query_utilities.$kw7$MAX_TIME, time, rkf_query_utilities.$kw18$MAX_TRANSFORMATION_DEPTH, backchain, rkf_query_utilities.$kw19$MAX_PROOF_DEPTH, depth });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-utilities.lisp", position = 7385L)
    public static SubLObject rkf_truth_internal(final SubLObject formula, final SubLObject mt, final SubLObject backchain, final SubLObject number, final SubLObject time, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sorted_true_arguments = (SubLObject)rkf_query_utilities.NIL;
        SubLObject sorted_false_arguments = (SubLObject)rkf_query_utilities.NIL;
        final SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding(thread);
        final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding(thread);
        final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
        try {
            control_vars.$within_assert$.bind((SubLObject)rkf_query_utilities.NIL, thread);
            wff_utilities.$check_arg_typesP$.bind((SubLObject)rkf_query_utilities.NIL, thread);
            at_vars.$at_check_arg_typesP$.bind((SubLObject)rkf_query_utilities.NIL, thread);
            wff_utilities.$check_wff_semanticsP$.bind((SubLObject)rkf_query_utilities.NIL, thread);
            wff_utilities.$check_wff_coherenceP$.bind((SubLObject)rkf_query_utilities.NIL, thread);
            wff_utilities.$check_var_typesP$.bind((SubLObject)rkf_query_utilities.NIL, thread);
            czer_vars.$simplify_literalP$.bind((SubLObject)rkf_query_utilities.NIL, thread);
            at_vars.$at_check_relator_constraintsP$.bind((SubLObject)rkf_query_utilities.NIL, thread);
            at_vars.$at_check_arg_formatP$.bind((SubLObject)rkf_query_utilities.NIL, thread);
            wff_vars.$validate_constantsP$.bind((SubLObject)rkf_query_utilities.NIL, thread);
            system_parameters.$suspend_sbhl_type_checkingP$.bind((SubLObject)rkf_query_utilities.T, thread);
            final SubLObject v_properties = rkf_truth_inference_properties(backchain, number, time, depth);
            SubLObject cdolist_list_var = inference_kernel.new_cyc_query(formula, mt, v_properties);
            SubLObject true_result = (SubLObject)rkf_query_utilities.NIL;
            true_result = cdolist_list_var.first();
            while (rkf_query_utilities.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = true_result;
                SubLObject v_bindings = (SubLObject)rkf_query_utilities.NIL;
                SubLObject supports = (SubLObject)rkf_query_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_query_utilities.$list20);
                v_bindings = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_query_utilities.$list20);
                supports = current.first();
                current = current.rest();
                if (rkf_query_utilities.NIL == current) {
                    if (rkf_query_utilities.NIL != cyc_kernel.closed_query_bindings_p(v_bindings)) {
                        final SubLObject item_var = rkf_argument_communicator.rkf_sort_supports(supports);
                        if (rkf_query_utilities.NIL == conses_high.member(item_var, sorted_true_arguments, Symbols.symbol_function((SubLObject)rkf_query_utilities.EQUAL), Symbols.symbol_function((SubLObject)rkf_query_utilities.IDENTITY))) {
                            sorted_true_arguments = (SubLObject)ConsesLow.cons(item_var, sorted_true_arguments);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_query_utilities.$list20);
                }
                cdolist_list_var = cdolist_list_var.rest();
                true_result = cdolist_list_var.first();
            }
            cdolist_list_var = inference_kernel.new_cyc_query(cycl_utilities.negate(formula), mt, v_properties);
            SubLObject false_result = (SubLObject)rkf_query_utilities.NIL;
            false_result = cdolist_list_var.first();
            while (rkf_query_utilities.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = false_result;
                SubLObject v_bindings = (SubLObject)rkf_query_utilities.NIL;
                SubLObject supports = (SubLObject)rkf_query_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_query_utilities.$list20);
                v_bindings = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_query_utilities.$list20);
                supports = current.first();
                current = current.rest();
                if (rkf_query_utilities.NIL == current) {
                    if (rkf_query_utilities.NIL != cyc_kernel.closed_query_bindings_p(v_bindings)) {
                        final SubLObject item_var = rkf_argument_communicator.rkf_sort_supports(supports);
                        if (rkf_query_utilities.NIL == conses_high.member(item_var, sorted_false_arguments, Symbols.symbol_function((SubLObject)rkf_query_utilities.EQUAL), Symbols.symbol_function((SubLObject)rkf_query_utilities.IDENTITY))) {
                            sorted_false_arguments = (SubLObject)ConsesLow.cons(item_var, sorted_false_arguments);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_query_utilities.$list20);
                }
                cdolist_list_var = cdolist_list_var.rest();
                false_result = cdolist_list_var.first();
            }
        }
        finally {
            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_11, thread);
            wff_vars.$validate_constantsP$.rebind(_prev_bind_10, thread);
            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_9, thread);
            at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_8, thread);
            czer_vars.$simplify_literalP$.rebind(_prev_bind_7, thread);
            wff_utilities.$check_var_typesP$.rebind(_prev_bind_6, thread);
            wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_5, thread);
            wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
            at_vars.$at_check_arg_typesP$.rebind(_prev_bind_3, thread);
            wff_utilities.$check_arg_typesP$.rebind(_prev_bind_2, thread);
            control_vars.$within_assert$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)ConsesLow.list(Sequences.nreverse(sorted_true_arguments), Sequences.nreverse(sorted_false_arguments));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-utilities.lisp", position = 8289L)
    public static SubLObject rkf_justify(final SubLObject formula, SubLObject mt) {
        if (mt == rkf_query_utilities.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        if (rkf_query_utilities.NIL != assertion_handles.assertion_p(formula)) {
            return (SubLObject)ConsesLow.list(hl_supports.hl_justify(formula));
        }
        if (rkf_query_utilities.NIL == el_utilities.el_formula_p(formula)) {
            return (SubLObject)rkf_query_utilities.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = rkf_truth(formula, mt, (SubLObject)rkf_query_utilities.UNPROVIDED, (SubLObject)rkf_query_utilities.UNPROVIDED, (SubLObject)rkf_query_utilities.UNPROVIDED, (SubLObject)rkf_query_utilities.UNPROVIDED);
        SubLObject pros = (SubLObject)rkf_query_utilities.NIL;
        SubLObject cons = (SubLObject)rkf_query_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_query_utilities.$list21);
        pros = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_query_utilities.$list21);
        cons = current.first();
        current = current.rest();
        if (rkf_query_utilities.NIL == current) {
            return (SubLObject)((rkf_query_utilities.NIL != cons) ? rkf_query_utilities.NIL : pros);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_query_utilities.$list21);
        return (SubLObject)rkf_query_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-utilities.lisp", position = 8626L)
    public static SubLObject rkf_unknown(final SubLObject formula, SubLObject mt) {
        if (mt == rkf_query_utilities.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        if (rkf_query_utilities.NIL != cycl_utilities.formula_find(rkf_query_utilities.$const22$TheResultOfParsing, formula, (SubLObject)rkf_query_utilities.UNPROVIDED, (SubLObject)rkf_query_utilities.UNPROVIDED, (SubLObject)rkf_query_utilities.UNPROVIDED)) {
            return (SubLObject)rkf_query_utilities.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_query_utilities.NIL == rkf_contradiction_finder.rkf_rejected(formula, mt, (SubLObject)rkf_query_utilities.UNPROVIDED, (SubLObject)rkf_query_utilities.UNPROVIDED) && rkf_query_utilities.NIL == rkf_redundancy_detector.rkf_redundant(formula, mt, (SubLObject)rkf_query_utilities.UNPROVIDED, (SubLObject)rkf_query_utilities.UNPROVIDED) && rkf_query_utilities.NIL == rkf_known(formula, mt, (SubLObject)rkf_query_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-utilities.lisp", position = 9042L)
    public static SubLObject rkf_known_inference_properties(final SubLObject problem_store) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)ConsesLow.list(new SubLObject[] { rkf_query_utilities.$kw23$PROBLEM_STORE, problem_store, rkf_query_utilities.$kw10$ANSWER_LANGUAGE, rkf_query_utilities.$kw11$HL, rkf_query_utilities.$kw9$CACHE_INFERENCE_RESULTS_, rkf_query_utilities.NIL, rkf_query_utilities.$kw15$RESULT_UNIQUENESS, rkf_query_utilities.$kw24$BINDINGS, rkf_query_utilities.$kw25$NEGATION_BY_FAILURE_, control_vars.$negation_by_failure$.getDynamicValue(thread), rkf_query_utilities.$kw17$MAX_NUMBER, rkf_query_utilities.ONE_INTEGER, rkf_query_utilities.$kw7$MAX_TIME, rkf_query_utilities.$rkf_known_time_cutoff$.getDynamicValue(thread), rkf_query_utilities.$kw18$MAX_TRANSFORMATION_DEPTH, rkf_query_utilities.ZERO_INTEGER });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-utilities.lisp", position = 9395L)
    public static SubLObject rkf_known(final SubLObject formula, SubLObject mt, SubLObject problem_store) {
        if (mt == rkf_query_utilities.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        if (problem_store == rkf_query_utilities.UNPROVIDED) {
            problem_store = (SubLObject)rkf_query_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_query_utilities.NIL != cycl_utilities.formula_find(rkf_query_utilities.$const22$TheResultOfParsing, formula, (SubLObject)rkf_query_utilities.UNPROVIDED, (SubLObject)rkf_query_utilities.UNPROVIDED, (SubLObject)rkf_query_utilities.UNPROVIDED)) {
            return (SubLObject)rkf_query_utilities.NIL;
        }
        SubLObject known = (SubLObject)rkf_query_utilities.NIL;
        SubLObject timed_outP = (SubLObject)rkf_query_utilities.NIL;
        thread.resetMultipleValues();
        final SubLObject results = inference_kernel.new_cyc_query(formula, mt, rkf_known_inference_properties(problem_store));
        final SubLObject exit_condition = thread.secondMultipleValue();
        thread.resetMultipleValues();
        known = list_utilities.sublisp_boolean(results);
        timed_outP = Equality.eq((SubLObject)rkf_query_utilities.$kw7$MAX_TIME, exit_condition);
        return Values.values(known, timed_outP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-utilities.lisp", position = 9838L)
    public static SubLObject rkf_load_test_question(final SubLObject tq_id, final SubLObject rkf_mt) {
        final SubLObject tq_spec = new_cycl_query_specification.load_new_cycl_query_specification_from_kb(tq_id, rkf_mt);
        return tq_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-utilities.lisp", position = 10182L)
    public static SubLObject rkf_make_similar_test_question(final SubLObject formula, final SubLObject tq_id, final SubLObject rkf_mt) {
        final SubLObject tq_spec = rkf_load_test_question(tq_id, rkf_mt);
        new_cycl_query_specification.reset_new_cycl_query_specification_formula(tq_spec, formula);
        new_cycl_query_specification.reset_new_cycl_query_specification_mt(tq_spec, rkf_mt);
        return tq_spec;
    }
    
    public static SubLObject declare_rkf_query_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_utilities", "rkf_determine_query_type", "RKF-DETERMINE-QUERY-TYPE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_utilities", "rkf_choose_query_method", "RKF-CHOOSE-QUERY-METHOD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_utilities", "rkf_generic_query", "RKF-GENERIC-QUERY", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_utilities", "rkf_query", "RKF-QUERY", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_utilities", "rkf_ask", "RKF-ASK", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_utilities", "rkf_prove", "RKF-PROVE", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_utilities", "rkf_new_query", "RKF-NEW-QUERY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_utilities", "rkf_ask_new_cycl_query_specification", "RKF-ASK-NEW-CYCL-QUERY-SPECIFICATION", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_utilities", "rkf_expand_justifications", "RKF-EXPAND-JUSTIFICATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_utilities", "rkf_extract_bindings_from_results", "RKF-EXTRACT-BINDINGS-FROM-RESULTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_utilities", "rkf_truth", "RKF-TRUTH", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_utilities", "rkf_truth_inference_properties", "RKF-TRUTH-INFERENCE-PROPERTIES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_utilities", "rkf_truth_internal", "RKF-TRUTH-INTERNAL", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_utilities", "rkf_justify", "RKF-JUSTIFY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_utilities", "rkf_unknown", "RKF-UNKNOWN", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_utilities", "rkf_known_inference_properties", "RKF-KNOWN-INFERENCE-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_utilities", "rkf_known", "RKF-KNOWN", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_utilities", "rkf_load_test_question", "RKF-LOAD-TEST-QUESTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_utilities", "rkf_make_similar_test_question", "RKF-MAKE-SIMILAR-TEST-QUESTION", 3, 0, false);
        return (SubLObject)rkf_query_utilities.NIL;
    }
    
    public static SubLObject init_rkf_query_utilities_file() {
        rkf_query_utilities.$rkf_default_new_query_properties$ = SubLFiles.deflexical("*RKF-DEFAULT-NEW-QUERY-PROPERTIES*", (SubLObject)ConsesLow.list((SubLObject)rkf_query_utilities.$kw9$CACHE_INFERENCE_RESULTS_, (SubLObject)rkf_query_utilities.NIL, (SubLObject)rkf_query_utilities.$kw10$ANSWER_LANGUAGE, (SubLObject)rkf_query_utilities.$kw11$HL, (SubLObject)rkf_query_utilities.$kw12$RETURN, (SubLObject)rkf_query_utilities.$kw13$BINDINGS_AND_SUPPORTS));
        rkf_query_utilities.$rkf_known_time_cutoff$ = SubLFiles.defparameter("*RKF-KNOWN-TIME-CUTOFF*", (SubLObject)rkf_query_utilities.NIL);
        return (SubLObject)rkf_query_utilities.NIL;
    }
    
    public static SubLObject setup_rkf_query_utilities_file() {
        access_macros.register_external_symbol((SubLObject)rkf_query_utilities.$sym26$RKF_KNOWN);
        return (SubLObject)rkf_query_utilities.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_rkf_query_utilities_file();
    }
    
    @Override
	public void initializeVariables() {
        init_rkf_query_utilities_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_rkf_query_utilities_file();
    }
    
    static {
        me = (SubLFile)new rkf_query_utilities();
        rkf_query_utilities.$rkf_default_new_query_properties$ = null;
        rkf_query_utilities.$rkf_known_time_cutoff$ = null;
        $kw0$TRUTH = SubLObjectFactory.makeKeyword("TRUTH");
        $kw1$PROVE = SubLObjectFactory.makeKeyword("PROVE");
        $kw2$ASK = SubLObjectFactory.makeKeyword("ASK");
        $str3$RKF_CHOOSE_QUERY_METHOD__This_is_ = SubLObjectFactory.makeString("RKF-CHOOSE-QUERY-METHOD: This is a legacy function and will go away; use RKF-DETERMINE-QUERY-TYPE instead.");
        $sym4$RKF_TRUTH = SubLObjectFactory.makeSymbol("RKF-TRUTH");
        $sym5$RKF_QUERY = SubLObjectFactory.makeSymbol("RKF-QUERY");
        $str6$Unsupported_query_type__A_ = SubLObjectFactory.makeString("Unsupported query type ~A.");
        $kw7$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $str8$__RKF_ASK_timed_out_after__S_seco = SubLObjectFactory.makeString("~&RKF-ASK timed out after ~S seconds on ~S in ~S.~%");
        $kw9$CACHE_INFERENCE_RESULTS_ = SubLObjectFactory.makeKeyword("CACHE-INFERENCE-RESULTS?");
        $kw10$ANSWER_LANGUAGE = SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE");
        $kw11$HL = SubLObjectFactory.makeKeyword("HL");
        $kw12$RETURN = SubLObjectFactory.makeKeyword("RETURN");
        $kw13$BINDINGS_AND_SUPPORTS = SubLObjectFactory.makeKeyword("BINDINGS-AND-SUPPORTS");
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDING"), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATION"));
        $kw15$RESULT_UNIQUENESS = SubLObjectFactory.makeKeyword("RESULT-UNIQUENESS");
        $kw16$PROOF = SubLObjectFactory.makeKeyword("PROOF");
        $kw17$MAX_NUMBER = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $kw18$MAX_TRANSFORMATION_DEPTH = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $kw19$MAX_PROOF_DEPTH = SubLObjectFactory.makeKeyword("MAX-PROOF-DEPTH");
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS"));
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROS"), (SubLObject)SubLObjectFactory.makeSymbol("CONS"));
        $const22$TheResultOfParsing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheResultOfParsing"));
        $kw23$PROBLEM_STORE = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $kw24$BINDINGS = SubLObjectFactory.makeKeyword("BINDINGS");
        $kw25$NEGATION_BY_FAILURE_ = SubLObjectFactory.makeKeyword("NEGATION-BY-FAILURE?");
        $sym26$RKF_KNOWN = SubLObjectFactory.makeSymbol("RKF-KNOWN");
    }
}

/*

	Total time: 162 ms
	
*/