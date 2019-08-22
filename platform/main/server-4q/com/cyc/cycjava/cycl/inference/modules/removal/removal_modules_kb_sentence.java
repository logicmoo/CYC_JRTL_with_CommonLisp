package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$expensive_hl_module_check_cost$;
import static com.cyc.cycjava.cycl.el_utilities.atomic_sentenceP;
import static com.cyc.cycjava.cycl.el_utilities.el_conjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.make_negation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_kb_sentence extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_kb_sentence();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_kb_sentence";

    public static final String myFingerPrint = "665bef54de72dfaf42b09baae2b592fd7dcec9d5e88c253dd51d9edfd4b4b7fc";

    // deflexical
    // Definitions
    private static final SubLSymbol $default_kb_sentence_check_cost$ = makeSymbol("*DEFAULT-KB-SENTENCE-CHECK-COST*");

    // deflexical
    private static final SubLSymbol $kb_sentence_allowed_modules_spec$ = makeSymbol("*KB-SENTENCE-ALLOWED-MODULES-SPEC*");

    private static final SubLObject $$kbSentence = reader_make_constant_shell(makeString("kbSentence"));

    public static final SubLList $list1 = list(makeKeyword("OR"), list(makeKeyword("MODULE-SUBTYPE"), makeKeyword("KB")), list(makeKeyword("AND"), list(makeKeyword("NOT"), list(makeKeyword("MODULE-TYPE"), makeKeyword("REMOVAL"))), list(makeKeyword("NOT"), list(makeKeyword("MODULE-TYPE"), makeKeyword("REMOVAL-CONJUNCTIVE")))));





    private static final SubLFloat $float$0_01 = makeDouble(0.01);



    private static final SubLSymbol $BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");



    public static final SubLList $list8 = list(makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"));

    private static final SubLSymbol $REMOVAL_KB_SENTENCE_LOOKUP_POS = makeKeyword("REMOVAL-KB-SENTENCE-LOOKUP-POS");

    public static final SubLList $list10 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("kbSentence")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("kbSentence")), list(makeKeyword("OR"), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING")), cons(reader_make_constant_shell(makeString("and")), makeKeyword("ANYTHING")))), makeKeyword("COST"), makeSymbol("REMOVAL-KB-SENTENCE-LOOKUP-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-KB-SENTENCE-LOOKUP-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$kbSentence (<non-predicate> . <fully-bound>)) or \n    (#$kbSentence (<predicate> . <anything>)) or\n    (#$kbSentence (#$and . <anything>))\n    by recursively asking sentence w/o any sksi support\n    and succeeding if the ask succeeds"), makeKeyword("EXAMPLE"), makeString("(#$kbSentence\n     (#$thereExists ?SPEC\n      (#$genls ?SPEC #$BinaryRelation)))") });



    private static final SubLSymbol $REMOVAL_KB_SENTENCE_CHECK_NEG = makeKeyword("REMOVAL-KB-SENTENCE-CHECK-NEG");

    public static final SubLList $list13 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("kbSentence")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("kbSentence")), list(makeKeyword("OR"), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND")), list(reader_make_constant_shell(makeString("not")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND"))))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-KB-SENTENCE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-KB-SENTENCE-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$kbSentence (<predicate> . <fully-bound>))) or\n    (#$not (#$kbSentence (#$not (<predicate> . <fully-bound>))))\n    by recursively asking sentence (<predicate> . <fully-bound>) or \n                                   (#$not (<predicate> . <fully-bound>))\n    without any sksi support\n    and succeeding if the ask succeeds"), makeKeyword("EXAMPLE"), makeString("(#$not (#$kbSentence\n     (#$not (#$genls #$Microtheory #$BinaryPredicate))))") });

    public static SubLObject removal_kb_sentence_lookup_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject subsentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        return removal_kb_sentence_lookup_pos_cost_int(subsentence);
    }

    public static SubLObject removal_kb_sentence_lookup_pos_cost_int(final SubLObject sentence) {
        if (NIL != variables.fully_bound_p(sentence)) {
            return $default_kb_sentence_check_cost$.getGlobalValue();
        }
        if (NIL != atomic_sentenceP(sentence)) {
            return inference_utilities.literal_removal_cost(sentence, $POS, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != el_conjunction_p(sentence)) {
            return removal_kb_sentence_lookup_pos_conjunction_cost(sentence);
        }
        return NIL;
    }

    public static SubLObject removal_kb_sentence_lookup_pos_conjunction_cost(final SubLObject conjunction) {
        final SubLObject conjuncts = cycl_utilities.formula_args(conjunction, UNPROVIDED);
        SubLObject costs = NIL;
        SubLObject cdolist_list_var = conjuncts;
        SubLObject conjunct = NIL;
        conjunct = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject conjunct_cost = removal_kb_sentence_lookup_pos_cost_int(conjunct);
            if (NIL != conjunct_cost) {
                costs = cons(conjunct_cost, costs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            conjunct = cdolist_list_var.first();
        } 
        return removal_kb_sentence_guess_cost_from_literal_costs(costs);
    }

    public static SubLObject removal_kb_sentence_guess_cost_from_literal_costs(final SubLObject costs) {
        if (NIL != costs) {
            final SubLObject min_cost = apply(MIN, costs);
            return min_cost.isZero() ? min_cost : max(removal_kb_sentence_adjust_cost_guess(min_cost), $float$0_01);
        }
        return NIL;
    }

    public static SubLObject removal_kb_sentence_adjust_cost_guess(final SubLObject cost) {
        return divide(cost, THREE_INTEGER);
    }

    public static SubLObject removal_kb_sentence_lookup_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject subsentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject mt = inference_worker.mt_of_currently_executing_tactic();
        return removal_kb_sentence_lookup_pos_expand_subsentence(subsentence, mt, sense);
    }

    public static SubLObject removal_kb_sentence_lookup_pos_expand_subsentence(final SubLObject subsentence, final SubLObject mt, final SubLObject sense) {
        SubLObject cdolist_list_var;
        final SubLObject result = cdolist_list_var = ask_utilities.inference_recursive_query(subsentence, mt, list($RETURN, $BINDINGS_AND_SUPPORTS, $ALLOWED_MODULES, $kb_sentence_allowed_modules_spec$.getGlobalValue()));
        SubLObject bindings_and_supports = NIL;
        bindings_and_supports = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = bindings_and_supports;
            SubLObject v_bindings = NIL;
            SubLObject supports = NIL;
            destructuring_bind_must_consp(current, datum, $list8);
            v_bindings = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list8);
            supports = current.first();
            current = current.rest();
            if (NIL == current) {
                backward.removal_add_node(supports.first(), v_bindings, supports.rest());
            } else {
                cdestructuring_bind_error(datum, $list8);
            }
            cdolist_list_var = cdolist_list_var.rest();
            bindings_and_supports = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject removal_kb_sentence_neg_gaf_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return $default_kb_sentence_check_cost$.getGlobalValue();
    }

    public static SubLObject removal_kb_sentence_check_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject subsentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject mt = inference_worker.mt_of_currently_executing_tactic();
        return removal_kb_sentence_check_neg_expand_subsentence(subsentence, mt, sense);
    }

    public static SubLObject removal_kb_sentence_check_neg_expand_subsentence(final SubLObject subsentence, final SubLObject mt, final SubLObject sense) {
        final SubLObject result = ask_utilities.inference_recursive_query(subsentence, mt, list($ALLOWED_MODULES, $kb_sentence_allowed_modules_spec$.getGlobalValue()));
        if (NIL == result) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, make_negation(subsentence), mt, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_kb_sentence_file() {
        declareFunction(me, "removal_kb_sentence_lookup_pos_cost", "REMOVAL-KB-SENTENCE-LOOKUP-POS-COST", 1, 1, false);
        declareFunction(me, "removal_kb_sentence_lookup_pos_cost_int", "REMOVAL-KB-SENTENCE-LOOKUP-POS-COST-INT", 1, 0, false);
        declareFunction(me, "removal_kb_sentence_lookup_pos_conjunction_cost", "REMOVAL-KB-SENTENCE-LOOKUP-POS-CONJUNCTION-COST", 1, 0, false);
        declareFunction(me, "removal_kb_sentence_guess_cost_from_literal_costs", "REMOVAL-KB-SENTENCE-GUESS-COST-FROM-LITERAL-COSTS", 1, 0, false);
        declareFunction(me, "removal_kb_sentence_adjust_cost_guess", "REMOVAL-KB-SENTENCE-ADJUST-COST-GUESS", 1, 0, false);
        declareFunction(me, "removal_kb_sentence_lookup_pos_expand", "REMOVAL-KB-SENTENCE-LOOKUP-POS-EXPAND", 1, 1, false);
        declareFunction(me, "removal_kb_sentence_lookup_pos_expand_subsentence", "REMOVAL-KB-SENTENCE-LOOKUP-POS-EXPAND-SUBSENTENCE", 3, 0, false);
        declareFunction(me, "removal_kb_sentence_neg_gaf_cost", "REMOVAL-KB-SENTENCE-NEG-GAF-COST", 1, 1, false);
        declareFunction(me, "removal_kb_sentence_check_neg_expand", "REMOVAL-KB-SENTENCE-CHECK-NEG-EXPAND", 1, 1, false);
        declareFunction(me, "removal_kb_sentence_check_neg_expand_subsentence", "REMOVAL-KB-SENTENCE-CHECK-NEG-EXPAND-SUBSENTENCE", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_kb_sentence_file() {
        deflexical("*DEFAULT-KB-SENTENCE-CHECK-COST*", $expensive_hl_module_check_cost$.getGlobalValue());
        deflexical("*KB-SENTENCE-ALLOWED-MODULES-SPEC*", $list1);
        return NIL;
    }

    public static SubLObject setup_removal_modules_kb_sentence_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$kbSentence);
        inference_modules.inference_removal_module($REMOVAL_KB_SENTENCE_LOOKUP_POS, $list10);
        inference_modules.inference_removal_module($REMOVAL_KB_SENTENCE_CHECK_NEG, $list13);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_kb_sentence_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_kb_sentence_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_kb_sentence_file();
    }

    
}

/**
 * Total time: 93 ms
 */
