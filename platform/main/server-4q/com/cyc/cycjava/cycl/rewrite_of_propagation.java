/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.equality_store.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class rewrite_of_propagation extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new rewrite_of_propagation();

 public static final String myName = "com.cyc.cycjava.cycl.rewrite_of_propagation";


    // defparameter
    // Definitions
    @LispMethod(comment = "Enable assertion propagation across equal forts when this is non-nil.\ndefparameter")
    public static final SubLSymbol $enable_rewrite_of_propagationP$ = makeSymbol("*ENABLE-REWRITE-OF-PROPAGATION?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $propagate_rewrite_of_source_term$ = makeSymbol("*PROPAGATE-REWRITE-OF-SOURCE-TERM*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $propagate_rewrite_of_target_term$ = makeSymbol("*PROPAGATE-REWRITE-OF-TARGET-TERM*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $propagate_rewrite_of_assertion$ = makeSymbol("*PROPAGATE-REWRITE-OF-ASSERTION*");



    private static final SubLSymbol REWRITE_OF_AFTER_ADDING = makeSymbol("REWRITE-OF-AFTER-ADDING");



    private static final SubLSymbol PROPAGATE_REWRITE_OF_ASSERTION = makeSymbol("PROPAGATE-REWRITE-OF-ASSERTION");

    private static final SubLSymbol FORT_WITH_SOME_SOURCE_REWRITE_OF_ASSERTIONS = makeSymbol("FORT-WITH-SOME-SOURCE-REWRITE-OF-ASSERTIONS");

    private static final SubLSymbol $PROPAGATE_REWRITE_OF_CNF = makeKeyword("PROPAGATE-REWRITE-OF-CNF");

    private static final SubLSymbol $sym11$OPAQUE_ARG_WRT_QUOTING_ = makeSymbol("OPAQUE-ARG-WRT-QUOTING?");

    private static final SubLSymbol $sym12$_EXIT = makeSymbol("%EXIT");



    public static final SubLObject rewrite_of_after_adding_alt(SubLObject argument, SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (((NIL != $enable_rewrite_of_propagationP$.getDynamicValue(thread)) && (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$rewriteOf))) && (NIL != assertions_high.assertion_has_truth(assertion, $TRUE))) {
                {
                    SubLObject asent = assertions_high.gaf_formula(assertion);
                    if (NIL != formula_arityE(asent, TWO_INTEGER, UNPROVIDED)) {
                        {
                            SubLObject source = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
                            SubLObject target = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
                            if ((NIL != forts.fort_p(target)) && (NIL != forts.fort_p(source))) {
                                if (!target.equal(source)) {
                                    com.cyc.cycjava.cycl.rewrite_of_propagation.rewrite_of_after_adding_internal(source, target, assertion);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject rewrite_of_after_adding(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        equality_store.decache_some_equality_assertions_somewhere(argument, assertion);
        if (((NIL != $enable_rewrite_of_propagationP$.getDynamicValue(thread)) && (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$rewriteOf))) && (NIL != assertions_high.assertion_has_truth(assertion, $TRUE))) {
            final SubLObject asent = assertions_high.gaf_formula(assertion);
            if (NIL != formula_arityE(asent, TWO_INTEGER, UNPROVIDED)) {
                final SubLObject source = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
                final SubLObject target = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
                if (((NIL != forts.fort_p(target)) && (NIL != forts.fort_p(source))) && (!target.equal(source))) {
                    rewrite_of_after_adding_internal(source, target, assertion);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject rewrite_of_after_adding_internal_alt(SubLObject source, SubLObject target, SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $propagate_rewrite_of_source_term$.currentBinding(thread);
                SubLObject _prev_bind_1 = $propagate_rewrite_of_target_term$.currentBinding(thread);
                SubLObject _prev_bind_2 = $propagate_rewrite_of_assertion$.currentBinding(thread);
                SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    $propagate_rewrite_of_source_term$.bind(source, thread);
                    $propagate_rewrite_of_target_term$.bind(target, thread);
                    $propagate_rewrite_of_assertion$.bind(assertion, thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    kb_mapping.map_term(PROPAGATE_REWRITE_OF_ASSERTION, source);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
                    $propagate_rewrite_of_assertion$.rebind(_prev_bind_2, thread);
                    $propagate_rewrite_of_target_term$.rebind(_prev_bind_1, thread);
                    $propagate_rewrite_of_source_term$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject rewrite_of_after_adding_internal(SubLObject source, final SubLObject target, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $propagate_rewrite_of_source_term$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $propagate_rewrite_of_target_term$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $propagate_rewrite_of_assertion$.currentBinding(thread);
        final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_5 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            $propagate_rewrite_of_source_term$.bind(source, thread);
            $propagate_rewrite_of_target_term$.bind(target, thread);
            $propagate_rewrite_of_assertion$.bind(assertion, thread);
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            kb_mapping.map_term(PROPAGATE_REWRITE_OF_ASSERTION, source);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_5, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_4, thread);
            $propagate_rewrite_of_assertion$.rebind(_prev_bind_3, thread);
            $propagate_rewrite_of_target_term$.rebind(_prev_bind_2, thread);
            $propagate_rewrite_of_source_term$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject propagate_rewrite_of_assertion_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject source = $propagate_rewrite_of_source_term$.getDynamicValue(thread);
                SubLObject target = $propagate_rewrite_of_target_term$.getDynamicValue(thread);
                SubLObject rewrite_of_assertion = $propagate_rewrite_of_assertion$.getDynamicValue(thread);
                if (assertion != $propagate_rewrite_of_assertion$.getDynamicValue(thread)) {
                    com.cyc.cycjava.cycl.rewrite_of_propagation.propagate_assertion_via_rewrite_of(assertion, source, target, rewrite_of_assertion);
                }
            }
            return NIL;
        }
    }

    public static SubLObject propagate_rewrite_of_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject source = $propagate_rewrite_of_source_term$.getDynamicValue(thread);
        final SubLObject target = $propagate_rewrite_of_target_term$.getDynamicValue(thread);
        final SubLObject rewrite_of_assertion = $propagate_rewrite_of_assertion$.getDynamicValue(thread);
        if (!assertion.eql($propagate_rewrite_of_assertion$.getDynamicValue(thread))) {
            propagate_assertion_via_rewrite_of(assertion, source, target, rewrite_of_assertion);
        }
        return NIL;
    }

    public static final SubLObject perform_rewrite_of_propagation_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $enable_rewrite_of_propagationP$.getDynamicValue(thread)) {
                {
                    SubLObject forts_with_rewrite_of = cycl_utilities.expression_gather(assertion, FORT_WITH_SOME_SOURCE_REWRITE_OF_ASSERTIONS, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != forts_with_rewrite_of) {
                        {
                            SubLObject cdolist_list_var = forts_with_rewrite_of;
                            SubLObject fort = NIL;
                            for (fort = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , fort = cdolist_list_var.first()) {
                                com.cyc.cycjava.cycl.rewrite_of_propagation.perform_rewrite_of_propagation_internal(fort, assertion);
                            }
                        }
                    }
                }
            }
            return assertion;
        }
    }

    public static SubLObject perform_rewrite_of_propagation(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $enable_rewrite_of_propagationP$.getDynamicValue(thread)) {
            final SubLObject forts_with_rewrite_of = cycl_utilities.expression_gather(assertion, FORT_WITH_SOME_SOURCE_REWRITE_OF_ASSERTIONS, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != forts_with_rewrite_of) {
                SubLObject cdolist_list_var = forts_with_rewrite_of;
                SubLObject fort = NIL;
                fort = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    perform_rewrite_of_propagation_internal(fort, assertion);
                    cdolist_list_var = cdolist_list_var.rest();
                    fort = cdolist_list_var.first();
                } 
            }
        }
        return assertion;
    }

    public static final SubLObject perform_rewrite_of_propagation_internal_alt(SubLObject source, SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    {
                        SubLObject pred_var = $$rewriteOf;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(source, TWO_INTEGER, pred_var)) {
                            {
                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(source, TWO_INTEGER, pred_var);
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
                                                                SubLObject rewrite_of_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_2);
                                                                SubLObject valid_3 = makeBoolean(token_var_2 != rewrite_of_assertion);
                                                                if (NIL != valid_3) {
                                                                    {
                                                                        SubLObject target = assertions_high.gaf_arg1(rewrite_of_assertion);
                                                                        if (!(((NIL == forts.fort_p(target)) || source.equal(target)) || (rewrite_of_assertion == assertion))) {
                                                                            com.cyc.cycjava.cycl.rewrite_of_propagation.propagate_assertion_via_rewrite_of(assertion, source, target, rewrite_of_assertion);
                                                                        }
                                                                    }
                                                                }
                                                                done_var_1 = makeBoolean(NIL == valid_3);
                                                            }
                                                        } 
                                                    }
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            if (NIL != final_index_iterator) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                            }
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_4, thread);
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
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject perform_rewrite_of_propagation_internal(SubLObject source, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject pred_var = $$rewriteOf;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(source, TWO_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(source, TWO_INTEGER, pred_var);
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
                                final SubLObject rewrite_of_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                final SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(rewrite_of_assertion));
                                if (NIL != valid_$3) {
                                    final SubLObject target = assertions_high.gaf_arg1(rewrite_of_assertion);
                                    if (((NIL != forts.fort_p(target)) && (!source.equal(target))) && (!rewrite_of_assertion.eql(assertion))) {
                                        propagate_assertion_via_rewrite_of(assertion, source, target, rewrite_of_assertion);
                                    }
                                }
                                done_var_$1 = makeBoolean(NIL == valid_$3);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject fort_with_some_source_rewrite_of_assertions_alt(SubLObject fort) {
        return some_source_rewrite_of_assertions_somewhereP(fort);
    }

    public static SubLObject fort_with_some_source_rewrite_of_assertions(final SubLObject fort) {
        return equality_store.some_source_rewrite_of_assertions_somewhereP(fort);
    }

    public static final SubLObject propagate_assertion_via_rewrite_of_alt(SubLObject assertion, SubLObject source, SubLObject target, SubLObject rewrite_of_assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(assertion, ASSERTION_P);
            SubLTrampolineFile.checkType(source, FORT_P);
            SubLTrampolineFile.checkType(target, FORT_P);
            SubLTrampolineFile.checkType(rewrite_of_assertion, ASSERTION_P);
            {
                SubLObject assertion_cnf = assertion_utilities.assertion_cnf_with_el_vars_only(assertion);
                if (NIL != com.cyc.cycjava.cycl.rewrite_of_propagation.should_propagate_rewrite_of_cnf(assertion_cnf, source, target)) {
                    {
                        SubLObject new_assertion_cnf = com.cyc.cycjava.cycl.rewrite_of_propagation.propagate_rewrite_of_cnf(assertion_cnf, source, target);
                        if (!new_assertion_cnf.equal(assertion_cnf)) {
                            {
                                SubLObject new_el_formula = clauses.cnf_formula(new_assertion_cnf, UNPROVIDED);
                                SubLObject direction = assertions_high.assertion_direction(assertion);
                                SubLObject el_supports = list(assertion, rewrite_of_assertion);
                                SubLObject source_mt = assertions_high.assertion_mt(assertion);
                                SubLObject rewrite_of_mt = assertions_high.assertion_mt(rewrite_of_assertion);
                                SubLObject new_mt = com.cyc.cycjava.cycl.rewrite_of_propagation.determine_propagate_rewrite_of_mt(source_mt, rewrite_of_mt);
                                if (NIL != new_mt) {
                                    {
                                        SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
                                        try {
                                            kb_control_vars.$forward_inference_enabledP$.bind(NIL, thread);
                                            fi.fi_add_argument_int(new_el_formula, new_mt, el_supports, direction, UNPROVIDED);
                                        } finally {
                                            kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject propagate_assertion_via_rewrite_of(final SubLObject assertion, SubLObject source, final SubLObject target, final SubLObject rewrite_of_assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        assert NIL != forts.fort_p(source) : "! forts.fort_p(source) " + ("forts.fort_p(source) " + "CommonSymbols.NIL != forts.fort_p(source) ") + source;
        assert NIL != forts.fort_p(target) : "! forts.fort_p(target) " + ("forts.fort_p(target) " + "CommonSymbols.NIL != forts.fort_p(target) ") + target;
        assert NIL != assertion_handles.assertion_p(rewrite_of_assertion) : "! assertion_handles.assertion_p(rewrite_of_assertion) " + ("assertion_handles.assertion_p(rewrite_of_assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(rewrite_of_assertion) ") + rewrite_of_assertion;
        final SubLObject assertion_cnf = assertion_utilities.assertion_cnf_with_el_vars_only(assertion);
        if (NIL != should_propagate_rewrite_of_cnf(assertion_cnf, source, target)) {
            final SubLObject new_assertion_cnf = propagate_rewrite_of_cnf(assertion_cnf, source, target);
            if (!new_assertion_cnf.equal(assertion_cnf)) {
                final SubLObject new_el_formula = clauses.cnf_formula(new_assertion_cnf, assertions_high.assertion_truth(assertion));
                final SubLObject direction = assertions_high.assertion_direction(assertion);
                final SubLObject el_supports = list(assertion, rewrite_of_assertion);
                final SubLObject source_mt = assertions_high.assertion_mt(assertion);
                final SubLObject rewrite_of_mt = assertions_high.assertion_mt(rewrite_of_assertion);
                final SubLObject new_mt = determine_propagate_rewrite_of_mt(source_mt, rewrite_of_mt);
                if (NIL != new_mt) {
                    fi.fi_add_argument_int(new_el_formula, new_mt, el_supports, direction, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject should_propagate_rewrite_of_cnf_alt(SubLObject assertion_cnf, SubLObject source, SubLObject target) {
        {
            SubLObject something_to_propagate = NIL;
            try {
                com.cyc.cycjava.cycl.rewrite_of_propagation.propagate_rewrite_of_cnf_internal(assertion_cnf, source, target, T);
            } catch (Throwable ccatch_env_var) {
                something_to_propagate = Errors.handleThrowable(ccatch_env_var, $PROPAGATE_REWRITE_OF_CNF);
            }
            return something_to_propagate;
        }
    }

    public static SubLObject should_propagate_rewrite_of_cnf(final SubLObject assertion_cnf, SubLObject source, final SubLObject target) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject something_to_propagate = NIL;
        try {
            thread.throwStack.push($PROPAGATE_REWRITE_OF_CNF);
            propagate_rewrite_of_cnf_internal(assertion_cnf, source, target, T);
        } catch (final Throwable ccatch_env_var) {
            something_to_propagate = Errors.handleThrowable(ccatch_env_var, $PROPAGATE_REWRITE_OF_CNF);
        } finally {
            thread.throwStack.pop();
        }
        return something_to_propagate;
    }

    public static final SubLObject note_should_propagate_rewrite_of_cnf_alt() {
        sublisp_throw($PROPAGATE_REWRITE_OF_CNF, T);
        return NIL;
    }

    public static SubLObject note_should_propagate_rewrite_of_cnf() {
        sublisp_throw($PROPAGATE_REWRITE_OF_CNF, T);
        return NIL;
    }

    public static final SubLObject propagate_rewrite_of_cnf_alt(SubLObject assertion_cnf, SubLObject source, SubLObject target) {
        return com.cyc.cycjava.cycl.rewrite_of_propagation.propagate_rewrite_of_cnf_internal(assertion_cnf, source, target, NIL);
    }

    public static SubLObject propagate_rewrite_of_cnf(final SubLObject assertion_cnf, SubLObject source, final SubLObject target) {
        return propagate_rewrite_of_cnf_internal(assertion_cnf, source, target, NIL);
    }

    public static final SubLObject propagate_rewrite_of_cnf_internal_alt(SubLObject assertion_cnf, SubLObject source, SubLObject target, SubLObject check) {
        {
            SubLObject neg_lits = clauses.neg_lits(assertion_cnf);
            SubLObject pos_lits = clauses.pos_lits(assertion_cnf);
            SubLObject new_neg_lits = NIL;
            SubLObject new_pos_lits = NIL;
            if (NIL != cycl_utilities.expression_list_find(source, neg_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                {
                    SubLObject cdolist_list_var = neg_lits;
                    SubLObject neg_lit = NIL;
                    for (neg_lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , neg_lit = cdolist_list_var.first()) {
                        {
                            SubLObject literal = com.cyc.cycjava.cycl.rewrite_of_propagation.propagate_rewrite_of_atomic_sentence(neg_lit, source, target, check);
                            if (NIL == check) {
                                new_neg_lits = cons(literal, new_neg_lits);
                            }
                        }
                    }
                    if (NIL == check) {
                        new_neg_lits = nreverse(new_neg_lits);
                    }
                }
            } else {
                if (NIL == check) {
                    new_neg_lits = neg_lits;
                }
            }
            if (NIL != cycl_utilities.expression_list_find(source, pos_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                {
                    SubLObject cdolist_list_var = pos_lits;
                    SubLObject pos_lit = NIL;
                    for (pos_lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pos_lit = cdolist_list_var.first()) {
                        {
                            SubLObject literal = com.cyc.cycjava.cycl.rewrite_of_propagation.propagate_rewrite_of_atomic_sentence(pos_lit, source, target, check);
                            if (NIL == check) {
                                new_pos_lits = cons(literal, new_pos_lits);
                            }
                        }
                    }
                    if (NIL == check) {
                        new_pos_lits = nreverse(new_pos_lits);
                    }
                }
            } else {
                if (NIL == check) {
                    new_pos_lits = pos_lits;
                }
            }
            if (NIL != check) {
                return NIL;
            } else {
                return clauses.make_cnf(new_neg_lits, new_pos_lits);
            }
        }
    }

    public static SubLObject propagate_rewrite_of_cnf_internal(final SubLObject assertion_cnf, SubLObject source, final SubLObject target, final SubLObject check) {
        final SubLObject neg_lits = clauses.neg_lits(assertion_cnf);
        final SubLObject pos_lits = clauses.pos_lits(assertion_cnf);
        SubLObject new_neg_lits = NIL;
        SubLObject new_pos_lits = NIL;
        if (NIL != cycl_utilities.expression_list_find(source, neg_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            SubLObject cdolist_list_var = neg_lits;
            SubLObject neg_lit = NIL;
            neg_lit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject literal = propagate_rewrite_of_atomic_sentence(neg_lit, source, target, check);
                if (NIL == check) {
                    new_neg_lits = cons(literal, new_neg_lits);
                }
                cdolist_list_var = cdolist_list_var.rest();
                neg_lit = cdolist_list_var.first();
            } 
            if (NIL == check) {
                new_neg_lits = nreverse(new_neg_lits);
            }
        } else
            if (NIL == check) {
                new_neg_lits = neg_lits;
            }

        if (NIL != cycl_utilities.expression_list_find(source, pos_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            SubLObject cdolist_list_var = pos_lits;
            SubLObject pos_lit = NIL;
            pos_lit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject literal = propagate_rewrite_of_atomic_sentence(pos_lit, source, target, check);
                if (NIL == check) {
                    new_pos_lits = cons(literal, new_pos_lits);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pos_lit = cdolist_list_var.first();
            } 
            if (NIL == check) {
                new_pos_lits = nreverse(new_pos_lits);
            }
        } else
            if (NIL == check) {
                new_pos_lits = pos_lits;
            }

        if (NIL != check) {
            return NIL;
        }
        return clauses.make_cnf(new_neg_lits, new_pos_lits);
    }

    /**
     *
     *
     * @return atomic-sentence; ASENT modified such that SOURCE is replaced by TARGET
    in all applicable places (e.g. not quoted or opaque arguments.
     * @throws :propagate-rewrite-of-cnf
     * 		iff CHECK is non-NIL.
     */
    @LispMethod(comment = "@return atomic-sentence; ASENT modified such that SOURCE is replaced by TARGET\r\nin all applicable places (e.g. not quoted or opaque arguments.\r\n@throws :propagate-rewrite-of-cnf\r\n\t\tiff CHECK is non-NIL.")
    public static final SubLObject propagate_rewrite_of_atomic_sentence_alt(SubLObject asent, SubLObject source, SubLObject target, SubLObject check) {
        if (NIL == cycl_utilities.expression_find(source, asent, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return asent;
        }
        {
            SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            if (NIL == forts.fort_p(predicate)) {
                return asent;
            }
            if ((predicate == $$isa) && (NIL != check)) {
                com.cyc.cycjava.cycl.rewrite_of_propagation.note_should_propagate_rewrite_of_cnf();
                return cycl_utilities.expression_subst(target, source, asent, symbol_function(EQUAL), UNPROVIDED);
            }
            if (NIL == kb_accessors.some_opaque_argumentP(predicate)) {
                if (NIL != check) {
                    com.cyc.cycjava.cycl.rewrite_of_propagation.note_should_propagate_rewrite_of_cnf();
                }
                return cycl_utilities.expression_subst(target, source, asent, symbol_function(EQUAL), UNPROVIDED);
            }
            {
                SubLObject sentence_args = cycl_utilities.sentence_args(asent, UNPROVIDED);
                SubLObject arg_index = ZERO_INTEGER;
                SubLObject subst_args = NIL;
                {
                    SubLObject cdolist_list_var = sentence_args;
                    SubLObject sentence_arg = NIL;
                    for (sentence_arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence_arg = cdolist_list_var.first()) {
                        arg_index = add(arg_index, ONE_INTEGER);
                        if (NIL != cycl_utilities.expression_find(source, sentence_arg, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            if (NIL == kb_accessors.opaque_argumentP(predicate, arg_index)) {
                                if (NIL != check) {
                                    com.cyc.cycjava.cycl.rewrite_of_propagation.note_should_propagate_rewrite_of_cnf();
                                }
                                subst_args = cons(arg_index, subst_args);
                            }
                        }
                    }
                }
                if (NIL == subst_args) {
                    return asent;
                }
                {
                    SubLObject new_asent = copy_expression(asent);
                    SubLObject cdolist_list_var = subst_args;
                    SubLObject subst_arg = NIL;
                    for (subst_arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subst_arg = cdolist_list_var.first()) {
                        {
                            SubLObject old_arg = cycl_utilities.sentence_arg(new_asent, subst_arg, UNPROVIDED);
                            set_nth(subst_arg, new_asent, cycl_utilities.expression_nsubst(target, source, old_arg, symbol_function(EQUAL), UNPROVIDED));
                        }
                    }
                    return new_asent;
                }
            }
        }
    }

    /**
     *
     *
     * @return atomic-sentence; ASENT modified such that SOURCE is replaced by TARGET
    in all applicable places (e.g. not quoted or opaque arguments.
     * @throws :propagate-rewrite-of-cnf
     * 		iff CHECK is non-NIL.
     */
    @LispMethod(comment = "@return atomic-sentence; ASENT modified such that SOURCE is replaced by TARGET\r\nin all applicable places (e.g. not quoted or opaque arguments.\r\n@throws :propagate-rewrite-of-cnf\r\n\t\tiff CHECK is non-NIL.")
    public static SubLObject propagate_rewrite_of_atomic_sentence(final SubLObject asent, SubLObject source, final SubLObject target, final SubLObject check) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
        try {
            cycl_utilities.$opaque_arg_function$.bind($sym11$OPAQUE_ARG_WRT_QUOTING_, thread);
            if (NIL == cycl_utilities.expression_find(source, asent, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return asent;
            }
            final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            if (NIL == forts.fort_p(predicate)) {
                return asent;
            }
            if (predicate.eql($$isa) && (NIL != check)) {
                note_should_propagate_rewrite_of_cnf();
                return cycl_utilities.expression_subst(target, source, asent, symbol_function(EQUAL), UNPROVIDED);
            }
            if (NIL == kb_accessors.some_opaque_argumentP(predicate)) {
                if (NIL != check) {
                    note_should_propagate_rewrite_of_cnf();
                }
                return cycl_utilities.expression_subst(target, source, asent, symbol_function(EQUAL), UNPROVIDED);
            }
            final SubLObject sentence_args = cycl_utilities.sentence_args(asent, UNPROVIDED);
            SubLObject arg_index = ZERO_INTEGER;
            SubLObject subst_args = NIL;
            SubLObject cdolist_list_var = sentence_args;
            SubLObject sentence_arg = NIL;
            sentence_arg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                arg_index = add(arg_index, ONE_INTEGER);
                if ((NIL != cycl_utilities.expression_find(source, sentence_arg, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL == kb_accessors.opaque_argumentP(predicate, arg_index))) {
                    if (NIL != check) {
                        note_should_propagate_rewrite_of_cnf();
                    }
                    subst_args = cons(arg_index, subst_args);
                }
                cdolist_list_var = cdolist_list_var.rest();
                sentence_arg = cdolist_list_var.first();
            } 
            if (NIL == subst_args) {
                return asent;
            }
            final SubLObject new_asent = copy_expression(asent);
            SubLObject cdolist_list_var2 = subst_args;
            SubLObject subst_arg = NIL;
            subst_arg = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                final SubLObject old_arg = cycl_utilities.sentence_arg(new_asent, subst_arg, UNPROVIDED);
                set_nth(subst_arg, new_asent, cycl_utilities.expression_nsubst(target, source, old_arg, symbol_function(EQUAL), UNPROVIDED));
                cdolist_list_var2 = cdolist_list_var2.rest();
                subst_arg = cdolist_list_var2.first();
            } 
            return new_asent;
        } finally {
            cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_0, thread);
        }
    }

    public static final SubLObject determine_propagate_rewrite_of_mt_alt(SubLObject source_mt, SubLObject rewrite_of_mt) {
        if (NIL != genl_mts.genl_mtP(source_mt, rewrite_of_mt, UNPROVIDED, UNPROVIDED)) {
            return source_mt;
        } else {
            if (NIL != genl_mts.genl_mtP(rewrite_of_mt, source_mt, UNPROVIDED, UNPROVIDED)) {
                return rewrite_of_mt;
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject determine_propagate_rewrite_of_mt(final SubLObject source_mt, final SubLObject rewrite_of_mt) {
        if (NIL != genl_mts.genl_mtP(source_mt, rewrite_of_mt, UNPROVIDED, UNPROVIDED)) {
            return source_mt;
        }
        if (NIL != genl_mts.genl_mtP(rewrite_of_mt, source_mt, UNPROVIDED, UNPROVIDED)) {
            return rewrite_of_mt;
        }
        return NIL;
    }

    public static SubLObject declare_rewrite_of_propagation_file() {
        declareFunction("rewrite_of_after_adding", "REWRITE-OF-AFTER-ADDING", 2, 0, false);
        declareFunction("rewrite_of_after_adding_internal", "REWRITE-OF-AFTER-ADDING-INTERNAL", 3, 0, false);
        declareFunction("propagate_rewrite_of_assertion", "PROPAGATE-REWRITE-OF-ASSERTION", 1, 0, false);
        declareFunction("perform_rewrite_of_propagation", "PERFORM-REWRITE-OF-PROPAGATION", 1, 0, false);
        declareFunction("perform_rewrite_of_propagation_internal", "PERFORM-REWRITE-OF-PROPAGATION-INTERNAL", 2, 0, false);
        declareFunction("fort_with_some_source_rewrite_of_assertions", "FORT-WITH-SOME-SOURCE-REWRITE-OF-ASSERTIONS", 1, 0, false);
        new rewrite_of_propagation.$fort_with_some_source_rewrite_of_assertions$UnaryFunction();
        declareFunction("propagate_assertion_via_rewrite_of", "PROPAGATE-ASSERTION-VIA-REWRITE-OF", 4, 0, false);
        declareFunction("should_propagate_rewrite_of_cnf", "SHOULD-PROPAGATE-REWRITE-OF-CNF", 3, 0, false);
        declareFunction("note_should_propagate_rewrite_of_cnf", "NOTE-SHOULD-PROPAGATE-REWRITE-OF-CNF", 0, 0, false);
        declareFunction("propagate_rewrite_of_cnf", "PROPAGATE-REWRITE-OF-CNF", 3, 0, false);
        declareFunction("propagate_rewrite_of_cnf_internal", "PROPAGATE-REWRITE-OF-CNF-INTERNAL", 4, 0, false);
        declareFunction("propagate_rewrite_of_atomic_sentence", "PROPAGATE-REWRITE-OF-ATOMIC-SENTENCE", 4, 0, false);
        declareFunction("determine_propagate_rewrite_of_mt", "DETERMINE-PROPAGATE-REWRITE-OF-MT", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_rewrite_of_propagation_file() {
        defparameter("*ENABLE-REWRITE-OF-PROPAGATION?*", T);
        defparameter("*PROPAGATE-REWRITE-OF-SOURCE-TERM*", NIL);
        defparameter("*PROPAGATE-REWRITE-OF-TARGET-TERM*", NIL);
        defparameter("*PROPAGATE-REWRITE-OF-ASSERTION*", NIL);
        return NIL;
    }

    public static SubLObject setup_rewrite_of_propagation_file() {
        register_kb_function(REWRITE_OF_AFTER_ADDING);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rewrite_of_propagation_file();
    }

    @Override
    public void initializeVariables() {
        init_rewrite_of_propagation_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rewrite_of_propagation_file();
    }

    static {
    }

    public static final class $fort_with_some_source_rewrite_of_assertions$UnaryFunction extends UnaryFunction {
        public $fort_with_some_source_rewrite_of_assertions$UnaryFunction() {
            super(extractFunctionNamed("FORT-WITH-SOME-SOURCE-REWRITE-OF-ASSERTIONS"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return fort_with_some_source_rewrite_of_assertions(arg1);
        }
    }
}

/**
 * Total time: 180 ms
 */
