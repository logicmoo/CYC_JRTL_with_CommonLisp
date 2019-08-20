package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.at_admitted;
import com.cyc.cycjava.cycl.at_defns;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_admitted_formula extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "6d343951bb19ad9dd8668f78dcdd51fa16961dfb548ad2d336a19e8907af439a";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-admitted-formula.lisp", position = 1900L)
    private static SubLSymbol $default_removal_admitted_formula_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-admitted-formula.lisp", position = 5600L)
    private static SubLSymbol $default_removal_admitted_argument_check_cost$;
    private static SubLObject $$admittedSentence;
    private static SubLSymbol $REMOVAL_NON_WFF_CHECK_NEG;
    private static SubLSymbol $BOTH;
    private static SubLSymbol $ADMIT;
    private static SubLSymbol $REMOVAL_ADMITTED_SENTENCE_POS;
    private static SubLList $list5;
    private static SubLSymbol $IGNORE;
    private static SubLObject $$True;
    private static SubLSymbol $REMOVAL_ADMITTED_SENTENCE_NEG;
    private static SubLList $list9;
    private static SubLObject $$admittedArgument;
    private static SubLSymbol $REMOVAL_ADMITTED_ARGUMENT_CHECK_POS;
    private static SubLList $list12;
    private static SubLFloat $float$0_9;
    private static SubLSymbol $GAF;
    private static SubLSymbol $TRUE;
    private static SubLObject $$Thing;
    private static SubLSymbol $REMOVAL_ADMITTED_ARGUMENT_CHECK_NEG;
    private static SubLList $list18;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-admitted-formula.lisp", position = 900L)
    public static SubLObject removal_admitted_sentence_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject formula = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject admitted = inference_admitted_sentence(formula, UNPROVIDED);
        if (NIL != admitted) {
            backward.removal_add_node(arguments.make_hl_support($ADMIT, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-admitted-formula.lisp", position = 2000L)
    public static SubLObject inference_admitted_formula(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != el_utilities.el_formula_p(formula)) {
            if (NIL == el_utilities.contains_subformula_p(formula)) {
                SubLObject relation = cycl_utilities.formula_operator(formula);
                SubLObject argnum = ZERO_INTEGER;
                SubLObject cdolist_list_var;
                SubLObject args = cdolist_list_var = cycl_utilities.formula_args(formula, $IGNORE);
                SubLObject arg = NIL;
                arg = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    argnum = Numbers.add(argnum, ONE_INTEGER);
                    if (NIL == inference_admitted_argument(arg, argnum, relation, mt)) {
                        return NIL;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                }
            }
            return at_admitted.admitted_formulaP(formula, mt);
        }
        return Equality.eql($$True, formula);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-admitted-formula.lisp", position = 2500L)
    public static SubLObject inference_admitted_sentence(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != el_utilities.el_formula_p(sentence)) {
            if (NIL == el_utilities.contains_subformula_p(sentence)) {
                SubLObject relation = cycl_utilities.formula_operator(sentence);
                SubLObject argnum = ZERO_INTEGER;
                SubLObject cdolist_list_var;
                SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, $IGNORE);
                SubLObject arg = NIL;
                arg = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    argnum = Numbers.add(argnum, ONE_INTEGER);
                    if (NIL == inference_admitted_argument(arg, argnum, relation, mt)) {
                        return NIL;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                }
            }
            return at_admitted.admitted_sentenceP(sentence, mt);
        }
        return Equality.eql($$True, sentence);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-admitted-formula.lisp", position = 3100L)
    public static SubLObject removal_admitted_sentence_neg_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject formula = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject admitted = inference_admitted_sentence(formula, UNPROVIDED);
        if (NIL == admitted) {
            backward.removal_add_node(arguments.make_hl_support($ADMIT, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-admitted-formula.lisp", position = 4500L)
    public static SubLObject removal_admitted_argument_check_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject arg = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject relation = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        SubLObject admitted = inference_admitted_argument(v_term, arg, relation, UNPROVIDED);
        if (NIL != admitted) {
            backward.removal_add_node(arguments.make_hl_support($ADMIT, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-admitted-formula.lisp", position = 5700L)
    public static SubLObject inference_admitted_argument(SubLObject v_term, SubLObject argnum, SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == el_utilities.el_formula_p(v_term)) {
            SubLObject rejected = NIL;
            SubLObject arg_isa_pred = kb_accessors.arg_isa_pred(argnum, relation, mt);
            SubLObject mt_var = mt;
            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject arg_isa = NIL;
                SubLObject pred_var = arg_isa_pred;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, ONE_INTEGER, pred_var)) {
                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, ONE_INTEGER, pred_var);
                    SubLObject done_var = rejected;
                    SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$1 = rejected;
                                SubLObject token_var_$2 = NIL;
                                while (NIL == done_var_$1) {
                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                    SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(assertion));
                                    if (NIL != valid_$3) {
                                        arg_isa = assertions_high.gaf_arg(assertion, TWO_INTEGER);
                                        if (NIL != forts.fort_p(arg_isa) && !arg_isa.eql($$Thing) && NIL == isa.isaP(v_term, arg_isa, mt, UNPROVIDED) && NIL == at_defns.defns_admitP(arg_isa, v_term, mt)) {
                                            rejected = T;
                                        }
                                    }
                                    done_var_$1 = makeBoolean(NIL == valid_$3 || NIL != rejected);
                                }
                            } finally {
                                SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                    SubLObject _values = Values.getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                } finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid || NIL != rejected);
                    }
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            if (NIL != rejected) {
                return NIL;
            }
            SubLObject arg_genl_pred = kb_accessors.arg_genl_pred(argnum, UNPROVIDED, UNPROVIDED);
            mt_var = mt;
            _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject arg_genl = NIL;
                SubLObject pred_var = arg_genl_pred;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, ONE_INTEGER, pred_var)) {
                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, ONE_INTEGER, pred_var);
                    SubLObject done_var = rejected;
                    SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$2 = rejected;
                                SubLObject token_var_$3 = NIL;
                                while (NIL == done_var_$2) {
                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                    SubLObject valid_$4 = makeBoolean(!token_var_$3.eql(assertion));
                                    if (NIL != valid_$4) {
                                        arg_genl = assertions_high.gaf_arg(assertion, TWO_INTEGER);
                                        if (NIL != forts.fort_p(arg_genl) && !arg_genl.eql($$Thing) && NIL == genls.genlsP(v_term, arg_genl, mt, UNPROVIDED)) {
                                            rejected = T;
                                        }
                                    }
                                    done_var_$2 = makeBoolean(NIL == valid_$4 || NIL != rejected);
                                }
                            } finally {
                                SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                    SubLObject _values2 = Values.getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values2);
                                } finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid || NIL != rejected);
                    }
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            if (NIL != rejected) {
                return NIL;
            }
        }
        return at_admitted.admitted_argumentP(v_term, argnum, relation, mt);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-admitted-formula.lisp", position = 7000L)
    public static SubLObject removal_admitted_argument_check_neg_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject arg = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject relation = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        SubLObject admitted = inference_admitted_argument(v_term, arg, relation, UNPROVIDED);
        if (NIL == admitted) {
            backward.removal_add_node(arguments.make_hl_support($ADMIT, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_admitted_formula_file() {
        declareFunction("removal_admitted_sentence_pos_expand", "REMOVAL-ADMITTED-SENTENCE-POS-EXPAND", 1, 1, false);
        declareFunction("inference_admitted_formula", "INFERENCE-ADMITTED-FORMULA", 1, 1, false);
        declareFunction("inference_admitted_sentence", "INFERENCE-ADMITTED-SENTENCE", 1, 1, false);
        declareFunction("removal_admitted_sentence_neg_expand", "REMOVAL-ADMITTED-SENTENCE-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_admitted_argument_check_pos_expand", "REMOVAL-ADMITTED-ARGUMENT-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction("inference_admitted_argument", "INFERENCE-ADMITTED-ARGUMENT", 3, 1, false);
        declareFunction("removal_admitted_argument_check_neg_expand", "REMOVAL-ADMITTED-ARGUMENT-CHECK-NEG-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_admitted_formula_file() {
        $default_removal_admitted_formula_cost$ = defparameter("*DEFAULT-REMOVAL-ADMITTED-FORMULA-COST*", ONE_INTEGER);
        $default_removal_admitted_argument_check_cost$ = SubLFiles.defparameter("*DEFAULT-REMOVAL-ADMITTED-ARGUMENT-CHECK-COST*", $float$0_9);
        return NIL;
    }

    public static SubLObject setup_removal_modules_admitted_formula_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$admittedSentence);
        inference_modules.inference_removal_module_dont_use_universal($$admittedSentence, $REMOVAL_NON_WFF_CHECK_NEG);
        preference_modules.doomed_unless_all_args_bindable($BOTH, $$admittedSentence);
        inference_modules.inference_removal_module($REMOVAL_ADMITTED_SENTENCE_POS, $list5);
        inference_modules.inference_removal_module($REMOVAL_ADMITTED_SENTENCE_NEG, $list9);
        inference_modules.register_solely_specific_removal_module_predicate($$admittedArgument);
        inference_modules.inference_removal_module_dont_use_universal($$admittedArgument, $REMOVAL_NON_WFF_CHECK_NEG);
        preference_modules.doomed_unless_all_args_bindable($BOTH, $$admittedArgument);
        inference_modules.inference_removal_module($REMOVAL_ADMITTED_ARGUMENT_CHECK_POS, $list12);
        inference_modules.inference_removal_module($REMOVAL_ADMITTED_ARGUMENT_CHECK_NEG, $list18);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_admitted_formula_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_admitted_formula_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_admitted_formula_file();
    }

    static {
        me = new removal_modules_admitted_formula();
        $default_removal_admitted_formula_cost$ = null;
        $default_removal_admitted_argument_check_cost$ = null;
        $$admittedSentence = makeConstSym(("admittedSentence"));
        $REMOVAL_NON_WFF_CHECK_NEG = makeKeyword("REMOVAL-NON-WFF-CHECK-NEG");
        $BOTH = makeKeyword("BOTH");
        $ADMIT = makeKeyword("ADMIT");
        $REMOVAL_ADMITTED_SENTENCE_POS = makeKeyword("REMOVAL-ADMITTED-SENTENCE-POS");
        $list5 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("admittedSentence")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("admittedSentence")), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*DEFAULT-REMOVAL-ADMITTED-FORMULA-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ADMITTED-SENTENCE-POS-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$admittedSentence <fully-bound>)\nby checking that the formula is syntactically and semantically well-formed"), makeKeyword("EXAMPLE"), makeString("(#$admittedSentence (#$bordersOn #$Canada #$France))") });
        $IGNORE = makeKeyword("IGNORE");
        $$True = makeConstSym(("True"));
        $REMOVAL_ADMITTED_SENTENCE_NEG = makeKeyword("REMOVAL-ADMITTED-SENTENCE-NEG");
        $list9 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("admittedSentence")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("admittedSentence")), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*DEFAULT-REMOVAL-ADMITTED-FORMULA-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ADMITTED-SENTENCE-NEG-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (#$admittedSentence <fully-bound>))\nby checking that the formula is not both syntactically and semantically well-formed"), makeKeyword("EXAMPLE"), makeString("(#$not (#$admittedSentence (#$genls #$Canada #$Country)))") });
        $$admittedArgument = makeConstSym(("admittedArgument"));
        $REMOVAL_ADMITTED_ARGUMENT_CHECK_POS = makeKeyword("REMOVAL-ADMITTED-ARGUMENT-CHECK-POS");
        $list12 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("admittedArgument")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("admittedArgument")), makeKeyword("FULLY-BOUND"), makeKeyword("INTEGER"), makeKeyword("FORT")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REMOVAL-ADMITTED-ARGUMENT-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ADMITTED-ARGUMENT-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$admittedArgument <fully-bound> <integer> <fort>)\nby checking that the argument is syntactically and semantically well-formed"), makeKeyword("EXAMPLE"), makeString("(#$admittedArgument #$Canada 1 #$bordersOn)\n (#$admittedArgument #$Dog 1 #$JuvenileFn)") });
        $float$0_9 = makeDouble(0.9);
        $GAF = makeKeyword("GAF");
        $TRUE = makeKeyword("TRUE");
        $$Thing = makeConstSym(("Thing"));
        $REMOVAL_ADMITTED_ARGUMENT_CHECK_NEG = makeKeyword("REMOVAL-ADMITTED-ARGUMENT-CHECK-NEG");
        $list18 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("admittedArgument")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("admittedArgument")), makeKeyword("FULLY-BOUND"), makeKeyword("INTEGER"), makeKeyword("FORT")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REMOVAL-ADMITTED-ARGUMENT-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ADMITTED-ARGUMENT-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (#$admittedArgument <fully-bound> <integer> <fort>))\nby checking that the argument is not both syntactically and semantically well-formed"), makeKeyword("EXAMPLE"),
                makeString("(#$not (#$admittedArgument #$Canada 1 #$genls))\n (#$not (#$admittedArgument #$Dog 1 #$LeftFn))") });
    }
}
/*
 *
 * Total time: 134 ms
 *
 */