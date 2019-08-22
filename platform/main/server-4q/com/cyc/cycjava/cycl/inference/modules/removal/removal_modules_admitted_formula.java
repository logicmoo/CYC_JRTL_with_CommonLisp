package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.contains_subformula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.at_admitted;
import com.cyc.cycjava.cycl.at_defns;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_admitted_formula extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_admitted_formula();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_admitted_formula";

    public static final String myFingerPrint = "6d343951bb19ad9dd8668f78dcdd51fa16961dfb548ad2d336a19e8907af439a";

    // defparameter
    private static final SubLSymbol $default_removal_admitted_formula_cost$ = makeSymbol("*DEFAULT-REMOVAL-ADMITTED-FORMULA-COST*");

    // defparameter
    private static final SubLSymbol $default_removal_admitted_argument_check_cost$ = makeSymbol("*DEFAULT-REMOVAL-ADMITTED-ARGUMENT-CHECK-COST*");

    private static final SubLObject $$admittedSentence = reader_make_constant_shell(makeString("admittedSentence"));

    private static final SubLSymbol $REMOVAL_NON_WFF_CHECK_NEG = makeKeyword("REMOVAL-NON-WFF-CHECK-NEG");





    private static final SubLSymbol $REMOVAL_ADMITTED_SENTENCE_POS = makeKeyword("REMOVAL-ADMITTED-SENTENCE-POS");

    private static final SubLList $list5 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("admittedSentence")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("admittedSentence")), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REMOVAL-ADMITTED-FORMULA-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ADMITTED-SENTENCE-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$admittedSentence <fully-bound>)\nby checking that the formula is syntactically and semantically well-formed"), makeKeyword("EXAMPLE"), makeString("(#$admittedSentence (#$bordersOn #$Canada #$France))") });



    private static final SubLObject $$True = reader_make_constant_shell(makeString("True"));

    private static final SubLSymbol $REMOVAL_ADMITTED_SENTENCE_NEG = makeKeyword("REMOVAL-ADMITTED-SENTENCE-NEG");

    private static final SubLList $list9 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("admittedSentence")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("admittedSentence")), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REMOVAL-ADMITTED-FORMULA-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ADMITTED-SENTENCE-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$admittedSentence <fully-bound>))\nby checking that the formula is not both syntactically and semantically well-formed"), makeKeyword("EXAMPLE"), makeString("(#$not (#$admittedSentence (#$genls #$Canada #$Country)))") });

    private static final SubLObject $$admittedArgument = reader_make_constant_shell(makeString("admittedArgument"));

    private static final SubLSymbol $REMOVAL_ADMITTED_ARGUMENT_CHECK_POS = makeKeyword("REMOVAL-ADMITTED-ARGUMENT-CHECK-POS");

    private static final SubLList $list12 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("admittedArgument")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("admittedArgument")), makeKeyword("FULLY-BOUND"), makeKeyword("INTEGER"), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REMOVAL-ADMITTED-ARGUMENT-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ADMITTED-ARGUMENT-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$admittedArgument <fully-bound> <integer> <fort>)\nby checking that the argument is syntactically and semantically well-formed"), makeKeyword("EXAMPLE"), makeString("(#$admittedArgument #$Canada 1 #$bordersOn)\n (#$admittedArgument #$Dog 1 #$JuvenileFn)") });

    private static final SubLFloat $float$0_9 = makeDouble(0.9);





    private static final SubLObject $$Thing = reader_make_constant_shell(makeString("Thing"));

    private static final SubLSymbol $REMOVAL_ADMITTED_ARGUMENT_CHECK_NEG = makeKeyword("REMOVAL-ADMITTED-ARGUMENT-CHECK-NEG");

    private static final SubLList $list18 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("admittedArgument")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("admittedArgument")), makeKeyword("FULLY-BOUND"), makeKeyword("INTEGER"), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REMOVAL-ADMITTED-ARGUMENT-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ADMITTED-ARGUMENT-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$admittedArgument <fully-bound> <integer> <fort>))\nby checking that the argument is not both syntactically and semantically well-formed"), makeKeyword("EXAMPLE"), makeString("(#$not (#$admittedArgument #$Canada 1 #$genls))\n (#$not (#$admittedArgument #$Dog 1 #$LeftFn))") });

    public static SubLObject removal_admitted_sentence_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject formula = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject admitted = inference_admitted_sentence(formula, UNPROVIDED);
        if (NIL != admitted) {
            backward.removal_add_node(arguments.make_hl_support($ADMIT, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject inference_admitted_formula(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != el_formula_p(formula)) {
            if (NIL == contains_subformula_p(formula)) {
                final SubLObject relation = cycl_utilities.formula_operator(formula);
                SubLObject argnum = ZERO_INTEGER;
                SubLObject cdolist_list_var;
                final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(formula, $IGNORE);
                SubLObject arg = NIL;
                arg = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    argnum = add(argnum, ONE_INTEGER);
                    if (NIL == inference_admitted_argument(arg, argnum, relation, mt)) {
                        return NIL;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                } 
            }
            return at_admitted.admitted_formulaP(formula, mt);
        }
        return eql($$True, formula);
    }

    public static SubLObject inference_admitted_sentence(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != el_formula_p(sentence)) {
            if (NIL == contains_subformula_p(sentence)) {
                final SubLObject relation = cycl_utilities.formula_operator(sentence);
                SubLObject argnum = ZERO_INTEGER;
                SubLObject cdolist_list_var;
                final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, $IGNORE);
                SubLObject arg = NIL;
                arg = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    argnum = add(argnum, ONE_INTEGER);
                    if (NIL == inference_admitted_argument(arg, argnum, relation, mt)) {
                        return NIL;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                } 
            }
            return at_admitted.admitted_sentenceP(sentence, mt);
        }
        return eql($$True, sentence);
    }

    public static SubLObject removal_admitted_sentence_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject formula = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject admitted = inference_admitted_sentence(formula, UNPROVIDED);
        if (NIL == admitted) {
            backward.removal_add_node(arguments.make_hl_support($ADMIT, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_admitted_argument_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject relation = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        final SubLObject admitted = inference_admitted_argument(v_term, arg, relation, UNPROVIDED);
        if (NIL != admitted) {
            backward.removal_add_node(arguments.make_hl_support($ADMIT, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject inference_admitted_argument(final SubLObject v_term, final SubLObject argnum, final SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == el_formula_p(v_term)) {
            SubLObject rejected = NIL;
            final SubLObject arg_isa_pred = kb_accessors.arg_isa_pred(argnum, relation, mt);
            SubLObject mt_var = mt;
            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject arg_isa = NIL;
                final SubLObject pred_var = arg_isa_pred;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, ONE_INTEGER, pred_var);
                    SubLObject done_var = rejected;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$1 = rejected;
                                final SubLObject token_var_$2 = NIL;
                                while (NIL == done_var_$1) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                    final SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(assertion));
                                    if (NIL != valid_$3) {
                                        arg_isa = assertions_high.gaf_arg(assertion, TWO_INTEGER);
                                        if ((((NIL != forts.fort_p(arg_isa)) && (!arg_isa.eql($$Thing))) && (NIL == isa.isaP(v_term, arg_isa, mt, UNPROVIDED))) && (NIL == at_defns.defns_admitP(arg_isa, v_term, mt))) {
                                            rejected = T;
                                        }
                                    }
                                    done_var_$1 = makeBoolean((NIL == valid_$3) || (NIL != rejected));
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                }
                            }
                        }
                        done_var = makeBoolean((NIL == valid) || (NIL != rejected));
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
            final SubLObject arg_genl_pred = kb_accessors.arg_genl_pred(argnum, UNPROVIDED, UNPROVIDED);
            mt_var = mt;
            _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject arg_genl = NIL;
                final SubLObject pred_var = arg_genl_pred;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, ONE_INTEGER, pred_var);
                    SubLObject done_var = rejected;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$2 = rejected;
                                final SubLObject token_var_$3 = NIL;
                                while (NIL == done_var_$2) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                    final SubLObject valid_$4 = makeBoolean(!token_var_$3.eql(assertion));
                                    if (NIL != valid_$4) {
                                        arg_genl = assertions_high.gaf_arg(assertion, TWO_INTEGER);
                                        if (((NIL != forts.fort_p(arg_genl)) && (!arg_genl.eql($$Thing))) && (NIL == genls.genlsP(v_term, arg_genl, mt, UNPROVIDED))) {
                                            rejected = T;
                                        }
                                    }
                                    done_var_$2 = makeBoolean((NIL == valid_$4) || (NIL != rejected));
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                }
                            }
                        }
                        done_var = makeBoolean((NIL == valid) || (NIL != rejected));
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

    public static SubLObject removal_admitted_argument_check_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject relation = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        final SubLObject admitted = inference_admitted_argument(v_term, arg, relation, UNPROVIDED);
        if (NIL == admitted) {
            backward.removal_add_node(arguments.make_hl_support($ADMIT, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_admitted_formula_file() {
        declareFunction(me, "removal_admitted_sentence_pos_expand", "REMOVAL-ADMITTED-SENTENCE-POS-EXPAND", 1, 1, false);
        declareFunction(me, "inference_admitted_formula", "INFERENCE-ADMITTED-FORMULA", 1, 1, false);
        declareFunction(me, "inference_admitted_sentence", "INFERENCE-ADMITTED-SENTENCE", 1, 1, false);
        declareFunction(me, "removal_admitted_sentence_neg_expand", "REMOVAL-ADMITTED-SENTENCE-NEG-EXPAND", 1, 1, false);
        declareFunction(me, "removal_admitted_argument_check_pos_expand", "REMOVAL-ADMITTED-ARGUMENT-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction(me, "inference_admitted_argument", "INFERENCE-ADMITTED-ARGUMENT", 3, 1, false);
        declareFunction(me, "removal_admitted_argument_check_neg_expand", "REMOVAL-ADMITTED-ARGUMENT-CHECK-NEG-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_admitted_formula_file() {
        defparameter("*DEFAULT-REMOVAL-ADMITTED-FORMULA-COST*", ONE_INTEGER);
        defparameter("*DEFAULT-REMOVAL-ADMITTED-ARGUMENT-CHECK-COST*", $float$0_9);
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

    
}

/**
 * Total time: 134 ms
 */
