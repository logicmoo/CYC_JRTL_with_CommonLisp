/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.V12;
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


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-MODULES-MINIMIZATION
 * source file: /cyc/top/cycl/inference/modules/removal/removal-modules-minimization.lisp
 * created:     2019/07/03 17:37:44
 */
public final class removal_modules_minimization extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_minimization();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_minimization";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_minimize_extent_cost$ = makeSymbol("*DEFAULT-MINIMIZE-EXTENT-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_completely_decidable_neg_cost$ = makeSymbol("*DEFAULT-COMPLETELY-DECIDABLE-NEG-COST*");



    private static final SubLSymbol $kw3$COMPLETENESS_MINIMIZATION_ALLOWED_ = makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?");

    private static final SubLFloat $float$1_5 = makeDouble(1.5);



    private static final SubLSymbol $REMOVAL_MINIMIZE_EXTENT = makeKeyword("REMOVAL-MINIMIZE-EXTENT");

    static private final SubLList $list10 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), cons($FORT, makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-MINIMIZE-EXTENT-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MINIMIZE-EXTENT-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MINIMIZE-EXTENT-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> . <fully bound>))\n    from (#$minimizeExtent <predicate>)\n    when negation-by-failure is enabled"), makeKeyword("EXAMPLE"), makeString("(#$not (#$citizens #$AbrahamLincoln #$France))\n    from (#$minimizeExtent #$citizens)") });

    private static final SubLSymbol $REMOVAL_COMPLETELY_DECIDABLE_NEG = makeKeyword("REMOVAL-COMPLETELY-DECIDABLE-NEG");

    static private final SubLList $list12 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), cons($FORT, makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-COMPLETELY-DECIDABLE-NEG-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-COMPLETELY-DECIDABLE-NEG-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-COMPLETELY-DECIDABLE-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> . <fully bound>))\n    from (#$completeExtentDecidable <predicate>)\n    or   (#$completeExtentDecidableForValueInArg <predicate> <fort> <argnum>"), makeKeyword("EXAMPLE"), makeString("(#$not (#$bordersOn #$Canada #$France))\n    from (#$completeExtentDecidable #$bordersOn)") });

    // Definitions
    public static final SubLObject make_minimization_support_alt(SubLObject minimized_sentence, SubLObject mt) {
        {
            SubLObject sentence = make_unary_formula($$unknownSentence, minimized_sentence);
            return arguments.make_hl_support($MINIMIZE, sentence, mt, $TRUE_DEF);
        }
    }

    // Definitions
    public static SubLObject make_minimization_support(final SubLObject minimized_sentence, final SubLObject mt) {
        final SubLObject sentence = make_unary_formula($$unknownSentence, minimized_sentence);
        return arguments.make_hl_support($MINIMIZE, sentence, mt, $TRUE_DEF);
    }

    public static final SubLObject removal_completeness_minimization_allowedP_alt() {
        {
            SubLObject store = inference_worker.currently_active_problem_store();
            if (NIL != store) {
                return inference_datastructures_problem_store.problem_store_completeness_minimization_allowedP(store);
            } else {
                return inference_trivial.current_query_property_lookup($kw3$COMPLETENESS_MINIMIZATION_ALLOWED_);
            }
        }
    }

    public static SubLObject removal_completeness_minimization_allowedP() {
        final SubLObject store = inference_worker.currently_active_problem_store();
        if (NIL != store) {
            return inference_datastructures_problem_store.problem_store_completeness_minimization_allowedP(store);
        }
        return inference_trivial.current_query_property_lookup($kw3$COMPLETENESS_MINIMIZATION_ALLOWED_);
    }

    public static final SubLObject removal_unprovable_negation_alt(SubLObject asent, SubLObject mt, SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                {
                    SubLObject _prev_bind_0 = $negation_by_failure$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $complete_extent_minimization$.currentBinding(thread);
                    SubLObject _prev_bind_2 = ask_utilities.$recursive_queries_in_currently_active_problem_storeP$.currentBinding(thread);
                    try {
                        $negation_by_failure$.bind(NIL, thread);
                        $complete_extent_minimization$.bind(NIL, thread);
                        ask_utilities.$recursive_queries_in_currently_active_problem_storeP$.bind(NIL, thread);
                        if ($UNKNOWN == ask_utilities.inference_literal_truth(asent, mt)) {
                            {
                                SubLObject hl_support = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_minimization.make_minimization_support(asent, mt);
                                SubLObject more_supports = list(assertion);
                                backward.removal_add_node(hl_support, NIL, more_supports);
                            }
                        }
                    } finally {
                        ask_utilities.$recursive_queries_in_currently_active_problem_storeP$.rebind(_prev_bind_2, thread);
                        $complete_extent_minimization$.rebind(_prev_bind_1, thread);
                        $negation_by_failure$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
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

    public static final SubLObject removal_minimize_extent_required_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL != inference_completeness_utilities.inference_minimize_extentP(cycl_utilities.atomic_sentence_predicate(asent))));
        }
    }

    public static SubLObject removal_minimize_extent_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL != inference_completeness_utilities.inference_minimize_extentP(cycl_utilities.atomic_sentence_predicate(asent))));
    }

    public static final SubLObject removal_minimize_extent_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            SubLObject pred_var = $$minimizeExtent;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, ONE_INTEGER, pred_var)) {
                {
                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, ONE_INTEGER, pred_var);
                    SubLObject done_var = NIL;
                    SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        {
                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                            if (NIL != valid) {
                                {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                        {
                                            SubLObject done_var_1 = NIL;
                                            SubLObject token_var_2 = NIL;
                                            while (NIL == done_var_1) {
                                                {
                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_2);
                                                    SubLObject valid_3 = makeBoolean(token_var_2 != assertion);
                                                    if (NIL != valid_3) {
                                                        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_minimization.removal_unprovable_negation(asent, mt_relevance_macros.inference_relevant_mt(), assertion);
                                                    }
                                                    done_var_1 = makeBoolean(NIL == valid_3);
                                                }
                                            } 
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                            try {
                                                bind($is_thread_performing_cleanupP$, T);
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                            } finally {
                                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                            }
                                        }
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                    } 
                }
            }
        }
        return NIL;
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

    public static final SubLObject removal_completely_decidable_neg_required_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return makeBoolean((NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_minimization.removal_completeness_minimization_allowedP()) && (NIL != inference_completeness_utilities.inference_completely_decidable_asentP(asent, mt_relevance_macros.inference_relevant_mt())));
    }

    public static SubLObject removal_completely_decidable_neg_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return makeBoolean((NIL != removal_completeness_minimization_allowedP()) && (NIL != inference_completeness_utilities.inference_completely_decidable_asentP(asent, mt_relevance_macros.inference_relevant_mt())));
    }

    public static final SubLObject removal_completely_decidable_neg_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject complete_extent_assertions = inference_completeness_utilities.inference_completely_decidable_asent_gafs(asent, mt_relevance_macros.inference_relevant_mt());
            SubLObject cdolist_list_var = complete_extent_assertions;
            SubLObject assertion = NIL;
            for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_minimization.removal_unprovable_negation(asent, mt_relevance_macros.inference_relevant_mt(), assertion);
            }
        }
        return NIL;
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
        defparameter("*DEFAULT-MINIMIZE-EXTENT-COST*", $float$1_5);
        defparameter("*DEFAULT-COMPLETELY-DECIDABLE-NEG-COST*", $float$1_5);
        return NIL;
    }

    static private final SubLList $list_alt10 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), cons($FORT, makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-MINIMIZE-EXTENT-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MINIMIZE-EXTENT-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MINIMIZE-EXTENT-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> . <fully bound>))\n    from (#$minimizeExtent <predicate>)\n    when negation-by-failure is enabled"), makeKeyword("EXAMPLE"), makeString("(#$not (#$citizens #$AbrahamLincoln #$France))\n    from (#$minimizeExtent #$citizens)") });

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
    }

    static private final SubLList $list_alt12 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), cons($FORT, makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-COMPLETELY-DECIDABLE-NEG-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-COMPLETELY-DECIDABLE-NEG-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-COMPLETELY-DECIDABLE-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> . <fully bound>))\n    from (#$completeExtentDecidable <predicate>)\n    or   (#$completeExtentDecidableForValueInArg <predicate> <fort> <argnum>"), makeKeyword("EXAMPLE"), makeString("(#$not (#$bordersOn #$Canada #$France))\n    from (#$completeExtentDecidable #$bordersOn)") });
}

/**
 * Total time: 46 ms
 */
