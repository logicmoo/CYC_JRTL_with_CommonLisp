package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.inference_completeness_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.inference.harness.inference_trivial;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_minimization extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_minimization();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_minimization";

    public static final String myFingerPrint = "4293429246dc9867d2d3d53382ff592b8783e3e55eb5227f53673eda04121a30";

    // defparameter
    private static final SubLSymbol $default_minimize_extent_cost$ = makeSymbol("*DEFAULT-MINIMIZE-EXTENT-COST*");

    // defparameter
    private static final SubLSymbol $default_completely_decidable_neg_cost$ = makeSymbol("*DEFAULT-COMPLETELY-DECIDABLE-NEG-COST*");

    private static final SubLObject $$unknownSentence = reader_make_constant_shell(makeString("unknownSentence"));





    private static final SubLSymbol $kw3$COMPLETENESS_MINIMIZATION_ALLOWED_ = makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?");



    private static final SubLFloat $float$1_5 = makeDouble(1.5);

    private static final SubLObject $$minimizeExtent = reader_make_constant_shell(makeString("minimizeExtent"));





    private static final SubLSymbol $REMOVAL_MINIMIZE_EXTENT = makeKeyword("REMOVAL-MINIMIZE-EXTENT");

    public static final SubLList $list10 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), cons(makeKeyword("FORT"), makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-MINIMIZE-EXTENT-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MINIMIZE-EXTENT-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MINIMIZE-EXTENT-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> . <fully bound>))\n    from (#$minimizeExtent <predicate>)\n    when negation-by-failure is enabled"), makeKeyword("EXAMPLE"), makeString("(#$not (#$citizens #$AbrahamLincoln #$France))\n    from (#$minimizeExtent #$citizens)") });

    private static final SubLSymbol $REMOVAL_COMPLETELY_DECIDABLE_NEG = makeKeyword("REMOVAL-COMPLETELY-DECIDABLE-NEG");

    public static final SubLList $list12 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), cons(makeKeyword("FORT"), makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-COMPLETELY-DECIDABLE-NEG-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-COMPLETELY-DECIDABLE-NEG-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-COMPLETELY-DECIDABLE-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> . <fully bound>))\n    from (#$completeExtentDecidable <predicate>)\n    or   (#$completeExtentDecidableForValueInArg <predicate> <fort> <argnum>"), makeKeyword("EXAMPLE"), makeString("(#$not (#$bordersOn #$Canada #$France))\n    from (#$completeExtentDecidable #$bordersOn)") });

    public static SubLObject make_minimization_support(final SubLObject minimized_sentence, final SubLObject mt) {
        final SubLObject sentence = make_unary_formula($$unknownSentence, minimized_sentence);
        return arguments.make_hl_support($MINIMIZE, sentence, mt, $TRUE_DEF);
    }

    public static SubLObject removal_completeness_minimization_allowedP() {
        final SubLObject store = inference_worker.currently_active_problem_store();
        if (NIL != store) {
            return inference_datastructures_problem_store.problem_store_completeness_minimization_allowedP(store);
        }
        return inference_trivial.current_query_property_lookup($kw3$COMPLETENESS_MINIMIZATION_ALLOWED_);
    }

    public static SubLObject removal_unprovable_negation(final SubLObject asent, final SubLObject mt, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject _prev_bind_0 = $negation_by_failure$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $complete_extent_minimization$.currentBinding(thread);
            final SubLObject _prev_bind_3 = inference_strategist.$recursive_queries_in_currently_active_problem_storeP$.currentBinding(thread);
            try {
                $negation_by_failure$.bind(NIL, thread);
                $complete_extent_minimization$.bind(NIL, thread);
                inference_strategist.$recursive_queries_in_currently_active_problem_storeP$.bind(NIL, thread);
                if ($UNKNOWN == ask_utilities.inference_literal_truth(asent, mt)) {
                    final SubLObject hl_support = make_minimization_support(asent, mt);
                    final SubLObject more_supports = list(assertion);
                    backward.removal_add_node(hl_support, NIL, more_supports);
                }
            } finally {
                inference_strategist.$recursive_queries_in_currently_active_problem_storeP$.rebind(_prev_bind_3, thread);
                $complete_extent_minimization$.rebind(_prev_bind_2, thread);
                $negation_by_failure$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject removal_minimize_extent_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL != inference_completeness_utilities.inference_minimize_extentP(cycl_utilities.atomic_sentence_predicate(asent))));
    }

    public static SubLObject removal_minimize_extent_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject pred_var = $$minimizeExtent;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, ONE_INTEGER, pred_var);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                        SubLObject done_var_$1 = NIL;
                        final SubLObject token_var_$2 = NIL;
                        while (NIL == done_var_$1) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                            final SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(assertion));
                            if (NIL != valid_$3) {
                                removal_unprovable_negation(asent, mt_relevance_macros.inference_relevant_mt(), assertion);
                            }
                            done_var_$1 = makeBoolean(NIL == valid_$3);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        return NIL;
    }

    public static SubLObject removal_completely_decidable_neg_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return makeBoolean((NIL != removal_completeness_minimization_allowedP()) && (NIL != inference_completeness_utilities.inference_completely_decidable_asentP(asent, mt_relevance_macros.inference_relevant_mt())));
    }

    public static SubLObject removal_completely_decidable_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject cdolist_list_var;
        final SubLObject complete_extent_assertions = cdolist_list_var = inference_completeness_utilities.inference_completely_decidable_asent_gafs(asent, mt_relevance_macros.inference_relevant_mt());
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            removal_unprovable_negation(asent, mt_relevance_macros.inference_relevant_mt(), assertion);
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject declare_removal_modules_minimization_file() {
        declareFunction(me, "make_minimization_support", "MAKE-MINIMIZATION-SUPPORT", 2, 0, false);
        declareFunction(me, "removal_completeness_minimization_allowedP", "REMOVAL-COMPLETENESS-MINIMIZATION-ALLOWED?", 0, 0, false);
        declareFunction(me, "removal_unprovable_negation", "REMOVAL-UNPROVABLE-NEGATION", 3, 0, false);
        declareFunction(me, "removal_minimize_extent_required", "REMOVAL-MINIMIZE-EXTENT-REQUIRED", 1, 1, false);
        declareFunction(me, "removal_minimize_extent_expand", "REMOVAL-MINIMIZE-EXTENT-EXPAND", 1, 1, false);
        declareFunction(me, "removal_completely_decidable_neg_required", "REMOVAL-COMPLETELY-DECIDABLE-NEG-REQUIRED", 1, 1, false);
        declareFunction(me, "removal_completely_decidable_neg_expand", "REMOVAL-COMPLETELY-DECIDABLE-NEG-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_minimization_file() {
        defparameter("*DEFAULT-MINIMIZE-EXTENT-COST*", $float$1_5);
        defparameter("*DEFAULT-COMPLETELY-DECIDABLE-NEG-COST*", $float$1_5);
        return NIL;
    }

    public static SubLObject setup_removal_modules_minimization_file() {
        inference_modules.inference_removal_module($REMOVAL_MINIMIZE_EXTENT, $list10);
        inference_modules.inference_removal_module($REMOVAL_COMPLETELY_DECIDABLE_NEG, $list12);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_minimization_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_minimization_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_minimization_file();
    }

    
}

/**
 * Total time: 46 ms
 */
