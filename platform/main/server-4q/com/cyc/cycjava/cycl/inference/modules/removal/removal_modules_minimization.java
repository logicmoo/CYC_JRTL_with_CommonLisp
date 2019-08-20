package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_minimization extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "4293429246dc9867d2d3d53382ff592b8783e3e55eb5227f53673eda04121a30";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-minimization.lisp", position = 2600L)
    private static SubLSymbol $default_minimize_extent_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-minimization.lisp", position = 4100L)
    private static SubLSymbol $default_completely_decidable_neg_cost$;
    private static SubLObject $$unknownSentence;
    private static SubLSymbol $MINIMIZE;
    private static SubLSymbol $TRUE_DEF;
    private static SubLSymbol $COMPLETENESS_MINIMIZATION_ALLOWED_;
    private static SubLSymbol $UNKNOWN;
    private static SubLFloat $float$1_5;
    private static SubLObject $$minimizeExtent;
    private static SubLSymbol $GAF;
    private static SubLSymbol $TRUE;
    private static SubLSymbol $REMOVAL_MINIMIZE_EXTENT;
    private static SubLList $list10;
    private static SubLSymbol $REMOVAL_COMPLETELY_DECIDABLE_NEG;
    private static SubLList $list12;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-minimization.lisp", position = 900L)
    public static SubLObject make_minimization_support(SubLObject minimized_sentence, SubLObject mt) {
        SubLObject sentence = el_utilities.make_unary_formula($$unknownSentence, minimized_sentence);
        return arguments.make_hl_support($MINIMIZE, sentence, mt, $TRUE_DEF);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-minimization.lisp", position = 1100L)
    public static SubLObject removal_completeness_minimization_allowedP() {
        SubLObject store = inference_worker.currently_active_problem_store();
        if (NIL != store) {
            return inference_datastructures_problem_store.problem_store_completeness_minimization_allowedP(store);
        }
        return inference_trivial.current_query_property_lookup($COMPLETENESS_MINIMIZATION_ALLOWED_);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-minimization.lisp", position = 1400L)
    public static SubLObject removal_unprovable_negation(SubLObject asent, SubLObject mt, SubLObject assertion) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
            SubLObject _prev_bind_0 = control_vars.$negation_by_failure$.currentBinding(thread);
            SubLObject _prev_bind_2 = control_vars.$complete_extent_minimization$.currentBinding(thread);
            SubLObject _prev_bind_3 = inference_strategist.$recursive_queries_in_currently_active_problem_storeP$.currentBinding(thread);
            try {
                control_vars.$negation_by_failure$.bind(NIL, thread);
                control_vars.$complete_extent_minimization$.bind(NIL, thread);
                inference_strategist.$recursive_queries_in_currently_active_problem_storeP$.bind(NIL, thread);
                if ($UNKNOWN == ask_utilities.inference_literal_truth(asent, mt)) {
                    SubLObject hl_support = make_minimization_support(asent, mt);
                    SubLObject more_supports = list(assertion);
                    backward.removal_add_node(hl_support, NIL, more_supports);
                }
            } finally {
                inference_strategist.$recursive_queries_in_currently_active_problem_storeP$.rebind(_prev_bind_3, thread);
                control_vars.$complete_extent_minimization$.rebind(_prev_bind_2, thread);
                control_vars.$negation_by_failure$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-minimization.lisp", position = 2300L)
    public static SubLObject removal_minimize_extent_required(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && NIL != inference_completeness_utilities.inference_minimize_extentP(cycl_utilities.atomic_sentence_predicate(asent)));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-minimization.lisp", position = 2700L)
    public static SubLObject removal_minimize_extent_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject pred_var = $$minimizeExtent;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, ONE_INTEGER, pred_var)) {
            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, ONE_INTEGER, pred_var);
            SubLObject done_var = NIL;
            SubLObject token_var = NIL;
            while (NIL == done_var) {
                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                        SubLObject done_var_$1 = NIL;
                        SubLObject token_var_$2 = NIL;
                        while (NIL == done_var_$1) {
                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                            SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(assertion));
                            if (NIL != valid_$3) {
                                removal_unprovable_negation(asent, mt_relevance_macros.inference_relevant_mt(), assertion);
                            }
                            done_var_$1 = makeBoolean(NIL == valid_$3);
                        }
                    } finally {
                        SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                            SubLObject _values = Values.getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        } finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-minimization.lisp", position = 3600L)
    public static SubLObject removal_completely_decidable_neg_required(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return makeBoolean(NIL != removal_completeness_minimization_allowedP() && NIL != inference_completeness_utilities.inference_completely_decidable_asentP(asent, mt_relevance_macros.inference_relevant_mt()));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-minimization.lisp", position = 4100L)
    public static SubLObject removal_completely_decidable_neg_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject cdolist_list_var;
        SubLObject complete_extent_assertions = cdolist_list_var = inference_completeness_utilities.inference_completely_decidable_asent_gafs(asent, mt_relevance_macros.inference_relevant_mt());
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
        declareFunction("make_minimization_support", "MAKE-MINIMIZATION-SUPPORT", 2, 0, false);
        declareFunction("removal_completeness_minimization_allowedP", "REMOVAL-COMPLETENESS-MINIMIZATION-ALLOWED?", 0, 0, false);
        declareFunction("removal_unprovable_negation", "REMOVAL-UNPROVABLE-NEGATION", 3, 0, false);
        declareFunction("removal_minimize_extent_required", "REMOVAL-MINIMIZE-EXTENT-REQUIRED", 1, 1, false);
        declareFunction("removal_minimize_extent_expand", "REMOVAL-MINIMIZE-EXTENT-EXPAND", 1, 1, false);
        declareFunction("removal_completely_decidable_neg_required", "REMOVAL-COMPLETELY-DECIDABLE-NEG-REQUIRED", 1, 1, false);
        declareFunction("removal_completely_decidable_neg_expand", "REMOVAL-COMPLETELY-DECIDABLE-NEG-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_minimization_file() {
        $default_minimize_extent_cost$ = defparameter("*DEFAULT-MINIMIZE-EXTENT-COST*", $float$1_5);
        $default_completely_decidable_neg_cost$ = defparameter("*DEFAULT-COMPLETELY-DECIDABLE-NEG-COST*", $float$1_5);
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

    static {
        me = new removal_modules_minimization();
        $default_minimize_extent_cost$ = null;
        $default_completely_decidable_neg_cost$ = null;
        $$unknownSentence = makeConstSym(("unknownSentence"));
        $MINIMIZE = makeKeyword("MINIMIZE");
        $TRUE_DEF = makeKeyword("TRUE-DEF");
        $COMPLETENESS_MINIMIZATION_ALLOWED_ = makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?");
        $UNKNOWN = makeKeyword("UNKNOWN");
        $float$1_5 = makeDouble(1.5);
        $$minimizeExtent = makeConstSym(("minimizeExtent"));
        $GAF = makeKeyword("GAF");
        $TRUE = makeKeyword("TRUE");
        $REMOVAL_MINIMIZE_EXTENT = makeKeyword("REMOVAL-MINIMIZE-EXTENT");
        $list10 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), cons(makeKeyword("FORT"), makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-MINIMIZE-EXTENT-REQUIRED"),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MINIMIZE-EXTENT-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MINIMIZE-EXTENT-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (<predicate> . <fully bound>))\n    from (#$minimizeExtent <predicate>)\n    when negation-by-failure is enabled"), makeKeyword("EXAMPLE"), makeString("(#$not (#$citizens #$AbrahamLincoln #$France))\n    from (#$minimizeExtent #$citizens)") });
        $REMOVAL_COMPLETELY_DECIDABLE_NEG = makeKeyword("REMOVAL-COMPLETELY-DECIDABLE-NEG");
        $list12 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), cons(makeKeyword("FORT"), makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-COMPLETELY-DECIDABLE-NEG-REQUIRED"),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-COMPLETELY-DECIDABLE-NEG-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-COMPLETELY-DECIDABLE-NEG-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (<predicate> . <fully bound>))\n    from (#$completeExtentDecidable <predicate>)\n    or   (#$completeExtentDecidableForValueInArg <predicate> <fort> <argnum>"), makeKeyword("EXAMPLE"),
                makeString("(#$not (#$bordersOn #$Canada #$France))\n    from (#$completeExtentDecidable #$bordersOn)") });
    }
}
/*
 *
 * Total time: 46 ms
 *
 */