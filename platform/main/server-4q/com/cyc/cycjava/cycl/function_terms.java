/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      FUNCTION-TERMS
 * source file: /cyc/top/cycl/function-terms.lisp
 * created:     2019/07/03 17:37:25
 */
public final class function_terms extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new function_terms();

 public static final String myName = "com.cyc.cycjava.cycl.function_terms";


    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $term_functional_complexity_internal_method_table$ = makeSymbol("*TERM-FUNCTIONAL-COMPLEXITY-INTERNAL-METHOD-TABLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $term_relational_complexity_internal_method_table$ = makeSymbol("*TERM-RELATIONAL-COMPLEXITY-INTERNAL-METHOD-TABLE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol TERM_OF_UNIT = makeSymbol("TERM-OF-UNIT");





    private static final SubLSymbol TERM_FUNCTIONAL_COMPLEXITY_INTERNAL_CONSTANT_METHOD = makeSymbol("TERM-FUNCTIONAL-COMPLEXITY-INTERNAL-CONSTANT-METHOD");

    private static final SubLSymbol TERM_FUNCTIONAL_COMPLEXITY_INTERNAL_NART_METHOD = makeSymbol("TERM-FUNCTIONAL-COMPLEXITY-INTERNAL-NART-METHOD");

    static private final SubLList $list10 = cons(makeSymbol("FUNCTION"), makeSymbol("ARGS"));

    private static final SubLSymbol TERM_FUNCTIONAL_COMPLEXITY_INTERNAL_CONS_METHOD = makeSymbol("TERM-FUNCTIONAL-COMPLEXITY-INTERNAL-CONS-METHOD");

    private static final SubLSymbol TERM_RELATIONAL_COMPLEXITY_INTERNAL_CONSTANT_METHOD = makeSymbol("TERM-RELATIONAL-COMPLEXITY-INTERNAL-CONSTANT-METHOD");

    private static final SubLSymbol TERM_RELATIONAL_COMPLEXITY_INTERNAL_NART_METHOD = makeSymbol("TERM-RELATIONAL-COMPLEXITY-INTERNAL-NART-METHOD");

    static private final SubLList $list14 = cons(makeSymbol("RELATION"), makeSymbol("ARGS"));

    private static final SubLSymbol TERM_RELATIONAL_COMPLEXITY_INTERNAL_CONS_METHOD = makeSymbol("TERM-RELATIONAL-COMPLEXITY-INTERNAL-CONS-METHOD");

    // Definitions
    public static final SubLObject term_of_unit_alt(SubLObject nart) {
        if (NIL != nart_handles.nart_p(nart)) {
            return narts_high.nart_hl_formula(nart);
        }
        return NIL;
    }

    // Definitions
    public static SubLObject term_of_unit(final SubLObject nart) {
        if (NIL != nart_handles.nart_p(nart)) {
            return narts_high.nart_hl_formula(nart);
        }
        return NIL;
    }

    /**
     * Return the #$termOfUnit assertion for NART.
     */
    @LispMethod(comment = "Return the #$termOfUnit assertion for NART.")
    public static final SubLObject term_of_unit_assertion_alt(SubLObject nart) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(nart, NART_P);
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                        mt_relevance_macros.$mt$.bind(mt_vars.$tou_mt$.getGlobalValue(), thread);
                        {
                            SubLObject pred_var = $$termOfUnit;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(nart, ONE_INTEGER, pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(nart, ONE_INTEGER, pred_var);
                                    SubLObject done_var = ans;
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
                                                            SubLObject done_var_1 = ans;
                                                            SubLObject token_var_2 = NIL;
                                                            while (NIL == done_var_1) {
                                                                {
                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_2);
                                                                    SubLObject valid_3 = makeBoolean(token_var_2 != assertion);
                                                                    if (NIL != valid_3) {
                                                                        ans = assertion;
                                                                    }
                                                                    done_var_1 = makeBoolean((NIL == valid_3) || (NIL != ans));
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
                                            done_var = makeBoolean((NIL == valid) || (NIL != ans));
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
                return ans;
            }
        }
    }

    /**
     * Return the #$termOfUnit assertion for NART.
     */
    @LispMethod(comment = "Return the #$termOfUnit assertion for NART.")
    public static SubLObject term_of_unit_assertion(final SubLObject nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != nart_handles.nart_p(nart) : "! nart_handles.nart_p(nart) " + ("nart_handles.nart_p(nart) " + "CommonSymbols.NIL != nart_handles.nart_p(nart) ") + nart;
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt_vars.$tou_mt$.getGlobalValue(), thread);
            final SubLObject pred_var = $$termOfUnit;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(nart, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(nart, ONE_INTEGER, pred_var);
                SubLObject done_var = ans;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$1 = ans;
                            final SubLObject token_var_$2 = NIL;
                            while (NIL == done_var_$1) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                final SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(assertion));
                                if (NIL != valid_$3) {
                                    ans = assertion;
                                }
                                done_var_$1 = makeBoolean((NIL == valid_$3) || (NIL != ans));
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
                    done_var = makeBoolean((NIL == valid) || (NIL != ans));
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject term_of_unit_assertions(final SubLObject nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != nart_handles.nart_p(nart) : "! nart_handles.nart_p(nart) " + ("nart_handles.nart_p(nart) " + "CommonSymbols.NIL != nart_handles.nart_p(nart) ") + nart;
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt_vars.$tou_mt$.getGlobalValue(), thread);
            final SubLObject pred_var = $$termOfUnit;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(nart, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(nart, ONE_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$5 = NIL;
                            final SubLObject token_var_$6 = NIL;
                            while (NIL == done_var_$5) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$6);
                                final SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(assertion));
                                if (NIL != valid_$7) {
                                    ans = cons(assertion, ans);
                                }
                                done_var_$5 = makeBoolean(NIL == valid_$7);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
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
        return ans;
    }

    public static final SubLObject nart_hl_formula_via_term_of_unit_assertion_alt(SubLObject nart) {
        {
            SubLObject tou_ass = com.cyc.cycjava.cycl.function_terms.term_of_unit_assertion(nart);
            if (NIL != tou_ass) {
                return assertions_high.gaf_arg2(tou_ass);
            }
        }
        return NIL;
    }

    public static SubLObject nart_hl_formula_via_term_of_unit_assertion(final SubLObject nart) {
        final SubLObject tou_ass = term_of_unit_assertion(nart);
        if (NIL != tou_ass) {
            return assertions_high.gaf_arg2(tou_ass);
        }
        return NIL;
    }

    public static final SubLObject term_of_unit_assertion_p_alt(SubLObject v_object) {
        if (NIL != assertions_high.gaf_assertionP(v_object)) {
            return eq($$termOfUnit, assertions_high.gaf_predicate(v_object));
        }
        return NIL;
    }

    public static SubLObject term_of_unit_assertion_p(final SubLObject v_object) {
        return assertion_utilities.gaf_assertion_with_pred_p(v_object, $$termOfUnit);
    }

    /**
     * obsolete
     */
    @LispMethod(comment = "obsolete")
    public static final SubLObject tou_assertionP_alt(SubLObject assertion) {
        return com.cyc.cycjava.cycl.function_terms.term_of_unit_assertion_p(assertion);
    }

    /**
     * obsolete
     */
    @LispMethod(comment = "obsolete")
    public static SubLObject tou_assertionP(final SubLObject assertion) {
        return term_of_unit_assertion_p(assertion);
    }

    /**
     * Return the maximum functional nesting depth of OBJECT.
     */
    @LispMethod(comment = "Return the maximum functional nesting depth of OBJECT.")
    public static final SubLObject term_functional_complexity_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        ans = com.cyc.cycjava.cycl.function_terms.term_functional_complexity_internal(v_object);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    /**
     * Return the maximum functional nesting depth of OBJECT.
     */
    @LispMethod(comment = "Return the maximum functional nesting depth of OBJECT.")
    public static SubLObject term_functional_complexity(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            ans = term_functional_complexity_internal(v_object);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static final SubLObject within_term_functional_complexity_cutoffP_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $term_functional_complexity_cutoff$.getDynamicValue(thread)) {
                return T;
            } else {
                return numLE(com.cyc.cycjava.cycl.function_terms.term_functional_complexity(v_term), $term_functional_complexity_cutoff$.getDynamicValue(thread));
            }
        }
    }

    public static SubLObject within_term_functional_complexity_cutoffP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $term_functional_complexity_cutoff$.getDynamicValue(thread)) {
            return T;
        }
        return numLE(term_functional_complexity(v_term), $term_functional_complexity_cutoff$.getDynamicValue(thread));
    }

    public static final SubLObject term_functional_complexity_internal_alt(SubLObject v_object) {
        {
            SubLObject method_function = method_func(v_object, $term_functional_complexity_internal_method_table$.getGlobalValue());
            if (NIL != method_function) {
                return funcall(method_function, v_object);
            }
            return ZERO_INTEGER;
        }
    }

    public static SubLObject term_functional_complexity_internal(final SubLObject v_object) {
        final SubLObject method_function = method_func(v_object, $term_functional_complexity_internal_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, v_object);
        }
        return ZERO_INTEGER;
    }

    public static final SubLObject term_functional_complexity_internal_constant_method_alt(SubLObject v_object) {
        return ZERO_INTEGER;
    }

    public static SubLObject term_functional_complexity_internal_constant_method(final SubLObject v_object) {
        return ZERO_INTEGER;
    }

    public static final SubLObject term_functional_complexity_internal_nart_method_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.function_terms.term_functional_complexity_nart(v_object);
    }

    public static SubLObject term_functional_complexity_internal_nart_method(final SubLObject v_object) {
        return term_functional_complexity_nart(v_object);
    }

    public static final SubLObject term_functional_complexity_nart_alt(SubLObject nart) {
        return com.cyc.cycjava.cycl.function_terms.term_functional_complexity(narts_high.nart_hl_formula(nart));
    }

    public static SubLObject term_functional_complexity_nart(final SubLObject nart) {
        return term_functional_complexity(narts_high.nart_hl_formula(nart));
    }

    /**
     * Fancy way of returning max term functional complexity within a NART.
     */
    @LispMethod(comment = "Fancy way of returning max term functional complexity within a NART.")
    public static final SubLObject term_functional_complexity_internal_cons_method_alt(SubLObject v_object) {
        {
            SubLObject datum = v_object;
            SubLObject current = datum;
            SubLObject function = NIL;
            SubLObject args = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt10);
            function = current.first();
            current = current.rest();
            args = current;
            if ((NIL != forts.fort_p(function)) && (NIL == fort_types_interface.non_predicate_functionP(function))) {
                return ZERO_INTEGER;
            } else {
                {
                    SubLObject arg_max_complexity = com.cyc.cycjava.cycl.function_terms.term_functional_complexity_internal(function);
                    SubLObject cdolist_list_var = args;
                    SubLObject arg = NIL;
                    for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                        {
                            SubLObject arg_complexity = com.cyc.cycjava.cycl.function_terms.term_functional_complexity_internal(arg);
                            arg_max_complexity = max(arg_max_complexity, arg_complexity);
                        }
                    }
                    return add(arg_max_complexity, ONE_INTEGER);
                }
            }
        }
    }

    /**
     * Fancy way of returning max term functional complexity within a NART.
     */
    @LispMethod(comment = "Fancy way of returning max term functional complexity within a NART.")
    public static SubLObject term_functional_complexity_internal_cons_method(final SubLObject v_object) {
        SubLObject function = NIL;
        SubLObject args = NIL;
        destructuring_bind_must_consp(v_object, v_object, $list10);
        function = v_object.first();
        final SubLObject current = args = v_object.rest();
        if ((NIL != forts.fort_p(function)) && (NIL == fort_types_interface.non_predicate_functionP(function))) {
            return ZERO_INTEGER;
        }
        SubLObject arg_max_complexity = term_functional_complexity_internal(function);
        SubLObject rest;
        SubLObject arg;
        SubLObject arg_complexity;
        for (rest = NIL, rest = args; !rest.isAtom(); rest = rest.rest()) {
            arg = rest.first();
            arg_complexity = term_functional_complexity_internal(arg);
            arg_max_complexity = max(arg_max_complexity, arg_complexity);
        }
        return add(arg_max_complexity, ONE_INTEGER);
    }

    /**
     * Return the maximum relational nesting depth of OBJECT.
     */
    @LispMethod(comment = "Return the maximum relational nesting depth of OBJECT.")
    public static final SubLObject term_relational_complexity_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        ans = com.cyc.cycjava.cycl.function_terms.term_relational_complexity_internal(v_object);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    /**
     * Return the maximum relational nesting depth of OBJECT.
     */
    @LispMethod(comment = "Return the maximum relational nesting depth of OBJECT.")
    public static SubLObject term_relational_complexity(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            ans = term_relational_complexity_internal(v_object);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static final SubLObject within_term_relational_complexity_cutoffP_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $term_relational_complexity_cutoff$.getDynamicValue(thread)) {
                return T;
            } else {
                return numLE(com.cyc.cycjava.cycl.function_terms.term_relational_complexity(v_term), $term_relational_complexity_cutoff$.getDynamicValue(thread));
            }
        }
    }

    public static SubLObject within_term_relational_complexity_cutoffP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $term_relational_complexity_cutoff$.getDynamicValue(thread)) {
            return T;
        }
        return numLE(term_relational_complexity(v_term), $term_relational_complexity_cutoff$.getDynamicValue(thread));
    }

    /**
     *
     *
     * @return BOOLEAN; Is OBJ1 less complex than OBJ2?
     */
    @LispMethod(comment = "@return BOOLEAN; Is OBJ1 less complex than OBJ2?")
    public static final SubLObject relational_complexity_L_alt(SubLObject obj1, SubLObject obj2) {
        if (obj2.isAtom()) {
            return NIL;
        } else {
            if (NIL == obj1) {
                return NIL;
            } else {
                if (obj1.isAtom()) {
                    return T;
                }
            }
        }
        {
            SubLObject depth1 = com.cyc.cycjava.cycl.function_terms.term_relational_complexity(obj1);
            SubLObject depth2 = com.cyc.cycjava.cycl.function_terms.term_relational_complexity(obj2);
            if (depth1.numL(depth2)) {
                return T;
            } else {
                return NIL;
            }
        }
    }

    /**
     *
     *
     * @return BOOLEAN; Is OBJ1 less complex than OBJ2?
     */
    @LispMethod(comment = "@return BOOLEAN; Is OBJ1 less complex than OBJ2?")
    public static SubLObject relational_complexity_L(final SubLObject obj1, final SubLObject obj2) {
        if (obj2.isAtom()) {
            return NIL;
        }
        if (NIL == obj1) {
            return NIL;
        }
        if (obj1.isAtom()) {
            return T;
        }
        final SubLObject depth1 = term_relational_complexity(obj1);
        final SubLObject depth2 = term_relational_complexity(obj2);
        if (depth1.numL(depth2)) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject term_relational_complexity_internal_alt(SubLObject v_object) {
        {
            SubLObject method_function = method_func(v_object, $term_relational_complexity_internal_method_table$.getGlobalValue());
            if (NIL != method_function) {
                return funcall(method_function, v_object);
            }
            return ZERO_INTEGER;
        }
    }

    public static SubLObject term_relational_complexity_internal(final SubLObject v_object) {
        final SubLObject method_function = method_func(v_object, $term_relational_complexity_internal_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, v_object);
        }
        return ZERO_INTEGER;
    }

    public static final SubLObject term_relational_complexity_internal_constant_method_alt(SubLObject v_object) {
        return ZERO_INTEGER;
    }

    public static SubLObject term_relational_complexity_internal_constant_method(final SubLObject v_object) {
        return ZERO_INTEGER;
    }

    public static final SubLObject term_relational_complexity_internal_nart_method_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.function_terms.term_relational_complexity_nart(v_object);
    }

    public static SubLObject term_relational_complexity_internal_nart_method(final SubLObject v_object) {
        return term_relational_complexity_nart(v_object);
    }

    public static final SubLObject term_relational_complexity_nart_alt(SubLObject nart) {
        return com.cyc.cycjava.cycl.function_terms.term_relational_complexity(narts_high.nart_hl_formula(nart));
    }

    public static SubLObject term_relational_complexity_nart(final SubLObject nart) {
        return term_relational_complexity(narts_high.nart_hl_formula(nart));
    }

    public static final SubLObject term_relational_complexity_internal_cons_method_alt(SubLObject v_object) {
        {
            SubLObject datum = v_object;
            SubLObject current = datum;
            SubLObject relation = NIL;
            SubLObject args = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt14);
            relation = current.first();
            current = current.rest();
            args = current;
            {
                SubLObject arg_max_complexity = com.cyc.cycjava.cycl.function_terms.term_relational_complexity_internal(relation);
                SubLObject cdolist_list_var = args;
                SubLObject arg = NIL;
                for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                    {
                        SubLObject arg_complexity = com.cyc.cycjava.cycl.function_terms.term_relational_complexity_internal(arg);
                        arg_max_complexity = max(arg_max_complexity, arg_complexity);
                    }
                }
                return add(arg_max_complexity, ONE_INTEGER);
            }
        }
    }

    public static SubLObject term_relational_complexity_internal_cons_method(final SubLObject v_object) {
        SubLObject relation = NIL;
        SubLObject args = NIL;
        destructuring_bind_must_consp(v_object, v_object, $list14);
        relation = v_object.first();
        final SubLObject current = args = v_object.rest();
        SubLObject arg_max_complexity = term_relational_complexity_internal(relation);
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject arg_complexity = term_relational_complexity_internal(arg);
            arg_max_complexity = max(arg_max_complexity, arg_complexity);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return add(arg_max_complexity, ONE_INTEGER);
    }

    /**
     * Return T iff OBJECT could be interpreted as a nat formula
     */
    @LispMethod(comment = "Return T iff OBJECT could be interpreted as a nat formula")
    public static final SubLObject nat_formula_p_alt(SubLObject v_object) {
        return possibly_naut_p(v_object);
    }

    /**
     * Return T iff OBJECT could be interpreted as a nat formula
     */
    @LispMethod(comment = "Return T iff OBJECT could be interpreted as a nat formula")
    public static SubLObject nat_formula_p(final SubLObject v_object) {
        return possibly_naut_p(v_object);
    }

    /**
     * Return a list of all NARTs in which FUNCTION is the function used.
     */
    @LispMethod(comment = "Return a list of all NARTs in which FUNCTION is the function used.")
    public static final SubLObject narts_of_function_alt(SubLObject function) {
        SubLTrampolineFile.checkType(function, FORT_P);
        {
            SubLObject result = NIL;
            if (NIL != kb_mapping_macros.do_function_extent_index_key_validator(function)) {
                {
                    SubLObject final_index_spec = kb_mapping_macros.function_extent_final_index_spec(function);
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                        {
                            SubLObject done_var = NIL;
                            SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                {
                                    SubLObject tou = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                                    SubLObject valid = makeBoolean(token_var != tou);
                                    if (NIL != valid) {
                                        {
                                            SubLObject nart = assertions_high.gaf_arg1(tou);
                                            result = cons(nart, result);
                                        }
                                    }
                                    done_var = makeBoolean(NIL == valid);
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
            return nreverse(result);
        }
    }

    @LispMethod(comment = "Return a list of all NARTs in which FUNCTION is the function used.")
    public static SubLObject narts_of_function(final SubLObject function) {
        assert NIL != forts.fort_p(function) : "! forts.fort_p(function) " + ("forts.fort_p(function) " + "CommonSymbols.NIL != forts.fort_p(function) ") + function;
        SubLObject result = NIL;
        if (NIL != kb_mapping_macros.do_function_extent_index_key_validator(function)) {
            final SubLObject final_index_spec = kb_mapping_macros.function_extent_final_index_spec(function);
            SubLObject final_index_iterator = NIL;
            try {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject tou = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(tou));
                    if (NIL != valid) {
                        final SubLObject nart = assertions_high.gaf_arg1(tou);
                        result = cons(nart, result);
                    }
                    done_var = makeBoolean(NIL == valid);
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
        return nreverse(result);
    }

    /**
     * Return a list of all NARTs in which TERM is argument ARG to FUNCTION.
     */
    @LispMethod(comment = "Return a list of all NARTs in which TERM is argument ARG to FUNCTION.")
    public static final SubLObject narts_of_term_alt(SubLObject function, SubLObject v_term, SubLObject arg) {
        if (arg == UNPROVIDED) {
            arg = ONE_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(function, FORT_P);
            SubLTrampolineFile.checkType(v_term, FORT_P);
            SubLTrampolineFile.checkType(arg, INTEGERP);
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                        mt_relevance_macros.$mt$.bind(mt_vars.$tou_mt$.getGlobalValue(), thread);
                        if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, arg, function)) {
                            {
                                SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, arg, function);
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
                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                    {
                                                        SubLObject done_var_5 = NIL;
                                                        SubLObject token_var_6 = NIL;
                                                        while (NIL == done_var_5) {
                                                            {
                                                                SubLObject tou_ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_6);
                                                                SubLObject valid_7 = makeBoolean(token_var_6 != tou_ass);
                                                                if (NIL != valid_7) {
                                                                    {
                                                                        SubLObject nart = assertions_high.gaf_arg1(tou_ass);
                                                                        result = cons(nart, result);
                                                                    }
                                                                }
                                                                done_var_5 = makeBoolean(NIL == valid_7);
                                                            }
                                                        } 
                                                    }
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            if (NIL != final_index_iterator) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                            }
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_8, thread);
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
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(result);
            }
        }
    }

    @LispMethod(comment = "Return a list of all NARTs in which TERM is argument ARG to FUNCTION.")
    public static SubLObject narts_of_term(final SubLObject function, final SubLObject v_term, SubLObject arg) {
        if (arg == UNPROVIDED) {
            arg = ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(function) : "! forts.fort_p(function) " + ("forts.fort_p(function) " + "CommonSymbols.NIL != forts.fort_p(function) ") + function;
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        assert NIL != integerp(arg) : "! integerp(arg) " + ("Types.integerp(arg) " + "CommonSymbols.NIL != Types.integerp(arg) ") + arg;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt_vars.$tou_mt$.getGlobalValue(), thread);
            if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, arg, function)) {
                final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, arg, function);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$9 = NIL;
                            final SubLObject token_var_$10 = NIL;
                            while (NIL == done_var_$9) {
                                final SubLObject tou_ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$10);
                                final SubLObject valid_$11 = makeBoolean(!token_var_$10.eql(tou_ass));
                                if (NIL != valid_$11) {
                                    final SubLObject nart = assertions_high.gaf_arg1(tou_ass);
                                    result = cons(nart, result);
                                }
                                done_var_$9 = makeBoolean(NIL == valid_$11);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
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
        return nreverse(result);
    }

    public static final SubLObject unnatify_terms_alt(SubLObject terms) {
        {
            SubLObject result = NIL;
            SubLObject v_const = NIL;
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                if (NIL != term.nautP(v_term, UNPROVIDED)) {
                    v_const = narts_high.find_nart(v_term);
                    if (NIL != v_const) {
                        result = cons(v_const, result);
                    }
                } else {
                    result = cons(v_term, result);
                }
            }
            return nreverse(result);
        }
    }

    public static SubLObject unnatify_terms(final SubLObject terms) {
        SubLObject result = NIL;
        SubLObject v_const = NIL;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != term.nautP(v_term, UNPROVIDED)) {
                v_const = narts_high.find_nart(v_term);
                if (NIL != v_const) {
                    result = cons(v_const, result);
                }
            } else {
                result = cons(v_term, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    /**
     * If OBJ is a ground NAUT (EL nat), convert it to an HL nart and return it,
     * else return OBJ.
     */
    @LispMethod(comment = "If OBJ is a ground NAUT (EL nat), convert it to an HL nart and return it,\r\nelse return OBJ.\nIf OBJ is a ground NAUT (EL nat), convert it to an HL nart and return it,\nelse return OBJ.")
    public static final SubLObject naut_to_nart_alt(SubLObject obj) {
        if (NIL != possibly_naut_p(obj)) {
            {
                SubLObject nart = narts_high.find_nart(obj);
                return NIL != nart ? ((SubLObject) (nart)) : obj;
            }
        } else {
            return obj;
        }
    }

    @LispMethod(comment = "If OBJ is a ground NAUT (EL nat), convert it to an HL nart and return it,\r\nelse return OBJ.\nIf OBJ is a ground NAUT (EL nat), convert it to an HL nart and return it,\nelse return OBJ.")
    public static SubLObject naut_to_nart(final SubLObject obj) {
        if (NIL != term.closed_nautP(obj, UNPROVIDED)) {
            final SubLObject nart = narts_high.find_nart(obj);
            return NIL != nart ? nart : obj;
        }
        return obj;
    }/**
     * If OBJ is a ground NAUT (EL nat), convert it to an HL nart and return it,
     * else return OBJ.
     */


    /**
     * If OBJ is an HL nart and can be converted to a ground NAUT (EL nat),
     * return the NAUT, else return OBJ.
     */
    @LispMethod(comment = "If OBJ is an HL nart and can be converted to a ground NAUT (EL nat),\r\nreturn the NAUT, else return OBJ.\nIf OBJ is an HL nart and can be converted to a ground NAUT (EL nat),\nreturn the NAUT, else return OBJ.")
    public static final SubLObject nart_to_naut_alt(SubLObject obj) {
        if (NIL != nart_handles.nart_p(obj)) {
            return narts_high.nart_el_formula(obj);
        } else {
            return obj;
        }
    }

    @LispMethod(comment = "If OBJ is an HL nart and can be converted to a ground NAUT (EL nat),\r\nreturn the NAUT, else return OBJ.\nIf OBJ is an HL nart and can be converted to a ground NAUT (EL nat),\nreturn the NAUT, else return OBJ.")
    public static SubLObject nart_to_naut(final SubLObject obj) {
        if (NIL != nart_handles.nart_p(obj)) {
            return narts_high.nart_el_formula(obj);
        }
        return obj;
    }/**
     * If OBJ is an HL nart and can be converted to a ground NAUT (EL nat),
     * return the NAUT, else return OBJ.
     */


    public static SubLObject declare_function_terms_file() {
        declareFunction("term_of_unit", "TERM-OF-UNIT", 1, 0, false);
        declareFunction("term_of_unit_assertion", "TERM-OF-UNIT-ASSERTION", 1, 0, false);
        declareFunction("term_of_unit_assertions", "TERM-OF-UNIT-ASSERTIONS", 1, 0, false);
        declareFunction("nart_hl_formula_via_term_of_unit_assertion", "NART-HL-FORMULA-VIA-TERM-OF-UNIT-ASSERTION", 1, 0, false);
        declareFunction("term_of_unit_assertion_p", "TERM-OF-UNIT-ASSERTION-P", 1, 0, false);
        declareFunction("tou_assertionP", "TOU-ASSERTION?", 1, 0, false);
        declareFunction("term_functional_complexity", "TERM-FUNCTIONAL-COMPLEXITY", 1, 0, false);
        declareFunction("within_term_functional_complexity_cutoffP", "WITHIN-TERM-FUNCTIONAL-COMPLEXITY-CUTOFF?", 1, 0, false);
        declareFunction("term_functional_complexity_internal", "TERM-FUNCTIONAL-COMPLEXITY-INTERNAL", 1, 0, false);
        declareFunction("term_functional_complexity_internal_constant_method", "TERM-FUNCTIONAL-COMPLEXITY-INTERNAL-CONSTANT-METHOD", 1, 0, false);
        declareFunction("term_functional_complexity_internal_nart_method", "TERM-FUNCTIONAL-COMPLEXITY-INTERNAL-NART-METHOD", 1, 0, false);
        declareFunction("term_functional_complexity_nart", "TERM-FUNCTIONAL-COMPLEXITY-NART", 1, 0, false);
        declareFunction("term_functional_complexity_internal_cons_method", "TERM-FUNCTIONAL-COMPLEXITY-INTERNAL-CONS-METHOD", 1, 0, false);
        declareFunction("term_relational_complexity", "TERM-RELATIONAL-COMPLEXITY", 1, 0, false);
        declareFunction("within_term_relational_complexity_cutoffP", "WITHIN-TERM-RELATIONAL-COMPLEXITY-CUTOFF?", 1, 0, false);
        declareFunction("relational_complexity_L", "RELATIONAL-COMPLEXITY-<", 2, 0, false);
        declareFunction("term_relational_complexity_internal", "TERM-RELATIONAL-COMPLEXITY-INTERNAL", 1, 0, false);
        declareFunction("term_relational_complexity_internal_constant_method", "TERM-RELATIONAL-COMPLEXITY-INTERNAL-CONSTANT-METHOD", 1, 0, false);
        declareFunction("term_relational_complexity_internal_nart_method", "TERM-RELATIONAL-COMPLEXITY-INTERNAL-NART-METHOD", 1, 0, false);
        declareFunction("term_relational_complexity_nart", "TERM-RELATIONAL-COMPLEXITY-NART", 1, 0, false);
        declareFunction("term_relational_complexity_internal_cons_method", "TERM-RELATIONAL-COMPLEXITY-INTERNAL-CONS-METHOD", 1, 0, false);
        declareFunction("nat_formula_p", "NAT-FORMULA-P", 1, 0, false);
        declareFunction("narts_of_function", "NARTS-OF-FUNCTION", 1, 0, false);
        declareFunction("narts_of_term", "NARTS-OF-TERM", 2, 1, false);
        declareFunction("unnatify_terms", "UNNATIFY-TERMS", 1, 0, false);
        declareFunction("naut_to_nart", "NAUT-TO-NART", 1, 0, false);
        declareFunction("nart_to_naut", "NART-TO-NAUT", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_function_terms_file() {
        deflexical("*TERM-FUNCTIONAL-COMPLEXITY-INTERNAL-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*TERM-RELATIONAL-COMPLEXITY-INTERNAL-METHOD-TABLE*", make_vector($int$256, NIL));
        return NIL;
    }

    public static SubLObject setup_function_terms_file() {
        define_obsolete_register(TERM_OF_UNIT, NIL);
        register_method($term_functional_complexity_internal_method_table$.getGlobalValue(), $dtp_constant$.getGlobalValue(), symbol_function(TERM_FUNCTIONAL_COMPLEXITY_INTERNAL_CONSTANT_METHOD));
        register_method($term_functional_complexity_internal_method_table$.getGlobalValue(), nart_handles.$dtp_nart$.getGlobalValue(), symbol_function(TERM_FUNCTIONAL_COMPLEXITY_INTERNAL_NART_METHOD));
        register_method($term_functional_complexity_internal_method_table$.getGlobalValue(), $dtp_cons$.getGlobalValue(), symbol_function(TERM_FUNCTIONAL_COMPLEXITY_INTERNAL_CONS_METHOD));
        register_method($term_relational_complexity_internal_method_table$.getGlobalValue(), $dtp_constant$.getGlobalValue(), symbol_function(TERM_RELATIONAL_COMPLEXITY_INTERNAL_CONSTANT_METHOD));
        register_method($term_relational_complexity_internal_method_table$.getGlobalValue(), nart_handles.$dtp_nart$.getGlobalValue(), symbol_function(TERM_RELATIONAL_COMPLEXITY_INTERNAL_NART_METHOD));
        register_method($term_relational_complexity_internal_method_table$.getGlobalValue(), $dtp_cons$.getGlobalValue(), symbol_function(TERM_RELATIONAL_COMPLEXITY_INTERNAL_CONS_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_function_terms_file();
    }

    @Override
    public void initializeVariables() {
        init_function_terms_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_function_terms_file();
    }

    static {
    }

    static private final SubLList $list_alt10 = cons(makeSymbol("FUNCTION"), makeSymbol("ARGS"));

    static private final SubLList $list_alt14 = cons(makeSymbol("RELATION"), makeSymbol("ARGS"));
}

/**
 * Total time: 223 ms
 */
