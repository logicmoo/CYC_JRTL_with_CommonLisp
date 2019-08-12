/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.cycl_utilities.*;
import static com.cyc.cycjava.cycl.list_utilities.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.inference_completeness_utilities;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-MODULES-LOOKUP
 * source file: /cyc/top/cycl/inference/modules/removal/removal-modules-lookup.lisp
 * created:     2019/07/03 17:37:44
 */
public final class removal_modules_lookup extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_lookup();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lookup";


    private static final SubLSymbol $REMOVAL_LOOKUP_POS = makeKeyword("REMOVAL-LOOKUP-POS");

    static private final SubLList $list6 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), cons($FORT, makeKeyword("ANYTHING")), $COST, makeSymbol("REMOVAL-LOOKUP-POS-COST"), makeKeyword("COMPLETE-PATTERN"), list($TEST, makeSymbol("REMOVAL-COMPLETELY-ASSERTED-ASENT?")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-LOOKUP-POS-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list($CALL, makeSymbol("GAF-FORMULA"), makeKeyword("INPUT")), makeKeyword("SUPPORT-PATTERN"), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(<fort> . <whatever>)\nusing true assertions and GAF indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$bordersOn #$UnitedStatesOfAmerica ?COUNTRY)\n (#$bordersOn #$UnitedStatesOfAmerica #$Canada)\n (#$resultIsa #$JuvenileFn #$JuvenileAnimal)") });

    private static final SubLSymbol $REMOVAL_LOOKUP_NEG = makeKeyword("REMOVAL-LOOKUP-NEG");

    static private final SubLList $list11 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), cons($FORT, makeKeyword("ANYTHING")), $COST, makeSymbol("REMOVAL-LOOKUP-NEG-COST"), makeKeyword("COMPLETENESS-PATTERN"), list($CALL, makeSymbol("REMOVAL-LOOKUP-NEG-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-LOOKUP-NEG-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list($CALL, makeSymbol("GAF-FORMULA"), makeKeyword("INPUT")), makeKeyword("SUPPORT-PATTERN"), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> . <whatever>))\nusing false assertions and GAF indexing in the KB") });



    private static final SubLSymbol $REMOVAL_PRED_UNBOUND = makeKeyword("REMOVAL-PRED-UNBOUND");

    static private final SubLList $list15 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), cons(list(makeKeyword("NOT"), $FORT), makeKeyword("ANYTHING")), list($TEST, makeSymbol("FORMULA-CONTAINS-INDEXED-TERM?"))), $COST, makeSymbol("REMOVAL-PRED-UNBOUND-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-PRED-UNBOUND-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list($CALL, makeSymbol("GAF-FORMULA"), makeKeyword("INPUT")), makeKeyword("SUPPORT-PATTERN"), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(<variable> ... <fort> ... )\nusing true assertions and GAF indexing on <fort>.\nThis is a last-resort if <variable> occurs elsewhere."), makeKeyword("EXAMPLE"), makeString("(?PREDICATE #$UnitedStatesOfAmerica #$Canada)") });

    private static final SubLSymbol $PRED_UNBOUND_POS = makeKeyword("PRED-UNBOUND-POS");

    static private final SubLList $list17 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), cons(makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE"), makeSymbol("PRED-UNBOUND-POS-PREFERENCE"));

    // Definitions
    public static final SubLObject removal_lookup_pos_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != variables.fully_bound_p(asent)) {
            return $cheap_hl_module_check_cost$.getGlobalValue();
        } else {
            return inference_trampolines.inference_num_gaf_lookup_index(asent, $POS);
        }
    }

    // Definitions
    public static SubLObject removal_lookup_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != variables.fully_bound_p(asent)) {
            return $cheap_hl_module_check_cost$.getGlobalValue();
        }
        return inference_trampolines.inference_num_gaf_lookup_index(asent, $POS);
    }

    public static final SubLObject removal_completely_asserted_asentP_alt(SubLObject asent) {
        return inference_completeness_utilities.inference_completely_asserted_asentP(asent, mt_relevance_macros.inference_relevant_mt());
    }

    public static SubLObject removal_completely_asserted_asentP(final SubLObject asent) {
        return makeBoolean((NIL != inference_completeness_utilities.inference_completely_asserted_asentP(asent, mt_relevance_macros.inference_relevant_mt())) && (NIL == kb_utilities.at_least_partially_commutative_predicate_p(cycl_utilities.atomic_sentence_predicate(asent))));
    }

    public static final SubLObject removal_lookup_pos_iterator_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(asent, $POS);
                SubLObject method = kb_mapping_macros.do_gli_extract_method(l_index);
                SubLObject pcase_var = method;
                if (pcase_var.eql($GAF_ARG)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                        SubLObject argnum = thread.secondMultipleValue();
                        SubLObject predicate = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != argnum) {
                            if (NIL != predicate) {
                                {
                                    SubLObject pred_var = predicate;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
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
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                {
                                                                    SubLObject done_var_1 = NIL;
                                                                    SubLObject token_var_2 = NIL;
                                                                    while (NIL == done_var_1) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_2);
                                                                            SubLObject valid_3 = makeBoolean(token_var_2 != assertion);
                                                                            if (NIL != valid_3) {
                                                                                if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                                    if (NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                                                                        result = cons(assertion, result);
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_1 = makeBoolean(NIL == valid_3);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
                            } else {
                                {
                                    SubLObject pred_var = NIL;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
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
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                {
                                                                    SubLObject done_var_4 = NIL;
                                                                    SubLObject token_var_5 = NIL;
                                                                    while (NIL == done_var_4) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_5);
                                                                            SubLObject valid_6 = makeBoolean(token_var_5 != assertion);
                                                                            if (NIL != valid_6) {
                                                                                if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                                    if (NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                                                                        result = cons(assertion, result);
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_4 = makeBoolean(NIL == valid_6);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
                            }
                        } else {
                            if (NIL != predicate) {
                                {
                                    SubLObject pred_var = predicate;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
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
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                {
                                                                    SubLObject done_var_7 = NIL;
                                                                    SubLObject token_var_8 = NIL;
                                                                    while (NIL == done_var_7) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_8);
                                                                            SubLObject valid_9 = makeBoolean(token_var_8 != assertion);
                                                                            if (NIL != valid_9) {
                                                                                if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                                    if (NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                                                                        result = cons(assertion, result);
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_7 = makeBoolean(NIL == valid_9);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
                            } else {
                                {
                                    SubLObject pred_var = NIL;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
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
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                {
                                                                    SubLObject done_var_10 = NIL;
                                                                    SubLObject token_var_11 = NIL;
                                                                    while (NIL == done_var_10) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_11);
                                                                            SubLObject valid_12 = makeBoolean(token_var_11 != assertion);
                                                                            if (NIL != valid_12) {
                                                                                if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                                    if (NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                                                                        result = cons(assertion, result);
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_10 = makeBoolean(NIL == valid_12);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
                            }
                        }
                    }
                } else {
                    if (pcase_var.eql($PREDICATE_EXTENT)) {
                        {
                            SubLObject pred_var = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
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
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                        {
                                                            SubLObject done_var_13 = NIL;
                                                            SubLObject token_var_14 = NIL;
                                                            while (NIL == done_var_13) {
                                                                {
                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_14);
                                                                    SubLObject valid_15 = makeBoolean(token_var_14 != assertion);
                                                                    if (NIL != valid_15) {
                                                                        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                            if (NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                                                                result = cons(assertion, result);
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var_13 = makeBoolean(NIL == valid_15);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
                    } else {
                        if (pcase_var.eql($OVERLAP)) {
                            {
                                SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                                SubLObject assertion = NIL;
                                for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                    if ((NIL == enumeration_types.sense_truth($POS)) || (NIL != assertions_high.assertion_has_truth(assertion, enumeration_types.sense_truth($POS)))) {
                                        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                            if (NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                                result = cons(assertion, result);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            kb_mapping_macros.do_gli_method_error(l_index, method);
                        }
                    }
                }
                if (NIL != result) {
                    return iteration.new_list_iterator(result);
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_lookup_pos_iterator(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(asent, $POS);
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
        if (pcase_var.eql($GAF_ARG)) {
            thread.resetMultipleValues();
            final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
            final SubLObject argnum = thread.secondMultipleValue();
            final SubLObject predicate = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != argnum) {
                if (NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$1 = NIL;
                                    final SubLObject token_var_$2 = NIL;
                                    while (NIL == done_var_$1) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                        final SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(assertion));
                                        if (((NIL != valid_$3) && (NIL != backward_utilities.direction_is_relevant(assertion))) && (NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED))) {
                                            result = cons(assertion, result);
                                        }
                                        done_var_$1 = makeBoolean(NIL == valid_$3);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$2 = NIL;
                                    final SubLObject token_var_$3 = NIL;
                                    while (NIL == done_var_$2) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                        final SubLObject valid_$4 = makeBoolean(!token_var_$3.eql(assertion));
                                        if (((NIL != valid_$4) && (NIL != backward_utilities.direction_is_relevant(assertion))) && (NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED))) {
                                            result = cons(assertion, result);
                                        }
                                        done_var_$2 = makeBoolean(NIL == valid_$4);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }
            } else
                if (NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$3 = NIL;
                                    final SubLObject token_var_$4 = NIL;
                                    while (NIL == done_var_$3) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                        final SubLObject valid_$5 = makeBoolean(!token_var_$4.eql(assertion));
                                        if (((NIL != valid_$5) && (NIL != backward_utilities.direction_is_relevant(assertion))) && (NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED))) {
                                            result = cons(assertion, result);
                                        }
                                        done_var_$3 = makeBoolean(NIL == valid_$5);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$4 = NIL;
                                    final SubLObject token_var_$5 = NIL;
                                    while (NIL == done_var_$4) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                        final SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(assertion));
                                        if (((NIL != valid_$6) && (NIL != backward_utilities.direction_is_relevant(assertion))) && (NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED))) {
                                            result = cons(assertion, result);
                                        }
                                        done_var_$4 = makeBoolean(NIL == valid_$6);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values4 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values4);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }

        } else
            if (pcase_var.eql($PREDICATE_EXTENT)) {
                final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    final SubLObject str = NIL;
                    final SubLObject _prev_bind_5 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_12 = $silent_progressP$.currentBinding(thread);
                    try {
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                        $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        $progress_notification_count$.bind(ZERO_INTEGER, thread);
                        $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        $progress_count$.bind(ZERO_INTEGER, thread);
                        $is_noting_progressP$.bind(T, thread);
                        $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                        noting_progress_preamble(str);
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = NIL;
                        final SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                note_progress();
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$5 = NIL;
                                    final SubLObject token_var_$6 = NIL;
                                    while (NIL == done_var_$5) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$6);
                                        final SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(assertion2));
                                        if (((NIL != valid_$7) && (NIL != backward_utilities.direction_is_relevant(assertion2))) && (NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion2), UNPROVIDED, UNPROVIDED))) {
                                            result = cons(assertion2, result);
                                        }
                                        done_var_$5 = makeBoolean(NIL == valid_$7);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values5 = getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        restoreValuesFromVector(_values5);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                                    }
                                }
                            }
                            done_var2 = makeBoolean(NIL == valid2);
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_12, thread);
                        $is_noting_progressP$.rebind(_prev_bind_11, thread);
                        $progress_count$.rebind(_prev_bind_10, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                        $progress_notification_count$.rebind(_prev_bind_8, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                        $progress_start_time$.rebind(_prev_bind_5, thread);
                    }
                }
            } else
                if (pcase_var.eql($OVERLAP)) {
                    SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                    SubLObject assertion3 = NIL;
                    assertion3 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if ((((NIL == enumeration_types.sense_truth($POS)) || (NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth($POS)))) && (NIL != backward_utilities.direction_is_relevant(assertion3))) && (NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion3), UNPROVIDED, UNPROVIDED))) {
                            result = cons(assertion3, result);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion3 = cdolist_list_var.first();
                    } 
                } else {
                    kb_mapping_macros.do_gli_method_error(l_index, method);
                }


        if (NIL != result) {
            return iteration.new_inference_list_iterator(result);
        }
        return NIL;
    }

    public static final SubLObject removal_lookup_neg_completeness_alt(SubLObject asent) {
        if (NIL != removal_module_utilities.negation_grossly_incompleteP(asent, $NEG)) {
            return $GROSSLY_INCOMPLETE;
        } else {
            return $INCOMPLETE;
        }
    }

    public static SubLObject removal_lookup_neg_completeness(final SubLObject asent) {
        if (NIL != removal_module_utilities.negation_grossly_incompleteP(asent, $NEG)) {
            return $GROSSLY_INCOMPLETE;
        }
        return $INCOMPLETE;
    }

    public static final SubLObject removal_lookup_neg_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return inference_trampolines.inference_num_gaf_lookup_index(asent, $NEG);
    }

    public static SubLObject removal_lookup_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return inference_trampolines.inference_num_gaf_lookup_index(asent, $NEG);
    }

    public static final SubLObject removal_lookup_neg_iterator_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(asent, $NEG);
                SubLObject method = kb_mapping_macros.do_gli_extract_method(l_index);
                SubLObject pcase_var = method;
                if (pcase_var.eql($GAF_ARG)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                        SubLObject argnum = thread.secondMultipleValue();
                        SubLObject predicate = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != argnum) {
                            if (NIL != predicate) {
                                {
                                    SubLObject pred_var = predicate;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
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
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($NEG), NIL);
                                                                {
                                                                    SubLObject done_var_16 = NIL;
                                                                    SubLObject token_var_17 = NIL;
                                                                    while (NIL == done_var_16) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_17);
                                                                            SubLObject valid_18 = makeBoolean(token_var_17 != assertion);
                                                                            if (NIL != valid_18) {
                                                                                if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                                    result = cons(assertion, result);
                                                                                }
                                                                            }
                                                                            done_var_16 = makeBoolean(NIL == valid_18);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
                            } else {
                                {
                                    SubLObject pred_var = NIL;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
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
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($NEG), NIL);
                                                                {
                                                                    SubLObject done_var_19 = NIL;
                                                                    SubLObject token_var_20 = NIL;
                                                                    while (NIL == done_var_19) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_20);
                                                                            SubLObject valid_21 = makeBoolean(token_var_20 != assertion);
                                                                            if (NIL != valid_21) {
                                                                                if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                                    result = cons(assertion, result);
                                                                                }
                                                                            }
                                                                            done_var_19 = makeBoolean(NIL == valid_21);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
                            }
                        } else {
                            if (NIL != predicate) {
                                {
                                    SubLObject pred_var = predicate;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
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
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($NEG), NIL);
                                                                {
                                                                    SubLObject done_var_22 = NIL;
                                                                    SubLObject token_var_23 = NIL;
                                                                    while (NIL == done_var_22) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_23);
                                                                            SubLObject valid_24 = makeBoolean(token_var_23 != assertion);
                                                                            if (NIL != valid_24) {
                                                                                if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                                    result = cons(assertion, result);
                                                                                }
                                                                            }
                                                                            done_var_22 = makeBoolean(NIL == valid_24);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
                            } else {
                                {
                                    SubLObject pred_var = NIL;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
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
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($NEG), NIL);
                                                                {
                                                                    SubLObject done_var_25 = NIL;
                                                                    SubLObject token_var_26 = NIL;
                                                                    while (NIL == done_var_25) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_26);
                                                                            SubLObject valid_27 = makeBoolean(token_var_26 != assertion);
                                                                            if (NIL != valid_27) {
                                                                                if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                                    result = cons(assertion, result);
                                                                                }
                                                                            }
                                                                            done_var_25 = makeBoolean(NIL == valid_27);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
                            }
                        }
                    }
                } else {
                    if (pcase_var.eql($PREDICATE_EXTENT)) {
                        {
                            SubLObject pred_var = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
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
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($NEG), NIL);
                                                        {
                                                            SubLObject done_var_28 = NIL;
                                                            SubLObject token_var_29 = NIL;
                                                            while (NIL == done_var_28) {
                                                                {
                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_29);
                                                                    SubLObject valid_30 = makeBoolean(token_var_29 != assertion);
                                                                    if (NIL != valid_30) {
                                                                        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                            result = cons(assertion, result);
                                                                        }
                                                                    }
                                                                    done_var_28 = makeBoolean(NIL == valid_30);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
                    } else {
                        if (pcase_var.eql($OVERLAP)) {
                            {
                                SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                                SubLObject assertion = NIL;
                                for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                    if ((NIL == enumeration_types.sense_truth($NEG)) || (NIL != assertions_high.assertion_has_truth(assertion, enumeration_types.sense_truth($NEG)))) {
                                        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                            result = cons(assertion, result);
                                        }
                                    }
                                }
                            }
                        } else {
                            kb_mapping_macros.do_gli_method_error(l_index, method);
                        }
                    }
                }
                if (NIL != result) {
                    return iteration.new_list_iterator(result);
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_lookup_neg_iterator(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(asent, $NEG);
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
        if (pcase_var.eql($GAF_ARG)) {
            thread.resetMultipleValues();
            final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
            final SubLObject argnum = thread.secondMultipleValue();
            final SubLObject predicate = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != argnum) {
                if (NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($NEG), NIL);
                                    SubLObject done_var_$17 = NIL;
                                    final SubLObject token_var_$18 = NIL;
                                    while (NIL == done_var_$17) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$18);
                                        final SubLObject valid_$19 = makeBoolean(!token_var_$18.eql(assertion));
                                        if ((NIL != valid_$19) && (NIL != backward_utilities.direction_is_relevant(assertion))) {
                                            result = cons(assertion, result);
                                        }
                                        done_var_$17 = makeBoolean(NIL == valid_$19);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($NEG), NIL);
                                    SubLObject done_var_$18 = NIL;
                                    final SubLObject token_var_$19 = NIL;
                                    while (NIL == done_var_$18) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$19);
                                        final SubLObject valid_$20 = makeBoolean(!token_var_$19.eql(assertion));
                                        if ((NIL != valid_$20) && (NIL != backward_utilities.direction_is_relevant(assertion))) {
                                            result = cons(assertion, result);
                                        }
                                        done_var_$18 = makeBoolean(NIL == valid_$20);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }
            } else
                if (NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($NEG), NIL);
                                    SubLObject done_var_$19 = NIL;
                                    final SubLObject token_var_$20 = NIL;
                                    while (NIL == done_var_$19) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$20);
                                        final SubLObject valid_$21 = makeBoolean(!token_var_$20.eql(assertion));
                                        if ((NIL != valid_$21) && (NIL != backward_utilities.direction_is_relevant(assertion))) {
                                            result = cons(assertion, result);
                                        }
                                        done_var_$19 = makeBoolean(NIL == valid_$21);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($NEG), NIL);
                                    SubLObject done_var_$20 = NIL;
                                    final SubLObject token_var_$21 = NIL;
                                    while (NIL == done_var_$20) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$21);
                                        final SubLObject valid_$22 = makeBoolean(!token_var_$21.eql(assertion));
                                        if ((NIL != valid_$22) && (NIL != backward_utilities.direction_is_relevant(assertion))) {
                                            result = cons(assertion, result);
                                        }
                                        done_var_$20 = makeBoolean(NIL == valid_$22);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values4 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values4);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }

        } else
            if (pcase_var.eql($PREDICATE_EXTENT)) {
                final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    final SubLObject str = NIL;
                    final SubLObject _prev_bind_5 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_12 = $silent_progressP$.currentBinding(thread);
                    try {
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                        $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        $progress_notification_count$.bind(ZERO_INTEGER, thread);
                        $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        $progress_count$.bind(ZERO_INTEGER, thread);
                        $is_noting_progressP$.bind(T, thread);
                        $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                        noting_progress_preamble(str);
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = NIL;
                        final SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                note_progress();
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth($NEG), NIL);
                                    SubLObject done_var_$21 = NIL;
                                    final SubLObject token_var_$22 = NIL;
                                    while (NIL == done_var_$21) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$22);
                                        final SubLObject valid_$23 = makeBoolean(!token_var_$22.eql(assertion2));
                                        if ((NIL != valid_$23) && (NIL != backward_utilities.direction_is_relevant(assertion2))) {
                                            result = cons(assertion2, result);
                                        }
                                        done_var_$21 = makeBoolean(NIL == valid_$23);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$32 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values5 = getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        restoreValuesFromVector(_values5);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                                    }
                                }
                            }
                            done_var2 = makeBoolean(NIL == valid2);
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_12, thread);
                        $is_noting_progressP$.rebind(_prev_bind_11, thread);
                        $progress_count$.rebind(_prev_bind_10, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                        $progress_notification_count$.rebind(_prev_bind_8, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                        $progress_start_time$.rebind(_prev_bind_5, thread);
                    }
                }
            } else
                if (pcase_var.eql($OVERLAP)) {
                    SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                    SubLObject assertion3 = NIL;
                    assertion3 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (((NIL == enumeration_types.sense_truth($NEG)) || (NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth($NEG)))) && (NIL != backward_utilities.direction_is_relevant(assertion3))) {
                            result = cons(assertion3, result);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion3 = cdolist_list_var.first();
                    } 
                } else {
                    kb_mapping_macros.do_gli_method_error(l_index, method);
                }


        if (NIL != result) {
            return iteration.new_inference_list_iterator(result);
        }
        return NIL;
    }

    public static final SubLObject removal_lookup_expand_internal_alt(SubLObject assertion, SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                {
                    SubLObject gaf_formula = assertions_high.gaf_formula(assertion);
                    thread.resetMultipleValues();
                    {
                        SubLObject v_bindings = unification_utilities.gaf_asent_unify(asent, gaf_formula, T, T);
                        SubLObject gaf_asent = thread.secondMultipleValue();
                        SubLObject unify_justification = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != v_bindings) {
                            backward.removal_add_node(assertion, v_bindings, unify_justification);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_lookup_expand_internal(final SubLObject assertion, final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject gaf_formula = assertions_high.gaf_formula(assertion);
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.gaf_asent_unify(asent, gaf_formula, T, T);
            final SubLObject gaf_asent = thread.secondMultipleValue();
            final SubLObject unify_justification = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                backward.removal_add_node(assertion, v_bindings, unify_justification);
            }
        }
        return NIL;
    }

    public static final SubLObject removal_pred_unbound_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        result = inference_trampolines.inference_num_gaf_lookup_index(asent, $POS);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject removal_pred_unbound_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = inference_trampolines.inference_num_gaf_lookup_index(asent, $POS);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject removal_pred_unbound_iterator_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(asent, $POS);
                SubLObject method = kb_mapping_macros.do_gli_extract_method(l_index);
                SubLObject pcase_var = method;
                if (pcase_var.eql($GAF_ARG)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                        SubLObject argnum = thread.secondMultipleValue();
                        SubLObject predicate = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != argnum) {
                            if (NIL != predicate) {
                                {
                                    SubLObject pred_var = predicate;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
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
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                {
                                                                    SubLObject done_var_31 = NIL;
                                                                    SubLObject token_var_32 = NIL;
                                                                    while (NIL == done_var_31) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_32);
                                                                            SubLObject valid_33 = makeBoolean(token_var_32 != assertion);
                                                                            if (NIL != valid_33) {
                                                                                if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                                    if (NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                                                                        result = cons(assertion, result);
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_31 = makeBoolean(NIL == valid_33);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
                            } else {
                                {
                                    SubLObject pred_var = NIL;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
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
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                {
                                                                    SubLObject done_var_34 = NIL;
                                                                    SubLObject token_var_35 = NIL;
                                                                    while (NIL == done_var_34) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_35);
                                                                            SubLObject valid_36 = makeBoolean(token_var_35 != assertion);
                                                                            if (NIL != valid_36) {
                                                                                if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                                    if (NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                                                                        result = cons(assertion, result);
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_34 = makeBoolean(NIL == valid_36);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
                            }
                        } else {
                            if (NIL != predicate) {
                                {
                                    SubLObject pred_var = predicate;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
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
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                {
                                                                    SubLObject done_var_37 = NIL;
                                                                    SubLObject token_var_38 = NIL;
                                                                    while (NIL == done_var_37) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_38);
                                                                            SubLObject valid_39 = makeBoolean(token_var_38 != assertion);
                                                                            if (NIL != valid_39) {
                                                                                if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                                    if (NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                                                                        result = cons(assertion, result);
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_37 = makeBoolean(NIL == valid_39);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
                            } else {
                                {
                                    SubLObject pred_var = NIL;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
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
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                {
                                                                    SubLObject done_var_40 = NIL;
                                                                    SubLObject token_var_41 = NIL;
                                                                    while (NIL == done_var_40) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_41);
                                                                            SubLObject valid_42 = makeBoolean(token_var_41 != assertion);
                                                                            if (NIL != valid_42) {
                                                                                if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                                    if (NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                                                                        result = cons(assertion, result);
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_40 = makeBoolean(NIL == valid_42);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
                            }
                        }
                    }
                } else {
                    if (pcase_var.eql($PREDICATE_EXTENT)) {
                        {
                            SubLObject pred_var = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
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
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                        {
                                                            SubLObject done_var_43 = NIL;
                                                            SubLObject token_var_44 = NIL;
                                                            while (NIL == done_var_43) {
                                                                {
                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_44);
                                                                    SubLObject valid_45 = makeBoolean(token_var_44 != assertion);
                                                                    if (NIL != valid_45) {
                                                                        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                            if (NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                                                                result = cons(assertion, result);
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var_43 = makeBoolean(NIL == valid_45);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
                    } else {
                        if (pcase_var.eql($OVERLAP)) {
                            {
                                SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                                SubLObject assertion = NIL;
                                for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                    if ((NIL == enumeration_types.sense_truth($POS)) || (NIL != assertions_high.assertion_has_truth(assertion, enumeration_types.sense_truth($POS)))) {
                                        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                            if (NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                                result = cons(assertion, result);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            kb_mapping_macros.do_gli_method_error(l_index, method);
                        }
                    }
                }
                if (NIL != result) {
                    return iteration.new_list_iterator(result);
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_pred_unbound_iterator(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(asent, $POS);
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
        if (pcase_var.eql($GAF_ARG)) {
            thread.resetMultipleValues();
            final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
            final SubLObject argnum = thread.secondMultipleValue();
            final SubLObject predicate = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != argnum) {
                if (NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$33 = NIL;
                                    final SubLObject token_var_$34 = NIL;
                                    while (NIL == done_var_$33) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$34);
                                        final SubLObject valid_$35 = makeBoolean(!token_var_$34.eql(assertion));
                                        if (((NIL != valid_$35) && (NIL != backward_utilities.direction_is_relevant(assertion))) && (NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED))) {
                                            result = cons(assertion, result);
                                        }
                                        done_var_$33 = makeBoolean(NIL == valid_$35);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$34 = NIL;
                                    final SubLObject token_var_$35 = NIL;
                                    while (NIL == done_var_$34) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$35);
                                        final SubLObject valid_$36 = makeBoolean(!token_var_$35.eql(assertion));
                                        if (((NIL != valid_$36) && (NIL != backward_utilities.direction_is_relevant(assertion))) && (NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED))) {
                                            result = cons(assertion, result);
                                        }
                                        done_var_$34 = makeBoolean(NIL == valid_$36);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }
            } else
                if (NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$35 = NIL;
                                    final SubLObject token_var_$36 = NIL;
                                    while (NIL == done_var_$35) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$36);
                                        final SubLObject valid_$37 = makeBoolean(!token_var_$36.eql(assertion));
                                        if (((NIL != valid_$37) && (NIL != backward_utilities.direction_is_relevant(assertion))) && (NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED))) {
                                            result = cons(assertion, result);
                                        }
                                        done_var_$35 = makeBoolean(NIL == valid_$37);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$36 = NIL;
                                    final SubLObject token_var_$37 = NIL;
                                    while (NIL == done_var_$36) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$37);
                                        final SubLObject valid_$38 = makeBoolean(!token_var_$37.eql(assertion));
                                        if (((NIL != valid_$38) && (NIL != backward_utilities.direction_is_relevant(assertion))) && (NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED))) {
                                            result = cons(assertion, result);
                                        }
                                        done_var_$36 = makeBoolean(NIL == valid_$38);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values4 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values4);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }

        } else
            if (pcase_var.eql($PREDICATE_EXTENT)) {
                final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    final SubLObject str = NIL;
                    final SubLObject _prev_bind_5 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_12 = $silent_progressP$.currentBinding(thread);
                    try {
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                        $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        $progress_notification_count$.bind(ZERO_INTEGER, thread);
                        $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        $progress_count$.bind(ZERO_INTEGER, thread);
                        $is_noting_progressP$.bind(T, thread);
                        $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                        noting_progress_preamble(str);
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = NIL;
                        final SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                note_progress();
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$37 = NIL;
                                    final SubLObject token_var_$38 = NIL;
                                    while (NIL == done_var_$37) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$38);
                                        final SubLObject valid_$39 = makeBoolean(!token_var_$38.eql(assertion2));
                                        if (((NIL != valid_$39) && (NIL != backward_utilities.direction_is_relevant(assertion2))) && (NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion2), UNPROVIDED, UNPROVIDED))) {
                                            result = cons(assertion2, result);
                                        }
                                        done_var_$37 = makeBoolean(NIL == valid_$39);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$48 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values5 = getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        restoreValuesFromVector(_values5);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$48, thread);
                                    }
                                }
                            }
                            done_var2 = makeBoolean(NIL == valid2);
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_12, thread);
                        $is_noting_progressP$.rebind(_prev_bind_11, thread);
                        $progress_count$.rebind(_prev_bind_10, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                        $progress_notification_count$.rebind(_prev_bind_8, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                        $progress_start_time$.rebind(_prev_bind_5, thread);
                    }
                }
            } else
                if (pcase_var.eql($OVERLAP)) {
                    SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                    SubLObject assertion3 = NIL;
                    assertion3 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if ((((NIL == enumeration_types.sense_truth($POS)) || (NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth($POS)))) && (NIL != backward_utilities.direction_is_relevant(assertion3))) && (NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion3), UNPROVIDED, UNPROVIDED))) {
                            result = cons(assertion3, result);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion3 = cdolist_list_var.first();
                    } 
                } else {
                    kb_mapping_macros.do_gli_method_error(l_index, method);
                }


        if (NIL != result) {
            return iteration.new_inference_list_iterator(result);
        }
        return NIL;
    }

    public static final SubLObject pred_unbound_pos_preference_alt(SubLObject asent, SubLObject bindable_vars, SubLObject strategic_context) {
        if (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lookup.formula_contains_indexed_termP(asent, UNPROVIDED)) {
            return $GROSSLY_DISPREFERRED;
        } else {
            return $DISALLOWED;
        }
    }

    public static SubLObject pred_unbound_pos_preference(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        if ((NIL != formula_contains_indexed_termP(asent, UNPROVIDED)) && (NIL == list_utilities.member_eqP(cycl_utilities.atomic_sentence_predicate(asent), bindable_vars))) {
            return $GROSSLY_DISPREFERRED;
        }
        return $DISALLOWED;
    }

    public static final SubLObject formula_contains_indexed_termP_alt(SubLObject formula, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        return sublisp_boolean(expression_find_if(symbol_function(INDEXED_TERM_P), formula, penetrate_hl_structuresP, UNPROVIDED));
    }

    public static SubLObject formula_contains_indexed_termP(final SubLObject formula, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        return list_utilities.sublisp_boolean(cycl_utilities.expression_find_if(symbol_function(INDEXED_TERM_P), formula, penetrate_hl_structuresP, UNPROVIDED));
    }

    public static final SubLObject formula_has_indexed_term_arg_p_alt(SubLObject formula, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = NIL;
        }
        return sublisp_boolean(find_if(symbol_function(INDEXED_TERM_P), formula_args(formula, seqvar_handling), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject formula_has_indexed_term_arg_p(final SubLObject formula, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = NIL;
        }
        return list_utilities.sublisp_boolean(find_if(symbol_function(INDEXED_TERM_P), cycl_utilities.formula_args(formula, seqvar_handling), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject formula_has_fort_arg_p_alt(SubLObject formula, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = NIL;
        }
        return sublisp_boolean(find_if(symbol_function(FORT_P), formula_args(formula, seqvar_handling), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject formula_has_fort_arg_p(final SubLObject formula, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = NIL;
        }
        return list_utilities.sublisp_boolean(find_if(symbol_function(FORT_P), cycl_utilities.formula_args(formula, seqvar_handling), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject asent_has_fort_arg_p_alt(SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lookup.formula_has_fort_arg_p(asent, seqvar_handling);
    }

    public static SubLObject asent_has_fort_arg_p(final SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = NIL;
        }
        return formula_has_fort_arg_p(asent, seqvar_handling);
    }

    public static final SubLObject asent_has_indexed_term_arg_p_alt(SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lookup.formula_has_indexed_term_arg_p(asent, seqvar_handling);
    }

    public static SubLObject asent_has_indexed_term_arg_p(final SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = NIL;
        }
        return formula_has_indexed_term_arg_p(asent, seqvar_handling);
    }

    public static SubLObject declare_removal_modules_lookup_file() {
        declareFunction("removal_lookup_pos_cost", "REMOVAL-LOOKUP-POS-COST", 1, 1, false);
        new removal_modules_lookup.$removal_lookup_pos_cost$UnaryFunction();
        new removal_modules_lookup.$removal_lookup_pos_cost$BinaryFunction();
        declareFunction("removal_completely_asserted_asentP", "REMOVAL-COMPLETELY-ASSERTED-ASENT?", 1, 0, false);
        new removal_modules_lookup.$removal_completely_asserted_asentP$UnaryFunction();
        declareFunction("removal_lookup_pos_iterator", "REMOVAL-LOOKUP-POS-ITERATOR", 1, 0, false);
        new removal_modules_lookup.$removal_lookup_pos_iterator$UnaryFunction();
        declareFunction("removal_lookup_neg_completeness", "REMOVAL-LOOKUP-NEG-COMPLETENESS", 1, 0, false);
        declareFunction("removal_lookup_neg_cost", "REMOVAL-LOOKUP-NEG-COST", 1, 1, false);
        declareFunction("removal_lookup_neg_iterator", "REMOVAL-LOOKUP-NEG-ITERATOR", 1, 0, false);
        declareFunction("removal_lookup_expand_internal", "REMOVAL-LOOKUP-EXPAND-INTERNAL", 2, 0, false);
        declareFunction("removal_pred_unbound_cost", "REMOVAL-PRED-UNBOUND-COST", 1, 1, false);
        declareFunction("removal_pred_unbound_iterator", "REMOVAL-PRED-UNBOUND-ITERATOR", 1, 0, false);
        declareFunction("pred_unbound_pos_preference", "PRED-UNBOUND-POS-PREFERENCE", 3, 0, false);
        declareFunction("formula_contains_indexed_termP", "FORMULA-CONTAINS-INDEXED-TERM?", 1, 1, false);
        declareFunction("formula_has_indexed_term_arg_p", "FORMULA-HAS-INDEXED-TERM-ARG-P", 1, 1, false);
        declareFunction("formula_has_fort_arg_p", "FORMULA-HAS-FORT-ARG-P", 1, 1, false);
        declareFunction("asent_has_fort_arg_p", "ASENT-HAS-FORT-ARG-P", 1, 1, false);
        declareFunction("asent_has_indexed_term_arg_p", "ASENT-HAS-INDEXED-TERM-ARG-P", 1, 1, false);
        new removal_modules_lookup.$asent_has_indexed_term_arg_p$UnaryFunction();
        new removal_modules_lookup.$asent_has_indexed_term_arg_p$BinaryFunction();
        return NIL;
    }

    public static SubLObject init_removal_modules_lookup_file() {
        return NIL;
    }

    public static SubLObject setup_removal_modules_lookup_file() {
        inference_modules.inference_removal_module($REMOVAL_LOOKUP_POS, $list6);
        inference_modules.inference_removal_module($REMOVAL_LOOKUP_NEG, $list11);
        inference_modules.inference_removal_module($REMOVAL_PRED_UNBOUND, $list15);
        preference_modules.inference_preference_module($PRED_UNBOUND_POS, $list17);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_lookup_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_lookup_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_lookup_file();
    }

    static {
    }

    public static final class $removal_lookup_pos_cost$UnaryFunction extends UnaryFunction {
        public $removal_lookup_pos_cost$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-LOOKUP-POS-COST"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_lookup_pos_cost(arg1, removal_modules_lookup.$removal_lookup_pos_cost$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $removal_lookup_pos_cost$BinaryFunction extends BinaryFunction {
        public $removal_lookup_pos_cost$BinaryFunction() {
            super(extractFunctionNamed("REMOVAL-LOOKUP-POS-COST"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_lookup_pos_cost(arg1, arg2);
        }
    }

    public static final class $removal_completely_asserted_asentP$UnaryFunction extends UnaryFunction {
        public $removal_completely_asserted_asentP$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-COMPLETELY-ASSERTED-ASENT?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_completely_asserted_asentP(arg1);
        }
    }

    public static final class $removal_lookup_pos_iterator$UnaryFunction extends UnaryFunction {
        public $removal_lookup_pos_iterator$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-LOOKUP-POS-ITERATOR"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_lookup_pos_iterator(arg1);
        }
    }

    public static final class $asent_has_indexed_term_arg_p$UnaryFunction extends UnaryFunction {
        public $asent_has_indexed_term_arg_p$UnaryFunction() {
            super(extractFunctionNamed("ASENT-HAS-INDEXED-TERM-ARG-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return asent_has_indexed_term_arg_p(arg1, removal_modules_lookup.$asent_has_indexed_term_arg_p$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $asent_has_indexed_term_arg_p$BinaryFunction extends BinaryFunction {
        public $asent_has_indexed_term_arg_p$BinaryFunction() {
            super(extractFunctionNamed("ASENT-HAS-INDEXED-TERM-ARG-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return asent_has_indexed_term_arg_p(arg1, arg2);
        }
    }

    static private final SubLList $list_alt6 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), cons($FORT, makeKeyword("ANYTHING")), $COST, makeSymbol("REMOVAL-LOOKUP-POS-COST"), makeKeyword("COMPLETE-PATTERN"), list($TEST, makeSymbol("REMOVAL-COMPLETELY-ASSERTED-ASENT?")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-LOOKUP-POS-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list($CALL, makeSymbol("GAF-FORMULA"), makeKeyword("INPUT")), makeKeyword("SUPPORT-PATTERN"), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(<fort> . <whatever>)\nusing true assertions and GAF indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$bordersOn #$UnitedStatesOfAmerica ?COUNTRY)\n (#$bordersOn #$UnitedStatesOfAmerica #$Canada)\n (#$resultIsa #$JuvenileFn #$JuvenileAnimal)") });

    static private final SubLList $list_alt11 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), cons($FORT, makeKeyword("ANYTHING")), $COST, makeSymbol("REMOVAL-LOOKUP-NEG-COST"), makeKeyword("COMPLETENESS-PATTERN"), list($CALL, makeSymbol("REMOVAL-LOOKUP-NEG-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-LOOKUP-NEG-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list($CALL, makeSymbol("GAF-FORMULA"), makeKeyword("INPUT")), makeKeyword("SUPPORT-PATTERN"), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> . <whatever>))\nusing false assertions and GAF indexing in the KB") });

    static private final SubLList $list_alt15 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), cons(list(makeKeyword("NOT"), $FORT), makeKeyword("ANYTHING")), list($TEST, makeSymbol("FORMULA-CONTAINS-INDEXED-TERM?"))), $COST, makeSymbol("REMOVAL-PRED-UNBOUND-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-PRED-UNBOUND-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list($CALL, makeSymbol("GAF-FORMULA"), makeKeyword("INPUT")), makeKeyword("SUPPORT-PATTERN"), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(<variable> ... <fort> ... )\nusing true assertions and GAF indexing on <fort>.\nThis is a last-resort if <variable> occurs elsewhere."), makeKeyword("EXAMPLE"), makeString("(?PREDICATE #$UnitedStatesOfAmerica #$Canada)") });

    static private final SubLList $list_alt17 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), cons(makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE"), makeSymbol("PRED-UNBOUND-POS-PREFERENCE"));
}

/**
 * Total time: 754 ms
 */
