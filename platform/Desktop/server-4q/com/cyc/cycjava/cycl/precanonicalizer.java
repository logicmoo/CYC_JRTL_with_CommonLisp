package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class precanonicalizer extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.precanonicalizer";
    public static final String myFingerPrint = "51cd3b68ef31d3f335bf9915d14783529c85444be5a09608497bfa6955c80dcc";
    private static final SubLSymbol $sym0$UNICODE_STRING_P;
    private static final SubLSymbol $sym1$UNICODE_STRING_TO_CYCL_SAFE_STRING;
    private static final SubLSymbol $sym2$IMMEDIATELY_EVALUATABLE_EXPRESSION_;
    private static final SubLSymbol $sym3$EXPANDIBLE_EL_RELATION_EXPRESSION_;
    private static final SubLSymbol $sym4$EL_EVALUATABLE_EXPRESSION_;
    private static final SubLSymbol $sym5$EL_IMPLICIT_META_LITERAL_SENTENCE_P;
    private static final SubLInteger $int6$32;
    private static final SubLSymbol $sym7$PRECANONICALIZATIONS_INT;
    private static final SubLSymbol $kw8$RECURSION_LIMIT_EXCEEDED;
    private static final SubLSymbol $kw9$INVALID_EXPANSION;
    private static final SubLSymbol $kw10$EL_UNEVALUATABLE_EXPRESSION;
    private static final SubLSymbol $sym11$OPAQUE_ARG_WRT_EL_TEMPLATE_OR_QUOTE_;
    private static final SubLSymbol $sym12$TRANSFORM_EVALUATION_EXPRESSION_OR_THROW;
    private static final SubLObject $const13$evaluateAtEL;
    private static final SubLSymbol $sym14$EL_UNEVALUATABLE_EXPRESSION_;
    private static final SubLSymbol $sym15$TRANSFORM_EVALUATION_EXPRESSION;
    private static final SubLObject $const16$evaluateImmediately;
    private static final SubLSymbol $sym17$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const18$EverythingPSC;
    private static final SubLSymbol $sym19$IMMEDIATELY_UNEVALUATABLE_EXPRESSION_;
    private static final SubLSymbol $sym20$IMPLICIT_META_LITERALS_OUT_INT;
    private static final SubLString $str21$_s_is_not_a_well_formed_sentence;
    private static final SubLObject $const22$exceptWhen;
    private static final SubLObject $const23$abnormal;
    private static final SubLObject $const24$TheList;
    private static final SubLObject $const25$exceptFor;
    private static final SubLObject $const26$pragmaticRequirement;
    private static final SubLObject $const27$querySentence;
    private static final SubLObject $const28$meetsPragmaticRequirement;
    private static final SubLString $str29$no_assertion_for_meta_arg___s;
    
    @SubLTranslatedFile.SubL(source = "cycl/precanonicalizer.lisp", position = 1272L)
    public static SubLObject early_precanonicalizationsP(final SubLObject sentence, final SubLObject mt) {
        return early_precanonicalization_unicode_string_applicableP(sentence, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/precanonicalizer.lisp", position = 1409L)
    public static SubLObject early_precanonicalizations(SubLObject sentence, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (precanonicalizer.NIL != early_precanonicalization_unicode_string_applicableP(sentence, mt)) {
            thread.resetMultipleValues();
            final SubLObject sentence_$1 = early_precanonicalization_unicode_string_apply(sentence, mt);
            final SubLObject mt_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            sentence = sentence_$1;
            mt = mt_$2;
        }
        return Values.values(sentence, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/precanonicalizer.lisp", position = 1696L)
    public static SubLObject early_precanonicalization_unicode_string_applicableP(final SubLObject sentence, final SubLObject mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(precanonicalizer.NIL != cycl_utilities.expression_find_if((SubLObject)precanonicalizer.$sym0$UNICODE_STRING_P, sentence, (SubLObject)precanonicalizer.UNPROVIDED, (SubLObject)precanonicalizer.UNPROVIDED) || precanonicalizer.NIL != cycl_utilities.expression_find_if((SubLObject)precanonicalizer.$sym0$UNICODE_STRING_P, mt, (SubLObject)precanonicalizer.UNPROVIDED, (SubLObject)precanonicalizer.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/precanonicalizer.lisp", position = 1890L)
    public static SubLObject early_precanonicalization_unicode_string_apply(final SubLObject sentence, final SubLObject mt) {
        return Values.values(cycl_utilities.expression_ntransform(sentence, (SubLObject)precanonicalizer.$sym0$UNICODE_STRING_P, (SubLObject)precanonicalizer.$sym1$UNICODE_STRING_TO_CYCL_SAFE_STRING, (SubLObject)precanonicalizer.T, (SubLObject)precanonicalizer.UNPROVIDED), cycl_utilities.expression_ntransform(mt, (SubLObject)precanonicalizer.$sym0$UNICODE_STRING_P, (SubLObject)precanonicalizer.$sym1$UNICODE_STRING_TO_CYCL_SAFE_STRING, (SubLObject)precanonicalizer.T, (SubLObject)precanonicalizer.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/precanonicalizer.lisp", position = 2166L)
    public static SubLObject immediate_precanonicalizationsP(final SubLObject form) {
        return list_utilities.tree_find_if((SubLObject)precanonicalizer.$sym2$IMMEDIATELY_EVALUATABLE_EXPRESSION_, form, (SubLObject)precanonicalizer.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/precanonicalizer.lisp", position = 2355L)
    public static SubLObject immediate_precanonicalizations(final SubLObject form) {
        if (precanonicalizer.NIL != immediate_precanonicalizationsP(form)) {
            return immediately_evaluatable_expressions_out(form);
        }
        return form;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/precanonicalizer.lisp", position = 2535L)
    public static SubLObject precanonicalizationsP(final SubLObject formula, final SubLObject mt, SubLObject formula_is_an_asent_with_no_subformulasP) {
        if (formula_is_an_asent_with_no_subformulasP == precanonicalizer.UNPROVIDED) {
            formula_is_an_asent_with_no_subformulasP = (SubLObject)precanonicalizer.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (precanonicalizer.NIL == hlmt.hlmt_p(mt)) {
            return (SubLObject)precanonicalizer.NIL;
        }
        SubLObject resultP = (SubLObject)precanonicalizer.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (precanonicalizer.NIL != el_utilities.el_formula_p(formula)) {
                if (precanonicalizer.NIL != ((precanonicalizer.NIL != formula_is_an_asent_with_no_subformulasP) ? verbosifier.expandible_el_relation_expressionP(formula, (SubLObject)precanonicalizer.UNPROVIDED) : cycl_utilities.formula_find_if(Symbols.symbol_function((SubLObject)precanonicalizer.$sym3$EXPANDIBLE_EL_RELATION_EXPRESSION_), formula, (SubLObject)precanonicalizer.NIL, (SubLObject)precanonicalizer.UNPROVIDED))) {
                    resultP = (SubLObject)precanonicalizer.T;
                }
                else if (precanonicalizer.NIL == formula_is_an_asent_with_no_subformulasP && precanonicalizer.NIL != cycl_utilities.formula_find_if(Symbols.symbol_function((SubLObject)precanonicalizer.$sym4$EL_EVALUATABLE_EXPRESSION_), formula, (SubLObject)precanonicalizer.NIL, (SubLObject)precanonicalizer.UNPROVIDED)) {
                    resultP = (SubLObject)precanonicalizer.T;
                }
                else if (precanonicalizer.NIL != ((precanonicalizer.NIL != formula_is_an_asent_with_no_subformulasP) ? el_utilities.el_implicit_meta_literal_sentence_p(formula) : cycl_utilities.formula_find_if(Symbols.symbol_function((SubLObject)precanonicalizer.$sym5$EL_IMPLICIT_META_LITERAL_SENTENCE_P), formula, (SubLObject)precanonicalizer.NIL, (SubLObject)precanonicalizer.UNPROVIDED))) {
                    resultP = (SubLObject)precanonicalizer.T;
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return resultP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/precanonicalizer.lisp", position = 3726L)
    public static SubLObject safe_precanonicalizations(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = formula;
        SubLObject result_mt = mt;
        if (precanonicalizer.NIL != precanonicalizationsP(formula, mt, (SubLObject)precanonicalizer.UNPROVIDED)) {
            final SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
            final SubLObject _prev_bind_2 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
            try {
                czer_vars.$el_symbol_suffix_table$.bind((precanonicalizer.NIL != czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread)) ? czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread) : Hashtables.make_hash_table((SubLObject)precanonicalizer.$int6$32, Symbols.symbol_function((SubLObject)precanonicalizer.EQL), (SubLObject)precanonicalizer.UNPROVIDED), thread);
                czer_vars.$standardize_variables_memory$.bind((SubLObject)((precanonicalizer.NIL != czer_vars.$standardize_variables_memory$.getDynamicValue(thread)) ? czer_vars.$standardize_variables_memory$.getDynamicValue(thread) : precanonicalizer.NIL), thread);
                final SubLObject local_state = czer_vars.$czer_memoization_state$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$3 = memoization_state.$memoization_state$.currentBinding(thread);
                try {
                    memoization_state.$memoization_state$.bind(local_state, thread);
                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                    try {
                        thread.resetMultipleValues();
                        final SubLObject result_$4 = precanonicalizations_int(formula, mt);
                        final SubLObject result_mt_$5 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        result = result_$4;
                        result_mt = result_mt_$5;
                    }
                    finally {
                        final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)precanonicalizer.T, thread);
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
                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$3, thread);
                }
            }
            finally {
                czer_vars.$standardize_variables_memory$.rebind(_prev_bind_2, thread);
                czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0, thread);
            }
        }
        return Values.values(result, result_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/precanonicalizer.lisp", position = 4293L)
    public static SubLObject precanonicalizations(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_formula = formula;
        SubLObject new_mt = mt;
        if (precanonicalizer.NIL != precanonicalizationsP(formula, mt, (SubLObject)precanonicalizer.UNPROVIDED)) {
            final SubLObject local_state = czer_vars.$czer_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    thread.resetMultipleValues();
                    final SubLObject new_formula_$7 = precanonicalizations_int(formula, mt);
                    final SubLObject new_mt_$8 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    new_formula = new_formula_$7;
                    new_mt = new_mt_$8;
                }
                finally {
                    final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)precanonicalizer.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
            }
        }
        return Values.values(new_formula, new_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/precanonicalizer.lisp", position = 5075L)
    public static SubLObject precanonicalizations_int_internal(SubLObject formula, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        formula = el_utilities.copy_formula(formula);
        mt = hlmt.copy_hlmt(mt);
        formula = simplifier.simplify_sequence_variables_1(formula);
        if (precanonicalizer.NIL != czer_vars.$expand_el_relationsP$.getDynamicValue(thread)) {
            SubLObject error = (SubLObject)precanonicalizer.NIL;
            try {
                thread.throwStack.push(precanonicalizer.$kw8$RECURSION_LIMIT_EXCEEDED);
                try {
                    thread.throwStack.push(precanonicalizer.$kw9$INVALID_EXPANSION);
                    thread.resetMultipleValues();
                    final SubLObject formula_$10 = verbosifier.el_relations_out(formula, mt, (SubLObject)precanonicalizer.UNPROVIDED, (SubLObject)precanonicalizer.UNPROVIDED);
                    final SubLObject mt_$11 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    formula = formula_$10;
                    mt = mt_$11;
                }
                catch (Throwable ccatch_env_var) {
                    error = Errors.handleThrowable(ccatch_env_var, (SubLObject)precanonicalizer.$kw9$INVALID_EXPANSION);
                }
                finally {
                    thread.throwStack.pop();
                }
            }
            catch (Throwable ccatch_env_var) {
                error = Errors.handleThrowable(ccatch_env_var, (SubLObject)precanonicalizer.$kw8$RECURSION_LIMIT_EXCEEDED);
            }
            finally {
                thread.throwStack.pop();
            }
            if (precanonicalizer.NIL != error) {
                if (precanonicalizer.NIL != wff_vars.$accumulating_wff_violationsP$.getDynamicValue(thread)) {
                    wff.note_wff_violation(error);
                }
                return Values.values((SubLObject)precanonicalizer.NIL, mt);
            }
            formula = el_evaluatable_expressions_out(formula);
            mt = el_evaluatable_expressions_out(mt);
        }
        if (precanonicalizer.NIL != formula && precanonicalizer.NIL != mt) {
            formula = implicit_meta_literals_out(formula);
            final SubLObject _prev_bind_0 = czer_vars.$simplify_non_wff_literalP$.currentBinding(thread);
            try {
                czer_vars.$simplify_non_wff_literalP$.bind((SubLObject)precanonicalizer.NIL, thread);
                formula = simplifier.simplify_cycl_sentence(formula, (SubLObject)precanonicalizer.UNPROVIDED);
            }
            finally {
                czer_vars.$simplify_non_wff_literalP$.rebind(_prev_bind_0, thread);
            }
        }
        return Values.values(formula, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/precanonicalizer.lisp", position = 5075L)
    public static SubLObject precanonicalizations_int(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)precanonicalizer.NIL;
        if (precanonicalizer.NIL == v_memoization_state) {
            return precanonicalizations_int_internal(formula, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)precanonicalizer.$sym7$PRECANONICALIZATIONS_INT, (SubLObject)precanonicalizer.UNPROVIDED);
        if (precanonicalizer.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)precanonicalizer.$sym7$PRECANONICALIZATIONS_INT, (SubLObject)precanonicalizer.TWO_INTEGER, (SubLObject)precanonicalizer.NIL, (SubLObject)precanonicalizer.EQUAL, (SubLObject)precanonicalizer.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)precanonicalizer.$sym7$PRECANONICALIZATIONS_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(formula, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)precanonicalizer.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)precanonicalizer.NIL;
            collision = cdolist_list_var.first();
            while (precanonicalizer.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (formula.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (precanonicalizer.NIL != cached_args && precanonicalizer.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(precanonicalizations_int_internal(formula, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(formula, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/precanonicalizer.lisp", position = 6611L)
    public static SubLObject el_evaluatable_expressions_out(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error = (SubLObject)precanonicalizer.NIL;
        SubLObject result = (SubLObject)precanonicalizer.NIL;
        try {
            thread.throwStack.push(precanonicalizer.$kw10$EL_UNEVALUATABLE_EXPRESSION);
            final SubLObject _prev_bind_0 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
            try {
                cycl_utilities.$opaque_arg_function$.bind((SubLObject)precanonicalizer.$sym11$OPAQUE_ARG_WRT_EL_TEMPLATE_OR_QUOTE_, thread);
                result = cycl_utilities.expression_ntransform(formula, Symbols.symbol_function((SubLObject)precanonicalizer.$sym4$EL_EVALUATABLE_EXPRESSION_), Symbols.symbol_function((SubLObject)precanonicalizer.$sym12$TRANSFORM_EVALUATION_EXPRESSION_OR_THROW), (SubLObject)precanonicalizer.UNPROVIDED, (SubLObject)precanonicalizer.UNPROVIDED);
            }
            finally {
                cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, (SubLObject)precanonicalizer.$kw10$EL_UNEVALUATABLE_EXPRESSION);
        }
        finally {
            thread.throwStack.pop();
        }
        if (precanonicalizer.NIL != error) {
            if (precanonicalizer.NIL != wff_vars.$accumulating_wff_violationsP$.getDynamicValue(thread)) {
                wff.note_wff_violation(error);
            }
            return (SubLObject)precanonicalizer.NIL;
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/precanonicalizer.lisp", position = 7329L)
    public static SubLObject transform_evaluation_expression_or_throw(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject value = relation_evaluation.cyc_evaluate(expression);
        final SubLObject validP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (precanonicalizer.NIL != validP) {
            return value;
        }
        return Dynamic.sublisp_throw((SubLObject)precanonicalizer.$kw10$EL_UNEVALUATABLE_EXPRESSION, (SubLObject)ConsesLow.list((SubLObject)precanonicalizer.$kw10$EL_UNEVALUATABLE_EXPRESSION, expression));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/precanonicalizer.lisp", position = 7760L)
    public static SubLObject transform_evaluation_expression(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject value = relation_evaluation.cyc_evaluate(expression);
        final SubLObject validP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (precanonicalizer.NIL != validP) {
            return value;
        }
        return expression;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/precanonicalizer.lisp", position = 7967L)
    public static SubLObject el_evaluatable_expressionP(final SubLObject v_object, SubLObject mt) {
        if (mt == precanonicalizer.UNPROVIDED) {
            mt = (SubLObject)precanonicalizer.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(precanonicalizer.NIL != el_evaluatable_functorP(cycl_utilities.formula_arg0(v_object), mt) && precanonicalizer.NIL != el_utilities.evaluatable_el_expressionP(v_object) && precanonicalizer.NIL != el_evaluatable_subexpressionsP(v_object, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/precanonicalizer.lisp", position = 8191L)
    public static SubLObject el_evaluatable_functorP(final SubLObject v_object, SubLObject mt) {
        if (mt == precanonicalizer.UNPROVIDED) {
            mt = (SubLObject)precanonicalizer.NIL;
        }
        if (precanonicalizer.NIL != forts.fort_p(v_object)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(precanonicalizer.NIL != el_evaluatable_functor_somewhereP(v_object) && precanonicalizer.NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(v_object, precanonicalizer.$const13$evaluateAtEL, mt, (SubLObject)precanonicalizer.UNPROVIDED, (SubLObject)precanonicalizer.UNPROVIDED));
        }
        return (SubLObject)precanonicalizer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/precanonicalizer.lisp", position = 8408L)
    public static SubLObject el_evaluatable_functor_somewhereP(final SubLObject v_object) {
        return somewhere_cache.some_pred_assertion_somewhereP(precanonicalizer.$const13$evaluateAtEL, v_object, (SubLObject)precanonicalizer.ONE_INTEGER, (SubLObject)precanonicalizer.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/precanonicalizer.lisp", position = 8534L)
    public static SubLObject el_evaluatable_subexpressionsP(final SubLObject v_object, SubLObject mt) {
        if (mt == precanonicalizer.UNPROVIDED) {
            mt = (SubLObject)precanonicalizer.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject el_evaluatableP = (SubLObject)precanonicalizer.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            el_evaluatableP = (SubLObject)SubLObjectFactory.makeBoolean(precanonicalizer.NIL == cycl_utilities.expression_find_if((SubLObject)precanonicalizer.$sym14$EL_UNEVALUATABLE_EXPRESSION_, v_object, (SubLObject)precanonicalizer.UNPROVIDED, (SubLObject)precanonicalizer.UNPROVIDED));
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return el_evaluatableP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/precanonicalizer.lisp", position = 8778L)
    public static SubLObject el_unevaluatable_expressionP(final SubLObject v_object, SubLObject mt) {
        if (mt == precanonicalizer.UNPROVIDED) {
            mt = (SubLObject)precanonicalizer.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(precanonicalizer.NIL != el_utilities.el_formula_p(v_object) && precanonicalizer.NIL != relation_evaluation.evaluatable_expressionP(v_object) && precanonicalizer.NIL == el_evaluatable_functorP(cycl_utilities.formula_arg0(v_object), mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/precanonicalizer.lisp", position = 8987L)
    public static SubLObject immediately_evaluatable_expressions_out(final SubLObject formula) {
        return cycl_utilities.expression_transform(formula, (SubLObject)precanonicalizer.$sym2$IMMEDIATELY_EVALUATABLE_EXPRESSION_, (SubLObject)precanonicalizer.$sym15$TRANSFORM_EVALUATION_EXPRESSION, (SubLObject)precanonicalizer.UNPROVIDED, (SubLObject)precanonicalizer.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/precanonicalizer.lisp", position = 9474L)
    public static SubLObject immediately_evaluatable_expressionP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(precanonicalizer.NIL != immediately_evaluatable_functorP(cycl_utilities.formula_arg0(v_object)) && precanonicalizer.NIL != el_utilities.evaluatable_el_expressionP(v_object) && precanonicalizer.NIL != immediately_evaluatable_subexpressionsP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/precanonicalizer.lisp", position = 9706L)
    public static SubLObject immediately_evaluatable_functorP(final SubLObject v_object) {
        if (precanonicalizer.NIL != forts.fort_p(v_object)) {
            return immediately_evaluatable_functor_somewhereP(v_object);
        }
        return (SubLObject)precanonicalizer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/precanonicalizer.lisp", position = 9854L)
    public static SubLObject immediately_evaluatable_functor_somewhereP(final SubLObject v_object) {
        return somewhere_cache.some_pred_assertion_somewhereP(precanonicalizer.$const16$evaluateImmediately, v_object, (SubLObject)precanonicalizer.ONE_INTEGER, (SubLObject)precanonicalizer.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/precanonicalizer.lisp", position = 9996L)
    public static SubLObject immediately_evaluatable_subexpressionsP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject immediately_evaluatableP = (SubLObject)precanonicalizer.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)precanonicalizer.$sym17$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(precanonicalizer.$const18$EverythingPSC, thread);
            immediately_evaluatableP = (SubLObject)SubLObjectFactory.makeBoolean(precanonicalizer.NIL == cycl_utilities.expression_find_if((SubLObject)precanonicalizer.$sym19$IMMEDIATELY_UNEVALUATABLE_EXPRESSION_, v_object, (SubLObject)precanonicalizer.UNPROVIDED, (SubLObject)precanonicalizer.UNPROVIDED));
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return immediately_evaluatableP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/precanonicalizer.lisp", position = 10266L)
    public static SubLObject immediately_unevaluatable_expressionP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(precanonicalizer.NIL != el_utilities.el_formula_p(v_object) && precanonicalizer.NIL != relation_evaluation.evaluatable_expressionP(v_object) && precanonicalizer.NIL == immediately_evaluatable_functorP(cycl_utilities.formula_arg0(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/precanonicalizer.lisp", position = 10477L)
    public static SubLObject implicit_meta_literals_out(final SubLObject sentence) {
        if (precanonicalizer.NIL == cycl_utilities.formula_find_if(Symbols.symbol_function((SubLObject)precanonicalizer.$sym5$EL_IMPLICIT_META_LITERAL_SENTENCE_P), sentence, (SubLObject)precanonicalizer.NIL, (SubLObject)precanonicalizer.UNPROVIDED)) {
            return sentence;
        }
        final SubLObject seqvar = el_utilities.sequence_var(sentence, (SubLObject)precanonicalizer.UNPROVIDED);
        final SubLObject sentence_$12 = (precanonicalizer.NIL != seqvar) ? el_utilities.strip_sequence_var(sentence) : sentence;
        SubLObject result = (SubLObject)precanonicalizer.NIL;
        result = implicit_meta_literals_out_int(sentence_$12);
        if (precanonicalizer.NIL != seqvar) {
            return el_utilities.nadd_sequence_var_to_end(seqvar, result);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/precanonicalizer.lisp", position = 10940L)
    public static SubLObject implicit_meta_literals_out_int(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)precanonicalizer.NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind((SubLObject)precanonicalizer.NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind((SubLObject)precanonicalizer.NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind((SubLObject)precanonicalizer.NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind((SubLObject)precanonicalizer.NIL, thread);
            if (precanonicalizer.NIL != el_utilities.el_negation_p(sentence)) {
                result = el_utilities.make_negation(implicit_meta_literals_out_int(cycl_utilities.sentence_arg1(sentence, (SubLObject)precanonicalizer.UNPROVIDED)));
            }
            else if (precanonicalizer.NIL != el_utilities.el_conjunction_p(sentence)) {
                result = simplifier.conjoin(Mapping.mapcar(Symbols.symbol_function((SubLObject)precanonicalizer.$sym20$IMPLICIT_META_LITERALS_OUT_INT), cycl_utilities.sentence_args(sentence, (SubLObject)precanonicalizer.UNPROVIDED)), (SubLObject)precanonicalizer.UNPROVIDED);
            }
            else if (precanonicalizer.NIL != el_utilities.el_disjunction_p(sentence)) {
                result = simplifier.disjoin(Mapping.mapcar(Symbols.symbol_function((SubLObject)precanonicalizer.$sym20$IMPLICIT_META_LITERALS_OUT_INT), cycl_utilities.sentence_args(sentence, (SubLObject)precanonicalizer.UNPROVIDED)), (SubLObject)precanonicalizer.UNPROVIDED);
            }
            else if (precanonicalizer.NIL != el_utilities.el_implication_p(sentence)) {
                result = el_utilities.make_implication(implicit_meta_literals_out_int(cycl_utilities.sentence_arg1(sentence, (SubLObject)precanonicalizer.UNPROVIDED)), implicit_meta_literals_out_int(cycl_utilities.sentence_arg2(sentence, (SubLObject)precanonicalizer.UNPROVIDED)));
            }
            else if (precanonicalizer.NIL != el_utilities.el_implicit_meta_literal_sentence_p(sentence)) {
                result = implicit_meta_literals_out_for_implict_meta_literal_sentence(sentence);
            }
            else if (precanonicalizer.NIL != el_grammar.el_regularly_quantified_sentence_p(sentence)) {
                result = el_utilities.make_regularly_quantified_sentence(el_utilities.sentence_quantifier(sentence), el_utilities.quantified_var(sentence), implicit_meta_literals_out_int(el_utilities.quantified_sub_sentence(sentence)));
            }
            else if (precanonicalizer.NIL != el_utilities.el_bounded_existential_p(sentence)) {
                result = el_utilities.make_bounded_existential(el_utilities.sentence_quantifier(sentence), el_utilities.existential_bound(sentence), el_utilities.quantified_var(sentence), implicit_meta_literals_out_int(el_utilities.quantified_sub_sentence(sentence)));
            }
            else if (precanonicalizer.NIL != el_utilities.subl_escape_p(sentence)) {
                result = sentence;
            }
            else if (precanonicalizer.NIL != el_grammar.el_atomic_sentence_p(sentence)) {
                result = sentence;
            }
            else if (precanonicalizer.NIL != el_grammar.non_el_formula_sentence_p(sentence)) {
                result = sentence;
            }
            else {
                el_utilities.el_error((SubLObject)precanonicalizer.FOUR_INTEGER, (SubLObject)precanonicalizer.$str21$_s_is_not_a_well_formed_sentence, sentence, (SubLObject)precanonicalizer.UNPROVIDED, (SubLObject)precanonicalizer.UNPROVIDED);
                result = sentence;
            }
        }
        finally {
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/precanonicalizer.lisp", position = 12812L)
    public static SubLObject implicit_meta_literals_out_for_implict_meta_literal_sentence(final SubLObject sentence) {
        final SubLObject rule = cycl_utilities.sentence_arg2(sentence, (SubLObject)precanonicalizer.UNPROVIDED);
        final SubLObject assertions = czer_meta.find_assertions_cycl(rule, (SubLObject)precanonicalizer.UNPROVIDED);
        SubLObject abnormals = (SubLObject)precanonicalizer.NIL;
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = (SubLObject)precanonicalizer.NIL;
        assertion = cdolist_list_var.first();
        while (precanonicalizer.NIL != cdolist_list_var) {
            if (precanonicalizer.NIL == term.kb_assertionP(assertion)) {
                el_utilities.el_error((SubLObject)precanonicalizer.THREE_INTEGER, (SubLObject)precanonicalizer.$str29$no_assertion_for_meta_arg___s, rule, (SubLObject)precanonicalizer.UNPROVIDED, (SubLObject)precanonicalizer.UNPROVIDED);
                return sentence;
            }
            final SubLObject pcase_var = cycl_utilities.atomic_sentence_predicate(sentence);
            if (pcase_var.eql(precanonicalizer.$const22$exceptWhen)) {
                abnormals = (SubLObject)ConsesLow.cons(el_utilities.make_implication(implicit_meta_literals_out_int(cycl_utilities.sentence_arg1(sentence, (SubLObject)precanonicalizer.UNPROVIDED)), el_utilities.make_binary_formula(precanonicalizer.$const23$abnormal, el_utilities.make_el_formula(precanonicalizer.$const24$TheList, assertions_high.assertion_el_variables(assertion), (SubLObject)precanonicalizer.UNPROVIDED), assertion)), abnormals);
            }
            else if (pcase_var.eql(precanonicalizer.$const25$exceptFor)) {
                abnormals = (SubLObject)ConsesLow.cons(el_utilities.make_binary_formula(precanonicalizer.$const23$abnormal, el_utilities.make_unary_formula(precanonicalizer.$const24$TheList, cycl_utilities.sentence_arg1(sentence, (SubLObject)precanonicalizer.UNPROVIDED)), assertion), abnormals);
            }
            else if (pcase_var.eql(precanonicalizer.$const26$pragmaticRequirement)) {
                abnormals = (SubLObject)ConsesLow.cons(el_utilities.make_implication(el_utilities.make_unary_formula(precanonicalizer.$const27$querySentence, implicit_meta_literals_out_int(cycl_utilities.sentence_arg1(sentence, (SubLObject)precanonicalizer.UNPROVIDED))), el_utilities.make_binary_formula(precanonicalizer.$const28$meetsPragmaticRequirement, el_utilities.make_el_formula(precanonicalizer.$const24$TheList, assertions_high.assertion_el_variables(assertion), (SubLObject)precanonicalizer.UNPROVIDED), assertion)), abnormals);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        if (precanonicalizer.NIL == abnormals) {
            return sentence;
        }
        if (precanonicalizer.NIL != list_utilities.singletonP(abnormals)) {
            return abnormals.first();
        }
        return simplifier.conjoin(abnormals, (SubLObject)precanonicalizer.UNPROVIDED);
    }
    
    public static SubLObject declare_precanonicalizer_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.precanonicalizer", "early_precanonicalizationsP", "EARLY-PRECANONICALIZATIONS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.precanonicalizer", "early_precanonicalizations", "EARLY-PRECANONICALIZATIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.precanonicalizer", "early_precanonicalization_unicode_string_applicableP", "EARLY-PRECANONICALIZATION-UNICODE-STRING-APPLICABLE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.precanonicalizer", "early_precanonicalization_unicode_string_apply", "EARLY-PRECANONICALIZATION-UNICODE-STRING-APPLY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.precanonicalizer", "immediate_precanonicalizationsP", "IMMEDIATE-PRECANONICALIZATIONS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.precanonicalizer", "immediate_precanonicalizations", "IMMEDIATE-PRECANONICALIZATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.precanonicalizer", "precanonicalizationsP", "PRECANONICALIZATIONS?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.precanonicalizer", "safe_precanonicalizations", "SAFE-PRECANONICALIZATIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.precanonicalizer", "precanonicalizations", "PRECANONICALIZATIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.precanonicalizer", "precanonicalizations_int_internal", "PRECANONICALIZATIONS-INT-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.precanonicalizer", "precanonicalizations_int", "PRECANONICALIZATIONS-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.precanonicalizer", "el_evaluatable_expressions_out", "EL-EVALUATABLE-EXPRESSIONS-OUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.precanonicalizer", "transform_evaluation_expression_or_throw", "TRANSFORM-EVALUATION-EXPRESSION-OR-THROW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.precanonicalizer", "transform_evaluation_expression", "TRANSFORM-EVALUATION-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.precanonicalizer", "el_evaluatable_expressionP", "EL-EVALUATABLE-EXPRESSION?", 1, 1, false);
        new $el_evaluatable_expressionP$UnaryFunction();
        new $el_evaluatable_expressionP$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.precanonicalizer", "el_evaluatable_functorP", "EL-EVALUATABLE-FUNCTOR?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.precanonicalizer", "el_evaluatable_functor_somewhereP", "EL-EVALUATABLE-FUNCTOR-SOMEWHERE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.precanonicalizer", "el_evaluatable_subexpressionsP", "EL-EVALUATABLE-SUBEXPRESSIONS?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.precanonicalizer", "el_unevaluatable_expressionP", "EL-UNEVALUATABLE-EXPRESSION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.precanonicalizer", "immediately_evaluatable_expressions_out", "IMMEDIATELY-EVALUATABLE-EXPRESSIONS-OUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.precanonicalizer", "immediately_evaluatable_expressionP", "IMMEDIATELY-EVALUATABLE-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.precanonicalizer", "immediately_evaluatable_functorP", "IMMEDIATELY-EVALUATABLE-FUNCTOR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.precanonicalizer", "immediately_evaluatable_functor_somewhereP", "IMMEDIATELY-EVALUATABLE-FUNCTOR-SOMEWHERE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.precanonicalizer", "immediately_evaluatable_subexpressionsP", "IMMEDIATELY-EVALUATABLE-SUBEXPRESSIONS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.precanonicalizer", "immediately_unevaluatable_expressionP", "IMMEDIATELY-UNEVALUATABLE-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.precanonicalizer", "implicit_meta_literals_out", "IMPLICIT-META-LITERALS-OUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.precanonicalizer", "implicit_meta_literals_out_int", "IMPLICIT-META-LITERALS-OUT-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.precanonicalizer", "implicit_meta_literals_out_for_implict_meta_literal_sentence", "IMPLICIT-META-LITERALS-OUT-FOR-IMPLICT-META-LITERAL-SENTENCE", 1, 0, false);
        return (SubLObject)precanonicalizer.NIL;
    }
    
    public static SubLObject init_precanonicalizer_file() {
        return (SubLObject)precanonicalizer.NIL;
    }
    
    public static SubLObject setup_precanonicalizer_file() {
        memoization_state.note_memoized_function((SubLObject)precanonicalizer.$sym7$PRECANONICALIZATIONS_INT);
        return (SubLObject)precanonicalizer.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_precanonicalizer_file();
    }
    
    @Override
	public void initializeVariables() {
        init_precanonicalizer_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_precanonicalizer_file();
    }
    
    static {
        me = (SubLFile)new precanonicalizer();
        $sym0$UNICODE_STRING_P = SubLObjectFactory.makeSymbol("UNICODE-STRING-P");
        $sym1$UNICODE_STRING_TO_CYCL_SAFE_STRING = SubLObjectFactory.makeSymbol("UNICODE-STRING-TO-CYCL-SAFE-STRING");
        $sym2$IMMEDIATELY_EVALUATABLE_EXPRESSION_ = SubLObjectFactory.makeSymbol("IMMEDIATELY-EVALUATABLE-EXPRESSION?");
        $sym3$EXPANDIBLE_EL_RELATION_EXPRESSION_ = SubLObjectFactory.makeSymbol("EXPANDIBLE-EL-RELATION-EXPRESSION?");
        $sym4$EL_EVALUATABLE_EXPRESSION_ = SubLObjectFactory.makeSymbol("EL-EVALUATABLE-EXPRESSION?");
        $sym5$EL_IMPLICIT_META_LITERAL_SENTENCE_P = SubLObjectFactory.makeSymbol("EL-IMPLICIT-META-LITERAL-SENTENCE-P");
        $int6$32 = SubLObjectFactory.makeInteger(32);
        $sym7$PRECANONICALIZATIONS_INT = SubLObjectFactory.makeSymbol("PRECANONICALIZATIONS-INT");
        $kw8$RECURSION_LIMIT_EXCEEDED = SubLObjectFactory.makeKeyword("RECURSION-LIMIT-EXCEEDED");
        $kw9$INVALID_EXPANSION = SubLObjectFactory.makeKeyword("INVALID-EXPANSION");
        $kw10$EL_UNEVALUATABLE_EXPRESSION = SubLObjectFactory.makeKeyword("EL-UNEVALUATABLE-EXPRESSION");
        $sym11$OPAQUE_ARG_WRT_EL_TEMPLATE_OR_QUOTE_ = SubLObjectFactory.makeSymbol("OPAQUE-ARG-WRT-EL-TEMPLATE-OR-QUOTE?");
        $sym12$TRANSFORM_EVALUATION_EXPRESSION_OR_THROW = SubLObjectFactory.makeSymbol("TRANSFORM-EVALUATION-EXPRESSION-OR-THROW");
        $const13$evaluateAtEL = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluateAtEL"));
        $sym14$EL_UNEVALUATABLE_EXPRESSION_ = SubLObjectFactory.makeSymbol("EL-UNEVALUATABLE-EXPRESSION?");
        $sym15$TRANSFORM_EVALUATION_EXPRESSION = SubLObjectFactory.makeSymbol("TRANSFORM-EVALUATION-EXPRESSION");
        $const16$evaluateImmediately = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluateImmediately"));
        $sym17$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const18$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym19$IMMEDIATELY_UNEVALUATABLE_EXPRESSION_ = SubLObjectFactory.makeSymbol("IMMEDIATELY-UNEVALUATABLE-EXPRESSION?");
        $sym20$IMPLICIT_META_LITERALS_OUT_INT = SubLObjectFactory.makeSymbol("IMPLICIT-META-LITERALS-OUT-INT");
        $str21$_s_is_not_a_well_formed_sentence = SubLObjectFactory.makeString("~s is not a well-formed sentence");
        $const22$exceptWhen = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("exceptWhen"));
        $const23$abnormal = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("abnormal"));
        $const24$TheList = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList"));
        $const25$exceptFor = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("exceptFor"));
        $const26$pragmaticRequirement = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pragmaticRequirement"));
        $const27$querySentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("querySentence"));
        $const28$meetsPragmaticRequirement = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("meetsPragmaticRequirement"));
        $str29$no_assertion_for_meta_arg___s = SubLObjectFactory.makeString("no assertion for meta-arg: ~s");
    }
    
    public static final class $el_evaluatable_expressionP$UnaryFunction extends UnaryFunction
    {
        public $el_evaluatable_expressionP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("EL-EVALUATABLE-EXPRESSION?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return precanonicalizer.el_evaluatable_expressionP(arg1, (SubLObject)$el_evaluatable_expressionP$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $el_evaluatable_expressionP$BinaryFunction extends BinaryFunction
    {
        public $el_evaluatable_expressionP$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("EL-EVALUATABLE-EXPRESSION?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return precanonicalizer.el_evaluatable_expressionP(arg1, arg2);
        }
    }
}

/*

	Total time: 244 ms
	
*/