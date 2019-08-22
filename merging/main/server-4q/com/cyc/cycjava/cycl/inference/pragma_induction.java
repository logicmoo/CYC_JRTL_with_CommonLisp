package com.cyc.cycjava.cycl.inference;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_conjunction;
import static com.cyc.cycjava.cycl.el_utilities.make_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.acons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V10;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.at_var_types;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class pragma_induction extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new pragma_induction();

    public static final String myName = "com.cyc.cycjava_2.cycl.inference.pragma_induction";


    // defparameter
    private static final SubLSymbol $ontology_contraint_gain_threshold$ = makeSymbol("*ONTOLOGY-CONTRAINT-GAIN-THRESHOLD*");

    private static final SubLList $list0 = list(makeSymbol("PRAGMA-SENTENCE"), makeSymbol("POTENTIAL-GAIN"));

    private static final SubLObject $$forwardNonTriggerLiteral = reader_make_constant_shell(makeString("forwardNonTriggerLiteral"));

    private static final SubLList $list2 = cons(makeSymbol("VAR1"), makeSymbol("VAR2"));

    private static final SubLObject $$different = reader_make_constant_shell(makeString("different"));

    private static final SubLSymbol $sym4$GENERALITY_ESTIMATE_ = makeSymbol("GENERALITY-ESTIMATE<");



    private static final SubLSymbol $sym6$TERM__ = makeSymbol("TERM-<");





    private static final SubLSymbol $sym9$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");



    private static final SubLList $list11 = list(makeSymbol("ISA-COLS"), makeSymbol("GENLS-COLS"), makeSymbol("QUOTED-ISA-COLS"));

    private static final SubLList $list12 = list(NIL, NIL, NIL);

    private static final SubLList $list13 = cons(makeSymbol("VAR"), makeSymbol("TUPLE"));

    private static final SubLObject $$Thing = reader_make_constant_shell(makeString("Thing"));

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));



    private static final SubLList $list18 = list(reader_make_constant_shell(makeString("isa")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"));

    private static final SubLList $list19 = list(reader_make_constant_shell(makeString("genls")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"));

    private static final SubLList $list20 = list(makeSymbol("VARIABLE"), makeSymbol("BASELINE-ISAS"), makeSymbol("BASELINE-GENLS"));

    private static final SubLSymbol KBEQ = makeSymbol("KBEQ");

    private static final SubLList $list22 = list(makeSymbol("VARIABLE"), makeSymbol("POTENTIAL-ISAS"), makeSymbol("POTENTIAL-GENLS"));

    private static final SubLSymbol $sym23$_ = makeSymbol(">");





    private static final SubLList $list26 = list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("genls")));

    public static SubLObject some_suggested_pragma_sentences_for_ruleP(final SubLObject rule) {
        return list_utilities.sublisp_boolean(rule_suggested_pragma_sentences(rule, UNPROVIDED));
    }

    public static SubLObject rule_suggested_pragma_sentences(final SubLObject rule, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject hl_pragmas = NIL;
        hl_pragmas = possibly_suggest_ontology_constraints_wrt_rule(rule, mt, hl_pragmas);
        hl_pragmas = possibly_suggest_forward_non_trigger_literals(rule, mt, hl_pragmas);
        hl_pragmas = possibly_suggest_different_literals(rule, mt, hl_pragmas);
        hl_pragmas = kb_utilities.sort_terms(hl_pragmas, NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject variable_map = assertions_high.assertion_hl_to_el_variable_map(rule);
        final SubLObject el_pragmas = bindings.apply_bindings(variable_map, hl_pragmas);
        return el_pragmas;
    }

    public static SubLObject possibly_suggest_ontology_constraints_wrt_rule(final SubLObject rule, final SubLObject mt, SubLObject accumulator) {
        if (accumulator == UNPROVIDED) {
            accumulator = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject constraint_items = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
            constraint_items = rule_suggested_antecedent_ontology_variable_constraints(rule);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = constraint_items;
        SubLObject constraint_item = NIL;
        constraint_item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = constraint_item;
            SubLObject pragma_sentence = NIL;
            SubLObject potential_gain = NIL;
            destructuring_bind_must_consp(current, datum, $list0);
            pragma_sentence = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list0);
            potential_gain = current.first();
            current = current.rest();
            if (NIL == current) {
                if (potential_gain.numGE($ontology_contraint_gain_threshold$.getDynamicValue(thread))) {
                    final SubLObject item_var = pragma_sentence;
                    if (NIL == member(item_var, accumulator, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        accumulator = cons(item_var, accumulator);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list0);
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint_item = cdolist_list_var.first();
        } 
        return accumulator;
    }

    public static SubLObject possibly_suggest_forward_non_trigger_literals(final SubLObject rule, final SubLObject mt, SubLObject accumulator) {
        if (accumulator == UNPROVIDED) {
            accumulator = NIL;
        }
        if (NIL != assertions_high.forward_ruleP(rule)) {
            final SubLObject antecedent_literals = clauses.neg_lits(assertions_high.assertion_cnf(rule));
            if (NIL == list_utilities.singletonP(antecedent_literals)) {
                SubLObject cdolist_list_var;
                final SubLObject antecedent_ontology_literals = cdolist_list_var = rule_antecedent_ontology_literals(rule);
                SubLObject literal = NIL;
                literal = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != variables.variable_p(cycl_utilities.el_formula_arg2(literal, UNPROVIDED))) {
                        final SubLObject item_var;
                        final SubLObject pragma_sentence = item_var = make_unary_formula($$forwardNonTriggerLiteral, literal);
                        if (NIL == member(item_var, accumulator, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            accumulator = cons(item_var, accumulator);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    literal = cdolist_list_var.first();
                } 
            }
        }
        return accumulator;
    }

    public static SubLObject possibly_suggest_different_literals(final SubLObject rule, final SubLObject mt, SubLObject accumulator) {
        if (accumulator == UNPROVIDED) {
            accumulator = NIL;
        }
        final SubLObject antecedent_literals = clauses.neg_lits(assertions_high.assertion_cnf(rule));
        SubLObject list;
        SubLObject literal1;
        SubLObject cdolist_list_var;
        SubLObject literal2;
        SubLObject v_bindings;
        SubLObject cdolist_list_var_$1;
        SubLObject binding;
        SubLObject current;
        SubLObject datum;
        SubLObject var1;
        SubLObject var2;
        SubLObject item_var;
        SubLObject pragma_sentence;
        for (list = NIL, list = antecedent_literals; !list.isAtom(); list = list.rest()) {
            literal1 = list.first();
            cdolist_list_var = list.rest();
            literal2 = NIL;
            literal2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != unification.unify_possible(literal1, literal2)) {
                    v_bindings = unification.unify(copy_list(literal1), literal2, T, UNPROVIDED);
                    if ((NIL != v_bindings) && (NIL == bindings.unification_success_token_p(v_bindings))) {
                        cdolist_list_var_$1 = v_bindings;
                        binding = NIL;
                        binding = cdolist_list_var_$1.first();
                        while (NIL != cdolist_list_var_$1) {
                            datum = current = binding;
                            var1 = NIL;
                            var2 = NIL;
                            destructuring_bind_must_consp(current, datum, $list2);
                            var1 = current.first();
                            current = var2 = current.rest();
                            if (((NIL != variables.variable_p(var1)) && (NIL != variables.variable_p(var2))) && (NIL != list_utilities.not_eql(var1, var2))) {
                                pragma_sentence = item_var = make_formula($$different, kb_utilities.sort_terms(list(var1, var2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                                if (NIL == member(item_var, accumulator, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                    accumulator = cons(item_var, accumulator);
                                }
                            }
                            cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                            binding = cdolist_list_var_$1.first();
                        } 
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                literal2 = cdolist_list_var.first();
            } 
        }
        return accumulator;
    }

    public static SubLObject rule_pragmatic_dnf_for_strengthening_literals(final SubLObject rule, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject open_isa_literals = rule_open_isa_literals(rule);
        final SubLObject open_genls_literals = rule_open_genls_literals(rule);
        SubLObject pragmatic_pos_lits = NIL;
        if ((NIL != open_isa_literals) || (NIL != open_genls_literals)) {
            SubLObject cdolist_list_var = open_isa_literals;
            SubLObject literal = NIL;
            literal = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                pragmatic_pos_lits = rule_pragmatic_pos_lits_for_strengthening_literal(rule, literal, mt, pragmatic_pos_lits);
                cdolist_list_var = cdolist_list_var.rest();
                literal = cdolist_list_var.first();
            } 
            cdolist_list_var = open_genls_literals;
            literal = NIL;
            literal = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                pragmatic_pos_lits = rule_pragmatic_pos_lits_for_strengthening_literal(rule, literal, mt, pragmatic_pos_lits);
                cdolist_list_var = cdolist_list_var.rest();
                literal = cdolist_list_var.first();
            } 
            pragmatic_pos_lits = Sort.sort(pragmatic_pos_lits, $sym4$GENERALITY_ESTIMATE_, FORMULA_ARG2);
            pragmatic_pos_lits = Sort.stable_sort(pragmatic_pos_lits, $sym6$TERM__, ATOMIC_SENTENCE_PREDICATE);
            pragmatic_pos_lits = Sort.stable_sort(pragmatic_pos_lits, $sym6$TERM__, FORMULA_ARG1);
        }
        return clauses.make_dnf(NIL, nreverse(pragmatic_pos_lits));
    }

    public static SubLObject rule_antecedent_variables_min_constraints_alist(final SubLObject rule, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertions_high.rule_assertionP(rule) : "assertions_high.rule_assertionP(rule) " + "CommonSymbols.NIL != assertions_high.rule_assertionP(rule) " + rule;
        if (NIL == mt) {
            mt = assertions_high.assertion_mt(rule);
        }
        final SubLObject cnf = assertions_high.assertion_cnf(rule);
        final SubLObject neg_lits = clauses.neg_lits(cnf);
        final SubLObject antecedent_formula = make_conjunction(neg_lits);
        final SubLObject raw_dict = at_var_types.formula_variables_arg_constraints_dict(antecedent_formula, mt, VARIABLE_P, T);
        SubLObject min_alist = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(raw_dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject data = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject current;
            final SubLObject datum = current = data;
            SubLObject isa_cols = NIL;
            SubLObject genls_cols = NIL;
            SubLObject quoted_isa_cols = NIL;
            destructuring_bind_must_consp(current, datum, $list11);
            isa_cols = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list11);
            genls_cols = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list11);
            quoted_isa_cols = current.first();
            current = current.rest();
            if (NIL == current) {
                isa_cols = genls.min_cols(isa_cols, mt, UNPROVIDED);
                genls_cols = genls.min_cols(genls_cols, mt, UNPROVIDED);
                quoted_isa_cols = genls.min_cols(quoted_isa_cols, mt, UNPROVIDED);
                min_alist = acons(var, list(isa_cols, genls_cols, quoted_isa_cols), min_alist);
            } else {
                cdestructuring_bind_error(datum, $list11);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return nsort_variable_alist(min_alist);
    }

    public static SubLObject rule_antecedent_literal_variables_min_constraints_alist(final SubLObject rule, final SubLObject literal, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject full_alist = rule_antecedent_variables_min_constraints_alist(rule, mt);
        final SubLObject literal_vars = variables.gather_hl_variables(literal);
        SubLObject filtered_alist = NIL;
        SubLObject cdolist_list_var = literal_vars;
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject data = list_utilities.alist_lookup_without_values(full_alist, var, symbol_function(EQ), $list12);
            filtered_alist = acons(var, data, filtered_alist);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        return nsort_variable_alist(filtered_alist);
    }

    public static SubLObject rule_pragmatic_pos_lits_for_strengthening_literal(final SubLObject rule, final SubLObject literal, SubLObject mt, SubLObject accumulator) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (accumulator == UNPROVIDED) {
            accumulator = NIL;
        }
        if (NIL == mt) {
            mt = assertions_high.assertion_mt(rule);
        }
        SubLObject cdolist_list_var;
        final SubLObject data = cdolist_list_var = rule_antecedent_literal_variables_min_constraints_alist(rule, literal, UNPROVIDED);
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject var = NIL;
            SubLObject tuple = NIL;
            destructuring_bind_must_consp(current, datum, $list13);
            var = current.first();
            current = tuple = current.rest();
            SubLObject current_$3;
            final SubLObject datum_$2 = current_$3 = tuple;
            SubLObject isa_cols = NIL;
            SubLObject genls_cols = NIL;
            SubLObject quoted_isa_cols = NIL;
            destructuring_bind_must_consp(current_$3, datum_$2, $list11);
            isa_cols = current_$3.first();
            current_$3 = current_$3.rest();
            destructuring_bind_must_consp(current_$3, datum_$2, $list11);
            genls_cols = current_$3.first();
            current_$3 = current_$3.rest();
            destructuring_bind_must_consp(current_$3, datum_$2, $list11);
            quoted_isa_cols = current_$3.first();
            current_$3 = current_$3.rest();
            if (NIL == current_$3) {
                if (NIL != genls_cols) {
                    SubLObject cdolist_list_var_$4 = genls_cols;
                    SubLObject col = NIL;
                    col = cdolist_list_var_$4.first();
                    while (NIL != cdolist_list_var_$4) {
                        if (!col.eql($$Thing)) {
                            final SubLObject item_var = make_binary_formula($$genls, var, col);
                            if (NIL == member(item_var, accumulator, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                accumulator = cons(item_var, accumulator);
                            }
                        }
                        cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                        col = cdolist_list_var_$4.first();
                    } 
                } else
                    if (NIL != isa_cols) {
                        SubLObject cdolist_list_var_$5 = isa_cols;
                        SubLObject col = NIL;
                        col = cdolist_list_var_$5.first();
                        while (NIL != cdolist_list_var_$5) {
                            if (!col.eql($$Thing)) {
                                final SubLObject item_var = make_binary_formula($$isa, var, col);
                                if (NIL == member(item_var, accumulator, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                    accumulator = cons(item_var, accumulator);
                                }
                            }
                            cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                            col = cdolist_list_var_$5.first();
                        } 
                    }

            } else {
                cdestructuring_bind_error(datum_$2, $list11);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return accumulator;
    }

    public static SubLObject nsort_variable_alist(final SubLObject alist) {
        return Sort.sort(alist, $sym6$TERM__, FIRST);
    }

    public static SubLObject rule_open_isa_literals(final SubLObject rule) {
        final SubLObject neg_lits = clauses.neg_lits(assertions_high.assertion_cnf(rule));
        SubLObject isa_lits = NIL;
        SubLObject cdolist_list_var = neg_lits;
        SubLObject lit = NIL;
        lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != formula_pattern_match.pattern_matches_formula_without_bindings($list18, lit)) {
                isa_lits = cons(lit, isa_lits);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        } 
        return nreverse(isa_lits);
    }

    public static SubLObject rule_open_genls_literals(final SubLObject rule) {
        final SubLObject neg_lits = clauses.neg_lits(assertions_high.assertion_cnf(rule));
        SubLObject genls_lits = NIL;
        SubLObject cdolist_list_var = neg_lits;
        SubLObject lit = NIL;
        lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != formula_pattern_match.pattern_matches_formula_without_bindings($list19, lit)) {
                genls_lits = cons(lit, genls_lits);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        } 
        return nreverse(genls_lits);
    }

    public static SubLObject rule_suggested_antecedent_ontology_variable_constraints(final SubLObject rule) {
        final SubLObject baseline_constraints = rule_antecedent_ontology_variable_baseline_constraints(rule);
        final SubLObject potential_constraints = rule_antecedent_ontology_variable_potential_constraints(rule);
        if (baseline_constraints.equal(potential_constraints)) {
            return NIL;
        }
        SubLObject suggestions = NIL;
        SubLObject cdolist_list_var = baseline_constraints;
        SubLObject baseline_tuple = NIL;
        baseline_tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = baseline_tuple;
            SubLObject variable = NIL;
            SubLObject baseline_isas = NIL;
            SubLObject baseline_genls = NIL;
            destructuring_bind_must_consp(current, datum, $list20);
            variable = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list20);
            baseline_isas = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list20);
            baseline_genls = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject narrowest_baseline_isa = list_utilities.extremal(baseline_isas, symbol_function($sym4$GENERALITY_ESTIMATE_), UNPROVIDED);
                final SubLObject narrowest_baseline_genls = list_utilities.extremal(baseline_genls, symbol_function($sym4$GENERALITY_ESTIMATE_), UNPROVIDED);
                final SubLObject potential_tuple = find(variable, potential_constraints, symbol_function(KBEQ), symbol_function(FIRST), UNPROVIDED, UNPROVIDED);
                if (!baseline_tuple.equal(potential_tuple)) {
                    SubLObject current_$7;
                    final SubLObject datum_$6 = current_$7 = potential_tuple;
                    SubLObject variable_$8 = NIL;
                    SubLObject potential_isas = NIL;
                    SubLObject potential_genls = NIL;
                    destructuring_bind_must_consp(current_$7, datum_$6, $list22);
                    variable_$8 = current_$7.first();
                    current_$7 = current_$7.rest();
                    destructuring_bind_must_consp(current_$7, datum_$6, $list22);
                    potential_isas = current_$7.first();
                    current_$7 = current_$7.rest();
                    destructuring_bind_must_consp(current_$7, datum_$6, $list22);
                    potential_genls = current_$7.first();
                    current_$7 = current_$7.rest();
                    if (NIL == current_$7) {
                        final SubLObject narrowest_potential_isa = list_utilities.extremal(potential_isas, symbol_function($sym4$GENERALITY_ESTIMATE_), UNPROVIDED);
                        final SubLObject narrowest_potential_genls = list_utilities.extremal(potential_genls, symbol_function($sym4$GENERALITY_ESTIMATE_), UNPROVIDED);
                        if (!narrowest_baseline_isa.equal(narrowest_potential_isa)) {
                            final SubLObject baseline_estimate = cardinality_estimates.generality_estimate(narrowest_baseline_isa);
                            final SubLObject potential_estimate = cardinality_estimates.generality_estimate(narrowest_potential_isa);
                            final SubLObject constraint = make_binary_formula($$isa, variable_$8, narrowest_potential_isa);
                            final SubLObject potential_gain = number_utilities.four_significant_digits(generality_estimate_restriction_ratio(baseline_estimate, potential_estimate));
                            suggestions = cons(list(constraint, potential_gain), suggestions);
                        }
                        if (!narrowest_baseline_genls.equal(narrowest_potential_genls)) {
                            final SubLObject baseline_estimate = cardinality_estimates.generality_estimate(narrowest_baseline_genls);
                            final SubLObject potential_estimate = cardinality_estimates.generality_estimate(narrowest_potential_genls);
                            final SubLObject constraint = make_binary_formula($$genls, variable_$8, narrowest_potential_genls);
                            final SubLObject potential_gain = number_utilities.four_significant_digits(generality_estimate_restriction_ratio(baseline_estimate, potential_estimate));
                            suggestions = cons(list(constraint, potential_gain), suggestions);
                        }
                    } else {
                        cdestructuring_bind_error(datum_$6, $list22);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list20);
            }
            cdolist_list_var = cdolist_list_var.rest();
            baseline_tuple = cdolist_list_var.first();
        } 
        suggestions = Sort.sort(suggestions, symbol_function($sym23$_), symbol_function(SECOND));
        return suggestions;
    }

    public static SubLObject generality_estimate_restriction_ratio(final SubLObject baseline, final SubLObject potential) {
        assert NIL != number_utilities.non_negative_number_p(baseline) : "number_utilities.non_negative_number_p(baseline) " + "CommonSymbols.NIL != number_utilities.non_negative_number_p(baseline) " + baseline;
        assert NIL != number_utilities.non_negative_number_p(potential) : "number_utilities.non_negative_number_p(potential) " + "CommonSymbols.NIL != number_utilities.non_negative_number_p(potential) " + potential;
        return divide(baseline, max(ONE_INTEGER, potential));
    }

    public static SubLObject rule_antecedent_ontology_variable_baseline_constraints(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tuples = NIL;
        thread.resetMultipleValues();
        final SubLObject v_variables = rule_antecedent_ontology_variables(rule);
        final SubLObject ontology_literals = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != v_variables) && (NIL != ontology_literals)) {
            final SubLObject baseline_dnf = clauses.make_dnf(NIL, ontology_literals);
            final SubLObject rule_mt = assertions_high.assertion_mt(rule);
            SubLObject cdolist_list_var = v_variables;
            SubLObject variable = NIL;
            variable = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject isa_constraints = genls.min_cols(at_var_types.dnf_variable_isa_constraints(variable, baseline_dnf, rule_mt), rule_mt, UNPROVIDED);
                final SubLObject genls_constraints = genls.min_cols(at_var_types.dnf_variable_genl_constraints(variable, baseline_dnf, rule_mt), rule_mt, UNPROVIDED);
                tuples = cons(list(variable, isa_constraints, genls_constraints), tuples);
                cdolist_list_var = cdolist_list_var.rest();
                variable = cdolist_list_var.first();
            } 
        }
        return nreverse(tuples);
    }

    public static SubLObject rule_antecedent_ontology_variable_potential_constraints(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tuples = NIL;
        thread.resetMultipleValues();
        final SubLObject v_variables = rule_antecedent_ontology_variables(rule);
        final SubLObject ontology_literals = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != v_variables) && (NIL != ontology_literals)) {
            final SubLObject rule_mt = assertions_high.assertion_mt(rule);
            final SubLObject antecedent_dnf = rule_antecedent_dnf(rule);
            final SubLObject pragmatic_dnf = inference_worker_transformation.rule_assertion_pragmatic_requirements_dnf(rule, rule_mt);
            final SubLObject full_dnf = inference_worker_transformation.merge_dnf(antecedent_dnf, pragmatic_dnf);
            SubLObject cdolist_list_var = v_variables;
            SubLObject variable = NIL;
            variable = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject isa_constraints = genls.min_cols(at_var_types.dnf_variable_isa_constraints(variable, full_dnf, rule_mt), rule_mt, UNPROVIDED);
                final SubLObject genls_constraints = genls.min_cols(at_var_types.dnf_variable_genl_constraints(variable, full_dnf, rule_mt), rule_mt, UNPROVIDED);
                tuples = cons(list(variable, isa_constraints, genls_constraints), tuples);
                cdolist_list_var = cdolist_list_var.rest();
                variable = cdolist_list_var.first();
            } 
        }
        return nreverse(tuples);
    }

    public static SubLObject rule_antecedent_ontology_variables(final SubLObject rule) {
        final SubLObject ontology_literals = rule_antecedent_ontology_literals(rule);
        final SubLObject v_variables = variables.gather_hl_variables(ontology_literals);
        return values(v_variables, ontology_literals);
    }

    public static SubLObject rule_antecedent_ontology_literals(final SubLObject rule) {
        final SubLObject antecedent_lits = rule_neg_lits(rule);
        SubLObject ontology_literals = NIL;
        SubLObject cdolist_list_var = antecedent_lits;
        SubLObject lit = NIL;
        lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != list_utilities.member_kbeqP(cycl_utilities.atomic_sentence_predicate(lit), $list26)) {
                ontology_literals = cons(lit, ontology_literals);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        } 
        return nreverse(ontology_literals);
    }

    public static SubLObject rule_antecedent_dnf(final SubLObject rule) {
        assert NIL != assertions_high.rule_assertionP(rule) : "assertions_high.rule_assertionP(rule) " + "CommonSymbols.NIL != assertions_high.rule_assertionP(rule) " + rule;
        final SubLObject antecedent_lits = rule_neg_lits(rule);
        final SubLObject dnf = clauses.make_dnf(NIL, antecedent_lits);
        return dnf;
    }

    public static SubLObject rule_neg_lits(final SubLObject rule) {
        return clauses.neg_lits(assertions_high.assertion_cnf(rule));
    }

    public static SubLObject rule_pos_lits(final SubLObject rule) {
        return clauses.pos_lits(assertions_high.assertion_cnf(rule));
    }

    public static SubLObject declare_pragma_induction_file() {
        declareFunction("some_suggested_pragma_sentences_for_ruleP", "SOME-SUGGESTED-PRAGMA-SENTENCES-FOR-RULE?", 1, 0, false);
        declareFunction("rule_suggested_pragma_sentences", "RULE-SUGGESTED-PRAGMA-SENTENCES", 1, 1, false);
        declareFunction("possibly_suggest_ontology_constraints_wrt_rule", "POSSIBLY-SUGGEST-ONTOLOGY-CONSTRAINTS-WRT-RULE", 2, 1, false);
        declareFunction("possibly_suggest_forward_non_trigger_literals", "POSSIBLY-SUGGEST-FORWARD-NON-TRIGGER-LITERALS", 2, 1, false);
        declareFunction("possibly_suggest_different_literals", "POSSIBLY-SUGGEST-DIFFERENT-LITERALS", 2, 1, false);
        declareFunction("rule_pragmatic_dnf_for_strengthening_literals", "RULE-PRAGMATIC-DNF-FOR-STRENGTHENING-LITERALS", 1, 1, false);
        declareFunction("rule_antecedent_variables_min_constraints_alist", "RULE-ANTECEDENT-VARIABLES-MIN-CONSTRAINTS-ALIST", 1, 1, false);
        declareFunction("rule_antecedent_literal_variables_min_constraints_alist", "RULE-ANTECEDENT-LITERAL-VARIABLES-MIN-CONSTRAINTS-ALIST", 2, 1, false);
        declareFunction("rule_pragmatic_pos_lits_for_strengthening_literal", "RULE-PRAGMATIC-POS-LITS-FOR-STRENGTHENING-LITERAL", 2, 2, false);
        declareFunction("nsort_variable_alist", "NSORT-VARIABLE-ALIST", 1, 0, false);
        declareFunction("rule_open_isa_literals", "RULE-OPEN-ISA-LITERALS", 1, 0, false);
        declareFunction("rule_open_genls_literals", "RULE-OPEN-GENLS-LITERALS", 1, 0, false);
        declareFunction("rule_suggested_antecedent_ontology_variable_constraints", "RULE-SUGGESTED-ANTECEDENT-ONTOLOGY-VARIABLE-CONSTRAINTS", 1, 0, false);
        declareFunction("generality_estimate_restriction_ratio", "GENERALITY-ESTIMATE-RESTRICTION-RATIO", 2, 0, false);
        declareFunction("rule_antecedent_ontology_variable_baseline_constraints", "RULE-ANTECEDENT-ONTOLOGY-VARIABLE-BASELINE-CONSTRAINTS", 1, 0, false);
        declareFunction("rule_antecedent_ontology_variable_potential_constraints", "RULE-ANTECEDENT-ONTOLOGY-VARIABLE-POTENTIAL-CONSTRAINTS", 1, 0, false);
        declareFunction("rule_antecedent_ontology_variables", "RULE-ANTECEDENT-ONTOLOGY-VARIABLES", 1, 0, false);
        declareFunction("rule_antecedent_ontology_literals", "RULE-ANTECEDENT-ONTOLOGY-LITERALS", 1, 0, false);
        declareFunction("rule_antecedent_dnf", "RULE-ANTECEDENT-DNF", 1, 0, false);
        declareFunction("rule_neg_lits", "RULE-NEG-LITS", 1, 0, false);
        declareFunction("rule_pos_lits", "RULE-POS-LITS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_pragma_induction_file() {
        defparameter("*ONTOLOGY-CONTRAINT-GAIN-THRESHOLD*", ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject setup_pragma_induction_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_pragma_induction_file();
    }

    @Override
    public void initializeVariables() {
        init_pragma_induction_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_pragma_induction_file();
    }

    
}

/**
 * Total time: 182 ms
 */
