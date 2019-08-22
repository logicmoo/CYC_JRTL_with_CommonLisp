/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.el_conjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_disjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_list_items;
import static com.cyc.cycjava.cycl.el_utilities.make_el_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_el_set;
import static com.cyc.cycjava.cycl.el_utilities.make_ternary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.el_utilities.sentence_free_variables;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-MODULES-QUERY-ANSWERS
 * source file: /cyc/top/cycl/inference/modules/removal/removal-modules-query-answers.lisp
 * created:     2019/07/03 17:37:47
 */
public final class removal_modules_query_answers extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_query_answers();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $removal_justification_partial_expand_max_justifications_count$ = makeSymbol("*REMOVAL-JUSTIFICATION-PARTIAL-EXPAND-MAX-JUSTIFICATIONS-COUNT*");





    private static final SubLSymbol $REMOVAL_QUERY_ANSWERS = makeKeyword("REMOVAL-QUERY-ANSWERS");

    private static final SubLList $list4 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("queryAnswers"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("queryAnswers"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list($TEST, makeSymbol("REMOVAL-CYCL-QUERY-SPECIFICATION-P")), list($TEST, makeSymbol("REMOVAL-ALLOWED-QUERY-ANSWERS-SENTENCE?"))), makeKeyword("ANYTHING")), $COST, makeSymbol("REMOVAL-QUERY-ANSWERS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("queryAnswers"), list($BIND, makeSymbol("QUERY-SPEC")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("QUERY-SPEC")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("QUERY-SPEC")), list($CALL, makeSymbol("REMOVAL-QUERY-ANSWERS-ITERATE"), list(makeKeyword("VALUE"), makeSymbol("QUERY-SPEC")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("queryAnswers"), list(makeKeyword("VALUE"), makeSymbol("QUERY-SPEC")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$queryAnswers <fully-bound> <anything>)\n    by recursively querying sentence and succeeding if the query returns the answer"), makeKeyword("EXAMPLE"), makeString("(#$queryAnswers (#$QueryFn (#$Quote (#$ist InferencePSC (#$isa ?X #$Dog)))) ?ANS)") });

    private static final SubLSymbol $BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");

    private static final SubLSymbol $BINDINGS_AND_HYPOTHETICAL_BINDINGS = makeKeyword("BINDINGS-AND-HYPOTHETICAL-BINDINGS");







    private static final SubLList $list13 = list(makeSymbol("MODULE"), makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("TV"));





    private static final SubLObject $const16$inferenceAnswerBindingsAndJustifi = reader_make_constant_shell("inferenceAnswerBindingsAndJustifications");

    private static final SubLSymbol $REMOVAL_INFERENCE_ANSWER_BINDINGS_AND_JUSTIFICATIONS = makeKeyword("REMOVAL-INFERENCE-ANSWER-BINDINGS-AND-JUSTIFICATIONS");

    private static final SubLList $list18 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("inferenceAnswerBindingsAndJustifications"), makeKeyword("REQUIRED-PATTERN"), listS(reader_make_constant_shell("inferenceAnswerBindingsAndJustifications"), cons(reader_make_constant_shell("CycInferenceAnswerFn"), makeKeyword("FULLY-BOUND")), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("inferenceAnswerBindingsAndJustifications"), list($BIND, makeSymbol("ANSWER-FN")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("ANSWER-FN"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("CycInferenceAnswerFn"), list($BIND, makeSymbol("BINDING-SET")), list($BIND, makeSymbol("JUSTIFICATION-SET"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDING-SET")), list(makeKeyword("VALUE"), makeSymbol("JUSTIFICATION-SET")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TEMPLATE"), list(list($BIND, makeSymbol("BINDING-SET")), list($BIND, makeSymbol("JUSTIFICATION-SET"))), list(reader_make_constant_shell("inferenceAnswerBindingsAndJustifications"), list(makeKeyword("VALUE"), makeSymbol("ANSWER-FN")), list(makeKeyword("VALUE"), makeSymbol("BINDING-SET")), list(makeKeyword("VALUE"), makeSymbol("JUSTIFICATION-SET")))), makeKeyword("DOCUMENTATION"), makeString("(#$inferenceAnswerBindingsAndJustifications <fully-bound> <anything> <anything>)"), makeKeyword("EXAMPLE"), makeString("(#$inferenceAnswerBindingsAndJustifications \n      (#$CycInferenceAnswerFn (#$TheSet (#$ELInferenceBindingFn ?DOG #$Muffet)) TheEmptySet) \n      ?BIND ?JUST)") });



    private static final SubLSymbol $REMOVAL_QUERY_BINDINGS = makeKeyword("REMOVAL-QUERY-BINDINGS");

    private static final SubLList $list21 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("queryBindings"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("queryBindings"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list($TEST, makeSymbol("REMOVAL-CYCL-QUERY-SPECIFICATION-P")), list($TEST, makeSymbol("REMOVAL-ALLOWED-QUERY-BINDINGS-SENTENCE?"))), makeKeyword("ANYTHING")), $COST, makeSymbol("REMOVAL-QUERY-BINDINGS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("queryBindings"), list($BIND, makeSymbol("QUERY-SPEC")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("QUERY-SPEC")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("QUERY-SPEC")), list($CALL, makeSymbol("REMOVAL-QUERY-BINDINGS-ITERATE"), list(makeKeyword("VALUE"), makeSymbol("QUERY-SPEC")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("queryBindings"), list(makeKeyword("VALUE"), makeSymbol("QUERY-SPEC")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$queryBindings <fully-bound> <anything>)\n    by recursively querying sentence and succeeding if the query returns the answer"), makeKeyword("EXAMPLE"), makeString("(#$queryBindings (#$QueryFn (#$Quote (#$ist InferencePSC (#$isa ?X #$Dog)))) ?BINDINGS)") });



    private static final SubLSymbol $REMOVAL_QUERY_VARIABLE = makeKeyword("REMOVAL-QUERY-VARIABLE");

    private static final SubLList $list24 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("queryVariable"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("queryVariable"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list($TEST, makeSymbol("REMOVAL-CYCL-QUERY-SPECIFICATION-P")), list($TEST, makeSymbol("REMOVAL-ALLOWED-QUERY-VARIABLE-SENTENCE?"))), makeKeyword("ANYTHING")), $COST, makeSymbol("REMOVAL-QUERY-VARIABLE-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("queryVariable"), list($BIND, makeSymbol("QUERY-SPEC")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("QUERY-SPEC")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("QUERY-SPEC")), list($CALL, makeSymbol("REMOVAL-QUERY-VARIABLE-ITERATE"), list(makeKeyword("VALUE"), makeSymbol("QUERY-SPEC")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("queryVariable"), list(makeKeyword("VALUE"), makeSymbol("QUERY-SPEC")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$queryVariable <fully-bound> <anything>)\n    by recursively querying sentence and succeeding if the query returns the answer"), makeKeyword("EXAMPLE"), makeString("(#$queryVariable (#$QueryFn (#$Quote (#$ist InferencePSC (#$isa ?X #$Dog)))) ?SET)") });

    private static final SubLObject $$justification_Partial = reader_make_constant_shell("justification-Partial");

    private static final SubLSymbol $REMOVAL_JUSTIFICATION_PARTIAL = makeKeyword("REMOVAL-JUSTIFICATION-PARTIAL");

    private static final SubLList $list27 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("justification-Partial"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("justification-Partial"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-JUSTIFICATION-PARTIAL-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$justification-Partial <fully-bound> <fully-bound>)\n    by recursively querying ASKABLE-SENTENCE and succeeding if the answer justifications contain the JUSTIFICATION-SENTENCE"), makeKeyword("EXAMPLE"), makeString("(#$justification-Partial (#$genls #$Dog #$Animal) (#$genls #$Dog #$CanisGenus))") });





    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");



    private static final SubLList $list40 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("firstInListSatisfying"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("firstInListSatisfying"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-FIRSTINLISTSATISFYING-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$firstInListSatisfying <fully-bound-p> <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString("(#$firstInListSatisfying\n  (#$TheList 1 2 3 4 5 6)\n  (#$Kappa (?INPUT)\n    (#$greaterThan ?INPUT 4))\n  ?WHAT)") });

    private static final SubLSymbol BINDINGS_VALUES = makeSymbol("BINDINGS-VALUES");

    private static final SubLSymbol TEST_REMOVAL_FIRSTINLISTSATISFYING_EXPAND = makeSymbol("TEST-REMOVAL-FIRSTINLISTSATISFYING-EXPAND");

    private static final SubLList $list51 = list(list(list(list(reader_make_constant_shell("firstInListSatisfying"), list(reader_make_constant_shell("TheList"), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER), list(reader_make_constant_shell("Kappa"), list(makeSymbol("?INPUT")), list(reader_make_constant_shell("greaterThan"), makeSymbol("?INPUT"), FOUR_INTEGER)), makeSymbol("?WHAT"))), NIL), list(list(list(reader_make_constant_shell("firstInListSatisfying"), list(reader_make_constant_shell("TheList"), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER), list(reader_make_constant_shell("Kappa"), list(makeSymbol("?INPUT")), list(reader_make_constant_shell("greaterThan"), makeSymbol("?INPUT"), FOUR_INTEGER)), FOUR_INTEGER)), NIL), list(list(list(reader_make_constant_shell("firstInListSatisfying"), list(reader_make_constant_shell("TheList"), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER), list(reader_make_constant_shell("Kappa"), list(makeSymbol("?INPUT")), list(reader_make_constant_shell("greaterThan"), makeSymbol("?INPUT"), FOUR_INTEGER)), makeSymbol("?WHAT"))), list(FIVE_INTEGER)), list(list(list(reader_make_constant_shell("firstInListSatisfying"), list(reader_make_constant_shell("TheList"), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER), list(reader_make_constant_shell("Kappa"), list(makeSymbol("?INPUT")), list(reader_make_constant_shell("greaterThan"), makeSymbol("?INPUT"), FOUR_INTEGER)), FIVE_INTEGER)), T), list(list(list(reader_make_constant_shell("firstInListSatisfying"), list(reader_make_constant_shell("TheList"), list(reader_make_constant_shell("MathExpressionFn"), list(reader_make_constant_shell("MathVarFn"), makeString("X")), reader_make_constant_shell("InfixPlusFn"), list(reader_make_constant_shell("MathQuantFn"), FIVE_INTEGER)), list(reader_make_constant_shell("MathExpressionFn"), list(reader_make_constant_shell("MathQuantFn"), FIVE_INTEGER), reader_make_constant_shell("InfixTimesFn"), list(reader_make_constant_shell("MathQuantFn"), SEVEN_INTEGER)), list(reader_make_constant_shell("MathExpressionFn"), list(reader_make_constant_shell("MathQuantFn"), SEVEN_INTEGER), reader_make_constant_shell("InfixMinusFn"), list(reader_make_constant_shell("MathQuantFn"), THREE_INTEGER))), list(reader_make_constant_shell("Kappa"), list(makeSymbol("?FOO")), list(reader_make_constant_shell("thereExists"), makeSymbol("?VAR"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("mathExpressionNthOperand"), makeSymbol("?FOO"), ONE_INTEGER, makeSymbol("?VAR")), list(reader_make_constant_shell("isa"), makeSymbol("?VAR"), reader_make_constant_shell("MathematicalVariable"))))), list(reader_make_constant_shell("MathExpressionFn"), list(reader_make_constant_shell("MathVarFn"), makeString("X")), reader_make_constant_shell("InfixPlusFn"), list(reader_make_constant_shell("MathQuantFn"), FIVE_INTEGER)))), T), list(list(list(reader_make_constant_shell("firstInListSatisfying"), list(reader_make_constant_shell("TheList"), list(reader_make_constant_shell("MathExpressionFn"), list(reader_make_constant_shell("MathVarFn"), makeString("X")), reader_make_constant_shell("InfixPlusFn"), list(reader_make_constant_shell("MathQuantFn"), FIVE_INTEGER)), list(reader_make_constant_shell("MathExpressionFn"), list(reader_make_constant_shell("MathQuantFn"), FIVE_INTEGER), reader_make_constant_shell("InfixTimesFn"), list(reader_make_constant_shell("MathQuantFn"), SEVEN_INTEGER)), list(reader_make_constant_shell("MathExpressionFn"), list(reader_make_constant_shell("MathQuantFn"), SEVEN_INTEGER), reader_make_constant_shell("InfixMinusFn"), list(reader_make_constant_shell("MathQuantFn"), THREE_INTEGER))), list(reader_make_constant_shell("Kappa"), list(makeSymbol("?FOO")), list(reader_make_constant_shell("thereExists"), makeSymbol("?VAR"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("mathExpressionNthOperand"), makeSymbol("?FOO"), ONE_INTEGER, makeSymbol("?VAR")), list(reader_make_constant_shell("isa"), makeSymbol("?VAR"), reader_make_constant_shell("MathematicalVariable"))))), makeSymbol("?WHAT"))), list(list(reader_make_constant_shell("MathExpressionFn"), list(reader_make_constant_shell("MathVarFn"), makeString("X")), reader_make_constant_shell("InfixPlusFn"), list(reader_make_constant_shell("MathQuantFn"), FIVE_INTEGER)))), list(list(list(reader_make_constant_shell("firstInListSatisfying"), list(reader_make_constant_shell("TheList"), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER), list(reader_make_constant_shell("Kappa"), list(makeSymbol("?INPUT")), list(reader_make_constant_shell("greaterThan"), makeSymbol("?INPUT"), ZERO_INTEGER)), FOUR_INTEGER)), NIL));

    // Definitions
    public static final SubLObject removal_cycl_query_specification_p_alt(SubLObject v_object) {
        return isa.isaP(v_object, $$CycLQuerySpecification, UNPROVIDED, UNPROVIDED);
    }

    // Definitions
    public static SubLObject removal_cycl_query_specification_p(final SubLObject v_object) {
        return isa.isaP(v_object, $$CycLQuerySpecification, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject removal_allowed_query_answers_sentenceP_alt(SubLObject query_spec) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject sentence = kb_query.kbq_query_arguments(query_spec);
                SubLObject mt = thread.secondMultipleValue();
                SubLObject query_properties = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                return inference_datastructures_enumerated_types.inference_properties_has_simple_return_typeP(query_properties);
            }
        }
    }

    public static SubLObject removal_allowed_query_answers_sentenceP(final SubLObject query_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject sentence = kb_query.kbq_query_arguments(query_spec, UNPROVIDED);
        final SubLObject mt = thread.secondMultipleValue();
        final SubLObject query_properties = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return inference_datastructures_enumerated_types.inference_properties_has_simple_return_typeP(query_properties);
    }

    public static final SubLObject removal_query_answers_cost_alt(SubLObject asent) {
        return ONE_INTEGER;
    }

    public static SubLObject removal_query_answers_cost(final SubLObject asent) {
        return ONE_INTEGER;
    }

    public static final SubLObject removal_query_answers_iterate_alt(SubLObject query_spec) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject results = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers.query_answers_kbq_run_query(query_spec);
                SubLObject halt_reason = thread.secondMultipleValue();
                SubLObject return_type = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject answer_fns = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers.removal_create_inference_answer_fns(results, return_type);
                    if (NIL != answer_fns) {
                        return iteration.new_list_iterator(answer_fns);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_query_answers_iterate(final SubLObject query_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject results = query_answers_kbq_run_query(query_spec);
        final SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject return_type = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject answer_fns = removal_create_inference_answer_fns(results, return_type);
        if (NIL != answer_fns) {
            return iteration.new_list_iterator(answer_fns);
        }
        return NIL;
    }

    public static final SubLObject removal_create_inference_answer_fns_alt(SubLObject results, SubLObject return_type) {
        if (NIL == results) {
            return NIL;
        }
        {
            SubLObject pcase_var = return_type;
            if (pcase_var.eql($ANSWER)) {
                return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers.removal_create_inference_answer_fn_from_answers(results);
            } else {
                if (pcase_var.eql($BINDINGS)) {
                    return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers.removal_create_inference_answer_fn_from_bindings(results);
                } else {
                    if (pcase_var.eql($SUPPORTS)) {
                        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers.removal_create_inference_answer_fn_from_supports(results);
                    } else {
                        if (pcase_var.eql($BINDINGS_AND_SUPPORTS)) {
                            return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers.removal_create_inference_answer_fn_from_bindings_and_supports(results);
                        } else {
                            if (pcase_var.eql($BINDINGS_AND_HYPOTHETICAL_BINDINGS)) {
                                return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers.removal_create_inference_answer_fn_from_bindings_and_hypothetical_bindings(results);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_create_inference_answer_fns(final SubLObject results, final SubLObject return_type) {
        if (NIL == results) {
            return NIL;
        }
        if (return_type.eql($ANSWER)) {
            return removal_create_inference_answer_fn_from_answers(results);
        }
        if (return_type.eql($BINDINGS)) {
            return removal_create_inference_answer_fn_from_bindings(results);
        }
        if (return_type.eql($SUPPORTS)) {
            return removal_create_inference_answer_fn_from_supports(results);
        }
        if (return_type.eql($BINDINGS_AND_SUPPORTS)) {
            return removal_create_inference_answer_fn_from_bindings_and_supports(results);
        }
        if (return_type.eql($BINDINGS_AND_HYPOTHETICAL_BINDINGS)) {
            return removal_create_inference_answer_fn_from_bindings_and_hypothetical_bindings(results);
        }
        return NIL;
    }

    public static final SubLObject removal_create_inference_answer_fn_from_answers_alt(SubLObject inference_answers) {
        {
            SubLObject answer_fns = NIL;
            SubLObject cdolist_list_var = inference_answers;
            SubLObject inference_answer = NIL;
            for (inference_answer = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , inference_answer = cdolist_list_var.first()) {
                {
                    SubLObject binding_set = bindings.kbify_inference_binding_set(inference_datastructures_inference.inference_answer_bindings(inference_answer));
                    SubLObject justifications = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers.removal_justification_fns(inference_datastructures_inference.inference_answer_justifications(inference_answer));
                    answer_fns = cons(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers.removal_create_inference_answer_fn(binding_set, justifications), answer_fns);
                }
            }
            return nreverse(answer_fns);
        }
    }

    public static SubLObject removal_create_inference_answer_fn_from_answers(final SubLObject inference_answers) {
        SubLObject answer_fns = NIL;
        SubLObject cdolist_list_var = inference_answers;
        SubLObject inference_answer = NIL;
        inference_answer = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject binding_set = bindings.kbify_inference_binding_set(inference_datastructures_inference.inference_answer_bindings(inference_answer));
            final SubLObject justifications = removal_justification_fns(inference_datastructures_inference.inference_answer_justifications(inference_answer));
            answer_fns = cons(removal_create_inference_answer_fn(binding_set, justifications), answer_fns);
            cdolist_list_var = cdolist_list_var.rest();
            inference_answer = cdolist_list_var.first();
        } 
        return nreverse(answer_fns);
    }

    public static final SubLObject removal_create_inference_answer_fn_from_bindings_alt(SubLObject binding_sets) {
        {
            SubLObject answer_fns = NIL;
            SubLObject cdolist_list_var = binding_sets;
            SubLObject binding_set = NIL;
            for (binding_set = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding_set = cdolist_list_var.first()) {
                {
                    SubLObject justifications = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers.removal_justification_fns(NIL);
                    answer_fns = cons(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers.removal_create_inference_answer_fn(bindings.kbify_inference_binding_set(binding_set), justifications), answer_fns);
                }
            }
            return nreverse(answer_fns);
        }
    }

    public static SubLObject removal_create_inference_answer_fn_from_bindings(final SubLObject binding_sets) {
        SubLObject answer_fns = NIL;
        SubLObject cdolist_list_var = binding_sets;
        SubLObject binding_set = NIL;
        binding_set = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject justifications = removal_justification_fns(NIL);
            answer_fns = cons(removal_create_inference_answer_fn(bindings.kbify_inference_binding_set(binding_set), justifications), answer_fns);
            cdolist_list_var = cdolist_list_var.rest();
            binding_set = cdolist_list_var.first();
        } 
        return nreverse(answer_fns);
    }

    public static final SubLObject removal_create_inference_answer_fn_from_supports_alt(SubLObject supports_set) {
        {
            SubLObject answer_fns = NIL;
            SubLObject cdolist_list_var = supports_set;
            SubLObject supports = NIL;
            for (supports = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , supports = cdolist_list_var.first()) {
                {
                    SubLObject binding_set = bindings.kbify_inference_binding_set(NIL);
                    SubLObject justifications = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers.removal_justification_fns_from_supports(supports);
                    answer_fns = cons(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers.removal_create_inference_answer_fn(binding_set, justifications), answer_fns);
                }
            }
            return nreverse(answer_fns);
        }
    }

    public static SubLObject removal_create_inference_answer_fn_from_supports(final SubLObject supports_set) {
        SubLObject answer_fns = NIL;
        SubLObject cdolist_list_var = supports_set;
        SubLObject supports = NIL;
        supports = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject binding_set = bindings.kbify_inference_binding_set(NIL);
            final SubLObject justifications = removal_justification_fns_from_supports(supports);
            answer_fns = cons(removal_create_inference_answer_fn(binding_set, justifications), answer_fns);
            cdolist_list_var = cdolist_list_var.rest();
            supports = cdolist_list_var.first();
        } 
        return nreverse(answer_fns);
    }

    public static final SubLObject removal_create_inference_answer_fn_from_bindings_and_supports_alt(SubLObject bindings_supports_set) {
        {
            SubLObject answer_fns = NIL;
            SubLObject cdolist_list_var = bindings_supports_set;
            SubLObject bindings_supports = NIL;
            for (bindings_supports = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , bindings_supports = cdolist_list_var.first()) {
                {
                    SubLObject binding_set = bindings.kbify_inference_binding_set(bindings_supports.first());
                    SubLObject justifications = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers.removal_justification_fns_from_supports(second(bindings_supports));
                    answer_fns = cons(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers.removal_create_inference_answer_fn(binding_set, justifications), answer_fns);
                }
            }
            return nreverse(answer_fns);
        }
    }

    public static SubLObject removal_create_inference_answer_fn_from_bindings_and_supports(final SubLObject bindings_supports_set) {
        SubLObject answer_fns = NIL;
        SubLObject cdolist_list_var = bindings_supports_set;
        SubLObject bindings_supports = NIL;
        bindings_supports = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject binding_set = bindings.kbify_inference_binding_set(bindings_supports.first());
            final SubLObject justifications = removal_justification_fns_from_supports(second(bindings_supports));
            answer_fns = cons(removal_create_inference_answer_fn(binding_set, justifications), answer_fns);
            cdolist_list_var = cdolist_list_var.rest();
            bindings_supports = cdolist_list_var.first();
        } 
        return nreverse(answer_fns);
    }

    public static final SubLObject removal_create_inference_answer_fn_from_bindings_and_hypothetical_bindings_alt(SubLObject bindings_hypotheticals) {
        {
            SubLObject answer_fns = NIL;
            SubLObject binding_sets = bindings_hypotheticals.first();
            SubLObject hypothetical_bindings = second(bindings_hypotheticals);
            SubLObject justifications = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers.removal_justification_fns_from_supports(NIL);
            SubLObject cdolist_list_var = binding_sets;
            SubLObject binding_set = NIL;
            for (binding_set = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding_set = cdolist_list_var.first()) {
                binding_set = bindings.kbify_inference_binding_set(append(binding_set, hypothetical_bindings));
                answer_fns = cons(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers.removal_create_inference_answer_fn(binding_set, justifications), answer_fns);
            }
            return nreverse(answer_fns);
        }
    }

    public static SubLObject removal_create_inference_answer_fn_from_bindings_and_hypothetical_bindings(final SubLObject bindings_hypotheticals) {
        SubLObject answer_fns = NIL;
        final SubLObject binding_sets = bindings_hypotheticals.first();
        final SubLObject hypothetical_bindings = second(bindings_hypotheticals);
        final SubLObject justifications = removal_justification_fns_from_supports(NIL);
        SubLObject cdolist_list_var = binding_sets;
        SubLObject binding_set = NIL;
        binding_set = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            binding_set = bindings.kbify_inference_binding_set(append(binding_set, hypothetical_bindings));
            answer_fns = cons(removal_create_inference_answer_fn(binding_set, justifications), answer_fns);
            cdolist_list_var = cdolist_list_var.rest();
            binding_set = cdolist_list_var.first();
        } 
        return nreverse(answer_fns);
    }

    public static final SubLObject removal_justification_fns_alt(SubLObject justifications) {
        if (NIL == justifications) {
            return $$TheEmptySet;
        }
        {
            SubLObject justificationsfn = NIL;
            SubLObject cdolist_list_var = justifications;
            SubLObject justification = NIL;
            for (justification = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , justification = cdolist_list_var.first()) {
                justificationsfn = cons(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers.removal_create_justification_fn(inference_datastructures_inference.inference_answer_justification_supports(justification)), justificationsfn);
            }
            return make_el_formula($$TheSet, justificationsfn, UNPROVIDED);
        }
    }

    public static SubLObject removal_justification_fns(final SubLObject justifications) {
        if (NIL == justifications) {
            return $$TheEmptySet;
        }
        SubLObject justificationsfn = NIL;
        SubLObject cdolist_list_var = justifications;
        SubLObject justification = NIL;
        justification = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            justificationsfn = cons(removal_create_justification_fn(inference_datastructures_inference.inference_answer_justification_supports(justification)), justificationsfn);
            cdolist_list_var = cdolist_list_var.rest();
            justification = cdolist_list_var.first();
        } 
        return make_el_formula($$TheSet, justificationsfn, UNPROVIDED);
    }

    public static final SubLObject removal_justification_fns_from_supports_alt(SubLObject supports) {
        if (NIL == supports) {
            return $$TheEmptySet;
        }
        {
            SubLObject justificationsfn = NIL;
            justificationsfn = cons(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers.removal_create_justification_fn(supports), justificationsfn);
            return make_el_formula($$TheSet, justificationsfn, UNPROVIDED);
        }
    }

    public static SubLObject removal_justification_fns_from_supports(final SubLObject supports) {
        if (NIL == supports) {
            return $$TheEmptySet;
        }
        SubLObject justificationsfn = NIL;
        justificationsfn = cons(removal_create_justification_fn(supports), justificationsfn);
        return make_el_formula($$TheSet, justificationsfn, UNPROVIDED);
    }

    public static final SubLObject removal_create_justification_fn_alt(SubLObject supports) {
        {
            SubLObject support_datastructures = NIL;
            SubLObject cdolist_list_var = supports;
            SubLObject support = NIL;
            for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                support_datastructures = cons(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers.removal_support_datastructures(support), support_datastructures);
            }
            support_datastructures = make_el_formula($$TheSet, nreverse(support_datastructures), UNPROVIDED);
            return list($$CycInferenceAnswerJustificationFn, support_datastructures);
        }
    }

    public static SubLObject removal_create_justification_fn(final SubLObject supports) {
        SubLObject support_datastructures = NIL;
        SubLObject cdolist_list_var = supports;
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            support_datastructures = cons(removal_support_datastructures(support), support_datastructures);
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        } 
        support_datastructures = make_el_formula($$TheSet, nreverse(support_datastructures), UNPROVIDED);
        return list($$CycInferenceAnswerJustificationFn, support_datastructures);
    }

    public static final SubLObject removal_support_datastructures_alt(SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            return support;
        } else {
            if (NIL != arguments.hl_support_p(support)) {
                return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers.removal_create_cycl_hl_support_fn(support);
            }
        }
        return NIL;
    }

    public static SubLObject removal_support_datastructures(final SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            return support;
        }
        if (NIL != arguments.hl_support_p(support)) {
            return removal_create_cycl_hl_support_fn(support);
        }
        return NIL;
    }

    public static final SubLObject removal_create_cycl_hl_support_fn_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject module = NIL;
            SubLObject sentence = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt12);
            module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt12);
            sentence = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt12);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt12);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject cycl_module = kb_query.kbq_hl_support_module_from_keyword(module);
                    SubLObject cycl_tv = kb_query.kbq_kb_tv_from_hl_tv(tv);
                    return list($$CycHLSupportFn, cycl_module, sentence, mt, cycl_tv);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt12);
            }
        }
        return NIL;
    }

    public static SubLObject removal_create_cycl_hl_support_fn(final SubLObject support) {
        SubLObject module = NIL;
        SubLObject sentence = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list13);
        module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list13);
        sentence = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list13);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list13);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject cycl_module = kb_query.kbq_hl_support_module_from_keyword(module);
            final SubLObject cycl_tv = kb_query.kbq_kb_tv_from_hl_tv(tv);
            return list($$CycHLSupportFn, cycl_module, sentence, mt, cycl_tv);
        }
        cdestructuring_bind_error(support, $list13);
        return NIL;
    }

    public static final SubLObject removal_create_inference_answer_fn_alt(SubLObject binding_set, SubLObject justifications) {
        return list($$CycInferenceAnswerFn, binding_set, justifications);
    }

    public static SubLObject removal_create_inference_answer_fn(final SubLObject binding_set, final SubLObject justifications) {
        return list($$CycInferenceAnswerFn, binding_set, justifications);
    }

    public static final SubLObject query_answers_kbq_run_query_alt(SubLObject query_spec) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject sentence = kb_query.kbq_query_arguments(query_spec);
                SubLObject mt = thread.secondMultipleValue();
                SubLObject query_properties = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject return_type = inference_datastructures_enumerated_types.inference_properties_return_type(query_properties);
                    if (NIL != inference_datastructures_enumerated_types.inference_template_return_type_p(return_type)) {
                        return values(NIL, NIL, return_type);
                    }
                    thread.resetMultipleValues();
                    {
                        SubLObject results = inference_kernel.new_cyc_query(sentence, mt, query_properties);
                        SubLObject halt_reason = thread.secondMultipleValue();
                        SubLObject inference = thread.thirdMultipleValue();
                        SubLObject metrics = thread.fourthMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != inference_datastructures_inference.valid_inference_p(inference)) {
                            inference_datastructures_inference.destroy_inference_and_problem_store(inference);
                        }
                        return values(results, halt_reason, return_type);
                    }
                }
            }
        }
    }

    public static SubLObject query_answers_kbq_run_query(final SubLObject query_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject sentence = kb_query.kbq_query_arguments(query_spec, UNPROVIDED);
        final SubLObject mt = thread.secondMultipleValue();
        final SubLObject query_properties = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject return_type = inference_datastructures_enumerated_types.inference_properties_return_type(query_properties);
        if (NIL != inference_datastructures_enumerated_types.inference_template_return_type_p(return_type)) {
            return values(NIL, NIL, return_type);
        }
        thread.resetMultipleValues();
        final SubLObject results = inference_kernel.new_cyc_query(sentence, mt, query_properties);
        final SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject inference = thread.thirdMultipleValue();
        final SubLObject metrics = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != inference_datastructures_inference.valid_inference_p(inference)) {
            inference_datastructures_inference.destroy_inference_and_problem_store(inference);
        }
        return values(results, halt_reason, return_type);
    }

    static private final SubLList $list_alt3 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("queryAnswers"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("queryAnswers"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list($TEST, makeSymbol("REMOVAL-CYCL-QUERY-SPECIFICATION-P")), list($TEST, makeSymbol("REMOVAL-ALLOWED-QUERY-ANSWERS-SENTENCE?"))), makeKeyword("ANYTHING")), $COST, makeSymbol("REMOVAL-QUERY-ANSWERS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("queryAnswers"), list($BIND, makeSymbol("QUERY-SPEC")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("QUERY-SPEC")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("QUERY-SPEC")), list($CALL, makeSymbol("REMOVAL-QUERY-ANSWERS-ITERATE"), list(makeKeyword("VALUE"), makeSymbol("QUERY-SPEC")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("queryAnswers"), list(makeKeyword("VALUE"), makeSymbol("QUERY-SPEC")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$queryAnswers <fully-bound> <anything>)\n    by recursively querying sentence and succeeding if the query returns the answer"), makeKeyword("EXAMPLE"), makeString("(#$queryAnswers (#$QueryFn (#$Quote (#$ist InferencePSC (#$isa ?X #$Dog)))) ?ANS)") });

    public static final SubLObject removal_allowed_query_bindings_sentenceP_alt(SubLObject query_spec) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject sentence = kb_query.kbq_query_arguments(query_spec);
                SubLObject mt = thread.secondMultipleValue();
                SubLObject query_properties = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                return makeBoolean((NIL != inference_datastructures_enumerated_types.inference_properties_has_simple_return_typeP(query_properties)) && ($SUPPORTS != inference_datastructures_enumerated_types.inference_properties_return_type(query_properties)));
            }
        }
    }

    public static SubLObject removal_allowed_query_bindings_sentenceP(final SubLObject query_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject sentence = kb_query.kbq_query_arguments(query_spec, UNPROVIDED);
        final SubLObject mt = thread.secondMultipleValue();
        final SubLObject query_properties = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return makeBoolean((NIL != inference_datastructures_enumerated_types.inference_properties_has_simple_return_typeP(query_properties)) && ($SUPPORTS != inference_datastructures_enumerated_types.inference_properties_return_type(query_properties)));
    }

    public static final SubLObject removal_query_bindings_cost_alt(SubLObject asent) {
        return ONE_INTEGER;
    }

    public static SubLObject removal_query_bindings_cost(final SubLObject asent) {
        return ONE_INTEGER;
    }

    public static final SubLObject removal_query_bindings_iterate_alt(SubLObject query_spec) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject results = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers.query_answers_kbq_run_query(query_spec);
                SubLObject halt_reason = thread.secondMultipleValue();
                SubLObject return_type = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject binding_sets = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers.removal_create_el_bindings_sets(results, return_type);
                    if (NIL != binding_sets) {
                        return iteration.new_list_iterator(binding_sets);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_query_bindings_iterate(final SubLObject query_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject results = query_answers_kbq_run_query(query_spec);
        final SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject return_type = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject binding_sets = removal_create_el_bindings_sets(results, return_type);
        if (NIL != binding_sets) {
            return iteration.new_list_iterator(binding_sets);
        }
        return NIL;
    }

    public static final SubLObject removal_create_el_bindings_sets_alt(SubLObject results, SubLObject return_type) {
        if (NIL == results) {
            return NIL;
        }
        {
            SubLObject binding_sets = NIL;
            SubLObject pcase_var = return_type;
            if (pcase_var.eql($ANSWER)) {
                {
                    SubLObject cdolist_list_var = results;
                    SubLObject inference_answer = NIL;
                    for (inference_answer = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , inference_answer = cdolist_list_var.first()) {
                        binding_sets = cons(bindings.kbify_inference_binding_set(inference_datastructures_inference.inference_answer_bindings(inference_answer)), binding_sets);
                    }
                }
            } else {
                if (pcase_var.eql($BINDINGS)) {
                    {
                        SubLObject cdolist_list_var = results;
                        SubLObject binding_set = NIL;
                        for (binding_set = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding_set = cdolist_list_var.first()) {
                            binding_sets = cons(bindings.kbify_inference_binding_set(binding_set), binding_sets);
                        }
                    }
                } else {
                    if (pcase_var.eql($BINDINGS_AND_SUPPORTS)) {
                        {
                            SubLObject cdolist_list_var = results;
                            SubLObject bindings_supports = NIL;
                            for (bindings_supports = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , bindings_supports = cdolist_list_var.first()) {
                                binding_sets = cons(bindings.kbify_inference_binding_set(bindings_supports.first()), binding_sets);
                            }
                        }
                    } else {
                        if (pcase_var.eql($BINDINGS_AND_HYPOTHETICAL_BINDINGS)) {
                            {
                                SubLObject v_bindings = results.first();
                                SubLObject hypothetical_bindings = second(results);
                                SubLObject cdolist_list_var = v_bindings;
                                SubLObject binding_set = NIL;
                                for (binding_set = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding_set = cdolist_list_var.first()) {
                                    binding_sets = cons(bindings.kbify_inference_binding_set(append(binding_set, hypothetical_bindings)), binding_sets);
                                }
                            }
                        }
                    }
                }
            }
            return nreverse(binding_sets);
        }
    }

    public static SubLObject removal_create_el_bindings_sets(final SubLObject results, final SubLObject return_type) {
        if (NIL == results) {
            return NIL;
        }
        SubLObject binding_sets = NIL;
        if (return_type.eql($ANSWER)) {
            SubLObject cdolist_list_var = results;
            SubLObject inference_answer = NIL;
            inference_answer = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                binding_sets = cons(bindings.kbify_inference_binding_set(inference_datastructures_inference.inference_answer_bindings(inference_answer)), binding_sets);
                cdolist_list_var = cdolist_list_var.rest();
                inference_answer = cdolist_list_var.first();
            } 
        } else
            if (return_type.eql($BINDINGS)) {
                SubLObject cdolist_list_var = results;
                SubLObject binding_set = NIL;
                binding_set = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    binding_sets = cons(bindings.kbify_inference_binding_set(binding_set), binding_sets);
                    cdolist_list_var = cdolist_list_var.rest();
                    binding_set = cdolist_list_var.first();
                } 
            } else
                if (return_type.eql($BINDINGS_AND_SUPPORTS)) {
                    SubLObject cdolist_list_var = results;
                    SubLObject bindings_supports = NIL;
                    bindings_supports = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        binding_sets = cons(bindings.kbify_inference_binding_set(bindings_supports.first()), binding_sets);
                        cdolist_list_var = cdolist_list_var.rest();
                        bindings_supports = cdolist_list_var.first();
                    } 
                } else
                    if (return_type.eql($BINDINGS_AND_HYPOTHETICAL_BINDINGS)) {
                        final SubLObject v_bindings = results.first();
                        final SubLObject hypothetical_bindings = second(results);
                        SubLObject cdolist_list_var2 = v_bindings;
                        SubLObject binding_set2 = NIL;
                        binding_set2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            binding_sets = cons(bindings.kbify_inference_binding_set(append(binding_set2, hypothetical_bindings)), binding_sets);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            binding_set2 = cdolist_list_var2.first();
                        } 
                    }



        return nreverse(binding_sets);
    }

    static private final SubLList $list_alt12 = list(makeSymbol("MODULE"), makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("TV"));

    public static final SubLObject $const15$inferenceAnswerBindingsAndJustifi = reader_make_constant_shell("inferenceAnswerBindingsAndJustifications");

    static private final SubLList $list_alt17 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("inferenceAnswerBindingsAndJustifications"), makeKeyword("REQUIRED-PATTERN"), listS(reader_make_constant_shell("inferenceAnswerBindingsAndJustifications"), cons(reader_make_constant_shell("CycInferenceAnswerFn"), makeKeyword("FULLY-BOUND")), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("inferenceAnswerBindingsAndJustifications"), list($BIND, makeSymbol("ANSWER-FN")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("ANSWER-FN"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("CycInferenceAnswerFn"), list($BIND, makeSymbol("BINDING-SET")), list($BIND, makeSymbol("JUSTIFICATION-SET"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDING-SET")), list(makeKeyword("VALUE"), makeSymbol("JUSTIFICATION-SET")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TEMPLATE"), list(list($BIND, makeSymbol("BINDING-SET")), list($BIND, makeSymbol("JUSTIFICATION-SET"))), list(reader_make_constant_shell("inferenceAnswerBindingsAndJustifications"), list(makeKeyword("VALUE"), makeSymbol("ANSWER-FN")), list(makeKeyword("VALUE"), makeSymbol("BINDING-SET")), list(makeKeyword("VALUE"), makeSymbol("JUSTIFICATION-SET")))), makeKeyword("DOCUMENTATION"), makeString("(#$inferenceAnswerBindingsAndJustifications <fully-bound> <anything> <anything>)"), makeKeyword("EXAMPLE"), makeString("(#$inferenceAnswerBindingsAndJustifications \n      (#$CycInferenceAnswerFn (#$TheSet (#$ELInferenceBindingFn ?DOG #$Muffet)) TheEmptySet) \n      ?BIND ?JUST)") });

    public static final SubLObject removal_allowed_query_variable_sentenceP_alt(SubLObject query_spec) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject sentence = kb_query.kbq_query_arguments(query_spec);
                SubLObject mt = thread.secondMultipleValue();
                SubLObject query_properties = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                return makeBoolean(((NIL != inference_datastructures_enumerated_types.inference_properties_has_simple_return_typeP(query_properties)) && ($SUPPORTS != inference_datastructures_enumerated_types.inference_properties_return_type(query_properties))) && (NIL != list_utilities.singletonP(sentence_free_variables(sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED))));
            }
        }
    }

    public static SubLObject removal_allowed_query_variable_sentenceP(final SubLObject query_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject sentence = kb_query.kbq_query_arguments(query_spec, UNPROVIDED);
        final SubLObject mt = thread.secondMultipleValue();
        final SubLObject query_properties = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return makeBoolean(((NIL != inference_datastructures_enumerated_types.inference_properties_has_simple_return_typeP(query_properties)) && ($SUPPORTS != inference_datastructures_enumerated_types.inference_properties_return_type(query_properties))) && (NIL != list_utilities.singletonP(sentence_free_variables(sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED))));
    }

    static private final SubLList $list_alt20 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("queryBindings"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("queryBindings"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list($TEST, makeSymbol("REMOVAL-CYCL-QUERY-SPECIFICATION-P")), list($TEST, makeSymbol("REMOVAL-ALLOWED-QUERY-BINDINGS-SENTENCE?"))), makeKeyword("ANYTHING")), $COST, makeSymbol("REMOVAL-QUERY-BINDINGS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("queryBindings"), list($BIND, makeSymbol("QUERY-SPEC")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("QUERY-SPEC")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("QUERY-SPEC")), list($CALL, makeSymbol("REMOVAL-QUERY-BINDINGS-ITERATE"), list(makeKeyword("VALUE"), makeSymbol("QUERY-SPEC")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("queryBindings"), list(makeKeyword("VALUE"), makeSymbol("QUERY-SPEC")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$queryBindings <fully-bound> <anything>)\n    by recursively querying sentence and succeeding if the query returns the answer"), makeKeyword("EXAMPLE"), makeString("(#$queryBindings (#$QueryFn (#$Quote (#$ist InferencePSC (#$isa ?X #$Dog)))) ?BINDINGS)") });

    public static final SubLObject removal_query_variable_cost_alt(SubLObject asent) {
        return ONE_INTEGER;
    }

    public static SubLObject removal_query_variable_cost(final SubLObject asent) {
        return ONE_INTEGER;
    }

    public static final SubLObject removal_query_variable_iterate_alt(SubLObject query_spec) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject results = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers.query_answers_kbq_run_query(query_spec);
                SubLObject halt_reason = thread.secondMultipleValue();
                SubLObject return_type = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject answer_fns = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers.removal_create_set_of_variable_bindings(results, return_type);
                    if (NIL != answer_fns) {
                        return iteration.new_list_iterator(answer_fns);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_query_variable_iterate(final SubLObject query_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject results = query_answers_kbq_run_query(query_spec);
        final SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject return_type = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject answer_fns = removal_create_set_of_variable_bindings(results, return_type);
        if (NIL != answer_fns) {
            return iteration.new_list_iterator(answer_fns);
        }
        return NIL;
    }

    public static final SubLObject removal_create_set_of_variable_bindings_alt(SubLObject results, SubLObject return_type) {
        if (NIL == results) {
            return NIL;
        }
        {
            SubLObject v_bindings = NIL;
            SubLObject pcase_var = return_type;
            if (pcase_var.eql($ANSWER)) {
                {
                    SubLObject cdolist_list_var = results;
                    SubLObject inference_answer = NIL;
                    for (inference_answer = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , inference_answer = cdolist_list_var.first()) {
                        {
                            SubLObject binding = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers.removal_query_variable_binding(inference_datastructures_inference.inference_answer_bindings(inference_answer));
                            if (NIL != binding) {
                                v_bindings = cons(binding, v_bindings);
                            } else {
                                return NIL;
                            }
                        }
                    }
                }
            } else {
                if (pcase_var.eql($BINDINGS)) {
                    {
                        SubLObject cdolist_list_var = results;
                        SubLObject bindings_set = NIL;
                        for (bindings_set = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , bindings_set = cdolist_list_var.first()) {
                            {
                                SubLObject binding = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers.removal_query_variable_binding(bindings_set);
                                if (NIL != binding) {
                                    v_bindings = cons(binding, v_bindings);
                                } else {
                                    return NIL;
                                }
                            }
                        }
                    }
                } else {
                    if (pcase_var.eql($BINDINGS_AND_SUPPORTS)) {
                        {
                            SubLObject cdolist_list_var = results;
                            SubLObject bindings_supports = NIL;
                            for (bindings_supports = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , bindings_supports = cdolist_list_var.first()) {
                                {
                                    SubLObject binding = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers.removal_query_variable_binding(bindings_supports.first());
                                    if (NIL != binding) {
                                        v_bindings = cons(binding, v_bindings);
                                    } else {
                                        return NIL;
                                    }
                                }
                            }
                        }
                    } else {
                        if (pcase_var.eql($BINDINGS_AND_HYPOTHETICAL_BINDINGS)) {
                            {
                                SubLObject cdolist_list_var = results.first();
                                SubLObject bindings_set = NIL;
                                for (bindings_set = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , bindings_set = cdolist_list_var.first()) {
                                    {
                                        SubLObject binding = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_query_answers.removal_query_variable_binding(bindings_set);
                                        if (NIL != binding) {
                                            v_bindings = cons(binding, v_bindings);
                                        } else {
                                            return NIL;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            v_bindings = nreverse(v_bindings);
            return list(make_el_set(v_bindings, UNPROVIDED));
        }
    }

    public static SubLObject removal_create_set_of_variable_bindings(final SubLObject results, final SubLObject return_type) {
        if (NIL == results) {
            return NIL;
        }
        SubLObject v_bindings = NIL;
        if (return_type.eql($ANSWER)) {
            SubLObject cdolist_list_var = results;
            SubLObject inference_answer = NIL;
            inference_answer = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject binding = removal_query_variable_binding(inference_datastructures_inference.inference_answer_bindings(inference_answer));
                if (NIL == binding) {
                    return NIL;
                }
                v_bindings = cons(binding, v_bindings);
                cdolist_list_var = cdolist_list_var.rest();
                inference_answer = cdolist_list_var.first();
            } 
        } else
            if (return_type.eql($BINDINGS)) {
                SubLObject cdolist_list_var = results;
                SubLObject bindings_set = NIL;
                bindings_set = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject binding = removal_query_variable_binding(bindings_set);
                    if (NIL == binding) {
                        return NIL;
                    }
                    v_bindings = cons(binding, v_bindings);
                    cdolist_list_var = cdolist_list_var.rest();
                    bindings_set = cdolist_list_var.first();
                } 
            } else
                if (return_type.eql($BINDINGS_AND_SUPPORTS)) {
                    SubLObject cdolist_list_var = results;
                    SubLObject bindings_supports = NIL;
                    bindings_supports = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject binding = removal_query_variable_binding(bindings_supports.first());
                        if (NIL == binding) {
                            return NIL;
                        }
                        v_bindings = cons(binding, v_bindings);
                        cdolist_list_var = cdolist_list_var.rest();
                        bindings_supports = cdolist_list_var.first();
                    } 
                } else
                    if (return_type.eql($BINDINGS_AND_HYPOTHETICAL_BINDINGS)) {
                        SubLObject cdolist_list_var = results.first();
                        SubLObject bindings_set = NIL;
                        bindings_set = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject binding = removal_query_variable_binding(bindings_set);
                            if (NIL == binding) {
                                return NIL;
                            }
                            v_bindings = cons(binding, v_bindings);
                            cdolist_list_var = cdolist_list_var.rest();
                            bindings_set = cdolist_list_var.first();
                        } 
                    }



        v_bindings = nreverse(v_bindings);
        return list(make_el_set(v_bindings, UNPROVIDED));
    }

    static private final SubLList $list_alt23 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("queryVariable"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("queryVariable"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list($TEST, makeSymbol("REMOVAL-CYCL-QUERY-SPECIFICATION-P")), list($TEST, makeSymbol("REMOVAL-ALLOWED-QUERY-VARIABLE-SENTENCE?"))), makeKeyword("ANYTHING")), $COST, makeSymbol("REMOVAL-QUERY-VARIABLE-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("queryVariable"), list($BIND, makeSymbol("QUERY-SPEC")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("QUERY-SPEC")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("QUERY-SPEC")), list($CALL, makeSymbol("REMOVAL-QUERY-VARIABLE-ITERATE"), list(makeKeyword("VALUE"), makeSymbol("QUERY-SPEC")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("queryVariable"), list(makeKeyword("VALUE"), makeSymbol("QUERY-SPEC")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$queryVariable <fully-bound> <anything>)\n    by recursively querying sentence and succeeding if the query returns the answer"), makeKeyword("EXAMPLE"), makeString("(#$queryVariable (#$QueryFn (#$Quote (#$ist InferencePSC (#$isa ?X #$Dog)))) ?SET)") });

    public static final SubLObject removal_query_variable_binding_alt(SubLObject bindings_set) {
        if (NIL == list_utilities.singletonP(bindings_set)) {
            return NIL;
        }
        return bindings.variable_binding_value(bindings_set.first());
    }

    public static SubLObject removal_query_variable_binding(final SubLObject bindings_set) {
        if (NIL == list_utilities.singletonP(bindings_set)) {
            return NIL;
        }
        return bindings.variable_binding_value(bindings_set.first());
    }

    public static SubLObject removal_justification_partial_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        final SubLObject askable_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject justification_sentence = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject query_properties_initial = inference_justification_partial_recursive_query_properties_initial(asent, mt);
        final SubLObject query_properties_continued = inference_justification_partial_recursive_query_properties_continued(asent, mt);
        SubLObject iteration_count = ZERO_INTEGER;
        SubLObject results = NIL;
        SubLObject halt_reason = NIL;
        SubLObject inference = NIL;
        SubLObject justification_mode = NIL;
        SubLObject justification_sentences = NIL;
        SubLObject doneP = NIL;
        if (NIL == el_formula_p(askable_sentence)) {
            return NIL;
        }
        if (NIL != el_conjunction_p(justification_sentence)) {
            justification_sentences = cycl_utilities.atomic_sentence_args(justification_sentence, UNPROVIDED);
            justification_mode = $$and;
        } else
            if (NIL != el_disjunction_p(justification_sentence)) {
                justification_sentences = cycl_utilities.atomic_sentence_args(justification_sentence, UNPROVIDED);
                justification_mode = $$or;
            } else {
                justification_sentences = list(justification_sentence);
                justification_mode = $$and;
            }

        while ((NIL == doneP) && iteration_count.numL($removal_justification_partial_expand_max_justifications_count$.getDynamicValue(thread))) {
            iteration_count = add(iteration_count, ONE_INTEGER);
            thread.resetMultipleValues();
            final SubLObject results_$1 = (NIL != inference) ? inference_justification_partial_recursive_inference_one_more_justification(inference, query_properties_continued) : inference_justification_partial_recursive_inference(askable_sentence, mt, query_properties_initial);
            final SubLObject halt_reason_$2 = thread.secondMultipleValue();
            final SubLObject inference_$3 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            results = results_$1;
            halt_reason = halt_reason_$2;
            inference = inference_$3;
            doneP = makeBoolean(!iteration_count.eql(length(inference_datastructures_inference.inference_answer_justifications(inference_datastructures_inference.inference_all_answers(inference, UNPROVIDED).first()))));
            if (NIL == doneP) {
                final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
                if (NIL != id_index_objects_empty_p(idx, $SKIP)) {
                    continue;
                }
                final SubLObject idx_$4 = idx;
                if (NIL == id_index_dense_objects_empty_p(idx_$4, $SKIP)) {
                    final SubLObject vector_var = id_index_dense_objects(idx_$4);
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject this_answer;
                    SubLObject cdolist_list_var;
                    SubLObject this_justification;
                    SubLObject original_supports;
                    SubLObject supports;
                    SubLObject checked_supports;
                    SubLObject found_justification_sentences;
                    SubLObject support;
                    SubLObject cdolist_list_var_$5;
                    SubLObject justification_sentence_$6;
                    SubLObject item_var;
                    SubLObject cdolist_list_var_$6;
                    SubLObject support_justification;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        this_answer = aref(vector_var, id);
                        if ((NIL == id_index_tombstone_p(this_answer)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            if (NIL != id_index_tombstone_p(this_answer)) {
                                this_answer = $SKIP;
                            }
                            cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(this_answer);
                            this_justification = NIL;
                            this_justification = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                original_supports = inference_datastructures_inference.inference_answer_justification_supports(this_justification);
                                supports = copy_list(original_supports);
                                checked_supports = NIL;
                                found_justification_sentences = NIL;
                                while (((NIL != supports) && ((!justification_mode.eql($$or)) || (NIL == found_justification_sentences))) && ((!justification_mode.eql($$and)) || length(found_justification_sentences).numL(length(justification_sentences)))) {
                                    support = supports.first();
                                    supports = supports.rest();
                                    cdolist_list_var_$5 = justification_sentences;
                                    justification_sentence_$6 = NIL;
                                    justification_sentence_$6 = cdolist_list_var_$5.first();
                                    while (NIL != cdolist_list_var_$5) {
                                        if (NIL != entails_elP(arguments.support_sentence(support), justification_sentence_$6)) {
                                            item_var = justification_sentence_$6;
                                            if (NIL == member(item_var, found_justification_sentences, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                found_justification_sentences = cons(item_var, found_justification_sentences);
                                            }
                                        }
                                        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                                        justification_sentence_$6 = cdolist_list_var_$5.first();
                                    } 
                                    checked_supports = cons(support, checked_supports);
                                    cdolist_list_var_$6 = arguments.support_justification(support);
                                    support_justification = NIL;
                                    support_justification = cdolist_list_var_$6.first();
                                    while (NIL != cdolist_list_var_$6) {
                                        if (NIL == subl_promotions.memberP(support_justification, checked_supports, symbol_function(EQUAL), UNPROVIDED)) {
                                            supports = cons(support_justification, supports);
                                        }
                                        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                                        support_justification = cdolist_list_var_$6.first();
                                    } 
                                } 
                                if ((NIL != found_justification_sentences) && ((!justification_mode.eql($$and)) || length(found_justification_sentences).numE(length(justification_sentences)))) {
                                    doneP = T;
                                    backward.removal_add_node(original_supports.first(), NIL, original_supports.rest());
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                this_justification = cdolist_list_var.first();
                            } 
                        }
                    }
                }
                final SubLObject idx_$5 = idx;
                if (NIL != id_index_sparse_objects_empty_p(idx_$5)) {
                    continue;
                }
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$5);
                SubLObject id2 = NIL;
                SubLObject this_answer2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        this_answer2 = getEntryValue(cdohash_entry);
                        SubLObject cdolist_list_var2 = inference_datastructures_inference.inference_answer_justifications(this_answer2);
                        SubLObject this_justification2 = NIL;
                        this_justification2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            final SubLObject original_supports2 = inference_datastructures_inference.inference_answer_justification_supports(this_justification2);
                            SubLObject supports2 = copy_list(original_supports2);
                            SubLObject checked_supports2 = NIL;
                            SubLObject found_justification_sentences2 = NIL;
                            while (((NIL != supports2) && ((!justification_mode.eql($$or)) || (NIL == found_justification_sentences2))) && ((!justification_mode.eql($$and)) || length(found_justification_sentences2).numL(length(justification_sentences)))) {
                                final SubLObject support2 = supports2.first();
                                supports2 = supports2.rest();
                                SubLObject cdolist_list_var_$7 = justification_sentences;
                                SubLObject justification_sentence_$7 = NIL;
                                justification_sentence_$7 = cdolist_list_var_$7.first();
                                while (NIL != cdolist_list_var_$7) {
                                    if (NIL != entails_elP(arguments.support_sentence(support2), justification_sentence_$7)) {
                                        final SubLObject item_var2 = justification_sentence_$7;
                                        if (NIL == member(item_var2, found_justification_sentences2, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            found_justification_sentences2 = cons(item_var2, found_justification_sentences2);
                                        }
                                    }
                                    cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                                    justification_sentence_$7 = cdolist_list_var_$7.first();
                                } 
                                checked_supports2 = cons(support2, checked_supports2);
                                SubLObject cdolist_list_var_$8 = arguments.support_justification(support2);
                                SubLObject support_justification2 = NIL;
                                support_justification2 = cdolist_list_var_$8.first();
                                while (NIL != cdolist_list_var_$8) {
                                    if (NIL == subl_promotions.memberP(support_justification2, checked_supports2, symbol_function(EQUAL), UNPROVIDED)) {
                                        supports2 = cons(support_justification2, supports2);
                                    }
                                    cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                                    support_justification2 = cdolist_list_var_$8.first();
                                } 
                            } 
                            if ((NIL != found_justification_sentences2) && ((!justification_mode.eql($$and)) || length(found_justification_sentences2).numE(length(justification_sentences)))) {
                                doneP = T;
                                backward.removal_add_node(original_supports2.first(), NIL, original_supports2.rest());
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            this_justification2 = cdolist_list_var2.first();
                        } 
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        } 
        return NIL;
    }

    public static SubLObject entails_elP(final SubLObject sentence, final SubLObject entailed_sentence) {
        if (NIL != czer_utilities.equals_elP(sentence, entailed_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        if ((((NIL != fort_types_interface.predicate_p(sentence.first())) && (NIL != fort_types_interface.predicate_p(entailed_sentence.first()))) && (NIL != genl_predicates.genl_predicateP(sentence.first(), entailed_sentence.first(), UNPROVIDED, UNPROVIDED))) && sentence.rest().equal(entailed_sentence.rest())) {
            return T;
        }
        return NIL;
    }

    public static SubLObject inference_justification_partial_recursive_inference(final SubLObject formula, final SubLObject mt, final SubLObject query_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject results = ask_utilities.inference_recursive_query(formula, mt, query_properties);
        final SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject inference = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return values(results, halt_reason, inference);
    }

    public static SubLObject inference_justification_partial_recursive_inference_one_more_justification(final SubLObject inference, final SubLObject query_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject results = inference_kernel.continue_inference(inference, query_properties);
        final SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject inference_$12 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return values(results, halt_reason, inference_$12);
    }

    public static SubLObject inference_justification_partial_recursive_query_properties_initial(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject query_properties = inference_trampolines.determine_sentence_recursive_query_properties(formula, mt);
        query_properties = putf(query_properties, $MAX_NUMBER, ONE_INTEGER);
        query_properties = putf(query_properties, $CONTINUABLE_, T);
        query_properties = putf(query_properties, $BROWSABLE_, T);
        query_properties = putf(query_properties, $ALLOWED_MODULES, removal_modules_abduction.abductive_modules_not_allowed_spec());
        final SubLObject inference = inference_macros.current_controlling_inference();
        if (NIL != inference_datastructures_inference.inference_p(inference)) {
            query_properties = putf(query_properties, $MAX_TIME, inference_utilities.inference_property_lookup(inference, $MAX_TIME, UNPROVIDED));
            query_properties = putf(query_properties, $MAX_TRANSFORMATION_DEPTH, inference_utilities.inference_property_lookup(inference, $MAX_TRANSFORMATION_DEPTH, UNPROVIDED));
            query_properties = putf(query_properties, $ALLOWED_RULES, inference_datastructures_inference.inference_allowed_rules_list(inference));
            query_properties = putf(query_properties, $ALLOWED_MODULES, inference_datastructures_inference.inference_allowed_modules(inference));
        } else {
            query_properties = putf(query_properties, $MAX_TRANSFORMATION_DEPTH, ONE_INTEGER);
        }
        return query_properties;
    }

    public static SubLObject inference_justification_partial_recursive_query_properties_continued(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject query_properties = inference_trampolines.determine_sentence_recursive_query_properties(formula, mt);
        query_properties = putf(query_properties, $MAX_NUMBER, ONE_INTEGER);
        query_properties = putf(query_properties, $CONTINUABLE_, T);
        final SubLObject inference = inference_macros.current_controlling_inference();
        if (NIL != inference_datastructures_inference.inference_p(inference)) {
            query_properties = putf(query_properties, $MAX_TIME, inference_utilities.inference_property_lookup(inference, $MAX_TIME, UNPROVIDED));
            query_properties = putf(query_properties, $MAX_TRANSFORMATION_DEPTH, inference_utilities.inference_property_lookup(inference, $MAX_TRANSFORMATION_DEPTH, UNPROVIDED));
        } else {
            query_properties = putf(query_properties, $MAX_TRANSFORMATION_DEPTH, ONE_INTEGER);
        }
        return query_properties;
    }

    public static SubLObject removal_firstinlistsatisfying_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject doneP = NIL;
        if (NIL == doneP) {
            SubLObject csome_list_var = el_list_items(arg1);
            SubLObject elem = NIL;
            elem = csome_list_var.first();
            while ((NIL == doneP) && (NIL != csome_list_var)) {
                if (NIL != ask_utilities.inference_recursive_query(make_unary_formula(arg2, elem), UNPROVIDED, UNPROVIDED)) {
                    doneP = T;
                    final SubLObject answer_asent = make_ternary_formula($$firstInListSatisfying, arg1, arg2, elem);
                    final SubLObject v_bindings = unification_utilities.term_unify(answer_asent, asent, UNPROVIDED, UNPROVIDED);
                    if (NIL != v_bindings) {
                        backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
                    }
                }
                csome_list_var = csome_list_var.rest();
                elem = csome_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject test_removal_firstinlistsatisfying_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLObject v_answer = inference_kernel.new_cyc_query(sentence, mt, query_properties);
        if (NIL != cyc_kernel.closed_query_success_token_p(v_answer)) {
            return T;
        }
        if (NIL != bindings.bindings_p(v_answer)) {
            return Mapping.mapcar(FIRST, Mapping.mapcar(BINDINGS_VALUES, v_answer));
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_query_answers_file() {
        declareFunction("removal_cycl_query_specification_p", "REMOVAL-CYCL-QUERY-SPECIFICATION-P", 1, 0, false);
        declareFunction("removal_allowed_query_answers_sentenceP", "REMOVAL-ALLOWED-QUERY-ANSWERS-SENTENCE?", 1, 0, false);
        declareFunction("removal_query_answers_cost", "REMOVAL-QUERY-ANSWERS-COST", 1, 0, false);
        declareFunction("removal_query_answers_iterate", "REMOVAL-QUERY-ANSWERS-ITERATE", 1, 0, false);
        declareFunction("removal_create_inference_answer_fns", "REMOVAL-CREATE-INFERENCE-ANSWER-FNS", 2, 0, false);
        declareFunction("removal_create_inference_answer_fn_from_answers", "REMOVAL-CREATE-INFERENCE-ANSWER-FN-FROM-ANSWERS", 1, 0, false);
        declareFunction("removal_create_inference_answer_fn_from_bindings", "REMOVAL-CREATE-INFERENCE-ANSWER-FN-FROM-BINDINGS", 1, 0, false);
        declareFunction("removal_create_inference_answer_fn_from_supports", "REMOVAL-CREATE-INFERENCE-ANSWER-FN-FROM-SUPPORTS", 1, 0, false);
        declareFunction("removal_create_inference_answer_fn_from_bindings_and_supports", "REMOVAL-CREATE-INFERENCE-ANSWER-FN-FROM-BINDINGS-AND-SUPPORTS", 1, 0, false);
        declareFunction("removal_create_inference_answer_fn_from_bindings_and_hypothetical_bindings", "REMOVAL-CREATE-INFERENCE-ANSWER-FN-FROM-BINDINGS-AND-HYPOTHETICAL-BINDINGS", 1, 0, false);
        declareFunction("removal_justification_fns", "REMOVAL-JUSTIFICATION-FNS", 1, 0, false);
        declareFunction("removal_justification_fns_from_supports", "REMOVAL-JUSTIFICATION-FNS-FROM-SUPPORTS", 1, 0, false);
        declareFunction("removal_create_justification_fn", "REMOVAL-CREATE-JUSTIFICATION-FN", 1, 0, false);
        declareFunction("removal_support_datastructures", "REMOVAL-SUPPORT-DATASTRUCTURES", 1, 0, false);
        declareFunction("removal_create_cycl_hl_support_fn", "REMOVAL-CREATE-CYCL-HL-SUPPORT-FN", 1, 0, false);
        declareFunction("removal_create_inference_answer_fn", "REMOVAL-CREATE-INFERENCE-ANSWER-FN", 2, 0, false);
        declareFunction("query_answers_kbq_run_query", "QUERY-ANSWERS-KBQ-RUN-QUERY", 1, 0, false);
        declareFunction("removal_allowed_query_bindings_sentenceP", "REMOVAL-ALLOWED-QUERY-BINDINGS-SENTENCE?", 1, 0, false);
        declareFunction("removal_query_bindings_cost", "REMOVAL-QUERY-BINDINGS-COST", 1, 0, false);
        declareFunction("removal_query_bindings_iterate", "REMOVAL-QUERY-BINDINGS-ITERATE", 1, 0, false);
        declareFunction("removal_create_el_bindings_sets", "REMOVAL-CREATE-EL-BINDINGS-SETS", 2, 0, false);
        declareFunction("removal_allowed_query_variable_sentenceP", "REMOVAL-ALLOWED-QUERY-VARIABLE-SENTENCE?", 1, 0, false);
        declareFunction("removal_query_variable_cost", "REMOVAL-QUERY-VARIABLE-COST", 1, 0, false);
        declareFunction("removal_query_variable_iterate", "REMOVAL-QUERY-VARIABLE-ITERATE", 1, 0, false);
        declareFunction("removal_create_set_of_variable_bindings", "REMOVAL-CREATE-SET-OF-VARIABLE-BINDINGS", 2, 0, false);
        declareFunction("removal_query_variable_binding", "REMOVAL-QUERY-VARIABLE-BINDING", 1, 0, false);
        declareFunction("removal_justification_partial_expand", "REMOVAL-JUSTIFICATION-PARTIAL-EXPAND", 1, 1, false);
        declareFunction("entails_elP", "ENTAILS-EL?", 2, 0, false);
        declareFunction("inference_justification_partial_recursive_inference", "INFERENCE-JUSTIFICATION-PARTIAL-RECURSIVE-INFERENCE", 3, 0, false);
        declareFunction("inference_justification_partial_recursive_inference_one_more_justification", "INFERENCE-JUSTIFICATION-PARTIAL-RECURSIVE-INFERENCE-ONE-MORE-JUSTIFICATION", 2, 0, false);
        declareFunction("inference_justification_partial_recursive_query_properties_initial", "INFERENCE-JUSTIFICATION-PARTIAL-RECURSIVE-QUERY-PROPERTIES-INITIAL", 1, 1, false);
        declareFunction("inference_justification_partial_recursive_query_properties_continued", "INFERENCE-JUSTIFICATION-PARTIAL-RECURSIVE-QUERY-PROPERTIES-CONTINUED", 1, 1, false);
        declareFunction("removal_firstinlistsatisfying_expand", "REMOVAL-FIRSTINLISTSATISFYING-EXPAND", 1, 1, false);
        declareFunction("test_removal_firstinlistsatisfying_expand", "TEST-REMOVAL-FIRSTINLISTSATISFYING-EXPAND", 1, 2, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_query_answers_file() {
        defparameter("*REMOVAL-JUSTIFICATION-PARTIAL-EXPAND-MAX-JUSTIFICATIONS-COUNT*", TEN_INTEGER);
        return NIL;
    }

    public static final SubLObject setup_removal_modules_query_answers_file_alt() {
        inference_modules.register_solely_specific_removal_module_predicate($$queryAnswers);
        inference_modules.inference_removal_module($REMOVAL_QUERY_ANSWERS, $list_alt3);
        inference_modules.register_solely_specific_removal_module_predicate($const15$inferenceAnswerBindingsAndJustifi);
        inference_modules.inference_removal_module($REMOVAL_INFERENCE_ANSWER_BINDINGS_AND_JUSTIFICATIONS, $list_alt17);
        inference_modules.register_solely_specific_removal_module_predicate($const15$inferenceAnswerBindingsAndJustifi);
        inference_modules.inference_removal_module($REMOVAL_INFERENCE_ANSWER_BINDINGS_AND_JUSTIFICATIONS, $list_alt17);
        inference_modules.register_solely_specific_removal_module_predicate($const15$inferenceAnswerBindingsAndJustifi);
        inference_modules.inference_removal_module($REMOVAL_INFERENCE_ANSWER_BINDINGS_AND_JUSTIFICATIONS, $list_alt17);
        inference_modules.register_solely_specific_removal_module_predicate($$queryBindings);
        inference_modules.inference_removal_module($REMOVAL_QUERY_BINDINGS, $list_alt20);
        inference_modules.register_solely_specific_removal_module_predicate($$queryVariable);
        inference_modules.inference_removal_module($REMOVAL_QUERY_VARIABLE, $list_alt23);
        return NIL;
    }

    public static SubLObject setup_removal_modules_query_answers_file() {
        if (SubLFiles.USE_V1) {
            inference_modules.register_solely_specific_removal_module_predicate($$queryAnswers);
            preference_modules.doomed_unless_arg_bindable($POS, $$queryAnswers, ONE_INTEGER);
            inference_modules.inference_removal_module($REMOVAL_QUERY_ANSWERS, $list4);
            inference_modules.register_solely_specific_removal_module_predicate($const16$inferenceAnswerBindingsAndJustifi);
            preference_modules.doomed_unless_arg_bindable($POS, $const16$inferenceAnswerBindingsAndJustifi, ONE_INTEGER);
            inference_modules.inference_removal_module($REMOVAL_INFERENCE_ANSWER_BINDINGS_AND_JUSTIFICATIONS, $list18);
            inference_modules.register_solely_specific_removal_module_predicate($$queryBindings);
            preference_modules.doomed_unless_arg_bindable($POS, $$queryBindings, ONE_INTEGER);
            inference_modules.inference_removal_module($REMOVAL_QUERY_BINDINGS, $list21);
            inference_modules.register_solely_specific_removal_module_predicate($$queryVariable);
            preference_modules.doomed_unless_arg_bindable($POS, $$queryVariable, ONE_INTEGER);
            inference_modules.inference_removal_module($REMOVAL_QUERY_VARIABLE, $list24);
            inference_modules.register_solely_specific_removal_module_predicate($$justification_Partial);
            preference_modules.doomed_unless_all_args_bindable($POS, $$justification_Partial);
            inference_modules.inference_removal_module($REMOVAL_JUSTIFICATION_PARTIAL, $list27);
            inference_modules.register_solely_specific_removal_module_predicate($$firstInListSatisfying);
            preference_modules.doomed_unless_arg_bindable($POS, $$firstInListSatisfying, ONE_INTEGER);
            preference_modules.doomed_unless_arg_bindable($POS, $$firstInListSatisfying, TWO_INTEGER);
            inference_modules.inference_removal_module($REMOVAL_FIRSTINLISTSATISFYING, $list40);
            define_test_case_table_int(TEST_REMOVAL_FIRSTINLISTSATISFYING_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list51);
        }
        if (SubLFiles.USE_V2) {
            inference_modules.inference_removal_module($REMOVAL_QUERY_ANSWERS, $list_alt3);
            inference_modules.register_solely_specific_removal_module_predicate($const15$inferenceAnswerBindingsAndJustifi);
            inference_modules.inference_removal_module($REMOVAL_INFERENCE_ANSWER_BINDINGS_AND_JUSTIFICATIONS, $list_alt17);
            inference_modules.register_solely_specific_removal_module_predicate($const15$inferenceAnswerBindingsAndJustifi);
            inference_modules.inference_removal_module($REMOVAL_INFERENCE_ANSWER_BINDINGS_AND_JUSTIFICATIONS, $list_alt17);
            inference_modules.register_solely_specific_removal_module_predicate($const15$inferenceAnswerBindingsAndJustifi);
            inference_modules.inference_removal_module($REMOVAL_INFERENCE_ANSWER_BINDINGS_AND_JUSTIFICATIONS, $list_alt17);
            inference_modules.inference_removal_module($REMOVAL_QUERY_BINDINGS, $list_alt20);
            inference_modules.inference_removal_module($REMOVAL_QUERY_VARIABLE, $list_alt23);
        }
        return NIL;
    }

    public static SubLObject setup_removal_modules_query_answers_file_Previous() {
        inference_modules.register_solely_specific_removal_module_predicate($$queryAnswers);
        preference_modules.doomed_unless_arg_bindable($POS, $$queryAnswers, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_QUERY_ANSWERS, $list4);
        inference_modules.register_solely_specific_removal_module_predicate($const16$inferenceAnswerBindingsAndJustifi);
        preference_modules.doomed_unless_arg_bindable($POS, $const16$inferenceAnswerBindingsAndJustifi, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_INFERENCE_ANSWER_BINDINGS_AND_JUSTIFICATIONS, $list18);
        inference_modules.register_solely_specific_removal_module_predicate($$queryBindings);
        preference_modules.doomed_unless_arg_bindable($POS, $$queryBindings, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_QUERY_BINDINGS, $list21);
        inference_modules.register_solely_specific_removal_module_predicate($$queryVariable);
        preference_modules.doomed_unless_arg_bindable($POS, $$queryVariable, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_QUERY_VARIABLE, $list24);
        inference_modules.register_solely_specific_removal_module_predicate($$justification_Partial);
        preference_modules.doomed_unless_all_args_bindable($POS, $$justification_Partial);
        inference_modules.inference_removal_module($REMOVAL_JUSTIFICATION_PARTIAL, $list27);
        inference_modules.register_solely_specific_removal_module_predicate($$firstInListSatisfying);
        preference_modules.doomed_unless_arg_bindable($POS, $$firstInListSatisfying, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$firstInListSatisfying, TWO_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_FIRSTINLISTSATISFYING, $list40);
        define_test_case_table_int(TEST_REMOVAL_FIRSTINLISTSATISFYING_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list51);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_query_answers_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_query_answers_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_query_answers_file();
    }

    
}

/**
 * Total time: 338 ms
 */
