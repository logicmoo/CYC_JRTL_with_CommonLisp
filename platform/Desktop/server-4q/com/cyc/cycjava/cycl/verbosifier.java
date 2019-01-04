package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class verbosifier extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.verbosifier";
    public static final String myFingerPrint = "5494697d7f55c937658f3080458c27bd9738b5bdc21dc167fc64117ab7d8cf49";
    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 990L)
    private static SubLSymbol $el_relation_recursion_limit$;
    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 5321L)
    private static SubLSymbol $gather_expansion_justificationsP$;
    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 5598L)
    private static SubLSymbol $expansion_justification$;
    private static final SubLInteger $int0$212;
    private static final SubLSymbol $sym1$EL_VIABLY_EXPANDIBLE_FORMULA_;
    private static final SubLSymbol $sym2$EL_VIABLY_EXPANDIBLE_EVALUATABLE_FORMULA_;
    private static final SubLSymbol $kw3$TRANSFORMATION_LIMIT_EXCEEDED;
    private static final SubLSymbol $sym4$EL_FORMULA_EXPANSION_INT;
    private static final SubLSymbol $kw5$RECURSION_LIMIT_EXCEEDED;
    private static final SubLSymbol $sym6$EXPANDIBLE_RELATION_EXPRESSION_;
    private static final SubLSymbol $sym7$CLET;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$EXPANDIBLE_EL_RELATION_EXPRESSION_;
    private static final SubLSymbol $kw10$IGNORE;
    private static final SubLSymbol $kw11$INVALID_EXPANSION;
    private static final SubLObject $const12$expansion;
    private static final SubLObject $const13$expansionDefn;
    private static final SubLString $str14$Trying_to_expand_a_recursive_EL_r;
    private static final SubLSymbol $sym15$INTEGERP;
    private static final SubLSymbol $sym16$NULL;
    private static final SubLSymbol $sym17$GENERIC_ARG_P;
    private static final SubLSymbol $sym18$GENERIC_ARG_NUM;
    private static final SubLSymbol $sym19$MAX;
    private static final SubLSymbol $sym20$EL_VAR_;
    private static final SubLSymbol $sym21$EXPANSION_ARG2_ARG0_P;
    private static final SubLSymbol $kw22$TRUE;

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 1132L)
    public static SubLObject verbosify_cycl(final SubLObject expression, SubLObject mt, SubLObject settings) {
        if (mt == verbosifier.UNPROVIDED) {
            mt = (SubLObject)verbosifier.NIL;
        }
        if (settings == verbosifier.UNPROVIDED) {
            settings = (SubLObject)verbosifier.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)verbosifier.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            result = el_expansion(expression, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 1381L)
    public static SubLObject el_expansion(final SubLObject formula, final SubLObject mt) {
        return el_expansion_destructive(conses_high.copy_tree(formula), hlmt.copy_hlmt(mt));
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 1842L)
    public static SubLObject el_expansion_destructive(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_formula = (SubLObject)verbosifier.NIL;
        SubLObject result_mt = (SubLObject)verbosifier.NIL;
        final SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
        try {
            czer_vars.$el_symbol_suffix_table$.bind(Hashtables.make_hash_table((SubLObject)verbosifier.FOUR_INTEGER, Symbols.symbol_function((SubLObject)verbosifier.EQL), (SubLObject)verbosifier.UNPROVIDED), thread);
            czer_vars.$standardize_variables_memory$.bind((SubLObject)verbosifier.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject result_formula_$1 = el_expansion_recursive(formula, mt, verbosifier.$el_relation_recursion_limit$.getDynamicValue(thread), (SubLObject)verbosifier.ZERO_INTEGER);
            final SubLObject result_mt_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result_formula = result_formula_$1;
            result_mt = result_mt_$2;
        }
        finally {
            czer_vars.$standardize_variables_memory$.rebind(_prev_bind_2, thread);
            czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0, thread);
        }
        return Values.values(result_formula, result_mt);
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 2190L)
    public static SubLObject el_expansion_one_step(final SubLObject formula, final SubLObject mt) {
        return el_expansion_one_step_destructive(conses_high.copy_tree(formula), hlmt.copy_hlmt(mt));
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 2506L)
    public static SubLObject el_expansion_one_step_destructive(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_formula = formula;
        SubLObject result_mt = mt;
        final SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
        try {
            czer_vars.$el_symbol_suffix_table$.bind(Hashtables.make_hash_table((SubLObject)verbosifier.FOUR_INTEGER, Symbols.symbol_function((SubLObject)verbosifier.EQL), (SubLObject)verbosifier.UNPROVIDED), thread);
            czer_vars.$standardize_variables_memory$.bind((SubLObject)verbosifier.NIL, thread);
            if (verbosifier.NIL != el_utilities.el_formula_p(formula) && verbosifier.NIL != el_viably_expandible_formulaP(formula)) {
                thread.resetMultipleValues();
                final SubLObject result_formula_$3 = el_expansion_int(formula, mt);
                final SubLObject result_mt_$4 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                result_formula = result_formula_$3;
                result_mt = result_mt_$4;
            }
        }
        finally {
            czer_vars.$standardize_variables_memory$.rebind(_prev_bind_2, thread);
            czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0, thread);
        }
        return Values.values(result_formula, result_mt);
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 2934L)
    public static SubLObject el_expand_all(final SubLObject formula, final SubLObject mt) {
        return el_expand_all_int(formula, mt, (SubLObject)verbosifier.$sym1$EL_VIABLY_EXPANDIBLE_FORMULA_);
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 3424L)
    public static SubLObject el_expand_all_evaluatable(final SubLObject formula, final SubLObject mt) {
        return el_expand_all_int(formula, mt, (SubLObject)verbosifier.$sym2$EL_VIABLY_EXPANDIBLE_EVALUATABLE_FORMULA_);
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 3949L)
    public static SubLObject el_expand_all_int(final SubLObject formula, SubLObject mt, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error = (SubLObject)verbosifier.NIL;
        SubLObject result = (SubLObject)verbosifier.NIL;
        final SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
        try {
            czer_vars.$el_symbol_suffix_table$.bind(Hashtables.make_hash_table((SubLObject)verbosifier.FOUR_INTEGER, Symbols.symbol_function((SubLObject)verbosifier.EQL), (SubLObject)verbosifier.UNPROVIDED), thread);
            czer_vars.$standardize_variables_memory$.bind((SubLObject)verbosifier.NIL, thread);
            try {
                thread.throwStack.push(verbosifier.$kw3$TRANSFORMATION_LIMIT_EXCEEDED);
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                final SubLObject _prev_bind_0_$5 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_1_$6 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    thread.resetMultipleValues();
                    final SubLObject result_$7 = cycl_utilities.formula_and_mt_transform(formula, mt, pred, (SubLObject)verbosifier.$sym4$EL_FORMULA_EXPANSION_INT, (SubLObject)verbosifier.NIL, verbosifier.$el_relation_recursion_limit$.getDynamicValue(thread));
                    final SubLObject mt_$8 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    result = result_$7;
                    mt = mt_$8;
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$6, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$5, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                error = Errors.handleThrowable(ccatch_env_var, (SubLObject)verbosifier.$kw3$TRANSFORMATION_LIMIT_EXCEEDED);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            czer_vars.$standardize_variables_memory$.rebind(_prev_bind_2, thread);
            czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0, thread);
        }
        if (verbosifier.NIL != error) {
            return (SubLObject)verbosifier.$kw5$RECURSION_LIMIT_EXCEEDED;
        }
        return Values.values(result, mt);
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 4447L)
    public static SubLObject el_expand_all_destructive(final SubLObject formula, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error = (SubLObject)verbosifier.NIL;
        SubLObject result = (SubLObject)verbosifier.NIL;
        final SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
        try {
            czer_vars.$el_symbol_suffix_table$.bind(Hashtables.make_hash_table((SubLObject)verbosifier.FOUR_INTEGER, Symbols.symbol_function((SubLObject)verbosifier.EQL), (SubLObject)verbosifier.UNPROVIDED), thread);
            czer_vars.$standardize_variables_memory$.bind((SubLObject)verbosifier.NIL, thread);
            try {
                thread.throwStack.push(verbosifier.$kw3$TRANSFORMATION_LIMIT_EXCEEDED);
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                final SubLObject _prev_bind_0_$9 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_1_$10 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    thread.resetMultipleValues();
                    final SubLObject result_$11 = cycl_utilities.formula_and_mt_ntransform(formula, (SubLObject)verbosifier.$sym1$EL_VIABLY_EXPANDIBLE_FORMULA_, (SubLObject)verbosifier.$sym4$EL_FORMULA_EXPANSION_INT, (SubLObject)verbosifier.NIL, verbosifier.$el_relation_recursion_limit$.getDynamicValue(thread), (SubLObject)verbosifier.UNPROVIDED);
                    final SubLObject mt_$12 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    result = result_$11;
                    mt = mt_$12;
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$10, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$9, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                error = Errors.handleThrowable(ccatch_env_var, (SubLObject)verbosifier.$kw3$TRANSFORMATION_LIMIT_EXCEEDED);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            czer_vars.$standardize_variables_memory$.rebind(_prev_bind_2, thread);
            czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0, thread);
        }
        if (verbosifier.NIL != error) {
            return (SubLObject)verbosifier.$kw5$RECURSION_LIMIT_EXCEEDED;
        }
        return Values.values(result, mt);
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 4949L)
    public static SubLObject el_expandible_subformulaP(final SubLObject v_object, SubLObject mt) {
        if (mt == verbosifier.UNPROVIDED) {
            mt = (SubLObject)verbosifier.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject expandibleP = (SubLObject)verbosifier.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            expandibleP = (SubLObject)SubLObjectFactory.makeBoolean(verbosifier.NIL != el_utilities.el_formula_p(v_object) && verbosifier.NIL != cycl_utilities.formula_find_if((SubLObject)verbosifier.$sym6$EXPANDIBLE_RELATION_EXPRESSION_, v_object, (SubLObject)verbosifier.NIL, (SubLObject)verbosifier.UNPROVIDED));
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return expandibleP;
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 5498L)
    public static SubLObject gathering_expansion_justificationsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return verbosifier.$gather_expansion_justificationsP$.getDynamicValue(thread);
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 5723L)
    public static SubLObject possibly_note_expansion_justification_support(final SubLObject support) {
        if (verbosifier.NIL != gathering_expansion_justificationsP()) {
            note_expansion_justification_support(support);
        }
        return support;
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 5912L)
    public static SubLObject note_expansion_justification_support(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        verbosifier.$expansion_justification$.setDynamicValue((SubLObject)ConsesLow.cons(support, verbosifier.$expansion_justification$.getDynamicValue(thread)), thread);
        return support;
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 6037L)
    public static SubLObject expansion_justification() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.fast_delete_duplicates(Sequences.nreverse(conses_high.copy_list(verbosifier.$expansion_justification$.getDynamicValue(thread))), (SubLObject)verbosifier.UNPROVIDED, (SubLObject)verbosifier.UNPROVIDED, (SubLObject)verbosifier.UNPROVIDED, (SubLObject)verbosifier.UNPROVIDED, (SubLObject)verbosifier.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 6164L)
    public static SubLObject gathering_expansion_justifications(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)verbosifier.$sym7$CLET, (SubLObject)verbosifier.$list8, ConsesLow.append(body, (SubLObject)verbosifier.NIL));
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 6338L)
    public static SubLObject verbosify_cycl_justified(final SubLObject expression, SubLObject mt, SubLObject settings) {
        if (mt == verbosifier.UNPROVIDED) {
            mt = (SubLObject)verbosifier.NIL;
        }
        if (settings == verbosifier.UNPROVIDED) {
            settings = (SubLObject)verbosifier.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)verbosifier.NIL;
        SubLObject justification = (SubLObject)verbosifier.NIL;
        final SubLObject _prev_bind_0 = verbosifier.$gather_expansion_justificationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = verbosifier.$expansion_justification$.currentBinding(thread);
        try {
            verbosifier.$gather_expansion_justificationsP$.bind((SubLObject)verbosifier.T, thread);
            verbosifier.$expansion_justification$.bind((SubLObject)verbosifier.NIL, thread);
            result = verbosify_cycl(expression, mt, settings);
            justification = expansion_justification();
        }
        finally {
            verbosifier.$expansion_justification$.rebind(_prev_bind_2, thread);
            verbosifier.$gather_expansion_justificationsP$.rebind(_prev_bind_0, thread);
        }
        return Values.values(result, justification);
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 6878L)
    public static SubLObject el_expansion_justified(final SubLObject formula, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)verbosifier.NIL;
        SubLObject justification = (SubLObject)verbosifier.NIL;
        final SubLObject _prev_bind_0 = verbosifier.$gather_expansion_justificationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = verbosifier.$expansion_justification$.currentBinding(thread);
        try {
            verbosifier.$gather_expansion_justificationsP$.bind((SubLObject)verbosifier.T, thread);
            verbosifier.$expansion_justification$.bind((SubLObject)verbosifier.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject result_$13 = el_expansion(formula, mt);
            final SubLObject mt_$14 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = result_$13;
            mt = mt_$14;
            justification = expansion_justification();
        }
        finally {
            verbosifier.$expansion_justification$.rebind(_prev_bind_2, thread);
            verbosifier.$gather_expansion_justificationsP$.rebind(_prev_bind_0, thread);
        }
        return Values.values(result, mt, justification);
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 7359L)
    public static SubLObject el_expansion_destructive_justified(final SubLObject formula, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)verbosifier.NIL;
        SubLObject justification = (SubLObject)verbosifier.NIL;
        final SubLObject _prev_bind_0 = verbosifier.$gather_expansion_justificationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = verbosifier.$expansion_justification$.currentBinding(thread);
        try {
            verbosifier.$gather_expansion_justificationsP$.bind((SubLObject)verbosifier.T, thread);
            verbosifier.$expansion_justification$.bind((SubLObject)verbosifier.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject result_$15 = el_expansion_destructive(formula, mt);
            final SubLObject mt_$16 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = result_$15;
            mt = mt_$16;
            justification = expansion_justification();
        }
        finally {
            verbosifier.$expansion_justification$.rebind(_prev_bind_2, thread);
            verbosifier.$gather_expansion_justificationsP$.rebind(_prev_bind_0, thread);
        }
        return Values.values(result, mt, justification);
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 7922L)
    public static SubLObject el_expansion_one_step_justified(final SubLObject formula, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)verbosifier.NIL;
        SubLObject justification = (SubLObject)verbosifier.NIL;
        final SubLObject _prev_bind_0 = verbosifier.$gather_expansion_justificationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = verbosifier.$expansion_justification$.currentBinding(thread);
        try {
            verbosifier.$gather_expansion_justificationsP$.bind((SubLObject)verbosifier.T, thread);
            verbosifier.$expansion_justification$.bind((SubLObject)verbosifier.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject result_$17 = el_expansion_one_step(formula, mt_relevance_macros.$mt$.getDynamicValue(thread));
            final SubLObject mt_$18 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = result_$17;
            mt = mt_$18;
            justification = expansion_justification();
        }
        finally {
            verbosifier.$expansion_justification$.rebind(_prev_bind_2, thread);
            verbosifier.$gather_expansion_justificationsP$.rebind(_prev_bind_0, thread);
        }
        return Values.values(result, mt, justification);
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 8619L)
    public static SubLObject el_expansion_one_step_destructive_justified(final SubLObject formula, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)verbosifier.NIL;
        SubLObject justification = (SubLObject)verbosifier.NIL;
        final SubLObject _prev_bind_0 = verbosifier.$gather_expansion_justificationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = verbosifier.$expansion_justification$.currentBinding(thread);
        try {
            verbosifier.$gather_expansion_justificationsP$.bind((SubLObject)verbosifier.T, thread);
            verbosifier.$expansion_justification$.bind((SubLObject)verbosifier.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject result_$19 = el_expansion_one_step_destructive(formula, mt_relevance_macros.$mt$.getDynamicValue(thread));
            final SubLObject mt_$20 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = result_$19;
            mt = mt_$20;
            justification = expansion_justification();
        }
        finally {
            verbosifier.$expansion_justification$.rebind(_prev_bind_2, thread);
            verbosifier.$gather_expansion_justificationsP$.rebind(_prev_bind_0, thread);
        }
        return Values.values(result, mt, justification);
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 9213L)
    public static SubLObject el_expand_all_justified(final SubLObject formula, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)verbosifier.NIL;
        SubLObject justification = (SubLObject)verbosifier.NIL;
        final SubLObject _prev_bind_0 = verbosifier.$gather_expansion_justificationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = verbosifier.$expansion_justification$.currentBinding(thread);
        try {
            verbosifier.$gather_expansion_justificationsP$.bind((SubLObject)verbosifier.T, thread);
            verbosifier.$expansion_justification$.bind((SubLObject)verbosifier.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject result_$21 = el_expand_all(formula, mt_relevance_macros.$mt$.getDynamicValue(thread));
            final SubLObject mt_$22 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = result_$21;
            mt = mt_$22;
            justification = expansion_justification();
        }
        finally {
            verbosifier.$expansion_justification$.rebind(_prev_bind_2, thread);
            verbosifier.$gather_expansion_justificationsP$.rebind(_prev_bind_0, thread);
        }
        return Values.values(result, mt, justification);
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 10076L)
    public static SubLObject el_expand_all_evaluatable_justified(final SubLObject formula, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)verbosifier.NIL;
        SubLObject justification = (SubLObject)verbosifier.NIL;
        final SubLObject _prev_bind_0 = verbosifier.$gather_expansion_justificationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = verbosifier.$expansion_justification$.currentBinding(thread);
        try {
            verbosifier.$gather_expansion_justificationsP$.bind((SubLObject)verbosifier.T, thread);
            verbosifier.$expansion_justification$.bind((SubLObject)verbosifier.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject result_$23 = el_expand_all_evaluatable(formula, mt_relevance_macros.$mt$.getDynamicValue(thread));
            final SubLObject mt_$24 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = result_$23;
            mt = mt_$24;
            justification = expansion_justification();
        }
        finally {
            verbosifier.$expansion_justification$.rebind(_prev_bind_2, thread);
            verbosifier.$gather_expansion_justificationsP$.rebind(_prev_bind_0, thread);
        }
        return Values.values(result, mt, justification);
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 10975L)
    public static SubLObject el_expand_all_destructive_justified(final SubLObject formula, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)verbosifier.NIL;
        SubLObject justification = (SubLObject)verbosifier.NIL;
        final SubLObject _prev_bind_0 = verbosifier.$gather_expansion_justificationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = verbosifier.$expansion_justification$.currentBinding(thread);
        try {
            verbosifier.$gather_expansion_justificationsP$.bind((SubLObject)verbosifier.T, thread);
            verbosifier.$expansion_justification$.bind((SubLObject)verbosifier.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject result_$25 = el_expand_all_destructive(formula, mt_relevance_macros.$mt$.getDynamicValue(thread));
            final SubLObject mt_$26 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = result_$25;
            mt = mt_$26;
            justification = expansion_justification();
        }
        finally {
            verbosifier.$expansion_justification$.rebind(_prev_bind_2, thread);
            verbosifier.$gather_expansion_justificationsP$.rebind(_prev_bind_0, thread);
        }
        return Values.values(result, mt, justification);
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 11616L)
    public static SubLObject el_relations_out(final SubLObject formula, final SubLObject mt, SubLObject recursion_limit, SubLObject recursion_level) {
        if (recursion_limit == verbosifier.UNPROVIDED) {
            recursion_limit = verbosifier.$el_relation_recursion_limit$.getDynamicValue();
        }
        if (recursion_level == verbosifier.UNPROVIDED) {
            recursion_level = (SubLObject)verbosifier.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (recursion_level.numG(recursion_limit)) {
            Dynamic.sublisp_throw((SubLObject)verbosifier.$kw5$RECURSION_LIMIT_EXCEEDED, (SubLObject)ConsesLow.list((SubLObject)verbosifier.$kw5$RECURSION_LIMIT_EXCEEDED, recursion_level, recursion_limit));
        }
        if (verbosifier.NIL == el_utilities.el_formula_p(formula)) {
            return Values.values(formula, mt);
        }
        if (verbosifier.NIL != el_viable_relation_expressionP(formula)) {
            thread.resetMultipleValues();
            final SubLObject new_formula = el_expansion_int(formula, mt);
            final SubLObject new_mt = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (formula.equal(new_formula) && mt.equal(new_mt)) {
                return Values.values(formula, mt);
            }
            return el_relations_out(new_formula, new_mt, recursion_limit, Numbers.add((SubLObject)verbosifier.ONE_INTEGER, recursion_level));
        }
        else if (verbosifier.NIL != el_utilities.mt_designating_literalP(formula)) {
            final SubLObject subsentence = el_utilities.designated_sentence(formula);
            final SubLObject sub_mt = el_utilities.designated_mt(formula);
            if (verbosifier.NIL != hlmt.closed_possibly_hlmt_p(sub_mt)) {
                thread.resetMultipleValues();
                final SubLObject new_sentence = el_relations_out(subsentence, sub_mt, (SubLObject)verbosifier.UNPROVIDED, (SubLObject)verbosifier.UNPROVIDED);
                final SubLObject new_mt2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return Values.values(new_sentence, new_mt2);
            }
            return Values.values(formula, mt);
        }
        else {
            if (verbosifier.NIL != cycl_utilities.formula_find_if(Symbols.symbol_function((SubLObject)verbosifier.$sym9$EXPANDIBLE_EL_RELATION_EXPRESSION_), formula, (SubLObject)verbosifier.NIL, (SubLObject)verbosifier.UNPROVIDED)) {
                SubLObject new_terms = (SubLObject)verbosifier.NIL;
                SubLObject new_formula2 = (SubLObject)verbosifier.NIL;
                final SubLObject terms = cycl_utilities.formula_terms(formula, (SubLObject)verbosifier.$kw10$IGNORE);
                SubLObject list_var = (SubLObject)verbosifier.NIL;
                SubLObject arg = (SubLObject)verbosifier.NIL;
                SubLObject psn = (SubLObject)verbosifier.NIL;
                list_var = terms;
                arg = list_var.first();
                for (psn = (SubLObject)verbosifier.ZERO_INTEGER; verbosifier.NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), psn = number_utilities.f_1X(psn)) {
                    SubLObject new_term = arg;
                    SubLObject new_mt3 = (SubLObject)verbosifier.NIL;
                    final SubLObject relation = cycl_utilities.formula_operator(formula);
                    if (verbosifier.NIL == czer_utilities.leave_some_terms_at_el_for_argP(relation, psn, mt) && verbosifier.NIL == cycl_grammar.fast_quote_term_p(arg)) {
                        thread.resetMultipleValues();
                        final SubLObject new_term_$27 = el_relations_out(arg, mt, recursion_limit, Numbers.add((SubLObject)verbosifier.ONE_INTEGER, recursion_level));
                        final SubLObject new_mt_$28 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        new_term = new_term_$27;
                        new_mt3 = new_mt_$28;
                    }
                    if (verbosifier.NIL != new_mt3 && verbosifier.NIL == hlmt.hlmt_equal(mt, new_mt3)) {
                        new_terms = (SubLObject)ConsesLow.cons(el_utilities.make_ist_sentence(new_mt3, new_term), new_terms);
                    }
                    else {
                        new_terms = (SubLObject)ConsesLow.cons(new_term, new_terms);
                    }
                }
                new_terms = Sequences.nreverse(new_terms);
                new_formula2 = el_utilities.make_formula(new_terms.first(), new_terms.rest(), el_utilities.sequence_var(formula, (SubLObject)verbosifier.UNPROVIDED));
                return Values.values(new_formula2, mt);
            }
            return Values.values(formula, mt);
        }
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 14265L)
    public static SubLObject expandible_el_relation_expressionP(final SubLObject v_object, SubLObject mt) {
        if (mt == verbosifier.UNPROVIDED) {
            mt = (SubLObject)verbosifier.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(verbosifier.NIL != el_utilities.el_formula_p(v_object) && verbosifier.NIL != fort_types_interface.isa_el_relationP(cycl_utilities.formula_arg0(v_object), mt));
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 14599L)
    public static SubLObject el_expandible_formulaP(final SubLObject formula) {
        return (SubLObject)SubLObjectFactory.makeBoolean(verbosifier.NIL != el_utilities.el_formula_p(formula) && verbosifier.NIL != el_expandible_relationP(cycl_utilities.formula_arg0(formula)));
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 14835L)
    public static SubLObject el_viably_expandible_formulaP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (verbosifier.NIL == el_expandible_formulaP(formula)) {
            return (SubLObject)verbosifier.NIL;
        }
        if (verbosifier.NIL != has_viable_expansionP(formula) || verbosifier.NIL != has_viable_defnP(formula)) {
            return (SubLObject)verbosifier.T;
        }
        if (verbosifier.NIL != czer_vars.$within_canonicalizerP$.getDynamicValue(thread) || verbosifier.NIL != wff_vars.$within_wffP$.getDynamicValue(thread)) {
            Dynamic.sublisp_throw((SubLObject)verbosifier.$kw11$INVALID_EXPANSION, (SubLObject)ConsesLow.list((SubLObject)verbosifier.$kw11$INVALID_EXPANSION, formula, cycl_utilities.formula_operator(formula), kb_mapping_utilities.fpred_value_in_relevant_mts(cycl_utilities.formula_operator(formula), verbosifier.$const12$expansion, (SubLObject)verbosifier.UNPROVIDED, (SubLObject)verbosifier.UNPROVIDED, (SubLObject)verbosifier.UNPROVIDED, (SubLObject)verbosifier.UNPROVIDED)));
        }
        return (SubLObject)verbosifier.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 15519L)
    public static SubLObject el_viably_expandible_evaluatable_formulaP(final SubLObject formula) {
        return (SubLObject)SubLObjectFactory.makeBoolean(verbosifier.NIL != el_viably_expandible_formulaP(formula) && verbosifier.NIL != relation_evaluation.evaluatable_expressionP(formula));
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 15793L)
    public static SubLObject el_expandible_relationP(final SubLObject v_object) {
        final SubLObject fortified_object = cycl_utilities.find_when_closed_naut(v_object);
        return (SubLObject)SubLObjectFactory.makeBoolean(verbosifier.NIL != forts.fort_p(fortified_object) && verbosifier.NIL != el_expansionP(fortified_object));
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 16056L)
    public static SubLObject el_expandible_relation_expressionP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(verbosifier.NIL != el_utilities.el_formula_p(v_object) && verbosifier.NIL != fort_types_interface.el_relation_p(cycl_utilities.formula_arg0(v_object)) && verbosifier.NIL != el_expandible_formulaP(v_object));
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 16340L)
    public static SubLObject expandible_relation_expressionP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(verbosifier.NIL != el_utilities.el_formula_p(v_object) && verbosifier.NIL != el_expandible_formulaP(v_object));
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 16566L)
    public static SubLObject el_viable_relation_expressionP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(verbosifier.NIL != el_utilities.el_formula_p(v_object) && verbosifier.NIL != fort_types_interface.el_relation_p(cycl_utilities.formula_arg0(v_object)) && verbosifier.NIL != el_viably_expandible_formulaP(v_object));
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 16943L)
    public static SubLObject el_expansionP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(verbosifier.NIL != kb_mapping_utilities.fpred_value_in_relevant_mts(v_object, verbosifier.$const12$expansion, (SubLObject)verbosifier.UNPROVIDED, (SubLObject)verbosifier.UNPROVIDED, (SubLObject)verbosifier.UNPROVIDED, (SubLObject)verbosifier.UNPROVIDED) || verbosifier.NIL != kb_mapping_utilities.fpred_value_in_relevant_mts(v_object, verbosifier.$const13$expansionDefn, (SubLObject)verbosifier.UNPROVIDED, (SubLObject)verbosifier.UNPROVIDED, (SubLObject)verbosifier.UNPROVIDED, (SubLObject)verbosifier.UNPROVIDED));
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 17190L)
    public static SubLObject el_expansion_int(final SubLObject relation_expression, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (verbosifier.NIL == hlmt.hlmt_p(mt)) {
            return Values.values(relation_expression, mt);
        }
        final SubLObject relation = cycl_utilities.find_when_closed_naut(cycl_utilities.formula_arg0(relation_expression));
        SubLObject expansion = (SubLObject)verbosifier.NIL;
        SubLObject expansion_defn = (SubLObject)verbosifier.NIL;
        SubLObject result_expression = (SubLObject)verbosifier.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject expansion_gaf = kb_mapping_utilities.fpred_value_gaf(relation, verbosifier.$const12$expansion, (SubLObject)verbosifier.UNPROVIDED, (SubLObject)verbosifier.UNPROVIDED);
            if (verbosifier.NIL != expansion_gaf) {
                final SubLObject expansion_template = el_utilities.copy_formula(assertions_high.gaf_arg2(expansion_gaf));
                expansion = el_uniquify_formula_vars_wrt(expansion_template, relation_expression);
                possibly_note_expansion_justification_support(expansion_gaf);
            }
            else {
                final SubLObject expansion_defn_gaf = kb_mapping_utilities.fpred_value_gaf(relation, verbosifier.$const13$expansionDefn, (SubLObject)verbosifier.UNPROVIDED, (SubLObject)verbosifier.UNPROVIDED);
                if (verbosifier.NIL != expansion_defn_gaf) {
                    final SubLObject possible_defn = el_utilities.cycl_subl_symbol_symbol(assertions_high.gaf_arg2(expansion_defn_gaf));
                    if (verbosifier.NIL != at_defns.viable_defnP(possible_defn, (SubLObject)verbosifier.UNPROVIDED)) {
                        expansion_defn = possible_defn;
                        possibly_note_expansion_justification_support(expansion_defn_gaf);
                    }
                }
            }
            if (verbosifier.NIL != expansion) {
                SubLObject subst_list = (SubLObject)verbosifier.NIL;
                SubLObject arg_number = (SubLObject)verbosifier.ZERO_INTEGER;
                SubLObject cdolist_list_var;
                final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(relation_expression, (SubLObject)verbosifier.$kw10$IGNORE);
                SubLObject arg = (SubLObject)verbosifier.NIL;
                arg = cdolist_list_var.first();
                while (verbosifier.NIL != cdolist_list_var) {
                    arg_number = Numbers.add(arg_number, (SubLObject)verbosifier.ONE_INTEGER);
                    final SubLObject old_arg = at_utilities.get_generic_arg(arg_number);
                    subst_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(old_arg, arg), subst_list);
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                }
                expansion = (result_expression = conses_high.sublis(subst_list, expansion, (SubLObject)verbosifier.UNPROVIDED, (SubLObject)verbosifier.UNPROVIDED));
            }
            else if (verbosifier.NIL != expansion_defn) {
                thread.resetMultipleValues();
                final SubLObject result_expression_$29 = Functions.funcall(expansion_defn, relation_expression);
                final SubLObject mt_$30 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                result_expression = result_expression_$29;
                mt = mt_$30;
            }
            else {
                result_expression = relation_expression;
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return Values.values(result_expression, mt);
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 19293L)
    public static SubLObject el_formula_expansion_int(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return el_expansion_int(formula, mt_relevance_macros.$mt$.getDynamicValue(thread));
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 19386L)
    public static SubLObject el_expansion_recursive(final SubLObject formula, final SubLObject mt, final SubLObject recursion_limit, final SubLObject recursion_level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (recursion_level.numG(recursion_limit)) {
            el_utilities.el_error((SubLObject)verbosifier.TWO_INTEGER, (SubLObject)verbosifier.$str14$Trying_to_expand_a_recursive_EL_r, recursion_limit, formula, (SubLObject)verbosifier.UNPROVIDED);
            return (SubLObject)verbosifier.NIL;
        }
        if (verbosifier.NIL != el_utilities.el_formula_p(formula) && verbosifier.NIL != el_viably_expandible_formulaP(formula)) {
            thread.resetMultipleValues();
            final SubLObject new_formula = el_expansion_int(formula, mt);
            final SubLObject new_mt = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return el_expansion_recursive(new_formula, new_mt, recursion_limit, Numbers.add((SubLObject)verbosifier.ONE_INTEGER, recursion_level));
        }
        return Values.values(formula, mt);
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 19976L)
    public static SubLObject has_viable_expansionP(final SubLObject relation_expression) {
        final SubLObject expansion = kb_mapping_utilities.fpred_value_in_relevant_mts(cycl_utilities.find_when_closed_naut(cycl_utilities.formula_operator(relation_expression)), verbosifier.$const12$expansion, (SubLObject)verbosifier.UNPROVIDED, (SubLObject)verbosifier.UNPROVIDED, (SubLObject)verbosifier.UNPROVIDED, (SubLObject)verbosifier.UNPROVIDED);
        final SubLObject generic_arg_nums = (SubLObject)(expansion.isCons() ? list_utilities.tree_gather(transform_list_utilities.ntransform(transform_list_utilities.transform(expansion, Symbols.symbol_function((SubLObject)verbosifier.$sym15$INTEGERP), Symbols.symbol_function((SubLObject)verbosifier.$sym16$NULL), (SubLObject)verbosifier.UNPROVIDED), Symbols.symbol_function((SubLObject)verbosifier.$sym17$GENERIC_ARG_P), Symbols.symbol_function((SubLObject)verbosifier.$sym18$GENERIC_ARG_NUM), (SubLObject)verbosifier.UNPROVIDED, (SubLObject)verbosifier.UNPROVIDED, (SubLObject)verbosifier.UNPROVIDED), Symbols.symbol_function((SubLObject)verbosifier.$sym15$INTEGERP), (SubLObject)verbosifier.UNPROVIDED, (SubLObject)verbosifier.UNPROVIDED, (SubLObject)verbosifier.UNPROVIDED) : verbosifier.NIL);
        if (generic_arg_nums.isCons()) {
            return el_utilities.formula_arityGE(relation_expression, Functions.apply(Symbols.symbol_function((SubLObject)verbosifier.$sym19$MAX), generic_arg_nums), (SubLObject)verbosifier.UNPROVIDED);
        }
        return el_utilities.formula_arityE(relation_expression, (SubLObject)verbosifier.ZERO_INTEGER, (SubLObject)verbosifier.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 20702L)
    public static SubLObject has_viable_defnP(final SubLObject relation_expression) {
        final SubLObject expansion_defn = el_utilities.cycl_subl_symbol_symbol(kb_mapping_utilities.fpred_value_in_relevant_mts(cycl_utilities.formula_operator(relation_expression), verbosifier.$const13$expansionDefn, (SubLObject)verbosifier.UNPROVIDED, (SubLObject)verbosifier.UNPROVIDED, (SubLObject)verbosifier.UNPROVIDED, (SubLObject)verbosifier.UNPROVIDED));
        return at_defns.viable_defnP(expansion_defn, (SubLObject)verbosifier.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 21054L)
    public static SubLObject el_uniquify_wrt(final SubLObject var, final SubLObject formula) {
        return (verbosifier.NIL != list_utilities.tree_find(var, formula, (SubLObject)verbosifier.UNPROVIDED, (SubLObject)verbosifier.UNPROVIDED)) ? clausifier.el_uniquify(var) : var;
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 21336L)
    public static SubLObject el_uniquify_formula_vars_wrt(final SubLObject formula_to_uniquify, final SubLObject reference_formula) {
        return el_uniquify_formula_vars_wrt_int(formula_to_uniquify, reference_formula, (SubLObject)verbosifier.NIL);
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 21685L)
    public static SubLObject el_nuniquify_formula_vars_wrt(final SubLObject formula_to_uniquify, final SubLObject reference_formula) {
        return el_uniquify_formula_vars_wrt_int(formula_to_uniquify, reference_formula, (SubLObject)verbosifier.T);
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 22029L)
    public static SubLObject el_uniquify_formula_vars_wrt_int(final SubLObject formula_to_uniquify, final SubLObject reference_formula, final SubLObject destructiveP) {
        if (verbosifier.NIL == el_utilities.el_formula_p(formula_to_uniquify)) {
            return formula_to_uniquify;
        }
        final SubLObject candidate_vars_to_uniquify = cycl_utilities.formula_gather(formula_to_uniquify, Symbols.symbol_function((SubLObject)verbosifier.$sym20$EL_VAR_), (SubLObject)verbosifier.NIL, (SubLObject)verbosifier.UNPROVIDED, (SubLObject)verbosifier.UNPROVIDED, (SubLObject)verbosifier.UNPROVIDED);
        final SubLObject reference_vars = (SubLObject)((verbosifier.NIL != candidate_vars_to_uniquify) ? cycl_utilities.formula_gather(reference_formula, Symbols.symbol_function((SubLObject)verbosifier.$sym20$EL_VAR_), (SubLObject)verbosifier.NIL, (SubLObject)verbosifier.UNPROVIDED, (SubLObject)verbosifier.UNPROVIDED, (SubLObject)verbosifier.UNPROVIDED) : verbosifier.NIL);
        final SubLObject vars_to_uniquify = (SubLObject)((verbosifier.NIL != candidate_vars_to_uniquify && verbosifier.NIL != reference_vars) ? conses_high.nintersection(candidate_vars_to_uniquify, reference_vars, (SubLObject)verbosifier.UNPROVIDED, (SubLObject)verbosifier.UNPROVIDED) : verbosifier.NIL);
        if (verbosifier.NIL != vars_to_uniquify) {
            SubLObject alist = (SubLObject)verbosifier.NIL;
            SubLObject cdolist_list_var = vars_to_uniquify;
            SubLObject var = (SubLObject)verbosifier.NIL;
            var = cdolist_list_var.first();
            while (verbosifier.NIL != cdolist_list_var) {
                alist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var, clausifier.el_uniquify(var)), alist);
                cdolist_list_var = cdolist_list_var.rest();
                var = cdolist_list_var.first();
            }
            return (verbosifier.NIL != destructiveP) ? conses_high.nsublis(alist, formula_to_uniquify, (SubLObject)verbosifier.UNPROVIDED, (SubLObject)verbosifier.UNPROVIDED) : conses_high.sublis(alist, formula_to_uniquify, (SubLObject)verbosifier.UNPROVIDED, (SubLObject)verbosifier.UNPROVIDED);
        }
        return formula_to_uniquify;
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 22958L)
    public static SubLObject expansion_nautP(final SubLObject v_object, SubLObject mt) {
        if (mt == verbosifier.UNPROVIDED) {
            mt = (SubLObject)verbosifier.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_boolean = (SubLObject)verbosifier.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            if (verbosifier.NIL != term.first_order_nautP(v_object)) {
                final SubLObject function = cycl_utilities.nat_arg0(v_object);
                v_boolean = arg0_of_any_expansionP(function);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_boolean;
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 23387L)
    public static SubLObject arg0_of_any_expansionP(final SubLObject relation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (verbosifier.NIL != forts.fort_p(relation)) {
            SubLObject v_boolean = (SubLObject)verbosifier.NIL;
            final SubLObject _prev_bind_0 = control_vars.$mapping_source$.currentBinding(thread);
            final SubLObject _prev_bind_2 = control_vars.$mapping_answer$.currentBinding(thread);
            try {
                control_vars.$mapping_source$.bind(relation, thread);
                control_vars.$mapping_answer$.bind((SubLObject)verbosifier.NIL, thread);
                kb_mapping.map_other_index((SubLObject)verbosifier.$sym21$EXPANSION_ARG2_ARG0_P, relation, (SubLObject)verbosifier.$kw22$TRUE, (SubLObject)verbosifier.T);
                v_boolean = control_vars.$mapping_answer$.getDynamicValue(thread);
            }
            finally {
                control_vars.$mapping_answer$.rebind(_prev_bind_2, thread);
                control_vars.$mapping_source$.rebind(_prev_bind_0, thread);
            }
            return v_boolean;
        }
        if (verbosifier.NIL != term.first_order_nautP(relation)) {
            return arg0_of_any_expansionP(narts_high.find_nart(relation));
        }
        return (SubLObject)verbosifier.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/verbosifier.lisp", position = 23912L)
    public static SubLObject expansion_arg2_arg0_p(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (verbosifier.NIL != assertions_high.gaf_assertionP(assertion) && verbosifier.$const12$expansion.eql(assertions_high.gaf_arg0(assertion)) && control_vars.$mapping_source$.getDynamicValue(thread).eql(cycl_utilities.formula_arg0(assertions_high.gaf_arg2(assertion)))) {
            control_vars.$mapping_answer$.setDynamicValue((SubLObject)verbosifier.T, thread);
            utilities_macros.mapping_finished();
        }
        return (SubLObject)verbosifier.NIL;
    }

    public static SubLObject declare_verbosifier_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "verbosify_cycl", "VERBOSIFY-CYCL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "el_expansion", "EL-EXPANSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "el_expansion_destructive", "EL-EXPANSION-DESTRUCTIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "el_expansion_one_step", "EL-EXPANSION-ONE-STEP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "el_expansion_one_step_destructive", "EL-EXPANSION-ONE-STEP-DESTRUCTIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "el_expand_all", "EL-EXPAND-ALL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "el_expand_all_evaluatable", "EL-EXPAND-ALL-EVALUATABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "el_expand_all_int", "EL-EXPAND-ALL-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "el_expand_all_destructive", "EL-EXPAND-ALL-DESTRUCTIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "el_expandible_subformulaP", "EL-EXPANDIBLE-SUBFORMULA?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "gathering_expansion_justificationsP", "GATHERING-EXPANSION-JUSTIFICATIONS?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "possibly_note_expansion_justification_support", "POSSIBLY-NOTE-EXPANSION-JUSTIFICATION-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "note_expansion_justification_support", "NOTE-EXPANSION-JUSTIFICATION-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "expansion_justification", "EXPANSION-JUSTIFICATION", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.verbosifier", "gathering_expansion_justifications", "GATHERING-EXPANSION-JUSTIFICATIONS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "verbosify_cycl_justified", "VERBOSIFY-CYCL-JUSTIFIED", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "el_expansion_justified", "EL-EXPANSION-JUSTIFIED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "el_expansion_destructive_justified", "EL-EXPANSION-DESTRUCTIVE-JUSTIFIED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "el_expansion_one_step_justified", "EL-EXPANSION-ONE-STEP-JUSTIFIED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "el_expansion_one_step_destructive_justified", "EL-EXPANSION-ONE-STEP-DESTRUCTIVE-JUSTIFIED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "el_expand_all_justified", "EL-EXPAND-ALL-JUSTIFIED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "el_expand_all_evaluatable_justified", "EL-EXPAND-ALL-EVALUATABLE-JUSTIFIED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "el_expand_all_destructive_justified", "EL-EXPAND-ALL-DESTRUCTIVE-JUSTIFIED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "el_relations_out", "EL-RELATIONS-OUT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "expandible_el_relation_expressionP", "EXPANDIBLE-EL-RELATION-EXPRESSION?", 1, 1, false);
        new $expandible_el_relation_expressionP$UnaryFunction();
        new $expandible_el_relation_expressionP$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "el_expandible_formulaP", "EL-EXPANDIBLE-FORMULA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "el_viably_expandible_formulaP", "EL-VIABLY-EXPANDIBLE-FORMULA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "el_viably_expandible_evaluatable_formulaP", "EL-VIABLY-EXPANDIBLE-EVALUATABLE-FORMULA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "el_expandible_relationP", "EL-EXPANDIBLE-RELATION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "el_expandible_relation_expressionP", "EL-EXPANDIBLE-RELATION-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "expandible_relation_expressionP", "EXPANDIBLE-RELATION-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "el_viable_relation_expressionP", "EL-VIABLE-RELATION-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "el_expansionP", "EL-EXPANSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "el_expansion_int", "EL-EXPANSION-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "el_formula_expansion_int", "EL-FORMULA-EXPANSION-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "el_expansion_recursive", "EL-EXPANSION-RECURSIVE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "has_viable_expansionP", "HAS-VIABLE-EXPANSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "has_viable_defnP", "HAS-VIABLE-DEFN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "el_uniquify_wrt", "EL-UNIQUIFY-WRT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "el_uniquify_formula_vars_wrt", "EL-UNIQUIFY-FORMULA-VARS-WRT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "el_nuniquify_formula_vars_wrt", "EL-NUNIQUIFY-FORMULA-VARS-WRT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "el_uniquify_formula_vars_wrt_int", "EL-UNIQUIFY-FORMULA-VARS-WRT-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "expansion_nautP", "EXPANSION-NAUT?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "arg0_of_any_expansionP", "ARG0-OF-ANY-EXPANSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.verbosifier", "expansion_arg2_arg0_p", "EXPANSION-ARG2-ARG0-P", 1, 0, false);
        return (SubLObject)verbosifier.NIL;
    }

    public static SubLObject init_verbosifier_file() {
        verbosifier.$el_relation_recursion_limit$ = SubLFiles.defparameter("*EL-RELATION-RECURSION-LIMIT*", (SubLObject)verbosifier.$int0$212);
        verbosifier.$gather_expansion_justificationsP$ = SubLFiles.defparameter("*GATHER-EXPANSION-JUSTIFICATIONS?*", (SubLObject)verbosifier.NIL);
        verbosifier.$expansion_justification$ = SubLFiles.defparameter("*EXPANSION-JUSTIFICATION*", (SubLObject)verbosifier.NIL);
        return (SubLObject)verbosifier.NIL;
    }

    public static SubLObject setup_verbosifier_file() {
        return (SubLObject)verbosifier.NIL;
    }

    public void declareFunctions() {
        declare_verbosifier_file();
    }

    public void initializeVariables() {
        init_verbosifier_file();
    }

    public void runTopLevelForms() {
        setup_verbosifier_file();
    }

    static {
        me = (SubLFile)new verbosifier();
        verbosifier.$el_relation_recursion_limit$ = null;
        verbosifier.$gather_expansion_justificationsP$ = null;
        verbosifier.$expansion_justification$ = null;
        $int0$212 = SubLObjectFactory.makeInteger(212);
        $sym1$EL_VIABLY_EXPANDIBLE_FORMULA_ = SubLObjectFactory.makeSymbol("EL-VIABLY-EXPANDIBLE-FORMULA?");
        $sym2$EL_VIABLY_EXPANDIBLE_EVALUATABLE_FORMULA_ = SubLObjectFactory.makeSymbol("EL-VIABLY-EXPANDIBLE-EVALUATABLE-FORMULA?");
        $kw3$TRANSFORMATION_LIMIT_EXCEEDED = SubLObjectFactory.makeKeyword("TRANSFORMATION-LIMIT-EXCEEDED");
        $sym4$EL_FORMULA_EXPANSION_INT = SubLObjectFactory.makeSymbol("EL-FORMULA-EXPANSION-INT");
        $kw5$RECURSION_LIMIT_EXCEEDED = SubLObjectFactory.makeKeyword("RECURSION-LIMIT-EXCEEDED");
        $sym6$EXPANDIBLE_RELATION_EXPRESSION_ = SubLObjectFactory.makeSymbol("EXPANDIBLE-RELATION-EXPRESSION?");
        $sym7$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list8 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GATHER-EXPANSION-JUSTIFICATIONS?*"), (SubLObject)verbosifier.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*EXPANSION-JUSTIFICATION*"), (SubLObject)verbosifier.NIL));
        $sym9$EXPANDIBLE_EL_RELATION_EXPRESSION_ = SubLObjectFactory.makeSymbol("EXPANDIBLE-EL-RELATION-EXPRESSION?");
        $kw10$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $kw11$INVALID_EXPANSION = SubLObjectFactory.makeKeyword("INVALID-EXPANSION");
        $const12$expansion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("expansion"));
        $const13$expansionDefn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("expansionDefn"));
        $str14$Trying_to_expand_a_recursive_EL_r = SubLObjectFactory.makeString("Trying to expand a recursive EL relation, hit the recursion limit ~D while expanding ~A~%");
        $sym15$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym16$NULL = SubLObjectFactory.makeSymbol("NULL");
        $sym17$GENERIC_ARG_P = SubLObjectFactory.makeSymbol("GENERIC-ARG-P");
        $sym18$GENERIC_ARG_NUM = SubLObjectFactory.makeSymbol("GENERIC-ARG-NUM");
        $sym19$MAX = SubLObjectFactory.makeSymbol("MAX");
        $sym20$EL_VAR_ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $sym21$EXPANSION_ARG2_ARG0_P = SubLObjectFactory.makeSymbol("EXPANSION-ARG2-ARG0-P");
        $kw22$TRUE = SubLObjectFactory.makeKeyword("TRUE");
    }

    public static final class $expandible_el_relation_expressionP$UnaryFunction extends UnaryFunction
    {
        public $expandible_el_relation_expressionP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("EXPANDIBLE-EL-RELATION-EXPRESSION?"));
        }

        public SubLObject processItem(final SubLObject arg1) {
            return verbosifier.expandible_el_relation_expressionP(arg1, (SubLObject)UNPROVIDED);
        }
    }

    public static final class $expandible_el_relation_expressionP$BinaryFunction extends BinaryFunction
    {
        public $expandible_el_relation_expressionP$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("EXPANDIBLE-EL-RELATION-EXPRESSION?"));
        }

        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return verbosifier.expandible_el_relation_expressionP(arg1, arg2);
        }
    }
}

/*

	Total time: 163 ms

*/