/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.arguments.justification_equal;
import static com.cyc.cycjava.cycl.arguments.make_hl_support;
import static com.cyc.cycjava.cycl.backward.$removal_add_node_method$;
import static com.cyc.cycjava.cycl.backward.inference_expand_hl_module;
import static com.cyc.cycjava.cycl.backward.inference_expand_sense;
import static com.cyc.cycjava.cycl.backward.removal_add_node;
import static com.cyc.cycjava.cycl.bindings.add_dont_care_variable_binding;
import static com.cyc.cycjava.cycl.bindings.apply_bindings;
import static com.cyc.cycjava.cycl.bindings.binding_list_p;
import static com.cyc.cycjava.cycl.bindings.inference_simplify_unification_bindings;
import static com.cyc.cycjava.cycl.bindings.variable_lookup;
import static com.cyc.cycjava.cycl.clause_utilities.multi_literal_subclause_specP;
import static com.cyc.cycjava.cycl.clause_utilities.total_subclause_specP;
import static com.cyc.cycjava.cycl.clauses.atomic_clause_p;
import static com.cyc.cycjava.cycl.clauses.neg_lits;
import static com.cyc.cycjava.cycl.clauses.pos_lits;
import static com.cyc.cycjava.cycl.control_vars.$external_inference_enabled$;
import static com.cyc.cycjava.cycl.control_vars.$maximum_hl_module_check_cost$;
import static com.cyc.cycjava.cycl.control_vars.inference_warn;
import static com.cyc.cycjava.cycl.cycl_utilities.atomic_sentence_predicate;
import static com.cyc.cycjava.cycl.el_utilities.asent_and_sense_to_literal;
import static com.cyc.cycjava.cycl.enumeration_types.tv_from_truth_strength;
import static com.cyc.cycjava.cycl.eval_in_api.possibly_cyc_api_funcall_2;
import static com.cyc.cycjava.cycl.eval_in_api.possibly_cyc_api_function_spec_p;
import static com.cyc.cycjava.cycl.formula_pattern_match.pattern_matches_formula_without_bindings;
import static com.cyc.cycjava.cycl.formula_pattern_match.pattern_transform_formula;
import static com.cyc.cycjava.cycl.forts.fort_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_empty_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_id_and_object_validP;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_state;
import static com.cyc.cycjava.cycl.id_index.do_id_index_state_object;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_id_threshold;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference.inference_allowed_modules;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference.inference_problem_store_privateP;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference.inference_strategy_set;
import static com.cyc.cycjava.cycl.inference.harness.inference_macros.current_controlling_inference;
import static com.cyc.cycjava.cycl.inference.harness.inference_macros.current_controlling_strategy;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.conjunctive_removal_module_p;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.find_hl_module_by_name;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.generic_removal_modules_for_sense;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.get_modules_from_simple_allowed_modules_spec;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_allowed_by_allowed_modules_specP;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_applicability_func;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_applicability_pattern;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_arity_relevant_p;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_clause_completeness;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_clause_cost;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_completeness;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_cost;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_direction_relevantP;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_every_predicates;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_exclusive_func;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_expand_func;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_expand_iterative_pattern;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_expand_pattern;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_input_encode_pattern;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_input_extract_pattern;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_input_verify_pattern;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_output_check_pattern;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_output_construct_pattern;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_output_decode_pattern;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_output_generate_pattern;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_output_verify_pattern;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_predicate_relevant_p;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_required_func;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_required_mt_relevantP;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_required_pattern_matched_p;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_subtypes;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_supplants_info;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_support_func;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_support_module;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_support_mt_result;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_support_pattern;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_support_strength;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.meta_removal_module_list;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.meta_removal_modules;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.predicate_uses_meta_removal_moduleP;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.removal_module_p;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.removal_modules_conjunctive;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.removal_modules_external;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.removal_modules_specific_for_sense;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.removal_modules_universal_for_predicate_and_sense;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.simple_allowed_modules_spec_p;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.solely_specific_removal_module_predicateP;
import static com.cyc.cycjava.cycl.inference.harness.inference_modules.some_external_removal_modulesP;
import static com.cyc.cycjava.cycl.inference.modules.removal.meta_removal_modules.meta_removal_completely_decidable_pos_required;
import static com.cyc.cycjava.cycl.inference.modules.removal.meta_removal_modules.meta_removal_completely_enumerable_pos_required;
import static com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_abduction.removal_abduction_pos_required;
import static com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_arg_index_unify_expand;
import static com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conjunctive_pruning.conjunctive_pruning_module_p;
import static com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conjunctive_pruning.conjunctive_pruning_tactic_p;
import static com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluate.removal_evaluate_bind_expand;
import static com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluation.removal_eval_expand;
import static com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_function_corresponding_predicate.removal_evaluatable_fcp_unify_required;
import static com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_function_corresponding_predicate.removal_fcp_check_required;
import static com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.removal_isa_collection_check_neg_expand;
import static com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.removal_isa_collection_check_pos_expand;
import static com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.removal_isa_defn_pos_required;
import static com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction.removal_nat_argument_lookup_expand;
import static com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction.removal_nat_function_lookup_expand;
import static com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_reflexive_on.removal_reflexive_on_expand;
import static com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_termofunit.removal_nat_formula_expand;
import static com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_termofunit.removal_nat_lookup_expand;
import static com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup.removal_tva_check_expand;
import static com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup.removal_tva_check_required;
import static com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup.removal_tva_unify_required;
import static com.cyc.cycjava.cycl.iteration.iteration_finalize;
import static com.cyc.cycjava.cycl.iteration.iteration_next;
import static com.cyc.cycjava.cycl.iteration.iterator_p;
import static com.cyc.cycjava.cycl.iteration.new_list_iterator;
import static com.cyc.cycjava.cycl.list_utilities.delete_first;
import static com.cyc.cycjava.cycl.list_utilities.lengthGE;
import static com.cyc.cycjava.cycl.list_utilities.member_eqP;
import static com.cyc.cycjava.cycl.list_utilities.sublisp_boolean;
import static com.cyc.cycjava.cycl.memoization_state.$memoization_state$;
import static com.cyc.cycjava.cycl.memoization_state.$memoized_item_not_found$;
import static com.cyc.cycjava.cycl.memoization_state.caching_results;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_enter_multi_key_n;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_lookup;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_put;
import static com.cyc.cycjava.cycl.memoization_state.create_caching_state;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_lock;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_lookup;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_put;
import static com.cyc.cycjava.cycl.memoization_state.note_memoized_function;
import static com.cyc.cycjava.cycl.memoization_state.sxhash_calc_3;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$mt$;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$relevant_mt_function$;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$relevant_mts$;
import static com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_function;
import static com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_mt;
import static com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_mt_list;
import static com.cyc.cycjava.cycl.mt_relevance_macros.with_inference_mt_relevance_validate;
import static com.cyc.cycjava.cycl.pattern_match.pattern_transform_tree;
import static com.cyc.cycjava.cycl.set.do_set_internal;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_basis_object;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_doneP;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_element_validP;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_initial_state;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_next;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_update_state;
import static com.cyc.cycjava.cycl.unification_utilities.term_unify;
import static com.cyc.cycjava.cycl.variables.fully_bound_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.eval_in_api;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.hl_macros;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.pattern_match;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.modules.simplification_modules;
import com.cyc.cycjava.cycl.inference.modules.removal.meta_removal_modules;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_abduction;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conjunctive_pruning;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluate;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluation;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_function_corresponding_predicate;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ist;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_reflexive_on;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_termofunit;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      INFERENCE-WORKER-REMOVAL
 * source file: /cyc/top/cycl/inference/harness/inference-worker-removal.lisp
 * created:     2019/07/03 17:37:39
 */
public final class inference_worker_removal extends SubLTranslatedFile implements V12 {
    public static final SubLObject possibly_replace_ist_supports(SubLObject problem, SubLObject removal_bindings, SubLObject supports) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != inference_datastructures_problem.ist_problem_p(problem)) {
                {
                    SubLObject asent = inference_datastructures_problem.single_literal_problem_atomic_sentence(problem);
                    SubLObject sentence = bindings.apply_bindings(removal_bindings, asent);
                    supports = removal_modules_ist.make_ist_justification(mt_relevance_macros.$mt$.getDynamicValue(thread), sentence, supports);
                }
            }
            return supports;
        }
    }

    // Definitions
    public static final class $removal_link_data_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.$removal_link_data_native.this.$hl_module;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.$removal_link_data_native.this.$bindings;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.$removal_link_data_native.this.$supports;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.$removal_link_data_native.this.$hl_module = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.$removal_link_data_native.this.$bindings = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.$removal_link_data_native.this.$supports = value;
        }

        public SubLObject $hl_module = Lisp.NIL;

        public SubLObject $bindings = Lisp.NIL;

        public SubLObject $supports = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.$removal_link_data_native.class, REMOVAL_LINK_DATA, REMOVAL_LINK_DATA_P, $list_alt2, $list_alt3, new String[]{ "$hl_module", "$bindings", "$supports" }, $list_alt4, $list_alt5, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final SubLFile me = new inference_worker_removal();

 public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_worker_removal";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_removal_link_data$ = makeSymbol("*DTP-REMOVAL-LINK-DATA*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $conjunctive_removal_tactic_expand_results_queue$ = makeSymbol("*CONJUNCTIVE-REMOVAL-TACTIC-EXPAND-RESULTS-QUEUE*");

    // defparameter
    /**
     * Suppress the creation of a split link and child problems for conjunctive
     * removals. This can vastly reduce the number of problems and proofs for
     * queries with excessive amounts of conjunctive removal.
     */
    @LispMethod(comment = "Suppress the creation of a split link and child problems for conjunctive\r\nremovals. This can vastly reduce the number of problems and proofs for\r\nqueries with excessive amounts of conjunctive removal.\ndefparameter\nSuppress the creation of a split link and child problems for conjunctive\nremovals. This can vastly reduce the number of problems and proofs for\nqueries with excessive amounts of conjunctive removal.")
    private static final SubLSymbol $conjunctive_removal_suppress_split_justificationP$ = makeSymbol("*CONJUNCTIVE-REMOVAL-SUPPRESS-SPLIT-JUSTIFICATION?*");

    // defparameter
    /**
     * Temporary control variable, eventually should stay T. When non-nil, we skip
     * the restriction/closed problem indirection for answers when we aren't
     * computing justifications.
     */
    @LispMethod(comment = "Temporary control variable, eventually should stay T. When non-nil, we skip\r\nthe restriction/closed problem indirection for answers when we aren\'t\r\ncomputing justifications.\ndefparameter\nTemporary control variable, eventually should stay T. When non-nil, we skip\nthe restriction/closed problem indirection for answers when we aren\'t\ncomputing justifications.")
    public static final SubLSymbol $conjunctive_removal_optimize_when_no_justificationsP$ = makeSymbol("*CONJUNCTIVE-REMOVAL-OPTIMIZE-WHEN-NO-JUSTIFICATIONS?*");

    // defparameter
    /**
     * The number of expected removal tactic results at which we generate them
     * iteratively.
     */
    @LispMethod(comment = "The number of expected removal tactic results at which we generate them\r\niteratively.\ndefparameter\nThe number of expected removal tactic results at which we generate them\niteratively.")
    private static final SubLSymbol $removal_tactic_iteration_threshold$ = makeSymbol("*REMOVAL-TACTIC-ITERATION-THRESHOLD*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $removal_tactic_expand_results_queue$ = makeSymbol("*REMOVAL-TACTIC-EXPAND-RESULTS-QUEUE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol REMOVAL_LINK_DATA = makeSymbol("REMOVAL-LINK-DATA");

    private static final SubLSymbol REMOVAL_LINK_DATA_P = makeSymbol("REMOVAL-LINK-DATA-P");

    static private final SubLList $list2 = list(makeSymbol("HL-MODULE"), makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"));

    static private final SubLList $list3 = list(makeKeyword("HL-MODULE"), makeKeyword("BINDINGS"), makeKeyword("SUPPORTS"));

    static private final SubLList $list4 = list(makeSymbol("REMOV-LINK-DATA-HL-MODULE"), makeSymbol("REMOV-LINK-DATA-BINDINGS"), makeSymbol("REMOV-LINK-DATA-SUPPORTS"));

    static private final SubLList $list5 = list(makeSymbol("_CSETF-REMOV-LINK-DATA-HL-MODULE"), makeSymbol("_CSETF-REMOV-LINK-DATA-BINDINGS"), makeSymbol("_CSETF-REMOV-LINK-DATA-SUPPORTS"));

    private static final SubLSymbol REMOVAL_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("REMOVAL-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("REMOVAL-LINK-DATA-P"));

    private static final SubLSymbol REMOV_LINK_DATA_HL_MODULE = makeSymbol("REMOV-LINK-DATA-HL-MODULE");

    private static final SubLSymbol _CSETF_REMOV_LINK_DATA_HL_MODULE = makeSymbol("_CSETF-REMOV-LINK-DATA-HL-MODULE");

    private static final SubLSymbol REMOV_LINK_DATA_BINDINGS = makeSymbol("REMOV-LINK-DATA-BINDINGS");

    private static final SubLSymbol _CSETF_REMOV_LINK_DATA_BINDINGS = makeSymbol("_CSETF-REMOV-LINK-DATA-BINDINGS");

    private static final SubLSymbol REMOV_LINK_DATA_SUPPORTS = makeSymbol("REMOV-LINK-DATA-SUPPORTS");

    private static final SubLSymbol _CSETF_REMOV_LINK_DATA_SUPPORTS = makeSymbol("_CSETF-REMOV-LINK-DATA-SUPPORTS");

    private static final SubLString $str18$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_REMOVAL_LINK_DATA = makeSymbol("MAKE-REMOVAL-LINK-DATA");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_REMOVAL_LINK_DATA_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-REMOVAL-LINK-DATA-METHOD");

    private static final SubLSymbol REMOVAL_LINK_P = makeSymbol("REMOVAL-LINK-P");

    private static final SubLSymbol BINDING_LIST_P = makeSymbol("BINDING-LIST-P");

    private static final SubLList $list34 = list(makeSymbol("HL-MODULE"), makeSymbol("PRODUCTIVITY"), makeSymbol("COMPLETENESS"));

    private static final SubLSymbol $sym35$CONJUNCTIVE_REMOVAL_MODULE_PRIORITY_ = makeSymbol("CONJUNCTIVE-REMOVAL-MODULE-PRIORITY<");

    private static final SubLString $str38$_s_stated_its_applicability_to_th = makeString("~s stated its applicability to the subclause spec ~s, which does not specify more than one literal.\nConjunctive removal modules must apply to more than one literal in the clause.");

    private static final SubLList $list41 = list(makeSymbol("REMOVAL-BINDINGS"), makeSymbol("JUSTIFICATIONS"));

    private static final SubLSymbol $CONJUNCTIVE_REMOVAL_EXPAND_ITERATIVE = makeKeyword("CONJUNCTIVE-REMOVAL-EXPAND-ITERATIVE");

    private static final SubLSymbol $sym43$HL_VAR_ = makeSymbol("HL-VAR?");

    private static final SubLSymbol $CONJUNCTIVE_REMOVAL_EXPAND = makeKeyword("CONJUNCTIVE-REMOVAL-EXPAND");

    private static final SubLSymbol $INFERENCE_PROOF_SPEC = makeKeyword("INFERENCE-PROOF-SPEC");

    private static final SubLString $str46$Problem_reuse_assumptions_were_vi = makeString("Problem reuse assumptions were violated: ~a did not equal ~a");

    private static final SubLString $str47$Couldn_t_find_the_right_conjuncti = makeString("Couldn't find the right conjunctive removal justification for ~S");

    private static final SubLList $list50 = list(makeUninternedSymbol("START"), makeUninternedSymbol("END"), makeUninternedSymbol("DELTA"));

    private static final SubLList $list52 = list(makeSymbol("STORE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym53$STORE_VAR = makeUninternedSymbol("STORE-VAR");

    private static final SubLSymbol $negation_by_failure$ = makeSymbol("*NEGATION-BY-FAILURE*");

    private static final SubLSymbol $sym56$PROBLEM_STORE_NEGATION_BY_FAILURE_ = makeSymbol("PROBLEM-STORE-NEGATION-BY-FAILURE?");

    private static final SubLSymbol META_REMOVAL_COMPLETELY_DECIDABLE_POS_REQUIRED = makeSymbol("META-REMOVAL-COMPLETELY-DECIDABLE-POS-REQUIRED");

    private static final SubLSymbol $sym59$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol META_REMOVAL_COMPLETELY_ENUMERABLE_POS_REQUIRED = makeSymbol("META-REMOVAL-COMPLETELY-ENUMERABLE-POS-REQUIRED");

    private static final SubLSymbol REMOVAL_ABDUCTION_POS_REQUIRED = makeSymbol("REMOVAL-ABDUCTION-POS-REQUIRED");

    private static final SubLSymbol REMOVAL_EVALUATABLE_FCP_UNIFY_REQUIRED = makeSymbol("REMOVAL-EVALUATABLE-FCP-UNIFY-REQUIRED");

    private static final SubLSymbol REMOVAL_FCP_CHECK_REQUIRED = makeSymbol("REMOVAL-FCP-CHECK-REQUIRED");

    private static final SubLSymbol REMOVAL_ISA_DEFN_POS_REQUIRED = makeSymbol("REMOVAL-ISA-DEFN-POS-REQUIRED");

    private static final SubLSymbol REMOVAL_TVA_CHECK_REQUIRED = makeSymbol("REMOVAL-TVA-CHECK-REQUIRED");

    private static final SubLSymbol REMOVAL_TVA_UNIFY_REQUIRED = makeSymbol("REMOVAL-TVA-UNIFY-REQUIRED");

    private static final SubLSymbol REMOVAL_ASSERTED_TERM_SENTENCES_ARG_INDEX_UNIFY_EXPAND = makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-ARG-INDEX-UNIFY-EXPAND");

    private static final SubLSymbol REMOVAL_EVAL_EXPAND = makeSymbol("REMOVAL-EVAL-EXPAND");

    private static final SubLSymbol REMOVAL_EVALUATE_BIND_EXPAND = makeSymbol("REMOVAL-EVALUATE-BIND-EXPAND");

    private static final SubLSymbol REMOVAL_ISA_COLLECTION_CHECK_NEG_EXPAND = makeSymbol("REMOVAL-ISA-COLLECTION-CHECK-NEG-EXPAND");

    private static final SubLSymbol REMOVAL_ISA_COLLECTION_CHECK_POS_EXPAND = makeSymbol("REMOVAL-ISA-COLLECTION-CHECK-POS-EXPAND");

    private static final SubLSymbol REMOVAL_NAT_ARGUMENT_LOOKUP_EXPAND = makeSymbol("REMOVAL-NAT-ARGUMENT-LOOKUP-EXPAND");

    private static final SubLSymbol REMOVAL_NAT_FORMULA_EXPAND = makeSymbol("REMOVAL-NAT-FORMULA-EXPAND");

    private static final SubLSymbol REMOVAL_NAT_FUNCTION_LOOKUP_EXPAND = makeSymbol("REMOVAL-NAT-FUNCTION-LOOKUP-EXPAND");

    private static final SubLSymbol REMOVAL_NAT_LOOKUP_EXPAND = makeSymbol("REMOVAL-NAT-LOOKUP-EXPAND");

    private static final SubLSymbol REMOVAL_REFLEXIVE_ON_EXPAND = makeSymbol("REMOVAL-REFLEXIVE-ON-EXPAND");

    private static final SubLSymbol REMOVAL_TVA_CHECK_EXPAND = makeSymbol("REMOVAL-TVA-CHECK-EXPAND");

    private static final SubLSymbol $DETERMINE_NEW_REMOVAL_TACTIC_SPECS_FROM_HL_MODULES = makeKeyword("DETERMINE-NEW-REMOVAL-TACTIC-SPECS-FROM-HL-MODULES");

    private static final SubLString $str82$For_sentence_____S__Maximum_HL_Mo = makeString("For sentence :~%~S~%Maximum HL Module check cost exceeded by ~A (~A).");

    private static final SubLSymbol LITERAL_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE_WITH_SENSE_INT = makeSymbol("LITERAL-REMOVAL-CANDIDATE-HL-MODULES-FOR-PREDICATE-WITH-SENSE-INT");

    private static final SubLSymbol LITERAL_META_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE = makeSymbol("LITERAL-META-REMOVAL-CANDIDATE-HL-MODULES-FOR-PREDICATE");

    private static final SubLList $list85 = list(list(makeSymbol("TACTIC"), makeSymbol("MT"), makeSymbol("SENSE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym86$TACTIC_VAR = makeUninternedSymbol("TACTIC-VAR");

    private static final SubLSymbol $inference_expand_hl_module$ = makeSymbol("*INFERENCE-EXPAND-HL-MODULE*");

    private static final SubLSymbol TACTIC_HL_MODULE = makeSymbol("TACTIC-HL-MODULE");

    private static final SubLSymbol $inference_expand_sense$ = makeSymbol("*INFERENCE-EXPAND-SENSE*");

    private static final SubLSymbol WITH_PROBLEM_STORE_REMOVAL_ASSUMPTIONS = makeSymbol("WITH-PROBLEM-STORE-REMOVAL-ASSUMPTIONS");

    private static final SubLSymbol TACTIC_STORE = makeSymbol("TACTIC-STORE");

    private static final SubLSymbol $REMOVAL_OUTPUT_GENERATE = makeKeyword("REMOVAL-OUTPUT-GENERATE");

    private static final SubLSymbol HANDLE_REMOVAL_ADD_NODE_FOR_OUTPUT_GENERATE = makeSymbol("HANDLE-REMOVAL-ADD-NODE-FOR-OUTPUT-GENERATE");

    private static final SubLSymbol $MAYBE_MAKE_REMOVAL_TACTIC_EXPAND_RESULTS_PROGRESS_ITERATOR = makeKeyword("MAYBE-MAKE-REMOVAL-TACTIC-EXPAND-RESULTS-PROGRESS-ITERATOR");

    private static final SubLSymbol HANDLE_REMOVAL_ADD_NODE_FOR_EXPAND_RESULTS = makeSymbol("HANDLE-REMOVAL-ADD-NODE-FOR-EXPAND-RESULTS");

    private static final SubLList $list98 = list(makeSymbol("REMOVAL-BINDINGS"), makeSymbol("SUPPORTS"));

    private static final SubLString $str99$Ignoring_result_from__S_due_to_op = makeString("Ignoring result from ~S due to open supports");

    private static final SubLSymbol $sym100$PRODUCTIVITY__ = makeSymbol("PRODUCTIVITY-<");

    private static final SubLSymbol TACTIC_PRODUCTIVITY = makeSymbol("TACTIC-PRODUCTIVITY");

    private static final SubLList $list102 = list(list(makeSymbol("RAW-OUTPUT"), makeSymbol("RAW-OUTPUT-ITERATOR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym103$ITERATOR = makeUninternedSymbol("ITERATOR");

    private static final SubLSymbol ITERATOR_P = makeSymbol("ITERATOR-P");

    private static final SubLSymbol ITERATION_FINALIZE = makeSymbol("ITERATION-FINALIZE");

    private static final SubLSymbol $MAYBE_MAKE_INFERENCE_OUTPUT_ITERATOR = makeKeyword("MAYBE-MAKE-INFERENCE-OUTPUT-ITERATOR");

    private static final SubLSymbol $HANDLE_ONE_OUTPUT_GENERATE_RESULT = makeKeyword("HANDLE-ONE-OUTPUT-GENERATE-RESULT");

    private static final SubLList $list112 = list(makeSymbol("&OPTIONAL"), makeSymbol("SUPPORT"), makeSymbol("&REST"), makeSymbol("MORE-SUPPORTS"));

    private static final SubLString $str114$unknown_thing_to_do_in_the_HL_mod = makeString("unknown thing to do in the HL module guts: ~s");

    public static final SubLObject removal_link_data_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject removal_link_data_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject removal_link_data_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.$removal_link_data_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject removal_link_data_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.$removal_link_data_native.class ? T : NIL;
    }

    public static final SubLObject remov_link_data_hl_module_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_LINK_DATA_P);
        return v_object.getField2();
    }

    public static SubLObject remov_link_data_hl_module(final SubLObject v_object) {
        assert NIL != inference_worker_removal.removal_link_data_p(v_object) : "! inference_worker_removal.removal_link_data_p(v_object) " + "inference_worker_removal.removal_link_data_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject remov_link_data_bindings_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_LINK_DATA_P);
        return v_object.getField3();
    }

    public static SubLObject remov_link_data_bindings(final SubLObject v_object) {
        assert NIL != inference_worker_removal.removal_link_data_p(v_object) : "! inference_worker_removal.removal_link_data_p(v_object) " + "inference_worker_removal.removal_link_data_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject remov_link_data_supports_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_LINK_DATA_P);
        return v_object.getField4();
    }

    public static SubLObject remov_link_data_supports(final SubLObject v_object) {
        assert NIL != inference_worker_removal.removal_link_data_p(v_object) : "! inference_worker_removal.removal_link_data_p(v_object) " + "inference_worker_removal.removal_link_data_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject _csetf_remov_link_data_hl_module_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_LINK_DATA_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_remov_link_data_hl_module(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_worker_removal.removal_link_data_p(v_object) : "! inference_worker_removal.removal_link_data_p(v_object) " + "inference_worker_removal.removal_link_data_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_remov_link_data_bindings_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_LINK_DATA_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_remov_link_data_bindings(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_worker_removal.removal_link_data_p(v_object) : "! inference_worker_removal.removal_link_data_p(v_object) " + "inference_worker_removal.removal_link_data_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_remov_link_data_supports_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, REMOVAL_LINK_DATA_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_remov_link_data_supports(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_worker_removal.removal_link_data_p(v_object) : "! inference_worker_removal.removal_link_data_p(v_object) " + "inference_worker_removal.removal_link_data_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject make_removal_link_data_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.$removal_link_data_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($HL_MODULE)) {
                        com.cyc.cycjava.cycl.inference.harness.inference_worker_removal._csetf_remov_link_data_hl_module(v_new, current_value);
                    } else {
                        if (pcase_var.eql($BINDINGS)) {
                            com.cyc.cycjava.cycl.inference.harness.inference_worker_removal._csetf_remov_link_data_bindings(v_new, current_value);
                        } else {
                            if (pcase_var.eql($SUPPORTS)) {
                                com.cyc.cycjava.cycl.inference.harness.inference_worker_removal._csetf_remov_link_data_supports(v_new, current_value);
                            } else {
                                Errors.error($str_alt17$Invalid_slot__S_for_construction_, current_arg);
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_removal_link_data(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.$removal_link_data_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($HL_MODULE)) {
                inference_worker_removal._csetf_remov_link_data_hl_module(v_new, current_value);
            } else
                if (pcase_var.eql($BINDINGS)) {
                    inference_worker_removal._csetf_remov_link_data_bindings(v_new, current_value);
                } else
                    if (pcase_var.eql($SUPPORTS)) {
                        inference_worker_removal._csetf_remov_link_data_supports(v_new, current_value);
                    } else {
                        Errors.error(inference_worker_removal.$str18$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_removal_link_data(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, inference_worker_removal.MAKE_REMOVAL_LINK_DATA, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $HL_MODULE, inference_worker_removal.remov_link_data_hl_module(obj));
        funcall(visitor_fn, obj, $SLOT, $BINDINGS, inference_worker_removal.remov_link_data_bindings(obj));
        funcall(visitor_fn, obj, $SLOT, $SUPPORTS, inference_worker_removal.remov_link_data_supports(obj));
        funcall(visitor_fn, obj, $END, inference_worker_removal.MAKE_REMOVAL_LINK_DATA, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_removal_link_data_method(final SubLObject obj, final SubLObject visitor_fn) {
        return inference_worker_removal.visit_defstruct_removal_link_data(obj, visitor_fn);
    }

    /**
     *
     *
     * @return removal-link-p
    This is a link to goal by virtue of the fact that it has no supporting mapped problems.
     */
    @LispMethod(comment = "@return removal-link-p\r\nThis is a link to goal by virtue of the fact that it has no supporting mapped problems.")
    public static final SubLObject new_removal_link_alt(SubLObject problem, SubLObject hl_module, SubLObject removal_bindings, SubLObject supports) {
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        {
            SubLObject removal_link = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.new_removal_link_int(problem, hl_module, removal_bindings, supports);
            inference_worker.propagate_problem_link(removal_link);
            return removal_link;
        }
    }

    /**
     *
     *
     * @return removal-link-p
    This is a link to goal by virtue of the fact that it has no supporting mapped problems.
     */
    @LispMethod(comment = "@return removal-link-p\r\nThis is a link to goal by virtue of the fact that it has no supporting mapped problems.")
    public static SubLObject new_removal_link(final SubLObject problem, final SubLObject hl_module, final SubLObject removal_bindings, final SubLObject supports) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : "! inference_datastructures_problem.problem_p(problem) " + ("inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) ") + problem;
        final SubLObject removal_link = inference_worker_removal.new_removal_link_int(problem, hl_module, removal_bindings, supports);
        inference_worker.propagate_problem_link(removal_link);
        return removal_link;
    }

    /**
     * Returns a new :removal link
     * with its data properties set to HL-MODULE, BINDINGS, and SUPPORTS,
     * with a supported problem of PROBLEM, and no supporting problems yet.
     */
    @LispMethod(comment = "Returns a new :removal link\r\nwith its data properties set to HL-MODULE, BINDINGS, and SUPPORTS,\r\nwith a supported problem of PROBLEM, and no supporting problems yet.\nReturns a new :removal link\nwith its data properties set to HL-MODULE, BINDINGS, and SUPPORTS,\nwith a supported problem of PROBLEM, and no supporting problems yet.")
    public static final SubLObject new_removal_link_int_alt(SubLObject problem, SubLObject hl_module, SubLObject removal_bindings, SubLObject supports) {
        {
            SubLObject removal_link = inference_datastructures_problem_link.new_problem_link($REMOVAL, problem);
            com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.new_removal_link_data(removal_link);
            com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.set_removal_link_hl_module(removal_link, hl_module);
            com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.set_removal_link_bindings(removal_link, removal_bindings);
            com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.set_removal_link_supports(removal_link, supports);
            inference_datastructures_problem.index_problem_argument_link(problem, removal_link);
            return removal_link;
        }
    }

    /**
     * Returns a new :removal link
     * with its data properties set to HL-MODULE, BINDINGS, and SUPPORTS,
     * with a supported problem of PROBLEM, and no supporting problems yet.
     */
    @LispMethod(comment = "Returns a new :removal link\r\nwith its data properties set to HL-MODULE, BINDINGS, and SUPPORTS,\r\nwith a supported problem of PROBLEM, and no supporting problems yet.\nReturns a new :removal link\nwith its data properties set to HL-MODULE, BINDINGS, and SUPPORTS,\nwith a supported problem of PROBLEM, and no supporting problems yet.")
    public static SubLObject new_removal_link_int(final SubLObject problem, final SubLObject hl_module, final SubLObject removal_bindings, final SubLObject supports) {
        final SubLObject removal_link = inference_datastructures_problem_link.new_problem_link($REMOVAL, problem);
        inference_worker_removal.new_removal_link_data(removal_link);
        inference_worker_removal.set_removal_link_hl_module(removal_link, hl_module);
        inference_worker_removal.set_removal_link_bindings(removal_link, removal_bindings);
        inference_worker_removal.set_removal_link_supports(removal_link, supports);
        inference_datastructures_problem.index_problem_argument_link(problem, removal_link);
        return removal_link;
    }

    public static final SubLObject new_removal_link_data_alt(SubLObject removal_link) {
        {
            SubLObject data = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.make_removal_link_data(UNPROVIDED);
            inference_datastructures_problem_link.set_problem_link_data(removal_link, data);
        }
        return removal_link;
    }

    public static SubLObject new_removal_link_data(final SubLObject removal_link) {
        final SubLObject data = inference_worker_removal.make_removal_link_data(UNPROVIDED);
        inference_datastructures_problem_link.set_problem_link_data(removal_link, data);
        return removal_link;
    }

    public static final SubLObject destroy_removal_link_alt(SubLObject removal_link) {
        inference_datastructures_problem.deindex_problem_argument_link(inference_datastructures_problem_link.problem_link_supported_problem(removal_link), removal_link);
        {
            SubLObject data = inference_datastructures_problem_link.problem_link_data(removal_link);
            com.cyc.cycjava.cycl.inference.harness.inference_worker_removal._csetf_remov_link_data_hl_module(data, $FREE);
            com.cyc.cycjava.cycl.inference.harness.inference_worker_removal._csetf_remov_link_data_bindings(data, $FREE);
            com.cyc.cycjava.cycl.inference.harness.inference_worker_removal._csetf_remov_link_data_supports(data, $FREE);
        }
        return removal_link;
    }

    public static SubLObject destroy_removal_link(final SubLObject removal_link) {
        inference_datastructures_problem.deindex_problem_argument_link(inference_datastructures_problem_link.problem_link_supported_problem(removal_link), removal_link);
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(removal_link);
        inference_worker_removal._csetf_remov_link_data_hl_module(data, $FREE);
        inference_worker_removal._csetf_remov_link_data_bindings(data, $FREE);
        inference_worker_removal._csetf_remov_link_data_supports(data, $FREE);
        return removal_link;
    }

    public static final SubLObject removal_link_hl_module_alt(SubLObject removal_link) {
        SubLTrampolineFile.checkType(removal_link, REMOVAL_LINK_P);
        {
            SubLObject data = inference_datastructures_problem_link.problem_link_data(removal_link);
            return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.remov_link_data_hl_module(data);
        }
    }

    public static SubLObject removal_link_hl_module(final SubLObject removal_link) {
        assert NIL != inference_worker_removal.removal_link_p(removal_link) : "! inference_worker_removal.removal_link_p(removal_link) " + ("inference_worker_removal.removal_link_p(removal_link) " + "CommonSymbols.NIL != inference_worker_removal.removal_link_p(removal_link) ") + removal_link;
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(removal_link);
        return inference_worker_removal.remov_link_data_hl_module(data);
    }

    /**
     * The first elements of these bindings are in the space of REMOVAL-LINK's
     * supported problem, and their second elements are in the space of
     * REMOVAL-LINK's unique supporting problem.
     */
    @LispMethod(comment = "The first elements of these bindings are in the space of REMOVAL-LINK\'s\r\nsupported problem, and their second elements are in the space of\r\nREMOVAL-LINK\'s unique supporting problem.\nThe first elements of these bindings are in the space of REMOVAL-LINK\'s\nsupported problem, and their second elements are in the space of\nREMOVAL-LINK\'s unique supporting problem.")
    public static final SubLObject removal_link_bindings_alt(SubLObject removal_link) {
        SubLTrampolineFile.checkType(removal_link, REMOVAL_LINK_P);
        {
            SubLObject data = inference_datastructures_problem_link.problem_link_data(removal_link);
            return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.remov_link_data_bindings(data);
        }
    }

    /**
     * The first elements of these bindings are in the space of REMOVAL-LINK's
     * supported problem, and their second elements are in the space of
     * REMOVAL-LINK's unique supporting problem.
     */
    @LispMethod(comment = "The first elements of these bindings are in the space of REMOVAL-LINK\'s\r\nsupported problem, and their second elements are in the space of\r\nREMOVAL-LINK\'s unique supporting problem.\nThe first elements of these bindings are in the space of REMOVAL-LINK\'s\nsupported problem, and their second elements are in the space of\nREMOVAL-LINK\'s unique supporting problem.")
    public static SubLObject removal_link_bindings(final SubLObject removal_link) {
        assert NIL != inference_worker_removal.removal_link_p(removal_link) : "! inference_worker_removal.removal_link_p(removal_link) " + ("inference_worker_removal.removal_link_p(removal_link) " + "CommonSymbols.NIL != inference_worker_removal.removal_link_p(removal_link) ") + removal_link;
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(removal_link);
        return inference_worker_removal.remov_link_data_bindings(data);
    }

    public static final SubLObject removal_link_supports_alt(SubLObject removal_link) {
        SubLTrampolineFile.checkType(removal_link, REMOVAL_LINK_P);
        {
            SubLObject data = inference_datastructures_problem_link.problem_link_data(removal_link);
            return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.remov_link_data_supports(data);
        }
    }

    public static SubLObject removal_link_supports(final SubLObject removal_link) {
        assert NIL != inference_worker_removal.removal_link_p(removal_link) : "! inference_worker_removal.removal_link_p(removal_link) " + ("inference_worker_removal.removal_link_p(removal_link) " + "CommonSymbols.NIL != inference_worker_removal.removal_link_p(removal_link) ") + removal_link;
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(removal_link);
        return inference_worker_removal.remov_link_data_supports(data);
    }

    public static final SubLObject set_removal_link_hl_module_alt(SubLObject removal_link, SubLObject hl_module) {
        SubLTrampolineFile.checkType(removal_link, REMOVAL_LINK_P);
        SubLTrampolineFile.checkType(hl_module, HL_MODULE_P);
        {
            SubLObject data = inference_datastructures_problem_link.problem_link_data(removal_link);
            com.cyc.cycjava.cycl.inference.harness.inference_worker_removal._csetf_remov_link_data_hl_module(data, hl_module);
        }
        return removal_link;
    }

    public static SubLObject set_removal_link_hl_module(final SubLObject removal_link, final SubLObject hl_module) {
        assert NIL != inference_worker_removal.removal_link_p(removal_link) : "! inference_worker_removal.removal_link_p(removal_link) " + ("inference_worker_removal.removal_link_p(removal_link) " + "CommonSymbols.NIL != inference_worker_removal.removal_link_p(removal_link) ") + removal_link;
        assert NIL != inference_modules.hl_module_p(hl_module) : "! inference_modules.hl_module_p(hl_module) " + ("inference_modules.hl_module_p(hl_module) " + "CommonSymbols.NIL != inference_modules.hl_module_p(hl_module) ") + hl_module;
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(removal_link);
        inference_worker_removal._csetf_remov_link_data_hl_module(data, hl_module);
        return removal_link;
    }

    public static final SubLObject set_removal_link_bindings_alt(SubLObject removal_link, SubLObject v_bindings) {
        SubLTrampolineFile.checkType(removal_link, REMOVAL_LINK_P);
        SubLTrampolineFile.checkType(v_bindings, BINDING_LIST_P);
        {
            SubLObject data = inference_datastructures_problem_link.problem_link_data(removal_link);
            com.cyc.cycjava.cycl.inference.harness.inference_worker_removal._csetf_remov_link_data_bindings(data, v_bindings);
        }
        return removal_link;
    }

    public static SubLObject set_removal_link_bindings(final SubLObject removal_link, final SubLObject v_bindings) {
        assert NIL != inference_worker_removal.removal_link_p(removal_link) : "! inference_worker_removal.removal_link_p(removal_link) " + ("inference_worker_removal.removal_link_p(removal_link) " + "CommonSymbols.NIL != inference_worker_removal.removal_link_p(removal_link) ") + removal_link;
        assert NIL != binding_list_p(v_bindings) : "! bindings.binding_list_p(v_bindings) " + ("bindings.binding_list_p(v_bindings) " + "CommonSymbols.NIL != bindings.binding_list_p(v_bindings) ") + v_bindings;
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(removal_link);
        inference_worker_removal._csetf_remov_link_data_bindings(data, v_bindings);
        return removal_link;
    }

    public static final SubLObject set_removal_link_supports_alt(SubLObject removal_link, SubLObject supports) {
        SubLTrampolineFile.checkType(removal_link, REMOVAL_LINK_P);
        SubLTrampolineFile.checkType(supports, HL_JUSTIFICATION_P);
        if (NIL != inference_datastructures_problem_store.problem_store_compute_answer_justificationsP(inference_datastructures_problem_link.problem_link_store(removal_link))) {
            {
                SubLObject data = inference_datastructures_problem_link.problem_link_data(removal_link);
                com.cyc.cycjava.cycl.inference.harness.inference_worker_removal._csetf_remov_link_data_supports(data, supports);
            }
        }
        return removal_link;
    }

    public static SubLObject set_removal_link_supports(final SubLObject removal_link, final SubLObject supports) {
        assert NIL != inference_worker_removal.removal_link_p(removal_link) : "! inference_worker_removal.removal_link_p(removal_link) " + ("inference_worker_removal.removal_link_p(removal_link) " + "CommonSymbols.NIL != inference_worker_removal.removal_link_p(removal_link) ") + removal_link;
        assert NIL != arguments.hl_justification_p(supports) : "! arguments.hl_justification_p(supports) " + ("arguments.hl_justification_p(supports) " + "CommonSymbols.NIL != arguments.hl_justification_p(supports) ") + supports;
        if (NIL != inference_datastructures_problem_store.problem_store_compute_answer_justificationsP(inference_datastructures_problem_link.problem_link_store(removal_link))) {
            final SubLObject data = inference_datastructures_problem_link.problem_link_data(removal_link);
            inference_worker_removal._csetf_remov_link_data_supports(data, supports);
        }
        return removal_link;
    }

    public static final SubLObject removal_link_tactic_alt(SubLObject removal_link) {
        SubLTrampolineFile.checkType(removal_link, REMOVAL_LINK_P);
        {
            SubLObject hl_module = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.removal_link_hl_module(removal_link);
            SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(removal_link);
            SubLObject store = inference_datastructures_problem_link.problem_link_store(removal_link);
            if (NIL != removal_module_p(hl_module)) {
                {
                    SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
                    SubLObject candidate_tactic = NIL;
                    for (candidate_tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate_tactic = cdolist_list_var.first()) {
                        if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(candidate_tactic, $REMOVAL)) {
                            if (inference_datastructures_tactic.tactic_hl_module(candidate_tactic) == hl_module) {
                                return candidate_tactic;
                            }
                        }
                    }
                }
                if ((NIL != inference_datastructures_problem_store.problem_store_add_restriction_layer_of_indirectionP(store)) && (NIL != inference_datastructures_problem.closed_problem_p(problem))) {
                    {
                        SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                        SubLObject state = NIL;
                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                            {
                                SubLObject restriction_link = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, restriction_link)) {
                                    if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $RESTRICTION)) {
                                        {
                                            SubLObject unrestricted_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
                                            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(unrestricted_problem);
                                            SubLObject candidate_tactic = NIL;
                                            for (candidate_tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate_tactic = cdolist_list_var.first()) {
                                                if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(candidate_tactic, $REMOVAL)) {
                                                    if (inference_datastructures_tactic.tactic_hl_module(candidate_tactic) == hl_module) {
                                                        return candidate_tactic;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                {
                    SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                    SubLObject state = NIL;
                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        {
                            SubLObject split_link = set_contents.do_set_contents_next(basis_object, state);
                            if (NIL != set_contents.do_set_contents_element_validP(state, split_link)) {
                                if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(split_link, $SPLIT)) {
                                    {
                                        SubLObject split_problem = inference_datastructures_problem_link.problem_link_supported_problem(split_link);
                                        {
                                            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(split_problem);
                                            SubLObject candidate_tactic = NIL;
                                            for (candidate_tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate_tactic = cdolist_list_var.first()) {
                                                if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(candidate_tactic, $REMOVAL_CONJUNCTIVE)) {
                                                    if (inference_datastructures_tactic.tactic_hl_module(candidate_tactic) == hl_module) {
                                                        return candidate_tactic;
                                                    }
                                                }
                                            }
                                        }
                                        {
                                            SubLObject set_contents_var_1 = inference_datastructures_problem.problem_dependent_links(split_problem);
                                            SubLObject basis_object_2 = set_contents.do_set_contents_basis_object(set_contents_var_1);
                                            SubLObject state_3 = NIL;
                                            for (state_3 = set_contents.do_set_contents_initial_state(basis_object_2, set_contents_var_1); NIL == set_contents.do_set_contents_doneP(basis_object_2, state_3); state_3 = set_contents.do_set_contents_update_state(state_3)) {
                                                {
                                                    SubLObject restriction_link = set_contents.do_set_contents_next(basis_object_2, state_3);
                                                    if (NIL != set_contents.do_set_contents_element_validP(state_3, restriction_link)) {
                                                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $RESTRICTION)) {
                                                            {
                                                                SubLObject unrestricted_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
                                                                SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(unrestricted_problem);
                                                                SubLObject candidate_tactic = NIL;
                                                                for (candidate_tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate_tactic = cdolist_list_var.first()) {
                                                                    if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(candidate_tactic, $REMOVAL_CONJUNCTIVE)) {
                                                                        if (inference_datastructures_tactic.tactic_hl_module(candidate_tactic) == hl_module) {
                                                                            return candidate_tactic;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_link_tactic(final SubLObject removal_link) {
        assert NIL != inference_worker_removal.removal_link_p(removal_link) : "! inference_worker_removal.removal_link_p(removal_link) " + ("inference_worker_removal.removal_link_p(removal_link) " + "CommonSymbols.NIL != inference_worker_removal.removal_link_p(removal_link) ") + removal_link;
        final SubLObject hl_module = inference_worker_removal.removal_link_hl_module(removal_link);
        final SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(removal_link);
        final SubLObject store = inference_datastructures_problem_link.problem_link_store(removal_link);
        if (NIL != inference_modules.removal_module_p(hl_module)) {
            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
            SubLObject candidate_tactic = NIL;
            candidate_tactic = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(candidate_tactic, $REMOVAL)) && inference_datastructures_tactic.tactic_hl_module(candidate_tactic).eql(hl_module)) {
                    return candidate_tactic;
                }
                cdolist_list_var = cdolist_list_var.rest();
                candidate_tactic = cdolist_list_var.first();
            } 
            if ((NIL != inference_datastructures_problem_store.problem_store_add_restriction_layer_of_indirectionP(store)) && (NIL != inference_datastructures_problem.closed_problem_p(problem))) {
                final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
                SubLObject basis_object;
                SubLObject state;
                SubLObject restriction_link;
                SubLObject unrestricted_problem;
                SubLObject cdolist_list_var2;
                SubLObject candidate_tactic2;
                for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
                    restriction_link = do_set_contents_next(basis_object, state);
                    if ((NIL != do_set_contents_element_validP(state, restriction_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $RESTRICTION))) {
                        unrestricted_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
                        cdolist_list_var2 = inference_datastructures_problem.problem_tactics(unrestricted_problem);
                        candidate_tactic2 = NIL;
                        candidate_tactic2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(candidate_tactic2, $REMOVAL)) && inference_datastructures_tactic.tactic_hl_module(candidate_tactic2).eql(hl_module)) {
                                return candidate_tactic2;
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            candidate_tactic2 = cdolist_list_var2.first();
                        } 
                    }
                }
            }
        } else {
            final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject cdolist_list_var2;
            SubLObject candidate_tactic2;
            SubLObject split_link;
            SubLObject split_problem;
            SubLObject set_contents_var_$1;
            SubLObject basis_object_$2;
            SubLObject state_$3;
            SubLObject restriction_link2;
            SubLObject unrestricted_problem2;
            SubLObject cdolist_list_var3;
            SubLObject candidate_tactic3;
            for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
                split_link = do_set_contents_next(basis_object, state);
                if ((NIL != do_set_contents_element_validP(state, split_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(split_link, $SPLIT))) {
                    split_problem = inference_datastructures_problem_link.problem_link_supported_problem(split_link);
                    cdolist_list_var2 = inference_datastructures_problem.problem_tactics(split_problem);
                    candidate_tactic2 = NIL;
                    candidate_tactic2 = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(candidate_tactic2, $REMOVAL_CONJUNCTIVE)) && inference_datastructures_tactic.tactic_hl_module(candidate_tactic2).eql(hl_module)) {
                            return candidate_tactic2;
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        candidate_tactic2 = cdolist_list_var2.first();
                    } 
                    set_contents_var_$1 = inference_datastructures_problem.problem_dependent_links(split_problem);
                    for (basis_object_$2 = do_set_contents_basis_object(set_contents_var_$1), state_$3 = NIL, state_$3 = do_set_contents_initial_state(basis_object_$2, set_contents_var_$1); NIL == do_set_contents_doneP(basis_object_$2, state_$3); state_$3 = do_set_contents_update_state(state_$3)) {
                        restriction_link2 = do_set_contents_next(basis_object_$2, state_$3);
                        if ((NIL != do_set_contents_element_validP(state_$3, restriction_link2)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link2, $RESTRICTION))) {
                            unrestricted_problem2 = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link2);
                            cdolist_list_var3 = inference_datastructures_problem.problem_tactics(unrestricted_problem2);
                            candidate_tactic3 = NIL;
                            candidate_tactic3 = cdolist_list_var3.first();
                            while (NIL != cdolist_list_var3) {
                                if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(candidate_tactic3, $REMOVAL_CONJUNCTIVE)) && inference_datastructures_tactic.tactic_hl_module(candidate_tactic3).eql(hl_module)) {
                                    return candidate_tactic3;
                                }
                                cdolist_list_var3 = cdolist_list_var3.rest();
                                candidate_tactic3 = cdolist_list_var3.first();
                            } 
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject removal_link_data_equals_specP_alt(SubLObject removal_link, SubLObject removal_bindings, SubLObject supports) {
        {
            SubLObject link_removal_bindings = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.removal_link_bindings(removal_link);
            SubLObject link_supports = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.removal_link_supports(removal_link);
            return makeBoolean(removal_bindings.equal(link_removal_bindings) && (NIL != justification_equal(supports, link_supports)));
        }
    }

    public static SubLObject removal_link_data_equals_specP(final SubLObject removal_link, final SubLObject removal_bindings, final SubLObject supports) {
        final SubLObject link_removal_bindings = inference_worker_removal.removal_link_bindings(removal_link);
        final SubLObject link_supports = inference_worker_removal.removal_link_supports(removal_link);
        return makeBoolean(removal_bindings.equal(link_removal_bindings) && (NIL != arguments.justification_equal(supports, link_supports)));
    }

    public static final SubLObject generalized_removal_tactic_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.removal_tactic_p(v_object)) || (NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.conjunctive_removal_tactic_p(v_object))) || (NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.meta_removal_tactic_p(v_object)));
    }

    public static SubLObject generalized_removal_tactic_p(final SubLObject v_object) {
        return makeBoolean(((NIL != inference_worker_removal.removal_tactic_p(v_object)) || (NIL != inference_worker_removal.conjunctive_removal_tactic_p(v_object))) || (NIL != inference_worker_removal.meta_removal_tactic_p(v_object)));
    }

    public static final SubLObject conjunctive_removal_tactic_p_alt(SubLObject tactic) {
        return makeBoolean((NIL != inference_datastructures_tactic.tactic_p(tactic)) && ($REMOVAL_CONJUNCTIVE == inference_datastructures_tactic.tactic_type(tactic)));
    }

    public static SubLObject conjunctive_removal_tactic_p(final SubLObject tactic) {
        return makeBoolean((NIL != inference_datastructures_tactic.tactic_p(tactic)) && ($REMOVAL_CONJUNCTIVE == inference_datastructures_tactic.tactic_type(tactic)));
    }

    public static final SubLObject conjunctive_removal_link_p_alt(SubLObject link) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.removal_link_p(link)) && (NIL != conjunctive_removal_module_p(com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.removal_link_hl_module(link))));
    }

    public static SubLObject conjunctive_removal_link_p(final SubLObject link) {
        return makeBoolean((NIL != inference_worker_removal.removal_link_p(link)) && (NIL != inference_modules.conjunctive_removal_module_p(inference_worker_removal.removal_link_hl_module(link))));
    }

    public static final SubLObject conjunctive_removal_proof_p_alt(SubLObject proof) {
        return makeBoolean((NIL != inference_datastructures_proof.proof_p(proof)) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.conjunctive_removal_link_p(inference_datastructures_proof.proof_link(proof))));
    }

    public static SubLObject conjunctive_removal_proof_p(final SubLObject proof) {
        return makeBoolean((NIL != inference_datastructures_proof.proof_p(proof)) && (NIL != inference_worker_removal.conjunctive_removal_link_p(inference_datastructures_proof.proof_link(proof))));
    }

    /**
     * Determines tactics which can solve all of the conjunctive problem PROBLEM at once.
     */
    @LispMethod(comment = "Determines tactics which can solve all of the conjunctive problem PROBLEM at once.")
    public static final SubLObject determine_new_conjunctive_removal_tactics_alt(SubLObject problem, SubLObject dnf_clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == inference_datastructures_problem_store.problem_store_removal_allowedP(inference_datastructures_problem.problem_store(problem))) {
                return NIL;
            }
            {
                SubLObject supplanted_hl_modules = NIL;
                SubLObject tactic_specs = NIL;
                SubLObject exclusive_foundP = NIL;
                SubLObject common_mt = inference_czer.contextualized_dnf_clause_common_mt(dnf_clause);
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(common_mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject hl_modules = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.determine_applicable_conjunctive_removal_modules(dnf_clause);
                            hl_modules = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.sort_applicable_conjunctive_removal_modules_by_priority(hl_modules);
                            if (NIL == exclusive_foundP) {
                                {
                                    SubLObject csome_list_var = hl_modules;
                                    SubLObject hl_module = NIL;
                                    for (hl_module = csome_list_var.first(); !((NIL != exclusive_foundP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , hl_module = csome_list_var.first()) {
                                        if (!((NIL != supplanted_hl_modules) && (NIL != member(hl_module, supplanted_hl_modules, UNPROVIDED, UNPROVIDED)))) {
                                            {
                                                SubLObject exclusive_func = hl_module_exclusive_func(hl_module);
                                                if ((NIL == exclusive_func) || (exclusive_func.isFunctionSpec() && (NIL != funcall(exclusive_func, dnf_clause)))) {
                                                    if (NIL != exclusive_func) {
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject exclusive_foundP_4 = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.update_supplanted_modules_wrt_tactic_specs(hl_module, tactic_specs, supplanted_hl_modules);
                                                            SubLObject tactic_specs_5 = thread.secondMultipleValue();
                                                            SubLObject supplanted_hl_modules_6 = thread.thirdMultipleValue();
                                                            thread.resetMultipleValues();
                                                            exclusive_foundP = exclusive_foundP_4;
                                                            tactic_specs = tactic_specs_5;
                                                            supplanted_hl_modules = supplanted_hl_modules_6;
                                                        }
                                                    }
                                                    {
                                                        SubLObject cost = hl_module_clause_cost(hl_module, dnf_clause);
                                                        if (NIL != cost) {
                                                            {
                                                                SubLObject productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(cost);
                                                                SubLObject completeness = hl_module_clause_completeness(hl_module, dnf_clause);
                                                                SubLObject tactic_spec = list(hl_module, productivity, completeness);
                                                                tactic_specs = cons(tactic_spec, tactic_specs);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            {
                                SubLObject cdolist_list_var = tactic_specs;
                                SubLObject tactic_spec = NIL;
                                for (tactic_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tactic_spec = cdolist_list_var.first()) {
                                    {
                                        SubLObject datum = tactic_spec;
                                        SubLObject current = datum;
                                        SubLObject hl_module = NIL;
                                        SubLObject productivity = NIL;
                                        SubLObject completeness = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt28);
                                        hl_module = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt28);
                                        productivity = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt28);
                                        completeness = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.new_conjunctive_removal_tactic(problem, hl_module, productivity, completeness);
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt28);
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return tactic_specs;
            }
        }
    }

    /**
     * Determines tactics which can solve all of the conjunctive problem PROBLEM at once.
     */
    @LispMethod(comment = "Determines tactics which can solve all of the conjunctive problem PROBLEM at once.")
    public static SubLObject determine_new_conjunctive_removal_tactics(final SubLObject problem, final SubLObject dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == inference_datastructures_problem_store.problem_store_removal_allowedP(inference_datastructures_problem.problem_store(problem))) {
            return NIL;
        }
        SubLObject supplanted_hl_modules = NIL;
        SubLObject tactic_specs = NIL;
        SubLObject exclusive_foundP = NIL;
        final SubLObject common_mt = inference_czer.contextualized_dnf_clause_common_mt(dnf_clause);
        final SubLObject mt_var = with_inference_mt_relevance_validate(common_mt);
        final SubLObject _prev_bind_0 = $mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $relevant_mts$.currentBinding(thread);
        try {
            $mt$.bind(update_inference_mt_relevance_mt(mt_var), thread);
            $relevant_mt_function$.bind(update_inference_mt_relevance_function(mt_var), thread);
            $relevant_mts$.bind(update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject hl_modules = inference_worker_removal.determine_applicable_conjunctive_removal_modules(dnf_clause);
            hl_modules = inference_worker_removal.sort_applicable_conjunctive_removal_modules_by_priority(hl_modules);
            if (NIL == exclusive_foundP) {
                SubLObject csome_list_var = hl_modules;
                SubLObject hl_module = NIL;
                hl_module = csome_list_var.first();
                while ((NIL == exclusive_foundP) && (NIL != csome_list_var)) {
                    if ((NIL == supplanted_hl_modules) || (NIL == member(hl_module, supplanted_hl_modules, UNPROVIDED, UNPROVIDED))) {
                        final SubLObject exclusive_func = inference_modules.hl_module_exclusive_func(hl_module);
                        if ((NIL == exclusive_func) || (exclusive_func.isFunctionSpec() && (NIL != funcall(exclusive_func, dnf_clause)))) {
                            if (NIL != exclusive_func) {
                                thread.resetMultipleValues();
                                final SubLObject exclusive_foundP_$4 = inference_worker_removal.update_supplanted_modules_wrt_tactic_specs(hl_module, tactic_specs, supplanted_hl_modules);
                                final SubLObject tactic_specs_$5 = thread.secondMultipleValue();
                                final SubLObject supplanted_hl_modules_$6 = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                exclusive_foundP = exclusive_foundP_$4;
                                tactic_specs = tactic_specs_$5;
                                supplanted_hl_modules = supplanted_hl_modules_$6;
                            }
                            final SubLObject cost = inference_modules.hl_module_clause_cost(hl_module, dnf_clause);
                            if (NIL != cost) {
                                final SubLObject productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(cost);
                                final SubLObject completeness = inference_modules.hl_module_clause_completeness(hl_module, dnf_clause);
                                final SubLObject tactic_spec = list(hl_module, productivity, completeness);
                                tactic_specs = cons(tactic_spec, tactic_specs);
                            }
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    hl_module = csome_list_var.first();
                } 
            }
            SubLObject cdolist_list_var = tactic_specs;
            SubLObject tactic_spec2 = NIL;
            tactic_spec2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = tactic_spec2;
                SubLObject hl_module2 = NIL;
                SubLObject productivity2 = NIL;
                SubLObject completeness2 = NIL;
                destructuring_bind_must_consp(current, datum, inference_worker_removal.$list34);
                hl_module2 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, inference_worker_removal.$list34);
                productivity2 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, inference_worker_removal.$list34);
                completeness2 = current.first();
                current = current.rest();
                if (NIL == current) {
                    inference_worker_removal.new_conjunctive_removal_tactic(problem, hl_module2, productivity2, completeness2);
                } else {
                    cdestructuring_bind_error(datum, inference_worker_removal.$list34);
                }
                cdolist_list_var = cdolist_list_var.rest();
                tactic_spec2 = cdolist_list_var.first();
            } 
        } finally {
            $relevant_mts$.rebind(_prev_bind_3, thread);
            $relevant_mt_function$.rebind(_prev_bind_2, thread);
            $mt$.rebind(_prev_bind_0, thread);
        }
        return tactic_specs;
    }

    /**
     * Help determine-new-conjunctive-removal-tactics do better by ordering pruning modules before simplification modules and simplification modules before everything else.  This prevents an exclusive simplification module from trumping an exclusive pruning module, for example.
     */
    @LispMethod(comment = "Help determine-new-conjunctive-removal-tactics do better by ordering pruning modules before simplification modules and simplification modules before everything else.  This prevents an exclusive simplification module from trumping an exclusive pruning module, for example.")
    public static final SubLObject sort_applicable_conjunctive_removal_modules_by_priority_alt(SubLObject hl_modules) {
        return Sort.sort(hl_modules, $sym29$CONJUNCTIVE_REMOVAL_MODULE_PRIORITY_, UNPROVIDED);
    }

    /**
     * Help determine-new-conjunctive-removal-tactics do better by ordering pruning modules before simplification modules and simplification modules before everything else.  This prevents an exclusive simplification module from trumping an exclusive pruning module, for example.
     */
    @LispMethod(comment = "Help determine-new-conjunctive-removal-tactics do better by ordering pruning modules before simplification modules and simplification modules before everything else.  This prevents an exclusive simplification module from trumping an exclusive pruning module, for example.")
    public static SubLObject sort_applicable_conjunctive_removal_modules_by_priority(final SubLObject hl_modules) {
        return Sort.sort(hl_modules, inference_worker_removal.$sym35$CONJUNCTIVE_REMOVAL_MODULE_PRIORITY_, UNPROVIDED);
    }

    public static final SubLObject conjunctive_removal_module_priorityL_alt(SubLObject hl_module1, SubLObject hl_module2) {
        if ((NIL != removal_modules_conjunctive_pruning.conjunctive_pruning_module_p(hl_module1)) && (NIL == removal_modules_conjunctive_pruning.conjunctive_pruning_module_p(hl_module2))) {
            return T;
        } else {
            if ((NIL != removal_modules_conjunctive_pruning.conjunctive_pruning_module_p(hl_module2)) && (NIL == removal_modules_conjunctive_pruning.conjunctive_pruning_module_p(hl_module1))) {
                return NIL;
            } else {
                if ((NIL != simplification_modules.simplification_module_p(hl_module1)) && (NIL == simplification_modules.simplification_module_p(hl_module2))) {
                    return T;
                } else {
                    if ((NIL != simplification_modules.simplification_module_p(hl_module2)) && (NIL == simplification_modules.simplification_module_p(hl_module1))) {
                        return NIL;
                    } else {
                        return T;
                    }
                }
            }
        }
    }

    public static SubLObject conjunctive_removal_module_priorityL(final SubLObject hl_module1, final SubLObject hl_module2) {
        if ((NIL != conjunctive_pruning_module_p(hl_module1)) && (NIL == conjunctive_pruning_module_p(hl_module2))) {
            return T;
        }
        if ((NIL != conjunctive_pruning_module_p(hl_module2)) && (NIL == conjunctive_pruning_module_p(hl_module1))) {
            return NIL;
        }
        if ((NIL != simplification_modules.simplification_module_p(hl_module1)) && (NIL == simplification_modules.simplification_module_p(hl_module2))) {
            return T;
        }
        if ((NIL != simplification_modules.simplification_module_p(hl_module2)) && (NIL == simplification_modules.simplification_module_p(hl_module1))) {
            return NIL;
        }
        return T;
    }

    public static final SubLObject determine_applicable_conjunctive_removal_modules_alt(SubLObject contextualized_dnf_clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject some_backchain_requiredP = inference_trampolines.inference_some_backchain_required_asent_in_clauseP(contextualized_dnf_clause);
                SubLObject applicable_modules = NIL;
                SubLObject set_contents_var = set.do_set_internal(removal_modules_conjunctive());
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    {
                        SubLObject hl_module = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, hl_module)) {
                            if (((NIL == some_backchain_requiredP) || (NIL != removal_modules_conjunctive_pruning.conjunctive_pruning_module_p(hl_module))) || ((NIL != inference_worker_restriction.$simplification_tactics_execute_early_and_pass_down_transformation_motivationP$.getDynamicValue(thread)) && (NIL != simplification_modules.simplification_module_p(hl_module)))) {
                                {
                                    SubLObject _prev_bind_0 = sksi_macros.$sksi_crm_only_total_subclause_specs_relevantP$.currentBinding(thread);
                                    try {
                                        sksi_macros.$sksi_crm_only_total_subclause_specs_relevantP$.bind(T, thread);
                                        if (NIL != hl_module_direction_relevantP(hl_module)) {
                                            {
                                                SubLObject new_subclause_specs = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.hl_module_applicable_subclause_specs(hl_module, contextualized_dnf_clause);
                                                SubLObject cdolist_list_var = new_subclause_specs;
                                                SubLObject subclause_spec = NIL;
                                                for (subclause_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subclause_spec = cdolist_list_var.first()) {
                                                    if (NIL != clause_utilities.total_subclause_specP(subclause_spec, contextualized_dnf_clause)) {
                                                        applicable_modules = cons(hl_module, applicable_modules);
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        sksi_macros.$sksi_crm_only_total_subclause_specs_relevantP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                }
                return applicable_modules;
            }
        }
    }

    public static SubLObject determine_applicable_conjunctive_removal_modules(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject some_backchain_requiredP = inference_trampolines.inference_some_backchain_required_asent_in_clauseP(contextualized_dnf_clause);
        SubLObject applicable_modules = NIL;
        final SubLObject allowed_modules_spec = (NIL != inference_macros.current_controlling_inference()) ? inference_datastructures_inference.inference_allowed_modules(inference_macros.current_controlling_inference()) : $ALL;
        final SubLObject set_var = inference_modules.removal_modules_conjunctive();
        final SubLObject set_contents_var = do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject hl_module;
        SubLObject _prev_bind_0;
        SubLObject cdolist_list_var;
        SubLObject new_subclause_specs;
        SubLObject subclause_spec;
        for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
            hl_module = do_set_contents_next(basis_object, state);
            if (((NIL != do_set_contents_element_validP(state, hl_module)) && (((NIL == some_backchain_requiredP) || (NIL != conjunctive_pruning_module_p(hl_module))) || ((NIL != inference_worker_restriction.$simplification_tactics_execute_early_and_pass_down_transformation_motivationP$.getDynamicValue(thread)) && (NIL != simplification_modules.simplification_module_p(hl_module))))) && (NIL != inference_modules.hl_module_allowed_by_allowed_modules_specP(hl_module, allowed_modules_spec))) {
                _prev_bind_0 = sksi_macros.$sksi_crm_only_total_subclause_specs_relevantP$.currentBinding(thread);
                try {
                    sksi_macros.$sksi_crm_only_total_subclause_specs_relevantP$.bind(T, thread);
                    if (NIL != inference_modules.hl_module_direction_relevantP(hl_module)) {
                        new_subclause_specs = cdolist_list_var = inference_worker_removal.hl_module_applicable_subclause_specs(hl_module, contextualized_dnf_clause);
                        subclause_spec = NIL;
                        subclause_spec = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (NIL != total_subclause_specP(subclause_spec, contextualized_dnf_clause)) {
                                applicable_modules = cons(hl_module, applicable_modules);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            subclause_spec = cdolist_list_var.first();
                        } 
                    }
                } finally {
                    sksi_macros.$sksi_crm_only_total_subclause_specs_relevantP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return applicable_modules;
    }

    public static final SubLObject motivated_multi_literal_subclause_specs_alt(SubLObject contextualized_dnf_clause) {
        {
            SubLObject subclause_specs = NIL;
            if (NIL == inference_trampolines.inference_some_backchain_required_asent_in_clauseP(contextualized_dnf_clause)) {
                {
                    SubLObject set_contents_var = set.do_set_internal(removal_modules_conjunctive());
                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                    SubLObject state = NIL;
                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        {
                            SubLObject hl_module = set_contents.do_set_contents_next(basis_object, state);
                            if (NIL != set_contents.do_set_contents_element_validP(state, hl_module)) {
                                if (!((NIL != removal_modules_conjunctive_pruning.conjunctive_pruning_module_p(hl_module)) || (NIL != simplification_modules.simplification_module_p(hl_module)))) {
                                    if (NIL != hl_module_direction_relevantP(hl_module)) {
                                        {
                                            SubLObject new_subclause_specs = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.hl_module_applicable_subclause_specs(hl_module, contextualized_dnf_clause);
                                            SubLObject cdolist_list_var = new_subclause_specs;
                                            SubLObject subclause_spec = NIL;
                                            for (subclause_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subclause_spec = cdolist_list_var.first()) {
                                                if (NIL == clause_utilities.total_subclause_specP(subclause_spec, contextualized_dnf_clause)) {
                                                    {
                                                        SubLObject item_var = subclause_spec;
                                                        if (NIL == member(item_var, subclause_specs, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                            subclause_specs = cons(item_var, subclause_specs);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return nreverse(subclause_specs);
        }
    }

    public static SubLObject motivated_multi_literal_subclause_specs(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subclause_specs = NIL;
        if (NIL == inference_trampolines.inference_some_backchain_required_asent_in_clauseP(contextualized_dnf_clause)) {
            final SubLObject mt_var;
            final SubLObject common_mt = mt_var = inference_czer.contextualized_dnf_clause_common_mt(contextualized_dnf_clause);
            final SubLObject _prev_bind_0 = $mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $relevant_mts$.currentBinding(thread);
            try {
                $mt$.bind(update_inference_mt_relevance_mt(mt_var), thread);
                $relevant_mt_function$.bind(update_inference_mt_relevance_function(mt_var), thread);
                $relevant_mts$.bind(update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject set_var = inference_modules.removal_modules_conjunctive();
                final SubLObject set_contents_var = do_set_internal(set_var);
                SubLObject basis_object;
                SubLObject state;
                SubLObject hl_module;
                SubLObject cdolist_list_var;
                SubLObject new_subclause_specs;
                SubLObject subclause_spec;
                SubLObject item_var;
                for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
                    hl_module = do_set_contents_next(basis_object, state);
                    if ((((NIL != do_set_contents_element_validP(state, hl_module)) && (NIL == conjunctive_pruning_module_p(hl_module))) && (NIL == simplification_modules.simplification_module_p(hl_module))) && (NIL != inference_modules.hl_module_direction_relevantP(hl_module))) {
                        new_subclause_specs = cdolist_list_var = inference_worker_removal.hl_module_applicable_subclause_specs(hl_module, contextualized_dnf_clause);
                        subclause_spec = NIL;
                        subclause_spec = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (NIL == total_subclause_specP(subclause_spec, contextualized_dnf_clause)) {
                                item_var = subclause_spec;
                                if (NIL == member(item_var, subclause_specs, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                    subclause_specs = cons(item_var, subclause_specs);
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            subclause_spec = cdolist_list_var.first();
                        } 
                    }
                }
            } finally {
                $relevant_mts$.rebind(_prev_bind_3, thread);
                $relevant_mt_function$.rebind(_prev_bind_2, thread);
                $mt$.rebind(_prev_bind_0, thread);
            }
        }
        return nreverse(subclause_specs);
    }

    public static final SubLObject hl_module_applicable_subclause_specs_alt(SubLObject hl_module, SubLObject contextualized_dnf_clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject every_predicates = hl_module_every_predicates(hl_module);
                SubLObject cdolist_list_var = every_predicates;
                SubLObject predicate = NIL;
                for (predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , predicate = cdolist_list_var.first()) {
                    if (NIL == inference_datastructures_problem_query.contextualized_clause_has_literal_with_predicateP(contextualized_dnf_clause, predicate)) {
                        return NIL;
                    }
                }
            }
            {
                SubLObject subclause_specs = NIL;
                SubLObject applicability_pattern = hl_module_applicability_pattern(hl_module);
                if (NIL != applicability_pattern) {
                    subclause_specs = formula_pattern_match.pattern_transform_formula(applicability_pattern, contextualized_dnf_clause, UNPROVIDED);
                } else {
                    {
                        SubLObject applicability_method = hl_module_applicability_func(hl_module);
                        if (applicability_method.isFunctionSpec()) {
                            subclause_specs = funcall(applicability_method, contextualized_dnf_clause);
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = subclause_specs;
                    SubLObject subclause_spec = NIL;
                    for (subclause_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subclause_spec = cdolist_list_var.first()) {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == clause_utilities.multi_literal_subclause_specP(subclause_spec)) {
                                Errors.error($str_alt30$_s_stated_its_applicability_to_th, hl_module, subclause_spec);
                            }
                        }
                    }
                }
                return subclause_specs;
            }
        }
    }

    public static SubLObject hl_module_applicable_subclause_specs(final SubLObject hl_module, final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject allowed_modules_spec = (NIL != inference_macros.current_controlling_inference()) ? inference_datastructures_inference.inference_allowed_modules(inference_macros.current_controlling_inference()) : $ALL;
        if (NIL == inference_modules.hl_module_allowed_by_allowed_modules_specP(hl_module, allowed_modules_spec)) {
            return NIL;
        }
        SubLObject cdolist_list_var;
        final SubLObject every_predicates = cdolist_list_var = inference_modules.hl_module_every_predicates(hl_module);
        SubLObject predicate = NIL;
        predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == inference_datastructures_problem_query.contextualized_clause_has_literal_with_predicateP(contextualized_dnf_clause, predicate)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            predicate = cdolist_list_var.first();
        } 
        SubLObject subclause_specs = NIL;
        final SubLObject applicability_pattern = inference_modules.hl_module_applicability_pattern(hl_module);
        if (NIL != applicability_pattern) {
            subclause_specs = pattern_transform_formula(applicability_pattern, contextualized_dnf_clause, UNPROVIDED);
        } else {
            final SubLObject applicability_method = inference_modules.hl_module_applicability_func(hl_module);
            if (applicability_method.isFunctionSpec()) {
                final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
                final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
                final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
                final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
                if ((NIL != last_metric_type) && (NIL != last_metric)) {
                    inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, ZERO_INTEGER);
                }
                final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
                final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
                final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
                final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
                try {
                    hl_macros.$forward_inference_metric_last_metric_type$.bind($INFERENCE, thread);
                    hl_macros.$forward_inference_metric_last_metric$.bind(applicability_method, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind(NIL, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
                    try {
                        subclause_specs = funcall(applicability_method, contextualized_dnf_clause);
                    } finally {
                        final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            inference_metrics.increment_forward_inference_metrics($INFERENCE, applicability_method, NIL, NIL, NIL);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                        }
                    }
                } finally {
                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
                    hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
                    hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
                }
            }
        }
        SubLObject cdolist_list_var2 = subclause_specs;
        SubLObject subclause_spec = NIL;
        subclause_spec = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == multi_literal_subclause_specP(subclause_spec))) {
                Errors.error(inference_worker_removal.$str38$_s_stated_its_applicability_to_th, hl_module, subclause_spec);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            subclause_spec = cdolist_list_var2.first();
        } 
        return subclause_specs;
    }

    public static final SubLObject new_conjunctive_removal_tactic_alt(SubLObject problem, SubLObject hl_module, SubLObject productivity, SubLObject completeness) {
        {
            SubLObject tactic = inference_datastructures_tactic.new_tactic(problem, hl_module, UNPROVIDED);
            inference_datastructures_tactic.set_tactic_productivity(tactic, productivity, UNPROVIDED);
            inference_datastructures_tactic.set_tactic_completeness(tactic, completeness);
            {
                SubLObject prob = problem;
                SubLObject store = inference_datastructures_problem.problem_store(prob);
                SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
                if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                    {
                        SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
                        SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
                        SubLObject inference = NIL;
                        while (NIL != id) {
                            inference = do_id_index_state_object(idx, $SKIP, id, state_var);
                            if (NIL != do_id_index_id_and_object_validP(id, inference, $SKIP)) {
                                if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference)) {
                                    {
                                        SubLObject inference_var = inference;
                                        SubLObject set_contents_var = set.do_set_internal(inference_strategy_set(inference_var));
                                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                        SubLObject state = NIL;
                                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                            {
                                                SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
                                                if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                                    inference_tactician.strategy_note_new_tactic(strategy, tactic);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            id = do_id_index_next_id(idx, NIL, id, state_var);
                            state_var = do_id_index_next_state(idx, NIL, id, state_var);
                        } 
                    }
                }
            }
            return tactic;
        }
    }

    public static SubLObject new_conjunctive_removal_tactic(final SubLObject problem, final SubLObject hl_module, final SubLObject productivity, final SubLObject completeness) {
        final SubLObject tactic = inference_datastructures_tactic.new_tactic(problem, hl_module, UNPROVIDED);
        inference_datastructures_tactic.set_tactic_productivity(tactic, productivity, UNPROVIDED);
        inference_datastructures_tactic.set_tactic_completeness(tactic, completeness);
        final SubLObject store = inference_datastructures_problem.problem_store(problem);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$8 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$8, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$8);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                SubLObject inference_var;
                SubLObject set_var;
                SubLObject set_contents_var;
                SubLObject basis_object;
                SubLObject state;
                SubLObject strategy;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    inference = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(inference)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = do_set_internal(set_var);
                            for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
                                strategy = do_set_contents_next(basis_object, state);
                                if (NIL != do_set_contents_element_validP(state, strategy)) {
                                    inference_tactician.strategy_note_new_tactic(strategy, tactic);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject idx_$9 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$9)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$9);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        inference2 = getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                            final SubLObject inference_var2 = inference2;
                            final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            final SubLObject set_contents_var2 = do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == do_set_contents_doneP(basis_object2, state2); state2 = do_set_contents_update_state(state2)) {
                                strategy2 = do_set_contents_next(basis_object2, state2);
                                if (NIL != do_set_contents_element_validP(state2, strategy2)) {
                                    inference_tactician.strategy_note_new_tactic(strategy2, tactic);
                                }
                            }
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return tactic;
    }

    public static final SubLObject compute_strategic_properties_of_conjunctive_removal_tactic_alt(SubLObject tactic, SubLObject strategy) {
        return tactic;
    }

    public static SubLObject compute_strategic_properties_of_conjunctive_removal_tactic(final SubLObject tactic, final SubLObject strategy) {
        return tactic;
    }

    public static final SubLObject execute_conjunctive_removal_tactic_alt(SubLObject tactic) {
        if (NIL != inference_datastructures_tactic.tactic_in_progressP(tactic)) {
            inference_datastructures_tactic.tactic_in_progress_next(tactic);
        } else {
            {
                SubLObject progress_iterator = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.maybe_make_conjunctive_removal_tactic_progress_iterator(tactic);
                if ((NIL != inference_datastructures_tactic.valid_tactic_p(tactic)) && (NIL != inference_tactician_strategic_uninterestingness.tactic_completeP(tactic, $TACTICAL))) {
                    inference_worker.possibly_discard_all_other_possible_structural_conjunctive_tactics(tactic);
                }
                if (NIL == progress_iterator) {
                } else {
                    if (progress_iterator.isList()) {
                        {
                            SubLObject cdolist_list_var = progress_iterator;
                            SubLObject execution_result = NIL;
                            for (execution_result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , execution_result = cdolist_list_var.first()) {
                                {
                                    SubLObject datum = execution_result;
                                    SubLObject current = datum;
                                    SubLObject removal_bindings = NIL;
                                    SubLObject justifications = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt33);
                                    removal_bindings = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt33);
                                    justifications = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.handle_one_conjunctive_removal_tactic_result(tactic, removal_bindings, justifications);
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt33);
                                    }
                                }
                            }
                        }
                    } else {
                        inference_datastructures_tactic.note_tactic_progress_iterator(tactic, progress_iterator);
                    }
                }
            }
        }
        return tactic;
    }

    public static SubLObject execute_conjunctive_removal_tactic(final SubLObject tactic) {
        if (NIL != inference_datastructures_tactic.tactic_in_progressP(tactic)) {
            inference_datastructures_tactic.tactic_in_progress_next(tactic);
        } else {
            final SubLObject progress_iterator = inference_worker_removal.maybe_make_conjunctive_removal_tactic_progress_iterator(tactic);
            if ((NIL != inference_datastructures_tactic.valid_tactic_p(tactic)) && (NIL != inference_tactician_strategic_uninterestingness.tactic_completeP(tactic, $TACTICAL))) {
                inference_worker.possibly_discard_all_other_possible_structural_conjunctive_tactics(tactic);
            }
            if (NIL != progress_iterator) {
                if (progress_iterator.isList()) {
                    SubLObject cdolist_list_var = progress_iterator;
                    SubLObject execution_result = NIL;
                    execution_result = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject current;
                        final SubLObject datum = current = execution_result;
                        SubLObject removal_bindings = NIL;
                        SubLObject justifications = NIL;
                        destructuring_bind_must_consp(current, datum, inference_worker_removal.$list41);
                        removal_bindings = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, inference_worker_removal.$list41);
                        justifications = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            inference_worker_removal.handle_one_conjunctive_removal_tactic_result(tactic, removal_bindings, justifications);
                        } else {
                            cdestructuring_bind_error(datum, inference_worker_removal.$list41);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        execution_result = cdolist_list_var.first();
                    } 
                } else {
                    inference_datastructures_tactic.note_tactic_progress_iterator(tactic, progress_iterator);
                }
            }
        }
        return tactic;
    }

    public static final SubLObject maybe_make_conjunctive_removal_tactic_progress_iterator_alt(SubLObject tactic) {
        return NIL != hl_module_expand_iterative_pattern(inference_datastructures_tactic.tactic_hl_module(tactic)) ? ((SubLObject) (com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.maybe_make_conjunctive_removal_tactic_progress_expand_iterative_iterator(tactic))) : com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.maybe_make_conjunctive_removal_tactic_progress_expand_iterator(tactic);
    }

    public static SubLObject maybe_make_conjunctive_removal_tactic_progress_iterator(final SubLObject tactic) {
        return NIL != inference_modules.hl_module_expand_iterative_pattern(inference_datastructures_tactic.tactic_hl_module(tactic)) ? inference_worker_removal.maybe_make_conjunctive_removal_tactic_progress_expand_iterative_iterator(tactic) : inference_worker_removal.maybe_make_conjunctive_removal_tactic_progress_expand_iterator(tactic);
    }

    public static final SubLObject maybe_make_conjunctive_removal_tactic_progress_expand_iterative_iterator_alt(SubLObject tactic) {
        {
            SubLObject contextualized_dnf_clause = inference_datastructures_tactic.tactic_problem_sole_clause(tactic);
            SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
            SubLObject pattern = hl_module_expand_iterative_pattern(hl_module);
            SubLObject iterator = formula_pattern_match.pattern_transform_formula(pattern, contextualized_dnf_clause, UNPROVIDED);
            if (NIL != iterator) {
                inference_datastructures_tactic.possibly_update_tactic_productivity_from_iterator(tactic, iterator);
                return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.new_conjunctive_removal_tactic_progress_expand_iterative_iterator(tactic, iterator);
            }
        }
        return NIL;
    }

    public static SubLObject maybe_make_conjunctive_removal_tactic_progress_expand_iterative_iterator(final SubLObject tactic) {
        final SubLObject contextualized_dnf_clause = inference_datastructures_tactic.tactic_problem_sole_clause(tactic);
        final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
        final SubLObject pattern = inference_modules.hl_module_expand_iterative_pattern(hl_module);
        final SubLObject iterator = pattern_transform_formula(pattern, contextualized_dnf_clause, UNPROVIDED);
        if (NIL != iterator) {
            inference_datastructures_tactic.possibly_update_tactic_productivity_from_iterator(tactic, iterator);
            return inference_worker_removal.new_conjunctive_removal_tactic_progress_expand_iterative_iterator(tactic, iterator);
        }
        return NIL;
    }

    public static final SubLObject new_conjunctive_removal_tactic_progress_expand_iterative_iterator_alt(SubLObject tactic, SubLObject output_iterator) {
        return inference_datastructures_tactic.new_tactic_progress_iterator($CONJUNCTIVE_REMOVAL_EXPAND_ITERATIVE, tactic, output_iterator);
    }

    public static SubLObject new_conjunctive_removal_tactic_progress_expand_iterative_iterator(final SubLObject tactic, final SubLObject output_iterator) {
        return inference_datastructures_tactic.new_tactic_progress_iterator(inference_worker_removal.$CONJUNCTIVE_REMOVAL_EXPAND_ITERATIVE, tactic, output_iterator);
    }

    public static final SubLObject handle_one_conjunctive_removal_tactic_expand_iterative_result_alt(SubLObject tactic, SubLObject output_iterator) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject raw_output = iteration.iteration_next(output_iterator);
                    SubLObject validP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != validP) {
                        {
                            SubLObject datum = raw_output;
                            SubLObject current = datum;
                            SubLObject removal_bindings = NIL;
                            SubLObject justifications = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt33);
                            removal_bindings = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt33);
                            justifications = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                result = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.handle_one_conjunctive_removal_tactic_result(tactic, removal_bindings, justifications);
                            } else {
                                cdestructuring_bind_error(datum, $list_alt33);
                            }
                        }
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject handle_one_conjunctive_removal_tactic_expand_iterative_result(final SubLObject tactic, final SubLObject output_iterator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        thread.resetMultipleValues();
        final SubLObject raw_output = iteration_next(output_iterator);
        final SubLObject validP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != validP) {
            SubLObject current;
            final SubLObject datum = current = raw_output;
            SubLObject removal_bindings = NIL;
            SubLObject justifications = NIL;
            destructuring_bind_must_consp(current, datum, inference_worker_removal.$list41);
            removal_bindings = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, inference_worker_removal.$list41);
            justifications = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject cdolist_list_var = cycl_utilities.expression_gather(inference_datastructures_problem.problem_query(inference_datastructures_tactic.tactic_problem(tactic)), inference_worker_removal.$sym43$HL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject var = NIL;
                var = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL == variable_lookup(var, removal_bindings)) {
                        removal_bindings = add_dont_care_variable_binding(var, removal_bindings);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    var = cdolist_list_var.first();
                } 
                result = inference_worker_removal.handle_one_conjunctive_removal_tactic_result(tactic, removal_bindings, justifications);
            } else {
                cdestructuring_bind_error(datum, inference_worker_removal.$list41);
            }
        }
        return result;
    }

    public static final SubLObject maybe_make_conjunctive_removal_tactic_progress_expand_iterator_alt(SubLObject tactic) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject contextualized_dnf_clause = inference_datastructures_tactic.tactic_problem_sole_clause(tactic);
                SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
                SubLObject expand_pattern = hl_module_expand_pattern(hl_module);
                SubLObject expand_function = (NIL != expand_pattern) ? ((SubLObject) (NIL)) : hl_module_expand_func(hl_module);
                SubLObject expand_results = NIL;
                {
                    SubLObject _prev_bind_0 = $conjunctive_removal_tactic_expand_results_queue$.currentBinding(thread);
                    try {
                        $conjunctive_removal_tactic_expand_results_queue$.bind(NIL, thread);
                        if (NIL != expand_pattern) {
                            formula_pattern_match.pattern_transform_formula(expand_pattern, contextualized_dnf_clause, UNPROVIDED);
                        } else {
                            if (expand_function.isFunctionSpec()) {
                                funcall(expand_function, contextualized_dnf_clause);
                            }
                        }
                        if (NIL != $conjunctive_removal_tactic_expand_results_queue$.getDynamicValue(thread)) {
                            expand_results = $conjunctive_removal_tactic_expand_results_queue$.getDynamicValue(thread);
                        }
                    } finally {
                        $conjunctive_removal_tactic_expand_results_queue$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject new_productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(length(expand_results));
                    inference_datastructures_tactic.update_tactic_productivity(tactic, new_productivity);
                }
                if (NIL != list_utilities.lengthGE(expand_results, $removal_tactic_iteration_threshold$.getDynamicValue(thread), UNPROVIDED)) {
                    expand_results = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.new_conjunctive_removal_tactic_progress_expand_iterator(tactic, expand_results);
                }
                return expand_results;
            }
        }
    }

    public static SubLObject maybe_make_conjunctive_removal_tactic_progress_expand_iterator(final SubLObject tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject contextualized_dnf_clause = inference_datastructures_tactic.tactic_problem_sole_clause(tactic);
        final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
        final SubLObject expand_pattern = inference_modules.hl_module_expand_pattern(hl_module);
        final SubLObject expand_function = (NIL != expand_pattern) ? NIL : inference_modules.hl_module_expand_func(hl_module);
        SubLObject expand_results = NIL;
        final SubLObject _prev_bind_0 = inference_worker_removal.$conjunctive_removal_tactic_expand_results_queue$.currentBinding(thread);
        try {
            inference_worker_removal.$conjunctive_removal_tactic_expand_results_queue$.bind(NIL, thread);
            if (NIL != expand_pattern) {
                pattern_transform_formula(expand_pattern, contextualized_dnf_clause, UNPROVIDED);
            } else
                if (expand_function.isFunctionSpec()) {
                    funcall(expand_function, contextualized_dnf_clause);
                }

            if (NIL != inference_worker_removal.$conjunctive_removal_tactic_expand_results_queue$.getDynamicValue(thread)) {
                expand_results = inference_worker_removal.$conjunctive_removal_tactic_expand_results_queue$.getDynamicValue(thread);
            }
        } finally {
            inference_worker_removal.$conjunctive_removal_tactic_expand_results_queue$.rebind(_prev_bind_0, thread);
        }
        final SubLObject new_productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(length(expand_results));
        inference_datastructures_tactic.update_tactic_productivity(tactic, new_productivity);
        if (NIL != lengthGE(expand_results, inference_worker_removal.$removal_tactic_iteration_threshold$.getDynamicValue(thread), UNPROVIDED)) {
            expand_results = inference_worker_removal.new_conjunctive_removal_tactic_progress_expand_iterator(tactic, expand_results);
        }
        return expand_results;
    }

    public static final SubLObject new_conjunctive_removal_tactic_progress_expand_iterator_alt(SubLObject tactic, SubLObject results) {
        return inference_datastructures_tactic.new_tactic_progress_iterator($CONJUNCTIVE_REMOVAL_EXPAND, tactic, results);
    }

    public static SubLObject new_conjunctive_removal_tactic_progress_expand_iterator(final SubLObject tactic, final SubLObject results) {
        return inference_datastructures_tactic.new_tactic_progress_iterator(inference_worker_removal.$CONJUNCTIVE_REMOVAL_EXPAND, tactic, results);
    }

    public static final SubLObject conjunctive_removal_callback_alt(SubLObject removal_bindings, SubLObject justifications) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            removal_bindings = bindings.inference_simplify_unification_bindings(removal_bindings);
            $conjunctive_removal_tactic_expand_results_queue$.setDynamicValue(cons(list(removal_bindings, justifications), $conjunctive_removal_tactic_expand_results_queue$.getDynamicValue(thread)), thread);
            return NIL;
        }
    }

    public static SubLObject conjunctive_removal_callback(SubLObject removal_bindings, final SubLObject justifications) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        removal_bindings = inference_simplify_unification_bindings(removal_bindings);
        inference_worker_removal.$conjunctive_removal_tactic_expand_results_queue$.setDynamicValue(cons(list(removal_bindings, justifications), inference_worker_removal.$conjunctive_removal_tactic_expand_results_queue$.getDynamicValue(thread)), thread);
        return NIL;
    }

    public static final SubLObject handle_one_conjunctive_removal_tactic_expand_result_alt(SubLObject tactic, SubLObject expand_result) {
        {
            SubLObject datum = expand_result;
            SubLObject current = datum;
            SubLObject removal_bindings = NIL;
            SubLObject justifications = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt33);
            removal_bindings = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt33);
            justifications = current.first();
            current = current.rest();
            if (NIL == current) {
                return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.handle_one_conjunctive_removal_tactic_result(tactic, removal_bindings, justifications);
            } else {
                cdestructuring_bind_error(datum, $list_alt33);
            }
        }
        return NIL;
    }

    public static SubLObject handle_one_conjunctive_removal_tactic_expand_result(final SubLObject tactic, final SubLObject expand_result) {
        SubLObject removal_bindings = NIL;
        SubLObject justifications = NIL;
        destructuring_bind_must_consp(expand_result, expand_result, inference_worker_removal.$list41);
        removal_bindings = expand_result.first();
        SubLObject current = expand_result.rest();
        destructuring_bind_must_consp(current, expand_result, inference_worker_removal.$list41);
        justifications = current.first();
        current = current.rest();
        if (NIL == current) {
            return inference_worker_removal.handle_one_conjunctive_removal_tactic_result(tactic, removal_bindings, justifications);
        }
        cdestructuring_bind_error(expand_result, inference_worker_removal.$list41);
        return NIL;
    }

    public static SubLObject conjunctive_removal_suppress_split_justificationP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != inference_worker_removal.$conjunctive_removal_suppress_split_justificationP$.getDynamicValue(thread)) {
            final SubLObject inf = inference_macros.current_controlling_inference();
            final SubLObject metrics = inference_datastructures_inference.inference_metrics_template(inf);
            return makeBoolean(NIL == find(inference_worker_removal.$INFERENCE_PROOF_SPEC, metrics, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        return NIL;
    }

    public static final SubLObject handle_one_conjunctive_removal_tactic_result_alt(SubLObject tactic, SubLObject removal_bindings, SubLObject justifications) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            inference_datastructures_tactic.decrement_tactic_productivity_for_number_of_children(tactic, ONE_INTEGER);
            {
                SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
                SubLObject compute_answersP = inference_datastructures_problem_store.problem_store_compute_answer_justificationsP(inference_datastructures_problem.problem_store(problem));
                if (NIL == justifications) {
                    return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.maybe_new_simplification_link(problem, tactic, removal_bindings);
                } else {
                    if ((NIL != $conjunctive_removal_optimize_when_no_justificationsP$.getDynamicValue(thread)) && (NIL == compute_answersP)) {
                        return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.maybe_new_removal_link(problem, tactic, removal_bindings, NIL);
                    } else {
                        if (NIL != $conjunctive_removal_suppress_split_justificationP$.getDynamicValue(thread)) {
                            {
                                SubLObject supports = NIL;
                                SubLObject cdolist_list_var = justifications;
                                SubLObject justification = NIL;
                                for (justification = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , justification = cdolist_list_var.first()) {
                                    {
                                        SubLObject cdolist_list_var_7 = justification;
                                        SubLObject support = NIL;
                                        for (support = cdolist_list_var_7.first(); NIL != cdolist_list_var_7; cdolist_list_var_7 = cdolist_list_var_7.rest() , support = cdolist_list_var_7.first()) {
                                            supports = cons(support, supports);
                                        }
                                    }
                                }
                                if (NIL == removal_bindings) {
                                    return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.maybe_new_removal_link(problem, tactic, removal_bindings, supports);
                                } else {
                                    return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.maybe_new_restriction_and_removal_link(problem, tactic, removal_bindings, supports);
                                }
                            }
                        } else {
                            if (NIL == removal_bindings) {
                                return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.maybe_new_split_and_removal_links(problem, tactic, justifications);
                            } else {
                                return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.maybe_new_restriction_split_and_removal_links(problem, tactic, removal_bindings, justifications);
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject handle_one_conjunctive_removal_tactic_result(final SubLObject tactic, final SubLObject removal_bindings, final SubLObject justifications) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        inference_datastructures_tactic.decrement_tactic_productivity_for_number_of_children(tactic, ONE_INTEGER);
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        final SubLObject compute_answersP = inference_datastructures_problem_store.problem_store_compute_answer_justificationsP(inference_datastructures_problem.problem_store(problem));
        if (NIL == justifications) {
            return inference_worker_removal.maybe_new_simplification_link(problem, tactic, removal_bindings);
        }
        if ((NIL != inference_worker_removal.$conjunctive_removal_optimize_when_no_justificationsP$.getDynamicValue(thread)) && (NIL == compute_answersP)) {
            return inference_worker_removal.maybe_new_removal_link(problem, tactic, removal_bindings, NIL);
        }
        if (NIL != inference_worker_removal.conjunctive_removal_suppress_split_justificationP()) {
            SubLObject supports = NIL;
            if (justifications.isList()) {
                SubLObject cdolist_list_var = justifications;
                SubLObject justification = NIL;
                justification = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$10 = justification;
                    SubLObject support = NIL;
                    support = cdolist_list_var_$10.first();
                    while (NIL != cdolist_list_var_$10) {
                        supports = cons(support, supports);
                        cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                        support = cdolist_list_var_$10.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    justification = cdolist_list_var.first();
                } 
            }
            if (NIL == removal_bindings) {
                return inference_worker_removal.maybe_new_removal_link(problem, tactic, removal_bindings, supports);
            }
            return inference_worker_removal.maybe_new_restriction_and_removal_link(problem, tactic, removal_bindings, supports);
        } else {
            if (NIL == removal_bindings) {
                return inference_worker_removal.maybe_new_split_and_removal_links(problem, tactic, justifications);
            }
            return inference_worker_removal.maybe_new_restriction_split_and_removal_links(problem, tactic, removal_bindings, justifications);
        }
    }

    public static final SubLObject maybe_new_simplification_link_alt(SubLObject problem, SubLObject tactic, SubLObject removal_bindings) {
        {
            SubLObject restricted_mapped_problem = inference_worker_join_ordered.find_or_create_restricted_problem(problem, removal_bindings);
            return inference_worker_restriction.maybe_new_restriction_link(problem, restricted_mapped_problem, removal_bindings, NIL, tactic);
        }
    }

    public static SubLObject maybe_new_simplification_link(final SubLObject problem, final SubLObject tactic, final SubLObject removal_bindings) {
        final SubLObject restricted_mapped_problem = inference_worker_join_ordered.find_or_create_restricted_problem(problem, removal_bindings);
        return inference_worker_restriction.maybe_new_restriction_link(problem, restricted_mapped_problem, removal_bindings, NIL, tactic);
    }

    public static final SubLObject maybe_new_restriction_split_and_removal_links_alt(SubLObject problem, SubLObject tactic, SubLObject removal_bindings, SubLObject justifications) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject restricted_mapped_problem = inference_worker_join_ordered.find_or_create_restricted_problem(problem, removal_bindings);
                SubLObject restricted_problem = inference_datastructures_problem_link.mapped_problem_problem(restricted_mapped_problem);
                SubLObject reordered_justifications = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.reorder_conjunctive_removal_justifications(justifications, problem, removal_bindings, restricted_problem);
                com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.maybe_new_split_and_removal_links(restricted_problem, tactic, reordered_justifications);
                {
                    SubLObject restriction_link = inference_worker_restriction.maybe_new_restriction_link(problem, restricted_mapped_problem, removal_bindings, NIL, tactic);
                    SubLObject restricted_mapped_problem_from_link = inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem(restriction_link);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == inference_datastructures_problem_link.mapped_problem_equal(restricted_mapped_problem_from_link, restricted_mapped_problem)) {
                            Errors.error($str_alt36$Problem_reuse_assumptions_were_vi, restricted_mapped_problem_from_link, restricted_mapped_problem);
                        }
                    }
                    return restriction_link;
                }
            }
        }
    }

    public static SubLObject maybe_new_restriction_split_and_removal_links(final SubLObject problem, final SubLObject tactic, final SubLObject removal_bindings, final SubLObject justifications) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject restricted_mapped_problem = inference_worker_join_ordered.find_or_create_restricted_problem(problem, removal_bindings);
        final SubLObject restricted_problem = inference_datastructures_problem_link.mapped_problem_problem(restricted_mapped_problem);
        final SubLObject reordered_justifications = inference_worker_removal.reorder_conjunctive_removal_justifications(justifications, problem, removal_bindings, restricted_problem);
        inference_worker_removal.maybe_new_split_and_removal_links(restricted_problem, tactic, reordered_justifications);
        final SubLObject restriction_link = inference_worker_restriction.maybe_new_restriction_link(problem, restricted_mapped_problem, removal_bindings, NIL, tactic);
        final SubLObject restricted_mapped_problem_from_link = inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem(restriction_link);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == inference_datastructures_problem_link.mapped_problem_equal(restricted_mapped_problem_from_link, restricted_mapped_problem))) {
            Errors.error(inference_worker_removal.$str46$Problem_reuse_assumptions_were_vi, restricted_mapped_problem_from_link, restricted_mapped_problem);
        }
        return restriction_link;
    }

    /**
     * Return a reordering of the conjuntive removal JUSTIFICATIONS necessitated by the restriction
     * of UNRESTRICTED-PROBLEM via RESTRICTION-BINDINGS to RESTRICTED-PROBLEM
     */
    @LispMethod(comment = "Return a reordering of the conjuntive removal JUSTIFICATIONS necessitated by the restriction\r\nof UNRESTRICTED-PROBLEM via RESTRICTION-BINDINGS to RESTRICTED-PROBLEM\nReturn a reordering of the conjuntive removal JUSTIFICATIONS necessitated by the restriction\nof UNRESTRICTED-PROBLEM via RESTRICTION-BINDINGS to RESTRICTED-PROBLEM")
    public static final SubLObject reorder_conjunctive_removal_justifications_alt(SubLObject justifications, SubLObject unrestricted_problem, SubLObject restriction_bindings, SubLObject restricted_problem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject unrestricted_clause = inference_datastructures_problem.problem_sole_clause(unrestricted_problem);
                SubLObject actual_restricted_clause = inference_datastructures_problem.problem_sole_clause(restricted_problem);
                SubLObject expected_restricted_clause = bindings.apply_bindings(restriction_bindings, unrestricted_clause);
                if (actual_restricted_clause.equal(expected_restricted_clause)) {
                    return justifications;
                }
                {
                    SubLObject reordered_justifications = NIL;
                    {
                        SubLObject cdolist_list_var = clauses.neg_lits(actual_restricted_clause);
                        SubLObject actual_asent = NIL;
                        for (actual_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , actual_asent = cdolist_list_var.first()) {
                            {
                                SubLObject expected_clause_index = ZERO_INTEGER;
                                SubLObject foundP = NIL;
                                {
                                    SubLObject rest = NIL;
                                    for (rest = clauses.neg_lits(expected_restricted_clause); !((NIL != foundP) || (NIL == rest)); rest = rest.rest()) {
                                        {
                                            SubLObject expected_asent = rest.first();
                                            if (expected_asent.equal(actual_asent)) {
                                                {
                                                    SubLObject justification = nth(expected_clause_index, justifications);
                                                    reordered_justifications = cons(justification, reordered_justifications);
                                                    foundP = T;
                                                }
                                            }
                                            expected_clause_index = add(expected_clause_index, ONE_INTEGER);
                                        }
                                    }
                                }
                                {
                                    SubLObject rest = NIL;
                                    for (rest = clauses.pos_lits(expected_restricted_clause); !((NIL != foundP) || (NIL == rest)); rest = rest.rest()) {
                                        {
                                            SubLObject expected_asent = rest.first();
                                            if (expected_asent.equal(actual_asent)) {
                                                {
                                                    SubLObject justification = nth(expected_clause_index, justifications);
                                                    reordered_justifications = cons(justification, reordered_justifications);
                                                    foundP = T;
                                                }
                                            }
                                            expected_clause_index = add(expected_clause_index, ONE_INTEGER);
                                        }
                                    }
                                }
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == foundP) {
                                        Errors.error($str_alt37$Couldn_t_find_the_right_conjuncti, actual_asent);
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = clauses.pos_lits(actual_restricted_clause);
                        SubLObject actual_asent = NIL;
                        for (actual_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , actual_asent = cdolist_list_var.first()) {
                            {
                                SubLObject expected_clause_index = ZERO_INTEGER;
                                SubLObject foundP = NIL;
                                {
                                    SubLObject rest = NIL;
                                    for (rest = clauses.neg_lits(expected_restricted_clause); !((NIL != foundP) || (NIL == rest)); rest = rest.rest()) {
                                        {
                                            SubLObject expected_asent = rest.first();
                                            if (expected_asent.equal(actual_asent)) {
                                                {
                                                    SubLObject justification = nth(expected_clause_index, justifications);
                                                    reordered_justifications = cons(justification, reordered_justifications);
                                                    foundP = T;
                                                }
                                            }
                                            expected_clause_index = add(expected_clause_index, ONE_INTEGER);
                                        }
                                    }
                                }
                                {
                                    SubLObject rest = NIL;
                                    for (rest = clauses.pos_lits(expected_restricted_clause); !((NIL != foundP) || (NIL == rest)); rest = rest.rest()) {
                                        {
                                            SubLObject expected_asent = rest.first();
                                            if (expected_asent.equal(actual_asent)) {
                                                {
                                                    SubLObject justification = nth(expected_clause_index, justifications);
                                                    reordered_justifications = cons(justification, reordered_justifications);
                                                    foundP = T;
                                                }
                                            }
                                            expected_clause_index = add(expected_clause_index, ONE_INTEGER);
                                        }
                                    }
                                }
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == foundP) {
                                        Errors.error($str_alt37$Couldn_t_find_the_right_conjuncti, actual_asent);
                                    }
                                }
                            }
                        }
                    }
                    reordered_justifications = nreverse(reordered_justifications);
                    return reordered_justifications;
                }
            }
        }
    }

    /**
     * Return a reordering of the conjuntive removal JUSTIFICATIONS necessitated by the restriction
     * of UNRESTRICTED-PROBLEM via RESTRICTION-BINDINGS to RESTRICTED-PROBLEM
     */
    @LispMethod(comment = "Return a reordering of the conjuntive removal JUSTIFICATIONS necessitated by the restriction\r\nof UNRESTRICTED-PROBLEM via RESTRICTION-BINDINGS to RESTRICTED-PROBLEM\nReturn a reordering of the conjuntive removal JUSTIFICATIONS necessitated by the restriction\nof UNRESTRICTED-PROBLEM via RESTRICTION-BINDINGS to RESTRICTED-PROBLEM")
    public static SubLObject reorder_conjunctive_removal_justifications(final SubLObject justifications, final SubLObject unrestricted_problem, final SubLObject restriction_bindings, final SubLObject restricted_problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject unrestricted_clause = inference_datastructures_problem.problem_sole_clause(unrestricted_problem);
        final SubLObject actual_restricted_clause = inference_datastructures_problem.problem_sole_clause(restricted_problem);
        final SubLObject expected_restricted_clause = apply_bindings(restriction_bindings, unrestricted_clause);
        if (actual_restricted_clause.equal(expected_restricted_clause)) {
            return justifications;
        }
        SubLObject reordered_justifications = NIL;
        SubLObject cdolist_list_var = neg_lits(actual_restricted_clause);
        SubLObject actual_asent = NIL;
        actual_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject expected_clause_index = ZERO_INTEGER;
            SubLObject foundP;
            SubLObject rest;
            SubLObject expected_asent;
            SubLObject justification;
            for (foundP = NIL, rest = NIL, rest = neg_lits(expected_restricted_clause); (NIL == foundP) && (NIL != rest); rest = rest.rest()) {
                expected_asent = rest.first();
                if (expected_asent.equal(actual_asent)) {
                    justification = nth(expected_clause_index, justifications);
                    reordered_justifications = cons(justification, reordered_justifications);
                    foundP = T;
                }
                expected_clause_index = add(expected_clause_index, ONE_INTEGER);
            }
            for (rest = NIL, rest = pos_lits(expected_restricted_clause); (NIL == foundP) && (NIL != rest); rest = rest.rest()) {
                expected_asent = rest.first();
                if (expected_asent.equal(actual_asent)) {
                    justification = nth(expected_clause_index, justifications);
                    reordered_justifications = cons(justification, reordered_justifications);
                    foundP = T;
                }
                expected_clause_index = add(expected_clause_index, ONE_INTEGER);
            }
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == foundP)) {
                Errors.error(inference_worker_removal.$str47$Couldn_t_find_the_right_conjuncti, actual_asent);
            }
            cdolist_list_var = cdolist_list_var.rest();
            actual_asent = cdolist_list_var.first();
        } 
        cdolist_list_var = pos_lits(actual_restricted_clause);
        actual_asent = NIL;
        actual_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject expected_clause_index = ZERO_INTEGER;
            SubLObject foundP;
            SubLObject rest;
            SubLObject expected_asent;
            SubLObject justification;
            for (foundP = NIL, rest = NIL, rest = neg_lits(expected_restricted_clause); (NIL == foundP) && (NIL != rest); rest = rest.rest()) {
                expected_asent = rest.first();
                if (expected_asent.equal(actual_asent)) {
                    justification = nth(expected_clause_index, justifications);
                    reordered_justifications = cons(justification, reordered_justifications);
                    foundP = T;
                }
                expected_clause_index = add(expected_clause_index, ONE_INTEGER);
            }
            for (rest = NIL, rest = pos_lits(expected_restricted_clause); (NIL == foundP) && (NIL != rest); rest = rest.rest()) {
                expected_asent = rest.first();
                if (expected_asent.equal(actual_asent)) {
                    justification = nth(expected_clause_index, justifications);
                    reordered_justifications = cons(justification, reordered_justifications);
                    foundP = T;
                }
                expected_clause_index = add(expected_clause_index, ONE_INTEGER);
            }
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == foundP)) {
                Errors.error(inference_worker_removal.$str47$Couldn_t_find_the_right_conjuncti, actual_asent);
            }
            cdolist_list_var = cdolist_list_var.rest();
            actual_asent = cdolist_list_var.first();
        } 
        reordered_justifications = nreverse(reordered_justifications);
        return reordered_justifications;
    }

    public static final SubLObject maybe_new_split_and_removal_links_alt(SubLObject problem, SubLObject tactic, SubLObject justifications) {
        {
            SubLObject dnf_clause = inference_datastructures_problem.problem_sole_clause(problem);
            if (NIL != clauses.atomic_clause_p(dnf_clause)) {
                com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.maybe_new_removal_link(problem, tactic, NIL, justifications.first());
            } else {
                {
                    SubLObject split_link = inference_worker_split.maybe_new_split_link(problem, dnf_clause);
                    inference_worker.problem_link_open_and_repropagate_all(split_link);
                    {
                        SubLObject cdolist_list_var = clauses.neg_lits(dnf_clause);
                        SubLObject contextualized_asent = NIL;
                        for (contextualized_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , contextualized_asent = cdolist_list_var.first()) {
                            {
                                SubLObject literal_supports = justifications.first();
                                justifications = justifications.rest();
                                com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.maybe_new_removal_link_for_split_link(split_link, tactic, contextualized_asent, $NEG, literal_supports);
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = clauses.pos_lits(dnf_clause);
                        SubLObject contextualized_asent = NIL;
                        for (contextualized_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , contextualized_asent = cdolist_list_var.first()) {
                            {
                                SubLObject literal_supports = justifications.first();
                                justifications = justifications.rest();
                                com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.maybe_new_removal_link_for_split_link(split_link, tactic, contextualized_asent, $POS, literal_supports);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject maybe_new_split_and_removal_links(final SubLObject problem, final SubLObject tactic, SubLObject justifications) {
        final SubLObject dnf_clause = inference_datastructures_problem.problem_sole_clause(problem);
        if (NIL != atomic_clause_p(dnf_clause)) {
            inference_worker_removal.maybe_new_removal_link(problem, tactic, NIL, justifications.first());
        } else {
            final SubLObject split_link = inference_worker_split.maybe_new_split_link(problem, dnf_clause);
            inference_worker.problem_link_open_and_repropagate_all(split_link);
            SubLObject cdolist_list_var = neg_lits(dnf_clause);
            SubLObject contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject literal_supports = justifications.first();
                justifications = justifications.rest();
                inference_worker_removal.maybe_new_removal_link_for_split_link(split_link, tactic, contextualized_asent, $NEG, literal_supports);
                cdolist_list_var = cdolist_list_var.rest();
                contextualized_asent = cdolist_list_var.first();
            } 
            cdolist_list_var = pos_lits(dnf_clause);
            contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject literal_supports = justifications.first();
                justifications = justifications.rest();
                inference_worker_removal.maybe_new_removal_link_for_split_link(split_link, tactic, contextualized_asent, $POS, literal_supports);
                cdolist_list_var = cdolist_list_var.rest();
                contextualized_asent = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static final SubLObject maybe_new_removal_link_for_split_link_alt(SubLObject split_link, SubLObject tactic, SubLObject contextualized_asent, SubLObject sense, SubLObject literal_supports) {
        {
            SubLObject query = inference_datastructures_problem_query.new_problem_query_from_contextualized_asent_sense(contextualized_asent, sense);
            SubLObject literal_problem = inference_datastructures_problem_link.find_closed_supporting_problem_by_query(split_link, query);
            return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.maybe_new_removal_link(literal_problem, tactic, NIL, literal_supports);
        }
    }

    public static SubLObject maybe_new_removal_link_for_split_link(final SubLObject split_link, final SubLObject tactic, final SubLObject contextualized_asent, final SubLObject sense, final SubLObject literal_supports) {
        final SubLObject query = inference_datastructures_problem_query.new_problem_query_from_contextualized_asent_sense(contextualized_asent, sense);
        final SubLObject literal_problem = inference_datastructures_problem_link.find_closed_supporting_problem_by_query(split_link, query);
        return inference_worker_removal.maybe_new_removal_link(literal_problem, tactic, NIL, literal_supports);
    }

    public static SubLObject executed_conjunctive_removal_problems(final SubLObject store, SubLObject module_subtype) {
        if (module_subtype == UNPROVIDED) {
            module_subtype = NIL;
        }
        SubLObject problems = NIL;
        final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$11 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$11, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$11);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                SubLObject witness;
                SubLObject rest;
                SubLObject tactic;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    problem = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        for (witness = NIL, rest = NIL, rest = inference_datastructures_problem.problem_tactics(problem); (NIL == witness) && (NIL != rest); rest = rest.rest()) {
                            tactic = rest.first();
                            if ((NIL != inference_worker_removal.executed_conjunctive_removal_tactic_p(tactic)) && ((NIL == module_subtype) || (NIL != member_eqP(module_subtype, inference_modules.hl_module_subtypes(inference_datastructures_tactic.tactic_hl_module(tactic)))))) {
                                witness = tactic;
                            }
                        }
                        if (NIL != witness) {
                            problems = cons(problem, problems);
                        }
                    }
                }
            }
            final SubLObject idx_$12 = idx;
            if ((NIL == id_index_sparse_objects_empty_p(idx_$12)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                final SubLObject sparse = id_index_sparse_objects(idx_$12);
                SubLObject id2 = id_index_sparse_id_threshold(idx_$12);
                final SubLObject end_id = id_index_next_id(idx_$12);
                final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                while (id2.numL(end_id)) {
                    final SubLObject problem2 = gethash_without_values(id2, sparse, v_default);
                    if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(problem2))) {
                        SubLObject witness2;
                        SubLObject rest2;
                        SubLObject tactic2;
                        for (witness2 = NIL, rest2 = NIL, rest2 = inference_datastructures_problem.problem_tactics(problem2); (NIL == witness2) && (NIL != rest2); rest2 = rest2.rest()) {
                            tactic2 = rest2.first();
                            if ((NIL != inference_worker_removal.executed_conjunctive_removal_tactic_p(tactic2)) && ((NIL == module_subtype) || (NIL != member_eqP(module_subtype, inference_modules.hl_module_subtypes(inference_datastructures_tactic.tactic_hl_module(tactic2)))))) {
                                witness2 = tactic2;
                            }
                        }
                        if (NIL != witness2) {
                            problems = cons(problem2, problems);
                        }
                    }
                    id2 = add(id2, ONE_INTEGER);
                } 
            }
        }
        return nreverse(problems);
    }

    public static SubLObject problem_store_has_some_executed_sksi_conjunctive_removal_problemP(final SubLObject store) {
        SubLObject witness = NIL;
        final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$13 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$13, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$13);
                final SubLObject backwardP_var = NIL;
                final SubLObject length = length(vector_var);
                SubLObject current;
                final SubLObject datum = current = (NIL != backwardP_var) ? list(subtract(length, ONE_INTEGER), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER) : list(ZERO_INTEGER, length, ONE_INTEGER);
                SubLObject start = NIL;
                SubLObject end = NIL;
                SubLObject delta = NIL;
                destructuring_bind_must_consp(current, datum, inference_worker_removal.$list50);
                start = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, inference_worker_removal.$list50);
                end = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, inference_worker_removal.$list50);
                delta = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL == witness) {
                        SubLObject end_var;
                        SubLObject id;
                        SubLObject problem;
                        SubLObject rest;
                        SubLObject tactic;
                        for (end_var = end, id = NIL, id = start; (NIL == witness) && (NIL == subl_macros.do_numbers_endtest(id, delta, end_var)); id = add(id, delta)) {
                            problem = aref(vector_var, id);
                            if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(problem)) {
                                    problem = $SKIP;
                                }
                                for (rest = NIL, rest = inference_datastructures_problem.problem_tactics(problem); (NIL == witness) && (NIL != rest); rest = rest.rest()) {
                                    tactic = rest.first();
                                    if ((NIL != inference_worker_removal.executed_conjunctive_removal_tactic_p(tactic)) && (NIL != member_eqP($SKSI, inference_modules.hl_module_subtypes(inference_datastructures_tactic.tactic_hl_module(tactic))))) {
                                        witness = tactic;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, inference_worker_removal.$list50);
                }
            }
            final SubLObject idx_$14 = idx;
            if ((NIL == id_index_sparse_objects_empty_p(idx_$14)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                final SubLObject sparse = id_index_sparse_objects(idx_$14);
                SubLObject id2 = id_index_sparse_id_threshold(idx_$14);
                final SubLObject end_id = id_index_next_id(idx_$14);
                final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                while (id2.numL(end_id) && (NIL == witness)) {
                    final SubLObject problem2 = gethash_without_values(id2, sparse, v_default);
                    if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(problem2))) {
                        SubLObject rest2;
                        SubLObject tactic2;
                        for (rest2 = NIL, rest2 = inference_datastructures_problem.problem_tactics(problem2); (NIL == witness) && (NIL != rest2); rest2 = rest2.rest()) {
                            tactic2 = rest2.first();
                            if ((NIL != inference_worker_removal.executed_conjunctive_removal_tactic_p(tactic2)) && (NIL != member_eqP($SKSI, inference_modules.hl_module_subtypes(inference_datastructures_tactic.tactic_hl_module(tactic2))))) {
                                witness = tactic2;
                            }
                        }
                    }
                    id2 = add(id2, ONE_INTEGER);
                } 
            }
        }
        return witness;
    }

    public static SubLObject executed_conjunctive_removal_tactic_p(final SubLObject tactic) {
        return makeBoolean((((NIL != inference_worker_removal.conjunctive_removal_tactic_p(tactic)) && ((NIL != inference_datastructures_tactic.tactic_in_progressP(tactic)) || (NIL != inference_datastructures_tactic.tactic_executedP(tactic)))) && (NIL == inference_worker_restriction.simplification_tactic_p(tactic))) && (NIL == conjunctive_pruning_tactic_p(tactic)));
    }

    public static final SubLObject with_problem_store_removal_assumptions_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject store = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt40);
            store = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject store_var = $sym41$STORE_VAR;
                return listS(CLET, list(list(store_var, store), list($negation_by_failure$, list($sym44$PROBLEM_STORE_NEGATION_BY_FAILURE_, store_var))), append(body, NIL));
            }
        }
    }

    public static SubLObject with_problem_store_removal_assumptions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject store = NIL;
        destructuring_bind_must_consp(current, datum, inference_worker_removal.$list52);
        store = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject store_var = inference_worker_removal.$sym53$STORE_VAR;
        return listS(CLET, list(list(store_var, store), list(inference_worker_removal.$negation_by_failure$, list(inference_worker_removal.$sym56$PROBLEM_STORE_NEGATION_BY_FAILURE_, store_var))), append(body, NIL));
    }

    public static final SubLObject meta_removal_tactic_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_tactic.tactic_p(v_object)) && ($META_REMOVAL == inference_datastructures_tactic.tactic_type(v_object)));
    }

    public static SubLObject meta_removal_tactic_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_tactic.tactic_p(v_object)) && ($META_REMOVAL == inference_datastructures_tactic.tactic_type(v_object)));
    }

    public static final SubLObject compute_strategic_properties_of_meta_removal_tactic_alt(SubLObject tactic, SubLObject strategy) {
        return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.compute_strategic_properties_of_removal_tactic(tactic, strategy);
    }

    public static SubLObject compute_strategic_properties_of_meta_removal_tactic(final SubLObject tactic, final SubLObject strategy) {
        return inference_worker_removal.compute_strategic_properties_of_removal_tactic(tactic, strategy);
    }

    public static final SubLObject removal_link_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_problem_link.problem_link_p(v_object)) && ($REMOVAL == inference_datastructures_problem_link.problem_link_type(v_object)));
    }

    public static SubLObject removal_link_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_problem_link.problem_link_p(v_object)) && ($REMOVAL == inference_datastructures_problem_link.problem_link_type(v_object)));
    }

    public static final SubLObject removal_tactic_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_tactic.tactic_p(v_object)) && ($REMOVAL == inference_datastructures_tactic.tactic_type(v_object)));
    }

    public static SubLObject removal_tactic_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_tactic.tactic_p(v_object)) && ($REMOVAL == inference_datastructures_tactic.tactic_type(v_object)));
    }

    public static final SubLObject removal_proof_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_proof.proof_p(v_object)) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.removal_link_p(inference_datastructures_proof.proof_link(v_object))));
    }

    public static SubLObject removal_proof_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_proof.proof_p(v_object)) && (NIL != inference_worker_removal.removal_link_p(inference_datastructures_proof.proof_link(v_object))));
    }

    public static final SubLObject removal_module_exclusive_func_funcall_alt(SubLObject func, SubLObject asent, SubLObject sense) {
        return eval_in_api.possibly_cyc_api_funcall_2(func, asent, sense);
    }

    public static SubLObject removal_module_exclusive_func_funcall(final SubLObject func, final SubLObject asent, final SubLObject sense) {
        return possibly_cyc_api_funcall_2(func, asent, sense);
    }

    public static final SubLObject removal_module_required_func_funcall_alt(SubLObject func, SubLObject asent, SubLObject sense) {
        {
            SubLObject pcase_var = func;
            if (pcase_var.eql(META_REMOVAL_COMPLETELY_DECIDABLE_POS_REQUIRED)) {
                return meta_removal_modules.meta_removal_completely_decidable_pos_required(asent, sense);
            } else {
                if (pcase_var.eql(META_REMOVAL_COMPLETELY_ENUMERABLE_POS_REQUIRED)) {
                    return meta_removal_modules.meta_removal_completely_enumerable_pos_required(asent, sense);
                } else {
                    if (pcase_var.eql(REMOVAL_ABDUCTION_POS_REQUIRED)) {
                        return removal_modules_abduction.removal_abduction_pos_required(asent, sense);
                    } else {
                        if (pcase_var.eql(REMOVAL_EVALUATABLE_FCP_UNIFY_REQUIRED)) {
                            return removal_modules_function_corresponding_predicate.removal_evaluatable_fcp_unify_required(asent, sense);
                        } else {
                            if (pcase_var.eql(REMOVAL_FCP_CHECK_REQUIRED)) {
                                return removal_modules_function_corresponding_predicate.removal_fcp_check_required(asent, sense);
                            } else {
                                if (pcase_var.eql(REMOVAL_ISA_DEFN_POS_REQUIRED)) {
                                    return removal_modules_isa.removal_isa_defn_pos_required(asent, sense);
                                } else {
                                    if (pcase_var.eql(REMOVAL_TVA_CHECK_REQUIRED)) {
                                        return removal_modules_tva_lookup.removal_tva_check_required(asent, sense);
                                    } else {
                                        if (pcase_var.eql(REMOVAL_TVA_UNIFY_REQUIRED)) {
                                            return removal_modules_tva_lookup.removal_tva_unify_required(asent, sense);
                                        } else {
                                            return eval_in_api.possibly_cyc_api_funcall_2(func, asent, sense);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject removal_module_required_func_funcall(final SubLObject func, final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if ((NIL != last_metric_type) && (NIL != last_metric)) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, ZERO_INTEGER);
        }
        final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind($INFERENCE, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind(func, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind(NIL, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
            try {
                if (func.eql(inference_worker_removal.META_REMOVAL_COMPLETELY_DECIDABLE_POS_REQUIRED)) {
                    return meta_removal_completely_decidable_pos_required(asent, sense);
                }
                if (func.eql(inference_worker_removal.META_REMOVAL_COMPLETELY_ENUMERABLE_POS_REQUIRED)) {
                    return meta_removal_completely_enumerable_pos_required(asent, sense);
                }
                if (func.eql(inference_worker_removal.REMOVAL_ABDUCTION_POS_REQUIRED)) {
                    return removal_abduction_pos_required(asent, sense);
                }
                if (func.eql(inference_worker_removal.REMOVAL_EVALUATABLE_FCP_UNIFY_REQUIRED)) {
                    return removal_evaluatable_fcp_unify_required(asent, sense);
                }
                if (func.eql(inference_worker_removal.REMOVAL_FCP_CHECK_REQUIRED)) {
                    return removal_fcp_check_required(asent, sense);
                }
                if (func.eql(inference_worker_removal.REMOVAL_ISA_DEFN_POS_REQUIRED)) {
                    return removal_isa_defn_pos_required(asent, sense);
                }
                if (func.eql(inference_worker_removal.REMOVAL_TVA_CHECK_REQUIRED)) {
                    return removal_tva_check_required(asent, sense);
                }
                if (func.eql(inference_worker_removal.REMOVAL_TVA_UNIFY_REQUIRED)) {
                    return removal_tva_unify_required(asent, sense);
                }
                return possibly_cyc_api_funcall_2(func, asent, sense);
            } finally {
                final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics($INFERENCE, func, NIL, NIL, NIL);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                }
            }
        } finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
    }

    public static final SubLObject removal_module_expand_func_funcall_alt(SubLObject func, SubLObject asent, SubLObject sense) {
        {
            SubLObject pcase_var = func;
            if (pcase_var.eql(REMOVAL_ASSERTED_TERM_SENTENCES_ARG_INDEX_UNIFY_EXPAND)) {
                return removal_modules_asserted_formula.removal_asserted_term_sentences_arg_index_unify_expand(asent, sense);
            } else {
                if (pcase_var.eql(REMOVAL_EVAL_EXPAND)) {
                    return removal_modules_evaluation.removal_eval_expand(asent, sense);
                } else {
                    if (pcase_var.eql(REMOVAL_EVALUATE_BIND_EXPAND)) {
                        return removal_modules_evaluate.removal_evaluate_bind_expand(asent, sense);
                    } else {
                        if (pcase_var.eql(REMOVAL_ISA_COLLECTION_CHECK_NEG_EXPAND)) {
                            return removal_modules_isa.removal_isa_collection_check_neg_expand(asent, sense);
                        } else {
                            if (pcase_var.eql(REMOVAL_ISA_COLLECTION_CHECK_POS_EXPAND)) {
                                return removal_modules_isa.removal_isa_collection_check_pos_expand(asent, sense);
                            } else {
                                if (pcase_var.eql(REMOVAL_NAT_ARGUMENT_LOOKUP_EXPAND)) {
                                    return removal_modules_natfunction.removal_nat_argument_lookup_expand(asent, sense);
                                } else {
                                    if (pcase_var.eql(REMOVAL_NAT_FORMULA_EXPAND)) {
                                        return removal_modules_termofunit.removal_nat_formula_expand(asent, sense);
                                    } else {
                                        if (pcase_var.eql(REMOVAL_NAT_FUNCTION_LOOKUP_EXPAND)) {
                                            return removal_modules_natfunction.removal_nat_function_lookup_expand(asent, sense);
                                        } else {
                                            if (pcase_var.eql(REMOVAL_NAT_LOOKUP_EXPAND)) {
                                                return removal_modules_termofunit.removal_nat_lookup_expand(asent, sense);
                                            } else {
                                                if (pcase_var.eql(REMOVAL_REFLEXIVE_ON_EXPAND)) {
                                                    return removal_modules_reflexive_on.removal_reflexive_on_expand(asent, sense);
                                                } else {
                                                    if (pcase_var.eql(REMOVAL_TVA_CHECK_EXPAND)) {
                                                        return removal_modules_tva_lookup.removal_tva_check_expand(asent, sense);
                                                    } else {
                                                        return eval_in_api.possibly_cyc_api_funcall_2(func, asent, sense);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject removal_module_expand_func_funcall(final SubLObject func, final SubLObject asent, final SubLObject sense) {
        if (func.eql(inference_worker_removal.REMOVAL_ASSERTED_TERM_SENTENCES_ARG_INDEX_UNIFY_EXPAND)) {
            return removal_asserted_term_sentences_arg_index_unify_expand(asent, sense);
        }
        if (func.eql(inference_worker_removal.REMOVAL_EVAL_EXPAND)) {
            return removal_eval_expand(asent, sense);
        }
        if (func.eql(inference_worker_removal.REMOVAL_EVALUATE_BIND_EXPAND)) {
            return removal_evaluate_bind_expand(asent, sense);
        }
        if (func.eql(inference_worker_removal.REMOVAL_ISA_COLLECTION_CHECK_NEG_EXPAND)) {
            return removal_isa_collection_check_neg_expand(asent, sense);
        }
        if (func.eql(inference_worker_removal.REMOVAL_ISA_COLLECTION_CHECK_POS_EXPAND)) {
            return removal_isa_collection_check_pos_expand(asent, sense);
        }
        if (func.eql(inference_worker_removal.REMOVAL_NAT_ARGUMENT_LOOKUP_EXPAND)) {
            return removal_nat_argument_lookup_expand(asent, sense);
        }
        if (func.eql(inference_worker_removal.REMOVAL_NAT_FORMULA_EXPAND)) {
            return removal_nat_formula_expand(asent, sense);
        }
        if (func.eql(inference_worker_removal.REMOVAL_NAT_FUNCTION_LOOKUP_EXPAND)) {
            return removal_nat_function_lookup_expand(asent, sense);
        }
        if (func.eql(inference_worker_removal.REMOVAL_NAT_LOOKUP_EXPAND)) {
            return removal_nat_lookup_expand(asent, sense);
        }
        if (func.eql(inference_worker_removal.REMOVAL_REFLEXIVE_ON_EXPAND)) {
            return removal_reflexive_on_expand(asent, sense);
        }
        if (func.eql(inference_worker_removal.REMOVAL_TVA_CHECK_EXPAND)) {
            return removal_tva_check_expand(asent, sense);
        }
        return possibly_cyc_api_funcall_2(func, asent, sense);
    }

    public static final SubLObject determine_new_literal_removal_tactics_alt(SubLObject problem, SubLObject asent, SubLObject sense) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == inference_datastructures_problem_store.problem_store_removal_allowedP(inference_datastructures_problem.problem_store(problem))) {
                return NIL;
            }
            {
                SubLObject store = inference_datastructures_problem.problem_store(problem);
                SubLObject tactics = NIL;
                SubLObject store_var = store;
                {
                    SubLObject _prev_bind_0 = $negation_by_failure$.currentBinding(thread);
                    try {
                        $negation_by_failure$.bind(inference_datastructures_problem_store.problem_store_negation_by_failureP(store_var), thread);
                        com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.determine_new_literal_simple_removal_tactics(problem, asent, sense);
                        com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.determine_new_literal_meta_removal_tactics(problem, asent, sense);
                    } finally {
                        $negation_by_failure$.rebind(_prev_bind_0, thread);
                    }
                }
                return tactics;
            }
        }
    }

    public static SubLObject determine_new_literal_removal_tactics(final SubLObject problem, final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == inference_datastructures_problem_store.problem_store_removal_allowedP(inference_datastructures_problem.problem_store(problem))) {
            return NIL;
        }
        final SubLObject store = inference_datastructures_problem.problem_store(problem);
        final SubLObject tactics = NIL;
        final SubLObject store_var = store;
        final SubLObject _prev_bind_0 = inference_worker_removal.$negation_by_failure$.currentBinding(thread);
        try {
            inference_worker_removal.$negation_by_failure$.bind(inference_datastructures_problem_store.problem_store_negation_by_failureP(store_var), thread);
            inference_worker_removal.determine_new_literal_simple_removal_tactics(problem, asent, sense);
            inference_worker_removal.determine_new_literal_meta_removal_tactics(problem, asent, sense);
        } finally {
            inference_worker_removal.$negation_by_failure$.rebind(_prev_bind_0, thread);
        }
        return tactics;
    }

    /**
     * Figure out all applicable inference meta removal tactics for ASENT with SENSE, and add them to PROBLEM.
     */
    @LispMethod(comment = "Figure out all applicable inference meta removal tactics for ASENT with SENSE, and add them to PROBLEM.")
    public static final SubLObject determine_new_literal_meta_removal_tactics_alt(SubLObject problem, SubLObject asent, SubLObject sense) {
        {
            SubLObject hl_modules = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.literal_meta_removal_candidate_hl_modules(asent, sense);
            return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.determine_new_removal_tactics_from_hl_modules(hl_modules, problem, asent, sense);
        }
    }

    /**
     * Figure out all applicable inference meta removal tactics for ASENT with SENSE, and add them to PROBLEM.
     */
    @LispMethod(comment = "Figure out all applicable inference meta removal tactics for ASENT with SENSE, and add them to PROBLEM.")
    public static SubLObject determine_new_literal_meta_removal_tactics(final SubLObject problem, final SubLObject asent, final SubLObject sense) {
        final SubLObject hl_modules = inference_worker_removal.literal_meta_removal_candidate_hl_modules(asent, sense);
        return inference_worker_removal.determine_new_removal_tactics_from_hl_modules(hl_modules, problem, asent, sense);
    }

    /**
     * Figure out all applicable inference removal tactics for ASENT with SENSE, and add them to PROBLEM.
     */
    @LispMethod(comment = "Figure out all applicable inference removal tactics for ASENT with SENSE, and add them to PROBLEM.")
    public static final SubLObject determine_new_literal_simple_removal_tactics_alt(SubLObject problem, SubLObject asent, SubLObject sense) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != $external_inference_enabled$.getDynamicValue(thread)) && (NIL != some_external_removal_modulesP())) {
                {
                    SubLObject external_tactics = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.determine_new_removal_tactics_from_hl_modules(removal_modules_external(), problem, asent, sense);
                    if (NIL != external_tactics) {
                        return external_tactics;
                    }
                }
            }
            {
                SubLObject hl_modules = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.literal_simple_removal_candidate_hl_modules(asent, sense);
                return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.determine_new_removal_tactics_from_hl_modules(hl_modules, problem, asent, sense);
            }
        }
    }

    /**
     * Figure out all applicable inference removal tactics for ASENT with SENSE, and add them to PROBLEM.
     */
    @LispMethod(comment = "Figure out all applicable inference removal tactics for ASENT with SENSE, and add them to PROBLEM.")
    public static SubLObject determine_new_literal_simple_removal_tactics(final SubLObject problem, final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $external_inference_enabled$.getDynamicValue(thread)) && (NIL != inference_modules.some_external_removal_modulesP())) {
            final SubLObject external_tactics = inference_worker_removal.determine_new_removal_tactics_from_hl_modules(inference_modules.removal_modules_external(), problem, asent, sense);
            if (NIL != external_tactics) {
                return external_tactics;
            }
        }
        final SubLObject hl_modules = inference_worker_removal.literal_simple_removal_candidate_hl_modules(asent, sense);
        return inference_worker_removal.determine_new_removal_tactics_from_hl_modules(hl_modules, problem, asent, sense);
    }

    /**
     * Return a list of inference removal options for ASENT with SENSE.
     */
    @LispMethod(comment = "Return a list of inference removal options for ASENT with SENSE.")
    public static final SubLObject literal_removal_options_alt(SubLObject asent, SubLObject sense, SubLObject allowed_modules_spec) {
        if (allowed_modules_spec == UNPROVIDED) {
            allowed_modules_spec = $ALL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != $external_inference_enabled$.getDynamicValue(thread)) && (NIL != some_external_removal_modulesP())) {
                {
                    SubLObject external_tactic_specs = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.determine_new_removal_tactic_specs_from_hl_modules(removal_modules_external(), asent, sense);
                    if (NIL != external_tactic_specs) {
                        return external_tactic_specs;
                    }
                }
            }
            {
                SubLObject hl_modules = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.literal_removal_options_hl_modules(asent, sense, allowed_modules_spec);
                return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.determine_new_removal_tactic_specs_from_hl_modules(hl_modules, asent, sense);
            }
        }
    }

    /**
     * Return a list of inference removal options for ASENT with SENSE.
     */
    @LispMethod(comment = "Return a list of inference removal options for ASENT with SENSE.")
    public static SubLObject literal_removal_options(final SubLObject asent, final SubLObject sense, SubLObject allowed_modules_spec) {
        if (allowed_modules_spec == UNPROVIDED) {
            allowed_modules_spec = $ALL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $external_inference_enabled$.getDynamicValue(thread)) && (NIL != inference_modules.some_external_removal_modulesP())) {
            final SubLObject external_tactic_specs = inference_worker_removal.determine_new_removal_tactic_specs_from_hl_modules(inference_modules.removal_modules_external(), asent, sense);
            if (NIL != external_tactic_specs) {
                return external_tactic_specs;
            }
        }
        final SubLObject hl_modules = inference_worker_removal.literal_removal_options_hl_modules(asent, sense, allowed_modules_spec);
        return inference_worker_removal.determine_new_removal_tactic_specs_from_hl_modules(hl_modules, asent, sense);
    }

    public static final SubLObject literal_removal_options_hl_modules_alt(SubLObject asent, SubLObject sense, SubLObject allowed_modules_spec) {
        {
            SubLObject candidate_hl_modules = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.literal_removal_options_candidate_hl_modules(asent, sense, allowed_modules_spec);
            return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.filter_modules_wrt_allowed_modules_spec(candidate_hl_modules, allowed_modules_spec);
        }
    }

    public static SubLObject literal_removal_options_hl_modules(final SubLObject asent, final SubLObject sense, final SubLObject allowed_modules_spec) {
        final SubLObject candidate_hl_modules = inference_worker_removal.literal_removal_options_candidate_hl_modules(asent, sense, allowed_modules_spec);
        return inference_worker_removal.filter_modules_wrt_allowed_modules_spec(candidate_hl_modules, allowed_modules_spec);
    }

    public static final SubLObject filter_modules_wrt_allowed_modules_spec_alt(SubLObject candidate_hl_modules, SubLObject allowed_modules_spec) {
        {
            SubLObject hl_modules = NIL;
            if (allowed_modules_spec == $ALL) {
                hl_modules = candidate_hl_modules;
            } else {
                {
                    SubLObject cdolist_list_var = candidate_hl_modules;
                    SubLObject module = NIL;
                    for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                        if ((NIL != hl_module_allowed_by_allowed_modules_specP(module, allowed_modules_spec)) || (NIL != hl_module_exclusive_func(module))) {
                            hl_modules = cons(module, hl_modules);
                        }
                    }
                }
                hl_modules = nreverse(hl_modules);
            }
            return hl_modules;
        }
    }

    public static SubLObject filter_modules_wrt_allowed_modules_spec(final SubLObject candidate_hl_modules, final SubLObject allowed_modules_spec) {
        SubLObject hl_modules = NIL;
        if (allowed_modules_spec == $ALL) {
            hl_modules = candidate_hl_modules;
        } else {
            SubLObject cdolist_list_var = candidate_hl_modules;
            SubLObject module = NIL;
            module = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL != inference_modules.hl_module_allowed_by_allowed_modules_specP(module, allowed_modules_spec)) || (NIL != inference_modules.hl_module_exclusive_func(module))) {
                    hl_modules = cons(module, hl_modules);
                }
                cdolist_list_var = cdolist_list_var.rest();
                module = cdolist_list_var.first();
            } 
            hl_modules = nreverse(hl_modules);
        }
        return hl_modules;
    }

    public static final SubLObject literal_removal_options_candidate_hl_modules_alt(SubLObject asent, SubLObject sense, SubLObject allowed_modules_spec) {
        if (allowed_modules_spec == $ALL) {
            return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.literal_simple_removal_candidate_hl_modules(asent, sense);
        } else {
            if (NIL != simple_allowed_modules_spec_p(allowed_modules_spec)) {
                return get_modules_from_simple_allowed_modules_spec(allowed_modules_spec);
            } else {
                return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.literal_simple_removal_candidate_hl_modules(asent, sense);
            }
        }
    }

    public static SubLObject literal_removal_options_candidate_hl_modules(final SubLObject asent, final SubLObject sense, final SubLObject allowed_modules_spec) {
        if (allowed_modules_spec == $ALL) {
            return inference_worker_removal.literal_simple_removal_candidate_hl_modules(asent, sense);
        }
        if (NIL != inference_modules.simple_allowed_modules_spec_p(allowed_modules_spec)) {
            return inference_modules.get_modules_from_simple_allowed_modules_spec(allowed_modules_spec);
        }
        return inference_worker_removal.literal_simple_removal_candidate_hl_modules(asent, sense);
    }

    public static final SubLObject hl_module_applicable_to_asentP_alt(SubLObject hl_module, SubLObject asent) {
        return makeBoolean(((((NIL != hl_module_predicate_relevant_p(hl_module, atomic_sentence_predicate(asent))) && (NIL != hl_module_arity_relevant_p(hl_module, asent))) && (NIL != hl_module_required_pattern_matched_p(hl_module, asent))) && (NIL != hl_module_required_mt_relevantP(hl_module))) && (NIL != hl_module_direction_relevantP(hl_module)));
    }

    public static SubLObject hl_module_applicable_to_asentP(final SubLObject hl_module, final SubLObject asent) {
        return makeBoolean(((((NIL != inference_modules.hl_module_predicate_relevant_p(hl_module, cycl_utilities.atomic_sentence_predicate(asent))) && (NIL != inference_modules.hl_module_arity_relevant_p(hl_module, asent))) && (NIL != inference_modules.hl_module_required_pattern_matched_p(hl_module, asent))) && (NIL != inference_modules.hl_module_required_mt_relevantP(hl_module))) && (NIL != inference_modules.hl_module_direction_relevantP(hl_module)));
    }

    /**
     * Using HL-MODULES, figure out applicable inference removal tactics
     * for ASENT with SENSE, and add them to PROBLEM.
     * HL-MODULES is a list of the applicable removal modules to try.
     */
    @LispMethod(comment = "Using HL-MODULES, figure out applicable inference removal tactics\r\nfor ASENT with SENSE, and add them to PROBLEM.\r\nHL-MODULES is a list of the applicable removal modules to try.\nUsing HL-MODULES, figure out applicable inference removal tactics\nfor ASENT with SENSE, and add them to PROBLEM.\nHL-MODULES is a list of the applicable removal modules to try.")
    public static final SubLObject determine_new_removal_tactics_from_hl_modules_alt(SubLObject hl_modules, SubLObject problem, SubLObject asent, SubLObject sense) {
        {
            SubLObject tactic_specs = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.determine_new_removal_tactic_specs_from_hl_modules(hl_modules, asent, sense);
            SubLObject cdolist_list_var = tactic_specs;
            SubLObject tactic_spec = NIL;
            for (tactic_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tactic_spec = cdolist_list_var.first()) {
                {
                    SubLObject datum = tactic_spec;
                    SubLObject current = datum;
                    SubLObject hl_module = NIL;
                    SubLObject productivity = NIL;
                    SubLObject completeness = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt28);
                    hl_module = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt28);
                    productivity = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt28);
                    completeness = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.new_removal_tactic(problem, hl_module, productivity, completeness);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt28);
                    }
                }
            }
            return tactic_specs;
        }
    }

    /**
     * Using HL-MODULES, figure out applicable inference removal tactics
     * for ASENT with SENSE, and add them to PROBLEM.
     * HL-MODULES is a list of the applicable removal modules to try.
     */
    @LispMethod(comment = "Using HL-MODULES, figure out applicable inference removal tactics\r\nfor ASENT with SENSE, and add them to PROBLEM.\r\nHL-MODULES is a list of the applicable removal modules to try.\nUsing HL-MODULES, figure out applicable inference removal tactics\nfor ASENT with SENSE, and add them to PROBLEM.\nHL-MODULES is a list of the applicable removal modules to try.")
    public static SubLObject determine_new_removal_tactics_from_hl_modules(final SubLObject hl_modules, final SubLObject problem, final SubLObject asent, final SubLObject sense) {
        SubLObject cdolist_list_var;
        final SubLObject tactic_specs = cdolist_list_var = inference_worker_removal.determine_new_removal_tactic_specs_from_hl_modules(hl_modules, asent, sense);
        SubLObject tactic_spec = NIL;
        tactic_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tactic_spec;
            SubLObject hl_module = NIL;
            SubLObject productivity = NIL;
            SubLObject completeness = NIL;
            destructuring_bind_must_consp(current, datum, inference_worker_removal.$list34);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, inference_worker_removal.$list34);
            productivity = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, inference_worker_removal.$list34);
            completeness = current.first();
            current = current.rest();
            if (NIL == current) {
                inference_worker_removal.new_removal_tactic(problem, hl_module, productivity, completeness);
            } else {
                cdestructuring_bind_error(datum, inference_worker_removal.$list34);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic_spec = cdolist_list_var.first();
        } 
        return tactic_specs;
    }

    /**
     * Using HL-MODULES, figure out applicable inference removal tactic-specs
     * for ASENT with SENSE.
     * HL-MODULES is a list of the applicable removal modules to try.
     */
    @LispMethod(comment = "Using HL-MODULES, figure out applicable inference removal tactic-specs\r\nfor ASENT with SENSE.\r\nHL-MODULES is a list of the applicable removal modules to try.\nUsing HL-MODULES, figure out applicable inference removal tactic-specs\nfor ASENT with SENSE.\nHL-MODULES is a list of the applicable removal modules to try.")
    public static final SubLObject determine_new_removal_tactic_specs_from_hl_modules_alt(SubLObject hl_modules, SubLObject asent, SubLObject sense) {
        return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.hl_module_guts($DETERMINE_NEW_REMOVAL_TACTIC_SPECS_FROM_HL_MODULES, hl_modules, asent, sense, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Using HL-MODULES, figure out applicable inference removal tactic-specs
     * for ASENT with SENSE.
     * HL-MODULES is a list of the applicable removal modules to try.
     */
    @LispMethod(comment = "Using HL-MODULES, figure out applicable inference removal tactic-specs\r\nfor ASENT with SENSE.\r\nHL-MODULES is a list of the applicable removal modules to try.\nUsing HL-MODULES, figure out applicable inference removal tactic-specs\nfor ASENT with SENSE.\nHL-MODULES is a list of the applicable removal modules to try.")
    public static SubLObject determine_new_removal_tactic_specs_from_hl_modules(final SubLObject hl_modules, final SubLObject asent, final SubLObject sense) {
        return inference_worker_removal.hl_module_guts(inference_worker_removal.$DETERMINE_NEW_REMOVAL_TACTIC_SPECS_FROM_HL_MODULES, hl_modules, asent, sense, UNPROVIDED, UNPROVIDED);
    }

    /**
     * map over the hl-modules, determining our tactics for this literal
     */
    @LispMethod(comment = "map over the hl-modules, determining our tactics for this literal")
    public static final SubLObject determine_new_removal_tactic_specs_from_hl_modules_guts_alt(SubLObject candidate_hl_modules, SubLObject asent, SubLObject sense) {
        {
            SubLObject applicable_hl_modules = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.determine_applicable_hl_modules_for_asent(candidate_hl_modules, asent, sense);
            SubLObject tactic_specs = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.compute_tactic_specs_for_asent(applicable_hl_modules, asent, sense);
            return tactic_specs;
        }
    }

    /**
     * map over the hl-modules, determining our tactics for this literal
     */
    @LispMethod(comment = "map over the hl-modules, determining our tactics for this literal")
    public static SubLObject determine_new_removal_tactic_specs_from_hl_modules_guts(final SubLObject candidate_hl_modules, final SubLObject asent, final SubLObject sense) {
        final SubLObject applicable_hl_modules = inference_worker_removal.determine_applicable_hl_modules_for_asent(candidate_hl_modules, asent, sense);
        final SubLObject tactic_specs = inference_worker_removal.compute_tactic_specs_for_asent(applicable_hl_modules, asent, sense);
        return tactic_specs;
    }

    public static final SubLObject determine_applicable_hl_modules_for_asent_alt(SubLObject candidate_hl_modules, SubLObject asent, SubLObject sense) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject supplanted_hl_modules = NIL;
                SubLObject applicable_hl_modules = NIL;
                SubLObject totally_exclusive_foundP = NIL;
                if (NIL == totally_exclusive_foundP) {
                    {
                        SubLObject csome_list_var = candidate_hl_modules;
                        SubLObject hl_module = NIL;
                        for (hl_module = csome_list_var.first(); !((NIL != totally_exclusive_foundP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , hl_module = csome_list_var.first()) {
                            if (NIL == hl_module_exclusive_func(hl_module)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject totally_exclusive_foundP_8 = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.update_applicable_hl_modules(hl_module, asent, sense, applicable_hl_modules, supplanted_hl_modules);
                                    SubLObject applicable_hl_modules_9 = thread.secondMultipleValue();
                                    SubLObject supplanted_hl_modules_10 = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    totally_exclusive_foundP = totally_exclusive_foundP_8;
                                    applicable_hl_modules = applicable_hl_modules_9;
                                    supplanted_hl_modules = supplanted_hl_modules_10;
                                }
                            }
                        }
                    }
                }
                if (NIL == totally_exclusive_foundP) {
                    {
                        SubLObject csome_list_var = candidate_hl_modules;
                        SubLObject hl_module = NIL;
                        for (hl_module = csome_list_var.first(); !((NIL != totally_exclusive_foundP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , hl_module = csome_list_var.first()) {
                            if (NIL != hl_module_exclusive_func(hl_module)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject totally_exclusive_foundP_11 = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.update_applicable_hl_modules(hl_module, asent, sense, applicable_hl_modules, supplanted_hl_modules);
                                    SubLObject applicable_hl_modules_12 = thread.secondMultipleValue();
                                    SubLObject supplanted_hl_modules_13 = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    totally_exclusive_foundP = totally_exclusive_foundP_11;
                                    applicable_hl_modules = applicable_hl_modules_12;
                                    supplanted_hl_modules = supplanted_hl_modules_13;
                                }
                            }
                        }
                    }
                }
                return applicable_hl_modules;
            }
        }
    }

    public static SubLObject determine_applicable_hl_modules_for_asent(final SubLObject candidate_hl_modules, final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supplanted_hl_modules = NIL;
        SubLObject applicable_hl_modules = NIL;
        SubLObject totally_exclusive_foundP = NIL;
        if (NIL == totally_exclusive_foundP) {
            SubLObject csome_list_var = candidate_hl_modules;
            SubLObject hl_module = NIL;
            hl_module = csome_list_var.first();
            while ((NIL == totally_exclusive_foundP) && (NIL != csome_list_var)) {
                if (NIL == inference_modules.hl_module_exclusive_func(hl_module)) {
                    thread.resetMultipleValues();
                    final SubLObject totally_exclusive_foundP_$16 = inference_worker_removal.update_applicable_hl_modules(hl_module, asent, sense, applicable_hl_modules, supplanted_hl_modules);
                    final SubLObject applicable_hl_modules_$17 = thread.secondMultipleValue();
                    final SubLObject supplanted_hl_modules_$18 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    totally_exclusive_foundP = totally_exclusive_foundP_$16;
                    applicable_hl_modules = applicable_hl_modules_$17;
                    supplanted_hl_modules = supplanted_hl_modules_$18;
                }
                csome_list_var = csome_list_var.rest();
                hl_module = csome_list_var.first();
            } 
        }
        if (NIL == totally_exclusive_foundP) {
            SubLObject csome_list_var = candidate_hl_modules;
            SubLObject hl_module = NIL;
            hl_module = csome_list_var.first();
            while ((NIL == totally_exclusive_foundP) && (NIL != csome_list_var)) {
                if (NIL != inference_modules.hl_module_exclusive_func(hl_module)) {
                    thread.resetMultipleValues();
                    final SubLObject totally_exclusive_foundP_$17 = inference_worker_removal.update_applicable_hl_modules(hl_module, asent, sense, applicable_hl_modules, supplanted_hl_modules);
                    final SubLObject applicable_hl_modules_$18 = thread.secondMultipleValue();
                    final SubLObject supplanted_hl_modules_$19 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    totally_exclusive_foundP = totally_exclusive_foundP_$17;
                    applicable_hl_modules = applicable_hl_modules_$18;
                    supplanted_hl_modules = supplanted_hl_modules_$19;
                }
                csome_list_var = csome_list_var.rest();
                hl_module = csome_list_var.first();
            } 
        }
        return applicable_hl_modules;
    }

    /**
     * Determine if HL-MODULE applies to ASENT with SENSE
     *
     * @return 0 boolean ; whether HL-MODULE is completely exclusive, allowing us to ignore checking other hl-modules.
     * @return 1 applicable-hl-modules ; updated version of APPLICABLE-HL-MODULES
     * @return 2 supplanted-hl-modules ; updated version of SUPPLANTED-HL-MODULES if HL-MODULE is at least partially exclusive.
     */
    @LispMethod(comment = "Determine if HL-MODULE applies to ASENT with SENSE\r\n\r\n@return 0 boolean ; whether HL-MODULE is completely exclusive, allowing us to ignore checking other hl-modules.\r\n@return 1 applicable-hl-modules ; updated version of APPLICABLE-HL-MODULES\r\n@return 2 supplanted-hl-modules ; updated version of SUPPLANTED-HL-MODULES if HL-MODULE is at least partially exclusive.")
    public static final SubLObject update_applicable_hl_modules_alt(SubLObject hl_module, SubLObject asent, SubLObject sense, SubLObject applicable_hl_modules, SubLObject supplanted_hl_modules) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject totally_exclusive_foundP = NIL;
                if (!((NIL != supplanted_hl_modules) && (NIL != list_utilities.member_eqP(hl_module, supplanted_hl_modules)))) {
                    if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.hl_module_applicable_to_asentP(hl_module, asent)) {
                        {
                            SubLObject exclusive_func = hl_module_exclusive_func(hl_module);
                            if ((NIL == exclusive_func) || ((NIL != eval_in_api.possibly_cyc_api_function_spec_p(exclusive_func)) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.removal_module_exclusive_func_funcall(exclusive_func, asent, sense)))) {
                                if (NIL != exclusive_func) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject totally_exclusive_foundP_14 = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.update_supplanted_hl_modules(hl_module, applicable_hl_modules, supplanted_hl_modules);
                                        SubLObject applicable_hl_modules_15 = thread.secondMultipleValue();
                                        SubLObject supplanted_hl_modules_16 = thread.thirdMultipleValue();
                                        thread.resetMultipleValues();
                                        totally_exclusive_foundP = totally_exclusive_foundP_14;
                                        applicable_hl_modules = applicable_hl_modules_15;
                                        supplanted_hl_modules = supplanted_hl_modules_16;
                                    }
                                }
                                {
                                    SubLObject required_func = hl_module_required_func(hl_module);
                                    if ((NIL == required_func) || ((NIL != eval_in_api.possibly_cyc_api_function_spec_p(required_func)) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.removal_module_required_func_funcall(required_func, asent, sense)))) {
                                        applicable_hl_modules = cons(hl_module, applicable_hl_modules);
                                    }
                                }
                            }
                        }
                    }
                }
                return values(totally_exclusive_foundP, applicable_hl_modules, supplanted_hl_modules);
            }
        }
    }

    /**
     * Determine if HL-MODULE applies to ASENT with SENSE
     *
     * @return 0 boolean ; whether HL-MODULE is completely exclusive, allowing us to ignore checking other hl-modules.
     * @return 1 applicable-hl-modules ; updated version of APPLICABLE-HL-MODULES
     * @return 2 supplanted-hl-modules ; updated version of SUPPLANTED-HL-MODULES if HL-MODULE is at least partially exclusive.
     */
    @LispMethod(comment = "Determine if HL-MODULE applies to ASENT with SENSE\r\n\r\n@return 0 boolean ; whether HL-MODULE is completely exclusive, allowing us to ignore checking other hl-modules.\r\n@return 1 applicable-hl-modules ; updated version of APPLICABLE-HL-MODULES\r\n@return 2 supplanted-hl-modules ; updated version of SUPPLANTED-HL-MODULES if HL-MODULE is at least partially exclusive.")
    public static SubLObject update_applicable_hl_modules(final SubLObject hl_module, final SubLObject asent, final SubLObject sense, SubLObject applicable_hl_modules, SubLObject supplanted_hl_modules) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject totally_exclusive_foundP = NIL;
        if (((NIL == supplanted_hl_modules) || (NIL == member_eqP(hl_module, supplanted_hl_modules))) && (NIL != inference_worker_removal.hl_module_applicable_to_asentP(hl_module, asent))) {
            final SubLObject exclusive_func = inference_modules.hl_module_exclusive_func(hl_module);
            if ((NIL == exclusive_func) || ((NIL != possibly_cyc_api_function_spec_p(exclusive_func)) && (NIL != inference_worker_removal.removal_module_exclusive_func_funcall(exclusive_func, asent, sense)))) {
                if (NIL != exclusive_func) {
                    thread.resetMultipleValues();
                    final SubLObject totally_exclusive_foundP_$22 = inference_worker_removal.update_supplanted_hl_modules(hl_module, applicable_hl_modules, supplanted_hl_modules);
                    final SubLObject applicable_hl_modules_$23 = thread.secondMultipleValue();
                    final SubLObject supplanted_hl_modules_$24 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    totally_exclusive_foundP = totally_exclusive_foundP_$22;
                    applicable_hl_modules = applicable_hl_modules_$23;
                    supplanted_hl_modules = supplanted_hl_modules_$24;
                }
                final SubLObject required_func = inference_modules.hl_module_required_func(hl_module);
                if ((NIL == required_func) || ((NIL != possibly_cyc_api_function_spec_p(required_func)) && (NIL != inference_worker_removal.removal_module_required_func_funcall(required_func, asent, sense)))) {
                    applicable_hl_modules = cons(hl_module, applicable_hl_modules);
                }
            }
        }
        return subl_promotions.values3(totally_exclusive_foundP, applicable_hl_modules, supplanted_hl_modules);
    }

    /**
     * Update the set of APPLICABLE-HL-MODULES and SUPPLANTED-HL-MODULES using the :supplants info on HL-MODULE.
     *
     * @return 0 boolean ; T iff HL-MODULE supplants all other hl-modules
     * @return 1 applicable-hl-modules ; updated version
     * @return 2 supplanted-modules    ; updated version
     */
    @LispMethod(comment = "Update the set of APPLICABLE-HL-MODULES and SUPPLANTED-HL-MODULES using the :supplants info on HL-MODULE.\r\n\r\n@return 0 boolean ; T iff HL-MODULE supplants all other hl-modules\r\n@return 1 applicable-hl-modules ; updated version\r\n@return 2 supplanted-modules    ; updated version")
    public static final SubLObject update_supplanted_hl_modules_alt(SubLObject hl_module, SubLObject applicable_hl_modules, SubLObject supplanted_hl_modules) {
        {
            SubLObject supplants_info = hl_module_supplants_info(hl_module);
            SubLObject totally_exclusive_foundP = NIL;
            SubLObject pcase_var = supplants_info;
            if (pcase_var.eql($ALL)) {
                applicable_hl_modules = NIL;
                totally_exclusive_foundP = T;
            } else {
                {
                    SubLObject newly_supplanted_hl_module_patterns = supplants_info;
                    SubLObject cdolist_list_var = newly_supplanted_hl_module_patterns;
                    SubLObject supplanted_hl_module_pattern = NIL;
                    for (supplanted_hl_module_pattern = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , supplanted_hl_module_pattern = cdolist_list_var.first()) {
                        if (supplanted_hl_module_pattern.isCons()) {
                            {
                                SubLObject patterns = list(supplanted_hl_module_pattern);
                                SubLObject negateP = NIL;
                                SubLObject pattern = NIL;
                                while (NIL != patterns) {
                                    pattern = patterns.first();
                                    patterns = patterns.rest();
                                    {
                                        SubLObject directive = pattern.first();
                                        SubLObject rest = pattern.rest();
                                        SubLObject pcase_var_17 = directive;
                                        if (pcase_var_17.eql($NOT)) {
                                            negateP = makeBoolean(NIL == negateP);
                                            patterns = cons(rest.first(), patterns);
                                        } else {
                                            if (pcase_var_17.eql($MODULE_SUBTYPE)) {
                                                {
                                                    SubLObject subtype = rest.first();
                                                    SubLObject newly_supplanted_hl_modules = applicable_hl_modules;
                                                    SubLObject cdolist_list_var_18 = newly_supplanted_hl_modules;
                                                    SubLObject supplanted_hl_module = NIL;
                                                    for (supplanted_hl_module = cdolist_list_var_18.first(); NIL != cdolist_list_var_18; cdolist_list_var_18 = cdolist_list_var_18.rest() , supplanted_hl_module = cdolist_list_var_18.first()) {
                                                        if (((NIL == negateP) && (NIL != list_utilities.member_eqP(subtype, hl_module_subtypes(supplanted_hl_module)))) || ((NIL != negateP) && (NIL == list_utilities.member_eqP(subtype, hl_module_subtypes(supplanted_hl_module))))) {
                                                            applicable_hl_modules = list_utilities.delete_first(supplanted_hl_module, applicable_hl_modules, symbol_function(EQ));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } 
                            }
                        } else {
                            {
                                SubLObject supplanted_hl_module = find_hl_module_by_name(supplanted_hl_module_pattern);
                                SubLObject item_var = supplanted_hl_module;
                                if (NIL == member(item_var, supplanted_hl_modules, symbol_function(EQ), symbol_function(IDENTITY))) {
                                    supplanted_hl_modules = cons(item_var, supplanted_hl_modules);
                                }
                                if (NIL != list_utilities.member_eqP(supplanted_hl_module, applicable_hl_modules)) {
                                    applicable_hl_modules = list_utilities.delete_first(supplanted_hl_module, applicable_hl_modules, symbol_function(EQ));
                                }
                            }
                        }
                    }
                }
            }
            return values(totally_exclusive_foundP, applicable_hl_modules, supplanted_hl_modules);
        }
    }

    /**
     * Update the set of APPLICABLE-HL-MODULES and SUPPLANTED-HL-MODULES using the :supplants info on HL-MODULE.
     *
     * @return 0 boolean ; T iff HL-MODULE supplants all other hl-modules
     * @return 1 applicable-hl-modules ; updated version
     * @return 2 supplanted-modules    ; updated version
     */
    @LispMethod(comment = "Update the set of APPLICABLE-HL-MODULES and SUPPLANTED-HL-MODULES using the :supplants info on HL-MODULE.\r\n\r\n@return 0 boolean ; T iff HL-MODULE supplants all other hl-modules\r\n@return 1 applicable-hl-modules ; updated version\r\n@return 2 supplanted-modules    ; updated version")
    public static SubLObject update_supplanted_hl_modules(final SubLObject hl_module, SubLObject applicable_hl_modules, SubLObject supplanted_hl_modules) {
        final SubLObject supplants_info = inference_modules.hl_module_supplants_info(hl_module);
        SubLObject totally_exclusive_foundP = NIL;
        final SubLObject pcase_var = supplants_info;
        if (pcase_var.eql($ALL)) {
            applicable_hl_modules = NIL;
            totally_exclusive_foundP = T;
        } else {
            SubLObject cdolist_list_var;
            final SubLObject newly_supplanted_hl_module_patterns = cdolist_list_var = supplants_info;
            SubLObject supplanted_hl_module_pattern = NIL;
            supplanted_hl_module_pattern = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (supplanted_hl_module_pattern.isCons()) {
                    SubLObject patterns = list(supplanted_hl_module_pattern);
                    SubLObject negateP = NIL;
                    SubLObject pattern = NIL;
                    while (NIL != patterns) {
                        pattern = patterns.first();
                        patterns = patterns.rest();
                        final SubLObject directive = pattern.first();
                        final SubLObject rest = pattern.rest();
                        final SubLObject pcase_var_$25 = directive;
                        if (pcase_var_$25.eql($NOT)) {
                            negateP = makeBoolean(NIL == negateP);
                            patterns = cons(rest.first(), patterns);
                        } else {
                            if (!pcase_var_$25.eql($MODULE_SUBTYPE)) {
                                continue;
                            }
                            final SubLObject subtype = rest.first();
                            SubLObject cdolist_list_var_$26;
                            final SubLObject newly_supplanted_hl_modules = cdolist_list_var_$26 = applicable_hl_modules;
                            SubLObject supplanted_hl_module = NIL;
                            supplanted_hl_module = cdolist_list_var_$26.first();
                            while (NIL != cdolist_list_var_$26) {
                                if (((NIL == negateP) && (NIL != member_eqP(subtype, inference_modules.hl_module_subtypes(supplanted_hl_module)))) || ((NIL != negateP) && (NIL == member_eqP(subtype, inference_modules.hl_module_subtypes(supplanted_hl_module))))) {
                                    applicable_hl_modules = delete_first(supplanted_hl_module, applicable_hl_modules, symbol_function(EQ));
                                }
                                cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                                supplanted_hl_module = cdolist_list_var_$26.first();
                            } 
                        }
                    } 
                } else {
                    final SubLObject item_var;
                    final SubLObject supplanted_hl_module2 = item_var = inference_modules.find_hl_module_by_name(supplanted_hl_module_pattern);
                    if (NIL == member(item_var, supplanted_hl_modules, symbol_function(EQ), symbol_function(IDENTITY))) {
                        supplanted_hl_modules = cons(item_var, supplanted_hl_modules);
                    }
                    if (NIL != member_eqP(supplanted_hl_module2, applicable_hl_modules)) {
                        applicable_hl_modules = delete_first(supplanted_hl_module2, applicable_hl_modules, symbol_function(EQ));
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                supplanted_hl_module_pattern = cdolist_list_var.first();
            } 
        }
        return subl_promotions.values3(totally_exclusive_foundP, applicable_hl_modules, supplanted_hl_modules);
    }

    /**
     * Update the set of EXISTING-TACTIC-SPECS and SUPPLANTED-MODULES using the :supplants info on HL-MODULE.
     *
     * @return 0 boolean ; T iff HL-MODULE supplants all other hl-modules
     * @return 1 existing-tactics   ; updated version
     * @return 2 supplanted-modules ; updated version
     */
    @LispMethod(comment = "Update the set of EXISTING-TACTIC-SPECS and SUPPLANTED-MODULES using the :supplants info on HL-MODULE.\r\n\r\n@return 0 boolean ; T iff HL-MODULE supplants all other hl-modules\r\n@return 1 existing-tactics   ; updated version\r\n@return 2 supplanted-modules ; updated version")
    public static final SubLObject update_supplanted_modules_wrt_tactic_specs_alt(SubLObject hl_module, SubLObject existing_tactic_specs, SubLObject supplanted_modules) {
        {
            SubLObject supplants_info = hl_module_supplants_info(hl_module);
            SubLObject totally_exclusive_foundP = NIL;
            SubLObject pcase_var = supplants_info;
            if (pcase_var.eql($ALL)) {
                existing_tactic_specs = NIL;
                totally_exclusive_foundP = T;
            } else {
                {
                    SubLObject newly_supplanted_module_names = supplants_info;
                    SubLObject cdolist_list_var = newly_supplanted_module_names;
                    SubLObject supplanted_module_name = NIL;
                    for (supplanted_module_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , supplanted_module_name = cdolist_list_var.first()) {
                        {
                            SubLObject supplanted_module = find_hl_module_by_name(supplanted_module_name);
                            supplanted_modules = cons(supplanted_module, supplanted_modules);
                            {
                                SubLObject supplanted_tactic_spec = find(supplanted_module, existing_tactic_specs, symbol_function(EQ), symbol_function(FIRST), UNPROVIDED, UNPROVIDED);
                                if (NIL != supplanted_tactic_spec) {
                                    existing_tactic_specs = list_utilities.delete_first(supplanted_tactic_spec, existing_tactic_specs, symbol_function(EQUAL));
                                    supplanted_tactic_spec = NIL;
                                }
                            }
                        }
                    }
                }
            }
            return values(totally_exclusive_foundP, existing_tactic_specs, supplanted_modules);
        }
    }

    /**
     * Update the set of EXISTING-TACTIC-SPECS and SUPPLANTED-MODULES using the :supplants info on HL-MODULE.
     *
     * @return 0 boolean ; T iff HL-MODULE supplants all other hl-modules
     * @return 1 existing-tactics   ; updated version
     * @return 2 supplanted-modules ; updated version
     */
    @LispMethod(comment = "Update the set of EXISTING-TACTIC-SPECS and SUPPLANTED-MODULES using the :supplants info on HL-MODULE.\r\n\r\n@return 0 boolean ; T iff HL-MODULE supplants all other hl-modules\r\n@return 1 existing-tactics   ; updated version\r\n@return 2 supplanted-modules ; updated version")
    public static SubLObject update_supplanted_modules_wrt_tactic_specs(final SubLObject hl_module, SubLObject existing_tactic_specs, SubLObject supplanted_modules) {
        final SubLObject supplants_info = inference_modules.hl_module_supplants_info(hl_module);
        SubLObject totally_exclusive_foundP = NIL;
        final SubLObject pcase_var = supplants_info;
        if (pcase_var.eql($ALL)) {
            existing_tactic_specs = NIL;
            totally_exclusive_foundP = T;
        } else {
            SubLObject cdolist_list_var;
            final SubLObject newly_supplanted_module_names = cdolist_list_var = supplants_info;
            SubLObject supplanted_module_name = NIL;
            supplanted_module_name = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject supplanted_module = inference_modules.find_hl_module_by_name(supplanted_module_name);
                supplanted_modules = cons(supplanted_module, supplanted_modules);
                SubLObject supplanted_tactic_spec = find(supplanted_module, existing_tactic_specs, symbol_function(EQ), symbol_function(FIRST), UNPROVIDED, UNPROVIDED);
                if (NIL != supplanted_tactic_spec) {
                    existing_tactic_specs = delete_first(supplanted_tactic_spec, existing_tactic_specs, symbol_function(EQUAL));
                    supplanted_tactic_spec = NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                supplanted_module_name = cdolist_list_var.first();
            } 
        }
        return subl_promotions.values3(totally_exclusive_foundP, existing_tactic_specs, supplanted_modules);
    }

    public static final SubLObject compute_tactic_specs_for_asent_alt(SubLObject applicable_hl_modules, SubLObject asent, SubLObject sense) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tactic_specs = NIL;
                SubLObject cdolist_list_var = applicable_hl_modules;
                SubLObject hl_module = NIL;
                for (hl_module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , hl_module = cdolist_list_var.first()) {
                    {
                        SubLObject cost = hl_module_cost(hl_module, asent, sense);
                        if (NIL != cost) {
                            if (((NIL != $maximum_hl_module_check_cost$.getDynamicValue(thread)) && (NIL != variables.fully_bound_p(asent))) && cost.numG($maximum_hl_module_check_cost$.getDynamicValue(thread))) {
                                Errors.error($str_alt70$For_sentence_____S__Maximum_HL_Mo, asent, hl_module, cost);
                            }
                            {
                                SubLObject productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(cost);
                                SubLObject completeness = hl_module_completeness(hl_module, asent, UNPROVIDED);
                                SubLObject tactic_spec = list(hl_module, productivity, completeness);
                                tactic_specs = cons(tactic_spec, tactic_specs);
                            }
                        }
                    }
                }
                return tactic_specs;
            }
        }
    }

    public static SubLObject compute_tactic_specs_for_asent(final SubLObject applicable_hl_modules, final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tactic_specs = NIL;
        SubLObject cdolist_list_var = applicable_hl_modules;
        SubLObject hl_module = NIL;
        hl_module = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject cost = inference_modules.hl_module_cost(hl_module, asent, sense);
            if (NIL != cost) {
                if (((NIL != $maximum_hl_module_check_cost$.getDynamicValue(thread)) && (NIL != fully_bound_p(asent))) && cost.numG($maximum_hl_module_check_cost$.getDynamicValue(thread))) {
                    Errors.error(inference_worker_removal.$str82$For_sentence_____S__Maximum_HL_Mo, asent, hl_module, cost);
                }
                final SubLObject productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(cost);
                final SubLObject completeness = inference_modules.hl_module_completeness(hl_module, asent, UNPROVIDED);
                final SubLObject tactic_spec = list(hl_module, productivity, completeness);
                tactic_specs = cons(tactic_spec, tactic_specs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            hl_module = cdolist_list_var.first();
        } 
        return tactic_specs;
    }

    public static final SubLObject literal_simple_removal_candidate_hl_modules_alt(SubLObject asent, SubLObject sense) {
        {
            SubLObject predicate = atomic_sentence_predicate(asent);
            if (NIL != forts.fort_p(predicate)) {
                return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.literal_removal_candidate_hl_modules_for_predicate_with_sense(predicate, sense);
            } else {
                return generic_removal_modules_for_sense(sense);
            }
        }
    }

    public static SubLObject literal_simple_removal_candidate_hl_modules(final SubLObject asent, final SubLObject sense) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (NIL != fort_p(predicate)) {
            return inference_worker_removal.literal_removal_candidate_hl_modules_for_predicate_with_sense(predicate, sense);
        }
        return inference_modules.generic_removal_modules_for_sense(sense);
    }

    public static final SubLObject literal_removal_candidate_hl_modules_for_predicate_with_sense_alt(SubLObject predicate, SubLObject sense) {
        {
            SubLObject inference = current_controlling_inference();
            if ((NIL != inference) && (NIL != inference_problem_store_privateP(inference))) {
                {
                    SubLObject allowed_modules_spec = inference_allowed_modules(inference);
                    return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.literal_removal_candidate_hl_modules_for_predicate_with_sense_int(predicate, sense, allowed_modules_spec);
                }
            }
        }
        return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.literal_removal_candidate_hl_modules_for_predicate_with_sense_int(predicate, sense, $ALL);
    }

    public static SubLObject literal_removal_candidate_hl_modules_for_predicate_with_sense(final SubLObject predicate, final SubLObject sense) {
        final SubLObject inference = inference_macros.current_controlling_inference();
        if ((NIL != inference) && (NIL != inference_datastructures_inference.inference_problem_store_privateP(inference))) {
            final SubLObject allowed_modules_spec = inference_datastructures_inference.inference_allowed_modules(inference);
            return inference_worker_removal.literal_removal_candidate_hl_modules_for_predicate_with_sense_int(predicate, sense, allowed_modules_spec);
        }
        return inference_worker_removal.literal_removal_candidate_hl_modules_for_predicate_with_sense_int(predicate, sense, $ALL);
    }

    public static final SubLObject literal_removal_candidate_hl_modules_for_predicate_with_sense_int_internal_alt(SubLObject predicate, SubLObject sense, SubLObject allowed_modules_spec) {
        {
            SubLObject predicate_specific_removal_modules = removal_modules_specific_for_sense(predicate, sense);
            SubLObject universal_removal_modules = removal_modules_universal_for_predicate_and_sense(predicate, sense);
            SubLObject v_modules = NIL;
            if (NIL != solely_specific_removal_module_predicateP(predicate)) {
                v_modules = nconc(predicate_specific_removal_modules, universal_removal_modules);
            } else {
                v_modules = nconc(predicate_specific_removal_modules, generic_removal_modules_for_sense(sense), universal_removal_modules);
            }
            v_modules = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.filter_modules_wrt_allowed_modules_spec(v_modules, allowed_modules_spec);
            return v_modules;
        }
    }

    public static SubLObject literal_removal_candidate_hl_modules_for_predicate_with_sense_int_internal(final SubLObject predicate, final SubLObject sense, final SubLObject allowed_modules_spec) {
        final SubLObject predicate_specific_removal_modules = inference_modules.removal_modules_specific_for_sense(predicate, sense);
        final SubLObject universal_removal_modules = inference_modules.removal_modules_universal_for_predicate_and_sense(predicate, sense);
        SubLObject v_modules = NIL;
        if (NIL != inference_modules.solely_specific_removal_module_predicateP(predicate)) {
            v_modules = nconc(predicate_specific_removal_modules, universal_removal_modules);
        } else {
            v_modules = nconc(predicate_specific_removal_modules, inference_modules.generic_removal_modules_for_sense(sense), universal_removal_modules);
        }
        v_modules = inference_worker_removal.filter_modules_wrt_allowed_modules_spec(v_modules, allowed_modules_spec);
        return v_modules;
    }

    public static final SubLObject literal_removal_candidate_hl_modules_for_predicate_with_sense_int_alt(SubLObject predicate, SubLObject sense, SubLObject allowed_modules_spec) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.literal_removal_candidate_hl_modules_for_predicate_with_sense_int_internal(predicate, sense, allowed_modules_spec);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, LITERAL_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE_WITH_SENSE_INT, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), LITERAL_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE_WITH_SENSE_INT, THREE_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, LITERAL_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE_WITH_SENSE_INT, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(predicate, sense, allowed_modules_spec);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw72$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (predicate == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (sense == cached_args.first()) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && (allowed_modules_spec == cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.literal_removal_candidate_hl_modules_for_predicate_with_sense_int_internal(predicate, sense, allowed_modules_spec)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicate, sense, allowed_modules_spec));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject literal_removal_candidate_hl_modules_for_predicate_with_sense_int(final SubLObject predicate, final SubLObject sense, final SubLObject allowed_modules_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = $memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_worker_removal.literal_removal_candidate_hl_modules_for_predicate_with_sense_int_internal(predicate, sense, allowed_modules_spec);
        }
        caching_state = memoization_state_lookup(v_memoization_state, inference_worker_removal.LITERAL_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE_WITH_SENSE_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = create_caching_state(memoization_state_lock(v_memoization_state), inference_worker_removal.LITERAL_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE_WITH_SENSE_INT, THREE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state_put(v_memoization_state, inference_worker_removal.LITERAL_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE_WITH_SENSE_INT, caching_state);
        }
        final SubLObject sxhash = sxhash_calc_3(predicate, sense, allowed_modules_spec);
        final SubLObject collisions = caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql($memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (predicate.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sense.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && allowed_modules_spec.eql(cached_args.first())) {
                            return caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_worker_removal.literal_removal_candidate_hl_modules_for_predicate_with_sense_int_internal(predicate, sense, allowed_modules_spec)));
        caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(predicate, sense, allowed_modules_spec));
        return caching_results(results3);
    }

    public static final SubLObject literal_meta_removal_candidate_hl_modules_alt(SubLObject asent, SubLObject sense) {
        if (sense == $NEG) {
            return NIL;
        }
        {
            SubLObject predicate = atomic_sentence_predicate(asent);
            if (NIL != forts.fort_p(predicate)) {
                return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.literal_meta_removal_candidate_hl_modules_for_predicate(predicate);
            } else {
                return meta_removal_module_list();
            }
        }
    }

    public static SubLObject literal_meta_removal_candidate_hl_modules(final SubLObject asent, final SubLObject sense) {
        if (sense == $NEG) {
            return NIL;
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (NIL != fort_p(predicate)) {
            return inference_worker_removal.literal_meta_removal_candidate_hl_modules_for_predicate(predicate);
        }
        return inference_modules.meta_removal_module_list();
    }

    public static final SubLObject literal_meta_removal_candidate_hl_modules_for_predicate_internal_alt(SubLObject predicate) {
        {
            SubLObject v_meta_removal_modules = NIL;
            SubLObject cdolist_list_var = meta_removal_modules();
            SubLObject meta_removal_module = NIL;
            for (meta_removal_module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , meta_removal_module = cdolist_list_var.first()) {
                if (NIL != predicate_uses_meta_removal_moduleP(predicate, meta_removal_module)) {
                    v_meta_removal_modules = cons(meta_removal_module, v_meta_removal_modules);
                }
            }
            return nreverse(v_meta_removal_modules);
        }
    }

    public static SubLObject literal_meta_removal_candidate_hl_modules_for_predicate_internal(final SubLObject predicate) {
        SubLObject v_meta_removal_modules = NIL;
        SubLObject cdolist_list_var = inference_modules.meta_removal_modules();
        SubLObject meta_removal_module = NIL;
        meta_removal_module = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_modules.predicate_uses_meta_removal_moduleP(predicate, meta_removal_module)) {
                v_meta_removal_modules = cons(meta_removal_module, v_meta_removal_modules);
            }
            cdolist_list_var = cdolist_list_var.rest();
            meta_removal_module = cdolist_list_var.first();
        } 
        return nreverse(v_meta_removal_modules);
    }

    public static final SubLObject literal_meta_removal_candidate_hl_modules_for_predicate_alt(SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.literal_meta_removal_candidate_hl_modules_for_predicate_internal(predicate);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, LITERAL_META_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), LITERAL_META_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, LITERAL_META_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, $kw72$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw72$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.literal_meta_removal_candidate_hl_modules_for_predicate_internal(predicate)));
                        memoization_state.caching_state_put(caching_state, predicate, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject literal_meta_removal_candidate_hl_modules_for_predicate(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = $memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_worker_removal.literal_meta_removal_candidate_hl_modules_for_predicate_internal(predicate);
        }
        caching_state = memoization_state_lookup(v_memoization_state, inference_worker_removal.LITERAL_META_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = create_caching_state(memoization_state_lock(v_memoization_state), inference_worker_removal.LITERAL_META_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state_put(v_memoization_state, inference_worker_removal.LITERAL_META_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE, caching_state);
        }
        SubLObject results = caching_state_lookup(caching_state, predicate, $memoized_item_not_found$.getGlobalValue());
        if (results.eql($memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(inference_worker_removal.literal_meta_removal_candidate_hl_modules_for_predicate_internal(predicate)));
            caching_state_put(caching_state, predicate, results, UNPROVIDED);
        }
        return caching_results(results);
    }

    public static final SubLObject literal_level_removal_tactic_p_alt(SubLObject tactic) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.removal_tactic_p(tactic)) && (NIL != inference_worker.literal_level_tactic_p(tactic)));
    }

    public static SubLObject literal_level_removal_tactic_p(final SubLObject tactic) {
        return makeBoolean((NIL != inference_worker_removal.removal_tactic_p(tactic)) && (NIL != inference_worker.literal_level_tactic_p(tactic)));
    }

    public static final SubLObject literal_level_meta_removal_tactic_p_alt(SubLObject tactic) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.meta_removal_tactic_p(tactic)) && (NIL != inference_worker.literal_level_tactic_p(tactic)));
    }

    public static SubLObject literal_level_meta_removal_tactic_p(final SubLObject tactic) {
        return makeBoolean((NIL != inference_worker_removal.meta_removal_tactic_p(tactic)) && (NIL != inference_worker.literal_level_tactic_p(tactic)));
    }

    public static final SubLObject new_removal_tactic_alt(SubLObject problem, SubLObject hl_module, SubLObject productivity, SubLObject completeness) {
        {
            SubLObject tactic = inference_datastructures_tactic.new_tactic(problem, hl_module, UNPROVIDED);
            inference_datastructures_tactic.set_tactic_productivity(tactic, productivity, UNPROVIDED);
            inference_datastructures_tactic.set_tactic_completeness(tactic, completeness);
            {
                SubLObject prob = problem;
                SubLObject store = inference_datastructures_problem.problem_store(prob);
                SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
                if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                    {
                        SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
                        SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
                        SubLObject inference = NIL;
                        while (NIL != id) {
                            inference = do_id_index_state_object(idx, $SKIP, id, state_var);
                            if (NIL != do_id_index_id_and_object_validP(id, inference, $SKIP)) {
                                if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference)) {
                                    {
                                        SubLObject inference_var = inference;
                                        SubLObject set_contents_var = set.do_set_internal(inference_strategy_set(inference_var));
                                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                        SubLObject state = NIL;
                                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                            {
                                                SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
                                                if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                                    inference_tactician.strategy_note_new_tactic(strategy, tactic);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            id = do_id_index_next_id(idx, NIL, id, state_var);
                            state_var = do_id_index_next_state(idx, NIL, id, state_var);
                        } 
                    }
                }
            }
            return tactic;
        }
    }

    public static SubLObject new_removal_tactic(final SubLObject problem, final SubLObject hl_module, final SubLObject productivity, final SubLObject completeness) {
        final SubLObject tactic = inference_datastructures_tactic.new_tactic(problem, hl_module, UNPROVIDED);
        inference_datastructures_tactic.set_tactic_productivity(tactic, productivity, UNPROVIDED);
        inference_datastructures_tactic.set_tactic_completeness(tactic, completeness);
        final SubLObject store = inference_datastructures_problem.problem_store(problem);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$27 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$27, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$27);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                SubLObject inference_var;
                SubLObject set_var;
                SubLObject set_contents_var;
                SubLObject basis_object;
                SubLObject state;
                SubLObject strategy;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    inference = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(inference)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = do_set_internal(set_var);
                            for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
                                strategy = do_set_contents_next(basis_object, state);
                                if (NIL != do_set_contents_element_validP(state, strategy)) {
                                    inference_tactician.strategy_note_new_tactic(strategy, tactic);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject idx_$28 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$28)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$28);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        inference2 = getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                            final SubLObject inference_var2 = inference2;
                            final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            final SubLObject set_contents_var2 = do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == do_set_contents_doneP(basis_object2, state2); state2 = do_set_contents_update_state(state2)) {
                                strategy2 = do_set_contents_next(basis_object2, state2);
                                if (NIL != do_set_contents_element_validP(state2, strategy2)) {
                                    inference_tactician.strategy_note_new_tactic(strategy2, tactic);
                                }
                            }
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return tactic;
    }

    public static final SubLObject compute_strategic_properties_of_removal_tactic_alt(SubLObject tactic, SubLObject strategy) {
        return tactic;
    }

    public static SubLObject compute_strategic_properties_of_removal_tactic(final SubLObject tactic, final SubLObject strategy) {
        return tactic;
    }

    public static final SubLObject with_removal_tactic_execution_assumptions_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt74);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject tactic = NIL;
                    SubLObject mt = NIL;
                    SubLObject sense = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt74);
                    tactic = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt74);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt74);
                    sense = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject tactic_var = $sym75$TACTIC_VAR;
                            return list(CLET, list(list(tactic_var, tactic)), list(WITH_INFERENCE_MT_RELEVANCE, mt, list(CLET, list(list($inference_expand_hl_module$, list(TACTIC_HL_MODULE, tactic_var)), list($inference_expand_sense$, sense)), listS(WITH_PROBLEM_STORE_REMOVAL_ASSUMPTIONS, list(TACTIC_STORE, tactic_var), append(body, NIL)))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt74);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject with_removal_tactic_execution_assumptions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, inference_worker_removal.$list85);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject tactic = NIL;
        SubLObject mt = NIL;
        SubLObject sense = NIL;
        destructuring_bind_must_consp(current, datum, inference_worker_removal.$list85);
        tactic = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, inference_worker_removal.$list85);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, inference_worker_removal.$list85);
        sense = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject tactic_var = inference_worker_removal.$sym86$TACTIC_VAR;
            return list(CLET, list(list(tactic_var, tactic)), list(WITH_INFERENCE_MT_RELEVANCE, mt, list(CLET, list(list(inference_worker_removal.$inference_expand_hl_module$, list(inference_worker_removal.TACTIC_HL_MODULE, tactic_var)), list(inference_worker_removal.$inference_expand_sense$, sense)), listS(inference_worker_removal.WITH_PROBLEM_STORE_REMOVAL_ASSUMPTIONS, list(inference_worker_removal.TACTIC_STORE, tactic_var), append(body, NIL)))));
        }
        cdestructuring_bind_error(datum, inference_worker_removal.$list85);
        return NIL;
    }

    public static final SubLObject execute_literal_level_removal_tactic_alt(SubLObject tactic, SubLObject mt, SubLObject asent, SubLObject sense) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tactic_var = tactic;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    SubLObject _prev_bind_3 = backward.$inference_expand_hl_module$.currentBinding(thread);
                    SubLObject _prev_bind_4 = backward.$inference_expand_sense$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        backward.$inference_expand_hl_module$.bind(inference_datastructures_tactic.tactic_hl_module(tactic_var), thread);
                        backward.$inference_expand_sense$.bind(sense, thread);
                        {
                            SubLObject store_var = inference_datastructures_tactic.tactic_store(tactic_var);
                            {
                                SubLObject _prev_bind_0_19 = $negation_by_failure$.currentBinding(thread);
                                try {
                                    $negation_by_failure$.bind(inference_datastructures_problem_store.problem_store_negation_by_failureP(store_var), thread);
                                    if (NIL != inference_datastructures_tactic.tactic_in_progressP(tactic)) {
                                        inference_datastructures_tactic.tactic_in_progress_next(tactic);
                                    } else {
                                        {
                                            SubLObject progress_iterator = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.maybe_make_removal_tactic_progress_iterator(tactic, asent, sense);
                                            if (NIL == progress_iterator) {
                                            } else {
                                                if (progress_iterator.isList()) {
                                                    {
                                                        SubLObject cdolist_list_var = progress_iterator;
                                                        SubLObject execution_result = NIL;
                                                        for (execution_result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , execution_result = cdolist_list_var.first()) {
                                                            com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.handle_one_removal_tactic_expand_result(tactic, execution_result);
                                                        }
                                                    }
                                                } else {
                                                    inference_datastructures_tactic.note_tactic_progress_iterator(tactic, progress_iterator);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    $negation_by_failure$.rebind(_prev_bind_0_19, thread);
                                }
                            }
                        }
                    } finally {
                        backward.$inference_expand_sense$.rebind(_prev_bind_4, thread);
                        backward.$inference_expand_hl_module$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return tactic;
        }
    }

    public static SubLObject execute_literal_level_removal_tactic(final SubLObject tactic, final SubLObject mt, final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = $mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $relevant_mts$.currentBinding(thread);
        final SubLObject _prev_bind_4 = com.cyc.cycjava.cycl.backward.$inference_expand_hl_module$.currentBinding(thread);
        final SubLObject _prev_bind_5 = com.cyc.cycjava.cycl.backward.$inference_expand_sense$.currentBinding(thread);
        try {
            $mt$.bind(update_inference_mt_relevance_mt(mt_var), thread);
            $relevant_mt_function$.bind(update_inference_mt_relevance_function(mt_var), thread);
            $relevant_mts$.bind(update_inference_mt_relevance_mt_list(mt_var), thread);
            com.cyc.cycjava.cycl.backward.$inference_expand_hl_module$.bind(inference_datastructures_tactic.tactic_hl_module(tactic), thread);
            com.cyc.cycjava.cycl.backward.$inference_expand_sense$.bind(sense, thread);
            final SubLObject store_var = inference_datastructures_tactic.tactic_store(tactic);
            final SubLObject _prev_bind_0_$29 = inference_worker_removal.$negation_by_failure$.currentBinding(thread);
            try {
                inference_worker_removal.$negation_by_failure$.bind(inference_datastructures_problem_store.problem_store_negation_by_failureP(store_var), thread);
                if (NIL != inference_datastructures_tactic.tactic_in_progressP(tactic)) {
                    inference_datastructures_tactic.tactic_in_progress_next(tactic);
                } else {
                    final SubLObject progress_iterator = inference_worker_removal.maybe_make_removal_tactic_progress_iterator(tactic, asent, sense);
                    if (NIL != progress_iterator) {
                        if (progress_iterator.isList()) {
                            SubLObject cdolist_list_var = progress_iterator;
                            SubLObject execution_result = NIL;
                            execution_result = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                inference_worker_removal.handle_one_removal_tactic_expand_result(tactic, execution_result);
                                cdolist_list_var = cdolist_list_var.rest();
                                execution_result = cdolist_list_var.first();
                            } 
                        } else {
                            inference_datastructures_tactic.note_tactic_progress_iterator(tactic, progress_iterator);
                        }
                    }
                }
            } finally {
                inference_worker_removal.$negation_by_failure$.rebind(_prev_bind_0_$29, thread);
            }
        } finally {
            com.cyc.cycjava.cycl.backward.$inference_expand_sense$.rebind(_prev_bind_5, thread);
            com.cyc.cycjava.cycl.backward.$inference_expand_hl_module$.rebind(_prev_bind_4, thread);
            $relevant_mts$.rebind(_prev_bind_3, thread);
            $relevant_mt_function$.rebind(_prev_bind_2, thread);
            $mt$.rebind(_prev_bind_0, thread);
        }
        return tactic;
    }

    public static final SubLObject maybe_make_removal_tactic_progress_iterator_alt(SubLObject tactic, SubLObject asent, SubLObject sense) {
        if (NIL != hl_module_output_generate_pattern(inference_datastructures_tactic.tactic_hl_module(tactic))) {
            return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.maybe_make_removal_tactic_output_generate_progress_iterator(tactic, asent);
        } else {
            return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.maybe_make_removal_tactic_expand_results_progress_iterator(tactic, asent, sense);
        }
    }

    public static SubLObject maybe_make_removal_tactic_progress_iterator(final SubLObject tactic, final SubLObject asent, final SubLObject sense) {
        if (NIL != inference_modules.hl_module_output_generate_pattern(inference_datastructures_tactic.tactic_hl_module(tactic))) {
            return inference_worker_removal.maybe_make_removal_tactic_output_generate_progress_iterator(tactic, asent);
        }
        return inference_worker_removal.maybe_make_removal_tactic_expand_results_progress_iterator(tactic, asent, sense);
    }

    public static final SubLObject maybe_make_removal_tactic_output_generate_progress_iterator_alt(SubLObject tactic, SubLObject cycl_input_asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
                thread.resetMultipleValues();
                {
                    SubLObject output_iterator = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.maybe_make_inference_output_iterator(hl_module, cycl_input_asent);
                    SubLObject encoded_bindings = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != output_iterator) {
                        inference_datastructures_tactic.possibly_update_tactic_productivity_from_iterator(tactic, output_iterator);
                        return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.new_removal_tactic_output_generate_progress_iterator(tactic, output_iterator, encoded_bindings);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject maybe_make_removal_tactic_output_generate_progress_iterator(final SubLObject tactic, final SubLObject cycl_input_asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
        thread.resetMultipleValues();
        final SubLObject output_iterator = inference_worker_removal.maybe_make_inference_output_iterator(hl_module, cycl_input_asent);
        final SubLObject encoded_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != output_iterator) {
            inference_datastructures_tactic.possibly_update_tactic_productivity_from_iterator(tactic, output_iterator);
            return inference_worker_removal.new_removal_tactic_output_generate_progress_iterator(tactic, output_iterator, encoded_bindings);
        }
        return NIL;
    }

    public static final SubLObject new_removal_tactic_output_generate_progress_iterator_alt(SubLObject tactic, SubLObject output_iterator, SubLObject encoded_bindings) {
        return inference_datastructures_tactic.new_tactic_progress_iterator($REMOVAL_OUTPUT_GENERATE, tactic, list(output_iterator, encoded_bindings));
    }

    public static SubLObject new_removal_tactic_output_generate_progress_iterator(final SubLObject tactic, final SubLObject output_iterator, final SubLObject encoded_bindings) {
        return inference_datastructures_tactic.new_tactic_progress_iterator(inference_worker_removal.$REMOVAL_OUTPUT_GENERATE, tactic, list(output_iterator, encoded_bindings));
    }

    public static final SubLObject handle_one_removal_tactic_output_generate_result_alt(SubLObject removal_tactic, SubLObject output_iterator, SubLObject encoded_bindings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(removal_tactic);
                SubLObject problem = inference_datastructures_tactic.tactic_problem(removal_tactic);
                SubLObject cycl_input_asent = inference_datastructures_problem.single_literal_problem_atomic_sentence(problem);
                thread.resetMultipleValues();
                {
                    SubLObject raw_output = iteration.iteration_next(output_iterator);
                    SubLObject validP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != validP) {
                        {
                            SubLObject _prev_bind_0 = backward.$removal_add_node_method$.currentBinding(thread);
                            try {
                                backward.$removal_add_node_method$.bind(HANDLE_REMOVAL_ADD_NODE_FOR_OUTPUT_GENERATE, thread);
                                inference_datastructures_tactic.decrement_tactic_productivity_for_number_of_children(removal_tactic, UNPROVIDED);
                                result = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.handle_one_output_generate_result(cycl_input_asent, hl_module, raw_output, encoded_bindings);
                            } finally {
                                backward.$removal_add_node_method$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject handle_one_removal_tactic_output_generate_result(final SubLObject removal_tactic, final SubLObject output_iterator, final SubLObject encoded_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(removal_tactic);
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(removal_tactic);
        final SubLObject cycl_input_asent = inference_datastructures_problem.single_literal_problem_atomic_sentence(problem);
        thread.resetMultipleValues();
        final SubLObject raw_output = iteration_next(output_iterator);
        final SubLObject validP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != validP) {
            final SubLObject _prev_bind_0 = $removal_add_node_method$.currentBinding(thread);
            try {
                $removal_add_node_method$.bind(inference_worker_removal.HANDLE_REMOVAL_ADD_NODE_FOR_OUTPUT_GENERATE, thread);
                inference_datastructures_tactic.decrement_tactic_productivity_for_number_of_children(removal_tactic, UNPROVIDED);
                result = inference_worker_removal.handle_one_output_generate_result(cycl_input_asent, hl_module, raw_output, encoded_bindings);
            } finally {
                $removal_add_node_method$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    /**
     *
     *
     * @return nil or removal-link-p
     * @param REMOVAL-BINDINGS;
     * 		current tactic's problem vars -> content
     */
    @LispMethod(comment = "@return nil or removal-link-p\r\n@param REMOVAL-BINDINGS;\r\n\t\tcurrent tactic\'s problem vars -> content")
    public static final SubLObject handle_removal_add_node_for_output_generate_alt(SubLObject removal_bindings, SubLObject supports) {
        removal_bindings = bindings.inference_simplify_unification_bindings(removal_bindings);
        {
            SubLObject removal_tactic = inference_worker.currently_executing_tactic();
            return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.handle_one_removal_tactic_result(removal_tactic, removal_bindings, supports);
        }
    }

    /**
     *
     *
     * @return nil or removal-link-p
     * @param REMOVAL-BINDINGS;
     * 		current tactic's problem vars -> content
     */
    @LispMethod(comment = "@return nil or removal-link-p\r\n@param REMOVAL-BINDINGS;\r\n\t\tcurrent tactic\'s problem vars -> content")
    public static SubLObject handle_removal_add_node_for_output_generate(SubLObject removal_bindings, final SubLObject supports) {
        removal_bindings = inference_simplify_unification_bindings(removal_bindings);
        final SubLObject removal_tactic = inference_worker.currently_executing_tactic();
        return inference_worker_removal.handle_one_removal_tactic_result(removal_tactic, removal_bindings, supports);
    }

    public static final SubLObject maybe_make_removal_tactic_expand_results_progress_iterator_alt(SubLObject tactic, SubLObject asent, SubLObject sense) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject expand_results = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.hl_module_guts($MAYBE_MAKE_REMOVAL_TACTIC_EXPAND_RESULTS_PROGRESS_ITERATOR, tactic, asent, sense, UNPROVIDED, UNPROVIDED);
                SubLObject new_productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(length(expand_results));
                inference_datastructures_tactic.update_tactic_productivity(tactic, new_productivity);
                if (NIL != list_utilities.lengthGE(expand_results, $removal_tactic_iteration_threshold$.getDynamicValue(thread), UNPROVIDED)) {
                    expand_results = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.new_removal_tactic_expand_results_progress_iterator(tactic, expand_results);
                }
                return expand_results;
            }
        }
    }

    public static SubLObject maybe_make_removal_tactic_expand_results_progress_iterator(final SubLObject tactic, final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject expand_results = inference_worker_removal.hl_module_guts(inference_worker_removal.$MAYBE_MAKE_REMOVAL_TACTIC_EXPAND_RESULTS_PROGRESS_ITERATOR, tactic, asent, sense, UNPROVIDED, UNPROVIDED);
        final SubLObject new_productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(length(expand_results));
        inference_datastructures_tactic.update_tactic_productivity(tactic, new_productivity);
        if (NIL != lengthGE(expand_results, inference_worker_removal.$removal_tactic_iteration_threshold$.getDynamicValue(thread), UNPROVIDED)) {
            expand_results = inference_worker_removal.new_removal_tactic_expand_results_progress_iterator(tactic, expand_results);
        }
        return expand_results;
    }

    public static final SubLObject maybe_make_removal_tactic_expand_results_progress_iterator_guts_alt(SubLObject tactic, SubLObject asent, SubLObject sense) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject expand_results = NIL;
                {
                    SubLObject _prev_bind_0 = $removal_tactic_expand_results_queue$.currentBinding(thread);
                    try {
                        $removal_tactic_expand_results_queue$.bind(NIL, thread);
                        {
                            SubLObject _prev_bind_0_20 = backward.$removal_add_node_method$.currentBinding(thread);
                            try {
                                backward.$removal_add_node_method$.bind(HANDLE_REMOVAL_ADD_NODE_FOR_EXPAND_RESULTS, thread);
                                {
                                    SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
                                    SubLObject pattern = hl_module_expand_pattern(hl_module);
                                    if (NIL != pattern) {
                                        formula_pattern_match.pattern_transform_formula(pattern, asent, UNPROVIDED);
                                    } else {
                                        {
                                            SubLObject function = hl_module_expand_func(hl_module);
                                            if (NIL != eval_in_api.possibly_cyc_api_function_spec_p(function)) {
                                                com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.removal_module_expand_func_funcall(function, asent, sense);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                backward.$removal_add_node_method$.rebind(_prev_bind_0_20, thread);
                            }
                        }
                        if (NIL != $removal_tactic_expand_results_queue$.getDynamicValue(thread)) {
                            expand_results = nreverse($removal_tactic_expand_results_queue$.getDynamicValue(thread));
                        }
                    } finally {
                        $removal_tactic_expand_results_queue$.rebind(_prev_bind_0, thread);
                    }
                }
                return expand_results;
            }
        }
    }

    public static SubLObject maybe_make_removal_tactic_expand_results_progress_iterator_guts(final SubLObject tactic, final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject expand_results = NIL;
        final SubLObject _prev_bind_0 = inference_worker_removal.$removal_tactic_expand_results_queue$.currentBinding(thread);
        try {
            inference_worker_removal.$removal_tactic_expand_results_queue$.bind(NIL, thread);
            final SubLObject _prev_bind_0_$30 = $removal_add_node_method$.currentBinding(thread);
            try {
                $removal_add_node_method$.bind(inference_worker_removal.HANDLE_REMOVAL_ADD_NODE_FOR_EXPAND_RESULTS, thread);
                final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
                final SubLObject pattern = inference_modules.hl_module_expand_pattern(hl_module);
                if (NIL != pattern) {
                    pattern_transform_formula(pattern, asent, UNPROVIDED);
                } else {
                    final SubLObject function = inference_modules.hl_module_expand_func(hl_module);
                    if (NIL != possibly_cyc_api_function_spec_p(function)) {
                        inference_worker_removal.removal_module_expand_func_funcall(function, asent, sense);
                    }
                }
            } finally {
                $removal_add_node_method$.rebind(_prev_bind_0_$30, thread);
            }
            if (NIL != inference_worker_removal.$removal_tactic_expand_results_queue$.getDynamicValue(thread)) {
                expand_results = nreverse(inference_worker_removal.$removal_tactic_expand_results_queue$.getDynamicValue(thread));
            }
        } finally {
            inference_worker_removal.$removal_tactic_expand_results_queue$.rebind(_prev_bind_0, thread);
        }
        return expand_results;
    }

    /**
     *
     *
     * @return nil or removal-link-p
     * @param REMOVAL-BINDINGS;
     * 		current tactic's problem vars -> content
     */
    @LispMethod(comment = "@return nil or removal-link-p\r\n@param REMOVAL-BINDINGS;\r\n\t\tcurrent tactic\'s problem vars -> content")
    public static final SubLObject handle_removal_add_node_for_expand_results_alt(SubLObject removal_bindings, SubLObject supports) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            removal_bindings = bindings.inference_simplify_unification_bindings(removal_bindings);
            $removal_tactic_expand_results_queue$.setDynamicValue(cons(list(removal_bindings, supports), $removal_tactic_expand_results_queue$.getDynamicValue(thread)), thread);
            return NIL;
        }
    }

    /**
     *
     *
     * @return nil or removal-link-p
     * @param REMOVAL-BINDINGS;
     * 		current tactic's problem vars -> content
     */
    @LispMethod(comment = "@return nil or removal-link-p\r\n@param REMOVAL-BINDINGS;\r\n\t\tcurrent tactic\'s problem vars -> content")
    public static SubLObject handle_removal_add_node_for_expand_results(SubLObject removal_bindings, final SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        removal_bindings = inference_simplify_unification_bindings(removal_bindings);
        inference_worker_removal.$removal_tactic_expand_results_queue$.setDynamicValue(cons(list(removal_bindings, supports), inference_worker_removal.$removal_tactic_expand_results_queue$.getDynamicValue(thread)), thread);
        return NIL;
    }

    public static final SubLObject new_removal_tactic_expand_results_progress_iterator_alt(SubLObject tactic, SubLObject expand_results) {
        return inference_datastructures_tactic.new_tactic_progress_iterator($REMOVAL_EXPAND, tactic, expand_results);
    }

    public static SubLObject new_removal_tactic_expand_results_progress_iterator(final SubLObject tactic, final SubLObject expand_results) {
        return inference_datastructures_tactic.new_tactic_progress_iterator($REMOVAL_EXPAND, tactic, expand_results);
    }

    public static final SubLObject handle_one_removal_tactic_expand_result_alt(SubLObject removal_tactic, SubLObject expand_result) {
        {
            SubLObject datum = expand_result;
            SubLObject current = datum;
            SubLObject removal_bindings = NIL;
            SubLObject supports = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt87);
            removal_bindings = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt87);
            supports = current.first();
            current = current.rest();
            if (NIL == current) {
                inference_datastructures_tactic.decrement_tactic_productivity_for_number_of_children(removal_tactic, UNPROVIDED);
                return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.handle_one_removal_tactic_result(removal_tactic, removal_bindings, supports);
            } else {
                cdestructuring_bind_error(datum, $list_alt87);
            }
        }
        return NIL;
    }

    public static SubLObject handle_one_removal_tactic_expand_result(final SubLObject removal_tactic, final SubLObject expand_result) {
        SubLObject removal_bindings = NIL;
        SubLObject supports = NIL;
        destructuring_bind_must_consp(expand_result, expand_result, inference_worker_removal.$list98);
        removal_bindings = expand_result.first();
        SubLObject current = expand_result.rest();
        destructuring_bind_must_consp(current, expand_result, inference_worker_removal.$list98);
        supports = current.first();
        current = current.rest();
        if (NIL == current) {
            inference_datastructures_tactic.decrement_tactic_productivity_for_number_of_children(removal_tactic, UNPROVIDED);
            return inference_worker_removal.handle_one_removal_tactic_result(removal_tactic, removal_bindings, supports);
        }
        cdestructuring_bind_error(expand_result, inference_worker_removal.$list98);
        return NIL;
    }

    public static final SubLObject handle_one_removal_tactic_result_alt(SubLObject removal_tactic, SubLObject removal_bindings, SubLObject supports) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject problem = inference_datastructures_tactic.tactic_problem(removal_tactic);
                SubLObject store = inference_datastructures_problem.problem_store(problem);
                SubLObject result = NIL;
                supports = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.possibly_replace_ist_supports(problem, removal_bindings, supports);
                if (NIL == variables.fully_bound_p(supports)) {
                    inference_warn($str_alt88$Ignoring_result_from__S_due_to_op, inference_datastructures_tactic.tactic_hl_module(removal_tactic), UNPROVIDED);
                } else {
                    thread.resetMultipleValues();
                    {
                        SubLObject mt = inference_datastructures_problem.mt_asent_sense_from_single_literal_problem(problem);
                        SubLObject asent = thread.secondMultipleValue();
                        SubLObject sense = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject tactic_var = removal_tactic;
                            SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                SubLObject _prev_bind_3 = backward.$inference_expand_hl_module$.currentBinding(thread);
                                SubLObject _prev_bind_4 = backward.$inference_expand_sense$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    backward.$inference_expand_hl_module$.bind(inference_datastructures_tactic.tactic_hl_module(tactic_var), thread);
                                    backward.$inference_expand_sense$.bind(sense, thread);
                                    {
                                        SubLObject store_var = inference_datastructures_tactic.tactic_store(tactic_var);
                                        {
                                            SubLObject _prev_bind_0_21 = $negation_by_failure$.currentBinding(thread);
                                            try {
                                                $negation_by_failure$.bind(inference_datastructures_problem_store.problem_store_negation_by_failureP(store_var), thread);
                                                if ((NIL != removal_bindings) && (NIL != inference_datastructures_problem_store.problem_store_add_restriction_layer_of_indirectionP(store))) {
                                                    result = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.maybe_new_restriction_and_removal_link(problem, removal_tactic, removal_bindings, supports);
                                                } else {
                                                    result = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.maybe_new_removal_link(problem, removal_tactic, removal_bindings, supports);
                                                }
                                            } finally {
                                                $negation_by_failure$.rebind(_prev_bind_0_21, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    backward.$inference_expand_sense$.rebind(_prev_bind_4, thread);
                                    backward.$inference_expand_hl_module$.rebind(_prev_bind_3, thread);
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject handle_one_removal_tactic_result(final SubLObject removal_tactic, final SubLObject removal_bindings, final SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(removal_tactic);
        final SubLObject store = inference_datastructures_problem.problem_store(problem);
        SubLObject result = NIL;
        if (NIL == fully_bound_p(supports)) {
            inference_warn(inference_worker_removal.$str99$Ignoring_result_from__S_due_to_op, inference_datastructures_tactic.tactic_hl_module(removal_tactic), UNPROVIDED);
        } else {
            thread.resetMultipleValues();
            final SubLObject mt = inference_datastructures_problem.mt_asent_sense_from_single_literal_problem(problem);
            final SubLObject asent = thread.secondMultipleValue();
            final SubLObject sense = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            final SubLObject mt_var = with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = $mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $relevant_mts$.currentBinding(thread);
            final SubLObject _prev_bind_4 = com.cyc.cycjava.cycl.backward.$inference_expand_hl_module$.currentBinding(thread);
            final SubLObject _prev_bind_5 = com.cyc.cycjava.cycl.backward.$inference_expand_sense$.currentBinding(thread);
            try {
                $mt$.bind(update_inference_mt_relevance_mt(mt_var), thread);
                $relevant_mt_function$.bind(update_inference_mt_relevance_function(mt_var), thread);
                $relevant_mts$.bind(update_inference_mt_relevance_mt_list(mt_var), thread);
                com.cyc.cycjava.cycl.backward.$inference_expand_hl_module$.bind(inference_datastructures_tactic.tactic_hl_module(removal_tactic), thread);
                com.cyc.cycjava.cycl.backward.$inference_expand_sense$.bind(sense, thread);
                final SubLObject store_var = inference_datastructures_tactic.tactic_store(removal_tactic);
                final SubLObject _prev_bind_0_$31 = inference_worker_removal.$negation_by_failure$.currentBinding(thread);
                try {
                    inference_worker_removal.$negation_by_failure$.bind(inference_datastructures_problem_store.problem_store_negation_by_failureP(store_var), thread);
                    if ((NIL != removal_bindings) && (NIL != inference_datastructures_problem_store.problem_store_add_restriction_layer_of_indirectionP(store))) {
                        result = inference_worker_removal.maybe_new_restriction_and_removal_link(problem, removal_tactic, removal_bindings, supports);
                    } else {
                        result = inference_worker_removal.maybe_new_removal_link(problem, removal_tactic, removal_bindings, supports);
                    }
                } finally {
                    inference_worker_removal.$negation_by_failure$.rebind(_prev_bind_0_$31, thread);
                }
            } finally {
                com.cyc.cycjava.cycl.backward.$inference_expand_sense$.rebind(_prev_bind_5, thread);
                com.cyc.cycjava.cycl.backward.$inference_expand_hl_module$.rebind(_prev_bind_4, thread);
                $relevant_mts$.rebind(_prev_bind_3, thread);
                $relevant_mt_function$.rebind(_prev_bind_2, thread);
                $mt$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    /**
     *
     *
     * @param REMOVAL-BINDINGS;
     * 		PROBLEM's vars -> content
     */
    @LispMethod(comment = "@param REMOVAL-BINDINGS;\r\n\t\tPROBLEM\'s vars -> content")
    public static final SubLObject maybe_new_restriction_and_removal_link_alt(SubLObject problem, SubLObject tactic, SubLObject removal_bindings, SubLObject supports) {
        {
            SubLObject restricted_mapped_problem = inference_worker_join_ordered.find_or_create_restricted_problem(problem, removal_bindings);
            com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.maybe_new_removal_link(inference_datastructures_problem_link.mapped_problem_problem(restricted_mapped_problem), tactic, NIL, supports);
            return inference_worker_restriction.maybe_new_restriction_link(problem, restricted_mapped_problem, removal_bindings, UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @param REMOVAL-BINDINGS;
     * 		PROBLEM's vars -> content
     */
    @LispMethod(comment = "@param REMOVAL-BINDINGS;\r\n\t\tPROBLEM\'s vars -> content")
    public static SubLObject maybe_new_restriction_and_removal_link(final SubLObject problem, final SubLObject tactic, final SubLObject removal_bindings, final SubLObject supports) {
        final SubLObject restricted_mapped_problem = inference_worker_join_ordered.find_or_create_restricted_problem(problem, removal_bindings);
        inference_worker_removal.maybe_new_removal_link(inference_datastructures_problem_link.mapped_problem_problem(restricted_mapped_problem), tactic, NIL, supports);
        return inference_worker_restriction.maybe_new_restriction_link(problem, restricted_mapped_problem, removal_bindings, NIL, tactic);
    }

    /**
     *
     *
     * @return nil or removal-link-p
    Creates a new removal link to goal iff it would be interesting to do so.
     */
    @LispMethod(comment = "@return nil or removal-link-p\r\nCreates a new removal link to goal iff it would be interesting to do so.")
    public static final SubLObject maybe_new_removal_link_alt(SubLObject problem, SubLObject tactic, SubLObject removal_bindings, SubLObject supports) {
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        {
            SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
            if (NIL == inference_datastructures_problem.tactically_good_problem_p(problem)) {
                return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.new_removal_link(problem, hl_module, removal_bindings, supports);
            } else {
                if ((NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.removal_tactic_p(tactic)) && (NIL == inference_datastructures_problem_store.problem_store_add_restriction_layer_of_indirectionP(inference_datastructures_problem.problem_store(problem)))) {
                    return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.new_removal_link(problem, hl_module, removal_bindings, supports);
                } else {
                    {
                        SubLObject existing_link = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.find_removal_link(problem, tactic, removal_bindings, supports);
                        if (NIL != inference_datastructures_problem_link.problem_link_p(existing_link)) {
                            return existing_link;
                        } else {
                            return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.new_removal_link(problem, hl_module, removal_bindings, supports);
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return nil or removal-link-p
    Creates a new removal link to goal iff it would be interesting to do so.
     */
    @LispMethod(comment = "@return nil or removal-link-p\r\nCreates a new removal link to goal iff it would be interesting to do so.")
    public static SubLObject maybe_new_removal_link(final SubLObject problem, final SubLObject tactic, final SubLObject removal_bindings, final SubLObject supports) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : "! inference_datastructures_problem.problem_p(problem) " + ("inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) ") + problem;
        final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
        if (NIL == inference_datastructures_problem.tactically_good_problem_p(problem)) {
            return inference_worker_removal.new_removal_link(problem, hl_module, removal_bindings, supports);
        }
        if ((NIL != inference_worker_removal.removal_tactic_p(tactic)) && (NIL == inference_datastructures_problem_store.problem_store_add_restriction_layer_of_indirectionP(inference_datastructures_problem.problem_store(problem)))) {
            return inference_worker_removal.new_removal_link(problem, hl_module, removal_bindings, supports);
        }
        final SubLObject existing_link = inference_worker_removal.find_removal_link(problem, tactic, removal_bindings, supports);
        if (NIL != inference_datastructures_problem_link.problem_link_p(existing_link)) {
            return existing_link;
        }
        return inference_worker_removal.new_removal_link(problem, hl_module, removal_bindings, supports);
    }

    public static final SubLObject find_removal_link_alt(SubLObject problem, SubLObject tactic, SubLObject v_bindings, SubLObject supports) {
        {
            SubLObject candidate_argument_links = inference_datastructures_problem.problem_argument_links_lookup(problem, v_bindings);
            if (NIL != candidate_argument_links) {
                {
                    SubLObject cdolist_list_var = candidate_argument_links;
                    SubLObject link = NIL;
                    for (link = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , link = cdolist_list_var.first()) {
                        if (((NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.removal_link_p(link)) && (tactic == com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.removal_link_tactic(link))) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.removal_link_data_equals_specP(link, v_bindings, supports))) {
                            return link;
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject find_removal_link(final SubLObject problem, final SubLObject tactic, final SubLObject v_bindings, final SubLObject supports) {
        final SubLObject candidate_argument_links = inference_datastructures_problem.problem_argument_links_lookup(problem, v_bindings);
        if (NIL != candidate_argument_links) {
            SubLObject cdolist_list_var = candidate_argument_links;
            SubLObject link = NIL;
            link = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (((NIL != inference_worker_removal.removal_link_p(link)) && tactic.eql(inference_worker_removal.removal_link_tactic(link))) && (NIL != inference_worker_removal.removal_link_data_equals_specP(link, v_bindings, supports))) {
                    return link;
                }
                cdolist_list_var = cdolist_list_var.rest();
                link = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static final SubLObject new_removal_proof_alt(SubLObject removal_link) {
        {
            SubLObject removal_bindings = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.removal_link_bindings(removal_link);
            return inference_worker.propose_new_proof_with_bindings(removal_link, removal_bindings, NIL);
        }
    }

    public static SubLObject new_removal_proof(final SubLObject removal_link) {
        final SubLObject removal_bindings = inference_worker_removal.removal_link_bindings(removal_link);
        return inference_worker.propose_new_proof_with_bindings(removal_link, removal_bindings, NIL);
    }

    public static final SubLObject execute_literal_level_meta_removal_tactic_alt(SubLObject tactic, SubLObject mt, SubLObject asent, SubLObject sense) {
        {
            SubLObject strategy = current_controlling_strategy();
            SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
            SubLObject removal_tactics = inference_datastructures_problem.problem_possible_removal_tactics(problem);
            removal_tactics = Sort.sort(removal_tactics, symbol_function($sym89$PRODUCTIVITY__), symbol_function(TACTIC_PRODUCTIVITY));
            {
                SubLObject cdolist_list_var = removal_tactics;
                SubLObject other_tactic = NIL;
                for (other_tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , other_tactic = cdolist_list_var.first()) {
                    if (!((tactic == other_tactic) || (NIL != inference_datastructures_tactic.abductive_tacticP(other_tactic)))) {
                        while (NIL != inference_datastructures_tactic.tactic_possibleP(other_tactic)) {
                            inference_tactician.strategy_execute_tactic(strategy, other_tactic);
                        } 
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject execute_literal_level_meta_removal_tactic(final SubLObject tactic, final SubLObject mt, final SubLObject asent, final SubLObject sense) {
        final SubLObject strategy = inference_macros.current_controlling_strategy();
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        SubLObject removal_tactics = inference_datastructures_problem.problem_possible_removal_tactics(problem);
        SubLObject cdolist_list_var;
        removal_tactics = cdolist_list_var = Sort.sort(removal_tactics, symbol_function(inference_worker_removal.$sym100$PRODUCTIVITY__), symbol_function(inference_worker_removal.TACTIC_PRODUCTIVITY));
        SubLObject other_tactic = NIL;
        other_tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((!tactic.eql(other_tactic)) && (NIL == inference_datastructures_tactic.abductive_tacticP(other_tactic))) {
                while (NIL != inference_datastructures_tactic.tactic_possibleP(other_tactic)) {
                    inference_tactician.strategy_execute_tactic(strategy, other_tactic);
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            other_tactic = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject inference_remove_check_default_alt(SubLObject cycl_input_asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject hl_module = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.inference_current_hl_module();
                thread.resetMultipleValues();
                {
                    SubLObject cycl_input = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.inference_input_extractor(hl_module, cycl_input_asent, NIL);
                    SubLObject extracted_bindings = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.inference_input_verifier(hl_module, cycl_input)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject raw_input = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.inference_input_encoder(hl_module, cycl_input, extracted_bindings);
                            SubLObject encoded_bindings = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.inference_output_checker(hl_module, raw_input, encoded_bindings)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject support = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.inference_support_constructor(hl_module, cycl_input_asent, encoded_bindings);
                                    SubLObject more_supports = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    backward.removal_add_node(support, NIL, more_supports);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject inference_remove_check_default(final SubLObject cycl_input_asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hl_module = inference_worker_removal.inference_current_hl_module();
        thread.resetMultipleValues();
        final SubLObject cycl_input = inference_worker_removal.inference_input_extractor(hl_module, cycl_input_asent, NIL);
        final SubLObject extracted_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != inference_worker_removal.inference_input_verifier(hl_module, cycl_input)) {
            thread.resetMultipleValues();
            final SubLObject raw_input = inference_worker_removal.inference_input_encoder(hl_module, cycl_input, extracted_bindings);
            final SubLObject encoded_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != inference_worker_removal.inference_output_checker(hl_module, raw_input, encoded_bindings)) {
                thread.resetMultipleValues();
                final SubLObject support = inference_worker_removal.inference_support_constructor(hl_module, cycl_input_asent, encoded_bindings);
                final SubLObject more_supports = thread.secondMultipleValue();
                thread.resetMultipleValues();
                removal_add_node(support, NIL, more_supports);
            }
        }
        return NIL;
    }

    public static final SubLObject do_all_legacy_inference_outputs_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt91);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject raw_output = NIL;
                    SubLObject raw_output_iterator = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt91);
                    raw_output = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt91);
                    raw_output_iterator = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject iterator = $sym92$ITERATOR;
                            return list(CLET, list(list(iterator, raw_output_iterator)), list(PIF, list(ITERATOR_P, iterator), list(CUNWIND_PROTECT, listS(DO_ITERATOR, list(raw_output, iterator), append(body, NIL)), list(ITERATION_FINALIZE, iterator)), listS(DO_LIST, list(raw_output, iterator), append(body, NIL))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt91);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_all_legacy_inference_outputs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, inference_worker_removal.$list102);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject raw_output = NIL;
        SubLObject raw_output_iterator = NIL;
        destructuring_bind_must_consp(current, datum, inference_worker_removal.$list102);
        raw_output = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, inference_worker_removal.$list102);
        raw_output_iterator = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject iterator = inference_worker_removal.$sym103$ITERATOR;
            return list(CLET, list(list(iterator, raw_output_iterator)), list(PIF, list(inference_worker_removal.ITERATOR_P, iterator), list(CUNWIND_PROTECT, listS(DO_ITERATOR, list(raw_output, iterator), append(body, NIL)), list(inference_worker_removal.ITERATION_FINALIZE, iterator)), listS(DO_LIST, list(raw_output, iterator), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, inference_worker_removal.$list102);
        return NIL;
    }

    public static final SubLObject inference_remove_unify_default_alt(SubLObject cycl_input_asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject hl_module = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.inference_current_hl_module();
                thread.resetMultipleValues();
                {
                    SubLObject output_iterator = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.maybe_make_inference_output_iterator(hl_module, cycl_input_asent);
                    SubLObject encoded_bindings = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != output_iterator) {
                        {
                            SubLObject iterator = output_iterator;
                            if (NIL != iteration.iterator_p(iterator)) {
                                try {
                                    {
                                        SubLObject done_var = NIL;
                                        while (NIL == done_var) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject raw_output = iteration.iteration_next(iterator);
                                                SubLObject valid = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if (NIL != valid) {
                                                    com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.handle_one_output_generate_result(cycl_input_asent, hl_module, raw_output, encoded_bindings);
                                                }
                                                done_var = makeBoolean(NIL == valid);
                                            }
                                        } 
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            iteration.iteration_finalize(iterator);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                            } else {
                                {
                                    SubLObject cdolist_list_var = iterator;
                                    SubLObject raw_output = NIL;
                                    for (raw_output = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , raw_output = cdolist_list_var.first()) {
                                        com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.handle_one_output_generate_result(cycl_input_asent, hl_module, raw_output, encoded_bindings);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject inference_remove_unify_default(final SubLObject cycl_input_asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hl_module = inference_worker_removal.inference_current_hl_module();
        thread.resetMultipleValues();
        final SubLObject output_iterator = inference_worker_removal.maybe_make_inference_output_iterator(hl_module, cycl_input_asent);
        final SubLObject encoded_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != output_iterator) {
            final SubLObject iterator = output_iterator;
            if (NIL != iterator_p(iterator)) {
                try {
                    SubLObject valid;
                    for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                        thread.resetMultipleValues();
                        final SubLObject raw_output = iteration_next(iterator);
                        valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            inference_worker_removal.handle_one_output_generate_result(cycl_input_asent, hl_module, raw_output, encoded_bindings);
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        iteration_finalize(iterator);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
            } else {
                SubLObject cdolist_list_var = iterator;
                SubLObject raw_output = NIL;
                raw_output = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    inference_worker_removal.handle_one_output_generate_result(cycl_input_asent, hl_module, raw_output, encoded_bindings);
                    cdolist_list_var = cdolist_list_var.rest();
                    raw_output = cdolist_list_var.first();
                } 
            }
        }
        return NIL;
    }

    public static final SubLObject maybe_make_inference_output_iterator_alt(SubLObject hl_module, SubLObject cycl_input_asent) {
        return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.hl_module_guts($MAYBE_MAKE_INFERENCE_OUTPUT_ITERATOR, hl_module, cycl_input_asent, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject maybe_make_inference_output_iterator(final SubLObject hl_module, final SubLObject cycl_input_asent) {
        return inference_worker_removal.hl_module_guts(inference_worker_removal.$MAYBE_MAKE_INFERENCE_OUTPUT_ITERATOR, hl_module, cycl_input_asent, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject maybe_make_inference_output_iterator_guts_alt(SubLObject hl_module, SubLObject cycl_input_asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject cycl_input = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.inference_input_extractor(hl_module, cycl_input_asent, NIL);
                SubLObject extracted_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.inference_input_verifier(hl_module, cycl_input)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject raw_input = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.inference_input_encoder(hl_module, cycl_input, extracted_bindings);
                        SubLObject encoded_bindings = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject output_iterator = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.inference_output_generator(hl_module, raw_input, encoded_bindings);
                            return values(output_iterator, encoded_bindings);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject maybe_make_inference_output_iterator_guts(final SubLObject hl_module, final SubLObject cycl_input_asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject cycl_input = inference_worker_removal.inference_input_extractor(hl_module, cycl_input_asent, NIL);
        final SubLObject extracted_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != inference_worker_removal.inference_input_verifier(hl_module, cycl_input)) {
            thread.resetMultipleValues();
            final SubLObject raw_input = inference_worker_removal.inference_input_encoder(hl_module, cycl_input, extracted_bindings);
            final SubLObject encoded_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject output_iterator = inference_worker_removal.inference_output_generator(hl_module, raw_input, encoded_bindings);
            return subl_promotions.values2(output_iterator, encoded_bindings);
        }
        return NIL;
    }

    public static final SubLObject handle_one_output_generate_result_alt(SubLObject cycl_input_asent, SubLObject hl_module, SubLObject raw_output, SubLObject encoded_bindings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject successP = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.hl_module_guts($HANDLE_ONE_OUTPUT_GENERATE_RESULT, cycl_input_asent, hl_module, raw_output, encoded_bindings, UNPROVIDED);
                SubLObject support = thread.secondMultipleValue();
                SubLObject unify_bindings = thread.thirdMultipleValue();
                SubLObject more_supports = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                if (NIL != successP) {
                    return backward.removal_add_node(support, unify_bindings, more_supports);
                }
            }
            return NIL;
        }
    }

    public static SubLObject handle_one_output_generate_result(final SubLObject cycl_input_asent, final SubLObject hl_module, final SubLObject raw_output, final SubLObject encoded_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject successP = inference_worker_removal.hl_module_guts(inference_worker_removal.$HANDLE_ONE_OUTPUT_GENERATE_RESULT, cycl_input_asent, hl_module, raw_output, encoded_bindings, UNPROVIDED);
        final SubLObject support = thread.secondMultipleValue();
        final SubLObject unify_bindings = thread.thirdMultipleValue();
        final SubLObject more_supports = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != successP) {
            return removal_add_node(support, unify_bindings, more_supports);
        }
        return NIL;
    }

    public static final SubLObject handle_one_output_generate_result_guts_alt(SubLObject cycl_input_asent, SubLObject hl_module, SubLObject raw_output, SubLObject encoded_bindings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject cycl_output = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.inference_output_decoder(hl_module, raw_output, encoded_bindings);
                SubLObject decoded_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.inference_output_verifier(hl_module, cycl_output)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject cycl_output_asent = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.inference_output_constructor(hl_module, cycl_output, decoded_bindings);
                        SubLObject constructed_bindings = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        thread.resetMultipleValues();
                        {
                            SubLObject unify_bindings = unification_utilities.term_unify(cycl_input_asent, cycl_output_asent, T, T);
                            SubLObject unify_justification = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != unify_bindings) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject support = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.inference_support_constructor(hl_module, cycl_output_asent, constructed_bindings);
                                    SubLObject more_supports = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    return values(T, support, unify_bindings, append(more_supports, unify_justification));
                                }
                            }
                        }
                    }
                }
            }
            return values(NIL, NIL, NIL, NIL);
        }
    }

    public static SubLObject handle_one_output_generate_result_guts(final SubLObject cycl_input_asent, final SubLObject hl_module, final SubLObject raw_output, final SubLObject encoded_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject cycl_output = inference_worker_removal.inference_output_decoder(hl_module, raw_output, encoded_bindings);
        final SubLObject decoded_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != inference_worker_removal.inference_output_verifier(hl_module, cycl_output)) {
            thread.resetMultipleValues();
            final SubLObject cycl_output_asent = inference_worker_removal.inference_output_constructor(hl_module, cycl_output, decoded_bindings);
            final SubLObject constructed_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject unify_bindings = term_unify(cycl_input_asent, cycl_output_asent, T, T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != unify_bindings) {
                thread.resetMultipleValues();
                final SubLObject support = inference_worker_removal.inference_support_constructor(hl_module, cycl_output_asent, constructed_bindings);
                final SubLObject more_supports = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return subl_promotions.values4(T, support, unify_bindings, append(more_supports, unify_justification));
            }
        }
        return subl_promotions.values4(NIL, NIL, NIL, NIL);
    }

    /**
     *
     *
     * @unknown If this is ever used outside of an expand function, we will need something more general.
     */
    @LispMethod(comment = "@unknown If this is ever used outside of an expand function, we will need something more general.")
    public static final SubLObject inference_current_hl_module_alt() {
        return backward.inference_expand_hl_module();
    }

    /**
     *
     *
     * @unknown If this is ever used outside of an expand function, we will need something more general.
     */
    @LispMethod(comment = "@unknown If this is ever used outside of an expand function, we will need something more general.")
    public static SubLObject inference_current_hl_module() {
        return inference_expand_hl_module();
    }

    /**
     *
     *
     * @unknown If this is ever used outside of an expand function, we will need something more general.
     */
    @LispMethod(comment = "@unknown If this is ever used outside of an expand function, we will need something more general.")
    public static final SubLObject inference_current_sense_alt() {
        return backward.inference_expand_sense();
    }

    /**
     *
     *
     * @unknown If this is ever used outside of an expand function, we will need something more general.
     */
    @LispMethod(comment = "@unknown If this is ever used outside of an expand function, we will need something more general.")
    public static SubLObject inference_current_sense() {
        return inference_expand_sense();
    }

    public static final SubLObject inference_input_extractor_alt(SubLObject hl_module, SubLObject cycl_input_asent, SubLObject v_bindings) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        {
            SubLObject pattern = hl_module_input_extract_pattern(hl_module);
            return formula_pattern_match.pattern_transform_formula(pattern, cycl_input_asent, v_bindings);
        }
    }

    public static SubLObject inference_input_extractor(final SubLObject hl_module, final SubLObject cycl_input_asent, SubLObject v_bindings) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        final SubLObject pattern = inference_modules.hl_module_input_extract_pattern(hl_module);
        return pattern_transform_formula(pattern, cycl_input_asent, v_bindings);
    }

    public static final SubLObject inference_input_verifier_alt(SubLObject hl_module, SubLObject cycl_input) {
        {
            SubLObject pattern = hl_module_input_verify_pattern(hl_module);
            return formula_pattern_match.pattern_matches_formula_without_bindings(pattern, cycl_input);
        }
    }

    public static SubLObject inference_input_verifier(final SubLObject hl_module, final SubLObject cycl_input) {
        final SubLObject pattern = inference_modules.hl_module_input_verify_pattern(hl_module);
        return pattern_matches_formula_without_bindings(pattern, cycl_input);
    }

    public static final SubLObject inference_input_encoder_alt(SubLObject hl_module, SubLObject cycl_input, SubLObject v_bindings) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        {
            SubLObject pattern = hl_module_input_encode_pattern(hl_module);
            return pattern_match.pattern_transform_tree(pattern, cycl_input, v_bindings);
        }
    }

    public static SubLObject inference_input_encoder(final SubLObject hl_module, final SubLObject cycl_input, SubLObject v_bindings) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        final SubLObject pattern = inference_modules.hl_module_input_encode_pattern(hl_module);
        return pattern_transform_tree(pattern, cycl_input, v_bindings);
    }

    public static final SubLObject inference_output_checker_alt(SubLObject hl_module, SubLObject raw_input, SubLObject v_bindings) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        {
            SubLObject pattern = hl_module_output_check_pattern(hl_module);
            if (NIL == pattern) {
                return NIL;
            }
            {
                SubLObject output = pattern_match.pattern_transform_tree(pattern, raw_input, v_bindings);
                return list_utilities.sublisp_boolean(output);
            }
        }
    }

    public static SubLObject inference_output_checker(final SubLObject hl_module, final SubLObject raw_input, SubLObject v_bindings) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        final SubLObject pattern = inference_modules.hl_module_output_check_pattern(hl_module);
        if (NIL == pattern) {
            return NIL;
        }
        final SubLObject output = pattern_transform_tree(pattern, raw_input, v_bindings);
        return sublisp_boolean(output);
    }

    public static final SubLObject inference_output_generator_alt(SubLObject hl_module, SubLObject raw_input, SubLObject v_bindings) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        {
            SubLObject pattern = hl_module_output_generate_pattern(hl_module);
            if (NIL == pattern) {
                return NIL;
            }
            {
                SubLObject output = pattern_match.pattern_transform_tree(pattern, raw_input, v_bindings);
                if (NIL != iteration.iterator_p(output)) {
                    return output;
                } else {
                    if (output.isList()) {
                        return iteration.new_list_iterator(output);
                    } else {
                        return NIL;
                    }
                }
            }
        }
    }

    public static SubLObject inference_output_generator(final SubLObject hl_module, final SubLObject raw_input, SubLObject v_bindings) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        final SubLObject pattern = inference_modules.hl_module_output_generate_pattern(hl_module);
        if (NIL == pattern) {
            return NIL;
        }
        final SubLObject output = pattern_transform_tree(pattern, raw_input, v_bindings);
        if (NIL != iterator_p(output)) {
            return output;
        }
        if (output.isList()) {
            return new_list_iterator(output);
        }
        return NIL;
    }

    public static final SubLObject inference_output_decoder_alt(SubLObject hl_module, SubLObject raw_output, SubLObject v_bindings) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        {
            SubLObject pattern = hl_module_output_decode_pattern(hl_module);
            return pattern_match.pattern_transform_tree(pattern, raw_output, v_bindings);
        }
    }

    public static SubLObject inference_output_decoder(final SubLObject hl_module, final SubLObject raw_output, SubLObject v_bindings) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        final SubLObject pattern = inference_modules.hl_module_output_decode_pattern(hl_module);
        return pattern_transform_tree(pattern, raw_output, v_bindings);
    }

    public static final SubLObject inference_output_verifier_alt(SubLObject hl_module, SubLObject cycl_output) {
        {
            SubLObject pattern = hl_module_output_verify_pattern(hl_module);
            return formula_pattern_match.pattern_matches_formula_without_bindings(pattern, cycl_output);
        }
    }

    public static SubLObject inference_output_verifier(final SubLObject hl_module, final SubLObject cycl_output) {
        final SubLObject pattern = inference_modules.hl_module_output_verify_pattern(hl_module);
        return pattern_matches_formula_without_bindings(pattern, cycl_output);
    }

    public static final SubLObject inference_output_constructor_alt(SubLObject hl_module, SubLObject cycl_output, SubLObject v_bindings) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        {
            SubLObject pattern = hl_module_output_construct_pattern(hl_module);
            return pattern_match.pattern_transform_tree(pattern, cycl_output, v_bindings);
        }
    }

    public static SubLObject inference_output_constructor(final SubLObject hl_module, final SubLObject cycl_output, SubLObject v_bindings) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        final SubLObject pattern = inference_modules.hl_module_output_construct_pattern(hl_module);
        return pattern_transform_tree(pattern, cycl_output, v_bindings);
    }

    public static final SubLObject inference_support_constructor_alt(SubLObject hl_module, SubLObject cycl_output_asent, SubLObject v_bindings) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject support_sense = com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.inference_current_sense();
                SubLObject support_sentence = asent_and_sense_to_literal(cycl_output_asent, support_sense);
                SubLObject support_mt = hl_module_support_mt_result(hl_module);
                SubLObject pattern = hl_module_support_pattern(hl_module);
                if (NIL != pattern) {
                    {
                        SubLObject datum = formula_pattern_match.pattern_transform_formula(pattern, cycl_output_asent, v_bindings);
                        SubLObject current = datum;
                        SubLObject support = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt101);
                        current = current.rest();
                        {
                            SubLObject more_supports = current;
                            return values(support, more_supports);
                        }
                    }
                }
                {
                    SubLObject support_func = hl_module_support_func(hl_module);
                    if (NIL != eval_in_api.possibly_cyc_api_function_spec_p(support_func)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject support = eval_in_api.possibly_cyc_api_funcall_2(support_func, support_sentence, support_mt);
                            SubLObject more_supports = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            return values(support, more_supports);
                        }
                    }
                }
                {
                    SubLObject support_module = hl_module_support_module(hl_module);
                    SubLObject support_strength = hl_module_support_strength(hl_module);
                    SubLObject support_tv = enumeration_types.tv_from_truth_strength($TRUE, support_strength);
                    SubLObject support = make_hl_support(support_module, support_sentence, support_mt, support_tv);
                    SubLObject more_supports = NIL;
                    return values(support, more_supports);
                }
            }
        }
    }

    public static SubLObject inference_support_constructor(final SubLObject hl_module, final SubLObject cycl_output_asent, SubLObject v_bindings) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject support_sense = inference_worker_removal.inference_current_sense();
        final SubLObject support_sentence = asent_and_sense_to_literal(cycl_output_asent, support_sense);
        final SubLObject support_mt = inference_modules.hl_module_support_mt_result(hl_module);
        final SubLObject pattern = inference_modules.hl_module_support_pattern(hl_module);
        if (NIL != pattern) {
            SubLObject current;
            final SubLObject datum = current = pattern_transform_formula(pattern, cycl_output_asent, v_bindings);
            final SubLObject support = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, inference_worker_removal.$list112);
            final SubLObject more_supports;
            current = more_supports = current.rest();
            return subl_promotions.values2(support, more_supports);
        }
        final SubLObject support_func = inference_modules.hl_module_support_func(hl_module);
        if (NIL != possibly_cyc_api_function_spec_p(support_func)) {
            thread.resetMultipleValues();
            final SubLObject support2 = possibly_cyc_api_funcall_2(support_func, support_sentence, support_mt);
            final SubLObject more_supports2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return subl_promotions.values2(support2, more_supports2);
        }
        final SubLObject support_module = inference_modules.hl_module_support_module(hl_module);
        final SubLObject support_strength = inference_modules.hl_module_support_strength(hl_module);
        final SubLObject support_tv = tv_from_truth_strength($TRUE, support_strength);
        final SubLObject support3 = arguments.make_hl_support(support_module, support_sentence, support_mt, support_tv);
        final SubLObject more_supports3 = NIL;
        return subl_promotions.values2(support3, more_supports3);
    }

    public static final SubLObject hl_module_guts_alt(SubLObject type, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        {
            SubLObject pcase_var = type;
            if (pcase_var.eql($DETERMINE_NEW_REMOVAL_TACTIC_SPECS_FROM_HL_MODULES)) {
                return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.determine_new_removal_tactic_specs_from_hl_modules_guts(arg1, arg2, arg3);
            } else {
                if (pcase_var.eql($MAYBE_MAKE_REMOVAL_TACTIC_EXPAND_RESULTS_PROGRESS_ITERATOR)) {
                    return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.maybe_make_removal_tactic_expand_results_progress_iterator_guts(arg1, arg2, arg3);
                } else {
                    if (pcase_var.eql($HANDLE_ONE_OUTPUT_GENERATE_RESULT)) {
                        return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.handle_one_output_generate_result_guts(arg1, arg2, arg3, arg4);
                    } else {
                        if (pcase_var.eql($MAYBE_MAKE_INFERENCE_OUTPUT_ITERATOR)) {
                            return com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.maybe_make_inference_output_iterator_guts(arg1, arg2);
                        } else {
                            Errors.error($str_alt103$unknown_thing_to_do_in_the_HL_mod, type);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject hl_module_guts(final SubLObject type, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        if (type.eql(inference_worker_removal.$DETERMINE_NEW_REMOVAL_TACTIC_SPECS_FROM_HL_MODULES)) {
            return inference_worker_removal.determine_new_removal_tactic_specs_from_hl_modules_guts(arg1, arg2, arg3);
        }
        if (type.eql(inference_worker_removal.$MAYBE_MAKE_REMOVAL_TACTIC_EXPAND_RESULTS_PROGRESS_ITERATOR)) {
            return inference_worker_removal.maybe_make_removal_tactic_expand_results_progress_iterator_guts(arg1, arg2, arg3);
        }
        if (type.eql(inference_worker_removal.$HANDLE_ONE_OUTPUT_GENERATE_RESULT)) {
            return inference_worker_removal.handle_one_output_generate_result_guts(arg1, arg2, arg3, arg4);
        }
        if (type.eql(inference_worker_removal.$MAYBE_MAKE_INFERENCE_OUTPUT_ITERATOR)) {
            return inference_worker_removal.maybe_make_inference_output_iterator_guts(arg1, arg2);
        }
        Errors.error(inference_worker_removal.$str114$unknown_thing_to_do_in_the_HL_mod, type);
        return NIL;
    }

    public static final SubLObject declare_inference_worker_removal_file_alt() {
        declareFunction("removal_link_data_print_function_trampoline", "REMOVAL-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("removal_link_data_p", "REMOVAL-LINK-DATA-P", 1, 0, false);
        new com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.$removal_link_data_p$UnaryFunction();
        declareFunction("remov_link_data_hl_module", "REMOV-LINK-DATA-HL-MODULE", 1, 0, false);
        declareFunction("remov_link_data_bindings", "REMOV-LINK-DATA-BINDINGS", 1, 0, false);
        declareFunction("remov_link_data_supports", "REMOV-LINK-DATA-SUPPORTS", 1, 0, false);
        declareFunction("_csetf_remov_link_data_hl_module", "_CSETF-REMOV-LINK-DATA-HL-MODULE", 2, 0, false);
        declareFunction("_csetf_remov_link_data_bindings", "_CSETF-REMOV-LINK-DATA-BINDINGS", 2, 0, false);
        declareFunction("_csetf_remov_link_data_supports", "_CSETF-REMOV-LINK-DATA-SUPPORTS", 2, 0, false);
        declareFunction("make_removal_link_data", "MAKE-REMOVAL-LINK-DATA", 0, 1, false);
        declareFunction("new_removal_link", "NEW-REMOVAL-LINK", 4, 0, false);
        declareFunction("new_removal_link_int", "NEW-REMOVAL-LINK-INT", 4, 0, false);
        declareFunction("new_removal_link_data", "NEW-REMOVAL-LINK-DATA", 1, 0, false);
        declareFunction("destroy_removal_link", "DESTROY-REMOVAL-LINK", 1, 0, false);
        declareFunction("removal_link_hl_module", "REMOVAL-LINK-HL-MODULE", 1, 0, false);
        declareFunction("removal_link_bindings", "REMOVAL-LINK-BINDINGS", 1, 0, false);
        declareFunction("removal_link_supports", "REMOVAL-LINK-SUPPORTS", 1, 0, false);
        declareFunction("set_removal_link_hl_module", "SET-REMOVAL-LINK-HL-MODULE", 2, 0, false);
        declareFunction("set_removal_link_bindings", "SET-REMOVAL-LINK-BINDINGS", 2, 0, false);
        declareFunction("set_removal_link_supports", "SET-REMOVAL-LINK-SUPPORTS", 2, 0, false);
        declareFunction("removal_link_tactic", "REMOVAL-LINK-TACTIC", 1, 0, false);
        declareFunction("removal_link_data_equals_specP", "REMOVAL-LINK-DATA-EQUALS-SPEC?", 3, 0, false);
        declareFunction("generalized_removal_tactic_p", "GENERALIZED-REMOVAL-TACTIC-P", 1, 0, false);
        declareFunction("conjunctive_removal_tactic_p", "CONJUNCTIVE-REMOVAL-TACTIC-P", 1, 0, false);
        declareFunction("conjunctive_removal_link_p", "CONJUNCTIVE-REMOVAL-LINK-P", 1, 0, false);
        declareFunction("conjunctive_removal_proof_p", "CONJUNCTIVE-REMOVAL-PROOF-P", 1, 0, false);
        declareFunction("determine_new_conjunctive_removal_tactics", "DETERMINE-NEW-CONJUNCTIVE-REMOVAL-TACTICS", 2, 0, false);
        declareFunction("sort_applicable_conjunctive_removal_modules_by_priority", "SORT-APPLICABLE-CONJUNCTIVE-REMOVAL-MODULES-BY-PRIORITY", 1, 0, false);
        declareFunction("conjunctive_removal_module_priorityL", "CONJUNCTIVE-REMOVAL-MODULE-PRIORITY<", 2, 0, false);
        declareFunction("determine_applicable_conjunctive_removal_modules", "DETERMINE-APPLICABLE-CONJUNCTIVE-REMOVAL-MODULES", 1, 0, false);
        declareFunction("motivated_multi_literal_subclause_specs", "MOTIVATED-MULTI-LITERAL-SUBCLAUSE-SPECS", 1, 0, false);
        declareFunction("hl_module_applicable_subclause_specs", "HL-MODULE-APPLICABLE-SUBCLAUSE-SPECS", 2, 0, false);
        declareFunction("new_conjunctive_removal_tactic", "NEW-CONJUNCTIVE-REMOVAL-TACTIC", 4, 0, false);
        declareFunction("compute_strategic_properties_of_conjunctive_removal_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-CONJUNCTIVE-REMOVAL-TACTIC", 2, 0, false);
        declareFunction("execute_conjunctive_removal_tactic", "EXECUTE-CONJUNCTIVE-REMOVAL-TACTIC", 1, 0, false);
        declareFunction("maybe_make_conjunctive_removal_tactic_progress_iterator", "MAYBE-MAKE-CONJUNCTIVE-REMOVAL-TACTIC-PROGRESS-ITERATOR", 1, 0, false);
        declareFunction("maybe_make_conjunctive_removal_tactic_progress_expand_iterative_iterator", "MAYBE-MAKE-CONJUNCTIVE-REMOVAL-TACTIC-PROGRESS-EXPAND-ITERATIVE-ITERATOR", 1, 0, false);
        declareFunction("new_conjunctive_removal_tactic_progress_expand_iterative_iterator", "NEW-CONJUNCTIVE-REMOVAL-TACTIC-PROGRESS-EXPAND-ITERATIVE-ITERATOR", 2, 0, false);
        declareFunction("handle_one_conjunctive_removal_tactic_expand_iterative_result", "HANDLE-ONE-CONJUNCTIVE-REMOVAL-TACTIC-EXPAND-ITERATIVE-RESULT", 2, 0, false);
        declareFunction("maybe_make_conjunctive_removal_tactic_progress_expand_iterator", "MAYBE-MAKE-CONJUNCTIVE-REMOVAL-TACTIC-PROGRESS-EXPAND-ITERATOR", 1, 0, false);
        declareFunction("new_conjunctive_removal_tactic_progress_expand_iterator", "NEW-CONJUNCTIVE-REMOVAL-TACTIC-PROGRESS-EXPAND-ITERATOR", 2, 0, false);
        declareFunction("conjunctive_removal_callback", "CONJUNCTIVE-REMOVAL-CALLBACK", 2, 0, false);
        declareFunction("handle_one_conjunctive_removal_tactic_expand_result", "HANDLE-ONE-CONJUNCTIVE-REMOVAL-TACTIC-EXPAND-RESULT", 2, 0, false);
        declareFunction("handle_one_conjunctive_removal_tactic_result", "HANDLE-ONE-CONJUNCTIVE-REMOVAL-TACTIC-RESULT", 3, 0, false);
        declareFunction("maybe_new_simplification_link", "MAYBE-NEW-SIMPLIFICATION-LINK", 3, 0, false);
        declareFunction("maybe_new_restriction_split_and_removal_links", "MAYBE-NEW-RESTRICTION-SPLIT-AND-REMOVAL-LINKS", 4, 0, false);
        declareFunction("reorder_conjunctive_removal_justifications", "REORDER-CONJUNCTIVE-REMOVAL-JUSTIFICATIONS", 4, 0, false);
        declareFunction("maybe_new_split_and_removal_links", "MAYBE-NEW-SPLIT-AND-REMOVAL-LINKS", 3, 0, false);
        declareFunction("maybe_new_removal_link_for_split_link", "MAYBE-NEW-REMOVAL-LINK-FOR-SPLIT-LINK", 5, 0, false);
        declareMacro("with_problem_store_removal_assumptions", "WITH-PROBLEM-STORE-REMOVAL-ASSUMPTIONS");
        declareFunction("meta_removal_tactic_p", "META-REMOVAL-TACTIC-P", 1, 0, false);
        declareFunction("compute_strategic_properties_of_meta_removal_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-META-REMOVAL-TACTIC", 2, 0, false);
        declareFunction("removal_link_p", "REMOVAL-LINK-P", 1, 0, false);
        declareFunction("removal_tactic_p", "REMOVAL-TACTIC-P", 1, 0, false);
        declareFunction("removal_proof_p", "REMOVAL-PROOF-P", 1, 0, false);
        declareFunction("removal_module_exclusive_func_funcall", "REMOVAL-MODULE-EXCLUSIVE-FUNC-FUNCALL", 3, 0, false);
        declareFunction("removal_module_required_func_funcall", "REMOVAL-MODULE-REQUIRED-FUNC-FUNCALL", 3, 0, false);
        declareFunction("removal_module_expand_func_funcall", "REMOVAL-MODULE-EXPAND-FUNC-FUNCALL", 3, 0, false);
        declareFunction("determine_new_literal_removal_tactics", "DETERMINE-NEW-LITERAL-REMOVAL-TACTICS", 3, 0, false);
        declareFunction("determine_new_literal_meta_removal_tactics", "DETERMINE-NEW-LITERAL-META-REMOVAL-TACTICS", 3, 0, false);
        declareFunction("determine_new_literal_simple_removal_tactics", "DETERMINE-NEW-LITERAL-SIMPLE-REMOVAL-TACTICS", 3, 0, false);
        declareFunction("literal_removal_options", "LITERAL-REMOVAL-OPTIONS", 2, 1, false);
        declareFunction("literal_removal_options_hl_modules", "LITERAL-REMOVAL-OPTIONS-HL-MODULES", 3, 0, false);
        declareFunction("filter_modules_wrt_allowed_modules_spec", "FILTER-MODULES-WRT-ALLOWED-MODULES-SPEC", 2, 0, false);
        declareFunction("literal_removal_options_candidate_hl_modules", "LITERAL-REMOVAL-OPTIONS-CANDIDATE-HL-MODULES", 3, 0, false);
        declareFunction("hl_module_applicable_to_asentP", "HL-MODULE-APPLICABLE-TO-ASENT?", 2, 0, false);
        declareFunction("determine_new_removal_tactics_from_hl_modules", "DETERMINE-NEW-REMOVAL-TACTICS-FROM-HL-MODULES", 4, 0, false);
        declareFunction("determine_new_removal_tactic_specs_from_hl_modules", "DETERMINE-NEW-REMOVAL-TACTIC-SPECS-FROM-HL-MODULES", 3, 0, false);
        declareFunction("determine_new_removal_tactic_specs_from_hl_modules_guts", "DETERMINE-NEW-REMOVAL-TACTIC-SPECS-FROM-HL-MODULES-GUTS", 3, 0, false);
        declareFunction("determine_applicable_hl_modules_for_asent", "DETERMINE-APPLICABLE-HL-MODULES-FOR-ASENT", 3, 0, false);
        declareFunction("update_applicable_hl_modules", "UPDATE-APPLICABLE-HL-MODULES", 5, 0, false);
        declareFunction("update_supplanted_hl_modules", "UPDATE-SUPPLANTED-HL-MODULES", 3, 0, false);
        declareFunction("update_supplanted_modules_wrt_tactic_specs", "UPDATE-SUPPLANTED-MODULES-WRT-TACTIC-SPECS", 3, 0, false);
        declareFunction("compute_tactic_specs_for_asent", "COMPUTE-TACTIC-SPECS-FOR-ASENT", 3, 0, false);
        declareFunction("literal_simple_removal_candidate_hl_modules", "LITERAL-SIMPLE-REMOVAL-CANDIDATE-HL-MODULES", 2, 0, false);
        declareFunction("literal_removal_candidate_hl_modules_for_predicate_with_sense", "LITERAL-REMOVAL-CANDIDATE-HL-MODULES-FOR-PREDICATE-WITH-SENSE", 2, 0, false);
        declareFunction("literal_removal_candidate_hl_modules_for_predicate_with_sense_int_internal", "LITERAL-REMOVAL-CANDIDATE-HL-MODULES-FOR-PREDICATE-WITH-SENSE-INT-INTERNAL", 3, 0, false);
        declareFunction("literal_removal_candidate_hl_modules_for_predicate_with_sense_int", "LITERAL-REMOVAL-CANDIDATE-HL-MODULES-FOR-PREDICATE-WITH-SENSE-INT", 3, 0, false);
        declareFunction("literal_meta_removal_candidate_hl_modules", "LITERAL-META-REMOVAL-CANDIDATE-HL-MODULES", 2, 0, false);
        declareFunction("literal_meta_removal_candidate_hl_modules_for_predicate_internal", "LITERAL-META-REMOVAL-CANDIDATE-HL-MODULES-FOR-PREDICATE-INTERNAL", 1, 0, false);
        declareFunction("literal_meta_removal_candidate_hl_modules_for_predicate", "LITERAL-META-REMOVAL-CANDIDATE-HL-MODULES-FOR-PREDICATE", 1, 0, false);
        declareFunction("literal_level_removal_tactic_p", "LITERAL-LEVEL-REMOVAL-TACTIC-P", 1, 0, false);
        declareFunction("literal_level_meta_removal_tactic_p", "LITERAL-LEVEL-META-REMOVAL-TACTIC-P", 1, 0, false);
        declareFunction("new_removal_tactic", "NEW-REMOVAL-TACTIC", 4, 0, false);
        declareFunction("compute_strategic_properties_of_removal_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-REMOVAL-TACTIC", 2, 0, false);
        declareMacro("with_removal_tactic_execution_assumptions", "WITH-REMOVAL-TACTIC-EXECUTION-ASSUMPTIONS");
        declareFunction("execute_literal_level_removal_tactic", "EXECUTE-LITERAL-LEVEL-REMOVAL-TACTIC", 4, 0, false);
        declareFunction("maybe_make_removal_tactic_progress_iterator", "MAYBE-MAKE-REMOVAL-TACTIC-PROGRESS-ITERATOR", 3, 0, false);
        declareFunction("maybe_make_removal_tactic_output_generate_progress_iterator", "MAYBE-MAKE-REMOVAL-TACTIC-OUTPUT-GENERATE-PROGRESS-ITERATOR", 2, 0, false);
        declareFunction("new_removal_tactic_output_generate_progress_iterator", "NEW-REMOVAL-TACTIC-OUTPUT-GENERATE-PROGRESS-ITERATOR", 3, 0, false);
        declareFunction("handle_one_removal_tactic_output_generate_result", "HANDLE-ONE-REMOVAL-TACTIC-OUTPUT-GENERATE-RESULT", 3, 0, false);
        declareFunction("handle_removal_add_node_for_output_generate", "HANDLE-REMOVAL-ADD-NODE-FOR-OUTPUT-GENERATE", 2, 0, false);
        declareFunction("maybe_make_removal_tactic_expand_results_progress_iterator", "MAYBE-MAKE-REMOVAL-TACTIC-EXPAND-RESULTS-PROGRESS-ITERATOR", 3, 0, false);
        declareFunction("maybe_make_removal_tactic_expand_results_progress_iterator_guts", "MAYBE-MAKE-REMOVAL-TACTIC-EXPAND-RESULTS-PROGRESS-ITERATOR-GUTS", 3, 0, false);
        declareFunction("handle_removal_add_node_for_expand_results", "HANDLE-REMOVAL-ADD-NODE-FOR-EXPAND-RESULTS", 2, 0, false);
        declareFunction("new_removal_tactic_expand_results_progress_iterator", "NEW-REMOVAL-TACTIC-EXPAND-RESULTS-PROGRESS-ITERATOR", 2, 0, false);
        declareFunction("handle_one_removal_tactic_expand_result", "HANDLE-ONE-REMOVAL-TACTIC-EXPAND-RESULT", 2, 0, false);
        declareFunction("handle_one_removal_tactic_result", "HANDLE-ONE-REMOVAL-TACTIC-RESULT", 3, 0, false);
        declareFunction("possibly_replace_ist_supports", "POSSIBLY-REPLACE-IST-SUPPORTS", 3, 0, false);
        declareFunction("maybe_new_restriction_and_removal_link", "MAYBE-NEW-RESTRICTION-AND-REMOVAL-LINK", 4, 0, false);
        declareFunction("maybe_new_removal_link", "MAYBE-NEW-REMOVAL-LINK", 4, 0, false);
        declareFunction("find_removal_link", "FIND-REMOVAL-LINK", 4, 0, false);
        declareFunction("new_removal_proof", "NEW-REMOVAL-PROOF", 1, 0, false);
        declareFunction("execute_literal_level_meta_removal_tactic", "EXECUTE-LITERAL-LEVEL-META-REMOVAL-TACTIC", 4, 0, false);
        declareFunction("inference_remove_check_default", "INFERENCE-REMOVE-CHECK-DEFAULT", 1, 1, false);
        declareMacro("do_all_legacy_inference_outputs", "DO-ALL-LEGACY-INFERENCE-OUTPUTS");
        declareFunction("inference_remove_unify_default", "INFERENCE-REMOVE-UNIFY-DEFAULT", 1, 1, false);
        new com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.$inference_remove_unify_default$UnaryFunction();
        new com.cyc.cycjava.cycl.inference.harness.inference_worker_removal.$inference_remove_unify_default$BinaryFunction();
        declareFunction("maybe_make_inference_output_iterator", "MAYBE-MAKE-INFERENCE-OUTPUT-ITERATOR", 2, 0, false);
        declareFunction("maybe_make_inference_output_iterator_guts", "MAYBE-MAKE-INFERENCE-OUTPUT-ITERATOR-GUTS", 2, 0, false);
        declareFunction("handle_one_output_generate_result", "HANDLE-ONE-OUTPUT-GENERATE-RESULT", 4, 0, false);
        declareFunction("handle_one_output_generate_result_guts", "HANDLE-ONE-OUTPUT-GENERATE-RESULT-GUTS", 4, 0, false);
        declareFunction("inference_current_hl_module", "INFERENCE-CURRENT-HL-MODULE", 0, 0, false);
        declareFunction("inference_current_sense", "INFERENCE-CURRENT-SENSE", 0, 0, false);
        declareFunction("inference_input_extractor", "INFERENCE-INPUT-EXTRACTOR", 2, 1, false);
        declareFunction("inference_input_verifier", "INFERENCE-INPUT-VERIFIER", 2, 0, false);
        declareFunction("inference_input_encoder", "INFERENCE-INPUT-ENCODER", 2, 1, false);
        declareFunction("inference_output_checker", "INFERENCE-OUTPUT-CHECKER", 2, 1, false);
        declareFunction("inference_output_generator", "INFERENCE-OUTPUT-GENERATOR", 2, 1, false);
        declareFunction("inference_output_decoder", "INFERENCE-OUTPUT-DECODER", 2, 1, false);
        declareFunction("inference_output_verifier", "INFERENCE-OUTPUT-VERIFIER", 2, 0, false);
        declareFunction("inference_output_constructor", "INFERENCE-OUTPUT-CONSTRUCTOR", 2, 1, false);
        declareFunction("inference_support_constructor", "INFERENCE-SUPPORT-CONSTRUCTOR", 2, 1, false);
        declareFunction("hl_module_guts", "HL-MODULE-GUTS", 1, 5, false);
        return NIL;
    }

    public static SubLObject declare_inference_worker_removal_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("removal_link_data_print_function_trampoline", "REMOVAL-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("removal_link_data_p", "REMOVAL-LINK-DATA-P", 1, 0, false);
            new inference_worker_removal.$removal_link_data_p$UnaryFunction();
            declareFunction("remov_link_data_hl_module", "REMOV-LINK-DATA-HL-MODULE", 1, 0, false);
            declareFunction("remov_link_data_bindings", "REMOV-LINK-DATA-BINDINGS", 1, 0, false);
            declareFunction("remov_link_data_supports", "REMOV-LINK-DATA-SUPPORTS", 1, 0, false);
            declareFunction("_csetf_remov_link_data_hl_module", "_CSETF-REMOV-LINK-DATA-HL-MODULE", 2, 0, false);
            declareFunction("_csetf_remov_link_data_bindings", "_CSETF-REMOV-LINK-DATA-BINDINGS", 2, 0, false);
            declareFunction("_csetf_remov_link_data_supports", "_CSETF-REMOV-LINK-DATA-SUPPORTS", 2, 0, false);
            declareFunction("make_removal_link_data", "MAKE-REMOVAL-LINK-DATA", 0, 1, false);
            declareFunction("visit_defstruct_removal_link_data", "VISIT-DEFSTRUCT-REMOVAL-LINK-DATA", 2, 0, false);
            declareFunction("visit_defstruct_object_removal_link_data_method", "VISIT-DEFSTRUCT-OBJECT-REMOVAL-LINK-DATA-METHOD", 2, 0, false);
            declareFunction("new_removal_link", "NEW-REMOVAL-LINK", 4, 0, false);
            declareFunction("new_removal_link_int", "NEW-REMOVAL-LINK-INT", 4, 0, false);
            declareFunction("new_removal_link_data", "NEW-REMOVAL-LINK-DATA", 1, 0, false);
            declareFunction("destroy_removal_link", "DESTROY-REMOVAL-LINK", 1, 0, false);
            declareFunction("removal_link_hl_module", "REMOVAL-LINK-HL-MODULE", 1, 0, false);
            declareFunction("removal_link_bindings", "REMOVAL-LINK-BINDINGS", 1, 0, false);
            declareFunction("removal_link_supports", "REMOVAL-LINK-SUPPORTS", 1, 0, false);
            declareFunction("set_removal_link_hl_module", "SET-REMOVAL-LINK-HL-MODULE", 2, 0, false);
            declareFunction("set_removal_link_bindings", "SET-REMOVAL-LINK-BINDINGS", 2, 0, false);
            declareFunction("set_removal_link_supports", "SET-REMOVAL-LINK-SUPPORTS", 2, 0, false);
            declareFunction("removal_link_tactic", "REMOVAL-LINK-TACTIC", 1, 0, false);
            declareFunction("removal_link_data_equals_specP", "REMOVAL-LINK-DATA-EQUALS-SPEC?", 3, 0, false);
            declareFunction("generalized_removal_tactic_p", "GENERALIZED-REMOVAL-TACTIC-P", 1, 0, false);
            declareFunction("conjunctive_removal_tactic_p", "CONJUNCTIVE-REMOVAL-TACTIC-P", 1, 0, false);
            declareFunction("conjunctive_removal_link_p", "CONJUNCTIVE-REMOVAL-LINK-P", 1, 0, false);
            declareFunction("conjunctive_removal_proof_p", "CONJUNCTIVE-REMOVAL-PROOF-P", 1, 0, false);
            declareFunction("determine_new_conjunctive_removal_tactics", "DETERMINE-NEW-CONJUNCTIVE-REMOVAL-TACTICS", 2, 0, false);
            declareFunction("sort_applicable_conjunctive_removal_modules_by_priority", "SORT-APPLICABLE-CONJUNCTIVE-REMOVAL-MODULES-BY-PRIORITY", 1, 0, false);
            declareFunction("conjunctive_removal_module_priorityL", "CONJUNCTIVE-REMOVAL-MODULE-PRIORITY<", 2, 0, false);
            declareFunction("determine_applicable_conjunctive_removal_modules", "DETERMINE-APPLICABLE-CONJUNCTIVE-REMOVAL-MODULES", 1, 0, false);
            declareFunction("motivated_multi_literal_subclause_specs", "MOTIVATED-MULTI-LITERAL-SUBCLAUSE-SPECS", 1, 0, false);
            declareFunction("hl_module_applicable_subclause_specs", "HL-MODULE-APPLICABLE-SUBCLAUSE-SPECS", 2, 0, false);
            declareFunction("new_conjunctive_removal_tactic", "NEW-CONJUNCTIVE-REMOVAL-TACTIC", 4, 0, false);
            declareFunction("compute_strategic_properties_of_conjunctive_removal_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-CONJUNCTIVE-REMOVAL-TACTIC", 2, 0, false);
            declareFunction("execute_conjunctive_removal_tactic", "EXECUTE-CONJUNCTIVE-REMOVAL-TACTIC", 1, 0, false);
            declareFunction("maybe_make_conjunctive_removal_tactic_progress_iterator", "MAYBE-MAKE-CONJUNCTIVE-REMOVAL-TACTIC-PROGRESS-ITERATOR", 1, 0, false);
            declareFunction("maybe_make_conjunctive_removal_tactic_progress_expand_iterative_iterator", "MAYBE-MAKE-CONJUNCTIVE-REMOVAL-TACTIC-PROGRESS-EXPAND-ITERATIVE-ITERATOR", 1, 0, false);
            declareFunction("new_conjunctive_removal_tactic_progress_expand_iterative_iterator", "NEW-CONJUNCTIVE-REMOVAL-TACTIC-PROGRESS-EXPAND-ITERATIVE-ITERATOR", 2, 0, false);
            declareFunction("handle_one_conjunctive_removal_tactic_expand_iterative_result", "HANDLE-ONE-CONJUNCTIVE-REMOVAL-TACTIC-EXPAND-ITERATIVE-RESULT", 2, 0, false);
            declareFunction("maybe_make_conjunctive_removal_tactic_progress_expand_iterator", "MAYBE-MAKE-CONJUNCTIVE-REMOVAL-TACTIC-PROGRESS-EXPAND-ITERATOR", 1, 0, false);
            declareFunction("new_conjunctive_removal_tactic_progress_expand_iterator", "NEW-CONJUNCTIVE-REMOVAL-TACTIC-PROGRESS-EXPAND-ITERATOR", 2, 0, false);
            declareFunction("conjunctive_removal_callback", "CONJUNCTIVE-REMOVAL-CALLBACK", 2, 0, false);
            declareFunction("handle_one_conjunctive_removal_tactic_expand_result", "HANDLE-ONE-CONJUNCTIVE-REMOVAL-TACTIC-EXPAND-RESULT", 2, 0, false);
            declareFunction("conjunctive_removal_suppress_split_justificationP", "CONJUNCTIVE-REMOVAL-SUPPRESS-SPLIT-JUSTIFICATION?", 0, 0, false);
            declareFunction("handle_one_conjunctive_removal_tactic_result", "HANDLE-ONE-CONJUNCTIVE-REMOVAL-TACTIC-RESULT", 3, 0, false);
            declareFunction("maybe_new_simplification_link", "MAYBE-NEW-SIMPLIFICATION-LINK", 3, 0, false);
            declareFunction("maybe_new_restriction_split_and_removal_links", "MAYBE-NEW-RESTRICTION-SPLIT-AND-REMOVAL-LINKS", 4, 0, false);
            declareFunction("reorder_conjunctive_removal_justifications", "REORDER-CONJUNCTIVE-REMOVAL-JUSTIFICATIONS", 4, 0, false);
            declareFunction("maybe_new_split_and_removal_links", "MAYBE-NEW-SPLIT-AND-REMOVAL-LINKS", 3, 0, false);
            declareFunction("maybe_new_removal_link_for_split_link", "MAYBE-NEW-REMOVAL-LINK-FOR-SPLIT-LINK", 5, 0, false);
            declareFunction("executed_conjunctive_removal_problems", "EXECUTED-CONJUNCTIVE-REMOVAL-PROBLEMS", 1, 1, false);
            declareFunction("problem_store_has_some_executed_sksi_conjunctive_removal_problemP", "PROBLEM-STORE-HAS-SOME-EXECUTED-SKSI-CONJUNCTIVE-REMOVAL-PROBLEM?", 1, 0, false);
            declareFunction("executed_conjunctive_removal_tactic_p", "EXECUTED-CONJUNCTIVE-REMOVAL-TACTIC-P", 1, 0, false);
            declareMacro("with_problem_store_removal_assumptions", "WITH-PROBLEM-STORE-REMOVAL-ASSUMPTIONS");
            declareFunction("meta_removal_tactic_p", "META-REMOVAL-TACTIC-P", 1, 0, false);
            declareFunction("compute_strategic_properties_of_meta_removal_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-META-REMOVAL-TACTIC", 2, 0, false);
            declareFunction("removal_link_p", "REMOVAL-LINK-P", 1, 0, false);
            declareFunction("removal_tactic_p", "REMOVAL-TACTIC-P", 1, 0, false);
            declareFunction("removal_proof_p", "REMOVAL-PROOF-P", 1, 0, false);
            declareFunction("removal_module_exclusive_func_funcall", "REMOVAL-MODULE-EXCLUSIVE-FUNC-FUNCALL", 3, 0, false);
            declareFunction("removal_module_required_func_funcall", "REMOVAL-MODULE-REQUIRED-FUNC-FUNCALL", 3, 0, false);
            declareFunction("removal_module_expand_func_funcall", "REMOVAL-MODULE-EXPAND-FUNC-FUNCALL", 3, 0, false);
            declareFunction("determine_new_literal_removal_tactics", "DETERMINE-NEW-LITERAL-REMOVAL-TACTICS", 3, 0, false);
            declareFunction("determine_new_literal_meta_removal_tactics", "DETERMINE-NEW-LITERAL-META-REMOVAL-TACTICS", 3, 0, false);
            declareFunction("determine_new_literal_simple_removal_tactics", "DETERMINE-NEW-LITERAL-SIMPLE-REMOVAL-TACTICS", 3, 0, false);
            declareFunction("literal_removal_options", "LITERAL-REMOVAL-OPTIONS", 2, 1, false);
            declareFunction("literal_removal_options_hl_modules", "LITERAL-REMOVAL-OPTIONS-HL-MODULES", 3, 0, false);
            declareFunction("filter_modules_wrt_allowed_modules_spec", "FILTER-MODULES-WRT-ALLOWED-MODULES-SPEC", 2, 0, false);
            declareFunction("literal_removal_options_candidate_hl_modules", "LITERAL-REMOVAL-OPTIONS-CANDIDATE-HL-MODULES", 3, 0, false);
            declareFunction("hl_module_applicable_to_asentP", "HL-MODULE-APPLICABLE-TO-ASENT?", 2, 0, false);
            declareFunction("determine_new_removal_tactics_from_hl_modules", "DETERMINE-NEW-REMOVAL-TACTICS-FROM-HL-MODULES", 4, 0, false);
            declareFunction("determine_new_removal_tactic_specs_from_hl_modules", "DETERMINE-NEW-REMOVAL-TACTIC-SPECS-FROM-HL-MODULES", 3, 0, false);
            declareFunction("determine_new_removal_tactic_specs_from_hl_modules_guts", "DETERMINE-NEW-REMOVAL-TACTIC-SPECS-FROM-HL-MODULES-GUTS", 3, 0, false);
            declareFunction("determine_applicable_hl_modules_for_asent", "DETERMINE-APPLICABLE-HL-MODULES-FOR-ASENT", 3, 0, false);
            declareFunction("update_applicable_hl_modules", "UPDATE-APPLICABLE-HL-MODULES", 5, 0, false);
            declareFunction("update_supplanted_hl_modules", "UPDATE-SUPPLANTED-HL-MODULES", 3, 0, false);
            declareFunction("update_supplanted_modules_wrt_tactic_specs", "UPDATE-SUPPLANTED-MODULES-WRT-TACTIC-SPECS", 3, 0, false);
            declareFunction("compute_tactic_specs_for_asent", "COMPUTE-TACTIC-SPECS-FOR-ASENT", 3, 0, false);
            declareFunction("literal_simple_removal_candidate_hl_modules", "LITERAL-SIMPLE-REMOVAL-CANDIDATE-HL-MODULES", 2, 0, false);
            declareFunction("literal_removal_candidate_hl_modules_for_predicate_with_sense", "LITERAL-REMOVAL-CANDIDATE-HL-MODULES-FOR-PREDICATE-WITH-SENSE", 2, 0, false);
            declareFunction("literal_removal_candidate_hl_modules_for_predicate_with_sense_int_internal", "LITERAL-REMOVAL-CANDIDATE-HL-MODULES-FOR-PREDICATE-WITH-SENSE-INT-INTERNAL", 3, 0, false);
            declareFunction("literal_removal_candidate_hl_modules_for_predicate_with_sense_int", "LITERAL-REMOVAL-CANDIDATE-HL-MODULES-FOR-PREDICATE-WITH-SENSE-INT", 3, 0, false);
            declareFunction("literal_meta_removal_candidate_hl_modules", "LITERAL-META-REMOVAL-CANDIDATE-HL-MODULES", 2, 0, false);
            declareFunction("literal_meta_removal_candidate_hl_modules_for_predicate_internal", "LITERAL-META-REMOVAL-CANDIDATE-HL-MODULES-FOR-PREDICATE-INTERNAL", 1, 0, false);
            declareFunction("literal_meta_removal_candidate_hl_modules_for_predicate", "LITERAL-META-REMOVAL-CANDIDATE-HL-MODULES-FOR-PREDICATE", 1, 0, false);
            declareFunction("literal_level_removal_tactic_p", "LITERAL-LEVEL-REMOVAL-TACTIC-P", 1, 0, false);
            declareFunction("literal_level_meta_removal_tactic_p", "LITERAL-LEVEL-META-REMOVAL-TACTIC-P", 1, 0, false);
            declareFunction("new_removal_tactic", "NEW-REMOVAL-TACTIC", 4, 0, false);
            declareFunction("compute_strategic_properties_of_removal_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-REMOVAL-TACTIC", 2, 0, false);
            declareMacro("with_removal_tactic_execution_assumptions", "WITH-REMOVAL-TACTIC-EXECUTION-ASSUMPTIONS");
            declareFunction("execute_literal_level_removal_tactic", "EXECUTE-LITERAL-LEVEL-REMOVAL-TACTIC", 4, 0, false);
            declareFunction("maybe_make_removal_tactic_progress_iterator", "MAYBE-MAKE-REMOVAL-TACTIC-PROGRESS-ITERATOR", 3, 0, false);
            declareFunction("maybe_make_removal_tactic_output_generate_progress_iterator", "MAYBE-MAKE-REMOVAL-TACTIC-OUTPUT-GENERATE-PROGRESS-ITERATOR", 2, 0, false);
            declareFunction("new_removal_tactic_output_generate_progress_iterator", "NEW-REMOVAL-TACTIC-OUTPUT-GENERATE-PROGRESS-ITERATOR", 3, 0, false);
            declareFunction("handle_one_removal_tactic_output_generate_result", "HANDLE-ONE-REMOVAL-TACTIC-OUTPUT-GENERATE-RESULT", 3, 0, false);
            declareFunction("handle_removal_add_node_for_output_generate", "HANDLE-REMOVAL-ADD-NODE-FOR-OUTPUT-GENERATE", 2, 0, false);
            declareFunction("maybe_make_removal_tactic_expand_results_progress_iterator", "MAYBE-MAKE-REMOVAL-TACTIC-EXPAND-RESULTS-PROGRESS-ITERATOR", 3, 0, false);
            declareFunction("maybe_make_removal_tactic_expand_results_progress_iterator_guts", "MAYBE-MAKE-REMOVAL-TACTIC-EXPAND-RESULTS-PROGRESS-ITERATOR-GUTS", 3, 0, false);
            declareFunction("handle_removal_add_node_for_expand_results", "HANDLE-REMOVAL-ADD-NODE-FOR-EXPAND-RESULTS", 2, 0, false);
            declareFunction("new_removal_tactic_expand_results_progress_iterator", "NEW-REMOVAL-TACTIC-EXPAND-RESULTS-PROGRESS-ITERATOR", 2, 0, false);
            declareFunction("handle_one_removal_tactic_expand_result", "HANDLE-ONE-REMOVAL-TACTIC-EXPAND-RESULT", 2, 0, false);
            declareFunction("handle_one_removal_tactic_result", "HANDLE-ONE-REMOVAL-TACTIC-RESULT", 3, 0, false);
            declareFunction("maybe_new_restriction_and_removal_link", "MAYBE-NEW-RESTRICTION-AND-REMOVAL-LINK", 4, 0, false);
            declareFunction("maybe_new_removal_link", "MAYBE-NEW-REMOVAL-LINK", 4, 0, false);
            declareFunction("find_removal_link", "FIND-REMOVAL-LINK", 4, 0, false);
            declareFunction("new_removal_proof", "NEW-REMOVAL-PROOF", 1, 0, false);
            declareFunction("execute_literal_level_meta_removal_tactic", "EXECUTE-LITERAL-LEVEL-META-REMOVAL-TACTIC", 4, 0, false);
            declareFunction("inference_remove_check_default", "INFERENCE-REMOVE-CHECK-DEFAULT", 1, 1, false);
            declareMacro("do_all_legacy_inference_outputs", "DO-ALL-LEGACY-INFERENCE-OUTPUTS");
            declareFunction("inference_remove_unify_default", "INFERENCE-REMOVE-UNIFY-DEFAULT", 1, 1, false);
            new inference_worker_removal.$inference_remove_unify_default$UnaryFunction();
            new inference_worker_removal.$inference_remove_unify_default$BinaryFunction();
            declareFunction("maybe_make_inference_output_iterator", "MAYBE-MAKE-INFERENCE-OUTPUT-ITERATOR", 2, 0, false);
            declareFunction("maybe_make_inference_output_iterator_guts", "MAYBE-MAKE-INFERENCE-OUTPUT-ITERATOR-GUTS", 2, 0, false);
            declareFunction("handle_one_output_generate_result", "HANDLE-ONE-OUTPUT-GENERATE-RESULT", 4, 0, false);
            declareFunction("handle_one_output_generate_result_guts", "HANDLE-ONE-OUTPUT-GENERATE-RESULT-GUTS", 4, 0, false);
            declareFunction("inference_current_hl_module", "INFERENCE-CURRENT-HL-MODULE", 0, 0, false);
            declareFunction("inference_current_sense", "INFERENCE-CURRENT-SENSE", 0, 0, false);
            declareFunction("inference_input_extractor", "INFERENCE-INPUT-EXTRACTOR", 2, 1, false);
            declareFunction("inference_input_verifier", "INFERENCE-INPUT-VERIFIER", 2, 0, false);
            declareFunction("inference_input_encoder", "INFERENCE-INPUT-ENCODER", 2, 1, false);
            declareFunction("inference_output_checker", "INFERENCE-OUTPUT-CHECKER", 2, 1, false);
            declareFunction("inference_output_generator", "INFERENCE-OUTPUT-GENERATOR", 2, 1, false);
            declareFunction("inference_output_decoder", "INFERENCE-OUTPUT-DECODER", 2, 1, false);
            declareFunction("inference_output_verifier", "INFERENCE-OUTPUT-VERIFIER", 2, 0, false);
            declareFunction("inference_output_constructor", "INFERENCE-OUTPUT-CONSTRUCTOR", 2, 1, false);
            declareFunction("inference_support_constructor", "INFERENCE-SUPPORT-CONSTRUCTOR", 2, 1, false);
            declareFunction("hl_module_guts", "HL-MODULE-GUTS", 1, 5, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("possibly_replace_ist_supports", "POSSIBLY-REPLACE-IST-SUPPORTS", 3, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_inference_worker_removal_file_Previous() {
        declareFunction("removal_link_data_print_function_trampoline", "REMOVAL-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("removal_link_data_p", "REMOVAL-LINK-DATA-P", 1, 0, false);
        new inference_worker_removal.$removal_link_data_p$UnaryFunction();
        declareFunction("remov_link_data_hl_module", "REMOV-LINK-DATA-HL-MODULE", 1, 0, false);
        declareFunction("remov_link_data_bindings", "REMOV-LINK-DATA-BINDINGS", 1, 0, false);
        declareFunction("remov_link_data_supports", "REMOV-LINK-DATA-SUPPORTS", 1, 0, false);
        declareFunction("_csetf_remov_link_data_hl_module", "_CSETF-REMOV-LINK-DATA-HL-MODULE", 2, 0, false);
        declareFunction("_csetf_remov_link_data_bindings", "_CSETF-REMOV-LINK-DATA-BINDINGS", 2, 0, false);
        declareFunction("_csetf_remov_link_data_supports", "_CSETF-REMOV-LINK-DATA-SUPPORTS", 2, 0, false);
        declareFunction("make_removal_link_data", "MAKE-REMOVAL-LINK-DATA", 0, 1, false);
        declareFunction("visit_defstruct_removal_link_data", "VISIT-DEFSTRUCT-REMOVAL-LINK-DATA", 2, 0, false);
        declareFunction("visit_defstruct_object_removal_link_data_method", "VISIT-DEFSTRUCT-OBJECT-REMOVAL-LINK-DATA-METHOD", 2, 0, false);
        declareFunction("new_removal_link", "NEW-REMOVAL-LINK", 4, 0, false);
        declareFunction("new_removal_link_int", "NEW-REMOVAL-LINK-INT", 4, 0, false);
        declareFunction("new_removal_link_data", "NEW-REMOVAL-LINK-DATA", 1, 0, false);
        declareFunction("destroy_removal_link", "DESTROY-REMOVAL-LINK", 1, 0, false);
        declareFunction("removal_link_hl_module", "REMOVAL-LINK-HL-MODULE", 1, 0, false);
        declareFunction("removal_link_bindings", "REMOVAL-LINK-BINDINGS", 1, 0, false);
        declareFunction("removal_link_supports", "REMOVAL-LINK-SUPPORTS", 1, 0, false);
        declareFunction("set_removal_link_hl_module", "SET-REMOVAL-LINK-HL-MODULE", 2, 0, false);
        declareFunction("set_removal_link_bindings", "SET-REMOVAL-LINK-BINDINGS", 2, 0, false);
        declareFunction("set_removal_link_supports", "SET-REMOVAL-LINK-SUPPORTS", 2, 0, false);
        declareFunction("removal_link_tactic", "REMOVAL-LINK-TACTIC", 1, 0, false);
        declareFunction("removal_link_data_equals_specP", "REMOVAL-LINK-DATA-EQUALS-SPEC?", 3, 0, false);
        declareFunction("generalized_removal_tactic_p", "GENERALIZED-REMOVAL-TACTIC-P", 1, 0, false);
        declareFunction("conjunctive_removal_tactic_p", "CONJUNCTIVE-REMOVAL-TACTIC-P", 1, 0, false);
        declareFunction("conjunctive_removal_link_p", "CONJUNCTIVE-REMOVAL-LINK-P", 1, 0, false);
        declareFunction("conjunctive_removal_proof_p", "CONJUNCTIVE-REMOVAL-PROOF-P", 1, 0, false);
        declareFunction("determine_new_conjunctive_removal_tactics", "DETERMINE-NEW-CONJUNCTIVE-REMOVAL-TACTICS", 2, 0, false);
        declareFunction("sort_applicable_conjunctive_removal_modules_by_priority", "SORT-APPLICABLE-CONJUNCTIVE-REMOVAL-MODULES-BY-PRIORITY", 1, 0, false);
        declareFunction("conjunctive_removal_module_priorityL", "CONJUNCTIVE-REMOVAL-MODULE-PRIORITY<", 2, 0, false);
        declareFunction("determine_applicable_conjunctive_removal_modules", "DETERMINE-APPLICABLE-CONJUNCTIVE-REMOVAL-MODULES", 1, 0, false);
        declareFunction("motivated_multi_literal_subclause_specs", "MOTIVATED-MULTI-LITERAL-SUBCLAUSE-SPECS", 1, 0, false);
        declareFunction("hl_module_applicable_subclause_specs", "HL-MODULE-APPLICABLE-SUBCLAUSE-SPECS", 2, 0, false);
        declareFunction("new_conjunctive_removal_tactic", "NEW-CONJUNCTIVE-REMOVAL-TACTIC", 4, 0, false);
        declareFunction("compute_strategic_properties_of_conjunctive_removal_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-CONJUNCTIVE-REMOVAL-TACTIC", 2, 0, false);
        declareFunction("execute_conjunctive_removal_tactic", "EXECUTE-CONJUNCTIVE-REMOVAL-TACTIC", 1, 0, false);
        declareFunction("maybe_make_conjunctive_removal_tactic_progress_iterator", "MAYBE-MAKE-CONJUNCTIVE-REMOVAL-TACTIC-PROGRESS-ITERATOR", 1, 0, false);
        declareFunction("maybe_make_conjunctive_removal_tactic_progress_expand_iterative_iterator", "MAYBE-MAKE-CONJUNCTIVE-REMOVAL-TACTIC-PROGRESS-EXPAND-ITERATIVE-ITERATOR", 1, 0, false);
        declareFunction("new_conjunctive_removal_tactic_progress_expand_iterative_iterator", "NEW-CONJUNCTIVE-REMOVAL-TACTIC-PROGRESS-EXPAND-ITERATIVE-ITERATOR", 2, 0, false);
        declareFunction("handle_one_conjunctive_removal_tactic_expand_iterative_result", "HANDLE-ONE-CONJUNCTIVE-REMOVAL-TACTIC-EXPAND-ITERATIVE-RESULT", 2, 0, false);
        declareFunction("maybe_make_conjunctive_removal_tactic_progress_expand_iterator", "MAYBE-MAKE-CONJUNCTIVE-REMOVAL-TACTIC-PROGRESS-EXPAND-ITERATOR", 1, 0, false);
        declareFunction("new_conjunctive_removal_tactic_progress_expand_iterator", "NEW-CONJUNCTIVE-REMOVAL-TACTIC-PROGRESS-EXPAND-ITERATOR", 2, 0, false);
        declareFunction("conjunctive_removal_callback", "CONJUNCTIVE-REMOVAL-CALLBACK", 2, 0, false);
        declareFunction("handle_one_conjunctive_removal_tactic_expand_result", "HANDLE-ONE-CONJUNCTIVE-REMOVAL-TACTIC-EXPAND-RESULT", 2, 0, false);
        declareFunction("conjunctive_removal_suppress_split_justificationP", "CONJUNCTIVE-REMOVAL-SUPPRESS-SPLIT-JUSTIFICATION?", 0, 0, false);
        declareFunction("handle_one_conjunctive_removal_tactic_result", "HANDLE-ONE-CONJUNCTIVE-REMOVAL-TACTIC-RESULT", 3, 0, false);
        declareFunction("maybe_new_simplification_link", "MAYBE-NEW-SIMPLIFICATION-LINK", 3, 0, false);
        declareFunction("maybe_new_restriction_split_and_removal_links", "MAYBE-NEW-RESTRICTION-SPLIT-AND-REMOVAL-LINKS", 4, 0, false);
        declareFunction("reorder_conjunctive_removal_justifications", "REORDER-CONJUNCTIVE-REMOVAL-JUSTIFICATIONS", 4, 0, false);
        declareFunction("maybe_new_split_and_removal_links", "MAYBE-NEW-SPLIT-AND-REMOVAL-LINKS", 3, 0, false);
        declareFunction("maybe_new_removal_link_for_split_link", "MAYBE-NEW-REMOVAL-LINK-FOR-SPLIT-LINK", 5, 0, false);
        declareFunction("executed_conjunctive_removal_problems", "EXECUTED-CONJUNCTIVE-REMOVAL-PROBLEMS", 1, 1, false);
        declareFunction("problem_store_has_some_executed_sksi_conjunctive_removal_problemP", "PROBLEM-STORE-HAS-SOME-EXECUTED-SKSI-CONJUNCTIVE-REMOVAL-PROBLEM?", 1, 0, false);
        declareFunction("executed_conjunctive_removal_tactic_p", "EXECUTED-CONJUNCTIVE-REMOVAL-TACTIC-P", 1, 0, false);
        declareMacro("with_problem_store_removal_assumptions", "WITH-PROBLEM-STORE-REMOVAL-ASSUMPTIONS");
        declareFunction("meta_removal_tactic_p", "META-REMOVAL-TACTIC-P", 1, 0, false);
        declareFunction("compute_strategic_properties_of_meta_removal_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-META-REMOVAL-TACTIC", 2, 0, false);
        declareFunction("removal_link_p", "REMOVAL-LINK-P", 1, 0, false);
        declareFunction("removal_tactic_p", "REMOVAL-TACTIC-P", 1, 0, false);
        declareFunction("removal_proof_p", "REMOVAL-PROOF-P", 1, 0, false);
        declareFunction("removal_module_exclusive_func_funcall", "REMOVAL-MODULE-EXCLUSIVE-FUNC-FUNCALL", 3, 0, false);
        declareFunction("removal_module_required_func_funcall", "REMOVAL-MODULE-REQUIRED-FUNC-FUNCALL", 3, 0, false);
        declareFunction("removal_module_expand_func_funcall", "REMOVAL-MODULE-EXPAND-FUNC-FUNCALL", 3, 0, false);
        declareFunction("determine_new_literal_removal_tactics", "DETERMINE-NEW-LITERAL-REMOVAL-TACTICS", 3, 0, false);
        declareFunction("determine_new_literal_meta_removal_tactics", "DETERMINE-NEW-LITERAL-META-REMOVAL-TACTICS", 3, 0, false);
        declareFunction("determine_new_literal_simple_removal_tactics", "DETERMINE-NEW-LITERAL-SIMPLE-REMOVAL-TACTICS", 3, 0, false);
        declareFunction("literal_removal_options", "LITERAL-REMOVAL-OPTIONS", 2, 1, false);
        declareFunction("literal_removal_options_hl_modules", "LITERAL-REMOVAL-OPTIONS-HL-MODULES", 3, 0, false);
        declareFunction("filter_modules_wrt_allowed_modules_spec", "FILTER-MODULES-WRT-ALLOWED-MODULES-SPEC", 2, 0, false);
        declareFunction("literal_removal_options_candidate_hl_modules", "LITERAL-REMOVAL-OPTIONS-CANDIDATE-HL-MODULES", 3, 0, false);
        declareFunction("hl_module_applicable_to_asentP", "HL-MODULE-APPLICABLE-TO-ASENT?", 2, 0, false);
        declareFunction("determine_new_removal_tactics_from_hl_modules", "DETERMINE-NEW-REMOVAL-TACTICS-FROM-HL-MODULES", 4, 0, false);
        declareFunction("determine_new_removal_tactic_specs_from_hl_modules", "DETERMINE-NEW-REMOVAL-TACTIC-SPECS-FROM-HL-MODULES", 3, 0, false);
        declareFunction("determine_new_removal_tactic_specs_from_hl_modules_guts", "DETERMINE-NEW-REMOVAL-TACTIC-SPECS-FROM-HL-MODULES-GUTS", 3, 0, false);
        declareFunction("determine_applicable_hl_modules_for_asent", "DETERMINE-APPLICABLE-HL-MODULES-FOR-ASENT", 3, 0, false);
        declareFunction("update_applicable_hl_modules", "UPDATE-APPLICABLE-HL-MODULES", 5, 0, false);
        declareFunction("update_supplanted_hl_modules", "UPDATE-SUPPLANTED-HL-MODULES", 3, 0, false);
        declareFunction("update_supplanted_modules_wrt_tactic_specs", "UPDATE-SUPPLANTED-MODULES-WRT-TACTIC-SPECS", 3, 0, false);
        declareFunction("compute_tactic_specs_for_asent", "COMPUTE-TACTIC-SPECS-FOR-ASENT", 3, 0, false);
        declareFunction("literal_simple_removal_candidate_hl_modules", "LITERAL-SIMPLE-REMOVAL-CANDIDATE-HL-MODULES", 2, 0, false);
        declareFunction("literal_removal_candidate_hl_modules_for_predicate_with_sense", "LITERAL-REMOVAL-CANDIDATE-HL-MODULES-FOR-PREDICATE-WITH-SENSE", 2, 0, false);
        declareFunction("literal_removal_candidate_hl_modules_for_predicate_with_sense_int_internal", "LITERAL-REMOVAL-CANDIDATE-HL-MODULES-FOR-PREDICATE-WITH-SENSE-INT-INTERNAL", 3, 0, false);
        declareFunction("literal_removal_candidate_hl_modules_for_predicate_with_sense_int", "LITERAL-REMOVAL-CANDIDATE-HL-MODULES-FOR-PREDICATE-WITH-SENSE-INT", 3, 0, false);
        declareFunction("literal_meta_removal_candidate_hl_modules", "LITERAL-META-REMOVAL-CANDIDATE-HL-MODULES", 2, 0, false);
        declareFunction("literal_meta_removal_candidate_hl_modules_for_predicate_internal", "LITERAL-META-REMOVAL-CANDIDATE-HL-MODULES-FOR-PREDICATE-INTERNAL", 1, 0, false);
        declareFunction("literal_meta_removal_candidate_hl_modules_for_predicate", "LITERAL-META-REMOVAL-CANDIDATE-HL-MODULES-FOR-PREDICATE", 1, 0, false);
        declareFunction("literal_level_removal_tactic_p", "LITERAL-LEVEL-REMOVAL-TACTIC-P", 1, 0, false);
        declareFunction("literal_level_meta_removal_tactic_p", "LITERAL-LEVEL-META-REMOVAL-TACTIC-P", 1, 0, false);
        declareFunction("new_removal_tactic", "NEW-REMOVAL-TACTIC", 4, 0, false);
        declareFunction("compute_strategic_properties_of_removal_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-REMOVAL-TACTIC", 2, 0, false);
        declareMacro("with_removal_tactic_execution_assumptions", "WITH-REMOVAL-TACTIC-EXECUTION-ASSUMPTIONS");
        declareFunction("execute_literal_level_removal_tactic", "EXECUTE-LITERAL-LEVEL-REMOVAL-TACTIC", 4, 0, false);
        declareFunction("maybe_make_removal_tactic_progress_iterator", "MAYBE-MAKE-REMOVAL-TACTIC-PROGRESS-ITERATOR", 3, 0, false);
        declareFunction("maybe_make_removal_tactic_output_generate_progress_iterator", "MAYBE-MAKE-REMOVAL-TACTIC-OUTPUT-GENERATE-PROGRESS-ITERATOR", 2, 0, false);
        declareFunction("new_removal_tactic_output_generate_progress_iterator", "NEW-REMOVAL-TACTIC-OUTPUT-GENERATE-PROGRESS-ITERATOR", 3, 0, false);
        declareFunction("handle_one_removal_tactic_output_generate_result", "HANDLE-ONE-REMOVAL-TACTIC-OUTPUT-GENERATE-RESULT", 3, 0, false);
        declareFunction("handle_removal_add_node_for_output_generate", "HANDLE-REMOVAL-ADD-NODE-FOR-OUTPUT-GENERATE", 2, 0, false);
        declareFunction("maybe_make_removal_tactic_expand_results_progress_iterator", "MAYBE-MAKE-REMOVAL-TACTIC-EXPAND-RESULTS-PROGRESS-ITERATOR", 3, 0, false);
        declareFunction("maybe_make_removal_tactic_expand_results_progress_iterator_guts", "MAYBE-MAKE-REMOVAL-TACTIC-EXPAND-RESULTS-PROGRESS-ITERATOR-GUTS", 3, 0, false);
        declareFunction("handle_removal_add_node_for_expand_results", "HANDLE-REMOVAL-ADD-NODE-FOR-EXPAND-RESULTS", 2, 0, false);
        declareFunction("new_removal_tactic_expand_results_progress_iterator", "NEW-REMOVAL-TACTIC-EXPAND-RESULTS-PROGRESS-ITERATOR", 2, 0, false);
        declareFunction("handle_one_removal_tactic_expand_result", "HANDLE-ONE-REMOVAL-TACTIC-EXPAND-RESULT", 2, 0, false);
        declareFunction("handle_one_removal_tactic_result", "HANDLE-ONE-REMOVAL-TACTIC-RESULT", 3, 0, false);
        declareFunction("maybe_new_restriction_and_removal_link", "MAYBE-NEW-RESTRICTION-AND-REMOVAL-LINK", 4, 0, false);
        declareFunction("maybe_new_removal_link", "MAYBE-NEW-REMOVAL-LINK", 4, 0, false);
        declareFunction("find_removal_link", "FIND-REMOVAL-LINK", 4, 0, false);
        declareFunction("new_removal_proof", "NEW-REMOVAL-PROOF", 1, 0, false);
        declareFunction("execute_literal_level_meta_removal_tactic", "EXECUTE-LITERAL-LEVEL-META-REMOVAL-TACTIC", 4, 0, false);
        declareFunction("inference_remove_check_default", "INFERENCE-REMOVE-CHECK-DEFAULT", 1, 1, false);
        declareMacro("do_all_legacy_inference_outputs", "DO-ALL-LEGACY-INFERENCE-OUTPUTS");
        declareFunction("inference_remove_unify_default", "INFERENCE-REMOVE-UNIFY-DEFAULT", 1, 1, false);
        new inference_worker_removal.$inference_remove_unify_default$UnaryFunction();
        new inference_worker_removal.$inference_remove_unify_default$BinaryFunction();
        declareFunction("maybe_make_inference_output_iterator", "MAYBE-MAKE-INFERENCE-OUTPUT-ITERATOR", 2, 0, false);
        declareFunction("maybe_make_inference_output_iterator_guts", "MAYBE-MAKE-INFERENCE-OUTPUT-ITERATOR-GUTS", 2, 0, false);
        declareFunction("handle_one_output_generate_result", "HANDLE-ONE-OUTPUT-GENERATE-RESULT", 4, 0, false);
        declareFunction("handle_one_output_generate_result_guts", "HANDLE-ONE-OUTPUT-GENERATE-RESULT-GUTS", 4, 0, false);
        declareFunction("inference_current_hl_module", "INFERENCE-CURRENT-HL-MODULE", 0, 0, false);
        declareFunction("inference_current_sense", "INFERENCE-CURRENT-SENSE", 0, 0, false);
        declareFunction("inference_input_extractor", "INFERENCE-INPUT-EXTRACTOR", 2, 1, false);
        declareFunction("inference_input_verifier", "INFERENCE-INPUT-VERIFIER", 2, 0, false);
        declareFunction("inference_input_encoder", "INFERENCE-INPUT-ENCODER", 2, 1, false);
        declareFunction("inference_output_checker", "INFERENCE-OUTPUT-CHECKER", 2, 1, false);
        declareFunction("inference_output_generator", "INFERENCE-OUTPUT-GENERATOR", 2, 1, false);
        declareFunction("inference_output_decoder", "INFERENCE-OUTPUT-DECODER", 2, 1, false);
        declareFunction("inference_output_verifier", "INFERENCE-OUTPUT-VERIFIER", 2, 0, false);
        declareFunction("inference_output_constructor", "INFERENCE-OUTPUT-CONSTRUCTOR", 2, 1, false);
        declareFunction("inference_support_constructor", "INFERENCE-SUPPORT-CONSTRUCTOR", 2, 1, false);
        declareFunction("hl_module_guts", "HL-MODULE-GUTS", 1, 5, false);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(makeSymbol("HL-MODULE"), makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"));

    static private final SubLList $list_alt3 = list(makeKeyword("HL-MODULE"), makeKeyword("BINDINGS"), makeKeyword("SUPPORTS"));

    static private final SubLList $list_alt4 = list(makeSymbol("REMOV-LINK-DATA-HL-MODULE"), makeSymbol("REMOV-LINK-DATA-BINDINGS"), makeSymbol("REMOV-LINK-DATA-SUPPORTS"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-REMOV-LINK-DATA-HL-MODULE"), makeSymbol("_CSETF-REMOV-LINK-DATA-BINDINGS"), makeSymbol("_CSETF-REMOV-LINK-DATA-SUPPORTS"));

    static private final SubLString $str_alt17$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLList $list_alt28 = list(makeSymbol("HL-MODULE"), makeSymbol("PRODUCTIVITY"), makeSymbol("COMPLETENESS"));

    static private final SubLSymbol $sym29$CONJUNCTIVE_REMOVAL_MODULE_PRIORITY_ = makeSymbol("CONJUNCTIVE-REMOVAL-MODULE-PRIORITY<");

    static private final SubLString $str_alt30$_s_stated_its_applicability_to_th = makeString("~s stated its applicability to the subclause spec ~s, which does not specify more than one literal.\nConjunctive removal modules must apply to more than one literal in the clause.");

    public static SubLObject init_inference_worker_removal_file() {
        defconstant("*DTP-REMOVAL-LINK-DATA*", inference_worker_removal.REMOVAL_LINK_DATA);
        defparameter("*CONJUNCTIVE-REMOVAL-TACTIC-EXPAND-RESULTS-QUEUE*", NIL);
        defparameter("*CONJUNCTIVE-REMOVAL-SUPPRESS-SPLIT-JUSTIFICATION?*", T);
        defparameter("*CONJUNCTIVE-REMOVAL-OPTIMIZE-WHEN-NO-JUSTIFICATIONS?*", T);
        defparameter("*REMOVAL-TACTIC-ITERATION-THRESHOLD*", TWO_INTEGER);
        defparameter("*REMOVAL-TACTIC-EXPAND-RESULTS-QUEUE*", NIL);
        return NIL;
    }

    static private final SubLList $list_alt33 = list(makeSymbol("REMOVAL-BINDINGS"), makeSymbol("JUSTIFICATIONS"));

    static private final SubLString $str_alt36$Problem_reuse_assumptions_were_vi = makeString("Problem reuse assumptions were violated: ~a did not equal ~a");

    public static SubLObject setup_inference_worker_removal_file() {
        register_method($print_object_method_table$.getGlobalValue(), inference_worker_removal.$dtp_removal_link_data$.getGlobalValue(), symbol_function(inference_worker_removal.REMOVAL_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(inference_worker_removal.$list8);
        def_csetf(inference_worker_removal.REMOV_LINK_DATA_HL_MODULE, inference_worker_removal._CSETF_REMOV_LINK_DATA_HL_MODULE);
        def_csetf(inference_worker_removal.REMOV_LINK_DATA_BINDINGS, inference_worker_removal._CSETF_REMOV_LINK_DATA_BINDINGS);
        def_csetf(inference_worker_removal.REMOV_LINK_DATA_SUPPORTS, inference_worker_removal._CSETF_REMOV_LINK_DATA_SUPPORTS);
        identity(inference_worker_removal.REMOVAL_LINK_DATA);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), inference_worker_removal.$dtp_removal_link_data$.getGlobalValue(), symbol_function(inference_worker_removal.VISIT_DEFSTRUCT_OBJECT_REMOVAL_LINK_DATA_METHOD));
        note_memoized_function(inference_worker_removal.LITERAL_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE_WITH_SENSE_INT);
        note_memoized_function(inference_worker_removal.LITERAL_META_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE);
        return NIL;
    }

    static private final SubLString $str_alt37$Couldn_t_find_the_right_conjuncti = makeString("Couldn't find the right conjunctive removal justification for ~S");

    static private final SubLList $list_alt40 = list(makeSymbol("STORE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym41$STORE_VAR = makeUninternedSymbol("STORE-VAR");

    static private final SubLSymbol $sym44$PROBLEM_STORE_NEGATION_BY_FAILURE_ = makeSymbol("PROBLEM-STORE-NEGATION-BY-FAILURE?");

    @Override
    public void declareFunctions() {
        inference_worker_removal.declare_inference_worker_removal_file();
    }

    @Override
    public void initializeVariables() {
        inference_worker_removal.init_inference_worker_removal_file();
    }

    @Override
    public void runTopLevelForms() {
        inference_worker_removal.setup_inference_worker_removal_file();
    }

    static {
    }

    static private final SubLString $str_alt70$For_sentence_____S__Maximum_HL_Mo = makeString("For sentence :~%~S~%Maximum HL Module check cost exceeded by ~A (~A).");

    public static final class $removal_link_data_p$UnaryFunction extends UnaryFunction {
        public $removal_link_data_p$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-LINK-DATA-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return inference_worker_removal.removal_link_data_p(arg1);
        }
    }

    public static final SubLSymbol $kw72$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    public static final class $inference_remove_unify_default$UnaryFunction extends UnaryFunction {
        public $inference_remove_unify_default$UnaryFunction() {
            super(extractFunctionNamed("INFERENCE-REMOVE-UNIFY-DEFAULT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return inference_worker_removal.inference_remove_unify_default(arg1, inference_worker_removal.$inference_remove_unify_default$UnaryFunction.UNPROVIDED);
        }
    }

    static private final SubLList $list_alt74 = list(list(makeSymbol("TACTIC"), makeSymbol("MT"), makeSymbol("SENSE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym75$TACTIC_VAR = makeUninternedSymbol("TACTIC-VAR");

    public static final class $inference_remove_unify_default$BinaryFunction extends BinaryFunction {
        public $inference_remove_unify_default$BinaryFunction() {
            super(extractFunctionNamed("INFERENCE-REMOVE-UNIFY-DEFAULT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return inference_worker_removal.inference_remove_unify_default(arg1, arg2);
        }
    }

    static private final SubLList $list_alt87 = list(makeSymbol("REMOVAL-BINDINGS"), makeSymbol("SUPPORTS"));

    static private final SubLString $str_alt88$Ignoring_result_from__S_due_to_op = makeString("Ignoring result from ~S due to open supports");

    static private final SubLSymbol $sym89$PRODUCTIVITY__ = makeSymbol("PRODUCTIVITY-<");

    static private final SubLList $list_alt91 = list(list(makeSymbol("RAW-OUTPUT"), makeSymbol("RAW-OUTPUT-ITERATOR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym92$ITERATOR = makeUninternedSymbol("ITERATOR");

    static private final SubLList $list_alt101 = list(makeSymbol("&OPTIONAL"), makeSymbol("SUPPORT"), makeSymbol("&REST"), makeSymbol("MORE-SUPPORTS"));

    static private final SubLString $str_alt103$unknown_thing_to_do_in_the_HL_mod = makeString("unknown thing to do in the HL module guts: ~s");
}

/**
 * Total time: 693 ms
 */
