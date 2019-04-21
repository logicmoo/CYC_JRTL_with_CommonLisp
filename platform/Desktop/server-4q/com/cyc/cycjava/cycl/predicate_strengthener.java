package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class predicate_strengthener extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.predicate_strengthener";
    public static final String myFingerPrint = "abffd47af93f2112688f60c74bd243c7887d34e0b834c056707dcb88e31fdcb8";
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 852L)
    private static SubLSymbol $strengthen_original_pred_awayP$;
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 1108L)
    public static SubLSymbol $pred_strengthen_stop_at_first_specified_pred$;
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 1185L)
    public static SubLSymbol $pred_strengthening_max_literal_count$;
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 1346L)
    public static SubLSymbol $max_pred_strengs$;
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 2647L)
    private static SubLSymbol $pred_strengthener_fn$;
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 5554L)
    private static SubLSymbol $do_not_strengthen_isaP$;
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 12278L)
    private static SubLSymbol $reformulator_rules_to_use$;
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 13600L)
    private static SubLSymbol $reformulator_rules_to_ignore$;
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 19857L)
    public static SubLSymbol $dtp_constraint$;
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 27823L)
    private static SubLSymbol $predstren_common_uninteresting$;
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 34899L)
    private static SubLSymbol $ps_suggested_inverses$;
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 35063L)
    private static SubLSymbol $ps_suggested_preds$;
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 35149L)
    private static SubLSymbol $ps_typed_inverses$;
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 35245L)
    private static SubLSymbol $ps_typed_preds$;
    private static final SubLSymbol $kw0$POSITIVE_INFINITY;
    private static final SubLSymbol $sym1$ATOMIC_SENTENCE_;
    private static final SubLSymbol $sym2$EL_FORMULA_P;
    private static final SubLSymbol $sym3$STRENGTHEN_PREDICATE_W_TYPED_AND_MINIMAL_SUGGESTIONS;
    private static final SubLSymbol $sym4$STRENGTHEN_PREDICATE_W_TYPED_LINKS_ONLY;
    private static final SubLObject $const5$isa;
    private static final SubLObject $const6$is_Underspecified;
    private static final SubLSymbol $sym7$NART_P;
    private static final SubLString $str8$PredStren__no_contracted_version_;
    private static final SubLObject $const9$genlInverse;
    private static final SubLSymbol $kw10$ANY;
    private static final SubLSymbol $sym11$RELEVANT_MT_IS_ANY_MT;
    private static final SubLObject $const12$InferencePSC;
    private static final SubLSymbol $sym13$PREDSTREN_EXPANDIBLE_RMP_;
    private static final SubLSymbol $sym14$PREDSTREN_EXPANDIBLE_EXPRESSION_;
    private static final SubLSymbol $sym15$PREDSTREN_EXPAND_FORMULA;
    private static final SubLSymbol $kw16$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym17$IGNORE_ERRORS_HANDLER;
    private static final SubLSymbol $sym18$PREDSTREN_EXPAND_ONE_STEP;
    private static final SubLObject $const19$expansion;
    private static final SubLSymbol $sym20$_REFORMULATOR_RULES_TO_USE_;
    private static final SubLSymbol $sym21$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const22$EverythingPSC;
    private static final SubLObject $const23$SubcollectionRelationFunction;
    private static final SubLObject $const24$RuleMacroPredicate;
    private static final SubLSymbol $kw25$TRUE;
    private static final SubLSymbol $sym26$_REFORMULATOR_RULES_TO_IGNORE_;
    private static final SubLList $list27;
    private static final SubLObject $const28$IntermediateVocabularyMt;
    private static final SubLList $list29;
    private static final SubLSymbol $kw30$MAX_TIME;
    private static final SubLInteger $int31$30;
    private static final SubLSymbol $kw32$RECURSION_LIMIT;
    private static final SubLSymbol $kw33$FOCUS;
    private static final SubLObject $const34$ReformulatorRuleUnifier;
    private static final SubLSymbol $kw35$REFORMULATOR_RULES;
    private static final SubLSymbol $kw36$SKIP_ASSERTIONS;
    private static final SubLList $list37;
    private static final SubLList $list38;
    private static final SubLObject $const39$genls;
    private static final SubLObject $const40$and;
    private static final SubLObject $const41$genlPreds;
    private static final SubLList $list42;
    private static final SubLObject $const43$equals;
    private static final SubLObject $const44$Set_Mathematical;
    private static final SubLObject $const45$elementOf;
    private static final SubLSymbol $sym46$CONSTRAINT;
    private static final SubLSymbol $sym47$CONSTRAINT_P;
    private static final SubLList $list48;
    private static final SubLList $list49;
    private static final SubLList $list50;
    private static final SubLList $list51;
    private static final SubLSymbol $sym52$PRINT_CONSTRAINT;
    private static final SubLSymbol $sym53$CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list54;
    private static final SubLSymbol $sym55$CONSTRAINT_VARIABLE;
    private static final SubLSymbol $sym56$_CSETF_CONSTRAINT_VARIABLE;
    private static final SubLSymbol $sym57$CONSTRAINT_ISA_LIST;
    private static final SubLSymbol $sym58$_CSETF_CONSTRAINT_ISA_LIST;
    private static final SubLSymbol $sym59$CONSTRAINT_GENL_LIST;
    private static final SubLSymbol $sym60$_CSETF_CONSTRAINT_GENL_LIST;
    private static final SubLSymbol $kw61$VARIABLE;
    private static final SubLSymbol $kw62$ISA_LIST;
    private static final SubLSymbol $kw63$GENL_LIST;
    private static final SubLString $str64$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw65$BEGIN;
    private static final SubLSymbol $sym66$MAKE_CONSTRAINT;
    private static final SubLSymbol $kw67$SLOT;
    private static final SubLSymbol $kw68$END;
    private static final SubLSymbol $sym69$VISIT_DEFSTRUCT_OBJECT_CONSTRAINT_METHOD;
    private static final SubLString $str70$__Constraint___A_isa___A_genl___A;
    private static final SubLObject $const71$CollectionSubsetFn;
    private static final SubLObject $const72$TheSetOf;
    private static final SubLSymbol $sym73$COLLECTION_SUBSET_FN_NAUT_P;
    private static final SubLSymbol $sym74$FORMULA_ARG2;
    private static final SubLSymbol $sym75$PREDSTREN_EXPAND_COLLECTION_SUBSET_FN_NARTS;
    private static final SubLSymbol $sym76$COLLECTION_SUBSET_FN_NART_P;
    private static final SubLSymbol $sym77$NART_EXPAND;
    private static final SubLObject $const78$typeGenls;
    private static final SubLObject $const79$or;
    private static final SubLList $list80;
    private static final SubLList $list81;
    private static final SubLSymbol $kw82$EMPTY;
    private static final SubLString $str83$Non_binary_constraint_in_Predicat;
    private static final SubLSymbol $sym84$PREDSTREN_IDENTIFY_PREDICATE;
    private static final SubLList $list85;
    private static final SubLObject $const86$UnderspecifiedPredicate;
    private static final SubLList $list87;
    private static final SubLSymbol $sym88$_;
    private static final SubLSymbol $sym89$RELATION_GENERALITY_ESTIMATE;
    private static final SubLList $list90;
    private static final SubLObject $const91$SubLString;
    private static final SubLObject $const92$NegativeInteger;
    private static final SubLObject $const93$NonNegativeInteger;
    private static final SubLObject $const94$RealNumber;
    private static final SubLObject $const95$SubLKeyword;
    private static final SubLObject $const96$SubLListOrAtom;
    private static final SubLObject $const97$SubLList;
    private static final SubLObject $const98$SubLAtom;
    private static final SubLObject $const99$Thing;
    private static final SubLList $list100;
    private static final SubLSymbol $kw101$TYPED;
    private static final SubLSymbol $sym102$PCOND;
    private static final SubLSymbol $sym103$PRED_STRENG_MARKING_MODE;
    private static final SubLList $list104;
    private static final SubLSymbol $sym105$CPUSHNEW;
    private static final SubLList $list106;
    private static final SubLList $list107;
    private static final SubLList $list108;
    private static final SubLList $list109;
    private static final SubLList $list110;
    private static final SubLList $list111;
    private static final SubLList $list112;
    private static final SubLSymbol $sym113$PUNLESS;
    private static final SubLSymbol $sym114$MEMBER_;
    private static final SubLSymbol $sym115$CSETQ;
    private static final SubLSymbol $sym116$_PS_SUGGESTED_PREDS_;
    private static final SubLSymbol $sym117$SNOC;
    private static final SubLSymbol $sym118$_PS_SUGGESTED_INVERSES_;
    private static final SubLString $str119$Error_in_processing__A__result_co;
    private static final SubLSymbol $sym120$EQUALS_EL_;
    private static final SubLString $str121$_A___not_found_in_expected_result;
    private static final SubLSymbol $sym122$PASSES_PRED_STRENGTHENING_TEST;
    private static final SubLSymbol $kw123$TEST;
    private static final SubLSymbol $kw124$OWNER;
    private static final SubLSymbol $kw125$CLASSES;
    private static final SubLSymbol $kw126$KB;
    private static final SubLSymbol $kw127$FULL;
    private static final SubLSymbol $kw128$WORKING_;
    private static final SubLObject $list129;
    private static final SubLSymbol $sym130$PASSES_NARTY_PRED_STRENGTHENING_TEST;
    private static final SubLList $list131;
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 1395L)
    public static SubLObject max_pred_strengs() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return predicate_strengthener.$max_pred_strengs$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 1461L)
    public static SubLObject skip_pred_strengthening_for_formulaP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (predicate_strengthener.NIL != subl_promotions.non_negative_integer_p(predicate_strengthener.$pred_strengthening_max_literal_count$.getDynamicValue(thread)) && predicate_strengthener.NIL != list_utilities.lengthG(cycl_utilities.expression_gather(formula, (SubLObject)predicate_strengthener.$sym1$ATOMIC_SENTENCE_, (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED), predicate_strengthener.$pred_strengthening_max_literal_count$.getDynamicValue(thread), (SubLObject)predicate_strengthener.UNPROVIDED)) {
            return (SubLObject)predicate_strengthener.T;
        }
        return (SubLObject)predicate_strengthener.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 1793L)
    public static SubLObject pred_strengthen_formula(final SubLObject formula, final SubLObject domain_mt, SubLObject constraints) {
        if (constraints == predicate_strengthener.UNPROVIDED) {
            constraints = (SubLObject)predicate_strengthener.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert predicate_strengthener.NIL != el_utilities.el_formula_p(formula) : formula;
        SubLObject new_proposals = (SubLObject)predicate_strengthener.NIL;
        if (predicate_strengthener.NIL == skip_pred_strengthening_for_formulaP(formula)) {
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
            final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    final SubLObject _prev_bind_0_$1 = predicate_strengthener.$strengthen_original_pred_awayP$.currentBinding(thread);
                    try {
                        predicate_strengthener.$strengthen_original_pred_awayP$.bind((SubLObject)predicate_strengthener.T, thread);
                        final SubLObject proposals = formula_predicate_strengthen_with_constraints(formula, domain_mt, constraints);
                        if (predicate_strengthener.NIL != proposals) {
                            new_proposals = expand_formula_with_stronger_predicates(formula, proposals, domain_mt);
                        }
                    }
                    finally {
                        predicate_strengthener.$strengthen_original_pred_awayP$.rebind(_prev_bind_0_$1, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)predicate_strengthener.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
            }
        }
        return new_proposals;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 2750L)
    public static SubLObject typed_pred_strengthen_formula(final SubLObject formula, final SubLObject domain_mt, SubLObject constraints) {
        if (constraints == predicate_strengthener.UNPROVIDED) {
            constraints = (SubLObject)predicate_strengthener.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)predicate_strengthener.NIL;
        final SubLObject _prev_bind_0 = predicate_strengthener.$pred_strengthener_fn$.currentBinding(thread);
        final SubLObject _prev_bind_2 = predicate_strengthener.$strengthen_original_pred_awayP$.currentBinding(thread);
        try {
            predicate_strengthener.$pred_strengthener_fn$.bind((SubLObject)predicate_strengthener.$sym4$STRENGTHEN_PREDICATE_W_TYPED_LINKS_ONLY, thread);
            predicate_strengthener.$strengthen_original_pred_awayP$.bind((SubLObject)predicate_strengthener.T, thread);
            result = pred_strengthen_formula(formula, domain_mt, constraints);
        }
        finally {
            predicate_strengthener.$strengthen_original_pred_awayP$.rebind(_prev_bind_2, thread);
            predicate_strengthener.$pred_strengthener_fn$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 3375L)
    public static SubLObject typed_pred_strengthen_formula_unambiguously(final SubLObject formula, final SubLObject domain_mt, SubLObject constraints) {
        if (constraints == predicate_strengthener.UNPROVIDED) {
            constraints = (SubLObject)predicate_strengthener.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)predicate_strengthener.NIL;
        final SubLObject _prev_bind_0 = predicate_strengthener.$max_pred_strengs$.currentBinding(thread);
        try {
            predicate_strengthener.$max_pred_strengs$.bind((SubLObject)predicate_strengthener.ONE_INTEGER, thread);
            result = typed_pred_strengthen_formula(formula, domain_mt, constraints);
        }
        finally {
            predicate_strengthener.$max_pred_strengs$.rebind(_prev_bind_0, thread);
        }
        if (predicate_strengthener.NIL == result) {
            result = (SubLObject)ConsesLow.list(formula);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 3704L)
    public static SubLObject formula_predicate_strengthen(final SubLObject formula, final SubLObject mt) {
        final SubLObject el_formula = predstren_expand_formula(formula, (SubLObject)predicate_strengthener.UNPROVIDED);
        final SubLObject constraint_sets = predstren_compute_constraints(el_formula, mt);
        final SubLObject predforms = predstren_collect_predicates(el_formula, mt);
        final SubLObject options = predstren_analyze_options(predforms, constraint_sets, mt);
        return options;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 4600L)
    public static SubLObject formula_predicate_strengthen_with_constraints(final SubLObject formula, final SubLObject mt, final SubLObject constraints) {
        SubLObject el_formula = predstren_expand_formula(formula, mt);
        SubLObject constraint_sets = (SubLObject)predicate_strengthener.NIL;
        SubLObject predforms = (SubLObject)predicate_strengthener.NIL;
        SubLObject options = (SubLObject)predicate_strengthener.NIL;
        el_formula = narts_high.nart_substitute(el_formula);
        if (predicate_strengthener.NIL != constraints) {
            el_formula = predstren_extend_formula_from_constraints(el_formula, constraints);
        }
        constraint_sets = predstren_compute_constraints(el_formula, mt);
        if (predicate_strengthener.NIL != constraints) {
            constraint_sets = predstren_extend_constraints_from_table(constraint_sets, constraints);
        }
        predforms = predstren_collect_predicates(el_formula, mt);
        options = predstren_analyze_options(predforms, constraint_sets, mt);
        return options;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 5803L)
    public static SubLObject strengthen_predicate_with_constraints(final SubLObject predicate, final SubLObject alist, final SubLObject mt, SubLObject strengthening_fn) {
        if (strengthening_fn == predicate_strengthener.UNPROVIDED) {
            strengthening_fn = predicate_strengthener.$pred_strengthener_fn$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)predicate_strengthener.NIL;
        if (predicate.eql(predicate_strengthener.$const5$isa) && predicate_strengthener.NIL != predicate_strengthener.$do_not_strengthen_isaP$.getDynamicValue(thread)) {
            return result;
        }
        if (predicate.eql(predicate_strengthener.$const6$is_Underspecified)) {
            result = predstren_handle_is_underspecified(predicate, alist, mt);
        }
        else {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                result = Functions.funcall(strengthening_fn, predicate, alist);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 6364L)
    public static SubLObject gather_subformula_pieces(final SubLObject sub_formula, final SubLObject formula) {
        return list_utilities.tree_find(sub_formula, formula, Symbols.symbol_function((SubLObject)predicate_strengthener.EQUALP), (SubLObject)predicate_strengthener.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 6499L)
    public static SubLObject expand_formula_with_stronger_predicates(final SubLObject formula, final SubLObject suggestions, SubLObject mt) {
        if (mt == predicate_strengthener.UNPROVIDED) {
            mt = (SubLObject)predicate_strengthener.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject input_formula = conses_high.copy_tree(formula);
        if (predicate_strengthener.NIL != cycl_utilities.expression_find_if((SubLObject)predicate_strengthener.$sym7$NART_P, input_formula, (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED)) {
            input_formula = narts_high.nart_expand(input_formula);
        }
        SubLObject work_stack = (SubLObject)ConsesLow.list(input_formula);
        SubLObject runs = (SubLObject)predicate_strengthener.ZERO_INTEGER;
        SubLObject cdolist_list_var = suggestions;
        SubLObject suggestion = (SubLObject)predicate_strengthener.NIL;
        suggestion = cdolist_list_var.first();
        while (predicate_strengthener.NIL != cdolist_list_var) {
            final SubLObject sub_formula = suggestion.first();
            SubLObject cdolist_list_var_$3;
            final SubLObject replacements = cdolist_list_var_$3 = suggestion.rest();
            SubLObject replacement = (SubLObject)predicate_strengthener.NIL;
            replacement = cdolist_list_var_$3.first();
            while (predicate_strengthener.NIL != cdolist_list_var_$3) {
                final SubLObject pred_direction = replacement.first();
                final SubLObject predicates = conses_high.second(replacement);
                SubLObject temp_stack = (SubLObject)predicate_strengthener.NIL;
                runs = Numbers.add(runs, (SubLObject)predicate_strengthener.ONE_INTEGER);
                SubLObject cdolist_list_var_$4 = work_stack;
                SubLObject formula_$5 = (SubLObject)predicate_strengthener.NIL;
                formula_$5 = cdolist_list_var_$4.first();
                while (predicate_strengthener.NIL != cdolist_list_var_$4) {
                    if (predicate_strengthener.NIL != gather_subformula_pieces(sub_formula, formula_$5)) {
                        SubLObject cdolist_list_var_$5 = predicates;
                        SubLObject predicate = (SubLObject)predicate_strengthener.NIL;
                        predicate = cdolist_list_var_$5.first();
                        while (predicate_strengthener.NIL != cdolist_list_var_$5) {
                            final SubLObject new_formula = predstren_substitute_stronger_predicates(predicate, pred_direction, sub_formula, formula_$5);
                            temp_stack = (SubLObject)ConsesLow.cons(new_formula, temp_stack);
                            cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                            predicate = cdolist_list_var_$5.first();
                        }
                    }
                    else {
                        SubLObject cdolist_list_var_$6;
                        final SubLObject expandable_subformulas = cdolist_list_var_$6 = predstren_get_expandable_subformulas(formula_$5, (SubLObject)predicate_strengthener.UNPROVIDED);
                        SubLObject expandable_subformula = (SubLObject)predicate_strengthener.NIL;
                        expandable_subformula = cdolist_list_var_$6.first();
                        while (predicate_strengthener.NIL != cdolist_list_var_$6) {
                            final SubLObject expanded_subformula = predstren_expand_formula(expandable_subformula, (SubLObject)predicate_strengthener.UNPROVIDED);
                            SubLObject new_sub_formula = (SubLObject)predicate_strengthener.NIL;
                            SubLObject new_literal = (SubLObject)predicate_strengthener.NIL;
                            SubLObject new_formula2 = (SubLObject)predicate_strengthener.NIL;
                            if (predicate_strengthener.NIL != gather_subformula_pieces(sub_formula, expanded_subformula)) {
                                SubLObject cdolist_list_var_$7 = predicates;
                                SubLObject predicate2 = (SubLObject)predicate_strengthener.NIL;
                                predicate2 = cdolist_list_var_$7.first();
                                while (predicate_strengthener.NIL != cdolist_list_var_$7) {
                                    new_sub_formula = predstren_substitute_stronger_predicates(predicate2, pred_direction, sub_formula, expanded_subformula);
                                    new_literal = predstren_contract_formula(new_sub_formula, mt);
                                    new_formula2 = cycl_utilities.formula_subst(new_literal, expandable_subformula, formula_$5, Symbols.symbol_function((SubLObject)predicate_strengthener.EQUALP), (SubLObject)predicate_strengthener.UNPROVIDED);
                                    temp_stack = (SubLObject)ConsesLow.cons(new_formula2, temp_stack);
                                    cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                                    predicate2 = cdolist_list_var_$7.first();
                                }
                            }
                            cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                            expandable_subformula = cdolist_list_var_$6.first();
                        }
                    }
                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                    formula_$5 = cdolist_list_var_$4.first();
                }
                if (predicate_strengthener.NIL != temp_stack && predicate_strengthener.NIL != predicate_strengthener.$strengthen_original_pred_awayP$.getDynamicValue(thread)) {
                    work_stack = (SubLObject)predicate_strengthener.NIL;
                }
                SubLObject cdolist_list_var_$8 = temp_stack;
                SubLObject newbe = (SubLObject)predicate_strengthener.NIL;
                newbe = cdolist_list_var_$8.first();
                while (predicate_strengthener.NIL != cdolist_list_var_$8) {
                    final SubLObject item_var = newbe;
                    if (predicate_strengthener.NIL == conses_high.member(item_var, work_stack, Symbols.symbol_function((SubLObject)predicate_strengthener.EQUALP), Symbols.symbol_function((SubLObject)predicate_strengthener.IDENTITY))) {
                        work_stack = (SubLObject)ConsesLow.cons(item_var, work_stack);
                    }
                    cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                    newbe = cdolist_list_var_$8.first();
                }
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                replacement = cdolist_list_var_$3.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            suggestion = cdolist_list_var.first();
        }
        SubLObject reformulated = (SubLObject)predicate_strengthener.NIL;
        SubLObject cdolist_list_var2 = work_stack;
        SubLObject formula_$6 = (SubLObject)predicate_strengthener.NIL;
        formula_$6 = cdolist_list_var2.first();
        while (predicate_strengthener.NIL != cdolist_list_var2) {
            final SubLObject new_formula3 = predstren_contract_formula(formula_$6, mt);
            if (predicate_strengthener.NIL != new_formula3) {
                final SubLObject item_var2 = new_formula3;
                if (predicate_strengthener.NIL == conses_high.member(item_var2, reformulated, Symbols.symbol_function((SubLObject)predicate_strengthener.EQUALP), Symbols.symbol_function((SubLObject)predicate_strengthener.IDENTITY))) {
                    reformulated = (SubLObject)ConsesLow.cons(item_var2, reformulated);
                }
            }
            else {
                Errors.warn((SubLObject)predicate_strengthener.$str8$PredStren__no_contracted_version_, formula_$6);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            formula_$6 = cdolist_list_var2.first();
        }
        work_stack = reformulated;
        if (predicate_strengthener.NIL == Numbers.oddp(runs)) {
            work_stack = Sequences.nreverse(work_stack);
        }
        return work_stack;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 9443L)
    public static SubLObject predstren_substitute_stronger_predicates(final SubLObject pred, final SubLObject direction, final SubLObject subformula, final SubLObject formula) {
        final SubLObject new_args = conses_high.copy_list(cycl_utilities.formula_args(subformula, (SubLObject)predicate_strengthener.UNPROVIDED));
        final SubLObject ordered_args = direction.eql(predicate_strengthener.$const9$genlInverse) ? Sequences.nreverse(new_args) : new_args;
        final SubLObject new_subformula = el_utilities.make_formula(pred, ordered_args, (SubLObject)predicate_strengthener.UNPROVIDED);
        SubLObject new_formula = (SubLObject)predicate_strengthener.NIL;
        new_formula = cycl_utilities.expression_subst(new_subformula, subformula, formula, Symbols.symbol_function((SubLObject)predicate_strengthener.EQUAL), (SubLObject)predicate_strengthener.UNPROVIDED);
        return new_formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 10040L)
    public static SubLObject predstren_get_rmp_subformulas(final SubLObject formula, SubLObject mt) {
        if (mt == predicate_strengthener.UNPROVIDED) {
            mt = (SubLObject)predicate_strengthener.$kw10$ANY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject found = (SubLObject)predicate_strengthener.NIL;
        if (mt == predicate_strengthener.$kw10$ANY) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)predicate_strengthener.$sym11$RELEVANT_MT_IS_ANY_MT, thread);
                mt_relevance_macros.$mt$.bind(predicate_strengthener.$const12$InferencePSC, thread);
                found = cycl_utilities.formula_gather(formula, (SubLObject)predicate_strengthener.$sym13$PREDSTREN_EXPANDIBLE_RMP_, (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                found = cycl_utilities.formula_gather(formula, (SubLObject)predicate_strengthener.$sym13$PREDSTREN_EXPANDIBLE_RMP_, (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_5, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
            }
        }
        return found;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 10456L)
    public static SubLObject predstren_get_expandable_subformulas(final SubLObject formula, SubLObject mt) {
        if (mt == predicate_strengthener.UNPROVIDED) {
            mt = (SubLObject)predicate_strengthener.$kw10$ANY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject found = (SubLObject)predicate_strengthener.NIL;
        if (mt == predicate_strengthener.$kw10$ANY) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)predicate_strengthener.$sym11$RELEVANT_MT_IS_ANY_MT, thread);
                mt_relevance_macros.$mt$.bind(predicate_strengthener.$const12$InferencePSC, thread);
                found = cycl_utilities.formula_gather(formula, (SubLObject)predicate_strengthener.$sym14$PREDSTREN_EXPANDIBLE_EXPRESSION_, (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                found = cycl_utilities.formula_gather(formula, (SubLObject)predicate_strengthener.$sym14$PREDSTREN_EXPANDIBLE_EXPRESSION_, (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_5, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
            }
        }
        return found;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 10811L)
    public static SubLObject predstren_expand_formula_internal(final SubLObject formula, SubLObject mt) {
        if (mt == predicate_strengthener.UNPROVIDED) {
            mt = (SubLObject)predicate_strengthener.$kw10$ANY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result;
        final SubLObject el_formula = result = cycl_utilities.hl_to_el(formula);
        SubLObject ignore_errors_tag = (SubLObject)predicate_strengthener.NIL;
        try {
            thread.throwStack.push(predicate_strengthener.$kw16$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)predicate_strengthener.$sym17$IGNORE_ERRORS_HANDLER), thread);
                try {
                    if (mt == predicate_strengthener.$kw10$ANY) {
                        final SubLObject _prev_bind_0_$11 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)predicate_strengthener.$sym11$RELEVANT_MT_IS_ANY_MT, thread);
                            mt_relevance_macros.$mt$.bind(predicate_strengthener.$const12$InferencePSC, thread);
                            result = cycl_utilities.expression_transform(el_formula, (SubLObject)predicate_strengthener.$sym14$PREDSTREN_EXPANDIBLE_EXPRESSION_, (SubLObject)predicate_strengthener.$sym18$PREDSTREN_EXPAND_ONE_STEP, (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED);
                        }
                        finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$11, thread);
                        }
                    }
                    else {
                        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                        final SubLObject _prev_bind_0_$12 = mt_relevance_macros.$mt$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            result = cycl_utilities.expression_transform(el_formula, (SubLObject)predicate_strengthener.$sym14$PREDSTREN_EXPANDIBLE_EXPRESSION_, (SubLObject)predicate_strengthener.$sym18$PREDSTREN_EXPAND_ONE_STEP, (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED);
                        }
                        finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_4, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_$12, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)predicate_strengthener.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)predicate_strengthener.$kw16$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return clausifier.standardize_sentence_variables(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 10811L)
    public static SubLObject predstren_expand_formula(final SubLObject formula, SubLObject mt) {
        if (mt == predicate_strengthener.UNPROVIDED) {
            mt = (SubLObject)predicate_strengthener.$kw10$ANY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)predicate_strengthener.NIL;
        if (predicate_strengthener.NIL == v_memoization_state) {
            return predstren_expand_formula_internal(formula, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)predicate_strengthener.$sym15$PREDSTREN_EXPAND_FORMULA, (SubLObject)predicate_strengthener.UNPROVIDED);
        if (predicate_strengthener.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)predicate_strengthener.$sym15$PREDSTREN_EXPAND_FORMULA, (SubLObject)predicate_strengthener.TWO_INTEGER, (SubLObject)predicate_strengthener.NIL, (SubLObject)predicate_strengthener.EQUAL, (SubLObject)predicate_strengthener.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)predicate_strengthener.$sym15$PREDSTREN_EXPAND_FORMULA, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(formula, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)predicate_strengthener.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)predicate_strengthener.NIL;
            collision = cdolist_list_var.first();
            while (predicate_strengthener.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (formula.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (predicate_strengthener.NIL != cached_args && predicate_strengthener.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(predstren_expand_formula_internal(formula, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(formula, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 11591L)
    public static SubLObject predstren_expandible_expressionP(final SubLObject formula) {
        return (SubLObject)SubLObjectFactory.makeBoolean(predicate_strengthener.NIL != predstren_expandible_rmpP(formula) || predicate_strengthener.NIL != predstren_expandible_srfP(formula));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 11744L)
    public static SubLObject predstren_expandible_rmpP(final SubLObject formula) {
        return (SubLObject)SubLObjectFactory.makeBoolean(predicate_strengthener.NIL != fort_types_interface.rule_macro_predicate_p(cycl_utilities.formula_operator(formula)) && predicate_strengthener.NIL != fort_types_interface.predicate_p(cycl_utilities.formula_arg1(formula, (SubLObject)predicate_strengthener.UNPROVIDED)) && predicate_strengthener.NIL != kb_mapping_utilities.some_pred_value(cycl_utilities.formula_operator(formula), predicate_strengthener.$const19$expansion, (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 11978L)
    public static SubLObject predstren_expandible_srfP(final SubLObject formula) {
        return (SubLObject)SubLObjectFactory.makeBoolean(predicate_strengthener.NIL != kb_accessors.subcollection_relation_function_expression_p(formula) && predicate_strengthener.NIL != kb_mapping_utilities.some_pred_value(cycl_utilities.nat_functor(formula), predicate_strengthener.$const19$expansion, (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 12160L)
    public static SubLObject predstren_expand_one_step(final SubLObject formula, SubLObject mt) {
        if (mt == predicate_strengthener.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return verbosifier.el_expansion_one_step(formula, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 12476L)
    public static SubLObject reformulator_rules_to_use() {
        if (predicate_strengthener.NIL == predicate_strengthener.$reformulator_rules_to_use$.getGlobalValue()) {
            initialize_reformulator_rules_to_use();
        }
        return predicate_strengthener.$reformulator_rules_to_use$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 12642L)
    public static SubLObject initialize_reformulator_rules_to_use() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)predicate_strengthener.$sym21$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(predicate_strengthener.$const22$EverythingPSC, thread);
            SubLObject cdolist_list_var;
            final SubLObject relevant_relations = cdolist_list_var = ConsesLow.append(isa.all_fort_instances(predicate_strengthener.$const23$SubcollectionRelationFunction, (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED), isa.all_fort_instances(predicate_strengthener.$const24$RuleMacroPredicate, (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED));
            SubLObject rel = (SubLObject)predicate_strengthener.NIL;
            rel = cdolist_list_var.first();
            while (predicate_strengthener.NIL != cdolist_list_var) {
                final SubLObject expansion = kb_mapping_utilities.fpred_value_gaf(rel, predicate_strengthener.$const19$expansion, (SubLObject)predicate_strengthener.ONE_INTEGER, (SubLObject)predicate_strengthener.$kw25$TRUE);
                if (predicate_strengthener.NIL != assertion_handles.assertion_p(expansion)) {
                    final SubLObject reformulator_rule = reformulator_datastructures.find_reformulator_rule_for_rule_assertion(expansion);
                    if (predicate_strengthener.NIL != reformulator_rule_unifier_datastructures.reformulator_rule_p(reformulator_rule)) {
                        predicate_strengthener.$reformulator_rules_to_use$.setGlobalValue((SubLObject)ConsesLow.cons(reformulator_rule, predicate_strengthener.$reformulator_rules_to_use$.getGlobalValue()));
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                rel = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return predicate_strengthener.$reformulator_rules_to_use$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 13658L)
    public static SubLObject reformulator_rules_to_ignore() {
        if (predicate_strengthener.NIL == predicate_strengthener.$reformulator_rules_to_ignore$.getGlobalValue()) {
            initialize_reformulator_rules_to_ignore();
        }
        return predicate_strengthener.$reformulator_rules_to_ignore$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 13836L)
    public static SubLObject initialize_reformulator_rules_to_ignore() {
        SubLObject cdolist_list_var;
        final SubLObject rr_assertion_cycl_mt_pairs = cdolist_list_var = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)predicate_strengthener.$list27, predicate_strengthener.$const28$IntermediateVocabularyMt));
        SubLObject rr_assertion_cycl_mt_pair = (SubLObject)predicate_strengthener.NIL;
        rr_assertion_cycl_mt_pair = cdolist_list_var.first();
        while (predicate_strengthener.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = rr_assertion_cycl_mt_pair;
            SubLObject cycl = (SubLObject)predicate_strengthener.NIL;
            SubLObject mt = (SubLObject)predicate_strengthener.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)predicate_strengthener.$list29);
            cycl = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)predicate_strengthener.$list29);
            mt = current.first();
            current = current.rest();
            if (predicate_strengthener.NIL == current) {
                final SubLObject rr_assertion = czer_meta.find_assertion_cycl(cycl, mt);
                if (predicate_strengthener.NIL != assertion_handles.assertion_p(rr_assertion)) {
                    predicate_strengthener.$reformulator_rules_to_ignore$.setGlobalValue((SubLObject)ConsesLow.cons(rr_assertion, predicate_strengthener.$reformulator_rules_to_ignore$.getGlobalValue()));
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)predicate_strengthener.$list29);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rr_assertion_cycl_mt_pair = cdolist_list_var.first();
        }
        return predicate_strengthener.$reformulator_rules_to_ignore$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 14826L)
    public static SubLObject predstren_contract_formula(final SubLObject formula, SubLObject mt) {
        if (mt == predicate_strengthener.UNPROVIDED) {
            mt = (SubLObject)predicate_strengthener.NIL;
        }
        return reformulator_hub.reformulate_cycl(formula, mt, (SubLObject)ConsesLow.listS((SubLObject)predicate_strengthener.$kw30$MAX_TIME, new SubLObject[] { predicate_strengthener.$int31$30, predicate_strengthener.$kw32$RECURSION_LIMIT, predicate_strengthener.TEN_INTEGER, predicate_strengthener.$kw33$FOCUS, predicate_strengthener.$const34$ReformulatorRuleUnifier, predicate_strengthener.$kw35$REFORMULATOR_RULES, reformulator_rules_to_use(), predicate_strengthener.$kw36$SKIP_ASSERTIONS, reformulator_rules_to_ignore(), predicate_strengthener.$list37 }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 16255L)
    public static SubLObject predstren_extend_formula_from_constraints(final SubLObject el_formula, final SubLObject constraints) {
        SubLObject new_el_formula = (SubLObject)predicate_strengthener.NIL;
        if (predicate_strengthener.NIL != constraints) {
            new_el_formula = (SubLObject)ConsesLow.cons(el_formula, new_el_formula);
            SubLObject cdolist_list_var = constraints;
            SubLObject constraint = (SubLObject)predicate_strengthener.NIL;
            constraint = cdolist_list_var.first();
            while (predicate_strengthener.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = constraint;
                SubLObject v_term = (SubLObject)predicate_strengthener.NIL;
                SubLObject isas = (SubLObject)predicate_strengthener.NIL;
                SubLObject v_genls = (SubLObject)predicate_strengthener.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)predicate_strengthener.$list38);
                v_term = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)predicate_strengthener.$list38);
                isas = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)predicate_strengthener.$list38);
                v_genls = current.first();
                current = current.rest();
                if (predicate_strengthener.NIL == current) {
                    SubLObject cdolist_list_var_$13 = isas;
                    SubLObject v_isa = (SubLObject)predicate_strengthener.NIL;
                    v_isa = cdolist_list_var_$13.first();
                    while (predicate_strengthener.NIL != cdolist_list_var_$13) {
                        new_el_formula = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(predicate_strengthener.$const5$isa, v_term, v_isa), new_el_formula);
                        cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                        v_isa = cdolist_list_var_$13.first();
                    }
                    SubLObject cdolist_list_var_$14 = v_genls;
                    SubLObject genl = (SubLObject)predicate_strengthener.NIL;
                    genl = cdolist_list_var_$14.first();
                    while (predicate_strengthener.NIL != cdolist_list_var_$14) {
                        new_el_formula = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(predicate_strengthener.$const39$genls, v_term, genl), new_el_formula);
                        cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                        genl = cdolist_list_var_$14.first();
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)predicate_strengthener.$list38);
                }
                cdolist_list_var = cdolist_list_var.rest();
                constraint = cdolist_list_var.first();
            }
            new_el_formula = (SubLObject)ConsesLow.cons(predicate_strengthener.$const40$and, new_el_formula);
            return new_el_formula;
        }
        return el_formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 16805L)
    public static SubLObject predstren_handle_is_underspecified(final SubLObject predicate, final SubLObject alist, final SubLObject mt) {
        return predstren_interpret_is(alist, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 17172L)
    public static SubLObject predstren_interpret_is(final SubLObject alist, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject arg1_isas = predstren_crack_alist(alist);
        final SubLObject arg1_genls = thread.secondMultipleValue();
        final SubLObject arg2_isas = thread.thirdMultipleValue();
        final SubLObject arg2_genls = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        SubLObject result = (SubLObject)predicate_strengthener.NIL;
        result = predstren_is_means_elementofP(arg1_isas, arg1_genls, arg2_isas, arg2_genls, mt);
        if (predicate_strengthener.NIL == result) {
            result = predstren_is_means_isaP(arg1_isas, arg1_genls, arg2_isas, arg2_genls, mt);
        }
        if (predicate_strengthener.NIL == result) {
            result = predstren_is_means_equalsP(arg1_isas, arg1_genls, arg2_isas, arg2_genls, mt);
        }
        if (predicate_strengthener.NIL != result) {
            result = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(predicate_strengthener.$const41$genlPreds, (SubLObject)ConsesLow.list(result)));
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 17848L)
    public static SubLObject predstren_crack_alist(final SubLObject alist) {
        final SubLObject arg1_constraints = conses_high.second(conses_high.assoc((SubLObject)predicate_strengthener.ONE_INTEGER, alist, (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED));
        final SubLObject arg2_constraints = conses_high.second(conses_high.assoc((SubLObject)predicate_strengthener.TWO_INTEGER, alist, (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED));
        final SubLObject arg1_isas = conses_high.assoc(predicate_strengthener.$const5$isa, arg1_constraints, (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED).rest();
        final SubLObject arg2_isas = conses_high.assoc(predicate_strengthener.$const5$isa, arg2_constraints, (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED).rest();
        final SubLObject arg1_genls = conses_high.assoc(predicate_strengthener.$const39$genls, arg1_constraints, (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED).rest();
        final SubLObject arg2_genls = conses_high.assoc(predicate_strengthener.$const39$genls, arg2_constraints, (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED).rest();
        return Values.values(arg1_isas, arg1_genls, arg2_isas, arg2_genls);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 18315L)
    public static SubLObject predstren_is_means_isaP(final SubLObject arg1_isas, final SubLObject arg1_genls, final SubLObject arg2_isas, final SubLObject arg2_genls, final SubLObject mt) {
        if (predicate_strengthener.NIL == arg1_isas || predicate_strengthener.NIL == arg2_genls) {
            return (SubLObject)predicate_strengthener.NIL;
        }
        SubLObject doneP = (SubLObject)predicate_strengthener.NIL;
        if (predicate_strengthener.NIL == doneP) {
            SubLObject csome_list_var = (SubLObject)predicate_strengthener.$list42;
            SubLObject v_class = (SubLObject)predicate_strengthener.NIL;
            v_class = csome_list_var.first();
            while (predicate_strengthener.NIL == doneP && predicate_strengthener.NIL != csome_list_var) {
                if (predicate_strengthener.NIL != genls.any_specP(v_class, arg1_isas, mt, (SubLObject)predicate_strengthener.UNPROVIDED) && predicate_strengthener.NIL != genls.any_specP(v_class, arg2_genls, mt, (SubLObject)predicate_strengthener.UNPROVIDED)) {
                    doneP = predicate_strengthener.$const5$isa;
                }
                csome_list_var = csome_list_var.rest();
                v_class = csome_list_var.first();
            }
        }
        return doneP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 18813L)
    public static SubLObject predstren_is_means_equalsP(final SubLObject arg1_isas, final SubLObject arg1_genls, final SubLObject arg2_isas, final SubLObject arg2_genls, final SubLObject mt) {
        if (predicate_strengthener.NIL == arg1_isas || predicate_strengthener.NIL == arg2_isas) {
            return (SubLObject)predicate_strengthener.NIL;
        }
        SubLObject doneP = (SubLObject)predicate_strengthener.NIL;
        if (predicate_strengthener.NIL == doneP) {
            SubLObject csome_list_var = (SubLObject)predicate_strengthener.$list42;
            SubLObject v_class = (SubLObject)predicate_strengthener.NIL;
            v_class = csome_list_var.first();
            while (predicate_strengthener.NIL == doneP && predicate_strengthener.NIL != csome_list_var) {
                if (predicate_strengthener.NIL != genls.any_specP(v_class, arg1_isas, mt, (SubLObject)predicate_strengthener.UNPROVIDED) && predicate_strengthener.NIL != genls.any_specP(v_class, arg2_isas, mt, (SubLObject)predicate_strengthener.UNPROVIDED)) {
                    doneP = predicate_strengthener.$const43$equals;
                }
                csome_list_var = csome_list_var.rest();
                v_class = csome_list_var.first();
            }
        }
        return doneP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 19263L)
    public static SubLObject predstren_is_means_elementofP(final SubLObject arg1_isas, final SubLObject arg1_genls, final SubLObject arg2_isas, final SubLObject arg2_genls, final SubLObject mt) {
        if (predicate_strengthener.NIL != genls.any_specP(predicate_strengthener.$const44$Set_Mathematical, arg2_isas, mt, (SubLObject)predicate_strengthener.UNPROVIDED)) {
            return predicate_strengthener.$const45$elementOf;
        }
        return (SubLObject)predicate_strengthener.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 19569L)
    public static SubLObject predstren_terms_tester(final SubLObject term_a, final SubLObject term_b, final SubLObject mt) {
        final SubLObject alist_a = constraint_from_fort_as_alist(term_a, mt);
        final SubLObject alist_b = constraint_from_fort_as_alist(term_b, mt);
        final SubLObject alist = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)predicate_strengthener.ONE_INTEGER, alist_a), (SubLObject)ConsesLow.list((SubLObject)predicate_strengthener.TWO_INTEGER, alist_b));
        return predstren_interpret_is(alist, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 19857L)
    public static SubLObject constraint_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_constraint(v_object, stream, (SubLObject)predicate_strengthener.ZERO_INTEGER);
        return (SubLObject)predicate_strengthener.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 19857L)
    public static SubLObject constraint_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $constraint_native.class) ? predicate_strengthener.T : predicate_strengthener.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 19857L)
    public static SubLObject constraint_variable(final SubLObject v_object) {
        assert predicate_strengthener.NIL != constraint_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 19857L)
    public static SubLObject constraint_isa_list(final SubLObject v_object) {
        assert predicate_strengthener.NIL != constraint_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 19857L)
    public static SubLObject constraint_genl_list(final SubLObject v_object) {
        assert predicate_strengthener.NIL != constraint_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 19857L)
    public static SubLObject _csetf_constraint_variable(final SubLObject v_object, final SubLObject value) {
        assert predicate_strengthener.NIL != constraint_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 19857L)
    public static SubLObject _csetf_constraint_isa_list(final SubLObject v_object, final SubLObject value) {
        assert predicate_strengthener.NIL != constraint_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 19857L)
    public static SubLObject _csetf_constraint_genl_list(final SubLObject v_object, final SubLObject value) {
        assert predicate_strengthener.NIL != constraint_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 19857L)
    public static SubLObject make_constraint(SubLObject arglist) {
        if (arglist == predicate_strengthener.UNPROVIDED) {
            arglist = (SubLObject)predicate_strengthener.NIL;
        }
        final SubLObject v_new = (SubLObject)new $constraint_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)predicate_strengthener.NIL, next = arglist; predicate_strengthener.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)predicate_strengthener.$kw61$VARIABLE)) {
                _csetf_constraint_variable(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)predicate_strengthener.$kw62$ISA_LIST)) {
                _csetf_constraint_isa_list(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)predicate_strengthener.$kw63$GENL_LIST)) {
                _csetf_constraint_genl_list(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)predicate_strengthener.$str64$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 19857L)
    public static SubLObject visit_defstruct_constraint(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)predicate_strengthener.$kw65$BEGIN, (SubLObject)predicate_strengthener.$sym66$MAKE_CONSTRAINT, (SubLObject)predicate_strengthener.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)predicate_strengthener.$kw67$SLOT, (SubLObject)predicate_strengthener.$kw61$VARIABLE, constraint_variable(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)predicate_strengthener.$kw67$SLOT, (SubLObject)predicate_strengthener.$kw62$ISA_LIST, constraint_isa_list(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)predicate_strengthener.$kw67$SLOT, (SubLObject)predicate_strengthener.$kw63$GENL_LIST, constraint_genl_list(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)predicate_strengthener.$kw68$END, (SubLObject)predicate_strengthener.$sym66$MAKE_CONSTRAINT, (SubLObject)predicate_strengthener.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 19857L)
    public static SubLObject visit_defstruct_object_constraint_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_constraint(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 20024L)
    public static SubLObject new_constraint(final SubLObject variable) {
        final SubLObject constraint = make_constraint((SubLObject)predicate_strengthener.UNPROVIDED);
        _csetf_constraint_variable(constraint, variable);
        return constraint;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 20188L)
    public static SubLObject invalid_constraintP(final SubLObject constraint) {
        return Types.sublisp_null(constraint_isa_list(constraint));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 20290L)
    public static SubLObject print_constraint(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        assert predicate_strengthener.NIL != constraint_p(v_object) : v_object;
        PrintLow.format(stream, (SubLObject)predicate_strengthener.$str70$__Constraint___A_isa___A_genl___A, new SubLObject[] { constraint_variable(v_object), constraint_isa_list(v_object), constraint_genl_list(v_object) });
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 20590L)
    public static SubLObject constraint_as_alist(final SubLObject constraint) {
        final SubLObject isa_list = constraint_isa_list(constraint);
        final SubLObject genl_list = constraint_genl_list(constraint);
        return convert_isa_and_genl_list_to_alist(isa_list, genl_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 20820L)
    public static SubLObject convert_isa_and_genl_list_to_alist(final SubLObject isa_list, final SubLObject genl_list) {
        SubLObject isa_list_result = (SubLObject)predicate_strengthener.NIL;
        if (predicate_strengthener.NIL != isa_list) {
            isa_list_result = (SubLObject)ConsesLow.cons(predicate_strengthener.$const5$isa, isa_list);
        }
        if (predicate_strengthener.NIL == genl_list && predicate_strengthener.NIL == isa_list_result) {
            return (SubLObject)predicate_strengthener.NIL;
        }
        if (predicate_strengthener.NIL == genl_list) {
            return (SubLObject)ConsesLow.list(isa_list_result);
        }
        return (SubLObject)ConsesLow.list(isa_list_result, (SubLObject)ConsesLow.cons(predicate_strengthener.$const39$genls, genl_list));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 21193L)
    public static SubLObject collection_subset_fn_nat_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(predicate_strengthener.NIL != cycl_grammar.cycl_nat_p(v_object) && cycl_utilities.nat_functor(v_object).eql(predicate_strengthener.$const71$CollectionSubsetFn));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 21337L)
    public static SubLObject collection_subset_fn_nart_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(predicate_strengthener.NIL != nart_handles.nart_p(v_object) && cycl_utilities.nat_functor(v_object).eql(predicate_strengthener.$const71$CollectionSubsetFn));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 21477L)
    public static SubLObject collection_subset_fn_naut_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(predicate_strengthener.NIL != narts_high.naut_p(v_object) && cycl_utilities.nat_functor(v_object).eql(predicate_strengthener.$const71$CollectionSubsetFn));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 21617L)
    public static SubLObject collection_subset_fn_nat_subset_formula(final SubLObject collection_subset_fn_nat) {
        final SubLObject subset = cycl_utilities.nat_arg2(collection_subset_fn_nat, (SubLObject)predicate_strengthener.UNPROVIDED);
        if (predicate_strengthener.NIL != el_utilities.el_formula_with_operator_p(subset, predicate_strengthener.$const72$TheSetOf)) {
            return cycl_utilities.nat_arg2(subset, (SubLObject)predicate_strengthener.UNPROVIDED);
        }
        return (SubLObject)predicate_strengthener.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 21859L)
    public static SubLObject predstren_get_inter_formula_variables_arg_constraints(final SubLObject el_formula, final SubLObject mt) {
        final SubLObject arg_constraint_formula = (predicate_strengthener.NIL != collection_subset_fn_nat_p(el_formula)) ? collection_subset_fn_nat_subset_formula(el_formula) : el_formula;
        SubLObject constraint_formula = at_var_types.inter_formula_variables_arg_constraints(arg_constraint_formula, mt, (SubLObject)predicate_strengthener.UNPROVIDED);
        final SubLObject collection_subset_fn_naut_subformulas = cycl_utilities.expression_gather(el_formula, (SubLObject)predicate_strengthener.$sym73$COLLECTION_SUBSET_FN_NAUT_P, (SubLObject)predicate_strengthener.T, Symbols.symbol_function((SubLObject)predicate_strengthener.EQUAL), (SubLObject)predicate_strengthener.$sym74$FORMULA_ARG2, (SubLObject)predicate_strengthener.UNPROVIDED);
        final SubLObject new_formula = predstren_expand_collection_subset_fn_narts(el_formula);
        SubLObject additional_constraints = (SubLObject)predicate_strengthener.NIL;
        if (!el_formula.equal(new_formula)) {
            constraint_formula = el_utilities.make_conjunction((SubLObject)ConsesLow.list(constraint_formula, at_var_types.inter_formula_variables_arg_constraints(new_formula, mt, (SubLObject)predicate_strengthener.UNPROVIDED)));
        }
        SubLObject cdolist_list_var = collection_subset_fn_naut_subformulas;
        SubLObject subformula = (SubLObject)predicate_strengthener.NIL;
        subformula = cdolist_list_var.first();
        while (predicate_strengthener.NIL != cdolist_list_var) {
            final SubLObject pred = cycl_utilities.formula_operator(subformula);
            final SubLObject arg1 = cycl_utilities.formula_arg1(subformula, (SubLObject)predicate_strengthener.UNPROVIDED);
            final SubLObject arg2 = cycl_utilities.formula_arg2(subformula, (SubLObject)predicate_strengthener.UNPROVIDED);
            if (predicate_strengthener.NIL != cycl_variables.el_varP(arg1) && pred.eql(predicate_strengthener.$const5$isa)) {
                SubLObject cdolist_list_var_$15;
                final SubLObject v_genls = cdolist_list_var_$15 = genls.min_genls(arg2, mt, (SubLObject)predicate_strengthener.UNPROVIDED);
                SubLObject genl = (SubLObject)predicate_strengthener.NIL;
                genl = cdolist_list_var_$15.first();
                while (predicate_strengthener.NIL != cdolist_list_var_$15) {
                    additional_constraints = (SubLObject)ConsesLow.cons(el_utilities.make_binary_formula(predicate_strengthener.$const5$isa, arg1, genl), additional_constraints);
                    cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                    genl = cdolist_list_var_$15.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            subformula = cdolist_list_var.first();
        }
        if (predicate_strengthener.NIL != additional_constraints) {
            constraint_formula = el_utilities.make_conjunction((SubLObject)ConsesLow.cons(constraint_formula, additional_constraints));
        }
        return constraint_formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 23595L)
    public static SubLObject predstren_expand_collection_subset_fn_narts_internal(final SubLObject formula) {
        return cycl_utilities.expression_transform(formula, (SubLObject)predicate_strengthener.$sym76$COLLECTION_SUBSET_FN_NART_P, (SubLObject)predicate_strengthener.$sym77$NART_EXPAND, (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 23595L)
    public static SubLObject predstren_expand_collection_subset_fn_narts(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)predicate_strengthener.NIL;
        if (predicate_strengthener.NIL == v_memoization_state) {
            return predstren_expand_collection_subset_fn_narts_internal(formula);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)predicate_strengthener.$sym75$PREDSTREN_EXPAND_COLLECTION_SUBSET_FN_NARTS, (SubLObject)predicate_strengthener.UNPROVIDED);
        if (predicate_strengthener.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)predicate_strengthener.$sym75$PREDSTREN_EXPAND_COLLECTION_SUBSET_FN_NARTS, (SubLObject)predicate_strengthener.ONE_INTEGER, (SubLObject)predicate_strengthener.NIL, (SubLObject)predicate_strengthener.EQUAL, (SubLObject)predicate_strengthener.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)predicate_strengthener.$sym75$PREDSTREN_EXPAND_COLLECTION_SUBSET_FN_NARTS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, formula, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(predstren_expand_collection_subset_fn_narts_internal(formula)));
            memoization_state.caching_state_put(caching_state, formula, results, (SubLObject)predicate_strengthener.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 23786L)
    public static SubLObject predstren_compute_constraints(final SubLObject el_formula, final SubLObject mt) {
        SubLObject constraints = predstren_get_inter_formula_variables_arg_constraints(el_formula, mt);
        SubLObject result = (SubLObject)predicate_strengthener.NIL;
        if (predicate_strengthener.NIL == constraints) {
            return (SubLObject)predicate_strengthener.NIL;
        }
        constraints = ConsesLow.append(constraints, predstren_get_typegenl_constraints(constraints));
        SubLObject cdolist_list_var = predstren_normalize_constraints(constraints);
        SubLObject v_set = (SubLObject)predicate_strengthener.NIL;
        v_set = cdolist_list_var.first();
        while (predicate_strengthener.NIL != cdolist_list_var) {
            final SubLObject new_constraint = predstren_restructure_constraints(v_set);
            if (predicate_strengthener.NIL != new_constraint) {
                result = (SubLObject)ConsesLow.cons(new_constraint, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_set = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 24413L)
    public static SubLObject predstren_get_typegenl_constraints(final SubLObject constraints) {
        if (!cycl_utilities.formula_operator(constraints).eql(predicate_strengthener.$const40$and)) {
            return (SubLObject)predicate_strengthener.NIL;
        }
        final SubLObject constraint_list = cycl_utilities.formula_args(constraints, (SubLObject)predicate_strengthener.UNPROVIDED);
        SubLObject genls_constraints = (SubLObject)predicate_strengthener.NIL;
        SubLObject cdolist_list_var = constraint_list;
        SubLObject constraint = (SubLObject)predicate_strengthener.NIL;
        constraint = cdolist_list_var.first();
        while (predicate_strengthener.NIL != cdolist_list_var) {
            if (predicate_strengthener.$const5$isa.eql(cycl_utilities.formula_operator(constraint))) {
                final SubLObject var = cycl_utilities.formula_arg1(constraint, (SubLObject)predicate_strengthener.UNPROVIDED);
                final SubLObject col = cycl_utilities.formula_arg2(constraint, (SubLObject)predicate_strengthener.UNPROVIDED);
                SubLObject isa_cols = genls.genls(col, (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED);
                SubLObject cdolist_list_var_$16;
                isa_cols = (cdolist_list_var_$16 = (SubLObject)ConsesLow.cons(col, isa_cols));
                SubLObject isa_col = (SubLObject)predicate_strengthener.NIL;
                isa_col = cdolist_list_var_$16.first();
                while (predicate_strengthener.NIL != cdolist_list_var_$16) {
                    final SubLObject type_genls = kb_mapping_utilities.pred_values(isa_col, predicate_strengthener.$const78$typeGenls, (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED);
                    if (predicate_strengthener.NIL != type_genls) {
                        SubLObject cdolist_list_var_$17 = type_genls;
                        SubLObject type_genl = (SubLObject)predicate_strengthener.NIL;
                        type_genl = cdolist_list_var_$17.first();
                        while (predicate_strengthener.NIL != cdolist_list_var_$17) {
                            final SubLObject item_var = (SubLObject)ConsesLow.list(predicate_strengthener.$const39$genls, var, type_genl);
                            if (predicate_strengthener.NIL == conses_high.member(item_var, genls_constraints, Symbols.symbol_function((SubLObject)predicate_strengthener.EQL), Symbols.symbol_function((SubLObject)predicate_strengthener.IDENTITY))) {
                                genls_constraints = (SubLObject)ConsesLow.cons(item_var, genls_constraints);
                            }
                            cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                            type_genl = cdolist_list_var_$17.first();
                        }
                    }
                    cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                    isa_col = cdolist_list_var_$16.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint = cdolist_list_var.first();
        }
        return genls_constraints;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 25166L)
    public static SubLObject predstren_normalize_constraints(SubLObject constraints) {
        if (predicate_strengthener.$const79$or.eql(constraints.first())) {
            constraints = constraints.rest();
        }
        if (!constraints.first().isList()) {
            constraints = (SubLObject)ConsesLow.list(constraints);
        }
        if (!predicate_strengthener.$const40$and.eql(constraints.first().first())) {
            constraints = (SubLObject)ConsesLow.list(constraints);
        }
        return constraints;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 25644L)
    public static SubLObject predstren_restructure_constraints(final SubLObject v_set) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject seen = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)predicate_strengthener.EQUALP), (SubLObject)predicate_strengthener.UNPROVIDED);
        SubLObject constraints = (SubLObject)predicate_strengthener.NIL;
        SubLObject result = (SubLObject)predicate_strengthener.NIL;
        predstren_cache_constraints(v_set, seen);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(seen)); predicate_strengthener.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (predicate_strengthener.NIL != invalid_constraintP(value)) {
                result = (SubLObject)predicate_strengthener.T;
            }
            else {
                constraints = (SubLObject)ConsesLow.cons(value, constraints);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return (SubLObject)((predicate_strengthener.NIL != result) ? predicate_strengthener.NIL : constraints);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 26092L)
    public static SubLObject predstren_cache_constraints(final SubLObject v_set, final SubLObject seen) {
        SubLObject cdolist_list_var = v_set;
        SubLObject constraint = (SubLObject)predicate_strengthener.NIL;
        constraint = cdolist_list_var.first();
        while (predicate_strengthener.NIL != cdolist_list_var) {
            if (!constraint.eql(predicate_strengthener.$const40$and)) {
                if (constraint.isList() && constraint.first().eql(predicate_strengthener.$const40$and)) {
                    predstren_cache_constraints(constraint.rest(), seen);
                }
                else if (predicate_strengthener.NIL != el_utilities.el_formula_p(constraint) && predicate_strengthener.NIL != el_utilities.formula_arityE(constraint, (SubLObject)predicate_strengthener.TWO_INTEGER, (SubLObject)predicate_strengthener.UNPROVIDED)) {
                    SubLObject current;
                    final SubLObject datum = current = constraint;
                    SubLObject functor = (SubLObject)predicate_strengthener.NIL;
                    SubLObject var = (SubLObject)predicate_strengthener.NIL;
                    SubLObject v_term = (SubLObject)predicate_strengthener.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)predicate_strengthener.$list80);
                    functor = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)predicate_strengthener.$list80);
                    var = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)predicate_strengthener.$list80);
                    v_term = current.first();
                    current = current.rest();
                    if (predicate_strengthener.NIL == current) {
                        if (predicate_strengthener.NIL != subl_promotions.memberP(v_term, (SubLObject)predicate_strengthener.$list81, (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED)) {
                            predstren_extend_constraint_cache(seen, functor, var, (SubLObject)predicate_strengthener.$kw82$EMPTY);
                        }
                        else {
                            predstren_extend_constraint_cache(seen, functor, var, v_term);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)predicate_strengthener.$list80);
                    }
                }
                else {
                    Errors.warn((SubLObject)predicate_strengthener.$str83$Non_binary_constraint_in_Predicat, constraint);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint = cdolist_list_var.first();
        }
        return seen;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 26771L)
    public static SubLObject predstren_extend_constraint_cache(final SubLObject v_cache, final SubLObject functor, final SubLObject var, final SubLObject constraint) {
        SubLObject old = dictionary.dictionary_lookup(v_cache, var, (SubLObject)predicate_strengthener.NIL);
        if (predicate_strengthener.NIL == old) {
            old = new_constraint(var);
        }
        if (!constraint.eql((SubLObject)predicate_strengthener.$kw82$EMPTY)) {
            if (functor.eql(predicate_strengthener.$const39$genls)) {
                SubLObject genl_list = constraint_genl_list(old);
                if (predicate_strengthener.NIL == conses_high.member(constraint, genl_list, Symbols.symbol_function((SubLObject)predicate_strengthener.EQUAL), Symbols.symbol_function((SubLObject)predicate_strengthener.IDENTITY))) {
                    genl_list = (SubLObject)ConsesLow.cons(constraint, genl_list);
                }
                _csetf_constraint_genl_list(old, genl_list);
            }
            else if (functor.eql(predicate_strengthener.$const5$isa)) {
                SubLObject isa_list = constraint_isa_list(old);
                if (predicate_strengthener.NIL == conses_high.member(constraint, isa_list, Symbols.symbol_function((SubLObject)predicate_strengthener.EQUAL), Symbols.symbol_function((SubLObject)predicate_strengthener.IDENTITY))) {
                    isa_list = (SubLObject)ConsesLow.cons(constraint, isa_list);
                }
                _csetf_constraint_isa_list(old, isa_list);
            }
        }
        dictionary.dictionary_enter(v_cache, var, old);
        return v_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 27449L)
    public static SubLObject predstren_collect_predicates(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject el_formula = predstren_expand_collection_subset_fn_narts(formula);
        SubLObject occurrences = (SubLObject)predicate_strengthener.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            occurrences = list_utilities.tree_find_all_nested_if((SubLObject)predicate_strengthener.$sym84$PREDSTREN_IDENTIFY_PREDICATE, el_formula, (SubLObject)predicate_strengthener.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return occurrences;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 27909L)
    public static SubLObject predstren_identify_predicate(final SubLObject item) {
        if (predicate_strengthener.NIL == el_utilities.el_formula_p(item)) {
            return (SubLObject)predicate_strengthener.NIL;
        }
        final SubLObject functor = cycl_utilities.formula_operator(item);
        return (SubLObject)SubLObjectFactory.makeBoolean(predicate_strengthener.NIL != fort_types_interface.predicateP(functor) && predicate_strengthener.NIL == subl_promotions.memberP(functor, predicate_strengthener.$predstren_common_uninteresting$.getGlobalValue(), (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED) && (predicate_strengthener.NIL != isa.isaP(functor, predicate_strengthener.$const86$UnderspecifiedPredicate, (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED) || predicate_strengthener.NIL != genl_predicates.some_spec_pred_or_inverseP(functor, (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 28286L)
    public static SubLObject predstren_analyze_options(final SubLObject predforms, SubLObject constraints, final SubLObject mt) {
        SubLObject replacements = (SubLObject)predicate_strengthener.NIL;
        if (predicate_strengthener.NIL == constraints) {
            constraints = (SubLObject)ConsesLow.list((SubLObject)predicate_strengthener.NIL);
        }
        SubLObject cdolist_list_var = predforms;
        SubLObject predform = (SubLObject)predicate_strengthener.NIL;
        predform = cdolist_list_var.first();
        while (predicate_strengthener.NIL != cdolist_list_var) {
            final SubLObject result = predstren_analyze_one_option(predform, constraints, mt);
            if (predicate_strengthener.NIL != result) {
                replacements = (SubLObject)ConsesLow.cons(narts_high.nart_expand((SubLObject)ConsesLow.cons(predform, result)), replacements);
            }
            cdolist_list_var = cdolist_list_var.rest();
            predform = cdolist_list_var.first();
        }
        return replacements;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 28842L)
    public static SubLObject predstren_analyze_one_option(final SubLObject predform, final SubLObject constraint_sets, final SubLObject mt) {
        SubLObject results = (SubLObject)predicate_strengthener.NIL;
        final SubLObject predicate = cycl_utilities.formula_operator(predform);
        final SubLObject v_arguments = cycl_utilities.formula_args(predform, (SubLObject)predicate_strengthener.UNPROVIDED);
        SubLObject cdolist_list_var = constraint_sets;
        SubLObject constraint_set = (SubLObject)predicate_strengthener.NIL;
        constraint_set = cdolist_list_var.first();
        while (predicate_strengthener.NIL != cdolist_list_var) {
            SubLObject alist = (SubLObject)predicate_strengthener.NIL;
            SubLObject preds = (SubLObject)predicate_strengthener.NIL;
            SubLObject list_var = (SubLObject)predicate_strengthener.NIL;
            SubLObject arg = (SubLObject)predicate_strengthener.NIL;
            SubLObject arg_index = (SubLObject)predicate_strengthener.NIL;
            list_var = v_arguments;
            arg = list_var.first();
            for (arg_index = (SubLObject)predicate_strengthener.ZERO_INTEGER; predicate_strengthener.NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), arg_index = Numbers.add((SubLObject)predicate_strengthener.ONE_INTEGER, arg_index)) {
                SubLObject arg_desc = (SubLObject)predicate_strengthener.NIL;
                if (predicate_strengthener.NIL != subl_promotions.memberP(arg, constraint_set, Symbols.symbol_function((SubLObject)predicate_strengthener.EQUALP), (SubLObject)predicate_strengthener.$sym55$CONSTRAINT_VARIABLE)) {
                    final SubLObject constraint = Sequences.find(arg, constraint_set, Symbols.symbol_function((SubLObject)predicate_strengthener.EQUALP), (SubLObject)predicate_strengthener.$sym55$CONSTRAINT_VARIABLE, (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED);
                    arg_desc = constraint_as_alist(constraint);
                }
                else if (predicate_strengthener.NIL != forts.fort_p(arg)) {
                    arg_desc = constraint_from_fort_as_alist(arg, mt);
                }
                else if (arg.isList()) {
                    arg_desc = constraint_from_listy_as_alist(arg, mt);
                }
                else {
                    arg_desc = constraint_from_object_as_alist(arg, mt);
                }
                alist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(Numbers.add(arg_index, (SubLObject)predicate_strengthener.ONE_INTEGER), arg_desc), alist);
            }
            SubLObject cdolist_list_var_$18;
            preds = (cdolist_list_var_$18 = strengthen_predicate_with_constraints(predicate, alist, mt, (SubLObject)predicate_strengthener.UNPROVIDED));
            SubLObject result_set = (SubLObject)predicate_strengthener.NIL;
            result_set = cdolist_list_var_$18.first();
            while (predicate_strengthener.NIL != cdolist_list_var_$18) {
                SubLObject current;
                final SubLObject datum = current = result_set;
                SubLObject how = (SubLObject)predicate_strengthener.NIL;
                SubLObject predicates = (SubLObject)predicate_strengthener.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)predicate_strengthener.$list87);
                how = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)predicate_strengthener.$list87);
                predicates = current.first();
                current = current.rest();
                if (predicate_strengthener.NIL == current) {
                    final SubLObject sorted = predstren_sort_by_arg_specs(predicates, mt);
                    results = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(how, sorted), results);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)predicate_strengthener.$list87);
                }
                cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                result_set = cdolist_list_var_$18.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint_set = cdolist_list_var.first();
        }
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 30177L)
    public static SubLObject predstren_sort_by_arg_specs(final SubLObject predicates, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = (SubLObject)predicate_strengthener.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            results = Sort.sort(predicates, (SubLObject)predicate_strengthener.$sym88$_, (SubLObject)predicate_strengthener.$sym89$RELATION_GENERALITY_ESTIMATE);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 30401L)
    public static SubLObject constraint_from_fort_as_alist(final SubLObject fort, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)predicate_strengthener.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject isa_list = isa.min_isa(fort, (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED);
            final SubLObject genl_list = genls.min_genls(fort, (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED);
            result = convert_isa_and_genl_list_to_alist(isa_list, genl_list);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 30815L)
    public static SubLObject constraint_from_listy_as_alist(final SubLObject listy, final SubLObject mt) {
        final SubLObject functor = cycl_utilities.formula_arg0(listy);
        SubLObject isa_list = (SubLObject)predicate_strengthener.NIL;
        SubLObject genl_list = (SubLObject)predicate_strengthener.NIL;
        if (predicate_strengthener.NIL != fort_types_interface.functionP(functor)) {
            isa_list = isa.min_isa(listy, mt, (SubLObject)predicate_strengthener.UNPROVIDED);
            genl_list = genls.min_genls(listy, mt, (SubLObject)predicate_strengthener.UNPROVIDED);
        }
        else if (predicate_strengthener.NIL != forts.fort_p(functor)) {
            isa_list = (SubLObject)predicate_strengthener.$list90;
            genl_list = (SubLObject)predicate_strengthener.NIL;
        }
        else {
            isa_list = min_isa_via_deffns(listy, mt);
            genl_list = (SubLObject)predicate_strengthener.NIL;
        }
        return convert_isa_and_genl_list_to_alist(isa_list, genl_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 31521L)
    public static SubLObject constraint_from_object_as_alist(final SubLObject v_object, final SubLObject mt) {
        final SubLObject isa_list = min_isa_via_deffns(v_object, mt);
        final SubLObject genl_list = (SubLObject)predicate_strengthener.NIL;
        return convert_isa_and_genl_list_to_alist(isa_list, genl_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 31729L)
    public static SubLObject min_isa_via_deffns(final SubLObject v_object, final SubLObject mt) {
        if (v_object.isString()) {
            return (SubLObject)ConsesLow.list(predicate_strengthener.$const91$SubLString);
        }
        if (v_object.isInteger()) {
            return (SubLObject)ConsesLow.list(v_object.isNegative() ? predicate_strengthener.$const92$NegativeInteger : predicate_strengthener.$const93$NonNegativeInteger);
        }
        if (v_object.isDouble()) {
            return (SubLObject)ConsesLow.list(predicate_strengthener.$const94$RealNumber);
        }
        if (v_object.isKeyword()) {
            return (SubLObject)ConsesLow.list(predicate_strengthener.$const95$SubLKeyword);
        }
        if (predicate_strengthener.NIL == v_object) {
            return (SubLObject)ConsesLow.list(predicate_strengthener.$const96$SubLListOrAtom);
        }
        if (v_object.isList()) {
            return (SubLObject)ConsesLow.list(predicate_strengthener.$const97$SubLList);
        }
        if (v_object.isAtom()) {
            return (SubLObject)ConsesLow.list(predicate_strengthener.$const98$SubLAtom);
        }
        return (SubLObject)ConsesLow.list(predicate_strengthener.$const99$Thing);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 32478L)
    public static SubLObject predstren_extend_constraints_from_table(final SubLObject constraint_sets, final SubLObject constraints) {
        if (predicate_strengthener.NIL == constraint_sets) {
            return (SubLObject)ConsesLow.list(predstren_augment_one_constraint_set((SubLObject)predicate_strengthener.NIL, constraints));
        }
        SubLObject new_constraint_sets = (SubLObject)predicate_strengthener.NIL;
        SubLObject cdolist_list_var = constraint_sets;
        SubLObject constraint_set = (SubLObject)predicate_strengthener.NIL;
        constraint_set = cdolist_list_var.first();
        while (predicate_strengthener.NIL != cdolist_list_var) {
            final SubLObject new_constraint_set = predstren_augment_one_constraint_set(constraint_set, constraints);
            new_constraint_sets = (SubLObject)ConsesLow.cons(new_constraint_set, new_constraint_sets);
            cdolist_list_var = cdolist_list_var.rest();
            constraint_set = cdolist_list_var.first();
        }
        return Sequences.nreverse(new_constraint_sets);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 33217L)
    public static SubLObject predstren_augment_one_constraint_set(final SubLObject constraint_set, final SubLObject constraints) {
        SubLObject new_constraint_set = (SubLObject)predicate_strengthener.NIL;
        SubLObject cdolist_list_var = constraints;
        SubLObject constraint = (SubLObject)predicate_strengthener.NIL;
        constraint = cdolist_list_var.first();
        while (predicate_strengthener.NIL != cdolist_list_var) {
            final SubLObject v_term = constraint.first();
            final SubLObject isas = conses_high.second(constraint);
            final SubLObject v_genls = conses_high.third(constraint);
            final SubLObject existing = Sequences.find(v_term, constraint_set, (SubLObject)predicate_strengthener.EQL, (SubLObject)predicate_strengthener.$sym55$CONSTRAINT_VARIABLE, (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED);
            if (predicate_strengthener.NIL != existing) {
                SubLObject old_isas = constraint_isa_list(existing);
                SubLObject old_genls = constraint_genl_list(existing);
                SubLObject cdolist_list_var_$19 = isas;
                SubLObject v_isa = (SubLObject)predicate_strengthener.NIL;
                v_isa = cdolist_list_var_$19.first();
                while (predicate_strengthener.NIL != cdolist_list_var_$19) {
                    final SubLObject item_var = v_isa;
                    if (predicate_strengthener.NIL == conses_high.member(item_var, old_isas, Symbols.symbol_function((SubLObject)predicate_strengthener.EQL), Symbols.symbol_function((SubLObject)predicate_strengthener.IDENTITY))) {
                        old_isas = (SubLObject)ConsesLow.cons(item_var, old_isas);
                    }
                    cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                    v_isa = cdolist_list_var_$19.first();
                }
                SubLObject cdolist_list_var_$20 = v_genls;
                SubLObject genl = (SubLObject)predicate_strengthener.NIL;
                genl = cdolist_list_var_$20.first();
                while (predicate_strengthener.NIL != cdolist_list_var_$20) {
                    final SubLObject item_var = genl;
                    if (predicate_strengthener.NIL == conses_high.member(item_var, old_genls, Symbols.symbol_function((SubLObject)predicate_strengthener.EQL), Symbols.symbol_function((SubLObject)predicate_strengthener.IDENTITY))) {
                        old_genls = (SubLObject)ConsesLow.cons(item_var, old_genls);
                    }
                    cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                    genl = cdolist_list_var_$20.first();
                }
                _csetf_constraint_isa_list(existing, old_isas);
                _csetf_constraint_genl_list(existing, old_genls);
            }
            else {
                final SubLObject new_one = new_constraint(v_term);
                _csetf_constraint_isa_list(new_one, isas);
                _csetf_constraint_genl_list(new_one, v_genls);
                new_constraint_set = (SubLObject)ConsesLow.cons(new_one, new_constraint_set);
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint = cdolist_list_var.first();
        }
        return ConsesLow.append(new_constraint_set, constraint_set);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 34320L)
    public static SubLObject strengthen_predicate_wXnew_pred_strengthener(final SubLObject pred, final SubLObject alist) {
        return strengthen_predicate_wXtyped_and_minimal_suggestions(pred, alist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 35335L)
    public static SubLObject push_pred_wXmarkingXtype(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject pred = (SubLObject)predicate_strengthener.NIL;
        SubLObject marking = (SubLObject)predicate_strengthener.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)predicate_strengthener.$list100);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)predicate_strengthener.$list100);
        marking = current.first();
        current = current.rest();
        final SubLObject pred_type = (SubLObject)(current.isCons() ? current.first() : predicate_strengthener.$kw101$TYPED);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)predicate_strengthener.$list100);
        current = current.rest();
        if (predicate_strengthener.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)predicate_strengthener.$list100);
            return (SubLObject)predicate_strengthener.NIL;
        }
        if (pred_type == predicate_strengthener.$kw101$TYPED) {
            return (SubLObject)ConsesLow.list((SubLObject)predicate_strengthener.$sym102$PCOND, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)predicate_strengthener.EQ, (SubLObject)ConsesLow.list((SubLObject)predicate_strengthener.$sym103$PRED_STRENG_MARKING_MODE, marking), (SubLObject)predicate_strengthener.$list104), (SubLObject)ConsesLow.listS((SubLObject)predicate_strengthener.$sym105$CPUSHNEW, pred, (SubLObject)predicate_strengthener.$list106)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)predicate_strengthener.EQ, (SubLObject)ConsesLow.list((SubLObject)predicate_strengthener.$sym103$PRED_STRENG_MARKING_MODE, marking), (SubLObject)predicate_strengthener.$list107), (SubLObject)ConsesLow.listS((SubLObject)predicate_strengthener.$sym105$CPUSHNEW, pred, (SubLObject)predicate_strengthener.$list108)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)predicate_strengthener.EQ, (SubLObject)ConsesLow.list((SubLObject)predicate_strengthener.$sym103$PRED_STRENG_MARKING_MODE, marking), (SubLObject)predicate_strengthener.$list109), (SubLObject)ConsesLow.listS((SubLObject)predicate_strengthener.$sym105$CPUSHNEW, pred, (SubLObject)predicate_strengthener.$list106), (SubLObject)ConsesLow.listS((SubLObject)predicate_strengthener.$sym105$CPUSHNEW, pred, (SubLObject)predicate_strengthener.$list108)));
        }
        return (SubLObject)ConsesLow.list((SubLObject)predicate_strengthener.$sym102$PCOND, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)predicate_strengthener.EQ, (SubLObject)ConsesLow.list((SubLObject)predicate_strengthener.$sym103$PRED_STRENG_MARKING_MODE, marking), (SubLObject)predicate_strengthener.$list104), (SubLObject)ConsesLow.listS((SubLObject)predicate_strengthener.$sym105$CPUSHNEW, pred, (SubLObject)predicate_strengthener.$list110)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)predicate_strengthener.EQ, (SubLObject)ConsesLow.list((SubLObject)predicate_strengthener.$sym103$PRED_STRENG_MARKING_MODE, marking), (SubLObject)predicate_strengthener.$list107), (SubLObject)ConsesLow.listS((SubLObject)predicate_strengthener.$sym105$CPUSHNEW, pred, (SubLObject)predicate_strengthener.$list111)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)predicate_strengthener.EQ, (SubLObject)ConsesLow.list((SubLObject)predicate_strengthener.$sym103$PRED_STRENG_MARKING_MODE, marking), (SubLObject)predicate_strengthener.$list109), (SubLObject)ConsesLow.listS((SubLObject)predicate_strengthener.$sym105$CPUSHNEW, pred, (SubLObject)predicate_strengthener.$list110), (SubLObject)ConsesLow.listS((SubLObject)predicate_strengthener.$sym105$CPUSHNEW, pred, (SubLObject)predicate_strengthener.$list111)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 36331L)
    public static SubLObject append_pred_wXmarking(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject pred = (SubLObject)predicate_strengthener.NIL;
        SubLObject marking = (SubLObject)predicate_strengthener.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)predicate_strengthener.$list112);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)predicate_strengthener.$list112);
        marking = current.first();
        current = current.rest();
        if (predicate_strengthener.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)predicate_strengthener.$sym102$PCOND, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)predicate_strengthener.EQ, (SubLObject)ConsesLow.list((SubLObject)predicate_strengthener.$sym103$PRED_STRENG_MARKING_MODE, marking), (SubLObject)predicate_strengthener.$list104), (SubLObject)ConsesLow.list((SubLObject)predicate_strengthener.$sym113$PUNLESS, (SubLObject)ConsesLow.listS((SubLObject)predicate_strengthener.$sym114$MEMBER_, pred, (SubLObject)predicate_strengthener.$list110), (SubLObject)ConsesLow.list((SubLObject)predicate_strengthener.$sym115$CSETQ, (SubLObject)predicate_strengthener.$sym116$_PS_SUGGESTED_PREDS_, (SubLObject)ConsesLow.listS((SubLObject)predicate_strengthener.$sym117$SNOC, pred, (SubLObject)predicate_strengthener.$list110)))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)predicate_strengthener.EQ, (SubLObject)ConsesLow.list((SubLObject)predicate_strengthener.$sym103$PRED_STRENG_MARKING_MODE, marking), (SubLObject)predicate_strengthener.$list107), (SubLObject)ConsesLow.list((SubLObject)predicate_strengthener.$sym113$PUNLESS, (SubLObject)ConsesLow.listS((SubLObject)predicate_strengthener.$sym114$MEMBER_, pred, (SubLObject)predicate_strengthener.$list111), (SubLObject)ConsesLow.list((SubLObject)predicate_strengthener.$sym115$CSETQ, (SubLObject)predicate_strengthener.$sym118$_PS_SUGGESTED_INVERSES_, (SubLObject)ConsesLow.listS((SubLObject)predicate_strengthener.$sym117$SNOC, pred, (SubLObject)predicate_strengthener.$list111)))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)predicate_strengthener.EQ, (SubLObject)ConsesLow.list((SubLObject)predicate_strengthener.$sym103$PRED_STRENG_MARKING_MODE, marking), (SubLObject)predicate_strengthener.$list109), (SubLObject)ConsesLow.list((SubLObject)predicate_strengthener.$sym113$PUNLESS, (SubLObject)ConsesLow.listS((SubLObject)predicate_strengthener.$sym114$MEMBER_, pred, (SubLObject)predicate_strengthener.$list111), (SubLObject)ConsesLow.list((SubLObject)predicate_strengthener.$sym115$CSETQ, (SubLObject)predicate_strengthener.$sym118$_PS_SUGGESTED_INVERSES_, (SubLObject)ConsesLow.listS((SubLObject)predicate_strengthener.$sym117$SNOC, pred, (SubLObject)predicate_strengthener.$list111))), (SubLObject)ConsesLow.list((SubLObject)predicate_strengthener.$sym113$PUNLESS, (SubLObject)ConsesLow.listS((SubLObject)predicate_strengthener.$sym114$MEMBER_, pred, (SubLObject)predicate_strengthener.$list110), (SubLObject)ConsesLow.list((SubLObject)predicate_strengthener.$sym115$CSETQ, (SubLObject)predicate_strengthener.$sym116$_PS_SUGGESTED_PREDS_, (SubLObject)ConsesLow.listS((SubLObject)predicate_strengthener.$sym117$SNOC, pred, (SubLObject)predicate_strengthener.$list110)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)predicate_strengthener.$list112);
        return (SubLObject)predicate_strengthener.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 37156L)
    public static SubLObject strengthen_predicate_wXtyped_and_minimal_suggestions(final SubLObject predicate, final SubLObject alist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)predicate_strengthener.NIL;
        SubLObject max_suggested_links = (SubLObject)predicate_strengthener.NIL;
        final SubLObject _prev_bind_0 = predicate_strengthener.$ps_typed_preds$.currentBinding(thread);
        final SubLObject _prev_bind_2 = predicate_strengthener.$ps_typed_inverses$.currentBinding(thread);
        final SubLObject _prev_bind_3 = predicate_strengthener.$ps_suggested_inverses$.currentBinding(thread);
        final SubLObject _prev_bind_4 = predicate_strengthener.$ps_suggested_preds$.currentBinding(thread);
        try {
            predicate_strengthener.$ps_typed_preds$.bind((SubLObject)predicate_strengthener.NIL, thread);
            predicate_strengthener.$ps_typed_inverses$.bind((SubLObject)predicate_strengthener.NIL, thread);
            predicate_strengthener.$ps_suggested_inverses$.bind((SubLObject)predicate_strengthener.NIL, thread);
            predicate_strengthener.$ps_suggested_preds$.bind((SubLObject)predicate_strengthener.NIL, thread);
            final SubLObject new_streng_dict = predicate_strengthener_internals.strengthened_preds(predicate, alist, (SubLObject)predicate_strengthener.UNPROVIDED);
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(new_streng_dict)); predicate_strengthener.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject pred = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject marking = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (!pred.eql(predicate)) {
                    if (predicate_strengthener_internals.pred_streng_marking_suggested_count(marking).eql((SubLObject)predicate_strengthener.ZERO_INTEGER)) {
                        if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue())) {
                            final SubLObject item_var = pred;
                            if (predicate_strengthener.NIL == conses_high.member(item_var, predicate_strengthener.$ps_typed_preds$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)predicate_strengthener.EQL), Symbols.symbol_function((SubLObject)predicate_strengthener.IDENTITY))) {
                                predicate_strengthener.$ps_typed_preds$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, predicate_strengthener.$ps_typed_preds$.getDynamicValue(thread)), thread);
                            }
                        }
                        else if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue())) {
                            final SubLObject item_var = pred;
                            if (predicate_strengthener.NIL == conses_high.member(item_var, predicate_strengthener.$ps_typed_inverses$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)predicate_strengthener.EQL), Symbols.symbol_function((SubLObject)predicate_strengthener.IDENTITY))) {
                                predicate_strengthener.$ps_typed_inverses$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, predicate_strengthener.$ps_typed_inverses$.getDynamicValue(thread)), thread);
                            }
                        }
                        else if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue())) {
                            SubLObject item_var = pred;
                            if (predicate_strengthener.NIL == conses_high.member(item_var, predicate_strengthener.$ps_typed_preds$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)predicate_strengthener.EQL), Symbols.symbol_function((SubLObject)predicate_strengthener.IDENTITY))) {
                                predicate_strengthener.$ps_typed_preds$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, predicate_strengthener.$ps_typed_preds$.getDynamicValue(thread)), thread);
                            }
                            item_var = pred;
                            if (predicate_strengthener.NIL == conses_high.member(item_var, predicate_strengthener.$ps_typed_inverses$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)predicate_strengthener.EQL), Symbols.symbol_function((SubLObject)predicate_strengthener.IDENTITY))) {
                                predicate_strengthener.$ps_typed_inverses$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, predicate_strengthener.$ps_typed_inverses$.getDynamicValue(thread)), thread);
                            }
                        }
                    }
                    else if (predicate_strengthener.NIL == max_suggested_links || predicate_strengthener_internals.pred_streng_marking_suggested_count(marking).numL(max_suggested_links)) {
                        predicate_strengthener.$ps_suggested_inverses$.setDynamicValue((SubLObject)predicate_strengthener.NIL, thread);
                        predicate_strengthener.$ps_suggested_preds$.setDynamicValue((SubLObject)predicate_strengthener.NIL, thread);
                        max_suggested_links = predicate_strengthener_internals.pred_streng_marking_suggested_count(marking);
                        if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue())) {
                            final SubLObject item_var = pred;
                            if (predicate_strengthener.NIL == conses_high.member(item_var, predicate_strengthener.$ps_suggested_preds$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)predicate_strengthener.EQL), Symbols.symbol_function((SubLObject)predicate_strengthener.IDENTITY))) {
                                predicate_strengthener.$ps_suggested_preds$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, predicate_strengthener.$ps_suggested_preds$.getDynamicValue(thread)), thread);
                            }
                        }
                        else if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue())) {
                            final SubLObject item_var = pred;
                            if (predicate_strengthener.NIL == conses_high.member(item_var, predicate_strengthener.$ps_suggested_inverses$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)predicate_strengthener.EQL), Symbols.symbol_function((SubLObject)predicate_strengthener.IDENTITY))) {
                                predicate_strengthener.$ps_suggested_inverses$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, predicate_strengthener.$ps_suggested_inverses$.getDynamicValue(thread)), thread);
                            }
                        }
                        else if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue())) {
                            SubLObject item_var = pred;
                            if (predicate_strengthener.NIL == conses_high.member(item_var, predicate_strengthener.$ps_suggested_preds$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)predicate_strengthener.EQL), Symbols.symbol_function((SubLObject)predicate_strengthener.IDENTITY))) {
                                predicate_strengthener.$ps_suggested_preds$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, predicate_strengthener.$ps_suggested_preds$.getDynamicValue(thread)), thread);
                            }
                            item_var = pred;
                            if (predicate_strengthener.NIL == conses_high.member(item_var, predicate_strengthener.$ps_suggested_inverses$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)predicate_strengthener.EQL), Symbols.symbol_function((SubLObject)predicate_strengthener.IDENTITY))) {
                                predicate_strengthener.$ps_suggested_inverses$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, predicate_strengthener.$ps_suggested_inverses$.getDynamicValue(thread)), thread);
                            }
                        }
                    }
                    else if (!predicate_strengthener_internals.pred_streng_marking_suggested_count(marking).numG(max_suggested_links)) {
                        if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue())) {
                            final SubLObject item_var = pred;
                            if (predicate_strengthener.NIL == conses_high.member(item_var, predicate_strengthener.$ps_suggested_preds$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)predicate_strengthener.EQL), Symbols.symbol_function((SubLObject)predicate_strengthener.IDENTITY))) {
                                predicate_strengthener.$ps_suggested_preds$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, predicate_strengthener.$ps_suggested_preds$.getDynamicValue(thread)), thread);
                            }
                        }
                        else if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue())) {
                            final SubLObject item_var = pred;
                            if (predicate_strengthener.NIL == conses_high.member(item_var, predicate_strengthener.$ps_suggested_inverses$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)predicate_strengthener.EQL), Symbols.symbol_function((SubLObject)predicate_strengthener.IDENTITY))) {
                                predicate_strengthener.$ps_suggested_inverses$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, predicate_strengthener.$ps_suggested_inverses$.getDynamicValue(thread)), thread);
                            }
                        }
                        else if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue())) {
                            SubLObject item_var = pred;
                            if (predicate_strengthener.NIL == conses_high.member(item_var, predicate_strengthener.$ps_suggested_preds$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)predicate_strengthener.EQL), Symbols.symbol_function((SubLObject)predicate_strengthener.IDENTITY))) {
                                predicate_strengthener.$ps_suggested_preds$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, predicate_strengthener.$ps_suggested_preds$.getDynamicValue(thread)), thread);
                            }
                            item_var = pred;
                            if (predicate_strengthener.NIL == conses_high.member(item_var, predicate_strengthener.$ps_suggested_inverses$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)predicate_strengthener.EQL), Symbols.symbol_function((SubLObject)predicate_strengthener.IDENTITY))) {
                                predicate_strengthener.$ps_suggested_inverses$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, predicate_strengthener.$ps_suggested_inverses$.getDynamicValue(thread)), thread);
                            }
                        }
                    }
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            if (predicate_strengthener.NIL != predicate_strengthener.$ps_typed_inverses$.getDynamicValue(thread) || predicate_strengthener.NIL != predicate_strengthener.$ps_suggested_inverses$.getDynamicValue(thread)) {
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(predicate_strengthener.$const9$genlInverse, Sequences.cconcatenate(predicate_strengthener.$ps_typed_inverses$.getDynamicValue(thread), predicate_strengthener.$ps_suggested_inverses$.getDynamicValue(thread))), result);
            }
            if (predicate_strengthener.NIL != predicate_strengthener.$ps_typed_preds$.getDynamicValue(thread) || predicate_strengthener.NIL != predicate_strengthener.$ps_suggested_preds$.getDynamicValue(thread)) {
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(predicate_strengthener.$const41$genlPreds, Sequences.cconcatenate(predicate_strengthener.$ps_typed_preds$.getDynamicValue(thread), predicate_strengthener.$ps_suggested_preds$.getDynamicValue(thread))), result);
            }
        }
        finally {
            predicate_strengthener.$ps_suggested_preds$.rebind(_prev_bind_4, thread);
            predicate_strengthener.$ps_suggested_inverses$.rebind(_prev_bind_3, thread);
            predicate_strengthener.$ps_typed_inverses$.rebind(_prev_bind_2, thread);
            predicate_strengthener.$ps_typed_preds$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 39027L)
    public static SubLObject strengthen_predicate_wXtyped_and_all_suggestions(final SubLObject predicate, final SubLObject alist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)predicate_strengthener.NIL;
        SubLObject max_suggested_links = (SubLObject)predicate_strengthener.NIL;
        final SubLObject _prev_bind_0 = predicate_strengthener.$ps_typed_preds$.currentBinding(thread);
        final SubLObject _prev_bind_2 = predicate_strengthener.$ps_typed_inverses$.currentBinding(thread);
        final SubLObject _prev_bind_3 = predicate_strengthener.$ps_suggested_inverses$.currentBinding(thread);
        final SubLObject _prev_bind_4 = predicate_strengthener.$ps_suggested_preds$.currentBinding(thread);
        try {
            predicate_strengthener.$ps_typed_preds$.bind((SubLObject)predicate_strengthener.NIL, thread);
            predicate_strengthener.$ps_typed_inverses$.bind((SubLObject)predicate_strengthener.NIL, thread);
            predicate_strengthener.$ps_suggested_inverses$.bind((SubLObject)predicate_strengthener.NIL, thread);
            predicate_strengthener.$ps_suggested_preds$.bind((SubLObject)predicate_strengthener.NIL, thread);
            final SubLObject new_streng_dict = predicate_strengthener_internals.strengthened_preds(predicate, alist, (SubLObject)predicate_strengthener.UNPROVIDED);
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(new_streng_dict)); predicate_strengthener.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject pred = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject marking = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (!pred.eql(predicate)) {
                    if (predicate_strengthener_internals.pred_streng_marking_suggested_count(marking).eql((SubLObject)predicate_strengthener.ZERO_INTEGER)) {
                        if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue())) {
                            final SubLObject item_var = pred;
                            if (predicate_strengthener.NIL == conses_high.member(item_var, predicate_strengthener.$ps_typed_preds$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)predicate_strengthener.EQL), Symbols.symbol_function((SubLObject)predicate_strengthener.IDENTITY))) {
                                predicate_strengthener.$ps_typed_preds$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, predicate_strengthener.$ps_typed_preds$.getDynamicValue(thread)), thread);
                            }
                        }
                        else if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue())) {
                            final SubLObject item_var = pred;
                            if (predicate_strengthener.NIL == conses_high.member(item_var, predicate_strengthener.$ps_typed_inverses$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)predicate_strengthener.EQL), Symbols.symbol_function((SubLObject)predicate_strengthener.IDENTITY))) {
                                predicate_strengthener.$ps_typed_inverses$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, predicate_strengthener.$ps_typed_inverses$.getDynamicValue(thread)), thread);
                            }
                        }
                        else if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue())) {
                            SubLObject item_var = pred;
                            if (predicate_strengthener.NIL == conses_high.member(item_var, predicate_strengthener.$ps_typed_preds$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)predicate_strengthener.EQL), Symbols.symbol_function((SubLObject)predicate_strengthener.IDENTITY))) {
                                predicate_strengthener.$ps_typed_preds$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, predicate_strengthener.$ps_typed_preds$.getDynamicValue(thread)), thread);
                            }
                            item_var = pred;
                            if (predicate_strengthener.NIL == conses_high.member(item_var, predicate_strengthener.$ps_typed_inverses$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)predicate_strengthener.EQL), Symbols.symbol_function((SubLObject)predicate_strengthener.IDENTITY))) {
                                predicate_strengthener.$ps_typed_inverses$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, predicate_strengthener.$ps_typed_inverses$.getDynamicValue(thread)), thread);
                            }
                        }
                    }
                    else if (predicate_strengthener.NIL == max_suggested_links || predicate_strengthener_internals.pred_streng_marking_suggested_count(marking).numL(max_suggested_links)) {
                        max_suggested_links = predicate_strengthener_internals.pred_streng_marking_suggested_count(marking);
                        if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue())) {
                            final SubLObject item_var = pred;
                            if (predicate_strengthener.NIL == conses_high.member(item_var, predicate_strengthener.$ps_suggested_preds$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)predicate_strengthener.EQL), Symbols.symbol_function((SubLObject)predicate_strengthener.IDENTITY))) {
                                predicate_strengthener.$ps_suggested_preds$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, predicate_strengthener.$ps_suggested_preds$.getDynamicValue(thread)), thread);
                            }
                        }
                        else if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue())) {
                            final SubLObject item_var = pred;
                            if (predicate_strengthener.NIL == conses_high.member(item_var, predicate_strengthener.$ps_suggested_inverses$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)predicate_strengthener.EQL), Symbols.symbol_function((SubLObject)predicate_strengthener.IDENTITY))) {
                                predicate_strengthener.$ps_suggested_inverses$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, predicate_strengthener.$ps_suggested_inverses$.getDynamicValue(thread)), thread);
                            }
                        }
                        else if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue())) {
                            SubLObject item_var = pred;
                            if (predicate_strengthener.NIL == conses_high.member(item_var, predicate_strengthener.$ps_suggested_preds$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)predicate_strengthener.EQL), Symbols.symbol_function((SubLObject)predicate_strengthener.IDENTITY))) {
                                predicate_strengthener.$ps_suggested_preds$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, predicate_strengthener.$ps_suggested_preds$.getDynamicValue(thread)), thread);
                            }
                            item_var = pred;
                            if (predicate_strengthener.NIL == conses_high.member(item_var, predicate_strengthener.$ps_suggested_inverses$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)predicate_strengthener.EQL), Symbols.symbol_function((SubLObject)predicate_strengthener.IDENTITY))) {
                                predicate_strengthener.$ps_suggested_inverses$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, predicate_strengthener.$ps_suggested_inverses$.getDynamicValue(thread)), thread);
                            }
                        }
                    }
                    else if (predicate_strengthener_internals.pred_streng_marking_suggested_count(marking).numG(max_suggested_links)) {
                        if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue())) {
                            if (predicate_strengthener.NIL == subl_promotions.memberP(pred, predicate_strengthener.$ps_suggested_preds$.getDynamicValue(thread), (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED)) {
                                predicate_strengthener.$ps_suggested_preds$.setDynamicValue(list_utilities.snoc(pred, predicate_strengthener.$ps_suggested_preds$.getDynamicValue(thread)), thread);
                            }
                        }
                        else if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue())) {
                            if (predicate_strengthener.NIL == subl_promotions.memberP(pred, predicate_strengthener.$ps_suggested_inverses$.getDynamicValue(thread), (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED)) {
                                predicate_strengthener.$ps_suggested_inverses$.setDynamicValue(list_utilities.snoc(pred, predicate_strengthener.$ps_suggested_inverses$.getDynamicValue(thread)), thread);
                            }
                        }
                        else if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue())) {
                            if (predicate_strengthener.NIL == subl_promotions.memberP(pred, predicate_strengthener.$ps_suggested_inverses$.getDynamicValue(thread), (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED)) {
                                predicate_strengthener.$ps_suggested_inverses$.setDynamicValue(list_utilities.snoc(pred, predicate_strengthener.$ps_suggested_inverses$.getDynamicValue(thread)), thread);
                            }
                            if (predicate_strengthener.NIL == subl_promotions.memberP(pred, predicate_strengthener.$ps_suggested_preds$.getDynamicValue(thread), (SubLObject)predicate_strengthener.UNPROVIDED, (SubLObject)predicate_strengthener.UNPROVIDED)) {
                                predicate_strengthener.$ps_suggested_preds$.setDynamicValue(list_utilities.snoc(pred, predicate_strengthener.$ps_suggested_preds$.getDynamicValue(thread)), thread);
                            }
                        }
                    }
                    else if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue())) {
                        final SubLObject item_var = pred;
                        if (predicate_strengthener.NIL == conses_high.member(item_var, predicate_strengthener.$ps_suggested_preds$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)predicate_strengthener.EQL), Symbols.symbol_function((SubLObject)predicate_strengthener.IDENTITY))) {
                            predicate_strengthener.$ps_suggested_preds$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, predicate_strengthener.$ps_suggested_preds$.getDynamicValue(thread)), thread);
                        }
                    }
                    else if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue())) {
                        final SubLObject item_var = pred;
                        if (predicate_strengthener.NIL == conses_high.member(item_var, predicate_strengthener.$ps_suggested_inverses$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)predicate_strengthener.EQL), Symbols.symbol_function((SubLObject)predicate_strengthener.IDENTITY))) {
                            predicate_strengthener.$ps_suggested_inverses$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, predicate_strengthener.$ps_suggested_inverses$.getDynamicValue(thread)), thread);
                        }
                    }
                    else if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue())) {
                        SubLObject item_var = pred;
                        if (predicate_strengthener.NIL == conses_high.member(item_var, predicate_strengthener.$ps_suggested_preds$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)predicate_strengthener.EQL), Symbols.symbol_function((SubLObject)predicate_strengthener.IDENTITY))) {
                            predicate_strengthener.$ps_suggested_preds$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, predicate_strengthener.$ps_suggested_preds$.getDynamicValue(thread)), thread);
                        }
                        item_var = pred;
                        if (predicate_strengthener.NIL == conses_high.member(item_var, predicate_strengthener.$ps_suggested_inverses$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)predicate_strengthener.EQL), Symbols.symbol_function((SubLObject)predicate_strengthener.IDENTITY))) {
                            predicate_strengthener.$ps_suggested_inverses$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, predicate_strengthener.$ps_suggested_inverses$.getDynamicValue(thread)), thread);
                        }
                    }
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            if (predicate_strengthener.NIL != predicate_strengthener.$ps_typed_inverses$.getDynamicValue(thread) || predicate_strengthener.NIL != predicate_strengthener.$ps_suggested_inverses$.getDynamicValue(thread)) {
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(predicate_strengthener.$const9$genlInverse, Sequences.cconcatenate(predicate_strengthener.$ps_typed_inverses$.getDynamicValue(thread), predicate_strengthener.$ps_suggested_inverses$.getDynamicValue(thread))), result);
            }
            if (predicate_strengthener.NIL != predicate_strengthener.$ps_typed_preds$.getDynamicValue(thread) || predicate_strengthener.NIL != predicate_strengthener.$ps_suggested_preds$.getDynamicValue(thread)) {
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(predicate_strengthener.$const41$genlPreds, Sequences.cconcatenate(predicate_strengthener.$ps_typed_preds$.getDynamicValue(thread), predicate_strengthener.$ps_suggested_preds$.getDynamicValue(thread))), result);
            }
        }
        finally {
            predicate_strengthener.$ps_suggested_preds$.rebind(_prev_bind_4, thread);
            predicate_strengthener.$ps_suggested_inverses$.rebind(_prev_bind_3, thread);
            predicate_strengthener.$ps_typed_inverses$.rebind(_prev_bind_2, thread);
            predicate_strengthener.$ps_typed_preds$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 40834L)
    public static SubLObject strengthen_predicate_wXtyped_links_only(final SubLObject predicate, final SubLObject alist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)predicate_strengthener.NIL;
        final SubLObject new_streng_dict = predicate_strengthener_internals.strengthened_preds(predicate, alist, (SubLObject)predicate_strengthener.NIL);
        final SubLObject _prev_bind_0 = predicate_strengthener.$ps_typed_inverses$.currentBinding(thread);
        final SubLObject _prev_bind_2 = predicate_strengthener.$ps_typed_preds$.currentBinding(thread);
        try {
            predicate_strengthener.$ps_typed_inverses$.bind((SubLObject)predicate_strengthener.NIL, thread);
            predicate_strengthener.$ps_typed_preds$.bind((SubLObject)predicate_strengthener.NIL, thread);
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(new_streng_dict)); predicate_strengthener.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject pred = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject marking = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (!pred.eql(predicate) && predicate_strengthener_internals.pred_streng_marking_suggested_count(marking).eql((SubLObject)predicate_strengthener.ZERO_INTEGER)) {
                    if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue())) {
                        final SubLObject item_var = pred;
                        if (predicate_strengthener.NIL == conses_high.member(item_var, predicate_strengthener.$ps_typed_preds$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)predicate_strengthener.EQL), Symbols.symbol_function((SubLObject)predicate_strengthener.IDENTITY))) {
                            predicate_strengthener.$ps_typed_preds$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, predicate_strengthener.$ps_typed_preds$.getDynamicValue(thread)), thread);
                        }
                    }
                    else if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue())) {
                        final SubLObject item_var = pred;
                        if (predicate_strengthener.NIL == conses_high.member(item_var, predicate_strengthener.$ps_typed_inverses$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)predicate_strengthener.EQL), Symbols.symbol_function((SubLObject)predicate_strengthener.IDENTITY))) {
                            predicate_strengthener.$ps_typed_inverses$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, predicate_strengthener.$ps_typed_inverses$.getDynamicValue(thread)), thread);
                        }
                    }
                    else if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue())) {
                        SubLObject item_var = pred;
                        if (predicate_strengthener.NIL == conses_high.member(item_var, predicate_strengthener.$ps_typed_preds$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)predicate_strengthener.EQL), Symbols.symbol_function((SubLObject)predicate_strengthener.IDENTITY))) {
                            predicate_strengthener.$ps_typed_preds$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, predicate_strengthener.$ps_typed_preds$.getDynamicValue(thread)), thread);
                        }
                        item_var = pred;
                        if (predicate_strengthener.NIL == conses_high.member(item_var, predicate_strengthener.$ps_typed_inverses$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)predicate_strengthener.EQL), Symbols.symbol_function((SubLObject)predicate_strengthener.IDENTITY))) {
                            predicate_strengthener.$ps_typed_inverses$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, predicate_strengthener.$ps_typed_inverses$.getDynamicValue(thread)), thread);
                        }
                    }
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            if (predicate_strengthener.NIL != predicate_strengthener.$ps_typed_inverses$.getDynamicValue(thread)) {
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(predicate_strengthener.$const9$genlInverse, predicate_strengthener.$ps_typed_inverses$.getDynamicValue(thread)), result);
            }
            if (predicate_strengthener.NIL != predicate_strengthener.$ps_typed_preds$.getDynamicValue(thread)) {
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(predicate_strengthener.$const41$genlPreds, predicate_strengthener.$ps_typed_preds$.getDynamicValue(thread)), result);
            }
        }
        finally {
            predicate_strengthener.$ps_typed_preds$.rebind(_prev_bind_2, thread);
            predicate_strengthener.$ps_typed_inverses$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 41801L)
    public static SubLObject passes_pred_strengthening_test(final SubLObject in_form, final SubLObject mt, final SubLObject out_forms) {
        final SubLObject strengthened_formulas = pred_strengthen_formula(in_form, mt, (SubLObject)predicate_strengthener.UNPROVIDED);
        if (predicate_strengthener.NIL == list_utilities.lengthE(strengthened_formulas, Sequences.length(out_forms), (SubLObject)predicate_strengthener.UNPROVIDED)) {
            return PrintLow.format((SubLObject)predicate_strengthener.NIL, (SubLObject)predicate_strengthener.$str119$Error_in_processing__A__result_co, new SubLObject[] { in_form, strengthened_formulas, out_forms });
        }
        SubLObject cdolist_list_var = strengthened_formulas;
        SubLObject strengthened_formula = (SubLObject)predicate_strengthener.NIL;
        strengthened_formula = cdolist_list_var.first();
        while (predicate_strengthener.NIL != cdolist_list_var) {
            if (predicate_strengthener.NIL == subl_promotions.memberP(strengthened_formula, out_forms, (SubLObject)predicate_strengthener.$sym120$EQUALS_EL_, (SubLObject)predicate_strengthener.UNPROVIDED)) {
                return PrintLow.format((SubLObject)predicate_strengthener.NIL, (SubLObject)predicate_strengthener.$str121$_A___not_found_in_expected_result, strengthened_formula, in_form);
            }
            cdolist_list_var = cdolist_list_var.rest();
            strengthened_formula = cdolist_list_var.first();
        }
        return (SubLObject)predicate_strengthener.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 41801L)
    public static SubLObject passes_narty_pred_strengthening_test(final SubLObject in_form, final SubLObject mt, final SubLObject out_forms) {
        final SubLObject strengthened_formulas = pred_strengthen_formula(narts_high.nart_substitute(in_form), mt, (SubLObject)predicate_strengthener.UNPROVIDED);
        if (predicate_strengthener.NIL == list_utilities.lengthE(strengthened_formulas, Sequences.length(out_forms), (SubLObject)predicate_strengthener.UNPROVIDED)) {
            return PrintLow.format((SubLObject)predicate_strengthener.NIL, (SubLObject)predicate_strengthener.$str119$Error_in_processing__A__result_co, new SubLObject[] { in_form, strengthened_formulas, out_forms });
        }
        SubLObject cdolist_list_var = strengthened_formulas;
        SubLObject strengthened_formula = (SubLObject)predicate_strengthener.NIL;
        strengthened_formula = cdolist_list_var.first();
        while (predicate_strengthener.NIL != cdolist_list_var) {
            if (predicate_strengthener.NIL == subl_promotions.memberP(strengthened_formula, out_forms, (SubLObject)predicate_strengthener.$sym120$EQUALS_EL_, (SubLObject)predicate_strengthener.UNPROVIDED)) {
                return PrintLow.format((SubLObject)predicate_strengthener.NIL, (SubLObject)predicate_strengthener.$str121$_A___not_found_in_expected_result, strengthened_formula, in_form);
            }
            cdolist_list_var = cdolist_list_var.rest();
            strengthened_formula = cdolist_list_var.first();
        }
        return (SubLObject)predicate_strengthener.T;
    }
    
    public static SubLObject declare_predicate_strengthener_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "max_pred_strengs", "MAX-PRED-STRENGS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "skip_pred_strengthening_for_formulaP", "SKIP-PRED-STRENGTHENING-FOR-FORMULA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "pred_strengthen_formula", "PRED-STRENGTHEN-FORMULA", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "typed_pred_strengthen_formula", "TYPED-PRED-STRENGTHEN-FORMULA", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "typed_pred_strengthen_formula_unambiguously", "TYPED-PRED-STRENGTHEN-FORMULA-UNAMBIGUOUSLY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "formula_predicate_strengthen", "FORMULA-PREDICATE-STRENGTHEN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "formula_predicate_strengthen_with_constraints", "FORMULA-PREDICATE-STRENGTHEN-WITH-CONSTRAINTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "strengthen_predicate_with_constraints", "STRENGTHEN-PREDICATE-WITH-CONSTRAINTS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "gather_subformula_pieces", "GATHER-SUBFORMULA-PIECES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "expand_formula_with_stronger_predicates", "EXPAND-FORMULA-WITH-STRONGER-PREDICATES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "predstren_substitute_stronger_predicates", "PREDSTREN-SUBSTITUTE-STRONGER-PREDICATES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "predstren_get_rmp_subformulas", "PREDSTREN-GET-RMP-SUBFORMULAS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "predstren_get_expandable_subformulas", "PREDSTREN-GET-EXPANDABLE-SUBFORMULAS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "predstren_expand_formula_internal", "PREDSTREN-EXPAND-FORMULA-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "predstren_expand_formula", "PREDSTREN-EXPAND-FORMULA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "predstren_expandible_expressionP", "PREDSTREN-EXPANDIBLE-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "predstren_expandible_rmpP", "PREDSTREN-EXPANDIBLE-RMP?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "predstren_expandible_srfP", "PREDSTREN-EXPANDIBLE-SRF?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "predstren_expand_one_step", "PREDSTREN-EXPAND-ONE-STEP", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "reformulator_rules_to_use", "REFORMULATOR-RULES-TO-USE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "initialize_reformulator_rules_to_use", "INITIALIZE-REFORMULATOR-RULES-TO-USE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "reformulator_rules_to_ignore", "REFORMULATOR-RULES-TO-IGNORE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "initialize_reformulator_rules_to_ignore", "INITIALIZE-REFORMULATOR-RULES-TO-IGNORE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "predstren_contract_formula", "PREDSTREN-CONTRACT-FORMULA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "predstren_extend_formula_from_constraints", "PREDSTREN-EXTEND-FORMULA-FROM-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "predstren_handle_is_underspecified", "PREDSTREN-HANDLE-IS-UNDERSPECIFIED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "predstren_interpret_is", "PREDSTREN-INTERPRET-IS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "predstren_crack_alist", "PREDSTREN-CRACK-ALIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "predstren_is_means_isaP", "PREDSTREN-IS-MEANS-ISA?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "predstren_is_means_equalsP", "PREDSTREN-IS-MEANS-EQUALS?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "predstren_is_means_elementofP", "PREDSTREN-IS-MEANS-ELEMENTOF?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "predstren_terms_tester", "PREDSTREN-TERMS-TESTER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "constraint_print_function_trampoline", "CONSTRAINT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "constraint_p", "CONSTRAINT-P", 1, 0, false);
        new $constraint_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "constraint_variable", "CONSTRAINT-VARIABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "constraint_isa_list", "CONSTRAINT-ISA-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "constraint_genl_list", "CONSTRAINT-GENL-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "_csetf_constraint_variable", "_CSETF-CONSTRAINT-VARIABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "_csetf_constraint_isa_list", "_CSETF-CONSTRAINT-ISA-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "_csetf_constraint_genl_list", "_CSETF-CONSTRAINT-GENL-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "make_constraint", "MAKE-CONSTRAINT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "visit_defstruct_constraint", "VISIT-DEFSTRUCT-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "visit_defstruct_object_constraint_method", "VISIT-DEFSTRUCT-OBJECT-CONSTRAINT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "new_constraint", "NEW-CONSTRAINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "invalid_constraintP", "INVALID-CONSTRAINT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "print_constraint", "PRINT-CONSTRAINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "constraint_as_alist", "CONSTRAINT-AS-ALIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "convert_isa_and_genl_list_to_alist", "CONVERT-ISA-AND-GENL-LIST-TO-ALIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "collection_subset_fn_nat_p", "COLLECTION-SUBSET-FN-NAT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "collection_subset_fn_nart_p", "COLLECTION-SUBSET-FN-NART-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "collection_subset_fn_naut_p", "COLLECTION-SUBSET-FN-NAUT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "collection_subset_fn_nat_subset_formula", "COLLECTION-SUBSET-FN-NAT-SUBSET-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "predstren_get_inter_formula_variables_arg_constraints", "PREDSTREN-GET-INTER-FORMULA-VARIABLES-ARG-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "predstren_expand_collection_subset_fn_narts_internal", "PREDSTREN-EXPAND-COLLECTION-SUBSET-FN-NARTS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "predstren_expand_collection_subset_fn_narts", "PREDSTREN-EXPAND-COLLECTION-SUBSET-FN-NARTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "predstren_compute_constraints", "PREDSTREN-COMPUTE-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "predstren_get_typegenl_constraints", "PREDSTREN-GET-TYPEGENL-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "predstren_normalize_constraints", "PREDSTREN-NORMALIZE-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "predstren_restructure_constraints", "PREDSTREN-RESTRUCTURE-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "predstren_cache_constraints", "PREDSTREN-CACHE-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "predstren_extend_constraint_cache", "PREDSTREN-EXTEND-CONSTRAINT-CACHE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "predstren_collect_predicates", "PREDSTREN-COLLECT-PREDICATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "predstren_identify_predicate", "PREDSTREN-IDENTIFY-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "predstren_analyze_options", "PREDSTREN-ANALYZE-OPTIONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "predstren_analyze_one_option", "PREDSTREN-ANALYZE-ONE-OPTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "predstren_sort_by_arg_specs", "PREDSTREN-SORT-BY-ARG-SPECS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "constraint_from_fort_as_alist", "CONSTRAINT-FROM-FORT-AS-ALIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "constraint_from_listy_as_alist", "CONSTRAINT-FROM-LISTY-AS-ALIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "constraint_from_object_as_alist", "CONSTRAINT-FROM-OBJECT-AS-ALIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "min_isa_via_deffns", "MIN-ISA-VIA-DEFFNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "predstren_extend_constraints_from_table", "PREDSTREN-EXTEND-CONSTRAINTS-FROM-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "predstren_augment_one_constraint_set", "PREDSTREN-AUGMENT-ONE-CONSTRAINT-SET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "strengthen_predicate_wXnew_pred_strengthener", "STRENGTHEN-PREDICATE-W/NEW-PRED-STRENGTHENER", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.predicate_strengthener", "push_pred_wXmarkingXtype", "PUSH-PRED-W/MARKING&TYPE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.predicate_strengthener", "append_pred_wXmarking", "APPEND-PRED-W/MARKING");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "strengthen_predicate_wXtyped_and_minimal_suggestions", "STRENGTHEN-PREDICATE-W/TYPED-AND-MINIMAL-SUGGESTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "strengthen_predicate_wXtyped_and_all_suggestions", "STRENGTHEN-PREDICATE-W/TYPED-AND-ALL-SUGGESTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "strengthen_predicate_wXtyped_links_only", "STRENGTHEN-PREDICATE-W/TYPED-LINKS-ONLY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "passes_pred_strengthening_test", "PASSES-PRED-STRENGTHENING-TEST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.predicate_strengthener", "passes_narty_pred_strengthening_test", "PASSES-NARTY-PRED-STRENGTHENING-TEST", 3, 0, false);
        return (SubLObject)predicate_strengthener.NIL;
    }
    
    public static SubLObject init_predicate_strengthener_file() {
        predicate_strengthener.$strengthen_original_pred_awayP$ = SubLFiles.defparameter("*STRENGTHEN-ORIGINAL-PRED-AWAY?*", (SubLObject)predicate_strengthener.NIL);
        predicate_strengthener.$pred_strengthen_stop_at_first_specified_pred$ = SubLFiles.defparameter("*PRED-STRENGTHEN-STOP-AT-FIRST-SPECIFIED-PRED*", (SubLObject)predicate_strengthener.NIL);
        predicate_strengthener.$pred_strengthening_max_literal_count$ = SubLFiles.defparameter("*PRED-STRENGTHENING-MAX-LITERAL-COUNT*", (SubLObject)predicate_strengthener.$kw0$POSITIVE_INFINITY);
        predicate_strengthener.$max_pred_strengs$ = SubLFiles.defparameter("*MAX-PRED-STRENGS*", (SubLObject)predicate_strengthener.NIL);
        predicate_strengthener.$pred_strengthener_fn$ = SubLFiles.defparameter("*PRED-STRENGTHENER-FN*", (SubLObject)predicate_strengthener.$sym3$STRENGTHEN_PREDICATE_W_TYPED_AND_MINIMAL_SUGGESTIONS);
        predicate_strengthener.$do_not_strengthen_isaP$ = SubLFiles.defparameter("*DO-NOT-STRENGTHEN-ISA?*", (SubLObject)predicate_strengthener.T);
        predicate_strengthener.$reformulator_rules_to_use$ = SubLFiles.deflexical("*REFORMULATOR-RULES-TO-USE*", (SubLObject)(maybeDefault((SubLObject)predicate_strengthener.$sym20$_REFORMULATOR_RULES_TO_USE_, predicate_strengthener.$reformulator_rules_to_use$, predicate_strengthener.NIL)));
        predicate_strengthener.$reformulator_rules_to_ignore$ = SubLFiles.deflexical("*REFORMULATOR-RULES-TO-IGNORE*", (SubLObject)(maybeDefault((SubLObject)predicate_strengthener.$sym26$_REFORMULATOR_RULES_TO_IGNORE_, predicate_strengthener.$reformulator_rules_to_ignore$, predicate_strengthener.NIL)));
        predicate_strengthener.$dtp_constraint$ = SubLFiles.defconstant("*DTP-CONSTRAINT*", (SubLObject)predicate_strengthener.$sym46$CONSTRAINT);
        predicate_strengthener.$predstren_common_uninteresting$ = SubLFiles.deflexical("*PREDSTREN-COMMON-UNINTERESTING*", (SubLObject)predicate_strengthener.$list85);
        predicate_strengthener.$ps_suggested_inverses$ = SubLFiles.defvar("*PS-SUGGESTED-INVERSES*", (SubLObject)predicate_strengthener.NIL);
        predicate_strengthener.$ps_suggested_preds$ = SubLFiles.defvar("*PS-SUGGESTED-PREDS*", (SubLObject)predicate_strengthener.NIL);
        predicate_strengthener.$ps_typed_inverses$ = SubLFiles.defvar("*PS-TYPED-INVERSES*", (SubLObject)predicate_strengthener.NIL);
        predicate_strengthener.$ps_typed_preds$ = SubLFiles.defvar("*PS-TYPED-PREDS*", (SubLObject)predicate_strengthener.NIL);
        return (SubLObject)predicate_strengthener.NIL;
    }
    
    public static SubLObject setup_predicate_strengthener_file() {
        memoization_state.note_memoized_function((SubLObject)predicate_strengthener.$sym15$PREDSTREN_EXPAND_FORMULA);
        subl_macro_promotions.declare_defglobal((SubLObject)predicate_strengthener.$sym20$_REFORMULATOR_RULES_TO_USE_);
        subl_macro_promotions.declare_defglobal((SubLObject)predicate_strengthener.$sym26$_REFORMULATOR_RULES_TO_IGNORE_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), predicate_strengthener.$dtp_constraint$.getGlobalValue(), Symbols.symbol_function((SubLObject)predicate_strengthener.$sym53$CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)predicate_strengthener.$list54);
        Structures.def_csetf((SubLObject)predicate_strengthener.$sym55$CONSTRAINT_VARIABLE, (SubLObject)predicate_strengthener.$sym56$_CSETF_CONSTRAINT_VARIABLE);
        Structures.def_csetf((SubLObject)predicate_strengthener.$sym57$CONSTRAINT_ISA_LIST, (SubLObject)predicate_strengthener.$sym58$_CSETF_CONSTRAINT_ISA_LIST);
        Structures.def_csetf((SubLObject)predicate_strengthener.$sym59$CONSTRAINT_GENL_LIST, (SubLObject)predicate_strengthener.$sym60$_CSETF_CONSTRAINT_GENL_LIST);
        Equality.identity((SubLObject)predicate_strengthener.$sym46$CONSTRAINT);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), predicate_strengthener.$dtp_constraint$.getGlobalValue(), Symbols.symbol_function((SubLObject)predicate_strengthener.$sym69$VISIT_DEFSTRUCT_OBJECT_CONSTRAINT_METHOD));
        memoization_state.note_memoized_function((SubLObject)predicate_strengthener.$sym75$PREDSTREN_EXPAND_COLLECTION_SUBSET_FN_NARTS);
        generic_testing.define_test_case_table_int((SubLObject)predicate_strengthener.$sym122$PASSES_PRED_STRENGTHENING_TEST, (SubLObject)ConsesLow.list(new SubLObject[] { predicate_strengthener.$kw123$TEST, predicate_strengthener.NIL, predicate_strengthener.$kw124$OWNER, predicate_strengthener.NIL, predicate_strengthener.$kw125$CLASSES, predicate_strengthener.NIL, predicate_strengthener.$kw126$KB, predicate_strengthener.$kw127$FULL, predicate_strengthener.$kw128$WORKING_, predicate_strengthener.NIL }), predicate_strengthener.$list129);
        generic_testing.define_test_case_table_int((SubLObject)predicate_strengthener.$sym130$PASSES_NARTY_PRED_STRENGTHENING_TEST, (SubLObject)ConsesLow.list(new SubLObject[] { predicate_strengthener.$kw123$TEST, predicate_strengthener.NIL, predicate_strengthener.$kw124$OWNER, predicate_strengthener.NIL, predicate_strengthener.$kw125$CLASSES, predicate_strengthener.NIL, predicate_strengthener.$kw126$KB, predicate_strengthener.$kw127$FULL, predicate_strengthener.$kw128$WORKING_, predicate_strengthener.T }), (SubLObject)predicate_strengthener.$list131);
        return (SubLObject)predicate_strengthener.NIL;
    }
    
    private static SubLObject _constant_129_initializer() {
        return (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Angola")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Country"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("in-UnderspecifiedContainer")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Angola")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SouthWesternRegionFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ContinentOfAfrica"))))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RKFParsingMt")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Angola")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Country"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("inRegion")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Angola")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SouthWesternRegionFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ContinentOfAfrica"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Angola")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Country"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectFoundInLocation")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Angola")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SouthWesternRegionFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ContinentOfAfrica"))))))), (SubLObject)predicate_strengthener.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceExists")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("possessiveRelation")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Lenat")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhDDegree"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RKFParsingMt")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceExists")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasIssuedTo")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Lenat")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhDDegree"))))), (SubLObject)predicate_strengthener.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationExistsInstance")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("in-UnderspecifiedContainer")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntelligentAgent")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AliceInWonderland-TheBook"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RKFParsingMt")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationExistsInstance")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("characterInCW")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntelligentAgent")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AliceInWonderland-TheBook"))))), (SubLObject)predicate_strengthener.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("is-Underspecified")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BillClinton")), (SubLObject)SubLObjectFactory.makeSymbol("?X")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MaleAnimal"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationExistsInstance")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("father")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Animal")), (SubLObject)SubLObjectFactory.makeSymbol("?X")))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RKFParsingMt")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationExistsInstance")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("father")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Animal")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BillClinton"))))), (SubLObject)predicate_strengthener.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationExistsInstance")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("contains-Underspecified")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Animal")), (SubLObject)SubLObjectFactory.makeSymbol("?X")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("is-Underspecified")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BillClinton")), (SubLObject)SubLObjectFactory.makeSymbol("?X")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MaleAnimal"))))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RKFParsingMt")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BillClinton")), (SubLObject)SubLObjectFactory.makeSymbol("?X")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MaleAnimal"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationExistsInstance")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("in-ContGeneric")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Animal")), (SubLObject)SubLObjectFactory.makeSymbol("?X")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BillClinton")), (SubLObject)SubLObjectFactory.makeSymbol("?X")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MaleAnimal"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationExistsInstance")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constituents")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Animal")), (SubLObject)SubLObjectFactory.makeSymbol("?X")))))), (SubLObject)predicate_strengthener.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeorgeWBush")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("in-UnderspecifiedContainer")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Texas-State")))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeorgeWBush")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionByRegionFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Texas-State")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeorgeWBush")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("inRegion")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Texas-State")))))), (SubLObject)predicate_strengthener.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("in-UnderspecifiedContainer")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Texas-State"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionByRegionFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Texas-State"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("inRegion")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Texas-State"))))), (SubLObject)predicate_strengthener.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationExistsInstance")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("in-UnderspecifiedContainer")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("in-UnderspecifiedContainer")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Texas-State"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Texas-State"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationExistsInstance")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("inRegion")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("inRegion")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Texas-State"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Texas-State"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationExistsInstance")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("inRegion")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionByRegionFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Texas-State"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Texas-State"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationExistsInstance")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectFoundInLocation")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("inRegion")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Texas-State"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Texas-State"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationExistsInstance")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectFoundInLocation")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionByRegionFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Texas-State"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Texas-State"))))), (SubLObject)predicate_strengthener.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllExists")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("contains-Underspecified")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Ribonucleotide")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Ribose"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RKFParsingMt")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllExists")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constituents")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Ribonucleotide")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Ribose"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllExists")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("in-ContGeneric")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Ribonucleotide")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Ribose"))))), (SubLObject)predicate_strengthener.T) });
    }
    
    @Override
	public void declareFunctions() {
        declare_predicate_strengthener_file();
    }
    
    @Override
	public void initializeVariables() {
        init_predicate_strengthener_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_predicate_strengthener_file();
    }
    
    static {
        me = (SubLFile)new predicate_strengthener();
        predicate_strengthener.$strengthen_original_pred_awayP$ = null;
        predicate_strengthener.$pred_strengthen_stop_at_first_specified_pred$ = null;
        predicate_strengthener.$pred_strengthening_max_literal_count$ = null;
        predicate_strengthener.$max_pred_strengs$ = null;
        predicate_strengthener.$pred_strengthener_fn$ = null;
        predicate_strengthener.$do_not_strengthen_isaP$ = null;
        predicate_strengthener.$reformulator_rules_to_use$ = null;
        predicate_strengthener.$reformulator_rules_to_ignore$ = null;
        predicate_strengthener.$dtp_constraint$ = null;
        predicate_strengthener.$predstren_common_uninteresting$ = null;
        predicate_strengthener.$ps_suggested_inverses$ = null;
        predicate_strengthener.$ps_suggested_preds$ = null;
        predicate_strengthener.$ps_typed_inverses$ = null;
        predicate_strengthener.$ps_typed_preds$ = null;
        $kw0$POSITIVE_INFINITY = SubLObjectFactory.makeKeyword("POSITIVE-INFINITY");
        $sym1$ATOMIC_SENTENCE_ = SubLObjectFactory.makeSymbol("ATOMIC-SENTENCE?");
        $sym2$EL_FORMULA_P = SubLObjectFactory.makeSymbol("EL-FORMULA-P");
        $sym3$STRENGTHEN_PREDICATE_W_TYPED_AND_MINIMAL_SUGGESTIONS = SubLObjectFactory.makeSymbol("STRENGTHEN-PREDICATE-W/TYPED-AND-MINIMAL-SUGGESTIONS");
        $sym4$STRENGTHEN_PREDICATE_W_TYPED_LINKS_ONLY = SubLObjectFactory.makeSymbol("STRENGTHEN-PREDICATE-W/TYPED-LINKS-ONLY");
        $const5$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const6$is_Underspecified = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("is-Underspecified"));
        $sym7$NART_P = SubLObjectFactory.makeSymbol("NART-P");
        $str8$PredStren__no_contracted_version_ = SubLObjectFactory.makeString("PredStren: no contracted version for ~S~%");
        $const9$genlInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $kw10$ANY = SubLObjectFactory.makeKeyword("ANY");
        $sym11$RELEVANT_MT_IS_ANY_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-ANY-MT");
        $const12$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym13$PREDSTREN_EXPANDIBLE_RMP_ = SubLObjectFactory.makeSymbol("PREDSTREN-EXPANDIBLE-RMP?");
        $sym14$PREDSTREN_EXPANDIBLE_EXPRESSION_ = SubLObjectFactory.makeSymbol("PREDSTREN-EXPANDIBLE-EXPRESSION?");
        $sym15$PREDSTREN_EXPAND_FORMULA = SubLObjectFactory.makeSymbol("PREDSTREN-EXPAND-FORMULA");
        $kw16$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym17$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $sym18$PREDSTREN_EXPAND_ONE_STEP = SubLObjectFactory.makeSymbol("PREDSTREN-EXPAND-ONE-STEP");
        $const19$expansion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("expansion"));
        $sym20$_REFORMULATOR_RULES_TO_USE_ = SubLObjectFactory.makeSymbol("*REFORMULATOR-RULES-TO-USE*");
        $sym21$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const22$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const23$SubcollectionRelationFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionRelationFunction"));
        $const24$RuleMacroPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RuleMacroPredicate"));
        $kw25$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $sym26$_REFORMULATOR_RULES_TO_IGNORE_ = SubLObjectFactory.makeSymbol("*REFORMULATOR-RULES-TO-IGNORE*");
        $list27 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("reformulatorEquiv")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?THING"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR"), (SubLObject)SubLObjectFactory.makeSymbol("?ROLE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?THING"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLVariableFn")), (SubLObject)SubLObjectFactory.makeSymbol("?ROLE"))));
        $const28$IntermediateVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntermediateVocabularyMt"));
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $kw30$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $int31$30 = SubLObjectFactory.makeInteger(30);
        $kw32$RECURSION_LIMIT = SubLObjectFactory.makeKeyword("RECURSION-LIMIT");
        $kw33$FOCUS = SubLObjectFactory.makeKeyword("FOCUS");
        $const34$ReformulatorRuleUnifier = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReformulatorRuleUnifier"));
        $kw35$REFORMULATOR_RULES = SubLObjectFactory.makeKeyword("REFORMULATOR-RULES");
        $kw36$SKIP_ASSERTIONS = SubLObjectFactory.makeKeyword("SKIP-ASSERTIONS");
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WFF-ENFORCEMENT"), (SubLObject)SubLObjectFactory.makeKeyword("NONE"));
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("ISAS"), (SubLObject)SubLObjectFactory.makeSymbol("GENLS"));
        $const39$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $const40$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $const41$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $list42 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionTypeType")));
        $const43$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $const44$Set_Mathematical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Set-Mathematical"));
        $const45$elementOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("elementOf"));
        $sym46$CONSTRAINT = SubLObjectFactory.makeSymbol("CONSTRAINT");
        $sym47$CONSTRAINT_P = SubLObjectFactory.makeSymbol("CONSTRAINT-P");
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("ISA-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("GENL-LIST"));
        $list49 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"), (SubLObject)SubLObjectFactory.makeKeyword("ISA-LIST"), (SubLObject)SubLObjectFactory.makeKeyword("GENL-LIST"));
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINT-VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINT-ISA-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINT-GENL-LIST"));
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CONSTRAINT-VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CONSTRAINT-ISA-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CONSTRAINT-GENL-LIST"));
        $sym52$PRINT_CONSTRAINT = SubLObjectFactory.makeSymbol("PRINT-CONSTRAINT");
        $sym53$CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("CONSTRAINT-PRINT-FUNCTION-TRAMPOLINE");
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINT-P"));
        $sym55$CONSTRAINT_VARIABLE = SubLObjectFactory.makeSymbol("CONSTRAINT-VARIABLE");
        $sym56$_CSETF_CONSTRAINT_VARIABLE = SubLObjectFactory.makeSymbol("_CSETF-CONSTRAINT-VARIABLE");
        $sym57$CONSTRAINT_ISA_LIST = SubLObjectFactory.makeSymbol("CONSTRAINT-ISA-LIST");
        $sym58$_CSETF_CONSTRAINT_ISA_LIST = SubLObjectFactory.makeSymbol("_CSETF-CONSTRAINT-ISA-LIST");
        $sym59$CONSTRAINT_GENL_LIST = SubLObjectFactory.makeSymbol("CONSTRAINT-GENL-LIST");
        $sym60$_CSETF_CONSTRAINT_GENL_LIST = SubLObjectFactory.makeSymbol("_CSETF-CONSTRAINT-GENL-LIST");
        $kw61$VARIABLE = SubLObjectFactory.makeKeyword("VARIABLE");
        $kw62$ISA_LIST = SubLObjectFactory.makeKeyword("ISA-LIST");
        $kw63$GENL_LIST = SubLObjectFactory.makeKeyword("GENL-LIST");
        $str64$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw65$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym66$MAKE_CONSTRAINT = SubLObjectFactory.makeSymbol("MAKE-CONSTRAINT");
        $kw67$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw68$END = SubLObjectFactory.makeKeyword("END");
        $sym69$VISIT_DEFSTRUCT_OBJECT_CONSTRAINT_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-CONSTRAINT-METHOD");
        $str70$__Constraint___A_isa___A_genl___A = SubLObjectFactory.makeString("#<Constraint: ~A isa: ~A genl: ~A> ");
        $const71$CollectionSubsetFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn"));
        $const72$TheSetOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf"));
        $sym73$COLLECTION_SUBSET_FN_NAUT_P = SubLObjectFactory.makeSymbol("COLLECTION-SUBSET-FN-NAUT-P");
        $sym74$FORMULA_ARG2 = SubLObjectFactory.makeSymbol("FORMULA-ARG2");
        $sym75$PREDSTREN_EXPAND_COLLECTION_SUBSET_FN_NARTS = SubLObjectFactory.makeSymbol("PREDSTREN-EXPAND-COLLECTION-SUBSET-FN-NARTS");
        $sym76$COLLECTION_SUBSET_FN_NART_P = SubLObjectFactory.makeSymbol("COLLECTION-SUBSET-FN-NART-P");
        $sym77$NART_EXPAND = SubLObjectFactory.makeSymbol("NART-EXPAND");
        $const78$typeGenls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("typeGenls"));
        $const79$or = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or"));
        $list80 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTOR"), (SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"));
        $list81 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLVariable")));
        $kw82$EMPTY = SubLObjectFactory.makeKeyword("EMPTY");
        $str83$Non_binary_constraint_in_Predicat = SubLObjectFactory.makeString("Non-binary constraint in Predicate Strengthener: ~S");
        $sym84$PREDSTREN_IDENTIFY_PREDICATE = SubLObjectFactory.makeSymbol("PREDSTREN-IDENTIFY-PREDICATE");
        $list85 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")));
        $const86$UnderspecifiedPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnderspecifiedPredicate"));
        $list87 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HOW"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATES"));
        $sym88$_ = SubLObjectFactory.makeSymbol("<");
        $sym89$RELATION_GENERALITY_ESTIMATE = SubLObjectFactory.makeSymbol("RELATION-GENERALITY-ESTIMATE");
        $list90 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLSentence-Assertible")));
        $const91$SubLString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubLString"));
        $const92$NegativeInteger = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NegativeInteger"));
        $const93$NonNegativeInteger = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NonNegativeInteger"));
        $const94$RealNumber = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RealNumber"));
        $const95$SubLKeyword = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubLKeyword"));
        $const96$SubLListOrAtom = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubLListOrAtom"));
        $const97$SubLList = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubLList"));
        $const98$SubLAtom = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubLAtom"));
        $const99$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $list100 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("MARKING"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("TYPED")));
        $kw101$TYPED = SubLObjectFactory.makeKeyword("TYPED");
        $sym102$PCOND = SubLObjectFactory.makeSymbol("PCOND");
        $sym103$PRED_STRENG_MARKING_MODE = SubLObjectFactory.makeSymbol("PRED-STRENG-MARKING-MODE");
        $list104 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-GENL-PREDS-MARKING*"));
        $sym105$CPUSHNEW = SubLObjectFactory.makeSymbol("CPUSHNEW");
        $list106 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PS-TYPED-PREDS*"));
        $list107 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-GENL-INVERSE-MARKING*"));
        $list108 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PS-TYPED-INVERSES*"));
        $list109 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-GENL-PREDS-AND-GENL-INVERSE-MARKING*"));
        $list110 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PS-SUGGESTED-PREDS*"));
        $list111 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PS-SUGGESTED-INVERSES*"));
        $list112 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("MARKING"));
        $sym113$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym114$MEMBER_ = SubLObjectFactory.makeSymbol("MEMBER?");
        $sym115$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym116$_PS_SUGGESTED_PREDS_ = SubLObjectFactory.makeSymbol("*PS-SUGGESTED-PREDS*");
        $sym117$SNOC = SubLObjectFactory.makeSymbol("SNOC");
        $sym118$_PS_SUGGESTED_INVERSES_ = SubLObjectFactory.makeSymbol("*PS-SUGGESTED-INVERSES*");
        $str119$Error_in_processing__A__result_co = SubLObjectFactory.makeString("Error in processing ~A~%result count not equal to expected count ~%actual result: ~A~%Expected Result ~A~%");
        $sym120$EQUALS_EL_ = SubLObjectFactory.makeSymbol("EQUALS-EL?");
        $str121$_A___not_found_in_expected_result = SubLObjectFactory.makeString("~A~% not found in expected results for ~%~A~%");
        $sym122$PASSES_PRED_STRENGTHENING_TEST = SubLObjectFactory.makeSymbol("PASSES-PRED-STRENGTHENING-TEST");
        $kw123$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw124$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw125$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw126$KB = SubLObjectFactory.makeKeyword("KB");
        $kw127$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw128$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list129 = _constant_129_initializer();
        $sym130$PASSES_NARTY_PRED_STRENGTHENING_TEST = SubLObjectFactory.makeSymbol("PASSES-NARTY-PRED-STRENGTHENING-TEST");
        $list131 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Angola")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Country"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("in-UnderspecifiedContainer")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Angola")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SouthWesternRegionFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ContinentOfAfrica"))))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RKFParsingMt")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Angola")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Country"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("inRegion")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Angola")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SouthWesternRegionFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ContinentOfAfrica"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Angola")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Country"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectFoundInLocation")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Angola")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SouthWesternRegionFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ContinentOfAfrica"))))))), (SubLObject)predicate_strengthener.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeorgeWBush")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("in-UnderspecifiedContainer")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Texas-State")))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeorgeWBush")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionByRegionFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Texas-State")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeorgeWBush")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("inRegion")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Texas-State")))))), (SubLObject)predicate_strengthener.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("in-UnderspecifiedContainer")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Texas-State"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionByRegionFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Texas-State"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("inRegion")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Texas-State"))))), (SubLObject)predicate_strengthener.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationExistsInstance")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("in-UnderspecifiedContainer")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("in-UnderspecifiedContainer")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Texas-State"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Texas-State"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationExistsInstance")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("inRegion")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("inRegion")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Texas-State"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Texas-State"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationExistsInstance")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("inRegion")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionByRegionFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Texas-State"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Texas-State"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationExistsInstance")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectFoundInLocation")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("inRegion")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Texas-State"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Texas-State"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationExistsInstance")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectFoundInLocation")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionByRegionFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Texas-State"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Texas-State"))))), (SubLObject)predicate_strengthener.T));
    }
    
    public static final class $constraint_native extends SubLStructNative
    {
        public SubLObject $variable;
        public SubLObject $isa_list;
        public SubLObject $genl_list;
        private static final SubLStructDeclNative structDecl;
        
        public $constraint_native() {
            this.$variable = (SubLObject)CommonSymbols.NIL;
            this.$isa_list = (SubLObject)CommonSymbols.NIL;
            this.$genl_list = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$constraint_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$variable;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$isa_list;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$genl_list;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$variable = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$isa_list = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$genl_list = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$constraint_native.class, predicate_strengthener.$sym46$CONSTRAINT, predicate_strengthener.$sym47$CONSTRAINT_P, predicate_strengthener.$list48, predicate_strengthener.$list49, new String[] { "$variable", "$isa_list", "$genl_list" }, predicate_strengthener.$list50, predicate_strengthener.$list51, predicate_strengthener.$sym52$PRINT_CONSTRAINT);
        }
    }
    
    public static final class $constraint_p$UnaryFunction extends UnaryFunction
    {
        public $constraint_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CONSTRAINT-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return predicate_strengthener.constraint_p(arg1);
        }
    }
}

/*

	Total time: 610 ms
	
*/