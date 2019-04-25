package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_example_queries extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rkf_example_queries";
    public static final String myFingerPrint = "5e2994fa4b03e31ebae29eeed574fd6b5f5071249afae912da382af3a12662a4";
    private static final SubLSymbol $kw0$SENTENCE;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$KEYWORDP;
    private static final SubLObject $const3$keCommonQueryForTerm;
    private static final SubLList $list4;
    private static final SubLInteger $int5$120;
    private static final SubLSymbol $sym6$_SENTENCE;
    private static final SubLSymbol $sym7$_TQ;
    private static final SubLObject $const8$keTestQuestionForTerm;
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-example-queries.lisp", position = 842L)
    public static SubLObject rkf_example_queries(final SubLObject domain_mt) {
        return rkf_example_queries_internal(domain_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-example-queries.lisp", position = 1072L)
    public static SubLObject rkf_example_queries_for_term(final SubLObject v_term, final SubLObject domain_mt) {
        return rkf_example_queries_for_term_internal(v_term, domain_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-example-queries.lisp", position = 1290L)
    public static SubLObject rkf_test_questions_for_term(final SubLObject v_term, final SubLObject domain_mt) {
        return rkf_test_questions_for_term_internal(v_term, domain_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-example-queries.lisp", position = 1504L)
    public static SubLObject rkf_example_queries_internal(final SubLObject domain_mt) {
        final SubLObject candidate_queries = backward.removal_ask_variable((SubLObject)rkf_example_queries.$kw0$SENTENCE, (SubLObject)rkf_example_queries.$list1, domain_mt, (SubLObject)rkf_example_queries.UNPROVIDED, (SubLObject)rkf_example_queries.UNPROVIDED);
        return rkf_eq_convert_query_variables(candidate_queries);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-example-queries.lisp", position = 1820L)
    public static SubLObject rkf_eq_convert_query_variables(final SubLObject candidate_queries) {
        SubLObject example_queries = (SubLObject)rkf_example_queries.NIL;
        SubLObject cdolist_list_var = candidate_queries;
        SubLObject candidate_query = (SubLObject)rkf_example_queries.NIL;
        candidate_query = cdolist_list_var.first();
        while (rkf_example_queries.NIL != cdolist_list_var) {
            candidate_query = rkf_eq_meta_variables_to_el_variables(candidate_query);
            example_queries = (SubLObject)ConsesLow.cons(candidate_query, example_queries);
            cdolist_list_var = cdolist_list_var.rest();
            candidate_query = cdolist_list_var.first();
        }
        return example_queries;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-example-queries.lisp", position = 2179L)
    public static SubLObject rkf_eq_meta_variables_to_el_variables(final SubLObject formula) {
        SubLObject result;
        SubLObject meta_var;
        for (result = el_utilities.copy_formula(formula), meta_var = (SubLObject)rkf_example_queries.NIL, meta_var = cycl_utilities.expression_find_if(Symbols.symbol_function((SubLObject)rkf_example_queries.$sym2$KEYWORDP), result, (SubLObject)rkf_example_queries.UNPROVIDED, (SubLObject)rkf_example_queries.UNPROVIDED); rkf_example_queries.NIL != meta_var; meta_var = cycl_utilities.expression_find_if(Symbols.symbol_function((SubLObject)rkf_example_queries.$sym2$KEYWORDP), result, (SubLObject)rkf_example_queries.UNPROVIDED, (SubLObject)rkf_example_queries.UNPROVIDED)) {
            result = cycl_utilities.expression_subst(cycl_variables.make_el_var(Symbols.symbol_name(meta_var)), meta_var, result, (SubLObject)rkf_example_queries.UNPROVIDED, (SubLObject)rkf_example_queries.UNPROVIDED);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-example-queries.lisp", position = 2525L)
    public static SubLObject rkf_example_queries_for_term_internal(final SubLObject v_term, final SubLObject domain_mt) {
        final SubLObject candidate_queries = ask_utilities.ask_variable((SubLObject)rkf_example_queries.$kw0$SENTENCE, (SubLObject)ConsesLow.listS(rkf_example_queries.$const3$keCommonQueryForTerm, v_term, (SubLObject)rkf_example_queries.$list4), domain_mt, (SubLObject)rkf_example_queries.ONE_INTEGER, (SubLObject)rkf_example_queries.NIL, (SubLObject)rkf_example_queries.$int5$120, (SubLObject)rkf_example_queries.NIL);
        return rkf_eq_convert_query_variables(candidate_queries);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-example-queries.lisp", position = 2798L)
    public static SubLObject rkf_test_questions_for_term_internal(final SubLObject v_term, final SubLObject domain_mt) {
        final SubLObject sentence_var = (SubLObject)rkf_example_queries.$sym6$_SENTENCE;
        final SubLObject testquestion_var = (SubLObject)rkf_example_queries.$sym7$_TQ;
        final SubLObject formula = (SubLObject)ConsesLow.list(rkf_example_queries.$const8$keTestQuestionForTerm, v_term, sentence_var, testquestion_var);
        final SubLObject query_properties = ask_utilities.query_properties_from_legacy_ask_parameters((SubLObject)rkf_example_queries.ONE_INTEGER, (SubLObject)rkf_example_queries.NIL, (SubLObject)rkf_example_queries.$int5$120, (SubLObject)rkf_example_queries.NIL);
        SubLObject binding_lists = (SubLObject)rkf_example_queries.NIL;
        SubLObject test_questions = (SubLObject)rkf_example_queries.NIL;
        SubLObject cdolist_list_var;
        binding_lists = (cdolist_list_var = inference_kernel.new_cyc_query(formula, domain_mt, query_properties));
        SubLObject binding_list = (SubLObject)rkf_example_queries.NIL;
        binding_list = cdolist_list_var.first();
        while (rkf_example_queries.NIL != cdolist_list_var) {
            final SubLObject sentence = bindings.variable_lookup(sentence_var, binding_list);
            final SubLObject transformed_sentence = rkf_eq_meta_variables_to_el_variables(sentence);
            final SubLObject pattern_tq = bindings.variable_lookup(testquestion_var, binding_list);
            final SubLObject true_tq = rkf_query_utilities.rkf_make_similar_test_question(transformed_sentence, pattern_tq, domain_mt);
            test_questions = (SubLObject)ConsesLow.cons(true_tq, test_questions);
            cdolist_list_var = cdolist_list_var.rest();
            binding_list = cdolist_list_var.first();
        }
        return test_questions;
    }
    
    public static SubLObject declare_rkf_example_queries_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_example_queries", "rkf_example_queries", "RKF-EXAMPLE-QUERIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_example_queries", "rkf_example_queries_for_term", "RKF-EXAMPLE-QUERIES-FOR-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_example_queries", "rkf_test_questions_for_term", "RKF-TEST-QUESTIONS-FOR-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_example_queries", "rkf_example_queries_internal", "RKF-EXAMPLE-QUERIES-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_example_queries", "rkf_eq_convert_query_variables", "RKF-EQ-CONVERT-QUERY-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_example_queries", "rkf_eq_meta_variables_to_el_variables", "RKF-EQ-META-VARIABLES-TO-EL-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_example_queries", "rkf_example_queries_for_term_internal", "RKF-EXAMPLE-QUERIES-FOR-TERM-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_example_queries", "rkf_test_questions_for_term_internal", "RKF-TEST-QUESTIONS-FOR-TERM-INTERNAL", 2, 0, false);
        return (SubLObject)rkf_example_queries.NIL;
    }
    
    public static SubLObject init_rkf_example_queries_file() {
        return (SubLObject)rkf_example_queries.NIL;
    }
    
    public static SubLObject setup_rkf_example_queries_file() {
        return (SubLObject)rkf_example_queries.NIL;
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
        me = (SubLFile)new rkf_example_queries();
        $kw0$SENTENCE = SubLObjectFactory.makeKeyword("SENTENCE");
        $list1 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keCommonQueryExample")), (SubLObject)SubLObjectFactory.makeKeyword("SENTENCE"));
        $sym2$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $const3$keCommonQueryForTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keCommonQueryForTerm"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENTENCE"));
        $int5$120 = SubLObjectFactory.makeInteger(120);
        $sym6$_SENTENCE = SubLObjectFactory.makeSymbol("?SENTENCE");
        $sym7$_TQ = SubLObjectFactory.makeSymbol("?TQ");
        $const8$keTestQuestionForTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keTestQuestionForTerm"));
    }
}

/*

	Total time: 22 ms
	
*/