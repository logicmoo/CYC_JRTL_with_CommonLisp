package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class abduction extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.abduction";
    public static final String myFingerPrint = "f46516c715c42045f30e3a9f91cc213d6dbe01d67b1974e99fdc221b1613b790";
    @SubLTranslatedFile.SubL(source = "cycl/abduction.lisp", position = 1003L)
    private static SubLSymbol $default_abductive_inference_properties$;
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLObject $const2$AbducedTermFn;
    private static final SubLSymbol $kw3$ABDUCTION;
    private static final SubLSymbol $sym4$INFERENCE_ANSWER_JUSTIFICATION_ABDUCTION_COUNT;
    private static final SubLSymbol $sym5$_;
    
    @SubLTranslatedFile.SubL(source = "cycl/abduction.lisp", position = 1767L)
    public static SubLObject default_abduction_inference_parameters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return conses_high.copy_list(abduction.$default_abductive_inference_properties$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/abduction.lisp", position = 1890L)
    public static SubLObject default_abduction_answer_filter(final SubLObject v_bindings, final SubLObject inference) {
        final SubLObject query = inference_datastructures_problem_query.single_literal_problem_query_atomic_sentence(inference_datastructures_inference.inference_hl_query(inference));
        SubLObject good_bindings = (SubLObject)abduction.NIL;
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = (SubLObject)abduction.NIL;
        binding = cdolist_list_var.first();
        while (abduction.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = binding;
            SubLObject binding_list = (SubLObject)abduction.NIL;
            SubLObject supports = (SubLObject)abduction.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)abduction.$list1);
            binding_list = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)abduction.$list1);
            supports = current.first();
            current = current.rest();
            if (abduction.NIL == current) {
                if (abduction.NIL != list_utilities.singletonP(supports)) {
                    final SubLObject v_abduction = supports.first();
                    final SubLObject sentence = arguments.support_sentence(v_abduction);
                    if (abduction.NIL == unification_utilities.asent_unify(query, sentence, (SubLObject)abduction.UNPROVIDED, (SubLObject)abduction.UNPROVIDED)) {
                        good_bindings = (SubLObject)ConsesLow.cons(binding, good_bindings);
                    }
                }
                else {
                    good_bindings = (SubLObject)ConsesLow.cons(binding, good_bindings);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)abduction.$list1);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        return Sequences.nreverse(good_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/abduction.lisp", position = 2617L)
    public static SubLObject cyc_abduction(final SubLObject formula, final SubLObject mt, SubLObject v_inference_parameters, SubLObject ranking_fn, SubLObject type_check_enabled) {
        if (v_inference_parameters == abduction.UNPROVIDED) {
            v_inference_parameters = (SubLObject)abduction.NIL;
        }
        if (ranking_fn == abduction.UNPROVIDED) {
            ranking_fn = (SubLObject)abduction.NIL;
        }
        if (type_check_enabled == abduction.UNPROVIDED) {
            type_check_enabled = (SubLObject)abduction.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_properties = list_utilities.nmerge_plist(default_abduction_inference_parameters(), v_inference_parameters);
        SubLObject v_bindings = (SubLObject)abduction.NIL;
        SubLObject reason = (SubLObject)abduction.NIL;
        SubLObject inference = (SubLObject)abduction.NIL;
        final SubLObject _prev_bind_0 = inference_worker_transformation.$inference_transformation_type_checking_enabledP$.currentBinding(thread);
        try {
            inference_worker_transformation.$inference_transformation_type_checking_enabledP$.bind(type_check_enabled, thread);
            thread.resetMultipleValues();
            final SubLObject v_bindings_$1 = inference_kernel.new_cyc_query(formula, mt, inference_properties);
            final SubLObject reason_$2 = thread.secondMultipleValue();
            final SubLObject inference_$3 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            v_bindings = v_bindings_$1;
            reason = reason_$2;
            inference = inference_$3;
        }
        finally {
            inference_worker_transformation.$inference_transformation_type_checking_enabledP$.rebind(_prev_bind_0, thread);
        }
        v_bindings = default_abduction_answer_filter(v_bindings, inference);
        if (ranking_fn.isFunctionSpec()) {
            v_bindings = Sort.sort(v_bindings, ranking_fn, (SubLObject)abduction.UNPROVIDED);
        }
        return Values.values(v_bindings, reason, inference);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/abduction.lisp", position = 3971L)
    public static SubLObject abduced_term_p(final SubLObject nat) {
        return cycl_utilities.nat_with_functor_p(nat, abduction.$const2$AbducedTermFn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/abduction.lisp", position = 4214L)
    public static SubLObject abduction_support_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(abduction.NIL != arguments.hl_support_p(v_object) && arguments.hl_support_module(v_object) == abduction.$kw3$ABDUCTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/abduction.lisp", position = 4346L)
    public static SubLObject abduction_supports(final SubLObject supports) {
        SubLObject abductions = (SubLObject)abduction.NIL;
        SubLObject cdolist_list_var = supports;
        SubLObject support = (SubLObject)abduction.NIL;
        support = cdolist_list_var.first();
        while (abduction.NIL != cdolist_list_var) {
            if (abduction.NIL != abduction_support_p(support)) {
                abductions = (SubLObject)ConsesLow.cons(support, abductions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        }
        return Sequences.nreverse(abductions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/abduction.lisp", position = 4615L)
    public static SubLObject proof_abductions(final SubLObject proof) {
        return abduction_supports(inference_datastructures_proof.all_proof_supports(proof));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/abduction.lisp", position = 4716L)
    public static SubLObject proof_abduced_support_ratio(final SubLObject proof) {
        final SubLObject total_support_count = Sequences.length(inference_datastructures_proof.all_proof_supports(proof));
        return (SubLObject)(total_support_count.isPositive() ? Numbers.divide(Sequences.length(proof_abductions(proof)), total_support_count) : abduction.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/abduction.lisp", position = 5005L)
    public static SubLObject inference_answer_justification_abductions(final SubLObject justification) {
        return abduction_supports(inference_datastructures_inference.inference_answer_justification_supports(justification));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/abduction.lisp", position = 5168L)
    public static SubLObject inference_answer_justification_abduction_count(final SubLObject justification) {
        return Sequences.length(inference_answer_justification_abductions(justification));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/abduction.lisp", position = 5329L)
    public static SubLObject inference_answer_minimal_abduction_count(final SubLObject inference_answer) {
        final SubLObject abduction_counts = Mapping.mapcar((SubLObject)abduction.$sym4$INFERENCE_ANSWER_JUSTIFICATION_ABDUCTION_COUNT, inference_datastructures_inference.inference_answer_justifications(inference_answer));
        return list_utilities.extremal(abduction_counts, Symbols.symbol_function((SubLObject)abduction.$sym5$_), (SubLObject)abduction.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/abduction.lisp", position = 5598L)
    public static SubLObject minimal_use_of_abduction_supports(final SubLObject result1, final SubLObject result2) {
        final SubLObject ab_supports1 = abduction_supports(conses_high.second(result1));
        final SubLObject ab_supports2 = abduction_supports(conses_high.second(result2));
        return Numbers.numLE(Sequences.length(ab_supports1), Sequences.length(ab_supports2));
    }
    
    public static SubLObject declare_abduction_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abduction", "default_abduction_inference_parameters", "DEFAULT-ABDUCTION-INFERENCE-PARAMETERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abduction", "default_abduction_answer_filter", "DEFAULT-ABDUCTION-ANSWER-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abduction", "cyc_abduction", "CYC-ABDUCTION", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abduction", "abduced_term_p", "ABDUCED-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abduction", "abduction_support_p", "ABDUCTION-SUPPORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abduction", "abduction_supports", "ABDUCTION-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abduction", "proof_abductions", "PROOF-ABDUCTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abduction", "proof_abduced_support_ratio", "PROOF-ABDUCED-SUPPORT-RATIO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abduction", "inference_answer_justification_abductions", "INFERENCE-ANSWER-JUSTIFICATION-ABDUCTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abduction", "inference_answer_justification_abduction_count", "INFERENCE-ANSWER-JUSTIFICATION-ABDUCTION-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abduction", "inference_answer_minimal_abduction_count", "INFERENCE-ANSWER-MINIMAL-ABDUCTION-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abduction", "minimal_use_of_abduction_supports", "MINIMAL-USE-OF-ABDUCTION-SUPPORTS", 2, 0, false);
        return (SubLObject)abduction.NIL;
    }
    
    public static SubLObject init_abduction_file() {
        abduction.$default_abductive_inference_properties$ = SubLFiles.defparameter("*DEFAULT-ABDUCTIVE-INFERENCE-PROPERTIES*", (SubLObject)abduction.$list0);
        return (SubLObject)abduction.NIL;
    }
    
    public static SubLObject setup_abduction_file() {
        return (SubLObject)abduction.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_abduction_file();
    }
    
    @Override
	public void initializeVariables() {
        init_abduction_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_abduction_file();
    }
    
    static {
        me = (SubLFile)new abduction();
        abduction.$default_abductive_inference_properties$ = null;
        $list0 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ABDUCTION-ALLOWED?"), abduction.T, SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), abduction.T, SubLObjectFactory.makeKeyword("RESULT-UNIQUENESS"), SubLObjectFactory.makeKeyword("PROOF"), SubLObjectFactory.makeKeyword("RETURN"), SubLObjectFactory.makeKeyword("BINDINGS-AND-SUPPORTS"), SubLObjectFactory.makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), abduction.T, SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), abduction.ONE_INTEGER, SubLObjectFactory.makeKeyword("MAX-NUMBER"), abduction.TEN_INTEGER, SubLObjectFactory.makeKeyword("MAX-TIME"), SubLObjectFactory.makeInteger(300), SubLObjectFactory.makeKeyword("BROWSABLE?"), abduction.T, SubLObjectFactory.makeKeyword("CONTINUABLE?"), abduction.T });
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDING-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS"));
        $const2$AbducedTermFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AbducedTermFn"));
        $kw3$ABDUCTION = SubLObjectFactory.makeKeyword("ABDUCTION");
        $sym4$INFERENCE_ANSWER_JUSTIFICATION_ABDUCTION_COUNT = SubLObjectFactory.makeSymbol("INFERENCE-ANSWER-JUSTIFICATION-ABDUCTION-COUNT");
        $sym5$_ = SubLObjectFactory.makeSymbol("<");
    }
}

/*

	Total time: 38 ms
	
*/