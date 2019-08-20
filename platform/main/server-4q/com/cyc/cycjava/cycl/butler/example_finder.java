/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.butler;


import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.el_utilities.el_conjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_implication_p;
import static com.cyc.cycjava.cycl.el_utilities.referenced_variables;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.note_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sublis;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.clausifier;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      EXAMPLE-FINDER
 * source file: /cyc/top/cycl/butler/example-finder.lisp
 * created:     2019/07/03 17:39:04
 */
public final class example_finder extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new example_finder();



    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $example_finder_max_predicate_extent$ = makeSymbol("*EXAMPLE-FINDER-MAX-PREDICATE-EXTENT*");



    private static final SubLInteger $int$10000 = makeInteger(10000);



    static private final SubLSymbol $sym9$_ = makeSymbol("<");

    private static final SubLInteger $int$50 = makeInteger(50);



    static private final SubLSymbol $sym14$EL_VAR_ = makeSymbol("EL-VAR?");





    private static final SubLSymbol ALL_SPECS = makeSymbol("ALL-SPECS");

    // Definitions
    public static final SubLObject example_bindings_for_rule_alt(SubLObject rule, SubLObject mt, SubLObject cut_off, SubLObject how_many) {
        if (cut_off == UNPROVIDED) {
            cut_off = TWENTY_INTEGER;
        }
        if (how_many == UNPROVIDED) {
            how_many = ONE_INTEGER;
        }
        SubLTrampolineFile.checkType(rule, EL_IMPLICATION_P);
        if (NIL == referenced_variables(rule, UNPROVIDED)) {
            return rule;
        }
        {
            SubLObject formula = (NIL != el_conjunction_p(rule)) ? ((SubLObject) (cycl_utilities.formula_arg1(rule, UNPROVIDED))) : list($$and, cycl_utilities.formula_arg1(rule, UNPROVIDED));
            SubLObject item_var = cycl_utilities.formula_arg2(rule, UNPROVIDED);
            if (NIL == member(item_var, formula, symbol_function(EQL), symbol_function(IDENTITY))) {
                {
                    SubLObject new_cons = cons(item_var, NIL);
                    SubLObject list = formula;
                    if (NIL != list) {
                        subl_macros.rplacd_last(list, new_cons);
                    } else {
                        formula = new_cons;
                    }
                }
            }
            {
                SubLObject v_bindings = inference_kernel.new_cyc_query(formula, mt, list($MAX_NUMBER, how_many, $MAX_TIME, cut_off));
                if (NIL == v_bindings) {
                    {
                        SubLObject cnf = clausifier.clausal_form(rule, mt, UNPROVIDED);
                        SubLObject v_clauses = append(clauses.pos_lits(cnf.first()), clauses.neg_lits(cnf.first()));
                        SubLObject v_bindings_1 = com.cyc.cycjava.cycl.butler.example_finder.example_bindings_for_clauses_list(v_clauses);
                        return sublis(v_bindings_1, rule, UNPROVIDED, UNPROVIDED);
                    }
                }
                {
                    SubLObject candidates = NIL;
                    SubLObject cdolist_list_var = list_utilities.randomize_list(v_bindings);
                    SubLObject bind = NIL;
                    for (bind = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , bind = cdolist_list_var.first()) {
                        candidates = cons(subst(sublis(bind, rule, UNPROVIDED, UNPROVIDED), bind, bind, UNPROVIDED, UNPROVIDED), candidates);
                    }
                    if (NIL != list_utilities.lengthLE(candidates, how_many, UNPROVIDED)) {
                        return candidates;
                    } else {
                        return subseq(candidates, ZERO_INTEGER, how_many);
                    }
                }
            }
        }
    }

    // Definitions
    public static SubLObject example_bindings_for_rule(final SubLObject rule, final SubLObject mt, SubLObject cut_off, SubLObject how_many) {
        if (cut_off == UNPROVIDED) {
            cut_off = TWENTY_INTEGER;
        }
        if (how_many == UNPROVIDED) {
            how_many = ONE_INTEGER;
        }
        assert NIL != el_implication_p(rule) : "! el_utilities.el_implication_p(rule) " + ("el_utilities.el_implication_p(rule) " + "CommonSymbols.NIL != el_utilities.el_implication_p(rule) ") + rule;
        if (NIL == referenced_variables(rule, UNPROVIDED)) {
            return rule;
        }
        SubLObject formula = (NIL != el_conjunction_p(rule)) ? cycl_utilities.formula_arg1(rule, UNPROVIDED) : list($$and, cycl_utilities.formula_arg1(rule, UNPROVIDED));
        final SubLObject item_var = cycl_utilities.formula_arg2(rule, UNPROVIDED);
        if (NIL == member(item_var, formula, symbol_function(EQL), symbol_function(IDENTITY))) {
            final SubLObject new_cons = cons(item_var, NIL);
            final SubLObject list = formula;
            if (NIL != list) {
                subl_macros.rplacd_last(list, new_cons);
            } else {
                formula = new_cons;
            }
        }
        final SubLObject v_bindings = inference_kernel.new_cyc_query(formula, mt, list($MAX_NUMBER, how_many, $MAX_TIME, cut_off));
        if (NIL == v_bindings) {
            final SubLObject cnf = clausifier.clausal_form(rule, mt, UNPROVIDED);
            final SubLObject v_clauses = append(clauses.pos_lits(cnf.first()), clauses.neg_lits(cnf.first()));
            final SubLObject v_bindings_$1 = example_bindings_for_clauses_list(v_clauses);
            return sublis(v_bindings_$1, rule, UNPROVIDED, UNPROVIDED);
        }
        SubLObject candidates = NIL;
        SubLObject cdolist_list_var = list_utilities.randomize_list(v_bindings);
        SubLObject bind = NIL;
        bind = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            candidates = cons(subst(sublis(bind, rule, UNPROVIDED, UNPROVIDED), bind, bind, UNPROVIDED, UNPROVIDED), candidates);
            cdolist_list_var = cdolist_list_var.rest();
            bind = cdolist_list_var.first();
        } 
        if (NIL != list_utilities.lengthLE(candidates, how_many, UNPROVIDED)) {
            return candidates;
        }
        return subseq(candidates, ZERO_INTEGER, how_many);
    }

    /**
     * Only return the conclusion.
     */
    @LispMethod(comment = "Only return the conclusion.")
    public static final SubLObject example_consequents_for_rule_alt(SubLObject rule, SubLObject mt, SubLObject cut_off, SubLObject how_many) {
        if (cut_off == UNPROVIDED) {
            cut_off = TWENTY_INTEGER;
        }
        if (how_many == UNPROVIDED) {
            how_many = ONE_INTEGER;
        }
        SubLTrampolineFile.checkType(rule, EL_IMPLICATION_P);
        {
            SubLObject instantiated_rules = com.cyc.cycjava.cycl.butler.example_finder.example_bindings_for_rule(rule, mt, cut_off, how_many);
            SubLObject consequents = NIL;
            SubLObject cdolist_list_var = instantiated_rules;
            SubLObject instantiated_rule = NIL;
            for (instantiated_rule = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , instantiated_rule = cdolist_list_var.first()) {
                {
                    SubLObject consequent = cycl_utilities.formula_arg2(instantiated_rule, UNPROVIDED);
                    consequents = cons(consequent, consequents);
                }
            }
            return nreverse(consequents);
        }
    }

    /**
     * Only return the conclusion.
     */
    @LispMethod(comment = "Only return the conclusion.")
    public static SubLObject example_consequents_for_rule(final SubLObject rule, final SubLObject mt, SubLObject cut_off, SubLObject how_many) {
        if (cut_off == UNPROVIDED) {
            cut_off = TWENTY_INTEGER;
        }
        if (how_many == UNPROVIDED) {
            how_many = ONE_INTEGER;
        }
        assert NIL != el_implication_p(rule) : "! el_utilities.el_implication_p(rule) " + ("el_utilities.el_implication_p(rule) " + "CommonSymbols.NIL != el_utilities.el_implication_p(rule) ") + rule;
        final SubLObject instantiated_rules = example_bindings_for_rule(rule, mt, cut_off, how_many);
        SubLObject consequents = NIL;
        SubLObject cdolist_list_var = instantiated_rules;
        SubLObject instantiated_rule = NIL;
        instantiated_rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject consequent = cycl_utilities.formula_arg2(instantiated_rule, UNPROVIDED);
            consequents = cons(consequent, consequents);
            cdolist_list_var = cdolist_list_var.rest();
            instantiated_rule = cdolist_list_var.first();
        } 
        return nreverse(consequents);
    }

    /**
     *
     *
     * @param term
    fort-p
     * 		
     * @param arg-isa-constraints
     * 		list of collections
     * @param arg-genl-constraints
     * 		list of collections
     * @return whether term is an instance of all the arg-isa-constraints and a spec of all the arg-genl-constraints.
     */
    @LispMethod(comment = "@param term\nfort-p\r\n\t\t\r\n@param arg-isa-constraints\r\n\t\tlist of collections\r\n@param arg-genl-constraints\r\n\t\tlist of collections\r\n@return whether term is an instance of all the arg-isa-constraints and a spec of all the arg-genl-constraints.")
    public static final SubLObject term_meets_arg_isa_and_arg_genl_constraints_alt(SubLObject v_term, SubLObject arg_isa_constraints, SubLObject arg_genl_constraints) {
        {
            SubLObject cdolist_list_var = arg_isa_constraints;
            SubLObject isa_constraint = NIL;
            for (isa_constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , isa_constraint = cdolist_list_var.first()) {
                if ((NIL != isa_constraint) && (NIL == isa.isa_in_any_mtP(v_term, isa_constraint))) {
                    return NIL;
                }
            }
        }
        {
            SubLObject cdolist_list_var = arg_genl_constraints;
            SubLObject genl_constraint = NIL;
            for (genl_constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl_constraint = cdolist_list_var.first()) {
                if ((NIL != genl_constraint) && (NIL == genls.genl_in_any_mtP(v_term, genl_constraint))) {
                    return NIL;
                }
            }
        }
        return T;
    }

    /**
     *
     *
     * @param term
    fort-p
     * 		
     * @param arg-isa-constraints
     * 		list of collections
     * @param arg-genl-constraints
     * 		list of collections
     * @return whether term is an instance of all the arg-isa-constraints and a spec of all the arg-genl-constraints.
     */
    @LispMethod(comment = "@param term\nfort-p\r\n\t\t\r\n@param arg-isa-constraints\r\n\t\tlist of collections\r\n@param arg-genl-constraints\r\n\t\tlist of collections\r\n@return whether term is an instance of all the arg-isa-constraints and a spec of all the arg-genl-constraints.")
    public static SubLObject term_meets_arg_isa_and_arg_genl_constraints(final SubLObject v_term, final SubLObject arg_isa_constraints, final SubLObject arg_genl_constraints) {
        SubLObject cdolist_list_var = arg_isa_constraints;
        SubLObject isa_constraint = NIL;
        isa_constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != isa_constraint) && (NIL == isa.isa_in_any_mtP(v_term, isa_constraint))) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            isa_constraint = cdolist_list_var.first();
        } 
        cdolist_list_var = arg_genl_constraints;
        SubLObject genl_constraint = NIL;
        genl_constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != genl_constraint) && (NIL == genls.genl_in_any_mtP(v_term, genl_constraint))) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            genl_constraint = cdolist_list_var.first();
        } 
        return T;
    }

    /**
     * A helper function for example-bindings-for-clauses list.
     *
     * @param VAR
     * 		an el-variable
     * @param CLAUSES-LIST
     * 		a list of clauses
     * @param ARG-ISA-CONSTRAINTS
     * 		a list of collections
     * @param ARG-GENL-CONSTRAINTS
     * 		a list of collections
     * @return a list of cyc forts, each of which is a possible instantiation for VAR, based on the predicate extents of the
    relevant predicates in clauses-list, and that satisfies all arg-isa and arg-genl constraints mentioned.
     */
    @LispMethod(comment = "A helper function for example-bindings-for-clauses list.\r\n\r\n@param VAR\r\n\t\tan el-variable\r\n@param CLAUSES-LIST\r\n\t\ta list of clauses\r\n@param ARG-ISA-CONSTRAINTS\r\n\t\ta list of collections\r\n@param ARG-GENL-CONSTRAINTS\r\n\t\ta list of collections\r\n@return a list of cyc forts, each of which is a possible instantiation for VAR, based on the predicate extents of the\r\nrelevant predicates in clauses-list, and that satisfies all arg-isa and arg-genl constraints mentioned.")
    public static final SubLObject get_example_bindings_from_previous_assertions_alt(SubLObject var, SubLObject clauses_list, SubLObject arg_isa_constraints, SubLObject arg_genl_constraints, SubLObject max_examples_per_clause) {
        if (arg_isa_constraints == UNPROVIDED) {
            arg_isa_constraints = NIL;
        }
        if (arg_genl_constraints == UNPROVIDED) {
            arg_genl_constraints = NIL;
        }
        if (max_examples_per_clause == UNPROVIDED) {
            max_examples_per_clause = TEN_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject examples = NIL;
                SubLObject no_narts = NIL;
                SubLObject stop = NIL;
                SubLObject v_term = NIL;
                SubLObject cdolist_list_var = clauses_list;
                SubLObject clause = NIL;
                for (clause = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , clause = cdolist_list_var.first()) {
                    if (NIL != position(var, clause, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        {
                            SubLObject index = position(var, clause, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject examples_per_clause = NIL;
                            SubLObject no_narts_per_clause = NIL;
                            stop = NIL;
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                                    mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                                    if (kb_indexing.num_predicate_extent_index(clause.first(), UNPROVIDED).numL($example_finder_max_predicate_extent$.getGlobalValue())) {
                                        {
                                            SubLObject pred_var = clause.first();
                                            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                                    SubLObject done_var = stop;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                                        {
                                                                            SubLObject done_var_2 = stop;
                                                                            SubLObject token_var_3 = NIL;
                                                                            while (NIL == done_var_2) {
                                                                                {
                                                                                    SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_3);
                                                                                    SubLObject valid_4 = makeBoolean(token_var_3 != gaf);
                                                                                    if (NIL != valid_4) {
                                                                                        v_term = nth(index, assertions_high.assertion_formula(gaf));
                                                                                        if (NIL != com.cyc.cycjava.cycl.butler.example_finder.term_meets_arg_isa_and_arg_genl_constraints(v_term, arg_isa_constraints, arg_genl_constraints)) {
                                                                                            {
                                                                                                SubLObject item_var = v_term;
                                                                                                if (NIL == member(item_var, examples_per_clause, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                    examples_per_clause = cons(item_var, examples_per_clause);
                                                                                                }
                                                                                            }
                                                                                            if (NIL != constant_p(v_term)) {
                                                                                                {
                                                                                                    SubLObject item_var = v_term;
                                                                                                    if (NIL == member(item_var, no_narts_per_clause, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                        no_narts_per_clause = cons(item_var, no_narts_per_clause);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            if (length(no_narts_per_clause).numGE(max_examples_per_clause)) {
                                                                                                stop = T;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    done_var_2 = makeBoolean((NIL == valid_4) || (NIL != stop));
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_5, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean((NIL == valid) || (NIL != stop));
                                                        }
                                                    } 
                                                }
                                            }
                                        }
                                    }
                                    examples = append(examples_per_clause, examples);
                                    no_narts = append(no_narts_per_clause, no_narts);
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
                if (NIL != no_narts) {
                    return no_narts;
                }
                return examples;
            }
        }
    }

    /**
     * A helper function for example-bindings-for-clauses list.
     *
     * @param VAR
     * 		an el-variable
     * @param CLAUSES-LIST
     * 		a list of clauses
     * @param ARG-ISA-CONSTRAINTS
     * 		a list of collections
     * @param ARG-GENL-CONSTRAINTS
     * 		a list of collections
     * @return a list of cyc forts, each of which is a possible instantiation for VAR, based on the predicate extents of the
    relevant predicates in clauses-list, and that satisfies all arg-isa and arg-genl constraints mentioned.
     */
    @LispMethod(comment = "A helper function for example-bindings-for-clauses list.\r\n\r\n@param VAR\r\n\t\tan el-variable\r\n@param CLAUSES-LIST\r\n\t\ta list of clauses\r\n@param ARG-ISA-CONSTRAINTS\r\n\t\ta list of collections\r\n@param ARG-GENL-CONSTRAINTS\r\n\t\ta list of collections\r\n@return a list of cyc forts, each of which is a possible instantiation for VAR, based on the predicate extents of the\r\nrelevant predicates in clauses-list, and that satisfies all arg-isa and arg-genl constraints mentioned.")
    public static SubLObject get_example_bindings_from_previous_assertions(final SubLObject var, final SubLObject clauses_list, SubLObject arg_isa_constraints, SubLObject arg_genl_constraints, SubLObject max_examples_per_clause) {
        if (arg_isa_constraints == UNPROVIDED) {
            arg_isa_constraints = NIL;
        }
        if (arg_genl_constraints == UNPROVIDED) {
            arg_genl_constraints = NIL;
        }
        if (max_examples_per_clause == UNPROVIDED) {
            max_examples_per_clause = TEN_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject examples = NIL;
        SubLObject no_narts = NIL;
        SubLObject stop = NIL;
        SubLObject v_term = NIL;
        SubLObject cdolist_list_var = clauses_list;
        SubLObject clause = NIL;
        clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != position(var, clause, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                final SubLObject index = position(var, clause, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject examples_per_clause = NIL;
                SubLObject no_narts_per_clause = NIL;
                stop = NIL;
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                    mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                    if (kb_indexing.num_predicate_extent_index(clause.first(), UNPROVIDED).numL($example_finder_max_predicate_extent$.getGlobalValue())) {
                        final SubLObject pred_var = clause.first();
                        if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                            final SubLObject str = NIL;
                            final SubLObject _prev_bind_0_$2 = $progress_start_time$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$3 = $progress_last_pacification_time$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                            final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                            final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                            final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                            try {
                                $progress_start_time$.bind(get_universal_time(), thread);
                                $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                                $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                                $progress_notification_count$.bind(ZERO_INTEGER, thread);
                                $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                                $progress_count$.bind(ZERO_INTEGER, thread);
                                $is_noting_progressP$.bind(T, thread);
                                $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                                noting_progress_preamble(str);
                                final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                SubLObject done_var = stop;
                                final SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                    if (NIL != valid) {
                                        note_progress();
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                            SubLObject done_var_$4 = stop;
                                            final SubLObject token_var_$5 = NIL;
                                            while (NIL == done_var_$4) {
                                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                                final SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(gaf));
                                                if (NIL != valid_$6) {
                                                    v_term = nth(index, assertions_high.assertion_formula(gaf));
                                                    if (NIL != term_meets_arg_isa_and_arg_genl_constraints(v_term, arg_isa_constraints, arg_genl_constraints)) {
                                                        SubLObject item_var = v_term;
                                                        if (NIL == member(item_var, examples_per_clause, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                            examples_per_clause = cons(item_var, examples_per_clause);
                                                        }
                                                        if (NIL != constant_p(v_term)) {
                                                            item_var = v_term;
                                                            if (NIL == member(item_var, no_narts_per_clause, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                no_narts_per_clause = cons(item_var, no_narts_per_clause);
                                                            }
                                                        }
                                                        if (length(no_narts_per_clause).numGE(max_examples_per_clause)) {
                                                            stop = T;
                                                        }
                                                    }
                                                }
                                                done_var_$4 = makeBoolean((NIL == valid_$6) || (NIL != stop));
                                            } 
                                        } finally {
                                            final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values = getValuesAsVector();
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                restoreValuesFromVector(_values);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                            }
                                        }
                                    }
                                    done_var = makeBoolean((NIL == valid) || (NIL != stop));
                                } 
                                noting_progress_postamble();
                            } finally {
                                $silent_progressP$.rebind(_prev_bind_8, thread);
                                $is_noting_progressP$.rebind(_prev_bind_7, thread);
                                $progress_count$.rebind(_prev_bind_6, thread);
                                $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                                $progress_notification_count$.rebind(_prev_bind_4, thread);
                                $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                                $progress_last_pacification_time$.rebind(_prev_bind_1_$3, thread);
                                $progress_start_time$.rebind(_prev_bind_0_$2, thread);
                            }
                        }
                    }
                    examples = append(examples_per_clause, examples);
                    no_narts = append(no_narts_per_clause, no_narts);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        } 
        if (NIL != no_narts) {
            return no_narts;
        }
        return examples;
    }

    /**
     * A helper function for example-bindings-for-clauses-list.
     *
     * @param COLLECTIONS
     * 		a list of collections
     * @return an instance of all of collections, or if none can be found, an instance of at least one of collections
     */
    @LispMethod(comment = "A helper function for example-bindings-for-clauses-list.\r\n\r\n@param COLLECTIONS\r\n\t\ta list of collections\r\n@return an instance of all of collections, or if none can be found, an instance of at least one of collections")
    public static final SubLObject get_example_instance_from_collection_list_alt(SubLObject collections) {
        SubLTrampolineFile.checkType(collections, LISTP);
        if (NIL == collections) {
            return NIL;
        }
        {
            SubLObject possibilities = NIL;
            SubLObject no_narts = NIL;
            SubLObject constraint = (NIL != list_utilities.singletonP(collections)) ? ((SubLObject) (collections.first())) : list_utilities.extremal(collections, $sym9$_, GENERALITY_ESTIMATE);
            if (NIL != list_utilities.singletonP(collections)) {
                possibilities = isa.sample_leaf_instances(constraint, $int$50, UNPROVIDED, UNPROVIDED);
                if (NIL == possibilities) {
                    possibilities = isa.all_fort_instances_in_all_mts(constraint);
                }
                if (NIL == possibilities) {
                    possibilities = list(list($$GenericInstanceFn, constraint));
                }
            } else {
                possibilities = isa.sample_leaf_instances(constraint, $int$50, UNPROVIDED, UNPROVIDED);
                if (NIL == possibilities) {
                    possibilities = isa.all_fort_instances_in_all_mts(constraint);
                }
                if (NIL == possibilities) {
                    possibilities = list(list($$GenericInstanceFn, constraint));
                }
            }
            no_narts = list_utilities.remove_if_not(CONSTANT_P, possibilities, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL != no_narts ? ((SubLObject) (list_utilities.random_element(no_narts))) : list_utilities.random_element(possibilities);
        }
    }

    /**
     * A helper function for example-bindings-for-clauses-list.
     *
     * @param COLLECTIONS
     * 		a list of collections
     * @return an instance of all of collections, or if none can be found, an instance of at least one of collections
     */
    @LispMethod(comment = "A helper function for example-bindings-for-clauses-list.\r\n\r\n@param COLLECTIONS\r\n\t\ta list of collections\r\n@return an instance of all of collections, or if none can be found, an instance of at least one of collections")
    public static SubLObject get_example_instance_from_collection_list(final SubLObject collections) {
        assert NIL != listp(collections) : "! listp(collections) " + ("Types.listp(collections) " + "CommonSymbols.NIL != Types.listp(collections) ") + collections;
        if (NIL == collections) {
            return NIL;
        }
        SubLObject possibilities = NIL;
        SubLObject no_narts = NIL;
        final SubLObject constraint = (NIL != list_utilities.singletonP(collections)) ? collections.first() : list_utilities.extremal(collections, $sym9$_, GENERALITY_ESTIMATE);
        if (NIL != list_utilities.singletonP(collections)) {
            possibilities = isa.sample_leaf_instances(constraint, $int$50, UNPROVIDED, UNPROVIDED);
            if (NIL == possibilities) {
                possibilities = isa.all_fort_instances_in_all_mts(constraint);
            }
            if (NIL == possibilities) {
                possibilities = list(list($$GenericInstanceFn, constraint));
            }
        } else {
            possibilities = isa.sample_leaf_instances(constraint, $int$50, UNPROVIDED, UNPROVIDED);
            if (NIL == possibilities) {
                possibilities = isa.all_fort_instances_in_all_mts(constraint);
            }
            if (NIL == possibilities) {
                possibilities = list(list($$GenericInstanceFn, constraint));
            }
        }
        no_narts = list_utilities.remove_if_not(CONSTANT_P, possibilities, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL != no_narts ? list_utilities.random_element(no_narts) : list_utilities.random_element(possibilities);
    }

    /**
     *
     *
     * @param CLAUSES
     * 		a list of clauses
     * @return an a-list of one set of possible bindings for all free variables in
    clauses using the arg-isa and arg-genl constraints on the predicates.
    Generally, uses this algorithm, which has had its order modified slightly for clarity:
    1.  Take all the variables in clauses
    2.  For each variable, find all the clauses that mention it.
    3.  For each clause that mentions it, find the predicate of that clause.
    4.  Find the arg-isa and arg-genl constraints for that predicate in the argument place of the variable
    5.  Look through the predicate extent of that predicate for possible instantiations of that argument place that
    fulfill all known arg-isa and arg-genl constraints on the variable in CLAUSES.  If any good ones are found,
    return a random one from them.
    6.  If nothing good is found in the predicate extents, then by brute force try to find any cyc object that fulfills at least most of the arg-isa and arg-genl constraints on the variable, by gradually relaxing those constraints until something is found.

    Note that the constraints are not relaxed PERFECTLY gradually, but in somewhat arbitrarily picked
    larger steps, to keep the function from taking forever.

    Also, interArgIsa constraints and all other asserted constraints are currently ignored.  typicalArgIsa constraints, in particular, should be implemented in the future.

    Even more generally, instead of considering each variable in isolation, this function would return more realistic examples
    if it looked at multiple variables simulataneously, looking to satisfy whole pieces of clauses list with real, true examples.
     */
    @LispMethod(comment = "@param CLAUSES\r\n\t\ta list of clauses\r\n@return an a-list of one set of possible bindings for all free variables in\r\nclauses using the arg-isa and arg-genl constraints on the predicates.\r\nGenerally, uses this algorithm, which has had its order modified slightly for clarity:\r\n1.  Take all the variables in clauses\r\n2.  For each variable, find all the clauses that mention it.\r\n3.  For each clause that mentions it, find the predicate of that clause.\r\n4.  Find the arg-isa and arg-genl constraints for that predicate in the argument place of the variable\r\n5.  Look through the predicate extent of that predicate for possible instantiations of that argument place that\r\nfulfill all known arg-isa and arg-genl constraints on the variable in CLAUSES.  If any good ones are found,\r\nreturn a random one from them.\r\n6.  If nothing good is found in the predicate extents, then by brute force try to find any cyc object that fulfills at least most of the arg-isa and arg-genl constraints on the variable, by gradually relaxing those constraints until something is found.\r\n\r\nNote that the constraints are not relaxed PERFECTLY gradually, but in somewhat arbitrarily picked\r\nlarger steps, to keep the function from taking forever.\r\n\r\nAlso, interArgIsa constraints and all other asserted constraints are currently ignored.  typicalArgIsa constraints, in particular, should be implemented in the future.\r\n\r\nEven more generally, instead of considering each variable in isolation, this function would return more realistic examples\r\nif it looked at multiple variables simulataneously, looking to satisfy whole pieces of clauses list with real, true examples.")
    public static final SubLObject example_bindings_for_clauses_list_alt(SubLObject v_clauses) {
        {
            SubLObject v_variables = cycl_utilities.formula_gather(v_clauses, $sym14$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject arg_isa_constraints = NIL;
            SubLObject arg_genl_constraints = NIL;
            SubLObject arg_isa_constraints_for_var = NIL;
            SubLObject arg_genl_constraints_for_var = NIL;
            SubLObject index = NIL;
            SubLObject v_bindings = NIL;
            SubLObject example = NIL;
            SubLObject no_narts = NIL;
            SubLObject examples_from_previous = NIL;
            {
                SubLObject cdolist_list_var = v_variables;
                SubLObject var = NIL;
                for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                    arg_isa_constraints_for_var = NIL;
                    arg_genl_constraints_for_var = NIL;
                    {
                        SubLObject cdolist_list_var_6 = v_clauses;
                        SubLObject clause = NIL;
                        for (clause = cdolist_list_var_6.first(); NIL != cdolist_list_var_6; cdolist_list_var_6 = cdolist_list_var_6.rest() , clause = cdolist_list_var_6.first()) {
                            index = position(var, clause, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            if (NIL != index) {
                                arg_isa_constraints_for_var = append(kb_accessors.argn_isa(clause.first(), index, UNPROVIDED), arg_isa_constraints_for_var);
                                arg_genl_constraints_for_var = append(kb_accessors.argn_genl(clause.first(), index, UNPROVIDED), arg_genl_constraints_for_var);
                                if (((NIL != genl_predicates.genl_predicateP(clause.first(), $$isa, UNPROVIDED, UNPROVIDED)) && index.numE(ONE_INTEGER)) && (NIL != forts.fort_p(nth(TWO_INTEGER, clause)))) {
                                    arg_isa_constraints_for_var = cons(nth(TWO_INTEGER, clause), arg_isa_constraints_for_var);
                                }
                                if (((NIL != genl_predicates.genl_predicateP(clause.first(), $$genls, UNPROVIDED, UNPROVIDED)) && index.numE(ONE_INTEGER)) && (NIL != forts.fort_p(nth(TWO_INTEGER, clause)))) {
                                    arg_genl_constraints_for_var = cons(nth(TWO_INTEGER, clause), arg_genl_constraints_for_var);
                                }
                                index = NIL;
                            }
                        }
                    }
                    {
                        SubLObject new_cons = cons(genls.min_cols(arg_isa_constraints_for_var, UNPROVIDED, UNPROVIDED), NIL);
                        SubLObject list = arg_isa_constraints;
                        if (NIL != list) {
                            subl_macros.rplacd_last(list, new_cons);
                        } else {
                            arg_isa_constraints = new_cons;
                        }
                    }
                    {
                        SubLObject new_cons = cons(genls.min_cols(arg_genl_constraints_for_var, UNPROVIDED, UNPROVIDED), NIL);
                        SubLObject list = arg_genl_constraints;
                        if (NIL != list) {
                            subl_macros.rplacd_last(list, new_cons);
                        } else {
                            arg_genl_constraints = new_cons;
                        }
                    }
                }
            }
            {
                SubLObject cdotimes_end_var = length(v_variables);
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                    examples_from_previous = com.cyc.cycjava.cycl.butler.example_finder.get_example_bindings_from_previous_assertions(nth(i, v_variables), v_clauses, nth(i, arg_isa_constraints), nth(i, arg_genl_constraints), UNPROVIDED);
                    if (NIL != examples_from_previous) {
                        example = list_utilities.random_element(examples_from_previous);
                    } else {
                        if ((NIL == nth(i, arg_genl_constraints)) && (NIL == nth(i, arg_isa_constraints))) {
                            example = nth(i, v_variables);
                        } else {
                            if (NIL == nth(i, arg_genl_constraints)) {
                                example = com.cyc.cycjava.cycl.butler.example_finder.get_example_instance_from_collection_list(nth(i, arg_isa_constraints));
                                if (NIL == example) {
                                    example = nth(i, v_variables);
                                }
                            } else {
                                {
                                    SubLObject specs = list_utilities.intersect_all(Mapping.mapcar(ALL_SPECS, nth(i, arg_genl_constraints)), UNPROVIDED, UNPROVIDED);
                                    SubLObject possibilities = NIL;
                                    SubLObject cdolist_list_var = specs;
                                    SubLObject spec = NIL;
                                    for (spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec = cdolist_list_var.first()) {
                                        if ((NIL != nth(i, arg_isa_constraints)) && (NIL != isa.all_isaP(spec, nth(i, arg_isa_constraints), UNPROVIDED, UNPROVIDED))) {
                                            possibilities = cons(spec, possibilities);
                                        }
                                    }
                                    if (NIL != possibilities) {
                                        no_narts = list_utilities.remove_if_not(CONSTANT_P, possibilities, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        possibilities = (NIL != no_narts) ? ((SubLObject) (no_narts)) : possibilities;
                                    }
                                    if (NIL == possibilities) {
                                        if (NIL != list_utilities.singletonP(arg_genl_constraints)) {
                                            no_narts = list_utilities.remove_if_not(CONSTANT_P, specs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            possibilities = (NIL != specs) ? ((SubLObject) (NIL != no_narts ? ((SubLObject) (no_narts)) : specs)) : com.cyc.cycjava.cycl.butler.example_finder.get_example_instance_from_collection_list(nth(i, arg_isa_constraints));
                                        } else {
                                            possibilities = genls.all_specs(list_utilities.extremal(nth(i, arg_genl_constraints), $sym9$_, GENERALITY_ESTIMATE), UNPROVIDED, UNPROVIDED);
                                            if (NIL == possibilities) {
                                                possibilities = genls.union_all_specs(nth(i, arg_genl_constraints), UNPROVIDED, UNPROVIDED);
                                            }
                                            if (NIL == specs) {
                                                possibilities = com.cyc.cycjava.cycl.butler.example_finder.get_example_instance_from_collection_list(nth(i, arg_isa_constraints));
                                            }
                                        }
                                    }
                                    example = (NIL != possibilities) ? ((SubLObject) (list_utilities.random_element(possibilities))) : nth(i, v_variables);
                                }
                            }
                        }
                    }
                    v_bindings = cons(cons(nth(i, v_variables), example), v_bindings);
                }
            }
            return v_bindings;
        }
    }

    /**
     *
     *
     * @param CLAUSES
     * 		a list of clauses
     * @return an a-list of one set of possible bindings for all free variables in
    clauses using the arg-isa and arg-genl constraints on the predicates.
    Generally, uses this algorithm, which has had its order modified slightly for clarity:
    1.  Take all the variables in clauses
    2.  For each variable, find all the clauses that mention it.
    3.  For each clause that mentions it, find the predicate of that clause.
    4.  Find the arg-isa and arg-genl constraints for that predicate in the argument place of the variable
    5.  Look through the predicate extent of that predicate for possible instantiations of that argument place that
    fulfill all known arg-isa and arg-genl constraints on the variable in CLAUSES.  If any good ones are found,
    return a random one from them.
    6.  If nothing good is found in the predicate extents, then by brute force try to find any cyc object that fulfills at least most of the arg-isa and arg-genl constraints on the variable, by gradually relaxing those constraints until something is found.

    Note that the constraints are not relaxed PERFECTLY gradually, but in somewhat arbitrarily picked
    larger steps, to keep the function from taking forever.

    Also, interArgIsa constraints and all other asserted constraints are currently ignored.  typicalArgIsa constraints, in particular, should be implemented in the future.

    Even more generally, instead of considering each variable in isolation, this function would return more realistic examples
    if it looked at multiple variables simulataneously, looking to satisfy whole pieces of clauses list with real, true examples.
     */
    @LispMethod(comment = "@param CLAUSES\r\n\t\ta list of clauses\r\n@return an a-list of one set of possible bindings for all free variables in\r\nclauses using the arg-isa and arg-genl constraints on the predicates.\r\nGenerally, uses this algorithm, which has had its order modified slightly for clarity:\r\n1.  Take all the variables in clauses\r\n2.  For each variable, find all the clauses that mention it.\r\n3.  For each clause that mentions it, find the predicate of that clause.\r\n4.  Find the arg-isa and arg-genl constraints for that predicate in the argument place of the variable\r\n5.  Look through the predicate extent of that predicate for possible instantiations of that argument place that\r\nfulfill all known arg-isa and arg-genl constraints on the variable in CLAUSES.  If any good ones are found,\r\nreturn a random one from them.\r\n6.  If nothing good is found in the predicate extents, then by brute force try to find any cyc object that fulfills at least most of the arg-isa and arg-genl constraints on the variable, by gradually relaxing those constraints until something is found.\r\n\r\nNote that the constraints are not relaxed PERFECTLY gradually, but in somewhat arbitrarily picked\r\nlarger steps, to keep the function from taking forever.\r\n\r\nAlso, interArgIsa constraints and all other asserted constraints are currently ignored.  typicalArgIsa constraints, in particular, should be implemented in the future.\r\n\r\nEven more generally, instead of considering each variable in isolation, this function would return more realistic examples\r\nif it looked at multiple variables simulataneously, looking to satisfy whole pieces of clauses list with real, true examples.")
    public static SubLObject example_bindings_for_clauses_list(final SubLObject v_clauses) {
        final SubLObject v_variables = cycl_utilities.formula_gather(v_clauses, $sym14$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject arg_isa_constraints = NIL;
        SubLObject arg_genl_constraints = NIL;
        SubLObject arg_isa_constraints_for_var = NIL;
        SubLObject arg_genl_constraints_for_var = NIL;
        SubLObject index = NIL;
        SubLObject v_bindings = NIL;
        SubLObject example = NIL;
        SubLObject no_narts = NIL;
        SubLObject examples_from_previous = NIL;
        SubLObject cdolist_list_var = v_variables;
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            arg_isa_constraints_for_var = NIL;
            arg_genl_constraints_for_var = NIL;
            SubLObject cdolist_list_var_$8 = v_clauses;
            SubLObject clause = NIL;
            clause = cdolist_list_var_$8.first();
            while (NIL != cdolist_list_var_$8) {
                index = position(var, clause, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != index) {
                    arg_isa_constraints_for_var = append(kb_accessors.argn_isa(clause.first(), index, UNPROVIDED), arg_isa_constraints_for_var);
                    arg_genl_constraints_for_var = append(kb_accessors.argn_genl(clause.first(), index, UNPROVIDED), arg_genl_constraints_for_var);
                    if (((NIL != genl_predicates.genl_predicateP(clause.first(), $$isa, UNPROVIDED, UNPROVIDED)) && index.numE(ONE_INTEGER)) && (NIL != forts.fort_p(nth(TWO_INTEGER, clause)))) {
                        arg_isa_constraints_for_var = cons(nth(TWO_INTEGER, clause), arg_isa_constraints_for_var);
                    }
                    if (((NIL != genl_predicates.genl_predicateP(clause.first(), $$genls, UNPROVIDED, UNPROVIDED)) && index.numE(ONE_INTEGER)) && (NIL != forts.fort_p(nth(TWO_INTEGER, clause)))) {
                        arg_genl_constraints_for_var = cons(nth(TWO_INTEGER, clause), arg_genl_constraints_for_var);
                    }
                    index = NIL;
                }
                cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                clause = cdolist_list_var_$8.first();
            } 
            SubLObject new_cons = cons(genls.min_cols(arg_isa_constraints_for_var, UNPROVIDED, UNPROVIDED), NIL);
            SubLObject list = arg_isa_constraints;
            if (NIL != list) {
                subl_macros.rplacd_last(list, new_cons);
            } else {
                arg_isa_constraints = new_cons;
            }
            new_cons = cons(genls.min_cols(arg_genl_constraints_for_var, UNPROVIDED, UNPROVIDED), NIL);
            list = arg_genl_constraints;
            if (NIL != list) {
                subl_macros.rplacd_last(list, new_cons);
            } else {
                arg_genl_constraints = new_cons;
            }
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject specs;
        SubLObject possibilities;
        SubLObject cdolist_list_var2;
        SubLObject spec;
        for (cdotimes_end_var = length(v_variables), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            examples_from_previous = get_example_bindings_from_previous_assertions(nth(i, v_variables), v_clauses, nth(i, arg_isa_constraints), nth(i, arg_genl_constraints), UNPROVIDED);
            if (NIL != examples_from_previous) {
                example = list_utilities.random_element(examples_from_previous);
            } else
                if ((NIL == nth(i, arg_genl_constraints)) && (NIL == nth(i, arg_isa_constraints))) {
                    example = nth(i, v_variables);
                } else
                    if (NIL == nth(i, arg_genl_constraints)) {
                        example = get_example_instance_from_collection_list(nth(i, arg_isa_constraints));
                        if (NIL == example) {
                            example = nth(i, v_variables);
                        }
                    } else {
                        specs = list_utilities.intersect_all(Mapping.mapcar(ALL_SPECS, nth(i, arg_genl_constraints)), UNPROVIDED, UNPROVIDED);
                        possibilities = NIL;
                        cdolist_list_var2 = specs;
                        spec = NIL;
                        spec = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            if ((NIL != nth(i, arg_isa_constraints)) && (NIL != isa.all_isaP(spec, nth(i, arg_isa_constraints), UNPROVIDED, UNPROVIDED))) {
                                possibilities = cons(spec, possibilities);
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            spec = cdolist_list_var2.first();
                        } 
                        if (NIL != possibilities) {
                            no_narts = list_utilities.remove_if_not(CONSTANT_P, possibilities, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            possibilities = (NIL != no_narts) ? no_narts : possibilities;
                        }
                        if (NIL == possibilities) {
                            if (NIL != list_utilities.singletonP(arg_genl_constraints)) {
                                no_narts = list_utilities.remove_if_not(CONSTANT_P, specs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                possibilities = (NIL != specs) ? NIL != no_narts ? no_narts : specs : get_example_instance_from_collection_list(nth(i, arg_isa_constraints));
                            } else {
                                possibilities = genls.all_specs(list_utilities.extremal(nth(i, arg_genl_constraints), $sym9$_, GENERALITY_ESTIMATE), UNPROVIDED, UNPROVIDED);
                                if (NIL == possibilities) {
                                    possibilities = genls.union_all_specs(nth(i, arg_genl_constraints), UNPROVIDED, UNPROVIDED);
                                }
                                if (NIL == specs) {
                                    possibilities = get_example_instance_from_collection_list(nth(i, arg_isa_constraints));
                                }
                            }
                        }
                        example = (NIL != possibilities) ? list_utilities.random_element(possibilities) : nth(i, v_variables);
                    }


            v_bindings = cons(cons(nth(i, v_variables), example), v_bindings);
        }
        return v_bindings;
    }

    public static SubLObject declare_example_finder_file() {
        declareFunction("example_bindings_for_rule", "EXAMPLE-BINDINGS-FOR-RULE", 2, 2, false);
        declareFunction("example_consequents_for_rule", "EXAMPLE-CONSEQUENTS-FOR-RULE", 2, 2, false);
        declareFunction("term_meets_arg_isa_and_arg_genl_constraints", "TERM-MEETS-ARG-ISA-AND-ARG-GENL-CONSTRAINTS", 3, 0, false);
        declareFunction("get_example_bindings_from_previous_assertions", "GET-EXAMPLE-BINDINGS-FROM-PREVIOUS-ASSERTIONS", 2, 3, false);
        declareFunction("get_example_instance_from_collection_list", "GET-EXAMPLE-INSTANCE-FROM-COLLECTION-LIST", 1, 0, false);
        declareFunction("example_bindings_for_clauses_list", "EXAMPLE-BINDINGS-FOR-CLAUSES-LIST", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_example_finder_file() {
        deflexical("*EXAMPLE-FINDER-MAX-PREDICATE-EXTENT*", $int$10000);
        return NIL;
    }

    public static SubLObject setup_example_finder_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_example_finder_file();
    }

    @Override
    public void initializeVariables() {
        init_example_finder_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_example_finder_file();
    }

    static {
    }
}

/**
 * Total time: 245 ms
 */
