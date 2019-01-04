package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class reformulator_hub extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.reformulator_hub";
    public static final String myFingerPrint = "f9cd1a8c2151237e1ea914a391053434e6c82ff713050ffabcf3b3ae161c1bdd";
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 10814L)
    private static SubLSymbol $reformulator_timeout_time$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 17307L)
    private static SubLSymbol $all_kb_modal_operators_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 21339L)
    private static SubLSymbol $rl_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 21388L)
    private static SubLSymbol $rl_old$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 21511L)
    private static SubLSymbol $rl_new$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 23854L)
    private static SubLSymbol $ref_trace_level$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 29859L)
    private static SubLSymbol $ignore_modules_unless_focussed$;
    private static final SubLSymbol $sym0$VARIABLE_P;
    private static final SubLString $str1$The_expression__s_contains_an_HL_;
    private static final SubLString $str2$reformulate_cycl_cannot_be_called;
    private static final SubLSymbol $kw3$TRUE;
    private static final SubLSymbol $kw4$FALSE;
    private static final SubLSymbol $kw5$UNLESS_REWRITE_OF;
    private static final SubLSymbol $sym6$MEMOIZATION_STATE_P;
    private static final SubLSymbol $kw7$MAX_TIME;
    private static final SubLSymbol $kw8$ILL_FORMED;
    private static final SubLSymbol $sym9$ALL_KB_MODAL_OPERATORS;
    private static final SubLObject $const10$ModalOperator;
    private static final SubLObject $const11$UniversalVocabularyMt;
    private static final SubLSymbol $sym12$_ALL_KB_MODAL_OPERATORS_CACHING_STATE_;
    private static final SubLString $str13$The_reformulator_currently_cannot;
    private static final SubLSymbol $kw14$NONE;
    private static final SubLSymbol $sym15$CONTAINS_OLD_RL_;
    private static final SubLSymbol $sym16$SUBST_NEW_RL;
    private static final SubLSymbol $sym17$REFORMULATE_EXPRESSION;
    private static final SubLSymbol $kw18$APPLY_FIRST_RECURSIVELY;
    private static final SubLInteger $int19$64;
    private static final SubLSymbol $kw20$FOCUS;
    private static final SubLSymbol $kw21$IGNORE;
    private static final SubLList $list22;
    private static final SubLSymbol $sym23$_;
    private static final SubLSymbol $sym24$CDR;
    private static final SubLSymbol $sym25$CANONICALIZE_REFORMULATOR_EXPRESSION_CACHED;
    private static final SubLSymbol $kw26$ALL;
    private static final SubLSymbol $kw27$ARITY;
    private static final SubLSymbol $kw28$KB;
    private static final SubLObject $const29$reformulatorEquals;
    private static final SubLObject $const30$reformulatorEquiv;
    private static final SubLSymbol $sym31$FIRST;
    private static final SubLSymbol $sym32$UNCANONICALIZE_RL_EXPRESSION_CACHED;
    private static final SubLSymbol $sym33$RELEVANT_MT_IS_GENL_MT;
    private static final SubLSymbol $sym34$RL_EVALUATABLE_EXPRESSION_;
    private static final SubLSymbol $sym35$TRANSFORM_EVALUATION_EXPRESSION;
    private static final SubLObject $const36$evaluateAtEL;
    private static final SubLSymbol $sym37$RL_UNEVALUATABLE_EXPRESSION_;
    private static final SubLString $str38$All___s__Arity___s__KB___s__None_;
    private static final SubLString $str39$Average_number_of_FORTs_mentioned;
    private static final SubLString $str40$RL_EL_mismatch_substitution;
    private static final SubLString $str41$Restrict_reformulation_inside_mod;
    private static final SubLString $str42$Uniquify_variables;
    private static final SubLString $str43$reformulator_hub_test_suite;
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 8570L)
    public static SubLObject reformulate_cycl(final SubLObject expression, SubLObject mt, SubLObject settings) {
        if (mt == reformulator_hub.UNPROVIDED) {
            mt = (SubLObject)reformulator_hub.NIL;
        }
        if (settings == reformulator_hub.UNPROVIDED) {
            settings = (SubLObject)reformulator_hub.NIL;
        }
        if (reformulator_hub.NIL != cycl_utilities.expression_find_if(Symbols.symbol_function((SubLObject)reformulator_hub.$sym0$VARIABLE_P), expression, (SubLObject)reformulator_hub.NIL, (SubLObject)reformulator_hub.UNPROVIDED)) {
            ref_warn((SubLObject)reformulator_hub.ONE_INTEGER, (SubLObject)reformulator_hub.$str1$The_expression__s_contains_an_HL_, expression, (SubLObject)reformulator_hub.UNPROVIDED, (SubLObject)reformulator_hub.UNPROVIDED, (SubLObject)reformulator_hub.UNPROVIDED, (SubLObject)reformulator_hub.UNPROVIDED);
            return (SubLObject)reformulator_hub.NIL;
        }
        if (reformulator_hub.NIL == kb_control_vars.reformulator_kb_loaded_p()) {
            Errors.error((SubLObject)reformulator_hub.$str2$reformulate_cycl_cannot_be_called);
        }
        reformulator_datastructures.ensure_reformulator_initialized();
        final SubLObject fixed_settings = reformulator_datastructures.fix_invalid_settings(settings, mt);
        final SubLObject clear_cachesP = reformulator_datastructures.get_clear_reformulator_cachesP(fixed_settings);
        if (reformulator_hub.$kw3$TRUE == clear_cachesP) {
            reformulator_datastructures.clear_reformulator_caches();
        }
        return reformulate_cycl_int(expression, mt, fixed_settings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 10463L)
    public static SubLObject reformulate_atoms_criterion_metP(final SubLObject expression, final SubLObject settings) {
        if (reformulator_hub.NIL == el_utilities.el_formula_p(expression)) {
            final SubLObject pcase_var;
            final SubLObject reformulate_atomsP = pcase_var = reformulator_datastructures.get_reformulate_atomsP(settings);
            if (pcase_var.eql((SubLObject)reformulator_hub.$kw3$TRUE)) {
                return (SubLObject)reformulator_hub.T;
            }
            if (pcase_var.eql((SubLObject)reformulator_hub.$kw4$FALSE)) {
                return (SubLObject)reformulator_hub.NIL;
            }
            if (pcase_var.eql((SubLObject)reformulator_hub.$kw5$UNLESS_REWRITE_OF)) {
                return equality_store.some_source_rewrite_of_assertions_somewhereP(expression);
            }
        }
        return (SubLObject)reformulator_hub.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 11039L)
    public static SubLObject reformulator_timeout_time(final SubLObject settings) {
        final SubLObject delay_in_seconds = reformulator_datastructures.get_max_time(settings);
        return (SubLObject)((reformulator_hub.NIL != delay_in_seconds) ? Numbers.add(Time.get_internal_real_time(), Numbers.floor(Numbers.multiply(delay_in_seconds, time_high.$internal_time_units_per_second$.getGlobalValue()), (SubLObject)reformulator_hub.UNPROVIDED)) : reformulator_hub.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 11443L)
    public static SubLObject reformulate_cycl_int(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject return_values = (SubLObject)reformulator_hub.NIL;
        SubLObject number_of_reformulations = (SubLObject)reformulator_hub.ZERO_INTEGER;
        SubLObject previous_rl_expr = (SubLObject)reformulator_hub.NIL;
        SubLObject new_expression = (SubLObject)reformulator_hub.NIL;
        SubLObject reformulation_history = (SubLObject)reformulator_hub.NIL;
        SubLObject original_clause = (SubLObject)reformulator_hub.NIL;
        final SubLObject _prev_bind_0 = reformulator_hub.$reformulator_timeout_time$.currentBinding(thread);
        try {
            reformulator_hub.$reformulator_timeout_time$.bind(reformulator_timeout_time(settings), thread);
            if (reformulator_hub.NIL != reformulate_atoms_criterion_metP(expression, settings)) {
                final SubLObject v_memoization_state = reformulator_datastructures.find_or_create_reformulator_memoization_state();
                assert reformulator_hub.NIL != memoization_state.memoization_state_p(v_memoization_state) : v_memoization_state;
                final SubLObject _prev_bind_0_$1 = reformulator_datastructures.$reformulator_memoization_state$.currentBinding(thread);
                try {
                    reformulator_datastructures.$reformulator_memoization_state$.bind(v_memoization_state, thread);
                    final SubLObject local_state = reformulator_datastructures.$reformulator_memoization_state$.getDynamicValue(thread);
                    final SubLObject _prev_bind_0_$2 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                        try {
                            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_relevance_macros.determine_inference_mt_relevance_el_spec(mt));
                            final SubLObject _prev_bind_0_$3 = mt_relevance_macros.$mt$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                final SubLObject recursion_limit = reformulator_datastructures.get_recursion_limit(settings);
                                final SubLObject reformulate_subformulasP = reformulator_datastructures.get_reformulate_subformulasP(settings);
                                final SubLObject wff_degree = reformulator_datastructures.get_wff_enforcement(settings);
                                SubLObject doneP = (SubLObject)reformulator_hub.NIL;
                                SubLObject stack = (SubLObject)reformulator_hub.NIL;
                                final SubLObject modal_operator_if_any = possible_modal(expression);
                                if (reformulator_hub.NIL != modal_operator_if_any) {
                                    final SubLObject non_modal_expression = cycl_utilities.formula_arg1(expression, (SubLObject)reformulator_hub.UNPROVIDED);
                                    previous_rl_expr = canonicalize_reformulator_expression_cached(non_modal_expression, mt, (SubLObject)reformulator_hub.NIL, wff_degree);
                                }
                                else {
                                    previous_rl_expr = canonicalize_reformulator_expression_cached(expression, mt, (SubLObject)reformulator_hub.NIL, wff_degree);
                                }
                                original_clause = previous_rl_expr;
                                if (reformulator_hub.NIL != previous_rl_expr) {
                                    while (reformulator_hub.NIL == doneP && number_of_reformulations.numLE(recursion_limit)) {
                                        thread.resetMultipleValues();
                                        final SubLObject thrown_old_expr = reformulate_expression(previous_rl_expr, previous_rl_expr, original_clause, mt, settings, Equality.eql((SubLObject)reformulator_hub.$kw3$TRUE, reformulate_subformulasP));
                                        final SubLObject thrown_new_expr = thread.secondMultipleValue();
                                        final SubLObject thrown_justification = thread.thirdMultipleValue();
                                        thread.resetMultipleValues();
                                        if (reformulator_hub.NIL == thrown_justification) {
                                            doneP = (SubLObject)reformulator_hub.T;
                                        }
                                        else {
                                            new_expression = reformulator_subst(thrown_new_expr, thrown_old_expr, previous_rl_expr, mt);
                                            if (reformulator_hub.NIL != Sequences.find(new_expression, stack, Symbols.symbol_function((SubLObject)reformulator_hub.EQUALP), (SubLObject)reformulator_hub.UNPROVIDED, (SubLObject)reformulator_hub.UNPROVIDED, (SubLObject)reformulator_hub.UNPROVIDED)) {
                                                doneP = (SubLObject)reformulator_hub.T;
                                            }
                                            else {
                                                stack = (SubLObject)ConsesLow.cons(new_expression, stack);
                                                reformulation_history = (SubLObject)ConsesLow.cons(construct_reformulation_step(thrown_old_expr, thrown_new_expr, thrown_justification), reformulation_history);
                                                number_of_reformulations = Numbers.add(number_of_reformulations, (SubLObject)reformulator_hub.ONE_INTEGER);
                                                previous_rl_expr = (original_clause = new_expression);
                                                new_expression = (SubLObject)reformulator_hub.NIL;
                                            }
                                        }
                                        if (reformulator_hub.NIL != reformulator_hub.$reformulator_timeout_time$.getDynamicValue(thread) && Time.get_internal_real_time().numG(reformulator_hub.$reformulator_timeout_time$.getDynamicValue(thread))) {
                                            doneP = (SubLObject)reformulator_hub.T;
                                        }
                                    }
                                    previous_rl_expr = uncanonicalize_rl_expression_cached(previous_rl_expr, mt);
                                    if (reformulator_hub.NIL != modal_operator_if_any) {
                                        previous_rl_expr = (SubLObject)ConsesLow.list(modal_operator_if_any, previous_rl_expr);
                                    }
                                }
                            }
                            finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$3, thread);
                            }
                            reformulation_history = Sequences.reverse(reformulation_history);
                            if (reformulator_hub.$kw3$TRUE == reformulator_datastructures.get_eliminate_transitivity_in_reformulation_historyP(settings)) {
                                reformulation_history = eliminate_transitivity_in_reformulation_history(reformulation_history);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)reformulator_hub.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                            }
                        }
                    }
                    finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0_$2, thread);
                    }
                }
                finally {
                    reformulator_datastructures.$reformulator_memoization_state$.rebind(_prev_bind_0_$1, thread);
                }
            }
            final SubLObject timed_out_return_value = (SubLObject)((reformulator_hub.NIL != reformulator_hub.$reformulator_timeout_time$.getDynamicValue(thread) && Time.get_internal_real_time().numG(reformulator_hub.$reformulator_timeout_time$.getDynamicValue(thread))) ? reformulator_hub.$kw7$MAX_TIME : reformulator_hub.NIL);
            if (number_of_reformulations.isPositive()) {
                return_values = (SubLObject)ConsesLow.list(previous_rl_expr, reformulation_history, timed_out_return_value);
            }
            else if (reformulator_hub.NIL == previous_rl_expr) {
                return_values = (SubLObject)ConsesLow.list(expression, (SubLObject)reformulator_hub.$kw8$ILL_FORMED, timed_out_return_value);
            }
            else {
                return_values = (SubLObject)ConsesLow.list(previous_rl_expr, (SubLObject)reformulator_hub.NIL, timed_out_return_value);
            }
        }
        finally {
            reformulator_hub.$reformulator_timeout_time$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.values_list(return_values);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 15220L)
    public static SubLObject eliminate_transitivity_in_reformulation_history(final SubLObject reformulation_history) {
        SubLObject result = (SubLObject)reformulator_hub.NIL;
        SubLObject cdolist_list_var = reformulation_history;
        SubLObject reformulation_step = (SubLObject)reformulator_hub.NIL;
        reformulation_step = cdolist_list_var.first();
        while (reformulator_hub.NIL != cdolist_list_var) {
            final SubLObject original = reformulation_step_struct_expression(reformulation_step);
            final SubLObject reformulation = reformulation_step_struct_result(reformulation_step);
            final SubLObject justification = reformulation_step_struct_justification(reformulation_step);
            SubLObject result_changedP = (SubLObject)reformulator_hub.NIL;
            SubLObject cdolist_list_var_$5 = result;
            SubLObject result_step = (SubLObject)reformulator_hub.NIL;
            result_step = cdolist_list_var_$5.first();
            while (reformulator_hub.NIL != cdolist_list_var_$5) {
                final SubLObject result_original = reformulation_step_struct_expression(result_step);
                final SubLObject result_reformulation = reformulation_step_struct_result(result_step);
                final SubLObject result_justification = reformulation_step_struct_justification(result_step);
                if (original.equalp(result_reformulation)) {
                    result_changedP = (SubLObject)reformulator_hub.T;
                    final SubLObject new_result_step = (SubLObject)ConsesLow.list(result_original, reformulation, ConsesLow.append(result_justification, justification));
                    result = conses_high.subst(new_result_step, result_step, result, (SubLObject)reformulator_hub.EQUALP, (SubLObject)reformulator_hub.UNPROVIDED);
                }
                cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                result_step = cdolist_list_var_$5.first();
            }
            if (reformulator_hub.NIL == result_changedP) {
                result = (SubLObject)ConsesLow.cons(reformulation_step, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            reformulation_step = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 16580L)
    public static SubLObject reformulator_subst(final SubLObject v_new, final SubLObject old, final SubLObject expression, final SubLObject mt) {
        if (old.equal(expression)) {
            return recanonicalize_rl_expression(v_new, mt);
        }
        final SubLObject uncanon_new = (reformulator_hub.NIL != clauses.clauses_p(v_new)) ? uncanonicalize_rl_expression_cached(v_new, mt) : v_new;
        SubLObject new_expression = (SubLObject)reformulator_hub.NIL;
        if (reformulator_hub.NIL != clauses.clauses_p(v_new) && reformulator_hub.NIL != clauses.clauses_p(old) && reformulator_hub.NIL != clauses.clauses_p(expression)) {
            new_expression = rl_clauses_merge_subst(v_new, old, expression, mt);
        }
        else {
            new_expression = cycl_utilities.expression_subst(uncanon_new, old, expression, Symbols.symbol_function((SubLObject)reformulator_hub.EQUAL), (SubLObject)reformulator_hub.UNPROVIDED);
        }
        if (expression.equal(new_expression)) {
            new_expression = nested_rl_expression_subst(uncanon_new, old, expression, mt);
        }
        return recanonicalize_rl_expression(new_expression, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 17307L)
    public static SubLObject clear_all_kb_modal_operators() {
        final SubLObject cs = reformulator_hub.$all_kb_modal_operators_caching_state$.getGlobalValue();
        if (reformulator_hub.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)reformulator_hub.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 17307L)
    public static SubLObject remove_all_kb_modal_operators() {
        return memoization_state.caching_state_remove_function_results_with_args(reformulator_hub.$all_kb_modal_operators_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(reformulator_hub.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)reformulator_hub.UNPROVIDED, (SubLObject)reformulator_hub.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 17307L)
    public static SubLObject all_kb_modal_operators_internal() {
        return isa.all_fort_instances(reformulator_hub.$const10$ModalOperator, reformulator_hub.$const11$UniversalVocabularyMt, (SubLObject)reformulator_hub.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 17307L)
    public static SubLObject all_kb_modal_operators() {
        SubLObject caching_state = reformulator_hub.$all_kb_modal_operators_caching_state$.getGlobalValue();
        if (reformulator_hub.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)reformulator_hub.$sym9$ALL_KB_MODAL_OPERATORS, (SubLObject)reformulator_hub.$sym12$_ALL_KB_MODAL_OPERATORS_CACHING_STATE_, (SubLObject)reformulator_hub.NIL, (SubLObject)reformulator_hub.EQ, (SubLObject)reformulator_hub.ZERO_INTEGER, (SubLObject)reformulator_hub.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)reformulator_hub.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(all_kb_modal_operators_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)reformulator_hub.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 17439L)
    public static SubLObject possible_modal(final SubLObject expression) {
        if (reformulator_hub.NIL != el_utilities.el_formula_p(expression)) {
            final SubLObject operator = cycl_utilities.formula_operator(expression);
            if (reformulator_hub.NIL != subl_promotions.memberP(operator, all_kb_modal_operators(), (SubLObject)reformulator_hub.UNPROVIDED, (SubLObject)reformulator_hub.UNPROVIDED)) {
                return operator;
            }
        }
        return (SubLObject)reformulator_hub.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 17906L)
    public static SubLObject rl_clauses_merge_subst(final SubLObject new_clauses, final SubLObject old_clauses, final SubLObject all_clauses, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (reformulator_hub.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (reformulator_hub.NIL == list_utilities.singletonP(old_clauses) || reformulator_hub.NIL == clause_utilities.pos_atomic_cnf_p(old_clauses.first()))) {
            Errors.error((SubLObject)reformulator_hub.$str13$The_reformulator_currently_cannot);
        }
        SubLObject result_clauses = (SubLObject)reformulator_hub.NIL;
        final SubLObject old_lit = clause_utilities.gaf_cnf_literal(old_clauses.first());
        if (reformulator_hub.NIL != list_utilities.singletonP(new_clauses)) {
            final SubLObject new_pos_lits = clauses.pos_lits(new_clauses.first());
            final SubLObject new_neg_lits = clauses.neg_lits(new_clauses.first());
            SubLObject cdolist_list_var = all_clauses;
            SubLObject clause = (SubLObject)reformulator_hub.NIL;
            clause = cdolist_list_var.first();
            while (reformulator_hub.NIL != cdolist_list_var) {
                SubLObject result_pos_lits = (SubLObject)reformulator_hub.NIL;
                SubLObject result_neg_lits = (SubLObject)reformulator_hub.NIL;
                SubLObject cdolist_list_var_$6 = clauses.pos_lits(clause);
                SubLObject pos_lit = (SubLObject)reformulator_hub.NIL;
                pos_lit = cdolist_list_var_$6.first();
                while (reformulator_hub.NIL != cdolist_list_var_$6) {
                    if (pos_lit.equal(old_lit)) {
                        if (reformulator_hub.NIL != new_pos_lits) {
                            result_pos_lits = ConsesLow.append(result_pos_lits, new_pos_lits);
                        }
                    }
                    else {
                        result_pos_lits = (SubLObject)ConsesLow.cons(pos_lit, result_pos_lits);
                    }
                    cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                    pos_lit = cdolist_list_var_$6.first();
                }
                SubLObject cdolist_list_var_$7 = clauses.neg_lits(clause);
                SubLObject neg_lit = (SubLObject)reformulator_hub.NIL;
                neg_lit = cdolist_list_var_$7.first();
                while (reformulator_hub.NIL != cdolist_list_var_$7) {
                    if (neg_lit.equal(old_lit)) {
                        if (reformulator_hub.NIL != list_utilities.sublisp_boolean(new_neg_lits)) {
                            result_neg_lits = ConsesLow.append(result_neg_lits, new_neg_lits);
                        }
                        else if (reformulator_hub.NIL != list_utilities.sublisp_boolean(new_pos_lits)) {
                            result_neg_lits = ConsesLow.append(result_neg_lits, new_pos_lits);
                        }
                    }
                    else {
                        result_neg_lits = (SubLObject)ConsesLow.cons(neg_lit, result_neg_lits);
                    }
                    cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                    neg_lit = cdolist_list_var_$7.first();
                }
                if (reformulator_hub.NIL != result_pos_lits || reformulator_hub.NIL != result_neg_lits) {
                    result_clauses = (SubLObject)ConsesLow.cons(clauses.make_cnf(Sequences.reverse(result_neg_lits), Sequences.reverse(result_pos_lits)), result_clauses);
                }
                cdolist_list_var = cdolist_list_var.rest();
                clause = cdolist_list_var.first();
            }
        }
        else {
            SubLObject old_lit_not_aloneP = (SubLObject)reformulator_hub.NIL;
            if (reformulator_hub.NIL == old_lit_not_aloneP) {
                SubLObject csome_list_var = all_clauses;
                SubLObject clause2 = (SubLObject)reformulator_hub.NIL;
                clause2 = csome_list_var.first();
                while (reformulator_hub.NIL == old_lit_not_aloneP && reformulator_hub.NIL != csome_list_var) {
                    SubLObject result_pos_lits2 = (SubLObject)reformulator_hub.NIL;
                    SubLObject result_neg_lits2 = (SubLObject)reformulator_hub.NIL;
                    SubLObject saw_old_lit_this_clauseP = (SubLObject)reformulator_hub.NIL;
                    SubLObject saw_non_old_lit_this_clauseP = (SubLObject)reformulator_hub.NIL;
                    SubLObject cdolist_list_var2 = clauses.pos_lits(clause2);
                    SubLObject pos_lit2 = (SubLObject)reformulator_hub.NIL;
                    pos_lit2 = cdolist_list_var2.first();
                    while (reformulator_hub.NIL != cdolist_list_var2) {
                        if (pos_lit2.equal(old_lit)) {
                            saw_old_lit_this_clauseP = (SubLObject)reformulator_hub.T;
                        }
                        else {
                            saw_non_old_lit_this_clauseP = (SubLObject)reformulator_hub.T;
                            result_pos_lits2 = (SubLObject)ConsesLow.cons(pos_lit2, result_pos_lits2);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        pos_lit2 = cdolist_list_var2.first();
                    }
                    cdolist_list_var2 = clauses.neg_lits(clause2);
                    SubLObject neg_lit2 = (SubLObject)reformulator_hub.NIL;
                    neg_lit2 = cdolist_list_var2.first();
                    while (reformulator_hub.NIL != cdolist_list_var2) {
                        if (neg_lit2.equal(old_lit)) {
                            saw_old_lit_this_clauseP = (SubLObject)reformulator_hub.T;
                        }
                        else {
                            saw_non_old_lit_this_clauseP = (SubLObject)reformulator_hub.T;
                            result_neg_lits2 = (SubLObject)ConsesLow.cons(neg_lit2, result_neg_lits2);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        neg_lit2 = cdolist_list_var2.first();
                    }
                    if (reformulator_hub.NIL != saw_old_lit_this_clauseP && reformulator_hub.NIL != saw_non_old_lit_this_clauseP) {
                        old_lit_not_aloneP = (SubLObject)reformulator_hub.T;
                    }
                    if (reformulator_hub.NIL != result_pos_lits2 || reformulator_hub.NIL != result_neg_lits2) {
                        result_clauses = (SubLObject)ConsesLow.cons(clauses.make_cnf(Sequences.reverse(result_neg_lits2), Sequences.reverse(result_pos_lits2)), result_clauses);
                    }
                    csome_list_var = csome_list_var.rest();
                    clause2 = csome_list_var.first();
                }
            }
            if (reformulator_hub.NIL == old_lit_not_aloneP) {
                result_clauses = ConsesLow.append(result_clauses, new_clauses);
            }
            else {
                result_clauses = (SubLObject)reformulator_hub.NIL;
                final SubLObject el_all = uncanonicalize_rl_expression_cached(all_clauses, mt);
                final SubLObject el_new = uncanonicalize_rl_expression_cached(new_clauses, mt);
                final SubLObject el_result = cycl_utilities.expression_subst(el_new, old_lit, el_all, Symbols.symbol_function((SubLObject)reformulator_hub.EQUAL), (SubLObject)reformulator_hub.UNPROVIDED);
                result_clauses = canonicalize_reformulator_expression(el_result, mt, (SubLObject)reformulator_hub.NIL, (SubLObject)reformulator_hub.$kw14$NONE, (SubLObject)reformulator_hub.UNPROVIDED);
            }
        }
        return Sequences.reverse(result_clauses);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 21547L)
    public static SubLObject nested_rl_expression_subst(final SubLObject uncanon_new, final SubLObject old, final SubLObject expression, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)reformulator_hub.NIL;
        final SubLObject _prev_bind_0 = reformulator_hub.$rl_mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = reformulator_hub.$rl_old$.currentBinding(thread);
        final SubLObject _prev_bind_3 = reformulator_hub.$rl_new$.currentBinding(thread);
        try {
            reformulator_hub.$rl_mt$.bind(mt, thread);
            reformulator_hub.$rl_old$.bind((reformulator_hub.NIL != clauses.clauses_p(old)) ? old : recanonicalize_rl_expression(old, reformulator_hub.$rl_mt$.getDynamicValue(thread)), thread);
            reformulator_hub.$rl_new$.bind(uncanon_new, thread);
            result = cycl_utilities.expression_transform(expression, (SubLObject)reformulator_hub.$sym15$CONTAINS_OLD_RL_, (SubLObject)reformulator_hub.$sym16$SUBST_NEW_RL, (SubLObject)reformulator_hub.UNPROVIDED, (SubLObject)reformulator_hub.UNPROVIDED);
        }
        finally {
            reformulator_hub.$rl_new$.rebind(_prev_bind_3, thread);
            reformulator_hub.$rl_old$.rebind(_prev_bind_2, thread);
            reformulator_hub.$rl_mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 22091L)
    public static SubLObject contains_old_rlP(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (expression.equal(reformulator_hub.$rl_new$.getDynamicValue(thread))) {
            return (SubLObject)reformulator_hub.NIL;
        }
        final SubLObject canon_expression = recanonicalize_rl_expression(expression, reformulator_hub.$rl_mt$.getDynamicValue(thread));
        if (reformulator_hub.NIL != clauses.clauses_p(canon_expression) && reformulator_hub.NIL != clauses.clauses_p(reformulator_hub.$rl_old$.getDynamicValue(thread))) {
            return conses_high.subsetp(reformulator_hub.$rl_old$.getDynamicValue(thread), canon_expression, Symbols.symbol_function((SubLObject)reformulator_hub.EQUAL), (SubLObject)reformulator_hub.UNPROVIDED);
        }
        return list_utilities.sublisp_boolean(cycl_utilities.expression_find(reformulator_hub.$rl_old$.getDynamicValue(thread), canon_expression, (SubLObject)reformulator_hub.NIL, (SubLObject)reformulator_hub.UNPROVIDED, (SubLObject)reformulator_hub.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 22464L)
    public static SubLObject subst_new_rl(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject canon_expression = recanonicalize_rl_expression(expression, reformulator_hub.$rl_mt$.getDynamicValue(thread));
        final SubLObject canon_old = (reformulator_hub.NIL != clauses.clauses_p(reformulator_hub.$rl_old$.getDynamicValue(thread))) ? reformulator_hub.$rl_old$.getDynamicValue(thread) : recanonicalize_rl_expression(reformulator_hub.$rl_old$.getDynamicValue(thread), reformulator_hub.$rl_mt$.getDynamicValue(thread));
        final SubLObject canon_new = recanonicalize_rl_expression(reformulator_hub.$rl_new$.getDynamicValue(thread), reformulator_hub.$rl_mt$.getDynamicValue(thread));
        if (reformulator_hub.NIL != clauses.clauses_p(canon_new) && reformulator_hub.NIL != clauses.clauses_p(canon_old) && reformulator_hub.NIL != clauses.clauses_p(canon_expression)) {
            return uncanonicalize_rl_expression(rl_clauses_merge_subst(canon_new, canon_old, canon_expression, reformulator_hub.$rl_mt$.getDynamicValue(thread)), reformulator_hub.$rl_mt$.getDynamicValue(thread));
        }
        return (SubLObject)reformulator_hub.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 22967L)
    public static SubLObject construct_reformulation_step(final SubLObject expression, final SubLObject result, final SubLObject justification) {
        return (SubLObject)ConsesLow.list(expression, result, justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 23335L)
    public static SubLObject reformulation_step_struct_expression(final SubLObject reformulation_step) {
        return reformulation_step.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 23509L)
    public static SubLObject reformulation_step_struct_result(final SubLObject reformulation_step) {
        return conses_high.second(reformulation_step);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 23680L)
    public static SubLObject reformulation_step_struct_justification(final SubLObject reformulation_step) {
        return conses_high.third(reformulation_step);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 24303L)
    public static SubLObject ref_warn(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == reformulator_hub.UNPROVIDED) {
            arg1 = (SubLObject)reformulator_hub.NIL;
        }
        if (arg2 == reformulator_hub.UNPROVIDED) {
            arg2 = (SubLObject)reformulator_hub.NIL;
        }
        if (arg3 == reformulator_hub.UNPROVIDED) {
            arg3 = (SubLObject)reformulator_hub.NIL;
        }
        if (arg4 == reformulator_hub.UNPROVIDED) {
            arg4 = (SubLObject)reformulator_hub.NIL;
        }
        if (arg5 == reformulator_hub.UNPROVIDED) {
            arg5 = (SubLObject)reformulator_hub.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (reformulator_hub.$ref_trace_level$.getDynamicValue(thread).numGE(level)) {
            Errors.warn(format_str, new SubLObject[] { arg1, arg2, arg3, arg4, arg5 });
        }
        return (SubLObject)reformulator_hub.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 24486L)
    public static SubLObject reformulate_expression_internal(final SubLObject expression, SubLObject old_expression, final SubLObject original_clause, final SubLObject mt, SubLObject settings, final SubLObject reformulate_subformulasP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)reformulator_hub.NIL;
        SubLObject justification = (SubLObject)reformulator_hub.NIL;
        final SubLObject apply_first = reformulator_datastructures.get_apply_first_recursively(settings);
        if (reformulator_hub.NIL != reformulate_atoms_criterion_metP(expression, settings)) {
            if (reformulator_hub.NIL != apply_first && reformulator_hub.NIL != reformulate_subformulasP) {
                settings = conses_high.remf(conses_high.copy_list(settings), (SubLObject)reformulator_hub.$kw18$APPLY_FIRST_RECURSIVELY);
                thread.resetMultipleValues();
                final SubLObject old_expression_$8 = reformulate_cycl_apply_first_recursively(expression, old_expression, original_clause, mt, settings, apply_first);
                final SubLObject result_$9 = thread.secondMultipleValue();
                final SubLObject justification_$10 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                old_expression = old_expression_$8;
                result = result_$9;
                justification = justification_$10;
            }
            else {
                thread.resetMultipleValues();
                final SubLObject result_$10 = try_rl_modules_with_expression(expression, original_clause, mt, settings);
                final SubLObject justification_$11 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                result = result_$10;
                justification = justification_$11;
            }
        }
        if (reformulator_hub.NIL != justification) {
            return Values.values(old_expression, result, justification);
        }
        if (reformulator_hub.NIL != el_utilities.el_formula_p(expression) && reformulator_hub.NIL != reformulate_subformulasP) {
            return map_reformulate_cycl(expression, original_clause, mt, settings);
        }
        return (SubLObject)reformulator_hub.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 24486L)
    public static SubLObject reformulate_expression(final SubLObject expression, final SubLObject old_expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings, final SubLObject reformulate_subformulasP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)reformulator_hub.NIL;
        if (reformulator_hub.NIL == v_memoization_state) {
            return reformulate_expression_internal(expression, old_expression, original_clause, mt, settings, reformulate_subformulasP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)reformulator_hub.$sym17$REFORMULATE_EXPRESSION, (SubLObject)reformulator_hub.UNPROVIDED);
        if (reformulator_hub.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)reformulator_hub.$sym17$REFORMULATE_EXPRESSION, (SubLObject)reformulator_hub.SIX_INTEGER, (SubLObject)reformulator_hub.$int19$64, (SubLObject)reformulator_hub.EQUAL, (SubLObject)reformulator_hub.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)reformulator_hub.$sym17$REFORMULATE_EXPRESSION, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_6(expression, old_expression, original_clause, mt, settings, reformulate_subformulasP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)reformulator_hub.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)reformulator_hub.NIL;
            collision = cdolist_list_var.first();
            while (reformulator_hub.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (expression.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (old_expression.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (original_clause.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (mt.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (settings.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (reformulator_hub.NIL != cached_args && reformulator_hub.NIL == cached_args.rest() && reformulate_subformulasP.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(reformulate_expression_internal(expression, old_expression, original_clause, mt, settings, reformulate_subformulasP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(expression, old_expression, original_clause, mt, settings, reformulate_subformulasP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 26329L)
    public static SubLObject reformulate_cycl_apply_first_recursively(final SubLObject expression, final SubLObject old_expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings, final SubLObject apply_first) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = ConsesLow.append(apply_first, (SubLObject)ConsesLow.list((SubLObject)reformulator_hub.NIL));
        SubLObject rl_module_name = (SubLObject)reformulator_hub.NIL;
        rl_module_name = cdolist_list_var.first();
        while (reformulator_hub.NIL != cdolist_list_var) {
            final SubLObject focused_settings = conses_high.putf(conses_high.copy_list(settings), (SubLObject)reformulator_hub.$kw20$FOCUS, rl_module_name);
            thread.resetMultipleValues();
            final SubLObject new_old_expression = reformulate_expression(expression, old_expression, original_clause, mt, focused_settings, (SubLObject)reformulator_hub.T);
            final SubLObject new_expression = thread.secondMultipleValue();
            final SubLObject justification = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (reformulator_hub.NIL != justification) {
                return Values.values(new_old_expression, new_expression, justification);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rl_module_name = cdolist_list_var.first();
        }
        return Values.values(old_expression, expression, (SubLObject)reformulator_hub.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 27092L)
    public static SubLObject map_reformulate_cycl(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (reformulator_hub.NIL != clauses.clauses_p(expression)) {
            if (reformulator_hub.NIL != list_utilities.singletonP(expression) && reformulator_hub.NIL != clauses.atomic_clause_p(expression.first())) {
                final SubLObject clause = expression.first();
                if (reformulator_hub.NIL != clause_utilities.neg_atomic_cnf_p(clause)) {
                    final SubLObject inverted_neg_pos_atomic_clause = clause_utilities.make_gaf_cnf(clause_utilities.atomic_cnf_asent(clause));
                    thread.resetMultipleValues();
                    final SubLObject sub_expression = reformulate_expression(inverted_neg_pos_atomic_clause, expression, original_clause, mt, settings, (SubLObject)reformulator_hub.T);
                    final SubLObject sub_result = thread.secondMultipleValue();
                    final SubLObject justification = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (reformulator_hub.NIL != justification) {
                        return Values.values(sub_expression, sub_result, justification);
                    }
                }
                final SubLObject pos_lit = clauses.pos_lits(clause).first();
                final SubLObject neg_lit = clauses.neg_lits(clause).first();
                return map_reformulate_cycl((reformulator_hub.NIL != pos_lit) ? pos_lit : neg_lit, original_clause, mt, settings);
            }
            SubLObject cdolist_list_var = expression;
            SubLObject clause2 = (SubLObject)reformulator_hub.NIL;
            clause2 = cdolist_list_var.first();
            while (reformulator_hub.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$13 = clauses.pos_lits(clause2);
                SubLObject pos_lit2 = (SubLObject)reformulator_hub.NIL;
                pos_lit2 = cdolist_list_var_$13.first();
                while (reformulator_hub.NIL != cdolist_list_var_$13) {
                    final SubLObject v_clauses = (SubLObject)ConsesLow.list(clause_utilities.make_gaf_cnf(pos_lit2));
                    thread.resetMultipleValues();
                    final SubLObject sub_expression2 = reformulate_expression(v_clauses, v_clauses, original_clause, mt, settings, (SubLObject)reformulator_hub.T);
                    final SubLObject sub_result2 = thread.secondMultipleValue();
                    final SubLObject justification2 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (reformulator_hub.NIL != justification2) {
                        return Values.values(sub_expression2, sub_result2, justification2);
                    }
                    cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                    pos_lit2 = cdolist_list_var_$13.first();
                }
                SubLObject cdolist_list_var_$14 = clauses.neg_lits(clause2);
                SubLObject neg_lit2 = (SubLObject)reformulator_hub.NIL;
                neg_lit2 = cdolist_list_var_$14.first();
                while (reformulator_hub.NIL != cdolist_list_var_$14) {
                    final SubLObject v_clauses = (SubLObject)ConsesLow.list(clause_utilities.make_gaf_cnf(neg_lit2));
                    thread.resetMultipleValues();
                    final SubLObject sub_expression2 = reformulate_expression(v_clauses, v_clauses, original_clause, mt, settings, (SubLObject)reformulator_hub.T);
                    final SubLObject sub_result2 = thread.secondMultipleValue();
                    final SubLObject justification2 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (reformulator_hub.NIL != justification2) {
                        return Values.values(sub_expression2, sub_result2, justification2);
                    }
                    cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                    neg_lit2 = cdolist_list_var_$14.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                clause2 = cdolist_list_var.first();
            }
        }
        else {
            SubLObject cdolist_list_var2;
            final SubLObject terms = cdolist_list_var2 = cycl_utilities.formula_terms(expression, (SubLObject)reformulator_hub.$kw21$IGNORE);
            SubLObject sub_term = (SubLObject)reformulator_hub.NIL;
            sub_term = cdolist_list_var2.first();
            while (reformulator_hub.NIL != cdolist_list_var2) {
                thread.resetMultipleValues();
                final SubLObject sub_expression3 = map_reformulate_expression(sub_term, original_clause, mt, settings);
                final SubLObject sub_result3 = thread.secondMultipleValue();
                final SubLObject justification3 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (reformulator_hub.NIL != justification3) {
                    return Values.values(sub_expression3, sub_result3, justification3);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                sub_term = cdolist_list_var2.first();
            }
        }
        return Values.values(expression, (SubLObject)reformulator_hub.NIL, (SubLObject)reformulator_hub.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 29514L)
    public static SubLObject map_reformulate_expression(final SubLObject sub_term, final SubLObject original_clause, final SubLObject mt, final SubLObject settings) {
        SubLObject canon_subterm = sub_term;
        if (reformulator_hub.NIL != cycl_grammar.cycl_sentence_p(sub_term)) {
            canon_subterm = canonicalize_reformulator_expression_cached(sub_term, mt, (SubLObject)reformulator_hub.NIL, (SubLObject)reformulator_hub.$kw14$NONE);
        }
        return reformulate_expression(canon_subterm, sub_term, original_clause, mt, settings, (SubLObject)reformulator_hub.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 30150L)
    public static SubLObject try_rl_modules_with_expression(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = expression;
        SubLObject justification = (SubLObject)reformulator_hub.NIL;
        final SubLObject focus = reformulator_datastructures.get_reformulation_focus(settings);
        final SubLObject ignore_list = reformulator_datastructures.get_ignore_rl_modules(settings);
        SubLObject rl_module_cost_pairs = (SubLObject)reformulator_hub.NIL;
        if (reformulator_hub.NIL != focus) {
            final SubLObject rl_module = reformulator_module_harness.get_rl_module_from_store(focus);
            if (reformulator_hub.NIL != reformulator_module_harness.rl_module_applicableP(rl_module, expression, mt, settings)) {
                rl_module_cost_pairs = (SubLObject)ConsesLow.list(reader.bq_cons(rl_module, (SubLObject)reformulator_hub.ZERO_INTEGER));
            }
            else {
                rl_module_cost_pairs = (SubLObject)reformulator_hub.NIL;
            }
        }
        else {
            SubLObject cdolist_list_var = reformulator_module_harness.rl_module_store();
            SubLObject mod = (SubLObject)reformulator_hub.NIL;
            mod = cdolist_list_var.first();
            while (reformulator_hub.NIL != cdolist_list_var) {
                final SubLObject rl_module2 = mod;
                final SubLObject module_name = reformulator_module_harness.rl_module_name(rl_module2);
                if (reformulator_hub.NIL == subl_promotions.memberP(module_name, ignore_list, (SubLObject)reformulator_hub.UNPROVIDED, (SubLObject)reformulator_hub.UNPROVIDED) && reformulator_hub.NIL == conses_high.member(module_name, reformulator_hub.$ignore_modules_unless_focussed$.getGlobalValue(), (SubLObject)reformulator_hub.UNPROVIDED, (SubLObject)reformulator_hub.UNPROVIDED)) {
                    final SubLObject requiredP = reformulator_module_harness.rl_module_applicableP(rl_module2, expression, mt, settings);
                    if (reformulator_hub.NIL != requiredP) {
                        final SubLObject cost = reformulator_module_harness.rl_module_cost(rl_module2, expression, mt, settings);
                        rl_module_cost_pairs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(rl_module2, cost), rl_module_cost_pairs);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                mod = cdolist_list_var.first();
            }
        }
        rl_module_cost_pairs = Sort.sort(rl_module_cost_pairs, Symbols.symbol_function((SubLObject)reformulator_hub.$sym23$_), Symbols.symbol_function((SubLObject)reformulator_hub.$sym24$CDR));
        if (reformulator_hub.NIL == justification) {
            SubLObject csome_list_var = rl_module_cost_pairs;
            SubLObject rl_moduleXcost = (SubLObject)reformulator_hub.NIL;
            rl_moduleXcost = csome_list_var.first();
            while (reformulator_hub.NIL == justification && reformulator_hub.NIL != csome_list_var) {
                final SubLObject rl_module2 = rl_moduleXcost.first();
                thread.resetMultipleValues();
                final SubLObject result_$15 = reformulator_module_harness.rl_module_reformulate(rl_module2, expression, original_clause, mt, settings);
                final SubLObject justification_$16 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                result = result_$15;
                justification = justification_$16;
                if (reformulator_hub.NIL != justification) {
                    if (reformulator_hub.T.eql(justification)) {
                        justification = (SubLObject)ConsesLow.list(reformulator_module_harness.rl_module_name(rl_module2));
                    }
                    else if (justification.isCons()) {
                        justification = (SubLObject)ConsesLow.cons(reformulator_module_harness.rl_module_name(rl_module2), justification);
                    }
                    else {
                        justification = (SubLObject)ConsesLow.cons(reformulator_module_harness.rl_module_name(rl_module2), (SubLObject)ConsesLow.list(justification));
                    }
                }
                if (reformulator_hub.NIL != reformulator_hub.$reformulator_timeout_time$.getDynamicValue(thread) && Time.get_internal_real_time().numG(reformulator_hub.$reformulator_timeout_time$.getDynamicValue(thread))) {
                    justification = (SubLObject)reformulator_hub.NIL;
                }
                csome_list_var = csome_list_var.rest();
                rl_moduleXcost = csome_list_var.first();
            }
        }
        return Values.values(result, justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 32511L)
    public static SubLObject canonicalize_reformulator_expression_cached_internal(final SubLObject expression, final SubLObject mt, final SubLObject templateP, final SubLObject wff_degree) {
        return canonicalize_reformulator_expression(expression, mt, templateP, wff_degree, (SubLObject)reformulator_hub.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 32511L)
    public static SubLObject canonicalize_reformulator_expression_cached(final SubLObject expression, final SubLObject mt, final SubLObject templateP, final SubLObject wff_degree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)reformulator_hub.NIL;
        if (reformulator_hub.NIL == v_memoization_state) {
            return canonicalize_reformulator_expression_cached_internal(expression, mt, templateP, wff_degree);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)reformulator_hub.$sym25$CANONICALIZE_REFORMULATOR_EXPRESSION_CACHED, (SubLObject)reformulator_hub.UNPROVIDED);
        if (reformulator_hub.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)reformulator_hub.$sym25$CANONICALIZE_REFORMULATOR_EXPRESSION_CACHED, (SubLObject)reformulator_hub.FOUR_INTEGER, (SubLObject)reformulator_hub.NIL, (SubLObject)reformulator_hub.EQUAL, (SubLObject)reformulator_hub.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)reformulator_hub.$sym25$CANONICALIZE_REFORMULATOR_EXPRESSION_CACHED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(expression, mt, templateP, wff_degree);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)reformulator_hub.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)reformulator_hub.NIL;
            collision = cdolist_list_var.first();
            while (reformulator_hub.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (expression.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (templateP.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (reformulator_hub.NIL != cached_args && reformulator_hub.NIL == cached_args.rest() && wff_degree.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(canonicalize_reformulator_expression_cached_internal(expression, mt, templateP, wff_degree)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(expression, mt, templateP, wff_degree));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 33103L)
    public static SubLObject canonicalize_reformulator_expression(final SubLObject expression, final SubLObject mt, final SubLObject templateP, SubLObject wff_degree, SubLObject rule_pred) {
        if (wff_degree == reformulator_hub.UNPROVIDED) {
            wff_degree = (SubLObject)reformulator_hub.NIL;
        }
        if (rule_pred == reformulator_hub.UNPROVIDED) {
            rule_pred = (SubLObject)reformulator_hub.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject canon_expression = (SubLObject)reformulator_hub.NIL;
        final SubLObject _prev_bind_0 = czer_vars.$expand_el_relationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$add_term_of_unit_litsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = czer_vars.$reify_skolemsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = czer_vars.$express_as_rule_macroP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = czer_vars.$canonicalize_variablesP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = czer_vars.$simplify_non_wff_literalP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = czer_vars.$robust_assertion_lookup$.currentBinding(thread);
        final SubLObject _prev_bind_8 = czer_vars.$robust_nart_lookup$.currentBinding(thread);
        final SubLObject _prev_bind_9 = czer_vars.$implicitify_universalsP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = wff_vars.$reject_sbhl_conflictsP$.currentBinding(thread);
        try {
            czer_vars.$expand_el_relationsP$.bind((SubLObject)reformulator_hub.NIL, thread);
            czer_vars.$add_term_of_unit_litsP$.bind((SubLObject)reformulator_hub.NIL, thread);
            czer_vars.$reify_skolemsP$.bind((SubLObject)reformulator_hub.NIL, thread);
            czer_vars.$express_as_rule_macroP$.bind((SubLObject)reformulator_hub.NIL, thread);
            czer_vars.$canonicalize_variablesP$.bind((SubLObject)reformulator_hub.NIL, thread);
            czer_vars.$simplify_non_wff_literalP$.bind((SubLObject)reformulator_hub.NIL, thread);
            czer_vars.$robust_assertion_lookup$.bind((SubLObject)reformulator_hub.NIL, thread);
            czer_vars.$robust_nart_lookup$.bind((SubLObject)reformulator_hub.NIL, thread);
            czer_vars.$implicitify_universalsP$.bind((SubLObject)SubLObjectFactory.makeBoolean(reformulator_hub.NIL == templateP), thread);
            wff_vars.$reject_sbhl_conflictsP$.bind((SubLObject)reformulator_hub.NIL, thread);
            if (reformulator_hub.NIL != wff_degree) {
                canon_expression = canonicalize_reformulator_expression_with_wff_degree(expression, mt, wff_degree, rule_pred);
            }
            else {
                thread.resetMultipleValues();
                final SubLObject canon_expression_$17 = canonicalize_reformulator_expression_wXo_wff_degree(expression, mt, rule_pred);
                final SubLObject wff_degree_$18 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                canon_expression = canon_expression_$17;
                wff_degree = wff_degree_$18;
            }
        }
        finally {
            wff_vars.$reject_sbhl_conflictsP$.rebind(_prev_bind_10, thread);
            czer_vars.$implicitify_universalsP$.rebind(_prev_bind_9, thread);
            czer_vars.$robust_nart_lookup$.rebind(_prev_bind_8, thread);
            czer_vars.$robust_assertion_lookup$.rebind(_prev_bind_7, thread);
            czer_vars.$simplify_non_wff_literalP$.rebind(_prev_bind_6, thread);
            czer_vars.$canonicalize_variablesP$.rebind(_prev_bind_5, thread);
            czer_vars.$express_as_rule_macroP$.rebind(_prev_bind_4, thread);
            czer_vars.$reify_skolemsP$.rebind(_prev_bind_3, thread);
            czer_vars.$add_term_of_unit_litsP$.rebind(_prev_bind_2, thread);
            czer_vars.$expand_el_relationsP$.rebind(_prev_bind_0, thread);
        }
        return Values.values(canon_expression, wff_degree);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 34268L)
    public static SubLObject canonicalize_reformulator_expression_wXo_wff_degree(final SubLObject expression, final SubLObject mt, SubLObject rule_pred) {
        if (rule_pred == reformulator_hub.UNPROVIDED) {
            rule_pred = (SubLObject)reformulator_hub.NIL;
        }
        final SubLObject wff_degree_order = (SubLObject)ConsesLow.list((SubLObject)reformulator_hub.$kw26$ALL, (SubLObject)reformulator_hub.$kw27$ARITY, (SubLObject)reformulator_hub.$kw28$KB, (SubLObject)reformulator_hub.$kw14$NONE);
        SubLObject wff_degree = (SubLObject)reformulator_hub.NIL;
        SubLObject canon_expression = (SubLObject)reformulator_hub.NIL;
        if (reformulator_hub.NIL == wff_degree) {
            SubLObject csome_list_var = wff_degree_order;
            SubLObject each_wff_degree = (SubLObject)reformulator_hub.NIL;
            each_wff_degree = csome_list_var.first();
            while (reformulator_hub.NIL == wff_degree && reformulator_hub.NIL != csome_list_var) {
                canon_expression = canonicalize_reformulator_expression_with_wff_degree(expression, mt, each_wff_degree, rule_pred);
                if (reformulator_hub.NIL != canon_expression) {
                    wff_degree = each_wff_degree;
                }
                csome_list_var = csome_list_var.rest();
                each_wff_degree = csome_list_var.first();
            }
        }
        return Values.values(canon_expression, wff_degree);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 34996L)
    public static SubLObject canonicalize_reformulator_expression_with_wff_degree(final SubLObject expression, final SubLObject mt, final SubLObject wff_degree, SubLObject rule_pred) {
        if (rule_pred == reformulator_hub.UNPROVIDED) {
            rule_pred = (SubLObject)reformulator_hub.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject canon_expression = (SubLObject)reformulator_hub.NIL;
        if (wff_degree.eql((SubLObject)reformulator_hub.$kw14$NONE)) {
            final SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding(thread);
            final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
            final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
            final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
            final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
            final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding(thread);
            final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding(thread);
            final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
            final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
            final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding(thread);
            final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
            final SubLObject _prev_bind_12 = wff_utilities.$check_arityP$.currentBinding(thread);
            final SubLObject _prev_bind_13 = cycl_grammar.$grammar_uses_kbP$.currentBinding(thread);
            try {
                control_vars.$within_assert$.bind((SubLObject)reformulator_hub.NIL, thread);
                wff_utilities.$check_arg_typesP$.bind((SubLObject)reformulator_hub.NIL, thread);
                at_vars.$at_check_arg_typesP$.bind((SubLObject)reformulator_hub.NIL, thread);
                wff_utilities.$check_wff_semanticsP$.bind((SubLObject)reformulator_hub.NIL, thread);
                wff_utilities.$check_wff_coherenceP$.bind((SubLObject)reformulator_hub.NIL, thread);
                wff_utilities.$check_var_typesP$.bind((SubLObject)reformulator_hub.NIL, thread);
                czer_vars.$simplify_literalP$.bind((SubLObject)reformulator_hub.NIL, thread);
                at_vars.$at_check_relator_constraintsP$.bind((SubLObject)reformulator_hub.NIL, thread);
                at_vars.$at_check_arg_formatP$.bind((SubLObject)reformulator_hub.NIL, thread);
                wff_vars.$validate_constantsP$.bind((SubLObject)reformulator_hub.NIL, thread);
                system_parameters.$suspend_sbhl_type_checkingP$.bind((SubLObject)reformulator_hub.T, thread);
                wff_utilities.$check_arityP$.bind((SubLObject)reformulator_hub.NIL, thread);
                cycl_grammar.$grammar_uses_kbP$.bind((SubLObject)reformulator_hub.NIL, thread);
                canon_expression = canonicalize_reformulator_expression_int(expression, mt, rule_pred);
            }
            finally {
                cycl_grammar.$grammar_uses_kbP$.rebind(_prev_bind_13, thread);
                wff_utilities.$check_arityP$.rebind(_prev_bind_12, thread);
                system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_11, thread);
                wff_vars.$validate_constantsP$.rebind(_prev_bind_10, thread);
                at_vars.$at_check_arg_formatP$.rebind(_prev_bind_9, thread);
                at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_8, thread);
                czer_vars.$simplify_literalP$.rebind(_prev_bind_7, thread);
                wff_utilities.$check_var_typesP$.rebind(_prev_bind_6, thread);
                wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_5, thread);
                wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
                at_vars.$at_check_arg_typesP$.rebind(_prev_bind_3, thread);
                wff_utilities.$check_arg_typesP$.rebind(_prev_bind_2, thread);
                control_vars.$within_assert$.rebind(_prev_bind_0, thread);
            }
        }
        else if (wff_degree.eql((SubLObject)reformulator_hub.$kw28$KB)) {
            final SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding(thread);
            final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
            final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
            final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
            final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
            final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding(thread);
            final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding(thread);
            final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
            final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
            final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding(thread);
            final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
            final SubLObject _prev_bind_12 = wff_utilities.$check_arityP$.currentBinding(thread);
            try {
                control_vars.$within_assert$.bind((SubLObject)reformulator_hub.NIL, thread);
                wff_utilities.$check_arg_typesP$.bind((SubLObject)reformulator_hub.NIL, thread);
                at_vars.$at_check_arg_typesP$.bind((SubLObject)reformulator_hub.NIL, thread);
                wff_utilities.$check_wff_semanticsP$.bind((SubLObject)reformulator_hub.NIL, thread);
                wff_utilities.$check_wff_coherenceP$.bind((SubLObject)reformulator_hub.NIL, thread);
                wff_utilities.$check_var_typesP$.bind((SubLObject)reformulator_hub.NIL, thread);
                czer_vars.$simplify_literalP$.bind((SubLObject)reformulator_hub.NIL, thread);
                at_vars.$at_check_relator_constraintsP$.bind((SubLObject)reformulator_hub.NIL, thread);
                at_vars.$at_check_arg_formatP$.bind((SubLObject)reformulator_hub.NIL, thread);
                wff_vars.$validate_constantsP$.bind((SubLObject)reformulator_hub.NIL, thread);
                system_parameters.$suspend_sbhl_type_checkingP$.bind((SubLObject)reformulator_hub.T, thread);
                wff_utilities.$check_arityP$.bind((SubLObject)reformulator_hub.NIL, thread);
                canon_expression = canonicalize_reformulator_expression_int(expression, mt, rule_pred);
            }
            finally {
                wff_utilities.$check_arityP$.rebind(_prev_bind_12, thread);
                system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_11, thread);
                wff_vars.$validate_constantsP$.rebind(_prev_bind_10, thread);
                at_vars.$at_check_arg_formatP$.rebind(_prev_bind_9, thread);
                at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_8, thread);
                czer_vars.$simplify_literalP$.rebind(_prev_bind_7, thread);
                wff_utilities.$check_var_typesP$.rebind(_prev_bind_6, thread);
                wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_5, thread);
                wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
                at_vars.$at_check_arg_typesP$.rebind(_prev_bind_3, thread);
                wff_utilities.$check_arg_typesP$.rebind(_prev_bind_2, thread);
                control_vars.$within_assert$.rebind(_prev_bind_0, thread);
            }
        }
        else if (wff_degree.eql((SubLObject)reformulator_hub.$kw27$ARITY)) {
            final SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding(thread);
            final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
            final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
            final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
            final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
            final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding(thread);
            final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding(thread);
            final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
            final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
            final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding(thread);
            final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
            try {
                control_vars.$within_assert$.bind((SubLObject)reformulator_hub.NIL, thread);
                wff_utilities.$check_arg_typesP$.bind((SubLObject)reformulator_hub.NIL, thread);
                at_vars.$at_check_arg_typesP$.bind((SubLObject)reformulator_hub.NIL, thread);
                wff_utilities.$check_wff_semanticsP$.bind((SubLObject)reformulator_hub.NIL, thread);
                wff_utilities.$check_wff_coherenceP$.bind((SubLObject)reformulator_hub.NIL, thread);
                wff_utilities.$check_var_typesP$.bind((SubLObject)reformulator_hub.NIL, thread);
                czer_vars.$simplify_literalP$.bind((SubLObject)reformulator_hub.NIL, thread);
                at_vars.$at_check_relator_constraintsP$.bind((SubLObject)reformulator_hub.NIL, thread);
                at_vars.$at_check_arg_formatP$.bind((SubLObject)reformulator_hub.NIL, thread);
                wff_vars.$validate_constantsP$.bind((SubLObject)reformulator_hub.NIL, thread);
                system_parameters.$suspend_sbhl_type_checkingP$.bind((SubLObject)reformulator_hub.T, thread);
                canon_expression = canonicalize_reformulator_expression_int(expression, mt, rule_pred);
            }
            finally {
                system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_11, thread);
                wff_vars.$validate_constantsP$.rebind(_prev_bind_10, thread);
                at_vars.$at_check_arg_formatP$.rebind(_prev_bind_9, thread);
                at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_8, thread);
                czer_vars.$simplify_literalP$.rebind(_prev_bind_7, thread);
                wff_utilities.$check_var_typesP$.rebind(_prev_bind_6, thread);
                wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_5, thread);
                wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
                at_vars.$at_check_arg_typesP$.rebind(_prev_bind_3, thread);
                wff_utilities.$check_arg_typesP$.rebind(_prev_bind_2, thread);
                control_vars.$within_assert$.rebind(_prev_bind_0, thread);
            }
        }
        else if (wff_degree.eql((SubLObject)reformulator_hub.$kw26$ALL)) {
            final SubLObject _prev_bind_0 = czer_vars.$must_enforce_semanticsP$.currentBinding(thread);
            try {
                czer_vars.$must_enforce_semanticsP$.bind((SubLObject)reformulator_hub.T, thread);
                canon_expression = canonicalize_reformulator_expression_int(expression, mt, rule_pred);
            }
            finally {
                czer_vars.$must_enforce_semanticsP$.rebind(_prev_bind_0, thread);
            }
        }
        return canon_expression;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 35888L)
    public static SubLObject canonicalize_reformulator_expression_int(final SubLObject expression, final SubLObject mt, SubLObject rule_pred) {
        if (rule_pred == reformulator_hub.UNPROVIDED) {
            rule_pred = (SubLObject)reformulator_hub.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject canon_expression = (SubLObject)reformulator_hub.NIL;
        SubLObject canon_expression_and_stuff = (SubLObject)reformulator_hub.NIL;
        SubLObject clauses_and_stuffP = (SubLObject)reformulator_hub.NIL;
        if (reformulator_hub.NIL != rule_pred) {
            if (reformulator_hub.NIL != genl_predicates.genl_predP(rule_pred, reformulator_hub.$const29$reformulatorEquals, (SubLObject)reformulator_hub.UNPROVIDED, (SubLObject)reformulator_hub.UNPROVIDED)) {
                canon_expression_and_stuff = czer_main.canonicalize_term(expression, mt);
                clauses_and_stuffP = (SubLObject)reformulator_hub.NIL;
            }
            else if (reformulator_hub.NIL != genl_predicates.genl_predP(rule_pred, reformulator_hub.$const30$reformulatorEquiv, (SubLObject)reformulator_hub.UNPROVIDED, (SubLObject)reformulator_hub.UNPROVIDED)) {
                canon_expression_and_stuff = czer_main.canonicalize_cycl(expression, mt);
                clauses_and_stuffP = czer_utilities.list_of_clause_binding_list_pairs_p(canon_expression_and_stuff);
            }
            else {
                thread.resetMultipleValues();
                final SubLObject canon_expression_and_stuff_$19 = czer_main.canonicalize_expression(expression, mt, (SubLObject)reformulator_hub.UNPROVIDED);
                final SubLObject clauses_and_stuffP_$20 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                canon_expression_and_stuff = canon_expression_and_stuff_$19;
                clauses_and_stuffP = clauses_and_stuffP_$20;
            }
        }
        else {
            thread.resetMultipleValues();
            final SubLObject canon_expression_and_stuff_$20 = czer_main.canonicalize_expression(expression, mt, (SubLObject)reformulator_hub.UNPROVIDED);
            final SubLObject clauses_and_stuffP_$21 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            canon_expression_and_stuff = canon_expression_and_stuff_$20;
            clauses_and_stuffP = clauses_and_stuffP_$21;
        }
        if (reformulator_hub.NIL != clauses_and_stuffP) {
            canon_expression = czer_main.sort_clauses(Mapping.mapcar(Symbols.symbol_function((SubLObject)reformulator_hub.$sym31$FIRST), canon_expression_and_stuff));
        }
        else {
            canon_expression = canon_expression_and_stuff;
        }
        return canon_expression;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 36904L)
    public static SubLObject recanonicalize_rl_expression(final SubLObject expression, final SubLObject mt) {
        return canonicalize_reformulator_expression_cached(uncanonicalize_rl_expression_cached(expression, mt), mt, (SubLObject)reformulator_hub.NIL, (SubLObject)reformulator_hub.$kw14$NONE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 37086L)
    public static SubLObject uncanonicalize_rl_expression_cached_internal(final SubLObject expression, final SubLObject mt) {
        return uncanonicalize_rl_expression(expression, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 37086L)
    public static SubLObject uncanonicalize_rl_expression_cached(final SubLObject expression, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)reformulator_hub.NIL;
        if (reformulator_hub.NIL == v_memoization_state) {
            return uncanonicalize_rl_expression_cached_internal(expression, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)reformulator_hub.$sym32$UNCANONICALIZE_RL_EXPRESSION_CACHED, (SubLObject)reformulator_hub.UNPROVIDED);
        if (reformulator_hub.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)reformulator_hub.$sym32$UNCANONICALIZE_RL_EXPRESSION_CACHED, (SubLObject)reformulator_hub.TWO_INTEGER, (SubLObject)reformulator_hub.$int19$64, (SubLObject)reformulator_hub.EQUAL, (SubLObject)reformulator_hub.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)reformulator_hub.$sym32$UNCANONICALIZE_RL_EXPRESSION_CACHED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(expression, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)reformulator_hub.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)reformulator_hub.NIL;
            collision = cdolist_list_var.first();
            while (reformulator_hub.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (expression.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (reformulator_hub.NIL != cached_args && reformulator_hub.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(uncanonicalize_rl_expression_cached_internal(expression, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(expression, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 37260L)
    public static SubLObject uncanonicalize_rl_expression(final SubLObject expression, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)reformulator_hub.NIL;
        final SubLObject _prev_bind_0 = czer_vars.$expand_el_relationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$unremove_universalsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            czer_vars.$expand_el_relationsP$.bind((SubLObject)reformulator_hub.NIL, thread);
            czer_vars.$unremove_universalsP$.bind((SubLObject)reformulator_hub.NIL, thread);
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)reformulator_hub.$sym33$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            if (reformulator_hub.NIL != clauses.clauses_p(expression)) {
                result = uncanonicalizer.cnfs_el_formula(expression, mt, (SubLObject)reformulator_hub.UNPROVIDED);
            }
            else {
                result = expression;
            }
            result = rl_evaluatable_expressions_out(result);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
            czer_vars.$unremove_universalsP$.rebind(_prev_bind_2, thread);
            czer_vars.$expand_el_relationsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 37935L)
    public static SubLObject rl_evaluatable_expressions_out(final SubLObject formula) {
        if (reformulator_hub.NIL != cycl_utilities.expression_find_if((SubLObject)reformulator_hub.$sym34$RL_EVALUATABLE_EXPRESSION_, formula, (SubLObject)reformulator_hub.NIL, (SubLObject)reformulator_hub.UNPROVIDED)) {
            return transform_list_utilities.quiescent_transform(formula, (SubLObject)reformulator_hub.$sym34$RL_EVALUATABLE_EXPRESSION_, (SubLObject)reformulator_hub.$sym35$TRANSFORM_EVALUATION_EXPRESSION, (SubLObject)reformulator_hub.UNPROVIDED, (SubLObject)reformulator_hub.UNPROVIDED);
        }
        return formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 38373L)
    public static SubLObject rl_evaluatable_expressionP(final SubLObject v_object, SubLObject mt) {
        if (mt == reformulator_hub.UNPROVIDED) {
            mt = (SubLObject)reformulator_hub.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)reformulator_hub.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            result = (SubLObject)SubLObjectFactory.makeBoolean(reformulator_hub.NIL != el_utilities.el_formula_p(v_object) && reformulator_hub.NIL != rl_evaluatable_functorP(cycl_utilities.formula_arg0(v_object), mt) && reformulator_hub.NIL != el_utilities.evaluatable_el_expressionP(v_object) && reformulator_hub.NIL != rl_evaluatable_subexpressionsP(v_object, mt));
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 38759L)
    public static SubLObject rl_evaluatable_functorP(final SubLObject v_object, SubLObject mt) {
        if (mt == reformulator_hub.UNPROVIDED) {
            mt = (SubLObject)reformulator_hub.NIL;
        }
        if (reformulator_hub.NIL != forts.fort_p(v_object)) {
            return kb_mapping_utilities.some_pred_value_in_relevant_mts(v_object, reformulator_hub.$const36$evaluateAtEL, mt, (SubLObject)reformulator_hub.UNPROVIDED, (SubLObject)reformulator_hub.UNPROVIDED);
        }
        return (SubLObject)reformulator_hub.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 38954L)
    public static SubLObject rl_evaluatable_subexpressionsP(final SubLObject v_object, SubLObject mt) {
        if (mt == reformulator_hub.UNPROVIDED) {
            mt = (SubLObject)reformulator_hub.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rl_evaluatableP = (SubLObject)reformulator_hub.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            rl_evaluatableP = (SubLObject)SubLObjectFactory.makeBoolean(reformulator_hub.NIL == cycl_utilities.expression_find_if((SubLObject)reformulator_hub.$sym37$RL_UNEVALUATABLE_EXPRESSION_, v_object, (SubLObject)reformulator_hub.UNPROVIDED, (SubLObject)reformulator_hub.UNPROVIDED));
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return rl_evaluatableP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 39198L)
    public static SubLObject rl_unevaluatable_expressionP(final SubLObject v_object, SubLObject mt) {
        if (mt == reformulator_hub.UNPROVIDED) {
            mt = (SubLObject)reformulator_hub.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(reformulator_hub.NIL != el_utilities.el_formula_p(v_object) && reformulator_hub.NIL != relation_evaluation.evaluatable_expressionP(v_object) && reformulator_hub.NIL == rl_evaluatable_functorP(cycl_utilities.formula_arg0(v_object), mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 39407L)
    public static SubLObject hl_formula_for_reformulator_rule(final SubLObject rr) {
        final SubLObject assertion_for_rule = reformulator_rule_unifier_datastructures.reformulator_rule_assertion(rr);
        SubLObject hl_formula = (SubLObject)reformulator_hub.NIL;
        if (reformulator_hub.NIL != assertion_for_rule) {
            hl_formula = fi.assertion_hl_formula(assertion_for_rule, (SubLObject)reformulator_hub.UNPROVIDED);
        }
        return hl_formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 39889L)
    public static SubLObject reformulator_template_mentions_fortP(final SubLObject rt, final SubLObject fort) {
        return list_utilities.sublisp_boolean(Sequences.find(fort, reformulator_rule_unifier_datastructures.reformulator_template_forts(rt), (SubLObject)reformulator_hub.UNPROVIDED, (SubLObject)reformulator_hub.UNPROVIDED, (SubLObject)reformulator_hub.UNPROVIDED, (SubLObject)reformulator_hub.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 40018L)
    public static SubLObject reformulator_rule_mentions_fortP(final SubLObject rr, final SubLObject fort) {
        return (SubLObject)SubLObjectFactory.makeBoolean(reformulator_hub.NIL != reformulator_template_mentions_fortP(reformulator_rule_unifier_datastructures.reformulator_rule_first_rt(rr), fort) || reformulator_hub.NIL != reformulator_template_mentions_fortP(reformulator_rule_unifier_datastructures.reformulator_rule_second_rt(rr), fort));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 40254L)
    public static SubLObject reformulator_rules_mentioning_fort(final SubLObject fort) {
        if (reformulator_hub.NIL == reformulator_datastructures.reformulator_initializedP()) {
            return (SubLObject)reformulator_hub.NIL;
        }
        return ConsesLow.append(Hashtables.gethash(fort, reformulator_rule_unifier_datastructures.constant_reformulator_rule_table(), (SubLObject)reformulator_hub.UNPROVIDED), Hashtables.gethash(fort, reformulator_rule_unifier_datastructures.nart_reformulator_rule_table(), (SubLObject)reformulator_hub.UNPROVIDED), Hashtables.gethash(fort, reformulator_rule_unifier_datastructures.fort_reformulator_rule_table(), (SubLObject)reformulator_hub.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 40546L)
    public static SubLObject print_wff_reformulator_rules() {
        if (reformulator_hub.NIL == reformulator_datastructures.reformulator_initializedP()) {
            return (SubLObject)reformulator_hub.NIL;
        }
        SubLObject no_all = (SubLObject)reformulator_hub.ZERO_INTEGER;
        SubLObject no_arity = (SubLObject)reformulator_hub.ZERO_INTEGER;
        SubLObject no_kb = (SubLObject)reformulator_hub.ZERO_INTEGER;
        SubLObject no_none = (SubLObject)reformulator_hub.ZERO_INTEGER;
        final SubLObject cdohash_table = reformulator_rule_unifier_datastructures.reformulator_rules();
        SubLObject key = (SubLObject)reformulator_hub.NIL;
        SubLObject rr = (SubLObject)reformulator_hub.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                rr = Hashtables.getEntryValue(cdohash_entry);
                final SubLObject pcase_var;
                final SubLObject rule_wff = pcase_var = reformulator_rule_unifier_datastructures.reformulator_rule_wff_degree(rr);
                if (pcase_var.eql((SubLObject)reformulator_hub.$kw26$ALL)) {
                    no_all = Numbers.add(no_all, (SubLObject)reformulator_hub.ONE_INTEGER);
                }
                else if (pcase_var.eql((SubLObject)reformulator_hub.$kw27$ARITY)) {
                    no_arity = Numbers.add(no_arity, (SubLObject)reformulator_hub.ONE_INTEGER);
                }
                else if (pcase_var.eql((SubLObject)reformulator_hub.$kw28$KB)) {
                    no_kb = Numbers.add(no_kb, (SubLObject)reformulator_hub.ONE_INTEGER);
                }
                else {
                    if (!pcase_var.eql((SubLObject)reformulator_hub.$kw14$NONE)) {
                        continue;
                    }
                    no_none = Numbers.add(no_none, (SubLObject)reformulator_hub.ONE_INTEGER);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        PrintLow.format((SubLObject)reformulator_hub.T, (SubLObject)reformulator_hub.$str38$All___s__Arity___s__KB___s__None_, new SubLObject[] { no_all, no_arity, no_kb, no_none });
        return (SubLObject)reformulator_hub.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 41202L)
    public static SubLObject compute_average_number_of_forts_mentioned_in_reformulator_rules() {
        if (reformulator_hub.NIL == reformulator_datastructures.reformulator_initializedP()) {
            return (SubLObject)reformulator_hub.NIL;
        }
        SubLObject num_rules = (SubLObject)reformulator_hub.ZERO_INTEGER;
        SubLObject num_forts = (SubLObject)reformulator_hub.ZERO_INTEGER;
        final SubLObject cdohash_table = reformulator_rule_unifier_datastructures.reformulator_rules();
        SubLObject key = (SubLObject)reformulator_hub.NIL;
        SubLObject rr = (SubLObject)reformulator_hub.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                rr = Hashtables.getEntryValue(cdohash_entry);
                num_rules = Numbers.add(num_rules, (SubLObject)reformulator_hub.ONE_INTEGER);
                num_forts = Numbers.add(num_forts, Sequences.length(reformulator_rule_unifier_datastructures.reformulator_rule_forts(rr)));
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        PrintLow.format((SubLObject)reformulator_hub.T, (SubLObject)reformulator_hub.$str39$Average_number_of_FORTs_mentioned, Numbers.divide(num_forts, num_rules));
        return (SubLObject)reformulator_hub.NIL;
    }
    
    public static SubLObject declare_reformulator_hub_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "reformulate_cycl", "REFORMULATE-CYCL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "reformulate_atoms_criterion_metP", "REFORMULATE-ATOMS-CRITERION-MET?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "reformulator_timeout_time", "REFORMULATOR-TIMEOUT-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "reformulate_cycl_int", "REFORMULATE-CYCL-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "eliminate_transitivity_in_reformulation_history", "ELIMINATE-TRANSITIVITY-IN-REFORMULATION-HISTORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "reformulator_subst", "REFORMULATOR-SUBST", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "clear_all_kb_modal_operators", "CLEAR-ALL-KB-MODAL-OPERATORS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "remove_all_kb_modal_operators", "REMOVE-ALL-KB-MODAL-OPERATORS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "all_kb_modal_operators_internal", "ALL-KB-MODAL-OPERATORS-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "all_kb_modal_operators", "ALL-KB-MODAL-OPERATORS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "possible_modal", "POSSIBLE-MODAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "rl_clauses_merge_subst", "RL-CLAUSES-MERGE-SUBST", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "nested_rl_expression_subst", "NESTED-RL-EXPRESSION-SUBST", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "contains_old_rlP", "CONTAINS-OLD-RL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "subst_new_rl", "SUBST-NEW-RL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "construct_reformulation_step", "CONSTRUCT-REFORMULATION-STEP", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "reformulation_step_struct_expression", "REFORMULATION-STEP-STRUCT-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "reformulation_step_struct_result", "REFORMULATION-STEP-STRUCT-RESULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "reformulation_step_struct_justification", "REFORMULATION-STEP-STRUCT-JUSTIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "ref_warn", "REF-WARN", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "reformulate_expression_internal", "REFORMULATE-EXPRESSION-INTERNAL", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "reformulate_expression", "REFORMULATE-EXPRESSION", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "reformulate_cycl_apply_first_recursively", "REFORMULATE-CYCL-APPLY-FIRST-RECURSIVELY", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "map_reformulate_cycl", "MAP-REFORMULATE-CYCL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "map_reformulate_expression", "MAP-REFORMULATE-EXPRESSION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "try_rl_modules_with_expression", "TRY-RL-MODULES-WITH-EXPRESSION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "canonicalize_reformulator_expression_cached_internal", "CANONICALIZE-REFORMULATOR-EXPRESSION-CACHED-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "canonicalize_reformulator_expression_cached", "CANONICALIZE-REFORMULATOR-EXPRESSION-CACHED", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "canonicalize_reformulator_expression", "CANONICALIZE-REFORMULATOR-EXPRESSION", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "canonicalize_reformulator_expression_wXo_wff_degree", "CANONICALIZE-REFORMULATOR-EXPRESSION-W/O-WFF-DEGREE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "canonicalize_reformulator_expression_with_wff_degree", "CANONICALIZE-REFORMULATOR-EXPRESSION-WITH-WFF-DEGREE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "canonicalize_reformulator_expression_int", "CANONICALIZE-REFORMULATOR-EXPRESSION-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "recanonicalize_rl_expression", "RECANONICALIZE-RL-EXPRESSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "uncanonicalize_rl_expression_cached_internal", "UNCANONICALIZE-RL-EXPRESSION-CACHED-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "uncanonicalize_rl_expression_cached", "UNCANONICALIZE-RL-EXPRESSION-CACHED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "uncanonicalize_rl_expression", "UNCANONICALIZE-RL-EXPRESSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "rl_evaluatable_expressions_out", "RL-EVALUATABLE-EXPRESSIONS-OUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "rl_evaluatable_expressionP", "RL-EVALUATABLE-EXPRESSION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "rl_evaluatable_functorP", "RL-EVALUATABLE-FUNCTOR?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "rl_evaluatable_subexpressionsP", "RL-EVALUATABLE-SUBEXPRESSIONS?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "rl_unevaluatable_expressionP", "RL-UNEVALUATABLE-EXPRESSION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "hl_formula_for_reformulator_rule", "HL-FORMULA-FOR-REFORMULATOR-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "reformulator_template_mentions_fortP", "REFORMULATOR-TEMPLATE-MENTIONS-FORT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "reformulator_rule_mentions_fortP", "REFORMULATOR-RULE-MENTIONS-FORT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "reformulator_rules_mentioning_fort", "REFORMULATOR-RULES-MENTIONING-FORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "print_wff_reformulator_rules", "PRINT-WFF-REFORMULATOR-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_hub", "compute_average_number_of_forts_mentioned_in_reformulator_rules", "COMPUTE-AVERAGE-NUMBER-OF-FORTS-MENTIONED-IN-REFORMULATOR-RULES", 0, 0, false);
        return (SubLObject)reformulator_hub.NIL;
    }
    
    public static SubLObject init_reformulator_hub_file() {
        reformulator_hub.$reformulator_timeout_time$ = SubLFiles.defparameter("*REFORMULATOR-TIMEOUT-TIME*", (SubLObject)reformulator_hub.NIL);
        reformulator_hub.$all_kb_modal_operators_caching_state$ = SubLFiles.deflexical("*ALL-KB-MODAL-OPERATORS-CACHING-STATE*", (SubLObject)reformulator_hub.NIL);
        reformulator_hub.$rl_mt$ = SubLFiles.defparameter("*RL-MT*", mt_vars.$default_ask_mt$.getGlobalValue());
        reformulator_hub.$rl_old$ = SubLFiles.defparameter("*RL-OLD*", (SubLObject)reformulator_hub.NIL);
        reformulator_hub.$rl_new$ = SubLFiles.defparameter("*RL-NEW*", (SubLObject)reformulator_hub.NIL);
        reformulator_hub.$ref_trace_level$ = SubLFiles.defparameter("*REF-TRACE-LEVEL*", (SubLObject)reformulator_hub.ONE_INTEGER);
        reformulator_hub.$ignore_modules_unless_focussed$ = SubLFiles.deflexical("*IGNORE-MODULES-UNLESS-FOCUSSED*", (SubLObject)reformulator_hub.$list22);
        return (SubLObject)reformulator_hub.NIL;
    }
    
    public static SubLObject setup_reformulator_hub_file() {
        memoization_state.note_globally_cached_function((SubLObject)reformulator_hub.$sym9$ALL_KB_MODAL_OPERATORS);
        memoization_state.note_memoized_function((SubLObject)reformulator_hub.$sym17$REFORMULATE_EXPRESSION);
        memoization_state.note_memoized_function((SubLObject)reformulator_hub.$sym25$CANONICALIZE_REFORMULATOR_EXPRESSION_CACHED);
        memoization_state.note_memoized_function((SubLObject)reformulator_hub.$sym32$UNCANONICALIZE_RL_EXPRESSION_CACHED);
        sunit_external.define_test_category((SubLObject)reformulator_hub.$str40$RL_EL_mismatch_substitution, (SubLObject)reformulator_hub.UNPROVIDED);
        sunit_external.define_test_category((SubLObject)reformulator_hub.$str41$Restrict_reformulation_inside_mod, (SubLObject)reformulator_hub.UNPROVIDED);
        sunit_external.define_test_category((SubLObject)reformulator_hub.$str42$Uniquify_variables, (SubLObject)reformulator_hub.UNPROVIDED);
        sunit_external.define_test_suite((SubLObject)reformulator_hub.$str43$reformulator_hub_test_suite, (SubLObject)ConsesLow.list((SubLObject)reformulator_hub.$str40$RL_EL_mismatch_substitution, (SubLObject)reformulator_hub.$str41$Restrict_reformulation_inside_mod, (SubLObject)reformulator_hub.$str42$Uniquify_variables), (SubLObject)reformulator_hub.UNPROVIDED, (SubLObject)reformulator_hub.UNPROVIDED);
        return (SubLObject)reformulator_hub.NIL;
    }
    
    public void declareFunctions() {
        declare_reformulator_hub_file();
    }
    
    public void initializeVariables() {
        init_reformulator_hub_file();
    }
    
    public void runTopLevelForms() {
        setup_reformulator_hub_file();
    }
    
    static {
        me = (SubLFile)new reformulator_hub();
        reformulator_hub.$reformulator_timeout_time$ = null;
        reformulator_hub.$all_kb_modal_operators_caching_state$ = null;
        reformulator_hub.$rl_mt$ = null;
        reformulator_hub.$rl_old$ = null;
        reformulator_hub.$rl_new$ = null;
        reformulator_hub.$ref_trace_level$ = null;
        reformulator_hub.$ignore_modules_unless_focussed$ = null;
        $sym0$VARIABLE_P = SubLObjectFactory.makeSymbol("VARIABLE-P");
        $str1$The_expression__s_contains_an_HL_ = SubLObjectFactory.makeString("The expression ~s contains an HL variable, and the CycL reformulator cannot handle it.");
        $str2$reformulate_cycl_cannot_be_called = SubLObjectFactory.makeString("reformulate-cycl cannot be called when the Cyc KB does not contain the knowledge necessary for reformulation.");
        $kw3$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw4$FALSE = SubLObjectFactory.makeKeyword("FALSE");
        $kw5$UNLESS_REWRITE_OF = SubLObjectFactory.makeKeyword("UNLESS-REWRITE-OF");
        $sym6$MEMOIZATION_STATE_P = SubLObjectFactory.makeSymbol("MEMOIZATION-STATE-P");
        $kw7$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $kw8$ILL_FORMED = SubLObjectFactory.makeKeyword("ILL-FORMED");
        $sym9$ALL_KB_MODAL_OPERATORS = SubLObjectFactory.makeSymbol("ALL-KB-MODAL-OPERATORS");
        $const10$ModalOperator = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ModalOperator"));
        $const11$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $sym12$_ALL_KB_MODAL_OPERATORS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*ALL-KB-MODAL-OPERATORS-CACHING-STATE*");
        $str13$The_reformulator_currently_cannot = SubLObjectFactory.makeString("The reformulator currently cannot handle the n-conjuncts problem.");
        $kw14$NONE = SubLObjectFactory.makeKeyword("NONE");
        $sym15$CONTAINS_OLD_RL_ = SubLObjectFactory.makeSymbol("CONTAINS-OLD-RL?");
        $sym16$SUBST_NEW_RL = SubLObjectFactory.makeSymbol("SUBST-NEW-RL");
        $sym17$REFORMULATE_EXPRESSION = SubLObjectFactory.makeSymbol("REFORMULATE-EXPRESSION");
        $kw18$APPLY_FIRST_RECURSIVELY = SubLObjectFactory.makeKeyword("APPLY-FIRST-RECURSIVELY");
        $int19$64 = SubLObjectFactory.makeInteger(64);
        $kw20$FOCUS = SubLObjectFactory.makeKeyword("FOCUS");
        $kw21$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $list22 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WffViolationResolutionRLModule")));
        $sym23$_ = SubLObjectFactory.makeSymbol("<");
        $sym24$CDR = SubLObjectFactory.makeSymbol("CDR");
        $sym25$CANONICALIZE_REFORMULATOR_EXPRESSION_CACHED = SubLObjectFactory.makeSymbol("CANONICALIZE-REFORMULATOR-EXPRESSION-CACHED");
        $kw26$ALL = SubLObjectFactory.makeKeyword("ALL");
        $kw27$ARITY = SubLObjectFactory.makeKeyword("ARITY");
        $kw28$KB = SubLObjectFactory.makeKeyword("KB");
        $const29$reformulatorEquals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("reformulatorEquals"));
        $const30$reformulatorEquiv = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("reformulatorEquiv"));
        $sym31$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym32$UNCANONICALIZE_RL_EXPRESSION_CACHED = SubLObjectFactory.makeSymbol("UNCANONICALIZE-RL-EXPRESSION-CACHED");
        $sym33$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $sym34$RL_EVALUATABLE_EXPRESSION_ = SubLObjectFactory.makeSymbol("RL-EVALUATABLE-EXPRESSION?");
        $sym35$TRANSFORM_EVALUATION_EXPRESSION = SubLObjectFactory.makeSymbol("TRANSFORM-EVALUATION-EXPRESSION");
        $const36$evaluateAtEL = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluateAtEL"));
        $sym37$RL_UNEVALUATABLE_EXPRESSION_ = SubLObjectFactory.makeSymbol("RL-UNEVALUATABLE-EXPRESSION?");
        $str38$All___s__Arity___s__KB___s__None_ = SubLObjectFactory.makeString("All: ~s  Arity: ~s  KB: ~s  None: ~s~%");
        $str39$Average_number_of_FORTs_mentioned = SubLObjectFactory.makeString("Average number of FORTs mentioned in reformulator rules: ~s");
        $str40$RL_EL_mismatch_substitution = SubLObjectFactory.makeString("RL-EL mismatch substitution");
        $str41$Restrict_reformulation_inside_mod = SubLObjectFactory.makeString("Restrict reformulation inside modals");
        $str42$Uniquify_variables = SubLObjectFactory.makeString("Uniquify variables");
        $str43$reformulator_hub_test_suite = SubLObjectFactory.makeString("reformulator-hub-test-suite");
    }
}

/*

	Total time: 328 ms
	
*/