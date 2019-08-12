package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_subword_index extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new removal_modules_subword_index();

    public static final String myName = "com.cyc.cycjava_2.cycl.inference.modules.removal.removal_modules_subword_index";


    private static final SubLSymbol $REMOVAL_CONJUNCTIVE_SUBWORD_INDEX = makeKeyword("REMOVAL-CONJUNCTIVE-SUBWORD-INDEX");

    private static final SubLList $list1 = list(new SubLObject[]{ makeKeyword("APPLICABILITY"), makeSymbol("REMOVAL-CONJUNCTIVE-SUBWORD-INDEX-APPLICABILITY"), $COST, makeSymbol("REMOVAL-CONJUNCTIVE-SUBWORD-INDEX-COST"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-CONJUNCTIVE-SUBWORD-INDEX-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$and (PRED ?X ?Y) (SUBSTRING-PRED SUBSTRING ?Y)) using the subword index. Cf. #$indexSubWordsForArg."), makeKeyword("EXAMPLE"), makeString("(#$and (#$comment ?TERM ?COMMENT) (#$substring ?COMMENT \"more obtuse\"))") });

    private static final SubLList $list2 = list(makeSymbol("MT"), makeSymbol("ASENT"));

    private static final SubLList $list3 = list(reader_make_constant_shell(makeString("suffixSubstring")), reader_make_constant_shell(makeString("substring")), reader_make_constant_shell(makeString("prefixSubstring")), reader_make_constant_shell(makeString("prefixSubstring-CaseInsensitive")), reader_make_constant_shell(makeString("substring-CaseInsensitive")), reader_make_constant_shell(makeString("suffixSubstring-CaseInsensitive")));

    private static final SubLObject $$equalStrings_CaseInsensitive = reader_make_constant_shell(makeString("equalStrings-CaseInsensitive"));

    private static final SubLSymbol REMOVAL_CONJUNCTIVE_SUBWORD_INDEX_APPLICABILITY = makeSymbol("REMOVAL-CONJUNCTIVE-SUBWORD-INDEX-APPLICABILITY");

    private static final SubLSymbol REMOVAL_CONJUNCTIVE_SUBWORD_INDEX_COST = makeSymbol("REMOVAL-CONJUNCTIVE-SUBWORD-INDEX-COST");

    private static final SubLObject $$substring = reader_make_constant_shell(makeString("substring"));









    private static final SubLSymbol REMOVAL_CONJUNCTIVE_SUBWORD_INDEX_EXPAND = makeSymbol("REMOVAL-CONJUNCTIVE-SUBWORD-INDEX-EXPAND");

    private static final SubLObject $$prefixSubstring_CaseInsensitive = reader_make_constant_shell(makeString("prefixSubstring-CaseInsensitive"));

    private static final SubLSymbol CYCL_STRING_STARTS_WITH_BY_TEST = makeSymbol("CYCL-STRING-STARTS-WITH-BY-TEST");

    private static final SubLObject $$suffixSubstring = reader_make_constant_shell(makeString("suffixSubstring"));

    private static final SubLSymbol CYCL_STRING_ENDS_WITH_BY_TEST = makeSymbol("CYCL-STRING-ENDS-WITH-BY-TEST");

    private static final SubLSymbol $sym17$CYCL_SUPERSTRING_ = makeSymbol("CYCL-SUPERSTRING?");

    private static final SubLList $list18 = list(makeSymbol("THIS-MT"), makeSymbol("ASENT"));

    public static SubLObject removal_conjunctive_subword_index_applicability(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject indexed_pred_dict = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        final SubLObject substring_dict = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = contextualized_asent;
            SubLObject mt = NIL;
            SubLObject asent = NIL;
            destructuring_bind_must_consp(current, datum, $list2);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list2);
            asent = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != el_binary_formula_p(asent)) {
                    thread.resetMultipleValues();
                    final SubLObject pred = unmake_binary_formula(asent);
                    final SubLObject arg1 = thread.secondMultipleValue();
                    final SubLObject arg2 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != member(pred, lexicon_subword_index.non_trie_subword_preds(), UNPROVIDED, UNPROVIDED)) {
                        if (NIL != member(TWO_INTEGER, lexicon_subword_index.non_trie_subword_pred_args(pred), UNPROVIDED, UNPROVIDED)) {
                            dictionary_utilities.dictionary_push(indexed_pred_dict, arg2, index);
                        }
                    } else
                        if (NIL != subl_promotions.memberP(pred, $list3, UNPROVIDED, UNPROVIDED)) {
                            if (NIL != cycl_string.cycl_string_p(arg1)) {
                                dictionary_utilities.dictionary_push(substring_dict, arg2, index);
                            }
                        } else
                            if (pred.eql($$equalStrings_CaseInsensitive) && (NIL != cycl_string.cycl_string_p(arg2))) {
                                dictionary_utilities.dictionary_push(substring_dict, arg1, index);
                            }


                }
            } else {
                cdestructuring_bind_error(datum, $list2);
            }
            index = add(index, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        } 
        SubLObject subclause_specs = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(substring_dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject substring_indices = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject indexed_pred_indices = dictionary.dictionary_lookup(indexed_pred_dict, var, UNPROVIDED);
            if (NIL != indexed_pred_indices) {
                SubLObject cdolist_list_var2;
                final SubLObject index_sets = cdolist_list_var2 = list_utilities.cartesian_product(list(indexed_pred_indices, substring_indices), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject indices = NIL;
                indices = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    subclause_specs = cons(clause_utilities.new_subclause_spec(NIL, indices), subclause_specs);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    indices = cdolist_list_var2.first();
                } 
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return nreverse(subclause_specs);
    }

    public static SubLObject removal_conjunctive_subword_index_cost(final SubLObject contextualized_dnf_clause) {
        return ONE_INTEGER;
    }

    public static SubLObject removal_conjunctive_subword_index_expand(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject pred = removal_conjunctive_subword_index_destructure(contextualized_dnf_clause);
        final SubLObject substring = thread.secondMultipleValue();
        final SubLObject superstring_var = thread.thirdMultipleValue();
        final SubLObject term_var = thread.fourthMultipleValue();
        final SubLObject substring_pred = thread.fifthMultipleValue();
        final SubLObject mt = thread.sixthMultipleValue();
        final SubLObject ordering = thread.seventhMultipleValue();
        thread.resetMultipleValues();
        final SubLObject case_sensitivity = (NIL != genl_predicates.genl_predicateP(substring_pred, $$substring, UNPROVIDED, UNPROVIDED)) ? $ON : $OFF;
        final SubLObject superstrings = lexicon_subword_index.nl_trie_subword_index_search_set(substring, case_sensitivity);
        if (NIL != set.set_p(superstrings)) {
            final SubLObject set_contents_var = set.do_set_internal(superstrings);
            SubLObject basis_object;
            SubLObject state;
            SubLObject superstring;
            SubLObject orig_bindings;
            SubLObject unify_justification;
            SubLObject mt_var;
            SubLObject _prev_bind_0;
            SubLObject _prev_bind_2;
            SubLObject _prev_bind_3;
            SubLObject indexed_terms;
            SubLObject cdolist_list_var;
            SubLObject indexed_pred_support;
            SubLObject v_term;
            SubLObject term_bindings;
            SubLObject term_unify_justification;
            SubLObject v_bindings;
            SubLObject substring_support_sentence;
            SubLObject indexed_pred_supports;
            SubLObject substring_supports;
            SubLObject justifications;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                superstring = set_contents.do_set_contents_next(basis_object, state);
                if ((NIL != set_contents.do_set_contents_element_validP(state, superstring)) && (NIL != removal_substring_matchesP(substring_pred, substring, superstring))) {
                    thread.resetMultipleValues();
                    orig_bindings = unification_utilities.term_unify(superstring_var, superstring, UNPROVIDED, UNPROVIDED);
                    unify_justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != orig_bindings) {
                        mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                        _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                        _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            indexed_terms = cycl_utilities.expression_gather(superstring, INDEXED_TERM_P, NIL, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
                            if (NIL != indexed_term_p(pred)) {
                                indexed_terms = cons(pred, indexed_terms);
                            }
                            cdolist_list_var = virtual_indexing.gather_overlap_index(indexed_terms, UNPROVIDED);
                            indexed_pred_support = NIL;
                            indexed_pred_support = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                if (((NIL == pred) || pred.equal(cycl_utilities.formula_operator(assertions_high.assertion_formula(indexed_pred_support)))) && (NIL != equal(superstring, cycl_utilities.formula_arg(assertions_high.assertion_formula(indexed_pred_support), TWO_INTEGER, UNPROVIDED)))) {
                                    v_term = assertions_high.gaf_arg1(indexed_pred_support);
                                    thread.resetMultipleValues();
                                    term_bindings = unification_utilities.term_unify(term_var, v_term, UNPROVIDED, UNPROVIDED);
                                    term_unify_justification = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != term_bindings) {
                                        v_bindings = (NIL != variables.variable_p(term_var)) ? append(copy_list(orig_bindings), term_bindings) : copy_list(orig_bindings);
                                        substring_support_sentence = make_binary_formula(substring_pred, superstring, substring);
                                        indexed_pred_supports = list(indexed_pred_support);
                                        substring_supports = list(arguments.make_hl_support($EVAL, substring_support_sentence, mt_vars.$core_mt_floor$.getGlobalValue(), UNPROVIDED));
                                        justifications = list_utilities.permute(list(indexed_pred_supports, substring_supports), ordering);
                                        inference_worker_removal.conjunctive_removal_callback(v_bindings, justifications);
                                    }
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                indexed_pred_support = cdolist_list_var.first();
                            } 
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_substring_matchesP(final SubLObject substring_pred, final SubLObject substring, final SubLObject superstring) {
        if (substring_pred.eql($$equalStrings_CaseInsensitive)) {
            return equalp(substring, superstring);
        }
        final SubLObject test = (NIL != genl_predicates.genl_predicateP(substring_pred, $$substring, UNPROVIDED, UNPROVIDED)) ? symbol_function(EQUAL) : symbol_function(EQUALP);
        final SubLObject fn = (NIL != genl_predicates.genl_predicateP(substring_pred, $$prefixSubstring_CaseInsensitive, UNPROVIDED, UNPROVIDED)) ? symbol_function(CYCL_STRING_STARTS_WITH_BY_TEST) : NIL != genl_predicates.genl_predicateP(substring_pred, $$suffixSubstring, UNPROVIDED, UNPROVIDED) ? symbol_function(CYCL_STRING_ENDS_WITH_BY_TEST) : symbol_function($sym17$CYCL_SUPERSTRING_);
        return funcall(fn, superstring, substring, test);
    }

    public static SubLObject removal_conjunctive_subword_index_destructure(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pred = NIL;
        SubLObject substring = NIL;
        SubLObject superstring_var = NIL;
        SubLObject term_var = NIL;
        SubLObject substring_pred = NIL;
        SubLObject mt = NIL;
        SubLObject permutation = NIL;
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = contextualized_asent;
            SubLObject this_mt = NIL;
            SubLObject asent = NIL;
            destructuring_bind_must_consp(current, datum, $list18);
            this_mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list18);
            asent = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != el_binary_formula_p(asent)) {
                    thread.resetMultipleValues();
                    final SubLObject this_pred = unmake_binary_formula(asent);
                    final SubLObject arg1 = thread.secondMultipleValue();
                    final SubLObject arg2 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (this_pred.eql($$equalStrings_CaseInsensitive)) {
                        if ((NIL == superstring_var) || superstring_var.eql(arg1)) {
                            substring = arg2;
                            superstring_var = arg1;
                            substring_pred = this_pred;
                            permutation = cons(ONE_INTEGER, permutation);
                        }
                    } else
                        if (NIL != subl_promotions.memberP(this_pred, $list3, UNPROVIDED, UNPROVIDED)) {
                            if ((NIL == superstring_var) || superstring_var.eql(arg2)) {
                                substring = arg1;
                                superstring_var = arg2;
                                substring_pred = this_pred;
                                permutation = cons(ONE_INTEGER, permutation);
                            }
                        } else
                            if ((NIL != member(this_pred, lexicon_subword_index.non_trie_subword_preds(), UNPROVIDED, UNPROVIDED)) && ((NIL == superstring_var) || superstring_var.eql(arg2))) {
                                pred = this_pred;
                                term_var = arg1;
                                superstring_var = arg2;
                                mt = this_mt;
                                permutation = cons(ZERO_INTEGER, permutation);
                            }


                }
            } else {
                cdestructuring_bind_error(datum, $list18);
            }
            index = add(index, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        } 
        permutation = nreverse(permutation);
        return values(pred, substring, superstring_var, term_var, substring_pred, mt, permutation);
    }

    public static SubLObject declare_removal_modules_subword_index_file() {
        declareFunction("removal_conjunctive_subword_index_applicability", "REMOVAL-CONJUNCTIVE-SUBWORD-INDEX-APPLICABILITY", 1, 0, false);
        declareFunction("removal_conjunctive_subword_index_cost", "REMOVAL-CONJUNCTIVE-SUBWORD-INDEX-COST", 1, 0, false);
        declareFunction("removal_conjunctive_subword_index_expand", "REMOVAL-CONJUNCTIVE-SUBWORD-INDEX-EXPAND", 1, 0, false);
        declareFunction("removal_substring_matchesP", "REMOVAL-SUBSTRING-MATCHES?", 3, 0, false);
        declareFunction("removal_conjunctive_subword_index_destructure", "REMOVAL-CONJUNCTIVE-SUBWORD-INDEX-DESTRUCTURE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_subword_index_file() {
        return NIL;
    }

    public static SubLObject setup_removal_modules_subword_index_file() {
        inference_modules.inference_conjunctive_removal_module($REMOVAL_CONJUNCTIVE_SUBWORD_INDEX, $list1);
        note_funcall_helper_function(REMOVAL_CONJUNCTIVE_SUBWORD_INDEX_APPLICABILITY);
        note_funcall_helper_function(REMOVAL_CONJUNCTIVE_SUBWORD_INDEX_COST);
        note_funcall_helper_function(REMOVAL_CONJUNCTIVE_SUBWORD_INDEX_EXPAND);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_subword_index_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_subword_index_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_subword_index_file();
    }

    static {




















    }
}

/**
 * Total time: 126 ms
 */
