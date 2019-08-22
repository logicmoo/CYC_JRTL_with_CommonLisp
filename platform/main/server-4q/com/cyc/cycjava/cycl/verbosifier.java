package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.utilities_macros.mapping_finished;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class verbosifier extends SubLTranslatedFile {
    public static final SubLFile me = new verbosifier();

    public static final String myName = "com.cyc.cycjava.cycl.verbosifier";

    public static final String myFingerPrint = "5494697d7f55c937658f3080458c27bd9738b5bdc21dc167fc64117ab7d8cf49";

    // defparameter
    private static final SubLSymbol $el_relation_recursion_limit$ = makeSymbol("*EL-RELATION-RECURSION-LIMIT*");

    // defparameter
    // Dynamically bound when we are accumulating justifications for expansions
    private static final SubLSymbol $gather_expansion_justificationsP$ = makeSymbol("*GATHER-EXPANSION-JUSTIFICATIONS?*");

    // defparameter
    // Dynamically accumulates the justification for an expansion
    private static final SubLSymbol $expansion_justification$ = makeSymbol("*EXPANSION-JUSTIFICATION*");

    private static final SubLInteger $int$212 = makeInteger(212);

    private static final SubLSymbol $sym1$EL_VIABLY_EXPANDIBLE_FORMULA_ = makeSymbol("EL-VIABLY-EXPANDIBLE-FORMULA?");

    private static final SubLSymbol $sym2$EL_VIABLY_EXPANDIBLE_EVALUATABLE_FORMULA_ = makeSymbol("EL-VIABLY-EXPANDIBLE-EVALUATABLE-FORMULA?");

    private static final SubLSymbol $TRANSFORMATION_LIMIT_EXCEEDED = makeKeyword("TRANSFORMATION-LIMIT-EXCEEDED");

    private static final SubLSymbol EL_FORMULA_EXPANSION_INT = makeSymbol("EL-FORMULA-EXPANSION-INT");

    private static final SubLSymbol $RECURSION_LIMIT_EXCEEDED = makeKeyword("RECURSION-LIMIT-EXCEEDED");

    private static final SubLSymbol $sym6$EXPANDIBLE_RELATION_EXPRESSION_ = makeSymbol("EXPANDIBLE-RELATION-EXPRESSION?");



    private static final SubLList $list8 = list(list(makeSymbol("*GATHER-EXPANSION-JUSTIFICATIONS?*"), T), list(makeSymbol("*EXPANSION-JUSTIFICATION*"), NIL));

    private static final SubLSymbol $sym9$EXPANDIBLE_EL_RELATION_EXPRESSION_ = makeSymbol("EXPANDIBLE-EL-RELATION-EXPRESSION?");





    private static final SubLObject $$expansion = reader_make_constant_shell(makeString("expansion"));

    private static final SubLObject $$expansionDefn = reader_make_constant_shell(makeString("expansionDefn"));

    private static final SubLString $str14$Trying_to_expand_a_recursive_EL_r = makeString("Trying to expand a recursive EL relation, hit the recursion limit ~D while expanding ~A~%");







    private static final SubLSymbol GENERIC_ARG_NUM = makeSymbol("GENERIC-ARG-NUM");



    private static final SubLSymbol $sym20$EL_VAR_ = makeSymbol("EL-VAR?");

    private static final SubLSymbol EXPANSION_ARG2_ARG0_P = makeSymbol("EXPANSION-ARG2-ARG0-P");



    public static SubLObject verbosify_cycl(final SubLObject expression, SubLObject mt, SubLObject settings) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (settings == UNPROVIDED) {
            settings = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            result = el_expansion(expression, mt_relevance_macros.$mt$.getDynamicValue(thread));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject el_expansion(final SubLObject formula, final SubLObject mt) {
        return el_expansion_destructive(copy_tree(formula), hlmt.copy_hlmt(mt));
    }

    public static SubLObject el_expansion_destructive(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_formula = NIL;
        SubLObject result_mt = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
        try {
            czer_vars.$el_symbol_suffix_table$.bind(make_hash_table(FOUR_INTEGER, symbol_function(EQL), UNPROVIDED), thread);
            czer_vars.$standardize_variables_memory$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject result_formula_$1 = el_expansion_recursive(formula, mt, $el_relation_recursion_limit$.getDynamicValue(thread), ZERO_INTEGER);
            final SubLObject result_mt_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result_formula = result_formula_$1;
            result_mt = result_mt_$2;
        } finally {
            czer_vars.$standardize_variables_memory$.rebind(_prev_bind_2, thread);
            czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0, thread);
        }
        return values(result_formula, result_mt);
    }

    public static SubLObject el_expansion_one_step(final SubLObject formula, final SubLObject mt) {
        return el_expansion_one_step_destructive(copy_tree(formula), hlmt.copy_hlmt(mt));
    }

    public static SubLObject el_expansion_one_step_destructive(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_formula = formula;
        SubLObject result_mt = mt;
        final SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
        try {
            czer_vars.$el_symbol_suffix_table$.bind(make_hash_table(FOUR_INTEGER, symbol_function(EQL), UNPROVIDED), thread);
            czer_vars.$standardize_variables_memory$.bind(NIL, thread);
            if ((NIL != el_formula_p(formula)) && (NIL != el_viably_expandible_formulaP(formula))) {
                thread.resetMultipleValues();
                final SubLObject result_formula_$3 = el_expansion_int(formula, mt);
                final SubLObject result_mt_$4 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                result_formula = result_formula_$3;
                result_mt = result_mt_$4;
            }
        } finally {
            czer_vars.$standardize_variables_memory$.rebind(_prev_bind_2, thread);
            czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0, thread);
        }
        return values(result_formula, result_mt);
    }

    public static SubLObject el_expand_all(final SubLObject formula, final SubLObject mt) {
        return el_expand_all_int(formula, mt, $sym1$EL_VIABLY_EXPANDIBLE_FORMULA_);
    }

    public static SubLObject el_expand_all_evaluatable(final SubLObject formula, final SubLObject mt) {
        return el_expand_all_int(formula, mt, $sym2$EL_VIABLY_EXPANDIBLE_EVALUATABLE_FORMULA_);
    }

    public static SubLObject el_expand_all_int(final SubLObject formula, SubLObject mt, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error = NIL;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
        try {
            czer_vars.$el_symbol_suffix_table$.bind(make_hash_table(FOUR_INTEGER, symbol_function(EQL), UNPROVIDED), thread);
            czer_vars.$standardize_variables_memory$.bind(NIL, thread);
            try {
                thread.throwStack.push($TRANSFORMATION_LIMIT_EXCEEDED);
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                final SubLObject _prev_bind_0_$5 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_1_$6 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    thread.resetMultipleValues();
                    final SubLObject result_$7 = cycl_utilities.formula_and_mt_transform(formula, mt, pred, EL_FORMULA_EXPANSION_INT, NIL, $el_relation_recursion_limit$.getDynamicValue(thread));
                    final SubLObject mt_$8 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    result = result_$7;
                    mt = mt_$8;
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$6, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$5, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                error = Errors.handleThrowable(ccatch_env_var, $TRANSFORMATION_LIMIT_EXCEEDED);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            czer_vars.$standardize_variables_memory$.rebind(_prev_bind_2, thread);
            czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0, thread);
        }
        if (NIL != error) {
            return $RECURSION_LIMIT_EXCEEDED;
        }
        return values(result, mt);
    }

    public static SubLObject el_expand_all_destructive(final SubLObject formula, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error = NIL;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
        try {
            czer_vars.$el_symbol_suffix_table$.bind(make_hash_table(FOUR_INTEGER, symbol_function(EQL), UNPROVIDED), thread);
            czer_vars.$standardize_variables_memory$.bind(NIL, thread);
            try {
                thread.throwStack.push($TRANSFORMATION_LIMIT_EXCEEDED);
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                final SubLObject _prev_bind_0_$9 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_1_$10 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    thread.resetMultipleValues();
                    final SubLObject result_$11 = cycl_utilities.formula_and_mt_ntransform(formula, $sym1$EL_VIABLY_EXPANDIBLE_FORMULA_, EL_FORMULA_EXPANSION_INT, NIL, $el_relation_recursion_limit$.getDynamicValue(thread), UNPROVIDED);
                    final SubLObject mt_$12 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    result = result_$11;
                    mt = mt_$12;
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$10, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$9, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                error = Errors.handleThrowable(ccatch_env_var, $TRANSFORMATION_LIMIT_EXCEEDED);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            czer_vars.$standardize_variables_memory$.rebind(_prev_bind_2, thread);
            czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0, thread);
        }
        if (NIL != error) {
            return $RECURSION_LIMIT_EXCEEDED;
        }
        return values(result, mt);
    }

    public static SubLObject el_expandible_subformulaP(final SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject expandibleP = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            expandibleP = makeBoolean((NIL != el_formula_p(v_object)) && (NIL != cycl_utilities.formula_find_if($sym6$EXPANDIBLE_RELATION_EXPRESSION_, v_object, NIL, UNPROVIDED)));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return expandibleP;
    }

    public static SubLObject gathering_expansion_justificationsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $gather_expansion_justificationsP$.getDynamicValue(thread);
    }

    public static SubLObject possibly_note_expansion_justification_support(final SubLObject support) {
        if (NIL != gathering_expansion_justificationsP()) {
            note_expansion_justification_support(support);
        }
        return support;
    }

    public static SubLObject note_expansion_justification_support(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $expansion_justification$.setDynamicValue(cons(support, $expansion_justification$.getDynamicValue(thread)), thread);
        return support;
    }

    public static SubLObject expansion_justification() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.fast_delete_duplicates(nreverse(copy_list($expansion_justification$.getDynamicValue(thread))), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject gathering_expansion_justifications(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list8, append(body, NIL));
    }

    public static SubLObject verbosify_cycl_justified(final SubLObject expression, SubLObject mt, SubLObject settings) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (settings == UNPROVIDED) {
            settings = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject justification = NIL;
        final SubLObject _prev_bind_0 = $gather_expansion_justificationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $expansion_justification$.currentBinding(thread);
        try {
            $gather_expansion_justificationsP$.bind(T, thread);
            $expansion_justification$.bind(NIL, thread);
            result = verbosify_cycl(expression, mt, settings);
            justification = expansion_justification();
        } finally {
            $expansion_justification$.rebind(_prev_bind_2, thread);
            $gather_expansion_justificationsP$.rebind(_prev_bind_0, thread);
        }
        return values(result, justification);
    }

    public static SubLObject el_expansion_justified(final SubLObject formula, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject justification = NIL;
        final SubLObject _prev_bind_0 = $gather_expansion_justificationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $expansion_justification$.currentBinding(thread);
        try {
            $gather_expansion_justificationsP$.bind(T, thread);
            $expansion_justification$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject result_$13 = el_expansion(formula, mt);
            final SubLObject mt_$14 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = result_$13;
            mt = mt_$14;
            justification = expansion_justification();
        } finally {
            $expansion_justification$.rebind(_prev_bind_2, thread);
            $gather_expansion_justificationsP$.rebind(_prev_bind_0, thread);
        }
        return values(result, mt, justification);
    }

    public static SubLObject el_expansion_destructive_justified(final SubLObject formula, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject justification = NIL;
        final SubLObject _prev_bind_0 = $gather_expansion_justificationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $expansion_justification$.currentBinding(thread);
        try {
            $gather_expansion_justificationsP$.bind(T, thread);
            $expansion_justification$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject result_$15 = el_expansion_destructive(formula, mt);
            final SubLObject mt_$16 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = result_$15;
            mt = mt_$16;
            justification = expansion_justification();
        } finally {
            $expansion_justification$.rebind(_prev_bind_2, thread);
            $gather_expansion_justificationsP$.rebind(_prev_bind_0, thread);
        }
        return values(result, mt, justification);
    }

    public static SubLObject el_expansion_one_step_justified(final SubLObject formula, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject justification = NIL;
        final SubLObject _prev_bind_0 = $gather_expansion_justificationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $expansion_justification$.currentBinding(thread);
        try {
            $gather_expansion_justificationsP$.bind(T, thread);
            $expansion_justification$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject result_$17 = el_expansion_one_step(formula, mt_relevance_macros.$mt$.getDynamicValue(thread));
            final SubLObject mt_$18 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = result_$17;
            mt = mt_$18;
            justification = expansion_justification();
        } finally {
            $expansion_justification$.rebind(_prev_bind_2, thread);
            $gather_expansion_justificationsP$.rebind(_prev_bind_0, thread);
        }
        return values(result, mt, justification);
    }

    public static SubLObject el_expansion_one_step_destructive_justified(final SubLObject formula, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject justification = NIL;
        final SubLObject _prev_bind_0 = $gather_expansion_justificationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $expansion_justification$.currentBinding(thread);
        try {
            $gather_expansion_justificationsP$.bind(T, thread);
            $expansion_justification$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject result_$19 = el_expansion_one_step_destructive(formula, mt_relevance_macros.$mt$.getDynamicValue(thread));
            final SubLObject mt_$20 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = result_$19;
            mt = mt_$20;
            justification = expansion_justification();
        } finally {
            $expansion_justification$.rebind(_prev_bind_2, thread);
            $gather_expansion_justificationsP$.rebind(_prev_bind_0, thread);
        }
        return values(result, mt, justification);
    }

    public static SubLObject el_expand_all_justified(final SubLObject formula, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject justification = NIL;
        final SubLObject _prev_bind_0 = $gather_expansion_justificationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $expansion_justification$.currentBinding(thread);
        try {
            $gather_expansion_justificationsP$.bind(T, thread);
            $expansion_justification$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject result_$21 = el_expand_all(formula, mt_relevance_macros.$mt$.getDynamicValue(thread));
            final SubLObject mt_$22 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = result_$21;
            mt = mt_$22;
            justification = expansion_justification();
        } finally {
            $expansion_justification$.rebind(_prev_bind_2, thread);
            $gather_expansion_justificationsP$.rebind(_prev_bind_0, thread);
        }
        return values(result, mt, justification);
    }

    public static SubLObject el_expand_all_evaluatable_justified(final SubLObject formula, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject justification = NIL;
        final SubLObject _prev_bind_0 = $gather_expansion_justificationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $expansion_justification$.currentBinding(thread);
        try {
            $gather_expansion_justificationsP$.bind(T, thread);
            $expansion_justification$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject result_$23 = el_expand_all_evaluatable(formula, mt_relevance_macros.$mt$.getDynamicValue(thread));
            final SubLObject mt_$24 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = result_$23;
            mt = mt_$24;
            justification = expansion_justification();
        } finally {
            $expansion_justification$.rebind(_prev_bind_2, thread);
            $gather_expansion_justificationsP$.rebind(_prev_bind_0, thread);
        }
        return values(result, mt, justification);
    }

    public static SubLObject el_expand_all_destructive_justified(final SubLObject formula, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject justification = NIL;
        final SubLObject _prev_bind_0 = $gather_expansion_justificationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $expansion_justification$.currentBinding(thread);
        try {
            $gather_expansion_justificationsP$.bind(T, thread);
            $expansion_justification$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject result_$25 = el_expand_all_destructive(formula, mt_relevance_macros.$mt$.getDynamicValue(thread));
            final SubLObject mt_$26 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = result_$25;
            mt = mt_$26;
            justification = expansion_justification();
        } finally {
            $expansion_justification$.rebind(_prev_bind_2, thread);
            $gather_expansion_justificationsP$.rebind(_prev_bind_0, thread);
        }
        return values(result, mt, justification);
    }

    public static SubLObject el_relations_out(final SubLObject formula, final SubLObject mt, SubLObject recursion_limit, SubLObject recursion_level) {
        if (recursion_limit == UNPROVIDED) {
            recursion_limit = $el_relation_recursion_limit$.getDynamicValue();
        }
        if (recursion_level == UNPROVIDED) {
            recursion_level = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (recursion_level.numG(recursion_limit)) {
            sublisp_throw($RECURSION_LIMIT_EXCEEDED, list($RECURSION_LIMIT_EXCEEDED, recursion_level, recursion_limit));
        }
        if (NIL == el_formula_p(formula)) {
            return values(formula, mt);
        }
        if (NIL != el_viable_relation_expressionP(formula)) {
            thread.resetMultipleValues();
            final SubLObject new_formula = el_expansion_int(formula, mt);
            final SubLObject new_mt = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (formula.equal(new_formula) && mt.equal(new_mt)) {
                return values(formula, mt);
            }
            return el_relations_out(new_formula, new_mt, recursion_limit, add(ONE_INTEGER, recursion_level));
        } else
            if (NIL != mt_designating_literalP(formula)) {
                final SubLObject subsentence = designated_sentence(formula);
                final SubLObject sub_mt = designated_mt(formula);
                if (NIL != hlmt.closed_possibly_hlmt_p(sub_mt)) {
                    thread.resetMultipleValues();
                    final SubLObject new_sentence = el_relations_out(subsentence, sub_mt, UNPROVIDED, UNPROVIDED);
                    final SubLObject new_mt2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return values(new_sentence, new_mt2);
                }
                return values(formula, mt);
            } else {
                if (NIL != cycl_utilities.formula_find_if(symbol_function($sym9$EXPANDIBLE_EL_RELATION_EXPRESSION_), formula, NIL, UNPROVIDED)) {
                    SubLObject new_terms = NIL;
                    SubLObject new_formula2 = NIL;
                    final SubLObject terms = cycl_utilities.formula_terms(formula, $IGNORE);
                    SubLObject list_var = NIL;
                    SubLObject arg = NIL;
                    SubLObject psn = NIL;
                    list_var = terms;
                    arg = list_var.first();
                    for (psn = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , arg = list_var.first() , psn = number_utilities.f_1X(psn)) {
                        SubLObject new_term = arg;
                        SubLObject new_mt3 = NIL;
                        final SubLObject relation = cycl_utilities.formula_operator(formula);
                        if ((NIL == czer_utilities.leave_some_terms_at_el_for_argP(relation, psn, mt)) && (NIL == cycl_grammar.fast_quote_term_p(arg))) {
                            thread.resetMultipleValues();
                            final SubLObject new_term_$27 = el_relations_out(arg, mt, recursion_limit, add(ONE_INTEGER, recursion_level));
                            final SubLObject new_mt_$28 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            new_term = new_term_$27;
                            new_mt3 = new_mt_$28;
                        }
                        if ((NIL != new_mt3) && (NIL == hlmt.hlmt_equal(mt, new_mt3))) {
                            new_terms = cons(make_ist_sentence(new_mt3, new_term), new_terms);
                        } else {
                            new_terms = cons(new_term, new_terms);
                        }
                    }
                    new_terms = nreverse(new_terms);
                    new_formula2 = make_formula(new_terms.first(), new_terms.rest(), sequence_var(formula, UNPROVIDED));
                    return values(new_formula2, mt);
                }
                return values(formula, mt);
            }

    }

    public static SubLObject expandible_el_relation_expressionP(final SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != el_formula_p(v_object)) && (NIL != fort_types_interface.isa_el_relationP(cycl_utilities.formula_arg0(v_object), mt)));
    }

    public static SubLObject el_expandible_formulaP(final SubLObject formula) {
        return makeBoolean((NIL != el_formula_p(formula)) && (NIL != el_expandible_relationP(cycl_utilities.formula_arg0(formula))));
    }

    public static SubLObject el_viably_expandible_formulaP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == el_expandible_formulaP(formula)) {
            return NIL;
        }
        if ((NIL != has_viable_expansionP(formula)) || (NIL != has_viable_defnP(formula))) {
            return T;
        }
        if ((NIL != czer_vars.$within_canonicalizerP$.getDynamicValue(thread)) || (NIL != wff_vars.$within_wffP$.getDynamicValue(thread))) {
            sublisp_throw($INVALID_EXPANSION, list($INVALID_EXPANSION, formula, cycl_utilities.formula_operator(formula), kb_mapping_utilities.fpred_value_in_relevant_mts(cycl_utilities.formula_operator(formula), $$expansion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        return NIL;
    }

    public static SubLObject el_viably_expandible_evaluatable_formulaP(final SubLObject formula) {
        return makeBoolean((NIL != el_viably_expandible_formulaP(formula)) && (NIL != relation_evaluation.evaluatable_expressionP(formula)));
    }

    public static SubLObject el_expandible_relationP(final SubLObject v_object) {
        final SubLObject fortified_object = cycl_utilities.find_when_closed_naut(v_object);
        return makeBoolean((NIL != forts.fort_p(fortified_object)) && (NIL != el_expansionP(fortified_object)));
    }

    public static SubLObject el_expandible_relation_expressionP(final SubLObject v_object) {
        return makeBoolean(((NIL != el_formula_p(v_object)) && (NIL != fort_types_interface.el_relation_p(cycl_utilities.formula_arg0(v_object)))) && (NIL != el_expandible_formulaP(v_object)));
    }

    public static SubLObject expandible_relation_expressionP(final SubLObject v_object) {
        return makeBoolean((NIL != el_formula_p(v_object)) && (NIL != el_expandible_formulaP(v_object)));
    }

    public static SubLObject el_viable_relation_expressionP(final SubLObject v_object) {
        return makeBoolean(((NIL != el_formula_p(v_object)) && (NIL != fort_types_interface.el_relation_p(cycl_utilities.formula_arg0(v_object)))) && (NIL != el_viably_expandible_formulaP(v_object)));
    }

    public static SubLObject el_expansionP(final SubLObject v_object) {
        return makeBoolean((NIL != kb_mapping_utilities.fpred_value_in_relevant_mts(v_object, $$expansion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != kb_mapping_utilities.fpred_value_in_relevant_mts(v_object, $$expansionDefn, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject el_expansion_int(final SubLObject relation_expression, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == hlmt.hlmt_p(mt)) {
            return values(relation_expression, mt);
        }
        final SubLObject relation = cycl_utilities.find_when_closed_naut(cycl_utilities.formula_arg0(relation_expression));
        SubLObject expansion = NIL;
        SubLObject expansion_defn = NIL;
        SubLObject result_expression = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject expansion_gaf = kb_mapping_utilities.fpred_value_gaf(relation, $$expansion, UNPROVIDED, UNPROVIDED);
            if (NIL != expansion_gaf) {
                final SubLObject expansion_template = copy_formula(assertions_high.gaf_arg2(expansion_gaf));
                expansion = el_uniquify_formula_vars_wrt(expansion_template, relation_expression);
                possibly_note_expansion_justification_support(expansion_gaf);
            } else {
                final SubLObject expansion_defn_gaf = kb_mapping_utilities.fpred_value_gaf(relation, $$expansionDefn, UNPROVIDED, UNPROVIDED);
                if (NIL != expansion_defn_gaf) {
                    final SubLObject possible_defn = cycl_subl_symbol_symbol(assertions_high.gaf_arg2(expansion_defn_gaf));
                    if (NIL != at_defns.viable_defnP(possible_defn, UNPROVIDED)) {
                        expansion_defn = possible_defn;
                        possibly_note_expansion_justification_support(expansion_defn_gaf);
                    }
                }
            }
            if (NIL != expansion) {
                SubLObject subst_list = NIL;
                SubLObject arg_number = ZERO_INTEGER;
                SubLObject cdolist_list_var;
                final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(relation_expression, $IGNORE);
                SubLObject arg = NIL;
                arg = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    arg_number = add(arg_number, ONE_INTEGER);
                    final SubLObject old_arg = at_utilities.get_generic_arg(arg_number);
                    subst_list = cons(cons(old_arg, arg), subst_list);
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                } 
                expansion = result_expression = sublis(subst_list, expansion, UNPROVIDED, UNPROVIDED);
            } else
                if (NIL != expansion_defn) {
                    thread.resetMultipleValues();
                    final SubLObject result_expression_$29 = funcall(expansion_defn, relation_expression);
                    final SubLObject mt_$30 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    result_expression = result_expression_$29;
                    mt = mt_$30;
                } else {
                    result_expression = relation_expression;
                }

        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return values(result_expression, mt);
    }

    public static SubLObject el_formula_expansion_int(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return el_expansion_int(formula, mt_relevance_macros.$mt$.getDynamicValue(thread));
    }

    public static SubLObject el_expansion_recursive(final SubLObject formula, final SubLObject mt, final SubLObject recursion_limit, final SubLObject recursion_level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (recursion_level.numG(recursion_limit)) {
            el_error(TWO_INTEGER, $str14$Trying_to_expand_a_recursive_EL_r, recursion_limit, formula, UNPROVIDED);
            return NIL;
        }
        if ((NIL != el_formula_p(formula)) && (NIL != el_viably_expandible_formulaP(formula))) {
            thread.resetMultipleValues();
            final SubLObject new_formula = el_expansion_int(formula, mt);
            final SubLObject new_mt = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return el_expansion_recursive(new_formula, new_mt, recursion_limit, add(ONE_INTEGER, recursion_level));
        }
        return values(formula, mt);
    }

    public static SubLObject has_viable_expansionP(final SubLObject relation_expression) {
        final SubLObject expansion = kb_mapping_utilities.fpred_value_in_relevant_mts(cycl_utilities.find_when_closed_naut(cycl_utilities.formula_operator(relation_expression)), $$expansion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject generic_arg_nums = (expansion.isCons()) ? list_utilities.tree_gather(transform_list_utilities.ntransform(transform_list_utilities.transform(expansion, symbol_function(INTEGERP), symbol_function(NULL), UNPROVIDED), symbol_function(GENERIC_ARG_P), symbol_function(GENERIC_ARG_NUM), UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function(INTEGERP), UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        if (generic_arg_nums.isCons()) {
            return formula_arityGE(relation_expression, apply(symbol_function(MAX), generic_arg_nums), UNPROVIDED);
        }
        return formula_arityE(relation_expression, ZERO_INTEGER, UNPROVIDED);
    }

    public static SubLObject has_viable_defnP(final SubLObject relation_expression) {
        final SubLObject expansion_defn = cycl_subl_symbol_symbol(kb_mapping_utilities.fpred_value_in_relevant_mts(cycl_utilities.formula_operator(relation_expression), $$expansionDefn, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return at_defns.viable_defnP(expansion_defn, UNPROVIDED);
    }

    public static SubLObject el_uniquify_wrt(final SubLObject var, final SubLObject formula) {
        return NIL != list_utilities.tree_find(var, formula, UNPROVIDED, UNPROVIDED) ? clausifier.el_uniquify(var) : var;
    }

    public static SubLObject el_uniquify_formula_vars_wrt(final SubLObject formula_to_uniquify, final SubLObject reference_formula) {
        return el_uniquify_formula_vars_wrt_int(formula_to_uniquify, reference_formula, NIL);
    }

    public static SubLObject el_nuniquify_formula_vars_wrt(final SubLObject formula_to_uniquify, final SubLObject reference_formula) {
        return el_uniquify_formula_vars_wrt_int(formula_to_uniquify, reference_formula, T);
    }

    public static SubLObject el_uniquify_formula_vars_wrt_int(final SubLObject formula_to_uniquify, final SubLObject reference_formula, final SubLObject destructiveP) {
        if (NIL == el_formula_p(formula_to_uniquify)) {
            return formula_to_uniquify;
        }
        final SubLObject candidate_vars_to_uniquify = cycl_utilities.formula_gather(formula_to_uniquify, symbol_function($sym20$EL_VAR_), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject reference_vars = (NIL != candidate_vars_to_uniquify) ? cycl_utilities.formula_gather(reference_formula, symbol_function($sym20$EL_VAR_), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        final SubLObject vars_to_uniquify = ((NIL != candidate_vars_to_uniquify) && (NIL != reference_vars)) ? nintersection(candidate_vars_to_uniquify, reference_vars, UNPROVIDED, UNPROVIDED) : NIL;
        if (NIL != vars_to_uniquify) {
            SubLObject alist = NIL;
            SubLObject cdolist_list_var = vars_to_uniquify;
            SubLObject var = NIL;
            var = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                alist = cons(cons(var, clausifier.el_uniquify(var)), alist);
                cdolist_list_var = cdolist_list_var.rest();
                var = cdolist_list_var.first();
            } 
            return NIL != destructiveP ? nsublis(alist, formula_to_uniquify, UNPROVIDED, UNPROVIDED) : sublis(alist, formula_to_uniquify, UNPROVIDED, UNPROVIDED);
        }
        return formula_to_uniquify;
    }

    public static SubLObject expansion_nautP(final SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_boolean = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            if (NIL != term.first_order_nautP(v_object)) {
                final SubLObject function = cycl_utilities.nat_arg0(v_object);
                v_boolean = arg0_of_any_expansionP(function);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_boolean;
    }

    public static SubLObject arg0_of_any_expansionP(final SubLObject relation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != forts.fort_p(relation)) {
            SubLObject v_boolean = NIL;
            final SubLObject _prev_bind_0 = $mapping_source$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $mapping_answer$.currentBinding(thread);
            try {
                $mapping_source$.bind(relation, thread);
                $mapping_answer$.bind(NIL, thread);
                kb_mapping.map_other_index(EXPANSION_ARG2_ARG0_P, relation, $TRUE, T);
                v_boolean = $mapping_answer$.getDynamicValue(thread);
            } finally {
                $mapping_answer$.rebind(_prev_bind_2, thread);
                $mapping_source$.rebind(_prev_bind_0, thread);
            }
            return v_boolean;
        }
        if (NIL != term.first_order_nautP(relation)) {
            return arg0_of_any_expansionP(narts_high.find_nart(relation));
        }
        return NIL;
    }

    public static SubLObject expansion_arg2_arg0_p(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != assertions_high.gaf_assertionP(assertion)) && $$expansion.eql(assertions_high.gaf_arg0(assertion))) && $mapping_source$.getDynamicValue(thread).eql(cycl_utilities.formula_arg0(assertions_high.gaf_arg2(assertion)))) {
            $mapping_answer$.setDynamicValue(T, thread);
            mapping_finished();
        }
        return NIL;
    }

    public static SubLObject declare_verbosifier_file() {
        declareFunction(me, "verbosify_cycl", "VERBOSIFY-CYCL", 1, 2, false);
        declareFunction(me, "el_expansion", "EL-EXPANSION", 2, 0, false);
        declareFunction(me, "el_expansion_destructive", "EL-EXPANSION-DESTRUCTIVE", 2, 0, false);
        declareFunction(me, "el_expansion_one_step", "EL-EXPANSION-ONE-STEP", 2, 0, false);
        declareFunction(me, "el_expansion_one_step_destructive", "EL-EXPANSION-ONE-STEP-DESTRUCTIVE", 2, 0, false);
        declareFunction(me, "el_expand_all", "EL-EXPAND-ALL", 2, 0, false);
        declareFunction(me, "el_expand_all_evaluatable", "EL-EXPAND-ALL-EVALUATABLE", 2, 0, false);
        declareFunction(me, "el_expand_all_int", "EL-EXPAND-ALL-INT", 3, 0, false);
        declareFunction(me, "el_expand_all_destructive", "EL-EXPAND-ALL-DESTRUCTIVE", 2, 0, false);
        declareFunction(me, "el_expandible_subformulaP", "EL-EXPANDIBLE-SUBFORMULA?", 1, 1, false);
        declareFunction(me, "gathering_expansion_justificationsP", "GATHERING-EXPANSION-JUSTIFICATIONS?", 0, 0, false);
        declareFunction(me, "possibly_note_expansion_justification_support", "POSSIBLY-NOTE-EXPANSION-JUSTIFICATION-SUPPORT", 1, 0, false);
        declareFunction(me, "note_expansion_justification_support", "NOTE-EXPANSION-JUSTIFICATION-SUPPORT", 1, 0, false);
        declareFunction(me, "expansion_justification", "EXPANSION-JUSTIFICATION", 0, 0, false);
        declareMacro(me, "gathering_expansion_justifications", "GATHERING-EXPANSION-JUSTIFICATIONS");
        declareFunction(me, "verbosify_cycl_justified", "VERBOSIFY-CYCL-JUSTIFIED", 1, 2, false);
        declareFunction(me, "el_expansion_justified", "EL-EXPANSION-JUSTIFIED", 2, 0, false);
        declareFunction(me, "el_expansion_destructive_justified", "EL-EXPANSION-DESTRUCTIVE-JUSTIFIED", 2, 0, false);
        declareFunction(me, "el_expansion_one_step_justified", "EL-EXPANSION-ONE-STEP-JUSTIFIED", 2, 0, false);
        declareFunction(me, "el_expansion_one_step_destructive_justified", "EL-EXPANSION-ONE-STEP-DESTRUCTIVE-JUSTIFIED", 2, 0, false);
        declareFunction(me, "el_expand_all_justified", "EL-EXPAND-ALL-JUSTIFIED", 2, 0, false);
        declareFunction(me, "el_expand_all_evaluatable_justified", "EL-EXPAND-ALL-EVALUATABLE-JUSTIFIED", 2, 0, false);
        declareFunction(me, "el_expand_all_destructive_justified", "EL-EXPAND-ALL-DESTRUCTIVE-JUSTIFIED", 2, 0, false);
        declareFunction(me, "el_relations_out", "EL-RELATIONS-OUT", 2, 2, false);
        declareFunction(me, "expandible_el_relation_expressionP", "EXPANDIBLE-EL-RELATION-EXPRESSION?", 1, 1, false);
        new verbosifier.$expandible_el_relation_expressionP$UnaryFunction();
        new verbosifier.$expandible_el_relation_expressionP$BinaryFunction();
        declareFunction(me, "el_expandible_formulaP", "EL-EXPANDIBLE-FORMULA?", 1, 0, false);
        declareFunction(me, "el_viably_expandible_formulaP", "EL-VIABLY-EXPANDIBLE-FORMULA?", 1, 0, false);
        declareFunction(me, "el_viably_expandible_evaluatable_formulaP", "EL-VIABLY-EXPANDIBLE-EVALUATABLE-FORMULA?", 1, 0, false);
        declareFunction(me, "el_expandible_relationP", "EL-EXPANDIBLE-RELATION?", 1, 0, false);
        declareFunction(me, "el_expandible_relation_expressionP", "EL-EXPANDIBLE-RELATION-EXPRESSION?", 1, 0, false);
        declareFunction(me, "expandible_relation_expressionP", "EXPANDIBLE-RELATION-EXPRESSION?", 1, 0, false);
        declareFunction(me, "el_viable_relation_expressionP", "EL-VIABLE-RELATION-EXPRESSION?", 1, 0, false);
        declareFunction(me, "el_expansionP", "EL-EXPANSION?", 1, 0, false);
        declareFunction(me, "el_expansion_int", "EL-EXPANSION-INT", 2, 0, false);
        declareFunction(me, "el_formula_expansion_int", "EL-FORMULA-EXPANSION-INT", 1, 0, false);
        declareFunction(me, "el_expansion_recursive", "EL-EXPANSION-RECURSIVE", 4, 0, false);
        declareFunction(me, "has_viable_expansionP", "HAS-VIABLE-EXPANSION?", 1, 0, false);
        declareFunction(me, "has_viable_defnP", "HAS-VIABLE-DEFN?", 1, 0, false);
        declareFunction(me, "el_uniquify_wrt", "EL-UNIQUIFY-WRT", 2, 0, false);
        declareFunction(me, "el_uniquify_formula_vars_wrt", "EL-UNIQUIFY-FORMULA-VARS-WRT", 2, 0, false);
        declareFunction(me, "el_nuniquify_formula_vars_wrt", "EL-NUNIQUIFY-FORMULA-VARS-WRT", 2, 0, false);
        declareFunction(me, "el_uniquify_formula_vars_wrt_int", "EL-UNIQUIFY-FORMULA-VARS-WRT-INT", 3, 0, false);
        declareFunction(me, "expansion_nautP", "EXPANSION-NAUT?", 1, 1, false);
        declareFunction(me, "arg0_of_any_expansionP", "ARG0-OF-ANY-EXPANSION?", 1, 0, false);
        declareFunction(me, "expansion_arg2_arg0_p", "EXPANSION-ARG2-ARG0-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_verbosifier_file() {
        defparameter("*EL-RELATION-RECURSION-LIMIT*", $int$212);
        defparameter("*GATHER-EXPANSION-JUSTIFICATIONS?*", NIL);
        defparameter("*EXPANSION-JUSTIFICATION*", NIL);
        return NIL;
    }

    public static SubLObject setup_verbosifier_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_verbosifier_file();
    }

    @Override
    public void initializeVariables() {
        init_verbosifier_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_verbosifier_file();
    }

    

    public static final class $expandible_el_relation_expressionP$UnaryFunction extends UnaryFunction {
        public $expandible_el_relation_expressionP$UnaryFunction() {
            super(extractFunctionNamed("EXPANDIBLE-EL-RELATION-EXPRESSION?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return expandible_el_relation_expressionP(arg1, UNPROVIDED);
        }
    }

    public static final class $expandible_el_relation_expressionP$BinaryFunction extends BinaryFunction {
        public $expandible_el_relation_expressionP$BinaryFunction() {
            super(extractFunctionNamed("EXPANDIBLE-EL-RELATION-EXPRESSION?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return expandible_el_relation_expressionP(arg1, arg2);
        }
    }
}

/**
 * Total time: 163 ms
 */
