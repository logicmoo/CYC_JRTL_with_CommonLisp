package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$cache_inference_results$;
import static com.cyc.cycjava.cycl.control_vars.$negation_by_failure$;
import static com.cyc.cycjava.cycl.control_vars.$record_inconsistent_support_sets$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.conflicts;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.prove;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_consistent extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_consistent();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_consistent";

    public static final String myFingerPrint = "62f538f66c6010f9351e7722e22ebf103ecdd3f36c1440fc3b3206ba8eb31281";

    // deflexical
    private static final SubLSymbol $default_removal_consistent_check_cost$ = makeSymbol("*DEFAULT-REMOVAL-CONSISTENT-CHECK-COST*");

    private static final SubLObject $$consistent = reader_make_constant_shell(makeString("consistent"));





    private static final SubLSymbol $REMOVAL_CONSISTENT_POS = makeKeyword("REMOVAL-CONSISTENT-POS");

    private static final SubLList $list4 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("consistent")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("consistent")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("EL-FORMULA-P")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REMOVAL-CONSISTENT-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-CONSISTENT-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$consistent <fully-bound>)\nby hypothesizing the formula and checking for lack of a contradiction"), makeKeyword("EXAMPLE"), makeString("(#$consistent (#$languagesSpokenHere #$Texas-State #$SpanishLanguage))") });

    private static final SubLFloat $float$1_5 = makeDouble(1.5);

    private static final SubLObject $$thereExists = reader_make_constant_shell(makeString("thereExists"));



    private static final SubLSymbol $REMOVAL_CONSISTENT_NEG = makeKeyword("REMOVAL-CONSISTENT-NEG");

    private static final SubLList $list9 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("consistent")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("consistent")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("EL-FORMULA-P")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REMOVAL-CONSISTENT-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-CONSISTENT-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$consistent <fully-bound>))\nby hypothesizing the formula and checking for a contradiction"), makeKeyword("EXAMPLE"), makeString("(#$not (#$consistent (#$bordersOn #$Canada #$Canada)))") });

    public static SubLObject removal_consistent_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current_mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        final SubLObject formula = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject consistent = inference_consistent_check(formula, current_mt);
        if (NIL != consistent) {
            final SubLObject hl_support = arguments.make_hl_support($CONSISTENT, asent, UNPROVIDED, UNPROVIDED);
            backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject inference_consistent_check(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hypothetical_mt = NIL;
        SubLObject hypothesized_bindings = NIL;
        SubLObject done = NIL;
        SubLObject v_answer = NIL;
        try {
            if (NIL == done) {
                final SubLObject _prev_bind_0 = $negation_by_failure$.currentBinding(thread);
                try {
                    $negation_by_failure$.bind(NIL, thread);
                    final SubLObject positive_result = ask_utilities.inference_recursive_query(formula, mt, UNPROVIDED);
                    if (NIL != list_utilities.sublisp_boolean(positive_result)) {
                        v_answer = T;
                        done = T;
                    }
                } finally {
                    $negation_by_failure$.rebind(_prev_bind_0, thread);
                }
            }
            if ((NIL == done) && (NIL == list_utilities.tree_find($$thereExists, formula, UNPROVIDED, UNPROVIDED))) {
                final SubLObject negated_formula = cycl_utilities.negate(formula);
                final SubLObject _prev_bind_2 = $negation_by_failure$.currentBinding(thread);
                try {
                    $negation_by_failure$.bind(NIL, thread);
                    final SubLObject negated_result = ask_utilities.inference_recursive_query(negated_formula, mt, UNPROVIDED);
                    if (NIL != list_utilities.sublisp_boolean(negated_result)) {
                        inference_note_inconsistent_supports(formula, mt, second(negated_result.first()));
                        v_answer = NIL;
                        done = T;
                    }
                } finally {
                    $negation_by_failure$.rebind(_prev_bind_2, thread);
                }
            }
            if (NIL == done) {
                hypothetical_mt = prove.hypothesize_spec_mt(mt, UNPROVIDED);
                hypothesized_bindings = prove.fi_hypothesize_int(formula, hypothetical_mt, UNPROVIDED, UNPROVIDED);
                v_answer = list_utilities.sublisp_boolean(hypothesized_bindings);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if ((NIL != hypothesized_bindings) && (NIL == bindings.unification_success_token_p(hypothesized_bindings))) {
                    SubLObject cdolist_list_var = hypothesized_bindings;
                    SubLObject binding = NIL;
                    binding = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject hypothetical_term = bindings.variable_binding_value(binding);
                        if (NIL != forts.fort_p(hypothetical_term)) {
                            fi.fi_kill_int(hypothetical_term);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        binding = cdolist_list_var.first();
                    } 
                }
                if ((NIL != hypothetical_mt) && (NIL != forts.fort_p(hlmt.hlmt_monad_mt(hypothetical_mt)))) {
                    fi.fi_kill_int(hlmt.hlmt_monad_mt(hypothetical_mt));
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return v_answer;
    }

    public static SubLObject inference_note_inconsistent_supports(final SubLObject formula, final SubLObject mt, final SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $record_inconsistent_support_sets$.getDynamicValue(thread)) {
            final SubLObject support = arguments.make_hl_support($QUERY, formula, mt, UNPROVIDED);
            conflicts.add_inconsistent_support_set(cons(support, supports));
        }
        return NIL;
    }

    public static SubLObject removal_consistent_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current_mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        final SubLObject formula = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject inconsistent = inference_inconsistent_check(formula, current_mt);
        if (NIL != inconsistent) {
            backward.removal_add_node(arguments.make_hl_support($CONSISTENT, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject inference_inconsistent_check(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hypothetical_mt = NIL;
        SubLObject hypothesized_bindings = NIL;
        SubLObject done = NIL;
        SubLObject v_answer = NIL;
        try {
            if (NIL == done) {
                final SubLObject _prev_bind_0 = $negation_by_failure$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $cache_inference_results$.currentBinding(thread);
                try {
                    $negation_by_failure$.bind(NIL, thread);
                    $cache_inference_results$.bind(NIL, thread);
                    final SubLObject positive_result = ask_utilities.inference_recursive_query(formula, mt, UNPROVIDED);
                    if (NIL != list_utilities.sublisp_boolean(positive_result)) {
                        v_answer = NIL;
                        done = T;
                    }
                } finally {
                    $cache_inference_results$.rebind(_prev_bind_2, thread);
                    $negation_by_failure$.rebind(_prev_bind_0, thread);
                }
            }
            if ((NIL == done) && (NIL == list_utilities.tree_find($$thereExists, formula, UNPROVIDED, UNPROVIDED))) {
                final SubLObject negated_formula = cycl_utilities.negate(formula);
                final SubLObject _prev_bind_3 = $negation_by_failure$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $cache_inference_results$.currentBinding(thread);
                try {
                    $negation_by_failure$.bind(NIL, thread);
                    $cache_inference_results$.bind(NIL, thread);
                    final SubLObject negated_result = ask_utilities.inference_recursive_query(negated_formula, mt, UNPROVIDED);
                    if (NIL != list_utilities.sublisp_boolean(negated_result)) {
                        inference_note_inconsistent_supports(formula, mt, second(negated_result.first()));
                        v_answer = T;
                        done = T;
                    }
                } finally {
                    $cache_inference_results$.rebind(_prev_bind_4, thread);
                    $negation_by_failure$.rebind(_prev_bind_3, thread);
                }
            }
            if (NIL == done) {
                hypothetical_mt = prove.hypothesize_spec_mt(mt, UNPROVIDED);
                hypothesized_bindings = prove.fi_hypothesize_int(formula, hypothetical_mt, UNPROVIDED, UNPROVIDED);
                v_answer = makeBoolean(NIL == list_utilities.sublisp_boolean(hypothesized_bindings));
            }
        } finally {
            final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if ((NIL != hypothesized_bindings) && (NIL == bindings.unification_success_token_p(hypothesized_bindings))) {
                    SubLObject cdolist_list_var = hypothesized_bindings;
                    SubLObject binding = NIL;
                    binding = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject hypothetical_term = bindings.variable_binding_value(binding);
                        if (NIL != forts.fort_p(hypothetical_term)) {
                            fi.fi_kill_int(hypothetical_term);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        binding = cdolist_list_var.first();
                    } 
                }
                if ((NIL != hypothetical_mt) && (NIL != forts.fort_p(hlmt.hlmt_monad_mt(hypothetical_mt)))) {
                    fi.fi_kill_int(hlmt.hlmt_monad_mt(hypothetical_mt));
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        return v_answer;
    }

    public static SubLObject declare_removal_modules_consistent_file() {
        declareFunction(me, "removal_consistent_pos_expand", "REMOVAL-CONSISTENT-POS-EXPAND", 1, 1, false);
        declareFunction(me, "inference_consistent_check", "INFERENCE-CONSISTENT-CHECK", 2, 0, false);
        declareFunction(me, "inference_note_inconsistent_supports", "INFERENCE-NOTE-INCONSISTENT-SUPPORTS", 3, 0, false);
        declareFunction(me, "removal_consistent_neg_expand", "REMOVAL-CONSISTENT-NEG-EXPAND", 1, 1, false);
        declareFunction(me, "inference_inconsistent_check", "INFERENCE-INCONSISTENT-CHECK", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_consistent_file() {
        deflexical("*DEFAULT-REMOVAL-CONSISTENT-CHECK-COST*", $float$1_5);
        return NIL;
    }

    public static SubLObject setup_removal_modules_consistent_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$consistent);
        preference_modules.doomed_unless_all_args_bindable($BOTH, $$consistent);
        inference_modules.inference_removal_module($REMOVAL_CONSISTENT_POS, $list4);
        inference_modules.inference_removal_module($REMOVAL_CONSISTENT_NEG, $list9);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_consistent_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_consistent_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_consistent_file();
    }

    
}

/**
 * Total time: 79 ms
 */
