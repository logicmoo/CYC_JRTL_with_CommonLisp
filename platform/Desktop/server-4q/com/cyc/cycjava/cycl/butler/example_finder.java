package com.cyc.cycjava.cycl.butler;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.isa;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.clausifier;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class example_finder extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.butler.example_finder";
    public static final String myFingerPrint = "494ac896a412c0371ba3841b26f0304333595af54f345c2243d3103a4f37ddf7";
    @SubLTranslatedFile.SubL(source = "cycl/butler/example-finder.lisp", position = 3631L)
    private static SubLSymbol $example_finder_max_predicate_extent$;
    private static final SubLSymbol $sym0$EL_IMPLICATION_P;
    private static final SubLObject $const1$and;
    private static final SubLSymbol $kw2$MAX_NUMBER;
    private static final SubLSymbol $kw3$MAX_TIME;
    private static final SubLInteger $int4$10000;
    private static final SubLSymbol $sym5$RELEVANT_MT_IS_ANY_MT;
    private static final SubLObject $const6$InferencePSC;
    private static final SubLSymbol $kw7$GAF;
    private static final SubLSymbol $sym8$LISTP;
    private static final SubLSymbol $sym9$_;
    private static final SubLSymbol $sym10$GENERALITY_ESTIMATE;
    private static final SubLInteger $int11$50;
    private static final SubLObject $const12$GenericInstanceFn;
    private static final SubLSymbol $sym13$CONSTANT_P;
    private static final SubLSymbol $sym14$EL_VAR_;
    private static final SubLObject $const15$isa;
    private static final SubLObject $const16$genls;
    private static final SubLSymbol $sym17$ALL_SPECS;
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/example-finder.lisp", position = 1487L)
    public static SubLObject example_bindings_for_rule(final SubLObject rule, final SubLObject mt, SubLObject cut_off, SubLObject how_many) {
        if (cut_off == example_finder.UNPROVIDED) {
            cut_off = (SubLObject)example_finder.TWENTY_INTEGER;
        }
        if (how_many == example_finder.UNPROVIDED) {
            how_many = (SubLObject)example_finder.ONE_INTEGER;
        }
        assert example_finder.NIL != el_utilities.el_implication_p(rule) : rule;
        if (example_finder.NIL == el_utilities.referenced_variables(rule, (SubLObject)example_finder.UNPROVIDED)) {
            return rule;
        }
        SubLObject formula = (SubLObject)((example_finder.NIL != el_utilities.el_conjunction_p(rule)) ? cycl_utilities.formula_arg1(rule, (SubLObject)example_finder.UNPROVIDED) : ConsesLow.list(example_finder.$const1$and, cycl_utilities.formula_arg1(rule, (SubLObject)example_finder.UNPROVIDED)));
        final SubLObject item_var = cycl_utilities.formula_arg2(rule, (SubLObject)example_finder.UNPROVIDED);
        if (example_finder.NIL == conses_high.member(item_var, formula, Symbols.symbol_function((SubLObject)example_finder.EQL), Symbols.symbol_function((SubLObject)example_finder.IDENTITY))) {
            final SubLObject new_cons = (SubLObject)ConsesLow.cons(item_var, (SubLObject)example_finder.NIL);
            final SubLObject list = formula;
            if (example_finder.NIL != list) {
                subl_macros.rplacd_last(list, new_cons);
            }
            else {
                formula = new_cons;
            }
        }
        final SubLObject v_bindings = inference_kernel.new_cyc_query(formula, mt, (SubLObject)ConsesLow.list((SubLObject)example_finder.$kw2$MAX_NUMBER, how_many, (SubLObject)example_finder.$kw3$MAX_TIME, cut_off));
        if (example_finder.NIL == v_bindings) {
            final SubLObject cnf = clausifier.clausal_form(rule, mt, (SubLObject)example_finder.UNPROVIDED);
            final SubLObject v_clauses = ConsesLow.append(clauses.pos_lits(cnf.first()), clauses.neg_lits(cnf.first()));
            final SubLObject v_bindings_$1 = example_bindings_for_clauses_list(v_clauses);
            return conses_high.sublis(v_bindings_$1, rule, (SubLObject)example_finder.UNPROVIDED, (SubLObject)example_finder.UNPROVIDED);
        }
        SubLObject candidates = (SubLObject)example_finder.NIL;
        SubLObject cdolist_list_var = list_utilities.randomize_list(v_bindings);
        SubLObject bind = (SubLObject)example_finder.NIL;
        bind = cdolist_list_var.first();
        while (example_finder.NIL != cdolist_list_var) {
            candidates = (SubLObject)ConsesLow.cons(conses_high.subst(conses_high.sublis(bind, rule, (SubLObject)example_finder.UNPROVIDED, (SubLObject)example_finder.UNPROVIDED), bind, bind, (SubLObject)example_finder.UNPROVIDED, (SubLObject)example_finder.UNPROVIDED), candidates);
            cdolist_list_var = cdolist_list_var.rest();
            bind = cdolist_list_var.first();
        }
        if (example_finder.NIL != list_utilities.lengthLE(candidates, how_many, (SubLObject)example_finder.UNPROVIDED)) {
            return candidates;
        }
        return Sequences.subseq(candidates, (SubLObject)example_finder.ZERO_INTEGER, how_many);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/example-finder.lisp", position = 2506L)
    public static SubLObject example_consequents_for_rule(final SubLObject rule, final SubLObject mt, SubLObject cut_off, SubLObject how_many) {
        if (cut_off == example_finder.UNPROVIDED) {
            cut_off = (SubLObject)example_finder.TWENTY_INTEGER;
        }
        if (how_many == example_finder.UNPROVIDED) {
            how_many = (SubLObject)example_finder.ONE_INTEGER;
        }
        assert example_finder.NIL != el_utilities.el_implication_p(rule) : rule;
        final SubLObject instantiated_rules = example_bindings_for_rule(rule, mt, cut_off, how_many);
        SubLObject consequents = (SubLObject)example_finder.NIL;
        SubLObject cdolist_list_var = instantiated_rules;
        SubLObject instantiated_rule = (SubLObject)example_finder.NIL;
        instantiated_rule = cdolist_list_var.first();
        while (example_finder.NIL != cdolist_list_var) {
            final SubLObject consequent = cycl_utilities.formula_arg2(instantiated_rule, (SubLObject)example_finder.UNPROVIDED);
            consequents = (SubLObject)ConsesLow.cons(consequent, consequents);
            cdolist_list_var = cdolist_list_var.rest();
            instantiated_rule = cdolist_list_var.first();
        }
        return Sequences.nreverse(consequents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/example-finder.lisp", position = 2961L)
    public static SubLObject term_meets_arg_isa_and_arg_genl_constraints(final SubLObject v_term, final SubLObject arg_isa_constraints, final SubLObject arg_genl_constraints) {
        SubLObject cdolist_list_var = arg_isa_constraints;
        SubLObject isa_constraint = (SubLObject)example_finder.NIL;
        isa_constraint = cdolist_list_var.first();
        while (example_finder.NIL != cdolist_list_var) {
            if (example_finder.NIL != isa_constraint && example_finder.NIL == isa.isa_in_any_mtP(v_term, isa_constraint)) {
                return (SubLObject)example_finder.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            isa_constraint = cdolist_list_var.first();
        }
        cdolist_list_var = arg_genl_constraints;
        SubLObject genl_constraint = (SubLObject)example_finder.NIL;
        genl_constraint = cdolist_list_var.first();
        while (example_finder.NIL != cdolist_list_var) {
            if (example_finder.NIL != genl_constraint && example_finder.NIL == genls.genl_in_any_mtP(v_term, genl_constraint)) {
                return (SubLObject)example_finder.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            genl_constraint = cdolist_list_var.first();
        }
        return (SubLObject)example_finder.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/example-finder.lisp", position = 3842L)
    public static SubLObject get_example_bindings_from_previous_assertions(final SubLObject var, final SubLObject clauses_list, SubLObject arg_isa_constraints, SubLObject arg_genl_constraints, SubLObject max_examples_per_clause) {
        if (arg_isa_constraints == example_finder.UNPROVIDED) {
            arg_isa_constraints = (SubLObject)example_finder.NIL;
        }
        if (arg_genl_constraints == example_finder.UNPROVIDED) {
            arg_genl_constraints = (SubLObject)example_finder.NIL;
        }
        if (max_examples_per_clause == example_finder.UNPROVIDED) {
            max_examples_per_clause = (SubLObject)example_finder.TEN_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject examples = (SubLObject)example_finder.NIL;
        SubLObject no_narts = (SubLObject)example_finder.NIL;
        SubLObject stop = (SubLObject)example_finder.NIL;
        SubLObject v_term = (SubLObject)example_finder.NIL;
        SubLObject cdolist_list_var = clauses_list;
        SubLObject clause = (SubLObject)example_finder.NIL;
        clause = cdolist_list_var.first();
        while (example_finder.NIL != cdolist_list_var) {
            if (example_finder.NIL != Sequences.position(var, clause, (SubLObject)example_finder.UNPROVIDED, (SubLObject)example_finder.UNPROVIDED, (SubLObject)example_finder.UNPROVIDED, (SubLObject)example_finder.UNPROVIDED)) {
                final SubLObject index = Sequences.position(var, clause, (SubLObject)example_finder.UNPROVIDED, (SubLObject)example_finder.UNPROVIDED, (SubLObject)example_finder.UNPROVIDED, (SubLObject)example_finder.UNPROVIDED);
                SubLObject examples_per_clause = (SubLObject)example_finder.NIL;
                SubLObject no_narts_per_clause = (SubLObject)example_finder.NIL;
                stop = (SubLObject)example_finder.NIL;
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)example_finder.$sym5$RELEVANT_MT_IS_ANY_MT, thread);
                    mt_relevance_macros.$mt$.bind(example_finder.$const6$InferencePSC, thread);
                    if (kb_indexing.num_predicate_extent_index(clause.first(), (SubLObject)example_finder.UNPROVIDED).numL(example_finder.$example_finder_max_predicate_extent$.getGlobalValue())) {
                        final SubLObject pred_var = clause.first();
                        if (example_finder.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                            final SubLObject str = (SubLObject)example_finder.NIL;
                            final SubLObject _prev_bind_0_$2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$3 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                            final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                            final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                            final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                            try {
                                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                                utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                                utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                                utilities_macros.$progress_notification_count$.bind((SubLObject)example_finder.ZERO_INTEGER, thread);
                                utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)example_finder.ZERO_INTEGER, thread);
                                utilities_macros.$progress_count$.bind((SubLObject)example_finder.ZERO_INTEGER, thread);
                                utilities_macros.$is_noting_progressP$.bind((SubLObject)example_finder.T, thread);
                                utilities_macros.$silent_progressP$.bind((SubLObject)((example_finder.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : example_finder.T), thread);
                                utilities_macros.noting_progress_preamble(str);
                                final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                SubLObject done_var = stop;
                                final SubLObject token_var = (SubLObject)example_finder.NIL;
                                while (example_finder.NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                    if (example_finder.NIL != valid) {
                                        utilities_macros.note_progress();
                                        SubLObject final_index_iterator = (SubLObject)example_finder.NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)example_finder.$kw7$GAF, (SubLObject)example_finder.NIL, (SubLObject)example_finder.NIL);
                                            SubLObject done_var_$4 = stop;
                                            final SubLObject token_var_$5 = (SubLObject)example_finder.NIL;
                                            while (example_finder.NIL == done_var_$4) {
                                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                                final SubLObject valid_$6 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$5.eql(gaf));
                                                if (example_finder.NIL != valid_$6) {
                                                    v_term = ConsesLow.nth(index, assertions_high.assertion_formula(gaf));
                                                    if (example_finder.NIL != term_meets_arg_isa_and_arg_genl_constraints(v_term, arg_isa_constraints, arg_genl_constraints)) {
                                                        SubLObject item_var = v_term;
                                                        if (example_finder.NIL == conses_high.member(item_var, examples_per_clause, Symbols.symbol_function((SubLObject)example_finder.EQL), Symbols.symbol_function((SubLObject)example_finder.IDENTITY))) {
                                                            examples_per_clause = (SubLObject)ConsesLow.cons(item_var, examples_per_clause);
                                                        }
                                                        if (example_finder.NIL != constant_handles.constant_p(v_term)) {
                                                            item_var = v_term;
                                                            if (example_finder.NIL == conses_high.member(item_var, no_narts_per_clause, Symbols.symbol_function((SubLObject)example_finder.EQL), Symbols.symbol_function((SubLObject)example_finder.IDENTITY))) {
                                                                no_narts_per_clause = (SubLObject)ConsesLow.cons(item_var, no_narts_per_clause);
                                                            }
                                                        }
                                                        if (Sequences.length(no_narts_per_clause).numGE(max_examples_per_clause)) {
                                                            stop = (SubLObject)example_finder.T;
                                                        }
                                                    }
                                                }
                                                done_var_$4 = (SubLObject)SubLObjectFactory.makeBoolean(example_finder.NIL == valid_$6 || example_finder.NIL != stop);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)example_finder.T, thread);
                                                final SubLObject _values = Values.getValuesAsVector();
                                                if (example_finder.NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                            }
                                        }
                                    }
                                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(example_finder.NIL == valid || example_finder.NIL != stop);
                                }
                                utilities_macros.noting_progress_postamble();
                            }
                            finally {
                                utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                                utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                                utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                                utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                                utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                                utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                                utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$3, thread);
                                utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$2, thread);
                            }
                        }
                    }
                    examples = ConsesLow.append(examples_per_clause, examples);
                    no_narts = ConsesLow.append(no_narts_per_clause, no_narts);
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        }
        if (example_finder.NIL != no_narts) {
            return no_narts;
        }
        return examples;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/example-finder.lisp", position = 5741L)
    public static SubLObject get_example_instance_from_collection_list(final SubLObject collections) {
        assert example_finder.NIL != Types.listp(collections) : collections;
        if (example_finder.NIL == collections) {
            return (SubLObject)example_finder.NIL;
        }
        SubLObject possibilities = (SubLObject)example_finder.NIL;
        SubLObject no_narts = (SubLObject)example_finder.NIL;
        final SubLObject constraint = (example_finder.NIL != list_utilities.singletonP(collections)) ? collections.first() : list_utilities.extremal(collections, (SubLObject)example_finder.$sym9$_, (SubLObject)example_finder.$sym10$GENERALITY_ESTIMATE);
        if (example_finder.NIL != list_utilities.singletonP(collections)) {
            possibilities = isa.sample_leaf_instances(constraint, (SubLObject)example_finder.$int11$50, (SubLObject)example_finder.UNPROVIDED, (SubLObject)example_finder.UNPROVIDED);
            if (example_finder.NIL == possibilities) {
                possibilities = isa.all_fort_instances_in_all_mts(constraint);
            }
            if (example_finder.NIL == possibilities) {
                possibilities = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(example_finder.$const12$GenericInstanceFn, constraint));
            }
        }
        else {
            possibilities = isa.sample_leaf_instances(constraint, (SubLObject)example_finder.$int11$50, (SubLObject)example_finder.UNPROVIDED, (SubLObject)example_finder.UNPROVIDED);
            if (example_finder.NIL == possibilities) {
                possibilities = isa.all_fort_instances_in_all_mts(constraint);
            }
            if (example_finder.NIL == possibilities) {
                possibilities = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(example_finder.$const12$GenericInstanceFn, constraint));
            }
        }
        no_narts = list_utilities.remove_if_not((SubLObject)example_finder.$sym13$CONSTANT_P, possibilities, (SubLObject)example_finder.UNPROVIDED, (SubLObject)example_finder.UNPROVIDED, (SubLObject)example_finder.UNPROVIDED, (SubLObject)example_finder.UNPROVIDED);
        return (example_finder.NIL != no_narts) ? list_utilities.random_element(no_narts) : list_utilities.random_element(possibilities);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/example-finder.lisp", position = 7652L)
    public static SubLObject example_bindings_for_clauses_list(final SubLObject v_clauses) {
        final SubLObject v_variables = cycl_utilities.formula_gather(v_clauses, (SubLObject)example_finder.$sym14$EL_VAR_, (SubLObject)example_finder.UNPROVIDED, (SubLObject)example_finder.UNPROVIDED, (SubLObject)example_finder.UNPROVIDED, (SubLObject)example_finder.UNPROVIDED);
        SubLObject arg_isa_constraints = (SubLObject)example_finder.NIL;
        SubLObject arg_genl_constraints = (SubLObject)example_finder.NIL;
        SubLObject arg_isa_constraints_for_var = (SubLObject)example_finder.NIL;
        SubLObject arg_genl_constraints_for_var = (SubLObject)example_finder.NIL;
        SubLObject index = (SubLObject)example_finder.NIL;
        SubLObject v_bindings = (SubLObject)example_finder.NIL;
        SubLObject example = (SubLObject)example_finder.NIL;
        SubLObject no_narts = (SubLObject)example_finder.NIL;
        SubLObject examples_from_previous = (SubLObject)example_finder.NIL;
        SubLObject cdolist_list_var = v_variables;
        SubLObject var = (SubLObject)example_finder.NIL;
        var = cdolist_list_var.first();
        while (example_finder.NIL != cdolist_list_var) {
            arg_isa_constraints_for_var = (SubLObject)example_finder.NIL;
            arg_genl_constraints_for_var = (SubLObject)example_finder.NIL;
            SubLObject cdolist_list_var_$8 = v_clauses;
            SubLObject clause = (SubLObject)example_finder.NIL;
            clause = cdolist_list_var_$8.first();
            while (example_finder.NIL != cdolist_list_var_$8) {
                index = Sequences.position(var, clause, (SubLObject)example_finder.UNPROVIDED, (SubLObject)example_finder.UNPROVIDED, (SubLObject)example_finder.UNPROVIDED, (SubLObject)example_finder.UNPROVIDED);
                if (example_finder.NIL != index) {
                    arg_isa_constraints_for_var = ConsesLow.append(kb_accessors.argn_isa(clause.first(), index, (SubLObject)example_finder.UNPROVIDED), arg_isa_constraints_for_var);
                    arg_genl_constraints_for_var = ConsesLow.append(kb_accessors.argn_genl(clause.first(), index, (SubLObject)example_finder.UNPROVIDED), arg_genl_constraints_for_var);
                    if (example_finder.NIL != genl_predicates.genl_predicateP(clause.first(), example_finder.$const15$isa, (SubLObject)example_finder.UNPROVIDED, (SubLObject)example_finder.UNPROVIDED) && index.numE((SubLObject)example_finder.ONE_INTEGER) && example_finder.NIL != forts.fort_p(ConsesLow.nth((SubLObject)example_finder.TWO_INTEGER, clause))) {
                        arg_isa_constraints_for_var = (SubLObject)ConsesLow.cons(ConsesLow.nth((SubLObject)example_finder.TWO_INTEGER, clause), arg_isa_constraints_for_var);
                    }
                    if (example_finder.NIL != genl_predicates.genl_predicateP(clause.first(), example_finder.$const16$genls, (SubLObject)example_finder.UNPROVIDED, (SubLObject)example_finder.UNPROVIDED) && index.numE((SubLObject)example_finder.ONE_INTEGER) && example_finder.NIL != forts.fort_p(ConsesLow.nth((SubLObject)example_finder.TWO_INTEGER, clause))) {
                        arg_genl_constraints_for_var = (SubLObject)ConsesLow.cons(ConsesLow.nth((SubLObject)example_finder.TWO_INTEGER, clause), arg_genl_constraints_for_var);
                    }
                    index = (SubLObject)example_finder.NIL;
                }
                cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                clause = cdolist_list_var_$8.first();
            }
            SubLObject new_cons = (SubLObject)ConsesLow.cons(genls.min_cols(arg_isa_constraints_for_var, (SubLObject)example_finder.UNPROVIDED, (SubLObject)example_finder.UNPROVIDED), (SubLObject)example_finder.NIL);
            SubLObject list = arg_isa_constraints;
            if (example_finder.NIL != list) {
                subl_macros.rplacd_last(list, new_cons);
            }
            else {
                arg_isa_constraints = new_cons;
            }
            new_cons = (SubLObject)ConsesLow.cons(genls.min_cols(arg_genl_constraints_for_var, (SubLObject)example_finder.UNPROVIDED, (SubLObject)example_finder.UNPROVIDED), (SubLObject)example_finder.NIL);
            list = arg_genl_constraints;
            if (example_finder.NIL != list) {
                subl_macros.rplacd_last(list, new_cons);
            }
            else {
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
        for (cdotimes_end_var = Sequences.length(v_variables), i = (SubLObject)example_finder.NIL, i = (SubLObject)example_finder.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)example_finder.ONE_INTEGER)) {
            examples_from_previous = get_example_bindings_from_previous_assertions(ConsesLow.nth(i, v_variables), v_clauses, ConsesLow.nth(i, arg_isa_constraints), ConsesLow.nth(i, arg_genl_constraints), (SubLObject)example_finder.UNPROVIDED);
            if (example_finder.NIL != examples_from_previous) {
                example = list_utilities.random_element(examples_from_previous);
            }
            else if (example_finder.NIL == ConsesLow.nth(i, arg_genl_constraints) && example_finder.NIL == ConsesLow.nth(i, arg_isa_constraints)) {
                example = ConsesLow.nth(i, v_variables);
            }
            else if (example_finder.NIL == ConsesLow.nth(i, arg_genl_constraints)) {
                example = get_example_instance_from_collection_list(ConsesLow.nth(i, arg_isa_constraints));
                if (example_finder.NIL == example) {
                    example = ConsesLow.nth(i, v_variables);
                }
            }
            else {
                specs = list_utilities.intersect_all(Mapping.mapcar((SubLObject)example_finder.$sym17$ALL_SPECS, ConsesLow.nth(i, arg_genl_constraints)), (SubLObject)example_finder.UNPROVIDED, (SubLObject)example_finder.UNPROVIDED);
                possibilities = (SubLObject)example_finder.NIL;
                cdolist_list_var2 = specs;
                spec = (SubLObject)example_finder.NIL;
                spec = cdolist_list_var2.first();
                while (example_finder.NIL != cdolist_list_var2) {
                    if (example_finder.NIL != ConsesLow.nth(i, arg_isa_constraints) && example_finder.NIL != isa.all_isaP(spec, ConsesLow.nth(i, arg_isa_constraints), (SubLObject)example_finder.UNPROVIDED, (SubLObject)example_finder.UNPROVIDED)) {
                        possibilities = (SubLObject)ConsesLow.cons(spec, possibilities);
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    spec = cdolist_list_var2.first();
                }
                if (example_finder.NIL != possibilities) {
                    no_narts = list_utilities.remove_if_not((SubLObject)example_finder.$sym13$CONSTANT_P, possibilities, (SubLObject)example_finder.UNPROVIDED, (SubLObject)example_finder.UNPROVIDED, (SubLObject)example_finder.UNPROVIDED, (SubLObject)example_finder.UNPROVIDED);
                    possibilities = ((example_finder.NIL != no_narts) ? no_narts : possibilities);
                }
                if (example_finder.NIL == possibilities) {
                    if (example_finder.NIL != list_utilities.singletonP(arg_genl_constraints)) {
                        no_narts = list_utilities.remove_if_not((SubLObject)example_finder.$sym13$CONSTANT_P, specs, (SubLObject)example_finder.UNPROVIDED, (SubLObject)example_finder.UNPROVIDED, (SubLObject)example_finder.UNPROVIDED, (SubLObject)example_finder.UNPROVIDED);
                        possibilities = ((example_finder.NIL != specs) ? ((example_finder.NIL != no_narts) ? no_narts : specs) : get_example_instance_from_collection_list(ConsesLow.nth(i, arg_isa_constraints)));
                    }
                    else {
                        possibilities = genls.all_specs(list_utilities.extremal(ConsesLow.nth(i, arg_genl_constraints), (SubLObject)example_finder.$sym9$_, (SubLObject)example_finder.$sym10$GENERALITY_ESTIMATE), (SubLObject)example_finder.UNPROVIDED, (SubLObject)example_finder.UNPROVIDED);
                        if (example_finder.NIL == possibilities) {
                            possibilities = genls.union_all_specs(ConsesLow.nth(i, arg_genl_constraints), (SubLObject)example_finder.UNPROVIDED, (SubLObject)example_finder.UNPROVIDED);
                        }
                        if (example_finder.NIL == specs) {
                            possibilities = get_example_instance_from_collection_list(ConsesLow.nth(i, arg_isa_constraints));
                        }
                    }
                }
                example = ((example_finder.NIL != possibilities) ? list_utilities.random_element(possibilities) : ConsesLow.nth(i, v_variables));
            }
            v_bindings = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(ConsesLow.nth(i, v_variables), example), v_bindings);
        }
        return v_bindings;
    }
    
    public static SubLObject declare_example_finder_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.example_finder", "example_bindings_for_rule", "EXAMPLE-BINDINGS-FOR-RULE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.example_finder", "example_consequents_for_rule", "EXAMPLE-CONSEQUENTS-FOR-RULE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.example_finder", "term_meets_arg_isa_and_arg_genl_constraints", "TERM-MEETS-ARG-ISA-AND-ARG-GENL-CONSTRAINTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.example_finder", "get_example_bindings_from_previous_assertions", "GET-EXAMPLE-BINDINGS-FROM-PREVIOUS-ASSERTIONS", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.example_finder", "get_example_instance_from_collection_list", "GET-EXAMPLE-INSTANCE-FROM-COLLECTION-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.example_finder", "example_bindings_for_clauses_list", "EXAMPLE-BINDINGS-FOR-CLAUSES-LIST", 1, 0, false);
        return (SubLObject)example_finder.NIL;
    }
    
    public static SubLObject init_example_finder_file() {
        example_finder.$example_finder_max_predicate_extent$ = SubLFiles.deflexical("*EXAMPLE-FINDER-MAX-PREDICATE-EXTENT*", (SubLObject)example_finder.$int4$10000);
        return (SubLObject)example_finder.NIL;
    }
    
    public static SubLObject setup_example_finder_file() {
        return (SubLObject)example_finder.NIL;
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
        me = (SubLFile)new example_finder();
        example_finder.$example_finder_max_predicate_extent$ = null;
        $sym0$EL_IMPLICATION_P = SubLObjectFactory.makeSymbol("EL-IMPLICATION-P");
        $const1$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $kw2$MAX_NUMBER = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $kw3$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $int4$10000 = SubLObjectFactory.makeInteger(10000);
        $sym5$RELEVANT_MT_IS_ANY_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-ANY-MT");
        $const6$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $kw7$GAF = SubLObjectFactory.makeKeyword("GAF");
        $sym8$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym9$_ = SubLObjectFactory.makeSymbol("<");
        $sym10$GENERALITY_ESTIMATE = SubLObjectFactory.makeSymbol("GENERALITY-ESTIMATE");
        $int11$50 = SubLObjectFactory.makeInteger(50);
        $const12$GenericInstanceFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GenericInstanceFn"));
        $sym13$CONSTANT_P = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $sym14$EL_VAR_ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $const15$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const16$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $sym17$ALL_SPECS = SubLObjectFactory.makeSymbol("ALL-SPECS");
    }
}

/*

	Total time: 245 ms
	
*/