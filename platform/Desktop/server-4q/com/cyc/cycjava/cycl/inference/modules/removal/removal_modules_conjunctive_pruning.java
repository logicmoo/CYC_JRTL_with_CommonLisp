package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.term;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.somewhere_cache;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.cycjava.cycl.disjoint_with;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.cycjava.cycl.at_var_types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.at_admitted;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.sdc;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_split;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_restriction;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.unification;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_conjunctive_pruning extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conjunctive_pruning";
    public static final String myFingerPrint = "e76c9bd3eac3d512d4982d6c628b0eec6fadcfab73b0064d4a4177f37b2d33e5";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 1020L)
    private static SubLSymbol $conjunctive_pruning_module_names$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 5602L)
    private static SubLSymbol $prune_root_problem_of_some_inference_non_wff_conjunctionP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 7117L)
    private static SubLSymbol $gathering_problem_query_semantically_invalid_reasonsP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 7308L)
    private static SubLSymbol $problem_query_semantically_invalid_reason$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 7923L)
    private static SubLSymbol $problem_query_semantically_invalid_ignores_sdcP$;
    private static final SubLList $list0;
    private static final SubLSymbol $kw1$PRUNE_NON_WFF_CONJUNCTION;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$SUPPORTING_RESIDUAL_CONJUNCTION_PROBLEM_MINIMAL_PROBLEM_QUERY_INT;
    private static final SubLSymbol $kw4$RESIDUAL_TRANSFORMATION;
    private static final SubLSymbol $sym5$VARIABLE_P;
    private static final SubLSymbol $kw6$NEG;
    private static final SubLList $list7;
    private static final SubLSymbol $kw8$POS;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$PRUNE_NON_WFF_CONJUNCTION_APPLICABILITY;
    private static final SubLSymbol $kw11$TACTICAL;
    private static final SubLSymbol $sym12$PRUNE_NON_WFF_CONJUNCTION_EXPAND;
    private static final SubLSymbol $kw13$UNINITIALIZED;
    private static final SubLString $str14$unknown_non_wff_reason;
    private static final SubLObject $const15$evaluate;
    private static final SubLSymbol $kw16$IGNORE;
    private static final SubLString $str17$_is_not_a_valid_arg;
    private static final SubLString $str18$_for_;
    private static final SubLString $str19$_in_;
    private static final SubLSymbol $sym20$_EXIT;
    private static final SubLString $str21$variable_constraint_tuple_mismatc;
    private static final SubLString $str22$_is_constrained_to_disjoint_colle;
    private static final SubLSymbol $sym23$DNF_VARIABLE_CONSTRAINT_TUPLES;
    private static final SubLObject $const24$rdf_type;
    private static final SubLObject $const25$isa;
    private static final SubLSymbol $sym26$THING_TUPLE_;
    private static final SubLInteger $int27$128;
    private static final SubLList $list28;
    private static final SubLList $list29;
    private static final SubLSymbol $kw30$PRUNE_UNKNOWN_SENTENCE_LITERAL_INCONSISTENCY;
    private static final SubLList $list31;
    private static final SubLObject $const32$unknownSentence;
    private static final SubLList $list33;
    private static final SubLSymbol $sym34$PRUNE_UNKNOWN_SENTENCE_LITERAL_INCONSISTENCY_APPLICABILITY;
    private static final SubLSymbol $sym35$PRUNE_UNKNOWN_SENTENCE_LITERAL_INCONSISTENCY_EXPAND;
    private static final SubLSymbol $kw36$PRUNE_RT_PROBLEMS_APPLICABLE_WHEN_TYPED_ONLY_WHEN_SPECIALIZATION;
    private static final SubLList $list37;
    private static final SubLSymbol $sym38$PRUNE_RT_PROBLEMS_APPLICABLE_WHEN_TYPED_ONLY_WHEN_SPECIALIZATION_;
    private static final SubLObject $const39$applicableWhenTypedOnlyWhenSpecia;
    private static final SubLList $list40;
    private static final SubLSymbol $sym41$PRUNE_RT_PROBLEMS_APPLICABLE_WHEN_TYPED_ONLY_WHEN_SPECIALIZATION_;
    private static final SubLSymbol $kw42$PRUNE_CIRCULAR_TERM_OF_UNIT;
    private static final SubLList $list43;
    private static final SubLSymbol $sym44$PRUNE_CIRCULAR_TERM_OF_UNIT_APPLICABILITY;
    private static final SubLSymbol $sym45$PRUNE_CIRCULAR_TERM_OF_UNIT_EXPAND;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 1469L)
    public static SubLObject conjunctive_pruning_module_p(final SubLObject hl_module) {
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_conjunctive_pruning.NIL != inference_modules.hl_module_p(hl_module) && removal_modules_conjunctive_pruning.NIL != subl_promotions.memberP(inference_modules.hl_module_name(hl_module), removal_modules_conjunctive_pruning.$conjunctive_pruning_module_names$.getGlobalValue(), (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 1644L)
    public static SubLObject conjunctive_pruning_tactic_p(final SubLObject tactic) {
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_conjunctive_pruning.NIL != inference_datastructures_tactic.tactic_p(tactic) && removal_modules_conjunctive_pruning.NIL != conjunctive_pruning_module_p(inference_datastructures_tactic.tactic_hl_module(tactic)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 2470L)
    public static SubLObject supporting_residual_conjunction_problem_minimal_problem_query(final SubLObject problem, SubLObject add_isomophic_literalsP) {
        if (add_isomophic_literalsP == removal_modules_conjunctive_pruning.UNPROVIDED) {
            add_isomophic_literalsP = (SubLObject)removal_modules_conjunctive_pruning.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_modules_conjunctive_pruning.NIL;
        final SubLObject local_state = inference_datastructures_problem.problem_memoization_state(problem);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                result = supporting_residual_conjunction_problem_minimal_problem_query_int(problem, add_isomophic_literalsP);
            }
            finally {
                final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_conjunctive_pruning.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 2800L)
    public static SubLObject supporting_residual_conjunction_problem_minimal_problem_query_int_internal(final SubLObject problem, SubLObject add_isomophic_literalsP) {
        if (add_isomophic_literalsP == removal_modules_conjunctive_pruning.UNPROVIDED) {
            add_isomophic_literalsP = (SubLObject)removal_modules_conjunctive_pruning.NIL;
        }
        final SubLObject original_problem_query = inference_datastructures_problem.problem_query(problem);
        SubLObject result_problem_query = inference_datastructures_problem.problem_query(problem);
        SubLObject relevant_hl_vars = (SubLObject)removal_modules_conjunctive_pruning.NIL;
        SubLObject doneP = (SubLObject)removal_modules_conjunctive_pruning.NIL;
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        SubLObject residual_problem_query;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)removal_modules_conjunctive_pruning.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); removal_modules_conjunctive_pruning.NIL == doneP && removal_modules_conjunctive_pruning.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (removal_modules_conjunctive_pruning.NIL != set_contents.do_set_contents_element_validP(state, link) && removal_modules_conjunctive_pruning.NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, (SubLObject)removal_modules_conjunctive_pruning.$kw4$RESIDUAL_TRANSFORMATION)) {
                doneP = (SubLObject)removal_modules_conjunctive_pruning.T;
                residual_problem_query = bindings.apply_bindings_backwards(inference_worker_residual_transformation.residual_transformation_link_supporting_variable_map(link), inference_datastructures_problem.problem_query(inference_worker_residual_transformation.residual_transformation_link_residual_problem(link)));
                relevant_hl_vars = list_utilities.tree_gather(residual_problem_query, (SubLObject)removal_modules_conjunctive_pruning.$sym5$VARIABLE_P, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED);
            }
        }
        if (removal_modules_conjunctive_pruning.NIL != relevant_hl_vars) {
            SubLObject new_problem_query_sweep_1 = (SubLObject)removal_modules_conjunctive_pruning.NIL;
            SubLObject cdolist_list_var = original_problem_query;
            SubLObject contextualized_clause = (SubLObject)removal_modules_conjunctive_pruning.NIL;
            contextualized_clause = cdolist_list_var.first();
            while (removal_modules_conjunctive_pruning.NIL != cdolist_list_var) {
                SubLObject sense = (SubLObject)removal_modules_conjunctive_pruning.$kw6$NEG;
                SubLObject index_var = (SubLObject)removal_modules_conjunctive_pruning.ZERO_INTEGER;
                SubLObject cdolist_list_var_$2 = clauses.neg_lits(contextualized_clause);
                SubLObject contextualized_asent = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                contextualized_asent = cdolist_list_var_$2.first();
                while (removal_modules_conjunctive_pruning.NIL != cdolist_list_var_$2) {
                    SubLObject current;
                    final SubLObject datum = current = contextualized_asent;
                    SubLObject mt = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                    SubLObject asent = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_conjunctive_pruning.$list7);
                    mt = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_conjunctive_pruning.$list7);
                    asent = current.first();
                    current = current.rest();
                    if (removal_modules_conjunctive_pruning.NIL == current) {
                        if (removal_modules_conjunctive_pruning.NIL != list_utilities.tree_find_any(relevant_hl_vars, asent, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED)) {
                            new_problem_query_sweep_1 = (SubLObject)ConsesLow.cons(inference_datastructures_problem_query.make_contextualized_asent(mt, asent), new_problem_query_sweep_1);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_conjunctive_pruning.$list7);
                    }
                    index_var = Numbers.add(index_var, (SubLObject)removal_modules_conjunctive_pruning.ONE_INTEGER);
                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                    contextualized_asent = cdolist_list_var_$2.first();
                }
                sense = (SubLObject)removal_modules_conjunctive_pruning.$kw8$POS;
                index_var = (SubLObject)removal_modules_conjunctive_pruning.ZERO_INTEGER;
                SubLObject cdolist_list_var_$3 = clauses.pos_lits(contextualized_clause);
                contextualized_asent = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                contextualized_asent = cdolist_list_var_$3.first();
                while (removal_modules_conjunctive_pruning.NIL != cdolist_list_var_$3) {
                    SubLObject current;
                    final SubLObject datum = current = contextualized_asent;
                    SubLObject mt = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                    SubLObject asent = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_conjunctive_pruning.$list7);
                    mt = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_conjunctive_pruning.$list7);
                    asent = current.first();
                    current = current.rest();
                    if (removal_modules_conjunctive_pruning.NIL == current) {
                        if (removal_modules_conjunctive_pruning.NIL != list_utilities.tree_find_any(relevant_hl_vars, asent, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED)) {
                            new_problem_query_sweep_1 = (SubLObject)ConsesLow.cons(inference_datastructures_problem_query.make_contextualized_asent(mt, asent), new_problem_query_sweep_1);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_conjunctive_pruning.$list7);
                    }
                    index_var = Numbers.add(index_var, (SubLObject)removal_modules_conjunctive_pruning.ONE_INTEGER);
                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                    contextualized_asent = cdolist_list_var_$3.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                contextualized_clause = cdolist_list_var.first();
            }
            if (removal_modules_conjunctive_pruning.NIL != new_problem_query_sweep_1) {
                result_problem_query = inference_datastructures_problem_query.new_problem_query_from_contextualized_clause(clauses.make_clause((SubLObject)removal_modules_conjunctive_pruning.NIL, new_problem_query_sweep_1));
                if (removal_modules_conjunctive_pruning.NIL != add_isomophic_literalsP) {
                    SubLObject new_problem_query_sweep_2 = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                    SubLObject cdolist_list_var2 = original_problem_query;
                    SubLObject contextualized_clause2 = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                    contextualized_clause2 = cdolist_list_var2.first();
                    while (removal_modules_conjunctive_pruning.NIL != cdolist_list_var2) {
                        SubLObject sense2 = (SubLObject)removal_modules_conjunctive_pruning.$kw6$NEG;
                        SubLObject index_var2 = (SubLObject)removal_modules_conjunctive_pruning.ZERO_INTEGER;
                        SubLObject cdolist_list_var_$4 = clauses.neg_lits(contextualized_clause2);
                        SubLObject contextualized_asent2 = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                        contextualized_asent2 = cdolist_list_var_$4.first();
                        while (removal_modules_conjunctive_pruning.NIL != cdolist_list_var_$4) {
                            SubLObject current2;
                            final SubLObject datum2 = current2 = contextualized_asent2;
                            SubLObject mt2 = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                            SubLObject asent2 = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)removal_modules_conjunctive_pruning.$list7);
                            mt2 = current2.first();
                            current2 = current2.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)removal_modules_conjunctive_pruning.$list7);
                            asent2 = current2.first();
                            current2 = current2.rest();
                            if (removal_modules_conjunctive_pruning.NIL == current2) {
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
                                for (doneP2 = (SubLObject)removal_modules_conjunctive_pruning.NIL, rest = (SubLObject)removal_modules_conjunctive_pruning.NIL, rest = result_problem_query; removal_modules_conjunctive_pruning.NIL == doneP2 && removal_modules_conjunctive_pruning.NIL != rest; rest = rest.rest()) {
                                    contextualized_clause_$5 = rest.first();
                                    sense_sweep_1 = (SubLObject)removal_modules_conjunctive_pruning.$kw6$NEG;
                                    index_var_$6 = (SubLObject)removal_modules_conjunctive_pruning.ZERO_INTEGER;
                                    cdolist_list_var_$5 = clauses.neg_lits(contextualized_clause_$5);
                                    contextualized_asent_$8 = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                                    contextualized_asent_$8 = cdolist_list_var_$5.first();
                                    while (removal_modules_conjunctive_pruning.NIL != cdolist_list_var_$5) {
                                        datum_$9 = (current_$10 = contextualized_asent_$8);
                                        mt_sweep_1 = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                                        asent_sweep_1 = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current_$10, datum_$9, (SubLObject)removal_modules_conjunctive_pruning.$list9);
                                        mt_sweep_1 = current_$10.first();
                                        current_$10 = current_$10.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current_$10, datum_$9, (SubLObject)removal_modules_conjunctive_pruning.$list9);
                                        asent_sweep_1 = current_$10.first();
                                        current_$10 = current_$10.rest();
                                        if (removal_modules_conjunctive_pruning.NIL == current_$10) {
                                            if (mt2.equal(mt_sweep_1) && (asent2.equal(asent_sweep_1) || removal_modules_conjunctive_pruning.NIL != unification.unify(asent2, asent_sweep_1, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED))) {
                                                item_var = inference_datastructures_problem_query.make_contextualized_asent(mt2, asent2);
                                                if (removal_modules_conjunctive_pruning.NIL == conses_high.member(item_var, new_problem_query_sweep_2, (SubLObject)removal_modules_conjunctive_pruning.EQUAL, Symbols.symbol_function((SubLObject)removal_modules_conjunctive_pruning.IDENTITY))) {
                                                    new_problem_query_sweep_2 = (SubLObject)ConsesLow.cons(item_var, new_problem_query_sweep_2);
                                                }
                                                doneP2 = (SubLObject)removal_modules_conjunctive_pruning.T;
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum_$9, (SubLObject)removal_modules_conjunctive_pruning.$list9);
                                        }
                                        index_var_$6 = Numbers.add(index_var_$6, (SubLObject)removal_modules_conjunctive_pruning.ONE_INTEGER);
                                        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                                        contextualized_asent_$8 = cdolist_list_var_$5.first();
                                    }
                                    sense_sweep_1 = (SubLObject)removal_modules_conjunctive_pruning.$kw8$POS;
                                    index_var_$7 = (SubLObject)removal_modules_conjunctive_pruning.ZERO_INTEGER;
                                    cdolist_list_var_$6 = clauses.pos_lits(contextualized_clause_$5);
                                    contextualized_asent_$9 = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                                    contextualized_asent_$9 = cdolist_list_var_$6.first();
                                    while (removal_modules_conjunctive_pruning.NIL != cdolist_list_var_$6) {
                                        datum_$10 = (current_$11 = contextualized_asent_$9);
                                        mt_sweep_1 = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                                        asent_sweep_1 = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current_$11, datum_$10, (SubLObject)removal_modules_conjunctive_pruning.$list9);
                                        mt_sweep_1 = current_$11.first();
                                        current_$11 = current_$11.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current_$11, datum_$10, (SubLObject)removal_modules_conjunctive_pruning.$list9);
                                        asent_sweep_1 = current_$11.first();
                                        current_$11 = current_$11.rest();
                                        if (removal_modules_conjunctive_pruning.NIL == current_$11) {
                                            if (mt2.equal(mt_sweep_1) && (asent2.equal(asent_sweep_1) || removal_modules_conjunctive_pruning.NIL != unification.unify(asent2, asent_sweep_1, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED))) {
                                                item_var = inference_datastructures_problem_query.make_contextualized_asent(mt2, asent2);
                                                if (removal_modules_conjunctive_pruning.NIL == conses_high.member(item_var, new_problem_query_sweep_2, (SubLObject)removal_modules_conjunctive_pruning.EQUAL, Symbols.symbol_function((SubLObject)removal_modules_conjunctive_pruning.IDENTITY))) {
                                                    new_problem_query_sweep_2 = (SubLObject)ConsesLow.cons(item_var, new_problem_query_sweep_2);
                                                }
                                                doneP2 = (SubLObject)removal_modules_conjunctive_pruning.T;
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum_$10, (SubLObject)removal_modules_conjunctive_pruning.$list9);
                                        }
                                        index_var_$7 = Numbers.add(index_var_$7, (SubLObject)removal_modules_conjunctive_pruning.ONE_INTEGER);
                                        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                                        contextualized_asent_$9 = cdolist_list_var_$6.first();
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)removal_modules_conjunctive_pruning.$list7);
                            }
                            index_var2 = Numbers.add(index_var2, (SubLObject)removal_modules_conjunctive_pruning.ONE_INTEGER);
                            cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                            contextualized_asent2 = cdolist_list_var_$4.first();
                        }
                        sense2 = (SubLObject)removal_modules_conjunctive_pruning.$kw8$POS;
                        index_var2 = (SubLObject)removal_modules_conjunctive_pruning.ZERO_INTEGER;
                        SubLObject cdolist_list_var_$7 = clauses.pos_lits(contextualized_clause2);
                        contextualized_asent2 = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                        contextualized_asent2 = cdolist_list_var_$7.first();
                        while (removal_modules_conjunctive_pruning.NIL != cdolist_list_var_$7) {
                            SubLObject current2;
                            final SubLObject datum2 = current2 = contextualized_asent2;
                            SubLObject mt2 = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                            SubLObject asent2 = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)removal_modules_conjunctive_pruning.$list7);
                            mt2 = current2.first();
                            current2 = current2.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)removal_modules_conjunctive_pruning.$list7);
                            asent2 = current2.first();
                            current2 = current2.rest();
                            if (removal_modules_conjunctive_pruning.NIL == current2) {
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
                                for (doneP2 = (SubLObject)removal_modules_conjunctive_pruning.NIL, rest = (SubLObject)removal_modules_conjunctive_pruning.NIL, rest = result_problem_query; removal_modules_conjunctive_pruning.NIL == doneP2 && removal_modules_conjunctive_pruning.NIL != rest; rest = rest.rest()) {
                                    contextualized_clause_$6 = rest.first();
                                    sense_sweep_1 = (SubLObject)removal_modules_conjunctive_pruning.$kw6$NEG;
                                    index_var_$8 = (SubLObject)removal_modules_conjunctive_pruning.ZERO_INTEGER;
                                    cdolist_list_var_$8 = clauses.neg_lits(contextualized_clause_$6);
                                    contextualized_asent_$10 = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                                    contextualized_asent_$10 = cdolist_list_var_$8.first();
                                    while (removal_modules_conjunctive_pruning.NIL != cdolist_list_var_$8) {
                                        datum_$11 = (current_$12 = contextualized_asent_$10);
                                        mt_sweep_1 = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                                        asent_sweep_1 = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current_$12, datum_$11, (SubLObject)removal_modules_conjunctive_pruning.$list9);
                                        mt_sweep_1 = current_$12.first();
                                        current_$12 = current_$12.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current_$12, datum_$11, (SubLObject)removal_modules_conjunctive_pruning.$list9);
                                        asent_sweep_1 = current_$12.first();
                                        current_$12 = current_$12.rest();
                                        if (removal_modules_conjunctive_pruning.NIL == current_$12) {
                                            if (mt2.equal(mt_sweep_1) && (asent2.equal(asent_sweep_1) || removal_modules_conjunctive_pruning.NIL != unification.unify(asent2, asent_sweep_1, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED))) {
                                                item_var = inference_datastructures_problem_query.make_contextualized_asent(mt2, asent2);
                                                if (removal_modules_conjunctive_pruning.NIL == conses_high.member(item_var, new_problem_query_sweep_2, (SubLObject)removal_modules_conjunctive_pruning.EQUAL, Symbols.symbol_function((SubLObject)removal_modules_conjunctive_pruning.IDENTITY))) {
                                                    new_problem_query_sweep_2 = (SubLObject)ConsesLow.cons(item_var, new_problem_query_sweep_2);
                                                }
                                                doneP2 = (SubLObject)removal_modules_conjunctive_pruning.T;
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum_$11, (SubLObject)removal_modules_conjunctive_pruning.$list9);
                                        }
                                        index_var_$8 = Numbers.add(index_var_$8, (SubLObject)removal_modules_conjunctive_pruning.ONE_INTEGER);
                                        cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                                        contextualized_asent_$10 = cdolist_list_var_$8.first();
                                    }
                                    sense_sweep_1 = (SubLObject)removal_modules_conjunctive_pruning.$kw8$POS;
                                    index_var_$9 = (SubLObject)removal_modules_conjunctive_pruning.ZERO_INTEGER;
                                    cdolist_list_var_$9 = clauses.pos_lits(contextualized_clause_$6);
                                    contextualized_asent_$11 = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                                    contextualized_asent_$11 = cdolist_list_var_$9.first();
                                    while (removal_modules_conjunctive_pruning.NIL != cdolist_list_var_$9) {
                                        datum_$12 = (current_$13 = contextualized_asent_$11);
                                        mt_sweep_1 = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                                        asent_sweep_1 = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current_$13, datum_$12, (SubLObject)removal_modules_conjunctive_pruning.$list9);
                                        mt_sweep_1 = current_$13.first();
                                        current_$13 = current_$13.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current_$13, datum_$12, (SubLObject)removal_modules_conjunctive_pruning.$list9);
                                        asent_sweep_1 = current_$13.first();
                                        current_$13 = current_$13.rest();
                                        if (removal_modules_conjunctive_pruning.NIL == current_$13) {
                                            if (mt2.equal(mt_sweep_1) && (asent2.equal(asent_sweep_1) || removal_modules_conjunctive_pruning.NIL != unification.unify(asent2, asent_sweep_1, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED))) {
                                                item_var = inference_datastructures_problem_query.make_contextualized_asent(mt2, asent2);
                                                if (removal_modules_conjunctive_pruning.NIL == conses_high.member(item_var, new_problem_query_sweep_2, (SubLObject)removal_modules_conjunctive_pruning.EQUAL, Symbols.symbol_function((SubLObject)removal_modules_conjunctive_pruning.IDENTITY))) {
                                                    new_problem_query_sweep_2 = (SubLObject)ConsesLow.cons(item_var, new_problem_query_sweep_2);
                                                }
                                                doneP2 = (SubLObject)removal_modules_conjunctive_pruning.T;
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum_$12, (SubLObject)removal_modules_conjunctive_pruning.$list9);
                                        }
                                        index_var_$9 = Numbers.add(index_var_$9, (SubLObject)removal_modules_conjunctive_pruning.ONE_INTEGER);
                                        cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                                        contextualized_asent_$11 = cdolist_list_var_$9.first();
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)removal_modules_conjunctive_pruning.$list7);
                            }
                            index_var2 = Numbers.add(index_var2, (SubLObject)removal_modules_conjunctive_pruning.ONE_INTEGER);
                            cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                            contextualized_asent2 = cdolist_list_var_$7.first();
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        contextualized_clause2 = cdolist_list_var2.first();
                    }
                    if (removal_modules_conjunctive_pruning.NIL != new_problem_query_sweep_2) {
                        result_problem_query = inference_datastructures_problem_query.new_problem_query_from_contextualized_clause(clauses.make_clause((SubLObject)removal_modules_conjunctive_pruning.NIL, new_problem_query_sweep_2));
                    }
                }
            }
        }
        return result_problem_query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 2800L)
    public static SubLObject supporting_residual_conjunction_problem_minimal_problem_query_int(final SubLObject problem, SubLObject add_isomophic_literalsP) {
        if (add_isomophic_literalsP == removal_modules_conjunctive_pruning.UNPROVIDED) {
            add_isomophic_literalsP = (SubLObject)removal_modules_conjunctive_pruning.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)removal_modules_conjunctive_pruning.NIL;
        if (removal_modules_conjunctive_pruning.NIL == v_memoization_state) {
            return supporting_residual_conjunction_problem_minimal_problem_query_int_internal(problem, add_isomophic_literalsP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)removal_modules_conjunctive_pruning.$sym3$SUPPORTING_RESIDUAL_CONJUNCTION_PROBLEM_MINIMAL_PROBLEM_QUERY_INT, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED);
        if (removal_modules_conjunctive_pruning.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)removal_modules_conjunctive_pruning.$sym3$SUPPORTING_RESIDUAL_CONJUNCTION_PROBLEM_MINIMAL_PROBLEM_QUERY_INT, (SubLObject)removal_modules_conjunctive_pruning.TWO_INTEGER, (SubLObject)removal_modules_conjunctive_pruning.NIL, (SubLObject)removal_modules_conjunctive_pruning.EQL, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)removal_modules_conjunctive_pruning.$sym3$SUPPORTING_RESIDUAL_CONJUNCTION_PROBLEM_MINIMAL_PROBLEM_QUERY_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(problem, add_isomophic_literalsP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)removal_modules_conjunctive_pruning.NIL;
            collision = cdolist_list_var.first();
            while (removal_modules_conjunctive_pruning.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (problem.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (removal_modules_conjunctive_pruning.NIL != cached_args && removal_modules_conjunctive_pruning.NIL == cached_args.rest() && add_isomophic_literalsP.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(supporting_residual_conjunction_problem_minimal_problem_query_int_internal(problem, add_isomophic_literalsP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(problem, add_isomophic_literalsP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 5688L)
    public static SubLObject prune_non_wff_conjunction_applicability(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem = inference_worker.currently_active_problem();
        if ((removal_modules_conjunctive_pruning.NIL != removal_modules_conjunctive_pruning.$prune_root_problem_of_some_inference_non_wff_conjunctionP$.getDynamicValue(thread) && removal_modules_conjunctive_pruning.NIL != inference_worker.problem_is_the_root_problem_of_some_inferenceP(problem) && removal_modules_conjunctive_pruning.NIL == kb_control_vars.within_forward_inferenceP()) || removal_modules_conjunctive_pruning.NIL != problem_is_a_topological_mergingP(problem)) {
            final SubLObject residual_conjunction_query = supporting_residual_conjunction_problem_minimal_problem_query(problem, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED);
            if (removal_modules_conjunctive_pruning.NIL != problem_query_semantically_invalidP(residual_conjunction_query)) {
                return (SubLObject)ConsesLow.list(clause_utilities.new_total_subclause_spec(contextualized_dnf_clause));
            }
        }
        return (SubLObject)removal_modules_conjunctive_pruning.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 6342L)
    public static SubLObject prune_non_wff_conjunction_expand(final SubLObject contextualized_dnf_clause) {
        if (removal_modules_conjunctive_pruning.NIL != inference_worker.currently_active_problem()) {
            inference_worker.make_problem_no_good(inference_worker.currently_active_problem(), (SubLObject)removal_modules_conjunctive_pruning.NIL, (SubLObject)removal_modules_conjunctive_pruning.$kw11$TACTICAL);
        }
        return (SubLObject)removal_modules_conjunctive_pruning.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 6666L)
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
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)removal_modules_conjunctive_pruning.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); removal_modules_conjunctive_pruning.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (removal_modules_conjunctive_pruning.NIL != set_contents.do_set_contents_element_validP(state, link)) {
                if (removal_modules_conjunctive_pruning.NIL != inference_worker_residual_transformation.residual_transformation_link_p(link)) {
                    return (SubLObject)removal_modules_conjunctive_pruning.T;
                }
                if (removal_modules_conjunctive_pruning.NIL != inference_worker_restriction.simplification_link_p(link)) {
                    return (SubLObject)removal_modules_conjunctive_pruning.T;
                }
                if (removal_modules_conjunctive_pruning.NIL != inference_worker_split.split_link_p(link)) {
                    supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                    set_contents_var_$28 = inference_datastructures_problem.problem_dependent_links(supported_problem);
                    for (basis_object_$29 = set_contents.do_set_contents_basis_object(set_contents_var_$28), state_$30 = (SubLObject)removal_modules_conjunctive_pruning.NIL, state_$30 = set_contents.do_set_contents_initial_state(basis_object_$29, set_contents_var_$28); removal_modules_conjunctive_pruning.NIL == set_contents.do_set_contents_doneP(basis_object_$29, state_$30); state_$30 = set_contents.do_set_contents_update_state(state_$30)) {
                        link_$31 = set_contents.do_set_contents_next(basis_object_$29, state_$30);
                        if (removal_modules_conjunctive_pruning.NIL != set_contents.do_set_contents_element_validP(state_$30, link_$31) && removal_modules_conjunctive_pruning.NIL != inference_worker_restriction.simplification_link_p(link_$31)) {
                            return (SubLObject)removal_modules_conjunctive_pruning.T;
                        }
                    }
                }
            }
        }
        return (SubLObject)removal_modules_conjunctive_pruning.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 7488L)
    public static SubLObject why_problem_query_semantically_invalid(final SubLObject problem_query) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_modules_conjunctive_pruning.NIL;
        final SubLObject _prev_bind_0 = removal_modules_conjunctive_pruning.$gathering_problem_query_semantically_invalid_reasonsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = removal_modules_conjunctive_pruning.$problem_query_semantically_invalid_reason$.currentBinding(thread);
        try {
            removal_modules_conjunctive_pruning.$gathering_problem_query_semantically_invalid_reasonsP$.bind((SubLObject)removal_modules_conjunctive_pruning.T, thread);
            removal_modules_conjunctive_pruning.$problem_query_semantically_invalid_reason$.bind((SubLObject)removal_modules_conjunctive_pruning.$str14$unknown_non_wff_reason, thread);
            if (removal_modules_conjunctive_pruning.NIL != problem_query_semantically_invalidP(problem_query)) {
                result = removal_modules_conjunctive_pruning.$problem_query_semantically_invalid_reason$.getDynamicValue(thread);
            }
            else {
                result = (SubLObject)removal_modules_conjunctive_pruning.NIL;
            }
        }
        finally {
            removal_modules_conjunctive_pruning.$problem_query_semantically_invalid_reason$.rebind(_prev_bind_2, thread);
            removal_modules_conjunctive_pruning.$gathering_problem_query_semantically_invalid_reasonsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 7999L)
    public static SubLObject problem_query_semantically_invalidP(final SubLObject problem_query) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sdc.$ignoring_sdcP$.currentBinding(thread);
        try {
            sdc.$ignoring_sdcP$.bind(removal_modules_conjunctive_pruning.$problem_query_semantically_invalid_ignores_sdcP$.getDynamicValue(thread), thread);
            SubLObject cdolist_list_var = problem_query;
            SubLObject contextualized_clause = (SubLObject)removal_modules_conjunctive_pruning.NIL;
            contextualized_clause = cdolist_list_var.first();
            while (removal_modules_conjunctive_pruning.NIL != cdolist_list_var) {
                SubLObject sense = (SubLObject)removal_modules_conjunctive_pruning.$kw6$NEG;
                SubLObject index_var = (SubLObject)removal_modules_conjunctive_pruning.ZERO_INTEGER;
                SubLObject cdolist_list_var_$32 = clauses.neg_lits(contextualized_clause);
                SubLObject contextualized_asent = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                contextualized_asent = cdolist_list_var_$32.first();
                while (removal_modules_conjunctive_pruning.NIL != cdolist_list_var_$32) {
                    SubLObject current;
                    final SubLObject datum = current = contextualized_asent;
                    SubLObject mt = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                    SubLObject asent = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_conjunctive_pruning.$list7);
                    mt = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_conjunctive_pruning.$list7);
                    asent = current.first();
                    current = current.rest();
                    if (removal_modules_conjunctive_pruning.NIL == current) {
                        if (sense == removal_modules_conjunctive_pruning.$kw8$POS) {
                            final SubLObject pred = cycl_utilities.sentence_arg0(asent);
                            if (removal_modules_conjunctive_pruning.NIL == cycl_grammar.hl_variable_p(pred) && removal_modules_conjunctive_pruning.NIL == kb_utilities.kbeq(pred, removal_modules_conjunctive_pruning.$const15$evaluate)) {
                                SubLObject argnum = (SubLObject)removal_modules_conjunctive_pruning.ZERO_INTEGER;
                                SubLObject cdolist_list_var_$33;
                                final SubLObject args = cdolist_list_var_$33 = cycl_utilities.formula_args(asent, (SubLObject)removal_modules_conjunctive_pruning.$kw16$IGNORE);
                                SubLObject arg = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                                arg = cdolist_list_var_$33.first();
                                while (removal_modules_conjunctive_pruning.NIL != cdolist_list_var_$33) {
                                    argnum = Numbers.add(argnum, (SubLObject)removal_modules_conjunctive_pruning.ONE_INTEGER);
                                    if (!argnum.isZero() && removal_modules_conjunctive_pruning.NIL == variables.not_fully_bound_p(arg) && removal_modules_conjunctive_pruning.NIL == kb_accessors.quoted_argumentP(pred, argnum) && removal_modules_conjunctive_pruning.NIL == el_utilities.kappa_predicate_p(pred) && removal_modules_conjunctive_pruning.NIL == at_admitted.admitted_argumentP(arg, argnum, pred, mt_relevance_macros.conservative_constraint_mt(mt))) {
                                        if (removal_modules_conjunctive_pruning.NIL != removal_modules_conjunctive_pruning.$gathering_problem_query_semantically_invalid_reasonsP$.getDynamicValue(thread)) {
                                            removal_modules_conjunctive_pruning.$problem_query_semantically_invalid_reason$.setDynamicValue(Sequences.cconcatenate(format_nil.format_nil_a_no_copy(arg), new SubLObject[] { removal_modules_conjunctive_pruning.$str17$_is_not_a_valid_arg, format_nil.format_nil_a_no_copy(argnum), removal_modules_conjunctive_pruning.$str18$_for_, format_nil.format_nil_a_no_copy(pred), removal_modules_conjunctive_pruning.$str19$_in_, format_nil.format_nil_a_no_copy(mt) }), thread);
                                        }
                                        return Values.values(arg, asent);
                                    }
                                    cdolist_list_var_$33 = cdolist_list_var_$33.rest();
                                    arg = cdolist_list_var_$33.first();
                                }
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_conjunctive_pruning.$list7);
                    }
                    index_var = Numbers.add(index_var, (SubLObject)removal_modules_conjunctive_pruning.ONE_INTEGER);
                    cdolist_list_var_$32 = cdolist_list_var_$32.rest();
                    contextualized_asent = cdolist_list_var_$32.first();
                }
                sense = (SubLObject)removal_modules_conjunctive_pruning.$kw8$POS;
                index_var = (SubLObject)removal_modules_conjunctive_pruning.ZERO_INTEGER;
                SubLObject cdolist_list_var_$34 = clauses.pos_lits(contextualized_clause);
                contextualized_asent = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                contextualized_asent = cdolist_list_var_$34.first();
                while (removal_modules_conjunctive_pruning.NIL != cdolist_list_var_$34) {
                    SubLObject current;
                    final SubLObject datum = current = contextualized_asent;
                    SubLObject mt = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                    SubLObject asent = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_conjunctive_pruning.$list7);
                    mt = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_conjunctive_pruning.$list7);
                    asent = current.first();
                    current = current.rest();
                    if (removal_modules_conjunctive_pruning.NIL == current) {
                        if (sense == removal_modules_conjunctive_pruning.$kw8$POS) {
                            final SubLObject pred = cycl_utilities.sentence_arg0(asent);
                            if (removal_modules_conjunctive_pruning.NIL == cycl_grammar.hl_variable_p(pred) && removal_modules_conjunctive_pruning.NIL == kb_utilities.kbeq(pred, removal_modules_conjunctive_pruning.$const15$evaluate)) {
                                SubLObject argnum = (SubLObject)removal_modules_conjunctive_pruning.ZERO_INTEGER;
                                SubLObject cdolist_list_var_$35;
                                final SubLObject args = cdolist_list_var_$35 = cycl_utilities.formula_args(asent, (SubLObject)removal_modules_conjunctive_pruning.$kw16$IGNORE);
                                SubLObject arg = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                                arg = cdolist_list_var_$35.first();
                                while (removal_modules_conjunctive_pruning.NIL != cdolist_list_var_$35) {
                                    argnum = Numbers.add(argnum, (SubLObject)removal_modules_conjunctive_pruning.ONE_INTEGER);
                                    if (!argnum.isZero() && removal_modules_conjunctive_pruning.NIL == variables.not_fully_bound_p(arg) && removal_modules_conjunctive_pruning.NIL == kb_accessors.quoted_argumentP(pred, argnum) && removal_modules_conjunctive_pruning.NIL == el_utilities.kappa_predicate_p(pred) && removal_modules_conjunctive_pruning.NIL == at_admitted.admitted_argumentP(arg, argnum, pred, mt_relevance_macros.conservative_constraint_mt(mt))) {
                                        if (removal_modules_conjunctive_pruning.NIL != removal_modules_conjunctive_pruning.$gathering_problem_query_semantically_invalid_reasonsP$.getDynamicValue(thread)) {
                                            removal_modules_conjunctive_pruning.$problem_query_semantically_invalid_reason$.setDynamicValue(Sequences.cconcatenate(format_nil.format_nil_a_no_copy(arg), new SubLObject[] { removal_modules_conjunctive_pruning.$str17$_is_not_a_valid_arg, format_nil.format_nil_a_no_copy(argnum), removal_modules_conjunctive_pruning.$str18$_for_, format_nil.format_nil_a_no_copy(pred), removal_modules_conjunctive_pruning.$str19$_in_, format_nil.format_nil_a_no_copy(mt) }), thread);
                                        }
                                        return Values.values(arg, asent);
                                    }
                                    cdolist_list_var_$35 = cdolist_list_var_$35.rest();
                                    arg = cdolist_list_var_$35.first();
                                }
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_conjunctive_pruning.$list7);
                    }
                    index_var = Numbers.add(index_var, (SubLObject)removal_modules_conjunctive_pruning.ONE_INTEGER);
                    cdolist_list_var_$34 = cdolist_list_var_$34.rest();
                    contextualized_asent = cdolist_list_var_$34.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                contextualized_clause = cdolist_list_var.first();
            }
            final SubLObject variable_constraint_tuples = problem_query_variable_constraint_tuples(problem_query);
            final SubLObject v_variables = list_utilities.tree_gather(variable_constraint_tuples, (SubLObject)removal_modules_conjunctive_pruning.$sym5$VARIABLE_P, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED);
            SubLObject some_variable_invalidP = (SubLObject)removal_modules_conjunctive_pruning.NIL;
            if (removal_modules_conjunctive_pruning.NIL == some_variable_invalidP) {
                SubLObject csome_list_var = v_variables;
                SubLObject var = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                var = csome_list_var.first();
                while (removal_modules_conjunctive_pruning.NIL == some_variable_invalidP && removal_modules_conjunctive_pruning.NIL != csome_list_var) {
                    final SubLObject tuples_for_this_var = variable_constraint_tuples_for_var(variable_constraint_tuples, var);
                    if (removal_modules_conjunctive_pruning.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && removal_modules_conjunctive_pruning.NIL == tuples_for_this_var) {
                        Errors.error((SubLObject)removal_modules_conjunctive_pruning.$str21$variable_constraint_tuple_mismatc, var);
                    }
                    if (removal_modules_conjunctive_pruning.NIL != variable_semantically_invalidP(tuples_for_this_var)) {
                        if (removal_modules_conjunctive_pruning.NIL != removal_modules_conjunctive_pruning.$gathering_problem_query_semantically_invalid_reasonsP$.getDynamicValue(thread)) {
                            removal_modules_conjunctive_pruning.$problem_query_semantically_invalid_reason$.setDynamicValue(Sequences.cconcatenate(format_nil.format_nil_a_no_copy(var), new SubLObject[] { removal_modules_conjunctive_pruning.$str22$_is_constrained_to_disjoint_colle, format_nil.format_nil_a_no_copy(tuples_for_this_var) }), thread);
                        }
                        some_variable_invalidP = (SubLObject)removal_modules_conjunctive_pruning.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    var = csome_list_var.first();
                }
            }
            return some_variable_invalidP;
        }
        finally {
            sdc.$ignoring_sdcP$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 10165L)
    public static SubLObject problem_query_variable_constraint_tuples(final SubLObject problem_query) {
        if (removal_modules_conjunctive_pruning.NIL != inference_datastructures_problem_query.single_clause_problem_query_p(problem_query)) {
            final SubLObject dnf = inference_datastructures_problem.problem_query_sole_clause(problem_query);
            return dnf_variable_constraint_tuples(dnf);
        }
        return (SubLObject)removal_modules_conjunctive_pruning.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 10454L)
    public static SubLObject dnf_variable_constraint_tuples_internal(SubLObject dnf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_conjunctive_pruning.NIL != list_utilities.simple_tree_findP(removal_modules_conjunctive_pruning.$const24$rdf_type, dnf)) {
            dnf = conses_high.subst(removal_modules_conjunctive_pruning.$const25$isa, removal_modules_conjunctive_pruning.$const24$rdf_type, dnf, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED);
        }
        SubLObject tuples = (SubLObject)removal_modules_conjunctive_pruning.NIL;
        SubLObject time = (SubLObject)removal_modules_conjunctive_pruning.NIL;
        final SubLObject time_var = Time.get_internal_real_time();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_relevance_macros.conservative_constraint_mt(mt_relevance_macros.$mt$.getDynamicValue(thread)));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            tuples = Sequences.remove_if((SubLObject)removal_modules_conjunctive_pruning.$sym26$THING_TUPLE_, at_var_types.contextualized_dnf_variables_isa_constraint_tuples(dnf, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED), (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        return tuples;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 10454L)
    public static SubLObject dnf_variable_constraint_tuples(final SubLObject dnf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)removal_modules_conjunctive_pruning.NIL;
        if (removal_modules_conjunctive_pruning.NIL == v_memoization_state) {
            return dnf_variable_constraint_tuples_internal(dnf);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)removal_modules_conjunctive_pruning.$sym23$DNF_VARIABLE_CONSTRAINT_TUPLES, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED);
        if (removal_modules_conjunctive_pruning.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)removal_modules_conjunctive_pruning.$sym23$DNF_VARIABLE_CONSTRAINT_TUPLES, (SubLObject)removal_modules_conjunctive_pruning.ONE_INTEGER, (SubLObject)removal_modules_conjunctive_pruning.$int27$128, (SubLObject)removal_modules_conjunctive_pruning.EQUAL, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)removal_modules_conjunctive_pruning.$sym23$DNF_VARIABLE_CONSTRAINT_TUPLES, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, dnf, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(dnf_variable_constraint_tuples_internal(dnf)));
            memoization_state.caching_state_put(caching_state, dnf, results, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 11497L)
    public static SubLObject variable_constraint_tuples_for_var(final SubLObject tuples, final SubLObject var) {
        SubLObject result = (SubLObject)removal_modules_conjunctive_pruning.NIL;
        SubLObject cdolist_list_var = tuples;
        SubLObject tuple = (SubLObject)removal_modules_conjunctive_pruning.NIL;
        tuple = cdolist_list_var.first();
        while (removal_modules_conjunctive_pruning.NIL != cdolist_list_var) {
            if (var.eql(tuple.first())) {
                result = (SubLObject)ConsesLow.cons(tuple, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 11703L)
    public static SubLObject variable_semantically_invalidP(final SubLObject tuples_for_one_variable) {
        final SubLObject collections_set = set.new_set(Symbols.symbol_function((SubLObject)removal_modules_conjunctive_pruning.EQL), (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED);
        SubLObject cdolist_list_var = tuples_for_one_variable;
        SubLObject tuple = (SubLObject)removal_modules_conjunctive_pruning.NIL;
        tuple = cdolist_list_var.first();
        while (removal_modules_conjunctive_pruning.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject var = (SubLObject)removal_modules_conjunctive_pruning.NIL;
            SubLObject mt = (SubLObject)removal_modules_conjunctive_pruning.NIL;
            SubLObject collections = (SubLObject)removal_modules_conjunctive_pruning.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_conjunctive_pruning.$list28);
            var = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_conjunctive_pruning.$list28);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_conjunctive_pruning.$list28);
            collections = current.first();
            current = current.rest();
            if (removal_modules_conjunctive_pruning.NIL == current) {
                set_utilities.set_add_all(collections, collections_set);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_conjunctive_pruning.$list28);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        }
        final SubLObject cols = set.set_element_list(collections_set);
        return disjoint_with.any_disjoint_with_anyP_memoized(cols, cols, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 12322L)
    public static SubLObject thing_tupleP(final SubLObject tuple) {
        final SubLObject collections = conses_high.third(tuple);
        if (collections.equal((SubLObject)removal_modules_conjunctive_pruning.$list29)) {
            return (SubLObject)removal_modules_conjunctive_pruning.T;
        }
        return (SubLObject)removal_modules_conjunctive_pruning.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 13405L)
    public static SubLObject prune_unknown_sentence_literal_inconsistency_applicability(final SubLObject contextualized_dnf_clause) {
        final SubLObject problem = inference_worker.currently_active_problem();
        if (removal_modules_conjunctive_pruning.NIL != inference_worker.currently_active_problem()) {
            SubLObject cdolist_list_var;
            final SubLObject problem_query = cdolist_list_var = inference_datastructures_problem.problem_query(problem);
            SubLObject contextualized_clause = (SubLObject)removal_modules_conjunctive_pruning.NIL;
            contextualized_clause = cdolist_list_var.first();
            while (removal_modules_conjunctive_pruning.NIL != cdolist_list_var) {
                SubLObject sense = (SubLObject)removal_modules_conjunctive_pruning.$kw6$NEG;
                SubLObject index_var = (SubLObject)removal_modules_conjunctive_pruning.ZERO_INTEGER;
                SubLObject cdolist_list_var_$36 = clauses.neg_lits(contextualized_clause);
                SubLObject contextualized_asent = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                contextualized_asent = cdolist_list_var_$36.first();
                while (removal_modules_conjunctive_pruning.NIL != cdolist_list_var_$36) {
                    SubLObject current;
                    final SubLObject datum = current = contextualized_asent;
                    SubLObject mt = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                    SubLObject asent = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_conjunctive_pruning.$list7);
                    mt = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_conjunctive_pruning.$list7);
                    asent = current.first();
                    current = current.rest();
                    if (removal_modules_conjunctive_pruning.NIL == current) {
                        if (removal_modules_conjunctive_pruning.$const32$unknownSentence.eql(cycl_utilities.atomic_sentence_predicate(asent))) {
                            final SubLObject unknown_sentence_asent = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED);
                            SubLObject cdolist_list_var_$37 = problem_query;
                            SubLObject contextualized_clause_$38 = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                            contextualized_clause_$38 = cdolist_list_var_$37.first();
                            while (removal_modules_conjunctive_pruning.NIL != cdolist_list_var_$37) {
                                SubLObject sense2 = (SubLObject)removal_modules_conjunctive_pruning.$kw6$NEG;
                                SubLObject index_var_$39 = (SubLObject)removal_modules_conjunctive_pruning.ZERO_INTEGER;
                                SubLObject cdolist_list_var_$38 = clauses.neg_lits(contextualized_clause_$38);
                                SubLObject contextualized_asent_$41 = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                                contextualized_asent_$41 = cdolist_list_var_$38.first();
                                while (removal_modules_conjunctive_pruning.NIL != cdolist_list_var_$38) {
                                    SubLObject current_$43;
                                    final SubLObject datum_$42 = current_$43 = contextualized_asent_$41;
                                    SubLObject mt2 = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                                    SubLObject asent2 = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(current_$43, datum_$42, (SubLObject)removal_modules_conjunctive_pruning.$list33);
                                    mt2 = current_$43.first();
                                    current_$43 = current_$43.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(current_$43, datum_$42, (SubLObject)removal_modules_conjunctive_pruning.$list33);
                                    asent2 = current_$43.first();
                                    current_$43 = current_$43.rest();
                                    if (removal_modules_conjunctive_pruning.NIL == current_$43) {
                                        if (asent2.equal(unknown_sentence_asent)) {
                                            return (SubLObject)ConsesLow.list(clause_utilities.new_total_subclause_spec(contextualized_dnf_clause));
                                        }
                                    }
                                    else {
                                        cdestructuring_bind.cdestructuring_bind_error(datum_$42, (SubLObject)removal_modules_conjunctive_pruning.$list33);
                                    }
                                    index_var_$39 = Numbers.add(index_var_$39, (SubLObject)removal_modules_conjunctive_pruning.ONE_INTEGER);
                                    cdolist_list_var_$38 = cdolist_list_var_$38.rest();
                                    contextualized_asent_$41 = cdolist_list_var_$38.first();
                                }
                                sense2 = (SubLObject)removal_modules_conjunctive_pruning.$kw8$POS;
                                SubLObject index_var_$40 = (SubLObject)removal_modules_conjunctive_pruning.ZERO_INTEGER;
                                SubLObject cdolist_list_var_$39 = clauses.pos_lits(contextualized_clause_$38);
                                SubLObject contextualized_asent_$42 = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                                contextualized_asent_$42 = cdolist_list_var_$39.first();
                                while (removal_modules_conjunctive_pruning.NIL != cdolist_list_var_$39) {
                                    SubLObject current_$44;
                                    final SubLObject datum_$43 = current_$44 = contextualized_asent_$42;
                                    SubLObject mt2 = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                                    SubLObject asent2 = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(current_$44, datum_$43, (SubLObject)removal_modules_conjunctive_pruning.$list33);
                                    mt2 = current_$44.first();
                                    current_$44 = current_$44.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(current_$44, datum_$43, (SubLObject)removal_modules_conjunctive_pruning.$list33);
                                    asent2 = current_$44.first();
                                    current_$44 = current_$44.rest();
                                    if (removal_modules_conjunctive_pruning.NIL == current_$44) {
                                        if (asent2.equal(unknown_sentence_asent)) {
                                            return (SubLObject)ConsesLow.list(clause_utilities.new_total_subclause_spec(contextualized_dnf_clause));
                                        }
                                    }
                                    else {
                                        cdestructuring_bind.cdestructuring_bind_error(datum_$43, (SubLObject)removal_modules_conjunctive_pruning.$list33);
                                    }
                                    index_var_$40 = Numbers.add(index_var_$40, (SubLObject)removal_modules_conjunctive_pruning.ONE_INTEGER);
                                    cdolist_list_var_$39 = cdolist_list_var_$39.rest();
                                    contextualized_asent_$42 = cdolist_list_var_$39.first();
                                }
                                cdolist_list_var_$37 = cdolist_list_var_$37.rest();
                                contextualized_clause_$38 = cdolist_list_var_$37.first();
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_conjunctive_pruning.$list7);
                    }
                    index_var = Numbers.add(index_var, (SubLObject)removal_modules_conjunctive_pruning.ONE_INTEGER);
                    cdolist_list_var_$36 = cdolist_list_var_$36.rest();
                    contextualized_asent = cdolist_list_var_$36.first();
                }
                sense = (SubLObject)removal_modules_conjunctive_pruning.$kw8$POS;
                index_var = (SubLObject)removal_modules_conjunctive_pruning.ZERO_INTEGER;
                SubLObject cdolist_list_var_$40 = clauses.pos_lits(contextualized_clause);
                contextualized_asent = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                contextualized_asent = cdolist_list_var_$40.first();
                while (removal_modules_conjunctive_pruning.NIL != cdolist_list_var_$40) {
                    SubLObject current;
                    final SubLObject datum = current = contextualized_asent;
                    SubLObject mt = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                    SubLObject asent = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_conjunctive_pruning.$list7);
                    mt = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_conjunctive_pruning.$list7);
                    asent = current.first();
                    current = current.rest();
                    if (removal_modules_conjunctive_pruning.NIL == current) {
                        if (removal_modules_conjunctive_pruning.$const32$unknownSentence.eql(cycl_utilities.atomic_sentence_predicate(asent))) {
                            final SubLObject unknown_sentence_asent = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED);
                            SubLObject cdolist_list_var_$41 = problem_query;
                            SubLObject contextualized_clause_$39 = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                            contextualized_clause_$39 = cdolist_list_var_$41.first();
                            while (removal_modules_conjunctive_pruning.NIL != cdolist_list_var_$41) {
                                SubLObject sense2 = (SubLObject)removal_modules_conjunctive_pruning.$kw6$NEG;
                                SubLObject index_var_$41 = (SubLObject)removal_modules_conjunctive_pruning.ZERO_INTEGER;
                                SubLObject cdolist_list_var_$42 = clauses.neg_lits(contextualized_clause_$39);
                                SubLObject contextualized_asent_$43 = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                                contextualized_asent_$43 = cdolist_list_var_$42.first();
                                while (removal_modules_conjunctive_pruning.NIL != cdolist_list_var_$42) {
                                    SubLObject current_$45;
                                    final SubLObject datum_$44 = current_$45 = contextualized_asent_$43;
                                    SubLObject mt2 = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                                    SubLObject asent2 = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(current_$45, datum_$44, (SubLObject)removal_modules_conjunctive_pruning.$list33);
                                    mt2 = current_$45.first();
                                    current_$45 = current_$45.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(current_$45, datum_$44, (SubLObject)removal_modules_conjunctive_pruning.$list33);
                                    asent2 = current_$45.first();
                                    current_$45 = current_$45.rest();
                                    if (removal_modules_conjunctive_pruning.NIL == current_$45) {
                                        if (asent2.equal(unknown_sentence_asent)) {
                                            return (SubLObject)ConsesLow.list(clause_utilities.new_total_subclause_spec(contextualized_dnf_clause));
                                        }
                                    }
                                    else {
                                        cdestructuring_bind.cdestructuring_bind_error(datum_$44, (SubLObject)removal_modules_conjunctive_pruning.$list33);
                                    }
                                    index_var_$41 = Numbers.add(index_var_$41, (SubLObject)removal_modules_conjunctive_pruning.ONE_INTEGER);
                                    cdolist_list_var_$42 = cdolist_list_var_$42.rest();
                                    contextualized_asent_$43 = cdolist_list_var_$42.first();
                                }
                                sense2 = (SubLObject)removal_modules_conjunctive_pruning.$kw8$POS;
                                SubLObject index_var_$42 = (SubLObject)removal_modules_conjunctive_pruning.ZERO_INTEGER;
                                SubLObject cdolist_list_var_$43 = clauses.pos_lits(contextualized_clause_$39);
                                SubLObject contextualized_asent_$44 = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                                contextualized_asent_$44 = cdolist_list_var_$43.first();
                                while (removal_modules_conjunctive_pruning.NIL != cdolist_list_var_$43) {
                                    SubLObject current_$46;
                                    final SubLObject datum_$45 = current_$46 = contextualized_asent_$44;
                                    SubLObject mt2 = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                                    SubLObject asent2 = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(current_$46, datum_$45, (SubLObject)removal_modules_conjunctive_pruning.$list33);
                                    mt2 = current_$46.first();
                                    current_$46 = current_$46.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(current_$46, datum_$45, (SubLObject)removal_modules_conjunctive_pruning.$list33);
                                    asent2 = current_$46.first();
                                    current_$46 = current_$46.rest();
                                    if (removal_modules_conjunctive_pruning.NIL == current_$46) {
                                        if (asent2.equal(unknown_sentence_asent)) {
                                            return (SubLObject)ConsesLow.list(clause_utilities.new_total_subclause_spec(contextualized_dnf_clause));
                                        }
                                    }
                                    else {
                                        cdestructuring_bind.cdestructuring_bind_error(datum_$45, (SubLObject)removal_modules_conjunctive_pruning.$list33);
                                    }
                                    index_var_$42 = Numbers.add(index_var_$42, (SubLObject)removal_modules_conjunctive_pruning.ONE_INTEGER);
                                    cdolist_list_var_$43 = cdolist_list_var_$43.rest();
                                    contextualized_asent_$44 = cdolist_list_var_$43.first();
                                }
                                cdolist_list_var_$41 = cdolist_list_var_$41.rest();
                                contextualized_clause_$39 = cdolist_list_var_$41.first();
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_conjunctive_pruning.$list7);
                    }
                    index_var = Numbers.add(index_var, (SubLObject)removal_modules_conjunctive_pruning.ONE_INTEGER);
                    cdolist_list_var_$40 = cdolist_list_var_$40.rest();
                    contextualized_asent = cdolist_list_var_$40.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                contextualized_clause = cdolist_list_var.first();
            }
        }
        return (SubLObject)removal_modules_conjunctive_pruning.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 14100L)
    public static SubLObject prune_unknown_sentence_literal_inconsistency_expand(final SubLObject contextualized_dnf_clause) {
        if (removal_modules_conjunctive_pruning.NIL != inference_worker.currently_active_problem()) {
            inference_worker.make_problem_no_good(inference_worker.currently_active_problem(), (SubLObject)removal_modules_conjunctive_pruning.NIL, (SubLObject)removal_modules_conjunctive_pruning.$kw11$TACTICAL);
        }
        return (SubLObject)removal_modules_conjunctive_pruning.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 15283L)
    public static SubLObject prune_rt_problems_applicable_when_typed_only_when_specialization_applicability(final SubLObject contextualized_dnf_clause) {
        final SubLObject problem = inference_worker.currently_active_problem();
        if (removal_modules_conjunctive_pruning.NIL != inference_worker.currently_active_problem()) {
            final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
            final SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = (SubLObject)removal_modules_conjunctive_pruning.NIL;
            state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var);
            while (removal_modules_conjunctive_pruning.NIL == set_contents.do_set_contents_doneP(basis_object, state)) {
                final SubLObject link = set_contents.do_set_contents_next(basis_object, state);
                if (removal_modules_conjunctive_pruning.NIL != set_contents.do_set_contents_element_validP(state, link) && removal_modules_conjunctive_pruning.NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, (SubLObject)removal_modules_conjunctive_pruning.$kw4$RESIDUAL_TRANSFORMATION)) {
                    final SubLObject jo_link = inference_worker_residual_transformation.residual_transformation_link_motivating_join_ordered_link(link);
                    final SubLObject transformation_link = inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(link);
                    if (removal_modules_conjunctive_pruning.NIL != transformation_non_applicable_due_to_rule_type_contraint_meta_assertionP(jo_link, transformation_link)) {
                        return (SubLObject)ConsesLow.list(clause_utilities.new_total_subclause_spec(contextualized_dnf_clause));
                    }
                    return (SubLObject)removal_modules_conjunctive_pruning.NIL;
                }
                else {
                    state = set_contents.do_set_contents_update_state(state);
                }
            }
        }
        return (SubLObject)removal_modules_conjunctive_pruning.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 15983L)
    public static SubLObject transformation_non_applicable_due_to_rule_type_contraint_meta_assertionP(final SubLObject join_ordered_link, final SubLObject transformation_link) {
        final SubLObject rule_assertion = inference_worker_transformation.transformation_link_rule_assertion(transformation_link);
        if (removal_modules_conjunctive_pruning.NIL != somewhere_cache.some_pred_assertion_somewhereP(removal_modules_conjunctive_pruning.$const39$applicableWhenTypedOnlyWhenSpecia, rule_assertion, (SubLObject)removal_modules_conjunctive_pruning.THREE_INTEGER, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED)) {
            final SubLObject awtows_el_var_col_pairs = kb_mapping_utilities.pred_value_tuples(rule_assertion, removal_modules_conjunctive_pruning.$const39$applicableWhenTypedOnlyWhenSpecia, (SubLObject)removal_modules_conjunctive_pruning.THREE_INTEGER, (SubLObject)removal_modules_conjunctive_pruning.$list40, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED);
            if (removal_modules_conjunctive_pruning.NIL != awtows_el_var_col_pairs) {
                SubLObject cdolist_list_var = awtows_el_var_col_pairs;
                SubLObject awtows_el_var_col_pair = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                awtows_el_var_col_pair = cdolist_list_var.first();
                while (removal_modules_conjunctive_pruning.NIL != cdolist_list_var) {
                    final SubLObject awtows_el_var = awtows_el_var_col_pair.first();
                    final SubLObject awtows_col = conses_high.second(awtows_el_var_col_pair);
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
                    SubLObject found_type_literalP = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                    SubLObject some_type_literal_spec_of_colP = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                    SubLObject cdolist_list_var_$62 = jo_link_non_focal_problem_query;
                    SubLObject contextualized_clause = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                    contextualized_clause = cdolist_list_var_$62.first();
                    while (removal_modules_conjunctive_pruning.NIL != cdolist_list_var_$62) {
                        SubLObject literal_sense = (SubLObject)removal_modules_conjunctive_pruning.$kw6$NEG;
                        SubLObject index_var = (SubLObject)removal_modules_conjunctive_pruning.ZERO_INTEGER;
                        SubLObject cdolist_list_var_$63 = clauses.neg_lits(contextualized_clause);
                        SubLObject contextualized_asent = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                        contextualized_asent = cdolist_list_var_$63.first();
                        while (removal_modules_conjunctive_pruning.NIL != cdolist_list_var_$63) {
                            SubLObject current;
                            final SubLObject datum = current = contextualized_asent;
                            SubLObject mt = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                            SubLObject asent = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_conjunctive_pruning.$list7);
                            mt = current.first();
                            current = current.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_conjunctive_pruning.$list7);
                            asent = current.first();
                            current = current.rest();
                            if (removal_modules_conjunctive_pruning.NIL == current) {
                                final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
                                final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED);
                                final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED);
                                if ((pred.eql(removal_modules_conjunctive_pruning.$const25$isa) || pred.eql(removal_modules_conjunctive_pruning.$const24$rdf_type)) && arg1.eql(jo_link_non_focal_problem_hl_var) && removal_modules_conjunctive_pruning.NIL != term.el_fort_p(arg2)) {
                                    found_type_literalP = (SubLObject)removal_modules_conjunctive_pruning.T;
                                    if (removal_modules_conjunctive_pruning.NIL != genls.genlsP(arg2, awtows_col, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED)) {
                                        some_type_literal_spec_of_colP = (SubLObject)removal_modules_conjunctive_pruning.T;
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_conjunctive_pruning.$list7);
                            }
                            index_var = Numbers.add(index_var, (SubLObject)removal_modules_conjunctive_pruning.ONE_INTEGER);
                            cdolist_list_var_$63 = cdolist_list_var_$63.rest();
                            contextualized_asent = cdolist_list_var_$63.first();
                        }
                        literal_sense = (SubLObject)removal_modules_conjunctive_pruning.$kw8$POS;
                        index_var = (SubLObject)removal_modules_conjunctive_pruning.ZERO_INTEGER;
                        SubLObject cdolist_list_var_$64 = clauses.pos_lits(contextualized_clause);
                        contextualized_asent = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                        contextualized_asent = cdolist_list_var_$64.first();
                        while (removal_modules_conjunctive_pruning.NIL != cdolist_list_var_$64) {
                            SubLObject current;
                            final SubLObject datum = current = contextualized_asent;
                            SubLObject mt = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                            SubLObject asent = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_conjunctive_pruning.$list7);
                            mt = current.first();
                            current = current.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_conjunctive_pruning.$list7);
                            asent = current.first();
                            current = current.rest();
                            if (removal_modules_conjunctive_pruning.NIL == current) {
                                final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
                                final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED);
                                final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED);
                                if ((pred.eql(removal_modules_conjunctive_pruning.$const25$isa) || pred.eql(removal_modules_conjunctive_pruning.$const24$rdf_type)) && arg1.eql(jo_link_non_focal_problem_hl_var) && removal_modules_conjunctive_pruning.NIL != term.el_fort_p(arg2)) {
                                    found_type_literalP = (SubLObject)removal_modules_conjunctive_pruning.T;
                                    if (removal_modules_conjunctive_pruning.NIL != genls.genlsP(arg2, awtows_col, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED)) {
                                        some_type_literal_spec_of_colP = (SubLObject)removal_modules_conjunctive_pruning.T;
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_conjunctive_pruning.$list7);
                            }
                            index_var = Numbers.add(index_var, (SubLObject)removal_modules_conjunctive_pruning.ONE_INTEGER);
                            cdolist_list_var_$64 = cdolist_list_var_$64.rest();
                            contextualized_asent = cdolist_list_var_$64.first();
                        }
                        cdolist_list_var_$62 = cdolist_list_var_$62.rest();
                        contextualized_clause = cdolist_list_var_$62.first();
                    }
                    if (removal_modules_conjunctive_pruning.NIL != found_type_literalP) {
                        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_conjunctive_pruning.NIL == some_type_literal_spec_of_colP);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    awtows_el_var_col_pair = cdolist_list_var.first();
                }
            }
        }
        return (SubLObject)removal_modules_conjunctive_pruning.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 18586L)
    public static SubLObject prune_rt_problems_applicable_when_typed_only_when_specialization_expand(final SubLObject contextualized_dnf_clause) {
        if (removal_modules_conjunctive_pruning.NIL != inference_worker.currently_active_problem()) {
            inference_worker.make_problem_no_good(inference_worker.currently_active_problem(), (SubLObject)removal_modules_conjunctive_pruning.NIL, (SubLObject)removal_modules_conjunctive_pruning.$kw11$TACTICAL);
        }
        return (SubLObject)removal_modules_conjunctive_pruning.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 19436L)
    public static SubLObject prune_circular_term_of_unit_applicability(final SubLObject contextualized_dnf_clause) {
        if (removal_modules_conjunctive_pruning.NIL != inference_worker.currently_active_problem()) {
            SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
            SubLObject contextualized_poslit = (SubLObject)removal_modules_conjunctive_pruning.NIL;
            contextualized_poslit = cdolist_list_var.first();
            while (removal_modules_conjunctive_pruning.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = contextualized_poslit;
                SubLObject mt = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                SubLObject asent = (SubLObject)removal_modules_conjunctive_pruning.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_conjunctive_pruning.$list7);
                mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_conjunctive_pruning.$list7);
                asent = current.first();
                current = current.rest();
                if (removal_modules_conjunctive_pruning.NIL == current) {
                    if (removal_modules_conjunctive_pruning.NIL != el_utilities.tou_litP(asent)) {
                        final SubLObject var = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED);
                        if (removal_modules_conjunctive_pruning.NIL != list_utilities.tree_find(var, cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED), (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED, (SubLObject)removal_modules_conjunctive_pruning.UNPROVIDED)) {
                            return (SubLObject)ConsesLow.list(clause_utilities.new_total_subclause_spec(contextualized_dnf_clause));
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_conjunctive_pruning.$list7);
                }
                cdolist_list_var = cdolist_list_var.rest();
                contextualized_poslit = cdolist_list_var.first();
            }
        }
        return (SubLObject)removal_modules_conjunctive_pruning.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 19940L)
    public static SubLObject prune_circular_term_of_unit_expand(final SubLObject contextualized_dnf_clause) {
        if (removal_modules_conjunctive_pruning.NIL != inference_worker.currently_active_problem()) {
            inference_worker.make_problem_no_good(inference_worker.currently_active_problem(), (SubLObject)removal_modules_conjunctive_pruning.NIL, (SubLObject)removal_modules_conjunctive_pruning.$kw11$TACTICAL);
        }
        return (SubLObject)removal_modules_conjunctive_pruning.NIL;
    }
    
    public static SubLObject declare_removal_modules_conjunctive_pruning_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conjunctive_pruning", "conjunctive_pruning_module_p", "CONJUNCTIVE-PRUNING-MODULE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conjunctive_pruning", "conjunctive_pruning_tactic_p", "CONJUNCTIVE-PRUNING-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conjunctive_pruning", "supporting_residual_conjunction_problem_minimal_problem_query", "SUPPORTING-RESIDUAL-CONJUNCTION-PROBLEM-MINIMAL-PROBLEM-QUERY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conjunctive_pruning", "supporting_residual_conjunction_problem_minimal_problem_query_int_internal", "SUPPORTING-RESIDUAL-CONJUNCTION-PROBLEM-MINIMAL-PROBLEM-QUERY-INT-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conjunctive_pruning", "supporting_residual_conjunction_problem_minimal_problem_query_int", "SUPPORTING-RESIDUAL-CONJUNCTION-PROBLEM-MINIMAL-PROBLEM-QUERY-INT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conjunctive_pruning", "prune_non_wff_conjunction_applicability", "PRUNE-NON-WFF-CONJUNCTION-APPLICABILITY", 1, 0, false);
        new $prune_non_wff_conjunction_applicability$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conjunctive_pruning", "prune_non_wff_conjunction_expand", "PRUNE-NON-WFF-CONJUNCTION-EXPAND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conjunctive_pruning", "problem_is_a_topological_mergingP", "PROBLEM-IS-A-TOPOLOGICAL-MERGING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conjunctive_pruning", "why_problem_query_semantically_invalid", "WHY-PROBLEM-QUERY-SEMANTICALLY-INVALID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conjunctive_pruning", "problem_query_semantically_invalidP", "PROBLEM-QUERY-SEMANTICALLY-INVALID?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conjunctive_pruning", "problem_query_variable_constraint_tuples", "PROBLEM-QUERY-VARIABLE-CONSTRAINT-TUPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conjunctive_pruning", "dnf_variable_constraint_tuples_internal", "DNF-VARIABLE-CONSTRAINT-TUPLES-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conjunctive_pruning", "dnf_variable_constraint_tuples", "DNF-VARIABLE-CONSTRAINT-TUPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conjunctive_pruning", "variable_constraint_tuples_for_var", "VARIABLE-CONSTRAINT-TUPLES-FOR-VAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conjunctive_pruning", "variable_semantically_invalidP", "VARIABLE-SEMANTICALLY-INVALID?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conjunctive_pruning", "thing_tupleP", "THING-TUPLE?", 1, 0, false);
        new $thing_tupleP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conjunctive_pruning", "prune_unknown_sentence_literal_inconsistency_applicability", "PRUNE-UNKNOWN-SENTENCE-LITERAL-INCONSISTENCY-APPLICABILITY", 1, 0, false);
        new $prune_unknown_sentence_literal_inconsistency_applicability$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conjunctive_pruning", "prune_unknown_sentence_literal_inconsistency_expand", "PRUNE-UNKNOWN-SENTENCE-LITERAL-INCONSISTENCY-EXPAND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conjunctive_pruning", "prune_rt_problems_applicable_when_typed_only_when_specialization_applicability", "PRUNE-RT-PROBLEMS-APPLICABLE-WHEN-TYPED-ONLY-WHEN-SPECIALIZATION-APPLICABILITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conjunctive_pruning", "transformation_non_applicable_due_to_rule_type_contraint_meta_assertionP", "TRANSFORMATION-NON-APPLICABLE-DUE-TO-RULE-TYPE-CONTRAINT-META-ASSERTION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conjunctive_pruning", "prune_rt_problems_applicable_when_typed_only_when_specialization_expand", "PRUNE-RT-PROBLEMS-APPLICABLE-WHEN-TYPED-ONLY-WHEN-SPECIALIZATION-EXPAND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conjunctive_pruning", "prune_circular_term_of_unit_applicability", "PRUNE-CIRCULAR-TERM-OF-UNIT-APPLICABILITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conjunctive_pruning", "prune_circular_term_of_unit_expand", "PRUNE-CIRCULAR-TERM-OF-UNIT-EXPAND", 1, 0, false);
        return (SubLObject)removal_modules_conjunctive_pruning.NIL;
    }
    
    public static SubLObject init_removal_modules_conjunctive_pruning_file() {
        removal_modules_conjunctive_pruning.$conjunctive_pruning_module_names$ = SubLFiles.deflexical("*CONJUNCTIVE-PRUNING-MODULE-NAMES*", (SubLObject)removal_modules_conjunctive_pruning.$list0);
        removal_modules_conjunctive_pruning.$prune_root_problem_of_some_inference_non_wff_conjunctionP$ = SubLFiles.defparameter("*PRUNE-ROOT-PROBLEM-OF-SOME-INFERENCE-NON-WFF-CONJUNCTION?*", (SubLObject)removal_modules_conjunctive_pruning.T);
        removal_modules_conjunctive_pruning.$gathering_problem_query_semantically_invalid_reasonsP$ = SubLFiles.defparameter("*GATHERING-PROBLEM-QUERY-SEMANTICALLY-INVALID-REASONS?*", (SubLObject)removal_modules_conjunctive_pruning.NIL);
        removal_modules_conjunctive_pruning.$problem_query_semantically_invalid_reason$ = SubLFiles.defparameter("*PROBLEM-QUERY-SEMANTICALLY-INVALID-REASON*", (SubLObject)removal_modules_conjunctive_pruning.$kw13$UNINITIALIZED);
        removal_modules_conjunctive_pruning.$problem_query_semantically_invalid_ignores_sdcP$ = SubLFiles.defparameter("*PROBLEM-QUERY-SEMANTICALLY-INVALID-IGNORES-SDC?*", (SubLObject)removal_modules_conjunctive_pruning.T);
        return (SubLObject)removal_modules_conjunctive_pruning.NIL;
    }
    
    public static SubLObject setup_removal_modules_conjunctive_pruning_file() {
        inference_modules.inference_conjunctive_removal_module((SubLObject)removal_modules_conjunctive_pruning.$kw1$PRUNE_NON_WFF_CONJUNCTION, (SubLObject)removal_modules_conjunctive_pruning.$list2);
        memoization_state.note_memoized_function((SubLObject)removal_modules_conjunctive_pruning.$sym3$SUPPORTING_RESIDUAL_CONJUNCTION_PROBLEM_MINIMAL_PROBLEM_QUERY_INT);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_conjunctive_pruning.$sym10$PRUNE_NON_WFF_CONJUNCTION_APPLICABILITY);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_conjunctive_pruning.$sym12$PRUNE_NON_WFF_CONJUNCTION_EXPAND);
        memoization_state.note_memoized_function((SubLObject)removal_modules_conjunctive_pruning.$sym23$DNF_VARIABLE_CONSTRAINT_TUPLES);
        inference_modules.inference_conjunctive_removal_module((SubLObject)removal_modules_conjunctive_pruning.$kw30$PRUNE_UNKNOWN_SENTENCE_LITERAL_INCONSISTENCY, (SubLObject)removal_modules_conjunctive_pruning.$list31);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_conjunctive_pruning.$sym34$PRUNE_UNKNOWN_SENTENCE_LITERAL_INCONSISTENCY_APPLICABILITY);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_conjunctive_pruning.$sym35$PRUNE_UNKNOWN_SENTENCE_LITERAL_INCONSISTENCY_EXPAND);
        inference_modules.inference_conjunctive_removal_module((SubLObject)removal_modules_conjunctive_pruning.$kw36$PRUNE_RT_PROBLEMS_APPLICABLE_WHEN_TYPED_ONLY_WHEN_SPECIALIZATION, (SubLObject)removal_modules_conjunctive_pruning.$list37);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_conjunctive_pruning.$sym38$PRUNE_RT_PROBLEMS_APPLICABLE_WHEN_TYPED_ONLY_WHEN_SPECIALIZATION_);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_conjunctive_pruning.$sym41$PRUNE_RT_PROBLEMS_APPLICABLE_WHEN_TYPED_ONLY_WHEN_SPECIALIZATION_);
        inference_modules.inference_conjunctive_removal_module((SubLObject)removal_modules_conjunctive_pruning.$kw42$PRUNE_CIRCULAR_TERM_OF_UNIT, (SubLObject)removal_modules_conjunctive_pruning.$list43);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_conjunctive_pruning.$sym44$PRUNE_CIRCULAR_TERM_OF_UNIT_APPLICABILITY);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_conjunctive_pruning.$sym45$PRUNE_CIRCULAR_TERM_OF_UNIT_EXPAND);
        return (SubLObject)removal_modules_conjunctive_pruning.NIL;
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
    
    static {
        me = (SubLFile)new removal_modules_conjunctive_pruning();
        removal_modules_conjunctive_pruning.$conjunctive_pruning_module_names$ = null;
        removal_modules_conjunctive_pruning.$prune_root_problem_of_some_inference_non_wff_conjunctionP$ = null;
        removal_modules_conjunctive_pruning.$gathering_problem_query_semantically_invalid_reasonsP$ = null;
        removal_modules_conjunctive_pruning.$problem_query_semantically_invalid_reason$ = null;
        removal_modules_conjunctive_pruning.$problem_query_semantically_invalid_ignores_sdcP$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRUNE-NON-WFF-CONJUNCTION"), (SubLObject)SubLObjectFactory.makeKeyword("PRUNE-UNKNOWN-SENTENCE-LITERAL-INCONSISTENCY"), (SubLObject)SubLObjectFactory.makeKeyword("PRUNE-RT-PROBLEMS-APPLICABLE-WHEN-TYPED-ONLY-WHEN-SPECIALIZATION"), (SubLObject)SubLObjectFactory.makeKeyword("PRUNE-CIRCULAR-TERM-OF-UNIT"));
        $kw1$PRUNE_NON_WFF_CONJUNCTION = SubLObjectFactory.makeKeyword("PRUNE-NON-WFF-CONJUNCTION");
        $list2 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("EVERY-PREDICATES"), removal_modules_conjunctive_pruning.NIL, SubLObjectFactory.makeKeyword("APPLICABILITY"), SubLObjectFactory.makeSymbol("PRUNE-NON-WFF-CONJUNCTION-APPLICABILITY"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_conjunctive_pruning.ZERO_INTEGER, SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("PRUNE-NON-WFF-CONJUNCTION-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$and <lit0> ... <litN>) \n    which has a dependent residual transformation link\n    and is non-wff"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$and\n      (#$isa ?AGENT #$City)\n      (#$spouse ?AGENT ?SPOUSE))") });
        $sym3$SUPPORTING_RESIDUAL_CONJUNCTION_PROBLEM_MINIMAL_PROBLEM_QUERY_INT = SubLObjectFactory.makeSymbol("SUPPORTING-RESIDUAL-CONJUNCTION-PROBLEM-MINIMAL-PROBLEM-QUERY-INT");
        $kw4$RESIDUAL_TRANSFORMATION = SubLObjectFactory.makeKeyword("RESIDUAL-TRANSFORMATION");
        $sym5$VARIABLE_P = SubLObjectFactory.makeSymbol("VARIABLE-P");
        $kw6$NEG = SubLObjectFactory.makeKeyword("NEG");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"));
        $kw8$POS = SubLObjectFactory.makeKeyword("POS");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT-SWEEP-1"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT-SWEEP-1"));
        $sym10$PRUNE_NON_WFF_CONJUNCTION_APPLICABILITY = SubLObjectFactory.makeSymbol("PRUNE-NON-WFF-CONJUNCTION-APPLICABILITY");
        $kw11$TACTICAL = SubLObjectFactory.makeKeyword("TACTICAL");
        $sym12$PRUNE_NON_WFF_CONJUNCTION_EXPAND = SubLObjectFactory.makeSymbol("PRUNE-NON-WFF-CONJUNCTION-EXPAND");
        $kw13$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $str14$unknown_non_wff_reason = SubLObjectFactory.makeString("unknown non-wff reason");
        $const15$evaluate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate"));
        $kw16$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $str17$_is_not_a_valid_arg = SubLObjectFactory.makeString(" is not a valid arg");
        $str18$_for_ = SubLObjectFactory.makeString(" for ");
        $str19$_in_ = SubLObjectFactory.makeString(" in ");
        $sym20$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $str21$variable_constraint_tuple_mismatc = SubLObjectFactory.makeString("variable constraint tuple mismatch for ~a");
        $str22$_is_constrained_to_disjoint_colle = SubLObjectFactory.makeString(" is constrained to disjoint collections: ");
        $sym23$DNF_VARIABLE_CONSTRAINT_TUPLES = SubLObjectFactory.makeSymbol("DNF-VARIABLE-CONSTRAINT-TUPLES");
        $const24$rdf_type = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rdf-type"));
        $const25$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $sym26$THING_TUPLE_ = SubLObjectFactory.makeSymbol("THING-TUPLE?");
        $int27$128 = SubLObjectFactory.makeInteger(128);
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTIONS"));
        $list29 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")));
        $kw30$PRUNE_UNKNOWN_SENTENCE_LITERAL_INCONSISTENCY = SubLObjectFactory.makeKeyword("PRUNE-UNKNOWN-SENTENCE-LITERAL-INCONSISTENCY");
        $list31 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("EVERY-PREDICATES"), removal_modules_conjunctive_pruning.NIL, SubLObjectFactory.makeKeyword("APPLICABILITY"), SubLObjectFactory.makeSymbol("PRUNE-UNKNOWN-SENTENCE-LITERAL-INCONSISTENCY-APPLICABILITY"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_conjunctive_pruning.ZERO_INTEGER, SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("PRUNE-UNKNOWN-SENTENCE-LITERAL-INCONSISTENCY-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$and <lit0> ... <litN> ... (#$unknownSentence <litN>) ...)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$and\n      (#$children ?ANIMAL ?CHILD)\n      (#$unknownSentence (#$children ?ANIMAL ?CHILD)))") });
        $const32$unknownSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence"));
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT2"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT2"));
        $sym34$PRUNE_UNKNOWN_SENTENCE_LITERAL_INCONSISTENCY_APPLICABILITY = SubLObjectFactory.makeSymbol("PRUNE-UNKNOWN-SENTENCE-LITERAL-INCONSISTENCY-APPLICABILITY");
        $sym35$PRUNE_UNKNOWN_SENTENCE_LITERAL_INCONSISTENCY_EXPAND = SubLObjectFactory.makeSymbol("PRUNE-UNKNOWN-SENTENCE-LITERAL-INCONSISTENCY-EXPAND");
        $kw36$PRUNE_RT_PROBLEMS_APPLICABLE_WHEN_TYPED_ONLY_WHEN_SPECIALIZATION = SubLObjectFactory.makeKeyword("PRUNE-RT-PROBLEMS-APPLICABLE-WHEN-TYPED-ONLY-WHEN-SPECIALIZATION");
        $list37 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("EVERY-PREDICATES"), removal_modules_conjunctive_pruning.NIL, SubLObjectFactory.makeKeyword("APPLICABILITY"), SubLObjectFactory.makeSymbol("PRUNE-RT-PROBLEMS-APPLICABLE-WHEN-TYPED-ONLY-WHEN-SPECIALIZATION-APPLICABILITY"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_conjunctive_pruning.ZERO_INTEGER, SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("PRUNE-RT-PROBLEMS-APPLICABLE-WHEN-TYPED-ONLY-WHEN-SPECIALIZATION-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("Apply to problems created via residual transformation where the rule has a #$applicableWhenTypedOnlyWhenSpecialization assertion on it.") });
        $sym38$PRUNE_RT_PROBLEMS_APPLICABLE_WHEN_TYPED_ONLY_WHEN_SPECIALIZATION_ = SubLObjectFactory.makeSymbol("PRUNE-RT-PROBLEMS-APPLICABLE-WHEN-TYPED-ONLY-WHEN-SPECIALIZATION-APPLICABILITY");
        $const39$applicableWhenTypedOnlyWhenSpecia = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("applicableWhenTypedOnlyWhenSpecialization"));
        $list40 = ConsesLow.list((SubLObject)removal_modules_conjunctive_pruning.ONE_INTEGER, (SubLObject)removal_modules_conjunctive_pruning.TWO_INTEGER);
        $sym41$PRUNE_RT_PROBLEMS_APPLICABLE_WHEN_TYPED_ONLY_WHEN_SPECIALIZATION_ = SubLObjectFactory.makeSymbol("PRUNE-RT-PROBLEMS-APPLICABLE-WHEN-TYPED-ONLY-WHEN-SPECIALIZATION-EXPAND");
        $kw42$PRUNE_CIRCULAR_TERM_OF_UNIT = SubLObjectFactory.makeKeyword("PRUNE-CIRCULAR-TERM-OF-UNIT");
        $list43 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("EVERY-PREDICATES"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit"))), SubLObjectFactory.makeKeyword("APPLICABILITY"), SubLObjectFactory.makeSymbol("PRUNE-CIRCULAR-TERM-OF-UNIT-APPLICABILITY"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_conjunctive_pruning.ZERO_INTEGER, SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("PRUNE-CIRCULAR-TERM-OF-UNIT-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("Applies to syntactically circular termOfUnit literals, for instance (#$termOfUnit ?var0 (#$MotherFn ?var0))") });
        $sym44$PRUNE_CIRCULAR_TERM_OF_UNIT_APPLICABILITY = SubLObjectFactory.makeSymbol("PRUNE-CIRCULAR-TERM-OF-UNIT-APPLICABILITY");
        $sym45$PRUNE_CIRCULAR_TERM_OF_UNIT_EXPAND = SubLObjectFactory.makeSymbol("PRUNE-CIRCULAR-TERM-OF-UNIT-EXPAND");
    }
    
    public static final class $prune_non_wff_conjunction_applicability$UnaryFunction extends UnaryFunction
    {
        public $prune_non_wff_conjunction_applicability$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PRUNE-NON-WFF-CONJUNCTION-APPLICABILITY"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return removal_modules_conjunctive_pruning.prune_non_wff_conjunction_applicability(arg1);
        }
    }
    
    public static final class $thing_tupleP$UnaryFunction extends UnaryFunction
    {
        public $thing_tupleP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("THING-TUPLE?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return removal_modules_conjunctive_pruning.thing_tupleP(arg1);
        }
    }
    
    public static final class $prune_unknown_sentence_literal_inconsistency_applicability$UnaryFunction extends UnaryFunction
    {
        public $prune_unknown_sentence_literal_inconsistency_applicability$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PRUNE-UNKNOWN-SENTENCE-LITERAL-INCONSISTENCY-APPLICABILITY"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return removal_modules_conjunctive_pruning.prune_unknown_sentence_literal_inconsistency_applicability(arg1);
        }
    }
}

/*

	Total time: 364 ms
	
*/