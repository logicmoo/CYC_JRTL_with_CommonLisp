/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.copy_formula;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class rkf_example_queries extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new rkf_example_queries();

 public static final String myName = "com.cyc.cycjava.cycl.rkf_example_queries";


    static private final SubLList $list1 = list(reader_make_constant_shell("keCommonQueryExample"), makeKeyword("SENTENCE"));



    static private final SubLList $list4 = list(makeKeyword("SENTENCE"));

    private static final SubLInteger $int$120 = makeInteger(120);

    static private final SubLSymbol $sym6$_SENTENCE = makeSymbol("?SENTENCE");

    static private final SubLSymbol $sym7$_TQ = makeSymbol("?TQ");



    // Definitions
    /**
     * Return the example queries in DOMAIN-MT, or nil if none available.
     */
    @LispMethod(comment = "Return the example queries in DOMAIN-MT, or nil if none available.")
    public static final SubLObject rkf_example_queries_alt(SubLObject domain_mt) {
        return com.cyc.cycjava.cycl.rkf_example_queries.rkf_example_queries_internal(domain_mt);
    }

    // Definitions
    /**
     * Return the example queries in DOMAIN-MT, or nil if none available.
     */
    @LispMethod(comment = "Return the example queries in DOMAIN-MT, or nil if none available.")
    public static SubLObject rkf_example_queries(final SubLObject domain_mt) {
        return rkf_example_queries_internal(domain_mt);
    }

    /**
     * Return the example queries appropriate for TERM in DOMAIN-MT, or nil if none available.
     */
    @LispMethod(comment = "Return the example queries appropriate for TERM in DOMAIN-MT, or nil if none available.")
    public static final SubLObject rkf_example_queries_for_term_alt(SubLObject v_term, SubLObject domain_mt) {
        return com.cyc.cycjava.cycl.rkf_example_queries.rkf_example_queries_for_term_internal(v_term, domain_mt);
    }

    /**
     * Return the example queries appropriate for TERM in DOMAIN-MT, or nil if none available.
     */
    @LispMethod(comment = "Return the example queries appropriate for TERM in DOMAIN-MT, or nil if none available.")
    public static SubLObject rkf_example_queries_for_term(final SubLObject v_term, final SubLObject domain_mt) {
        return rkf_example_queries_for_term_internal(v_term, domain_mt);
    }

    /**
     * Return the test questions appropriate for TERM in DOMAIN-MT or nil if none available.
     */
    @LispMethod(comment = "Return the test questions appropriate for TERM in DOMAIN-MT or nil if none available.")
    public static final SubLObject rkf_test_questions_for_term_alt(SubLObject v_term, SubLObject domain_mt) {
        return com.cyc.cycjava.cycl.rkf_example_queries.rkf_test_questions_for_term_internal(v_term, domain_mt);
    }

    /**
     * Return the test questions appropriate for TERM in DOMAIN-MT or nil if none available.
     */
    @LispMethod(comment = "Return the test questions appropriate for TERM in DOMAIN-MT or nil if none available.")
    public static SubLObject rkf_test_questions_for_term(final SubLObject v_term, final SubLObject domain_mt) {
        return rkf_test_questions_for_term_internal(v_term, domain_mt);
    }

    public static final SubLObject rkf_example_queries_internal_alt(SubLObject domain_mt) {
        {
            SubLObject candidate_queries = backward.removal_ask_variable($SENTENCE, $list_alt1, domain_mt, UNPROVIDED, UNPROVIDED);
            return com.cyc.cycjava.cycl.rkf_example_queries.rkf_eq_convert_query_variables(candidate_queries);
        }
    }

    public static SubLObject rkf_example_queries_internal(final SubLObject domain_mt) {
        final SubLObject candidate_queries = backward.removal_ask_variable($SENTENCE, $list1, domain_mt, UNPROVIDED, UNPROVIDED);
        return rkf_eq_convert_query_variables(candidate_queries);
    }

    public static final SubLObject rkf_eq_convert_query_variables_alt(SubLObject candidate_queries) {
        {
            SubLObject example_queries = NIL;
            SubLObject cdolist_list_var = candidate_queries;
            SubLObject candidate_query = NIL;
            for (candidate_query = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate_query = cdolist_list_var.first()) {
                candidate_query = com.cyc.cycjava.cycl.rkf_example_queries.rkf_eq_meta_variables_to_el_variables(candidate_query);
                example_queries = cons(candidate_query, example_queries);
            }
            return example_queries;
        }
    }

    public static SubLObject rkf_eq_convert_query_variables(final SubLObject candidate_queries) {
        SubLObject example_queries = NIL;
        SubLObject cdolist_list_var = candidate_queries;
        SubLObject candidate_query = NIL;
        candidate_query = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            candidate_query = rkf_eq_meta_variables_to_el_variables(candidate_query);
            example_queries = cons(candidate_query, example_queries);
            cdolist_list_var = cdolist_list_var.rest();
            candidate_query = cdolist_list_var.first();
        } 
        return example_queries;
    }

    public static final SubLObject rkf_eq_meta_variables_to_el_variables_alt(SubLObject formula) {
        {
            SubLObject result = copy_formula(formula);
            SubLObject meta_var = NIL;
            for (meta_var = cycl_utilities.expression_find_if(symbol_function(KEYWORDP), result, UNPROVIDED, UNPROVIDED); NIL != meta_var; meta_var = cycl_utilities.expression_find_if(symbol_function(KEYWORDP), result, UNPROVIDED, UNPROVIDED)) {
                result = cycl_utilities.expression_subst(cycl_variables.make_el_var(symbol_name(meta_var)), meta_var, result, UNPROVIDED, UNPROVIDED);
            }
            return result;
        }
    }

    public static SubLObject rkf_eq_meta_variables_to_el_variables(final SubLObject formula) {
        SubLObject result;
        SubLObject meta_var;
        for (result = copy_formula(formula), meta_var = NIL, meta_var = cycl_utilities.expression_find_if(symbol_function(KEYWORDP), result, UNPROVIDED, UNPROVIDED); NIL != meta_var; meta_var = cycl_utilities.expression_find_if(symbol_function(KEYWORDP), result, UNPROVIDED, UNPROVIDED)) {
            result = cycl_utilities.expression_subst(cycl_variables.make_el_var(symbol_name(meta_var)), meta_var, result, UNPROVIDED, UNPROVIDED);
        }
        return result;
    }

    public static final SubLObject rkf_example_queries_for_term_internal_alt(SubLObject v_term, SubLObject domain_mt) {
        {
            SubLObject candidate_queries = ask_utilities.ask_variable($SENTENCE, listS($$keCommonQueryForTerm, v_term, $list_alt4), domain_mt, ONE_INTEGER, NIL, $int$120, NIL);
            return com.cyc.cycjava.cycl.rkf_example_queries.rkf_eq_convert_query_variables(candidate_queries);
        }
    }

    public static SubLObject rkf_example_queries_for_term_internal(final SubLObject v_term, final SubLObject domain_mt) {
        final SubLObject candidate_queries = ask_utilities.ask_variable($SENTENCE, listS($$keCommonQueryForTerm, v_term, $list4), domain_mt, ONE_INTEGER, NIL, $int$120, NIL);
        return rkf_eq_convert_query_variables(candidate_queries);
    }

    public static final SubLObject rkf_test_questions_for_term_internal_alt(SubLObject v_term, SubLObject domain_mt) {
        {
            SubLObject sentence_var = $sym6$_SENTENCE;
            SubLObject testquestion_var = $sym7$_TQ;
            SubLObject formula = list($$keTestQuestionForTerm, v_term, sentence_var, testquestion_var);
            SubLObject query_properties = ask_utilities.query_properties_from_legacy_ask_parameters(ONE_INTEGER, NIL, $int$120, NIL);
            SubLObject binding_lists = NIL;
            SubLObject test_questions = NIL;
            binding_lists = inference_kernel.new_cyc_query(formula, domain_mt, query_properties);
            {
                SubLObject cdolist_list_var = binding_lists;
                SubLObject binding_list = NIL;
                for (binding_list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding_list = cdolist_list_var.first()) {
                    {
                        SubLObject sentence = bindings.variable_lookup(sentence_var, binding_list);
                        SubLObject transformed_sentence = com.cyc.cycjava.cycl.rkf_example_queries.rkf_eq_meta_variables_to_el_variables(sentence);
                        SubLObject pattern_tq = bindings.variable_lookup(testquestion_var, binding_list);
                        SubLObject true_tq = rkf_query_utilities.rkf_make_similar_test_question(transformed_sentence, pattern_tq, domain_mt);
                        test_questions = cons(true_tq, test_questions);
                    }
                }
            }
            return test_questions;
        }
    }

    public static SubLObject rkf_test_questions_for_term_internal(final SubLObject v_term, final SubLObject domain_mt) {
        final SubLObject sentence_var = $sym6$_SENTENCE;
        final SubLObject testquestion_var = $sym7$_TQ;
        final SubLObject formula = list($$keTestQuestionForTerm, v_term, sentence_var, testquestion_var);
        final SubLObject query_properties = ask_utilities.query_properties_from_legacy_ask_parameters(ONE_INTEGER, NIL, $int$120, NIL);
        SubLObject binding_lists = NIL;
        SubLObject test_questions = NIL;
        SubLObject cdolist_list_var;
        binding_lists = cdolist_list_var = inference_kernel.new_cyc_query(formula, domain_mt, query_properties);
        SubLObject binding_list = NIL;
        binding_list = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject sentence = bindings.variable_lookup(sentence_var, binding_list);
            final SubLObject transformed_sentence = rkf_eq_meta_variables_to_el_variables(sentence);
            final SubLObject pattern_tq = bindings.variable_lookup(testquestion_var, binding_list);
            final SubLObject true_tq = rkf_query_utilities.rkf_make_similar_test_question(transformed_sentence, pattern_tq, domain_mt);
            test_questions = cons(true_tq, test_questions);
            cdolist_list_var = cdolist_list_var.rest();
            binding_list = cdolist_list_var.first();
        } 
        return test_questions;
    }

    public static SubLObject declare_rkf_example_queries_file() {
        declareFunction("rkf_example_queries", "RKF-EXAMPLE-QUERIES", 1, 0, false);
        declareFunction("rkf_example_queries_for_term", "RKF-EXAMPLE-QUERIES-FOR-TERM", 2, 0, false);
        declareFunction("rkf_test_questions_for_term", "RKF-TEST-QUESTIONS-FOR-TERM", 2, 0, false);
        declareFunction("rkf_example_queries_internal", "RKF-EXAMPLE-QUERIES-INTERNAL", 1, 0, false);
        declareFunction("rkf_eq_convert_query_variables", "RKF-EQ-CONVERT-QUERY-VARIABLES", 1, 0, false);
        declareFunction("rkf_eq_meta_variables_to_el_variables", "RKF-EQ-META-VARIABLES-TO-EL-VARIABLES", 1, 0, false);
        declareFunction("rkf_example_queries_for_term_internal", "RKF-EXAMPLE-QUERIES-FOR-TERM-INTERNAL", 2, 0, false);
        declareFunction("rkf_test_questions_for_term_internal", "RKF-TEST-QUESTIONS-FOR-TERM-INTERNAL", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_rkf_example_queries_file() {
        return NIL;
    }

    public static SubLObject setup_rkf_example_queries_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rkf_example_queries_file();
    }

    static private final SubLList $list_alt1 = list(reader_make_constant_shell("keCommonQueryExample"), makeKeyword("SENTENCE"));

    @Override
    public void initializeVariables() {
        init_rkf_example_queries_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rkf_example_queries_file();
    }

    

    static private final SubLList $list_alt4 = list(makeKeyword("SENTENCE"));
}

/**
 * Total time: 22 ms
 */
