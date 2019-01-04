package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.inference.harness.prove;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_assertion_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rkf_assertion_utilities";
    public static final String myFingerPrint = "63b24526759c6c36a244292e29a45b3ce443722c2ced28e0d2345a71a5ec9a06";
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 2477L)
    private static SubLSymbol $rkf_assertion_attribution_mt_caching_state$;
    private static final SubLString $str0$HYP_RKF;
    private static final SubLSymbol $sym1$RKF_ASSERTION_ATTRIBUTION_MT;
    private static final SubLObject $const2$UIABookkeepingMt;
    private static final SubLObject $const3$BookkeepingMt;
    private static final SubLSymbol $sym4$_RKF_ASSERTION_ATTRIBUTION_MT_CACHING_STATE_;
    private static final SubLObject $const5$ist;
    private static final SubLObject $const6$assertedUsingTool;
    private static final SubLSymbol $kw7$PARTIAL;
    private static final SubLSymbol $sym8$HL_CONJUNCT_TO_SUPPORT;
    private static final SubLList $list9;
    private static final SubLObject $const10$unknownSentence;
    private static final SubLObject $const11$isa;
    private static final SubLObject $const12$disjointWith;
    private static final SubLObject $const13$not;
    private static final SubLSymbol $kw14$ISA;
    private static final SubLObject $const15$genls;
    private static final SubLSymbol $kw16$GENLS;
    private static final SubLSymbol $kw17$DISJOINTWITH;
    private static final SubLSymbol $kw18$OPAQUE;
    private static final SubLObject $const19$rejectedSentence;
    private static final SubLList $list20;
    private static final SubLSymbol $kw21$MT;
    private static final SubLObject $const22$definingMt;
    private static final SubLList $list23;
    private static final SubLObject $const24$InferencePSC;
    private static final SubLList $list25;
    private static final SubLObject $const26$defaultDefiningMtForSentenceOnTer;
    private static final SubLObject $const27$and;
    private static final SubLObject $const28$implies;
    private static final SubLObject $const29$defaultDefiningMtForSentence;
    private static final SubLSymbol $kw30$MAX_TRANSFORMATION_DEPTH;
    private static final SubLSymbol $kw31$CONDITIONAL_SENTENCE_;
    private static final SubLSymbol $kw32$ARG;
    private static final SubLObject $const33$argIsa;
    private static final SubLList $list34;
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 776L)
    public static SubLObject rkf_assert(final SubLObject formula, SubLObject mt, SubLObject nowP, SubLObject assume_wffP) {
        if (mt == rkf_assertion_utilities.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        if (nowP == rkf_assertion_utilities.UNPROVIDED) {
            nowP = (SubLObject)rkf_assertion_utilities.NIL;
        }
        if (assume_wffP == rkf_assertion_utilities.UNPROVIDED) {
            assume_wffP = (SubLObject)rkf_assertion_utilities.NIL;
        }
        return rkf_assert_int(formula, mt, nowP, assume_wffP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 908L)
    public static SubLObject rkf_assert_now(final SubLObject formula, SubLObject mt) {
        if (mt == rkf_assertion_utilities.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        return rkf_assert_int(formula, mt, (SubLObject)rkf_assertion_utilities.T, (SubLObject)rkf_assertion_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 1016L)
    public static SubLObject rkf_assert_wff_now(final SubLObject formula, SubLObject mt) {
        if (mt == rkf_assertion_utilities.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        return rkf_assert_int(formula, mt, (SubLObject)rkf_assertion_utilities.T, (SubLObject)rkf_assertion_utilities.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 1126L)
    public static SubLObject rkf_assert_int(final SubLObject formula, final SubLObject mt, final SubLObject nowP, final SubLObject assume_wffP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = (SubLObject)rkf_assertion_utilities.NIL;
        SubLObject error = (SubLObject)rkf_assertion_utilities.NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = Errors.$continue_cerrorP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind((SubLObject)rkf_assertion_utilities.NIL, thread);
            Errors.$continue_cerrorP$.bind((SubLObject)rkf_assertion_utilities.T, thread);
            if (rkf_assertion_utilities.NIL != nowP) {
                if (rkf_assertion_utilities.NIL != assume_wffP) {
                    thread.resetMultipleValues();
                    final SubLObject successP_$1 = ke.ke_assert_wff_now(formula, mt, (SubLObject)rkf_assertion_utilities.UNPROVIDED, (SubLObject)rkf_assertion_utilities.UNPROVIDED);
                    final SubLObject error_$2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    successP = successP_$1;
                    error = error_$2;
                }
                else {
                    thread.resetMultipleValues();
                    final SubLObject successP_$2 = ke.ke_assert_now(formula, mt, (SubLObject)rkf_assertion_utilities.UNPROVIDED, (SubLObject)rkf_assertion_utilities.UNPROVIDED);
                    final SubLObject error_$3 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    successP = successP_$2;
                    error = error_$3;
                }
            }
            else if (rkf_assertion_utilities.NIL != assume_wffP) {
                successP = ke.ke_assert(formula, mt, (SubLObject)rkf_assertion_utilities.UNPROVIDED, (SubLObject)rkf_assertion_utilities.UNPROVIDED);
                error = fi.$fi_error$.getDynamicValue(thread);
            }
            else {
                successP = ke.ke_assert(formula, mt, (SubLObject)rkf_assertion_utilities.UNPROVIDED, (SubLObject)rkf_assertion_utilities.UNPROVIDED);
                error = fi.$fi_error$.getDynamicValue(thread);
            }
        }
        finally {
            Errors.$continue_cerrorP$.rebind(_prev_bind_2, thread);
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        if (rkf_assertion_utilities.NIL != successP) {
            final SubLObject tool = rkf_macros.$rkf_asserting_tool$.getDynamicValue(thread);
            if (rkf_assertion_utilities.NIL != tool) {
                final SubLObject new_as = czer_meta.find_assertion_cycl(formula, mt);
                if (rkf_assertion_utilities.NIL != assertion_handles.assertion_p(new_as)) {
                    rkf_attribute_assertion_to_tool(formula, mt, tool);
                }
            }
            rkf_event_dispatcher.rkf_post_assert_event(formula, mt, (SubLObject)rkf_assertion_utilities.NIL, tool);
        }
        return Values.values(successP, error);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 2002L)
    public static SubLObject rkf_hypothesize(final SubLObject formula, final SubLObject domain_mt, SubLObject prefix) {
        if (prefix == rkf_assertion_utilities.UNPROVIDED) {
            prefix = (SubLObject)rkf_assertion_utilities.$str0$HYP_RKF;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error_string = (SubLObject)rkf_assertion_utilities.NIL;
        SubLObject terms = (SubLObject)rkf_assertion_utilities.NIL;
        terms = prove.fi_hypothesize_int(formula, domain_mt, prefix, (SubLObject)rkf_assertion_utilities.UNPROVIDED);
        if (rkf_assertion_utilities.NIL == terms) {
            error_string = fi.fi_error_string(fi.$fi_error$.getDynamicValue(thread));
        }
        return Values.values(terms, error_string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 2477L)
    public static SubLObject clear_rkf_assertion_attribution_mt() {
        final SubLObject cs = rkf_assertion_utilities.$rkf_assertion_attribution_mt_caching_state$.getGlobalValue();
        if (rkf_assertion_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rkf_assertion_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 2477L)
    public static SubLObject remove_rkf_assertion_attribution_mt() {
        return memoization_state.caching_state_remove_function_results_with_args(rkf_assertion_utilities.$rkf_assertion_attribution_mt_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(rkf_assertion_utilities.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)rkf_assertion_utilities.UNPROVIDED, (SubLObject)rkf_assertion_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 2477L)
    public static SubLObject rkf_assertion_attribution_mt_internal() {
        return (rkf_assertion_utilities.NIL != constant_handles.valid_constantP(rkf_assertion_utilities.$const2$UIABookkeepingMt, (SubLObject)rkf_assertion_utilities.UNPROVIDED)) ? rkf_assertion_utilities.$const2$UIABookkeepingMt : rkf_assertion_utilities.$const3$BookkeepingMt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 2477L)
    public static SubLObject rkf_assertion_attribution_mt() {
        SubLObject caching_state = rkf_assertion_utilities.$rkf_assertion_attribution_mt_caching_state$.getGlobalValue();
        if (rkf_assertion_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rkf_assertion_utilities.$sym1$RKF_ASSERTION_ATTRIBUTION_MT, (SubLObject)rkf_assertion_utilities.$sym4$_RKF_ASSERTION_ATTRIBUTION_MT_CACHING_STATE_, (SubLObject)rkf_assertion_utilities.NIL, (SubLObject)rkf_assertion_utilities.EQL, (SubLObject)rkf_assertion_utilities.ZERO_INTEGER, (SubLObject)rkf_assertion_utilities.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)rkf_assertion_utilities.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rkf_assertion_attribution_mt_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)rkf_assertion_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 2735L)
    public static SubLObject rkf_attribute_assertion_to_tool(final SubLObject sentence, final SubLObject mt, final SubLObject tool) {
        final SubLObject arg_sentence = el_utilities.make_binary_formula(rkf_assertion_utilities.$const5$ist, mt, sentence);
        final SubLObject author_sentence = el_utilities.make_binary_formula(rkf_assertion_utilities.$const6$assertedUsingTool, arg_sentence, tool);
        return ke.ke_assert(author_sentence, rkf_assertion_attribution_mt(), (SubLObject)rkf_assertion_utilities.UNPROVIDED, (SubLObject)rkf_assertion_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 3122L)
    public static SubLObject rkf_unassert(final SubLObject sentence, SubLObject mt) {
        if (mt == rkf_assertion_utilities.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)rkf_assertion_utilities.NIL;
        SubLObject el_sentence = (SubLObject)rkf_assertion_utilities.NIL;
        if (rkf_assertion_utilities.NIL != assertion_handles.assertion_p(sentence)) {
            el_sentence = uncanonicalizer.assertion_el_formula(sentence);
            mt = assertions_high.assertion_mt(sentence);
            v_answer = ke.ke_unassert_assertion_now(sentence);
        }
        else {
            thread.resetMultipleValues();
            final SubLObject assertions = czer_meta.find_assertions_cycl(sentence, mt);
            final SubLObject missingP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            el_sentence = sentence;
            if (rkf_assertion_utilities.NIL == assertions) {
                v_answer = (SubLObject)rkf_assertion_utilities.NIL;
            }
            else {
                v_answer = ke.ke_unassert_now(sentence, mt);
                if (rkf_assertion_utilities.NIL != v_answer && rkf_assertion_utilities.NIL != missingP) {
                    v_answer = (SubLObject)rkf_assertion_utilities.$kw7$PARTIAL;
                }
            }
        }
        if (rkf_assertion_utilities.NIL != v_answer) {
            rkf_event_dispatcher.rkf_post_unassert_event(el_sentence, mt, (SubLObject)rkf_assertion_utilities.UNPROVIDED, (SubLObject)rkf_assertion_utilities.UNPROVIDED);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 3948L)
    public static SubLObject rkf_scenario_assert(final SubLObject formula, final SubLObject mt) {
        return rkf_assert(formula, mt, (SubLObject)rkf_assertion_utilities.UNPROVIDED, (SubLObject)rkf_assertion_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 4129L)
    public static SubLObject rkf_why_not_assertible_compliant(final SubLObject sentence, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)rkf_assertion_utilities.NIL;
        final SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding(thread);
        final SubLObject _prev_bind_2 = wff_vars.$validate_expansionsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_admit_consistent_nautsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$at_admit_consistent_nartsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_vars.$include_suf_defn_violationsP$.currentBinding(thread);
        try {
            control_vars.$within_assert$.bind((SubLObject)rkf_assertion_utilities.T, thread);
            wff_vars.$validate_expansionsP$.bind((SubLObject)rkf_assertion_utilities.T, thread);
            at_vars.$at_admit_consistent_nautsP$.bind((SubLObject)rkf_assertion_utilities.T, thread);
            at_vars.$at_admit_consistent_nartsP$.bind((SubLObject)rkf_assertion_utilities.NIL, thread);
            wff_vars.$include_suf_defn_violationsP$.bind((SubLObject)rkf_assertion_utilities.NIL, thread);
            result = rkf_supports_for_why_not_wff(sentence, domain_mt);
        }
        finally {
            wff_vars.$include_suf_defn_violationsP$.rebind(_prev_bind_5, thread);
            at_vars.$at_admit_consistent_nartsP$.rebind(_prev_bind_4, thread);
            at_vars.$at_admit_consistent_nautsP$.rebind(_prev_bind_3, thread);
            wff_vars.$validate_expansionsP$.rebind(_prev_bind_2, thread);
            control_vars.$within_assert$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 4718L)
    public static SubLObject rkf_supports_for_why_not_wff(final SubLObject sentence, final SubLObject domain_mt) {
        return hl_explanation_to_argument(wff.hl_explanation_of_why_not_wff(sentence, domain_mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 4990L)
    public static SubLObject rkf_supports_for_why_not_wft(final SubLObject expression, final SubLObject domain_mt) {
        return hl_explanation_to_argument(wff.hl_explanation_of_why_not_wft(expression, domain_mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 5181L)
    public static SubLObject hl_explanation_to_argument(final SubLObject hl_explanation) {
        if (rkf_assertion_utilities.NIL == hl_explanation) {
            return (SubLObject)rkf_assertion_utilities.NIL;
        }
        if (rkf_assertion_utilities.NIL != el_utilities.el_conjunction_p(hl_explanation)) {
            return Sequences.nreverse(Sequences.delete((SubLObject)rkf_assertion_utilities.NIL, Mapping.mapcar((SubLObject)rkf_assertion_utilities.$sym8$HL_CONJUNCT_TO_SUPPORT, cycl_utilities.formula_args(hl_explanation, (SubLObject)rkf_assertion_utilities.UNPROVIDED)), (SubLObject)rkf_assertion_utilities.UNPROVIDED, (SubLObject)rkf_assertion_utilities.UNPROVIDED, (SubLObject)rkf_assertion_utilities.UNPROVIDED, (SubLObject)rkf_assertion_utilities.UNPROVIDED, (SubLObject)rkf_assertion_utilities.UNPROVIDED));
        }
        return Sequences.delete((SubLObject)rkf_assertion_utilities.NIL, (SubLObject)ConsesLow.list(hl_conjunct_to_support(hl_explanation)), (SubLObject)rkf_assertion_utilities.UNPROVIDED, (SubLObject)rkf_assertion_utilities.UNPROVIDED, (SubLObject)rkf_assertion_utilities.UNPROVIDED, (SubLObject)rkf_assertion_utilities.UNPROVIDED, (SubLObject)rkf_assertion_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 5692L)
    public static SubLObject hl_conjunct_to_support(final SubLObject hl_conjunct) {
        if (rkf_assertion_utilities.NIL != arguments.support_p(hl_conjunct)) {
            return hl_conjunct;
        }
        if (rkf_assertion_utilities.NIL != el_utilities.el_formula_with_operator_p(hl_conjunct, rkf_assertion_utilities.$const5$ist)) {
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.formula_args(hl_conjunct, (SubLObject)rkf_assertion_utilities.UNPROVIDED);
            SubLObject mt = (SubLObject)rkf_assertion_utilities.NIL;
            SubLObject sentence = (SubLObject)rkf_assertion_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_assertion_utilities.$list9);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_assertion_utilities.$list9);
            sentence = current.first();
            current = current.rest();
            if (rkf_assertion_utilities.NIL == current) {
                if (rkf_assertion_utilities.NIL != hlmt.hlmt_p(mt) && rkf_assertion_utilities.NIL != el_utilities.possibly_sentence_p(sentence)) {
                    final SubLObject modified_sentence = fix_hl_conjunct_sentence(sentence, mt);
                    final SubLObject hl_support_module = hl_support_module_for_sentence(modified_sentence);
                    return arguments.make_hl_support(hl_support_module, modified_sentence, mt, (SubLObject)rkf_assertion_utilities.UNPROVIDED);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_assertion_utilities.$list9);
            }
        }
        else if (rkf_assertion_utilities.NIL != el_utilities.possibly_sentence_p(hl_conjunct)) {
            final SubLObject modified_sentence2 = fix_hl_conjunct_sentence(hl_conjunct, (SubLObject)rkf_assertion_utilities.UNPROVIDED);
            final SubLObject hl_support_module2 = hl_support_module_for_sentence(modified_sentence2);
            return arguments.make_hl_support(hl_support_module2, modified_sentence2, (SubLObject)rkf_assertion_utilities.UNPROVIDED, (SubLObject)rkf_assertion_utilities.UNPROVIDED);
        }
        return (SubLObject)rkf_assertion_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 6505L)
    public static SubLObject fix_hl_conjunct_sentence(SubLObject sentence, SubLObject mt) {
        if (mt == rkf_assertion_utilities.UNPROVIDED) {
            mt = (SubLObject)rkf_assertion_utilities.NIL;
        }
        if (rkf_assertion_utilities.NIL != disjoint_with_hl_conjunct_sentenceP(sentence)) {
            return hl_conjunct_sentence_to_disjoint_with(sentence);
        }
        if (rkf_assertion_utilities.NIL != el_utilities.el_negation_p(sentence) && rkf_assertion_utilities.NIL == fi.fi_ask_int(sentence, mt, (SubLObject)rkf_assertion_utilities.ZERO_INTEGER, (SubLObject)rkf_assertion_utilities.ONE_INTEGER, (SubLObject)rkf_assertion_utilities.UNPROVIDED, (SubLObject)rkf_assertion_utilities.UNPROVIDED)) {
            sentence = el_utilities.make_unary_formula(rkf_assertion_utilities.$const10$unknownSentence, cycl_utilities.formula_arg1(sentence, (SubLObject)rkf_assertion_utilities.UNPROVIDED));
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 6951L)
    public static SubLObject disjoint_with_hl_conjunct_sentenceP(final SubLObject sentence) {
        if (rkf_assertion_utilities.NIL != el_utilities.el_negation_p(sentence) && rkf_assertion_utilities.NIL != el_utilities.el_conjunction_p(cycl_utilities.formula_arg1(sentence, (SubLObject)rkf_assertion_utilities.UNPROVIDED))) {
            SubLObject failP = (SubLObject)rkf_assertion_utilities.NIL;
            SubLObject var = (SubLObject)rkf_assertion_utilities.NIL;
            if (rkf_assertion_utilities.NIL == failP) {
                SubLObject csome_list_var = cycl_utilities.formula_args(cycl_utilities.formula_arg1(sentence, (SubLObject)rkf_assertion_utilities.UNPROVIDED), (SubLObject)rkf_assertion_utilities.UNPROVIDED);
                SubLObject conjunct = (SubLObject)rkf_assertion_utilities.NIL;
                conjunct = csome_list_var.first();
                while (rkf_assertion_utilities.NIL == failP && rkf_assertion_utilities.NIL != csome_list_var) {
                    if (rkf_assertion_utilities.NIL != el_utilities.el_formula_with_operator_p(conjunct, rkf_assertion_utilities.$const11$isa) && (rkf_assertion_utilities.NIL == var || var.eql(cycl_utilities.formula_arg1(conjunct, (SubLObject)rkf_assertion_utilities.UNPROVIDED)))) {
                        if (rkf_assertion_utilities.NIL == var) {
                            var = cycl_utilities.formula_arg1(conjunct, (SubLObject)rkf_assertion_utilities.UNPROVIDED);
                        }
                    }
                    else {
                        failP = (SubLObject)rkf_assertion_utilities.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    conjunct = csome_list_var.first();
                }
            }
            return (SubLObject)SubLObjectFactory.makeBoolean(rkf_assertion_utilities.NIL == failP);
        }
        return (SubLObject)rkf_assertion_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 7515L)
    public static SubLObject hl_conjunct_sentence_to_disjoint_with(final SubLObject sentence) {
        SubLObject disjoint_cols = (SubLObject)rkf_assertion_utilities.NIL;
        SubLObject cdolist_list_var = cycl_utilities.formula_args(cycl_utilities.formula_arg1(sentence, (SubLObject)rkf_assertion_utilities.UNPROVIDED), (SubLObject)rkf_assertion_utilities.UNPROVIDED);
        SubLObject conjunct = (SubLObject)rkf_assertion_utilities.NIL;
        conjunct = cdolist_list_var.first();
        while (rkf_assertion_utilities.NIL != cdolist_list_var) {
            disjoint_cols = (SubLObject)ConsesLow.cons(cycl_utilities.formula_arg2(conjunct, (SubLObject)rkf_assertion_utilities.UNPROVIDED), disjoint_cols);
            cdolist_list_var = cdolist_list_var.rest();
            conjunct = cdolist_list_var.first();
        }
        return el_utilities.make_el_formula(rkf_assertion_utilities.$const12$disjointWith, Sequences.nreverse(disjoint_cols), (SubLObject)rkf_assertion_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 7885L)
    public static SubLObject hl_support_module_for_sentence(final SubLObject sentence) {
        final SubLObject pcase_var = cycl_utilities.formula_operator(sentence);
        if (pcase_var.eql(rkf_assertion_utilities.$const13$not)) {
            return hl_support_module_for_sentence(cycl_utilities.formula_arg1(sentence, (SubLObject)rkf_assertion_utilities.UNPROVIDED));
        }
        if (pcase_var.eql(rkf_assertion_utilities.$const11$isa)) {
            return (SubLObject)rkf_assertion_utilities.$kw14$ISA;
        }
        if (pcase_var.eql(rkf_assertion_utilities.$const15$genls)) {
            return (SubLObject)rkf_assertion_utilities.$kw16$GENLS;
        }
        if (pcase_var.eql(rkf_assertion_utilities.$const12$disjointWith)) {
            return (SubLObject)rkf_assertion_utilities.$kw17$DISJOINTWITH;
        }
        return (SubLObject)rkf_assertion_utilities.$kw18$OPAQUE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 8284L)
    public static SubLObject rkf_edit_with_implicature(final SubLObject old_sentence, final SubLObject new_sentence, final SubLObject domain_mt) {
        rkf_unassert(old_sentence, domain_mt);
        return rkf_assert_with_implicature(new_sentence, domain_mt, (SubLObject)rkf_assertion_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 8849L)
    public static SubLObject rkf_assert_with_implicature(SubLObject sentence, SubLObject domain_mt, SubLObject now) {
        if (now == rkf_assertion_utilities.UNPROVIDED) {
            now = (SubLObject)rkf_assertion_utilities.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject successes = set.new_set(Symbols.symbol_function((SubLObject)rkf_assertion_utilities.EQUAL), (SubLObject)rkf_assertion_utilities.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject sentence_$5 = czer_utilities.unwrap_if_ist(sentence, domain_mt, (SubLObject)rkf_assertion_utilities.UNPROVIDED);
        final SubLObject domain_mt_$6 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        sentence = sentence_$5;
        domain_mt = domain_mt_$6;
        thread.resetMultipleValues();
        final SubLObject successP = rkf_assert_with_implicature_int(sentence, domain_mt, successes, now);
        final SubLObject reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(successP, reason, set.set_element_list(successes));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 9677L)
    public static SubLObject rkf_assert_with_implicature_int(final SubLObject sentence, final SubLObject domain_mt, final SubLObject successes, SubLObject now) {
        if (now == rkf_assertion_utilities.UNPROVIDED) {
            now = (SubLObject)rkf_assertion_utilities.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_assertion_utilities.NIL != rkf_assert(sentence, domain_mt, now, (SubLObject)rkf_assertion_utilities.UNPROVIDED)) {
            rkf_note_successful_assertion(sentence, successes);
            return Values.values((SubLObject)rkf_assertion_utilities.T, sentence);
        }
        final SubLObject reasons = rkf_why_not_assertible_compliant(sentence, domain_mt);
        SubLObject repairs = (SubLObject)rkf_assertion_utilities.ZERO_INTEGER;
        SubLObject cdolist_list_var = reasons;
        SubLObject argument = (SubLObject)rkf_assertion_utilities.NIL;
        argument = cdolist_list_var.first();
        while (rkf_assertion_utilities.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject can_be_fixedP = rkf_formula_usable_for_implicature_repairP(argument);
            final SubLObject how = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (rkf_assertion_utilities.NIL != can_be_fixedP) {
                final SubLObject missing_sentence = how;
                if (missing_sentence.equal(sentence)) {
                    return Values.values((SubLObject)rkf_assertion_utilities.NIL, el_utilities.make_unary_formula(rkf_assertion_utilities.$const19$rejectedSentence, el_utilities.make_binary_formula(rkf_assertion_utilities.$const5$ist, domain_mt, missing_sentence)));
                }
                if (rkf_assertion_utilities.NIL != rkf_contradiction_finder.rkf_rejected(missing_sentence, domain_mt, (SubLObject)rkf_assertion_utilities.UNPROVIDED, (SubLObject)rkf_assertion_utilities.UNPROVIDED)) {
                    return Values.values((SubLObject)rkf_assertion_utilities.NIL, arguments.support_formula(argument));
                }
                if (rkf_assertion_utilities.NIL != rkf_assertion_that_succeededP(missing_sentence, successes)) {
                    return Values.values((SubLObject)rkf_assertion_utilities.NIL, el_utilities.make_unary_formula(rkf_assertion_utilities.$const19$rejectedSentence, el_utilities.make_binary_formula(rkf_assertion_utilities.$const5$ist, domain_mt, arguments.support_formula(argument))));
                }
                thread.resetMultipleValues();
                final SubLObject successP = rkf_assert_with_implicature_int(missing_sentence, domain_mt, successes, now);
                final SubLObject reason = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (rkf_assertion_utilities.NIL == successP) {
                    return Values.values((SubLObject)rkf_assertion_utilities.NIL, reason);
                }
                repairs = Numbers.add(repairs, (SubLObject)rkf_assertion_utilities.ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            argument = cdolist_list_var.first();
        }
        if (!repairs.isPositive()) {
            return Values.values((SubLObject)rkf_assertion_utilities.NIL, sentence);
        }
        return rkf_assert_with_implicature_int(sentence, domain_mt, successes, now);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 11544L)
    public static SubLObject rkf_note_successful_assertion(final SubLObject sentence, final SubLObject v_set) {
        return set.set_add(sentence, v_set);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 11638L)
    public static SubLObject rkf_assertion_that_succeededP(final SubLObject sentence, final SubLObject v_set) {
        return set.set_memberP(sentence, v_set);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 11736L)
    public static SubLObject rkf_formula_usable_for_implicature_repairP(final SubLObject argument) {
        final SubLObject module = arguments.support_module(argument);
        final SubLObject formula = arguments.support_sentence(argument);
        if (rkf_assertion_utilities.NIL != hl_supports.opaque_hl_support_p(argument) && cycl_utilities.formula_arg0(formula).eql(rkf_assertion_utilities.$const10$unknownSentence)) {
            final SubLObject repair_sentence = cycl_utilities.formula_arg1(formula, (SubLObject)rkf_assertion_utilities.UNPROVIDED);
            SubLObject fix_will_workP = (SubLObject)rkf_assertion_utilities.T;
            if (rkf_assertion_utilities.NIL != kb_accessors.not_assertible_predicateP(cycl_utilities.formula_arg0(repair_sentence), (SubLObject)rkf_assertion_utilities.UNPROVIDED)) {
                fix_will_workP = (SubLObject)rkf_assertion_utilities.NIL;
            }
            return Values.values(fix_will_workP, repair_sentence);
        }
        if (rkf_assertion_utilities.NIL != subl_promotions.memberP(module, (SubLObject)rkf_assertion_utilities.$list20, (SubLObject)rkf_assertion_utilities.UNPROVIDED, (SubLObject)rkf_assertion_utilities.UNPROVIDED) && cycl_utilities.formula_arg0(formula).eql(rkf_assertion_utilities.$const13$not)) {
            return Values.values((SubLObject)rkf_assertion_utilities.T, cycl_utilities.formula_arg1(formula, (SubLObject)rkf_assertion_utilities.UNPROVIDED));
        }
        return Values.values((SubLObject)rkf_assertion_utilities.NIL, (SubLObject)rkf_assertion_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 12543L)
    public static SubLObject rkf_best_defining_mt_for_fort(final SubLObject fort, final SubLObject default_mt) {
        SubLObject result = (SubLObject)rkf_assertion_utilities.NIL;
        final SubLObject default_defining_mts = ask_utilities.query_variable((SubLObject)rkf_assertion_utilities.$kw21$MT, (SubLObject)ConsesLow.listS(rkf_assertion_utilities.$const22$definingMt, fort, (SubLObject)rkf_assertion_utilities.$list23), rkf_assertion_utilities.$const24$InferencePSC, (SubLObject)rkf_assertion_utilities.$list25);
        result = ((rkf_assertion_utilities.NIL != default_defining_mts.first()) ? default_defining_mts.first() : default_mt);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 13008L)
    public static SubLObject rkf_best_defining_mt_for_fort_and_sentence(final SubLObject fort, final SubLObject sentence, final SubLObject default_mt) {
        if (rkf_assertion_utilities.NIL != el_utilities.el_formula_p(sentence)) {
            SubLObject result = (SubLObject)rkf_assertion_utilities.NIL;
            final SubLObject default_defining_mts = ask_utilities.query_variable((SubLObject)rkf_assertion_utilities.$kw21$MT, (SubLObject)ConsesLow.listS(rkf_assertion_utilities.$const26$defaultDefiningMtForSentenceOnTer, sentence, fort, (SubLObject)rkf_assertion_utilities.$list23), rkf_assertion_utilities.$const24$InferencePSC, (SubLObject)rkf_assertion_utilities.$list25);
            result = ((rkf_assertion_utilities.NIL != default_defining_mts.first()) ? default_defining_mts.first() : default_mt);
            return result;
        }
        return (SubLObject)rkf_assertion_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 13673L)
    public static SubLObject rkf_best_defining_mt_for_sentence(final SubLObject sentence, final SubLObject default_mt) {
        SubLObject result = (SubLObject)rkf_assertion_utilities.NIL;
        final SubLObject presupposed_asserts = rkf_gather_expression_assertion_args(sentence, (SubLObject)rkf_assertion_utilities.UNPROVIDED);
        final SubLObject precondition_sentence = (SubLObject)((rkf_assertion_utilities.NIL != presupposed_asserts) ? ConsesLow.cons(rkf_assertion_utilities.$const27$and, presupposed_asserts) : rkf_assertion_utilities.NIL);
        final SubLObject query_sentence = (SubLObject)((rkf_assertion_utilities.NIL != precondition_sentence) ? ConsesLow.list(rkf_assertion_utilities.$const28$implies, precondition_sentence, (SubLObject)ConsesLow.listS(rkf_assertion_utilities.$const29$defaultDefiningMtForSentence, sentence, (SubLObject)rkf_assertion_utilities.$list23)) : ConsesLow.listS(rkf_assertion_utilities.$const29$defaultDefiningMtForSentence, sentence, (SubLObject)rkf_assertion_utilities.$list23));
        final SubLObject conditionalP = inference_strategist.inference_conditional_sentence_p(query_sentence);
        final SubLObject default_defining_mts = ask_utilities.query_variable((SubLObject)rkf_assertion_utilities.$kw21$MT, query_sentence, rkf_assertion_utilities.$const24$InferencePSC, (SubLObject)ConsesLow.list((SubLObject)rkf_assertion_utilities.$kw30$MAX_TRANSFORMATION_DEPTH, (SubLObject)rkf_assertion_utilities.TWO_INTEGER, (SubLObject)rkf_assertion_utilities.$kw31$CONDITIONAL_SENTENCE_, conditionalP));
        result = ((rkf_assertion_utilities.NIL != default_defining_mts.first()) ? default_defining_mts.first() : default_mt);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 14580L)
    public static SubLObject rkf_gather_expression_assertion_args(final SubLObject sentence, SubLObject mt) {
        if (mt == rkf_assertion_utilities.UNPROVIDED) {
            mt = (SubLObject)rkf_assertion_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject meta_preds = (SubLObject)((rkf_assertion_utilities.NIL != czer_meta.meta_predicateP(cycl_utilities.formula_arg0(sentence), (SubLObject)rkf_assertion_utilities.UNPROVIDED)) ? ConsesLow.list(cycl_utilities.formula_arg0(sentence)) : rkf_assertion_utilities.NIL);
        SubLObject assertion_args = (SubLObject)rkf_assertion_utilities.NIL;
        SubLObject result = (SubLObject)rkf_assertion_utilities.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate((rkf_assertion_utilities.NIL != mt) ? mt : mt_relevance_macros.$mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = meta_preds;
            SubLObject pred = (SubLObject)rkf_assertion_utilities.NIL;
            pred = cdolist_list_var.first();
            while (rkf_assertion_utilities.NIL != cdolist_list_var) {
                assertion_args = Sequences.cconcatenate(ask_utilities.ask_variable((SubLObject)rkf_assertion_utilities.$kw32$ARG, (SubLObject)ConsesLow.listS(rkf_assertion_utilities.$const33$argIsa, pred, (SubLObject)rkf_assertion_utilities.$list34), (SubLObject)rkf_assertion_utilities.UNPROVIDED, (SubLObject)rkf_assertion_utilities.UNPROVIDED, (SubLObject)rkf_assertion_utilities.UNPROVIDED, (SubLObject)rkf_assertion_utilities.UNPROVIDED, (SubLObject)rkf_assertion_utilities.UNPROVIDED), assertion_args);
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var2 = assertion_args;
        SubLObject arg_num = (SubLObject)rkf_assertion_utilities.NIL;
        arg_num = cdolist_list_var2.first();
        while (rkf_assertion_utilities.NIL != cdolist_list_var2) {
            result = (SubLObject)ConsesLow.cons(cycl_utilities.formula_arg(sentence, arg_num, (SubLObject)rkf_assertion_utilities.UNPROVIDED), result);
            cdolist_list_var2 = cdolist_list_var2.rest();
            arg_num = cdolist_list_var2.first();
        }
        return result;
    }
    
    public static SubLObject declare_rkf_assertion_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assertion_utilities", "rkf_assert", "RKF-ASSERT", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assertion_utilities", "rkf_assert_now", "RKF-ASSERT-NOW", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assertion_utilities", "rkf_assert_wff_now", "RKF-ASSERT-WFF-NOW", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assertion_utilities", "rkf_assert_int", "RKF-ASSERT-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assertion_utilities", "rkf_hypothesize", "RKF-HYPOTHESIZE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assertion_utilities", "clear_rkf_assertion_attribution_mt", "CLEAR-RKF-ASSERTION-ATTRIBUTION-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assertion_utilities", "remove_rkf_assertion_attribution_mt", "REMOVE-RKF-ASSERTION-ATTRIBUTION-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assertion_utilities", "rkf_assertion_attribution_mt_internal", "RKF-ASSERTION-ATTRIBUTION-MT-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assertion_utilities", "rkf_assertion_attribution_mt", "RKF-ASSERTION-ATTRIBUTION-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assertion_utilities", "rkf_attribute_assertion_to_tool", "RKF-ATTRIBUTE-ASSERTION-TO-TOOL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assertion_utilities", "rkf_unassert", "RKF-UNASSERT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assertion_utilities", "rkf_scenario_assert", "RKF-SCENARIO-ASSERT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assertion_utilities", "rkf_why_not_assertible_compliant", "RKF-WHY-NOT-ASSERTIBLE-COMPLIANT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assertion_utilities", "rkf_supports_for_why_not_wff", "RKF-SUPPORTS-FOR-WHY-NOT-WFF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assertion_utilities", "rkf_supports_for_why_not_wft", "RKF-SUPPORTS-FOR-WHY-NOT-WFT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assertion_utilities", "hl_explanation_to_argument", "HL-EXPLANATION-TO-ARGUMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assertion_utilities", "hl_conjunct_to_support", "HL-CONJUNCT-TO-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assertion_utilities", "fix_hl_conjunct_sentence", "FIX-HL-CONJUNCT-SENTENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assertion_utilities", "disjoint_with_hl_conjunct_sentenceP", "DISJOINT-WITH-HL-CONJUNCT-SENTENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assertion_utilities", "hl_conjunct_sentence_to_disjoint_with", "HL-CONJUNCT-SENTENCE-TO-DISJOINT-WITH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assertion_utilities", "hl_support_module_for_sentence", "HL-SUPPORT-MODULE-FOR-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assertion_utilities", "rkf_edit_with_implicature", "RKF-EDIT-WITH-IMPLICATURE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assertion_utilities", "rkf_assert_with_implicature", "RKF-ASSERT-WITH-IMPLICATURE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assertion_utilities", "rkf_assert_with_implicature_int", "RKF-ASSERT-WITH-IMPLICATURE-INT", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assertion_utilities", "rkf_note_successful_assertion", "RKF-NOTE-SUCCESSFUL-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assertion_utilities", "rkf_assertion_that_succeededP", "RKF-ASSERTION-THAT-SUCCEEDED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assertion_utilities", "rkf_formula_usable_for_implicature_repairP", "RKF-FORMULA-USABLE-FOR-IMPLICATURE-REPAIR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assertion_utilities", "rkf_best_defining_mt_for_fort", "RKF-BEST-DEFINING-MT-FOR-FORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assertion_utilities", "rkf_best_defining_mt_for_fort_and_sentence", "RKF-BEST-DEFINING-MT-FOR-FORT-AND-SENTENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assertion_utilities", "rkf_best_defining_mt_for_sentence", "RKF-BEST-DEFINING-MT-FOR-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assertion_utilities", "rkf_gather_expression_assertion_args", "RKF-GATHER-EXPRESSION-ASSERTION-ARGS", 1, 1, false);
        return (SubLObject)rkf_assertion_utilities.NIL;
    }
    
    public static SubLObject init_rkf_assertion_utilities_file() {
        rkf_assertion_utilities.$rkf_assertion_attribution_mt_caching_state$ = SubLFiles.deflexical("*RKF-ASSERTION-ATTRIBUTION-MT-CACHING-STATE*", (SubLObject)rkf_assertion_utilities.NIL);
        return (SubLObject)rkf_assertion_utilities.NIL;
    }
    
    public static SubLObject setup_rkf_assertion_utilities_file() {
        memoization_state.note_globally_cached_function((SubLObject)rkf_assertion_utilities.$sym1$RKF_ASSERTION_ATTRIBUTION_MT);
        return (SubLObject)rkf_assertion_utilities.NIL;
    }
    
    public void declareFunctions() {
        declare_rkf_assertion_utilities_file();
    }
    
    public void initializeVariables() {
        init_rkf_assertion_utilities_file();
    }
    
    public void runTopLevelForms() {
        setup_rkf_assertion_utilities_file();
    }
    
    static {
        me = (SubLFile)new rkf_assertion_utilities();
        rkf_assertion_utilities.$rkf_assertion_attribution_mt_caching_state$ = null;
        $str0$HYP_RKF = SubLObjectFactory.makeString("HYP-RKF");
        $sym1$RKF_ASSERTION_ATTRIBUTION_MT = SubLObjectFactory.makeSymbol("RKF-ASSERTION-ATTRIBUTION-MT");
        $const2$UIABookkeepingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UIABookkeepingMt"));
        $const3$BookkeepingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BookkeepingMt"));
        $sym4$_RKF_ASSERTION_ATTRIBUTION_MT_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RKF-ASSERTION-ATTRIBUTION-MT-CACHING-STATE*");
        $const5$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
        $const6$assertedUsingTool = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedUsingTool"));
        $kw7$PARTIAL = SubLObjectFactory.makeKeyword("PARTIAL");
        $sym8$HL_CONJUNCT_TO_SUPPORT = SubLObjectFactory.makeSymbol("HL-CONJUNCT-TO-SUPPORT");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"));
        $const10$unknownSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence"));
        $const11$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const12$disjointWith = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith"));
        $const13$not = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not"));
        $kw14$ISA = SubLObjectFactory.makeKeyword("ISA");
        $const15$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $kw16$GENLS = SubLObjectFactory.makeKeyword("GENLS");
        $kw17$DISJOINTWITH = SubLObjectFactory.makeKeyword("DISJOINTWITH");
        $kw18$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $const19$rejectedSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rejectedSentence"));
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ISA"), (SubLObject)SubLObjectFactory.makeKeyword("GENLS"));
        $kw21$MT = SubLObjectFactory.makeKeyword("MT");
        $const22$definingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("definingMt"));
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MT"));
        $const24$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), (SubLObject)rkf_assertion_utilities.TWO_INTEGER);
        $const26$defaultDefiningMtForSentenceOnTer = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defaultDefiningMtForSentenceOnTerm"));
        $const27$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $const28$implies = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies"));
        $const29$defaultDefiningMtForSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defaultDefiningMtForSentence"));
        $kw30$MAX_TRANSFORMATION_DEPTH = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $kw31$CONDITIONAL_SENTENCE_ = SubLObjectFactory.makeKeyword("CONDITIONAL-SENTENCE?");
        $kw32$ARG = SubLObjectFactory.makeKeyword("ARG");
        $const33$argIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argIsa"));
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ARG"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLAssertion")));
    }
}

/*

	Total time: 264 ms
	
*/