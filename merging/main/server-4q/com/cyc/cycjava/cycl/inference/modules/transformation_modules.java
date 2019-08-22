/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$hl_failure_backchaining$;
import static com.cyc.cycjava.cycl.control_vars.$unbound_rule_backchain_enabled$;
import static com.cyc.cycjava.cycl.control_vars.$unique_inference_result_bindings$;
import static com.cyc.cycjava.cycl.el_utilities.designated_mt;
import static com.cyc.cycjava.cycl.el_utilities.designated_sentence;
import static com.cyc.cycjava.cycl.el_utilities.el_binary_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.ist_sentence_p;
import static com.cyc.cycjava.cycl.el_utilities.replace_formula_arg;
import static com.cyc.cycjava.cycl.fort_types_interface.predicateP;
import static com.cyc.cycjava.cycl.forts.fort_p;
import static com.cyc.cycjava.cycl.genl_predicates.genl_predicateP;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$mt$;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$relevant_mt_function$;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$relevant_mts$;
import static com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_function;
import static com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_mt;
import static com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_mt_list;
import static com.cyc.cycjava.cycl.subl_promotions.memberP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.auxiliary_indexing;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.negation_predicate;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_czer;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_strategic_heuristics;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_symmetry;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      TRANSFORMATION-MODULES
 * source file: /cyc/top/cycl/inference/modules/transformation-modules.lisp
 * created:     2019/07/03 17:37:47
 */
public final class transformation_modules extends SubLTranslatedFile implements V12 {
    public static final SubLObject gaf_truth_known(SubLObject gaf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject truth = NIL;
                SubLObject l_index = kb_indexing.best_gaf_lookup_index(gaf, NIL, NIL);
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
                                            SubLObject done_var = truth;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                                {
                                                                    SubLObject done_var_1 = truth;
                                                                    SubLObject token_var_2 = NIL;
                                                                    while (NIL == done_var_1) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_2);
                                                                            SubLObject valid_3 = makeBoolean(token_var_2 != assertion);
                                                                            if (NIL != valid_3) {
                                                                                if (NIL != unification_utilities.asent_unify(gaf, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                                                                    truth = assertions_high.assertion_truth(assertion);
                                                                                }
                                                                            }
                                                                            done_var_1 = makeBoolean((NIL == valid_3) || (NIL != truth));
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
                                                    done_var = makeBoolean((NIL == valid) || (NIL != truth));
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
                                            SubLObject done_var = truth;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                                {
                                                                    SubLObject done_var_4 = truth;
                                                                    SubLObject token_var_5 = NIL;
                                                                    while (NIL == done_var_4) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_5);
                                                                            SubLObject valid_6 = makeBoolean(token_var_5 != assertion);
                                                                            if (NIL != valid_6) {
                                                                                if (NIL != unification_utilities.asent_unify(gaf, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                                                                    truth = assertions_high.assertion_truth(assertion);
                                                                                }
                                                                            }
                                                                            done_var_4 = makeBoolean((NIL == valid_6) || (NIL != truth));
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
                                                    done_var = makeBoolean((NIL == valid) || (NIL != truth));
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
                                            SubLObject done_var = truth;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                                {
                                                                    SubLObject done_var_7 = truth;
                                                                    SubLObject token_var_8 = NIL;
                                                                    while (NIL == done_var_7) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_8);
                                                                            SubLObject valid_9 = makeBoolean(token_var_8 != assertion);
                                                                            if (NIL != valid_9) {
                                                                                if (NIL != unification_utilities.asent_unify(gaf, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                                                                    truth = assertions_high.assertion_truth(assertion);
                                                                                }
                                                                            }
                                                                            done_var_7 = makeBoolean((NIL == valid_9) || (NIL != truth));
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
                                                    done_var = makeBoolean((NIL == valid) || (NIL != truth));
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
                                            SubLObject done_var = truth;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                                {
                                                                    SubLObject done_var_10 = truth;
                                                                    SubLObject token_var_11 = NIL;
                                                                    while (NIL == done_var_10) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_11);
                                                                            SubLObject valid_12 = makeBoolean(token_var_11 != assertion);
                                                                            if (NIL != valid_12) {
                                                                                if (NIL != unification_utilities.asent_unify(gaf, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                                                                    truth = assertions_high.assertion_truth(assertion);
                                                                                }
                                                                            }
                                                                            done_var_10 = makeBoolean((NIL == valid_12) || (NIL != truth));
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
                                                    done_var = makeBoolean((NIL == valid) || (NIL != truth));
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
                                    SubLObject done_var = truth;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                        {
                                                            SubLObject done_var_13 = truth;
                                                            SubLObject token_var_14 = NIL;
                                                            while (NIL == done_var_13) {
                                                                {
                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_14);
                                                                    SubLObject valid_15 = makeBoolean(token_var_14 != assertion);
                                                                    if (NIL != valid_15) {
                                                                        if (NIL != unification_utilities.asent_unify(gaf, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                                                            truth = assertions_high.assertion_truth(assertion);
                                                                        }
                                                                    }
                                                                    done_var_13 = makeBoolean((NIL == valid_15) || (NIL != truth));
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
                                            done_var = makeBoolean((NIL == valid) || (NIL != truth));
                                        }
                                    } 
                                }
                            }
                        }
                    } else {
                        if (pcase_var.eql($OVERLAP)) {
                            {
                                SubLObject rest = NIL;
                                for (rest = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED); !((NIL != truth) || (NIL == rest)); rest = rest.rest()) {
                                    {
                                        SubLObject assertion = rest.first();
                                        if (NIL != unification_utilities.asent_unify(gaf, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                            truth = assertions_high.assertion_truth(assertion);
                                        }
                                    }
                                }
                            }
                        } else {
                            kb_mapping_macros.do_gli_method_error(l_index, method);
                        }
                    }
                }
                return truth;
            }
        }
    }

    public static final SubLFile me = new transformation_modules();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.transformation_modules";


    // defparameter
    /**
     * Temporary control variable; controls whether or not we bother to try to call
     * gaf-truth-known.
     */
    @LispMethod(comment = "Temporary control variable; controls whether or not we bother to try to call\r\ngaf-truth-known.\ndefparameter\nTemporary control variable; controls whether or not we bother to try to call\ngaf-truth-known.")
    private static final SubLSymbol $transformation_gaf_truth_known_disabled$ = makeSymbol("*TRANSFORMATION-GAF-TRUTH-KNOWN-DISABLED*");

    // deflexical
    /**
     * Modules which require :allow-unbound-predicate-transformation? to be t to be
     * used
     */
    @LispMethod(comment = "Modules which require :allow-unbound-predicate-transformation? to be t to be\r\nused\ndeflexical\nModules which require :allow-unbound-predicate-transformation? to be t to be\nused")
    private static final SubLSymbol $unbound_predicate_transformation_required_modules$ = makeSymbol("*UNBOUND-PREDICATE-TRANSFORMATION-REQUIRED-MODULES*");

    // deflexical
    /**
     * Transformation modules which require :allow-hl-predicate-transformation? to
     * be t to be used. Exception is trans-isa-pos - which can be used when
     * #$collectionBackchainEncouraged.
     */
    @LispMethod(comment = "Transformation modules which require :allow-hl-predicate-transformation? to\r\nbe t to be used. Exception is trans-isa-pos - which can be used when\r\n#$collectionBackchainEncouraged.\ndeflexical\nTransformation modules which require :allow-hl-predicate-transformation? to\nbe t to be used. Exception is trans-isa-pos - which can be used when\n#$collectionBackchainEncouraged.")
    private static final SubLSymbol $hl_predicate_transformation_required_modules$ = makeSymbol("*HL-PREDICATE-TRANSFORMATION-REQUIRED-MODULES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $genls_definitional_sentence$ = makeSymbol("*GENLS-DEFINITIONAL-SENTENCE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $genls_definitional_rules$ = makeSymbol("*GENLS-DEFINITIONAL-RULES*");



















    private static final SubLString $str13$Unexpected_commutative_predicate_ = makeString("Unexpected commutative predicate ~s");

    private static final SubLList $list15 = list(list(makeSymbol("DIRECTION-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list17 = list(list(makeSymbol("RELEVANT-DIRECTIONS")));

    static private final SubLList $list18 = list(list(makeSymbol("RULE-ASENT-VAR"), makeSymbol("RULE"), makeSymbol("SENSE"), makeSymbol("&KEY"), makeSymbol("PREDICATE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list19 = list(makeKeyword("PREDICATE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $sym22$PREDICATE_VAR = makeUninternedSymbol("PREDICATE-VAR");

    private static final SubLSymbol DO_TRANSFORMATION_RULE_LITERALS = makeSymbol("DO-TRANSFORMATION-RULE-LITERALS");

    private static final SubLSymbol $sym27$RULE_VAR = makeUninternedSymbol("RULE-VAR");

    private static final SubLSymbol RULE_RELEVANT_TO_PROOF = makeSymbol("RULE-RELEVANT-TO-PROOF");

    private static final SubLSymbol DO_ASSERTION_LITERALS = makeSymbol("DO-ASSERTION-LITERALS");

    private static final SubLList $list31 = list(list(makeSymbol("RULE-ASENT-VAR"), makeSymbol("RULE-VAR"), makeSymbol("PREDICATE"), makeSymbol("SENSE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym32$DIRECTION_VAR = makeUninternedSymbol("DIRECTION-VAR");

    private static final SubLSymbol $sym33$SENSE_VAR = makeUninternedSymbol("SENSE-VAR");

    private static final SubLSymbol $sym34$PREDICATE_VAR = makeUninternedSymbol("PREDICATE-VAR");

    private static final SubLSymbol DO_TRANSFORMATION_RELEVANT_DIRECTIONS = makeSymbol("DO-TRANSFORMATION-RELEVANT-DIRECTIONS");

    private static final SubLSymbol DO_PREDICATE_RULE_INDEX = makeSymbol("DO-PREDICATE-RULE-INDEX");

    private static final SubLSymbol $sym38$CURRENT_INFERENCE_RULE_PREFERENCE__ = makeSymbol("CURRENT-INFERENCE-RULE-PREFERENCE->");

    private static final SubLSymbol $sym39$TRANSFORMATION_RULE_UTILITY__ = makeSymbol("TRANSFORMATION-RULE-UTILITY->");

    private static final SubLSymbol $TRANS_PREDICATE_POS = makeKeyword("TRANS-PREDICATE-POS");

    private static final SubLList $list42 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), cons($FORT, makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("TRANS-PREDICATE-POS-REQUIRED"), $COST, makeSymbol("TRANS-PREDICATE-POS-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> . <whatever>)\nwhere <predicate> is a FORT\nfrom a rule concluding to <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$likesAsFriend #$AbrahamLincoln ?WHO)\nfrom a rule concluding to #$likesAsFriend") });

    private static final SubLSymbol $TRANS_PREDICATE_NEG = makeKeyword("TRANS-PREDICATE-NEG");

    private static final SubLList $list44 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"), cons($FORT, makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("TRANS-PREDICATE-NEG-REQUIRED"), $COST, makeSymbol("TRANS-PREDICATE-NEG-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> . <whatever>))\nwhere <predicate> is a FORT\nfrom a rule concluding from <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$not (#$likesAsFriend #$AbrahamLincoln ?WHO))\nfrom a rule concluding from #$likesAsFriend") });

    private static final SubLSymbol TRANS_PREDICATE_RULE_SELECT_INT = makeSymbol("TRANS-PREDICATE-RULE-SELECT-INT");

    private static final SubLString $str47$Invalid_sense__s = makeString("Invalid sense ~s");

    private static final SubLSymbol TRANS_PREDICATE_GENLPREDS_POS_RULE_SELECT_INT = makeSymbol("TRANS-PREDICATE-GENLPREDS-POS-RULE-SELECT-INT");

    private static final SubLSymbol $TRANS_PREDICATE_GENLPREDS_POS = makeKeyword("TRANS-PREDICATE-GENLPREDS-POS");

    private static final SubLList $list50 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), cons(list(makeKeyword("AND"), $FORT, list($TEST, makeSymbol("INFERENCE-SOME-SPEC-PRED-OR-INVERSE?"))), makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("TRANS-PREDICATE-GENLPREDS-POS-REQUIRED"), $COST, makeSymbol("TRANS-PREDICATE-GENLPREDS-POS-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-GENLPREDS-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-GENLPREDS-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-GENLPREDS-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> . <whatever>)\nwhere <predicate> is a FORT with some spec-preds\nfrom a rule concluding to a spec-pred of <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$acquaintedWith #$AbrahamLincoln ?WHO)\nfrom (#$genlPreds #$likesAsFriend #$acquaintedWith)\nand a rule concluding to #$likesAsFriend") });

    private static final SubLSymbol $TRANS_PREDICATE_GENLPREDS_NEG = makeKeyword("TRANS-PREDICATE-GENLPREDS-NEG");

    private static final SubLList $list52 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"), cons(list(makeKeyword("AND"), $FORT, list($TEST, makeSymbol("INFERENCE-SOME-GENL-PRED-OR-INVERSE?"))), makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("TRANS-PREDICATE-GENLPREDS-NEG-REQUIRED"), $COST, makeSymbol("TRANS-PREDICATE-GENLPREDS-NEG-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-GENLPREDS-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-GENLPREDS-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-GENLPREDS-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> . <whatever>))\nwhere <predicate> is a FORT with some genl-preds\nfrom a rule concluding from a genl-pred of <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$not (#$likesAsFriend #$AbrahamLincoln ?WHO))\nfrom (#$genlPreds #$likesAsFriend #$acquaintedWith)\nand a rule concluding from #$acquaintedWith") });

    private static final SubLSymbol $sym53$INFERENCE_PROPER_GENL_PREDICATE_ = makeSymbol("INFERENCE-PROPER-GENL-PREDICATE?");

    private static final SubLSymbol TRANS_PREDICATE_GENLINVERSE_POS_RULE_SELECT_INT = makeSymbol("TRANS-PREDICATE-GENLINVERSE-POS-RULE-SELECT-INT");

    private static final SubLSymbol $TRANS_PREDICATE_GENLINVERSE_POS = makeKeyword("TRANS-PREDICATE-GENLINVERSE-POS");

    static private final SubLList $list56 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), cons(list(makeKeyword("AND"), $FORT, list($TEST, makeSymbol("INFERENCE-SOME-SPEC-PRED-OR-INVERSE?")), list(makeKeyword("NOT"), list($TEST, makeSymbol("INFERENCE-SYMMETRIC-PREDICATE?")))), makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("TRANS-PREDICATE-GENLINVERSE-POS-REQUIRED"), $COST, makeSymbol("TRANS-PREDICATE-GENLINVERSE-POS-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-GENLINVERSE-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-GENLINVERSE-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-GENLINVERSE-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> . <whatever>)\nwhere <predicate> is a FORT with some spec-preds\nfrom a rule concluding to a spec-pred of <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$awareOfExistenceOf #$MarvinMinsky ?WHO)\nfrom (#$genlInverse #$studentOf #$awareOfExistenceOf)\nand a rule concluding to #$studentOf") });

    private static final SubLSymbol $TRANS_PREDICATE_GENLINVERSE_NEG = makeKeyword("TRANS-PREDICATE-GENLINVERSE-NEG");

    static private final SubLList $list58 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"), cons(list(makeKeyword("AND"), $FORT, list($TEST, makeSymbol("INFERENCE-SOME-GENL-PRED-OR-INVERSE?")), list(makeKeyword("NOT"), list($TEST, makeSymbol("INFERENCE-SYMMETRIC-PREDICATE?")))), makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("TRANS-PREDICATE-GENLINVERSE-NEG-REQUIRED"), $COST, makeSymbol("TRANS-PREDICATE-GENLINVERSE-NEG-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-GENLINVERSE-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-GENLINVERSE-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-GENLINVERSE-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> . <whatever>))\nwhere <predicate> is a FORT with some genl-preds\nfrom a rule concluding from a genl-pred of <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$not (#$studentOf #$MarvinMinsky ?WHO))\nfrom (#$genlInverse #$studentOf #$awareOfExistenceOf)\nand a rule concluding from #$awareOfExistenceOf") });

    private static final SubLSymbol $sym59$INFERENCE_PROPER_GENL_INVERSE_ = makeSymbol("INFERENCE-PROPER-GENL-INVERSE?");

    private static final SubLSymbol $TRANS_PREDICATE_NEGATIONPREDS_NEG = makeKeyword("TRANS-PREDICATE-NEGATIONPREDS-NEG");

    private static final SubLList $list61 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"), cons(list(makeKeyword("AND"), $FORT, list($TEST, makeSymbol("INFERENCE-SOME-NEGATION-PRED-OR-INVERSE?"))), makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("TRANS-PREDICATE-NEGATIONPREDS-NEG-REQUIRED"), $COST, makeSymbol("TRANS-PREDICATE-NEGATIONPREDS-NEG-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-NEGATIONPREDS-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-NEGATIONPREDS-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-NEGATIONPREDS-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> . <whatever>))\nwhere <predicate> is a FORT with some negationPreds,\neither asserted or inferrable via genlPreds,\nfrom a rule concluding to a negationPred of <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$not (#$likesAsFriend #$AbrahamLincoln ?WHO))\nfrom (#$negationPreds #$likesAsFriend #$hates)\nand a rule concluding to #$hates") });

    private static final SubLSymbol $TRANS_PREDICATE_SYMMETRY_POS = makeKeyword("TRANS-PREDICATE-SYMMETRY-POS");

    private static final SubLList $list63 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list($FORT, makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list($TEST, makeSymbol("INFERENCE-SYMMETRIC-PREDICATE?")), makeKeyword("ANYTHING"))), $COST, makeSymbol("TRANS-PREDICATE-SYMMETRY-POS-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-SYMMETRY-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-SYMMETRY-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-SYMMETRY-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <whatever> <whatever>)\nwhere <predicate> is a FORT\nand (#$isa <predicate> #$SymmetricBinaryPredicate)\nfrom a rule concluding to <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$bordersOn #$Canada ?WHAT)\nfrom (#$isa #$bordersOn #$SymmetricBinaryPredicate)\nand a rule concluding to #$bordersOn") });

    private static final SubLSymbol $TRANS_PREDICATE_SYMMETRY_NEG = makeKeyword("TRANS-PREDICATE-SYMMETRY-NEG");

    private static final SubLList $list65 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list($FORT, makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list($TEST, makeSymbol("INFERENCE-SYMMETRIC-PREDICATE?")), makeKeyword("ANYTHING"))), $COST, makeSymbol("TRANS-PREDICATE-SYMMETRY-NEG-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-SYMMETRY-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-SYMMETRY-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-SYMMETRY-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> <whatever> <whatever>))\nwhere <predicate> is a FORT\nand (#$isa <predicate> #$SymmetricBinaryPredicate)\nfrom a rule concluding from <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$not (#$bordersOn #$Canada ?WHAT))\nfrom (#$isa #$bordersOn #$SymmetricBinaryPredicate)\nand a rule concluding from #$bordersOn") });

    private static final SubLSymbol $TRANS_PREDICATE_COMMUTATIVE_POS = makeKeyword("TRANS-PREDICATE-COMMUTATIVE-POS");

    private static final SubLList $list67 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), listS($FORT, makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list($TEST, makeSymbol("INFERENCE-COMMUTATIVE-PREDICATE-P")), makeKeyword("ANYTHING"))), $COST, makeSymbol("TRANS-PREDICATE-COMMUTATIVE-POS-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-COMMUTATIVE-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-COMMUTATIVE-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-COMMUTATIVE-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> . <args>)\nwhere <predicate> is a FORT\nthere are at least 3 args in <args>\nand (#$isa <predicate> #$CommutativePredicate)\nfrom a rule concluding to <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$collinear <point A> <point B> <point C>)\nfrom (#$isa #$collinear #$CommutativePredicate)\nand a rule concluding to #$collinear") });

    private static final SubLSymbol $TRANS_PREDICATE_COMMUTATIVE_NEG = makeKeyword("TRANS-PREDICATE-COMMUTATIVE-NEG");

    private static final SubLList $list69 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), listS($FORT, makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list($TEST, makeSymbol("INFERENCE-COMMUTATIVE-PREDICATE-P")), makeKeyword("ANYTHING"))), $COST, makeSymbol("TRANS-PREDICATE-COMMUTATIVE-NEG-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-COMMUTATIVE-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-COMMUTATIVE-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-COMMUTATIVE-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> . <args>))\nwhere <predicate> is a FORT\nthere are at least 3 args in <args>\nand (#$isa <predicate> #$CommutativePredicate)\nfrom a rule concluding from <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$not (#$collinear <point A> <point B> <point C>))\nfrom (#$isa #$collinear #$CommutativePredicate)\nand a rule concluding from #$collinear") });

    private static final SubLSymbol $TRANS_PREDICATE_PARTIALLY_COMMUTATIVE_POS = makeKeyword("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS");

    private static final SubLList $list71 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), listS($FORT, makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list($TEST, makeSymbol("INFERENCE-PARTIALLY-COMMUTATIVE-PREDICATE-P")), makeKeyword("ANYTHING"))), $COST, makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <whatever> <whatever>)\nwhere <predicate> is a FORT\nand (#$isa <predicate> #$PartiallyCommutativePredicate)\nfrom a rule concluding to <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(distanceBetween PlanetEarth Sun ((Mega Mile) 93))\nfrom (#$isa #$distanceBetween #$PartiallyCommutativePredicate)\nand  (#$commutativeInArgs #$distanceBetween 1 2)\nand a rule concluding to #$distanceBetween") });

    private static final SubLSymbol $TRANS_PREDICATE_PARTIALLY_COMMUTATIVE_NEG = makeKeyword("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG");

    static private final SubLList $list73 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), listS($FORT, makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list($TEST, makeSymbol("INFERENCE-PARTIALLY-COMMUTATIVE-PREDICATE-P")), makeKeyword("ANYTHING"))), $COST, makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> <whatever> <whatever>))\nwhere <predicate> is a FORT\nand (#$isa <predicate> #$PartiallyCommutativePredicate)\nfrom a rule concluding from <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(not (distanceBetween PlanetEarth Sun (Inch 93)))\nfrom (#$isa #$distanceBetween #$PartiallyCommutativePredicate)\nand  (#$commutativeInArgs #$distanceBetween 1 2)\nand a rule concluding from #$distanceBetween") });

    private static final SubLSymbol $TRANS_PREDICATE_ASYMMETRY = makeKeyword("TRANS-PREDICATE-ASYMMETRY");

    static private final SubLList $list75 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list($FORT, makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list($TEST, makeSymbol("INFERENCE-ASYMMETRIC-PREDICATE?")), makeKeyword("ANYTHING"))), $COST, makeSymbol("TRANS-PREDICATE-ASYMMETRY-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-ASYMMETRY-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-ASYMMETRY-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-ASYMMETRY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> <whatever> <whatever>))\nwhere <predicate> is a FORT\nand (#$isa <predicate> #$AsymmetricBinaryPredicate)\nfrom a rule concluding to <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$not (#$northOf ?WHAT #$Canada))\nfrom (#$isa #$northOf #$AsymmetricBinaryPredicate)\nand a rule concluding to #$northOf") });

    private static final SubLList $list76 = list(makeKeyword("TRANS-UNBOUND-PREDICATE-POS"), makeKeyword("TRANS-UNBOUND-PREDICATE-NEG"));

    private static final SubLSymbol $TRANS_UNBOUND_PREDICATE_POS = makeKeyword("TRANS-UNBOUND-PREDICATE-POS");

    static private final SubLList $list78 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED"), makeSymbol("TRANS-UNBOUND-PREDICATE-POS-REQUIRED"), $COST, makeSymbol("TRANS-UNBOUND-PREDICATE-POS-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-UNBOUND-PREDICATE-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-UNBOUND-PREDICATE-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-UNBOUND-PREDICATE-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<whatever> . <whatever>)\nfrom a rule concluding to a sentence with a variable as the predicate\nusing the unbound predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$implies\n      (#$and (#$isa ?ORDER #$MathematicalOrdering) (#$baseSet ?ORDER ?SET)\n       (#$orderingRelations ?ORDER ?PRED) (#$elementOf ?X ?SET)\n       (#$elementOf ?Y ?SET) (?PRED ?X ?Y) (#$elementOf ?Z ?SET)\n       (?PRED ?Y ?Z))\n      (?PRED ?X ?Z))") });

    private static final SubLSymbol $TRANS_UNBOUND_PREDICATE_NEG = makeKeyword("TRANS-UNBOUND-PREDICATE-NEG");

    private static final SubLList $list80 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED"), makeSymbol("TRANS-UNBOUND-PREDICATE-NEG-REQUIRED"), $COST, makeSymbol("TRANS-UNBOUND-PREDICATE-NEG-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-UNBOUND-PREDICATE-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-UNBOUND-PREDICATE-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-UNBOUND-PREDICATE-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<whatever> . <whatever>))\nfrom a rule concluding from a sentence with a variable as the predicate\nusing the unbound predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("no current example") });

    private static final SubLSymbol TRANS_UNBOUND_PREDICATE_RULE_SELECT = makeSymbol("TRANS-UNBOUND-PREDICATE-RULE-SELECT");

    private static final SubLList $list82 = list(makeKeyword("TRANS-ISA-POS"), makeKeyword("TRANS-ISA-NEG"), makeKeyword("TRANS-GENLS-POS"), makeKeyword("TRANS-GENLS-NEG"), makeKeyword("TRANS-GENL-MT-POS"), makeKeyword("TRANS-GENL-MT-NEG"));

    private static final SubLSymbol INFERENCE_MEMOIZED_ALL_SPECS = makeSymbol("INFERENCE-MEMOIZED-ALL-SPECS");

    private static final SubLSymbol TRANS_ISA_POS_RULE_SELECT_COUNT = makeSymbol("TRANS-ISA-POS-RULE-SELECT-COUNT");



    private static final SubLSymbol $TRANS_ISA_POS = makeKeyword("TRANS-ISA-POS");

    static private final SubLList $list87 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("ANYTHING"), $FORT), makeKeyword("REQUIRED"), makeSymbol("TRANS-ISA-POS-REQUIRED"), $COST, makeSymbol("TRANS-ISA-POS-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-ISA-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-ISA-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-ISA-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <whatever> <collection>)\nwhere <collection> is a FORT\nfrom a rule concluding to a spec of <collection>\nusing the isa rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$isa #$AbrahamLincoln #$FamousPerson)\nfrom (#$genls #$UnitedStatesPresident #$FamousPerson)\nand a rule concluding to #$isa #$UnitedStatesPresident") });

    private static final SubLSymbol $TRANS_ISA_NEG = makeKeyword("TRANS-ISA-NEG");

    static private final SubLList $list89 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("ANYTHING"), $FORT), makeKeyword("REQUIRED"), makeSymbol("TRANS-ISA-NEG-REQUIRED"), $COST, makeSymbol("TRANS-ISA-NEG-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-ISA-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-ISA-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-ISA-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$isa <whatever> <collection>))\nwhere <collection> is a FORT\nfrom a rule concluding from a genl of <collection>\nusing the isa rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$not (#$isa #$AbrahamLincoln #$FrenchPerson))\nfrom (#$genls #$FrenchPerson #$EuropeanPerson)\nand a rule concluding from #$isa #$EuropeanPerson") });

    private static final SubLSymbol $TRANS_GENLS_POS = makeKeyword("TRANS-GENLS-POS");

    private static final SubLList $list91 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genls"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genls"), makeKeyword("ANYTHING"), $FORT), makeKeyword("REQUIRED"), makeSymbol("TRANS-GENLS-POS-REQUIRED"), $COST, makeSymbol("TRANS-GENLS-POS-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-GENLS-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-GENLS-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-GENLS-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genls <whatever> <collection>)\nwhere <collection> is a FORT\nfrom a rule concluding to a spec of <collection>\nusing the genls rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$genls #$UnitedStatesPresident #$FamousPerson)\nfrom (#$genls #$WorldLeader #$FamousPerson)\nand a rule concluding to (#$genls ?X #$WorldLeader)") });

    private static final SubLSymbol $TRANS_GENLS_NEG = makeKeyword("TRANS-GENLS-NEG");

    private static final SubLList $list93 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("genls"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genls"), makeKeyword("ANYTHING"), $FORT), makeKeyword("REQUIRED"), makeSymbol("TRANS-GENLS-NEG-REQUIRED"), $COST, makeSymbol("TRANS-GENLS-NEG-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-GENLS-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-GENLS-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-GENLS-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$genls <whatever> <collection>))\nwhere <collection> is a FORT\nfrom a rule concluding from a genl of <collection>\nusing the genls rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$not (#$genls #$UnitedStatesPresident #$FrenchPerson))\nfrom (#$genls #$FrenchPerson #$EuropeanPerson)\nand a rule concluding from (#$genls ?X #$EuropeanPerson)") });

    private static final SubLSymbol INFERENCE_MEMOIZED_ALL_SPEC_MTS = makeSymbol("INFERENCE-MEMOIZED-ALL-SPEC-MTS");

    private static final SubLSymbol $TRANS_GENL_MT_POS = makeKeyword("TRANS-GENL-MT-POS");

    private static final SubLList $list96 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genlMt"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genlMt"), makeKeyword("ANYTHING"), list($TEST, makeSymbol("HLMT-P"))), makeKeyword("REQUIRED"), makeSymbol("TRANS-GENL-MT-POS-REQUIRED"), $COST, makeSymbol("TRANS-GENL-MT-POS-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-GENL-MT-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-GENL-MT-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-GENL-MT-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genlMt <whatever> <microtheory>)\nwhere <microtheory> is a FORT\nfrom a rule concluding to a spec of <microtheory>\nusing the genlMt rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$genlMt #$UnitedStatesPresidentsMt #$FamousPeopleMt)\nfrom (#$genlMt #$WorldLeadersMt #$FamousPeopleMt)\nand a rule concluding to (#$genlMt ?X #$WorldLeadersMt)") });

    private static final SubLSymbol $TRANS_GENL_MT_NEG = makeKeyword("TRANS-GENL-MT-NEG");

    static private final SubLList $list98 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("genlMt"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genlMt"), makeKeyword("ANYTHING"), list($TEST, makeSymbol("HLMT-P"))), makeKeyword("REQUIRED"), makeSymbol("TRANS-GENL-MT-NEG-REQUIRED"), $COST, makeSymbol("TRANS-GENL-MT-NEG-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-GENL-MT-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-GENL-MT-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-GENL-MT-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$genlMt <whatever> <microtheory>))\nwhere <microtheory> is a FORT\nfrom a rule concluding from a genl of <microtheory>\nusing the genlMt rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$not (#$genlMt #$UnitedStatesPresidentsMt #$FrenchPeopleMt))\nfrom (#$genlMt #$FrenchPeopleMt #$EuropeanPeopleMt)\nand a rule concluding from (#$genlMt ?X #$EuropeanPeopleMt)") });



    private static final SubLList $list101 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("abnormal"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("abnormal"), makeKeyword("ANYTHING"), makeKeyword("ASSERTION")), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), $COST, makeSymbol("TRANS-ABNORMAL-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-ABNORMAL-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-ABNORMAL-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-ABNORMAL-EXPAND") });

    private static final SubLList $list102 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?OBJ"), makeSymbol("?SUBSET")), list(reader_make_constant_shell("genls"), makeSymbol("?SUBSET"), makeSymbol("?SUPERSET"))), list(reader_make_constant_shell("isa"), makeSymbol("?OBJ"), makeSymbol("?SUPERSET")));

    private static final SubLSymbol $TRANSFORMATION_ABDUCTION_TO_SPECS = makeKeyword("TRANSFORMATION-ABDUCTION-TO-SPECS");

    private static final SubLList $list104 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), $FORT, makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("TRANSFORMATION-ABDUCTION-TO-SPECS-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ABDUCTION-COST*"), makeKeyword("RULE-SELECT"), makeSymbol("TRANSFORMATION-ABDUCTION-TO-SPECS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANSFORMATION-ABDUCTION-TO-SPECS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANSFORMATION-ABDUCTION-TO-SPECS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fort> <fully-bound>)\n   where the asent is deemed abducible, and the problem store allows abduction,\n   using #$genls rules."), makeKeyword("EXAMPLE"), makeString("(#$isa #$GeorgeWBush #$Parent)") });

    // Definitions
    public static final SubLObject additional_genls_supports_alt(SubLObject spec, SubLObject genl) {
        if (spec != genl) {
            {
                SubLObject hl_formula = list($$genls, spec, genl);
                SubLObject hl_support = arguments.make_hl_support($GENLS, hl_formula, UNPROVIDED, UNPROVIDED);
                SubLObject additional_supports = list(hl_support);
                return additional_supports;
            }
        }
        return NIL;
    }

    // Definitions
    public static SubLObject additional_genls_supports(final SubLObject spec, final SubLObject genl) {
        if (!spec.eql(genl)) {
            final SubLObject hl_formula = list($$genls, spec, genl);
            final SubLObject hl_support = arguments.make_hl_support($GENLS, hl_formula, UNPROVIDED, UNPROVIDED);
            final SubLObject additional_supports = list(hl_support);
            return additional_supports;
        }
        return NIL;
    }

    public static final SubLObject additional_genl_mt_supports_alt(SubLObject spec_mt, SubLObject genl_mt) {
        if (spec_mt != genl_mt) {
            {
                SubLObject hl_formula = list($$genlMt, spec_mt, genl_mt);
                SubLObject hl_support = arguments.make_hl_support($GENLMT, hl_formula, mt_vars.$mt_mt$.getGlobalValue(), UNPROVIDED);
                SubLObject additional_supports = list(hl_support);
                return additional_supports;
            }
        }
        return NIL;
    }

    public static SubLObject additional_genl_mt_supports(final SubLObject spec_mt, final SubLObject genl_mt) {
        if (!spec_mt.eql(genl_mt)) {
            final SubLObject hl_formula = list($$genlMt, spec_mt, genl_mt);
            final SubLObject hl_support = arguments.make_hl_support($GENLMT, hl_formula, mt_vars.$mt_mt$.getGlobalValue(), UNPROVIDED);
            final SubLObject additional_supports = list(hl_support);
            return additional_supports;
        }
        return NIL;
    }

    public static final SubLObject additional_genlpreds_supports_alt(SubLObject spec_pred, SubLObject genl_pred) {
        if (spec_pred != genl_pred) {
            {
                SubLObject hl_formula = list($$genlPreds, spec_pred, genl_pred);
                SubLObject hl_support = arguments.make_hl_support($GENLPREDS, hl_formula, UNPROVIDED, UNPROVIDED);
                SubLObject additional_supports = list(hl_support);
                return additional_supports;
            }
        }
        return NIL;
    }

    public static SubLObject additional_genlpreds_supports(final SubLObject spec_pred, final SubLObject genl_pred) {
        if (!spec_pred.eql(genl_pred)) {
            final SubLObject hl_formula = list($$genlPreds, spec_pred, genl_pred);
            final SubLObject hl_support = arguments.make_hl_support($GENLPREDS, hl_formula, UNPROVIDED, UNPROVIDED);
            final SubLObject additional_supports = list(hl_support);
            return additional_supports;
        }
        return NIL;
    }

    public static SubLObject additional_genlinverse_supports(final SubLObject spec_pred, final SubLObject genl_inverse) {
        if (!spec_pred.eql(genl_inverse)) {
            final SubLObject hl_formula = list($$genlInverse, spec_pred, genl_inverse);
            final SubLObject hl_support = arguments.make_hl_support($GENLPREDS, hl_formula, UNPROVIDED, UNPROVIDED);
            final SubLObject additional_supports = list(hl_support);
            return additional_supports;
        }
        return NIL;
    }

    public static final SubLObject additional_negationpreds_supports_alt(SubLObject pred, SubLObject negation_pred) {
        {
            SubLObject hl_formula = list($$negationPreds, pred, negation_pred);
            SubLObject hl_support = arguments.make_hl_support($NEGATIONPREDS, hl_formula, UNPROVIDED, UNPROVIDED);
            SubLObject additional_supports = list(hl_support);
            return additional_supports;
        }
    }

    public static SubLObject additional_negationpreds_supports(final SubLObject pred, final SubLObject negation_pred) {
        final SubLObject hl_formula = list($$negationPreds, pred, negation_pred);
        final SubLObject hl_support = arguments.make_hl_support($NEGATIONPREDS, hl_formula, UNPROVIDED, UNPROVIDED);
        final SubLObject additional_supports = list(hl_support);
        return additional_supports;
    }

    public static final SubLObject additional_asymmetry_supports_alt(SubLObject predicate) {
        return removal_module_utilities.additional_isa_supports(predicate, $$AsymmetricBinaryPredicate);
    }

    public static SubLObject additional_asymmetry_supports(final SubLObject predicate) {
        return removal_module_utilities.additional_isa_supports(predicate, $$AsymmetricBinaryPredicate);
    }

    public static final SubLObject additional_predicate_commutativity_supports_alt(SubLObject predicate) {
        if (NIL != inference_trampolines.inference_symmetric_predicateP(predicate)) {
            return removal_module_utilities.additional_isa_supports(predicate, $$SymmetricBinaryPredicate);
        } else {
            if (NIL != inference_trampolines.inference_commutative_predicate_p(predicate)) {
                return removal_module_utilities.additional_isa_supports(predicate, $$CommutativePredicate);
            } else {
                if (NIL != inference_trampolines.inference_partially_commutative_predicate_p(predicate)) {
                    return append(removal_module_utilities.additional_isa_supports(predicate, $$PartiallyCommutativePredicate), removal_modules_symmetry.commutative_in_args_supports(predicate));
                } else {
                    Errors.error($str_alt12$Unexpected_commutative_predicate_, predicate);
                }
            }
        }
        return NIL;
    }

    public static SubLObject additional_predicate_commutativity_supports(final SubLObject predicate) {
        if (NIL != inference_trampolines.inference_symmetric_predicateP(predicate)) {
            return removal_module_utilities.additional_isa_supports(predicate, $$SymmetricBinaryPredicate);
        }
        if (NIL != inference_trampolines.inference_commutative_predicate_p(predicate)) {
            return removal_module_utilities.additional_isa_supports(predicate, $$CommutativePredicate);
        }
        if (NIL != inference_trampolines.inference_partially_commutative_predicate_p(predicate)) {
            return append(removal_module_utilities.additional_isa_supports(predicate, $$PartiallyCommutativePredicate), removal_modules_symmetry.commutative_in_args_supports(predicate));
        }
        Errors.error($str13$Unexpected_commutative_predicate_, predicate);
        return NIL;
    }

    public static final SubLObject transformation_gaf_truth_known_alt(SubLObject gaf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $transformation_gaf_truth_known_disabled$.getDynamicValue(thread)) {
                return com.cyc.cycjava.cycl.inference.modules.transformation_modules.gaf_truth_known(gaf);
            }
            return NIL;
        }
    }

    public static SubLObject transformation_gaf_truth_known(final SubLObject gaf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $transformation_gaf_truth_known_disabled$.getDynamicValue(thread)) {
            return kb_mapping_utilities.gaf_truth_known(gaf);
        }
        return NIL;
    }

    public static final SubLObject modus_tollens_transformation_module_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != inference_modules.transformation_module_p(v_object)) && ($NEG == inference_modules.hl_module_sense(v_object)));
    }

    public static SubLObject modus_tollens_transformation_module_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_modules.transformation_module_p(v_object)) && $NEG.eql(inference_modules.hl_module_sense(v_object)));
    }

    public static final SubLObject modus_tollens_transformation_proof_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != inference_worker_transformation.transformation_proof_p(v_object)) && (NIL != com.cyc.cycjava.cycl.inference.modules.transformation_modules.modus_tollens_transformation_module_p(inference_worker.content_proof_hl_module(v_object))));
    }

    public static SubLObject modus_tollens_transformation_proof_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_worker_transformation.transformation_proof_p(v_object)) && (NIL != modus_tollens_transformation_module_p(inference_worker.content_proof_hl_module(v_object))));
    }

    public static final SubLObject do_transformation_relevant_directions_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt18);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject direction_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt18);
                    direction_var = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(DO_LIST, bq_cons(direction_var, $list_alt20), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt18);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_transformation_relevant_directions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list15);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject direction_var = NIL;
        destructuring_bind_must_consp(current, datum, $list15);
        direction_var = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_LIST, bq_cons(direction_var, $list17), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list15);
        return NIL;
    }

    public static final SubLObject do_transformation_rule_literals_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt21);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject rule_asent_var = NIL;
                    SubLObject rule = NIL;
                    SubLObject sense = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt21);
                    rule_asent_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt21);
                    rule = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt21);
                    sense = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_16 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt21);
                            current_16 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt21);
                            if (NIL == member(current_16, $list_alt22, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_16 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt21);
                        }
                        {
                            SubLObject predicate_tail = property_list_member($PREDICATE, current);
                            SubLObject predicate = (NIL != predicate_tail) ? ((SubLObject) (cadr(predicate_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                if (NIL != predicate) {
                                    {
                                        SubLObject predicate_var = $sym25$PREDICATE_VAR;
                                        return list(CLET, list(list(predicate_var, predicate)), list(DO_TRANSFORMATION_RULE_LITERALS, list(rule_asent_var, rule, sense), listS(PWHEN, list(EQ, predicate_var, list(ATOMIC_SENTENCE_PREDICATE, rule_asent_var)), append(body, NIL))));
                                    }
                                } else {
                                    {
                                        SubLObject rule_var = $sym30$RULE_VAR;
                                        return list(CLET, list(list(rule_var, rule)), list(PWHEN, list(RULE_RELEVANT_TO_PROOF, rule_var), listS(DO_ASSERTION_LITERALS, list(rule_asent_var, rule_var, $SENSE, sense, $PREDICATE, predicate), append(body, NIL))));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_transformation_rule_literals(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list18);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject rule_asent_var = NIL;
        SubLObject rule = NIL;
        SubLObject sense = NIL;
        destructuring_bind_must_consp(current, datum, $list18);
        rule_asent_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list18);
        rule = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list18);
        sense = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list18);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list18);
            if (NIL == member(current_$1, $list19, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list18);
        }
        final SubLObject predicate_tail = property_list_member($PREDICATE, current);
        final SubLObject predicate = (NIL != predicate_tail) ? cadr(predicate_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL != predicate) {
            final SubLObject predicate_var = $sym22$PREDICATE_VAR;
            return list(CLET, list(list(predicate_var, predicate)), list(DO_TRANSFORMATION_RULE_LITERALS, list(rule_asent_var, rule, sense), listS(PWHEN, list(EQL, predicate_var, list(ATOMIC_SENTENCE_PREDICATE, rule_asent_var)), append(body, NIL))));
        }
        final SubLObject rule_var = $sym27$RULE_VAR;
        return list(CLET, list(list(rule_var, rule)), list(PWHEN, list(RULE_RELEVANT_TO_PROOF, rule_var), listS(DO_ASSERTION_LITERALS, list(rule_asent_var, rule_var, $SENSE, sense, $PREDICATE, predicate), append(body, NIL))));
    }

    public static final SubLObject do_transformation_predicate_rule_index_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt34);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject rule_asent_var = NIL;
                    SubLObject rule_var = NIL;
                    SubLObject predicate = NIL;
                    SubLObject sense = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt34);
                    rule_asent_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt34);
                    rule_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt34);
                    predicate = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt34);
                    sense = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject direction_var = $sym35$DIRECTION_VAR;
                            SubLObject sense_var = $sym36$SENSE_VAR;
                            SubLObject predicate_var = $sym37$PREDICATE_VAR;
                            return list(CLET, list(list(sense_var, sense), list(predicate_var, predicate)), list(DO_TRANSFORMATION_RELEVANT_DIRECTIONS, list(direction_var), list(DO_PREDICATE_RULE_INDEX, list(rule_var, predicate_var, $SENSE, sense_var, $DIRECTION, direction_var), listS(DO_TRANSFORMATION_RULE_LITERALS, list(rule_asent_var, rule_var, sense_var, $PREDICATE, predicate_var), append(body, NIL)))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt34);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_transformation_predicate_rule_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list31);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject rule_asent_var = NIL;
        SubLObject rule_var = NIL;
        SubLObject predicate = NIL;
        SubLObject sense = NIL;
        destructuring_bind_must_consp(current, datum, $list31);
        rule_asent_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list31);
        rule_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list31);
        predicate = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list31);
        sense = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject direction_var = $sym32$DIRECTION_VAR;
            final SubLObject sense_var = $sym33$SENSE_VAR;
            final SubLObject predicate_var = $sym34$PREDICATE_VAR;
            return list(CLET, list(list(sense_var, sense), list(predicate_var, predicate)), list(DO_TRANSFORMATION_RELEVANT_DIRECTIONS, list(direction_var), list(DO_PREDICATE_RULE_INDEX, list(rule_var, predicate_var, $SENSE, sense_var, $DIRECTION, direction_var), listS(DO_TRANSFORMATION_RULE_LITERALS, list(rule_asent_var, rule_var, sense_var, $PREDICATE, predicate_var), append(body, NIL)))));
        }
        cdestructuring_bind_error(datum, $list31);
        return NIL;
    }

    public static final SubLObject new_selected_rules_alt() {
        return set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQ));
    }

    public static SubLObject new_selected_rules() {
        return set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQL));
    }

    public static final SubLObject add_selected_rule_alt(SubLObject rule, SubLObject selected_rules) {
        return set_contents.set_contents_add(rule, selected_rules, symbol_function(EQ));
    }

    public static SubLObject add_selected_rule(final SubLObject rule, final SubLObject selected_rules) {
        return set_contents.set_contents_add(rule, selected_rules, symbol_function(EQL));
    }

    public static final SubLObject finalize_selected_rules_alt(SubLObject selected_rules) {
        {
            SubLObject rules = set_contents.set_contents_element_list(selected_rules);
            return com.cyc.cycjava.cycl.inference.modules.transformation_modules.sort_rules_via_current_inference_rule_preference(rules);
        }
    }

    public static SubLObject finalize_selected_rules(final SubLObject selected_rules) {
        final SubLObject rules = set_contents.set_contents_element_list(selected_rules);
        return sort_rules_via_current_inference_rule_preference(rules);
    }

    public static final SubLObject sort_rules_via_current_inference_rule_preference_alt(SubLObject rules) {
        if (NIL != inference_macros.current_controlling_inference()) {
            return Sort.sort(rules, $sym41$CURRENT_INFERENCE_RULE_PREFERENCE__, UNPROVIDED);
        } else {
            return Sort.sort(rules, $sym42$TRANSFORMATION_RULE_UTILITY__, UNPROVIDED);
        }
    }

    public static SubLObject sort_rules_via_current_inference_rule_preference(final SubLObject rules) {
        if (NIL != inference_macros.current_controlling_inference()) {
            return Sort.sort(rules, $sym38$CURRENT_INFERENCE_RULE_PREFERENCE__, UNPROVIDED);
        }
        return Sort.sort(rules, $sym39$TRANSFORMATION_RULE_UTILITY__, UNPROVIDED);
    }

    public static final SubLObject current_inference_rule_preference_G_alt(SubLObject rule1, SubLObject rule2) {
        return inference_strategic_heuristics.inference_rule_preference_G(inference_macros.current_controlling_inference(), rule1, rule2);
    }

    public static SubLObject current_inference_rule_preference_G(final SubLObject rule1, final SubLObject rule2) {
        return inference_strategic_heuristics.inference_rule_preference_G(inference_macros.current_controlling_inference(), rule1, rule2);
    }

    public static final SubLObject trans_predicate_pos_required_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_required(asent);
    }

    public static SubLObject trans_predicate_pos_required(final SubLObject asent) {
        return trans_predicate_required(asent);
    }

    public static final SubLObject trans_predicate_neg_required_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_required(asent);
    }

    public static SubLObject trans_predicate_neg_required(final SubLObject asent) {
        return trans_predicate_required(asent);
    }

    public static final SubLObject trans_predicate_pos_cost_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_cost(asent, $POS);
    }

    public static SubLObject trans_predicate_pos_cost(final SubLObject asent) {
        return trans_predicate_cost(asent, $POS);
    }

    public static final SubLObject trans_predicate_neg_cost_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_cost(asent, $NEG);
    }

    public static SubLObject trans_predicate_neg_cost(final SubLObject asent) {
        return trans_predicate_cost(asent, $NEG);
    }

    public static final SubLObject trans_predicate_pos_rule_select_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_rule_select(asent, $POS);
    }

    public static SubLObject trans_predicate_pos_rule_select(final SubLObject asent) {
        return trans_predicate_rule_select(asent, $POS);
    }

    public static final SubLObject trans_predicate_neg_rule_select_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_rule_select(asent, $NEG);
    }

    public static SubLObject trans_predicate_neg_rule_select(final SubLObject asent) {
        return trans_predicate_rule_select(asent, $NEG);
    }

    public static final SubLObject trans_predicate_pos_rule_filter_alt(SubLObject asent, SubLObject rule) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_rule_filter(asent, $POS, rule);
    }

    public static SubLObject trans_predicate_pos_rule_filter(final SubLObject asent, final SubLObject rule) {
        return trans_predicate_rule_filter(asent, $POS, rule);
    }

    public static final SubLObject trans_predicate_neg_rule_filter_alt(SubLObject asent, SubLObject rule) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_rule_filter(asent, $NEG, rule);
    }

    public static SubLObject trans_predicate_neg_rule_filter(final SubLObject asent, final SubLObject rule) {
        return trans_predicate_rule_filter(asent, $NEG, rule);
    }

    public static final SubLObject trans_predicate_pos_expand_alt(SubLObject asent, SubLObject rule) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_expand(asent, $POS, rule);
    }

    public static SubLObject trans_predicate_pos_expand(final SubLObject asent, final SubLObject rule) {
        return trans_predicate_expand(asent, $POS, rule);
    }

    public static final SubLObject trans_predicate_neg_expand_alt(SubLObject asent, SubLObject rule) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_expand(asent, $NEG, rule);
    }

    public static SubLObject trans_predicate_neg_expand(final SubLObject asent, final SubLObject rule) {
        return trans_predicate_expand(asent, $NEG, rule);
    }

    public static final SubLObject trans_predicate_required_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean(!(((NIL != $unique_inference_result_bindings$.getDynamicValue(thread)) && (NIL != variables.fully_bound_p(asent))) && (NIL != com.cyc.cycjava.cycl.inference.modules.transformation_modules.transformation_gaf_truth_known(asent))));
        }
    }

    public static SubLObject trans_predicate_required(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL == $unique_inference_result_bindings$.getDynamicValue(thread)) || (NIL == variables.fully_bound_p(asent))) || (NIL == transformation_gaf_truth_known(asent)));
    }

    public static final SubLObject trans_predicate_cost_alt(SubLObject asent, SubLObject sense) {
        return kb_indexing.relevant_num_predicate_rule_index(cycl_utilities.atomic_sentence_predicate(asent), sense);
    }

    public static SubLObject trans_predicate_cost(final SubLObject asent, final SubLObject sense) {
        return kb_indexing.relevant_num_predicate_rule_index(cycl_utilities.atomic_sentence_predicate(asent), sense);
    }

    public static final SubLObject trans_predicate_rule_select_alt(SubLObject asent, SubLObject sense) {
        return copy_list(com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_rule_select_int(cycl_utilities.atomic_sentence_predicate(asent), sense));
    }

    public static SubLObject trans_predicate_rule_select(final SubLObject asent, final SubLObject sense) {
        return copy_list(trans_predicate_rule_select_int(cycl_utilities.atomic_sentence_predicate(asent), sense));
    }

    public static final SubLObject trans_predicate_rule_select_int_internal_alt(SubLObject predicate, SubLObject sense) {
        {
            SubLObject rules = com.cyc.cycjava.cycl.inference.modules.transformation_modules.new_selected_rules();
            SubLObject cdolist_list_var = backward_utilities.relevant_directions();
            SubLObject direction = NIL;
            for (direction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , direction = cdolist_list_var.first()) {
                if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(predicate, sense, direction)) {
                    {
                        SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(predicate, sense, direction);
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
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                            {
                                                SubLObject done_var_17 = NIL;
                                                SubLObject token_var_18 = NIL;
                                                while (NIL == done_var_17) {
                                                    {
                                                        SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_18);
                                                        SubLObject valid_19 = makeBoolean(token_var_18 != rule);
                                                        if (NIL != valid_19) {
                                                            rules = com.cyc.cycjava.cycl.inference.modules.transformation_modules.add_selected_rule(rule, rules);
                                                        }
                                                        done_var_17 = makeBoolean(NIL == valid_19);
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
            return com.cyc.cycjava.cycl.inference.modules.transformation_modules.finalize_selected_rules(rules);
        }
    }

    public static SubLObject trans_predicate_rule_select_int_internal(final SubLObject predicate, final SubLObject sense) {
        SubLObject rules = new_selected_rules();
        SubLObject cdolist_list_var = backward_utilities.relevant_directions();
        SubLObject direction = NIL;
        direction = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(predicate, sense, direction)) {
                final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(predicate, sense, direction);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                            SubLObject done_var_$2 = NIL;
                            final SubLObject token_var_$3 = NIL;
                            while (NIL == done_var_$2) {
                                final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                final SubLObject valid_$4 = makeBoolean(!token_var_$3.eql(rule));
                                if (NIL != valid_$4) {
                                    rules = add_selected_rule(rule, rules);
                                }
                                done_var_$2 = makeBoolean(NIL == valid_$4);
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
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        } 
        return finalize_selected_rules(rules);
    }

    public static final SubLObject trans_predicate_rule_select_int_alt(SubLObject predicate, SubLObject sense) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_rule_select_int_internal(predicate, sense);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, TRANS_PREDICATE_RULE_SELECT_INT, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), TRANS_PREDICATE_RULE_SELECT_INT, TWO_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, TRANS_PREDICATE_RULE_SELECT_INT, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, sense);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw50$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (predicate == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && (sense == cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_rule_select_int_internal(predicate, sense)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicate, sense));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject trans_predicate_rule_select_int(final SubLObject predicate, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return trans_predicate_rule_select_int_internal(predicate, sense);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, TRANS_PREDICATE_RULE_SELECT_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), TRANS_PREDICATE_RULE_SELECT_INT, TWO_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, TRANS_PREDICATE_RULE_SELECT_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, sense);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (predicate.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && sense.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(trans_predicate_rule_select_int_internal(predicate, sense)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(predicate, sense));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject trans_predicate_rule_filter_alt(SubLObject asent, SubLObject sense, SubLObject rule) {
        {
            SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            SubLObject predicate_var = predicate;
            SubLObject rule_var = rule;
            if (NIL != backward_utilities.rule_relevant_to_proof(rule_var)) {
                {
                    SubLObject assertion_var = rule_var;
                    SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
                    if ($POS == sense) {
                        {
                            SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
                            SubLObject examine = NIL;
                            for (examine = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , examine = cdolist_list_var.first()) {
                                if (predicate_var == cycl_utilities.atomic_sentence_predicate(examine)) {
                                    if (NIL != unification.unify_possible(asent, examine)) {
                                        return T;
                                    }
                                }
                            }
                        }
                    } else {
                        if ($NEG == sense) {
                            {
                                SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
                                SubLObject examine = NIL;
                                for (examine = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , examine = cdolist_list_var.first()) {
                                    if (predicate_var == cycl_utilities.atomic_sentence_predicate(examine)) {
                                        if (NIL != unification.unify_possible(asent, examine)) {
                                            return T;
                                        }
                                    }
                                }
                            }
                        } else {
                            Errors.error($str_alt51$Invalid_sense__s, sense);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject trans_predicate_rule_filter(final SubLObject asent, final SubLObject sense, final SubLObject rule) {
        final SubLObject predicate_var;
        final SubLObject predicate = predicate_var = cycl_utilities.atomic_sentence_predicate(asent);
        if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            if ($POS == sense) {
                SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
                SubLObject examine = NIL;
                examine = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(examine)) && (NIL != unification.unify_possible(asent, examine))) {
                        return T;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    examine = cdolist_list_var.first();
                } 
            } else
                if ($NEG == sense) {
                    SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
                    SubLObject examine = NIL;
                    examine = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(examine)) && (NIL != unification.unify_possible(asent, examine))) {
                            return T;
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        examine = cdolist_list_var.first();
                    } 
                } else {
                    Errors.error($str47$Invalid_sense__s, sense);
                }

        }
        return NIL;
    }

    public static final SubLObject trans_predicate_expand_alt(SubLObject asent, SubLObject sense, SubLObject rule) {
        {
            SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            SubLObject predicate_var = predicate;
            SubLObject rule_var = rule;
            if (NIL != backward_utilities.rule_relevant_to_proof(rule_var)) {
                {
                    SubLObject assertion_var = rule_var;
                    SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
                    if ($POS == sense) {
                        {
                            SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
                            SubLObject examine = NIL;
                            for (examine = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , examine = cdolist_list_var.first()) {
                                if (predicate_var == cycl_utilities.atomic_sentence_predicate(examine)) {
                                    {
                                        SubLObject v_bindings = unification_utilities.transformation_asent_unify(asent, examine);
                                        if (NIL != v_bindings) {
                                            backward.transformation_add_node(rule, examine, sense, v_bindings, UNPROVIDED);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if ($NEG == sense) {
                            {
                                SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
                                SubLObject examine = NIL;
                                for (examine = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , examine = cdolist_list_var.first()) {
                                    if (predicate_var == cycl_utilities.atomic_sentence_predicate(examine)) {
                                        {
                                            SubLObject v_bindings = unification_utilities.transformation_asent_unify(asent, examine);
                                            if (NIL != v_bindings) {
                                                backward.transformation_add_node(rule, examine, sense, v_bindings, UNPROVIDED);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            Errors.error($str_alt51$Invalid_sense__s, sense);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject trans_predicate_expand(SubLObject asent, final SubLObject sense, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        if (((NIL != inference_czer.backchaining_on_ist_enabledP()) && (NIL != ist_sentence_p(asent, UNPROVIDED))) && (NIL != variables.fully_bound_p(designated_mt(asent)))) {
            mt = designated_mt(asent);
            asent = designated_sentence(asent);
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject predicate_var;
            final SubLObject predicate = predicate_var = cycl_utilities.atomic_sentence_predicate(asent);
            if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
                final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
                if ($POS == sense) {
                    SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
                    SubLObject examine = NIL;
                    examine = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(examine))) {
                            final SubLObject v_bindings = unification_utilities.transformation_asent_unify(asent, examine);
                            if (NIL != v_bindings) {
                                backward.transformation_add_node(rule, examine, sense, v_bindings, UNPROVIDED);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        examine = cdolist_list_var.first();
                    } 
                } else
                    if ($NEG == sense) {
                        SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
                        SubLObject examine = NIL;
                        examine = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(examine))) {
                                final SubLObject v_bindings = unification_utilities.transformation_asent_unify(asent, examine);
                                if (NIL != v_bindings) {
                                    backward.transformation_add_node(rule, examine, sense, v_bindings, UNPROVIDED);
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            examine = cdolist_list_var.first();
                        } 
                    } else {
                        Errors.error($str47$Invalid_sense__s, sense);
                    }

            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject trans_predicate_genlpreds_pos_required_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_genlpreds_required(asent);
    }

    public static SubLObject trans_predicate_genlpreds_pos_required(final SubLObject asent) {
        return trans_predicate_genlpreds_required(asent);
    }

    public static final SubLObject trans_predicate_genlpreds_neg_required_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_genlpreds_required(asent);
    }

    public static SubLObject trans_predicate_genlpreds_neg_required(final SubLObject asent) {
        return trans_predicate_genlpreds_required(asent);
    }

    public static final SubLObject trans_predicate_genlpreds_pos_cost_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
                thread.resetMultipleValues();
                {
                    SubLObject spec_preds = inference_trampolines.inference_all_proper_spec_predicates_with_axiom_index(predicate, $POS);
                    SubLObject cost = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return cost;
                }
            }
        }
    }

    public static SubLObject trans_predicate_genlpreds_pos_cost(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        thread.resetMultipleValues();
        final SubLObject spec_preds = inference_trampolines.inference_all_proper_spec_predicates_with_axiom_index(predicate, $POS);
        final SubLObject cost = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return cost;
    }

    public static final SubLObject trans_predicate_genlpreds_neg_cost_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
                thread.resetMultipleValues();
                {
                    SubLObject genl_preds = inference_trampolines.inference_all_proper_genl_predicates_with_axiom_index(predicate, $NEG);
                    SubLObject cost = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return cost;
                }
            }
        }
    }

    public static SubLObject trans_predicate_genlpreds_neg_cost(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        thread.resetMultipleValues();
        final SubLObject genl_preds = inference_trampolines.inference_all_proper_genl_predicates_with_axiom_index(predicate, $NEG);
        final SubLObject cost = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return cost;
    }

    public static final SubLObject trans_predicate_genlpreds_pos_rule_select_alt(SubLObject asent) {
        return copy_list(com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_genlpreds_pos_rule_select_int(cycl_utilities.atomic_sentence_predicate(asent)));
    }

    public static SubLObject trans_predicate_genlpreds_pos_rule_select(final SubLObject asent) {
        return copy_list(trans_predicate_genlpreds_pos_rule_select_int(cycl_utilities.atomic_sentence_predicate(asent)));
    }

    public static final SubLObject trans_predicate_genlpreds_pos_rule_select_int_internal_alt(SubLObject predicate) {
        {
            SubLObject rules = com.cyc.cycjava.cycl.inference.modules.transformation_modules.new_selected_rules();
            SubLObject cdolist_list_var = inference_trampolines.inference_all_proper_spec_predicates_with_axiom_index(predicate, $POS);
            SubLObject index_pred = NIL;
            for (index_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , index_pred = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_20 = backward_utilities.relevant_directions();
                    SubLObject direction = NIL;
                    for (direction = cdolist_list_var_20.first(); NIL != cdolist_list_var_20; cdolist_list_var_20 = cdolist_list_var_20.rest() , direction = cdolist_list_var_20.first()) {
                        if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(index_pred, $POS, direction)) {
                            {
                                SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(index_pred, $POS, direction);
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
                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                                    {
                                                        SubLObject done_var_21 = NIL;
                                                        SubLObject token_var_22 = NIL;
                                                        while (NIL == done_var_21) {
                                                            {
                                                                SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_22);
                                                                SubLObject valid_23 = makeBoolean(token_var_22 != rule);
                                                                if (NIL != valid_23) {
                                                                    rules = com.cyc.cycjava.cycl.inference.modules.transformation_modules.add_selected_rule(rule, rules);
                                                                }
                                                                done_var_21 = makeBoolean(NIL == valid_23);
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
                }
            }
            return com.cyc.cycjava.cycl.inference.modules.transformation_modules.finalize_selected_rules(rules);
        }
    }

    public static SubLObject trans_predicate_genlpreds_pos_rule_select_int_internal(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rules = new_selected_rules();
        SubLObject cdolist_list_var = inference_trampolines.inference_all_proper_spec_predicates_with_axiom_index(predicate, $POS);
        SubLObject index_pred = NIL;
        index_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == inference_trampolines.inference_backchain_forbiddenP(index_pred, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
                SubLObject cdolist_list_var_$5 = backward_utilities.relevant_directions();
                SubLObject direction = NIL;
                direction = cdolist_list_var_$5.first();
                while (NIL != cdolist_list_var_$5) {
                    if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(index_pred, $POS, direction)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(index_pred, $POS, direction);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                    SubLObject done_var_$6 = NIL;
                                    final SubLObject token_var_$7 = NIL;
                                    while (NIL == done_var_$6) {
                                        final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$7);
                                        final SubLObject valid_$8 = makeBoolean(!token_var_$7.eql(rule));
                                        if (NIL != valid_$8) {
                                            rules = add_selected_rule(rule, rules);
                                        }
                                        done_var_$6 = makeBoolean(NIL == valid_$8);
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
                    cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                    direction = cdolist_list_var_$5.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            index_pred = cdolist_list_var.first();
        } 
        return finalize_selected_rules(rules);
    }

    public static final SubLObject trans_predicate_genlpreds_pos_rule_select_int_alt(SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_genlpreds_pos_rule_select_int_internal(predicate);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, TRANS_PREDICATE_GENLPREDS_POS_RULE_SELECT_INT, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), TRANS_PREDICATE_GENLPREDS_POS_RULE_SELECT_INT, ONE_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, TRANS_PREDICATE_GENLPREDS_POS_RULE_SELECT_INT, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, $kw50$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw50$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_genlpreds_pos_rule_select_int_internal(predicate)));
                        memoization_state.caching_state_put(caching_state, predicate, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject trans_predicate_genlpreds_pos_rule_select_int(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return trans_predicate_genlpreds_pos_rule_select_int_internal(predicate);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, TRANS_PREDICATE_GENLPREDS_POS_RULE_SELECT_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), TRANS_PREDICATE_GENLPREDS_POS_RULE_SELECT_INT, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, TRANS_PREDICATE_GENLPREDS_POS_RULE_SELECT_INT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(trans_predicate_genlpreds_pos_rule_select_int_internal(predicate)));
            memoization_state.caching_state_put(caching_state, predicate, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject trans_predicate_genlpreds_neg_rule_select_alt(SubLObject asent) {
        {
            SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            SubLObject rules = com.cyc.cycjava.cycl.inference.modules.transformation_modules.new_selected_rules();
            SubLObject cdolist_list_var = inference_trampolines.inference_all_proper_genl_predicates_with_axiom_index(predicate, $NEG);
            SubLObject index_pred = NIL;
            for (index_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , index_pred = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_24 = backward_utilities.relevant_directions();
                    SubLObject direction = NIL;
                    for (direction = cdolist_list_var_24.first(); NIL != cdolist_list_var_24; cdolist_list_var_24 = cdolist_list_var_24.rest() , direction = cdolist_list_var_24.first()) {
                        if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(index_pred, $NEG, direction)) {
                            {
                                SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(index_pred, $NEG, direction);
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
                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                                    {
                                                        SubLObject done_var_25 = NIL;
                                                        SubLObject token_var_26 = NIL;
                                                        while (NIL == done_var_25) {
                                                            {
                                                                SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_26);
                                                                SubLObject valid_27 = makeBoolean(token_var_26 != rule);
                                                                if (NIL != valid_27) {
                                                                    rules = com.cyc.cycjava.cycl.inference.modules.transformation_modules.add_selected_rule(rule, rules);
                                                                }
                                                                done_var_25 = makeBoolean(NIL == valid_27);
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
                }
            }
            return com.cyc.cycjava.cycl.inference.modules.transformation_modules.finalize_selected_rules(rules);
        }
    }

    public static SubLObject trans_predicate_genlpreds_neg_rule_select(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject rules = new_selected_rules();
        SubLObject cdolist_list_var = inference_trampolines.inference_all_proper_genl_predicates_with_axiom_index(predicate, $NEG);
        SubLObject index_pred = NIL;
        index_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == inference_trampolines.inference_backchain_forbiddenP(index_pred, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
                SubLObject cdolist_list_var_$9 = backward_utilities.relevant_directions();
                SubLObject direction = NIL;
                direction = cdolist_list_var_$9.first();
                while (NIL != cdolist_list_var_$9) {
                    if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(index_pred, $NEG, direction)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(index_pred, $NEG, direction);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                    SubLObject done_var_$10 = NIL;
                                    final SubLObject token_var_$11 = NIL;
                                    while (NIL == done_var_$10) {
                                        final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$11);
                                        final SubLObject valid_$12 = makeBoolean(!token_var_$11.eql(rule));
                                        if (NIL != valid_$12) {
                                            rules = add_selected_rule(rule, rules);
                                        }
                                        done_var_$10 = makeBoolean(NIL == valid_$12);
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
                    cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                    direction = cdolist_list_var_$9.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            index_pred = cdolist_list_var.first();
        } 
        return finalize_selected_rules(rules);
    }

    public static final SubLObject trans_predicate_genlpreds_pos_expand_int_alt(SubLObject asent, SubLObject rule) {
        {
            SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            SubLObject rule_var = rule;
            if (NIL != backward_utilities.rule_relevant_to_proof(rule_var)) {
                {
                    SubLObject assertion_var = rule_var;
                    SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
                    SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
                    SubLObject examine = NIL;
                    for (examine = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , examine = cdolist_list_var.first()) {
                        {
                            SubLObject index_pred = cycl_utilities.atomic_sentence_predicate(examine);
                            if (NIL != com.cyc.cycjava.cycl.inference.modules.transformation_modules.inference_proper_genl_predicateP(index_pred, predicate, UNPROVIDED)) {
                                {
                                    SubLObject index_pred_asent = replace_formula_arg(ZERO_INTEGER, index_pred, asent);
                                    SubLObject v_bindings = unification_utilities.transformation_asent_unify(index_pred_asent, examine);
                                    if (NIL != v_bindings) {
                                        return values(v_bindings, examine, index_pred, predicate);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return values(NIL, NIL, NIL, NIL);
    }

    public static SubLObject trans_predicate_genlpreds_pos_expand_int(final SubLObject asent, final SubLObject rule) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
            SubLObject examine = NIL;
            examine = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject index_pred = cycl_utilities.atomic_sentence_predicate(examine);
                if (NIL != inference_proper_genl_predicateP(index_pred, predicate, UNPROVIDED)) {
                    final SubLObject index_pred_asent = replace_formula_arg(ZERO_INTEGER, index_pred, asent);
                    final SubLObject v_bindings = unification_utilities.transformation_asent_unify(index_pred_asent, examine);
                    if (NIL != v_bindings) {
                        return values(v_bindings, examine, index_pred, predicate);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                examine = cdolist_list_var.first();
            } 
        }
        return values(NIL, NIL, NIL, NIL);
    }

    public static final SubLObject trans_predicate_genlpreds_pos_rule_filter_alt(SubLObject asent, SubLObject rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_bindings = com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_genlpreds_pos_expand_int(asent, rule);
                SubLObject examine = thread.secondMultipleValue();
                SubLObject index_pred = thread.thirdMultipleValue();
                SubLObject predicate = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    return T;
                }
            }
            return NIL;
        }
    }

    public static SubLObject trans_predicate_genlpreds_pos_rule_filter(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_predicate_genlpreds_pos_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject index_pred = thread.thirdMultipleValue();
        final SubLObject predicate = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != v_bindings) && (NIL == inference_trampolines.inference_backchain_forbiddenP(index_pred, mt_relevance_macros.$mt$.getDynamicValue(thread)))) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject trans_predicate_genlpreds_pos_expand_alt(SubLObject asent, SubLObject rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_bindings = com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_genlpreds_pos_expand_int(asent, rule);
                SubLObject examine = thread.secondMultipleValue();
                SubLObject index_pred = thread.thirdMultipleValue();
                SubLObject predicate = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    {
                        SubLObject more_supports = com.cyc.cycjava.cycl.inference.modules.transformation_modules.additional_genlpreds_supports(index_pred, predicate);
                        backward.transformation_add_node(rule, examine, $POS, v_bindings, more_supports);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject trans_predicate_genlpreds_pos_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_predicate_genlpreds_pos_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject index_pred = thread.thirdMultipleValue();
        final SubLObject predicate = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            final SubLObject more_supports = additional_genlpreds_supports(index_pred, predicate);
            backward.transformation_add_node(rule, examine, $POS, v_bindings, more_supports);
        }
        return NIL;
    }

    public static final SubLObject trans_predicate_genlpreds_neg_expand_int_alt(SubLObject asent, SubLObject rule) {
        {
            SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            SubLObject rule_var = rule;
            if (NIL != backward_utilities.rule_relevant_to_proof(rule_var)) {
                {
                    SubLObject assertion_var = rule_var;
                    SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
                    SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
                    SubLObject examine = NIL;
                    for (examine = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , examine = cdolist_list_var.first()) {
                        {
                            SubLObject index_pred = cycl_utilities.atomic_sentence_predicate(examine);
                            if (NIL != com.cyc.cycjava.cycl.inference.modules.transformation_modules.inference_proper_genl_predicateP(predicate, index_pred, UNPROVIDED)) {
                                {
                                    SubLObject index_pred_asent = replace_formula_arg(ZERO_INTEGER, index_pred, asent);
                                    SubLObject v_bindings = unification_utilities.transformation_asent_unify(index_pred_asent, examine);
                                    if (NIL != v_bindings) {
                                        return values(v_bindings, examine, predicate, index_pred);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return values(NIL, NIL, NIL, NIL);
    }

    public static SubLObject trans_predicate_genlpreds_neg_expand_int(final SubLObject asent, final SubLObject rule) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
            SubLObject examine = NIL;
            examine = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject index_pred = cycl_utilities.atomic_sentence_predicate(examine);
                if (NIL != inference_proper_genl_predicateP(predicate, index_pred, UNPROVIDED)) {
                    final SubLObject index_pred_asent = replace_formula_arg(ZERO_INTEGER, index_pred, asent);
                    final SubLObject v_bindings = unification_utilities.transformation_asent_unify(index_pred_asent, examine);
                    if (NIL != v_bindings) {
                        return values(v_bindings, examine, predicate, index_pred);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                examine = cdolist_list_var.first();
            } 
        }
        return values(NIL, NIL, NIL, NIL);
    }

    public static final SubLObject trans_predicate_genlpreds_neg_rule_filter_alt(SubLObject asent, SubLObject rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_bindings = com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_genlpreds_neg_expand_int(asent, rule);
                SubLObject examine = thread.secondMultipleValue();
                SubLObject predicate = thread.thirdMultipleValue();
                SubLObject index_pred = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    return T;
                }
            }
            return NIL;
        }
    }

    public static SubLObject trans_predicate_genlpreds_neg_rule_filter(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_predicate_genlpreds_neg_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject predicate = thread.thirdMultipleValue();
        final SubLObject index_pred = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != v_bindings) && (NIL == inference_trampolines.inference_backchain_forbiddenP(index_pred, mt_relevance_macros.$mt$.getDynamicValue(thread)))) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject trans_predicate_genlpreds_neg_expand_alt(SubLObject asent, SubLObject rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_bindings = com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_genlpreds_neg_expand_int(asent, rule);
                SubLObject examine = thread.secondMultipleValue();
                SubLObject predicate = thread.thirdMultipleValue();
                SubLObject index_pred = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    {
                        SubLObject more_supports = com.cyc.cycjava.cycl.inference.modules.transformation_modules.additional_genlpreds_supports(predicate, index_pred);
                        backward.transformation_add_node(rule, examine, $NEG, v_bindings, more_supports);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject trans_predicate_genlpreds_neg_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_predicate_genlpreds_neg_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject predicate = thread.thirdMultipleValue();
        final SubLObject index_pred = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            final SubLObject more_supports = additional_genlpreds_supports(predicate, index_pred);
            backward.transformation_add_node(rule, examine, $NEG, v_bindings, more_supports);
        }
        return NIL;
    }

    public static final SubLObject trans_predicate_genlpreds_required_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean(!(((NIL != $unique_inference_result_bindings$.getDynamicValue(thread)) && (NIL != variables.fully_bound_p(asent))) && (NIL != com.cyc.cycjava.cycl.inference.modules.transformation_modules.transformation_gaf_truth_known(asent))));
        }
    }

    public static SubLObject trans_predicate_genlpreds_required(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL == $unique_inference_result_bindings$.getDynamicValue(thread)) || (NIL == variables.fully_bound_p(asent))) || (NIL == transformation_gaf_truth_known(asent)));
    }

    public static SubLObject inference_proper_genl_predicateP_internal(final SubLObject spec_pred, final SubLObject genl_pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (((((!spec_pred.eql(genl_pred)) && (NIL != forts.fort_p(spec_pred))) && (NIL != forts.fort_p(genl_pred))) && (NIL != fort_types_interface.predicateP(spec_pred))) && (NIL != fort_types_interface.predicateP(genl_pred))) {
            return genl_predicates.genl_predicateP(spec_pred, genl_pred, mt, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject inference_proper_genl_predicateP_alt(SubLObject spec_pred, SubLObject genl_pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $mt$.getDynamicValue();
        }
        if (((((spec_pred != genl_pred) && (NIL != fort_p(spec_pred))) && (NIL != fort_p(genl_pred))) && (NIL != predicateP(spec_pred))) && (NIL != predicateP(genl_pred))) {
            return genl_predicateP(spec_pred, genl_pred, mt, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject inference_proper_genl_predicateP(final SubLObject spec_pred, final SubLObject genl_pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_proper_genl_predicateP_internal(spec_pred, genl_pred, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym53$INFERENCE_PROPER_GENL_PREDICATE_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym53$INFERENCE_PROPER_GENL_PREDICATE_, THREE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym53$INFERENCE_PROPER_GENL_PREDICATE_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(spec_pred, genl_pred, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (spec_pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (genl_pred.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_proper_genl_predicateP_internal(spec_pred, genl_pred, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(spec_pred, genl_pred, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject trans_predicate_genlinverse_pos_required(final SubLObject asent) {
        return trans_predicate_genlpreds_required(asent);
    }

    public static SubLObject trans_predicate_genlinverse_neg_required(final SubLObject asent) {
        return trans_predicate_genlpreds_required(asent);
    }

    public static SubLObject trans_predicate_genlinverse_pos_cost(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        thread.resetMultipleValues();
        final SubLObject spec_inverses = inference_trampolines.inference_all_proper_spec_inverses_with_axiom_index(predicate, $POS);
        final SubLObject cost = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return cost;
    }

    public static SubLObject trans_predicate_genlinverse_neg_cost(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        thread.resetMultipleValues();
        final SubLObject genl_inverses = inference_trampolines.inference_all_proper_genl_inverses_with_axiom_index(predicate, $NEG);
        final SubLObject cost = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return cost;
    }

    public static SubLObject trans_predicate_genlinverse_pos_rule_select(final SubLObject asent) {
        return copy_list(trans_predicate_genlinverse_pos_rule_select_int(cycl_utilities.atomic_sentence_predicate(asent)));
    }

    public static SubLObject trans_predicate_genlinverse_pos_rule_select_int_internal(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rules = new_selected_rules();
        SubLObject cdolist_list_var = inference_trampolines.inference_all_proper_spec_inverses_with_axiom_index(predicate, $POS);
        SubLObject index_pred = NIL;
        index_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == inference_trampolines.inference_backchain_forbiddenP(index_pred, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
                SubLObject cdolist_list_var_$13 = backward_utilities.relevant_directions();
                SubLObject direction = NIL;
                direction = cdolist_list_var_$13.first();
                while (NIL != cdolist_list_var_$13) {
                    if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(index_pred, $POS, direction)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(index_pred, $POS, direction);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                    SubLObject done_var_$14 = NIL;
                                    final SubLObject token_var_$15 = NIL;
                                    while (NIL == done_var_$14) {
                                        final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$15);
                                        final SubLObject valid_$16 = makeBoolean(!token_var_$15.eql(rule));
                                        if (NIL != valid_$16) {
                                            rules = add_selected_rule(rule, rules);
                                        }
                                        done_var_$14 = makeBoolean(NIL == valid_$16);
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
                    cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                    direction = cdolist_list_var_$13.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            index_pred = cdolist_list_var.first();
        } 
        return finalize_selected_rules(rules);
    }

    public static SubLObject trans_predicate_genlinverse_pos_rule_select_int(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return trans_predicate_genlinverse_pos_rule_select_int_internal(predicate);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, TRANS_PREDICATE_GENLINVERSE_POS_RULE_SELECT_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), TRANS_PREDICATE_GENLINVERSE_POS_RULE_SELECT_INT, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, TRANS_PREDICATE_GENLINVERSE_POS_RULE_SELECT_INT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(trans_predicate_genlinverse_pos_rule_select_int_internal(predicate)));
            memoization_state.caching_state_put(caching_state, predicate, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject trans_predicate_genlinverse_neg_rule_select(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject rules = new_selected_rules();
        SubLObject cdolist_list_var = inference_trampolines.inference_all_proper_genl_inverses_with_axiom_index(predicate, $NEG);
        SubLObject index_pred = NIL;
        index_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == inference_trampolines.inference_backchain_forbiddenP(index_pred, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
                SubLObject cdolist_list_var_$17 = backward_utilities.relevant_directions();
                SubLObject direction = NIL;
                direction = cdolist_list_var_$17.first();
                while (NIL != cdolist_list_var_$17) {
                    if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(index_pred, $NEG, direction)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(index_pred, $NEG, direction);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                    SubLObject done_var_$18 = NIL;
                                    final SubLObject token_var_$19 = NIL;
                                    while (NIL == done_var_$18) {
                                        final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$19);
                                        final SubLObject valid_$20 = makeBoolean(!token_var_$19.eql(rule));
                                        if (NIL != valid_$20) {
                                            rules = add_selected_rule(rule, rules);
                                        }
                                        done_var_$18 = makeBoolean(NIL == valid_$20);
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
                    cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                    direction = cdolist_list_var_$17.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            index_pred = cdolist_list_var.first();
        } 
        return finalize_selected_rules(rules);
    }

    public static SubLObject trans_predicate_genlinverse_pos_expand_int(final SubLObject asent, final SubLObject rule) {
        final SubLObject inverted_asent = removal_modules_symmetry.symmetric_asent(asent);
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(inverted_asent);
        if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
            SubLObject examine = NIL;
            examine = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject index_pred = cycl_utilities.atomic_sentence_predicate(examine);
                if (NIL != inference_proper_genl_inverseP(index_pred, predicate, UNPROVIDED)) {
                    final SubLObject index_pred_asent = replace_formula_arg(ZERO_INTEGER, index_pred, inverted_asent);
                    final SubLObject v_bindings = unification_utilities.transformation_asent_unify(index_pred_asent, examine);
                    if (NIL != v_bindings) {
                        return values(v_bindings, examine, index_pred, predicate);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                examine = cdolist_list_var.first();
            } 
        }
        return values(NIL, NIL, NIL, NIL);
    }

    public static SubLObject trans_predicate_genlinverse_pos_rule_filter(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_predicate_genlinverse_pos_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject index_pred = thread.thirdMultipleValue();
        final SubLObject predicate = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != v_bindings) && (NIL == inference_trampolines.inference_backchain_forbiddenP(index_pred, mt_relevance_macros.$mt$.getDynamicValue(thread)))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject trans_predicate_genlinverse_pos_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_predicate_genlinverse_pos_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject index_pred = thread.thirdMultipleValue();
        final SubLObject predicate = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            final SubLObject more_supports = additional_genlinverse_supports(index_pred, predicate);
            backward.transformation_add_node(rule, examine, $POS, v_bindings, more_supports);
        }
        return NIL;
    }

    public static SubLObject trans_predicate_genlinverse_neg_expand_int(final SubLObject asent, final SubLObject rule) {
        final SubLObject inverted_asent = removal_modules_symmetry.symmetric_asent(asent);
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(inverted_asent);
        if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
            SubLObject examine = NIL;
            examine = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject index_pred = cycl_utilities.atomic_sentence_predicate(examine);
                if (NIL != inference_proper_genl_inverseP(predicate, index_pred, UNPROVIDED)) {
                    final SubLObject index_pred_asent = replace_formula_arg(ZERO_INTEGER, index_pred, inverted_asent);
                    final SubLObject v_bindings = unification_utilities.transformation_asent_unify(index_pred_asent, examine);
                    if (NIL != v_bindings) {
                        return values(v_bindings, examine, predicate, index_pred);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                examine = cdolist_list_var.first();
            } 
        }
        return values(NIL, NIL, NIL, NIL);
    }

    public static SubLObject trans_predicate_genlinverse_neg_rule_filter(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_predicate_genlinverse_neg_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject predicate = thread.thirdMultipleValue();
        final SubLObject index_pred = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != v_bindings) && (NIL == inference_trampolines.inference_backchain_forbiddenP(index_pred, mt_relevance_macros.$mt$.getDynamicValue(thread)))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject trans_predicate_genlinverse_neg_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_predicate_genlinverse_neg_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject predicate = thread.thirdMultipleValue();
        final SubLObject index_pred = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            final SubLObject more_supports = additional_genlinverse_supports(predicate, index_pred);
            backward.transformation_add_node(rule, examine, $NEG, v_bindings, more_supports);
        }
        return NIL;
    }

    public static SubLObject inference_proper_genl_inverseP_internal(final SubLObject spec_pred, final SubLObject genl_inverse, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (((((!spec_pred.eql(genl_inverse)) && (NIL != forts.fort_p(spec_pred))) && (NIL != forts.fort_p(genl_inverse))) && (NIL != fort_types_interface.predicateP(spec_pred))) && (NIL != fort_types_interface.predicateP(genl_inverse))) {
            return genl_predicates.genl_inverseP(spec_pred, genl_inverse, mt, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject inference_proper_genl_inverseP(final SubLObject spec_pred, final SubLObject genl_inverse, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_proper_genl_inverseP_internal(spec_pred, genl_inverse, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym59$INFERENCE_PROPER_GENL_INVERSE_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym59$INFERENCE_PROPER_GENL_INVERSE_, THREE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym59$INFERENCE_PROPER_GENL_INVERSE_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(spec_pred, genl_inverse, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (spec_pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (genl_inverse.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_proper_genl_inverseP_internal(spec_pred, genl_inverse, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(spec_pred, genl_inverse, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject trans_predicate_negationpreds_neg_required_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean(!(((NIL != $unique_inference_result_bindings$.getDynamicValue(thread)) && (NIL != variables.fully_bound_p(asent))) && (NIL != com.cyc.cycjava.cycl.inference.modules.transformation_modules.transformation_gaf_truth_known(asent))));
        }
    }

    public static SubLObject trans_predicate_negationpreds_neg_required(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL == $unique_inference_result_bindings$.getDynamicValue(thread)) || (NIL == variables.fully_bound_p(asent))) || (NIL == transformation_gaf_truth_known(asent)));
    }

    public static final SubLObject trans_predicate_negationpreds_neg_cost_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
                thread.resetMultipleValues();
                {
                    SubLObject negation_preds = inference_trampolines.inference_all_negation_predicates_with_axiom_index(predicate, $POS);
                    SubLObject cost = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return cost;
                }
            }
        }
    }

    public static SubLObject trans_predicate_negationpreds_neg_cost(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        thread.resetMultipleValues();
        final SubLObject negation_preds = inference_trampolines.inference_all_negation_predicates_with_axiom_index(predicate, $POS);
        final SubLObject cost = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return cost;
    }

    public static final SubLObject trans_predicate_negationpreds_neg_rule_select_alt(SubLObject asent) {
        {
            SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            SubLObject rules = com.cyc.cycjava.cycl.inference.modules.transformation_modules.new_selected_rules();
            SubLObject cdolist_list_var = inference_trampolines.inference_all_negation_predicates_with_axiom_index(predicate, $POS);
            SubLObject index_pred = NIL;
            for (index_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , index_pred = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_28 = backward_utilities.relevant_directions();
                    SubLObject direction = NIL;
                    for (direction = cdolist_list_var_28.first(); NIL != cdolist_list_var_28; cdolist_list_var_28 = cdolist_list_var_28.rest() , direction = cdolist_list_var_28.first()) {
                        if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(index_pred, $POS, direction)) {
                            {
                                SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(index_pred, $POS, direction);
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
                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                                    {
                                                        SubLObject done_var_29 = NIL;
                                                        SubLObject token_var_30 = NIL;
                                                        while (NIL == done_var_29) {
                                                            {
                                                                SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_30);
                                                                SubLObject valid_31 = makeBoolean(token_var_30 != rule);
                                                                if (NIL != valid_31) {
                                                                    rules = com.cyc.cycjava.cycl.inference.modules.transformation_modules.add_selected_rule(rule, rules);
                                                                }
                                                                done_var_29 = makeBoolean(NIL == valid_31);
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
                }
            }
            return com.cyc.cycjava.cycl.inference.modules.transformation_modules.finalize_selected_rules(rules);
        }
    }

    public static SubLObject trans_predicate_negationpreds_neg_rule_select(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject rules = new_selected_rules();
        SubLObject cdolist_list_var = inference_trampolines.inference_all_negation_predicates_with_axiom_index(predicate, $POS);
        SubLObject index_pred = NIL;
        index_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == inference_trampolines.inference_backchain_forbiddenP(index_pred, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
                SubLObject cdolist_list_var_$21 = backward_utilities.relevant_directions();
                SubLObject direction = NIL;
                direction = cdolist_list_var_$21.first();
                while (NIL != cdolist_list_var_$21) {
                    if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(index_pred, $POS, direction)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(index_pred, $POS, direction);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                    SubLObject done_var_$22 = NIL;
                                    final SubLObject token_var_$23 = NIL;
                                    while (NIL == done_var_$22) {
                                        final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$23);
                                        final SubLObject valid_$24 = makeBoolean(!token_var_$23.eql(rule));
                                        if (NIL != valid_$24) {
                                            rules = add_selected_rule(rule, rules);
                                        }
                                        done_var_$22 = makeBoolean(NIL == valid_$24);
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
                    cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                    direction = cdolist_list_var_$21.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            index_pred = cdolist_list_var.first();
        } 
        return finalize_selected_rules(rules);
    }

    public static final SubLObject trans_predicate_negationpreds_neg_expand_int_alt(SubLObject asent, SubLObject rule) {
        {
            SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            SubLObject rule_var = rule;
            if (NIL != backward_utilities.rule_relevant_to_proof(rule_var)) {
                {
                    SubLObject assertion_var = rule_var;
                    SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
                    SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
                    SubLObject examine = NIL;
                    for (examine = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , examine = cdolist_list_var.first()) {
                        {
                            SubLObject index_pred = cycl_utilities.atomic_sentence_predicate(examine);
                            if (NIL != negation_predicate.negation_predicateP(index_pred, predicate, UNPROVIDED, UNPROVIDED)) {
                                {
                                    SubLObject index_pred_asent = replace_formula_arg(ZERO_INTEGER, index_pred, asent);
                                    SubLObject v_bindings = unification_utilities.transformation_asent_unify(index_pred_asent, examine);
                                    if (NIL != v_bindings) {
                                        return values(v_bindings, examine, index_pred, predicate);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return values(NIL, NIL, NIL, NIL);
    }

    public static SubLObject trans_predicate_negationpreds_neg_expand_int(final SubLObject asent, final SubLObject rule) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
            SubLObject examine = NIL;
            examine = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject index_pred = cycl_utilities.atomic_sentence_predicate(examine);
                if (NIL != negation_predicate.negation_predicateP(index_pred, predicate, UNPROVIDED, UNPROVIDED)) {
                    final SubLObject index_pred_asent = replace_formula_arg(ZERO_INTEGER, index_pred, asent);
                    final SubLObject v_bindings = unification_utilities.transformation_asent_unify(index_pred_asent, examine);
                    if (NIL != v_bindings) {
                        return values(v_bindings, examine, index_pred, predicate);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                examine = cdolist_list_var.first();
            } 
        }
        return values(NIL, NIL, NIL, NIL);
    }

    public static final SubLObject trans_predicate_negationpreds_neg_rule_filter_alt(SubLObject asent, SubLObject rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_bindings = com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_negationpreds_neg_expand_int(asent, rule);
                SubLObject examine = thread.secondMultipleValue();
                SubLObject index_pred = thread.thirdMultipleValue();
                SubLObject predicate = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    return T;
                }
            }
            return NIL;
        }
    }

    public static SubLObject trans_predicate_negationpreds_neg_rule_filter(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_predicate_negationpreds_neg_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject index_pred = thread.thirdMultipleValue();
        final SubLObject predicate = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != v_bindings) && (NIL == inference_trampolines.inference_backchain_forbiddenP(index_pred, mt_relevance_macros.$mt$.getDynamicValue(thread)))) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject trans_predicate_negationpreds_neg_expand_alt(SubLObject asent, SubLObject rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_bindings = com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_negationpreds_neg_expand_int(asent, rule);
                SubLObject examine = thread.secondMultipleValue();
                SubLObject index_pred = thread.thirdMultipleValue();
                SubLObject predicate = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    {
                        SubLObject more_supports = com.cyc.cycjava.cycl.inference.modules.transformation_modules.additional_negationpreds_supports(index_pred, predicate);
                        backward.transformation_add_node(rule, examine, $POS, v_bindings, more_supports);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject trans_predicate_negationpreds_neg_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_predicate_negationpreds_neg_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject index_pred = thread.thirdMultipleValue();
        final SubLObject predicate = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            final SubLObject more_supports = additional_negationpreds_supports(index_pred, predicate);
            backward.transformation_add_node(rule, examine, $POS, v_bindings, more_supports);
        }
        return NIL;
    }

    public static final SubLObject trans_predicate_commutativity_cost_alt(SubLObject asent, SubLObject sense) {
        {
            SubLObject cost = ZERO_INTEGER;
            SubLObject source_formula_var = asent;
            if (NIL != el_binary_formula_p(source_formula_var)) {
                {
                    SubLObject permuted_asent = removal_modules_symmetry.symmetric_asent(source_formula_var);
                    cost = add(cost, com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_cost(permuted_asent, sense));
                }
            } else {
                {
                    SubLObject cdolist_list_var = cycl_utilities.formula_commutative_permutations(source_formula_var, UNPROVIDED);
                    SubLObject permuted_asent = NIL;
                    for (permuted_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , permuted_asent = cdolist_list_var.first()) {
                        if (!permuted_asent.equal(source_formula_var)) {
                            cost = add(cost, com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_cost(permuted_asent, sense));
                        }
                    }
                }
            }
            return cost;
        }
    }

    public static SubLObject trans_predicate_commutativity_cost(final SubLObject asent, final SubLObject sense) {
        SubLObject cost = ZERO_INTEGER;
        if (NIL != el_binary_formula_p(asent)) {
            final SubLObject permuted_asent = removal_modules_symmetry.symmetric_asent(asent);
            cost = add(cost, trans_predicate_cost(permuted_asent, sense));
        } else {
            SubLObject cdolist_list_var = cycl_utilities.formula_commutative_permutations(asent, UNPROVIDED);
            SubLObject permuted_asent2 = NIL;
            permuted_asent2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (!permuted_asent2.equal(asent)) {
                    cost = add(cost, trans_predicate_cost(permuted_asent2, sense));
                }
                cdolist_list_var = cdolist_list_var.rest();
                permuted_asent2 = cdolist_list_var.first();
            } 
        }
        return cost;
    }

    public static final SubLObject trans_predicate_commutativity_rule_select_alt(SubLObject asent, SubLObject sense) {
        {
            SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            SubLObject rules = com.cyc.cycjava.cycl.inference.modules.transformation_modules.new_selected_rules();
            SubLObject cdolist_list_var = backward_utilities.relevant_directions();
            SubLObject direction = NIL;
            for (direction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , direction = cdolist_list_var.first()) {
                if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(predicate, sense, direction)) {
                    {
                        SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(predicate, sense, direction);
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
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                            {
                                                SubLObject done_var_32 = NIL;
                                                SubLObject token_var_33 = NIL;
                                                while (NIL == done_var_32) {
                                                    {
                                                        SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_33);
                                                        SubLObject valid_34 = makeBoolean(token_var_33 != rule);
                                                        if (NIL != valid_34) {
                                                            rules = com.cyc.cycjava.cycl.inference.modules.transformation_modules.add_selected_rule(rule, rules);
                                                        }
                                                        done_var_32 = makeBoolean(NIL == valid_34);
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
            return com.cyc.cycjava.cycl.inference.modules.transformation_modules.finalize_selected_rules(rules);
        }
    }

    public static SubLObject trans_predicate_commutativity_rule_select(final SubLObject asent, final SubLObject sense) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject rules = new_selected_rules();
        SubLObject cdolist_list_var = backward_utilities.relevant_directions();
        SubLObject direction = NIL;
        direction = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(predicate, sense, direction)) {
                final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(predicate, sense, direction);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                            SubLObject done_var_$25 = NIL;
                            final SubLObject token_var_$26 = NIL;
                            while (NIL == done_var_$25) {
                                final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$26);
                                final SubLObject valid_$27 = makeBoolean(!token_var_$26.eql(rule));
                                if (NIL != valid_$27) {
                                    rules = add_selected_rule(rule, rules);
                                }
                                done_var_$25 = makeBoolean(NIL == valid_$27);
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
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        } 
        return finalize_selected_rules(rules);
    }

    public static final SubLObject trans_predicate_commutativity_expand_int_alt(SubLObject asent, SubLObject sense, SubLObject rule) {
        {
            SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            SubLObject source_formula_var = asent;
            if (NIL != el_binary_formula_p(source_formula_var)) {
                {
                    SubLObject permuted_asent = removal_modules_symmetry.symmetric_asent(source_formula_var);
                    SubLObject predicate_var = predicate;
                    SubLObject rule_var = rule;
                    if (NIL != backward_utilities.rule_relevant_to_proof(rule_var)) {
                        {
                            SubLObject assertion_var = rule_var;
                            SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
                            if ($POS == sense) {
                                {
                                    SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
                                    SubLObject examine = NIL;
                                    for (examine = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , examine = cdolist_list_var.first()) {
                                        if (predicate_var == cycl_utilities.atomic_sentence_predicate(examine)) {
                                            {
                                                SubLObject v_bindings = unification_utilities.transformation_asent_unify(permuted_asent, examine);
                                                if (NIL != v_bindings) {
                                                    return values(v_bindings, examine, predicate);
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                if ($NEG == sense) {
                                    {
                                        SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
                                        SubLObject examine = NIL;
                                        for (examine = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , examine = cdolist_list_var.first()) {
                                            if (predicate_var == cycl_utilities.atomic_sentence_predicate(examine)) {
                                                {
                                                    SubLObject v_bindings = unification_utilities.transformation_asent_unify(permuted_asent, examine);
                                                    if (NIL != v_bindings) {
                                                        return values(v_bindings, examine, predicate);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    Errors.error($str_alt51$Invalid_sense__s, sense);
                                }
                            }
                        }
                    }
                }
            } else {
                {
                    SubLObject cdolist_list_var = cycl_utilities.formula_commutative_permutations(source_formula_var, UNPROVIDED);
                    SubLObject permuted_asent = NIL;
                    for (permuted_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , permuted_asent = cdolist_list_var.first()) {
                        if (!permuted_asent.equal(source_formula_var)) {
                            {
                                SubLObject predicate_var = predicate;
                                SubLObject rule_var = rule;
                                if (NIL != backward_utilities.rule_relevant_to_proof(rule_var)) {
                                    {
                                        SubLObject assertion_var = rule_var;
                                        SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
                                        if ($POS == sense) {
                                            {
                                                SubLObject cdolist_list_var_35 = clauses.pos_lits(cnf_var);
                                                SubLObject examine = NIL;
                                                for (examine = cdolist_list_var_35.first(); NIL != cdolist_list_var_35; cdolist_list_var_35 = cdolist_list_var_35.rest() , examine = cdolist_list_var_35.first()) {
                                                    if (predicate_var == cycl_utilities.atomic_sentence_predicate(examine)) {
                                                        {
                                                            SubLObject v_bindings = unification_utilities.transformation_asent_unify(permuted_asent, examine);
                                                            if (NIL != v_bindings) {
                                                                return values(v_bindings, examine, predicate);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            if ($NEG == sense) {
                                                {
                                                    SubLObject cdolist_list_var_36 = clauses.neg_lits(cnf_var);
                                                    SubLObject examine = NIL;
                                                    for (examine = cdolist_list_var_36.first(); NIL != cdolist_list_var_36; cdolist_list_var_36 = cdolist_list_var_36.rest() , examine = cdolist_list_var_36.first()) {
                                                        if (predicate_var == cycl_utilities.atomic_sentence_predicate(examine)) {
                                                            {
                                                                SubLObject v_bindings = unification_utilities.transformation_asent_unify(permuted_asent, examine);
                                                                if (NIL != v_bindings) {
                                                                    return values(v_bindings, examine, predicate);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                Errors.error($str_alt51$Invalid_sense__s, sense);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return values(NIL, NIL, NIL);
    }

    public static SubLObject trans_predicate_commutativity_expand_int(final SubLObject asent, final SubLObject sense, final SubLObject rule) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (NIL != el_binary_formula_p(asent)) {
            final SubLObject permuted_asent = removal_modules_symmetry.symmetric_asent(asent);
            final SubLObject predicate_var = predicate;
            if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
                final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
                if ($POS == sense) {
                    SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
                    SubLObject examine = NIL;
                    examine = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(examine))) {
                            final SubLObject v_bindings = unification_utilities.transformation_asent_unify(permuted_asent, examine);
                            if (NIL != v_bindings) {
                                return values(v_bindings, examine, predicate);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        examine = cdolist_list_var.first();
                    } 
                } else
                    if ($NEG == sense) {
                        SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
                        SubLObject examine = NIL;
                        examine = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(examine))) {
                                final SubLObject v_bindings = unification_utilities.transformation_asent_unify(permuted_asent, examine);
                                if (NIL != v_bindings) {
                                    return values(v_bindings, examine, predicate);
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            examine = cdolist_list_var.first();
                        } 
                    } else {
                        Errors.error($str47$Invalid_sense__s, sense);
                    }

            }
        } else {
            SubLObject cdolist_list_var2 = cycl_utilities.formula_commutative_permutations(asent, UNPROVIDED);
            SubLObject permuted_asent2 = NIL;
            permuted_asent2 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                if (!permuted_asent2.equal(asent)) {
                    final SubLObject predicate_var2 = predicate;
                    if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
                        final SubLObject cnf_var2 = assertions_high.assertion_cnf(rule);
                        if ($POS == sense) {
                            SubLObject cdolist_list_var_$28 = clauses.pos_lits(cnf_var2);
                            SubLObject examine2 = NIL;
                            examine2 = cdolist_list_var_$28.first();
                            while (NIL != cdolist_list_var_$28) {
                                if (predicate_var2.eql(cycl_utilities.atomic_sentence_predicate(examine2))) {
                                    final SubLObject v_bindings2 = unification_utilities.transformation_asent_unify(permuted_asent2, examine2);
                                    if (NIL != v_bindings2) {
                                        return values(v_bindings2, examine2, predicate);
                                    }
                                }
                                cdolist_list_var_$28 = cdolist_list_var_$28.rest();
                                examine2 = cdolist_list_var_$28.first();
                            } 
                        } else
                            if ($NEG == sense) {
                                SubLObject cdolist_list_var_$29 = clauses.neg_lits(cnf_var2);
                                SubLObject examine2 = NIL;
                                examine2 = cdolist_list_var_$29.first();
                                while (NIL != cdolist_list_var_$29) {
                                    if (predicate_var2.eql(cycl_utilities.atomic_sentence_predicate(examine2))) {
                                        final SubLObject v_bindings2 = unification_utilities.transformation_asent_unify(permuted_asent2, examine2);
                                        if (NIL != v_bindings2) {
                                            return values(v_bindings2, examine2, predicate);
                                        }
                                    }
                                    cdolist_list_var_$29 = cdolist_list_var_$29.rest();
                                    examine2 = cdolist_list_var_$29.first();
                                } 
                            } else {
                                Errors.error($str47$Invalid_sense__s, sense);
                            }

                    }
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                permuted_asent2 = cdolist_list_var2.first();
            } 
        }
        return values(NIL, NIL, NIL);
    }

    public static final SubLObject trans_predicate_commutativity_rule_filter_alt(SubLObject asent, SubLObject sense, SubLObject rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_bindings = com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_commutativity_expand_int(asent, sense, rule);
                SubLObject examine = thread.secondMultipleValue();
                SubLObject predicate = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    return T;
                }
            }
            return NIL;
        }
    }

    public static SubLObject trans_predicate_commutativity_rule_filter(final SubLObject asent, final SubLObject sense, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_predicate_commutativity_expand_int(asent, sense, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject predicate = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject trans_predicate_commutativity_expand_alt(SubLObject asent, SubLObject sense, SubLObject rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_bindings = com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_commutativity_expand_int(asent, sense, rule);
                SubLObject examine = thread.secondMultipleValue();
                SubLObject predicate = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    backward.transformation_add_node(rule, examine, sense, v_bindings, com.cyc.cycjava.cycl.inference.modules.transformation_modules.additional_predicate_commutativity_supports(predicate));
                }
            }
            return NIL;
        }
    }

    public static SubLObject trans_predicate_commutativity_expand(final SubLObject asent, final SubLObject sense, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_predicate_commutativity_expand_int(asent, sense, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject predicate = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            backward.transformation_add_node(rule, examine, sense, v_bindings, additional_predicate_commutativity_supports(predicate));
        }
        return NIL;
    }

    public static final SubLObject trans_predicate_symmetry_pos_cost_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_commutativity_cost(asent, $POS);
    }

    public static SubLObject trans_predicate_symmetry_pos_cost(final SubLObject asent) {
        return trans_predicate_commutativity_cost(asent, $POS);
    }

    public static final SubLObject trans_predicate_symmetry_neg_cost_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_commutativity_cost(asent, $NEG);
    }

    public static SubLObject trans_predicate_symmetry_neg_cost(final SubLObject asent) {
        return trans_predicate_commutativity_cost(asent, $NEG);
    }

    public static final SubLObject trans_predicate_symmetry_pos_rule_select_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_commutativity_rule_select(asent, $POS);
    }

    public static SubLObject trans_predicate_symmetry_pos_rule_select(final SubLObject asent) {
        return trans_predicate_commutativity_rule_select(asent, $POS);
    }

    public static final SubLObject trans_predicate_symmetry_neg_rule_select_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_commutativity_rule_select(asent, $NEG);
    }

    public static SubLObject trans_predicate_symmetry_neg_rule_select(final SubLObject asent) {
        return trans_predicate_commutativity_rule_select(asent, $NEG);
    }

    public static final SubLObject trans_predicate_symmetry_pos_rule_filter_alt(SubLObject asent, SubLObject rule) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_commutativity_rule_filter(asent, $POS, rule);
    }

    public static SubLObject trans_predicate_symmetry_pos_rule_filter(final SubLObject asent, final SubLObject rule) {
        return trans_predicate_commutativity_rule_filter(asent, $POS, rule);
    }

    public static final SubLObject trans_predicate_symmetry_neg_rule_filter_alt(SubLObject asent, SubLObject rule) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_commutativity_rule_filter(asent, $NEG, rule);
    }

    public static SubLObject trans_predicate_symmetry_neg_rule_filter(final SubLObject asent, final SubLObject rule) {
        return trans_predicate_commutativity_rule_filter(asent, $NEG, rule);
    }

    public static final SubLObject trans_predicate_symmetry_pos_expand_alt(SubLObject asent, SubLObject rule) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_commutativity_expand(asent, $POS, rule);
    }

    public static SubLObject trans_predicate_symmetry_pos_expand(final SubLObject asent, final SubLObject rule) {
        return trans_predicate_commutativity_expand(asent, $POS, rule);
    }

    public static final SubLObject trans_predicate_symmetry_neg_expand_alt(SubLObject asent, SubLObject rule) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_commutativity_expand(asent, $NEG, rule);
    }

    public static SubLObject trans_predicate_symmetry_neg_expand(final SubLObject asent, final SubLObject rule) {
        return trans_predicate_commutativity_expand(asent, $NEG, rule);
    }

    public static final SubLObject trans_predicate_commutative_pos_cost_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_commutativity_cost(asent, $POS);
    }

    public static SubLObject trans_predicate_commutative_pos_cost(final SubLObject asent) {
        return trans_predicate_commutativity_cost(asent, $POS);
    }

    public static final SubLObject trans_predicate_commutative_neg_cost_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_commutativity_cost(asent, $NEG);
    }

    public static SubLObject trans_predicate_commutative_neg_cost(final SubLObject asent) {
        return trans_predicate_commutativity_cost(asent, $NEG);
    }

    public static final SubLObject trans_predicate_commutative_pos_rule_select_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_commutativity_rule_select(asent, $POS);
    }

    public static SubLObject trans_predicate_commutative_pos_rule_select(final SubLObject asent) {
        return trans_predicate_commutativity_rule_select(asent, $POS);
    }

    public static final SubLObject trans_predicate_commutative_neg_rule_select_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_commutativity_rule_select(asent, $NEG);
    }

    public static SubLObject trans_predicate_commutative_neg_rule_select(final SubLObject asent) {
        return trans_predicate_commutativity_rule_select(asent, $NEG);
    }

    public static final SubLObject trans_predicate_commutative_pos_rule_filter_alt(SubLObject asent, SubLObject rule) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_commutativity_rule_filter(asent, $POS, rule);
    }

    public static SubLObject trans_predicate_commutative_pos_rule_filter(final SubLObject asent, final SubLObject rule) {
        return trans_predicate_commutativity_rule_filter(asent, $POS, rule);
    }

    public static final SubLObject trans_predicate_commutative_neg_rule_filter_alt(SubLObject asent, SubLObject rule) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_commutativity_rule_filter(asent, $NEG, rule);
    }

    public static SubLObject trans_predicate_commutative_neg_rule_filter(final SubLObject asent, final SubLObject rule) {
        return trans_predicate_commutativity_rule_filter(asent, $NEG, rule);
    }

    public static final SubLObject trans_predicate_commutative_pos_expand_alt(SubLObject asent, SubLObject rule) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_commutativity_expand(asent, $POS, rule);
    }

    public static SubLObject trans_predicate_commutative_pos_expand(final SubLObject asent, final SubLObject rule) {
        return trans_predicate_commutativity_expand(asent, $POS, rule);
    }

    public static final SubLObject trans_predicate_commutative_neg_expand_alt(SubLObject asent, SubLObject rule) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_commutativity_expand(asent, $NEG, rule);
    }

    public static SubLObject trans_predicate_commutative_neg_expand(final SubLObject asent, final SubLObject rule) {
        return trans_predicate_commutativity_expand(asent, $NEG, rule);
    }

    public static final SubLObject trans_predicate_partially_commutative_pos_cost_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_commutativity_cost(asent, $POS);
    }

    public static SubLObject trans_predicate_partially_commutative_pos_cost(final SubLObject asent) {
        return trans_predicate_commutativity_cost(asent, $POS);
    }

    public static final SubLObject trans_predicate_partially_commutative_neg_cost_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_commutativity_cost(asent, $NEG);
    }

    public static SubLObject trans_predicate_partially_commutative_neg_cost(final SubLObject asent) {
        return trans_predicate_commutativity_cost(asent, $NEG);
    }

    public static final SubLObject trans_predicate_partially_commutative_pos_rule_select_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_commutativity_rule_select(asent, $POS);
    }

    public static SubLObject trans_predicate_partially_commutative_pos_rule_select(final SubLObject asent) {
        return trans_predicate_commutativity_rule_select(asent, $POS);
    }

    public static final SubLObject trans_predicate_partially_commutative_neg_rule_select_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_commutativity_rule_select(asent, $NEG);
    }

    public static SubLObject trans_predicate_partially_commutative_neg_rule_select(final SubLObject asent) {
        return trans_predicate_commutativity_rule_select(asent, $NEG);
    }

    public static final SubLObject trans_predicate_partially_commutative_pos_rule_filter_alt(SubLObject asent, SubLObject rule) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_commutativity_rule_filter(asent, $POS, rule);
    }

    public static SubLObject trans_predicate_partially_commutative_pos_rule_filter(final SubLObject asent, final SubLObject rule) {
        return trans_predicate_commutativity_rule_filter(asent, $POS, rule);
    }

    public static final SubLObject trans_predicate_partially_commutative_neg_rule_filter_alt(SubLObject asent, SubLObject rule) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_commutativity_rule_filter(asent, $NEG, rule);
    }

    public static SubLObject trans_predicate_partially_commutative_neg_rule_filter(final SubLObject asent, final SubLObject rule) {
        return trans_predicate_commutativity_rule_filter(asent, $NEG, rule);
    }

    public static final SubLObject trans_predicate_partially_commutative_pos_expand_alt(SubLObject asent, SubLObject rule) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_commutativity_expand(asent, $POS, rule);
    }

    public static SubLObject trans_predicate_partially_commutative_pos_expand(final SubLObject asent, final SubLObject rule) {
        return trans_predicate_commutativity_expand(asent, $POS, rule);
    }

    public static final SubLObject trans_predicate_partially_commutative_neg_expand_alt(SubLObject asent, SubLObject rule) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_commutativity_expand(asent, $NEG, rule);
    }

    public static SubLObject trans_predicate_partially_commutative_neg_expand(final SubLObject asent, final SubLObject rule) {
        return trans_predicate_commutativity_expand(asent, $NEG, rule);
    }

    public static final SubLObject trans_predicate_asymmetry_cost_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_cost(asent, $POS);
    }

    public static SubLObject trans_predicate_asymmetry_cost(final SubLObject asent) {
        return trans_predicate_cost(asent, $POS);
    }

    public static final SubLObject trans_predicate_asymmetry_rule_select_alt(SubLObject asent) {
        {
            SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            SubLObject rules = com.cyc.cycjava.cycl.inference.modules.transformation_modules.new_selected_rules();
            SubLObject cdolist_list_var = backward_utilities.relevant_directions();
            SubLObject direction = NIL;
            for (direction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , direction = cdolist_list_var.first()) {
                if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(predicate, $POS, direction)) {
                    {
                        SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(predicate, $POS, direction);
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
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                            {
                                                SubLObject done_var_37 = NIL;
                                                SubLObject token_var_38 = NIL;
                                                while (NIL == done_var_37) {
                                                    {
                                                        SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_38);
                                                        SubLObject valid_39 = makeBoolean(token_var_38 != rule);
                                                        if (NIL != valid_39) {
                                                            rules = com.cyc.cycjava.cycl.inference.modules.transformation_modules.add_selected_rule(rule, rules);
                                                        }
                                                        done_var_37 = makeBoolean(NIL == valid_39);
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
            return com.cyc.cycjava.cycl.inference.modules.transformation_modules.finalize_selected_rules(rules);
        }
    }

    public static SubLObject trans_predicate_asymmetry_rule_select(final SubLObject asent) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject rules = new_selected_rules();
        SubLObject cdolist_list_var = backward_utilities.relevant_directions();
        SubLObject direction = NIL;
        direction = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(predicate, $POS, direction)) {
                final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(predicate, $POS, direction);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                            SubLObject done_var_$30 = NIL;
                            final SubLObject token_var_$31 = NIL;
                            while (NIL == done_var_$30) {
                                final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$31);
                                final SubLObject valid_$32 = makeBoolean(!token_var_$31.eql(rule));
                                if (NIL != valid_$32) {
                                    rules = add_selected_rule(rule, rules);
                                }
                                done_var_$30 = makeBoolean(NIL == valid_$32);
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
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        } 
        return finalize_selected_rules(rules);
    }

    public static final SubLObject trans_predicate_asymmetry_expand_int_alt(SubLObject asent, SubLObject rule) {
        {
            SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            SubLObject source_formula_var = asent;
            if (NIL != el_binary_formula_p(source_formula_var)) {
                {
                    SubLObject symmetric_asent = removal_modules_symmetry.symmetric_asent(source_formula_var);
                    SubLObject predicate_var = predicate;
                    SubLObject rule_var = rule;
                    if (NIL != backward_utilities.rule_relevant_to_proof(rule_var)) {
                        {
                            SubLObject assertion_var = rule_var;
                            SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
                            SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
                            SubLObject examine = NIL;
                            for (examine = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , examine = cdolist_list_var.first()) {
                                if (predicate_var == cycl_utilities.atomic_sentence_predicate(examine)) {
                                    {
                                        SubLObject v_bindings = unification_utilities.transformation_asent_unify(symmetric_asent, examine);
                                        if (NIL != v_bindings) {
                                            return values(v_bindings, examine, predicate);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                {
                    SubLObject cdolist_list_var = cycl_utilities.formula_commutative_permutations(source_formula_var, UNPROVIDED);
                    SubLObject symmetric_asent = NIL;
                    for (symmetric_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symmetric_asent = cdolist_list_var.first()) {
                        if (!symmetric_asent.equal(source_formula_var)) {
                            {
                                SubLObject predicate_var = predicate;
                                SubLObject rule_var = rule;
                                if (NIL != backward_utilities.rule_relevant_to_proof(rule_var)) {
                                    {
                                        SubLObject assertion_var = rule_var;
                                        SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
                                        SubLObject cdolist_list_var_40 = clauses.pos_lits(cnf_var);
                                        SubLObject examine = NIL;
                                        for (examine = cdolist_list_var_40.first(); NIL != cdolist_list_var_40; cdolist_list_var_40 = cdolist_list_var_40.rest() , examine = cdolist_list_var_40.first()) {
                                            if (predicate_var == cycl_utilities.atomic_sentence_predicate(examine)) {
                                                {
                                                    SubLObject v_bindings = unification_utilities.transformation_asent_unify(symmetric_asent, examine);
                                                    if (NIL != v_bindings) {
                                                        return values(v_bindings, examine, predicate);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return values(NIL, NIL, NIL);
    }

    public static SubLObject trans_predicate_asymmetry_expand_int(final SubLObject asent, final SubLObject rule) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (NIL != el_binary_formula_p(asent)) {
            final SubLObject symmetric_asent = removal_modules_symmetry.symmetric_asent(asent);
            final SubLObject predicate_var = predicate;
            if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
                final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
                SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
                SubLObject examine = NIL;
                examine = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(examine))) {
                        final SubLObject v_bindings = unification_utilities.transformation_asent_unify(symmetric_asent, examine);
                        if (NIL != v_bindings) {
                            return values(v_bindings, examine, predicate);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    examine = cdolist_list_var.first();
                } 
            }
        } else {
            SubLObject cdolist_list_var2 = cycl_utilities.formula_commutative_permutations(asent, UNPROVIDED);
            SubLObject symmetric_asent2 = NIL;
            symmetric_asent2 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                if (!symmetric_asent2.equal(asent)) {
                    final SubLObject predicate_var2 = predicate;
                    if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
                        final SubLObject cnf_var2 = assertions_high.assertion_cnf(rule);
                        SubLObject cdolist_list_var_$33 = clauses.pos_lits(cnf_var2);
                        SubLObject examine2 = NIL;
                        examine2 = cdolist_list_var_$33.first();
                        while (NIL != cdolist_list_var_$33) {
                            if (predicate_var2.eql(cycl_utilities.atomic_sentence_predicate(examine2))) {
                                final SubLObject v_bindings2 = unification_utilities.transformation_asent_unify(symmetric_asent2, examine2);
                                if (NIL != v_bindings2) {
                                    return values(v_bindings2, examine2, predicate);
                                }
                            }
                            cdolist_list_var_$33 = cdolist_list_var_$33.rest();
                            examine2 = cdolist_list_var_$33.first();
                        } 
                    }
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                symmetric_asent2 = cdolist_list_var2.first();
            } 
        }
        return values(NIL, NIL, NIL);
    }

    public static final SubLObject trans_predicate_asymmetry_rule_filter_alt(SubLObject asent, SubLObject rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_bindings = com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_asymmetry_expand_int(asent, rule);
                SubLObject examine = thread.secondMultipleValue();
                SubLObject predicate = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    return T;
                }
            }
            return NIL;
        }
    }

    public static SubLObject trans_predicate_asymmetry_rule_filter(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_predicate_asymmetry_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject predicate = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject trans_predicate_asymmetry_expand_alt(SubLObject asent, SubLObject rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_bindings = com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_predicate_asymmetry_expand_int(asent, rule);
                SubLObject examine = thread.secondMultipleValue();
                SubLObject predicate = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    backward.transformation_add_node(rule, examine, $POS, v_bindings, com.cyc.cycjava.cycl.inference.modules.transformation_modules.additional_asymmetry_supports(predicate));
                }
            }
            return NIL;
        }
    }

    public static SubLObject trans_predicate_asymmetry_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_predicate_asymmetry_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject predicate = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            backward.transformation_add_node(rule, examine, $POS, v_bindings, additional_asymmetry_supports(predicate));
        }
        return NIL;
    }

    public static final SubLObject trans_unbound_predicate_module_p_alt(SubLObject hl_module) {
        {
            SubLObject name = inference_modules.hl_module_name(hl_module);
            return list_utilities.member_eqP(name, $unbound_predicate_transformation_required_modules$.getGlobalValue());
        }
    }

    public static SubLObject trans_unbound_predicate_module_p(final SubLObject hl_module) {
        final SubLObject name = inference_modules.hl_module_name(hl_module);
        return subl_promotions.memberP(name, $unbound_predicate_transformation_required_modules$.getGlobalValue(), symbol_function(EQL), UNPROVIDED);
    }

    public static final SubLObject module_requires_unbound_predicate_transformationP_alt(SubLObject module_name) {
        return list_utilities.member_eqP(module_name, $unbound_predicate_transformation_required_modules$.getGlobalValue());
    }

    public static SubLObject module_requires_unbound_predicate_transformationP(final SubLObject module_name) {
        return subl_promotions.memberP(module_name, $unbound_predicate_transformation_required_modules$.getGlobalValue(), symbol_function(EQL), UNPROVIDED);
    }

    public static final SubLObject trans_unbound_predicate_pos_required_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_unbound_predicate_required(asent);
    }

    public static SubLObject trans_unbound_predicate_pos_required(final SubLObject asent) {
        return trans_unbound_predicate_required(asent);
    }

    public static final SubLObject trans_unbound_predicate_neg_required_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_unbound_predicate_required(asent);
    }

    public static SubLObject trans_unbound_predicate_neg_required(final SubLObject asent) {
        return trans_unbound_predicate_required(asent);
    }

    public static final SubLObject trans_unbound_predicate_pos_cost_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_unbound_predicate_cost($POS);
    }

    public static SubLObject trans_unbound_predicate_pos_cost(final SubLObject asent) {
        return trans_unbound_predicate_cost($POS);
    }

    public static final SubLObject trans_unbound_predicate_neg_cost_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_unbound_predicate_cost($NEG);
    }

    public static SubLObject trans_unbound_predicate_neg_cost(final SubLObject asent) {
        return trans_unbound_predicate_cost($NEG);
    }

    public static final SubLObject trans_unbound_predicate_pos_rule_select_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_unbound_predicate_rule_select($POS);
    }

    public static SubLObject trans_unbound_predicate_pos_rule_select(final SubLObject asent) {
        return trans_unbound_predicate_rule_select($POS);
    }

    public static final SubLObject trans_unbound_predicate_neg_rule_select_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_unbound_predicate_rule_select($NEG);
    }

    public static SubLObject trans_unbound_predicate_neg_rule_select(final SubLObject asent) {
        return trans_unbound_predicate_rule_select($NEG);
    }

    public static final SubLObject trans_unbound_predicate_pos_rule_filter_alt(SubLObject asent, SubLObject rule) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_unbound_predicate_rule_filter($POS, rule);
    }

    public static SubLObject trans_unbound_predicate_pos_rule_filter(final SubLObject asent, final SubLObject rule) {
        return trans_unbound_predicate_rule_filter($POS, rule);
    }

    public static final SubLObject trans_unbound_predicate_neg_rule_filter_alt(SubLObject asent, SubLObject rule) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_unbound_predicate_rule_filter($NEG, rule);
    }

    public static SubLObject trans_unbound_predicate_neg_rule_filter(final SubLObject asent, final SubLObject rule) {
        return trans_unbound_predicate_rule_filter($NEG, rule);
    }

    public static final SubLObject trans_unbound_predicate_pos_expand_alt(SubLObject asent, SubLObject rule) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_unbound_predicate_expand(asent, $POS, rule);
    }

    public static SubLObject trans_unbound_predicate_pos_expand(final SubLObject asent, final SubLObject rule) {
        return trans_unbound_predicate_expand(asent, $POS, rule);
    }

    public static final SubLObject trans_unbound_predicate_neg_expand_alt(SubLObject asent, SubLObject rule) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_unbound_predicate_expand(asent, $NEG, rule);
    }

    public static SubLObject trans_unbound_predicate_neg_expand(final SubLObject asent, final SubLObject rule) {
        return trans_unbound_predicate_expand(asent, $NEG, rule);
    }

    public static final SubLObject trans_unbound_predicate_required_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != $unbound_rule_backchain_enabled$.getDynamicValue(thread)) && (!(((NIL != $unique_inference_result_bindings$.getDynamicValue(thread)) && (NIL != variables.fully_bound_p(asent))) && (NIL != com.cyc.cycjava.cycl.inference.modules.transformation_modules.transformation_gaf_truth_known(asent)))));
        }
    }

    public static SubLObject trans_unbound_predicate_required(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != $unbound_rule_backchain_enabled$.getDynamicValue(thread)) && (((NIL == $unique_inference_result_bindings$.getDynamicValue(thread)) || (NIL == variables.fully_bound_p(asent))) || (NIL == transformation_gaf_truth_known(asent))));
    }

    public static final SubLObject trans_unbound_predicate_cost_alt(SubLObject sense) {
        return auxiliary_indexing.relevant_num_unbound_rule_index(sense);
    }

    public static SubLObject trans_unbound_predicate_cost(final SubLObject sense) {
        return auxiliary_indexing.relevant_num_unbound_rule_index(sense);
    }

    public static SubLObject trans_unbound_predicate_rule_select_internal(final SubLObject sense) {
        SubLObject rules = new_selected_rules();
        SubLObject cdolist_list_var = backward_utilities.relevant_directions();
        SubLObject direction = NIL;
        direction = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != kb_mapping_macros.do_unbound_predicate_rule_index_key_validator(sense, direction)) {
                final SubLObject iterator_var = kb_mapping_macros.new_unbound_predicate_rule_final_index_spec_iterator(sense, direction);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                            SubLObject done_var_$34 = NIL;
                            final SubLObject token_var_$35 = NIL;
                            while (NIL == done_var_$34) {
                                final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$35);
                                final SubLObject valid_$36 = makeBoolean(!token_var_$35.eql(rule));
                                if (NIL != valid_$36) {
                                    rules = add_selected_rule(rule, rules);
                                }
                                done_var_$34 = makeBoolean(NIL == valid_$36);
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
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        } 
        return finalize_selected_rules(rules);
    }

    public static final SubLObject trans_unbound_predicate_rule_select_alt(SubLObject sense) {
        {
            SubLObject rules = com.cyc.cycjava.cycl.inference.modules.transformation_modules.new_selected_rules();
            SubLObject cdolist_list_var = backward_utilities.relevant_directions();
            SubLObject direction = NIL;
            for (direction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , direction = cdolist_list_var.first()) {
                if (NIL != kb_mapping_macros.do_unbound_predicate_rule_index_key_validator(sense, direction)) {
                    {
                        SubLObject iterator_var = kb_mapping_macros.new_unbound_predicate_rule_final_index_spec_iterator(sense, direction);
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
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                            {
                                                SubLObject done_var_41 = NIL;
                                                SubLObject token_var_42 = NIL;
                                                while (NIL == done_var_41) {
                                                    {
                                                        SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_42);
                                                        SubLObject valid_43 = makeBoolean(token_var_42 != rule);
                                                        if (NIL != valid_43) {
                                                            rules = com.cyc.cycjava.cycl.inference.modules.transformation_modules.add_selected_rule(rule, rules);
                                                        }
                                                        done_var_41 = makeBoolean(NIL == valid_43);
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
            return com.cyc.cycjava.cycl.inference.modules.transformation_modules.finalize_selected_rules(rules);
        }
    }

    public static SubLObject trans_unbound_predicate_rule_select(final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return trans_unbound_predicate_rule_select_internal(sense);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, TRANS_UNBOUND_PREDICATE_RULE_SELECT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), TRANS_UNBOUND_PREDICATE_RULE_SELECT, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, TRANS_UNBOUND_PREDICATE_RULE_SELECT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, sense, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(trans_unbound_predicate_rule_select_internal(sense)));
            memoization_state.caching_state_put(caching_state, sense, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject trans_unbound_predicate_rule_filter_alt(SubLObject sense, SubLObject rule) {
        {
            SubLObject rule_var = rule;
            if (NIL != backward_utilities.rule_relevant_to_proof(rule_var)) {
                {
                    SubLObject assertion_var = rule_var;
                    SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
                    if ($POS == sense) {
                        {
                            SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
                            SubLObject examine = NIL;
                            for (examine = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , examine = cdolist_list_var.first()) {
                                if (NIL != auxiliary_indexing.unbound_predicate_literal(examine)) {
                                    return T;
                                }
                            }
                        }
                    } else {
                        if ($NEG == sense) {
                            {
                                SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
                                SubLObject examine = NIL;
                                for (examine = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , examine = cdolist_list_var.first()) {
                                    if (NIL != auxiliary_indexing.unbound_predicate_literal(examine)) {
                                        return T;
                                    }
                                }
                            }
                        } else {
                            Errors.error($str_alt51$Invalid_sense__s, sense);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject trans_unbound_predicate_rule_filter(final SubLObject sense, final SubLObject rule) {
        if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            if ($POS == sense) {
                SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
                SubLObject examine = NIL;
                examine = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != auxiliary_indexing.unbound_predicate_literal(examine)) {
                        return T;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    examine = cdolist_list_var.first();
                } 
            } else
                if ($NEG == sense) {
                    SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
                    SubLObject examine = NIL;
                    examine = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL != auxiliary_indexing.unbound_predicate_literal(examine)) {
                            return T;
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        examine = cdolist_list_var.first();
                    } 
                } else {
                    Errors.error($str47$Invalid_sense__s, sense);
                }

        }
        return NIL;
    }

    public static final SubLObject trans_unbound_predicate_expand_alt(SubLObject asent, SubLObject sense, SubLObject rule) {
        {
            SubLObject rule_var = rule;
            if (NIL != backward_utilities.rule_relevant_to_proof(rule_var)) {
                {
                    SubLObject assertion_var = rule_var;
                    SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
                    if ($POS == sense) {
                        {
                            SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
                            SubLObject examine = NIL;
                            for (examine = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , examine = cdolist_list_var.first()) {
                                if (NIL != auxiliary_indexing.unbound_predicate_literal(examine)) {
                                    {
                                        SubLObject v_bindings = unification_utilities.transformation_asent_unify(asent, examine);
                                        if (NIL != v_bindings) {
                                            backward.transformation_add_node(rule, examine, sense, v_bindings, UNPROVIDED);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if ($NEG == sense) {
                            {
                                SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
                                SubLObject examine = NIL;
                                for (examine = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , examine = cdolist_list_var.first()) {
                                    if (NIL != auxiliary_indexing.unbound_predicate_literal(examine)) {
                                        {
                                            SubLObject v_bindings = unification_utilities.transformation_asent_unify(asent, examine);
                                            if (NIL != v_bindings) {
                                                backward.transformation_add_node(rule, examine, sense, v_bindings, UNPROVIDED);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            Errors.error($str_alt51$Invalid_sense__s, sense);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject trans_unbound_predicate_expand(final SubLObject asent, final SubLObject sense, final SubLObject rule) {
        if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            if ($POS == sense) {
                SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
                SubLObject examine = NIL;
                examine = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != auxiliary_indexing.unbound_predicate_literal(examine)) {
                        final SubLObject v_bindings = unification_utilities.transformation_asent_unify(asent, examine);
                        if (NIL != v_bindings) {
                            backward.transformation_add_node(rule, examine, sense, v_bindings, UNPROVIDED);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    examine = cdolist_list_var.first();
                } 
            } else
                if ($NEG == sense) {
                    SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
                    SubLObject examine = NIL;
                    examine = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL != auxiliary_indexing.unbound_predicate_literal(examine)) {
                            final SubLObject v_bindings = unification_utilities.transformation_asent_unify(asent, examine);
                            if (NIL != v_bindings) {
                                backward.transformation_add_node(rule, examine, sense, v_bindings, UNPROVIDED);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        examine = cdolist_list_var.first();
                    } 
                } else {
                    Errors.error($str47$Invalid_sense__s, sense);
                }

        }
        return NIL;
    }

    public static final SubLObject module_requires_hl_predicate_transformationP_alt(SubLObject module_name) {
        return list_utilities.member_eqP(module_name, $hl_predicate_transformation_required_modules$.getGlobalValue());
    }

    public static SubLObject module_requires_hl_predicate_transformationP(final SubLObject module_name) {
        return subl_promotions.memberP(module_name, $hl_predicate_transformation_required_modules$.getGlobalValue(), symbol_function(EQL), UNPROVIDED);
    }

    public static final SubLObject trans_isa_pos_required_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != $hl_failure_backchaining$.getDynamicValue(thread)) || (NIL != inference_trampolines.inference_collection_backchain_encouragedP(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), $mt$.getDynamicValue(thread))));
        }
    }

    public static SubLObject trans_isa_pos_required(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != $hl_failure_backchaining$.getDynamicValue(thread)) || (NIL != inference_trampolines.inference_collection_backchain_encouragedP(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), mt_relevance_macros.$mt$.getDynamicValue(thread))));
    }

    public static final SubLObject trans_isa_neg_required_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $hl_failure_backchaining$.getDynamicValue(thread);
        }
    }

    public static SubLObject trans_isa_neg_required(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $hl_failure_backchaining$.getDynamicValue(thread);
    }

    public static final SubLObject trans_isa_pos_cost_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != inference_trampolines.inference_backchain_required_asentP(asent, $mt$.getDynamicValue(thread))) {
                return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_isa_pos_rule_select_count(asent, $mt$.getDynamicValue(thread));
            } else {
                return cardinality_estimates.spec_cardinality(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
            }
        }
    }

    public static SubLObject trans_isa_pos_cost(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != inference_trampolines.inference_backchain_required_asentP(asent, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
            return trans_isa_pos_rule_select_count(asent, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        return cardinality_estimates.spec_cardinality(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    public static final SubLObject trans_isa_neg_cost_alt(SubLObject asent) {
        return cardinality_estimates.genl_cardinality(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    public static SubLObject trans_isa_neg_cost(final SubLObject asent) {
        return cardinality_estimates.genl_cardinality(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    public static final SubLObject inference_memoized_all_specs_internal_alt(SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return genls.all_specs(col, mt, UNPROVIDED);
    }

    public static SubLObject inference_memoized_all_specs_internal(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return genls.all_specs(col, mt, UNPROVIDED);
    }

    public static final SubLObject inference_memoized_all_specs_alt(SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.modules.transformation_modules.inference_memoized_all_specs_internal(col, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_MEMOIZED_ALL_SPECS, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_MEMOIZED_ALL_SPECS, TWO_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, INFERENCE_MEMOIZED_ALL_SPECS, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(col, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw50$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (col == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && (mt == cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.modules.transformation_modules.inference_memoized_all_specs_internal(col, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(col, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject inference_memoized_all_specs(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_memoized_all_specs_internal(col, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_MEMOIZED_ALL_SPECS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_MEMOIZED_ALL_SPECS, TWO_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_MEMOIZED_ALL_SPECS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(col, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (col.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_memoized_all_specs_internal(col, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(col, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject trans_isa_pos_rule_select_count_internal_alt(SubLObject asent, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = $mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $relevant_mts$.currentBinding(thread);
                    try {
                        $mt$.bind(update_inference_mt_relevance_mt(mt_var), thread);
                        $relevant_mt_function$.bind(update_inference_mt_relevance_function(mt_var), thread);
                        $relevant_mts$.bind(update_inference_mt_relevance_mt_list(mt_var), thread);
                        result = length(com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_isa_pos_rule_select(asent));
                    } finally {
                        $relevant_mts$.rebind(_prev_bind_2, thread);
                        $relevant_mt_function$.rebind(_prev_bind_1, thread);
                        $mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject trans_isa_pos_rule_select_count_internal(final SubLObject asent, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
            result = length(trans_isa_pos_rule_select(asent));
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject trans_isa_pos_rule_select_count_alt(SubLObject asent, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_isa_pos_rule_select_count_internal(asent, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, TRANS_ISA_POS_RULE_SELECT_COUNT, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), TRANS_ISA_POS_RULE_SELECT_COUNT, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, TRANS_ISA_POS_RULE_SELECT_COUNT, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(asent, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw50$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (asent.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_isa_pos_rule_select_count_internal(asent, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(asent, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject trans_isa_pos_rule_select_count(final SubLObject asent, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return trans_isa_pos_rule_select_count_internal(asent, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, TRANS_ISA_POS_RULE_SELECT_COUNT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), TRANS_ISA_POS_RULE_SELECT_COUNT, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, TRANS_ISA_POS_RULE_SELECT_COUNT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(asent, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (asent.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(trans_isa_pos_rule_select_count_internal(asent, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(asent, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject trans_isa_pos_rule_select_alt(SubLObject asent) {
        {
            SubLObject rules = com.cyc.cycjava.cycl.inference.modules.transformation_modules.new_selected_rules();
            SubLObject inference_col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject rule_subsets = com.cyc.cycjava.cycl.inference.modules.transformation_modules.inference_memoized_all_specs(inference_col, NIL);
            SubLObject cdolist_list_var = rule_subsets;
            SubLObject rule_subset = NIL;
            for (rule_subset = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rule_subset = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_44 = backward_utilities.relevant_directions();
                    SubLObject direction = NIL;
                    for (direction = cdolist_list_var_44.first(); NIL != cdolist_list_var_44; cdolist_list_var_44 = cdolist_list_var_44.rest() , direction = cdolist_list_var_44.first()) {
                        if (NIL != kb_mapping_macros.do_isa_rule_index_key_validator(rule_subset, $POS, direction)) {
                            {
                                SubLObject iterator_var = kb_mapping_macros.new_isa_rule_final_index_spec_iterator(rule_subset, $POS, direction);
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
                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                                    {
                                                        SubLObject done_var_45 = NIL;
                                                        SubLObject token_var_46 = NIL;
                                                        while (NIL == done_var_45) {
                                                            {
                                                                SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_46);
                                                                SubLObject valid_47 = makeBoolean(token_var_46 != rule);
                                                                if (NIL != valid_47) {
                                                                    rules = com.cyc.cycjava.cycl.inference.modules.transformation_modules.add_selected_rule(rule, rules);
                                                                }
                                                                done_var_45 = makeBoolean(NIL == valid_47);
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
                }
            }
            return com.cyc.cycjava.cycl.inference.modules.transformation_modules.finalize_selected_rules(rules);
        }
    }

    public static SubLObject trans_isa_pos_rule_select(final SubLObject asent) {
        SubLObject rules = new_selected_rules();
        final SubLObject inference_col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject rule_subsets = cdolist_list_var = inference_memoized_all_specs(inference_col, NIL);
        SubLObject rule_subset = NIL;
        rule_subset = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$37 = backward_utilities.relevant_directions();
            SubLObject direction = NIL;
            direction = cdolist_list_var_$37.first();
            while (NIL != cdolist_list_var_$37) {
                if (NIL != kb_mapping_macros.do_isa_rule_index_key_validator(rule_subset, $POS, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_isa_rule_final_index_spec_iterator(rule_subset, $POS, direction);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                SubLObject done_var_$38 = NIL;
                                final SubLObject token_var_$39 = NIL;
                                while (NIL == done_var_$38) {
                                    final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$39);
                                    final SubLObject valid_$40 = makeBoolean(!token_var_$39.eql(rule));
                                    if (NIL != valid_$40) {
                                        rules = add_selected_rule(rule, rules);
                                    }
                                    done_var_$38 = makeBoolean(NIL == valid_$40);
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
                cdolist_list_var_$37 = cdolist_list_var_$37.rest();
                direction = cdolist_list_var_$37.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            rule_subset = cdolist_list_var.first();
        } 
        return finalize_selected_rules(rules);
    }

    public static final SubLObject trans_isa_pos_expand_int_alt(SubLObject asent, SubLObject rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject inference_arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject inference_col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                SubLObject rule_var = rule;
                if (NIL != backward_utilities.rule_relevant_to_proof(rule_var)) {
                    {
                        SubLObject assertion_var = rule_var;
                        SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
                        SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
                        SubLObject examine = NIL;
                        for (examine = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , examine = cdolist_list_var.first()) {
                            if ($$isa == cycl_utilities.atomic_sentence_predicate(examine)) {
                                {
                                    SubLObject rule_subset = cycl_utilities.atomic_sentence_arg2(examine, UNPROVIDED);
                                    if ((NIL != variables.fully_bound_p(rule_subset)) && (NIL != genls.genlsP(rule_subset, inference_col, NIL, UNPROVIDED))) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject v_bindings = unification_utilities.term_unify(inference_arg1, cycl_utilities.atomic_sentence_arg1(examine, UNPROVIDED), NIL, T);
                                            SubLObject unify_justification = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != v_bindings) {
                                                return values(v_bindings, examine, inference_col, rule_subset, unify_justification);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return values(NIL, NIL, NIL, NIL, NIL);
        }
    }

    public static SubLObject trans_isa_pos_expand_int(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject inference_col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
            SubLObject examine = NIL;
            examine = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ($$isa.eql(cycl_utilities.atomic_sentence_predicate(examine))) {
                    final SubLObject rule_subset = cycl_utilities.atomic_sentence_arg2(examine, UNPROVIDED);
                    if ((NIL != variables.fully_bound_p(rule_subset)) && (NIL != genls.genlsP(rule_subset, inference_col, NIL, UNPROVIDED))) {
                        thread.resetMultipleValues();
                        final SubLObject v_bindings = unification_utilities.term_unify(inference_arg1, cycl_utilities.atomic_sentence_arg1(examine, UNPROVIDED), NIL, T);
                        final SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != v_bindings) {
                            return values(v_bindings, examine, inference_col, rule_subset, unify_justification);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                examine = cdolist_list_var.first();
            } 
        }
        return values(NIL, NIL, NIL, NIL, NIL);
    }

    public static final SubLObject trans_isa_pos_rule_filter_alt(SubLObject asent, SubLObject rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_bindings = com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_isa_pos_expand_int(asent, rule);
                SubLObject examine = thread.secondMultipleValue();
                SubLObject inference_col = thread.thirdMultipleValue();
                SubLObject rule_subset = thread.fourthMultipleValue();
                SubLObject more_supports = thread.fifthMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    return T;
                }
            }
            return NIL;
        }
    }

    public static SubLObject trans_isa_pos_rule_filter(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_isa_pos_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject inference_col = thread.thirdMultipleValue();
        final SubLObject rule_subset = thread.fourthMultipleValue();
        final SubLObject more_supports = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject trans_isa_pos_expand_alt(SubLObject asent, SubLObject rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_bindings = com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_isa_pos_expand_int(asent, rule);
                SubLObject examine = thread.secondMultipleValue();
                SubLObject inference_col = thread.thirdMultipleValue();
                SubLObject rule_subset = thread.fourthMultipleValue();
                SubLObject more_supports = thread.fifthMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    {
                        SubLObject genls_supports = com.cyc.cycjava.cycl.inference.modules.transformation_modules.additional_genls_supports(rule_subset, inference_col);
                        backward.transformation_add_node(rule, examine, $POS, v_bindings, append(genls_supports, more_supports));
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject trans_isa_pos_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_isa_pos_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject inference_col = thread.thirdMultipleValue();
        final SubLObject rule_subset = thread.fourthMultipleValue();
        final SubLObject more_supports = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            final SubLObject genls_supports = additional_genls_supports(rule_subset, inference_col);
            backward.transformation_add_node(rule, examine, $POS, v_bindings, append(genls_supports, more_supports));
        }
        return NIL;
    }

    public static final SubLObject trans_isa_neg_rule_select_alt(SubLObject asent) {
        {
            SubLObject rules = com.cyc.cycjava.cycl.inference.modules.transformation_modules.new_selected_rules();
            SubLObject inference_col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject rule_genls = genls.all_genls(inference_col, NIL, UNPROVIDED);
            SubLObject cdolist_list_var = rule_genls;
            SubLObject rule_genl = NIL;
            for (rule_genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rule_genl = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_48 = backward_utilities.relevant_directions();
                    SubLObject direction = NIL;
                    for (direction = cdolist_list_var_48.first(); NIL != cdolist_list_var_48; cdolist_list_var_48 = cdolist_list_var_48.rest() , direction = cdolist_list_var_48.first()) {
                        if (NIL != kb_mapping_macros.do_isa_rule_index_key_validator(rule_genl, $NEG, direction)) {
                            {
                                SubLObject iterator_var = kb_mapping_macros.new_isa_rule_final_index_spec_iterator(rule_genl, $NEG, direction);
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
                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                                    {
                                                        SubLObject done_var_49 = NIL;
                                                        SubLObject token_var_50 = NIL;
                                                        while (NIL == done_var_49) {
                                                            {
                                                                SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_50);
                                                                SubLObject valid_51 = makeBoolean(token_var_50 != rule);
                                                                if (NIL != valid_51) {
                                                                    rules = com.cyc.cycjava.cycl.inference.modules.transformation_modules.add_selected_rule(rule, rules);
                                                                }
                                                                done_var_49 = makeBoolean(NIL == valid_51);
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
                }
            }
            return com.cyc.cycjava.cycl.inference.modules.transformation_modules.finalize_selected_rules(rules);
        }
    }

    public static SubLObject trans_isa_neg_rule_select(final SubLObject asent) {
        SubLObject rules = new_selected_rules();
        final SubLObject inference_col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject rule_genls = cdolist_list_var = genls.all_genls(inference_col, NIL, UNPROVIDED);
        SubLObject rule_genl = NIL;
        rule_genl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$41 = backward_utilities.relevant_directions();
            SubLObject direction = NIL;
            direction = cdolist_list_var_$41.first();
            while (NIL != cdolist_list_var_$41) {
                if (NIL != kb_mapping_macros.do_isa_rule_index_key_validator(rule_genl, $NEG, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_isa_rule_final_index_spec_iterator(rule_genl, $NEG, direction);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                SubLObject done_var_$42 = NIL;
                                final SubLObject token_var_$43 = NIL;
                                while (NIL == done_var_$42) {
                                    final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$43);
                                    final SubLObject valid_$44 = makeBoolean(!token_var_$43.eql(rule));
                                    if (NIL != valid_$44) {
                                        rules = add_selected_rule(rule, rules);
                                    }
                                    done_var_$42 = makeBoolean(NIL == valid_$44);
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
                cdolist_list_var_$41 = cdolist_list_var_$41.rest();
                direction = cdolist_list_var_$41.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            rule_genl = cdolist_list_var.first();
        } 
        return finalize_selected_rules(rules);
    }

    public static final SubLObject trans_isa_neg_expand_int_alt(SubLObject asent, SubLObject rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject inference_arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject inference_col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                SubLObject rule_var = rule;
                if (NIL != backward_utilities.rule_relevant_to_proof(rule_var)) {
                    {
                        SubLObject assertion_var = rule_var;
                        SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
                        SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
                        SubLObject examine = NIL;
                        for (examine = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , examine = cdolist_list_var.first()) {
                            if ($$isa == cycl_utilities.atomic_sentence_predicate(examine)) {
                                {
                                    SubLObject rule_genl = cycl_utilities.atomic_sentence_arg2(examine, UNPROVIDED);
                                    if ((NIL != variables.fully_bound_p(rule_genl)) && (NIL != genls.genlsP(inference_col, rule_genl, NIL, UNPROVIDED))) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject v_bindings = unification_utilities.term_unify(inference_arg1, cycl_utilities.atomic_sentence_arg1(examine, UNPROVIDED), NIL, T);
                                            SubLObject unify_justification = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != v_bindings) {
                                                return values(v_bindings, examine, inference_col, rule_genl, unify_justification);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return values(NIL, NIL, NIL, NIL, NIL);
        }
    }

    public static SubLObject trans_isa_neg_expand_int(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject inference_col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
            SubLObject examine = NIL;
            examine = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ($$isa.eql(cycl_utilities.atomic_sentence_predicate(examine))) {
                    final SubLObject rule_genl = cycl_utilities.atomic_sentence_arg2(examine, UNPROVIDED);
                    if ((NIL != variables.fully_bound_p(rule_genl)) && (NIL != genls.genlsP(inference_col, rule_genl, NIL, UNPROVIDED))) {
                        thread.resetMultipleValues();
                        final SubLObject v_bindings = unification_utilities.term_unify(inference_arg1, cycl_utilities.atomic_sentence_arg1(examine, UNPROVIDED), NIL, T);
                        final SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != v_bindings) {
                            return values(v_bindings, examine, inference_col, rule_genl, unify_justification);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                examine = cdolist_list_var.first();
            } 
        }
        return values(NIL, NIL, NIL, NIL, NIL);
    }

    public static final SubLObject trans_isa_neg_rule_filter_alt(SubLObject asent, SubLObject rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_bindings = com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_isa_neg_expand_int(asent, rule);
                SubLObject examine = thread.secondMultipleValue();
                SubLObject inference_col = thread.thirdMultipleValue();
                SubLObject rule_genl = thread.fourthMultipleValue();
                SubLObject more_supports = thread.fifthMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    return T;
                }
            }
            return NIL;
        }
    }

    public static SubLObject trans_isa_neg_rule_filter(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_isa_neg_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject inference_col = thread.thirdMultipleValue();
        final SubLObject rule_genl = thread.fourthMultipleValue();
        final SubLObject more_supports = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject trans_isa_neg_expand_alt(SubLObject asent, SubLObject rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_bindings = com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_isa_neg_expand_int(asent, rule);
                SubLObject examine = thread.secondMultipleValue();
                SubLObject inference_col = thread.thirdMultipleValue();
                SubLObject rule_genl = thread.fourthMultipleValue();
                SubLObject more_supports = thread.fifthMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    {
                        SubLObject genls_supports = com.cyc.cycjava.cycl.inference.modules.transformation_modules.additional_genls_supports(inference_col, rule_genl);
                        backward.transformation_add_node(rule, examine, $NEG, v_bindings, append(genls_supports, more_supports));
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject trans_isa_neg_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_isa_neg_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject inference_col = thread.thirdMultipleValue();
        final SubLObject rule_genl = thread.fourthMultipleValue();
        final SubLObject more_supports = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            final SubLObject genls_supports = additional_genls_supports(inference_col, rule_genl);
            backward.transformation_add_node(rule, examine, $NEG, v_bindings, append(genls_supports, more_supports));
        }
        return NIL;
    }

    public static final SubLObject trans_genls_pos_required_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $hl_failure_backchaining$.getDynamicValue(thread);
        }
    }

    public static SubLObject trans_genls_pos_required(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $hl_failure_backchaining$.getDynamicValue(thread);
    }

    public static final SubLObject trans_genls_neg_required_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $hl_failure_backchaining$.getDynamicValue(thread);
        }
    }

    public static SubLObject trans_genls_neg_required(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $hl_failure_backchaining$.getDynamicValue(thread);
    }

    public static final SubLObject trans_genls_pos_cost_alt(SubLObject asent) {
        return cardinality_estimates.spec_cardinality(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    public static SubLObject trans_genls_pos_cost(final SubLObject asent) {
        return cardinality_estimates.spec_cardinality(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    public static final SubLObject trans_genls_neg_cost_alt(SubLObject asent) {
        return cardinality_estimates.genl_cardinality(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    public static SubLObject trans_genls_neg_cost(final SubLObject asent) {
        return cardinality_estimates.genl_cardinality(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    public static final SubLObject trans_genls_pos_rule_select_alt(SubLObject asent) {
        {
            SubLObject rules = com.cyc.cycjava.cycl.inference.modules.transformation_modules.new_selected_rules();
            SubLObject inference_col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject rule_subsets = com.cyc.cycjava.cycl.inference.modules.transformation_modules.inference_memoized_all_specs(inference_col, NIL);
            SubLObject cdolist_list_var = rule_subsets;
            SubLObject rule_subset = NIL;
            for (rule_subset = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rule_subset = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_52 = backward_utilities.relevant_directions();
                    SubLObject direction = NIL;
                    for (direction = cdolist_list_var_52.first(); NIL != cdolist_list_var_52; cdolist_list_var_52 = cdolist_list_var_52.rest() , direction = cdolist_list_var_52.first()) {
                        if (NIL != kb_mapping_macros.do_genls_rule_index_key_validator(rule_subset, $POS, direction)) {
                            {
                                SubLObject iterator_var = kb_mapping_macros.new_genls_rule_final_index_spec_iterator(rule_subset, $POS, direction);
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
                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                                    {
                                                        SubLObject done_var_53 = NIL;
                                                        SubLObject token_var_54 = NIL;
                                                        while (NIL == done_var_53) {
                                                            {
                                                                SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_54);
                                                                SubLObject valid_55 = makeBoolean(token_var_54 != rule);
                                                                if (NIL != valid_55) {
                                                                    rules = com.cyc.cycjava.cycl.inference.modules.transformation_modules.add_selected_rule(rule, rules);
                                                                }
                                                                done_var_53 = makeBoolean(NIL == valid_55);
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
                }
            }
            return com.cyc.cycjava.cycl.inference.modules.transformation_modules.finalize_selected_rules(rules);
        }
    }

    public static SubLObject trans_genls_pos_rule_select(final SubLObject asent) {
        SubLObject rules = new_selected_rules();
        final SubLObject inference_col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject rule_subsets = cdolist_list_var = inference_memoized_all_specs(inference_col, NIL);
        SubLObject rule_subset = NIL;
        rule_subset = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$45 = backward_utilities.relevant_directions();
            SubLObject direction = NIL;
            direction = cdolist_list_var_$45.first();
            while (NIL != cdolist_list_var_$45) {
                if (NIL != kb_mapping_macros.do_genls_rule_index_key_validator(rule_subset, $POS, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_genls_rule_final_index_spec_iterator(rule_subset, $POS, direction);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                SubLObject done_var_$46 = NIL;
                                final SubLObject token_var_$47 = NIL;
                                while (NIL == done_var_$46) {
                                    final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$47);
                                    final SubLObject valid_$48 = makeBoolean(!token_var_$47.eql(rule));
                                    if (NIL != valid_$48) {
                                        rules = add_selected_rule(rule, rules);
                                    }
                                    done_var_$46 = makeBoolean(NIL == valid_$48);
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
                cdolist_list_var_$45 = cdolist_list_var_$45.rest();
                direction = cdolist_list_var_$45.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            rule_subset = cdolist_list_var.first();
        } 
        return finalize_selected_rules(rules);
    }

    public static final SubLObject trans_genls_pos_expand_int_alt(SubLObject asent, SubLObject rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject inference_arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject inference_col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                SubLObject rule_var = rule;
                if (NIL != backward_utilities.rule_relevant_to_proof(rule_var)) {
                    {
                        SubLObject assertion_var = rule_var;
                        SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
                        SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
                        SubLObject examine = NIL;
                        for (examine = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , examine = cdolist_list_var.first()) {
                            if ($$genls == cycl_utilities.atomic_sentence_predicate(examine)) {
                                {
                                    SubLObject rule_subset = cycl_utilities.atomic_sentence_arg2(examine, UNPROVIDED);
                                    if ((NIL != variables.fully_bound_p(rule_subset)) && (NIL != genls.genlsP(rule_subset, inference_col, NIL, UNPROVIDED))) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject v_bindings = unification_utilities.term_unify(inference_arg1, cycl_utilities.atomic_sentence_arg1(examine, UNPROVIDED), NIL, T);
                                            SubLObject unify_justification = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != v_bindings) {
                                                return values(v_bindings, examine, inference_col, rule_subset, unify_justification);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return values(NIL, NIL, NIL, NIL, NIL);
        }
    }

    public static SubLObject trans_genls_pos_expand_int(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject inference_col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
            SubLObject examine = NIL;
            examine = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ($$genls.eql(cycl_utilities.atomic_sentence_predicate(examine))) {
                    final SubLObject rule_subset = cycl_utilities.atomic_sentence_arg2(examine, UNPROVIDED);
                    if ((NIL != variables.fully_bound_p(rule_subset)) && (NIL != genls.genlsP(rule_subset, inference_col, NIL, UNPROVIDED))) {
                        thread.resetMultipleValues();
                        final SubLObject v_bindings = unification_utilities.term_unify(inference_arg1, cycl_utilities.atomic_sentence_arg1(examine, UNPROVIDED), NIL, T);
                        final SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != v_bindings) {
                            return values(v_bindings, examine, inference_col, rule_subset, unify_justification);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                examine = cdolist_list_var.first();
            } 
        }
        return values(NIL, NIL, NIL, NIL, NIL);
    }

    public static final SubLObject trans_genls_pos_rule_filter_alt(SubLObject asent, SubLObject rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_bindings = com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_genls_pos_expand_int(asent, rule);
                SubLObject examine = thread.secondMultipleValue();
                SubLObject inference_col = thread.thirdMultipleValue();
                SubLObject rule_subset = thread.fourthMultipleValue();
                SubLObject more_supports = thread.fifthMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    return T;
                }
            }
            return NIL;
        }
    }

    public static SubLObject trans_genls_pos_rule_filter(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_genls_pos_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject inference_col = thread.thirdMultipleValue();
        final SubLObject rule_subset = thread.fourthMultipleValue();
        final SubLObject more_supports = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject trans_genls_pos_expand_alt(SubLObject asent, SubLObject rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_bindings = com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_genls_pos_expand_int(asent, rule);
                SubLObject examine = thread.secondMultipleValue();
                SubLObject inference_col = thread.thirdMultipleValue();
                SubLObject rule_subset = thread.fourthMultipleValue();
                SubLObject more_supports = thread.fifthMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    {
                        SubLObject genls_supports = com.cyc.cycjava.cycl.inference.modules.transformation_modules.additional_genls_supports(rule_subset, inference_col);
                        backward.transformation_add_node(rule, examine, $POS, v_bindings, append(genls_supports, more_supports));
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject trans_genls_pos_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_genls_pos_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject inference_col = thread.thirdMultipleValue();
        final SubLObject rule_subset = thread.fourthMultipleValue();
        final SubLObject more_supports = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            final SubLObject genls_supports = additional_genls_supports(rule_subset, inference_col);
            backward.transformation_add_node(rule, examine, $POS, v_bindings, append(genls_supports, more_supports));
        }
        return NIL;
    }

    public static final SubLObject trans_genls_neg_rule_select_alt(SubLObject asent) {
        {
            SubLObject rules = com.cyc.cycjava.cycl.inference.modules.transformation_modules.new_selected_rules();
            SubLObject inference_col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject rule_genls = genls.all_genls(inference_col, NIL, UNPROVIDED);
            SubLObject cdolist_list_var = rule_genls;
            SubLObject rule_genl = NIL;
            for (rule_genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rule_genl = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_56 = backward_utilities.relevant_directions();
                    SubLObject direction = NIL;
                    for (direction = cdolist_list_var_56.first(); NIL != cdolist_list_var_56; cdolist_list_var_56 = cdolist_list_var_56.rest() , direction = cdolist_list_var_56.first()) {
                        if (NIL != kb_mapping_macros.do_genls_rule_index_key_validator(rule_genl, $NEG, direction)) {
                            {
                                SubLObject iterator_var = kb_mapping_macros.new_genls_rule_final_index_spec_iterator(rule_genl, $NEG, direction);
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
                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                                    {
                                                        SubLObject done_var_57 = NIL;
                                                        SubLObject token_var_58 = NIL;
                                                        while (NIL == done_var_57) {
                                                            {
                                                                SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_58);
                                                                SubLObject valid_59 = makeBoolean(token_var_58 != rule);
                                                                if (NIL != valid_59) {
                                                                    rules = com.cyc.cycjava.cycl.inference.modules.transformation_modules.add_selected_rule(rule, rules);
                                                                }
                                                                done_var_57 = makeBoolean(NIL == valid_59);
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
                }
            }
            return com.cyc.cycjava.cycl.inference.modules.transformation_modules.finalize_selected_rules(rules);
        }
    }

    public static SubLObject trans_genls_neg_rule_select(final SubLObject asent) {
        SubLObject rules = new_selected_rules();
        final SubLObject inference_col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject rule_genls = cdolist_list_var = genls.all_genls(inference_col, NIL, UNPROVIDED);
        SubLObject rule_genl = NIL;
        rule_genl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$49 = backward_utilities.relevant_directions();
            SubLObject direction = NIL;
            direction = cdolist_list_var_$49.first();
            while (NIL != cdolist_list_var_$49) {
                if (NIL != kb_mapping_macros.do_genls_rule_index_key_validator(rule_genl, $NEG, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_genls_rule_final_index_spec_iterator(rule_genl, $NEG, direction);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                SubLObject done_var_$50 = NIL;
                                final SubLObject token_var_$51 = NIL;
                                while (NIL == done_var_$50) {
                                    final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$51);
                                    final SubLObject valid_$52 = makeBoolean(!token_var_$51.eql(rule));
                                    if (NIL != valid_$52) {
                                        rules = add_selected_rule(rule, rules);
                                    }
                                    done_var_$50 = makeBoolean(NIL == valid_$52);
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
                cdolist_list_var_$49 = cdolist_list_var_$49.rest();
                direction = cdolist_list_var_$49.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            rule_genl = cdolist_list_var.first();
        } 
        return finalize_selected_rules(rules);
    }

    public static final SubLObject trans_genls_neg_expand_int_alt(SubLObject asent, SubLObject rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject inference_arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject inference_col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                SubLObject rule_var = rule;
                if (NIL != backward_utilities.rule_relevant_to_proof(rule_var)) {
                    {
                        SubLObject assertion_var = rule_var;
                        SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
                        SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
                        SubLObject examine = NIL;
                        for (examine = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , examine = cdolist_list_var.first()) {
                            if ($$genls == cycl_utilities.atomic_sentence_predicate(examine)) {
                                {
                                    SubLObject rule_genl = cycl_utilities.atomic_sentence_arg2(examine, UNPROVIDED);
                                    if ((NIL != variables.fully_bound_p(rule_genl)) && (NIL != genls.genlsP(inference_col, rule_genl, NIL, UNPROVIDED))) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject v_bindings = unification_utilities.term_unify(inference_arg1, cycl_utilities.atomic_sentence_arg1(examine, UNPROVIDED), NIL, T);
                                            SubLObject unify_justification = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != v_bindings) {
                                                return values(v_bindings, examine, inference_col, rule_genl, unify_justification);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return values(NIL, NIL, NIL, NIL, NIL);
        }
    }

    public static SubLObject trans_genls_neg_expand_int(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject inference_col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
            SubLObject examine = NIL;
            examine = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ($$genls.eql(cycl_utilities.atomic_sentence_predicate(examine))) {
                    final SubLObject rule_genl = cycl_utilities.atomic_sentence_arg2(examine, UNPROVIDED);
                    if ((NIL != variables.fully_bound_p(rule_genl)) && (NIL != genls.genlsP(inference_col, rule_genl, NIL, UNPROVIDED))) {
                        thread.resetMultipleValues();
                        final SubLObject v_bindings = unification_utilities.term_unify(inference_arg1, cycl_utilities.atomic_sentence_arg1(examine, UNPROVIDED), NIL, T);
                        final SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != v_bindings) {
                            return values(v_bindings, examine, inference_col, rule_genl, unify_justification);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                examine = cdolist_list_var.first();
            } 
        }
        return values(NIL, NIL, NIL, NIL, NIL);
    }

    public static final SubLObject trans_genls_neg_rule_filter_alt(SubLObject asent, SubLObject rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_bindings = com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_genls_neg_expand_int(asent, rule);
                SubLObject examine = thread.secondMultipleValue();
                SubLObject inference_col = thread.thirdMultipleValue();
                SubLObject rule_genl = thread.fourthMultipleValue();
                SubLObject more_supports = thread.fifthMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    return T;
                }
            }
            return NIL;
        }
    }

    public static SubLObject trans_genls_neg_rule_filter(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_genls_neg_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject inference_col = thread.thirdMultipleValue();
        final SubLObject rule_genl = thread.fourthMultipleValue();
        final SubLObject more_supports = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject trans_genls_neg_expand_alt(SubLObject asent, SubLObject rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_bindings = com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_genls_neg_expand_int(asent, rule);
                SubLObject examine = thread.secondMultipleValue();
                SubLObject inference_col = thread.thirdMultipleValue();
                SubLObject rule_genl = thread.fourthMultipleValue();
                SubLObject more_supports = thread.fifthMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    {
                        SubLObject genls_supports = com.cyc.cycjava.cycl.inference.modules.transformation_modules.additional_genls_supports(inference_col, rule_genl);
                        backward.transformation_add_node(rule, examine, $NEG, v_bindings, append(genls_supports, more_supports));
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject trans_genls_neg_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_genls_neg_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject inference_col = thread.thirdMultipleValue();
        final SubLObject rule_genl = thread.fourthMultipleValue();
        final SubLObject more_supports = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            final SubLObject genls_supports = additional_genls_supports(inference_col, rule_genl);
            backward.transformation_add_node(rule, examine, $NEG, v_bindings, append(genls_supports, more_supports));
        }
        return NIL;
    }

    public static final SubLObject trans_genl_mt_pos_required_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $hl_failure_backchaining$.getDynamicValue(thread);
        }
    }

    public static SubLObject trans_genl_mt_pos_required(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $hl_failure_backchaining$.getDynamicValue(thread);
    }

    public static final SubLObject trans_genl_mt_neg_required_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $hl_failure_backchaining$.getDynamicValue(thread);
        }
    }

    public static SubLObject trans_genl_mt_neg_required(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $hl_failure_backchaining$.getDynamicValue(thread);
    }

    public static final SubLObject trans_genl_mt_pos_cost_alt(SubLObject asent) {
        return cardinality_estimates.spec_cardinality(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    public static SubLObject trans_genl_mt_pos_cost(final SubLObject asent) {
        return cardinality_estimates.spec_cardinality(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    public static final SubLObject trans_genl_mt_neg_cost_alt(SubLObject asent) {
        return cardinality_estimates.genl_cardinality(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    public static SubLObject trans_genl_mt_neg_cost(final SubLObject asent) {
        return cardinality_estimates.genl_cardinality(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    public static final SubLObject inference_memoized_all_spec_mts_internal_alt(SubLObject inference_mt, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return genl_mts.all_spec_mts(inference_mt, mt, UNPROVIDED);
    }

    public static SubLObject inference_memoized_all_spec_mts_internal(final SubLObject inference_mt, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return genl_mts.all_spec_mts(inference_mt, mt, UNPROVIDED);
    }

    public static final SubLObject inference_memoized_all_spec_mts_alt(SubLObject inference_mt, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.modules.transformation_modules.inference_memoized_all_spec_mts_internal(inference_mt, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_MEMOIZED_ALL_SPEC_MTS, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_MEMOIZED_ALL_SPEC_MTS, TWO_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, INFERENCE_MEMOIZED_ALL_SPEC_MTS, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(inference_mt, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw50$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (inference_mt == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && (mt == cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.modules.transformation_modules.inference_memoized_all_spec_mts_internal(inference_mt, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(inference_mt, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject inference_memoized_all_spec_mts(final SubLObject inference_mt, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_memoized_all_spec_mts_internal(inference_mt, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_MEMOIZED_ALL_SPEC_MTS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_MEMOIZED_ALL_SPEC_MTS, TWO_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_MEMOIZED_ALL_SPEC_MTS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(inference_mt, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (inference_mt.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_memoized_all_spec_mts_internal(inference_mt, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(inference_mt, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject trans_genl_mt_pos_rule_select_alt(SubLObject asent) {
        {
            SubLObject rules = com.cyc.cycjava.cycl.inference.modules.transformation_modules.new_selected_rules();
            SubLObject inference_mt = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject rule_spec_mts = com.cyc.cycjava.cycl.inference.modules.transformation_modules.inference_memoized_all_spec_mts(inference_mt, NIL);
            SubLObject cdolist_list_var = rule_spec_mts;
            SubLObject rule_spec_mt = NIL;
            for (rule_spec_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rule_spec_mt = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_60 = backward_utilities.relevant_directions();
                    SubLObject direction = NIL;
                    for (direction = cdolist_list_var_60.first(); NIL != cdolist_list_var_60; cdolist_list_var_60 = cdolist_list_var_60.rest() , direction = cdolist_list_var_60.first()) {
                        if (NIL != kb_mapping_macros.do_genl_mt_rule_index_key_validator(rule_spec_mt, $POS, direction)) {
                            {
                                SubLObject iterator_var = kb_mapping_macros.new_genl_mt_rule_final_index_spec_iterator(rule_spec_mt, $POS, direction);
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
                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                                    {
                                                        SubLObject done_var_61 = NIL;
                                                        SubLObject token_var_62 = NIL;
                                                        while (NIL == done_var_61) {
                                                            {
                                                                SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_62);
                                                                SubLObject valid_63 = makeBoolean(token_var_62 != rule);
                                                                if (NIL != valid_63) {
                                                                    rules = com.cyc.cycjava.cycl.inference.modules.transformation_modules.add_selected_rule(rule, rules);
                                                                }
                                                                done_var_61 = makeBoolean(NIL == valid_63);
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
                }
            }
            return com.cyc.cycjava.cycl.inference.modules.transformation_modules.finalize_selected_rules(rules);
        }
    }

    public static SubLObject trans_genl_mt_pos_rule_select(final SubLObject asent) {
        SubLObject rules = new_selected_rules();
        final SubLObject inference_mt = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject rule_spec_mts = cdolist_list_var = inference_memoized_all_spec_mts(inference_mt, NIL);
        SubLObject rule_spec_mt = NIL;
        rule_spec_mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$53 = backward_utilities.relevant_directions();
            SubLObject direction = NIL;
            direction = cdolist_list_var_$53.first();
            while (NIL != cdolist_list_var_$53) {
                if (NIL != kb_mapping_macros.do_genl_mt_rule_index_key_validator(rule_spec_mt, $POS, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_genl_mt_rule_final_index_spec_iterator(rule_spec_mt, $POS, direction);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                SubLObject done_var_$54 = NIL;
                                final SubLObject token_var_$55 = NIL;
                                while (NIL == done_var_$54) {
                                    final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$55);
                                    final SubLObject valid_$56 = makeBoolean(!token_var_$55.eql(rule));
                                    if (NIL != valid_$56) {
                                        rules = add_selected_rule(rule, rules);
                                    }
                                    done_var_$54 = makeBoolean(NIL == valid_$56);
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
                cdolist_list_var_$53 = cdolist_list_var_$53.rest();
                direction = cdolist_list_var_$53.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            rule_spec_mt = cdolist_list_var.first();
        } 
        return finalize_selected_rules(rules);
    }

    public static final SubLObject trans_genl_mt_pos_expand_int_alt(SubLObject asent, SubLObject rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject inference_arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject inference_mt = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                SubLObject rule_var = rule;
                if (NIL != backward_utilities.rule_relevant_to_proof(rule_var)) {
                    {
                        SubLObject assertion_var = rule_var;
                        SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
                        SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
                        SubLObject examine = NIL;
                        for (examine = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , examine = cdolist_list_var.first()) {
                            if ($$genlMt == cycl_utilities.atomic_sentence_predicate(examine)) {
                                {
                                    SubLObject rule_spec_mt = cycl_utilities.atomic_sentence_arg2(examine, UNPROVIDED);
                                    if ((NIL != variables.fully_bound_p(rule_spec_mt)) && (NIL != genl_mts.genl_mtP(rule_spec_mt, inference_mt, NIL, UNPROVIDED))) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject v_bindings = unification_utilities.term_unify(inference_arg1, cycl_utilities.atomic_sentence_arg1(examine, UNPROVIDED), NIL, T);
                                            SubLObject unify_justification = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != v_bindings) {
                                                return values(v_bindings, examine, inference_mt, rule_spec_mt, unify_justification);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return values(NIL, NIL, NIL, NIL, NIL);
        }
    }

    public static SubLObject trans_genl_mt_pos_expand_int(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject inference_mt = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
            SubLObject examine = NIL;
            examine = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ($$genlMt.eql(cycl_utilities.atomic_sentence_predicate(examine))) {
                    final SubLObject rule_spec_mt = cycl_utilities.atomic_sentence_arg2(examine, UNPROVIDED);
                    if ((NIL != variables.fully_bound_p(rule_spec_mt)) && (NIL != genl_mts.genl_mtP(rule_spec_mt, inference_mt, NIL, UNPROVIDED))) {
                        thread.resetMultipleValues();
                        final SubLObject v_bindings = unification_utilities.term_unify(inference_arg1, cycl_utilities.atomic_sentence_arg1(examine, UNPROVIDED), NIL, T);
                        final SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != v_bindings) {
                            return values(v_bindings, examine, inference_mt, rule_spec_mt, unify_justification);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                examine = cdolist_list_var.first();
            } 
        }
        return values(NIL, NIL, NIL, NIL, NIL);
    }

    public static final SubLObject trans_genl_mt_pos_rule_filter_alt(SubLObject asent, SubLObject rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_bindings = com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_genl_mt_pos_expand_int(asent, rule);
                SubLObject examine = thread.secondMultipleValue();
                SubLObject inference_mt = thread.thirdMultipleValue();
                SubLObject rule_spec_mt = thread.fourthMultipleValue();
                SubLObject more_supports = thread.fifthMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    return T;
                }
            }
            return NIL;
        }
    }

    public static SubLObject trans_genl_mt_pos_rule_filter(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_genl_mt_pos_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject inference_mt = thread.thirdMultipleValue();
        final SubLObject rule_spec_mt = thread.fourthMultipleValue();
        final SubLObject more_supports = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject trans_genl_mt_pos_expand_alt(SubLObject asent, SubLObject rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_bindings = com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_genl_mt_pos_expand_int(asent, rule);
                SubLObject examine = thread.secondMultipleValue();
                SubLObject inference_mt = thread.thirdMultipleValue();
                SubLObject rule_spec_mt = thread.fourthMultipleValue();
                SubLObject more_supports = thread.fifthMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    {
                        SubLObject genl_mt_supports = com.cyc.cycjava.cycl.inference.modules.transformation_modules.additional_genl_mt_supports(rule_spec_mt, inference_mt);
                        backward.transformation_add_node(rule, examine, $POS, v_bindings, append(genl_mt_supports, more_supports));
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject trans_genl_mt_pos_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_genl_mt_pos_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject inference_mt = thread.thirdMultipleValue();
        final SubLObject rule_spec_mt = thread.fourthMultipleValue();
        final SubLObject more_supports = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            final SubLObject genl_mt_supports = additional_genl_mt_supports(rule_spec_mt, inference_mt);
            backward.transformation_add_node(rule, examine, $POS, v_bindings, append(genl_mt_supports, more_supports));
        }
        return NIL;
    }

    public static final SubLObject trans_genl_mt_neg_rule_select_alt(SubLObject asent) {
        {
            SubLObject rules = com.cyc.cycjava.cycl.inference.modules.transformation_modules.new_selected_rules();
            SubLObject inference_mt = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject rule_genl_mts = genl_mts.all_genl_mts(inference_mt, NIL, UNPROVIDED);
            SubLObject cdolist_list_var = rule_genl_mts;
            SubLObject rule_genl_mt = NIL;
            for (rule_genl_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rule_genl_mt = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_64 = backward_utilities.relevant_directions();
                    SubLObject direction = NIL;
                    for (direction = cdolist_list_var_64.first(); NIL != cdolist_list_var_64; cdolist_list_var_64 = cdolist_list_var_64.rest() , direction = cdolist_list_var_64.first()) {
                        if (NIL != kb_mapping_macros.do_genl_mt_rule_index_key_validator(rule_genl_mt, $NEG, direction)) {
                            {
                                SubLObject iterator_var = kb_mapping_macros.new_genl_mt_rule_final_index_spec_iterator(rule_genl_mt, $NEG, direction);
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
                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                                    {
                                                        SubLObject done_var_65 = NIL;
                                                        SubLObject token_var_66 = NIL;
                                                        while (NIL == done_var_65) {
                                                            {
                                                                SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_66);
                                                                SubLObject valid_67 = makeBoolean(token_var_66 != rule);
                                                                if (NIL != valid_67) {
                                                                    rules = com.cyc.cycjava.cycl.inference.modules.transformation_modules.add_selected_rule(rule, rules);
                                                                }
                                                                done_var_65 = makeBoolean(NIL == valid_67);
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
                }
            }
            return com.cyc.cycjava.cycl.inference.modules.transformation_modules.finalize_selected_rules(rules);
        }
    }

    public static SubLObject trans_genl_mt_neg_rule_select(final SubLObject asent) {
        SubLObject rules = new_selected_rules();
        final SubLObject inference_mt = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject rule_genl_mts = cdolist_list_var = genl_mts.all_genl_mts(inference_mt, NIL, UNPROVIDED);
        SubLObject rule_genl_mt = NIL;
        rule_genl_mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$57 = backward_utilities.relevant_directions();
            SubLObject direction = NIL;
            direction = cdolist_list_var_$57.first();
            while (NIL != cdolist_list_var_$57) {
                if (NIL != kb_mapping_macros.do_genl_mt_rule_index_key_validator(rule_genl_mt, $NEG, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_genl_mt_rule_final_index_spec_iterator(rule_genl_mt, $NEG, direction);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                SubLObject done_var_$58 = NIL;
                                final SubLObject token_var_$59 = NIL;
                                while (NIL == done_var_$58) {
                                    final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$59);
                                    final SubLObject valid_$60 = makeBoolean(!token_var_$59.eql(rule));
                                    if (NIL != valid_$60) {
                                        rules = add_selected_rule(rule, rules);
                                    }
                                    done_var_$58 = makeBoolean(NIL == valid_$60);
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
                cdolist_list_var_$57 = cdolist_list_var_$57.rest();
                direction = cdolist_list_var_$57.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            rule_genl_mt = cdolist_list_var.first();
        } 
        return finalize_selected_rules(rules);
    }

    public static final SubLObject trans_genl_mt_neg_expand_int_alt(SubLObject asent, SubLObject rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject inference_arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject inference_mt = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                SubLObject rule_var = rule;
                if (NIL != backward_utilities.rule_relevant_to_proof(rule_var)) {
                    {
                        SubLObject assertion_var = rule_var;
                        SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
                        SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
                        SubLObject examine = NIL;
                        for (examine = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , examine = cdolist_list_var.first()) {
                            if ($$genlMt == cycl_utilities.atomic_sentence_predicate(examine)) {
                                {
                                    SubLObject rule_genl_mt = cycl_utilities.atomic_sentence_arg2(examine, UNPROVIDED);
                                    if ((NIL != variables.fully_bound_p(rule_genl_mt)) && (NIL != genl_mts.genl_mtP(inference_mt, rule_genl_mt, NIL, UNPROVIDED))) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject v_bindings = unification_utilities.term_unify(inference_arg1, cycl_utilities.atomic_sentence_arg1(examine, UNPROVIDED), NIL, T);
                                            SubLObject unify_justification = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != v_bindings) {
                                                return values(v_bindings, examine, inference_mt, rule_genl_mt, unify_justification);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return values(NIL, NIL, NIL, NIL, NIL);
        }
    }

    public static SubLObject trans_genl_mt_neg_expand_int(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject inference_mt = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
            SubLObject examine = NIL;
            examine = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ($$genlMt.eql(cycl_utilities.atomic_sentence_predicate(examine))) {
                    final SubLObject rule_genl_mt = cycl_utilities.atomic_sentence_arg2(examine, UNPROVIDED);
                    if ((NIL != variables.fully_bound_p(rule_genl_mt)) && (NIL != genl_mts.genl_mtP(inference_mt, rule_genl_mt, NIL, UNPROVIDED))) {
                        thread.resetMultipleValues();
                        final SubLObject v_bindings = unification_utilities.term_unify(inference_arg1, cycl_utilities.atomic_sentence_arg1(examine, UNPROVIDED), NIL, T);
                        final SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != v_bindings) {
                            return values(v_bindings, examine, inference_mt, rule_genl_mt, unify_justification);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                examine = cdolist_list_var.first();
            } 
        }
        return values(NIL, NIL, NIL, NIL, NIL);
    }

    public static final SubLObject trans_genl_mt_neg_rule_filter_alt(SubLObject asent, SubLObject rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_bindings = com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_genl_mt_neg_expand_int(asent, rule);
                SubLObject examine = thread.secondMultipleValue();
                SubLObject inference_mt = thread.thirdMultipleValue();
                SubLObject rule_genl_mt = thread.fourthMultipleValue();
                SubLObject more_supports = thread.fifthMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    return T;
                }
            }
            return NIL;
        }
    }

    public static SubLObject trans_genl_mt_neg_rule_filter(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_genl_mt_neg_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject inference_mt = thread.thirdMultipleValue();
        final SubLObject rule_genl_mt = thread.fourthMultipleValue();
        final SubLObject more_supports = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject trans_genl_mt_neg_expand_alt(SubLObject asent, SubLObject rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_bindings = com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_genl_mt_neg_expand_int(asent, rule);
                SubLObject examine = thread.secondMultipleValue();
                SubLObject inference_mt = thread.thirdMultipleValue();
                SubLObject rule_genl_mt = thread.fourthMultipleValue();
                SubLObject more_supports = thread.fifthMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    {
                        SubLObject genl_mt_supports = com.cyc.cycjava.cycl.inference.modules.transformation_modules.additional_genl_mt_supports(inference_mt, rule_genl_mt);
                        backward.transformation_add_node(rule, examine, $NEG, v_bindings, append(genl_mt_supports, more_supports));
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject trans_genl_mt_neg_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_genl_mt_neg_expand_int(asent, rule);
        final SubLObject examine = thread.secondMultipleValue();
        final SubLObject inference_mt = thread.thirdMultipleValue();
        final SubLObject rule_genl_mt = thread.fourthMultipleValue();
        final SubLObject more_supports = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            final SubLObject genl_mt_supports = additional_genl_mt_supports(inference_mt, rule_genl_mt);
            backward.transformation_add_node(rule, examine, $NEG, v_bindings, append(genl_mt_supports, more_supports));
        }
        return NIL;
    }

    public static final SubLObject trans_abnormal_cost_alt(SubLObject asent) {
        return kb_indexing.relevant_num_exception_rule_index(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    public static SubLObject trans_abnormal_cost(final SubLObject asent) {
        return kb_indexing.relevant_num_exception_rule_index(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    public static final SubLObject trans_abnormal_rule_select_alt(SubLObject asent) {
        {
            SubLObject rule = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject exceptions = com.cyc.cycjava.cycl.inference.modules.transformation_modules.new_selected_rules();
            SubLObject cdolist_list_var = backward_utilities.relevant_directions();
            SubLObject direction = NIL;
            for (direction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , direction = cdolist_list_var.first()) {
                if (NIL != kb_mapping_macros.do_exception_rule_index_key_validator(rule, direction)) {
                    {
                        SubLObject iterator_var = kb_mapping_macros.new_exception_rule_final_index_spec_iterator(rule, direction);
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
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                            {
                                                SubLObject done_var_68 = NIL;
                                                SubLObject token_var_69 = NIL;
                                                while (NIL == done_var_68) {
                                                    {
                                                        SubLObject exception = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_69);
                                                        SubLObject valid_70 = makeBoolean(token_var_69 != exception);
                                                        if (NIL != valid_70) {
                                                            exceptions = com.cyc.cycjava.cycl.inference.modules.transformation_modules.add_selected_rule(exception, exceptions);
                                                        }
                                                        done_var_68 = makeBoolean(NIL == valid_70);
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
            return com.cyc.cycjava.cycl.inference.modules.transformation_modules.finalize_selected_rules(exceptions);
        }
    }

    public static SubLObject trans_abnormal_rule_select(final SubLObject asent) {
        final SubLObject rule = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject exceptions = new_selected_rules();
        SubLObject cdolist_list_var = backward_utilities.relevant_directions();
        SubLObject direction = NIL;
        direction = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != kb_mapping_macros.do_exception_rule_index_key_validator(rule, direction)) {
                final SubLObject iterator_var = kb_mapping_macros.new_exception_rule_final_index_spec_iterator(rule, direction);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                            SubLObject done_var_$61 = NIL;
                            final SubLObject token_var_$62 = NIL;
                            while (NIL == done_var_$61) {
                                final SubLObject exception = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$62);
                                final SubLObject valid_$63 = makeBoolean(!token_var_$62.eql(exception));
                                if (NIL != valid_$63) {
                                    exceptions = add_selected_rule(exception, exceptions);
                                }
                                done_var_$61 = makeBoolean(NIL == valid_$63);
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
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        } 
        return finalize_selected_rules(exceptions);
    }

    public static final SubLObject trans_abnormal_expand_int_alt(SubLObject asent, SubLObject exception) {
        {
            SubLObject rule = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject predicate_var = $$abnormal;
            SubLObject rule_var = exception;
            if (NIL != backward_utilities.rule_relevant_to_proof(rule_var)) {
                {
                    SubLObject assertion_var = rule_var;
                    SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
                    SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
                    SubLObject examine = NIL;
                    for (examine = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , examine = cdolist_list_var.first()) {
                        if (predicate_var == cycl_utilities.atomic_sentence_predicate(examine)) {
                            if (rule == cycl_utilities.atomic_sentence_arg2(examine, UNPROVIDED)) {
                                {
                                    SubLObject v_bindings = unification_utilities.transformation_asent_unify(asent, examine);
                                    if (NIL != v_bindings) {
                                        return values(v_bindings, examine);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return values(NIL, NIL);
    }

    public static SubLObject trans_abnormal_expand_int(final SubLObject asent, final SubLObject exception) {
        final SubLObject rule = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject predicate_var = $$abnormal;
        if (NIL != backward_utilities.rule_relevant_to_proof(exception)) {
            final SubLObject cnf_var = assertions_high.assertion_cnf(exception);
            SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
            SubLObject examine = NIL;
            examine = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(examine)) && rule.eql(cycl_utilities.atomic_sentence_arg2(examine, UNPROVIDED))) {
                    final SubLObject v_bindings = unification_utilities.transformation_asent_unify(asent, examine);
                    if (NIL != v_bindings) {
                        return values(v_bindings, examine);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                examine = cdolist_list_var.first();
            } 
        }
        return values(NIL, NIL);
    }

    public static final SubLObject trans_abnormal_rule_filter_alt(SubLObject asent, SubLObject exception) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_bindings = com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_abnormal_expand_int(asent, exception);
                SubLObject examine = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    return T;
                }
            }
            return NIL;
        }
    }

    public static SubLObject trans_abnormal_rule_filter(final SubLObject asent, final SubLObject exception) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_abnormal_expand_int(asent, exception);
        final SubLObject examine = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject trans_abnormal_expand_alt(SubLObject asent, SubLObject exception) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_bindings = com.cyc.cycjava.cycl.inference.modules.transformation_modules.trans_abnormal_expand_int(asent, exception);
                SubLObject examine = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    backward.transformation_add_node(exception, examine, $POS, v_bindings, UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static SubLObject trans_abnormal_expand(final SubLObject asent, final SubLObject exception) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = trans_abnormal_expand_int(asent, exception);
        final SubLObject examine = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            backward.transformation_add_node(exception, examine, $POS, v_bindings, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject transformation_abduction_to_specs_required_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject problem_store = inference_worker.currently_active_problem_store();
            return makeBoolean(((NIL != problem_store) && (NIL != inference_datastructures_problem_store.problem_store_abduction_allowedP(problem_store))) && (NIL != inference_abduction_utilities.abduction_allowed_on_asentP(asent, UNPROVIDED, UNPROVIDED)));
        }
    }

    public static SubLObject transformation_abduction_to_specs_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject problem_store = inference_worker.currently_active_problem_store();
        return makeBoolean(((NIL != problem_store) && (NIL != inference_datastructures_problem_store.problem_store_abduction_allowedP(problem_store))) && (NIL != inference_abduction_utilities.abduction_allowed_on_asentP(asent, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject find_genls_definitional_rules_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $genls_definitional_rules$.getDynamicValue(thread)) {
                return $genls_definitional_rules$.getDynamicValue(thread);
            }
            {
                SubLObject rules = fi.sentence_assertions($genls_definitional_sentence$.getDynamicValue(thread), mt_vars.$assertible_theory_mt_root$.getGlobalValue());
                if (NIL != rules) {
                    $genls_definitional_rules$.setDynamicValue(rules, thread);
                    return rules;
                }
            }
            return NIL;
        }
    }

    public static SubLObject find_genls_definitional_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $genls_definitional_rules$.getDynamicValue(thread)) {
            return $genls_definitional_rules$.getDynamicValue(thread);
        }
        final SubLObject rules = fi.sentence_assertions($genls_definitional_sentence$.getDynamicValue(thread), mt_vars.$assertible_theory_mt_root$.getGlobalValue());
        if (NIL != rules) {
            $genls_definitional_rules$.setDynamicValue(rules, thread);
            return rules;
        }
        return NIL;
    }

    public static final SubLObject transformation_abduction_to_specs_rule_select_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.transformation_modules.find_genls_definitional_rules();
    }

    public static SubLObject transformation_abduction_to_specs_rule_select(final SubLObject asent) {
        return find_genls_definitional_rules();
    }

    public static final SubLObject transformation_abduction_to_specs_rule_filter_alt(SubLObject asent, SubLObject rule) {
        return memberP(rule, com.cyc.cycjava.cycl.inference.modules.transformation_modules.find_genls_definitional_rules(), symbol_function(EQ), UNPROVIDED);
    }

    public static SubLObject transformation_abduction_to_specs_rule_filter(final SubLObject asent, final SubLObject rule) {
        return subl_promotions.memberP(rule, find_genls_definitional_rules(), symbol_function(EQL), UNPROVIDED);
    }

    public static final SubLObject transformation_abduction_to_specs_expand_alt(SubLObject asent, SubLObject rule) {
        {
            SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            SubLObject sense = $POS;
            SubLObject predicate_var = predicate;
            SubLObject rule_var = rule;
            if (NIL != backward_utilities.rule_relevant_to_proof(rule_var)) {
                {
                    SubLObject assertion_var = rule_var;
                    SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
                    if ($POS == sense) {
                        {
                            SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
                            SubLObject examine = NIL;
                            for (examine = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , examine = cdolist_list_var.first()) {
                                if (predicate_var == cycl_utilities.atomic_sentence_predicate(examine)) {
                                    {
                                        SubLObject v_bindings = unification_utilities.transformation_asent_unify(asent, examine);
                                        if (NIL != v_bindings) {
                                            backward.transformation_add_node(rule, examine, sense, v_bindings, UNPROVIDED);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if ($NEG == sense) {
                            {
                                SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
                                SubLObject examine = NIL;
                                for (examine = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , examine = cdolist_list_var.first()) {
                                    if (predicate_var == cycl_utilities.atomic_sentence_predicate(examine)) {
                                        {
                                            SubLObject v_bindings = unification_utilities.transformation_asent_unify(asent, examine);
                                            if (NIL != v_bindings) {
                                                backward.transformation_add_node(rule, examine, sense, v_bindings, UNPROVIDED);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            Errors.error($str_alt51$Invalid_sense__s, sense);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject transformation_abduction_to_specs_expand(final SubLObject asent, final SubLObject rule) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject sense = $POS;
        final SubLObject predicate_var = predicate;
        if (NIL != backward_utilities.rule_relevant_to_proof(rule)) {
            final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
            if ($POS == sense) {
                SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
                SubLObject examine = NIL;
                examine = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(examine))) {
                        final SubLObject v_bindings = unification_utilities.transformation_asent_unify(asent, examine);
                        if (NIL != v_bindings) {
                            backward.transformation_add_node(rule, examine, sense, v_bindings, UNPROVIDED);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    examine = cdolist_list_var.first();
                } 
            } else
                if ($NEG == sense) {
                    SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
                    SubLObject examine = NIL;
                    examine = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(examine))) {
                            final SubLObject v_bindings = unification_utilities.transformation_asent_unify(asent, examine);
                            if (NIL != v_bindings) {
                                backward.transformation_add_node(rule, examine, sense, v_bindings, UNPROVIDED);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        examine = cdolist_list_var.first();
                    } 
                } else {
                    Errors.error($str47$Invalid_sense__s, sense);
                }

        }
        return NIL;
    }

    public static final SubLObject declare_transformation_modules_file_alt() {
        declareFunction("additional_genls_supports", "ADDITIONAL-GENLS-SUPPORTS", 2, 0, false);
        declareFunction("additional_genl_mt_supports", "ADDITIONAL-GENL-MT-SUPPORTS", 2, 0, false);
        declareFunction("additional_genlpreds_supports", "ADDITIONAL-GENLPREDS-SUPPORTS", 2, 0, false);
        declareFunction("additional_negationpreds_supports", "ADDITIONAL-NEGATIONPREDS-SUPPORTS", 2, 0, false);
        declareFunction("additional_asymmetry_supports", "ADDITIONAL-ASYMMETRY-SUPPORTS", 1, 0, false);
        declareFunction("additional_predicate_commutativity_supports", "ADDITIONAL-PREDICATE-COMMUTATIVITY-SUPPORTS", 1, 0, false);
        declareFunction("transformation_gaf_truth_known", "TRANSFORMATION-GAF-TRUTH-KNOWN", 1, 0, false);
        declareFunction("gaf_truth_known", "GAF-TRUTH-KNOWN", 1, 0, false);
        declareFunction("modus_tollens_transformation_module_p", "MODUS-TOLLENS-TRANSFORMATION-MODULE-P", 1, 0, false);
        declareFunction("modus_tollens_transformation_proof_p", "MODUS-TOLLENS-TRANSFORMATION-PROOF-P", 1, 0, false);
        declareMacro("do_transformation_relevant_directions", "DO-TRANSFORMATION-RELEVANT-DIRECTIONS");
        declareMacro("do_transformation_rule_literals", "DO-TRANSFORMATION-RULE-LITERALS");
        declareMacro("do_transformation_predicate_rule_index", "DO-TRANSFORMATION-PREDICATE-RULE-INDEX");
        declareFunction("new_selected_rules", "NEW-SELECTED-RULES", 0, 0, false);
        declareFunction("add_selected_rule", "ADD-SELECTED-RULE", 2, 0, false);
        declareFunction("finalize_selected_rules", "FINALIZE-SELECTED-RULES", 1, 0, false);
        declareFunction("sort_rules_via_current_inference_rule_preference", "SORT-RULES-VIA-CURRENT-INFERENCE-RULE-PREFERENCE", 1, 0, false);
        declareFunction("current_inference_rule_preference_G", "CURRENT-INFERENCE-RULE-PREFERENCE->", 2, 0, false);
        declareFunction("trans_predicate_pos_required", "TRANS-PREDICATE-POS-REQUIRED", 1, 0, false);
        new com.cyc.cycjava.cycl.inference.modules.transformation_modules.$trans_predicate_pos_required$UnaryFunction();
        declareFunction("trans_predicate_neg_required", "TRANS-PREDICATE-NEG-REQUIRED", 1, 0, false);
        declareFunction("trans_predicate_pos_cost", "TRANS-PREDICATE-POS-COST", 1, 0, false);
        new com.cyc.cycjava.cycl.inference.modules.transformation_modules.$trans_predicate_pos_cost$UnaryFunction();
        declareFunction("trans_predicate_neg_cost", "TRANS-PREDICATE-NEG-COST", 1, 0, false);
        declareFunction("trans_predicate_pos_rule_select", "TRANS-PREDICATE-POS-RULE-SELECT", 1, 0, false);
        new com.cyc.cycjava.cycl.inference.modules.transformation_modules.$trans_predicate_pos_rule_select$UnaryFunction();
        declareFunction("trans_predicate_neg_rule_select", "TRANS-PREDICATE-NEG-RULE-SELECT", 1, 0, false);
        declareFunction("trans_predicate_pos_rule_filter", "TRANS-PREDICATE-POS-RULE-FILTER", 2, 0, false);
        new com.cyc.cycjava.cycl.inference.modules.transformation_modules.$trans_predicate_pos_rule_filter$BinaryFunction();
        declareFunction("trans_predicate_neg_rule_filter", "TRANS-PREDICATE-NEG-RULE-FILTER", 2, 0, false);
        declareFunction("trans_predicate_pos_expand", "TRANS-PREDICATE-POS-EXPAND", 2, 0, false);
        new com.cyc.cycjava.cycl.inference.modules.transformation_modules.$trans_predicate_pos_expand$BinaryFunction();
        declareFunction("trans_predicate_neg_expand", "TRANS-PREDICATE-NEG-EXPAND", 2, 0, false);
        declareFunction("trans_predicate_required", "TRANS-PREDICATE-REQUIRED", 1, 0, false);
        declareFunction("trans_predicate_cost", "TRANS-PREDICATE-COST", 2, 0, false);
        declareFunction("trans_predicate_rule_select", "TRANS-PREDICATE-RULE-SELECT", 2, 0, false);
        declareFunction("trans_predicate_rule_select_int_internal", "TRANS-PREDICATE-RULE-SELECT-INT-INTERNAL", 2, 0, false);
        declareFunction("trans_predicate_rule_select_int", "TRANS-PREDICATE-RULE-SELECT-INT", 2, 0, false);
        declareFunction("trans_predicate_rule_filter", "TRANS-PREDICATE-RULE-FILTER", 3, 0, false);
        declareFunction("trans_predicate_expand", "TRANS-PREDICATE-EXPAND", 3, 0, false);
        declareFunction("trans_predicate_genlpreds_pos_required", "TRANS-PREDICATE-GENLPREDS-POS-REQUIRED", 1, 0, false);
        new com.cyc.cycjava.cycl.inference.modules.transformation_modules.$trans_predicate_genlpreds_pos_required$UnaryFunction();
        declareFunction("trans_predicate_genlpreds_neg_required", "TRANS-PREDICATE-GENLPREDS-NEG-REQUIRED", 1, 0, false);
        declareFunction("trans_predicate_genlpreds_pos_cost", "TRANS-PREDICATE-GENLPREDS-POS-COST", 1, 0, false);
        new com.cyc.cycjava.cycl.inference.modules.transformation_modules.$trans_predicate_genlpreds_pos_cost$UnaryFunction();
        declareFunction("trans_predicate_genlpreds_neg_cost", "TRANS-PREDICATE-GENLPREDS-NEG-COST", 1, 0, false);
        declareFunction("trans_predicate_genlpreds_pos_rule_select", "TRANS-PREDICATE-GENLPREDS-POS-RULE-SELECT", 1, 0, false);
        new com.cyc.cycjava.cycl.inference.modules.transformation_modules.$trans_predicate_genlpreds_pos_rule_select$UnaryFunction();
        declareFunction("trans_predicate_genlpreds_pos_rule_select_int_internal", "TRANS-PREDICATE-GENLPREDS-POS-RULE-SELECT-INT-INTERNAL", 1, 0, false);
        declareFunction("trans_predicate_genlpreds_pos_rule_select_int", "TRANS-PREDICATE-GENLPREDS-POS-RULE-SELECT-INT", 1, 0, false);
        declareFunction("trans_predicate_genlpreds_neg_rule_select", "TRANS-PREDICATE-GENLPREDS-NEG-RULE-SELECT", 1, 0, false);
        declareFunction("trans_predicate_genlpreds_pos_expand_int", "TRANS-PREDICATE-GENLPREDS-POS-EXPAND-INT", 2, 0, false);
        declareFunction("trans_predicate_genlpreds_pos_rule_filter", "TRANS-PREDICATE-GENLPREDS-POS-RULE-FILTER", 2, 0, false);
        declareFunction("trans_predicate_genlpreds_pos_expand", "TRANS-PREDICATE-GENLPREDS-POS-EXPAND", 2, 0, false);
        declareFunction("trans_predicate_genlpreds_neg_expand_int", "TRANS-PREDICATE-GENLPREDS-NEG-EXPAND-INT", 2, 0, false);
        declareFunction("trans_predicate_genlpreds_neg_rule_filter", "TRANS-PREDICATE-GENLPREDS-NEG-RULE-FILTER", 2, 0, false);
        declareFunction("trans_predicate_genlpreds_neg_expand", "TRANS-PREDICATE-GENLPREDS-NEG-EXPAND", 2, 0, false);
        declareFunction("trans_predicate_genlpreds_required", "TRANS-PREDICATE-GENLPREDS-REQUIRED", 1, 0, false);
        declareFunction("inference_proper_genl_predicateP", "INFERENCE-PROPER-GENL-PREDICATE?", 2, 1, false);
        declareFunction("trans_predicate_negationpreds_neg_required", "TRANS-PREDICATE-NEGATIONPREDS-NEG-REQUIRED", 1, 0, false);
        declareFunction("trans_predicate_negationpreds_neg_cost", "TRANS-PREDICATE-NEGATIONPREDS-NEG-COST", 1, 0, false);
        declareFunction("trans_predicate_negationpreds_neg_rule_select", "TRANS-PREDICATE-NEGATIONPREDS-NEG-RULE-SELECT", 1, 0, false);
        declareFunction("trans_predicate_negationpreds_neg_expand_int", "TRANS-PREDICATE-NEGATIONPREDS-NEG-EXPAND-INT", 2, 0, false);
        declareFunction("trans_predicate_negationpreds_neg_rule_filter", "TRANS-PREDICATE-NEGATIONPREDS-NEG-RULE-FILTER", 2, 0, false);
        declareFunction("trans_predicate_negationpreds_neg_expand", "TRANS-PREDICATE-NEGATIONPREDS-NEG-EXPAND", 2, 0, false);
        declareFunction("trans_predicate_commutativity_cost", "TRANS-PREDICATE-COMMUTATIVITY-COST", 2, 0, false);
        declareFunction("trans_predicate_commutativity_rule_select", "TRANS-PREDICATE-COMMUTATIVITY-RULE-SELECT", 2, 0, false);
        declareFunction("trans_predicate_commutativity_expand_int", "TRANS-PREDICATE-COMMUTATIVITY-EXPAND-INT", 3, 0, false);
        declareFunction("trans_predicate_commutativity_rule_filter", "TRANS-PREDICATE-COMMUTATIVITY-RULE-FILTER", 3, 0, false);
        declareFunction("trans_predicate_commutativity_expand", "TRANS-PREDICATE-COMMUTATIVITY-EXPAND", 3, 0, false);
        declareFunction("trans_predicate_symmetry_pos_cost", "TRANS-PREDICATE-SYMMETRY-POS-COST", 1, 0, false);
        new com.cyc.cycjava.cycl.inference.modules.transformation_modules.$trans_predicate_symmetry_pos_cost$UnaryFunction();
        declareFunction("trans_predicate_symmetry_neg_cost", "TRANS-PREDICATE-SYMMETRY-NEG-COST", 1, 0, false);
        declareFunction("trans_predicate_symmetry_pos_rule_select", "TRANS-PREDICATE-SYMMETRY-POS-RULE-SELECT", 1, 0, false);
        new com.cyc.cycjava.cycl.inference.modules.transformation_modules.$trans_predicate_symmetry_pos_rule_select$UnaryFunction();
        declareFunction("trans_predicate_symmetry_neg_rule_select", "TRANS-PREDICATE-SYMMETRY-NEG-RULE-SELECT", 1, 0, false);
        declareFunction("trans_predicate_symmetry_pos_rule_filter", "TRANS-PREDICATE-SYMMETRY-POS-RULE-FILTER", 2, 0, false);
        new com.cyc.cycjava.cycl.inference.modules.transformation_modules.$trans_predicate_symmetry_pos_rule_filter$BinaryFunction();
        declareFunction("trans_predicate_symmetry_neg_rule_filter", "TRANS-PREDICATE-SYMMETRY-NEG-RULE-FILTER", 2, 0, false);
        declareFunction("trans_predicate_symmetry_pos_expand", "TRANS-PREDICATE-SYMMETRY-POS-EXPAND", 2, 0, false);
        new com.cyc.cycjava.cycl.inference.modules.transformation_modules.$trans_predicate_symmetry_pos_expand$BinaryFunction();
        declareFunction("trans_predicate_symmetry_neg_expand", "TRANS-PREDICATE-SYMMETRY-NEG-EXPAND", 2, 0, false);
        declareFunction("trans_predicate_commutative_pos_cost", "TRANS-PREDICATE-COMMUTATIVE-POS-COST", 1, 0, false);
        declareFunction("trans_predicate_commutative_neg_cost", "TRANS-PREDICATE-COMMUTATIVE-NEG-COST", 1, 0, false);
        declareFunction("trans_predicate_commutative_pos_rule_select", "TRANS-PREDICATE-COMMUTATIVE-POS-RULE-SELECT", 1, 0, false);
        declareFunction("trans_predicate_commutative_neg_rule_select", "TRANS-PREDICATE-COMMUTATIVE-NEG-RULE-SELECT", 1, 0, false);
        declareFunction("trans_predicate_commutative_pos_rule_filter", "TRANS-PREDICATE-COMMUTATIVE-POS-RULE-FILTER", 2, 0, false);
        declareFunction("trans_predicate_commutative_neg_rule_filter", "TRANS-PREDICATE-COMMUTATIVE-NEG-RULE-FILTER", 2, 0, false);
        declareFunction("trans_predicate_commutative_pos_expand", "TRANS-PREDICATE-COMMUTATIVE-POS-EXPAND", 2, 0, false);
        declareFunction("trans_predicate_commutative_neg_expand", "TRANS-PREDICATE-COMMUTATIVE-NEG-EXPAND", 2, 0, false);
        declareFunction("trans_predicate_partially_commutative_pos_cost", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-COST", 1, 0, false);
        declareFunction("trans_predicate_partially_commutative_neg_cost", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-COST", 1, 0, false);
        declareFunction("trans_predicate_partially_commutative_pos_rule_select", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-RULE-SELECT", 1, 0, false);
        declareFunction("trans_predicate_partially_commutative_neg_rule_select", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-RULE-SELECT", 1, 0, false);
        declareFunction("trans_predicate_partially_commutative_pos_rule_filter", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-RULE-FILTER", 2, 0, false);
        declareFunction("trans_predicate_partially_commutative_neg_rule_filter", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-RULE-FILTER", 2, 0, false);
        declareFunction("trans_predicate_partially_commutative_pos_expand", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-EXPAND", 2, 0, false);
        declareFunction("trans_predicate_partially_commutative_neg_expand", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-EXPAND", 2, 0, false);
        declareFunction("trans_predicate_asymmetry_cost", "TRANS-PREDICATE-ASYMMETRY-COST", 1, 0, false);
        declareFunction("trans_predicate_asymmetry_rule_select", "TRANS-PREDICATE-ASYMMETRY-RULE-SELECT", 1, 0, false);
        declareFunction("trans_predicate_asymmetry_expand_int", "TRANS-PREDICATE-ASYMMETRY-EXPAND-INT", 2, 0, false);
        declareFunction("trans_predicate_asymmetry_rule_filter", "TRANS-PREDICATE-ASYMMETRY-RULE-FILTER", 2, 0, false);
        declareFunction("trans_predicate_asymmetry_expand", "TRANS-PREDICATE-ASYMMETRY-EXPAND", 2, 0, false);
        declareFunction("trans_unbound_predicate_module_p", "TRANS-UNBOUND-PREDICATE-MODULE-P", 1, 0, false);
        declareFunction("module_requires_unbound_predicate_transformationP", "MODULE-REQUIRES-UNBOUND-PREDICATE-TRANSFORMATION?", 1, 0, false);
        declareFunction("trans_unbound_predicate_pos_required", "TRANS-UNBOUND-PREDICATE-POS-REQUIRED", 1, 0, false);
        new com.cyc.cycjava.cycl.inference.modules.transformation_modules.$trans_unbound_predicate_pos_required$UnaryFunction();
        declareFunction("trans_unbound_predicate_neg_required", "TRANS-UNBOUND-PREDICATE-NEG-REQUIRED", 1, 0, false);
        declareFunction("trans_unbound_predicate_pos_cost", "TRANS-UNBOUND-PREDICATE-POS-COST", 1, 0, false);
        new com.cyc.cycjava.cycl.inference.modules.transformation_modules.$trans_unbound_predicate_pos_cost$UnaryFunction();
        declareFunction("trans_unbound_predicate_neg_cost", "TRANS-UNBOUND-PREDICATE-NEG-COST", 1, 0, false);
        declareFunction("trans_unbound_predicate_pos_rule_select", "TRANS-UNBOUND-PREDICATE-POS-RULE-SELECT", 1, 0, false);
        declareFunction("trans_unbound_predicate_neg_rule_select", "TRANS-UNBOUND-PREDICATE-NEG-RULE-SELECT", 1, 0, false);
        declareFunction("trans_unbound_predicate_pos_rule_filter", "TRANS-UNBOUND-PREDICATE-POS-RULE-FILTER", 2, 0, false);
        declareFunction("trans_unbound_predicate_neg_rule_filter", "TRANS-UNBOUND-PREDICATE-NEG-RULE-FILTER", 2, 0, false);
        declareFunction("trans_unbound_predicate_pos_expand", "TRANS-UNBOUND-PREDICATE-POS-EXPAND", 2, 0, false);
        declareFunction("trans_unbound_predicate_neg_expand", "TRANS-UNBOUND-PREDICATE-NEG-EXPAND", 2, 0, false);
        declareFunction("trans_unbound_predicate_required", "TRANS-UNBOUND-PREDICATE-REQUIRED", 1, 0, false);
        declareFunction("trans_unbound_predicate_cost", "TRANS-UNBOUND-PREDICATE-COST", 1, 0, false);
        declareFunction("trans_unbound_predicate_rule_select", "TRANS-UNBOUND-PREDICATE-RULE-SELECT", 1, 0, false);
        declareFunction("trans_unbound_predicate_rule_filter", "TRANS-UNBOUND-PREDICATE-RULE-FILTER", 2, 0, false);
        declareFunction("trans_unbound_predicate_expand", "TRANS-UNBOUND-PREDICATE-EXPAND", 3, 0, false);
        declareFunction("module_requires_hl_predicate_transformationP", "MODULE-REQUIRES-HL-PREDICATE-TRANSFORMATION?", 1, 0, false);
        declareFunction("trans_isa_pos_required", "TRANS-ISA-POS-REQUIRED", 1, 0, false);
        declareFunction("trans_isa_neg_required", "TRANS-ISA-NEG-REQUIRED", 1, 0, false);
        declareFunction("trans_isa_pos_cost", "TRANS-ISA-POS-COST", 1, 0, false);
        declareFunction("trans_isa_neg_cost", "TRANS-ISA-NEG-COST", 1, 0, false);
        declareFunction("inference_memoized_all_specs_internal", "INFERENCE-MEMOIZED-ALL-SPECS-INTERNAL", 1, 1, false);
        declareFunction("inference_memoized_all_specs", "INFERENCE-MEMOIZED-ALL-SPECS", 1, 1, false);
        declareFunction("trans_isa_pos_rule_select_count_internal", "TRANS-ISA-POS-RULE-SELECT-COUNT-INTERNAL", 2, 0, false);
        declareFunction("trans_isa_pos_rule_select_count", "TRANS-ISA-POS-RULE-SELECT-COUNT", 2, 0, false);
        declareFunction("trans_isa_pos_rule_select", "TRANS-ISA-POS-RULE-SELECT", 1, 0, false);
        declareFunction("trans_isa_pos_expand_int", "TRANS-ISA-POS-EXPAND-INT", 2, 0, false);
        declareFunction("trans_isa_pos_rule_filter", "TRANS-ISA-POS-RULE-FILTER", 2, 0, false);
        declareFunction("trans_isa_pos_expand", "TRANS-ISA-POS-EXPAND", 2, 0, false);
        declareFunction("trans_isa_neg_rule_select", "TRANS-ISA-NEG-RULE-SELECT", 1, 0, false);
        declareFunction("trans_isa_neg_expand_int", "TRANS-ISA-NEG-EXPAND-INT", 2, 0, false);
        declareFunction("trans_isa_neg_rule_filter", "TRANS-ISA-NEG-RULE-FILTER", 2, 0, false);
        declareFunction("trans_isa_neg_expand", "TRANS-ISA-NEG-EXPAND", 2, 0, false);
        declareFunction("trans_genls_pos_required", "TRANS-GENLS-POS-REQUIRED", 1, 0, false);
        declareFunction("trans_genls_neg_required", "TRANS-GENLS-NEG-REQUIRED", 1, 0, false);
        declareFunction("trans_genls_pos_cost", "TRANS-GENLS-POS-COST", 1, 0, false);
        declareFunction("trans_genls_neg_cost", "TRANS-GENLS-NEG-COST", 1, 0, false);
        declareFunction("trans_genls_pos_rule_select", "TRANS-GENLS-POS-RULE-SELECT", 1, 0, false);
        declareFunction("trans_genls_pos_expand_int", "TRANS-GENLS-POS-EXPAND-INT", 2, 0, false);
        declareFunction("trans_genls_pos_rule_filter", "TRANS-GENLS-POS-RULE-FILTER", 2, 0, false);
        declareFunction("trans_genls_pos_expand", "TRANS-GENLS-POS-EXPAND", 2, 0, false);
        declareFunction("trans_genls_neg_rule_select", "TRANS-GENLS-NEG-RULE-SELECT", 1, 0, false);
        declareFunction("trans_genls_neg_expand_int", "TRANS-GENLS-NEG-EXPAND-INT", 2, 0, false);
        declareFunction("trans_genls_neg_rule_filter", "TRANS-GENLS-NEG-RULE-FILTER", 2, 0, false);
        declareFunction("trans_genls_neg_expand", "TRANS-GENLS-NEG-EXPAND", 2, 0, false);
        declareFunction("trans_genl_mt_pos_required", "TRANS-GENL-MT-POS-REQUIRED", 1, 0, false);
        declareFunction("trans_genl_mt_neg_required", "TRANS-GENL-MT-NEG-REQUIRED", 1, 0, false);
        declareFunction("trans_genl_mt_pos_cost", "TRANS-GENL-MT-POS-COST", 1, 0, false);
        declareFunction("trans_genl_mt_neg_cost", "TRANS-GENL-MT-NEG-COST", 1, 0, false);
        declareFunction("inference_memoized_all_spec_mts_internal", "INFERENCE-MEMOIZED-ALL-SPEC-MTS-INTERNAL", 1, 1, false);
        declareFunction("inference_memoized_all_spec_mts", "INFERENCE-MEMOIZED-ALL-SPEC-MTS", 1, 1, false);
        declareFunction("trans_genl_mt_pos_rule_select", "TRANS-GENL-MT-POS-RULE-SELECT", 1, 0, false);
        declareFunction("trans_genl_mt_pos_expand_int", "TRANS-GENL-MT-POS-EXPAND-INT", 2, 0, false);
        declareFunction("trans_genl_mt_pos_rule_filter", "TRANS-GENL-MT-POS-RULE-FILTER", 2, 0, false);
        declareFunction("trans_genl_mt_pos_expand", "TRANS-GENL-MT-POS-EXPAND", 2, 0, false);
        declareFunction("trans_genl_mt_neg_rule_select", "TRANS-GENL-MT-NEG-RULE-SELECT", 1, 0, false);
        declareFunction("trans_genl_mt_neg_expand_int", "TRANS-GENL-MT-NEG-EXPAND-INT", 2, 0, false);
        declareFunction("trans_genl_mt_neg_rule_filter", "TRANS-GENL-MT-NEG-RULE-FILTER", 2, 0, false);
        declareFunction("trans_genl_mt_neg_expand", "TRANS-GENL-MT-NEG-EXPAND", 2, 0, false);
        declareFunction("trans_abnormal_cost", "TRANS-ABNORMAL-COST", 1, 0, false);
        declareFunction("trans_abnormal_rule_select", "TRANS-ABNORMAL-RULE-SELECT", 1, 0, false);
        declareFunction("trans_abnormal_expand_int", "TRANS-ABNORMAL-EXPAND-INT", 2, 0, false);
        declareFunction("trans_abnormal_rule_filter", "TRANS-ABNORMAL-RULE-FILTER", 2, 0, false);
        declareFunction("trans_abnormal_expand", "TRANS-ABNORMAL-EXPAND", 2, 0, false);
        declareFunction("transformation_abduction_to_specs_required", "TRANSFORMATION-ABDUCTION-TO-SPECS-REQUIRED", 1, 1, false);
        declareFunction("find_genls_definitional_rules", "FIND-GENLS-DEFINITIONAL-RULES", 0, 0, false);
        declareFunction("transformation_abduction_to_specs_rule_select", "TRANSFORMATION-ABDUCTION-TO-SPECS-RULE-SELECT", 1, 0, false);
        declareFunction("transformation_abduction_to_specs_rule_filter", "TRANSFORMATION-ABDUCTION-TO-SPECS-RULE-FILTER", 2, 0, false);
        declareFunction("transformation_abduction_to_specs_expand", "TRANSFORMATION-ABDUCTION-TO-SPECS-EXPAND", 2, 0, false);
        return NIL;
    }

    public static SubLObject declare_transformation_modules_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("additional_genls_supports", "ADDITIONAL-GENLS-SUPPORTS", 2, 0, false);
            declareFunction("additional_genl_mt_supports", "ADDITIONAL-GENL-MT-SUPPORTS", 2, 0, false);
            declareFunction("additional_genlpreds_supports", "ADDITIONAL-GENLPREDS-SUPPORTS", 2, 0, false);
            declareFunction("additional_genlinverse_supports", "ADDITIONAL-GENLINVERSE-SUPPORTS", 2, 0, false);
            declareFunction("additional_negationpreds_supports", "ADDITIONAL-NEGATIONPREDS-SUPPORTS", 2, 0, false);
            declareFunction("additional_asymmetry_supports", "ADDITIONAL-ASYMMETRY-SUPPORTS", 1, 0, false);
            declareFunction("additional_predicate_commutativity_supports", "ADDITIONAL-PREDICATE-COMMUTATIVITY-SUPPORTS", 1, 0, false);
            declareFunction("transformation_gaf_truth_known", "TRANSFORMATION-GAF-TRUTH-KNOWN", 1, 0, false);
            declareFunction("modus_tollens_transformation_module_p", "MODUS-TOLLENS-TRANSFORMATION-MODULE-P", 1, 0, false);
            declareFunction("modus_tollens_transformation_proof_p", "MODUS-TOLLENS-TRANSFORMATION-PROOF-P", 1, 0, false);
            declareMacro("do_transformation_relevant_directions", "DO-TRANSFORMATION-RELEVANT-DIRECTIONS");
            declareMacro("do_transformation_rule_literals", "DO-TRANSFORMATION-RULE-LITERALS");
            declareMacro("do_transformation_predicate_rule_index", "DO-TRANSFORMATION-PREDICATE-RULE-INDEX");
            declareFunction("new_selected_rules", "NEW-SELECTED-RULES", 0, 0, false);
            declareFunction("add_selected_rule", "ADD-SELECTED-RULE", 2, 0, false);
            declareFunction("finalize_selected_rules", "FINALIZE-SELECTED-RULES", 1, 0, false);
            declareFunction("sort_rules_via_current_inference_rule_preference", "SORT-RULES-VIA-CURRENT-INFERENCE-RULE-PREFERENCE", 1, 0, false);
            declareFunction("current_inference_rule_preference_G", "CURRENT-INFERENCE-RULE-PREFERENCE->", 2, 0, false);
            declareFunction("trans_predicate_pos_required", "TRANS-PREDICATE-POS-REQUIRED", 1, 0, false);
            new transformation_modules.$trans_predicate_pos_required$UnaryFunction();
            declareFunction("trans_predicate_neg_required", "TRANS-PREDICATE-NEG-REQUIRED", 1, 0, false);
            declareFunction("trans_predicate_pos_cost", "TRANS-PREDICATE-POS-COST", 1, 0, false);
            new transformation_modules.$trans_predicate_pos_cost$UnaryFunction();
            declareFunction("trans_predicate_neg_cost", "TRANS-PREDICATE-NEG-COST", 1, 0, false);
            declareFunction("trans_predicate_pos_rule_select", "TRANS-PREDICATE-POS-RULE-SELECT", 1, 0, false);
            new transformation_modules.$trans_predicate_pos_rule_select$UnaryFunction();
            declareFunction("trans_predicate_neg_rule_select", "TRANS-PREDICATE-NEG-RULE-SELECT", 1, 0, false);
            declareFunction("trans_predicate_pos_rule_filter", "TRANS-PREDICATE-POS-RULE-FILTER", 2, 0, false);
            new transformation_modules.$trans_predicate_pos_rule_filter$BinaryFunction();
            declareFunction("trans_predicate_neg_rule_filter", "TRANS-PREDICATE-NEG-RULE-FILTER", 2, 0, false);
            declareFunction("trans_predicate_pos_expand", "TRANS-PREDICATE-POS-EXPAND", 2, 0, false);
            new transformation_modules.$trans_predicate_pos_expand$BinaryFunction();
            declareFunction("trans_predicate_neg_expand", "TRANS-PREDICATE-NEG-EXPAND", 2, 0, false);
            declareFunction("trans_predicate_required", "TRANS-PREDICATE-REQUIRED", 1, 0, false);
            declareFunction("trans_predicate_cost", "TRANS-PREDICATE-COST", 2, 0, false);
            declareFunction("trans_predicate_rule_select", "TRANS-PREDICATE-RULE-SELECT", 2, 0, false);
            declareFunction("trans_predicate_rule_select_int_internal", "TRANS-PREDICATE-RULE-SELECT-INT-INTERNAL", 2, 0, false);
            declareFunction("trans_predicate_rule_select_int", "TRANS-PREDICATE-RULE-SELECT-INT", 2, 0, false);
            declareFunction("trans_predicate_rule_filter", "TRANS-PREDICATE-RULE-FILTER", 3, 0, false);
            declareFunction("trans_predicate_expand", "TRANS-PREDICATE-EXPAND", 3, 0, false);
            declareFunction("trans_predicate_genlpreds_pos_required", "TRANS-PREDICATE-GENLPREDS-POS-REQUIRED", 1, 0, false);
            new transformation_modules.$trans_predicate_genlpreds_pos_required$UnaryFunction();
            declareFunction("trans_predicate_genlpreds_neg_required", "TRANS-PREDICATE-GENLPREDS-NEG-REQUIRED", 1, 0, false);
            declareFunction("trans_predicate_genlpreds_pos_cost", "TRANS-PREDICATE-GENLPREDS-POS-COST", 1, 0, false);
            new transformation_modules.$trans_predicate_genlpreds_pos_cost$UnaryFunction();
            declareFunction("trans_predicate_genlpreds_neg_cost", "TRANS-PREDICATE-GENLPREDS-NEG-COST", 1, 0, false);
            declareFunction("trans_predicate_genlpreds_pos_rule_select", "TRANS-PREDICATE-GENLPREDS-POS-RULE-SELECT", 1, 0, false);
            new transformation_modules.$trans_predicate_genlpreds_pos_rule_select$UnaryFunction();
            declareFunction("trans_predicate_genlpreds_pos_rule_select_int_internal", "TRANS-PREDICATE-GENLPREDS-POS-RULE-SELECT-INT-INTERNAL", 1, 0, false);
            declareFunction("trans_predicate_genlpreds_pos_rule_select_int", "TRANS-PREDICATE-GENLPREDS-POS-RULE-SELECT-INT", 1, 0, false);
            declareFunction("trans_predicate_genlpreds_neg_rule_select", "TRANS-PREDICATE-GENLPREDS-NEG-RULE-SELECT", 1, 0, false);
            declareFunction("trans_predicate_genlpreds_pos_expand_int", "TRANS-PREDICATE-GENLPREDS-POS-EXPAND-INT", 2, 0, false);
            declareFunction("trans_predicate_genlpreds_pos_rule_filter", "TRANS-PREDICATE-GENLPREDS-POS-RULE-FILTER", 2, 0, false);
            declareFunction("trans_predicate_genlpreds_pos_expand", "TRANS-PREDICATE-GENLPREDS-POS-EXPAND", 2, 0, false);
            declareFunction("trans_predicate_genlpreds_neg_expand_int", "TRANS-PREDICATE-GENLPREDS-NEG-EXPAND-INT", 2, 0, false);
            declareFunction("trans_predicate_genlpreds_neg_rule_filter", "TRANS-PREDICATE-GENLPREDS-NEG-RULE-FILTER", 2, 0, false);
            declareFunction("trans_predicate_genlpreds_neg_expand", "TRANS-PREDICATE-GENLPREDS-NEG-EXPAND", 2, 0, false);
            declareFunction("trans_predicate_genlpreds_required", "TRANS-PREDICATE-GENLPREDS-REQUIRED", 1, 0, false);
            declareFunction("inference_proper_genl_predicateP_internal", "INFERENCE-PROPER-GENL-PREDICATE?-INTERNAL", 2, 1, false);
            declareFunction("inference_proper_genl_predicateP", "INFERENCE-PROPER-GENL-PREDICATE?", 2, 1, false);
            declareFunction("trans_predicate_genlinverse_pos_required", "TRANS-PREDICATE-GENLINVERSE-POS-REQUIRED", 1, 0, false);
            declareFunction("trans_predicate_genlinverse_neg_required", "TRANS-PREDICATE-GENLINVERSE-NEG-REQUIRED", 1, 0, false);
            declareFunction("trans_predicate_genlinverse_pos_cost", "TRANS-PREDICATE-GENLINVERSE-POS-COST", 1, 0, false);
            declareFunction("trans_predicate_genlinverse_neg_cost", "TRANS-PREDICATE-GENLINVERSE-NEG-COST", 1, 0, false);
            declareFunction("trans_predicate_genlinverse_pos_rule_select", "TRANS-PREDICATE-GENLINVERSE-POS-RULE-SELECT", 1, 0, false);
            declareFunction("trans_predicate_genlinverse_pos_rule_select_int_internal", "TRANS-PREDICATE-GENLINVERSE-POS-RULE-SELECT-INT-INTERNAL", 1, 0, false);
            declareFunction("trans_predicate_genlinverse_pos_rule_select_int", "TRANS-PREDICATE-GENLINVERSE-POS-RULE-SELECT-INT", 1, 0, false);
            declareFunction("trans_predicate_genlinverse_neg_rule_select", "TRANS-PREDICATE-GENLINVERSE-NEG-RULE-SELECT", 1, 0, false);
            declareFunction("trans_predicate_genlinverse_pos_expand_int", "TRANS-PREDICATE-GENLINVERSE-POS-EXPAND-INT", 2, 0, false);
            declareFunction("trans_predicate_genlinverse_pos_rule_filter", "TRANS-PREDICATE-GENLINVERSE-POS-RULE-FILTER", 2, 0, false);
            declareFunction("trans_predicate_genlinverse_pos_expand", "TRANS-PREDICATE-GENLINVERSE-POS-EXPAND", 2, 0, false);
            declareFunction("trans_predicate_genlinverse_neg_expand_int", "TRANS-PREDICATE-GENLINVERSE-NEG-EXPAND-INT", 2, 0, false);
            declareFunction("trans_predicate_genlinverse_neg_rule_filter", "TRANS-PREDICATE-GENLINVERSE-NEG-RULE-FILTER", 2, 0, false);
            declareFunction("trans_predicate_genlinverse_neg_expand", "TRANS-PREDICATE-GENLINVERSE-NEG-EXPAND", 2, 0, false);
            declareFunction("inference_proper_genl_inverseP_internal", "INFERENCE-PROPER-GENL-INVERSE?-INTERNAL", 2, 1, false);
            declareFunction("inference_proper_genl_inverseP", "INFERENCE-PROPER-GENL-INVERSE?", 2, 1, false);
            declareFunction("trans_predicate_negationpreds_neg_required", "TRANS-PREDICATE-NEGATIONPREDS-NEG-REQUIRED", 1, 0, false);
            declareFunction("trans_predicate_negationpreds_neg_cost", "TRANS-PREDICATE-NEGATIONPREDS-NEG-COST", 1, 0, false);
            declareFunction("trans_predicate_negationpreds_neg_rule_select", "TRANS-PREDICATE-NEGATIONPREDS-NEG-RULE-SELECT", 1, 0, false);
            declareFunction("trans_predicate_negationpreds_neg_expand_int", "TRANS-PREDICATE-NEGATIONPREDS-NEG-EXPAND-INT", 2, 0, false);
            declareFunction("trans_predicate_negationpreds_neg_rule_filter", "TRANS-PREDICATE-NEGATIONPREDS-NEG-RULE-FILTER", 2, 0, false);
            declareFunction("trans_predicate_negationpreds_neg_expand", "TRANS-PREDICATE-NEGATIONPREDS-NEG-EXPAND", 2, 0, false);
            declareFunction("trans_predicate_commutativity_cost", "TRANS-PREDICATE-COMMUTATIVITY-COST", 2, 0, false);
            declareFunction("trans_predicate_commutativity_rule_select", "TRANS-PREDICATE-COMMUTATIVITY-RULE-SELECT", 2, 0, false);
            declareFunction("trans_predicate_commutativity_expand_int", "TRANS-PREDICATE-COMMUTATIVITY-EXPAND-INT", 3, 0, false);
            declareFunction("trans_predicate_commutativity_rule_filter", "TRANS-PREDICATE-COMMUTATIVITY-RULE-FILTER", 3, 0, false);
            declareFunction("trans_predicate_commutativity_expand", "TRANS-PREDICATE-COMMUTATIVITY-EXPAND", 3, 0, false);
            declareFunction("trans_predicate_symmetry_pos_cost", "TRANS-PREDICATE-SYMMETRY-POS-COST", 1, 0, false);
            new transformation_modules.$trans_predicate_symmetry_pos_cost$UnaryFunction();
            declareFunction("trans_predicate_symmetry_neg_cost", "TRANS-PREDICATE-SYMMETRY-NEG-COST", 1, 0, false);
            declareFunction("trans_predicate_symmetry_pos_rule_select", "TRANS-PREDICATE-SYMMETRY-POS-RULE-SELECT", 1, 0, false);
            new transformation_modules.$trans_predicate_symmetry_pos_rule_select$UnaryFunction();
            declareFunction("trans_predicate_symmetry_neg_rule_select", "TRANS-PREDICATE-SYMMETRY-NEG-RULE-SELECT", 1, 0, false);
            declareFunction("trans_predicate_symmetry_pos_rule_filter", "TRANS-PREDICATE-SYMMETRY-POS-RULE-FILTER", 2, 0, false);
            new transformation_modules.$trans_predicate_symmetry_pos_rule_filter$BinaryFunction();
            declareFunction("trans_predicate_symmetry_neg_rule_filter", "TRANS-PREDICATE-SYMMETRY-NEG-RULE-FILTER", 2, 0, false);
            declareFunction("trans_predicate_symmetry_pos_expand", "TRANS-PREDICATE-SYMMETRY-POS-EXPAND", 2, 0, false);
            new transformation_modules.$trans_predicate_symmetry_pos_expand$BinaryFunction();
            declareFunction("trans_predicate_symmetry_neg_expand", "TRANS-PREDICATE-SYMMETRY-NEG-EXPAND", 2, 0, false);
            declareFunction("trans_predicate_commutative_pos_cost", "TRANS-PREDICATE-COMMUTATIVE-POS-COST", 1, 0, false);
            declareFunction("trans_predicate_commutative_neg_cost", "TRANS-PREDICATE-COMMUTATIVE-NEG-COST", 1, 0, false);
            declareFunction("trans_predicate_commutative_pos_rule_select", "TRANS-PREDICATE-COMMUTATIVE-POS-RULE-SELECT", 1, 0, false);
            declareFunction("trans_predicate_commutative_neg_rule_select", "TRANS-PREDICATE-COMMUTATIVE-NEG-RULE-SELECT", 1, 0, false);
            declareFunction("trans_predicate_commutative_pos_rule_filter", "TRANS-PREDICATE-COMMUTATIVE-POS-RULE-FILTER", 2, 0, false);
            declareFunction("trans_predicate_commutative_neg_rule_filter", "TRANS-PREDICATE-COMMUTATIVE-NEG-RULE-FILTER", 2, 0, false);
            declareFunction("trans_predicate_commutative_pos_expand", "TRANS-PREDICATE-COMMUTATIVE-POS-EXPAND", 2, 0, false);
            declareFunction("trans_predicate_commutative_neg_expand", "TRANS-PREDICATE-COMMUTATIVE-NEG-EXPAND", 2, 0, false);
            declareFunction("trans_predicate_partially_commutative_pos_cost", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-COST", 1, 0, false);
            declareFunction("trans_predicate_partially_commutative_neg_cost", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-COST", 1, 0, false);
            declareFunction("trans_predicate_partially_commutative_pos_rule_select", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-RULE-SELECT", 1, 0, false);
            declareFunction("trans_predicate_partially_commutative_neg_rule_select", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-RULE-SELECT", 1, 0, false);
            declareFunction("trans_predicate_partially_commutative_pos_rule_filter", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-RULE-FILTER", 2, 0, false);
            declareFunction("trans_predicate_partially_commutative_neg_rule_filter", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-RULE-FILTER", 2, 0, false);
            declareFunction("trans_predicate_partially_commutative_pos_expand", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-EXPAND", 2, 0, false);
            declareFunction("trans_predicate_partially_commutative_neg_expand", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-EXPAND", 2, 0, false);
            declareFunction("trans_predicate_asymmetry_cost", "TRANS-PREDICATE-ASYMMETRY-COST", 1, 0, false);
            declareFunction("trans_predicate_asymmetry_rule_select", "TRANS-PREDICATE-ASYMMETRY-RULE-SELECT", 1, 0, false);
            declareFunction("trans_predicate_asymmetry_expand_int", "TRANS-PREDICATE-ASYMMETRY-EXPAND-INT", 2, 0, false);
            declareFunction("trans_predicate_asymmetry_rule_filter", "TRANS-PREDICATE-ASYMMETRY-RULE-FILTER", 2, 0, false);
            declareFunction("trans_predicate_asymmetry_expand", "TRANS-PREDICATE-ASYMMETRY-EXPAND", 2, 0, false);
            declareFunction("trans_unbound_predicate_module_p", "TRANS-UNBOUND-PREDICATE-MODULE-P", 1, 0, false);
            declareFunction("module_requires_unbound_predicate_transformationP", "MODULE-REQUIRES-UNBOUND-PREDICATE-TRANSFORMATION?", 1, 0, false);
            declareFunction("trans_unbound_predicate_pos_required", "TRANS-UNBOUND-PREDICATE-POS-REQUIRED", 1, 0, false);
            new transformation_modules.$trans_unbound_predicate_pos_required$UnaryFunction();
            declareFunction("trans_unbound_predicate_neg_required", "TRANS-UNBOUND-PREDICATE-NEG-REQUIRED", 1, 0, false);
            declareFunction("trans_unbound_predicate_pos_cost", "TRANS-UNBOUND-PREDICATE-POS-COST", 1, 0, false);
            new transformation_modules.$trans_unbound_predicate_pos_cost$UnaryFunction();
            declareFunction("trans_unbound_predicate_neg_cost", "TRANS-UNBOUND-PREDICATE-NEG-COST", 1, 0, false);
            declareFunction("trans_unbound_predicate_pos_rule_select", "TRANS-UNBOUND-PREDICATE-POS-RULE-SELECT", 1, 0, false);
            declareFunction("trans_unbound_predicate_neg_rule_select", "TRANS-UNBOUND-PREDICATE-NEG-RULE-SELECT", 1, 0, false);
            declareFunction("trans_unbound_predicate_pos_rule_filter", "TRANS-UNBOUND-PREDICATE-POS-RULE-FILTER", 2, 0, false);
            declareFunction("trans_unbound_predicate_neg_rule_filter", "TRANS-UNBOUND-PREDICATE-NEG-RULE-FILTER", 2, 0, false);
            declareFunction("trans_unbound_predicate_pos_expand", "TRANS-UNBOUND-PREDICATE-POS-EXPAND", 2, 0, false);
            declareFunction("trans_unbound_predicate_neg_expand", "TRANS-UNBOUND-PREDICATE-NEG-EXPAND", 2, 0, false);
            declareFunction("trans_unbound_predicate_required", "TRANS-UNBOUND-PREDICATE-REQUIRED", 1, 0, false);
            declareFunction("trans_unbound_predicate_cost", "TRANS-UNBOUND-PREDICATE-COST", 1, 0, false);
            declareFunction("trans_unbound_predicate_rule_select_internal", "TRANS-UNBOUND-PREDICATE-RULE-SELECT-INTERNAL", 1, 0, false);
            declareFunction("trans_unbound_predicate_rule_select", "TRANS-UNBOUND-PREDICATE-RULE-SELECT", 1, 0, false);
            declareFunction("trans_unbound_predicate_rule_filter", "TRANS-UNBOUND-PREDICATE-RULE-FILTER", 2, 0, false);
            declareFunction("trans_unbound_predicate_expand", "TRANS-UNBOUND-PREDICATE-EXPAND", 3, 0, false);
            declareFunction("module_requires_hl_predicate_transformationP", "MODULE-REQUIRES-HL-PREDICATE-TRANSFORMATION?", 1, 0, false);
            declareFunction("trans_isa_pos_required", "TRANS-ISA-POS-REQUIRED", 1, 0, false);
            declareFunction("trans_isa_neg_required", "TRANS-ISA-NEG-REQUIRED", 1, 0, false);
            declareFunction("trans_isa_pos_cost", "TRANS-ISA-POS-COST", 1, 0, false);
            declareFunction("trans_isa_neg_cost", "TRANS-ISA-NEG-COST", 1, 0, false);
            declareFunction("inference_memoized_all_specs_internal", "INFERENCE-MEMOIZED-ALL-SPECS-INTERNAL", 1, 1, false);
            declareFunction("inference_memoized_all_specs", "INFERENCE-MEMOIZED-ALL-SPECS", 1, 1, false);
            declareFunction("trans_isa_pos_rule_select_count_internal", "TRANS-ISA-POS-RULE-SELECT-COUNT-INTERNAL", 2, 0, false);
            declareFunction("trans_isa_pos_rule_select_count", "TRANS-ISA-POS-RULE-SELECT-COUNT", 2, 0, false);
            declareFunction("trans_isa_pos_rule_select", "TRANS-ISA-POS-RULE-SELECT", 1, 0, false);
            declareFunction("trans_isa_pos_expand_int", "TRANS-ISA-POS-EXPAND-INT", 2, 0, false);
            declareFunction("trans_isa_pos_rule_filter", "TRANS-ISA-POS-RULE-FILTER", 2, 0, false);
            declareFunction("trans_isa_pos_expand", "TRANS-ISA-POS-EXPAND", 2, 0, false);
            declareFunction("trans_isa_neg_rule_select", "TRANS-ISA-NEG-RULE-SELECT", 1, 0, false);
            declareFunction("trans_isa_neg_expand_int", "TRANS-ISA-NEG-EXPAND-INT", 2, 0, false);
            declareFunction("trans_isa_neg_rule_filter", "TRANS-ISA-NEG-RULE-FILTER", 2, 0, false);
            declareFunction("trans_isa_neg_expand", "TRANS-ISA-NEG-EXPAND", 2, 0, false);
            declareFunction("trans_genls_pos_required", "TRANS-GENLS-POS-REQUIRED", 1, 0, false);
            declareFunction("trans_genls_neg_required", "TRANS-GENLS-NEG-REQUIRED", 1, 0, false);
            declareFunction("trans_genls_pos_cost", "TRANS-GENLS-POS-COST", 1, 0, false);
            declareFunction("trans_genls_neg_cost", "TRANS-GENLS-NEG-COST", 1, 0, false);
            declareFunction("trans_genls_pos_rule_select", "TRANS-GENLS-POS-RULE-SELECT", 1, 0, false);
            declareFunction("trans_genls_pos_expand_int", "TRANS-GENLS-POS-EXPAND-INT", 2, 0, false);
            declareFunction("trans_genls_pos_rule_filter", "TRANS-GENLS-POS-RULE-FILTER", 2, 0, false);
            declareFunction("trans_genls_pos_expand", "TRANS-GENLS-POS-EXPAND", 2, 0, false);
            declareFunction("trans_genls_neg_rule_select", "TRANS-GENLS-NEG-RULE-SELECT", 1, 0, false);
            declareFunction("trans_genls_neg_expand_int", "TRANS-GENLS-NEG-EXPAND-INT", 2, 0, false);
            declareFunction("trans_genls_neg_rule_filter", "TRANS-GENLS-NEG-RULE-FILTER", 2, 0, false);
            declareFunction("trans_genls_neg_expand", "TRANS-GENLS-NEG-EXPAND", 2, 0, false);
            declareFunction("trans_genl_mt_pos_required", "TRANS-GENL-MT-POS-REQUIRED", 1, 0, false);
            declareFunction("trans_genl_mt_neg_required", "TRANS-GENL-MT-NEG-REQUIRED", 1, 0, false);
            declareFunction("trans_genl_mt_pos_cost", "TRANS-GENL-MT-POS-COST", 1, 0, false);
            declareFunction("trans_genl_mt_neg_cost", "TRANS-GENL-MT-NEG-COST", 1, 0, false);
            declareFunction("inference_memoized_all_spec_mts_internal", "INFERENCE-MEMOIZED-ALL-SPEC-MTS-INTERNAL", 1, 1, false);
            declareFunction("inference_memoized_all_spec_mts", "INFERENCE-MEMOIZED-ALL-SPEC-MTS", 1, 1, false);
            declareFunction("trans_genl_mt_pos_rule_select", "TRANS-GENL-MT-POS-RULE-SELECT", 1, 0, false);
            declareFunction("trans_genl_mt_pos_expand_int", "TRANS-GENL-MT-POS-EXPAND-INT", 2, 0, false);
            declareFunction("trans_genl_mt_pos_rule_filter", "TRANS-GENL-MT-POS-RULE-FILTER", 2, 0, false);
            declareFunction("trans_genl_mt_pos_expand", "TRANS-GENL-MT-POS-EXPAND", 2, 0, false);
            declareFunction("trans_genl_mt_neg_rule_select", "TRANS-GENL-MT-NEG-RULE-SELECT", 1, 0, false);
            declareFunction("trans_genl_mt_neg_expand_int", "TRANS-GENL-MT-NEG-EXPAND-INT", 2, 0, false);
            declareFunction("trans_genl_mt_neg_rule_filter", "TRANS-GENL-MT-NEG-RULE-FILTER", 2, 0, false);
            declareFunction("trans_genl_mt_neg_expand", "TRANS-GENL-MT-NEG-EXPAND", 2, 0, false);
            declareFunction("trans_abnormal_cost", "TRANS-ABNORMAL-COST", 1, 0, false);
            declareFunction("trans_abnormal_rule_select", "TRANS-ABNORMAL-RULE-SELECT", 1, 0, false);
            declareFunction("trans_abnormal_expand_int", "TRANS-ABNORMAL-EXPAND-INT", 2, 0, false);
            declareFunction("trans_abnormal_rule_filter", "TRANS-ABNORMAL-RULE-FILTER", 2, 0, false);
            declareFunction("trans_abnormal_expand", "TRANS-ABNORMAL-EXPAND", 2, 0, false);
            declareFunction("transformation_abduction_to_specs_required", "TRANSFORMATION-ABDUCTION-TO-SPECS-REQUIRED", 1, 1, false);
            declareFunction("find_genls_definitional_rules", "FIND-GENLS-DEFINITIONAL-RULES", 0, 0, false);
            declareFunction("transformation_abduction_to_specs_rule_select", "TRANSFORMATION-ABDUCTION-TO-SPECS-RULE-SELECT", 1, 0, false);
            declareFunction("transformation_abduction_to_specs_rule_filter", "TRANSFORMATION-ABDUCTION-TO-SPECS-RULE-FILTER", 2, 0, false);
            declareFunction("transformation_abduction_to_specs_expand", "TRANSFORMATION-ABDUCTION-TO-SPECS-EXPAND", 2, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("gaf_truth_known", "GAF-TRUTH-KNOWN", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_transformation_modules_file_Previous() {
        declareFunction("additional_genls_supports", "ADDITIONAL-GENLS-SUPPORTS", 2, 0, false);
        declareFunction("additional_genl_mt_supports", "ADDITIONAL-GENL-MT-SUPPORTS", 2, 0, false);
        declareFunction("additional_genlpreds_supports", "ADDITIONAL-GENLPREDS-SUPPORTS", 2, 0, false);
        declareFunction("additional_genlinverse_supports", "ADDITIONAL-GENLINVERSE-SUPPORTS", 2, 0, false);
        declareFunction("additional_negationpreds_supports", "ADDITIONAL-NEGATIONPREDS-SUPPORTS", 2, 0, false);
        declareFunction("additional_asymmetry_supports", "ADDITIONAL-ASYMMETRY-SUPPORTS", 1, 0, false);
        declareFunction("additional_predicate_commutativity_supports", "ADDITIONAL-PREDICATE-COMMUTATIVITY-SUPPORTS", 1, 0, false);
        declareFunction("transformation_gaf_truth_known", "TRANSFORMATION-GAF-TRUTH-KNOWN", 1, 0, false);
        declareFunction("modus_tollens_transformation_module_p", "MODUS-TOLLENS-TRANSFORMATION-MODULE-P", 1, 0, false);
        declareFunction("modus_tollens_transformation_proof_p", "MODUS-TOLLENS-TRANSFORMATION-PROOF-P", 1, 0, false);
        declareMacro("do_transformation_relevant_directions", "DO-TRANSFORMATION-RELEVANT-DIRECTIONS");
        declareMacro("do_transformation_rule_literals", "DO-TRANSFORMATION-RULE-LITERALS");
        declareMacro("do_transformation_predicate_rule_index", "DO-TRANSFORMATION-PREDICATE-RULE-INDEX");
        declareFunction("new_selected_rules", "NEW-SELECTED-RULES", 0, 0, false);
        declareFunction("add_selected_rule", "ADD-SELECTED-RULE", 2, 0, false);
        declareFunction("finalize_selected_rules", "FINALIZE-SELECTED-RULES", 1, 0, false);
        declareFunction("sort_rules_via_current_inference_rule_preference", "SORT-RULES-VIA-CURRENT-INFERENCE-RULE-PREFERENCE", 1, 0, false);
        declareFunction("current_inference_rule_preference_G", "CURRENT-INFERENCE-RULE-PREFERENCE->", 2, 0, false);
        declareFunction("trans_predicate_pos_required", "TRANS-PREDICATE-POS-REQUIRED", 1, 0, false);
        new transformation_modules.$trans_predicate_pos_required$UnaryFunction();
        declareFunction("trans_predicate_neg_required", "TRANS-PREDICATE-NEG-REQUIRED", 1, 0, false);
        declareFunction("trans_predicate_pos_cost", "TRANS-PREDICATE-POS-COST", 1, 0, false);
        new transformation_modules.$trans_predicate_pos_cost$UnaryFunction();
        declareFunction("trans_predicate_neg_cost", "TRANS-PREDICATE-NEG-COST", 1, 0, false);
        declareFunction("trans_predicate_pos_rule_select", "TRANS-PREDICATE-POS-RULE-SELECT", 1, 0, false);
        new transformation_modules.$trans_predicate_pos_rule_select$UnaryFunction();
        declareFunction("trans_predicate_neg_rule_select", "TRANS-PREDICATE-NEG-RULE-SELECT", 1, 0, false);
        declareFunction("trans_predicate_pos_rule_filter", "TRANS-PREDICATE-POS-RULE-FILTER", 2, 0, false);
        new transformation_modules.$trans_predicate_pos_rule_filter$BinaryFunction();
        declareFunction("trans_predicate_neg_rule_filter", "TRANS-PREDICATE-NEG-RULE-FILTER", 2, 0, false);
        declareFunction("trans_predicate_pos_expand", "TRANS-PREDICATE-POS-EXPAND", 2, 0, false);
        new transformation_modules.$trans_predicate_pos_expand$BinaryFunction();
        declareFunction("trans_predicate_neg_expand", "TRANS-PREDICATE-NEG-EXPAND", 2, 0, false);
        declareFunction("trans_predicate_required", "TRANS-PREDICATE-REQUIRED", 1, 0, false);
        declareFunction("trans_predicate_cost", "TRANS-PREDICATE-COST", 2, 0, false);
        declareFunction("trans_predicate_rule_select", "TRANS-PREDICATE-RULE-SELECT", 2, 0, false);
        declareFunction("trans_predicate_rule_select_int_internal", "TRANS-PREDICATE-RULE-SELECT-INT-INTERNAL", 2, 0, false);
        declareFunction("trans_predicate_rule_select_int", "TRANS-PREDICATE-RULE-SELECT-INT", 2, 0, false);
        declareFunction("trans_predicate_rule_filter", "TRANS-PREDICATE-RULE-FILTER", 3, 0, false);
        declareFunction("trans_predicate_expand", "TRANS-PREDICATE-EXPAND", 3, 0, false);
        declareFunction("trans_predicate_genlpreds_pos_required", "TRANS-PREDICATE-GENLPREDS-POS-REQUIRED", 1, 0, false);
        new transformation_modules.$trans_predicate_genlpreds_pos_required$UnaryFunction();
        declareFunction("trans_predicate_genlpreds_neg_required", "TRANS-PREDICATE-GENLPREDS-NEG-REQUIRED", 1, 0, false);
        declareFunction("trans_predicate_genlpreds_pos_cost", "TRANS-PREDICATE-GENLPREDS-POS-COST", 1, 0, false);
        new transformation_modules.$trans_predicate_genlpreds_pos_cost$UnaryFunction();
        declareFunction("trans_predicate_genlpreds_neg_cost", "TRANS-PREDICATE-GENLPREDS-NEG-COST", 1, 0, false);
        declareFunction("trans_predicate_genlpreds_pos_rule_select", "TRANS-PREDICATE-GENLPREDS-POS-RULE-SELECT", 1, 0, false);
        new transformation_modules.$trans_predicate_genlpreds_pos_rule_select$UnaryFunction();
        declareFunction("trans_predicate_genlpreds_pos_rule_select_int_internal", "TRANS-PREDICATE-GENLPREDS-POS-RULE-SELECT-INT-INTERNAL", 1, 0, false);
        declareFunction("trans_predicate_genlpreds_pos_rule_select_int", "TRANS-PREDICATE-GENLPREDS-POS-RULE-SELECT-INT", 1, 0, false);
        declareFunction("trans_predicate_genlpreds_neg_rule_select", "TRANS-PREDICATE-GENLPREDS-NEG-RULE-SELECT", 1, 0, false);
        declareFunction("trans_predicate_genlpreds_pos_expand_int", "TRANS-PREDICATE-GENLPREDS-POS-EXPAND-INT", 2, 0, false);
        declareFunction("trans_predicate_genlpreds_pos_rule_filter", "TRANS-PREDICATE-GENLPREDS-POS-RULE-FILTER", 2, 0, false);
        declareFunction("trans_predicate_genlpreds_pos_expand", "TRANS-PREDICATE-GENLPREDS-POS-EXPAND", 2, 0, false);
        declareFunction("trans_predicate_genlpreds_neg_expand_int", "TRANS-PREDICATE-GENLPREDS-NEG-EXPAND-INT", 2, 0, false);
        declareFunction("trans_predicate_genlpreds_neg_rule_filter", "TRANS-PREDICATE-GENLPREDS-NEG-RULE-FILTER", 2, 0, false);
        declareFunction("trans_predicate_genlpreds_neg_expand", "TRANS-PREDICATE-GENLPREDS-NEG-EXPAND", 2, 0, false);
        declareFunction("trans_predicate_genlpreds_required", "TRANS-PREDICATE-GENLPREDS-REQUIRED", 1, 0, false);
        declareFunction("inference_proper_genl_predicateP_internal", "INFERENCE-PROPER-GENL-PREDICATE?-INTERNAL", 2, 1, false);
        declareFunction("inference_proper_genl_predicateP", "INFERENCE-PROPER-GENL-PREDICATE?", 2, 1, false);
        declareFunction("trans_predicate_genlinverse_pos_required", "TRANS-PREDICATE-GENLINVERSE-POS-REQUIRED", 1, 0, false);
        declareFunction("trans_predicate_genlinverse_neg_required", "TRANS-PREDICATE-GENLINVERSE-NEG-REQUIRED", 1, 0, false);
        declareFunction("trans_predicate_genlinverse_pos_cost", "TRANS-PREDICATE-GENLINVERSE-POS-COST", 1, 0, false);
        declareFunction("trans_predicate_genlinverse_neg_cost", "TRANS-PREDICATE-GENLINVERSE-NEG-COST", 1, 0, false);
        declareFunction("trans_predicate_genlinverse_pos_rule_select", "TRANS-PREDICATE-GENLINVERSE-POS-RULE-SELECT", 1, 0, false);
        declareFunction("trans_predicate_genlinverse_pos_rule_select_int_internal", "TRANS-PREDICATE-GENLINVERSE-POS-RULE-SELECT-INT-INTERNAL", 1, 0, false);
        declareFunction("trans_predicate_genlinverse_pos_rule_select_int", "TRANS-PREDICATE-GENLINVERSE-POS-RULE-SELECT-INT", 1, 0, false);
        declareFunction("trans_predicate_genlinverse_neg_rule_select", "TRANS-PREDICATE-GENLINVERSE-NEG-RULE-SELECT", 1, 0, false);
        declareFunction("trans_predicate_genlinverse_pos_expand_int", "TRANS-PREDICATE-GENLINVERSE-POS-EXPAND-INT", 2, 0, false);
        declareFunction("trans_predicate_genlinverse_pos_rule_filter", "TRANS-PREDICATE-GENLINVERSE-POS-RULE-FILTER", 2, 0, false);
        declareFunction("trans_predicate_genlinverse_pos_expand", "TRANS-PREDICATE-GENLINVERSE-POS-EXPAND", 2, 0, false);
        declareFunction("trans_predicate_genlinverse_neg_expand_int", "TRANS-PREDICATE-GENLINVERSE-NEG-EXPAND-INT", 2, 0, false);
        declareFunction("trans_predicate_genlinverse_neg_rule_filter", "TRANS-PREDICATE-GENLINVERSE-NEG-RULE-FILTER", 2, 0, false);
        declareFunction("trans_predicate_genlinverse_neg_expand", "TRANS-PREDICATE-GENLINVERSE-NEG-EXPAND", 2, 0, false);
        declareFunction("inference_proper_genl_inverseP_internal", "INFERENCE-PROPER-GENL-INVERSE?-INTERNAL", 2, 1, false);
        declareFunction("inference_proper_genl_inverseP", "INFERENCE-PROPER-GENL-INVERSE?", 2, 1, false);
        declareFunction("trans_predicate_negationpreds_neg_required", "TRANS-PREDICATE-NEGATIONPREDS-NEG-REQUIRED", 1, 0, false);
        declareFunction("trans_predicate_negationpreds_neg_cost", "TRANS-PREDICATE-NEGATIONPREDS-NEG-COST", 1, 0, false);
        declareFunction("trans_predicate_negationpreds_neg_rule_select", "TRANS-PREDICATE-NEGATIONPREDS-NEG-RULE-SELECT", 1, 0, false);
        declareFunction("trans_predicate_negationpreds_neg_expand_int", "TRANS-PREDICATE-NEGATIONPREDS-NEG-EXPAND-INT", 2, 0, false);
        declareFunction("trans_predicate_negationpreds_neg_rule_filter", "TRANS-PREDICATE-NEGATIONPREDS-NEG-RULE-FILTER", 2, 0, false);
        declareFunction("trans_predicate_negationpreds_neg_expand", "TRANS-PREDICATE-NEGATIONPREDS-NEG-EXPAND", 2, 0, false);
        declareFunction("trans_predicate_commutativity_cost", "TRANS-PREDICATE-COMMUTATIVITY-COST", 2, 0, false);
        declareFunction("trans_predicate_commutativity_rule_select", "TRANS-PREDICATE-COMMUTATIVITY-RULE-SELECT", 2, 0, false);
        declareFunction("trans_predicate_commutativity_expand_int", "TRANS-PREDICATE-COMMUTATIVITY-EXPAND-INT", 3, 0, false);
        declareFunction("trans_predicate_commutativity_rule_filter", "TRANS-PREDICATE-COMMUTATIVITY-RULE-FILTER", 3, 0, false);
        declareFunction("trans_predicate_commutativity_expand", "TRANS-PREDICATE-COMMUTATIVITY-EXPAND", 3, 0, false);
        declareFunction("trans_predicate_symmetry_pos_cost", "TRANS-PREDICATE-SYMMETRY-POS-COST", 1, 0, false);
        new transformation_modules.$trans_predicate_symmetry_pos_cost$UnaryFunction();
        declareFunction("trans_predicate_symmetry_neg_cost", "TRANS-PREDICATE-SYMMETRY-NEG-COST", 1, 0, false);
        declareFunction("trans_predicate_symmetry_pos_rule_select", "TRANS-PREDICATE-SYMMETRY-POS-RULE-SELECT", 1, 0, false);
        new transformation_modules.$trans_predicate_symmetry_pos_rule_select$UnaryFunction();
        declareFunction("trans_predicate_symmetry_neg_rule_select", "TRANS-PREDICATE-SYMMETRY-NEG-RULE-SELECT", 1, 0, false);
        declareFunction("trans_predicate_symmetry_pos_rule_filter", "TRANS-PREDICATE-SYMMETRY-POS-RULE-FILTER", 2, 0, false);
        new transformation_modules.$trans_predicate_symmetry_pos_rule_filter$BinaryFunction();
        declareFunction("trans_predicate_symmetry_neg_rule_filter", "TRANS-PREDICATE-SYMMETRY-NEG-RULE-FILTER", 2, 0, false);
        declareFunction("trans_predicate_symmetry_pos_expand", "TRANS-PREDICATE-SYMMETRY-POS-EXPAND", 2, 0, false);
        new transformation_modules.$trans_predicate_symmetry_pos_expand$BinaryFunction();
        declareFunction("trans_predicate_symmetry_neg_expand", "TRANS-PREDICATE-SYMMETRY-NEG-EXPAND", 2, 0, false);
        declareFunction("trans_predicate_commutative_pos_cost", "TRANS-PREDICATE-COMMUTATIVE-POS-COST", 1, 0, false);
        declareFunction("trans_predicate_commutative_neg_cost", "TRANS-PREDICATE-COMMUTATIVE-NEG-COST", 1, 0, false);
        declareFunction("trans_predicate_commutative_pos_rule_select", "TRANS-PREDICATE-COMMUTATIVE-POS-RULE-SELECT", 1, 0, false);
        declareFunction("trans_predicate_commutative_neg_rule_select", "TRANS-PREDICATE-COMMUTATIVE-NEG-RULE-SELECT", 1, 0, false);
        declareFunction("trans_predicate_commutative_pos_rule_filter", "TRANS-PREDICATE-COMMUTATIVE-POS-RULE-FILTER", 2, 0, false);
        declareFunction("trans_predicate_commutative_neg_rule_filter", "TRANS-PREDICATE-COMMUTATIVE-NEG-RULE-FILTER", 2, 0, false);
        declareFunction("trans_predicate_commutative_pos_expand", "TRANS-PREDICATE-COMMUTATIVE-POS-EXPAND", 2, 0, false);
        declareFunction("trans_predicate_commutative_neg_expand", "TRANS-PREDICATE-COMMUTATIVE-NEG-EXPAND", 2, 0, false);
        declareFunction("trans_predicate_partially_commutative_pos_cost", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-COST", 1, 0, false);
        declareFunction("trans_predicate_partially_commutative_neg_cost", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-COST", 1, 0, false);
        declareFunction("trans_predicate_partially_commutative_pos_rule_select", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-RULE-SELECT", 1, 0, false);
        declareFunction("trans_predicate_partially_commutative_neg_rule_select", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-RULE-SELECT", 1, 0, false);
        declareFunction("trans_predicate_partially_commutative_pos_rule_filter", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-RULE-FILTER", 2, 0, false);
        declareFunction("trans_predicate_partially_commutative_neg_rule_filter", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-RULE-FILTER", 2, 0, false);
        declareFunction("trans_predicate_partially_commutative_pos_expand", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-EXPAND", 2, 0, false);
        declareFunction("trans_predicate_partially_commutative_neg_expand", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-EXPAND", 2, 0, false);
        declareFunction("trans_predicate_asymmetry_cost", "TRANS-PREDICATE-ASYMMETRY-COST", 1, 0, false);
        declareFunction("trans_predicate_asymmetry_rule_select", "TRANS-PREDICATE-ASYMMETRY-RULE-SELECT", 1, 0, false);
        declareFunction("trans_predicate_asymmetry_expand_int", "TRANS-PREDICATE-ASYMMETRY-EXPAND-INT", 2, 0, false);
        declareFunction("trans_predicate_asymmetry_rule_filter", "TRANS-PREDICATE-ASYMMETRY-RULE-FILTER", 2, 0, false);
        declareFunction("trans_predicate_asymmetry_expand", "TRANS-PREDICATE-ASYMMETRY-EXPAND", 2, 0, false);
        declareFunction("trans_unbound_predicate_module_p", "TRANS-UNBOUND-PREDICATE-MODULE-P", 1, 0, false);
        declareFunction("module_requires_unbound_predicate_transformationP", "MODULE-REQUIRES-UNBOUND-PREDICATE-TRANSFORMATION?", 1, 0, false);
        declareFunction("trans_unbound_predicate_pos_required", "TRANS-UNBOUND-PREDICATE-POS-REQUIRED", 1, 0, false);
        new transformation_modules.$trans_unbound_predicate_pos_required$UnaryFunction();
        declareFunction("trans_unbound_predicate_neg_required", "TRANS-UNBOUND-PREDICATE-NEG-REQUIRED", 1, 0, false);
        declareFunction("trans_unbound_predicate_pos_cost", "TRANS-UNBOUND-PREDICATE-POS-COST", 1, 0, false);
        new transformation_modules.$trans_unbound_predicate_pos_cost$UnaryFunction();
        declareFunction("trans_unbound_predicate_neg_cost", "TRANS-UNBOUND-PREDICATE-NEG-COST", 1, 0, false);
        declareFunction("trans_unbound_predicate_pos_rule_select", "TRANS-UNBOUND-PREDICATE-POS-RULE-SELECT", 1, 0, false);
        declareFunction("trans_unbound_predicate_neg_rule_select", "TRANS-UNBOUND-PREDICATE-NEG-RULE-SELECT", 1, 0, false);
        declareFunction("trans_unbound_predicate_pos_rule_filter", "TRANS-UNBOUND-PREDICATE-POS-RULE-FILTER", 2, 0, false);
        declareFunction("trans_unbound_predicate_neg_rule_filter", "TRANS-UNBOUND-PREDICATE-NEG-RULE-FILTER", 2, 0, false);
        declareFunction("trans_unbound_predicate_pos_expand", "TRANS-UNBOUND-PREDICATE-POS-EXPAND", 2, 0, false);
        declareFunction("trans_unbound_predicate_neg_expand", "TRANS-UNBOUND-PREDICATE-NEG-EXPAND", 2, 0, false);
        declareFunction("trans_unbound_predicate_required", "TRANS-UNBOUND-PREDICATE-REQUIRED", 1, 0, false);
        declareFunction("trans_unbound_predicate_cost", "TRANS-UNBOUND-PREDICATE-COST", 1, 0, false);
        declareFunction("trans_unbound_predicate_rule_select_internal", "TRANS-UNBOUND-PREDICATE-RULE-SELECT-INTERNAL", 1, 0, false);
        declareFunction("trans_unbound_predicate_rule_select", "TRANS-UNBOUND-PREDICATE-RULE-SELECT", 1, 0, false);
        declareFunction("trans_unbound_predicate_rule_filter", "TRANS-UNBOUND-PREDICATE-RULE-FILTER", 2, 0, false);
        declareFunction("trans_unbound_predicate_expand", "TRANS-UNBOUND-PREDICATE-EXPAND", 3, 0, false);
        declareFunction("module_requires_hl_predicate_transformationP", "MODULE-REQUIRES-HL-PREDICATE-TRANSFORMATION?", 1, 0, false);
        declareFunction("trans_isa_pos_required", "TRANS-ISA-POS-REQUIRED", 1, 0, false);
        declareFunction("trans_isa_neg_required", "TRANS-ISA-NEG-REQUIRED", 1, 0, false);
        declareFunction("trans_isa_pos_cost", "TRANS-ISA-POS-COST", 1, 0, false);
        declareFunction("trans_isa_neg_cost", "TRANS-ISA-NEG-COST", 1, 0, false);
        declareFunction("inference_memoized_all_specs_internal", "INFERENCE-MEMOIZED-ALL-SPECS-INTERNAL", 1, 1, false);
        declareFunction("inference_memoized_all_specs", "INFERENCE-MEMOIZED-ALL-SPECS", 1, 1, false);
        declareFunction("trans_isa_pos_rule_select_count_internal", "TRANS-ISA-POS-RULE-SELECT-COUNT-INTERNAL", 2, 0, false);
        declareFunction("trans_isa_pos_rule_select_count", "TRANS-ISA-POS-RULE-SELECT-COUNT", 2, 0, false);
        declareFunction("trans_isa_pos_rule_select", "TRANS-ISA-POS-RULE-SELECT", 1, 0, false);
        declareFunction("trans_isa_pos_expand_int", "TRANS-ISA-POS-EXPAND-INT", 2, 0, false);
        declareFunction("trans_isa_pos_rule_filter", "TRANS-ISA-POS-RULE-FILTER", 2, 0, false);
        declareFunction("trans_isa_pos_expand", "TRANS-ISA-POS-EXPAND", 2, 0, false);
        declareFunction("trans_isa_neg_rule_select", "TRANS-ISA-NEG-RULE-SELECT", 1, 0, false);
        declareFunction("trans_isa_neg_expand_int", "TRANS-ISA-NEG-EXPAND-INT", 2, 0, false);
        declareFunction("trans_isa_neg_rule_filter", "TRANS-ISA-NEG-RULE-FILTER", 2, 0, false);
        declareFunction("trans_isa_neg_expand", "TRANS-ISA-NEG-EXPAND", 2, 0, false);
        declareFunction("trans_genls_pos_required", "TRANS-GENLS-POS-REQUIRED", 1, 0, false);
        declareFunction("trans_genls_neg_required", "TRANS-GENLS-NEG-REQUIRED", 1, 0, false);
        declareFunction("trans_genls_pos_cost", "TRANS-GENLS-POS-COST", 1, 0, false);
        declareFunction("trans_genls_neg_cost", "TRANS-GENLS-NEG-COST", 1, 0, false);
        declareFunction("trans_genls_pos_rule_select", "TRANS-GENLS-POS-RULE-SELECT", 1, 0, false);
        declareFunction("trans_genls_pos_expand_int", "TRANS-GENLS-POS-EXPAND-INT", 2, 0, false);
        declareFunction("trans_genls_pos_rule_filter", "TRANS-GENLS-POS-RULE-FILTER", 2, 0, false);
        declareFunction("trans_genls_pos_expand", "TRANS-GENLS-POS-EXPAND", 2, 0, false);
        declareFunction("trans_genls_neg_rule_select", "TRANS-GENLS-NEG-RULE-SELECT", 1, 0, false);
        declareFunction("trans_genls_neg_expand_int", "TRANS-GENLS-NEG-EXPAND-INT", 2, 0, false);
        declareFunction("trans_genls_neg_rule_filter", "TRANS-GENLS-NEG-RULE-FILTER", 2, 0, false);
        declareFunction("trans_genls_neg_expand", "TRANS-GENLS-NEG-EXPAND", 2, 0, false);
        declareFunction("trans_genl_mt_pos_required", "TRANS-GENL-MT-POS-REQUIRED", 1, 0, false);
        declareFunction("trans_genl_mt_neg_required", "TRANS-GENL-MT-NEG-REQUIRED", 1, 0, false);
        declareFunction("trans_genl_mt_pos_cost", "TRANS-GENL-MT-POS-COST", 1, 0, false);
        declareFunction("trans_genl_mt_neg_cost", "TRANS-GENL-MT-NEG-COST", 1, 0, false);
        declareFunction("inference_memoized_all_spec_mts_internal", "INFERENCE-MEMOIZED-ALL-SPEC-MTS-INTERNAL", 1, 1, false);
        declareFunction("inference_memoized_all_spec_mts", "INFERENCE-MEMOIZED-ALL-SPEC-MTS", 1, 1, false);
        declareFunction("trans_genl_mt_pos_rule_select", "TRANS-GENL-MT-POS-RULE-SELECT", 1, 0, false);
        declareFunction("trans_genl_mt_pos_expand_int", "TRANS-GENL-MT-POS-EXPAND-INT", 2, 0, false);
        declareFunction("trans_genl_mt_pos_rule_filter", "TRANS-GENL-MT-POS-RULE-FILTER", 2, 0, false);
        declareFunction("trans_genl_mt_pos_expand", "TRANS-GENL-MT-POS-EXPAND", 2, 0, false);
        declareFunction("trans_genl_mt_neg_rule_select", "TRANS-GENL-MT-NEG-RULE-SELECT", 1, 0, false);
        declareFunction("trans_genl_mt_neg_expand_int", "TRANS-GENL-MT-NEG-EXPAND-INT", 2, 0, false);
        declareFunction("trans_genl_mt_neg_rule_filter", "TRANS-GENL-MT-NEG-RULE-FILTER", 2, 0, false);
        declareFunction("trans_genl_mt_neg_expand", "TRANS-GENL-MT-NEG-EXPAND", 2, 0, false);
        declareFunction("trans_abnormal_cost", "TRANS-ABNORMAL-COST", 1, 0, false);
        declareFunction("trans_abnormal_rule_select", "TRANS-ABNORMAL-RULE-SELECT", 1, 0, false);
        declareFunction("trans_abnormal_expand_int", "TRANS-ABNORMAL-EXPAND-INT", 2, 0, false);
        declareFunction("trans_abnormal_rule_filter", "TRANS-ABNORMAL-RULE-FILTER", 2, 0, false);
        declareFunction("trans_abnormal_expand", "TRANS-ABNORMAL-EXPAND", 2, 0, false);
        declareFunction("transformation_abduction_to_specs_required", "TRANSFORMATION-ABDUCTION-TO-SPECS-REQUIRED", 1, 1, false);
        declareFunction("find_genls_definitional_rules", "FIND-GENLS-DEFINITIONAL-RULES", 0, 0, false);
        declareFunction("transformation_abduction_to_specs_rule_select", "TRANSFORMATION-ABDUCTION-TO-SPECS-RULE-SELECT", 1, 0, false);
        declareFunction("transformation_abduction_to_specs_rule_filter", "TRANSFORMATION-ABDUCTION-TO-SPECS-RULE-FILTER", 2, 0, false);
        declareFunction("transformation_abduction_to_specs_expand", "TRANSFORMATION-ABDUCTION-TO-SPECS-EXPAND", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_transformation_modules_file_alt() {
        defparameter("*TRANSFORMATION-GAF-TRUTH-KNOWN-DISABLED*", T);
        deflexical("*UNBOUND-PREDICATE-TRANSFORMATION-REQUIRED-MODULES*", $list_alt73);
        deflexical("*HL-PREDICATE-TRANSFORMATION-REQUIRED-MODULES*", $list_alt78);
        defparameter("*GENLS-DEFINITIONAL-SENTENCE*", $list_alt98);
        defparameter("*GENLS-DEFINITIONAL-RULES*", NIL);
        return NIL;
    }

    public static SubLObject init_transformation_modules_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*TRANSFORMATION-GAF-TRUTH-KNOWN-DISABLED*", T);
            deflexical("*UNBOUND-PREDICATE-TRANSFORMATION-REQUIRED-MODULES*", $list76);
            deflexical("*HL-PREDICATE-TRANSFORMATION-REQUIRED-MODULES*", $list82);
            defparameter("*GENLS-DEFINITIONAL-SENTENCE*", $list102);
            defparameter("*GENLS-DEFINITIONAL-RULES*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*UNBOUND-PREDICATE-TRANSFORMATION-REQUIRED-MODULES*", $list_alt73);
            deflexical("*HL-PREDICATE-TRANSFORMATION-REQUIRED-MODULES*", $list_alt78);
            defparameter("*GENLS-DEFINITIONAL-SENTENCE*", $list_alt98);
        }
        return NIL;
    }

    public static SubLObject init_transformation_modules_file_Previous() {
        defparameter("*TRANSFORMATION-GAF-TRUTH-KNOWN-DISABLED*", T);
        deflexical("*UNBOUND-PREDICATE-TRANSFORMATION-REQUIRED-MODULES*", $list76);
        deflexical("*HL-PREDICATE-TRANSFORMATION-REQUIRED-MODULES*", $list82);
        defparameter("*GENLS-DEFINITIONAL-SENTENCE*", $list102);
        defparameter("*GENLS-DEFINITIONAL-RULES*", NIL);
        return NIL;
    }

    public static final SubLObject setup_transformation_modules_file_alt() {
        inference_modules.inference_transformation_module($TRANS_PREDICATE_POS, $list_alt45);
        inference_modules.inference_transformation_module($TRANS_PREDICATE_NEG, $list_alt47);
        memoization_state.note_memoized_function(TRANS_PREDICATE_RULE_SELECT_INT);
        memoization_state.note_memoized_function(TRANS_PREDICATE_GENLPREDS_POS_RULE_SELECT_INT);
        inference_modules.inference_transformation_module($TRANS_PREDICATE_GENLPREDS_POS, $list_alt54);
        inference_modules.inference_transformation_module($TRANS_PREDICATE_GENLPREDS_NEG, $list_alt56);
        inference_modules.inference_transformation_module($TRANS_PREDICATE_NEGATIONPREDS_NEG, $list_alt58);
        inference_modules.inference_transformation_module($TRANS_PREDICATE_SYMMETRY_POS, $list_alt60);
        inference_modules.inference_transformation_module($TRANS_PREDICATE_SYMMETRY_NEG, $list_alt62);
        inference_modules.inference_transformation_module($TRANS_PREDICATE_COMMUTATIVE_POS, $list_alt64);
        inference_modules.inference_transformation_module($TRANS_PREDICATE_COMMUTATIVE_NEG, $list_alt66);
        inference_modules.inference_transformation_module($TRANS_PREDICATE_PARTIALLY_COMMUTATIVE_POS, $list_alt68);
        inference_modules.inference_transformation_module($TRANS_PREDICATE_PARTIALLY_COMMUTATIVE_NEG, $list_alt70);
        inference_modules.inference_transformation_module($TRANS_PREDICATE_ASYMMETRY, $list_alt72);
        inference_modules.inference_transformation_module($TRANS_UNBOUND_PREDICATE_POS, $list_alt75);
        inference_modules.inference_transformation_module($TRANS_UNBOUND_PREDICATE_NEG, $list_alt77);
        memoization_state.note_memoized_function(INFERENCE_MEMOIZED_ALL_SPECS);
        memoization_state.note_memoized_function(TRANS_ISA_POS_RULE_SELECT_COUNT);
        inference_modules.inference_transformation_module($TRANS_ISA_POS, $list_alt83);
        inference_modules.inference_transformation_module($TRANS_ISA_NEG, $list_alt85);
        inference_modules.inference_transformation_module($TRANS_GENLS_POS, $list_alt87);
        inference_modules.inference_transformation_module($TRANS_GENLS_NEG, $list_alt89);
        memoization_state.note_memoized_function(INFERENCE_MEMOIZED_ALL_SPEC_MTS);
        inference_modules.inference_transformation_module($TRANS_GENL_MT_POS, $list_alt92);
        inference_modules.inference_transformation_module($TRANS_GENL_MT_NEG, $list_alt94);
        inference_modules.inference_transformation_module($TRANS_ABNORMAL, $list_alt97);
        inference_modules.inference_transformation_module($TRANSFORMATION_ABDUCTION_TO_SPECS, $list_alt100);
        return NIL;
    }

    public static SubLObject setup_transformation_modules_file() {
        if (SubLFiles.USE_V1) {
            inference_modules.inference_transformation_module($TRANS_PREDICATE_POS, $list42);
            inference_modules.inference_transformation_module($TRANS_PREDICATE_NEG, $list44);
            memoization_state.note_memoized_function(TRANS_PREDICATE_RULE_SELECT_INT);
            memoization_state.note_memoized_function(TRANS_PREDICATE_GENLPREDS_POS_RULE_SELECT_INT);
            inference_modules.inference_transformation_module($TRANS_PREDICATE_GENLPREDS_POS, $list50);
            inference_modules.inference_transformation_module($TRANS_PREDICATE_GENLPREDS_NEG, $list52);
            memoization_state.note_memoized_function($sym53$INFERENCE_PROPER_GENL_PREDICATE_);
            memoization_state.note_memoized_function(TRANS_PREDICATE_GENLINVERSE_POS_RULE_SELECT_INT);
            inference_modules.inference_transformation_module($TRANS_PREDICATE_GENLINVERSE_POS, $list56);
            inference_modules.inference_transformation_module($TRANS_PREDICATE_GENLINVERSE_NEG, $list58);
            memoization_state.note_memoized_function($sym59$INFERENCE_PROPER_GENL_INVERSE_);
            inference_modules.inference_transformation_module($TRANS_PREDICATE_NEGATIONPREDS_NEG, $list61);
            inference_modules.inference_transformation_module($TRANS_PREDICATE_SYMMETRY_POS, $list63);
            inference_modules.inference_transformation_module($TRANS_PREDICATE_SYMMETRY_NEG, $list65);
            inference_modules.inference_transformation_module($TRANS_PREDICATE_COMMUTATIVE_POS, $list67);
            inference_modules.inference_transformation_module($TRANS_PREDICATE_COMMUTATIVE_NEG, $list69);
            inference_modules.inference_transformation_module($TRANS_PREDICATE_PARTIALLY_COMMUTATIVE_POS, $list71);
            inference_modules.inference_transformation_module($TRANS_PREDICATE_PARTIALLY_COMMUTATIVE_NEG, $list73);
            inference_modules.inference_transformation_module($TRANS_PREDICATE_ASYMMETRY, $list75);
            inference_modules.inference_transformation_module($TRANS_UNBOUND_PREDICATE_POS, $list78);
            inference_modules.inference_transformation_module($TRANS_UNBOUND_PREDICATE_NEG, $list80);
            memoization_state.note_memoized_function(TRANS_UNBOUND_PREDICATE_RULE_SELECT);
            memoization_state.note_memoized_function(INFERENCE_MEMOIZED_ALL_SPECS);
            memoization_state.note_memoized_function(TRANS_ISA_POS_RULE_SELECT_COUNT);
            inference_modules.inference_transformation_module($TRANS_ISA_POS, $list87);
            inference_modules.inference_transformation_module($TRANS_ISA_NEG, $list89);
            inference_modules.inference_transformation_module($TRANS_GENLS_POS, $list91);
            inference_modules.inference_transformation_module($TRANS_GENLS_NEG, $list93);
            memoization_state.note_memoized_function(INFERENCE_MEMOIZED_ALL_SPEC_MTS);
            inference_modules.inference_transformation_module($TRANS_GENL_MT_POS, $list96);
            inference_modules.inference_transformation_module($TRANS_GENL_MT_NEG, $list98);
            inference_modules.inference_transformation_module($TRANS_ABNORMAL, $list101);
            inference_modules.inference_transformation_module($TRANSFORMATION_ABDUCTION_TO_SPECS, $list104);
        }
        if (SubLFiles.USE_V2) {
            inference_modules.inference_transformation_module($TRANS_PREDICATE_POS, $list_alt45);
            inference_modules.inference_transformation_module($TRANS_PREDICATE_NEG, $list_alt47);
            inference_modules.inference_transformation_module($TRANS_PREDICATE_GENLPREDS_POS, $list_alt54);
            inference_modules.inference_transformation_module($TRANS_PREDICATE_GENLPREDS_NEG, $list_alt56);
            inference_modules.inference_transformation_module($TRANS_PREDICATE_NEGATIONPREDS_NEG, $list_alt58);
            inference_modules.inference_transformation_module($TRANS_PREDICATE_SYMMETRY_POS, $list_alt60);
            inference_modules.inference_transformation_module($TRANS_PREDICATE_SYMMETRY_NEG, $list_alt62);
            inference_modules.inference_transformation_module($TRANS_PREDICATE_COMMUTATIVE_POS, $list_alt64);
            inference_modules.inference_transformation_module($TRANS_PREDICATE_COMMUTATIVE_NEG, $list_alt66);
            inference_modules.inference_transformation_module($TRANS_PREDICATE_PARTIALLY_COMMUTATIVE_POS, $list_alt68);
            inference_modules.inference_transformation_module($TRANS_PREDICATE_PARTIALLY_COMMUTATIVE_NEG, $list_alt70);
            inference_modules.inference_transformation_module($TRANS_PREDICATE_ASYMMETRY, $list_alt72);
            inference_modules.inference_transformation_module($TRANS_UNBOUND_PREDICATE_POS, $list_alt75);
            inference_modules.inference_transformation_module($TRANS_UNBOUND_PREDICATE_NEG, $list_alt77);
            inference_modules.inference_transformation_module($TRANS_ISA_POS, $list_alt83);
            inference_modules.inference_transformation_module($TRANS_ISA_NEG, $list_alt85);
            inference_modules.inference_transformation_module($TRANS_GENLS_POS, $list_alt87);
            inference_modules.inference_transformation_module($TRANS_GENLS_NEG, $list_alt89);
            inference_modules.inference_transformation_module($TRANS_GENL_MT_POS, $list_alt92);
            inference_modules.inference_transformation_module($TRANS_GENL_MT_NEG, $list_alt94);
            inference_modules.inference_transformation_module($TRANS_ABNORMAL, $list_alt97);
            inference_modules.inference_transformation_module($TRANSFORMATION_ABDUCTION_TO_SPECS, $list_alt100);
        }
        return NIL;
    }

    public static SubLObject setup_transformation_modules_file_Previous() {
        inference_modules.inference_transformation_module($TRANS_PREDICATE_POS, $list42);
        inference_modules.inference_transformation_module($TRANS_PREDICATE_NEG, $list44);
        memoization_state.note_memoized_function(TRANS_PREDICATE_RULE_SELECT_INT);
        memoization_state.note_memoized_function(TRANS_PREDICATE_GENLPREDS_POS_RULE_SELECT_INT);
        inference_modules.inference_transformation_module($TRANS_PREDICATE_GENLPREDS_POS, $list50);
        inference_modules.inference_transformation_module($TRANS_PREDICATE_GENLPREDS_NEG, $list52);
        memoization_state.note_memoized_function($sym53$INFERENCE_PROPER_GENL_PREDICATE_);
        memoization_state.note_memoized_function(TRANS_PREDICATE_GENLINVERSE_POS_RULE_SELECT_INT);
        inference_modules.inference_transformation_module($TRANS_PREDICATE_GENLINVERSE_POS, $list56);
        inference_modules.inference_transformation_module($TRANS_PREDICATE_GENLINVERSE_NEG, $list58);
        memoization_state.note_memoized_function($sym59$INFERENCE_PROPER_GENL_INVERSE_);
        inference_modules.inference_transformation_module($TRANS_PREDICATE_NEGATIONPREDS_NEG, $list61);
        inference_modules.inference_transformation_module($TRANS_PREDICATE_SYMMETRY_POS, $list63);
        inference_modules.inference_transformation_module($TRANS_PREDICATE_SYMMETRY_NEG, $list65);
        inference_modules.inference_transformation_module($TRANS_PREDICATE_COMMUTATIVE_POS, $list67);
        inference_modules.inference_transformation_module($TRANS_PREDICATE_COMMUTATIVE_NEG, $list69);
        inference_modules.inference_transformation_module($TRANS_PREDICATE_PARTIALLY_COMMUTATIVE_POS, $list71);
        inference_modules.inference_transformation_module($TRANS_PREDICATE_PARTIALLY_COMMUTATIVE_NEG, $list73);
        inference_modules.inference_transformation_module($TRANS_PREDICATE_ASYMMETRY, $list75);
        inference_modules.inference_transformation_module($TRANS_UNBOUND_PREDICATE_POS, $list78);
        inference_modules.inference_transformation_module($TRANS_UNBOUND_PREDICATE_NEG, $list80);
        memoization_state.note_memoized_function(TRANS_UNBOUND_PREDICATE_RULE_SELECT);
        memoization_state.note_memoized_function(INFERENCE_MEMOIZED_ALL_SPECS);
        memoization_state.note_memoized_function(TRANS_ISA_POS_RULE_SELECT_COUNT);
        inference_modules.inference_transformation_module($TRANS_ISA_POS, $list87);
        inference_modules.inference_transformation_module($TRANS_ISA_NEG, $list89);
        inference_modules.inference_transformation_module($TRANS_GENLS_POS, $list91);
        inference_modules.inference_transformation_module($TRANS_GENLS_NEG, $list93);
        memoization_state.note_memoized_function(INFERENCE_MEMOIZED_ALL_SPEC_MTS);
        inference_modules.inference_transformation_module($TRANS_GENL_MT_POS, $list96);
        inference_modules.inference_transformation_module($TRANS_GENL_MT_NEG, $list98);
        inference_modules.inference_transformation_module($TRANS_ABNORMAL, $list101);
        inference_modules.inference_transformation_module($TRANSFORMATION_ABDUCTION_TO_SPECS, $list104);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_transformation_modules_file();
    }

    @Override
    public void initializeVariables() {
        init_transformation_modules_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_transformation_modules_file();
    }

    

    public static final class $trans_predicate_pos_required$UnaryFunction extends UnaryFunction {
        public $trans_predicate_pos_required$UnaryFunction() {
            super(extractFunctionNamed("TRANS-PREDICATE-POS-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return trans_predicate_pos_required(arg1);
        }
    }

    public static final class $trans_predicate_pos_cost$UnaryFunction extends UnaryFunction {
        public $trans_predicate_pos_cost$UnaryFunction() {
            super(extractFunctionNamed("TRANS-PREDICATE-POS-COST"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return trans_predicate_pos_cost(arg1);
        }
    }

    public static final class $trans_predicate_pos_rule_select$UnaryFunction extends UnaryFunction {
        public $trans_predicate_pos_rule_select$UnaryFunction() {
            super(extractFunctionNamed("TRANS-PREDICATE-POS-RULE-SELECT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return trans_predicate_pos_rule_select(arg1);
        }
    }

    static private final SubLString $str_alt12$Unexpected_commutative_predicate_ = makeString("Unexpected commutative predicate ~s");

    public static final class $trans_predicate_pos_rule_filter$BinaryFunction extends BinaryFunction {
        public $trans_predicate_pos_rule_filter$BinaryFunction() {
            super(extractFunctionNamed("TRANS-PREDICATE-POS-RULE-FILTER"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return trans_predicate_pos_rule_filter(arg1, arg2);
        }
    }

    static private final SubLList $list_alt18 = list(list(makeSymbol("DIRECTION-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt20 = list(list(makeSymbol("RELEVANT-DIRECTIONS")));

    static private final SubLList $list_alt21 = list(list(makeSymbol("RULE-ASENT-VAR"), makeSymbol("RULE"), makeSymbol("SENSE"), makeSymbol("&KEY"), makeSymbol("PREDICATE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final class $trans_predicate_pos_expand$BinaryFunction extends BinaryFunction {
        public $trans_predicate_pos_expand$BinaryFunction() {
            super(extractFunctionNamed("TRANS-PREDICATE-POS-EXPAND"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return trans_predicate_pos_expand(arg1, arg2);
        }
    }

    static private final SubLList $list_alt22 = list(makeKeyword("PREDICATE"));

    static private final SubLSymbol $sym25$PREDICATE_VAR = makeUninternedSymbol("PREDICATE-VAR");

    public static final class $trans_predicate_genlpreds_pos_required$UnaryFunction extends UnaryFunction {
        public $trans_predicate_genlpreds_pos_required$UnaryFunction() {
            super(extractFunctionNamed("TRANS-PREDICATE-GENLPREDS-POS-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return trans_predicate_genlpreds_pos_required(arg1);
        }
    }

    static private final SubLSymbol $sym30$RULE_VAR = makeUninternedSymbol("RULE-VAR");

    static private final SubLList $list_alt34 = list(list(makeSymbol("RULE-ASENT-VAR"), makeSymbol("RULE-VAR"), makeSymbol("PREDICATE"), makeSymbol("SENSE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final class $trans_predicate_genlpreds_pos_cost$UnaryFunction extends UnaryFunction {
        public $trans_predicate_genlpreds_pos_cost$UnaryFunction() {
            super(extractFunctionNamed("TRANS-PREDICATE-GENLPREDS-POS-COST"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return trans_predicate_genlpreds_pos_cost(arg1);
        }
    }

    static private final SubLSymbol $sym35$DIRECTION_VAR = makeUninternedSymbol("DIRECTION-VAR");

    static private final SubLSymbol $sym36$SENSE_VAR = makeUninternedSymbol("SENSE-VAR");

    static private final SubLSymbol $sym37$PREDICATE_VAR = makeUninternedSymbol("PREDICATE-VAR");

    public static final class $trans_predicate_genlpreds_pos_rule_select$UnaryFunction extends UnaryFunction {
        public $trans_predicate_genlpreds_pos_rule_select$UnaryFunction() {
            super(extractFunctionNamed("TRANS-PREDICATE-GENLPREDS-POS-RULE-SELECT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return trans_predicate_genlpreds_pos_rule_select(arg1);
        }
    }

    static private final SubLSymbol $sym41$CURRENT_INFERENCE_RULE_PREFERENCE__ = makeSymbol("CURRENT-INFERENCE-RULE-PREFERENCE->");

    static private final SubLSymbol $sym42$TRANSFORMATION_RULE_UTILITY__ = makeSymbol("TRANSFORMATION-RULE-UTILITY->");

    public static final class $trans_predicate_symmetry_pos_cost$UnaryFunction extends UnaryFunction {
        public $trans_predicate_symmetry_pos_cost$UnaryFunction() {
            super(extractFunctionNamed("TRANS-PREDICATE-SYMMETRY-POS-COST"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return trans_predicate_symmetry_pos_cost(arg1);
        }
    }

    static private final SubLList $list_alt45 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), cons($FORT, makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("TRANS-PREDICATE-POS-REQUIRED"), $COST, makeSymbol("TRANS-PREDICATE-POS-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> . <whatever>)\nwhere <predicate> is a FORT\nfrom a rule concluding to <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$likesAsFriend #$AbrahamLincoln ?WHO)\nfrom a rule concluding to #$likesAsFriend") });

    public static final class $trans_predicate_symmetry_pos_rule_select$UnaryFunction extends UnaryFunction {
        public $trans_predicate_symmetry_pos_rule_select$UnaryFunction() {
            super(extractFunctionNamed("TRANS-PREDICATE-SYMMETRY-POS-RULE-SELECT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return trans_predicate_symmetry_pos_rule_select(arg1);
        }
    }

    public static final class $trans_predicate_symmetry_pos_rule_filter$BinaryFunction extends BinaryFunction {
        public $trans_predicate_symmetry_pos_rule_filter$BinaryFunction() {
            super(extractFunctionNamed("TRANS-PREDICATE-SYMMETRY-POS-RULE-FILTER"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return trans_predicate_symmetry_pos_rule_filter(arg1, arg2);
        }
    }

    static private final SubLList $list_alt47 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"), cons($FORT, makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("TRANS-PREDICATE-NEG-REQUIRED"), $COST, makeSymbol("TRANS-PREDICATE-NEG-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> . <whatever>))\nwhere <predicate> is a FORT\nfrom a rule concluding from <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$not (#$likesAsFriend #$AbrahamLincoln ?WHO))\nfrom a rule concluding from #$likesAsFriend") });

    public static final class $trans_predicate_symmetry_pos_expand$BinaryFunction extends BinaryFunction {
        public $trans_predicate_symmetry_pos_expand$BinaryFunction() {
            super(extractFunctionNamed("TRANS-PREDICATE-SYMMETRY-POS-EXPAND"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return trans_predicate_symmetry_pos_expand(arg1, arg2);
        }
    }

    public static final class $trans_unbound_predicate_pos_required$UnaryFunction extends UnaryFunction {
        public $trans_unbound_predicate_pos_required$UnaryFunction() {
            super(extractFunctionNamed("TRANS-UNBOUND-PREDICATE-POS-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return trans_unbound_predicate_pos_required(arg1);
        }
    }

    public static final SubLSymbol $kw50$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLString $str_alt51$Invalid_sense__s = makeString("Invalid sense ~s");

    public static final class $trans_unbound_predicate_pos_cost$UnaryFunction extends UnaryFunction {
        public $trans_unbound_predicate_pos_cost$UnaryFunction() {
            super(extractFunctionNamed("TRANS-UNBOUND-PREDICATE-POS-COST"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return trans_unbound_predicate_pos_cost(arg1);
        }
    }

    static private final SubLList $list_alt54 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), cons(list(makeKeyword("AND"), $FORT, list($TEST, makeSymbol("INFERENCE-SOME-SPEC-PRED-OR-INVERSE?"))), makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("TRANS-PREDICATE-GENLPREDS-POS-REQUIRED"), $COST, makeSymbol("TRANS-PREDICATE-GENLPREDS-POS-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-GENLPREDS-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-GENLPREDS-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-GENLPREDS-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> . <whatever>)\nwhere <predicate> is a FORT with some spec-preds\nfrom a rule concluding to a spec-pred of <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$acquaintedWith #$AbrahamLincoln ?WHO)\nfrom (#$genlPreds #$likesAsFriend #$acquaintedWith)\nand a rule concluding to #$likesAsFriend") });

    static private final SubLList $list_alt56 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"), cons(list(makeKeyword("AND"), $FORT, list($TEST, makeSymbol("INFERENCE-SOME-GENL-PRED-OR-INVERSE?"))), makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("TRANS-PREDICATE-GENLPREDS-NEG-REQUIRED"), $COST, makeSymbol("TRANS-PREDICATE-GENLPREDS-NEG-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-GENLPREDS-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-GENLPREDS-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-GENLPREDS-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> . <whatever>))\nwhere <predicate> is a FORT with some genl-preds\nfrom a rule concluding from a genl-pred of <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$not (#$likesAsFriend #$AbrahamLincoln ?WHO))\nfrom (#$genlPreds #$likesAsFriend #$acquaintedWith)\nand a rule concluding from #$acquaintedWith") });

    static private final SubLList $list_alt58 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"), cons(list(makeKeyword("AND"), $FORT, list($TEST, makeSymbol("INFERENCE-SOME-NEGATION-PRED-OR-INVERSE?"))), makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("TRANS-PREDICATE-NEGATIONPREDS-NEG-REQUIRED"), $COST, makeSymbol("TRANS-PREDICATE-NEGATIONPREDS-NEG-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-NEGATIONPREDS-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-NEGATIONPREDS-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-NEGATIONPREDS-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> . <whatever>))\nwhere <predicate> is a FORT with some negationPreds,\neither asserted or inferrable via genlPreds,\nfrom a rule concluding to a negationPred of <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$not (#$likesAsFriend #$AbrahamLincoln ?WHO))\nfrom (#$negationPreds #$likesAsFriend #$hates)\nand a rule concluding to #$hates") });

    static private final SubLList $list_alt60 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list($FORT, makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list($TEST, makeSymbol("INFERENCE-SYMMETRIC-PREDICATE?")), makeKeyword("ANYTHING"))), $COST, makeSymbol("TRANS-PREDICATE-SYMMETRY-POS-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-SYMMETRY-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-SYMMETRY-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-SYMMETRY-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <whatever> <whatever>)\nwhere <predicate> is a FORT\nand (#$isa <predicate> #$SymmetricBinaryPredicate)\nfrom a rule concluding to <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$bordersOn #$Canada ?WHAT)\nfrom (#$isa #$bordersOn #$SymmetricBinaryPredicate)\nand a rule concluding to #$bordersOn") });

    static private final SubLList $list_alt62 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list($FORT, makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list($TEST, makeSymbol("INFERENCE-SYMMETRIC-PREDICATE?")), makeKeyword("ANYTHING"))), $COST, makeSymbol("TRANS-PREDICATE-SYMMETRY-NEG-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-SYMMETRY-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-SYMMETRY-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-SYMMETRY-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> <whatever> <whatever>))\nwhere <predicate> is a FORT\nand (#$isa <predicate> #$SymmetricBinaryPredicate)\nfrom a rule concluding from <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$not (#$bordersOn #$Canada ?WHAT))\nfrom (#$isa #$bordersOn #$SymmetricBinaryPredicate)\nand a rule concluding from #$bordersOn") });

    static private final SubLList $list_alt64 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), listS($FORT, makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list($TEST, makeSymbol("INFERENCE-COMMUTATIVE-PREDICATE-P")), makeKeyword("ANYTHING"))), $COST, makeSymbol("TRANS-PREDICATE-COMMUTATIVE-POS-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-COMMUTATIVE-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-COMMUTATIVE-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-COMMUTATIVE-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> . <args>)\nwhere <predicate> is a FORT\nthere are at least 3 args in <args>\nand (#$isa <predicate> #$CommutativePredicate)\nfrom a rule concluding to <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$collinear <point A> <point B> <point C>)\nfrom (#$isa #$collinear #$CommutativePredicate)\nand a rule concluding to #$collinear") });

    static private final SubLList $list_alt66 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), listS($FORT, makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list($TEST, makeSymbol("INFERENCE-COMMUTATIVE-PREDICATE-P")), makeKeyword("ANYTHING"))), $COST, makeSymbol("TRANS-PREDICATE-COMMUTATIVE-NEG-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-COMMUTATIVE-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-COMMUTATIVE-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-COMMUTATIVE-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> . <args>))\nwhere <predicate> is a FORT\nthere are at least 3 args in <args>\nand (#$isa <predicate> #$CommutativePredicate)\nfrom a rule concluding from <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$not (#$collinear <point A> <point B> <point C>))\nfrom (#$isa #$collinear #$CommutativePredicate)\nand a rule concluding from #$collinear") });

    static private final SubLList $list_alt68 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), listS($FORT, makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list($TEST, makeSymbol("INFERENCE-PARTIALLY-COMMUTATIVE-PREDICATE-P")), makeKeyword("ANYTHING"))), $COST, makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <whatever> <whatever>)\nwhere <predicate> is a FORT\nand (#$isa <predicate> #$PartiallyCommutativePredicate)\nfrom a rule concluding to <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(distanceBetween PlanetEarth Sun ((Mega Mile) 93))\nfrom (#$isa #$distanceBetween #$PartiallyCommutativePredicate)\nand  (#$commutativeInArgs #$distanceBetween 1 2)\nand a rule concluding to #$distanceBetween") });

    static private final SubLList $list_alt70 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), listS($FORT, makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list($TEST, makeSymbol("INFERENCE-PARTIALLY-COMMUTATIVE-PREDICATE-P")), makeKeyword("ANYTHING"))), $COST, makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> <whatever> <whatever>))\nwhere <predicate> is a FORT\nand (#$isa <predicate> #$PartiallyCommutativePredicate)\nfrom a rule concluding from <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(not (distanceBetween PlanetEarth Sun (Inch 93)))\nfrom (#$isa #$distanceBetween #$PartiallyCommutativePredicate)\nand  (#$commutativeInArgs #$distanceBetween 1 2)\nand a rule concluding from #$distanceBetween") });

    static private final SubLList $list_alt72 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list($FORT, makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list($TEST, makeSymbol("INFERENCE-ASYMMETRIC-PREDICATE?")), makeKeyword("ANYTHING"))), $COST, makeSymbol("TRANS-PREDICATE-ASYMMETRY-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-ASYMMETRY-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-ASYMMETRY-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-ASYMMETRY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> <whatever> <whatever>))\nwhere <predicate> is a FORT\nand (#$isa <predicate> #$AsymmetricBinaryPredicate)\nfrom a rule concluding to <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$not (#$northOf ?WHAT #$Canada))\nfrom (#$isa #$northOf #$AsymmetricBinaryPredicate)\nand a rule concluding to #$northOf") });

    static private final SubLList $list_alt73 = list(makeKeyword("TRANS-UNBOUND-PREDICATE-POS"), makeKeyword("TRANS-UNBOUND-PREDICATE-NEG"));

    static private final SubLList $list_alt75 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED"), makeSymbol("TRANS-UNBOUND-PREDICATE-POS-REQUIRED"), $COST, makeSymbol("TRANS-UNBOUND-PREDICATE-POS-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-UNBOUND-PREDICATE-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-UNBOUND-PREDICATE-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-UNBOUND-PREDICATE-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<whatever> . <whatever>)\nfrom a rule concluding to a sentence with a variable as the predicate\nusing the unbound predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$implies\n      (#$and (#$isa ?ORDER #$MathematicalOrdering) (#$baseSet ?ORDER ?SET)\n       (#$orderingRelations ?ORDER ?PRED) (#$elementOf ?X ?SET)\n       (#$elementOf ?Y ?SET) (?PRED ?X ?Y) (#$elementOf ?Z ?SET)\n       (?PRED ?Y ?Z))\n      (?PRED ?X ?Z))") });

    static private final SubLList $list_alt77 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED"), makeSymbol("TRANS-UNBOUND-PREDICATE-NEG-REQUIRED"), $COST, makeSymbol("TRANS-UNBOUND-PREDICATE-NEG-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-UNBOUND-PREDICATE-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-UNBOUND-PREDICATE-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-UNBOUND-PREDICATE-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<whatever> . <whatever>))\nfrom a rule concluding from a sentence with a variable as the predicate\nusing the unbound predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("no current example") });

    static private final SubLList $list_alt78 = list(makeKeyword("TRANS-ISA-POS"), makeKeyword("TRANS-ISA-NEG"), makeKeyword("TRANS-GENLS-POS"), makeKeyword("TRANS-GENLS-NEG"), makeKeyword("TRANS-GENL-MT-POS"), makeKeyword("TRANS-GENL-MT-NEG"));

    static private final SubLList $list_alt83 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("ANYTHING"), $FORT), makeKeyword("REQUIRED"), makeSymbol("TRANS-ISA-POS-REQUIRED"), $COST, makeSymbol("TRANS-ISA-POS-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-ISA-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-ISA-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-ISA-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <whatever> <collection>)\nwhere <collection> is a FORT\nfrom a rule concluding to a spec of <collection>\nusing the isa rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$isa #$AbrahamLincoln #$FamousPerson)\nfrom (#$genls #$UnitedStatesPresident #$FamousPerson)\nand a rule concluding to #$isa #$UnitedStatesPresident") });

    static private final SubLList $list_alt85 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("ANYTHING"), $FORT), makeKeyword("REQUIRED"), makeSymbol("TRANS-ISA-NEG-REQUIRED"), $COST, makeSymbol("TRANS-ISA-NEG-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-ISA-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-ISA-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-ISA-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$isa <whatever> <collection>))\nwhere <collection> is a FORT\nfrom a rule concluding from a genl of <collection>\nusing the isa rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$not (#$isa #$AbrahamLincoln #$FrenchPerson))\nfrom (#$genls #$FrenchPerson #$EuropeanPerson)\nand a rule concluding from #$isa #$EuropeanPerson") });

    static private final SubLList $list_alt87 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genls"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genls"), makeKeyword("ANYTHING"), $FORT), makeKeyword("REQUIRED"), makeSymbol("TRANS-GENLS-POS-REQUIRED"), $COST, makeSymbol("TRANS-GENLS-POS-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-GENLS-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-GENLS-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-GENLS-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genls <whatever> <collection>)\nwhere <collection> is a FORT\nfrom a rule concluding to a spec of <collection>\nusing the genls rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$genls #$UnitedStatesPresident #$FamousPerson)\nfrom (#$genls #$WorldLeader #$FamousPerson)\nand a rule concluding to (#$genls ?X #$WorldLeader)") });

    static private final SubLList $list_alt89 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("genls"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genls"), makeKeyword("ANYTHING"), $FORT), makeKeyword("REQUIRED"), makeSymbol("TRANS-GENLS-NEG-REQUIRED"), $COST, makeSymbol("TRANS-GENLS-NEG-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-GENLS-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-GENLS-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-GENLS-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$genls <whatever> <collection>))\nwhere <collection> is a FORT\nfrom a rule concluding from a genl of <collection>\nusing the genls rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$not (#$genls #$UnitedStatesPresident #$FrenchPerson))\nfrom (#$genls #$FrenchPerson #$EuropeanPerson)\nand a rule concluding from (#$genls ?X #$EuropeanPerson)") });

    static private final SubLList $list_alt92 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genlMt"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genlMt"), makeKeyword("ANYTHING"), list($TEST, makeSymbol("HLMT-P"))), makeKeyword("REQUIRED"), makeSymbol("TRANS-GENL-MT-POS-REQUIRED"), $COST, makeSymbol("TRANS-GENL-MT-POS-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-GENL-MT-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-GENL-MT-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-GENL-MT-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genlMt <whatever> <microtheory>)\nwhere <microtheory> is a FORT\nfrom a rule concluding to a spec of <microtheory>\nusing the genlMt rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$genlMt #$UnitedStatesPresidentsMt #$FamousPeopleMt)\nfrom (#$genlMt #$WorldLeadersMt #$FamousPeopleMt)\nand a rule concluding to (#$genlMt ?X #$WorldLeadersMt)") });

    static private final SubLList $list_alt94 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("genlMt"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genlMt"), makeKeyword("ANYTHING"), list($TEST, makeSymbol("HLMT-P"))), makeKeyword("REQUIRED"), makeSymbol("TRANS-GENL-MT-NEG-REQUIRED"), $COST, makeSymbol("TRANS-GENL-MT-NEG-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-GENL-MT-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-GENL-MT-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-GENL-MT-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$genlMt <whatever> <microtheory>))\nwhere <microtheory> is a FORT\nfrom a rule concluding from a genl of <microtheory>\nusing the genlMt rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$not (#$genlMt #$UnitedStatesPresidentsMt #$FrenchPeopleMt))\nfrom (#$genlMt #$FrenchPeopleMt #$EuropeanPeopleMt)\nand a rule concluding from (#$genlMt ?X #$EuropeanPeopleMt)") });

    static private final SubLList $list_alt97 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("abnormal"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("abnormal"), makeKeyword("ANYTHING"), makeKeyword("ASSERTION")), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), $COST, makeSymbol("TRANS-ABNORMAL-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-ABNORMAL-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-ABNORMAL-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-ABNORMAL-EXPAND") });

    static private final SubLList $list_alt98 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?OBJ"), makeSymbol("?SUBSET")), list(reader_make_constant_shell("genls"), makeSymbol("?SUBSET"), makeSymbol("?SUPERSET"))), list(reader_make_constant_shell("isa"), makeSymbol("?OBJ"), makeSymbol("?SUPERSET")));

    static private final SubLList $list_alt100 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), $FORT, makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("TRANSFORMATION-ABDUCTION-TO-SPECS-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ABDUCTION-COST*"), makeKeyword("RULE-SELECT"), makeSymbol("TRANSFORMATION-ABDUCTION-TO-SPECS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANSFORMATION-ABDUCTION-TO-SPECS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANSFORMATION-ABDUCTION-TO-SPECS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fort> <fully-bound>)\n   where the asent is deemed abducible, and the problem store allows abduction,\n   using #$genls rules."), makeKeyword("EXAMPLE"), makeString("(#$isa #$GeorgeWBush #$Parent)") });
}

/**
 * Total time: 878 ms
 */
