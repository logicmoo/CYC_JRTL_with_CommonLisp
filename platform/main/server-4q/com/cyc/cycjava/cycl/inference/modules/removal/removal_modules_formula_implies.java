package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.equals;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.somewhere_cache;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_formula_implies extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "1d9c0c4e0fd0dcccef160d101cb2aa9925611af0f1d6a41acbaeab26fe56aa73";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 1000L)
    private static SubLSymbol $removal_formula_implies_allow_subsumption$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 2000L)
    private static SubLSymbol $default_removal_formula_implies_pos_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 5700L)
    private static SubLSymbol $default_removal_formula_equiv_pos_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 6400L)
    private static SubLSymbol $inference_formula_equiv_commutative_relation_table$;
    private static SubLObject $$sentenceImplies;
    private static SubLSymbol $REMOVAL_FORMULA_IMPLIES_POS_CHECK;
    private static SubLList $list2;
    private static SubLSymbol $OPAQUE;
    private static SubLSymbol $TRUE_MON;
    private static SubLObject $$sentenceImpliesViaSubsumption;
    private static SubLSymbol $REMOVAL_FORMULA_IMPLIES_SUBSUMPTION_POS_CHECK;
    private static SubLList $list7;
    private static SubLObject $$sentenceEquiv;
    private static SubLSymbol $REMOVAL_FORMULA_EQUIV_POS_CHECK;
    private static SubLList $list10;
    private static SubLSymbol $sym11$CATCH_ERROR_MESSAGE_HANDLER;
    private static SubLObject $$and;
    private static SubLObject $$or;
    private static SubLObject $$not;
    private static SubLObject $$thereExists;
    private static SubLObject $$forAll;
    private static SubLObject $$TheSetOf;
    private static SubLObject $$implies;
    private static SubLSymbol $sym19$CAR;
    private static SubLObject $$sentenceImplicationConditions;
    private static SubLSymbol $POS;
    private static SubLSymbol $REMOVAL_SENTENCE_IMPLICATION_CONDITIONS;
    private static SubLList $list23;
    private static SubLObject $$isa;
    private static SubLSymbol $RULE;
    private static SubLObject $$genls;
    private static SubLSymbol $sym27$EL_VAR_;
    private static SubLObject $$BaseKB;
    private static SubLObject $$ruleTrivialForSentenceImplication;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 2200L)
    public static SubLObject make_formula_implies_hl_support(SubLObject antecedent, SubLObject consequent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject support_formula = list($$sentenceImplies, antecedent, consequent);
        return arguments.make_hl_support($OPAQUE, support_formula, mt_relevance_macros.$mt$.getDynamicValue(thread), $TRUE_MON);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 2400L)
    public static SubLObject removal_formula_implies_pos_check_expand(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject antecedent = el_utilities.literal_arg1(literal, UNPROVIDED);
        SubLObject consequent = el_utilities.literal_arg2(literal, UNPROVIDED);
        SubLObject _prev_bind_0 = $removal_formula_implies_allow_subsumption$.currentBinding(thread);
        try {
            $removal_formula_implies_allow_subsumption$.bind(NIL, thread);
            if (NIL != inference_formula_implies(antecedent, consequent)) {
                SubLObject hl_support = make_formula_implies_hl_support(antecedent, consequent);
                backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
            }
        } finally {
            $removal_formula_implies_allow_subsumption$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 4000L)
    public static SubLObject make_formula_implies_subsumption_hl_support(SubLObject antecedent, SubLObject consequent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject support_formula = list($$sentenceImpliesViaSubsumption, antecedent, consequent);
        return arguments.make_hl_support($OPAQUE, support_formula, mt_relevance_macros.$mt$.getDynamicValue(thread), $TRUE_MON);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 4300L)
    public static SubLObject removal_formula_implies_subsumption_pos_check_expand(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject antecedent = el_utilities.literal_arg1(literal, UNPROVIDED);
        SubLObject consequent = el_utilities.literal_arg2(literal, UNPROVIDED);
        SubLObject _prev_bind_0 = $removal_formula_implies_allow_subsumption$.currentBinding(thread);
        try {
            $removal_formula_implies_allow_subsumption$.bind(T, thread);
            if (NIL != inference_formula_implies(antecedent, consequent)) {
                SubLObject hl_support = make_formula_implies_subsumption_hl_support(antecedent, consequent);
                backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
            }
        } finally {
            $removal_formula_implies_allow_subsumption$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 5800L)
    public static SubLObject make_formula_equiv_hl_support(SubLObject formula1, SubLObject formula2) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject support_formula = list($$sentenceEquiv, formula1, formula2);
        return arguments.make_hl_support($OPAQUE, support_formula, mt_relevance_macros.$mt$.getDynamicValue(thread), $TRUE_MON);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 6000L)
    public static SubLObject removal_formula_equiv_pos_check_expand(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject formula1 = el_utilities.literal_arg1(literal, UNPROVIDED);
        SubLObject formula2 = el_utilities.literal_arg2(literal, UNPROVIDED);
        if (NIL != inference_formula_equiv(formula1, formula2)) {
            SubLObject hl_support = make_formula_equiv_hl_support(formula1, formula2);
            backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 7600L)
    public static SubLObject inference_formula_equiv(SubLObject formula1, SubLObject formula2) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == cycl_grammar.cycl_sentence_p(formula1) || NIL == cycl_grammar.cycl_sentence_p(formula2)) {
            return NIL;
        }
        SubLObject error_message = NIL;
        SubLObject v_answer = NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind($sym11$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    SubLObject _prev_bind_0_$1 = $inference_formula_equiv_commutative_relation_table$.currentBinding(thread);
                    try {
                        $inference_formula_equiv_commutative_relation_table$.bind(NIL, thread);
                        SubLObject formula1_hl = canonicalize_scoped_el_existentials_to_hl(formula1);
                        SubLObject formula2_hl = unification.non_base_variable_transform(canonicalize_scoped_el_existentials_to_hl(formula2));
                        v_answer = makeBoolean(NIL != inference_formula_implies_formula(formula1_hl, formula2_hl, NIL) && NIL != inference_formula_implies_formula(formula2_hl, formula1_hl, NIL));
                    } finally {
                        $inference_formula_equiv_commutative_relation_table$.rebind(_prev_bind_0_$1, thread);
                    }
                } catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error_message) {
            return NIL;
        }
        return v_answer;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 8500L)
    public static SubLObject inference_formula_implies(SubLObject antecedent, SubLObject consequent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == cycl_grammar.cycl_sentence_p(antecedent) || NIL == cycl_grammar.cycl_sentence_p(consequent)) {
            return NIL;
        }
        SubLObject error_message = NIL;
        SubLObject v_answer = NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind($sym11$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    SubLObject _prev_bind_0_$2 = $inference_formula_equiv_commutative_relation_table$.currentBinding(thread);
                    try {
                        $inference_formula_equiv_commutative_relation_table$.bind(NIL, thread);
                        SubLObject antecedent_hl = canonicalize_scoped_el_existentials_to_hl(antecedent);
                        SubLObject consequent_hl = unification.non_base_variable_transform(canonicalize_scoped_el_existentials_to_hl(consequent));
                        v_answer = inference_formula_implies_formula(antecedent_hl, consequent_hl, NIL);
                    } finally {
                        $inference_formula_equiv_commutative_relation_table$.rebind(_prev_bind_0_$2, thread);
                    }
                } catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error_message) {
            return NIL;
        }
        return v_answer;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 9400L)
    public static SubLObject canonicalize_scoped_el_existentials_to_hl(SubLObject expression) {
        SubLObject v_bindings = NIL;
        while (NIL != el_utilities.el_existential_p(expression)) {
            SubLObject quant_formula = cycl_utilities.atomic_sentence_arg2(expression, UNPROVIDED);
            SubLObject quant_variable_el = cycl_utilities.atomic_sentence_arg1(expression, UNPROVIDED);
            SubLObject quant_variable_hl = variables.get_variable(Sequences.length(v_bindings));
            v_bindings = cons(cons(quant_variable_el, quant_variable_hl), v_bindings);
            expression = quant_formula;
        }
        SubLObject expression_hl = bindings.subst_bindings(v_bindings, expression);
        return subl_promotions.values2(expression_hl, v_bindings);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 9900L)
    public static SubLObject inference_formula_implies_in_mt(SubLObject antecedent, SubLObject consequent, SubLObject mt) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = inference_formula_implies(antecedent, consequent);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 10100L)
    public static SubLObject inference_formula_equiv_commutative_relationP(SubLObject relation) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject info = conses_high.assoc(relation, $inference_formula_equiv_commutative_relation_table$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        if (NIL != info) {
            return info.rest();
        }
        SubLObject v_answer = fort_types_interface.commutative_relationP(relation);
        $inference_formula_equiv_commutative_relation_table$.setDynamicValue(cons(cons(relation, v_answer), $inference_formula_equiv_commutative_relation_table$.getDynamicValue(thread)), thread);
        return v_answer;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 10500L)
    public static SubLObject inference_formula_implies_formula(SubLObject antecedent, SubLObject consequent, SubLObject v_bindings) {
        if (antecedent.equal(consequent)) {
            return subl_promotions.values2(T, v_bindings);
        }
        if (NIL != cycl_grammar.cycl_true_p(consequent)) {
            return subl_promotions.values2(T, v_bindings);
        }
        if (NIL != nart_handles.nart_p(antecedent)) {
            return inference_formula_implies_formula(narts_high.nart_hl_formula(antecedent), consequent, v_bindings);
        }
        if (NIL != nart_handles.nart_p(consequent)) {
            return inference_formula_implies_formula(antecedent, narts_high.nart_hl_formula(consequent), v_bindings);
        }
        if (antecedent.isAtom()) {
            return inference_formula_implies_term(antecedent, consequent, v_bindings);
        }
        antecedent = inference_formula_implies_eliminate_double_negations(inference_formula_implies_eliminate_implication(antecedent));
        consequent = inference_formula_implies_eliminate_double_negations(inference_formula_implies_eliminate_implication(consequent));
        SubLObject pcase_var;
        SubLObject ante_relator = pcase_var = antecedent.first();
        if (pcase_var.eql($$and)) {
            return inference_formula_implies_and(antecedent, consequent, v_bindings);
        }
        if (pcase_var.eql($$or)) {
            return inference_formula_implies_or(antecedent, consequent, v_bindings);
        }
        if (pcase_var.eql($$not)) {
            return inference_formula_implies_not(antecedent, consequent, v_bindings);
        }
        if (pcase_var.eql($$thereExists)) {
            return inference_formula_implies_exists(antecedent, consequent, v_bindings);
        }
        if (pcase_var.eql($$forAll)) {
            return inference_formula_implies_all(antecedent, consequent, v_bindings);
        }
        if (pcase_var.eql($$TheSetOf)) {
            return inference_formula_implies_the_set_of(antecedent, consequent, v_bindings);
        }
        return inference_formula_implies_literal(antecedent, consequent, v_bindings);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 13000L)
    public static SubLObject inference_formula_implies_eliminate_double_negations(SubLObject formula) {
        if ($$not.eql(cycl_utilities.formula_operator(formula)) && $$not.eql(cycl_utilities.formula_operator(cycl_utilities.formula_arg1(formula, UNPROVIDED)))) {
            return inference_formula_implies_eliminate_double_negations(cycl_utilities.formula_arg1(cycl_utilities.formula_arg1(formula, UNPROVIDED), UNPROVIDED));
        }
        return formula;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 13400L)
    public static SubLObject inference_formula_implies_eliminate_implication(SubLObject formula) {
        return $$implies.eql(cycl_utilities.formula_operator(formula)) ? list($$or, list($$not, cycl_utilities.formula_arg1(formula, UNPROVIDED)), cycl_utilities.formula_arg2(formula, UNPROVIDED)) : formula;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 13600L)
    public static SubLObject inference_formula_implies_term(SubLObject antecedent, SubLObject consequent, SubLObject v_bindings) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != cycl_grammar.cycl_false_p(antecedent)) {
            return subl_promotions.values2(T, v_bindings);
        }
        if (NIL != variables.variable_p(antecedent)) {
            SubLObject antecedent_binding = Sequences.find(antecedent, v_bindings, EQUAL, $sym19$CAR, UNPROVIDED, UNPROVIDED);
            SubLObject consequent_binding = Sequences.find(consequent, v_bindings, EQUAL, $sym19$CAR, UNPROVIDED, UNPROVIDED);
            if (NIL != antecedent_binding) {
                return subl_promotions.values2(makeBoolean(antecedent_binding.equal(consequent_binding) || NIL != Sequences.find(cons(antecedent, consequent), v_bindings, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED)), v_bindings);
            }
            if (NIL != variables.variable_p(consequent)) {
                return subl_promotions.values2(T, conses_high.adjoin(cons(antecedent, consequent), v_bindings, UNPROVIDED, UNPROVIDED));
            }
            return subl_promotions.values2(NIL, v_bindings);
        } else {
            if (NIL != variables.variable_p(consequent)) {
                return subl_promotions.values2(Sequences.find(cons(consequent, antecedent), v_bindings, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED), v_bindings);
            }
            if (NIL != cycl_variables.el_varP(antecedent)) {
                SubLObject antecedent_binding = Sequences.find(antecedent, v_bindings, EQUAL, $sym19$CAR, UNPROVIDED, UNPROVIDED);
                SubLObject consequent_binding = Sequences.find(consequent, v_bindings, EQUAL, $sym19$CAR, UNPROVIDED, UNPROVIDED);
                if (NIL != antecedent_binding) {
                    return subl_promotions.values2(makeBoolean(antecedent_binding.equal(consequent_binding) || NIL != Sequences.find(cons(antecedent, consequent), v_bindings, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED)), v_bindings);
                }
                if (NIL != cycl_variables.el_varP(consequent)) {
                    return subl_promotions.values2(T, conses_high.adjoin(cons(antecedent, consequent), v_bindings, UNPROVIDED, UNPROVIDED));
                }
                return subl_promotions.values2(NIL, v_bindings);
            } else {
                if (NIL != cycl_variables.el_varP(consequent)) {
                    return subl_promotions.values2(Sequences.find(cons(consequent, antecedent), v_bindings, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED), v_bindings);
                }
                if (!consequent.isAtom()) {
                    return subl_promotions.values2(NIL, v_bindings);
                }
                if (NIL == $removal_formula_implies_allow_subsumption$.getDynamicValue(thread)) {
                    return subl_promotions.values2(equals.equalsP(antecedent, consequent, UNPROVIDED, UNPROVIDED), v_bindings);
                }
                if (NIL != forts.fort_p(antecedent) && NIL != forts.fort_p(consequent)) {
                    return subl_promotions.values2(makeBoolean(NIL != equals.equalsP(antecedent, consequent, UNPROVIDED, UNPROVIDED) || NIL != genl_predicates.genl_predP(antecedent, consequent, UNPROVIDED, UNPROVIDED)
                            || NIL != genl_predicates.genl_inverseP(antecedent, consequent, UNPROVIDED, UNPROVIDED) || NIL != genls.genlsP(antecedent, consequent, UNPROVIDED, UNPROVIDED)), v_bindings);
                }
                return subl_promotions.values2(equals.equalsP(antecedent, consequent, UNPROVIDED, UNPROVIDED), v_bindings);
            }
        }
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 15800L)
    public static SubLObject inference_formula_implies_and(SubLObject antecedent, SubLObject consequent, SubLObject v_bindings) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (consequent.isAtom()) {
            return subl_promotions.values2(NIL, v_bindings);
        }
        SubLObject antecedent_conjuncts = antecedent.rest();
        SubLObject consequent_relator = consequent.first();
        SubLObject all_bindings = v_bindings;
        SubLObject pcase_var = consequent_relator;
        if (pcase_var.eql($$and)) {
            SubLObject cdolist_list_var;
            SubLObject consequent_conjuncts = cdolist_list_var = consequent.rest();
            SubLObject consequent_conjunct = NIL;
            consequent_conjunct = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject found = NIL;
                SubLObject new_bindings = NIL;
                SubLObject matching_conjunct = NIL;
                if (NIL == found) {
                    SubLObject csome_list_var;
                    SubLObject antecedent_conjunct;
                    SubLObject result;
                    SubLObject possibly_updated_bindings;
                    for (csome_list_var = antecedent_conjuncts, antecedent_conjunct = NIL, antecedent_conjunct = csome_list_var.first(); NIL == found
                            && NIL != csome_list_var; found = result, matching_conjunct = antecedent_conjunct, new_bindings = possibly_updated_bindings, csome_list_var = csome_list_var.rest(), antecedent_conjunct = csome_list_var.first()) {
                        thread.resetMultipleValues();
                        result = inference_formula_implies_formula(antecedent_conjunct, consequent_conjunct, all_bindings);
                        possibly_updated_bindings = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                    }
                }
                if (NIL == found) {
                    return subl_promotions.values2(NIL, v_bindings);
                }
                antecedent_conjuncts = Sequences.remove(matching_conjunct, antecedent_conjuncts, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                all_bindings = conses_high.union(all_bindings, new_bindings, EQUAL, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                consequent_conjunct = cdolist_list_var.first();
            }
            return subl_promotions.values2(T, all_bindings);
        }
        SubLObject cdolist_list_var2 = antecedent_conjuncts;
        SubLObject antecedent_conjunct2 = NIL;
        antecedent_conjunct2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            thread.resetMultipleValues();
            SubLObject result2 = inference_formula_implies_formula(antecedent_conjunct2, consequent, all_bindings);
            SubLObject possibly_updated_bindings2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != result2) {
                return subl_promotions.values2(T, conses_high.union(all_bindings, possibly_updated_bindings2, EQUAL, UNPROVIDED));
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            antecedent_conjunct2 = cdolist_list_var2.first();
        }
        return subl_promotions.values2(NIL, v_bindings);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 17400L)
    public static SubLObject inference_formula_implies_or(SubLObject antecedent, SubLObject consequent, SubLObject v_bindings) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (consequent.isAtom()) {
            return subl_promotions.values2(NIL, v_bindings);
        }
        SubLObject antecedent_disjuncts = antecedent.rest();
        SubLObject consequent_relator = consequent.first();
        SubLObject all_bindings = v_bindings;
        SubLObject pcase_var = consequent_relator;
        if (pcase_var.eql($$or)) {
            SubLObject consequent_disjuncts = consequent.rest();
            SubLObject cdolist_list_var = antecedent_disjuncts;
            SubLObject antecedent_disjunct = NIL;
            antecedent_disjunct = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject found = NIL;
                SubLObject new_bindings = NIL;
                if (NIL == found) {
                    SubLObject csome_list_var = consequent_disjuncts;
                    SubLObject consequent_disjunct = NIL;
                    consequent_disjunct = csome_list_var.first();
                    while (NIL == found && NIL != csome_list_var) {
                        thread.resetMultipleValues();
                        SubLObject result = inference_formula_implies_formula(antecedent_disjunct, consequent_disjunct, all_bindings);
                        SubLObject possibly_updated_bindings = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        found = result;
                        new_bindings = possibly_updated_bindings;
                        csome_list_var = csome_list_var.rest();
                        consequent_disjunct = csome_list_var.first();
                    }
                }
                if (NIL == found) {
                    return subl_promotions.values2(NIL, v_bindings);
                }
                all_bindings = conses_high.union(all_bindings, new_bindings, EQUAL, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                antecedent_disjunct = cdolist_list_var.first();
            }
            return subl_promotions.values2(T, all_bindings);
        }
        SubLObject cdolist_list_var2 = antecedent_disjuncts;
        SubLObject antecedent_disjunct2 = NIL;
        antecedent_disjunct2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            thread.resetMultipleValues();
            SubLObject found2 = inference_formula_implies_formula(antecedent_disjunct2, consequent, all_bindings);
            SubLObject possibly_updated_bindings2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL == found2) {
                return subl_promotions.values2(NIL, v_bindings);
            }
            all_bindings = conses_high.union(all_bindings, possibly_updated_bindings2, EQUAL, UNPROVIDED);
            cdolist_list_var2 = cdolist_list_var2.rest();
            antecedent_disjunct2 = cdolist_list_var2.first();
        }
        return subl_promotions.values2(T, all_bindings);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 18800L)
    public static SubLObject inference_formula_implies_not(SubLObject antecedent, SubLObject consequent, SubLObject v_bindings) {
        if (consequent.isAtom()) {
            return subl_promotions.values2(NIL, v_bindings);
        }
        SubLObject antecedent_formula = conses_high.second(antecedent);
        SubLObject pcase_var;
        SubLObject consequent_relator = pcase_var = consequent.first();
        if (pcase_var.eql($$not)) {
            SubLObject consequent_formula = conses_high.second(consequent);
            return inference_formula_implies_formula(consequent_formula, antecedent_formula, v_bindings);
        }
        return subl_promotions.values2(NIL, v_bindings);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 19400L)
    public static SubLObject inference_formula_implies_exists(SubLObject antecedent, SubLObject consequent, SubLObject v_bindings) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (consequent.isAtom()) {
            return subl_promotions.values2(NIL, v_bindings);
        }
        SubLObject antecedent_variable = conses_high.second(antecedent);
        SubLObject antecedent_formula = conses_high.third(antecedent);
        thread.resetMultipleValues();
        SubLObject result = inference_formula_implies_formula(antecedent_formula, consequent, v_bindings);
        SubLObject possibly_updated_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != result) {
            return subl_promotions.values2(T, conses_high.union(v_bindings, possibly_updated_bindings, EQUAL, UNPROVIDED));
        }
        SubLObject pcase_var;
        SubLObject consequent_relator = pcase_var = consequent.first();
        if (!pcase_var.eql($$thereExists)) {
            return subl_promotions.values2(NIL, v_bindings);
        }
        SubLObject consequent_variable = conses_high.second(consequent);
        SubLObject consequent_formula = conses_high.third(consequent);
        thread.resetMultipleValues();
        SubLObject term_result = inference_formula_implies_term(antecedent_variable, consequent_variable, v_bindings);
        SubLObject term_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        SubLObject formula_result = inference_formula_implies_formula(antecedent_formula, consequent_formula, v_bindings);
        SubLObject formula_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != term_result && NIL != formula_result) {
            return subl_promotions.values2(T, conses_high.union(conses_high.union(v_bindings, term_bindings, EQUAL, UNPROVIDED), formula_bindings, EQUAL, UNPROVIDED));
        }
        return subl_promotions.values2(NIL, v_bindings);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 21100L)
    public static SubLObject inference_formula_implies_all(SubLObject antecedent, SubLObject consequent, SubLObject v_bindings) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (consequent.isAtom()) {
            return subl_promotions.values2(NIL, v_bindings);
        }
        SubLObject antecedent_variable = conses_high.second(antecedent);
        SubLObject antecedent_formula = conses_high.third(antecedent);
        SubLObject pcase_var;
        SubLObject consequent_relator = pcase_var = consequent.first();
        if (!pcase_var.eql($$forAll)) {
            return subl_promotions.values2(NIL, v_bindings);
        }
        SubLObject consequent_variable = conses_high.second(consequent);
        SubLObject consequent_formula = conses_high.third(consequent);
        thread.resetMultipleValues();
        SubLObject term_result = inference_formula_implies_term(antecedent_variable, consequent_variable, v_bindings);
        SubLObject term_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        SubLObject formula_result = inference_formula_implies_formula(antecedent_formula, consequent_formula, v_bindings);
        SubLObject formula_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != term_result && NIL != formula_result) {
            return subl_promotions.values2(T, conses_high.union(conses_high.union(v_bindings, term_bindings, EQUAL, UNPROVIDED), formula_bindings, EQUAL, UNPROVIDED));
        }
        return subl_promotions.values2(NIL, v_bindings);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 22100L)
    public static SubLObject inference_formula_implies_the_set_of(SubLObject antecedent, SubLObject consequent, SubLObject v_bindings) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (consequent.isAtom()) {
            return subl_promotions.values2(NIL, v_bindings);
        }
        SubLObject antecedent_variable = conses_high.second(antecedent);
        SubLObject antecedent_formula = conses_high.third(antecedent);
        SubLObject pcase_var;
        SubLObject consequent_relator = pcase_var = consequent.first();
        if (!pcase_var.eql($$TheSetOf)) {
            return subl_promotions.values2(NIL, v_bindings);
        }
        SubLObject consequent_variable = conses_high.second(consequent);
        SubLObject consequent_formula = conses_high.third(consequent);
        thread.resetMultipleValues();
        SubLObject term_result = inference_formula_implies_term(antecedent_variable, consequent_variable, v_bindings);
        SubLObject term_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        SubLObject formula_result = inference_formula_implies_formula(antecedent_formula, consequent_formula, v_bindings);
        SubLObject formula_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != term_result && NIL != formula_result) {
            return subl_promotions.values2(T, conses_high.union(conses_high.union(v_bindings, term_bindings, EQUAL, UNPROVIDED), formula_bindings, EQUAL, UNPROVIDED));
        }
        return subl_promotions.values2(NIL, v_bindings);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 23200L)
    public static SubLObject inference_formula_implies_literal(SubLObject antecedent, SubLObject consequent, SubLObject v_bindings) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (consequent.isAtom()) {
            return subl_promotions.values2(NIL, v_bindings);
        }
        SubLObject consequent_relator = consequent.first();
        SubLObject all_bindings = v_bindings;
        SubLObject pcase_var = consequent_relator;
        if (pcase_var.eql($$or)) {
            SubLObject cdolist_list_var;
            SubLObject consequent_disjuncts = cdolist_list_var = consequent.rest();
            SubLObject consequent_disjunct = NIL;
            consequent_disjunct = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                thread.resetMultipleValues();
                SubLObject result = inference_formula_implies_formula(antecedent, consequent_disjunct, v_bindings);
                SubLObject new_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != result) {
                    return subl_promotions.values2(T, conses_high.union(all_bindings, new_bindings, EQUAL, UNPROVIDED));
                }
                cdolist_list_var = cdolist_list_var.rest();
                consequent_disjunct = cdolist_list_var.first();
            }
            return subl_promotions.values2(NIL, v_bindings);
        }
        if (pcase_var.eql($$and)) {
            SubLObject cdolist_list_var;
            SubLObject consequent_conjuncts = cdolist_list_var = consequent.rest();
            SubLObject consequent_conjunct = NIL;
            consequent_conjunct = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                thread.resetMultipleValues();
                SubLObject result = inference_formula_implies_formula(antecedent, consequent_conjunct, v_bindings);
                SubLObject new_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL == result) {
                    return subl_promotions.values2(NIL, v_bindings);
                }
                all_bindings = conses_high.union(all_bindings, new_bindings, EQUAL, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                consequent_conjunct = cdolist_list_var.first();
            }
            return subl_promotions.values2(T, all_bindings);
        }
        if (pcase_var.eql($$thereExists)) {
            SubLObject consequent_formula = cycl_utilities.formula_arg2(consequent, UNPROVIDED);
            thread.resetMultipleValues();
            SubLObject result2 = inference_formula_implies_formula(antecedent, consequent_formula, v_bindings);
            SubLObject new_bindings2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != result2) {
                return subl_promotions.values2(T, conses_high.union(all_bindings, new_bindings2, EQUAL, UNPROVIDED));
            }
            return subl_promotions.values2(NIL, v_bindings);
        } else {
            thread.resetMultipleValues();
            SubLObject result3 = inference_formula_implies_asent(antecedent, consequent, v_bindings);
            SubLObject new_bindings3 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != result3) {
                return subl_promotions.values2(T, conses_high.union(all_bindings, new_bindings3, EQUAL, UNPROVIDED));
            }
            return subl_promotions.values2(NIL, v_bindings);
        }
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 25100L)
    public static SubLObject inference_formula_implies_non_commutative_asent(SubLObject antecedent, SubLObject consequent, SubLObject v_bindings) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject antecedent_args = antecedent.rest();
        SubLObject consequent_args = consequent.rest();
        SubLObject all_bindings = v_bindings;
        while (NIL != antecedent_args) {
            SubLObject antecedent_arg = antecedent_args.first();
            SubLObject consequent_arg = consequent_args.first();
            thread.resetMultipleValues();
            SubLObject result = inference_formula_implies_formula(antecedent_arg, consequent_arg, all_bindings);
            SubLObject new_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL == result) {
                return subl_promotions.values2(NIL, v_bindings);
            }
            all_bindings = conses_high.union(all_bindings, new_bindings, EQUAL, UNPROVIDED);
            antecedent_args = antecedent_args.rest();
            consequent_args = consequent_args.rest();
        }
        return subl_promotions.values2(T, all_bindings);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 25900L)
    public static SubLObject inference_formula_implies_commutative_asent(SubLObject antecedent, SubLObject consequent, SubLObject v_bindings) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject antecedent_args = antecedent.rest();
        SubLObject consequent_args = consequent.rest();
        SubLObject all_bindings = v_bindings;
        SubLObject cdolist_list_var = antecedent_args;
        SubLObject antecedent_arg = NIL;
        antecedent_arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject found = NIL;
            SubLObject new_bindings = NIL;
            SubLObject matching_arg = NIL;
            if (NIL == found) {
                SubLObject csome_list_var;
                SubLObject consequent_arg;
                SubLObject result;
                SubLObject possibly_updated_bindings;
                for (csome_list_var = consequent_args, consequent_arg = NIL, consequent_arg = csome_list_var.first(); NIL == found
                        && NIL != csome_list_var; found = result, matching_arg = consequent_arg, new_bindings = possibly_updated_bindings, csome_list_var = csome_list_var.rest(), consequent_arg = csome_list_var.first()) {
                    thread.resetMultipleValues();
                    result = inference_formula_implies_formula(antecedent_arg, consequent_arg, all_bindings);
                    possibly_updated_bindings = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                }
            }
            if (NIL == found) {
                return subl_promotions.values2(NIL, v_bindings);
            }
            consequent_args = Sequences.remove(matching_arg, consequent_args, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            all_bindings = conses_high.union(all_bindings, new_bindings, EQUAL, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            antecedent_arg = cdolist_list_var.first();
        }
        cdolist_list_var = consequent_args;
        SubLObject consequent_arg2 = NIL;
        consequent_arg2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject found = NIL;
            SubLObject new_bindings = NIL;
            SubLObject matching_arg = NIL;
            if (NIL == found) {
                SubLObject csome_list_var;
                SubLObject result;
                SubLObject possibly_updated_bindings;
                SubLObject antecedent_arg2;
                for (csome_list_var = antecedent_args, antecedent_arg2 = NIL, antecedent_arg2 = csome_list_var.first(); NIL == found
                        && NIL != csome_list_var; found = result, matching_arg = antecedent_arg2, new_bindings = possibly_updated_bindings, csome_list_var = csome_list_var.rest(), antecedent_arg2 = csome_list_var.first()) {
                    thread.resetMultipleValues();
                    result = inference_formula_implies_formula(antecedent_arg2, consequent_arg2, all_bindings);
                    possibly_updated_bindings = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                }
            }
            if (NIL == found) {
                return subl_promotions.values2(NIL, v_bindings);
            }
            antecedent_args = Sequences.remove(matching_arg, antecedent_args, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            all_bindings = conses_high.union(all_bindings, new_bindings, EQUAL, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            consequent_arg2 = cdolist_list_var.first();
        }
        return subl_promotions.values2(T, all_bindings);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 27400L)
    public static SubLObject inference_formula_implies_asent(SubLObject antecedent, SubLObject consequent, SubLObject v_bindings) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (consequent.isAtom()) {
            return subl_promotions.values2(NIL, v_bindings);
        }
        SubLObject antecedent_relator = antecedent.first();
        SubLObject antecedent_args = antecedent.rest();
        SubLObject antecedent_arity = Sequences.length(antecedent_args);
        SubLObject consequent_relator = consequent.first();
        SubLObject consequent_args = consequent.rest();
        SubLObject consequent_arity = Sequences.length(consequent_args);
        SubLObject all_bindings = conses_high.union(v_bindings, unification_utilities.term_unify(antecedent, consequent, UNPROVIDED, UNPROVIDED), EQUAL, UNPROVIDED);
        if (!antecedent_arity.numE(consequent_arity)) {
            return subl_promotions.values2(NIL, v_bindings);
        }
        if (NIL == inference_formula_implies_formula(antecedent_relator, consequent_relator, all_bindings)) {
            return subl_promotions.values2(NIL, v_bindings);
        }
        if (NIL != $removal_formula_implies_allow_subsumption$.getDynamicValue(thread) && NIL != forts.fort_p(antecedent_relator) && NIL != forts.fort_p(consequent_relator) && NIL != genl_predicates.genl_inverseP(antecedent_relator, consequent_relator, UNPROVIDED, UNPROVIDED)) {
            thread.resetMultipleValues();
            SubLObject result = inference_formula_implies_genl_inverse(antecedent, consequent, all_bindings);
            SubLObject new_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != result) {
                return subl_promotions.values2(T, conses_high.union(all_bindings, new_bindings, EQUAL, UNPROVIDED));
            }
            if (NIL != inference_formula_equiv_commutative_relationP(antecedent_relator)) {
                thread.resetMultipleValues();
                result = inference_formula_implies_non_commutative_asent(antecedent, consequent, all_bindings);
                new_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != result) {
                    return subl_promotions.values2(T, conses_high.union(all_bindings, new_bindings, EQUAL, UNPROVIDED));
                }
            } else {
                thread.resetMultipleValues();
                result = inference_formula_implies_commutative_asent(antecedent, consequent, all_bindings);
                new_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != result) {
                    return subl_promotions.values2(T, conses_high.union(all_bindings, new_bindings, EQUAL, UNPROVIDED));
                }
            }
            return subl_promotions.values2(NIL, v_bindings);
        } else if (NIL == forts.fort_p(antecedent_relator) || NIL == inference_formula_equiv_commutative_relationP(antecedent_relator)) {
            thread.resetMultipleValues();
            SubLObject result = inference_formula_implies_non_commutative_asent(antecedent, consequent, all_bindings);
            SubLObject new_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != result) {
                return subl_promotions.values2(T, conses_high.union(all_bindings, new_bindings, EQUAL, UNPROVIDED));
            }
            return subl_promotions.values2(NIL, v_bindings);
        } else {
            thread.resetMultipleValues();
            SubLObject result = inference_formula_implies_commutative_asent(antecedent, consequent, all_bindings);
            SubLObject new_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != result) {
                return subl_promotions.values2(T, conses_high.union(all_bindings, new_bindings, EQUAL, UNPROVIDED));
            }
            return subl_promotions.values2(NIL, v_bindings);
        }
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 30300L)
    public static SubLObject inference_formula_implies_genl_inverse(SubLObject antecedent, SubLObject consequent, SubLObject v_bindings) {
        SubLObject antecedent_relator = cycl_utilities.atomic_sentence_arg0(antecedent);
        SubLObject antecedent_arg1 = cycl_utilities.atomic_sentence_arg1(antecedent, UNPROVIDED);
        SubLObject antecedent_arg2 = cycl_utilities.atomic_sentence_arg2(antecedent, UNPROVIDED);
        SubLObject consequent_relator = cycl_utilities.atomic_sentence_arg0(consequent);
        SubLObject consequent_arg1 = cycl_utilities.atomic_sentence_arg1(consequent, UNPROVIDED);
        SubLObject consequent_arg2 = cycl_utilities.atomic_sentence_arg2(consequent, UNPROVIDED);
        SubLObject all_bindings = conses_high.union(v_bindings, unification_utilities.term_unify(list(antecedent_arg1, antecedent_arg2), list(consequent_arg2, consequent_arg1), UNPROVIDED, UNPROVIDED), EQUAL, UNPROVIDED);
        if (NIL != genl_predicates.genl_inverseP(antecedent_relator, consequent_relator, UNPROVIDED, UNPROVIDED) && NIL != inference_formula_implies_term(antecedent_arg1, consequent_arg2, all_bindings) && NIL != inference_formula_implies_term(antecedent_arg2, consequent_arg1, all_bindings)) {
            return subl_promotions.values2(T, all_bindings);
        }
        return subl_promotions.values2(NIL, v_bindings);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 32600L)
    public static SubLObject removal_sentence_implication_conditions_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != genl_predicates.genl_predP(cycl_utilities.atomic_sentence_predicate(asent), $$isa, UNPROVIDED, UNPROVIDED) && NIL != variables.fully_bound_p(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED))
                && NIL != fort_types_interface.collection_p(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED))) {
            SubLObject quoted_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject sentence = czer_main.unquote_quoted_term(quoted_sentence, UNPROVIDED);
            SubLObject col = cycl_utilities.sentence_arg2(sentence, UNPROVIDED);
            SubLObject cdolist_list_var = genls.all_specs(col, UNPROVIDED, UNPROVIDED);
            SubLObject spec = NIL;
            spec = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$3 = backward_utilities.relevant_directions();
                SubLObject direction = NIL;
                direction = cdolist_list_var_$3.first();
                while (NIL != cdolist_list_var_$3) {
                    if (NIL != kb_mapping_macros.do_genls_rule_index_key_validator(spec, $POS, direction)) {
                        SubLObject iterator_var = kb_mapping_macros.new_genls_rule_final_index_spec_iterator(spec, $POS, direction);
                        SubLObject done_var = NIL;
                        SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                    SubLObject done_var_$4 = NIL;
                                    SubLObject token_var_$5 = NIL;
                                    while (NIL == done_var_$4) {
                                        SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                        SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(rule));
                                        if (NIL != valid_$6) {
                                            sic_possibly_add_node_for_possibly_matching_rule(rule, asent, UNPROVIDED);
                                        }
                                        done_var_$4 = makeBoolean(NIL == valid_$6);
                                    }
                                } finally {
                                    SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                    try {
                                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                                        SubLObject _values = Values.getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    } finally {
                                        Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                    }
                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                    direction = cdolist_list_var_$3.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                spec = cdolist_list_var.first();
            }
        } else if (NIL != genl_predicates.genl_predP(cycl_utilities.atomic_sentence_predicate(asent), $$genls, UNPROVIDED, UNPROVIDED) && NIL != variables.fully_bound_p(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED))
                && NIL != fort_types_interface.collection_p(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED))) {
            SubLObject quoted_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject sentence = czer_main.unquote_quoted_term(quoted_sentence, UNPROVIDED);
            SubLObject col = cycl_utilities.sentence_arg2(sentence, UNPROVIDED);
            SubLObject cdolist_list_var = genls.all_specs(col, UNPROVIDED, UNPROVIDED);
            SubLObject spec = NIL;
            spec = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$4 = backward_utilities.relevant_directions();
                SubLObject direction = NIL;
                direction = cdolist_list_var_$4.first();
                while (NIL != cdolist_list_var_$4) {
                    if (NIL != kb_mapping_macros.do_isa_rule_index_key_validator(spec, $POS, direction)) {
                        SubLObject iterator_var = kb_mapping_macros.new_isa_rule_final_index_spec_iterator(spec, $POS, direction);
                        SubLObject done_var = NIL;
                        SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                    SubLObject done_var_$5 = NIL;
                                    SubLObject token_var_$6 = NIL;
                                    while (NIL == done_var_$5) {
                                        SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$6);
                                        SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(rule));
                                        if (NIL != valid_$7) {
                                            sic_possibly_add_node_for_possibly_matching_rule(rule, asent, UNPROVIDED);
                                        }
                                        done_var_$5 = makeBoolean(NIL == valid_$7);
                                    }
                                } finally {
                                    SubLObject _prev_bind_2 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                    try {
                                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                                        SubLObject _values2 = Values.getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    } finally {
                                        Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_2);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                    }
                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                    direction = cdolist_list_var_$4.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                spec = cdolist_list_var.first();
            }
        } else if (NIL != variables.fully_bound_p(cycl_utilities.atomic_sentence_predicate(asent))) {
            SubLObject quoted_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject sentence = czer_main.unquote_quoted_term(quoted_sentence, UNPROVIDED);
            SubLObject pred = cycl_utilities.sentence_arg0(sentence);
            if (NIL != fort_types_interface.predicate_p(pred)) {
                SubLObject cdolist_list_var = genl_predicates.all_spec_preds(pred, UNPROVIDED, UNPROVIDED);
                SubLObject spec_pred = NIL;
                spec_pred = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$5 = backward_utilities.relevant_directions();
                    SubLObject direction = NIL;
                    direction = cdolist_list_var_$5.first();
                    while (NIL != cdolist_list_var_$5) {
                        if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(spec_pred, $POS, direction)) {
                            SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(spec_pred, $POS, direction);
                            SubLObject done_var = NIL;
                            SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                        SubLObject done_var_$6 = NIL;
                                        SubLObject token_var_$7 = NIL;
                                        while (NIL == done_var_$6) {
                                            SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$7);
                                            SubLObject valid_$8 = makeBoolean(!token_var_$7.eql(rule));
                                            if (NIL != valid_$8) {
                                                sic_possibly_add_node_for_possibly_matching_rule(rule, asent, T);
                                            }
                                            done_var_$6 = makeBoolean(NIL == valid_$8);
                                        }
                                    } finally {
                                        SubLObject _prev_bind_3 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                        try {
                                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                                            SubLObject _values3 = Values.getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values3);
                                        } finally {
                                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_3);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        }
                        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                        direction = cdolist_list_var_$5.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    spec_pred = cdolist_list_var.first();
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 34200L)
    public static SubLObject sic_possibly_add_node_for_possibly_matching_rule(SubLObject rule, SubLObject asent, SubLObject unify_all_argsP) {
        if (unify_all_argsP == UNPROVIDED) {
            unify_all_argsP = NIL;
        }
        if (NIL != rule_trivial_for_sentence_implication_conditionsP(rule)) {
            return NIL;
        }
        SubLObject quoted_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject sentence = czer_main.unquote_quoted_term(quoted_sentence, UNPROVIDED);
        SubLObject rule_el_formula = uncanonicalizer.assertion_el_formula(rule);
        SubLObject rule_consequent = cycl_utilities.sentence_arg2(rule_el_formula, UNPROVIDED);
        SubLObject consequent_bindings = (NIL != unify_all_argsP) ? unification_utilities.unify_open_el_terms(cycl_utilities.sentence_args(rule_consequent, UNPROVIDED), cycl_utilities.sentence_args(sentence, UNPROVIDED), UNPROVIDED)
                : unification_utilities.unify_open_el_terms(cycl_utilities.sentence_arg1(rule_consequent, UNPROVIDED), cycl_utilities.sentence_arg1(sentence, UNPROVIDED), UNPROVIDED);
        if (NIL != consequent_bindings) {
            SubLObject rebound_antecedent = cycl_utilities.sentence_arg1(bindings.apply_bindings(consequent_bindings, rule_el_formula), UNPROVIDED);
            SubLObject el_vars = cycl_utilities.expression_gather(rebound_antecedent, $sym27$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != ((NIL != mt_relevance_macros.any_or_all_mts_are_relevantP()) ? wff.el_lenient_wff_assertibleP(rebound_antecedent, $$BaseKB, UNPROVIDED) : wff.el_lenient_wff_assertibleP(rebound_antecedent, UNPROVIDED, UNPROVIDED))) {
                SubLObject cdolist_list_var = el_vars;
                SubLObject el_var = NIL;
                el_var = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    rebound_antecedent = el_utilities.make_binary_formula($$thereExists, el_var, rebound_antecedent);
                    cdolist_list_var = cdolist_list_var.rest();
                    el_var = cdolist_list_var.first();
                }
                SubLObject v_bindings = unification_utilities.term_unify(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), rebound_antecedent, UNPROVIDED, UNPROVIDED);
                if (NIL != v_bindings) {
                    backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, list(rule));
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 35600L)
    public static SubLObject rule_trivial_for_sentence_implication_conditionsP(SubLObject rule) {
        SubLObject cdolist_list_var = genl_predicates.all_spec_preds($$ruleTrivialForSentenceImplication, UNPROVIDED, UNPROVIDED);
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != somewhere_cache.somewhere_cached_pred_p(pred) && NIL != somewhere_cache.valid_somewhere_cache_itemP(rule) && NIL != somewhere_cache.some_pred_assertion_somewhereP(pred, rule, ONE_INTEGER, T) && NIL != kb_mapping_utilities.some_pred_value(rule, pred, UNPROVIDED, UNPROVIDED)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_formula_implies_file() {
        declareFunction("make_formula_implies_hl_support", "MAKE-FORMULA-IMPLIES-HL-SUPPORT", 2, 0, false);
        declareFunction("removal_formula_implies_pos_check_expand", "REMOVAL-FORMULA-IMPLIES-POS-CHECK-EXPAND", 1, 1, false);
        declareFunction("make_formula_implies_subsumption_hl_support", "MAKE-FORMULA-IMPLIES-SUBSUMPTION-HL-SUPPORT", 2, 0, false);
        declareFunction("removal_formula_implies_subsumption_pos_check_expand", "REMOVAL-FORMULA-IMPLIES-SUBSUMPTION-POS-CHECK-EXPAND", 1, 1, false);
        declareFunction("make_formula_equiv_hl_support", "MAKE-FORMULA-EQUIV-HL-SUPPORT", 2, 0, false);
        declareFunction("removal_formula_equiv_pos_check_expand", "REMOVAL-FORMULA-EQUIV-POS-CHECK-EXPAND", 1, 1, false);
        declareFunction("inference_formula_equiv", "INFERENCE-FORMULA-EQUIV", 2, 0, false);
        declareFunction("inference_formula_implies", "INFERENCE-FORMULA-IMPLIES", 2, 0, false);
        declareFunction("canonicalize_scoped_el_existentials_to_hl", "CANONICALIZE-SCOPED-EL-EXISTENTIALS-TO-HL", 1, 0, false);
        declareFunction("inference_formula_implies_in_mt", "INFERENCE-FORMULA-IMPLIES-IN-MT", 3, 0, false);
        declareFunction("inference_formula_equiv_commutative_relationP", "INFERENCE-FORMULA-EQUIV-COMMUTATIVE-RELATION?", 1, 0, false);
        declareFunction("inference_formula_implies_formula", "INFERENCE-FORMULA-IMPLIES-FORMULA", 3, 0, false);
        declareFunction("inference_formula_implies_eliminate_double_negations", "INFERENCE-FORMULA-IMPLIES-ELIMINATE-DOUBLE-NEGATIONS", 1, 0, false);
        declareFunction("inference_formula_implies_eliminate_implication", "INFERENCE-FORMULA-IMPLIES-ELIMINATE-IMPLICATION", 1, 0, false);
        declareFunction("inference_formula_implies_term", "INFERENCE-FORMULA-IMPLIES-TERM", 3, 0, false);
        declareFunction("inference_formula_implies_and", "INFERENCE-FORMULA-IMPLIES-AND", 3, 0, false);
        declareFunction("inference_formula_implies_or", "INFERENCE-FORMULA-IMPLIES-OR", 3, 0, false);
        declareFunction("inference_formula_implies_not", "INFERENCE-FORMULA-IMPLIES-NOT", 3, 0, false);
        declareFunction("inference_formula_implies_exists", "INFERENCE-FORMULA-IMPLIES-EXISTS", 3, 0, false);
        declareFunction("inference_formula_implies_all", "INFERENCE-FORMULA-IMPLIES-ALL", 3, 0, false);
        declareFunction("inference_formula_implies_the_set_of", "INFERENCE-FORMULA-IMPLIES-THE-SET-OF", 3, 0, false);
        declareFunction("inference_formula_implies_literal", "INFERENCE-FORMULA-IMPLIES-LITERAL", 3, 0, false);
        declareFunction("inference_formula_implies_non_commutative_asent", "INFERENCE-FORMULA-IMPLIES-NON-COMMUTATIVE-ASENT", 3, 0, false);
        declareFunction("inference_formula_implies_commutative_asent", "INFERENCE-FORMULA-IMPLIES-COMMUTATIVE-ASENT", 3, 0, false);
        declareFunction("inference_formula_implies_asent", "INFERENCE-FORMULA-IMPLIES-ASENT", 3, 0, false);
        declareFunction("inference_formula_implies_genl_inverse", "INFERENCE-FORMULA-IMPLIES-GENL-INVERSE", 3, 0, false);
        declareFunction("removal_sentence_implication_conditions_expand", "REMOVAL-SENTENCE-IMPLICATION-CONDITIONS-EXPAND", 1, 1, false);
        declareFunction("sic_possibly_add_node_for_possibly_matching_rule", "SIC-POSSIBLY-ADD-NODE-FOR-POSSIBLY-MATCHING-RULE", 2, 1, false);
        declareFunction("rule_trivial_for_sentence_implication_conditionsP", "RULE-TRIVIAL-FOR-SENTENCE-IMPLICATION-CONDITIONS?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_formula_implies_file() {
        $removal_formula_implies_allow_subsumption$ = SubLFiles.defparameter("*REMOVAL-FORMULA-IMPLIES-ALLOW-SUBSUMPTION*", NIL);
        $default_removal_formula_implies_pos_check_cost$ = defparameter("*DEFAULT-REMOVAL-FORMULA-IMPLIES-POS-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        $default_removal_formula_equiv_pos_check_cost$ = defparameter("*DEFAULT-REMOVAL-FORMULA-EQUIV-POS-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        $inference_formula_equiv_commutative_relation_table$ = SubLFiles.defparameter("*INFERENCE-FORMULA-EQUIV-COMMUTATIVE-RELATION-TABLE*", NIL);
        return NIL;
    }

    public static SubLObject setup_removal_modules_formula_implies_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$sentenceImplies);
        inference_modules.inference_removal_module($REMOVAL_FORMULA_IMPLIES_POS_CHECK, $list2);
        inference_modules.register_solely_specific_removal_module_predicate($$sentenceImpliesViaSubsumption);
        inference_modules.inference_removal_module($REMOVAL_FORMULA_IMPLIES_SUBSUMPTION_POS_CHECK, $list7);
        inference_modules.register_solely_specific_removal_module_predicate($$sentenceEquiv);
        inference_modules.inference_removal_module($REMOVAL_FORMULA_EQUIV_POS_CHECK, $list10);
        inference_modules.register_solely_specific_removal_module_predicate($$sentenceImplicationConditions);
        preference_modules.doomed_unless_arg_bindable($POS, $$sentenceImplicationConditions, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_SENTENCE_IMPLICATION_CONDITIONS, $list23);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_formula_implies_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_formula_implies_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_formula_implies_file();
    }

    static {
        me = new removal_modules_formula_implies();
        $removal_formula_implies_allow_subsumption$ = null;
        $default_removal_formula_implies_pos_check_cost$ = null;
        $default_removal_formula_equiv_pos_check_cost$ = null;
        $inference_formula_equiv_commutative_relation_table$ = null;
        $$sentenceImplies = makeConstSym(("sentenceImplies"));
        $REMOVAL_FORMULA_IMPLIES_POS_CHECK = makeKeyword("REMOVAL-FORMULA-IMPLIES-POS-CHECK");
        $list2 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("sentenceImplies")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("sentenceImplies")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REMOVAL-FORMULA-IMPLIES-POS-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-FORMULA-IMPLIES-POS-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$sentenceImplies ANTE CONSEQ)\nwhere ANTE and CONSEQ are both fully-bound formulas\nby checking for trivial syntactic truth-preserving transformations"), makeKeyword("EXAMPLE"),
                makeString("(#$sentenceImplies\n      (#$thereExists ?DOG\n        (#$and\n          (#$isa ?DOG #$Dog)\n          (#$colorOfObject ?DOG #$RedColor)))\n    (#$thereExists ?ANIMAL\n      (#$isa ?ANIMAL #$Dog)))") });
        $OPAQUE = makeKeyword("OPAQUE");
        $TRUE_MON = makeKeyword("TRUE-MON");
        $$sentenceImpliesViaSubsumption = makeConstSym(("sentenceImpliesViaSubsumption"));
        $REMOVAL_FORMULA_IMPLIES_SUBSUMPTION_POS_CHECK = makeKeyword("REMOVAL-FORMULA-IMPLIES-SUBSUMPTION-POS-CHECK");
        $list7 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("sentenceImpliesViaSubsumption")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("sentenceImpliesViaSubsumption")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REMOVAL-FORMULA-IMPLIES-POS-CHECK-COST*"), makeKeyword("EXPAND"),
                makeSymbol("REMOVAL-FORMULA-IMPLIES-SUBSUMPTION-POS-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$sentenceImpliesViaSubsumption ANTE CONSEQ)\nwhere ANTE and CONSEQ are both fully-bound formulas.\nThis predicate is intended to function as the 'description logic analog' of sentenceImplies."), makeKeyword("EXAMPLE"), makeString(
                        "'(#$sentenceImpliesViaSubsumption\n       (#$thereExists ?X\n         (#$and\n           (#$isa ?X #$Dog)\n           (#$heightOfObject ?X (#$Foot-UnitOfMeasure 2))\n           (#$mainColorOfObject ?X #$BlackColor)))\n       (#$thereExists ?Y\n         (#$and\n           (#$isa ?Y #$Animal)\n           (#$mainColorOfObject ?Y #$BlackColor))))") });
        $$sentenceEquiv = makeConstSym(("sentenceEquiv"));
        $REMOVAL_FORMULA_EQUIV_POS_CHECK = makeKeyword("REMOVAL-FORMULA-EQUIV-POS-CHECK");
        $list10 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("sentenceEquiv")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("sentenceEquiv")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REMOVAL-FORMULA-EQUIV-POS-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-FORMULA-EQUIV-POS-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$sentenceEquiv FORMULA-1 FORMULA-2)\nwhere FORMULA-1 and FORMULA-2 are both fully-bound formulas\nby checking for trivial syntactic truth-preserving transformations"), makeKeyword("EXAMPLE"),
                makeString("(#$sentenceEquiv\n  (#$thereExists ?DOG\n    (#$and\n      (#$isa ?DOG #$Dog)\n      (#$colorOfObject ?DOG #$RedColor)))\n  (#$thereExists ?ANIMAL\n    (#$and\n      (#$colorOfObject ?ANIMAL #$RedColor)\n      (#$isa ?ANIMAL #$Dog)))))") });
        $sym11$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $$and = makeConstSym(("and"));
        $$or = makeConstSym(("or"));
        $$not = makeConstSym(("not"));
        $$thereExists = makeConstSym(("thereExists"));
        $$forAll = makeConstSym(("forAll"));
        $$TheSetOf = makeConstSym(("TheSetOf"));
        $$implies = makeConstSym(("implies"));
        $sym19$CAR = makeSymbol("CAR");
        $$sentenceImplicationConditions = makeConstSym(("sentenceImplicationConditions"));
        $POS = makeKeyword("POS");
        $REMOVAL_SENTENCE_IMPLICATION_CONDITIONS = makeKeyword("REMOVAL-SENTENCE-IMPLICATION-CONDITIONS");
        $list23 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("sentenceImplicationConditions")), makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("OR"), list(makeConstSym(("sentenceImplicationConditions")), list(makeConstSym(("Quote")), list(makeConstSym(("genls")), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND"))), makeKeyword("ANYTHING")),
                        list(makeConstSym(("sentenceImplicationConditions")), list(makeConstSym(("Quote")), list(makeConstSym(("isa")), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND"))), makeKeyword("ANYTHING")),
                        list(makeConstSym(("sentenceImplicationConditions")), list(makeConstSym(("Quote")), cons(makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING"))), makeKeyword("ANYTHING")),
                        list(makeConstSym(("sentenceImplicationConditions")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING"))),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SENTENCE-IMPLICATION-CONDITIONS-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$sentenceImplicationConditions <genls-sentence> ?SENTENCE)"), makeKeyword("EXAMPLE"), makeString("(#$sentenceImplicationConditions (#$Quote (#$genls ?X #$Person)) ?SENTENCE)") });
        $$isa = makeConstSym(("isa"));
        $RULE = makeKeyword("RULE");
        $$genls = makeConstSym(("genls"));
        $sym27$EL_VAR_ = makeSymbol("EL-VAR?");
        $$BaseKB = makeConstSym(("BaseKB"));
        $$ruleTrivialForSentenceImplication = makeConstSym(("ruleTrivialForSentenceImplicationConditions"));
    }
}
/*
 *
 * Total time: 297 ms
 *
 */