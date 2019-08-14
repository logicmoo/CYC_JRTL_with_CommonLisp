/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$within_unassert$;
import static com.cyc.cycjava.cycl.control_vars.within_askP;
import static com.cyc.cycjava.cycl.control_vars.within_assertP;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.czer_utilities.arg_permits_generic_arg_variablesP;
import static com.cyc.cycjava.cycl.czer_utilities.arg_permits_keyword_variablesP;
import static com.cyc.cycjava.cycl.czer_utilities.evaluatable_expressions_out;
import static com.cyc.cycjava.cycl.czer_utilities.indexed_argP;
import static com.cyc.cycjava.cycl.czer_utilities.sentence_argP;
import static com.cyc.cycjava.cycl.czer_utilities.true_sentenceP;
import static com.cyc.cycjava.cycl.czer_utilities.within_conjunctionP;
import static com.cyc.cycjava.cycl.czer_utilities.within_disjunctionP;
import static com.cyc.cycjava.cycl.czer_utilities.within_negationP;
import static com.cyc.cycjava.cycl.czer_vars.$el_symbol_suffix_table$;
import static com.cyc.cycjava.cycl.czer_vars.$recanonicalizingP$;
import static com.cyc.cycjava.cycl.czer_vars.$simplify_equal_symbols_literalP$;
import static com.cyc.cycjava.cycl.czer_vars.$simplify_implicationP$;
import static com.cyc.cycjava.cycl.czer_vars.$simplify_literalP$;
import static com.cyc.cycjava.cycl.czer_vars.$simplify_non_wff_literalP$;
import static com.cyc.cycjava.cycl.czer_vars.$simplify_redundanciesP$;
import static com.cyc.cycjava.cycl.czer_vars.$simplify_sentenceP$;
import static com.cyc.cycjava.cycl.czer_vars.$simplify_sequence_vars_using_kb_arityP$;
import static com.cyc.cycjava.cycl.czer_vars.$simplify_transitive_redundanciesP$;
import static com.cyc.cycjava.cycl.czer_vars.$simplify_true_sentence_awayP$;
import static com.cyc.cycjava.cycl.czer_vars.$simplify_using_semanticsP$;
import static com.cyc.cycjava.cycl.czer_vars.$standardize_variables_memory$;
import static com.cyc.cycjava.cycl.czer_vars.$try_to_simplify_non_wff_into_wffP$;
import static com.cyc.cycjava.cycl.czer_vars.$trying_to_simplify_non_wff_into_wffP$;
import static com.cyc.cycjava.cycl.czer_vars.$within_negationP$;
import static com.cyc.cycjava.cycl.dictionary.clear_dictionary;
import static com.cyc.cycjava.cycl.dictionary.dictionary_contents;
import static com.cyc.cycjava.cycl.dictionary.dictionary_enter;
import static com.cyc.cycjava.cycl.dictionary.dictionary_lookup;
import static com.cyc.cycjava.cycl.dictionary.new_dictionary;
import static com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_doneP;
import static com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_finalize;
import static com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_key_value;
import static com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_next;
import static com.cyc.cycjava.cycl.dictionary_contents.do_dictionary_contents_state;
import static com.cyc.cycjava.cycl.dictionary_utilities.dictionary_push;
import static com.cyc.cycjava.cycl.el_utilities.appearing_as_both_sequence_and_term_variables;
import static com.cyc.cycjava.cycl.el_utilities.atomic_sentenceP;
import static com.cyc.cycjava.cycl.el_utilities.closedP;
import static com.cyc.cycjava.cycl.el_utilities.cyc_const_logical_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.designated_mt;
import static com.cyc.cycjava.cycl.el_utilities.designated_sentence;
import static com.cyc.cycjava.cycl.el_utilities.el_bounded_existential_p;
import static com.cyc.cycjava.cycl.el_utilities.el_conjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_disjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_error;
import static com.cyc.cycjava.cycl.el_utilities.el_exception_p;
import static com.cyc.cycjava.cycl.el_utilities.el_existential_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_any_of_operators_p;
import static com.cyc.cycjava.cycl.el_utilities.el_general_existential_p;
import static com.cyc.cycjava.cycl.el_utilities.el_implication_p;
import static com.cyc.cycjava.cycl.el_utilities.el_multi_existential_p;
import static com.cyc.cycjava.cycl.el_utilities.el_multi_universal_p;
import static com.cyc.cycjava.cycl.el_utilities.el_negation_p;
import static com.cyc.cycjava.cycl.el_utilities.el_negative_sentences;
import static com.cyc.cycjava.cycl.el_utilities.el_positive_sentences;
import static com.cyc.cycjava.cycl.el_utilities.el_relation_expressionP;
import static com.cyc.cycjava.cycl.el_utilities.el_unary_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_universal_negation_p;
import static com.cyc.cycjava.cycl.el_utilities.el_universal_p;
import static com.cyc.cycjava.cycl.el_utilities.existential_bound;
import static com.cyc.cycjava.cycl.el_utilities.first_in_sequence;
import static com.cyc.cycjava.cycl.el_utilities.formula_arity;
import static com.cyc.cycjava.cycl.el_utilities.formula_arityE;
import static com.cyc.cycjava.cycl.el_utilities.groundP;
import static com.cyc.cycjava.cycl.el_utilities.ist_sentence_p;
import static com.cyc.cycjava.cycl.el_utilities.kappa_asent_p;
import static com.cyc.cycjava.cycl.el_utilities.kappa_predicate_arity;
import static com.cyc.cycjava.cycl.el_utilities.kappa_predicate_formal_args;
import static com.cyc.cycjava.cycl.el_utilities.kappa_predicate_query;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg0;
import static com.cyc.cycjava.cycl.el_utilities.literal_args;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_bounded_existential;
import static com.cyc.cycjava.cycl.el_utilities.make_conjunction;
import static com.cyc.cycjava.cycl.el_utilities.make_disjunction;
import static com.cyc.cycjava.cycl.el_utilities.make_el_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_ist_sentence;
import static com.cyc.cycjava.cycl.el_utilities.make_multiply_quantified_sentence;
import static com.cyc.cycjava.cycl.el_utilities.make_negation;
import static com.cyc.cycjava.cycl.el_utilities.make_regularly_quantified_sentence;
import static com.cyc.cycjava.cycl.el_utilities.make_ternary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.el_utilities.map_formula_args;
import static com.cyc.cycjava.cycl.el_utilities.maybe_add_sequence_var_to_end;
import static com.cyc.cycjava.cycl.el_utilities.mt_designating_literalP;
import static com.cyc.cycjava.cycl.el_utilities.nadd_sequence_var_to_end;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.cycjava.cycl.el_utilities.possibly_sentence_p;
import static com.cyc.cycjava.cycl.el_utilities.quantified_sub_sentence;
import static com.cyc.cycjava.cycl.el_utilities.quantified_var;
import static com.cyc.cycjava.cycl.el_utilities.quantified_var_list;
import static com.cyc.cycjava.cycl.el_utilities.relation_expressionP;
import static com.cyc.cycjava.cycl.el_utilities.remove_formula_arg;
import static com.cyc.cycjava.cycl.el_utilities.replace_arg_of_pred;
import static com.cyc.cycjava.cycl.el_utilities.rest_of_sequence;
import static com.cyc.cycjava.cycl.el_utilities.scoped_vars;
import static com.cyc.cycjava.cycl.el_utilities.sentence_free_variables;
import static com.cyc.cycjava.cycl.el_utilities.sentence_quantifier;
import static com.cyc.cycjava.cycl.el_utilities.sequence_var;
import static com.cyc.cycjava.cycl.el_utilities.subformulas_wf_wrt_sequence_varsP;
import static com.cyc.cycjava.cycl.el_utilities.subl_escape_p;
import static com.cyc.cycjava.cycl.el_utilities.unmake_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.variable_subst;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.list_utilities.any_in_list;
import static com.cyc.cycjava.cycl.list_utilities.duplicatesP;
import static com.cyc.cycjava.cycl.list_utilities.fast_delete_duplicates;
import static com.cyc.cycjava.cycl.list_utilities.fast_set_difference;
import static com.cyc.cycjava.cycl.list_utilities.intersectP;
import static com.cyc.cycjava.cycl.list_utilities.remove_if_not;
import static com.cyc.cycjava.cycl.list_utilities.replace_nth;
import static com.cyc.cycjava.cycl.list_utilities.same_length_p;
import static com.cyc.cycjava.cycl.list_utilities.singletonP;
import static com.cyc.cycjava.cycl.list_utilities.tree_find;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$mt$;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$relevant_mt_function$;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$relevant_mts$;
import static com.cyc.cycjava.cycl.mt_relevance_macros.possibly_in_mt_determine_function;
import static com.cyc.cycjava.cycl.mt_relevance_macros.possibly_in_mt_determine_mt;
import static com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_function;
import static com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_mt;
import static com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_mt_list;
import static com.cyc.cycjava.cycl.mt_relevance_macros.with_inference_mt_relevance_validate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.adjoin;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.list_length;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nsubst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SIMPLIFIER
 * source file: /cyc/top/cycl/simplifier.lisp
 * created:     2019/07/03 17:37:29
 */
public final class simplifier extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new simplifier();

 public static final String myName = "com.cyc.cycjava.cycl.simplifier";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $simplify_cycl_sentence_and_subsentencesP$ = makeSymbol("*SIMPLIFY-CYCL-SENTENCE-AND-SUBSENTENCES?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $simplify_individualasfn_expressions_isa_sentences_to_add$ = makeSymbol("*SIMPLIFY-INDIVIDUALASFN-EXPRESSIONS-ISA-SENTENCES-TO-ADD*");

    // defparameter
    /**
     * dynamically bound to t when we're in @xref simplify-sequence-variables, to
     * avoid unnecessary recursion
     */
    @LispMethod(comment = "dynamically bound to t when we\'re in @xref simplify-sequence-variables, to\r\navoid unnecessary recursion\ndefparameter\ndynamically bound to t when we\'re in @xref simplify-sequence-variables, to\navoid unnecessary recursion")
    private static final SubLSymbol $simplifying_sequence_variablesP$ = makeSymbol("*SIMPLIFYING-SEQUENCE-VARIABLES?*");

    // defparameter
    /**
     * dynamically bound to t when we're in @xref simplify-transitive-redundancies
     * to avoid unnecessary recursion
     */
    @LispMethod(comment = "dynamically bound to t when we\'re in @xref simplify-transitive-redundancies\r\nto avoid unnecessary recursion\ndefparameter\ndynamically bound to t when we\'re in @xref simplify-transitive-redundancies\nto avoid unnecessary recursion")
    private static final SubLSymbol $simplifying_redundanciesP$ = makeSymbol("*SIMPLIFYING-REDUNDANCIES?*");

    // defparameter
    /**
     * Transitive (or sort of transitive) predicates that can be used to constrain
     * arguments, i.e. the argument must bear the relation RELN to something else,
     * where RELN is one of these. Assumes that they are binary and that the arg1 is
     * constrained to bear the relation to the arg2.
     */
    @LispMethod(comment = "Transitive (or sort of transitive) predicates that can be used to constrain\r\narguments, i.e. the argument must bear the relation RELN to something else,\r\nwhere RELN is one of these. Assumes that they are binary and that the arg1 is\r\nconstrained to bear the relation to the arg2.\ndefparameter\nTransitive (or sort of transitive) predicates that can be used to constrain\narguments, i.e. the argument must bear the relation RELN to something else,\nwhere RELN is one of these. Assumes that they are binary and that the arg1 is\nconstrained to bear the relation to the arg2.")
    private static final SubLSymbol $transitive_constraint_preds$ = makeSymbol("*TRANSITIVE-CONSTRAINT-PREDS*");



    private static final SubLSymbol $sym1$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol SIMPLIFY_UNARY_JUNCTS = makeSymbol("SIMPLIFY-UNARY-JUNCTS");

    private static final SubLSymbol SIMPLIFY_DUPLICATE_JUNCTS = makeSymbol("SIMPLIFY-DUPLICATE-JUNCTS");

    private static final SubLSymbol $sym5$LIFTABLE_CONJUNCTS_ = makeSymbol("LIFTABLE-CONJUNCTS?");

    private static final SubLSymbol NLIFT_CONJUNCTS = makeSymbol("NLIFT-CONJUNCTS");

    private static final SubLSymbol EL_CONJUNCTION_P = makeSymbol("EL-CONJUNCTION-P");

    private static final SubLSymbol $sym8$CYC_VAR_ = makeSymbol("CYC-VAR?");

    private static final SubLSymbol $sym9$EL_WFF_ = makeSymbol("EL-WFF?");

    private static final SubLSymbol GET_SIMPLIFIED_CYCL_SENTENCE = makeSymbol("GET-SIMPLIFIED-CYCL-SENTENCE");







    private static final SubLString $str14$_S_is_not_well_formed_ = makeString("~S is not well formed.");

    private static final SubLSymbol SIMPLIFY_CYCL_SENTENCE_INT = makeSymbol("SIMPLIFY-CYCL-SENTENCE-INT");







    private static final SubLString $str23$You_tried_to_negate__S___That_was = makeString("You tried to negate ~S.  That was a bad idea, because it's neither a sentence nor a sentence.");

    private static final SubLSymbol EL_DISJUNCTION_P = makeSymbol("EL-DISJUNCTION-P");

    private static final SubLSymbol $sym25$EL_VAR_ = makeSymbol("EL-VAR?");

    private static final SubLSymbol $sym26$_ = makeSymbol(">");

    private static final SubLList $list27 = list(reader_make_constant_shell("equalSymbols"), reader_make_constant_shell("indexicalReferent"), reader_make_constant_shell("termOfUnit"));



    private static final SubLSymbol $SIMPLIFICATION_TO_TAUTOLOGY_DUE_TO_POS_AND_NEG_LITERAL = makeKeyword("SIMPLIFICATION-TO-TAUTOLOGY-DUE-TO-POS-AND-NEG-LITERAL");

    private static final SubLSymbol $sym30$NESTED_COLLECTIONSUBSETFN_EXPRESSION_ = makeSymbol("NESTED-COLLECTIONSUBSETFN-EXPRESSION?");

    private static final SubLSymbol TRANSFORM_NESTED_COLLECTIONSUBSETFN_EXPRESSION = makeSymbol("TRANSFORM-NESTED-COLLECTIONSUBSETFN-EXPRESSION");





    private static final SubLSymbol $sym34$INDIVIDUALASFN_EXPRESSION_ = makeSymbol("INDIVIDUALASFN-EXPRESSION?");

    private static final SubLSymbol TRANSFORM_INDIVIDUALASFN_EXPRESSION = makeSymbol("TRANSFORM-INDIVIDUALASFN-EXPRESSION");











    private static final SubLList $list42 = cons(makeSymbol("VAR"), makeSymbol("BINDING"));

    private static final SubLSymbol $sym44$FORMULA_WITH_SEQUENCE_TERM_ = makeSymbol("FORMULA-WITH-SEQUENCE-TERM?");

    private static final SubLString $str46$Splitting_sequence_variables_into = makeString("Splitting sequence variables into other sequence variables is currently not supported. -ECA");

    private static final SubLList $list47 = list(reader_make_constant_shell("isa"), reader_make_constant_shell("genls"));

    private static final SubLSymbol WEAKEST_ARGS = makeSymbol("WEAKEST-ARGS");

    private static final SubLSymbol STRONGEST_ARGS = makeSymbol("STRONGEST-ARGS");

    private static final SubLSymbol EXPLANATION_OF_WHY_NOT_WFF = makeSymbol("EXPLANATION-OF-WHY-NOT-WFF");

    private static final SubLList $list51 = list(makeKeyword("MAL-ARG-WRT-IFF-DEFN"), makeKeyword("MAL-ARG-WRT-QUOTED-IFF-DEFN"), makeKeyword("MAL-ARG-WRT-SUF-DEFNS"), makeKeyword("MAL-ARG-WRT-QUOTED-SUF-DEFNS"), makeKeyword("MAL-ARG-WRT-COL-DEFN"));

    private static final SubLList $list52 = list(reader_make_constant_shell("RealNumber"), reader_make_constant_shell("SubLRealNumber"));

    private static final SubLList $list53 = list(reader_make_constant_shell("CharacterString"), reader_make_constant_shell("SubLString"));

    public static SubLObject fast_simplify_cycl_sentence(final SubLObject sentence, SubLObject mt, SubLObject aggressively_simplifyP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (aggressively_simplifyP == UNPROVIDED) {
            aggressively_simplifyP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $simplify_cycl_sentence_and_subsentencesP$.currentBinding(thread);
        try {
            $simplify_cycl_sentence_and_subsentencesP$.bind(aggressively_simplifyP, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            final SubLObject _prev_bind_4 = czer_vars.$simplify_non_wff_literalP$.currentBinding(thread);
            final SubLObject _prev_bind_5 = czer_vars.$try_to_simplify_non_wff_into_wffP$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                czer_vars.$simplify_non_wff_literalP$.bind(NIL, thread);
                czer_vars.$try_to_simplify_non_wff_into_wffP$.bind(NIL, thread);
                result = simplify_cycl_sentence(fold_equals(sentence), UNPROVIDED);
            } finally {
                czer_vars.$try_to_simplify_non_wff_into_wffP$.rebind(_prev_bind_5, thread);
                czer_vars.$simplify_non_wff_literalP$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$1, thread);
            }
        } finally {
            $simplify_cycl_sentence_and_subsentencesP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject scg_simplify(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$BaseKB;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = czer_vars.$canonicalize_functionsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$create_narts_regardless_of_whether_within_assertP$.currentBinding(thread);
        try {
            czer_vars.$canonicalize_functionsP$.bind(NIL, thread);
            czer_vars.$create_narts_regardless_of_whether_within_assertP$.bind(NIL, thread);
            return czer_utilities.canonicalize_el_query(fast_simplify_cycl_sentence(sentence, UNPROVIDED, UNPROVIDED), mt, T);
        } finally {
            czer_vars.$create_narts_regardless_of_whether_within_assertP$.rebind(_prev_bind_2, thread);
            czer_vars.$canonicalize_functionsP$.rebind(_prev_bind_0, thread);
        }
    }

    // Definitions
    /**
     * Flattens a list of disjuncts as much as possible starting from the top level.
     * e.g. (<form1> (#$or <form2> <form3>)) will become (<form1> <form2> <form3>),
     * ((#$or (#$or <form1> (#$or <form2> <form3>)) <form4>) <form5>)
     * will become (<form1> <form2> <form3> <form4> <form5>),
     * but ((#$and (#$or <form1> (#$or <form2> <form3>)) <form4>) <form5>) will not change.
     */
    @LispMethod(comment = "Flattens a list of disjuncts as much as possible starting from the top level.\r\ne.g. (<form1> (#$or <form2> <form3>)) will become (<form1> <form2> <form3>),\r\n((#$or (#$or <form1> (#$or <form2> <form3>)) <form4>) <form5>)\r\nwill become (<form1> <form2> <form3> <form4> <form5>),\r\nbut ((#$and (#$or <form1> (#$or <form2> <form3>)) <form4>) <form5>) will not change.\nFlattens a list of disjuncts as much as possible starting from the top level.\ne.g. (<form1> (#$or <form2> <form3>)) will become (<form1> <form2> <form3>),\n((#$or (#$or <form1> (#$or <form2> <form3>)) <form4>) <form5>)\nwill become (<form1> <form2> <form3> <form4> <form5>),\nbut ((#$and (#$or <form1> (#$or <form2> <form3>)) <form4>) <form5>) will not change.")
    public static final SubLObject lift_disjuncts_alt(SubLObject disjuncts) {
        return com.cyc.cycjava.cycl.simplifier.nlift_disjuncts(copy_tree(disjuncts));
    }

    // Definitions
    /**
     * Flattens a list of disjuncts as much as possible starting from the top level.
     * e.g. (<form1> (#$or <form2> <form3>)) will become (<form1> <form2> <form3>),
     * ((#$or (#$or <form1> (#$or <form2> <form3>)) <form4>) <form5>)
     * will become (<form1> <form2> <form3> <form4> <form5>),
     * but ((#$and (#$or <form1> (#$or <form2> <form3>)) <form4>) <form5>) will not change.
     */
    @LispMethod(comment = "Flattens a list of disjuncts as much as possible starting from the top level.\r\ne.g. (<form1> (#$or <form2> <form3>)) will become (<form1> <form2> <form3>),\r\n((#$or (#$or <form1> (#$or <form2> <form3>)) <form4>) <form5>)\r\nwill become (<form1> <form2> <form3> <form4> <form5>),\r\nbut ((#$and (#$or <form1> (#$or <form2> <form3>)) <form4>) <form5>) will not change.\nFlattens a list of disjuncts as much as possible starting from the top level.\ne.g. (<form1> (#$or <form2> <form3>)) will become (<form1> <form2> <form3>),\n((#$or (#$or <form1> (#$or <form2> <form3>)) <form4>) <form5>)\nwill become (<form1> <form2> <form3> <form4> <form5>),\nbut ((#$and (#$or <form1> (#$or <form2> <form3>)) <form4>) <form5>) will not change.")
    public static SubLObject lift_disjuncts(final SubLObject disjuncts) {
        return nlift_disjuncts(copy_tree(disjuncts));
    }

    /**
     * A destructive version of @xref lift-disjuncts.
     */
    @LispMethod(comment = "A destructive version of @xref lift-disjuncts.")
    public static final SubLObject nlift_disjuncts_alt(SubLObject disjuncts) {
        {
            SubLObject last_done = NIL;
            SubLObject undone = NIL;
            SubLObject disjunct = NIL;
            for (undone = disjuncts, disjunct = first_in_sequence(undone); NIL != undone; undone = rest_of_sequence(undone) , disjunct = first_in_sequence(undone)) {
                if (NIL != el_disjunction_p(disjunct)) {
                    {
                        SubLObject nested_disjuncts = cycl_utilities.sentence_args(disjunct, UNPROVIDED);
                        SubLObject still_undone = rest_of_sequence(undone);
                        SubLObject replacements = com.cyc.cycjava.cycl.simplifier.nlift_disjuncts(nested_disjuncts);
                        SubLObject splice_cons = last(replacements, UNPROVIDED);
                        if (NIL == replacements) {
                            if (NIL == last_done) {
                                disjuncts = still_undone;
                            } else {
                                rplacd(last_done, still_undone);
                            }
                        } else {
                            if (replacements == splice_cons) {
                                rplaca(undone, first_in_sequence(replacements));
                            } else {
                                rplacd(splice_cons, still_undone);
                                rplaca(undone, first_in_sequence(replacements));
                                rplacd(undone, rest_of_sequence(replacements));
                                undone = splice_cons;
                            }
                            last_done = undone;
                        }
                    }
                } else {
                    last_done = undone;
                }
            }
            return disjuncts;
        }
    }

    /**
     * A destructive version of @xref lift-disjuncts.
     */
    @LispMethod(comment = "A destructive version of @xref lift-disjuncts.")
    public static SubLObject nlift_disjuncts(SubLObject disjuncts) {
        SubLObject last_done = NIL;
        SubLObject undone = NIL;
        SubLObject disjunct = NIL;
        undone = disjuncts;
        disjunct = first_in_sequence(undone);
        while (NIL != undone) {
            if (NIL != el_disjunction_p(disjunct)) {
                final SubLObject nested_disjuncts = cycl_utilities.sentence_args(disjunct, UNPROVIDED);
                final SubLObject still_undone = rest_of_sequence(undone);
                final SubLObject replacements = nlift_disjuncts(nested_disjuncts);
                final SubLObject splice_cons = last(replacements, UNPROVIDED);
                if (NIL == replacements) {
                    if (NIL == last_done) {
                        disjuncts = still_undone;
                    } else {
                        rplacd(last_done, still_undone);
                    }
                } else {
                    if (replacements.eql(splice_cons)) {
                        rplaca(undone, first_in_sequence(replacements));
                    } else {
                        rplacd(splice_cons, still_undone);
                        rplaca(undone, first_in_sequence(replacements));
                        rplacd(undone, rest_of_sequence(replacements));
                        undone = splice_cons;
                    }
                    last_done = undone;
                }
            } else {
                last_done = undone;
            }
            undone = rest_of_sequence(undone);
            disjunct = first_in_sequence(undone);
        } 
        return disjuncts;
    }

    /**
     * Returns the disjunction of the sentences in the list SENTENCE-LIST.
     * If SIMPLIFY? is true, then if any of the sentences in SENTENCE-LIST are disjunctions themselves, they will be flattened:
     * i.e. no resulting disjunct will itself be a disjunct (simplification is destructive).
     * e.g. (<form1> (#$or <form2> <form3>)) will become (<form1> <form2> <form3>),
     * ((#$or (#$or <form1> (#$or <form2> <form3>)) <form4>) <form5>)
     * will become (<form1> <form2> <form3> <form4> <form5>),
     * but ((#$and (#$or <form1> (#$or <form2> <form3>)) <form4>) <form5>) will not change.
     * Also, if SIMPLIFY? is true and SENTENCE-LIST is of length 1, it will return the sentence in SENTENCE-LIST.
     */
    @LispMethod(comment = "Returns the disjunction of the sentences in the list SENTENCE-LIST.\r\nIf SIMPLIFY? is true, then if any of the sentences in SENTENCE-LIST are disjunctions themselves, they will be flattened:\r\ni.e. no resulting disjunct will itself be a disjunct (simplification is destructive).\r\ne.g. (<form1> (#$or <form2> <form3>)) will become (<form1> <form2> <form3>),\r\n((#$or (#$or <form1> (#$or <form2> <form3>)) <form4>) <form5>)\r\nwill become (<form1> <form2> <form3> <form4> <form5>),\r\nbut ((#$and (#$or <form1> (#$or <form2> <form3>)) <form4>) <form5>) will not change.\r\nAlso, if SIMPLIFY? is true and SENTENCE-LIST is of length 1, it will return the sentence in SENTENCE-LIST.\nReturns the disjunction of the sentences in the list SENTENCE-LIST.\nIf SIMPLIFY? is true, then if any of the sentences in SENTENCE-LIST are disjunctions themselves, they will be flattened:\ni.e. no resulting disjunct will itself be a disjunct (simplification is destructive).\ne.g. (<form1> (#$or <form2> <form3>)) will become (<form1> <form2> <form3>),\n((#$or (#$or <form1> (#$or <form2> <form3>)) <form4>) <form5>)\nwill become (<form1> <form2> <form3> <form4> <form5>),\nbut ((#$and (#$or <form1> (#$or <form2> <form3>)) <form4>) <form5>) will not change.\nAlso, if SIMPLIFY? is true and SENTENCE-LIST is of length 1, it will return the sentence in SENTENCE-LIST.")
    public static final SubLObject disjoin_alt(SubLObject sentence_list, SubLObject simplifyP) {
        if (simplifyP == UNPROVIDED) {
            simplifyP = NIL;
        }
        return com.cyc.cycjava.cycl.simplifier.ndisjoin(NIL != simplifyP ? ((SubLObject) (copy_tree(sentence_list))) : sentence_list, simplifyP);
    }

    /**
     * Returns the disjunction of the sentences in the list SENTENCE-LIST.
     * If SIMPLIFY? is true, then if any of the sentences in SENTENCE-LIST are disjunctions themselves, they will be flattened:
     * i.e. no resulting disjunct will itself be a disjunct (simplification is destructive).
     * e.g. (<form1> (#$or <form2> <form3>)) will become (<form1> <form2> <form3>),
     * ((#$or (#$or <form1> (#$or <form2> <form3>)) <form4>) <form5>)
     * will become (<form1> <form2> <form3> <form4> <form5>),
     * but ((#$and (#$or <form1> (#$or <form2> <form3>)) <form4>) <form5>) will not change.
     * Also, if SIMPLIFY? is true and SENTENCE-LIST is of length 1, it will return the sentence in SENTENCE-LIST.
     */
    @LispMethod(comment = "Returns the disjunction of the sentences in the list SENTENCE-LIST.\r\nIf SIMPLIFY? is true, then if any of the sentences in SENTENCE-LIST are disjunctions themselves, they will be flattened:\r\ni.e. no resulting disjunct will itself be a disjunct (simplification is destructive).\r\ne.g. (<form1> (#$or <form2> <form3>)) will become (<form1> <form2> <form3>),\r\n((#$or (#$or <form1> (#$or <form2> <form3>)) <form4>) <form5>)\r\nwill become (<form1> <form2> <form3> <form4> <form5>),\r\nbut ((#$and (#$or <form1> (#$or <form2> <form3>)) <form4>) <form5>) will not change.\r\nAlso, if SIMPLIFY? is true and SENTENCE-LIST is of length 1, it will return the sentence in SENTENCE-LIST.\nReturns the disjunction of the sentences in the list SENTENCE-LIST.\nIf SIMPLIFY? is true, then if any of the sentences in SENTENCE-LIST are disjunctions themselves, they will be flattened:\ni.e. no resulting disjunct will itself be a disjunct (simplification is destructive).\ne.g. (<form1> (#$or <form2> <form3>)) will become (<form1> <form2> <form3>),\n((#$or (#$or <form1> (#$or <form2> <form3>)) <form4>) <form5>)\nwill become (<form1> <form2> <form3> <form4> <form5>),\nbut ((#$and (#$or <form1> (#$or <form2> <form3>)) <form4>) <form5>) will not change.\nAlso, if SIMPLIFY? is true and SENTENCE-LIST is of length 1, it will return the sentence in SENTENCE-LIST.")
    public static SubLObject disjoin(final SubLObject sentence_list, SubLObject simplifyP) {
        if (simplifyP == UNPROVIDED) {
            simplifyP = NIL;
        }
        return ndisjoin(NIL != simplifyP ? copy_tree(sentence_list) : sentence_list, simplifyP);
    }

    /**
     * A destructive version of @xref disjoin.
     */
    @LispMethod(comment = "A destructive version of @xref disjoin.")
    public static final SubLObject ndisjoin_alt(SubLObject sentence_list, SubLObject simplifyP) {
        if (simplifyP == UNPROVIDED) {
            simplifyP = T;
        }
        SubLTrampolineFile.checkType(sentence_list, LISTP);
        {
            SubLObject disjuncts = (NIL != simplifyP) ? ((SubLObject) (com.cyc.cycjava.cycl.simplifier.nlift_disjuncts(sentence_list))) : sentence_list;
            return make_disjunction(disjuncts);
        }
    }

    /**
     * A destructive version of @xref disjoin.
     */
    @LispMethod(comment = "A destructive version of @xref disjoin.")
    public static SubLObject ndisjoin(final SubLObject sentence_list, SubLObject simplifyP) {
        if (simplifyP == UNPROVIDED) {
            simplifyP = T;
        }
        assert NIL != listp(sentence_list) : "! listp(sentence_list) " + ("Types.listp(sentence_list) " + "CommonSymbols.NIL != Types.listp(sentence_list) ") + sentence_list;
        final SubLObject disjuncts = (NIL != simplifyP) ? nlift_disjuncts(sentence_list) : sentence_list;
        return make_disjunction(disjuncts);
    }

    /**
     * Removes unary disjuncts and conjuncts.
     * Assumes that SENTENCE is in CNF.
     * i.e. if SENTENCE is of the form (#$or <form1>) or (#$and <form1>), returns <form1>.
     * Otherwise returns SENTENCE.
     */
    @LispMethod(comment = "Removes unary disjuncts and conjuncts.\r\nAssumes that SENTENCE is in CNF.\r\ni.e. if SENTENCE is of the form (#$or <form1>) or (#$and <form1>), returns <form1>.\r\nOtherwise returns SENTENCE.\nRemoves unary disjuncts and conjuncts.\nAssumes that SENTENCE is in CNF.\ni.e. if SENTENCE is of the form (#$or <form1>) or (#$and <form1>), returns <form1>.\nOtherwise returns SENTENCE.")
    public static final SubLObject simplify_unary_junct_alt(SubLObject sentence) {
        if ((NIL != el_grammar.el_unary_sentence_p(sentence)) && ((NIL != el_disjunction_p(sentence)) || (NIL != el_conjunction_p(sentence)))) {
            return cycl_utilities.sentence_arg1(sentence, UNPROVIDED);
        } else {
            return sentence;
        }
    }

    /**
     * Removes unary disjuncts and conjuncts.
     * Assumes that SENTENCE is in CNF.
     * i.e. if SENTENCE is of the form (#$or <form1>) or (#$and <form1>), returns <form1>.
     * Otherwise returns SENTENCE.
     */
    @LispMethod(comment = "Removes unary disjuncts and conjuncts.\r\nAssumes that SENTENCE is in CNF.\r\ni.e. if SENTENCE is of the form (#$or <form1>) or (#$and <form1>), returns <form1>.\r\nOtherwise returns SENTENCE.\nRemoves unary disjuncts and conjuncts.\nAssumes that SENTENCE is in CNF.\ni.e. if SENTENCE is of the form (#$or <form1>) or (#$and <form1>), returns <form1>.\nOtherwise returns SENTENCE.")
    public static SubLObject simplify_unary_junct(final SubLObject sentence) {
        if ((NIL != el_grammar.el_unary_sentence_p(sentence)) && ((NIL != el_disjunction_p(sentence)) || (NIL != el_conjunction_p(sentence)))) {
            return cycl_utilities.sentence_arg1(sentence, UNPROVIDED);
        }
        return sentence;
    }

    /**
     * This is a recursive version of @xref simplify-unary-junct.
     * Assumes that the only logical operators in SENTENCE are #$and, #$or, and #$not,
     * and that #$not only encloses atomic sentences.
     * If SENTENCE is of the form (#$or <form1>) or (#$and <form1>), returns <form1>.
     * If SENTENCE is of the form (#$or (#$and (#$and <form1>))) or any other series of nested unary disjuncts or conjuncts,
     * it will return <form1>.
     * If there are no unary disjuncts or conjuncts to simplify, it returns SENTENCE.
     */
    @LispMethod(comment = "This is a recursive version of @xref simplify-unary-junct.\r\nAssumes that the only logical operators in SENTENCE are #$and, #$or, and #$not,\r\nand that #$not only encloses atomic sentences.\r\nIf SENTENCE is of the form (#$or <form1>) or (#$and <form1>), returns <form1>.\r\nIf SENTENCE is of the form (#$or (#$and (#$and <form1>))) or any other series of nested unary disjuncts or conjuncts,\r\nit will return <form1>.\r\nIf there are no unary disjuncts or conjuncts to simplify, it returns SENTENCE.\nThis is a recursive version of @xref simplify-unary-junct.\nAssumes that the only logical operators in SENTENCE are #$and, #$or, and #$not,\nand that #$not only encloses atomic sentences.\nIf SENTENCE is of the form (#$or <form1>) or (#$and <form1>), returns <form1>.\nIf SENTENCE is of the form (#$or (#$and (#$and <form1>))) or any other series of nested unary disjuncts or conjuncts,\nit will return <form1>.\nIf there are no unary disjuncts or conjuncts to simplify, it returns SENTENCE.")
    public static final SubLObject simplify_unary_juncts_alt(SubLObject sentence) {
        if (!((NIL != el_disjunction_p(sentence)) || (NIL != el_conjunction_p(sentence)))) {
            return sentence;
        }
        if (NIL != el_grammar.el_unary_sentence_p(sentence)) {
            return com.cyc.cycjava.cycl.simplifier.simplify_unary_juncts(cycl_utilities.sentence_arg1(sentence, UNPROVIDED));
        } else {
            return map_formula_args(symbol_function(SIMPLIFY_UNARY_JUNCTS), sentence, UNPROVIDED);
        }
    }

    /**
     * This is a recursive version of @xref simplify-unary-junct.
     * Assumes that the only logical operators in SENTENCE are #$and, #$or, and #$not,
     * and that #$not only encloses atomic sentences.
     * If SENTENCE is of the form (#$or <form1>) or (#$and <form1>), returns <form1>.
     * If SENTENCE is of the form (#$or (#$and (#$and <form1>))) or any other series of nested unary disjuncts or conjuncts,
     * it will return <form1>.
     * If there are no unary disjuncts or conjuncts to simplify, it returns SENTENCE.
     */
    @LispMethod(comment = "This is a recursive version of @xref simplify-unary-junct.\r\nAssumes that the only logical operators in SENTENCE are #$and, #$or, and #$not,\r\nand that #$not only encloses atomic sentences.\r\nIf SENTENCE is of the form (#$or <form1>) or (#$and <form1>), returns <form1>.\r\nIf SENTENCE is of the form (#$or (#$and (#$and <form1>))) or any other series of nested unary disjuncts or conjuncts,\r\nit will return <form1>.\r\nIf there are no unary disjuncts or conjuncts to simplify, it returns SENTENCE.\nThis is a recursive version of @xref simplify-unary-junct.\nAssumes that the only logical operators in SENTENCE are #$and, #$or, and #$not,\nand that #$not only encloses atomic sentences.\nIf SENTENCE is of the form (#$or <form1>) or (#$and <form1>), returns <form1>.\nIf SENTENCE is of the form (#$or (#$and (#$and <form1>))) or any other series of nested unary disjuncts or conjuncts,\nit will return <form1>.\nIf there are no unary disjuncts or conjuncts to simplify, it returns SENTENCE.")
    public static SubLObject simplify_unary_juncts(final SubLObject sentence) {
        if ((NIL == el_disjunction_p(sentence)) && (NIL == el_conjunction_p(sentence))) {
            return sentence;
        }
        if (NIL != el_grammar.el_unary_sentence_p(sentence)) {
            return simplify_unary_juncts(cycl_utilities.sentence_arg1(sentence, UNPROVIDED));
        }
        return map_formula_args(symbol_function(SIMPLIFY_UNARY_JUNCTS), sentence, UNPROVIDED);
    }

    /**
     * Removes duplicate conjuncts or disjuncts from SENTENCE and its subsentences.
     * e.g. Given (#$and <form1> <form2> <form3> <form2>), returns (#$and <form1> <form2> <form3>).
     * Assumes that the only logical operators in SENTENCE are #$and, #$or, and #$not, and that #$not only encloses atomic sentences,
     * because it will stop recursing when it hits something that is not a conjunction or disjunction.
     * Note that sentences like (#$and (#$or <form1> <form2>) (#$or <form2> <form1>)) will not be simplified.
     */
    @LispMethod(comment = "Removes duplicate conjuncts or disjuncts from SENTENCE and its subsentences.\r\ne.g. Given (#$and <form1> <form2> <form3> <form2>), returns (#$and <form1> <form2> <form3>).\r\nAssumes that the only logical operators in SENTENCE are #$and, #$or, and #$not, and that #$not only encloses atomic sentences,\r\nbecause it will stop recursing when it hits something that is not a conjunction or disjunction.\r\nNote that sentences like (#$and (#$or <form1> <form2>) (#$or <form2> <form1>)) will not be simplified.\nRemoves duplicate conjuncts or disjuncts from SENTENCE and its subsentences.\ne.g. Given (#$and <form1> <form2> <form3> <form2>), returns (#$and <form1> <form2> <form3>).\nAssumes that the only logical operators in SENTENCE are #$and, #$or, and #$not, and that #$not only encloses atomic sentences,\nbecause it will stop recursing when it hits something that is not a conjunction or disjunction.\nNote that sentences like (#$and (#$or <form1> <form2>) (#$or <form2> <form1>)) will not be simplified.")
    public static final SubLObject simplify_duplicate_juncts_alt(SubLObject sentence) {
        if ((NIL != el_disjunction_p(sentence)) || (NIL != el_conjunction_p(sentence))) {
            return remove_duplicates(map_formula_args(symbol_function(SIMPLIFY_DUPLICATE_JUNCTS), sentence, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            return sentence;
        }
    }

    /**
     * Removes duplicate conjuncts or disjuncts from SENTENCE and its subsentences.
     * e.g. Given (#$and <form1> <form2> <form3> <form2>), returns (#$and <form1> <form2> <form3>).
     * Assumes that the only logical operators in SENTENCE are #$and, #$or, and #$not, and that #$not only encloses atomic sentences,
     * because it will stop recursing when it hits something that is not a conjunction or disjunction.
     * Note that sentences like (#$and (#$or <form1> <form2>) (#$or <form2> <form1>)) will not be simplified.
     */
    @LispMethod(comment = "Removes duplicate conjuncts or disjuncts from SENTENCE and its subsentences.\r\ne.g. Given (#$and <form1> <form2> <form3> <form2>), returns (#$and <form1> <form2> <form3>).\r\nAssumes that the only logical operators in SENTENCE are #$and, #$or, and #$not, and that #$not only encloses atomic sentences,\r\nbecause it will stop recursing when it hits something that is not a conjunction or disjunction.\r\nNote that sentences like (#$and (#$or <form1> <form2>) (#$or <form2> <form1>)) will not be simplified.\nRemoves duplicate conjuncts or disjuncts from SENTENCE and its subsentences.\ne.g. Given (#$and <form1> <form2> <form3> <form2>), returns (#$and <form1> <form2> <form3>).\nAssumes that the only logical operators in SENTENCE are #$and, #$or, and #$not, and that #$not only encloses atomic sentences,\nbecause it will stop recursing when it hits something that is not a conjunction or disjunction.\nNote that sentences like (#$and (#$or <form1> <form2>) (#$or <form2> <form1>)) will not be simplified.")
    public static SubLObject simplify_duplicate_juncts(final SubLObject sentence) {
        if ((NIL != el_disjunction_p(sentence)) || (NIL != el_conjunction_p(sentence))) {
            return remove_duplicates(map_formula_args(symbol_function(SIMPLIFY_DUPLICATE_JUNCTS), sentence, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return sentence;
    }

    /**
     * Flattens a list of conjuncts as much as possible starting from the top level.
     * e.g. (<form1> (#$and <form2> <form3>)) will become (<form1> <form2> <form3>),
     * ((#$and (#$and <form1> (#$and <form2> <form3>)) <form4>) <form5>)
     * will become (<form1> <form2> <form3> <form4> <form5>),
     * but ((#$or (#$and <form1> (#$and <form2> <form3>)) <form4>) <form5>) will not change.
     */
    @LispMethod(comment = "Flattens a list of conjuncts as much as possible starting from the top level.\r\ne.g. (<form1> (#$and <form2> <form3>)) will become (<form1> <form2> <form3>),\r\n((#$and (#$and <form1> (#$and <form2> <form3>)) <form4>) <form5>)\r\nwill become (<form1> <form2> <form3> <form4> <form5>),\r\nbut ((#$or (#$and <form1> (#$and <form2> <form3>)) <form4>) <form5>) will not change.\nFlattens a list of conjuncts as much as possible starting from the top level.\ne.g. (<form1> (#$and <form2> <form3>)) will become (<form1> <form2> <form3>),\n((#$and (#$and <form1> (#$and <form2> <form3>)) <form4>) <form5>)\nwill become (<form1> <form2> <form3> <form4> <form5>),\nbut ((#$or (#$and <form1> (#$and <form2> <form3>)) <form4>) <form5>) will not change.")
    public static final SubLObject lift_conjuncts_alt(SubLObject conjuncts) {
        return com.cyc.cycjava.cycl.simplifier.nlift_conjuncts(copy_tree(conjuncts));
    }

    /**
     * Flattens a list of conjuncts as much as possible starting from the top level.
     * e.g. (<form1> (#$and <form2> <form3>)) will become (<form1> <form2> <form3>),
     * ((#$and (#$and <form1> (#$and <form2> <form3>)) <form4>) <form5>)
     * will become (<form1> <form2> <form3> <form4> <form5>),
     * but ((#$or (#$and <form1> (#$and <form2> <form3>)) <form4>) <form5>) will not change.
     */
    @LispMethod(comment = "Flattens a list of conjuncts as much as possible starting from the top level.\r\ne.g. (<form1> (#$and <form2> <form3>)) will become (<form1> <form2> <form3>),\r\n((#$and (#$and <form1> (#$and <form2> <form3>)) <form4>) <form5>)\r\nwill become (<form1> <form2> <form3> <form4> <form5>),\r\nbut ((#$or (#$and <form1> (#$and <form2> <form3>)) <form4>) <form5>) will not change.\nFlattens a list of conjuncts as much as possible starting from the top level.\ne.g. (<form1> (#$and <form2> <form3>)) will become (<form1> <form2> <form3>),\n((#$and (#$and <form1> (#$and <form2> <form3>)) <form4>) <form5>)\nwill become (<form1> <form2> <form3> <form4> <form5>),\nbut ((#$or (#$and <form1> (#$and <form2> <form3>)) <form4>) <form5>) will not change.")
    public static SubLObject lift_conjuncts(final SubLObject conjuncts) {
        return nlift_conjuncts(copy_tree(conjuncts));
    }

    /**
     * A destructive version of @xref lift-conjuncts.
     */
    @LispMethod(comment = "A destructive version of @xref lift-conjuncts.")
    public static final SubLObject nlift_conjuncts_alt(SubLObject conjuncts) {
        {
            SubLObject last_done = NIL;
            SubLObject undone = NIL;
            SubLObject conjunct = NIL;
            for (undone = conjuncts, conjunct = first_in_sequence(undone); NIL != undone; undone = rest_of_sequence(undone) , conjunct = first_in_sequence(undone)) {
                if (NIL != el_conjunction_p(conjunct)) {
                    {
                        SubLObject nested_conjuncts = cycl_utilities.sentence_args(conjunct, UNPROVIDED);
                        SubLObject still_undone = rest_of_sequence(undone);
                        SubLObject replacements = com.cyc.cycjava.cycl.simplifier.nlift_conjuncts(nested_conjuncts);
                        SubLObject splice_cons = last(replacements, UNPROVIDED);
                        if (NIL == replacements) {
                            if (NIL == last_done) {
                                conjuncts = still_undone;
                            } else {
                                rplacd(last_done, still_undone);
                            }
                        } else {
                            if (replacements == splice_cons) {
                                rplaca(undone, first_in_sequence(replacements));
                            } else {
                                rplacd(splice_cons, still_undone);
                                rplaca(undone, first_in_sequence(replacements));
                                rplacd(undone, rest_of_sequence(replacements));
                                undone = splice_cons;
                            }
                            last_done = undone;
                        }
                    }
                } else {
                    last_done = undone;
                }
            }
            return conjuncts;
        }
    }

    /**
     * A destructive version of @xref lift-conjuncts.
     */
    @LispMethod(comment = "A destructive version of @xref lift-conjuncts.")
    public static SubLObject nlift_conjuncts(SubLObject conjuncts) {
        SubLObject last_done = NIL;
        SubLObject undone = NIL;
        SubLObject conjunct = NIL;
        undone = conjuncts;
        conjunct = first_in_sequence(undone);
        while (NIL != undone) {
            if (NIL != el_conjunction_p(conjunct)) {
                final SubLObject nested_conjuncts = cycl_utilities.sentence_args(conjunct, UNPROVIDED);
                final SubLObject still_undone = rest_of_sequence(undone);
                final SubLObject replacements = nlift_conjuncts(nested_conjuncts);
                final SubLObject splice_cons = last(replacements, UNPROVIDED);
                if (NIL == replacements) {
                    if (NIL == last_done) {
                        conjuncts = still_undone;
                    } else {
                        rplacd(last_done, still_undone);
                    }
                } else {
                    if (replacements.eql(splice_cons)) {
                        rplaca(undone, first_in_sequence(replacements));
                    } else {
                        rplacd(splice_cons, still_undone);
                        rplaca(undone, first_in_sequence(replacements));
                        rplacd(undone, rest_of_sequence(replacements));
                        undone = splice_cons;
                    }
                    last_done = undone;
                }
            } else {
                last_done = undone;
            }
            undone = rest_of_sequence(undone);
            conjunct = first_in_sequence(undone);
        } 
        return conjuncts;
    }

    /**
     * Returns the conjunction of the sentences in the list SENTENCE-LIST.
     * If SIMPLIFY? is true, then if any of the sentences in SENTENCE-LIST are conjunctions themselves, they will be flattened:
     * i.e. no resulting conjunct will itself be a conjunct (simplification is destructive).
     * e.g. (<form1> (#$and <form2> <form3>)) will become (<form1> <form2> <form3>),
     * ((#$and (#$and <form1> (#$and <form2> <form3>)) <form4>) <form5>)
     * will become (<form1> <form2> <form3> <form4> <form5>),
     * but ((#$or (#$and <form1> (#$and <form2> <form3>)) <form4>) <form5>) will not change.
     */
    @LispMethod(comment = "Returns the conjunction of the sentences in the list SENTENCE-LIST.\r\nIf SIMPLIFY? is true, then if any of the sentences in SENTENCE-LIST are conjunctions themselves, they will be flattened:\r\ni.e. no resulting conjunct will itself be a conjunct (simplification is destructive).\r\ne.g. (<form1> (#$and <form2> <form3>)) will become (<form1> <form2> <form3>),\r\n((#$and (#$and <form1> (#$and <form2> <form3>)) <form4>) <form5>)\r\nwill become (<form1> <form2> <form3> <form4> <form5>),\r\nbut ((#$or (#$and <form1> (#$and <form2> <form3>)) <form4>) <form5>) will not change.\nReturns the conjunction of the sentences in the list SENTENCE-LIST.\nIf SIMPLIFY? is true, then if any of the sentences in SENTENCE-LIST are conjunctions themselves, they will be flattened:\ni.e. no resulting conjunct will itself be a conjunct (simplification is destructive).\ne.g. (<form1> (#$and <form2> <form3>)) will become (<form1> <form2> <form3>),\n((#$and (#$and <form1> (#$and <form2> <form3>)) <form4>) <form5>)\nwill become (<form1> <form2> <form3> <form4> <form5>),\nbut ((#$or (#$and <form1> (#$and <form2> <form3>)) <form4>) <form5>) will not change.")
    public static final SubLObject conjoin_alt(SubLObject sentence_list, SubLObject simplifyP) {
        if (simplifyP == UNPROVIDED) {
            simplifyP = NIL;
        }
        return com.cyc.cycjava.cycl.simplifier.nconjoin(NIL != simplifyP ? ((SubLObject) (copy_tree(sentence_list))) : sentence_list, simplifyP);
    }

    /**
     * Returns the conjunction of the sentences in the list SENTENCE-LIST.
     * If SIMPLIFY? is true, then if any of the sentences in SENTENCE-LIST are conjunctions themselves, they will be flattened:
     * i.e. no resulting conjunct will itself be a conjunct (simplification is destructive).
     * e.g. (<form1> (#$and <form2> <form3>)) will become (<form1> <form2> <form3>),
     * ((#$and (#$and <form1> (#$and <form2> <form3>)) <form4>) <form5>)
     * will become (<form1> <form2> <form3> <form4> <form5>),
     * but ((#$or (#$and <form1> (#$and <form2> <form3>)) <form4>) <form5>) will not change.
     */
    @LispMethod(comment = "Returns the conjunction of the sentences in the list SENTENCE-LIST.\r\nIf SIMPLIFY? is true, then if any of the sentences in SENTENCE-LIST are conjunctions themselves, they will be flattened:\r\ni.e. no resulting conjunct will itself be a conjunct (simplification is destructive).\r\ne.g. (<form1> (#$and <form2> <form3>)) will become (<form1> <form2> <form3>),\r\n((#$and (#$and <form1> (#$and <form2> <form3>)) <form4>) <form5>)\r\nwill become (<form1> <form2> <form3> <form4> <form5>),\r\nbut ((#$or (#$and <form1> (#$and <form2> <form3>)) <form4>) <form5>) will not change.\nReturns the conjunction of the sentences in the list SENTENCE-LIST.\nIf SIMPLIFY? is true, then if any of the sentences in SENTENCE-LIST are conjunctions themselves, they will be flattened:\ni.e. no resulting conjunct will itself be a conjunct (simplification is destructive).\ne.g. (<form1> (#$and <form2> <form3>)) will become (<form1> <form2> <form3>),\n((#$and (#$and <form1> (#$and <form2> <form3>)) <form4>) <form5>)\nwill become (<form1> <form2> <form3> <form4> <form5>),\nbut ((#$or (#$and <form1> (#$and <form2> <form3>)) <form4>) <form5>) will not change.")
    public static SubLObject conjoin(final SubLObject sentence_list, SubLObject simplifyP) {
        if (simplifyP == UNPROVIDED) {
            simplifyP = NIL;
        }
        return nconjoin(NIL != simplifyP ? copy_tree(sentence_list) : sentence_list, simplifyP);
    }

    /**
     * A destructive version of @xref conjoin.
     */
    @LispMethod(comment = "A destructive version of @xref conjoin.")
    public static final SubLObject nconjoin_alt(SubLObject sentence_list, SubLObject simplifyP) {
        if (simplifyP == UNPROVIDED) {
            simplifyP = T;
        }
        SubLTrampolineFile.checkType(sentence_list, LISTP);
        return make_conjunction(NIL != simplifyP ? ((SubLObject) (com.cyc.cycjava.cycl.simplifier.nlift_conjuncts(sentence_list))) : sentence_list);
    }

    /**
     * A destructive version of @xref conjoin.
     */
    @LispMethod(comment = "A destructive version of @xref conjoin.")
    public static SubLObject nconjoin(final SubLObject sentence_list, SubLObject simplifyP) {
        if (simplifyP == UNPROVIDED) {
            simplifyP = T;
        }
        assert NIL != listp(sentence_list) : "! listp(sentence_list) " + ("Types.listp(sentence_list) " + "CommonSymbols.NIL != Types.listp(sentence_list) ") + sentence_list;
        return make_conjunction(NIL != simplifyP ? nlift_conjuncts(sentence_list) : sentence_list);
    }

    public static SubLObject possibly_conjoin(final SubLObject sentence_list, SubLObject simplifyP) {
        if (simplifyP == UNPROVIDED) {
            simplifyP = T;
        }
        if (NIL == sentence_list) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(sentence_list)) {
            return list_utilities.only_one(sentence_list);
        }
        return conjoin(sentence_list, simplifyP);
    }

    /**
     * Like @xref lift-conjuncts-recursive except recurses into subformulas.
     */
    @LispMethod(comment = "Like @xref lift-conjuncts-recursive except recurses into subformulas.")
    public static final SubLObject lift_conjuncts_recursive_alt(SubLObject conjuncts) {
        return cycl_utilities.expression_transform(conjuncts, $sym3$LIFTABLE_CONJUNCTS_, NLIFT_CONJUNCTS, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Like @xref lift-conjuncts-recursive except recurses into subformulas.
     */
    @LispMethod(comment = "Like @xref lift-conjuncts-recursive except recurses into subformulas.")
    public static SubLObject lift_conjuncts_recursive(final SubLObject conjuncts) {
        return cycl_utilities.expression_transform(conjuncts, $sym5$LIFTABLE_CONJUNCTS_, NLIFT_CONJUNCTS, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject liftable_conjunctsP_alt(SubLObject conjuncts) {
        return makeBoolean((conjuncts.isList() && (NIL != any_in_list(EL_CONJUNCTION_P, conjuncts, UNPROVIDED))) && (!conjuncts.equal(com.cyc.cycjava.cycl.simplifier.lift_conjuncts(conjuncts))));
    }

    public static SubLObject liftable_conjunctsP(final SubLObject conjuncts) {
        return makeBoolean((conjuncts.isList() && (NIL != list_utilities.any_in_list(EL_CONJUNCTION_P, conjuncts, UNPROVIDED))) && (!conjuncts.equal(lift_conjuncts(conjuncts))));
    }

    public static final SubLObject simplify_el_syntax_alt(SubLObject sentence, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym6$CYC_VAR_);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $simplify_non_wff_literalP$.currentBinding(thread);
                    try {
                        $simplify_non_wff_literalP$.bind(NIL, thread);
                        result = com.cyc.cycjava.cycl.simplifier.simplify_cycl_sentence(sentence, varP);
                    } finally {
                        $simplify_non_wff_literalP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject simplify_el_syntax(final SubLObject sentence, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym8$CYC_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$simplify_non_wff_literalP$.currentBinding(thread);
        try {
            czer_vars.$simplify_non_wff_literalP$.bind(NIL, thread);
            result = simplify_cycl_sentence(sentence, varP);
        } finally {
            czer_vars.$simplify_non_wff_literalP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Assumes that NON-WFF is an ill-formed sentence.  Tries to simplify it into a well-formed sentence.
     *
     * @return 0 sentence; the simplified version of NON-WFF.
     * @return 1 boolean; t iff the simplified version of NON-WFF is well-formed.
    Assumes that the EL variable namespace is bound.
     */
    @LispMethod(comment = "Assumes that NON-WFF is an ill-formed sentence.  Tries to simplify it into a well-formed sentence.\r\n\r\n@return 0 sentence; the simplified version of NON-WFF.\r\n@return 1 boolean; t iff the simplified version of NON-WFF is well-formed.\r\nAssumes that the EL variable namespace is bound.")
    public static final SubLObject try_to_simplify_non_wff_into_wff_alt(SubLObject non_wff, SubLObject wff_function, SubLObject arg2_to_wff_function) {
        if (wff_function == UNPROVIDED) {
            wff_function = symbol_function($sym7$EL_WFF_);
        }
        if (arg2_to_wff_function == UNPROVIDED) {
            arg2_to_wff_function = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $try_to_simplify_non_wff_into_wffP$.getDynamicValue(thread)) {
                {
                    SubLObject simpler_sentence = NIL;
                    SubLObject is_it_wff_nowP = NIL;
                    {
                        SubLObject _prev_bind_0 = $trying_to_simplify_non_wff_into_wffP$.currentBinding(thread);
                        try {
                            $trying_to_simplify_non_wff_into_wffP$.bind(T, thread);
                            simpler_sentence = com.cyc.cycjava.cycl.simplifier.simplify_cycl_sentence_deep(non_wff, UNPROVIDED);
                            is_it_wff_nowP = makeBoolean((!non_wff.equal(simpler_sentence)) && (NIL != (NIL != arg2_to_wff_function ? ((SubLObject) (funcall(wff_function, simpler_sentence, arg2_to_wff_function))) : funcall(wff_function, simpler_sentence))));
                        } finally {
                            $trying_to_simplify_non_wff_into_wffP$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return values(simpler_sentence, is_it_wff_nowP);
                }
            } else {
                return values(non_wff, NIL);
            }
        }
    }

    /**
     * Assumes that NON-WFF is an ill-formed sentence.  Tries to simplify it into a well-formed sentence.
     *
     * @return 0 sentence; the simplified version of NON-WFF.
     * @return 1 boolean; t iff the simplified version of NON-WFF is well-formed.
    Assumes that the EL variable namespace is bound.
     */
    @LispMethod(comment = "Assumes that NON-WFF is an ill-formed sentence.  Tries to simplify it into a well-formed sentence.\r\n\r\n@return 0 sentence; the simplified version of NON-WFF.\r\n@return 1 boolean; t iff the simplified version of NON-WFF is well-formed.\r\nAssumes that the EL variable namespace is bound.")
    public static SubLObject try_to_simplify_non_wff_into_wff(final SubLObject non_wff, SubLObject wff_function, SubLObject arg2_to_wff_function) {
        if (wff_function == UNPROVIDED) {
            wff_function = symbol_function($sym9$EL_WFF_);
        }
        if (arg2_to_wff_function == UNPROVIDED) {
            arg2_to_wff_function = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$try_to_simplify_non_wff_into_wffP$.getDynamicValue(thread)) {
            SubLObject simpler_sentence = NIL;
            SubLObject is_it_wff_nowP = NIL;
            final SubLObject _prev_bind_0 = czer_vars.$trying_to_simplify_non_wff_into_wffP$.currentBinding(thread);
            try {
                czer_vars.$trying_to_simplify_non_wff_into_wffP$.bind(T, thread);
                simpler_sentence = simplify_cycl_sentence_deep(non_wff, UNPROVIDED);
                is_it_wff_nowP = makeBoolean((!non_wff.equal(simpler_sentence)) && (NIL != (NIL != arg2_to_wff_function ? funcall(wff_function, simpler_sentence, arg2_to_wff_function) : funcall(wff_function, simpler_sentence))));
            } finally {
                czer_vars.$trying_to_simplify_non_wff_into_wffP$.rebind(_prev_bind_0, thread);
            }
            return values(simpler_sentence, is_it_wff_nowP);
        }
        return values(non_wff, NIL);
    }

    /**
     * Performs deeper simplifications on SENTENCE than @xref simplify-cycl-sentence.
     * Assumes that the EL variable namespace is bound.
     */
    @LispMethod(comment = "Performs deeper simplifications on SENTENCE than @xref simplify-cycl-sentence.\r\nAssumes that the EL variable namespace is bound.\nPerforms deeper simplifications on SENTENCE than @xref simplify-cycl-sentence.\nAssumes that the EL variable namespace is bound.")
    public static final SubLObject simplify_cycl_sentence_deep_alt(SubLObject sentence, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym6$CYC_VAR_);
        }
        sentence = com.cyc.cycjava.cycl.simplifier.simplify_sequence_variables_1(sentence);
        sentence = com.cyc.cycjava.cycl.simplifier.simplify_cycl_sentence(sentence, varP);
        return sentence;
    }

    /**
     * Performs deeper simplifications on SENTENCE than @xref simplify-cycl-sentence.
     * Assumes that the EL variable namespace is bound.
     */
    @LispMethod(comment = "Performs deeper simplifications on SENTENCE than @xref simplify-cycl-sentence.\r\nAssumes that the EL variable namespace is bound.\nPerforms deeper simplifications on SENTENCE than @xref simplify-cycl-sentence.\nAssumes that the EL variable namespace is bound.")
    public static SubLObject simplify_cycl_sentence_deep(SubLObject sentence, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym8$CYC_VAR_);
        }
        sentence = simplify_sequence_variables_1(sentence);
        sentence = simplify_cycl_sentence(sentence, varP);
        return sentence;
    }

    public static SubLObject get_simplified_cycl_sentence(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject sentence_with_folded_equals = fold_equals(sentence);
            return simplify_cycl_sentence(sentence_with_folded_equals, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
    }

    public static final SubLObject simplify_cycl_sentence_alt(SubLObject sentence, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym6$CYC_VAR_);
        }
        sentence = com.cyc.cycjava.cycl.simplifier.simplify_special_cases(sentence);
        sentence = com.cyc.cycjava.cycl.simplifier.simplify_cycl_sentence_int(sentence, varP);
        if (NIL != com.cyc.cycjava.cycl.simplifier.simplify_transitive_redundanciesP()) {
            sentence = com.cyc.cycjava.cycl.simplifier.simplify_transitive_redundancies(sentence, UNPROVIDED);
        }
        return sentence;
    }

    public static SubLObject simplify_cycl_sentence(SubLObject sentence, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym8$CYC_VAR_);
        }
        sentence = simplify_special_cases(sentence);
        sentence = simplify_cycl_sentence_int(sentence, varP);
        if (NIL != simplify_transitive_redundanciesP()) {
            sentence = simplify_transitive_redundancies(sentence, UNPROVIDED);
        }
        return sentence;
    }

    /**
     * Like @xref simplify-cycl-sentence, but only does syntactic simplification.
     */
    @LispMethod(comment = "Like @xref simplify-cycl-sentence, but only does syntactic simplification.")
    public static final SubLObject simplify_cycl_sentence_syntax_alt(SubLObject sentence, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym6$CYC_VAR_);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $simplify_using_semanticsP$.currentBinding(thread);
                    try {
                        $simplify_using_semanticsP$.bind(NIL, thread);
                        result = com.cyc.cycjava.cycl.simplifier.simplify_cycl_sentence(sentence, varP);
                    } finally {
                        $simplify_using_semanticsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Like @xref simplify-cycl-sentence, but only does syntactic simplification.
     */
    @LispMethod(comment = "Like @xref simplify-cycl-sentence, but only does syntactic simplification.")
    public static SubLObject simplify_cycl_sentence_syntax(final SubLObject sentence, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym8$CYC_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$simplify_using_semanticsP$.currentBinding(thread);
        try {
            czer_vars.$simplify_using_semanticsP$.bind(NIL, thread);
            result = simplify_cycl_sentence(sentence, varP);
        } finally {
            czer_vars.$simplify_using_semanticsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject simplify_cycl_sentence_int_alt(SubLObject sentence, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym6$CYC_VAR_);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = sentence;
                if (NIL == $simplify_sentenceP$.getDynamicValue(thread)) {
                } else {
                    if ($$True == sentence) {
                    } else {
                        if ($$False == sentence) {
                        } else {
                            if (NIL != subl_escape_p(sentence)) {
                            } else {
                                if (NIL != cycl_grammar.fast_cycl_quoted_term_p(sentence)) {
                                } else {
                                    if (NIL != funcall(varP, sentence)) {
                                    } else {
                                        if (NIL != assertion_handles.assertion_p(sentence)) {
                                        } else {
                                            if (sentence.isAtom()) {
                                                el_error(FOUR_INTEGER, $str_alt10$_S_is_not_well_formed_, sentence, UNPROVIDED, UNPROVIDED);
                                                wff.note_wff_violation(list($INVALID_SENTENCE, sentence, $mt$.getDynamicValue(thread)));
                                            } else {
                                                if (NIL != el_negation_p(sentence)) {
                                                    {
                                                        SubLObject seqvar = sequence_var(sentence, UNPROVIDED);
                                                        SubLObject sub_sentence = NIL;
                                                        {
                                                            SubLObject _prev_bind_0 = $within_negationP$.currentBinding(thread);
                                                            try {
                                                                $within_negationP$.bind(makeBoolean(NIL == $within_negationP$.getDynamicValue(thread)), thread);
                                                                sub_sentence = com.cyc.cycjava.cycl.simplifier.simplify_cycl_sentence_int(cycl_utilities.sentence_arg1(sentence, UNPROVIDED), varP);
                                                            } finally {
                                                                $within_negationP$.rebind(_prev_bind_0, thread);
                                                            }
                                                        }
                                                        result = maybe_add_sequence_var_to_end(seqvar, com.cyc.cycjava.cycl.simplifier.simplify_cycl_negation(make_unary_formula(cycl_utilities.sentence_arg0(sentence), sub_sentence), varP));
                                                    }
                                                } else {
                                                    if (NIL != el_conjunction_p(sentence)) {
                                                        if ((NIL != formula_arityE(sentence, ZERO_INTEGER, $IGNORE)) && (NIL != formula_arityE(sentence, ONE_INTEGER, $REGULARIZE))) {
                                                            result = sentence;
                                                        } else {
                                                            {
                                                                SubLObject _prev_bind_0 = at_vars.$within_conjunctionP$.currentBinding(thread);
                                                                SubLObject _prev_bind_1 = at_vars.$within_negated_conjunctionP$.currentBinding(thread);
                                                                try {
                                                                    at_vars.$within_conjunctionP$.bind(T, thread);
                                                                    at_vars.$within_negated_conjunctionP$.bind($within_negationP$.getDynamicValue(thread), thread);
                                                                    result = com.cyc.cycjava.cycl.simplifier.simplify_cycl_conjunction(map_formula_args(symbol_function(SIMPLIFY_CYCL_SENTENCE_INT), sentence, UNPROVIDED), varP);
                                                                } finally {
                                                                    at_vars.$within_negated_conjunctionP$.rebind(_prev_bind_1, thread);
                                                                    at_vars.$within_conjunctionP$.rebind(_prev_bind_0, thread);
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        if (NIL != el_disjunction_p(sentence)) {
                                                            if ((NIL != formula_arityE(sentence, ZERO_INTEGER, $IGNORE)) && (NIL != formula_arityE(sentence, ONE_INTEGER, $REGULARIZE))) {
                                                                result = sentence;
                                                            } else {
                                                                {
                                                                    SubLObject _prev_bind_0 = at_vars.$within_disjunctionP$.currentBinding(thread);
                                                                    SubLObject _prev_bind_1 = at_vars.$within_negated_disjunctionP$.currentBinding(thread);
                                                                    try {
                                                                        at_vars.$within_disjunctionP$.bind(T, thread);
                                                                        at_vars.$within_negated_disjunctionP$.bind($within_negationP$.getDynamicValue(thread), thread);
                                                                        result = com.cyc.cycjava.cycl.simplifier.simplify_cycl_disjunction(map_formula_args(symbol_function(SIMPLIFY_CYCL_SENTENCE_INT), sentence, UNPROVIDED), varP);
                                                                    } finally {
                                                                        at_vars.$within_negated_disjunctionP$.rebind(_prev_bind_1, thread);
                                                                        at_vars.$within_disjunctionP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            if (NIL != el_implication_p(sentence)) {
                                                                {
                                                                    SubLObject seqvar = sequence_var(sentence, UNPROVIDED);
                                                                    SubLObject antecedent = NIL;
                                                                    SubLObject consequent = NIL;
                                                                    {
                                                                        SubLObject _prev_bind_0 = at_vars.$within_disjunctionP$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1 = at_vars.$within_negated_disjunctionP$.currentBinding(thread);
                                                                        try {
                                                                            at_vars.$within_disjunctionP$.bind(T, thread);
                                                                            at_vars.$within_negated_disjunctionP$.bind($within_negationP$.getDynamicValue(thread), thread);
                                                                            {
                                                                                SubLObject _prev_bind_0_1 = $within_negationP$.currentBinding(thread);
                                                                                try {
                                                                                    $within_negationP$.bind(makeBoolean(NIL == $within_negationP$.getDynamicValue(thread)), thread);
                                                                                    antecedent = com.cyc.cycjava.cycl.simplifier.simplify_cycl_sentence_int(cycl_utilities.sentence_arg1(sentence, UNPROVIDED), varP);
                                                                                } finally {
                                                                                    $within_negationP$.rebind(_prev_bind_0_1, thread);
                                                                                }
                                                                            }
                                                                            consequent = com.cyc.cycjava.cycl.simplifier.simplify_cycl_sentence_int(cycl_utilities.sentence_arg2(sentence, UNPROVIDED), varP);
                                                                        } finally {
                                                                            at_vars.$within_negated_disjunctionP$.rebind(_prev_bind_1, thread);
                                                                            at_vars.$within_disjunctionP$.rebind(_prev_bind_0, thread);
                                                                        }
                                                                    }
                                                                    result = maybe_add_sequence_var_to_end(seqvar, com.cyc.cycjava.cycl.simplifier.simplify_cycl_implication(make_binary_formula(cycl_utilities.sentence_arg0(sentence), antecedent, consequent), varP));
                                                                }
                                                            } else {
                                                                if (NIL != el_exception_p(sentence)) {
                                                                    result = com.cyc.cycjava.cycl.simplifier.simplify_exception(sentence, varP);
                                                                } else {
                                                                    if (NIL != el_universal_p(sentence)) {
                                                                        result = com.cyc.cycjava.cycl.simplifier.simplify_cycl_universal(make_regularly_quantified_sentence(sentence_quantifier(sentence), quantified_var(sentence), com.cyc.cycjava.cycl.simplifier.simplify_cycl_sentence_int(quantified_sub_sentence(sentence), varP)));
                                                                    } else {
                                                                        if (NIL != el_existential_p(sentence)) {
                                                                            result = com.cyc.cycjava.cycl.simplifier.simplify_cycl_existential(make_regularly_quantified_sentence(sentence_quantifier(sentence), quantified_var(sentence), com.cyc.cycjava.cycl.simplifier.simplify_cycl_sentence_int(quantified_sub_sentence(sentence), UNPROVIDED)));
                                                                        } else {
                                                                            if (NIL != el_bounded_existential_p(sentence)) {
                                                                                result = make_bounded_existential(sentence_quantifier(sentence), existential_bound(sentence), quantified_var(sentence), com.cyc.cycjava.cycl.simplifier.simplify_cycl_sentence_int(quantified_sub_sentence(sentence), varP));
                                                                            } else {
                                                                                if (NIL != atomic_sentenceP(sentence)) {
                                                                                    result = com.cyc.cycjava.cycl.simplifier.simplify_cycl_literal(sentence, varP);
                                                                                } else {
                                                                                    if (NIL == $simplify_using_semanticsP$.getDynamicValue(thread)) {
                                                                                    } else {
                                                                                        if (NIL != at_utilities.formula_denoting_functionP(sentence, UNPROVIDED)) {
                                                                                            result = com.cyc.cycjava.cycl.simplifier.simplify_cycl_relation(sentence);
                                                                                        } else {
                                                                                            if (NIL != term.unreified_skolem_termP(sentence)) {
                                                                                                result = com.cyc.cycjava.cycl.simplifier.simplify_cycl_relation(sentence);
                                                                                            } else {
                                                                                                if (NIL != relation_expressionP(sentence)) {
                                                                                                    if (NIL != wff_vars.$within_wffP$.getDynamicValue(thread)) {
                                                                                                        wff.note_wff_violation(list($INVALID_SENTENCE, sentence, $mt$.getDynamicValue(thread)));
                                                                                                    }
                                                                                                    thread.resetMultipleValues();
                                                                                                    {
                                                                                                        SubLObject simplified_sentence = com.cyc.cycjava.cycl.simplifier.simplify_cycl_relation(sentence);
                                                                                                        SubLObject changedP = thread.secondMultipleValue();
                                                                                                        thread.resetMultipleValues();
                                                                                                        if (NIL != changedP) {
                                                                                                            result = com.cyc.cycjava.cycl.simplifier.simplify_cycl_sentence_int(simplified_sentence, UNPROVIDED);
                                                                                                        } else {
                                                                                                            result = simplified_sentence;
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    if (NIL != wff_vars.$within_wffP$.getDynamicValue(thread)) {
                                                                                                        wff.note_wff_violation(list($INVALID_SENTENCE, sentence, $mt$.getDynamicValue(thread)));
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
                return result;
            }
        }
    }

    public static SubLObject simplify_cycl_sentence_int(final SubLObject sentence, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym8$CYC_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = sentence;
        if (NIL != czer_vars.$simplify_sentenceP$.getDynamicValue(thread)) {
            if (!$$True.eql(sentence)) {
                if (!$$False.eql(sentence)) {
                    if (NIL == subl_escape_p(sentence)) {
                        if (NIL == cycl_grammar.fast_cycl_quoted_term_p(sentence)) {
                            if (NIL == funcall(varP, sentence)) {
                                if (NIL == assertion_handles.assertion_p(sentence)) {
                                    if (sentence.isAtom()) {
                                        el_error(FOUR_INTEGER, $str14$_S_is_not_well_formed_, sentence, UNPROVIDED, UNPROVIDED);
                                        wff.note_wff_violation(list($INVALID_SENTENCE, sentence, mt_relevance_macros.$mt$.getDynamicValue(thread)));
                                    } else
                                        if (NIL != el_negation_p(sentence)) {
                                            final SubLObject seqvar = sequence_var(sentence, UNPROVIDED);
                                            SubLObject sub_sentence = NIL;
                                            final SubLObject _prev_bind_0 = czer_vars.$within_negationP$.currentBinding(thread);
                                            try {
                                                czer_vars.$within_negationP$.bind(makeBoolean(NIL == czer_vars.$within_negationP$.getDynamicValue(thread)), thread);
                                                sub_sentence = simplify_cycl_sentence_int(cycl_utilities.sentence_arg1(sentence, UNPROVIDED), varP);
                                            } finally {
                                                czer_vars.$within_negationP$.rebind(_prev_bind_0, thread);
                                            }
                                            result = maybe_add_sequence_var_to_end(seqvar, simplify_cycl_negation(make_unary_formula(cycl_utilities.sentence_arg0(sentence), sub_sentence), varP));
                                        } else
                                            if (NIL != el_conjunction_p(sentence)) {
                                                if ((NIL != formula_arityE(sentence, ZERO_INTEGER, $IGNORE)) && (NIL != formula_arityE(sentence, ONE_INTEGER, $REGULARIZE))) {
                                                    result = sentence;
                                                } else {
                                                    final SubLObject _prev_bind_2 = at_vars.$within_conjunctionP$.currentBinding(thread);
                                                    final SubLObject _prev_bind_3 = at_vars.$within_negated_conjunctionP$.currentBinding(thread);
                                                    try {
                                                        at_vars.$within_conjunctionP$.bind(T, thread);
                                                        at_vars.$within_negated_conjunctionP$.bind(czer_vars.$within_negationP$.getDynamicValue(thread), thread);
                                                        result = simplify_cycl_conjunction(map_formula_args(symbol_function(SIMPLIFY_CYCL_SENTENCE_INT), sentence, UNPROVIDED), varP);
                                                    } finally {
                                                        at_vars.$within_negated_conjunctionP$.rebind(_prev_bind_3, thread);
                                                        at_vars.$within_conjunctionP$.rebind(_prev_bind_2, thread);
                                                    }
                                                }
                                            } else
                                                if (NIL != el_disjunction_p(sentence)) {
                                                    if ((NIL != formula_arityE(sentence, ZERO_INTEGER, $IGNORE)) && (NIL != formula_arityE(sentence, ONE_INTEGER, $REGULARIZE))) {
                                                        result = sentence;
                                                    } else {
                                                        final SubLObject _prev_bind_2 = at_vars.$within_disjunctionP$.currentBinding(thread);
                                                        final SubLObject _prev_bind_3 = at_vars.$within_negated_disjunctionP$.currentBinding(thread);
                                                        try {
                                                            at_vars.$within_disjunctionP$.bind(T, thread);
                                                            at_vars.$within_negated_disjunctionP$.bind(czer_vars.$within_negationP$.getDynamicValue(thread), thread);
                                                            result = simplify_cycl_disjunction(map_formula_args(symbol_function(SIMPLIFY_CYCL_SENTENCE_INT), sentence, UNPROVIDED), varP);
                                                        } finally {
                                                            at_vars.$within_negated_disjunctionP$.rebind(_prev_bind_3, thread);
                                                            at_vars.$within_disjunctionP$.rebind(_prev_bind_2, thread);
                                                        }
                                                    }
                                                } else
                                                    if (NIL != el_implication_p(sentence)) {
                                                        final SubLObject seqvar = sequence_var(sentence, UNPROVIDED);
                                                        SubLObject antecedent = NIL;
                                                        SubLObject consequent = NIL;
                                                        final SubLObject _prev_bind_4 = at_vars.$within_disjunctionP$.currentBinding(thread);
                                                        final SubLObject _prev_bind_5 = at_vars.$within_negated_disjunctionP$.currentBinding(thread);
                                                        try {
                                                            at_vars.$within_disjunctionP$.bind(T, thread);
                                                            at_vars.$within_negated_disjunctionP$.bind(czer_vars.$within_negationP$.getDynamicValue(thread), thread);
                                                            final SubLObject _prev_bind_0_$2 = czer_vars.$within_negationP$.currentBinding(thread);
                                                            try {
                                                                czer_vars.$within_negationP$.bind(makeBoolean(NIL == czer_vars.$within_negationP$.getDynamicValue(thread)), thread);
                                                                antecedent = simplify_cycl_sentence_int(cycl_utilities.sentence_arg1(sentence, UNPROVIDED), varP);
                                                            } finally {
                                                                czer_vars.$within_negationP$.rebind(_prev_bind_0_$2, thread);
                                                            }
                                                            consequent = simplify_cycl_sentence_int(cycl_utilities.sentence_arg2(sentence, UNPROVIDED), varP);
                                                        } finally {
                                                            at_vars.$within_negated_disjunctionP$.rebind(_prev_bind_5, thread);
                                                            at_vars.$within_disjunctionP$.rebind(_prev_bind_4, thread);
                                                        }
                                                        result = maybe_add_sequence_var_to_end(seqvar, simplify_cycl_implication(make_binary_formula(cycl_utilities.sentence_arg0(sentence), antecedent, consequent), varP));
                                                    } else
                                                        if (NIL != el_exception_p(sentence)) {
                                                            result = simplify_exception(sentence, varP);
                                                        } else
                                                            if (NIL != el_universal_p(sentence)) {
                                                                result = simplify_cycl_universal(make_regularly_quantified_sentence(sentence_quantifier(sentence), quantified_var(sentence), simplify_cycl_sentence_int(quantified_sub_sentence(sentence), varP)));
                                                            } else
                                                                if (NIL != el_existential_p(sentence)) {
                                                                    result = simplify_cycl_existential(make_regularly_quantified_sentence(sentence_quantifier(sentence), quantified_var(sentence), simplify_cycl_sentence_int(quantified_sub_sentence(sentence), UNPROVIDED)));
                                                                } else
                                                                    if ((NIL != el_multi_existential_p(sentence)) || (NIL != el_multi_universal_p(sentence))) {
                                                                        result = simplify_cycl_multiply_quantified_sentence(make_multiply_quantified_sentence(sentence_quantifier(sentence), quantified_var_list(sentence), simplify_cycl_sentence_int(quantified_sub_sentence(sentence), UNPROVIDED)));
                                                                    } else
                                                                        if (NIL != el_bounded_existential_p(sentence)) {
                                                                            result = make_bounded_existential(sentence_quantifier(sentence), existential_bound(sentence), quantified_var(sentence), simplify_cycl_sentence_int(quantified_sub_sentence(sentence), varP));
                                                                        } else
                                                                            if (NIL != atomic_sentenceP(sentence)) {
                                                                                result = simplify_cycl_literal(sentence, varP);
                                                                            } else
                                                                                if (NIL != czer_vars.$simplify_using_semanticsP$.getDynamicValue(thread)) {
                                                                                    if (NIL != at_utilities.formula_denoting_functionP(sentence, UNPROVIDED)) {
                                                                                        result = simplify_cycl_relation(sentence);
                                                                                    } else
                                                                                        if (NIL != term.unreified_skolem_termP(sentence)) {
                                                                                            result = simplify_cycl_relation(sentence);
                                                                                        } else
                                                                                            if (NIL != relation_expressionP(sentence)) {
                                                                                                if (NIL != wff_vars.$within_wffP$.getDynamicValue(thread)) {
                                                                                                    wff.note_wff_violation(list($INVALID_SENTENCE, sentence, mt_relevance_macros.$mt$.getDynamicValue(thread)));
                                                                                                }
                                                                                                thread.resetMultipleValues();
                                                                                                final SubLObject simplified_sentence = simplify_cycl_relation(sentence);
                                                                                                final SubLObject changedP = thread.secondMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                if (NIL != changedP) {
                                                                                                    result = simplify_cycl_sentence_int(simplified_sentence, UNPROVIDED);
                                                                                                } else {
                                                                                                    result = simplified_sentence;
                                                                                                }
                                                                                            } else
                                                                                                if (NIL != wff_vars.$within_wffP$.getDynamicValue(thread)) {
                                                                                                    wff.note_wff_violation(list($INVALID_SENTENCE, sentence, mt_relevance_macros.$mt$.getDynamicValue(thread)));
                                                                                                }



                                                                                }











                                }
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    public static final SubLObject simplify_true_sentence_alt(SubLObject sentence, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym6$CYC_VAR_);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sub_sentence = cycl_utilities.sentence_arg1(sentence, UNPROVIDED);
                if (NIL != subl_escape_p(sentence)) {
                    return sentence;
                } else {
                    if (NIL != cycl_grammar.fast_cycl_quoted_term_p(sentence)) {
                        return sentence;
                    } else {
                        if (NIL != funcall(varP, sub_sentence)) {
                            return sentence;
                        } else {
                            if ((NIL != possibly_sentence_p(sub_sentence)) && (NIL != funcall(varP, cycl_utilities.sentence_arg0(sub_sentence)))) {
                                return make_unary_formula(cycl_utilities.sentence_arg0(sentence), com.cyc.cycjava.cycl.simplifier.simplify_cycl_sentence_int(sub_sentence, varP));
                            } else {
                                if ((NIL != possibly_sentence_p(sub_sentence)) && (NIL != true_sentenceP(sub_sentence))) {
                                    return com.cyc.cycjava.cycl.simplifier.simplify_cycl_sentence_int(sub_sentence, varP);
                                } else {
                                    if (NIL != $simplify_true_sentence_awayP$.getDynamicValue(thread)) {
                                        return com.cyc.cycjava.cycl.simplifier.simplify_cycl_sentence_int(sub_sentence, varP);
                                    } else {
                                        if ((NIL != within_disjunctionP()) || ((NIL != within_askP()) && (NIL != within_conjunctionP()))) {
                                            return make_unary_formula(cycl_utilities.sentence_arg0(sentence), com.cyc.cycjava.cycl.simplifier.simplify_cycl_sentence_int(sub_sentence, varP));
                                        } else {
                                            if (((NIL != within_askP()) && (NIL != within_negationP())) && (NIL != el_general_existential_p(sub_sentence))) {
                                                return make_unary_formula(cycl_utilities.sentence_arg0(sentence), com.cyc.cycjava.cycl.simplifier.simplify_cycl_sentence_int(sub_sentence, varP));
                                            } else {
                                                if (((NIL != within_askP()) && (NIL != el_universal_p(sub_sentence))) && (NIL == within_negationP())) {
                                                    return make_unary_formula(cycl_utilities.sentence_arg0(sentence), com.cyc.cycjava.cycl.simplifier.simplify_cycl_sentence_int(sub_sentence, varP));
                                                } else {
                                                    if ((NIL != within_askP()) && (NIL != el_universal_negation_p(sub_sentence))) {
                                                        return make_unary_formula(cycl_utilities.sentence_arg0(sentence), com.cyc.cycjava.cycl.simplifier.simplify_cycl_sentence_int(sub_sentence, varP));
                                                    } else {
                                                        if (NIL != sub_sentence) {
                                                            return com.cyc.cycjava.cycl.simplifier.simplify_cycl_sentence_int(sub_sentence, varP);
                                                        } else {
                                                            return sentence;
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

    public static SubLObject simplify_true_sentence(final SubLObject sentence, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym8$CYC_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sub_sentence = cycl_utilities.sentence_arg1(sentence, UNPROVIDED);
        if (NIL != subl_escape_p(sentence)) {
            return sentence;
        }
        if (NIL != cycl_grammar.fast_cycl_quoted_term_p(sentence)) {
            return sentence;
        }
        if (NIL != funcall(varP, sub_sentence)) {
            return sentence;
        }
        if ((NIL != possibly_sentence_p(sub_sentence)) && (NIL != funcall(varP, cycl_utilities.sentence_arg0(sub_sentence)))) {
            return make_unary_formula(cycl_utilities.sentence_arg0(sentence), simplify_cycl_sentence_int(sub_sentence, varP));
        }
        if ((NIL != possibly_sentence_p(sub_sentence)) && (NIL != czer_utilities.true_sentenceP(sub_sentence))) {
            return simplify_cycl_sentence_int(sub_sentence, varP);
        }
        if (NIL != czer_vars.$simplify_true_sentence_awayP$.getDynamicValue(thread)) {
            return simplify_cycl_sentence_int(sub_sentence, varP);
        }
        if ((NIL != czer_utilities.within_disjunctionP()) || ((NIL != within_askP()) && (NIL != czer_utilities.within_conjunctionP()))) {
            return make_unary_formula(cycl_utilities.sentence_arg0(sentence), simplify_cycl_sentence_int(sub_sentence, varP));
        }
        if (((NIL != within_askP()) && (NIL != czer_utilities.within_negationP())) && (NIL != el_general_existential_p(sub_sentence))) {
            return make_unary_formula(cycl_utilities.sentence_arg0(sentence), simplify_cycl_sentence_int(sub_sentence, varP));
        }
        if (((NIL != within_askP()) && (NIL != el_universal_p(sub_sentence))) && (NIL == czer_utilities.within_negationP())) {
            return make_unary_formula(cycl_utilities.sentence_arg0(sentence), simplify_cycl_sentence_int(sub_sentence, varP));
        }
        if ((NIL != within_askP()) && (NIL != el_universal_negation_p(sub_sentence))) {
            return make_unary_formula(cycl_utilities.sentence_arg0(sentence), simplify_cycl_sentence_int(sub_sentence, varP));
        }
        if (NIL != sub_sentence) {
            return simplify_cycl_sentence_int(sub_sentence, varP);
        }
        return sentence;
    }

    public static final SubLObject simplify_exception_alt(SubLObject sentence, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym6$CYC_VAR_);
        }
        {
            SubLObject except_op = cycl_utilities.sentence_arg0(sentence);
            SubLObject antecedent = cycl_utilities.sentence_arg1(sentence, UNPROVIDED);
            SubLObject consequent = com.cyc.cycjava.cycl.simplifier.simplify_cycl_sentence_int(cycl_utilities.sentence_arg2(sentence, UNPROVIDED), varP);
            return make_binary_formula(except_op, antecedent, consequent);
        }
    }

    public static SubLObject simplify_exception(final SubLObject sentence, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym8$CYC_VAR_);
        }
        final SubLObject except_op = cycl_utilities.sentence_arg0(sentence);
        final SubLObject antecedent = cycl_utilities.sentence_arg1(sentence, UNPROVIDED);
        final SubLObject consequent = simplify_cycl_sentence_int(cycl_utilities.sentence_arg2(sentence, UNPROVIDED), varP);
        return make_binary_formula(except_op, antecedent, consequent);
    }

    /**
     * Like @xref simplify-cycl-literal, but only does syntactic simplification.
     */
    @LispMethod(comment = "Like @xref simplify-cycl-literal, but only does syntactic simplification.")
    public static final SubLObject simplify_cycl_literal_syntax_alt(SubLObject literal, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym6$CYC_VAR_);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $simplify_using_semanticsP$.currentBinding(thread);
                    try {
                        $simplify_using_semanticsP$.bind(NIL, thread);
                        result = com.cyc.cycjava.cycl.simplifier.simplify_cycl_literal(literal, varP);
                    } finally {
                        $simplify_using_semanticsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Like @xref simplify-cycl-literal, but only does syntactic simplification.
     */
    @LispMethod(comment = "Like @xref simplify-cycl-literal, but only does syntactic simplification.")
    public static SubLObject simplify_cycl_literal_syntax(final SubLObject literal, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym8$CYC_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$simplify_using_semanticsP$.currentBinding(thread);
        try {
            czer_vars.$simplify_using_semanticsP$.bind(NIL, thread);
            result = simplify_cycl_literal(literal, varP);
        } finally {
            czer_vars.$simplify_using_semanticsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject simplify_cycl_literal_alt(SubLObject literal, SubLObject var_func) {
        if (var_func == UNPROVIDED) {
            var_func = symbol_function($sym6$CYC_VAR_);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != subl_escape_p(literal)) {
                return literal;
            } else {
                if (NIL != cycl_grammar.fast_cycl_quoted_term_p(literal)) {
                    return literal;
                } else {
                    if (NIL != true_sentenceP(literal)) {
                        return com.cyc.cycjava.cycl.simplifier.simplify_true_sentence(literal, var_func);
                    } else {
                        if (NIL != $recanonicalizingP$.getDynamicValue(thread)) {
                            return literal;
                        } else {
                            if (NIL != ist_sentence_p(literal)) {
                                {
                                    SubLObject result = com.cyc.cycjava.cycl.simplifier.simplify_ist_sentence(literal);
                                    if (!result.equal(literal)) {
                                        return com.cyc.cycjava.cycl.simplifier.simplify_cycl_sentence(result, UNPROVIDED);
                                    }
                                }
                            }
                            if (NIL == $simplify_literalP$.getDynamicValue(thread)) {
                                return literal;
                            }
                            if (NIL != kappa_asent_p(literal)) {
                                {
                                    SubLObject result = com.cyc.cycjava.cycl.simplifier.simplify_kappa_asent(literal);
                                    if (!result.equal(literal)) {
                                        return com.cyc.cycjava.cycl.simplifier.simplify_cycl_sentence(result, UNPROVIDED);
                                    }
                                }
                            }
                            return com.cyc.cycjava.cycl.simplifier.simplify_cycl_literal_int(literal, var_func);
                        }
                    }
                }
            }
        }
    }

    public static SubLObject simplify_cycl_literal(SubLObject literal, SubLObject var_func) {
        if (var_func == UNPROVIDED) {
            var_func = symbol_function($sym8$CYC_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != subl_escape_p(literal)) {
            return literal;
        }
        if (NIL != cycl_grammar.fast_cycl_quoted_term_p(literal)) {
            return literal;
        }
        if (NIL != czer_utilities.true_sentenceP(literal)) {
            return simplify_true_sentence(literal, var_func);
        }
        if (NIL != czer_vars.$recanonicalizingP$.getDynamicValue(thread)) {
            return literal;
        }
        if (NIL != ist_sentence_p(literal, UNPROVIDED)) {
            final SubLObject simplified_literal = (NIL != $simplify_cycl_sentence_and_subsentencesP$.getDynamicValue(thread)) ? make_ist_sentence(designated_mt(literal), fold_equals(designated_sentence(literal))) : literal;
            final SubLObject result = simplify_ist_sentence(simplified_literal);
            if (!result.equal(literal)) {
                return simplify_cycl_sentence(result, UNPROVIDED);
            }
        }
        if (NIL == czer_vars.$simplify_literalP$.getDynamicValue(thread)) {
            return literal;
        }
        if (NIL != kappa_asent_p(literal)) {
            final SubLObject result2 = simplify_kappa_asent(literal);
            if (!result2.equal(literal)) {
                return simplify_cycl_sentence(result2, UNPROVIDED);
            }
        }
        if (NIL != $simplify_cycl_sentence_and_subsentencesP$.getDynamicValue(thread)) {
            SubLObject argnum = ZERO_INTEGER;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(literal, $IGNORE);
            SubLObject arg = NIL;
            arg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                argnum = add(argnum, ONE_INTEGER);
                final SubLObject simplified_arg = simplify_cycl_sentence(arg, var_func);
                if (!arg.equal(simplified_arg)) {
                    literal = list_utilities.replace_nth(argnum, simplified_arg, literal);
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            } 
        }
        return simplify_cycl_literal_int(literal, var_func);
    }

    public static final SubLObject simplify_cycl_literal_int_alt(SubLObject literal, SubLObject var_func) {
        if (var_func == UNPROVIDED) {
            var_func = symbol_function($sym6$CYC_VAR_);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                if (NIL != $simplify_using_semanticsP$.getDynamicValue(thread)) {
                    {
                        SubLObject _prev_bind_0 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                        SubLObject _prev_bind_1 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                        SubLObject _prev_bind_2 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                        try {
                            wff_utilities.$check_wff_semanticsP$.bind(T, thread);
                            wff_utilities.$check_var_typesP$.bind(NIL, thread);
                            wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
                            if ((((NIL != within_assertP()) || (NIL != $trying_to_simplify_non_wff_into_wffP$.getDynamicValue(thread))) || (NIL == $simplify_non_wff_literalP$.getDynamicValue(thread))) || (NIL != wff.semantically_wf_literalP(literal, $mt$.getDynamicValue(thread)))) {
                                result = com.cyc.cycjava.cycl.simplifier.simplify_distributing_out_args(com.cyc.cycjava.cycl.simplifier.simplify_cycl_literal_terms(literal, var_func));
                            } else {
                                if (NIL != $try_to_simplify_non_wff_into_wffP$.getDynamicValue(thread)) {
                                    {
                                        SubLObject simplified_literal = com.cyc.cycjava.cycl.simplifier.simplify_distributing_out_args(com.cyc.cycjava.cycl.simplifier.simplify_cycl_literal_terms(literal, var_func));
                                        if (NIL != wff.semantically_wf_literalP(simplified_literal, $mt$.getDynamicValue(thread))) {
                                            result = simplified_literal;
                                        } else {
                                            result = $$False;
                                        }
                                    }
                                } else {
                                    result = $$False;
                                }
                            }
                        } finally {
                            wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_2, thread);
                            wff_utilities.$check_var_typesP$.rebind(_prev_bind_1, thread);
                            wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    result = com.cyc.cycjava.cycl.simplifier.simplify_cycl_literal_terms(literal, UNPROVIDED);
                }
                return result;
            }
        }
    }

    public static SubLObject simplify_cycl_literal_int(final SubLObject literal, SubLObject var_func) {
        if (var_func == UNPROVIDED) {
            var_func = symbol_function($sym8$CYC_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if (NIL != czer_vars.$simplify_using_semanticsP$.getDynamicValue(thread)) {
            final SubLObject _prev_bind_0 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = wff_utilities.$check_var_typesP$.currentBinding(thread);
            final SubLObject _prev_bind_3 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
            try {
                wff_utilities.$check_wff_semanticsP$.bind(T, thread);
                wff_utilities.$check_var_typesP$.bind(NIL, thread);
                wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
                if (((((NIL != within_assertP()) || (NIL != czer_vars.$trying_to_simplify_non_wff_into_wffP$.getDynamicValue(thread))) || (NIL == czer_vars.$simplify_non_wff_literalP$.getDynamicValue(thread))) || (NIL != wff.semantically_wf_literalP(literal, mt_relevance_macros.$mt$.getDynamicValue(thread)))) || (NIL == closedP(literal, UNPROVIDED))) {
                    result = simplify_distributing_out_args(simplify_cycl_literal_terms(literal, var_func));
                } else
                    if (NIL != czer_vars.$try_to_simplify_non_wff_into_wffP$.getDynamicValue(thread)) {
                        final SubLObject simplified_literal = simplify_distributing_out_args(simplify_cycl_literal_terms(literal, var_func));
                        if (NIL != wff.semantically_wf_literalP(simplified_literal, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
                            result = simplified_literal;
                        } else {
                            result = $$False;
                        }
                    } else {
                        result = $$False;
                    }

            } finally {
                wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_3, thread);
                wff_utilities.$check_var_typesP$.rebind(_prev_bind_2, thread);
                wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_0, thread);
            }
        } else {
            result = simplify_cycl_literal_terms(literal, UNPROVIDED);
        }
        return result;
    }

    public static final SubLObject distributes_out_of_argP_alt(SubLObject reln, SubLObject pred, SubLObject arg, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(pred)) {
            return kb_mapping_utilities.tuple_holds_in_relevant_mts(make_ternary_formula($$distributesOutOfArg, reln, pred, arg), mt, TWO_INTEGER, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject distributes_out_of_argP(final SubLObject reln, final SubLObject pred, final SubLObject arg, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(pred)) {
            return kb_mapping_utilities.tuple_holds_in_relevant_mts(make_ternary_formula($$distributesOutOfArg, reln, pred, arg), mt, TWO_INTEGER, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject simplify_distributing_out_args_alt(SubLObject literal) {
        {
            SubLObject pred = literal_arg0(literal, UNPROVIDED);
            SubLObject arg = ZERO_INTEGER;
            SubLObject result = NIL;
            if (NIL == result) {
                {
                    SubLObject csome_list_var = literal_args(literal, UNPROVIDED);
                    SubLObject v_term = NIL;
                    for (v_term = csome_list_var.first(); !((NIL != result) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , v_term = csome_list_var.first()) {
                        arg = add(arg, ONE_INTEGER);
                        if (NIL != el_relation_expressionP(v_term)) {
                            {
                                SubLObject reln = cycl_utilities.formula_arg0(v_term);
                                if (NIL != com.cyc.cycjava.cycl.simplifier.distributes_out_of_argP(reln, pred, arg, UNPROVIDED)) {
                                    {
                                        SubLObject literals = NIL;
                                        SubLObject sentence = NIL;
                                        SubLObject cdolist_list_var = cycl_utilities.formula_args(v_term, UNPROVIDED);
                                        SubLObject sub_arg = NIL;
                                        for (sub_arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sub_arg = cdolist_list_var.first()) {
                                            literals = cons(replace_nth(arg, sub_arg, literal), literals);
                                        }
                                        sentence = make_el_formula(reln, reverse(literals), UNPROVIDED);
                                        if (NIL != czer_main.canon_wffP(sentence, UNPROVIDED)) {
                                            result = sentence;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (NIL != result) {
                return com.cyc.cycjava.cycl.simplifier.simplify_cycl_sentence_int(result, UNPROVIDED);
            } else {
                return literal;
            }
        }
    }

    public static SubLObject simplify_distributing_out_args(final SubLObject literal) {
        final SubLObject pred = literal_arg0(literal, UNPROVIDED);
        SubLObject arg = ZERO_INTEGER;
        SubLObject result = NIL;
        if (NIL == result) {
            SubLObject csome_list_var = literal_args(literal, UNPROVIDED);
            SubLObject v_term = NIL;
            v_term = csome_list_var.first();
            while ((NIL == result) && (NIL != csome_list_var)) {
                arg = add(arg, ONE_INTEGER);
                if (NIL != el_relation_expressionP(v_term)) {
                    final SubLObject reln = cycl_utilities.formula_arg0(v_term);
                    if (NIL != distributes_out_of_argP(reln, pred, arg, UNPROVIDED)) {
                        SubLObject literals = NIL;
                        SubLObject sentence = NIL;
                        SubLObject cdolist_list_var = cycl_utilities.formula_args(v_term, UNPROVIDED);
                        SubLObject sub_arg = NIL;
                        sub_arg = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            literals = cons(list_utilities.replace_nth(arg, sub_arg, literal), literals);
                            cdolist_list_var = cdolist_list_var.rest();
                            sub_arg = cdolist_list_var.first();
                        } 
                        sentence = make_el_formula(reln, reverse(literals), UNPROVIDED);
                        if (NIL != czer_main.canon_wffP(sentence, UNPROVIDED)) {
                            result = sentence;
                        }
                    }
                }
                csome_list_var = csome_list_var.rest();
                v_term = csome_list_var.first();
            } 
        }
        if (NIL != result) {
            return simplify_cycl_sentence_int(result, UNPROVIDED);
        }
        return literal;
    }

    public static final SubLObject simplify_cycl_literal_terms_alt(SubLObject literal, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym6$CYC_VAR_);
        }
        if (NIL != mt_designating_literalP(literal)) {
            return com.cyc.cycjava.cycl.simplifier.simplify_mt_literal_terms(literal, varP);
        } else {
            return com.cyc.cycjava.cycl.simplifier.simplify_cycl_literal_terms_int(literal, varP);
        }
    }

    public static SubLObject simplify_cycl_literal_terms(final SubLObject literal, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym8$CYC_VAR_);
        }
        if (NIL != mt_designating_literalP(literal)) {
            return simplify_mt_literal_terms(literal, varP);
        }
        return simplify_cycl_literal_terms_int(literal, varP);
    }

    public static final SubLObject simplify_mt_literal_terms_alt(SubLObject literal, SubLObject varP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt_arg = designated_mt(literal);
                SubLObject result = NIL;
                if (NIL != fort_types_interface.mtP(mt_arg)) {
                    {
                        SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $mt$.currentBinding(thread);
                        try {
                            $relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                            $mt$.bind(mt_arg, thread);
                            result = com.cyc.cycjava.cycl.simplifier.simplify_cycl_literal_terms_int(literal, varP);
                        } finally {
                            $mt$.rebind(_prev_bind_1, thread);
                            $relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    if (NIL != cycl_variables.cyc_varP(mt_arg)) {
                        if ((NIL != within_askP()) || ((NIL != within_negationP()) && (NIL != within_disjunctionP()))) {
                            {
                                SubLObject _prev_bind_0 = $simplify_literalP$.currentBinding(thread);
                                try {
                                    $simplify_literalP$.bind(NIL, thread);
                                    result = com.cyc.cycjava.cycl.simplifier.simplify_cycl_literal_terms_int(literal, varP);
                                } finally {
                                    $simplify_literalP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } else {
                            if (NIL != within_assertP()) {
                                {
                                    SubLObject mt_var = with_inference_mt_relevance_validate(mt_vars.$assertible_theory_mt_root$.getGlobalValue());
                                    {
                                        SubLObject _prev_bind_0 = $mt$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = $relevant_mt_function$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = $relevant_mts$.currentBinding(thread);
                                        try {
                                            $mt$.bind(update_inference_mt_relevance_mt(mt_var), thread);
                                            $relevant_mt_function$.bind(update_inference_mt_relevance_function(mt_var), thread);
                                            $relevant_mts$.bind(update_inference_mt_relevance_mt_list(mt_var), thread);
                                            result = com.cyc.cycjava.cycl.simplifier.simplify_cycl_literal_terms_int(literal, varP);
                                        } finally {
                                            $relevant_mts$.rebind(_prev_bind_2, thread);
                                            $relevant_mt_function$.rebind(_prev_bind_1, thread);
                                            $mt$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                            } else {
                                {
                                    SubLObject _prev_bind_0 = $simplify_literalP$.currentBinding(thread);
                                    try {
                                        $simplify_literalP$.bind(NIL, thread);
                                        result = com.cyc.cycjava.cycl.simplifier.simplify_cycl_literal_terms_int(literal, varP);
                                    } finally {
                                        $simplify_literalP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    } else {
                        result = literal;
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject simplify_mt_literal_terms(final SubLObject literal, final SubLObject varP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_arg = designated_mt(literal);
        SubLObject result = NIL;
        if (NIL != fort_types_interface.mtP(mt_arg)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                mt_relevance_macros.$mt$.bind(mt_arg, thread);
                result = simplify_cycl_literal_terms_int(literal, varP);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } else
            if (NIL != cycl_variables.cyc_varP(mt_arg)) {
                if ((NIL != within_askP()) || ((NIL != czer_utilities.within_negationP()) && (NIL != czer_utilities.within_disjunctionP()))) {
                    final SubLObject _prev_bind_0 = czer_vars.$simplify_literalP$.currentBinding(thread);
                    try {
                        czer_vars.$simplify_literalP$.bind(NIL, thread);
                        result = simplify_cycl_literal_terms_int(literal, varP);
                    } finally {
                        czer_vars.$simplify_literalP$.rebind(_prev_bind_0, thread);
                    }
                } else
                    if (NIL != within_assertP()) {
                        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_vars.$assertible_theory_mt_root$.getGlobalValue());
                        final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            result = simplify_cycl_literal_terms_int(literal, varP);
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_5, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_4, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                        }
                    } else {
                        final SubLObject _prev_bind_0 = czer_vars.$simplify_literalP$.currentBinding(thread);
                        try {
                            czer_vars.$simplify_literalP$.bind(NIL, thread);
                            result = simplify_cycl_literal_terms_int(literal, varP);
                        } finally {
                            czer_vars.$simplify_literalP$.rebind(_prev_bind_0, thread);
                        }
                    }

            } else {
                result = literal;
            }

        return result;
    }

    public static final SubLObject simplify_cycl_literal_terms_int_alt(SubLObject literal, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym6$CYC_VAR_);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt = $mt$.getDynamicValue(thread);
                SubLObject pred = literal_arg0(literal, UNPROVIDED);
                SubLObject sequence_var = sequence_var(literal, UNPROVIDED);
                SubLObject result = NIL;
                SubLObject terms = cycl_utilities.formula_terms(literal, $IGNORE);
                SubLObject list_var = NIL;
                SubLObject v_term = NIL;
                SubLObject argnum = NIL;
                for (list_var = terms, v_term = list_var.first(), argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , v_term = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
                    {
                        SubLObject _prev_bind_0 = wff_vars.$permit_keyword_variablesP$.currentBinding(thread);
                        SubLObject _prev_bind_1 = wff_vars.$permit_generic_arg_variablesP$.currentBinding(thread);
                        try {
                            wff_vars.$permit_keyword_variablesP$.bind(makeBoolean((NIL != wff_vars.$permit_keyword_variablesP$.getDynamicValue(thread)) || (NIL != arg_permits_keyword_variablesP(pred, argnum, mt))), thread);
                            wff_vars.$permit_generic_arg_variablesP$.bind(makeBoolean((NIL != wff_vars.$permit_generic_arg_variablesP$.getDynamicValue(thread)) || (NIL != arg_permits_generic_arg_variablesP(pred, argnum, mt))), thread);
                            {
                                SubLObject sentence_argP = sentence_argP(pred, argnum, mt);
                                SubLObject mal_true_sentence_argP = (NIL != sentence_argP) ? ((SubLObject) (NIL != indexed_argP(pred, argnum) ? ((SubLObject) (NIL)) : true_sentenceP(v_term))) : NIL;
                                if (NIL != mal_true_sentence_argP) {
                                    result = cons(com.cyc.cycjava.cycl.simplifier.simplify_cycl_sentence_int(cycl_utilities.formula_arg1(v_term, UNPROVIDED), varP), result);
                                } else {
                                    if (NIL != sentence_argP) {
                                        result = cons(com.cyc.cycjava.cycl.simplifier.simplify_cycl_sentence_int(v_term, varP), result);
                                    } else {
                                        result = cons(com.cyc.cycjava.cycl.simplifier.simplify_cycl_term(v_term, varP), result);
                                    }
                                }
                            }
                        } finally {
                            wff_vars.$permit_generic_arg_variablesP$.rebind(_prev_bind_1, thread);
                            wff_vars.$permit_keyword_variablesP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                result = nreverse(result);
                if (NIL != sequence_var) {
                    result = nadd_sequence_var_to_end(sequence_var, result);
                }
                return result;
            }
        }
    }

    public static SubLObject simplify_cycl_literal_terms_int(final SubLObject literal, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym8$CYC_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        final SubLObject pred = literal_arg0(literal, UNPROVIDED);
        final SubLObject sequence_var = sequence_var(literal, UNPROVIDED);
        SubLObject result = NIL;
        final SubLObject terms = cycl_utilities.formula_terms(literal, $IGNORE);
        SubLObject list_var = NIL;
        SubLObject v_term = NIL;
        SubLObject argnum = NIL;
        list_var = terms;
        v_term = list_var.first();
        for (argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , v_term = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
            final SubLObject _prev_bind_0 = wff_vars.$permit_keyword_variablesP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = wff_vars.$permit_generic_arg_variablesP$.currentBinding(thread);
            try {
                wff_vars.$permit_keyword_variablesP$.bind(makeBoolean((NIL != wff_vars.$permit_keyword_variablesP$.getDynamicValue(thread)) || (NIL != czer_utilities.arg_permits_keyword_variablesP(pred, argnum, mt))), thread);
                wff_vars.$permit_generic_arg_variablesP$.bind(makeBoolean((NIL != wff_vars.$permit_generic_arg_variablesP$.getDynamicValue(thread)) || (NIL != czer_utilities.arg_permits_generic_arg_variablesP(pred, argnum, mt))), thread);
                final SubLObject sentence_argP = czer_utilities.sentence_argP(pred, argnum, mt);
                final SubLObject mal_true_sentence_argP = (NIL != sentence_argP) ? NIL != czer_utilities.indexed_argP(pred, argnum) ? NIL : czer_utilities.true_sentenceP(v_term) : NIL;
                if (NIL != mal_true_sentence_argP) {
                    result = cons(simplify_cycl_sentence_int(cycl_utilities.formula_arg1(v_term, UNPROVIDED), varP), result);
                } else
                    if (NIL != sentence_argP) {
                        result = cons(simplify_cycl_sentence_int(v_term, varP), result);
                    } else {
                        result = cons(simplify_cycl_term(v_term, varP), result);
                    }

            } finally {
                wff_vars.$permit_generic_arg_variablesP$.rebind(_prev_bind_2, thread);
                wff_vars.$permit_keyword_variablesP$.rebind(_prev_bind_0, thread);
            }
        }
        result = nreverse(result);
        if (NIL != sequence_var) {
            result = nadd_sequence_var_to_end(sequence_var, result);
        }
        return result;
    }

    public static final SubLObject simplify_cycl_term_alt(SubLObject v_term, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym6$CYC_VAR_);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != subl_escape_p(v_term)) {
                return v_term;
            } else {
                if (NIL != cycl_grammar.fast_cycl_quoted_term_p(v_term)) {
                    return v_term;
                } else {
                    if (NIL != term.nautP(v_term, UNPROVIDED)) {
                        {
                            SubLObject functor = cycl_utilities.nat_functor(v_term);
                            SubLObject sequence_var = sequence_var(v_term, UNPROVIDED);
                            SubLObject arg = ZERO_INTEGER;
                            SubLObject new_term = NIL;
                            SubLObject terms = cycl_utilities.formula_terms(v_term, $IGNORE);
                            SubLObject cdolist_list_var = terms;
                            SubLObject subterm = NIL;
                            for (subterm = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subterm = cdolist_list_var.first()) {
                                {
                                    SubLObject sentence_argP = sentence_argP(functor, arg, $mt$.getDynamicValue(thread));
                                    SubLObject mal_true_sentence_argP = (NIL != sentence_argP) ? ((SubLObject) (NIL != indexed_argP(functor, arg) ? ((SubLObject) (NIL)) : true_sentenceP(subterm))) : NIL;
                                    if (NIL != mal_true_sentence_argP) {
                                        new_term = cons(com.cyc.cycjava.cycl.simplifier.simplify_cycl_sentence_int(cycl_utilities.formula_arg1(subterm, UNPROVIDED), varP), new_term);
                                    } else {
                                        if (NIL != sentence_argP) {
                                            new_term = cons(com.cyc.cycjava.cycl.simplifier.simplify_cycl_sentence_int(subterm, varP), new_term);
                                        } else {
                                            new_term = cons(com.cyc.cycjava.cycl.simplifier.simplify_cycl_term(subterm, varP), new_term);
                                        }
                                    }
                                }
                                arg = add(arg, ONE_INTEGER);
                            }
                            new_term = nreverse(new_term);
                            if (NIL != sequence_var) {
                                new_term = nadd_sequence_var_to_end(sequence_var, new_term);
                            }
                            return new_term;
                        }
                    } else {
                        if (NIL != relation_expressionP(v_term)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject simplified_term = com.cyc.cycjava.cycl.simplifier.simplify_cycl_relation(v_term);
                                SubLObject changedP = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != changedP) {
                                    return com.cyc.cycjava.cycl.simplifier.simplify_cycl_term(simplified_term, UNPROVIDED);
                                } else {
                                    return simplified_term;
                                }
                            }
                        } else {
                            return v_term;
                        }
                    }
                }
            }
        }
    }

    public static SubLObject simplify_cycl_term(final SubLObject v_term, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym8$CYC_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != subl_escape_p(v_term)) {
            return v_term;
        }
        if (NIL != cycl_grammar.fast_cycl_quoted_term_p(v_term)) {
            return v_term;
        }
        if (((NIL != cycl_utilities.nat_with_functor_p(v_term, $$Unity)) && (NIL != list_utilities.non_dotted_list_p(v_term))) && (NIL != list_utilities.doubletonP(v_term))) {
            return cycl_utilities.nat_arg1(v_term, UNPROVIDED);
        }
        if (NIL != term.nautP(v_term, varP)) {
            final SubLObject functor = cycl_utilities.nat_functor(v_term);
            final SubLObject sequence_var = sequence_var(v_term, UNPROVIDED);
            final SubLObject some_sentence_argP = czer_utilities.some_sentence_argP(functor, mt_relevance_macros.$mt$.getDynamicValue(thread));
            SubLObject arg = ZERO_INTEGER;
            SubLObject new_term = NIL;
            SubLObject cdolist_list_var;
            final SubLObject terms = cdolist_list_var = cycl_utilities.formula_terms(v_term, $IGNORE);
            SubLObject subterm = NIL;
            subterm = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject sentence_argP = makeBoolean((NIL != some_sentence_argP) && (NIL != czer_utilities.sentence_argP(functor, arg, mt_relevance_macros.$mt$.getDynamicValue(thread))));
                final SubLObject mal_true_sentence_argP = (NIL != sentence_argP) ? NIL != czer_utilities.indexed_argP(functor, arg) ? NIL : czer_utilities.true_sentenceP(subterm) : NIL;
                if (NIL != mal_true_sentence_argP) {
                    new_term = cons(simplify_cycl_sentence_int(cycl_utilities.formula_arg1(subterm, UNPROVIDED), varP), new_term);
                } else
                    if (NIL != sentence_argP) {
                        new_term = cons(simplify_cycl_sentence_int(subterm, varP), new_term);
                    } else {
                        new_term = cons(simplify_cycl_term(subterm, varP), new_term);
                    }

                arg = add(arg, ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                subterm = cdolist_list_var.first();
            } 
            new_term = nreverse(new_term);
            if (NIL != sequence_var) {
                new_term = nadd_sequence_var_to_end(sequence_var, new_term);
            } else
                if (NIL != el_unary_formula_p(new_term)) {
                    final SubLObject nested_term = cycl_utilities.formula_arg1(new_term, UNPROVIDED);
                    if ((NIL != term.nautP(nested_term, varP)) && (NIL != el_unary_formula_p(nested_term))) {
                        final SubLObject nested_functor = cycl_utilities.nat_functor(nested_term);
                        if ((NIL != indexed_term_p(nested_functor)) && ((NIL != somewhere_cache.some_pred_assertion_somewhereP($$inverseFunctions, functor, ONE_INTEGER, UNPROVIDED)) || (NIL != somewhere_cache.some_pred_assertion_somewhereP($$inverseFunctions, nested_functor, ONE_INTEGER, UNPROVIDED)))) {
                            SubLObject inverseP = NIL;
                            if (NIL == inverseP) {
                                SubLObject csome_list_var = kb_mapping_utilities.pred_values(functor, $$inverseFunctions, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject inverse_functor = NIL;
                                inverse_functor = csome_list_var.first();
                                while ((NIL == inverseP) && (NIL != csome_list_var)) {
                                    if (NIL != equals.equalsP(inverse_functor, nested_functor, UNPROVIDED, UNPROVIDED)) {
                                        inverseP = T;
                                    }
                                    csome_list_var = csome_list_var.rest();
                                    inverse_functor = csome_list_var.first();
                                } 
                            }
                            if (NIL == inverseP) {
                                SubLObject csome_list_var = kb_mapping_utilities.pred_values(nested_functor, $$inverseFunctions, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject inverse_functor = NIL;
                                inverse_functor = csome_list_var.first();
                                while ((NIL == inverseP) && (NIL != csome_list_var)) {
                                    if (NIL != equals.equalsP(inverse_functor, functor, UNPROVIDED, UNPROVIDED)) {
                                        inverseP = T;
                                    }
                                    csome_list_var = csome_list_var.rest();
                                    inverse_functor = csome_list_var.first();
                                } 
                            }
                            if (NIL != inverseP) {
                                new_term = cycl_utilities.formula_arg1(nested_term, UNPROVIDED);
                            }
                        }
                    }
                }

            return new_term;
        }
        if (NIL == relation_expressionP(v_term)) {
            return v_term;
        }
        thread.resetMultipleValues();
        final SubLObject simplified_term = simplify_cycl_relation(v_term);
        final SubLObject changedP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != changedP) {
            return simplify_cycl_term(simplified_term, UNPROVIDED);
        }
        return simplified_term;
    }

    /**
     * Returns the negation of SENTENCE.
     * If SENTENCE is of the form (#$not <subform>), it returns <subform> instead of (#$not (#$not <subform>)).
     * Can also handle #$True, #$False, or variables.
     */
    @LispMethod(comment = "Returns the negation of SENTENCE.\r\nIf SENTENCE is of the form (#$not <subform>), it returns <subform> instead of (#$not (#$not <subform>)).\r\nCan also handle #$True, #$False, or variables.\nReturns the negation of SENTENCE.\nIf SENTENCE is of the form (#$not <subform>), it returns <subform> instead of (#$not (#$not <subform>)).\nCan also handle #$True, #$False, or variables.")
    public static final SubLObject el_negate_alt(SubLObject sentence) {
        if (NIL != el_negation_p(sentence)) {
            return cycl_utilities.sentence_arg1(sentence, UNPROVIDED);
        } else {
            if ((((NIL != possibly_sentence_p(sentence)) || ($$True == sentence)) || ($$False == sentence)) || (NIL != cycl_variables.el_varP(sentence))) {
                return make_negation(sentence);
            } else {
                el_error(FOUR_INTEGER, $str_alt17$You_tried_to_negate__S___That_was, sentence, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    /**
     * Returns the negation of SENTENCE.
     * If SENTENCE is of the form (#$not <subform>), it returns <subform> instead of (#$not (#$not <subform>)).
     * Can also handle #$True, #$False, or variables.
     */
    @LispMethod(comment = "Returns the negation of SENTENCE.\r\nIf SENTENCE is of the form (#$not <subform>), it returns <subform> instead of (#$not (#$not <subform>)).\r\nCan also handle #$True, #$False, or variables.\nReturns the negation of SENTENCE.\nIf SENTENCE is of the form (#$not <subform>), it returns <subform> instead of (#$not (#$not <subform>)).\nCan also handle #$True, #$False, or variables.")
    public static SubLObject el_negate(final SubLObject sentence) {
        if (NIL != el_negation_p(sentence)) {
            return cycl_utilities.sentence_arg1(sentence, UNPROVIDED);
        }
        if ((((NIL != possibly_sentence_p(sentence)) || $$True.eql(sentence)) || $$False.eql(sentence)) || (NIL != cycl_variables.el_varP(sentence))) {
            return make_negation(sentence);
        }
        el_error(FOUR_INTEGER, $str23$You_tried_to_negate__S___That_was, sentence, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject simplify_cycl_negation_alt(SubLObject negation, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym6$CYC_VAR_);
        }
        if (NIL == el_negation_p(negation)) {
        } else {
            if ($$False == cycl_utilities.sentence_arg1(negation, UNPROVIDED)) {
                return $$True;
            } else {
                if ($$True == cycl_utilities.sentence_arg1(negation, UNPROVIDED)) {
                    return $$False;
                } else {
                    if (NIL != el_negation_p(cycl_utilities.sentence_arg1(negation, UNPROVIDED))) {
                        return com.cyc.cycjava.cycl.simplifier.simplify_cycl_sentence_int(cycl_utilities.sentence_arg1(cycl_utilities.sentence_arg1(negation, UNPROVIDED), UNPROVIDED), varP);
                    } else {
                        return negation;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject simplify_cycl_negation(final SubLObject negation, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym8$CYC_VAR_);
        }
        if (NIL == el_negation_p(negation)) {
            return NIL;
        }
        if ($$False.eql(cycl_utilities.sentence_arg1(negation, UNPROVIDED))) {
            return $$True;
        }
        if ($$True.eql(cycl_utilities.sentence_arg1(negation, UNPROVIDED))) {
            return $$False;
        }
        if (NIL != el_negation_p(cycl_utilities.sentence_arg1(negation, UNPROVIDED))) {
            return simplify_cycl_sentence_int(cycl_utilities.sentence_arg1(cycl_utilities.sentence_arg1(negation, UNPROVIDED), UNPROVIDED), varP);
        }
        return negation;
    }

    public static final SubLObject simplify_cycl_conjunction_alt(SubLObject conjunction, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym6$CYC_VAR_);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == el_conjunction_p(conjunction)) {
            } else {
                if (NIL == cycl_utilities.sentence_args(conjunction, $REGULARIZE)) {
                    return $$True;
                } else {
                    if ((NIL == sequence_var(conjunction, UNPROVIDED)) && (NIL != singletonP(cycl_utilities.sentence_args(conjunction, $IGNORE)))) {
                        return cycl_utilities.sentence_arg1(conjunction, $IGNORE);
                    } else {
                        if (NIL != subl_promotions.memberP($$False, cycl_utilities.sentence_args(conjunction, $IGNORE), UNPROVIDED, UNPROVIDED)) {
                            return $$False;
                        } else {
                            if (NIL != subl_promotions.memberP($$True, cycl_utilities.sentence_args(conjunction, $IGNORE), UNPROVIDED, UNPROVIDED)) {
                                return com.cyc.cycjava.cycl.simplifier.simplify_cycl_conjunction(remove($$True, conjunction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), varP);
                            } else {
                                if (NIL != duplicatesP(cycl_utilities.sentence_args(conjunction, $IGNORE), symbol_function(EQUAL), UNPROVIDED)) {
                                    {
                                        SubLObject seqvar = sequence_var(conjunction, UNPROVIDED);
                                        SubLObject new_args = remove_duplicates(cycl_utilities.sentence_args(conjunction, $IGNORE), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        return com.cyc.cycjava.cycl.simplifier.simplify_cycl_conjunction(make_el_formula(cycl_utilities.sentence_arg0(conjunction), new_args, seqvar), varP);
                                    }
                                } else {
                                    if (NIL != find_if(symbol_function(EL_CONJUNCTION_P), cycl_utilities.sentence_args(conjunction, $IGNORE), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                        {
                                            SubLObject seqvar = sequence_var(conjunction, UNPROVIDED);
                                            if (NIL != seqvar) {
                                                return com.cyc.cycjava.cycl.simplifier.simplify_cycl_conjunction(append(com.cyc.cycjava.cycl.simplifier.nconjoin(cycl_utilities.sentence_args(conjunction, $IGNORE), T), seqvar), UNPROVIDED);
                                            } else {
                                                return com.cyc.cycjava.cycl.simplifier.simplify_cycl_conjunction(com.cyc.cycjava.cycl.simplifier.conjoin(cycl_utilities.sentence_args(conjunction, UNPROVIDED), T), UNPROVIDED);
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
                SubLObject negations = el_negative_sentences(cycl_utilities.sentence_args(conjunction, $IGNORE));
                SubLObject positives = ((NIL != negations) || (NIL != com.cyc.cycjava.cycl.simplifier.simplify_redundanciesP())) ? ((SubLObject) (el_positive_sentences(cycl_utilities.sentence_args(conjunction, $IGNORE)))) : NIL;
                SubLObject disjunctions = (NIL != com.cyc.cycjava.cycl.simplifier.simplify_redundanciesP()) ? ((SubLObject) (remove_if_not(symbol_function(EL_DISJUNCTION_P), positives, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
                SubLObject falseP = NIL;
                if (NIL == falseP) {
                    {
                        SubLObject csome_list_var = negations;
                        SubLObject negation = NIL;
                        for (negation = csome_list_var.first(); !((NIL != falseP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , negation = csome_list_var.first()) {
                            falseP = subl_promotions.memberP(cycl_utilities.sentence_arg1(negation, $IGNORE), positives, symbol_function(EQUAL), UNPROVIDED);
                        }
                    }
                }
                if (NIL != falseP) {
                    return $$False;
                }
                if (NIL != disjunctions) {
                    {
                        SubLObject non_disjunctions = delete_if(symbol_function(EL_DISJUNCTION_P), positives, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject new_conjuncts = NIL;
                        SubLObject cdolist_list_var = disjunctions;
                        SubLObject disjunction = NIL;
                        for (disjunction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , disjunction = cdolist_list_var.first()) {
                            {
                                SubLObject conjuncts = cycl_utilities.sentence_args(conjunction, UNPROVIDED);
                                SubLObject disjuncts = cycl_utilities.sentence_args(disjunction, UNPROVIDED);
                                if (NIL == intersectP(conjuncts, disjuncts, symbol_function(EQUAL), UNPROVIDED)) {
                                    new_conjuncts = cons(disjunction, new_conjuncts);
                                }
                            }
                        }
                        return com.cyc.cycjava.cycl.simplifier.nconjoin(append(non_disjunctions, nreverse(new_conjuncts)), UNPROVIDED);
                    }
                }
            }
            if ((NIL != $simplify_equal_symbols_literalP$.getDynamicValue(thread)) && ((NIL == within_negationP()) || (NIL != within_disjunctionP()))) {
                {
                    SubLObject argnum = ZERO_INTEGER;
                    SubLObject args = cycl_utilities.formula_args(conjunction, $IGNORE);
                    SubLObject cdolist_list_var = args;
                    SubLObject conjunct = NIL;
                    for (conjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , conjunct = cdolist_list_var.first()) {
                        argnum = add(argnum, ONE_INTEGER);
                        if (NIL != el_formula_with_any_of_operators_p(conjunct, $list_alt19)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject equal_op = unmake_binary_formula(conjunct);
                                SubLObject arg1 = thread.secondMultipleValue();
                                SubLObject arg2 = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                {
                                    SubLObject var_arg1P = funcall(varP, arg1);
                                    SubLObject var_arg = (NIL != var_arg1P) ? ((SubLObject) (arg1)) : arg2;
                                    SubLObject bound_arg = (NIL != var_arg1P) ? ((SubLObject) (arg2)) : arg1;
                                    if (NIL != groundP(bound_arg, varP)) {
                                        return com.cyc.cycjava.cycl.simplifier.simplify_cycl_conjunction(cycl_utilities.expression_subst(bound_arg, var_arg, remove_formula_arg(argnum, conjunction), UNPROVIDED, UNPROVIDED), UNPROVIDED);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (NIL != com.cyc.cycjava.cycl.simplifier.simplify_transitive_redundanciesP()) {
                conjunction = com.cyc.cycjava.cycl.simplifier.simplify_transitive_redundancies(conjunction, UNPROVIDED);
            }
            return conjunction;
        }
    }

    public static SubLObject simplify_cycl_conjunction(SubLObject conjunctionIn, SubLObject varP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        int allowed_iterations = 10000;
        SubLObject conjunction = conjunctionIn;
        SubLObject prevconjunction = null;
        do {
            if (prevconjunction == conjunction) {
                // new StackOverflowError("simplify_cycl_conjunction " +
                // conjunction).printStackTrace();
                Errors.warn("Loop Ref simplify_cycl_conjunction " + conjunction);
            }
            prevconjunction = conjunction;
            if ((allowed_iterations--) < 0) {
                // new StackOverflowError("simplify_cycl_conjunction " +
                // conjunction).printStackTrace();
                Errors.warn("simplify_cycl_conjunction " + conjunction);
                return conjunction;
            }
            if (varP == UNPROVIDED) {
                varP = symbol_function($sym8$CYC_VAR_);
            }
            if (NIL != el_conjunction_p(conjunction)) {
                if (NIL == cycl_utilities.sentence_args(conjunction, $REGULARIZE)) {
                    return $$True;
                }
                if ((NIL == sequence_var(conjunction, UNPROVIDED)) && (NIL != list_utilities.singletonP(cycl_utilities.sentence_args(conjunction, $IGNORE)))) {
                    return cycl_utilities.sentence_arg1(conjunction, $IGNORE);
                }
                if (NIL != subl_promotions.memberP($$False, cycl_utilities.sentence_args(conjunction, $IGNORE), UNPROVIDED, UNPROVIDED)) {
                    return $$False;
                }
                if (NIL != subl_promotions.memberP($$True, cycl_utilities.sentence_args(conjunction, $IGNORE), UNPROVIDED, UNPROVIDED)) {
                    conjunction = remove($$True, conjunction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    continue;
                }
                if (NIL != list_utilities.duplicatesP(cycl_utilities.sentence_args(conjunction, $IGNORE), symbol_function(EQUAL), UNPROVIDED)) {
                    final SubLObject seqvar = sequence_var(conjunction, UNPROVIDED);
                    final SubLObject new_args = remove_duplicates(cycl_utilities.sentence_args(conjunction, $IGNORE), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    conjunction = make_el_formula(cycl_utilities.sentence_arg0(conjunction), new_args, seqvar);
                    continue;
                }
                if (NIL != find_if(symbol_function(EL_CONJUNCTION_P), cycl_utilities.sentence_args(conjunction, $IGNORE), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    varP = UNPROVIDED;
                    final SubLObject seqvar = sequence_var(conjunction, UNPROVIDED);
                    if (NIL != seqvar) {
                        conjunction = append(nconjoin(cycl_utilities.sentence_args(conjunction, $IGNORE), T), seqvar);
                    } else
                        conjunction = conjoin(cycl_utilities.sentence_args(conjunction, UNPROVIDED), T);

                    continue;
                }
            }
            final SubLObject negations = el_negative_sentences(cycl_utilities.sentence_args(conjunction, $IGNORE));
            final SubLObject positives = ((NIL != negations) || (NIL != simplify_redundanciesP())) ? el_positive_sentences(cycl_utilities.sentence_args(conjunction, $IGNORE)) : NIL;
            final SubLObject disjunctions = (NIL != simplify_redundanciesP()) ? list_utilities.remove_if_not(symbol_function(EL_DISJUNCTION_P), positives, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
            SubLObject falseP = NIL;
            if (NIL == falseP) {
                SubLObject csome_list_var;
                SubLObject negation;
                for (csome_list_var = negations, negation = NIL, negation = csome_list_var.first(); (NIL == falseP) && (NIL != csome_list_var); falseP = subl_promotions.memberP(cycl_utilities.sentence_arg1(negation, $IGNORE), positives, symbol_function(EQUAL), UNPROVIDED) , csome_list_var = csome_list_var.rest() , negation = csome_list_var.first()) {
                }
            }
            if (NIL != falseP) {
                return $$False;
            }
            if (NIL != disjunctions) {
                final SubLObject non_disjunctions = delete_if(symbol_function(EL_DISJUNCTION_P), positives, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject new_conjuncts = NIL;
                SubLObject cdolist_list_var = disjunctions;
                SubLObject disjunction = NIL;
                disjunction = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject conjuncts = cycl_utilities.sentence_args(conjunction, UNPROVIDED);
                    final SubLObject disjuncts = cycl_utilities.sentence_args(disjunction, UNPROVIDED);
                    if (NIL == list_utilities.intersectP(conjuncts, disjuncts, symbol_function(EQUAL), UNPROVIDED)) {
                        new_conjuncts = cons(disjunction, new_conjuncts);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    disjunction = cdolist_list_var.first();
                } 
                return nconjoin(append(non_disjunctions, nreverse(new_conjuncts)), UNPROVIDED);
            }
            if ((NIL != czer_vars.$simplify_equality_literalsP$.getDynamicValue(thread)) && ((NIL == czer_utilities.within_negationP()) || (NIL != czer_utilities.within_disjunctionP()))) {
                conjunction = simplify_equality_literals(conjunction, varP);
            }
            if (NIL != simplify_transitive_redundanciesP()) {
                conjunction = simplify_transitive_redundancies(conjunction, UNPROVIDED);
            }
            if ((NIL != el_conjunction_p(conjunction)) && (NIL != simplify_contradictionsP())) {
                conjunction = simplify_contradictions(conjunction);
            }
            return conjunction;
        } while (true );
    }

    public static SubLObject simplify_equality_literals(SubLObject conjunction, final SubLObject varP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject made_a_simplificationP = NIL;
        thread.resetMultipleValues();
        final SubLObject conjunction_$3 = simplify_one_var_var_equality_literal(conjunction, varP);
        final SubLObject made_a_simplificationP_$4 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        conjunction = conjunction_$3;
        made_a_simplificationP = made_a_simplificationP_$4;
        if (NIL != made_a_simplificationP) {
            return simplify_cycl_conjunction(conjunction, varP);
        }
        thread.resetMultipleValues();
        final SubLObject conjunction_$4 = simplify_one_symmetric_equality_literal(conjunction);
        final SubLObject made_a_simplificationP_$5 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        conjunction = conjunction_$4;
        made_a_simplificationP = made_a_simplificationP_$5;
        if (NIL != made_a_simplificationP) {
            return simplify_cycl_conjunction(conjunction, varP);
        }
        thread.resetMultipleValues();
        final SubLObject conjunction_$5 = simplify_open_closed_equality_literals(conjunction, varP);
        final SubLObject made_a_simplificationP_$6 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        conjunction = conjunction_$5;
        made_a_simplificationP = made_a_simplificationP_$6;
        if (NIL != made_a_simplificationP) {
            return simplify_cycl_conjunction(conjunction, varP);
        }
        thread.resetMultipleValues();
        final SubLObject conjunction_$6 = simplify_one_open_open_equality_literal(conjunction, varP);
        final SubLObject made_a_simplificationP_$7 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        conjunction = conjunction_$6;
        made_a_simplificationP = made_a_simplificationP_$7;
        if (NIL != made_a_simplificationP) {
            return simplify_cycl_conjunction(conjunction, varP);
        }
        return conjunction;
    }

    public static SubLObject simplify_one_open_open_equality_literal(final SubLObject conjunction, final SubLObject varP) {
        return simplify_one_open_open_equality_literal_int(conjunction, varP, NIL);
    }

    public static SubLObject simplify_one_var_var_equality_literal(final SubLObject conjunction, final SubLObject varP) {
        return simplify_one_open_open_equality_literal_int(conjunction, varP, T);
    }

    public static SubLObject simplify_one_open_open_equality_literal_int(SubLObject conjunction, final SubLObject varP, final SubLObject handle_only_variablesP) {
        SubLObject made_a_simplificationP = NIL;
        SubLObject target_argnum = NIL;
        SubLObject target_bindings = NIL;
        SubLObject sentence_arg2P = NIL;
        SubLObject argnum = ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(conjunction, $IGNORE);
        SubLObject conjunct = NIL;
        conjunct = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            argnum = add(argnum, ONE_INTEGER);
            if (NIL != open_open_equality_literalP(conjunct, varP, T, handle_only_variablesP)) {
                final SubLObject v_bindings = unification_utilities.unify_open_el_terms(cycl_utilities.formula_arg1(conjunct, UNPROVIDED), cycl_utilities.formula_arg2(conjunct, UNPROVIDED), UNPROVIDED);
                if (NIL != v_bindings) {
                    if (NIL != el_formula_p(cycl_utilities.formula_arg2(conjunct, UNPROVIDED))) {
                        sentence_arg2P = T;
                    }
                    target_bindings = v_bindings;
                    target_argnum = argnum;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            conjunct = cdolist_list_var.first();
        } 
        if (NIL != target_argnum) {
            final SubLObject possible_simplification = remove_formula_arg(target_argnum, conjunction);
            final SubLObject possible_simplification_changed = bindings.apply_bindings(target_bindings, possible_simplification);
            if ((NIL == sentence_arg2P) || (!possible_simplification.equal(possible_simplification_changed))) {
                conjunction = possible_simplification_changed;
                made_a_simplificationP = T;
            }
        }
        return values(conjunction, made_a_simplificationP);
    }

    public static SubLObject simplify_one_symmetric_equality_literal(SubLObject conjunction) {
        SubLObject made_a_simplificationP = NIL;
        SubLObject target_argnum = NIL;
        SubLObject argnum = ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(conjunction, $IGNORE);
        SubLObject conjunct = NIL;
        conjunct = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            argnum = add(argnum, ONE_INTEGER);
            if (NIL != symmetric_equality_literalP(conjunct, T)) {
                target_argnum = argnum;
            }
            cdolist_list_var = cdolist_list_var.rest();
            conjunct = cdolist_list_var.first();
        } 
        if (NIL != target_argnum) {
            conjunction = remove_formula_arg(target_argnum, conjunction);
            made_a_simplificationP = T;
        }
        return values(conjunction, made_a_simplificationP);
    }

    public static SubLObject simplify_open_closed_equality_literals(SubLObject conjunction, final SubLObject varP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject argnums_to_remove = NIL;
        final SubLObject equality_dict = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject conflict_vars = NIL;
        final SubLObject elP = subl_promotions.memberP(varP, list($sym8$CYC_VAR_, symbol_function($sym8$CYC_VAR_), $sym25$EL_VAR_, symbol_function($sym25$EL_VAR_)), UNPROVIDED, UNPROVIDED);
        SubLObject argnum = ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(conjunction, $IGNORE);
        SubLObject conjunct = NIL;
        conjunct = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            argnum = add(argnum, ONE_INTEGER);
            final SubLObject before_length = dictionary.dictionary_length(equality_dict);
            final SubLObject items_var = fold_equals_in_asent(conjunct, equality_dict, elP, T, remove_formula_arg(argnum, conjunction));
            if (items_var.isVector()) {
                final SubLObject vector_var = items_var;
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject item;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    item = aref(vector_var, element_num);
                    conflict_vars = cons(item, conflict_vars);
                }
            } else {
                SubLObject cdolist_list_var_$11 = items_var;
                SubLObject item2 = NIL;
                item2 = cdolist_list_var_$11.first();
                while (NIL != cdolist_list_var_$11) {
                    conflict_vars = cons(item2, conflict_vars);
                    cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                    item2 = cdolist_list_var_$11.first();
                } 
            }
            final SubLObject found_a_foldP = list_utilities.not_equal(before_length, dictionary.dictionary_length(equality_dict));
            if (NIL != found_a_foldP) {
                argnums_to_remove = cons(argnum, argnums_to_remove);
            }
            cdolist_list_var = cdolist_list_var.rest();
            conjunct = cdolist_list_var.first();
        } 
        if (NIL != conflict_vars) {
            return values($$False, T);
        }
        if (NIL == dictionary.dictionary_empty_p(equality_dict)) {
            SubLObject cdolist_list_var2 = Sort.sort(argnums_to_remove, symbol_function($sym26$_), UNPROVIDED);
            SubLObject argnum_to_remove = NIL;
            argnum_to_remove = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                conjunction = remove_formula_arg(argnum_to_remove, conjunction);
                cdolist_list_var2 = cdolist_list_var2.rest();
                argnum_to_remove = cdolist_list_var2.first();
            } 
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(equality_dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject open_term = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject closed_term = thread.secondMultipleValue();
                thread.resetMultipleValues();
                conjunction = cycl_utilities.expression_subst(closed_term, open_term, conjunction, UNPROVIDED, UNPROVIDED);
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            return values(conjunction, T);
        }
        return values(conjunction, NIL);
    }

    public static SubLObject equality_literalP(final SubLObject asent, final SubLObject fold_equalsP) {
        return makeBoolean((NIL != cycl_utilities.atomic_sentence_with_any_of_preds_p(asent, $list27)) || ((NIL != fold_equalsP) && (NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, $$equals))));
    }

    public static SubLObject open_open_equality_literalP(final SubLObject asent, final SubLObject varP, final SubLObject fold_equalsP, final SubLObject handle_only_variablesP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != equality_literalP(asent, fold_equalsP)) {
            thread.resetMultipleValues();
            final SubLObject pred = unmake_binary_formula(asent);
            final SubLObject arg1 = thread.secondMultipleValue();
            final SubLObject arg2 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != handle_only_variablesP) {
                if ((NIL != funcall(varP, arg1)) && (NIL != funcall(varP, arg2))) {
                    return T;
                }
            } else
                if ((NIL == closedP(arg1, varP)) && (NIL == closedP(arg2, varP))) {
                    return T;
                }

        }
        return NIL;
    }

    public static SubLObject symmetric_equality_literalP(final SubLObject asent, final SubLObject fold_equalsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != equality_literalP(asent, fold_equalsP)) {
            thread.resetMultipleValues();
            final SubLObject pred = unmake_binary_formula(asent);
            final SubLObject arg1 = thread.secondMultipleValue();
            final SubLObject arg2 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (arg1.equal(arg2)) {
                return T;
            }
        }
        return NIL;
    }

    public static final SubLObject simplify_cycl_disjunction_alt(SubLObject disjunction, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym6$CYC_VAR_);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = at_vars.$within_disjunctionP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = at_vars.$within_negated_disjunctionP$.currentBinding(thread);
                    try {
                        at_vars.$within_disjunctionP$.bind(T, thread);
                        at_vars.$within_negated_disjunctionP$.bind($within_negationP$.getDynamicValue(thread), thread);
                        result = com.cyc.cycjava.cycl.simplifier.simplify_cycl_disjunction_int(disjunction, varP);
                    } finally {
                        at_vars.$within_negated_disjunctionP$.rebind(_prev_bind_1, thread);
                        at_vars.$within_disjunctionP$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != com.cyc.cycjava.cycl.simplifier.simplify_transitive_redundanciesP()) {
                    disjunction = com.cyc.cycjava.cycl.simplifier.simplify_transitive_redundancies_in_cycl_disjunction(disjunction, UNPROVIDED);
                }
                return result;
            }
        }
    }

    public static SubLObject simplify_cycl_disjunction(SubLObject disjunction, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym8$CYC_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = at_vars.$within_disjunctionP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$within_negated_disjunctionP$.currentBinding(thread);
        try {
            at_vars.$within_disjunctionP$.bind(T, thread);
            at_vars.$within_negated_disjunctionP$.bind(czer_vars.$within_negationP$.getDynamicValue(thread), thread);
            result = simplify_cycl_disjunction_int(disjunction, varP);
        } finally {
            at_vars.$within_negated_disjunctionP$.rebind(_prev_bind_2, thread);
            at_vars.$within_disjunctionP$.rebind(_prev_bind_0, thread);
        }
        if (NIL != simplify_transitive_redundanciesP()) {
            disjunction = simplify_transitive_redundancies_in_cycl_disjunction(disjunction, UNPROVIDED);
        }
        return result;
    }

    public static final SubLObject simplify_cycl_disjunction_int_alt(SubLObject disjunction, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym6$CYC_VAR_);
        }
        if (NIL == el_disjunction_p(disjunction)) {
        } else {
            if (NIL == cycl_utilities.sentence_args(disjunction, $REGULARIZE)) {
                return $$False;
            } else {
                if ((NIL == sequence_var(disjunction, UNPROVIDED)) && (NIL != singletonP(cycl_utilities.sentence_args(disjunction, $IGNORE)))) {
                    return cycl_utilities.sentence_arg1(disjunction, $IGNORE);
                } else {
                    if (NIL != subl_promotions.memberP($$True, cycl_utilities.sentence_args(disjunction, $IGNORE), UNPROVIDED, UNPROVIDED)) {
                        return $$True;
                    } else {
                        if (NIL != subl_promotions.memberP($$False, cycl_utilities.sentence_args(disjunction, $IGNORE), UNPROVIDED, UNPROVIDED)) {
                            return com.cyc.cycjava.cycl.simplifier.simplify_cycl_disjunction_int(remove($$False, disjunction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), varP);
                        } else {
                            if (NIL != duplicatesP(cycl_utilities.sentence_args(disjunction, $IGNORE), symbol_function(EQUAL), UNPROVIDED)) {
                                {
                                    SubLObject seqvar = sequence_var(disjunction, UNPROVIDED);
                                    SubLObject new_args = remove_duplicates(cycl_utilities.sentence_args(disjunction, $IGNORE), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    return com.cyc.cycjava.cycl.simplifier.simplify_cycl_disjunction_int(make_el_formula(cycl_utilities.sentence_arg0(disjunction), new_args, seqvar), varP);
                                }
                            } else {
                                if (NIL != find_if(symbol_function(EL_DISJUNCTION_P), cycl_utilities.sentence_args(disjunction, $IGNORE), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                    {
                                        SubLObject seqvar = sequence_var(disjunction, UNPROVIDED);
                                        if (NIL != seqvar) {
                                            return com.cyc.cycjava.cycl.simplifier.simplify_cycl_disjunction_int(append(com.cyc.cycjava.cycl.simplifier.ndisjoin(cycl_utilities.sentence_args(disjunction, $IGNORE), T), seqvar), UNPROVIDED);
                                        } else {
                                            return com.cyc.cycjava.cycl.simplifier.simplify_cycl_disjunction_int(com.cyc.cycjava.cycl.simplifier.disjoin(cycl_utilities.sentence_args(disjunction, UNPROVIDED), T), UNPROVIDED);
                                        }
                                    }
                                } else {
                                    {
                                        SubLObject negations = el_negative_sentences(cycl_utilities.sentence_args(disjunction, $IGNORE));
                                        SubLObject positives = (NIL != negations) ? ((SubLObject) (el_positive_sentences(cycl_utilities.sentence_args(disjunction, $IGNORE)))) : NIL;
                                        SubLObject trueP = NIL;
                                        if (NIL == trueP) {
                                            {
                                                SubLObject csome_list_var = negations;
                                                SubLObject negation = NIL;
                                                for (negation = csome_list_var.first(); !((NIL != trueP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , negation = csome_list_var.first()) {
                                                    trueP = subl_promotions.memberP(cycl_utilities.sentence_arg1(negation, $IGNORE), positives, symbol_function(EQUAL), UNPROVIDED);
                                                }
                                            }
                                        }
                                        if (NIL != trueP) {
                                            return $$True;
                                        } else {
                                            return disjunction;
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

    public static SubLObject simplify_cycl_disjunction_int(final SubLObject disjunction, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym8$CYC_VAR_);
        }
        if (NIL == el_disjunction_p(disjunction)) {
            return NIL;
        }
        if (NIL == cycl_utilities.sentence_args(disjunction, $REGULARIZE)) {
            return $$False;
        }
        if ((NIL == sequence_var(disjunction, UNPROVIDED)) && (NIL != list_utilities.singletonP(cycl_utilities.sentence_args(disjunction, $IGNORE)))) {
            return cycl_utilities.sentence_arg1(disjunction, $IGNORE);
        }
        if (NIL != subl_promotions.memberP($$True, cycl_utilities.sentence_args(disjunction, $IGNORE), UNPROVIDED, UNPROVIDED)) {
            return $$True;
        }
        if (NIL != subl_promotions.memberP($$False, cycl_utilities.sentence_args(disjunction, $IGNORE), UNPROVIDED, UNPROVIDED)) {
            return simplify_cycl_disjunction_int(remove($$False, disjunction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), varP);
        }
        if (NIL != list_utilities.duplicatesP(cycl_utilities.sentence_args(disjunction, $IGNORE), symbol_function(EQUAL), UNPROVIDED)) {
            final SubLObject seqvar = sequence_var(disjunction, UNPROVIDED);
            final SubLObject new_args = remove_duplicates(cycl_utilities.sentence_args(disjunction, $IGNORE), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return simplify_cycl_disjunction_int(make_el_formula(cycl_utilities.sentence_arg0(disjunction), new_args, seqvar), varP);
        }
        if (NIL != find_if(symbol_function(EL_DISJUNCTION_P), cycl_utilities.sentence_args(disjunction, $IGNORE), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            final SubLObject seqvar = sequence_var(disjunction, UNPROVIDED);
            if (NIL != seqvar) {
                return simplify_cycl_disjunction_int(append(ndisjoin(cycl_utilities.sentence_args(disjunction, $IGNORE), T), seqvar), UNPROVIDED);
            }
            return simplify_cycl_disjunction_int(disjoin(cycl_utilities.sentence_args(disjunction, UNPROVIDED), T), UNPROVIDED);
        } else {
            final SubLObject negations = el_negative_sentences(cycl_utilities.sentence_args(disjunction, $IGNORE));
            final SubLObject positives = (NIL != negations) ? el_positive_sentences(cycl_utilities.sentence_args(disjunction, $IGNORE)) : NIL;
            SubLObject trueP = NIL;
            if (NIL == trueP) {
                SubLObject csome_list_var = negations;
                SubLObject negation = NIL;
                negation = csome_list_var.first();
                while ((NIL == trueP) && (NIL != csome_list_var)) {
                    trueP = subl_promotions.memberP(cycl_utilities.sentence_arg1(negation, $IGNORE), positives, symbol_function(EQUAL), UNPROVIDED);
                    if (NIL != trueP) {
                        wff.note_wff_violation(list($SIMPLIFICATION_TO_TAUTOLOGY_DUE_TO_POS_AND_NEG_LITERAL, cycl_utilities.sentence_arg1(negation, $IGNORE)));
                    }
                    csome_list_var = csome_list_var.rest();
                    negation = csome_list_var.first();
                } 
            }
            if (NIL != trueP) {
                return $$True;
            }
            return disjunction;
        }
    }

    public static final SubLObject simplify_cycl_implication_alt(SubLObject implication, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym6$CYC_VAR_);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == el_implication_p(implication)) {
            } else {
                if (NIL == $simplify_implicationP$.getDynamicValue(thread)) {
                    return implication;
                } else {
                    if (NIL != singletonP(cycl_utilities.sentence_args(implication, UNPROVIDED))) {
                        return com.cyc.cycjava.cycl.simplifier.simplify_cycl_sentence_int(cycl_utilities.negate(cycl_utilities.sentence_arg1(implication, UNPROVIDED)), varP);
                    } else {
                        if ($$True == cycl_utilities.sentence_arg2(implication, UNPROVIDED)) {
                            return $$True;
                        } else {
                            if ($$False == cycl_utilities.sentence_arg1(implication, UNPROVIDED)) {
                                return $$True;
                            } else {
                                if ($$True == cycl_utilities.sentence_arg1(implication, UNPROVIDED)) {
                                    return cycl_utilities.sentence_arg2(implication, UNPROVIDED);
                                } else {
                                    if ($$False == cycl_utilities.sentence_arg2(implication, UNPROVIDED)) {
                                        return cycl_utilities.negate(cycl_utilities.sentence_arg1(implication, UNPROVIDED));
                                    } else {
                                        if (NIL != $within_unassert$.getDynamicValue(thread)) {
                                            return implication;
                                        } else {
                                            if (NIL != $recanonicalizingP$.getDynamicValue(thread)) {
                                                return implication;
                                            } else {
                                                if (cycl_utilities.sentence_arg1(implication, UNPROVIDED).equal(cycl_utilities.sentence_arg2(implication, UNPROVIDED))) {
                                                    return $$True;
                                                } else {
                                                    return implication;
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

    public static SubLObject simplify_cycl_implication(final SubLObject implication, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym8$CYC_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == el_implication_p(implication)) {
            return NIL;
        }
        if (NIL == czer_vars.$simplify_implicationP$.getDynamicValue(thread)) {
            return implication;
        }
        if (NIL != list_utilities.singletonP(cycl_utilities.sentence_args(implication, UNPROVIDED))) {
            return simplify_cycl_sentence_int(cycl_utilities.negate(cycl_utilities.sentence_arg1(implication, UNPROVIDED)), varP);
        }
        if ($$True.eql(cycl_utilities.sentence_arg2(implication, UNPROVIDED))) {
            return $$True;
        }
        if ($$False.eql(cycl_utilities.sentence_arg1(implication, UNPROVIDED))) {
            return $$True;
        }
        if ($$True.eql(cycl_utilities.sentence_arg1(implication, UNPROVIDED))) {
            return cycl_utilities.sentence_arg2(implication, UNPROVIDED);
        }
        if ($$False.eql(cycl_utilities.sentence_arg2(implication, UNPROVIDED))) {
            return cycl_utilities.negate(cycl_utilities.sentence_arg1(implication, UNPROVIDED));
        }
        if (NIL != $within_unassert$.getDynamicValue(thread)) {
            return implication;
        }
        if (NIL != czer_vars.$recanonicalizingP$.getDynamicValue(thread)) {
            return implication;
        }
        if (cycl_utilities.sentence_arg1(implication, UNPROVIDED).equal(cycl_utilities.sentence_arg2(implication, UNPROVIDED))) {
            return $$True;
        }
        return implication;
    }

    public static final SubLObject equal_implication_argsP_alt(SubLObject implication, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym6$CYC_VAR_);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject antecedent = NIL;
                SubLObject consequent = NIL;
                {
                    SubLObject _prev_bind_0 = at_vars.$within_disjunctionP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = at_vars.$within_negated_disjunctionP$.currentBinding(thread);
                    try {
                        at_vars.$within_disjunctionP$.bind(T, thread);
                        at_vars.$within_negated_disjunctionP$.bind($within_negationP$.getDynamicValue(thread), thread);
                        {
                            SubLObject _prev_bind_0_2 = $within_negationP$.currentBinding(thread);
                            try {
                                $within_negationP$.bind(makeBoolean(NIL == $within_negationP$.getDynamicValue(thread)), thread);
                                antecedent = com.cyc.cycjava.cycl.simplifier.simplify_cycl_sentence_int(cycl_utilities.sentence_arg1(implication, UNPROVIDED), varP);
                            } finally {
                                $within_negationP$.rebind(_prev_bind_0_2, thread);
                            }
                        }
                        consequent = com.cyc.cycjava.cycl.simplifier.simplify_cycl_sentence_int(cycl_utilities.sentence_arg2(implication, UNPROVIDED), varP);
                    } finally {
                        at_vars.$within_negated_disjunctionP$.rebind(_prev_bind_1, thread);
                        at_vars.$within_disjunctionP$.rebind(_prev_bind_0, thread);
                    }
                }
                return equal(antecedent, consequent);
            }
        }
    }

    public static SubLObject equal_implication_argsP(final SubLObject implication, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym8$CYC_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject antecedent = NIL;
        SubLObject consequent = NIL;
        final SubLObject _prev_bind_0 = at_vars.$within_disjunctionP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$within_negated_disjunctionP$.currentBinding(thread);
        try {
            at_vars.$within_disjunctionP$.bind(T, thread);
            at_vars.$within_negated_disjunctionP$.bind(czer_vars.$within_negationP$.getDynamicValue(thread), thread);
            final SubLObject _prev_bind_0_$12 = czer_vars.$within_negationP$.currentBinding(thread);
            try {
                czer_vars.$within_negationP$.bind(makeBoolean(NIL == czer_vars.$within_negationP$.getDynamicValue(thread)), thread);
                antecedent = simplify_cycl_sentence_int(cycl_utilities.sentence_arg1(implication, UNPROVIDED), varP);
            } finally {
                czer_vars.$within_negationP$.rebind(_prev_bind_0_$12, thread);
            }
            consequent = simplify_cycl_sentence_int(cycl_utilities.sentence_arg2(implication, UNPROVIDED), varP);
        } finally {
            at_vars.$within_negated_disjunctionP$.rebind(_prev_bind_2, thread);
            at_vars.$within_disjunctionP$.rebind(_prev_bind_0, thread);
        }
        return equal(antecedent, consequent);
    }

    public static final SubLObject simplify_cycl_universal_alt(SubLObject universal) {
        {
            SubLObject var = quantified_var(universal);
            SubLObject sub_sentence = quantified_sub_sentence(universal);
            if (NIL != cycl_utilities.expression_find(var, sub_sentence, T, UNPROVIDED, UNPROVIDED)) {
                return universal;
            } else {
                return sub_sentence;
            }
        }
    }

    public static SubLObject simplify_cycl_universal(final SubLObject universal) {
        final SubLObject var = quantified_var(universal);
        final SubLObject sub_sentence = quantified_sub_sentence(universal);
        if (NIL != cycl_utilities.expression_find(var, sub_sentence, T, UNPROVIDED, UNPROVIDED)) {
            return universal;
        }
        return sub_sentence;
    }

    public static final SubLObject simplify_cycl_existential_alt(SubLObject existential) {
        {
            SubLObject var = quantified_var(existential);
            SubLObject sub_sentence = quantified_sub_sentence(existential);
            if (NIL != cycl_utilities.expression_find(var, sub_sentence, T, UNPROVIDED, UNPROVIDED)) {
                return existential;
            } else {
                return sub_sentence;
            }
        }
    }

    public static SubLObject simplify_cycl_existential(final SubLObject existential) {
        final SubLObject var = quantified_var(existential);
        final SubLObject sub_sentence = quantified_sub_sentence(existential);
        if (NIL != cycl_utilities.expression_find(var, sub_sentence, T, UNPROVIDED, UNPROVIDED)) {
            return existential;
        }
        return sub_sentence;
    }

    public static SubLObject simplify_cycl_multiply_quantified_sentence(final SubLObject quantified) {
        final SubLObject vars = quantified_var_list(quantified);
        final SubLObject sub_sentence = quantified_sub_sentence(quantified);
        SubLObject attested_vars = NIL;
        SubLObject cdolist_list_var = vars;
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != cycl_utilities.expression_find(var, sub_sentence, T, UNPROVIDED, UNPROVIDED)) {
                attested_vars = cons(var, attested_vars);
            }
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        return make_multiply_quantified_sentence(sentence_quantifier(quantified), nreverse(attested_vars), sub_sentence);
    }

    /**
     * Performs minor recursive simplifications on the relation expression RELATION.
     */
    @LispMethod(comment = "Performs minor recursive simplifications on the relation expression RELATION.")
    public static final SubLObject simplify_cycl_relation_alt(SubLObject relation) {
        return relation;
    }

    /**
     * Performs minor recursive simplifications on the relation expression RELATION.
     */
    @LispMethod(comment = "Performs minor recursive simplifications on the relation expression RELATION.")
    public static SubLObject simplify_cycl_relation(final SubLObject relation_expression) {
        return values(relation_expression, NIL);
    }

    public static final SubLObject simplify_special_cases_alt(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $simplify_using_semanticsP$.getDynamicValue(thread)) {
                formula = com.cyc.cycjava.cycl.simplifier.simplify_nested_collectionsubsetfn_expression(formula);
            }
            return formula;
        }
    }

    public static SubLObject simplify_special_cases(SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$simplify_using_semanticsP$.getDynamicValue(thread)) {
            formula = simplify_nested_collectionsubsetfn_expression(formula);
            formula = simplify_individualasfn_expressions(formula);
        }
        return formula;
    }

    public static final SubLObject simplify_nested_collectionsubsetfn_expression_alt(SubLObject formula) {
        return transform_list_utilities.transform(formula, symbol_function($sym20$NESTED_COLLECTIONSUBSETFN_EXPRESSION_), symbol_function(TRANSFORM_NESTED_COLLECTIONSUBSETFN_EXPRESSION), UNPROVIDED);
    }

    public static SubLObject simplify_nested_collectionsubsetfn_expression(final SubLObject formula) {
        return transform_list_utilities.transform(formula, symbol_function($sym30$NESTED_COLLECTIONSUBSETFN_EXPRESSION_), symbol_function(TRANSFORM_NESTED_COLLECTIONSUBSETFN_EXPRESSION), UNPROVIDED);
    }

    /**
     *
     *
     * @param expression
     * 		EL formula; assumed to be of the form
     * 		(CollectionSubsetFn (CollectionSubsetFn COL (TheSetOf ?X <blah>))
     * 		(TheSetOf ?Y <bleh>))
     * @return EL formula; a simplified version of EXPRESSION, of the form
    (CollectionSubsetFn COL (TheSetOf ?X (and <blah> <bleh[?X/?Y]>)))
     */
    @LispMethod(comment = "@param expression\r\n\t\tEL formula; assumed to be of the form\r\n\t\t(CollectionSubsetFn (CollectionSubsetFn COL (TheSetOf ?X <blah>))\r\n\t\t(TheSetOf ?Y <bleh>))\r\n@return EL formula; a simplified version of EXPRESSION, of the form\r\n(CollectionSubsetFn COL (TheSetOf ?X (and <blah> <bleh[?X/?Y]>)))")
    public static final SubLObject transform_nested_collectionsubsetfn_expression_alt(SubLObject expression) {
        {
            SubLObject nested_expression = cycl_utilities.formula_arg1(expression, UNPROVIDED);
            SubLObject nested_col = cycl_utilities.formula_arg1(nested_expression, UNPROVIDED);
            SubLObject nested_set = cycl_utilities.formula_arg2(nested_expression, UNPROVIDED);
            SubLObject nested_set_var = cycl_utilities.formula_arg1(nested_set, UNPROVIDED);
            SubLObject nested_set_sentence = cycl_utilities.formula_arg2(nested_set, UNPROVIDED);
            SubLObject v_set = cycl_utilities.formula_arg2(expression, UNPROVIDED);
            SubLObject set_var = cycl_utilities.formula_arg1(v_set, UNPROVIDED);
            SubLObject set_sentence = cycl_utilities.formula_arg2(v_set, UNPROVIDED);
            if ((!set_var.equal(nested_set_var)) && (NIL != tree_find(nested_set_var, set_sentence, UNPROVIDED, UNPROVIDED))) {
                {
                    SubLObject done = NIL;
                    SubLObject new_var = NIL;
                    for (new_var = cycl_variables.make_el_var(symbol_name(cycl_variables.gensym_el_var(symbol_name(nested_set_var)))); NIL == done; new_var = cycl_variables.make_el_var(symbol_name(cycl_variables.gensym_el_var(symbol_name(nested_set_var))))) {
                        if (NIL == tree_find(new_var, set_sentence, UNPROVIDED, UNPROVIDED)) {
                            nsubst(new_var, nested_set_var, set_sentence, UNPROVIDED, UNPROVIDED);
                            done = T;
                        }
                    }
                }
            }
            return make_binary_formula($$CollectionSubsetFn, nested_col, make_binary_formula($$TheSetOf, nested_set_var, com.cyc.cycjava.cycl.simplifier.conjoin(list(nested_set_sentence, nsubst(nested_set_var, set_var, set_sentence, UNPROVIDED, UNPROVIDED)), T)));
        }
    }

    /**
     *
     *
     * @param expression
     * 		EL formula; assumed to be of the form
     * 		(CollectionSubsetFn (CollectionSubsetFn COL (TheSetOf ?X <blah>))
     * 		(TheSetOf ?Y <bleh>))
     * @return EL formula; a simplified version of EXPRESSION, of the form
    (CollectionSubsetFn COL (TheSetOf ?X (and <blah> <bleh[?X/?Y]>)))
     */
    @LispMethod(comment = "@param expression\r\n\t\tEL formula; assumed to be of the form\r\n\t\t(CollectionSubsetFn (CollectionSubsetFn COL (TheSetOf ?X <blah>))\r\n\t\t(TheSetOf ?Y <bleh>))\r\n@return EL formula; a simplified version of EXPRESSION, of the form\r\n(CollectionSubsetFn COL (TheSetOf ?X (and <blah> <bleh[?X/?Y]>)))")
    public static SubLObject transform_nested_collectionsubsetfn_expression(final SubLObject expression) {
        final SubLObject nested_expression = cycl_utilities.formula_arg1(expression, UNPROVIDED);
        final SubLObject nested_col = cycl_utilities.formula_arg1(nested_expression, UNPROVIDED);
        final SubLObject nested_set = cycl_utilities.formula_arg2(nested_expression, UNPROVIDED);
        final SubLObject nested_set_var = cycl_utilities.formula_arg1(nested_set, UNPROVIDED);
        final SubLObject nested_set_sentence = cycl_utilities.formula_arg2(nested_set, UNPROVIDED);
        final SubLObject v_set = cycl_utilities.formula_arg2(expression, UNPROVIDED);
        final SubLObject set_var = cycl_utilities.formula_arg1(v_set, UNPROVIDED);
        final SubLObject set_sentence = cycl_utilities.formula_arg2(v_set, UNPROVIDED);
        if ((!set_var.equal(nested_set_var)) && (NIL != list_utilities.tree_find(nested_set_var, set_sentence, UNPROVIDED, UNPROVIDED))) {
            SubLObject done = NIL;
            SubLObject new_var = NIL;
            new_var = cycl_variables.make_el_var(symbol_name(cycl_variables.gensym_el_var(symbol_name(nested_set_var))));
            while (NIL == done) {
                if (NIL == list_utilities.tree_find(new_var, set_sentence, UNPROVIDED, UNPROVIDED)) {
                    nsubst(new_var, nested_set_var, set_sentence, UNPROVIDED, UNPROVIDED);
                    done = T;
                }
                new_var = cycl_variables.make_el_var(symbol_name(cycl_variables.gensym_el_var(symbol_name(nested_set_var))));
            } 
        }
        return make_binary_formula($$CollectionSubsetFn, nested_col, make_binary_formula($$TheSetOf, nested_set_var, conjoin(list(nested_set_sentence, nsubst(nested_set_var, set_var, set_sentence, UNPROVIDED, UNPROVIDED)), T)));
    }

    /**
     *
     *
     * @return boolean; t iff EXPRESSION is of the form
    (CollectionSubsetFn (CollectionSubsetFn COL (TheSetOf ?X <blah>))
    (TheSetOf ?Y <bleh>))
     */
    @LispMethod(comment = "@return boolean; t iff EXPRESSION is of the form\r\n(CollectionSubsetFn (CollectionSubsetFn COL (TheSetOf ?X <blah>))\r\n(TheSetOf ?Y <bleh>))")
    public static final SubLObject nested_collectionsubsetfn_expressionP_alt(SubLObject expression) {
        return makeBoolean((((((((NIL != el_formula_p(expression)) && ($$CollectionSubsetFn == cycl_utilities.formula_arg0(expression))) && (NIL != el_formula_p(cycl_utilities.formula_arg1(expression, UNPROVIDED)))) && ($$CollectionSubsetFn == cycl_utilities.formula_arg0(cycl_utilities.formula_arg1(expression, UNPROVIDED)))) && (NIL != el_formula_p(cycl_utilities.formula_arg2(expression, UNPROVIDED)))) && ($$TheSetOf == cycl_utilities.formula_arg0(cycl_utilities.formula_arg2(expression, UNPROVIDED)))) && (NIL != el_formula_p(cycl_utilities.formula_arg2(cycl_utilities.formula_arg1(expression, UNPROVIDED), UNPROVIDED)))) && ($$TheSetOf == cycl_utilities.formula_arg0(cycl_utilities.formula_arg2(cycl_utilities.formula_arg1(expression, UNPROVIDED), UNPROVIDED))));
    }

    /**
     *
     *
     * @return boolean; t iff EXPRESSION is of the form
    (CollectionSubsetFn (CollectionSubsetFn COL (TheSetOf ?X <blah>))
    (TheSetOf ?Y <bleh>))
     */
    @LispMethod(comment = "@return boolean; t iff EXPRESSION is of the form\r\n(CollectionSubsetFn (CollectionSubsetFn COL (TheSetOf ?X <blah>))\r\n(TheSetOf ?Y <bleh>))")
    public static SubLObject nested_collectionsubsetfn_expressionP(final SubLObject expression) {
        return makeBoolean((((((((NIL != el_formula_p(expression)) && $$CollectionSubsetFn.eql(cycl_utilities.formula_arg0(expression))) && (NIL != el_formula_p(cycl_utilities.formula_arg1(expression, UNPROVIDED)))) && $$CollectionSubsetFn.eql(cycl_utilities.formula_arg0(cycl_utilities.formula_arg1(expression, UNPROVIDED)))) && (NIL != el_formula_p(cycl_utilities.formula_arg2(expression, UNPROVIDED)))) && $$TheSetOf.eql(cycl_utilities.formula_arg0(cycl_utilities.formula_arg2(expression, UNPROVIDED)))) && (NIL != el_formula_p(cycl_utilities.formula_arg2(cycl_utilities.formula_arg1(expression, UNPROVIDED), UNPROVIDED)))) && $$TheSetOf.eql(cycl_utilities.formula_arg0(cycl_utilities.formula_arg2(cycl_utilities.formula_arg1(expression, UNPROVIDED), UNPROVIDED))));
    }

    public static SubLObject simplify_individualasfn_expressions(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $simplify_individualasfn_expressions_isa_sentences_to_add$.currentBinding(thread);
        try {
            $simplify_individualasfn_expressions_isa_sentences_to_add$.bind(NIL, thread);
            SubLObject result = transform_list_utilities.transform(expression, symbol_function($sym34$INDIVIDUALASFN_EXPRESSION_), symbol_function(TRANSFORM_INDIVIDUALASFN_EXPRESSION), UNPROVIDED);
            SubLObject cdolist_list_var = $simplify_individualasfn_expressions_isa_sentences_to_add$.getDynamicValue(thread);
            SubLObject isa_sentence = NIL;
            isa_sentence = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                result = make_conjunction(list(result, isa_sentence));
                cdolist_list_var = cdolist_list_var.rest();
                isa_sentence = cdolist_list_var.first();
            } 
            return result;
        } finally {
            $simplify_individualasfn_expressions_isa_sentences_to_add$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject transform_individualasfn_expression(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ind = cycl_utilities.formula_arg1(expression, UNPROVIDED);
        final SubLObject col = cycl_utilities.formula_arg2(expression, UNPROVIDED);
        final SubLObject item_var = simplify_individualasfn_expressions(make_binary_formula($$isa, ind, col));
        if (NIL == member(item_var, $simplify_individualasfn_expressions_isa_sentences_to_add$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
            $simplify_individualasfn_expressions_isa_sentences_to_add$.setDynamicValue(cons(item_var, $simplify_individualasfn_expressions_isa_sentences_to_add$.getDynamicValue(thread)), thread);
        }
        return ind;
    }

    public static SubLObject individualasfn_expressionP(final SubLObject expression) {
        return makeBoolean((NIL != possibly_naut_p(expression)) && (NIL != kb_utilities.kbeq($$IndividualAsFn, cycl_utilities.formula_arg0(expression))));
    }

    public static final SubLObject simplify_redundanciesP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $simplify_redundanciesP$.getDynamicValue(thread);
        }
    }

    public static SubLObject simplify_redundanciesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return czer_vars.$simplify_redundanciesP$.getDynamicValue(thread);
    }

    /**
     * A #$Kappa expression can be simplified by substituting the
     * arguments of the kappa expression into the arg2 of #$Kappa.
     *
     * @see :kappa-simplify-unary
     * @see :simplifier-kappa-test
     */
    @LispMethod(comment = "A #$Kappa expression can be simplified by substituting the\r\narguments of the kappa expression into the arg2 of #$Kappa.\r\n\r\n@see :kappa-simplify-unary\r\n@see :simplifier-kappa-test\nA #$Kappa expression can be simplified by substituting the\narguments of the kappa expression into the arg2 of #$Kappa.")
    public static final SubLObject simplify_kappa_asent_alt(SubLObject asent) {
        {
            SubLObject kappa_pred = cycl_utilities.formula_operator(asent);
            if (formula_arity(asent, UNPROVIDED).numE(kappa_predicate_arity(kappa_pred))) {
                {
                    SubLObject actual_args = cycl_utilities.formula_args(asent, UNPROVIDED);
                    SubLObject formal_args = kappa_predicate_formal_args(kappa_pred);
                    SubLObject kappa_query = kappa_predicate_query(kappa_pred);
                    SubLObject actual_arg = NIL;
                    SubLObject actual_arg_3 = NIL;
                    SubLObject formal_arg = NIL;
                    SubLObject formal_arg_4 = NIL;
                    for (actual_arg = actual_args, actual_arg_3 = actual_arg.first(), formal_arg = formal_args, formal_arg_4 = formal_arg.first(); !((NIL == formal_arg) && (NIL == actual_arg)); actual_arg = actual_arg.rest() , actual_arg_3 = actual_arg.first() , formal_arg = formal_arg.rest() , formal_arg_4 = formal_arg.first()) {
                        kappa_query = cycl_utilities.formula_subst(actual_arg_3, formal_arg_4, kappa_query, UNPROVIDED, UNPROVIDED);
                    }
                    asent = make_unary_formula($$trueSentence, kappa_query);
                }
            }
            return asent;
        }
    }

    /**
     * A #$Kappa expression can be simplified by substituting the
     * arguments of the kappa expression into the arg2 of #$Kappa.
     *
     * @see :kappa-simplify-unary
     * @see :simplifier-kappa-test
     */
    @LispMethod(comment = "A #$Kappa expression can be simplified by substituting the\r\narguments of the kappa expression into the arg2 of #$Kappa.\r\n\r\n@see :kappa-simplify-unary\r\n@see :simplifier-kappa-test\nA #$Kappa expression can be simplified by substituting the\narguments of the kappa expression into the arg2 of #$Kappa.")
    public static SubLObject simplify_kappa_asent(SubLObject asent) {
        final SubLObject kappa_pred = cycl_utilities.formula_operator(asent);
        if (formula_arity(asent, UNPROVIDED).numE(kappa_predicate_arity(kappa_pred))) {
            final SubLObject actual_args = cycl_utilities.formula_args(asent, UNPROVIDED);
            final SubLObject formal_args = kappa_predicate_formal_args(kappa_pred);
            SubLObject kappa_query = kappa_predicate_query(kappa_pred);
            SubLObject actual_arg = NIL;
            SubLObject actual_arg_$13 = NIL;
            SubLObject formal_arg = NIL;
            SubLObject formal_arg_$14 = NIL;
            actual_arg = actual_args;
            actual_arg_$13 = actual_arg.first();
            formal_arg = formal_args;
            formal_arg_$14 = formal_arg.first();
            while ((NIL != formal_arg) || (NIL != actual_arg)) {
                kappa_query = cycl_utilities.formula_subst(actual_arg_$13, formal_arg_$14, kappa_query, UNPROVIDED, UNPROVIDED);
                actual_arg = actual_arg.rest();
                actual_arg_$13 = actual_arg.first();
                formal_arg = formal_arg.rest();
                formal_arg_$14 = formal_arg.first();
            } 
            asent = make_unary_formula($$trueSentence, kappa_query);
        }
        return asent;
    }

    /**
     * distribute #$ist over #$and
     * turn (#$ist #$FooMt (#$ist #$BarMt ...)) into (#$ist #$BarMt ...)
     */
    @LispMethod(comment = "distribute #$ist over #$and\r\nturn (#$ist #$FooMt (#$ist #$BarMt ...)) into (#$ist #$BarMt ...)\ndistribute #$ist over #$and\nturn (#$ist #$FooMt (#$ist #$BarMt ...)) into (#$ist #$BarMt ...)")
    public static final SubLObject simplify_ist_sentence_alt(SubLObject ist_sentence) {
        {
            SubLObject mt = designated_mt(ist_sentence);
            SubLObject subsentence = designated_sentence(ist_sentence);
            if (NIL != el_conjunction_p(subsentence)) {
                {
                    SubLObject new_args = NIL;
                    SubLObject args = cycl_utilities.formula_args(subsentence, $IGNORE);
                    SubLObject cdolist_list_var = args;
                    SubLObject conjunct = NIL;
                    for (conjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , conjunct = cdolist_list_var.first()) {
                        {
                            SubLObject new_arg = list($$ist, mt, conjunct);
                            new_args = cons(new_arg, new_args);
                        }
                    }
                    return make_conjunction(nreverse(new_args));
                }
            } else {
                if (NIL != ist_sentence_p(subsentence)) {
                    return com.cyc.cycjava.cycl.simplifier.simplify_ist_sentence(subsentence);
                }
            }
        }
        return ist_sentence;
    }

    /**
     * distribute #$ist over #$and
     * turn (#$ist #$FooMt (#$ist #$BarMt ...)) into (#$ist #$BarMt ...)
     */
    @LispMethod(comment = "distribute #$ist over #$and\r\nturn (#$ist #$FooMt (#$ist #$BarMt ...)) into (#$ist #$BarMt ...)\ndistribute #$ist over #$and\nturn (#$ist #$FooMt (#$ist #$BarMt ...)) into (#$ist #$BarMt ...)")
    public static SubLObject simplify_ist_sentence(final SubLObject ist_sentence) {
        final SubLObject mt = designated_mt(ist_sentence);
        final SubLObject subsentence = designated_sentence(ist_sentence);
        if (NIL != el_conjunction_p(subsentence)) {
            SubLObject new_args = NIL;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(subsentence, $IGNORE);
            SubLObject conjunct = NIL;
            conjunct = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject new_arg = list($$ist, mt, conjunct);
                new_args = cons(new_arg, new_args);
                cdolist_list_var = cdolist_list_var.rest();
                conjunct = cdolist_list_var.first();
            } 
            return make_conjunction(nreverse(new_args));
        }
        if (NIL != ist_sentence_p(subsentence, UNPROVIDED)) {
            return simplify_ist_sentence(subsentence);
        }
        return ist_sentence;
    }

    public static SubLObject fold_equals(SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sentence = simplify_cycl_sentence(simplify_cycl_sentence_syntax(sentence, UNPROVIDED), UNPROVIDED);
        final SubLObject _prev_bind_0 = czer_vars.$simplify_equality_literalsP$.currentBinding(thread);
        try {
            czer_vars.$simplify_equality_literalsP$.bind(T, thread);
            return simplify_cycl_sentence(sentence, UNPROVIDED);
        } finally {
            czer_vars.$simplify_equality_literalsP$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject fold_equals_in_asent(final SubLObject asent, final SubLObject equality_dict, SubLObject elP, SubLObject fold_equalsP, SubLObject if_var_appears_in) {
        if (elP == UNPROVIDED) {
            elP = NIL;
        }
        if (fold_equalsP == UNPROVIDED) {
            fold_equalsP = NIL;
        }
        if (if_var_appears_in == UNPROVIDED) {
            if_var_appears_in = NIL;
        }
        if (NIL != equality_literalP(asent, fold_equalsP)) {
            return do_fold_equals_in_asent(asent, equality_dict, elP, if_var_appears_in);
        }
        return NIL;
    }

    public static SubLObject do_fold_equals_in_asent(final SubLObject asent, final SubLObject equality_dict, final SubLObject elP, final SubLObject if_var_appears_in) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject conflict_vars = NIL;
        final SubLObject varP = (NIL != elP) ? $sym8$CYC_VAR_ : HL_VARIABLE_P;
        thread.resetMultipleValues();
        final SubLObject pred = unmake_binary_formula(asent);
        final SubLObject arg1 = thread.secondMultipleValue();
        final SubLObject arg2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject open_term = NIL;
        SubLObject closed_term = NIL;
        if ((NIL == groundP(arg1, varP)) && (NIL != closedP(arg2, UNPROVIDED))) {
            open_term = arg1;
            closed_term = arg2;
        } else
            if ((NIL == groundP(arg2, varP)) && (NIL != closedP(arg1, UNPROVIDED))) {
                open_term = arg2;
                closed_term = arg1;
            }

        if ((NIL != open_term) && (NIL != closed_term)) {
            final SubLObject open_term_vars = (NIL != if_var_appears_in) ? cycl_utilities.expression_gather(open_term, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
            if ((NIL == if_var_appears_in) || (NIL != cycl_utilities.expression_find_any(open_term_vars, if_var_appears_in, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                final SubLObject closed_term_to_unify = (pred.eql($$indexicalReferent)) ? removal_modules_indexical_referent.cyc_indexical_referent(closed_term) : closed_term;
                thread.resetMultipleValues();
                final SubLObject new_bindings = (NIL != elP) ? unification_utilities.unify_el_terms(open_term, closed_term_to_unify, UNPROVIDED) : unification.unify(open_term, closed_term_to_unify, T, UNPROVIDED);
                final SubLObject justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject cdolist_list_var = new_bindings;
                SubLObject new_binding = NIL;
                new_binding = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = new_binding;
                    SubLObject var = NIL;
                    SubLObject binding = NIL;
                    destructuring_bind_must_consp(current, datum, $list42);
                    var = current.first();
                    current = binding = current.rest();
                    final SubLObject existing_binding = dictionary.dictionary_lookup(equality_dict, var, UNPROVIDED);
                    if ((NIL != existing_binding) && (!binding.equal(existing_binding))) {
                        conflict_vars = cons(var, conflict_vars);
                    } else {
                        note_fold_equals_binding(equality_dict, var, binding);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    new_binding = cdolist_list_var.first();
                } 
            }
        }
        return nreverse(conflict_vars);
    }

    public static SubLObject note_fold_equals_binding(final SubLObject equality_dict, final SubLObject var, final SubLObject binding) {
        return dictionary.dictionary_enter(equality_dict, var, binding);
    }

    /**
     *
     *
     * @return EL formula; a recursively simplified version of FORMULA wrt sequence variables.
     */
    @LispMethod(comment = "@return EL formula; a recursively simplified version of FORMULA wrt sequence variables.")
    public static final SubLObject simplify_sequence_variables_alt(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $el_symbol_suffix_table$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $standardize_variables_memory$.currentBinding(thread);
                    try {
                        $el_symbol_suffix_table$.bind(NIL != $el_symbol_suffix_table$.getDynamicValue(thread) ? ((SubLObject) ($el_symbol_suffix_table$.getDynamicValue(thread))) : make_hash_table($int$32, symbol_function(EQL), UNPROVIDED), thread);
                        $standardize_variables_memory$.bind(NIL != $standardize_variables_memory$.getDynamicValue(thread) ? ((SubLObject) ($standardize_variables_memory$.getDynamicValue(thread))) : NIL, thread);
                        result = com.cyc.cycjava.cycl.simplifier.simplify_sequence_variables_1(formula);
                    } finally {
                        $standardize_variables_memory$.rebind(_prev_bind_1, thread);
                        $el_symbol_suffix_table$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @return EL formula; a recursively simplified version of FORMULA wrt sequence variables.
     */
    @LispMethod(comment = "@return EL formula; a recursively simplified version of FORMULA wrt sequence variables.")
    public static SubLObject simplify_sequence_variables(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
        try {
            czer_vars.$el_symbol_suffix_table$.bind(NIL != czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread) ? czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread) : make_hash_table($int$32, symbol_function(EQL), UNPROVIDED), thread);
            czer_vars.$standardize_variables_memory$.bind(NIL != czer_vars.$standardize_variables_memory$.getDynamicValue(thread) ? czer_vars.$standardize_variables_memory$.getDynamicValue(thread) : NIL, thread);
            result = simplify_sequence_variables_1(formula);
        } finally {
            czer_vars.$standardize_variables_memory$.rebind(_prev_bind_2, thread);
            czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * A version of @xref simplify-sequence-variables to call if you already have the EL variable namespace bound.
     */
    @LispMethod(comment = "A version of @xref simplify-sequence-variables to call if you already have the EL variable namespace bound.")
    public static final SubLObject simplify_sequence_variables_1_alt(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == possibly_sentence_p(formula)) {
                return formula;
            }
            {
                SubLObject result = NIL;
                if (NIL != $simplifying_sequence_variablesP$.getDynamicValue(thread)) {
                    result = formula;
                } else {
                    if (NIL != cycl_utilities.formula_find_if(symbol_function($sym27$FORMULA_WITH_SEQUENCE_TERM_), formula, NIL, UNPROVIDED)) {
                        if (NIL != subformulas_wf_wrt_sequence_varsP(formula)) {
                            {
                                SubLObject _prev_bind_0 = $simplifying_sequence_variablesP$.currentBinding(thread);
                                try {
                                    $simplifying_sequence_variablesP$.bind(T, thread);
                                    result = com.cyc.cycjava.cycl.simplifier.simplify_sequence_variables_int(formula, NIL, NIL);
                                } finally {
                                    $simplifying_sequence_variablesP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } else {
                            result = NIL;
                        }
                    } else {
                        result = formula;
                    }
                }
                return result;
            }
        }
    }

    /**
     * A version of @xref simplify-sequence-variables to call if you already have the EL variable namespace bound.
     */
    @LispMethod(comment = "A version of @xref simplify-sequence-variables to call if you already have the EL variable namespace bound.")
    public static SubLObject simplify_sequence_variables_1(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == possibly_sentence_p(formula)) {
            return formula;
        }
        SubLObject result = NIL;
        if (NIL != $simplifying_sequence_variablesP$.getDynamicValue(thread)) {
            result = formula;
        } else
            if (NIL != cycl_utilities.formula_find_if(symbol_function($sym44$FORMULA_WITH_SEQUENCE_TERM_), formula, NIL, UNPROVIDED)) {
                if (NIL != subformulas_wf_wrt_sequence_varsP(formula)) {
                    final SubLObject _prev_bind_0 = $simplifying_sequence_variablesP$.currentBinding(thread);
                    try {
                        $simplifying_sequence_variablesP$.bind(T, thread);
                        result = simplify_sequence_variables_int(formula, NIL, NIL);
                    } finally {
                        $simplifying_sequence_variablesP$.rebind(_prev_bind_0, thread);
                    }
                } else {
                    result = NIL;
                }
            } else {
                result = formula;
            }

        return result;
    }

    /**
     *
     *
     * @return 0 formula			; a potentially simplified version of FORMULA
     * @return 1 queue			; a list of (<keyword> . <info>) dotted pairs, indicating simplifications to be tried.
     */
    @LispMethod(comment = "@return 0 formula\t\t\t; a potentially simplified version of FORMULA\r\n@return 1 queue\t\t\t; a list of (<keyword> . <info>) dotted pairs, indicating simplifications to be tried.")
    public static final SubLObject simplify_sequence_variables_int_alt(SubLObject formula, SubLObject dont_mess_with_these_variables, SubLObject scoped_variables) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (((NIL == relation_expressionP(formula)) || (NIL != subl_escape_p(formula))) || (NIL != cycl_grammar.fast_cycl_quoted_term_p(formula))) {
                return values(formula, NIL);
            }
            {
                SubLObject sentence_free_variables = sentence_free_variables(formula, scoped_variables, UNPROVIDED, UNPROVIDED);
                SubLObject new_scoped_vars = scoped_vars(formula, UNPROVIDED);
                SubLObject seqvar = sequence_var(formula, UNPROVIDED);
                SubLObject issue = com.cyc.cycjava.cycl.simplifier.possible_sequence_var_simplification(formula, seqvar);
                SubLObject queue = NIL;
                SubLObject new_terms = NIL;
                scoped_variables = fast_delete_duplicates(append(scoped_variables, new_scoped_vars), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                {
                    SubLObject cdolist_list_var = cycl_utilities.formula_terms(formula, $IGNORE);
                    SubLObject subformula = NIL;
                    for (subformula = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subformula = cdolist_list_var.first()) {
                        {
                            SubLObject subsentence_free_variables = sentence_free_variables(subformula, scoped_variables, UNPROVIDED, UNPROVIDED);
                            SubLObject new_dont_touch_vars = fast_delete_duplicates(append(dont_mess_with_these_variables, set_difference(intersection(subsentence_free_variables, sentence_free_variables, UNPROVIDED, UNPROVIDED), new_scoped_vars, UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            thread.resetMultipleValues();
                            {
                                SubLObject simplified_subformula = com.cyc.cycjava.cycl.simplifier.simplify_sequence_variables_int(subformula, new_dont_touch_vars, scoped_variables);
                                SubLObject sub_queue = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                queue = append(queue, sub_queue);
                                new_terms = cons(simplified_subformula, new_terms);
                            }
                        }
                    }
                }
                new_terms = nreverse(new_terms);
                formula = make_formula(new_terms.first(), new_terms.rest(), seqvar);
                dont_mess_with_these_variables = append(appearing_as_both_sequence_and_term_variables(formula), dont_mess_with_these_variables);
                if (NIL != issue) {
                    queue = cons(issue, queue);
                }
                queue = fast_delete_duplicates(queue, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                {
                    SubLObject processed_pairs = NIL;
                    {
                        SubLObject cdolist_list_var = queue;
                        SubLObject pair = NIL;
                        for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                            {
                                SubLObject method = pair.first();
                                SubLObject info = pair.rest();
                                SubLObject sub_seqvar = (method == $SPLIT) ? ((SubLObject) (fourth(info))) : info;
                                if (NIL == subl_promotions.memberP(sub_seqvar, dont_mess_with_these_variables, UNPROVIDED, UNPROVIDED)) {
                                    {
                                        SubLObject pcase_var = method;
                                        if (pcase_var.eql($IGNORE)) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject new_formula = com.cyc.cycjava.cycl.simplifier.ignore_sequence_var_if_wff(formula, sub_seqvar, UNPROVIDED);
                                                SubLObject wffP = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if (NIL != wffP) {
                                                    formula = new_formula;
                                                    processed_pairs = cons(pair, processed_pairs);
                                                }
                                            }
                                        } else {
                                            if (pcase_var.eql($REGULARIZE)) {
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject new_formula = com.cyc.cycjava.cycl.simplifier.regularize_sequence_var_if_wff(formula, sub_seqvar, UNPROVIDED);
                                                    SubLObject wffP = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (NIL != wffP) {
                                                        formula = new_formula;
                                                        processed_pairs = cons(pair, processed_pairs);
                                                    }
                                                }
                                            } else {
                                                if (pcase_var.eql($SPLIT)) {
                                                    if (NIL == subl_promotions.memberP(sub_seqvar, scoped_variables, UNPROVIDED, UNPROVIDED)) {
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject new_formula = com.cyc.cycjava.cycl.simplifier.split_sequence_var_if_wff(formula, info.first(), second(info), third(info), fourth(info), UNPROVIDED);
                                                            SubLObject wffP = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            if (NIL != wffP) {
                                                                formula = new_formula;
                                                                processed_pairs = cons(pair, processed_pairs);
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
                    {
                        SubLObject cdolist_list_var = processed_pairs;
                        SubLObject pair = NIL;
                        for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                            queue = delete(pair, queue, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = new_scoped_vars;
                    SubLObject scoped_var = NIL;
                    for (scoped_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , scoped_var = cdolist_list_var.first()) {
                        {
                            SubLObject cdolist_list_var_5 = queue;
                            SubLObject pair = NIL;
                            for (pair = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest() , pair = cdolist_list_var_5.first()) {
                                if (scoped_var.eql(pair.rest())) {
                                    queue = delete(pair, queue, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            }
                        }
                    }
                }
                return values(formula, queue);
            }
        }
    }

    /**
     *
     *
     * @return 0 formula			; a potentially simplified version of FORMULA
     * @return 1 queue			; a list of (<keyword> . <info>) dotted pairs, indicating simplifications to be tried.
     */
    @LispMethod(comment = "@return 0 formula\t\t\t; a potentially simplified version of FORMULA\r\n@return 1 queue\t\t\t; a list of (<keyword> . <info>) dotted pairs, indicating simplifications to be tried.")
    public static SubLObject simplify_sequence_variables_int(SubLObject formula, SubLObject dont_mess_with_these_variables, SubLObject scoped_variables) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL == relation_expressionP(formula)) || (NIL != subl_escape_p(formula))) || (NIL != cycl_grammar.fast_cycl_quoted_term_p(formula))) {
            return values(formula, NIL);
        }
        final SubLObject sentence_free_variables = sentence_free_variables(formula, scoped_variables, UNPROVIDED, UNPROVIDED);
        final SubLObject new_scoped_vars = scoped_vars(formula, UNPROVIDED);
        final SubLObject seqvar = sequence_var(formula, UNPROVIDED);
        final SubLObject issue = possible_sequence_var_simplification(formula, seqvar);
        SubLObject queue = NIL;
        SubLObject new_terms = NIL;
        scoped_variables = list_utilities.fast_delete_duplicates(append(scoped_variables, new_scoped_vars), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = cycl_utilities.formula_terms(formula, $IGNORE);
        SubLObject subformula = NIL;
        subformula = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject subsentence_free_variables = sentence_free_variables(subformula, scoped_variables, UNPROVIDED, UNPROVIDED);
            final SubLObject new_dont_touch_vars = list_utilities.fast_delete_duplicates(append(dont_mess_with_these_variables, set_difference(intersection(subsentence_free_variables, sentence_free_variables, UNPROVIDED, UNPROVIDED), new_scoped_vars, UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject simplified_subformula = simplify_sequence_variables_int(subformula, new_dont_touch_vars, scoped_variables);
            final SubLObject sub_queue = thread.secondMultipleValue();
            thread.resetMultipleValues();
            queue = append(queue, sub_queue);
            new_terms = cons(simplified_subformula, new_terms);
            cdolist_list_var = cdolist_list_var.rest();
            subformula = cdolist_list_var.first();
        } 
        new_terms = nreverse(new_terms);
        formula = make_formula(new_terms.first(), new_terms.rest(), seqvar);
        dont_mess_with_these_variables = append(appearing_as_both_sequence_and_term_variables(formula), dont_mess_with_these_variables);
        if (NIL != issue) {
            queue = cons(issue, queue);
        }
        queue = list_utilities.fast_delete_duplicates(queue, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject processed_pairs = NIL;
        SubLObject cdolist_list_var2 = queue;
        SubLObject pair = NIL;
        pair = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject method = pair.first();
            final SubLObject info = pair.rest();
            final SubLObject sub_seqvar = (method == $SPLIT) ? fourth(info) : info;
            if (NIL == subl_promotions.memberP(sub_seqvar, dont_mess_with_these_variables, UNPROVIDED, UNPROVIDED)) {
                final SubLObject pcase_var = method;
                if (pcase_var.eql($IGNORE)) {
                    thread.resetMultipleValues();
                    final SubLObject new_formula = ignore_sequence_var_if_wff(formula, sub_seqvar, UNPROVIDED);
                    final SubLObject wffP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != wffP) {
                        formula = new_formula;
                        processed_pairs = cons(pair, processed_pairs);
                    }
                } else
                    if (pcase_var.eql($REGULARIZE)) {
                        thread.resetMultipleValues();
                        final SubLObject new_formula = regularize_sequence_var_if_wff(formula, sub_seqvar, UNPROVIDED);
                        final SubLObject wffP = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != wffP) {
                            formula = new_formula;
                            processed_pairs = cons(pair, processed_pairs);
                        }
                    } else
                        if (pcase_var.eql($SPLIT) && (NIL == subl_promotions.memberP(sub_seqvar, scoped_variables, UNPROVIDED, UNPROVIDED))) {
                            thread.resetMultipleValues();
                            final SubLObject new_formula = split_sequence_var_if_wff(formula, info.first(), second(info), third(info), fourth(info), UNPROVIDED);
                            final SubLObject wffP = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != wffP) {
                                formula = new_formula;
                                processed_pairs = cons(pair, processed_pairs);
                            }
                        }


            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            pair = cdolist_list_var2.first();
        } 
        cdolist_list_var2 = processed_pairs;
        pair = NIL;
        pair = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            queue = delete(pair, queue, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cdolist_list_var2 = cdolist_list_var2.rest();
            pair = cdolist_list_var2.first();
        } 
        cdolist_list_var = new_scoped_vars;
        SubLObject scoped_var = NIL;
        scoped_var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$15 = queue;
            SubLObject pair2 = NIL;
            pair2 = cdolist_list_var_$15.first();
            while (NIL != cdolist_list_var_$15) {
                if (scoped_var.eql(pair2.rest())) {
                    queue = delete(pair2, queue, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                pair2 = cdolist_list_var_$15.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            scoped_var = cdolist_list_var.first();
        } 
        return values(formula, queue);
    }

    /**
     *
     *
     * @param seqvar
     * 		EL variable; the EL variable at the end of FORMULA.
     * 		Returns a (<keyword> . <info>) dotted pair if FORMULA could be simplified by doing <keyword>.
     * 		Returns NIL if no simplification is possible.
     */
    @LispMethod(comment = "@param seqvar\r\n\t\tEL variable; the EL variable at the end of FORMULA.\r\n\t\tReturns a (<keyword> . <info>) dotted pair if FORMULA could be simplified by doing <keyword>.\r\n\t\tReturns NIL if no simplification is possible.")
    public static final SubLObject possible_sequence_var_simplification_alt(SubLObject formula, SubLObject seqvar) {
        if (NIL == seqvar) {
            return NIL;
        }
        if ((NIL != com.cyc.cycjava.cycl.simplifier.simplify_sequence_vars_using_kb_arityP()) || (NIL != cyc_const_logical_operator_p(cycl_utilities.formula_arg0(formula)))) {
            {
                SubLObject reln_arity_max = (NIL != cyc_const_logical_operator_p(cycl_utilities.formula_arg0(formula))) ? ((SubLObject) (arity.logical_operator_arity(cycl_utilities.formula_arg0(formula)))) : arity.max_arity(cycl_utilities.formula_arg0(formula));
                SubLObject reln_arity_min = (NIL != cyc_const_logical_operator_p(cycl_utilities.formula_arg0(formula))) ? ((SubLObject) (arity.logical_operator_arity(cycl_utilities.formula_arg0(formula)))) : arity.min_arity(cycl_utilities.formula_arg0(formula));
                SubLObject formula_arity = formula_arity(formula, $IGNORE);
                if (!reln_arity_max.isInteger()) {
                    return NIL;
                } else {
                    if (formula_arity.numE(subtract(reln_arity_max, ONE_INTEGER))) {
                        return cons($REGULARIZE, seqvar);
                    } else {
                        if (formula_arity.numE(reln_arity_max)) {
                            return cons($IGNORE, seqvar);
                        } else {
                            if (!reln_arity_min.isInteger()) {
                                return NIL;
                            } else {
                                if (formula_arity.numL(subtract(reln_arity_min, ONE_INTEGER)) && reln_arity_min.numE(reln_arity_max)) {
                                    return cons($SPLIT, list(arity.variable_arityP(formula), reln_arity_min, formula_arity, seqvar));
                                } else {
                                    return NIL;
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param seqvar
     * 		EL variable; the EL variable at the end of FORMULA.
     * 		Returns a (<keyword> . <info>) dotted pair if FORMULA could be simplified by doing <keyword>.
     * 		Returns NIL if no simplification is possible.
     */
    @LispMethod(comment = "@param seqvar\r\n\t\tEL variable; the EL variable at the end of FORMULA.\r\n\t\tReturns a (<keyword> . <info>) dotted pair if FORMULA could be simplified by doing <keyword>.\r\n\t\tReturns NIL if no simplification is possible.")
    public static SubLObject possible_sequence_var_simplification(final SubLObject formula, final SubLObject seqvar) {
        if (NIL == seqvar) {
            return NIL;
        }
        if ((NIL == simplify_sequence_vars_using_kb_arityP()) && (NIL == cyc_const_logical_operator_p(cycl_utilities.formula_arg0(formula)))) {
            return NIL;
        }
        final SubLObject reln_arity_max = (NIL != cyc_const_logical_operator_p(cycl_utilities.formula_arg0(formula))) ? arity.logical_operator_arity(cycl_utilities.formula_arg0(formula)) : arity.max_arity(cycl_utilities.formula_arg0(formula));
        final SubLObject reln_arity_min = (NIL != cyc_const_logical_operator_p(cycl_utilities.formula_arg0(formula))) ? arity.logical_operator_arity(cycl_utilities.formula_arg0(formula)) : arity.min_arity(cycl_utilities.formula_arg0(formula));
        final SubLObject formula_arity = formula_arity(formula, $IGNORE);
        if (!reln_arity_max.isInteger()) {
            return NIL;
        }
        if (formula_arity.numE(subtract(reln_arity_max, ONE_INTEGER))) {
            return cons($REGULARIZE, seqvar);
        }
        if (formula_arity.numE(reln_arity_max)) {
            return cons($IGNORE, seqvar);
        }
        if (!reln_arity_min.isInteger()) {
            return NIL;
        }
        if (formula_arity.numL(subtract(reln_arity_min, ONE_INTEGER)) && reln_arity_min.numE(reln_arity_max)) {
            return cons($SPLIT, list(arity.variable_arityP(formula), reln_arity_min, formula_arity, seqvar));
        }
        return NIL;
    }

    public static final SubLObject simplify_sequence_vars_using_kb_arityP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != $simplify_sequence_vars_using_kb_arityP$.getDynamicValue(thread)) && (NIL != $simplify_using_semanticsP$.getDynamicValue(thread)));
        }
    }

    public static SubLObject simplify_sequence_vars_using_kb_arityP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != czer_vars.$simplify_sequence_vars_using_kb_arityP$.getDynamicValue(thread)) && (NIL != czer_vars.$simplify_using_semanticsP$.getDynamicValue(thread)));
    }

    /**
     * Replaces SEQVAR with NIL in FORMULA if the result is wff.
     *
     * @return 0 formula
     * @return 1 boolean; t iff a change was made to FORMULA.
    e.g. transforms (<pred> ?X ?Y . ?Z) into (<pred> ?X ?Y) iff (<pred> ?X ?Y) is wff.
     */
    @LispMethod(comment = "Replaces SEQVAR with NIL in FORMULA if the result is wff.\r\n\r\n@return 0 formula\r\n@return 1 boolean; t iff a change was made to FORMULA.\r\ne.g. transforms (<pred> ?X ?Y . ?Z) into (<pred> ?X ?Y) iff (<pred> ?X ?Y) is wff.")
    public static final SubLObject ignore_sequence_var_if_wff_alt(SubLObject formula, SubLObject seqvar, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == seqvar) {
                return values(formula, NIL);
            }
            {
                SubLObject new_formula = variable_subst(NIL, seqvar, formula);
                SubLObject wffP = NIL;
                {
                    SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_3 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
                    try {
                        at_vars.$noting_at_violationsP$.bind(NIL, thread);
                        at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
                        wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
                        wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
                        wffP = wff.el_wffP(new_formula, mt, UNPROVIDED);
                    } finally {
                        wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_3, thread);
                        wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_2, thread);
                        at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_1, thread);
                        at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return NIL != wffP ? ((SubLObject) (values(new_formula, T))) : values(formula, NIL);
            }
        }
    }

    /**
     * Replaces SEQVAR with NIL in FORMULA if the result is wff.
     *
     * @return 0 formula
     * @return 1 boolean; t iff a change was made to FORMULA.
    e.g. transforms (<pred> ?X ?Y . ?Z) into (<pred> ?X ?Y) iff (<pred> ?X ?Y) is wff.
     */
    @LispMethod(comment = "Replaces SEQVAR with NIL in FORMULA if the result is wff.\r\n\r\n@return 0 formula\r\n@return 1 boolean; t iff a change was made to FORMULA.\r\ne.g. transforms (<pred> ?X ?Y . ?Z) into (<pred> ?X ?Y) iff (<pred> ?X ?Y) is wff.")
    public static SubLObject ignore_sequence_var_if_wff(final SubLObject formula, final SubLObject seqvar, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == seqvar) {
            return values(formula, NIL);
        }
        final SubLObject new_formula = variable_subst(NIL, seqvar, formula);
        SubLObject wffP = NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind(NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
            wffP = wff.el_wffP(new_formula, mt, UNPROVIDED);
        } finally {
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return NIL != wffP ? values(new_formula, T) : values(formula, NIL);
    }

    /**
     * Replaces SEQVAR with (SEQVAR) in FORMULA if the result is wff.
     *
     * @return 0 formula
     * @return 1 boolean; t iff a change was made to FORMULA.
    e.g. transforms (<pred> ?X ?Y . ?Z) into (<pred> ?X ?Y ?Z) iff (<pred> ?X ?Y ?Z) is wff.
     */
    @LispMethod(comment = "Replaces SEQVAR with (SEQVAR) in FORMULA if the result is wff.\r\n\r\n@return 0 formula\r\n@return 1 boolean; t iff a change was made to FORMULA.\r\ne.g. transforms (<pred> ?X ?Y . ?Z) into (<pred> ?X ?Y ?Z) iff (<pred> ?X ?Y ?Z) is wff.")
    public static final SubLObject regularize_sequence_var_if_wff_alt(SubLObject formula, SubLObject seqvar, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == seqvar) {
                return values(formula, NIL);
            }
            {
                SubLObject new_formula = variable_subst(list(seqvar), seqvar, formula);
                SubLObject wffP = NIL;
                {
                    SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_3 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
                    try {
                        at_vars.$noting_at_violationsP$.bind(NIL, thread);
                        at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
                        wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
                        wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
                        wffP = wff.el_wffP(new_formula, mt, UNPROVIDED);
                    } finally {
                        wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_3, thread);
                        wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_2, thread);
                        at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_1, thread);
                        at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return NIL != wffP ? ((SubLObject) (values(new_formula, T))) : values(formula, NIL);
            }
        }
    }

    /**
     * Replaces SEQVAR with (SEQVAR) in FORMULA if the result is wff.
     *
     * @return 0 formula
     * @return 1 boolean; t iff a change was made to FORMULA.
    e.g. transforms (<pred> ?X ?Y . ?Z) into (<pred> ?X ?Y ?Z) iff (<pred> ?X ?Y ?Z) is wff.
     */
    @LispMethod(comment = "Replaces SEQVAR with (SEQVAR) in FORMULA if the result is wff.\r\n\r\n@return 0 formula\r\n@return 1 boolean; t iff a change was made to FORMULA.\r\ne.g. transforms (<pred> ?X ?Y . ?Z) into (<pred> ?X ?Y ?Z) iff (<pred> ?X ?Y ?Z) is wff.")
    public static SubLObject regularize_sequence_var_if_wff(final SubLObject formula, final SubLObject seqvar, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == seqvar) {
            return values(formula, NIL);
        }
        final SubLObject new_formula = variable_subst(list(seqvar), seqvar, formula);
        SubLObject wffP = NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind(NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
            wffP = wff.el_wffP(new_formula, mt, UNPROVIDED);
        } finally {
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return NIL != wffP ? values(new_formula, T) : values(formula, NIL);
    }

    /**
     *
     *
     * @return 0 formula
     * @return 1 boolean; t iff a change was made to FORMULA.
    Splits a sequence variable into several new EL variables,
    enough so that the new formula will have an arity of ARITY-MIN, not including the sequence variable (if any).
    If SEQVAR occurs in a subformula of FORMULA as a sequence variable, it is also split.
    If reattach-sequence-variable? is t, a new sequence variable is created and attached to the end of the new formula.
    This is a destructive operation.
     * @param formula-arity
     * 		the arity of FORMULA.
     * @param seqvar
     * 		the sequence variable occurring in FORMULA.
     */
    @LispMethod(comment = "@return 0 formula\r\n@return 1 boolean; t iff a change was made to FORMULA.\r\nSplits a sequence variable into several new EL variables,\r\nenough so that the new formula will have an arity of ARITY-MIN, not including the sequence variable (if any).\r\nIf SEQVAR occurs in a subformula of FORMULA as a sequence variable, it is also split.\r\nIf reattach-sequence-variable? is t, a new sequence variable is created and attached to the end of the new formula.\r\nThis is a destructive operation.\r\n@param formula-arity\r\n\t\tthe arity of FORMULA.\r\n@param seqvar\r\n\t\tthe sequence variable occurring in FORMULA.")
    public static final SubLObject split_sequence_var_if_wff_alt(SubLObject formula, SubLObject reattach_sequence_variableP, SubLObject arity_min, SubLObject formula_arity, SubLObject seqvar, SubLObject mt) {
        if (reattach_sequence_variableP == UNPROVIDED) {
            reattach_sequence_variableP = NIL;
        }
        if (arity_min == UNPROVIDED) {
            arity_min = NIL;
        }
        if (formula_arity == UNPROVIDED) {
            formula_arity = NIL;
        }
        if (seqvar == UNPROVIDED) {
            seqvar = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = $mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != reattach_sequence_variableP) {
                el_error(TWO_INTEGER, $str_alt29$Splitting_sequence_variables_into, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (!arity_min.isInteger()) {
                arity_min = arity.min_arity(cycl_utilities.formula_arg0(formula));
                if (!arity_min.isInteger()) {
                    return formula;
                }
            }
            if (!formula_arity.isInteger()) {
                formula_arity = formula_arity(formula, $IGNORE);
                if (!formula_arity.isInteger()) {
                    return formula;
                }
            }
            if (NIL == cycl_variables.el_varP(seqvar)) {
                seqvar = sequence_var(formula, UNPROVIDED);
                if (NIL == cycl_variables.el_varP(seqvar)) {
                    return formula;
                }
            }
            {
                SubLObject new_variables = NIL;
                SubLObject cdotimes_end_var = subtract(arity_min, formula_arity);
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                    new_variables = cons(clausifier.el_uniquify(seqvar), new_variables);
                }
                {
                    SubLObject new_formula = variable_subst(nreverse(new_variables), seqvar, formula);
                    SubLObject wffP = NIL;
                    {
                        SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
                        SubLObject _prev_bind_1 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
                        SubLObject _prev_bind_2 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
                        SubLObject _prev_bind_3 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
                        try {
                            at_vars.$noting_at_violationsP$.bind(NIL, thread);
                            at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
                            wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
                            wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
                            wffP = wff.el_wffP(new_formula, mt, UNPROVIDED);
                        } finally {
                            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_3, thread);
                            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_2, thread);
                            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_1, thread);
                            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return NIL != wffP ? ((SubLObject) (values(new_formula, T))) : values(formula, NIL);
                }
            }
        }
    }

    /**
     *
     *
     * @return 0 formula
     * @return 1 boolean; t iff a change was made to FORMULA.
    Splits a sequence variable into several new EL variables,
    enough so that the new formula will have an arity of ARITY-MIN, not including the sequence variable (if any).
    If SEQVAR occurs in a subformula of FORMULA as a sequence variable, it is also split.
    If reattach-sequence-variable? is t, a new sequence variable is created and attached to the end of the new formula.
    This is a destructive operation.
     * @param formula-arity
     * 		the arity of FORMULA.
     * @param seqvar
     * 		the sequence variable occurring in FORMULA.
     */
    @LispMethod(comment = "@return 0 formula\r\n@return 1 boolean; t iff a change was made to FORMULA.\r\nSplits a sequence variable into several new EL variables,\r\nenough so that the new formula will have an arity of ARITY-MIN, not including the sequence variable (if any).\r\nIf SEQVAR occurs in a subformula of FORMULA as a sequence variable, it is also split.\r\nIf reattach-sequence-variable? is t, a new sequence variable is created and attached to the end of the new formula.\r\nThis is a destructive operation.\r\n@param formula-arity\r\n\t\tthe arity of FORMULA.\r\n@param seqvar\r\n\t\tthe sequence variable occurring in FORMULA.")
    public static SubLObject split_sequence_var_if_wff(final SubLObject formula, SubLObject reattach_sequence_variableP, SubLObject arity_min, SubLObject formula_arity, SubLObject seqvar, SubLObject mt) {
        if (reattach_sequence_variableP == UNPROVIDED) {
            reattach_sequence_variableP = NIL;
        }
        if (arity_min == UNPROVIDED) {
            arity_min = NIL;
        }
        if (formula_arity == UNPROVIDED) {
            formula_arity = NIL;
        }
        if (seqvar == UNPROVIDED) {
            seqvar = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != reattach_sequence_variableP) {
            el_error(TWO_INTEGER, $str46$Splitting_sequence_variables_into, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (!arity_min.isInteger()) {
            arity_min = arity.min_arity(cycl_utilities.formula_arg0(formula));
            if (!arity_min.isInteger()) {
                return formula;
            }
        }
        if (!formula_arity.isInteger()) {
            formula_arity = formula_arity(formula, $IGNORE);
            if (!formula_arity.isInteger()) {
                return formula;
            }
        }
        if (NIL == cycl_variables.el_varP(seqvar)) {
            seqvar = sequence_var(formula, UNPROVIDED);
            if (NIL == cycl_variables.el_varP(seqvar)) {
                return formula;
            }
        }
        SubLObject new_variables = NIL;
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = subtract(arity_min, formula_arity), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            new_variables = cons(clausifier.el_uniquify(seqvar), new_variables);
        }
        final SubLObject new_formula = variable_subst(nreverse(new_variables), seqvar, formula);
        SubLObject wffP = NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind(NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
            wffP = wff.el_wffP(new_formula, mt, UNPROVIDED);
        } finally {
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return NIL != wffP ? values(new_formula, T) : values(formula, NIL);
    }

    public static final SubLObject sequence_var_simplifiableP_alt(SubLObject formula) {
        return makeBoolean(!formula.equal(com.cyc.cycjava.cycl.simplifier.simplify_sequence_variables(formula)));
    }

    public static SubLObject sequence_var_simplifiableP(final SubLObject formula) {
        return makeBoolean(!formula.equal(simplify_sequence_variables(formula)));
    }

    public static SubLObject simplify_contradictions(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject asymmetry_foundP = NIL;
        if (NIL != el_conjunction_p(sentence)) {
            SubLObject asymmetric_pred_conjuncts = NIL;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, $IGNORE);
            SubLObject conjunct = NIL;
            conjunct = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != kb_accessors.asymmetric_predicateP(cycl_utilities.sentence_arg0(conjunct))) {
                    asymmetric_pred_conjuncts = cons(conjunct, asymmetric_pred_conjuncts);
                }
                cdolist_list_var = cdolist_list_var.rest();
                conjunct = cdolist_list_var.first();
            } 
            if (NIL != asymmetric_pred_conjuncts) {
                final SubLObject pred_to_conjuncts_dictionary = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                cdolist_list_var = asymmetric_pred_conjuncts;
                SubLObject asymmetric_pred_conjunct = NIL;
                asymmetric_pred_conjunct = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    dictionary_utilities.dictionary_push(pred_to_conjuncts_dictionary, cycl_utilities.sentence_arg0(asymmetric_pred_conjunct), asymmetric_pred_conjunct);
                    cdolist_list_var = cdolist_list_var.rest();
                    asymmetric_pred_conjunct = cdolist_list_var.first();
                } 
                cdolist_list_var = dictionary.dictionary_keys(pred_to_conjuncts_dictionary);
                SubLObject pred = NIL;
                pred = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$16 = asymmetric_pred_conjuncts;
                    SubLObject asymmetric_pred_conjunct2 = NIL;
                    asymmetric_pred_conjunct2 = cdolist_list_var_$16.first();
                    while (NIL != cdolist_list_var_$16) {
                        if (NIL != genl_predicates.genl_predicateP(pred, cycl_utilities.sentence_arg0(asymmetric_pred_conjunct2), UNPROVIDED, UNPROVIDED)) {
                            dictionary_utilities.dictionary_push(pred_to_conjuncts_dictionary, pred, asymmetric_pred_conjunct2);
                        }
                        cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                        asymmetric_pred_conjunct2 = cdolist_list_var_$16.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    pred = cdolist_list_var.first();
                } 
                SubLObject iteration_state;
                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(pred_to_conjuncts_dictionary)); (NIL == asymmetry_foundP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                    thread.resetMultipleValues();
                    pred = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    final SubLObject conjuncts = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != list_utilities.lengthGE(conjuncts, TWO_INTEGER, UNPROVIDED)) {
                        final SubLObject reversed_conjuncts = nreverse(conjuncts);
                        final SubLObject genl_pred_conjunct = reversed_conjuncts.first();
                        final SubLObject rest_conjuncts = reversed_conjuncts.rest();
                        if (NIL == asymmetry_foundP) {
                            SubLObject csome_list_var = rest_conjuncts;
                            SubLObject rest_conjunct = NIL;
                            rest_conjunct = csome_list_var.first();
                            while ((NIL == asymmetry_foundP) && (NIL != csome_list_var)) {
                                if (((!genl_pred_conjunct.equal(rest_conjunct)) && (NIL != kb_utilities.kbeq(cycl_utilities.sentence_arg1(genl_pred_conjunct, UNPROVIDED), cycl_utilities.sentence_arg2(rest_conjunct, UNPROVIDED)))) && (NIL != kb_utilities.kbeq(cycl_utilities.sentence_arg2(genl_pred_conjunct, UNPROVIDED), cycl_utilities.sentence_arg1(rest_conjunct, UNPROVIDED)))) {
                                    asymmetry_foundP = T;
                                }
                                csome_list_var = csome_list_var.rest();
                                rest_conjunct = csome_list_var.first();
                            } 
                        }
                    }
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
        }
        if (NIL != asymmetry_foundP) {
            return $$False;
        }
        return sentence;
    }

    /**
     * Simplifies transitive redundancies.
     * e.g. (#$or (#$isa ?X #$Dog) (#$isa ?X #$Poodle)) -> (#$isa ?X #$Dog)
     * Doesn't specially handle scoped variables with the same name as other variables.
     */
    @LispMethod(comment = "Simplifies transitive redundancies.\r\ne.g. (#$or (#$isa ?X #$Dog) (#$isa ?X #$Poodle)) -> (#$isa ?X #$Dog)\r\nDoesn\'t specially handle scoped variables with the same name as other variables.\nSimplifies transitive redundancies.\ne.g. (#$or (#$isa ?X #$Dog) (#$isa ?X #$Poodle)) -> (#$isa ?X #$Dog)\nDoesn\'t specially handle scoped variables with the same name as other variables.")
    public static final SubLObject simplify_transitive_redundancies_alt(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == possibly_sentence_p(sentence)) {
                return sentence;
            }
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $mt$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $simplifying_redundanciesP$.currentBinding(thread);
                    try {
                        $relevant_mt_function$.bind(possibly_in_mt_determine_function(mt_var), thread);
                        $mt$.bind(possibly_in_mt_determine_mt(mt_var), thread);
                        $simplifying_redundanciesP$.bind(T, thread);
                        {
                            SubLObject new_conjuncts = NIL;
                            thread.resetMultipleValues();
                            {
                                SubLObject cnf_sentence = clausifier.el_cnf(sentence, $mt$.getDynamicValue(thread));
                                SubLObject new_mt = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                {
                                    SubLObject mt_var_6 = new_mt;
                                    {
                                        SubLObject _prev_bind_0_7 = $relevant_mt_function$.currentBinding(thread);
                                        SubLObject _prev_bind_1_8 = $mt$.currentBinding(thread);
                                        try {
                                            $relevant_mt_function$.bind(possibly_in_mt_determine_function(mt_var_6), thread);
                                            $mt$.bind(possibly_in_mt_determine_mt(mt_var_6), thread);
                                            cnf_sentence = clausifier.force_into_cnf(cnf_sentence);
                                            if (NIL == el_conjunction_p(cnf_sentence)) {
                                                cnf_sentence = make_conjunction(list(cnf_sentence));
                                            }
                                            {
                                                SubLObject all_conjuncts = cycl_utilities.sentence_args(cnf_sentence, $IGNORE);
                                                SubLObject args = cycl_utilities.formula_args(cnf_sentence, $IGNORE);
                                                SubLObject cdolist_list_var = args;
                                                SubLObject conjunct = NIL;
                                                for (conjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , conjunct = cdolist_list_var.first()) {
                                                    if (NIL != com.cyc.cycjava.cycl.simplifier.subsumed_by_another_conjunctP(conjunct, remove(conjunct, all_conjuncts, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                                        all_conjuncts = remove(conjunct, all_conjuncts, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } else {
                                                        new_conjuncts = cons(com.cyc.cycjava.cycl.simplifier.simplify_transitive_redundancies_in_disjunction(conjunct), new_conjuncts);
                                                    }
                                                }
                                            }
                                            result = com.cyc.cycjava.cycl.simplifier.simplify_cycl_sentence_int(com.cyc.cycjava.cycl.simplifier.conjoin(nreverse(new_conjuncts), T), UNPROVIDED);
                                        } finally {
                                            $mt$.rebind(_prev_bind_1_8, thread);
                                            $relevant_mt_function$.rebind(_prev_bind_0_7, thread);
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        $simplifying_redundanciesP$.rebind(_prev_bind_2, thread);
                        $mt$.rebind(_prev_bind_1, thread);
                        $relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Simplifies transitive redundancies.
     * e.g. (#$or (#$isa ?X #$Dog) (#$isa ?X #$Poodle)) -> (#$isa ?X #$Dog)
     * Doesn't specially handle scoped variables with the same name as other variables.
     */
    @LispMethod(comment = "Simplifies transitive redundancies.\r\ne.g. (#$or (#$isa ?X #$Dog) (#$isa ?X #$Poodle)) -> (#$isa ?X #$Dog)\r\nDoesn\'t specially handle scoped variables with the same name as other variables.\nSimplifies transitive redundancies.\ne.g. (#$or (#$isa ?X #$Dog) (#$isa ?X #$Poodle)) -> (#$isa ?X #$Dog)\nDoesn\'t specially handle scoped variables with the same name as other variables.")
    public static SubLObject simplify_transitive_redundancies(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == possibly_sentence_p(sentence)) {
            return sentence;
        }
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $simplifying_redundanciesP$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            $simplifying_redundanciesP$.bind(T, thread);
            SubLObject new_conjuncts = NIL;
            thread.resetMultipleValues();
            SubLObject cnf_sentence = clausifier.el_cnf(sentence, mt_relevance_macros.$mt$.getDynamicValue(thread));
            final SubLObject new_mt = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject mt_var_$17 = new_mt;
            final SubLObject _prev_bind_0_$18 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$19 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var_$17), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var_$17), thread);
                cnf_sentence = clausifier.force_into_cnf(cnf_sentence);
                if (NIL == el_conjunction_p(cnf_sentence)) {
                    cnf_sentence = make_conjunction(list(cnf_sentence));
                }
                SubLObject all_conjuncts = cycl_utilities.sentence_args(cnf_sentence, $IGNORE);
                SubLObject cdolist_list_var;
                final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(cnf_sentence, $IGNORE);
                SubLObject conjunct = NIL;
                conjunct = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != subsumed_by_another_conjunctP(conjunct, remove(conjunct, all_conjuncts, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                        all_conjuncts = remove(conjunct, all_conjuncts, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else {
                        new_conjuncts = cons(simplify_transitive_redundancies_in_disjunction(conjunct), new_conjuncts);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    conjunct = cdolist_list_var.first();
                } 
                result = simplify_cycl_sentence_int(conjoin(nreverse(new_conjuncts), T), UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$19, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$18, thread);
            }
        } finally {
            $simplifying_redundanciesP$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Simplifies transitive redundancies in flat disjunctions only. For complex
     * disjunctions returns the input SENTENCE without simplifying any transitive
     * redundancies.
     *
     * @unknown @xref simplify-transitive-redundancies already works for arbitrarily complex
    disjunctions, but its output is always a conjunction. We devise this function
    to use in @xref simplify-cycl-disjunction only, where the output is desired to be
    a disjunction (rather than a conjunction).
     * @unknown This function will eventually be replaced by one that works for all
    sorts of disjunctions.
     */
    @LispMethod(comment = "Simplifies transitive redundancies in flat disjunctions only. For complex\r\ndisjunctions returns the input SENTENCE without simplifying any transitive\r\nredundancies.\r\n\r\n@unknown @xref simplify-transitive-redundancies already works for arbitrarily complex\r\ndisjunctions, but its output is always a conjunction. We devise this function\r\nto use in @xref simplify-cycl-disjunction only, where the output is desired to be\r\na disjunction (rather than a conjunction).\r\n@unknown This function will eventually be replaced by one that works for all\r\nsorts of disjunctions.\nSimplifies transitive redundancies in flat disjunctions only. For complex\ndisjunctions returns the input SENTENCE without simplifying any transitive\nredundancies.")
    public static final SubLObject simplify_transitive_redundancies_in_cycl_disjunction_alt(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $mt$.currentBinding(thread);
                    try {
                        $relevant_mt_function$.bind(possibly_in_mt_determine_function(mt_var), thread);
                        $mt$.bind(possibly_in_mt_determine_mt(mt_var), thread);
                        result = com.cyc.cycjava.cycl.simplifier.simplify_cycl_sentence_int(com.cyc.cycjava.cycl.simplifier.simplify_transitive_redundancies_in_disjunction(sentence), UNPROVIDED);
                    } finally {
                        $mt$.rebind(_prev_bind_1, thread);
                        $relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Simplifies transitive redundancies in flat disjunctions only. For complex
     * disjunctions returns the input SENTENCE without simplifying any transitive
     * redundancies.
     *
     * @unknown @xref simplify-transitive-redundancies already works for arbitrarily complex
    disjunctions, but its output is always a conjunction. We devise this function
    to use in @xref simplify-cycl-disjunction only, where the output is desired to be
    a disjunction (rather than a conjunction).
     * @unknown This function will eventually be replaced by one that works for all
    sorts of disjunctions.
     */
    @LispMethod(comment = "Simplifies transitive redundancies in flat disjunctions only. For complex\r\ndisjunctions returns the input SENTENCE without simplifying any transitive\r\nredundancies.\r\n\r\n@unknown @xref simplify-transitive-redundancies already works for arbitrarily complex\r\ndisjunctions, but its output is always a conjunction. We devise this function\r\nto use in @xref simplify-cycl-disjunction only, where the output is desired to be\r\na disjunction (rather than a conjunction).\r\n@unknown This function will eventually be replaced by one that works for all\r\nsorts of disjunctions.\nSimplifies transitive redundancies in flat disjunctions only. For complex\ndisjunctions returns the input SENTENCE without simplifying any transitive\nredundancies.")
    public static SubLObject simplify_transitive_redundancies_in_cycl_disjunction(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            result = simplify_cycl_sentence_int(simplify_transitive_redundancies_in_disjunction(sentence), UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @param conjunct;
    el-disjunction-p
     * 		
     * @param all-conjuncts;
    listp
     * 		
     * @return boolean: T if CONJUNCT is subsumed by any of the disjunctions in ALL-CONJUNCTS;
    nil otherwise
     */
    @LispMethod(comment = "@param conjunct;\nel-disjunction-p\r\n\t\t\r\n@param all-conjuncts;\nlistp\r\n\t\t\r\n@return boolean: T if CONJUNCT is subsumed by any of the disjunctions in ALL-CONJUNCTS;\r\nnil otherwise")
    public static final SubLObject subsumed_by_another_conjunctP_alt(SubLObject conjunct, SubLObject all_conjuncts) {
        {
            SubLObject flag = NIL;
            if (NIL == flag) {
                {
                    SubLObject csome_list_var = all_conjuncts;
                    SubLObject each_conjunct = NIL;
                    for (each_conjunct = csome_list_var.first(); !((NIL != flag) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , each_conjunct = csome_list_var.first()) {
                        if (((NIL != el_disjunction_p(each_conjunct)) && (NIL != com.cyc.cycjava.cycl.simplifier.conjunct_subsumed_by_conjunctP(conjunct, each_conjunct))) && (NIL == com.cyc.cycjava.cycl.simplifier.conjunct_subsumed_by_conjunctP(each_conjunct, conjunct))) {
                            flag = T;
                        }
                    }
                }
            }
            return flag;
        }
    }

    /**
     *
     *
     * @param conjunct;
    el-disjunction-p
     * 		
     * @param all-conjuncts;
    listp
     * 		
     * @return boolean: T if CONJUNCT is subsumed by any of the disjunctions in ALL-CONJUNCTS;
    nil otherwise
     */
    @LispMethod(comment = "@param conjunct;\nel-disjunction-p\r\n\t\t\r\n@param all-conjuncts;\nlistp\r\n\t\t\r\n@return boolean: T if CONJUNCT is subsumed by any of the disjunctions in ALL-CONJUNCTS;\r\nnil otherwise")
    public static SubLObject subsumed_by_another_conjunctP(final SubLObject conjunct, final SubLObject all_conjuncts) {
        SubLObject flag = NIL;
        if (NIL == flag) {
            SubLObject csome_list_var = all_conjuncts;
            SubLObject each_conjunct = NIL;
            each_conjunct = csome_list_var.first();
            while ((NIL == flag) && (NIL != csome_list_var)) {
                if (((NIL != el_disjunction_p(each_conjunct)) && (NIL != conjunct_subsumed_by_conjunctP(conjunct, each_conjunct))) && (NIL == conjunct_subsumed_by_conjunctP(each_conjunct, conjunct))) {
                    flag = T;
                }
                csome_list_var = csome_list_var.rest();
                each_conjunct = csome_list_var.first();
            } 
        }
        return flag;
    }

    /**
     *
     *
     * @param disjunction1;
    el-disjunction-p
     * 		
     * @param disjunction2;
    el-disjunction-p
     * 		
     * @return boolean: T if DISJUNCTION1 is subsumed by (more general than) DISJUNCTION2;
    nil otherwise
     */
    @LispMethod(comment = "@param disjunction1;\nel-disjunction-p\r\n\t\t\r\n@param disjunction2;\nel-disjunction-p\r\n\t\t\r\n@return boolean: T if DISJUNCTION1 is subsumed by (more general than) DISJUNCTION2;\r\nnil otherwise")
    public static final SubLObject conjunct_subsumed_by_conjunctP_alt(SubLObject disjunction1, SubLObject disjunction2) {
        {
            SubLObject flag = T;
            SubLObject constraint_dict = new_dictionary(symbol_function(EQUAL), UNPROVIDED);
            SubLObject all_disjuncts = cycl_utilities.sentence_args(disjunction2, $IGNORE);
            {
                SubLObject args = cycl_utilities.formula_args(disjunction1, $IGNORE);
                SubLObject cdolist_list_var = args;
                SubLObject disjunct = NIL;
                for (disjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , disjunct = cdolist_list_var.first()) {
                    {
                        SubLObject sentence_pred = cycl_utilities.sentence_arg0(disjunct);
                        SubLObject sentence_vars = cycl_utilities.sentence_args(disjunct, $IGNORE);
                        dictionary_push(constraint_dict, sentence_pred, sentence_vars);
                    }
                }
            }
            {
                SubLObject disjuncts = NIL;
                for (disjuncts = all_disjuncts; !((NIL == disjuncts) || (NIL == flag)); disjuncts = disjuncts.rest()) {
                    {
                        SubLObject disjunct = disjuncts.first();
                        SubLObject sentence_pred = cycl_utilities.sentence_arg0(disjunct);
                        SubLObject sentence_vars = cycl_utilities.sentence_args(disjunct, $IGNORE);
                        SubLObject existing_consts = dictionary_lookup(constraint_dict, sentence_pred, UNPROVIDED);
                        if (NIL != existing_consts) {
                            flag = com.cyc.cycjava.cycl.simplifier.subsumed_args_by_constsP(sentence_pred, sentence_vars, existing_consts);
                        } else {
                            flag = NIL;
                        }
                    }
                }
            }
            return flag;
        }
    }

    /**
     *
     *
     * @param disjunction1;
    el-disjunction-p
     * 		
     * @param disjunction2;
    el-disjunction-p
     * 		
     * @return boolean: T if DISJUNCTION1 is subsumed by (more general than) DISJUNCTION2;
    nil otherwise
     */
    @LispMethod(comment = "@param disjunction1;\nel-disjunction-p\r\n\t\t\r\n@param disjunction2;\nel-disjunction-p\r\n\t\t\r\n@return boolean: T if DISJUNCTION1 is subsumed by (more general than) DISJUNCTION2;\r\nnil otherwise")
    public static SubLObject conjunct_subsumed_by_conjunctP(final SubLObject disjunction1, final SubLObject disjunction2) {
        SubLObject flag = T;
        final SubLObject constraint_dict = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        final SubLObject all_disjuncts = cycl_utilities.sentence_args(disjunction2, $IGNORE);
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(disjunction1, $IGNORE);
        SubLObject disjunct = NIL;
        disjunct = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject sentence_pred = cycl_utilities.sentence_arg0(disjunct);
            final SubLObject sentence_vars = cycl_utilities.sentence_args(disjunct, $IGNORE);
            dictionary_utilities.dictionary_push(constraint_dict, sentence_pred, sentence_vars);
            cdolist_list_var = cdolist_list_var.rest();
            disjunct = cdolist_list_var.first();
        } 
        SubLObject disjuncts;
        SubLObject disjunct2;
        SubLObject sentence_pred2;
        SubLObject sentence_vars2;
        SubLObject existing_consts;
        for (disjuncts = NIL, disjuncts = all_disjuncts; (NIL != disjuncts) && (NIL != flag); disjuncts = disjuncts.rest()) {
            disjunct2 = disjuncts.first();
            sentence_pred2 = cycl_utilities.sentence_arg0(disjunct2);
            sentence_vars2 = cycl_utilities.sentence_args(disjunct2, $IGNORE);
            existing_consts = dictionary.dictionary_lookup(constraint_dict, sentence_pred2, UNPROVIDED);
            if (NIL != existing_consts) {
                flag = subsumed_args_by_constsP(sentence_pred2, sentence_vars2, existing_consts);
            } else {
                flag = NIL;
            }
        }
        return flag;
    }

    /**
     *
     *
     * @param pred;
    fort-p
     * 		
     * @param formula-vars;
    listp
     * 		
     * @param existing-const;
    listp
     * 		
     * @return boolean: T if FORMULA-VARS is subsumed by any of the constraints in EXISTING-CONSTS;
    nil otherwise
     */
    @LispMethod(comment = "@param pred;\nfort-p\r\n\t\t\r\n@param formula-vars;\nlistp\r\n\t\t\r\n@param existing-const;\nlistp\r\n\t\t\r\n@return boolean: T if FORMULA-VARS is subsumed by any of the constraints in EXISTING-CONSTS;\r\nnil otherwise")
    public static final SubLObject subsumed_args_by_constsP_alt(SubLObject pred, SubLObject formula_vars, SubLObject existing_consts) {
        {
            SubLObject flag = NIL;
            if (NIL == flag) {
                {
                    SubLObject csome_list_var = existing_consts;
                    SubLObject existing_const = NIL;
                    for (existing_const = csome_list_var.first(); !((NIL != flag) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , existing_const = csome_list_var.first()) {
                        if (NIL != com.cyc.cycjava.cycl.simplifier.subsumed_argsP(pred, formula_vars, existing_const)) {
                            flag = T;
                        }
                    }
                }
            }
            return flag;
        }
    }

    /**
     *
     *
     * @param pred;
    fort-p
     * 		
     * @param formula-vars;
    listp
     * 		
     * @param existing-const;
    listp
     * 		
     * @return boolean: T if FORMULA-VARS is subsumed by any of the constraints in EXISTING-CONSTS;
    nil otherwise
     */
    @LispMethod(comment = "@param pred;\nfort-p\r\n\t\t\r\n@param formula-vars;\nlistp\r\n\t\t\r\n@param existing-const;\nlistp\r\n\t\t\r\n@return boolean: T if FORMULA-VARS is subsumed by any of the constraints in EXISTING-CONSTS;\r\nnil otherwise")
    public static SubLObject subsumed_args_by_constsP(final SubLObject pred, final SubLObject formula_vars, final SubLObject existing_consts) {
        SubLObject flag = NIL;
        if (NIL == flag) {
            SubLObject csome_list_var = existing_consts;
            SubLObject existing_const = NIL;
            existing_const = csome_list_var.first();
            while ((NIL == flag) && (NIL != csome_list_var)) {
                if (NIL != subsumed_argsP(pred, formula_vars, existing_const)) {
                    flag = T;
                }
                csome_list_var = csome_list_var.rest();
                existing_const = csome_list_var.first();
            } 
        }
        return flag;
    }

    /**
     *
     *
     * @param pred;
    fort-p
     * 		
     * @param formula-vars;
    listp
     * 		
     * @param existing-const;
    listp
     * 		
     * @return boolean: T if each element of EXISTING-CONST is subsumed by the
    respective element of FORMULA-VARS, given PRED;
    nil otherwise
     */
    @LispMethod(comment = "@param pred;\nfort-p\r\n\t\t\r\n@param formula-vars;\nlistp\r\n\t\t\r\n@param existing-const;\nlistp\r\n\t\t\r\n@return boolean: T if each element of EXISTING-CONST is subsumed by the\r\nrespective element of FORMULA-VARS, given PRED;\r\nnil otherwise")
    public static final SubLObject subsumed_argsP_alt(SubLObject pred, SubLObject formula_vars, SubLObject existing_const) {
        if (NIL == same_length_p(formula_vars, existing_const)) {
            return NIL;
        }
        {
            SubLObject flag = T;
            SubLObject no_of_args = list_length(formula_vars);
            SubLObject index = NIL;
            for (index = ZERO_INTEGER; !(index.numE(no_of_args) || (NIL == flag)); index = add(index, ONE_INTEGER)) {
                if (NIL == ke_tools.subsumed_by_stronger_argsP(pred, add(index, ONE_INTEGER), list(nth(index, existing_const)), list(nth(index, formula_vars)), UNPROVIDED)) {
                    flag = NIL;
                }
            }
            return flag;
        }
    }

    /**
     *
     *
     * @param pred;
    fort-p
     * 		
     * @param formula-vars;
    listp
     * 		
     * @param existing-const;
    listp
     * 		
     * @return boolean: T if each element of EXISTING-CONST is subsumed by the
    respective element of FORMULA-VARS, given PRED;
    nil otherwise
     */
    @LispMethod(comment = "@param pred;\nfort-p\r\n\t\t\r\n@param formula-vars;\nlistp\r\n\t\t\r\n@param existing-const;\nlistp\r\n\t\t\r\n@return boolean: T if each element of EXISTING-CONST is subsumed by the\r\nrespective element of FORMULA-VARS, given PRED;\r\nnil otherwise")
    public static SubLObject subsumed_argsP(final SubLObject pred, final SubLObject formula_vars, final SubLObject existing_const) {
        if (NIL == list_utilities.same_length_p(formula_vars, existing_const)) {
            return NIL;
        }
        SubLObject flag;
        SubLObject no_of_args;
        SubLObject index;
        for (flag = T, no_of_args = list_length(formula_vars), index = NIL, index = ZERO_INTEGER; (!index.numE(no_of_args)) && (NIL != flag); index = add(index, ONE_INTEGER)) {
            if (NIL == ke_tools.subsumed_by_stronger_argsP(pred, add(index, ONE_INTEGER), list(nth(index, existing_const)), list(nth(index, formula_vars)), UNPROVIDED)) {
                flag = NIL;
            }
        }
        return flag;
    }

    public static final SubLObject simplify_transitive_redundancies_in_disjunction_alt(SubLObject disjunction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(disjunction, EL_DISJUNCTION_P);
            {
                SubLObject disjunct_constraint_dict = com.cyc.cycjava.cycl.simplifier.transitive_constraint_dict(disjunction, symbol_function(WEAKEST_ARGS));
                SubLObject new_disjuncts = NIL;
                {
                    SubLObject args = cycl_utilities.formula_args(disjunction, $IGNORE);
                    SubLObject cdolist_list_var = args;
                    SubLObject disjunct = NIL;
                    for (disjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , disjunct = cdolist_list_var.first()) {
                        {
                            SubLObject sentence_pred = cycl_utilities.sentence_arg0(disjunct);
                            SubLObject sentence_var = cycl_utilities.sentence_arg1(disjunct, UNPROVIDED);
                            SubLObject sentence_constraints = list(cycl_utilities.sentence_arg2(disjunct, UNPROVIDED));
                            if (NIL != subl_promotions.memberP(sentence_pred, $transitive_constraint_preds$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                                {
                                    SubLObject key = list(sentence_pred, sentence_var);
                                    SubLObject disjunct_constraints = dictionary_lookup(disjunct_constraint_dict, key, UNPROVIDED);
                                    if (NIL != ke_tools.subsumed_by_stronger_argsP(sentence_pred, TWO_INTEGER, disjunct_constraints, sentence_constraints, UNPROVIDED)) {
                                    } else {
                                        new_disjuncts = cons(disjunct, new_disjuncts);
                                    }
                                }
                            } else {
                                new_disjuncts = cons(disjunct, new_disjuncts);
                            }
                        }
                    }
                }
                {
                    SubLObject iteration_state = do_dictionary_contents_state(dictionary_contents(disjunct_constraint_dict));
                    while (NIL == do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject key = do_dictionary_contents_key_value(iteration_state);
                            SubLObject constraints = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject pred = key.first();
                                SubLObject var = second(key);
                                SubLObject cdolist_list_var = constraints;
                                SubLObject constraint = NIL;
                                for (constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint = cdolist_list_var.first()) {
                                    if (NIL != constraint) {
                                        new_disjuncts = cons(make_binary_formula(pred, var, constraint), new_disjuncts);
                                    }
                                }
                            }
                            iteration_state = do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    do_dictionary_contents_finalize(iteration_state);
                }
                return com.cyc.cycjava.cycl.simplifier.ndisjoin(nreverse(new_disjuncts), T);
            }
        }
    }

    public static SubLObject simplify_transitive_redundancies_in_disjunction(final SubLObject disjunction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != el_disjunction_p(disjunction) : "! el_utilities.el_disjunction_p(disjunction) " + ("el_utilities.el_disjunction_p(disjunction) " + "CommonSymbols.NIL != el_utilities.el_disjunction_p(disjunction) ") + disjunction;
        final SubLObject disjunct_constraint_dict = transitive_constraint_dict(disjunction, symbol_function(WEAKEST_ARGS));
        SubLObject new_disjuncts = NIL;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(disjunction, $IGNORE);
        SubLObject disjunct = NIL;
        disjunct = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject sentence_pred = cycl_utilities.sentence_arg0(disjunct);
            final SubLObject sentence_var = cycl_utilities.sentence_arg1(disjunct, UNPROVIDED);
            final SubLObject sentence_constraints = list(cycl_utilities.sentence_arg2(disjunct, UNPROVIDED));
            if (NIL != subl_promotions.memberP(sentence_pred, $transitive_constraint_preds$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                final SubLObject key = list(sentence_pred, sentence_var);
                final SubLObject disjunct_constraints = dictionary.dictionary_lookup(disjunct_constraint_dict, key, UNPROVIDED);
                if (NIL == ke_tools.subsumed_by_stronger_argsP(sentence_pred, TWO_INTEGER, disjunct_constraints, sentence_constraints, UNPROVIDED)) {
                    new_disjuncts = cons(disjunct, new_disjuncts);
                }
            } else {
                new_disjuncts = cons(disjunct, new_disjuncts);
            }
            cdolist_list_var = cdolist_list_var.rest();
            disjunct = cdolist_list_var.first();
        } 
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(disjunct_constraint_dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject constraints = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject pred = key2.first();
            final SubLObject var = second(key2);
            SubLObject cdolist_list_var2 = constraints;
            SubLObject constraint = NIL;
            constraint = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                if (NIL != constraint) {
                    new_disjuncts = cons(make_binary_formula(pred, var, constraint), new_disjuncts);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                constraint = cdolist_list_var2.first();
            } 
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return ndisjoin(nreverse(new_disjuncts), T);
    }

    /**
     *
     *
     * @return dictionary; for each (pred var) key, the dictionary contains a list of necessary constraints to impose.
    These constraints come from weak-dict, but they only remain if they are not subsumed by a constraint in strong-dict.
     */
    @LispMethod(comment = "@return dictionary; for each (pred var) key, the dictionary contains a list of necessary constraints to impose.\r\nThese constraints come from weak-dict, but they only remain if they are not subsumed by a constraint in strong-dict.")
    public static final SubLObject necessary_constraint_dict_alt(SubLObject weak_dict, SubLObject strong_dict) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject dict = new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                SubLObject iteration_state = do_dictionary_contents_state(dictionary_contents(weak_dict));
                while (NIL == do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = do_dictionary_contents_key_value(iteration_state);
                        SubLObject weak_constraints = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject pred = key.first();
                            SubLObject strong_constraints = dictionary_lookup(strong_dict, key, UNPROVIDED);
                            SubLObject merged_constraints = ke_tools.strongest_args(pred, TWO_INTEGER, append(weak_constraints, strong_constraints), UNPROVIDED);
                            SubLObject necessary_constraints = fast_set_difference(keyhash_utilities.fast_intersection(weak_constraints, merged_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED), strong_constraints, UNPROVIDED);
                            dictionary_enter(dict, key, necessary_constraints);
                        }
                        iteration_state = do_dictionary_contents_next(iteration_state);
                    }
                } 
                do_dictionary_contents_finalize(iteration_state);
                return dict;
            }
        }
    }

    /**
     *
     *
     * @return dictionary; for each (pred var) key, the dictionary contains a list of necessary constraints to impose.
    These constraints come from weak-dict, but they only remain if they are not subsumed by a constraint in strong-dict.
     */
    @LispMethod(comment = "@return dictionary; for each (pred var) key, the dictionary contains a list of necessary constraints to impose.\r\nThese constraints come from weak-dict, but they only remain if they are not subsumed by a constraint in strong-dict.")
    public static SubLObject necessary_constraint_dict(final SubLObject weak_dict, final SubLObject strong_dict) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dict = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(weak_dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject weak_constraints = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject pred = key.first();
            final SubLObject strong_constraints = dictionary.dictionary_lookup(strong_dict, key, UNPROVIDED);
            final SubLObject merged_constraints = ke_tools.strongest_args(pred, TWO_INTEGER, append(weak_constraints, strong_constraints), UNPROVIDED);
            final SubLObject necessary_constraints = list_utilities.fast_set_difference(keyhash_utilities.fast_intersection(weak_constraints, merged_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED), strong_constraints, UNPROVIDED);
            dictionary.dictionary_enter(dict, key, necessary_constraints);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return dict;
    }

    public static final SubLObject transitive_constraint_dict_alt(SubLObject formula, SubLObject constraint_merging_func) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject dict = new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject raw_hash = com.cyc.cycjava.cycl.simplifier.transitive_constraint_raw_info(formula);
                    SubLObject constrained_vars = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    clear_dictionary(dict);
                    {
                        SubLObject cdolist_list_var = constrained_vars;
                        SubLObject var = NIL;
                        for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                            {
                                SubLObject cdolist_list_var_9 = $transitive_constraint_preds$.getDynamicValue(thread);
                                SubLObject pred = NIL;
                                for (pred = cdolist_list_var_9.first(); NIL != cdolist_list_var_9; cdolist_list_var_9 = cdolist_list_var_9.rest() , pred = cdolist_list_var_9.first()) {
                                    dictionary_enter(dict, list(pred, var), funcall(constraint_merging_func, pred, TWO_INTEGER, gethash(list(pred, var), raw_hash, UNPROVIDED)));
                                }
                            }
                        }
                    }
                }
                return dict;
            }
        }
    }

    public static SubLObject transitive_constraint_dict(final SubLObject formula, final SubLObject constraint_merging_func) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dict = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject raw_hash = transitive_constraint_raw_info(formula);
        final SubLObject constrained_vars = thread.secondMultipleValue();
        thread.resetMultipleValues();
        dictionary.clear_dictionary(dict);
        SubLObject cdolist_list_var = constrained_vars;
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$20 = $transitive_constraint_preds$.getDynamicValue(thread);
            SubLObject pred = NIL;
            pred = cdolist_list_var_$20.first();
            while (NIL != cdolist_list_var_$20) {
                dictionary.dictionary_enter(dict, list(pred, var), funcall(constraint_merging_func, pred, TWO_INTEGER, gethash(list(pred, var), raw_hash, UNPROVIDED)));
                cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                pred = cdolist_list_var_$20.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        return dict;
    }

    public static final SubLObject transitive_constraint_raw_info_alt(SubLObject junction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject hash = make_hash_table(FOUR_INTEGER, symbol_function(EQUAL), UNPROVIDED);
                SubLObject constrained_vars = NIL;
                SubLObject args = cycl_utilities.formula_args(junction, $IGNORE);
                SubLObject cdolist_list_var = args;
                SubLObject junct = NIL;
                for (junct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , junct = cdolist_list_var.first()) {
                    {
                        SubLObject pred = cycl_utilities.sentence_arg0(junct);
                        if (NIL != subl_promotions.memberP(pred, $transitive_constraint_preds$.getDynamicValue(thread), symbol_function(EQ), UNPROVIDED)) {
                            {
                                SubLObject item_var = cycl_utilities.sentence_arg1(junct, UNPROVIDED);
                                if (NIL == member(item_var, constrained_vars, symbol_function(EQL), symbol_function(IDENTITY))) {
                                    constrained_vars = cons(item_var, constrained_vars);
                                }
                            }
                            hash_table_utilities.pushnew_hash(list(pred, cycl_utilities.sentence_arg1(junct, UNPROVIDED)), cycl_utilities.sentence_arg2(junct, UNPROVIDED), hash, UNPROVIDED);
                        }
                    }
                }
                return values(hash, constrained_vars);
            }
        }
    }

    public static SubLObject transitive_constraint_raw_info(final SubLObject junction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hash = make_hash_table(FOUR_INTEGER, symbol_function(EQUAL), UNPROVIDED);
        SubLObject constrained_vars = NIL;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(junction, $IGNORE);
        SubLObject junct = NIL;
        junct = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pred = cycl_utilities.sentence_arg0(junct);
            if (NIL != subl_promotions.memberP(pred, $transitive_constraint_preds$.getDynamicValue(thread), symbol_function(EQL), UNPROVIDED)) {
                final SubLObject item_var = cycl_utilities.sentence_arg1(junct, UNPROVIDED);
                if (NIL == member(item_var, constrained_vars, symbol_function(EQL), symbol_function(IDENTITY))) {
                    constrained_vars = cons(item_var, constrained_vars);
                }
                hash_table_utilities.pushnew_hash(list(pred, cycl_utilities.sentence_arg1(junct, UNPROVIDED)), cycl_utilities.sentence_arg2(junct, UNPROVIDED), hash, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            junct = cdolist_list_var.first();
        } 
        return values(hash, constrained_vars);
    }

    public static final SubLObject simplify_transitive_redundanciesP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean(((NIL != com.cyc.cycjava.cycl.simplifier.simplify_redundanciesP()) && (NIL != $simplify_transitive_redundanciesP$.getDynamicValue(thread))) && (NIL == $simplifying_redundanciesP$.getDynamicValue(thread)));
        }
    }

    public static SubLObject simplify_transitive_redundanciesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL != simplify_redundanciesP()) && (NIL != czer_vars.$simplify_transitive_redundanciesP$.getDynamicValue(thread))) && (NIL == $simplifying_redundanciesP$.getDynamicValue(thread)));
    }

    public static SubLObject simplify_contradictionsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != $simplify_cycl_sentence_and_subsentencesP$.getDynamicValue(thread)) && (NIL != czer_vars.$simplify_contradictionsP$.getDynamicValue(thread)));
    }

    /**
     * Simplifies transitive redundancies.
     * e.g. (#$or (#$isa ?X #$Dog) (#$isa ?X #$Poodle)) -> (#$isa ?X #$Dog)
     * Doesn't specially handle scoped variables with the same name as other variables.
     */
    @LispMethod(comment = "Simplifies transitive redundancies.\r\ne.g. (#$or (#$isa ?X #$Dog) (#$isa ?X #$Poodle)) -> (#$isa ?X #$Dog)\r\nDoesn\'t specially handle scoped variables with the same name as other variables.\nSimplifies transitive redundancies.\ne.g. (#$or (#$isa ?X #$Dog) (#$isa ?X #$Poodle)) -> (#$isa ?X #$Dog)\nDoesn\'t specially handle scoped variables with the same name as other variables.")
    public static final SubLObject simplify_transitive_redundancies_old_alt(SubLObject sentence, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == possibly_sentence_p(sentence)) {
                return sentence;
            }
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $mt$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $simplifying_redundanciesP$.currentBinding(thread);
                    try {
                        $relevant_mt_function$.bind(possibly_in_mt_determine_function(mt_var), thread);
                        $mt$.bind(possibly_in_mt_determine_mt(mt_var), thread);
                        $simplifying_redundanciesP$.bind(T, thread);
                        {
                            SubLObject new_conjuncts = NIL;
                            thread.resetMultipleValues();
                            {
                                SubLObject cnf_sentence = clausifier.el_cnf(sentence, mt);
                                SubLObject mt_10 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                clausifier.force_into_cnf(cnf_sentence);
                                if (NIL == el_conjunction_p(cnf_sentence)) {
                                    cnf_sentence = make_conjunction(list(cnf_sentence));
                                }
                                {
                                    SubLObject constraints = at_var_types.inter_query_variables_arg_constraints(sentence, mt_10, UNPROVIDED);
                                    SubLObject args = NIL;
                                    if (NIL != constraints) {
                                        args = cycl_utilities.sentence_args(cnf_sentence, $IGNORE);
                                        if (NIL != el_conjunction_p(constraints)) {
                                            {
                                                SubLObject args_11 = cycl_utilities.formula_args(constraints, $IGNORE);
                                                SubLObject cdolist_list_var = args_11;
                                                SubLObject constraint = NIL;
                                                for (constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint = cdolist_list_var.first()) {
                                                    args = cons(constraint, args);
                                                }
                                                cnf_sentence = com.cyc.cycjava.cycl.simplifier.conjoin(args, UNPROVIDED);
                                            }
                                        } else {
                                            cnf_sentence = com.cyc.cycjava.cycl.simplifier.conjoin(adjoin(constraints, args, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                                        }
                                    }
                                }
                                {
                                    SubLObject conjunct_constraint_dict = com.cyc.cycjava.cycl.simplifier.transitive_constraint_dict(cnf_sentence, symbol_function(STRONGEST_ARGS));
                                    {
                                        SubLObject args = cycl_utilities.formula_args(cnf_sentence, $IGNORE);
                                        SubLObject cdolist_list_var = args;
                                        SubLObject conjunct = NIL;
                                        for (conjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , conjunct = cdolist_list_var.first()) {
                                            if (NIL != el_disjunction_p(conjunct)) {
                                                new_conjuncts = cons(com.cyc.cycjava.cycl.simplifier.simplify_transitive_redundancies_in_disjunction_old(conjunct, conjunct_constraint_dict), new_conjuncts);
                                            } else {
                                                new_conjuncts = cons(conjunct, new_conjuncts);
                                            }
                                        }
                                    }
                                    {
                                        SubLObject iteration_state = do_dictionary_contents_state(dictionary_contents(conjunct_constraint_dict));
                                        while (NIL == do_dictionary_contents_doneP(iteration_state)) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject key = do_dictionary_contents_key_value(iteration_state);
                                                SubLObject constraints = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject pred = key.first();
                                                    SubLObject var = second(key);
                                                    SubLObject cdolist_list_var = constraints;
                                                    SubLObject constraint = NIL;
                                                    for (constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint = cdolist_list_var.first()) {
                                                        if (NIL != constraint) {
                                                            new_conjuncts = cons(make_binary_formula(pred, var, constraint), new_conjuncts);
                                                        }
                                                    }
                                                }
                                                iteration_state = do_dictionary_contents_next(iteration_state);
                                            }
                                        } 
                                        do_dictionary_contents_finalize(iteration_state);
                                    }
                                }
                                result = com.cyc.cycjava.cycl.simplifier.simplify_cycl_sentence_int(com.cyc.cycjava.cycl.simplifier.conjoin(nreverse(new_conjuncts), T), UNPROVIDED);
                            }
                        }
                    } finally {
                        $simplifying_redundanciesP$.rebind(_prev_bind_2, thread);
                        $mt$.rebind(_prev_bind_1, thread);
                        $relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Simplifies transitive redundancies.
     * e.g. (#$or (#$isa ?X #$Dog) (#$isa ?X #$Poodle)) -> (#$isa ?X #$Dog)
     * Doesn't specially handle scoped variables with the same name as other variables.
     */
    @LispMethod(comment = "Simplifies transitive redundancies.\r\ne.g. (#$or (#$isa ?X #$Dog) (#$isa ?X #$Poodle)) -> (#$isa ?X #$Dog)\r\nDoesn\'t specially handle scoped variables with the same name as other variables.\nSimplifies transitive redundancies.\ne.g. (#$or (#$isa ?X #$Dog) (#$isa ?X #$Poodle)) -> (#$isa ?X #$Dog)\nDoesn\'t specially handle scoped variables with the same name as other variables.")
    public static SubLObject simplify_transitive_redundancies_old(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == possibly_sentence_p(sentence)) {
            return sentence;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $simplifying_redundanciesP$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
            $simplifying_redundanciesP$.bind(T, thread);
            SubLObject new_conjuncts = NIL;
            thread.resetMultipleValues();
            SubLObject cnf_sentence = clausifier.el_cnf(sentence, mt);
            final SubLObject mt_$21 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            clausifier.force_into_cnf(cnf_sentence);
            if (NIL == el_conjunction_p(cnf_sentence)) {
                cnf_sentence = make_conjunction(list(cnf_sentence));
            }
            final SubLObject constraints = at_var_types.inter_query_variables_arg_constraints(sentence, mt_$21, UNPROVIDED);
            SubLObject args = NIL;
            if (NIL != constraints) {
                args = cycl_utilities.sentence_args(cnf_sentence, $IGNORE);
                if (NIL != el_conjunction_p(constraints)) {
                    SubLObject cdolist_list_var;
                    final SubLObject args_$22 = cdolist_list_var = cycl_utilities.formula_args(constraints, $IGNORE);
                    SubLObject constraint = NIL;
                    constraint = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        args = cons(constraint, args);
                        cdolist_list_var = cdolist_list_var.rest();
                        constraint = cdolist_list_var.first();
                    } 
                    cnf_sentence = conjoin(args, UNPROVIDED);
                } else {
                    cnf_sentence = conjoin(adjoin(constraints, args, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                }
            }
            final SubLObject conjunct_constraint_dict = transitive_constraint_dict(cnf_sentence, symbol_function(STRONGEST_ARGS));
            SubLObject cdolist_list_var2;
            args = cdolist_list_var2 = cycl_utilities.formula_args(cnf_sentence, $IGNORE);
            SubLObject conjunct = NIL;
            conjunct = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                if (NIL != el_disjunction_p(conjunct)) {
                    new_conjuncts = cons(simplify_transitive_redundancies_in_disjunction_old(conjunct, conjunct_constraint_dict), new_conjuncts);
                } else {
                    new_conjuncts = cons(conjunct, new_conjuncts);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                conjunct = cdolist_list_var2.first();
            } 
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(conjunct_constraint_dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject constraints2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject pred = key.first();
                final SubLObject var = second(key);
                SubLObject cdolist_list_var3 = constraints2;
                SubLObject constraint2 = NIL;
                constraint2 = cdolist_list_var3.first();
                while (NIL != cdolist_list_var3) {
                    if (NIL != constraint2) {
                        new_conjuncts = cons(make_binary_formula(pred, var, constraint2), new_conjuncts);
                    }
                    cdolist_list_var3 = cdolist_list_var3.rest();
                    constraint2 = cdolist_list_var3.first();
                } 
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            result = simplify_cycl_sentence_int(conjoin(nreverse(new_conjuncts), T), UNPROVIDED);
        } finally {
            $simplifying_redundanciesP$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject simplify_transitive_redundancies_in_disjunction_old_alt(SubLObject disjunction, SubLObject external_constraint_dict) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(disjunction, EL_DISJUNCTION_P);
            {
                SubLObject disjunct_constraint_dict = com.cyc.cycjava.cycl.simplifier.transitive_constraint_dict(disjunction, symbol_function(WEAKEST_ARGS));
                SubLObject new_disjuncts = NIL;
                SubLObject vacuousP = NIL;
                SubLObject args = cycl_utilities.formula_args(disjunction, $IGNORE);
                SubLObject rest = NIL;
                for (rest = args; !((NIL != vacuousP) || (NIL == rest)); rest = rest.rest()) {
                    {
                        SubLObject disjunct = rest.first();
                        SubLObject sentence_pred = cycl_utilities.sentence_arg0(disjunct);
                        SubLObject sentence_var = cycl_utilities.sentence_arg1(disjunct, UNPROVIDED);
                        SubLObject sentence_constraints = list(cycl_utilities.sentence_arg2(disjunct, UNPROVIDED));
                        if ((NIL != subl_promotions.memberP(sentence_pred, $transitive_constraint_preds$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) && (NIL != cycl_variables.el_varP(sentence_var))) {
                            {
                                SubLObject key = list(sentence_pred, sentence_var);
                                SubLObject external_constraints = dictionary_lookup(external_constraint_dict, key, UNPROVIDED);
                                SubLObject disjunct_constraints = dictionary_lookup(disjunct_constraint_dict, key, UNPROVIDED);
                                if (NIL != ke_tools.subsumed_by_stronger_argsP(sentence_pred, TWO_INTEGER, sentence_constraints, external_constraints, UNPROVIDED)) {
                                    vacuousP = T;
                                } else {
                                    if (NIL != ke_tools.subsumed_by_stronger_argsP(sentence_pred, TWO_INTEGER, sentence_constraints, disjunct_constraints, UNPROVIDED)) {
                                    } else {
                                        new_disjuncts = cons(disjunct, new_disjuncts);
                                    }
                                }
                            }
                        } else {
                            new_disjuncts = cons(disjunct, new_disjuncts);
                        }
                    }
                }
                if (NIL != vacuousP) {
                    return make_disjunction(list($$True));
                }
                {
                    SubLObject iteration_state = do_dictionary_contents_state(dictionary_contents(disjunct_constraint_dict));
                    while (NIL == do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject key = do_dictionary_contents_key_value(iteration_state);
                            SubLObject constraints = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject pred = key.first();
                                SubLObject var = second(key);
                                SubLObject cdolist_list_var = constraints;
                                SubLObject constraint = NIL;
                                for (constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint = cdolist_list_var.first()) {
                                    if (NIL != constraint) {
                                        new_disjuncts = cons(make_binary_formula(pred, var, constraint), new_disjuncts);
                                    }
                                }
                            }
                            iteration_state = do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    do_dictionary_contents_finalize(iteration_state);
                }
                return com.cyc.cycjava.cycl.simplifier.ndisjoin(nreverse(new_disjuncts), T);
            }
        }
    }

    public static SubLObject simplify_transitive_redundancies_in_disjunction_old(final SubLObject disjunction, final SubLObject external_constraint_dict) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != el_disjunction_p(disjunction) : "! el_utilities.el_disjunction_p(disjunction) " + ("el_utilities.el_disjunction_p(disjunction) " + "CommonSymbols.NIL != el_utilities.el_disjunction_p(disjunction) ") + disjunction;
        final SubLObject disjunct_constraint_dict = transitive_constraint_dict(disjunction, symbol_function(WEAKEST_ARGS));
        SubLObject new_disjuncts = NIL;
        SubLObject vacuousP = NIL;
        final SubLObject args = cycl_utilities.formula_args(disjunction, $IGNORE);
        SubLObject rest;
        SubLObject disjunct;
        SubLObject sentence_pred;
        SubLObject sentence_var;
        SubLObject sentence_constraints;
        SubLObject key;
        SubLObject external_constraints;
        SubLObject disjunct_constraints;
        for (rest = NIL, rest = args; (NIL == vacuousP) && (NIL != rest); rest = rest.rest()) {
            disjunct = rest.first();
            sentence_pred = cycl_utilities.sentence_arg0(disjunct);
            sentence_var = cycl_utilities.sentence_arg1(disjunct, UNPROVIDED);
            sentence_constraints = list(cycl_utilities.sentence_arg2(disjunct, UNPROVIDED));
            if ((NIL != subl_promotions.memberP(sentence_pred, $transitive_constraint_preds$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) && (NIL != cycl_variables.el_varP(sentence_var))) {
                key = list(sentence_pred, sentence_var);
                external_constraints = dictionary.dictionary_lookup(external_constraint_dict, key, UNPROVIDED);
                disjunct_constraints = dictionary.dictionary_lookup(disjunct_constraint_dict, key, UNPROVIDED);
                if (NIL != ke_tools.subsumed_by_stronger_argsP(sentence_pred, TWO_INTEGER, sentence_constraints, external_constraints, UNPROVIDED)) {
                    vacuousP = T;
                } else
                    if (NIL == ke_tools.subsumed_by_stronger_argsP(sentence_pred, TWO_INTEGER, sentence_constraints, disjunct_constraints, UNPROVIDED)) {
                        new_disjuncts = cons(disjunct, new_disjuncts);
                    }

            } else {
                new_disjuncts = cons(disjunct, new_disjuncts);
            }
        }
        if (NIL != vacuousP) {
            return make_disjunction(list($$True));
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(disjunct_constraint_dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject constraints = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject pred = key2.first();
            final SubLObject var = second(key2);
            SubLObject cdolist_list_var = constraints;
            SubLObject constraint = NIL;
            constraint = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != constraint) {
                    new_disjuncts = cons(make_binary_formula(pred, var, constraint), new_disjuncts);
                }
                cdolist_list_var = cdolist_list_var.rest();
                constraint = cdolist_list_var.first();
            } 
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return ndisjoin(nreverse(new_disjuncts), T);
    }

    public static final SubLObject simplify_number_expression_alt(SubLObject expression) {
        if (NIL != el_formula_p(expression)) {
            return evaluatable_expressions_out(expression);
        } else {
            return expression;
        }
    }

    public static SubLObject simplify_number_expression(final SubLObject expression) {
        if (NIL != el_formula_p(expression)) {
            return czer_utilities.evaluatable_expressions_out(expression);
        }
        return expression;
    }

    public static SubLObject cycl_coerce_types(SubLObject sentence, SubLObject mt, SubLObject explanation_of_why_not_wff_function) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (explanation_of_why_not_wff_function == UNPROVIDED) {
            explanation_of_why_not_wff_function = EXPLANATION_OF_WHY_NOT_WFF;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject explanation = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject why_not_wff = at_admitted.why_not_admitted_sentence_wrt_asent_arg_constraints(sentence, UNPROVIDED);
            SubLObject did_somethingP = NIL;
            SubLObject cdolist_list_var = why_not_wff;
            SubLObject why_not_wff_item = NIL;
            why_not_wff_item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject mal_arg_wrt_something = NIL;
                SubLObject bad_arg = NIL;
                SubLObject pred = NIL;
                SubLObject argnum = NIL;
                SubLObject col = NIL;
                SubLObject defn = NIL;
                SubLObject mt_$23 = NIL;
                SubLObject constraint_gaf = NIL;
                if (NIL != list_utilities.lengthE(why_not_wff_item, SEVEN_INTEGER, UNPROVIDED)) {
                    final SubLObject datum_evaluated_var = why_not_wff_item;
                    mal_arg_wrt_something = datum_evaluated_var.first();
                    bad_arg = cadr(datum_evaluated_var);
                    pred = cddr(datum_evaluated_var).first();
                    argnum = cadr(cddr(datum_evaluated_var));
                    col = cddr(cddr(datum_evaluated_var)).first();
                    mt_$23 = cadr(cddr(cddr(datum_evaluated_var)));
                    constraint_gaf = cddr(cddr(cddr(datum_evaluated_var))).first();
                }
                if (NIL != list_utilities.lengthE(why_not_wff_item, EIGHT_INTEGER, UNPROVIDED)) {
                    final SubLObject datum_evaluated_var = why_not_wff_item;
                    mal_arg_wrt_something = datum_evaluated_var.first();
                    bad_arg = cadr(datum_evaluated_var);
                    pred = cddr(datum_evaluated_var).first();
                    argnum = cadr(cddr(datum_evaluated_var));
                    col = cddr(cddr(datum_evaluated_var)).first();
                    defn = cadr(cddr(cddr(datum_evaluated_var)));
                    mt_$23 = cddr(cddr(cddr(datum_evaluated_var))).first();
                    constraint_gaf = cadr(cddr(cddr(cddr(datum_evaluated_var))));
                }
                if (NIL != list_utilities.member_eqP(mal_arg_wrt_something, $list51)) {
                    if ((NIL != genls.any_genlP(col, $list52, UNPROVIDED, UNPROVIDED)) && bad_arg.isString()) {
                        final SubLObject new_arg = read_from_string_ignoring_errors(bad_arg, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (new_arg.isInteger()) {
                            sentence = replace_arg_of_pred(sentence, pred, argnum, bad_arg, new_arg);
                            did_somethingP = T;
                        }
                    }
                    if ((NIL != genls.any_genlP(col, $list53, UNPROVIDED, UNPROVIDED)) && (!bad_arg.isString())) {
                        final SubLObject new_arg = string_utilities.str(bad_arg);
                        sentence = replace_arg_of_pred(sentence, pred, argnum, bad_arg, new_arg);
                        did_somethingP = T;
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                why_not_wff_item = cdolist_list_var.first();
            } 
            if (NIL != did_somethingP) {
                explanation = funcall(explanation_of_why_not_wff_function, sentence);
                if (NIL == explanation) {
                    result = sentence;
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return values(result, explanation);
    }

    static private final SubLSymbol $sym3$LIFTABLE_CONJUNCTS_ = makeSymbol("LIFTABLE-CONJUNCTS?");

    static private final SubLSymbol $sym6$CYC_VAR_ = makeSymbol("CYC-VAR?");

    static private final SubLSymbol $sym7$EL_WFF_ = makeSymbol("EL-WFF?");

    public static SubLObject declare_simplifier_file() {
        declareFunction("fast_simplify_cycl_sentence", "FAST-SIMPLIFY-CYCL-SENTENCE", 1, 2, false);
        declareFunction("scg_simplify", "SCG-SIMPLIFY", 1, 1, false);
        declareFunction("lift_disjuncts", "LIFT-DISJUNCTS", 1, 0, false);
        declareFunction("nlift_disjuncts", "NLIFT-DISJUNCTS", 1, 0, false);
        declareFunction("disjoin", "DISJOIN", 1, 1, false);
        declareFunction("ndisjoin", "NDISJOIN", 1, 1, false);
        declareFunction("simplify_unary_junct", "SIMPLIFY-UNARY-JUNCT", 1, 0, false);
        declareFunction("simplify_unary_juncts", "SIMPLIFY-UNARY-JUNCTS", 1, 0, false);
        declareFunction("simplify_duplicate_juncts", "SIMPLIFY-DUPLICATE-JUNCTS", 1, 0, false);
        declareFunction("lift_conjuncts", "LIFT-CONJUNCTS", 1, 0, false);
        declareFunction("nlift_conjuncts", "NLIFT-CONJUNCTS", 1, 0, false);
        declareFunction("conjoin", "CONJOIN", 1, 1, false);
        declareFunction("nconjoin", "NCONJOIN", 1, 1, false);
        declareFunction("possibly_conjoin", "POSSIBLY-CONJOIN", 1, 1, false);
        declareFunction("lift_conjuncts_recursive", "LIFT-CONJUNCTS-RECURSIVE", 1, 0, false);
        declareFunction("liftable_conjunctsP", "LIFTABLE-CONJUNCTS?", 1, 0, false);
        declareFunction("simplify_el_syntax", "SIMPLIFY-EL-SYNTAX", 1, 1, false);
        declareFunction("try_to_simplify_non_wff_into_wff", "TRY-TO-SIMPLIFY-NON-WFF-INTO-WFF", 1, 2, false);
        declareFunction("simplify_cycl_sentence_deep", "SIMPLIFY-CYCL-SENTENCE-DEEP", 1, 1, false);
        declareFunction("get_simplified_cycl_sentence", "GET-SIMPLIFIED-CYCL-SENTENCE", 1, 1, false);
        declareFunction("simplify_cycl_sentence", "SIMPLIFY-CYCL-SENTENCE", 1, 1, false);
        declareFunction("simplify_cycl_sentence_syntax", "SIMPLIFY-CYCL-SENTENCE-SYNTAX", 1, 1, false);
        declareFunction("simplify_cycl_sentence_int", "SIMPLIFY-CYCL-SENTENCE-INT", 1, 1, false);
        new simplifier.$simplify_cycl_sentence_int$UnaryFunction();
        new simplifier.$simplify_cycl_sentence_int$BinaryFunction();
        declareFunction("simplify_true_sentence", "SIMPLIFY-TRUE-SENTENCE", 1, 1, false);
        declareFunction("simplify_exception", "SIMPLIFY-EXCEPTION", 1, 1, false);
        declareFunction("simplify_cycl_literal_syntax", "SIMPLIFY-CYCL-LITERAL-SYNTAX", 1, 1, false);
        declareFunction("simplify_cycl_literal", "SIMPLIFY-CYCL-LITERAL", 1, 1, false);
        declareFunction("simplify_cycl_literal_int", "SIMPLIFY-CYCL-LITERAL-INT", 1, 1, false);
        declareFunction("distributes_out_of_argP", "DISTRIBUTES-OUT-OF-ARG?", 3, 1, false);
        declareFunction("simplify_distributing_out_args", "SIMPLIFY-DISTRIBUTING-OUT-ARGS", 1, 0, false);
        declareFunction("simplify_cycl_literal_terms", "SIMPLIFY-CYCL-LITERAL-TERMS", 1, 1, false);
        declareFunction("simplify_mt_literal_terms", "SIMPLIFY-MT-LITERAL-TERMS", 2, 0, false);
        declareFunction("simplify_cycl_literal_terms_int", "SIMPLIFY-CYCL-LITERAL-TERMS-INT", 1, 1, false);
        declareFunction("simplify_cycl_term", "SIMPLIFY-CYCL-TERM", 1, 1, false);
        declareFunction("el_negate", "EL-NEGATE", 1, 0, false);
        declareFunction("simplify_cycl_negation", "SIMPLIFY-CYCL-NEGATION", 1, 1, false);
        declareFunction("simplify_cycl_conjunction", "SIMPLIFY-CYCL-CONJUNCTION", 1, 1, false);
        declareFunction("simplify_equality_literals", "SIMPLIFY-EQUALITY-LITERALS", 2, 0, false);
        declareFunction("simplify_one_open_open_equality_literal", "SIMPLIFY-ONE-OPEN-OPEN-EQUALITY-LITERAL", 2, 0, false);
        declareFunction("simplify_one_var_var_equality_literal", "SIMPLIFY-ONE-VAR-VAR-EQUALITY-LITERAL", 2, 0, false);
        declareFunction("simplify_one_open_open_equality_literal_int", "SIMPLIFY-ONE-OPEN-OPEN-EQUALITY-LITERAL-INT", 3, 0, false);
        declareFunction("simplify_one_symmetric_equality_literal", "SIMPLIFY-ONE-SYMMETRIC-EQUALITY-LITERAL", 1, 0, false);
        declareFunction("simplify_open_closed_equality_literals", "SIMPLIFY-OPEN-CLOSED-EQUALITY-LITERALS", 2, 0, false);
        declareFunction("equality_literalP", "EQUALITY-LITERAL?", 2, 0, false);
        declareFunction("open_open_equality_literalP", "OPEN-OPEN-EQUALITY-LITERAL?", 4, 0, false);
        declareFunction("symmetric_equality_literalP", "SYMMETRIC-EQUALITY-LITERAL?", 2, 0, false);
        declareFunction("simplify_cycl_disjunction", "SIMPLIFY-CYCL-DISJUNCTION", 1, 1, false);
        declareFunction("simplify_cycl_disjunction_int", "SIMPLIFY-CYCL-DISJUNCTION-INT", 1, 1, false);
        declareFunction("simplify_cycl_implication", "SIMPLIFY-CYCL-IMPLICATION", 1, 1, false);
        declareFunction("equal_implication_argsP", "EQUAL-IMPLICATION-ARGS?", 1, 1, false);
        declareFunction("simplify_cycl_universal", "SIMPLIFY-CYCL-UNIVERSAL", 1, 0, false);
        declareFunction("simplify_cycl_existential", "SIMPLIFY-CYCL-EXISTENTIAL", 1, 0, false);
        declareFunction("simplify_cycl_multiply_quantified_sentence", "SIMPLIFY-CYCL-MULTIPLY-QUANTIFIED-SENTENCE", 1, 0, false);
        declareFunction("simplify_cycl_relation", "SIMPLIFY-CYCL-RELATION", 1, 0, false);
        declareFunction("simplify_special_cases", "SIMPLIFY-SPECIAL-CASES", 1, 0, false);
        declareFunction("simplify_nested_collectionsubsetfn_expression", "SIMPLIFY-NESTED-COLLECTIONSUBSETFN-EXPRESSION", 1, 0, false);
        declareFunction("transform_nested_collectionsubsetfn_expression", "TRANSFORM-NESTED-COLLECTIONSUBSETFN-EXPRESSION", 1, 0, false);
        declareFunction("nested_collectionsubsetfn_expressionP", "NESTED-COLLECTIONSUBSETFN-EXPRESSION?", 1, 0, false);
        new simplifier.$nested_collectionsubsetfn_expressionP$UnaryFunction();
        declareFunction("simplify_individualasfn_expressions", "SIMPLIFY-INDIVIDUALASFN-EXPRESSIONS", 1, 0, false);
        declareFunction("transform_individualasfn_expression", "TRANSFORM-INDIVIDUALASFN-EXPRESSION", 1, 0, false);
        declareFunction("individualasfn_expressionP", "INDIVIDUALASFN-EXPRESSION?", 1, 0, false);
        declareFunction("simplify_redundanciesP", "SIMPLIFY-REDUNDANCIES?", 0, 0, false);
        declareFunction("simplify_kappa_asent", "SIMPLIFY-KAPPA-ASENT", 1, 0, false);
        declareFunction("simplify_ist_sentence", "SIMPLIFY-IST-SENTENCE", 1, 0, false);
        declareFunction("fold_equals", "FOLD-EQUALS", 1, 0, false);
        declareFunction("fold_equals_in_asent", "FOLD-EQUALS-IN-ASENT", 2, 3, false);
        declareFunction("do_fold_equals_in_asent", "DO-FOLD-EQUALS-IN-ASENT", 4, 0, false);
        declareFunction("note_fold_equals_binding", "NOTE-FOLD-EQUALS-BINDING", 3, 0, false);
        declareFunction("simplify_sequence_variables", "SIMPLIFY-SEQUENCE-VARIABLES", 1, 0, false);
        declareFunction("simplify_sequence_variables_1", "SIMPLIFY-SEQUENCE-VARIABLES-1", 1, 0, false);
        declareFunction("simplify_sequence_variables_int", "SIMPLIFY-SEQUENCE-VARIABLES-INT", 3, 0, false);
        declareFunction("possible_sequence_var_simplification", "POSSIBLE-SEQUENCE-VAR-SIMPLIFICATION", 2, 0, false);
        declareFunction("simplify_sequence_vars_using_kb_arityP", "SIMPLIFY-SEQUENCE-VARS-USING-KB-ARITY?", 0, 0, false);
        declareFunction("ignore_sequence_var_if_wff", "IGNORE-SEQUENCE-VAR-IF-WFF", 2, 1, false);
        declareFunction("regularize_sequence_var_if_wff", "REGULARIZE-SEQUENCE-VAR-IF-WFF", 2, 1, false);
        declareFunction("split_sequence_var_if_wff", "SPLIT-SEQUENCE-VAR-IF-WFF", 1, 5, false);
        declareFunction("sequence_var_simplifiableP", "SEQUENCE-VAR-SIMPLIFIABLE?", 1, 0, false);
        declareFunction("simplify_contradictions", "SIMPLIFY-CONTRADICTIONS", 1, 0, false);
        declareFunction("simplify_transitive_redundancies", "SIMPLIFY-TRANSITIVE-REDUNDANCIES", 1, 1, false);
        declareFunction("simplify_transitive_redundancies_in_cycl_disjunction", "SIMPLIFY-TRANSITIVE-REDUNDANCIES-IN-CYCL-DISJUNCTION", 1, 1, false);
        declareFunction("subsumed_by_another_conjunctP", "SUBSUMED-BY-ANOTHER-CONJUNCT?", 2, 0, false);
        declareFunction("conjunct_subsumed_by_conjunctP", "CONJUNCT-SUBSUMED-BY-CONJUNCT?", 2, 0, false);
        declareFunction("subsumed_args_by_constsP", "SUBSUMED-ARGS-BY-CONSTS?", 3, 0, false);
        declareFunction("subsumed_argsP", "SUBSUMED-ARGS?", 3, 0, false);
        declareFunction("simplify_transitive_redundancies_in_disjunction", "SIMPLIFY-TRANSITIVE-REDUNDANCIES-IN-DISJUNCTION", 1, 0, false);
        declareFunction("necessary_constraint_dict", "NECESSARY-CONSTRAINT-DICT", 2, 0, false);
        declareFunction("transitive_constraint_dict", "TRANSITIVE-CONSTRAINT-DICT", 2, 0, false);
        declareFunction("transitive_constraint_raw_info", "TRANSITIVE-CONSTRAINT-RAW-INFO", 1, 0, false);
        declareFunction("simplify_transitive_redundanciesP", "SIMPLIFY-TRANSITIVE-REDUNDANCIES?", 0, 0, false);
        declareFunction("simplify_contradictionsP", "SIMPLIFY-CONTRADICTIONS?", 0, 0, false);
        declareFunction("simplify_transitive_redundancies_old", "SIMPLIFY-TRANSITIVE-REDUNDANCIES-OLD", 2, 0, false);
        declareFunction("simplify_transitive_redundancies_in_disjunction_old", "SIMPLIFY-TRANSITIVE-REDUNDANCIES-IN-DISJUNCTION-OLD", 2, 0, false);
        declareFunction("simplify_number_expression", "SIMPLIFY-NUMBER-EXPRESSION", 1, 0, false);
        declareFunction("cycl_coerce_types", "CYCL-COERCE-TYPES", 1, 2, false);
        return NIL;
    }

    static private final SubLString $str_alt10$_S_is_not_well_formed_ = makeString("~S is not well formed.");

    static private final SubLString $str_alt17$You_tried_to_negate__S___That_was = makeString("You tried to negate ~S.  That was a bad idea, because it's neither a sentence nor a sentence.");

    static private final SubLList $list_alt19 = list(reader_make_constant_shell("equalSymbols"));

    static private final SubLSymbol $sym20$NESTED_COLLECTIONSUBSETFN_EXPRESSION_ = makeSymbol("NESTED-COLLECTIONSUBSETFN-EXPRESSION?");

    static private final SubLSymbol $sym27$FORMULA_WITH_SEQUENCE_TERM_ = makeSymbol("FORMULA-WITH-SEQUENCE-TERM?");

    static private final SubLString $str_alt29$Splitting_sequence_variables_into = makeString("Splitting sequence variables into other sequence variables is currently not supported. -ECA");

    static private final SubLList $list_alt30 = list(reader_make_constant_shell("isa"), reader_make_constant_shell("genls"));

    private static final SubLSymbol SIMPLIFY_IST_SENTENCE = makeSymbol("SIMPLIFY-IST-SENTENCE");

    static private final SubLString $$$pace = makeString("pace");

    static private final SubLList $list_alt41 = list(list(list(list(reader_make_constant_shell("ist"), reader_make_constant_shell("BaseKB"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeString("a"), reader_make_constant_shell("Thing")), list(reader_make_constant_shell("isa"), makeString("b"), reader_make_constant_shell("Thing"))))), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("ist"), reader_make_constant_shell("BaseKB"), list(reader_make_constant_shell("isa"), makeString("a"), reader_make_constant_shell("Thing"))), list(reader_make_constant_shell("ist"), reader_make_constant_shell("BaseKB"), list(reader_make_constant_shell("isa"), makeString("b"), reader_make_constant_shell("Thing"))))));

    public static final SubLObject init_simplifier_file_alt() {
        defparameter("*SIMPLIFYING-SEQUENCE-VARIABLES?*", NIL);
        defparameter("*SIMPLIFYING-REDUNDANCIES?*", NIL);
        defparameter("*TRANSITIVE-CONSTRAINT-PREDS*", $list_alt30);
        return NIL;
    }

    public static SubLObject init_simplifier_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*SIMPLIFY-CYCL-SENTENCE-AND-SUBSENTENCES?*", NIL);
            defparameter("*SIMPLIFY-INDIVIDUALASFN-EXPRESSIONS-ISA-SENTENCES-TO-ADD*", NIL);
            defparameter("*SIMPLIFYING-SEQUENCE-VARIABLES?*", NIL);
            defparameter("*SIMPLIFYING-REDUNDANCIES?*", NIL);
            defparameter("*TRANSITIVE-CONSTRAINT-PREDS*", $list47);
        }
        if (SubLFiles.USE_V2) {
            defparameter("*TRANSITIVE-CONSTRAINT-PREDS*", $list_alt30);
        }
        return NIL;
    }

    public static SubLObject init_simplifier_file_Previous() {
        defparameter("*SIMPLIFY-CYCL-SENTENCE-AND-SUBSENTENCES?*", NIL);
        defparameter("*SIMPLIFY-INDIVIDUALASFN-EXPRESSIONS-ISA-SENTENCES-TO-ADD*", NIL);
        defparameter("*SIMPLIFYING-SEQUENCE-VARIABLES?*", NIL);
        defparameter("*SIMPLIFYING-REDUNDANCIES?*", NIL);
        defparameter("*TRANSITIVE-CONSTRAINT-PREDS*", $list47);
        return NIL;
    }

    public static final SubLObject setup_simplifier_file_alt() {
        define_test_case_table_int(SIMPLIFY_IST_SENTENCE, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt41);
        return NIL;
    }

    public static SubLObject setup_simplifier_file() {
        if (SubLFiles.USE_V1) {
            register_external_symbol(GET_SIMPLIFIED_CYCL_SENTENCE);
        }
        if (SubLFiles.USE_V2) {
            define_test_case_table_int(SIMPLIFY_IST_SENTENCE, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt41);
        }
        return NIL;
    }

    public static SubLObject setup_simplifier_file_Previous() {
        register_external_symbol(GET_SIMPLIFIED_CYCL_SENTENCE);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_simplifier_file();
    }

    @Override
    public void initializeVariables() {
        init_simplifier_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_simplifier_file();
    }

    static {
    }

    public static final class $simplify_cycl_sentence_int$UnaryFunction extends UnaryFunction {
        public $simplify_cycl_sentence_int$UnaryFunction() {
            super(extractFunctionNamed("SIMPLIFY-CYCL-SENTENCE-INT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return simplify_cycl_sentence_int(arg1, UNPROVIDED);
        }
    }

    public static final class $simplify_cycl_sentence_int$BinaryFunction extends BinaryFunction {
        public $simplify_cycl_sentence_int$BinaryFunction() {
            super(extractFunctionNamed("SIMPLIFY-CYCL-SENTENCE-INT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return simplify_cycl_sentence_int(arg1, arg2);
        }
    }

    public static final class $nested_collectionsubsetfn_expressionP$UnaryFunction extends UnaryFunction {
        public $nested_collectionsubsetfn_expressionP$UnaryFunction() {
            super(extractFunctionNamed("NESTED-COLLECTIONSUBSETFN-EXPRESSION?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return nested_collectionsubsetfn_expressionP(arg1);
        }
    }
}

/**
 * D:\workspace\phase02-jrtl\extra-classes/com/cyc/cycjava/cycl/class Total
 * time: 1073 ms
 */
