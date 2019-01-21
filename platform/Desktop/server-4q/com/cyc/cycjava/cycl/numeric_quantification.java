// 
////
// 

package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class numeric_quantification extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.numeric_quantification";
    public static final String myFingerPrint = "2253b845553cf2ab893af96c26dc6f0ffa5c39e9363be0ef22c8174a9c6c5f46";
    @SubLTranslatedFile.SubL(source = "cycl/numeric-quantification.lisp", position = 853L)
    public static SubLSymbol $partial_numeric_quantification$;
    @SubLTranslatedFile.SubL(source = "cycl/numeric-quantification.lisp", position = 1444L)
    public static SubLSymbol $numeric_quantification_function$;
    @SubLTranslatedFile.SubL(source = "cycl/numeric-quantification.lisp", position = 12466L)
    private static SubLSymbol $cyc_sort_compare_pred$;
    private static final SubLString $str0$A_KB_dependent_numerical_quantifi;
    private static final SubLSymbol $kw1$HL;
    private static final SubLObject $const2$IdentityFn;
    private static final SubLSymbol $sym3$COMPUTE_POSSIBLE_NUMERIC_QUANTIFICATION_VALUE_FORMULA_MEMOIZED;
    private static final SubLSymbol $sym4$_NQVAL;
    private static final SubLSymbol $kw5$ARG1;
    private static final SubLSymbol $kw6$ARG2;
    private static final SubLSymbol $sym7$COMPUTE_THE_SET_OF_ELEMENT_TO_NUMERIC_QUANT_VALUE_MAP;
    private static final SubLInteger $int8$100;
    private static final SubLSymbol $sym9$CYC_PLUS_ALL;
    private static final SubLSymbol $sym10$CYC_TIMES_ALL;
    private static final SubLSymbol $sym11$CYC_MAXIMUM;
    private static final SubLSymbol $sym12$CYC_MINIMUM;
    private static final SubLSymbol $sym13$CYC_AVERAGE;
    private static final SubLSymbol $sym14$CYC_LESS_THAN;
    private static final SubLSymbol $sym15$CYC_MEDIAN;
    private static final SubLList $list16;
    private static final SubLSymbol $sym17$CYC_EXTREME_MEMBER;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$NSIMPLIFY_NUMERIC_QUANTIFICATION_TUPLE_QUANTITY_VALUE;
    private static final SubLList $list20;
    private static final SubLSymbol $sym21$CYC_SORT;
    private static final SubLSymbol $sym22$CYC_STABLE_SORT;
    private static final SubLSymbol $sym23$FIRST;
    private static final SubLSymbol $sym24$CYC_SORT_FN;
    private static final SubLList $list25;
    private static final SubLSymbol $sym26$CYC_SORT__;
    private static final SubLSymbol $sym27$SECOND;
    private static final SubLObject $const28$greaterThan;
    private static final SubLObject $const29$lessThan;
    private static final SubLSymbol $sym30$_EXIT;
    private static final SubLSymbol $sym31$NUMERIC_QUANTIFICATION_COMPARE_RECURSIVE_QUERY;
    private static final SubLInteger $int32$8096;
    private static final SubLSymbol $sym33$CYC_SORT_SET_VIA_BIN_PRED_FN;
    
    @SubLTranslatedFile.SubL(source = "cycl/numeric-quantification.lisp", position = 1102L)
    public static SubLObject numeric_evaluate_all_unary(final SubLObject function, final SubLObject item_list) {
        if (numeric_quantification.NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error((SubLObject)numeric_quantification.$str0$A_KB_dependent_numerical_quantifi);
        }
        return relation_evaluation.cyc_evaluate_all_unary(function, item_list, numeric_quantification.$partial_numeric_quantification$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeric-quantification.lisp", position = 1508L)
    public static SubLObject numeric_quantification_group_items(final SubLObject item_group, final SubLObject function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject items = (SubLObject)numeric_quantification.NIL;
        final SubLObject _prev_bind_0 = numeric_quantification.$numeric_quantification_function$.currentBinding(thread);
        try {
            numeric_quantification.$numeric_quantification_function$.bind(function, thread);
            if (numeric_quantification.NIL != el_utilities.el_list_p(item_group)) {
                items = el_utilities.el_list_items(item_group);
            }
            else {
                items = quantities.evaluate_set_elements(item_group, (SubLObject)numeric_quantification.$kw1$HL);
            }
        }
        finally {
            numeric_quantification.$numeric_quantification_function$.rebind(_prev_bind_0, thread);
        }
        return items;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeric-quantification.lisp", position = 1848L)
    public static SubLObject numeric_quantification_item_value_tuples(final SubLObject item_group, final SubLObject function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject items = numeric_quantification_group_items(item_group, function);
        SubLObject tuples = (SubLObject)numeric_quantification.NIL;
        SubLObject cdolist_list_var = items;
        SubLObject item = (SubLObject)numeric_quantification.NIL;
        item = cdolist_list_var.first();
        while (numeric_quantification.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject value = numeric_quantification_apply_function(function, item);
            final SubLObject valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (numeric_quantification.NIL != valid) {
                tuples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(item, value), tuples);
            }
            else if (numeric_quantification.NIL == numeric_quantification.$partial_numeric_quantification$.getGlobalValue()) {
                relation_evaluation.throw_unevaluatable();
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return Sequences.nreverse(tuples);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeric-quantification.lisp", position = 2305L)
    public static SubLObject numeric_quantification_item_values(final SubLObject item_group, final SubLObject function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject items = numeric_quantification_group_items(item_group, function);
        SubLObject values = (SubLObject)numeric_quantification.NIL;
        SubLObject cdolist_list_var = items;
        SubLObject item = (SubLObject)numeric_quantification.NIL;
        item = cdolist_list_var.first();
        while (numeric_quantification.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject value = numeric_quantification_apply_function(function, item);
            final SubLObject valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (numeric_quantification.NIL != valid) {
                values = (SubLObject)ConsesLow.cons(value, values);
            }
            else if (numeric_quantification.NIL == numeric_quantification.$partial_numeric_quantification$.getGlobalValue()) {
                relation_evaluation.throw_unevaluatable();
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return Sequences.nreverse(values);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeric-quantification.lisp", position = 2744L)
    public static SubLObject numeric_quantification_apply_function(final SubLObject function, final SubLObject item) {
        if (function.eql(numeric_quantification.$const2$IdentityFn)) {
            return Values.values(item, (SubLObject)numeric_quantification.T);
        }
        if (numeric_quantification.NIL != ask_utilities.the_set_of_problem_solvable_via_generalized_queryP((SubLObject)numeric_quantification.UNPROVIDED, (SubLObject)numeric_quantification.UNPROVIDED, (SubLObject)numeric_quantification.UNPROVIDED)) {
            return numeric_quantification_item_value_via_generalized_query(function, item);
        }
        final SubLObject formula = el_utilities.make_unary_formula(function, item);
        return relation_evaluation.cyc_evaluate(formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeric-quantification.lisp", position = 3295L)
    public static SubLObject numeric_quantification_item_value_via_generalized_query(final SubLObject function, final SubLObject item) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject value = (SubLObject)numeric_quantification.NIL;
        SubLObject valid = (SubLObject)numeric_quantification.NIL;
        final SubLObject _prev_bind_0 = numeric_quantification.$numeric_quantification_function$.currentBinding(thread);
        try {
            numeric_quantification.$numeric_quantification_function$.bind(function, thread);
            thread.resetMultipleValues();
            final SubLObject value_$1 = the_set_of_element_value_via_generalized_query(item, (SubLObject)numeric_quantification.UNPROVIDED, (SubLObject)numeric_quantification.UNPROVIDED);
            final SubLObject valid_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            value = value_$1;
            valid = valid_$2;
        }
        finally {
            numeric_quantification.$numeric_quantification_function$.rebind(_prev_bind_0, thread);
        }
        return Values.values(value, valid);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeric-quantification.lisp", position = 3813L)
    public static SubLObject compute_possible_numeric_quantification_value_formula(final SubLObject the_set_of_variable) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject function = numeric_quantification.$numeric_quantification_function$.getDynamicValue(thread);
        if (numeric_quantification.NIL != function && numeric_quantification.NIL != relation_evaluation.function_to_arg_function_p(function)) {
            final SubLObject output_argnum = cycl_utilities.formula_arg1(function, (SubLObject)numeric_quantification.UNPROVIDED);
            final SubLObject predicate = cycl_utilities.formula_arg2(function, (SubLObject)numeric_quantification.UNPROVIDED);
            return compute_possible_numeric_quantification_value_formula_memoized(the_set_of_variable, output_argnum, predicate);
        }
        return (SubLObject)numeric_quantification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeric-quantification.lisp", position = 4258L)
    public static SubLObject compute_possible_numeric_quantification_value_formula_memoized_internal(final SubLObject the_set_of_variable, final SubLObject output_argnum, final SubLObject predicate) {
        final SubLObject input_argnum = arity.binary_arg_swap(output_argnum);
        final SubLObject numeric_quant_value_variable = (SubLObject)numeric_quantification.$sym4$_NQVAL;
        if (numeric_quantification.NIL != el_utilities.kappa_predicate_p(predicate) && numeric_quantification.TWO_INTEGER.numE(el_utilities.kappa_predicate_arity(predicate))) {
            final SubLObject scoped_vars = cycl_utilities.formula_arg1(predicate, (SubLObject)numeric_quantification.UNPROVIDED);
            final SubLObject kappa_input_variable = ConsesLow.nth(number_utilities.f_1_(input_argnum), scoped_vars);
            final SubLObject kappa_output_variable = ConsesLow.nth(number_utilities.f_1_(output_argnum), scoped_vars);
            SubLObject value_formula = cycl_utilities.formula_arg2(predicate, (SubLObject)numeric_quantification.UNPROVIDED);
            value_formula = conses_high.subst(the_set_of_variable, kappa_input_variable, value_formula, (SubLObject)numeric_quantification.UNPROVIDED, (SubLObject)numeric_quantification.UNPROVIDED);
            value_formula = conses_high.subst(numeric_quant_value_variable, kappa_output_variable, value_formula, (SubLObject)numeric_quantification.UNPROVIDED, (SubLObject)numeric_quantification.UNPROVIDED);
            return value_formula;
        }
        if (numeric_quantification.NIL != forts.fort_p(predicate) && numeric_quantification.NIL != arity.binaryP(predicate)) {
            final SubLObject value_formula2 = el_utilities.make_binary_formula(predicate, (SubLObject)numeric_quantification.$kw5$ARG1, (SubLObject)numeric_quantification.$kw6$ARG2);
            ConsesLow.set_nth(input_argnum, value_formula2, the_set_of_variable);
            ConsesLow.set_nth(output_argnum, value_formula2, numeric_quant_value_variable);
            return value_formula2;
        }
        return (SubLObject)numeric_quantification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeric-quantification.lisp", position = 4258L)
    public static SubLObject compute_possible_numeric_quantification_value_formula_memoized(final SubLObject the_set_of_variable, final SubLObject output_argnum, final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)numeric_quantification.NIL;
        if (numeric_quantification.NIL == v_memoization_state) {
            return compute_possible_numeric_quantification_value_formula_memoized_internal(the_set_of_variable, output_argnum, predicate);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)numeric_quantification.$sym3$COMPUTE_POSSIBLE_NUMERIC_QUANTIFICATION_VALUE_FORMULA_MEMOIZED, (SubLObject)numeric_quantification.UNPROVIDED);
        if (numeric_quantification.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)numeric_quantification.$sym3$COMPUTE_POSSIBLE_NUMERIC_QUANTIFICATION_VALUE_FORMULA_MEMOIZED, (SubLObject)numeric_quantification.THREE_INTEGER, (SubLObject)numeric_quantification.NIL, (SubLObject)numeric_quantification.EQUAL, (SubLObject)numeric_quantification.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)numeric_quantification.$sym3$COMPUTE_POSSIBLE_NUMERIC_QUANTIFICATION_VALUE_FORMULA_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(the_set_of_variable, output_argnum, predicate);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)numeric_quantification.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)numeric_quantification.NIL;
            collision = cdolist_list_var.first();
            while (numeric_quantification.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (the_set_of_variable.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (output_argnum.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (numeric_quantification.NIL != cached_args && numeric_quantification.NIL == cached_args.rest() && predicate.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(compute_possible_numeric_quantification_value_formula_memoized_internal(the_set_of_variable, output_argnum, predicate)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(the_set_of_variable, output_argnum, predicate));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeric-quantification.lisp", position = 5403L)
    public static SubLObject the_set_of_element_value_via_generalized_query(final SubLObject element, SubLObject problem, SubLObject mt) {
        if (problem == numeric_quantification.UNPROVIDED) {
            problem = inference_worker.currently_active_problem();
        }
        if (mt == numeric_quantification.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLObject numeric_quant_value_map = compute_the_set_of_element_to_numeric_quant_value_map(problem, mt);
        return dictionary.dictionary_lookup(numeric_quant_value_map, element, (SubLObject)numeric_quantification.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeric-quantification.lisp", position = 5773L)
    public static SubLObject compute_the_set_of_element_to_numeric_quant_value_map_internal(final SubLObject problem, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject generalized_query = ask_utilities.compute_the_set_of_elements_generalized_query(problem);
        final SubLObject the_set_of_variable = thread.secondMultipleValue();
        final SubLObject supported_restriction_bindings = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject expanded_answers = ask_utilities.the_set_of_elements_generalized_query_memoized(generalized_query, mt);
        final SubLObject result_map = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)numeric_quantification.EQUAL), (SubLObject)numeric_quantification.ZERO_INTEGER);
        SubLObject cdolist_list_var = expanded_answers;
        SubLObject binding = (SubLObject)numeric_quantification.NIL;
        binding = cdolist_list_var.first();
        while (numeric_quantification.NIL != cdolist_list_var) {
            if (numeric_quantification.NIL != list_utilities.fast_subsetP(supported_restriction_bindings, binding, Symbols.symbol_function((SubLObject)numeric_quantification.EQUAL))) {
                final SubLObject element = bindings.variable_lookup(the_set_of_variable, binding);
                final SubLObject value = bindings.variable_lookup((SubLObject)numeric_quantification.$sym4$_NQVAL, binding);
                dictionary.dictionary_enter(result_map, element, value);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        return result_map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeric-quantification.lisp", position = 5773L)
    public static SubLObject compute_the_set_of_element_to_numeric_quant_value_map(final SubLObject problem, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)numeric_quantification.NIL;
        if (numeric_quantification.NIL == v_memoization_state) {
            return compute_the_set_of_element_to_numeric_quant_value_map_internal(problem, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)numeric_quantification.$sym7$COMPUTE_THE_SET_OF_ELEMENT_TO_NUMERIC_QUANT_VALUE_MAP, (SubLObject)numeric_quantification.UNPROVIDED);
        if (numeric_quantification.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)numeric_quantification.$sym7$COMPUTE_THE_SET_OF_ELEMENT_TO_NUMERIC_QUANT_VALUE_MAP, (SubLObject)numeric_quantification.TWO_INTEGER, (SubLObject)numeric_quantification.$int8$100, (SubLObject)numeric_quantification.EQUAL, (SubLObject)numeric_quantification.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)numeric_quantification.$sym7$COMPUTE_THE_SET_OF_ELEMENT_TO_NUMERIC_QUANT_VALUE_MAP, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(problem, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)numeric_quantification.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)numeric_quantification.NIL;
            collision = cdolist_list_var.first();
            while (numeric_quantification.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (problem.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (numeric_quantification.NIL != cached_args && numeric_quantification.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(compute_the_set_of_element_to_numeric_quant_value_map_internal(problem, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(problem, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeric-quantification.lisp", position = 6513L)
    public static SubLObject cyc_plus_all(final SubLObject v_set, final SubLObject function) {
        final SubLObject values = numeric_quantification_item_values(v_set, function);
        final SubLObject v_answer = cyc_plus_all_internal(values);
        if (numeric_quantification.NIL == v_answer) {
            relation_evaluation.throw_unevaluatable();
        }
        return arithmetic.arithmetic_answer(v_answer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeric-quantification.lisp", position = 6925L)
    public static SubLObject cyc_plus_all_internal(final SubLObject values) {
        SubLObject v_answer = (SubLObject)numeric_quantification.NIL;
        SubLObject cdolist_list_var = values;
        SubLObject value = (SubLObject)numeric_quantification.NIL;
        value = cdolist_list_var.first();
        while (numeric_quantification.NIL != cdolist_list_var) {
            v_answer = ((numeric_quantification.NIL != v_answer) ? arithmetic.cyc_plus_internal(v_answer, value) : value);
            cdolist_list_var = cdolist_list_var.rest();
            value = cdolist_list_var.first();
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeric-quantification.lisp", position = 7111L)
    public static SubLObject cyc_times_all(final SubLObject v_set, final SubLObject function) {
        final SubLObject values = numeric_quantification_item_values(v_set, function);
        SubLObject v_answer = (SubLObject)numeric_quantification.ONE_INTEGER;
        SubLObject cdolist_list_var = values;
        SubLObject value = (SubLObject)numeric_quantification.NIL;
        value = cdolist_list_var.first();
        while (numeric_quantification.NIL != cdolist_list_var) {
            v_answer = arithmetic.cyc_times_internal(v_answer, value);
            cdolist_list_var = cdolist_list_var.rest();
            value = cdolist_list_var.first();
        }
        return arithmetic.arithmetic_answer(v_answer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeric-quantification.lisp", position = 7457L)
    public static SubLObject cyc_maximum(final SubLObject v_set, final SubLObject function) {
        final SubLObject values = numeric_quantification_item_values(v_set, function);
        SubLObject v_answer = (SubLObject)numeric_quantification.NIL;
        SubLObject cdolist_list_var = values;
        SubLObject value = (SubLObject)numeric_quantification.NIL;
        value = cdolist_list_var.first();
        while (numeric_quantification.NIL != cdolist_list_var) {
            if (numeric_quantification.NIL == v_answer || numeric_quantification.NIL != arithmetic.cyc_greater_than(value, v_answer)) {
                v_answer = value;
            }
            cdolist_list_var = cdolist_list_var.rest();
            value = cdolist_list_var.first();
        }
        if (numeric_quantification.NIL == v_answer) {
            relation_evaluation.throw_unevaluatable();
        }
        return arithmetic.arithmetic_answer(v_answer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeric-quantification.lisp", position = 7836L)
    public static SubLObject cyc_minimum(final SubLObject v_set, final SubLObject function) {
        final SubLObject values = numeric_quantification_item_values(v_set, function);
        SubLObject v_answer = (SubLObject)numeric_quantification.NIL;
        SubLObject cdolist_list_var = values;
        SubLObject value = (SubLObject)numeric_quantification.NIL;
        value = cdolist_list_var.first();
        while (numeric_quantification.NIL != cdolist_list_var) {
            if (numeric_quantification.NIL == v_answer || numeric_quantification.NIL != arithmetic.cyc_less_than(value, v_answer)) {
                v_answer = value;
            }
            cdolist_list_var = cdolist_list_var.rest();
            value = cdolist_list_var.first();
        }
        if (numeric_quantification.NIL == v_answer) {
            relation_evaluation.throw_unevaluatable();
        }
        return arithmetic.arithmetic_answer(v_answer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeric-quantification.lisp", position = 8212L)
    public static SubLObject cyc_average(final SubLObject v_set, final SubLObject function) {
        final SubLObject values = numeric_quantification_item_values(v_set, function);
        final SubLObject sum = cyc_plus_all_internal(values);
        final SubLObject count = Sequences.length(values);
        return quantities.cyc_quotient(sum, count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeric-quantification.lisp", position = 8540L)
    public static SubLObject cyc_median(final SubLObject v_set, final SubLObject function) {
        SubLObject values = numeric_quantification_item_values(v_set, function);
        final SubLObject total = Sequences.length(values);
        final SubLObject middle_index = Numbers.integerDivide(total, (SubLObject)numeric_quantification.TWO_INTEGER);
        SubLObject v_answer = (SubLObject)numeric_quantification.NIL;
        values = Sort.sort(values, (SubLObject)numeric_quantification.$sym14$CYC_LESS_THAN, (SubLObject)numeric_quantification.UNPROVIDED);
        if (total.isZero()) {
            relation_evaluation.throw_unevaluatable();
        }
        else if (numeric_quantification.NIL != Numbers.oddp(total)) {
            v_answer = ConsesLow.nth(middle_index, values);
        }
        else {
            final SubLObject median_a_value = ConsesLow.nth(middle_index, values);
            final SubLObject median_b_value = ConsesLow.nth(number_utilities.f_1_(middle_index), values);
            v_answer = quantities.cyc_quotient(arithmetic.cyc_plus_internal(median_a_value, median_b_value), (SubLObject)numeric_quantification.TWO_INTEGER);
        }
        return arithmetic.arithmetic_answer(v_answer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeric-quantification.lisp", position = 9272L)
    public static SubLObject cyc_extreme_member(final SubLObject list, final SubLObject compare_pred, final SubLObject function) {
        if (numeric_quantification.NIL == fort_types_interface.isa_predicateP(compare_pred, (SubLObject)numeric_quantification.UNPROVIDED) || !numeric_quantification.TWO_INTEGER.eql(arity.arity(compare_pred))) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject tuples = numeric_quantification_item_value_tuples(list, function);
        SubLObject extreme_item = (SubLObject)numeric_quantification.NIL;
        SubLObject extreme_value = (SubLObject)numeric_quantification.NIL;
        SubLObject cdolist_list_var;
        tuples = (cdolist_list_var = possibly_optimize_tuples_wrt_compare_pred(tuples, compare_pred));
        SubLObject tuple = (SubLObject)numeric_quantification.NIL;
        tuple = cdolist_list_var.first();
        while (numeric_quantification.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject candidate_item = (SubLObject)numeric_quantification.NIL;
            SubLObject candidate_value = (SubLObject)numeric_quantification.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)numeric_quantification.$list16);
            candidate_item = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)numeric_quantification.$list16);
            candidate_value = current.first();
            current = current.rest();
            if (numeric_quantification.NIL == current) {
                if (numeric_quantification.NIL == extreme_item || numeric_quantification.NIL != numeric_quantification_compare(compare_pred, candidate_value, extreme_value)) {
                    extreme_item = candidate_item;
                    extreme_value = candidate_value;
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)numeric_quantification.$list16);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        }
        if (numeric_quantification.NIL == extreme_item) {
            relation_evaluation.throw_unevaluatable();
        }
        return extreme_item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeric-quantification.lisp", position = 10078L)
    public static SubLObject possibly_optimize_tuples_wrt_compare_pred(SubLObject tuples, final SubLObject compare_pred) {
        if (numeric_quantification.NIL != list_utilities.member_eqP(compare_pred, (SubLObject)numeric_quantification.$list18) && numeric_quantification.NIL != tuple_values_all_are_simply_uniform_quantitiesP(tuples)) {
            tuples = list_utilities.nmapcar((SubLObject)numeric_quantification.$sym19$NSIMPLIFY_NUMERIC_QUANTIFICATION_TUPLE_QUANTITY_VALUE, tuples);
        }
        return tuples;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeric-quantification.lisp", position = 10550L)
    public static SubLObject tuple_values_all_are_simply_uniform_quantitiesP(final SubLObject tuples) {
        if (numeric_quantification.NIL != tuples) {
            SubLObject first_tuple = (SubLObject)numeric_quantification.NIL;
            SubLObject rest_tuples = (SubLObject)numeric_quantification.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(tuples, tuples, (SubLObject)numeric_quantification.$list20);
            first_tuple = tuples.first();
            final SubLObject current = rest_tuples = tuples.rest();
            final SubLObject first_value = conses_high.second(first_tuple);
            if (numeric_quantification.NIL != el_utilities.el_unary_formula_p(first_value) && cycl_utilities.formula_arg1(first_value, (SubLObject)numeric_quantification.UNPROVIDED).isNumber()) {
                final SubLObject unit = cycl_utilities.formula_operator(first_value);
                if (numeric_quantification.NIL != collection_defns.unit_of_measureP(unit, (SubLObject)numeric_quantification.UNPROVIDED)) {
                    SubLObject witness = (SubLObject)numeric_quantification.NIL;
                    if (numeric_quantification.NIL == witness) {
                        SubLObject csome_list_var = rest_tuples;
                        SubLObject other_tuple = (SubLObject)numeric_quantification.NIL;
                        other_tuple = csome_list_var.first();
                        while (numeric_quantification.NIL == witness && numeric_quantification.NIL != csome_list_var) {
                            final SubLObject other_value = conses_high.second(other_tuple);
                            if (numeric_quantification.NIL == el_utilities.el_unary_formula_p(other_value) || !unit.equal(cycl_utilities.formula_operator(other_value)) || !cycl_utilities.formula_arg1(other_value, (SubLObject)numeric_quantification.UNPROVIDED).isNumber()) {
                                witness = other_value;
                            }
                            csome_list_var = csome_list_var.rest();
                            other_tuple = csome_list_var.first();
                        }
                    }
                    return (SubLObject)SubLObjectFactory.makeBoolean(numeric_quantification.NIL == list_utilities.sublisp_boolean(witness));
                }
            }
        }
        return (SubLObject)numeric_quantification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeric-quantification.lisp", position = 11269L)
    public static SubLObject nsimplify_numeric_quantification_tuple_quantity_value(final SubLObject tuple) {
        final SubLObject quantity = conses_high.second(tuple);
        final SubLObject number = cycl_utilities.formula_arg1(quantity, (SubLObject)numeric_quantification.UNPROVIDED);
        ConsesLow.set_nth((SubLObject)numeric_quantification.ONE_INTEGER, tuple, number);
        return tuple;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeric-quantification.lisp", position = 11509L)
    public static SubLObject cyc_sort(final SubLObject v_set, final SubLObject compare_pred, final SubLObject function) {
        return cyc_sort_item_group(v_set, compare_pred, function, (SubLObject)numeric_quantification.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeric-quantification.lisp", position = 11699L)
    public static SubLObject cyc_stable_sort(final SubLObject list, final SubLObject compare_pred, final SubLObject function) {
        return cyc_sort_item_group(list, compare_pred, function, (SubLObject)numeric_quantification.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeric-quantification.lisp", position = 11829L)
    public static SubLObject cyc_sort_item_group(final SubLObject item_group, final SubLObject compare_pred, final SubLObject function, final SubLObject stableP) {
        if (numeric_quantification.NIL == fort_types_interface.isa_predicateP(compare_pred, (SubLObject)numeric_quantification.UNPROVIDED) || !numeric_quantification.TWO_INTEGER.eql(arity.arity(compare_pred))) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject tuples = numeric_quantification_item_value_tuples(item_group, function);
        final SubLObject sorted_tuples = cyc_sort_item_group_tuples(tuples, compare_pred, stableP);
        final SubLObject sorted_items = Mapping.mapcar(Symbols.symbol_function((SubLObject)numeric_quantification.$sym23$FIRST), sorted_tuples);
        return el_utilities.make_el_list(sorted_items, (SubLObject)numeric_quantification.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeric-quantification.lisp", position = 12339L)
    public static SubLObject cyc_sort_fn(final SubLObject v_set, final SubLObject comparison, final SubLObject function) {
        return cyc_sort(v_set, comparison, function);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeric-quantification.lisp", position = 12532L)
    public static SubLObject cyc_sort_item_group_tuples(SubLObject tuples, final SubLObject compare_pred, final SubLObject stableP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = numeric_quantification.$cyc_sort_compare_pred$.currentBinding(thread);
        try {
            numeric_quantification.$cyc_sort_compare_pred$.bind(compare_pred, thread);
            if (numeric_quantification.NIL != stableP) {
                tuples = conses_high.copy_list(tuples);
            }
            else {
                tuples = kb_utilities.sort_terms(tuples, (SubLObject)numeric_quantification.NIL, (SubLObject)numeric_quantification.NIL, (SubLObject)numeric_quantification.T, (SubLObject)numeric_quantification.NIL, Symbols.symbol_function((SubLObject)numeric_quantification.$sym23$FIRST), (SubLObject)numeric_quantification.UNPROVIDED);
            }
            tuples = Sort.stable_sort(tuples, (SubLObject)numeric_quantification.$sym26$CYC_SORT__, Symbols.symbol_function((SubLObject)numeric_quantification.$sym27$SECOND));
        }
        finally {
            numeric_quantification.$cyc_sort_compare_pred$.rebind(_prev_bind_0, thread);
        }
        return tuples;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeric-quantification.lisp", position = 13015L)
    public static SubLObject cyc_sort_L(final SubLObject term1, final SubLObject term2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject comparision = numeric_quantification.$cyc_sort_compare_pred$.getDynamicValue(thread);
        return numeric_quantification_compare(comparision, term1, term2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeric-quantification.lisp", position = 13182L)
    public static SubLObject numeric_quantification_compare(final SubLObject compare_pred, final SubLObject term1, final SubLObject term2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (compare_pred.eql(numeric_quantification.$const28$greaterThan)) {
            return arithmetic.cyc_greater_than(term1, term2);
        }
        if (compare_pred.eql(numeric_quantification.$const29$lessThan)) {
            return arithmetic.cyc_less_than(term1, term2);
        }
        final SubLObject sentence = el_utilities.make_binary_formula(compare_pred, term1, term2);
        if (numeric_quantification.NIL != relation_evaluation.evaluatable_predicateP(compare_pred, (SubLObject)numeric_quantification.UNPROVIDED)) {
            return relation_evaluation.cyc_evaluate(sentence);
        }
        final SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)numeric_quantification.UNPROVIDED, (SubLObject)numeric_quantification.UNPROVIDED, (SubLObject)numeric_quantification.UNPROVIDED, (SubLObject)numeric_quantification.UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject inverse_sentence = el_utilities.make_binary_formula(compare_pred, term2, term1);
                final SubLObject compareL = numeric_quantification_compare_recursive_query(sentence, mt, (SubLObject)numeric_quantification.UNPROVIDED);
                final SubLObject compareG = numeric_quantification_compare_recursive_query(inverse_sentence, mt, (SubLObject)numeric_quantification.UNPROVIDED);
                if ((numeric_quantification.NIL != compareL && numeric_quantification.NIL == compareG) || (numeric_quantification.NIL == compareL && numeric_quantification.NIL != compareG)) {
                    return compareL;
                }
                return kb_utilities.term_L(term1, term2, (SubLObject)numeric_quantification.T, (SubLObject)numeric_quantification.UNPROVIDED, (SubLObject)numeric_quantification.UNPROVIDED);
            }
            finally {
                final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)numeric_quantification.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeric-quantification.lisp", position = 14123L)
    public static SubLObject numeric_quantification_compare_recursive_query_internal(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == numeric_quantification.UNPROVIDED) {
            mt = (SubLObject)numeric_quantification.NIL;
        }
        if (query_properties == numeric_quantification.UNPROVIDED) {
            query_properties = (SubLObject)numeric_quantification.NIL;
        }
        return ask_utilities.recursive_query(sentence, mt, query_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeric-quantification.lisp", position = 14123L)
    public static SubLObject numeric_quantification_compare_recursive_query(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == numeric_quantification.UNPROVIDED) {
            mt = (SubLObject)numeric_quantification.NIL;
        }
        if (query_properties == numeric_quantification.UNPROVIDED) {
            query_properties = (SubLObject)numeric_quantification.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)numeric_quantification.NIL;
        if (numeric_quantification.NIL == v_memoization_state) {
            return numeric_quantification_compare_recursive_query_internal(sentence, mt, query_properties);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)numeric_quantification.$sym31$NUMERIC_QUANTIFICATION_COMPARE_RECURSIVE_QUERY, (SubLObject)numeric_quantification.UNPROVIDED);
        if (numeric_quantification.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)numeric_quantification.$sym31$NUMERIC_QUANTIFICATION_COMPARE_RECURSIVE_QUERY, (SubLObject)numeric_quantification.THREE_INTEGER, (SubLObject)numeric_quantification.$int32$8096, (SubLObject)numeric_quantification.EQUAL, (SubLObject)numeric_quantification.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)numeric_quantification.$sym31$NUMERIC_QUANTIFICATION_COMPARE_RECURSIVE_QUERY, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(sentence, mt, query_properties);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)numeric_quantification.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)numeric_quantification.NIL;
            collision = cdolist_list_var.first();
            while (numeric_quantification.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (sentence.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (numeric_quantification.NIL != cached_args && numeric_quantification.NIL == cached_args.rest() && query_properties.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(numeric_quantification_compare_recursive_query_internal(sentence, mt, query_properties)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(sentence, mt, query_properties));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeric-quantification.lisp", position = 14455L)
    public static SubLObject cyc_sort_set_via_bin_pred_fn(final SubLObject v_set, final SubLObject compare_pred) {
        return cyc_sort(v_set, compare_pred, numeric_quantification.$const2$IdentityFn);
    }
    
    public static SubLObject declare_numeric_quantification_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_quantification", "numeric_evaluate_all_unary", "NUMERIC-EVALUATE-ALL-UNARY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_quantification", "numeric_quantification_group_items", "NUMERIC-QUANTIFICATION-GROUP-ITEMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_quantification", "numeric_quantification_item_value_tuples", "NUMERIC-QUANTIFICATION-ITEM-VALUE-TUPLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_quantification", "numeric_quantification_item_values", "NUMERIC-QUANTIFICATION-ITEM-VALUES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_quantification", "numeric_quantification_apply_function", "NUMERIC-QUANTIFICATION-APPLY-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_quantification", "numeric_quantification_item_value_via_generalized_query", "NUMERIC-QUANTIFICATION-ITEM-VALUE-VIA-GENERALIZED-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_quantification", "compute_possible_numeric_quantification_value_formula", "COMPUTE-POSSIBLE-NUMERIC-QUANTIFICATION-VALUE-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_quantification", "compute_possible_numeric_quantification_value_formula_memoized_internal", "COMPUTE-POSSIBLE-NUMERIC-QUANTIFICATION-VALUE-FORMULA-MEMOIZED-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_quantification", "compute_possible_numeric_quantification_value_formula_memoized", "COMPUTE-POSSIBLE-NUMERIC-QUANTIFICATION-VALUE-FORMULA-MEMOIZED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_quantification", "the_set_of_element_value_via_generalized_query", "THE-SET-OF-ELEMENT-VALUE-VIA-GENERALIZED-QUERY", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_quantification", "compute_the_set_of_element_to_numeric_quant_value_map_internal", "COMPUTE-THE-SET-OF-ELEMENT-TO-NUMERIC-QUANT-VALUE-MAP-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_quantification", "compute_the_set_of_element_to_numeric_quant_value_map", "COMPUTE-THE-SET-OF-ELEMENT-TO-NUMERIC-QUANT-VALUE-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_quantification", "cyc_plus_all", "CYC-PLUS-ALL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_quantification", "cyc_plus_all_internal", "CYC-PLUS-ALL-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_quantification", "cyc_times_all", "CYC-TIMES-ALL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_quantification", "cyc_maximum", "CYC-MAXIMUM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_quantification", "cyc_minimum", "CYC-MINIMUM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_quantification", "cyc_average", "CYC-AVERAGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_quantification", "cyc_median", "CYC-MEDIAN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_quantification", "cyc_extreme_member", "CYC-EXTREME-MEMBER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_quantification", "possibly_optimize_tuples_wrt_compare_pred", "POSSIBLY-OPTIMIZE-TUPLES-WRT-COMPARE-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_quantification", "tuple_values_all_are_simply_uniform_quantitiesP", "TUPLE-VALUES-ALL-ARE-SIMPLY-UNIFORM-QUANTITIES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_quantification", "nsimplify_numeric_quantification_tuple_quantity_value", "NSIMPLIFY-NUMERIC-QUANTIFICATION-TUPLE-QUANTITY-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_quantification", "cyc_sort", "CYC-SORT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_quantification", "cyc_stable_sort", "CYC-STABLE-SORT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_quantification", "cyc_sort_item_group", "CYC-SORT-ITEM-GROUP", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_quantification", "cyc_sort_fn", "CYC-SORT-FN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_quantification", "cyc_sort_item_group_tuples", "CYC-SORT-ITEM-GROUP-TUPLES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_quantification", "cyc_sort_L", "CYC-SORT-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_quantification", "numeric_quantification_compare", "NUMERIC-QUANTIFICATION-COMPARE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_quantification", "numeric_quantification_compare_recursive_query_internal", "NUMERIC-QUANTIFICATION-COMPARE-RECURSIVE-QUERY-INTERNAL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_quantification", "numeric_quantification_compare_recursive_query", "NUMERIC-QUANTIFICATION-COMPARE-RECURSIVE-QUERY", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_quantification", "cyc_sort_set_via_bin_pred_fn", "CYC-SORT-SET-VIA-BIN-PRED-FN", 2, 0, false);
        return (SubLObject)numeric_quantification.NIL;
    }
    
    public static SubLObject init_numeric_quantification_file() {
        numeric_quantification.$partial_numeric_quantification$ = SubLFiles.deflexical("*PARTIAL-NUMERIC-QUANTIFICATION*", (SubLObject)numeric_quantification.T);
        numeric_quantification.$numeric_quantification_function$ = SubLFiles.defparameter("*NUMERIC-QUANTIFICATION-FUNCTION*", (SubLObject)numeric_quantification.NIL);
        numeric_quantification.$cyc_sort_compare_pred$ = SubLFiles.defparameter("*CYC-SORT-COMPARE-PRED*", (SubLObject)numeric_quantification.NIL);
        return (SubLObject)numeric_quantification.NIL;
    }
    
    public static SubLObject setup_numeric_quantification_file() {
        memoization_state.note_memoized_function((SubLObject)numeric_quantification.$sym3$COMPUTE_POSSIBLE_NUMERIC_QUANTIFICATION_VALUE_FORMULA_MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)numeric_quantification.$sym7$COMPUTE_THE_SET_OF_ELEMENT_TO_NUMERIC_QUANT_VALUE_MAP);
        utilities_macros.register_kb_function((SubLObject)numeric_quantification.$sym9$CYC_PLUS_ALL);
        utilities_macros.register_kb_function((SubLObject)numeric_quantification.$sym10$CYC_TIMES_ALL);
        utilities_macros.register_kb_function((SubLObject)numeric_quantification.$sym11$CYC_MAXIMUM);
        utilities_macros.register_kb_function((SubLObject)numeric_quantification.$sym12$CYC_MINIMUM);
        utilities_macros.register_kb_function((SubLObject)numeric_quantification.$sym13$CYC_AVERAGE);
        utilities_macros.register_kb_function((SubLObject)numeric_quantification.$sym15$CYC_MEDIAN);
        utilities_macros.register_kb_function((SubLObject)numeric_quantification.$sym17$CYC_EXTREME_MEMBER);
        utilities_macros.note_funcall_helper_function((SubLObject)numeric_quantification.$sym19$NSIMPLIFY_NUMERIC_QUANTIFICATION_TUPLE_QUANTITY_VALUE);
        utilities_macros.register_kb_function((SubLObject)numeric_quantification.$sym21$CYC_SORT);
        utilities_macros.register_kb_function((SubLObject)numeric_quantification.$sym22$CYC_STABLE_SORT);
        access_macros.define_obsolete_register((SubLObject)numeric_quantification.$sym24$CYC_SORT_FN, (SubLObject)numeric_quantification.$list25);
        utilities_macros.note_funcall_helper_function((SubLObject)numeric_quantification.$sym26$CYC_SORT__);
        memoization_state.note_memoized_function((SubLObject)numeric_quantification.$sym31$NUMERIC_QUANTIFICATION_COMPARE_RECURSIVE_QUERY);
        utilities_macros.register_kb_function((SubLObject)numeric_quantification.$sym33$CYC_SORT_SET_VIA_BIN_PRED_FN);
        return (SubLObject)numeric_quantification.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_numeric_quantification_file();
    }
    
    @Override
	public void initializeVariables() {
        init_numeric_quantification_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_numeric_quantification_file();
    }
    
    static {
        me = (SubLFile)new numeric_quantification();
        numeric_quantification.$partial_numeric_quantification$ = null;
        numeric_quantification.$numeric_quantification_function$ = null;
        numeric_quantification.$cyc_sort_compare_pred$ = null;
        $str0$A_KB_dependent_numerical_quantifi = SubLObjectFactory.makeString("A KB-dependent numerical quantification function was called, but the current Cyc KB does not contain knowledge about numerical quantification.");
        $kw1$HL = SubLObjectFactory.makeKeyword("HL");
        $const2$IdentityFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IdentityFn"));
        $sym3$COMPUTE_POSSIBLE_NUMERIC_QUANTIFICATION_VALUE_FORMULA_MEMOIZED = SubLObjectFactory.makeSymbol("COMPUTE-POSSIBLE-NUMERIC-QUANTIFICATION-VALUE-FORMULA-MEMOIZED");
        $sym4$_NQVAL = SubLObjectFactory.makeSymbol("?NQVAL");
        $kw5$ARG1 = SubLObjectFactory.makeKeyword("ARG1");
        $kw6$ARG2 = SubLObjectFactory.makeKeyword("ARG2");
        $sym7$COMPUTE_THE_SET_OF_ELEMENT_TO_NUMERIC_QUANT_VALUE_MAP = SubLObjectFactory.makeSymbol("COMPUTE-THE-SET-OF-ELEMENT-TO-NUMERIC-QUANT-VALUE-MAP");
        $int8$100 = SubLObjectFactory.makeInteger(100);
        $sym9$CYC_PLUS_ALL = SubLObjectFactory.makeSymbol("CYC-PLUS-ALL");
        $sym10$CYC_TIMES_ALL = SubLObjectFactory.makeSymbol("CYC-TIMES-ALL");
        $sym11$CYC_MAXIMUM = SubLObjectFactory.makeSymbol("CYC-MAXIMUM");
        $sym12$CYC_MINIMUM = SubLObjectFactory.makeSymbol("CYC-MINIMUM");
        $sym13$CYC_AVERAGE = SubLObjectFactory.makeSymbol("CYC-AVERAGE");
        $sym14$CYC_LESS_THAN = SubLObjectFactory.makeSymbol("CYC-LESS-THAN");
        $sym15$CYC_MEDIAN = SubLObjectFactory.makeSymbol("CYC-MEDIAN");
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE-ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE-VALUE"));
        $sym17$CYC_EXTREME_MEMBER = SubLObjectFactory.makeSymbol("CYC-EXTREME-MEMBER");
        $list18 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("greaterThan")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("lessThan")));
        $sym19$NSIMPLIFY_NUMERIC_QUANTIFICATION_TUPLE_QUANTITY_VALUE = SubLObjectFactory.makeSymbol("NSIMPLIFY-NUMERIC-QUANTIFICATION-TUPLE-QUANTITY-VALUE");
        $list20 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("FIRST-TUPLE"), (SubLObject)SubLObjectFactory.makeSymbol("REST-TUPLES"));
        $sym21$CYC_SORT = SubLObjectFactory.makeSymbol("CYC-SORT");
        $sym22$CYC_STABLE_SORT = SubLObjectFactory.makeSymbol("CYC-STABLE-SORT");
        $sym23$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym24$CYC_SORT_FN = SubLObjectFactory.makeSymbol("CYC-SORT-FN");
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-SORT"));
        $sym26$CYC_SORT__ = SubLObjectFactory.makeSymbol("CYC-SORT-<");
        $sym27$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $const28$greaterThan = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("greaterThan"));
        $const29$lessThan = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("lessThan"));
        $sym30$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $sym31$NUMERIC_QUANTIFICATION_COMPARE_RECURSIVE_QUERY = SubLObjectFactory.makeSymbol("NUMERIC-QUANTIFICATION-COMPARE-RECURSIVE-QUERY");
        $int32$8096 = SubLObjectFactory.makeInteger(8096);
        $sym33$CYC_SORT_SET_VIA_BIN_PRED_FN = SubLObjectFactory.makeSymbol("CYC-SORT-SET-VIA-BIN-PRED-FN");
    }
}
