package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class clausifier extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.clausifier";
    public static final String myFingerPrint = "2a26a042856369a0884fd745608529436586d0f3e3ea3dcd653ed8f7d9756594";
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 1166L)
    public static SubLSymbol $canonical_variable_name_stem$;
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 1903L)
    public static SubLSymbol $use_cnf_cacheP$;
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 2024L)
    private static SubLSymbol $newly_introduced_universals$;
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 2155L)
    private static SubLSymbol $outermost_implication$;
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 2501L)
    private static SubLSymbol $innermost_implication$;
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 2644L)
    private static SubLSymbol $eliminate_existential_with_var_only_in_antecedentP$;
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 28132L)
    private static SubLSymbol $quantifier_info_list$;
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 46377L)
    private static SubLSymbol $czer_bad_exponential_threshold$;
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 55374L)
    private static SubLSymbol $clausifier_input_sentence$;
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 55649L)
    private static SubLSymbol $clausifier_input_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 65626L)
    private static SubLSymbol $cached_cnf_clausal_form_caching_state$;
    private static final SubLString $str0$el_var;
    private static final SubLSymbol $kw1$ERROR;
    private static final SubLSymbol $kw2$UNINITIALIZED;
    private static final SubLSymbol $sym3$DO_IMPLICATIONS_RECURSIVE;
    private static final SubLSymbol $sym4$DO_NEGATIONS_DESTRUCTIVE;
    private static final SubLSymbol $kw5$HELLO_YOU_SILLY_COMPILER;
    private static final SubLObject $const6$True;
    private static final SubLObject $const7$False;
    private static final SubLSymbol $kw8$REGULARIZE;
    private static final SubLString $str9$_s_is_not_a_quantified_sentence;
    private static final SubLSymbol $sym10$NEGATE_NEGATION;
    private static final SubLSymbol $sym11$NEGATE_FORMULA;
    private static final SubLObject $const12$DifferenceFn;
    private static final SubLString $str13$_s_contained_the_invalid_bound__D;
    private static final SubLObject $const14$PlusFn;
    private static final SubLSymbol $sym15$EL_FORMULA_P;
    private static final SubLInteger $int16$32;
    private static final SubLSymbol $sym17$CYC_VAR_;
    private static final SubLObject $const18$Quote;
    private static final SubLSymbol $sym19$RECURSIVELY_STANDARDIZE_VARIABLES;
    private static final SubLSymbol $sym20$EL_UNIQUIFY_STANDARDIZE;
    private static final SubLSymbol $sym21$EL_VAR_WITHOUT_QUOTE;
    private static final SubLSymbol $kw22$IGNORE;
    private static final SubLString $str23$_;
    private static final SubLSymbol $sym24$CYC_CONST_GENERAL_EXISTENTIAL_OPERATOR_P;
    private static final SubLSymbol $kw25$TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE;
    private static final SubLSymbol $kw26$AMBIGUOUS_VAR_TYPE_IN_SKOLEM_SCOPE;
    private static final SubLSymbol $kw27$QUANTIFIED_SEQUENCE_VARIABLE;
    private static final SubLSymbol $sym28$EXISTENTIALS_OUT_INT;
    private static final SubLString $str29$Unexpected_sentence_type_in_exist;
    private static final SubLObject $const30$forAll;
    private static final SubLSymbol $kw31$NEITHER;
    private static final SubLSymbol $kw32$TERM;
    private static final SubLSymbol $kw33$SEQ;
    private static final SubLSymbol $kw34$BOTH;
    private static final SubLSymbol $kw35$UNDETERMINED;
    private static final SubLString $str36$Skolemizer_failed_to_classify_var;
    private static final SubLString $str37$skolem_constants_not_yet_supporte;
    private static final SubLObject $const38$thereExists;
    private static final SubLObject $const39$SkolemFunctionFn;
    private static final SubLObject $const40$SkolemFuncNFn;
    private static final SubLString $str41$make_skolem_fn_fn_doesn_t_know_ho;
    private static final SubLSymbol $kw42$ASSERT_ONLY;
    private static final SubLString $str43$Unexpected_value_for__forbid_quan;
    private static final SubLSymbol $sym44$UNIVERSALS_OUT;
    private static final SubLString $str45$Got_the_unexpected_sentence__S_in;
    private static final SubLSymbol $sym46$DISJUNCTIONS_IN;
    private static final SubLString $str47$Got_the_unexpected_sentence__S_in;
    private static final SubLSymbol $sym48$EL_CONJUNCTION_P;
    private static final SubLSymbol $kw49$BAD_EXPONENTIAL_DISJUNCTION;
    private static final SubLInteger $int50$200000;
    private static final SubLSymbol $sym51$FORMULA_ARITY;
    private static final SubLString $str52$_s_is_not_a_conjunction__so_it_is;
    private static final SubLString $str53$_s_is_not_a_disjunction__so__S_is;
    private static final SubLSymbol $sym54$CONJUNCTIONS_IN;
    private static final SubLString $str55$Got_the_unexpected_formula__S_in_;
    private static final SubLSymbol $sym56$EL_DISJUNCTION_P;
    private static final SubLSymbol $kw57$BAD_EXPONENTIAL_CONJUNCTION;
    private static final SubLString $str58$_s_is_not_a_disjunction__so_it_is;
    private static final SubLString $str59$_s_is_not_a_conjunction__so__S_is;
    private static final SubLSymbol $sym60$PACKAGE_XNF_CLAUSE;
    private static final SubLSymbol $sym61$FORMULA_ARG1;
    private static final SubLSymbol $sym62$EL_VAR_;
    private static final SubLSymbol $sym63$LEADING_UNIVERSAL_VARIABLES_1;
    private static final SubLSymbol $sym64$STRING_;
    private static final SubLSymbol $sym65$STR;
    private static final SubLObject $const66$and;
    private static final SubLSymbol $kw67$CNF;
    private static final SubLSymbol $kw68$DNF;
    private static final SubLSymbol $sym69$CACHED_CNF_CLAUSAL_FORM;
    private static final SubLSymbol $sym70$_CACHED_CNF_CLAUSAL_FORM_CACHING_STATE_;
    private static final SubLInteger $int71$48;
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 2776L)
    public static SubLObject do_implications(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)clausifier.NIL;
        final SubLObject _prev_bind_0 = clausifier.$outermost_implication$.currentBinding(thread);
        try {
            clausifier.$outermost_implication$.bind(sentence, thread);
            result = do_implications_recursive(sentence);
        }
        finally {
            clausifier.$outermost_implication$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 2962L)
    public static SubLObject do_implications_recursive(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (clausifier.NIL != czer_utilities.encapsulate_formulaP(sentence)) {
            if (clausifier.NIL != eliminate_existential_with_var_only_in_antecedentP(sentence, clausifier.$innermost_implication$.getDynamicValue(thread), clausifier.$outermost_implication$.getDynamicValue(thread))) {
                return do_implications_recursive(el_utilities.quantified_sub_sentence(sentence));
            }
            return czer_utilities.encapsulate_formula(sentence, (SubLObject)clausifier.UNPROVIDED);
        }
        else {
            if (clausifier.NIL == el_utilities.el_formula_p(sentence)) {
                return sentence;
            }
            final SubLObject seqvar = el_utilities.sequence_var(sentence, (SubLObject)clausifier.UNPROVIDED);
            final SubLObject sentence_$1 = (clausifier.NIL != seqvar) ? el_utilities.strip_sequence_var(sentence) : sentence;
            SubLObject result = (SubLObject)clausifier.NIL;
            if (clausifier.NIL != el_utilities.el_implication_p(sentence_$1) && clausifier.NIL != el_utilities.el_meets_pragmatic_requirement_p(cycl_utilities.sentence_arg2(sentence_$1, (SubLObject)clausifier.UNPROVIDED))) {
                SubLObject disjunct_1 = (SubLObject)clausifier.NIL;
                final SubLObject _prev_bind_0 = clausifier.$innermost_implication$.currentBinding(thread);
                try {
                    clausifier.$innermost_implication$.bind(sentence_$1, thread);
                    final SubLObject _prev_bind_0_$2 = control_vars.$within_ask$.currentBinding(thread);
                    try {
                        control_vars.$within_ask$.bind((SubLObject)clausifier.T, thread);
                        disjunct_1 = el_utilities.make_negation(el_utilities.funcall_formula_arg(Symbols.symbol_function((SubLObject)clausifier.$sym3$DO_IMPLICATIONS_RECURSIVE), sentence_$1, (SubLObject)clausifier.ONE_INTEGER));
                    }
                    finally {
                        control_vars.$within_ask$.rebind(_prev_bind_0_$2, thread);
                    }
                    result = el_utilities.make_disjunction((SubLObject)ConsesLow.list(disjunct_1, el_utilities.funcall_formula_arg(Symbols.symbol_function((SubLObject)clausifier.$sym3$DO_IMPLICATIONS_RECURSIVE), sentence_$1, (SubLObject)clausifier.TWO_INTEGER)));
                }
                finally {
                    clausifier.$innermost_implication$.rebind(_prev_bind_0, thread);
                }
            }
            else if (clausifier.NIL != el_utilities.el_implication_p(sentence_$1)) {
                SubLObject disjunct_1 = (SubLObject)clausifier.NIL;
                final SubLObject _prev_bind_0 = clausifier.$innermost_implication$.currentBinding(thread);
                try {
                    clausifier.$innermost_implication$.bind(sentence_$1, thread);
                    final SubLObject _prev_bind_0_$3 = at_vars.$within_disjunctionP$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = at_vars.$within_negated_disjunctionP$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = czer_vars.$within_negationP$.currentBinding(thread);
                    try {
                        at_vars.$within_disjunctionP$.bind((SubLObject)clausifier.T, thread);
                        at_vars.$within_negated_disjunctionP$.bind(czer_vars.$within_negationP$.getDynamicValue(thread), thread);
                        czer_vars.$within_negationP$.bind((SubLObject)SubLObjectFactory.makeBoolean(clausifier.NIL == czer_vars.$within_negationP$.getDynamicValue(thread)), thread);
                        disjunct_1 = el_utilities.make_negation(el_utilities.funcall_formula_arg(Symbols.symbol_function((SubLObject)clausifier.$sym3$DO_IMPLICATIONS_RECURSIVE), sentence_$1, (SubLObject)clausifier.ONE_INTEGER));
                    }
                    finally {
                        czer_vars.$within_negationP$.rebind(_prev_bind_3, thread);
                        at_vars.$within_negated_disjunctionP$.rebind(_prev_bind_2, thread);
                        at_vars.$within_disjunctionP$.rebind(_prev_bind_0_$3, thread);
                    }
                    result = el_utilities.make_disjunction((SubLObject)ConsesLow.list(disjunct_1, el_utilities.funcall_formula_arg(Symbols.symbol_function((SubLObject)clausifier.$sym3$DO_IMPLICATIONS_RECURSIVE), sentence_$1, (SubLObject)clausifier.TWO_INTEGER)));
                }
                finally {
                    clausifier.$innermost_implication$.rebind(_prev_bind_0, thread);
                }
            }
            else {
                result = el_utilities.pass_through_if_logical_op_or_quantified(Symbols.symbol_function((SubLObject)clausifier.$sym3$DO_IMPLICATIONS_RECURSIVE), sentence_$1);
            }
            if (clausifier.NIL != seqvar) {
                return el_utilities.nadd_sequence_var_to_end(seqvar, result);
            }
            return result;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 4779L)
    public static SubLObject eliminate_existential_with_var_only_in_antecedentP(final SubLObject existential, final SubLObject innermost_implication, final SubLObject outermost_implication) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (clausifier.NIL == clausifier.$eliminate_existential_with_var_only_in_antecedentP$.getDynamicValue(thread)) {
            return (SubLObject)clausifier.NIL;
        }
        if (innermost_implication.eql(outermost_implication) && clausifier.NIL != misc_utilities.initialized_p(innermost_implication) && clausifier.NIL != el_utilities.el_existential_p(existential) && clausifier.NIL == el_utilities.el_abnormal_p(cycl_utilities.formula_arg2(outermost_implication, (SubLObject)clausifier.UNPROVIDED))) {
            final SubLObject var = el_utilities.quantified_var(existential);
            return Types.sublisp_null(cycl_utilities.expression_find(var, cycl_utilities.formula_arg2(innermost_implication, (SubLObject)clausifier.UNPROVIDED), (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED));
        }
        return (SubLObject)clausifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 5412L)
    public static SubLObject do_negations(final SubLObject sentence) {
        return do_negations_destructive(el_utilities.copy_formula(sentence));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 5815L)
    public static SubLObject do_negations_destructive(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject seqvar = el_utilities.sequence_var(sentence, (SubLObject)clausifier.UNPROVIDED);
        final SubLObject sentence_$4 = (clausifier.NIL != seqvar) ? el_utilities.strip_sequence_var(sentence) : sentence;
        SubLObject result = (SubLObject)clausifier.NIL;
        if (clausifier.NIL != czer_utilities.encapsulate_formulaP(sentence_$4)) {
            result = czer_utilities.encapsulate_formula(sentence_$4, (SubLObject)clausifier.UNPROVIDED);
        }
        else if (clausifier.NIL == el_utilities.el_formula_p(sentence_$4)) {
            result = sentence_$4;
        }
        else if (clausifier.NIL != czer_utilities.true_negated_varP(sentence_$4, (SubLObject)clausifier.UNPROVIDED)) {
            result = lift_negation(sentence_$4);
        }
        else if (clausifier.NIL != czer_utilities.true_negated_formulaP(sentence_$4)) {
            if (clausifier.NIL != czer_utilities.within_disjunctionP()) {
                result = lift_negation(sentence_$4);
            }
            else {
                final SubLObject _prev_bind_0 = czer_vars.$encapsulate_var_formulaP$.currentBinding(thread);
                final SubLObject _prev_bind_2 = czer_vars.$encapsulate_intensional_formulaP$.currentBinding(thread);
                try {
                    czer_vars.$encapsulate_var_formulaP$.bind((SubLObject)clausifier.NIL, thread);
                    czer_vars.$encapsulate_intensional_formulaP$.bind((SubLObject)clausifier.NIL, thread);
                    result = el_utilities.make_unary_formula(cycl_utilities.formula_operator(sentence_$4), el_utilities.funcall_formula_arg(Symbols.symbol_function((SubLObject)clausifier.$sym4$DO_NEGATIONS_DESTRUCTIVE), sentence_$4, (SubLObject)clausifier.ONE_INTEGER));
                }
                finally {
                    czer_vars.$encapsulate_intensional_formulaP$.rebind(_prev_bind_2, thread);
                    czer_vars.$encapsulate_var_formulaP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        else if (clausifier.NIL != el_utilities.el_implication_p(sentence_$4)) {
            result = do_negations_destructive(do_implications(sentence_$4));
        }
        else if (clausifier.NIL != el_utilities.el_negation_p(sentence_$4)) {
            if (clausifier.NIL != cycl_utilities.opaque_argP(sentence_$4, (SubLObject)clausifier.ONE_INTEGER)) {
                result = sentence_$4;
            }
            else {
                SubLObject new_sentence = (SubLObject)clausifier.NIL;
                final SubLObject _prev_bind_3 = czer_vars.$within_negationP$.currentBinding(thread);
                try {
                    czer_vars.$within_negationP$.bind((SubLObject)SubLObjectFactory.makeBoolean(clausifier.NIL == czer_vars.$within_negationP$.getDynamicValue(thread)), thread);
                    new_sentence = negation_in(sentence_$4);
                }
                finally {
                    czer_vars.$within_negationP$.rebind(_prev_bind_3, thread);
                }
                if (clausifier.NIL != el_utilities.el_negation_p(new_sentence)) {
                    result = new_sentence;
                }
                else {
                    result = do_negations_destructive(new_sentence);
                }
            }
        }
        else {
            result = el_utilities.pass_through_if_logical_op_or_quantified(Symbols.symbol_function((SubLObject)clausifier.$sym4$DO_NEGATIONS_DESTRUCTIVE), sentence_$4);
        }
        if (clausifier.NIL != seqvar) {
            return el_utilities.nadd_sequence_var_to_end(seqvar, result);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 7665L)
    public static SubLObject negate_formula(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sentence.eql(clausifier.$const6$True)) {
            return clausifier.$const7$False;
        }
        if (sentence.eql(clausifier.$const7$False)) {
            return clausifier.$const6$True;
        }
        if (clausifier.NIL != czer_utilities.encapsulate_formulaP(sentence)) {
            return negate_encapsulate_sentence(sentence);
        }
        if (clausifier.NIL != el_utilities.el_conjunction_p(sentence)) {
            return negate_conjunction(sentence);
        }
        if (clausifier.NIL != el_utilities.el_disjunction_p(sentence)) {
            return negate_disjunction_destructive(sentence);
        }
        if (clausifier.NIL != el_utilities.el_negation_p(sentence)) {
            SubLObject result = (SubLObject)clausifier.NIL;
            final SubLObject _prev_bind_0 = czer_vars.$within_negationP$.currentBinding(thread);
            try {
                czer_vars.$within_negationP$.bind((SubLObject)SubLObjectFactory.makeBoolean(clausifier.NIL == czer_vars.$within_negationP$.getDynamicValue(thread)), thread);
                result = negation_in(negate_negation(sentence));
            }
            finally {
                czer_vars.$within_negationP$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        if (clausifier.NIL != el_utilities.cycl_universal_p(sentence)) {
            return negate_universal(sentence);
        }
        if (clausifier.NIL != el_utilities.el_existential_p(sentence)) {
            return negate_existential(sentence);
        }
        if (clausifier.NIL != el_utilities.el_existential_min_p(sentence)) {
            return negate_existential_min(sentence);
        }
        if (clausifier.NIL != el_utilities.el_existential_max_p(sentence)) {
            return negate_existential_max(sentence);
        }
        if (clausifier.NIL != el_utilities.el_existential_exact_p(sentence)) {
            return negate_existential_exact(sentence);
        }
        if (clausifier.NIL != czer_utilities.true_negated_varP(sentence, (SubLObject)clausifier.UNPROVIDED)) {
            return lift_negation(sentence);
        }
        if (clausifier.NIL != czer_utilities.true_negated_formulaP(sentence)) {
            return negate_true_sentence(sentence);
        }
        if (clausifier.NIL != el_utilities.el_implication_p(sentence)) {
            return uncanonicalizer.implications_in(do_negations_destructive(do_implications(cycl_utilities.negate(sentence))));
        }
        return el_utilities.make_negation(sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 10088L)
    public static SubLObject negation_in(final SubLObject sentence) {
        if (clausifier.NIL == el_utilities.el_negation_p(sentence)) {
            return sentence;
        }
        return negate_formula(cycl_utilities.formula_arg1(sentence, (SubLObject)clausifier.$kw8$REGULARIZE));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 11505L)
    public static SubLObject negate_quantified_sentence(final SubLObject sentence) {
        if (clausifier.NIL != el_utilities.cycl_universal_p(sentence)) {
            return negate_universal(sentence);
        }
        if (clausifier.NIL != el_utilities.el_existential_p(sentence)) {
            return negate_existential(sentence);
        }
        if (clausifier.NIL != el_utilities.el_existential_min_p(sentence)) {
            return negate_existential_min(sentence);
        }
        if (clausifier.NIL != el_utilities.el_existential_max_p(sentence)) {
            return negate_existential_max(sentence);
        }
        if (clausifier.NIL != el_utilities.el_existential_exact_p(sentence)) {
            return negate_existential_exact(sentence);
        }
        el_utilities.el_error((SubLObject)clausifier.FOUR_INTEGER, (SubLObject)clausifier.$str9$_s_is_not_a_quantified_sentence, sentence, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED);
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 12064L)
    public static SubLObject negate_atomic(final SubLObject sentence) {
        return el_utilities.make_negation(sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 12250L)
    public static SubLObject negate_negation(final SubLObject negation) {
        return cycl_utilities.formula_arg1(negation, (SubLObject)clausifier.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 12463L)
    public static SubLObject negate_negations(final SubLObject negations) {
        return list_utilities.nmapcar(Symbols.symbol_function((SubLObject)clausifier.$sym10$NEGATE_NEGATION), negations);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 12645L)
    public static SubLObject negate_conjunction(final SubLObject conjunction) {
        return simplifier.ndisjoin(Mapping.mapcar(Symbols.symbol_function((SubLObject)clausifier.$sym11$NEGATE_FORMULA), cycl_utilities.formula_args(conjunction, (SubLObject)clausifier.UNPROVIDED)), (SubLObject)clausifier.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 12984L)
    public static SubLObject negate_conjunction_destructive(final SubLObject conjunction) {
        return simplifier.ndisjoin(list_utilities.nmapcar(Symbols.symbol_function((SubLObject)clausifier.$sym11$NEGATE_FORMULA), cycl_utilities.formula_args(conjunction, (SubLObject)clausifier.UNPROVIDED)), (SubLObject)clausifier.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 13175L)
    public static SubLObject negate_disjunction_destructive(final SubLObject disjunction) {
        return simplifier.nconjoin(list_utilities.nmapcar(Symbols.symbol_function((SubLObject)clausifier.$sym11$NEGATE_FORMULA), cycl_utilities.formula_args(disjunction, (SubLObject)clausifier.UNPROVIDED)), (SubLObject)clausifier.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 13492L)
    public static SubLObject negate_universal(final SubLObject universal) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject quantifier = el_utilities.unmake_binary_formula(universal);
        final SubLObject variable = thread.secondMultipleValue();
        final SubLObject subform = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return el_utilities.make_existential(variable, negate_formula(subform));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 13909L)
    public static SubLObject negate_existential(final SubLObject existential) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject quantifier = el_utilities.unmake_binary_formula(existential);
        final SubLObject variable = thread.secondMultipleValue();
        final SubLObject subform = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return el_utilities.make_universal(variable, negate_formula(subform));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 14334L)
    public static SubLObject negate_existential_min(final SubLObject existential_min) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject quantifier = el_utilities.unmake_ternary_formula(existential_min);
        final SubLObject number = thread.secondMultipleValue();
        final SubLObject variable = thread.thirdMultipleValue();
        final SubLObject subform = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (!number.isInteger()) {
            return el_utilities.make_existential_max(el_utilities.make_binary_formula(clausifier.$const12$DifferenceFn, number, (SubLObject)clausifier.ONE_INTEGER), variable, subform);
        }
        if (number.numE((SubLObject)clausifier.ONE_INTEGER)) {
            return el_utilities.make_universal(variable, negate_formula(subform));
        }
        if (number.numG((SubLObject)clausifier.ONE_INTEGER)) {
            return el_utilities.make_existential_max(Numbers.subtract(number, (SubLObject)clausifier.ONE_INTEGER), variable, subform);
        }
        el_utilities.el_error((SubLObject)clausifier.FOUR_INTEGER, (SubLObject)clausifier.$str13$_s_contained_the_invalid_bound__D, existential_min, number, (SubLObject)clausifier.UNPROVIDED);
        return (SubLObject)clausifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 15179L)
    public static SubLObject negate_existential_max(final SubLObject existential_max) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject quantifier = el_utilities.unmake_ternary_formula(existential_max);
        final SubLObject number = thread.secondMultipleValue();
        final SubLObject variable = thread.thirdMultipleValue();
        final SubLObject subform = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (!number.isInteger()) {
            return el_utilities.make_existential_min(el_utilities.make_binary_formula(clausifier.$const14$PlusFn, number, (SubLObject)clausifier.ONE_INTEGER), variable, subform);
        }
        if (number.numG((SubLObject)clausifier.ZERO_INTEGER)) {
            return el_utilities.make_existential_min(Numbers.add(number, (SubLObject)clausifier.ONE_INTEGER), variable, subform);
        }
        el_utilities.el_error((SubLObject)clausifier.FOUR_INTEGER, (SubLObject)clausifier.$str13$_s_contained_the_invalid_bound__D, existential_max, number, (SubLObject)clausifier.UNPROVIDED);
        return (SubLObject)clausifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 15936L)
    public static SubLObject negate_existential_exact(final SubLObject existential_exact) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject quantifier = el_utilities.unmake_ternary_formula(existential_exact);
        final SubLObject number = thread.secondMultipleValue();
        final SubLObject variable = thread.thirdMultipleValue();
        final SubLObject subform = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (!number.isInteger()) {
            return simplifier.ndisjoin((SubLObject)ConsesLow.list(el_utilities.make_existential_min(el_utilities.make_binary_formula(clausifier.$const14$PlusFn, number, (SubLObject)clausifier.ONE_INTEGER), variable, subform), el_utilities.make_existential_max(el_utilities.make_binary_formula(clausifier.$const12$DifferenceFn, number, (SubLObject)clausifier.ONE_INTEGER), variable, subform)), (SubLObject)clausifier.UNPROVIDED);
        }
        if (number.numE((SubLObject)clausifier.ONE_INTEGER)) {
            return simplifier.ndisjoin((SubLObject)ConsesLow.list(el_utilities.make_universal(variable, negate_formula(subform)), el_utilities.make_existential_min((SubLObject)clausifier.TWO_INTEGER, variable, subform)), (SubLObject)clausifier.UNPROVIDED);
        }
        if (number.numG((SubLObject)clausifier.ONE_INTEGER)) {
            return simplifier.ndisjoin((SubLObject)ConsesLow.list(el_utilities.make_existential_min(Numbers.add(number, (SubLObject)clausifier.ONE_INTEGER), variable, subform), el_utilities.make_existential_max(Numbers.subtract(number, (SubLObject)clausifier.ONE_INTEGER), variable, subform)), (SubLObject)clausifier.UNPROVIDED);
        }
        el_utilities.el_error((SubLObject)clausifier.FOUR_INTEGER, (SubLObject)clausifier.$str13$_s_contained_the_invalid_bound__D, existential_exact, number, (SubLObject)clausifier.UNPROVIDED);
        return (SubLObject)clausifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 17137L)
    public static SubLObject negate_true_sentence(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sub_sentence = (SubLObject)clausifier.NIL;
        final SubLObject _prev_bind_0 = czer_vars.$encapsulate_intensional_formulaP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$within_negationP$.currentBinding(thread);
        try {
            czer_vars.$encapsulate_intensional_formulaP$.bind((SubLObject)clausifier.NIL, thread);
            czer_vars.$within_negationP$.bind((SubLObject)SubLObjectFactory.makeBoolean(clausifier.NIL == czer_vars.$within_negationP$.getDynamicValue(thread)), thread);
            sub_sentence = do_negations_destructive(cycl_utilities.sentence_arg1(sentence, (SubLObject)clausifier.UNPROVIDED));
        }
        finally {
            czer_vars.$within_negationP$.rebind(_prev_bind_2, thread);
            czer_vars.$encapsulate_intensional_formulaP$.rebind(_prev_bind_0, thread);
        }
        return negate_atomic(el_utilities.make_unary_formula(cycl_utilities.sentence_arg0(sentence), sub_sentence));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 17507L)
    public static SubLObject negate_encapsulate_sentence(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (clausifier.NIL != control_vars.$within_ask$.getDynamicValue(thread) && clausifier.NIL != el_utilities.possibly_el_quantified_sentence_p(sentence)) {
            return czer_utilities.make_intensional_lit(negate_quantified_sentence(sentence));
        }
        return negate_atomic(czer_utilities.encapsulate_formula(sentence, (SubLObject)clausifier.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 17833L)
    public static SubLObject lift_negation(final SubLObject sentence) {
        if (clausifier.NIL == el_utilities.el_unary_formula_p(sentence)) {
            return sentence;
        }
        final SubLObject operator = cycl_utilities.sentence_arg0(sentence);
        final SubLObject sub_sentence = cycl_utilities.sentence_arg1(sentence, (SubLObject)clausifier.UNPROVIDED);
        if (clausifier.NIL != czer_utilities.true_negated_varP(sentence, (SubLObject)clausifier.UNPROVIDED)) {
            final SubLObject unnegated_arg = cycl_utilities.sentence_arg1(sub_sentence, (SubLObject)clausifier.UNPROVIDED);
            return negate_atomic(el_utilities.make_unary_formula(operator, unnegated_arg));
        }
        if (clausifier.NIL != el_utilities.el_negation_p(sub_sentence)) {
            final SubLObject unnegated_arg = do_negations_destructive(cycl_utilities.sentence_arg1(sub_sentence, (SubLObject)clausifier.UNPROVIDED));
            return negate_atomic(el_utilities.make_unary_formula(operator, unnegated_arg));
        }
        if (clausifier.NIL != el_utilities.el_quantified_negation_p(sub_sentence)) {
            final SubLObject unnegated_arg = negate_quantified_sentence(sub_sentence);
            return negate_atomic(el_utilities.make_unary_formula(operator, unnegated_arg));
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 18691L)
    public static SubLObject czer_explicitify_implicit_quantifiers(final SubLObject sentence) {
        if (clausifier.NIL != assume_free_vars_are_existentially_boundP()) {
            return czer_explicitify_implicit_existential_quantifiers(sentence);
        }
        return czer_explicitify_implicit_universal_quantifiers(sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 19095L)
    public static SubLObject czer_explicitify_implicit_universal_quantifiers(SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var;
        final SubLObject free_vars = cdolist_list_var = el_utilities.sentence_free_variables(sentence, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED);
        SubLObject var = (SubLObject)clausifier.NIL;
        var = cdolist_list_var.first();
        while (clausifier.NIL != cdolist_list_var) {
            sentence = el_utilities.make_universal(var, sentence);
            if (clausifier.$newly_introduced_universals$.getDynamicValue(thread).isList()) {
                clausifier.$newly_introduced_universals$.setDynamicValue((SubLObject)ConsesLow.cons(var, clausifier.$newly_introduced_universals$.getDynamicValue(thread)), thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 19649L)
    public static SubLObject czer_explicitify_implicit_existential_quantifiers(final SubLObject sentence) {
        return el_utilities.explicitify_implicit_existential_quantifiers(sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 19903L)
    public static SubLObject assume_free_vars_are_existentially_boundP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return czer_vars.$assume_free_vars_are_existentially_boundP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 20087L)
    public static SubLObject standardize_sentence_variables(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert clausifier.NIL != el_utilities.el_formula_p(sentence) : sentence;
        SubLObject v_return = (SubLObject)clausifier.NIL;
        final SubLObject _prev_bind_0 = czer_vars.$canonicalize_variablesP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
        final SubLObject _prev_bind_3 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
        try {
            czer_vars.$canonicalize_variablesP$.bind((SubLObject)clausifier.NIL, thread);
            czer_vars.$el_symbol_suffix_table$.bind((clausifier.NIL != czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread)) ? czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread) : Hashtables.make_hash_table((SubLObject)clausifier.$int16$32, Symbols.symbol_function((SubLObject)clausifier.EQL), (SubLObject)clausifier.UNPROVIDED), thread);
            czer_vars.$standardize_variables_memory$.bind((SubLObject)((clausifier.NIL != czer_vars.$standardize_variables_memory$.getDynamicValue(thread)) ? czer_vars.$standardize_variables_memory$.getDynamicValue(thread) : clausifier.NIL), thread);
            v_return = standardize_variables(conses_high.copy_tree(sentence));
        }
        finally {
            czer_vars.$standardize_variables_memory$.rebind(_prev_bind_3, thread);
            czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_2, thread);
            czer_vars.$canonicalize_variablesP$.rebind(_prev_bind_0, thread);
        }
        return v_return;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 20789L)
    public static SubLObject standardize_variables(final SubLObject sentence) {
        if (clausifier.NIL != el_utilities.groundP(sentence, (SubLObject)clausifier.UNPROVIDED)) {
            return sentence;
        }
        final SubLObject seqvar = el_utilities.sequence_var(sentence, (SubLObject)clausifier.UNPROVIDED);
        final SubLObject sentence_$5 = (clausifier.NIL != seqvar) ? el_utilities.strip_sequence_var(sentence) : sentence;
        SubLObject result = (SubLObject)clausifier.NIL;
        czer_main.initialize_symbol_suffix_table(sentence_$5);
        result = recursively_standardize_variables(sentence_$5);
        result = czer_main.el_nununiquify_vars_int(result, (SubLObject)clausifier.T, (SubLObject)clausifier.UNPROVIDED);
        if (clausifier.NIL != seqvar) {
            return el_utilities.nadd_sequence_var_to_end(seqvar, result);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 21455L)
    public static SubLObject recursively_standardize_variables(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (clausifier.NIL == el_utilities.el_formula_p(sentence)) {
            return sentence;
        }
        if (clausifier.NIL != cycl_grammar.fast_escape_quote_term_p(sentence) || clausifier.NIL != cycl_grammar.fast_quasi_quote_term_p(sentence)) {
            SubLObject standardized = (SubLObject)clausifier.NIL;
            final SubLObject _prev_bind_0 = czer_vars.$inside_quote$.currentBinding(thread);
            try {
                czer_vars.$inside_quote$.bind((SubLObject)clausifier.NIL, thread);
                standardized = el_utilities.make_unary_formula(cycl_utilities.formula_arg0(sentence), recursively_standardize_variables(cycl_utilities.formula_arg1(sentence, (SubLObject)clausifier.UNPROVIDED)));
            }
            finally {
                czer_vars.$inside_quote$.rebind(_prev_bind_0, thread);
            }
            return standardized;
        }
        if (clausifier.NIL != cycl_grammar.fast_quote_term_p(sentence)) {
            if (clausifier.NIL == list_utilities.tree_find_if((SubLObject)clausifier.$sym17$CYC_VAR_, sentence, (SubLObject)clausifier.UNPROVIDED)) {
                return sentence;
            }
            SubLObject standardized = (SubLObject)clausifier.NIL;
            final SubLObject _prev_bind_0 = czer_vars.$inside_quote$.currentBinding(thread);
            try {
                czer_vars.$inside_quote$.bind((SubLObject)clausifier.T, thread);
                standardized = el_utilities.make_unary_formula(clausifier.$const18$Quote, recursively_standardize_variables(cycl_utilities.formula_arg1(sentence, (SubLObject)clausifier.UNPROVIDED)));
            }
            finally {
                czer_vars.$inside_quote$.rebind(_prev_bind_0, thread);
            }
            return standardized;
        }
        else {
            if (clausifier.NIL != el_utilities.possibly_el_regularly_quantified_sentence_p(sentence)) {
                thread.resetMultipleValues();
                final SubLObject quantifier = el_utilities.unmake_binary_formula(sentence);
                final SubLObject old_var = thread.secondMultipleValue();
                final SubLObject subform = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                final SubLObject standardized_subform = el_utilities.funcall_formula_arg((SubLObject)clausifier.$sym19$RECURSIVELY_STANDARDIZE_VARIABLES, sentence, (SubLObject)clausifier.TWO_INTEGER);
                final SubLObject new_var = el_uniquify_standardize(old_var);
                final SubLObject replace_old_var = el_var_without_quote(old_var);
                final SubLObject replace_new_var = el_var_without_quote(new_var);
                SubLObject standardized2 = (SubLObject)clausifier.NIL;
                remember_variable_rename(replace_old_var, replace_new_var);
                final SubLObject _prev_bind_2 = czer_vars.$canonicalize_variablesP$.currentBinding(thread);
                try {
                    czer_vars.$canonicalize_variablesP$.bind((SubLObject)clausifier.NIL, thread);
                    standardized2 = el_utilities.make_binary_formula(quantifier, new_var, cycl_utilities.expression_nsubst_free_vars(replace_new_var, replace_old_var, standardized_subform, (SubLObject)clausifier.UNPROVIDED));
                }
                finally {
                    czer_vars.$canonicalize_variablesP$.rebind(_prev_bind_2, thread);
                }
                return standardized2;
            }
            if (clausifier.NIL != el_utilities.el_bounded_existential_p(sentence)) {
                thread.resetMultipleValues();
                final SubLObject quantifier = el_utilities.unmake_ternary_formula(sentence);
                final SubLObject bound = thread.secondMultipleValue();
                final SubLObject old_var2 = thread.thirdMultipleValue();
                final SubLObject subform2 = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                final SubLObject standardized_subform2 = el_utilities.funcall_formula_arg((SubLObject)clausifier.$sym19$RECURSIVELY_STANDARDIZE_VARIABLES, sentence, (SubLObject)clausifier.THREE_INTEGER);
                final SubLObject new_var2 = el_uniquify_standardize(old_var2);
                final SubLObject replace_old_var2 = el_var_without_quote(old_var2);
                final SubLObject replace_new_var2 = el_var_without_quote(new_var2);
                SubLObject standardized3 = (SubLObject)clausifier.NIL;
                remember_variable_rename(replace_old_var2, replace_new_var2);
                final SubLObject _prev_bind_3 = czer_vars.$canonicalize_variablesP$.currentBinding(thread);
                try {
                    czer_vars.$canonicalize_variablesP$.bind((SubLObject)clausifier.NIL, thread);
                    standardized3 = el_utilities.make_ternary_formula(quantifier, bound, new_var2, cycl_utilities.expression_nsubst_free_vars(replace_new_var2, replace_old_var2, standardized_subform2, (SubLObject)clausifier.UNPROVIDED));
                }
                finally {
                    czer_vars.$canonicalize_variablesP$.rebind(_prev_bind_3, thread);
                }
                return standardized3;
            }
            if (clausifier.NIL != czer_trampolines.czer_scoping_formulaP(sentence)) {
                final SubLObject scoped_vars = czer_trampolines.czer_scoped_vars(sentence);
                final SubLObject unique_vars = Mapping.mapcar((SubLObject)clausifier.$sym20$EL_UNIQUIFY_STANDARDIZE, scoped_vars);
                final SubLObject scoping_args = czer_trampolines.czer_scoping_args(cycl_utilities.formula_operator(sentence));
                final SubLObject replace_scoped_vars = Mapping.mapcar((SubLObject)clausifier.$sym21$EL_VAR_WITHOUT_QUOTE, scoped_vars);
                final SubLObject replace_unique_vars = Mapping.mapcar((SubLObject)clausifier.$sym21$EL_VAR_WITHOUT_QUOTE, unique_vars);
                SubLObject new_sentence = (SubLObject)clausifier.NIL;
                final SubLObject terms = cycl_utilities.formula_terms(sentence, (SubLObject)clausifier.$kw22$IGNORE);
                SubLObject list_var = (SubLObject)clausifier.NIL;
                SubLObject arg = (SubLObject)clausifier.NIL;
                SubLObject argnum = (SubLObject)clausifier.NIL;
                list_var = terms;
                arg = list_var.first();
                for (argnum = (SubLObject)clausifier.ZERO_INTEGER; clausifier.NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), argnum = number_utilities.f_1X(argnum)) {
                    if (clausifier.NIL != subl_promotions.memberP(argnum, scoping_args, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED)) {
                        new_sentence = (SubLObject)ConsesLow.cons(arg, new_sentence);
                    }
                    else {
                        new_sentence = (SubLObject)ConsesLow.cons(el_utilities.funcall_formula_arg((SubLObject)clausifier.$sym19$RECURSIVELY_STANDARDIZE_VARIABLES, sentence, argnum), new_sentence);
                    }
                }
                remember_variables_rename(replace_scoped_vars, replace_unique_vars);
                return Sequences.nreverse(cycl_utilities.expression_sublis(conses_high.pairlis(replace_scoped_vars, replace_unique_vars, (SubLObject)clausifier.UNPROVIDED), new_sentence, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED));
            }
            return el_utilities.pass_through_if_relation_syntax((SubLObject)clausifier.$sym19$RECURSIVELY_STANDARDIZE_VARIABLES, sentence);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 25728L)
    public static SubLObject el_uniquify_standardize(final SubLObject var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (clausifier.NIL == czer_vars.$inside_quote$.getDynamicValue(thread)) {
            return el_uniquify(var);
        }
        if (clausifier.NIL != cycl_grammar.fast_escape_quote_term_p(var) || clausifier.NIL != cycl_grammar.fast_quasi_quote_term_p(var)) {
            return el_utilities.make_unary_formula(cycl_utilities.formula_arg0(var), el_uniquify(cycl_utilities.formula_arg1(var, (SubLObject)clausifier.UNPROVIDED)));
        }
        return var;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 26017L)
    public static SubLObject el_var_without_quote(final SubLObject var) {
        if (clausifier.NIL != cycl_grammar.fast_escape_quote_term_p(var) || clausifier.NIL != cycl_grammar.fast_quasi_quote_term_p(var)) {
            return cycl_utilities.formula_arg1(var, (SubLObject)clausifier.UNPROVIDED);
        }
        return var;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 26191L)
    public static SubLObject remember_variable_rename(final SubLObject old_var, final SubLObject new_var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        czer_vars.$standardize_variables_memory$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(old_var, new_var), czer_vars.$standardize_variables_memory$.getDynamicValue(thread)), thread);
        return (SubLObject)clausifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 26995L)
    public static SubLObject remember_variables_rename(final SubLObject old_vars, final SubLObject new_vars) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        czer_vars.$standardize_variables_memory$.setDynamicValue(ConsesLow.append(conses_high.pairlis(old_vars, new_vars, (SubLObject)clausifier.UNPROVIDED), czer_vars.$standardize_variables_memory$.getDynamicValue(thread)), thread);
        return (SubLObject)clausifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 27316L)
    public static SubLObject el_uniquify(final SubLObject var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject integer = czer_main.extract_name_uniquifying_post_hyphen_integer(var);
        SubLObject symbol = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (clausifier.NIL == symbol) {
            symbol = var;
        }
        if (clausifier.NIL == integer) {
            integer = (SubLObject)clausifier.ZERO_INTEGER;
        }
        SubLObject n = Hashtables.gethash(symbol, czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread), (SubLObject)clausifier.UNPROVIDED);
        if (clausifier.NIL == n) {
            n = (SubLObject)clausifier.MINUS_ONE_INTEGER;
        }
        n = Numbers.max(n, integer);
        n = Numbers.add(n, (SubLObject)clausifier.ONE_INTEGER);
        Hashtables.sethash(symbol, czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread), n);
        final SubLObject unique_string = n.isZero() ? format_nil.format_nil_a(cycl_variables.variable_name(symbol)) : Sequences.cconcatenate(format_nil.format_nil_a_no_copy(cycl_variables.variable_name(symbol)), new SubLObject[] { clausifier.$str23$_, format_nil.format_nil_a_no_copy(string_utilities.object_to_string(n)) });
        if (clausifier.NIL != cycl_variables.keyword_varP(symbol)) {
            return cycl_variables.make_keyword_var(unique_string);
        }
        return cycl_variables.make_el_var(unique_string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 28286L)
    public static SubLObject existentials_out(SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (clausifier.NIL != czer_vars.$turn_existentials_into_skolemsP$.getDynamicValue(thread)) {
            if (clausifier.NIL == list_utilities.tree_find_if((SubLObject)clausifier.$sym24$CYC_CONST_GENERAL_EXISTENTIAL_OPERATOR_P, sentence, (SubLObject)clausifier.UNPROVIDED)) {
                return sentence;
            }
            SubLObject error = (SubLObject)clausifier.NIL;
            try {
                thread.throwStack.push(clausifier.$kw25$TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE);
                try {
                    thread.throwStack.push(clausifier.$kw26$AMBIGUOUS_VAR_TYPE_IN_SKOLEM_SCOPE);
                    try {
                        thread.throwStack.push(clausifier.$kw27$QUANTIFIED_SEQUENCE_VARIABLE);
                        final SubLObject _prev_bind_0 = clausifier.$quantifier_info_list$.currentBinding(thread);
                        try {
                            clausifier.$quantifier_info_list$.bind((SubLObject)clausifier.NIL, thread);
                            sentence = existentials_out_int(sentence);
                        }
                        finally {
                            clausifier.$quantifier_info_list$.rebind(_prev_bind_0, thread);
                        }
                    }
                    catch (Throwable ccatch_env_var) {
                        error = Errors.handleThrowable(ccatch_env_var, (SubLObject)clausifier.$kw27$QUANTIFIED_SEQUENCE_VARIABLE);
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                }
                catch (Throwable ccatch_env_var) {
                    error = Errors.handleThrowable(ccatch_env_var, (SubLObject)clausifier.$kw26$AMBIGUOUS_VAR_TYPE_IN_SKOLEM_SCOPE);
                }
                finally {
                    thread.throwStack.pop();
                }
            }
            catch (Throwable ccatch_env_var) {
                error = Errors.handleThrowable(ccatch_env_var, (SubLObject)clausifier.$kw25$TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE);
            }
            finally {
                thread.throwStack.pop();
            }
            if (clausifier.NIL != error) {
                if (clausifier.NIL != wff_vars.$accumulating_wff_violationsP$.getDynamicValue(thread)) {
                    wff.note_wff_violation(error);
                }
                return (SubLObject)clausifier.NIL;
            }
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 28987L)
    public static SubLObject existentials_out_int(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = sentence;
        final SubLObject _prev_bind_0 = clausifier.$quantifier_info_list$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        try {
            clausifier.$quantifier_info_list$.bind(clausifier.$quantifier_info_list$.getDynamicValue(thread), thread);
            at_vars.$noting_at_violationsP$.bind((SubLObject)clausifier.NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind((SubLObject)clausifier.NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind((SubLObject)clausifier.NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind((SubLObject)clausifier.NIL, thread);
            if (clausifier.NIL != el_utilities.cycl_universal_p(sentence)) {
                thread.resetMultipleValues();
                final SubLObject quantifier = el_utilities.unmake_binary_formula(sentence);
                final SubLObject var = thread.secondMultipleValue();
                final SubLObject subform = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                clausifier.$quantifier_info_list$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(quantifier, (SubLObject)clausifier.NIL, var, el_utilities.sentence_free_term_variables(subform, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED), el_utilities.sentence_free_sequence_variables(subform, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED)), clausifier.$quantifier_info_list$.getDynamicValue(thread)), thread);
                result = el_utilities.make_universal(var, el_utilities.funcall_formula_arg(Symbols.symbol_function((SubLObject)clausifier.$sym28$EXISTENTIALS_OUT_INT), sentence, (SubLObject)clausifier.TWO_INTEGER));
            }
            else if (clausifier.NIL != el_utilities.el_existential_p(sentence)) {
                thread.resetMultipleValues();
                final SubLObject quantifier = el_utilities.unmake_binary_formula(sentence);
                final SubLObject var = thread.secondMultipleValue();
                final SubLObject subform = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                clausifier.$quantifier_info_list$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(quantifier, (SubLObject)clausifier.NIL, var, el_utilities.sentence_free_term_variables(subform, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED), el_utilities.sentence_free_sequence_variables(subform, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED)), clausifier.$quantifier_info_list$.getDynamicValue(thread)), thread);
                result = el_utilities.funcall_formula_arg(Symbols.symbol_function((SubLObject)clausifier.$sym28$EXISTENTIALS_OUT_INT), sentence, (SubLObject)clausifier.TWO_INTEGER);
            }
            else if (clausifier.NIL != el_utilities.el_bounded_existential_p(sentence)) {
                thread.resetMultipleValues();
                final SubLObject quantifier = el_utilities.unmake_ternary_formula(sentence);
                final SubLObject num = thread.secondMultipleValue();
                final SubLObject var2 = thread.thirdMultipleValue();
                final SubLObject subform2 = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                clausifier.$quantifier_info_list$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(quantifier, num, var2, el_utilities.sentence_free_term_variables(subform2, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED), el_utilities.sentence_free_sequence_variables(subform2, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED)), clausifier.$quantifier_info_list$.getDynamicValue(thread)), thread);
                result = el_utilities.funcall_formula_arg(Symbols.symbol_function((SubLObject)clausifier.$sym28$EXISTENTIALS_OUT_INT), sentence, (SubLObject)clausifier.THREE_INTEGER);
            }
            else if (clausifier.NIL != el_utilities.el_logical_operator_formula_p(sentence)) {
                result = el_utilities.pass_through_if_logical_op(Symbols.symbol_function((SubLObject)clausifier.$sym28$EXISTENTIALS_OUT_INT), sentence);
            }
            else if (clausifier.NIL != control_vars.within_askP() && clausifier.NIL != el_utilities.ist_sentence_p(sentence, (SubLObject)clausifier.UNPROVIDED)) {
                thread.resetMultipleValues();
                final SubLObject ist = el_utilities.unmake_binary_formula(sentence);
                final SubLObject mt = thread.secondMultipleValue();
                final SubLObject subsentence = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                final SubLObject canonical_subsentence = existentials_out_int(subsentence);
                result = skolemize_atomic_sentence(el_utilities.make_ist_sentence(mt, canonical_subsentence), clausifier.$quantifier_info_list$.getDynamicValue(thread));
            }
            else if (clausifier.NIL != cycl_grammar.cycl_atomic_sentence_p(sentence)) {
                result = skolemize_atomic_sentence(sentence, clausifier.$quantifier_info_list$.getDynamicValue(thread));
            }
            else if (clausifier.NIL != el_grammar.el_non_formula_sentence_p(sentence)) {
                result = skolemize_atomic_sentence(sentence, clausifier.$quantifier_info_list$.getDynamicValue(thread));
            }
            else {
                el_utilities.el_error((SubLObject)clausifier.FOUR_INTEGER, (SubLObject)clausifier.$str29$Unexpected_sentence_type_in_exist, sentence, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED);
            }
        }
        finally {
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_5, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_4, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_2, thread);
            clausifier.$quantifier_info_list$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 32025L)
    public static SubLObject skolemize_atomic_sentence(final SubLObject sentence, final SubLObject quantifier_info_list) {
        SubLObject result = sentence;
        SubLObject quantifier_info_list_in_scope = (SubLObject)clausifier.NIL;
        SubLObject curr_quant_info = (SubLObject)clausifier.NIL;
        SubLObject curr_quant = (SubLObject)clausifier.NIL;
        SubLObject curr_num = (SubLObject)clausifier.NIL;
        SubLObject curr_var = (SubLObject)clausifier.NIL;
        SubLObject curr_free_term_vars = (SubLObject)clausifier.NIL;
        SubLObject curr_free_sequence_vars = (SubLObject)clausifier.NIL;
        quantifier_info_list_in_scope = quantifier_info_list;
        curr_quant_info = quantifier_info_list_in_scope.first();
        curr_quant = curr_quant_info.first();
        curr_num = conses_high.second(curr_quant_info);
        curr_var = conses_high.third(curr_quant_info);
        curr_free_term_vars = conses_high.fourth(curr_quant_info);
        curr_free_sequence_vars = conses_high.fifth(curr_quant_info);
        while (clausifier.NIL != quantifier_info_list_in_scope) {
            if (clausifier.NIL != el_utilities.cyc_const_general_existential_operator_p(curr_quant)) {
                result = skolemize_variable(result, curr_quant, curr_num, curr_var, curr_free_term_vars, curr_free_sequence_vars, quantifier_info_list_in_scope);
            }
            quantifier_info_list_in_scope = quantifier_info_list_in_scope.rest();
            curr_quant_info = quantifier_info_list_in_scope.first();
            curr_quant = curr_quant_info.first();
            curr_num = conses_high.second(curr_quant_info);
            curr_var = conses_high.third(curr_quant_info);
            curr_free_term_vars = conses_high.fourth(curr_quant_info);
            curr_free_sequence_vars = conses_high.fifth(curr_quant_info);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 34096L)
    public static SubLObject skolemize_variable(final SubLObject sentence, final SubLObject curr_quant, final SubLObject curr_num, final SubLObject curr_var, final SubLObject curr_free_term_vars, final SubLObject curr_free_sequence_vars, final SubLObject quantifier_info_list_in_scope) {
        if (clausifier.NIL != drop_all_existentialsP()) {
            return sentence;
        }
        if (clausifier.NIL != el_utilities.occurs_as_sequence_variableP(curr_var, sentence) && clausifier.NIL != forbid_quantified_sequence_variablesP()) {
            Dynamic.sublisp_throw((SubLObject)clausifier.$kw27$QUANTIFIED_SEQUENCE_VARIABLE, (SubLObject)ConsesLow.list((SubLObject)clausifier.$kw27$QUANTIFIED_SEQUENCE_VARIABLE, curr_var, sentence));
        }
        else {
            SubLObject curr_dependent_term_vars = (SubLObject)clausifier.NIL;
            SubLObject curr_dependent_sequence_vars = (SubLObject)clausifier.NIL;
            SubLObject cdolist_list_var = quantifier_info_list_in_scope;
            SubLObject quant_info = (SubLObject)clausifier.NIL;
            quant_info = cdolist_list_var.first();
            while (clausifier.NIL != cdolist_list_var) {
                final SubLObject quant = quant_info.first();
                final SubLObject var = conses_high.third(quant_info);
                final SubLObject free_term_vars = conses_high.fourth(quant_info);
                final SubLObject free_sequence_vars = conses_high.fifth(quant_info);
                if (clausifier.$const30$forAll.eql(quant)) {
                    final SubLObject pcase_var;
                    final SubLObject var_status = pcase_var = determine_skolem_var_status(var, curr_free_term_vars, free_term_vars, curr_free_sequence_vars, free_sequence_vars);
                    if (!pcase_var.eql((SubLObject)clausifier.$kw31$NEITHER)) {
                        if (pcase_var.eql((SubLObject)clausifier.$kw32$TERM)) {
                            curr_dependent_term_vars = (SubLObject)ConsesLow.cons(var, curr_dependent_term_vars);
                        }
                        else if (pcase_var.eql((SubLObject)clausifier.$kw33$SEQ)) {
                            curr_dependent_sequence_vars = (SubLObject)ConsesLow.cons(var, curr_dependent_sequence_vars);
                        }
                        else if (pcase_var.eql((SubLObject)clausifier.$kw34$BOTH)) {
                            Dynamic.sublisp_throw((SubLObject)clausifier.$kw26$AMBIGUOUS_VAR_TYPE_IN_SKOLEM_SCOPE, (SubLObject)ConsesLow.list((SubLObject)clausifier.$kw26$AMBIGUOUS_VAR_TYPE_IN_SKOLEM_SCOPE, var, curr_var, sentence));
                        }
                        else if (pcase_var.eql((SubLObject)clausifier.$kw35$UNDETERMINED)) {
                            el_utilities.el_error((SubLObject)clausifier.ONE_INTEGER, (SubLObject)clausifier.$str36$Skolemizer_failed_to_classify_var, var, sentence, (SubLObject)clausifier.UNPROVIDED);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                quant_info = cdolist_list_var.first();
            }
            if (Sequences.length(curr_dependent_sequence_vars).numG((SubLObject)clausifier.ONE_INTEGER)) {
                Dynamic.sublisp_throw((SubLObject)clausifier.$kw25$TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE, (SubLObject)ConsesLow.list((SubLObject)clausifier.$kw25$TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE, curr_var, curr_dependent_sequence_vars));
            }
            else {
                if (clausifier.NIL != leave_skolem_constants_aloneP() && clausifier.NIL == curr_dependent_term_vars && clausifier.NIL == curr_dependent_sequence_vars) {
                    return sentence;
                }
                return cycl_utilities.expression_nsubst_free_vars(make_skolem_fn_fn(curr_var, curr_dependent_term_vars, curr_quant, curr_num, curr_dependent_sequence_vars.first()), curr_var, el_utilities.copy_expression(sentence), Symbols.symbol_function((SubLObject)clausifier.EQUAL));
            }
        }
        return (SubLObject)clausifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 37494L)
    public static SubLObject determine_skolem_var_status(final SubLObject var, final SubLObject subsent_free_term_vars, final SubLObject free_term_vars_in_scope, final SubLObject subsent_free_seqvars, final SubLObject free_seqvars_in_scope) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject var_status = (SubLObject)clausifier.$kw35$UNDETERMINED;
        if (clausifier.NIL != conses_high.member(var, subsent_free_term_vars, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED)) {
            if (clausifier.NIL != subl_promotions.memberP(var, subsent_free_seqvars, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED) || clausifier.NIL != conses_high.member(var, free_seqvars_in_scope, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED)) {
                var_status = (SubLObject)clausifier.$kw34$BOTH;
            }
            else {
                var_status = (SubLObject)clausifier.$kw32$TERM;
            }
        }
        else if (clausifier.NIL != conses_high.member(var, subsent_free_seqvars, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED)) {
            if (clausifier.NIL != subl_promotions.memberP(var, free_term_vars_in_scope, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED)) {
                var_status = (SubLObject)clausifier.$kw34$BOTH;
            }
            else {
                var_status = (SubLObject)clausifier.$kw33$SEQ;
            }
        }
        else if (clausifier.NIL != czer_vars.$minimal_skolem_arityP$.getDynamicValue(thread)) {
            var_status = (SubLObject)clausifier.$kw31$NEITHER;
        }
        else if (clausifier.NIL != conses_high.member(var, free_term_vars_in_scope, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED)) {
            if (clausifier.NIL != subl_promotions.memberP(var, free_seqvars_in_scope, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED)) {
                var_status = (SubLObject)clausifier.$kw34$BOTH;
            }
            else {
                var_status = (SubLObject)clausifier.$kw32$TERM;
            }
        }
        else if (clausifier.NIL != conses_high.member(var, free_seqvars_in_scope, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED)) {
            var_status = (SubLObject)clausifier.$kw33$SEQ;
        }
        else {
            var_status = (SubLObject)clausifier.$kw31$NEITHER;
        }
        return var_status;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 38979L)
    public static SubLObject make_skolem_fn_fn(final SubLObject var, final SubLObject dependent_term_vars, final SubLObject quant, final SubLObject num, final SubLObject dependent_sequence_var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (clausifier.NIL == dependent_term_vars && clausifier.NIL == dependent_sequence_var && clausifier.NIL != czer_vars.$use_skolem_constantsP$.getDynamicValue(thread)) {
            Errors.warn((SubLObject)clausifier.$str37$skolem_constants_not_yet_supporte);
            return (SubLObject)clausifier.NIL;
        }
        SubLObject result = (SubLObject)clausifier.NIL;
        if (clausifier.$const38$thereExists.eql(quant)) {
            result = el_utilities.make_ternary_formula(clausifier.$const39$SkolemFunctionFn, dependent_term_vars, var, dependent_sequence_var);
        }
        else {
            if (clausifier.NIL == kb_control_vars.quant_kb_loaded_p() || clausifier.NIL == el_utilities.cyc_const_bounded_existential_operator_p(quant)) {
                el_utilities.el_error((SubLObject)clausifier.FOUR_INTEGER, (SubLObject)clausifier.$str41$make_skolem_fn_fn_doesn_t_know_ho, quant, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED);
                return (SubLObject)clausifier.NIL;
            }
            result = el_utilities.make_quaternary_formula(clausifier.$const40$SkolemFuncNFn, dependent_term_vars, var, dependent_sequence_var, el_math_utilities.quantified_interval(quant, num));
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 40274L)
    public static SubLObject drop_all_existentialsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean((clausifier.NIL != control_vars.$within_ask$.getDynamicValue(thread) && clausifier.NIL == czer_vars.$skolemize_during_asksP$.getDynamicValue(thread)) || clausifier.NIL != czer_vars.$drop_all_existentialsP$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 41173L)
    public static SubLObject leave_skolem_constants_aloneP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(clausifier.NIL != drop_all_existentialsP() || clausifier.NIL != czer_vars.$leave_skolem_constants_aloneP$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 41300L)
    public static SubLObject forbid_quantified_sequence_variablesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (clausifier.T == czer_vars.$forbid_quantified_sequence_variablesP$.getDynamicValue(thread)) {
            return (SubLObject)clausifier.T;
        }
        if (clausifier.NIL == czer_vars.$forbid_quantified_sequence_variablesP$.getDynamicValue(thread)) {
            return (SubLObject)clausifier.NIL;
        }
        if (clausifier.$kw42$ASSERT_ONLY == czer_vars.$forbid_quantified_sequence_variablesP$.getDynamicValue(thread)) {
            return control_vars.within_assertP();
        }
        return Errors.error((SubLObject)clausifier.$str43$Unexpected_value_for__forbid_quan, czer_vars.$forbid_quantified_sequence_variablesP$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 41713L)
    public static SubLObject universals_out(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (clausifier.NIL != el_utilities.cycl_universal_p(sentence)) {
            final SubLObject result = el_utilities.funcall_formula_arg((SubLObject)clausifier.$sym44$UNIVERSALS_OUT, sentence, el_utilities.quantified_sub_sentence_argnum(sentence));
            if (clausifier.NIL != czer_vars.$implicitify_universalsP$.getDynamicValue(thread)) {
                return result;
            }
            if (!clausifier.$newly_introduced_universals$.getDynamicValue(thread).isList()) {
                return result;
            }
            if (clausifier.NIL != conses_high.member(el_utilities.quantified_var(sentence), clausifier.$newly_introduced_universals$.getDynamicValue(thread), (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED)) {
                return result;
            }
            return el_utilities.make_universal(el_utilities.quantified_var(sentence), result);
        }
        else {
            if (clausifier.NIL != el_utilities.el_conjunction_p(sentence) || clausifier.NIL != el_utilities.el_disjunction_p(sentence)) {
                return el_utilities.pass_through_if_junction((SubLObject)clausifier.$sym44$UNIVERSALS_OUT, sentence);
            }
            if (clausifier.NIL != el_utilities.possibly_el_quantified_sentence_p(sentence) || clausifier.NIL != el_utilities.el_logical_operator_formula_p(sentence)) {
                return sentence;
            }
            if (clausifier.NIL != cycl_grammar.cycl_literal_p(sentence)) {
                return sentence;
            }
            if (clausifier.NIL != el_grammar.el_non_formula_sentence_p(sentence)) {
                return sentence;
            }
            el_utilities.el_error((SubLObject)clausifier.FOUR_INTEGER, (SubLObject)clausifier.$str45$Got_the_unexpected_sentence__S_in, sentence, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED);
            return sentence;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 43139L)
    public static SubLObject disjunctions_in(final SubLObject sentence) {
        if (clausifier.NIL != bad_exponential_disjunctionP(sentence)) {
            return handle_bad_exponential_disjunction(sentence);
        }
        return disjunctions_in_int(sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 43414L)
    public static SubLObject disjunctions_in_int(SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)clausifier.NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind((SubLObject)clausifier.NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind((SubLObject)clausifier.NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind((SubLObject)clausifier.NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind((SubLObject)clausifier.NIL, thread);
            if (clausifier.NIL != el_utilities.el_conjunction_p(sentence)) {
                result = el_utilities.nmap_formula_args((SubLObject)clausifier.$sym46$DISJUNCTIONS_IN, sentence, (SubLObject)clausifier.UNPROVIDED);
            }
            else if (clausifier.NIL != el_utilities.el_disjunction_p(sentence)) {
                if (clausifier.NIL != cycl_utilities.opaque_argP(sentence, (SubLObject)clausifier.ONE_INTEGER)) {
                    result = sentence;
                }
                else {
                    sentence = el_utilities.nmap_formula_args((SubLObject)clausifier.$sym46$DISJUNCTIONS_IN, sentence, (SubLObject)clausifier.UNPROVIDED);
                    final SubLObject nested_conjunction = first_conjunction(cycl_utilities.formula_args(sentence, (SubLObject)clausifier.UNPROVIDED));
                    if (clausifier.NIL != nested_conjunction) {
                        final SubLObject other_disjuncts = Sequences.delete(nested_conjunction, cycl_utilities.formula_args(sentence, (SubLObject)clausifier.UNPROVIDED), (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED);
                        if (clausifier.NIL != other_disjuncts) {
                            SubLObject new_conjuncts = (SubLObject)clausifier.NIL;
                            SubLObject cdolist_list_var;
                            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(nested_conjunction, (SubLObject)clausifier.$kw22$IGNORE);
                            SubLObject conjunct = (SubLObject)clausifier.NIL;
                            conjunct = cdolist_list_var.first();
                            while (clausifier.NIL != cdolist_list_var) {
                                final SubLObject new_disjuncts = (SubLObject)ConsesLow.cons(conjunct, other_disjuncts);
                                new_conjuncts = (SubLObject)ConsesLow.cons(simplifier.disjoin(new_disjuncts, (SubLObject)clausifier.UNPROVIDED), new_conjuncts);
                                cdolist_list_var = cdolist_list_var.rest();
                                conjunct = cdolist_list_var.first();
                            }
                            result = simplifier.nconjoin(list_utilities.nmapcar((SubLObject)clausifier.$sym46$DISJUNCTIONS_IN, new_conjuncts), (SubLObject)clausifier.UNPROVIDED);
                        }
                        else {
                            result = nested_conjunction;
                        }
                    }
                    else {
                        result = sentence;
                    }
                }
            }
            else if (clausifier.NIL != el_utilities.possibly_el_quantified_sentence_p(sentence) || clausifier.NIL != el_utilities.el_logical_operator_formula_p(sentence)) {
                result = sentence;
            }
            else if (clausifier.NIL != el_grammar.el_literal_p(sentence)) {
                result = sentence;
            }
            else if (clausifier.NIL != el_grammar.el_non_formula_sentence_p(sentence)) {
                result = sentence;
            }
            else {
                el_utilities.el_error((SubLObject)clausifier.FOUR_INTEGER, (SubLObject)clausifier.$str47$Got_the_unexpected_sentence__S_in, sentence, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED);
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
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 45766L)
    public static SubLObject first_conjunction(final SubLObject sentences) {
        return Sequences.find_if(Symbols.symbol_function((SubLObject)clausifier.$sym48$EL_CONJUNCTION_P), sentences, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 45920L)
    public static SubLObject bad_exponential_disjunctionP(final SubLObject sentence) {
        if (clausifier.NIL != el_utilities.el_disjunction_p(sentence)) {
            return bad_exponential_sentenceP(sentence, (SubLObject)clausifier.$sym48$EL_CONJUNCTION_P);
        }
        return (SubLObject)clausifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 46205L)
    public static SubLObject handle_bad_exponential_disjunction(final SubLObject sentence) {
        return Dynamic.sublisp_throw((SubLObject)clausifier.$kw49$BAD_EXPONENTIAL_DISJUNCTION, sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 46542L)
    public static SubLObject bad_exponential_sentenceP(final SubLObject sentence, final SubLObject arg_test_func) {
        final SubLObject n = Sequences.count_if(arg_test_func, cycl_utilities.formula_args(sentence, (SubLObject)clausifier.UNPROVIDED), (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED);
        if (n.numGE((SubLObject)clausifier.FIVE_INTEGER)) {
            final SubLObject problem_args = list_utilities.remove_if_not(arg_test_func, cycl_utilities.formula_args(sentence, (SubLObject)clausifier.UNPROVIDED), (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED);
            if (clausifier.NIL != problem_args) {
                final SubLObject k = average_arity(problem_args);
                if (k.numG((SubLObject)clausifier.ONE_INTEGER)) {
                    final SubLObject kXn = Numbers.expt(k, n);
                    if (kXn.numG(clausifier.$czer_bad_exponential_threshold$.getGlobalValue())) {
                        return (SubLObject)clausifier.T;
                    }
                }
            }
        }
        return (SubLObject)clausifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 47002L)
    public static SubLObject average_arity(final SubLObject formulas) {
        return number_utilities.average(formulas, (SubLObject)clausifier.$sym51$FORMULA_ARITY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 47087L)
    public static SubLObject force_into_cnf(SubLObject sentence) {
        if (clausifier.NIL == el_utilities.el_conjunction_p(sentence)) {
            sentence = el_utilities.make_conjunction((SubLObject)ConsesLow.list(sentence));
        }
        SubLObject new_args = (SubLObject)clausifier.NIL;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, (SubLObject)clausifier.$kw22$IGNORE);
        SubLObject arg = (SubLObject)clausifier.NIL;
        arg = cdolist_list_var.first();
        while (clausifier.NIL != cdolist_list_var) {
            if (clausifier.NIL != el_utilities.el_disjunction_p(arg)) {
                new_args = (SubLObject)ConsesLow.cons(arg, new_args);
            }
            else {
                new_args = (SubLObject)ConsesLow.cons(el_utilities.make_disjunction((SubLObject)ConsesLow.list(arg)), new_args);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        new_args = Sequences.nreverse(new_args);
        return el_utilities.make_conjunction(new_args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 47807L)
    public static SubLObject cnf_operators_out(SubLObject sentence) {
        if (clausifier.NIL == sentence || sentence.eql(clausifier.$const6$True) || sentence.eql(clausifier.$const7$False)) {
            return sentence;
        }
        if (clausifier.NIL != cycl_variables.el_varP(sentence)) {
            sentence = czer_utilities.encapsulate_formula(sentence, (SubLObject)clausifier.UNPROVIDED);
        }
        sentence = force_into_cnf(sentence);
        if (clausifier.NIL == el_utilities.el_conjunction_p(sentence)) {
            el_utilities.el_error((SubLObject)clausifier.FOUR_INTEGER, (SubLObject)clausifier.$str52$_s_is_not_a_conjunction__so_it_is, sentence, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED);
            return (SubLObject)clausifier.NIL;
        }
        SubLObject clause_list = (SubLObject)clausifier.NIL;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, (SubLObject)clausifier.$kw22$IGNORE);
        SubLObject conjunct = (SubLObject)clausifier.NIL;
        conjunct = cdolist_list_var.first();
        while (clausifier.NIL != cdolist_list_var) {
            if (clausifier.NIL == el_utilities.el_disjunction_p(conjunct)) {
                el_utilities.el_error((SubLObject)clausifier.FOUR_INTEGER, (SubLObject)clausifier.$str53$_s_is_not_a_disjunction__so__S_is, conjunct, sentence, (SubLObject)clausifier.UNPROVIDED);
                return (SubLObject)clausifier.NIL;
            }
            clause_list = (SubLObject)ConsesLow.cons(package_xnf_clause(cycl_utilities.formula_args(conjunct, (SubLObject)clausifier.UNPROVIDED)), clause_list);
            cdolist_list_var = cdolist_list_var.rest();
            conjunct = cdolist_list_var.first();
        }
        return Sequences.nreverse(clause_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 49258L)
    public static SubLObject package_cnf_clause(final SubLObject clause) {
        return package_xnf_clause(clause);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 49607L)
    public static SubLObject npackage_cnf_clause(final SubLObject clause) {
        return npackage_xnf_clause(clause);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 49779L)
    public static SubLObject conjunctions_in(final SubLObject sentence) {
        if (clausifier.NIL != bad_exponential_conjunctionP(sentence)) {
            return handle_bad_exponential_conjunction(sentence);
        }
        return conjunctions_in_int(sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 50118L)
    public static SubLObject conjunctions_in_int(SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)clausifier.NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind((SubLObject)clausifier.NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind((SubLObject)clausifier.NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind((SubLObject)clausifier.NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind((SubLObject)clausifier.NIL, thread);
            if (clausifier.NIL != el_utilities.el_disjunction_p(sentence)) {
                result = el_utilities.nmap_formula_args((SubLObject)clausifier.$sym54$CONJUNCTIONS_IN, sentence, (SubLObject)clausifier.UNPROVIDED);
            }
            else if (clausifier.NIL != el_utilities.el_conjunction_p(sentence)) {
                if (clausifier.NIL != cycl_utilities.opaque_argP(sentence, (SubLObject)clausifier.ONE_INTEGER)) {
                    result = sentence;
                }
                else {
                    sentence = el_utilities.nmap_formula_args((SubLObject)clausifier.$sym54$CONJUNCTIONS_IN, sentence, (SubLObject)clausifier.UNPROVIDED);
                    final SubLObject nested_disjunction = first_disjunction(cycl_utilities.formula_args(sentence, (SubLObject)clausifier.UNPROVIDED));
                    if (clausifier.NIL != nested_disjunction) {
                        final SubLObject other_conjuncts = Sequences.delete(nested_disjunction, cycl_utilities.formula_args(sentence, (SubLObject)clausifier.UNPROVIDED), Symbols.symbol_function((SubLObject)clausifier.EQUAL), (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED);
                        if (clausifier.NIL != other_conjuncts) {
                            SubLObject new_disjuncts = (SubLObject)clausifier.NIL;
                            SubLObject cdolist_list_var;
                            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(nested_disjunction, (SubLObject)clausifier.$kw22$IGNORE);
                            SubLObject disjunct = (SubLObject)clausifier.NIL;
                            disjunct = cdolist_list_var.first();
                            while (clausifier.NIL != cdolist_list_var) {
                                final SubLObject new_conjuncts = (SubLObject)ConsesLow.cons(disjunct, other_conjuncts);
                                new_disjuncts = (SubLObject)ConsesLow.cons(simplifier.conjoin(new_conjuncts, (SubLObject)clausifier.UNPROVIDED), new_disjuncts);
                                cdolist_list_var = cdolist_list_var.rest();
                                disjunct = cdolist_list_var.first();
                            }
                            result = simplifier.ndisjoin(list_utilities.nmapcar((SubLObject)clausifier.$sym54$CONJUNCTIONS_IN, new_disjuncts), (SubLObject)clausifier.UNPROVIDED);
                        }
                        else {
                            result = nested_disjunction;
                        }
                    }
                    else {
                        result = sentence;
                    }
                }
            }
            else if (clausifier.NIL != el_utilities.possibly_el_quantified_sentence_p(sentence) || clausifier.NIL != el_utilities.el_logical_operator_formula_p(sentence)) {
                result = sentence;
            }
            else if (clausifier.NIL != el_grammar.el_literal_p(sentence)) {
                result = sentence;
            }
            else if (clausifier.NIL != el_grammar.el_non_formula_sentence_p(sentence)) {
                result = sentence;
            }
            else {
                el_utilities.el_error((SubLObject)clausifier.FOUR_INTEGER, (SubLObject)clausifier.$str55$Got_the_unexpected_formula__S_in_, sentence, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED);
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
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 52220L)
    public static SubLObject first_disjunction(final SubLObject sentences) {
        return Sequences.find_if(Symbols.symbol_function((SubLObject)clausifier.$sym56$EL_DISJUNCTION_P), sentences, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 52407L)
    public static SubLObject bad_exponential_conjunctionP(final SubLObject sentence) {
        if (clausifier.NIL != el_utilities.el_conjunction_p(sentence)) {
            return bad_exponential_sentenceP(sentence, (SubLObject)clausifier.$sym56$EL_DISJUNCTION_P);
        }
        return (SubLObject)clausifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 52692L)
    public static SubLObject handle_bad_exponential_conjunction(final SubLObject sentence) {
        return Dynamic.sublisp_throw((SubLObject)clausifier.$kw57$BAD_EXPONENTIAL_CONJUNCTION, sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 52864L)
    public static SubLObject force_into_dnf(SubLObject sentence) {
        if (clausifier.NIL == el_utilities.el_disjunction_p(sentence)) {
            sentence = el_utilities.make_disjunction((SubLObject)ConsesLow.list(sentence));
        }
        SubLObject new_args = (SubLObject)clausifier.NIL;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, (SubLObject)clausifier.$kw22$IGNORE);
        SubLObject arg = (SubLObject)clausifier.NIL;
        arg = cdolist_list_var.first();
        while (clausifier.NIL != cdolist_list_var) {
            if (clausifier.NIL != el_utilities.el_conjunction_p(arg)) {
                new_args = (SubLObject)ConsesLow.cons(arg, new_args);
            }
            else {
                new_args = (SubLObject)ConsesLow.cons(el_utilities.make_conjunction((SubLObject)ConsesLow.list(arg)), new_args);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return el_utilities.make_disjunction(new_args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 53607L)
    public static SubLObject dnf_operators_out(SubLObject sentence) {
        if (clausifier.NIL == sentence || sentence.eql(clausifier.$const6$True) || sentence.eql(clausifier.$const7$False)) {
            return sentence;
        }
        if (clausifier.NIL != cycl_variables.el_varP(sentence)) {
            sentence = czer_utilities.encapsulate_formula(sentence, (SubLObject)clausifier.UNPROVIDED);
        }
        sentence = force_into_dnf(sentence);
        if (clausifier.NIL == el_utilities.el_disjunction_p(sentence)) {
            el_utilities.el_error((SubLObject)clausifier.FOUR_INTEGER, (SubLObject)clausifier.$str58$_s_is_not_a_disjunction__so_it_is, sentence, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED);
            return (SubLObject)clausifier.NIL;
        }
        SubLObject clause_list = (SubLObject)clausifier.NIL;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, (SubLObject)clausifier.$kw22$IGNORE);
        SubLObject disjunct = (SubLObject)clausifier.NIL;
        disjunct = cdolist_list_var.first();
        while (clausifier.NIL != cdolist_list_var) {
            if (clausifier.NIL == el_utilities.el_conjunction_p(disjunct)) {
                el_utilities.el_error((SubLObject)clausifier.FOUR_INTEGER, (SubLObject)clausifier.$str59$_s_is_not_a_conjunction__so__S_is, disjunct, sentence, (SubLObject)clausifier.UNPROVIDED);
                return (SubLObject)clausifier.NIL;
            }
            clause_list = (SubLObject)ConsesLow.cons(package_xnf_clause(cycl_utilities.formula_args(disjunct, (SubLObject)clausifier.UNPROVIDED)), clause_list);
            cdolist_list_var = cdolist_list_var.rest();
            disjunct = cdolist_list_var.first();
        }
        return Sequences.nreverse(clause_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 55058L)
    public static SubLObject package_dnf_clause(final SubLObject clause) {
        return package_xnf_clause(clause);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 55783L)
    public static SubLObject clausifier_input_sentence() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return clausifier.$clausifier_input_sentence$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 55914L)
    public static SubLObject clausifier_input_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return clausifier.$clausifier_input_mt$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 56033L)
    public static SubLObject el_xnf(SubLObject sentence, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = clausifier.$clausifier_input_sentence$.currentBinding(thread);
        final SubLObject _prev_bind_2 = clausifier.$clausifier_input_mt$.currentBinding(thread);
        try {
            clausifier.$clausifier_input_sentence$.bind(sentence, thread);
            clausifier.$clausifier_input_mt$.bind(mt, thread);
            thread.resetMultipleValues();
            final SubLObject sentence_$6 = el_xnf_int(sentence, mt);
            final SubLObject mt_$7 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            sentence = sentence_$6;
            mt = mt_$7;
            thread.resetMultipleValues();
            final SubLObject sentence_$7 = postcanonicalizer.postcanonicalizations(sentence, mt);
            final SubLObject mt_$8 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            sentence = sentence_$7;
            mt = mt_$8;
        }
        finally {
            clausifier.$clausifier_input_mt$.rebind(_prev_bind_2, thread);
            clausifier.$clausifier_input_sentence$.rebind(_prev_bind_0, thread);
        }
        sentence = simplifier.simplify_cycl_sentence_syntax(sentence, (SubLObject)clausifier.UNPROVIDED);
        return Values.values(sentence, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 56904L)
    public static SubLObject el_xnf_int(SubLObject sentence, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject sentence_$10 = precanonicalizer.precanonicalizations(sentence, mt);
        final SubLObject mt_$11 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        sentence = sentence_$10;
        mt = mt_$11;
        sentence = simplifier.simplify_cycl_sentence_syntax(sentence, (SubLObject)clausifier.UNPROVIDED);
        sentence = do_implications(sentence);
        sentence = simplifier.simplify_cycl_sentence_syntax(sentence, (SubLObject)clausifier.UNPROVIDED);
        sentence = do_negations_destructive(sentence);
        sentence = standardize_variables(sentence);
        final SubLObject _prev_bind_0 = clausifier.$newly_introduced_universals$.currentBinding(thread);
        try {
            clausifier.$newly_introduced_universals$.bind((SubLObject)clausifier.NIL, thread);
            sentence = czer_explicitify_implicit_quantifiers(sentence);
            sentence = existentials_out(sentence);
            sentence = universals_out(sentence);
        }
        finally {
            clausifier.$newly_introduced_universals$.rebind(_prev_bind_0, thread);
        }
        return Values.values(sentence, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 57725L)
    public static SubLObject package_xnf_clauses(final SubLObject v_clauses) {
        if (clausifier.$const6$True.eql(v_clauses)) {
            return v_clauses;
        }
        if (clausifier.$const7$False.eql(v_clauses)) {
            return v_clauses;
        }
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)clausifier.$sym60$PACKAGE_XNF_CLAUSE), v_clauses);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 57943L)
    public static SubLObject package_xnf_clause(final SubLObject clause) {
        final SubLObject neg_lits = Mapping.mapcar(Symbols.symbol_function((SubLObject)clausifier.$sym61$FORMULA_ARG1), el_utilities.el_negative_sentences(clause));
        final SubLObject pos_lits = el_utilities.el_positive_sentences(clause);
        return clauses.make_xnf(neg_lits, pos_lits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 58362L)
    public static SubLObject npackage_xnf_clause(final SubLObject clause) {
        final SubLObject neg_lits = list_utilities.nmapcar(Symbols.symbol_function((SubLObject)clausifier.$sym61$FORMULA_ARG1), el_utilities.el_negative_sentences(clause));
        final SubLObject pos_lits = el_utilities.el_positive_sentences(clause);
        return clauses.make_xnf(neg_lits, pos_lits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 58625L)
    public static SubLObject canon_fast_gafP(final SubLObject sentence, final SubLObject mt) {
        final SubLObject seqvar = el_utilities.sequence_var(sentence, (SubLObject)clausifier.UNPROVIDED);
        final SubLObject sentence_$12;
        final SubLObject tempformula = sentence_$12 = ((clausifier.NIL != seqvar) ? ConsesLow.append(el_utilities.strip_sequence_var(sentence), (SubLObject)ConsesLow.list(seqvar)) : sentence);
        return (SubLObject)SubLObjectFactory.makeBoolean(clausifier.NIL != el_utilities.el_formula_p(sentence_$12) && clausifier.NIL == Sequences.find_if(Symbols.symbol_function((SubLObject)clausifier.$sym15$EL_FORMULA_P), sentence_$12, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED) && clausifier.NIL == Sequences.find_if(Symbols.symbol_function((SubLObject)clausifier.$sym62$EL_VAR_), sentence_$12, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED) && clausifier.NIL != fort_types_interface.predicateP(cycl_utilities.formula_arg0(sentence_$12)) && clausifier.NIL == precanonicalizer.precanonicalizationsP(sentence_$12, mt, (SubLObject)clausifier.T));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 59047L)
    public static SubLObject el_cnf(SubLObject sentence, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
        try {
            czer_vars.$el_symbol_suffix_table$.bind((clausifier.NIL != czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread)) ? czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread) : Hashtables.make_hash_table((SubLObject)clausifier.$int16$32, Symbols.symbol_function((SubLObject)clausifier.EQL), (SubLObject)clausifier.UNPROVIDED), thread);
            czer_vars.$standardize_variables_memory$.bind((SubLObject)((clausifier.NIL != czer_vars.$standardize_variables_memory$.getDynamicValue(thread)) ? czer_vars.$standardize_variables_memory$.getDynamicValue(thread) : clausifier.NIL), thread);
            thread.resetMultipleValues();
            final SubLObject sentence_$13 = el_cnf_int(sentence, mt, (SubLObject)clausifier.NIL);
            final SubLObject mt_$14 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            sentence = sentence_$13;
            mt = mt_$14;
        }
        finally {
            czer_vars.$standardize_variables_memory$.rebind(_prev_bind_2, thread);
            czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0, thread);
        }
        return Values.values(sentence, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 59636L)
    public static SubLObject el_cnf_destructive(final SubLObject sentence, final SubLObject mt) {
        return el_cnf_int(sentence, mt, (SubLObject)clausifier.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 60079L)
    public static SubLObject el_cnf_int(SubLObject sentence, SubLObject mt, final SubLObject destructiveP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (clausifier.NIL == destructiveP) {
            sentence = el_utilities.copy_sentence(sentence);
        }
        if (clausifier.NIL != canon_fast_gafP(sentence, mt)) {
            sentence = simplifier.simplify_cycl_literal_syntax(sentence, (SubLObject)clausifier.UNPROVIDED);
        }
        else {
            thread.resetMultipleValues();
            final SubLObject sentence_$15 = el_xnf(sentence, mt);
            final SubLObject mt_$16 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            sentence = sentence_$15;
            mt = mt_$16;
            if (clausifier.NIL != wff_macros.within_wffP()) {
                sentence = disjunctions_in(sentence);
            }
            else {
                SubLObject error = (SubLObject)clausifier.NIL;
                try {
                    thread.throwStack.push(clausifier.$kw49$BAD_EXPONENTIAL_DISJUNCTION);
                    sentence = disjunctions_in(sentence);
                }
                catch (Throwable ccatch_env_var) {
                    error = Errors.handleThrowable(ccatch_env_var, (SubLObject)clausifier.$kw49$BAD_EXPONENTIAL_DISJUNCTION);
                }
                finally {
                    thread.throwStack.pop();
                }
                if (clausifier.NIL != error) {
                    sentence = (SubLObject)clausifier.NIL;
                }
            }
            sentence = simplifier.simplify_cycl_sentence_syntax(sentence, (SubLObject)clausifier.UNPROVIDED);
        }
        return Values.values(sentence, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 60984L)
    public static SubLObject el_dnf(SubLObject sentence, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
        try {
            czer_vars.$el_symbol_suffix_table$.bind((clausifier.NIL != czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread)) ? czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread) : Hashtables.make_hash_table((SubLObject)clausifier.$int16$32, Symbols.symbol_function((SubLObject)clausifier.EQL), (SubLObject)clausifier.UNPROVIDED), thread);
            czer_vars.$standardize_variables_memory$.bind((SubLObject)((clausifier.NIL != czer_vars.$standardize_variables_memory$.getDynamicValue(thread)) ? czer_vars.$standardize_variables_memory$.getDynamicValue(thread) : clausifier.NIL), thread);
            thread.resetMultipleValues();
            final SubLObject sentence_$17 = el_dnf_int(sentence, mt, (SubLObject)clausifier.NIL);
            final SubLObject mt_$18 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            sentence = sentence_$17;
            mt = mt_$18;
        }
        finally {
            czer_vars.$standardize_variables_memory$.rebind(_prev_bind_2, thread);
            czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0, thread);
        }
        return Values.values(sentence, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 61431L)
    public static SubLObject el_dnf_destructive(final SubLObject sentence, final SubLObject mt) {
        return el_dnf_int(sentence, mt, (SubLObject)clausifier.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 61874L)
    public static SubLObject el_dnf_int(SubLObject sentence, SubLObject mt, final SubLObject destructiveP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (clausifier.NIL == destructiveP) {
            sentence = el_utilities.copy_sentence(sentence);
        }
        if (clausifier.NIL != canon_fast_gafP(sentence, mt)) {
            sentence = simplifier.simplify_cycl_literal_syntax(sentence, (SubLObject)clausifier.UNPROVIDED);
        }
        else {
            thread.resetMultipleValues();
            final SubLObject sentence_$19 = el_xnf(sentence, mt);
            final SubLObject mt_$20 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            sentence = sentence_$19;
            mt = mt_$20;
            if (clausifier.NIL != wff_macros.within_wffP()) {
                sentence = conjunctions_in(sentence);
            }
            else {
                SubLObject error = (SubLObject)clausifier.NIL;
                try {
                    thread.throwStack.push(clausifier.$kw57$BAD_EXPONENTIAL_CONJUNCTION);
                    sentence = conjunctions_in(sentence);
                }
                catch (Throwable ccatch_env_var) {
                    error = Errors.handleThrowable(ccatch_env_var, (SubLObject)clausifier.$kw57$BAD_EXPONENTIAL_CONJUNCTION);
                }
                finally {
                    thread.throwStack.pop();
                }
                if (clausifier.NIL != error) {
                    sentence = (SubLObject)clausifier.NIL;
                }
            }
            sentence = simplifier.simplify_cycl_sentence_syntax(sentence, (SubLObject)clausifier.UNPROVIDED);
        }
        return Values.values(sentence, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 62780L)
    public static SubLObject leading_universal_variables(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject copied_sentence = el_utilities.copy_sentence(sentence);
        final SubLObject result = (SubLObject)clausifier.NIL;
        final SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
        try {
            czer_vars.$el_symbol_suffix_table$.bind(Hashtables.make_hash_table((SubLObject)clausifier.FOUR_INTEGER, Symbols.symbol_function((SubLObject)clausifier.EQL), (SubLObject)clausifier.UNPROVIDED), thread);
            czer_vars.$standardize_variables_memory$.bind((SubLObject)clausifier.NIL, thread);
            copied_sentence = precanonicalizer.precanonicalizations(copied_sentence, mt);
            copied_sentence = do_implications(copied_sentence);
            copied_sentence = do_negations_destructive(copied_sentence);
            copied_sentence = czer_explicitify_implicit_universal_quantifiers(copied_sentence);
            copied_sentence = standardize_variables(copied_sentence);
            copied_sentence = existentials_out(copied_sentence);
            copied_sentence = czer_main.el_nununiquify_vars(copied_sentence);
            copied_sentence = universals_out(copied_sentence);
            copied_sentence = leading_universal_variables_1(copied_sentence);
        }
        finally {
            czer_vars.$standardize_variables_memory$.rebind(_prev_bind_2, thread);
            czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 63789L)
    public static SubLObject leading_universal_variables_1(final SubLObject sentence) {
        if (clausifier.NIL == czer_utilities.encapsulate_formulaP(sentence)) {
            if (!sentence.isAtom()) {
                if (clausifier.NIL == el_utilities.el_negation_p(sentence)) {
                    if (clausifier.NIL != el_utilities.el_conjunction_p(sentence) || clausifier.NIL != el_utilities.el_disjunction_p(sentence)) {
                        return list_utilities.mapappend(Symbols.symbol_function((SubLObject)clausifier.$sym63$LEADING_UNIVERSAL_VARIABLES_1), cycl_utilities.formula_args(sentence, (SubLObject)clausifier.UNPROVIDED));
                    }
                    if (clausifier.NIL != el_utilities.cycl_universal_p(sentence)) {
                        return (SubLObject)ConsesLow.cons(el_utilities.quantified_var(sentence), leading_universal_variables_1(el_utilities.quantified_sub_sentence(sentence)));
                    }
                }
            }
        }
        return (SubLObject)clausifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 64226L)
    public static SubLObject sort_vars(final SubLObject vars) {
        return Sort.sort(conses_high.copy_list(vars), Symbols.symbol_function((SubLObject)clausifier.$sym64$STRING_), Symbols.symbol_function((SubLObject)clausifier.$sym65$STR));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 64339L)
    public static SubLObject distribute_conjunction(final SubLObject conjuncts, final SubLObject disjuncts, SubLObject conjunction_operator) {
        if (conjunction_operator == clausifier.UNPROVIDED) {
            conjunction_operator = clausifier.$const66$and;
        }
        if (conjuncts.isCons() && clausifier.NIL != list_utilities.proper_list_p(disjuncts)) {
            SubLObject ans = (SubLObject)clausifier.NIL;
            SubLObject cdolist_list_var = disjuncts;
            SubLObject disjunct = (SubLObject)clausifier.NIL;
            disjunct = cdolist_list_var.first();
            while (clausifier.NIL != cdolist_list_var) {
                ans = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(conjunction_operator, disjunct, conjuncts), ans);
                cdolist_list_var = cdolist_list_var.rest();
                disjunct = cdolist_list_var.first();
            }
            return Sequences.nreverse(ans);
        }
        return (SubLObject)clausifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 64861L)
    public static SubLObject clausal_form(final SubLObject sentence, final SubLObject mt, SubLObject form) {
        if (form == clausifier.UNPROVIDED) {
            form = (SubLObject)clausifier.$kw67$CNF;
        }
        final SubLObject pcase_var = form;
        if (pcase_var.eql((SubLObject)clausifier.$kw67$CNF)) {
            return cnf_clausal_form(sentence, mt);
        }
        if (pcase_var.eql((SubLObject)clausifier.$kw68$DNF)) {
            return dnf_clausal_form(sentence, mt);
        }
        return (SubLObject)clausifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 65384L)
    public static SubLObject cnf_clausal_form(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (clausifier.NIL != clausifier.$use_cnf_cacheP$.getDynamicValue(thread)) {
            return cached_cnf_clausal_form(sentence, mt);
        }
        return cnf_clausal_form_int(sentence, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 65626L)
    public static SubLObject clear_cached_cnf_clausal_form() {
        final SubLObject cs = clausifier.$cached_cnf_clausal_form_caching_state$.getGlobalValue();
        if (clausifier.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)clausifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 65626L)
    public static SubLObject remove_cached_cnf_clausal_form(final SubLObject sentence, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args(clausifier.$cached_cnf_clausal_form_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(sentence, mt), (SubLObject)clausifier.UNPROVIDED, (SubLObject)clausifier.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 65626L)
    public static SubLObject cached_cnf_clausal_form_internal(final SubLObject sentence, final SubLObject mt) {
        return cnf_clausal_form_int(sentence, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 65626L)
    public static SubLObject cached_cnf_clausal_form(final SubLObject sentence, final SubLObject mt) {
        SubLObject caching_state = clausifier.$cached_cnf_clausal_form_caching_state$.getGlobalValue();
        if (clausifier.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)clausifier.$sym69$CACHED_CNF_CLAUSAL_FORM, (SubLObject)clausifier.$sym70$_CACHED_CNF_CLAUSAL_FORM_CACHING_STATE_, (SubLObject)clausifier.NIL, (SubLObject)clausifier.EQUAL, (SubLObject)clausifier.TWO_INTEGER, (SubLObject)clausifier.$int71$48);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)clausifier.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)clausifier.NIL;
            collision = cdolist_list_var.first();
            while (clausifier.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (sentence.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (clausifier.NIL != cached_args && clausifier.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_cnf_clausal_form_internal(sentence, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(sentence, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 65903L)
    public static SubLObject cnf_clausal_form_int(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject cnf = el_cnf(sentence, mt);
        final SubLObject new_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(cnf_operators_out(cnf), new_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clausifier.lisp", position = 66071L)
    public static SubLObject dnf_clausal_form(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject dnf = el_dnf(sentence, mt);
        final SubLObject new_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(dnf_operators_out(dnf), new_mt);
    }
    
    public static SubLObject declare_clausifier_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "do_implications", "DO-IMPLICATIONS", 1, 0, false);
        new $do_implications$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "do_implications_recursive", "DO-IMPLICATIONS-RECURSIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "eliminate_existential_with_var_only_in_antecedentP", "ELIMINATE-EXISTENTIAL-WITH-VAR-ONLY-IN-ANTECEDENT?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "do_negations", "DO-NEGATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "do_negations_destructive", "DO-NEGATIONS-DESTRUCTIVE", 1, 0, false);
        new $do_negations_destructive$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "negate_formula", "NEGATE-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "negation_in", "NEGATION-IN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "negate_quantified_sentence", "NEGATE-QUANTIFIED-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "negate_atomic", "NEGATE-ATOMIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "negate_negation", "NEGATE-NEGATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "negate_negations", "NEGATE-NEGATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "negate_conjunction", "NEGATE-CONJUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "negate_conjunction_destructive", "NEGATE-CONJUNCTION-DESTRUCTIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "negate_disjunction_destructive", "NEGATE-DISJUNCTION-DESTRUCTIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "negate_universal", "NEGATE-UNIVERSAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "negate_existential", "NEGATE-EXISTENTIAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "negate_existential_min", "NEGATE-EXISTENTIAL-MIN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "negate_existential_max", "NEGATE-EXISTENTIAL-MAX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "negate_existential_exact", "NEGATE-EXISTENTIAL-EXACT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "negate_true_sentence", "NEGATE-TRUE-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "negate_encapsulate_sentence", "NEGATE-ENCAPSULATE-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "lift_negation", "LIFT-NEGATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "czer_explicitify_implicit_quantifiers", "CZER-EXPLICITIFY-IMPLICIT-QUANTIFIERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "czer_explicitify_implicit_universal_quantifiers", "CZER-EXPLICITIFY-IMPLICIT-UNIVERSAL-QUANTIFIERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "czer_explicitify_implicit_existential_quantifiers", "CZER-EXPLICITIFY-IMPLICIT-EXISTENTIAL-QUANTIFIERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "assume_free_vars_are_existentially_boundP", "ASSUME-FREE-VARS-ARE-EXISTENTIALLY-BOUND?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "standardize_sentence_variables", "STANDARDIZE-SENTENCE-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "standardize_variables", "STANDARDIZE-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "recursively_standardize_variables", "RECURSIVELY-STANDARDIZE-VARIABLES", 1, 0, false);
        new $recursively_standardize_variables$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "el_uniquify_standardize", "EL-UNIQUIFY-STANDARDIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "el_var_without_quote", "EL-VAR-WITHOUT-QUOTE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "remember_variable_rename", "REMEMBER-VARIABLE-RENAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "remember_variables_rename", "REMEMBER-VARIABLES-RENAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "el_uniquify", "EL-UNIQUIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "existentials_out", "EXISTENTIALS-OUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "existentials_out_int", "EXISTENTIALS-OUT-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "skolemize_atomic_sentence", "SKOLEMIZE-ATOMIC-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "skolemize_variable", "SKOLEMIZE-VARIABLE", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "determine_skolem_var_status", "DETERMINE-SKOLEM-VAR-STATUS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "make_skolem_fn_fn", "MAKE-SKOLEM-FN-FN", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "drop_all_existentialsP", "DROP-ALL-EXISTENTIALS?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "leave_skolem_constants_aloneP", "LEAVE-SKOLEM-CONSTANTS-ALONE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "forbid_quantified_sequence_variablesP", "FORBID-QUANTIFIED-SEQUENCE-VARIABLES?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "universals_out", "UNIVERSALS-OUT", 1, 0, false);
        new $universals_out$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "disjunctions_in", "DISJUNCTIONS-IN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "disjunctions_in_int", "DISJUNCTIONS-IN-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "first_conjunction", "FIRST-CONJUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "bad_exponential_disjunctionP", "BAD-EXPONENTIAL-DISJUNCTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "handle_bad_exponential_disjunction", "HANDLE-BAD-EXPONENTIAL-DISJUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "bad_exponential_sentenceP", "BAD-EXPONENTIAL-SENTENCE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "average_arity", "AVERAGE-ARITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "force_into_cnf", "FORCE-INTO-CNF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "cnf_operators_out", "CNF-OPERATORS-OUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "package_cnf_clause", "PACKAGE-CNF-CLAUSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "npackage_cnf_clause", "NPACKAGE-CNF-CLAUSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "conjunctions_in", "CONJUNCTIONS-IN", 1, 0, false);
        new $conjunctions_in$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "conjunctions_in_int", "CONJUNCTIONS-IN-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "first_disjunction", "FIRST-DISJUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "bad_exponential_conjunctionP", "BAD-EXPONENTIAL-CONJUNCTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "handle_bad_exponential_conjunction", "HANDLE-BAD-EXPONENTIAL-CONJUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "force_into_dnf", "FORCE-INTO-DNF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "dnf_operators_out", "DNF-OPERATORS-OUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "package_dnf_clause", "PACKAGE-DNF-CLAUSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "clausifier_input_sentence", "CLAUSIFIER-INPUT-SENTENCE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "clausifier_input_mt", "CLAUSIFIER-INPUT-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "el_xnf", "EL-XNF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "el_xnf_int", "EL-XNF-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "package_xnf_clauses", "PACKAGE-XNF-CLAUSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "package_xnf_clause", "PACKAGE-XNF-CLAUSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "npackage_xnf_clause", "NPACKAGE-XNF-CLAUSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "canon_fast_gafP", "CANON-FAST-GAF?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "el_cnf", "EL-CNF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "el_cnf_destructive", "EL-CNF-DESTRUCTIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "el_cnf_int", "EL-CNF-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "el_dnf", "EL-DNF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "el_dnf_destructive", "EL-DNF-DESTRUCTIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "el_dnf_int", "EL-DNF-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "leading_universal_variables", "LEADING-UNIVERSAL-VARIABLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "leading_universal_variables_1", "LEADING-UNIVERSAL-VARIABLES-1", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "sort_vars", "SORT-VARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "distribute_conjunction", "DISTRIBUTE-CONJUNCTION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "clausal_form", "CLAUSAL-FORM", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "cnf_clausal_form", "CNF-CLAUSAL-FORM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "clear_cached_cnf_clausal_form", "CLEAR-CACHED-CNF-CLAUSAL-FORM", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "remove_cached_cnf_clausal_form", "REMOVE-CACHED-CNF-CLAUSAL-FORM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "cached_cnf_clausal_form_internal", "CACHED-CNF-CLAUSAL-FORM-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "cached_cnf_clausal_form", "CACHED-CNF-CLAUSAL-FORM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "cnf_clausal_form_int", "CNF-CLAUSAL-FORM-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clausifier", "dnf_clausal_form", "DNF-CLAUSAL-FORM", 2, 0, false);
        return (SubLObject)clausifier.NIL;
    }
    
    public static SubLObject init_clausifier_file() {
        clausifier.$canonical_variable_name_stem$ = SubLFiles.defparameter("*CANONICAL-VARIABLE-NAME-STEM*", (SubLObject)clausifier.$str0$el_var);
        clausifier.$use_cnf_cacheP$ = SubLFiles.defparameter("*USE-CNF-CACHE?*", (SubLObject)clausifier.T);
        clausifier.$newly_introduced_universals$ = SubLFiles.defparameter("*NEWLY-INTRODUCED-UNIVERSALS*", (SubLObject)clausifier.$kw1$ERROR);
        clausifier.$outermost_implication$ = SubLFiles.defparameter("*OUTERMOST-IMPLICATION*", (SubLObject)clausifier.$kw2$UNINITIALIZED);
        clausifier.$innermost_implication$ = SubLFiles.defparameter("*INNERMOST-IMPLICATION*", (SubLObject)clausifier.$kw2$UNINITIALIZED);
        clausifier.$eliminate_existential_with_var_only_in_antecedentP$ = SubLFiles.defparameter("*ELIMINATE-EXISTENTIAL-WITH-VAR-ONLY-IN-ANTECEDENT?*", (SubLObject)clausifier.T);
        clausifier.$quantifier_info_list$ = SubLFiles.defparameter("*QUANTIFIER-INFO-LIST*", (SubLObject)clausifier.NIL);
        clausifier.$czer_bad_exponential_threshold$ = SubLFiles.deflexical("*CZER-BAD-EXPONENTIAL-THRESHOLD*", (SubLObject)clausifier.$int50$200000);
        clausifier.$clausifier_input_sentence$ = SubLFiles.defparameter("*CLAUSIFIER-INPUT-SENTENCE*", (SubLObject)clausifier.NIL);
        clausifier.$clausifier_input_mt$ = SubLFiles.defparameter("*CLAUSIFIER-INPUT-MT*", (SubLObject)clausifier.NIL);
        clausifier.$cached_cnf_clausal_form_caching_state$ = SubLFiles.deflexical("*CACHED-CNF-CLAUSAL-FORM-CACHING-STATE*", (SubLObject)clausifier.NIL);
        return (SubLObject)clausifier.NIL;
    }
    
    public static SubLObject setup_clausifier_file() {
        memoization_state.note_globally_cached_function((SubLObject)clausifier.$sym69$CACHED_CNF_CLAUSAL_FORM);
        return (SubLObject)clausifier.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_clausifier_file();
    }
    
    @Override
	public void initializeVariables() {
        init_clausifier_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_clausifier_file();
    }
    
    static {
        me = (SubLFile)new clausifier();
        clausifier.$canonical_variable_name_stem$ = null;
        clausifier.$use_cnf_cacheP$ = null;
        clausifier.$newly_introduced_universals$ = null;
        clausifier.$outermost_implication$ = null;
        clausifier.$innermost_implication$ = null;
        clausifier.$eliminate_existential_with_var_only_in_antecedentP$ = null;
        clausifier.$quantifier_info_list$ = null;
        clausifier.$czer_bad_exponential_threshold$ = null;
        clausifier.$clausifier_input_sentence$ = null;
        clausifier.$clausifier_input_mt$ = null;
        clausifier.$cached_cnf_clausal_form_caching_state$ = null;
        $str0$el_var = SubLObjectFactory.makeString("el-var");
        $kw1$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $kw2$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $sym3$DO_IMPLICATIONS_RECURSIVE = SubLObjectFactory.makeSymbol("DO-IMPLICATIONS-RECURSIVE");
        $sym4$DO_NEGATIONS_DESTRUCTIVE = SubLObjectFactory.makeSymbol("DO-NEGATIONS-DESTRUCTIVE");
        $kw5$HELLO_YOU_SILLY_COMPILER = SubLObjectFactory.makeKeyword("HELLO-YOU-SILLY-COMPILER");
        $const6$True = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True"));
        $const7$False = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("False"));
        $kw8$REGULARIZE = SubLObjectFactory.makeKeyword("REGULARIZE");
        $str9$_s_is_not_a_quantified_sentence = SubLObjectFactory.makeString("~s is not a quantified sentence");
        $sym10$NEGATE_NEGATION = SubLObjectFactory.makeSymbol("NEGATE-NEGATION");
        $sym11$NEGATE_FORMULA = SubLObjectFactory.makeSymbol("NEGATE-FORMULA");
        $const12$DifferenceFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DifferenceFn"));
        $str13$_s_contained_the_invalid_bound__D = SubLObjectFactory.makeString("~s contained the invalid bound ~D");
        $const14$PlusFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlusFn"));
        $sym15$EL_FORMULA_P = SubLObjectFactory.makeSymbol("EL-FORMULA-P");
        $int16$32 = SubLObjectFactory.makeInteger(32);
        $sym17$CYC_VAR_ = SubLObjectFactory.makeSymbol("CYC-VAR?");
        $const18$Quote = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Quote"));
        $sym19$RECURSIVELY_STANDARDIZE_VARIABLES = SubLObjectFactory.makeSymbol("RECURSIVELY-STANDARDIZE-VARIABLES");
        $sym20$EL_UNIQUIFY_STANDARDIZE = SubLObjectFactory.makeSymbol("EL-UNIQUIFY-STANDARDIZE");
        $sym21$EL_VAR_WITHOUT_QUOTE = SubLObjectFactory.makeSymbol("EL-VAR-WITHOUT-QUOTE");
        $kw22$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $str23$_ = SubLObjectFactory.makeString("-");
        $sym24$CYC_CONST_GENERAL_EXISTENTIAL_OPERATOR_P = SubLObjectFactory.makeSymbol("CYC-CONST-GENERAL-EXISTENTIAL-OPERATOR-P");
        $kw25$TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE = SubLObjectFactory.makeKeyword("TOO-MANY-SEQUENCE-VARS-IN-SKOLEM-SCOPE");
        $kw26$AMBIGUOUS_VAR_TYPE_IN_SKOLEM_SCOPE = SubLObjectFactory.makeKeyword("AMBIGUOUS-VAR-TYPE-IN-SKOLEM-SCOPE");
        $kw27$QUANTIFIED_SEQUENCE_VARIABLE = SubLObjectFactory.makeKeyword("QUANTIFIED-SEQUENCE-VARIABLE");
        $sym28$EXISTENTIALS_OUT_INT = SubLObjectFactory.makeSymbol("EXISTENTIALS-OUT-INT");
        $str29$Unexpected_sentence_type_in_exist = SubLObjectFactory.makeString("Unexpected sentence type in existentials-out-int: ~S");
        $const30$forAll = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("forAll"));
        $kw31$NEITHER = SubLObjectFactory.makeKeyword("NEITHER");
        $kw32$TERM = SubLObjectFactory.makeKeyword("TERM");
        $kw33$SEQ = SubLObjectFactory.makeKeyword("SEQ");
        $kw34$BOTH = SubLObjectFactory.makeKeyword("BOTH");
        $kw35$UNDETERMINED = SubLObjectFactory.makeKeyword("UNDETERMINED");
        $str36$Skolemizer_failed_to_classify_var = SubLObjectFactory.makeString("Skolemizer failed to classify variable ~a in sentence ~a~%");
        $str37$skolem_constants_not_yet_supporte = SubLObjectFactory.makeString("skolem constants not yet supported");
        $const38$thereExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $const39$SkolemFunctionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SkolemFunctionFn"));
        $const40$SkolemFuncNFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SkolemFuncNFn"));
        $str41$make_skolem_fn_fn_doesn_t_know_ho = SubLObjectFactory.makeString("make-skolem-fn-fn doesn't know how to handle the quantifier ~S");
        $kw42$ASSERT_ONLY = SubLObjectFactory.makeKeyword("ASSERT-ONLY");
        $str43$Unexpected_value_for__forbid_quan = SubLObjectFactory.makeString("Unexpected value for *forbid-quantified-sequence-variables?*: ~s");
        $sym44$UNIVERSALS_OUT = SubLObjectFactory.makeSymbol("UNIVERSALS-OUT");
        $str45$Got_the_unexpected_sentence__S_in = SubLObjectFactory.makeString("Got the unexpected sentence ~S in universals-out.");
        $sym46$DISJUNCTIONS_IN = SubLObjectFactory.makeSymbol("DISJUNCTIONS-IN");
        $str47$Got_the_unexpected_sentence__S_in = SubLObjectFactory.makeString("Got the unexpected sentence ~S in disjunctions-in.");
        $sym48$EL_CONJUNCTION_P = SubLObjectFactory.makeSymbol("EL-CONJUNCTION-P");
        $kw49$BAD_EXPONENTIAL_DISJUNCTION = SubLObjectFactory.makeKeyword("BAD-EXPONENTIAL-DISJUNCTION");
        $int50$200000 = SubLObjectFactory.makeInteger(200000);
        $sym51$FORMULA_ARITY = SubLObjectFactory.makeSymbol("FORMULA-ARITY");
        $str52$_s_is_not_a_conjunction__so_it_is = SubLObjectFactory.makeString("~s is not a conjunction, so it is not a CNF sentence.");
        $str53$_s_is_not_a_disjunction__so__S_is = SubLObjectFactory.makeString("~s is not a disjunction, so ~S is not a CNF sentence.");
        $sym54$CONJUNCTIONS_IN = SubLObjectFactory.makeSymbol("CONJUNCTIONS-IN");
        $str55$Got_the_unexpected_formula__S_in_ = SubLObjectFactory.makeString("Got the unexpected formula ~S in conjunctions-in.");
        $sym56$EL_DISJUNCTION_P = SubLObjectFactory.makeSymbol("EL-DISJUNCTION-P");
        $kw57$BAD_EXPONENTIAL_CONJUNCTION = SubLObjectFactory.makeKeyword("BAD-EXPONENTIAL-CONJUNCTION");
        $str58$_s_is_not_a_disjunction__so_it_is = SubLObjectFactory.makeString("~s is not a disjunction, so it is not a DNF sentence.");
        $str59$_s_is_not_a_conjunction__so__S_is = SubLObjectFactory.makeString("~s is not a conjunction, so ~S is not a DNF sentence.");
        $sym60$PACKAGE_XNF_CLAUSE = SubLObjectFactory.makeSymbol("PACKAGE-XNF-CLAUSE");
        $sym61$FORMULA_ARG1 = SubLObjectFactory.makeSymbol("FORMULA-ARG1");
        $sym62$EL_VAR_ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $sym63$LEADING_UNIVERSAL_VARIABLES_1 = SubLObjectFactory.makeSymbol("LEADING-UNIVERSAL-VARIABLES-1");
        $sym64$STRING_ = SubLObjectFactory.makeSymbol("STRING<");
        $sym65$STR = SubLObjectFactory.makeSymbol("STR");
        $const66$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $kw67$CNF = SubLObjectFactory.makeKeyword("CNF");
        $kw68$DNF = SubLObjectFactory.makeKeyword("DNF");
        $sym69$CACHED_CNF_CLAUSAL_FORM = SubLObjectFactory.makeSymbol("CACHED-CNF-CLAUSAL-FORM");
        $sym70$_CACHED_CNF_CLAUSAL_FORM_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-CNF-CLAUSAL-FORM-CACHING-STATE*");
        $int71$48 = SubLObjectFactory.makeInteger(48);
    }
    
    public static final class $do_implications$UnaryFunction extends UnaryFunction
    {
        public $do_implications$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("DO-IMPLICATIONS"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return clausifier.do_implications(arg1);
        }
    }
    
    public static final class $do_negations_destructive$UnaryFunction extends UnaryFunction
    {
        public $do_negations_destructive$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("DO-NEGATIONS-DESTRUCTIVE"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return clausifier.do_negations_destructive(arg1);
        }
    }
    
    public static final class $recursively_standardize_variables$UnaryFunction extends UnaryFunction
    {
        public $recursively_standardize_variables$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("RECURSIVELY-STANDARDIZE-VARIABLES"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return clausifier.recursively_standardize_variables(arg1);
        }
    }
    
    public static final class $universals_out$UnaryFunction extends UnaryFunction
    {
        public $universals_out$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("UNIVERSALS-OUT"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return clausifier.universals_out(arg1);
        }
    }
    
    public static final class $conjunctions_in$UnaryFunction extends UnaryFunction
    {
        public $conjunctions_in$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CONJUNCTIONS-IN"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return clausifier.conjunctions_in(arg1);
        }
    }
}

/*

	Total time: 510 ms
	
*/