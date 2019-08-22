/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.bindings.apply_bindings;
import static com.cyc.cycjava.cycl.bindings.apply_bindings_backwards;
import static com.cyc.cycjava.cycl.bindings.bindings_equalP;
import static com.cyc.cycjava.cycl.bindings.compose_bindings_filtered;
import static com.cyc.cycjava.cycl.bindings.filter_bindings_by_variables;
import static com.cyc.cycjava.cycl.bindings.invert_bindings;
import static com.cyc.cycjava.cycl.bindings.transfer_variable_map_to_bindings;
import static com.cyc.cycjava.cycl.bindings.transfer_variable_map_to_bindings_filtered;
import static com.cyc.cycjava.cycl.clause_utilities.complement_of_subclause_specified_by_spec;
import static com.cyc.cycjava.cycl.clause_utilities.new_complement_subclause_spec;
import static com.cyc.cycjava.cycl.clause_utilities.new_single_literal_subclause_spec;
import static com.cyc.cycjava.cycl.clause_utilities.new_subclause_spec;
import static com.cyc.cycjava.cycl.clause_utilities.single_literal_subclause_specP;
import static com.cyc.cycjava.cycl.clause_utilities.subclause_spec_from_clauses;
import static com.cyc.cycjava.cycl.clause_utilities.subclause_spec_subsumesP;
import static com.cyc.cycjava.cycl.clause_utilities.subclause_specified_by_spec;
import static com.cyc.cycjava.cycl.clause_utilities.total_subclause_specP;
import static com.cyc.cycjava.cycl.clauses.neg_lits;
import static com.cyc.cycjava.cycl.clauses.pos_lits;
import static com.cyc.cycjava.cycl.cycl_utilities.atomic_sentence_arg2;
import static com.cyc.cycjava.cycl.cycl_utilities.atomic_sentence_predicate;
import static com.cyc.cycjava.cycl.cycl_variables.hl_varP;
import static com.cyc.cycjava.cycl.dictionary.clear_dictionary;
import static com.cyc.cycjava.cycl.dictionary.dictionary_contents;
import static com.cyc.cycjava.cycl.dictionary.dictionary_lookup;
import static com.cyc.cycjava.cycl.dictionary.dictionary_lookup_without_values;
import static com.cyc.cycjava.cycl.dictionary.dictionary_p;
import static com.cyc.cycjava.cycl.dictionary.new_dictionary;
import static com.cyc.cycjava.cycl.dictionary_contents.clear_dictionary_contents;
import static com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_delete;
import static com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_enter;
import static com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_keys;
import static com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_lookup_without_values;
import static com.cyc.cycjava.cycl.dictionary_contents.dictionary_contents_size;
import static com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_doneP;
import static com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_finalize;
import static com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_key_value;
import static com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_next;
import static com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_state;
import static com.cyc.cycjava.cycl.dictionary_contents.new_dictionary_contents;
import static com.cyc.cycjava.cycl.dictionary_utilities.dictionary_delete_from_value;
import static com.cyc.cycjava.cycl.dictionary_utilities.dictionary_push;
import static com.cyc.cycjava.cycl.dictionary_utilities.dictionary_pushnew;
import static com.cyc.cycjava.cycl.el_utilities.potentially_solvable_evaluate_asentP;
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
import static com.cyc.cycjava.cycl.inference.harness.inference_worker_restriction.maybe_new_restriction_link;
import static com.cyc.cycjava.cycl.inference.harness.inference_worker_restriction.restriction_link_bindings;
import static com.cyc.cycjava.cycl.inference.harness.inference_worker_split.all_literals_connected_by_shared_varsP;
import static com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_level_p;
import static com.cyc.cycjava.cycl.list_utilities.cartesian_product;
import static com.cyc.cycjava.cycl.list_utilities.cartesian_product_cardinality;
import static com.cyc.cycjava.cycl.list_utilities.doubletonP;
import static com.cyc.cycjava.cycl.list_utilities.greater_length_p;
import static com.cyc.cycjava.cycl.list_utilities.greater_or_same_length_p;
import static com.cyc.cycjava.cycl.list_utilities.remove_if_not;
import static com.cyc.cycjava.cycl.list_utilities.sublisp_boolean;
import static com.cyc.cycjava.cycl.list_utilities.tree_gather;
import static com.cyc.cycjava.cycl.memoization_state.$memoization_state$;
import static com.cyc.cycjava.cycl.memoization_state.$memoized_item_not_found$;
import static com.cyc.cycjava.cycl.memoization_state.caching_results;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_enter_multi_key_n;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_lookup;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_put;
import static com.cyc.cycjava.cycl.memoization_state.create_caching_state;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_lock;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_lookup;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_original_process;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_possibly_clear_original_process;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_put;
import static com.cyc.cycjava.cycl.memoization_state.note_memoized_function;
import static com.cyc.cycjava.cycl.memoization_state.sxhash_calc_2;
import static com.cyc.cycjava.cycl.set.do_set_internal;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_basis_object;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_doneP;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_element_validP;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_initial_state;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_next;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_update_state;
import static com.cyc.cycjava.cycl.unification.unify;
import static com.cyc.cycjava.cycl.unification.unify_possible;
import static com.cyc.cycjava.cycl.variables.variable_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_if;
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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
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
 * module:      INFERENCE-WORKER-JOIN-ORDERED
 * source file: /cyc/top/cycl/inference/harness/inference-worker-join-ordered.lisp
 * created:     2019/07/03 17:37:40
 */
public final class inference_worker_join_ordered extends SubLTranslatedFile implements V12 {
    /**
     * The variables in the trigger problem of JOIN-ORDERED-LINK which are also shared
     * by the sibling problem (modulo variable maps)
     */
    @LispMethod(comment = "The variables in the trigger problem of JOIN-ORDERED-LINK which are also shared\r\nby the sibling problem (modulo variable maps)\nThe variables in the trigger problem of JOIN-ORDERED-LINK which are also shared\nby the sibling problem (modulo variable maps)")
    public static final SubLObject trigger_vars_shared_by_sibling_internal(SubLObject join_ordered_link, SubLObject trigger_is_focalP) {
        {
            SubLObject trigger_to_sibling_variable_map = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.trigger_to_sibling_variable_map(join_ordered_link, trigger_is_focalP);
            return Mapping.mapcar(VARIABLE_BINDING_VARIABLE, trigger_to_sibling_variable_map);
        }
    }

    public static final SubLObject problem_has_a_complete_conjunctive_removal_tacticP(SubLObject problem) {
        {
            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
            SubLObject tactic = NIL;
            for (tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tactic = cdolist_list_var.first()) {
                if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, $REMOVAL_CONJUNCTIVE)) && (NIL != inference_datastructures_problem.do_problem_tactics_completeness_match(tactic, $COMPLETE))) {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static final SubLObject non_focal_to_focal_variable_map_internal(SubLObject join_ordered_link) {
        return bindings.invert_bindings(com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.focal_to_non_focal_variable_map(join_ordered_link));
    }

    public static final SubLObject focal_to_non_focal_variable_map_internal(SubLObject join_ordered_link) {
        {
            SubLObject focal_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(join_ordered_link);
            SubLObject non_focal_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_non_focal_mapped_problem(join_ordered_link);
            SubLObject focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(focal_mapped_problem);
            SubLObject non_focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(non_focal_mapped_problem);
            SubLObject supported_to_non_focal_variable_map = bindings.invert_bindings(non_focal_variable_map);
            SubLObject focal_to_non_focal_variable_map = bindings.compose_bindings_filtered(focal_variable_map, supported_to_non_focal_variable_map);
            return focal_to_non_focal_variable_map;
        }
    }

    /**
     * When a problem has a candidate early removal tactic--one that's join-ordered, who's lookahead problem is complete, and is cheap--don't bother looking for multi literal join ordered tactics (conjunctive removal jo tactics)
     */
    // defparameter
    @LispMethod(comment = "When a problem has a candidate early removal tactic--one that\'s join-ordered, who\'s lookahead problem is complete, and is cheap--don\'t bother looking for multi literal join ordered tactics (conjunctive removal jo tactics)\ndefparameter")
    public static final SubLSymbol $only_add_multi_literal_jo_tactics_when_no_possible_complete_tacticP$ = makeSymbol("*ONLY-ADD-MULTI-LITERAL-JO-TACTICS-WHEN-NO-POSSIBLE-COMPLETE-TACTIC?*");

    public static final SubLFile me = new inference_worker_join_ordered();

 public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_join_ordered_link_data$ = makeSymbol("*DTP-JOIN-ORDERED-LINK-DATA*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $join_ordered_module$ = makeSymbol("*JOIN-ORDERED-MODULE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $max_subclause_spec_cartesian_product_cardinality$ = makeSymbol("*MAX-SUBCLAUSE-SPEC-CARTESIAN-PRODUCT-CARDINALITY*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol JOIN_ORDERED_LINK_DATA = makeSymbol("JOIN-ORDERED-LINK-DATA");

    private static final SubLSymbol JOIN_ORDERED_LINK_DATA_P = makeSymbol("JOIN-ORDERED-LINK-DATA-P");

    static private final SubLList $list2 = list(makeSymbol("FOCAL-PROOF-INDEX"), makeSymbol("NON-FOCAL-PROOF-INDEX"), makeSymbol("RESTRICTED-NON-FOCAL-LINK-INDEX"));

    static private final SubLList $list3 = list(makeKeyword("FOCAL-PROOF-INDEX"), makeKeyword("NON-FOCAL-PROOF-INDEX"), makeKeyword("RESTRICTED-NON-FOCAL-LINK-INDEX"));

    static private final SubLList $list4 = list(makeSymbol("JO-LINK-DATA-FOCAL-PROOF-INDEX"), makeSymbol("JO-LINK-DATA-NON-FOCAL-PROOF-INDEX"), makeSymbol("JO-LINK-DATA-RESTRICTED-NON-FOCAL-LINK-INDEX"));

    static private final SubLList $list5 = list(makeSymbol("_CSETF-JO-LINK-DATA-FOCAL-PROOF-INDEX"), makeSymbol("_CSETF-JO-LINK-DATA-NON-FOCAL-PROOF-INDEX"), makeSymbol("_CSETF-JO-LINK-DATA-RESTRICTED-NON-FOCAL-LINK-INDEX"));

    private static final SubLSymbol JOIN_ORDERED_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("JOIN-ORDERED-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("JOIN-ORDERED-LINK-DATA-P"));

    private static final SubLSymbol JO_LINK_DATA_FOCAL_PROOF_INDEX = makeSymbol("JO-LINK-DATA-FOCAL-PROOF-INDEX");

    private static final SubLSymbol _CSETF_JO_LINK_DATA_FOCAL_PROOF_INDEX = makeSymbol("_CSETF-JO-LINK-DATA-FOCAL-PROOF-INDEX");

    private static final SubLSymbol JO_LINK_DATA_NON_FOCAL_PROOF_INDEX = makeSymbol("JO-LINK-DATA-NON-FOCAL-PROOF-INDEX");

    private static final SubLSymbol _CSETF_JO_LINK_DATA_NON_FOCAL_PROOF_INDEX = makeSymbol("_CSETF-JO-LINK-DATA-NON-FOCAL-PROOF-INDEX");

    private static final SubLSymbol JO_LINK_DATA_RESTRICTED_NON_FOCAL_LINK_INDEX = makeSymbol("JO-LINK-DATA-RESTRICTED-NON-FOCAL-LINK-INDEX");

    private static final SubLSymbol _CSETF_JO_LINK_DATA_RESTRICTED_NON_FOCAL_LINK_INDEX = makeSymbol("_CSETF-JO-LINK-DATA-RESTRICTED-NON-FOCAL-LINK-INDEX");

    private static final SubLSymbol $FOCAL_PROOF_INDEX = makeKeyword("FOCAL-PROOF-INDEX");

    private static final SubLSymbol $NON_FOCAL_PROOF_INDEX = makeKeyword("NON-FOCAL-PROOF-INDEX");

    private static final SubLSymbol $RESTRICTED_NON_FOCAL_LINK_INDEX = makeKeyword("RESTRICTED-NON-FOCAL-LINK-INDEX");

    private static final SubLString $str18$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_JOIN_ORDERED_LINK_DATA = makeSymbol("MAKE-JOIN-ORDERED-LINK-DATA");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_JOIN_ORDERED_LINK_DATA_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-JOIN-ORDERED-LINK-DATA-METHOD");

    private static final SubLList $list27 = list(list(makeSymbol("BINDINGS-VAR"), makeSymbol("PROOF-VAR"), makeSymbol("JOIN-ORDERED-LINK")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym28$INDEX = makeUninternedSymbol("INDEX");

    static private final SubLSymbol $sym29$PROOF_LIST_VAR = makeUninternedSymbol("PROOF-LIST-VAR");

    private static final SubLSymbol JOIN_ORDERED_LINK_FOCAL_PROOF_INDEX = makeSymbol("JOIN-ORDERED-LINK-FOCAL-PROOF-INDEX");

    private static final SubLSymbol $sym34$INDEX = makeUninternedSymbol("INDEX");

    private static final SubLSymbol $sym35$PROOF_LIST_VAR = makeUninternedSymbol("PROOF-LIST-VAR");

    private static final SubLSymbol JOIN_ORDERED_LINK_NON_FOCAL_PROOF_INDEX = makeSymbol("JOIN-ORDERED-LINK-NON-FOCAL-PROOF-INDEX");

    private static final SubLList $list37 = list(list(makeSymbol("RESTRICTED-NON-FOCAL-PROBLEM-VAR"), makeSymbol("JOIN-ORDERED-LINK"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list38 = list($DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $sym41$LINK_VAR = makeUninternedSymbol("LINK-VAR");

    private static final SubLSymbol $sym42$RESTRICTION_LINK = makeUninternedSymbol("RESTRICTION-LINK");

    private static final SubLSymbol DO_PROBLEM_ARGUMENT_LINKS = makeSymbol("DO-PROBLEM-ARGUMENT-LINKS");

    private static final SubLSymbol JOIN_ORDERED_LINK_NON_FOCAL_PROBLEM = makeSymbol("JOIN-ORDERED-LINK-NON-FOCAL-PROBLEM");

    private static final SubLSymbol $sym48$NON_FOCAL_RESTRICTION_LINK_WITH_CORRESPONDING_FOCAL_PROOF_ = makeSymbol("NON-FOCAL-RESTRICTION-LINK-WITH-CORRESPONDING-FOCAL-PROOF?");

    private static final SubLSymbol PROBLEM_LINK_SOLE_SUPPORTING_PROBLEM = makeSymbol("PROBLEM-LINK-SOLE-SUPPORTING-PROBLEM");

    private static final SubLList $list50 = list(list(makeSymbol("JOIN-ORDERED-LINK-VAR"), makeSymbol("RESTRICTED-NON-FOCAL-PROBLEM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym51$RESTRICTION_LINK = makeUninternedSymbol("RESTRICTION-LINK");

    private static final SubLSymbol $sym52$NON_FOCAL_PROBLEM = makeUninternedSymbol("NON-FOCAL-PROBLEM");

    private static final SubLSymbol DO_PROBLEM_DEPENDENT_LINKS = makeSymbol("DO-PROBLEM-DEPENDENT-LINKS");

    private static final SubLSymbol PROBLEM_LINK_SUPPORTED_PROBLEM = makeSymbol("PROBLEM-LINK-SUPPORTED-PROBLEM");

    private static final SubLSymbol $sym55$JOIN_ORDERED_LINK_RESTRICTED_NON_FOCAL_LINK_ = makeSymbol("JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-LINK?");

    private static final SubLSymbol DO_JOIN_ORDERED_LINK_FOCAL_PROOFS = makeSymbol("DO-JOIN-ORDERED-LINK-FOCAL-PROOFS");

    private static final SubLSymbol DO_JOIN_ORDERED_LINK_NON_FOCAL_PROOFS = makeSymbol("DO-JOIN-ORDERED-LINK-NON-FOCAL-PROOFS");

    private static final SubLString $str58$Could_not_find_the_tactic_for__a = makeString("Could not find the tactic for ~a");

    private static final SubLSymbol JOIN_ORDERED_LINK_P = makeSymbol("JOIN-ORDERED-LINK-P");

    private static final SubLSymbol RESTRICTION_LINK_P = makeSymbol("RESTRICTION-LINK-P");

    private static final SubLInteger $int$21200 = makeInteger(21200);

    private static final SubLString $str69$Too_many_possible_matches_to_chec = makeString("Too many possible matches to check (~A) for problem ~S");

    private static final SubLSymbol $sym70$DUPLICATES_ = makeSymbol("DUPLICATES?");

    private static final SubLSymbol $sym71$HL_VAR_ = makeSymbol("HL-VAR?");

    private static final SubLSymbol STRATEGY_P = makeSymbol("STRATEGY-P");

    private static final SubLList $list75 = cons(makeSymbol("SUBPROOF"), makeSymbol("SUB-PROOF-BINDINGS"));

    private static final SubLSymbol MEMOIZED_FOCAL_TO_NON_FOCAL_VARIABLE_MAP_INT = makeSymbol("MEMOIZED-FOCAL-TO-NON-FOCAL-VARIABLE-MAP-INT");

    private static final SubLSymbol $sym77$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol MEMOIZED_NON_FOCAL_TO_FOCAL_VARIABLE_MAP_INT = makeSymbol("MEMOIZED-NON-FOCAL-TO-FOCAL-VARIABLE-MAP-INT");

    private static final SubLString $str79$Finding_or_creating_a_restricted_ = makeString("Finding or creating a restricted problem of ~a requires bindings");

    private static final SubLString $str80$Creating_a_restricted_problem_of_ = makeString("Creating a restricted problem of ~a requires bindings");

    private static final SubLList $list81 = list(makeSymbol("DO-JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-PROBLEMS"), makeSymbol("DO-VIRTUAL-DEPENDENT-JOIN-ORDERED-LINKS"));

    private static final SubLSymbol MEMOIZED_TRIGGER_VARS_SHARED_BY_SIBLING_INT = makeSymbol("MEMOIZED-TRIGGER-VARS-SHARED-BY-SIBLING-INT");

    private static final SubLSymbol VARIABLE_BINDING_VARIABLE = makeSymbol("VARIABLE-BINDING-VARIABLE");

    private static final SubLString $str85$_a_was_a_rejected_proof = makeString("~a was a rejected proof");

    private static final SubLSymbol $sym86$PROOF_PROVEN_ = makeSymbol("PROOF-PROVEN?");

    private static final SubLList $list88 = list(makeSymbol("MT"), makeSymbol("ASENT"));



    public static final SubLObject join_ordered_link_data_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject join_ordered_link_data_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject join_ordered_link_data_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.$join_ordered_link_data_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject join_ordered_link_data_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.$join_ordered_link_data_native.class ? T : NIL;
    }

    public static final SubLObject jo_link_data_focal_proof_index_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, JOIN_ORDERED_LINK_DATA_P);
        return v_object.getField2();
    }

    public static SubLObject jo_link_data_focal_proof_index(final SubLObject v_object) {
        assert NIL != inference_worker_join_ordered.join_ordered_link_data_p(v_object) : "! inference_worker_join_ordered.join_ordered_link_data_p(v_object) " + "inference_worker_join_ordered.join_ordered_link_data_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject jo_link_data_non_focal_proof_index_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, JOIN_ORDERED_LINK_DATA_P);
        return v_object.getField3();
    }

    public static SubLObject jo_link_data_non_focal_proof_index(final SubLObject v_object) {
        assert NIL != inference_worker_join_ordered.join_ordered_link_data_p(v_object) : "! inference_worker_join_ordered.join_ordered_link_data_p(v_object) " + "inference_worker_join_ordered.join_ordered_link_data_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject jo_link_data_restricted_non_focal_link_index_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, JOIN_ORDERED_LINK_DATA_P);
        return v_object.getField4();
    }

    public static SubLObject jo_link_data_restricted_non_focal_link_index(final SubLObject v_object) {
        assert NIL != inference_worker_join_ordered.join_ordered_link_data_p(v_object) : "! inference_worker_join_ordered.join_ordered_link_data_p(v_object) " + "inference_worker_join_ordered.join_ordered_link_data_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject _csetf_jo_link_data_focal_proof_index_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, JOIN_ORDERED_LINK_DATA_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_jo_link_data_focal_proof_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_worker_join_ordered.join_ordered_link_data_p(v_object) : "! inference_worker_join_ordered.join_ordered_link_data_p(v_object) " + "inference_worker_join_ordered.join_ordered_link_data_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_jo_link_data_non_focal_proof_index_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, JOIN_ORDERED_LINK_DATA_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_jo_link_data_non_focal_proof_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_worker_join_ordered.join_ordered_link_data_p(v_object) : "! inference_worker_join_ordered.join_ordered_link_data_p(v_object) " + "inference_worker_join_ordered.join_ordered_link_data_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_jo_link_data_restricted_non_focal_link_index_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, JOIN_ORDERED_LINK_DATA_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_jo_link_data_restricted_non_focal_link_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_worker_join_ordered.join_ordered_link_data_p(v_object) : "! inference_worker_join_ordered.join_ordered_link_data_p(v_object) " + "inference_worker_join_ordered.join_ordered_link_data_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject make_join_ordered_link_data_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.$join_ordered_link_data_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($FOCAL_PROOF_INDEX)) {
                        com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered._csetf_jo_link_data_focal_proof_index(v_new, current_value);
                    } else {
                        if (pcase_var.eql($NON_FOCAL_PROOF_INDEX)) {
                            com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered._csetf_jo_link_data_non_focal_proof_index(v_new, current_value);
                        } else {
                            if (pcase_var.eql($RESTRICTED_NON_FOCAL_LINK_INDEX)) {
                                com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered._csetf_jo_link_data_restricted_non_focal_link_index(v_new, current_value);
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

    public static SubLObject make_join_ordered_link_data(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.$join_ordered_link_data_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql(inference_worker_join_ordered.$FOCAL_PROOF_INDEX)) {
                inference_worker_join_ordered._csetf_jo_link_data_focal_proof_index(v_new, current_value);
            } else
                if (pcase_var.eql(inference_worker_join_ordered.$NON_FOCAL_PROOF_INDEX)) {
                    inference_worker_join_ordered._csetf_jo_link_data_non_focal_proof_index(v_new, current_value);
                } else
                    if (pcase_var.eql(inference_worker_join_ordered.$RESTRICTED_NON_FOCAL_LINK_INDEX)) {
                        inference_worker_join_ordered._csetf_jo_link_data_restricted_non_focal_link_index(v_new, current_value);
                    } else {
                        Errors.error(inference_worker_join_ordered.$str18$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_join_ordered_link_data(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, inference_worker_join_ordered.MAKE_JOIN_ORDERED_LINK_DATA, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, inference_worker_join_ordered.$FOCAL_PROOF_INDEX, inference_worker_join_ordered.jo_link_data_focal_proof_index(obj));
        funcall(visitor_fn, obj, $SLOT, inference_worker_join_ordered.$NON_FOCAL_PROOF_INDEX, inference_worker_join_ordered.jo_link_data_non_focal_proof_index(obj));
        funcall(visitor_fn, obj, $SLOT, inference_worker_join_ordered.$RESTRICTED_NON_FOCAL_LINK_INDEX, inference_worker_join_ordered.jo_link_data_restricted_non_focal_link_index(obj));
        funcall(visitor_fn, obj, $END, inference_worker_join_ordered.MAKE_JOIN_ORDERED_LINK_DATA, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_join_ordered_link_data_method(final SubLObject obj, final SubLObject visitor_fn) {
        return inference_worker_join_ordered.visit_defstruct_join_ordered_link_data(obj, visitor_fn);
    }

    public static final SubLObject valid_join_ordered_link_data_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_data_p(v_object)) && (NIL != dictionary.dictionary_p(com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.jo_link_data_focal_proof_index(v_object))));
    }

    public static SubLObject valid_join_ordered_link_data_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_worker_join_ordered.join_ordered_link_data_p(v_object)) && (NIL != dictionary_p(inference_worker_join_ordered.jo_link_data_focal_proof_index(v_object))));
    }

    public static final SubLObject new_join_ordered_link_data_alt() {
        {
            SubLObject data = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.make_join_ordered_link_data(UNPROVIDED);
            com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered._csetf_jo_link_data_focal_proof_index(data, dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
            com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered._csetf_jo_link_data_non_focal_proof_index(data, dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
            com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered._csetf_jo_link_data_restricted_non_focal_link_index(data, dictionary_contents.new_dictionary_contents(ZERO_INTEGER, symbol_function(EQ)));
            return data;
        }
    }

    public static SubLObject new_join_ordered_link_data() {
        final SubLObject data = inference_worker_join_ordered.make_join_ordered_link_data(UNPROVIDED);
        inference_worker_join_ordered._csetf_jo_link_data_focal_proof_index(data, new_dictionary(symbol_function(EQUAL), UNPROVIDED));
        inference_worker_join_ordered._csetf_jo_link_data_non_focal_proof_index(data, new_dictionary(symbol_function(EQUAL), UNPROVIDED));
        inference_worker_join_ordered._csetf_jo_link_data_restricted_non_focal_link_index(data, new_dictionary_contents(ZERO_INTEGER, symbol_function(EQ)));
        return data;
    }

    public static final SubLObject join_ordered_link_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_problem_link.problem_link_p(v_object)) && ($JOIN_ORDERED == inference_datastructures_problem_link.problem_link_type(v_object)));
    }

    public static SubLObject join_ordered_link_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_problem_link.problem_link_p(v_object)) && ($JOIN_ORDERED == inference_datastructures_problem_link.problem_link_type(v_object)));
    }

    /**
     *
     *
     * @return join-ordered-link-p, either the already existing one or a new one.
     */
    @LispMethod(comment = "@return join-ordered-link-p, either the already existing one or a new one.")
    public static final SubLObject maybe_new_join_ordered_link_alt(SubLObject supported_problem, SubLObject focal_supporting_mapped_problem, SubLObject non_focal_supporting_mapped_problem) {
        {
            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(supported_problem);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject candidate_link = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, candidate_link)) {
                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(candidate_link, $JOIN_ORDERED)) {
                            {
                                SubLObject candidate_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(candidate_link);
                                if (NIL != inference_datastructures_problem_link.mapped_problem_equal(focal_supporting_mapped_problem, candidate_mapped_problem)) {
                                    return candidate_link;
                                }
                            }
                        }
                    }
                }
            }
        }
        return com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.new_join_ordered_link(supported_problem, focal_supporting_mapped_problem, non_focal_supporting_mapped_problem);
    }

    /**
     *
     *
     * @return join-ordered-link-p, either the already existing one or a new one.
     */
    @LispMethod(comment = "@return join-ordered-link-p, either the already existing one or a new one.")
    public static SubLObject maybe_new_join_ordered_link(final SubLObject supported_problem, final SubLObject focal_supporting_mapped_problem, final SubLObject non_focal_supporting_mapped_problem) {
        final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(supported_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject candidate_link;
        SubLObject candidate_mapped_problem;
        for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
            candidate_link = do_set_contents_next(basis_object, state);
            if ((NIL != do_set_contents_element_validP(state, candidate_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(candidate_link, $JOIN_ORDERED))) {
                candidate_mapped_problem = inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(candidate_link);
                if (NIL != inference_datastructures_problem_link.mapped_problem_equal(focal_supporting_mapped_problem, candidate_mapped_problem)) {
                    return subl_promotions.values2(candidate_link, NIL);
                }
            }
        }
        return subl_promotions.values2(inference_worker_join_ordered.new_join_ordered_link(supported_problem, focal_supporting_mapped_problem, non_focal_supporting_mapped_problem), T);
    }

    public static final SubLObject new_join_ordered_link_alt(SubLObject supported_problem, SubLObject focal_supporting_mapped_problem, SubLObject non_focal_supporting_mapped_problem) {
        SubLTrampolineFile.checkType(focal_supporting_mapped_problem, MAPPED_PROBLEM_P);
        if (NIL != non_focal_supporting_mapped_problem) {
            SubLTrampolineFile.checkType(non_focal_supporting_mapped_problem, MAPPED_PROBLEM_P);
        }
        {
            SubLObject link = inference_datastructures_problem_link.new_problem_link($JOIN_ORDERED, supported_problem);
            SubLObject data = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.new_join_ordered_link_data();
            inference_datastructures_problem_link.set_problem_link_data(link, data);
            inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link(focal_supporting_mapped_problem, link);
            if (NIL != non_focal_supporting_mapped_problem) {
                inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link(non_focal_supporting_mapped_problem, link);
            }
            inference_worker.propagate_problem_link(link);
            return link;
        }
    }

    public static SubLObject new_join_ordered_link(final SubLObject supported_problem, final SubLObject focal_supporting_mapped_problem, final SubLObject non_focal_supporting_mapped_problem) {
        assert NIL != inference_datastructures_problem_link.mapped_problem_p(focal_supporting_mapped_problem) : "! inference_datastructures_problem_link.mapped_problem_p(focal_supporting_mapped_problem) " + ("inference_datastructures_problem_link.mapped_problem_p(focal_supporting_mapped_problem) " + "CommonSymbols.NIL != inference_datastructures_problem_link.mapped_problem_p(focal_supporting_mapped_problem) ") + focal_supporting_mapped_problem;
        if (((NIL != non_focal_supporting_mapped_problem) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == inference_datastructures_problem_link.mapped_problem_p(non_focal_supporting_mapped_problem))) {
            throw new AssertionError(non_focal_supporting_mapped_problem);
        }
        final SubLObject link = inference_datastructures_problem_link.new_problem_link($JOIN_ORDERED, supported_problem);
        final SubLObject data = inference_worker_join_ordered.new_join_ordered_link_data();
        inference_datastructures_problem_link.set_problem_link_data(link, data);
        inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link(focal_supporting_mapped_problem, link);
        if (NIL != non_focal_supporting_mapped_problem) {
            inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link(non_focal_supporting_mapped_problem, link);
        }
        return link;
    }

    public static final SubLObject destroy_join_ordered_link_alt(SubLObject join_ordered_link) {
        inference_worker_residual_transformation.destroy_join_ordered_link_wrt_residual_transformation_links(join_ordered_link);
        {
            SubLObject tactic = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_tactic(join_ordered_link);
            if (NIL != inference_datastructures_tactic.valid_tactic_p(tactic)) {
                inference_datastructures_tactic.destroy_problem_tactic_and_backpointers(tactic);
            }
        }
        {
            SubLObject data = inference_datastructures_problem_link.problem_link_data(join_ordered_link);
            if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.valid_join_ordered_link_data_p(data)) {
                dictionary.clear_dictionary(com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.jo_link_data_focal_proof_index(data));
                com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered._csetf_jo_link_data_focal_proof_index(data, $FREE);
                dictionary.clear_dictionary(com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.jo_link_data_non_focal_proof_index(data));
                com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered._csetf_jo_link_data_non_focal_proof_index(data, $FREE);
                dictionary_contents.clear_dictionary_contents(com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.jo_link_data_restricted_non_focal_link_index(data));
                com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered._csetf_jo_link_data_restricted_non_focal_link_index(data, $FREE);
            }
        }
        return join_ordered_link;
    }

    public static SubLObject destroy_join_ordered_link(final SubLObject join_ordered_link) {
        inference_worker_residual_transformation.destroy_join_ordered_link_wrt_residual_transformation_links(join_ordered_link);
        final SubLObject tactic = inference_worker_join_ordered.join_ordered_link_tactic(join_ordered_link);
        if (NIL != inference_datastructures_tactic.valid_tactic_p(tactic)) {
            inference_datastructures_tactic.destroy_problem_tactic_and_backpointers(tactic);
        }
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(join_ordered_link);
        if (NIL != inference_worker_join_ordered.valid_join_ordered_link_data_p(data)) {
            clear_dictionary(inference_worker_join_ordered.jo_link_data_focal_proof_index(data));
            inference_worker_join_ordered._csetf_jo_link_data_focal_proof_index(data, $FREE);
            clear_dictionary(inference_worker_join_ordered.jo_link_data_non_focal_proof_index(data));
            inference_worker_join_ordered._csetf_jo_link_data_non_focal_proof_index(data, $FREE);
            clear_dictionary_contents(inference_worker_join_ordered.jo_link_data_restricted_non_focal_link_index(data));
            inference_worker_join_ordered._csetf_jo_link_data_restricted_non_focal_link_index(data, $FREE);
        }
        return join_ordered_link;
    }

    public static final SubLObject do_join_ordered_link_focal_proofs_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt21);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject bindings_var = NIL;
                    SubLObject proof_var = NIL;
                    SubLObject join_ordered_link = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt21);
                    bindings_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt21);
                    proof_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt21);
                    join_ordered_link = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject index = $sym22$INDEX;
                            SubLObject proof_list_var = $sym23$PROOF_LIST_VAR;
                            return list(CLET, list(list(index, list(JOIN_ORDERED_LINK_FOCAL_PROOF_INDEX, join_ordered_link))), list(DO_DICTIONARY, list(bindings_var, proof_list_var, index), listS(DO_LIST, list(proof_var, proof_list_var), append(body, NIL))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt21);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_join_ordered_link_focal_proofs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, inference_worker_join_ordered.$list27);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject bindings_var = NIL;
        SubLObject proof_var = NIL;
        SubLObject join_ordered_link = NIL;
        destructuring_bind_must_consp(current, datum, inference_worker_join_ordered.$list27);
        bindings_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, inference_worker_join_ordered.$list27);
        proof_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, inference_worker_join_ordered.$list27);
        join_ordered_link = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject index = inference_worker_join_ordered.$sym28$INDEX;
            final SubLObject proof_list_var = inference_worker_join_ordered.$sym29$PROOF_LIST_VAR;
            return list(CLET, list(list(index, list(inference_worker_join_ordered.JOIN_ORDERED_LINK_FOCAL_PROOF_INDEX, join_ordered_link))), list(DO_DICTIONARY, list(bindings_var, proof_list_var, index), listS(DO_LIST, list(proof_var, proof_list_var), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, inference_worker_join_ordered.$list27);
        return NIL;
    }

    public static final SubLObject do_join_ordered_link_non_focal_proofs_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt21);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject bindings_var = NIL;
                    SubLObject proof_var = NIL;
                    SubLObject join_ordered_link = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt21);
                    bindings_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt21);
                    proof_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt21);
                    join_ordered_link = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject index = $sym28$INDEX;
                            SubLObject proof_list_var = $sym29$PROOF_LIST_VAR;
                            return list(CLET, list(list(index, list(JOIN_ORDERED_LINK_NON_FOCAL_PROOF_INDEX, join_ordered_link))), list(DO_DICTIONARY, list(bindings_var, proof_list_var, index), listS(DO_LIST, list(proof_var, proof_list_var), append(body, NIL))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt21);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_join_ordered_link_non_focal_proofs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, inference_worker_join_ordered.$list27);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject bindings_var = NIL;
        SubLObject proof_var = NIL;
        SubLObject join_ordered_link = NIL;
        destructuring_bind_must_consp(current, datum, inference_worker_join_ordered.$list27);
        bindings_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, inference_worker_join_ordered.$list27);
        proof_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, inference_worker_join_ordered.$list27);
        join_ordered_link = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject index = inference_worker_join_ordered.$sym34$INDEX;
            final SubLObject proof_list_var = inference_worker_join_ordered.$sym35$PROOF_LIST_VAR;
            return list(CLET, list(list(index, list(inference_worker_join_ordered.JOIN_ORDERED_LINK_NON_FOCAL_PROOF_INDEX, join_ordered_link))), list(DO_DICTIONARY, list(bindings_var, proof_list_var, index), listS(DO_LIST, list(proof_var, proof_list_var), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, inference_worker_join_ordered.$list27);
        return NIL;
    }

    /**
     * Iterate over all restricted non-focal problems of the JOIN-ORDERED-LINK.
     */
    @LispMethod(comment = "Iterate over all restricted non-focal problems of the JOIN-ORDERED-LINK.")
    public static final SubLObject do_join_ordered_link_restricted_non_focal_problems_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt31);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject restricted_non_focal_problem_var = NIL;
                    SubLObject join_ordered_link = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt31);
                    restricted_non_focal_problem_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt31);
                    join_ordered_link = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt31);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt31);
                            if (NIL == member(current_1, $list_alt32, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt31);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject link_var = $sym35$LINK_VAR;
                                SubLObject restriction_link = $sym36$RESTRICTION_LINK;
                                return list(CLET, list(list(link_var, join_ordered_link)), list(DO_PROBLEM_ARGUMENT_LINKS, list(restriction_link, list(JOIN_ORDERED_LINK_NON_FOCAL_PROBLEM, link_var), $TYPE, $RESTRICTION, $DONE, done), list(PWHEN, list($sym42$NON_FOCAL_RESTRICTION_LINK_WITH_CORRESPONDING_FOCAL_PROOF_, restriction_link, link_var), listS(CLET, list(list(restricted_non_focal_problem_var, list(PROBLEM_LINK_SOLE_SUPPORTING_PROBLEM, restriction_link))), append(body, NIL)))));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Iterate over all restricted non-focal problems of the JOIN-ORDERED-LINK.
     */
    @LispMethod(comment = "Iterate over all restricted non-focal problems of the JOIN-ORDERED-LINK.")
    public static SubLObject do_join_ordered_link_restricted_non_focal_problems(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, inference_worker_join_ordered.$list37);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject restricted_non_focal_problem_var = NIL;
        SubLObject join_ordered_link = NIL;
        destructuring_bind_must_consp(current, datum, inference_worker_join_ordered.$list37);
        restricted_non_focal_problem_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, inference_worker_join_ordered.$list37);
        join_ordered_link = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, inference_worker_join_ordered.$list37);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, inference_worker_join_ordered.$list37);
            if (NIL == member(current_$1, inference_worker_join_ordered.$list38, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == inference_worker_join_ordered.$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, inference_worker_join_ordered.$list37);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject link_var = inference_worker_join_ordered.$sym41$LINK_VAR;
        final SubLObject restriction_link = inference_worker_join_ordered.$sym42$RESTRICTION_LINK;
        return list(CLET, list(list(link_var, join_ordered_link)), list(inference_worker_join_ordered.DO_PROBLEM_ARGUMENT_LINKS, list(restriction_link, list(inference_worker_join_ordered.JOIN_ORDERED_LINK_NON_FOCAL_PROBLEM, link_var), $TYPE, $RESTRICTION, $DONE, done), list(PWHEN, list(inference_worker_join_ordered.$sym48$NON_FOCAL_RESTRICTION_LINK_WITH_CORRESPONDING_FOCAL_PROOF_, restriction_link, link_var), listS(CLET, list(list(restricted_non_focal_problem_var, list(inference_worker_join_ordered.PROBLEM_LINK_SOLE_SUPPORTING_PROBLEM, restriction_link))), append(body, NIL)))));
    }

    /**
     * Iterate over all join-ordered links of which RESTRICTED-NON-FOCAL-PROBLEM is a restricted non-focal problem.
     */
    @LispMethod(comment = "Iterate over all join-ordered links of which RESTRICTED-NON-FOCAL-PROBLEM is a restricted non-focal problem.")
    public static final SubLObject do_virtual_dependent_join_ordered_links_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt44);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject join_ordered_link_var = NIL;
                    SubLObject restricted_non_focal_problem = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt44);
                    join_ordered_link_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt44);
                    restricted_non_focal_problem = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_2 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt44);
                            current_2 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt44);
                            if (NIL == member(current_2, $list_alt32, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_2 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt44);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject restriction_link = $sym45$RESTRICTION_LINK;
                                SubLObject non_focal_problem = $sym46$NON_FOCAL_PROBLEM;
                                return list(DO_PROBLEM_DEPENDENT_LINKS, list(restriction_link, restricted_non_focal_problem, $TYPE, $RESTRICTION, $DONE, done), list(CLET, list(list(non_focal_problem, list(PROBLEM_LINK_SUPPORTED_PROBLEM, restriction_link))), list(DO_PROBLEM_DEPENDENT_LINKS, list(join_ordered_link_var, non_focal_problem, $TYPE, $JOIN_ORDERED, $DONE, done), list(PWHEN, list($sym49$JOIN_ORDERED_LINK_RESTRICTED_NON_FOCAL_LINK_, join_ordered_link_var, restriction_link), listS(PWHEN, list(EQ, non_focal_problem, list(JOIN_ORDERED_LINK_NON_FOCAL_PROBLEM, join_ordered_link_var)), append(body, NIL))))));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Iterate over all join-ordered links of which RESTRICTED-NON-FOCAL-PROBLEM is a restricted non-focal problem.
     */
    @LispMethod(comment = "Iterate over all join-ordered links of which RESTRICTED-NON-FOCAL-PROBLEM is a restricted non-focal problem.")
    public static SubLObject do_virtual_dependent_join_ordered_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, inference_worker_join_ordered.$list50);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject join_ordered_link_var = NIL;
        SubLObject restricted_non_focal_problem = NIL;
        destructuring_bind_must_consp(current, datum, inference_worker_join_ordered.$list50);
        join_ordered_link_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, inference_worker_join_ordered.$list50);
        restricted_non_focal_problem = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, inference_worker_join_ordered.$list50);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, inference_worker_join_ordered.$list50);
            if (NIL == member(current_$2, inference_worker_join_ordered.$list38, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == inference_worker_join_ordered.$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, inference_worker_join_ordered.$list50);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject restriction_link = inference_worker_join_ordered.$sym51$RESTRICTION_LINK;
        final SubLObject non_focal_problem = inference_worker_join_ordered.$sym52$NON_FOCAL_PROBLEM;
        return list(inference_worker_join_ordered.DO_PROBLEM_DEPENDENT_LINKS, list(restriction_link, restricted_non_focal_problem, $TYPE, $RESTRICTION, $DONE, done), list(CLET, list(list(non_focal_problem, list(inference_worker_join_ordered.PROBLEM_LINK_SUPPORTED_PROBLEM, restriction_link))), list(inference_worker_join_ordered.DO_PROBLEM_DEPENDENT_LINKS, list(join_ordered_link_var, non_focal_problem, $TYPE, $JOIN_ORDERED, $DONE, done), list(PWHEN, list(inference_worker_join_ordered.$sym55$JOIN_ORDERED_LINK_RESTRICTED_NON_FOCAL_LINK_, join_ordered_link_var, restriction_link), listS(PWHEN, list(EQ, non_focal_problem, list(inference_worker_join_ordered.JOIN_ORDERED_LINK_NON_FOCAL_PROBLEM, join_ordered_link_var)), append(body, NIL))))));
    }

    public static final SubLObject join_ordered_link_focal_proof_index_alt(SubLObject join_ordered_link) {
        return com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.jo_link_data_focal_proof_index(inference_datastructures_problem_link.problem_link_data(join_ordered_link));
    }

    public static SubLObject join_ordered_link_focal_proof_index(final SubLObject join_ordered_link) {
        return inference_worker_join_ordered.jo_link_data_focal_proof_index(inference_datastructures_problem_link.problem_link_data(join_ordered_link));
    }

    public static final SubLObject join_ordered_link_non_focal_proof_index_alt(SubLObject join_ordered_link) {
        return com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.jo_link_data_non_focal_proof_index(inference_datastructures_problem_link.problem_link_data(join_ordered_link));
    }

    public static SubLObject join_ordered_link_non_focal_proof_index(final SubLObject join_ordered_link) {
        return inference_worker_join_ordered.jo_link_data_non_focal_proof_index(inference_datastructures_problem_link.problem_link_data(join_ordered_link));
    }

    public static final SubLObject join_ordered_link_restricted_non_focal_link_index_alt(SubLObject join_ordered_link) {
        return com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.jo_link_data_restricted_non_focal_link_index(inference_datastructures_problem_link.problem_link_data(join_ordered_link));
    }

    public static SubLObject join_ordered_link_restricted_non_focal_link_index(final SubLObject join_ordered_link) {
        return inference_worker_join_ordered.jo_link_data_restricted_non_focal_link_index(inference_datastructures_problem_link.problem_link_data(join_ordered_link));
    }

    /**
     * The restriction link triggered by PROOF when PROOF bubbled up through JOIN-ORDERED-LINK's focal side
     */
    @LispMethod(comment = "The restriction link triggered by PROOF when PROOF bubbled up through JOIN-ORDERED-LINK\'s focal side")
    public static final SubLObject join_ordered_link_triggered_restriction_link_alt(SubLObject join_ordered_link, SubLObject proof) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_restricted_non_focal_link_index(join_ordered_link));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject restriction_link = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject candidate_proof = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (proof == candidate_proof) {
                            return restriction_link;
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return NIL;
        }
    }

    /**
     * The restriction link triggered by PROOF when PROOF bubbled up through JOIN-ORDERED-LINK's focal side
     */
    @LispMethod(comment = "The restriction link triggered by PROOF when PROOF bubbled up through JOIN-ORDERED-LINK\'s focal side")
    public static SubLObject join_ordered_link_triggered_restriction_link(final SubLObject join_ordered_link, final SubLObject proof) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = do_dictionary_contents_state(inference_worker_join_ordered.join_ordered_link_restricted_non_focal_link_index(join_ordered_link)); NIL == do_dictionary_contents_doneP(iteration_state); iteration_state = do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject restriction_link = do_dictionary_contents_key_value(iteration_state);
            final SubLObject candidate_proof = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (proof.eql(candidate_proof)) {
                return restriction_link;
            }
        }
        do_dictionary_contents_finalize(iteration_state);
        return NIL;
    }

    /**
     * The restricted non-focal problem triggered by PROOF when PROOF bubbled up through JOIN-ORDERED-LINK's focal side
     */
    @LispMethod(comment = "The restricted non-focal problem triggered by PROOF when PROOF bubbled up through JOIN-ORDERED-LINK\'s focal side")
    public static final SubLObject join_ordered_link_triggered_restricted_non_focal_alt(SubLObject join_ordered_link, SubLObject proof) {
        {
            SubLObject triggered_restriction_link = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_triggered_restriction_link(join_ordered_link, proof);
            return NIL != triggered_restriction_link ? ((SubLObject) (inference_datastructures_problem_link.problem_link_sole_supporting_problem(triggered_restriction_link))) : NIL;
        }
    }

    /**
     * The restricted non-focal problem triggered by PROOF when PROOF bubbled up through JOIN-ORDERED-LINK's focal side
     */
    @LispMethod(comment = "The restricted non-focal problem triggered by PROOF when PROOF bubbled up through JOIN-ORDERED-LINK\'s focal side")
    public static SubLObject join_ordered_link_triggered_restricted_non_focal(final SubLObject join_ordered_link, final SubLObject proof) {
        final SubLObject triggered_restriction_link = inference_worker_join_ordered.join_ordered_link_triggered_restriction_link(join_ordered_link, proof);
        return NIL != triggered_restriction_link ? inference_datastructures_problem_link.problem_link_sole_supporting_problem(triggered_restriction_link) : NIL;
    }

    public static final SubLObject join_ordered_link_restricted_non_focal_links_alt(SubLObject join_ordered_link) {
        return dictionary_contents.dictionary_contents_keys(com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_restricted_non_focal_link_index(join_ordered_link));
    }

    public static SubLObject join_ordered_link_restricted_non_focal_links(final SubLObject join_ordered_link) {
        return dictionary_contents_keys(inference_worker_join_ordered.join_ordered_link_restricted_non_focal_link_index(join_ordered_link));
    }

    /**
     * The proof that, when bubbling up to JOIN-ORDERED-LINK, triggered the creation of RESTRICTION-LINK
     */
    @LispMethod(comment = "The proof that, when bubbling up to JOIN-ORDERED-LINK, triggered the creation of RESTRICTION-LINK")
    public static final SubLObject join_ordered_link_restricted_non_focal_triggering_proof_alt(SubLObject join_ordered_link, SubLObject restriction_link) {
        {
            SubLObject dict_contents = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_restricted_non_focal_link_index(join_ordered_link);
            SubLObject proof = dictionary_contents.dictionary_contents_lookup(dict_contents, restriction_link, symbol_function(EQ), UNPROVIDED);
            if (NIL != inference_datastructures_proof.valid_proof_p(proof)) {
                return proof;
            }
        }
        return NIL;
    }

    /**
     * The proof that, when bubbling up to JOIN-ORDERED-LINK, triggered the creation of RESTRICTION-LINK
     */
    @LispMethod(comment = "The proof that, when bubbling up to JOIN-ORDERED-LINK, triggered the creation of RESTRICTION-LINK")
    public static SubLObject join_ordered_link_restricted_non_focal_triggering_proof(final SubLObject join_ordered_link, final SubLObject restriction_link) {
        final SubLObject dict_contents = inference_worker_join_ordered.join_ordered_link_restricted_non_focal_link_index(join_ordered_link);
        final SubLObject proof = dictionary_contents_lookup_without_values(dict_contents, restriction_link, symbol_function(EQ), UNPROVIDED);
        if (NIL != inference_datastructures_proof.valid_proof_p(proof)) {
            return proof;
        }
        return NIL;
    }

    public static final SubLObject join_ordered_link_focal_mapped_problem_alt(SubLObject join_ordered_link) {
        return last(inference_datastructures_problem_link.problem_link_supporting_mapped_problems(join_ordered_link), UNPROVIDED).first();
    }

    public static SubLObject join_ordered_link_focal_mapped_problem(final SubLObject join_ordered_link) {
        return last(inference_datastructures_problem_link.problem_link_supporting_mapped_problems(join_ordered_link), UNPROVIDED).first();
    }

    public static final SubLObject join_ordered_link_has_non_focal_mapped_problemP_alt(SubLObject join_ordered_link) {
        return list_utilities.doubletonP(inference_datastructures_problem_link.problem_link_supporting_mapped_problems(join_ordered_link));
    }

    public static SubLObject join_ordered_link_has_non_focal_mapped_problemP(final SubLObject join_ordered_link) {
        return doubletonP(inference_datastructures_problem_link.problem_link_supporting_mapped_problems(join_ordered_link));
    }

    public static final SubLObject join_ordered_link_non_focal_mapped_problem_alt(SubLObject join_ordered_link) {
        if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_non_focal_manifestedP(join_ordered_link)) {
            return inference_datastructures_problem_link.problem_link_supporting_mapped_problems(join_ordered_link).first();
        } else {
            return com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.lazily_create_join_ordered_link_non_focal_mapped_problem(join_ordered_link);
        }
    }

    public static SubLObject join_ordered_link_non_focal_mapped_problem(final SubLObject join_ordered_link) {
        if (NIL != inference_worker_join_ordered.join_ordered_link_non_focal_manifestedP(join_ordered_link)) {
            return inference_datastructures_problem_link.problem_link_supporting_mapped_problems(join_ordered_link).first();
        }
        return inference_worker_join_ordered.lazily_create_join_ordered_link_non_focal_mapped_problem(join_ordered_link);
    }

    public static final SubLObject join_ordered_link_non_focal_manifestedP_alt(SubLObject join_ordered_link) {
        return list_utilities.doubletonP(inference_datastructures_problem_link.problem_link_supporting_mapped_problems(join_ordered_link));
    }

    public static SubLObject join_ordered_link_non_focal_manifestedP(final SubLObject join_ordered_link) {
        return doubletonP(inference_datastructures_problem_link.problem_link_supporting_mapped_problems(join_ordered_link));
    }

    public static final SubLObject join_ordered_link_focal_problem_alt(SubLObject join_ordered_link) {
        return inference_datastructures_problem_link.mapped_problem_problem(com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(join_ordered_link));
    }

    public static SubLObject join_ordered_link_focal_problem(final SubLObject join_ordered_link) {
        return inference_datastructures_problem_link.mapped_problem_problem(inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(join_ordered_link));
    }

    public static final SubLObject join_ordered_link_non_focal_problem_alt(SubLObject join_ordered_link) {
        return inference_datastructures_problem_link.mapped_problem_problem(com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_non_focal_mapped_problem(join_ordered_link));
    }

    public static SubLObject join_ordered_link_non_focal_problem(final SubLObject join_ordered_link) {
        return inference_datastructures_problem_link.mapped_problem_problem(inference_worker_join_ordered.join_ordered_link_non_focal_mapped_problem(join_ordered_link));
    }

    /**
     * Returns the supporting mapped problem of JOIN-ORDERED-LINK that is not eq to WRONG-MAPPED-PROBLEM.
     * Will manifest the non-focal if necessary.
     */
    @LispMethod(comment = "Returns the supporting mapped problem of JOIN-ORDERED-LINK that is not eq to WRONG-MAPPED-PROBLEM.\r\nWill manifest the non-focal if necessary.\nReturns the supporting mapped problem of JOIN-ORDERED-LINK that is not eq to WRONG-MAPPED-PROBLEM.\nWill manifest the non-focal if necessary.")
    public static final SubLObject join_ordered_link_other_mapped_problem_alt(SubLObject join_ordered_link, SubLObject wrong_mapped_problem) {
        {
            SubLObject other_mapped_problem = inference_datastructures_problem_link.problem_link_supporting_mapped_problem_that_isnt(join_ordered_link, wrong_mapped_problem);
            return NIL != other_mapped_problem ? ((SubLObject) (other_mapped_problem)) : com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.lazily_create_join_ordered_link_non_focal_mapped_problem(join_ordered_link);
        }
    }

    /**
     * Returns the supporting mapped problem of JOIN-ORDERED-LINK that is not eq to WRONG-MAPPED-PROBLEM.
     * Will manifest the non-focal if necessary.
     */
    @LispMethod(comment = "Returns the supporting mapped problem of JOIN-ORDERED-LINK that is not eq to WRONG-MAPPED-PROBLEM.\r\nWill manifest the non-focal if necessary.\nReturns the supporting mapped problem of JOIN-ORDERED-LINK that is not eq to WRONG-MAPPED-PROBLEM.\nWill manifest the non-focal if necessary.")
    public static SubLObject join_ordered_link_other_mapped_problem(final SubLObject join_ordered_link, final SubLObject wrong_mapped_problem) {
        final SubLObject other_mapped_problem = inference_datastructures_problem_link.problem_link_supporting_mapped_problem_that_isnt(join_ordered_link, wrong_mapped_problem);
        return NIL != other_mapped_problem ? other_mapped_problem : inference_worker_join_ordered.lazily_create_join_ordered_link_non_focal_mapped_problem(join_ordered_link);
    }

    public static final SubLObject join_ordered_link_focal_proofs_lookup_alt(SubLObject join_ordered_link, SubLObject proof_bindings) {
        {
            SubLObject index = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_focal_proof_index(join_ordered_link);
            SubLObject canonical_proof_bindings = inference_worker.canonicalize_proof_bindings(proof_bindings);
            SubLObject focal_proofs = dictionary.dictionary_lookup_without_values(index, canonical_proof_bindings, UNPROVIDED);
            return focal_proofs;
        }
    }

    public static SubLObject join_ordered_link_focal_proofs_lookup(final SubLObject join_ordered_link, final SubLObject proof_bindings) {
        final SubLObject index = inference_worker_join_ordered.join_ordered_link_focal_proof_index(join_ordered_link);
        final SubLObject canonical_proof_bindings = inference_worker.canonicalize_proof_bindings(proof_bindings);
        final SubLObject focal_proofs = dictionary_lookup_without_values(index, canonical_proof_bindings, UNPROVIDED);
        return focal_proofs;
    }

    public static final SubLObject join_ordered_link_non_focal_proofs_lookup_alt(SubLObject join_ordered_link, SubLObject proof_bindings) {
        {
            SubLObject index = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_non_focal_proof_index(join_ordered_link);
            SubLObject canonical_proof_bindings = inference_worker.canonicalize_proof_bindings(proof_bindings);
            SubLObject non_focal_proofs = dictionary.dictionary_lookup_without_values(index, canonical_proof_bindings, UNPROVIDED);
            return non_focal_proofs;
        }
    }

    public static SubLObject join_ordered_link_non_focal_proofs_lookup(final SubLObject join_ordered_link, final SubLObject proof_bindings) {
        final SubLObject index = inference_worker_join_ordered.join_ordered_link_non_focal_proof_index(join_ordered_link);
        final SubLObject canonical_proof_bindings = inference_worker.canonicalize_proof_bindings(proof_bindings);
        final SubLObject non_focal_proofs = dictionary_lookup_without_values(index, canonical_proof_bindings, UNPROVIDED);
        return non_focal_proofs;
    }

    /**
     *
     *
     * @return tactic-p; the tactic which created JOIN-ORDERED-LINK
     */
    @LispMethod(comment = "@return tactic-p; the tactic which created JOIN-ORDERED-LINK")
    public static final SubLObject join_ordered_link_tactic_alt(SubLObject join_ordered_link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(join_ordered_link);
                SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(supported_problem);
                SubLObject join_ordered_tactic = NIL;
                for (join_ordered_tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , join_ordered_tactic = cdolist_list_var.first()) {
                    if (NIL != inference_datastructures_problem.do_problem_tactics_hl_module_match(join_ordered_tactic, $join_ordered_module$.getDynamicValue(thread))) {
                        if (join_ordered_link == com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_tactic_link(join_ordered_tactic)) {
                            return join_ordered_tactic;
                        }
                    }
                }
                if (NIL == inference_datastructures_problem.tactically_unexamined_problem_p(supported_problem)) {
                    return Errors.error($str_alt52$Could_not_find_the_tactic_for__a, join_ordered_link);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return tactic-p; the tactic which created JOIN-ORDERED-LINK
     */
    @LispMethod(comment = "@return tactic-p; the tactic which created JOIN-ORDERED-LINK")
    public static SubLObject join_ordered_link_tactic(final SubLObject join_ordered_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(join_ordered_link);
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(supported_problem);
        SubLObject join_ordered_tactic = NIL;
        join_ordered_tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != inference_datastructures_problem.do_problem_tactics_hl_module_match(join_ordered_tactic, inference_worker_join_ordered.$join_ordered_module$.getDynamicValue(thread))) && join_ordered_link.eql(inference_worker_join_ordered.join_ordered_tactic_link(join_ordered_tactic))) {
                return join_ordered_tactic;
            }
            cdolist_list_var = cdolist_list_var.rest();
            join_ordered_tactic = cdolist_list_var.first();
        } 
        if (NIL == inference_datastructures_problem.tactically_unexamined_problem_p(supported_problem)) {
            return Errors.error(inference_worker_join_ordered.$str58$Could_not_find_the_tactic_for__a, join_ordered_link);
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; true iff RESTRICTION-LINK is a restricted non-focal link of JOIN-ORDERED-LINK
     */
    @LispMethod(comment = "@return booleanp; true iff RESTRICTION-LINK is a restricted non-focal link of JOIN-ORDERED-LINK")
    public static final SubLObject join_ordered_link_restricted_non_focal_linkP_alt(SubLObject join_ordered_link, SubLObject restriction_link) {
        return set_contents.set_contents_memberP(restriction_link, com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_restricted_non_focal_links(join_ordered_link), symbol_function(EQ));
    }

    /**
     *
     *
     * @return booleanp; true iff RESTRICTION-LINK is a restricted non-focal link of JOIN-ORDERED-LINK
     */
    @LispMethod(comment = "@return booleanp; true iff RESTRICTION-LINK is a restricted non-focal link of JOIN-ORDERED-LINK")
    public static SubLObject join_ordered_link_restricted_non_focal_linkP(final SubLObject join_ordered_link, final SubLObject restriction_link) {
        return sublisp_boolean(dictionary_contents_lookup_without_values(inference_worker_join_ordered.join_ordered_link_restricted_non_focal_link_index(join_ordered_link), restriction_link, symbol_function(EQ), NIL));
    }

    /**
     *
     *
     * @return integerp; the number of restricted non-focal links of JOIN-ORDERED-LINK
     */
    @LispMethod(comment = "@return integerp; the number of restricted non-focal links of JOIN-ORDERED-LINK")
    public static final SubLObject join_ordered_link_restricted_non_focal_count_alt(SubLObject join_ordered_link) {
        return set_contents.set_contents_size(com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_restricted_non_focal_links(join_ordered_link));
    }

    /**
     *
     *
     * @return integerp; the number of restricted non-focal links of JOIN-ORDERED-LINK
     */
    @LispMethod(comment = "@return integerp; the number of restricted non-focal links of JOIN-ORDERED-LINK")
    public static SubLObject join_ordered_link_restricted_non_focal_count(final SubLObject join_ordered_link) {
        return dictionary_contents_size(inference_worker_join_ordered.join_ordered_link_restricted_non_focal_link_index(join_ordered_link));
    }

    /**
     * Indexes PROOF by BINDINGS as a focal proof in JOIN-ORDERED-LINK
     */
    @LispMethod(comment = "Indexes PROOF by BINDINGS as a focal proof in JOIN-ORDERED-LINK")
    public static final SubLObject add_join_ordered_link_focal_proof_alt(SubLObject join_ordered_link, SubLObject v_bindings, SubLObject proof) {
        SubLTrampolineFile.checkType(join_ordered_link, JOIN_ORDERED_LINK_P);
        SubLTrampolineFile.checkType(proof, PROOF_P);
        {
            SubLObject index = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_focal_proof_index(join_ordered_link);
            SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings(v_bindings);
            dictionary_utilities.dictionary_push(index, canonical_bindings, proof);
        }
        return join_ordered_link;
    }

    /**
     * Indexes PROOF by BINDINGS as a focal proof in JOIN-ORDERED-LINK
     */
    @LispMethod(comment = "Indexes PROOF by BINDINGS as a focal proof in JOIN-ORDERED-LINK")
    public static SubLObject add_join_ordered_link_focal_proof(final SubLObject join_ordered_link, final SubLObject v_bindings, final SubLObject proof) {
        assert NIL != inference_worker_join_ordered.join_ordered_link_p(join_ordered_link) : "! inference_worker_join_ordered.join_ordered_link_p(join_ordered_link) " + ("inference_worker_join_ordered.join_ordered_link_p(join_ordered_link) " + "CommonSymbols.NIL != inference_worker_join_ordered.join_ordered_link_p(join_ordered_link) ") + join_ordered_link;
        assert NIL != inference_datastructures_proof.proof_p(proof) : "! inference_datastructures_proof.proof_p(proof) " + ("inference_datastructures_proof.proof_p(proof) " + "CommonSymbols.NIL != inference_datastructures_proof.proof_p(proof) ") + proof;
        final SubLObject index = inference_worker_join_ordered.join_ordered_link_focal_proof_index(join_ordered_link);
        final SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings(v_bindings);
        dictionary_pushnew(index, canonical_bindings, proof, symbol_function(EQ), UNPROVIDED);
        return join_ordered_link;
    }

    /**
     * Unindexes PROOF by BINDINGS as a focal proof in JOIN-ORDERED-LINK
     */
    @LispMethod(comment = "Unindexes PROOF by BINDINGS as a focal proof in JOIN-ORDERED-LINK")
    public static final SubLObject remove_join_ordered_link_focal_proof_alt(SubLObject join_ordered_link, SubLObject v_bindings, SubLObject proof) {
        SubLTrampolineFile.checkType(join_ordered_link, JOIN_ORDERED_LINK_P);
        SubLTrampolineFile.checkType(proof, PROOF_P);
        {
            SubLObject index = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_focal_proof_index(join_ordered_link);
            SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings(v_bindings);
            dictionary_utilities.dictionary_delete_from_value(index, canonical_bindings, proof, UNPROVIDED, UNPROVIDED);
        }
        return join_ordered_link;
    }

    /**
     * Unindexes PROOF by BINDINGS as a focal proof in JOIN-ORDERED-LINK
     */
    @LispMethod(comment = "Unindexes PROOF by BINDINGS as a focal proof in JOIN-ORDERED-LINK")
    public static SubLObject remove_join_ordered_link_focal_proof(final SubLObject join_ordered_link, final SubLObject v_bindings, final SubLObject proof) {
        assert NIL != inference_worker_join_ordered.join_ordered_link_p(join_ordered_link) : "! inference_worker_join_ordered.join_ordered_link_p(join_ordered_link) " + ("inference_worker_join_ordered.join_ordered_link_p(join_ordered_link) " + "CommonSymbols.NIL != inference_worker_join_ordered.join_ordered_link_p(join_ordered_link) ") + join_ordered_link;
        assert NIL != inference_datastructures_proof.proof_p(proof) : "! inference_datastructures_proof.proof_p(proof) " + ("inference_datastructures_proof.proof_p(proof) " + "CommonSymbols.NIL != inference_datastructures_proof.proof_p(proof) ") + proof;
        final SubLObject index = inference_worker_join_ordered.join_ordered_link_focal_proof_index(join_ordered_link);
        final SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings(v_bindings);
        dictionary_delete_from_value(index, canonical_bindings, proof, UNPROVIDED, UNPROVIDED);
        return join_ordered_link;
    }

    /**
     * Indexes PROOF by BINDINGS as a non-focal proof in JOIN-ORDERED-LINK
     */
    @LispMethod(comment = "Indexes PROOF by BINDINGS as a non-focal proof in JOIN-ORDERED-LINK")
    public static final SubLObject add_join_ordered_link_non_focal_proof_alt(SubLObject join_ordered_link, SubLObject v_bindings, SubLObject proof) {
        SubLTrampolineFile.checkType(join_ordered_link, JOIN_ORDERED_LINK_P);
        SubLTrampolineFile.checkType(proof, PROOF_P);
        {
            SubLObject index = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_non_focal_proof_index(join_ordered_link);
            SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings(v_bindings);
            dictionary_utilities.dictionary_push(index, canonical_bindings, proof);
        }
        return join_ordered_link;
    }

    /**
     * Indexes PROOF by BINDINGS as a non-focal proof in JOIN-ORDERED-LINK
     */
    @LispMethod(comment = "Indexes PROOF by BINDINGS as a non-focal proof in JOIN-ORDERED-LINK")
    public static SubLObject add_join_ordered_link_non_focal_proof(final SubLObject join_ordered_link, final SubLObject v_bindings, final SubLObject proof) {
        assert NIL != inference_worker_join_ordered.join_ordered_link_p(join_ordered_link) : "! inference_worker_join_ordered.join_ordered_link_p(join_ordered_link) " + ("inference_worker_join_ordered.join_ordered_link_p(join_ordered_link) " + "CommonSymbols.NIL != inference_worker_join_ordered.join_ordered_link_p(join_ordered_link) ") + join_ordered_link;
        assert NIL != inference_datastructures_proof.proof_p(proof) : "! inference_datastructures_proof.proof_p(proof) " + ("inference_datastructures_proof.proof_p(proof) " + "CommonSymbols.NIL != inference_datastructures_proof.proof_p(proof) ") + proof;
        final SubLObject index = inference_worker_join_ordered.join_ordered_link_non_focal_proof_index(join_ordered_link);
        final SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings(v_bindings);
        dictionary_pushnew(index, canonical_bindings, proof, symbol_function(EQ), UNPROVIDED);
        return join_ordered_link;
    }

    /**
     * Unindexes PROOF by BINDINGS as a non-focal proof in JOIN-ORDERED-LINK
     */
    @LispMethod(comment = "Unindexes PROOF by BINDINGS as a non-focal proof in JOIN-ORDERED-LINK")
    public static final SubLObject remove_join_ordered_link_non_focal_proof_alt(SubLObject join_ordered_link, SubLObject v_bindings, SubLObject proof) {
        SubLTrampolineFile.checkType(join_ordered_link, JOIN_ORDERED_LINK_P);
        SubLTrampolineFile.checkType(proof, PROOF_P);
        {
            SubLObject index = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_non_focal_proof_index(join_ordered_link);
            SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings(v_bindings);
            dictionary_utilities.dictionary_delete_from_value(index, canonical_bindings, proof, UNPROVIDED, UNPROVIDED);
        }
        return join_ordered_link;
    }

    /**
     * Unindexes PROOF by BINDINGS as a non-focal proof in JOIN-ORDERED-LINK
     */
    @LispMethod(comment = "Unindexes PROOF by BINDINGS as a non-focal proof in JOIN-ORDERED-LINK")
    public static SubLObject remove_join_ordered_link_non_focal_proof(final SubLObject join_ordered_link, final SubLObject v_bindings, final SubLObject proof) {
        assert NIL != inference_worker_join_ordered.join_ordered_link_p(join_ordered_link) : "! inference_worker_join_ordered.join_ordered_link_p(join_ordered_link) " + ("inference_worker_join_ordered.join_ordered_link_p(join_ordered_link) " + "CommonSymbols.NIL != inference_worker_join_ordered.join_ordered_link_p(join_ordered_link) ") + join_ordered_link;
        assert NIL != inference_datastructures_proof.proof_p(proof) : "! inference_datastructures_proof.proof_p(proof) " + ("inference_datastructures_proof.proof_p(proof) " + "CommonSymbols.NIL != inference_datastructures_proof.proof_p(proof) ") + proof;
        final SubLObject index = inference_worker_join_ordered.join_ordered_link_non_focal_proof_index(join_ordered_link);
        final SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings(v_bindings);
        dictionary_delete_from_value(index, canonical_bindings, proof, UNPROVIDED, UNPROVIDED);
        return join_ordered_link;
    }

    public static final SubLObject add_join_ordered_link_restricted_non_focal_link_alt(SubLObject join_ordered_link, SubLObject restriction_link, SubLObject trigger_proof) {
        SubLTrampolineFile.checkType(join_ordered_link, JOIN_ORDERED_LINK_P);
        SubLTrampolineFile.checkType(restriction_link, RESTRICTION_LINK_P);
        SubLTrampolineFile.checkType(trigger_proof, PROOF_P);
        {
            SubLObject dict_contents = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_restricted_non_focal_link_index(join_ordered_link);
            dict_contents = dictionary_contents.dictionary_contents_enter(dict_contents, restriction_link, trigger_proof, symbol_function(EQ));
            com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered._csetf_jo_link_data_restricted_non_focal_link_index(inference_datastructures_problem_link.problem_link_data(join_ordered_link), dict_contents);
        }
        return join_ordered_link;
    }

    public static SubLObject add_join_ordered_link_restricted_non_focal_link(final SubLObject join_ordered_link, final SubLObject restriction_link, final SubLObject trigger_proof) {
        assert NIL != inference_worker_join_ordered.join_ordered_link_p(join_ordered_link) : "! inference_worker_join_ordered.join_ordered_link_p(join_ordered_link) " + ("inference_worker_join_ordered.join_ordered_link_p(join_ordered_link) " + "CommonSymbols.NIL != inference_worker_join_ordered.join_ordered_link_p(join_ordered_link) ") + join_ordered_link;
        assert NIL != inference_worker_restriction.restriction_link_p(restriction_link) : "! inference_worker_restriction.restriction_link_p(restriction_link) " + ("inference_worker_restriction.restriction_link_p(restriction_link) " + "CommonSymbols.NIL != inference_worker_restriction.restriction_link_p(restriction_link) ") + restriction_link;
        assert NIL != inference_datastructures_proof.proof_p(trigger_proof) : "! inference_datastructures_proof.proof_p(trigger_proof) " + ("inference_datastructures_proof.proof_p(trigger_proof) " + "CommonSymbols.NIL != inference_datastructures_proof.proof_p(trigger_proof) ") + trigger_proof;
        SubLObject dict_contents = inference_worker_join_ordered.join_ordered_link_restricted_non_focal_link_index(join_ordered_link);
        dict_contents = dictionary_contents_enter(dict_contents, restriction_link, trigger_proof, symbol_function(EQ));
        inference_worker_join_ordered._csetf_jo_link_data_restricted_non_focal_link_index(inference_datastructures_problem_link.problem_link_data(join_ordered_link), dict_contents);
        return join_ordered_link;
    }

    public static final SubLObject remove_join_ordered_link_restricted_non_focal_link_alt(SubLObject join_ordered_link, SubLObject restriction_link) {
        SubLTrampolineFile.checkType(join_ordered_link, JOIN_ORDERED_LINK_P);
        {
            SubLObject dict_contents = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_restricted_non_focal_link_index(join_ordered_link);
            dict_contents = dictionary_contents.dictionary_contents_delete(dict_contents, restriction_link, symbol_function(EQ));
            com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered._csetf_jo_link_data_restricted_non_focal_link_index(inference_datastructures_problem_link.problem_link_data(join_ordered_link), dict_contents);
        }
        return join_ordered_link;
    }

    public static SubLObject remove_join_ordered_link_restricted_non_focal_link(final SubLObject join_ordered_link, final SubLObject restriction_link) {
        assert NIL != inference_worker_join_ordered.join_ordered_link_p(join_ordered_link) : "! inference_worker_join_ordered.join_ordered_link_p(join_ordered_link) " + ("inference_worker_join_ordered.join_ordered_link_p(join_ordered_link) " + "CommonSymbols.NIL != inference_worker_join_ordered.join_ordered_link_p(join_ordered_link) ") + join_ordered_link;
        SubLObject dict_contents = inference_worker_join_ordered.join_ordered_link_restricted_non_focal_link_index(join_ordered_link);
        dict_contents = dictionary_contents_delete(dict_contents, restriction_link, symbol_function(EQ));
        inference_worker_join_ordered._csetf_jo_link_data_restricted_non_focal_link_index(inference_datastructures_problem_link.problem_link_data(join_ordered_link), dict_contents);
        return join_ordered_link;
    }

    /**
     *
     *
     * @return subclause-spec-p or nil; the subclause-spec for the focal problem of JOIN-ORDERED-LINK
     */
    @LispMethod(comment = "@return subclause-spec-p or nil; the subclause-spec for the focal problem of JOIN-ORDERED-LINK")
    public static final SubLObject join_ordered_link_focal_supporting_problem_spec_alt(SubLObject join_ordered_link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(join_ordered_link);
                SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(supported_problem);
                SubLObject join_ordered_tactic = NIL;
                for (join_ordered_tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , join_ordered_tactic = cdolist_list_var.first()) {
                    if (NIL != inference_datastructures_problem.do_problem_tactics_hl_module_match(join_ordered_tactic, $join_ordered_module$.getDynamicValue(thread))) {
                        if (join_ordered_link == com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_tactic_link(join_ordered_tactic)) {
                            return com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_tactic_focal_supporting_problem_spec(join_ordered_tactic);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return subclause-spec-p or nil; the subclause-spec for the focal problem of JOIN-ORDERED-LINK
     */
    @LispMethod(comment = "@return subclause-spec-p or nil; the subclause-spec for the focal problem of JOIN-ORDERED-LINK")
    public static SubLObject join_ordered_link_focal_supporting_problem_spec(final SubLObject join_ordered_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(join_ordered_link);
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(supported_problem);
        SubLObject join_ordered_tactic = NIL;
        join_ordered_tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != inference_datastructures_problem.do_problem_tactics_hl_module_match(join_ordered_tactic, inference_worker_join_ordered.$join_ordered_module$.getDynamicValue(thread))) && join_ordered_link.eql(inference_worker_join_ordered.join_ordered_tactic_link(join_ordered_tactic))) {
                return inference_worker_join_ordered.join_ordered_tactic_focal_supporting_problem_spec(join_ordered_tactic);
            }
            cdolist_list_var = cdolist_list_var.rest();
            join_ordered_tactic = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     *
     *
     * @return subclause-spec-p or nil; the subclause-spec for the non-focal problem of JOIN-ORDERED-LINK
     */
    @LispMethod(comment = "@return subclause-spec-p or nil; the subclause-spec for the non-focal problem of JOIN-ORDERED-LINK")
    public static final SubLObject join_ordered_link_non_focal_supporting_problem_spec_alt(SubLObject join_ordered_link) {
        {
            SubLObject focal_spec = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_focal_supporting_problem_spec(join_ordered_link);
            SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(join_ordered_link);
            SubLObject supported_clause = inference_datastructures_problem.problem_sole_clause(supported_problem);
            SubLObject non_focal_spec = clause_utilities.new_complement_subclause_spec(focal_spec, supported_clause);
            return non_focal_spec;
        }
    }

    /**
     *
     *
     * @return subclause-spec-p or nil; the subclause-spec for the non-focal problem of JOIN-ORDERED-LINK
     */
    @LispMethod(comment = "@return subclause-spec-p or nil; the subclause-spec for the non-focal problem of JOIN-ORDERED-LINK")
    public static SubLObject join_ordered_link_non_focal_supporting_problem_spec(final SubLObject join_ordered_link) {
        final SubLObject focal_spec = inference_worker_join_ordered.join_ordered_link_focal_supporting_problem_spec(join_ordered_link);
        final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(join_ordered_link);
        final SubLObject supported_clause = inference_datastructures_problem.problem_sole_clause(supported_problem);
        final SubLObject non_focal_spec = new_complement_subclause_spec(focal_spec, supported_clause);
        return non_focal_spec;
    }

    public static final SubLObject join_ordered_tactic_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != inference_datastructures_tactic.tactic_p(v_object)) && ($join_ordered_module$.getDynamicValue(thread) == inference_datastructures_tactic.tactic_hl_module(v_object)));
        }
    }

    public static SubLObject join_ordered_tactic_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != inference_datastructures_tactic.tactic_p(v_object)) && inference_worker_join_ordered.$join_ordered_module$.getDynamicValue(thread).eql(inference_datastructures_tactic.tactic_hl_module(v_object)));
    }

    public static final SubLObject single_focal_literal_join_ordered_tactic_p_alt(SubLObject join_ordered_tactic) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_tactic_p(join_ordered_tactic)) && (NIL != clause_utilities.single_literal_subclause_specP(com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_tactic_focal_supporting_problem_spec(join_ordered_tactic))));
    }

    public static SubLObject single_focal_literal_join_ordered_tactic_p(final SubLObject join_ordered_tactic) {
        return makeBoolean((NIL != inference_worker_join_ordered.join_ordered_tactic_p(join_ordered_tactic)) && (NIL != single_literal_subclause_specP(inference_worker_join_ordered.join_ordered_tactic_focal_supporting_problem_spec(join_ordered_tactic))));
    }

    /**
     * Create a new :JOIN-ORDERED tactic for PROBLEM in which FOCAL-SUPPORTING-PROBLEM-SPEC
     * specifies the literals of DNF-CLAUSE which should be the focal supporting problem
     * and the remaining literals should be the non-focal supporting problem.
     */
    @LispMethod(comment = "Create a new :JOIN-ORDERED tactic for PROBLEM in which FOCAL-SUPPORTING-PROBLEM-SPEC\r\nspecifies the literals of DNF-CLAUSE which should be the focal supporting problem\r\nand the remaining literals should be the non-focal supporting problem.\nCreate a new :JOIN-ORDERED tactic for PROBLEM in which FOCAL-SUPPORTING-PROBLEM-SPEC\nspecifies the literals of DNF-CLAUSE which should be the focal supporting problem\nand the remaining literals should be the non-focal supporting problem.")
    public static final SubLObject new_join_ordered_tactic_alt(SubLObject jo_link, SubLObject focal_supporting_problem_spec) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(jo_link, JOIN_ORDERED_LINK_P);
            {
                SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(jo_link);
                SubLObject data = list(jo_link, focal_supporting_problem_spec);
                SubLObject tactic = inference_datastructures_tactic.new_tactic(problem, $join_ordered_module$.getDynamicValue(thread), data);
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
                                        SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
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
                return tactic;
            }
        }
    }

    @LispMethod(comment = "Create a new :JOIN-ORDERED tactic for PROBLEM in which FOCAL-SUPPORTING-PROBLEM-SPEC\r\nspecifies the literals of DNF-CLAUSE which should be the focal supporting problem\r\nand the remaining literals should be the non-focal supporting problem.\nCreate a new :JOIN-ORDERED tactic for PROBLEM in which FOCAL-SUPPORTING-PROBLEM-SPEC\nspecifies the literals of DNF-CLAUSE which should be the focal supporting problem\nand the remaining literals should be the non-focal supporting problem.")
    public static SubLObject new_join_ordered_tactic(final SubLObject jo_link, final SubLObject focal_supporting_problem_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_worker_join_ordered.join_ordered_link_p(jo_link) : "! inference_worker_join_ordered.join_ordered_link_p(jo_link) " + ("inference_worker_join_ordered.join_ordered_link_p(jo_link) " + "CommonSymbols.NIL != inference_worker_join_ordered.join_ordered_link_p(jo_link) ") + jo_link;
        final SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(jo_link);
        final SubLObject data = list(jo_link, focal_supporting_problem_spec);
        final SubLObject tactic = inference_datastructures_tactic.new_tactic(problem, inference_worker_join_ordered.$join_ordered_module$.getDynamicValue(thread), data);
        final SubLObject prob = problem;
        final SubLObject store = inference_datastructures_problem.problem_store(prob);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$3 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$3, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$3);
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
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference)) {
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
            final SubLObject idx_$4 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$4)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$4);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        inference2 = getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference2)) {
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

    /**
     *
     *
     * @return nil or problem-link-p; the link created by JOIN-ORDERED-TACTIC
    NIL should only occur if the tactic has been discarded.
     */
    @LispMethod(comment = "@return nil or problem-link-p; the link created by JOIN-ORDERED-TACTIC\r\nNIL should only occur if the tactic has been discarded.")
    public static final SubLObject join_ordered_tactic_link_alt(SubLObject join_ordered_tactic) {
        return inference_datastructures_tactic.tactic_data(join_ordered_tactic).first();
    }

    /**
     *
     *
     * @return nil or problem-link-p; the link created by JOIN-ORDERED-TACTIC
    NIL should only occur if the tactic has been discarded.
     */
    @LispMethod(comment = "@return nil or problem-link-p; the link created by JOIN-ORDERED-TACTIC\r\nNIL should only occur if the tactic has been discarded.")
    public static SubLObject join_ordered_tactic_link(final SubLObject join_ordered_tactic) {
        return inference_datastructures_tactic.tactic_data(join_ordered_tactic).first();
    }

    public static final SubLObject join_ordered_tactic_focal_supporting_problem_spec_alt(SubLObject join_ordered_tactic) {
        return second(inference_datastructures_tactic.tactic_data(join_ordered_tactic));
    }

    public static SubLObject join_ordered_tactic_focal_supporting_problem_spec(final SubLObject join_ordered_tactic) {
        return second(inference_datastructures_tactic.tactic_data(join_ordered_tactic));
    }

    /**
     * Return T iff SUBSUMING-TACTIC has a focal problem that subsumes that of SUBSUMED-TACTIC.
     */
    @LispMethod(comment = "Return T iff SUBSUMING-TACTIC has a focal problem that subsumes that of SUBSUMED-TACTIC.")
    public static final SubLObject join_ordered_tactic_subsumesP_alt(SubLObject subsuming_tactic, SubLObject subsumed_tactic) {
        return makeBoolean((subsuming_tactic == subsumed_tactic) || ((inference_datastructures_tactic.tactic_problem(subsuming_tactic) == inference_datastructures_tactic.tactic_problem(subsumed_tactic)) && (NIL != clause_utilities.subclause_spec_subsumesP(com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_tactic_focal_supporting_problem_spec(subsuming_tactic), com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_tactic_focal_supporting_problem_spec(subsumed_tactic)))));
    }

    /**
     * Return T iff SUBSUMING-TACTIC has a focal problem that subsumes that of SUBSUMED-TACTIC.
     */
    @LispMethod(comment = "Return T iff SUBSUMING-TACTIC has a focal problem that subsumes that of SUBSUMED-TACTIC.")
    public static SubLObject join_ordered_tactic_subsumesP(final SubLObject subsuming_tactic, final SubLObject subsumed_tactic) {
        return makeBoolean(subsuming_tactic.eql(subsumed_tactic) || (inference_datastructures_tactic.tactic_problem(subsuming_tactic).eql(inference_datastructures_tactic.tactic_problem(subsumed_tactic)) && (NIL != subclause_spec_subsumesP(inference_worker_join_ordered.join_ordered_tactic_focal_supporting_problem_spec(subsuming_tactic), inference_worker_join_ordered.join_ordered_tactic_focal_supporting_problem_spec(subsumed_tactic)))));
    }

    public static final SubLObject find_or_create_join_ordered_tactic_focal_mapped_problem_alt(SubLObject tactic) {
        {
            SubLObject jo_link = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_tactic_link(tactic);
            if (NIL != jo_link) {
                return com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(jo_link);
            }
        }
        return NIL;
    }

    public static SubLObject find_or_create_join_ordered_tactic_focal_mapped_problem(final SubLObject tactic) {
        final SubLObject jo_link = inference_worker_join_ordered.join_ordered_tactic_link(tactic);
        if (NIL != jo_link) {
            return inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(jo_link);
        }
        return NIL;
    }

    public static final SubLObject find_or_create_join_ordered_tactic_non_focal_mapped_problem_alt(SubLObject tactic) {
        {
            SubLObject jo_link = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_tactic_link(tactic);
            if (NIL != jo_link) {
                return com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_non_focal_mapped_problem(jo_link);
            }
        }
        return NIL;
    }

    public static SubLObject find_or_create_join_ordered_tactic_non_focal_mapped_problem(final SubLObject tactic) {
        final SubLObject jo_link = inference_worker_join_ordered.join_ordered_tactic_link(tactic);
        if (NIL != jo_link) {
            return inference_worker_join_ordered.join_ordered_link_non_focal_mapped_problem(jo_link);
        }
        return NIL;
    }

    public static SubLObject join_ordered_tactic_focal_problem(final SubLObject join_ordered_tactic) {
        final SubLObject link = inference_worker_join_ordered.join_ordered_tactic_link(join_ordered_tactic);
        final SubLObject problem = (NIL != link) ? inference_worker_join_ordered.join_ordered_link_focal_problem(link) : NIL;
        return problem;
    }

    public static final SubLObject determine_new_join_ordered_tactics_alt(SubLObject supported_problem, SubLObject dnf_clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.problem_has_a_complete_conjunctive_removal_tacticP(supported_problem)) {
                com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.determine_new_single_literal_join_ordered_tactics(supported_problem, dnf_clause);
                {
                    SubLObject multi_literal_subclause_specs = NIL;
                    {
                        SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.motivated_followup_multi_literal_subclause_specs_case_1(supported_problem, dnf_clause);
                        SubLObject subclause_spec = NIL;
                        for (subclause_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subclause_spec = cdolist_list_var.first()) {
                            {
                                SubLObject item_var = subclause_spec;
                                if (NIL == member(item_var, multi_literal_subclause_specs, symbol_function(EQL), symbol_function(IDENTITY))) {
                                    multi_literal_subclause_specs = cons(item_var, multi_literal_subclause_specs);
                                }
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.motivated_followup_multi_literal_subclause_specs_case_2(supported_problem, dnf_clause);
                        SubLObject subclause_spec = NIL;
                        for (subclause_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subclause_spec = cdolist_list_var.first()) {
                            {
                                SubLObject item_var = subclause_spec;
                                if (NIL == member(item_var, multi_literal_subclause_specs, symbol_function(EQL), symbol_function(IDENTITY))) {
                                    multi_literal_subclause_specs = cons(item_var, multi_literal_subclause_specs);
                                }
                            }
                        }
                    }
                    if (!((NIL != $only_add_multi_literal_jo_tactics_when_no_possible_complete_tacticP$.getDynamicValue(thread)) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.problem_has_a_candidate_early_removal_tacticP(supported_problem)))) {
                        {
                            SubLObject cdolist_list_var = inference_worker_removal.motivated_multi_literal_subclause_specs(dnf_clause);
                            SubLObject subclause_spec = NIL;
                            for (subclause_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subclause_spec = cdolist_list_var.first()) {
                                {
                                    SubLObject item_var = subclause_spec;
                                    if (NIL == member(item_var, multi_literal_subclause_specs, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        multi_literal_subclause_specs = cons(item_var, multi_literal_subclause_specs);
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = nreverse(multi_literal_subclause_specs);
                        SubLObject subclause_spec = NIL;
                        for (subclause_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subclause_spec = cdolist_list_var.first()) {
                            com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.determine_new_join_ordered_tactic(supported_problem, subclause_spec, dnf_clause);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject determine_new_join_ordered_tactics(final SubLObject supported_problem, final SubLObject dnf_clause) {
        inference_worker_join_ordered.determine_new_single_literal_join_ordered_tactics(supported_problem, dnf_clause);
        SubLObject multi_literal_subclause_specs = NIL;
        SubLObject cdolist_list_var = inference_worker_join_ordered.motivated_followup_multi_literal_subclause_specs_case_1(supported_problem, dnf_clause);
        SubLObject subclause_spec = NIL;
        subclause_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item_var = subclause_spec;
            if (NIL == member(item_var, multi_literal_subclause_specs, symbol_function(EQL), symbol_function(IDENTITY))) {
                multi_literal_subclause_specs = cons(item_var, multi_literal_subclause_specs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            subclause_spec = cdolist_list_var.first();
        } 
        cdolist_list_var = inference_worker_join_ordered.motivated_followup_multi_literal_subclause_specs_case_2(supported_problem, dnf_clause);
        subclause_spec = NIL;
        subclause_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item_var = subclause_spec;
            if (NIL == member(item_var, multi_literal_subclause_specs, symbol_function(EQL), symbol_function(IDENTITY))) {
                multi_literal_subclause_specs = cons(item_var, multi_literal_subclause_specs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            subclause_spec = cdolist_list_var.first();
        } 
        if (NIL == inference_worker_join_ordered.problem_has_a_candidate_early_removal_tacticP(supported_problem)) {
            cdolist_list_var = inference_worker_removal.motivated_multi_literal_subclause_specs(dnf_clause);
            subclause_spec = NIL;
            subclause_spec = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject item_var = subclause_spec;
                if (NIL == member(item_var, multi_literal_subclause_specs, symbol_function(EQL), symbol_function(IDENTITY))) {
                    multi_literal_subclause_specs = cons(item_var, multi_literal_subclause_specs);
                }
                cdolist_list_var = cdolist_list_var.rest();
                subclause_spec = cdolist_list_var.first();
            } 
        }
        cdolist_list_var = nreverse(multi_literal_subclause_specs);
        subclause_spec = NIL;
        subclause_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            inference_worker_join_ordered.determine_new_join_ordered_tactic(supported_problem, subclause_spec, dnf_clause);
            cdolist_list_var = cdolist_list_var.rest();
            subclause_spec = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     *
     *
     * @unknown only called if *only-add-multi-literal-jo-tactics-when-no-possible-complete-tactic?* is T
     */
    @LispMethod(comment = "@unknown only called if *only-add-multi-literal-jo-tactics-when-no-possible-complete-tactic?* is T")
    public static final SubLObject problem_has_a_candidate_early_removal_tacticP_alt(SubLObject problem) {
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        {
            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
            SubLObject tactic = NIL;
            for (tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tactic = cdolist_list_var.first()) {
                if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, $JOIN_ORDERED)) {
                    if (NIL != inference_tactician.candidate_early_removal_tacticP(tactic)) {
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown only called if *only-add-multi-literal-jo-tactics-when-no-possible-complete-tactic?* is T
     */
    @LispMethod(comment = "@unknown only called if *only-add-multi-literal-jo-tactics-when-no-possible-complete-tactic?* is T")
    public static SubLObject problem_has_a_candidate_early_removal_tacticP(final SubLObject problem) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : "! inference_datastructures_problem.problem_p(problem) " + ("inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) ") + problem;
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, $JOIN_ORDERED)) && (NIL != inference_tactician.candidate_early_removal_tacticP(tactic))) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject determine_new_single_literal_join_ordered_tactics_alt(SubLObject supported_problem, SubLObject dnf_clause) {
        {
            SubLObject some_backchain_requiredP = inference_trampolines.inference_some_backchain_required_asent_in_clauseP(dnf_clause);
            {
                SubLObject index = ZERO_INTEGER;
                SubLObject cdolist_list_var = clauses.neg_lits(dnf_clause);
                SubLObject contextualized_asent = NIL;
                for (contextualized_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , contextualized_asent = cdolist_list_var.first()) {
                    {
                        SubLObject sense = $NEG;
                        if (((NIL == some_backchain_requiredP) || (NIL != inference_trampolines.inference_backchain_required_contextualized_asentP(contextualized_asent))) || (NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.potentially_simplifying_asentP(inference_datastructures_problem_query.contextualized_asent_asent(contextualized_asent)))) {
                            com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.determine_new_single_literal_join_ordered_tactic(supported_problem, dnf_clause, sense, index);
                        }
                    }
                    index = add(index, ONE_INTEGER);
                }
            }
            {
                SubLObject index = ZERO_INTEGER;
                SubLObject cdolist_list_var = clauses.pos_lits(dnf_clause);
                SubLObject contextualized_asent = NIL;
                for (contextualized_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , contextualized_asent = cdolist_list_var.first()) {
                    {
                        SubLObject sense = $POS;
                        if (((NIL == some_backchain_requiredP) || (NIL != inference_trampolines.inference_backchain_required_contextualized_asentP(contextualized_asent))) || (NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.potentially_simplifying_asentP(inference_datastructures_problem_query.contextualized_asent_asent(contextualized_asent)))) {
                            com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.determine_new_single_literal_join_ordered_tactic(supported_problem, dnf_clause, sense, index);
                        }
                    }
                    index = add(index, ONE_INTEGER);
                }
            }
        }
        return NIL;
    }

    public static SubLObject determine_new_single_literal_join_ordered_tactics(final SubLObject supported_problem, final SubLObject dnf_clause) {
        final SubLObject some_backchain_requiredP = inference_trampolines.inference_some_backchain_required_asent_in_clauseP(dnf_clause);
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = neg_lits(dnf_clause);
        SubLObject contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject sense = $NEG;
            if (((NIL == some_backchain_requiredP) || (NIL != inference_trampolines.inference_backchain_required_contextualized_asentP(contextualized_asent))) || (NIL != inference_worker_join_ordered.potentially_simplifying_asentP(inference_datastructures_problem_query.contextualized_asent_asent(contextualized_asent)))) {
                inference_worker_join_ordered.determine_new_single_literal_join_ordered_tactic(supported_problem, dnf_clause, sense, index);
            }
            index = add(index, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        } 
        index = ZERO_INTEGER;
        cdolist_list_var = pos_lits(dnf_clause);
        contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject sense = $POS;
            if (((NIL == some_backchain_requiredP) || (NIL != inference_trampolines.inference_backchain_required_contextualized_asentP(contextualized_asent))) || (NIL != inference_worker_join_ordered.potentially_simplifying_asentP(inference_datastructures_problem_query.contextualized_asent_asent(contextualized_asent)))) {
                inference_worker_join_ordered.determine_new_single_literal_join_ordered_tactic(supported_problem, dnf_clause, sense, index);
            }
            index = add(index, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether ASENT is a literal which, if focused on as an early removal, would act as a simplification.
    To meet these criteria and to ensure future transformation is not blocked, ASENT must be complete, preferred, and functional.
     */
    @LispMethod(comment = "@return booleanp; whether ASENT is a literal which, if focused on as an early removal, would act as a simplification.\r\nTo meet these criteria and to ensure future transformation is not blocked, ASENT must be complete, preferred, and functional.")
    public static final SubLObject potentially_simplifying_asentP_alt(SubLObject asent) {
        return potentially_solvable_evaluate_asentP(asent);
    }

    /**
     *
     *
     * @return booleanp; whether ASENT is a literal which, if focused on as an early removal, would act as a simplification.
    To meet these criteria and to ensure future transformation is not blocked, ASENT must be complete, preferred, and functional.
     */
    @LispMethod(comment = "@return booleanp; whether ASENT is a literal which, if focused on as an early removal, would act as a simplification.\r\nTo meet these criteria and to ensure future transformation is not blocked, ASENT must be complete, preferred, and functional.")
    public static SubLObject potentially_simplifying_asentP(final SubLObject asent) {
        return potentially_solvable_evaluate_asentP(asent);
    }

    public static final SubLObject determine_new_single_literal_join_ordered_tactic_alt(SubLObject supported_problem, SubLObject dnf_clause, SubLObject sense, SubLObject index) {
        {
            SubLObject focal_supporting_problem_spec = clause_utilities.new_single_literal_subclause_spec(sense, index);
            return com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.determine_new_join_ordered_tactic(supported_problem, focal_supporting_problem_spec, dnf_clause);
        }
    }

    public static SubLObject determine_new_single_literal_join_ordered_tactic(final SubLObject supported_problem, final SubLObject dnf_clause, final SubLObject sense, final SubLObject index) {
        final SubLObject focal_supporting_problem_spec = new_single_literal_subclause_spec(sense, index);
        return inference_worker_join_ordered.determine_new_join_ordered_tactic(supported_problem, focal_supporting_problem_spec, dnf_clause);
    }

    /**
     *
     *
     * @param DNF-CLAUSE;
     * 		the single clause of SUPPORTED-PROBLEM.
     * @return list of subclause-spec-p; multi-literal subclause specs that should be considered
    for the purpose of reusing existing work in the store.
     */
    @LispMethod(comment = "@param DNF-CLAUSE;\r\n\t\tthe single clause of SUPPORTED-PROBLEM.\r\n@return list of subclause-spec-p; multi-literal subclause specs that should be considered\r\nfor the purpose of reusing existing work in the store.")
    public static final SubLObject motivated_followup_multi_literal_subclause_specs_case_1_alt(SubLObject supported_problem, SubLObject dnf_clause) {
        {
            SubLObject subclause_specs = NIL;
            if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.problem_store_followup_query_problem_p(supported_problem)) {
                {
                    SubLObject store = inference_datastructures_problem.problem_store(supported_problem);
                    SubLObject set_contents_var = set.do_set_internal(inference_datastructures_problem_store.problem_store_historical_root_problems(store));
                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                    SubLObject state = NIL;
                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        {
                            SubLObject other_root_problem = set_contents.do_set_contents_next(basis_object, state);
                            if (NIL != set_contents.do_set_contents_element_validP(state, other_root_problem)) {
                                if (other_root_problem != supported_problem) {
                                    if (NIL != inference_datastructures_problem.multi_literal_problem_p(other_root_problem)) {
                                        {
                                            SubLObject other_dnf_clause = inference_datastructures_problem.problem_sole_clause(other_root_problem);
                                            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.matching_subclause_specs(dnf_clause, other_dnf_clause);
                                            SubLObject subclause_spec = NIL;
                                            for (subclause_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subclause_spec = cdolist_list_var.first()) {
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
            return subclause_specs;
        }
    }

    /**
     *
     *
     * @param DNF-CLAUSE;
     * 		the single clause of SUPPORTED-PROBLEM.
     * @return list of subclause-spec-p; multi-literal subclause specs that should be considered
    for the purpose of reusing existing work in the store.
     */
    @LispMethod(comment = "@param DNF-CLAUSE;\r\n\t\tthe single clause of SUPPORTED-PROBLEM.\r\n@return list of subclause-spec-p; multi-literal subclause specs that should be considered\r\nfor the purpose of reusing existing work in the store.")
    public static SubLObject motivated_followup_multi_literal_subclause_specs_case_1(final SubLObject supported_problem, final SubLObject dnf_clause) {
        SubLObject subclause_specs = NIL;
        if (NIL != inference_worker_join_ordered.problem_store_followup_query_problem_p(supported_problem)) {
            final SubLObject store = inference_datastructures_problem.problem_store(supported_problem);
            final SubLObject set_var = inference_datastructures_problem_store.problem_store_historical_root_problems(store);
            final SubLObject set_contents_var = do_set_internal(set_var);
            SubLObject basis_object;
            SubLObject state;
            SubLObject other_root_problem;
            SubLObject other_dnf_clause;
            SubLObject cdolist_list_var;
            SubLObject subclause_spec;
            SubLObject subclause;
            SubLObject item_var;
            for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
                other_root_problem = do_set_contents_next(basis_object, state);
                if (((NIL != do_set_contents_element_validP(state, other_root_problem)) && (!other_root_problem.eql(supported_problem))) && (NIL != inference_datastructures_problem.multi_literal_problem_p(other_root_problem))) {
                    other_dnf_clause = inference_datastructures_problem.problem_sole_clause(other_root_problem);
                    cdolist_list_var = inference_worker_join_ordered.matching_subclause_specs(dnf_clause, other_dnf_clause);
                    subclause_spec = NIL;
                    subclause_spec = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        subclause = subclause_specified_by_spec(dnf_clause, subclause_spec);
                        if (NIL != inference_worker_split.all_literals_connected_by_shared_varsP(subclause)) {
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
        }
        return subclause_specs;
    }

    /**
     *
     *
     * @return booleanp; whether SUPPORTED-PROBLEM should be considered for followup-query
    join-ordered links.  Currently we only do this analysis for root problems when
    there is at least one other root problem in the store.
     */
    @LispMethod(comment = "@return booleanp; whether SUPPORTED-PROBLEM should be considered for followup-query\r\njoin-ordered links.  Currently we only do this analysis for root problems when\r\nthere is at least one other root problem in the store.")
    public static final SubLObject problem_store_followup_query_problem_p_alt(SubLObject supported_problem) {
        return makeBoolean(((NIL != inference_datastructures_problem.problem_p(supported_problem)) && inference_datastructures_problem_store.problem_store_historical_root_problem_count(inference_datastructures_problem.problem_store(supported_problem)).numGE(TWO_INTEGER)) && (NIL != inference_datastructures_problem.problem_has_dependent_link_of_typeP(supported_problem, $ANSWER)));
    }

    /**
     *
     *
     * @return booleanp; whether SUPPORTED-PROBLEM should be considered for followup-query
    join-ordered links.  Currently we only do this analysis for root problems when
    there is at least one other root problem in the store.
     */
    @LispMethod(comment = "@return booleanp; whether SUPPORTED-PROBLEM should be considered for followup-query\r\njoin-ordered links.  Currently we only do this analysis for root problems when\r\nthere is at least one other root problem in the store.")
    public static SubLObject problem_store_followup_query_problem_p(final SubLObject supported_problem) {
        return makeBoolean(((NIL != inference_datastructures_problem.problem_p(supported_problem)) && inference_datastructures_problem_store.problem_store_historical_root_problem_count(inference_datastructures_problem.problem_store(supported_problem)).numGE(TWO_INTEGER)) && (NIL != inference_datastructures_problem.problem_has_dependent_link_of_typeP(supported_problem, $ANSWER)));
    }

    public static final SubLObject motivated_followup_multi_literal_subclause_specs_case_2_alt(SubLObject supported_problem, SubLObject dnf_clause) {
        {
            SubLObject subclause_specs = NIL;
            if (NIL == inference_trampolines.inference_some_backchain_required_asent_in_clauseP(dnf_clause)) {
                if (NIL != inference_datastructures_problem.problem_has_dependent_link_of_typeP(supported_problem, $UNION)) {
                    {
                        SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supported_problem);
                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                        SubLObject state = NIL;
                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                            {
                                SubLObject union_link = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, union_link)) {
                                    if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(union_link, $UNION)) {
                                        {
                                            SubLObject disjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem(union_link);
                                            SubLObject set_contents_var_3 = inference_datastructures_problem.problem_argument_links(disjunction_problem);
                                            SubLObject basis_object_4 = set_contents.do_set_contents_basis_object(set_contents_var_3);
                                            SubLObject state_5 = NIL;
                                            for (state_5 = set_contents.do_set_contents_initial_state(basis_object_4, set_contents_var_3); NIL == set_contents.do_set_contents_doneP(basis_object_4, state_5); state_5 = set_contents.do_set_contents_update_state(state_5)) {
                                                {
                                                    SubLObject sibling_union_link = set_contents.do_set_contents_next(basis_object_4, state_5);
                                                    if (NIL != set_contents.do_set_contents_element_validP(state_5, sibling_union_link)) {
                                                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(sibling_union_link, $UNION)) {
                                                            if (sibling_union_link != union_link) {
                                                                {
                                                                    SubLObject sibling_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(sibling_union_link);
                                                                    if (sibling_problem != supported_problem) {
                                                                        if (NIL != inference_datastructures_problem.multi_literal_problem_p(sibling_problem)) {
                                                                            {
                                                                                SubLObject other_dnf_clause = inference_datastructures_problem.problem_sole_clause(sibling_problem);
                                                                                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.sub_matching_subclause_specs(dnf_clause, other_dnf_clause);
                                                                                SubLObject subclause_spec = NIL;
                                                                                for (subclause_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subclause_spec = cdolist_list_var.first()) {
                                                                                    {
                                                                                        SubLObject subclause = clause_utilities.subclause_specified_by_spec(other_dnf_clause, subclause_spec);
                                                                                        if (NIL != all_literals_connected_by_shared_varsP(subclause)) {
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
            return subclause_specs;
        }
    }

    public static SubLObject motivated_followup_multi_literal_subclause_specs_case_2(final SubLObject supported_problem, final SubLObject dnf_clause) {
        SubLObject subclause_specs = NIL;
        if ((NIL == inference_trampolines.inference_some_backchain_required_asent_in_clauseP(dnf_clause)) && (NIL != inference_datastructures_problem.problem_has_dependent_link_of_typeP(supported_problem, $UNION))) {
            final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supported_problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject union_link;
            SubLObject disjunction_problem;
            SubLObject set_contents_var_$5;
            SubLObject basis_object_$6;
            SubLObject state_$7;
            SubLObject sibling_union_link;
            SubLObject sibling_problem;
            SubLObject other_dnf_clause;
            SubLObject cdolist_list_var;
            SubLObject subclause_spec;
            SubLObject subclause;
            SubLObject item_var;
            for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
                union_link = do_set_contents_next(basis_object, state);
                if ((NIL != do_set_contents_element_validP(state, union_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(union_link, $UNION))) {
                    disjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem(union_link);
                    set_contents_var_$5 = inference_datastructures_problem.problem_argument_links(disjunction_problem);
                    for (basis_object_$6 = do_set_contents_basis_object(set_contents_var_$5), state_$7 = NIL, state_$7 = do_set_contents_initial_state(basis_object_$6, set_contents_var_$5); NIL == do_set_contents_doneP(basis_object_$6, state_$7); state_$7 = do_set_contents_update_state(state_$7)) {
                        sibling_union_link = do_set_contents_next(basis_object_$6, state_$7);
                        if (((NIL != do_set_contents_element_validP(state_$7, sibling_union_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(sibling_union_link, $UNION))) && (!sibling_union_link.eql(union_link))) {
                            sibling_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(sibling_union_link);
                            if ((!sibling_problem.eql(supported_problem)) && (NIL != inference_datastructures_problem.multi_literal_problem_p(sibling_problem))) {
                                other_dnf_clause = inference_datastructures_problem.problem_sole_clause(sibling_problem);
                                cdolist_list_var = inference_worker_join_ordered.sub_matching_subclause_specs(dnf_clause, other_dnf_clause);
                                subclause_spec = NIL;
                                subclause_spec = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    subclause = subclause_specified_by_spec(dnf_clause, subclause_spec);
                                    if (NIL != inference_worker_split.all_literals_connected_by_shared_varsP(subclause)) {
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
                    }
                }
            }
        }
        return subclause_specs;
    }

    /**
     * Returns the subclause specs which, if applied to DNF-CLAUSE, would allow it to unify with OTHER-DNF-CLAUSE.
     */
    @LispMethod(comment = "Returns the subclause specs which, if applied to DNF-CLAUSE, would allow it to unify with OTHER-DNF-CLAUSE.")
    public static final SubLObject matching_subclause_specs_alt(SubLObject dnf_clause, SubLObject other_dnf_clause) {
        {
            SubLObject subclause_specs = NIL;
            SubLObject pos_lits = clauses.pos_lits(dnf_clause);
            SubLObject neg_lits = clauses.neg_lits(dnf_clause);
            SubLObject other_pos_lits = clauses.pos_lits(other_dnf_clause);
            SubLObject other_neg_lits = clauses.neg_lits(other_dnf_clause);
            if (((NIL != list_utilities.greater_or_same_length_p(pos_lits, other_pos_lits)) && (NIL != list_utilities.greater_or_same_length_p(neg_lits, other_neg_lits))) && ((NIL != list_utilities.greater_length_p(pos_lits, other_pos_lits)) || (NIL != list_utilities.greater_length_p(neg_lits, other_neg_lits)))) {
                {
                    SubLObject pos_dict = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.matching_subclause_index_dictionary(pos_lits, other_pos_lits);
                    if (NIL != pos_dict) {
                        {
                            SubLObject neg_dict = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.matching_subclause_index_dictionary(neg_lits, other_neg_lits);
                            if (NIL != neg_dict) {
                                {
                                    SubLObject positive_indices_list = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.matching_subclause_index_dictionary_to_indices_list(pos_dict);
                                    SubLObject negative_indices_list = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.matching_subclause_index_dictionary_to_indices_list(neg_dict);
                                    SubLObject cdolist_list_var = positive_indices_list;
                                    SubLObject positive_indices = NIL;
                                    for (positive_indices = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , positive_indices = cdolist_list_var.first()) {
                                        {
                                            SubLObject cdolist_list_var_6 = negative_indices_list;
                                            SubLObject negative_indices = NIL;
                                            for (negative_indices = cdolist_list_var_6.first(); NIL != cdolist_list_var_6; cdolist_list_var_6 = cdolist_list_var_6.rest() , negative_indices = cdolist_list_var_6.first()) {
                                                {
                                                    SubLObject candidate_subclause_spec = clause_utilities.new_subclause_spec(negative_indices, positive_indices);
                                                    SubLObject candidate_subclause = clause_utilities.subclause_specified_by_spec(dnf_clause, candidate_subclause_spec);
                                                    if (NIL != unification.unify(candidate_subclause, other_dnf_clause, UNPROVIDED, UNPROVIDED)) {
                                                        subclause_specs = cons(candidate_subclause_spec, subclause_specs);
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
            return subclause_specs;
        }
    }

    @LispMethod(comment = "Returns the subclause specs which, if applied to DNF-CLAUSE, would allow it to unify with OTHER-DNF-CLAUSE.")
    public static SubLObject matching_subclause_specs(final SubLObject dnf_clause, final SubLObject other_dnf_clause) {
        SubLObject subclause_specs = NIL;
        final SubLObject pos_lits = pos_lits(dnf_clause);
        final SubLObject neg_lits = neg_lits(dnf_clause);
        final SubLObject other_pos_lits = pos_lits(other_dnf_clause);
        final SubLObject other_neg_lits = neg_lits(other_dnf_clause);
        if (((NIL != greater_or_same_length_p(pos_lits, other_pos_lits)) && (NIL != greater_or_same_length_p(neg_lits, other_neg_lits))) && ((NIL != greater_length_p(pos_lits, other_pos_lits)) || (NIL != greater_length_p(neg_lits, other_neg_lits)))) {
            final SubLObject pos_dict = inference_worker_join_ordered.matching_subclause_index_dictionary(pos_lits, other_pos_lits);
            if (NIL != pos_dict) {
                final SubLObject neg_dict = inference_worker_join_ordered.matching_subclause_index_dictionary(neg_lits, other_neg_lits);
                if (NIL != neg_dict) {
                    final SubLObject positive_indices_list = inference_worker_join_ordered.matching_subclause_index_dictionary_to_indices_list(pos_dict);
                    final SubLObject negative_indices_list = inference_worker_join_ordered.matching_subclause_index_dictionary_to_indices_list(neg_dict);
                    SubLObject cdolist_list_var = positive_indices_list;
                    SubLObject positive_indices = NIL;
                    positive_indices = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject cdolist_list_var_$8 = negative_indices_list;
                        SubLObject negative_indices = NIL;
                        negative_indices = cdolist_list_var_$8.first();
                        while (NIL != cdolist_list_var_$8) {
                            final SubLObject candidate_subclause_spec = new_subclause_spec(negative_indices, positive_indices);
                            final SubLObject candidate_subclause = subclause_specified_by_spec(dnf_clause, candidate_subclause_spec);
                            if (NIL != unify(candidate_subclause, other_dnf_clause, UNPROVIDED, UNPROVIDED)) {
                                subclause_specs = cons(candidate_subclause_spec, subclause_specs);
                            }
                            cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                            negative_indices = cdolist_list_var_$8.first();
                        } 
                        cdolist_list_var = cdolist_list_var.rest();
                        positive_indices = cdolist_list_var.first();
                    } 
                }
            }
        }
        return subclause_specs;
    }

    /**
     * Builds up a dictionary mapping literals in other-lits to
     * literals in LITS that unify.
     * Stores the indices rather than the actual literals.
     *
     * @return nil or dictionary-p; NIL if there is no mapping between LITS and OTHER-LITS.
     */
    @LispMethod(comment = "Builds up a dictionary mapping literals in other-lits to\r\nliterals in LITS that unify.\r\nStores the indices rather than the actual literals.\r\n\r\n@return nil or dictionary-p; NIL if there is no mapping between LITS and OTHER-LITS.\nBuilds up a dictionary mapping literals in other-lits to\nliterals in LITS that unify.\nStores the indices rather than the actual literals.")
    public static final SubLObject matching_subclause_index_dictionary_alt(SubLObject lits, SubLObject other_lits) {
        {
            SubLObject dict = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
            SubLObject impossibleP = NIL;
            SubLObject list_var = NIL;
            SubLObject other_lit = NIL;
            SubLObject i = NIL;
            for (list_var = other_lits, other_lit = list_var.first(), i = ZERO_INTEGER; !((NIL != impossibleP) || (NIL == list_var)); list_var = list_var.rest() , other_lit = list_var.first() , i = add(ONE_INTEGER, i)) {
                {
                    SubLObject list_var_7 = NIL;
                    SubLObject lit = NIL;
                    SubLObject j = NIL;
                    for (list_var_7 = lits, lit = list_var_7.first(), j = ZERO_INTEGER; NIL != list_var_7; list_var_7 = list_var_7.rest() , lit = list_var_7.first() , j = add(ONE_INTEGER, j)) {
                        if (NIL != unification.unify(other_lit, lit, UNPROVIDED, UNPROVIDED)) {
                            dictionary_utilities.dictionary_push(dict, i, j);
                        }
                    }
                }
                if (NIL == dictionary.dictionary_lookup(dict, i, UNPROVIDED)) {
                    impossibleP = T;
                }
            }
            if (NIL != impossibleP) {
                return NIL;
            } else {
                return dict;
            }
        }
    }

    @LispMethod(comment = "Builds up a dictionary mapping literals in other-lits to\r\nliterals in LITS that unify.\r\nStores the indices rather than the actual literals.\r\n\r\n@return nil or dictionary-p; NIL if there is no mapping between LITS and OTHER-LITS.\nBuilds up a dictionary mapping literals in other-lits to\nliterals in LITS that unify.\nStores the indices rather than the actual literals.")
    public static SubLObject matching_subclause_index_dictionary(final SubLObject lits, final SubLObject other_lits) {
        final SubLObject dict = new_dictionary(symbol_function(EQ), UNPROVIDED);
        SubLObject impossibleP = NIL;
        SubLObject list_var = NIL;
        SubLObject other_lit = NIL;
        SubLObject i = NIL;
        list_var = other_lits;
        other_lit = list_var.first();
        for (i = ZERO_INTEGER; (NIL == impossibleP) && (NIL != list_var); list_var = list_var.rest() , other_lit = list_var.first() , i = add(ONE_INTEGER, i)) {
            SubLObject list_var_$9 = NIL;
            SubLObject lit = NIL;
            SubLObject j = NIL;
            list_var_$9 = lits;
            lit = list_var_$9.first();
            for (j = ZERO_INTEGER; NIL != list_var_$9; list_var_$9 = list_var_$9.rest() , lit = list_var_$9.first() , j = add(ONE_INTEGER, j)) {
                if (NIL != unify_possible(other_lit, lit)) {
                    dictionary_push(dict, i, j);
                }
            }
            if (NIL == dictionary_lookup(dict, i, UNPROVIDED)) {
                impossibleP = T;
            }
        }
        if (NIL != impossibleP) {
            return NIL;
        }
        return dict;
    }

    /**
     * Returns a list of indices that could possibly work
     */
    @LispMethod(comment = "Returns a list of indices that could possibly work")
    public static final SubLObject matching_subclause_index_dictionary_to_indices_list_alt(SubLObject dict) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject indices_accum = NIL;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dict));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject indices = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        indices_accum = cons(indices, indices_accum);
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return delete_if($sym64$DUPLICATES_, list_utilities.cartesian_product(indices_accum, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    @LispMethod(comment = "Returns a list of indices that could possibly work")
    public static SubLObject matching_subclause_index_dictionary_to_indices_list(final SubLObject dict) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject indices_accum = NIL;
        SubLObject iteration_state;
        for (iteration_state = do_dictionary_contents_state(dictionary_contents(dict)); NIL == do_dictionary_contents_doneP(iteration_state); iteration_state = do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = do_dictionary_contents_key_value(iteration_state);
            final SubLObject indices = thread.secondMultipleValue();
            thread.resetMultipleValues();
            indices_accum = cons(indices, indices_accum);
        }
        do_dictionary_contents_finalize(iteration_state);
        if (NIL != subl_promotions.positive_integer_p(inference_worker_join_ordered.$max_subclause_spec_cartesian_product_cardinality$.getDynamicValue(thread))) {
            final SubLObject cartesian_product_cardinality = cartesian_product_cardinality(indices_accum);
            if (inference_worker_join_ordered.$max_subclause_spec_cartesian_product_cardinality$.getDynamicValue(thread).numL(cartesian_product_cardinality(indices_accum))) {
                Errors.warn(inference_worker_join_ordered.$str69$Too_many_possible_matches_to_chec, cartesian_product_cardinality, inference_worker.currently_active_problem());
                return NIL;
            }
        }
        return delete_if(inference_worker_join_ordered.$sym70$DUPLICATES_, cartesian_product(indices_accum, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns the multi-literal subclause specs which, if applied to DNF-CLAUSE, would allow
     * it to unify with a subclause of OTHER-DNF-CLAUSE
     */
    @LispMethod(comment = "Returns the multi-literal subclause specs which, if applied to DNF-CLAUSE, would allow\r\nit to unify with a subclause of OTHER-DNF-CLAUSE\nReturns the multi-literal subclause specs which, if applied to DNF-CLAUSE, would allow\nit to unify with a subclause of OTHER-DNF-CLAUSE")
    public static final SubLObject sub_matching_subclause_specs_alt(SubLObject dnf_clause, SubLObject other_dnf_clause) {
        {
            SubLObject pos_lit_spec = NIL;
            SubLObject neg_lit_spec = NIL;
            SubLObject subclause_specs = NIL;
            {
                SubLObject pos_lits = clauses.pos_lits(dnf_clause);
                SubLObject other_pos_lits = clauses.pos_lits(other_dnf_clause);
                SubLObject list_var = NIL;
                SubLObject pos_lit = NIL;
                SubLObject index = NIL;
                for (list_var = pos_lits, pos_lit = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , pos_lit = list_var.first() , index = add(ONE_INTEGER, index)) {
                    {
                        SubLObject unifiesP = NIL;
                        if (NIL == unifiesP) {
                            {
                                SubLObject csome_list_var = other_pos_lits;
                                SubLObject other_pos_lit = NIL;
                                for (other_pos_lit = csome_list_var.first(); !((NIL != unifiesP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , other_pos_lit = csome_list_var.first()) {
                                    if (NIL != unification.unify(pos_lit, other_pos_lit, UNPROVIDED, UNPROVIDED)) {
                                        pos_lit_spec = cons(index, pos_lit_spec);
                                        unifiesP = T;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject neg_lits = clauses.neg_lits(dnf_clause);
                SubLObject other_neg_lits = clauses.neg_lits(other_dnf_clause);
                SubLObject list_var = NIL;
                SubLObject neg_lit = NIL;
                SubLObject index = NIL;
                for (list_var = neg_lits, neg_lit = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , neg_lit = list_var.first() , index = add(ONE_INTEGER, index)) {
                    {
                        SubLObject unifiesP = NIL;
                        if (NIL == unifiesP) {
                            {
                                SubLObject csome_list_var = other_neg_lits;
                                SubLObject other_neg_lit = NIL;
                                for (other_neg_lit = csome_list_var.first(); !((NIL != unifiesP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , other_neg_lit = csome_list_var.first()) {
                                    if (NIL != unification.unify(neg_lit, other_neg_lit, UNPROVIDED, UNPROVIDED)) {
                                        neg_lit_spec = cons(index, neg_lit_spec);
                                        unifiesP = T;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (add(length(pos_lit_spec), length(neg_lit_spec)).numG(ONE_INTEGER)) {
                {
                    SubLObject subclause_spec = clause_utilities.new_subclause_spec(neg_lit_spec, pos_lit_spec);
                    if (NIL == clause_utilities.total_subclause_specP(subclause_spec, dnf_clause)) {
                        subclause_specs = cons(subclause_spec, subclause_specs);
                    }
                }
            }
            return subclause_specs;
        }
    }

    @LispMethod(comment = "Returns the multi-literal subclause specs which, if applied to DNF-CLAUSE, would allow\r\nit to unify with a subclause of OTHER-DNF-CLAUSE\nReturns the multi-literal subclause specs which, if applied to DNF-CLAUSE, would allow\nit to unify with a subclause of OTHER-DNF-CLAUSE")
    public static SubLObject sub_matching_subclause_specs(final SubLObject dnf_clause, final SubLObject other_dnf_clause) {
        SubLObject pos_lit_spec = NIL;
        SubLObject neg_lit_spec = NIL;
        SubLObject subclause_specs = NIL;
        final SubLObject pos_lits = pos_lits(dnf_clause);
        final SubLObject other_pos_lits = pos_lits(other_dnf_clause);
        SubLObject list_var = NIL;
        SubLObject pos_lit = NIL;
        SubLObject index = NIL;
        list_var = pos_lits;
        pos_lit = list_var.first();
        for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , pos_lit = list_var.first() , index = add(ONE_INTEGER, index)) {
            SubLObject unifiesP = NIL;
            if (NIL == unifiesP) {
                SubLObject csome_list_var = other_pos_lits;
                SubLObject other_pos_lit = NIL;
                other_pos_lit = csome_list_var.first();
                while ((NIL == unifiesP) && (NIL != csome_list_var)) {
                    if (NIL != unify(pos_lit, other_pos_lit, UNPROVIDED, UNPROVIDED)) {
                        pos_lit_spec = cons(index, pos_lit_spec);
                        unifiesP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    other_pos_lit = csome_list_var.first();
                } 
            }
        }
        final SubLObject neg_lits = neg_lits(dnf_clause);
        final SubLObject other_neg_lits = neg_lits(other_dnf_clause);
        list_var = NIL;
        SubLObject neg_lit = NIL;
        index = NIL;
        list_var = neg_lits;
        neg_lit = list_var.first();
        for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , neg_lit = list_var.first() , index = add(ONE_INTEGER, index)) {
            SubLObject unifiesP = NIL;
            if (NIL == unifiesP) {
                SubLObject csome_list_var = other_neg_lits;
                SubLObject other_neg_lit = NIL;
                other_neg_lit = csome_list_var.first();
                while ((NIL == unifiesP) && (NIL != csome_list_var)) {
                    if (NIL != unify(neg_lit, other_neg_lit, UNPROVIDED, UNPROVIDED)) {
                        neg_lit_spec = cons(index, neg_lit_spec);
                        unifiesP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    other_neg_lit = csome_list_var.first();
                } 
            }
        }
        if (add(length(pos_lit_spec), length(neg_lit_spec)).numG(ONE_INTEGER)) {
            final SubLObject subclause_spec = new_subclause_spec(neg_lit_spec, pos_lit_spec);
            if (NIL == total_subclause_specP(subclause_spec, dnf_clause)) {
                subclause_specs = cons(subclause_spec, subclause_specs);
            }
        }
        return subclause_specs;
    }

    public static final SubLObject determine_new_join_ordered_tactic_alt(SubLObject supported_problem, SubLObject focal_supporting_problem_spec, SubLObject dnf_clause) {
        {
            SubLObject store = inference_datastructures_problem.problem_store(supported_problem);
            SubLObject focal_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.find_or_create_join_ordered_focal_mapped_problem(store, dnf_clause, focal_supporting_problem_spec);
            SubLObject non_focal_mapped_problem = NIL;
            SubLObject jo_link = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.maybe_new_join_ordered_link(supported_problem, focal_mapped_problem, non_focal_mapped_problem);
            com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.new_join_ordered_tactic(jo_link, focal_supporting_problem_spec);
        }
        return NIL;
    }

    public static SubLObject determine_new_join_ordered_tactic(final SubLObject supported_problem, final SubLObject focal_supporting_problem_spec, final SubLObject dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject store = inference_datastructures_problem.problem_store(supported_problem);
        final SubLObject focal_free_hl_vars = inference_worker_join_ordered.compute_join_ordered_problem_subclause_free_vars(supported_problem, focal_supporting_problem_spec, dnf_clause, T);
        final SubLObject focal_mapped_problem = inference_worker_join_ordered.find_or_create_join_ordered_focal_mapped_problem(store, dnf_clause, focal_supporting_problem_spec, focal_free_hl_vars);
        final SubLObject non_focal_mapped_problem = NIL;
        thread.resetMultipleValues();
        final SubLObject jo_link = inference_worker_join_ordered.maybe_new_join_ordered_link(supported_problem, focal_mapped_problem, non_focal_mapped_problem);
        final SubLObject jo_link_newP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        inference_worker_join_ordered.new_join_ordered_tactic(jo_link, focal_supporting_problem_spec);
        if (NIL != jo_link_newP) {
            inference_worker.propagate_problem_link(jo_link);
        }
        return NIL;
    }

    public static final SubLObject find_or_create_join_ordered_focal_mapped_problem(SubLObject store, SubLObject dnf_clause, SubLObject focal_supporting_problem_spec) {
        return inference_worker.find_or_create_problem_from_subclause_spec(store, dnf_clause, focal_supporting_problem_spec);
    }

    public static SubLObject find_or_create_join_ordered_focal_mapped_problem(final SubLObject store, final SubLObject dnf_clause, final SubLObject focal_supporting_problem_spec, final SubLObject free_hl_vars) {
        return inference_worker.find_or_create_problem_from_subclause_spec(store, dnf_clause, focal_supporting_problem_spec, free_hl_vars);
    }

    public static final SubLObject find_or_create_join_ordered_non_focal_mapped_problem(SubLObject store, SubLObject dnf_clause, SubLObject focal_supporting_problem_spec) {
        return inference_worker.find_or_create_problem_without_subclause_spec(store, dnf_clause, focal_supporting_problem_spec);
    }

    public static SubLObject find_or_create_join_ordered_non_focal_mapped_problem(final SubLObject store, final SubLObject dnf_clause, final SubLObject focal_supporting_problem_spec, final SubLObject free_hl_vars) {
        return inference_worker.find_or_create_problem_without_subclause_spec(store, dnf_clause, focal_supporting_problem_spec, free_hl_vars);
    }

    public static final SubLObject lazily_create_join_ordered_link_non_focal_mapped_problem_alt(SubLObject join_ordered_link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == inference_datastructures_problem_store.$problem_store_modification_permittedP$.getDynamicValue(thread)) {
                return NIL;
            }
            {
                SubLObject focal_openP = inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem_openP(join_ordered_link);
                SubLObject store = inference_datastructures_problem_link.problem_link_store(join_ordered_link);
                SubLObject supported_clause = inference_datastructures_problem.problem_sole_clause(inference_datastructures_problem_link.problem_link_supported_problem(join_ordered_link));
                SubLObject focal_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(join_ordered_link);
                SubLObject focal_problem = inference_datastructures_problem_link.mapped_problem_problem(focal_mapped_problem);
                SubLObject focal_clause = inference_datastructures_problem.problem_sole_clause(focal_problem);
                SubLObject focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(focal_mapped_problem);
                SubLObject focal_clause_wrt_supported = bindings.apply_bindings(focal_variable_map, focal_clause);
                SubLObject focal_supporting_problem_spec = clause_utilities.subclause_spec_from_clauses(supported_clause, focal_clause_wrt_supported);
                SubLObject non_focal_supporting_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.find_or_create_join_ordered_non_focal_mapped_problem(store, supported_clause, focal_supporting_problem_spec);
                inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link(non_focal_supporting_mapped_problem, join_ordered_link);
                if (NIL != focal_openP) {
                    inference_datastructures_problem_link.problem_link_close_all(join_ordered_link);
                    inference_datastructures_problem_link.problem_link_open_supporting_mapped_problem(join_ordered_link, focal_mapped_problem);
                }
                inference_worker.propagate_problem_link(join_ordered_link);
                return non_focal_supporting_mapped_problem;
            }
        }
    }

    public static SubLObject lazily_create_join_ordered_link_non_focal_mapped_problem(final SubLObject join_ordered_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == inference_datastructures_problem_store.$problem_store_modification_permittedP$.getDynamicValue(thread)) {
            return NIL;
        }
        final SubLObject focal_openP = inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem_openP(join_ordered_link);
        final SubLObject store = inference_datastructures_problem_link.problem_link_store(join_ordered_link);
        final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(join_ordered_link);
        final SubLObject supported_clause = inference_datastructures_problem.problem_sole_clause(supported_problem);
        final SubLObject focal_mapped_problem = inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(join_ordered_link);
        final SubLObject focal_problem = inference_datastructures_problem_link.mapped_problem_problem(focal_mapped_problem);
        final SubLObject focal_clause = inference_datastructures_problem.problem_sole_clause(focal_problem);
        final SubLObject focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(focal_mapped_problem);
        final SubLObject focal_clause_wrt_supported = apply_bindings(focal_variable_map, focal_clause);
        final SubLObject focal_supporting_problem_spec = subclause_spec_from_clauses(supported_clause, focal_clause_wrt_supported);
        final SubLObject non_focal_free_hl_vars = inference_worker_join_ordered.compute_join_ordered_problem_subclause_free_vars(supported_problem, focal_supporting_problem_spec, supported_clause, NIL);
        final SubLObject non_focal_supporting_mapped_problem = inference_worker_join_ordered.find_or_create_join_ordered_non_focal_mapped_problem(store, supported_clause, focal_supporting_problem_spec, non_focal_free_hl_vars);
        inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link(non_focal_supporting_mapped_problem, join_ordered_link);
        if (NIL != focal_openP) {
            inference_datastructures_problem_link.problem_link_close_all(join_ordered_link);
            inference_datastructures_problem_link.problem_link_open_supporting_mapped_problem(join_ordered_link, focal_mapped_problem);
        }
        inference_worker.propagate_problem_link(join_ordered_link);
        return non_focal_supporting_mapped_problem;
    }

    public static SubLObject compute_join_ordered_problem_subclause_free_vars(final SubLObject supported_problem, final SubLObject focal_supporting_problem_spec, final SubLObject dnf_clause, final SubLObject focalP) {
        final SubLObject supported_problem_free_hl_vars = inference_datastructures_problem.problem_free_hl_vars(supported_problem);
        final SubLObject focal_subclause = subclause_specified_by_spec(dnf_clause, focal_supporting_problem_spec);
        final SubLObject non_focal_subclause = complement_of_subclause_specified_by_spec(dnf_clause, focal_supporting_problem_spec);
        final SubLObject focal_vars = cycl_utilities.expression_gather(focal_subclause, inference_worker_join_ordered.$sym71$HL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject non_focal_vars = cycl_utilities.expression_gather(non_focal_subclause, inference_worker_join_ordered.$sym71$HL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return variables.sort_hl_variable_list_memoized(intersection(NIL != focalP ? focal_vars : non_focal_vars, union(supported_problem_free_hl_vars, intersection(focal_vars, non_focal_vars, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject compute_strategic_properties_of_join_ordered_tactic_alt(SubLObject tactic, SubLObject strategy) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject jo_link = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_tactic_link(tactic);
                if (NIL == preference_modules.preference_level_p(inference_datastructures_tactic.tactic_preference_level(tactic))) {
                    thread.resetMultipleValues();
                    {
                        SubLObject join_ordered_preference_level = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.compute_join_ordered_tactic_preference_level(jo_link, $TACTICAL);
                        SubLObject preference_level_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        inference_datastructures_tactic.set_tactic_preference_level(tactic, join_ordered_preference_level, preference_level_justification);
                    }
                }
                thread.resetMultipleValues();
                {
                    SubLObject preference_level = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.compute_join_ordered_tactic_preference_level(jo_link, strategy);
                    SubLObject justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    inference_datastructures_strategy.set_tactic_strategic_preference_level(tactic, strategy, preference_level, justification);
                }
                {
                    SubLObject productivity = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.compute_join_ordered_tactic_productivity(jo_link, strategy);
                    inference_datastructures_strategy.set_tactic_strategic_productivity(tactic, strategy, productivity);
                }
            }
            return tactic;
        }
    }

    public static SubLObject compute_strategic_properties_of_join_ordered_tactic(final SubLObject tactic, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = inference_worker.$currently_considered_tactic$.currentBinding(thread);
        try {
            inference_worker.$currently_considered_tactic$.bind(tactic, thread);
            final SubLObject jo_link = inference_worker_join_ordered.join_ordered_tactic_link(tactic);
            if (NIL == preference_level_p(inference_datastructures_tactic.tactic_preference_level(tactic))) {
                thread.resetMultipleValues();
                final SubLObject join_ordered_preference_level = inference_worker_join_ordered.compute_join_ordered_tactic_preference_level(jo_link, $TACTICAL);
                final SubLObject preference_level_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                inference_datastructures_tactic.set_tactic_preference_level(tactic, join_ordered_preference_level, preference_level_justification);
                if ($DOOMED == join_ordered_preference_level) {
                    inference_worker.note_tactic_doomed(tactic, $TACTICAL);
                }
            }
            thread.resetMultipleValues();
            final SubLObject preference_level = inference_worker_join_ordered.compute_join_ordered_tactic_preference_level(jo_link, strategy);
            final SubLObject justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            inference_datastructures_strategy.set_tactic_strategic_preference_level(tactic, strategy, preference_level, justification);
            if ($DOOMED == preference_level) {
                inference_worker.note_tactic_doomed(tactic, strategy);
            }
            final SubLObject productivity = inference_worker_join_ordered.compute_join_ordered_tactic_productivity(jo_link, strategy);
            inference_datastructures_strategy.set_tactic_strategic_productivity(tactic, strategy, productivity);
        } finally {
            inference_worker.$currently_considered_tactic$.rebind(_prev_bind_0, thread);
        }
        return tactic;
    }

    /**
     * The productivity of a :join-ordered tactic is twice the
     * productivity of its focal subproblem
     */
    @LispMethod(comment = "The productivity of a :join-ordered tactic is twice the\r\nproductivity of its focal subproblem\nThe productivity of a :join-ordered tactic is twice the\nproductivity of its focal subproblem")
    public static final SubLObject compute_join_ordered_tactic_productivity_alt(SubLObject jo_link, SubLObject strategy) {
        SubLTrampolineFile.checkType(jo_link, JOIN_ORDERED_LINK_P);
        SubLTrampolineFile.checkType(strategy, STRATEGY_P);
        return inference_lookahead_productivity.memoized_problem_max_removal_productivity(com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_focal_problem(jo_link), strategy);
    }

    @LispMethod(comment = "The productivity of a :join-ordered tactic is twice the\r\nproductivity of its focal subproblem\nThe productivity of a :join-ordered tactic is twice the\nproductivity of its focal subproblem")
    public static SubLObject compute_join_ordered_tactic_productivity(final SubLObject jo_link, final SubLObject strategy) {
        assert NIL != inference_worker_join_ordered.join_ordered_link_p(jo_link) : "! inference_worker_join_ordered.join_ordered_link_p(jo_link) " + ("inference_worker_join_ordered.join_ordered_link_p(jo_link) " + "CommonSymbols.NIL != inference_worker_join_ordered.join_ordered_link_p(jo_link) ") + jo_link;
        assert NIL != inference_datastructures_strategy.strategy_p(strategy) : "! inference_datastructures_strategy.strategy_p(strategy) " + ("inference_datastructures_strategy.strategy_p(strategy) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) ") + strategy;
        return inference_lookahead_productivity.memoized_problem_max_removal_productivity(inference_worker_join_ordered.join_ordered_link_focal_problem(jo_link), strategy);
    }

    public static final SubLObject compute_join_ordered_tactic_preference_level_alt(SubLObject jo_link, SubLObject strategic_context) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject focal_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_focal_problem(jo_link);
                SubLObject shared_variables = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.focal_vars_shared_by_non_focal(jo_link);
                thread.resetMultipleValues();
                {
                    SubLObject join_ordered_preference_level = inference_tactician_utilities.memoized_problem_global_preference_level(focal_problem, strategic_context, shared_variables);
                    SubLObject preference_level_justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return values(join_ordered_preference_level, preference_level_justification);
                }
            }
        }
    }

    public static SubLObject compute_join_ordered_tactic_preference_level(final SubLObject jo_link, final SubLObject strategic_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject focal_problem = inference_worker_join_ordered.join_ordered_link_focal_problem(jo_link);
        final SubLObject shared_variables = inference_worker_join_ordered.focal_vars_shared_by_non_focal(jo_link);
        thread.resetMultipleValues();
        final SubLObject join_ordered_preference_level = inference_tactician_utilities.memoized_problem_global_preference_level(focal_problem, strategic_context, shared_variables);
        final SubLObject preference_level_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return subl_promotions.values2(join_ordered_preference_level, preference_level_justification);
    }

    public static final SubLObject execute_join_ordered_tactic_alt(SubLObject tactic) {
        {
            SubLObject focal_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.find_or_create_join_ordered_tactic_focal_mapped_problem(tactic);
            SubLObject join_ordered_link = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_tactic_link(tactic);
            inference_worker.problem_link_open_and_repropagate_supporting_mapped_problem(join_ordered_link, focal_mapped_problem);
            inference_worker_residual_transformation.maybe_possibly_add_residual_transformation_links_via_join_ordered_link(join_ordered_link);
        }
        if (NIL != inference_tactician_strategic_uninterestingness.tactic_preferredP(tactic, $TACTICAL)) {
            if (!((NIL != inference_tactician.better_term_chosen_handlingP()) && (NIL != inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_tactic.tactic_store(tactic))))) {
                inference_worker.possibly_discard_all_other_possible_structural_conjunctive_tactics(tactic);
            }
        }
        com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.consider_strategic_ramifications_of_tactic_preference_level(tactic);
        return tactic;
    }

    public static SubLObject execute_join_ordered_tactic(final SubLObject tactic) {
        final SubLObject focal_mapped_problem = inference_worker_join_ordered.find_or_create_join_ordered_tactic_focal_mapped_problem(tactic);
        final SubLObject join_ordered_link = inference_worker_join_ordered.join_ordered_tactic_link(tactic);
        inference_worker.problem_link_open_and_repropagate_supporting_mapped_problem(join_ordered_link, focal_mapped_problem);
        inference_worker_residual_transformation.maybe_possibly_add_residual_transformation_links_via_join_ordered_link(join_ordered_link);
        if ((NIL != inference_tactician_strategic_uninterestingness.tactic_preferredP(tactic, $TACTICAL)) && ((NIL == inference_tactician.better_term_chosen_handlingP()) || (NIL == inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_tactic.tactic_store(tactic))))) {
            inference_worker.possibly_discard_all_other_possible_structural_conjunctive_tactics(tactic);
        }
        inference_worker_join_ordered.consider_strategic_ramifications_of_tactic_preference_level(tactic);
        return tactic;
    }

    public static final SubLObject consider_strategic_ramifications_of_tactic_preference_level_alt(SubLObject tactic) {
        {
            SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
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
                                    SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
                                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                    SubLObject state = NIL;
                                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                        {
                                            SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
                                            if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                                if (NIL != inference_datastructures_strategy.tactic_strategically_preferredP(tactic, strategy)) {
                                                    inference_worker.possibly_note_problem_pending(inference_datastructures_tactic.tactic_problem(tactic), strategy);
                                                }
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
        return NIL;
    }

    public static SubLObject consider_strategic_ramifications_of_tactic_preference_level(final SubLObject tactic) {
        final SubLObject prob;
        final SubLObject problem = prob = inference_datastructures_tactic.tactic_problem(tactic);
        final SubLObject store = inference_datastructures_problem.problem_store(prob);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$10 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$10, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$10);
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
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = do_set_internal(set_var);
                            for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
                                strategy = do_set_contents_next(basis_object, state);
                                if ((NIL != do_set_contents_element_validP(state, strategy)) && (NIL != inference_datastructures_strategy.tactic_strategically_preferredP(tactic, strategy))) {
                                    inference_worker.possibly_note_problem_pending(inference_datastructures_tactic.tactic_problem(tactic), strategy);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject idx_$11 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$11)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$11);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        inference2 = getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference2)) {
                            final SubLObject inference_var2 = inference2;
                            final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            final SubLObject set_contents_var2 = do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == do_set_contents_doneP(basis_object2, state2); state2 = do_set_contents_update_state(state2)) {
                                strategy2 = do_set_contents_next(basis_object2, state2);
                                if ((NIL != do_set_contents_element_validP(state2, strategy2)) && (NIL != inference_datastructures_strategy.tactic_strategically_preferredP(tactic, strategy2))) {
                                    inference_worker.possibly_note_problem_pending(inference_datastructures_tactic.tactic_problem(tactic), strategy2);
                                }
                            }
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject join_ordered_tactic_lookahead_problem_alt(SubLObject join_ordered_tactic) {
        {
            SubLObject focal_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.find_or_create_join_ordered_tactic_focal_mapped_problem(join_ordered_tactic);
            return inference_datastructures_problem_link.mapped_problem_problem(focal_mapped_problem);
        }
    }

    public static SubLObject join_ordered_tactic_lookahead_problem(final SubLObject join_ordered_tactic) {
        final SubLObject focal_mapped_problem = inference_worker_join_ordered.find_or_create_join_ordered_tactic_focal_mapped_problem(join_ordered_tactic);
        return inference_datastructures_problem_link.mapped_problem_problem(focal_mapped_problem);
    }

    /**
     *
     *
     * @return 0 proof-p
     * @return 1 whether the returned proof was newly created
     */
    @LispMethod(comment = "@return 0 proof-p\r\n@return 1 whether the returned proof was newly created")
    public static final SubLObject new_join_ordered_proof_alt(SubLObject join_ordered_link, SubLObject subproofs_with_sub_bindings) {
        return com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.new_conjunctive_proof(join_ordered_link, subproofs_with_sub_bindings);
    }

    /**
     *
     *
     * @return 0 proof-p
     * @return 1 whether the returned proof was newly created
     */
    @LispMethod(comment = "@return 0 proof-p\r\n@return 1 whether the returned proof was newly created")
    public static SubLObject new_join_ordered_proof(final SubLObject join_ordered_link, final SubLObject subproofs_with_sub_bindings) {
        return inference_worker_join_ordered.new_conjunctive_proof(join_ordered_link, subproofs_with_sub_bindings);
    }

    public static final SubLObject join_ordered_proof_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_proof.proof_p(v_object)) && ($JOIN_ORDERED == inference_datastructures_proof.proof_type(v_object)));
    }

    public static SubLObject join_ordered_proof_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_proof.proof_p(v_object)) && ($JOIN_ORDERED == inference_datastructures_proof.proof_type(v_object)));
    }

    public static final SubLObject connected_conjunction_proof_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_proof_p(v_object)) || (NIL != inference_worker_join.join_proof_p(v_object)));
    }

    public static SubLObject connected_conjunction_proof_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_worker_join_ordered.join_ordered_proof_p(v_object)) || (NIL != inference_worker_join.join_proof_p(v_object)));
    }

    public static final SubLObject new_conjunctive_proof_alt(SubLObject conjunctive_link, SubLObject subproofs_with_sub_bindings) {
        {
            SubLObject proof_bindings = NIL;
            SubLObject subproofs = NIL;
            SubLObject cdolist_list_var = subproofs_with_sub_bindings;
            SubLObject subproof_with_sub_bindings = NIL;
            for (subproof_with_sub_bindings = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subproof_with_sub_bindings = cdolist_list_var.first()) {
                {
                    SubLObject datum = subproof_with_sub_bindings;
                    SubLObject current = datum;
                    SubLObject subproof = NIL;
                    SubLObject sub_proof_bindings = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt67);
                    subproof = current.first();
                    current = current.rest();
                    sub_proof_bindings = current;
                    proof_bindings = nconc(copy_list(sub_proof_bindings), proof_bindings);
                    subproofs = cons(subproof, subproofs);
                }
            }
            subproofs = nreverse(subproofs);
            proof_bindings = inference_worker.ncanonicalize_proof_bindings(proof_bindings);
            return inference_worker.propose_new_proof_with_bindings(conjunctive_link, proof_bindings, subproofs);
        }
    }

    public static SubLObject new_conjunctive_proof(final SubLObject conjunctive_link, final SubLObject subproofs_with_sub_bindings) {
        SubLObject proof_bindings = NIL;
        SubLObject subproofs = NIL;
        SubLObject cdolist_list_var = subproofs_with_sub_bindings;
        SubLObject subproof_with_sub_bindings = NIL;
        subproof_with_sub_bindings = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = subproof_with_sub_bindings;
            SubLObject subproof = NIL;
            SubLObject sub_proof_bindings = NIL;
            destructuring_bind_must_consp(current, datum, inference_worker_join_ordered.$list75);
            subproof = current.first();
            current = sub_proof_bindings = current.rest();
            proof_bindings = nconc(copy_list(sub_proof_bindings), proof_bindings);
            subproofs = cons(subproof, subproofs);
            cdolist_list_var = cdolist_list_var.rest();
            subproof_with_sub_bindings = cdolist_list_var.first();
        } 
        subproofs = nreverse(subproofs);
        proof_bindings = inference_worker.ncanonicalize_proof_bindings(proof_bindings);
        return inference_worker.propose_new_proof_with_bindings(conjunctive_link, proof_bindings, subproofs);
    }

    /**
     *
     *
     * @param TRIGGER-PROOF-BINDINGS;
     * 		trigger problem's variables -> answers
     */
    @LispMethod(comment = "@param TRIGGER-PROOF-BINDINGS;\r\n\t\ttrigger problem\'s variables -> answers")
    public static final SubLObject compute_sibling_proof_bindings_alt(SubLObject trigger_proof_bindings, SubLObject join_ordered_link, SubLObject trigger_is_focalP) {
        {
            SubLObject trigger_to_sibling_variable_map = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.trigger_to_sibling_variable_map(join_ordered_link, trigger_is_focalP);
            SubLObject sibling_proof_bindings = bindings.transfer_variable_map_to_bindings_filtered(trigger_to_sibling_variable_map, trigger_proof_bindings);
            return sibling_proof_bindings;
        }
    }

    /**
     *
     *
     * @param TRIGGER-PROOF-BINDINGS;
     * 		trigger problem's variables -> answers
     */
    @LispMethod(comment = "@param TRIGGER-PROOF-BINDINGS;\r\n\t\ttrigger problem\'s variables -> answers")
    public static SubLObject compute_sibling_proof_bindings(final SubLObject trigger_proof_bindings, final SubLObject join_ordered_link, final SubLObject trigger_is_focalP) {
        final SubLObject trigger_to_sibling_variable_map = inference_worker_join_ordered.trigger_to_sibling_variable_map(join_ordered_link, trigger_is_focalP);
        final SubLObject sibling_proof_bindings = transfer_variable_map_to_bindings_filtered(trigger_to_sibling_variable_map, trigger_proof_bindings);
        return sibling_proof_bindings;
    }

    public static final SubLObject focal_to_non_focal_variable_map_alt(SubLObject join_ordered_link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.focal_to_non_focal_variable_map_internal(join_ordered_link);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, FOCAL_TO_NON_FOCAL_VARIABLE_MAP, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), FOCAL_TO_NON_FOCAL_VARIABLE_MAP, ONE_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, FOCAL_TO_NON_FOCAL_VARIABLE_MAP, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, join_ordered_link, $kw69$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw69$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.focal_to_non_focal_variable_map_internal(join_ordered_link)));
                        memoization_state.caching_state_put(caching_state, join_ordered_link, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject focal_to_non_focal_variable_map(final SubLObject join_ordered_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject local_state = inference_datastructures_problem_link.problem_link_memoization_state(join_ordered_link);
        final SubLObject _prev_bind_0 = $memoization_state$.currentBinding(thread);
        try {
            $memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state_original_process(local_state);
            try {
                result = inference_worker_join_ordered.memoized_focal_to_non_focal_variable_map_int(join_ordered_link);
            } finally {
                final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                }
            }
        } finally {
            $memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject memoized_focal_to_non_focal_variable_map_int_internal(final SubLObject join_ordered_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state(inference_datastructures_problem_link.problem_link_store(join_ordered_link));
        final SubLObject _prev_bind_0 = $memoization_state$.currentBinding(thread);
        try {
            $memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state_original_process(local_state);
            try {
                return inference_worker_join_ordered.focal_to_non_focal_variable_map_int(join_ordered_link);
            } finally {
                final SubLObject _prev_bind_0_$13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                }
            }
        } finally {
            $memoization_state$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject memoized_focal_to_non_focal_variable_map_int(final SubLObject join_ordered_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = $memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_worker_join_ordered.memoized_focal_to_non_focal_variable_map_int_internal(join_ordered_link);
        }
        caching_state = memoization_state_lookup(v_memoization_state, inference_worker_join_ordered.MEMOIZED_FOCAL_TO_NON_FOCAL_VARIABLE_MAP_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = create_caching_state(memoization_state_lock(v_memoization_state), inference_worker_join_ordered.MEMOIZED_FOCAL_TO_NON_FOCAL_VARIABLE_MAP_INT, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state_put(v_memoization_state, inference_worker_join_ordered.MEMOIZED_FOCAL_TO_NON_FOCAL_VARIABLE_MAP_INT, caching_state);
        }
        SubLObject results = caching_state_lookup(caching_state, join_ordered_link, $memoized_item_not_found$.getGlobalValue());
        if (results.eql($memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(inference_worker_join_ordered.memoized_focal_to_non_focal_variable_map_int_internal(join_ordered_link)));
            caching_state_put(caching_state, join_ordered_link, results, UNPROVIDED);
        }
        return caching_results(results);
    }

    public static SubLObject focal_to_non_focal_variable_map_int(final SubLObject join_ordered_link) {
        final SubLObject focal_mapped_problem = inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(join_ordered_link);
        final SubLObject non_focal_mapped_problem = inference_worker_join_ordered.join_ordered_link_non_focal_mapped_problem(join_ordered_link);
        final SubLObject focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(focal_mapped_problem);
        final SubLObject non_focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(non_focal_mapped_problem);
        final SubLObject supported_to_non_focal_variable_map = invert_bindings(non_focal_variable_map);
        final SubLObject focal_to_non_focal_variable_map = compose_bindings_filtered(focal_variable_map, supported_to_non_focal_variable_map);
        return focal_to_non_focal_variable_map;
    }

    public static final SubLObject non_focal_to_focal_variable_map_alt(SubLObject join_ordered_link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.non_focal_to_focal_variable_map_internal(join_ordered_link);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, NON_FOCAL_TO_FOCAL_VARIABLE_MAP, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), NON_FOCAL_TO_FOCAL_VARIABLE_MAP, ONE_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, NON_FOCAL_TO_FOCAL_VARIABLE_MAP, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, join_ordered_link, $kw69$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw69$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.non_focal_to_focal_variable_map_internal(join_ordered_link)));
                        memoization_state.caching_state_put(caching_state, join_ordered_link, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject non_focal_to_focal_variable_map(final SubLObject join_ordered_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject local_state = inference_datastructures_problem_link.problem_link_memoization_state(join_ordered_link);
        final SubLObject _prev_bind_0 = $memoization_state$.currentBinding(thread);
        try {
            $memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state_original_process(local_state);
            try {
                result = inference_worker_join_ordered.memoized_non_focal_to_focal_variable_map_int(join_ordered_link);
            } finally {
                final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                }
            }
        } finally {
            $memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject memoized_non_focal_to_focal_variable_map_int_internal(final SubLObject join_ordered_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state(inference_datastructures_problem_link.problem_link_store(join_ordered_link));
        final SubLObject _prev_bind_0 = $memoization_state$.currentBinding(thread);
        try {
            $memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state_original_process(local_state);
            try {
                return inference_worker_join_ordered.non_focal_to_focal_variable_map_int(join_ordered_link);
            } finally {
                final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                }
            }
        } finally {
            $memoization_state$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject memoized_non_focal_to_focal_variable_map_int(final SubLObject join_ordered_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = $memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_worker_join_ordered.memoized_non_focal_to_focal_variable_map_int_internal(join_ordered_link);
        }
        caching_state = memoization_state_lookup(v_memoization_state, inference_worker_join_ordered.MEMOIZED_NON_FOCAL_TO_FOCAL_VARIABLE_MAP_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = create_caching_state(memoization_state_lock(v_memoization_state), inference_worker_join_ordered.MEMOIZED_NON_FOCAL_TO_FOCAL_VARIABLE_MAP_INT, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state_put(v_memoization_state, inference_worker_join_ordered.MEMOIZED_NON_FOCAL_TO_FOCAL_VARIABLE_MAP_INT, caching_state);
        }
        SubLObject results = caching_state_lookup(caching_state, join_ordered_link, $memoized_item_not_found$.getGlobalValue());
        if (results.eql($memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(inference_worker_join_ordered.memoized_non_focal_to_focal_variable_map_int_internal(join_ordered_link)));
            caching_state_put(caching_state, join_ordered_link, results, UNPROVIDED);
        }
        return caching_results(results);
    }

    public static SubLObject non_focal_to_focal_variable_map_int(final SubLObject join_ordered_link) {
        return invert_bindings(inference_worker_join_ordered.focal_to_non_focal_variable_map(join_ordered_link));
    }

    public static final SubLObject trigger_to_sibling_variable_map_alt(SubLObject join_ordered_link, SubLObject trigger_is_focalP) {
        return NIL != trigger_is_focalP ? ((SubLObject) (com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.focal_to_non_focal_variable_map(join_ordered_link))) : com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.non_focal_to_focal_variable_map(join_ordered_link);
    }

    public static SubLObject trigger_to_sibling_variable_map(final SubLObject join_ordered_link, final SubLObject trigger_is_focalP) {
        return NIL != trigger_is_focalP ? inference_worker_join_ordered.focal_to_non_focal_variable_map(join_ordered_link) : inference_worker_join_ordered.non_focal_to_focal_variable_map(join_ordered_link);
    }

    /**
     *
     *
     * @return binding-list-p; non-focal-problem-vars -> restriction.
    i.e. a transformation of FOCAL-BINDINGS
    into the space of JOIN-ORDERED-LINK's non-focal-problem.
    These will be bindings to substitute into JOIN-ORDERED-LINK's non-focal-problem
    to restrict it.
     * @param FOCAL-RESTRICTION-BINDINGS
     * 		binding-list-p; focal-problem-vars -> restriction.
     * 		i.e. bindings to substitute into JOIN-ORDERED-LINK's focal problem
     * 		to restrict it.
     */
    @LispMethod(comment = "@return binding-list-p; non-focal-problem-vars -> restriction.\r\ni.e. a transformation of FOCAL-BINDINGS\r\ninto the space of JOIN-ORDERED-LINK\'s non-focal-problem.\r\nThese will be bindings to substitute into JOIN-ORDERED-LINK\'s non-focal-problem\r\nto restrict it.\r\n@param FOCAL-RESTRICTION-BINDINGS\r\n\t\tbinding-list-p; focal-problem-vars -> restriction.\r\n\t\ti.e. bindings to substitute into JOIN-ORDERED-LINK\'s focal problem\r\n\t\tto restrict it.")
    public static final SubLObject focal_bindings_to_non_focal_bindings_alt(SubLObject focal_restriction_bindings, SubLObject join_ordered_link) {
        {
            SubLObject focal_to_non_focal_variable_map = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.focal_to_non_focal_variable_map(join_ordered_link);
            SubLObject non_focal_restriction_bindings = bindings.transfer_variable_map_to_bindings_filtered(focal_to_non_focal_variable_map, focal_restriction_bindings);
            return non_focal_restriction_bindings;
        }
    }

    /**
     *
     *
     * @return binding-list-p; non-focal-problem-vars -> restriction.
    i.e. a transformation of FOCAL-BINDINGS
    into the space of JOIN-ORDERED-LINK's non-focal-problem.
    These will be bindings to substitute into JOIN-ORDERED-LINK's non-focal-problem
    to restrict it.
     * @param FOCAL-RESTRICTION-BINDINGS
     * 		binding-list-p; focal-problem-vars -> restriction.
     * 		i.e. bindings to substitute into JOIN-ORDERED-LINK's focal problem
     * 		to restrict it.
     */
    @LispMethod(comment = "@return binding-list-p; non-focal-problem-vars -> restriction.\r\ni.e. a transformation of FOCAL-BINDINGS\r\ninto the space of JOIN-ORDERED-LINK\'s non-focal-problem.\r\nThese will be bindings to substitute into JOIN-ORDERED-LINK\'s non-focal-problem\r\nto restrict it.\r\n@param FOCAL-RESTRICTION-BINDINGS\r\n\t\tbinding-list-p; focal-problem-vars -> restriction.\r\n\t\ti.e. bindings to substitute into JOIN-ORDERED-LINK\'s focal problem\r\n\t\tto restrict it.")
    public static SubLObject focal_bindings_to_non_focal_bindings(final SubLObject focal_restriction_bindings, final SubLObject join_ordered_link) {
        final SubLObject focal_to_non_focal_variable_map = inference_worker_join_ordered.focal_to_non_focal_variable_map(join_ordered_link);
        final SubLObject non_focal_restriction_bindings = transfer_variable_map_to_bindings_filtered(focal_to_non_focal_variable_map, focal_restriction_bindings);
        return non_focal_restriction_bindings;
    }

    public static final SubLObject non_focal_bindings_to_focal_bindings_alt(SubLObject non_focal_restriction_bindings, SubLObject join_ordered_link) {
        {
            SubLObject non_focal_to_focal_variable_map = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.non_focal_to_focal_variable_map(join_ordered_link);
            SubLObject focal_restriction_bindings = bindings.transfer_variable_map_to_bindings_filtered(non_focal_to_focal_variable_map, non_focal_restriction_bindings);
            return focal_restriction_bindings;
        }
    }

    public static SubLObject non_focal_bindings_to_focal_bindings(final SubLObject non_focal_restriction_bindings, final SubLObject join_ordered_link) {
        final SubLObject non_focal_to_focal_variable_map = inference_worker_join_ordered.non_focal_to_focal_variable_map(join_ordered_link);
        final SubLObject focal_restriction_bindings = transfer_variable_map_to_bindings_filtered(non_focal_to_focal_variable_map, non_focal_restriction_bindings);
        return focal_restriction_bindings;
    }

    public static final SubLObject bubble_up_proof_to_join_ordered_link_alt(SubLObject trigger_subproof, SubLObject variable_map, SubLObject join_ordered_link) {
        {
            SubLObject trigger_is_focalP = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.mapped_proof_is_focalP(trigger_subproof, variable_map, join_ordered_link);
            com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.add_join_ordered_link_proof(join_ordered_link, trigger_subproof, trigger_is_focalP);
            if (NIL == trigger_is_focalP) {
                com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.bubble_up_proof_to_join_ordered_link_int(trigger_subproof, variable_map, join_ordered_link, trigger_is_focalP);
            } else {
                {
                    SubLObject restricted_non_focal_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.trigger_split_restriction(join_ordered_link, trigger_subproof);
                    com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.bubble_up_proof_to_join_ordered_link_int(trigger_subproof, variable_map, join_ordered_link, trigger_is_focalP);
                    if (NIL != restricted_non_focal_mapped_problem) {
                        {
                            SubLObject restricted_non_focal_problem = inference_datastructures_problem_link.mapped_problem_problem(restricted_non_focal_mapped_problem);
                            SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(join_ordered_link);
                            SubLObject prob = supported_problem;
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
                                                    SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
                                                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                                    SubLObject state = NIL;
                                                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                        {
                                                            SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
                                                            if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                                                inference_worker.maybe_possibly_activate_problem(strategy, restricted_non_focal_problem);
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
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject bubble_up_proof_to_join_ordered_link(final SubLObject trigger_subproof, final SubLObject variable_map, final SubLObject join_ordered_link) {
        final SubLObject trigger_is_focalP = inference_worker_join_ordered.mapped_proof_is_focalP(trigger_subproof, variable_map, join_ordered_link);
        inference_worker_join_ordered.add_join_ordered_link_proof(join_ordered_link, trigger_subproof, trigger_is_focalP);
        if (NIL == trigger_is_focalP) {
            inference_worker_join_ordered.bubble_up_proof_to_join_ordered_link_int(trigger_subproof, variable_map, join_ordered_link, trigger_is_focalP);
        } else {
            final SubLObject restricted_non_focal_mapped_problem = inference_worker_join_ordered.trigger_split_restriction(join_ordered_link, trigger_subproof);
            inference_worker_join_ordered.bubble_up_proof_to_join_ordered_link_int(trigger_subproof, variable_map, join_ordered_link, trigger_is_focalP);
            if (NIL != restricted_non_focal_mapped_problem) {
                final SubLObject restricted_non_focal_problem = inference_datastructures_problem_link.mapped_problem_problem(restricted_non_focal_mapped_problem);
                final SubLObject prob;
                final SubLObject supported_problem = prob = inference_datastructures_problem_link.problem_link_supported_problem(join_ordered_link);
                final SubLObject store = inference_datastructures_problem.problem_store(prob);
                final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
                if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                    final SubLObject idx_$16 = idx;
                    if (NIL == id_index_dense_objects_empty_p(idx_$16, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$16);
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
                                if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference)) {
                                    inference_var = inference;
                                    set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                                    set_contents_var = do_set_internal(set_var);
                                    for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
                                        strategy = do_set_contents_next(basis_object, state);
                                        if (NIL != do_set_contents_element_validP(state, strategy)) {
                                            inference_worker.maybe_possibly_activate_problem(strategy, restricted_non_focal_problem);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    final SubLObject idx_$17 = idx;
                    if (NIL == id_index_sparse_objects_empty_p(idx_$17)) {
                        final SubLObject cdohash_table = id_index_sparse_objects(idx_$17);
                        SubLObject id2 = NIL;
                        SubLObject inference2 = NIL;
                        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                        try {
                            while (iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                id2 = getEntryKey(cdohash_entry);
                                inference2 = getEntryValue(cdohash_entry);
                                if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference2)) {
                                    final SubLObject inference_var2 = inference2;
                                    final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                                    final SubLObject set_contents_var2 = do_set_internal(set_var2);
                                    SubLObject basis_object2;
                                    SubLObject state2;
                                    SubLObject strategy2;
                                    for (basis_object2 = do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == do_set_contents_doneP(basis_object2, state2); state2 = do_set_contents_update_state(state2)) {
                                        strategy2 = do_set_contents_next(basis_object2, state2);
                                        if (NIL != do_set_contents_element_validP(state2, strategy2)) {
                                            inference_worker.maybe_possibly_activate_problem(strategy2, restricted_non_focal_problem);
                                        }
                                    }
                                }
                            } 
                        } finally {
                            releaseEntrySetIterator(cdohash_iterator);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject trigger_split_restriction_alt(SubLObject join_ordered_link, SubLObject focal_problem_proof) {
        if (NIL == com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.focal_problem_is_a_single_literal_backchain_requiredP(join_ordered_link)) {
            return com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.find_or_create_split_restriction_int(join_ordered_link, focal_problem_proof, T);
        }
        return NIL;
    }

    public static SubLObject trigger_split_restriction(final SubLObject join_ordered_link, final SubLObject focal_problem_proof) {
        if (NIL == inference_worker_join_ordered.focal_problem_is_a_single_literal_backchain_requiredP(join_ordered_link)) {
            return inference_worker_join_ordered.find_or_create_split_restriction_int(join_ordered_link, focal_problem_proof, T);
        }
        return NIL;
    }

    public static final SubLObject find_split_restriction_alt(SubLObject join_ordered_link, SubLObject focal_problem_proof) {
        return com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.find_or_create_split_restriction_int(join_ordered_link, focal_problem_proof, NIL);
    }

    public static SubLObject find_split_restriction(final SubLObject join_ordered_link, final SubLObject focal_problem_proof) {
        return inference_worker_join_ordered.find_or_create_split_restriction_int(join_ordered_link, focal_problem_proof, NIL);
    }

    /**
     *
     *
     * @return mapped-problem-p; a restricted form of JOIN-ORDERED-LINK's non-focal problem, restricted according to FOCAL-RESTRICTION-BINDINGS
    modulo some substitution, with a variable map of the form: restricted non-focal problem vars -> non-focal problem vars
     * @param FOCAL-PROBLEM-PROOF;
     * 		the proof that triggered the split-restriction
     */
    @LispMethod(comment = "@return mapped-problem-p; a restricted form of JOIN-ORDERED-LINK\'s non-focal problem, restricted according to FOCAL-RESTRICTION-BINDINGS\r\nmodulo some substitution, with a variable map of the form: restricted non-focal problem vars -> non-focal problem vars\r\n@param FOCAL-PROBLEM-PROOF;\r\n\t\tthe proof that triggered the split-restriction")
    public static final SubLObject find_or_create_split_restriction_int_alt(SubLObject join_ordered_link, SubLObject focal_problem_proof, SubLObject createP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject focal_restriction_bindings = inference_datastructures_proof.proof_bindings(focal_problem_proof);
                SubLObject non_focal_restriction_bindings = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.focal_bindings_to_non_focal_bindings(focal_restriction_bindings, join_ordered_link);
                thread.resetMultipleValues();
                {
                    SubLObject restricted_non_focal_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.find_or_create_restricted_non_focal_problem_int(join_ordered_link, non_focal_restriction_bindings, createP);
                    SubLObject restricted_non_focal_link = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != restricted_non_focal_link) {
                        com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.add_join_ordered_link_restricted_non_focal_link(join_ordered_link, restricted_non_focal_link, focal_problem_proof);
                    }
                    return restricted_non_focal_mapped_problem;
                }
            }
        }
    }

    /**
     *
     *
     * @return mapped-problem-p; a restricted form of JOIN-ORDERED-LINK's non-focal problem, restricted according to FOCAL-RESTRICTION-BINDINGS
    modulo some substitution, with a variable map of the form: restricted non-focal problem vars -> non-focal problem vars
     * @param FOCAL-PROBLEM-PROOF;
     * 		the proof that triggered the split-restriction
     */
    @LispMethod(comment = "@return mapped-problem-p; a restricted form of JOIN-ORDERED-LINK\'s non-focal problem, restricted according to FOCAL-RESTRICTION-BINDINGS\r\nmodulo some substitution, with a variable map of the form: restricted non-focal problem vars -> non-focal problem vars\r\n@param FOCAL-PROBLEM-PROOF;\r\n\t\tthe proof that triggered the split-restriction")
    public static SubLObject find_or_create_split_restriction_int(final SubLObject join_ordered_link, final SubLObject focal_problem_proof, final SubLObject createP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject focal_restriction_bindings = inference_datastructures_proof.proof_bindings(focal_problem_proof);
        final SubLObject non_focal_restriction_bindings = inference_worker_join_ordered.focal_bindings_to_non_focal_bindings(focal_restriction_bindings, join_ordered_link);
        thread.resetMultipleValues();
        final SubLObject restricted_non_focal_mapped_problem = inference_worker_join_ordered.find_or_create_restricted_non_focal_problem_int(join_ordered_link, non_focal_restriction_bindings, createP);
        final SubLObject restricted_non_focal_link = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != restricted_non_focal_link) {
            inference_worker_join_ordered.add_join_ordered_link_restricted_non_focal_link(join_ordered_link, restricted_non_focal_link, focal_problem_proof);
        }
        return restricted_non_focal_mapped_problem;
    }

    public static final SubLObject note_all_triggering_proofs_processed_alt(SubLObject restriction_link) {
        {
            SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
            SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supported_problem);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject join_ordered_link = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, join_ordered_link)) {
                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, $JOIN_ORDERED)) {
                            com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.note_restricted_non_focal_finished(join_ordered_link, restriction_link);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject note_all_triggering_proofs_processed(final SubLObject restriction_link) {
        final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supported_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject join_ordered_link;
        for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
            join_ordered_link = do_set_contents_next(basis_object, state);
            if ((NIL != do_set_contents_element_validP(state, join_ordered_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, $JOIN_ORDERED))) {
                inference_worker_join_ordered.note_restricted_non_focal_finished(join_ordered_link, restriction_link);
            }
        }
        return NIL;
    }

    /**
     * look up the proof from the index on the jo-link and note it processed
     */
    @LispMethod(comment = "look up the proof from the index on the jo-link and note it processed")
    public static final SubLObject note_restricted_non_focal_finished_alt(SubLObject join_ordered_link, SubLObject restriction_link) {
        {
            SubLObject proof = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_restricted_non_focal_triggering_proof(join_ordered_link, restriction_link);
            if (NIL != proof) {
                inference_worker.possibly_note_proof_processed(proof);
            }
        }
        return NIL;
    }

    /**
     * look up the proof from the index on the jo-link and note it processed
     */
    @LispMethod(comment = "look up the proof from the index on the jo-link and note it processed")
    public static SubLObject note_restricted_non_focal_finished(final SubLObject join_ordered_link, final SubLObject restriction_link) {
        final SubLObject proof = inference_worker_join_ordered.join_ordered_link_restricted_non_focal_triggering_proof(join_ordered_link, restriction_link);
        if (NIL != proof) {
            inference_worker.possibly_note_proof_processed(proof);
        }
        return NIL;
    }

    public static final SubLObject find_or_create_restricted_non_focal_problem_alt(SubLObject join_ordered_link, SubLObject non_focal_restriction_bindings) {
        return com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.find_or_create_restricted_non_focal_problem_int(join_ordered_link, non_focal_restriction_bindings, T);
    }

    public static SubLObject find_or_create_restricted_non_focal_problem(final SubLObject join_ordered_link, final SubLObject non_focal_restriction_bindings) {
        return inference_worker_join_ordered.find_or_create_restricted_non_focal_problem_int(join_ordered_link, non_focal_restriction_bindings, T);
    }

    public static final SubLObject find_restricted_non_focal_problem_alt(SubLObject join_ordered_link, SubLObject non_focal_restriction_bindings) {
        return com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.find_or_create_restricted_non_focal_problem_int(join_ordered_link, non_focal_restriction_bindings, NIL);
    }

    public static SubLObject find_restricted_non_focal_problem(final SubLObject join_ordered_link, final SubLObject non_focal_restriction_bindings) {
        return inference_worker_join_ordered.find_or_create_restricted_non_focal_problem_int(join_ordered_link, non_focal_restriction_bindings, NIL);
    }

    public static final SubLObject find_or_create_restricted_non_focal_problem_int_alt(SubLObject join_ordered_link, SubLObject non_focal_restriction_bindings, SubLObject creation_allowedP) {
        {
            SubLObject non_focal_problem = inference_datastructures_problem_link.mapped_problem_problem(com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_non_focal_mapped_problem(join_ordered_link));
            return com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.find_or_create_restricted_problem_and_link_int(non_focal_problem, non_focal_restriction_bindings, creation_allowedP);
        }
    }

    public static SubLObject find_or_create_restricted_non_focal_problem_int(final SubLObject join_ordered_link, final SubLObject non_focal_restriction_bindings, final SubLObject creation_allowedP) {
        final SubLObject non_focal_problem = inference_datastructures_problem_link.mapped_problem_problem(inference_worker_join_ordered.join_ordered_link_non_focal_mapped_problem(join_ordered_link));
        return inference_worker_join_ordered.find_or_create_restricted_problem_and_link_int(non_focal_problem, non_focal_restriction_bindings, creation_allowedP);
    }

    public static final SubLObject find_restricted_problem_and_link_alt(SubLObject unrestricted_problem, SubLObject restriction_bindings) {
        return com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.find_or_create_restricted_problem_and_link_int(unrestricted_problem, restriction_bindings, NIL);
    }

    public static SubLObject find_restricted_problem_and_link(final SubLObject unrestricted_problem, final SubLObject restriction_bindings) {
        return inference_worker_join_ordered.find_or_create_restricted_problem_and_link_int(unrestricted_problem, restriction_bindings, NIL);
    }

    /**
     *
     *
     * @param RESTRICTION-BINDINGS
     * 		binding-list-p; UNRESTRICTED-PROBLEM's vars -> restriction.
     * 		i.e. bindings to substitute into UNRESTRICTED-PROBLEM to restrict it.
     */
    @LispMethod(comment = "@param RESTRICTION-BINDINGS\r\n\t\tbinding-list-p; UNRESTRICTED-PROBLEM\'s vars -> restriction.\r\n\t\ti.e. bindings to substitute into UNRESTRICTED-PROBLEM to restrict it.")
    public static final SubLObject find_or_create_restricted_problem_and_link_int_alt(SubLObject unrestricted_problem, SubLObject restriction_bindings, SubLObject creation_allowedP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == restriction_bindings) {
                    Errors.error($str_alt71$Finding_or_creating_a_restricted_, unrestricted_problem);
                }
            }
            {
                SubLObject restricted_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.find_or_create_restricted_problem_int(unrestricted_problem, restriction_bindings, creation_allowedP);
                SubLObject restriction_link = NIL;
                if (NIL != creation_allowedP) {
                    restriction_link = maybe_new_restriction_link(unrestricted_problem, restricted_mapped_problem, restriction_bindings, UNPROVIDED, UNPROVIDED);
                }
                return values(restricted_mapped_problem, restriction_link);
            }
        }
    }

    /**
     *
     *
     * @param RESTRICTION-BINDINGS
     * 		binding-list-p; UNRESTRICTED-PROBLEM's vars -> restriction.
     * 		i.e. bindings to substitute into UNRESTRICTED-PROBLEM to restrict it.
     */
    @LispMethod(comment = "@param RESTRICTION-BINDINGS\r\n\t\tbinding-list-p; UNRESTRICTED-PROBLEM\'s vars -> restriction.\r\n\t\ti.e. bindings to substitute into UNRESTRICTED-PROBLEM to restrict it.")
    public static SubLObject find_or_create_restricted_problem_and_link_int(final SubLObject unrestricted_problem, final SubLObject restriction_bindings, final SubLObject creation_allowedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == restriction_bindings)) {
            Errors.error(inference_worker_join_ordered.$str79$Finding_or_creating_a_restricted_, unrestricted_problem);
        }
        final SubLObject restricted_mapped_problem = inference_worker_join_ordered.find_or_create_restricted_problem_int(unrestricted_problem, restriction_bindings, creation_allowedP);
        SubLObject restriction_link = NIL;
        if (NIL != creation_allowedP) {
            restriction_link = inference_worker_restriction.maybe_new_restriction_link(unrestricted_problem, restricted_mapped_problem, restriction_bindings, UNPROVIDED, UNPROVIDED);
        }
        return subl_promotions.values2(restricted_mapped_problem, restriction_link);
    }

    public static final SubLObject find_or_create_restricted_problem_alt(SubLObject unrestricted_problem, SubLObject restriction_bindings) {
        return com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.find_or_create_restricted_problem_int(unrestricted_problem, restriction_bindings, T);
    }

    public static SubLObject find_or_create_restricted_problem(final SubLObject unrestricted_problem, final SubLObject restriction_bindings) {
        return inference_worker_join_ordered.find_or_create_restricted_problem_int(unrestricted_problem, restriction_bindings, T);
    }

    /**
     *
     *
     * @param RESTRICTION-BINDINGS
     * 		binding-list-p; UNRESTRICTED-PROBLEM's vars -> restriction.
     * 		i.e. bindings to substitute into UNRESTRICTED-PROBLEM to restrict it.
     */
    @LispMethod(comment = "@param RESTRICTION-BINDINGS\r\n\t\tbinding-list-p; UNRESTRICTED-PROBLEM\'s vars -> restriction.\r\n\t\ti.e. bindings to substitute into UNRESTRICTED-PROBLEM to restrict it.")
    public static final SubLObject find_or_create_restricted_problem_int_alt(SubLObject unrestricted_problem, SubLObject restriction_bindings, SubLObject creation_allowedP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == restriction_bindings) {
                    Errors.error($str_alt72$Creating_a_restricted_problem_of_, unrestricted_problem);
                }
            }
            {
                SubLObject query = inference_datastructures_problem.problem_query(unrestricted_problem);
                SubLObject restricted_query = bindings.apply_bindings(restriction_bindings, query);
                SubLObject store = inference_datastructures_problem.problem_store(unrestricted_problem);
                SubLObject restricted_mapped_problem = (NIL != creation_allowedP) ? ((SubLObject) (inference_worker.find_or_create_problem(store, restricted_query, UNPROVIDED))) : inference_worker.find_problem(store, restricted_query);
                return restricted_mapped_problem;
            }
        }
    }

    /**
     *
     *
     * @param RESTRICTION-BINDINGS
     * 		binding-list-p; UNRESTRICTED-PROBLEM's vars -> restriction.
     * 		i.e. bindings to substitute into UNRESTRICTED-PROBLEM to restrict it.
     */
    @LispMethod(comment = "@param RESTRICTION-BINDINGS\r\n\t\tbinding-list-p; UNRESTRICTED-PROBLEM\'s vars -> restriction.\r\n\t\ti.e. bindings to substitute into UNRESTRICTED-PROBLEM to restrict it.")
    public static SubLObject find_or_create_restricted_problem_int(final SubLObject unrestricted_problem, final SubLObject restriction_bindings, final SubLObject creation_allowedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == restriction_bindings)) {
            Errors.error(inference_worker_join_ordered.$str80$Creating_a_restricted_problem_of_, unrestricted_problem);
        }
        final SubLObject query = inference_datastructures_problem.problem_query(unrestricted_problem);
        final SubLObject restricted_query = apply_bindings(restriction_bindings, query);
        final SubLObject restricted_free_hl_vars = variables.sort_hl_variable_list_memoized(cycl_utilities.expression_gather(apply_bindings(restriction_bindings, inference_datastructures_problem.problem_free_hl_vars(unrestricted_problem)), inference_worker_join_ordered.$sym71$HL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        final SubLObject store = inference_datastructures_problem.problem_store(unrestricted_problem);
        final SubLObject restricted_mapped_problem = (NIL != creation_allowedP) ? inference_worker.find_or_create_problem(store, restricted_query, restricted_free_hl_vars, UNPROVIDED) : inference_worker.find_problem(store, restricted_query, restricted_free_hl_vars);
        return restricted_mapped_problem;
    }

    public static final SubLObject focal_problem_is_a_single_literal_backchain_requiredP_alt(SubLObject join_ordered_link) {
        {
            SubLObject focal_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_focal_problem(join_ordered_link);
            return makeBoolean((NIL != inference_datastructures_problem.single_literal_problem_p(focal_problem)) && (NIL != inference_trampolines.problem_backchain_requiredP(focal_problem)));
        }
    }

    public static SubLObject focal_problem_is_a_single_literal_backchain_requiredP(final SubLObject join_ordered_link) {
        final SubLObject focal_problem = inference_worker_join_ordered.join_ordered_link_focal_problem(join_ordered_link);
        return makeBoolean((NIL != inference_datastructures_problem.single_literal_problem_p(focal_problem)) && (NIL != inference_datastructures_problem.problem_backchain_requiredP(focal_problem)));
    }

    /**
     *
     *
     * @return NIL or problem-p; the corresponding focal problem of JOIN-ORDERED-PROBLEM,
    which is a non-focal problem wrt JOIN-ORDERED-LINK.
    Returns NIL if JOIN-ORDERED-PROBLEM is not in fact a non-focal problem wrt JOIN-ORDERED-LINK.
     */
    @LispMethod(comment = "@return NIL or problem-p; the corresponding focal problem of JOIN-ORDERED-PROBLEM,\r\nwhich is a non-focal problem wrt JOIN-ORDERED-LINK.\r\nReturns NIL if JOIN-ORDERED-PROBLEM is not in fact a non-focal problem wrt JOIN-ORDERED-LINK.")
    public static final SubLObject corresponding_focal_problem_alt(SubLObject join_ordered_problem, SubLObject join_ordered_link) {
        {
            SubLObject non_focal_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_non_focal_mapped_problem(join_ordered_link);
            SubLObject non_focal_problem = (NIL != non_focal_mapped_problem) ? ((SubLObject) (inference_datastructures_problem_link.mapped_problem_problem(non_focal_mapped_problem))) : NIL;
            if (join_ordered_problem == non_focal_problem) {
                {
                    SubLObject focal_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(join_ordered_link);
                    if (NIL != focal_mapped_problem) {
                        return inference_datastructures_problem_link.mapped_problem_problem(focal_mapped_problem);
                    }
                }
            } else {
                return NIL;
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return NIL or problem-p; the corresponding focal problem of JOIN-ORDERED-PROBLEM,
    which is a non-focal problem wrt JOIN-ORDERED-LINK.
    Returns NIL if JOIN-ORDERED-PROBLEM is not in fact a non-focal problem wrt JOIN-ORDERED-LINK.
     */
    @LispMethod(comment = "@return NIL or problem-p; the corresponding focal problem of JOIN-ORDERED-PROBLEM,\r\nwhich is a non-focal problem wrt JOIN-ORDERED-LINK.\r\nReturns NIL if JOIN-ORDERED-PROBLEM is not in fact a non-focal problem wrt JOIN-ORDERED-LINK.")
    public static SubLObject corresponding_focal_problem(final SubLObject join_ordered_problem, final SubLObject join_ordered_link) {
        final SubLObject non_focal_mapped_problem = inference_worker_join_ordered.join_ordered_link_non_focal_mapped_problem(join_ordered_link);
        final SubLObject non_focal_problem = (NIL != non_focal_mapped_problem) ? inference_datastructures_problem_link.mapped_problem_problem(non_focal_mapped_problem) : NIL;
        if (!join_ordered_problem.eql(non_focal_problem)) {
            return NIL;
        }
        final SubLObject focal_mapped_problem = inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(join_ordered_link);
        if (NIL != focal_mapped_problem) {
            return inference_datastructures_problem_link.mapped_problem_problem(focal_mapped_problem);
        }
        return NIL;
    }

    /**
     *
     *
     * @return NIL or problem-p; the corresponding non-focal problem of JOIN-ORDERED-PROBLEM,
    which is a focal problem wrt JOIN-ORDERED-LINK.
    Returns NIL if JOIN-ORDERED-PROBLEM is not in fact a focal problem wrt JOIN-ORDERED-LINK.
     */
    @LispMethod(comment = "@return NIL or problem-p; the corresponding non-focal problem of JOIN-ORDERED-PROBLEM,\r\nwhich is a focal problem wrt JOIN-ORDERED-LINK.\r\nReturns NIL if JOIN-ORDERED-PROBLEM is not in fact a focal problem wrt JOIN-ORDERED-LINK.")
    public static final SubLObject corresponding_non_focal_problem_alt(SubLObject join_ordered_problem, SubLObject join_ordered_link) {
        {
            SubLObject focal_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(join_ordered_link);
            SubLObject focal_problem = inference_datastructures_problem_link.mapped_problem_problem(focal_mapped_problem);
            if (join_ordered_problem == focal_problem) {
                {
                    SubLObject non_focal_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_non_focal_mapped_problem(join_ordered_link);
                    if (NIL != non_focal_mapped_problem) {
                        return inference_datastructures_problem_link.mapped_problem_problem(non_focal_mapped_problem);
                    }
                }
            } else {
                return NIL;
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return NIL or problem-p; the corresponding non-focal problem of JOIN-ORDERED-PROBLEM,
    which is a focal problem wrt JOIN-ORDERED-LINK.
    Returns NIL if JOIN-ORDERED-PROBLEM is not in fact a focal problem wrt JOIN-ORDERED-LINK.
     */
    @LispMethod(comment = "@return NIL or problem-p; the corresponding non-focal problem of JOIN-ORDERED-PROBLEM,\r\nwhich is a focal problem wrt JOIN-ORDERED-LINK.\r\nReturns NIL if JOIN-ORDERED-PROBLEM is not in fact a focal problem wrt JOIN-ORDERED-LINK.")
    public static SubLObject corresponding_non_focal_problem(final SubLObject join_ordered_problem, final SubLObject join_ordered_link) {
        final SubLObject focal_mapped_problem = inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(join_ordered_link);
        final SubLObject focal_problem = inference_datastructures_problem_link.mapped_problem_problem(focal_mapped_problem);
        if (!join_ordered_problem.eql(focal_problem)) {
            return NIL;
        }
        final SubLObject non_focal_mapped_problem = inference_worker_join_ordered.join_ordered_link_non_focal_mapped_problem(join_ordered_link);
        if (NIL != non_focal_mapped_problem) {
            return inference_datastructures_problem_link.mapped_problem_problem(non_focal_mapped_problem);
        }
        return NIL;
    }

    /**
     *
     *
     * @return NIL or problem-p; the corresponding restricted focal problem of JOIN-ORDERED-PROBLEM,
    which is a restricted focal problem wrt RESTRICTION-LINK and JOIN-ORDERED-LINK.
    Returns NIL if JOIN-ORDERED-PROBLEM is not in fact a restricted non-focal problem wrt JOIN-ORDERED-LINK.
     */
    @LispMethod(comment = "@return NIL or problem-p; the corresponding restricted focal problem of JOIN-ORDERED-PROBLEM,\r\nwhich is a restricted focal problem wrt RESTRICTION-LINK and JOIN-ORDERED-LINK.\r\nReturns NIL if JOIN-ORDERED-PROBLEM is not in fact a restricted non-focal problem wrt JOIN-ORDERED-LINK.")
    public static final SubLObject corresponding_restricted_focal_problem_alt(SubLObject restriction_link, SubLObject join_ordered_link) {
        {
            SubLObject non_focal_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_non_focal_mapped_problem(join_ordered_link);
            if (NIL != non_focal_mapped_problem) {
                {
                    SubLObject non_focal_problem = inference_datastructures_problem_link.mapped_problem_problem(non_focal_mapped_problem);
                    SubLObject unrestricted_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
                    if (unrestricted_problem == non_focal_problem) {
                        {
                            SubLObject non_focal_restriction_bindings = restriction_link_bindings(restriction_link);
                            SubLObject focal_restriction_bindings = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.non_focal_bindings_to_focal_bindings(non_focal_restriction_bindings, join_ordered_link);
                            SubLObject restricted_focal_mapped_problem = (NIL != focal_restriction_bindings) ? ((SubLObject) (com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.find_restricted_focal_problem_by_bindings(join_ordered_link, focal_restriction_bindings))) : NIL;
                            if (NIL != restricted_focal_mapped_problem) {
                                return inference_datastructures_problem_link.mapped_problem_problem(restricted_focal_mapped_problem);
                            }
                        }
                    } else {
                        return NIL;
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return NIL or problem-p; the corresponding restricted focal problem of JOIN-ORDERED-PROBLEM,
    which is a restricted focal problem wrt RESTRICTION-LINK and JOIN-ORDERED-LINK.
    Returns NIL if JOIN-ORDERED-PROBLEM is not in fact a restricted non-focal problem wrt JOIN-ORDERED-LINK.
     */
    @LispMethod(comment = "@return NIL or problem-p; the corresponding restricted focal problem of JOIN-ORDERED-PROBLEM,\r\nwhich is a restricted focal problem wrt RESTRICTION-LINK and JOIN-ORDERED-LINK.\r\nReturns NIL if JOIN-ORDERED-PROBLEM is not in fact a restricted non-focal problem wrt JOIN-ORDERED-LINK.")
    public static SubLObject corresponding_restricted_focal_problem(final SubLObject restriction_link, final SubLObject join_ordered_link) {
        final SubLObject non_focal_mapped_problem = inference_worker_join_ordered.join_ordered_link_non_focal_mapped_problem(join_ordered_link);
        if (NIL != non_focal_mapped_problem) {
            final SubLObject non_focal_problem = inference_datastructures_problem_link.mapped_problem_problem(non_focal_mapped_problem);
            final SubLObject unrestricted_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
            if (!unrestricted_problem.eql(non_focal_problem)) {
                return NIL;
            }
            final SubLObject non_focal_restriction_bindings = inference_worker_restriction.restriction_link_bindings(restriction_link);
            final SubLObject focal_restriction_bindings = inference_worker_join_ordered.non_focal_bindings_to_focal_bindings(non_focal_restriction_bindings, join_ordered_link);
            final SubLObject restricted_focal_mapped_problem = (NIL != focal_restriction_bindings) ? inference_worker_join_ordered.find_restricted_focal_problem_by_bindings(join_ordered_link, focal_restriction_bindings) : NIL;
            if (NIL != restricted_focal_mapped_problem) {
                return inference_datastructures_problem_link.mapped_problem_problem(restricted_focal_mapped_problem);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether RESTRICTION-LINK supports a restricted non-focal problem wrt JOIN-ORDERED-LINK.
    It checks this by looking for a corresponding proof of the focal problem of JOIN-ORDERED-LINK
    with the same bindings (modulo variable map) as RESTRICTION-LINK.
     */
    @LispMethod(comment = "@return booleanp; whether RESTRICTION-LINK supports a restricted non-focal problem wrt JOIN-ORDERED-LINK.\r\nIt checks this by looking for a corresponding proof of the focal problem of JOIN-ORDERED-LINK\r\nwith the same bindings (modulo variable map) as RESTRICTION-LINK.")
    public static final SubLObject non_focal_restriction_link_with_corresponding_focal_proofP_alt(SubLObject restriction_link, SubLObject join_ordered_link) {
        return com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_restricted_non_focal_linkP(join_ordered_link, restriction_link);
    }

    /**
     *
     *
     * @return booleanp; whether RESTRICTION-LINK supports a restricted non-focal problem wrt JOIN-ORDERED-LINK.
    It checks this by looking for a corresponding proof of the focal problem of JOIN-ORDERED-LINK
    with the same bindings (modulo variable map) as RESTRICTION-LINK.
     */
    @LispMethod(comment = "@return booleanp; whether RESTRICTION-LINK supports a restricted non-focal problem wrt JOIN-ORDERED-LINK.\r\nIt checks this by looking for a corresponding proof of the focal problem of JOIN-ORDERED-LINK\r\nwith the same bindings (modulo variable map) as RESTRICTION-LINK.")
    public static SubLObject non_focal_restriction_link_with_corresponding_focal_proofP(final SubLObject restriction_link, final SubLObject join_ordered_link) {
        return inference_worker_join_ordered.join_ordered_link_restricted_non_focal_linkP(join_ordered_link, restriction_link);
    }

    /**
     *
     *
     * @return NIL or problem-p; the corresponding restricted non-focal problem of JOIN-ORDERED-PROBLEM,
    which is a restricted non-focal problem wrt RESTRICTION-LINK and JOIN-ORDERED-LINK.
    Returns NIL if JOIN-ORDERED-PROBLEM is not in fact a restricted focal problem wrt JOIN-ORDERED-LINK.
     */
    @LispMethod(comment = "@return NIL or problem-p; the corresponding restricted non-focal problem of JOIN-ORDERED-PROBLEM,\r\nwhich is a restricted non-focal problem wrt RESTRICTION-LINK and JOIN-ORDERED-LINK.\r\nReturns NIL if JOIN-ORDERED-PROBLEM is not in fact a restricted focal problem wrt JOIN-ORDERED-LINK.")
    public static final SubLObject corresponding_restricted_non_focal_problem_alt(SubLObject restriction_link, SubLObject join_ordered_link) {
        {
            SubLObject focal_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(join_ordered_link);
            SubLObject focal_problem = inference_datastructures_problem_link.mapped_problem_problem(focal_mapped_problem);
            SubLObject unrestricted_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
            if (unrestricted_problem == focal_problem) {
                if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_non_focal_mapped_problem(join_ordered_link)) {
                    {
                        SubLObject focal_restriction_bindings = restriction_link_bindings(restriction_link);
                        SubLObject non_focal_restriction_bindings = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.focal_bindings_to_non_focal_bindings(focal_restriction_bindings, join_ordered_link);
                        SubLObject restricted_non_focal_mapped_problem = (NIL != non_focal_restriction_bindings) ? ((SubLObject) (com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.find_restricted_non_focal_problem(join_ordered_link, non_focal_restriction_bindings))) : NIL;
                        if (NIL != restricted_non_focal_mapped_problem) {
                            return inference_datastructures_problem_link.mapped_problem_problem(restricted_non_focal_mapped_problem);
                        }
                    }
                }
            } else {
                return NIL;
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return NIL or problem-p; the corresponding restricted non-focal problem of JOIN-ORDERED-PROBLEM,
    which is a restricted non-focal problem wrt RESTRICTION-LINK and JOIN-ORDERED-LINK.
    Returns NIL if JOIN-ORDERED-PROBLEM is not in fact a restricted focal problem wrt JOIN-ORDERED-LINK.
     */
    @LispMethod(comment = "@return NIL or problem-p; the corresponding restricted non-focal problem of JOIN-ORDERED-PROBLEM,\r\nwhich is a restricted non-focal problem wrt RESTRICTION-LINK and JOIN-ORDERED-LINK.\r\nReturns NIL if JOIN-ORDERED-PROBLEM is not in fact a restricted focal problem wrt JOIN-ORDERED-LINK.")
    public static SubLObject corresponding_restricted_non_focal_problem(final SubLObject restriction_link, final SubLObject join_ordered_link) {
        final SubLObject focal_mapped_problem = inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(join_ordered_link);
        final SubLObject focal_problem = inference_datastructures_problem_link.mapped_problem_problem(focal_mapped_problem);
        final SubLObject unrestricted_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
        if (unrestricted_problem.eql(focal_problem)) {
            if (NIL != inference_worker_join_ordered.join_ordered_link_non_focal_mapped_problem(join_ordered_link)) {
                final SubLObject focal_restriction_bindings = inference_worker_restriction.restriction_link_bindings(restriction_link);
                final SubLObject non_focal_restriction_bindings = inference_worker_join_ordered.focal_bindings_to_non_focal_bindings(focal_restriction_bindings, join_ordered_link);
                final SubLObject restricted_non_focal_mapped_problem = (NIL != non_focal_restriction_bindings) ? inference_worker_join_ordered.find_restricted_non_focal_problem(join_ordered_link, non_focal_restriction_bindings) : NIL;
                if (NIL != restricted_non_focal_mapped_problem) {
                    return inference_datastructures_problem_link.mapped_problem_problem(restricted_non_focal_mapped_problem);
                }
            }
            return NIL;
        }
        return NIL;
    }

    public static final SubLObject find_restricted_focal_problem_by_bindings_alt(SubLObject join_ordered_link, SubLObject focal_restriction_bindings) {
        {
            SubLObject focal_problem = inference_datastructures_problem_link.mapped_problem_problem(com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(join_ordered_link));
            return com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.find_restricted_problem_and_link(focal_problem, focal_restriction_bindings);
        }
    }

    public static SubLObject find_restricted_focal_problem_by_bindings(final SubLObject join_ordered_link, final SubLObject focal_restriction_bindings) {
        final SubLObject focal_problem = inference_datastructures_problem_link.mapped_problem_problem(inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(join_ordered_link));
        return inference_worker_join_ordered.find_restricted_problem_and_link(focal_problem, focal_restriction_bindings);
    }

    public static final SubLObject mapped_proof_is_focalP_alt(SubLObject subproof, SubLObject proof_variable_map, SubLObject join_ordered_link) {
        {
            SubLObject focal_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(join_ordered_link);
            SubLObject focal_problem = inference_datastructures_problem_link.mapped_problem_problem(focal_mapped_problem);
            SubLObject subproof_supported_problem = inference_datastructures_proof.proof_supported_problem(subproof);
            if (focal_problem == subproof_supported_problem) {
                {
                    SubLObject focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(focal_mapped_problem);
                    if (NIL != bindings.bindings_equalP(focal_variable_map, proof_variable_map)) {
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject mapped_proof_is_focalP(final SubLObject subproof, final SubLObject proof_variable_map, final SubLObject join_ordered_link) {
        final SubLObject focal_mapped_problem = inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(join_ordered_link);
        final SubLObject focal_problem = inference_datastructures_problem_link.mapped_problem_problem(focal_mapped_problem);
        final SubLObject subproof_supported_problem = inference_datastructures_proof.proof_supported_problem(subproof);
        if (focal_problem.eql(subproof_supported_problem)) {
            final SubLObject focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(focal_mapped_problem);
            if (NIL != bindings_equalP(focal_variable_map, proof_variable_map)) {
                return T;
            }
        }
        return NIL;
    }

    public static final SubLObject trigger_vars_shared_by_sibling_alt(SubLObject join_ordered_link, SubLObject trigger_is_focalP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.trigger_vars_shared_by_sibling_internal(join_ordered_link, trigger_is_focalP);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, TRIGGER_VARS_SHARED_BY_SIBLING, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), TRIGGER_VARS_SHARED_BY_SIBLING, TWO_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, TRIGGER_VARS_SHARED_BY_SIBLING, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(join_ordered_link, trigger_is_focalP);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw69$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (join_ordered_link == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && (trigger_is_focalP == cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.trigger_vars_shared_by_sibling_internal(join_ordered_link, trigger_is_focalP)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(join_ordered_link, trigger_is_focalP));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject trigger_vars_shared_by_sibling(final SubLObject join_ordered_link, final SubLObject trigger_is_focalP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject local_state = inference_datastructures_problem_link.problem_link_memoization_state(join_ordered_link);
        final SubLObject _prev_bind_0 = $memoization_state$.currentBinding(thread);
        try {
            $memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state_original_process(local_state);
            try {
                result = inference_worker_join_ordered.memoized_trigger_vars_shared_by_sibling_int(join_ordered_link, trigger_is_focalP);
            } finally {
                final SubLObject _prev_bind_0_$18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                }
            }
        } finally {
            $memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject memoized_trigger_vars_shared_by_sibling_int_internal(final SubLObject join_ordered_link, final SubLObject trigger_is_focalP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state(inference_datastructures_problem_link.problem_link_store(join_ordered_link));
        final SubLObject _prev_bind_0 = $memoization_state$.currentBinding(thread);
        try {
            $memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state_original_process(local_state);
            try {
                return inference_worker_join_ordered.trigger_vars_shared_by_sibling_int(join_ordered_link, trigger_is_focalP);
            } finally {
                final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                }
            }
        } finally {
            $memoization_state$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject memoized_trigger_vars_shared_by_sibling_int(final SubLObject join_ordered_link, final SubLObject trigger_is_focalP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = $memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_worker_join_ordered.memoized_trigger_vars_shared_by_sibling_int_internal(join_ordered_link, trigger_is_focalP);
        }
        caching_state = memoization_state_lookup(v_memoization_state, inference_worker_join_ordered.MEMOIZED_TRIGGER_VARS_SHARED_BY_SIBLING_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = create_caching_state(memoization_state_lock(v_memoization_state), inference_worker_join_ordered.MEMOIZED_TRIGGER_VARS_SHARED_BY_SIBLING_INT, TWO_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state_put(v_memoization_state, inference_worker_join_ordered.MEMOIZED_TRIGGER_VARS_SHARED_BY_SIBLING_INT, caching_state);
        }
        final SubLObject sxhash = sxhash_calc_2(join_ordered_link, trigger_is_focalP);
        final SubLObject collisions = caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql($memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (join_ordered_link.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && trigger_is_focalP.eql(cached_args.first())) {
                        return caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_worker_join_ordered.memoized_trigger_vars_shared_by_sibling_int_internal(join_ordered_link, trigger_is_focalP)));
        caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(join_ordered_link, trigger_is_focalP));
        return caching_results(results3);
    }

    public static SubLObject trigger_vars_shared_by_sibling_int(final SubLObject join_ordered_link, final SubLObject trigger_is_focalP) {
        if (NIL != trigger_is_focalP) {
            final SubLObject tactic = inference_worker_join_ordered.join_ordered_link_tactic(join_ordered_link);
            final SubLObject focal_mapped_problem = inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(join_ordered_link);
            final SubLObject focal_clause = inference_datastructures_problem.problem_sole_clause(inference_datastructures_problem_link.mapped_problem_problem(focal_mapped_problem));
            final SubLObject focal_supporting_problem_spec = inference_worker_join_ordered.join_ordered_tactic_focal_supporting_problem_spec(tactic);
            final SubLObject dnf_clause = inference_datastructures_problem.problem_sole_clause(inference_datastructures_problem_link.problem_link_supported_problem(join_ordered_link));
            final SubLObject non_focal_clause = complement_of_subclause_specified_by_spec(dnf_clause, focal_supporting_problem_spec);
            final SubLObject non_focal_vars = tree_gather(non_focal_clause, symbol_function(VARIABLE_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject focal_focal_vars = tree_gather(focal_clause, symbol_function(VARIABLE_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject focal_vars = apply_bindings(inference_datastructures_problem_link.mapped_problem_variable_map(focal_mapped_problem), focal_focal_vars);
            final SubLObject shared_vars = intersection(focal_vars, non_focal_vars, symbol_function(EQ), UNPROVIDED);
            final SubLObject focal_shared_vars = apply_bindings_backwards(inference_datastructures_problem_link.mapped_problem_variable_map(focal_mapped_problem), shared_vars);
            final SubLObject canonical_shared_vars = inference_worker_join_ordered.canonicalize_hl_variable_list(focal_shared_vars);
            return canonical_shared_vars;
        }
        final SubLObject trigger_to_sibling_variable_map = inference_worker_join_ordered.trigger_to_sibling_variable_map(join_ordered_link, trigger_is_focalP);
        return Mapping.mapcar(inference_worker_join_ordered.VARIABLE_BINDING_VARIABLE, trigger_to_sibling_variable_map);
    }

    public static final SubLObject non_focal_vars_shared_by_focal_alt(SubLObject join_ordered_link) {
        return com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.trigger_vars_shared_by_sibling(join_ordered_link, NIL);
    }

    public static SubLObject non_focal_vars_shared_by_focal(final SubLObject join_ordered_link) {
        return inference_worker_join_ordered.trigger_vars_shared_by_sibling(join_ordered_link, NIL);
    }

    /**
     * This is complicated to avoid unnecessarily manifesting non-focals.
     */
    @LispMethod(comment = "This is complicated to avoid unnecessarily manifesting non-focals.")
    public static final SubLObject focal_vars_shared_by_non_focal_alt(SubLObject join_ordered_link) {
        {
            SubLObject tactic = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_tactic(join_ordered_link);
            SubLObject focal_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(join_ordered_link);
            SubLObject focal_clause = inference_datastructures_problem.problem_sole_clause(inference_datastructures_problem_link.mapped_problem_problem(focal_mapped_problem));
            SubLObject focal_supporting_problem_spec = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_tactic_focal_supporting_problem_spec(tactic);
            SubLObject dnf_clause = inference_datastructures_problem.problem_sole_clause(inference_datastructures_problem_link.problem_link_supported_problem(join_ordered_link));
            SubLObject non_focal_clause = clause_utilities.complement_of_subclause_specified_by_spec(dnf_clause, focal_supporting_problem_spec);
            SubLObject non_focal_vars = list_utilities.tree_gather(non_focal_clause, symbol_function(VARIABLE_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject focal_focal_vars = list_utilities.tree_gather(focal_clause, symbol_function(VARIABLE_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject focal_vars = bindings.apply_bindings(inference_datastructures_problem_link.mapped_problem_variable_map(focal_mapped_problem), focal_focal_vars);
            SubLObject shared_vars = intersection(focal_vars, non_focal_vars, symbol_function(EQ), UNPROVIDED);
            SubLObject focal_shared_vars = bindings.apply_bindings_backwards(inference_datastructures_problem_link.mapped_problem_variable_map(focal_mapped_problem), shared_vars);
            return focal_shared_vars;
        }
    }

    @LispMethod(comment = "This is complicated to avoid unnecessarily manifesting non-focals.")
    public static SubLObject focal_vars_shared_by_non_focal(final SubLObject join_ordered_link) {
        return inference_worker_join_ordered.trigger_vars_shared_by_sibling(join_ordered_link, T);
    }

    public static SubLObject canonicalize_hl_variable_list(final SubLObject hl_vars) {
        return hl_vars;
    }

    public static final SubLObject join_ordered_link_join_vars_alt(SubLObject join_ordered_link) {
        {
            SubLObject trigger_vars_shared_by_sibling = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.trigger_vars_shared_by_sibling(join_ordered_link, T);
            SubLObject focal_to_supported_variable_map = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_focal_to_supported_variable_map(join_ordered_link);
            SubLObject join_vars = bindings.apply_bindings(focal_to_supported_variable_map, trigger_vars_shared_by_sibling);
            return join_vars;
        }
    }

    public static SubLObject join_ordered_link_join_vars(final SubLObject join_ordered_link) {
        final SubLObject trigger_vars_shared_by_sibling = inference_worker_join_ordered.trigger_vars_shared_by_sibling(join_ordered_link, T);
        final SubLObject focal_to_supported_variable_map = inference_worker_join_ordered.join_ordered_link_focal_to_supported_variable_map(join_ordered_link);
        final SubLObject join_vars = apply_bindings(focal_to_supported_variable_map, trigger_vars_shared_by_sibling);
        return join_vars;
    }

    public static final SubLObject join_ordered_link_focal_to_supported_variable_map_alt(SubLObject join_ordered_link) {
        {
            SubLObject focal_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(join_ordered_link);
            return inference_datastructures_problem_link.mapped_problem_variable_map(focal_mapped_problem);
        }
    }

    public static SubLObject join_ordered_link_focal_to_supported_variable_map(final SubLObject join_ordered_link) {
        final SubLObject focal_mapped_problem = inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(join_ordered_link);
        return inference_datastructures_problem_link.mapped_problem_variable_map(focal_mapped_problem);
    }

    public static final SubLObject join_ordered_link_non_focal_to_supported_variable_map_alt(SubLObject join_ordered_link) {
        {
            SubLObject non_focal_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_non_focal_mapped_problem(join_ordered_link);
            return inference_datastructures_problem_link.mapped_problem_variable_map(non_focal_mapped_problem);
        }
    }

    public static SubLObject join_ordered_link_non_focal_to_supported_variable_map(final SubLObject join_ordered_link) {
        final SubLObject non_focal_mapped_problem = inference_worker_join_ordered.join_ordered_link_non_focal_mapped_problem(join_ordered_link);
        return inference_datastructures_problem_link.mapped_problem_variable_map(non_focal_mapped_problem);
    }

    /**
     *
     *
     * @unknown TRIGGER-PROOF must be a :proven proof, because otherwise it would not have bubbled up
    to JOIN-ORDERED-LINK.
     */
    @LispMethod(comment = "@unknown TRIGGER-PROOF must be a :proven proof, because otherwise it would not have bubbled up\r\nto JOIN-ORDERED-LINK.")
    public static final SubLObject add_join_ordered_link_proof_alt(SubLObject join_ordered_link, SubLObject trigger_proof, SubLObject trigger_is_focalP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == inference_datastructures_proof.proof_provenP(trigger_proof)) {
                    Errors.error($str_alt77$_a_was_a_rejected_proof, trigger_proof);
                }
            }
            {
                SubLObject shared_trigger_proof_bindings = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_shared_proof_bindings(join_ordered_link, trigger_proof, trigger_is_focalP);
                if (NIL != trigger_is_focalP) {
                    com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.add_join_ordered_link_focal_proof(join_ordered_link, shared_trigger_proof_bindings, trigger_proof);
                } else {
                    com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.add_join_ordered_link_non_focal_proof(join_ordered_link, shared_trigger_proof_bindings, trigger_proof);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @unknown TRIGGER-PROOF must be a :proven proof, because otherwise it would not have bubbled up
    to JOIN-ORDERED-LINK.
     */
    @LispMethod(comment = "@unknown TRIGGER-PROOF must be a :proven proof, because otherwise it would not have bubbled up\r\nto JOIN-ORDERED-LINK.")
    public static SubLObject add_join_ordered_link_proof(final SubLObject join_ordered_link, final SubLObject trigger_proof, final SubLObject trigger_is_focalP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == inference_datastructures_proof.proof_provenP(trigger_proof))) {
            Errors.error(inference_worker_join_ordered.$str85$_a_was_a_rejected_proof, trigger_proof);
        }
        final SubLObject shared_trigger_proof_bindings = inference_worker_join_ordered.join_ordered_link_shared_proof_bindings(join_ordered_link, trigger_proof, trigger_is_focalP);
        if (NIL != trigger_is_focalP) {
            inference_worker_join_ordered.add_join_ordered_link_focal_proof(join_ordered_link, shared_trigger_proof_bindings, trigger_proof);
        } else {
            inference_worker_join_ordered.add_join_ordered_link_non_focal_proof(join_ordered_link, shared_trigger_proof_bindings, trigger_proof);
        }
        return NIL;
    }

    public static final SubLObject join_ordered_link_shared_proof_bindings_alt(SubLObject join_ordered_link, SubLObject trigger_proof, SubLObject trigger_is_focalP) {
        {
            SubLObject trigger_proof_bindings = inference_datastructures_proof.proof_bindings(trigger_proof);
            return com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_shared_proof_bindings_int(join_ordered_link, trigger_proof_bindings, trigger_is_focalP);
        }
    }

    public static SubLObject join_ordered_link_shared_proof_bindings(final SubLObject join_ordered_link, final SubLObject trigger_proof, final SubLObject trigger_is_focalP) {
        final SubLObject trigger_proof_bindings = inference_datastructures_proof.proof_bindings(trigger_proof);
        return inference_worker_join_ordered.join_ordered_link_shared_proof_bindings_int(join_ordered_link, trigger_proof_bindings, trigger_is_focalP);
    }

    public static final SubLObject remove_join_ordered_link_proof_alt(SubLObject join_ordered_link, SubLObject trigger_proof, SubLObject trigger_proof_bindings, SubLObject trigger_is_focalP) {
        {
            SubLObject shared_trigger_proof_bindings = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_shared_proof_bindings_int(join_ordered_link, trigger_proof_bindings, trigger_is_focalP);
            if (NIL != trigger_is_focalP) {
                com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.remove_join_ordered_link_focal_proof(join_ordered_link, shared_trigger_proof_bindings, trigger_proof);
            } else {
                com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.remove_join_ordered_link_non_focal_proof(join_ordered_link, shared_trigger_proof_bindings, trigger_proof);
            }
        }
        return NIL;
    }

    public static SubLObject remove_join_ordered_link_proof(final SubLObject join_ordered_link, final SubLObject trigger_proof, final SubLObject trigger_proof_bindings, final SubLObject trigger_is_focalP) {
        final SubLObject shared_trigger_proof_bindings = inference_worker_join_ordered.join_ordered_link_shared_proof_bindings_int(join_ordered_link, trigger_proof_bindings, trigger_is_focalP);
        if (NIL != trigger_is_focalP) {
            inference_worker_join_ordered.remove_join_ordered_link_focal_proof(join_ordered_link, shared_trigger_proof_bindings, trigger_proof);
        } else {
            inference_worker_join_ordered.remove_join_ordered_link_non_focal_proof(join_ordered_link, shared_trigger_proof_bindings, trigger_proof);
        }
        return NIL;
    }

    public static final SubLObject remove_join_ordered_link_proof_both_ways_alt(SubLObject join_ordered_link, SubLObject proof, SubLObject v_bindings) {
        com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.remove_join_ordered_link_proof(join_ordered_link, proof, v_bindings, T);
        com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.remove_join_ordered_link_proof(join_ordered_link, proof, v_bindings, NIL);
        return NIL;
    }

    public static SubLObject remove_join_ordered_link_proof_both_ways(final SubLObject join_ordered_link, final SubLObject proof, final SubLObject v_bindings) {
        if (NIL != inference_worker_join_ordered.join_ordered_link_non_focal_manifestedP(join_ordered_link)) {
            inference_worker_join_ordered.remove_join_ordered_link_proof(join_ordered_link, proof, v_bindings, T);
            inference_worker_join_ordered.remove_join_ordered_link_proof(join_ordered_link, proof, v_bindings, NIL);
        } else {
            inference_worker_join_ordered.remove_join_ordered_link_proof(join_ordered_link, proof, v_bindings, T);
        }
        return NIL;
    }

    public static final SubLObject join_ordered_link_shared_proof_bindings_int_alt(SubLObject join_ordered_link, SubLObject trigger_proof_bindings, SubLObject trigger_is_focalP) {
        {
            SubLObject trigger_vars_shared_by_sibling = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.trigger_vars_shared_by_sibling(join_ordered_link, trigger_is_focalP);
            SubLObject shared_trigger_proof_bindings = bindings.filter_bindings_by_variables(trigger_proof_bindings, trigger_vars_shared_by_sibling);
            return shared_trigger_proof_bindings;
        }
    }

    public static SubLObject join_ordered_link_shared_proof_bindings_int(final SubLObject join_ordered_link, final SubLObject trigger_proof_bindings, final SubLObject trigger_is_focalP) {
        final SubLObject trigger_vars_shared_by_sibling = inference_worker_join_ordered.trigger_vars_shared_by_sibling(join_ordered_link, trigger_is_focalP);
        final SubLObject shared_trigger_proof_bindings = filter_bindings_by_variables(trigger_proof_bindings, trigger_vars_shared_by_sibling);
        return shared_trigger_proof_bindings;
    }

    public static final SubLObject join_ordered_link_sibling_proofs_lookup_alt(SubLObject join_ordered_link, SubLObject sibling_proof_bindings, SubLObject trigger_is_focalP) {
        return NIL != trigger_is_focalP ? ((SubLObject) (com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_non_focal_proofs_lookup(join_ordered_link, sibling_proof_bindings))) : com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_focal_proofs_lookup(join_ordered_link, sibling_proof_bindings);
    }

    public static SubLObject join_ordered_link_sibling_proofs_lookup(final SubLObject join_ordered_link, final SubLObject sibling_proof_bindings, final SubLObject trigger_is_focalP) {
        return NIL != trigger_is_focalP ? inference_worker_join_ordered.join_ordered_link_non_focal_proofs_lookup(join_ordered_link, sibling_proof_bindings) : inference_worker_join_ordered.join_ordered_link_focal_proofs_lookup(join_ordered_link, sibling_proof_bindings);
    }

    public static final SubLObject bubble_up_proof_to_join_ordered_link_int_alt(SubLObject trigger_subproof, SubLObject variable_map, SubLObject join_ordered_link, SubLObject trigger_is_focalP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject proofs = NIL;
                SubLObject trigger_proof_bindings = inference_datastructures_proof.proof_bindings(trigger_subproof);
                SubLObject sibling_proof_bindings = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.compute_sibling_proof_bindings(trigger_proof_bindings, join_ordered_link, trigger_is_focalP);
                SubLObject sibling_proofs = list_utilities.remove_if_not($sym78$PROOF_PROVEN_, com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_sibling_proofs_lookup(join_ordered_link, sibling_proof_bindings, trigger_is_focalP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != sibling_proofs) {
                    {
                        SubLObject sibling_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_sibling_mapped_problem(join_ordered_link, trigger_is_focalP);
                        SubLObject sibling_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(sibling_mapped_problem);
                        SubLObject sibling_proofs_with_bindings = NIL;
                        {
                            SubLObject cdolist_list_var = sibling_proofs;
                            SubLObject sibling_proof = NIL;
                            for (sibling_proof = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sibling_proof = cdolist_list_var.first()) {
                                {
                                    SubLObject sibling_sub_proof_bindings = bindings.transfer_variable_map_to_bindings(sibling_variable_map, inference_datastructures_proof.proof_bindings(sibling_proof));
                                    sibling_proofs_with_bindings = cons(cons(sibling_proof, sibling_sub_proof_bindings), sibling_proofs_with_bindings);
                                }
                            }
                        }
                        sibling_proofs_with_bindings = nreverse(sibling_proofs_with_bindings);
                        {
                            SubLObject trigger_sub_proof_bindings = bindings.transfer_variable_map_to_bindings(variable_map, trigger_proof_bindings);
                            SubLObject supporting_mapped_proof_lists_by_supporting_problem = (NIL != trigger_is_focalP) ? ((SubLObject) (list(list(cons(trigger_subproof, trigger_sub_proof_bindings)), sibling_proofs_with_bindings))) : list(sibling_proofs_with_bindings, list(cons(trigger_subproof, trigger_sub_proof_bindings)));
                            SubLObject mapped_subproof_lists = list_utilities.cartesian_product(supporting_mapped_proof_lists_by_supporting_problem, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject cdolist_list_var = mapped_subproof_lists;
                            SubLObject mapped_subproof_list = NIL;
                            for (mapped_subproof_list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mapped_subproof_list = cdolist_list_var.first()) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject proof = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.new_join_ordered_proof(join_ordered_link, mapped_subproof_list);
                                    SubLObject newP = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != newP) {
                                        proofs = cons(proof, proofs);
                                    } else {
                                        inference_worker.possibly_note_proof_processed(trigger_subproof);
                                    }
                                }
                            }
                        }
                    }
                    proofs = nreverse(proofs);
                    {
                        SubLObject cdolist_list_var = proofs;
                        SubLObject proof = NIL;
                        for (proof = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , proof = cdolist_list_var.first()) {
                            inference_worker.bubble_up_proof(proof);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject bubble_up_proof_to_join_ordered_link_int(final SubLObject trigger_subproof, final SubLObject variable_map, final SubLObject join_ordered_link, final SubLObject trigger_is_focalP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject proofs = NIL;
        final SubLObject trigger_proof_bindings = inference_datastructures_proof.proof_bindings(trigger_subproof);
        final SubLObject sibling_proof_bindings = inference_worker_join_ordered.compute_sibling_proof_bindings(trigger_proof_bindings, join_ordered_link, trigger_is_focalP);
        final SubLObject sibling_proofs = remove_if_not(inference_worker_join_ordered.$sym86$PROOF_PROVEN_, inference_worker_join_ordered.join_ordered_link_sibling_proofs_lookup(join_ordered_link, sibling_proof_bindings, trigger_is_focalP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != sibling_proofs) {
            final SubLObject sibling_mapped_problem = inference_worker_join_ordered.join_ordered_link_sibling_mapped_problem(join_ordered_link, trigger_is_focalP);
            final SubLObject sibling_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(sibling_mapped_problem);
            SubLObject sibling_proofs_with_bindings = NIL;
            SubLObject cdolist_list_var = sibling_proofs;
            SubLObject sibling_proof = NIL;
            sibling_proof = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject sibling_sub_proof_bindings = transfer_variable_map_to_bindings(sibling_variable_map, inference_datastructures_proof.proof_bindings(sibling_proof));
                sibling_proofs_with_bindings = cons(cons(sibling_proof, sibling_sub_proof_bindings), sibling_proofs_with_bindings);
                cdolist_list_var = cdolist_list_var.rest();
                sibling_proof = cdolist_list_var.first();
            } 
            sibling_proofs_with_bindings = nreverse(sibling_proofs_with_bindings);
            final SubLObject trigger_sub_proof_bindings = transfer_variable_map_to_bindings(variable_map, trigger_proof_bindings);
            final SubLObject supporting_mapped_proof_lists_by_supporting_problem = (NIL != trigger_is_focalP) ? list(list(cons(trigger_subproof, trigger_sub_proof_bindings)), sibling_proofs_with_bindings) : list(sibling_proofs_with_bindings, list(cons(trigger_subproof, trigger_sub_proof_bindings)));
            SubLObject cdolist_list_var2;
            final SubLObject mapped_subproof_lists = cdolist_list_var2 = cartesian_product(supporting_mapped_proof_lists_by_supporting_problem, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject mapped_subproof_list = NIL;
            mapped_subproof_list = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                thread.resetMultipleValues();
                final SubLObject proof = inference_worker_join_ordered.new_join_ordered_proof(join_ordered_link, mapped_subproof_list);
                final SubLObject newP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != newP) {
                    proofs = cons(proof, proofs);
                } else {
                    inference_worker.possibly_note_proof_processed(trigger_subproof);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                mapped_subproof_list = cdolist_list_var2.first();
            } 
            SubLObject cdolist_list_var3;
            proofs = cdolist_list_var3 = nreverse(proofs);
            SubLObject proof2 = NIL;
            proof2 = cdolist_list_var3.first();
            while (NIL != cdolist_list_var3) {
                inference_worker.bubble_up_proof(proof2);
                cdolist_list_var3 = cdolist_list_var3.rest();
                proof2 = cdolist_list_var3.first();
            } 
        }
        return NIL;
    }

    public static final SubLObject join_ordered_link_sibling_mapped_problem_alt(SubLObject join_ordered_link, SubLObject trigger_is_focalP) {
        return NIL != trigger_is_focalP ? ((SubLObject) (com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_non_focal_mapped_problem(join_ordered_link))) : com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(join_ordered_link);
    }

    public static SubLObject join_ordered_link_sibling_mapped_problem(final SubLObject join_ordered_link, final SubLObject trigger_is_focalP) {
        return NIL != trigger_is_focalP ? inference_worker_join_ordered.join_ordered_link_non_focal_mapped_problem(join_ordered_link) : inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(join_ordered_link);
    }

    public static final SubLObject join_ordered_link_could_be_finishedP_alt(SubLObject jo_link, SubLObject strategic_context) {
        {
            SubLObject unfinishedP = makeBoolean(NIL == inference_worker.finished_problem_p(com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_focal_problem(jo_link), strategic_context));
            if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_non_focal_manifestedP(jo_link)) {
                {
                    SubLObject link_var = jo_link;
                    SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_non_focal_problem(link_var));
                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                    SubLObject state = NIL;
                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); !((NIL != unfinishedP) || (NIL != set_contents.do_set_contents_doneP(basis_object, state))); state = set_contents.do_set_contents_update_state(state)) {
                        {
                            SubLObject restriction_link = set_contents.do_set_contents_next(basis_object, state);
                            if (NIL != set_contents.do_set_contents_element_validP(state, restriction_link)) {
                                if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $RESTRICTION)) {
                                    if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.non_focal_restriction_link_with_corresponding_focal_proofP(restriction_link, link_var)) {
                                        {
                                            SubLObject restricted_non_focal_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(restriction_link);
                                            unfinishedP = makeBoolean(NIL == inference_worker.finished_problem_p(restricted_non_focal_problem, strategic_context));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return makeBoolean(NIL == unfinishedP);
        }
    }

    public static SubLObject join_ordered_link_could_be_finishedP(final SubLObject jo_link, final SubLObject strategic_context) {
        SubLObject unfinishedP = makeBoolean(NIL == inference_worker.finished_problem_p(inference_worker_join_ordered.join_ordered_link_focal_problem(jo_link), strategic_context));
        if (NIL != inference_worker_join_ordered.join_ordered_link_non_focal_manifestedP(jo_link)) {
            final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(inference_worker_join_ordered.join_ordered_link_non_focal_problem(jo_link));
            SubLObject basis_object;
            SubLObject state;
            SubLObject restriction_link;
            SubLObject restricted_non_focal_problem;
            for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); (NIL == unfinishedP) && (NIL == do_set_contents_doneP(basis_object, state)); state = do_set_contents_update_state(state)) {
                restriction_link = do_set_contents_next(basis_object, state);
                if (((NIL != do_set_contents_element_validP(state, restriction_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $RESTRICTION))) && (NIL != inference_worker_join_ordered.non_focal_restriction_link_with_corresponding_focal_proofP(restriction_link, jo_link))) {
                    restricted_non_focal_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(restriction_link);
                    unfinishedP = makeBoolean(NIL == inference_worker.finished_problem_p(restricted_non_focal_problem, strategic_context));
                }
            }
        }
        return makeBoolean(NIL == unfinishedP);
    }

    /**
     * Additionally, a join-ordered link is no good if:
     * - its focal problem is FINISHED and preferred AND
     * - all argument links of the focal problem are either
     * . no-good, or
     * . have a no-good restricted non-focal
     * Another case in which a join-ordered link is no good is if the tactic that caused it to
     * be created has been discarded.
     */
    @LispMethod(comment = "Additionally, a join-ordered link is no good if:\r\n- its focal problem is FINISHED and preferred AND\r\n- all argument links of the focal problem are either\r\n. no-good, or\r\n. have a no-good restricted non-focal\r\nAnother case in which a join-ordered link is no good is if the tactic that caused it to\r\nbe created has been discarded.\nAdditionally, a join-ordered link is no good if:\n- its focal problem is FINISHED and preferred AND\n- all argument links of the focal problem are either\n. no-good, or\n. have a no-good restricted non-focal\nAnother case in which a join-ordered link is no good is if the tactic that caused it to\nbe created has been discarded.")
    public static final SubLObject join_ordered_link_no_goodP_alt(SubLObject join_ordered_link, SubLObject consider_deepP, SubLObject strategic_context) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_no_good_case_1P(join_ordered_link, consider_deepP, strategic_context)) || (NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_no_good_case_2P(join_ordered_link, consider_deepP, strategic_context)));
    }

    @LispMethod(comment = "Additionally, a join-ordered link is no good if:\r\n- its focal problem is FINISHED and preferred AND\r\n- all argument links of the focal problem are either\r\n. no-good, or\r\n. have a no-good restricted non-focal\r\nAnother case in which a join-ordered link is no good is if the tactic that caused it to\r\nbe created has been discarded.\nAdditionally, a join-ordered link is no good if:\n- its focal problem is FINISHED and preferred AND\n- all argument links of the focal problem are either\n. no-good, or\n. have a no-good restricted non-focal\nAnother case in which a join-ordered link is no good is if the tactic that caused it to\nbe created has been discarded.")
    public static SubLObject join_ordered_link_no_goodP(final SubLObject join_ordered_link, final SubLObject consider_deepP, final SubLObject strategic_context) {
        return makeBoolean((NIL != inference_worker_join_ordered.join_ordered_link_no_good_case_1P(join_ordered_link, consider_deepP, strategic_context)) || (NIL != inference_worker_join_ordered.join_ordered_link_no_good_case_2P(join_ordered_link, consider_deepP, strategic_context)));
    }

    public static final SubLObject join_ordered_link_no_good_case_1P_alt(SubLObject join_ordered_link, SubLObject consider_deepP, SubLObject strategic_context) {
        {
            SubLObject focal_problem = inference_datastructures_problem_link.mapped_problem_problem(com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(join_ordered_link));
            SubLObject shared_vars = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.focal_vars_shared_by_non_focal(join_ordered_link);
            if ((NIL != inference_worker.finished_problem_p(focal_problem, strategic_context)) && ($PREFERRED == inference_tactician_utilities.memoized_problem_global_preference_level(focal_problem, strategic_context, shared_vars))) {
                {
                    SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(focal_problem);
                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                    SubLObject state = NIL;
                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        {
                            SubLObject argument_link = set_contents.do_set_contents_next(basis_object, state);
                            if (NIL != set_contents.do_set_contents_element_validP(state, argument_link)) {
                                if (NIL == inference_worker.problem_link_no_good_wrt_dependent_join_ordered_linkP(argument_link, join_ordered_link, consider_deepP, strategic_context)) {
                                    return NIL;
                                }
                            }
                        }
                    }
                }
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject join_ordered_link_no_good_case_1P(final SubLObject join_ordered_link, final SubLObject consider_deepP, final SubLObject strategic_context) {
        final SubLObject focal_problem = inference_datastructures_problem_link.mapped_problem_problem(inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(join_ordered_link));
        final SubLObject shared_vars = inference_worker_join_ordered.focal_vars_shared_by_non_focal(join_ordered_link);
        if ((NIL != inference_worker.finished_problem_p(focal_problem, strategic_context)) && ($PREFERRED == inference_tactician_utilities.memoized_problem_global_preference_level(focal_problem, strategic_context, shared_vars))) {
            final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(focal_problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject argument_link;
            for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
                argument_link = do_set_contents_next(basis_object, state);
                if ((NIL != do_set_contents_element_validP(state, argument_link)) && (NIL == inference_worker.problem_link_no_good_wrt_dependent_join_ordered_linkP(argument_link, join_ordered_link, consider_deepP, strategic_context))) {
                    return NIL;
                }
            }
            return T;
        }
        return NIL;
    }

    public static final SubLObject join_ordered_link_no_good_case_2P_alt(SubLObject join_ordered_link, SubLObject consider_deepP, SubLObject strategic_context) {
        if (NIL != consider_deepP) {
            {
                SubLObject tactic = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_tactic(join_ordered_link);
                return inference_datastructures_tactic.tactic_discardedP(tactic);
            }
        }
        return NIL;
    }

    public static SubLObject join_ordered_link_no_good_case_2P(final SubLObject join_ordered_link, final SubLObject consider_deepP, final SubLObject strategic_context) {
        if (NIL != consider_deepP) {
            final SubLObject tactic = inference_worker_join_ordered.join_ordered_link_tactic(join_ordered_link);
            return inference_datastructures_tactic.tactic_discardedP(tactic);
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether JOIN-ORDERED-LINK's non-focal problem has an unbound predicate
    that would be bound by its focal problem.
     */
    @LispMethod(comment = "@return booleanp; whether JOIN-ORDERED-LINK\'s non-focal problem has an unbound predicate\r\nthat would be bound by its focal problem.")
    public static final SubLObject join_ordered_link_with_non_focal_unbound_predicateP_alt(SubLObject join_ordered_link) {
        {
            SubLObject non_focal_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_non_focal_problem(join_ordered_link);
            SubLObject non_focal_query = inference_datastructures_problem.problem_query(non_focal_problem);
            SubLObject cdolist_list_var = non_focal_query;
            SubLObject contextualized_clause = NIL;
            for (contextualized_clause = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , contextualized_clause = cdolist_list_var.first()) {
                {
                    SubLObject sense = $NEG;
                    SubLObject index_var = ZERO_INTEGER;
                    SubLObject cdolist_list_var_8 = clauses.neg_lits(contextualized_clause);
                    SubLObject contextualized_asent = NIL;
                    for (contextualized_asent = cdolist_list_var_8.first(); NIL != cdolist_list_var_8; cdolist_list_var_8 = cdolist_list_var_8.rest() , contextualized_asent = cdolist_list_var_8.first()) {
                        {
                            SubLObject datum = contextualized_asent;
                            SubLObject current = datum;
                            SubLObject mt = NIL;
                            SubLObject asent = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt80);
                            mt = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt80);
                            asent = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject pred = atomic_sentence_predicate(asent);
                                    if (NIL != cycl_variables.hl_varP(pred)) {
                                        if (NIL != list_utilities.member_eqP(pred, com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.non_focal_vars_shared_by_focal(join_ordered_link))) {
                                            return T;
                                        }
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt80);
                            }
                        }
                        index_var = add(index_var, ONE_INTEGER);
                    }
                }
                {
                    SubLObject sense = $POS;
                    SubLObject index_var = ZERO_INTEGER;
                    SubLObject cdolist_list_var_9 = clauses.pos_lits(contextualized_clause);
                    SubLObject contextualized_asent = NIL;
                    for (contextualized_asent = cdolist_list_var_9.first(); NIL != cdolist_list_var_9; cdolist_list_var_9 = cdolist_list_var_9.rest() , contextualized_asent = cdolist_list_var_9.first()) {
                        {
                            SubLObject datum = contextualized_asent;
                            SubLObject current = datum;
                            SubLObject mt = NIL;
                            SubLObject asent = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt80);
                            mt = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt80);
                            asent = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject pred = atomic_sentence_predicate(asent);
                                    if (NIL != cycl_variables.hl_varP(pred)) {
                                        if (NIL != list_utilities.member_eqP(pred, com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.non_focal_vars_shared_by_focal(join_ordered_link))) {
                                            return T;
                                        }
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt80);
                            }
                        }
                        index_var = add(index_var, ONE_INTEGER);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether JOIN-ORDERED-LINK's non-focal problem has an unbound predicate
    that would be bound by its focal problem.
     */
    @LispMethod(comment = "@return booleanp; whether JOIN-ORDERED-LINK\'s non-focal problem has an unbound predicate\r\nthat would be bound by its focal problem.")
    public static SubLObject join_ordered_link_with_non_focal_unbound_predicateP(final SubLObject join_ordered_link) {
        final SubLObject non_focal_problem = inference_worker_join_ordered.join_ordered_link_non_focal_problem(join_ordered_link);
        SubLObject cdolist_list_var;
        final SubLObject non_focal_query = cdolist_list_var = inference_datastructures_problem.problem_query(non_focal_problem);
        SubLObject contextualized_clause = NIL;
        contextualized_clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject sense = $NEG;
            SubLObject index_var = ZERO_INTEGER;
            SubLObject cdolist_list_var_$20 = neg_lits(contextualized_clause);
            SubLObject contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var_$20.first();
            while (NIL != cdolist_list_var_$20) {
                SubLObject current;
                final SubLObject datum = current = contextualized_asent;
                SubLObject mt = NIL;
                SubLObject asent = NIL;
                destructuring_bind_must_consp(current, datum, inference_worker_join_ordered.$list88);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, inference_worker_join_ordered.$list88);
                asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
                    if ((NIL != hl_varP(pred)) && (NIL != subl_promotions.memberP(pred, inference_worker_join_ordered.non_focal_vars_shared_by_focal(join_ordered_link), UNPROVIDED, UNPROVIDED))) {
                        return T;
                    }
                } else {
                    cdestructuring_bind_error(datum, inference_worker_join_ordered.$list88);
                }
                index_var = add(index_var, ONE_INTEGER);
                cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                contextualized_asent = cdolist_list_var_$20.first();
            } 
            sense = $POS;
            index_var = ZERO_INTEGER;
            SubLObject cdolist_list_var_$21 = pos_lits(contextualized_clause);
            contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var_$21.first();
            while (NIL != cdolist_list_var_$21) {
                SubLObject current;
                final SubLObject datum = current = contextualized_asent;
                SubLObject mt = NIL;
                SubLObject asent = NIL;
                destructuring_bind_must_consp(current, datum, inference_worker_join_ordered.$list88);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, inference_worker_join_ordered.$list88);
                asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
                    if ((NIL != hl_varP(pred)) && (NIL != subl_promotions.memberP(pred, inference_worker_join_ordered.non_focal_vars_shared_by_focal(join_ordered_link), UNPROVIDED, UNPROVIDED))) {
                        return T;
                    }
                } else {
                    cdestructuring_bind_error(datum, inference_worker_join_ordered.$list88);
                }
                index_var = add(index_var, ONE_INTEGER);
                cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                contextualized_asent = cdolist_list_var_$21.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_clause = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether JOIN-ORDERED-LINK's non-focal problem is (#$isa ?var0 ?var1) and
    the ?var1 is restricted by the focal problem.
     */
    @LispMethod(comment = "@return booleanp; whether JOIN-ORDERED-LINK\'s non-focal problem is (#$isa ?var0 ?var1) and\r\nthe ?var1 is restricted by the focal problem.")
    public static final SubLObject join_ordered_link_with_non_focal_isa_unbound_unbound_where_arg2_is_restrictedP_alt(SubLObject join_ordered_link) {
        {
            SubLObject non_focal_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_link_non_focal_problem(join_ordered_link);
            SubLObject non_focal_query = inference_datastructures_problem.problem_query(non_focal_problem);
            SubLObject cdolist_list_var = non_focal_query;
            SubLObject contextualized_clause = NIL;
            for (contextualized_clause = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , contextualized_clause = cdolist_list_var.first()) {
                {
                    SubLObject sense = $NEG;
                    SubLObject index_var = ZERO_INTEGER;
                    SubLObject cdolist_list_var_10 = clauses.neg_lits(contextualized_clause);
                    SubLObject contextualized_asent = NIL;
                    for (contextualized_asent = cdolist_list_var_10.first(); NIL != cdolist_list_var_10; cdolist_list_var_10 = cdolist_list_var_10.rest() , contextualized_asent = cdolist_list_var_10.first()) {
                        {
                            SubLObject datum = contextualized_asent;
                            SubLObject current = datum;
                            SubLObject mt = NIL;
                            SubLObject asent = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt80);
                            mt = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt80);
                            asent = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject pred = atomic_sentence_predicate(asent);
                                    SubLObject arg1 = atomic_sentence_arg2(asent, UNPROVIDED);
                                    SubLObject arg2 = atomic_sentence_arg2(asent, UNPROVIDED);
                                    if ((((pred == $$isa) && (NIL != variable_p(arg1))) && (NIL != variable_p(arg2))) && (NIL != list_utilities.member_eqP(arg2, com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.non_focal_vars_shared_by_focal(join_ordered_link)))) {
                                        return T;
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt80);
                            }
                        }
                        index_var = add(index_var, ONE_INTEGER);
                    }
                }
                {
                    SubLObject sense = $POS;
                    SubLObject index_var = ZERO_INTEGER;
                    SubLObject cdolist_list_var_11 = clauses.pos_lits(contextualized_clause);
                    SubLObject contextualized_asent = NIL;
                    for (contextualized_asent = cdolist_list_var_11.first(); NIL != cdolist_list_var_11; cdolist_list_var_11 = cdolist_list_var_11.rest() , contextualized_asent = cdolist_list_var_11.first()) {
                        {
                            SubLObject datum = contextualized_asent;
                            SubLObject current = datum;
                            SubLObject mt = NIL;
                            SubLObject asent = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt80);
                            mt = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt80);
                            asent = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject pred = atomic_sentence_predicate(asent);
                                    SubLObject arg1 = atomic_sentence_arg2(asent, UNPROVIDED);
                                    SubLObject arg2 = atomic_sentence_arg2(asent, UNPROVIDED);
                                    if ((((pred == $$isa) && (NIL != variable_p(arg1))) && (NIL != variable_p(arg2))) && (NIL != list_utilities.member_eqP(arg2, com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.non_focal_vars_shared_by_focal(join_ordered_link)))) {
                                        return T;
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt80);
                            }
                        }
                        index_var = add(index_var, ONE_INTEGER);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether JOIN-ORDERED-LINK's non-focal problem is (#$isa ?var0 ?var1) and
    the ?var1 is restricted by the focal problem.
     */
    @LispMethod(comment = "@return booleanp; whether JOIN-ORDERED-LINK\'s non-focal problem is (#$isa ?var0 ?var1) and\r\nthe ?var1 is restricted by the focal problem.")
    public static SubLObject join_ordered_link_with_non_focal_isa_unbound_unbound_where_arg2_is_restrictedP(final SubLObject join_ordered_link) {
        final SubLObject non_focal_problem = inference_worker_join_ordered.join_ordered_link_non_focal_problem(join_ordered_link);
        SubLObject cdolist_list_var;
        final SubLObject non_focal_query = cdolist_list_var = inference_datastructures_problem.problem_query(non_focal_problem);
        SubLObject contextualized_clause = NIL;
        contextualized_clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject sense = $NEG;
            SubLObject index_var = ZERO_INTEGER;
            SubLObject cdolist_list_var_$22 = neg_lits(contextualized_clause);
            SubLObject contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var_$22.first();
            while (NIL != cdolist_list_var_$22) {
                SubLObject current;
                final SubLObject datum = current = contextualized_asent;
                SubLObject mt = NIL;
                SubLObject asent = NIL;
                destructuring_bind_must_consp(current, datum, inference_worker_join_ordered.$list88);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, inference_worker_join_ordered.$list88);
                asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
                    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                    if (((pred.eql(inference_worker_join_ordered.$$isa) && (NIL != variables.variable_p(arg1))) && (NIL != variables.variable_p(arg2))) && (NIL != subl_promotions.memberP(arg2, inference_worker_join_ordered.non_focal_vars_shared_by_focal(join_ordered_link), UNPROVIDED, UNPROVIDED))) {
                        return T;
                    }
                } else {
                    cdestructuring_bind_error(datum, inference_worker_join_ordered.$list88);
                }
                index_var = add(index_var, ONE_INTEGER);
                cdolist_list_var_$22 = cdolist_list_var_$22.rest();
                contextualized_asent = cdolist_list_var_$22.first();
            } 
            sense = $POS;
            index_var = ZERO_INTEGER;
            SubLObject cdolist_list_var_$23 = pos_lits(contextualized_clause);
            contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var_$23.first();
            while (NIL != cdolist_list_var_$23) {
                SubLObject current;
                final SubLObject datum = current = contextualized_asent;
                SubLObject mt = NIL;
                SubLObject asent = NIL;
                destructuring_bind_must_consp(current, datum, inference_worker_join_ordered.$list88);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, inference_worker_join_ordered.$list88);
                asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
                    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                    if (((pred.eql(inference_worker_join_ordered.$$isa) && (NIL != variables.variable_p(arg1))) && (NIL != variables.variable_p(arg2))) && (NIL != subl_promotions.memberP(arg2, inference_worker_join_ordered.non_focal_vars_shared_by_focal(join_ordered_link), UNPROVIDED, UNPROVIDED))) {
                        return T;
                    }
                } else {
                    cdestructuring_bind_error(datum, inference_worker_join_ordered.$list88);
                }
                index_var = add(index_var, ONE_INTEGER);
                cdolist_list_var_$23 = cdolist_list_var_$23.rest();
                contextualized_asent = cdolist_list_var_$23.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_clause = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject declare_inference_worker_join_ordered_file_alt() {
        declareFunction("join_ordered_link_data_print_function_trampoline", "JOIN-ORDERED-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("join_ordered_link_data_p", "JOIN-ORDERED-LINK-DATA-P", 1, 0, false);
        new com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.$join_ordered_link_data_p$UnaryFunction();
        declareFunction("jo_link_data_focal_proof_index", "JO-LINK-DATA-FOCAL-PROOF-INDEX", 1, 0, false);
        declareFunction("jo_link_data_non_focal_proof_index", "JO-LINK-DATA-NON-FOCAL-PROOF-INDEX", 1, 0, false);
        declareFunction("jo_link_data_restricted_non_focal_link_index", "JO-LINK-DATA-RESTRICTED-NON-FOCAL-LINK-INDEX", 1, 0, false);
        declareFunction("_csetf_jo_link_data_focal_proof_index", "_CSETF-JO-LINK-DATA-FOCAL-PROOF-INDEX", 2, 0, false);
        declareFunction("_csetf_jo_link_data_non_focal_proof_index", "_CSETF-JO-LINK-DATA-NON-FOCAL-PROOF-INDEX", 2, 0, false);
        declareFunction("_csetf_jo_link_data_restricted_non_focal_link_index", "_CSETF-JO-LINK-DATA-RESTRICTED-NON-FOCAL-LINK-INDEX", 2, 0, false);
        declareFunction("make_join_ordered_link_data", "MAKE-JOIN-ORDERED-LINK-DATA", 0, 1, false);
        declareFunction("valid_join_ordered_link_data_p", "VALID-JOIN-ORDERED-LINK-DATA-P", 1, 0, false);
        declareFunction("new_join_ordered_link_data", "NEW-JOIN-ORDERED-LINK-DATA", 0, 0, false);
        declareFunction("join_ordered_link_p", "JOIN-ORDERED-LINK-P", 1, 0, false);
        declareFunction("maybe_new_join_ordered_link", "MAYBE-NEW-JOIN-ORDERED-LINK", 3, 0, false);
        declareFunction("new_join_ordered_link", "NEW-JOIN-ORDERED-LINK", 3, 0, false);
        declareFunction("destroy_join_ordered_link", "DESTROY-JOIN-ORDERED-LINK", 1, 0, false);
        declareMacro("do_join_ordered_link_focal_proofs", "DO-JOIN-ORDERED-LINK-FOCAL-PROOFS");
        declareMacro("do_join_ordered_link_non_focal_proofs", "DO-JOIN-ORDERED-LINK-NON-FOCAL-PROOFS");
        declareMacro("do_join_ordered_link_restricted_non_focal_problems", "DO-JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-PROBLEMS");
        declareMacro("do_virtual_dependent_join_ordered_links", "DO-VIRTUAL-DEPENDENT-JOIN-ORDERED-LINKS");
        declareFunction("join_ordered_link_focal_proof_index", "JOIN-ORDERED-LINK-FOCAL-PROOF-INDEX", 1, 0, false);
        declareFunction("join_ordered_link_non_focal_proof_index", "JOIN-ORDERED-LINK-NON-FOCAL-PROOF-INDEX", 1, 0, false);
        declareFunction("join_ordered_link_restricted_non_focal_link_index", "JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-LINK-INDEX", 1, 0, false);
        declareFunction("join_ordered_link_triggered_restriction_link", "JOIN-ORDERED-LINK-TRIGGERED-RESTRICTION-LINK", 2, 0, false);
        declareFunction("join_ordered_link_triggered_restricted_non_focal", "JOIN-ORDERED-LINK-TRIGGERED-RESTRICTED-NON-FOCAL", 2, 0, false);
        declareFunction("join_ordered_link_restricted_non_focal_links", "JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-LINKS", 1, 0, false);
        declareFunction("join_ordered_link_restricted_non_focal_triggering_proof", "JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-TRIGGERING-PROOF", 2, 0, false);
        declareFunction("join_ordered_link_focal_mapped_problem", "JOIN-ORDERED-LINK-FOCAL-MAPPED-PROBLEM", 1, 0, false);
        declareFunction("join_ordered_link_has_non_focal_mapped_problemP", "JOIN-ORDERED-LINK-HAS-NON-FOCAL-MAPPED-PROBLEM?", 1, 0, false);
        declareFunction("join_ordered_link_non_focal_mapped_problem", "JOIN-ORDERED-LINK-NON-FOCAL-MAPPED-PROBLEM", 1, 0, false);
        declareFunction("join_ordered_link_non_focal_manifestedP", "JOIN-ORDERED-LINK-NON-FOCAL-MANIFESTED?", 1, 0, false);
        declareFunction("join_ordered_link_focal_problem", "JOIN-ORDERED-LINK-FOCAL-PROBLEM", 1, 0, false);
        declareFunction("join_ordered_link_non_focal_problem", "JOIN-ORDERED-LINK-NON-FOCAL-PROBLEM", 1, 0, false);
        declareFunction("join_ordered_link_other_mapped_problem", "JOIN-ORDERED-LINK-OTHER-MAPPED-PROBLEM", 2, 0, false);
        declareFunction("join_ordered_link_focal_proofs_lookup", "JOIN-ORDERED-LINK-FOCAL-PROOFS-LOOKUP", 2, 0, false);
        declareFunction("join_ordered_link_non_focal_proofs_lookup", "JOIN-ORDERED-LINK-NON-FOCAL-PROOFS-LOOKUP", 2, 0, false);
        declareFunction("join_ordered_link_tactic", "JOIN-ORDERED-LINK-TACTIC", 1, 0, false);
        declareFunction("join_ordered_link_restricted_non_focal_linkP", "JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-LINK?", 2, 0, false);
        declareFunction("join_ordered_link_restricted_non_focal_count", "JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-COUNT", 1, 0, false);
        declareFunction("add_join_ordered_link_focal_proof", "ADD-JOIN-ORDERED-LINK-FOCAL-PROOF", 3, 0, false);
        declareFunction("remove_join_ordered_link_focal_proof", "REMOVE-JOIN-ORDERED-LINK-FOCAL-PROOF", 3, 0, false);
        declareFunction("add_join_ordered_link_non_focal_proof", "ADD-JOIN-ORDERED-LINK-NON-FOCAL-PROOF", 3, 0, false);
        declareFunction("remove_join_ordered_link_non_focal_proof", "REMOVE-JOIN-ORDERED-LINK-NON-FOCAL-PROOF", 3, 0, false);
        declareFunction("add_join_ordered_link_restricted_non_focal_link", "ADD-JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-LINK", 3, 0, false);
        declareFunction("remove_join_ordered_link_restricted_non_focal_link", "REMOVE-JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-LINK", 2, 0, false);
        declareFunction("join_ordered_link_focal_supporting_problem_spec", "JOIN-ORDERED-LINK-FOCAL-SUPPORTING-PROBLEM-SPEC", 1, 0, false);
        declareFunction("join_ordered_link_non_focal_supporting_problem_spec", "JOIN-ORDERED-LINK-NON-FOCAL-SUPPORTING-PROBLEM-SPEC", 1, 0, false);
        declareFunction("join_ordered_tactic_p", "JOIN-ORDERED-TACTIC-P", 1, 0, false);
        declareFunction("single_focal_literal_join_ordered_tactic_p", "SINGLE-FOCAL-LITERAL-JOIN-ORDERED-TACTIC-P", 1, 0, false);
        declareFunction("new_join_ordered_tactic", "NEW-JOIN-ORDERED-TACTIC", 2, 0, false);
        declareFunction("join_ordered_tactic_link", "JOIN-ORDERED-TACTIC-LINK", 1, 0, false);
        declareFunction("join_ordered_tactic_focal_supporting_problem_spec", "JOIN-ORDERED-TACTIC-FOCAL-SUPPORTING-PROBLEM-SPEC", 1, 0, false);
        declareFunction("join_ordered_tactic_subsumesP", "JOIN-ORDERED-TACTIC-SUBSUMES?", 2, 0, false);
        declareFunction("find_or_create_join_ordered_tactic_focal_mapped_problem", "FIND-OR-CREATE-JOIN-ORDERED-TACTIC-FOCAL-MAPPED-PROBLEM", 1, 0, false);
        declareFunction("find_or_create_join_ordered_tactic_non_focal_mapped_problem", "FIND-OR-CREATE-JOIN-ORDERED-TACTIC-NON-FOCAL-MAPPED-PROBLEM", 1, 0, false);
        declareFunction("determine_new_join_ordered_tactics", "DETERMINE-NEW-JOIN-ORDERED-TACTICS", 2, 0, false);
        declareFunction("problem_has_a_complete_conjunctive_removal_tacticP", "PROBLEM-HAS-A-COMPLETE-CONJUNCTIVE-REMOVAL-TACTIC?", 1, 0, false);
        declareFunction("problem_has_a_candidate_early_removal_tacticP", "PROBLEM-HAS-A-CANDIDATE-EARLY-REMOVAL-TACTIC?", 1, 0, false);
        declareFunction("determine_new_single_literal_join_ordered_tactics", "DETERMINE-NEW-SINGLE-LITERAL-JOIN-ORDERED-TACTICS", 2, 0, false);
        declareFunction("potentially_simplifying_asentP", "POTENTIALLY-SIMPLIFYING-ASENT?", 1, 0, false);
        declareFunction("determine_new_single_literal_join_ordered_tactic", "DETERMINE-NEW-SINGLE-LITERAL-JOIN-ORDERED-TACTIC", 4, 0, false);
        declareFunction("motivated_followup_multi_literal_subclause_specs_case_1", "MOTIVATED-FOLLOWUP-MULTI-LITERAL-SUBCLAUSE-SPECS-CASE-1", 2, 0, false);
        declareFunction("problem_store_followup_query_problem_p", "PROBLEM-STORE-FOLLOWUP-QUERY-PROBLEM-P", 1, 0, false);
        declareFunction("motivated_followup_multi_literal_subclause_specs_case_2", "MOTIVATED-FOLLOWUP-MULTI-LITERAL-SUBCLAUSE-SPECS-CASE-2", 2, 0, false);
        declareFunction("matching_subclause_specs", "MATCHING-SUBCLAUSE-SPECS", 2, 0, false);
        declareFunction("matching_subclause_index_dictionary", "MATCHING-SUBCLAUSE-INDEX-DICTIONARY", 2, 0, false);
        declareFunction("matching_subclause_index_dictionary_to_indices_list", "MATCHING-SUBCLAUSE-INDEX-DICTIONARY-TO-INDICES-LIST", 1, 0, false);
        declareFunction("sub_matching_subclause_specs", "SUB-MATCHING-SUBCLAUSE-SPECS", 2, 0, false);
        declareFunction("determine_new_join_ordered_tactic", "DETERMINE-NEW-JOIN-ORDERED-TACTIC", 3, 0, false);
        declareFunction("find_or_create_join_ordered_focal_mapped_problem", "FIND-OR-CREATE-JOIN-ORDERED-FOCAL-MAPPED-PROBLEM", 3, 0, false);
        declareFunction("find_or_create_join_ordered_non_focal_mapped_problem", "FIND-OR-CREATE-JOIN-ORDERED-NON-FOCAL-MAPPED-PROBLEM", 3, 0, false);
        declareFunction("lazily_create_join_ordered_link_non_focal_mapped_problem", "LAZILY-CREATE-JOIN-ORDERED-LINK-NON-FOCAL-MAPPED-PROBLEM", 1, 0, false);
        declareFunction("compute_strategic_properties_of_join_ordered_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-JOIN-ORDERED-TACTIC", 2, 0, false);
        declareFunction("compute_join_ordered_tactic_productivity", "COMPUTE-JOIN-ORDERED-TACTIC-PRODUCTIVITY", 2, 0, false);
        declareFunction("compute_join_ordered_tactic_preference_level", "COMPUTE-JOIN-ORDERED-TACTIC-PREFERENCE-LEVEL", 2, 0, false);
        declareFunction("execute_join_ordered_tactic", "EXECUTE-JOIN-ORDERED-TACTIC", 1, 0, false);
        declareFunction("consider_strategic_ramifications_of_tactic_preference_level", "CONSIDER-STRATEGIC-RAMIFICATIONS-OF-TACTIC-PREFERENCE-LEVEL", 1, 0, false);
        declareFunction("join_ordered_tactic_lookahead_problem", "JOIN-ORDERED-TACTIC-LOOKAHEAD-PROBLEM", 1, 0, false);
        declareFunction("new_join_ordered_proof", "NEW-JOIN-ORDERED-PROOF", 2, 0, false);
        declareFunction("join_ordered_proof_p", "JOIN-ORDERED-PROOF-P", 1, 0, false);
        declareFunction("connected_conjunction_proof_p", "CONNECTED-CONJUNCTION-PROOF-P", 1, 0, false);
        declareFunction("new_conjunctive_proof", "NEW-CONJUNCTIVE-PROOF", 2, 0, false);
        declareFunction("compute_sibling_proof_bindings", "COMPUTE-SIBLING-PROOF-BINDINGS", 3, 0, false);
        declareFunction("focal_to_non_focal_variable_map_internal", "FOCAL-TO-NON-FOCAL-VARIABLE-MAP-INTERNAL", 1, 0, false);
        declareFunction("focal_to_non_focal_variable_map", "FOCAL-TO-NON-FOCAL-VARIABLE-MAP", 1, 0, false);
        declareFunction("non_focal_to_focal_variable_map_internal", "NON-FOCAL-TO-FOCAL-VARIABLE-MAP-INTERNAL", 1, 0, false);
        declareFunction("non_focal_to_focal_variable_map", "NON-FOCAL-TO-FOCAL-VARIABLE-MAP", 1, 0, false);
        declareFunction("trigger_to_sibling_variable_map", "TRIGGER-TO-SIBLING-VARIABLE-MAP", 2, 0, false);
        declareFunction("focal_bindings_to_non_focal_bindings", "FOCAL-BINDINGS-TO-NON-FOCAL-BINDINGS", 2, 0, false);
        declareFunction("non_focal_bindings_to_focal_bindings", "NON-FOCAL-BINDINGS-TO-FOCAL-BINDINGS", 2, 0, false);
        declareFunction("bubble_up_proof_to_join_ordered_link", "BUBBLE-UP-PROOF-TO-JOIN-ORDERED-LINK", 3, 0, false);
        declareFunction("trigger_split_restriction", "TRIGGER-SPLIT-RESTRICTION", 2, 0, false);
        declareFunction("find_split_restriction", "FIND-SPLIT-RESTRICTION", 2, 0, false);
        declareFunction("find_or_create_split_restriction_int", "FIND-OR-CREATE-SPLIT-RESTRICTION-INT", 3, 0, false);
        declareFunction("note_all_triggering_proofs_processed", "NOTE-ALL-TRIGGERING-PROOFS-PROCESSED", 1, 0, false);
        declareFunction("note_restricted_non_focal_finished", "NOTE-RESTRICTED-NON-FOCAL-FINISHED", 2, 0, false);
        declareFunction("find_or_create_restricted_non_focal_problem", "FIND-OR-CREATE-RESTRICTED-NON-FOCAL-PROBLEM", 2, 0, false);
        declareFunction("find_restricted_non_focal_problem", "FIND-RESTRICTED-NON-FOCAL-PROBLEM", 2, 0, false);
        declareFunction("find_or_create_restricted_non_focal_problem_int", "FIND-OR-CREATE-RESTRICTED-NON-FOCAL-PROBLEM-INT", 3, 0, false);
        declareFunction("find_restricted_problem_and_link", "FIND-RESTRICTED-PROBLEM-AND-LINK", 2, 0, false);
        declareFunction("find_or_create_restricted_problem_and_link_int", "FIND-OR-CREATE-RESTRICTED-PROBLEM-AND-LINK-INT", 3, 0, false);
        declareFunction("find_or_create_restricted_problem", "FIND-OR-CREATE-RESTRICTED-PROBLEM", 2, 0, false);
        declareFunction("find_or_create_restricted_problem_int", "FIND-OR-CREATE-RESTRICTED-PROBLEM-INT", 3, 0, false);
        declareFunction("focal_problem_is_a_single_literal_backchain_requiredP", "FOCAL-PROBLEM-IS-A-SINGLE-LITERAL-BACKCHAIN-REQUIRED?", 1, 0, false);
        declareFunction("corresponding_focal_problem", "CORRESPONDING-FOCAL-PROBLEM", 2, 0, false);
        declareFunction("corresponding_non_focal_problem", "CORRESPONDING-NON-FOCAL-PROBLEM", 2, 0, false);
        declareFunction("corresponding_restricted_focal_problem", "CORRESPONDING-RESTRICTED-FOCAL-PROBLEM", 2, 0, false);
        declareFunction("non_focal_restriction_link_with_corresponding_focal_proofP", "NON-FOCAL-RESTRICTION-LINK-WITH-CORRESPONDING-FOCAL-PROOF?", 2, 0, false);
        declareFunction("corresponding_restricted_non_focal_problem", "CORRESPONDING-RESTRICTED-NON-FOCAL-PROBLEM", 2, 0, false);
        declareFunction("find_restricted_focal_problem_by_bindings", "FIND-RESTRICTED-FOCAL-PROBLEM-BY-BINDINGS", 2, 0, false);
        declareFunction("mapped_proof_is_focalP", "MAPPED-PROOF-IS-FOCAL?", 3, 0, false);
        declareFunction("trigger_vars_shared_by_sibling_internal", "TRIGGER-VARS-SHARED-BY-SIBLING-INTERNAL", 2, 0, false);
        declareFunction("trigger_vars_shared_by_sibling", "TRIGGER-VARS-SHARED-BY-SIBLING", 2, 0, false);
        declareFunction("non_focal_vars_shared_by_focal", "NON-FOCAL-VARS-SHARED-BY-FOCAL", 1, 0, false);
        declareFunction("focal_vars_shared_by_non_focal", "FOCAL-VARS-SHARED-BY-NON-FOCAL", 1, 0, false);
        declareFunction("join_ordered_link_join_vars", "JOIN-ORDERED-LINK-JOIN-VARS", 1, 0, false);
        declareFunction("join_ordered_link_focal_to_supported_variable_map", "JOIN-ORDERED-LINK-FOCAL-TO-SUPPORTED-VARIABLE-MAP", 1, 0, false);
        declareFunction("join_ordered_link_non_focal_to_supported_variable_map", "JOIN-ORDERED-LINK-NON-FOCAL-TO-SUPPORTED-VARIABLE-MAP", 1, 0, false);
        declareFunction("add_join_ordered_link_proof", "ADD-JOIN-ORDERED-LINK-PROOF", 3, 0, false);
        declareFunction("join_ordered_link_shared_proof_bindings", "JOIN-ORDERED-LINK-SHARED-PROOF-BINDINGS", 3, 0, false);
        declareFunction("remove_join_ordered_link_proof", "REMOVE-JOIN-ORDERED-LINK-PROOF", 4, 0, false);
        declareFunction("remove_join_ordered_link_proof_both_ways", "REMOVE-JOIN-ORDERED-LINK-PROOF-BOTH-WAYS", 3, 0, false);
        declareFunction("join_ordered_link_shared_proof_bindings_int", "JOIN-ORDERED-LINK-SHARED-PROOF-BINDINGS-INT", 3, 0, false);
        declareFunction("join_ordered_link_sibling_proofs_lookup", "JOIN-ORDERED-LINK-SIBLING-PROOFS-LOOKUP", 3, 0, false);
        declareFunction("bubble_up_proof_to_join_ordered_link_int", "BUBBLE-UP-PROOF-TO-JOIN-ORDERED-LINK-INT", 4, 0, false);
        declareFunction("join_ordered_link_sibling_mapped_problem", "JOIN-ORDERED-LINK-SIBLING-MAPPED-PROBLEM", 2, 0, false);
        declareFunction("join_ordered_link_could_be_finishedP", "JOIN-ORDERED-LINK-COULD-BE-FINISHED?", 2, 0, false);
        declareFunction("join_ordered_link_no_goodP", "JOIN-ORDERED-LINK-NO-GOOD?", 3, 0, false);
        declareFunction("join_ordered_link_no_good_case_1P", "JOIN-ORDERED-LINK-NO-GOOD-CASE-1?", 3, 0, false);
        declareFunction("join_ordered_link_no_good_case_2P", "JOIN-ORDERED-LINK-NO-GOOD-CASE-2?", 3, 0, false);
        declareFunction("join_ordered_link_with_non_focal_unbound_predicateP", "JOIN-ORDERED-LINK-WITH-NON-FOCAL-UNBOUND-PREDICATE?", 1, 0, false);
        declareFunction("join_ordered_link_with_non_focal_isa_unbound_unbound_where_arg2_is_restrictedP", "JOIN-ORDERED-LINK-WITH-NON-FOCAL-ISA-UNBOUND-UNBOUND-WHERE-ARG2-IS-RESTRICTED?", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_inference_worker_join_ordered_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("join_ordered_link_data_print_function_trampoline", "JOIN-ORDERED-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("join_ordered_link_data_p", "JOIN-ORDERED-LINK-DATA-P", 1, 0, false);
            new inference_worker_join_ordered.$join_ordered_link_data_p$UnaryFunction();
            declareFunction("jo_link_data_focal_proof_index", "JO-LINK-DATA-FOCAL-PROOF-INDEX", 1, 0, false);
            declareFunction("jo_link_data_non_focal_proof_index", "JO-LINK-DATA-NON-FOCAL-PROOF-INDEX", 1, 0, false);
            declareFunction("jo_link_data_restricted_non_focal_link_index", "JO-LINK-DATA-RESTRICTED-NON-FOCAL-LINK-INDEX", 1, 0, false);
            declareFunction("_csetf_jo_link_data_focal_proof_index", "_CSETF-JO-LINK-DATA-FOCAL-PROOF-INDEX", 2, 0, false);
            declareFunction("_csetf_jo_link_data_non_focal_proof_index", "_CSETF-JO-LINK-DATA-NON-FOCAL-PROOF-INDEX", 2, 0, false);
            declareFunction("_csetf_jo_link_data_restricted_non_focal_link_index", "_CSETF-JO-LINK-DATA-RESTRICTED-NON-FOCAL-LINK-INDEX", 2, 0, false);
            declareFunction("make_join_ordered_link_data", "MAKE-JOIN-ORDERED-LINK-DATA", 0, 1, false);
            declareFunction("visit_defstruct_join_ordered_link_data", "VISIT-DEFSTRUCT-JOIN-ORDERED-LINK-DATA", 2, 0, false);
            declareFunction("visit_defstruct_object_join_ordered_link_data_method", "VISIT-DEFSTRUCT-OBJECT-JOIN-ORDERED-LINK-DATA-METHOD", 2, 0, false);
            declareFunction("valid_join_ordered_link_data_p", "VALID-JOIN-ORDERED-LINK-DATA-P", 1, 0, false);
            declareFunction("new_join_ordered_link_data", "NEW-JOIN-ORDERED-LINK-DATA", 0, 0, false);
            declareFunction("join_ordered_link_p", "JOIN-ORDERED-LINK-P", 1, 0, false);
            declareFunction("maybe_new_join_ordered_link", "MAYBE-NEW-JOIN-ORDERED-LINK", 3, 0, false);
            declareFunction("new_join_ordered_link", "NEW-JOIN-ORDERED-LINK", 3, 0, false);
            declareFunction("destroy_join_ordered_link", "DESTROY-JOIN-ORDERED-LINK", 1, 0, false);
            declareMacro("do_join_ordered_link_focal_proofs", "DO-JOIN-ORDERED-LINK-FOCAL-PROOFS");
            declareMacro("do_join_ordered_link_non_focal_proofs", "DO-JOIN-ORDERED-LINK-NON-FOCAL-PROOFS");
            declareMacro("do_join_ordered_link_restricted_non_focal_problems", "DO-JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-PROBLEMS");
            declareMacro("do_virtual_dependent_join_ordered_links", "DO-VIRTUAL-DEPENDENT-JOIN-ORDERED-LINKS");
            declareFunction("join_ordered_link_focal_proof_index", "JOIN-ORDERED-LINK-FOCAL-PROOF-INDEX", 1, 0, false);
            declareFunction("join_ordered_link_non_focal_proof_index", "JOIN-ORDERED-LINK-NON-FOCAL-PROOF-INDEX", 1, 0, false);
            declareFunction("join_ordered_link_restricted_non_focal_link_index", "JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-LINK-INDEX", 1, 0, false);
            declareFunction("join_ordered_link_triggered_restriction_link", "JOIN-ORDERED-LINK-TRIGGERED-RESTRICTION-LINK", 2, 0, false);
            declareFunction("join_ordered_link_triggered_restricted_non_focal", "JOIN-ORDERED-LINK-TRIGGERED-RESTRICTED-NON-FOCAL", 2, 0, false);
            declareFunction("join_ordered_link_restricted_non_focal_links", "JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-LINKS", 1, 0, false);
            declareFunction("join_ordered_link_restricted_non_focal_triggering_proof", "JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-TRIGGERING-PROOF", 2, 0, false);
            declareFunction("join_ordered_link_focal_mapped_problem", "JOIN-ORDERED-LINK-FOCAL-MAPPED-PROBLEM", 1, 0, false);
            declareFunction("join_ordered_link_has_non_focal_mapped_problemP", "JOIN-ORDERED-LINK-HAS-NON-FOCAL-MAPPED-PROBLEM?", 1, 0, false);
            declareFunction("join_ordered_link_non_focal_mapped_problem", "JOIN-ORDERED-LINK-NON-FOCAL-MAPPED-PROBLEM", 1, 0, false);
            declareFunction("join_ordered_link_non_focal_manifestedP", "JOIN-ORDERED-LINK-NON-FOCAL-MANIFESTED?", 1, 0, false);
            declareFunction("join_ordered_link_focal_problem", "JOIN-ORDERED-LINK-FOCAL-PROBLEM", 1, 0, false);
            declareFunction("join_ordered_link_non_focal_problem", "JOIN-ORDERED-LINK-NON-FOCAL-PROBLEM", 1, 0, false);
            declareFunction("join_ordered_link_other_mapped_problem", "JOIN-ORDERED-LINK-OTHER-MAPPED-PROBLEM", 2, 0, false);
            declareFunction("join_ordered_link_focal_proofs_lookup", "JOIN-ORDERED-LINK-FOCAL-PROOFS-LOOKUP", 2, 0, false);
            declareFunction("join_ordered_link_non_focal_proofs_lookup", "JOIN-ORDERED-LINK-NON-FOCAL-PROOFS-LOOKUP", 2, 0, false);
            declareFunction("join_ordered_link_tactic", "JOIN-ORDERED-LINK-TACTIC", 1, 0, false);
            declareFunction("join_ordered_link_restricted_non_focal_linkP", "JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-LINK?", 2, 0, false);
            declareFunction("join_ordered_link_restricted_non_focal_count", "JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-COUNT", 1, 0, false);
            declareFunction("add_join_ordered_link_focal_proof", "ADD-JOIN-ORDERED-LINK-FOCAL-PROOF", 3, 0, false);
            declareFunction("remove_join_ordered_link_focal_proof", "REMOVE-JOIN-ORDERED-LINK-FOCAL-PROOF", 3, 0, false);
            declareFunction("add_join_ordered_link_non_focal_proof", "ADD-JOIN-ORDERED-LINK-NON-FOCAL-PROOF", 3, 0, false);
            declareFunction("remove_join_ordered_link_non_focal_proof", "REMOVE-JOIN-ORDERED-LINK-NON-FOCAL-PROOF", 3, 0, false);
            declareFunction("add_join_ordered_link_restricted_non_focal_link", "ADD-JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-LINK", 3, 0, false);
            declareFunction("remove_join_ordered_link_restricted_non_focal_link", "REMOVE-JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-LINK", 2, 0, false);
            declareFunction("join_ordered_link_focal_supporting_problem_spec", "JOIN-ORDERED-LINK-FOCAL-SUPPORTING-PROBLEM-SPEC", 1, 0, false);
            declareFunction("join_ordered_link_non_focal_supporting_problem_spec", "JOIN-ORDERED-LINK-NON-FOCAL-SUPPORTING-PROBLEM-SPEC", 1, 0, false);
            declareFunction("join_ordered_tactic_p", "JOIN-ORDERED-TACTIC-P", 1, 0, false);
            declareFunction("single_focal_literal_join_ordered_tactic_p", "SINGLE-FOCAL-LITERAL-JOIN-ORDERED-TACTIC-P", 1, 0, false);
            declareFunction("new_join_ordered_tactic", "NEW-JOIN-ORDERED-TACTIC", 2, 0, false);
            declareFunction("join_ordered_tactic_link", "JOIN-ORDERED-TACTIC-LINK", 1, 0, false);
            declareFunction("join_ordered_tactic_focal_supporting_problem_spec", "JOIN-ORDERED-TACTIC-FOCAL-SUPPORTING-PROBLEM-SPEC", 1, 0, false);
            declareFunction("join_ordered_tactic_subsumesP", "JOIN-ORDERED-TACTIC-SUBSUMES?", 2, 0, false);
            declareFunction("find_or_create_join_ordered_tactic_focal_mapped_problem", "FIND-OR-CREATE-JOIN-ORDERED-TACTIC-FOCAL-MAPPED-PROBLEM", 1, 0, false);
            declareFunction("find_or_create_join_ordered_tactic_non_focal_mapped_problem", "FIND-OR-CREATE-JOIN-ORDERED-TACTIC-NON-FOCAL-MAPPED-PROBLEM", 1, 0, false);
            declareFunction("join_ordered_tactic_focal_problem", "JOIN-ORDERED-TACTIC-FOCAL-PROBLEM", 1, 0, false);
            declareFunction("determine_new_join_ordered_tactics", "DETERMINE-NEW-JOIN-ORDERED-TACTICS", 2, 0, false);
            declareFunction("problem_has_a_candidate_early_removal_tacticP", "PROBLEM-HAS-A-CANDIDATE-EARLY-REMOVAL-TACTIC?", 1, 0, false);
            declareFunction("determine_new_single_literal_join_ordered_tactics", "DETERMINE-NEW-SINGLE-LITERAL-JOIN-ORDERED-TACTICS", 2, 0, false);
            declareFunction("potentially_simplifying_asentP", "POTENTIALLY-SIMPLIFYING-ASENT?", 1, 0, false);
            declareFunction("determine_new_single_literal_join_ordered_tactic", "DETERMINE-NEW-SINGLE-LITERAL-JOIN-ORDERED-TACTIC", 4, 0, false);
            declareFunction("motivated_followup_multi_literal_subclause_specs_case_1", "MOTIVATED-FOLLOWUP-MULTI-LITERAL-SUBCLAUSE-SPECS-CASE-1", 2, 0, false);
            declareFunction("problem_store_followup_query_problem_p", "PROBLEM-STORE-FOLLOWUP-QUERY-PROBLEM-P", 1, 0, false);
            declareFunction("motivated_followup_multi_literal_subclause_specs_case_2", "MOTIVATED-FOLLOWUP-MULTI-LITERAL-SUBCLAUSE-SPECS-CASE-2", 2, 0, false);
            declareFunction("matching_subclause_specs", "MATCHING-SUBCLAUSE-SPECS", 2, 0, false);
            declareFunction("matching_subclause_index_dictionary", "MATCHING-SUBCLAUSE-INDEX-DICTIONARY", 2, 0, false);
            declareFunction("matching_subclause_index_dictionary_to_indices_list", "MATCHING-SUBCLAUSE-INDEX-DICTIONARY-TO-INDICES-LIST", 1, 0, false);
            declareFunction("sub_matching_subclause_specs", "SUB-MATCHING-SUBCLAUSE-SPECS", 2, 0, false);
            declareFunction("determine_new_join_ordered_tactic", "DETERMINE-NEW-JOIN-ORDERED-TACTIC", 3, 0, false);
            declareFunction("find_or_create_join_ordered_focal_mapped_problem", "FIND-OR-CREATE-JOIN-ORDERED-FOCAL-MAPPED-PROBLEM", 4, 0, false);
            declareFunction("find_or_create_join_ordered_non_focal_mapped_problem", "FIND-OR-CREATE-JOIN-ORDERED-NON-FOCAL-MAPPED-PROBLEM", 4, 0, false);
            declareFunction("lazily_create_join_ordered_link_non_focal_mapped_problem", "LAZILY-CREATE-JOIN-ORDERED-LINK-NON-FOCAL-MAPPED-PROBLEM", 1, 0, false);
            declareFunction("compute_join_ordered_problem_subclause_free_vars", "COMPUTE-JOIN-ORDERED-PROBLEM-SUBCLAUSE-FREE-VARS", 4, 0, false);
            declareFunction("compute_strategic_properties_of_join_ordered_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-JOIN-ORDERED-TACTIC", 2, 0, false);
            declareFunction("compute_join_ordered_tactic_productivity", "COMPUTE-JOIN-ORDERED-TACTIC-PRODUCTIVITY", 2, 0, false);
            declareFunction("compute_join_ordered_tactic_preference_level", "COMPUTE-JOIN-ORDERED-TACTIC-PREFERENCE-LEVEL", 2, 0, false);
            declareFunction("execute_join_ordered_tactic", "EXECUTE-JOIN-ORDERED-TACTIC", 1, 0, false);
            declareFunction("consider_strategic_ramifications_of_tactic_preference_level", "CONSIDER-STRATEGIC-RAMIFICATIONS-OF-TACTIC-PREFERENCE-LEVEL", 1, 0, false);
            declareFunction("join_ordered_tactic_lookahead_problem", "JOIN-ORDERED-TACTIC-LOOKAHEAD-PROBLEM", 1, 0, false);
            declareFunction("new_join_ordered_proof", "NEW-JOIN-ORDERED-PROOF", 2, 0, false);
            declareFunction("join_ordered_proof_p", "JOIN-ORDERED-PROOF-P", 1, 0, false);
            declareFunction("connected_conjunction_proof_p", "CONNECTED-CONJUNCTION-PROOF-P", 1, 0, false);
            declareFunction("new_conjunctive_proof", "NEW-CONJUNCTIVE-PROOF", 2, 0, false);
            declareFunction("compute_sibling_proof_bindings", "COMPUTE-SIBLING-PROOF-BINDINGS", 3, 0, false);
            declareFunction("focal_to_non_focal_variable_map", "FOCAL-TO-NON-FOCAL-VARIABLE-MAP", 1, 0, false);
            declareFunction("memoized_focal_to_non_focal_variable_map_int_internal", "MEMOIZED-FOCAL-TO-NON-FOCAL-VARIABLE-MAP-INT-INTERNAL", 1, 0, false);
            declareFunction("memoized_focal_to_non_focal_variable_map_int", "MEMOIZED-FOCAL-TO-NON-FOCAL-VARIABLE-MAP-INT", 1, 0, false);
            declareFunction("focal_to_non_focal_variable_map_int", "FOCAL-TO-NON-FOCAL-VARIABLE-MAP-INT", 1, 0, false);
            declareFunction("non_focal_to_focal_variable_map", "NON-FOCAL-TO-FOCAL-VARIABLE-MAP", 1, 0, false);
            declareFunction("memoized_non_focal_to_focal_variable_map_int_internal", "MEMOIZED-NON-FOCAL-TO-FOCAL-VARIABLE-MAP-INT-INTERNAL", 1, 0, false);
            declareFunction("memoized_non_focal_to_focal_variable_map_int", "MEMOIZED-NON-FOCAL-TO-FOCAL-VARIABLE-MAP-INT", 1, 0, false);
            declareFunction("non_focal_to_focal_variable_map_int", "NON-FOCAL-TO-FOCAL-VARIABLE-MAP-INT", 1, 0, false);
            declareFunction("trigger_to_sibling_variable_map", "TRIGGER-TO-SIBLING-VARIABLE-MAP", 2, 0, false);
            declareFunction("focal_bindings_to_non_focal_bindings", "FOCAL-BINDINGS-TO-NON-FOCAL-BINDINGS", 2, 0, false);
            declareFunction("non_focal_bindings_to_focal_bindings", "NON-FOCAL-BINDINGS-TO-FOCAL-BINDINGS", 2, 0, false);
            declareFunction("bubble_up_proof_to_join_ordered_link", "BUBBLE-UP-PROOF-TO-JOIN-ORDERED-LINK", 3, 0, false);
            declareFunction("trigger_split_restriction", "TRIGGER-SPLIT-RESTRICTION", 2, 0, false);
            declareFunction("find_split_restriction", "FIND-SPLIT-RESTRICTION", 2, 0, false);
            declareFunction("find_or_create_split_restriction_int", "FIND-OR-CREATE-SPLIT-RESTRICTION-INT", 3, 0, false);
            declareFunction("note_all_triggering_proofs_processed", "NOTE-ALL-TRIGGERING-PROOFS-PROCESSED", 1, 0, false);
            declareFunction("note_restricted_non_focal_finished", "NOTE-RESTRICTED-NON-FOCAL-FINISHED", 2, 0, false);
            declareFunction("find_or_create_restricted_non_focal_problem", "FIND-OR-CREATE-RESTRICTED-NON-FOCAL-PROBLEM", 2, 0, false);
            declareFunction("find_restricted_non_focal_problem", "FIND-RESTRICTED-NON-FOCAL-PROBLEM", 2, 0, false);
            declareFunction("find_or_create_restricted_non_focal_problem_int", "FIND-OR-CREATE-RESTRICTED-NON-FOCAL-PROBLEM-INT", 3, 0, false);
            declareFunction("find_restricted_problem_and_link", "FIND-RESTRICTED-PROBLEM-AND-LINK", 2, 0, false);
            declareFunction("find_or_create_restricted_problem_and_link_int", "FIND-OR-CREATE-RESTRICTED-PROBLEM-AND-LINK-INT", 3, 0, false);
            declareFunction("find_or_create_restricted_problem", "FIND-OR-CREATE-RESTRICTED-PROBLEM", 2, 0, false);
            declareFunction("find_or_create_restricted_problem_int", "FIND-OR-CREATE-RESTRICTED-PROBLEM-INT", 3, 0, false);
            declareFunction("focal_problem_is_a_single_literal_backchain_requiredP", "FOCAL-PROBLEM-IS-A-SINGLE-LITERAL-BACKCHAIN-REQUIRED?", 1, 0, false);
            declareFunction("corresponding_focal_problem", "CORRESPONDING-FOCAL-PROBLEM", 2, 0, false);
            declareFunction("corresponding_non_focal_problem", "CORRESPONDING-NON-FOCAL-PROBLEM", 2, 0, false);
            declareFunction("corresponding_restricted_focal_problem", "CORRESPONDING-RESTRICTED-FOCAL-PROBLEM", 2, 0, false);
            declareFunction("non_focal_restriction_link_with_corresponding_focal_proofP", "NON-FOCAL-RESTRICTION-LINK-WITH-CORRESPONDING-FOCAL-PROOF?", 2, 0, false);
            declareFunction("corresponding_restricted_non_focal_problem", "CORRESPONDING-RESTRICTED-NON-FOCAL-PROBLEM", 2, 0, false);
            declareFunction("find_restricted_focal_problem_by_bindings", "FIND-RESTRICTED-FOCAL-PROBLEM-BY-BINDINGS", 2, 0, false);
            declareFunction("mapped_proof_is_focalP", "MAPPED-PROOF-IS-FOCAL?", 3, 0, false);
            declareFunction("trigger_vars_shared_by_sibling", "TRIGGER-VARS-SHARED-BY-SIBLING", 2, 0, false);
            declareFunction("memoized_trigger_vars_shared_by_sibling_int_internal", "MEMOIZED-TRIGGER-VARS-SHARED-BY-SIBLING-INT-INTERNAL", 2, 0, false);
            declareFunction("memoized_trigger_vars_shared_by_sibling_int", "MEMOIZED-TRIGGER-VARS-SHARED-BY-SIBLING-INT", 2, 0, false);
            declareFunction("trigger_vars_shared_by_sibling_int", "TRIGGER-VARS-SHARED-BY-SIBLING-INT", 2, 0, false);
            declareFunction("non_focal_vars_shared_by_focal", "NON-FOCAL-VARS-SHARED-BY-FOCAL", 1, 0, false);
            declareFunction("focal_vars_shared_by_non_focal", "FOCAL-VARS-SHARED-BY-NON-FOCAL", 1, 0, false);
            declareFunction("canonicalize_hl_variable_list", "CANONICALIZE-HL-VARIABLE-LIST", 1, 0, false);
            declareFunction("join_ordered_link_join_vars", "JOIN-ORDERED-LINK-JOIN-VARS", 1, 0, false);
            declareFunction("join_ordered_link_focal_to_supported_variable_map", "JOIN-ORDERED-LINK-FOCAL-TO-SUPPORTED-VARIABLE-MAP", 1, 0, false);
            declareFunction("join_ordered_link_non_focal_to_supported_variable_map", "JOIN-ORDERED-LINK-NON-FOCAL-TO-SUPPORTED-VARIABLE-MAP", 1, 0, false);
            declareFunction("add_join_ordered_link_proof", "ADD-JOIN-ORDERED-LINK-PROOF", 3, 0, false);
            declareFunction("join_ordered_link_shared_proof_bindings", "JOIN-ORDERED-LINK-SHARED-PROOF-BINDINGS", 3, 0, false);
            declareFunction("remove_join_ordered_link_proof", "REMOVE-JOIN-ORDERED-LINK-PROOF", 4, 0, false);
            declareFunction("remove_join_ordered_link_proof_both_ways", "REMOVE-JOIN-ORDERED-LINK-PROOF-BOTH-WAYS", 3, 0, false);
            declareFunction("join_ordered_link_shared_proof_bindings_int", "JOIN-ORDERED-LINK-SHARED-PROOF-BINDINGS-INT", 3, 0, false);
            declareFunction("join_ordered_link_sibling_proofs_lookup", "JOIN-ORDERED-LINK-SIBLING-PROOFS-LOOKUP", 3, 0, false);
            declareFunction("bubble_up_proof_to_join_ordered_link_int", "BUBBLE-UP-PROOF-TO-JOIN-ORDERED-LINK-INT", 4, 0, false);
            declareFunction("join_ordered_link_sibling_mapped_problem", "JOIN-ORDERED-LINK-SIBLING-MAPPED-PROBLEM", 2, 0, false);
            declareFunction("join_ordered_link_could_be_finishedP", "JOIN-ORDERED-LINK-COULD-BE-FINISHED?", 2, 0, false);
            declareFunction("join_ordered_link_no_goodP", "JOIN-ORDERED-LINK-NO-GOOD?", 3, 0, false);
            declareFunction("join_ordered_link_no_good_case_1P", "JOIN-ORDERED-LINK-NO-GOOD-CASE-1?", 3, 0, false);
            declareFunction("join_ordered_link_no_good_case_2P", "JOIN-ORDERED-LINK-NO-GOOD-CASE-2?", 3, 0, false);
            declareFunction("join_ordered_link_with_non_focal_unbound_predicateP", "JOIN-ORDERED-LINK-WITH-NON-FOCAL-UNBOUND-PREDICATE?", 1, 0, false);
            declareFunction("join_ordered_link_with_non_focal_isa_unbound_unbound_where_arg2_is_restrictedP", "JOIN-ORDERED-LINK-WITH-NON-FOCAL-ISA-UNBOUND-UNBOUND-WHERE-ARG2-IS-RESTRICTED?", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("problem_has_a_complete_conjunctive_removal_tacticP", "PROBLEM-HAS-A-COMPLETE-CONJUNCTIVE-REMOVAL-TACTIC?", 1, 0, false);
            declareFunction("find_or_create_join_ordered_focal_mapped_problem", "FIND-OR-CREATE-JOIN-ORDERED-FOCAL-MAPPED-PROBLEM", 3, 0, false);
            declareFunction("find_or_create_join_ordered_non_focal_mapped_problem", "FIND-OR-CREATE-JOIN-ORDERED-NON-FOCAL-MAPPED-PROBLEM", 3, 0, false);
            declareFunction("focal_to_non_focal_variable_map_internal", "FOCAL-TO-NON-FOCAL-VARIABLE-MAP-INTERNAL", 1, 0, false);
            declareFunction("non_focal_to_focal_variable_map_internal", "NON-FOCAL-TO-FOCAL-VARIABLE-MAP-INTERNAL", 1, 0, false);
            declareFunction("trigger_vars_shared_by_sibling_internal", "TRIGGER-VARS-SHARED-BY-SIBLING-INTERNAL", 2, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_inference_worker_join_ordered_file_Previous() {
        declareFunction("join_ordered_link_data_print_function_trampoline", "JOIN-ORDERED-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("join_ordered_link_data_p", "JOIN-ORDERED-LINK-DATA-P", 1, 0, false);
        new inference_worker_join_ordered.$join_ordered_link_data_p$UnaryFunction();
        declareFunction("jo_link_data_focal_proof_index", "JO-LINK-DATA-FOCAL-PROOF-INDEX", 1, 0, false);
        declareFunction("jo_link_data_non_focal_proof_index", "JO-LINK-DATA-NON-FOCAL-PROOF-INDEX", 1, 0, false);
        declareFunction("jo_link_data_restricted_non_focal_link_index", "JO-LINK-DATA-RESTRICTED-NON-FOCAL-LINK-INDEX", 1, 0, false);
        declareFunction("_csetf_jo_link_data_focal_proof_index", "_CSETF-JO-LINK-DATA-FOCAL-PROOF-INDEX", 2, 0, false);
        declareFunction("_csetf_jo_link_data_non_focal_proof_index", "_CSETF-JO-LINK-DATA-NON-FOCAL-PROOF-INDEX", 2, 0, false);
        declareFunction("_csetf_jo_link_data_restricted_non_focal_link_index", "_CSETF-JO-LINK-DATA-RESTRICTED-NON-FOCAL-LINK-INDEX", 2, 0, false);
        declareFunction("make_join_ordered_link_data", "MAKE-JOIN-ORDERED-LINK-DATA", 0, 1, false);
        declareFunction("visit_defstruct_join_ordered_link_data", "VISIT-DEFSTRUCT-JOIN-ORDERED-LINK-DATA", 2, 0, false);
        declareFunction("visit_defstruct_object_join_ordered_link_data_method", "VISIT-DEFSTRUCT-OBJECT-JOIN-ORDERED-LINK-DATA-METHOD", 2, 0, false);
        declareFunction("valid_join_ordered_link_data_p", "VALID-JOIN-ORDERED-LINK-DATA-P", 1, 0, false);
        declareFunction("new_join_ordered_link_data", "NEW-JOIN-ORDERED-LINK-DATA", 0, 0, false);
        declareFunction("join_ordered_link_p", "JOIN-ORDERED-LINK-P", 1, 0, false);
        declareFunction("maybe_new_join_ordered_link", "MAYBE-NEW-JOIN-ORDERED-LINK", 3, 0, false);
        declareFunction("new_join_ordered_link", "NEW-JOIN-ORDERED-LINK", 3, 0, false);
        declareFunction("destroy_join_ordered_link", "DESTROY-JOIN-ORDERED-LINK", 1, 0, false);
        declareMacro("do_join_ordered_link_focal_proofs", "DO-JOIN-ORDERED-LINK-FOCAL-PROOFS");
        declareMacro("do_join_ordered_link_non_focal_proofs", "DO-JOIN-ORDERED-LINK-NON-FOCAL-PROOFS");
        declareMacro("do_join_ordered_link_restricted_non_focal_problems", "DO-JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-PROBLEMS");
        declareMacro("do_virtual_dependent_join_ordered_links", "DO-VIRTUAL-DEPENDENT-JOIN-ORDERED-LINKS");
        declareFunction("join_ordered_link_focal_proof_index", "JOIN-ORDERED-LINK-FOCAL-PROOF-INDEX", 1, 0, false);
        declareFunction("join_ordered_link_non_focal_proof_index", "JOIN-ORDERED-LINK-NON-FOCAL-PROOF-INDEX", 1, 0, false);
        declareFunction("join_ordered_link_restricted_non_focal_link_index", "JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-LINK-INDEX", 1, 0, false);
        declareFunction("join_ordered_link_triggered_restriction_link", "JOIN-ORDERED-LINK-TRIGGERED-RESTRICTION-LINK", 2, 0, false);
        declareFunction("join_ordered_link_triggered_restricted_non_focal", "JOIN-ORDERED-LINK-TRIGGERED-RESTRICTED-NON-FOCAL", 2, 0, false);
        declareFunction("join_ordered_link_restricted_non_focal_links", "JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-LINKS", 1, 0, false);
        declareFunction("join_ordered_link_restricted_non_focal_triggering_proof", "JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-TRIGGERING-PROOF", 2, 0, false);
        declareFunction("join_ordered_link_focal_mapped_problem", "JOIN-ORDERED-LINK-FOCAL-MAPPED-PROBLEM", 1, 0, false);
        declareFunction("join_ordered_link_has_non_focal_mapped_problemP", "JOIN-ORDERED-LINK-HAS-NON-FOCAL-MAPPED-PROBLEM?", 1, 0, false);
        declareFunction("join_ordered_link_non_focal_mapped_problem", "JOIN-ORDERED-LINK-NON-FOCAL-MAPPED-PROBLEM", 1, 0, false);
        declareFunction("join_ordered_link_non_focal_manifestedP", "JOIN-ORDERED-LINK-NON-FOCAL-MANIFESTED?", 1, 0, false);
        declareFunction("join_ordered_link_focal_problem", "JOIN-ORDERED-LINK-FOCAL-PROBLEM", 1, 0, false);
        declareFunction("join_ordered_link_non_focal_problem", "JOIN-ORDERED-LINK-NON-FOCAL-PROBLEM", 1, 0, false);
        declareFunction("join_ordered_link_other_mapped_problem", "JOIN-ORDERED-LINK-OTHER-MAPPED-PROBLEM", 2, 0, false);
        declareFunction("join_ordered_link_focal_proofs_lookup", "JOIN-ORDERED-LINK-FOCAL-PROOFS-LOOKUP", 2, 0, false);
        declareFunction("join_ordered_link_non_focal_proofs_lookup", "JOIN-ORDERED-LINK-NON-FOCAL-PROOFS-LOOKUP", 2, 0, false);
        declareFunction("join_ordered_link_tactic", "JOIN-ORDERED-LINK-TACTIC", 1, 0, false);
        declareFunction("join_ordered_link_restricted_non_focal_linkP", "JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-LINK?", 2, 0, false);
        declareFunction("join_ordered_link_restricted_non_focal_count", "JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-COUNT", 1, 0, false);
        declareFunction("add_join_ordered_link_focal_proof", "ADD-JOIN-ORDERED-LINK-FOCAL-PROOF", 3, 0, false);
        declareFunction("remove_join_ordered_link_focal_proof", "REMOVE-JOIN-ORDERED-LINK-FOCAL-PROOF", 3, 0, false);
        declareFunction("add_join_ordered_link_non_focal_proof", "ADD-JOIN-ORDERED-LINK-NON-FOCAL-PROOF", 3, 0, false);
        declareFunction("remove_join_ordered_link_non_focal_proof", "REMOVE-JOIN-ORDERED-LINK-NON-FOCAL-PROOF", 3, 0, false);
        declareFunction("add_join_ordered_link_restricted_non_focal_link", "ADD-JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-LINK", 3, 0, false);
        declareFunction("remove_join_ordered_link_restricted_non_focal_link", "REMOVE-JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-LINK", 2, 0, false);
        declareFunction("join_ordered_link_focal_supporting_problem_spec", "JOIN-ORDERED-LINK-FOCAL-SUPPORTING-PROBLEM-SPEC", 1, 0, false);
        declareFunction("join_ordered_link_non_focal_supporting_problem_spec", "JOIN-ORDERED-LINK-NON-FOCAL-SUPPORTING-PROBLEM-SPEC", 1, 0, false);
        declareFunction("join_ordered_tactic_p", "JOIN-ORDERED-TACTIC-P", 1, 0, false);
        declareFunction("single_focal_literal_join_ordered_tactic_p", "SINGLE-FOCAL-LITERAL-JOIN-ORDERED-TACTIC-P", 1, 0, false);
        declareFunction("new_join_ordered_tactic", "NEW-JOIN-ORDERED-TACTIC", 2, 0, false);
        declareFunction("join_ordered_tactic_link", "JOIN-ORDERED-TACTIC-LINK", 1, 0, false);
        declareFunction("join_ordered_tactic_focal_supporting_problem_spec", "JOIN-ORDERED-TACTIC-FOCAL-SUPPORTING-PROBLEM-SPEC", 1, 0, false);
        declareFunction("join_ordered_tactic_subsumesP", "JOIN-ORDERED-TACTIC-SUBSUMES?", 2, 0, false);
        declareFunction("find_or_create_join_ordered_tactic_focal_mapped_problem", "FIND-OR-CREATE-JOIN-ORDERED-TACTIC-FOCAL-MAPPED-PROBLEM", 1, 0, false);
        declareFunction("find_or_create_join_ordered_tactic_non_focal_mapped_problem", "FIND-OR-CREATE-JOIN-ORDERED-TACTIC-NON-FOCAL-MAPPED-PROBLEM", 1, 0, false);
        declareFunction("join_ordered_tactic_focal_problem", "JOIN-ORDERED-TACTIC-FOCAL-PROBLEM", 1, 0, false);
        declareFunction("determine_new_join_ordered_tactics", "DETERMINE-NEW-JOIN-ORDERED-TACTICS", 2, 0, false);
        declareFunction("problem_has_a_candidate_early_removal_tacticP", "PROBLEM-HAS-A-CANDIDATE-EARLY-REMOVAL-TACTIC?", 1, 0, false);
        declareFunction("determine_new_single_literal_join_ordered_tactics", "DETERMINE-NEW-SINGLE-LITERAL-JOIN-ORDERED-TACTICS", 2, 0, false);
        declareFunction("potentially_simplifying_asentP", "POTENTIALLY-SIMPLIFYING-ASENT?", 1, 0, false);
        declareFunction("determine_new_single_literal_join_ordered_tactic", "DETERMINE-NEW-SINGLE-LITERAL-JOIN-ORDERED-TACTIC", 4, 0, false);
        declareFunction("motivated_followup_multi_literal_subclause_specs_case_1", "MOTIVATED-FOLLOWUP-MULTI-LITERAL-SUBCLAUSE-SPECS-CASE-1", 2, 0, false);
        declareFunction("problem_store_followup_query_problem_p", "PROBLEM-STORE-FOLLOWUP-QUERY-PROBLEM-P", 1, 0, false);
        declareFunction("motivated_followup_multi_literal_subclause_specs_case_2", "MOTIVATED-FOLLOWUP-MULTI-LITERAL-SUBCLAUSE-SPECS-CASE-2", 2, 0, false);
        declareFunction("matching_subclause_specs", "MATCHING-SUBCLAUSE-SPECS", 2, 0, false);
        declareFunction("matching_subclause_index_dictionary", "MATCHING-SUBCLAUSE-INDEX-DICTIONARY", 2, 0, false);
        declareFunction("matching_subclause_index_dictionary_to_indices_list", "MATCHING-SUBCLAUSE-INDEX-DICTIONARY-TO-INDICES-LIST", 1, 0, false);
        declareFunction("sub_matching_subclause_specs", "SUB-MATCHING-SUBCLAUSE-SPECS", 2, 0, false);
        declareFunction("determine_new_join_ordered_tactic", "DETERMINE-NEW-JOIN-ORDERED-TACTIC", 3, 0, false);
        declareFunction("find_or_create_join_ordered_focal_mapped_problem", "FIND-OR-CREATE-JOIN-ORDERED-FOCAL-MAPPED-PROBLEM", 4, 0, false);
        declareFunction("find_or_create_join_ordered_non_focal_mapped_problem", "FIND-OR-CREATE-JOIN-ORDERED-NON-FOCAL-MAPPED-PROBLEM", 4, 0, false);
        declareFunction("lazily_create_join_ordered_link_non_focal_mapped_problem", "LAZILY-CREATE-JOIN-ORDERED-LINK-NON-FOCAL-MAPPED-PROBLEM", 1, 0, false);
        declareFunction("compute_join_ordered_problem_subclause_free_vars", "COMPUTE-JOIN-ORDERED-PROBLEM-SUBCLAUSE-FREE-VARS", 4, 0, false);
        declareFunction("compute_strategic_properties_of_join_ordered_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-JOIN-ORDERED-TACTIC", 2, 0, false);
        declareFunction("compute_join_ordered_tactic_productivity", "COMPUTE-JOIN-ORDERED-TACTIC-PRODUCTIVITY", 2, 0, false);
        declareFunction("compute_join_ordered_tactic_preference_level", "COMPUTE-JOIN-ORDERED-TACTIC-PREFERENCE-LEVEL", 2, 0, false);
        declareFunction("execute_join_ordered_tactic", "EXECUTE-JOIN-ORDERED-TACTIC", 1, 0, false);
        declareFunction("consider_strategic_ramifications_of_tactic_preference_level", "CONSIDER-STRATEGIC-RAMIFICATIONS-OF-TACTIC-PREFERENCE-LEVEL", 1, 0, false);
        declareFunction("join_ordered_tactic_lookahead_problem", "JOIN-ORDERED-TACTIC-LOOKAHEAD-PROBLEM", 1, 0, false);
        declareFunction("new_join_ordered_proof", "NEW-JOIN-ORDERED-PROOF", 2, 0, false);
        declareFunction("join_ordered_proof_p", "JOIN-ORDERED-PROOF-P", 1, 0, false);
        declareFunction("connected_conjunction_proof_p", "CONNECTED-CONJUNCTION-PROOF-P", 1, 0, false);
        declareFunction("new_conjunctive_proof", "NEW-CONJUNCTIVE-PROOF", 2, 0, false);
        declareFunction("compute_sibling_proof_bindings", "COMPUTE-SIBLING-PROOF-BINDINGS", 3, 0, false);
        declareFunction("focal_to_non_focal_variable_map", "FOCAL-TO-NON-FOCAL-VARIABLE-MAP", 1, 0, false);
        declareFunction("memoized_focal_to_non_focal_variable_map_int_internal", "MEMOIZED-FOCAL-TO-NON-FOCAL-VARIABLE-MAP-INT-INTERNAL", 1, 0, false);
        declareFunction("memoized_focal_to_non_focal_variable_map_int", "MEMOIZED-FOCAL-TO-NON-FOCAL-VARIABLE-MAP-INT", 1, 0, false);
        declareFunction("focal_to_non_focal_variable_map_int", "FOCAL-TO-NON-FOCAL-VARIABLE-MAP-INT", 1, 0, false);
        declareFunction("non_focal_to_focal_variable_map", "NON-FOCAL-TO-FOCAL-VARIABLE-MAP", 1, 0, false);
        declareFunction("memoized_non_focal_to_focal_variable_map_int_internal", "MEMOIZED-NON-FOCAL-TO-FOCAL-VARIABLE-MAP-INT-INTERNAL", 1, 0, false);
        declareFunction("memoized_non_focal_to_focal_variable_map_int", "MEMOIZED-NON-FOCAL-TO-FOCAL-VARIABLE-MAP-INT", 1, 0, false);
        declareFunction("non_focal_to_focal_variable_map_int", "NON-FOCAL-TO-FOCAL-VARIABLE-MAP-INT", 1, 0, false);
        declareFunction("trigger_to_sibling_variable_map", "TRIGGER-TO-SIBLING-VARIABLE-MAP", 2, 0, false);
        declareFunction("focal_bindings_to_non_focal_bindings", "FOCAL-BINDINGS-TO-NON-FOCAL-BINDINGS", 2, 0, false);
        declareFunction("non_focal_bindings_to_focal_bindings", "NON-FOCAL-BINDINGS-TO-FOCAL-BINDINGS", 2, 0, false);
        declareFunction("bubble_up_proof_to_join_ordered_link", "BUBBLE-UP-PROOF-TO-JOIN-ORDERED-LINK", 3, 0, false);
        declareFunction("trigger_split_restriction", "TRIGGER-SPLIT-RESTRICTION", 2, 0, false);
        declareFunction("find_split_restriction", "FIND-SPLIT-RESTRICTION", 2, 0, false);
        declareFunction("find_or_create_split_restriction_int", "FIND-OR-CREATE-SPLIT-RESTRICTION-INT", 3, 0, false);
        declareFunction("note_all_triggering_proofs_processed", "NOTE-ALL-TRIGGERING-PROOFS-PROCESSED", 1, 0, false);
        declareFunction("note_restricted_non_focal_finished", "NOTE-RESTRICTED-NON-FOCAL-FINISHED", 2, 0, false);
        declareFunction("find_or_create_restricted_non_focal_problem", "FIND-OR-CREATE-RESTRICTED-NON-FOCAL-PROBLEM", 2, 0, false);
        declareFunction("find_restricted_non_focal_problem", "FIND-RESTRICTED-NON-FOCAL-PROBLEM", 2, 0, false);
        declareFunction("find_or_create_restricted_non_focal_problem_int", "FIND-OR-CREATE-RESTRICTED-NON-FOCAL-PROBLEM-INT", 3, 0, false);
        declareFunction("find_restricted_problem_and_link", "FIND-RESTRICTED-PROBLEM-AND-LINK", 2, 0, false);
        declareFunction("find_or_create_restricted_problem_and_link_int", "FIND-OR-CREATE-RESTRICTED-PROBLEM-AND-LINK-INT", 3, 0, false);
        declareFunction("find_or_create_restricted_problem", "FIND-OR-CREATE-RESTRICTED-PROBLEM", 2, 0, false);
        declareFunction("find_or_create_restricted_problem_int", "FIND-OR-CREATE-RESTRICTED-PROBLEM-INT", 3, 0, false);
        declareFunction("focal_problem_is_a_single_literal_backchain_requiredP", "FOCAL-PROBLEM-IS-A-SINGLE-LITERAL-BACKCHAIN-REQUIRED?", 1, 0, false);
        declareFunction("corresponding_focal_problem", "CORRESPONDING-FOCAL-PROBLEM", 2, 0, false);
        declareFunction("corresponding_non_focal_problem", "CORRESPONDING-NON-FOCAL-PROBLEM", 2, 0, false);
        declareFunction("corresponding_restricted_focal_problem", "CORRESPONDING-RESTRICTED-FOCAL-PROBLEM", 2, 0, false);
        declareFunction("non_focal_restriction_link_with_corresponding_focal_proofP", "NON-FOCAL-RESTRICTION-LINK-WITH-CORRESPONDING-FOCAL-PROOF?", 2, 0, false);
        declareFunction("corresponding_restricted_non_focal_problem", "CORRESPONDING-RESTRICTED-NON-FOCAL-PROBLEM", 2, 0, false);
        declareFunction("find_restricted_focal_problem_by_bindings", "FIND-RESTRICTED-FOCAL-PROBLEM-BY-BINDINGS", 2, 0, false);
        declareFunction("mapped_proof_is_focalP", "MAPPED-PROOF-IS-FOCAL?", 3, 0, false);
        declareFunction("trigger_vars_shared_by_sibling", "TRIGGER-VARS-SHARED-BY-SIBLING", 2, 0, false);
        declareFunction("memoized_trigger_vars_shared_by_sibling_int_internal", "MEMOIZED-TRIGGER-VARS-SHARED-BY-SIBLING-INT-INTERNAL", 2, 0, false);
        declareFunction("memoized_trigger_vars_shared_by_sibling_int", "MEMOIZED-TRIGGER-VARS-SHARED-BY-SIBLING-INT", 2, 0, false);
        declareFunction("trigger_vars_shared_by_sibling_int", "TRIGGER-VARS-SHARED-BY-SIBLING-INT", 2, 0, false);
        declareFunction("non_focal_vars_shared_by_focal", "NON-FOCAL-VARS-SHARED-BY-FOCAL", 1, 0, false);
        declareFunction("focal_vars_shared_by_non_focal", "FOCAL-VARS-SHARED-BY-NON-FOCAL", 1, 0, false);
        declareFunction("canonicalize_hl_variable_list", "CANONICALIZE-HL-VARIABLE-LIST", 1, 0, false);
        declareFunction("join_ordered_link_join_vars", "JOIN-ORDERED-LINK-JOIN-VARS", 1, 0, false);
        declareFunction("join_ordered_link_focal_to_supported_variable_map", "JOIN-ORDERED-LINK-FOCAL-TO-SUPPORTED-VARIABLE-MAP", 1, 0, false);
        declareFunction("join_ordered_link_non_focal_to_supported_variable_map", "JOIN-ORDERED-LINK-NON-FOCAL-TO-SUPPORTED-VARIABLE-MAP", 1, 0, false);
        declareFunction("add_join_ordered_link_proof", "ADD-JOIN-ORDERED-LINK-PROOF", 3, 0, false);
        declareFunction("join_ordered_link_shared_proof_bindings", "JOIN-ORDERED-LINK-SHARED-PROOF-BINDINGS", 3, 0, false);
        declareFunction("remove_join_ordered_link_proof", "REMOVE-JOIN-ORDERED-LINK-PROOF", 4, 0, false);
        declareFunction("remove_join_ordered_link_proof_both_ways", "REMOVE-JOIN-ORDERED-LINK-PROOF-BOTH-WAYS", 3, 0, false);
        declareFunction("join_ordered_link_shared_proof_bindings_int", "JOIN-ORDERED-LINK-SHARED-PROOF-BINDINGS-INT", 3, 0, false);
        declareFunction("join_ordered_link_sibling_proofs_lookup", "JOIN-ORDERED-LINK-SIBLING-PROOFS-LOOKUP", 3, 0, false);
        declareFunction("bubble_up_proof_to_join_ordered_link_int", "BUBBLE-UP-PROOF-TO-JOIN-ORDERED-LINK-INT", 4, 0, false);
        declareFunction("join_ordered_link_sibling_mapped_problem", "JOIN-ORDERED-LINK-SIBLING-MAPPED-PROBLEM", 2, 0, false);
        declareFunction("join_ordered_link_could_be_finishedP", "JOIN-ORDERED-LINK-COULD-BE-FINISHED?", 2, 0, false);
        declareFunction("join_ordered_link_no_goodP", "JOIN-ORDERED-LINK-NO-GOOD?", 3, 0, false);
        declareFunction("join_ordered_link_no_good_case_1P", "JOIN-ORDERED-LINK-NO-GOOD-CASE-1?", 3, 0, false);
        declareFunction("join_ordered_link_no_good_case_2P", "JOIN-ORDERED-LINK-NO-GOOD-CASE-2?", 3, 0, false);
        declareFunction("join_ordered_link_with_non_focal_unbound_predicateP", "JOIN-ORDERED-LINK-WITH-NON-FOCAL-UNBOUND-PREDICATE?", 1, 0, false);
        declareFunction("join_ordered_link_with_non_focal_isa_unbound_unbound_where_arg2_is_restrictedP", "JOIN-ORDERED-LINK-WITH-NON-FOCAL-ISA-UNBOUND-UNBOUND-WHERE-ARG2-IS-RESTRICTED?", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(makeSymbol("FOCAL-PROOF-INDEX"), makeSymbol("NON-FOCAL-PROOF-INDEX"), makeSymbol("RESTRICTED-NON-FOCAL-LINK-INDEX"));

    static private final SubLList $list_alt3 = list(makeKeyword("FOCAL-PROOF-INDEX"), makeKeyword("NON-FOCAL-PROOF-INDEX"), makeKeyword("RESTRICTED-NON-FOCAL-LINK-INDEX"));

    static private final SubLList $list_alt4 = list(makeSymbol("JO-LINK-DATA-FOCAL-PROOF-INDEX"), makeSymbol("JO-LINK-DATA-NON-FOCAL-PROOF-INDEX"), makeSymbol("JO-LINK-DATA-RESTRICTED-NON-FOCAL-LINK-INDEX"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-JO-LINK-DATA-FOCAL-PROOF-INDEX"), makeSymbol("_CSETF-JO-LINK-DATA-NON-FOCAL-PROOF-INDEX"), makeSymbol("_CSETF-JO-LINK-DATA-RESTRICTED-NON-FOCAL-LINK-INDEX"));

    static private final SubLString $str_alt17$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLList $list_alt21 = list(list(makeSymbol("BINDINGS-VAR"), makeSymbol("PROOF-VAR"), makeSymbol("JOIN-ORDERED-LINK")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym22$INDEX = makeUninternedSymbol("INDEX");

    static private final SubLSymbol $sym23$PROOF_LIST_VAR = makeUninternedSymbol("PROOF-LIST-VAR");

    static private final SubLList $list_alt31 = list(list(makeSymbol("RESTRICTED-NON-FOCAL-PROBLEM-VAR"), makeSymbol("JOIN-ORDERED-LINK"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt32 = list($DONE);

    static private final SubLSymbol $sym35$LINK_VAR = makeUninternedSymbol("LINK-VAR");

    static private final SubLSymbol $sym36$RESTRICTION_LINK = makeUninternedSymbol("RESTRICTION-LINK");

    static private final SubLSymbol $sym42$NON_FOCAL_RESTRICTION_LINK_WITH_CORRESPONDING_FOCAL_PROOF_ = makeSymbol("NON-FOCAL-RESTRICTION-LINK-WITH-CORRESPONDING-FOCAL-PROOF?");

    static private final SubLList $list_alt44 = list(list(makeSymbol("JOIN-ORDERED-LINK-VAR"), makeSymbol("RESTRICTED-NON-FOCAL-PROBLEM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym45$RESTRICTION_LINK = makeUninternedSymbol("RESTRICTION-LINK");

    static private final SubLSymbol $sym46$NON_FOCAL_PROBLEM = makeUninternedSymbol("NON-FOCAL-PROBLEM");

    static private final SubLSymbol $sym49$JOIN_ORDERED_LINK_RESTRICTED_NON_FOCAL_LINK_ = makeSymbol("JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-LINK?");

    static private final SubLString $str_alt52$Could_not_find_the_tactic_for__a = makeString("Could not find the tactic for ~a");

    static private final SubLSymbol $sym64$DUPLICATES_ = makeSymbol("DUPLICATES?");

    static private final SubLList $list_alt67 = cons(makeSymbol("SUBPROOF"), makeSymbol("SUB-PROOF-BINDINGS"));

    private static final SubLSymbol FOCAL_TO_NON_FOCAL_VARIABLE_MAP = makeSymbol("FOCAL-TO-NON-FOCAL-VARIABLE-MAP");

    public static final SubLSymbol $kw69$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    private static final SubLSymbol NON_FOCAL_TO_FOCAL_VARIABLE_MAP = makeSymbol("NON-FOCAL-TO-FOCAL-VARIABLE-MAP");

    static private final SubLString $str_alt71$Finding_or_creating_a_restricted_ = makeString("Finding or creating a restricted problem of ~a requires bindings");

    public static final SubLObject init_inference_worker_join_ordered_file_alt() {
        defconstant("*DTP-JOIN-ORDERED-LINK-DATA*", JOIN_ORDERED_LINK_DATA);
        defparameter("*JOIN-ORDERED-MODULE*", inference_modules.inference_structural_module($JOIN_ORDERED, UNPROVIDED));
        defparameter("*ONLY-ADD-MULTI-LITERAL-JO-TACTICS-WHEN-NO-POSSIBLE-COMPLETE-TACTIC?*", NIL);
        return NIL;
    }

    public static SubLObject init_inference_worker_join_ordered_file() {
        if (SubLFiles.USE_V1) {
            defconstant("*DTP-JOIN-ORDERED-LINK-DATA*", inference_worker_join_ordered.JOIN_ORDERED_LINK_DATA);
            defparameter("*JOIN-ORDERED-MODULE*", inference_modules.inference_structural_module($JOIN_ORDERED, UNPROVIDED));
            defparameter("*MAX-SUBCLAUSE-SPEC-CARTESIAN-PRODUCT-CARDINALITY*", inference_worker_join_ordered.$int$21200);
        }
        if (SubLFiles.USE_V2) {
            defparameter("*ONLY-ADD-MULTI-LITERAL-JO-TACTICS-WHEN-NO-POSSIBLE-COMPLETE-TACTIC?*", NIL);
        }
        return NIL;
    }

    public static SubLObject init_inference_worker_join_ordered_file_Previous() {
        defconstant("*DTP-JOIN-ORDERED-LINK-DATA*", inference_worker_join_ordered.JOIN_ORDERED_LINK_DATA);
        defparameter("*JOIN-ORDERED-MODULE*", inference_modules.inference_structural_module($JOIN_ORDERED, UNPROVIDED));
        defparameter("*MAX-SUBCLAUSE-SPEC-CARTESIAN-PRODUCT-CARDINALITY*", inference_worker_join_ordered.$int$21200);
        return NIL;
    }

    static private final SubLString $str_alt72$Creating_a_restricted_problem_of_ = makeString("Creating a restricted problem of ~a requires bindings");

    static private final SubLList $list_alt73 = list(makeSymbol("DO-JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-PROBLEMS"), makeSymbol("DO-VIRTUAL-DEPENDENT-JOIN-ORDERED-LINKS"));

    public static final SubLObject setup_inference_worker_join_ordered_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_join_ordered_link_data$.getGlobalValue(), symbol_function(JOIN_ORDERED_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(JO_LINK_DATA_FOCAL_PROOF_INDEX, _CSETF_JO_LINK_DATA_FOCAL_PROOF_INDEX);
        def_csetf(JO_LINK_DATA_NON_FOCAL_PROOF_INDEX, _CSETF_JO_LINK_DATA_NON_FOCAL_PROOF_INDEX);
        def_csetf(JO_LINK_DATA_RESTRICTED_NON_FOCAL_LINK_INDEX, _CSETF_JO_LINK_DATA_RESTRICTED_NON_FOCAL_LINK_INDEX);
        identity(JOIN_ORDERED_LINK_DATA);
        register_macro_helper(JOIN_ORDERED_LINK_FOCAL_PROOF_INDEX, DO_JOIN_ORDERED_LINK_FOCAL_PROOFS);
        register_macro_helper(JOIN_ORDERED_LINK_NON_FOCAL_PROOF_INDEX, DO_JOIN_ORDERED_LINK_NON_FOCAL_PROOFS);
        memoization_state.note_memoized_function(FOCAL_TO_NON_FOCAL_VARIABLE_MAP);
        memoization_state.note_memoized_function(NON_FOCAL_TO_FOCAL_VARIABLE_MAP);
        register_macro_helper($sym42$NON_FOCAL_RESTRICTION_LINK_WITH_CORRESPONDING_FOCAL_PROOF_, $list_alt73);
        memoization_state.note_memoized_function(TRIGGER_VARS_SHARED_BY_SIBLING);
        return NIL;
    }

    public static SubLObject setup_inference_worker_join_ordered_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), inference_worker_join_ordered.$dtp_join_ordered_link_data$.getGlobalValue(), symbol_function(inference_worker_join_ordered.JOIN_ORDERED_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(inference_worker_join_ordered.$list8);
            def_csetf(inference_worker_join_ordered.JO_LINK_DATA_FOCAL_PROOF_INDEX, inference_worker_join_ordered._CSETF_JO_LINK_DATA_FOCAL_PROOF_INDEX);
            def_csetf(inference_worker_join_ordered.JO_LINK_DATA_NON_FOCAL_PROOF_INDEX, inference_worker_join_ordered._CSETF_JO_LINK_DATA_NON_FOCAL_PROOF_INDEX);
            def_csetf(inference_worker_join_ordered.JO_LINK_DATA_RESTRICTED_NON_FOCAL_LINK_INDEX, inference_worker_join_ordered._CSETF_JO_LINK_DATA_RESTRICTED_NON_FOCAL_LINK_INDEX);
            identity(inference_worker_join_ordered.JOIN_ORDERED_LINK_DATA);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), inference_worker_join_ordered.$dtp_join_ordered_link_data$.getGlobalValue(), symbol_function(inference_worker_join_ordered.VISIT_DEFSTRUCT_OBJECT_JOIN_ORDERED_LINK_DATA_METHOD));
            register_macro_helper(inference_worker_join_ordered.JOIN_ORDERED_LINK_FOCAL_PROOF_INDEX, inference_worker_join_ordered.DO_JOIN_ORDERED_LINK_FOCAL_PROOFS);
            register_macro_helper(inference_worker_join_ordered.JOIN_ORDERED_LINK_NON_FOCAL_PROOF_INDEX, inference_worker_join_ordered.DO_JOIN_ORDERED_LINK_NON_FOCAL_PROOFS);
            note_memoized_function(inference_worker_join_ordered.MEMOIZED_FOCAL_TO_NON_FOCAL_VARIABLE_MAP_INT);
            note_memoized_function(inference_worker_join_ordered.MEMOIZED_NON_FOCAL_TO_FOCAL_VARIABLE_MAP_INT);
            register_macro_helper(inference_worker_join_ordered.$sym48$NON_FOCAL_RESTRICTION_LINK_WITH_CORRESPONDING_FOCAL_PROOF_, inference_worker_join_ordered.$list81);
            note_memoized_function(inference_worker_join_ordered.MEMOIZED_TRIGGER_VARS_SHARED_BY_SIBLING_INT);
        }
        if (SubLFiles.USE_V2) {
            memoization_state.note_memoized_function(FOCAL_TO_NON_FOCAL_VARIABLE_MAP);
            memoization_state.note_memoized_function(NON_FOCAL_TO_FOCAL_VARIABLE_MAP);
            register_macro_helper($sym42$NON_FOCAL_RESTRICTION_LINK_WITH_CORRESPONDING_FOCAL_PROOF_, $list_alt73);
            memoization_state.note_memoized_function(TRIGGER_VARS_SHARED_BY_SIBLING);
        }
        return NIL;
    }

    public static SubLObject setup_inference_worker_join_ordered_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), inference_worker_join_ordered.$dtp_join_ordered_link_data$.getGlobalValue(), symbol_function(inference_worker_join_ordered.JOIN_ORDERED_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(inference_worker_join_ordered.$list8);
        def_csetf(inference_worker_join_ordered.JO_LINK_DATA_FOCAL_PROOF_INDEX, inference_worker_join_ordered._CSETF_JO_LINK_DATA_FOCAL_PROOF_INDEX);
        def_csetf(inference_worker_join_ordered.JO_LINK_DATA_NON_FOCAL_PROOF_INDEX, inference_worker_join_ordered._CSETF_JO_LINK_DATA_NON_FOCAL_PROOF_INDEX);
        def_csetf(inference_worker_join_ordered.JO_LINK_DATA_RESTRICTED_NON_FOCAL_LINK_INDEX, inference_worker_join_ordered._CSETF_JO_LINK_DATA_RESTRICTED_NON_FOCAL_LINK_INDEX);
        identity(inference_worker_join_ordered.JOIN_ORDERED_LINK_DATA);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), inference_worker_join_ordered.$dtp_join_ordered_link_data$.getGlobalValue(), symbol_function(inference_worker_join_ordered.VISIT_DEFSTRUCT_OBJECT_JOIN_ORDERED_LINK_DATA_METHOD));
        register_macro_helper(inference_worker_join_ordered.JOIN_ORDERED_LINK_FOCAL_PROOF_INDEX, inference_worker_join_ordered.DO_JOIN_ORDERED_LINK_FOCAL_PROOFS);
        register_macro_helper(inference_worker_join_ordered.JOIN_ORDERED_LINK_NON_FOCAL_PROOF_INDEX, inference_worker_join_ordered.DO_JOIN_ORDERED_LINK_NON_FOCAL_PROOFS);
        note_memoized_function(inference_worker_join_ordered.MEMOIZED_FOCAL_TO_NON_FOCAL_VARIABLE_MAP_INT);
        note_memoized_function(inference_worker_join_ordered.MEMOIZED_NON_FOCAL_TO_FOCAL_VARIABLE_MAP_INT);
        register_macro_helper(inference_worker_join_ordered.$sym48$NON_FOCAL_RESTRICTION_LINK_WITH_CORRESPONDING_FOCAL_PROOF_, inference_worker_join_ordered.$list81);
        note_memoized_function(inference_worker_join_ordered.MEMOIZED_TRIGGER_VARS_SHARED_BY_SIBLING_INT);
        return NIL;
    }

    private static final SubLSymbol TRIGGER_VARS_SHARED_BY_SIBLING = makeSymbol("TRIGGER-VARS-SHARED-BY-SIBLING");

    static private final SubLString $str_alt77$_a_was_a_rejected_proof = makeString("~a was a rejected proof");

    static private final SubLSymbol $sym78$PROOF_PROVEN_ = makeSymbol("PROOF-PROVEN?");

    static private final SubLList $list_alt80 = list(makeSymbol("MT"), makeSymbol("ASENT"));

    @Override
    public void declareFunctions() {
        inference_worker_join_ordered.declare_inference_worker_join_ordered_file();
    }

    @Override
    public void initializeVariables() {
        inference_worker_join_ordered.init_inference_worker_join_ordered_file();
    }

    @Override
    public void runTopLevelForms() {
        inference_worker_join_ordered.setup_inference_worker_join_ordered_file();
    }

    

    public static final class $join_ordered_link_data_native extends SubLStructNative {
        public SubLObject $focal_proof_index;

        public SubLObject $non_focal_proof_index;

        public SubLObject $restricted_non_focal_link_index;

        private static final SubLStructDeclNative structDecl;

        public $join_ordered_link_data_native() {
            inference_worker_join_ordered.$join_ordered_link_data_native.this.$focal_proof_index = Lisp.NIL;
            inference_worker_join_ordered.$join_ordered_link_data_native.this.$non_focal_proof_index = Lisp.NIL;
            inference_worker_join_ordered.$join_ordered_link_data_native.this.$restricted_non_focal_link_index = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return inference_worker_join_ordered.$join_ordered_link_data_native.this.$focal_proof_index;
        }

        @Override
        public SubLObject getField3() {
            return inference_worker_join_ordered.$join_ordered_link_data_native.this.$non_focal_proof_index;
        }

        @Override
        public SubLObject getField4() {
            return inference_worker_join_ordered.$join_ordered_link_data_native.this.$restricted_non_focal_link_index;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return inference_worker_join_ordered.$join_ordered_link_data_native.this.$focal_proof_index = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return inference_worker_join_ordered.$join_ordered_link_data_native.this.$non_focal_proof_index = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return inference_worker_join_ordered.$join_ordered_link_data_native.this.$restricted_non_focal_link_index = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.$join_ordered_link_data_native.class, inference_worker_join_ordered.JOIN_ORDERED_LINK_DATA, inference_worker_join_ordered.JOIN_ORDERED_LINK_DATA_P, inference_worker_join_ordered.$list2, inference_worker_join_ordered.$list3, new String[]{ "$focal_proof_index", "$non_focal_proof_index", "$restricted_non_focal_link_index" }, inference_worker_join_ordered.$list4, inference_worker_join_ordered.$list5, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $join_ordered_link_data_p$UnaryFunction extends UnaryFunction {
        public $join_ordered_link_data_p$UnaryFunction() {
            super(extractFunctionNamed("JOIN-ORDERED-LINK-DATA-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return inference_worker_join_ordered.join_ordered_link_data_p(arg1);
        }
    }
}

/**
 * Total time: 587 ms synthetic
 */
