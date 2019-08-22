package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numLE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class abduction extends SubLTranslatedFile {
    public static final SubLFile me = new abduction();

    public static final String myName = "com.cyc.cycjava.cycl.abduction";

    public static final String myFingerPrint = "f46516c715c42045f30e3a9f91cc213d6dbe01d67b1974e99fdc221b1613b790";

    // defparameter
    // Definitions
    private static final SubLSymbol $default_abductive_inference_properties$ = makeSymbol("*DEFAULT-ABDUCTIVE-INFERENCE-PROPERTIES*");

    // Internal Constants
    public static final SubLList $list0 = list(new SubLObject[]{ makeKeyword("ABDUCTION-ALLOWED?"), T, makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), T, makeKeyword("RESULT-UNIQUENESS"), makeKeyword("PROOF"), makeKeyword("RETURN"), makeKeyword("BINDINGS-AND-SUPPORTS"), makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), T, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER, makeKeyword("MAX-NUMBER"), TEN_INTEGER, makeKeyword("MAX-TIME"), makeInteger(300), makeKeyword("BROWSABLE?"), T, makeKeyword("CONTINUABLE?"), T });

    public static final SubLList $list1 = list(makeSymbol("BINDING-LIST"), makeSymbol("SUPPORTS"));

    private static final SubLObject $$AbducedTermFn = reader_make_constant_shell(makeString("AbducedTermFn"));



    public static final SubLSymbol INFERENCE_ANSWER_JUSTIFICATION_ABDUCTION_COUNT = makeSymbol("INFERENCE-ANSWER-JUSTIFICATION-ABDUCTION-COUNT");

    public static final SubLSymbol $sym5$_ = makeSymbol("<");

    public static SubLObject default_abduction_inference_parameters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return copy_list($default_abductive_inference_properties$.getDynamicValue(thread));
    }

    public static SubLObject default_abduction_answer_filter(final SubLObject v_bindings, final SubLObject inference) {
        final SubLObject query = inference_datastructures_problem_query.single_literal_problem_query_atomic_sentence(inference_datastructures_inference.inference_hl_query(inference));
        SubLObject good_bindings = NIL;
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = binding;
            SubLObject binding_list = NIL;
            SubLObject supports = NIL;
            destructuring_bind_must_consp(current, datum, $list1);
            binding_list = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list1);
            supports = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != list_utilities.singletonP(supports)) {
                    final SubLObject v_abduction = supports.first();
                    final SubLObject sentence = arguments.support_sentence(v_abduction);
                    if (NIL == unification_utilities.asent_unify(query, sentence, UNPROVIDED, UNPROVIDED)) {
                        good_bindings = cons(binding, good_bindings);
                    }
                } else {
                    good_bindings = cons(binding, good_bindings);
                }
            } else {
                cdestructuring_bind_error(datum, $list1);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        return nreverse(good_bindings);
    }

    public static SubLObject cyc_abduction(final SubLObject formula, final SubLObject mt, SubLObject v_inference_parameters, SubLObject ranking_fn, SubLObject type_check_enabled) {
        if (v_inference_parameters == UNPROVIDED) {
            v_inference_parameters = NIL;
        }
        if (ranking_fn == UNPROVIDED) {
            ranking_fn = NIL;
        }
        if (type_check_enabled == UNPROVIDED) {
            type_check_enabled = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_properties = list_utilities.nmerge_plist(default_abduction_inference_parameters(), v_inference_parameters);
        SubLObject v_bindings = NIL;
        SubLObject reason = NIL;
        SubLObject inference = NIL;
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
        } finally {
            inference_worker_transformation.$inference_transformation_type_checking_enabledP$.rebind(_prev_bind_0, thread);
        }
        v_bindings = default_abduction_answer_filter(v_bindings, inference);
        if (ranking_fn.isFunctionSpec()) {
            v_bindings = Sort.sort(v_bindings, ranking_fn, UNPROVIDED);
        }
        return values(v_bindings, reason, inference);
    }

    public static SubLObject abduced_term_p(final SubLObject nat) {
        return cycl_utilities.nat_with_functor_p(nat, $$AbducedTermFn);
    }

    public static SubLObject abduction_support_p(final SubLObject v_object) {
        return makeBoolean((NIL != arguments.hl_support_p(v_object)) && (arguments.hl_support_module(v_object) == $ABDUCTION));
    }

    public static SubLObject abduction_supports(final SubLObject supports) {
        SubLObject abductions = NIL;
        SubLObject cdolist_list_var = supports;
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != abduction_support_p(support)) {
                abductions = cons(support, abductions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        } 
        return nreverse(abductions);
    }

    public static SubLObject proof_abductions(final SubLObject proof) {
        return abduction_supports(inference_datastructures_proof.all_proof_supports(proof));
    }

    public static SubLObject proof_abduced_support_ratio(final SubLObject proof) {
        final SubLObject total_support_count = length(inference_datastructures_proof.all_proof_supports(proof));
        return total_support_count.isPositive() ? divide(length(proof_abductions(proof)), total_support_count) : ZERO_INTEGER;
    }

    public static SubLObject inference_answer_justification_abductions(final SubLObject justification) {
        return abduction_supports(inference_datastructures_inference.inference_answer_justification_supports(justification));
    }

    public static SubLObject inference_answer_justification_abduction_count(final SubLObject justification) {
        return length(inference_answer_justification_abductions(justification));
    }

    public static SubLObject inference_answer_minimal_abduction_count(final SubLObject inference_answer) {
        final SubLObject abduction_counts = Mapping.mapcar(INFERENCE_ANSWER_JUSTIFICATION_ABDUCTION_COUNT, inference_datastructures_inference.inference_answer_justifications(inference_answer));
        return list_utilities.extremal(abduction_counts, symbol_function($sym5$_), UNPROVIDED);
    }

    public static SubLObject minimal_use_of_abduction_supports(final SubLObject result1, final SubLObject result2) {
        final SubLObject ab_supports1 = abduction_supports(second(result1));
        final SubLObject ab_supports2 = abduction_supports(second(result2));
        return numLE(length(ab_supports1), length(ab_supports2));
    }

    public static SubLObject declare_abduction_file() {
        declareFunction(me, "default_abduction_inference_parameters", "DEFAULT-ABDUCTION-INFERENCE-PARAMETERS", 0, 0, false);
        declareFunction(me, "default_abduction_answer_filter", "DEFAULT-ABDUCTION-ANSWER-FILTER", 2, 0, false);
        declareFunction(me, "cyc_abduction", "CYC-ABDUCTION", 2, 3, false);
        declareFunction(me, "abduced_term_p", "ABDUCED-TERM-P", 1, 0, false);
        declareFunction(me, "abduction_support_p", "ABDUCTION-SUPPORT-P", 1, 0, false);
        declareFunction(me, "abduction_supports", "ABDUCTION-SUPPORTS", 1, 0, false);
        declareFunction(me, "proof_abductions", "PROOF-ABDUCTIONS", 1, 0, false);
        declareFunction(me, "proof_abduced_support_ratio", "PROOF-ABDUCED-SUPPORT-RATIO", 1, 0, false);
        declareFunction(me, "inference_answer_justification_abductions", "INFERENCE-ANSWER-JUSTIFICATION-ABDUCTIONS", 1, 0, false);
        declareFunction(me, "inference_answer_justification_abduction_count", "INFERENCE-ANSWER-JUSTIFICATION-ABDUCTION-COUNT", 1, 0, false);
        declareFunction(me, "inference_answer_minimal_abduction_count", "INFERENCE-ANSWER-MINIMAL-ABDUCTION-COUNT", 1, 0, false);
        declareFunction(me, "minimal_use_of_abduction_supports", "MINIMAL-USE-OF-ABDUCTION-SUPPORTS", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_abduction_file() {
        defparameter("*DEFAULT-ABDUCTIVE-INFERENCE-PROPERTIES*", $list0);
        return NIL;
    }

    public static SubLObject setup_abduction_file() {
        return NIL;
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

    
}

/**
 * Total time: 38 ms
 */
