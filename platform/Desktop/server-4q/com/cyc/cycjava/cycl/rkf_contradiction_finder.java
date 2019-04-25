package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_contradiction_finder extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rkf_contradiction_finder";
    public static final String myFingerPrint = "515a6322a74b82cfa76822d42565186edab654e3bbdad5405c075810ca6567d3";
    private static final SubLSymbol $sym0$RKF_REJECTED;
    private static final SubLSymbol $kw1$ANSWER_LANGUAGE;
    private static final SubLSymbol $kw2$HL;
    private static final SubLSymbol $kw3$CACHE_INFERENCE_RESULTS_;
    private static final SubLSymbol $kw4$RETURN;
    private static final SubLSymbol $kw5$BINDINGS_AND_SUPPORTS;
    private static final SubLSymbol $kw6$RESULT_UNIQUENESS;
    private static final SubLSymbol $kw7$PROOF;
    private static final SubLSymbol $kw8$COMPLETENESS_MINIMIZATION_ALLOWED_;
    private static final SubLSymbol $kw9$MAX_NUMBER;
    private static final SubLSymbol $kw10$MAX_TIME;
    private static final SubLSymbol $kw11$MAX_TRANSFORMATION_DEPTH;
    private static final SubLList $list12;
    private static final SubLObject $const13$rejectedSentence;
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-contradiction-finder.lisp", position = 790L)
    public static SubLObject rkf_rejected(final SubLObject formula, SubLObject mt, SubLObject number, SubLObject time) {
        if (mt == rkf_contradiction_finder.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        if (number == rkf_contradiction_finder.UNPROVIDED) {
            number = (SubLObject)rkf_contradiction_finder.ONE_INTEGER;
        }
        if (time == rkf_contradiction_finder.UNPROVIDED) {
            time = (SubLObject)rkf_contradiction_finder.TEN_INTEGER;
        }
        return rkf_rejected_internal(formula, mt, number, time);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-contradiction-finder.lisp", position = 1164L)
    public static SubLObject rkf_rejected_inference_properties(final SubLObject backchain, final SubLObject number, final SubLObject time, final SubLObject completeness_minimization_allowedP) {
        return (SubLObject)ConsesLow.list(new SubLObject[] { rkf_contradiction_finder.$kw1$ANSWER_LANGUAGE, rkf_contradiction_finder.$kw2$HL, rkf_contradiction_finder.$kw3$CACHE_INFERENCE_RESULTS_, rkf_contradiction_finder.NIL, rkf_contradiction_finder.$kw4$RETURN, rkf_contradiction_finder.$kw5$BINDINGS_AND_SUPPORTS, rkf_contradiction_finder.$kw6$RESULT_UNIQUENESS, rkf_contradiction_finder.$kw7$PROOF, rkf_contradiction_finder.$kw8$COMPLETENESS_MINIMIZATION_ALLOWED_, completeness_minimization_allowedP, rkf_contradiction_finder.$kw9$MAX_NUMBER, number, rkf_contradiction_finder.$kw10$MAX_TIME, time, rkf_contradiction_finder.$kw11$MAX_TRANSFORMATION_DEPTH, backchain });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-contradiction-finder.lisp", position = 1595L)
    public static SubLObject rkf_rejected_internal(final SubLObject formula, final SubLObject mt, final SubLObject number, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_arguments = (SubLObject)rkf_contradiction_finder.NIL;
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
            control_vars.$within_assert$.bind((SubLObject)rkf_contradiction_finder.NIL, thread);
            wff_utilities.$check_arg_typesP$.bind((SubLObject)rkf_contradiction_finder.NIL, thread);
            at_vars.$at_check_arg_typesP$.bind((SubLObject)rkf_contradiction_finder.NIL, thread);
            wff_utilities.$check_wff_semanticsP$.bind((SubLObject)rkf_contradiction_finder.NIL, thread);
            wff_utilities.$check_wff_coherenceP$.bind((SubLObject)rkf_contradiction_finder.NIL, thread);
            wff_utilities.$check_var_typesP$.bind((SubLObject)rkf_contradiction_finder.NIL, thread);
            czer_vars.$simplify_literalP$.bind((SubLObject)rkf_contradiction_finder.NIL, thread);
            at_vars.$at_check_relator_constraintsP$.bind((SubLObject)rkf_contradiction_finder.NIL, thread);
            at_vars.$at_check_arg_formatP$.bind((SubLObject)rkf_contradiction_finder.NIL, thread);
            wff_vars.$validate_constantsP$.bind((SubLObject)rkf_contradiction_finder.NIL, thread);
            system_parameters.$suspend_sbhl_type_checkingP$.bind((SubLObject)rkf_contradiction_finder.T, thread);
            SubLObject v_properties = rkf_rejected_inference_properties((SubLObject)rkf_contradiction_finder.ONE_INTEGER, number, time, (SubLObject)rkf_contradiction_finder.T);
            SubLObject cdolist_list_var = inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(rkf_contradiction_finder.$const13$rejectedSentence, formula), mt, v_properties);
            SubLObject result = (SubLObject)rkf_contradiction_finder.NIL;
            result = cdolist_list_var.first();
            while (rkf_contradiction_finder.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = result;
                SubLObject v_bindings = (SubLObject)rkf_contradiction_finder.NIL;
                SubLObject supports = (SubLObject)rkf_contradiction_finder.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_contradiction_finder.$list12);
                v_bindings = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_contradiction_finder.$list12);
                supports = current.first();
                current = current.rest();
                if (rkf_contradiction_finder.NIL == current) {
                    if (rkf_contradiction_finder.NIL != cyc_kernel.closed_query_bindings_p(v_bindings)) {
                        final SubLObject item_var = supports;
                        if (rkf_contradiction_finder.NIL == conses_high.member(item_var, v_arguments, Symbols.symbol_function((SubLObject)rkf_contradiction_finder.EQUAL), Symbols.symbol_function((SubLObject)rkf_contradiction_finder.IDENTITY))) {
                            v_arguments = (SubLObject)ConsesLow.cons(item_var, v_arguments);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_contradiction_finder.$list12);
                }
                cdolist_list_var = cdolist_list_var.rest();
                result = cdolist_list_var.first();
            }
            v_properties = rkf_rejected_inference_properties((SubLObject)rkf_contradiction_finder.ZERO_INTEGER, number, time, (SubLObject)rkf_contradiction_finder.NIL);
            cdolist_list_var = inference_kernel.new_cyc_query(el_utilities.make_negation(formula), mt, v_properties);
            result = (SubLObject)rkf_contradiction_finder.NIL;
            result = cdolist_list_var.first();
            while (rkf_contradiction_finder.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = result;
                SubLObject v_bindings = (SubLObject)rkf_contradiction_finder.NIL;
                SubLObject supports = (SubLObject)rkf_contradiction_finder.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_contradiction_finder.$list12);
                v_bindings = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_contradiction_finder.$list12);
                supports = current.first();
                current = current.rest();
                if (rkf_contradiction_finder.NIL == current) {
                    if (rkf_contradiction_finder.NIL != cyc_kernel.closed_query_bindings_p(v_bindings)) {
                        final SubLObject item_var = supports;
                        if (rkf_contradiction_finder.NIL == conses_high.member(item_var, v_arguments, Symbols.symbol_function((SubLObject)rkf_contradiction_finder.EQUAL), Symbols.symbol_function((SubLObject)rkf_contradiction_finder.IDENTITY))) {
                            v_arguments = (SubLObject)ConsesLow.cons(item_var, v_arguments);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_contradiction_finder.$list12);
                }
                cdolist_list_var = cdolist_list_var.rest();
                result = cdolist_list_var.first();
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
        SubLObject sorted_arguments = (SubLObject)rkf_contradiction_finder.NIL;
        SubLObject cdolist_list_var2 = v_arguments;
        SubLObject result2 = (SubLObject)rkf_contradiction_finder.NIL;
        result2 = cdolist_list_var2.first();
        while (rkf_contradiction_finder.NIL != cdolist_list_var2) {
            sorted_arguments = (SubLObject)ConsesLow.cons(rkf_argument_communicator.rkf_sort_supports(result2), sorted_arguments);
            cdolist_list_var2 = cdolist_list_var2.rest();
            result2 = cdolist_list_var2.first();
        }
        return Sequences.nreverse(sorted_arguments);
    }
    
    public static SubLObject declare_rkf_contradiction_finder_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_contradiction_finder", "rkf_rejected", "RKF-REJECTED", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_contradiction_finder", "rkf_rejected_inference_properties", "RKF-REJECTED-INFERENCE-PROPERTIES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_contradiction_finder", "rkf_rejected_internal", "RKF-REJECTED-INTERNAL", 4, 0, false);
        return (SubLObject)rkf_contradiction_finder.NIL;
    }
    
    public static SubLObject init_rkf_contradiction_finder_file() {
        return (SubLObject)rkf_contradiction_finder.NIL;
    }
    
    public static SubLObject setup_rkf_contradiction_finder_file() {
        access_macros.register_external_symbol((SubLObject)rkf_contradiction_finder.$sym0$RKF_REJECTED);
        return (SubLObject)rkf_contradiction_finder.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_rkf_contradiction_finder_file();
    }
    
    @Override
	public void initializeVariables() {
        init_rkf_contradiction_finder_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_rkf_contradiction_finder_file();
    }
    
    static {
        me = (SubLFile)new rkf_contradiction_finder();
        $sym0$RKF_REJECTED = SubLObjectFactory.makeSymbol("RKF-REJECTED");
        $kw1$ANSWER_LANGUAGE = SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE");
        $kw2$HL = SubLObjectFactory.makeKeyword("HL");
        $kw3$CACHE_INFERENCE_RESULTS_ = SubLObjectFactory.makeKeyword("CACHE-INFERENCE-RESULTS?");
        $kw4$RETURN = SubLObjectFactory.makeKeyword("RETURN");
        $kw5$BINDINGS_AND_SUPPORTS = SubLObjectFactory.makeKeyword("BINDINGS-AND-SUPPORTS");
        $kw6$RESULT_UNIQUENESS = SubLObjectFactory.makeKeyword("RESULT-UNIQUENESS");
        $kw7$PROOF = SubLObjectFactory.makeKeyword("PROOF");
        $kw8$COMPLETENESS_MINIMIZATION_ALLOWED_ = SubLObjectFactory.makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?");
        $kw9$MAX_NUMBER = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $kw10$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $kw11$MAX_TRANSFORMATION_DEPTH = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS"));
        $const13$rejectedSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rejectedSentence"));
    }
}

/*

	Total time: 50 ms
	
*/