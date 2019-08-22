package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg1;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg2;
import static com.cyc.cycjava.cycl.el_utilities.literal_arity;
import static com.cyc.cycjava.cycl.el_utilities.literal_predicate;
import static com.cyc.cycjava.cycl.el_utilities.make_negation;
import static com.cyc.cycjava.cycl.el_utilities.make_ternary_formula;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.at_var_types;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_abduction extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_abduction();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_abduction";

    public static final String myFingerPrint = "fef98746ba2b18c68d4872c5492c321d1e183c0a0f79d3283c44084f4155bc05";

    // deflexical
    // Definitions
    // The exhaustive list all abductive removal modules.
    private static final SubLSymbol $abductive_removal_modules$ = makeSymbol("*ABDUCTIVE-REMOVAL-MODULES*");



    // defparameter
    public static final SubLSymbol $abduce_subcollection_denoting_termsP$ = makeSymbol("*ABDUCE-SUBCOLLECTION-DENOTING-TERMS?*");

    // deflexical
    private static final SubLSymbol $default_abduction_cost$ = makeSymbol("*DEFAULT-ABDUCTION-COST*");

    // Internal Constants
    public static final SubLList $list0 = list(makeKeyword("REMOVAL-ABDUCTION-POS-UNIFY"), makeKeyword("REMOVAL-ABDUCTION-POS-CHECK"), makeKeyword("REMOVAL-EXCLUSIVE-ABDUCTION-POS"));





    public static final SubLSymbol $abduction_term_isg$ = makeSymbol("*ABDUCTION-TERM-ISG*");



    public static final SubLList $list5 = list(reader_make_constant_shell(makeString("isa")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("COMPLETELY-ENUMERABLE-COLLECTION?")));



    private static final SubLObject $$SubcollectionOfWithRelationToFn = reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn"));

    private static final SubLObject $$SubcollectionOfWithRelationFromFn = reader_make_constant_shell(makeString("SubcollectionOfWithRelationFromFn"));

    private static final SubLObject $$AbducedTermFn = reader_make_constant_shell(makeString("AbducedTermFn"));

    public static final SubLSymbol $sym10$NON_ABDUCIBLE_COLLECTION_ = makeSymbol("NON-ABDUCIBLE-COLLECTION?");

    private static final SubLObject $$Individual = reader_make_constant_shell(makeString("Individual"));

    public static final SubLString $str12$no_isa_constraints_for_abduced_ty = makeString("no isa constraints for abduced type");

    public static final SubLSymbol $sym13$GENERALITY_ESTIMATE_ = makeSymbol("GENERALITY-ESTIMATE<");







    private static final SubLSymbol $REMOVAL_ABDUCTION_POS_CHECK = makeKeyword("REMOVAL-ABDUCTION-POS-CHECK");

    public static final SubLList $list18 = list(new SubLObject[]{ makeKeyword("MODULE-SUBTYPE"), makeKeyword("ABDUCTION"), makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), cons(makeKeyword("FORT"), makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-ABDUCTION-POS-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ABDUCTION-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ABDUCTION-POS-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<fort> . <whatever>) where the asent is deemed abducible, \n    and the problem store allows abduction"), makeKeyword("EXAMPLE"), makeString("(#$competitors #$GeorgeWBush #$BillClinton)") });

    public static final SubLSymbol ABDUCED_TERM_P = makeSymbol("ABDUCED-TERM-P");

    private static final SubLSymbol $REMOVAL_ABDUCTION_POS_UNIFY = makeKeyword("REMOVAL-ABDUCTION-POS-UNIFY");

    public static final SubLList $list21 = list(new SubLObject[]{ makeKeyword("MODULE-SUBTYPE"), makeKeyword("ABDUCTION"), makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), cons(makeKeyword("FORT"), makeKeyword("ANYTHING")), list(makeKeyword("NOT"), cons(makeKeyword("FORT"), makeKeyword("FULLY-BOUND")))), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-ABDUCTION-POS-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ABDUCTION-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ABDUCTION-POS-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<fort> . <whatever>) where the asent is deemed abducible, \n    and the problem store allows abduction"), makeKeyword("EXAMPLE"), makeString("(#$brothers #$GeorgeWBush ?BROTHER)") });

    private static final SubLSymbol $REMOVAL_EXCLUSIVE_ABDUCTION_POS = makeKeyword("REMOVAL-EXCLUSIVE-ABDUCTION-POS");

    public static final SubLList $list23 = list(new SubLObject[]{ makeKeyword("MODULE-SUBTYPE"), makeKeyword("ABDUCTION"), makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), cons(makeKeyword("FORT"), makeKeyword("ANYTHING")), list(makeKeyword("TREE-FIND"), reader_make_constant_shell(makeString("AbducedTermFn")))), makeKeyword("EXCLUSIVE"), makeSymbol("REMOVAL-ABDUCTION-EXCLUSIVE?"), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-ABDUCTION-POS-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ABDUCTION-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EXCLUSIVE-ABDUCTION-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("apply only abduction on (<fort> . <whatever>) where the asent has an abduced term"), makeKeyword("EXAMPLE"), makeString("(#$brothers #$GeorgeWBush (#$AbducedTermFn (#$CycProblemStoreFn 1388) #$MaleAnimal 2))") });

    private static final SubLSymbol $REMOVAL_ABDUCTION_NEG_CHECK = makeKeyword("REMOVAL-ABDUCTION-NEG-CHECK");

    public static final SubLList $list25 = list(new SubLObject[]{ makeKeyword("MODULE-SUBTYPE"), makeKeyword("ABDUCTION"), makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"), cons(makeKeyword("FORT"), makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-ABDUCTION-NEG-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ABDUCTION-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ABDUCTION-NEG-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<fort> . <fully-bound>)) where the asent is deemed abducible, \n    and the problem store allows abduction"), makeKeyword("EXAMPLE"), makeString("(#$not (#$competitors #$GeorgeWBush #$BillClinton))") });

    public static SubLObject abductive_removal_modules() {
        return $abductive_removal_modules$.getGlobalValue();
    }

    public static SubLObject abductive_removal_moduleP(final SubLObject module_name) {
        return subl_promotions.memberP(module_name, $abductive_removal_modules$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject abductive_modules_not_allowed_spec() {
        SubLObject allowed_module_specs = NIL;
        SubLObject cdolist_list_var = abductive_removal_modules();
        SubLObject module = NIL;
        module = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            allowed_module_specs = cons(list($NOT, module), allowed_module_specs);
            cdolist_list_var = cdolist_list_var.rest();
            module = cdolist_list_var.first();
        } 
        return cons($AND, allowed_module_specs);
    }

    public static SubLObject problem_store_next_abduced_term_id(final SubLObject problem_store) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(problem_store) : "inference_datastructures_problem_store.problem_store_p(problem_store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(problem_store) " + problem_store;
        final SubLObject isg = $abduction_term_isg$.getGlobalValue();
        return integer_sequence_generator.integer_sequence_generator_next(isg);
    }

    public static SubLObject abducing_completely_enumerable_instancesP(final SubLObject asent, final SubLObject mt) {
        return formula_pattern_match.pattern_matches_formula($list5, asent);
    }

    public static SubLObject candidate_abductive_binding_sets(final SubLObject asent, final SubLObject mt, final SubLObject problem_store) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject free_variables = variables.gather_hl_variables(asent);
        final SubLObject constraint_dict = at_var_types.formula_variables_arg_constraints_dict(asent, mt, VARIABLE_P, T);
        SubLObject binding_sets = NIL;
        SubLObject v_bindings = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(constraint_dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject variable = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject constraints = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != variable) {
                final SubLObject abduced_term = abduced_term_for_constraints(asent, variable, constraints, problem_store);
                if (NIL == abduced_term) {
                    return NIL;
                }
                v_bindings = subst(variable, abduced_term, v_bindings, UNPROVIDED, UNPROVIDED);
                v_bindings = bindings.add_variable_binding(variable, abduced_term, v_bindings);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        if (NIL != list_utilities.same_length_p(v_bindings, free_variables)) {
            binding_sets = cons(v_bindings, binding_sets);
        }
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(inference_worker.currently_active_problem());
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        SubLObject link_var;
        SubLObject cdolist_list_var;
        SubLObject supporting_mapped_problem;
        SubLObject sibling_problem;
        SubLObject variable_map;
        SubLObject sibling_query;
        SubLObject sibling_free_vars;
        SubLObject bindings_set;
        SubLObject sibling_binding_sets;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                link_var = link;
                cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                supporting_mapped_problem = NIL;
                supporting_mapped_problem = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem)) {
                        sibling_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                        variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                        sibling_query = inference_datastructures_problem.problem_query(sibling_problem);
                        sibling_free_vars = variables.gather_hl_variables(sibling_query);
                        if (free_variables.equal(sibling_free_vars)) {
                            bindings_set = inference_datastructures_problem.problem_proof_bindings_index(sibling_problem);
                            sibling_binding_sets = dictionary_contents.dictionary_contents_keys(bindings_set);
                            binding_sets = append(binding_sets, sibling_binding_sets);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    supporting_mapped_problem = cdolist_list_var.first();
                } 
            }
        }
        return nreverse(binding_sets);
    }

    public static SubLObject abduced_collection_for_constraints(final SubLObject variable, final SubLObject constraints, final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $abduce_subcollection_denoting_termsP$.getDynamicValue(thread)) {
            SubLObject isa_constraints = NIL;
            SubLObject genl_constraints = NIL;
            if (NIL != constraints) {
                isa_constraints = constraints.first();
                genl_constraints = cadr(constraints);
            }
            if (literal_arity(asent, UNPROVIDED).numE(TWO_INTEGER)) {
                final SubLObject predicate = literal_predicate(asent, UNPROVIDED);
                final SubLObject arg1 = literal_arg1(asent, UNPROVIDED);
                final SubLObject arg2 = literal_arg2(asent, UNPROVIDED);
                final SubLObject genl_col = genl_constraints.first();
                if (variable.eql(arg1)) {
                    return make_ternary_formula($$SubcollectionOfWithRelationToFn, genl_col, predicate, arg2);
                }
                return make_ternary_formula($$SubcollectionOfWithRelationFromFn, genl_col, predicate, arg1);
            }
        }
        return NIL;
    }

    public static SubLObject abduced_individual_for_constraints(final SubLObject constraints, final SubLObject problem_store) {
        final SubLObject type = abduced_type_from_constraints(constraints);
        if (NIL != type) {
            final SubLObject problem_store_term = removal_modules_inference_reflection.cycl_problem_store_decode(problem_store);
            final SubLObject term_id = problem_store_next_abduced_term_id(problem_store);
            final SubLObject abduced_term = make_ternary_formula($$AbducedTermFn, problem_store_term, type, term_id);
            return abduced_term;
        }
        return NIL;
    }

    public static SubLObject abduced_term_for_constraints(final SubLObject asent, final SubLObject variable, final SubLObject constraints, final SubLObject problem_store) {
        SubLObject isa_constraints = NIL;
        SubLObject genl_constraints = NIL;
        SubLObject quoted_isa_constraints = NIL;
        if (NIL != constraints) {
            isa_constraints = constraints.first();
            genl_constraints = cadr(constraints);
            quoted_isa_constraints = cddr(constraints).first();
        }
        if (NIL != find_if($sym10$NON_ABDUCIBLE_COLLECTION_, isa_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        if (NIL != genl_constraints) {
            return abduced_collection_for_constraints(variable, constraints, asent);
        }
        return abduced_individual_for_constraints(constraints, problem_store);
    }

    public static SubLObject abduced_type_from_constraints(final SubLObject constraints) {
        SubLObject isa_constraints = NIL;
        SubLObject genl_constraints = NIL;
        if (NIL != constraints) {
            isa_constraints = constraints.first();
            genl_constraints = cadr(constraints);
        }
        isa_constraints = cons($$Individual, isa_constraints);
        if (NIL != genl_constraints) {
            return NIL;
        }
        if (NIL == isa_constraints) {
            return Errors.error($str12$no_isa_constraints_for_abduced_ty);
        }
        if (NIL != list_utilities.singletonP(isa_constraints)) {
            return isa_constraints.first();
        }
        return list_utilities.extremal(isa_constraints, symbol_function($sym13$GENERALITY_ESTIMATE_), UNPROVIDED);
    }

    public static SubLObject abductive_asent_var_arg_constraints(final SubLObject asent, final SubLObject mt) {
        return at_var_types.formula_variables_arg_constraints(asent, mt, VARIABLE_P);
    }

    public static SubLObject removal_abduction_required(final SubLObject asent, final SubLObject sense) {
        return removal_abduction_allowedP(asent, sense);
    }

    public static SubLObject removal_abduction_allowedP(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = $POS;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem_store = inference_worker.currently_active_problem_store();
        final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        return makeBoolean(((NIL != problem_store) && (NIL != inference_datastructures_problem_store.problem_store_abduction_allowedP(problem_store))) && (NIL != inference_abduction_utilities.abduction_allowed_on_asentP(asent, mt, sense)));
    }

    public static SubLObject removal_abduction_check_sentence(final SubLObject asent, final SubLObject mt, final SubLObject sense) {
        if (NIL != inference_abduction_utilities.valid_abduction_asentP(asent, mt, sense, NIL)) {
            final SubLObject support = make_abduction_support(asent, mt, sense);
            backward.removal_add_node(support, NIL, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject make_abduction_support(final SubLObject sentence, SubLObject mt, SubLObject sense) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return arguments.make_hl_support($ABDUCTION, sense == $POS ? sentence : make_negation(sentence), mt, $TRUE_DEF);
    }

    public static SubLObject removal_abduction_pos_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_abduction_required(asent, sense);
    }

    public static SubLObject removal_abduction_pos_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        return removal_abduction_check_sentence(asent, mt, sense);
    }

    public static SubLObject removal_abduction_unify_sentence(final SubLObject asent, final SubLObject mt, final SubLObject sense, final SubLObject store) {
        SubLObject cdolist_list_var;
        final SubLObject binding_sets = cdolist_list_var = candidate_abductive_binding_sets(asent, mt, store);
        SubLObject v_bindings = NIL;
        v_bindings = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject abduced_asent = bindings.apply_bindings(v_bindings, asent);
            SubLObject support = NIL;
            if (NIL != inference_abduction_utilities.valid_abduction_asentP(abduced_asent, mt, sense, cycl_utilities.expression_find_if(ABDUCED_TERM_P, abduced_asent, UNPROVIDED, UNPROVIDED))) {
                support = make_abduction_support(abduced_asent, mt, $POS);
                backward.removal_add_node(support, v_bindings, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_bindings = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject removal_abduction_pos_unify_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject store = inference_worker.currently_active_problem_store();
        final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        return removal_abduction_unify_sentence(asent, mt, sense, store);
    }

    public static SubLObject removal_abduction_exclusiveP(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject problem_store = inference_worker.currently_active_problem_store();
        SubLObject exclusiveP = NIL;
        if (((NIL != problem_store) && (NIL != inference_datastructures_problem_store.problem_store_abduction_allowedP(problem_store))) && (NIL != cycl_utilities.expression_find_if(ABDUCED_TERM_P, asent, T, UNPROVIDED))) {
            exclusiveP = T;
        }
        return exclusiveP;
    }

    public static SubLObject removal_exclusive_abduction_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_abduction_pos_unify_expand(asent, sense);
    }

    public static SubLObject removal_abduction_neg_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_abduction_required(asent, sense);
    }

    public static SubLObject removal_abduction_neg_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        return removal_abduction_check_sentence(asent, mt, sense);
    }

    public static SubLObject declare_removal_modules_abduction_file() {
        declareFunction(me, "abductive_removal_modules", "ABDUCTIVE-REMOVAL-MODULES", 0, 0, false);
        declareFunction(me, "abductive_removal_moduleP", "ABDUCTIVE-REMOVAL-MODULE?", 1, 0, false);
        declareFunction(me, "abductive_modules_not_allowed_spec", "ABDUCTIVE-MODULES-NOT-ALLOWED-SPEC", 0, 0, false);
        declareFunction(me, "problem_store_next_abduced_term_id", "PROBLEM-STORE-NEXT-ABDUCED-TERM-ID", 1, 0, false);
        declareFunction(me, "abducing_completely_enumerable_instancesP", "ABDUCING-COMPLETELY-ENUMERABLE-INSTANCES?", 2, 0, false);
        declareFunction(me, "candidate_abductive_binding_sets", "CANDIDATE-ABDUCTIVE-BINDING-SETS", 3, 0, false);
        declareFunction(me, "abduced_collection_for_constraints", "ABDUCED-COLLECTION-FOR-CONSTRAINTS", 3, 0, false);
        declareFunction(me, "abduced_individual_for_constraints", "ABDUCED-INDIVIDUAL-FOR-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "abduced_term_for_constraints", "ABDUCED-TERM-FOR-CONSTRAINTS", 4, 0, false);
        declareFunction(me, "abduced_type_from_constraints", "ABDUCED-TYPE-FROM-CONSTRAINTS", 1, 0, false);
        declareFunction(me, "abductive_asent_var_arg_constraints", "ABDUCTIVE-ASENT-VAR-ARG-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "removal_abduction_required", "REMOVAL-ABDUCTION-REQUIRED", 2, 0, false);
        declareFunction(me, "removal_abduction_allowedP", "REMOVAL-ABDUCTION-ALLOWED?", 1, 1, false);
        new removal_modules_abduction.$removal_abduction_allowedP$UnaryFunction();
        new removal_modules_abduction.$removal_abduction_allowedP$BinaryFunction();
        declareFunction(me, "removal_abduction_check_sentence", "REMOVAL-ABDUCTION-CHECK-SENTENCE", 3, 0, false);
        declareFunction(me, "make_abduction_support", "MAKE-ABDUCTION-SUPPORT", 1, 2, false);
        declareFunction(me, "removal_abduction_pos_required", "REMOVAL-ABDUCTION-POS-REQUIRED", 1, 1, false);
        declareFunction(me, "removal_abduction_pos_check_expand", "REMOVAL-ABDUCTION-POS-CHECK-EXPAND", 1, 1, false);
        declareFunction(me, "removal_abduction_unify_sentence", "REMOVAL-ABDUCTION-UNIFY-SENTENCE", 4, 0, false);
        declareFunction(me, "removal_abduction_pos_unify_expand", "REMOVAL-ABDUCTION-POS-UNIFY-EXPAND", 1, 1, false);
        declareFunction(me, "removal_abduction_exclusiveP", "REMOVAL-ABDUCTION-EXCLUSIVE?", 1, 1, false);
        declareFunction(me, "removal_exclusive_abduction_pos_expand", "REMOVAL-EXCLUSIVE-ABDUCTION-POS-EXPAND", 1, 1, false);
        declareFunction(me, "removal_abduction_neg_required", "REMOVAL-ABDUCTION-NEG-REQUIRED", 1, 1, false);
        declareFunction(me, "removal_abduction_neg_check_expand", "REMOVAL-ABDUCTION-NEG-CHECK-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_abduction_file() {
        deflexical("*ABDUCTIVE-REMOVAL-MODULES*", $list0);
        deflexical("*ABDUCTION-TERM-ISG*", SubLTrampolineFile.maybeDefault($abduction_term_isg$, $abduction_term_isg$, () -> integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        defparameter("*ABDUCE-SUBCOLLECTION-DENOTING-TERMS?*", NIL);
        deflexical("*DEFAULT-ABDUCTION-COST*", ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject setup_removal_modules_abduction_file() {
        declare_defglobal($abduction_term_isg$);
        inference_modules.inference_removal_module($REMOVAL_ABDUCTION_POS_CHECK, $list18);
        inference_modules.inference_removal_module($REMOVAL_ABDUCTION_POS_UNIFY, $list21);
        inference_modules.inference_removal_module($REMOVAL_EXCLUSIVE_ABDUCTION_POS, $list23);
        inference_modules.inference_removal_module($REMOVAL_ABDUCTION_NEG_CHECK, $list25);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_abduction_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_abduction_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_abduction_file();
    }

    

    public static final class $removal_abduction_allowedP$UnaryFunction extends UnaryFunction {
        public $removal_abduction_allowedP$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-ABDUCTION-ALLOWED?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_abduction_allowedP(arg1, removal_modules_abduction.$removal_abduction_allowedP$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $removal_abduction_allowedP$BinaryFunction extends BinaryFunction {
        public $removal_abduction_allowedP$BinaryFunction() {
            super(extractFunctionNamed("REMOVAL-ABDUCTION-ALLOWED?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_abduction_allowedP(arg1, arg2);
        }
    }
}

/**
 * Total time: 88 ms
 */
