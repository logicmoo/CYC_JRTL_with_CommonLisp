/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$cheap_hl_module_check_cost$;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.el_set_items;
import static com.cyc.cycjava.cycl.el_utilities.list_to_elf;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.id_index.do_id_index_empty_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_id_and_object_validP;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_state;
import static com.cyc.cycjava.cycl.id_index.do_id_index_state_object;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.truncate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-MODULES-INFERENCE-REFLECTION
 * source file: /cyc/top/cycl/inference/modules/removal/removal-modules-inference-reflection.lisp
 * created:     2019/07/03 17:37:47
 */
public final class removal_modules_inference_reflection extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_inference_reflection();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_inference_reflection";


    // deflexical
    // Divisor for estimating problems in a store mentioning a term.
    /**
     * Divisor for estimating problems in a store mentioning a term.
     */
    @LispMethod(comment = "Divisor for estimating problems in a store mentioning a term.\ndeflexical")
    private static final SubLSymbol $problem_count_for_term_divisor$ = makeSymbol("*PROBLEM-COUNT-FOR-TERM-DIVISOR*");

    // deflexical
    /**
     * The ratio between number of terms mentioned in a problem store and the number
     * of problems.
     */
    @LispMethod(comment = "The ratio between number of terms mentioned in a problem store and the number\r\nof problems.\ndeflexical\nThe ratio between number of terms mentioned in a problem store and the number\nof problems.")
    private static final SubLSymbol $problem_store_term_to_problem_ratio$ = makeSymbol("*PROBLEM-STORE-TERM-TO-PROBLEM-RATIO*");

    // deflexical
    // The average number of terms mentioned in a problem query.
    /**
     * The average number of terms mentioned in a problem query.
     */
    @LispMethod(comment = "The average number of terms mentioned in a problem query.\ndeflexical")
    private static final SubLSymbol $average_problem_query_term_count$ = makeSymbol("*AVERAGE-PROBLEM-QUERY-TERM-COUNT*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $default_transformation_proof_rule_check_cost$ = makeSymbol("*DEFAULT-TRANSFORMATION-PROOF-RULE-CHECK-COST*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $default_transformation_proof_rule_lookup_cost$ = makeSymbol("*DEFAULT-TRANSFORMATION-PROOF-RULE-LOOKUP-COST*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $default_transformation_proof_bindings_check_cost$ = makeSymbol("*DEFAULT-TRANSFORMATION-PROOF-BINDINGS-CHECK-COST*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $default_transformation_proof_bindings_lookup_cost$ = makeSymbol("*DEFAULT-TRANSFORMATION-PROOF-BINDINGS-LOOKUP-COST*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $default_inference_answer_bindings_check_cost$ = makeSymbol("*DEFAULT-INFERENCE-ANSWER-BINDINGS-CHECK-COST*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $default_inference_answer_bindings_lookup_cost$ = makeSymbol("*DEFAULT-INFERENCE-ANSWER-BINDINGS-LOOKUP-COST*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $default_inference_binding_var_check_cost$ = makeSymbol("*DEFAULT-INFERENCE-BINDING-VAR-CHECK-COST*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $default_inference_binding_var_lookup_cost$ = makeSymbol("*DEFAULT-INFERENCE-BINDING-VAR-LOOKUP-COST*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $default_inference_binding_value_check_cost$ = makeSymbol("*DEFAULT-INFERENCE-BINDING-VALUE-CHECK-COST*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $default_inference_binding_value_lookup_cost$ = makeSymbol("*DEFAULT-INFERENCE-BINDING-VALUE-LOOKUP-COST*");

    // deflexical
    // A list of all inference reflection predicates with HL module support.
    /**
     * A list of all inference reflection predicates with HL module support.
     */
    @LispMethod(comment = "A list of all inference reflection predicates with HL module support.\ndeflexical")
    private static final SubLSymbol $supported_inference_reflection_predicates$ = makeSymbol("*SUPPORTED-INFERENCE-REFLECTION-PREDICATES*");

    static private final SubLSymbol $sym3$_ = makeSymbol("<");

    static private final SubLList $list5 = list(reader_make_constant_shell("CycProblemStoreFn"), list($BIND, makeSymbol("STORE-ID")));

    private static final SubLSymbol STORE_ID = makeSymbol("STORE-ID");



    static private final SubLList $list8 = list(reader_make_constant_shell("CycProblemFn"), list($BIND, makeSymbol("PROBLEM-ID")), list(reader_make_constant_shell("CycProblemStoreFn"), list($BIND, makeSymbol("STORE-ID"))));

    private static final SubLSymbol PROBLEM_ID = makeSymbol("PROBLEM-ID");



    static private final SubLList $list11 = list(reader_make_constant_shell("CycProblemLinkFn"), list($BIND, makeSymbol("LINK-ID")), list(reader_make_constant_shell("CycProblemStoreFn"), list($BIND, makeSymbol("STORE-ID"))));

    private static final SubLSymbol LINK_ID = makeSymbol("LINK-ID");



    static private final SubLList $list14 = list(reader_make_constant_shell("CycProofFn"), list($BIND, makeSymbol("PROOF-ID")), list(reader_make_constant_shell("CycProblemStoreFn"), list($BIND, makeSymbol("STORE-ID"))));

    private static final SubLSymbol PROOF_ID = makeSymbol("PROOF-ID");



    static private final SubLList $list17 = list(reader_make_constant_shell("CycInferenceFn"), list($BIND, makeSymbol("INFERENCE-ID")), list(reader_make_constant_shell("CycProblemStoreFn"), list($BIND, makeSymbol("STORE-ID"))));



    private static final SubLObject $$Good_ProblemProvabilityStatus = reader_make_constant_shell("Good-ProblemProvabilityStatus");

    private static final SubLObject $$Neutral_ProblemProvabilityStatus = reader_make_constant_shell("Neutral-ProblemProvabilityStatus");

    private static final SubLObject $$NoGood_ProblemProvabilityStatus = reader_make_constant_shell("NoGood-ProblemProvabilityStatus");

    static private final SubLList $list26 = list(reader_make_constant_shell("ELInferenceBindingFn"), list($BIND, makeSymbol("EL-VAR")), list($BIND, makeSymbol("VALUE")));

    static private final SubLList $list29 = cons(makeSymbol("EL-VAR"), makeSymbol("VALUE"));





    private static final SubLSymbol $REMOVAL_PROBLEM_STORE_PROBLEM_COUNT_LOOKUP = makeKeyword("REMOVAL-PROBLEM-STORE-PROBLEM-COUNT-LOOKUP");

    private static final SubLList $list34 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycProblemStoreProblemCount"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycProblemStoreProblemCount"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycProblemStoreProblemCount"), list($BIND, makeSymbol("CYCL-STORE")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE"))), makeKeyword("INPUT-ENCODE-PATTERN"), list($CALL, makeSymbol("CYCL-PROBLEM-STORE-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("REMOVAL-PROBLEM-STORE-PROBLEM-COUNT"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("cycProblemStoreProblemCount"), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE")), makeKeyword("INPUT")) });



    private static final SubLSymbol $REMOVAL_PROBLEM_STORE_LINK_COUNT_LOOKUP = makeKeyword("REMOVAL-PROBLEM-STORE-LINK-COUNT-LOOKUP");

    private static final SubLList $list37 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycProblemStoreLinkCount"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycProblemStoreLinkCount"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycProblemStoreLinkCount"), list($BIND, makeSymbol("CYCL-STORE")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE"))), makeKeyword("INPUT-ENCODE-PATTERN"), list($CALL, makeSymbol("CYCL-PROBLEM-STORE-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("REMOVAL-PROBLEM-STORE-LINK-COUNT"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("cycProblemStoreLinkCount"), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE")), makeKeyword("INPUT")) });



    private static final SubLSymbol $REMOVAL_PROBLEM_STORE_PROOF_COUNT_LOOKUP = makeKeyword("REMOVAL-PROBLEM-STORE-PROOF-COUNT-LOOKUP");

    private static final SubLList $list40 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycProblemStoreProofCount"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycProblemStoreProofCount"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycProblemStoreProofCount"), list($BIND, makeSymbol("CYCL-STORE")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE"))), makeKeyword("INPUT-ENCODE-PATTERN"), list($CALL, makeSymbol("CYCL-PROBLEM-STORE-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("REMOVAL-PROBLEM-STORE-PROOF-COUNT"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("cycProblemStoreProofCount"), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE")), makeKeyword("INPUT")) });



    private static final SubLSymbol $REMOVAL_PROBLEM_STORE_INFERENCE_COUNT_LOOKUP = makeKeyword("REMOVAL-PROBLEM-STORE-INFERENCE-COUNT-LOOKUP");

    private static final SubLList $list43 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycProblemStoreInferenceCount"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycProblemStoreInferenceCount"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycProblemStoreInferenceCount"), list($BIND, makeSymbol("CYCL-STORE")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE"))), makeKeyword("INPUT-ENCODE-PATTERN"), list($CALL, makeSymbol("CYCL-PROBLEM-STORE-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("REMOVAL-PROBLEM-STORE-INFERENCE-COUNT"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("cycProblemStoreInferenceCount"), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE")), makeKeyword("INPUT")) });



    private static final SubLSymbol $REMOVAL_PROBLEM_STORE_TERMS_CHECK_POS = makeKeyword("REMOVAL-PROBLEM-STORE-TERMS-CHECK-POS");

    static private final SubLList $list47 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycProblemStoreTerms"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycProblemStoreTerms"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycProblemStoreTerms"), list($BIND, makeSymbol("CYCL-STORE")), list($BIND, makeSymbol("TERM"))), list(list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE")), list(makeKeyword("VALUE"), makeSymbol("TERM")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-STORE"), makeSymbol("TERM")), list(list($CALL, makeSymbol("CYCL-PROBLEM-STORE-ENCODE"), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE"))), list(makeKeyword("VALUE"), makeSymbol("TERM")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("STORE"), makeSymbol("TERM")), list($CALL, makeSymbol("REMOVAL-PROBLEM-STORE-TERMS-CHECK"), list(makeKeyword("VALUE"), makeSymbol("STORE")), list(makeKeyword("VALUE"), makeSymbol("TERM")))) });

    private static final SubLSymbol $REMOVAL_PROBLEM_STORE_TERMS_CHECK_NEG = makeKeyword("REMOVAL-PROBLEM-STORE-TERMS-CHECK-NEG");

    static private final SubLList $list49 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycProblemStoreTerms"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycProblemStoreTerms"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), list(makeSymbol("INVERT-REMOVAL-CHECK-COST"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycProblemStoreTerms"), list($BIND, makeSymbol("CYCL-STORE")), list($BIND, makeSymbol("TERM"))), list(list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE")), list(makeKeyword("VALUE"), makeSymbol("TERM")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-STORE"), makeSymbol("TERM")), list(list($CALL, makeSymbol("CYCL-PROBLEM-STORE-ENCODE"), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE"))), list(makeKeyword("VALUE"), makeSymbol("TERM")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("STORE"), makeSymbol("TERM")), list($CALL, makeSymbol("INVERT-BOOLEAN-ANSWER"), list($CALL, makeSymbol("REMOVAL-PROBLEM-STORE-TERMS-CHECK"), list(makeKeyword("VALUE"), makeSymbol("STORE")), list(makeKeyword("VALUE"), makeSymbol("TERM"))))) });

    private static final SubLSymbol $REMOVAL_PROBLEM_STORE_TERMS_ARG2_UNIFY = makeKeyword("REMOVAL-PROBLEM-STORE-TERMS-ARG2-UNIFY");

    private static final SubLList $list51 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycProblemStoreTerms"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycProblemStoreTerms"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), $COST, makeSymbol("REMOVAL-PROBLEM-STORE-TERMS-ARG2-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycProblemStoreTerms"), list($BIND, makeSymbol("CYCL-STORE")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE"))), makeKeyword("INPUT-ENCODE-PATTERN"), list($CALL, makeSymbol("CYCL-PROBLEM-STORE-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-PROBLEM-STORE-TERMS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("cycProblemStoreTerms"), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE")), makeKeyword("INPUT")) });



    private static final SubLSymbol $REMOVAL_PROBLEM_STORE_PROBLEMS_ARG1_UNIFY = makeKeyword("REMOVAL-PROBLEM-STORE-PROBLEMS-ARG1-UNIFY");

    static private final SubLList $list54 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycProblemStoreProblems"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycProblemStoreProblems"), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycProblemStoreProblems"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("CYCL-PROBLEM"))), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM"))), makeKeyword("INPUT-ENCODE-PATTERN"), list($CALL, makeSymbol("CYCL-PROBLEM-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("REMOVAL-PROBLEM-STORE"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-DECODE-PATTERN"), list($CALL, makeSymbol("CYCL-PROBLEM-STORE-DECODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("cycProblemStoreProblems"), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM"))) });

    private static final SubLSymbol $REMOVAL_PROBLEM_STORE_PROBLEMS_ARG2_UNIFY = makeKeyword("REMOVAL-PROBLEM-STORE-PROBLEMS-ARG2-UNIFY");

    private static final SubLList $list56 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycProblemStoreProblems"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycProblemStoreProblems"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), $COST, makeSymbol("REMOVAL-PROBLEM-STORE-PROBLEMS-ARG2-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycProblemStoreProblems"), list($BIND, makeSymbol("CYCL-STORE")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE"))), makeKeyword("INPUT-ENCODE-PATTERN"), list($CALL, makeSymbol("CYCL-PROBLEM-STORE-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-PROBLEM-STORE-PROBLEM-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list($CALL, makeSymbol("CYCL-PROBLEM-DECODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("cycProblemStoreProblems"), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE")), makeKeyword("INPUT")) });



    private static final SubLSymbol $REMOVAL_PROBLEM_QUERY_SENTENCE_ARG2_UNIFY = makeKeyword("REMOVAL-PROBLEM-QUERY-SENTENCE-ARG2-UNIFY");

    private static final SubLList $list59 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycProblemQuerySentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycProblemQuerySentence"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycProblemQuerySentence"), list($BIND, makeSymbol("CYCL-PROBLEM")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM"))), makeKeyword("INPUT-ENCODE-PATTERN"), list($CALL, makeSymbol("CYCL-PROBLEM-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("REMOVAL-PROBLEM-QUERY"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-DECODE-PATTERN"), list($CALL, makeSymbol("PROBLEM-QUERY-EL-FORMULA"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("cycProblemQuerySentence"), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM")), makeKeyword("INPUT")) });



    private static final SubLSymbol $REMOVAL_PROBLEM_QUERY_TERMS_CHECK_POS = makeKeyword("REMOVAL-PROBLEM-QUERY-TERMS-CHECK-POS");

    static private final SubLList $list62 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycProblemQueryTerms"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycProblemQueryTerms"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycProblemQueryTerms"), list($BIND, makeSymbol("CYCL-PROBLEM")), list($BIND, makeSymbol("TERM"))), list(list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM")), list(makeKeyword("VALUE"), makeSymbol("TERM")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-PROBLEM"), makeSymbol("TERM")), list(list($CALL, makeSymbol("CYCL-PROBLEM-ENCODE"), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM"))), list(makeKeyword("VALUE"), makeSymbol("TERM")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("PROBLEM"), makeSymbol("TERM")), list($CALL, makeSymbol("REMOVAL-PROBLEM-QUERY-TERMS-CHECK"), list(makeKeyword("VALUE"), makeSymbol("PROBLEM")), list(makeKeyword("VALUE"), makeSymbol("TERM")))) });

    private static final SubLSymbol $REMOVAL_PROBLEM_QUERY_TERMS_CHECK_NEG = makeKeyword("REMOVAL-PROBLEM-QUERY-TERMS-CHECK-NEG");

    private static final SubLList $list64 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycProblemQueryTerms"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycProblemQueryTerms"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), list(makeSymbol("INVERT-REMOVAL-CHECK-COST"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycProblemQueryTerms"), list($BIND, makeSymbol("CYCL-PROBLEM")), list($BIND, makeSymbol("TERM"))), list(list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM")), list(makeKeyword("VALUE"), makeSymbol("TERM")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-PROBLEM"), makeSymbol("TERM")), list(list($CALL, makeSymbol("CYCL-PROBLEM-ENCODE"), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM"))), list(makeKeyword("VALUE"), makeSymbol("TERM")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("PROBLEM"), makeSymbol("TERM")), list($CALL, makeSymbol("INVERT-BOOLEAN-ANSWER"), list($CALL, makeSymbol("REMOVAL-PROBLEM-QUERY-TERMS-CHECK"), list(makeKeyword("VALUE"), makeSymbol("PROBLEM")), list(makeKeyword("VALUE"), makeSymbol("TERM"))))) });

    private static final SubLList $list65 = list(reader_make_constant_shell("cycProblemQueryTerms"), list(reader_make_constant_shell("CycProblemFn"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("CYCL-STORE"))), list($BIND, makeSymbol("TERM")));

    private static final SubLSymbol $REMOVAL_PROBLEM_QUERY_TERMS_ARG1_UNIFY = makeKeyword("REMOVAL-PROBLEM-QUERY-TERMS-ARG1-UNIFY");

    static private final SubLList $list69 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycProblemQueryTerms"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycProblemQueryTerms"), list(reader_make_constant_shell("CycProblemFn"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("FULLY-BOUND")), $COST, makeSymbol("REMOVAL-PROBLEM-QUERY-TERMS-ARG1-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycProblemQueryTerms"), list(reader_make_constant_shell("CycProblemFn"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("CYCL-STORE"))), list($BIND, makeSymbol("TERM"))), list(list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE")), list(makeKeyword("VALUE"), makeSymbol("TERM")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-STORE"), makeSymbol("TERM")), list(list($CALL, makeSymbol("CYCL-PROBLEM-STORE-ENCODE"), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE"))), list(makeKeyword("VALUE"), makeSymbol("TERM")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("STORE"), makeSymbol("TERM")), list($CALL, makeSymbol("REMOVAL-PROBLEM-STORE-PROBLEMS-MENTIONING-TERM"), list(makeKeyword("VALUE"), makeSymbol("STORE")), list(makeKeyword("VALUE"), makeSymbol("TERM")))), makeKeyword("OUTPUT-DECODE-PATTERN"), list($CALL, makeSymbol("CYCL-PROBLEM-DECODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("cycProblemQueryTerms"), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TERM"))) });

    private static final SubLSymbol $REMOVAL_PROBLEM_QUERY_TERMS_ARG2_UNIFY = makeKeyword("REMOVAL-PROBLEM-QUERY-TERMS-ARG2-UNIFY");

    private static final SubLList $list71 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycProblemQueryTerms"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycProblemQueryTerms"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-PROBLEM-QUERY-TERM-COUNT*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycProblemQueryTerms"), list($BIND, makeSymbol("CYCL-PROBLEM")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM"))), makeKeyword("INPUT-ENCODE-PATTERN"), list($CALL, makeSymbol("CYCL-PROBLEM-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-PROBLEM-QUERY-TERMS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("cycProblemQueryTerms"), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM")), makeKeyword("INPUT")) });



    private static final SubLSymbol $REMOVAL_PROBLEM_PROVABILITY_STATUS_CHECK_POS = makeKeyword("REMOVAL-PROBLEM-PROVABILITY-STATUS-CHECK-POS");

    static private final SubLList $list74 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycProblemProvabilityStatus"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycProblemProvabilityStatus"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycProblemProvabilityStatus"), list($BIND, makeSymbol("CYCL-PROBLEM")), list($BIND, makeSymbol("CYCL-STATUS"))), list(list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM")), list(makeKeyword("VALUE"), makeSymbol("CYCL-STATUS")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-PROBLEM"), makeSymbol("CYCL-STATUS")), list(list($CALL, makeSymbol("CYCL-PROBLEM-ENCODE"), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM"))), list($CALL, makeSymbol("CYCL-PROVABILITY-STATUS-ENCODE"), list(makeKeyword("VALUE"), makeSymbol("CYCL-STATUS"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("PROBLEM"), makeSymbol("STATUS")), list($CALL, makeSymbol("REMOVAL-PROBLEM-PROVABILITY-STATUS-CHECK"), list(makeKeyword("VALUE"), makeSymbol("PROBLEM")), list(makeKeyword("VALUE"), makeSymbol("STATUS")))) });

    private static final SubLSymbol $REMOVAL_PROBLEM_PROVABILITY_STATUS_ARG2_UNIFY = makeKeyword("REMOVAL-PROBLEM-PROVABILITY-STATUS-ARG2-UNIFY");

    private static final SubLList $list76 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycProblemProvabilityStatus"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycProblemProvabilityStatus"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycProblemProvabilityStatus"), list($BIND, makeSymbol("CYCL-PROBLEM")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM"))), makeKeyword("INPUT-ENCODE-PATTERN"), list($CALL, makeSymbol("CYCL-PROBLEM-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("REMOVAL-PROBLEM-PROVABILITY-STATUS"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-DECODE-PATTERN"), list($CALL, makeSymbol("CYCL-PROVABILITY-STATUS-DECODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("cycProblemProvabilityStatus"), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM")), makeKeyword("INPUT")) });



    private static final SubLSymbol $REMOVAL_TRANSFORMATION_PROOF_RULE_CHECK_POS = makeKeyword("REMOVAL-TRANSFORMATION-PROOF-RULE-CHECK-POS");

    static private final SubLList $list79 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycTransformationProofRule"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycTransformationProofRule"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TRANSFORMATION-PROOF-RULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycTransformationProofRule"), list($BIND, makeSymbol("CYCL-PROOF")), list($BIND, makeSymbol("CYCL-RULE"))), list(list(makeKeyword("VALUE"), makeSymbol("CYCL-PROOF")), list(makeKeyword("VALUE"), makeSymbol("CYCL-RULE")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-PROOF"), makeSymbol("CYCL-RULE")), list(list($CALL, makeSymbol("CYCL-PROOF-ENCODE"), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROOF"))), list(makeKeyword("VALUE"), makeSymbol("CYCL-RULE")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-PROOF"), makeSymbol("CYCL-RULE")), list($CALL, makeSymbol("REMOVAL-TRANSFORMATION-PROOF-HAS-RULE-P"), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROOF")), list(makeKeyword("VALUE"), makeSymbol("CYCL-RULE")))), makeKeyword("DOCUMENTATION"), makeString("(#$cycTransformationProofRule <fully-bound> <fully-bound>)") });

    private static final SubLSymbol $REMOVAL_TRANSFORMATION_PROOF_RULE_ARG2_UNIFY = makeKeyword("REMOVAL-TRANSFORMATION-PROOF-RULE-ARG2-UNIFY");

    private static final SubLList $list81 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycTransformationProofRule"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycTransformationProofRule"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TRANSFORMATION-PROOF-RULE-LOOKUP-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycTransformationProofRule"), list($BIND, makeSymbol("CYCL-PROOF")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROOF"))), makeKeyword("INPUT-ENCODE-PATTERN"), list($CALL, makeSymbol("CYCL-PROOF-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("REMOVAL-TRANSFORMATION-PROOF-RULE"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("cycTransformationProofRule"), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROOF")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$cycTransformationProofRule <fully-bound> <not-fully-bound>)") });



    private static final SubLSymbol $REMOVAL_TRANSFORMATION_PROOF_BINDINGS_CHECK_POS = makeKeyword("REMOVAL-TRANSFORMATION-PROOF-BINDINGS-CHECK-POS");

    static private final SubLList $list84 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycTransformationProofBindings"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycTransformationProofBindings"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TRANSFORMATION-PROOF-BINDINGS-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycTransformationProofBindings"), list($BIND, makeSymbol("CYCL-PROOF")), list($BIND, makeSymbol("CYCL-BINDING"))), list(list(makeKeyword("VALUE"), makeSymbol("CYCL-PROOF")), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-PROOF"), makeSymbol("CYCL-BINDING")), list(list($CALL, makeSymbol("CYCL-PROOF-ENCODE"), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROOF"))), list($CALL, makeSymbol("CYCL-BINDING-ENCODE"), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-PROOF"), makeSymbol("CYCL-BINDING")), list($CALL, makeSymbol("REMOVAL-TRANSFORMATION-PROOF-HAS-BINDING-P"), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROOF")), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING")))), makeKeyword("DOCUMENTATION"), makeString("(#$cycTransformationProofBindings <fully-bound> <fully-bound>)") });

    private static final SubLSymbol $REMOVAL_TRANSFORMATION_PROOF_BINDINGS_ARG2_UNIFY = makeKeyword("REMOVAL-TRANSFORMATION-PROOF-BINDINGS-ARG2-UNIFY");

    private static final SubLList $list86 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycTransformationProofBindings"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycTransformationProofBindings"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TRANSFORMATION-PROOF-BINDINGS-LOOKUP-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycTransformationProofBindings"), list($BIND, makeSymbol("CYCL-PROOF")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROOF"))), makeKeyword("INPUT-ENCODE-PATTERN"), list($CALL, makeSymbol("CYCL-PROOF-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-TRANSFORMATION-PROOF-BINDINGS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("cycTransformationProofBindings"), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROOF")), list($CALL, makeSymbol("CYCL-BINDING-DECODE"), makeKeyword("INPUT"))), makeKeyword("DOCUMENTATION"), makeString("(#$cycTransformationProofBindings <fully-bound> <not-fully-bound>)") });







    private static final SubLSymbol $REMOVAL_INFERENCE_ANSWER_BINDINGS_CHECK_POS = makeKeyword("REMOVAL-INFERENCE-ANSWER-BINDINGS-CHECK-POS");

    static private final SubLList $list91 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("inferenceAnswerBindings"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("inferenceAnswerBindings"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-INFERENCE-ANSWER-BINDINGS-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("inferenceAnswerBindings"), list($BIND, makeSymbol("CYCL-INFERENCE-ANSWER")), list($BIND, makeSymbol("CYCL-BINDING"))), list(list(makeKeyword("VALUE"), makeSymbol("CYCL-INFERENCE-ANSWER")), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-INFERENCE-ANSWER"), makeSymbol("CYCL-BINDING")), list(list(makeKeyword("VALUE"), makeSymbol("CYCL-INFERENCE-ANSWER")), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-INFERENCE-ANSWER"), makeSymbol("CYCL-BINDING")), list($CALL, makeSymbol("REMOVAL-INFERENCE-ANSWER-HAS-BINDING-P"), list(makeKeyword("VALUE"), makeSymbol("CYCL-INFERENCE-ANSWER")), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING")))), makeKeyword("DOCUMENTATION"), makeString("(#$inferenceAnswerBindings <fully-bound> <fully-bound>)") });

    private static final SubLSymbol $REMOVAL_INFERENCE_ANSWER_BINDINGS_ARG2_UNIFY = makeKeyword("REMOVAL-INFERENCE-ANSWER-BINDINGS-ARG2-UNIFY");

    private static final SubLList $list93 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("inferenceAnswerBindings"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("inferenceAnswerBindings"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-INFERENCE-ANSWER-BINDINGS-LOOKUP-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("inferenceAnswerBindings"), list($BIND, makeSymbol("CYCL-INFERENCE-ANSWER")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-INFERENCE-ANSWER"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("EL-SET-ITEMS"), list($CALL, makeSymbol("REMOVAL-INFERENCE-ANSWER-BINDINGS"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("inferenceAnswerBindings"), list(makeKeyword("VALUE"), makeSymbol("CYCL-INFERENCE-ANSWER")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$inferenceAnswerBindings <fully-bound> <not-fully-bound>)") });



    private static final SubLSymbol $REMOVAL_INFERENCE_BINDING_VAR_CHECK_POS = makeKeyword("REMOVAL-INFERENCE-BINDING-VAR-CHECK-POS");

    static private final SubLList $list96 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("inferenceBindingVar"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("inferenceBindingVar"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-INFERENCE-BINDING-VAR-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("inferenceBindingVar"), list($BIND, makeSymbol("CYCL-BINDING")), list($BIND, makeSymbol("CYCL-VAR"))), list(list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-VAR")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-BINDING"), makeSymbol("CYCL-VAR")), list(list($CALL, makeSymbol("CYCL-BINDING-ENCODE"), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING"))), list(makeKeyword("VALUE"), makeSymbol("CYCL-VAR")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-BINDING"), makeSymbol("CYCL-VAR")), list($CALL, makeSymbol("REMOVAL-INFERENCE-BINDING-HAS-VAR-P"), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-VAR")))), makeKeyword("DOCUMENTATION"), makeString("(#$inferenceBindingVar <fully-bound> <fully-bound>)") });

    private static final SubLSymbol $REMOVAL_INFERENCE_BINDING_VAR_ARG2_UNIFY = makeKeyword("REMOVAL-INFERENCE-BINDING-VAR-ARG2-UNIFY");

    static private final SubLList $list_alt5 = list(reader_make_constant_shell("CycProblemStoreFn"), list($BIND, makeSymbol("STORE-ID")));

    private static final SubLList $list98 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("inferenceBindingVar"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("inferenceBindingVar"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-INFERENCE-BINDING-VAR-LOOKUP-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("inferenceBindingVar"), list($BIND, makeSymbol("CYCL-BINDING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list($CALL, makeSymbol("CYCL-BINDING-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("REMOVAL-INFERENCE-BINDING-VAR"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("inferenceBindingVar"), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$inferenceBindingVar <fully-bound> <not-fully-bound>)") });

    static private final SubLList $list_alt8 = list(reader_make_constant_shell("CycProblemFn"), list($BIND, makeSymbol("PROBLEM-ID")), list(reader_make_constant_shell("CycProblemStoreFn"), list($BIND, makeSymbol("STORE-ID"))));

    static private final SubLList $list_alt11 = list(reader_make_constant_shell("CycProblemLinkFn"), list($BIND, makeSymbol("LINK-ID")), list(reader_make_constant_shell("CycProblemStoreFn"), list($BIND, makeSymbol("STORE-ID"))));

    static private final SubLList $list_alt14 = list(reader_make_constant_shell("CycProofFn"), list($BIND, makeSymbol("PROOF-ID")), list(reader_make_constant_shell("CycProblemStoreFn"), list($BIND, makeSymbol("STORE-ID"))));



    private static final SubLSymbol $REMOVAL_INFERENCE_BINDING_VALUE_CHECK_POS = makeKeyword("REMOVAL-INFERENCE-BINDING-VALUE-CHECK-POS");

    static private final SubLList $list101 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("inferenceBindingValue"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("inferenceBindingValue"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-INFERENCE-BINDING-VALUE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("inferenceBindingValue"), list($BIND, makeSymbol("CYCL-BINDING")), list($BIND, makeSymbol("CYCL-VAR"))), list(list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-VAR")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-BINDING"), makeSymbol("CYCL-VAR")), list(list($CALL, makeSymbol("CYCL-BINDING-ENCODE"), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING"))), list(makeKeyword("VALUE"), makeSymbol("CYCL-VAR")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-BINDING"), makeSymbol("CYCL-VAR")), list($CALL, makeSymbol("REMOVAL-INFERENCE-BINDING-HAS-VALUE-P"), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-VAR")))), makeKeyword("DOCUMENTATION"), makeString("(#$inferenceBindingValue <fully-bound> <fully-bound>)") });

    static private final SubLList $list_alt17 = list(reader_make_constant_shell("CycInferenceFn"), list($BIND, makeSymbol("INFERENCE-ID")), list(reader_make_constant_shell("CycProblemStoreFn"), list($BIND, makeSymbol("STORE-ID"))));

    static private final SubLList $list_alt26 = list(reader_make_constant_shell("ELInferenceBindingFn"), list($BIND, makeSymbol("EL-VAR")), list($BIND, makeSymbol("VALUE")));

    static private final SubLList $list_alt29 = cons(makeSymbol("EL-VAR"), makeSymbol("VALUE"));

    private static final SubLSymbol $REMOVAL_INFERENCE_BINDING_VALUE_ARG2_UNIFY = makeKeyword("REMOVAL-INFERENCE-BINDING-VALUE-ARG2-UNIFY");

    private static final SubLList $list103 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("inferenceBindingValue"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("inferenceBindingValue"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-INFERENCE-BINDING-VALUE-LOOKUP-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("inferenceBindingValue"), list($BIND, makeSymbol("CYCL-BINDING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list($CALL, makeSymbol("CYCL-BINDING-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("REMOVAL-INFERENCE-BINDING-VALUE"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("inferenceBindingValue"), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$inferenceBindingValue <fully-bound> <not-fully-bound>)") });

    static private final SubLList $list_alt33 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycProblemStoreProblemCount"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycProblemStoreProblemCount"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycProblemStoreProblemCount"), list($BIND, makeSymbol("CYCL-STORE")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE"))), makeKeyword("INPUT-ENCODE-PATTERN"), list($CALL, makeSymbol("CYCL-PROBLEM-STORE-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("REMOVAL-PROBLEM-STORE-PROBLEM-COUNT"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("cycProblemStoreProblemCount"), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE")), makeKeyword("INPUT")) });

    private static final SubLList $list104 = list(new SubLObject[]{ reader_make_constant_shell("cycProblemStoreProblemCount"), reader_make_constant_shell("cycProblemStoreLinkCount"), reader_make_constant_shell("cycProblemStoreProofCount"), reader_make_constant_shell("cycProblemStoreInferenceCount"), reader_make_constant_shell("cycProblemStoreTerms"), reader_make_constant_shell("cycProblemStoreProblems"), reader_make_constant_shell("cycProblemQuerySentence"), reader_make_constant_shell("cycProblemQueryTerms"), reader_make_constant_shell("cycProblemProvabilityStatus") });

    static private final SubLList $list_alt36 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycProblemStoreLinkCount"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycProblemStoreLinkCount"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycProblemStoreLinkCount"), list($BIND, makeSymbol("CYCL-STORE")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE"))), makeKeyword("INPUT-ENCODE-PATTERN"), list($CALL, makeSymbol("CYCL-PROBLEM-STORE-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("REMOVAL-PROBLEM-STORE-LINK-COUNT"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("cycProblemStoreLinkCount"), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE")), makeKeyword("INPUT")) });

    // Definitions
    /**
     * Return T iff the problem-query of PROBLEM mentions TERM.
     */
    @LispMethod(comment = "Return T iff the problem-query of PROBLEM mentions TERM.")
    public static final SubLObject problem_query_mentions_termP_alt(SubLObject problem, SubLObject v_term) {
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        {
            SubLObject formula = inference_datastructures_problem.problem_formula(problem);
            return removal_modules_asserted_formula.inference_term_formulas_find(v_term, formula);
        }
    }

    // Definitions
    /**
     * Return T iff the problem-query of PROBLEM mentions TERM.
     */
    @LispMethod(comment = "Return T iff the problem-query of PROBLEM mentions TERM.")
    public static SubLObject problem_query_mentions_termP(final SubLObject problem, final SubLObject v_term) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : "! inference_datastructures_problem.problem_p(problem) " + ("inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) ") + problem;
        final SubLObject formula = inference_datastructures_problem.problem_formula(problem);
        return removal_modules_asserted_formula.inference_term_formulas_find(v_term, formula);
    }

    /**
     * Return the terms mentioned in PROBLEM's query formula.
     */
    @LispMethod(comment = "Return the terms mentioned in PROBLEM\'s query formula.")
    public static final SubLObject problem_query_terms_alt(SubLObject problem) {
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        {
            SubLObject formula = inference_datastructures_problem.problem_formula(problem);
            return removal_modules_asserted_formula.inference_term_formulas_gather(formula);
        }
    }

    /**
     * Return the terms mentioned in PROBLEM's query formula.
     */
    @LispMethod(comment = "Return the terms mentioned in PROBLEM\'s query formula.")
    public static SubLObject problem_query_terms(final SubLObject problem) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : "! inference_datastructures_problem.problem_p(problem) " + ("inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) ") + problem;
        final SubLObject formula = inference_datastructures_problem.problem_formula(problem);
        return removal_modules_asserted_formula.inference_term_formulas_gather(formula);
    }

    public static final SubLObject problem_store_problems_mentioning_term_expected_count_alt(SubLObject store, SubLObject v_term) {
        SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
        return max(ONE_INTEGER, truncate(inference_datastructures_problem_store.problem_store_problem_count(store), $problem_count_for_term_divisor$.getGlobalValue()));
    }

    public static SubLObject problem_store_problems_mentioning_term_expected_count(final SubLObject store, final SubLObject v_term) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) " + ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
        return max(ONE_INTEGER, truncate(inference_datastructures_problem_store.problem_store_problem_count(store), $problem_count_for_term_divisor$.getGlobalValue()));
    }

    static private final SubLList $list_alt39 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycProblemStoreProofCount"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycProblemStoreProofCount"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycProblemStoreProofCount"), list($BIND, makeSymbol("CYCL-STORE")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE"))), makeKeyword("INPUT-ENCODE-PATTERN"), list($CALL, makeSymbol("CYCL-PROBLEM-STORE-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("REMOVAL-PROBLEM-STORE-PROOF-COUNT"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("cycProblemStoreProofCount"), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE")), makeKeyword("INPUT")) });

    public static final SubLObject problem_store_problems_mentioning_term_set_alt(SubLObject store, SubLObject v_term) {
        SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
        {
            SubLObject expected_count = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_inference_reflection.problem_store_problems_mentioning_term_expected_count(store, v_term);
            SubLObject problem_set = set.new_set(symbol_function(EQ), expected_count);
            SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
            if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                {
                    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
                    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
                    SubLObject problem = NIL;
                    while (NIL != id) {
                        problem = do_id_index_state_object(idx, $SKIP, id, state_var);
                        if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
                            if (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_inference_reflection.problem_query_mentions_termP(problem, v_term)) {
                                set.set_add(problem, problem_set);
                            }
                        }
                        id = do_id_index_next_id(idx, NIL, id, state_var);
                        state_var = do_id_index_next_state(idx, NIL, id, state_var);
                    } 
                }
            }
            return problem_set;
        }
    }

    public static SubLObject problem_store_problems_mentioning_term_set(final SubLObject store, final SubLObject v_term) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) " + ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
        final SubLObject expected_count = problem_store_problems_mentioning_term_expected_count(store, v_term);
        final SubLObject problem_set = set.new_set(symbol_function(EQL), expected_count);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$1 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$1, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$1);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    problem = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != problem_query_mentions_termP(problem, v_term)) {
                            set.set_add(problem, problem_set);
                        }
                    }
                }
            }
            final SubLObject idx_$2 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$2)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$2);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        problem2 = getEntryValue(cdohash_entry);
                        if (NIL != problem_query_mentions_termP(problem2, v_term)) {
                            set.set_add(problem2, problem_set);
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return problem_set;
    }

    static private final SubLList $list_alt42 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycProblemStoreInferenceCount"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycProblemStoreInferenceCount"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycProblemStoreInferenceCount"), list($BIND, makeSymbol("CYCL-STORE")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE"))), makeKeyword("INPUT-ENCODE-PATTERN"), list($CALL, makeSymbol("CYCL-PROBLEM-STORE-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("REMOVAL-PROBLEM-STORE-INFERENCE-COUNT"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("cycProblemStoreInferenceCount"), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE")), makeKeyword("INPUT")) });

    static private final SubLList $list_alt45 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycProblemStoreTerms"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycProblemStoreTerms"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycProblemStoreTerms"), list($BIND, makeSymbol("CYCL-STORE")), list($BIND, makeSymbol("TERM"))), list(list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE")), list(makeKeyword("VALUE"), makeSymbol("TERM")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-STORE"), makeSymbol("TERM")), list(list($CALL, makeSymbol("CYCL-PROBLEM-STORE-ENCODE"), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE"))), list(makeKeyword("VALUE"), makeSymbol("TERM")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("STORE"), makeSymbol("TERM")), list($CALL, makeSymbol("REMOVAL-PROBLEM-STORE-TERMS-CHECK"), list(makeKeyword("VALUE"), makeSymbol("STORE")), list(makeKeyword("VALUE"), makeSymbol("TERM")))) });

    public static final SubLObject problem_store_term_expected_count_alt(SubLObject store) {
        SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
        return truncate(multiply($problem_store_term_to_problem_ratio$.getGlobalValue(), inference_datastructures_problem_store.problem_store_problem_count(store)), UNPROVIDED);
    }

    public static SubLObject problem_store_term_expected_count(final SubLObject store) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) " + ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
        return truncate(multiply($problem_store_term_to_problem_ratio$.getGlobalValue(), inference_datastructures_problem_store.problem_store_problem_count(store)), UNPROVIDED);
    }

    public static final SubLObject problem_store_term_set_alt(SubLObject store) {
        SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
        {
            SubLObject expected_count = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_inference_reflection.problem_store_term_expected_count(store);
            SubLObject term_set = set.new_set(symbol_function(EQUAL), expected_count);
            SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
            if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                {
                    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
                    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
                    SubLObject problem = NIL;
                    while (NIL != id) {
                        problem = do_id_index_state_object(idx, $SKIP, id, state_var);
                        if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
                            {
                                SubLObject terms = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_inference_reflection.problem_query_terms(problem);
                                SubLObject cdolist_list_var = terms;
                                SubLObject v_term = NIL;
                                for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                                    set.set_add(v_term, term_set);
                                }
                            }
                        }
                        id = do_id_index_next_id(idx, NIL, id, state_var);
                        state_var = do_id_index_next_state(idx, NIL, id, state_var);
                    } 
                }
            }
            return term_set;
        }
    }

    public static SubLObject problem_store_term_set(final SubLObject store) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) " + ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
        final SubLObject expected_count = problem_store_term_expected_count(store);
        final SubLObject term_set = set.new_set(symbol_function(EQUAL), expected_count);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$3 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$3, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$3);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                SubLObject cdolist_list_var;
                SubLObject terms;
                SubLObject v_term;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    problem = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        terms = cdolist_list_var = problem_query_terms(problem);
                        v_term = NIL;
                        v_term = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            set.set_add(v_term, term_set);
                            cdolist_list_var = cdolist_list_var.rest();
                            v_term = cdolist_list_var.first();
                        } 
                    }
                }
            }
            final SubLObject idx_$4 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$4)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$4);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        problem2 = getEntryValue(cdohash_entry);
                        SubLObject cdolist_list_var2;
                        final SubLObject terms2 = cdolist_list_var2 = problem_query_terms(problem2);
                        SubLObject v_term2 = NIL;
                        v_term2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            set.set_add(v_term2, term_set);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            v_term2 = cdolist_list_var2.first();
                        } 
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return term_set;
    }

    static private final SubLList $list_alt47 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycProblemStoreTerms"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycProblemStoreTerms"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), list(makeSymbol("INVERT-REMOVAL-CHECK-COST"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycProblemStoreTerms"), list($BIND, makeSymbol("CYCL-STORE")), list($BIND, makeSymbol("TERM"))), list(list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE")), list(makeKeyword("VALUE"), makeSymbol("TERM")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-STORE"), makeSymbol("TERM")), list(list($CALL, makeSymbol("CYCL-PROBLEM-STORE-ENCODE"), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE"))), list(makeKeyword("VALUE"), makeSymbol("TERM")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("STORE"), makeSymbol("TERM")), list($CALL, makeSymbol("INVERT-BOOLEAN-ANSWER"), list($CALL, makeSymbol("REMOVAL-PROBLEM-STORE-TERMS-CHECK"), list(makeKeyword("VALUE"), makeSymbol("STORE")), list(makeKeyword("VALUE"), makeSymbol("TERM"))))) });

    static private final SubLList $list_alt49 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycProblemStoreTerms"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycProblemStoreTerms"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), $COST, makeSymbol("REMOVAL-PROBLEM-STORE-TERMS-ARG2-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycProblemStoreTerms"), list($BIND, makeSymbol("CYCL-STORE")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE"))), makeKeyword("INPUT-ENCODE-PATTERN"), list($CALL, makeSymbol("CYCL-PROBLEM-STORE-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-PROBLEM-STORE-TERMS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("cycProblemStoreTerms"), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE")), makeKeyword("INPUT")) });

    public static final SubLObject new_problem_store_problem_iterator_alt(SubLObject store) {
        SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
        {
            SubLObject problems = NIL;
            SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
            if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                {
                    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
                    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
                    SubLObject problem = NIL;
                    while (NIL != id) {
                        problem = do_id_index_state_object(idx, $SKIP, id, state_var);
                        if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
                            problems = cons(problem, problems);
                        }
                        id = do_id_index_next_id(idx, NIL, id, state_var);
                        state_var = do_id_index_next_state(idx, NIL, id, state_var);
                    } 
                }
            }
            problems = Sort.sort(problems, symbol_function($sym3$_), PROBLEM_SUID);
            return iteration.new_list_iterator(problems);
        }
    }

    public static SubLObject new_problem_store_problem_iterator(final SubLObject store) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) " + ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
        SubLObject problems = NIL;
        final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$5 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$5, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$5);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    problem = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        problems = cons(problem, problems);
                    }
                }
            }
            final SubLObject idx_$6 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$6)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$6);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        problem2 = getEntryValue(cdohash_entry);
                        problems = cons(problem2, problems);
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        problems = Sort.sort(problems, symbol_function($sym3$_), PROBLEM_SUID);
        return iteration.new_list_iterator(problems);
    }

    static private final SubLList $list_alt52 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycProblemStoreProblems"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycProblemStoreProblems"), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycProblemStoreProblems"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("CYCL-PROBLEM"))), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM"))), makeKeyword("INPUT-ENCODE-PATTERN"), list($CALL, makeSymbol("CYCL-PROBLEM-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("REMOVAL-PROBLEM-STORE"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-DECODE-PATTERN"), list($CALL, makeSymbol("CYCL-PROBLEM-STORE-DECODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("cycProblemStoreProblems"), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM"))) });

    static private final SubLList $list_alt54 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycProblemStoreProblems"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycProblemStoreProblems"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), $COST, makeSymbol("REMOVAL-PROBLEM-STORE-PROBLEMS-ARG2-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycProblemStoreProblems"), list($BIND, makeSymbol("CYCL-STORE")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE"))), makeKeyword("INPUT-ENCODE-PATTERN"), list($CALL, makeSymbol("CYCL-PROBLEM-STORE-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-PROBLEM-STORE-PROBLEM-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list($CALL, makeSymbol("CYCL-PROBLEM-DECODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("cycProblemStoreProblems"), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE")), makeKeyword("INPUT")) });

    /**
     * Convert a CycL problem store term into its HL equivalent.
     */
    @LispMethod(comment = "Convert a CycL problem store term into its HL equivalent.")
    public static final SubLObject cycl_problem_store_encode_alt(SubLObject cycl_store) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pattern = $list_alt5;
                thread.resetMultipleValues();
                {
                    SubLObject success = formula_pattern_match.formula_matches_pattern(cycl_store, pattern);
                    SubLObject v_bindings = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != success) {
                        {
                            SubLObject store_id = list_utilities.alist_lookup_without_values(v_bindings, STORE_ID, UNPROVIDED, UNPROVIDED);
                            return inference_datastructures_problem_store.find_problem_store_by_id(store_id);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Convert a CycL problem store term into its HL equivalent.
     */
    @LispMethod(comment = "Convert a CycL problem store term into its HL equivalent.")
    public static SubLObject cycl_problem_store_encode(final SubLObject cycl_store) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pattern = $list5;
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(cycl_store, pattern);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            final SubLObject store_id = list_utilities.alist_lookup_without_values(v_bindings, STORE_ID, UNPROVIDED, UNPROVIDED);
            return inference_datastructures_problem_store.find_problem_store_by_id(store_id);
        }
        return NIL;
    }

    /**
     * Convert an HL problem store into its CycL equivalent.
     */
    @LispMethod(comment = "Convert an HL problem store into its CycL equivalent.")
    public static final SubLObject cycl_problem_store_decode_alt(SubLObject store) {
        if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
            {
                SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
                return list_to_elf(list($$CycProblemStoreFn, store_id));
            }
        }
        return NIL;
    }

    /**
     * Convert an HL problem store into its CycL equivalent.
     */
    @LispMethod(comment = "Convert an HL problem store into its CycL equivalent.")
    public static SubLObject cycl_problem_store_decode(final SubLObject store) {
        if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
            final SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
            return list_to_elf(list($$CycProblemStoreFn, store_id));
        }
        return NIL;
    }

    static private final SubLList $list_alt57 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycProblemQuerySentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycProblemQuerySentence"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycProblemQuerySentence"), list($BIND, makeSymbol("CYCL-PROBLEM")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM"))), makeKeyword("INPUT-ENCODE-PATTERN"), list($CALL, makeSymbol("CYCL-PROBLEM-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("REMOVAL-PROBLEM-QUERY"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-DECODE-PATTERN"), list($CALL, makeSymbol("PROBLEM-QUERY-EL-FORMULA"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("cycProblemQuerySentence"), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM")), makeKeyword("INPUT")) });

    /**
     * Convert a CycL problem term into its HL equivalent.
     */
    @LispMethod(comment = "Convert a CycL problem term into its HL equivalent.")
    public static final SubLObject cycl_problem_encode_alt(SubLObject cycl_problem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pattern = $list_alt8;
                thread.resetMultipleValues();
                {
                    SubLObject success = formula_pattern_match.formula_matches_pattern(cycl_problem, pattern);
                    SubLObject v_bindings = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != success) {
                        {
                            SubLObject problem_id = list_utilities.alist_lookup_without_values(v_bindings, PROBLEM_ID, UNPROVIDED, UNPROVIDED);
                            SubLObject store_id = list_utilities.alist_lookup_without_values(v_bindings, STORE_ID, UNPROVIDED, UNPROVIDED);
                            return inference_datastructures_problem_store.find_problem_by_ids(store_id, problem_id);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Convert a CycL problem term into its HL equivalent.
     */
    @LispMethod(comment = "Convert a CycL problem term into its HL equivalent.")
    public static SubLObject cycl_problem_encode(final SubLObject cycl_problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pattern = $list8;
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(cycl_problem, pattern);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            final SubLObject problem_id = list_utilities.alist_lookup_without_values(v_bindings, PROBLEM_ID, UNPROVIDED, UNPROVIDED);
            final SubLObject store_id = list_utilities.alist_lookup_without_values(v_bindings, STORE_ID, UNPROVIDED, UNPROVIDED);
            return inference_datastructures_problem_store.find_problem_by_ids(store_id, problem_id);
        }
        return NIL;
    }

    /**
     * Convert an HL problem into its CycL equivalent.
     */
    @LispMethod(comment = "Convert an HL problem into its CycL equivalent.")
    public static final SubLObject cycl_problem_decode_alt(SubLObject problem) {
        if (NIL != inference_datastructures_problem.valid_problem_p(problem)) {
            {
                SubLObject store = inference_datastructures_problem.problem_store(problem);
                if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
                    {
                        SubLObject problem_id = inference_datastructures_problem.problem_suid(problem);
                        SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
                        return list_to_elf(list($$CycProblemFn, problem_id, list($$CycProblemStoreFn, store_id)));
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Convert an HL problem into its CycL equivalent.
     */
    @LispMethod(comment = "Convert an HL problem into its CycL equivalent.")
    public static SubLObject cycl_problem_decode(final SubLObject problem) {
        if (NIL != inference_datastructures_problem.valid_problem_p(problem)) {
            final SubLObject store = inference_datastructures_problem.problem_store(problem);
            if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
                final SubLObject problem_id = inference_datastructures_problem.problem_suid(problem);
                final SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
                return list_to_elf(list($$CycProblemFn, problem_id, list($$CycProblemStoreFn, store_id)));
            }
        }
        return NIL;
    }

    static private final SubLList $list_alt60 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycProblemQueryTerms"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycProblemQueryTerms"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycProblemQueryTerms"), list($BIND, makeSymbol("CYCL-PROBLEM")), list($BIND, makeSymbol("TERM"))), list(list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM")), list(makeKeyword("VALUE"), makeSymbol("TERM")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-PROBLEM"), makeSymbol("TERM")), list(list($CALL, makeSymbol("CYCL-PROBLEM-ENCODE"), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM"))), list(makeKeyword("VALUE"), makeSymbol("TERM")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("PROBLEM"), makeSymbol("TERM")), list($CALL, makeSymbol("REMOVAL-PROBLEM-QUERY-TERMS-CHECK"), list(makeKeyword("VALUE"), makeSymbol("PROBLEM")), list(makeKeyword("VALUE"), makeSymbol("TERM")))) });

    /**
     * Convert a CycL problem link term into its HL equivalent.
     */
    @LispMethod(comment = "Convert a CycL problem link term into its HL equivalent.")
    public static final SubLObject cycl_problem_link_encode_alt(SubLObject cycl_link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pattern = $list_alt11;
                thread.resetMultipleValues();
                {
                    SubLObject success = formula_pattern_match.formula_matches_pattern(cycl_link, pattern);
                    SubLObject v_bindings = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != success) {
                        {
                            SubLObject link_id = list_utilities.alist_lookup_without_values(v_bindings, LINK_ID, UNPROVIDED, UNPROVIDED);
                            SubLObject store_id = list_utilities.alist_lookup_without_values(v_bindings, STORE_ID, UNPROVIDED, UNPROVIDED);
                            return inference_datastructures_problem_store.find_problem_link_by_ids(store_id, link_id);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Convert a CycL problem link term into its HL equivalent.
     */
    @LispMethod(comment = "Convert a CycL problem link term into its HL equivalent.")
    public static SubLObject cycl_problem_link_encode(final SubLObject cycl_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pattern = $list11;
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(cycl_link, pattern);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            final SubLObject link_id = list_utilities.alist_lookup_without_values(v_bindings, LINK_ID, UNPROVIDED, UNPROVIDED);
            final SubLObject store_id = list_utilities.alist_lookup_without_values(v_bindings, STORE_ID, UNPROVIDED, UNPROVIDED);
            return inference_datastructures_problem_store.find_problem_link_by_ids(store_id, link_id);
        }
        return NIL;
    }

    /**
     * Convert an HL problem link into its CycL equivalent.
     */
    @LispMethod(comment = "Convert an HL problem link into its CycL equivalent.")
    public static final SubLObject cycl_problem_link_decode_alt(SubLObject link) {
        if (NIL != inference_datastructures_problem_link.valid_problem_link_p(link)) {
            {
                SubLObject store = inference_datastructures_problem_link.problem_link_store(link);
                if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
                    {
                        SubLObject link_id = inference_datastructures_problem_link.problem_link_suid(link);
                        SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
                        return list_to_elf(list($$CycProblemLinkFn, link_id, list($$CycProblemStoreFn, store_id)));
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Convert an HL problem link into its CycL equivalent.
     */
    @LispMethod(comment = "Convert an HL problem link into its CycL equivalent.")
    public static SubLObject cycl_problem_link_decode(final SubLObject link) {
        if (NIL != inference_datastructures_problem_link.valid_problem_link_p(link)) {
            final SubLObject store = inference_datastructures_problem_link.problem_link_store(link);
            if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
                final SubLObject link_id = inference_datastructures_problem_link.problem_link_suid(link);
                final SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
                return list_to_elf(list($$CycProblemLinkFn, link_id, list($$CycProblemStoreFn, store_id)));
            }
        }
        return NIL;
    }

    static private final SubLList $list_alt62 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycProblemQueryTerms"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycProblemQueryTerms"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), list(makeSymbol("INVERT-REMOVAL-CHECK-COST"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycProblemQueryTerms"), list($BIND, makeSymbol("CYCL-PROBLEM")), list($BIND, makeSymbol("TERM"))), list(list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM")), list(makeKeyword("VALUE"), makeSymbol("TERM")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-PROBLEM"), makeSymbol("TERM")), list(list($CALL, makeSymbol("CYCL-PROBLEM-ENCODE"), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM"))), list(makeKeyword("VALUE"), makeSymbol("TERM")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("PROBLEM"), makeSymbol("TERM")), list($CALL, makeSymbol("INVERT-BOOLEAN-ANSWER"), list($CALL, makeSymbol("REMOVAL-PROBLEM-QUERY-TERMS-CHECK"), list(makeKeyword("VALUE"), makeSymbol("PROBLEM")), list(makeKeyword("VALUE"), makeSymbol("TERM"))))) });

    /**
     * Convert a CycL proof term into its HL equivalent.
     */
    @LispMethod(comment = "Convert a CycL proof term into its HL equivalent.")
    public static final SubLObject cycl_proof_encode_alt(SubLObject cycl_proof) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pattern = $list_alt14;
                thread.resetMultipleValues();
                {
                    SubLObject success = formula_pattern_match.formula_matches_pattern(cycl_proof, pattern);
                    SubLObject v_bindings = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != success) {
                        {
                            SubLObject proof_id = list_utilities.alist_lookup_without_values(v_bindings, PROOF_ID, UNPROVIDED, UNPROVIDED);
                            SubLObject store_id = list_utilities.alist_lookup_without_values(v_bindings, STORE_ID, UNPROVIDED, UNPROVIDED);
                            return inference_datastructures_problem_store.find_proof_by_ids(store_id, proof_id);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Convert a CycL proof term into its HL equivalent.
     */
    @LispMethod(comment = "Convert a CycL proof term into its HL equivalent.")
    public static SubLObject cycl_proof_encode(final SubLObject cycl_proof) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pattern = $list14;
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(cycl_proof, pattern);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            final SubLObject proof_id = list_utilities.alist_lookup_without_values(v_bindings, PROOF_ID, UNPROVIDED, UNPROVIDED);
            final SubLObject store_id = list_utilities.alist_lookup_without_values(v_bindings, STORE_ID, UNPROVIDED, UNPROVIDED);
            return inference_datastructures_problem_store.find_proof_by_ids(store_id, proof_id);
        }
        return NIL;
    }

    /**
     * Convert an HL proof into its CycL equivalent.
     */
    @LispMethod(comment = "Convert an HL proof into its CycL equivalent.")
    public static final SubLObject cycl_proof_decode_alt(SubLObject proof) {
        if (NIL != inference_datastructures_proof.valid_proof_p(proof)) {
            {
                SubLObject store = inference_datastructures_proof.proof_store(proof);
                if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
                    {
                        SubLObject proof_id = inference_datastructures_proof.proof_suid(proof);
                        SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
                        return list_to_elf(list($$CycProofFn, proof_id, list($$CycProblemStoreFn, store_id)));
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Convert an HL proof into its CycL equivalent.
     */
    @LispMethod(comment = "Convert an HL proof into its CycL equivalent.")
    public static SubLObject cycl_proof_decode(final SubLObject proof) {
        if (NIL != inference_datastructures_proof.valid_proof_p(proof)) {
            final SubLObject store = inference_datastructures_proof.proof_store(proof);
            if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
                final SubLObject proof_id = inference_datastructures_proof.proof_suid(proof);
                final SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
                return list_to_elf(list($$CycProofFn, proof_id, list($$CycProblemStoreFn, store_id)));
            }
        }
        return NIL;
    }

    static private final SubLList $list_alt63 = list(reader_make_constant_shell("cycProblemQueryTerms"), list(reader_make_constant_shell("CycProblemFn"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("CYCL-STORE"))), list($BIND, makeSymbol("TERM")));

    /**
     * Convert a CycL inference term into its HL equivalent.
     */
    @LispMethod(comment = "Convert a CycL inference term into its HL equivalent.")
    public static final SubLObject cycl_inference_encode_alt(SubLObject cycl_inference) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pattern = $list_alt17;
                thread.resetMultipleValues();
                {
                    SubLObject success = formula_pattern_match.formula_matches_pattern(cycl_inference, pattern);
                    SubLObject v_bindings = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != success) {
                        {
                            SubLObject inference_id = list_utilities.alist_lookup_without_values(v_bindings, INFERENCE_ID, UNPROVIDED, UNPROVIDED);
                            SubLObject store_id = list_utilities.alist_lookup_without_values(v_bindings, STORE_ID, UNPROVIDED, UNPROVIDED);
                            return inference_datastructures_problem_store.find_inference_by_ids(store_id, inference_id);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Convert a CycL inference term into its HL equivalent.
     */
    @LispMethod(comment = "Convert a CycL inference term into its HL equivalent.")
    public static SubLObject cycl_inference_encode(final SubLObject cycl_inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pattern = $list17;
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(cycl_inference, pattern);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            final SubLObject inference_id = list_utilities.alist_lookup_without_values(v_bindings, INFERENCE_ID, UNPROVIDED, UNPROVIDED);
            final SubLObject store_id = list_utilities.alist_lookup_without_values(v_bindings, STORE_ID, UNPROVIDED, UNPROVIDED);
            return inference_datastructures_problem_store.find_inference_by_ids(store_id, inference_id);
        }
        return NIL;
    }

    static private final SubLList $list_alt67 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycProblemQueryTerms"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycProblemQueryTerms"), list(reader_make_constant_shell("CycProblemFn"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("FULLY-BOUND")), $COST, makeSymbol("REMOVAL-PROBLEM-QUERY-TERMS-ARG1-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycProblemQueryTerms"), list(reader_make_constant_shell("CycProblemFn"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("CYCL-STORE"))), list($BIND, makeSymbol("TERM"))), list(list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE")), list(makeKeyword("VALUE"), makeSymbol("TERM")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-STORE"), makeSymbol("TERM")), list(list($CALL, makeSymbol("CYCL-PROBLEM-STORE-ENCODE"), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE"))), list(makeKeyword("VALUE"), makeSymbol("TERM")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("STORE"), makeSymbol("TERM")), list($CALL, makeSymbol("REMOVAL-PROBLEM-STORE-PROBLEMS-MENTIONING-TERM"), list(makeKeyword("VALUE"), makeSymbol("STORE")), list(makeKeyword("VALUE"), makeSymbol("TERM")))), makeKeyword("OUTPUT-DECODE-PATTERN"), list($CALL, makeSymbol("CYCL-PROBLEM-DECODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("cycProblemQueryTerms"), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TERM"))) });

    /**
     * Convert an HL inference into its CycL equivalent.
     */
    @LispMethod(comment = "Convert an HL inference into its CycL equivalent.")
    public static final SubLObject cycl_inference_decode_alt(SubLObject inference) {
        if (NIL != inference_datastructures_inference.valid_inference_p(inference)) {
            {
                SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
                if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
                    {
                        SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
                        SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
                        return list_to_elf(list($$CycInferenceFn, inference_id, list($$CycProblemStoreFn, store_id)));
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Convert an HL inference into its CycL equivalent.
     */
    @LispMethod(comment = "Convert an HL inference into its CycL equivalent.")
    public static SubLObject cycl_inference_decode(final SubLObject inference) {
        if (NIL != inference_datastructures_inference.valid_inference_p(inference)) {
            final SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
            if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
                final SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
                final SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
                return list_to_elf(list($$CycInferenceFn, inference_id, list($$CycProblemStoreFn, store_id)));
            }
        }
        return NIL;
    }

    /**
     * Convert a CycL provability status into its HL equivalent.
     */
    @LispMethod(comment = "Convert a CycL provability status into its HL equivalent.")
    public static final SubLObject cycl_provability_status_encode_alt(SubLObject cycl_status) {
        {
            SubLObject pcase_var = cycl_status;
            if (pcase_var.eql($$Good_ProblemProvabilityStatus)) {
                return $GOOD;
            } else {
                if (pcase_var.eql($$Neutral_ProblemProvabilityStatus)) {
                    return $NEUTRAL;
                } else {
                    if (pcase_var.eql($$NoGood_ProblemProvabilityStatus)) {
                        return $NO_GOOD;
                    } else {
                        return NIL;
                    }
                }
            }
        }
    }

    /**
     * Convert a CycL provability status into its HL equivalent.
     */
    @LispMethod(comment = "Convert a CycL provability status into its HL equivalent.")
    public static SubLObject cycl_provability_status_encode(final SubLObject cycl_status) {
        if (cycl_status.eql($$Good_ProblemProvabilityStatus)) {
            return $GOOD;
        }
        if (cycl_status.eql($$Neutral_ProblemProvabilityStatus)) {
            return $NEUTRAL;
        }
        if (cycl_status.eql($$NoGood_ProblemProvabilityStatus)) {
            return $NO_GOOD;
        }
        return NIL;
    }

    /**
     * Convert an HL provability status into its CycL equivalent.
     */
    @LispMethod(comment = "Convert an HL provability status into its CycL equivalent.")
    public static final SubLObject cycl_provability_status_decode_alt(SubLObject status) {
        {
            SubLObject pcase_var = status;
            if (pcase_var.eql($GOOD)) {
                return $$Good_ProblemProvabilityStatus;
            } else {
                if (pcase_var.eql($NEUTRAL)) {
                    return $$Neutral_ProblemProvabilityStatus;
                } else {
                    if (pcase_var.eql($NO_GOOD)) {
                        return $$NoGood_ProblemProvabilityStatus;
                    } else {
                        return NIL;
                    }
                }
            }
        }
    }

    /**
     * Convert an HL provability status into its CycL equivalent.
     */
    @LispMethod(comment = "Convert an HL provability status into its CycL equivalent.")
    public static SubLObject cycl_provability_status_decode(final SubLObject status) {
        if (status.eql($GOOD)) {
            return $$Good_ProblemProvabilityStatus;
        }
        if (status.eql($NEUTRAL)) {
            return $$Neutral_ProblemProvabilityStatus;
        }
        if (status.eql($NO_GOOD)) {
            return $$NoGood_ProblemProvabilityStatus;
        }
        return NIL;
    }

    static private final SubLList $list_alt69 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycProblemQueryTerms"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycProblemQueryTerms"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-PROBLEM-QUERY-TERM-COUNT*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycProblemQueryTerms"), list($BIND, makeSymbol("CYCL-PROBLEM")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM"))), makeKeyword("INPUT-ENCODE-PATTERN"), list($CALL, makeSymbol("CYCL-PROBLEM-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-PROBLEM-QUERY-TERMS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("cycProblemQueryTerms"), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM")), makeKeyword("INPUT")) });

    /**
     * Convert a CycL inference binding into its HL equivalent.
     */
    @LispMethod(comment = "Convert a CycL inference binding into its HL equivalent.")
    public static final SubLObject cycl_binding_encode_alt(SubLObject cycl_binding) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pattern = $list_alt26;
                thread.resetMultipleValues();
                {
                    SubLObject success = formula_pattern_match.formula_matches_pattern(cycl_binding, pattern);
                    SubLObject v_bindings = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != success) {
                        {
                            SubLObject value = list_utilities.alist_lookup_without_values(v_bindings, VALUE, UNPROVIDED, UNPROVIDED);
                            SubLObject el_var = list_utilities.alist_lookup_without_values(v_bindings, EL_VAR, UNPROVIDED, UNPROVIDED);
                            return bindings.make_variable_binding(el_var, value);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Convert a CycL inference binding into its HL equivalent.
     */
    @LispMethod(comment = "Convert a CycL inference binding into its HL equivalent.")
    public static SubLObject cycl_binding_encode(final SubLObject cycl_binding) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pattern = $list26;
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(cycl_binding, pattern);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            final SubLObject value = list_utilities.alist_lookup_without_values(v_bindings, VALUE, UNPROVIDED, UNPROVIDED);
            final SubLObject el_var = list_utilities.alist_lookup_without_values(v_bindings, EL_VAR, UNPROVIDED, UNPROVIDED);
            return bindings.make_variable_binding(el_var, value);
        }
        return NIL;
    }

    /**
     * Convert an HL inference binding into its CycL equivalent.
     */
    @LispMethod(comment = "Convert an HL inference binding into its CycL equivalent.")
    public static final SubLObject cycl_binding_decode_alt(SubLObject binding) {
        {
            SubLObject datum = binding;
            SubLObject current = datum;
            SubLObject el_var = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt29);
            el_var = current.first();
            current = current.rest();
            value = current;
            return make_binary_formula($$ELInferenceBindingFn, el_var, value);
        }
    }

    /**
     * Convert an HL inference binding into its CycL equivalent.
     */
    @LispMethod(comment = "Convert an HL inference binding into its CycL equivalent.")
    public static SubLObject cycl_binding_decode(final SubLObject binding) {
        SubLObject el_var = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(binding, binding, $list29);
        el_var = binding.first();
        final SubLObject current = value = binding.rest();
        return make_binary_formula($$ELInferenceBindingFn, el_var, value);
    }

    public static final SubLObject removal_problem_store_problem_count_alt(SubLObject store) {
        if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
            return inference_datastructures_problem_store.problem_store_problem_count(store);
        }
        return NIL;
    }

    public static SubLObject removal_problem_store_problem_count(final SubLObject store) {
        if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
            return inference_datastructures_problem_store.problem_store_problem_count(store);
        }
        return NIL;
    }

    static private final SubLList $list_alt72 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycProblemProvabilityStatus"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycProblemProvabilityStatus"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycProblemProvabilityStatus"), list($BIND, makeSymbol("CYCL-PROBLEM")), list($BIND, makeSymbol("CYCL-STATUS"))), list(list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM")), list(makeKeyword("VALUE"), makeSymbol("CYCL-STATUS")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-PROBLEM"), makeSymbol("CYCL-STATUS")), list(list($CALL, makeSymbol("CYCL-PROBLEM-ENCODE"), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM"))), list($CALL, makeSymbol("CYCL-PROVABILITY-STATUS-ENCODE"), list(makeKeyword("VALUE"), makeSymbol("CYCL-STATUS"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("PROBLEM"), makeSymbol("STATUS")), list($CALL, makeSymbol("REMOVAL-PROBLEM-PROVABILITY-STATUS-CHECK"), list(makeKeyword("VALUE"), makeSymbol("PROBLEM")), list(makeKeyword("VALUE"), makeSymbol("STATUS")))) });

    public static final SubLObject removal_problem_store_link_count_alt(SubLObject store) {
        if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
            return inference_datastructures_problem_store.problem_store_link_count(store);
        }
        return NIL;
    }

    public static SubLObject removal_problem_store_link_count(final SubLObject store) {
        if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
            return inference_datastructures_problem_store.problem_store_link_count(store);
        }
        return NIL;
    }

    public static final SubLObject removal_problem_store_proof_count_alt(SubLObject store) {
        if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
            return inference_datastructures_problem_store.problem_store_proof_count(store);
        }
        return NIL;
    }

    public static SubLObject removal_problem_store_proof_count(final SubLObject store) {
        if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
            return inference_datastructures_problem_store.problem_store_proof_count(store);
        }
        return NIL;
    }

    public static final SubLObject removal_problem_store_inference_count_alt(SubLObject store) {
        if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
            return inference_datastructures_problem_store.problem_store_inference_count(store);
        }
        return NIL;
    }

    public static SubLObject removal_problem_store_inference_count(final SubLObject store) {
        if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
            return inference_datastructures_problem_store.problem_store_inference_count(store);
        }
        return NIL;
    }

    public static final SubLObject removal_problem_store_terms_check_alt(SubLObject store, SubLObject v_term) {
        if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
            {
                SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
                if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                    {
                        SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
                        SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
                        SubLObject problem = NIL;
                        while (NIL != id) {
                            problem = do_id_index_state_object(idx, $SKIP, id, state_var);
                            if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
                                if (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_inference_reflection.removal_problem_query_terms_check(problem, v_term)) {
                                    return T;
                                }
                            }
                            id = do_id_index_next_id(idx, NIL, id, state_var);
                            state_var = do_id_index_next_state(idx, NIL, id, state_var);
                        } 
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_problem_store_terms_check(final SubLObject store, final SubLObject v_term) {
        if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
            final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
            if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                final SubLObject idx_$7 = idx;
                if (NIL == id_index_dense_objects_empty_p(idx_$7, $SKIP)) {
                    final SubLObject vector_var = id_index_dense_objects(idx_$7);
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject problem;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        problem = aref(vector_var, id);
                        if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            if (NIL != id_index_tombstone_p(problem)) {
                                problem = $SKIP;
                            }
                            if (NIL != removal_problem_query_terms_check(problem, v_term)) {
                                return T;
                            }
                        }
                    }
                }
                final SubLObject idx_$8 = idx;
                if (NIL == id_index_sparse_objects_empty_p(idx_$8)) {
                    final SubLObject cdohash_table = id_index_sparse_objects(idx_$8);
                    SubLObject id2 = NIL;
                    SubLObject problem2 = NIL;
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            id2 = getEntryKey(cdohash_entry);
                            problem2 = getEntryValue(cdohash_entry);
                            if (NIL != removal_problem_query_terms_check(problem2, v_term)) {
                                return T;
                            }
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
        }
        return NIL;
    }

    static private final SubLList $list_alt74 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycProblemProvabilityStatus"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycProblemProvabilityStatus"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycProblemProvabilityStatus"), list($BIND, makeSymbol("CYCL-PROBLEM")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM"))), makeKeyword("INPUT-ENCODE-PATTERN"), list($CALL, makeSymbol("CYCL-PROBLEM-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("REMOVAL-PROBLEM-PROVABILITY-STATUS"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-DECODE-PATTERN"), list($CALL, makeSymbol("CYCL-PROVABILITY-STATUS-DECODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("cycProblemProvabilityStatus"), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM")), makeKeyword("INPUT")) });

    static private final SubLList $list_alt77 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycTransformationProofRule"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycTransformationProofRule"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TRANSFORMATION-PROOF-RULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycTransformationProofRule"), list($BIND, makeSymbol("CYCL-PROOF")), list($BIND, makeSymbol("CYCL-RULE"))), list(list(makeKeyword("VALUE"), makeSymbol("CYCL-PROOF")), list(makeKeyword("VALUE"), makeSymbol("CYCL-RULE")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-PROOF"), makeSymbol("CYCL-RULE")), list(list($CALL, makeSymbol("CYCL-PROOF-ENCODE"), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROOF"))), list(makeKeyword("VALUE"), makeSymbol("CYCL-RULE")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-PROOF"), makeSymbol("CYCL-RULE")), list($CALL, makeSymbol("REMOVAL-TRANSFORMATION-PROOF-HAS-RULE-P"), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROOF")), list(makeKeyword("VALUE"), makeSymbol("CYCL-RULE")))), makeKeyword("DOCUMENTATION"), makeString("(#$cycTransformationProofRule <fully-bound> <fully-bound>)") });

    public static final SubLObject removal_problem_store_terms_arg2_unify_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject store = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_inference_reflection.cycl_problem_store_encode(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED));
            if (NIL != inference_datastructures_problem_store.problem_store_p(store)) {
                return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_inference_reflection.problem_store_term_expected_count(store);
            } else {
                return ZERO_INTEGER;
            }
        }
    }

    public static SubLObject removal_problem_store_terms_arg2_unify_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject store = cycl_problem_store_encode(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED));
        if (NIL != inference_datastructures_problem_store.problem_store_p(store)) {
            return problem_store_term_expected_count(store);
        }
        return ZERO_INTEGER;
    }

    public static final SubLObject removal_problem_store_terms_alt(SubLObject store) {
        if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
            {
                SubLObject term_set = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_inference_reflection.problem_store_term_set(store);
                return set.new_set_iterator(term_set);
            }
        }
        return NIL;
    }

    public static SubLObject removal_problem_store_terms(final SubLObject store) {
        if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
            final SubLObject term_set = problem_store_term_set(store);
            return set.new_set_iterator(term_set);
        }
        return NIL;
    }

    public static final SubLObject removal_problem_store_alt(SubLObject problem) {
        if (NIL != inference_datastructures_problem.valid_problem_p(problem)) {
            return inference_datastructures_problem.problem_store(problem);
        }
        return NIL;
    }

    public static SubLObject removal_problem_store(final SubLObject problem) {
        if (NIL != inference_datastructures_problem.valid_problem_p(problem)) {
            return inference_datastructures_problem.problem_store(problem);
        }
        return NIL;
    }

    public static final SubLObject removal_problem_store_problems_arg2_unify_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject store = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_inference_reflection.cycl_problem_store_encode(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED));
            if (NIL != inference_datastructures_problem_store.problem_store_p(store)) {
                return inference_datastructures_problem_store.problem_store_problem_count(store);
            } else {
                return ZERO_INTEGER;
            }
        }
    }

    public static SubLObject removal_problem_store_problems_arg2_unify_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject store = cycl_problem_store_encode(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED));
        if (NIL != inference_datastructures_problem_store.problem_store_p(store)) {
            return inference_datastructures_problem_store.problem_store_problem_count(store);
        }
        return ZERO_INTEGER;
    }

    static private final SubLList $list_alt79 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycTransformationProofRule"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycTransformationProofRule"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TRANSFORMATION-PROOF-RULE-LOOKUP-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycTransformationProofRule"), list($BIND, makeSymbol("CYCL-PROOF")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROOF"))), makeKeyword("INPUT-ENCODE-PATTERN"), list($CALL, makeSymbol("CYCL-PROOF-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("REMOVAL-TRANSFORMATION-PROOF-RULE"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("cycTransformationProofRule"), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROOF")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$cycTransformationProofRule <fully-bound> <not-fully-bound>)") });

    public static final SubLObject removal_problem_store_problem_iterator_alt(SubLObject store) {
        if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
            return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_inference_reflection.new_problem_store_problem_iterator(store);
        }
        return NIL;
    }

    public static SubLObject removal_problem_store_problem_iterator(final SubLObject store) {
        if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
            return new_problem_store_problem_iterator(store);
        }
        return NIL;
    }

    public static final SubLObject removal_problem_query_alt(SubLObject problem) {
        if (NIL != inference_datastructures_problem.valid_problem_p(problem)) {
            return inference_datastructures_problem.problem_query(problem);
        }
        return NIL;
    }

    public static SubLObject removal_problem_query(final SubLObject problem) {
        if (NIL != inference_datastructures_problem.valid_problem_p(problem)) {
            return inference_datastructures_problem.problem_query(problem);
        }
        return NIL;
    }

    public static final SubLObject removal_problem_query_terms_check_alt(SubLObject problem, SubLObject v_term) {
        if (NIL != inference_datastructures_problem.valid_problem_p(problem)) {
            return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_inference_reflection.problem_query_mentions_termP(problem, v_term);
        }
        return NIL;
    }

    public static SubLObject removal_problem_query_terms_check(final SubLObject problem, final SubLObject v_term) {
        if (NIL != inference_datastructures_problem.valid_problem_p(problem)) {
            return problem_query_mentions_termP(problem, v_term);
        }
        return NIL;
    }

    public static final SubLObject removal_problem_query_terms_arg1_unify_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pattern = $list_alt63;
                thread.resetMultipleValues();
                {
                    SubLObject success = formula_pattern_match.formula_matches_pattern(asent, pattern);
                    SubLObject v_bindings = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != success) {
                        {
                            SubLObject v_term = list_utilities.alist_lookup_without_values(v_bindings, TERM, UNPROVIDED, UNPROVIDED);
                            SubLObject cycl_store = list_utilities.alist_lookup_without_values(v_bindings, CYCL_STORE, UNPROVIDED, UNPROVIDED);
                            SubLObject store = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_inference_reflection.cycl_problem_store_encode(cycl_store);
                            if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
                                return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_inference_reflection.problem_store_problems_mentioning_term_expected_count(store, v_term);
                            } else {
                                return ZERO_INTEGER;
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_problem_query_terms_arg1_unify_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pattern = $list65;
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(asent, pattern);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == success) {
            return NIL;
        }
        final SubLObject v_term = list_utilities.alist_lookup_without_values(v_bindings, TERM, UNPROVIDED, UNPROVIDED);
        final SubLObject cycl_store = list_utilities.alist_lookup_without_values(v_bindings, CYCL_STORE, UNPROVIDED, UNPROVIDED);
        final SubLObject store = cycl_problem_store_encode(cycl_store);
        if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
            return problem_store_problems_mentioning_term_expected_count(store, v_term);
        }
        return ZERO_INTEGER;
    }

    static private final SubLList $list_alt82 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycTransformationProofBindings"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycTransformationProofBindings"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TRANSFORMATION-PROOF-BINDINGS-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycTransformationProofBindings"), list($BIND, makeSymbol("CYCL-PROOF")), list($BIND, makeSymbol("CYCL-BINDING"))), list(list(makeKeyword("VALUE"), makeSymbol("CYCL-PROOF")), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-PROOF"), makeSymbol("CYCL-BINDING")), list(list($CALL, makeSymbol("CYCL-PROOF-ENCODE"), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROOF"))), list($CALL, makeSymbol("CYCL-BINDING-ENCODE"), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-PROOF"), makeSymbol("CYCL-BINDING")), list($CALL, makeSymbol("REMOVAL-TRANSFORMATION-PROOF-HAS-BINDING-P"), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROOF")), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING")))), makeKeyword("DOCUMENTATION"), makeString("(#$cycTransformationProofBindings <fully-bound> <fully-bound>)") });

    public static final SubLObject removal_problem_store_problems_mentioning_term_alt(SubLObject store, SubLObject v_term) {
        if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
            {
                SubLObject problem_set = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_inference_reflection.problem_store_problems_mentioning_term_set(store, v_term);
                return set.new_set_iterator(problem_set);
            }
        }
        return NIL;
    }

    public static SubLObject removal_problem_store_problems_mentioning_term(final SubLObject store, final SubLObject v_term) {
        if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
            final SubLObject problem_set = problem_store_problems_mentioning_term_set(store, v_term);
            return set.new_set_iterator(problem_set);
        }
        return NIL;
    }

    public static final SubLObject removal_problem_query_terms_alt(SubLObject problem) {
        if (NIL != inference_datastructures_problem.valid_problem_p(problem)) {
            return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_inference_reflection.problem_query_terms(problem);
        }
        return NIL;
    }

    public static SubLObject removal_problem_query_terms(final SubLObject problem) {
        if (NIL != inference_datastructures_problem.valid_problem_p(problem)) {
            return problem_query_terms(problem);
        }
        return NIL;
    }

    public static final SubLObject removal_problem_provability_status_check_alt(SubLObject problem, SubLObject status) {
        if (NIL != inference_datastructures_problem.valid_problem_p(problem)) {
            return eq(status, inference_datastructures_problem.problem_tactical_provability_status(problem));
        }
        return NIL;
    }

    public static SubLObject removal_problem_provability_status_check(final SubLObject problem, final SubLObject status) {
        if (NIL != inference_datastructures_problem.valid_problem_p(problem)) {
            return eql(status, inference_datastructures_problem.problem_tactical_provability_status(problem));
        }
        return NIL;
    }

    public static final SubLObject removal_problem_provability_status_alt(SubLObject problem) {
        if (NIL != inference_datastructures_problem.valid_problem_p(problem)) {
            return inference_datastructures_problem.problem_tactical_provability_status(problem);
        }
        return NIL;
    }

    public static SubLObject removal_problem_provability_status(final SubLObject problem) {
        if (NIL != inference_datastructures_problem.valid_problem_p(problem)) {
            return inference_datastructures_problem.problem_tactical_provability_status(problem);
        }
        return NIL;
    }

    public static final SubLObject removal_transformation_proof_rule_alt(SubLObject proof) {
        if ((NIL != inference_datastructures_proof.valid_proof_p(proof)) && (NIL != inference_worker_transformation.transformation_proof_p(proof))) {
            return inference_worker_transformation.transformation_proof_rule_assertion(proof);
        }
        return NIL;
    }

    public static SubLObject removal_transformation_proof_rule(final SubLObject proof) {
        if ((NIL != inference_datastructures_proof.valid_proof_p(proof)) && (NIL != inference_worker_transformation.transformation_proof_p(proof))) {
            return inference_worker_transformation.transformation_proof_rule_assertion(proof);
        }
        return NIL;
    }

    static private final SubLList $list_alt84 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("cycTransformationProofBindings"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("cycTransformationProofBindings"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TRANSFORMATION-PROOF-BINDINGS-LOOKUP-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("cycTransformationProofBindings"), list($BIND, makeSymbol("CYCL-PROOF")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROOF"))), makeKeyword("INPUT-ENCODE-PATTERN"), list($CALL, makeSymbol("CYCL-PROOF-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-TRANSFORMATION-PROOF-BINDINGS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("cycTransformationProofBindings"), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROOF")), list($CALL, makeSymbol("CYCL-BINDING-DECODE"), makeKeyword("INPUT"))), makeKeyword("DOCUMENTATION"), makeString("(#$cycTransformationProofBindings <fully-bound> <not-fully-bound>)") });

    public static final SubLObject removal_transformation_proof_has_rule_p_alt(SubLObject proof, SubLObject rule) {
        return eq(rule, com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_inference_reflection.removal_transformation_proof_rule(proof));
    }

    public static SubLObject removal_transformation_proof_has_rule_p(final SubLObject proof, final SubLObject rule) {
        return eql(rule, removal_transformation_proof_rule(proof));
    }

    public static final SubLObject removal_transformation_proof_bindings_alt(SubLObject proof) {
        if ((NIL != inference_datastructures_proof.valid_proof_p(proof)) && (NIL != inference_worker_transformation.transformation_proof_p(proof))) {
            return inference_worker_transformation.transformation_proof_el_bindings(proof);
        }
        return NIL;
    }

    public static SubLObject removal_transformation_proof_bindings(final SubLObject proof) {
        if ((NIL != inference_datastructures_proof.valid_proof_p(proof)) && (NIL != inference_worker_transformation.transformation_proof_p(proof))) {
            return inference_worker_transformation.transformation_proof_el_bindings(proof);
        }
        return NIL;
    }

    public static final SubLObject removal_transformation_proof_has_binding_p_alt(SubLObject proof, SubLObject binding) {
        return subl_promotions.memberP(binding, com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_inference_reflection.removal_transformation_proof_bindings(proof), symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject removal_transformation_proof_has_binding_p(final SubLObject proof, final SubLObject binding) {
        return subl_promotions.memberP(binding, removal_transformation_proof_bindings(proof), symbol_function(EQUAL), UNPROVIDED);
    }

    public static final SubLObject removal_inference_answer_bindings_alt(SubLObject cycl_inference_answer) {
        if (NIL != el_formula_with_operator_p(cycl_inference_answer, $$CycInferenceAnswerFn)) {
            return cycl_utilities.nat_arg1(cycl_inference_answer, UNPROVIDED);
        } else {
            return $$TheEmptySet;
        }
    }

    public static SubLObject removal_inference_answer_bindings(final SubLObject cycl_inference_answer) {
        if (NIL != el_formula_with_operator_p(cycl_inference_answer, $$CycInferenceAnswerFn)) {
            return cycl_utilities.nat_arg1(cycl_inference_answer, UNPROVIDED);
        }
        return $$TheEmptySet;
    }

    public static final SubLObject removal_inference_answer_has_binding_p_alt(SubLObject v_answer, SubLObject binding) {
        return member(binding, el_set_items(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_inference_reflection.removal_inference_answer_bindings(v_answer)), symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject removal_inference_answer_has_binding_p(final SubLObject v_answer, final SubLObject binding) {
        return member(binding, el_set_items(removal_inference_answer_bindings(v_answer)), symbol_function(EQUAL), UNPROVIDED);
    }

    public static final SubLObject removal_inference_binding_var_alt(SubLObject binding) {
        if (NIL != bindings.binding_p(binding)) {
            return bindings.variable_binding_variable(binding);
        }
        return NIL;
    }

    public static SubLObject removal_inference_binding_var(final SubLObject binding) {
        if (NIL != bindings.binding_p(binding)) {
            return bindings.variable_binding_variable(binding);
        }
        return NIL;
    }

    public static final SubLObject removal_inference_binding_has_var_p_alt(SubLObject binding, SubLObject var) {
        return eq(var, com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_inference_reflection.removal_inference_binding_var(binding));
    }

    public static SubLObject removal_inference_binding_has_var_p(final SubLObject binding, final SubLObject var) {
        return eql(var, removal_inference_binding_var(binding));
    }

    static private final SubLList $list_alt89 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("inferenceAnswerBindings"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("inferenceAnswerBindings"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-INFERENCE-ANSWER-BINDINGS-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("inferenceAnswerBindings"), list($BIND, makeSymbol("CYCL-INFERENCE-ANSWER")), list($BIND, makeSymbol("CYCL-BINDING"))), list(list(makeKeyword("VALUE"), makeSymbol("CYCL-INFERENCE-ANSWER")), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-INFERENCE-ANSWER"), makeSymbol("CYCL-BINDING")), list(list(makeKeyword("VALUE"), makeSymbol("CYCL-INFERENCE-ANSWER")), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-INFERENCE-ANSWER"), makeSymbol("CYCL-BINDING")), list($CALL, makeSymbol("REMOVAL-INFERENCE-ANSWER-HAS-BINDING-P"), list(makeKeyword("VALUE"), makeSymbol("CYCL-INFERENCE-ANSWER")), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING")))), makeKeyword("DOCUMENTATION"), makeString("(#$inferenceAnswerBindings <fully-bound> <fully-bound>)") });

    public static final SubLObject removal_inference_binding_value_alt(SubLObject binding) {
        if (NIL != bindings.binding_p(binding)) {
            return bindings.variable_binding_value(binding);
        }
        return NIL;
    }

    public static SubLObject removal_inference_binding_value(final SubLObject binding) {
        if (NIL != bindings.binding_p(binding)) {
            return bindings.variable_binding_value(binding);
        }
        return NIL;
    }

    public static final SubLObject removal_inference_binding_has_value_p_alt(SubLObject binding, SubLObject value) {
        return equal(value, com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_inference_reflection.removal_inference_binding_value(binding));
    }

    public static SubLObject removal_inference_binding_has_value_p(final SubLObject binding, final SubLObject value) {
        return equal(value, removal_inference_binding_value(binding));
    }

    public static SubLObject declare_removal_modules_inference_reflection_file() {
        declareFunction("problem_query_mentions_termP", "PROBLEM-QUERY-MENTIONS-TERM?", 2, 0, false);
        declareFunction("problem_query_terms", "PROBLEM-QUERY-TERMS", 1, 0, false);
        declareFunction("problem_store_problems_mentioning_term_expected_count", "PROBLEM-STORE-PROBLEMS-MENTIONING-TERM-EXPECTED-COUNT", 2, 0, false);
        declareFunction("problem_store_problems_mentioning_term_set", "PROBLEM-STORE-PROBLEMS-MENTIONING-TERM-SET", 2, 0, false);
        declareFunction("problem_store_term_expected_count", "PROBLEM-STORE-TERM-EXPECTED-COUNT", 1, 0, false);
        declareFunction("problem_store_term_set", "PROBLEM-STORE-TERM-SET", 1, 0, false);
        declareFunction("new_problem_store_problem_iterator", "NEW-PROBLEM-STORE-PROBLEM-ITERATOR", 1, 0, false);
        declareFunction("cycl_problem_store_encode", "CYCL-PROBLEM-STORE-ENCODE", 1, 0, false);
        declareFunction("cycl_problem_store_decode", "CYCL-PROBLEM-STORE-DECODE", 1, 0, false);
        declareFunction("cycl_problem_encode", "CYCL-PROBLEM-ENCODE", 1, 0, false);
        declareFunction("cycl_problem_decode", "CYCL-PROBLEM-DECODE", 1, 0, false);
        declareFunction("cycl_problem_link_encode", "CYCL-PROBLEM-LINK-ENCODE", 1, 0, false);
        declareFunction("cycl_problem_link_decode", "CYCL-PROBLEM-LINK-DECODE", 1, 0, false);
        declareFunction("cycl_proof_encode", "CYCL-PROOF-ENCODE", 1, 0, false);
        declareFunction("cycl_proof_decode", "CYCL-PROOF-DECODE", 1, 0, false);
        declareFunction("cycl_inference_encode", "CYCL-INFERENCE-ENCODE", 1, 0, false);
        declareFunction("cycl_inference_decode", "CYCL-INFERENCE-DECODE", 1, 0, false);
        declareFunction("cycl_provability_status_encode", "CYCL-PROVABILITY-STATUS-ENCODE", 1, 0, false);
        declareFunction("cycl_provability_status_decode", "CYCL-PROVABILITY-STATUS-DECODE", 1, 0, false);
        declareFunction("cycl_binding_encode", "CYCL-BINDING-ENCODE", 1, 0, false);
        declareFunction("cycl_binding_decode", "CYCL-BINDING-DECODE", 1, 0, false);
        declareFunction("removal_problem_store_problem_count", "REMOVAL-PROBLEM-STORE-PROBLEM-COUNT", 1, 0, false);
        declareFunction("removal_problem_store_link_count", "REMOVAL-PROBLEM-STORE-LINK-COUNT", 1, 0, false);
        declareFunction("removal_problem_store_proof_count", "REMOVAL-PROBLEM-STORE-PROOF-COUNT", 1, 0, false);
        declareFunction("removal_problem_store_inference_count", "REMOVAL-PROBLEM-STORE-INFERENCE-COUNT", 1, 0, false);
        declareFunction("removal_problem_store_terms_check", "REMOVAL-PROBLEM-STORE-TERMS-CHECK", 2, 0, false);
        declareFunction("removal_problem_store_terms_arg2_unify_cost", "REMOVAL-PROBLEM-STORE-TERMS-ARG2-UNIFY-COST", 1, 1, false);
        declareFunction("removal_problem_store_terms", "REMOVAL-PROBLEM-STORE-TERMS", 1, 0, false);
        declareFunction("removal_problem_store", "REMOVAL-PROBLEM-STORE", 1, 0, false);
        declareFunction("removal_problem_store_problems_arg2_unify_cost", "REMOVAL-PROBLEM-STORE-PROBLEMS-ARG2-UNIFY-COST", 1, 1, false);
        declareFunction("removal_problem_store_problem_iterator", "REMOVAL-PROBLEM-STORE-PROBLEM-ITERATOR", 1, 0, false);
        declareFunction("removal_problem_query", "REMOVAL-PROBLEM-QUERY", 1, 0, false);
        declareFunction("removal_problem_query_terms_check", "REMOVAL-PROBLEM-QUERY-TERMS-CHECK", 2, 0, false);
        declareFunction("removal_problem_query_terms_arg1_unify_cost", "REMOVAL-PROBLEM-QUERY-TERMS-ARG1-UNIFY-COST", 1, 1, false);
        declareFunction("removal_problem_store_problems_mentioning_term", "REMOVAL-PROBLEM-STORE-PROBLEMS-MENTIONING-TERM", 2, 0, false);
        declareFunction("removal_problem_query_terms", "REMOVAL-PROBLEM-QUERY-TERMS", 1, 0, false);
        declareFunction("removal_problem_provability_status_check", "REMOVAL-PROBLEM-PROVABILITY-STATUS-CHECK", 2, 0, false);
        declareFunction("removal_problem_provability_status", "REMOVAL-PROBLEM-PROVABILITY-STATUS", 1, 0, false);
        declareFunction("removal_transformation_proof_rule", "REMOVAL-TRANSFORMATION-PROOF-RULE", 1, 0, false);
        declareFunction("removal_transformation_proof_has_rule_p", "REMOVAL-TRANSFORMATION-PROOF-HAS-RULE-P", 2, 0, false);
        declareFunction("removal_transformation_proof_bindings", "REMOVAL-TRANSFORMATION-PROOF-BINDINGS", 1, 0, false);
        declareFunction("removal_transformation_proof_has_binding_p", "REMOVAL-TRANSFORMATION-PROOF-HAS-BINDING-P", 2, 0, false);
        declareFunction("removal_inference_answer_bindings", "REMOVAL-INFERENCE-ANSWER-BINDINGS", 1, 0, false);
        declareFunction("removal_inference_answer_has_binding_p", "REMOVAL-INFERENCE-ANSWER-HAS-BINDING-P", 2, 0, false);
        declareFunction("removal_inference_binding_var", "REMOVAL-INFERENCE-BINDING-VAR", 1, 0, false);
        declareFunction("removal_inference_binding_has_var_p", "REMOVAL-INFERENCE-BINDING-HAS-VAR-P", 2, 0, false);
        declareFunction("removal_inference_binding_value", "REMOVAL-INFERENCE-BINDING-VALUE", 1, 0, false);
        declareFunction("removal_inference_binding_has_value_p", "REMOVAL-INFERENCE-BINDING-HAS-VALUE-P", 2, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt91 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("inferenceAnswerBindings"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("inferenceAnswerBindings"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-INFERENCE-ANSWER-BINDINGS-LOOKUP-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("inferenceAnswerBindings"), list($BIND, makeSymbol("CYCL-INFERENCE-ANSWER")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-INFERENCE-ANSWER"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("EL-SET-ITEMS"), list($CALL, makeSymbol("REMOVAL-INFERENCE-ANSWER-BINDINGS"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("inferenceAnswerBindings"), list(makeKeyword("VALUE"), makeSymbol("CYCL-INFERENCE-ANSWER")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$inferenceAnswerBindings <fully-bound> <not-fully-bound>)") });

    static private final SubLList $list_alt94 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("inferenceBindingVar"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("inferenceBindingVar"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-INFERENCE-BINDING-VAR-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("inferenceBindingVar"), list($BIND, makeSymbol("CYCL-BINDING")), list($BIND, makeSymbol("CYCL-VAR"))), list(list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-VAR")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-BINDING"), makeSymbol("CYCL-VAR")), list(list($CALL, makeSymbol("CYCL-BINDING-ENCODE"), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING"))), list(makeKeyword("VALUE"), makeSymbol("CYCL-VAR")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-BINDING"), makeSymbol("CYCL-VAR")), list($CALL, makeSymbol("REMOVAL-INFERENCE-BINDING-HAS-VAR-P"), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-VAR")))), makeKeyword("DOCUMENTATION"), makeString("(#$inferenceBindingVar <fully-bound> <fully-bound>)") });

    static private final SubLList $list_alt96 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("inferenceBindingVar"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("inferenceBindingVar"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-INFERENCE-BINDING-VAR-LOOKUP-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("inferenceBindingVar"), list($BIND, makeSymbol("CYCL-BINDING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list($CALL, makeSymbol("CYCL-BINDING-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("REMOVAL-INFERENCE-BINDING-VAR"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("inferenceBindingVar"), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$inferenceBindingVar <fully-bound> <not-fully-bound>)") });

    public static final SubLObject init_removal_modules_inference_reflection_file_alt() {
        deflexical("*PROBLEM-COUNT-FOR-TERM-DIVISOR*", TEN_INTEGER);
        deflexical("*PROBLEM-STORE-TERM-TO-PROBLEM-RATIO*", TWO_INTEGER);
        deflexical("*AVERAGE-PROBLEM-QUERY-TERM-COUNT*", FIVE_INTEGER);
        defconstant("*DEFAULT-TRANSFORMATION-PROOF-RULE-CHECK-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        defconstant("*DEFAULT-TRANSFORMATION-PROOF-RULE-LOOKUP-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        defconstant("*DEFAULT-TRANSFORMATION-PROOF-BINDINGS-CHECK-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        defconstant("*DEFAULT-TRANSFORMATION-PROOF-BINDINGS-LOOKUP-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        defconstant("*DEFAULT-INFERENCE-ANSWER-BINDINGS-CHECK-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        defconstant("*DEFAULT-INFERENCE-ANSWER-BINDINGS-LOOKUP-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        defconstant("*DEFAULT-INFERENCE-BINDING-VAR-CHECK-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        defconstant("*DEFAULT-INFERENCE-BINDING-VAR-LOOKUP-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        defconstant("*DEFAULT-INFERENCE-BINDING-VALUE-CHECK-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        defconstant("*DEFAULT-INFERENCE-BINDING-VALUE-LOOKUP-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        deflexical("*SUPPORTED-INFERENCE-REFLECTION-PREDICATES*", $list_alt102);
        return NIL;
    }

    public static SubLObject init_removal_modules_inference_reflection_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*PROBLEM-COUNT-FOR-TERM-DIVISOR*", TEN_INTEGER);
            deflexical("*PROBLEM-STORE-TERM-TO-PROBLEM-RATIO*", TWO_INTEGER);
            deflexical("*AVERAGE-PROBLEM-QUERY-TERM-COUNT*", FIVE_INTEGER);
            defconstant("*DEFAULT-TRANSFORMATION-PROOF-RULE-CHECK-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
            defconstant("*DEFAULT-TRANSFORMATION-PROOF-RULE-LOOKUP-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
            defconstant("*DEFAULT-TRANSFORMATION-PROOF-BINDINGS-CHECK-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
            defconstant("*DEFAULT-TRANSFORMATION-PROOF-BINDINGS-LOOKUP-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
            defconstant("*DEFAULT-INFERENCE-ANSWER-BINDINGS-CHECK-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
            defconstant("*DEFAULT-INFERENCE-ANSWER-BINDINGS-LOOKUP-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
            defconstant("*DEFAULT-INFERENCE-BINDING-VAR-CHECK-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
            defconstant("*DEFAULT-INFERENCE-BINDING-VAR-LOOKUP-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
            defconstant("*DEFAULT-INFERENCE-BINDING-VALUE-CHECK-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
            defconstant("*DEFAULT-INFERENCE-BINDING-VALUE-LOOKUP-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
            deflexical("*SUPPORTED-INFERENCE-REFLECTION-PREDICATES*", $list104);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*SUPPORTED-INFERENCE-REFLECTION-PREDICATES*", $list_alt102);
        }
        return NIL;
    }

    public static SubLObject init_removal_modules_inference_reflection_file_Previous() {
        deflexical("*PROBLEM-COUNT-FOR-TERM-DIVISOR*", TEN_INTEGER);
        deflexical("*PROBLEM-STORE-TERM-TO-PROBLEM-RATIO*", TWO_INTEGER);
        deflexical("*AVERAGE-PROBLEM-QUERY-TERM-COUNT*", FIVE_INTEGER);
        defconstant("*DEFAULT-TRANSFORMATION-PROOF-RULE-CHECK-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        defconstant("*DEFAULT-TRANSFORMATION-PROOF-RULE-LOOKUP-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        defconstant("*DEFAULT-TRANSFORMATION-PROOF-BINDINGS-CHECK-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        defconstant("*DEFAULT-TRANSFORMATION-PROOF-BINDINGS-LOOKUP-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        defconstant("*DEFAULT-INFERENCE-ANSWER-BINDINGS-CHECK-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        defconstant("*DEFAULT-INFERENCE-ANSWER-BINDINGS-LOOKUP-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        defconstant("*DEFAULT-INFERENCE-BINDING-VAR-CHECK-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        defconstant("*DEFAULT-INFERENCE-BINDING-VAR-LOOKUP-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        defconstant("*DEFAULT-INFERENCE-BINDING-VALUE-CHECK-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        defconstant("*DEFAULT-INFERENCE-BINDING-VALUE-LOOKUP-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        deflexical("*SUPPORTED-INFERENCE-REFLECTION-PREDICATES*", $list104);
        return NIL;
    }

    static private final SubLList $list_alt99 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("inferenceBindingValue"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("inferenceBindingValue"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-INFERENCE-BINDING-VALUE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("inferenceBindingValue"), list($BIND, makeSymbol("CYCL-BINDING")), list($BIND, makeSymbol("CYCL-VAR"))), list(list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-VAR")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-BINDING"), makeSymbol("CYCL-VAR")), list(list($CALL, makeSymbol("CYCL-BINDING-ENCODE"), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING"))), list(makeKeyword("VALUE"), makeSymbol("CYCL-VAR")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-BINDING"), makeSymbol("CYCL-VAR")), list($CALL, makeSymbol("REMOVAL-INFERENCE-BINDING-HAS-VAR-P"), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-VAR")))), makeKeyword("DOCUMENTATION"), makeString("(#$inferenceBindingValue <fully-bound> <fully-bound>)") });

    public static final SubLObject setup_removal_modules_inference_reflection_file_alt() {
        inference_modules.register_solely_specific_removal_module_predicate($$cycProblemStoreProblemCount);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_PROBLEM_COUNT_LOOKUP, $list_alt33);
        inference_modules.register_solely_specific_removal_module_predicate($$cycProblemStoreLinkCount);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_LINK_COUNT_LOOKUP, $list_alt36);
        inference_modules.register_solely_specific_removal_module_predicate($$cycProblemStoreProofCount);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_PROOF_COUNT_LOOKUP, $list_alt39);
        inference_modules.register_solely_specific_removal_module_predicate($$cycProblemStoreInferenceCount);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_INFERENCE_COUNT_LOOKUP, $list_alt42);
        inference_modules.register_solely_specific_removal_module_predicate($$cycProblemStoreTerms);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_TERMS_CHECK_POS, $list_alt45);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_TERMS_CHECK_NEG, $list_alt47);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_TERMS_ARG2_UNIFY, $list_alt49);
        inference_modules.register_solely_specific_removal_module_predicate($$cycProblemStoreProblems);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_PROBLEMS_ARG1_UNIFY, $list_alt52);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_PROBLEMS_ARG2_UNIFY, $list_alt54);
        inference_modules.register_solely_specific_removal_module_predicate($$cycProblemQuerySentence);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_QUERY_SENTENCE_ARG2_UNIFY, $list_alt57);
        inference_modules.register_solely_specific_removal_module_predicate($$cycProblemQueryTerms);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_QUERY_TERMS_CHECK_POS, $list_alt60);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_QUERY_TERMS_CHECK_NEG, $list_alt62);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_QUERY_TERMS_ARG1_UNIFY, $list_alt67);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_QUERY_TERMS_ARG2_UNIFY, $list_alt69);
        inference_modules.register_solely_specific_removal_module_predicate($$cycProblemProvabilityStatus);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_PROVABILITY_STATUS_CHECK_POS, $list_alt72);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_PROVABILITY_STATUS_ARG2_UNIFY, $list_alt74);
        inference_modules.register_solely_specific_removal_module_predicate($$cycTransformationProofRule);
        inference_modules.inference_removal_module($REMOVAL_TRANSFORMATION_PROOF_RULE_CHECK_POS, $list_alt77);
        inference_modules.inference_removal_module($REMOVAL_TRANSFORMATION_PROOF_RULE_ARG2_UNIFY, $list_alt79);
        inference_modules.register_solely_specific_removal_module_predicate($$cycTransformationProofBindings);
        inference_modules.inference_removal_module($REMOVAL_TRANSFORMATION_PROOF_BINDINGS_CHECK_POS, $list_alt82);
        inference_modules.inference_removal_module($REMOVAL_TRANSFORMATION_PROOF_BINDINGS_ARG2_UNIFY, $list_alt84);
        inference_modules.register_solely_specific_removal_module_predicate($$inferenceAnswerBindings);
        inference_modules.inference_removal_module($REMOVAL_INFERENCE_ANSWER_BINDINGS_CHECK_POS, $list_alt89);
        inference_modules.inference_removal_module($REMOVAL_INFERENCE_ANSWER_BINDINGS_ARG2_UNIFY, $list_alt91);
        inference_modules.register_solely_specific_removal_module_predicate($$inferenceBindingVar);
        inference_modules.inference_removal_module($REMOVAL_INFERENCE_BINDING_VAR_CHECK_POS, $list_alt94);
        inference_modules.inference_removal_module($REMOVAL_INFERENCE_BINDING_VAR_ARG2_UNIFY, $list_alt96);
        inference_modules.register_solely_specific_removal_module_predicate($$inferenceBindingValue);
        inference_modules.inference_removal_module($REMOVAL_INFERENCE_BINDING_VALUE_CHECK_POS, $list_alt99);
        inference_modules.inference_removal_module($REMOVAL_INFERENCE_BINDING_VALUE_ARG2_UNIFY, $list_alt101);
        return NIL;
    }

    public static SubLObject setup_removal_modules_inference_reflection_file() {
        if (SubLFiles.USE_V1) {
            inference_modules.register_solely_specific_removal_module_predicate($$cycProblemStoreProblemCount);
            preference_modules.doomed_unless_arg_bindable($POS, $$cycProblemStoreProblemCount, ONE_INTEGER);
            inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_PROBLEM_COUNT_LOOKUP, $list34);
            inference_modules.register_solely_specific_removal_module_predicate($$cycProblemStoreLinkCount);
            preference_modules.doomed_unless_arg_bindable($POS, $$cycProblemStoreLinkCount, ONE_INTEGER);
            inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_LINK_COUNT_LOOKUP, $list37);
            inference_modules.register_solely_specific_removal_module_predicate($$cycProblemStoreProofCount);
            preference_modules.doomed_unless_arg_bindable($POS, $$cycProblemStoreProofCount, ONE_INTEGER);
            inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_PROOF_COUNT_LOOKUP, $list40);
            inference_modules.register_solely_specific_removal_module_predicate($$cycProblemStoreInferenceCount);
            preference_modules.doomed_unless_arg_bindable($POS, $$cycProblemStoreInferenceCount, ONE_INTEGER);
            inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_INFERENCE_COUNT_LOOKUP, $list43);
            inference_modules.register_solely_specific_removal_module_predicate($$cycProblemStoreTerms);
            preference_modules.doomed_unless_arg_bindable($POS, $$cycProblemStoreTerms, ONE_INTEGER);
            preference_modules.doomed_unless_all_args_bindable($NEG, $$cycProblemStoreTerms);
            inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_TERMS_CHECK_POS, $list47);
            inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_TERMS_CHECK_NEG, $list49);
            inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_TERMS_ARG2_UNIFY, $list51);
            inference_modules.register_solely_specific_removal_module_predicate($$cycProblemStoreProblems);
            preference_modules.doomed_unless_either_arg_bindable($POS, $$cycProblemStoreProblems);
            inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_PROBLEMS_ARG1_UNIFY, $list54);
            inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_PROBLEMS_ARG2_UNIFY, $list56);
            inference_modules.register_solely_specific_removal_module_predicate($$cycProblemQuerySentence);
            preference_modules.doomed_unless_arg_bindable($POS, $$cycProblemQuerySentence, ONE_INTEGER);
            inference_modules.inference_removal_module($REMOVAL_PROBLEM_QUERY_SENTENCE_ARG2_UNIFY, $list59);
            inference_modules.register_solely_specific_removal_module_predicate($$cycProblemQueryTerms);
            preference_modules.doomed_unless_either_arg_bindable($POS, $$cycProblemQueryTerms);
            preference_modules.doomed_unless_all_args_bindable($NEG, $$cycProblemQueryTerms);
            inference_modules.inference_removal_module($REMOVAL_PROBLEM_QUERY_TERMS_CHECK_POS, $list62);
            inference_modules.inference_removal_module($REMOVAL_PROBLEM_QUERY_TERMS_CHECK_NEG, $list64);
            inference_modules.inference_removal_module($REMOVAL_PROBLEM_QUERY_TERMS_ARG1_UNIFY, $list69);
            inference_modules.inference_removal_module($REMOVAL_PROBLEM_QUERY_TERMS_ARG2_UNIFY, $list71);
            inference_modules.register_solely_specific_removal_module_predicate($$cycProblemProvabilityStatus);
            preference_modules.doomed_unless_arg_bindable($POS, $$cycProblemProvabilityStatus, ONE_INTEGER);
            inference_modules.inference_removal_module($REMOVAL_PROBLEM_PROVABILITY_STATUS_CHECK_POS, $list74);
            inference_modules.inference_removal_module($REMOVAL_PROBLEM_PROVABILITY_STATUS_ARG2_UNIFY, $list76);
            inference_modules.register_solely_specific_removal_module_predicate($$cycTransformationProofRule);
            preference_modules.doomed_unless_arg_bindable($POS, $$cycTransformationProofRule, ONE_INTEGER);
            inference_modules.inference_removal_module($REMOVAL_TRANSFORMATION_PROOF_RULE_CHECK_POS, $list79);
            inference_modules.inference_removal_module($REMOVAL_TRANSFORMATION_PROOF_RULE_ARG2_UNIFY, $list81);
            inference_modules.register_solely_specific_removal_module_predicate($$cycTransformationProofBindings);
            preference_modules.doomed_unless_arg_bindable($POS, $$cycTransformationProofBindings, ONE_INTEGER);
            inference_modules.inference_removal_module($REMOVAL_TRANSFORMATION_PROOF_BINDINGS_CHECK_POS, $list84);
            inference_modules.inference_removal_module($REMOVAL_TRANSFORMATION_PROOF_BINDINGS_ARG2_UNIFY, $list86);
            inference_modules.register_solely_specific_removal_module_predicate($$inferenceAnswerBindings);
            preference_modules.doomed_unless_arg_bindable($POS, $$inferenceAnswerBindings, ONE_INTEGER);
            inference_modules.inference_removal_module($REMOVAL_INFERENCE_ANSWER_BINDINGS_CHECK_POS, $list91);
            inference_modules.inference_removal_module($REMOVAL_INFERENCE_ANSWER_BINDINGS_ARG2_UNIFY, $list93);
            inference_modules.register_solely_specific_removal_module_predicate($$inferenceBindingVar);
            preference_modules.doomed_unless_arg_bindable($POS, $$inferenceBindingVar, ONE_INTEGER);
            inference_modules.inference_removal_module($REMOVAL_INFERENCE_BINDING_VAR_CHECK_POS, $list96);
            inference_modules.inference_removal_module($REMOVAL_INFERENCE_BINDING_VAR_ARG2_UNIFY, $list98);
            inference_modules.register_solely_specific_removal_module_predicate($$inferenceBindingValue);
            preference_modules.doomed_unless_arg_bindable($POS, $$inferenceBindingValue, ONE_INTEGER);
            inference_modules.inference_removal_module($REMOVAL_INFERENCE_BINDING_VALUE_CHECK_POS, $list101);
            inference_modules.inference_removal_module($REMOVAL_INFERENCE_BINDING_VALUE_ARG2_UNIFY, $list103);
        }
        if (SubLFiles.USE_V2) {
            inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_PROBLEM_COUNT_LOOKUP, $list_alt33);
            inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_LINK_COUNT_LOOKUP, $list_alt36);
            inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_PROOF_COUNT_LOOKUP, $list_alt39);
            inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_INFERENCE_COUNT_LOOKUP, $list_alt42);
            inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_TERMS_CHECK_POS, $list_alt45);
            inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_TERMS_CHECK_NEG, $list_alt47);
            inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_TERMS_ARG2_UNIFY, $list_alt49);
            inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_PROBLEMS_ARG1_UNIFY, $list_alt52);
            inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_PROBLEMS_ARG2_UNIFY, $list_alt54);
            inference_modules.inference_removal_module($REMOVAL_PROBLEM_QUERY_SENTENCE_ARG2_UNIFY, $list_alt57);
            inference_modules.inference_removal_module($REMOVAL_PROBLEM_QUERY_TERMS_CHECK_POS, $list_alt60);
            inference_modules.inference_removal_module($REMOVAL_PROBLEM_QUERY_TERMS_CHECK_NEG, $list_alt62);
            inference_modules.inference_removal_module($REMOVAL_PROBLEM_QUERY_TERMS_ARG1_UNIFY, $list_alt67);
            inference_modules.inference_removal_module($REMOVAL_PROBLEM_QUERY_TERMS_ARG2_UNIFY, $list_alt69);
            inference_modules.inference_removal_module($REMOVAL_PROBLEM_PROVABILITY_STATUS_CHECK_POS, $list_alt72);
            inference_modules.inference_removal_module($REMOVAL_PROBLEM_PROVABILITY_STATUS_ARG2_UNIFY, $list_alt74);
            inference_modules.inference_removal_module($REMOVAL_TRANSFORMATION_PROOF_RULE_CHECK_POS, $list_alt77);
            inference_modules.inference_removal_module($REMOVAL_TRANSFORMATION_PROOF_RULE_ARG2_UNIFY, $list_alt79);
            inference_modules.inference_removal_module($REMOVAL_TRANSFORMATION_PROOF_BINDINGS_CHECK_POS, $list_alt82);
            inference_modules.inference_removal_module($REMOVAL_TRANSFORMATION_PROOF_BINDINGS_ARG2_UNIFY, $list_alt84);
            inference_modules.inference_removal_module($REMOVAL_INFERENCE_ANSWER_BINDINGS_CHECK_POS, $list_alt89);
            inference_modules.inference_removal_module($REMOVAL_INFERENCE_ANSWER_BINDINGS_ARG2_UNIFY, $list_alt91);
            inference_modules.inference_removal_module($REMOVAL_INFERENCE_BINDING_VAR_CHECK_POS, $list_alt94);
            inference_modules.inference_removal_module($REMOVAL_INFERENCE_BINDING_VAR_ARG2_UNIFY, $list_alt96);
            inference_modules.inference_removal_module($REMOVAL_INFERENCE_BINDING_VALUE_CHECK_POS, $list_alt99);
            inference_modules.inference_removal_module($REMOVAL_INFERENCE_BINDING_VALUE_ARG2_UNIFY, $list_alt101);
        }
        return NIL;
    }

    public static SubLObject setup_removal_modules_inference_reflection_file_Previous() {
        inference_modules.register_solely_specific_removal_module_predicate($$cycProblemStoreProblemCount);
        preference_modules.doomed_unless_arg_bindable($POS, $$cycProblemStoreProblemCount, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_PROBLEM_COUNT_LOOKUP, $list34);
        inference_modules.register_solely_specific_removal_module_predicate($$cycProblemStoreLinkCount);
        preference_modules.doomed_unless_arg_bindable($POS, $$cycProblemStoreLinkCount, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_LINK_COUNT_LOOKUP, $list37);
        inference_modules.register_solely_specific_removal_module_predicate($$cycProblemStoreProofCount);
        preference_modules.doomed_unless_arg_bindable($POS, $$cycProblemStoreProofCount, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_PROOF_COUNT_LOOKUP, $list40);
        inference_modules.register_solely_specific_removal_module_predicate($$cycProblemStoreInferenceCount);
        preference_modules.doomed_unless_arg_bindable($POS, $$cycProblemStoreInferenceCount, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_INFERENCE_COUNT_LOOKUP, $list43);
        inference_modules.register_solely_specific_removal_module_predicate($$cycProblemStoreTerms);
        preference_modules.doomed_unless_arg_bindable($POS, $$cycProblemStoreTerms, ONE_INTEGER);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$cycProblemStoreTerms);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_TERMS_CHECK_POS, $list47);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_TERMS_CHECK_NEG, $list49);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_TERMS_ARG2_UNIFY, $list51);
        inference_modules.register_solely_specific_removal_module_predicate($$cycProblemStoreProblems);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$cycProblemStoreProblems);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_PROBLEMS_ARG1_UNIFY, $list54);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_PROBLEMS_ARG2_UNIFY, $list56);
        inference_modules.register_solely_specific_removal_module_predicate($$cycProblemQuerySentence);
        preference_modules.doomed_unless_arg_bindable($POS, $$cycProblemQuerySentence, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_QUERY_SENTENCE_ARG2_UNIFY, $list59);
        inference_modules.register_solely_specific_removal_module_predicate($$cycProblemQueryTerms);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$cycProblemQueryTerms);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$cycProblemQueryTerms);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_QUERY_TERMS_CHECK_POS, $list62);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_QUERY_TERMS_CHECK_NEG, $list64);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_QUERY_TERMS_ARG1_UNIFY, $list69);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_QUERY_TERMS_ARG2_UNIFY, $list71);
        inference_modules.register_solely_specific_removal_module_predicate($$cycProblemProvabilityStatus);
        preference_modules.doomed_unless_arg_bindable($POS, $$cycProblemProvabilityStatus, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_PROVABILITY_STATUS_CHECK_POS, $list74);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_PROVABILITY_STATUS_ARG2_UNIFY, $list76);
        inference_modules.register_solely_specific_removal_module_predicate($$cycTransformationProofRule);
        preference_modules.doomed_unless_arg_bindable($POS, $$cycTransformationProofRule, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_TRANSFORMATION_PROOF_RULE_CHECK_POS, $list79);
        inference_modules.inference_removal_module($REMOVAL_TRANSFORMATION_PROOF_RULE_ARG2_UNIFY, $list81);
        inference_modules.register_solely_specific_removal_module_predicate($$cycTransformationProofBindings);
        preference_modules.doomed_unless_arg_bindable($POS, $$cycTransformationProofBindings, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_TRANSFORMATION_PROOF_BINDINGS_CHECK_POS, $list84);
        inference_modules.inference_removal_module($REMOVAL_TRANSFORMATION_PROOF_BINDINGS_ARG2_UNIFY, $list86);
        inference_modules.register_solely_specific_removal_module_predicate($$inferenceAnswerBindings);
        preference_modules.doomed_unless_arg_bindable($POS, $$inferenceAnswerBindings, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_INFERENCE_ANSWER_BINDINGS_CHECK_POS, $list91);
        inference_modules.inference_removal_module($REMOVAL_INFERENCE_ANSWER_BINDINGS_ARG2_UNIFY, $list93);
        inference_modules.register_solely_specific_removal_module_predicate($$inferenceBindingVar);
        preference_modules.doomed_unless_arg_bindable($POS, $$inferenceBindingVar, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_INFERENCE_BINDING_VAR_CHECK_POS, $list96);
        inference_modules.inference_removal_module($REMOVAL_INFERENCE_BINDING_VAR_ARG2_UNIFY, $list98);
        inference_modules.register_solely_specific_removal_module_predicate($$inferenceBindingValue);
        preference_modules.doomed_unless_arg_bindable($POS, $$inferenceBindingValue, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_INFERENCE_BINDING_VALUE_CHECK_POS, $list101);
        inference_modules.inference_removal_module($REMOVAL_INFERENCE_BINDING_VALUE_ARG2_UNIFY, $list103);
        return NIL;
    }

    static private final SubLList $list_alt101 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("inferenceBindingValue"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("inferenceBindingValue"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-INFERENCE-BINDING-VALUE-LOOKUP-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("inferenceBindingValue"), list($BIND, makeSymbol("CYCL-BINDING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list($CALL, makeSymbol("CYCL-BINDING-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("REMOVAL-INFERENCE-BINDING-VALUE"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("inferenceBindingValue"), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$inferenceBindingValue <fully-bound> <not-fully-bound>)") });

    static private final SubLList $list_alt102 = list(new SubLObject[]{ reader_make_constant_shell("cycProblemStoreProblemCount"), reader_make_constant_shell("cycProblemStoreLinkCount"), reader_make_constant_shell("cycProblemStoreProofCount"), reader_make_constant_shell("cycProblemStoreInferenceCount"), reader_make_constant_shell("cycProblemStoreTerms"), reader_make_constant_shell("cycProblemStoreProblems"), reader_make_constant_shell("cycProblemQuerySentence"), reader_make_constant_shell("cycProblemQueryTerms"), reader_make_constant_shell("cycProblemProvabilityStatus") });

    @Override
    public void declareFunctions() {
        declare_removal_modules_inference_reflection_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_inference_reflection_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_inference_reflection_file();
    }

    static {
    }
}

/**
 * Total time: 430 ms
 */
