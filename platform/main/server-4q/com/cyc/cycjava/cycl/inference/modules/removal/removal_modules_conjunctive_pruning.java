package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.kappa_predicate_p;
import static com.cyc.cycjava.cycl.el_utilities.tou_litP;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.at_admitted;
import com.cyc.cycjava.cycl.at_var_types;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.disjoint_with;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.sdc;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.somewhere_cache;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.term;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_restriction;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_split;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_conjunctive_pruning extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_conjunctive_pruning();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conjunctive_pruning";

    public static final String myFingerPrint = "e76c9bd3eac3d512d4982d6c628b0eec6fadcfab73b0064d4a4177f37b2d33e5";

    // deflexical
    // Definitions
    private static final SubLSymbol $conjunctive_pruning_module_names$ = makeSymbol("*CONJUNCTIVE-PRUNING-MODULE-NAMES*");

    // defparameter
    private static final SubLSymbol $prune_root_problem_of_some_inference_non_wff_conjunctionP$ = makeSymbol("*PRUNE-ROOT-PROBLEM-OF-SOME-INFERENCE-NON-WFF-CONJUNCTION?*");

    // defparameter
    /**
     * dynamic variable bound to T when gathering reasons why a problem query was
     * deemed semantically invalid
     */
    private static final SubLSymbol $gathering_problem_query_semantically_invalid_reasonsP$ = makeSymbol("*GATHERING-PROBLEM-QUERY-SEMANTICALLY-INVALID-REASONS?*");

    // defparameter
    /**
     * A dynamically bound string representing the reason a problem was deemed
     * semantically invalid
     */
    private static final SubLSymbol $problem_query_semantically_invalid_reason$ = makeSymbol("*PROBLEM-QUERY-SEMANTICALLY-INVALID-REASON*");

    // defparameter
    private static final SubLSymbol $problem_query_semantically_invalid_ignores_sdcP$ = makeSymbol("*PROBLEM-QUERY-SEMANTICALLY-INVALID-IGNORES-SDC?*");

    // Internal Constants
    public static final SubLList $list0 = list(makeKeyword("PRUNE-NON-WFF-CONJUNCTION"), makeKeyword("PRUNE-UNKNOWN-SENTENCE-LITERAL-INCONSISTENCY"), makeKeyword("PRUNE-RT-PROBLEMS-APPLICABLE-WHEN-TYPED-ONLY-WHEN-SPECIALIZATION"), makeKeyword("PRUNE-CIRCULAR-TERM-OF-UNIT"));

    private static final SubLSymbol $PRUNE_NON_WFF_CONJUNCTION = makeKeyword("PRUNE-NON-WFF-CONJUNCTION");

    public static final SubLList $list2 = list(new SubLObject[]{ makeKeyword("EVERY-PREDICATES"), NIL, makeKeyword("APPLICABILITY"), makeSymbol("PRUNE-NON-WFF-CONJUNCTION-APPLICABILITY"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("EXPAND"), makeSymbol("PRUNE-NON-WFF-CONJUNCTION-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$and <lit0> ... <litN>) \n    which has a dependent residual transformation link\n    and is non-wff"), makeKeyword("EXAMPLE"), makeString("(#$and\n      (#$isa ?AGENT #$City)\n      (#$spouse ?AGENT ?SPOUSE))") });

    private static final SubLSymbol SUPPORTING_RESIDUAL_CONJUNCTION_PROBLEM_MINIMAL_PROBLEM_QUERY_INT = makeSymbol("SUPPORTING-RESIDUAL-CONJUNCTION-PROBLEM-MINIMAL-PROBLEM-QUERY-INT");







    public static final SubLList $list7 = list(makeSymbol("MT"), makeSymbol("ASENT"));



    private static final SubLList $list9 = list(makeSymbol("MT-SWEEP-1"), makeSymbol("ASENT-SWEEP-1"));

    private static final SubLSymbol PRUNE_NON_WFF_CONJUNCTION_APPLICABILITY = makeSymbol("PRUNE-NON-WFF-CONJUNCTION-APPLICABILITY");



    private static final SubLSymbol PRUNE_NON_WFF_CONJUNCTION_EXPAND = makeSymbol("PRUNE-NON-WFF-CONJUNCTION-EXPAND");



    private static final SubLString $str14$unknown_non_wff_reason = makeString("unknown non-wff reason");

    private static final SubLObject $$evaluate = reader_make_constant_shell(makeString("evaluate"));



    public static final SubLString $$$_is_not_a_valid_arg = makeString(" is not a valid arg");

    public static final SubLString $$$_for_ = makeString(" for ");

    public static final SubLString $$$_in_ = makeString(" in ");

    private static final SubLSymbol $sym20$_EXIT = makeSymbol("%EXIT");

    private static final SubLString $str21$variable_constraint_tuple_mismatc = makeString("variable constraint tuple mismatch for ~a");

    private static final SubLString $str22$_is_constrained_to_disjoint_colle = makeString(" is constrained to disjoint collections: ");

    private static final SubLSymbol DNF_VARIABLE_CONSTRAINT_TUPLES = makeSymbol("DNF-VARIABLE-CONSTRAINT-TUPLES");

    private static final SubLObject $$rdf_type = reader_make_constant_shell(makeString("rdf-type"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLSymbol $sym26$THING_TUPLE_ = makeSymbol("THING-TUPLE?");

    private static final SubLInteger $int$128 = makeInteger(128);

    public static final SubLList $list28 = list(makeSymbol("VAR"), makeSymbol("MT"), makeSymbol("COLLECTIONS"));

    private static final SubLList $list29 = list(reader_make_constant_shell(makeString("Thing")));

    private static final SubLSymbol $PRUNE_UNKNOWN_SENTENCE_LITERAL_INCONSISTENCY = makeKeyword("PRUNE-UNKNOWN-SENTENCE-LITERAL-INCONSISTENCY");

    private static final SubLList $list31 = list(new SubLObject[]{ makeKeyword("EVERY-PREDICATES"), NIL, makeKeyword("APPLICABILITY"), makeSymbol("PRUNE-UNKNOWN-SENTENCE-LITERAL-INCONSISTENCY-APPLICABILITY"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("EXPAND"), makeSymbol("PRUNE-UNKNOWN-SENTENCE-LITERAL-INCONSISTENCY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$and <lit0> ... <litN> ... (#$unknownSentence <litN>) ...)"), makeKeyword("EXAMPLE"), makeString("(#$and\n      (#$children ?ANIMAL ?CHILD)\n      (#$unknownSentence (#$children ?ANIMAL ?CHILD)))") });

    private static final SubLObject $$unknownSentence = reader_make_constant_shell(makeString("unknownSentence"));

    private static final SubLList $list33 = list(makeSymbol("MT2"), makeSymbol("ASENT2"));

    private static final SubLSymbol PRUNE_UNKNOWN_SENTENCE_LITERAL_INCONSISTENCY_APPLICABILITY = makeSymbol("PRUNE-UNKNOWN-SENTENCE-LITERAL-INCONSISTENCY-APPLICABILITY");

    private static final SubLSymbol PRUNE_UNKNOWN_SENTENCE_LITERAL_INCONSISTENCY_EXPAND = makeSymbol("PRUNE-UNKNOWN-SENTENCE-LITERAL-INCONSISTENCY-EXPAND");

    private static final SubLSymbol $PRUNE_RT_PROBLEMS_APPLICABLE_WHEN_TYPED_ONLY_WHEN_SPECIALIZATION = makeKeyword("PRUNE-RT-PROBLEMS-APPLICABLE-WHEN-TYPED-ONLY-WHEN-SPECIALIZATION");

    private static final SubLList $list37 = list(new SubLObject[]{ makeKeyword("EVERY-PREDICATES"), NIL, makeKeyword("APPLICABILITY"), makeSymbol("PRUNE-RT-PROBLEMS-APPLICABLE-WHEN-TYPED-ONLY-WHEN-SPECIALIZATION-APPLICABILITY"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("EXPAND"), makeSymbol("PRUNE-RT-PROBLEMS-APPLICABLE-WHEN-TYPED-ONLY-WHEN-SPECIALIZATION-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("Apply to problems created via residual transformation where the rule has a #$applicableWhenTypedOnlyWhenSpecialization assertion on it.") });

    private static final SubLSymbol $sym38$PRUNE_RT_PROBLEMS_APPLICABLE_WHEN_TYPED_ONLY_WHEN_SPECIALIZATION_ = makeSymbol("PRUNE-RT-PROBLEMS-APPLICABLE-WHEN-TYPED-ONLY-WHEN-SPECIALIZATION-APPLICABILITY");

    private static final SubLObject $const39$applicableWhenTypedOnlyWhenSpecia = reader_make_constant_shell(makeString("applicableWhenTypedOnlyWhenSpecialization"));

    private static final SubLList $list40 = list(ONE_INTEGER, TWO_INTEGER);

    private static final SubLSymbol $sym41$PRUNE_RT_PROBLEMS_APPLICABLE_WHEN_TYPED_ONLY_WHEN_SPECIALIZATION_ = makeSymbol("PRUNE-RT-PROBLEMS-APPLICABLE-WHEN-TYPED-ONLY-WHEN-SPECIALIZATION-EXPAND");

    private static final SubLSymbol $PRUNE_CIRCULAR_TERM_OF_UNIT = makeKeyword("PRUNE-CIRCULAR-TERM-OF-UNIT");

    private static final SubLList $list43 = list(new SubLObject[]{ makeKeyword("EVERY-PREDICATES"), list(reader_make_constant_shell(makeString("termOfUnit"))), makeKeyword("APPLICABILITY"), makeSymbol("PRUNE-CIRCULAR-TERM-OF-UNIT-APPLICABILITY"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("EXPAND"), makeSymbol("PRUNE-CIRCULAR-TERM-OF-UNIT-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("Applies to syntactically circular termOfUnit literals, for instance (#$termOfUnit ?var0 (#$MotherFn ?var0))") });

    private static final SubLSymbol PRUNE_CIRCULAR_TERM_OF_UNIT_APPLICABILITY = makeSymbol("PRUNE-CIRCULAR-TERM-OF-UNIT-APPLICABILITY");

    private static final SubLSymbol PRUNE_CIRCULAR_TERM_OF_UNIT_EXPAND = makeSymbol("PRUNE-CIRCULAR-TERM-OF-UNIT-EXPAND");

    public static SubLObject conjunctive_pruning_module_p(final SubLObject hl_module) {
        return makeBoolean((NIL != inference_modules.hl_module_p(hl_module)) && (NIL != subl_promotions.memberP(inference_modules.hl_module_name(hl_module), $conjunctive_pruning_module_names$.getGlobalValue(), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject conjunctive_pruning_tactic_p(final SubLObject tactic) {
        return makeBoolean((NIL != inference_datastructures_tactic.tactic_p(tactic)) && (NIL != conjunctive_pruning_module_p(inference_datastructures_tactic.tactic_hl_module(tactic))));
    }

    public static SubLObject supporting_residual_conjunction_problem_minimal_problem_query(final SubLObject problem, SubLObject add_isomophic_literalsP) {
        if (add_isomophic_literalsP == UNPROVIDED) {
            add_isomophic_literalsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject local_state = inference_datastructures_problem.problem_memoization_state(problem);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                result = supporting_residual_conjunction_problem_minimal_problem_query_int(problem, add_isomophic_literalsP);
            } finally {
                final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject supporting_residual_conjunction_problem_minimal_problem_query_int_internal(final SubLObject problem, SubLObject add_isomophic_literalsP) {
        if (add_isomophic_literalsP == UNPROVIDED) {
            add_isomophic_literalsP = NIL;
        }
        final SubLObject original_problem_query = inference_datastructures_problem.problem_query(problem);
        SubLObject result_problem_query = inference_datastructures_problem.problem_query(problem);
        SubLObject relevant_hl_vars = NIL;
        SubLObject doneP = NIL;
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        SubLObject residual_problem_query;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == doneP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, $RESIDUAL_TRANSFORMATION))) {
                doneP = T;
                residual_problem_query = bindings.apply_bindings_backwards(inference_worker_residual_transformation.residual_transformation_link_supporting_variable_map(link), inference_datastructures_problem.problem_query(inference_worker_residual_transformation.residual_transformation_link_residual_problem(link)));
                relevant_hl_vars = list_utilities.tree_gather(residual_problem_query, VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        if (NIL != relevant_hl_vars) {
            SubLObject new_problem_query_sweep_1 = NIL;
            SubLObject cdolist_list_var = original_problem_query;
            SubLObject contextualized_clause = NIL;
            contextualized_clause = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject sense = $NEG;
                SubLObject index_var = ZERO_INTEGER;
                SubLObject cdolist_list_var_$2 = clauses.neg_lits(contextualized_clause);
                SubLObject contextualized_asent = NIL;
                contextualized_asent = cdolist_list_var_$2.first();
                while (NIL != cdolist_list_var_$2) {
                    SubLObject current;
                    final SubLObject datum = current = contextualized_asent;
                    SubLObject mt = NIL;
                    SubLObject asent = NIL;
                    destructuring_bind_must_consp(current, datum, $list7);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list7);
                    asent = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != list_utilities.tree_find_any(relevant_hl_vars, asent, UNPROVIDED, UNPROVIDED)) {
                            new_problem_query_sweep_1 = cons(inference_datastructures_problem_query.make_contextualized_asent(mt, asent), new_problem_query_sweep_1);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list7);
                    }
                    index_var = add(index_var, ONE_INTEGER);
                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                    contextualized_asent = cdolist_list_var_$2.first();
                } 
                sense = $POS;
                index_var = ZERO_INTEGER;
                SubLObject cdolist_list_var_$3 = clauses.pos_lits(contextualized_clause);
                contextualized_asent = NIL;
                contextualized_asent = cdolist_list_var_$3.first();
                while (NIL != cdolist_list_var_$3) {
                    SubLObject current;
                    final SubLObject datum = current = contextualized_asent;
                    SubLObject mt = NIL;
                    SubLObject asent = NIL;
                    destructuring_bind_must_consp(current, datum, $list7);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list7);
                    asent = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != list_utilities.tree_find_any(relevant_hl_vars, asent, UNPROVIDED, UNPROVIDED)) {
                            new_problem_query_sweep_1 = cons(inference_datastructures_problem_query.make_contextualized_asent(mt, asent), new_problem_query_sweep_1);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list7);
                    }
                    index_var = add(index_var, ONE_INTEGER);
                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                    contextualized_asent = cdolist_list_var_$3.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                contextualized_clause = cdolist_list_var.first();
            } 
            if (NIL != new_problem_query_sweep_1) {
                result_problem_query = inference_datastructures_problem_query.new_problem_query_from_contextualized_clause(clauses.make_clause(NIL, new_problem_query_sweep_1));
                if (NIL != add_isomophic_literalsP) {
                    SubLObject new_problem_query_sweep_2 = NIL;
                    SubLObject cdolist_list_var2 = original_problem_query;
                    SubLObject contextualized_clause2 = NIL;
                    contextualized_clause2 = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        SubLObject sense2 = $NEG;
                        SubLObject index_var2 = ZERO_INTEGER;
                        SubLObject cdolist_list_var_$4 = clauses.neg_lits(contextualized_clause2);
                        SubLObject contextualized_asent2 = NIL;
                        contextualized_asent2 = cdolist_list_var_$4.first();
                        while (NIL != cdolist_list_var_$4) {
                            SubLObject current2;
                            final SubLObject datum2 = current2 = contextualized_asent2;
                            SubLObject mt2 = NIL;
                            SubLObject asent2 = NIL;
                            destructuring_bind_must_consp(current2, datum2, $list7);
                            mt2 = current2.first();
                            current2 = current2.rest();
                            destructuring_bind_must_consp(current2, datum2, $list7);
                            asent2 = current2.first();
                            current2 = current2.rest();
                            if (NIL == current2) {
                                SubLObject doneP2;
                                SubLObject rest;
                                SubLObject contextualized_clause_$5;
                                SubLObject sense_sweep_1;
                                SubLObject index_var_$6;
                                SubLObject cdolist_list_var_$5;
                                SubLObject contextualized_asent_$8;
                                SubLObject current_$10;
                                SubLObject datum_$9;
                                SubLObject mt_sweep_1;
                                SubLObject asent_sweep_1;
                                SubLObject item_var;
                                SubLObject index_var_$7;
                                SubLObject cdolist_list_var_$6;
                                SubLObject contextualized_asent_$9;
                                SubLObject current_$11;
                                SubLObject datum_$10;
                                for (doneP2 = NIL, rest = NIL, rest = result_problem_query; (NIL == doneP2) && (NIL != rest); rest = rest.rest()) {
                                    contextualized_clause_$5 = rest.first();
                                    sense_sweep_1 = $NEG;
                                    index_var_$6 = ZERO_INTEGER;
                                    cdolist_list_var_$5 = clauses.neg_lits(contextualized_clause_$5);
                                    contextualized_asent_$8 = NIL;
                                    contextualized_asent_$8 = cdolist_list_var_$5.first();
                                    while (NIL != cdolist_list_var_$5) {
                                        datum_$9 = current_$10 = contextualized_asent_$8;
                                        mt_sweep_1 = NIL;
                                        asent_sweep_1 = NIL;
                                        destructuring_bind_must_consp(current_$10, datum_$9, $list9);
                                        mt_sweep_1 = current_$10.first();
                                        current_$10 = current_$10.rest();
                                        destructuring_bind_must_consp(current_$10, datum_$9, $list9);
                                        asent_sweep_1 = current_$10.first();
                                        current_$10 = current_$10.rest();
                                        if (NIL == current_$10) {
                                            if (mt2.equal(mt_sweep_1) && (asent2.equal(asent_sweep_1) || (NIL != unification.unify(asent2, asent_sweep_1, UNPROVIDED, UNPROVIDED)))) {
                                                item_var = inference_datastructures_problem_query.make_contextualized_asent(mt2, asent2);
                                                if (NIL == member(item_var, new_problem_query_sweep_2, EQUAL, symbol_function(IDENTITY))) {
                                                    new_problem_query_sweep_2 = cons(item_var, new_problem_query_sweep_2);
                                                }
                                                doneP2 = T;
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum_$9, $list9);
                                        }
                                        index_var_$6 = add(index_var_$6, ONE_INTEGER);
                                        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                                        contextualized_asent_$8 = cdolist_list_var_$5.first();
                                    } 
                                    sense_sweep_1 = $POS;
                                    index_var_$7 = ZERO_INTEGER;
                                    cdolist_list_var_$6 = clauses.pos_lits(contextualized_clause_$5);
                                    contextualized_asent_$9 = NIL;
                                    contextualized_asent_$9 = cdolist_list_var_$6.first();
                                    while (NIL != cdolist_list_var_$6) {
                                        datum_$10 = current_$11 = contextualized_asent_$9;
                                        mt_sweep_1 = NIL;
                                        asent_sweep_1 = NIL;
                                        destructuring_bind_must_consp(current_$11, datum_$10, $list9);
                                        mt_sweep_1 = current_$11.first();
                                        current_$11 = current_$11.rest();
                                        destructuring_bind_must_consp(current_$11, datum_$10, $list9);
                                        asent_sweep_1 = current_$11.first();
                                        current_$11 = current_$11.rest();
                                        if (NIL == current_$11) {
                                            if (mt2.equal(mt_sweep_1) && (asent2.equal(asent_sweep_1) || (NIL != unification.unify(asent2, asent_sweep_1, UNPROVIDED, UNPROVIDED)))) {
                                                item_var = inference_datastructures_problem_query.make_contextualized_asent(mt2, asent2);
                                                if (NIL == member(item_var, new_problem_query_sweep_2, EQUAL, symbol_function(IDENTITY))) {
                                                    new_problem_query_sweep_2 = cons(item_var, new_problem_query_sweep_2);
                                                }
                                                doneP2 = T;
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum_$10, $list9);
                                        }
                                        index_var_$7 = add(index_var_$7, ONE_INTEGER);
                                        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                                        contextualized_asent_$9 = cdolist_list_var_$6.first();
                                    } 
                                }
                            } else {
                                cdestructuring_bind_error(datum2, $list7);
                            }
                            index_var2 = add(index_var2, ONE_INTEGER);
                            cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                            contextualized_asent2 = cdolist_list_var_$4.first();
                        } 
                        sense2 = $POS;
                        index_var2 = ZERO_INTEGER;
                        SubLObject cdolist_list_var_$7 = clauses.pos_lits(contextualized_clause2);
                        contextualized_asent2 = NIL;
                        contextualized_asent2 = cdolist_list_var_$7.first();
                        while (NIL != cdolist_list_var_$7) {
                            SubLObject current2;
                            final SubLObject datum2 = current2 = contextualized_asent2;
                            SubLObject mt2 = NIL;
                            SubLObject asent2 = NIL;
                            destructuring_bind_must_consp(current2, datum2, $list7);
                            mt2 = current2.first();
                            current2 = current2.rest();
                            destructuring_bind_must_consp(current2, datum2, $list7);
                            asent2 = current2.first();
                            current2 = current2.rest();
                            if (NIL == current2) {
                                SubLObject doneP2;
                                SubLObject rest;
                                SubLObject sense_sweep_1;
                                SubLObject mt_sweep_1;
                                SubLObject asent_sweep_1;
                                SubLObject item_var;
                                SubLObject contextualized_clause_$6;
                                SubLObject index_var_$8;
                                SubLObject cdolist_list_var_$8;
                                SubLObject contextualized_asent_$10;
                                SubLObject current_$12;
                                SubLObject datum_$11;
                                SubLObject index_var_$9;
                                SubLObject cdolist_list_var_$9;
                                SubLObject contextualized_asent_$11;
                                SubLObject current_$13;
                                SubLObject datum_$12;
                                for (doneP2 = NIL, rest = NIL, rest = result_problem_query; (NIL == doneP2) && (NIL != rest); rest = rest.rest()) {
                                    contextualized_clause_$6 = rest.first();
                                    sense_sweep_1 = $NEG;
                                    index_var_$8 = ZERO_INTEGER;
                                    cdolist_list_var_$8 = clauses.neg_lits(contextualized_clause_$6);
                                    contextualized_asent_$10 = NIL;
                                    contextualized_asent_$10 = cdolist_list_var_$8.first();
                                    while (NIL != cdolist_list_var_$8) {
                                        datum_$11 = current_$12 = contextualized_asent_$10;
                                        mt_sweep_1 = NIL;
                                        asent_sweep_1 = NIL;
                                        destructuring_bind_must_consp(current_$12, datum_$11, $list9);
                                        mt_sweep_1 = current_$12.first();
                                        current_$12 = current_$12.rest();
                                        destructuring_bind_must_consp(current_$12, datum_$11, $list9);
                                        asent_sweep_1 = current_$12.first();
                                        current_$12 = current_$12.rest();
                                        if (NIL == current_$12) {
                                            if (mt2.equal(mt_sweep_1) && (asent2.equal(asent_sweep_1) || (NIL != unification.unify(asent2, asent_sweep_1, UNPROVIDED, UNPROVIDED)))) {
                                                item_var = inference_datastructures_problem_query.make_contextualized_asent(mt2, asent2);
                                                if (NIL == member(item_var, new_problem_query_sweep_2, EQUAL, symbol_function(IDENTITY))) {
                                                    new_problem_query_sweep_2 = cons(item_var, new_problem_query_sweep_2);
                                                }
                                                doneP2 = T;
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum_$11, $list9);
                                        }
                                        index_var_$8 = add(index_var_$8, ONE_INTEGER);
                                        cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                                        contextualized_asent_$10 = cdolist_list_var_$8.first();
                                    } 
                                    sense_sweep_1 = $POS;
                                    index_var_$9 = ZERO_INTEGER;
                                    cdolist_list_var_$9 = clauses.pos_lits(contextualized_clause_$6);
                                    contextualized_asent_$11 = NIL;
                                    contextualized_asent_$11 = cdolist_list_var_$9.first();
                                    while (NIL != cdolist_list_var_$9) {
                                        datum_$12 = current_$13 = contextualized_asent_$11;
                                        mt_sweep_1 = NIL;
                                        asent_sweep_1 = NIL;
                                        destructuring_bind_must_consp(current_$13, datum_$12, $list9);
                                        mt_sweep_1 = current_$13.first();
                                        current_$13 = current_$13.rest();
                                        destructuring_bind_must_consp(current_$13, datum_$12, $list9);
                                        asent_sweep_1 = current_$13.first();
                                        current_$13 = current_$13.rest();
                                        if (NIL == current_$13) {
                                            if (mt2.equal(mt_sweep_1) && (asent2.equal(asent_sweep_1) || (NIL != unification.unify(asent2, asent_sweep_1, UNPROVIDED, UNPROVIDED)))) {
                                                item_var = inference_datastructures_problem_query.make_contextualized_asent(mt2, asent2);
                                                if (NIL == member(item_var, new_problem_query_sweep_2, EQUAL, symbol_function(IDENTITY))) {
                                                    new_problem_query_sweep_2 = cons(item_var, new_problem_query_sweep_2);
                                                }
                                                doneP2 = T;
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum_$12, $list9);
                                        }
                                        index_var_$9 = add(index_var_$9, ONE_INTEGER);
                                        cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                                        contextualized_asent_$11 = cdolist_list_var_$9.first();
                                    } 
                                }
                            } else {
                                cdestructuring_bind_error(datum2, $list7);
                            }
                            index_var2 = add(index_var2, ONE_INTEGER);
                            cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                            contextualized_asent2 = cdolist_list_var_$7.first();
                        } 
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        contextualized_clause2 = cdolist_list_var2.first();
                    } 
                    if (NIL != new_problem_query_sweep_2) {
                        result_problem_query = inference_datastructures_problem_query.new_problem_query_from_contextualized_clause(clauses.make_clause(NIL, new_problem_query_sweep_2));
                    }
                }
            }
        }
        return result_problem_query;
    }

    public static SubLObject supporting_residual_conjunction_problem_minimal_problem_query_int(final SubLObject problem, SubLObject add_isomophic_literalsP) {
        if (add_isomophic_literalsP == UNPROVIDED) {
            add_isomophic_literalsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return supporting_residual_conjunction_problem_minimal_problem_query_int_internal(problem, add_isomophic_literalsP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SUPPORTING_RESIDUAL_CONJUNCTION_PROBLEM_MINIMAL_PROBLEM_QUERY_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SUPPORTING_RESIDUAL_CONJUNCTION_PROBLEM_MINIMAL_PROBLEM_QUERY_INT, TWO_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SUPPORTING_RESIDUAL_CONJUNCTION_PROBLEM_MINIMAL_PROBLEM_QUERY_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(problem, add_isomophic_literalsP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (problem.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && add_isomophic_literalsP.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(supporting_residual_conjunction_problem_minimal_problem_query_int_internal(problem, add_isomophic_literalsP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(problem, add_isomophic_literalsP));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject prune_non_wff_conjunction_applicability(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem = inference_worker.currently_active_problem();
        if ((((NIL != $prune_root_problem_of_some_inference_non_wff_conjunctionP$.getDynamicValue(thread)) && (NIL != inference_worker.problem_is_the_root_problem_of_some_inferenceP(problem))) && (NIL == kb_control_vars.within_forward_inferenceP())) || (NIL != problem_is_a_topological_mergingP(problem))) {
            final SubLObject residual_conjunction_query = supporting_residual_conjunction_problem_minimal_problem_query(problem, UNPROVIDED);
            if (NIL != problem_query_semantically_invalidP(residual_conjunction_query)) {
                return list(clause_utilities.new_total_subclause_spec(contextualized_dnf_clause));
            }
        }
        return NIL;
    }

    public static SubLObject prune_non_wff_conjunction_expand(final SubLObject contextualized_dnf_clause) {
        if (NIL != inference_worker.currently_active_problem()) {
            inference_worker.make_problem_no_good(inference_worker.currently_active_problem(), NIL, $TACTICAL);
        }
        return NIL;
    }

    public static SubLObject problem_is_a_topological_mergingP(final SubLObject problem) {
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        SubLObject supported_problem;
        SubLObject set_contents_var_$28;
        SubLObject basis_object_$29;
        SubLObject state_$30;
        SubLObject link_$31;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                if (NIL != inference_worker_residual_transformation.residual_transformation_link_p(link)) {
                    return T;
                }
                if (NIL != inference_worker_restriction.simplification_link_p(link)) {
                    return T;
                }
                if (NIL != inference_worker_split.split_link_p(link)) {
                    supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                    set_contents_var_$28 = inference_datastructures_problem.problem_dependent_links(supported_problem);
                    for (basis_object_$29 = set_contents.do_set_contents_basis_object(set_contents_var_$28), state_$30 = NIL, state_$30 = set_contents.do_set_contents_initial_state(basis_object_$29, set_contents_var_$28); NIL == set_contents.do_set_contents_doneP(basis_object_$29, state_$30); state_$30 = set_contents.do_set_contents_update_state(state_$30)) {
                        link_$31 = set_contents.do_set_contents_next(basis_object_$29, state_$30);
                        if ((NIL != set_contents.do_set_contents_element_validP(state_$30, link_$31)) && (NIL != inference_worker_restriction.simplification_link_p(link_$31))) {
                            return T;
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject why_problem_query_semantically_invalid(final SubLObject problem_query) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $gathering_problem_query_semantically_invalid_reasonsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $problem_query_semantically_invalid_reason$.currentBinding(thread);
        try {
            $gathering_problem_query_semantically_invalid_reasonsP$.bind(T, thread);
            $problem_query_semantically_invalid_reason$.bind($str14$unknown_non_wff_reason, thread);
            if (NIL != problem_query_semantically_invalidP(problem_query)) {
                result = $problem_query_semantically_invalid_reason$.getDynamicValue(thread);
            } else {
                result = NIL;
            }
        } finally {
            $problem_query_semantically_invalid_reason$.rebind(_prev_bind_2, thread);
            $gathering_problem_query_semantically_invalid_reasonsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject problem_query_semantically_invalidP(final SubLObject problem_query) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sdc.$ignoring_sdcP$.currentBinding(thread);
        try {
            sdc.$ignoring_sdcP$.bind($problem_query_semantically_invalid_ignores_sdcP$.getDynamicValue(thread), thread);
            SubLObject cdolist_list_var = problem_query;
            SubLObject contextualized_clause = NIL;
            contextualized_clause = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject sense = $NEG;
                SubLObject index_var = ZERO_INTEGER;
                SubLObject cdolist_list_var_$32 = clauses.neg_lits(contextualized_clause);
                SubLObject contextualized_asent = NIL;
                contextualized_asent = cdolist_list_var_$32.first();
                while (NIL != cdolist_list_var_$32) {
                    SubLObject current;
                    final SubLObject datum = current = contextualized_asent;
                    SubLObject mt = NIL;
                    SubLObject asent = NIL;
                    destructuring_bind_must_consp(current, datum, $list7);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list7);
                    asent = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (sense == $POS) {
                            final SubLObject pred = cycl_utilities.sentence_arg0(asent);
                            if ((NIL == cycl_grammar.hl_variable_p(pred)) && (NIL == kb_utilities.kbeq(pred, $$evaluate))) {
                                SubLObject argnum = ZERO_INTEGER;
                                SubLObject cdolist_list_var_$33;
                                final SubLObject args = cdolist_list_var_$33 = cycl_utilities.formula_args(asent, $IGNORE);
                                SubLObject arg = NIL;
                                arg = cdolist_list_var_$33.first();
                                while (NIL != cdolist_list_var_$33) {
                                    argnum = add(argnum, ONE_INTEGER);
                                    if (((((!argnum.isZero()) && (NIL == variables.not_fully_bound_p(arg))) && (NIL == kb_accessors.quoted_argumentP(pred, argnum))) && (NIL == kappa_predicate_p(pred))) && (NIL == at_admitted.admitted_argumentP(arg, argnum, pred, mt_relevance_macros.conservative_constraint_mt(mt)))) {
                                        if (NIL != $gathering_problem_query_semantically_invalid_reasonsP$.getDynamicValue(thread)) {
                                            $problem_query_semantically_invalid_reason$.setDynamicValue(cconcatenate(format_nil.format_nil_a_no_copy(arg), new SubLObject[]{ $$$_is_not_a_valid_arg, format_nil.format_nil_a_no_copy(argnum), $$$_for_, format_nil.format_nil_a_no_copy(pred), $$$_in_, format_nil.format_nil_a_no_copy(mt) }), thread);
                                        }
                                        return values(arg, asent);
                                    }
                                    cdolist_list_var_$33 = cdolist_list_var_$33.rest();
                                    arg = cdolist_list_var_$33.first();
                                } 
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list7);
                    }
                    index_var = add(index_var, ONE_INTEGER);
                    cdolist_list_var_$32 = cdolist_list_var_$32.rest();
                    contextualized_asent = cdolist_list_var_$32.first();
                } 
                sense = $POS;
                index_var = ZERO_INTEGER;
                SubLObject cdolist_list_var_$34 = clauses.pos_lits(contextualized_clause);
                contextualized_asent = NIL;
                contextualized_asent = cdolist_list_var_$34.first();
                while (NIL != cdolist_list_var_$34) {
                    SubLObject current;
                    final SubLObject datum = current = contextualized_asent;
                    SubLObject mt = NIL;
                    SubLObject asent = NIL;
                    destructuring_bind_must_consp(current, datum, $list7);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list7);
                    asent = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (sense == $POS) {
                            final SubLObject pred = cycl_utilities.sentence_arg0(asent);
                            if ((NIL == cycl_grammar.hl_variable_p(pred)) && (NIL == kb_utilities.kbeq(pred, $$evaluate))) {
                                SubLObject argnum = ZERO_INTEGER;
                                SubLObject cdolist_list_var_$35;
                                final SubLObject args = cdolist_list_var_$35 = cycl_utilities.formula_args(asent, $IGNORE);
                                SubLObject arg = NIL;
                                arg = cdolist_list_var_$35.first();
                                while (NIL != cdolist_list_var_$35) {
                                    argnum = add(argnum, ONE_INTEGER);
                                    if (((((!argnum.isZero()) && (NIL == variables.not_fully_bound_p(arg))) && (NIL == kb_accessors.quoted_argumentP(pred, argnum))) && (NIL == kappa_predicate_p(pred))) && (NIL == at_admitted.admitted_argumentP(arg, argnum, pred, mt_relevance_macros.conservative_constraint_mt(mt)))) {
                                        if (NIL != $gathering_problem_query_semantically_invalid_reasonsP$.getDynamicValue(thread)) {
                                            $problem_query_semantically_invalid_reason$.setDynamicValue(cconcatenate(format_nil.format_nil_a_no_copy(arg), new SubLObject[]{ $$$_is_not_a_valid_arg, format_nil.format_nil_a_no_copy(argnum), $$$_for_, format_nil.format_nil_a_no_copy(pred), $$$_in_, format_nil.format_nil_a_no_copy(mt) }), thread);
                                        }
                                        return values(arg, asent);
                                    }
                                    cdolist_list_var_$35 = cdolist_list_var_$35.rest();
                                    arg = cdolist_list_var_$35.first();
                                } 
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list7);
                    }
                    index_var = add(index_var, ONE_INTEGER);
                    cdolist_list_var_$34 = cdolist_list_var_$34.rest();
                    contextualized_asent = cdolist_list_var_$34.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                contextualized_clause = cdolist_list_var.first();
            } 
            final SubLObject variable_constraint_tuples = problem_query_variable_constraint_tuples(problem_query);
            final SubLObject v_variables = list_utilities.tree_gather(variable_constraint_tuples, VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject some_variable_invalidP = NIL;
            if (NIL == some_variable_invalidP) {
                SubLObject csome_list_var = v_variables;
                SubLObject var = NIL;
                var = csome_list_var.first();
                while ((NIL == some_variable_invalidP) && (NIL != csome_list_var)) {
                    final SubLObject tuples_for_this_var = variable_constraint_tuples_for_var(variable_constraint_tuples, var);
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == tuples_for_this_var)) {
                        Errors.error($str21$variable_constraint_tuple_mismatc, var);
                    }
                    if (NIL != variable_semantically_invalidP(tuples_for_this_var)) {
                        if (NIL != $gathering_problem_query_semantically_invalid_reasonsP$.getDynamicValue(thread)) {
                            $problem_query_semantically_invalid_reason$.setDynamicValue(cconcatenate(format_nil.format_nil_a_no_copy(var), new SubLObject[]{ $str22$_is_constrained_to_disjoint_colle, format_nil.format_nil_a_no_copy(tuples_for_this_var) }), thread);
                        }
                        some_variable_invalidP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    var = csome_list_var.first();
                } 
            }
            return some_variable_invalidP;
        } finally {
            sdc.$ignoring_sdcP$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject problem_query_variable_constraint_tuples(final SubLObject problem_query) {
        if (NIL != inference_datastructures_problem_query.single_clause_problem_query_p(problem_query)) {
            final SubLObject dnf = inference_datastructures_problem.problem_query_sole_clause(problem_query);
            return dnf_variable_constraint_tuples(dnf);
        }
        return NIL;
    }

    public static SubLObject dnf_variable_constraint_tuples_internal(SubLObject dnf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != list_utilities.simple_tree_findP($$rdf_type, dnf)) {
            dnf = subst($$isa, $$rdf_type, dnf, UNPROVIDED, UNPROVIDED);
        }
        SubLObject tuples = NIL;
        SubLObject time = NIL;
        final SubLObject time_var = get_internal_real_time();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_relevance_macros.conservative_constraint_mt(mt_relevance_macros.$mt$.getDynamicValue(thread)));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            tuples = remove_if($sym26$THING_TUPLE_, at_var_types.contextualized_dnf_variables_isa_constraint_tuples(dnf, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        return tuples;
    }

    public static SubLObject dnf_variable_constraint_tuples(final SubLObject dnf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return dnf_variable_constraint_tuples_internal(dnf);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, DNF_VARIABLE_CONSTRAINT_TUPLES, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), DNF_VARIABLE_CONSTRAINT_TUPLES, ONE_INTEGER, $int$128, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, DNF_VARIABLE_CONSTRAINT_TUPLES, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, dnf, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(dnf_variable_constraint_tuples_internal(dnf)));
            memoization_state.caching_state_put(caching_state, dnf, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject variable_constraint_tuples_for_var(final SubLObject tuples, final SubLObject var) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = tuples;
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (var.eql(tuple.first())) {
                result = cons(tuple, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject variable_semantically_invalidP(final SubLObject tuples_for_one_variable) {
        final SubLObject collections_set = set.new_set(symbol_function(EQL), UNPROVIDED);
        SubLObject cdolist_list_var = tuples_for_one_variable;
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject var = NIL;
            SubLObject mt = NIL;
            SubLObject collections = NIL;
            destructuring_bind_must_consp(current, datum, $list28);
            var = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list28);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list28);
            collections = current.first();
            current = current.rest();
            if (NIL == current) {
                set_utilities.set_add_all(collections, collections_set);
            } else {
                cdestructuring_bind_error(datum, $list28);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        final SubLObject cols = set.set_element_list(collections_set);
        return disjoint_with.any_disjoint_with_anyP_memoized(cols, cols, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject thing_tupleP(final SubLObject tuple) {
        final SubLObject collections = third(tuple);
        if (collections.equal($list29)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject prune_unknown_sentence_literal_inconsistency_applicability(final SubLObject contextualized_dnf_clause) {
        final SubLObject problem = inference_worker.currently_active_problem();
        if (NIL != inference_worker.currently_active_problem()) {
            SubLObject cdolist_list_var;
            final SubLObject problem_query = cdolist_list_var = inference_datastructures_problem.problem_query(problem);
            SubLObject contextualized_clause = NIL;
            contextualized_clause = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject sense = $NEG;
                SubLObject index_var = ZERO_INTEGER;
                SubLObject cdolist_list_var_$36 = clauses.neg_lits(contextualized_clause);
                SubLObject contextualized_asent = NIL;
                contextualized_asent = cdolist_list_var_$36.first();
                while (NIL != cdolist_list_var_$36) {
                    SubLObject current;
                    final SubLObject datum = current = contextualized_asent;
                    SubLObject mt = NIL;
                    SubLObject asent = NIL;
                    destructuring_bind_must_consp(current, datum, $list7);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list7);
                    asent = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if ($$unknownSentence.eql(cycl_utilities.atomic_sentence_predicate(asent))) {
                            final SubLObject unknown_sentence_asent = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                            SubLObject cdolist_list_var_$37 = problem_query;
                            SubLObject contextualized_clause_$38 = NIL;
                            contextualized_clause_$38 = cdolist_list_var_$37.first();
                            while (NIL != cdolist_list_var_$37) {
                                SubLObject sense2 = $NEG;
                                SubLObject index_var_$39 = ZERO_INTEGER;
                                SubLObject cdolist_list_var_$38 = clauses.neg_lits(contextualized_clause_$38);
                                SubLObject contextualized_asent_$41 = NIL;
                                contextualized_asent_$41 = cdolist_list_var_$38.first();
                                while (NIL != cdolist_list_var_$38) {
                                    SubLObject current_$43;
                                    final SubLObject datum_$42 = current_$43 = contextualized_asent_$41;
                                    SubLObject mt2 = NIL;
                                    SubLObject asent2 = NIL;
                                    destructuring_bind_must_consp(current_$43, datum_$42, $list33);
                                    mt2 = current_$43.first();
                                    current_$43 = current_$43.rest();
                                    destructuring_bind_must_consp(current_$43, datum_$42, $list33);
                                    asent2 = current_$43.first();
                                    current_$43 = current_$43.rest();
                                    if (NIL == current_$43) {
                                        if (asent2.equal(unknown_sentence_asent)) {
                                            return list(clause_utilities.new_total_subclause_spec(contextualized_dnf_clause));
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum_$42, $list33);
                                    }
                                    index_var_$39 = add(index_var_$39, ONE_INTEGER);
                                    cdolist_list_var_$38 = cdolist_list_var_$38.rest();
                                    contextualized_asent_$41 = cdolist_list_var_$38.first();
                                } 
                                sense2 = $POS;
                                SubLObject index_var_$40 = ZERO_INTEGER;
                                SubLObject cdolist_list_var_$39 = clauses.pos_lits(contextualized_clause_$38);
                                SubLObject contextualized_asent_$42 = NIL;
                                contextualized_asent_$42 = cdolist_list_var_$39.first();
                                while (NIL != cdolist_list_var_$39) {
                                    SubLObject current_$44;
                                    final SubLObject datum_$43 = current_$44 = contextualized_asent_$42;
                                    SubLObject mt2 = NIL;
                                    SubLObject asent2 = NIL;
                                    destructuring_bind_must_consp(current_$44, datum_$43, $list33);
                                    mt2 = current_$44.first();
                                    current_$44 = current_$44.rest();
                                    destructuring_bind_must_consp(current_$44, datum_$43, $list33);
                                    asent2 = current_$44.first();
                                    current_$44 = current_$44.rest();
                                    if (NIL == current_$44) {
                                        if (asent2.equal(unknown_sentence_asent)) {
                                            return list(clause_utilities.new_total_subclause_spec(contextualized_dnf_clause));
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum_$43, $list33);
                                    }
                                    index_var_$40 = add(index_var_$40, ONE_INTEGER);
                                    cdolist_list_var_$39 = cdolist_list_var_$39.rest();
                                    contextualized_asent_$42 = cdolist_list_var_$39.first();
                                } 
                                cdolist_list_var_$37 = cdolist_list_var_$37.rest();
                                contextualized_clause_$38 = cdolist_list_var_$37.first();
                            } 
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list7);
                    }
                    index_var = add(index_var, ONE_INTEGER);
                    cdolist_list_var_$36 = cdolist_list_var_$36.rest();
                    contextualized_asent = cdolist_list_var_$36.first();
                } 
                sense = $POS;
                index_var = ZERO_INTEGER;
                SubLObject cdolist_list_var_$40 = clauses.pos_lits(contextualized_clause);
                contextualized_asent = NIL;
                contextualized_asent = cdolist_list_var_$40.first();
                while (NIL != cdolist_list_var_$40) {
                    SubLObject current;
                    final SubLObject datum = current = contextualized_asent;
                    SubLObject mt = NIL;
                    SubLObject asent = NIL;
                    destructuring_bind_must_consp(current, datum, $list7);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list7);
                    asent = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if ($$unknownSentence.eql(cycl_utilities.atomic_sentence_predicate(asent))) {
                            final SubLObject unknown_sentence_asent = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                            SubLObject cdolist_list_var_$41 = problem_query;
                            SubLObject contextualized_clause_$39 = NIL;
                            contextualized_clause_$39 = cdolist_list_var_$41.first();
                            while (NIL != cdolist_list_var_$41) {
                                SubLObject sense2 = $NEG;
                                SubLObject index_var_$41 = ZERO_INTEGER;
                                SubLObject cdolist_list_var_$42 = clauses.neg_lits(contextualized_clause_$39);
                                SubLObject contextualized_asent_$43 = NIL;
                                contextualized_asent_$43 = cdolist_list_var_$42.first();
                                while (NIL != cdolist_list_var_$42) {
                                    SubLObject current_$45;
                                    final SubLObject datum_$44 = current_$45 = contextualized_asent_$43;
                                    SubLObject mt2 = NIL;
                                    SubLObject asent2 = NIL;
                                    destructuring_bind_must_consp(current_$45, datum_$44, $list33);
                                    mt2 = current_$45.first();
                                    current_$45 = current_$45.rest();
                                    destructuring_bind_must_consp(current_$45, datum_$44, $list33);
                                    asent2 = current_$45.first();
                                    current_$45 = current_$45.rest();
                                    if (NIL == current_$45) {
                                        if (asent2.equal(unknown_sentence_asent)) {
                                            return list(clause_utilities.new_total_subclause_spec(contextualized_dnf_clause));
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum_$44, $list33);
                                    }
                                    index_var_$41 = add(index_var_$41, ONE_INTEGER);
                                    cdolist_list_var_$42 = cdolist_list_var_$42.rest();
                                    contextualized_asent_$43 = cdolist_list_var_$42.first();
                                } 
                                sense2 = $POS;
                                SubLObject index_var_$42 = ZERO_INTEGER;
                                SubLObject cdolist_list_var_$43 = clauses.pos_lits(contextualized_clause_$39);
                                SubLObject contextualized_asent_$44 = NIL;
                                contextualized_asent_$44 = cdolist_list_var_$43.first();
                                while (NIL != cdolist_list_var_$43) {
                                    SubLObject current_$46;
                                    final SubLObject datum_$45 = current_$46 = contextualized_asent_$44;
                                    SubLObject mt2 = NIL;
                                    SubLObject asent2 = NIL;
                                    destructuring_bind_must_consp(current_$46, datum_$45, $list33);
                                    mt2 = current_$46.first();
                                    current_$46 = current_$46.rest();
                                    destructuring_bind_must_consp(current_$46, datum_$45, $list33);
                                    asent2 = current_$46.first();
                                    current_$46 = current_$46.rest();
                                    if (NIL == current_$46) {
                                        if (asent2.equal(unknown_sentence_asent)) {
                                            return list(clause_utilities.new_total_subclause_spec(contextualized_dnf_clause));
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum_$45, $list33);
                                    }
                                    index_var_$42 = add(index_var_$42, ONE_INTEGER);
                                    cdolist_list_var_$43 = cdolist_list_var_$43.rest();
                                    contextualized_asent_$44 = cdolist_list_var_$43.first();
                                } 
                                cdolist_list_var_$41 = cdolist_list_var_$41.rest();
                                contextualized_clause_$39 = cdolist_list_var_$41.first();
                            } 
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list7);
                    }
                    index_var = add(index_var, ONE_INTEGER);
                    cdolist_list_var_$40 = cdolist_list_var_$40.rest();
                    contextualized_asent = cdolist_list_var_$40.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                contextualized_clause = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject prune_unknown_sentence_literal_inconsistency_expand(final SubLObject contextualized_dnf_clause) {
        if (NIL != inference_worker.currently_active_problem()) {
            inference_worker.make_problem_no_good(inference_worker.currently_active_problem(), NIL, $TACTICAL);
        }
        return NIL;
    }

    public static SubLObject prune_rt_problems_applicable_when_typed_only_when_specialization_applicability(final SubLObject contextualized_dnf_clause) {
        final SubLObject problem = inference_worker.currently_active_problem();
        if (NIL != inference_worker.currently_active_problem()) {
            final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
            final SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var);
            while (NIL == set_contents.do_set_contents_doneP(basis_object, state)) {
                final SubLObject link = set_contents.do_set_contents_next(basis_object, state);
                if ((NIL != set_contents.do_set_contents_element_validP(state, link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, $RESIDUAL_TRANSFORMATION))) {
                    final SubLObject jo_link = inference_worker_residual_transformation.residual_transformation_link_motivating_join_ordered_link(link);
                    final SubLObject transformation_link = inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(link);
                    if (NIL != transformation_non_applicable_due_to_rule_type_contraint_meta_assertionP(jo_link, transformation_link)) {
                        return list(clause_utilities.new_total_subclause_spec(contextualized_dnf_clause));
                    }
                    return NIL;
                } else {
                    state = set_contents.do_set_contents_update_state(state);
                }
            } 
        }
        return NIL;
    }

    public static SubLObject transformation_non_applicable_due_to_rule_type_contraint_meta_assertionP(final SubLObject join_ordered_link, final SubLObject transformation_link) {
        final SubLObject rule_assertion = inference_worker_transformation.transformation_link_rule_assertion(transformation_link);
        if (NIL != somewhere_cache.some_pred_assertion_somewhereP($const39$applicableWhenTypedOnlyWhenSpecia, rule_assertion, THREE_INTEGER, UNPROVIDED)) {
            final SubLObject awtows_el_var_col_pairs = kb_mapping_utilities.pred_value_tuples(rule_assertion, $const39$applicableWhenTypedOnlyWhenSpecia, THREE_INTEGER, $list40, UNPROVIDED);
            if (NIL != awtows_el_var_col_pairs) {
                SubLObject cdolist_list_var = awtows_el_var_col_pairs;
                SubLObject awtows_el_var_col_pair = NIL;
                awtows_el_var_col_pair = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject awtows_el_var = awtows_el_var_col_pair.first();
                    final SubLObject awtows_col = second(awtows_el_var_col_pair);
                    final SubLObject transformation_link_bindings = inference_worker_transformation.transformation_link_bindings(transformation_link);
                    final SubLObject rule_assertion_variable_map = inference_worker_transformation.rule_assertion_variable_map(rule_assertion);
                    final SubLObject jo_link_focal_to_supp_bindings = inference_worker_join_ordered.join_ordered_link_focal_to_supported_variable_map(join_ordered_link);
                    final SubLObject jo_link_non_focal_to_supp_bindings = inference_worker_join_ordered.join_ordered_link_non_focal_to_supported_variable_map(join_ordered_link);
                    final SubLObject transformation_link_bindings_with_rule_el_variables = bindings.apply_bindings_backwards(rule_assertion_variable_map, transformation_link_bindings);
                    final SubLObject jo_link_focal_problem_hl_var = bindings.apply_bindings_backwards(transformation_link_bindings_with_rule_el_variables, awtows_el_var);
                    final SubLObject jo_link_supported_problem_hl_var = bindings.apply_bindings(jo_link_focal_to_supp_bindings, jo_link_focal_problem_hl_var);
                    final SubLObject jo_link_non_focal_problem_hl_var = bindings.apply_bindings_backwards(jo_link_non_focal_to_supp_bindings, jo_link_supported_problem_hl_var);
                    final SubLObject jo_link_non_focal_problem = inference_worker_join_ordered.join_ordered_link_non_focal_problem(join_ordered_link);
                    final SubLObject jo_link_non_focal_problem_query = inference_datastructures_problem.problem_query(jo_link_non_focal_problem);
                    SubLObject found_type_literalP = NIL;
                    SubLObject some_type_literal_spec_of_colP = NIL;
                    SubLObject cdolist_list_var_$62 = jo_link_non_focal_problem_query;
                    SubLObject contextualized_clause = NIL;
                    contextualized_clause = cdolist_list_var_$62.first();
                    while (NIL != cdolist_list_var_$62) {
                        SubLObject literal_sense = $NEG;
                        SubLObject index_var = ZERO_INTEGER;
                        SubLObject cdolist_list_var_$63 = clauses.neg_lits(contextualized_clause);
                        SubLObject contextualized_asent = NIL;
                        contextualized_asent = cdolist_list_var_$63.first();
                        while (NIL != cdolist_list_var_$63) {
                            SubLObject current;
                            final SubLObject datum = current = contextualized_asent;
                            SubLObject mt = NIL;
                            SubLObject asent = NIL;
                            destructuring_bind_must_consp(current, datum, $list7);
                            mt = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list7);
                            asent = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
                                final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                                final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                                if (((pred.eql($$isa) || pred.eql($$rdf_type)) && arg1.eql(jo_link_non_focal_problem_hl_var)) && (NIL != term.el_fort_p(arg2))) {
                                    found_type_literalP = T;
                                    if (NIL != genls.genlsP(arg2, awtows_col, UNPROVIDED, UNPROVIDED)) {
                                        some_type_literal_spec_of_colP = T;
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list7);
                            }
                            index_var = add(index_var, ONE_INTEGER);
                            cdolist_list_var_$63 = cdolist_list_var_$63.rest();
                            contextualized_asent = cdolist_list_var_$63.first();
                        } 
                        literal_sense = $POS;
                        index_var = ZERO_INTEGER;
                        SubLObject cdolist_list_var_$64 = clauses.pos_lits(contextualized_clause);
                        contextualized_asent = NIL;
                        contextualized_asent = cdolist_list_var_$64.first();
                        while (NIL != cdolist_list_var_$64) {
                            SubLObject current;
                            final SubLObject datum = current = contextualized_asent;
                            SubLObject mt = NIL;
                            SubLObject asent = NIL;
                            destructuring_bind_must_consp(current, datum, $list7);
                            mt = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list7);
                            asent = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
                                final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                                final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                                if (((pred.eql($$isa) || pred.eql($$rdf_type)) && arg1.eql(jo_link_non_focal_problem_hl_var)) && (NIL != term.el_fort_p(arg2))) {
                                    found_type_literalP = T;
                                    if (NIL != genls.genlsP(arg2, awtows_col, UNPROVIDED, UNPROVIDED)) {
                                        some_type_literal_spec_of_colP = T;
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list7);
                            }
                            index_var = add(index_var, ONE_INTEGER);
                            cdolist_list_var_$64 = cdolist_list_var_$64.rest();
                            contextualized_asent = cdolist_list_var_$64.first();
                        } 
                        cdolist_list_var_$62 = cdolist_list_var_$62.rest();
                        contextualized_clause = cdolist_list_var_$62.first();
                    } 
                    if (NIL != found_type_literalP) {
                        return makeBoolean(NIL == some_type_literal_spec_of_colP);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    awtows_el_var_col_pair = cdolist_list_var.first();
                } 
            }
        }
        return NIL;
    }

    public static SubLObject prune_rt_problems_applicable_when_typed_only_when_specialization_expand(final SubLObject contextualized_dnf_clause) {
        if (NIL != inference_worker.currently_active_problem()) {
            inference_worker.make_problem_no_good(inference_worker.currently_active_problem(), NIL, $TACTICAL);
        }
        return NIL;
    }

    public static SubLObject prune_circular_term_of_unit_applicability(final SubLObject contextualized_dnf_clause) {
        if (NIL != inference_worker.currently_active_problem()) {
            SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
            SubLObject contextualized_poslit = NIL;
            contextualized_poslit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = contextualized_poslit;
                SubLObject mt = NIL;
                SubLObject asent = NIL;
                destructuring_bind_must_consp(current, datum, $list7);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list7);
                asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != tou_litP(asent)) {
                        final SubLObject var = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                        if (NIL != list_utilities.tree_find(var, cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                            return list(clause_utilities.new_total_subclause_spec(contextualized_dnf_clause));
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list7);
                }
                cdolist_list_var = cdolist_list_var.rest();
                contextualized_poslit = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject prune_circular_term_of_unit_expand(final SubLObject contextualized_dnf_clause) {
        if (NIL != inference_worker.currently_active_problem()) {
            inference_worker.make_problem_no_good(inference_worker.currently_active_problem(), NIL, $TACTICAL);
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_conjunctive_pruning_file() {
        declareFunction(me, "conjunctive_pruning_module_p", "CONJUNCTIVE-PRUNING-MODULE-P", 1, 0, false);
        declareFunction(me, "conjunctive_pruning_tactic_p", "CONJUNCTIVE-PRUNING-TACTIC-P", 1, 0, false);
        declareFunction(me, "supporting_residual_conjunction_problem_minimal_problem_query", "SUPPORTING-RESIDUAL-CONJUNCTION-PROBLEM-MINIMAL-PROBLEM-QUERY", 1, 1, false);
        declareFunction(me, "supporting_residual_conjunction_problem_minimal_problem_query_int_internal", "SUPPORTING-RESIDUAL-CONJUNCTION-PROBLEM-MINIMAL-PROBLEM-QUERY-INT-INTERNAL", 1, 1, false);
        declareFunction(me, "supporting_residual_conjunction_problem_minimal_problem_query_int", "SUPPORTING-RESIDUAL-CONJUNCTION-PROBLEM-MINIMAL-PROBLEM-QUERY-INT", 1, 1, false);
        declareFunction(me, "prune_non_wff_conjunction_applicability", "PRUNE-NON-WFF-CONJUNCTION-APPLICABILITY", 1, 0, false);
        new removal_modules_conjunctive_pruning.$prune_non_wff_conjunction_applicability$UnaryFunction();
        declareFunction(me, "prune_non_wff_conjunction_expand", "PRUNE-NON-WFF-CONJUNCTION-EXPAND", 1, 0, false);
        declareFunction(me, "problem_is_a_topological_mergingP", "PROBLEM-IS-A-TOPOLOGICAL-MERGING?", 1, 0, false);
        declareFunction(me, "why_problem_query_semantically_invalid", "WHY-PROBLEM-QUERY-SEMANTICALLY-INVALID", 1, 0, false);
        declareFunction(me, "problem_query_semantically_invalidP", "PROBLEM-QUERY-SEMANTICALLY-INVALID?", 1, 0, false);
        declareFunction(me, "problem_query_variable_constraint_tuples", "PROBLEM-QUERY-VARIABLE-CONSTRAINT-TUPLES", 1, 0, false);
        declareFunction(me, "dnf_variable_constraint_tuples_internal", "DNF-VARIABLE-CONSTRAINT-TUPLES-INTERNAL", 1, 0, false);
        declareFunction(me, "dnf_variable_constraint_tuples", "DNF-VARIABLE-CONSTRAINT-TUPLES", 1, 0, false);
        declareFunction(me, "variable_constraint_tuples_for_var", "VARIABLE-CONSTRAINT-TUPLES-FOR-VAR", 2, 0, false);
        declareFunction(me, "variable_semantically_invalidP", "VARIABLE-SEMANTICALLY-INVALID?", 1, 0, false);
        declareFunction(me, "thing_tupleP", "THING-TUPLE?", 1, 0, false);
        new removal_modules_conjunctive_pruning.$thing_tupleP$UnaryFunction();
        declareFunction(me, "prune_unknown_sentence_literal_inconsistency_applicability", "PRUNE-UNKNOWN-SENTENCE-LITERAL-INCONSISTENCY-APPLICABILITY", 1, 0, false);
        new removal_modules_conjunctive_pruning.$prune_unknown_sentence_literal_inconsistency_applicability$UnaryFunction();
        declareFunction(me, "prune_unknown_sentence_literal_inconsistency_expand", "PRUNE-UNKNOWN-SENTENCE-LITERAL-INCONSISTENCY-EXPAND", 1, 0, false);
        declareFunction(me, "prune_rt_problems_applicable_when_typed_only_when_specialization_applicability", "PRUNE-RT-PROBLEMS-APPLICABLE-WHEN-TYPED-ONLY-WHEN-SPECIALIZATION-APPLICABILITY", 1, 0, false);
        declareFunction(me, "transformation_non_applicable_due_to_rule_type_contraint_meta_assertionP", "TRANSFORMATION-NON-APPLICABLE-DUE-TO-RULE-TYPE-CONTRAINT-META-ASSERTION?", 2, 0, false);
        declareFunction(me, "prune_rt_problems_applicable_when_typed_only_when_specialization_expand", "PRUNE-RT-PROBLEMS-APPLICABLE-WHEN-TYPED-ONLY-WHEN-SPECIALIZATION-EXPAND", 1, 0, false);
        declareFunction(me, "prune_circular_term_of_unit_applicability", "PRUNE-CIRCULAR-TERM-OF-UNIT-APPLICABILITY", 1, 0, false);
        declareFunction(me, "prune_circular_term_of_unit_expand", "PRUNE-CIRCULAR-TERM-OF-UNIT-EXPAND", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_conjunctive_pruning_file() {
        deflexical("*CONJUNCTIVE-PRUNING-MODULE-NAMES*", $list0);
        defparameter("*PRUNE-ROOT-PROBLEM-OF-SOME-INFERENCE-NON-WFF-CONJUNCTION?*", T);
        defparameter("*GATHERING-PROBLEM-QUERY-SEMANTICALLY-INVALID-REASONS?*", NIL);
        defparameter("*PROBLEM-QUERY-SEMANTICALLY-INVALID-REASON*", $UNINITIALIZED);
        defparameter("*PROBLEM-QUERY-SEMANTICALLY-INVALID-IGNORES-SDC?*", T);
        return NIL;
    }

    public static SubLObject setup_removal_modules_conjunctive_pruning_file() {
        inference_modules.inference_conjunctive_removal_module($PRUNE_NON_WFF_CONJUNCTION, $list2);
        memoization_state.note_memoized_function(SUPPORTING_RESIDUAL_CONJUNCTION_PROBLEM_MINIMAL_PROBLEM_QUERY_INT);
        note_funcall_helper_function(PRUNE_NON_WFF_CONJUNCTION_APPLICABILITY);
        note_funcall_helper_function(PRUNE_NON_WFF_CONJUNCTION_EXPAND);
        memoization_state.note_memoized_function(DNF_VARIABLE_CONSTRAINT_TUPLES);
        inference_modules.inference_conjunctive_removal_module($PRUNE_UNKNOWN_SENTENCE_LITERAL_INCONSISTENCY, $list31);
        note_funcall_helper_function(PRUNE_UNKNOWN_SENTENCE_LITERAL_INCONSISTENCY_APPLICABILITY);
        note_funcall_helper_function(PRUNE_UNKNOWN_SENTENCE_LITERAL_INCONSISTENCY_EXPAND);
        inference_modules.inference_conjunctive_removal_module($PRUNE_RT_PROBLEMS_APPLICABLE_WHEN_TYPED_ONLY_WHEN_SPECIALIZATION, $list37);
        note_funcall_helper_function($sym38$PRUNE_RT_PROBLEMS_APPLICABLE_WHEN_TYPED_ONLY_WHEN_SPECIALIZATION_);
        note_funcall_helper_function($sym41$PRUNE_RT_PROBLEMS_APPLICABLE_WHEN_TYPED_ONLY_WHEN_SPECIALIZATION_);
        inference_modules.inference_conjunctive_removal_module($PRUNE_CIRCULAR_TERM_OF_UNIT, $list43);
        note_funcall_helper_function(PRUNE_CIRCULAR_TERM_OF_UNIT_APPLICABILITY);
        note_funcall_helper_function(PRUNE_CIRCULAR_TERM_OF_UNIT_EXPAND);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_conjunctive_pruning_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_conjunctive_pruning_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_conjunctive_pruning_file();
    }

    

    public static final class $prune_non_wff_conjunction_applicability$UnaryFunction extends UnaryFunction {
        public $prune_non_wff_conjunction_applicability$UnaryFunction() {
            super(extractFunctionNamed("PRUNE-NON-WFF-CONJUNCTION-APPLICABILITY"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return prune_non_wff_conjunction_applicability(arg1);
        }
    }

    public static final class $thing_tupleP$UnaryFunction extends UnaryFunction {
        public $thing_tupleP$UnaryFunction() {
            super(extractFunctionNamed("THING-TUPLE?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return thing_tupleP(arg1);
        }
    }

    public static final class $prune_unknown_sentence_literal_inconsistency_applicability$UnaryFunction extends UnaryFunction {
        public $prune_unknown_sentence_literal_inconsistency_applicability$UnaryFunction() {
            super(extractFunctionNamed("PRUNE-UNKNOWN-SENTENCE-LITERAL-INCONSISTENCY-APPLICABILITY"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return prune_unknown_sentence_literal_inconsistency_applicability(arg1);
        }
    }
}

/**
 * Total time: 364 ms
 */
