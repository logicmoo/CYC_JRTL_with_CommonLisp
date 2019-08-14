/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$curried_kbq_lookupP$;
import static com.cyc.cycjava.cycl.el_utilities.possibly_quote;
import static com.cyc.cycjava.cycl.el_utilities.possibly_unquote;
import static com.cyc.cycjava.cycl.el_utilities.sentence_free_variables;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.butlast;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.concept_tagger;
import com.cyc.cycjava.cycl.constraint_filters;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.disjoint_with;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.query_library_utils;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-MODULES-RELEVANT-SIMILAR-QUERIES
 * source file: /cyc/top/cycl/inference/modules/removal/removal-modules-relevant-similar-queries.lisp
 * created:     2019/07/03 17:38:26
 */
public final class removal_modules_relevant_similar_queries extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_relevant_similar_queries();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relevant_similar_queries";


    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $pertinent_query_sentence_with_terms_cost$ = makeSymbol("*PERTINENT-QUERY-SENTENCE-WITH-TERMS-COST*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(reader_make_constant_shell("NoAmountFn"), reader_make_constant_shell("Relevance"));

    private static final SubLFloat $float$0_25 = makeDouble(0.25);

    static private final SubLList $list2 = list(reader_make_constant_shell("LowAmountFn"), reader_make_constant_shell("Relevance"));

    private static final SubLFloat $float$0_5 = makeDouble(0.5);

    static private final SubLList $list4 = list(reader_make_constant_shell("MediumAmountFn"), reader_make_constant_shell("Relevance"));

    private static final SubLFloat $float$0_75 = makeDouble(0.75);

    static private final SubLList $list6 = list(reader_make_constant_shell("HighAmountFn"), reader_make_constant_shell("Relevance"));

    static private final SubLList $list7 = list(reader_make_constant_shell("VeryHighAmountFn"), reader_make_constant_shell("Relevance"));

    private static final SubLObject $const8$querySpecificationForFormulaTempl = reader_make_constant_shell("querySpecificationForFormulaTemplate");



    private static final SubLSymbol $kw12$PERTINENT_QUERY_SENTENCE_WITH_TERMS_UNIFY_ARGS3_4 = makeKeyword("PERTINENT-QUERY-SENTENCE-WITH-TERMS-UNIFY-ARGS3&4");

    private static final SubLList $list13 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("pertinentQuerySentenceWithTerms"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("pertinentQuerySentenceWithTerms"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*PERTINENT-QUERY-SENTENCE-WITH-TERMS-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("pertinentQuerySentenceWithTerms"), list($BIND, makeSymbol("INPUT-SENTENCE")), list($BIND, makeSymbol("TERM-SET")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), list(list(makeKeyword("VALUE"), makeSymbol("INPUT-SENTENCE")), list(makeKeyword("VALUE"), makeSymbol("TERM-SET")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("PERTINENT-QUERY-SENTENCES-WITH-TERMS"), list(makeKeyword("VALUE"), makeSymbol("INPUT-SENTENCE")), list(makeKeyword("VALUE"), makeSymbol("TERM-SET"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("NEW-SENTENCE"), makeSymbol("SUBST-COUNT")), list(reader_make_constant_shell("pertinentQuerySentenceWithTerms"), list(makeKeyword("VALUE"), makeSymbol("INPUT-SENTENCE")), list(makeKeyword("VALUE"), makeSymbol("TERM-SET")), list(makeKeyword("VALUE"), makeSymbol("NEW-SENTENCE")), list(makeKeyword("VALUE"), makeSymbol("SUBST-COUNT")))), makeKeyword("DOCUMENTATION"), makeString("(#$formulaForStringPertinentToDegreeFromFolderOfType <string> <not-fully-bound> <not-fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$formulaForStringPertinentToDegreeFromFolderOfType \"al Qaeda\" ?QUERY ?RELEVANCE #$FolderWithIntelligenceQueriesForSuggestion)") });

    private static final SubLSymbol $sym14$_X = makeSymbol("?X");



    private static final SubLObject $const16$termInSentenceOfQuerySpecificatio = reader_make_constant_shell("termInSentenceOfQuerySpecificationOfType");

    private static final SubLSymbol $TERM_IN_SENTENCE_OF_QUERY_SPECIFICATION_OF_TYPE_POS_UNIFY_ARG2 = makeKeyword("TERM-IN-SENTENCE-OF-QUERY-SPECIFICATION-OF-TYPE-POS-UNIFY-ARG2");

    private static final SubLList $list18 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termInSentenceOfQuerySpecificationOfType"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termInSentenceOfQuerySpecificationOfType"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), $COST, makeSymbol("TERM-IN-SENTENCE-OF-QUERY-SPECIFICATION-OF-TYPE-POS-UNIFY-ARG2-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("termInSentenceOfQuerySpecificationOfType"), list($BIND, makeSymbol("TERM")), makeKeyword("NOT-FULLY-BOUND"), list($BIND, makeSymbol("FOLDER-TYPE"))), list(list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("FOLDER-TYPE")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("TERM-IN-SENTENCE-OF-QUERY-SPECIFICATION-OF-TYPE-POS-UNIFY-ARG2-ITERATOR"), list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("FOLDER-TYPE"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("termInSentenceOfQuerySpecificationOfType"), list(makeKeyword("VALUE"), makeSymbol("TERM")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("FOLDER-TYPE"))), makeKeyword("DOCUMENTATION"), makeString("(#$termInSentenceOfQuerySpecificationOfType <fully-bound> <not-fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$termInSentenceOfQuerySpecificationOfType #$AlQaida ?CYCL-Q-SPEC #$FolderWithIntelligenceQueriesForSuggestion)") });



    private static final SubLObject $const20$sentenceParameterValueInSpecifica = reader_make_constant_shell("sentenceParameterValueInSpecification");

    private static final SubLList $list21 = list(makeSymbol("ARG-POS"), makeSymbol("SUBSTITUTIONS"));

    static private final SubLList $list22 = list(makeSymbol("FORMULA"), makeSymbol("FORMULA-WEIGHT"), makeSymbol("SUBSTITUTION-COUNT"));

    static private final SubLList $list23 = list(makeSymbol("TERM"), makeSymbol("SUBST-WEIGHT"));

    private static final SubLSymbol $sym24$EQUALS_EL_ = makeSymbol("EQUALS-EL?");

    private static final SubLSymbol SUBSTITUTION_GATHER_TERM = makeSymbol("SUBSTITUTION-GATHER-TERM");

    // Definitions
    public static final SubLObject relevance_for_query_alt(SubLObject query) {
        {
            SubLObject weight = query_library_utils.ql_parse_weight(query);
            if (ZERO_INTEGER.numE(weight)) {
                return narts_high.nart_substitute($list_alt0);
            } else {
                if ($float$0_25.numGE(weight)) {
                    return narts_high.nart_substitute($list_alt2);
                } else {
                    if ($float$0_5.numGE(weight)) {
                        return narts_high.nart_substitute($list_alt4);
                    } else {
                        if ($float$0_75.numGE(weight)) {
                            return narts_high.nart_substitute($list_alt6);
                        } else {
                            return narts_high.nart_substitute($list_alt7);
                        }
                    }
                }
            }
        }
    }

    // Definitions
    public static SubLObject relevance_for_query(final SubLObject query) {
        final SubLObject weight = query_library_utils.ql_parse_weight(query);
        if (ZERO_INTEGER.numE(weight)) {
            return narts_high.nart_substitute($list0);
        }
        if ($float$0_25.numGE(weight)) {
            return narts_high.nart_substitute($list2);
        }
        if ($float$0_5.numGE(weight)) {
            return narts_high.nart_substitute($list4);
        }
        if ($float$0_75.numGE(weight)) {
            return narts_high.nart_substitute($list6);
        }
        return narts_high.nart_substitute($list7);
    }

    public static final SubLObject formula_for_query_alt(SubLObject query) {
        {
            SubLObject result = NIL;
            SubLObject query_spec = NIL;
            SubLObject pred_var = $const8$querySpecificationForFormulaTempl;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(query, ONE_INTEGER, pred_var)) {
                {
                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(query, ONE_INTEGER, pred_var);
                    SubLObject done_var = result;
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
                                            SubLObject done_var_1 = result;
                                            SubLObject token_var_2 = NIL;
                                            while (NIL == done_var_1) {
                                                {
                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_2);
                                                    SubLObject valid_3 = makeBoolean(token_var_2 != assertion);
                                                    if (NIL != valid_3) {
                                                        query_spec = assertions_high.gaf_arg(assertion, TWO_INTEGER);
                                                        result = kb_query.kbq_sentence(query_spec);
                                                    }
                                                    done_var_1 = makeBoolean((NIL == valid_3) || (NIL != result));
                                                }
                                            } 
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                            try {
                                                bind($is_thread_performing_cleanupP$, T);
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                            } finally {
                                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                            }
                                        }
                                    }
                                }
                            }
                            done_var = makeBoolean((NIL == valid) || (NIL != result));
                        }
                    } 
                }
            }
            return result;
        }
    }

    public static SubLObject formula_for_query(final SubLObject query) {
        SubLObject result = NIL;
        SubLObject query_spec = NIL;
        final SubLObject pred_var = $const8$querySpecificationForFormulaTempl;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(query, ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(query, ONE_INTEGER, pred_var);
            SubLObject done_var = result;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                        SubLObject done_var_$1 = result;
                        final SubLObject token_var_$2 = NIL;
                        while (NIL == done_var_$1) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                            final SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(assertion));
                            if (NIL != valid_$3) {
                                query_spec = assertions_high.gaf_arg(assertion, TWO_INTEGER);
                                result = kb_query.kbq_sentence(query_spec);
                            }
                            done_var_$1 = makeBoolean((NIL == valid_$3) || (NIL != result));
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = makeBoolean((NIL == valid) || (NIL != result));
            } 
        }
        return result;
    }

    public static final SubLObject pertinent_query_sentences_with_terms_alt(SubLObject sentence, SubLObject term_set) {
        {
            SubLObject term_list = ask_utilities.query_variable($sym13$_X, list($$elementOf, $sym13$_X, term_set), UNPROVIDED, UNPROVIDED);
            SubLObject raw_result = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relevant_similar_queries.substitute_query_terms_into_cycl(possibly_unquote(sentence), term_list, T);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = raw_result;
            SubLObject item = NIL;
            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                result = cons(list(possibly_quote(item.first()), third(item)), result);
            }
            return result;
        }
    }

    public static SubLObject pertinent_query_sentences_with_terms(final SubLObject sentence, final SubLObject term_set) {
        final SubLObject term_list = ask_utilities.query_variable($sym14$_X, list($$elementOf, $sym14$_X, term_set), UNPROVIDED, UNPROVIDED);
        final SubLObject raw_result = substitute_query_terms_into_cycl(possibly_unquote(sentence), term_list, T);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = raw_result;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(list(possibly_quote(item.first()), third(item)), result);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject term_in_sentence_of_query_specification_of_type_pos_unify_arg2_cost_alt(SubLObject asent) {
        return ONE_INTEGER;
    }

    public static SubLObject term_in_sentence_of_query_specification_of_type_pos_unify_arg2_cost(final SubLObject asent) {
        return ONE_INTEGER;
    }

    public static final SubLObject term_in_sentence_of_query_specification_of_type_pos_unify_arg2_iterator_alt(SubLObject v_term, SubLObject folder_type) {
        return iteration.new_list_iterator(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relevant_similar_queries.term_in_sentence_of_query_specification_of_type_pos_unify_arg2(v_term, folder_type));
    }

    public static SubLObject term_in_sentence_of_query_specification_of_type_pos_unify_arg2_iterator(final SubLObject v_term, final SubLObject folder_type) {
        return iteration.new_list_iterator(term_in_sentence_of_query_specification_of_type_pos_unify_arg2(v_term, folder_type));
    }

    public static final SubLObject term_in_sentence_of_query_specification_of_type_pos_unify_arg2_alt(SubLObject v_term, SubLObject folder_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject cdolist_list_var = isa.all_fort_instances(folder_type, UNPROVIDED, UNPROVIDED);
                SubLObject folder = NIL;
                for (folder = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , folder = cdolist_list_var.first()) {
                    {
                        SubLObject pred_var = $$folderContainsResource;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(folder, ONE_INTEGER, pred_var)) {
                            {
                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(folder, ONE_INTEGER, pred_var);
                                SubLObject done_var = NIL;
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
                                                        SubLObject done_var_4 = NIL;
                                                        SubLObject token_var_5 = NIL;
                                                        while (NIL == done_var_4) {
                                                            {
                                                                SubLObject fcr_ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_5);
                                                                SubLObject valid_6 = makeBoolean(token_var_5 != fcr_ass);
                                                                if (NIL != valid_6) {
                                                                    {
                                                                        SubLObject template = cycl_utilities.formula_arg2(fcr_ass, UNPROVIDED);
                                                                        SubLObject pred_var_7 = $const8$querySpecificationForFormulaTempl;
                                                                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(template, ONE_INTEGER, pred_var_7)) {
                                                                            {
                                                                                SubLObject iterator_var_8 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(template, ONE_INTEGER, pred_var_7);
                                                                                SubLObject done_var_9 = NIL;
                                                                                SubLObject token_var_10 = NIL;
                                                                                while (NIL == done_var_9) {
                                                                                    {
                                                                                        SubLObject final_index_spec_11 = iteration.iteration_next_without_values_macro_helper(iterator_var_8, token_var_10);
                                                                                        SubLObject valid_12 = makeBoolean(token_var_10 != final_index_spec_11);
                                                                                        if (NIL != valid_12) {
                                                                                            {
                                                                                                SubLObject final_index_iterator_13 = NIL;
                                                                                                try {
                                                                                                    final_index_iterator_13 = kb_mapping_macros.new_final_index_iterator(final_index_spec_11, $GAF, NIL, NIL);
                                                                                                    {
                                                                                                        SubLObject done_var_14 = NIL;
                                                                                                        SubLObject token_var_15 = NIL;
                                                                                                        while (NIL == done_var_14) {
                                                                                                            {
                                                                                                                SubLObject qsfft_ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator_13, token_var_15);
                                                                                                                SubLObject valid_16 = makeBoolean(token_var_15 != qsfft_ass);
                                                                                                                if (NIL != valid_16) {
                                                                                                                    {
                                                                                                                        SubLObject cycl_q_spec = cycl_utilities.formula_arg2(qsfft_ass, UNPROVIDED);
                                                                                                                        if (NIL != $curried_kbq_lookupP$.getDynamicValue(thread)) {
                                                                                                                            {
                                                                                                                                SubLObject pred_var_17 = $const19$sentenceParameterValueInSpecifica;
                                                                                                                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(cycl_q_spec, TWO_INTEGER, pred_var_17)) {
                                                                                                                                    {
                                                                                                                                        SubLObject iterator_var_18 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(cycl_q_spec, TWO_INTEGER, pred_var_17);
                                                                                                                                        SubLObject done_var_19 = NIL;
                                                                                                                                        SubLObject token_var_20 = NIL;
                                                                                                                                        while (NIL == done_var_19) {
                                                                                                                                            {
                                                                                                                                                SubLObject final_index_spec_21 = iteration.iteration_next_without_values_macro_helper(iterator_var_18, token_var_20);
                                                                                                                                                SubLObject valid_22 = makeBoolean(token_var_20 != final_index_spec_21);
                                                                                                                                                if (NIL != valid_22) {
                                                                                                                                                    {
                                                                                                                                                        SubLObject final_index_iterator_23 = NIL;
                                                                                                                                                        try {
                                                                                                                                                            final_index_iterator_23 = kb_mapping_macros.new_final_index_iterator(final_index_spec_21, $GAF, NIL, NIL);
                                                                                                                                                            {
                                                                                                                                                                SubLObject done_var_24 = NIL;
                                                                                                                                                                SubLObject token_var_25 = NIL;
                                                                                                                                                                while (NIL == done_var_24) {
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject spvis_ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator_23, token_var_25);
                                                                                                                                                                        SubLObject valid_26 = makeBoolean(token_var_25 != spvis_ass);
                                                                                                                                                                        if (NIL != valid_26) {
                                                                                                                                                                            if (NIL != cycl_utilities.expression_find(v_term, cycl_utilities.formula_arg1(spvis_ass, UNPROVIDED), T, symbol_function(EQUAL), UNPROVIDED)) {
                                                                                                                                                                                result = cons(cycl_q_spec, result);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        done_var_24 = makeBoolean(NIL == valid_26);
                                                                                                                                                                    }
                                                                                                                                                                } 
                                                                                                                                                            }
                                                                                                                                                        } finally {
                                                                                                                                                            {
                                                                                                                                                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                                                                try {
                                                                                                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                                                                    if (NIL != final_index_iterator_23) {
                                                                                                                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator_23);
                                                                                                                                                                    }
                                                                                                                                                                } finally {
                                                                                                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                done_var_19 = makeBoolean(NIL == valid_22);
                                                                                                                                            }
                                                                                                                                        } 
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            {
                                                                                                                                SubLObject pred_var_27 = $const20$softwareParameterValueInSpecifica;
                                                                                                                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(cycl_q_spec, THREE_INTEGER, pred_var_27)) {
                                                                                                                                    {
                                                                                                                                        SubLObject iterator_var_28 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(cycl_q_spec, THREE_INTEGER, pred_var_27);
                                                                                                                                        SubLObject done_var_29 = NIL;
                                                                                                                                        SubLObject token_var_30 = NIL;
                                                                                                                                        while (NIL == done_var_29) {
                                                                                                                                            {
                                                                                                                                                SubLObject final_index_spec_31 = iteration.iteration_next_without_values_macro_helper(iterator_var_28, token_var_30);
                                                                                                                                                SubLObject valid_32 = makeBoolean(token_var_30 != final_index_spec_31);
                                                                                                                                                if (NIL != valid_32) {
                                                                                                                                                    {
                                                                                                                                                        SubLObject final_index_iterator_33 = NIL;
                                                                                                                                                        try {
                                                                                                                                                            final_index_iterator_33 = kb_mapping_macros.new_final_index_iterator(final_index_spec_31, $GAF, NIL, NIL);
                                                                                                                                                            {
                                                                                                                                                                SubLObject done_var_34 = NIL;
                                                                                                                                                                SubLObject token_var_35 = NIL;
                                                                                                                                                                while (NIL == done_var_34) {
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject spvis_ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator_33, token_var_35);
                                                                                                                                                                        SubLObject valid_36 = makeBoolean(token_var_35 != spvis_ass);
                                                                                                                                                                        if (NIL != valid_36) {
                                                                                                                                                                            if (cycl_utilities.formula_arg1(spvis_ass, UNPROVIDED) == $$InferenceSentenceParameter) {
                                                                                                                                                                                if (NIL != cycl_utilities.expression_find(v_term, cycl_utilities.formula_arg2(spvis_ass, UNPROVIDED), T, symbol_function(EQUAL), UNPROVIDED)) {
                                                                                                                                                                                    result = cons(cycl_q_spec, result);
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        done_var_34 = makeBoolean(NIL == valid_36);
                                                                                                                                                                    }
                                                                                                                                                                } 
                                                                                                                                                            }
                                                                                                                                                        } finally {
                                                                                                                                                            {
                                                                                                                                                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                                                                try {
                                                                                                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                                                                    if (NIL != final_index_iterator_33) {
                                                                                                                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator_33);
                                                                                                                                                                    }
                                                                                                                                                                } finally {
                                                                                                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                done_var_29 = makeBoolean(NIL == valid_32);
                                                                                                                                            }
                                                                                                                                        } 
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                done_var_14 = makeBoolean(NIL == valid_16);
                                                                                                            }
                                                                                                        } 
                                                                                                    }
                                                                                                } finally {
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                        try {
                                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                            if (NIL != final_index_iterator_13) {
                                                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator_13);
                                                                                                            }
                                                                                                        } finally {
                                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        done_var_9 = makeBoolean(NIL == valid_12);
                                                                                    }
                                                                                } 
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                done_var_4 = makeBoolean(NIL == valid_6);
                                                            }
                                                        } 
                                                    }
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            if (NIL != final_index_iterator) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                            }
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        done_var = makeBoolean(NIL == valid);
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

    public static SubLObject term_in_sentence_of_query_specification_of_type_pos_unify_arg2(final SubLObject v_term, final SubLObject folder_type) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = isa.all_fort_instances(folder_type, UNPROVIDED, UNPROVIDED);
        SubLObject folder = NIL;
        folder = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pred_var = $$folderContainsResource;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(folder, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(folder, ONE_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$4 = NIL;
                            final SubLObject token_var_$5 = NIL;
                            while (NIL == done_var_$4) {
                                final SubLObject fcr_ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                final SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(fcr_ass));
                                if (NIL != valid_$6) {
                                    final SubLObject template = cycl_utilities.formula_arg2(fcr_ass, UNPROVIDED);
                                    final SubLObject pred_var_$7 = $const8$querySpecificationForFormulaTempl;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(template, ONE_INTEGER, pred_var_$7)) {
                                        final SubLObject iterator_var_$8 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(template, ONE_INTEGER, pred_var_$7);
                                        SubLObject done_var_$5 = NIL;
                                        final SubLObject token_var_$6 = NIL;
                                        while (NIL == done_var_$5) {
                                            final SubLObject final_index_spec_$11 = iteration.iteration_next_without_values_macro_helper(iterator_var_$8, token_var_$6);
                                            final SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(final_index_spec_$11));
                                            if (NIL != valid_$7) {
                                                SubLObject final_index_iterator_$13 = NIL;
                                                try {
                                                    final_index_iterator_$13 = kb_mapping_macros.new_final_index_iterator(final_index_spec_$11, $GAF, NIL, NIL);
                                                    SubLObject done_var_$6 = NIL;
                                                    final SubLObject token_var_$7 = NIL;
                                                    while (NIL == done_var_$6) {
                                                        final SubLObject qsfft_ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator_$13, token_var_$7);
                                                        final SubLObject valid_$8 = makeBoolean(!token_var_$7.eql(qsfft_ass));
                                                        if (NIL != valid_$8) {
                                                            final SubLObject cycl_q_spec = cycl_utilities.formula_arg2(qsfft_ass, UNPROVIDED);
                                                            final SubLObject pred_var_$8 = $const20$sentenceParameterValueInSpecifica;
                                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(cycl_q_spec, TWO_INTEGER, pred_var_$8)) {
                                                                final SubLObject iterator_var_$9 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(cycl_q_spec, TWO_INTEGER, pred_var_$8);
                                                                SubLObject done_var_$7 = NIL;
                                                                final SubLObject token_var_$8 = NIL;
                                                                while (NIL == done_var_$7) {
                                                                    final SubLObject final_index_spec_$12 = iteration.iteration_next_without_values_macro_helper(iterator_var_$9, token_var_$8);
                                                                    final SubLObject valid_$9 = makeBoolean(!token_var_$8.eql(final_index_spec_$12));
                                                                    if (NIL != valid_$9) {
                                                                        SubLObject final_index_iterator_$14 = NIL;
                                                                        try {
                                                                            final_index_iterator_$14 = kb_mapping_macros.new_final_index_iterator(final_index_spec_$12, $GAF, NIL, NIL);
                                                                            SubLObject done_var_$8 = NIL;
                                                                            final SubLObject token_var_$9 = NIL;
                                                                            while (NIL == done_var_$8) {
                                                                                final SubLObject spvis_ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator_$14, token_var_$9);
                                                                                final SubLObject valid_$10 = makeBoolean(!token_var_$9.eql(spvis_ass));
                                                                                if ((NIL != valid_$10) && (NIL != cycl_utilities.expression_find(v_term, cycl_utilities.formula_arg1(spvis_ass, UNPROVIDED), T, symbol_function(EQUAL), UNPROVIDED))) {
                                                                                    result = cons(cycl_q_spec, result);
                                                                                }
                                                                                done_var_$8 = makeBoolean(NIL == valid_$10);
                                                                            } 
                                                                        } finally {
                                                                            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                                            try {
                                                                                bind($is_thread_performing_cleanupP$, T);
                                                                                final SubLObject _values = getValuesAsVector();
                                                                                if (NIL != final_index_iterator_$14) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator_$14);
                                                                                }
                                                                                restoreValuesFromVector(_values);
                                                                            } finally {
                                                                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var_$7 = makeBoolean(NIL == valid_$9);
                                                                } 
                                                            }
                                                        }
                                                        done_var_$6 = makeBoolean(NIL == valid_$8);
                                                    } 
                                                } finally {
                                                    final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
                                                    try {
                                                        bind($is_thread_performing_cleanupP$, T);
                                                        final SubLObject _values2 = getValuesAsVector();
                                                        if (NIL != final_index_iterator_$13) {
                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator_$13);
                                                        }
                                                        restoreValuesFromVector(_values2);
                                                    } finally {
                                                        rebind($is_thread_performing_cleanupP$, _prev_bind_2);
                                                    }
                                                }
                                            }
                                            done_var_$5 = makeBoolean(NIL == valid_$7);
                                        } 
                                    }
                                }
                                done_var_$4 = makeBoolean(NIL == valid_$6);
                            } 
                        } finally {
                            final SubLObject _prev_bind_3 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                final SubLObject _values3 = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values3);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_3);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            folder = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject substitute_sentence_terms_into_query_alt(SubLObject cycl, SubLObject sentence_string) {
        {
            SubLObject term_list = concept_tagger.all_tagged_concepts(sentence_string, UNPROVIDED);
            return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relevant_similar_queries.substitute_query_terms_into_cycl(cycl, term_list, UNPROVIDED);
        }
    }

    public static SubLObject substitute_sentence_terms_into_query(final SubLObject cycl, final SubLObject sentence_string) {
        final SubLObject term_list = concept_tagger.all_tagged_concepts(sentence_string, UNPROVIDED);
        return substitute_query_terms_into_cycl(cycl, term_list, UNPROVIDED);
    }

    public static final SubLObject substitute_query_alt(SubLObject cycl, SubLObject strings, SubLObject mt) {
        {
            SubLObject term_list = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relevant_similar_queries.query_subst_string_denots(strings);
            return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relevant_similar_queries.substitute_query_terms_into_cycl(cycl, term_list, UNPROVIDED);
        }
    }

    public static SubLObject substitute_query(final SubLObject cycl, final SubLObject strings, final SubLObject mt) {
        final SubLObject term_list = query_subst_string_denots(strings);
        return substitute_query_terms_into_cycl(cycl, term_list, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; list of (sentence weight substitution-count) elements
     */
    @LispMethod(comment = "@return listp; list of (sentence weight substitution-count) elements")
    public static final SubLObject substitute_query_terms_into_cycl_alt(SubLObject cycl, SubLObject term_list, SubLObject all_permutationsP) {
        if (all_permutationsP == UNPROVIDED) {
            all_permutationsP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject arg_poses_for_possible_subst = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relevant_similar_queries.query_subst_find_substitutable_terms(cycl);
                SubLObject sub_list = NIL;
                SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        {
                            SubLObject cdolist_list_var = arg_poses_for_possible_subst;
                            SubLObject argpos_to_replace = NIL;
                            for (argpos_to_replace = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argpos_to_replace = cdolist_list_var.first()) {
                                {
                                    SubLObject possible_substitutions_for_argpos = NIL;
                                    SubLObject cdolist_list_var_37 = term_list;
                                    SubLObject term_from_list = NIL;
                                    for (term_from_list = cdolist_list_var_37.first(); NIL != cdolist_list_var_37; cdolist_list_var_37 = cdolist_list_var_37.rest() , term_from_list = cdolist_list_var_37.first()) {
                                        {
                                            SubLObject substitution_score = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relevant_similar_queries.substitution_weight(cycl, argpos_to_replace, term_from_list, UNPROVIDED);
                                            if (substitution_score.numG(ZERO_INTEGER)) {
                                                possible_substitutions_for_argpos = cons(list(term_from_list, substitution_score), possible_substitutions_for_argpos);
                                            }
                                        }
                                    }
                                    if (NIL != possible_substitutions_for_argpos) {
                                        sub_list = cons(list(argpos_to_replace, possible_substitutions_for_argpos), sub_list);
                                    }
                                }
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject current_cycls = NIL;
                    SubLObject new_cycls = list(list(cycl, ONE_INTEGER, ZERO_INTEGER));
                    SubLObject result = NIL;
                    SubLObject final_round = NIL;
                    SubLObject final_subst = last(sub_list, UNPROVIDED).first();
                    SubLObject cdolist_list_var = sub_list;
                    SubLObject arg_pos_subst_options = NIL;
                    for (arg_pos_subst_options = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg_pos_subst_options = cdolist_list_var.first()) {
                        if (arg_pos_subst_options.equal(final_subst)) {
                            final_round = T;
                        }
                        {
                            SubLObject datum = arg_pos_subst_options;
                            SubLObject current = datum;
                            SubLObject arg_pos = NIL;
                            SubLObject substitutions = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt22);
                            arg_pos = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt22);
                            substitutions = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                current_cycls = new_cycls;
                                {
                                    SubLObject cdolist_list_var_38 = current_cycls;
                                    SubLObject current_cycl = NIL;
                                    for (current_cycl = cdolist_list_var_38.first(); NIL != cdolist_list_var_38; cdolist_list_var_38 = cdolist_list_var_38.rest() , current_cycl = cdolist_list_var_38.first()) {
                                        {
                                            SubLObject datum_39 = current_cycl;
                                            SubLObject current_40 = datum_39;
                                            SubLObject formula = NIL;
                                            SubLObject formula_weight = NIL;
                                            SubLObject substitution_count = NIL;
                                            destructuring_bind_must_consp(current_40, datum_39, $list_alt23);
                                            formula = current_40.first();
                                            current_40 = current_40.rest();
                                            destructuring_bind_must_consp(current_40, datum_39, $list_alt23);
                                            formula_weight = current_40.first();
                                            current_40 = current_40.rest();
                                            destructuring_bind_must_consp(current_40, datum_39, $list_alt23);
                                            substitution_count = current_40.first();
                                            current_40 = current_40.rest();
                                            if (NIL == current_40) {
                                                {
                                                    SubLObject cdolist_list_var_41 = substitutions;
                                                    SubLObject substitution = NIL;
                                                    for (substitution = cdolist_list_var_41.first(); NIL != cdolist_list_var_41; cdolist_list_var_41 = cdolist_list_var_41.rest() , substitution = cdolist_list_var_41.first()) {
                                                        {
                                                            SubLObject datum_42 = substitution;
                                                            SubLObject current_43 = datum_42;
                                                            SubLObject v_term = NIL;
                                                            SubLObject subst_weight = NIL;
                                                            destructuring_bind_must_consp(current_43, datum_42, $list_alt24);
                                                            v_term = current_43.first();
                                                            current_43 = current_43.rest();
                                                            destructuring_bind_must_consp(current_43, datum_42, $list_alt24);
                                                            subst_weight = current_43.first();
                                                            current_43 = current_43.rest();
                                                            if (NIL == current_43) {
                                                                if (NIL == com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relevant_similar_queries.term_already_in_literalP(v_term, arg_pos, formula)) {
                                                                    {
                                                                        SubLObject substituted_entry = list(cycl_utilities.formula_arg_position_subst(v_term, arg_pos, formula), multiply(subst_weight, formula_weight), number_utilities.f_1X(substitution_count));
                                                                        new_cycls = cons(substituted_entry, new_cycls);
                                                                        if ((NIL != final_round) || (NIL != all_permutationsP)) {
                                                                            result = cons(substituted_entry, result);
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                cdestructuring_bind_error(datum_42, $list_alt24);
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                cdestructuring_bind_error(datum_39, $list_alt23);
                                            }
                                        }
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt22);
                            }
                        }
                    }
                    return remove_duplicates(result, $sym25$EQUALS_EL_, FIRST, UNPROVIDED, UNPROVIDED);
                }
            }
        }
    }

    /**
     *
     *
     * @return listp; list of (sentence weight substitution-count) elements
     */
    @LispMethod(comment = "@return listp; list of (sentence weight substitution-count) elements")
    public static SubLObject substitute_query_terms_into_cycl(final SubLObject cycl, final SubLObject term_list, SubLObject all_permutationsP) {
        if (all_permutationsP == UNPROVIDED) {
            all_permutationsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg_poses_for_possible_subst = query_subst_find_substitutable_terms(cycl);
        SubLObject sub_list = NIL;
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
            SubLObject cdolist_list_var = arg_poses_for_possible_subst;
            SubLObject argpos_to_replace = NIL;
            argpos_to_replace = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject possible_substitutions_for_argpos = NIL;
                SubLObject cdolist_list_var_$27 = term_list;
                SubLObject term_from_list = NIL;
                term_from_list = cdolist_list_var_$27.first();
                while (NIL != cdolist_list_var_$27) {
                    final SubLObject substitution_score = substitution_weight(cycl, argpos_to_replace, term_from_list, UNPROVIDED);
                    if (substitution_score.numG(ZERO_INTEGER)) {
                        possible_substitutions_for_argpos = cons(list(term_from_list, substitution_score), possible_substitutions_for_argpos);
                    }
                    cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                    term_from_list = cdolist_list_var_$27.first();
                } 
                if (NIL != possible_substitutions_for_argpos) {
                    sub_list = cons(list(argpos_to_replace, possible_substitutions_for_argpos), sub_list);
                }
                cdolist_list_var = cdolist_list_var.rest();
                argpos_to_replace = cdolist_list_var.first();
            } 
        } finally {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        SubLObject current_cycls = NIL;
        SubLObject new_cycls = list(list(cycl, ONE_INTEGER, ZERO_INTEGER));
        SubLObject result = NIL;
        SubLObject final_round = NIL;
        final SubLObject final_subst = last(sub_list, UNPROVIDED).first();
        SubLObject cdolist_list_var2 = sub_list;
        SubLObject arg_pos_subst_options = NIL;
        arg_pos_subst_options = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (arg_pos_subst_options.equal(final_subst)) {
                final_round = T;
            }
            SubLObject current;
            final SubLObject datum = current = arg_pos_subst_options;
            SubLObject arg_pos = NIL;
            SubLObject substitutions = NIL;
            destructuring_bind_must_consp(current, datum, $list21);
            arg_pos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list21);
            substitutions = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject cdolist_list_var_$28;
                current_cycls = cdolist_list_var_$28 = new_cycls;
                SubLObject current_cycl = NIL;
                current_cycl = cdolist_list_var_$28.first();
                while (NIL != cdolist_list_var_$28) {
                    SubLObject current_$30;
                    final SubLObject datum_$29 = current_$30 = current_cycl;
                    SubLObject formula = NIL;
                    SubLObject formula_weight = NIL;
                    SubLObject substitution_count = NIL;
                    destructuring_bind_must_consp(current_$30, datum_$29, $list22);
                    formula = current_$30.first();
                    current_$30 = current_$30.rest();
                    destructuring_bind_must_consp(current_$30, datum_$29, $list22);
                    formula_weight = current_$30.first();
                    current_$30 = current_$30.rest();
                    destructuring_bind_must_consp(current_$30, datum_$29, $list22);
                    substitution_count = current_$30.first();
                    current_$30 = current_$30.rest();
                    if (NIL == current_$30) {
                        SubLObject cdolist_list_var_$29 = substitutions;
                        SubLObject substitution = NIL;
                        substitution = cdolist_list_var_$29.first();
                        while (NIL != cdolist_list_var_$29) {
                            SubLObject current_$31;
                            final SubLObject datum_$30 = current_$31 = substitution;
                            SubLObject v_term = NIL;
                            SubLObject subst_weight = NIL;
                            destructuring_bind_must_consp(current_$31, datum_$30, $list23);
                            v_term = current_$31.first();
                            current_$31 = current_$31.rest();
                            destructuring_bind_must_consp(current_$31, datum_$30, $list23);
                            subst_weight = current_$31.first();
                            current_$31 = current_$31.rest();
                            if (NIL == current_$31) {
                                if (NIL == term_already_in_literalP(v_term, arg_pos, formula)) {
                                    final SubLObject substituted_entry = list(cycl_utilities.formula_arg_position_subst(v_term, arg_pos, formula), multiply(subst_weight, formula_weight), number_utilities.f_1X(substitution_count));
                                    new_cycls = cons(substituted_entry, new_cycls);
                                    if ((NIL != final_round) || (NIL != all_permutationsP)) {
                                        result = cons(substituted_entry, result);
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum_$30, $list23);
                            }
                            cdolist_list_var_$29 = cdolist_list_var_$29.rest();
                            substitution = cdolist_list_var_$29.first();
                        } 
                    } else {
                        cdestructuring_bind_error(datum_$29, $list22);
                    }
                    cdolist_list_var_$28 = cdolist_list_var_$28.rest();
                    current_cycl = cdolist_list_var_$28.first();
                } 
            } else {
                cdestructuring_bind_error(datum, $list21);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            arg_pos_subst_options = cdolist_list_var2.first();
        } 
        return remove_duplicates(result, $sym24$EQUALS_EL_, FIRST, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject query_subst_string_denots_alt(SubLObject strings) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = strings;
            SubLObject string = NIL;
            for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , string = cdolist_list_var.first()) {
                {
                    SubLObject denots = lexicon_accessors.denots_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != denots) {
                        result = cconcatenate(denots, result);
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject query_subst_string_denots(final SubLObject strings) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = strings;
        SubLObject string = NIL;
        string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject denots = lexicon_accessors.denots_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != denots) {
                result = cconcatenate(denots, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        } 
        return result;
    }

    /**
     *
     *
     * @return listp, a list of arg-positions that are eligible for substitutions; currently defined as variables plus non-predicate, non-string denotational terms
     */
    @LispMethod(comment = "@return listp, a list of arg-positions that are eligible for substitutions; currently defined as variables plus non-predicate, non-string denotational terms")
    public static final SubLObject query_subst_find_substitutable_terms_alt(SubLObject cycl) {
        {
            SubLObject result = NIL;
            SubLObject free_vars = sentence_free_variables(cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject terms = cycl_utilities.expression_gather(cycl, SUBSTITUTION_GATHER_TERM, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = cconcatenate(terms, free_vars);
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                result = cconcatenate(cycl_utilities.arg_positions_dfs(v_term, cycl, UNPROVIDED), result);
            }
            return result;
        }
    }

    /**
     *
     *
     * @return listp, a list of arg-positions that are eligible for substitutions; currently defined as variables plus non-predicate, non-string denotational terms
     */
    @LispMethod(comment = "@return listp, a list of arg-positions that are eligible for substitutions; currently defined as variables plus non-predicate, non-string denotational terms")
    public static SubLObject query_subst_find_substitutable_terms(final SubLObject cycl) {
        SubLObject result = NIL;
        final SubLObject free_vars = sentence_free_variables(cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject terms = cycl_utilities.expression_gather(cycl, SUBSTITUTION_GATHER_TERM, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = cconcatenate(terms, free_vars);
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cconcatenate(cycl_utilities.arg_positions_dfs(v_term, cycl, UNPROVIDED), result);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject substitution_gather_term_alt(SubLObject v_term) {
        return makeBoolean((((((NIL != cycl_grammar.cycl_denotational_term_p(v_term)) && (NIL == fort_types_interface.relation_p(v_term))) && (!v_term.isString())) && (NIL == cycl_grammar.cycl_variable_p(v_term))) && (NIL == fort_types_interface.microtheory_p(v_term))) && (NIL == hlmt.time_parameterP(v_term)));
    }

    public static SubLObject substitution_gather_term(final SubLObject v_term) {
        return makeBoolean((((((NIL != cycl_grammar.cycl_denotational_term_p(v_term)) && (NIL == fort_types_interface.relation_p(v_term))) && (!v_term.isString())) && (NIL == cycl_grammar.cycl_variable_p(v_term))) && (NIL == fort_types_interface.microtheory_p(v_term))) && (NIL == hlmt.time_parameterP(v_term)));
    }

    /**
     *
     *
     * @return numberp; the weight, (between 0 and 1, approximately the same as a probability) that should be assigned to
    substituting TERM into CYCL at ARG-POS
     */
    @LispMethod(comment = "@return numberp; the weight, (between 0 and 1, approximately the same as a probability) that should be assigned to\r\nsubstituting TERM into CYCL at ARG-POS")
    public static final SubLObject substitution_weight_alt(SubLObject cycl, SubLObject arg_pos, SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            SubLObject result = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relevant_similar_queries.filter_unsubstitutable_terms_for_argpos(arg_pos, cycl, mt, list(v_term), T);
            if (NIL != result) {
                return ONE_INTEGER;
            } else {
                return ZERO_INTEGER;
            }
        }
    }

    /**
     *
     *
     * @return numberp; the weight, (between 0 and 1, approximately the same as a probability) that should be assigned to
    substituting TERM into CYCL at ARG-POS
     */
    @LispMethod(comment = "@return numberp; the weight, (between 0 and 1, approximately the same as a probability) that should be assigned to\r\nsubstituting TERM into CYCL at ARG-POS")
    public static SubLObject substitution_weight(final SubLObject cycl, final SubLObject arg_pos, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLObject result = filter_unsubstitutable_terms_for_argpos(arg_pos, cycl, mt, list(v_term), T);
        if (NIL != result) {
            return ONE_INTEGER;
        }
        return ZERO_INTEGER;
    }

    public static final SubLObject filter_unsubstitutable_terms_for_argpos_alt(SubLObject arg_pos, SubLObject formula, SubLObject mt, SubLObject terms, SubLObject restrict_multiplesP) {
        if (restrict_multiplesP == UNPROVIDED) {
            restrict_multiplesP = NIL;
        }
        {
            SubLObject heuristically_reasonable_terms = NIL;
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relevant_similar_queries.meets_heuristic_substitution_constraints(v_term, formula, arg_pos, mt, restrict_multiplesP)) {
                    heuristically_reasonable_terms = cons(v_term, heuristically_reasonable_terms);
                }
            }
            return constraint_filters.filter_terms_for_arg_constraints_at_argpos(arg_pos, formula, mt, heuristically_reasonable_terms, UNPROVIDED);
        }
    }

    public static SubLObject filter_unsubstitutable_terms_for_argpos(final SubLObject arg_pos, final SubLObject formula, final SubLObject mt, final SubLObject terms, SubLObject restrict_multiplesP) {
        if (restrict_multiplesP == UNPROVIDED) {
            restrict_multiplesP = NIL;
        }
        SubLObject heuristically_reasonable_terms = NIL;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != meets_heuristic_substitution_constraints(v_term, formula, arg_pos, mt, restrict_multiplesP)) {
                heuristically_reasonable_terms = cons(v_term, heuristically_reasonable_terms);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return constraint_filters.filter_terms_for_arg_constraints_at_argpos(arg_pos, formula, mt, heuristically_reasonable_terms, UNPROVIDED);
    }

    public static final SubLObject meets_heuristic_substitution_constraints_alt(SubLObject v_term, SubLObject formula, SubLObject arg_pos, SubLObject mt, SubLObject restrict_multiplesP) {
        {
            SubLObject original_term = cycl_utilities.formula_arg_position(formula, arg_pos, UNPROVIDED);
            if (NIL != cycl_grammar.cycl_variable_p(original_term)) {
                return makeBoolean(!((NIL != restrict_multiplesP) && (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relevant_similar_queries.term_already_in_literalP(v_term, arg_pos, formula))));
            } else {
                return makeBoolean(((NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relevant_similar_queries.terms_of_same_orderP(v_term, original_term)) && (NIL == disjoint_with.disjoint_withP(v_term, original_term, mt, UNPROVIDED))) && ((NIL == restrict_multiplesP) || (NIL == com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relevant_similar_queries.term_already_in_literalP(v_term, arg_pos, formula))));
            }
        }
    }

    public static SubLObject meets_heuristic_substitution_constraints(final SubLObject v_term, final SubLObject formula, final SubLObject arg_pos, final SubLObject mt, final SubLObject restrict_multiplesP) {
        final SubLObject original_term = cycl_utilities.formula_arg_position(formula, arg_pos, UNPROVIDED);
        if (NIL != cycl_grammar.cycl_variable_p(original_term)) {
            return makeBoolean((NIL == restrict_multiplesP) || (NIL == term_already_in_literalP(v_term, arg_pos, formula)));
        }
        return makeBoolean(((NIL != terms_of_same_orderP(v_term, original_term)) && (NIL == disjoint_with.disjoint_withP(v_term, original_term, mt, UNPROVIDED))) && ((NIL == restrict_multiplesP) || (NIL == term_already_in_literalP(v_term, arg_pos, formula))));
    }

    public static final SubLObject term_already_in_literalP_alt(SubLObject v_term, SubLObject arg_pos, SubLObject sentence) {
        return subl_promotions.memberP(v_term, cycl_utilities.formula_arg_position(sentence, butlast(arg_pos, UNPROVIDED), UNPROVIDED), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject term_already_in_literalP(final SubLObject v_term, final SubLObject arg_pos, final SubLObject sentence) {
        return subl_promotions.memberP(v_term, cycl_utilities.formula_arg_position(sentence, butlast(arg_pos, UNPROVIDED), UNPROVIDED), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject terms_of_same_orderP_alt(SubLObject term1, SubLObject term2) {
        return eq(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relevant_similar_queries.my_term_order(term1), com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relevant_similar_queries.my_term_order(term2));
    }

    public static SubLObject terms_of_same_orderP(final SubLObject term1, final SubLObject term2) {
        return eql(my_term_order(term1), my_term_order(term2));
    }

    public static final SubLObject my_term_order_alt(SubLObject v_term) {
        if (NIL != kb_accessors.individualP(v_term)) {
            return ZERO_INTEGER;
        } else {
            return ONE_INTEGER;
        }
    }

    public static SubLObject my_term_order(final SubLObject v_term) {
        if (NIL != kb_accessors.individualP(v_term)) {
            return ZERO_INTEGER;
        }
        return ONE_INTEGER;
    }

    public static SubLObject declare_removal_modules_relevant_similar_queries_file() {
        declareFunction("relevance_for_query", "RELEVANCE-FOR-QUERY", 1, 0, false);
        declareFunction("formula_for_query", "FORMULA-FOR-QUERY", 1, 0, false);
        declareFunction("pertinent_query_sentences_with_terms", "PERTINENT-QUERY-SENTENCES-WITH-TERMS", 2, 0, false);
        declareFunction("term_in_sentence_of_query_specification_of_type_pos_unify_arg2_cost", "TERM-IN-SENTENCE-OF-QUERY-SPECIFICATION-OF-TYPE-POS-UNIFY-ARG2-COST", 1, 0, false);
        declareFunction("term_in_sentence_of_query_specification_of_type_pos_unify_arg2_iterator", "TERM-IN-SENTENCE-OF-QUERY-SPECIFICATION-OF-TYPE-POS-UNIFY-ARG2-ITERATOR", 2, 0, false);
        declareFunction("term_in_sentence_of_query_specification_of_type_pos_unify_arg2", "TERM-IN-SENTENCE-OF-QUERY-SPECIFICATION-OF-TYPE-POS-UNIFY-ARG2", 2, 0, false);
        declareFunction("substitute_sentence_terms_into_query", "SUBSTITUTE-SENTENCE-TERMS-INTO-QUERY", 2, 0, false);
        declareFunction("substitute_query", "SUBSTITUTE-QUERY", 3, 0, false);
        declareFunction("substitute_query_terms_into_cycl", "SUBSTITUTE-QUERY-TERMS-INTO-CYCL", 2, 1, false);
        declareFunction("query_subst_string_denots", "QUERY-SUBST-STRING-DENOTS", 1, 0, false);
        declareFunction("query_subst_find_substitutable_terms", "QUERY-SUBST-FIND-SUBSTITUTABLE-TERMS", 1, 0, false);
        declareFunction("substitution_gather_term", "SUBSTITUTION-GATHER-TERM", 1, 0, false);
        declareFunction("substitution_weight", "SUBSTITUTION-WEIGHT", 3, 1, false);
        declareFunction("filter_unsubstitutable_terms_for_argpos", "FILTER-UNSUBSTITUTABLE-TERMS-FOR-ARGPOS", 4, 1, false);
        declareFunction("meets_heuristic_substitution_constraints", "MEETS-HEURISTIC-SUBSTITUTION-CONSTRAINTS", 5, 0, false);
        declareFunction("term_already_in_literalP", "TERM-ALREADY-IN-LITERAL?", 3, 0, false);
        declareFunction("terms_of_same_orderP", "TERMS-OF-SAME-ORDER?", 2, 0, false);
        declareFunction("my_term_order", "MY-TERM-ORDER", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_relevant_similar_queries_file() {
        defparameter("*PERTINENT-QUERY-SENTENCE-WITH-TERMS-COST*", ONE_INTEGER);
        return NIL;
    }

    public static final SubLObject setup_removal_modules_relevant_similar_queries_file_alt() {
        inference_modules.register_solely_specific_removal_module_predicate($$pertinentQuerySentenceWithTerms);
        inference_modules.inference_removal_module($kw11$PERTINENT_QUERY_SENTENCE_WITH_TERMS_UNIFY_ARGS3_4, $list_alt12);
        inference_modules.register_solely_specific_removal_module_predicate($const15$termInSentenceOfQuerySpecificatio);
        inference_modules.inference_removal_module($TERM_IN_SENTENCE_OF_QUERY_SPECIFICATION_OF_TYPE_POS_UNIFY_ARG2, $list_alt17);
        return NIL;
    }

    public static SubLObject setup_removal_modules_relevant_similar_queries_file() {
        if (SubLFiles.USE_V1) {
            inference_modules.register_solely_specific_removal_module_predicate($$pertinentQuerySentenceWithTerms);
            preference_modules.doomed_unless_arg_bindable($POS, $$pertinentQuerySentenceWithTerms, ONE_INTEGER);
            preference_modules.doomed_unless_arg_bindable($POS, $$pertinentQuerySentenceWithTerms, TWO_INTEGER);
            inference_modules.inference_removal_module($kw12$PERTINENT_QUERY_SENTENCE_WITH_TERMS_UNIFY_ARGS3_4, $list13);
            inference_modules.register_solely_specific_removal_module_predicate($const16$termInSentenceOfQuerySpecificatio);
            preference_modules.doomed_unless_arg_bindable($POS, $const16$termInSentenceOfQuerySpecificatio, ONE_INTEGER);
            preference_modules.doomed_unless_arg_bindable($POS, $const16$termInSentenceOfQuerySpecificatio, THREE_INTEGER);
            inference_modules.inference_removal_module($TERM_IN_SENTENCE_OF_QUERY_SPECIFICATION_OF_TYPE_POS_UNIFY_ARG2, $list18);
        }
        if (SubLFiles.USE_V2) {
            inference_modules.inference_removal_module($kw11$PERTINENT_QUERY_SENTENCE_WITH_TERMS_UNIFY_ARGS3_4, $list_alt12);
            inference_modules.register_solely_specific_removal_module_predicate($const15$termInSentenceOfQuerySpecificatio);
            inference_modules.inference_removal_module($TERM_IN_SENTENCE_OF_QUERY_SPECIFICATION_OF_TYPE_POS_UNIFY_ARG2, $list_alt17);
        }
        return NIL;
    }

    public static SubLObject setup_removal_modules_relevant_similar_queries_file_Previous() {
        inference_modules.register_solely_specific_removal_module_predicate($$pertinentQuerySentenceWithTerms);
        preference_modules.doomed_unless_arg_bindable($POS, $$pertinentQuerySentenceWithTerms, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$pertinentQuerySentenceWithTerms, TWO_INTEGER);
        inference_modules.inference_removal_module($kw12$PERTINENT_QUERY_SENTENCE_WITH_TERMS_UNIFY_ARGS3_4, $list13);
        inference_modules.register_solely_specific_removal_module_predicate($const16$termInSentenceOfQuerySpecificatio);
        preference_modules.doomed_unless_arg_bindable($POS, $const16$termInSentenceOfQuerySpecificatio, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $const16$termInSentenceOfQuerySpecificatio, THREE_INTEGER);
        inference_modules.inference_removal_module($TERM_IN_SENTENCE_OF_QUERY_SPECIFICATION_OF_TYPE_POS_UNIFY_ARG2, $list18);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_relevant_similar_queries_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_relevant_similar_queries_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_relevant_similar_queries_file();
    }

    static {
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(reader_make_constant_shell("NoAmountFn"), reader_make_constant_shell("Relevance"));

    static private final SubLList $list_alt2 = list(reader_make_constant_shell("LowAmountFn"), reader_make_constant_shell("Relevance"));

    static private final SubLList $list_alt4 = list(reader_make_constant_shell("MediumAmountFn"), reader_make_constant_shell("Relevance"));

    static private final SubLList $list_alt6 = list(reader_make_constant_shell("HighAmountFn"), reader_make_constant_shell("Relevance"));

    static private final SubLList $list_alt7 = list(reader_make_constant_shell("VeryHighAmountFn"), reader_make_constant_shell("Relevance"));

    public static final SubLSymbol $kw11$PERTINENT_QUERY_SENTENCE_WITH_TERMS_UNIFY_ARGS3_4 = makeKeyword("PERTINENT-QUERY-SENTENCE-WITH-TERMS-UNIFY-ARGS3&4");

    static private final SubLList $list_alt12 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("pertinentQuerySentenceWithTerms"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("pertinentQuerySentenceWithTerms"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*PERTINENT-QUERY-SENTENCE-WITH-TERMS-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("pertinentQuerySentenceWithTerms"), list($BIND, makeSymbol("INPUT-SENTENCE")), list($BIND, makeSymbol("TERM-SET")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), list(list(makeKeyword("VALUE"), makeSymbol("INPUT-SENTENCE")), list(makeKeyword("VALUE"), makeSymbol("TERM-SET")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("PERTINENT-QUERY-SENTENCES-WITH-TERMS"), list(makeKeyword("VALUE"), makeSymbol("INPUT-SENTENCE")), list(makeKeyword("VALUE"), makeSymbol("TERM-SET"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("NEW-SENTENCE"), makeSymbol("SUBST-COUNT")), list(reader_make_constant_shell("pertinentQuerySentenceWithTerms"), list(makeKeyword("VALUE"), makeSymbol("INPUT-SENTENCE")), list(makeKeyword("VALUE"), makeSymbol("TERM-SET")), list(makeKeyword("VALUE"), makeSymbol("NEW-SENTENCE")), list(makeKeyword("VALUE"), makeSymbol("SUBST-COUNT")))), makeKeyword("DOCUMENTATION"), makeString("(#$formulaForStringPertinentToDegreeFromFolderOfType <string> <not-fully-bound> <not-fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$formulaForStringPertinentToDegreeFromFolderOfType \"al Qaeda\" ?QUERY ?RELEVANCE #$FolderWithIntelligenceQueriesForSuggestion)") });

    static private final SubLSymbol $sym13$_X = makeSymbol("?X");

    public static final SubLObject $const15$termInSentenceOfQuerySpecificatio = reader_make_constant_shell("termInSentenceOfQuerySpecificationOfType");

    static private final SubLList $list_alt17 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termInSentenceOfQuerySpecificationOfType"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termInSentenceOfQuerySpecificationOfType"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), $COST, makeSymbol("TERM-IN-SENTENCE-OF-QUERY-SPECIFICATION-OF-TYPE-POS-UNIFY-ARG2-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("termInSentenceOfQuerySpecificationOfType"), list($BIND, makeSymbol("TERM")), makeKeyword("NOT-FULLY-BOUND"), list($BIND, makeSymbol("FOLDER-TYPE"))), list(list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("FOLDER-TYPE")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("TERM-IN-SENTENCE-OF-QUERY-SPECIFICATION-OF-TYPE-POS-UNIFY-ARG2-ITERATOR"), list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("FOLDER-TYPE"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("termInSentenceOfQuerySpecificationOfType"), list(makeKeyword("VALUE"), makeSymbol("TERM")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("FOLDER-TYPE"))), makeKeyword("DOCUMENTATION"), makeString("(#$termInSentenceOfQuerySpecificationOfType <fully-bound> <not-fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$termInSentenceOfQuerySpecificationOfType #$AlQaida ?CYCL-Q-SPEC #$FolderWithIntelligenceQueriesForSuggestion)") });

    public static final SubLObject $const19$sentenceParameterValueInSpecifica = reader_make_constant_shell("sentenceParameterValueInSpecification");

    public static final SubLObject $const20$softwareParameterValueInSpecifica = reader_make_constant_shell("softwareParameterValueInSpecification");



    static private final SubLList $list_alt22 = list(makeSymbol("ARG-POS"), makeSymbol("SUBSTITUTIONS"));

    static private final SubLList $list_alt23 = list(makeSymbol("FORMULA"), makeSymbol("FORMULA-WEIGHT"), makeSymbol("SUBSTITUTION-COUNT"));

    static private final SubLList $list_alt24 = list(makeSymbol("TERM"), makeSymbol("SUBST-WEIGHT"));

    static private final SubLSymbol $sym25$EQUALS_EL_ = makeSymbol("EQUALS-EL?");
}

/**
 * Total time: 430 ms
 */
