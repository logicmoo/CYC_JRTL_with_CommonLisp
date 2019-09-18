package com.cyc.cycjava.cycl.inference;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$kbq_run_query_practice_modeP$;
import static com.cyc.cycjava.cycl.control_vars.$save_asked_queriesP$;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.closedP;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.el_list_items;
import static com.cyc.cycjava.cycl.el_utilities.el_list_p;
import static com.cyc.cycjava.cycl.el_utilities.el_set_items;
import static com.cyc.cycjava.cycl.el_utilities.extensional_set_elements;
import static com.cyc.cycjava.cycl.el_utilities.ist_sentence_p;
import static com.cyc.cycjava.cycl.el_utilities.ist_sentence_with_chlmt_p;
import static com.cyc.cycjava.cycl.el_utilities.make_el_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_el_list;
import static com.cyc.cycjava.cycl.el_utilities.make_formula;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.keywordp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nsubst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sublis;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.bookkeeping_store;
import com.cyc.cycjava.cycl.canon_tl;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.encapsulation;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.hlmt_czer;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.parameter_specification_utilities;
import com.cyc.cycjava.cycl.quantities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_identifier;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.cb_kct_test;
import com.cyc.cycjava.cycl.inference.browser.cb_kb_query;
import com.cyc.cycjava.cycl.inference.harness.inference_czer;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_parameters;
import com.cyc.cycjava.cycl.inference.harness.inference_proof_spec;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.inference.harness.inference_trivial;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class kb_query extends SubLTranslatedFile {
    public static final SubLFile me = new kb_query();

    public static final String myName = "com.cyc.cycjava.cycl.inference.kb_query";

    public static final String myFingerPrint = "1f2f8f77798bb4a84ea2d7b9d9df50e6931844b3a61744863fc12118b651d402";

    // defparameter
    private static final SubLSymbol $transcript_kbq_definition_assertionsP$ = makeSymbol("*TRANSCRIPT-KBQ-DEFINITION-ASSERTIONS?*");

    // defparameter
    public static final SubLSymbol $use_kbq_practice_rulesP$ = makeSymbol("*USE-KBQ-PRACTICE-RULES?*");

    private static final SubLObject $$CycLQuerySpecification = reader_make_constant_shell(makeString("CycLQuerySpecification"));







    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    public static final SubLList $list5 = list(reader_make_constant_shell(makeString("MultipleChoiceQuerySpecification")));

    private static final SubLList $list6 = list(reader_make_constant_shell(makeString("CycLQuerySpecification")));

    private static final SubLSymbol UPDATE_KBQ_DEFINITION = makeSymbol("UPDATE-KBQ-DEFINITION");

    private static final SubLObject $$TestVocabularyMt = reader_make_constant_shell(makeString("TestVocabularyMt"));

    private static final SubLSymbol UPDATE_KBQ_DEFINITION_SILENT = makeSymbol("UPDATE-KBQ-DEFINITION-SILENT");

    private static final SubLSymbol $sym10$_EXIT = makeSymbol("%EXIT");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $$InferenceSentenceParameter = reader_make_constant_shell(makeString("InferenceSentenceParameter"));

    private static final SubLObject $const14$sentenceParameterValueInSpecifica = reader_make_constant_shell(makeString("sentenceParameterValueInSpecification"));





    private static final SubLObject $$InferenceMicrotheoryParameter = reader_make_constant_shell(makeString("InferenceMicrotheoryParameter"));

    private static final SubLObject $const18$microtheoryParameterValueInSpecif = reader_make_constant_shell(makeString("microtheoryParameterValueInSpecification"));

    private static final SubLObject $$InferenceModeParameter = reader_make_constant_shell(makeString("InferenceModeParameter"));

    private static final SubLObject $const20$inferenceModeParameterValueInSpec = reader_make_constant_shell(makeString("inferenceModeParameterValueInSpecification"));

    private static final SubLObject $const21$softwareParameterValueInSpecifica = reader_make_constant_shell(makeString("softwareParameterValueInSpecification"));

    private static final SubLObject $$ist_Asserted = reader_make_constant_shell(makeString("ist-Asserted"));

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

    private static final SubLObject $$Quote = reader_make_constant_shell(makeString("Quote"));

    private static final SubLObject $$EscapeQuote = reader_make_constant_shell(makeString("EscapeQuote"));

    private static final SubLString $str26$Inference_Parameter__S_unknown_by = makeString("Inference Parameter ~S unknown by the KB.");

    private static final SubLObject $$InferenceAllowedRulesParameter = reader_make_constant_shell(makeString("InferenceAllowedRulesParameter"));

    private static final SubLObject $$queryPracticeRules = reader_make_constant_shell(makeString("queryPracticeRules"));

    private static final SubLSymbol $NON_EXPLANATORY_SENTENCE = makeKeyword("NON-EXPLANATORY-SENTENCE");

    private static final SubLList $list30 = list(makeSymbol("OPTION-NUM"), makeSymbol("FULL-LABEL"), makeSymbol("INDEX-LABEL"), makeSymbol("PAYLOAD"));





    private static final SubLSymbol KB_SET_OF_BINDING_SETS_P = makeSymbol("KB-SET-OF-BINDING-SETS-P");

    private static final SubLObject $$MCQuestionNthOptionFn = reader_make_constant_shell(makeString("MCQuestionNthOptionFn"));

    private static final SubLObject $$multipleChoiceOptionFullLabel = reader_make_constant_shell(makeString("multipleChoiceOptionFullLabel"));

    private static final SubLObject $$multipleChoiceOptionIndexLabel = reader_make_constant_shell(makeString("multipleChoiceOptionIndexLabel"));

    private static final SubLObject $$multipleChoiceOptionPayload = reader_make_constant_shell(makeString("multipleChoiceOptionPayload"));

    private static final SubLObject $$comment = reader_make_constant_shell(makeString("comment"));

    private static final SubLList $list39 = list(makeSymbol("COMMENT"));

    private static final SubLString $str40$The_template___A__passed_for_the_ = makeString("The template, ~A, passed for the query spec, ~A, is not the one known in the KB (~A).");

    private static final SubLObject $$TemplateFromTestQueryFn = reader_make_constant_shell(makeString("TemplateFromTestQueryFn"));

    private static final SubLList $list42 = list(makeSymbol("FOLDER"), makeSymbol("MT"));

    private static final SubLObject $$formulaTemplateGloss = reader_make_constant_shell(makeString("formulaTemplateGloss"));

    private static final SubLObject $$folderContainsResource = reader_make_constant_shell(makeString("folderContainsResource"));

    private static final SubLList $list45 = list(reader_make_constant_shell(makeString("QueryFn")), list(makeKeyword("BIND"), makeSymbol("QUOTED-SENTENCE")), makeKeyword("ANYTHING"));

    private static final SubLSymbol QUOTED_SENTENCE = makeSymbol("QUOTED-SENTENCE");

    private static final SubLList $list47 = list(reader_make_constant_shell(makeString("QueryFromTemplateFn")), list(makeKeyword("BIND"), makeSymbol("QUESTION-TEMPLATE")), list(makeKeyword("BIND"), makeSymbol("EL-SUBSTITUTIONS")));

    private static final SubLSymbol EL_SUBSTITUTIONS = makeSymbol("EL-SUBSTITUTIONS");

    private static final SubLSymbol QUESTION_TEMPLATE = makeSymbol("QUESTION-TEMPLATE");

    private static final SubLString $str50$The_query_specification___A__has_ = makeString("The query specification, ~A, has no #$InferenceSentenceParameter.");

    private static final SubLString $str51$The_query_specification___A__has_ = makeString("The query specification, ~A, has more than one #$InferenceSentenceParameter.");

    private static final SubLObject $$cycLPattern = reader_make_constant_shell(makeString("cycLPattern"));

    private static final SubLObject $$metaTemplate = reader_make_constant_shell(makeString("metaTemplate"));

    private static final SubLList $list54 = list(makeSymbol("TEMPLATE-TERM"), makeSymbol("ACTUAL-TERM"));

    private static final SubLObject $const55$QuestionSuggestionTemplate_Single = reader_make_constant_shell(makeString("QuestionSuggestionTemplate-SingleOption"));

    private static final SubLObject $$questionTemplateInstantiations = reader_make_constant_shell(makeString("questionTemplateInstantiations"));

    private static final SubLObject $const57$InferenceNonExplanatorySentencePa = reader_make_constant_shell(makeString("InferenceNonExplanatorySentenceParameter"));

    private static final SubLList $list58 = list(reader_make_constant_shell(makeString("QueryFn")), list(reader_make_constant_shell(makeString("Quote")), list(reader_make_constant_shell(makeString("ist")), list(makeKeyword("BIND"), makeSymbol("MT")), makeKeyword("ANYTHING"))), makeKeyword("ANYTHING"));



    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLString $str61$The_query_specification___A__has_ = makeString("The query specification, ~A, has more than one #$InferenceMicrotheoryParameter.");

    private static final SubLObject $const62$querySpecificationForFormulaTempl = reader_make_constant_shell(makeString("querySpecificationForFormulaTemplate"));

    private static final SubLSymbol KBQ_QUERY_PROPERTIES = makeSymbol("KBQ-QUERY-PROPERTIES");





    private static final SubLObject $$MultipleChoiceKBContentTest = reader_make_constant_shell(makeString("MultipleChoiceKBContentTest"));

    private static final SubLObject $$MultipleChoiceQuerySpecification = reader_make_constant_shell(makeString("MultipleChoiceQuerySpecification"));

    private static final SubLSymbol KBQ_QUERY_SPEC_P = makeSymbol("KBQ-QUERY-SPEC-P");

    private static final SubLObject $$mcQuestionNthOption = reader_make_constant_shell(makeString("mcQuestionNthOption"));

    private static final SubLSymbol $sym70$SAFE__ = makeSymbol("SAFE-<");



    private static final SubLList $list72 = list(makeSymbol("PARAMETER"), makeSymbol("KB-VALUE"));



    private static final SubLSymbol $FORWARD_MAX_TIME = makeKeyword("FORWARD-MAX-TIME");



    private static final SubLObject $$TheEmptySet = reader_make_constant_shell(makeString("TheEmptySet"));





    private static final SubLSymbol $MAX_PROOF_DEPTH = makeKeyword("MAX-PROOF-DEPTH");

    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");





    private static final SubLObject $$TestQueryFn = reader_make_constant_shell(makeString("TestQueryFn"));



    private static final SubLObject $$UnrunnableQuery = reader_make_constant_shell(makeString("UnrunnableQuery"));

    private static final SubLObject $$QueryFn = reader_make_constant_shell(makeString("QueryFn"));

    public static final SubLList $list87 = list(makeSymbol("&OPTIONAL"), makeSymbol("SENTENCE"), makeSymbol("PARAMETERS"), makeSymbol("&REST"), makeSymbol("REST"));

    private static final SubLString $str88$___A_has_no_query_sentence_ = makeString("~%~A has no query sentence.");

    private static final SubLSymbol $NO_QUERY_SENTENCE = makeKeyword("NO-QUERY-SENTENCE");

    private static final SubLString $str90$___A_has_too_many_arguments_ = makeString("~%~A has too many arguments.");

    private static final SubLSymbol $TOO_MANY_ARGUMENTS = makeKeyword("TOO-MANY-ARGUMENTS");

    private static final SubLString $str92$ = makeString("");

    private static final SubLSymbol IST_SENTENCE_WITH_CHLMT_P = makeSymbol("IST-SENTENCE-WITH-CHLMT-P");

    private static final SubLString $str94$___A_has_more_than_one_query_sent = makeString("~%~A has more than one query sentence.");

    private static final SubLSymbol $MORE_THAN_ONE_QUERY_SENTENCE = makeKeyword("MORE-THAN-ONE-QUERY-SENTENCE");

    private static final SubLString $str96$___A_has_no_query_Mt_ = makeString("~%~A has no query Mt.");

    private static final SubLSymbol $NO_QUERY_MT = makeKeyword("NO-QUERY-MT");

    private static final SubLString $str98$___A_has_more_than_one_query_Mt_ = makeString("~%~A has more than one query Mt.");

    private static final SubLSymbol $MORE_THAN_ONE_QUERY_MT = makeKeyword("MORE-THAN-ONE-QUERY-MT");

    private static final SubLSymbol $kw100$TRANSFORMATION_ALLOWED_ = makeKeyword("TRANSFORMATION-ALLOWED?");



    private static final SubLSymbol $kw102$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");



    private static final SubLSymbol REMOVAL_ASK_QUERY_PROPERTY_P = makeSymbol("REMOVAL-ASK-QUERY-PROPERTY-P");

    private static final SubLList $list105 = list(makeSymbol("HL-MT"), makeSymbol("HL-SENTENCE"));

    private static final SubLSymbol REMOVAL_ASK_QUERY_METRIC_P = makeSymbol("REMOVAL-ASK-QUERY-METRIC-P");



    private static final SubLSymbol $TIME_TO_FIRST_ANSWER = makeKeyword("TIME-TO-FIRST-ANSWER");

    private static final SubLSymbol $TIME_TO_LAST_ANSWER = makeKeyword("TIME-TO-LAST-ANSWER");



    private static final SubLSymbol $COMPLETE_TOTAL_TIME = makeKeyword("COMPLETE-TOTAL-TIME");

    private static final SubLSymbol $TIME_PER_ANSWER = makeKeyword("TIME-PER-ANSWER");

    private static final SubLSymbol $LATENCY_IMPROVEMENT_FROM_ITERATIVITY = makeKeyword("LATENCY-IMPROVEMENT-FROM-ITERATIVITY");

    private static final SubLString $str114$time_to_implement_metric__S = makeString("time to implement metric ~S");

    private static final SubLSymbol $kw115$CACHE_INFERENCE_RESULTS_ = makeKeyword("CACHE-INFERENCE-RESULTS?");

    private static final SubLList $list116 = listS(reader_make_constant_shell(makeString("PredicateQueryFn")), list(reader_make_constant_shell(makeString("Kappa")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("ANYTHING"));

    private static final SubLList $list117 = list(makeSymbol("JANUS-OP"), makeSymbol("TYPE"), makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("QUERY-PROPERTIES"), makeSymbol("EXPECTED-RESULT"), makeSymbol("EXPECTED-HALT-REASON"), makeSymbol("TAG"));

    private static final SubLList $list118 = list(makeSymbol("&OPTIONAL"), makeSymbol("QUOTED-SENTENCE"), list(makeSymbol("CYCL-PARAMETERS"), reader_make_constant_shell(makeString("TheEmptySet"))));



    private static final SubLList $list120 = list(makeSymbol("KAPPA-PREDICATE"), makeSymbol("&OPTIONAL"), list(makeSymbol("CYCL-PARAMETERS"), reader_make_constant_shell(makeString("TheEmptySet"))));



    private static final SubLObject $$InferenceParameter = reader_make_constant_shell(makeString("InferenceParameter"));

    private static final SubLObject $$CycHLSupportModule = reader_make_constant_shell(makeString("CycHLSupportModule"));



    private static final SubLObject $$CycHLTruthValue = reader_make_constant_shell(makeString("CycHLTruthValue"));

    private static final SubLObject $$SecondsDuration = reader_make_constant_shell(makeString("SecondsDuration"));

    private static final SubLString $str127$Unit__A_can_t_be_converted_to_sec = makeString("Unit ~A can't be converted to seconds.");

    private static final SubLSymbol KBQ_PARSE_KB_INFERENCE_PARAMETER_VALUE = makeSymbol("KBQ-PARSE-KB-INFERENCE-PARAMETER-VALUE");













    private static final SubLList $list135 = list(list(list(reader_make_constant_shell(makeString("False")), makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?")), NIL), list(list(reader_make_constant_shell(makeString("True")), makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?")), T), list(list(makeKeyword("ALL"), makeKeyword("ALLOWED-RULES")), makeKeyword("ALL")), list(list(list(reader_make_constant_shell(makeString("SubLQuoteFn")), makeKeyword("ALL")), makeKeyword("ALLOWED-RULES")), makeKeyword("ALL")), list(list(list(reader_make_constant_shell(makeString("SubLQuoteFn")), makeKeyword("ALL")), makeKeyword("EQUALITY-REASONING-DOMAIN")), makeKeyword("ALL")), list(list(list(reader_make_constant_shell(makeString("TheList"))), makeKeyword("ALLOWED-RULES")), NIL), list(list(reader_make_constant_shell(makeString("TheEmptyList")), makeKeyword("ALLOWED-RULES")), NIL));

    public static SubLObject kbq_query_spec_p(final SubLObject v_object) {
        return makeBoolean((NIL != isa.isa_in_any_mtP(v_object, $$CycLQuerySpecification)) || (NIL != janus.janus_operation_p(v_object)));
    }

    public static SubLObject kbq_assert_query_spec_definition(final SubLObject query_spec, final SubLObject sentence, final SubLObject mt, final SubLObject v_inference_parameters, final SubLObject defining_mt, final SubLObject non_explanatory_sentence, final SubLObject multiple_choice_option_specs) {
        assert NIL != cycl_grammar.cycl_sentence_p(sentence) : "cycl_grammar.cycl_sentence_p(sentence) " + "CommonSymbols.NIL != cycl_grammar.cycl_sentence_p(sentence) " + sentence;
        if (((NIL != non_explanatory_sentence) && (!SubLSystemTrampolineFile.assertionsDisabledInClass)) && (NIL == cycl_grammar.cycl_sentence_p(non_explanatory_sentence))) {
            throw new AssertionError(non_explanatory_sentence);
        }
        assert NIL != hlmt.possibly_mt_p(mt) : "hlmt.possibly_mt_p(mt) " + "CommonSymbols.NIL != hlmt.possibly_mt_p(mt) " + mt;
        assert NIL != inference_datastructures_enumerated_types.query_properties_p(v_inference_parameters) : "inference_datastructures_enumerated_types.query_properties_p(v_inference_parameters) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.query_properties_p(v_inference_parameters) " + v_inference_parameters;
        assert NIL != hlmt.possibly_mt_p(defining_mt) : "hlmt.possibly_mt_p(defining_mt) " + "CommonSymbols.NIL != hlmt.possibly_mt_p(defining_mt) " + defining_mt;
        if (NIL != cb_kct_test.multiple_choice_option_specs_non_trivialP(multiple_choice_option_specs)) {
            ke.ke_assert_now(listS($$isa, query_spec, $list5), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
        } else {
            ke.ke_assert_now(listS($$isa, query_spec, $list6), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
        }
        kbq_assert_query_spec_sentence(query_spec, sentence, defining_mt);
        if (NIL != non_explanatory_sentence) {
            kbq_assert_query_spec_pragmatics(query_spec, non_explanatory_sentence, defining_mt);
        }
        kbq_assert_query_spec_mt(query_spec, mt, defining_mt);
        SubLObject remainder;
        SubLObject inference_parameter;
        SubLObject value;
        for (remainder = NIL, remainder = inference_parameters.remove_inference_engine_query_property_defaults(v_inference_parameters); NIL != remainder; remainder = cddr(remainder)) {
            inference_parameter = remainder.first();
            value = cadr(remainder);
            kbq_assert_query_spec_inference_parameter_value(query_spec, inference_parameter, value, defining_mt);
        }
        SubLObject cdolist_list_var = multiple_choice_option_specs;
        SubLObject mc_option_spec = NIL;
        mc_option_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            kbq_assert_multiple_choice_option_spec(query_spec, mc_option_spec, defining_mt);
            cdolist_list_var = cdolist_list_var.rest();
            mc_option_spec = cdolist_list_var.first();
        } 
        return query_spec;
    }

    public static SubLObject kbq_assert(final SubLObject sentence, final SubLObject mt, SubLObject transcriptP) {
        if (transcriptP == UNPROVIDED) {
            transcriptP = $transcript_kbq_definition_assertionsP$.getDynamicValue();
        }
        return NIL != transcriptP ? ke.ke_assert_now(sentence, mt, UNPROVIDED, UNPROVIDED) : cyc_kernel.cyc_assert(sentence, mt, UNPROVIDED);
    }

    public static SubLObject update_kbq_definition(final SubLObject query_spec, final SubLObject sentence, final SubLObject mt, SubLObject v_inference_parameters, SubLObject defining_mt, SubLObject non_explanatory_sentence, SubLObject multiple_choice_option_specs) {
        if (v_inference_parameters == UNPROVIDED) {
            v_inference_parameters = NIL;
        }
        if (defining_mt == UNPROVIDED) {
            defining_mt = $$TestVocabularyMt;
        }
        if (non_explanatory_sentence == UNPROVIDED) {
            non_explanatory_sentence = NIL;
        }
        if (multiple_choice_option_specs == UNPROVIDED) {
            multiple_choice_option_specs = NIL;
        }
        return kbq_ensure_query_spec_definition(query_spec, sentence, mt, v_inference_parameters, defining_mt, non_explanatory_sentence, multiple_choice_option_specs);
    }

    public static SubLObject update_kbq_definition_silent(final SubLObject query_spec, final SubLObject sentence, final SubLObject mt, SubLObject v_inference_parameters, SubLObject defining_mt, SubLObject non_explanatory_sentence, SubLObject multiple_choice_option_specs) {
        if (v_inference_parameters == UNPROVIDED) {
            v_inference_parameters = NIL;
        }
        if (defining_mt == UNPROVIDED) {
            defining_mt = $$TestVocabularyMt;
        }
        if (non_explanatory_sentence == UNPROVIDED) {
            non_explanatory_sentence = NIL;
        }
        if (multiple_choice_option_specs == UNPROVIDED) {
            multiple_choice_option_specs = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $transcript_kbq_definition_assertionsP$.currentBinding(thread);
        try {
            $transcript_kbq_definition_assertionsP$.bind(NIL, thread);
            return kbq_ensure_query_spec_definition(query_spec, sentence, mt, v_inference_parameters, defining_mt, non_explanatory_sentence, multiple_choice_option_specs);
        } finally {
            $transcript_kbq_definition_assertionsP$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject kbq_ensure_query_spec_definition(final SubLObject query_spec, final SubLObject sentence, final SubLObject mt, final SubLObject v_inference_parameters, final SubLObject defining_mt, final SubLObject non_explanatory_sentence, final SubLObject multiple_choice_option_specs) {
        assert NIL != cycl_grammar.cycl_sentence_p(sentence) : "cycl_grammar.cycl_sentence_p(sentence) " + "CommonSymbols.NIL != cycl_grammar.cycl_sentence_p(sentence) " + sentence;
        if (((NIL != non_explanatory_sentence) && (!SubLSystemTrampolineFile.assertionsDisabledInClass)) && (NIL == cycl_grammar.cycl_sentence_p(non_explanatory_sentence))) {
            throw new AssertionError(non_explanatory_sentence);
        }
        assert NIL != hlmt.possibly_mt_p(mt) : "hlmt.possibly_mt_p(mt) " + "CommonSymbols.NIL != hlmt.possibly_mt_p(mt) " + mt;
        assert NIL != inference_datastructures_enumerated_types.query_properties_p(v_inference_parameters) : "inference_datastructures_enumerated_types.query_properties_p(v_inference_parameters) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.query_properties_p(v_inference_parameters) " + v_inference_parameters;
        assert NIL != hlmt.possibly_mt_p(defining_mt) : "hlmt.possibly_mt_p(defining_mt) " + "CommonSymbols.NIL != hlmt.possibly_mt_p(defining_mt) " + defining_mt;
        if (NIL != cb_kct_test.multiple_choice_option_specs_non_trivialP(multiple_choice_option_specs)) {
            kbq_assert(listS($$isa, query_spec, $list5), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED);
        } else {
            kbq_assert(listS($$isa, query_spec, $list6), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED);
        }
        kbq_ensure_query_spec_sentence(query_spec, sentence, defining_mt);
        kbq_ensure_query_spec_pragmatics(query_spec, non_explanatory_sentence, defining_mt);
        kbq_ensure_query_spec_mt(query_spec, mt, defining_mt);
        SubLObject remainder;
        SubLObject inference_parameter;
        SubLObject value;
        for (remainder = NIL, remainder = v_inference_parameters; NIL != remainder; remainder = cddr(remainder)) {
            inference_parameter = remainder.first();
            value = cadr(remainder);
            kbq_ensure_query_spec_inference_parameter_value(query_spec, inference_parameter, value, defining_mt);
        }
        SubLObject cdolist_list_var = multiple_choice_option_specs;
        SubLObject mc_option_spec = NIL;
        mc_option_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            kbq_ensure_multiple_choice_option_spec(query_spec, mc_option_spec, defining_mt);
            cdolist_list_var = cdolist_list_var.rest();
            mc_option_spec = cdolist_list_var.first();
        } 
        return query_spec;
    }

    public static SubLObject kbq_current_query_spec_assertions_for_parameter(final SubLObject query_spec, final SubLObject parameter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertions = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if ($$InferenceSentenceParameter.eql(parameter)) {
                final SubLObject pred_var = $const14$sentenceParameterValueInSpecifica;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(query_spec, TWO_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(query_spec, TWO_INTEGER, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$1 = NIL;
                                final SubLObject token_var_$2 = NIL;
                                while (NIL == done_var_$1) {
                                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                    final SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(gaf));
                                    if (NIL != valid_$3) {
                                        assertions = cons(gaf, assertions);
                                    }
                                    done_var_$1 = makeBoolean(NIL == valid_$3);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            } else
                if ($$InferenceMicrotheoryParameter.eql(parameter)) {
                    final SubLObject pred_var = $const18$microtheoryParameterValueInSpecif;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(query_spec, TWO_INTEGER, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(query_spec, TWO_INTEGER, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$2 = NIL;
                                    final SubLObject token_var_$3 = NIL;
                                    while (NIL == done_var_$2) {
                                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                        final SubLObject valid_$4 = makeBoolean(!token_var_$3.eql(gaf));
                                        if (NIL != valid_$4) {
                                            assertions = cons(gaf, assertions);
                                        }
                                        done_var_$2 = makeBoolean(NIL == valid_$4);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else
                    if ($$InferenceModeParameter.eql(parameter)) {
                        final SubLObject pred_var = $const20$inferenceModeParameterValueInSpec;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(query_spec, TWO_INTEGER, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(query_spec, TWO_INTEGER, pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                        SubLObject done_var_$3 = NIL;
                                        final SubLObject token_var_$4 = NIL;
                                        while (NIL == done_var_$3) {
                                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                            final SubLObject valid_$5 = makeBoolean(!token_var_$4.eql(gaf));
                                            if (NIL != valid_$5) {
                                                assertions = cons(gaf, assertions);
                                            }
                                            done_var_$3 = makeBoolean(NIL == valid_$5);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values3 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values3);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }
                    } else {
                        final SubLObject pred_var = $const21$softwareParameterValueInSpecifica;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(query_spec, THREE_INTEGER, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(query_spec, THREE_INTEGER, pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                        SubLObject done_var_$4 = NIL;
                                        final SubLObject token_var_$5 = NIL;
                                        while (NIL == done_var_$4) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                            final SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(assertion));
                                            if ((NIL != valid_$6) && assertions_high.gaf_arg1(assertion).eql(parameter)) {
                                                assertions = cons(assertion, assertions);
                                            }
                                            done_var_$4 = makeBoolean(NIL == valid_$6);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values4 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values4);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }
                    }


        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return assertions;
    }

    public static SubLObject kbq_ensure_query_spec_sentence(final SubLObject query_spec, final SubLObject sentence, final SubLObject defining_mt) {
        SubLObject cdolist_list_var;
        final SubLObject current_sentence_assertions = cdolist_list_var = kbq_current_query_spec_assertions_for_parameter(query_spec, $$InferenceSentenceParameter);
        SubLObject sentence_assertion = NIL;
        sentence_assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((!assertions_high.assertion_mt(sentence_assertion).eql(defining_mt)) || (!assertions_high.gaf_arg2(sentence_assertion).equal(sentence))) {
                ke.ke_unassert_assertion_now(sentence_assertion);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence_assertion = cdolist_list_var.first();
        } 
        if (NIL == inference_trivial.new_cyc_trivial_query(list($$ist_Asserted, defining_mt, kbq_assertible_query_spec_sentence(sentence, query_spec)), $$BaseKB, UNPROVIDED)) {
            kbq_assert_query_spec_sentence(query_spec, sentence, defining_mt);
        }
        return NIL;
    }

    public static SubLObject kbq_assert_query_spec_sentence(final SubLObject query_spec, final SubLObject sentence, final SubLObject defining_mt) {
        return kbq_assert(kbq_assertible_query_spec_sentence(sentence, query_spec), defining_mt, UNPROVIDED);
    }

    public static SubLObject kbq_assertible_query_spec_sentence(final SubLObject sentence, final SubLObject query_spec) {
        return list($const14$sentenceParameterValueInSpecifica, list($$Quote, sentence), query_spec);
    }

    public static SubLObject kbq_askable_query_spec_sentence(final SubLObject sentence_var, final SubLObject query_spec, SubLObject hlP) {
        if (hlP == UNPROVIDED) {
            hlP = NIL;
        }
        SubLObject sentence_arg = NIL;
        if (NIL != hlP) {
            sentence_arg = list($$Quote, sentence_var);
        } else {
            sentence_arg = list($$Quote, list($$EscapeQuote, sentence_var));
        }
        return list($const14$sentenceParameterValueInSpecifica, sentence_arg, query_spec);
    }

    public static SubLObject kbq_ensure_query_spec_mt(final SubLObject query_spec, final SubLObject mt, final SubLObject defining_mt) {
        final SubLObject current_mt_assertions = kbq_current_query_spec_assertions_for_parameter(query_spec, $$InferenceMicrotheoryParameter);
        SubLObject already_known = NIL;
        SubLObject cdolist_list_var = current_mt_assertions;
        SubLObject mt_assertion = NIL;
        mt_assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (assertions_high.assertion_mt(mt_assertion).eql(defining_mt) && assertions_high.gaf_arg2(mt_assertion).equal(mt)) {
                already_known = T;
            } else {
                ke.ke_unassert_assertion_now(mt_assertion);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mt_assertion = cdolist_list_var.first();
        } 
        if (NIL == already_known) {
            kbq_assert_query_spec_mt(query_spec, mt, defining_mt);
        }
        return NIL;
    }

    public static SubLObject kbq_assert_query_spec_mt(final SubLObject query_spec, final SubLObject mt, final SubLObject defining_mt) {
        return kbq_assert(list($const18$microtheoryParameterValueInSpecif, mt, query_spec), defining_mt, UNPROVIDED);
    }

    public static SubLObject kbq_ensure_query_spec_inference_parameter_value(final SubLObject query_spec, final SubLObject query_property, final SubLObject value, final SubLObject defining_mt) {
        final SubLObject inference_parameter_constant = kbq_inference_parameter_from_keyword(query_property);
        final SubLObject current_query_property_assertions = kbq_current_query_spec_assertions_for_parameter(query_spec, inference_parameter_constant);
        SubLObject already_knownP = NIL;
        final SubLObject kb_value = kbq_encode_kb_inference_parameter_value(value, query_property);
        SubLObject cdolist_list_var = current_query_property_assertions;
        SubLObject qp_assertion = NIL;
        qp_assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (assertions_high.assertion_mt(qp_assertion).eql(defining_mt) && assertions_high.gaf_arg2(qp_assertion).equal(kb_value)) {
                already_knownP = T;
            } else {
                ke.ke_unassert_assertion_now(qp_assertion);
            }
            cdolist_list_var = cdolist_list_var.rest();
            qp_assertion = cdolist_list_var.first();
        } 
        if (NIL == already_knownP) {
            kbq_assert_query_spec_inference_parameter_value(query_spec, query_property, value, defining_mt);
        }
        return NIL;
    }

    public static SubLObject kbq_assert_query_spec_inference_parameter_value(final SubLObject query_spec, final SubLObject query_property, final SubLObject value, final SubLObject defining_mt) {
        final SubLObject inference_parameter_constant = kbq_inference_parameter_from_keyword(query_property);
        final SubLObject kb_value = kbq_encode_kb_inference_parameter_value(value, query_property);
        if (NIL != forts.fort_p(inference_parameter_constant)) {
            return kbq_assert_query_spec_inference_parameter_value_int(query_spec, inference_parameter_constant, kb_value, defining_mt);
        }
        Errors.warn($str26$Inference_Parameter__S_unknown_by, query_property);
        return NIL;
    }

    public static SubLObject kbq_assert_query_spec_inference_parameter_value_int(final SubLObject query_spec, final SubLObject inference_parameter_constant, final SubLObject value, final SubLObject defining_mt) {
        if ($$InferenceModeParameter.eql(inference_parameter_constant)) {
            return kbq_assert(list($const20$inferenceModeParameterValueInSpec, value, query_spec), defining_mt, UNPROVIDED);
        }
        if ($$InferenceAllowedRulesParameter.eql(inference_parameter_constant) && value.isList()) {
            SubLObject cdolist_list_var = value;
            SubLObject value_ass = NIL;
            value_ass = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                kbq_assert(list($$queryPracticeRules, query_spec, value_ass), defining_mt, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                value_ass = cdolist_list_var.first();
            } 
            return NIL;
        }
        return kbq_assert(list($const21$softwareParameterValueInSpecifica, inference_parameter_constant, value, query_spec), defining_mt, UNPROVIDED);
    }

    public static SubLObject kbq_ensure_query_spec_pragmatics(final SubLObject query_spec, final SubLObject non_explanatory_sentence, final SubLObject defining_mt) {
        return kbq_ensure_query_spec_inference_parameter_value(query_spec, $NON_EXPLANATORY_SENTENCE, list($$Quote, non_explanatory_sentence), defining_mt);
    }

    public static SubLObject kbq_assert_query_spec_pragmatics(final SubLObject query_spec, final SubLObject non_explanatory_sentence, final SubLObject defining_mt) {
        return kbq_assert_query_spec_inference_parameter_value(query_spec, $NON_EXPLANATORY_SENTENCE, list($$Quote, non_explanatory_sentence), defining_mt);
    }

    public static SubLObject kbq_ensure_multiple_choice_option_spec(final SubLObject query_spec, final SubLObject mc_option_spec, final SubLObject defining_mt) {
        if (NIL == list_utilities.member_equalP(mc_option_spec, kbq_multiple_choice_option_specs(query_spec))) {
            SubLObject option_num = NIL;
            SubLObject full_label = NIL;
            SubLObject index_label = NIL;
            SubLObject payload = NIL;
            destructuring_bind_must_consp(mc_option_spec, mc_option_spec, $list30);
            option_num = mc_option_spec.first();
            SubLObject current = mc_option_spec.rest();
            destructuring_bind_must_consp(current, mc_option_spec, $list30);
            full_label = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, mc_option_spec, $list30);
            index_label = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, mc_option_spec, $list30);
            payload = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != payload) {
                    assert NIL != integerp(option_num) : "Types.integerp(option_num) " + "CommonSymbols.NIL != Types.integerp(option_num) " + option_num;
                    assert NIL != stringp(full_label) : "Types.stringp(full_label) " + "CommonSymbols.NIL != Types.stringp(full_label) " + full_label;
                    assert NIL != stringp(index_label) : "Types.stringp(index_label) " + "CommonSymbols.NIL != Types.stringp(index_label) " + index_label;
                    assert NIL != bindings.kb_set_of_binding_sets_p(payload) : "bindings.kb_set_of_binding_sets_p(payload) " + "CommonSymbols.NIL != bindings.kb_set_of_binding_sets_p(payload) " + payload;
                    final SubLObject existing_option = narts_high.find_nart(list($$MCQuestionNthOptionFn, query_spec, option_num));
                    if (NIL != existing_option) {
                        ke.ke_kill_now(existing_option);
                    }
                    if (NIL == string_utilities.empty_string_p(full_label)) {
                        kbq_assert(list($$multipleChoiceOptionFullLabel, list($$MCQuestionNthOptionFn, query_spec, option_num), full_label), defining_mt, UNPROVIDED);
                    }
                    if (NIL == string_utilities.empty_string_p(index_label)) {
                        kbq_assert(list($$multipleChoiceOptionIndexLabel, list($$MCQuestionNthOptionFn, query_spec, option_num), index_label), defining_mt, UNPROVIDED);
                    }
                    kbq_assert(list($$multipleChoiceOptionPayload, list($$MCQuestionNthOptionFn, query_spec, option_num), payload), defining_mt, UNPROVIDED);
                }
            } else {
                cdestructuring_bind_error(mc_option_spec, $list30);
            }
        }
        return NIL;
    }

    public static SubLObject kbq_assert_multiple_choice_option_spec(final SubLObject query_spec, final SubLObject mc_option_spec, final SubLObject defining_mt) {
        SubLObject option_num = NIL;
        SubLObject full_label = NIL;
        SubLObject index_label = NIL;
        SubLObject payload = NIL;
        destructuring_bind_must_consp(mc_option_spec, mc_option_spec, $list30);
        option_num = mc_option_spec.first();
        SubLObject current = mc_option_spec.rest();
        destructuring_bind_must_consp(current, mc_option_spec, $list30);
        full_label = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, mc_option_spec, $list30);
        index_label = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, mc_option_spec, $list30);
        payload = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != payload) {
                assert NIL != integerp(option_num) : "Types.integerp(option_num) " + "CommonSymbols.NIL != Types.integerp(option_num) " + option_num;
                assert NIL != stringp(full_label) : "Types.stringp(full_label) " + "CommonSymbols.NIL != Types.stringp(full_label) " + full_label;
                assert NIL != stringp(index_label) : "Types.stringp(index_label) " + "CommonSymbols.NIL != Types.stringp(index_label) " + index_label;
                assert NIL != bindings.kb_set_of_binding_sets_p(payload) : "bindings.kb_set_of_binding_sets_p(payload) " + "CommonSymbols.NIL != bindings.kb_set_of_binding_sets_p(payload) " + payload;
                if (NIL == string_utilities.empty_string_p(full_label)) {
                    kbq_assert(list($$multipleChoiceOptionFullLabel, list($$MCQuestionNthOptionFn, query_spec, option_num), full_label), defining_mt, UNPROVIDED);
                }
                if (NIL == string_utilities.empty_string_p(index_label)) {
                    kbq_assert(list($$multipleChoiceOptionIndexLabel, list($$MCQuestionNthOptionFn, query_spec, option_num), index_label), defining_mt, UNPROVIDED);
                }
                kbq_assert(list($$multipleChoiceOptionPayload, list($$MCQuestionNthOptionFn, query_spec, option_num), payload), defining_mt, UNPROVIDED);
            }
        } else {
            cdestructuring_bind_error(mc_option_spec, $list30);
        }
        return NIL;
    }

    public static SubLObject kbq_ensure_query_spec_comments(final SubLObject query_spec, final SubLObject comments, final SubLObject defining_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current_comment_assertions = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject pred_var = $$comment;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(query_spec, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(query_spec, ONE_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$17 = NIL;
                            final SubLObject token_var_$18 = NIL;
                            while (NIL == done_var_$17) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$18);
                                final SubLObject valid_$19 = makeBoolean(!token_var_$18.eql(assertion));
                                if (NIL != valid_$19) {
                                    current_comment_assertions = cons(assertion, current_comment_assertions);
                                }
                                done_var_$17 = makeBoolean(NIL == valid_$19);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = current_comment_assertions;
        SubLObject assertion2 = NIL;
        assertion2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject current_comment = assertions_high.gaf_arg2(assertion2);
            final SubLObject current_mt = assertions_high.assertion_mt(assertion2);
            if ((!current_mt.eql(defining_mt)) || (NIL == member(current_comment, comments, symbol_function(EQUAL), UNPROVIDED))) {
                ke.ke_unassert_assertion_now(assertion2);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion2 = cdolist_list_var.first();
        } 
        SubLObject cdolist_list_var2 = comments;
        SubLObject comment = NIL;
        comment = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (NIL == kb_mapping_utilities.tuple_holds_in_mt(listS($$comment, query_spec, $list39), defining_mt, UNPROVIDED, UNPROVIDED)) {
                kbq_assert_query_spec_comment(query_spec, comment, defining_mt);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            comment = cdolist_list_var2.first();
        } 
        return query_spec;
    }

    public static SubLObject kbq_assert_query_spec_comment(final SubLObject query_spec, final SubLObject comment, final SubLObject defining_mt) {
        return kbq_assert(list($$comment, query_spec, comment), defining_mt, UNPROVIDED);
    }

    public static SubLObject kbq_assert_template_definition(final SubLObject query_spec, SubLObject template, final SubLObject glosses, final SubLObject folder_mt_pairs, final SubLObject defining_mt) {
        final SubLObject current_template = kbq_template(query_spec);
        if (((NIL != current_template) && (NIL != template)) && (!current_template.eql(template))) {
            Errors.error($str40$The_template___A__passed_for_the_, template, query_spec, current_template);
        }
        if (NIL != current_template) {
            template = current_template;
        }
        if (NIL == template) {
            template = make_el_formula($$TemplateFromTestQueryFn, list(query_spec), UNPROVIDED);
        }
        SubLObject cdolist_list_var = glosses;
        SubLObject gloss = NIL;
        gloss = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            kbq_assert_template_gloss(template, gloss, defining_mt);
            cdolist_list_var = cdolist_list_var.rest();
            gloss = cdolist_list_var.first();
        } 
        cdolist_list_var = folder_mt_pairs;
        SubLObject folder_mt_pair = NIL;
        folder_mt_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = folder_mt_pair;
            SubLObject folder = NIL;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list42);
            folder = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list42);
            mt = current.first();
            current = current.rest();
            if (NIL == current) {
                kbq_assert_template_folder(template, folder, mt);
            } else {
                cdestructuring_bind_error(datum, $list42);
            }
            cdolist_list_var = cdolist_list_var.rest();
            folder_mt_pair = cdolist_list_var.first();
        } 
        return template;
    }

    public static SubLObject kbq_ensure_template_definition(final SubLObject query_spec, SubLObject template, final SubLObject glosses, final SubLObject folder_mt_pairs, final SubLObject defining_mt) {
        final SubLObject current_template = kbq_template(query_spec);
        if (((NIL != current_template) && (NIL != template)) && (!current_template.eql(template))) {
            Errors.error($str40$The_template___A__passed_for_the_, template, query_spec, current_template);
        }
        if (NIL != current_template) {
            template = current_template;
        }
        if (NIL == template) {
            template = make_el_formula($$TemplateFromTestQueryFn, list(query_spec), UNPROVIDED);
        }
        kbq_ensure_template_glosses(template, glosses, defining_mt);
        kbq_ensure_template_folders(template, folder_mt_pairs);
        return template;
    }

    public static SubLObject kbq_ensure_template_glosses(final SubLObject template, final SubLObject glosses, final SubLObject defining_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current_gloss_assertions = NIL;
        if (NIL != forts.fort_p(template)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                final SubLObject pred_var = $$formulaTemplateGloss;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(template, ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(template, ONE_INTEGER, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$21 = NIL;
                                final SubLObject token_var_$22 = NIL;
                                while (NIL == done_var_$21) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$22);
                                    final SubLObject valid_$23 = makeBoolean(!token_var_$22.eql(assertion));
                                    if (NIL != valid_$23) {
                                        current_gloss_assertions = cons(assertion, current_gloss_assertions);
                                    }
                                    done_var_$21 = makeBoolean(NIL == valid_$23);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        SubLObject cdolist_list_var = current_gloss_assertions;
        SubLObject assertion2 = NIL;
        assertion2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject current_gloss = assertions_high.gaf_arg2(assertion2);
            final SubLObject current_mt = assertions_high.assertion_mt(assertion2);
            if ((!current_mt.eql(defining_mt)) || (NIL == member(current_gloss, glosses, symbol_function(EQUAL), UNPROVIDED))) {
                ke.ke_unassert_assertion_now(assertion2);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion2 = cdolist_list_var.first();
        } 
        SubLObject cdolist_list_var2 = glosses;
        SubLObject gloss = NIL;
        gloss = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (NIL == kb_mapping_utilities.tuple_holds_in_mt(list($$formulaTemplateGloss, template, gloss), defining_mt, UNPROVIDED, UNPROVIDED)) {
                kbq_assert_template_gloss(template, gloss, defining_mt);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            gloss = cdolist_list_var2.first();
        } 
        return template;
    }

    public static SubLObject kbq_assert_template_gloss(final SubLObject template, final SubLObject gloss, final SubLObject defining_mt) {
        return kbq_assert(list($$formulaTemplateGloss, template, gloss), defining_mt, UNPROVIDED);
    }

    public static SubLObject kbq_ensure_template_folders(final SubLObject template, final SubLObject folder_mt_pairs) {
        SubLObject cdolist_list_var;
        final SubLObject current_folder_mt_pairs = cdolist_list_var = (NIL != forts.fort_p(template)) ? template_folders(template) : NIL;
        SubLObject current_folder_mt_pair = NIL;
        current_folder_mt_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == subl_promotions.memberP(current_folder_mt_pair, folder_mt_pairs, symbol_function(EQUAL), UNPROVIDED)) {
                SubLObject current;
                final SubLObject datum = current = current_folder_mt_pair;
                SubLObject folder = NIL;
                SubLObject mt = NIL;
                destructuring_bind_must_consp(current, datum, $list42);
                folder = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list42);
                mt = current.first();
                current = current.rest();
                if (NIL == current) {
                    ke.ke_unassert_now(list($$folderContainsResource, folder, template), mt);
                } else {
                    cdestructuring_bind_error(datum, $list42);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            current_folder_mt_pair = cdolist_list_var.first();
        } 
        cdolist_list_var = folder_mt_pairs;
        SubLObject folder_mt_pair = NIL;
        folder_mt_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == subl_promotions.memberP(folder_mt_pair, current_folder_mt_pairs, symbol_function(EQUAL), UNPROVIDED)) {
                SubLObject current;
                final SubLObject datum = current = folder_mt_pair;
                SubLObject folder = NIL;
                SubLObject mt = NIL;
                destructuring_bind_must_consp(current, datum, $list42);
                folder = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list42);
                mt = current.first();
                current = current.rest();
                if (NIL == current) {
                    kbq_assert_template_folder(template, folder, mt);
                } else {
                    cdestructuring_bind_error(datum, $list42);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            folder_mt_pair = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject kbq_assert_template_folder(final SubLObject template, final SubLObject folder, final SubLObject mt) {
        return kbq_assert(list($$folderContainsResource, folder, template), mt, UNPROVIDED);
    }

    public static SubLObject kbq_sentences(final SubLObject query_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject success = formula_pattern_match.formula_matches_pattern(query_spec, $list45);
        SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            final SubLObject quoted_sentence = list_utilities.alist_lookup_without_values(v_bindings, QUOTED_SENTENCE, UNPROVIDED, UNPROVIDED);
            return list(czer_main.unquote_quoted_term(quoted_sentence, UNPROVIDED));
        }
        thread.resetMultipleValues();
        success = formula_pattern_match.formula_matches_pattern(query_spec, $list47);
        v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            final SubLObject el_substitutions = list_utilities.alist_lookup_without_values(v_bindings, EL_SUBSTITUTIONS, UNPROVIDED, UNPROVIDED);
            final SubLObject question_template = list_utilities.alist_lookup_without_values(v_bindings, QUESTION_TEMPLATE, UNPROVIDED, UNPROVIDED);
            return query_from_template_sentences(question_template, el_substitutions);
        }
        final SubLObject sentences = union(kb_mapping_utilities.pred_values_in_any_mt(query_spec, $const14$sentenceParameterValueInSpecifica, TWO_INTEGER, ONE_INTEGER, $TRUE), kb_mapping_utilities.pred_arg_values_in_any_mt(query_spec, $const21$softwareParameterValueInSpecifica, $$InferenceSentenceParameter, THREE_INTEGER, ONE_INTEGER, TWO_INTEGER, $TRUE), symbol_function(EQUAL), UNPROVIDED);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = sentences;
        SubLObject sentence = NIL;
        sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(czer_main.unquote_quoted_term(sentence, UNPROVIDED), result);
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject kbq_sentence(final SubLObject query_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(query_spec, $list45);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            final SubLObject quoted_sentence = list_utilities.alist_lookup_without_values(v_bindings, QUOTED_SENTENCE, UNPROVIDED, UNPROVIDED);
            return czer_main.unquote_quoted_term(quoted_sentence, UNPROVIDED);
        }
        final SubLObject sentences = kbq_sentences(query_spec);
        if (NIL != list_utilities.singletonP(sentences)) {
            return sentences.first();
        }
        if (NIL == sentences) {
            Errors.error($str50$The_query_specification___A__has_, query_spec);
        } else {
            Errors.error($str51$The_query_specification___A__has_, query_spec);
        }
        return NIL;
    }

    public static SubLObject query_from_template_sentences(final SubLObject question_template, final SubLObject el_substitutions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentences = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cycl_pattern = NIL;
            final SubLObject pred_var = $$cycLPattern;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(question_template, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(question_template, ONE_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$25 = NIL;
                            final SubLObject token_var_$26 = NIL;
                            while (NIL == done_var_$25) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$26);
                                final SubLObject valid_$27 = makeBoolean(!token_var_$26.eql(assertion));
                                if (NIL != valid_$27) {
                                    cycl_pattern = assertions_high.gaf_arg(assertion, TWO_INTEGER);
                                    final SubLObject sentence_pattern = czer_main.unquote_quoted_term(cycl_pattern, UNPROVIDED);
                                    final SubLObject item_var = perform_query_from_template_substitutions(sentence_pattern, el_substitutions);
                                    if (NIL == member(item_var, sentences, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                        sentences = cons(item_var, sentences);
                                    }
                                }
                                done_var_$25 = makeBoolean(NIL == valid_$27);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
            final SubLObject meta_template = kb_mapping_utilities.fpred_value_in_any_mt(question_template, $$metaTemplate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != meta_template) {
                final SubLObject items_var = query_from_template_sentences(meta_template, el_substitutions);
                if (items_var.isVector()) {
                    final SubLObject vector_var = items_var;
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject element_num;
                    SubLObject item_var2;
                    SubLObject item;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        item = item_var2 = aref(vector_var, element_num);
                        if (NIL == member(item_var2, sentences, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            sentences = cons(item_var2, sentences);
                        }
                    }
                } else {
                    SubLObject cdolist_list_var = items_var;
                    SubLObject item2 = NIL;
                    item2 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject item_var3 = item2;
                        if (NIL == member(item_var3, sentences, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            sentences = cons(item_var3, sentences);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        item2 = cdolist_list_var.first();
                    } 
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return sentences;
    }

    public static SubLObject perform_query_from_template_substitutions(final SubLObject expression_template, final SubLObject el_substitutions) {
        SubLObject substitutions_alist = NIL;
        SubLObject cdolist_list_var = el_set_items(el_substitutions);
        SubLObject el_substitution = NIL;
        el_substitution = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = el_list_items(el_substitution);
            SubLObject template_term = NIL;
            SubLObject actual_term = NIL;
            destructuring_bind_must_consp(current, datum, $list54);
            template_term = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list54);
            actual_term = current.first();
            current = current.rest();
            if (NIL == current) {
                substitutions_alist = list_utilities.alist_enter(substitutions_alist, template_term, actual_term, UNPROVIDED);
            } else {
                cdestructuring_bind_error(datum, $list54);
            }
            cdolist_list_var = cdolist_list_var.rest();
            el_substitution = cdolist_list_var.first();
        } 
        return NIL != expression_template ? cycl_utilities.expression_sublis(substitutions_alist, expression_template, symbol_function(EQUAL), UNPROVIDED) : NIL;
    }

    public static SubLObject query_from_template_mts(final SubLObject question_template, final SubLObject el_substitutions) {
        if (NIL != isa.isa_in_any_mtP(question_template, $const55$QuestionSuggestionTemplate_Single)) {
            final SubLObject instantiation = kb_mapping_utilities.fpred_value_in_any_mt(question_template, $$questionTemplateInstantiations, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL != instantiation ? kbq_mts(instantiation) : NIL;
        }
        final SubLObject meta_template = kb_mapping_utilities.fpred_value_in_any_mt(question_template, $$metaTemplate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject mts = (NIL != meta_template) ? kbq_mts(meta_template) : NIL;
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = mts;
        SubLObject mt = NIL;
        mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ans = cons(perform_query_from_template_substitutions(mt, el_substitutions), ans);
            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
        } 
        return ans;
    }

    public static SubLObject query_from_template_inference_params(final SubLObject question_template, final SubLObject el_substitutions) {
        if (NIL != isa.isa_in_any_mtP(question_template, $const55$QuestionSuggestionTemplate_Single)) {
            final SubLObject instantiation = kb_mapping_utilities.fpred_value_in_any_mt(question_template, $$questionTemplateInstantiations, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL != instantiation ? kbq_inference_params(instantiation) : NIL;
        }
        final SubLObject meta_template = kb_mapping_utilities.fpred_value_in_any_mt(question_template, $$metaTemplate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject inference_params = (NIL != meta_template) ? kbq_inference_params(meta_template) : NIL;
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = inference_params;
        SubLObject param = NIL;
        param = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ans = cons(perform_query_from_template_substitutions(param, el_substitutions), ans);
            cdolist_list_var = cdolist_list_var.rest();
            param = cdolist_list_var.first();
        } 
        return ans;
    }

    public static SubLObject kbq_sentence_closedP(final SubLObject query_spec) {
        return closedP(kbq_sentence(query_spec), UNPROVIDED);
    }

    public static SubLObject kbq_sentence_openP(final SubLObject query_spec) {
        return makeBoolean(NIL == kbq_sentence_closedP(query_spec));
    }

    public static SubLObject kbq_pragmatics(final SubLObject query_spec) {
        if (NIL == indexed_term_p(query_spec)) {
            return NIL;
        }
        final SubLObject kb_value = czer_main.unquote_quoted_term(kb_mapping_utilities.pred_arg_values_in_any_mt(query_spec, $const21$softwareParameterValueInSpecifica, $const57$InferenceNonExplanatorySentencePa, THREE_INTEGER, ONE_INTEGER, TWO_INTEGER, UNPROVIDED).first(), UNPROVIDED);
        return kbq_parse_kb_inference_parameter_value(kb_value, $NON_EXPLANATORY_SENTENCE);
    }

    public static SubLObject kbq_mts(final SubLObject query_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(query_spec, $list47);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            final SubLObject el_substitutions = list_utilities.alist_lookup_without_values(v_bindings, EL_SUBSTITUTIONS, UNPROVIDED, UNPROVIDED);
            final SubLObject question_template = list_utilities.alist_lookup_without_values(v_bindings, QUESTION_TEMPLATE, UNPROVIDED, UNPROVIDED);
            return query_from_template_mts(question_template, el_substitutions);
        }
        return kb_mapping_utilities.pred_values_in_any_mt(query_spec, $const18$microtheoryParameterValueInSpecif, TWO_INTEGER, ONE_INTEGER, $TRUE);
    }

    public static SubLObject kbq_mt(final SubLObject query_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(query_spec, $list58);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            final SubLObject mt = list_utilities.alist_lookup_without_values(v_bindings, MT, UNPROVIDED, UNPROVIDED);
            return mt;
        }
        final SubLObject mts = kbq_mts(query_spec);
        final SubLObject sentence = kbq_sentence(query_spec);
        if (NIL != ist_sentence_with_chlmt_p(sentence)) {
            return NIL;
        }
        if (NIL == mts) {
            return $$InferencePSC;
        }
        if (NIL != list_utilities.singletonP(mts)) {
            return czer_main.canonicalize_term(mts.first(), UNPROVIDED);
        }
        Errors.error($str61$The_query_specification___A__has_, query_spec);
        return NIL;
    }

    public static SubLObject kbq_canonical_mt(final SubLObject query_spec) {
        final SubLObject mt = kbq_mt(query_spec);
        if (NIL != mt) {
            return hlmt_czer.canonicalize_hlmt(mt);
        }
        return NIL;
    }

    public static SubLObject kbq_comments(final SubLObject query_spec) {
        final SubLObject comments = kb_mapping_utilities.pred_values_in_any_mt(query_spec, $$comment, ONE_INTEGER, TWO_INTEGER, $TRUE);
        return comments;
    }

    public static SubLObject kbq_template_glosses(final SubLObject query_template) {
        final SubLObject glosses = kb_mapping_utilities.pred_values_in_any_mt(query_template, $$formulaTemplateGloss, ONE_INTEGER, TWO_INTEGER, $TRUE);
        return glosses;
    }

    public static SubLObject kbq_template(final SubLObject query_spec) {
        final SubLObject template = kb_mapping_utilities.fpred_value_in_any_mt(query_spec, $const62$querySpecificationForFormulaTempl, TWO_INTEGER, ONE_INTEGER, $TRUE);
        return template;
    }

    public static SubLObject template_folders(final SubLObject template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject pred_var = $$folderContainsResource;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(template, TWO_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(template, TWO_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$29 = NIL;
                            final SubLObject token_var_$30 = NIL;
                            while (NIL == done_var_$29) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$30);
                                final SubLObject valid_$31 = makeBoolean(!token_var_$30.eql(assertion));
                                if (NIL != valid_$31) {
                                    final SubLObject folder = assertions_high.gaf_arg1(assertion);
                                    final SubLObject mt = assertions_high.assertion_mt(assertion);
                                    result = cons(list(folder, mt), result);
                                }
                                done_var_$29 = makeBoolean(NIL == valid_$31);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$32 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return nreverse(result);
    }

    public static SubLObject kbq_query_properties(SubLObject query_spec) {
        query_spec = czer_main.canonicalize_term(query_spec, UNPROVIDED);
        final SubLObject inf_tuples = kbq_inference_params(query_spec);
        SubLObject query_properties = kb_inference_params_to_query_properties(inf_tuples);
        if (NIL != inference_proof_spec.use_kbq_proof_spec_tableP()) {
            query_properties = list_utilities.merge_plist(query_properties, inference_proof_spec.overriding_experimental_proof_spec_properties(query_spec));
        }
        if (NIL != use_kbq_practice_rulesP()) {
            query_properties = list_utilities.merge_plist(query_properties, overriding_query_practice_rules_properties(query_spec));
        }
        return query_properties;
    }

    public static SubLObject use_kbq_practice_rulesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $use_kbq_practice_rulesP$.getDynamicValue(thread);
    }

    public static SubLObject overriding_query_practice_rules_properties(final SubLObject query_spec) {
        final SubLObject practice_rules = cb_kb_query.kbq_query_practice_rules(query_spec);
        final SubLObject overriding_properties = (NIL != practice_rules) ? list($ALLOWED_RULES, practice_rules) : NIL;
        return overriding_properties;
    }

    public static SubLObject kbq_query_property_value_from_keyword(final SubLObject query_spec, final SubLObject query_property) {
        assert NIL != inference_datastructures_enumerated_types.query_property_p(query_property) : "inference_datastructures_enumerated_types.query_property_p(query_property) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.query_property_p(query_property) " + query_property;
        final SubLObject query_properties = kbq_query_properties(query_spec);
        return inference_strategist.query_property_value(query_properties, query_property);
    }

    public static SubLObject kbq_allowed_rules(final SubLObject query_spec) {
        return inference_strategist.query_property_value(kbq_query_properties(query_spec), $ALLOWED_RULES);
    }

    public static SubLObject kbq_default_defining_mt() {
        return $$TestVocabularyMt;
    }

    public static SubLObject kbq_defining_mt(final SubLObject query_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject candidates = NIL;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject pred_var = $const14$sentenceParameterValueInSpecifica;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(query_spec, TWO_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(query_spec, TWO_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$33 = NIL;
                            final SubLObject token_var_$34 = NIL;
                            while (NIL == done_var_$33) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$34);
                                final SubLObject valid_$35 = makeBoolean(!token_var_$34.eql(gaf));
                                if (NIL != valid_$35) {
                                    final SubLObject mt = assertions_high.assertion_mt(gaf);
                                    final SubLObject item_var;
                                    final SubLObject monad = item_var = hlmt.hlmt_monad_mt(mt);
                                    if (NIL == member(item_var, candidates, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        candidates = cons(item_var, candidates);
                                    }
                                }
                                done_var_$33 = makeBoolean(NIL == valid_$35);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$36 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
            pred_var = $const18$microtheoryParameterValueInSpecif;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(query_spec, TWO_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(query_spec, TWO_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$34 = NIL;
                            final SubLObject token_var_$35 = NIL;
                            while (NIL == done_var_$34) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$35);
                                final SubLObject valid_$36 = makeBoolean(!token_var_$35.eql(gaf));
                                if (NIL != valid_$36) {
                                    final SubLObject mt = assertions_high.assertion_mt(gaf);
                                    final SubLObject item_var;
                                    final SubLObject monad = item_var = hlmt.hlmt_monad_mt(mt);
                                    if (NIL == member(item_var, candidates, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        candidates = cons(item_var, candidates);
                                    }
                                }
                                done_var_$34 = makeBoolean(NIL == valid_$36);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$37 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
            pred_var = $const20$inferenceModeParameterValueInSpec;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(query_spec, TWO_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(query_spec, TWO_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$35 = NIL;
                            final SubLObject token_var_$36 = NIL;
                            while (NIL == done_var_$35) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$36);
                                final SubLObject valid_$37 = makeBoolean(!token_var_$36.eql(gaf));
                                if (NIL != valid_$37) {
                                    final SubLObject mt = assertions_high.assertion_mt(gaf);
                                    final SubLObject item_var;
                                    final SubLObject monad = item_var = hlmt.hlmt_monad_mt(mt);
                                    if (NIL == member(item_var, candidates, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        candidates = cons(item_var, candidates);
                                    }
                                }
                                done_var_$35 = makeBoolean(NIL == valid_$37);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$38 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values3 = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values3);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$38, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
            pred_var = $const21$softwareParameterValueInSpecifica;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(query_spec, THREE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(query_spec, THREE_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$36 = NIL;
                            final SubLObject token_var_$37 = NIL;
                            while (NIL == done_var_$36) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$37);
                                final SubLObject valid_$38 = makeBoolean(!token_var_$37.eql(assertion));
                                if (NIL != valid_$38) {
                                    final SubLObject mt = assertions_high.assertion_mt(assertion);
                                    final SubLObject item_var;
                                    final SubLObject monad = item_var = hlmt.hlmt_monad_mt(mt);
                                    if (NIL == member(item_var, candidates, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        candidates = cons(item_var, candidates);
                                    }
                                }
                                done_var_$36 = makeBoolean(NIL == valid_$38);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$39 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values4 = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values4);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$39, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        result = genl_mts.max_floor_mts(candidates, candidates, UNPROVIDED);
        if (NIL != list_utilities.singletonP(result)) {
            return result.first();
        }
        return kbq_default_defining_mt();
    }

    public static SubLObject multiple_choice_testP(final SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) && (NIL != isa.isa_in_any_mtP(v_object, $$MultipleChoiceKBContentTest)));
    }

    public static SubLObject multiple_choice_queryP(final SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) && (NIL != isa.isa_in_any_mtP(v_object, $$MultipleChoiceQuerySpecification)));
    }

    public static SubLObject kbq_multiple_choice_option_specs(final SubLObject query_spec) {
        return kbq_multiple_choice_option_specs_int(query_spec, NIL);
    }

    public static SubLObject kbq_multiple_choice_option_spec(final SubLObject query_spec, final SubLObject n) {
        return kbq_multiple_choice_option_specs_int(query_spec, n).first();
    }

    public static SubLObject kbq_multiple_choice_option_specs_int(final SubLObject query_spec, final SubLObject specified_n) {
        assert NIL != kbq_query_spec_p(query_spec) : "kb_query.kbq_query_spec_p(query_spec) " + "CommonSymbols.NIL != kb_query.kbq_query_spec_p(query_spec) " + query_spec;
        final SubLObject mc_option_spec_dict = dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
        if (NIL != multiple_choice_queryP(query_spec)) {
            final SubLObject pred_var = $$mcQuestionNthOption;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(query_spec, NIL, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(query_spec, NIL, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$49 = NIL;
                            final SubLObject token_var_$50 = NIL;
                            while (NIL == done_var_$49) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$50);
                                final SubLObject valid_$51 = makeBoolean(!token_var_$50.eql(gaf));
                                if (NIL != valid_$51) {
                                    final SubLObject n = assertions_high.gaf_arg2(gaf);
                                    final SubLObject mc_option = assertions_high.gaf_arg3(gaf);
                                    final SubLObject full_label = kb_mapping_utilities.fpred_value(mc_option, $$multipleChoiceOptionFullLabel, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    final SubLObject index_label = kb_mapping_utilities.fpred_value(mc_option, $$multipleChoiceOptionIndexLabel, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    final SubLObject kb_bindings = kb_mapping_utilities.fpred_value(mc_option, $$multipleChoiceOptionPayload, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    if ((NIL == specified_n) || n.equal(specified_n)) {
                                        dictionary.dictionary_enter(mc_option_spec_dict, mc_option, list(n, full_label, index_label, kb_bindings));
                                    }
                                }
                                done_var_$49 = makeBoolean(NIL == valid_$51);
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
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        }
        return Sort.sort(dictionary.dictionary_values(mc_option_spec_dict), symbol_function($sym70$SAFE__), symbol_function(FIRST));
    }

    public static SubLObject kbq_assert_query_spec_inference_parameters(final SubLObject query_spec, final SubLObject query_properties, final SubLObject defining_mt) {
        SubLObject remainder;
        SubLObject query_property;
        SubLObject value;
        for (remainder = NIL, remainder = query_properties; NIL != remainder; remainder = cddr(remainder)) {
            query_property = remainder.first();
            value = cadr(remainder);
            kbq_assert_query_spec_inference_parameter_value(query_spec, query_property, value, defining_mt);
        }
        return query_spec;
    }

    public static SubLObject kb_inference_params_to_query_properties(final SubLObject inf_tuples) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = inf_tuples;
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject parameter = NIL;
            SubLObject kb_value = NIL;
            destructuring_bind_must_consp(current, datum, $list72);
            parameter = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list72);
            kb_value = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject keyword = kbq_keyword_from_inference_parameter(parameter);
                final SubLObject value = kbq_parse_kb_inference_parameter_value(kb_value, keyword);
                result = putf(result, keyword, value);
            } else {
                cdestructuring_bind_error(datum, $list72);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject kbq_parse_kb_inference_parameter_value(final SubLObject value, final SubLObject keyword) {
        if (keyword.eql($MAX_TIME) || keyword.eql($FORWARD_MAX_TIME)) {
            return kbq_convert_time_to_seconds(value);
        }
        if (keyword.eql($NON_EXPLANATORY_SENTENCE)) {
            return czer_main.unquote_quoted_term(parameter_specification_utilities.parse_standard_parameter_value(value), UNPROVIDED);
        }
        if (!keyword.eql($ALLOWED_RULES)) {
            return parameter_specification_utilities.parse_standard_parameter_value(value);
        }
        if (NIL != el_list_p(value)) {
            SubLObject rules = NIL;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(value, $IGNORE);
            SubLObject rule = NIL;
            rule = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != canon_tl.tl_termP(rule)) {
                    rule = canon_tl.tl_term_to_hl(rule);
                } else
                    if (NIL != ist_sentence_p(rule, UNPROVIDED)) {
                        rule = czer_meta.find_assertion_cycl(rule, UNPROVIDED);
                    }

                final SubLObject var = rule;
                if (NIL != var) {
                    rules = cons(var, rules);
                }
                cdolist_list_var = cdolist_list_var.rest();
                rule = cdolist_list_var.first();
            } 
            return nreverse(rules);
        }
        return parameter_specification_utilities.parse_standard_parameter_value(value);
    }

    public static SubLObject kbq_encode_kb_inference_parameter_value(final SubLObject value, final SubLObject keyword) {
        if (keyword.eql($MAX_TIME) || keyword.eql($FORWARD_MAX_TIME)) {
            return value.isInteger() ? kbq_convert_seconds_to_kb_time(value) : $$TheEmptySet;
        }
        if ((((((keyword.eql($RESULT_UNIQUENESS) || keyword.eql($NON_EXPLANATORY_SENTENCE)) || keyword.eql($ALLOWED_RULES)) || keyword.eql($MAX_NUMBER)) || keyword.eql($MAX_PROOF_DEPTH)) || keyword.eql($MAX_TRANSFORMATION_DEPTH)) || keyword.eql($METRICS)) {
            return NIL != value ? value : $$TheEmptySet;
        }
        return parameter_specification_utilities.encode_parameter_value(value);
    }

    public static SubLObject kbq_inference_params(final SubLObject query_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(query_spec, $list47);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            final SubLObject el_substitutions = list_utilities.alist_lookup_without_values(v_bindings, EL_SUBSTITUTIONS, UNPROVIDED, UNPROVIDED);
            final SubLObject question_template = list_utilities.alist_lookup_without_values(v_bindings, QUESTION_TEMPLATE, UNPROVIDED, UNPROVIDED);
            return query_from_template_inference_params(question_template, el_substitutions);
        }
        SubLObject tuples = parameter_specification_utilities.parameter_specification_tuples(query_spec);
        if (NIL != indexed_term_p(query_spec)) {
            final SubLObject tuple = inference_mode_parameter_specification_tuple(query_spec);
            final SubLObject mode = second(tuple);
            if (NIL != mode) {
                tuples = cons(tuple, tuples);
            }
            if (NIL != $kbq_run_query_practice_modeP$.getDynamicValue(thread)) {
                final SubLObject practice_rules = kb_mapping_utilities.pred_values_in_any_mt(query_spec, $$queryPracticeRules, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != practice_rules) {
                    tuples = delete($$InferenceAllowedRulesParameter, tuples, symbol_function(EQL), symbol_function(FIRST), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    tuples = cons(list($$InferenceAllowedRulesParameter, make_el_list(practice_rules, UNPROVIDED)), tuples);
                }
            }
        }
        tuples = delete($$InferenceSentenceParameter, tuples, symbol_function(EQL), symbol_function(FIRST), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        tuples = delete($$InferenceMicrotheoryParameter, tuples, symbol_function(EQL), symbol_function(FIRST), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return tuples;
    }

    public static SubLObject inference_mode_parameter_specification_tuple(final SubLObject query_spec) {
        assert NIL != forts.fort_p(query_spec) : "forts.fort_p(query_spec) " + "CommonSymbols.NIL != forts.fort_p(query_spec) " + query_spec;
        final SubLObject value = kb_mapping_utilities.fpred_value_in_any_mt(query_spec, $const20$inferenceModeParameterValueInSpec, TWO_INTEGER, ONE_INTEGER, $TRUE);
        return make_inference_mode_parameter_tuple(value);
    }

    public static SubLObject make_inference_mode_parameter_tuple(final SubLObject value) {
        return list($$InferenceModeParameter, value);
    }

    public static SubLObject kbq_cyclist(final SubLObject query) {
        if (NIL != constant_p(query)) {
            final SubLObject cyclist = bookkeeping_store.creator(query, UNPROVIDED);
            if (NIL != cyclist) {
                return cyclist;
            }
        }
        if ((NIL != nart_handles.nart_p(query)) && $$TestQueryFn.eql(cycl_utilities.nat_functor(query))) {
            return kbq_cyclist(cycl_utilities.nat_arg1(query, UNPROVIDED));
        }
        if (NIL != indexed_term_p(query)) {
            return kb_accessors.cyclist_with_most_assertions_about(query);
        }
        return NIL;
    }

    public static SubLObject kbq_runnableP(final SubLObject query_spec) {
        return makeBoolean((NIL == kbq_known_unrunnableP(query_spec)) && ($SEVERE != why_not_kbq_valid(query_spec, UNPROVIDED)));
    }

    public static SubLObject kbq_known_unrunnableP(final SubLObject query_spec) {
        return makeBoolean((NIL != forts.fort_p(query_spec)) && (NIL != isa.isa_in_any_mtP(query_spec, $$UnrunnableQuery)));
    }

    public static SubLObject why_not_kbq_valid(final SubLObject query_spec, SubLObject test_spec) {
        if (test_spec == UNPROVIDED) {
            test_spec = NIL;
        }
        if (NIL == test_spec) {
            test_spec = query_spec;
        }
        if (NIL != janus.janus_operation_p(query_spec)) {
            return values(NIL, NIL, NIL);
        }
        if (NIL == el_formula_with_operator_p(query_spec, $$QueryFn)) {
            SubLObject result = NIL;
            SubLObject message = $str92$;
            SubLObject problem_keywords = NIL;
            final SubLObject mts = kbq_mts(query_spec);
            final SubLObject sentences = kbq_sentences(query_spec);
            final SubLObject some_ist_sentenceP = find_if(IST_SENTENCE_WITH_CHLMT_P, sentences, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL == list_utilities.singletonP(sentences)) {
                result = $SEVERE;
                if (length(sentences).numE(ZERO_INTEGER)) {
                    message = cconcatenate(message, format(NIL, $str88$___A_has_no_query_sentence_, test_spec));
                    problem_keywords = cons($NO_QUERY_SENTENCE, problem_keywords);
                } else {
                    message = cconcatenate(message, format(NIL, $str94$___A_has_more_than_one_query_sent, test_spec));
                    problem_keywords = cons($MORE_THAN_ONE_QUERY_SENTENCE, problem_keywords);
                }
            }
            if (NIL == list_utilities.singletonP(mts)) {
                if (length(mts).numE(ZERO_INTEGER)) {
                    if (NIL == some_ist_sentenceP) {
                        result = $SEVERE;
                        message = cconcatenate(message, format(NIL, $str96$___A_has_no_query_Mt_, test_spec));
                        problem_keywords = cons($NO_QUERY_MT, problem_keywords);
                    }
                } else {
                    result = $SEVERE;
                    message = cconcatenate(message, format(NIL, $str98$___A_has_more_than_one_query_Mt_, test_spec));
                    problem_keywords = cons($MORE_THAN_ONE_QUERY_MT, problem_keywords);
                }
            }
            return values(result, message, nreverse(problem_keywords));
        }
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.nat_args(query_spec, UNPROVIDED);
        final SubLObject sentence = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list87);
        current = current.rest();
        final SubLObject parameters = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list87);
        final SubLObject rest;
        current = rest = current.rest();
        if (NIL == sentence) {
            return values($SEVERE, format(NIL, $str88$___A_has_no_query_sentence_, test_spec), list($NO_QUERY_SENTENCE));
        }
        if (NIL != rest) {
            return values($SEVERE, format(NIL, $str90$___A_has_too_many_arguments_, test_spec), list($TOO_MANY_ARGUMENTS));
        }
        return values(NIL, NIL, NIL);
    }

    public static SubLObject kbq_removal_only_queryP(final SubLObject query) {
        return makeBoolean(ZERO_INTEGER.eql(kbq_query_property_value_from_keyword(query, $MAX_TRANSFORMATION_DEPTH)) || (NIL == kbq_query_property_value_from_keyword(query, $kw100$TRANSFORMATION_ALLOWED_)));
    }

    public static SubLObject kbq_transformation_queryP(final SubLObject query) {
        return makeBoolean((NIL != kbq_query_property_value_from_keyword(query, $kw100$TRANSFORMATION_ALLOWED_)) && (NIL == kbq_removal_only_queryP(query)));
    }

    public static SubLObject kbq_trivial_queryP(final SubLObject query) {
        return makeBoolean((((((NIL != kbq_removal_only_queryP(query)) && (NIL != kbq_query_run.kbq_single_literal_query_p(query))) && $BINDINGS.eql(kbq_query_property_value_from_keyword(query, $RESULT_UNIQUENESS))) && (NIL == kbq_query_property_value_from_keyword(query, $MAX_NUMBER))) && (NIL == kbq_query_property_value_from_keyword(query, $MAX_TIME))) && (NIL == kbq_query_property_value_from_keyword(query, $MAX_PROOF_DEPTH)));
    }

    public static SubLObject kbq_simple_queryP(final SubLObject query) {
        return makeBoolean((NIL != kbq_removal_only_queryP(query)) && (NIL == kbq_trivial_queryP(query)));
    }

    public static SubLObject kbq_shallow_queryP(final SubLObject query) {
        return makeBoolean((NIL != kbq_transformation_queryP(query)) && ONE_INTEGER.eql(kbq_query_property_value_from_keyword(query, $MAX_TRANSFORMATION_DEPTH)));
    }

    public static SubLObject kbq_deep_queryP(final SubLObject query) {
        return makeBoolean((NIL != kbq_transformation_queryP(query)) && (NIL == kbq_shallow_queryP(query)));
    }

    public static SubLObject kbq_conditional_queryP(final SubLObject query) {
        final SubLObject query_properties = kbq_query_properties(query);
        return list_utilities.sublisp_boolean(inference_strategist.query_property_value(query_properties, $kw102$CONDITIONAL_SENTENCE_));
    }

    public static SubLObject new_continuable_inference_from_kbq(final SubLObject query_spec, SubLObject overriding_query_properties, SubLObject substitutions) {
        if (overriding_query_properties == UNPROVIDED) {
            overriding_query_properties = NIL;
        }
        if (substitutions == UNPROVIDED) {
            substitutions = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject plist_var = overriding_query_properties;
        assert NIL != list_utilities.property_list_p(plist_var) : "list_utilities.property_list_p(plist_var) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist_var) " + plist_var;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != inference_datastructures_enumerated_types.query_property_p(property) : "inference_datastructures_enumerated_types.query_property_p(property) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.query_property_p(property) " + property;
        }
        thread.resetMultipleValues();
        final SubLObject sentence = kbq_query_arguments(query_spec, substitutions);
        final SubLObject mt = thread.secondMultipleValue();
        SubLObject query_properties = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        query_properties = inference_datastructures_enumerated_types.merge_query_properties(query_properties, overriding_query_properties);
        final SubLObject query_static_properties = inference_datastructures_enumerated_types.extract_query_static_or_meta_properties(query_properties);
        return inference_kernel.new_continuable_inference(sentence, mt, query_static_properties);
    }

    public static SubLObject new_removal_ask_from_kbq(final SubLObject query_spec, final SubLObject metrics_template, SubLObject overriding_query_properties) {
        if (overriding_query_properties == UNPROVIDED) {
            overriding_query_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject plist_var = overriding_query_properties;
        assert NIL != list_utilities.property_list_p(plist_var) : "list_utilities.property_list_p(plist_var) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist_var) " + plist_var;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != inference_datastructures_enumerated_types.query_property_p(property) : "inference_datastructures_enumerated_types.query_property_p(property) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.query_property_p(property) " + property;
        }
        SubLObject result = NIL;
        SubLObject metrics = NIL;
        thread.resetMultipleValues();
        final SubLObject sentence = kbq_query_arguments(query_spec, UNPROVIDED);
        final SubLObject mt = thread.secondMultipleValue();
        SubLObject query_properties = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        query_properties = inference_datastructures_enumerated_types.merge_query_properties(query_properties, overriding_query_properties);
        query_properties = list_utilities.filter_plist(query_properties, symbol_function(REMOVAL_ASK_QUERY_PROPERTY_P));
        SubLObject complete_total_time = NIL;
        SubLObject total_time = NIL;
        SubLObject sentence_clauses = NIL;
        SubLObject v_bindings = NIL;
        SubLObject free_vars = NIL;
        final SubLObject time_var = get_internal_real_time();
        thread.resetMultipleValues();
        final SubLObject sentence_clauses_$52 = inference_czer.inference_canonicalize_ask_int(sentence, mt, inference_datastructures_enumerated_types.$default_inference_disjunction_free_el_vars_policy$.getGlobalValue());
        final SubLObject v_bindings_$53 = thread.secondMultipleValue();
        final SubLObject free_vars_$54 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        sentence_clauses = sentence_clauses_$52;
        v_bindings = v_bindings_$53;
        free_vars = free_vars_$54;
        SubLObject current;
        final SubLObject datum = current = clauses.pos_lits(sentence_clauses.first()).first();
        SubLObject hl_mt = NIL;
        SubLObject hl_sentence = NIL;
        destructuring_bind_must_consp(current, datum, $list105);
        hl_mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list105);
        hl_sentence = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject time_var_$55 = get_internal_real_time();
            result = backward.removal_ask(hl_sentence, hl_mt, $TRUE, query_properties);
            total_time = divide(subtract(get_internal_real_time(), time_var_$55), time_high.$internal_time_units_per_second$.getGlobalValue());
        } else {
            cdestructuring_bind_error(datum, $list105);
        }
        complete_total_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        metrics = removal_ask_compute_metrics(metrics_template, result, complete_total_time, total_time);
        return values(result, metrics);
    }

    public static SubLObject removal_ask_compute_metrics(final SubLObject template, final SubLObject result, final SubLObject complete_total_time, final SubLObject total_time) {
        SubLObject v_answer = copy_tree(template);
        SubLObject cdolist_list_var;
        final SubLObject metrics = cdolist_list_var = list_utilities.tree_gather(template, symbol_function(REMOVAL_ASK_QUERY_METRIC_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject metric = NIL;
        metric = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pcase_var = metric;
            if (pcase_var.eql($ANSWER_COUNT)) {
                final SubLObject answer_count = length(result);
                v_answer = nsubst(answer_count, $ANSWER_COUNT, v_answer, symbol_function(EQ), UNPROVIDED);
            } else
                if (pcase_var.eql($TIME_TO_FIRST_ANSWER)) {
                    final SubLObject first_answer_time = (NIL != result) ? total_time : NIL;
                    v_answer = nsubst(first_answer_time, $TIME_TO_FIRST_ANSWER, v_answer, symbol_function(EQ), UNPROVIDED);
                } else
                    if (pcase_var.eql($TIME_TO_LAST_ANSWER)) {
                        final SubLObject last_answer_time = (NIL != result) ? total_time : NIL;
                        v_answer = nsubst(last_answer_time, $TIME_TO_LAST_ANSWER, v_answer, symbol_function(EQ), UNPROVIDED);
                    } else
                        if (pcase_var.eql($TOTAL_TIME)) {
                            v_answer = nsubst(total_time, $TOTAL_TIME, v_answer, symbol_function(EQ), UNPROVIDED);
                        } else
                            if (pcase_var.eql($COMPLETE_TOTAL_TIME)) {
                                v_answer = nsubst(complete_total_time, $COMPLETE_TOTAL_TIME, v_answer, symbol_function(EQ), UNPROVIDED);
                            } else
                                if (pcase_var.eql($TIME_PER_ANSWER)) {
                                    final SubLObject answer_count = length(result);
                                    SubLObject time_per_answer = NIL;
                                    if (total_time.isNumber() && (NIL != subl_promotions.positive_integer_p(answer_count))) {
                                        time_per_answer = divide(total_time, answer_count);
                                    }
                                    v_answer = nsubst(time_per_answer, $TIME_PER_ANSWER, v_answer, symbol_function(EQ), UNPROVIDED);
                                } else
                                    if (pcase_var.eql($LATENCY_IMPROVEMENT_FROM_ITERATIVITY)) {
                                        final SubLObject latency_improvement_from_iterativity = list_utilities.safe_difference(total_time, total_time);
                                        v_answer = nsubst(latency_improvement_from_iterativity, $LATENCY_IMPROVEMENT_FROM_ITERATIVITY, v_answer, symbol_function(EQ), UNPROVIDED);
                                    } else {
                                        Errors.sublisp_break($str114$time_to_implement_metric__S, new SubLObject[]{ metric });
                                    }






            cdolist_list_var = cdolist_list_var.rest();
            metric = cdolist_list_var.first();
        } 
        return v_answer;
    }

    public static SubLObject continue_inference_from_kbq(final SubLObject inference, final SubLObject query_spec, SubLObject overriding_query_properties) {
        if (overriding_query_properties == UNPROVIDED) {
            overriding_query_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject plist_var = overriding_query_properties;
        assert NIL != list_utilities.property_list_p(plist_var) : "list_utilities.property_list_p(plist_var) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist_var) " + plist_var;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != inference_datastructures_enumerated_types.query_property_p(property) : "inference_datastructures_enumerated_types.query_property_p(property) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.query_property_p(property) " + property;
        }
        thread.resetMultipleValues();
        final SubLObject sentence = kbq_query_arguments(query_spec, UNPROVIDED);
        final SubLObject mt = thread.secondMultipleValue();
        SubLObject query_properties = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        query_properties = inference_datastructures_enumerated_types.merge_query_properties(query_properties, overriding_query_properties);
        final SubLObject query_dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(query_properties);
        return inference_kernel.continue_inference(inference, query_dynamic_properties);
    }

    public static SubLObject new_cyc_query_from_kbq(final SubLObject query_spec, SubLObject overriding_query_properties, SubLObject substitutions) {
        if (overriding_query_properties == UNPROVIDED) {
            overriding_query_properties = NIL;
        }
        if (substitutions == UNPROVIDED) {
            substitutions = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject plist_var = overriding_query_properties;
        assert NIL != list_utilities.property_list_p(plist_var) : "list_utilities.property_list_p(plist_var) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist_var) " + plist_var;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != inference_datastructures_enumerated_types.query_property_p(property) : "inference_datastructures_enumerated_types.query_property_p(property) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.query_property_p(property) " + property;
        }
        SubLObject result = NIL;
        SubLObject halt_reason = NIL;
        SubLObject inference = NIL;
        SubLObject metric_values = NIL;
        final SubLObject _prev_bind_0 = $save_asked_queriesP$.currentBinding(thread);
        try {
            $save_asked_queriesP$.bind(NIL, thread);
            if (NIL != janus.janus_modification_operation_p(query_spec)) {
                thread.resetMultipleValues();
                final SubLObject result_$56 = janus.execute_janus_modification_operation(query_spec);
                final SubLObject halt_reason_$57 = thread.secondMultipleValue();
                final SubLObject inference_$58 = thread.thirdMultipleValue();
                final SubLObject metric_values_$59 = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                result = result_$56;
                halt_reason = halt_reason_$57;
                inference = inference_$58;
                metric_values = metric_values_$59;
            } else {
                thread.resetMultipleValues();
                final SubLObject sentence = kbq_query_arguments(query_spec, substitutions);
                final SubLObject mt = thread.secondMultipleValue();
                SubLObject query_properties = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                query_properties = inference_datastructures_enumerated_types.merge_query_properties(query_properties, overriding_query_properties);
                thread.resetMultipleValues();
                final SubLObject result_$57 = inference_kernel.new_cyc_query(sentence, mt, query_properties);
                final SubLObject halt_reason_$58 = thread.secondMultipleValue();
                final SubLObject inference_$59 = thread.thirdMultipleValue();
                final SubLObject metric_values_$60 = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                result = result_$57;
                halt_reason = halt_reason_$58;
                inference = inference_$59;
                metric_values = metric_values_$60;
            }
        } finally {
            $save_asked_queriesP$.rebind(_prev_bind_0, thread);
        }
        return values(result, halt_reason, inference, metric_values);
    }

    public static SubLObject ask_multiple_choice_query_from_kbq(final SubLObject query_spec, SubLObject overriding_query_properties) {
        if (overriding_query_properties == UNPROVIDED) {
            overriding_query_properties = NIL;
        }
        return new_cyc_query_from_kbq(query_spec, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cache_kbq_extent(final SubLObject query_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject sentence = kbq_query_arguments(query_spec, UNPROVIDED);
        SubLObject mt = thread.secondMultipleValue();
        SubLObject query_properties = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL == mt) {
            mt = mt_relevance_macros.inference_relevant_mt();
        }
        query_properties = putf(query_properties, $kw115$CACHE_INFERENCE_RESULTS_, T);
        return inference_kernel.new_cyc_query(sentence, mt, query_properties);
    }

    public static SubLObject kbq_query_arguments(final SubLObject query_spec, SubLObject substitutions) {
        if (substitutions == UNPROVIDED) {
            substitutions = NIL;
        }
        if (NIL != el_formula_with_operator_p(query_spec, $$QueryFn)) {
            return query_fn_term_to_new_cyc_query_arguments(query_spec);
        }
        if (NIL != formula_pattern_match.formula_matches_pattern(query_spec, $list116)) {
            return predicate_query_fn_term_to_new_cyc_query_arguments(query_spec);
        }
        if (NIL == janus.janus_query_operation_p(query_spec)) {
            final SubLObject sentence = kbq_sentence(query_spec);
            final SubLObject mt = kbq_mt(query_spec);
            final SubLObject query_properties = kbq_query_properties(query_spec);
            return kbq_possibly_apply_substitutions(substitutions, sentence, mt, query_properties);
        }
        SubLObject current;
        final SubLObject datum = current = encapsulation.unencapsulate(query_spec);
        SubLObject janus_op = NIL;
        SubLObject type = NIL;
        SubLObject sentence2 = NIL;
        SubLObject mt2 = NIL;
        SubLObject query_properties2 = NIL;
        SubLObject expected_result = NIL;
        SubLObject expected_halt_reason = NIL;
        SubLObject tag = NIL;
        destructuring_bind_must_consp(current, datum, $list117);
        janus_op = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list117);
        type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list117);
        sentence2 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list117);
        mt2 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list117);
        query_properties2 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list117);
        expected_result = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list117);
        expected_halt_reason = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list117);
        tag = current.first();
        current = current.rest();
        if (NIL == current) {
            query_properties2 = janus.dwim_janus_query_properties(query_properties2);
            return values(sentence2, mt2, query_properties2);
        }
        cdestructuring_bind_error(datum, $list117);
        return NIL;
    }

    public static SubLObject kbq_possibly_apply_substitutions(final SubLObject substitutions, SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (NIL != substitutions) {
            sentence = cycl_utilities.expression_sublis(substitutions, sentence, symbol_function(EQUAL), UNPROVIDED);
            mt = cycl_utilities.expression_sublis(substitutions, mt, symbol_function(EQUAL), UNPROVIDED);
            query_properties = sublis(substitutions, query_properties, symbol_function(EQUAL), UNPROVIDED);
        }
        return values(sentence, mt, query_properties);
    }

    public static SubLObject query_fn_term_to_new_cyc_query_arguments(final SubLObject query_fn_term) {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.nat_args(query_fn_term, UNPROVIDED);
        final SubLObject quoted_sentence = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list118);
        current = current.rest();
        final SubLObject cycl_parameters = (current.isCons()) ? current.first() : $$TheEmptySet;
        destructuring_bind_must_listp(current, datum, $list118);
        current = current.rest();
        if (NIL == current) {
            final SubLObject sentence = czer_main.unquote_quoted_term(quoted_sentence, UNPROVIDED);
            SubLObject tuples = Mapping.mapcar(symbol_function(EL_LIST_ITEMS), extensional_set_elements(cycl_parameters));
            final SubLObject mt = second(assoc($$InferenceMicrotheoryParameter, tuples, UNPROVIDED, UNPROVIDED));
            tuples = list_utilities.alist_delete(tuples, $$InferenceSentenceParameter, UNPROVIDED);
            tuples = list_utilities.alist_delete(tuples, $$InferenceMicrotheoryParameter, UNPROVIDED);
            final SubLObject query_properties = kb_inference_params_to_query_properties(tuples);
            return values(sentence, mt, query_properties);
        }
        cdestructuring_bind_error(datum, $list118);
        return NIL;
    }

    public static SubLObject predicate_query_fn_term_to_new_cyc_query_arguments(final SubLObject predicate_query_fn_term) {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.nat_args(predicate_query_fn_term, UNPROVIDED);
        SubLObject kappa_predicate = NIL;
        destructuring_bind_must_consp(current, datum, $list120);
        kappa_predicate = current.first();
        current = current.rest();
        final SubLObject cycl_parameters = (current.isCons()) ? current.first() : $$TheEmptySet;
        destructuring_bind_must_listp(current, datum, $list120);
        current = current.rest();
        if (NIL == current) {
            final SubLObject query_free_variables = cycl_utilities.nat_arg1(kappa_predicate, UNPROVIDED);
            final SubLObject sentence = cycl_utilities.nat_arg2(kappa_predicate, UNPROVIDED);
            SubLObject tuples = Mapping.mapcar(symbol_function(EL_LIST_ITEMS), extensional_set_elements(cycl_parameters));
            final SubLObject mt = second(assoc($$InferenceMicrotheoryParameter, tuples, UNPROVIDED, UNPROVIDED));
            tuples = list_utilities.alist_delete(tuples, $$InferenceSentenceParameter, UNPROVIDED);
            tuples = list_utilities.alist_delete(tuples, $$InferenceMicrotheoryParameter, UNPROVIDED);
            final SubLObject query_properties = kb_inference_params_to_query_properties(tuples);
            return values(sentence, mt, query_properties);
        }
        cdestructuring_bind_error(datum, $list120);
        return NIL;
    }

    public static SubLObject kbq_inference_parameter_from_keyword(final SubLObject keyword) {
        assert NIL != keywordp(keyword) : "Types.keywordp(keyword) " + "CommonSymbols.NIL != Types.keywordp(keyword) " + keyword;
        return parameter_specification_utilities.parameter_from_keyword(keyword, $$InferenceParameter);
    }

    public static SubLObject kbq_keyword_from_inference_parameter(final SubLObject parameter) {
        assert NIL != forts.fort_p(parameter) : "forts.fort_p(parameter) " + "CommonSymbols.NIL != forts.fort_p(parameter) " + parameter;
        return parameter_specification_utilities.keyword_from_parameter(parameter);
    }

    public static SubLObject kbq_hl_support_module_from_keyword(final SubLObject keyword) {
        assert NIL != keywordp(keyword) : "Types.keywordp(keyword) " + "CommonSymbols.NIL != Types.keywordp(keyword) " + keyword;
        return subl_identifier.cyc_entity_from_sublid(keyword, $$CycHLSupportModule);
    }

    public static SubLObject kbq_keyword_from_hl_support_module(final SubLObject module) {
        assert NIL != constant_p(module) : "constant_handles.constant_p(module) " + "CommonSymbols.NIL != constant_handles.constant_p(module) " + module;
        return subl_identifier.sublid_from_cyc_entity(module);
    }

    public static SubLObject kbq_kb_tv_from_hl_tv(final SubLObject identifier) {
        assert NIL != keywordp(identifier) : "Types.keywordp(identifier) " + "CommonSymbols.NIL != Types.keywordp(identifier) " + identifier;
        return subl_identifier.cyc_entity_from_sublid(identifier, $$CycHLTruthValue);
    }

    public static SubLObject kbq_hl_tv_from_kb_tv(final SubLObject fort) {
        assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
        return subl_identifier.sublid_from_cyc_entity(fort);
    }

    public static SubLObject kbq_convert_time_to_seconds(final SubLObject value) {
        if (value.isInteger()) {
            return value;
        }
        if (NIL == possibly_naut_p(value)) {
            return NIL;
        }
        final SubLObject unit = cycl_utilities.nat_arg0(value);
        final SubLObject quantity = cycl_utilities.nat_arg1(value, UNPROVIDED);
        SubLObject seconds = NIL;
        if (unit.eql($$SecondsDuration)) {
            return quantity;
        }
        if (NIL != quantities.comparable_units($$SecondsDuration, unit)) {
            seconds = quantities.convert_to_units($$SecondsDuration, unit, quantity, UNPROVIDED);
        }
        if (NIL == seconds) {
            Errors.error($str127$Unit__A_can_t_be_converted_to_sec, unit);
        }
        return seconds;
    }

    public static SubLObject kbq_convert_seconds_to_kb_time(final SubLObject integer) {
        assert NIL != integerp(integer) : "Types.integerp(integer) " + "CommonSymbols.NIL != Types.integerp(integer) " + integer;
        return make_formula($$SecondsDuration, list(integer), UNPROVIDED);
    }

    public static SubLObject declare_kb_query_file() {
        declareFunction(me, "kbq_query_spec_p", "KBQ-QUERY-SPEC-P", 1, 0, false);
        declareFunction(me, "kbq_assert_query_spec_definition", "KBQ-ASSERT-QUERY-SPEC-DEFINITION", 7, 0, false);
        declareFunction(me, "kbq_assert", "KBQ-ASSERT", 2, 1, false);
        declareFunction(me, "update_kbq_definition", "UPDATE-KBQ-DEFINITION", 3, 4, false);
        declareFunction(me, "update_kbq_definition_silent", "UPDATE-KBQ-DEFINITION-SILENT", 3, 4, false);
        declareFunction(me, "kbq_ensure_query_spec_definition", "KBQ-ENSURE-QUERY-SPEC-DEFINITION", 7, 0, false);
        declareFunction(me, "kbq_current_query_spec_assertions_for_parameter", "KBQ-CURRENT-QUERY-SPEC-ASSERTIONS-FOR-PARAMETER", 2, 0, false);
        declareFunction(me, "kbq_ensure_query_spec_sentence", "KBQ-ENSURE-QUERY-SPEC-SENTENCE", 3, 0, false);
        declareFunction(me, "kbq_assert_query_spec_sentence", "KBQ-ASSERT-QUERY-SPEC-SENTENCE", 3, 0, false);
        declareFunction(me, "kbq_assertible_query_spec_sentence", "KBQ-ASSERTIBLE-QUERY-SPEC-SENTENCE", 2, 0, false);
        declareFunction(me, "kbq_askable_query_spec_sentence", "KBQ-ASKABLE-QUERY-SPEC-SENTENCE", 2, 1, false);
        declareFunction(me, "kbq_ensure_query_spec_mt", "KBQ-ENSURE-QUERY-SPEC-MT", 3, 0, false);
        declareFunction(me, "kbq_assert_query_spec_mt", "KBQ-ASSERT-QUERY-SPEC-MT", 3, 0, false);
        declareFunction(me, "kbq_ensure_query_spec_inference_parameter_value", "KBQ-ENSURE-QUERY-SPEC-INFERENCE-PARAMETER-VALUE", 4, 0, false);
        declareFunction(me, "kbq_assert_query_spec_inference_parameter_value", "KBQ-ASSERT-QUERY-SPEC-INFERENCE-PARAMETER-VALUE", 4, 0, false);
        declareFunction(me, "kbq_assert_query_spec_inference_parameter_value_int", "KBQ-ASSERT-QUERY-SPEC-INFERENCE-PARAMETER-VALUE-INT", 4, 0, false);
        declareFunction(me, "kbq_ensure_query_spec_pragmatics", "KBQ-ENSURE-QUERY-SPEC-PRAGMATICS", 3, 0, false);
        declareFunction(me, "kbq_assert_query_spec_pragmatics", "KBQ-ASSERT-QUERY-SPEC-PRAGMATICS", 3, 0, false);
        declareFunction(me, "kbq_ensure_multiple_choice_option_spec", "KBQ-ENSURE-MULTIPLE-CHOICE-OPTION-SPEC", 3, 0, false);
        declareFunction(me, "kbq_assert_multiple_choice_option_spec", "KBQ-ASSERT-MULTIPLE-CHOICE-OPTION-SPEC", 3, 0, false);
        declareFunction(me, "kbq_ensure_query_spec_comments", "KBQ-ENSURE-QUERY-SPEC-COMMENTS", 3, 0, false);
        declareFunction(me, "kbq_assert_query_spec_comment", "KBQ-ASSERT-QUERY-SPEC-COMMENT", 3, 0, false);
        declareFunction(me, "kbq_assert_template_definition", "KBQ-ASSERT-TEMPLATE-DEFINITION", 5, 0, false);
        declareFunction(me, "kbq_ensure_template_definition", "KBQ-ENSURE-TEMPLATE-DEFINITION", 5, 0, false);
        declareFunction(me, "kbq_ensure_template_glosses", "KBQ-ENSURE-TEMPLATE-GLOSSES", 3, 0, false);
        declareFunction(me, "kbq_assert_template_gloss", "KBQ-ASSERT-TEMPLATE-GLOSS", 3, 0, false);
        declareFunction(me, "kbq_ensure_template_folders", "KBQ-ENSURE-TEMPLATE-FOLDERS", 2, 0, false);
        declareFunction(me, "kbq_assert_template_folder", "KBQ-ASSERT-TEMPLATE-FOLDER", 3, 0, false);
        declareFunction(me, "kbq_sentences", "KBQ-SENTENCES", 1, 0, false);
        declareFunction(me, "kbq_sentence", "KBQ-SENTENCE", 1, 0, false);
        declareFunction(me, "query_from_template_sentences", "QUERY-FROM-TEMPLATE-SENTENCES", 2, 0, false);
        declareFunction(me, "perform_query_from_template_substitutions", "PERFORM-QUERY-FROM-TEMPLATE-SUBSTITUTIONS", 2, 0, false);
        declareFunction(me, "query_from_template_mts", "QUERY-FROM-TEMPLATE-MTS", 2, 0, false);
        declareFunction(me, "query_from_template_inference_params", "QUERY-FROM-TEMPLATE-INFERENCE-PARAMS", 2, 0, false);
        declareFunction(me, "kbq_sentence_closedP", "KBQ-SENTENCE-CLOSED?", 1, 0, false);
        declareFunction(me, "kbq_sentence_openP", "KBQ-SENTENCE-OPEN?", 1, 0, false);
        declareFunction(me, "kbq_pragmatics", "KBQ-PRAGMATICS", 1, 0, false);
        declareFunction(me, "kbq_mts", "KBQ-MTS", 1, 0, false);
        declareFunction(me, "kbq_mt", "KBQ-MT", 1, 0, false);
        declareFunction(me, "kbq_canonical_mt", "KBQ-CANONICAL-MT", 1, 0, false);
        declareFunction(me, "kbq_comments", "KBQ-COMMENTS", 1, 0, false);
        declareFunction(me, "kbq_template_glosses", "KBQ-TEMPLATE-GLOSSES", 1, 0, false);
        declareFunction(me, "kbq_template", "KBQ-TEMPLATE", 1, 0, false);
        declareFunction(me, "template_folders", "TEMPLATE-FOLDERS", 1, 0, false);
        declareFunction(me, "kbq_query_properties", "KBQ-QUERY-PROPERTIES", 1, 0, false);
        declareFunction(me, "use_kbq_practice_rulesP", "USE-KBQ-PRACTICE-RULES?", 0, 0, false);
        declareFunction(me, "overriding_query_practice_rules_properties", "OVERRIDING-QUERY-PRACTICE-RULES-PROPERTIES", 1, 0, false);
        declareFunction(me, "kbq_query_property_value_from_keyword", "KBQ-QUERY-PROPERTY-VALUE-FROM-KEYWORD", 2, 0, false);
        declareFunction(me, "kbq_allowed_rules", "KBQ-ALLOWED-RULES", 1, 0, false);
        declareFunction(me, "kbq_default_defining_mt", "KBQ-DEFAULT-DEFINING-MT", 0, 0, false);
        declareFunction(me, "kbq_defining_mt", "KBQ-DEFINING-MT", 1, 0, false);
        declareFunction(me, "multiple_choice_testP", "MULTIPLE-CHOICE-TEST?", 1, 0, false);
        declareFunction(me, "multiple_choice_queryP", "MULTIPLE-CHOICE-QUERY?", 1, 0, false);
        declareFunction(me, "kbq_multiple_choice_option_specs", "KBQ-MULTIPLE-CHOICE-OPTION-SPECS", 1, 0, false);
        declareFunction(me, "kbq_multiple_choice_option_spec", "KBQ-MULTIPLE-CHOICE-OPTION-SPEC", 2, 0, false);
        declareFunction(me, "kbq_multiple_choice_option_specs_int", "KBQ-MULTIPLE-CHOICE-OPTION-SPECS-INT", 2, 0, false);
        declareFunction(me, "kbq_assert_query_spec_inference_parameters", "KBQ-ASSERT-QUERY-SPEC-INFERENCE-PARAMETERS", 3, 0, false);
        declareFunction(me, "kb_inference_params_to_query_properties", "KB-INFERENCE-PARAMS-TO-QUERY-PROPERTIES", 1, 0, false);
        declareFunction(me, "kbq_parse_kb_inference_parameter_value", "KBQ-PARSE-KB-INFERENCE-PARAMETER-VALUE", 2, 0, false);
        declareFunction(me, "kbq_encode_kb_inference_parameter_value", "KBQ-ENCODE-KB-INFERENCE-PARAMETER-VALUE", 2, 0, false);
        declareFunction(me, "kbq_inference_params", "KBQ-INFERENCE-PARAMS", 1, 0, false);
        declareFunction(me, "inference_mode_parameter_specification_tuple", "INFERENCE-MODE-PARAMETER-SPECIFICATION-TUPLE", 1, 0, false);
        declareFunction(me, "make_inference_mode_parameter_tuple", "MAKE-INFERENCE-MODE-PARAMETER-TUPLE", 1, 0, false);
        declareFunction(me, "kbq_cyclist", "KBQ-CYCLIST", 1, 0, false);
        declareFunction(me, "kbq_runnableP", "KBQ-RUNNABLE?", 1, 0, false);
        declareFunction(me, "kbq_known_unrunnableP", "KBQ-KNOWN-UNRUNNABLE?", 1, 0, false);
        declareFunction(me, "why_not_kbq_valid", "WHY-NOT-KBQ-VALID", 1, 1, false);
        declareFunction(me, "kbq_removal_only_queryP", "KBQ-REMOVAL-ONLY-QUERY?", 1, 0, false);
        declareFunction(me, "kbq_transformation_queryP", "KBQ-TRANSFORMATION-QUERY?", 1, 0, false);
        declareFunction(me, "kbq_trivial_queryP", "KBQ-TRIVIAL-QUERY?", 1, 0, false);
        declareFunction(me, "kbq_simple_queryP", "KBQ-SIMPLE-QUERY?", 1, 0, false);
        declareFunction(me, "kbq_shallow_queryP", "KBQ-SHALLOW-QUERY?", 1, 0, false);
        declareFunction(me, "kbq_deep_queryP", "KBQ-DEEP-QUERY?", 1, 0, false);
        declareFunction(me, "kbq_conditional_queryP", "KBQ-CONDITIONAL-QUERY?", 1, 0, false);
        declareFunction(me, "new_continuable_inference_from_kbq", "NEW-CONTINUABLE-INFERENCE-FROM-KBQ", 1, 2, false);
        declareFunction(me, "new_removal_ask_from_kbq", "NEW-REMOVAL-ASK-FROM-KBQ", 2, 1, false);
        declareFunction(me, "removal_ask_compute_metrics", "REMOVAL-ASK-COMPUTE-METRICS", 4, 0, false);
        declareFunction(me, "continue_inference_from_kbq", "CONTINUE-INFERENCE-FROM-KBQ", 2, 1, false);
        declareFunction(me, "new_cyc_query_from_kbq", "NEW-CYC-QUERY-FROM-KBQ", 1, 2, false);
        declareFunction(me, "ask_multiple_choice_query_from_kbq", "ASK-MULTIPLE-CHOICE-QUERY-FROM-KBQ", 1, 1, false);
        declareFunction(me, "cache_kbq_extent", "CACHE-KBQ-EXTENT", 1, 0, false);
        declareFunction(me, "kbq_query_arguments", "KBQ-QUERY-ARGUMENTS", 1, 1, false);
        declareFunction(me, "kbq_possibly_apply_substitutions", "KBQ-POSSIBLY-APPLY-SUBSTITUTIONS", 4, 0, false);
        declareFunction(me, "query_fn_term_to_new_cyc_query_arguments", "QUERY-FN-TERM-TO-NEW-CYC-QUERY-ARGUMENTS", 1, 0, false);
        declareFunction(me, "predicate_query_fn_term_to_new_cyc_query_arguments", "PREDICATE-QUERY-FN-TERM-TO-NEW-CYC-QUERY-ARGUMENTS", 1, 0, false);
        declareFunction(me, "kbq_inference_parameter_from_keyword", "KBQ-INFERENCE-PARAMETER-FROM-KEYWORD", 1, 0, false);
        declareFunction(me, "kbq_keyword_from_inference_parameter", "KBQ-KEYWORD-FROM-INFERENCE-PARAMETER", 1, 0, false);
        declareFunction(me, "kbq_hl_support_module_from_keyword", "KBQ-HL-SUPPORT-MODULE-FROM-KEYWORD", 1, 0, false);
        declareFunction(me, "kbq_keyword_from_hl_support_module", "KBQ-KEYWORD-FROM-HL-SUPPORT-MODULE", 1, 0, false);
        declareFunction(me, "kbq_kb_tv_from_hl_tv", "KBQ-KB-TV-FROM-HL-TV", 1, 0, false);
        declareFunction(me, "kbq_hl_tv_from_kb_tv", "KBQ-HL-TV-FROM-KB-TV", 1, 0, false);
        declareFunction(me, "kbq_convert_time_to_seconds", "KBQ-CONVERT-TIME-TO-SECONDS", 1, 0, false);
        declareFunction(me, "kbq_convert_seconds_to_kb_time", "KBQ-CONVERT-SECONDS-TO-KB-TIME", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_kb_query_file() {
        defparameter("*TRANSCRIPT-KBQ-DEFINITION-ASSERTIONS?*", T);
        defparameter("*USE-KBQ-PRACTICE-RULES?*", NIL);
        return NIL;
    }

    public static SubLObject setup_kb_query_file() {
        register_external_symbol(UPDATE_KBQ_DEFINITION);
        register_external_symbol(UPDATE_KBQ_DEFINITION_SILENT);
        register_external_symbol(KBQ_QUERY_PROPERTIES);
        define_test_case_table_int(KBQ_PARSE_KB_INFERENCE_PARAMETER_VALUE, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list135);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_kb_query_file();
    }

    @Override
    public void initializeVariables() {
        init_kb_query_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_kb_query_file();
    }

    
}

/**
 * Total time: 871 ms synthetic
 */
