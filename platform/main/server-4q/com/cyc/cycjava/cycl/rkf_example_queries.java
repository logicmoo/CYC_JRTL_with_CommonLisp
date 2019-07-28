package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.rkf_example_queries;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.rkf_example_queries.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class rkf_example_queries extends SubLTranslatedFile {
    public static final SubLFile me = new rkf_example_queries();

    public static final String myName = "com.cyc.cycjava.cycl.rkf_example_queries";

    public static final String myFingerPrint = "5e2994fa4b03e31ebae29eeed574fd6b5f5071249afae912da382af3a12662a4";



    public static final SubLList $list1 = list(reader_make_constant_shell(makeString("keCommonQueryExample")), makeKeyword("SENTENCE"));



    private static final SubLObject $$keCommonQueryForTerm = reader_make_constant_shell(makeString("keCommonQueryForTerm"));

    public static final SubLList $list4 = list(makeKeyword("SENTENCE"));

    private static final SubLInteger $int$120 = makeInteger(120);

    public static final SubLSymbol $sym6$_SENTENCE = makeSymbol("?SENTENCE");

    public static final SubLSymbol $sym7$_TQ = makeSymbol("?TQ");

    private static final SubLObject $$keTestQuestionForTerm = reader_make_constant_shell(makeString("keTestQuestionForTerm"));

    public static SubLObject rkf_example_queries(final SubLObject domain_mt) {
        return rkf_example_queries_internal(domain_mt);
    }

    public static SubLObject rkf_example_queries_for_term(final SubLObject v_term, final SubLObject domain_mt) {
        return rkf_example_queries_for_term_internal(v_term, domain_mt);
    }

    public static SubLObject rkf_test_questions_for_term(final SubLObject v_term, final SubLObject domain_mt) {
        return rkf_test_questions_for_term_internal(v_term, domain_mt);
    }

    public static SubLObject rkf_example_queries_internal(final SubLObject domain_mt) {
        final SubLObject candidate_queries = backward.removal_ask_variable($SENTENCE, $list1, domain_mt, UNPROVIDED, UNPROVIDED);
        return rkf_eq_convert_query_variables(candidate_queries);
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

    public static SubLObject rkf_eq_meta_variables_to_el_variables(final SubLObject formula) {
        SubLObject result;
        SubLObject meta_var;
        for (result = copy_formula(formula), meta_var = NIL, meta_var = cycl_utilities.expression_find_if(symbol_function(KEYWORDP), result, UNPROVIDED, UNPROVIDED); NIL != meta_var; meta_var = cycl_utilities.expression_find_if(symbol_function(KEYWORDP), result, UNPROVIDED, UNPROVIDED)) {
            result = cycl_utilities.expression_subst(cycl_variables.make_el_var(symbol_name(meta_var)), meta_var, result, UNPROVIDED, UNPROVIDED);
        }
        return result;
    }

    public static SubLObject rkf_example_queries_for_term_internal(final SubLObject v_term, final SubLObject domain_mt) {
        final SubLObject candidate_queries = ask_utilities.ask_variable($SENTENCE, listS($$keCommonQueryForTerm, v_term, $list4), domain_mt, ONE_INTEGER, NIL, $int$120, NIL);
        return rkf_eq_convert_query_variables(candidate_queries);
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
        declareFunction(me, "rkf_example_queries", "RKF-EXAMPLE-QUERIES", 1, 0, false);
        declareFunction(me, "rkf_example_queries_for_term", "RKF-EXAMPLE-QUERIES-FOR-TERM", 2, 0, false);
        declareFunction(me, "rkf_test_questions_for_term", "RKF-TEST-QUESTIONS-FOR-TERM", 2, 0, false);
        declareFunction(me, "rkf_example_queries_internal", "RKF-EXAMPLE-QUERIES-INTERNAL", 1, 0, false);
        declareFunction(me, "rkf_eq_convert_query_variables", "RKF-EQ-CONVERT-QUERY-VARIABLES", 1, 0, false);
        declareFunction(me, "rkf_eq_meta_variables_to_el_variables", "RKF-EQ-META-VARIABLES-TO-EL-VARIABLES", 1, 0, false);
        declareFunction(me, "rkf_example_queries_for_term_internal", "RKF-EXAMPLE-QUERIES-FOR-TERM-INTERNAL", 2, 0, false);
        declareFunction(me, "rkf_test_questions_for_term_internal", "RKF-TEST-QUESTIONS-FOR-TERM-INTERNAL", 2, 0, false);
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

    @Override
    public void initializeVariables() {
        init_rkf_example_queries_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rkf_example_queries_file();
    }

    static {










    }
}

/**
 * Total time: 22 ms
 */
