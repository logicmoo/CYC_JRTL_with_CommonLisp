package com.cyc.cycjava.cycl.inference;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$mapping_target$;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.el_conjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_list_items;
import static com.cyc.cycjava.cycl.el_utilities.make_conjunction;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V10;
import com.cyc.cycjava.cycl.collection_defns;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class query_relaxation extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new query_relaxation();

    public static final String myName = "com.cyc.cycjava_2.cycl.inference.query_relaxation";


    private static final SubLObject $const0$QueryRelaxationStrategy_RemoveLit = reader_make_constant_shell(makeString("QueryRelaxationStrategy-RemoveLiteralViaSpecifiedOrder"));

    private static final SubLObject $const1$QueryRelaxationStrategyChangeValu = reader_make_constant_shell(makeString("QueryRelaxationStrategyChangeValueInArgAccordingToSpec"));

    private static final SubLString $str2$time_to_implement_support_for__S = makeString("time to implement support for ~S");

    private static final SubLObject $$strategyHasPredicateOrder = reader_make_constant_shell(makeString("strategyHasPredicateOrder"));



    private static final SubLList $list5 = list(makeSymbol("PATTERN-FORMULA"), makeSymbol("ARG-POSITION"), makeSymbol("EL-VALUE-LIST"));

    private static final SubLObject $$valueChangeListForStrategy = reader_make_constant_shell(makeString("valueChangeListForStrategy"));

    private static final SubLList $list7 = list(TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER);

    private static final SubLList $list8 = list(reader_make_constant_shell(makeString("DaysDuration")), list(reader_make_constant_shell(makeString("SomeExampleFn")), reader_make_constant_shell(makeString("Integer"))));

    private static final SubLList $list9 = list(reader_make_constant_shell(makeString("FormulaArgPositionFn")), ONE_INTEGER);

    private static final SubLList $list10 = list(reader_make_constant_shell(makeString("TheList")), FIFTEEN_INTEGER, TWENTY_INTEGER, makeInteger(25), makeInteger(30));

    private static final SubLObject $$DaysDuration = reader_make_constant_shell(makeString("DaysDuration"));

    private static final SubLSymbol CONJUNCTION_WITH_TARGET_LITERAL_P = makeSymbol("CONJUNCTION-WITH-TARGET-LITERAL-P");

    private static final SubLSymbol CONJUNCTION_WITHOUT_TARGET_LITERAL = makeSymbol("CONJUNCTION-WITHOUT-TARGET-LITERAL");



    private static final SubLSymbol CYCL_REMOVE_PREDICATE_LITERALS_FROM_SENTENCE = makeSymbol("CYCL-REMOVE-PREDICATE-LITERALS-FROM-SENTENCE");













    private static final SubLList $list22 = list(list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("comment")), makeSymbol("?X"), makeString("foo")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Thing"))), list(reader_make_constant_shell(makeString("genls")), makeSymbol("?X"), reader_make_constant_shell(makeString("Individual")))), reader_make_constant_shell(makeString("isa"))), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("comment")), makeSymbol("?X"), makeString("foo")), list(reader_make_constant_shell(makeString("genls")), makeSymbol("?X"), reader_make_constant_shell(makeString("Individual"))))), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("comment")), makeSymbol("?X"), makeString("foo")), list(reader_make_constant_shell(makeString("genls")), makeSymbol("?X"), reader_make_constant_shell(makeString("Individual")))), reader_make_constant_shell(makeString("comment"))), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("genls")), makeSymbol("?X"), reader_make_constant_shell(makeString("Individual"))))), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("genls")), makeSymbol("?X"), reader_make_constant_shell(makeString("Individual")))), reader_make_constant_shell(makeString("genls"))), list(reader_make_constant_shell(makeString("and")))));

    public static SubLObject new_cyc_query_with_relaxation(SubLObject sentence, SubLObject mt, SubLObject relaxation, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (relaxation == UNPROVIDED) {
            relaxation = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_inferences = NIL;
        SubLObject all_metrics = NIL;
        SubLObject last_results = NIL;
        SubLObject last_halt_reason = NIL;
        SubLObject done = NIL;
        while (NIL == done) {
            thread.resetMultipleValues();
            final SubLObject results = inference_kernel.new_cyc_query(sentence, mt, query_properties);
            final SubLObject halt_reason = thread.secondMultipleValue();
            final SubLObject inference = thread.thirdMultipleValue();
            final SubLObject metrics = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            last_results = results;
            last_halt_reason = halt_reason;
            SubLObject var = inference;
            if (NIL != var) {
                all_inferences = cons(var, all_inferences);
            }
            var = metrics;
            if (NIL != var) {
                all_metrics = cons(var, all_metrics);
            }
            done = relaxtion_strategy_termination_condition_satisfiedP(relaxation, results);
            if (NIL == done) {
                thread.resetMultipleValues();
                final SubLObject relaxed_sentence = relax_query_sentence(sentence, relaxation);
                final SubLObject invalidP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != invalidP) {
                    done = T;
                } else {
                    sentence = relaxed_sentence;
                }
            }
        } 
        all_inferences = nreverse(all_inferences);
        all_metrics = nreverse(all_metrics);
        return values(last_results, last_halt_reason, all_inferences, all_metrics);
    }

    public static SubLObject relaxtion_strategy_termination_condition_satisfiedP(final SubLObject relaxation, final SubLObject results) {
        return list_utilities.sublisp_boolean(results.first());
    }

    public static SubLObject relax_query_sentence(SubLObject sentence, final SubLObject relaxation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject invalidP = NIL;
        SubLObject handledP = NIL;
        if ((NIL == invalidP) && (NIL != isa.isa_in_any_mtP(relaxation, $const0$QueryRelaxationStrategy_RemoveLit))) {
            handledP = T;
            thread.resetMultipleValues();
            final SubLObject sentence_$1 = relax_query_sentence_by_removing_literals(sentence, relaxation);
            final SubLObject invalidP_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            sentence = sentence_$1;
            invalidP = invalidP_$2;
        }
        if ((NIL == invalidP) && (NIL != isa.isa_in_any_mtP(relaxation, $const1$QueryRelaxationStrategyChangeValu))) {
            handledP = T;
            thread.resetMultipleValues();
            final SubLObject sentence_$2 = relax_query_sentence_by_changing_value(sentence, relaxation);
            final SubLObject invalidP_$3 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            sentence = sentence_$2;
            invalidP = invalidP_$3;
        }
        if (NIL == handledP) {
            return Errors.error($str2$time_to_implement_support_for__S, relaxation);
        }
        return values(sentence, invalidP);
    }

    public static SubLObject relax_query_sentence_by_removing_literals(final SubLObject sentence, final SubLObject relaxation) {
        final SubLObject el_predicate_order_list = kb_mapping_utilities.fpred_value_in_any_mt(relaxation, $$strategyHasPredicateOrder, ONE_INTEGER, TWO_INTEGER, $TRUE);
        if (NIL != el_predicate_order_list) {
            final SubLObject predicate_order_list = el_list_items(el_predicate_order_list);
            SubLObject cdolist_list_var;
            final SubLObject inverse_preference_list = cdolist_list_var = reverse(predicate_order_list);
            SubLObject predicate = NIL;
            predicate = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != list_utilities.simple_tree_findP(predicate, sentence)) {
                    final SubLObject relaxed_sentence = cycl_remove_predicate_literals_from_sentence(sentence, predicate);
                    return values(relaxed_sentence, NIL);
                }
                cdolist_list_var = cdolist_list_var.rest();
                predicate = cdolist_list_var.first();
            } 
        }
        return values(NIL, T);
    }

    public static SubLObject relax_query_sentence_by_changing_value(SubLObject sentence, final SubLObject relaxation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var;
        final SubLObject value_change_list_specs = cdolist_list_var = gather_value_change_list_specs_for_strategy(relaxation);
        SubLObject value_change_list_spec = NIL;
        value_change_list_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = value_change_list_spec;
            SubLObject pattern_formula = NIL;
            SubLObject arg_position = NIL;
            SubLObject el_value_list = NIL;
            destructuring_bind_must_consp(current, datum, $list5);
            pattern_formula = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list5);
            arg_position = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list5);
            el_value_list = current.first();
            current = current.rest();
            if (NIL == current) {
                thread.resetMultipleValues();
                final SubLObject changed_sentence = relax_query_sentence_apply_value_change_spec(sentence, pattern_formula, arg_position, el_value_list);
                final SubLObject invalidP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != invalidP) {
                    return values(NIL, T);
                }
                sentence = changed_sentence;
            } else {
                cdestructuring_bind_error(datum, $list5);
            }
            cdolist_list_var = cdolist_list_var.rest();
            value_change_list_spec = cdolist_list_var.first();
        } 
        return values(sentence, NIL);
    }

    public static SubLObject gather_value_change_list_specs_for_strategy(final SubLObject relaxation) {
        return kb_mapping_utilities.pred_value_tuples_in_any_mt(relaxation, $$valueChangeListForStrategy, ONE_INTEGER, $list7, $TRUE);
    }

    public static SubLObject relax_query_sentence_apply_value_change_spec(SubLObject sentence, final SubLObject pattern_formula, final SubLObject arg_position, final SubLObject el_value_list) {
        if ((pattern_formula.equal($list8) && arg_position.equal($list9)) && el_value_list.equal($list10)) {
            SubLObject pair;
            SubLObject old;
            SubLObject v_new;
            SubLObject old_expression;
            SubLObject new_expression;
            for (pair = NIL, pair = cons(TEN_INTEGER, el_list_items(el_value_list)); !pair.isAtom(); pair = pair.rest()) {
                old = pair.first();
                v_new = second(pair);
                if ((NIL != old) && (NIL != v_new)) {
                    old_expression = list($$DaysDuration, old);
                    new_expression = list($$DaysDuration, v_new);
                    if (NIL != list_utilities.simple_tree_find_via_equalP(old_expression, sentence)) {
                        sentence = cycl_utilities.expression_subst(new_expression, old_expression, sentence, symbol_function(EQUAL), UNPROVIDED);
                        return values(sentence, NIL);
                    }
                }
            }
            return values(NIL, T);
        }
        return Errors.error($str2$time_to_implement_support_for__S, $$valueChangeListForStrategy);
    }

    public static SubLObject cycl_remove_predicate_literals_from_sentence(SubLObject sentence, final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $mapping_target$.currentBinding(thread);
        try {
            $mapping_target$.bind(predicate, thread);
            sentence = cycl_utilities.expression_transform(sentence, symbol_function(CONJUNCTION_WITH_TARGET_LITERAL_P), symbol_function(CONJUNCTION_WITHOUT_TARGET_LITERAL), UNPROVIDED, UNPROVIDED);
        } finally {
            $mapping_target$.rebind(_prev_bind_0, thread);
        }
        return sentence;
    }

    public static SubLObject conjunction_with_target_literal_p(final SubLObject v_object, SubLObject predicate) {
        if (predicate == UNPROVIDED) {
            predicate = $mapping_target$.getDynamicValue();
        }
        if (NIL != el_conjunction_p(v_object)) {
            SubLObject cdolist_list_var;
            final SubLObject conjuncts = cdolist_list_var = cycl_utilities.formula_args(v_object, UNPROVIDED);
            SubLObject conjunct = NIL;
            conjunct = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL != collection_defns.cycl_atomic_sentenceP(conjunct)) && predicate.equal(cycl_utilities.atomic_sentence_predicate(conjunct))) {
                    return conjunct;
                }
                cdolist_list_var = cdolist_list_var.rest();
                conjunct = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject conjunction_without_target_literal(final SubLObject conjunction, SubLObject predicate) {
        if (predicate == UNPROVIDED) {
            predicate = $mapping_target$.getDynamicValue();
        }
        SubLObject conjuncts = cycl_utilities.formula_args(conjunction, UNPROVIDED);
        conjuncts = remove(predicate, conjuncts, symbol_function(EQUAL), symbol_function(FORMULA_OPERATOR), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return make_conjunction(conjuncts);
    }

    public static SubLObject declare_query_relaxation_file() {
        declareFunction("new_cyc_query_with_relaxation", "NEW-CYC-QUERY-WITH-RELAXATION", 1, 3, false);
        declareFunction("relaxtion_strategy_termination_condition_satisfiedP", "RELAXTION-STRATEGY-TERMINATION-CONDITION-SATISFIED?", 2, 0, false);
        declareFunction("relax_query_sentence", "RELAX-QUERY-SENTENCE", 2, 0, false);
        declareFunction("relax_query_sentence_by_removing_literals", "RELAX-QUERY-SENTENCE-BY-REMOVING-LITERALS", 2, 0, false);
        declareFunction("relax_query_sentence_by_changing_value", "RELAX-QUERY-SENTENCE-BY-CHANGING-VALUE", 2, 0, false);
        declareFunction("gather_value_change_list_specs_for_strategy", "GATHER-VALUE-CHANGE-LIST-SPECS-FOR-STRATEGY", 1, 0, false);
        declareFunction("relax_query_sentence_apply_value_change_spec", "RELAX-QUERY-SENTENCE-APPLY-VALUE-CHANGE-SPEC", 4, 0, false);
        declareFunction("cycl_remove_predicate_literals_from_sentence", "CYCL-REMOVE-PREDICATE-LITERALS-FROM-SENTENCE", 2, 0, false);
        declareFunction("conjunction_with_target_literal_p", "CONJUNCTION-WITH-TARGET-LITERAL-P", 1, 1, false);
        declareFunction("conjunction_without_target_literal", "CONJUNCTION-WITHOUT-TARGET-LITERAL", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_query_relaxation_file() {
        return NIL;
    }

    public static SubLObject setup_query_relaxation_file() {
        note_funcall_helper_function(CONJUNCTION_WITH_TARGET_LITERAL_P);
        note_funcall_helper_function(CONJUNCTION_WITHOUT_TARGET_LITERAL);
        define_test_case_table_int(CYCL_REMOVE_PREDICATE_LITERALS_FROM_SENTENCE, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list22);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_query_relaxation_file();
    }

    @Override
    public void initializeVariables() {
        init_query_relaxation_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_query_relaxation_file();
    }

    static {
























    }
}

/**
 * Total time: 118 ms
 */
